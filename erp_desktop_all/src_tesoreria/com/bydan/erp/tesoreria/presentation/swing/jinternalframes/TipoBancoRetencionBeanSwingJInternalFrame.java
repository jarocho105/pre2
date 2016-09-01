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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;




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

import com.bydan.erp.tesoreria.util.TipoBancoRetencionConstantesFunciones;
import com.bydan.erp.tesoreria.util.TipoBancoRetencionParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.TipoBancoRetencionParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.TipoBancoRetencionBean;
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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.tesoreria.resources.reportes.AuxiliarReportes;


import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.tesoreria.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
public class TipoBancoRetencionBeanSwingJInternalFrame extends TipoBancoRetencionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoBancoRetencionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoBancoRetencion> tipobancoretencionValidator = new ClassValidator<TipoBancoRetencion>(TipoBancoRetencion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoBancoRetencion tipobancoretencion;	
	public TipoBancoRetencion tipobancoretencionAux;
	public TipoBancoRetencion tipobancoretencionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoBancoRetencion tipobancoretencionTotales;
	public Long idTipoBancoRetencionActual;
	public Long iIdNuevoTipoBancoRetencion=0L;
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
	
	public Boolean isPermisoTodoTipoBancoRetencion;
	public Boolean isPermisoNuevoTipoBancoRetencion;
	public Boolean isPermisoActualizarTipoBancoRetencion;
	public Boolean isPermisoActualizarOriginalTipoBancoRetencion;
	public Boolean isPermisoEliminarTipoBancoRetencion;
	public Boolean isPermisoGuardarCambiosTipoBancoRetencion;
	public Boolean isPermisoConsultaTipoBancoRetencion;
	public Boolean isPermisoBusquedaTipoBancoRetencion;
	public Boolean isPermisoReporteTipoBancoRetencion;
	public Boolean isPermisoPaginacionMedioTipoBancoRetencion;
	public Boolean isPermisoPaginacionAltoTipoBancoRetencion;
	public Boolean isPermisoPaginacionTodoTipoBancoRetencion;
	public Boolean isPermisoCopiarTipoBancoRetencion;
	public Boolean isPermisoVerFormTipoBancoRetencion;
	public Boolean isPermisoDuplicarTipoBancoRetencion;
	public Boolean isPermisoOrdenTipoBancoRetencion;
	
	
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
	
	public TipoBancoRetencionParameterReturnGeneral tipobancoretencionReturnGeneral;
	public TipoBancoRetencionParameterReturnGeneral tipobancoretencionParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoBancoRetencion=false;
	public Boolean esParaAccionDesdeFormularioTipoBancoRetencion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoBancoRetencionSessionBeanAdditional tipobancoretencionSessionBeanAdditional=null;
	
	public TipoBancoRetencionSessionBeanAdditional getTipoBancoRetencionSessionBeanAdditional() {
		return this.tipobancoretencionSessionBeanAdditional;
	}
	
	public void setTipoBancoRetencionSessionBeanAdditional(TipoBancoRetencionSessionBeanAdditional tipobancoretencionSessionBeanAdditional) {
		try {
			this.tipobancoretencionSessionBeanAdditional=tipobancoretencionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoBancoRetencionBeanSwingJInternalFrameAdditional tipobancoretencionBeanSwingJInternalFrameAdditional=null;
	//public class TipoBancoRetencionBeanSwingJInternalFrame
	
	public TipoBancoRetencionBeanSwingJInternalFrameAdditional getTipoBancoRetencionBeanSwingJInternalFrameAdditional() {
		return this.tipobancoretencionBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoBancoRetencionBeanSwingJInternalFrameAdditional(TipoBancoRetencionBeanSwingJInternalFrameAdditional tipobancoretencionBeanSwingJInternalFrameAdditional) {
		try {
			this.tipobancoretencionBeanSwingJInternalFrameAdditional=tipobancoretencionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoBancoRetencionLogic tipobancoretencionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoBancoRetencion tipobancoretencionBean;
	public TipoBancoRetencionConstantesFunciones tipobancoretencionConstantesFunciones;
	//public TipoBancoRetencionParameterReturnGeneral tipobancoretencionReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoBancoRetencion> tipobancoretencions;	
	//public List<TipoBancoRetencion> tipobancoretencionsEliminados;
	//public List<TipoBancoRetencion> tipobancoretencionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoBancoRetencion=false;
	public Boolean isVisibilidadCeldaDuplicarTipoBancoRetencion=true;
	public Boolean isVisibilidadCeldaCopiarTipoBancoRetencion=true;
	public Boolean isVisibilidadCeldaVerFormTipoBancoRetencion=true;
	public Boolean isVisibilidadCeldaOrdenTipoBancoRetencion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoBancoRetencion=false;
	public Boolean isVisibilidadCeldaModificarTipoBancoRetencion=false;
	public Boolean isVisibilidadCeldaActualizarTipoBancoRetencion=false;
	public Boolean isVisibilidadCeldaEliminarTipoBancoRetencion=false;
	public Boolean isVisibilidadCeldaCancelarTipoBancoRetencion=false;
	public Boolean isVisibilidadCeldaGuardarTipoBancoRetencion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoBancoRetencion=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoBancoRetencion() {
		return this.iIdNuevoTipoBancoRetencion;
	}

	public void setiIdNuevoTipoBancoRetencion(Long iIdNuevoTipoBancoRetencion) {
		this.iIdNuevoTipoBancoRetencion = iIdNuevoTipoBancoRetencion;
	}
	
	public Long getidTipoBancoRetencionActual() {
		return this.idTipoBancoRetencionActual;
	}

	public void setidTipoBancoRetencionActual(Long idTipoBancoRetencionActual) {
		this.idTipoBancoRetencionActual = idTipoBancoRetencionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoBancoRetencion gettipobancoretencion() {
		return this.tipobancoretencion;
	}

	public void settipobancoretencion(TipoBancoRetencion tipobancoretencion) {
		this.tipobancoretencion = tipobancoretencion;
	}
	
	public TipoBancoRetencion gettipobancoretencionAux() {
		return this.tipobancoretencionAux;
	}

	public void settipobancoretencionAux(TipoBancoRetencion tipobancoretencionAux) {
		this.tipobancoretencionAux = tipobancoretencionAux;
	}				
	
	public TipoBancoRetencion gettipobancoretencionAnterior() {
		return this.tipobancoretencionAnterior;
	}

	public void settipobancoretencionAnterior(TipoBancoRetencion tipobancoretencionAnterior) {
		this.tipobancoretencionAnterior = tipobancoretencionAnterior;
	}	
	
	public TipoBancoRetencion gettipobancoretencionTotales() {
		return this.tipobancoretencionTotales;
	}

	public void settipobancoretencionTotales(TipoBancoRetencion tipobancoretencionTotales) {
		this.tipobancoretencionTotales = tipobancoretencionTotales;
	}	
	
	public TipoBancoRetencion gettipobancoretencionBean() {
		return this.tipobancoretencionBean;
	}

	public void settipobancoretencionBean(TipoBancoRetencion tipobancoretencionBean) {
		this.tipobancoretencionBean = tipobancoretencionBean;
	}	
	
	public TipoBancoRetencionParameterReturnGeneral gettipobancoretencionReturnGeneral() {
		return this.tipobancoretencionReturnGeneral;
	}

	public void settipobancoretencionReturnGeneral(TipoBancoRetencionParameterReturnGeneral tipobancoretencionReturnGeneral) {
		this.tipobancoretencionReturnGeneral = tipobancoretencionReturnGeneral;
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

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoBancoRetencionLogic getTipoBancoRetencionLogic()	{		
		return tipobancoretencionLogic;
	}

	public void setTipoBancoRetencionLogic(TipoBancoRetencionLogic tipobancoretencionLogic) {
		this.tipobancoretencionLogic = tipobancoretencionLogic;
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
	
	public Boolean getIsEsNuevoTipoBancoRetencion() {
		return isEsNuevoTipoBancoRetencion;
	}

	public void setIsEsNuevoTipoBancoRetencion(Boolean isEsNuevoTipoBancoRetencion) {
		this.isEsNuevoTipoBancoRetencion = isEsNuevoTipoBancoRetencion;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoBancoRetencion() {
		return esParaAccionDesdeFormularioTipoBancoRetencion;
	}
	
	public void setEsParaAccionDesdeFormularioTipoBancoRetencion(Boolean esParaAccionDesdeFormularioTipoBancoRetencion) {
		this.esParaAccionDesdeFormularioTipoBancoRetencion = esParaAccionDesdeFormularioTipoBancoRetencion;
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

			if(this.tipobancoretencionSessionBean==null) {
				this.tipobancoretencionSessionBean=new TipoBancoRetencionSessionBean();
			}

			if(!this.tipobancoretencionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipobancoretencionSessionBean.getlidEmpresaActual());
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

					if(this.tipobancoretencion!=null) {
						this.tipobancoretencion.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) {
						this.jInternalFrameDetalleFormTipoBancoRetencion.jComboBoxid_empresaTipoBancoRetencion.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoBancoRetencion.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) {
						if(this.jInternalFrameDetalleFormTipoBancoRetencion.jComboBoxid_empresaTipoBancoRetencion.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoBancoRetencion.jComboBoxid_empresaTipoBancoRetencion.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoBancoRetencionGenerico)throws Exception
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
				jComboBoxid_empresaTipoBancoRetencionGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoBancoRetencionGenerico!=null && jComboBoxid_empresaTipoBancoRetencionGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoBancoRetencionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoBancoRetencion tipobancoretencion,JComboBox jComboBoxid_empresaTipoBancoRetencionGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoBancoRetencionGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoBancoRetencion.jComboBoxid_empresaTipoBancoRetencion.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoBancoRetencionGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipobancoretencion.setid_empresa(empresaAux.getId());
				tipobancoretencion.setempresa_descripcion(TipoBancoRetencionConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipobancoretencion.setEmpresa(empresaAux);			}
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

					if(!TipoBancoRetencionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) { 
							this.jInternalFrameDetalleFormTipoBancoRetencion.jComboBoxid_empresaTipoBancoRetencion.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoBancoRetencion.jComboBoxid_empresaTipoBancoRetencion.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) { 
					}

					if(!TipoBancoRetencionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) {
							this.jInternalFrameDetalleFormTipoBancoRetencion.jComboBoxid_empresaTipoBancoRetencion.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) {
							this.jInternalFrameDetalleFormTipoBancoRetencion.jComboBoxid_empresaTipoBancoRetencion.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoBancoRetencion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoBancoRetencionConstantesFunciones.refrescarForeignKeysDescripcionesTipoBancoRetencion(this.tipobancoretencionLogic.getTipoBancoRetencions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoBancoRetencionConstantesFunciones.refrescarForeignKeysDescripcionesTipoBancoRetencion(this.tipobancoretencions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipobancoretencionLogic.setTipoBancoRetencions(this.tipobancoretencions);
			tipobancoretencionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoBancoRetencionParameterReturnGeneral getTipoBancoRetencionParameterGeneral() {
		return this.tipobancoretencionParameterGeneral;
	}
	
	public void setTipoBancoRetencionParameterGeneral(TipoBancoRetencionParameterReturnGeneral tipobancoretencionParameterGeneral) {
		this.tipobancoretencionParameterGeneral = tipobancoretencionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoBancoRetencion() {
		return isPermisoTodoTipoBancoRetencion;
	}

	public void setIsPermisoTodoTipoBancoRetencion(Boolean isPermisoTodoTipoBancoRetencion) {
		this.isPermisoTodoTipoBancoRetencion = isPermisoTodoTipoBancoRetencion;
	}

	public Boolean getIsPermisoNuevoTipoBancoRetencion() {
		return isPermisoNuevoTipoBancoRetencion;
	}

	public void setIsPermisoNuevoTipoBancoRetencion(Boolean isPermisoNuevoTipoBancoRetencion) {
		this.isPermisoNuevoTipoBancoRetencion = isPermisoNuevoTipoBancoRetencion;
	}

	public Boolean getIsPermisoActualizarTipoBancoRetencion() {
		return isPermisoActualizarTipoBancoRetencion;
	}

	public void setIsPermisoActualizarTipoBancoRetencion(Boolean isPermisoActualizarTipoBancoRetencion) {
		this.isPermisoActualizarTipoBancoRetencion = isPermisoActualizarTipoBancoRetencion;
	}

	public Boolean getIsPermisoEliminarTipoBancoRetencion() {
		return isPermisoEliminarTipoBancoRetencion;
	}

	public void setIsPermisoEliminarTipoBancoRetencion(Boolean isPermisoEliminarTipoBancoRetencion) {
		this.isPermisoEliminarTipoBancoRetencion = isPermisoEliminarTipoBancoRetencion;
	}

	public Boolean getIsPermisoGuardarCambiosTipoBancoRetencion() {
		return isPermisoGuardarCambiosTipoBancoRetencion;
	}

	public void setIsPermisoGuardarCambiosTipoBancoRetencion(Boolean isPermisoGuardarCambiosTipoBancoRetencion) {
		this.isPermisoGuardarCambiosTipoBancoRetencion = isPermisoGuardarCambiosTipoBancoRetencion;
	}
	
	public Boolean getIsPermisoConsultaTipoBancoRetencion() {
		return isPermisoConsultaTipoBancoRetencion;
	}

	public void setIsPermisoConsultaTipoBancoRetencion(Boolean isPermisoConsultaTipoBancoRetencion) {
		this.isPermisoConsultaTipoBancoRetencion = isPermisoConsultaTipoBancoRetencion;
	}

	public Boolean getIsPermisoBusquedaTipoBancoRetencion() {
		return isPermisoBusquedaTipoBancoRetencion;
	}

	public void setIsPermisoBusquedaTipoBancoRetencion(Boolean isPermisoBusquedaTipoBancoRetencion) {
		this.isPermisoBusquedaTipoBancoRetencion = isPermisoBusquedaTipoBancoRetencion;
	}

	public Boolean getIsPermisoReporteTipoBancoRetencion() {
		return isPermisoReporteTipoBancoRetencion;
	}

	public void setIsPermisoReporteTipoBancoRetencion(Boolean isPermisoReporteTipoBancoRetencion) {
		this.isPermisoReporteTipoBancoRetencion = isPermisoReporteTipoBancoRetencion;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoBancoRetencion() {
		return isPermisoPaginacionMedioTipoBancoRetencion;
	}

	public void setIsPermisoPaginacionMedioTipoBancoRetencion(Boolean isPermisoPaginacionMedioTipoBancoRetencion) {
		this.isPermisoPaginacionMedioTipoBancoRetencion = isPermisoPaginacionMedioTipoBancoRetencion;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoBancoRetencion() {
		return isPermisoPaginacionTodoTipoBancoRetencion;
	}

	public void setIsPermisoPaginacionTodoTipoBancoRetencion(Boolean isPermisoPaginacionTodoTipoBancoRetencion) {
		this.isPermisoPaginacionTodoTipoBancoRetencion = isPermisoPaginacionTodoTipoBancoRetencion;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoBancoRetencion() {
		return isPermisoPaginacionAltoTipoBancoRetencion;
	}

	public void setIsPermisoPaginacionAltoTipoBancoRetencion(Boolean isPermisoPaginacionAltoTipoBancoRetencion) {
		this.isPermisoPaginacionAltoTipoBancoRetencion = isPermisoPaginacionAltoTipoBancoRetencion;
	}
	
	public Boolean getIsPermisoCopiarTipoBancoRetencion() {
		return isPermisoCopiarTipoBancoRetencion;
	}

	public void setIsPermisoCopiarTipoBancoRetencion(Boolean isPermisoCopiarTipoBancoRetencion) {
		this.isPermisoCopiarTipoBancoRetencion = isPermisoCopiarTipoBancoRetencion;
	}
	
	public Boolean getIsPermisoVerFormTipoBancoRetencion() {
		return isPermisoVerFormTipoBancoRetencion;
	}

	public void setIsPermisoVerFormTipoBancoRetencion(Boolean isPermisoVerFormTipoBancoRetencion) {
		this.isPermisoVerFormTipoBancoRetencion = isPermisoVerFormTipoBancoRetencion;
	}
	
	public Boolean getIsPermisoDuplicarTipoBancoRetencion() {
		return isPermisoDuplicarTipoBancoRetencion;
	}

	public void setIsPermisoDuplicarTipoBancoRetencion(Boolean isPermisoDuplicarTipoBancoRetencion) {
		this.isPermisoDuplicarTipoBancoRetencion = isPermisoDuplicarTipoBancoRetencion;
	}
	
	public Boolean getIsPermisoOrdenTipoBancoRetencion() {
		return isPermisoOrdenTipoBancoRetencion;
	}

	public void setIsPermisoOrdenTipoBancoRetencion(Boolean isPermisoOrdenTipoBancoRetencion) {
		this.isPermisoOrdenTipoBancoRetencion = isPermisoOrdenTipoBancoRetencion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoBancoRetencion() {
		return isVisibilidadCeldaNuevoTipoBancoRetencion;
	}

	public void setIsVisibilidadCeldaNuevoTipoBancoRetencion(Boolean isVisibilidadCeldaNuevoTipoBancoRetencion) {
		this.isVisibilidadCeldaNuevoTipoBancoRetencion = isVisibilidadCeldaNuevoTipoBancoRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoBancoRetencion() {
		return isVisibilidadCeldaDuplicarTipoBancoRetencion;
	}

	public void setIsVisibilidadCeldaDuplicarTipoBancoRetencion(Boolean isVisibilidadCeldaDuplicarTipoBancoRetencion) {
		this.isVisibilidadCeldaDuplicarTipoBancoRetencion = isVisibilidadCeldaDuplicarTipoBancoRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoBancoRetencion() {
		return isVisibilidadCeldaCopiarTipoBancoRetencion;
	}

	public void setIsVisibilidadCeldaCopiarTipoBancoRetencion(Boolean isVisibilidadCeldaCopiarTipoBancoRetencion) {
		this.isVisibilidadCeldaCopiarTipoBancoRetencion = isVisibilidadCeldaCopiarTipoBancoRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoBancoRetencion() {
		return isVisibilidadCeldaVerFormTipoBancoRetencion;
	}

	public void setIsVisibilidadCeldaVerFormTipoBancoRetencion(Boolean isVisibilidadCeldaVerFormTipoBancoRetencion) {
		this.isVisibilidadCeldaVerFormTipoBancoRetencion = isVisibilidadCeldaVerFormTipoBancoRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoBancoRetencion() {
		return isVisibilidadCeldaOrdenTipoBancoRetencion;
	}

	public void setIsVisibilidadCeldaOrdenTipoBancoRetencion(Boolean isVisibilidadCeldaOrdenTipoBancoRetencion) {
		this.isVisibilidadCeldaOrdenTipoBancoRetencion = isVisibilidadCeldaOrdenTipoBancoRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoBancoRetencion() {
		return isVisibilidadCeldaNuevoRelacionesTipoBancoRetencion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoBancoRetencion(Boolean isVisibilidadCeldaNuevoRelacionesTipoBancoRetencion) {
		this.isVisibilidadCeldaNuevoRelacionesTipoBancoRetencion = isVisibilidadCeldaNuevoRelacionesTipoBancoRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoBancoRetencion() {
		return isVisibilidadCeldaModificarTipoBancoRetencion;
	}

	public void setIsVisibilidadCeldaModificarTipoBancoRetencion(Boolean isVisibilidadCeldaModificarTipoBancoRetencion) {
		this.isVisibilidadCeldaModificarTipoBancoRetencion = isVisibilidadCeldaModificarTipoBancoRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoBancoRetencion() {
		return isVisibilidadCeldaActualizarTipoBancoRetencion;
	}

	public void setIsVisibilidadCeldaActualizarTipoBancoRetencion(Boolean isVisibilidadCeldaActualizarTipoBancoRetencion) {
		this.isVisibilidadCeldaActualizarTipoBancoRetencion = isVisibilidadCeldaActualizarTipoBancoRetencion;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoBancoRetencion() {
		return isVisibilidadCeldaEliminarTipoBancoRetencion;
	}

	public void setIsVisibilidadCeldaEliminarTipoBancoRetencion(Boolean isVisibilidadCeldaEliminarTipoBancoRetencion) {
		this.isVisibilidadCeldaEliminarTipoBancoRetencion = isVisibilidadCeldaEliminarTipoBancoRetencion;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoBancoRetencion() {
		return isVisibilidadCeldaCancelarTipoBancoRetencion;
	}

	public void setIsVisibilidadCeldaCancelarTipoBancoRetencion(Boolean isVisibilidadCeldaCancelarTipoBancoRetencion) {
		this.isVisibilidadCeldaCancelarTipoBancoRetencion = isVisibilidadCeldaCancelarTipoBancoRetencion;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoBancoRetencion() {
		return isVisibilidadCeldaGuardarTipoBancoRetencion;
	}

	public void setIsVisibilidadCeldaGuardarTipoBancoRetencion(Boolean isVisibilidadCeldaGuardarTipoBancoRetencion) {
		this.isVisibilidadCeldaGuardarTipoBancoRetencion = isVisibilidadCeldaGuardarTipoBancoRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoBancoRetencion() {
		return isVisibilidadCeldaGuardarCambiosTipoBancoRetencion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoBancoRetencion(Boolean isVisibilidadCeldaGuardarCambiosTipoBancoRetencion) {
		this.isVisibilidadCeldaGuardarCambiosTipoBancoRetencion = isVisibilidadCeldaGuardarCambiosTipoBancoRetencion;
	}
		
	public TipoBancoRetencionSessionBean gettipobancoretencionSessionBean() {
		return this.tipobancoretencionSessionBean;
	}
	
	public void settipobancoretencionSessionBean(TipoBancoRetencionSessionBean tipobancoretencionSessionBean) {
		this.tipobancoretencionSessionBean=tipobancoretencionSessionBean;
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

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoBancoRetencion(TipoBancoRetencion tipobancoretencion)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipobancoretencion,null);
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
	
	public void bugActualizarReferenciaActual(TipoBancoRetencion tipobancoretencion,TipoBancoRetencion tipobancoretencionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoBancoRetencion(tipobancoretencion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipobancoretencionAux.setId(tipobancoretencion.getId());
		tipobancoretencionAux.setVersionRow(tipobancoretencion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoBancoRetencion();
		
			int intSelectedRow = this.jTableDatosTipoBancoRetencion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoretencion =(TipoBancoRetencion) this.tipobancoretencionLogic.getTipoBancoRetencions().toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipobancoretencion =(TipoBancoRetencion) this.tipobancoretencions.toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoBancoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoBancoRetencion(this.tipobancoretencion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoRetencion(this.tipobancoretencion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipobancoretencionValidator.getInvalidValues(this.tipobancoretencion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipobancoretencionLogic.setDatosCliente(datosCliente);
			tipobancoretencionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipobancoretencionAux=new  TipoBancoRetencion();
				
				tipobancoretencionAux.setIsNew(true);
				tipobancoretencionAux.setIsChanged(true);
				
				tipobancoretencionAux.setTipoBancoRetencionOriginal(this.tipobancoretencion);
				
				tipobancoretencionAux.setId(this.tipobancoretencion.getId());	
				tipobancoretencionAux.setVersionRow(this.tipobancoretencion.getVersionRow());	
				tipobancoretencionAux.setid_empresa(this.tipobancoretencion.getid_empresa());	
				tipobancoretencionAux.setcodigo(this.tipobancoretencion.getcodigo());	
				tipobancoretencionAux.setnombre(this.tipobancoretencion.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipobancoretencionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipobancoretencionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipobancoretencionAux,tipobancoretencionLogic.getTipoBancoRetencions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipobancoretencionAux,tipobancoretencions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipobancoretencionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipobancoretencionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancoretencionLogic.saveTipoBancoRetencions();//WithConnection
						//tipobancoretencionLogic.getSetVersionRowTipoBancoRetencions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipobancoretencion,tipobancoretencionAux);
					
					this.refrescarForeignKeysDescripcionesTipoBancoRetencion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipobancoretencionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipobancoretencionLogic.saveTipoBancoRetencionRelaciones(tipobancoretencionAux);//WithConnection
								//tipobancoretencionLogic.getSetVersionRowTipoBancoRetencions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipobancoretencion,tipobancoretencionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipobancoretencionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipobancoretencionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipobancoretencionAux,tipobancoretencionLogic.getTipoBancoRetencions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipobancoretencionAux,tipobancoretencions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipobancoretencion,tipobancoretencionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipobancoretencionAux=new  TipoBancoRetencion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipobancoretencionSessionBean.getEsGuardarRelacionado() 
					|| (this.tipobancoretencionSessionBean.getEsGuardarRelacionado() && this.tipobancoretencion.getId()>=0)) {
						
					tipobancoretencionAux.setIsNew(false);
				}
				
				tipobancoretencionAux.setIsDeleted(false);
			
				tipobancoretencionAux.setId(this.tipobancoretencion.getId());	
				tipobancoretencionAux.setVersionRow(this.tipobancoretencion.getVersionRow());	
				tipobancoretencionAux.setid_empresa(this.tipobancoretencion.getid_empresa());	
				tipobancoretencionAux.setcodigo(this.tipobancoretencion.getcodigo());	
				tipobancoretencionAux.setnombre(this.tipobancoretencion.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipobancoretencionAux,tipobancoretencionLogic.getTipoBancoRetencions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipobancoretencionAux,tipobancoretencions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipobancoretencionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipobancoretencionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancoretencionLogic.saveTipoBancoRetencions();//WithConnection
						//tipobancoretencionLogic.getSetVersionRowTipoBancoRetencions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipobancoretencion,tipobancoretencionAux);
					
					this.refrescarForeignKeysDescripcionesTipoBancoRetencion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipobancoretencionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipobancoretencionLogic.saveTipoBancoRetencionRelaciones(tipobancoretencionAux);//WithConnection
								//tipobancoretencionLogic.getSetVersionRowTipoBancoRetencions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipobancoretencion,tipobancoretencionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipobancoretencionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipobancoretencionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipobancoretencionAux,tipobancoretencionLogic.getTipoBancoRetencions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipobancoretencionAux,tipobancoretencions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipobancoretencion,tipobancoretencionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipobancoretencionAux=new  TipoBancoRetencion();
				
				tipobancoretencionAux.setIsNew(false);
				tipobancoretencionAux.setIsChanged(false);
				
				tipobancoretencionAux.setIsDeleted(true);
				
				tipobancoretencionAux.setId(this.tipobancoretencion.getId());	
				tipobancoretencionAux.setVersionRow(this.tipobancoretencion.getVersionRow());	
				tipobancoretencionAux.setid_empresa(this.tipobancoretencion.getid_empresa());	
				tipobancoretencionAux.setcodigo(this.tipobancoretencion.getcodigo());	
				tipobancoretencionAux.setnombre(this.tipobancoretencion.getnombre());	
				
				if(this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipobancoretencionAux.getId()>=0) {	
						this.tipobancoretencionsEliminados.add(tipobancoretencionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipobancoretencionAux,tipobancoretencionLogic.getTipoBancoRetencions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipobancoretencionAux,tipobancoretencions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipobancoretencionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipobancoretencionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancoretencionLogic.saveTipoBancoRetencions();//WithConnection
						//tipobancoretencionLogic.getSetVersionRowTipoBancoRetencions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipobancoretencionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipobancoretencionLogic.saveTipoBancoRetencionRelaciones(tipobancoretencionAux);//WithConnection
								//tipobancoretencionLogic.getSetVersionRowTipoBancoRetencions();//WithConnection
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
							if(this.tipobancoretencionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipobancoretencionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipobancoretencionAux,tipobancoretencionLogic.getTipoBancoRetencions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipobancoretencionAux,tipobancoretencions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoretencionLogic.getTipoBancoRetencions().addAll(this.tipobancoretencionsEliminados);
					
					tipobancoretencionLogic.saveTipoBancoRetencions();//WithConnection
					//tipobancoretencionLogic.getSetVersionRowTipoBancoRetencions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoBancoRetencion();
				
				this.tipobancoretencionsEliminados= new ArrayList<TipoBancoRetencion>();		
			}
			
			if(this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Banco Retencion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Banco Retencion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipobancoretencion=tipobancoretencionAux;
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
      		//this.finishProcessTipoBancoRetencion();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoBancoRetencion tipobancoretencionLocal) throws Exception {
		
		if(this.tipobancoretencionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoBancoRetencion tipobancoretencionLocal) throws Exception {	
		if(this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipobancoretencionLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoBancoRetencionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoBancoRetencion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipobancoretencion =(TipoBancoRetencion) this.tipobancoretencionLogic.getTipoBancoRetencions().toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipobancoretencion =(TipoBancoRetencion) this.tipobancoretencions.toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipobancoretencionValidator.getInvalidValues(this.tipobancoretencion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoBancoRetencion tipobancoretencion,List<TipoBancoRetencion> tipobancoretencions) throws Exception {
		try	{		
			TipoBancoRetencionConstantesFunciones.actualizarLista(tipobancoretencion,tipobancoretencions,this.tipobancoretencionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoBancoRetencion tipobancoretencion,List<TipoBancoRetencion> tipobancoretencions) throws Exception {
		try	{			
			TipoBancoRetencionConstantesFunciones.actualizarSelectedLista(tipobancoretencion,tipobancoretencions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoBancoRetencion> tipobancoretencionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipobancoretencionsLocal=this.tipobancoretencionLogic.getTipoBancoRetencions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipobancoretencionsLocal=this.tipobancoretencions;
			}
			//ARCHITECTURE
		
			for(TipoBancoRetencion tipobancoretencionLocal:tipobancoretencionsLocal) {
				if(this.permiteMantenimiento(tipobancoretencionLocal) && tipobancoretencionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoBancoRetencionConstantesFunciones.getTipoBancoRetencionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoBancoRetencionConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoBancoRetencion.jLabelid_empresaTipoBancoRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoBancoRetencionConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoBancoRetencion.jLabelcodigoTipoBancoRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoBancoRetencionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoBancoRetencion.jLabelnombreTipoBancoRetencion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoBancoRetencion.jLabelid_empresaTipoBancoRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoBancoRetencion.jLabelcodigoTipoBancoRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoBancoRetencion.jLabelnombreTipoBancoRetencion,"");
		
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
		this.iIdNuevoTipoBancoRetencion--;	
		
		
		this.tipobancoretencionAux=new TipoBancoRetencion();
		
		this.tipobancoretencionAux.setId(this.iIdNuevoTipoBancoRetencion);
		this.tipobancoretencionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipobancoretencionLogic.getTipoBancoRetencions().add(this.tipobancoretencionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipobancoretencions.add(this.tipobancoretencionAux);
		}
		//ARCHITECTURE
		
		this.tipobancoretencion=this.tipobancoretencionAux;
		
		if(TipoBancoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoBancoRetencion(this.tipobancoretencion);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoBancoRetencion(this.tipobancoretencion);
		}
				
		//this.setDefaultControlesTipoBancoRetencion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoBancoRetencion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoBancoRetencion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoBancoRetencion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoBancoRetencion(this.tipobancoretencionBean,this.tipobancoretencion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoRetencion(this.tipobancoretencion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipobancoretencionSessionBean.getConGuardarRelaciones()) {
			classes=TipoBancoRetencionConstantesFunciones.getClassesRelationshipsOfTipoBancoRetencion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipobancoretencionReturnGeneral=tipobancoretencionLogic.procesarEventosTipoBancoRetencionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipobancoretencionLogic.getTipoBancoRetencions(),this.tipobancoretencion,this.tipobancoretencionParameterGeneral,this.isEsNuevoTipoBancoRetencion,classes);//this.tipobancoretencionLogic.getTipoBancoRetencion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoBancoRetencion(this.tipobancoretencionReturnGeneral,this.tipobancoretencionBean,false);
		
		if(this.tipobancoretencionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoBancoRetencion(this.tipobancoretencionReturnGeneral.getTipoBancoRetencion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoBancoRetencion(this.tipobancoretencionReturnGeneral.getTipoBancoRetencion());
		}
		
		if(this.tipobancoretencionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoBancoRetencion(this.tipobancoretencionReturnGeneral.getTipoBancoRetencion(),classes);//this.tipobancoretencionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoBancoRetencion(this.tipobancoretencion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoBancoRetencion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoBancoRetencion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoBancoRetencionBeanSwingJInternalFrameAdditional.RecargarFormTipoBancoRetencion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoBancoRetencion(false);
						
			if(tipobancoretencionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoBancoRetencionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoBancoRetencion();
			}
			
			this.actualizarVisualTableDatosTipoBancoRetencion();
			
			this.jTableDatosTipoBancoRetencion.setRowSelectionInterval(this.getIndiceNuevoTipoBancoRetencion(), this.getIndiceNuevoTipoBancoRetencion());
			
			this.seleccionarFilaTablaTipoBancoRetencionActual();
						
			this.actualizarEstadoCeldasBotonesTipoBancoRetencion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoBancoRetencion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoBancoRetencion.jTextFieldcodigoTipoBancoRetencion.setEnabled(isHabilitar && this.tipobancoretencionConstantesFunciones.activarcodigoTipoBancoRetencion);
		this.jInternalFrameDetalleFormTipoBancoRetencion.jTextAreanombreTipoBancoRetencion.setEnabled(isHabilitar && this.tipobancoretencionConstantesFunciones.activarnombreTipoBancoRetencion);	
		//
		this.jInternalFrameDetalleFormTipoBancoRetencion.jComboBoxid_empresaTipoBancoRetencion.setEnabled(isHabilitar && this.tipobancoretencionConstantesFunciones.activarid_empresaTipoBancoRetencion);
	};
	
	public void setDefaultControlesTipoBancoRetencion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoBancoRetencion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipobancoretencionSessionBean.setConGuardarRelaciones(true);			
			this.tipobancoretencionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoBancoRetencion.jTabbedPaneRelacionesTipoBancoRetencion.setVisible(true);
			
					
		} else {
			//this.tipobancoretencionSessionBean.setConGuardarRelaciones(false);			
			this.tipobancoretencionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoBancoRetencion.jTabbedPaneRelacionesTipoBancoRetencion.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoBancoRetencion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoBancoRetencion tipobancoretencionAux:this.tipobancoretencionLogic.getTipoBancoRetencions()) {
				if(tipobancoretencionAux.getId().equals(this.iIdNuevoTipoBancoRetencion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoBancoRetencion tipobancoretencionAux:this.tipobancoretencions) {
				if(tipobancoretencionAux.getId().equals(this.iIdNuevoTipoBancoRetencion)) {
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
	
	public int getIndiceActualTipoBancoRetencion(TipoBancoRetencion tipobancoretencion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoBancoRetencion tipobancoretencionAux:this.tipobancoretencionLogic.getTipoBancoRetencions()) {
				if(tipobancoretencionAux.getId().equals(tipobancoretencion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoBancoRetencion tipobancoretencionAux:this.tipobancoretencions) {
				if(tipobancoretencionAux.getId().equals(tipobancoretencion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoBancoRetencion(TipoBancoRetencion tipobancoretencionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoBancoRetencion tipobancoretencionAux:this.tipobancoretencionLogic.getTipoBancoRetencions()) {
				if(tipobancoretencionAux.getTipoBancoRetencionOriginal().getId().equals(tipobancoretencionOriginal.getId())) {
					existe=true;
					tipobancoretencionOriginal.setId(tipobancoretencionAux.getId());
					tipobancoretencionOriginal.setVersionRow(tipobancoretencionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoBancoRetencion tipobancoretencionAux:this.tipobancoretencions) {
				if(tipobancoretencionAux.getTipoBancoRetencionOriginal().getId().equals(tipobancoretencionOriginal.getId())) {
					existe=true;
					tipobancoretencionOriginal.setId(tipobancoretencionAux.getId());
					tipobancoretencionOriginal.setVersionRow(tipobancoretencionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoBancoRetencion(Boolean esParaCancelar) throws Exception {
		tipobancoretencionsAux=new ArrayList<TipoBancoRetencion>();
		tipobancoretencionAux=new TipoBancoRetencion();
		
		if(!this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoBancoRetencion tipobancoretencionAux:this.tipobancoretencionLogic.getTipoBancoRetencions()) {
					if(tipobancoretencionAux.getId()<0) {
						tipobancoretencionsAux.add(tipobancoretencionAux);
					}		
				}
				this.iIdNuevoTipoBancoRetencion=0L;
				this.tipobancoretencionLogic.getTipoBancoRetencions().removeAll(tipobancoretencionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoBancoRetencion tipobancoretencionAux:this.tipobancoretencions) {
					if(tipobancoretencionAux.getId()<0) {
						tipobancoretencionsAux.add(tipobancoretencionAux);
					}		
				}
				this.iIdNuevoTipoBancoRetencion=0L;
				this.tipobancoretencions.removeAll(tipobancoretencionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoBancoRetencion 
					&& this.tipobancoretencionLogic.getTipoBancoRetencions().size()>0
					) {
					tipobancoretencionAux=this.tipobancoretencionLogic.getTipoBancoRetencions().get(this.tipobancoretencionLogic.getTipoBancoRetencions().size() - 1);
				
					if(tipobancoretencionAux.getId()<0) {
						this.tipobancoretencionLogic.getTipoBancoRetencions().remove(tipobancoretencionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoBancoRetencion && this.tipobancoretencions.size()>0) {
					tipobancoretencionAux=this.tipobancoretencions.get(this.tipobancoretencions.size() - 1);
				
					if(tipobancoretencionAux.getId()<0) {
						this.tipobancoretencions.remove(tipobancoretencionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoBancoRetencion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipobancoretencion.getId()<0) {
				this.tipobancoretencionLogic.getTipoBancoRetencions().remove(this.tipobancoretencion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipobancoretencion.getId()<0) {
				this.tipobancoretencions.remove(this.tipobancoretencion);
			}
		}			
	}
	
	public void setEstadosInicialesTipoBancoRetencion(List<TipoBancoRetencion> tipobancoretencionsAux) throws Exception {
		TipoBancoRetencionConstantesFunciones.setEstadosInicialesTipoBancoRetencion(tipobancoretencionsAux);
	}
	
	public void setEstadosInicialesTipoBancoRetencion(TipoBancoRetencion tipobancoretencionAux) throws Exception {
		TipoBancoRetencionConstantesFunciones.setEstadosInicialesTipoBancoRetencion(tipobancoretencionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoBancoRetencionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoBancoRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoBancoRetencionActual()) {
				if(!this.isEsNuevoTipoBancoRetencion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoBancoRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoBancoRetencion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoBancoRetencionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Banco Retencion ?", "MANTENIMIENTO DE Tipo Banco Retencion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoBancoRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoBancoRetencion tipobancoretencion) throws Exception {
		TipoBancoRetencionConstantesFunciones.seleccionarAsignar(this.tipobancoretencion,tipobancoretencion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoBancoRetencion=this.isPermisoActualizarOriginalTipoBancoRetencion;
			
			
			this.seleccionarAsignar(tipobancoretencion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoBancoRetencionConstantesFunciones.quitarEspaciosTipoBancoRetencion(this.tipobancoretencion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoBancoRetencion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipobancoretencionSessionBean.setsFuncionBusquedaRapida(this.tipobancoretencionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoBancoRetencion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoBancoRetencion(esParaCancelar);				
				this.cancelarNuevoTipoBancoRetencion(esParaCancelar);								
			}
			
			this.tipobancoretencion=new TipoBancoRetencion();
			
			this.inicializarTipoBancoRetencion();
			
			this.actualizarEstadoCeldasBotonesTipoBancoRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoBancoRetencion() throws Exception {
		try {
			TipoBancoRetencionConstantesFunciones.inicializarTipoBancoRetencion(this.tipobancoretencion);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipobancoretencionLogic.getTipoBancoRetencions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoBancoRetencions(String sAccionBusqueda,List<TipoBancoRetencion> tipobancoretencionsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoBancoRetencion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoBancoRetencionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoBancoRetencionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoBancoRetencion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Banco Retenciones");		
		parameters.put("busquedapor", TipoBancoRetencionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoBancoRetencion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoBancoRetencionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoBancoRetencionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoBancoRetencion=new JRBeanArrayDataSource(TipoBancoRetencionJInternalFrame.TraerTipoBancoRetencionBeans(tipobancoretencionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoBancoRetencion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoBancoRetencionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoBancoRetencionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoBancoRetencionBean.TraerTipoBancoRetencionBeans(tipobancoretencionsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoBancoRetencions(sAccionBusqueda,sTipoArchivoReporte,tipobancoretencionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoBancoRetencions(sAccionBusqueda,sTipoArchivoReporte,tipobancoretencionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoBancoRetencionActionPerformed(null);
					//this.generarExcelReporteTipoBancoRetencions(sAccionBusqueda,sTipoArchivoReporte,tipobancoretencionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoBancoRetencions(sAccionBusqueda,sTipoArchivoReporte,tipobancoretencionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoBancoRetencions(sAccionBusqueda,sTipoArchivoReporte,tipobancoretencionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoBancoRetencions(sAccionBusqueda,sTipoArchivoReporte,tipobancoretencionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoBancoRetencions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoBancoRetencion> tipobancoretencionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobancoretencion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoBancoRetencions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoBancoRetencion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoBancoRetencion tipobancoretencion : tipobancoretencionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoBancoRetencionConstantesFunciones.generarExcelReporteDataTipoBancoRetencion("NORMAL",row,workbook,tipobancoretencion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco Retencion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoBancoRetencion(String sTipo,Row row,Workbook workbook) {
		
		TipoBancoRetencionConstantesFunciones.generarExcelReporteHeaderTipoBancoRetencion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoBancoRetencions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoBancoRetencion> tipobancoretencionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobancoretencion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoBancoRetencions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoBancoRetencion tipobancoretencion : tipobancoretencionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoBancoRetencionConstantesFunciones.getTipoBancoRetencionDescripcion(tipobancoretencion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoBancoRetencionConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoBancoRetencionConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipobancoretencion.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoBancoRetencionConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoBancoRetencionConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipobancoretencion.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoBancoRetencionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoBancoRetencionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipobancoretencion.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco Retencion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoBancoRetencions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoBancoRetencion> tipobancoretencionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoBancoRetencion> tipobancoretencionsRespaldo=null;
		
		classes=TipoBancoRetencionConstantesFunciones.getClassesRelationshipsOfTipoBancoRetencion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipobancoretencionLogic.setDatosCliente(this.datosCliente);
		this.tipobancoretencionLogic.setDatosDeep(this.datosDeep);
		this.tipobancoretencionLogic.setIsConDeep(true);
		
		tipobancoretencionsRespaldo=this.tipobancoretencionLogic.getTipoBancoRetencions();
		
		this.tipobancoretencionLogic.setTipoBancoRetencions(tipobancoretencionsParaReportes);	
		this.tipobancoretencionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipobancoretencionsParaReportes=this.tipobancoretencionLogic.getTipoBancoRetencions();
		this.tipobancoretencionLogic.setTipoBancoRetencions(tipobancoretencionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobancoretencion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoBancoRetencions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoBancoRetencion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoBancoRetencion tipobancoretencion : tipobancoretencionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoBancoRetencion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoBancoRetencionConstantesFunciones.generarExcelReporteDataTipoBancoRetencion("NORMAL",row,workbook,tipobancoretencion,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoBancoRetencionConstantesFunciones.getTipoBancoRetencionDescripcion(tipobancoretencion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco Retencion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoBancoRetencion() throws Exception {		
		this.startProcessTipoBancoRetencion(true);
	}
	
	public void startProcessTipoBancoRetencion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoBancoRetencion ,this.jPanelParametrosReportesTipoBancoRetencion, this.jScrollPanelDatosTipoBancoRetencion,this.jPanelPaginacionTipoBancoRetencion, this.jScrollPanelDatosEdicionTipoBancoRetencion, this.jPanelAccionesTipoBancoRetencion,this.jPanelAccionesFormularioTipoBancoRetencion,this.jmenuBarTipoBancoRetencion,this.jmenuBarDetalleTipoBancoRetencion,this.jTtoolBarTipoBancoRetencion,this.jTtoolBarDetalleTipoBancoRetencion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoBancoRetencion=this.jTabbedPaneBusquedasTipoBancoRetencion; 
		
		final JPanel jPanelParametrosReportesTipoBancoRetencion=this.jPanelParametrosReportesTipoBancoRetencion;
		//final JScrollPane jScrollPanelDatosTipoBancoRetencion=this.jScrollPanelDatosTipoBancoRetencion;
		final JTable jTableDatosTipoBancoRetencion=this.jTableDatosTipoBancoRetencion;		
		final JPanel jPanelPaginacionTipoBancoRetencion=this.jPanelPaginacionTipoBancoRetencion;
		//final JScrollPane jScrollPanelDatosEdicionTipoBancoRetencion=this.jScrollPanelDatosEdicionTipoBancoRetencion;
		final JPanel jPanelAccionesTipoBancoRetencion=this.jPanelAccionesTipoBancoRetencion;
		
		JPanel jPanelCamposAuxiliarTipoBancoRetencion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoBancoRetencion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) {
			jPanelCamposAuxiliarTipoBancoRetencion=this.jInternalFrameDetalleFormTipoBancoRetencion.jPanelCamposTipoBancoRetencion;
			jPanelAccionesFormularioAuxiliarTipoBancoRetencion=this.jInternalFrameDetalleFormTipoBancoRetencion.jPanelAccionesFormularioTipoBancoRetencion;
		}
		
		final JPanel jPanelCamposTipoBancoRetencion=jPanelCamposAuxiliarTipoBancoRetencion;
		final JPanel jPanelAccionesFormularioTipoBancoRetencion=jPanelAccionesFormularioAuxiliarTipoBancoRetencion;
		
		
		final JMenuBar jmenuBarTipoBancoRetencion=this.jmenuBarTipoBancoRetencion;
		final JToolBar jTtoolBarTipoBancoRetencion=this.jTtoolBarTipoBancoRetencion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoBancoRetencion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoBancoRetencion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) {
			jmenuBarDetalleAuxiliarTipoBancoRetencion=this.jInternalFrameDetalleFormTipoBancoRetencion.jmenuBarDetalleTipoBancoRetencion;
			jTtoolBarDetalleAuxiliarTipoBancoRetencion=this.jInternalFrameDetalleFormTipoBancoRetencion.jTtoolBarDetalleTipoBancoRetencion;
		}
		
		final JMenuBar jmenuBarDetalleTipoBancoRetencion=jmenuBarDetalleAuxiliarTipoBancoRetencion;
		final JToolBar jTtoolBarDetalleTipoBancoRetencion=jTtoolBarDetalleAuxiliarTipoBancoRetencion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoBancoRetencion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoBancoRetencion;
			processRunnable.jTableDatos=jTableDatosTipoBancoRetencion;
			processRunnable.jPanelCampos=jPanelCamposTipoBancoRetencion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoBancoRetencion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoBancoRetencion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoBancoRetencion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoBancoRetencion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoBancoRetencion;
			processRunnable.jTtoolBar=jTtoolBarTipoBancoRetencion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoBancoRetencion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoBancoRetencion ,jPanelParametrosReportesTipoBancoRetencion,jTableDatosTipoBancoRetencion, /*jScrollPanelDatosTipoBancoRetencion,*/jPanelCamposTipoBancoRetencion,jPanelPaginacionTipoBancoRetencion, /*jScrollPanelDatosEdicionTipoBancoRetencion,*/ jPanelAccionesTipoBancoRetencion,jPanelAccionesFormularioTipoBancoRetencion,jmenuBarTipoBancoRetencion,jmenuBarDetalleTipoBancoRetencion,jTtoolBarTipoBancoRetencion,jTtoolBarDetalleTipoBancoRetencion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoBancoRetencion ,jPanelParametrosReportesTipoBancoRetencion, jScrollPanelDatosTipoBancoRetencion,jPanelPaginacionTipoBancoRetencion, jScrollPanelDatosEdicionTipoBancoRetencion, jPanelAccionesTipoBancoRetencion,jPanelAccionesFormularioTipoBancoRetencion,jmenuBarTipoBancoRetencion,jmenuBarDetalleTipoBancoRetencion,jTtoolBarTipoBancoRetencion,jTtoolBarDetalleTipoBancoRetencion);
						
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
	
	public void finishProcessTipoBancoRetencion() {// throws Exception 
		this.finishProcessTipoBancoRetencion(true);
	}
	
	public void finishProcessTipoBancoRetencion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoBancoRetencion ,this.jPanelParametrosReportesTipoBancoRetencion, this.jScrollPanelDatosTipoBancoRetencion,this.jPanelPaginacionTipoBancoRetencion, this.jScrollPanelDatosEdicionTipoBancoRetencion, this.jPanelAccionesTipoBancoRetencion,this.jPanelAccionesFormularioTipoBancoRetencion,this.jmenuBarTipoBancoRetencion,this.jmenuBarDetalleTipoBancoRetencion,this.jTtoolBarTipoBancoRetencion,this.jTtoolBarDetalleTipoBancoRetencion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoBancoRetencion=this.jTabbedPaneBusquedasTipoBancoRetencion; 
		
		final JPanel jPanelParametrosReportesTipoBancoRetencion=this.jPanelParametrosReportesTipoBancoRetencion;
		//final JScrollPane jScrollPanelDatosTipoBancoRetencion=this.jScrollPanelDatosTipoBancoRetencion;
		final JTable jTableDatosTipoBancoRetencion=this.jTableDatosTipoBancoRetencion;		
		final JPanel jPanelPaginacionTipoBancoRetencion=this.jPanelPaginacionTipoBancoRetencion;
		//final JScrollPane jScrollPanelDatosEdicionTipoBancoRetencion=this.jScrollPanelDatosEdicionTipoBancoRetencion;
		final JPanel jPanelAccionesTipoBancoRetencion=this.jPanelAccionesTipoBancoRetencion;
		
		JPanel jPanelCamposAuxiliarTipoBancoRetencion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoBancoRetencion=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) {
			jPanelCamposAuxiliarTipoBancoRetencion=this.jInternalFrameDetalleFormTipoBancoRetencion.jPanelCamposTipoBancoRetencion;
			jPanelAccionesFormularioAuxiliarTipoBancoRetencion=this.jInternalFrameDetalleFormTipoBancoRetencion.jPanelAccionesFormularioTipoBancoRetencion;
		}
		
		final JPanel jPanelCamposTipoBancoRetencion=jPanelCamposAuxiliarTipoBancoRetencion;
		final JPanel jPanelAccionesFormularioTipoBancoRetencion=jPanelAccionesFormularioAuxiliarTipoBancoRetencion;
		
		
		final JMenuBar jmenuBarTipoBancoRetencion=this.jmenuBarTipoBancoRetencion;		
		final JToolBar jTtoolBarTipoBancoRetencion=this.jTtoolBarTipoBancoRetencion;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoBancoRetencion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoBancoRetencion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) {
			jmenuBarDetalleAuxiliarTipoBancoRetencion=this.jInternalFrameDetalleFormTipoBancoRetencion.jmenuBarDetalleTipoBancoRetencion;
			jTtoolBarDetalleAuxiliarTipoBancoRetencion=this.jInternalFrameDetalleFormTipoBancoRetencion.jTtoolBarDetalleTipoBancoRetencion;		
		}
		
		final JMenuBar jmenuBarDetalleTipoBancoRetencion=jmenuBarDetalleAuxiliarTipoBancoRetencion;
		final JToolBar jTtoolBarDetalleTipoBancoRetencion=jTtoolBarDetalleAuxiliarTipoBancoRetencion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoBancoRetencion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoBancoRetencion;
			processRunnable.jTableDatos=jTableDatosTipoBancoRetencion;
			processRunnable.jPanelCampos=jPanelCamposTipoBancoRetencion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoBancoRetencion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoBancoRetencion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoBancoRetencion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoBancoRetencion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoBancoRetencion;
			processRunnable.jTtoolBar=jTtoolBarTipoBancoRetencion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoBancoRetencion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoBancoRetencion ,jPanelParametrosReportesTipoBancoRetencion, jTableDatosTipoBancoRetencion,/*jScrollPanelDatosTipoBancoRetencion,*/jPanelCamposTipoBancoRetencion,jPanelPaginacionTipoBancoRetencion, /*jScrollPanelDatosEdicionTipoBancoRetencion,*/ jPanelAccionesTipoBancoRetencion,jPanelAccionesFormularioTipoBancoRetencion,jmenuBarTipoBancoRetencion,jmenuBarDetalleTipoBancoRetencion,jTtoolBarTipoBancoRetencion,jTtoolBarDetalleTipoBancoRetencion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoBancoRetencion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoBancoRetencion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoBancoRetencion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoBancoRetencion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoBancoRetencion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoBancoRetencion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoBancoRetencion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoBancoRetencion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoBancoRetencion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipobancoretencionConstantesFunciones.getsFinalQueryTipoBancoRetencion();
		String  finalQueryPaginacionTodos=this.tipobancoretencionConstantesFunciones.getsFinalQueryTipoBancoRetencion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoBancoRetencionConstantesFunciones.getArrayColumnasGlobalesNoTipoBancoRetencion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoBancoRetencionConstantesFunciones.getArrayColumnasGlobalesTipoBancoRetencion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoBancoRetencionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipobancoretencionsEliminados= new ArrayList<TipoBancoRetencion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoBancoRetencion();
		
				///*TipoBancoRetencionSessionBean*/this.tipobancoretencionSessionBean=new TipoBancoRetencionSessionBean();
			
			if(this.tipobancoretencionSessionBean==null) {
				this.tipobancoretencionSessionBean=new TipoBancoRetencionSessionBean();
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
					this.iNumeroPaginacion=TipoBancoRetencionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoBancoRetencionConstantesFunciones.getClassesForeignKeysOfTipoBancoRetencion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipobancoretencion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipobancoretencionsAux= new ArrayList<TipoBancoRetencion>();
			
				
			tipobancoretencionLogic.setDatosCliente(this.datosCliente);
			tipobancoretencionLogic.setDatosDeep(this.datosDeep);
			tipobancoretencionLogic.setIsConDeep(true);
			
			
			tipobancoretencionLogic.getTipoBancoRetencionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipobancoretencionLogic.getTodosTipoBancoRetencions(finalQueryGlobal,pagination);
					
					//tipobancoretencionLogic.getTodosTipoBancoRetencionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipobancoretencionLogic.getTipoBancoRetencions()==null|| tipobancoretencionLogic.getTipoBancoRetencions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipobancoretencionsAux= new ArrayList<TipoBancoRetencion>();
							tipobancoretencionsAux.addAll(tipobancoretencionLogic.getTipoBancoRetencions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipobancoretencionsAux= new ArrayList<TipoBancoRetencion>();
							tipobancoretencionsAux.addAll(tipobancoretencions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipobancoretencionLogic.getTodosTipoBancoRetencions(finalQueryGlobal+"",this.pagination);												
							
							//tipobancoretencionLogic.getTodosTipoBancoRetencionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoBancoRetencions("Todos",tipobancoretencionLogic.getTipoBancoRetencions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipobancoretencionLogic.setTipoBancoRetencions(new ArrayList<TipoBancoRetencion>());					
							tipobancoretencionLogic.getTipoBancoRetencions().addAll(tipobancoretencionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipobancoretencions=new ArrayList<TipoBancoRetencion>();
							tipobancoretencions.addAll(tipobancoretencionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoBancoRetencion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoBancoRetencion=this.idActual;
				
				} else if(this.idTipoBancoRetencionActual!=null && this.idTipoBancoRetencionActual!=0L) {
					idTipoBancoRetencion=idTipoBancoRetencionActual;
				}
				
					
				this.sDetalleReporte=TipoBancoRetencionConstantesFunciones.getDetalleIndicePorId(idTipoBancoRetencion);
				
				this.tipobancoretencions=new ArrayList<TipoBancoRetencion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipobancoretencionLogic.getEntity(idTipoBancoRetencion);
					
					//tipobancoretencionLogic.getEntityWithConnection(idTipoBancoRetencion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipobancoretencionLogic.setTipoBancoRetencions(new ArrayList<TipoBancoRetencion>());
					tipobancoretencionLogic.getTipoBancoRetencions().add(tipobancoretencionLogic.getTipoBancoRetencion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipobancoretencions=new ArrayList<TipoBancoRetencion>();
					this.tipobancoretencions.add(tipobancoretencion);
				}
				
				if(tipobancoretencionLogic.getTipoBancoRetencion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TipoBancoRetencionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipobancoretencionLogic.getTipoBancoRetencionsBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoBancoRetencionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoBancoRetencionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipobancoretencionLogic.getTipoBancoRetencions()==null||tipobancoretencionLogic.getTipoBancoRetencions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipobancoretencions==null|| tipobancoretencions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancoretencionsAux=new ArrayList<TipoBancoRetencion>();
						tipobancoretencionsAux.addAll(tipobancoretencionLogic.getTipoBancoRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipobancoretencionsAux=new ArrayList<TipoBancoRetencion>();
							tipobancoretencionsAux.addAll(tipobancoretencions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipobancoretencionLogic.getTipoBancoRetencionsBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoBancoRetencionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoBancoRetencionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoBancoRetencions("BusquedaPorCodigo",tipobancoretencionLogic.getTipoBancoRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoBancoRetencions("BusquedaPorCodigo",tipobancoretencions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancoretencionLogic.setTipoBancoRetencions(new ArrayList<TipoBancoRetencion>());
						tipobancoretencionLogic.getTipoBancoRetencions().addAll(tipobancoretencionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipobancoretencions=new ArrayList<TipoBancoRetencion>();
							tipobancoretencions.addAll(tipobancoretencionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoBancoRetencionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipobancoretencionLogic.getTipoBancoRetencionsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoBancoRetencionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoBancoRetencionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipobancoretencionLogic.getTipoBancoRetencions()==null||tipobancoretencionLogic.getTipoBancoRetencions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipobancoretencions==null|| tipobancoretencions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancoretencionsAux=new ArrayList<TipoBancoRetencion>();
						tipobancoretencionsAux.addAll(tipobancoretencionLogic.getTipoBancoRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipobancoretencionsAux=new ArrayList<TipoBancoRetencion>();
							tipobancoretencionsAux.addAll(tipobancoretencions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipobancoretencionLogic.getTipoBancoRetencionsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoBancoRetencionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoBancoRetencionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoBancoRetencions("BusquedaPorNombre",tipobancoretencionLogic.getTipoBancoRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoBancoRetencions("BusquedaPorNombre",tipobancoretencions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancoretencionLogic.setTipoBancoRetencions(new ArrayList<TipoBancoRetencion>());
						tipobancoretencionLogic.getTipoBancoRetencions().addAll(tipobancoretencionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipobancoretencions=new ArrayList<TipoBancoRetencion>();
							tipobancoretencions.addAll(tipobancoretencionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoBancoRetencionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipobancoretencionLogic.getTipoBancoRetencionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoBancoRetencionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoBancoRetencionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipobancoretencionLogic.getTipoBancoRetencions()==null||tipobancoretencionLogic.getTipoBancoRetencions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipobancoretencions==null|| tipobancoretencions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancoretencionsAux=new ArrayList<TipoBancoRetencion>();
						tipobancoretencionsAux.addAll(tipobancoretencionLogic.getTipoBancoRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipobancoretencionsAux=new ArrayList<TipoBancoRetencion>();
							tipobancoretencionsAux.addAll(tipobancoretencions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipobancoretencionLogic.getTipoBancoRetencionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoBancoRetencionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoBancoRetencionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoBancoRetencions("FK_IdEmpresa",tipobancoretencionLogic.getTipoBancoRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoBancoRetencions("FK_IdEmpresa",tipobancoretencions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancoretencionLogic.setTipoBancoRetencions(new ArrayList<TipoBancoRetencion>());
						tipobancoretencionLogic.getTipoBancoRetencions().addAll(tipobancoretencionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipobancoretencions=new ArrayList<TipoBancoRetencion>();
							tipobancoretencions.addAll(tipobancoretencionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoBancoRetencion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoBancoRetencion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipobancoretencionLogic.getTipoBancoRetencions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipobancoretencions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipobancoretencionLogic.getTipoBancoRetencions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipobancoretencions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoBancoRetencion tipobancoretencion) {
		Boolean permite=true;
		
		if(this.tipobancoretencion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoBancoRetencionConstantesFunciones.getOrderByListaTipoBancoRetencion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoBancoRetencionConstantesFunciones.getOrderByListaTipoBancoRetencion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoBancoRetencion tipobancoretencion:tipobancoretencionLogic.getTipoBancoRetencions()) {
				if(tipobancoretencion.getsType().equals(Constantes2.S_TOTALES)) {
					tipobancoretencionTotales=tipobancoretencion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoBancoRetencion tipobancoretencion:this.tipobancoretencions) {
				if(tipobancoretencion.getsType().equals(Constantes2.S_TOTALES)) {
					tipobancoretencionTotales=tipobancoretencion;
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
			this.tipobancoretencionAux=new TipoBancoRetencion();
			this.tipobancoretencionAux.setsType(Constantes2.S_TOTALES);
			this.tipobancoretencionAux.setIsNew(false);
			this.tipobancoretencionAux.setIsChanged(false);
			this.tipobancoretencionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoBancoRetencionConstantesFunciones.TotalizarValoresFilaTipoBancoRetencion(this.tipobancoretencionLogic.getTipoBancoRetencions(),this.tipobancoretencionAux);
				
				this.tipobancoretencionLogic.getTipoBancoRetencions().add(this.tipobancoretencionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoBancoRetencionConstantesFunciones.TotalizarValoresFilaTipoBancoRetencion(this.tipobancoretencions,this.tipobancoretencionAux);
				
				this.tipobancoretencions.add(this.tipobancoretencionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipobancoretencionTotales=new TipoBancoRetencion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipobancoretencionLogic.getTipoBancoRetencions().remove(tipobancoretencionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipobancoretencions.remove(tipobancoretencionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipobancoretencionTotales=new TipoBancoRetencion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoBancoRetencion tipobancoretencion:tipobancoretencionLogic.getTipoBancoRetencions()) {
				if(tipobancoretencion.getsType().equals(Constantes2.S_TOTALES)) {
					tipobancoretencionTotales=tipobancoretencion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoBancoRetencionConstantesFunciones.TotalizarValoresFilaTipoBancoRetencion(this.tipobancoretencionLogic.getTipoBancoRetencions(),tipobancoretencionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoBancoRetencion tipobancoretencion:this.tipobancoretencions) {
				if(tipobancoretencion.getsType().equals(Constantes2.S_TOTALES)) {
					tipobancoretencionTotales=tipobancoretencion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoBancoRetencionConstantesFunciones.TotalizarValoresFilaTipoBancoRetencion(this.tipobancoretencions,tipobancoretencionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoBancoRetencionsBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoBancoRetencionsBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoBancoRetencionsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoBancoRetencionsBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipobancoretencionLogic.getTipoBancoRetencionsBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoBancoRetencionsBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipobancoretencionLogic.getTipoBancoRetencionsBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoBancoRetencionsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipobancoretencionLogic.getTipoBancoRetencionsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoBancoRetencion() {
		this.isPermisoTodoTipoBancoRetencion=false;
		this.isPermisoNuevoTipoBancoRetencion=false;
		this.isPermisoActualizarTipoBancoRetencion=false;
		this.isPermisoActualizarOriginalTipoBancoRetencion=false;
		this.isPermisoEliminarTipoBancoRetencion=false;
		this.isPermisoGuardarCambiosTipoBancoRetencion=false;
		this.isPermisoConsultaTipoBancoRetencion=false;
		this.isPermisoBusquedaTipoBancoRetencion=false;
		this.isPermisoReporteTipoBancoRetencion=false;		
		this.isPermisoOrdenTipoBancoRetencion=false;		
		this.isPermisoPaginacionMedioTipoBancoRetencion=false;		
		this.isPermisoPaginacionAltoTipoBancoRetencion=false;
		this.isPermisoPaginacionTodoTipoBancoRetencion=false;
		this.isPermisoCopiarTipoBancoRetencion=false;		
		this.isPermisoVerFormTipoBancoRetencion=false;		
		this.isPermisoDuplicarTipoBancoRetencion=false;		
		this.isPermisoOrdenTipoBancoRetencion=false;		
	}
	
	public void setPermisosUsuarioTipoBancoRetencion(Boolean isPermiso) {
		this.isPermisoTodoTipoBancoRetencion=isPermiso;
		this.isPermisoNuevoTipoBancoRetencion=isPermiso;
		this.isPermisoActualizarTipoBancoRetencion=isPermiso;
		this.isPermisoActualizarOriginalTipoBancoRetencion=isPermiso;
		this.isPermisoEliminarTipoBancoRetencion=isPermiso;
		this.isPermisoGuardarCambiosTipoBancoRetencion=isPermiso;
		this.isPermisoConsultaTipoBancoRetencion=isPermiso;
		this.isPermisoBusquedaTipoBancoRetencion=isPermiso;
		this.isPermisoReporteTipoBancoRetencion=isPermiso;
		this.isPermisoOrdenTipoBancoRetencion=isPermiso;		
		this.isPermisoPaginacionMedioTipoBancoRetencion=isPermiso;		
		this.isPermisoPaginacionAltoTipoBancoRetencion=isPermiso;		
		this.isPermisoPaginacionTodoTipoBancoRetencion=isPermiso;		
		this.isPermisoCopiarTipoBancoRetencion=isPermiso;		
		this.isPermisoVerFormTipoBancoRetencion=isPermiso;		
		this.isPermisoDuplicarTipoBancoRetencion=isPermiso;
		this.isPermisoOrdenTipoBancoRetencion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoBancoRetencion(Boolean isPermiso) {
		//this.isPermisoTodoTipoBancoRetencion=isPermiso;
		this.isPermisoNuevoTipoBancoRetencion=isPermiso;
		this.isPermisoActualizarTipoBancoRetencion=isPermiso;
		this.isPermisoActualizarOriginalTipoBancoRetencion=isPermiso;
		this.isPermisoEliminarTipoBancoRetencion=isPermiso;
		this.isPermisoGuardarCambiosTipoBancoRetencion=isPermiso;
		//this.isPermisoConsultaTipoBancoRetencion=isPermiso;
		//this.isPermisoBusquedaTipoBancoRetencion=isPermiso;
		//this.isPermisoReporteTipoBancoRetencion=isPermiso;
		//this.isPermisoOrdenTipoBancoRetencion=isPermiso;		
		//this.isPermisoPaginacionMedioTipoBancoRetencion=isPermiso;		
		//this.isPermisoPaginacionAltoTipoBancoRetencion=isPermiso;		
		//this.isPermisoPaginacionTodoTipoBancoRetencion=isPermiso;		
		//this.isPermisoCopiarTipoBancoRetencion=isPermiso;		
		//this.isPermisoDuplicarTipoBancoRetencion=isPermiso;
		//this.isPermisoOrdenTipoBancoRetencion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoBancoRetencionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoBancoRetencionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoBancoRetencion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoBancoRetencionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoBancoRetencionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoBancoRetencionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoBancoRetencionClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoBancoRetencion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoBancoRetencionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoBancoRetencionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoBancoRetencion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoBancoRetencion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoBancoRetencion=this.isPermisoActualizarTipoBancoRetencion;
			this.isPermisoEliminarTipoBancoRetencion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoBancoRetencion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoBancoRetencion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoBancoRetencion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoBancoRetencion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoBancoRetencion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoBancoRetencion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoBancoRetencion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoBancoRetencion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoBancoRetencion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoBancoRetencion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoBancoRetencion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoBancoRetencion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoBancoRetencion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoBancoRetencion.setToolTipText(this.jTableDatosTipoBancoRetencion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoBancoRetencion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoBancoRetencion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoBancoRetencionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoBancoRetencionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoBancoRetencion() throws Exception {
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
	public void inicializarCombosForeignKeyTipoBancoRetencionListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoBancoRetencionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoBancoRetencionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoBancoRetencionListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyTipoBancoRetencionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoBancoRetencionParameterReturnGeneral tipobancoretencionReturnGeneral=new TipoBancoRetencionParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipobancoretencionConstantesFunciones.cargarid_empresaTipoBancoRetencion)
					 || (this.esRecargarFks && this.tipobancoretencionConstantesFunciones.cargarid_empresaTipoBancoRetencion)) {

					if(!this.tipobancoretencionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipobancoretencionSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipobancoretencionReturnGeneral=tipobancoretencionLogic.cargarCombosLoteForeignKeyTipoBancoRetencion(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipobancoretencionReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoBancoRetencion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipobancoretencionSessionBean==null) {
				this.tipobancoretencionSessionBean=new TipoBancoRetencionSessionBean();
			}

			if(!this.tipobancoretencionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoBancoRetencion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoBancoRetencion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoBancoRetencion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoBancoRetencion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoBancoRetencion(TipoBancoRetencion tipobancoretencion)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoBancoRetencion(TipoBancoRetencion tipobancoretencion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoBancoRetencion()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoBancoRetencion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoBancoRetencion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoBancoRetencion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoBancoRetencion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoBancoRetencion()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoBancoRetencion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoBancoRetencion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoBancoRetencion.jComboBoxid_empresaTipoBancoRetencion!=null && this.jInternalFrameDetalleFormTipoBancoRetencion.jComboBoxid_empresaTipoBancoRetencion.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoBancoRetencion.jComboBoxid_empresaTipoBancoRetencion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoBancoRetencionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoBancoRetencionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoBancoRetencionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipobancoretencionSessionBean=new TipoBancoRetencionSessionBean(); 
		this.tipobancoretencionConstantesFunciones=new TipoBancoRetencionConstantesFunciones(); 
		this.tipobancoretencionBean=new TipoBancoRetencion();//(this.tipobancoretencionConstantesFunciones); 		
		this.tipobancoretencionReturnGeneral=new TipoBancoRetencionParameterReturnGeneral(); 
		
		this.tipobancoretencionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipobancoretencionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoBancoRetencionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoBancoRetencionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoBancoRetencionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoBancoRetencion(true);
			
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
			
			this.tipobancoretencionConstantesFunciones=new TipoBancoRetencionConstantesFunciones(); 
			this.tipobancoretencionBean=new TipoBancoRetencion();//this.tipobancoretencionConstantesFunciones); 			
			this.tipobancoretencionReturnGeneral=new TipoBancoRetencionParameterReturnGeneral(); 
		
			TipoBancoRetencionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Banco Retencion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipobancoretencion=new TipoBancoRetencion();
			this.tipobancoretencions = new ArrayList<TipoBancoRetencion>();
			this.tipobancoretencionsAux = new ArrayList<TipoBancoRetencion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic=new TipoBancoRetencionLogic();
				this.tipobancoretencionLogic.getNewConnexionToDeep("");
			}
			
			//this.tipobancoretencionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipobancoretencionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoBancoRetencion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoBancoRetencion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoBancoRetencion);	
					}
					
					if(this.jInternalFrameImportacionTipoBancoRetencion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoBancoRetencion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoBancoRetencion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoBancoRetencion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoBancoRetencion);
				this.jInternalFrameDetalleFormTipoBancoRetencion.setVisible(false);
				this.jInternalFrameDetalleFormTipoBancoRetencion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoBancoRetencion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoBancoRetencion);
					this.jInternalFrameReporteDinamicoTipoBancoRetencion.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoBancoRetencion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoBancoRetencion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoBancoRetencion);
					this.jInternalFrameImportacionTipoBancoRetencion.setVisible(false);
					this.jInternalFrameImportacionTipoBancoRetencion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoBancoRetencion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoBancoRetencion);
					this.jInternalFrameOrderByTipoBancoRetencion.setVisible(false);
					this.jInternalFrameOrderByTipoBancoRetencion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoBancoRetencionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoBancoRetencionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipobancoretencionReturnGeneral=new TipoBancoRetencionParameterReturnGeneral();
			
			this.tipobancoretencionParameterGeneral=new TipoBancoRetencionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipobancoretencionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoBancoRetencionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoBancoRetencionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipobancoretencionSessionBean.getEsGuardarRelacionado(),this.tipobancoretencionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoBancoRetencionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipobancoretencionSessionBean.getEsGuardarRelacionado(),this.tipobancoretencionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoBancoRetencion=false;
			this.isVisibilidadCeldaDuplicarTipoBancoRetencion=true;
			this.isVisibilidadCeldaCopiarTipoBancoRetencion=true;
			this.isVisibilidadCeldaVerFormTipoBancoRetencion=true;
			this.isVisibilidadCeldaOrdenTipoBancoRetencion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoRetencion=false;
			this.isVisibilidadCeldaModificarTipoBancoRetencion=false;
			this.isVisibilidadCeldaActualizarTipoBancoRetencion=false;
			this.isVisibilidadCeldaEliminarTipoBancoRetencion=false;
			this.isVisibilidadCeldaCancelarTipoBancoRetencion=false;
			this.isVisibilidadCeldaGuardarTipoBancoRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBancoRetencion=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoBancoRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoBancoRetencion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoBancoRetencion(false);
			
			this.setPermisosUsuarioTipoBancoRetencion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipobancoretencionSessionBean.getEsGuardarRelacionado() 
				|| (this.tipobancoretencionSessionBean.getEsGuardarRelacionado() && this.tipobancoretencionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoBancoRetencionClasesRelacionadas();
			}
			
			if(this.tipobancoretencionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoBancoRetencionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoBancoRetencionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoBancoRetencion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoBancoRetencion();
			}
			
			if(!this.isPermisoBusquedaTipoBancoRetencion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoBancoRetencion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoBancoRetencion,this.isPermisoPaginacionMedioTipoBancoRetencion,this.isPermisoPaginacionTodoTipoBancoRetencion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoBancoRetencionConstantesFunciones.getTiposSeleccionarTipoBancoRetencion());
				
				this.tiposColumnasSelect=TipoBancoRetencionConstantesFunciones.getTiposSeleccionarTipoBancoRetencion(true);
				
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
			//if(!this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoBancoRetencion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoBancoRetencion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoBancoRetencion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoBancoRetencion() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipobancoretencionImplementable= (TipoBancoRetencionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoBancoRetencionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipobancoretencionImplementableHome= (TipoBancoRetencionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoBancoRetencionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipobancoretencions= new ArrayList<TipoBancoRetencion>();
			this.tipobancoretencionsEliminados= new ArrayList<TipoBancoRetencion>();
						
			this.isEsNuevoTipoBancoRetencion=false;
			this.esParaAccionDesdeFormularioTipoBancoRetencion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoBancoRetencion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoBancoRetencion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoBancoRetencionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoBancoRetencionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoBancoRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoBancoRetencion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoBancoRetencion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoBancoRetencion();
			}
			
			TipoBancoRetencionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoBancoRetencion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoBancoRetencion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoBancoRetencion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoBancoRetencion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoBancoRetencion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoBancoRetencion() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoBancoRetencion")) {
				iIndex=this.jInternalFrameDetalleFormTipoBancoRetencion.jTabbedPaneRelacionesTipoBancoRetencion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoBancoRetencion.jTabbedPaneRelacionesTipoBancoRetencion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoBancoRetencion.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoBancoRetencion();	
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
	
	public void cargarCombosForeignKeyTipoBancoRetencion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoBancoRetencion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoBancoRetencion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoBancoRetencionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoBancoRetencion();
		
		this.cargarCombosFrameForeignKeyTipoBancoRetencion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoBancoRetencion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoBancoRetencion();
		}
	}
	
	
	
	public void jButtonNuevoTipoBancoRetencionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipobancoretencionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoBancoRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
			
			
			if(jTableDatosTipoBancoRetencion.getRowCount()>=1) {
				jTableDatosTipoBancoRetencion.removeRowSelectionInterval(0, jTableDatosTipoBancoRetencion.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoBancoRetencion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoBancoRetencion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoBancoRetencion(true);			
			//this.tipobancoretencion=new TipoBancoRetencion();
			//this.tipobancoretencion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoBancoRetencion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoBancoRetencion() ;
			
			if(TipoBancoRetencionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoBancoRetencion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipobancoretencion);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipobancoretencion);				
			
			TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
			
			if(this.tipobancoretencionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoBancoRetencion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoBancoRetencionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoBancoRetencion> tipobancoretencionsSeleccionados=new ArrayList<TipoBancoRetencion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoBancoRetencion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoBancoRetencion.getSelectedRows().length;			
			}
			
			tipobancoretencionsSeleccionados=this.getTipoBancoRetencionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoBancoRetencion--;			
				//TipoBancoRetencion tipobancoretencionAux= new TipoBancoRetencion();			
				//tipobancoretencionAux.setId(this.iIdNuevoTipoBancoRetencion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoBancoRetencion tipobancoretencionOrigen=new TipoBancoRetencion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoBancoRetencion tipobancoretencionOrigen : tipobancoretencionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoBancoRetencion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipobancoretencionOrigen =(TipoBancoRetencion) this.tipobancoretencionLogic.getTipoBancoRetencions().toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipobancoretencionOrigen =(TipoBancoRetencion) this.tipobancoretencions.toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoBancoRetencion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipobancoretencion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoBancoRetencion(tipobancoretencionOrigen,this.tipobancoretencion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoRetencion(this.tipobancoretencion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipobancoretencionLogic.getTipoBancoRetencions().add(this.tipobancoretencionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipobancoretencions.add(this.tipobancoretencionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoBancoRetencion(false);
				
				this.jTableDatosTipoBancoRetencion.setRowSelectionInterval(this.getIndiceNuevoTipoBancoRetencion(), this.getIndiceNuevoTipoBancoRetencion());
				
				int iLastRow =  this.jTableDatosTipoBancoRetencion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoBancoRetencion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoBancoRetencion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoBancoRetencion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoBancoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoBancoRetencion> tipobancoretencionsSeleccionados=new ArrayList<TipoBancoRetencion>();									
		
			TipoBancoRetencion tipobancoretencionOrigen=new TipoBancoRetencion();
			TipoBancoRetencion tipobancoretencionDestino=new TipoBancoRetencion();
				
			tipobancoretencionsSeleccionados=this.getTipoBancoRetencionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoBancoRetencion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipobancoretencionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoBancoRetencion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancoretencionOrigen =(TipoBancoRetencion) this.tipobancoretencionLogic.getTipoBancoRetencions().toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipobancoretencionOrigen =(TipoBancoRetencion) this.tipobancoretencions.toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancoretencionDestino =(TipoBancoRetencion) this.tipobancoretencionLogic.getTipoBancoRetencions().toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipobancoretencionDestino =(TipoBancoRetencion) this.tipobancoretencions.toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipobancoretencionOrigen =tipobancoretencionsSeleccionados.get(0);
				tipobancoretencionDestino =tipobancoretencionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoBancoRetencion(tipobancoretencionOrigen,tipobancoretencionDestino,true,false);
				
				tipobancoretencionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipobancoretencionDestino,tipobancoretencionLogic.getTipoBancoRetencions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipobancoretencionDestino,tipobancoretencions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoBancoRetencion(false);
				
				//this.jTableDatosTipoBancoRetencion.setRowSelectionInterval(this.getIndiceNuevoTipoBancoRetencion(), this.getIndiceNuevoTipoBancoRetencion());
				
				int iLastRow =  this.jTableDatosTipoBancoRetencion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoBancoRetencion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoBancoRetencion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoBancoRetencion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoBancoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoBancoRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoBancoRetencion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoBancoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoBancoRetencion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoBancoRetencion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoBancoRetencion.setVisible(!isVisible);
			this.jPanelPaginacionTipoBancoRetencion.setVisible(!isVisible);
			this.jPanelAccionesTipoBancoRetencion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoBancoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoBancoRetencion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoBancoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoBancoRetencion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoBancoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoBancoRetencion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoBancoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoBancoRetencion();
			
			this.abrirFrameOrderByTipoBancoRetencion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoBancoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoBancoRetencion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoBancoRetencion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoBancoRetencion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoBancoRetencion.isMaximum()) {
					this.jInternalFrameDetalleFormTipoBancoRetencion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoBancoRetencion.setSize(this.jInternalFrameDetalleFormTipoBancoRetencion.iWidthFormulario,this.jInternalFrameDetalleFormTipoBancoRetencion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoBancoRetencion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoBancoRetencion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoBancoRetencion.isMaximum()) {
						this.jInternalFrameDetalleFormTipoBancoRetencion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoBancoRetencion.jContentPaneDetalleTipoBancoRetencion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoBancoRetencion.jTabbedPaneRelacionesTipoBancoRetencion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoBancoRetencion.jContentPaneDetalleTipoBancoRetencion.getWidth(),TipoBancoRetencionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoBancoRetencion.jTabbedPaneRelacionesTipoBancoRetencion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoBancoRetencion.jContentPaneDetalleTipoBancoRetencion.getWidth(),TipoBancoRetencionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoBancoRetencion.jTabbedPaneRelacionesTipoBancoRetencion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoBancoRetencion.jContentPaneDetalleTipoBancoRetencion.getWidth(),TipoBancoRetencionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoBancoRetencion.setVisible(true);
	        this.jInternalFrameDetalleFormTipoBancoRetencion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoBancoRetencion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoBancoRetencion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoBancoRetencion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoBancoRetencion,false,this);
				} else {
					this.jInternalFrameOrderByTipoBancoRetencion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoBancoRetencion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoBancoRetencion);
				this.jInternalFrameOrderByTipoBancoRetencion.setVisible(false);
				this.jInternalFrameOrderByTipoBancoRetencion.setSelected(false);
				
				this.jInternalFrameOrderByTipoBancoRetencion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoBancoRetencion"));
				
				this.inicializarActualizarBindingTablaOrderByTipoBancoRetencion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoBancoRetencion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoBancoRetencion==null) {
				
				this.jInternalFrameImportacionTipoBancoRetencion=new ImportacionJInternalFrame(TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoBancoRetencion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoBancoRetencion);
				this.jInternalFrameImportacionTipoBancoRetencion.setVisible(false);
				this.jInternalFrameImportacionTipoBancoRetencion.setSelected(false);


				this.jInternalFrameImportacionTipoBancoRetencion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoBancoRetencion"));
				this.jInternalFrameImportacionTipoBancoRetencion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoBancoRetencion"));
				this.jInternalFrameImportacionTipoBancoRetencion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoBancoRetencion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoBancoRetencion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoBancoRetencion==null) {
				this.jInternalFrameReporteDinamicoTipoBancoRetencion=new ReporteDinamicoJInternalFrame(TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoBancoRetencion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoBancoRetencion);
				this.jInternalFrameReporteDinamicoTipoBancoRetencion.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoBancoRetencion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoBancoRetencion"));
				this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoBancoRetencion"));
				this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoBancoRetencion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoBancoRetencion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoBancoRetencion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoBancoRetencion);
			
	       	this.jInternalFrameDetalleFormTipoBancoRetencion.setVisible(false);
	        this.jInternalFrameDetalleFormTipoBancoRetencion.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoBancoRetencion.dispose();
			//this.jInternalFrameDetalleFormTipoBancoRetencion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoBancoRetencion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoBancoRetencion.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoBancoRetencion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoBancoRetencion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoBancoRetencion.setVisible(true);
	        this.jInternalFrameImportacionTipoBancoRetencion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoBancoRetencion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoBancoRetencion.setVisible(true);
	        this.jInternalFrameOrderByTipoBancoRetencion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoBancoRetencion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoBancoRetencion.setVisible(false);
	        this.jInternalFrameOrderByTipoBancoRetencion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoBancoRetencion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoBancoRetencion.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoBancoRetencion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoBancoRetencion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoBancoRetencion.setVisible(false);
	        this.jInternalFrameImportacionTipoBancoRetencion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoBancoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoBancoRetencion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoBancoRetencion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoBancoRetencion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoBancoRetencion(true);
			//this.isEsNuevoTipoBancoRetencion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencion =(TipoBancoRetencion) this.tipobancoretencionLogic.getTipoBancoRetencions().toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipobancoretencion =(TipoBancoRetencion) this.tipobancoretencions.toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoBancoRetencion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoBancoRetencion(false) ;
			
			if(tipobancoretencionSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoBancoRetencionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoBancoRetencion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoBancoRetencion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoBancoRetencionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoBancoRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoretencion =(TipoBancoRetencion) this.tipobancoretencionLogic.getTipoBancoRetencions().toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobancoretencion =(TipoBancoRetencion) this.tipobancoretencions.toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoBancoRetencion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoBancoRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoBancoRetencion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoBancoRetencion(true);
			//this.isEsNuevoTipoBancoRetencion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencion =(TipoBancoRetencion) this.tipobancoretencionLogic.getTipoBancoRetencions().toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipobancoretencion =(TipoBancoRetencion) this.tipobancoretencions.toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipobancoretencion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoBancoRetencion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoBancoRetencion(false) ;
			
			if(TipoBancoRetencionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoBancoRetencion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoBancoRetencion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoBancoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoBancoRetencion(false);
			
			//if(!this.isEsNuevoTipoBancoRetencion) {								
				int intSelectedRow = this.jTableDatosTipoBancoRetencion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoretencion =(TipoBancoRetencion) this.tipobancoretencionLogic.getTipoBancoRetencions().toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipobancoretencion =(TipoBancoRetencion) this.tipobancoretencions.toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoBancoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoBancoRetencion(this.tipobancoretencion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoRetencion(this.tipobancoretencion);
				
			}
			
			if(this.permiteMantenimiento(this.tipobancoretencion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoBancoRetencion=true;
					this.inicializarActualizarBindingTablaTipoBancoRetencion(false);
					this.isEsNuevoTipoBancoRetencion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoBancoRetencion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoBancoRetencion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoBancoRetencion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoBancoRetencion(false);
				
				this.habilitarDeshabilitarControlesTipoBancoRetencion(false);
			
												
				
				if(TipoBancoRetencionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoBancoRetencion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoBancoRetencionActionPerformed(evt,tipobancoretencionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoBancoRetencion(this.tipobancoretencion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoBancoRetencion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipobancoretencionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipobancoretencion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoBancoRetencion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoRetencion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoBancoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoBancoRetencion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencion =(TipoBancoRetencion) this.tipobancoretencionLogic.getTipoBancoRetencions().toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
				this.tipobancoretencion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipobancoretencion =(TipoBancoRetencion) this.tipobancoretencions.toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
				this.tipobancoretencion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipobancoretencion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoBancoRetencionModel) this.jTableDatosTipoBancoRetencion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoBancoRetencion=true;
				this.inicializarActualizarBindingTablaTipoBancoRetencion(false);
				this.isEsNuevoTipoBancoRetencion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoBancoRetencion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoBancoRetencion(false);
				
				this.habilitarDeshabilitarControlesTipoBancoRetencion(false);
				
				
				
				if(TipoBancoRetencionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoBancoRetencion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoBancoRetencionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoBancoRetencion.getRowCount()>=1) {
				jTableDatosTipoBancoRetencion.removeRowSelectionInterval(0, jTableDatosTipoBancoRetencion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoBancoRetencion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoBancoRetencion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoBancoRetencion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoBancoRetencion(false) ;
			
			this.isEsNuevoTipoBancoRetencion=false;
			
			if(TipoBancoRetencionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoBancoRetencion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoBancoRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoBancoRetencion(false);
				
				//SI ES MANUAL
				if(TipoBancoRetencionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoBancoRetencion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoBancoRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoBancoRetencion--;			
			//TipoBancoRetencion tipobancoretencionAux= new TipoBancoRetencion();			
			//tipobancoretencionAux.setId(this.iIdNuevoTipoBancoRetencion);
			
			if(this.jInternalFrameDetalleFormTipoBancoRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoBancoRetencion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoRetencion(this.tipobancoretencion);
			
			this.tipobancoretencion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipobancoretencionLogic.getTipoBancoRetencions().add(this.tipobancoretencionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipobancoretencions.add(this.tipobancoretencionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoBancoRetencion(false);
			
			this.jTableDatosTipoBancoRetencion.setRowSelectionInterval(this.getIndiceNuevoTipoBancoRetencion(), this.getIndiceNuevoTipoBancoRetencion());
			
			int iLastRow =  this.jTableDatosTipoBancoRetencion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoBancoRetencion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoBancoRetencion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoBancoRetencion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoBancoRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoBancoRetencion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoBancoRetencion(false);
			
			//SI ES MANUAL
			if(TipoBancoRetencionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoBancoRetencion();
			}
			
			//this.abrirFrameTreeTipoBancoRetencion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoBancoRetencionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Banco RetencionES ?", "MANTENIMIENTO DE Tipo Banco Retencion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoBancoRetencion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoBancoRetencion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipobancoretencionReturnGeneral=tipobancoretencionLogic.procesarImportacionTipoBancoRetencionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipobancoretencionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoBancoRetencionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoBancoRetencionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoBancoRetencion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoBancoRetencion.setFileImportacion(this.jInternalFrameImportacionTipoBancoRetencion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoBancoRetencion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoBancoRetencion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoBancoRetencion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoBancoRetencion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoBancoRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoBancoRetencion> tipobancoretencionsSeleccionados=new ArrayList<TipoBancoRetencion>();		

		tipobancoretencionsSeleccionados=this.getTipoBancoRetencionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoBancoRetencionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoBancoRetencionBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoBancoRetencions("Todos",tipobancoretencionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco Retencion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoBancoRetencionConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoBancoRetencionConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoBancoRetencionConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoBancoRetencionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoBancoRetencionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoBancoRetencionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoBancoRetencionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoBancoRetencionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoBancoRetencionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoBancoRetencionConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoBancoRetencionConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoBancoRetencionConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoBancoRetencionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoBancoRetencion> tipobancoretencionsSeleccionados=new ArrayList<TipoBancoRetencion>();		
		
		tipobancoretencionsSeleccionados=this.getTipoBancoRetencionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobancoretencion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoBancoRetencions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoBancoRetencionConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoBancoRetencionConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoBancoRetencion tipobancoretencion:tipobancoretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipobancoretencion.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoBancoRetencionConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoBancoRetencionConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoBancoRetencion tipobancoretencion:tipobancoretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipobancoretencion.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoBancoRetencionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoBancoRetencionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoBancoRetencion tipobancoretencion:tipobancoretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipobancoretencion.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoBancoRetencion(row);				
			//	iRow++;
			//}				
			
			//for(TipoBancoRetencion tipobancoretencionAux:tipobancoretencionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoBancoRetencion(tipobancoretencionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco Retencion",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipobancoretencionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoBancoRetencion(false);
			
			//SI ES MANUAL
			if(TipoBancoRetencionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoBancoRetencion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoBancoRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoBancoRetencion(false);
			
			//SI ES MANUAL
			if(TipoBancoRetencionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoBancoRetencion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoBancoRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoBancoRetencion(false);
			
			//SI ES MANUAL
			if(TipoBancoRetencionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoBancoRetencion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoBancoRetencion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoBancoRetencion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoBancoRetencion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoBancoRetencion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoBancoRetencion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoBancoRetencion.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoBancoRetencion.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoBancoRetencion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoBancoRetencion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoBancoRetencion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoBancoRetencion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoBancoRetencion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoBancoRetencion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoBancoRetencion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoBancoRetencion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoBancoRetencion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoBancoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoBancoRetencionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoBancoRetencion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoBancoRetencion();
		
		this.inicializarActualizarBindingBotonesManualTipoBancoRetencion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoBancoRetencion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoBancoRetencion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoBancoRetencion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoBancoRetencion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoBancoRetencion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoBancoRetencion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoBancoRetencion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoBancoRetencion.jCheckBoxPostAccionNuevoTipoBancoRetencion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoBancoRetencion.jCheckBoxPostAccionSinCerrarTipoBancoRetencion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoBancoRetencion.jCheckBoxPostAccionSinMensajeTipoBancoRetencion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoBancoRetencion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoBancoRetencion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoBancoRetencion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) {
				this.jInternalFrameDetalleFormTipoBancoRetencion.jCheckBoxPostAccionNuevoTipoBancoRetencion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoBancoRetencion.jCheckBoxPostAccionSinCerrarTipoBancoRetencion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoBancoRetencion.jCheckBoxPostAccionSinMensajeTipoBancoRetencion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoBancoRetencion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoBancoRetencion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoBancoRetencion.jComboBoxTiposAccionesFormularioTipoBancoRetencion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoBancoRetencion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoBancoRetencion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoBancoRetencion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoBancoRetencion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoBancoRetencion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoBancoRetencion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoBancoRetencion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoBancoRetencion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoBancoRetencion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoBancoRetencion(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoBancoRetencionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoBancoRetencion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoBancoRetencion() throws Exception {
		try	{
			if(TipoBancoRetencionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoBancoRetencion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoBancoRetencion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoBancoRetencion.jComboBoxTiposAccionesFormularioTipoBancoRetencion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoBancoRetencion.jComboBoxTiposAccionesFormularioTipoBancoRetencion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoBancoRetencion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoBancoRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoBancoRetencion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoBancoRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoBancoRetencion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoBancoRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoBancoRetencion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoBancoRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoBancoRetencion.addItem(reporte);
			}
			
			
			if(!this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoBancoRetencion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoBancoRetencion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoBancoRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoBancoRetencion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoBancoRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoBancoRetencion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoBancoRetencion.jComboBoxTiposAccionesFormularioTipoBancoRetencion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoBancoRetencion.jComboBoxTiposAccionesFormularioTipoBancoRetencion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoBancoRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoBancoRetencion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoBancoRetencion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoBancoRetencion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoBancoRetencion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoBancoRetencion!=null) {
				this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoBancoRetencion!=null) {
				this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoBancoRetencion!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoBancoRetencion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoTipoBancoRetencion.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoBancoRetencion.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoBancoRetencion(Boolean esInicializar) throws Exception {				
		if(TipoBancoRetencionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoBancoRetencion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoBancoRetencion() throws Exception {
		this.inicializarActualizarBindingTablaTipoBancoRetencion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoBancoRetencion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoBancoRetencion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoBancoRetencion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoBancoRetencion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoBancoRetencionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoBancoRetencion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoBancoRetencion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoBancoRetencionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoBancoRetencionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoBancoRetencionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoBancoRetencionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoBancoRetencion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoBancoRetencion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoBancoRetencionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoBancoRetencion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoBancoRetencion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipobancoretencionLogic.getTipoBancoRetencions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipobancoretencions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoBancoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoBancoRetencion.setModel(new TipoBancoRetencionModel(this.tipobancoretencionLogic.getTipoBancoRetencions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoBancoRetencion.setModel(new TipoBancoRetencionModel(this.tipobancoretencions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoBancoRetencion!=null && this.jInternalFrameOrderByTipoBancoRetencion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoBancoRetencion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoBancoRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoBancoRetencion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoBancoRetencionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO,tipobancoretencionConstantesFunciones.resaltarSeleccionarTipoBancoRetencion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO,tipobancoretencionConstantesFunciones.resaltarSeleccionarTipoBancoRetencion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoBancoRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoBancoRetencion,TipoBancoRetencionConstantesFunciones.LABEL_ID));

		if(this.tipobancoretencionConstantesFunciones.mostraridTipoBancoRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoBancoRetencionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipobancoretencionConstantesFunciones.resaltaridTipoBancoRetencion,this.tipobancoretencionConstantesFunciones.activaridTipoBancoRetencion,this,true,"idTipoBancoRetencion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipobancoretencionConstantesFunciones.resaltaridTipoBancoRetencion,this.tipobancoretencionConstantesFunciones.activaridTipoBancoRetencion,this,true,"idTipoBancoRetencion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoBancoRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoBancoRetencion,TipoBancoRetencionConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipobancoretencionConstantesFunciones.mostrarid_empresaTipoBancoRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoBancoRetencionConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipobancoretencionConstantesFunciones.resaltarid_empresaTipoBancoRetencion,this,this.tipobancoretencionConstantesFunciones.activarid_empresaTipoBancoRetencion));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipobancoretencionConstantesFunciones.resaltarid_empresaTipoBancoRetencion,this,this.tipobancoretencionConstantesFunciones.activarid_empresaTipoBancoRetencion,false,"id_empresaTipoBancoRetencion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoBancoRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoBancoRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoBancoRetencion,TipoBancoRetencionConstantesFunciones.LABEL_CODIGO));

		if(this.tipobancoretencionConstantesFunciones.mostrarcodigoTipoBancoRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoBancoRetencionConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipobancoretencionConstantesFunciones.resaltarcodigoTipoBancoRetencion,this.tipobancoretencionConstantesFunciones.activarcodigoTipoBancoRetencion,this,true,"codigoTipoBancoRetencion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipobancoretencionConstantesFunciones.resaltarcodigoTipoBancoRetencion,this.tipobancoretencionConstantesFunciones.activarcodigoTipoBancoRetencion,this,true,"codigoTipoBancoRetencion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoBancoRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoBancoRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoBancoRetencion,TipoBancoRetencionConstantesFunciones.LABEL_NOMBRE));

		if(this.tipobancoretencionConstantesFunciones.mostrarnombreTipoBancoRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoBancoRetencionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipobancoretencionConstantesFunciones.resaltarnombreTipoBancoRetencion,this.tipobancoretencionConstantesFunciones.activarnombreTipoBancoRetencion,this,true,"nombreTipoBancoRetencion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipobancoretencionConstantesFunciones.resaltarnombreTipoBancoRetencion,this.tipobancoretencionConstantesFunciones.activarnombreTipoBancoRetencion,this,true,"nombreTipoBancoRetencion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoBancoRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipobancoretencionSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipobancoretencionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipobancoretencionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoBancoRetencion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipobancoretencionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipobancoretencionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoBancoRetencion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoBancoRetencion && this.isPermisoGuardarCambiosTipoBancoRetencion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipobancoretencionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipobancoretencionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoBancoRetencion.addColumn(tableColumn);
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
			
			this.jTableDatosTipoBancoRetencion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoBancoRetencion && this.isPermisoGuardarCambiosTipoBancoRetencion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoBancoRetencion && this.isPermisoGuardarCambiosTipoBancoRetencion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoBancoRetencion.moveColumn(this.jTableDatosTipoBancoRetencion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoBancoRetencion.moveColumn(this.jTableDatosTipoBancoRetencion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoBancoRetencion.moveColumn(this.jTableDatosTipoBancoRetencion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoBancoRetencion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoBancoRetencion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoBancoRetencion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoBancoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoBancoRetencion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoBancoRetencion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoBancoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoBancoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoBancoRetencion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoBancoRetencion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoBancoRetencion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipobancoretencionLogic.getTipoBancoRetencions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipobancoretencions.size()-1;
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
		//this.jTableDatosTipoBancoRetencion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoBancoRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoBancoRetencion();
			
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
				
				//this.isEsNuevoTipoBancoRetencion=false;
					
				TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
			
				if(this.tipobancoretencionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoBancoRetencion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoBancoRetencion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoBancoRetencion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoretencion =(TipoBancoRetencion) this.tipobancoretencionLogic.getTipoBancoRetencions().toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobancoretencion =(TipoBancoRetencion) this.tipobancoretencions.toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipobancoretencion.getsType().equals("DUPLICADO")
				   || this.tipobancoretencion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoBancoRetencion=true;
				
				} else {
					this.isEsNuevoTipoBancoRetencion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {
					if(this.tipobancoretencion.getId()>=0 && !this.tipobancoretencion.getIsNew()) {						
						this.isEsNuevoTipoBancoRetencion=false;
						
					} else {
						this.isEsNuevoTipoBancoRetencion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoBancoRetencion(esRelaciones);						
				
				this.seleccionarTipoBancoRetencion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipobancoretencion.getId()<0) {
					this.isEsNuevoTipoBancoRetencion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoBancoRetencion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoBancoRetencion(evt,rowIndex);
				}	
				
				if(this.tipobancoretencionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoBancoRetencion: " + this.dDif); 
					}
				}								
				
				TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoBancoRetencion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipobancoretencion)) {
					if(this.tipobancoretencion.getId()>0) {
						this.tipobancoretencion.setIsDeleted(true);
						
						this.tipobancoretencionsEliminados.add(this.tipobancoretencion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipobancoretencionLogic.getTipoBancoRetencions().remove(this.tipobancoretencion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipobancoretencions.remove(this.tipobancoretencion);				
					}
					
					
					((TipoBancoRetencionModel) this.jTableDatosTipoBancoRetencion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoBancoRetencion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoBancoRetencion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoBancoRetencion) {
			
			if(this.jInternalFrameDetalleFormTipoBancoRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoBancoRetencion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoBancoRetencion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoretencion =(TipoBancoRetencion) this.tipobancoretencionLogic.getTipoBancoRetencions().toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobancoretencion =(TipoBancoRetencion) this.tipobancoretencions.toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoBancoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoBancoRetencion(this.tipobancoretencion);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipobancoretencionConstantesFunciones.cargarid_empresaTipoBancoRetencion || this.tipobancoretencionConstantesFunciones.event_dependid_empresaTipoBancoRetencion) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipobancoretencion.getid_empresa());
									//this.inicializarActualizarBindingTipoBancoRetencion(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipobancoretencion.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipobancoretencion.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipobancoretencion.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoBancoRetencion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoBancoRetencion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoBancoRetencion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoBancoRetencion(TipoBancoRetencion tipobancoretencion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoBancoRetencion(tipobancoretencion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoBancoRetencion(TipoBancoRetencion tipobancoretencion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoBancoRetencion(tipobancoretencion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoBancoRetencion(tipobancoretencion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoBancoRetencion(tipobancoretencion);
	}
	
	public void setVariablesObjetoActualToFormularioTipoBancoRetencion(TipoBancoRetencion tipobancoretencion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoBancoRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoBancoRetencion.jLabelidTipoBancoRetencion.setText(tipobancoretencion.getId().toString());
			this.jInternalFrameDetalleFormTipoBancoRetencion.jTextFieldcodigoTipoBancoRetencion.setText(tipobancoretencion.getcodigo());
			this.jInternalFrameDetalleFormTipoBancoRetencion.jTextAreanombreTipoBancoRetencion.setText(tipobancoretencion.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoBancoRetencion tipobancoretencionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipobancoretencionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoBancoRetencion tipobancoretencionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipobancoretencionLocal=this.tipobancoretencion;
			} else {
				tipobancoretencionLocal=this.tipobancoretencionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipobancoretencionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoBancoRetencion(tipobancoretencionLocal,true);
					
					if(tipobancoretencionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipobancoretencionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipobancoretencionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoBancoRetencion(TipoBancoRetencion tipobancoretencion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoBancoRetencion(tipobancoretencion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoRetencion(tipobancoretencion);
	}
	
	public void setVariablesFormularioToObjetoActualTipoBancoRetencion(TipoBancoRetencion tipobancoretencion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoBancoRetencion(tipobancoretencion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoBancoRetencion(TipoBancoRetencion tipobancoretencion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoBancoRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoBancoRetencion.jLabelidTipoBancoRetencion.getText()==null || this.jInternalFrameDetalleFormTipoBancoRetencion.jLabelidTipoBancoRetencion.getText()=="" || this.jInternalFrameDetalleFormTipoBancoRetencion.jLabelidTipoBancoRetencion.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoBancoRetencion.jLabelidTipoBancoRetencion.setText("0");
			}

			if(conColumnasBase) {tipobancoretencion.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoBancoRetencion.jLabelidTipoBancoRetencion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoBancoRetencionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoBancoRetencion.jLabelIdTipoBancoRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipobancoretencion.setcodigo(this.jInternalFrameDetalleFormTipoBancoRetencion.jTextFieldcodigoTipoBancoRetencion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoBancoRetencionConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoBancoRetencion.jLabelcodigoTipoBancoRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipobancoretencion.setnombre(this.jInternalFrameDetalleFormTipoBancoRetencion.jTextAreanombreTipoBancoRetencion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoBancoRetencionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoBancoRetencion.jLabelnombreTipoBancoRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoBancoRetencion(TipoBancoRetencion tipobancoretencionBean,TipoBancoRetencion tipobancoretencion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoBancoRetencion(TipoBancoRetencion tipobancoretencionOrigen,TipoBancoRetencion tipobancoretencion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipobancoretencionOrigen.getId()!=null && !tipobancoretencionOrigen.getId().equals(0L))) {tipobancoretencion.setId(tipobancoretencionOrigen.getId());}}
			if(conDefault || (!conDefault && tipobancoretencionOrigen.getcodigo()!=null && !tipobancoretencionOrigen.getcodigo().equals(""))) {tipobancoretencion.setcodigo(tipobancoretencionOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipobancoretencionOrigen.getnombre()!=null && !tipobancoretencionOrigen.getnombre().equals(""))) {tipobancoretencion.setnombre(tipobancoretencionOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoBancoRetencion(TipoBancoRetencion tipobancoretencion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoBancoRetencion.jLabelidTipoBancoRetencion.setText(tipobancoretencion.getId().toString());
			this.jInternalFrameDetalleFormTipoBancoRetencion.jTextFieldcodigoTipoBancoRetencion.setText(tipobancoretencion.getcodigo());
			this.jInternalFrameDetalleFormTipoBancoRetencion.jTextAreanombreTipoBancoRetencion.setText(tipobancoretencion.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoBancoRetencion(TipoBancoRetencionBean tipobancoretencionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoBancoRetencion.jLabelidTipoBancoRetencion.setText(tipobancoretencionBean.getId().toString());
			this.jInternalFrameDetalleFormTipoBancoRetencion.jTextFieldcodigoTipoBancoRetencion.setText(tipobancoretencionBean.getcodigo());
			this.jInternalFrameDetalleFormTipoBancoRetencion.jTextAreanombreTipoBancoRetencion.setText(tipobancoretencionBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoBancoRetencion(TipoBancoRetencionParameterReturnGeneral tipobancoretencionReturnGeneral,TipoBancoRetencionBean tipobancoretencionBean,Boolean conDefault) throws Exception { 
		try {
			TipoBancoRetencion tipobancoretencionLocal=new TipoBancoRetencion();
			
			tipobancoretencionLocal=tipobancoretencionReturnGeneral.getTipoBancoRetencion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipobancoretencionLocal.getId()!=null && !tipobancoretencionLocal.getId().equals(0L))) {tipobancoretencionBean.setId(tipobancoretencionLocal.getId());}}
			if(conDefault || (!conDefault && tipobancoretencionLocal.getcodigo()!=null && !tipobancoretencionLocal.getcodigo().equals(""))) {tipobancoretencionBean.setcodigo(tipobancoretencionLocal.getcodigo());}
			if(conDefault || (!conDefault && tipobancoretencionLocal.getnombre()!=null && !tipobancoretencionLocal.getnombre().equals(""))) {tipobancoretencionBean.setnombre(tipobancoretencionLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoBancoRetencionGenerico(Long idTipoBancoRetencionSeleccionado,JComboBox jComboBoxTipoBancoRetencion,List<TipoBancoRetencion> tipobancoretencionsLocal)throws Exception {
		try {
			TipoBancoRetencion  tipobancoretencionTemp=null;

			for(TipoBancoRetencion tipobancoretencionAux:tipobancoretencionsLocal) {
				if(tipobancoretencionAux.getId()!=null && tipobancoretencionAux.getId().equals(idTipoBancoRetencionSeleccionado)) {
					tipobancoretencionTemp=tipobancoretencionAux;
					break;
				}
			}

			jComboBoxTipoBancoRetencion.setSelectedItem(tipobancoretencionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoBancoRetencionGenerico(JComboBox jComboBoxTipoBancoRetencion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoBancoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoBancoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoBancoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoBancoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoBancoRetencion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoBancoRetencion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoBancoRetencion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoBancoRetencion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoBancoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoBancoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipobancoretencion=(TipoBancoRetencion) tipobancoretencionLogic.getTipoBancoRetencions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipobancoretencion =(TipoBancoRetencion) tipobancoretencions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipobancoretencion.getIsNew() && !tipobancoretencion.getIsChanged() && !tipobancoretencion.getIsDeleted()) {
				sDescripcion=tipobancoretencion.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipobancoretencion.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoBancoRetencion tipobancoretencionRow=new TipoBancoRetencion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipobancoretencionRow=(TipoBancoRetencion) tipobancoretencionLogic.getTipoBancoRetencions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipobancoretencionRow=(TipoBancoRetencion) tipobancoretencions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoBancoRetencion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoBancoRetencion.setVisible((this.isVisibilidadCeldaNuevoTipoBancoRetencion && this.isPermisoNuevoTipoBancoRetencion));			
			this.jButtonDuplicarTipoBancoRetencion.setVisible((this.isVisibilidadCeldaDuplicarTipoBancoRetencion && this.isPermisoDuplicarTipoBancoRetencion));			
			this.jButtonCopiarTipoBancoRetencion.setVisible((this.isVisibilidadCeldaCopiarTipoBancoRetencion && this.isPermisoCopiarTipoBancoRetencion));
			this.jButtonVerFormTipoBancoRetencion.setVisible((this.isVisibilidadCeldaVerFormTipoBancoRetencion && this.isPermisoVerFormTipoBancoRetencion));
			
			this.jButtonAbrirOrderByTipoBancoRetencion.setVisible((this.isVisibilidadCeldaOrdenTipoBancoRetencion && this.isPermisoOrdenTipoBancoRetencion));			
			
			this.jButtonNuevoRelacionesTipoBancoRetencion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoBancoRetencion && this.isPermisoNuevoTipoBancoRetencion));			
			this.jButtonNuevoGuardarCambiosTipoBancoRetencion.setVisible((this.isVisibilidadCeldaNuevoTipoBancoRetencion && this.isPermisoNuevoTipoBancoRetencion && this.isPermisoGuardarCambiosTipoBancoRetencion));
			
			if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) {
			this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonModificarTipoBancoRetencion.setVisible((this.isVisibilidadCeldaModificarTipoBancoRetencion && this.isPermisoActualizarTipoBancoRetencion));	
			this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonActualizarTipoBancoRetencion.setVisible((this.isVisibilidadCeldaActualizarTipoBancoRetencion && this.isPermisoActualizarTipoBancoRetencion));	
			this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonEliminarTipoBancoRetencion.setVisible((this.isVisibilidadCeldaEliminarTipoBancoRetencion && this.isPermisoEliminarTipoBancoRetencion));
			this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonCancelarTipoBancoRetencion.setVisible(this.isVisibilidadCeldaCancelarTipoBancoRetencion);							
			this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonGuardarCambiosTipoBancoRetencion.setVisible((this.isVisibilidadCeldaGuardarTipoBancoRetencion && this.isPermisoGuardarCambiosTipoBancoRetencion));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoBancoRetencion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoBancoRetencion && this.isPermisoGuardarCambiosTipoBancoRetencion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoBancoRetencion.setVisible((this.isVisibilidadCeldaNuevoTipoBancoRetencion && this.isPermisoNuevoTipoBancoRetencion));						
			this.jButtonDuplicarToolBarTipoBancoRetencion.setVisible((this.isVisibilidadCeldaDuplicarTipoBancoRetencion && this.isPermisoDuplicarTipoBancoRetencion));						
			this.jButtonCopiarToolBarTipoBancoRetencion.setVisible((this.isVisibilidadCeldaCopiarTipoBancoRetencion && this.isPermisoCopiarTipoBancoRetencion));			
			this.jButtonVerFormToolBarTipoBancoRetencion.setVisible((this.isVisibilidadCeldaVerFormTipoBancoRetencion && this.isPermisoVerFormTipoBancoRetencion));			
			this.jButtonAbrirOrderByToolBarTipoBancoRetencion.setVisible((this.isVisibilidadCeldaOrdenTipoBancoRetencion && this.isPermisoOrdenTipoBancoRetencion));
			this.jButtonNuevoRelacionesToolBarTipoBancoRetencion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoBancoRetencion && this.isPermisoNuevoTipoBancoRetencion));			
			this.jButtonNuevoGuardarCambiosToolBarTipoBancoRetencion.setVisible((this.isVisibilidadCeldaNuevoTipoBancoRetencion && this.isPermisoNuevoTipoBancoRetencion && this.isPermisoGuardarCambiosTipoBancoRetencion));			
			
			if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) {
			this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonModificarToolBarTipoBancoRetencion.setVisible((this.isVisibilidadCeldaModificarTipoBancoRetencion && this.isPermisoActualizarTipoBancoRetencion));	
			this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonActualizarToolBarTipoBancoRetencion.setVisible((this.isVisibilidadCeldaActualizarTipoBancoRetencion  && this.isPermisoActualizarTipoBancoRetencion));	
			this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonEliminarToolBarTipoBancoRetencion.setVisible((this.isVisibilidadCeldaEliminarTipoBancoRetencion && this.isPermisoEliminarTipoBancoRetencion));
			this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonCancelarToolBarTipoBancoRetencion.setVisible(this.isVisibilidadCeldaCancelarTipoBancoRetencion);				
			this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonGuardarCambiosToolBarTipoBancoRetencion.setVisible((this.isVisibilidadCeldaGuardarTipoBancoRetencion && this.isPermisoGuardarCambiosTipoBancoRetencion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoBancoRetencion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoBancoRetencion && this.isPermisoGuardarCambiosTipoBancoRetencion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoBancoRetencion.setVisible((this.isVisibilidadCeldaNuevoTipoBancoRetencion && this.isPermisoNuevoTipoBancoRetencion));			
			this.jMenuItemDuplicarTipoBancoRetencion.setVisible((this.isVisibilidadCeldaDuplicarTipoBancoRetencion && this.isPermisoDuplicarTipoBancoRetencion));			
			this.jMenuItemCopiarTipoBancoRetencion.setVisible((this.isVisibilidadCeldaCopiarTipoBancoRetencion && this.isPermisoCopiarTipoBancoRetencion));			
			this.jMenuItemVerFormTipoBancoRetencion.setVisible((this.isVisibilidadCeldaVerFormTipoBancoRetencion && this.isPermisoVerFormTipoBancoRetencion));			
			this.jMenuItemAbrirOrderByTipoBancoRetencion.setVisible((this.isVisibilidadCeldaOrdenTipoBancoRetencion && this.isPermisoOrdenTipoBancoRetencion));			
			//this.jMenuItemMostrarOcultarTipoBancoRetencion.setVisible((this.isVisibilidadCeldaOrdenTipoBancoRetencion && this.isPermisoOrdenTipoBancoRetencion));
			this.jMenuItemDetalleAbrirOrderByTipoBancoRetencion.setVisible((this.isVisibilidadCeldaOrdenTipoBancoRetencion && this.isPermisoOrdenTipoBancoRetencion));			
			//this.jMenuItemDetalleMostrarOcultarTipoBancoRetencion.setVisible((this.isVisibilidadCeldaOrdenTipoBancoRetencion && this.isPermisoOrdenTipoBancoRetencion));			
			this.jMenuItemNuevoRelacionesTipoBancoRetencion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoBancoRetencion && this.isPermisoNuevoTipoBancoRetencion));			
			this.jMenuItemNuevoGuardarCambiosTipoBancoRetencion.setVisible((this.isVisibilidadCeldaNuevoTipoBancoRetencion && this.isPermisoNuevoTipoBancoRetencion && this.isPermisoGuardarCambiosTipoBancoRetencion));									
			
			if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) {
			this.jInternalFrameDetalleFormTipoBancoRetencion.jMenuItemModificarTipoBancoRetencion.setVisible((this.isVisibilidadCeldaModificarTipoBancoRetencion && this.isPermisoActualizarTipoBancoRetencion));	
			this.jInternalFrameDetalleFormTipoBancoRetencion.jMenuItemActualizarTipoBancoRetencion.setVisible((this.isVisibilidadCeldaActualizarTipoBancoRetencion && this.isPermisoActualizarTipoBancoRetencion));	
			this.jInternalFrameDetalleFormTipoBancoRetencion.jMenuItemEliminarTipoBancoRetencion.setVisible((this.isVisibilidadCeldaEliminarTipoBancoRetencion && this.isPermisoEliminarTipoBancoRetencion));
			this.jInternalFrameDetalleFormTipoBancoRetencion.jMenuItemCancelarTipoBancoRetencion.setVisible(this.isVisibilidadCeldaCancelarTipoBancoRetencion);				
			}
			
			this.jMenuItemGuardarCambiosTipoBancoRetencion.setVisible((this.isVisibilidadCeldaGuardarTipoBancoRetencion && this.isPermisoGuardarCambiosTipoBancoRetencion));						
			this.jMenuItemGuardarCambiosTablaTipoBancoRetencion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoBancoRetencion && this.isPermisoGuardarCambiosTipoBancoRetencion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoBancoRetencion=this.jButtonNuevoTipoBancoRetencion.isVisible();
			this.isVisibilidadCeldaDuplicarTipoBancoRetencion=this.jButtonDuplicarTipoBancoRetencion.isVisible();
			this.isVisibilidadCeldaCopiarTipoBancoRetencion=this.jButtonCopiarTipoBancoRetencion.isVisible();
			this.isVisibilidadCeldaVerFormTipoBancoRetencion=this.jButtonVerFormTipoBancoRetencion.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoBancoRetencion=this.jButtonAbrirOrderByTipoBancoRetencion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoRetencion=this.jButtonNuevoRelacionesTipoBancoRetencion.isVisible();
			this.isVisibilidadCeldaModificarTipoBancoRetencion=this.jButtonModificarTipoBancoRetencion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) {
			this.isVisibilidadCeldaActualizarTipoBancoRetencion=this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonActualizarTipoBancoRetencion.isVisible();
			this.isVisibilidadCeldaEliminarTipoBancoRetencion=this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonEliminarTipoBancoRetencion.isVisible();
			this.isVisibilidadCeldaCancelarTipoBancoRetencion=this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonCancelarTipoBancoRetencion.isVisible();
			this.isVisibilidadCeldaGuardarTipoBancoRetencion=this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonGuardarCambiosTipoBancoRetencion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoBancoRetencion=this.jButtonGuardarCambiosTablaTipoBancoRetencion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoBancoRetencion=this.jButtonNuevoToolBarTipoBancoRetencion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoRetencion=this.jButtonNuevoRelacionesToolBarTipoBancoRetencion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) {
			this.isVisibilidadCeldaModificarTipoBancoRetencion=this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonModificarToolBarTipoBancoRetencion.isVisible();
			this.isVisibilidadCeldaActualizarTipoBancoRetencion=this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonActualizarToolBarTipoBancoRetencion.isVisible();
			this.isVisibilidadCeldaEliminarTipoBancoRetencion=this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonEliminarToolBarTipoBancoRetencion.isVisible();
			this.isVisibilidadCeldaCancelarTipoBancoRetencion=this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonCancelarToolBarTipoBancoRetencion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoBancoRetencion=this.jButtonGuardarCambiosToolBarTipoBancoRetencion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoBancoRetencion=this.jButtonGuardarCambiosTablaToolBarTipoBancoRetencion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoBancoRetencion=this.jMenuItemNuevoTipoBancoRetencion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoRetencion=this.jMenuItemNuevoRelacionesTipoBancoRetencion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) {
			this.isVisibilidadCeldaModificarTipoBancoRetencion=this.jInternalFrameDetalleFormTipoBancoRetencion.jMenuItemModificarTipoBancoRetencion.isVisible();
			this.isVisibilidadCeldaActualizarTipoBancoRetencion=this.jInternalFrameDetalleFormTipoBancoRetencion.jMenuItemActualizarTipoBancoRetencion.isVisible();
			this.isVisibilidadCeldaEliminarTipoBancoRetencion=this.jInternalFrameDetalleFormTipoBancoRetencion.jMenuItemEliminarTipoBancoRetencion.isVisible();
			this.isVisibilidadCeldaCancelarTipoBancoRetencion=this.jInternalFrameDetalleFormTipoBancoRetencion.jMenuItemCancelarTipoBancoRetencion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoBancoRetencion=this.jMenuItemGuardarCambiosTipoBancoRetencion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoBancoRetencion=this.jMenuItemGuardarCambiosTablaTipoBancoRetencion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoBancoRetencion(Boolean esInicializar) {
		if(TipoBancoRetencionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipobancoretencionSessionBean.getConGuardarRelaciones()) {
				//if(this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoBancoRetencion();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoBancoRetencion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoBancoRetencion() {
		this.jButtonNuevoTipoBancoRetencion.setVisible(this.isPermisoNuevoTipoBancoRetencion);			
		this.jButtonDuplicarTipoBancoRetencion.setVisible(this.isPermisoDuplicarTipoBancoRetencion);			
		this.jButtonCopiarTipoBancoRetencion.setVisible(this.isPermisoCopiarTipoBancoRetencion);			
		this.jButtonVerFormTipoBancoRetencion.setVisible(this.isPermisoVerFormTipoBancoRetencion);			
		
		this.jButtonAbrirOrderByTipoBancoRetencion.setVisible(this.isPermisoOrdenTipoBancoRetencion);					
		
		this.jButtonNuevoRelacionesTipoBancoRetencion.setVisible(this.isPermisoNuevoTipoBancoRetencion);			
		
		if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonModificarTipoBancoRetencion.setVisible(this.isPermisoActualizarTipoBancoRetencion);	
			this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonActualizarTipoBancoRetencion.setVisible(this.isPermisoActualizarTipoBancoRetencion);	
			this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonEliminarTipoBancoRetencion.setVisible(this.isPermisoEliminarTipoBancoRetencion);
			this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonCancelarTipoBancoRetencion.setVisible(this.isVisibilidadCeldaCancelarTipoBancoRetencion);						
			this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonGuardarCambiosTipoBancoRetencion.setVisible(this.isPermisoGuardarCambiosTipoBancoRetencion);							
		}
		
		this.jButtonGuardarCambiosTablaTipoBancoRetencion.setVisible(this.isPermisoActualizarTipoBancoRetencion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoBancoRetencion() {
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonModificarTipoBancoRetencion.setVisible(this.isPermisoActualizarTipoBancoRetencion);	
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonActualizarTipoBancoRetencion.setVisible(this.isPermisoActualizarTipoBancoRetencion);	
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonEliminarTipoBancoRetencion.setVisible(this.isPermisoEliminarTipoBancoRetencion);
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonCancelarTipoBancoRetencion.setVisible(this.isVisibilidadCeldaCancelarTipoBancoRetencion);							
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonGuardarCambiosTipoBancoRetencion.setVisible((this.isVisibilidadCeldaGuardarTipoBancoRetencion && this.isPermisoGuardarCambiosTipoBancoRetencion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoBancoRetencion() {
		if(TipoBancoRetencionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoBancoRetencion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoBancoRetencion() {
	}
	
	public void jTableDatosTipoBancoRetencionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoBancoRetencion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoBancoRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoBancoRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoBancoRetencion(this.gettipobancoretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoRetencion(this.tipobancoretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobancoretencion =(TipoBancoRetencion) this.tipobancoretencionLogic.getTipoBancoRetencions().toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipobancoretencion =(TipoBancoRetencion) this.tipobancoretencions.toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipobancoretencion==null) {
						this.tipobancoretencion = new TipoBancoRetencion();
					}

					this.setVariablesFormularioToObjetoActualTipoBancoRetencion(this.tipobancoretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoRetencion(this.tipobancoretencion);
				}

				if(this.tipobancoretencion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipobancoretencion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoBancoRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoBancoRetencionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoBancoRetencion(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoBancoRetencion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoBancoRetencion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoBancoRetencion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoretencion =(TipoBancoRetencion) this.tipobancoretencionLogic.getTipoBancoRetencions().toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipobancoretencion =(TipoBancoRetencion) this.tipobancoretencions.toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoBancoRetencion(this.gettipobancoretencion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoRetencion(this.tipobancoretencion);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipobancoretencionLogic.getConnexion());

				if(this.tipobancoretencion.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipobancoretencion.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoBancoRetencion=(TitledBorder)this.jScrollPanelDatosTipoBancoRetencion.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoBancoRetencion.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoBancoRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoBancoRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoBancoRetencion(this.gettipobancoretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoRetencion(this.tipobancoretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobancoretencion =(TipoBancoRetencion) this.tipobancoretencionLogic.getTipoBancoRetencions().toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipobancoretencion =(TipoBancoRetencion) this.tipobancoretencions.toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipobancoretencion==null) {
						this.tipobancoretencion = new TipoBancoRetencion();
					}

					this.setVariablesFormularioToObjetoActualTipoBancoRetencion(this.tipobancoretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoRetencion(this.tipobancoretencion);
				}

				if(this.tipobancoretencion.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipobancoretencion.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoBancoRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoBancoRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoBancoRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoBancoRetencion(this.gettipobancoretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoRetencion(this.tipobancoretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobancoretencion =(TipoBancoRetencion) this.tipobancoretencionLogic.getTipoBancoRetencions().toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipobancoretencion =(TipoBancoRetencion) this.tipobancoretencions.toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipobancoretencion==null) {
						this.tipobancoretencion = new TipoBancoRetencion();
					}

					this.setVariablesFormularioToObjetoActualTipoBancoRetencion(this.tipobancoretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoRetencion(this.tipobancoretencion);
				}

				if(this.tipobancoretencion.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipobancoretencion.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoBancoRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoBancoRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoBancoRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoBancoRetencion(this.gettipobancoretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoRetencion(this.tipobancoretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobancoretencion =(TipoBancoRetencion) this.tipobancoretencionLogic.getTipoBancoRetencions().toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipobancoretencion =(TipoBancoRetencion) this.tipobancoretencions.toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipobancoretencion==null) {
						this.tipobancoretencion = new TipoBancoRetencion();
					}

					this.setVariablesFormularioToObjetoActualTipoBancoRetencion(this.tipobancoretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoRetencion(this.tipobancoretencion);
				}

				if(this.tipobancoretencion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipobancoretencion.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoBancoRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTipoBancoRetencionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoBancoRetencion(false,false);

			this.getTipoBancoRetencionsBusquedaPorCodigo();

			this.inicializarActualizarBindingTipoBancoRetencion(false);

			//if(TipoBancoRetencionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoBancoRetencion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoBancoRetencionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoBancoRetencion(false,false);

			this.getTipoBancoRetencionsBusquedaPorNombre();

			this.inicializarActualizarBindingTipoBancoRetencion(false);

			//if(TipoBancoRetencionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoBancoRetencion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTipoBancoRetencionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoBancoRetencion(false,false);

			this.getTipoBancoRetencionsFK_IdEmpresa();

			this.inicializarActualizarBindingTipoBancoRetencion(false);

			//if(TipoBancoRetencionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoBancoRetencion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoretencionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoBancoRetencion() {
		if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) {
			this.jInternalFrameDetalleFormTipoBancoRetencion.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoBancoRetencion.dispose();
			this.jInternalFrameDetalleFormTipoBancoRetencion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoBancoRetencion!=null) {
			this.jInternalFrameReporteDinamicoTipoBancoRetencion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoBancoRetencion.dispose();
			this.jInternalFrameReporteDinamicoTipoBancoRetencion=null;
		}
		
		if(this.jInternalFrameImportacionTipoBancoRetencion!=null) {
			this.jInternalFrameImportacionTipoBancoRetencion.setVisible(false);	    			
			this.jInternalFrameImportacionTipoBancoRetencion.dispose();
			this.jInternalFrameImportacionTipoBancoRetencion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoBancoRetencion();
			
			TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoBancoRetencion")) {
				jButtonNuevoTipoBancoRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoBancoRetencion")) {
				jButtonDuplicarTipoBancoRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoBancoRetencion")) {
				jButtonCopiarTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoBancoRetencion")) {
				jButtonVerFormTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoBancoRetencion")) {
				jButtonNuevoTipoBancoRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoBancoRetencion")) {
				jButtonDuplicarTipoBancoRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoBancoRetencion")) {
				jButtonNuevoTipoBancoRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoBancoRetencion")) {
				jButtonDuplicarTipoBancoRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoBancoRetencion")) {
				jButtonNuevoTipoBancoRetencionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoBancoRetencion")) {
				jButtonNuevoTipoBancoRetencionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoBancoRetencion")) {
				jButtonNuevoTipoBancoRetencionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoBancoRetencion")) {
				jButtonModificarTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoBancoRetencion")) {
				jButtonModificarTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoBancoRetencion")) {
				jButtonModificarTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoBancoRetencion")) {
				jButtonActualizarTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoBancoRetencion")) {
				jButtonActualizarTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoBancoRetencion")) {
				jButtonActualizarTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoBancoRetencion")) {
				jButtonEliminarTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoBancoRetencion")) {
				jButtonEliminarTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoBancoRetencion")) {
				jButtonEliminarTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoBancoRetencion")) {
				jButtonCancelarTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoBancoRetencion")) {
				jButtonCancelarTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoBancoRetencion")) {
				jButtonCancelarTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoBancoRetencion")) {
				jButtonCerrarTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoBancoRetencion")) {
				jButtonCerrarTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoBancoRetencion")) {
				jButtonCerrarTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoBancoRetencion")) {
				jButtonMostrarOcultarTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoBancoRetencion")) {
				jButtonCancelarTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoBancoRetencion")) {
				jButtonGuardarCambiosTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoBancoRetencion")) {
				jButtonGuardarCambiosTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoBancoRetencion")) {
				jButtonCopiarTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoBancoRetencion")) {
				jButtonVerFormTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoBancoRetencion")) {
				jButtonGuardarCambiosTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoBancoRetencion")) {
				jButtonCopiarTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoBancoRetencion")) {
				jButtonVerFormTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoBancoRetencion")) {
				jButtonGuardarCambiosTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoBancoRetencion")) {
				jButtonGuardarCambiosTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoBancoRetencion")) {
				jButtonGuardarCambiosTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoBancoRetencion")) {
				jButtonRecargarInformacionTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoBancoRetencion")) {
				jButtonRecargarInformacionTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoBancoRetencion")) {
				jButtonRecargarInformacionTipoBancoRetencionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoBancoRetencion")) {
				jButtonAnterioresTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoBancoRetencion")) {
				jButtonAnterioresTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoBancoRetencion")) {
				jButtonAnterioresTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoBancoRetencion")) {
				jButtonSiguientesTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoBancoRetencion")) {
				jButtonSiguientesTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoBancoRetencion")) {
				jButtonSiguientesTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoBancoRetencion") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoBancoRetencion")) {
				jButtonAbrirOrderByTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoBancoRetencion") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoBancoRetencion")) {
				jButtonMostrarOcultarTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoBancoRetencion")) {
				jButtonNuevoGuardarCambiosTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoBancoRetencion")) {
				jButtonNuevoGuardarCambiosTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoBancoRetencion")) {
				jButtonNuevoGuardarCambiosTipoBancoRetencionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoBancoRetencion")) {
				jButtonCerrarReporteDinamicoTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoBancoRetencion")) {
				jButtonGenerarReporteDinamicoTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoBancoRetencion")) {
				
				jButtonGenerarExcelReporteDinamicoTipoBancoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoBancoRetencion")) {
				jButtonCerrarImportacionTipoBancoRetencionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoBancoRetencion")) {
				
				jButtonGenerarImportacionTipoBancoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoBancoRetencion")) {
				
				jButtonAbrirImportacionTipoBancoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoBancoRetencion")) {
				jComboBoxTiposAccionesTipoBancoRetencionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoBancoRetencion")) {
				jComboBoxTiposRelacionesTipoBancoRetencionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoBancoRetencion")) {
				jComboBoxTiposAccionesTipoBancoRetencionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoBancoRetencion")) {
				
				jComboBoxTiposSeleccionarTipoBancoRetencionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoBancoRetencion")) {
				jTextFieldValorCampoGeneralTipoBancoRetencionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoBancoRetencion")) {
				jButtonAbrirOrderByTipoBancoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoBancoRetencion")) {
				jButtonAbrirOrderByTipoBancoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoBancoRetencion")) {
				jButtonCerrarOrderByTipoBancoRetencionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoBancoRetencionBusqueda")) {
				this.jButtonidTipoBancoRetencionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoBancoRetencionUpdate")) {
				this.jButtonid_empresaTipoBancoRetencionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoBancoRetencionBusqueda")) {
				this.jButtonid_empresaTipoBancoRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoBancoRetencionBusqueda")) {
				this.jButtoncodigoTipoBancoRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoBancoRetencionBusqueda")) {
				this.jButtonnombreTipoBancoRetencionBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoTipoBancoRetencion")) {
				this.jButtonBusquedaPorCodigoTipoBancoRetencionActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoBancoRetencion")) {
				this.jButtonBusquedaPorNombreTipoBancoRetencionActionPerformed(evt);
			}
			
			;
			
			
			TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoBancoRetencion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBancoRetencionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancoretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancoretencion);
				
				TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
				
				


				
				TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBancoRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoBancoRetencion tipobancoretencionLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipobancoretencionLocal=this.tipobancoretencion;
			} else {
				tipobancoretencionLocal=this.tipobancoretencionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancoretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancoretencion);
				
				TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
							
				
				


				
				TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBancoRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoRetencionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoBancoRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoretencionAnterior =(TipoBancoRetencion) this.tipobancoretencionLogic.getTipoBancoRetencions().toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobancoretencionAnterior =(TipoBancoRetencion) this.tipobancoretencions.toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
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
			
			TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
			
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
			
			


			
			TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBancoRetencionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancoretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancoretencion);
				
				TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
								
						
				


				
				TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBancoRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoRetencion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancoretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancoretencion);
				
				TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
								
				
				


				
				TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBancoRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoRetencionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoBancoRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoretencionAnterior =(TipoBancoRetencion) this.tipobancoretencionLogic.getTipoBancoRetencions().toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobancoretencionAnterior =(TipoBancoRetencion) this.tipobancoretencions.toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancoretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancoretencion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoRetencionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoBancoRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoretencionAnterior =(TipoBancoRetencion) this.tipobancoretencionLogic.getTipoBancoRetencions().toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobancoretencionAnterior =(TipoBancoRetencion) this.tipobancoretencions.toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoRetencionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancoretencion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipobancoretencion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancoretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancoretencion);
				
				TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
							
				
				


				
				TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBancoRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoRetencion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBancoRetencionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoBancoRetencion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobancoretencionAnterior =(TipoBancoRetencion) this.tipobancoretencionLogic.getTipoBancoRetencions().toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipobancoretencionAnterior =(TipoBancoRetencion) this.tipobancoretencions.toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
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
			
			TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
			
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
			
			


			
			TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoRetencionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancoretencion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipobancoretencion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancoretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancoretencion);
				
				TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
								
				
				


				
				TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBancoRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoRetencionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoBancoRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoretencionAnterior =(TipoBancoRetencion) this.tipobancoretencionLogic.getTipoBancoRetencions().toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobancoretencionAnterior =(TipoBancoRetencion) this.tipobancoretencions.toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoRetencionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancoretencion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipobancoretencion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBancoRetencionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancoretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancoretencion);
				
				TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoBancoRetencion")) {
					jCheckBoxSeleccionarTodosTipoBancoRetencionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoBancoRetencion")) {
					jCheckBoxSeleccionadosTipoBancoRetencionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoBancoRetencion")) {
					
				}
				
				


				
				
				TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBancoRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancoretencion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipobancoretencion);
				
				TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
												
				
				


				
				
				TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBancoRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBancoRetencionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoBancoRetencion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobancoretencionAnterior =(TipoBancoRetencion) this.tipobancoretencionLogic.getTipoBancoRetencions().toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipobancoretencionAnterior =(TipoBancoRetencion) this.tipobancoretencions.toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBancoRetencionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancoretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancoretencion);
				
				TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
				
				
				TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
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
			
			TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
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
			
			


			
			TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBancoRetencionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancoretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancoretencion);
				
				TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBancoRetencion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoRetencion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancoretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancoretencion);
				
				TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
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
				
				


				
				TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBancoRetencion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoRetencionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoBancoRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoretencionAnterior =(TipoBancoRetencion) this.tipobancoretencionLogic.getTipoBancoRetencions().toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobancoretencionAnterior =(TipoBancoRetencion) this.tipobancoretencions.toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoBancoRetencion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoBancoRetencionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoBancoRetencion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipobancoretencion =(TipoBancoRetencion) this.tipobancoretencionLogic.getTipoBancoRetencions().toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipobancoretencion =(TipoBancoRetencion) this.tipobancoretencions.toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipobancoretencion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoBancoRetencion")) {
				
				}
				
				TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoBancoRetencion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoBancoRetencion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoBancoRetencion")) {
			
			}
			
			TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoBancoRetencion();
			
			TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
			
			if(sTipo.equals("NuevoTipoBancoRetencion")) {
				jButtonNuevoTipoBancoRetencionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoBancoRetencion")) {
				jButtonDuplicarTipoBancoRetencionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoBancoRetencion")) {
				jButtonCopiarTipoBancoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoBancoRetencion")) {
				jButtonVerFormTipoBancoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoBancoRetencion")) {
				jButtonNuevoTipoBancoRetencionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoBancoRetencion")) {
				jButtonModificarTipoBancoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoBancoRetencion")) {
				jButtonActualizarTipoBancoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoBancoRetencion")) {
				jButtonEliminarTipoBancoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoBancoRetencion")) {
				jButtonGuardarCambiosTipoBancoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoBancoRetencion")) {
				jButtonCancelarTipoBancoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoBancoRetencion")) {
				jButtonCerrarTipoBancoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoBancoRetencion")) {
				jButtonGuardarCambiosTipoBancoRetencionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoBancoRetencion")) {
				jButtonNuevoGuardarCambiosTipoBancoRetencionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoBancoRetencion")) {
				jButtonAbrirOrderByTipoBancoRetencionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoBancoRetencion")) {
				jButtonRecargarInformacionTipoBancoRetencionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoBancoRetencion")) {
				jButtonAnterioresTipoBancoRetencionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoBancoRetencion")) {
				jButtonSiguientesTipoBancoRetencionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoBancoRetencionBusqueda")) {
				this.jButtonidTipoBancoRetencionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoBancoRetencionUpdate")) {
				this.jButtonid_empresaTipoBancoRetencionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoBancoRetencionBusqueda")) {
				this.jButtonid_empresaTipoBancoRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoBancoRetencionBusqueda")) {
				this.jButtoncodigoTipoBancoRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoBancoRetencionBusqueda")) {
				this.jButtonnombreTipoBancoRetencionBusquedaActionPerformed(evt);
			}
			
			TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoBancoRetencion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoBancoRetencion")) {
				closingInternalFrameTipoBancoRetencion();
				
			} else if(sTipo.equals("jButtonCancelarTipoBancoRetencion")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoBancoRetencion = (JInternalFrameBase)evt.getSource();
	            	
	            TipoBancoRetencionBeanSwingJInternalFrame jInternalFrameParent=(TipoBancoRetencionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoBancoRetencion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoBancoRetencionActionPerformed(null);
			}
			
			TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipobancoretencion,new Object(),this.tipobancoretencionParameterGeneral,this.tipobancoretencionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoBancoRetencion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoBancoRetencion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoBancoRetencion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipobancoretencion)) {
			if(!esControlTabla) {
				if(TipoBancoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoBancoRetencion(this.tipobancoretencion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoRetencion(this.tipobancoretencion);			
				}
				
				if(this.tipobancoretencionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoBancoRetencion(this.tipobancoretencion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipobancoretencionReturnGeneral=tipobancoretencionLogic.procesarEventosTipoBancoRetencionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipobancoretencionLogic.getTipoBancoRetencions(),this.tipobancoretencion,this.tipobancoretencionParameterGeneral,this.isEsNuevoTipoBancoRetencion,classes);//this.tipobancoretencionLogic.getTipoBancoRetencion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoBancoRetencion(this.tipobancoretencionReturnGeneral,this.tipobancoretencionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipobancoretencionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoBancoRetencion(classes,this.tipobancoretencionReturnGeneral,this.tipobancoretencionBean,false);
					}
						
					if(this.tipobancoretencionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoBancoRetencion(this.tipobancoretencionReturnGeneral.getTipoBancoRetencion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoBancoRetencion(this.tipobancoretencionReturnGeneral.getTipoBancoRetencion());	
					}
						
					if(this.tipobancoretencionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoBancoRetencion(this.tipobancoretencionReturnGeneral.getTipoBancoRetencion(),classes);//this.tipobancoretencionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoBancoRetencion(this.tipobancoretencion,classes);//this.tipobancoretencionBean);									
				}
			
				if(TipoBancoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoBancoRetencion(this.tipobancoretencion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoRetencion(this.tipobancoretencion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipobancoretencionAnterior!=null) {
						this.tipobancoretencion=this.tipobancoretencionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipobancoretencionReturnGeneral=tipobancoretencionLogic.procesarEventosTipoBancoRetencionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipobancoretencionLogic.getTipoBancoRetencions(),this.tipobancoretencion,this.tipobancoretencionParameterGeneral,this.isEsNuevoTipoBancoRetencion,classes);//this.tipobancoretencionLogic.getTipoBancoRetencion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipobancoretencionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipobancoretencionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipobancoretencionReturnGeneral.getTipoBancoRetencion(),tipobancoretencionLogic.getTipoBancoRetencions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipobancoretencionReturnGeneral.getTipoBancoRetencion(),this.tipobancoretencions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoBancoRetencion.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoBancoRetencion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoBancoRetencion();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoBancoRetencion() throws Exception {
		
		TipoBancoRetencionModel tipobancoretencionModel=(TipoBancoRetencionModel)this.jTableDatosTipoBancoRetencion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipobancoretencionModel.tipobancoretencions=this.tipobancoretencionLogic.getTipoBancoRetencions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipobancoretencionModel.tipobancoretencions=this.tipobancoretencions;
		}
		
		
		((TipoBancoRetencionModel) this.jTableDatosTipoBancoRetencion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoBancoRetencion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipobancoretencionAnterior(),this.tipobancoretencionLogic.getTipoBancoRetencions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipobancoretencionAnterior(),this.tipobancoretencions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoBancoRetencion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoBancoRetencion(TipoBancoRetencion tipobancoretencion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
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
										
				TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipobancoretencion,new Object(),generalEntityParameterGeneral,this.tipobancoretencionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipobancoretencionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoBancoRetencionConstantesFunciones.getClassesRelationshipsOfTipoBancoRetencion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoBancoRetencionConstantesFunciones.getClassesRelationshipsFromStringsOfTipoBancoRetencion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoBancoRetencion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoBancoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipobancoretencion,new Object(),generalEntityParameterGeneral,this.tipobancoretencionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoBancoRetencion(TipoBancoRetencionBean tipobancoretencionBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoBancoRetencion(ArrayList<Classe> classes,TipoBancoRetencionReturnGeneral tipobancoretencionReturnGeneral,TipoBancoRetencionBean tipobancoretencionBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoBancoRetencion(TipoBancoRetencion tipobancoretencion,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipobancoretencion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoBancoRetencion = new TipoBancoRetencionDetalleFormJInternalFrame(jDesktopPane,this.tipobancoretencionSessionBean.getConGuardarRelaciones(),this.tipobancoretencionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoBancoRetencion);
		this.jInternalFrameDetalleFormTipoBancoRetencion.setVisible(false);
		this.jInternalFrameDetalleFormTipoBancoRetencion.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoBancoRetencion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoBancoRetencion.tipobancoretencionLogic=this.tipobancoretencionLogic;
		
		this.cargarCombosFrameForeignKeyTipoBancoRetencion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoBancoRetencion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoBancoRetencion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoBancoRetencion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoBancoRetencion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoBancoRetencion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoBancoRetencion"));
		
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonModificarTipoBancoRetencion.addActionListener(new ButtonActionListener(this,"ModificarTipoBancoRetencion"));

		
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonModificarToolBarTipoBancoRetencion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoBancoRetencion"));
					
		this.jInternalFrameDetalleFormTipoBancoRetencion.jMenuItemModificarTipoBancoRetencion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoBancoRetencion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonActualizarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"ActualizarTipoBancoRetencion"));
		
		
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonActualizarToolBarTipoBancoRetencion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoBancoRetencion"));
						
		this.jInternalFrameDetalleFormTipoBancoRetencion.jMenuItemActualizarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoBancoRetencion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonEliminarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"EliminarTipoBancoRetencion"));
		
		
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonEliminarToolBarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoBancoRetencion"));
								
		this.jInternalFrameDetalleFormTipoBancoRetencion.jMenuItemEliminarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoBancoRetencion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonCancelarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"CancelarTipoBancoRetencion"));
		
		
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonCancelarToolBarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoBancoRetencion"));
					
		this.jInternalFrameDetalleFormTipoBancoRetencion.jMenuItemCancelarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoBancoRetencion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoBancoRetencion.jMenuItemDetalleCerrarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoBancoRetencion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonGuardarCambiosToolBarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoBancoRetencion"));
		
		
		
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonGuardarCambiosToolBarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoBancoRetencion"));
		
		
		
		this.jInternalFrameDetalleFormTipoBancoRetencion.jComboBoxTiposAccionesFormularioTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoBancoRetencion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonidTipoBancoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoBancoRetencionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonid_empresaTipoBancoRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoBancoRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonid_empresaTipoBancoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoBancoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtoncodigoTipoBancoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoBancoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonnombreTipoBancoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoBancoRetencionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoBancoRetencion.jTabbedPaneRelacionesTipoBancoRetencion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoBancoRetencion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoBancoRetencion"));
		
		if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoRetencion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoBancoRetencion"));
		}
		
		this.jTableDatosTipoBancoRetencion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoBancoRetencion"));
		
		this.jTableDatosTipoBancoRetencion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoBancoRetencion"));
		
		this.jButtonNuevoTipoBancoRetencion.addActionListener(new ButtonActionListener(this,"NuevoTipoBancoRetencion"));
		
		this.jButtonDuplicarTipoBancoRetencion.addActionListener(new ButtonActionListener(this,"DuplicarTipoBancoRetencion"));
		
		this.jButtonCopiarTipoBancoRetencion.addActionListener(new ButtonActionListener(this,"CopiarTipoBancoRetencion"));
		
		this.jButtonVerFormTipoBancoRetencion.addActionListener(new ButtonActionListener(this,"VerFormTipoBancoRetencion"));
		
		
		this.jButtonNuevoToolBarTipoBancoRetencion.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoBancoRetencion"));
			
		this.jButtonDuplicarToolBarTipoBancoRetencion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoBancoRetencion"));
			
		this.jMenuItemNuevoTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoBancoRetencion"));
			
		this.jMenuItemDuplicarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoBancoRetencion"));		
		
		
		this.jButtonNuevoRelacionesTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoBancoRetencion"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoBancoRetencion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoBancoRetencion"));
			
		this.jMenuItemNuevoRelacionesTipoBancoRetencion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoBancoRetencion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonModificarTipoBancoRetencion.addActionListener(new ButtonActionListener(this,"ModificarTipoBancoRetencion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonModificarToolBarTipoBancoRetencion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoBancoRetencion"));
			
			this.jInternalFrameDetalleFormTipoBancoRetencion.jMenuItemModificarTipoBancoRetencion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoBancoRetencion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonActualizarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"ActualizarTipoBancoRetencion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonActualizarToolBarTipoBancoRetencion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoBancoRetencion"));
				
			this.jInternalFrameDetalleFormTipoBancoRetencion.jMenuItemActualizarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoBancoRetencion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonEliminarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"EliminarTipoBancoRetencion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonEliminarToolBarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoBancoRetencion"));
						
			this.jInternalFrameDetalleFormTipoBancoRetencion.jMenuItemEliminarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoBancoRetencion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonCancelarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"CancelarTipoBancoRetencion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonCancelarToolBarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoBancoRetencion"));
			
			this.jInternalFrameDetalleFormTipoBancoRetencion.jMenuItemCancelarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoBancoRetencion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoBancoRetencion"));		
		
		
		this.jButtonCerrarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"CerrarTipoBancoRetencion"));
		
		
		this.jButtonCerrarToolBarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoBancoRetencion"));
			
		this.jMenuItemCerrarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoBancoRetencion"));
			
		if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoRetencion.jMenuItemDetalleCerrarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoBancoRetencion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonGuardarCambiosTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoBancoRetencion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonGuardarCambiosToolBarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoBancoRetencion"));
		}
		
		this.jButtonCopiarToolBarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoBancoRetencion"));
			
		this.jButtonVerFormToolBarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoBancoRetencion"));
		
		this.jMenuItemGuardarCambiosTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoBancoRetencion"));
			
		this.jMenuItemCopiarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoBancoRetencion"));		
		
		this.jMenuItemVerFormTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoBancoRetencion"));		
		
		
		this.jButtonGuardarCambiosTablaTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoBancoRetencion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoBancoRetencion"));
			
		this.jMenuItemGuardarCambiosTablaTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoBancoRetencion"));		
		
		
		
		this.jButtonRecargarInformacionTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoBancoRetencion"));
					
		this.jButtonRecargarInformacionToolBarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoBancoRetencion"));
		
		this.jMenuItemRecargarInformacionTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoBancoRetencion"));		
		
		
		
		this.jButtonAnterioresTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"AnterioresTipoBancoRetencion"));
		
		
		this.jButtonAnterioresToolBarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoBancoRetencion"));
		
		this.jMenuItemAnterioresTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoBancoRetencion"));		
		
		
		this.jButtonSiguientesTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"SiguientesTipoBancoRetencion"));
		
		
		this.jButtonSiguientesToolBarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoBancoRetencion"));
			
		this.jMenuItemSiguientesTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoBancoRetencion"));
			
		this.jMenuItemAbrirOrderByTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoBancoRetencion"));
			
		this.jMenuItemMostrarOcultarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoBancoRetencion"));
			
		this.jMenuItemDetalleAbrirOrderByTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoBancoRetencion"));
			
		this.jMenuItemDetalleMostarOcultarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoBancoRetencion"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoBancoRetencion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoBancoRetencion"));
			
		this.jMenuItemNuevoGuardarCambiosTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoBancoRetencion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoBancoRetencion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoBancoRetencion"));

		this.jCheckBoxSeleccionadosTipoBancoRetencion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoBancoRetencion"));
		
		if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoRetencion.jComboBoxTiposAccionesFormularioTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoBancoRetencion"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoBancoRetencion"));
			
		this.jComboBoxTiposAccionesTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoBancoRetencion"));
					
		this.jComboBoxTiposSeleccionarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoBancoRetencion"));
			
		this.jTextFieldValorCampoGeneralTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoBancoRetencion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonidTipoBancoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoBancoRetencionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonid_empresaTipoBancoRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoBancoRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonid_empresaTipoBancoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoBancoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtoncodigoTipoBancoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoBancoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonnombreTipoBancoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoBancoRetencionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTipoBancoRetencion.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoBancoRetencion"));

			this.jButtonBusquedaPorNombreTipoBancoRetencion.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoBancoRetencion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoBancoRetencion!=null) {
				this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoBancoRetencion"));
				this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoBancoRetencion"));
				this.jInternalFrameReporteDinamicoTipoBancoRetencion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoBancoRetencion"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoBancoRetencion"));				
			//this.jButtonGenerarReporteDinamicoTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoBancoRetencion"));
			//this.jButtonGenerarExcelReporteDinamicoTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoBancoRetencion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoBancoRetencion!=null) {
				this.jInternalFrameImportacionTipoBancoRetencion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoBancoRetencion"));
				this.jInternalFrameImportacionTipoBancoRetencion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoBancoRetencion"));
				this.jInternalFrameImportacionTipoBancoRetencion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoBancoRetencion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoBancoRetencion"));
			
			this.jButtonAbrirOrderByToolBarTipoBancoRetencion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoBancoRetencion"));			
			
			if(this.jInternalFrameOrderByTipoBancoRetencion!=null) {
				this.jInternalFrameOrderByTipoBancoRetencion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoBancoRetencion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoRetencion.jTabbedPaneRelacionesTipoBancoRetencion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoBancoRetencion"));
		
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
            		closingInternalFrameTipoBancoRetencion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoBancoRetencion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoBancoRetencion = (JInternalFrameBase)event.getSource();
	            	
	            TipoBancoRetencionBeanSwingJInternalFrame jInternalFrameParent=(TipoBancoRetencionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoBancoRetencion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoBancoRetencionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoBancoRetencion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoBancoRetencionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoBancoRetencion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoBancoRetencion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoBancoRetencionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoBancoRetencionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoBancoRetencionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoBancoRetencion";
		inputMap = this.jButtonNuevoTipoBancoRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoBancoRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoBancoRetencionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoBancoRetencionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoBancoRetencionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoBancoRetencionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoBancoRetencion";
		inputMap = this.jButtonNuevoRelacionesTipoBancoRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoBancoRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoBancoRetencionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoBancoRetencion";
		inputMap = this.jButtonModificarTipoBancoRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoBancoRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoBancoRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoBancoRetencion";
		inputMap = this.jButtonActualizarTipoBancoRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoBancoRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoBancoRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoBancoRetencion";
		inputMap = this.jButtonEliminarTipoBancoRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoBancoRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoBancoRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoBancoRetencion";
		inputMap = this.jButtonCancelarTipoBancoRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoBancoRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoBancoRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoBancoRetencion";
		inputMap = this.jButtonCerrarTipoBancoRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoBancoRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoBancoRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonGuardarCambiosTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoBancoRetencion";
		inputMap = this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonGuardarCambiosTipoBancoRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonGuardarCambiosTipoBancoRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoBancoRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoBancoRetencion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoBancoRetencionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoBancoRetencion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoBancoRetencionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoBancoRetencion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoBancoRetencionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoBancoRetencion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoBancoRetencionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonidTipoBancoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoBancoRetencionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonid_empresaTipoBancoRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoBancoRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonid_empresaTipoBancoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoBancoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtoncodigoTipoBancoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoBancoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoRetencion.jButtonnombreTipoBancoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoBancoRetencionBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTipoBancoRetencion.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoBancoRetencion"));

		this.jButtonBusquedaPorNombreTipoBancoRetencion.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoBancoRetencion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoBancoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoBancoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoBancoRetencionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoBancoRetencion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoBancoRetencion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoBancoRetencion tipobancoretencionAux:this.tipobancoretencionLogic.getTipoBancoRetencions()) {
					tipobancoretencionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoBancoRetencion tipobancoretencionAux:tipobancoretencions) {
					tipobancoretencionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoBancoRetencionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoBancoRetencion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoBancoRetencion tipobancoretencionAux:this.tipobancoretencionLogic.getTipoBancoRetencions()) {
						tipobancoretencionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoBancoRetencion tipobancoretencionAux:tipobancoretencions) {
						tipobancoretencionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoBancoRetencion tipobancoretencionAux:this.tipobancoretencionLogic.getTipoBancoRetencions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoBancoRetencion tipobancoretencionAux:tipobancoretencions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoBancoRetencion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoBancoRetencion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoBancoRetencion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoBancoRetencion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoBancoRetencionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoBancoRetencion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoBancoRetencion.getSelectedRows();
			
			TipoBancoRetencion tipobancoretencionLocal=new TipoBancoRetencion();
			
			//this.seleccionarTodosTipoBancoRetencion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipobancoretencionLocal =(TipoBancoRetencion) this.tipobancoretencionLogic.getTipoBancoRetencions().toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipobancoretencionLocal =(TipoBancoRetencion) this.tipobancoretencions.toArray()[this.jTableDatosTipoBancoRetencion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipobancoretencionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoBancoRetencion tipobancoretencionAux:this.tipobancoretencionLogic.getTipoBancoRetencions()) {
						tipobancoretencionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoBancoRetencion tipobancoretencionAux:tipobancoretencions) {
						tipobancoretencionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoBancoRetencion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoBancoRetencion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoBancoRetencion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoBancoRetencion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoBancoRetencionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoBancoRetencionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoBancoRetencionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoBancoRetencion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoBancoRetencion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoBancoRetencion tipobancoretencionAux:this.tipobancoretencionLogic.getTipoBancoRetencions()) {
				
						if(sTipoSeleccionar.equals(TipoBancoRetencionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipobancoretencionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoBancoRetencionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipobancoretencionAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoBancoRetencion tipobancoretencionAux:tipobancoretencions) {
					
						if(sTipoSeleccionar.equals(TipoBancoRetencionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipobancoretencionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoBancoRetencionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipobancoretencionAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoBancoRetencion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoBancoRetencionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoBancoRetencion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoBancoRetencion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoBancoRetencion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoBancoRetencion.jComboBoxTiposAccionesFormularioTipoBancoRetencion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoBancoRetencion) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoBancoRetencion(conSplash);
				
					this.generarReporteTipoBancoRetencionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoBancoRetencion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoBancoRetencion.jComboBoxTiposAccionesFormularioTipoBancoRetencion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoBancoRetencionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoBancoRetencion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoBancoRetencionsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoBancoRetencion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoBancoRetencionsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoBancoRetencion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoBancoRetencion();
				
				this.exportarTipoBancoRetencionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoBancoRetencion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoBancoRetencion.jComboBoxTiposAccionesFormularioTipoBancoRetencion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoBancoRetencions();
				//this.importarTipoBancoRetencions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoBancoRetencion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoBancoRetencion.jComboBoxTiposAccionesFormularioTipoBancoRetencion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoBancoRetencion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoBancoRetencionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoBancoRetencion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Banco Retencion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoBancoRetencion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoBancoRetencion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoBancoRetencion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Banco Retencion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoBancoRetencion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoBancoRetencion.jComboBoxTiposAccionesFormularioTipoBancoRetencion.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoBancoRetencionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoBancoRetencion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoBancoRetencion(conSplash);
					
						//this.actualizarParametrosGeneralTipoBancoRetencion();
						
						this.generarReporteProcesoAccionTipoBancoRetencionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoBancoRetencion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoBancoRetencion.jComboBoxTiposAccionesFormularioTipoBancoRetencion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoBancoRetencionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Banco RetencionES SELECCIONADOS?", "MANTENIMIENTO DE Tipo Banco Retencion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoBancoRetencion();
				
						this.actualizarParametrosGeneralTipoBancoRetencion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipobancoretencionReturnGeneral=tipobancoretencionLogic.procesarAccionTipoBancoRetencionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipobancoretencionLogic.getTipoBancoRetencions(),this.tipobancoretencionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoBancoRetencionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoBancoRetencion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoBancoRetencion.jComboBoxTiposAccionesFormularioTipoBancoRetencion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoBancoRetencion();
					
					TipoBancoRetencionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoBancoRetencionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoBancoRetencion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoBancoRetencion.jComboBoxTiposAccionesFormularioTipoBancoRetencion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoBancoRetencion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoBancoRetencionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoBancoRetencion();
			
			if(this.jInternalFrameDetalleFormTipoBancoRetencion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoBancoRetencion> tipobancoretencionsSeleccionados=new ArrayList<TipoBancoRetencion>();		
			TipoBancoRetencion tipobancoretencion=new TipoBancoRetencion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoBancoRetencion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoBancoRetencion.getSelectedItem();
			
			
			
			
			tipobancoretencionsSeleccionados=this.getTipoBancoRetencionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipobancoretencionsSeleccionados.size()==1) {
				for(TipoBancoRetencion tipobancoretencionAux:tipobancoretencionsSeleccionados) {
					tipobancoretencion=tipobancoretencionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoBancoRetencion();
			
      		//this.finishProcessTipoBancoRetencion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoBancoRetencionReturnGeneral() throws Exception {
		if(this.tipobancoretencionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipobancoretencionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipobancoretencionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipobancoretencionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipobancoretencionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipobancoretencionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoBancoRetencion(false);
		}
		
		if(this.tipobancoretencionReturnGeneral.getConRetornoLista() || this.tipobancoretencionReturnGeneral.getConRetornoObjeto()) {
			if(this.tipobancoretencionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipobancoretencionLogic.setTipoBancoRetencions(this.tipobancoretencionReturnGeneral.getTipoBancoRetencions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipobancoretencionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipobancoretencionLogic.setTipoBancoRetencion(this.tipobancoretencionReturnGeneral.getTipoBancoRetencion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoBancoRetencion(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoBancoRetencion() throws Exception {
		
		
	}
	
	public ArrayList<TipoBancoRetencion> getTipoBancoRetencionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoBancoRetencion> tipobancoretencionsSeleccionados=new ArrayList<TipoBancoRetencion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoBancoRetencion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoBancoRetencion tipobancoretencionAux:tipobancoretencionLogic.getTipoBancoRetencions()) {
					if(tipobancoretencionAux.getIsSelected()) {
						tipobancoretencionsSeleccionados.add(tipobancoretencionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoBancoRetencion tipobancoretencionAux:this.tipobancoretencions) {
					if(tipobancoretencionAux.getIsSelected()) {
						tipobancoretencionsSeleccionados.add(tipobancoretencionAux);				
					}
				}
			}
			
			if(tipobancoretencionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipobancoretencionsSeleccionados.addAll(this.tipobancoretencionLogic.getTipoBancoRetencions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipobancoretencionsSeleccionados.addAll(this.tipobancoretencions);				
					}
				}
			}
		} else {
			tipobancoretencionsSeleccionados.add(this.tipobancoretencion);
		}
		
		return tipobancoretencionsSeleccionados;
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
	
	public void generarReporteTipoBancoRetencionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoBancoRetencionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoBancoRetencionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoBancoRetencionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoBancoRetencionsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Banco Retencion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoBancoRetencionsSeleccionados() throws Exception {
		ArrayList<TipoBancoRetencion> tipobancoretencionsSeleccionados=new ArrayList<TipoBancoRetencion>();		
		
		tipobancoretencionsSeleccionados=this.getTipoBancoRetencionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoBancoRetencions("Todos",tipobancoretencionsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoBancoRetencionsSeleccionados() throws Exception {
		ArrayList<TipoBancoRetencion> tipobancoretencionsSeleccionados=new ArrayList<TipoBancoRetencion>();		
		
		tipobancoretencionsSeleccionados=this.getTipoBancoRetencionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoBancoRetencions("Todos",tipobancoretencionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoBancoRetencionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoBancoRetencion> tipobancoretencionsSeleccionados=new ArrayList<TipoBancoRetencion>();
		
		tipobancoretencionsSeleccionados=this.getTipoBancoRetencionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoBancoRetencions("Todos",tipobancoretencionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoBancoRetencionsSeleccionados() throws Exception {
		ArrayList<TipoBancoRetencion> tipobancoretencionsSeleccionados=new ArrayList<TipoBancoRetencion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoBancoRetencion();
		
		
		tipobancoretencionsSeleccionados=this.getTipoBancoRetencionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoBancoRetencion();
		
		
		//this.generarReporteTipoBancoRetencions("Todos",tipobancoretencionsSeleccionados ,tipobancoretencionImplementable,tipobancoretencionImplementableHome);
	}
	
	public void mostrarImportacionTipoBancoRetencions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoBancoRetencion();
		
		this.abrirFrameImportacionTipoBancoRetencion();		
		
			
		//this.generarReporteTipoBancoRetencions("Todos",tipobancoretencionsSeleccionados ,tipobancoretencionImplementable,tipobancoretencionImplementableHome);
	}
	
	public void importarTipoBancoRetencions() throws Exception {		
	
	}
	
	public void exportarTipoBancoRetencionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoBancoRetencionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoBancoRetencionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoBancoRetencionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Banco Retencion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoBancoRetencionsSeleccionados() throws Exception {
		ArrayList<TipoBancoRetencion> tipobancoretencionsSeleccionados=new ArrayList<TipoBancoRetencion>();		
		
		tipobancoretencionsSeleccionados=this.getTipoBancoRetencionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobancoretencion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoBancoRetencion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoBancoRetencion tipobancoretencionAux:tipobancoretencionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoBancoRetencion(tipobancoretencionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipobancoretencionAux.setsDetalleGeneralEntityReporte(tipobancoretencionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco Retencion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoBancoRetencion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoBancoRetencionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoBancoRetencionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoBancoRetencionConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoBancoRetencionConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoBancoRetencionConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoBancoRetencion(TipoBancoRetencion tipobancoretencion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipobancoretencion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipobancoretencion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipobancoretencion.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipobancoretencion.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipobancoretencion.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoBancoRetencionsSeleccionados() throws Exception {
		ArrayList<TipoBancoRetencion> tipobancoretencionsSeleccionados=new ArrayList<TipoBancoRetencion>();		
		
		tipobancoretencionsSeleccionados=this.getTipoBancoRetencionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobancoretencion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoBancoRetencions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoBancoRetencion(row);				
				iRow++;
			}				
			
			for(TipoBancoRetencion tipobancoretencionAux:tipobancoretencionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoBancoRetencion(tipobancoretencionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco Retencion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoBancoRetencionsSeleccionados() throws Exception {
		ArrayList<TipoBancoRetencion> tipobancoretencionsSeleccionados=new ArrayList<TipoBancoRetencion>();		
		
		tipobancoretencionsSeleccionados=this.getTipoBancoRetencionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobancoretencion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipobancoretencions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipobancoretencion");
			//elementRoot.appendChild(element);
		
			for(TipoBancoRetencion tipobancoretencionAux:tipobancoretencionsSeleccionados) {
				element = document.createElement("tipobancoretencion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoBancoRetencion(tipobancoretencionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco Retencion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoBancoRetencion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoBancoRetencionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoBancoRetencionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoBancoRetencionConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoBancoRetencionConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoBancoRetencionConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoBancoRetencion(TipoBancoRetencion tipobancoretencion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipobancoretencion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipobancoretencion.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipobancoretencion.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipobancoretencion.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoBancoRetencion(TipoBancoRetencion tipobancoretencion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoBancoRetencionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipobancoretencion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoBancoRetencionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipobancoretencion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoBancoRetencionConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipobancoretencion.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoBancoRetencionConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipobancoretencion.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoBancoRetencionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipobancoretencion.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoBancoRetencionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoBancoRetencion> tipobancoretencionsSeleccionados=new ArrayList<TipoBancoRetencion>();
		
		tipobancoretencionsSeleccionados=this.getTipoBancoRetencionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoBancoRetencion(tipobancoretencionsSeleccionados);
		
		this.generarReporteTipoBancoRetencions("Todos",tipobancoretencionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoBancoRetencion(ArrayList<TipoBancoRetencion> tipobancoretencionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoBancoRetencion tipobancoretencionAux:tipobancoretencionsSeleccionados) {
				tipobancoretencionAux.setsDetalleGeneralEntityReporte(tipobancoretencionAux.toString());
			
				if(sTipoSeleccionar.equals(TipoBancoRetencionConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipobancoretencionAux.setsDescripcionGeneralEntityReporte1(tipobancoretencionAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoBancoRetencionConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipobancoretencionAux.setsDescripcionGeneralEntityReporte1(tipobancoretencionAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoBancoRetencionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipobancoretencionAux.setsDescripcionGeneralEntityReporte1(tipobancoretencionAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoBancoRetencion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoBancoRetencion=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoBancoRetencion=true;
				this.isVisibilidadCeldaGuardarCambiosTipoBancoRetencion=true;
			}
			
			this.isVisibilidadCeldaModificarTipoBancoRetencion=false;
			this.isVisibilidadCeldaActualizarTipoBancoRetencion=false;
			this.isVisibilidadCeldaEliminarTipoBancoRetencion=false;
			this.isVisibilidadCeldaCancelarTipoBancoRetencion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBancoRetencion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoBancoRetencion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoBancoRetencion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBancoRetencion=false;
			this.isVisibilidadCeldaModificarTipoBancoRetencion=false;
			this.isVisibilidadCeldaActualizarTipoBancoRetencion=true;
			this.isVisibilidadCeldaEliminarTipoBancoRetencion=false;
			this.isVisibilidadCeldaCancelarTipoBancoRetencion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBancoRetencion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoBancoRetencion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoBancoRetencion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBancoRetencion=false;
			this.isVisibilidadCeldaModificarTipoBancoRetencion=false;
			this.isVisibilidadCeldaActualizarTipoBancoRetencion=true;
			this.isVisibilidadCeldaEliminarTipoBancoRetencion=true;
			this.isVisibilidadCeldaCancelarTipoBancoRetencion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBancoRetencion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoBancoRetencion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoBancoRetencion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBancoRetencion=false;
			this.isVisibilidadCeldaModificarTipoBancoRetencion=false;
			this.isVisibilidadCeldaActualizarTipoBancoRetencion=true;
			this.isVisibilidadCeldaEliminarTipoBancoRetencion=false;
			this.isVisibilidadCeldaCancelarTipoBancoRetencion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBancoRetencion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoBancoRetencion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoBancoRetencion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoRetencion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoBancoRetencion=true;
			this.isVisibilidadCeldaModificarTipoBancoRetencion=false;
			this.isVisibilidadCeldaActualizarTipoBancoRetencion=false;
			this.isVisibilidadCeldaEliminarTipoBancoRetencion=false;
			this.isVisibilidadCeldaCancelarTipoBancoRetencion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBancoRetencion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoBancoRetencion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoBancoRetencion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBancoRetencion=false;
			this.isVisibilidadCeldaActualizarTipoBancoRetencion=false;
			this.isVisibilidadCeldaEliminarTipoBancoRetencion=false;
			this.isVisibilidadCeldaCancelarTipoBancoRetencion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBancoRetencion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoBancoRetencion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoBancoRetencion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBancoRetencion=false;
			this.isVisibilidadCeldaModificarTipoBancoRetencion=true;
			this.isVisibilidadCeldaActualizarTipoBancoRetencion=false;
			this.isVisibilidadCeldaEliminarTipoBancoRetencion=false;
			this.isVisibilidadCeldaCancelarTipoBancoRetencion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBancoRetencion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoBancoRetencion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoBancoRetencionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoBancoRetencion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoRetencion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoBancoRetencion=true;
		} else {
			this.actualizarEstadoPanelsTipoBancoRetencion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoBancoRetencion=false;
			//this.isVisibilidadCeldaVerFormTipoBancoRetencion=false;
			this.isVisibilidadCeldaDuplicarTipoBancoRetencion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipobancoretencionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoRetencion=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoBancoRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBancoRetencion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipobancoretencionSessionBean.getEsGuardarRelacionado()) {
			if(!tipobancoretencionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoBancoRetencion=false;												
			}
			
			this.jButtonCerrarTipoBancoRetencion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoRetencion=false;
		}
		
		if(!this.permiteMantenimiento(this.tipobancoretencion)) {
			this.isVisibilidadCeldaActualizarTipoBancoRetencion=false;
			this.isVisibilidadCeldaEliminarTipoBancoRetencion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoBancoRetencion() {
	}
	
	public void actualizarEstadoPanelsTipoBancoRetencion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoBancoRetencion!=null) {
				this.jScrollPanelDatosEdicionTipoBancoRetencion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBancoRetencion!=null) {
				this.jTabbedPaneBusquedasTipoBancoRetencion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoBancoRetencion!=null) {
				this.jScrollPanelDatosTipoBancoRetencion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoBancoRetencion!=null) {
				this.jPanelPaginacionTipoBancoRetencion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoBancoRetencion!=null) {
				this.jPanelParametrosReportesTipoBancoRetencion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoBancoRetencion!=null) {
				this.jScrollPanelDatosEdicionTipoBancoRetencion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBancoRetencion!=null) {
				this.jTabbedPaneBusquedasTipoBancoRetencion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoBancoRetencion!=null) {
				this.jScrollPanelDatosTipoBancoRetencion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoBancoRetencion!=null) {
				this.jPanelPaginacionTipoBancoRetencion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoBancoRetencion!=null) {
				this.jPanelParametrosReportesTipoBancoRetencion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoBancoRetencion!=null) {
				this.jScrollPanelDatosEdicionTipoBancoRetencion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBancoRetencion!=null) {
				this.jTabbedPaneBusquedasTipoBancoRetencion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoBancoRetencion!=null) {
				this.jScrollPanelDatosTipoBancoRetencion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoBancoRetencion!=null) {
				this.jPanelPaginacionTipoBancoRetencion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoBancoRetencion!=null) {
				this.jPanelParametrosReportesTipoBancoRetencion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoBancoRetencion!=null) {
				this.jScrollPanelDatosEdicionTipoBancoRetencion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBancoRetencion!=null) {
				this.jTabbedPaneBusquedasTipoBancoRetencion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoBancoRetencion!=null) {
				this.jScrollPanelDatosTipoBancoRetencion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoBancoRetencion!=null) {
				this.jPanelPaginacionTipoBancoRetencion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoBancoRetencion!=null) {
				this.jPanelParametrosReportesTipoBancoRetencion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoBancoRetencion!=null) {
				this.jScrollPanelDatosEdicionTipoBancoRetencion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBancoRetencion!=null) {
				this.jTabbedPaneBusquedasTipoBancoRetencion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoBancoRetencion!=null) {
				this.jScrollPanelDatosTipoBancoRetencion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoBancoRetencion!=null) {
				this.jPanelPaginacionTipoBancoRetencion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoBancoRetencion!=null) {
				this.jPanelParametrosReportesTipoBancoRetencion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoBancoRetencion!=null) {
				this.jScrollPanelDatosEdicionTipoBancoRetencion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBancoRetencion!=null) {
				this.jTabbedPaneBusquedasTipoBancoRetencion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoBancoRetencion!=null) {
				this.jScrollPanelDatosTipoBancoRetencion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoBancoRetencion!=null) {
				this.jPanelPaginacionTipoBancoRetencion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoBancoRetencion!=null) {
				this.jPanelParametrosReportesTipoBancoRetencion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoBancoRetencion!=null) {
				this.jScrollPanelDatosEdicionTipoBancoRetencion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBancoRetencion!=null) {
				this.jTabbedPaneBusquedasTipoBancoRetencion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoBancoRetencion!=null) {
				this.jScrollPanelDatosTipoBancoRetencion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoBancoRetencion!=null) {
				this.jPanelPaginacionTipoBancoRetencion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoBancoRetencion!=null) {
				this.jPanelParametrosReportesTipoBancoRetencion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoBancoRetencion!=null) {
					this.jTabbedPaneBusquedasTipoBancoRetencion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoBancoRetencion!=null) {
				this.jPanelParametrosReportesTipoBancoRetencion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBancoRetencion!=null) {
				this.jTabbedPaneBusquedasTipoBancoRetencion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoBancoRetencion!=null) {
				this.jPanelParametrosReportesTipoBancoRetencion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTipoBancoRetencion.remove(jPanelBusquedaPorCodigoTipoBancoRetencion);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoBancoRetencion.remove(jPanelBusquedaPorNombreTipoBancoRetencion);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoBancoRetencionSessionBean tipobancoretencionSessionBean=new TipoBancoRetencionSessionBean();
		
		if(this.tipobancoretencionSessionBean==null) {
			this.tipobancoretencionSessionBean=new TipoBancoRetencionSessionBean();
		}
		
		this.tipobancoretencionSessionBean.setsUltimaBusquedaTipoBancoRetencion(this.getsAccionBusqueda());
		this.tipobancoretencionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipobancoretencionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			tipobancoretencionSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipobancoretencionSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipobancoretencionSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoBancoRetencionSessionBean tipobancoretencionSessionBean=new TipoBancoRetencionSessionBean();
		
		if(this.tipobancoretencionSessionBean==null) {
			this.tipobancoretencionSessionBean=new TipoBancoRetencionSessionBean();
		}
		
		if(this.tipobancoretencionSessionBean.getsUltimaBusquedaTipoBancoRetencion()!=null&&!this.tipobancoretencionSessionBean.getsUltimaBusquedaTipoBancoRetencion().equals("")) {
			this.setsAccionBusqueda(tipobancoretencionSessionBean.getsUltimaBusquedaTipoBancoRetencion());
			this.setiNumeroPaginacion(tipobancoretencionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipobancoretencionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(tipobancoretencionSessionBean.getcodigo());
				tipobancoretencionSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipobancoretencionSessionBean.getnombre());
				tipobancoretencionSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipobancoretencionSessionBean.getid_empresa());
				tipobancoretencionSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipobancoretencionSessionBean.setsUltimaBusquedaTipoBancoRetencion("");
		this.tipobancoretencionSessionBean.setiNumeroPaginacion(TipoBancoRetencionConstantesFunciones.INUMEROPAGINACION);
		this.tipobancoretencionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoBancoRetencion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoBancoRetencion() {
		this.updateBorderResaltarBusquedasFormularioTipoBancoRetencion();
		this.updateVisibilidadBusquedasFormularioTipoBancoRetencion();
		this.updateHabilitarBusquedasFormularioTipoBancoRetencion();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoBancoRetencion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoBancoRetencion.getComponents().length>0) {
	

		if(this.tipobancoretencionConstantesFunciones.resaltarBusquedaPorCodigoTipoBancoRetencion!=null) {
			index= this.jTabbedPaneBusquedasTipoBancoRetencion.indexOfComponent(this.jPanelBusquedaPorCodigoTipoBancoRetencion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoBancoRetencion.getComponent(index);
				jPanel.setBorder(this.tipobancoretencionConstantesFunciones.resaltarBusquedaPorCodigoTipoBancoRetencion);
			}
		}

		if(this.tipobancoretencionConstantesFunciones.resaltarBusquedaPorNombreTipoBancoRetencion!=null) {
			index= this.jTabbedPaneBusquedasTipoBancoRetencion.indexOfComponent(this.jPanelBusquedaPorNombreTipoBancoRetencion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoBancoRetencion.getComponent(index);
				jPanel.setBorder(this.tipobancoretencionConstantesFunciones.resaltarBusquedaPorNombreTipoBancoRetencion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoBancoRetencion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoBancoRetencion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoBancoRetencion.indexOfComponent(this.jPanelBusquedaPorCodigoTipoBancoRetencion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoBancoRetencion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipobancoretencionConstantesFunciones.mostrarBusquedaPorCodigoTipoBancoRetencion);
			if(!this.tipobancoretencionConstantesFunciones.mostrarBusquedaPorCodigoTipoBancoRetencion && index>-1) {
				this.jTabbedPaneBusquedasTipoBancoRetencion.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoBancoRetencion.indexOfComponent(this.jPanelBusquedaPorNombreTipoBancoRetencion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoBancoRetencion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipobancoretencionConstantesFunciones.mostrarBusquedaPorNombreTipoBancoRetencion);
			if(!this.tipobancoretencionConstantesFunciones.mostrarBusquedaPorNombreTipoBancoRetencion && index>-1) {
				this.jTabbedPaneBusquedasTipoBancoRetencion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoBancoRetencion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoBancoRetencion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoBancoRetencion.indexOfComponent(this.jPanelBusquedaPorCodigoTipoBancoRetencion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoBancoRetencion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipobancoretencionConstantesFunciones.activarBusquedaPorCodigoTipoBancoRetencion);
				this.jTabbedPaneBusquedasTipoBancoRetencion.setEnabledAt(index,this.tipobancoretencionConstantesFunciones.activarBusquedaPorCodigoTipoBancoRetencion);
			}

			index= this.jTabbedPaneBusquedasTipoBancoRetencion.indexOfComponent(this.jPanelBusquedaPorNombreTipoBancoRetencion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoBancoRetencion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipobancoretencionConstantesFunciones.activarBusquedaPorNombreTipoBancoRetencion);
				this.jTabbedPaneBusquedasTipoBancoRetencion.setEnabledAt(index,this.tipobancoretencionConstantesFunciones.activarBusquedaPorNombreTipoBancoRetencion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoBancoRetencion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTipoBancoRetencion.indexOfComponent(this.jPanelBusquedaPorCodigoTipoBancoRetencion);

			this.jTabbedPaneBusquedasTipoBancoRetencion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoBancoRetencion.getComponent(index);

			this.tipobancoretencionConstantesFunciones.setResaltarBusquedaPorCodigoTipoBancoRetencion(resaltar);

			jPanel.setBorder(this.tipobancoretencionConstantesFunciones.resaltarBusquedaPorCodigoTipoBancoRetencion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoBancoRetencion.indexOfComponent(this.jPanelBusquedaPorNombreTipoBancoRetencion);

			this.jTabbedPaneBusquedasTipoBancoRetencion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoBancoRetencion.getComponent(index);

			this.tipobancoretencionConstantesFunciones.setResaltarBusquedaPorNombreTipoBancoRetencion(resaltar);

			jPanel.setBorder(this.tipobancoretencionConstantesFunciones.resaltarBusquedaPorNombreTipoBancoRetencion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoBancoRetencion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoBancoRetencion() throws Exception {

		if(this.jInternalFrameDetalleFormTipoBancoRetencion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoBancoRetencion();
		this.updateVisibilidadResaltarControlesFormularioTipoBancoRetencion();
		this.updateHabilitarResaltarControlesFormularioTipoBancoRetencion();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoBancoRetencion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoBancoRetencion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipobancoretencionConstantesFunciones.resaltaridTipoBancoRetencion!=null && this.jInternalFrameDetalleFormTipoBancoRetencion!=null) {this.jInternalFrameDetalleFormTipoBancoRetencion.jLabelidTipoBancoRetencion.setBorder(this.tipobancoretencionConstantesFunciones.resaltaridTipoBancoRetencion);}
		if(this.tipobancoretencionConstantesFunciones.resaltarid_empresaTipoBancoRetencion!=null && this.jInternalFrameDetalleFormTipoBancoRetencion!=null) {this.jInternalFrameDetalleFormTipoBancoRetencion.jComboBoxid_empresaTipoBancoRetencion.setBorder(this.tipobancoretencionConstantesFunciones.resaltarid_empresaTipoBancoRetencion);}
		if(this.tipobancoretencionConstantesFunciones.resaltarcodigoTipoBancoRetencion!=null && this.jInternalFrameDetalleFormTipoBancoRetencion!=null) {this.jInternalFrameDetalleFormTipoBancoRetencion.jTextFieldcodigoTipoBancoRetencion.setBorder(this.tipobancoretencionConstantesFunciones.resaltarcodigoTipoBancoRetencion);}
		if(this.tipobancoretencionConstantesFunciones.resaltarnombreTipoBancoRetencion!=null && this.jInternalFrameDetalleFormTipoBancoRetencion!=null) {this.jInternalFrameDetalleFormTipoBancoRetencion.jTextAreanombreTipoBancoRetencion.setBorder(this.tipobancoretencionConstantesFunciones.resaltarnombreTipoBancoRetencion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoBancoRetencion() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoBancoRetencion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) {
	
		//this.jInternalFrameDetalleFormTipoBancoRetencion.jLabelidTipoBancoRetencion.setVisible(this.tipobancoretencionConstantesFunciones.mostraridTipoBancoRetencion);
		this.jInternalFrameDetalleFormTipoBancoRetencion.jPanelidTipoBancoRetencion.setVisible(this.tipobancoretencionConstantesFunciones.mostraridTipoBancoRetencion);
		//this.jInternalFrameDetalleFormTipoBancoRetencion.jComboBoxid_empresaTipoBancoRetencion.setVisible(this.tipobancoretencionConstantesFunciones.mostrarid_empresaTipoBancoRetencion);
		this.jInternalFrameDetalleFormTipoBancoRetencion.jPanelid_empresaTipoBancoRetencion.setVisible(this.tipobancoretencionConstantesFunciones.mostrarid_empresaTipoBancoRetencion);
		//this.jInternalFrameDetalleFormTipoBancoRetencion.jTextFieldcodigoTipoBancoRetencion.setVisible(this.tipobancoretencionConstantesFunciones.mostrarcodigoTipoBancoRetencion);
		this.jInternalFrameDetalleFormTipoBancoRetencion.jPanelcodigoTipoBancoRetencion.setVisible(this.tipobancoretencionConstantesFunciones.mostrarcodigoTipoBancoRetencion);
		//this.jInternalFrameDetalleFormTipoBancoRetencion.jTextAreanombreTipoBancoRetencion.setVisible(this.tipobancoretencionConstantesFunciones.mostrarnombreTipoBancoRetencion);
		this.jInternalFrameDetalleFormTipoBancoRetencion.jPanelnombreTipoBancoRetencion.setVisible(this.tipobancoretencionConstantesFunciones.mostrarnombreTipoBancoRetencion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoBancoRetencion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoBancoRetencion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoBancoRetencion!=null) {
	
		this.jInternalFrameDetalleFormTipoBancoRetencion.jLabelidTipoBancoRetencion.setEnabled(this.tipobancoretencionConstantesFunciones.activaridTipoBancoRetencion);
		this.jInternalFrameDetalleFormTipoBancoRetencion.jComboBoxid_empresaTipoBancoRetencion.setEnabled(this.tipobancoretencionConstantesFunciones.activarid_empresaTipoBancoRetencion);
		this.jInternalFrameDetalleFormTipoBancoRetencion.jTextFieldcodigoTipoBancoRetencion.setEnabled(this.tipobancoretencionConstantesFunciones.activarcodigoTipoBancoRetencion);
		this.jInternalFrameDetalleFormTipoBancoRetencion.jTextAreanombreTipoBancoRetencion.setEnabled(this.tipobancoretencionConstantesFunciones.activarnombreTipoBancoRetencion);
		}
	}
	
		
}