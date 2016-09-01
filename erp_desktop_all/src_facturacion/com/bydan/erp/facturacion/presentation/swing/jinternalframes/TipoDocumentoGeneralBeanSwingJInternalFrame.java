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

import com.bydan.erp.facturacion.util.TipoDocumentoGeneralConstantesFunciones;
import com.bydan.erp.facturacion.util.TipoDocumentoGeneralParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.TipoDocumentoGeneralParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.TipoDocumentoGeneralBean;
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
public class TipoDocumentoGeneralBeanSwingJInternalFrame extends TipoDocumentoGeneralJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoDocumentoGeneralBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoDocumentoGeneral> tipodocumentogeneralValidator = new ClassValidator<TipoDocumentoGeneral>(TipoDocumentoGeneral.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoDocumentoGeneral tipodocumentogeneral;	
	public TipoDocumentoGeneral tipodocumentogeneralAux;
	public TipoDocumentoGeneral tipodocumentogeneralAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoDocumentoGeneral tipodocumentogeneralTotales;
	public Long idTipoDocumentoGeneralActual;
	public Long iIdNuevoTipoDocumentoGeneral=0L;
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
	
	public Boolean isPermisoTodoTipoDocumentoGeneral;
	public Boolean isPermisoNuevoTipoDocumentoGeneral;
	public Boolean isPermisoActualizarTipoDocumentoGeneral;
	public Boolean isPermisoActualizarOriginalTipoDocumentoGeneral;
	public Boolean isPermisoEliminarTipoDocumentoGeneral;
	public Boolean isPermisoGuardarCambiosTipoDocumentoGeneral;
	public Boolean isPermisoConsultaTipoDocumentoGeneral;
	public Boolean isPermisoBusquedaTipoDocumentoGeneral;
	public Boolean isPermisoReporteTipoDocumentoGeneral;
	public Boolean isPermisoPaginacionMedioTipoDocumentoGeneral;
	public Boolean isPermisoPaginacionAltoTipoDocumentoGeneral;
	public Boolean isPermisoPaginacionTodoTipoDocumentoGeneral;
	public Boolean isPermisoCopiarTipoDocumentoGeneral;
	public Boolean isPermisoVerFormTipoDocumentoGeneral;
	public Boolean isPermisoDuplicarTipoDocumentoGeneral;
	public Boolean isPermisoOrdenTipoDocumentoGeneral;
	
	
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
	
	public TipoDocumentoGeneralParameterReturnGeneral tipodocumentogeneralReturnGeneral;
	public TipoDocumentoGeneralParameterReturnGeneral tipodocumentogeneralParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoDocumentoGeneral=false;
	public Boolean esParaAccionDesdeFormularioTipoDocumentoGeneral=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoDocumentoGeneralSessionBeanAdditional tipodocumentogeneralSessionBeanAdditional=null;
	
	public TipoDocumentoGeneralSessionBeanAdditional getTipoDocumentoGeneralSessionBeanAdditional() {
		return this.tipodocumentogeneralSessionBeanAdditional;
	}
	
	public void setTipoDocumentoGeneralSessionBeanAdditional(TipoDocumentoGeneralSessionBeanAdditional tipodocumentogeneralSessionBeanAdditional) {
		try {
			this.tipodocumentogeneralSessionBeanAdditional=tipodocumentogeneralSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoDocumentoGeneralBeanSwingJInternalFrameAdditional tipodocumentogeneralBeanSwingJInternalFrameAdditional=null;
	//public class TipoDocumentoGeneralBeanSwingJInternalFrame
	
	public TipoDocumentoGeneralBeanSwingJInternalFrameAdditional getTipoDocumentoGeneralBeanSwingJInternalFrameAdditional() {
		return this.tipodocumentogeneralBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoDocumentoGeneralBeanSwingJInternalFrameAdditional(TipoDocumentoGeneralBeanSwingJInternalFrameAdditional tipodocumentogeneralBeanSwingJInternalFrameAdditional) {
		try {
			this.tipodocumentogeneralBeanSwingJInternalFrameAdditional=tipodocumentogeneralBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoDocumentoGeneralLogic tipodocumentogeneralLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoDocumentoGeneral tipodocumentogeneralBean;
	public TipoDocumentoGeneralConstantesFunciones tipodocumentogeneralConstantesFunciones;
	//public TipoDocumentoGeneralParameterReturnGeneral tipodocumentogeneralReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoDocumentoGeneral> tipodocumentogenerals;	
	//public List<TipoDocumentoGeneral> tipodocumentogeneralsEliminados;
	//public List<TipoDocumentoGeneral> tipodocumentogeneralsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoDocumentoGeneral=false;
	public Boolean isVisibilidadCeldaDuplicarTipoDocumentoGeneral=true;
	public Boolean isVisibilidadCeldaCopiarTipoDocumentoGeneral=true;
	public Boolean isVisibilidadCeldaVerFormTipoDocumentoGeneral=true;
	public Boolean isVisibilidadCeldaOrdenTipoDocumentoGeneral=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoDocumentoGeneral=false;
	public Boolean isVisibilidadCeldaModificarTipoDocumentoGeneral=false;
	public Boolean isVisibilidadCeldaActualizarTipoDocumentoGeneral=false;
	public Boolean isVisibilidadCeldaEliminarTipoDocumentoGeneral=false;
	public Boolean isVisibilidadCeldaCancelarTipoDocumentoGeneral=false;
	public Boolean isVisibilidadCeldaGuardarTipoDocumentoGeneral=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoDocumentoGeneral=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorId=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	
	public Long getiIdNuevoTipoDocumentoGeneral() {
		return this.iIdNuevoTipoDocumentoGeneral;
	}

	public void setiIdNuevoTipoDocumentoGeneral(Long iIdNuevoTipoDocumentoGeneral) {
		this.iIdNuevoTipoDocumentoGeneral = iIdNuevoTipoDocumentoGeneral;
	}
	
	public Long getidTipoDocumentoGeneralActual() {
		return this.idTipoDocumentoGeneralActual;
	}

	public void setidTipoDocumentoGeneralActual(Long idTipoDocumentoGeneralActual) {
		this.idTipoDocumentoGeneralActual = idTipoDocumentoGeneralActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoDocumentoGeneral gettipodocumentogeneral() {
		return this.tipodocumentogeneral;
	}

	public void settipodocumentogeneral(TipoDocumentoGeneral tipodocumentogeneral) {
		this.tipodocumentogeneral = tipodocumentogeneral;
	}
	
	public TipoDocumentoGeneral gettipodocumentogeneralAux() {
		return this.tipodocumentogeneralAux;
	}

	public void settipodocumentogeneralAux(TipoDocumentoGeneral tipodocumentogeneralAux) {
		this.tipodocumentogeneralAux = tipodocumentogeneralAux;
	}				
	
	public TipoDocumentoGeneral gettipodocumentogeneralAnterior() {
		return this.tipodocumentogeneralAnterior;
	}

	public void settipodocumentogeneralAnterior(TipoDocumentoGeneral tipodocumentogeneralAnterior) {
		this.tipodocumentogeneralAnterior = tipodocumentogeneralAnterior;
	}	
	
	public TipoDocumentoGeneral gettipodocumentogeneralTotales() {
		return this.tipodocumentogeneralTotales;
	}

	public void settipodocumentogeneralTotales(TipoDocumentoGeneral tipodocumentogeneralTotales) {
		this.tipodocumentogeneralTotales = tipodocumentogeneralTotales;
	}	
	
	public TipoDocumentoGeneral gettipodocumentogeneralBean() {
		return this.tipodocumentogeneralBean;
	}

	public void settipodocumentogeneralBean(TipoDocumentoGeneral tipodocumentogeneralBean) {
		this.tipodocumentogeneralBean = tipodocumentogeneralBean;
	}	
	
	public TipoDocumentoGeneralParameterReturnGeneral gettipodocumentogeneralReturnGeneral() {
		return this.tipodocumentogeneralReturnGeneral;
	}

	public void settipodocumentogeneralReturnGeneral(TipoDocumentoGeneralParameterReturnGeneral tipodocumentogeneralReturnGeneral) {
		this.tipodocumentogeneralReturnGeneral = tipodocumentogeneralReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
	}

	public Long idBusquedaPorId=0L;

	public Long getidBusquedaPorId() {
		return this.idBusquedaPorId;
	}

	public void setidBusquedaPorId(Long idBusquedaPorId) {
		this.idBusquedaPorId = idBusquedaPorId;
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
	
	
	public TipoDocumentoGeneralLogic getTipoDocumentoGeneralLogic()	{		
		return tipodocumentogeneralLogic;
	}

	public void setTipoDocumentoGeneralLogic(TipoDocumentoGeneralLogic tipodocumentogeneralLogic) {
		this.tipodocumentogeneralLogic = tipodocumentogeneralLogic;
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
	
	public Boolean getIsEsNuevoTipoDocumentoGeneral() {
		return isEsNuevoTipoDocumentoGeneral;
	}

	public void setIsEsNuevoTipoDocumentoGeneral(Boolean isEsNuevoTipoDocumentoGeneral) {
		this.isEsNuevoTipoDocumentoGeneral = isEsNuevoTipoDocumentoGeneral;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoDocumentoGeneral() {
		return esParaAccionDesdeFormularioTipoDocumentoGeneral;
	}
	
	public void setEsParaAccionDesdeFormularioTipoDocumentoGeneral(Boolean esParaAccionDesdeFormularioTipoDocumentoGeneral) {
		this.esParaAccionDesdeFormularioTipoDocumentoGeneral = esParaAccionDesdeFormularioTipoDocumentoGeneral;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoDocumentoGeneral() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoDocumentoGeneralConstantesFunciones.refrescarForeignKeysDescripcionesTipoDocumentoGeneral(this.tipodocumentogeneralLogic.getTipoDocumentoGenerals());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoDocumentoGeneralConstantesFunciones.refrescarForeignKeysDescripcionesTipoDocumentoGeneral(this.tipodocumentogenerals);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipodocumentogeneralLogic.setTipoDocumentoGenerals(this.tipodocumentogenerals);
			tipodocumentogeneralLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoDocumentoGeneralParameterReturnGeneral getTipoDocumentoGeneralParameterGeneral() {
		return this.tipodocumentogeneralParameterGeneral;
	}
	
	public void setTipoDocumentoGeneralParameterGeneral(TipoDocumentoGeneralParameterReturnGeneral tipodocumentogeneralParameterGeneral) {
		this.tipodocumentogeneralParameterGeneral = tipodocumentogeneralParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoDocumentoGeneral() {
		return isPermisoTodoTipoDocumentoGeneral;
	}

	public void setIsPermisoTodoTipoDocumentoGeneral(Boolean isPermisoTodoTipoDocumentoGeneral) {
		this.isPermisoTodoTipoDocumentoGeneral = isPermisoTodoTipoDocumentoGeneral;
	}

	public Boolean getIsPermisoNuevoTipoDocumentoGeneral() {
		return isPermisoNuevoTipoDocumentoGeneral;
	}

	public void setIsPermisoNuevoTipoDocumentoGeneral(Boolean isPermisoNuevoTipoDocumentoGeneral) {
		this.isPermisoNuevoTipoDocumentoGeneral = isPermisoNuevoTipoDocumentoGeneral;
	}

	public Boolean getIsPermisoActualizarTipoDocumentoGeneral() {
		return isPermisoActualizarTipoDocumentoGeneral;
	}

	public void setIsPermisoActualizarTipoDocumentoGeneral(Boolean isPermisoActualizarTipoDocumentoGeneral) {
		this.isPermisoActualizarTipoDocumentoGeneral = isPermisoActualizarTipoDocumentoGeneral;
	}

	public Boolean getIsPermisoEliminarTipoDocumentoGeneral() {
		return isPermisoEliminarTipoDocumentoGeneral;
	}

	public void setIsPermisoEliminarTipoDocumentoGeneral(Boolean isPermisoEliminarTipoDocumentoGeneral) {
		this.isPermisoEliminarTipoDocumentoGeneral = isPermisoEliminarTipoDocumentoGeneral;
	}

	public Boolean getIsPermisoGuardarCambiosTipoDocumentoGeneral() {
		return isPermisoGuardarCambiosTipoDocumentoGeneral;
	}

	public void setIsPermisoGuardarCambiosTipoDocumentoGeneral(Boolean isPermisoGuardarCambiosTipoDocumentoGeneral) {
		this.isPermisoGuardarCambiosTipoDocumentoGeneral = isPermisoGuardarCambiosTipoDocumentoGeneral;
	}
	
	public Boolean getIsPermisoConsultaTipoDocumentoGeneral() {
		return isPermisoConsultaTipoDocumentoGeneral;
	}

	public void setIsPermisoConsultaTipoDocumentoGeneral(Boolean isPermisoConsultaTipoDocumentoGeneral) {
		this.isPermisoConsultaTipoDocumentoGeneral = isPermisoConsultaTipoDocumentoGeneral;
	}

	public Boolean getIsPermisoBusquedaTipoDocumentoGeneral() {
		return isPermisoBusquedaTipoDocumentoGeneral;
	}

	public void setIsPermisoBusquedaTipoDocumentoGeneral(Boolean isPermisoBusquedaTipoDocumentoGeneral) {
		this.isPermisoBusquedaTipoDocumentoGeneral = isPermisoBusquedaTipoDocumentoGeneral;
	}

	public Boolean getIsPermisoReporteTipoDocumentoGeneral() {
		return isPermisoReporteTipoDocumentoGeneral;
	}

	public void setIsPermisoReporteTipoDocumentoGeneral(Boolean isPermisoReporteTipoDocumentoGeneral) {
		this.isPermisoReporteTipoDocumentoGeneral = isPermisoReporteTipoDocumentoGeneral;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoDocumentoGeneral() {
		return isPermisoPaginacionMedioTipoDocumentoGeneral;
	}

	public void setIsPermisoPaginacionMedioTipoDocumentoGeneral(Boolean isPermisoPaginacionMedioTipoDocumentoGeneral) {
		this.isPermisoPaginacionMedioTipoDocumentoGeneral = isPermisoPaginacionMedioTipoDocumentoGeneral;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoDocumentoGeneral() {
		return isPermisoPaginacionTodoTipoDocumentoGeneral;
	}

	public void setIsPermisoPaginacionTodoTipoDocumentoGeneral(Boolean isPermisoPaginacionTodoTipoDocumentoGeneral) {
		this.isPermisoPaginacionTodoTipoDocumentoGeneral = isPermisoPaginacionTodoTipoDocumentoGeneral;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoDocumentoGeneral() {
		return isPermisoPaginacionAltoTipoDocumentoGeneral;
	}

	public void setIsPermisoPaginacionAltoTipoDocumentoGeneral(Boolean isPermisoPaginacionAltoTipoDocumentoGeneral) {
		this.isPermisoPaginacionAltoTipoDocumentoGeneral = isPermisoPaginacionAltoTipoDocumentoGeneral;
	}
	
	public Boolean getIsPermisoCopiarTipoDocumentoGeneral() {
		return isPermisoCopiarTipoDocumentoGeneral;
	}

	public void setIsPermisoCopiarTipoDocumentoGeneral(Boolean isPermisoCopiarTipoDocumentoGeneral) {
		this.isPermisoCopiarTipoDocumentoGeneral = isPermisoCopiarTipoDocumentoGeneral;
	}
	
	public Boolean getIsPermisoVerFormTipoDocumentoGeneral() {
		return isPermisoVerFormTipoDocumentoGeneral;
	}

	public void setIsPermisoVerFormTipoDocumentoGeneral(Boolean isPermisoVerFormTipoDocumentoGeneral) {
		this.isPermisoVerFormTipoDocumentoGeneral = isPermisoVerFormTipoDocumentoGeneral;
	}
	
	public Boolean getIsPermisoDuplicarTipoDocumentoGeneral() {
		return isPermisoDuplicarTipoDocumentoGeneral;
	}

	public void setIsPermisoDuplicarTipoDocumentoGeneral(Boolean isPermisoDuplicarTipoDocumentoGeneral) {
		this.isPermisoDuplicarTipoDocumentoGeneral = isPermisoDuplicarTipoDocumentoGeneral;
	}
	
	public Boolean getIsPermisoOrdenTipoDocumentoGeneral() {
		return isPermisoOrdenTipoDocumentoGeneral;
	}

	public void setIsPermisoOrdenTipoDocumentoGeneral(Boolean isPermisoOrdenTipoDocumentoGeneral) {
		this.isPermisoOrdenTipoDocumentoGeneral = isPermisoOrdenTipoDocumentoGeneral;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoDocumentoGeneral() {
		return isVisibilidadCeldaNuevoTipoDocumentoGeneral;
	}

	public void setIsVisibilidadCeldaNuevoTipoDocumentoGeneral(Boolean isVisibilidadCeldaNuevoTipoDocumentoGeneral) {
		this.isVisibilidadCeldaNuevoTipoDocumentoGeneral = isVisibilidadCeldaNuevoTipoDocumentoGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoDocumentoGeneral() {
		return isVisibilidadCeldaDuplicarTipoDocumentoGeneral;
	}

	public void setIsVisibilidadCeldaDuplicarTipoDocumentoGeneral(Boolean isVisibilidadCeldaDuplicarTipoDocumentoGeneral) {
		this.isVisibilidadCeldaDuplicarTipoDocumentoGeneral = isVisibilidadCeldaDuplicarTipoDocumentoGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoDocumentoGeneral() {
		return isVisibilidadCeldaCopiarTipoDocumentoGeneral;
	}

	public void setIsVisibilidadCeldaCopiarTipoDocumentoGeneral(Boolean isVisibilidadCeldaCopiarTipoDocumentoGeneral) {
		this.isVisibilidadCeldaCopiarTipoDocumentoGeneral = isVisibilidadCeldaCopiarTipoDocumentoGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoDocumentoGeneral() {
		return isVisibilidadCeldaVerFormTipoDocumentoGeneral;
	}

	public void setIsVisibilidadCeldaVerFormTipoDocumentoGeneral(Boolean isVisibilidadCeldaVerFormTipoDocumentoGeneral) {
		this.isVisibilidadCeldaVerFormTipoDocumentoGeneral = isVisibilidadCeldaVerFormTipoDocumentoGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoDocumentoGeneral() {
		return isVisibilidadCeldaOrdenTipoDocumentoGeneral;
	}

	public void setIsVisibilidadCeldaOrdenTipoDocumentoGeneral(Boolean isVisibilidadCeldaOrdenTipoDocumentoGeneral) {
		this.isVisibilidadCeldaOrdenTipoDocumentoGeneral = isVisibilidadCeldaOrdenTipoDocumentoGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoDocumentoGeneral() {
		return isVisibilidadCeldaNuevoRelacionesTipoDocumentoGeneral;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoDocumentoGeneral(Boolean isVisibilidadCeldaNuevoRelacionesTipoDocumentoGeneral) {
		this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoGeneral = isVisibilidadCeldaNuevoRelacionesTipoDocumentoGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoDocumentoGeneral() {
		return isVisibilidadCeldaModificarTipoDocumentoGeneral;
	}

	public void setIsVisibilidadCeldaModificarTipoDocumentoGeneral(Boolean isVisibilidadCeldaModificarTipoDocumentoGeneral) {
		this.isVisibilidadCeldaModificarTipoDocumentoGeneral = isVisibilidadCeldaModificarTipoDocumentoGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoDocumentoGeneral() {
		return isVisibilidadCeldaActualizarTipoDocumentoGeneral;
	}

	public void setIsVisibilidadCeldaActualizarTipoDocumentoGeneral(Boolean isVisibilidadCeldaActualizarTipoDocumentoGeneral) {
		this.isVisibilidadCeldaActualizarTipoDocumentoGeneral = isVisibilidadCeldaActualizarTipoDocumentoGeneral;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoDocumentoGeneral() {
		return isVisibilidadCeldaEliminarTipoDocumentoGeneral;
	}

	public void setIsVisibilidadCeldaEliminarTipoDocumentoGeneral(Boolean isVisibilidadCeldaEliminarTipoDocumentoGeneral) {
		this.isVisibilidadCeldaEliminarTipoDocumentoGeneral = isVisibilidadCeldaEliminarTipoDocumentoGeneral;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoDocumentoGeneral() {
		return isVisibilidadCeldaCancelarTipoDocumentoGeneral;
	}

	public void setIsVisibilidadCeldaCancelarTipoDocumentoGeneral(Boolean isVisibilidadCeldaCancelarTipoDocumentoGeneral) {
		this.isVisibilidadCeldaCancelarTipoDocumentoGeneral = isVisibilidadCeldaCancelarTipoDocumentoGeneral;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoDocumentoGeneral() {
		return isVisibilidadCeldaGuardarTipoDocumentoGeneral;
	}

	public void setIsVisibilidadCeldaGuardarTipoDocumentoGeneral(Boolean isVisibilidadCeldaGuardarTipoDocumentoGeneral) {
		this.isVisibilidadCeldaGuardarTipoDocumentoGeneral = isVisibilidadCeldaGuardarTipoDocumentoGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoDocumentoGeneral() {
		return isVisibilidadCeldaGuardarCambiosTipoDocumentoGeneral;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoDocumentoGeneral(Boolean isVisibilidadCeldaGuardarCambiosTipoDocumentoGeneral) {
		this.isVisibilidadCeldaGuardarCambiosTipoDocumentoGeneral = isVisibilidadCeldaGuardarCambiosTipoDocumentoGeneral;
	}
		
	public TipoDocumentoGeneralSessionBean gettipodocumentogeneralSessionBean() {
		return this.tipodocumentogeneralSessionBean;
	}
	
	public void settipodocumentogeneralSessionBean(TipoDocumentoGeneralSessionBean tipodocumentogeneralSessionBean) {
		this.tipodocumentogeneralSessionBean=tipodocumentogeneralSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadBusquedaPorId() {
		return this.isVisibilidadBusquedaPorId;
	}

	public void setisVisibilidadBusquedaPorId(Boolean isVisibilidadBusquedaPorId) {
		this.isVisibilidadBusquedaPorId=isVisibilidadBusquedaPorId;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoGeneral(TipoDocumentoGeneral tipodocumentogeneral)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoDocumentoGeneral tipodocumentogeneral,TipoDocumentoGeneral tipodocumentogeneralAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoDocumentoGeneral(tipodocumentogeneral);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipodocumentogeneralAux.setId(tipodocumentogeneral.getId());
		tipodocumentogeneralAux.setVersionRow(tipodocumentogeneral.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoDocumentoGeneral();
		
			int intSelectedRow = this.jTableDatosTipoDocumentoGeneral.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentogeneral =(TipoDocumentoGeneral) this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipodocumentogeneral =(TipoDocumentoGeneral) this.tipodocumentogenerals.toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoDocumentoGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoDocumentoGeneral(this.tipodocumentogeneral,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoGeneral(this.tipodocumentogeneral);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipodocumentogeneralValidator.getInvalidValues(this.tipodocumentogeneral);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipodocumentogeneralLogic.setDatosCliente(datosCliente);
			tipodocumentogeneralLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipodocumentogeneralAux=new  TipoDocumentoGeneral();
				
				tipodocumentogeneralAux.setIsNew(true);
				tipodocumentogeneralAux.setIsChanged(true);
				
				tipodocumentogeneralAux.setTipoDocumentoGeneralOriginal(this.tipodocumentogeneral);
				
				tipodocumentogeneralAux.setId(this.tipodocumentogeneral.getId());	
				tipodocumentogeneralAux.setVersionRow(this.tipodocumentogeneral.getVersionRow());	
				tipodocumentogeneralAux.setcodigo(this.tipodocumentogeneral.getcodigo());	
				tipodocumentogeneralAux.setnombre(this.tipodocumentogeneral.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipodocumentogeneralSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipodocumentogeneralAux,tipodocumentogeneralLogic.getTipoDocumentoGenerals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodocumentogeneralAux,tipodocumentogenerals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipodocumentogeneralSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentogeneralLogic.saveTipoDocumentoGenerals();//WithConnection
						//tipodocumentogeneralLogic.getSetVersionRowTipoDocumentoGenerals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipodocumentogeneral,tipodocumentogeneralAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipodocumentogeneralAux=new  TipoDocumentoGeneral();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado() 
					|| (this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado() && this.tipodocumentogeneral.getId()>=0)) {
						
					tipodocumentogeneralAux.setIsNew(false);
				}
				
				tipodocumentogeneralAux.setIsDeleted(false);
			
				tipodocumentogeneralAux.setId(this.tipodocumentogeneral.getId());	
				tipodocumentogeneralAux.setVersionRow(this.tipodocumentogeneral.getVersionRow());	
				tipodocumentogeneralAux.setcodigo(this.tipodocumentogeneral.getcodigo());	
				tipodocumentogeneralAux.setnombre(this.tipodocumentogeneral.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipodocumentogeneralAux,tipodocumentogeneralLogic.getTipoDocumentoGenerals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodocumentogeneralAux,tipodocumentogenerals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipodocumentogeneralSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentogeneralLogic.saveTipoDocumentoGenerals();//WithConnection
						//tipodocumentogeneralLogic.getSetVersionRowTipoDocumentoGenerals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipodocumentogeneral,tipodocumentogeneralAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipodocumentogeneralAux=new  TipoDocumentoGeneral();
				
				tipodocumentogeneralAux.setIsNew(false);
				tipodocumentogeneralAux.setIsChanged(false);
				
				tipodocumentogeneralAux.setIsDeleted(true);
				
				tipodocumentogeneralAux.setId(this.tipodocumentogeneral.getId());	
				tipodocumentogeneralAux.setVersionRow(this.tipodocumentogeneral.getVersionRow());	
				tipodocumentogeneralAux.setcodigo(this.tipodocumentogeneral.getcodigo());	
				tipodocumentogeneralAux.setnombre(this.tipodocumentogeneral.getnombre());	
				
				if(this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipodocumentogeneralAux.getId()>=0) {	
						this.tipodocumentogeneralsEliminados.add(tipodocumentogeneralAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipodocumentogeneralAux,tipodocumentogeneralLogic.getTipoDocumentoGenerals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodocumentogeneralAux,tipodocumentogenerals);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipodocumentogeneralSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentogeneralLogic.saveTipoDocumentoGenerals();//WithConnection
						//tipodocumentogeneralLogic.getSetVersionRowTipoDocumentoGenerals();//WithConnection
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
					this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().addAll(this.tipodocumentogeneralsEliminados);
					
					tipodocumentogeneralLogic.saveTipoDocumentoGenerals();//WithConnection
					//tipodocumentogeneralLogic.getSetVersionRowTipoDocumentoGenerals();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipodocumentogeneralsEliminados= new ArrayList<TipoDocumentoGeneral>();		
			}
			
			if(this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Documento General GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Documento General",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipodocumentogeneral=tipodocumentogeneralAux;
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
      		//this.finishProcessTipoDocumentoGeneral();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoDocumentoGeneral tipodocumentogeneralLocal) throws Exception {
		
		if(this.tipodocumentogeneralSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoDocumentoGeneral tipodocumentogeneralLocal) throws Exception {	
		if(this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoDocumentoGeneralActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoDocumentoGeneral.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipodocumentogeneral =(TipoDocumentoGeneral) this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipodocumentogeneral =(TipoDocumentoGeneral) this.tipodocumentogenerals.toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipodocumentogeneralValidator.getInvalidValues(this.tipodocumentogeneral);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoDocumentoGeneral tipodocumentogeneral,List<TipoDocumentoGeneral> tipodocumentogenerals) throws Exception {
		try	{		
			TipoDocumentoGeneralConstantesFunciones.actualizarLista(tipodocumentogeneral,tipodocumentogenerals,this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoDocumentoGeneral tipodocumentogeneral,List<TipoDocumentoGeneral> tipodocumentogenerals) throws Exception {
		try	{			
			TipoDocumentoGeneralConstantesFunciones.actualizarSelectedLista(tipodocumentogeneral,tipodocumentogenerals);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoDocumentoGeneral> tipodocumentogeneralsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipodocumentogeneralsLocal=this.tipodocumentogeneralLogic.getTipoDocumentoGenerals();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipodocumentogeneralsLocal=this.tipodocumentogenerals;
			}
			//ARCHITECTURE
		
			for(TipoDocumentoGeneral tipodocumentogeneralLocal:tipodocumentogeneralsLocal) {
				if(this.permiteMantenimiento(tipodocumentogeneralLocal) && tipodocumentogeneralLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoDocumentoGeneralConstantesFunciones.getTipoDocumentoGeneralLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoDocumentoGeneralConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDocumentoGeneral.jLabelcodigoTipoDocumentoGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDocumentoGeneralConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDocumentoGeneral.jLabelnombreTipoDocumentoGeneral,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDocumentoGeneral.jLabelcodigoTipoDocumentoGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDocumentoGeneral.jLabelnombreTipoDocumentoGeneral,"");
		
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
		this.iIdNuevoTipoDocumentoGeneral--;	
		
		
		this.tipodocumentogeneralAux=new TipoDocumentoGeneral();
		
		this.tipodocumentogeneralAux.setId(this.iIdNuevoTipoDocumentoGeneral);
		this.tipodocumentogeneralAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().add(this.tipodocumentogeneralAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipodocumentogenerals.add(this.tipodocumentogeneralAux);
		}
		//ARCHITECTURE
		
		this.tipodocumentogeneral=this.tipodocumentogeneralAux;
		
		if(TipoDocumentoGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoDocumentoGeneral(this.tipodocumentogeneral);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoDocumentoGeneral(this.tipodocumentogeneral);
		}
				
		//this.setDefaultControlesTipoDocumentoGeneral();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoDocumentoGeneral();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoDocumentoGeneral();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDocumentoGeneral();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoDocumentoGeneral(this.tipodocumentogeneralBean,this.tipodocumentogeneral,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoGeneral(this.tipodocumentogeneral);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipodocumentogeneralSessionBean.getConGuardarRelaciones()) {
			classes=TipoDocumentoGeneralConstantesFunciones.getClassesRelationshipsOfTipoDocumentoGeneral(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipodocumentogeneralReturnGeneral=tipodocumentogeneralLogic.procesarEventosTipoDocumentoGeneralsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodocumentogeneralLogic.getTipoDocumentoGenerals(),this.tipodocumentogeneral,this.tipodocumentogeneralParameterGeneral,this.isEsNuevoTipoDocumentoGeneral,classes);//this.tipodocumentogeneralLogic.getTipoDocumentoGeneral()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoDocumentoGeneral(this.tipodocumentogeneralReturnGeneral,this.tipodocumentogeneralBean,false);
		
		if(this.tipodocumentogeneralReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoDocumentoGeneral(this.tipodocumentogeneralReturnGeneral.getTipoDocumentoGeneral());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoDocumentoGeneral(this.tipodocumentogeneralReturnGeneral.getTipoDocumentoGeneral());
		}
		
		if(this.tipodocumentogeneralReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoDocumentoGeneral(this.tipodocumentogeneralReturnGeneral.getTipoDocumentoGeneral(),classes);//this.tipodocumentogeneralBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoDocumentoGeneral(this.tipodocumentogeneral,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoDocumentoGeneral();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoDocumentoGeneral();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.RecargarFormTipoDocumentoGeneral(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoDocumentoGeneral(false);
						
			if(tipodocumentogeneralSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoDocumentoGeneralJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDocumentoGeneral();
			}
			
			this.actualizarVisualTableDatosTipoDocumentoGeneral();
			
			this.jTableDatosTipoDocumentoGeneral.setRowSelectionInterval(this.getIndiceNuevoTipoDocumentoGeneral(), this.getIndiceNuevoTipoDocumentoGeneral());
			
			this.seleccionarFilaTablaTipoDocumentoGeneralActual();
						
			this.actualizarEstadoCeldasBotonesTipoDocumentoGeneral("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoDocumentoGeneral(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTextFieldcodigoTipoDocumentoGeneral.setEnabled(isHabilitar && this.tipodocumentogeneralConstantesFunciones.activarcodigoTipoDocumentoGeneral);
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTextAreanombreTipoDocumentoGeneral.setEnabled(isHabilitar && this.tipodocumentogeneralConstantesFunciones.activarnombreTipoDocumentoGeneral);	
		
	};
	
	public void setDefaultControlesTipoDocumentoGeneral() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoDocumentoGeneral(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipodocumentogeneralSessionBean.setConGuardarRelaciones(true);			
			this.tipodocumentogeneralSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTabbedPaneRelacionesTipoDocumentoGeneral.setVisible(true);
			
					
		} else {
			//this.tipodocumentogeneralSessionBean.setConGuardarRelaciones(false);			
			this.tipodocumentogeneralSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTabbedPaneRelacionesTipoDocumentoGeneral.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoDocumentoGeneral() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDocumentoGeneral tipodocumentogeneralAux:this.tipodocumentogeneralLogic.getTipoDocumentoGenerals()) {
				if(tipodocumentogeneralAux.getId().equals(this.iIdNuevoTipoDocumentoGeneral)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDocumentoGeneral tipodocumentogeneralAux:this.tipodocumentogenerals) {
				if(tipodocumentogeneralAux.getId().equals(this.iIdNuevoTipoDocumentoGeneral)) {
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
	
	public int getIndiceActualTipoDocumentoGeneral(TipoDocumentoGeneral tipodocumentogeneral,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDocumentoGeneral tipodocumentogeneralAux:this.tipodocumentogeneralLogic.getTipoDocumentoGenerals()) {
				if(tipodocumentogeneralAux.getId().equals(tipodocumentogeneral.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDocumentoGeneral tipodocumentogeneralAux:this.tipodocumentogenerals) {
				if(tipodocumentogeneralAux.getId().equals(tipodocumentogeneral.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoDocumentoGeneral(TipoDocumentoGeneral tipodocumentogeneralOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDocumentoGeneral tipodocumentogeneralAux:this.tipodocumentogeneralLogic.getTipoDocumentoGenerals()) {
				if(tipodocumentogeneralAux.getTipoDocumentoGeneralOriginal().getId().equals(tipodocumentogeneralOriginal.getId())) {
					existe=true;
					tipodocumentogeneralOriginal.setId(tipodocumentogeneralAux.getId());
					tipodocumentogeneralOriginal.setVersionRow(tipodocumentogeneralAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDocumentoGeneral tipodocumentogeneralAux:this.tipodocumentogenerals) {
				if(tipodocumentogeneralAux.getTipoDocumentoGeneralOriginal().getId().equals(tipodocumentogeneralOriginal.getId())) {
					existe=true;
					tipodocumentogeneralOriginal.setId(tipodocumentogeneralAux.getId());
					tipodocumentogeneralOriginal.setVersionRow(tipodocumentogeneralAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoDocumentoGeneral(Boolean esParaCancelar) throws Exception {
		tipodocumentogeneralsAux=new ArrayList<TipoDocumentoGeneral>();
		tipodocumentogeneralAux=new TipoDocumentoGeneral();
		
		if(!this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoDocumentoGeneral tipodocumentogeneralAux:this.tipodocumentogeneralLogic.getTipoDocumentoGenerals()) {
					if(tipodocumentogeneralAux.getId()<0) {
						tipodocumentogeneralsAux.add(tipodocumentogeneralAux);
					}		
				}
				this.iIdNuevoTipoDocumentoGeneral=0L;
				this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().removeAll(tipodocumentogeneralsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDocumentoGeneral tipodocumentogeneralAux:this.tipodocumentogenerals) {
					if(tipodocumentogeneralAux.getId()<0) {
						tipodocumentogeneralsAux.add(tipodocumentogeneralAux);
					}		
				}
				this.iIdNuevoTipoDocumentoGeneral=0L;
				this.tipodocumentogenerals.removeAll(tipodocumentogeneralsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoDocumentoGeneral 
					&& this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().size()>0
					) {
					tipodocumentogeneralAux=this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().get(this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().size() - 1);
				
					if(tipodocumentogeneralAux.getId()<0) {
						this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().remove(tipodocumentogeneralAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoDocumentoGeneral && this.tipodocumentogenerals.size()>0) {
					tipodocumentogeneralAux=this.tipodocumentogenerals.get(this.tipodocumentogenerals.size() - 1);
				
					if(tipodocumentogeneralAux.getId()<0) {
						this.tipodocumentogenerals.remove(tipodocumentogeneralAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoDocumentoGeneral(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipodocumentogeneral.getId()<0) {
				this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().remove(this.tipodocumentogeneral);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipodocumentogeneral.getId()<0) {
				this.tipodocumentogenerals.remove(this.tipodocumentogeneral);
			}
		}			
	}
	
	public void setEstadosInicialesTipoDocumentoGeneral(List<TipoDocumentoGeneral> tipodocumentogeneralsAux) throws Exception {
		TipoDocumentoGeneralConstantesFunciones.setEstadosInicialesTipoDocumentoGeneral(tipodocumentogeneralsAux);
	}
	
	public void setEstadosInicialesTipoDocumentoGeneral(TipoDocumentoGeneral tipodocumentogeneralAux) throws Exception {
		TipoDocumentoGeneralConstantesFunciones.setEstadosInicialesTipoDocumentoGeneral(tipodocumentogeneralAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoDocumentoGeneralActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoDocumentoGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoDocumentoGeneralActual()) {
				if(!this.isEsNuevoTipoDocumentoGeneral) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoDocumentoGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoDocumentoGeneral=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoDocumentoGeneralActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Documento General ?", "MANTENIMIENTO DE Tipo Documento General", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoDocumentoGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoDocumentoGeneral tipodocumentogeneral) throws Exception {
		TipoDocumentoGeneralConstantesFunciones.seleccionarAsignar(this.tipodocumentogeneral,tipodocumentogeneral);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoDocumentoGeneral=this.isPermisoActualizarOriginalTipoDocumentoGeneral;
			
			
			this.seleccionarAsignar(tipodocumentogeneral);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoDocumentoGeneralConstantesFunciones.quitarEspaciosTipoDocumentoGeneral(this.tipodocumentogeneral,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoDocumentoGeneral("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipodocumentogeneralSessionBean.setsFuncionBusquedaRapida(this.tipodocumentogeneralSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoDocumentoGeneral) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoDocumentoGeneral(esParaCancelar);				
				this.cancelarNuevoTipoDocumentoGeneral(esParaCancelar);								
			}
			
			this.tipodocumentogeneral=new TipoDocumentoGeneral();
			
			this.inicializarTipoDocumentoGeneral();
			
			this.actualizarEstadoCeldasBotonesTipoDocumentoGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoDocumentoGeneral() throws Exception {
		try {
			TipoDocumentoGeneralConstantesFunciones.inicializarTipoDocumentoGeneral(this.tipodocumentogeneral);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoDocumentoGenerals(String sAccionBusqueda,List<TipoDocumentoGeneral> tipodocumentogeneralsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoDocumentoGeneral"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoDocumentoGeneralMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoDocumentoGeneralMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoDocumentoGeneral"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Documento Generals");		
		parameters.put("busquedapor", TipoDocumentoGeneralConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoDocumentoGeneral=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoDocumentoGeneralConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoDocumentoGeneralConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoDocumentoGeneral=new JRBeanArrayDataSource(TipoDocumentoGeneralJInternalFrame.TraerTipoDocumentoGeneralBeans(tipodocumentogeneralsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoDocumentoGeneral);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoDocumentoGeneralConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoDocumentoGeneralConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoDocumentoGeneralBean.TraerTipoDocumentoGeneralBeans(tipodocumentogeneralsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoDocumentoGenerals(sAccionBusqueda,sTipoArchivoReporte,tipodocumentogeneralsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoDocumentoGenerals(sAccionBusqueda,sTipoArchivoReporte,tipodocumentogeneralsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoDocumentoGeneralActionPerformed(null);
					//this.generarExcelReporteTipoDocumentoGenerals(sAccionBusqueda,sTipoArchivoReporte,tipodocumentogeneralsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoDocumentoGenerals(sAccionBusqueda,sTipoArchivoReporte,tipodocumentogeneralsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoDocumentoGenerals(sAccionBusqueda,sTipoArchivoReporte,tipodocumentogeneralsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoDocumentoGenerals(sAccionBusqueda,sTipoArchivoReporte,tipodocumentogeneralsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoDocumentoGenerals(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDocumentoGeneral> tipodocumentogeneralsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodocumentogeneral";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDocumentoGenerals");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoDocumentoGeneral("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoDocumentoGeneral tipodocumentogeneral : tipodocumentogeneralsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoDocumentoGeneralConstantesFunciones.generarExcelReporteDataTipoDocumentoGeneral("NORMAL",row,workbook,tipodocumentogeneral,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Documento General",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoDocumentoGeneral(String sTipo,Row row,Workbook workbook) {
		
		TipoDocumentoGeneralConstantesFunciones.generarExcelReporteHeaderTipoDocumentoGeneral(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoDocumentoGenerals(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDocumentoGeneral> tipodocumentogeneralsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodocumentogeneral_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDocumentoGenerals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoDocumentoGeneral tipodocumentogeneral : tipodocumentogeneralsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoDocumentoGeneralConstantesFunciones.getTipoDocumentoGeneralDescripcion(tipodocumentogeneral));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDocumentoGeneralConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDocumentoGeneralConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodocumentogeneral.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDocumentoGeneralConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDocumentoGeneralConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodocumentogeneral.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Documento General",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoDocumentoGenerals(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDocumentoGeneral> tipodocumentogeneralsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoDocumentoGeneral> tipodocumentogeneralsRespaldo=null;
		
		classes=TipoDocumentoGeneralConstantesFunciones.getClassesRelationshipsOfTipoDocumentoGeneral(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipodocumentogeneralLogic.setDatosCliente(this.datosCliente);
		this.tipodocumentogeneralLogic.setDatosDeep(this.datosDeep);
		this.tipodocumentogeneralLogic.setIsConDeep(true);
		
		tipodocumentogeneralsRespaldo=this.tipodocumentogeneralLogic.getTipoDocumentoGenerals();
		
		this.tipodocumentogeneralLogic.setTipoDocumentoGenerals(tipodocumentogeneralsParaReportes);	
		this.tipodocumentogeneralLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipodocumentogeneralsParaReportes=this.tipodocumentogeneralLogic.getTipoDocumentoGenerals();
		this.tipodocumentogeneralLogic.setTipoDocumentoGenerals(tipodocumentogeneralsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodocumentogeneral_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDocumentoGenerals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoDocumentoGeneral("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoDocumentoGeneral tipodocumentogeneral : tipodocumentogeneralsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoDocumentoGeneral("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoDocumentoGeneralConstantesFunciones.generarExcelReporteDataTipoDocumentoGeneral("NORMAL",row,workbook,tipodocumentogeneral,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoDocumentoGeneralConstantesFunciones.getTipoDocumentoGeneralDescripcion(tipodocumentogeneral));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Documento General",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoDocumentoGeneral() throws Exception {		
		this.startProcessTipoDocumentoGeneral(true);
	}
	
	public void startProcessTipoDocumentoGeneral(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoDocumentoGeneral ,this.jPanelParametrosReportesTipoDocumentoGeneral, this.jScrollPanelDatosTipoDocumentoGeneral,this.jPanelPaginacionTipoDocumentoGeneral, this.jScrollPanelDatosEdicionTipoDocumentoGeneral, this.jPanelAccionesTipoDocumentoGeneral,this.jPanelAccionesFormularioTipoDocumentoGeneral,this.jmenuBarTipoDocumentoGeneral,this.jmenuBarDetalleTipoDocumentoGeneral,this.jTtoolBarTipoDocumentoGeneral,this.jTtoolBarDetalleTipoDocumentoGeneral);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoDocumentoGeneral=this.jTabbedPaneBusquedasTipoDocumentoGeneral; 
		
		final JPanel jPanelParametrosReportesTipoDocumentoGeneral=this.jPanelParametrosReportesTipoDocumentoGeneral;
		//final JScrollPane jScrollPanelDatosTipoDocumentoGeneral=this.jScrollPanelDatosTipoDocumentoGeneral;
		final JTable jTableDatosTipoDocumentoGeneral=this.jTableDatosTipoDocumentoGeneral;		
		final JPanel jPanelPaginacionTipoDocumentoGeneral=this.jPanelPaginacionTipoDocumentoGeneral;
		//final JScrollPane jScrollPanelDatosEdicionTipoDocumentoGeneral=this.jScrollPanelDatosEdicionTipoDocumentoGeneral;
		final JPanel jPanelAccionesTipoDocumentoGeneral=this.jPanelAccionesTipoDocumentoGeneral;
		
		JPanel jPanelCamposAuxiliarTipoDocumentoGeneral=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoDocumentoGeneral=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) {
			jPanelCamposAuxiliarTipoDocumentoGeneral=this.jInternalFrameDetalleFormTipoDocumentoGeneral.jPanelCamposTipoDocumentoGeneral;
			jPanelAccionesFormularioAuxiliarTipoDocumentoGeneral=this.jInternalFrameDetalleFormTipoDocumentoGeneral.jPanelAccionesFormularioTipoDocumentoGeneral;
		}
		
		final JPanel jPanelCamposTipoDocumentoGeneral=jPanelCamposAuxiliarTipoDocumentoGeneral;
		final JPanel jPanelAccionesFormularioTipoDocumentoGeneral=jPanelAccionesFormularioAuxiliarTipoDocumentoGeneral;
		
		
		final JMenuBar jmenuBarTipoDocumentoGeneral=this.jmenuBarTipoDocumentoGeneral;
		final JToolBar jTtoolBarTipoDocumentoGeneral=this.jTtoolBarTipoDocumentoGeneral;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoDocumentoGeneral=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoDocumentoGeneral=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) {
			jmenuBarDetalleAuxiliarTipoDocumentoGeneral=this.jInternalFrameDetalleFormTipoDocumentoGeneral.jmenuBarDetalleTipoDocumentoGeneral;
			jTtoolBarDetalleAuxiliarTipoDocumentoGeneral=this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTtoolBarDetalleTipoDocumentoGeneral;
		}
		
		final JMenuBar jmenuBarDetalleTipoDocumentoGeneral=jmenuBarDetalleAuxiliarTipoDocumentoGeneral;
		final JToolBar jTtoolBarDetalleTipoDocumentoGeneral=jTtoolBarDetalleAuxiliarTipoDocumentoGeneral;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoDocumentoGeneral;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoDocumentoGeneral;
			processRunnable.jTableDatos=jTableDatosTipoDocumentoGeneral;
			processRunnable.jPanelCampos=jPanelCamposTipoDocumentoGeneral;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoDocumentoGeneral;
			processRunnable.jPanelAcciones=jPanelAccionesTipoDocumentoGeneral;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoDocumentoGeneral;
			
			
			processRunnable.jmenuBar=jmenuBarTipoDocumentoGeneral;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoDocumentoGeneral;
			processRunnable.jTtoolBar=jTtoolBarTipoDocumentoGeneral;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoDocumentoGeneral;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoDocumentoGeneral ,jPanelParametrosReportesTipoDocumentoGeneral,jTableDatosTipoDocumentoGeneral, /*jScrollPanelDatosTipoDocumentoGeneral,*/jPanelCamposTipoDocumentoGeneral,jPanelPaginacionTipoDocumentoGeneral, /*jScrollPanelDatosEdicionTipoDocumentoGeneral,*/ jPanelAccionesTipoDocumentoGeneral,jPanelAccionesFormularioTipoDocumentoGeneral,jmenuBarTipoDocumentoGeneral,jmenuBarDetalleTipoDocumentoGeneral,jTtoolBarTipoDocumentoGeneral,jTtoolBarDetalleTipoDocumentoGeneral);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoDocumentoGeneral ,jPanelParametrosReportesTipoDocumentoGeneral, jScrollPanelDatosTipoDocumentoGeneral,jPanelPaginacionTipoDocumentoGeneral, jScrollPanelDatosEdicionTipoDocumentoGeneral, jPanelAccionesTipoDocumentoGeneral,jPanelAccionesFormularioTipoDocumentoGeneral,jmenuBarTipoDocumentoGeneral,jmenuBarDetalleTipoDocumentoGeneral,jTtoolBarTipoDocumentoGeneral,jTtoolBarDetalleTipoDocumentoGeneral);
						
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
	
	public void finishProcessTipoDocumentoGeneral() {// throws Exception 
		this.finishProcessTipoDocumentoGeneral(true);
	}
	
	public void finishProcessTipoDocumentoGeneral(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoDocumentoGeneral ,this.jPanelParametrosReportesTipoDocumentoGeneral, this.jScrollPanelDatosTipoDocumentoGeneral,this.jPanelPaginacionTipoDocumentoGeneral, this.jScrollPanelDatosEdicionTipoDocumentoGeneral, this.jPanelAccionesTipoDocumentoGeneral,this.jPanelAccionesFormularioTipoDocumentoGeneral,this.jmenuBarTipoDocumentoGeneral,this.jmenuBarDetalleTipoDocumentoGeneral,this.jTtoolBarTipoDocumentoGeneral,this.jTtoolBarDetalleTipoDocumentoGeneral);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoDocumentoGeneral=this.jTabbedPaneBusquedasTipoDocumentoGeneral; 
		
		final JPanel jPanelParametrosReportesTipoDocumentoGeneral=this.jPanelParametrosReportesTipoDocumentoGeneral;
		//final JScrollPane jScrollPanelDatosTipoDocumentoGeneral=this.jScrollPanelDatosTipoDocumentoGeneral;
		final JTable jTableDatosTipoDocumentoGeneral=this.jTableDatosTipoDocumentoGeneral;		
		final JPanel jPanelPaginacionTipoDocumentoGeneral=this.jPanelPaginacionTipoDocumentoGeneral;
		//final JScrollPane jScrollPanelDatosEdicionTipoDocumentoGeneral=this.jScrollPanelDatosEdicionTipoDocumentoGeneral;
		final JPanel jPanelAccionesTipoDocumentoGeneral=this.jPanelAccionesTipoDocumentoGeneral;
		
		JPanel jPanelCamposAuxiliarTipoDocumentoGeneral=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoDocumentoGeneral=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) {
			jPanelCamposAuxiliarTipoDocumentoGeneral=this.jInternalFrameDetalleFormTipoDocumentoGeneral.jPanelCamposTipoDocumentoGeneral;
			jPanelAccionesFormularioAuxiliarTipoDocumentoGeneral=this.jInternalFrameDetalleFormTipoDocumentoGeneral.jPanelAccionesFormularioTipoDocumentoGeneral;
		}
		
		final JPanel jPanelCamposTipoDocumentoGeneral=jPanelCamposAuxiliarTipoDocumentoGeneral;
		final JPanel jPanelAccionesFormularioTipoDocumentoGeneral=jPanelAccionesFormularioAuxiliarTipoDocumentoGeneral;
		
		
		final JMenuBar jmenuBarTipoDocumentoGeneral=this.jmenuBarTipoDocumentoGeneral;		
		final JToolBar jTtoolBarTipoDocumentoGeneral=this.jTtoolBarTipoDocumentoGeneral;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoDocumentoGeneral=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoDocumentoGeneral=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) {
			jmenuBarDetalleAuxiliarTipoDocumentoGeneral=this.jInternalFrameDetalleFormTipoDocumentoGeneral.jmenuBarDetalleTipoDocumentoGeneral;
			jTtoolBarDetalleAuxiliarTipoDocumentoGeneral=this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTtoolBarDetalleTipoDocumentoGeneral;		
		}
		
		final JMenuBar jmenuBarDetalleTipoDocumentoGeneral=jmenuBarDetalleAuxiliarTipoDocumentoGeneral;
		final JToolBar jTtoolBarDetalleTipoDocumentoGeneral=jTtoolBarDetalleAuxiliarTipoDocumentoGeneral;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoDocumentoGeneral;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoDocumentoGeneral;
			processRunnable.jTableDatos=jTableDatosTipoDocumentoGeneral;
			processRunnable.jPanelCampos=jPanelCamposTipoDocumentoGeneral;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoDocumentoGeneral;
			processRunnable.jPanelAcciones=jPanelAccionesTipoDocumentoGeneral;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoDocumentoGeneral;
			
			
			processRunnable.jmenuBar=jmenuBarTipoDocumentoGeneral;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoDocumentoGeneral;
			processRunnable.jTtoolBar=jTtoolBarTipoDocumentoGeneral;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoDocumentoGeneral;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoDocumentoGeneral ,jPanelParametrosReportesTipoDocumentoGeneral, jTableDatosTipoDocumentoGeneral,/*jScrollPanelDatosTipoDocumentoGeneral,*/jPanelCamposTipoDocumentoGeneral,jPanelPaginacionTipoDocumentoGeneral, /*jScrollPanelDatosEdicionTipoDocumentoGeneral,*/ jPanelAccionesTipoDocumentoGeneral,jPanelAccionesFormularioTipoDocumentoGeneral,jmenuBarTipoDocumentoGeneral,jmenuBarDetalleTipoDocumentoGeneral,jTtoolBarTipoDocumentoGeneral,jTtoolBarDetalleTipoDocumentoGeneral));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoDocumentoGeneral(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoDocumentoGeneral(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoDocumentoGeneral(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoDocumentoGeneral(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoDocumentoGeneral,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoDocumentoGeneral,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoDocumentoGeneral(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoDocumentoGeneral,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoDocumentoGeneral,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipodocumentogeneralConstantesFunciones.getsFinalQueryTipoDocumentoGeneral();
		String  finalQueryPaginacionTodos=this.tipodocumentogeneralConstantesFunciones.getsFinalQueryTipoDocumentoGeneral();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoDocumentoGeneralConstantesFunciones.getArrayColumnasGlobalesNoTipoDocumentoGeneral(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoDocumentoGeneralConstantesFunciones.getArrayColumnasGlobalesTipoDocumentoGeneral(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoDocumentoGeneralConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipodocumentogeneralsEliminados= new ArrayList<TipoDocumentoGeneral>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoDocumentoGeneral();
		
				///*TipoDocumentoGeneralSessionBean*/this.tipodocumentogeneralSessionBean=new TipoDocumentoGeneralSessionBean();
			
			if(this.tipodocumentogeneralSessionBean==null) {
				this.tipodocumentogeneralSessionBean=new TipoDocumentoGeneralSessionBean();
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
					this.iNumeroPaginacion=TipoDocumentoGeneralConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoDocumentoGeneralConstantesFunciones.getClassesForeignKeysOfTipoDocumentoGeneral(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipodocumentogeneral."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipodocumentogeneralsAux= new ArrayList<TipoDocumentoGeneral>();
			
				
			tipodocumentogeneralLogic.setDatosCliente(this.datosCliente);
			tipodocumentogeneralLogic.setDatosDeep(this.datosDeep);
			tipodocumentogeneralLogic.setIsConDeep(true);
			
			
			tipodocumentogeneralLogic.getTipoDocumentoGeneralDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipodocumentogeneralLogic.getTodosTipoDocumentoGenerals(finalQueryGlobal,pagination);
					
					//tipodocumentogeneralLogic.getTodosTipoDocumentoGeneralsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipodocumentogeneralLogic.getTipoDocumentoGenerals()==null|| tipodocumentogeneralLogic.getTipoDocumentoGenerals().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodocumentogeneralsAux= new ArrayList<TipoDocumentoGeneral>();
							tipodocumentogeneralsAux.addAll(tipodocumentogeneralLogic.getTipoDocumentoGenerals());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodocumentogeneralsAux= new ArrayList<TipoDocumentoGeneral>();
							tipodocumentogeneralsAux.addAll(tipodocumentogenerals);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodocumentogeneralLogic.getTodosTipoDocumentoGenerals(finalQueryGlobal+"",this.pagination);												
							
							//tipodocumentogeneralLogic.getTodosTipoDocumentoGeneralsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoDocumentoGenerals("Todos",tipodocumentogeneralLogic.getTipoDocumentoGenerals() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodocumentogeneralLogic.setTipoDocumentoGenerals(new ArrayList<TipoDocumentoGeneral>());					
							tipodocumentogeneralLogic.getTipoDocumentoGenerals().addAll(tipodocumentogeneralsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodocumentogenerals=new ArrayList<TipoDocumentoGeneral>();
							tipodocumentogenerals.addAll(tipodocumentogeneralsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoDocumentoGeneral=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoDocumentoGeneral=this.idActual;
				
				} else if(this.idTipoDocumentoGeneralActual!=null && this.idTipoDocumentoGeneralActual!=0L) {
					idTipoDocumentoGeneral=idTipoDocumentoGeneralActual;
				}
				
					
				this.sDetalleReporte=TipoDocumentoGeneralConstantesFunciones.getDetalleIndicePorId(idTipoDocumentoGeneral);
				
				this.tipodocumentogenerals=new ArrayList<TipoDocumentoGeneral>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipodocumentogeneralLogic.getEntity(idTipoDocumentoGeneral);
					
					//tipodocumentogeneralLogic.getEntityWithConnection(idTipoDocumentoGeneral);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodocumentogeneralLogic.setTipoDocumentoGenerals(new ArrayList<TipoDocumentoGeneral>());
					tipodocumentogeneralLogic.getTipoDocumentoGenerals().add(tipodocumentogeneralLogic.getTipoDocumentoGeneral());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodocumentogenerals=new ArrayList<TipoDocumentoGeneral>();
					this.tipodocumentogenerals.add(tipodocumentogeneral);
				}
				
				if(tipodocumentogeneralLogic.getTipoDocumentoGeneral()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TipoDocumentoGeneralConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipodocumentogeneralLogic.getTipoDocumentoGeneralsBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDocumentoGeneralConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDocumentoGeneralConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipodocumentogeneralLogic.getTipoDocumentoGenerals()==null||tipodocumentogeneralLogic.getTipoDocumentoGenerals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipodocumentogenerals==null|| tipodocumentogenerals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentogeneralsAux=new ArrayList<TipoDocumentoGeneral>();
						tipodocumentogeneralsAux.addAll(tipodocumentogeneralLogic.getTipoDocumentoGenerals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodocumentogeneralsAux=new ArrayList<TipoDocumentoGeneral>();
							tipodocumentogeneralsAux.addAll(tipodocumentogenerals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipodocumentogeneralLogic.getTipoDocumentoGeneralsBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDocumentoGeneralConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDocumentoGeneralConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoDocumentoGenerals("BusquedaPorCodigo",tipodocumentogeneralLogic.getTipoDocumentoGenerals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoDocumentoGenerals("BusquedaPorCodigo",tipodocumentogenerals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentogeneralLogic.setTipoDocumentoGenerals(new ArrayList<TipoDocumentoGeneral>());
						tipodocumentogeneralLogic.getTipoDocumentoGenerals().addAll(tipodocumentogeneralsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodocumentogenerals=new ArrayList<TipoDocumentoGeneral>();
							tipodocumentogenerals.addAll(tipodocumentogeneralsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorId")) {
				this.sDetalleReporte=TipoDocumentoGeneralConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipodocumentogeneralLogic.getTipoDocumentoGeneralsBusquedaPorId(finalQueryGlobal,pagination,idBusquedaPorId);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDocumentoGeneralConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDocumentoGeneralConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipodocumentogeneralLogic.getTipoDocumentoGenerals()==null||tipodocumentogeneralLogic.getTipoDocumentoGenerals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipodocumentogenerals==null|| tipodocumentogenerals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentogeneralsAux=new ArrayList<TipoDocumentoGeneral>();
						tipodocumentogeneralsAux.addAll(tipodocumentogeneralLogic.getTipoDocumentoGenerals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodocumentogeneralsAux=new ArrayList<TipoDocumentoGeneral>();
							tipodocumentogeneralsAux.addAll(tipodocumentogenerals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipodocumentogeneralLogic.getTipoDocumentoGeneralsBusquedaPorId(finalQueryGlobal,pagination,idBusquedaPorId);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDocumentoGeneralConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDocumentoGeneralConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoDocumentoGenerals("BusquedaPorId",tipodocumentogeneralLogic.getTipoDocumentoGenerals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoDocumentoGenerals("BusquedaPorId",tipodocumentogenerals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentogeneralLogic.setTipoDocumentoGenerals(new ArrayList<TipoDocumentoGeneral>());
						tipodocumentogeneralLogic.getTipoDocumentoGenerals().addAll(tipodocumentogeneralsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodocumentogenerals=new ArrayList<TipoDocumentoGeneral>();
							tipodocumentogenerals.addAll(tipodocumentogeneralsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoDocumentoGeneralConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipodocumentogeneralLogic.getTipoDocumentoGeneralsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDocumentoGeneralConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDocumentoGeneralConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipodocumentogeneralLogic.getTipoDocumentoGenerals()==null||tipodocumentogeneralLogic.getTipoDocumentoGenerals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipodocumentogenerals==null|| tipodocumentogenerals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentogeneralsAux=new ArrayList<TipoDocumentoGeneral>();
						tipodocumentogeneralsAux.addAll(tipodocumentogeneralLogic.getTipoDocumentoGenerals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodocumentogeneralsAux=new ArrayList<TipoDocumentoGeneral>();
							tipodocumentogeneralsAux.addAll(tipodocumentogenerals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipodocumentogeneralLogic.getTipoDocumentoGeneralsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDocumentoGeneralConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDocumentoGeneralConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoDocumentoGenerals("BusquedaPorNombre",tipodocumentogeneralLogic.getTipoDocumentoGenerals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoDocumentoGenerals("BusquedaPorNombre",tipodocumentogenerals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentogeneralLogic.setTipoDocumentoGenerals(new ArrayList<TipoDocumentoGeneral>());
						tipodocumentogeneralLogic.getTipoDocumentoGenerals().addAll(tipodocumentogeneralsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodocumentogenerals=new ArrayList<TipoDocumentoGeneral>();
							tipodocumentogenerals.addAll(tipodocumentogeneralsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoDocumentoGeneral();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoDocumentoGeneral();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipodocumentogeneralLogic.getTipoDocumentoGenerals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodocumentogenerals.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipodocumentogeneralLogic.getTipoDocumentoGenerals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodocumentogenerals.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoDocumentoGeneral tipodocumentogeneral) {
		Boolean permite=true;
		
		if(this.tipodocumentogeneral.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoDocumentoGeneralConstantesFunciones.getOrderByListaTipoDocumentoGeneral();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoDocumentoGeneralConstantesFunciones.getOrderByListaTipoDocumentoGeneral();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDocumentoGeneral tipodocumentogeneral:tipodocumentogeneralLogic.getTipoDocumentoGenerals()) {
				if(tipodocumentogeneral.getsType().equals(Constantes2.S_TOTALES)) {
					tipodocumentogeneralTotales=tipodocumentogeneral;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDocumentoGeneral tipodocumentogeneral:this.tipodocumentogenerals) {
				if(tipodocumentogeneral.getsType().equals(Constantes2.S_TOTALES)) {
					tipodocumentogeneralTotales=tipodocumentogeneral;
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
			this.tipodocumentogeneralAux=new TipoDocumentoGeneral();
			this.tipodocumentogeneralAux.setsType(Constantes2.S_TOTALES);
			this.tipodocumentogeneralAux.setIsNew(false);
			this.tipodocumentogeneralAux.setIsChanged(false);
			this.tipodocumentogeneralAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoDocumentoGeneralConstantesFunciones.TotalizarValoresFilaTipoDocumentoGeneral(this.tipodocumentogeneralLogic.getTipoDocumentoGenerals(),this.tipodocumentogeneralAux);
				
				this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().add(this.tipodocumentogeneralAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoDocumentoGeneralConstantesFunciones.TotalizarValoresFilaTipoDocumentoGeneral(this.tipodocumentogenerals,this.tipodocumentogeneralAux);
				
				this.tipodocumentogenerals.add(this.tipodocumentogeneralAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipodocumentogeneralTotales=new TipoDocumentoGeneral();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().remove(tipodocumentogeneralTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipodocumentogenerals.remove(tipodocumentogeneralTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipodocumentogeneralTotales=new TipoDocumentoGeneral();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDocumentoGeneral tipodocumentogeneral:tipodocumentogeneralLogic.getTipoDocumentoGenerals()) {
				if(tipodocumentogeneral.getsType().equals(Constantes2.S_TOTALES)) {
					tipodocumentogeneralTotales=tipodocumentogeneral;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoDocumentoGeneralConstantesFunciones.TotalizarValoresFilaTipoDocumentoGeneral(this.tipodocumentogeneralLogic.getTipoDocumentoGenerals(),tipodocumentogeneralTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDocumentoGeneral tipodocumentogeneral:this.tipodocumentogenerals) {
				if(tipodocumentogeneral.getsType().equals(Constantes2.S_TOTALES)) {
					tipodocumentogeneralTotales=tipodocumentogeneral;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoDocumentoGeneralConstantesFunciones.TotalizarValoresFilaTipoDocumentoGeneral(this.tipodocumentogenerals,tipodocumentogeneralTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoDocumentoGeneralsBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoDocumentoGeneralsBusquedaPorId()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorId";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoDocumentoGeneralsBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoDocumentoGeneralsBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodocumentogeneralLogic.getTipoDocumentoGeneralsBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoDocumentoGeneralsBusquedaPorId(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodocumentogeneralLogic.getTipoDocumentoGeneralsBusquedaPorId(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoDocumentoGeneralsBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodocumentogeneralLogic.getTipoDocumentoGeneralsBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
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
	
	public void inicializarPermisosTipoDocumentoGeneral() {
		this.isPermisoTodoTipoDocumentoGeneral=false;
		this.isPermisoNuevoTipoDocumentoGeneral=false;
		this.isPermisoActualizarTipoDocumentoGeneral=false;
		this.isPermisoActualizarOriginalTipoDocumentoGeneral=false;
		this.isPermisoEliminarTipoDocumentoGeneral=false;
		this.isPermisoGuardarCambiosTipoDocumentoGeneral=false;
		this.isPermisoConsultaTipoDocumentoGeneral=false;
		this.isPermisoBusquedaTipoDocumentoGeneral=false;
		this.isPermisoReporteTipoDocumentoGeneral=false;		
		this.isPermisoOrdenTipoDocumentoGeneral=false;		
		this.isPermisoPaginacionMedioTipoDocumentoGeneral=false;		
		this.isPermisoPaginacionAltoTipoDocumentoGeneral=false;
		this.isPermisoPaginacionTodoTipoDocumentoGeneral=false;
		this.isPermisoCopiarTipoDocumentoGeneral=false;		
		this.isPermisoVerFormTipoDocumentoGeneral=false;		
		this.isPermisoDuplicarTipoDocumentoGeneral=false;		
		this.isPermisoOrdenTipoDocumentoGeneral=false;		
	}
	
	public void setPermisosUsuarioTipoDocumentoGeneral(Boolean isPermiso) {
		this.isPermisoTodoTipoDocumentoGeneral=isPermiso;
		this.isPermisoNuevoTipoDocumentoGeneral=isPermiso;
		this.isPermisoActualizarTipoDocumentoGeneral=isPermiso;
		this.isPermisoActualizarOriginalTipoDocumentoGeneral=isPermiso;
		this.isPermisoEliminarTipoDocumentoGeneral=isPermiso;
		this.isPermisoGuardarCambiosTipoDocumentoGeneral=isPermiso;
		this.isPermisoConsultaTipoDocumentoGeneral=isPermiso;
		this.isPermisoBusquedaTipoDocumentoGeneral=isPermiso;
		this.isPermisoReporteTipoDocumentoGeneral=isPermiso;
		this.isPermisoOrdenTipoDocumentoGeneral=isPermiso;		
		this.isPermisoPaginacionMedioTipoDocumentoGeneral=isPermiso;		
		this.isPermisoPaginacionAltoTipoDocumentoGeneral=isPermiso;		
		this.isPermisoPaginacionTodoTipoDocumentoGeneral=isPermiso;		
		this.isPermisoCopiarTipoDocumentoGeneral=isPermiso;		
		this.isPermisoVerFormTipoDocumentoGeneral=isPermiso;		
		this.isPermisoDuplicarTipoDocumentoGeneral=isPermiso;
		this.isPermisoOrdenTipoDocumentoGeneral=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoDocumentoGeneral(Boolean isPermiso) {
		//this.isPermisoTodoTipoDocumentoGeneral=isPermiso;
		this.isPermisoNuevoTipoDocumentoGeneral=isPermiso;
		this.isPermisoActualizarTipoDocumentoGeneral=isPermiso;
		this.isPermisoActualizarOriginalTipoDocumentoGeneral=isPermiso;
		this.isPermisoEliminarTipoDocumentoGeneral=isPermiso;
		this.isPermisoGuardarCambiosTipoDocumentoGeneral=isPermiso;
		//this.isPermisoConsultaTipoDocumentoGeneral=isPermiso;
		//this.isPermisoBusquedaTipoDocumentoGeneral=isPermiso;
		//this.isPermisoReporteTipoDocumentoGeneral=isPermiso;
		//this.isPermisoOrdenTipoDocumentoGeneral=isPermiso;		
		//this.isPermisoPaginacionMedioTipoDocumentoGeneral=isPermiso;		
		//this.isPermisoPaginacionAltoTipoDocumentoGeneral=isPermiso;		
		//this.isPermisoPaginacionTodoTipoDocumentoGeneral=isPermiso;		
		//this.isPermisoCopiarTipoDocumentoGeneral=isPermiso;		
		//this.isPermisoDuplicarTipoDocumentoGeneral=isPermiso;
		//this.isPermisoOrdenTipoDocumentoGeneral=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoDocumentoGeneralClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoDocumentoGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoDocumentoGeneral(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoDocumentoGeneralClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoDocumentoGeneralClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoDocumentoGeneralClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoDocumentoGeneralClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoDocumentoGeneral() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoDocumentoGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoDocumentoGeneralConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoDocumentoGeneral=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoDocumentoGeneral=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoDocumentoGeneral=this.isPermisoActualizarTipoDocumentoGeneral;
			this.isPermisoEliminarTipoDocumentoGeneral=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoDocumentoGeneral=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoDocumentoGeneral=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoDocumentoGeneral=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoDocumentoGeneral=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoDocumentoGeneral=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoDocumentoGeneral=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoDocumentoGeneral=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoDocumentoGeneral=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoDocumentoGeneral=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoDocumentoGeneral=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoDocumentoGeneral=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoDocumentoGeneral=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoDocumentoGeneral=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoDocumentoGeneral.setToolTipText(this.jTableDatosTipoDocumentoGeneral.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoDocumentoGeneral(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoDocumentoGeneral(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoDocumentoGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoDocumentoGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoDocumentoGeneral() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoDocumentoGeneralListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoDocumentoGeneralListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoDocumentoGeneralJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoDocumentoGeneralListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoDocumentoGeneralListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoDocumentoGeneral()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoDocumentoGeneral()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoDocumentoGeneral(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoDocumentoGeneral()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDocumentoGeneral();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoDocumentoGeneral(TipoDocumentoGeneral tipodocumentogeneral)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoDocumentoGeneral(TipoDocumentoGeneral tipodocumentogeneral,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoDocumentoGeneral()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDocumentoGeneral()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoDocumentoGeneral()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoDocumentoGeneral()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoDocumentoGeneral()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoDocumentoGeneral()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoDocumentoGeneral(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoDocumentoGeneral()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoDocumentoGeneralBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoDocumentoGeneralBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoDocumentoGeneralBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipodocumentogeneralSessionBean=new TipoDocumentoGeneralSessionBean(); 
		this.tipodocumentogeneralConstantesFunciones=new TipoDocumentoGeneralConstantesFunciones(); 
		this.tipodocumentogeneralBean=new TipoDocumentoGeneral();//(this.tipodocumentogeneralConstantesFunciones); 		
		this.tipodocumentogeneralReturnGeneral=new TipoDocumentoGeneralParameterReturnGeneral(); 
		
		this.tipodocumentogeneralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodocumentogeneralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoDocumentoGeneralBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoDocumentoGeneralBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoDocumentoGeneralBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoDocumentoGeneral(true);
			
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
			
			this.tipodocumentogeneralConstantesFunciones=new TipoDocumentoGeneralConstantesFunciones(); 
			this.tipodocumentogeneralBean=new TipoDocumentoGeneral();//this.tipodocumentogeneralConstantesFunciones); 			
			this.tipodocumentogeneralReturnGeneral=new TipoDocumentoGeneralParameterReturnGeneral(); 
		
			TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Documento General Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipodocumentogeneral=new TipoDocumentoGeneral();
			this.tipodocumentogenerals = new ArrayList<TipoDocumentoGeneral>();
			this.tipodocumentogeneralsAux = new ArrayList<TipoDocumentoGeneral>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic=new TipoDocumentoGeneralLogic();
				this.tipodocumentogeneralLogic.getNewConnexionToDeep("");
			}
			
			//this.tipodocumentogeneralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipodocumentogeneralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoDocumentoGeneral);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoDocumentoGeneral!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoDocumentoGeneral);	
					}
					
					if(this.jInternalFrameImportacionTipoDocumentoGeneral!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoDocumentoGeneral);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoDocumentoGeneral!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoDocumentoGeneral);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoDocumentoGeneral);
				this.jInternalFrameDetalleFormTipoDocumentoGeneral.setVisible(false);
				this.jInternalFrameDetalleFormTipoDocumentoGeneral.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoDocumentoGeneral!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoDocumentoGeneral);
					this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoDocumentoGeneral!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoDocumentoGeneral);
					this.jInternalFrameImportacionTipoDocumentoGeneral.setVisible(false);
					this.jInternalFrameImportacionTipoDocumentoGeneral.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoDocumentoGeneral!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoDocumentoGeneral);
					this.jInternalFrameOrderByTipoDocumentoGeneral.setVisible(false);
					this.jInternalFrameOrderByTipoDocumentoGeneral.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoDocumentoGeneralActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoDocumentoGeneralConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipodocumentogeneralReturnGeneral=new TipoDocumentoGeneralParameterReturnGeneral();
			
			this.tipodocumentogeneralParameterGeneral=new TipoDocumentoGeneralParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipodocumentogeneralLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoDocumentoGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoDocumentoGeneralConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado(),this.tipodocumentogeneralSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoDocumentoGeneralConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado(),this.tipodocumentogeneralSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaDuplicarTipoDocumentoGeneral=true;
			this.isVisibilidadCeldaCopiarTipoDocumentoGeneral=true;
			this.isVisibilidadCeldaVerFormTipoDocumentoGeneral=true;
			this.isVisibilidadCeldaOrdenTipoDocumentoGeneral=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaModificarTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaActualizarTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaEliminarTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaCancelarTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaGuardarTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDocumentoGeneral=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorId=true;
			this.isVisibilidadBusquedaPorNombre=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoDocumentoGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoDocumentoGeneral();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoDocumentoGeneral(false);
			
			this.setPermisosUsuarioTipoDocumentoGeneral();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado() 
				|| (this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado() && this.tipodocumentogeneralSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoDocumentoGeneralClasesRelacionadas();
			}
			
			if(this.tipodocumentogeneralSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoDocumentoGeneralClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoDocumentoGeneralJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoDocumentoGeneral();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoDocumentoGeneral();
			}
			
			if(!this.isPermisoBusquedaTipoDocumentoGeneral) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoDocumentoGeneral.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoDocumentoGeneral,this.isPermisoPaginacionMedioTipoDocumentoGeneral,this.isPermisoPaginacionTodoTipoDocumentoGeneral);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoDocumentoGeneralConstantesFunciones.getTiposSeleccionarTipoDocumentoGeneral());
				
				this.tiposColumnasSelect=TipoDocumentoGeneralConstantesFunciones.getTiposSeleccionarTipoDocumentoGeneral(true);
				
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
			//if(!this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoDocumentoGeneral();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoDocumentoGeneral(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoDocumentoGeneral(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDocumentoGeneral() ;
			
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
				tipodocumentogeneralImplementable= (TipoDocumentoGeneralImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoDocumentoGeneralConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipodocumentogeneralImplementableHome= (TipoDocumentoGeneralImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoDocumentoGeneralConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipodocumentogenerals= new ArrayList<TipoDocumentoGeneral>();
			this.tipodocumentogeneralsEliminados= new ArrayList<TipoDocumentoGeneral>();
						
			this.isEsNuevoTipoDocumentoGeneral=false;
			this.esParaAccionDesdeFormularioTipoDocumentoGeneral=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoDocumentoGeneral(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoDocumentoGeneral();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoDocumentoGeneralConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoDocumentoGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoDocumentoGeneral(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoDocumentoGeneral();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoDocumentoGeneral();
			}
			
			TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoDocumentoGeneral.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoDocumentoGeneral.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoDocumentoGeneral.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoDocumentoGeneral(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoDocumentoGeneral: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoDocumentoGeneral() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoDocumentoGeneral")) {
				iIndex=this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTabbedPaneRelacionesTipoDocumentoGeneral.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTabbedPaneRelacionesTipoDocumentoGeneral.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoDocumentoGeneral.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoDocumentoGeneral();	
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
	
	public void cargarCombosForeignKeyTipoDocumentoGeneral(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoDocumentoGeneral(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoDocumentoGeneral(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoDocumentoGeneralListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoDocumentoGeneral();
		
		this.cargarCombosFrameForeignKeyTipoDocumentoGeneral();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoDocumentoGeneral();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoDocumentoGeneral();
		}
	}
	
	
	
	public void jButtonNuevoTipoDocumentoGeneralActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipodocumentogeneralSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoDocumentoGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
			
			
			if(jTableDatosTipoDocumentoGeneral.getRowCount()>=1) {
				jTableDatosTipoDocumentoGeneral.removeRowSelectionInterval(0, jTableDatosTipoDocumentoGeneral.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoDocumentoGeneral=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoDocumentoGeneral(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoDocumentoGeneral(true);			
			//this.tipodocumentogeneral=new TipoDocumentoGeneral();
			//this.tipodocumentogeneral.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDocumentoGeneral(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDocumentoGeneral() ;
			
			if(TipoDocumentoGeneralJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDocumentoGeneral(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipodocumentogeneral);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentogeneral);				
			
			TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
			
			if(this.tipodocumentogeneralSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoDocumentoGeneral: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoDocumentoGeneralActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoDocumentoGeneral> tipodocumentogeneralsSeleccionados=new ArrayList<TipoDocumentoGeneral>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoDocumentoGeneral.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoDocumentoGeneral.getSelectedRows().length;			
			}
			
			tipodocumentogeneralsSeleccionados=this.getTipoDocumentoGeneralsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoDocumentoGeneral--;			
				//TipoDocumentoGeneral tipodocumentogeneralAux= new TipoDocumentoGeneral();			
				//tipodocumentogeneralAux.setId(this.iIdNuevoTipoDocumentoGeneral);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoDocumentoGeneral tipodocumentogeneralOrigen=new TipoDocumentoGeneral();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoDocumentoGeneral tipodocumentogeneralOrigen : tipodocumentogeneralsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoDocumentoGeneral.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipodocumentogeneralOrigen =(TipoDocumentoGeneral) this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodocumentogeneralOrigen =(TipoDocumentoGeneral) this.tipodocumentogenerals.toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoDocumentoGeneral();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipodocumentogeneral.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoDocumentoGeneral(tipodocumentogeneralOrigen,this.tipodocumentogeneral,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoGeneral(this.tipodocumentogeneral);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().add(this.tipodocumentogeneralAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipodocumentogenerals.add(this.tipodocumentogeneralAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoDocumentoGeneral(false);
				
				this.jTableDatosTipoDocumentoGeneral.setRowSelectionInterval(this.getIndiceNuevoTipoDocumentoGeneral(), this.getIndiceNuevoTipoDocumentoGeneral());
				
				int iLastRow =  this.jTableDatosTipoDocumentoGeneral.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoDocumentoGeneral.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoDocumentoGeneral.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDocumentoGeneral(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoDocumentoGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoDocumentoGeneral> tipodocumentogeneralsSeleccionados=new ArrayList<TipoDocumentoGeneral>();									
		
			TipoDocumentoGeneral tipodocumentogeneralOrigen=new TipoDocumentoGeneral();
			TipoDocumentoGeneral tipodocumentogeneralDestino=new TipoDocumentoGeneral();
				
			tipodocumentogeneralsSeleccionados=this.getTipoDocumentoGeneralsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoDocumentoGeneral.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipodocumentogeneralsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoDocumentoGeneral.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentogeneralOrigen =(TipoDocumentoGeneral) this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipodocumentogeneralOrigen =(TipoDocumentoGeneral) this.tipodocumentogenerals.toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodocumentogeneralDestino =(TipoDocumentoGeneral) this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipodocumentogeneralDestino =(TipoDocumentoGeneral) this.tipodocumentogenerals.toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipodocumentogeneralOrigen =tipodocumentogeneralsSeleccionados.get(0);
				tipodocumentogeneralDestino =tipodocumentogeneralsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoDocumentoGeneral(tipodocumentogeneralOrigen,tipodocumentogeneralDestino,true,false);
				
				tipodocumentogeneralDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipodocumentogeneralDestino,tipodocumentogeneralLogic.getTipoDocumentoGenerals());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodocumentogeneralDestino,tipodocumentogenerals);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoDocumentoGeneral(false);
				
				//this.jTableDatosTipoDocumentoGeneral.setRowSelectionInterval(this.getIndiceNuevoTipoDocumentoGeneral(), this.getIndiceNuevoTipoDocumentoGeneral());
				
				int iLastRow =  this.jTableDatosTipoDocumentoGeneral.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoDocumentoGeneral.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoDocumentoGeneral.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDocumentoGeneral(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoDocumentoGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoDocumentoGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoDocumentoGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoDocumentoGeneral.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoDocumentoGeneral.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoDocumentoGeneral.setVisible(!isVisible);
			this.jPanelPaginacionTipoDocumentoGeneral.setVisible(!isVisible);
			this.jPanelAccionesTipoDocumentoGeneral.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoDocumentoGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoDocumentoGeneral();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoDocumentoGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoDocumentoGeneral();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoDocumentoGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoDocumentoGeneral();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoDocumentoGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoDocumentoGeneral();
			
			this.abrirFrameOrderByTipoDocumentoGeneral();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoDocumentoGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoDocumentoGeneral();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoDocumentoGeneral(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoDocumentoGeneral);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoDocumentoGeneral.isMaximum()) {
					this.jInternalFrameDetalleFormTipoDocumentoGeneral.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoDocumentoGeneral.setSize(this.jInternalFrameDetalleFormTipoDocumentoGeneral.iWidthFormulario,this.jInternalFrameDetalleFormTipoDocumentoGeneral.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoDocumentoGeneral.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoDocumentoGeneral.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoDocumentoGeneral.isMaximum()) {
						this.jInternalFrameDetalleFormTipoDocumentoGeneral.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoDocumentoGeneral.jContentPaneDetalleTipoDocumentoGeneral.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTabbedPaneRelacionesTipoDocumentoGeneral.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoDocumentoGeneral.jContentPaneDetalleTipoDocumentoGeneral.getWidth(),TipoDocumentoGeneralConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTabbedPaneRelacionesTipoDocumentoGeneral.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoDocumentoGeneral.jContentPaneDetalleTipoDocumentoGeneral.getWidth(),TipoDocumentoGeneralConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTabbedPaneRelacionesTipoDocumentoGeneral.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoDocumentoGeneral.jContentPaneDetalleTipoDocumentoGeneral.getWidth(),TipoDocumentoGeneralConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoDocumentoGeneral.setVisible(true);
	        this.jInternalFrameDetalleFormTipoDocumentoGeneral.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoDocumentoGeneral() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoDocumentoGeneral==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoDocumentoGeneral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDocumentoGeneral,false,this);
				} else {
					this.jInternalFrameOrderByTipoDocumentoGeneral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDocumentoGeneral,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoDocumentoGeneral);
				this.jInternalFrameOrderByTipoDocumentoGeneral.setVisible(false);
				this.jInternalFrameOrderByTipoDocumentoGeneral.setSelected(false);
				
				this.jInternalFrameOrderByTipoDocumentoGeneral.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoDocumentoGeneral"));
				
				this.inicializarActualizarBindingTablaOrderByTipoDocumentoGeneral();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoDocumentoGeneral() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoDocumentoGeneral==null) {
				
				this.jInternalFrameImportacionTipoDocumentoGeneral=new ImportacionJInternalFrame(TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoDocumentoGeneral);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoDocumentoGeneral);
				this.jInternalFrameImportacionTipoDocumentoGeneral.setVisible(false);
				this.jInternalFrameImportacionTipoDocumentoGeneral.setSelected(false);


				this.jInternalFrameImportacionTipoDocumentoGeneral.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoDocumentoGeneral"));
				this.jInternalFrameImportacionTipoDocumentoGeneral.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoDocumentoGeneral"));
				this.jInternalFrameImportacionTipoDocumentoGeneral.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoDocumentoGeneral"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoDocumentoGeneral() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoDocumentoGeneral==null) {
				this.jInternalFrameReporteDinamicoTipoDocumentoGeneral=new ReporteDinamicoJInternalFrame(TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoDocumentoGeneral);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoDocumentoGeneral);
				this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDocumentoGeneral"));
				this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDocumentoGeneral"));
				this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDocumentoGeneral"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDocumentoGeneral();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoDocumentoGeneral() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoDocumentoGeneral);
			
	       	this.jInternalFrameDetalleFormTipoDocumentoGeneral.setVisible(false);
	        this.jInternalFrameDetalleFormTipoDocumentoGeneral.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoDocumentoGeneral.dispose();
			//this.jInternalFrameDetalleFormTipoDocumentoGeneral=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoDocumentoGeneral() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoDocumentoGeneral() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoDocumentoGeneral.setVisible(true);
	        this.jInternalFrameImportacionTipoDocumentoGeneral.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoDocumentoGeneral() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoDocumentoGeneral.setVisible(true);
	        this.jInternalFrameOrderByTipoDocumentoGeneral.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoDocumentoGeneral() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoDocumentoGeneral.setVisible(false);
	        this.jInternalFrameOrderByTipoDocumentoGeneral.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoDocumentoGeneral() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoDocumentoGeneral() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoDocumentoGeneral.setVisible(false);
	        this.jInternalFrameImportacionTipoDocumentoGeneral.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoDocumentoGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoDocumentoGeneral(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoDocumentoGeneral(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoDocumentoGeneral.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoDocumentoGeneral(true);
			//this.isEsNuevoTipoDocumentoGeneral=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneral =(TipoDocumentoGeneral) this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodocumentogeneral =(TipoDocumentoGeneral) this.tipodocumentogenerals.toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoDocumentoGeneral("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDocumentoGeneral(false) ;
			
			if(tipodocumentogeneralSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoDocumentoGeneralJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDocumentoGeneral(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDocumentoGeneral(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoDocumentoGeneralActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoDocumentoGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentogeneral =(TipoDocumentoGeneral) this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodocumentogeneral =(TipoDocumentoGeneral) this.tipodocumentogenerals.toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoDocumentoGeneral(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoDocumentoGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoDocumentoGeneral.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoDocumentoGeneral(true);
			//this.isEsNuevoTipoDocumentoGeneral=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneral =(TipoDocumentoGeneral) this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodocumentogeneral =(TipoDocumentoGeneral) this.tipodocumentogenerals.toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipodocumentogeneral.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoDocumentoGeneral("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoDocumentoGeneral(false) ;
			
			if(TipoDocumentoGeneralJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDocumentoGeneral(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDocumentoGeneral(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoDocumentoGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoDocumentoGeneral(false);
			
			//if(!this.isEsNuevoTipoDocumentoGeneral) {								
				int intSelectedRow = this.jTableDatosTipoDocumentoGeneral.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentogeneral =(TipoDocumentoGeneral) this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodocumentogeneral =(TipoDocumentoGeneral) this.tipodocumentogenerals.toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoDocumentoGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoDocumentoGeneral(this.tipodocumentogeneral,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoGeneral(this.tipodocumentogeneral);
				
			}
			
			if(this.permiteMantenimiento(this.tipodocumentogeneral)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoDocumentoGeneral=true;
					this.inicializarActualizarBindingTablaTipoDocumentoGeneral(false);
					this.isEsNuevoTipoDocumentoGeneral=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoDocumentoGeneral=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoDocumentoGeneral=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoDocumentoGeneral(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDocumentoGeneral(false);
				
				this.habilitarDeshabilitarControlesTipoDocumentoGeneral(false);
			
												
				
				if(TipoDocumentoGeneralJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoDocumentoGeneral();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoDocumentoGeneralActionPerformed(evt,tipodocumentogeneralSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoDocumentoGeneral(this.tipodocumentogeneral,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoDocumentoGeneral.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipodocumentogeneralSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipodocumentogeneral.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoDocumentoGeneral.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumentoGeneral.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoDocumentoGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoDocumentoGeneral.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneral =(TipoDocumentoGeneral) this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
				this.tipodocumentogeneral.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodocumentogeneral =(TipoDocumentoGeneral) this.tipodocumentogenerals.toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
				this.tipodocumentogeneral.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipodocumentogeneral)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoDocumentoGeneralModel) this.jTableDatosTipoDocumentoGeneral.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoDocumentoGeneral=true;
				this.inicializarActualizarBindingTablaTipoDocumentoGeneral(false);
				this.isEsNuevoTipoDocumentoGeneral=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoDocumentoGeneral(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDocumentoGeneral(false);
				
				this.habilitarDeshabilitarControlesTipoDocumentoGeneral(false);
				
				
				
				if(TipoDocumentoGeneralJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoDocumentoGeneral();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoDocumentoGeneralActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoDocumentoGeneral.getRowCount()>=1) {
				jTableDatosTipoDocumentoGeneral.removeRowSelectionInterval(0, jTableDatosTipoDocumentoGeneral.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoDocumentoGeneral(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoDocumentoGeneral(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDocumentoGeneral(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDocumentoGeneral(false) ;
			
			this.isEsNuevoTipoDocumentoGeneral=false;
			
			if(TipoDocumentoGeneralJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoDocumentoGeneral();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoDocumentoGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoDocumentoGeneral(false);
				
				//SI ES MANUAL
				if(TipoDocumentoGeneralJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoDocumentoGeneral();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoDocumentoGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoDocumentoGeneral--;			
			//TipoDocumentoGeneral tipodocumentogeneralAux= new TipoDocumentoGeneral();			
			//tipodocumentogeneralAux.setId(this.iIdNuevoTipoDocumentoGeneral);
			
			if(this.jInternalFrameDetalleFormTipoDocumentoGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoDocumentoGeneral();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoGeneral(this.tipodocumentogeneral);
			
			this.tipodocumentogeneral.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().add(this.tipodocumentogeneralAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipodocumentogenerals.add(this.tipodocumentogeneralAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoDocumentoGeneral(false);
			
			this.jTableDatosTipoDocumentoGeneral.setRowSelectionInterval(this.getIndiceNuevoTipoDocumentoGeneral(), this.getIndiceNuevoTipoDocumentoGeneral());
			
			int iLastRow =  this.jTableDatosTipoDocumentoGeneral.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoDocumentoGeneral.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoDocumentoGeneral.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoDocumentoGeneral(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoDocumentoGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoDocumentoGeneral(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDocumentoGeneral(false);
			
			//SI ES MANUAL
			if(TipoDocumentoGeneralJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDocumentoGeneral();
			}
			
			//this.abrirFrameTreeTipoDocumentoGeneral();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoDocumentoGeneralActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Documento GeneralS ?", "MANTENIMIENTO DE Tipo Documento General", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoDocumentoGeneral.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoDocumentoGeneral();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipodocumentogeneralReturnGeneral=tipodocumentogeneralLogic.procesarImportacionTipoDocumentoGeneralsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipodocumentogeneralParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoDocumentoGeneralReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoDocumentoGeneralActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoDocumentoGeneral.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoDocumentoGeneral.setFileImportacion(this.jInternalFrameImportacionTipoDocumentoGeneral.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoDocumentoGeneral.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoDocumentoGeneral.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoDocumentoGeneral.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoDocumentoGeneral.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoDocumentoGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoDocumentoGeneral> tipodocumentogeneralsSeleccionados=new ArrayList<TipoDocumentoGeneral>();		

		tipodocumentogeneralsSeleccionados=this.getTipoDocumentoGeneralsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoDocumentoGeneralBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoDocumentoGeneralBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoDocumentoGenerals("Todos",tipodocumentogeneralsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Documento General",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoDocumentoGeneralConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDocumentoGeneralConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoDocumentoGeneralConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoDocumentoGeneralConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoDocumentoGeneralConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoDocumentoGeneralConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoDocumentoGeneralConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoDocumentoGeneralConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoDocumentoGeneralActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoDocumentoGeneral> tipodocumentogeneralsSeleccionados=new ArrayList<TipoDocumentoGeneral>();		
		
		tipodocumentogeneralsSeleccionados=this.getTipoDocumentoGeneralsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodocumentogeneral";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoDocumentoGenerals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoDocumentoGeneralConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDocumentoGeneralConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoDocumentoGeneral tipodocumentogeneral:tipodocumentogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodocumentogeneral.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDocumentoGeneralConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDocumentoGeneralConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoDocumentoGeneral tipodocumentogeneral:tipodocumentogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodocumentogeneral.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoDocumentoGeneral(row);				
			//	iRow++;
			//}				
			
			//for(TipoDocumentoGeneral tipodocumentogeneralAux:tipodocumentogeneralsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoDocumentoGeneral(tipodocumentogeneralAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Documento General",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipodocumentogeneralLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDocumentoGeneral(false);
			
			//SI ES MANUAL
			if(TipoDocumentoGeneralJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDocumentoGeneral();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoDocumentoGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDocumentoGeneral(false);
			
			//SI ES MANUAL
			if(TipoDocumentoGeneralJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoDocumentoGeneral();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoDocumentoGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDocumentoGeneral(false);
			
			//SI ES MANUAL
			if(TipoDocumentoGeneralJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoDocumentoGeneral();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoDocumentoGeneral() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoDocumentoGeneral.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoDocumentoGeneral.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoDocumentoGeneral.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoDocumentoGeneral.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoDocumentoGeneral.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoDocumentoGeneral.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoDocumentoGeneral.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoDocumentoGeneral(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoDocumentoGeneral(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoDocumentoGeneral(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoDocumentoGeneral(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoDocumentoGeneral(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoDocumentoGeneral(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDocumentoGeneral(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoDocumentoGeneral(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoDocumentoGeneralJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoDocumentoGeneralJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoDocumentoGeneral() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoDocumentoGeneral();
		
		this.inicializarActualizarBindingBotonesManualTipoDocumentoGeneral(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoDocumentoGeneral();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDocumentoGeneral() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDocumentoGeneral(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDocumentoGeneral(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoDocumentoGeneral.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoDocumentoGeneral.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoDocumentoGeneral.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoDocumentoGeneral.jCheckBoxPostAccionNuevoTipoDocumentoGeneral.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoDocumentoGeneral.jCheckBoxPostAccionSinCerrarTipoDocumentoGeneral.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoDocumentoGeneral.jCheckBoxPostAccionSinMensajeTipoDocumentoGeneral.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoDocumentoGeneral.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoDocumentoGeneral.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoDocumentoGeneral.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) {
				this.jInternalFrameDetalleFormTipoDocumentoGeneral.jCheckBoxPostAccionNuevoTipoDocumentoGeneral.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoDocumentoGeneral.jCheckBoxPostAccionSinCerrarTipoDocumentoGeneral.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoDocumentoGeneral.jCheckBoxPostAccionSinMensajeTipoDocumentoGeneral.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoDocumentoGeneral.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoDocumentoGeneral.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoDocumentoGeneral.jComboBoxTiposAccionesFormularioTipoDocumentoGeneral.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoDocumentoGeneral.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoDocumentoGeneral!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoDocumentoGeneral.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoDocumentoGeneral.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoDocumentoGeneral.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoDocumentoGeneral.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoDocumentoGeneral!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoDocumentoGeneral.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoDocumentoGeneral.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoDocumentoGeneral(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoDocumentoGeneralJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDocumentoGeneral(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoDocumentoGeneral() throws Exception {
		try	{
			if(TipoDocumentoGeneralJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoDocumentoGeneral();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoDocumentoGeneral() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jComboBoxTiposAccionesFormularioTipoDocumentoGeneral.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jComboBoxTiposAccionesFormularioTipoDocumentoGeneral.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoDocumentoGeneral() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoDocumentoGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoDocumentoGeneral.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoDocumentoGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoDocumentoGeneral.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoDocumentoGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoDocumentoGeneral.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoDocumentoGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoDocumentoGeneral.addItem(reporte);
			}
			
			
			if(!this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoDocumentoGeneral.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoDocumentoGeneral.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoDocumentoGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoDocumentoGeneral.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoDocumentoGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoDocumentoGeneral.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoDocumentoGeneral.jComboBoxTiposAccionesFormularioTipoDocumentoGeneral.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoDocumentoGeneral.jComboBoxTiposAccionesFormularioTipoDocumentoGeneral.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoDocumentoGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoDocumentoGeneral.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoDocumentoGeneral.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDocumentoGeneral();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDocumentoGeneral() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoDocumentoGeneral!=null) {
				this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoDocumentoGeneral!=null) {
				this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoDocumentoGeneral!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoDocumentoGeneral()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoTipoDocumentoGeneral.getText();
		//this.idBusquedaPorId=Long.parseLong(this.jTextFieldidTipoDocumentoGeneralBusquedaPorId.getText());
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoDocumentoGeneral.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoDocumentoGeneral(Boolean esInicializar) throws Exception {				
		if(TipoDocumentoGeneralJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoDocumentoGeneral();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoDocumentoGeneral() throws Exception {
		this.inicializarActualizarBindingTablaTipoDocumentoGeneral(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoDocumentoGeneral() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoDocumentoGeneral.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoDocumentoGeneral.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDocumentoGeneral.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoDocumentoGeneralPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoDocumentoGeneral.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDocumentoGeneral.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoDocumentoGeneralPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoDocumentoGeneralOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDocumentoGeneralOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoDocumentoGeneralPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoDocumentoGeneral.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDocumentoGeneral.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoDocumentoGeneralPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoDocumentoGeneral.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoDocumentoGeneral(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipodocumentogeneralLogic.getTipoDocumentoGenerals().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipodocumentogenerals.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoDocumentoGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoDocumentoGeneral.setModel(new TipoDocumentoGeneralModel(this.tipodocumentogeneralLogic.getTipoDocumentoGenerals(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoDocumentoGeneral.setModel(new TipoDocumentoGeneralModel(this.tipodocumentogenerals,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoDocumentoGeneral!=null && this.jInternalFrameOrderByTipoDocumentoGeneral.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoDocumentoGeneral();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoDocumentoGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDocumentoGeneral,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoDocumentoGeneralPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO,tipodocumentogeneralConstantesFunciones.resaltarSeleccionarTipoDocumentoGeneral,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoDocumentoGeneralConstantesFunciones.SCLASSWEBTITULO,tipodocumentogeneralConstantesFunciones.resaltarSeleccionarTipoDocumentoGeneral,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoDocumentoGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDocumentoGeneral,TipoDocumentoGeneralConstantesFunciones.LABEL_ID));

		if(this.tipodocumentogeneralConstantesFunciones.mostraridTipoDocumentoGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDocumentoGeneralConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipodocumentogeneralConstantesFunciones.resaltaridTipoDocumentoGeneral,this.tipodocumentogeneralConstantesFunciones.activaridTipoDocumentoGeneral,this,true,"idTipoDocumentoGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodocumentogeneralConstantesFunciones.resaltaridTipoDocumentoGeneral,this.tipodocumentogeneralConstantesFunciones.activaridTipoDocumentoGeneral,this,true,"idTipoDocumentoGeneral","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDocumentoGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDocumentoGeneral,TipoDocumentoGeneralConstantesFunciones.LABEL_CODIGO));

		if(this.tipodocumentogeneralConstantesFunciones.mostrarcodigoTipoDocumentoGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDocumentoGeneralConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipodocumentogeneralConstantesFunciones.resaltarcodigoTipoDocumentoGeneral,this.tipodocumentogeneralConstantesFunciones.activarcodigoTipoDocumentoGeneral,this,true,"codigoTipoDocumentoGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodocumentogeneralConstantesFunciones.resaltarcodigoTipoDocumentoGeneral,this.tipodocumentogeneralConstantesFunciones.activarcodigoTipoDocumentoGeneral,this,true,"codigoTipoDocumentoGeneral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TipoDocumentoGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDocumentoGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDocumentoGeneral,TipoDocumentoGeneralConstantesFunciones.LABEL_NOMBRE));

		if(this.tipodocumentogeneralConstantesFunciones.mostrarnombreTipoDocumentoGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDocumentoGeneralConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipodocumentogeneralConstantesFunciones.resaltarnombreTipoDocumentoGeneral,this.tipodocumentogeneralConstantesFunciones.activarnombreTipoDocumentoGeneral,this,true,"nombreTipoDocumentoGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodocumentogeneralConstantesFunciones.resaltarnombreTipoDocumentoGeneral,this.tipodocumentogeneralConstantesFunciones.activarnombreTipoDocumentoGeneral,this,true,"nombreTipoDocumentoGeneral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TipoDocumentoGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoDocumentoGeneral.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoDocumentoGeneral.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoDocumentoGeneral && this.isPermisoGuardarCambiosTipoDocumentoGeneral) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoDocumentoGeneral.addColumn(tableColumn);
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
			
			this.jTableDatosTipoDocumentoGeneral.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoDocumentoGeneral && this.isPermisoGuardarCambiosTipoDocumentoGeneral) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoDocumentoGeneral && this.isPermisoGuardarCambiosTipoDocumentoGeneral) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoDocumentoGeneral.moveColumn(this.jTableDatosTipoDocumentoGeneral.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoDocumentoGeneral.moveColumn(this.jTableDatosTipoDocumentoGeneral.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoDocumentoGeneral.moveColumn(this.jTableDatosTipoDocumentoGeneral.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoDocumentoGeneral.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoDocumentoGeneral.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoDocumentoGeneral,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoDocumentoGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoDocumentoGeneral.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoDocumentoGeneral.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoDocumentoGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoDocumentoGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoDocumentoGeneral.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoDocumentoGeneral.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoDocumentoGeneral.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipodocumentogeneralLogic.getTipoDocumentoGenerals().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipodocumentogenerals.size()-1;
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
		//this.jTableDatosTipoDocumentoGeneral.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoDocumentoGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoDocumentoGeneral();
			
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
				
				//this.isEsNuevoTipoDocumentoGeneral=false;
					
				TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
			
				if(this.tipodocumentogeneralSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoDocumentoGeneral==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoDocumentoGeneral.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoDocumentoGeneral.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentogeneral =(TipoDocumentoGeneral) this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodocumentogeneral =(TipoDocumentoGeneral) this.tipodocumentogenerals.toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipodocumentogeneral.getsType().equals("DUPLICADO")
				   || this.tipodocumentogeneral.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoDocumentoGeneral=true;
				
				} else {
					this.isEsNuevoTipoDocumentoGeneral=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {
					if(this.tipodocumentogeneral.getId()>=0 && !this.tipodocumentogeneral.getIsNew()) {						
						this.isEsNuevoTipoDocumentoGeneral=false;
						
					} else {
						this.isEsNuevoTipoDocumentoGeneral=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoDocumentoGeneral(esRelaciones);						
				
				this.seleccionarTipoDocumentoGeneral(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipodocumentogeneral.getId()<0) {
					this.isEsNuevoTipoDocumentoGeneral=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoDocumentoGeneral(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoDocumentoGeneral(evt,rowIndex);
				}	
				
				if(this.tipodocumentogeneralSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoDocumentoGeneral: " + this.dDif); 
					}
				}								
				
				TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoDocumentoGeneral(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipodocumentogeneral)) {
					if(this.tipodocumentogeneral.getId()>0) {
						this.tipodocumentogeneral.setIsDeleted(true);
						
						this.tipodocumentogeneralsEliminados.add(this.tipodocumentogeneral);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().remove(this.tipodocumentogeneral);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipodocumentogenerals.remove(this.tipodocumentogeneral);				
					}
					
					
					((TipoDocumentoGeneralModel) this.jTableDatosTipoDocumentoGeneral.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDocumentoGeneral(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoDocumentoGeneral(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoDocumentoGeneral) {
			
			if(this.jInternalFrameDetalleFormTipoDocumentoGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoDocumentoGeneral.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoDocumentoGeneral.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentogeneral =(TipoDocumentoGeneral) this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodocumentogeneral =(TipoDocumentoGeneral) this.tipodocumentogenerals.toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoDocumentoGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoDocumentoGeneral(this.tipodocumentogeneral);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoDocumentoGeneral("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoDocumentoGeneral(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDocumentoGeneral() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoDocumentoGeneral(TipoDocumentoGeneral tipodocumentogeneral) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoDocumentoGeneral(tipodocumentogeneral,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoDocumentoGeneral(TipoDocumentoGeneral tipodocumentogeneral,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoDocumentoGeneral(tipodocumentogeneral);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoDocumentoGeneral(tipodocumentogeneral,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoDocumentoGeneral(tipodocumentogeneral);
	}
	
	public void setVariablesObjetoActualToFormularioTipoDocumentoGeneral(TipoDocumentoGeneral tipodocumentogeneral) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoDocumentoGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTextFieldidTipoDocumentoGeneral.setText(tipodocumentogeneral.getId().toString());
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTextFieldcodigoTipoDocumentoGeneral.setText(tipodocumentogeneral.getcodigo());
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTextAreanombreTipoDocumentoGeneral.setText(tipodocumentogeneral.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoDocumentoGeneral tipodocumentogeneralLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipodocumentogeneralLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoDocumentoGeneral tipodocumentogeneralLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipodocumentogeneralLocal=this.tipodocumentogeneral;
			} else {
				tipodocumentogeneralLocal=this.tipodocumentogeneralAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipodocumentogeneralLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoDocumentoGeneral(tipodocumentogeneralLocal,true);
					
					if(tipodocumentogeneralSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipodocumentogeneralLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipodocumentogeneralLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoDocumentoGeneral(TipoDocumentoGeneral tipodocumentogeneral,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoDocumentoGeneral(tipodocumentogeneral,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoGeneral(tipodocumentogeneral);
	}
	
	public void setVariablesFormularioToObjetoActualTipoDocumentoGeneral(TipoDocumentoGeneral tipodocumentogeneral,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoDocumentoGeneral(tipodocumentogeneral,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoDocumentoGeneral(TipoDocumentoGeneral tipodocumentogeneral,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoDocumentoGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTextFieldidTipoDocumentoGeneral.getText()==null || this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTextFieldidTipoDocumentoGeneral.getText()=="" || this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTextFieldidTipoDocumentoGeneral.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTextFieldidTipoDocumentoGeneral.setText("0");
			}

			if(conColumnasBase) {tipodocumentogeneral.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTextFieldidTipoDocumentoGeneral.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDocumentoGeneralConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDocumentoGeneral.jLabelIdTipoDocumentoGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodocumentogeneral.setcodigo(this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTextFieldcodigoTipoDocumentoGeneral.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDocumentoGeneralConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDocumentoGeneral.jLabelcodigoTipoDocumentoGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodocumentogeneral.setnombre(this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTextAreanombreTipoDocumentoGeneral.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDocumentoGeneralConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDocumentoGeneral.jLabelnombreTipoDocumentoGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoDocumentoGeneral(TipoDocumentoGeneral tipodocumentogeneralBean,TipoDocumentoGeneral tipodocumentogeneral,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoDocumentoGeneral(TipoDocumentoGeneral tipodocumentogeneralOrigen,TipoDocumentoGeneral tipodocumentogeneral,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipodocumentogeneralOrigen.getId()!=null && !tipodocumentogeneralOrigen.getId().equals(0L))) {tipodocumentogeneral.setId(tipodocumentogeneralOrigen.getId());}}
			if(conDefault || (!conDefault && tipodocumentogeneralOrigen.getcodigo()!=null && !tipodocumentogeneralOrigen.getcodigo().equals(""))) {tipodocumentogeneral.setcodigo(tipodocumentogeneralOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipodocumentogeneralOrigen.getnombre()!=null && !tipodocumentogeneralOrigen.getnombre().equals(""))) {tipodocumentogeneral.setnombre(tipodocumentogeneralOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoDocumentoGeneral(TipoDocumentoGeneral tipodocumentogeneral) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTextFieldidTipoDocumentoGeneral.setText(tipodocumentogeneral.getId().toString());
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTextFieldcodigoTipoDocumentoGeneral.setText(tipodocumentogeneral.getcodigo());
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTextAreanombreTipoDocumentoGeneral.setText(tipodocumentogeneral.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoDocumentoGeneral(TipoDocumentoGeneralBean tipodocumentogeneralBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTextFieldidTipoDocumentoGeneral.setText(tipodocumentogeneralBean.getId().toString());
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTextFieldcodigoTipoDocumentoGeneral.setText(tipodocumentogeneralBean.getcodigo());
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTextAreanombreTipoDocumentoGeneral.setText(tipodocumentogeneralBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoDocumentoGeneral(TipoDocumentoGeneralParameterReturnGeneral tipodocumentogeneralReturnGeneral,TipoDocumentoGeneralBean tipodocumentogeneralBean,Boolean conDefault) throws Exception { 
		try {
			TipoDocumentoGeneral tipodocumentogeneralLocal=new TipoDocumentoGeneral();
			
			tipodocumentogeneralLocal=tipodocumentogeneralReturnGeneral.getTipoDocumentoGeneral();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipodocumentogeneralLocal.getId()!=null && !tipodocumentogeneralLocal.getId().equals(0L))) {tipodocumentogeneralBean.setId(tipodocumentogeneralLocal.getId());}}
			if(conDefault || (!conDefault && tipodocumentogeneralLocal.getcodigo()!=null && !tipodocumentogeneralLocal.getcodigo().equals(""))) {tipodocumentogeneralBean.setcodigo(tipodocumentogeneralLocal.getcodigo());}
			if(conDefault || (!conDefault && tipodocumentogeneralLocal.getnombre()!=null && !tipodocumentogeneralLocal.getnombre().equals(""))) {tipodocumentogeneralBean.setnombre(tipodocumentogeneralLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoDocumentoGeneralGenerico(Long idTipoDocumentoGeneralSeleccionado,JComboBox jComboBoxTipoDocumentoGeneral,List<TipoDocumentoGeneral> tipodocumentogeneralsLocal)throws Exception {
		try {
			TipoDocumentoGeneral  tipodocumentogeneralTemp=null;

			for(TipoDocumentoGeneral tipodocumentogeneralAux:tipodocumentogeneralsLocal) {
				if(tipodocumentogeneralAux.getId()!=null && tipodocumentogeneralAux.getId().equals(idTipoDocumentoGeneralSeleccionado)) {
					tipodocumentogeneralTemp=tipodocumentogeneralAux;
					break;
				}
			}

			jComboBoxTipoDocumentoGeneral.setSelectedItem(tipodocumentogeneralTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoDocumentoGeneralGenerico(JComboBox jComboBoxTipoDocumentoGeneral,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoDocumentoGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoDocumentoGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoDocumentoGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoDocumentoGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoDocumentoGeneral.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoDocumentoGeneral.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoDocumentoGeneral.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoDocumentoGeneral.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoDocumentoGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoDocumentoGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodocumentogeneral=(TipoDocumentoGeneral) tipodocumentogeneralLogic.getTipoDocumentoGenerals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipodocumentogeneral =(TipoDocumentoGeneral) tipodocumentogenerals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoDocumentoGeneral tipodocumentogeneralRow=new TipoDocumentoGeneral();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodocumentogeneralRow=(TipoDocumentoGeneral) tipodocumentogeneralLogic.getTipoDocumentoGenerals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipodocumentogeneralRow=(TipoDocumentoGeneral) tipodocumentogenerals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoDocumentoGeneral(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaNuevoTipoDocumentoGeneral && this.isPermisoNuevoTipoDocumentoGeneral));			
			this.jButtonDuplicarTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaDuplicarTipoDocumentoGeneral && this.isPermisoDuplicarTipoDocumentoGeneral));			
			this.jButtonCopiarTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaCopiarTipoDocumentoGeneral && this.isPermisoCopiarTipoDocumentoGeneral));
			this.jButtonVerFormTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaVerFormTipoDocumentoGeneral && this.isPermisoVerFormTipoDocumentoGeneral));
			
			this.jButtonAbrirOrderByTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaOrdenTipoDocumentoGeneral && this.isPermisoOrdenTipoDocumentoGeneral));			
			
			this.jButtonNuevoRelacionesTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoGeneral && this.isPermisoNuevoTipoDocumentoGeneral));			
			this.jButtonNuevoGuardarCambiosTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaNuevoTipoDocumentoGeneral && this.isPermisoNuevoTipoDocumentoGeneral && this.isPermisoGuardarCambiosTipoDocumentoGeneral));
			
			if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) {
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonModificarTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaModificarTipoDocumentoGeneral && this.isPermisoActualizarTipoDocumentoGeneral));	
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonActualizarTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaActualizarTipoDocumentoGeneral && this.isPermisoActualizarTipoDocumentoGeneral));	
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonEliminarTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaEliminarTipoDocumentoGeneral && this.isPermisoEliminarTipoDocumentoGeneral));
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonCancelarTipoDocumentoGeneral.setVisible(this.isVisibilidadCeldaCancelarTipoDocumentoGeneral);							
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonGuardarCambiosTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaGuardarTipoDocumentoGeneral && this.isPermisoGuardarCambiosTipoDocumentoGeneral));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDocumentoGeneral && this.isPermisoGuardarCambiosTipoDocumentoGeneral));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaNuevoTipoDocumentoGeneral && this.isPermisoNuevoTipoDocumentoGeneral));						
			this.jButtonDuplicarToolBarTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaDuplicarTipoDocumentoGeneral && this.isPermisoDuplicarTipoDocumentoGeneral));						
			this.jButtonCopiarToolBarTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaCopiarTipoDocumentoGeneral && this.isPermisoCopiarTipoDocumentoGeneral));			
			this.jButtonVerFormToolBarTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaVerFormTipoDocumentoGeneral && this.isPermisoVerFormTipoDocumentoGeneral));			
			this.jButtonAbrirOrderByToolBarTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaOrdenTipoDocumentoGeneral && this.isPermisoOrdenTipoDocumentoGeneral));
			this.jButtonNuevoRelacionesToolBarTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoGeneral && this.isPermisoNuevoTipoDocumentoGeneral));			
			this.jButtonNuevoGuardarCambiosToolBarTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaNuevoTipoDocumentoGeneral && this.isPermisoNuevoTipoDocumentoGeneral && this.isPermisoGuardarCambiosTipoDocumentoGeneral));			
			
			if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) {
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonModificarToolBarTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaModificarTipoDocumentoGeneral && this.isPermisoActualizarTipoDocumentoGeneral));	
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonActualizarToolBarTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaActualizarTipoDocumentoGeneral  && this.isPermisoActualizarTipoDocumentoGeneral));	
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonEliminarToolBarTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaEliminarTipoDocumentoGeneral && this.isPermisoEliminarTipoDocumentoGeneral));
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonCancelarToolBarTipoDocumentoGeneral.setVisible(this.isVisibilidadCeldaCancelarTipoDocumentoGeneral);				
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonGuardarCambiosToolBarTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaGuardarTipoDocumentoGeneral && this.isPermisoGuardarCambiosTipoDocumentoGeneral));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDocumentoGeneral && this.isPermisoGuardarCambiosTipoDocumentoGeneral));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaNuevoTipoDocumentoGeneral && this.isPermisoNuevoTipoDocumentoGeneral));			
			this.jMenuItemDuplicarTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaDuplicarTipoDocumentoGeneral && this.isPermisoDuplicarTipoDocumentoGeneral));			
			this.jMenuItemCopiarTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaCopiarTipoDocumentoGeneral && this.isPermisoCopiarTipoDocumentoGeneral));			
			this.jMenuItemVerFormTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaVerFormTipoDocumentoGeneral && this.isPermisoVerFormTipoDocumentoGeneral));			
			this.jMenuItemAbrirOrderByTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaOrdenTipoDocumentoGeneral && this.isPermisoOrdenTipoDocumentoGeneral));			
			//this.jMenuItemMostrarOcultarTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaOrdenTipoDocumentoGeneral && this.isPermisoOrdenTipoDocumentoGeneral));
			this.jMenuItemDetalleAbrirOrderByTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaOrdenTipoDocumentoGeneral && this.isPermisoOrdenTipoDocumentoGeneral));			
			//this.jMenuItemDetalleMostrarOcultarTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaOrdenTipoDocumentoGeneral && this.isPermisoOrdenTipoDocumentoGeneral));			
			this.jMenuItemNuevoRelacionesTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoGeneral && this.isPermisoNuevoTipoDocumentoGeneral));			
			this.jMenuItemNuevoGuardarCambiosTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaNuevoTipoDocumentoGeneral && this.isPermisoNuevoTipoDocumentoGeneral && this.isPermisoGuardarCambiosTipoDocumentoGeneral));									
			
			if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) {
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jMenuItemModificarTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaModificarTipoDocumentoGeneral && this.isPermisoActualizarTipoDocumentoGeneral));	
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jMenuItemActualizarTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaActualizarTipoDocumentoGeneral && this.isPermisoActualizarTipoDocumentoGeneral));	
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jMenuItemEliminarTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaEliminarTipoDocumentoGeneral && this.isPermisoEliminarTipoDocumentoGeneral));
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jMenuItemCancelarTipoDocumentoGeneral.setVisible(this.isVisibilidadCeldaCancelarTipoDocumentoGeneral);				
			}
			
			this.jMenuItemGuardarCambiosTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaGuardarTipoDocumentoGeneral && this.isPermisoGuardarCambiosTipoDocumentoGeneral));						
			this.jMenuItemGuardarCambiosTablaTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDocumentoGeneral && this.isPermisoGuardarCambiosTipoDocumentoGeneral));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoDocumentoGeneral=this.jButtonNuevoTipoDocumentoGeneral.isVisible();
			this.isVisibilidadCeldaDuplicarTipoDocumentoGeneral=this.jButtonDuplicarTipoDocumentoGeneral.isVisible();
			this.isVisibilidadCeldaCopiarTipoDocumentoGeneral=this.jButtonCopiarTipoDocumentoGeneral.isVisible();
			this.isVisibilidadCeldaVerFormTipoDocumentoGeneral=this.jButtonVerFormTipoDocumentoGeneral.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoDocumentoGeneral=this.jButtonAbrirOrderByTipoDocumentoGeneral.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoGeneral=this.jButtonNuevoRelacionesTipoDocumentoGeneral.isVisible();
			this.isVisibilidadCeldaModificarTipoDocumentoGeneral=this.jButtonModificarTipoDocumentoGeneral.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) {
			this.isVisibilidadCeldaActualizarTipoDocumentoGeneral=this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonActualizarTipoDocumentoGeneral.isVisible();
			this.isVisibilidadCeldaEliminarTipoDocumentoGeneral=this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonEliminarTipoDocumentoGeneral.isVisible();
			this.isVisibilidadCeldaCancelarTipoDocumentoGeneral=this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonCancelarTipoDocumentoGeneral.isVisible();
			this.isVisibilidadCeldaGuardarTipoDocumentoGeneral=this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonGuardarCambiosTipoDocumentoGeneral.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoDocumentoGeneral=this.jButtonGuardarCambiosTablaTipoDocumentoGeneral.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoDocumentoGeneral=this.jButtonNuevoToolBarTipoDocumentoGeneral.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoGeneral=this.jButtonNuevoRelacionesToolBarTipoDocumentoGeneral.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) {
			this.isVisibilidadCeldaModificarTipoDocumentoGeneral=this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonModificarToolBarTipoDocumentoGeneral.isVisible();
			this.isVisibilidadCeldaActualizarTipoDocumentoGeneral=this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonActualizarToolBarTipoDocumentoGeneral.isVisible();
			this.isVisibilidadCeldaEliminarTipoDocumentoGeneral=this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonEliminarToolBarTipoDocumentoGeneral.isVisible();
			this.isVisibilidadCeldaCancelarTipoDocumentoGeneral=this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonCancelarToolBarTipoDocumentoGeneral.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoDocumentoGeneral=this.jButtonGuardarCambiosToolBarTipoDocumentoGeneral.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoDocumentoGeneral=this.jButtonGuardarCambiosTablaToolBarTipoDocumentoGeneral.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoDocumentoGeneral=this.jMenuItemNuevoTipoDocumentoGeneral.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoGeneral=this.jMenuItemNuevoRelacionesTipoDocumentoGeneral.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) {
			this.isVisibilidadCeldaModificarTipoDocumentoGeneral=this.jInternalFrameDetalleFormTipoDocumentoGeneral.jMenuItemModificarTipoDocumentoGeneral.isVisible();
			this.isVisibilidadCeldaActualizarTipoDocumentoGeneral=this.jInternalFrameDetalleFormTipoDocumentoGeneral.jMenuItemActualizarTipoDocumentoGeneral.isVisible();
			this.isVisibilidadCeldaEliminarTipoDocumentoGeneral=this.jInternalFrameDetalleFormTipoDocumentoGeneral.jMenuItemEliminarTipoDocumentoGeneral.isVisible();
			this.isVisibilidadCeldaCancelarTipoDocumentoGeneral=this.jInternalFrameDetalleFormTipoDocumentoGeneral.jMenuItemCancelarTipoDocumentoGeneral.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoDocumentoGeneral=this.jMenuItemGuardarCambiosTipoDocumentoGeneral.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoDocumentoGeneral=this.jMenuItemGuardarCambiosTablaTipoDocumentoGeneral.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoDocumentoGeneral(Boolean esInicializar) {
		if(TipoDocumentoGeneralJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipodocumentogeneralSessionBean.getConGuardarRelaciones()) {
				//if(this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoDocumentoGeneral();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoDocumentoGeneral(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoDocumentoGeneral() {
		this.jButtonNuevoTipoDocumentoGeneral.setVisible(this.isPermisoNuevoTipoDocumentoGeneral);			
		this.jButtonDuplicarTipoDocumentoGeneral.setVisible(this.isPermisoDuplicarTipoDocumentoGeneral);			
		this.jButtonCopiarTipoDocumentoGeneral.setVisible(this.isPermisoCopiarTipoDocumentoGeneral);			
		this.jButtonVerFormTipoDocumentoGeneral.setVisible(this.isPermisoVerFormTipoDocumentoGeneral);			
		
		this.jButtonAbrirOrderByTipoDocumentoGeneral.setVisible(this.isPermisoOrdenTipoDocumentoGeneral);					
		
		this.jButtonNuevoRelacionesTipoDocumentoGeneral.setVisible(this.isPermisoNuevoTipoDocumentoGeneral);			
		
		if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonModificarTipoDocumentoGeneral.setVisible(this.isPermisoActualizarTipoDocumentoGeneral);	
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonActualizarTipoDocumentoGeneral.setVisible(this.isPermisoActualizarTipoDocumentoGeneral);	
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonEliminarTipoDocumentoGeneral.setVisible(this.isPermisoEliminarTipoDocumentoGeneral);
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonCancelarTipoDocumentoGeneral.setVisible(this.isVisibilidadCeldaCancelarTipoDocumentoGeneral);						
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonGuardarCambiosTipoDocumentoGeneral.setVisible(this.isPermisoGuardarCambiosTipoDocumentoGeneral);							
		}
		
		this.jButtonGuardarCambiosTablaTipoDocumentoGeneral.setVisible(this.isPermisoActualizarTipoDocumentoGeneral);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoDocumentoGeneral() {
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonModificarTipoDocumentoGeneral.setVisible(this.isPermisoActualizarTipoDocumentoGeneral);	
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonActualizarTipoDocumentoGeneral.setVisible(this.isPermisoActualizarTipoDocumentoGeneral);	
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonEliminarTipoDocumentoGeneral.setVisible(this.isPermisoEliminarTipoDocumentoGeneral);
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonCancelarTipoDocumentoGeneral.setVisible(this.isVisibilidadCeldaCancelarTipoDocumentoGeneral);							
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonGuardarCambiosTipoDocumentoGeneral.setVisible((this.isVisibilidadCeldaGuardarTipoDocumentoGeneral && this.isPermisoGuardarCambiosTipoDocumentoGeneral));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoDocumentoGeneral() {
		if(TipoDocumentoGeneralJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoDocumentoGeneral();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoDocumentoGeneral() {
	}
	
	public void jTableDatosTipoDocumentoGeneralListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoDocumentoGeneral(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoDocumentoGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDocumentoGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDocumentoGeneral(this.gettipodocumentogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoGeneral(this.tipodocumentogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodocumentogeneral =(TipoDocumentoGeneral) this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodocumentogeneral =(TipoDocumentoGeneral) this.tipodocumentogenerals.toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodocumentogeneral==null) {
						this.tipodocumentogeneral = new TipoDocumentoGeneral();
					}

					this.setVariablesFormularioToObjetoActualTipoDocumentoGeneral(this.tipodocumentogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoGeneral(this.tipodocumentogeneral);
				}

				if(this.tipodocumentogeneral.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipodocumentogeneral.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDocumentoGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoDocumentoGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDocumentoGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDocumentoGeneral(this.gettipodocumentogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoGeneral(this.tipodocumentogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodocumentogeneral =(TipoDocumentoGeneral) this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodocumentogeneral =(TipoDocumentoGeneral) this.tipodocumentogenerals.toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodocumentogeneral==null) {
						this.tipodocumentogeneral = new TipoDocumentoGeneral();
					}

					this.setVariablesFormularioToObjetoActualTipoDocumentoGeneral(this.tipodocumentogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoGeneral(this.tipodocumentogeneral);
				}

				if(this.tipodocumentogeneral.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipodocumentogeneral.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDocumentoGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoDocumentoGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDocumentoGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDocumentoGeneral(this.gettipodocumentogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoGeneral(this.tipodocumentogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodocumentogeneral =(TipoDocumentoGeneral) this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodocumentogeneral =(TipoDocumentoGeneral) this.tipodocumentogenerals.toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodocumentogeneral==null) {
						this.tipodocumentogeneral = new TipoDocumentoGeneral();
					}

					this.setVariablesFormularioToObjetoActualTipoDocumentoGeneral(this.tipodocumentogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoGeneral(this.tipodocumentogeneral);
				}

				if(this.tipodocumentogeneral.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipodocumentogeneral.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDocumentoGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTipoDocumentoGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDocumentoGeneral(false,false);

			this.getTipoDocumentoGeneralsBusquedaPorCodigo();

			this.inicializarActualizarBindingTipoDocumentoGeneral(false);

			//if(TipoDocumentoGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDocumentoGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorIdTipoDocumentoGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDocumentoGeneral(false,false);

			this.getTipoDocumentoGeneralsBusquedaPorId();

			this.inicializarActualizarBindingTipoDocumentoGeneral(false);

			//if(TipoDocumentoGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDocumentoGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoDocumentoGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDocumentoGeneral(false,false);

			this.getTipoDocumentoGeneralsBusquedaPorNombre();

			this.inicializarActualizarBindingTipoDocumentoGeneral(false);

			//if(TipoDocumentoGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDocumentoGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodocumentogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoDocumentoGeneral() {
		if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) {
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.dispose();
			this.jInternalFrameDetalleFormTipoDocumentoGeneral=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoDocumentoGeneral!=null) {
			this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.dispose();
			this.jInternalFrameReporteDinamicoTipoDocumentoGeneral=null;
		}
		
		if(this.jInternalFrameImportacionTipoDocumentoGeneral!=null) {
			this.jInternalFrameImportacionTipoDocumentoGeneral.setVisible(false);	    			
			this.jInternalFrameImportacionTipoDocumentoGeneral.dispose();
			this.jInternalFrameImportacionTipoDocumentoGeneral=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoDocumentoGeneral();
			
			TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoDocumentoGeneral")) {
				jButtonNuevoTipoDocumentoGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoDocumentoGeneral")) {
				jButtonDuplicarTipoDocumentoGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoDocumentoGeneral")) {
				jButtonCopiarTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoDocumentoGeneral")) {
				jButtonVerFormTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoDocumentoGeneral")) {
				jButtonNuevoTipoDocumentoGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoDocumentoGeneral")) {
				jButtonDuplicarTipoDocumentoGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoDocumentoGeneral")) {
				jButtonNuevoTipoDocumentoGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoDocumentoGeneral")) {
				jButtonDuplicarTipoDocumentoGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoDocumentoGeneral")) {
				jButtonNuevoTipoDocumentoGeneralActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoDocumentoGeneral")) {
				jButtonNuevoTipoDocumentoGeneralActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoDocumentoGeneral")) {
				jButtonNuevoTipoDocumentoGeneralActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoDocumentoGeneral")) {
				jButtonModificarTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoDocumentoGeneral")) {
				jButtonModificarTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoDocumentoGeneral")) {
				jButtonModificarTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoDocumentoGeneral")) {
				jButtonActualizarTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoDocumentoGeneral")) {
				jButtonActualizarTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoDocumentoGeneral")) {
				jButtonActualizarTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoDocumentoGeneral")) {
				jButtonEliminarTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoDocumentoGeneral")) {
				jButtonEliminarTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoDocumentoGeneral")) {
				jButtonEliminarTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoDocumentoGeneral")) {
				jButtonCancelarTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoDocumentoGeneral")) {
				jButtonCancelarTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoDocumentoGeneral")) {
				jButtonCancelarTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoDocumentoGeneral")) {
				jButtonCerrarTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoDocumentoGeneral")) {
				jButtonCerrarTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoDocumentoGeneral")) {
				jButtonCerrarTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoDocumentoGeneral")) {
				jButtonMostrarOcultarTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoDocumentoGeneral")) {
				jButtonCancelarTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoDocumentoGeneral")) {
				jButtonGuardarCambiosTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoDocumentoGeneral")) {
				jButtonGuardarCambiosTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoDocumentoGeneral")) {
				jButtonCopiarTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoDocumentoGeneral")) {
				jButtonVerFormTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoDocumentoGeneral")) {
				jButtonGuardarCambiosTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoDocumentoGeneral")) {
				jButtonCopiarTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoDocumentoGeneral")) {
				jButtonVerFormTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoDocumentoGeneral")) {
				jButtonGuardarCambiosTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoDocumentoGeneral")) {
				jButtonGuardarCambiosTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoDocumentoGeneral")) {
				jButtonGuardarCambiosTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoDocumentoGeneral")) {
				jButtonRecargarInformacionTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoDocumentoGeneral")) {
				jButtonRecargarInformacionTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoDocumentoGeneral")) {
				jButtonRecargarInformacionTipoDocumentoGeneralActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoDocumentoGeneral")) {
				jButtonAnterioresTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoDocumentoGeneral")) {
				jButtonAnterioresTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoDocumentoGeneral")) {
				jButtonAnterioresTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoDocumentoGeneral")) {
				jButtonSiguientesTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoDocumentoGeneral")) {
				jButtonSiguientesTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoDocumentoGeneral")) {
				jButtonSiguientesTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoDocumentoGeneral") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoDocumentoGeneral")) {
				jButtonAbrirOrderByTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoDocumentoGeneral") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoDocumentoGeneral")) {
				jButtonMostrarOcultarTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoDocumentoGeneral")) {
				jButtonNuevoGuardarCambiosTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoDocumentoGeneral")) {
				jButtonNuevoGuardarCambiosTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoDocumentoGeneral")) {
				jButtonNuevoGuardarCambiosTipoDocumentoGeneralActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoDocumentoGeneral")) {
				jButtonCerrarReporteDinamicoTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoDocumentoGeneral")) {
				jButtonGenerarReporteDinamicoTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoDocumentoGeneral")) {
				
				jButtonGenerarExcelReporteDinamicoTipoDocumentoGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoDocumentoGeneral")) {
				jButtonCerrarImportacionTipoDocumentoGeneralActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoDocumentoGeneral")) {
				
				jButtonGenerarImportacionTipoDocumentoGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoDocumentoGeneral")) {
				
				jButtonAbrirImportacionTipoDocumentoGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoDocumentoGeneral")) {
				jComboBoxTiposAccionesTipoDocumentoGeneralActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoDocumentoGeneral")) {
				jComboBoxTiposRelacionesTipoDocumentoGeneralActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoDocumentoGeneral")) {
				jComboBoxTiposAccionesTipoDocumentoGeneralActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoDocumentoGeneral")) {
				
				jComboBoxTiposSeleccionarTipoDocumentoGeneralActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoDocumentoGeneral")) {
				jTextFieldValorCampoGeneralTipoDocumentoGeneralActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoDocumentoGeneral")) {
				jButtonAbrirOrderByTipoDocumentoGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoDocumentoGeneral")) {
				jButtonAbrirOrderByTipoDocumentoGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoDocumentoGeneral")) {
				jButtonCerrarOrderByTipoDocumentoGeneralActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoDocumentoGeneralBusqueda")) {
				this.jButtonidTipoDocumentoGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoDocumentoGeneralBusqueda")) {
				this.jButtoncodigoTipoDocumentoGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoDocumentoGeneralBusqueda")) {
				this.jButtonnombreTipoDocumentoGeneralBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoTipoDocumentoGeneral")) {
				this.jButtonBusquedaPorCodigoTipoDocumentoGeneralActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorIdTipoDocumentoGeneral")) {
				this.jButtonBusquedaPorIdTipoDocumentoGeneralActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoDocumentoGeneral")) {
				this.jButtonBusquedaPorNombreTipoDocumentoGeneralActionPerformed(evt);
			}
			
			;
			
			
			TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoDocumentoGeneral();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDocumentoGeneralActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumentogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentogeneral);
				
				TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
				
				


				
				TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDocumentoGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumentoGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoDocumentoGeneral tipodocumentogeneralLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipodocumentogeneralLocal=this.tipodocumentogeneral;
			} else {
				tipodocumentogeneralLocal=this.tipodocumentogeneralAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumentogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentogeneral);
				
				TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
							
				
				


				
				TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDocumentoGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumentoGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDocumentoGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDocumentoGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentogeneralAnterior =(TipoDocumentoGeneral) this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodocumentogeneralAnterior =(TipoDocumentoGeneral) this.tipodocumentogenerals.toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
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
			
			TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
			
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
			
			


			
			TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDocumentoGeneralActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumentogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentogeneral);
				
				TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
								
						
				


				
				TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDocumentoGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumentoGeneral.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumentogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentogeneral);
				
				TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
								
				
				


				
				TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDocumentoGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumentoGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDocumentoGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDocumentoGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentogeneralAnterior =(TipoDocumentoGeneral) this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodocumentogeneralAnterior =(TipoDocumentoGeneral) this.tipodocumentogenerals.toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumentogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentogeneral);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDocumentoGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDocumentoGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentogeneralAnterior =(TipoDocumentoGeneral) this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodocumentogeneralAnterior =(TipoDocumentoGeneral) this.tipodocumentogenerals.toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDocumentoGeneralActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumentogeneral);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentogeneral);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumentogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentogeneral);
				
				TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
							
				
				


				
				TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDocumentoGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumentoGeneral.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDocumentoGeneralActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoDocumentoGeneral.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodocumentogeneralAnterior =(TipoDocumentoGeneral) this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipodocumentogeneralAnterior =(TipoDocumentoGeneral) this.tipodocumentogenerals.toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
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
			
			TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
			
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
			
			


			
			TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDocumentoGeneralActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumentogeneral);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentogeneral);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumentogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentogeneral);
				
				TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
								
				
				


				
				TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDocumentoGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumentoGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDocumentoGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDocumentoGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentogeneralAnterior =(TipoDocumentoGeneral) this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodocumentogeneralAnterior =(TipoDocumentoGeneral) this.tipodocumentogenerals.toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDocumentoGeneralActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumentogeneral);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentogeneral);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDocumentoGeneralActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumentogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentogeneral);
				
				TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoDocumentoGeneral")) {
					jCheckBoxSeleccionarTodosTipoDocumentoGeneralItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoDocumentoGeneral")) {
					jCheckBoxSeleccionadosTipoDocumentoGeneralItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoDocumentoGeneral")) {
					
				}
				
				


				
				
				TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDocumentoGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumentoGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumentogeneral);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentogeneral);
				
				TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
												
				
				


				
				
				TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDocumentoGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumentoGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDocumentoGeneralActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoDocumentoGeneral.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodocumentogeneralAnterior =(TipoDocumentoGeneral) this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipodocumentogeneralAnterior =(TipoDocumentoGeneral) this.tipodocumentogenerals.toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDocumentoGeneralActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumentogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentogeneral);
				
				TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
				
				
				TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
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
			
			TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
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
			
			


			
			TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDocumentoGeneralActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumentogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentogeneral);
				
				TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDocumentoGeneral.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumentoGeneral.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodocumentogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodocumentogeneral);
				
				TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
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
				
				


				
				TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDocumentoGeneral.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDocumentoGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDocumentoGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDocumentoGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodocumentogeneralAnterior =(TipoDocumentoGeneral) this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodocumentogeneralAnterior =(TipoDocumentoGeneral) this.tipodocumentogenerals.toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoDocumentoGeneral")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoDocumentoGeneralListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoDocumentoGeneral.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipodocumentogeneral =(TipoDocumentoGeneral) this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipodocumentogeneral =(TipoDocumentoGeneral) this.tipodocumentogenerals.toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipodocumentogeneral);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoDocumentoGeneral")) {
				
				}
				
				TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoDocumentoGeneral")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoDocumentoGeneral.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoDocumentoGeneral")) {
			
			}
			
			TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoDocumentoGeneral();
			
			TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
			
			if(sTipo.equals("NuevoTipoDocumentoGeneral")) {
				jButtonNuevoTipoDocumentoGeneralActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoDocumentoGeneral")) {
				jButtonDuplicarTipoDocumentoGeneralActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoDocumentoGeneral")) {
				jButtonCopiarTipoDocumentoGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoDocumentoGeneral")) {
				jButtonVerFormTipoDocumentoGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoDocumentoGeneral")) {
				jButtonNuevoTipoDocumentoGeneralActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoDocumentoGeneral")) {
				jButtonModificarTipoDocumentoGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoDocumentoGeneral")) {
				jButtonActualizarTipoDocumentoGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoDocumentoGeneral")) {
				jButtonEliminarTipoDocumentoGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoDocumentoGeneral")) {
				jButtonGuardarCambiosTipoDocumentoGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoDocumentoGeneral")) {
				jButtonCancelarTipoDocumentoGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoDocumentoGeneral")) {
				jButtonCerrarTipoDocumentoGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoDocumentoGeneral")) {
				jButtonGuardarCambiosTipoDocumentoGeneralActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoDocumentoGeneral")) {
				jButtonNuevoGuardarCambiosTipoDocumentoGeneralActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoDocumentoGeneral")) {
				jButtonAbrirOrderByTipoDocumentoGeneralActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoDocumentoGeneral")) {
				jButtonRecargarInformacionTipoDocumentoGeneralActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoDocumentoGeneral")) {
				jButtonAnterioresTipoDocumentoGeneralActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoDocumentoGeneral")) {
				jButtonSiguientesTipoDocumentoGeneralActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoDocumentoGeneralBusqueda")) {
				this.jButtonidTipoDocumentoGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoDocumentoGeneralBusqueda")) {
				this.jButtoncodigoTipoDocumentoGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoDocumentoGeneralBusqueda")) {
				this.jButtonnombreTipoDocumentoGeneralBusquedaActionPerformed(evt);
			}
			
			TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoDocumentoGeneral();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoDocumentoGeneral")) {
				closingInternalFrameTipoDocumentoGeneral();
				
			} else if(sTipo.equals("jButtonCancelarTipoDocumentoGeneral")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoDocumentoGeneral = (JInternalFrameBase)evt.getSource();
	            	
	            TipoDocumentoGeneralBeanSwingJInternalFrame jInternalFrameParent=(TipoDocumentoGeneralBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoDocumentoGeneral.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoDocumentoGeneralActionPerformed(null);
			}
			
			TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipodocumentogeneral,new Object(),this.tipodocumentogeneralParameterGeneral,this.tipodocumentogeneralReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoDocumentoGeneral(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoDocumentoGeneral(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoDocumentoGeneral(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipodocumentogeneral)) {
			if(!esControlTabla) {
				if(TipoDocumentoGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoDocumentoGeneral(this.tipodocumentogeneral,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoGeneral(this.tipodocumentogeneral);			
				}
				
				if(this.tipodocumentogeneralSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoDocumentoGeneral(this.tipodocumentogeneral,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipodocumentogeneralReturnGeneral=tipodocumentogeneralLogic.procesarEventosTipoDocumentoGeneralsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodocumentogeneralLogic.getTipoDocumentoGenerals(),this.tipodocumentogeneral,this.tipodocumentogeneralParameterGeneral,this.isEsNuevoTipoDocumentoGeneral,classes);//this.tipodocumentogeneralLogic.getTipoDocumentoGeneral()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoDocumentoGeneral(this.tipodocumentogeneralReturnGeneral,this.tipodocumentogeneralBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipodocumentogeneralSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoDocumentoGeneral(classes,this.tipodocumentogeneralReturnGeneral,this.tipodocumentogeneralBean,false);
					}
						
					if(this.tipodocumentogeneralReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoDocumentoGeneral(this.tipodocumentogeneralReturnGeneral.getTipoDocumentoGeneral());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoDocumentoGeneral(this.tipodocumentogeneralReturnGeneral.getTipoDocumentoGeneral());	
					}
						
					if(this.tipodocumentogeneralReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoDocumentoGeneral(this.tipodocumentogeneralReturnGeneral.getTipoDocumentoGeneral(),classes);//this.tipodocumentogeneralBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoDocumentoGeneral(this.tipodocumentogeneral,classes);//this.tipodocumentogeneralBean);									
				}
			
				if(TipoDocumentoGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoDocumentoGeneral(this.tipodocumentogeneral,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDocumentoGeneral(this.tipodocumentogeneral);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipodocumentogeneralAnterior!=null) {
						this.tipodocumentogeneral=this.tipodocumentogeneralAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipodocumentogeneralReturnGeneral=tipodocumentogeneralLogic.procesarEventosTipoDocumentoGeneralsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodocumentogeneralLogic.getTipoDocumentoGenerals(),this.tipodocumentogeneral,this.tipodocumentogeneralParameterGeneral,this.isEsNuevoTipoDocumentoGeneral,classes);//this.tipodocumentogeneralLogic.getTipoDocumentoGeneral()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipodocumentogeneralSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipodocumentogeneralReturnGeneral.getTipoDocumentoGeneral(),tipodocumentogeneralLogic.getTipoDocumentoGenerals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipodocumentogeneralReturnGeneral.getTipoDocumentoGeneral(),this.tipodocumentogenerals);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoDocumentoGeneral.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoDocumentoGeneral.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoDocumentoGeneral();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoDocumentoGeneral() throws Exception {
		
		TipoDocumentoGeneralModel tipodocumentogeneralModel=(TipoDocumentoGeneralModel)this.jTableDatosTipoDocumentoGeneral.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodocumentogeneralModel.tipodocumentogenerals=this.tipodocumentogeneralLogic.getTipoDocumentoGenerals();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipodocumentogeneralModel.tipodocumentogenerals=this.tipodocumentogenerals;
		}
		
		
		((TipoDocumentoGeneralModel) this.jTableDatosTipoDocumentoGeneral.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoDocumentoGeneral() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipodocumentogeneralAnterior(),this.tipodocumentogeneralLogic.getTipoDocumentoGenerals());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipodocumentogeneralAnterior(),this.tipodocumentogenerals);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoDocumentoGeneral();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoDocumentoGeneral(TipoDocumentoGeneral tipodocumentogeneral,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
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
										
				TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodocumentogeneral,new Object(),generalEntityParameterGeneral,this.tipodocumentogeneralReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipodocumentogeneralSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoDocumentoGeneralConstantesFunciones.getClassesRelationshipsOfTipoDocumentoGeneral(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoDocumentoGeneralConstantesFunciones.getClassesRelationshipsFromStringsOfTipoDocumentoGeneral(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoDocumentoGeneral(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodocumentogeneral,new Object(),generalEntityParameterGeneral,this.tipodocumentogeneralReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoDocumentoGeneral(TipoDocumentoGeneralBean tipodocumentogeneralBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoDocumentoGeneral(ArrayList<Classe> classes,TipoDocumentoGeneralReturnGeneral tipodocumentogeneralReturnGeneral,TipoDocumentoGeneralBean tipodocumentogeneralBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoDocumentoGeneral(TipoDocumentoGeneral tipodocumentogeneral,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipodocumentogeneral)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoDocumentoGeneral = new TipoDocumentoGeneralDetalleFormJInternalFrame(jDesktopPane,this.tipodocumentogeneralSessionBean.getConGuardarRelaciones(),this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoDocumentoGeneral);
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.setVisible(false);
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.tipodocumentogeneralLogic=this.tipodocumentogeneralLogic;
		
		this.cargarCombosFrameForeignKeyTipoDocumentoGeneral("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoDocumentoGeneral();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoDocumentoGeneral();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoDocumentoGeneral("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoDocumentoGeneral();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoDocumentoGeneral"));
		
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonModificarTipoDocumentoGeneral.addActionListener(new ButtonActionListener(this,"ModificarTipoDocumentoGeneral"));

		
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonModificarToolBarTipoDocumentoGeneral.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoDocumentoGeneral"));
					
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jMenuItemModificarTipoDocumentoGeneral.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoDocumentoGeneral"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonActualizarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"ActualizarTipoDocumentoGeneral"));
		
		
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonActualizarToolBarTipoDocumentoGeneral.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoDocumentoGeneral"));
						
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jMenuItemActualizarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoDocumentoGeneral"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonEliminarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"EliminarTipoDocumentoGeneral"));
		
		
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonEliminarToolBarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoDocumentoGeneral"));
								
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jMenuItemEliminarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoDocumentoGeneral"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonCancelarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"CancelarTipoDocumentoGeneral"));
		
		
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonCancelarToolBarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoDocumentoGeneral"));
					
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jMenuItemCancelarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoDocumentoGeneral"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jMenuItemDetalleCerrarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoDocumentoGeneral"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonGuardarCambiosToolBarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDocumentoGeneral"));
		
		
		
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonGuardarCambiosToolBarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDocumentoGeneral"));
		
		
		
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jComboBoxTiposAccionesFormularioTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoDocumentoGeneral"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonidTipoDocumentoGeneralBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDocumentoGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtoncodigoTipoDocumentoGeneralBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDocumentoGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonnombreTipoDocumentoGeneralBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDocumentoGeneralBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTabbedPaneRelacionesTipoDocumentoGeneral.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoDocumentoGeneral"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoDocumentoGeneral"));
		
		if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoDocumentoGeneral"));
		}
		
		this.jTableDatosTipoDocumentoGeneral.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoDocumentoGeneral"));
		
		this.jTableDatosTipoDocumentoGeneral.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoDocumentoGeneral"));
		
		this.jButtonNuevoTipoDocumentoGeneral.addActionListener(new ButtonActionListener(this,"NuevoTipoDocumentoGeneral"));
		
		this.jButtonDuplicarTipoDocumentoGeneral.addActionListener(new ButtonActionListener(this,"DuplicarTipoDocumentoGeneral"));
		
		this.jButtonCopiarTipoDocumentoGeneral.addActionListener(new ButtonActionListener(this,"CopiarTipoDocumentoGeneral"));
		
		this.jButtonVerFormTipoDocumentoGeneral.addActionListener(new ButtonActionListener(this,"VerFormTipoDocumentoGeneral"));
		
		
		this.jButtonNuevoToolBarTipoDocumentoGeneral.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoDocumentoGeneral"));
			
		this.jButtonDuplicarToolBarTipoDocumentoGeneral.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoDocumentoGeneral"));
			
		this.jMenuItemNuevoTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoDocumentoGeneral"));
			
		this.jMenuItemDuplicarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoDocumentoGeneral"));		
		
		
		this.jButtonNuevoRelacionesTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoDocumentoGeneral"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoDocumentoGeneral.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoDocumentoGeneral"));
			
		this.jMenuItemNuevoRelacionesTipoDocumentoGeneral.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoDocumentoGeneral"));		
		
		
		if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonModificarTipoDocumentoGeneral.addActionListener(new ButtonActionListener(this,"ModificarTipoDocumentoGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonModificarToolBarTipoDocumentoGeneral.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoDocumentoGeneral"));
			
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jMenuItemModificarTipoDocumentoGeneral.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoDocumentoGeneral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonActualizarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"ActualizarTipoDocumentoGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonActualizarToolBarTipoDocumentoGeneral.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoDocumentoGeneral"));
				
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jMenuItemActualizarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoDocumentoGeneral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonEliminarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"EliminarTipoDocumentoGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonEliminarToolBarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoDocumentoGeneral"));
						
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jMenuItemEliminarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoDocumentoGeneral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonCancelarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"CancelarTipoDocumentoGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonCancelarToolBarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoDocumentoGeneral"));
			
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jMenuItemCancelarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoDocumentoGeneral"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoDocumentoGeneral"));		
		
		
		this.jButtonCerrarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"CerrarTipoDocumentoGeneral"));
		
		
		this.jButtonCerrarToolBarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoDocumentoGeneral"));
			
		this.jMenuItemCerrarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoDocumentoGeneral"));
			
		if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jMenuItemDetalleCerrarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoDocumentoGeneral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonGuardarCambiosTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoDocumentoGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonGuardarCambiosToolBarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDocumentoGeneral"));
		}
		
		this.jButtonCopiarToolBarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoDocumentoGeneral"));
			
		this.jButtonVerFormToolBarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoDocumentoGeneral"));
		
		this.jMenuItemGuardarCambiosTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoDocumentoGeneral"));
			
		this.jMenuItemCopiarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoDocumentoGeneral"));		
		
		this.jMenuItemVerFormTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoDocumentoGeneral"));		
		
		
		this.jButtonGuardarCambiosTablaTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoDocumentoGeneral"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoDocumentoGeneral"));
			
		this.jMenuItemGuardarCambiosTablaTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoDocumentoGeneral"));		
		
		
		
		this.jButtonRecargarInformacionTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoDocumentoGeneral"));
					
		this.jButtonRecargarInformacionToolBarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoDocumentoGeneral"));
		
		this.jMenuItemRecargarInformacionTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoDocumentoGeneral"));		
		
		
		
		this.jButtonAnterioresTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"AnterioresTipoDocumentoGeneral"));
		
		
		this.jButtonAnterioresToolBarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoDocumentoGeneral"));
		
		this.jMenuItemAnterioresTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoDocumentoGeneral"));		
		
		
		this.jButtonSiguientesTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"SiguientesTipoDocumentoGeneral"));
		
		
		this.jButtonSiguientesToolBarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoDocumentoGeneral"));
			
		this.jMenuItemSiguientesTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoDocumentoGeneral"));
			
		this.jMenuItemAbrirOrderByTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoDocumentoGeneral"));
			
		this.jMenuItemMostrarOcultarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoDocumentoGeneral"));
			
		this.jMenuItemDetalleAbrirOrderByTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoDocumentoGeneral"));
			
		this.jMenuItemDetalleMostarOcultarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoDocumentoGeneral"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoDocumentoGeneral"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoDocumentoGeneral"));
			
		this.jMenuItemNuevoGuardarCambiosTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoDocumentoGeneral"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoDocumentoGeneral.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoDocumentoGeneral"));

		this.jCheckBoxSeleccionadosTipoDocumentoGeneral.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoDocumentoGeneral"));
		
		if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jComboBoxTiposAccionesFormularioTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoDocumentoGeneral"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoDocumentoGeneral"));
			
		this.jComboBoxTiposAccionesTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoDocumentoGeneral"));
					
		this.jComboBoxTiposSeleccionarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoDocumentoGeneral"));
			
		this.jTextFieldValorCampoGeneralTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoDocumentoGeneral"));		
		
		
		if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonidTipoDocumentoGeneralBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDocumentoGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtoncodigoTipoDocumentoGeneralBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDocumentoGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonnombreTipoDocumentoGeneralBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDocumentoGeneralBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTipoDocumentoGeneral.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoDocumentoGeneral"));

			this.jButtonBusquedaPorIdTipoDocumentoGeneral.addActionListener(new ButtonActionListener(this,"BusquedaPorIdTipoDocumentoGeneral"));

			this.jButtonBusquedaPorNombreTipoDocumentoGeneral.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoDocumentoGeneral"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoDocumentoGeneral!=null) {
				this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDocumentoGeneral"));
				this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDocumentoGeneral"));
				this.jInternalFrameReporteDinamicoTipoDocumentoGeneral.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDocumentoGeneral"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDocumentoGeneral"));				
			//this.jButtonGenerarReporteDinamicoTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDocumentoGeneral"));
			//this.jButtonGenerarExcelReporteDinamicoTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDocumentoGeneral"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoDocumentoGeneral!=null) {
				this.jInternalFrameImportacionTipoDocumentoGeneral.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoDocumentoGeneral"));
				this.jInternalFrameImportacionTipoDocumentoGeneral.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoDocumentoGeneral"));
				this.jInternalFrameImportacionTipoDocumentoGeneral.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoDocumentoGeneral"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoDocumentoGeneral"));
			
			this.jButtonAbrirOrderByToolBarTipoDocumentoGeneral.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoDocumentoGeneral"));			
			
			if(this.jInternalFrameOrderByTipoDocumentoGeneral!=null) {
				this.jInternalFrameOrderByTipoDocumentoGeneral.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoDocumentoGeneral"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTabbedPaneRelacionesTipoDocumentoGeneral.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoDocumentoGeneral"));
		
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
            		closingInternalFrameTipoDocumentoGeneral();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoDocumentoGeneral = (JInternalFrameBase)event.getSource();
	            	
	            TipoDocumentoGeneralBeanSwingJInternalFrame jInternalFrameParent=(TipoDocumentoGeneralBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoDocumentoGeneral.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoDocumentoGeneralActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoDocumentoGeneral.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoDocumentoGeneralListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoDocumentoGeneral.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoDocumentoGeneral.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDocumentoGeneralActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDocumentoGeneralActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDocumentoGeneralActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoDocumentoGeneral";
		inputMap = this.jButtonNuevoTipoDocumentoGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoDocumentoGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoDocumentoGeneralActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDocumentoGeneralActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDocumentoGeneralActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDocumentoGeneralActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoDocumentoGeneral";
		inputMap = this.jButtonNuevoRelacionesTipoDocumentoGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoDocumentoGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoDocumentoGeneralActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoDocumentoGeneral";
		inputMap = this.jButtonModificarTipoDocumentoGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoDocumentoGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoDocumentoGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoDocumentoGeneral";
		inputMap = this.jButtonActualizarTipoDocumentoGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoDocumentoGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoDocumentoGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoDocumentoGeneral";
		inputMap = this.jButtonEliminarTipoDocumentoGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoDocumentoGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoDocumentoGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoDocumentoGeneral";
		inputMap = this.jButtonCancelarTipoDocumentoGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoDocumentoGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoDocumentoGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoDocumentoGeneral";
		inputMap = this.jButtonCerrarTipoDocumentoGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoDocumentoGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoDocumentoGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonGuardarCambiosTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoDocumentoGeneral";
		inputMap = this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonGuardarCambiosTipoDocumentoGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonGuardarCambiosTipoDocumentoGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoDocumentoGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoDocumentoGeneral.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoDocumentoGeneralItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoDocumentoGeneral.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoDocumentoGeneralActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoDocumentoGeneral.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoDocumentoGeneralActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoDocumentoGeneral.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoDocumentoGeneralActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonidTipoDocumentoGeneralBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDocumentoGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtoncodigoTipoDocumentoGeneralBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDocumentoGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jButtonnombreTipoDocumentoGeneralBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDocumentoGeneralBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTipoDocumentoGeneral.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoDocumentoGeneral"));

		this.jButtonBusquedaPorIdTipoDocumentoGeneral.addActionListener(new ButtonActionListener(this,"BusquedaPorIdTipoDocumentoGeneral"));

		this.jButtonBusquedaPorNombreTipoDocumentoGeneral.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoDocumentoGeneral"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoDocumentoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoDocumentoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoDocumentoGeneralActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoDocumentoGeneral.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoDocumentoGeneral(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoDocumentoGeneral tipodocumentogeneralAux:this.tipodocumentogeneralLogic.getTipoDocumentoGenerals()) {
					tipodocumentogeneralAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDocumentoGeneral tipodocumentogeneralAux:tipodocumentogenerals) {
					tipodocumentogeneralAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoDocumentoGeneralItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoDocumentoGeneral(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoDocumentoGeneral tipodocumentogeneralAux:this.tipodocumentogeneralLogic.getTipoDocumentoGenerals()) {
						tipodocumentogeneralAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDocumentoGeneral tipodocumentogeneralAux:tipodocumentogenerals) {
						tipodocumentogeneralAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoDocumentoGeneral tipodocumentogeneralAux:this.tipodocumentogeneralLogic.getTipoDocumentoGenerals()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDocumentoGeneral tipodocumentogeneralAux:tipodocumentogenerals) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoDocumentoGeneral(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoDocumentoGeneral.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoDocumentoGeneral.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoDocumentoGeneral,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoDocumentoGeneralItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoDocumentoGeneral(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoDocumentoGeneral.getSelectedRows();
			
			TipoDocumentoGeneral tipodocumentogeneralLocal=new TipoDocumentoGeneral();
			
			//this.seleccionarTodosTipoDocumentoGeneral(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodocumentogeneralLocal =(TipoDocumentoGeneral) this.tipodocumentogeneralLogic.getTipoDocumentoGenerals().toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipodocumentogeneralLocal =(TipoDocumentoGeneral) this.tipodocumentogenerals.toArray()[this.jTableDatosTipoDocumentoGeneral.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipodocumentogeneralLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoDocumentoGeneral tipodocumentogeneralAux:this.tipodocumentogeneralLogic.getTipoDocumentoGenerals()) {
						tipodocumentogeneralAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDocumentoGeneral tipodocumentogeneralAux:tipodocumentogenerals) {
						tipodocumentogeneralAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoDocumentoGeneral(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoDocumentoGeneral.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoDocumentoGeneral.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoDocumentoGeneral,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoDocumentoGeneralItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoDocumentoGeneralParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoDocumentoGeneralActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoDocumentoGeneral(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoDocumentoGeneral.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoDocumentoGeneral tipodocumentogeneralAux:this.tipodocumentogeneralLogic.getTipoDocumentoGenerals()) {
				
						if(sTipoSeleccionar.equals(TipoDocumentoGeneralConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipodocumentogeneralAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoDocumentoGeneralConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipodocumentogeneralAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDocumentoGeneral tipodocumentogeneralAux:tipodocumentogenerals) {
					
						if(sTipoSeleccionar.equals(TipoDocumentoGeneralConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipodocumentogeneralAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoDocumentoGeneralConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipodocumentogeneralAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoDocumentoGeneral(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoDocumentoGeneralActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoDocumentoGeneral(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoDocumentoGeneral=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoDocumentoGeneral.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoDocumentoGeneral.jComboBoxTiposAccionesFormularioTipoDocumentoGeneral.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoDocumentoGeneral) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoDocumentoGeneral(conSplash);
				
					this.generarReporteTipoDocumentoGeneralsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDocumentoGeneral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDocumentoGeneral.jComboBoxTiposAccionesFormularioTipoDocumentoGeneral.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoDocumentoGeneralsSeleccionados();
				//this.jComboBoxTiposAccionesTipoDocumentoGeneral.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoDocumentoGeneralsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoDocumentoGeneral.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoDocumentoGeneralsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoDocumentoGeneral.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoDocumentoGeneral();
				
				this.exportarTipoDocumentoGeneralsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDocumentoGeneral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDocumentoGeneral.jComboBoxTiposAccionesFormularioTipoDocumentoGeneral.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoDocumentoGenerals();
				//this.importarTipoDocumentoGenerals();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDocumentoGeneral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDocumentoGeneral.jComboBoxTiposAccionesFormularioTipoDocumentoGeneral.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoDocumentoGeneral();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoDocumentoGeneralsSeleccionados();
				//this.jComboBoxTiposAccionesTipoDocumentoGeneral.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Documento General", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoDocumentoGeneral();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoDocumentoGeneral)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoDocumentoGeneral(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Documento General",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDocumentoGeneral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDocumentoGeneral.jComboBoxTiposAccionesFormularioTipoDocumentoGeneral.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoDocumentoGeneralBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoDocumentoGeneral) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoDocumentoGeneral(conSplash);
					
						//this.actualizarParametrosGeneralTipoDocumentoGeneral();
						
						this.generarReporteProcesoAccionTipoDocumentoGeneralsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoDocumentoGeneral.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoDocumentoGeneral.jComboBoxTiposAccionesFormularioTipoDocumentoGeneral.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Documento GeneralS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Documento General", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoDocumentoGeneral();
				
						this.actualizarParametrosGeneralTipoDocumentoGeneral();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipodocumentogeneralReturnGeneral=tipodocumentogeneralLogic.procesarAccionTipoDocumentoGeneralsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipodocumentogeneralLogic.getTipoDocumentoGenerals(),this.tipodocumentogeneralParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoDocumentoGeneralReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoDocumentoGeneral.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoDocumentoGeneral.jComboBoxTiposAccionesFormularioTipoDocumentoGeneral.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoDocumentoGeneral();
					
					TipoDocumentoGeneralBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoDocumentoGeneralReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoDocumentoGeneral.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoDocumentoGeneral.jComboBoxTiposAccionesFormularioTipoDocumentoGeneral.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoDocumentoGeneral(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoDocumentoGeneralActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoDocumentoGeneral();
			
			if(this.jInternalFrameDetalleFormTipoDocumentoGeneral==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoDocumentoGeneral> tipodocumentogeneralsSeleccionados=new ArrayList<TipoDocumentoGeneral>();		
			TipoDocumentoGeneral tipodocumentogeneral=new TipoDocumentoGeneral();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoDocumentoGeneral(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoDocumentoGeneral.getSelectedItem();
			
			
			
			
			tipodocumentogeneralsSeleccionados=this.getTipoDocumentoGeneralsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipodocumentogeneralsSeleccionados.size()==1) {
				for(TipoDocumentoGeneral tipodocumentogeneralAux:tipodocumentogeneralsSeleccionados) {
					tipodocumentogeneral=tipodocumentogeneralAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoDocumentoGeneral();
			
      		//this.finishProcessTipoDocumentoGeneral(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoDocumentoGeneralReturnGeneral() throws Exception {
		if(this.tipodocumentogeneralReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipodocumentogeneralReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipodocumentogeneralReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipodocumentogeneralReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipodocumentogeneralReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipodocumentogeneralReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoDocumentoGeneral(false);
		}
		
		if(this.tipodocumentogeneralReturnGeneral.getConRetornoLista() || this.tipodocumentogeneralReturnGeneral.getConRetornoObjeto()) {
			if(this.tipodocumentogeneralReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipodocumentogeneralLogic.setTipoDocumentoGenerals(this.tipodocumentogeneralReturnGeneral.getTipoDocumentoGenerals());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipodocumentogeneralReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipodocumentogeneralLogic.setTipoDocumentoGeneral(this.tipodocumentogeneralReturnGeneral.getTipoDocumentoGeneral());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoDocumentoGeneral(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoDocumentoGeneral() throws Exception {
		
		
	}
	
	public ArrayList<TipoDocumentoGeneral> getTipoDocumentoGeneralsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoDocumentoGeneral> tipodocumentogeneralsSeleccionados=new ArrayList<TipoDocumentoGeneral>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoDocumentoGeneral) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoDocumentoGeneral tipodocumentogeneralAux:tipodocumentogeneralLogic.getTipoDocumentoGenerals()) {
					if(tipodocumentogeneralAux.getIsSelected()) {
						tipodocumentogeneralsSeleccionados.add(tipodocumentogeneralAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDocumentoGeneral tipodocumentogeneralAux:this.tipodocumentogenerals) {
					if(tipodocumentogeneralAux.getIsSelected()) {
						tipodocumentogeneralsSeleccionados.add(tipodocumentogeneralAux);				
					}
				}
			}
			
			if(tipodocumentogeneralsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipodocumentogeneralsSeleccionados.addAll(this.tipodocumentogeneralLogic.getTipoDocumentoGenerals());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipodocumentogeneralsSeleccionados.addAll(this.tipodocumentogenerals);				
					}
				}
			}
		} else {
			tipodocumentogeneralsSeleccionados.add(this.tipodocumentogeneral);
		}
		
		return tipodocumentogeneralsSeleccionados;
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
	
	public void generarReporteTipoDocumentoGeneralsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoDocumentoGeneralsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoDocumentoGeneralsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoDocumentoGeneralsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoDocumentoGeneralsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Documento General",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoDocumentoGeneralsSeleccionados() throws Exception {
		ArrayList<TipoDocumentoGeneral> tipodocumentogeneralsSeleccionados=new ArrayList<TipoDocumentoGeneral>();		
		
		tipodocumentogeneralsSeleccionados=this.getTipoDocumentoGeneralsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoDocumentoGenerals("Todos",tipodocumentogeneralsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoDocumentoGeneralsSeleccionados() throws Exception {
		ArrayList<TipoDocumentoGeneral> tipodocumentogeneralsSeleccionados=new ArrayList<TipoDocumentoGeneral>();		
		
		tipodocumentogeneralsSeleccionados=this.getTipoDocumentoGeneralsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoDocumentoGenerals("Todos",tipodocumentogeneralsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoDocumentoGeneralsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoDocumentoGeneral> tipodocumentogeneralsSeleccionados=new ArrayList<TipoDocumentoGeneral>();
		
		tipodocumentogeneralsSeleccionados=this.getTipoDocumentoGeneralsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoDocumentoGenerals("Todos",tipodocumentogeneralsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoDocumentoGeneralsSeleccionados() throws Exception {
		ArrayList<TipoDocumentoGeneral> tipodocumentogeneralsSeleccionados=new ArrayList<TipoDocumentoGeneral>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoDocumentoGeneral();
		
		
		tipodocumentogeneralsSeleccionados=this.getTipoDocumentoGeneralsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoDocumentoGeneral();
		
		
		//this.generarReporteTipoDocumentoGenerals("Todos",tipodocumentogeneralsSeleccionados ,tipodocumentogeneralImplementable,tipodocumentogeneralImplementableHome);
	}
	
	public void mostrarImportacionTipoDocumentoGenerals() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoDocumentoGeneral();
		
		this.abrirFrameImportacionTipoDocumentoGeneral();		
		
			
		//this.generarReporteTipoDocumentoGenerals("Todos",tipodocumentogeneralsSeleccionados ,tipodocumentogeneralImplementable,tipodocumentogeneralImplementableHome);
	}
	
	public void importarTipoDocumentoGenerals() throws Exception {		
	
	}
	
	public void exportarTipoDocumentoGeneralsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoDocumentoGeneralsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoDocumentoGeneralsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoDocumentoGeneralsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Documento General",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoDocumentoGeneralsSeleccionados() throws Exception {
		ArrayList<TipoDocumentoGeneral> tipodocumentogeneralsSeleccionados=new ArrayList<TipoDocumentoGeneral>();		
		
		tipodocumentogeneralsSeleccionados=this.getTipoDocumentoGeneralsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodocumentogeneral."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoDocumentoGeneral(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoDocumentoGeneral tipodocumentogeneralAux:tipodocumentogeneralsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoDocumentoGeneral(tipodocumentogeneralAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipodocumentogeneralAux.setsDetalleGeneralEntityReporte(tipodocumentogeneralAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Documento General",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoDocumentoGeneral(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoDocumentoGeneralConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDocumentoGeneralConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDocumentoGeneralConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDocumentoGeneralConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoDocumentoGeneral(TipoDocumentoGeneral tipodocumentogeneral,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipodocumentogeneral.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodocumentogeneral.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodocumentogeneral.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodocumentogeneral.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoDocumentoGeneralsSeleccionados() throws Exception {
		ArrayList<TipoDocumentoGeneral> tipodocumentogeneralsSeleccionados=new ArrayList<TipoDocumentoGeneral>();		
		
		tipodocumentogeneralsSeleccionados=this.getTipoDocumentoGeneralsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodocumentogeneral.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoDocumentoGenerals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoDocumentoGeneral(row);				
				iRow++;
			}				
			
			for(TipoDocumentoGeneral tipodocumentogeneralAux:tipodocumentogeneralsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoDocumentoGeneral(tipodocumentogeneralAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Documento General",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoDocumentoGeneralsSeleccionados() throws Exception {
		ArrayList<TipoDocumentoGeneral> tipodocumentogeneralsSeleccionados=new ArrayList<TipoDocumentoGeneral>();		
		
		tipodocumentogeneralsSeleccionados=this.getTipoDocumentoGeneralsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodocumentogeneral.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipodocumentogenerals");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipodocumentogeneral");
			//elementRoot.appendChild(element);
		
			for(TipoDocumentoGeneral tipodocumentogeneralAux:tipodocumentogeneralsSeleccionados) {
				element = document.createElement("tipodocumentogeneral");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoDocumentoGeneral(tipodocumentogeneralAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Documento General",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoDocumentoGeneral(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDocumentoGeneralConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDocumentoGeneralConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoDocumentoGeneralConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDocumentoGeneralConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoDocumentoGeneral(TipoDocumentoGeneral tipodocumentogeneral,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipodocumentogeneral.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodocumentogeneral.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodocumentogeneral.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoDocumentoGeneral(TipoDocumentoGeneral tipodocumentogeneral,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoDocumentoGeneralConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipodocumentogeneral.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoDocumentoGeneralConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipodocumentogeneral.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoDocumentoGeneralConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipodocumentogeneral.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoDocumentoGeneralConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipodocumentogeneral.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoDocumentoGeneralsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoDocumentoGeneral> tipodocumentogeneralsSeleccionados=new ArrayList<TipoDocumentoGeneral>();
		
		tipodocumentogeneralsSeleccionados=this.getTipoDocumentoGeneralsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoDocumentoGeneral(tipodocumentogeneralsSeleccionados);
		
		this.generarReporteTipoDocumentoGenerals("Todos",tipodocumentogeneralsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoDocumentoGeneral(ArrayList<TipoDocumentoGeneral> tipodocumentogeneralsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoDocumentoGeneral tipodocumentogeneralAux:tipodocumentogeneralsSeleccionados) {
				tipodocumentogeneralAux.setsDetalleGeneralEntityReporte(tipodocumentogeneralAux.toString());
			
				if(sTipoSeleccionar.equals(TipoDocumentoGeneralConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipodocumentogeneralAux.setsDescripcionGeneralEntityReporte1(tipodocumentogeneralAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoDocumentoGeneralConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipodocumentogeneralAux.setsDescripcionGeneralEntityReporte1(tipodocumentogeneralAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDocumentoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoDocumentoGeneral(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoDocumentoGeneral=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoGeneral=true;
				this.isVisibilidadCeldaGuardarCambiosTipoDocumentoGeneral=true;
			}
			
			this.isVisibilidadCeldaModificarTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaActualizarTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaEliminarTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaCancelarTipoDocumentoGeneral=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDocumentoGeneral=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDocumentoGeneral=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaModificarTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaActualizarTipoDocumentoGeneral=true;
			this.isVisibilidadCeldaEliminarTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaCancelarTipoDocumentoGeneral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDocumentoGeneral=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDocumentoGeneral=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaModificarTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaActualizarTipoDocumentoGeneral=true;
			this.isVisibilidadCeldaEliminarTipoDocumentoGeneral=true;
			this.isVisibilidadCeldaCancelarTipoDocumentoGeneral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDocumentoGeneral=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDocumentoGeneral=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaModificarTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaActualizarTipoDocumentoGeneral=true;
			this.isVisibilidadCeldaEliminarTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaCancelarTipoDocumentoGeneral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDocumentoGeneral=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDocumentoGeneral=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoDocumentoGeneral=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoGeneral=true;
			this.isVisibilidadCeldaGuardarCambiosTipoDocumentoGeneral=true;
			this.isVisibilidadCeldaModificarTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaActualizarTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaEliminarTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaCancelarTipoDocumentoGeneral=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDocumentoGeneral=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDocumentoGeneral=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaActualizarTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaEliminarTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaCancelarTipoDocumentoGeneral=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDocumentoGeneral=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDocumentoGeneral=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaModificarTipoDocumentoGeneral=true;
			this.isVisibilidadCeldaActualizarTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaEliminarTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaCancelarTipoDocumentoGeneral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDocumentoGeneral=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDocumentoGeneral=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoDocumentoGeneralJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoDocumentoGeneral=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoGeneral=true;
			this.isVisibilidadCeldaGuardarCambiosTipoDocumentoGeneral=true;
		} else {
			this.actualizarEstadoPanelsTipoDocumentoGeneral(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoDocumentoGeneral=false;
			//this.isVisibilidadCeldaVerFormTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaDuplicarTipoDocumentoGeneral=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipodocumentogeneralSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoGeneral=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDocumentoGeneral=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {
			if(!tipodocumentogeneralSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoGeneral=false;												
			}
			
			this.jButtonCerrarTipoDocumentoGeneral.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoDocumentoGeneral=false;
		}
		
		if(!this.permiteMantenimiento(this.tipodocumentogeneral)) {
			this.isVisibilidadCeldaActualizarTipoDocumentoGeneral=false;
			this.isVisibilidadCeldaEliminarTipoDocumentoGeneral=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoDocumentoGeneral() {
	}
	
	public void actualizarEstadoPanelsTipoDocumentoGeneral(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoDocumentoGeneral!=null) {
				this.jScrollPanelDatosEdicionTipoDocumentoGeneral.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDocumentoGeneral!=null) {
				this.jTabbedPaneBusquedasTipoDocumentoGeneral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDocumentoGeneral!=null) {
				this.jScrollPanelDatosTipoDocumentoGeneral.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDocumentoGeneral!=null) {
				this.jPanelPaginacionTipoDocumentoGeneral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDocumentoGeneral!=null) {
				this.jPanelParametrosReportesTipoDocumentoGeneral.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoDocumentoGeneral!=null) {
				this.jScrollPanelDatosEdicionTipoDocumentoGeneral.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDocumentoGeneral!=null) {
				this.jTabbedPaneBusquedasTipoDocumentoGeneral.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoDocumentoGeneral!=null) {
				this.jScrollPanelDatosTipoDocumentoGeneral.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDocumentoGeneral!=null) {
				this.jPanelPaginacionTipoDocumentoGeneral.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDocumentoGeneral!=null) {
				this.jPanelParametrosReportesTipoDocumentoGeneral.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoDocumentoGeneral!=null) {
				this.jScrollPanelDatosEdicionTipoDocumentoGeneral.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDocumentoGeneral!=null) {
				this.jTabbedPaneBusquedasTipoDocumentoGeneral.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoDocumentoGeneral!=null) {
				this.jScrollPanelDatosTipoDocumentoGeneral.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDocumentoGeneral!=null) {
				this.jPanelPaginacionTipoDocumentoGeneral.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDocumentoGeneral!=null) {
				this.jPanelParametrosReportesTipoDocumentoGeneral.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoDocumentoGeneral!=null) {
				this.jScrollPanelDatosEdicionTipoDocumentoGeneral.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDocumentoGeneral!=null) {
				this.jTabbedPaneBusquedasTipoDocumentoGeneral.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoDocumentoGeneral!=null) {
				this.jScrollPanelDatosTipoDocumentoGeneral.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDocumentoGeneral!=null) {
				this.jPanelPaginacionTipoDocumentoGeneral.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDocumentoGeneral!=null) {
				this.jPanelParametrosReportesTipoDocumentoGeneral.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoDocumentoGeneral!=null) {
				this.jScrollPanelDatosEdicionTipoDocumentoGeneral.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDocumentoGeneral!=null) {
				this.jTabbedPaneBusquedasTipoDocumentoGeneral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDocumentoGeneral!=null) {
				this.jScrollPanelDatosTipoDocumentoGeneral.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDocumentoGeneral!=null) {
				this.jPanelPaginacionTipoDocumentoGeneral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDocumentoGeneral!=null) {
				this.jPanelParametrosReportesTipoDocumentoGeneral.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoDocumentoGeneral!=null) {
				this.jScrollPanelDatosEdicionTipoDocumentoGeneral.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDocumentoGeneral!=null) {
				this.jTabbedPaneBusquedasTipoDocumentoGeneral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDocumentoGeneral!=null) {
				this.jScrollPanelDatosTipoDocumentoGeneral.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDocumentoGeneral!=null) {
				this.jPanelPaginacionTipoDocumentoGeneral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDocumentoGeneral!=null) {
				this.jPanelParametrosReportesTipoDocumentoGeneral.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoDocumentoGeneral!=null) {
				this.jScrollPanelDatosEdicionTipoDocumentoGeneral.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDocumentoGeneral!=null) {
				this.jTabbedPaneBusquedasTipoDocumentoGeneral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDocumentoGeneral!=null) {
				this.jScrollPanelDatosTipoDocumentoGeneral.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDocumentoGeneral!=null) {
				this.jPanelPaginacionTipoDocumentoGeneral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDocumentoGeneral!=null) {
				this.jPanelParametrosReportesTipoDocumentoGeneral.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoDocumentoGeneral!=null) {
					this.jTabbedPaneBusquedasTipoDocumentoGeneral.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoDocumentoGeneral!=null) {
				this.jPanelParametrosReportesTipoDocumentoGeneral.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipodocumentogeneralSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDocumentoGeneral!=null) {
				this.jTabbedPaneBusquedasTipoDocumentoGeneral.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoDocumentoGeneral!=null) {
				this.jPanelParametrosReportesTipoDocumentoGeneral.setVisible(true);
			}
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoDocumentoGeneralSessionBean tipodocumentogeneralSessionBean=new TipoDocumentoGeneralSessionBean();
		
		if(this.tipodocumentogeneralSessionBean==null) {
			this.tipodocumentogeneralSessionBean=new TipoDocumentoGeneralSessionBean();
		}
		
		this.tipodocumentogeneralSessionBean.setsUltimaBusquedaTipoDocumentoGeneral(this.getsAccionBusqueda());
		this.tipodocumentogeneralSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipodocumentogeneralSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			tipodocumentogeneralSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorId")) {
			tipodocumentogeneralSessionBean.setid(this.getidBusquedaPorId());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipodocumentogeneralSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoDocumentoGeneralSessionBean tipodocumentogeneralSessionBean=new TipoDocumentoGeneralSessionBean();
		
		if(this.tipodocumentogeneralSessionBean==null) {
			this.tipodocumentogeneralSessionBean=new TipoDocumentoGeneralSessionBean();
		}
		
		if(this.tipodocumentogeneralSessionBean.getsUltimaBusquedaTipoDocumentoGeneral()!=null&&!this.tipodocumentogeneralSessionBean.getsUltimaBusquedaTipoDocumentoGeneral().equals("")) {
			this.setsAccionBusqueda(tipodocumentogeneralSessionBean.getsUltimaBusquedaTipoDocumentoGeneral());
			this.setiNumeroPaginacion(tipodocumentogeneralSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipodocumentogeneralSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(tipodocumentogeneralSessionBean.getcodigo());
				tipodocumentogeneralSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorId")) {
				this.setidBusquedaPorId(tipodocumentogeneralSessionBean.getid());
				tipodocumentogeneralSessionBean.setid(0L);
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipodocumentogeneralSessionBean.getnombre());
				tipodocumentogeneralSessionBean.setnombre("");
			}
		}
		
		this.tipodocumentogeneralSessionBean.setsUltimaBusquedaTipoDocumentoGeneral("");
		this.tipodocumentogeneralSessionBean.setiNumeroPaginacion(TipoDocumentoGeneralConstantesFunciones.INUMEROPAGINACION);
		this.tipodocumentogeneralSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoDocumentoGeneral(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoDocumentoGeneral() {
		this.updateBorderResaltarBusquedasFormularioTipoDocumentoGeneral();
		this.updateVisibilidadBusquedasFormularioTipoDocumentoGeneral();
		this.updateHabilitarBusquedasFormularioTipoDocumentoGeneral();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoDocumentoGeneral() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoDocumentoGeneral.getComponents().length>0) {
	

		if(this.tipodocumentogeneralConstantesFunciones.resaltarBusquedaPorCodigoTipoDocumentoGeneral!=null) {
			index= this.jTabbedPaneBusquedasTipoDocumentoGeneral.indexOfComponent(this.jPanelBusquedaPorCodigoTipoDocumentoGeneral);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumentoGeneral.getComponent(index);
				jPanel.setBorder(this.tipodocumentogeneralConstantesFunciones.resaltarBusquedaPorCodigoTipoDocumentoGeneral);
			}
		}

		if(this.tipodocumentogeneralConstantesFunciones.resaltarBusquedaPorIdTipoDocumentoGeneral!=null) {
			index= this.jTabbedPaneBusquedasTipoDocumentoGeneral.indexOfComponent(this.jPanelBusquedaPorIdTipoDocumentoGeneral);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumentoGeneral.getComponent(index);
				jPanel.setBorder(this.tipodocumentogeneralConstantesFunciones.resaltarBusquedaPorIdTipoDocumentoGeneral);
			}
		}

		if(this.tipodocumentogeneralConstantesFunciones.resaltarBusquedaPorNombreTipoDocumentoGeneral!=null) {
			index= this.jTabbedPaneBusquedasTipoDocumentoGeneral.indexOfComponent(this.jPanelBusquedaPorNombreTipoDocumentoGeneral);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumentoGeneral.getComponent(index);
				jPanel.setBorder(this.tipodocumentogeneralConstantesFunciones.resaltarBusquedaPorNombreTipoDocumentoGeneral);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoDocumentoGeneral() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoDocumentoGeneral.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoDocumentoGeneral.indexOfComponent(this.jPanelBusquedaPorCodigoTipoDocumentoGeneral);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumentoGeneral.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipodocumentogeneralConstantesFunciones.mostrarBusquedaPorCodigoTipoDocumentoGeneral);
			if(!this.tipodocumentogeneralConstantesFunciones.mostrarBusquedaPorCodigoTipoDocumentoGeneral && index>-1) {
				this.jTabbedPaneBusquedasTipoDocumentoGeneral.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoDocumentoGeneral.indexOfComponent(this.jPanelBusquedaPorIdTipoDocumentoGeneral);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumentoGeneral.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipodocumentogeneralConstantesFunciones.mostrarBusquedaPorIdTipoDocumentoGeneral);
			if(!this.tipodocumentogeneralConstantesFunciones.mostrarBusquedaPorIdTipoDocumentoGeneral && index>-1) {
				this.jTabbedPaneBusquedasTipoDocumentoGeneral.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoDocumentoGeneral.indexOfComponent(this.jPanelBusquedaPorNombreTipoDocumentoGeneral);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumentoGeneral.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipodocumentogeneralConstantesFunciones.mostrarBusquedaPorNombreTipoDocumentoGeneral);
			if(!this.tipodocumentogeneralConstantesFunciones.mostrarBusquedaPorNombreTipoDocumentoGeneral && index>-1) {
				this.jTabbedPaneBusquedasTipoDocumentoGeneral.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoDocumentoGeneral() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoDocumentoGeneral.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoDocumentoGeneral.indexOfComponent(this.jPanelBusquedaPorCodigoTipoDocumentoGeneral);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumentoGeneral.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipodocumentogeneralConstantesFunciones.activarBusquedaPorCodigoTipoDocumentoGeneral);
				this.jTabbedPaneBusquedasTipoDocumentoGeneral.setEnabledAt(index,this.tipodocumentogeneralConstantesFunciones.activarBusquedaPorCodigoTipoDocumentoGeneral);
			}

			index= this.jTabbedPaneBusquedasTipoDocumentoGeneral.indexOfComponent(this.jPanelBusquedaPorIdTipoDocumentoGeneral);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumentoGeneral.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipodocumentogeneralConstantesFunciones.activarBusquedaPorIdTipoDocumentoGeneral);
				this.jTabbedPaneBusquedasTipoDocumentoGeneral.setEnabledAt(index,this.tipodocumentogeneralConstantesFunciones.activarBusquedaPorIdTipoDocumentoGeneral);
			}

			index= this.jTabbedPaneBusquedasTipoDocumentoGeneral.indexOfComponent(this.jPanelBusquedaPorNombreTipoDocumentoGeneral);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumentoGeneral.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipodocumentogeneralConstantesFunciones.activarBusquedaPorNombreTipoDocumentoGeneral);
				this.jTabbedPaneBusquedasTipoDocumentoGeneral.setEnabledAt(index,this.tipodocumentogeneralConstantesFunciones.activarBusquedaPorNombreTipoDocumentoGeneral);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoDocumentoGeneral(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTipoDocumentoGeneral.indexOfComponent(this.jPanelBusquedaPorCodigoTipoDocumentoGeneral);

			this.jTabbedPaneBusquedasTipoDocumentoGeneral.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumentoGeneral.getComponent(index);

			this.tipodocumentogeneralConstantesFunciones.setResaltarBusquedaPorCodigoTipoDocumentoGeneral(resaltar);

			jPanel.setBorder(this.tipodocumentogeneralConstantesFunciones.resaltarBusquedaPorCodigoTipoDocumentoGeneral);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorId")) {
			index= this.jTabbedPaneBusquedasTipoDocumentoGeneral.indexOfComponent(this.jPanelBusquedaPorIdTipoDocumentoGeneral);

			this.jTabbedPaneBusquedasTipoDocumentoGeneral.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumentoGeneral.getComponent(index);

			this.tipodocumentogeneralConstantesFunciones.setResaltarBusquedaPorIdTipoDocumentoGeneral(resaltar);

			jPanel.setBorder(this.tipodocumentogeneralConstantesFunciones.resaltarBusquedaPorIdTipoDocumentoGeneral);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoDocumentoGeneral.indexOfComponent(this.jPanelBusquedaPorNombreTipoDocumentoGeneral);

			this.jTabbedPaneBusquedasTipoDocumentoGeneral.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDocumentoGeneral.getComponent(index);

			this.tipodocumentogeneralConstantesFunciones.setResaltarBusquedaPorNombreTipoDocumentoGeneral(resaltar);

			jPanel.setBorder(this.tipodocumentogeneralConstantesFunciones.resaltarBusquedaPorNombreTipoDocumentoGeneral);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoDocumentoGeneral.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoDocumentoGeneral() throws Exception {

		if(this.jInternalFrameDetalleFormTipoDocumentoGeneral==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoDocumentoGeneral();
		this.updateVisibilidadResaltarControlesFormularioTipoDocumentoGeneral();
		this.updateHabilitarResaltarControlesFormularioTipoDocumentoGeneral();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoDocumentoGeneral() throws Exception {
		if(this.jInternalFrameDetalleFormTipoDocumentoGeneral==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipodocumentogeneralConstantesFunciones.resaltaridTipoDocumentoGeneral!=null && this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) {this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTextFieldidTipoDocumentoGeneral.setBorder(this.tipodocumentogeneralConstantesFunciones.resaltaridTipoDocumentoGeneral);}
		if(this.tipodocumentogeneralConstantesFunciones.resaltarcodigoTipoDocumentoGeneral!=null && this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) {this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTextFieldcodigoTipoDocumentoGeneral.setBorder(this.tipodocumentogeneralConstantesFunciones.resaltarcodigoTipoDocumentoGeneral);}
		if(this.tipodocumentogeneralConstantesFunciones.resaltarnombreTipoDocumentoGeneral!=null && this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) {this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTextAreanombreTipoDocumentoGeneral.setBorder(this.tipodocumentogeneralConstantesFunciones.resaltarnombreTipoDocumentoGeneral);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoDocumentoGeneral() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoDocumentoGeneral==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) {
	
		//this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTextFieldidTipoDocumentoGeneral.setVisible(this.tipodocumentogeneralConstantesFunciones.mostraridTipoDocumentoGeneral);
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jPanelidTipoDocumentoGeneral.setVisible(this.tipodocumentogeneralConstantesFunciones.mostraridTipoDocumentoGeneral);
		//this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTextFieldcodigoTipoDocumentoGeneral.setVisible(this.tipodocumentogeneralConstantesFunciones.mostrarcodigoTipoDocumentoGeneral);
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jPanelcodigoTipoDocumentoGeneral.setVisible(this.tipodocumentogeneralConstantesFunciones.mostrarcodigoTipoDocumentoGeneral);
		//this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTextAreanombreTipoDocumentoGeneral.setVisible(this.tipodocumentogeneralConstantesFunciones.mostrarnombreTipoDocumentoGeneral);
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jPanelnombreTipoDocumentoGeneral.setVisible(this.tipodocumentogeneralConstantesFunciones.mostrarnombreTipoDocumentoGeneral);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoDocumentoGeneral() throws Exception {
		if(this.jInternalFrameDetalleFormTipoDocumentoGeneral==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoDocumentoGeneral!=null) {
	
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTextFieldidTipoDocumentoGeneral.setEnabled(this.tipodocumentogeneralConstantesFunciones.activaridTipoDocumentoGeneral);
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTextFieldcodigoTipoDocumentoGeneral.setEnabled(this.tipodocumentogeneralConstantesFunciones.activarcodigoTipoDocumentoGeneral);
		this.jInternalFrameDetalleFormTipoDocumentoGeneral.jTextAreanombreTipoDocumentoGeneral.setEnabled(this.tipodocumentogeneralConstantesFunciones.activarnombreTipoDocumentoGeneral);
		}
	}
	
		
}