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

import com.bydan.erp.inventario.util.EstadoRequisicionConstantesFunciones;
import com.bydan.erp.inventario.util.EstadoRequisicionParameterReturnGeneral;
//import com.bydan.erp.inventario.util.EstadoRequisicionParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.EstadoRequisicionBean;
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
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class EstadoRequisicionBeanSwingJInternalFrame extends EstadoRequisicionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoRequisicionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoRequisicion> estadorequisicionValidator = new ClassValidator<EstadoRequisicion>(EstadoRequisicion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoRequisicion estadorequisicion;	
	public EstadoRequisicion estadorequisicionAux;
	public EstadoRequisicion estadorequisicionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoRequisicion estadorequisicionTotales;
	public Long idEstadoRequisicionActual;
	public Long iIdNuevoEstadoRequisicion=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosRequisicionCompra=false;

	public Boolean getIsTienePermisosRequisicionCompra() {
		return isTienePermisosRequisicionCompra;
	}

	public void setIsTienePermisosRequisicionCompra(Boolean isTienePermisosRequisicionCompra) {
		this.isTienePermisosRequisicionCompra= isTienePermisosRequisicionCompra;
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
	
	public Boolean isPermisoTodoEstadoRequisicion;
	public Boolean isPermisoNuevoEstadoRequisicion;
	public Boolean isPermisoActualizarEstadoRequisicion;
	public Boolean isPermisoActualizarOriginalEstadoRequisicion;
	public Boolean isPermisoEliminarEstadoRequisicion;
	public Boolean isPermisoGuardarCambiosEstadoRequisicion;
	public Boolean isPermisoConsultaEstadoRequisicion;
	public Boolean isPermisoBusquedaEstadoRequisicion;
	public Boolean isPermisoReporteEstadoRequisicion;
	public Boolean isPermisoPaginacionMedioEstadoRequisicion;
	public Boolean isPermisoPaginacionAltoEstadoRequisicion;
	public Boolean isPermisoPaginacionTodoEstadoRequisicion;
	public Boolean isPermisoCopiarEstadoRequisicion;
	public Boolean isPermisoVerFormEstadoRequisicion;
	public Boolean isPermisoDuplicarEstadoRequisicion;
	public Boolean isPermisoOrdenEstadoRequisicion;
	
	
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
	
	public EstadoRequisicionParameterReturnGeneral estadorequisicionReturnGeneral;
	public EstadoRequisicionParameterReturnGeneral estadorequisicionParameterGeneral;
	
	

	public RequisicionCompraLogic requisicioncompraCompraLogic=null;

	public RequisicionCompraLogic getRequisicionCompraCompraLogic() {
		return requisicioncompraCompraLogic;
	}

	public void setRequisicionCompraCompraLogic(RequisicionCompraLogic requisicioncompraCompraLogic) {
		this.requisicioncompraCompraLogic = requisicioncompraCompraLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoRequisicion=false;
	public Boolean esParaAccionDesdeFormularioEstadoRequisicion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EstadoRequisicionSessionBeanAdditional estadorequisicionSessionBeanAdditional=null;
	
	public EstadoRequisicionSessionBeanAdditional getEstadoRequisicionSessionBeanAdditional() {
		return this.estadorequisicionSessionBeanAdditional;
	}
	
	public void setEstadoRequisicionSessionBeanAdditional(EstadoRequisicionSessionBeanAdditional estadorequisicionSessionBeanAdditional) {
		try {
			this.estadorequisicionSessionBeanAdditional=estadorequisicionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EstadoRequisicionBeanSwingJInternalFrameAdditional estadorequisicionBeanSwingJInternalFrameAdditional=null;
	//public class EstadoRequisicionBeanSwingJInternalFrame
	
	public EstadoRequisicionBeanSwingJInternalFrameAdditional getEstadoRequisicionBeanSwingJInternalFrameAdditional() {
		return this.estadorequisicionBeanSwingJInternalFrameAdditional;
	}
	
	public void setEstadoRequisicionBeanSwingJInternalFrameAdditional(EstadoRequisicionBeanSwingJInternalFrameAdditional estadorequisicionBeanSwingJInternalFrameAdditional) {
		try {
			this.estadorequisicionBeanSwingJInternalFrameAdditional=estadorequisicionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoRequisicionLogic estadorequisicionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoRequisicion estadorequisicionBean;
	public EstadoRequisicionConstantesFunciones estadorequisicionConstantesFunciones;
	//public EstadoRequisicionParameterReturnGeneral estadorequisicionReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoRequisicion> estadorequisicions;	
	//public List<EstadoRequisicion> estadorequisicionsEliminados;
	//public List<EstadoRequisicion> estadorequisicionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoRequisicion=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoRequisicion=true;
	public Boolean isVisibilidadCeldaCopiarEstadoRequisicion=true;
	public Boolean isVisibilidadCeldaVerFormEstadoRequisicion=true;
	public Boolean isVisibilidadCeldaOrdenEstadoRequisicion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoRequisicion=false;
	public Boolean isVisibilidadCeldaModificarEstadoRequisicion=false;
	public Boolean isVisibilidadCeldaActualizarEstadoRequisicion=false;
	public Boolean isVisibilidadCeldaEliminarEstadoRequisicion=false;
	public Boolean isVisibilidadCeldaCancelarEstadoRequisicion=false;
	public Boolean isVisibilidadCeldaGuardarEstadoRequisicion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoRequisicion=false;	
	
	
	
	public Long getiIdNuevoEstadoRequisicion() {
		return this.iIdNuevoEstadoRequisicion;
	}

	public void setiIdNuevoEstadoRequisicion(Long iIdNuevoEstadoRequisicion) {
		this.iIdNuevoEstadoRequisicion = iIdNuevoEstadoRequisicion;
	}
	
	public Long getidEstadoRequisicionActual() {
		return this.idEstadoRequisicionActual;
	}

	public void setidEstadoRequisicionActual(Long idEstadoRequisicionActual) {
		this.idEstadoRequisicionActual = idEstadoRequisicionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoRequisicion getestadorequisicion() {
		return this.estadorequisicion;
	}

	public void setestadorequisicion(EstadoRequisicion estadorequisicion) {
		this.estadorequisicion = estadorequisicion;
	}
	
	public EstadoRequisicion getestadorequisicionAux() {
		return this.estadorequisicionAux;
	}

	public void setestadorequisicionAux(EstadoRequisicion estadorequisicionAux) {
		this.estadorequisicionAux = estadorequisicionAux;
	}				
	
	public EstadoRequisicion getestadorequisicionAnterior() {
		return this.estadorequisicionAnterior;
	}

	public void setestadorequisicionAnterior(EstadoRequisicion estadorequisicionAnterior) {
		this.estadorequisicionAnterior = estadorequisicionAnterior;
	}	
	
	public EstadoRequisicion getestadorequisicionTotales() {
		return this.estadorequisicionTotales;
	}

	public void setestadorequisicionTotales(EstadoRequisicion estadorequisicionTotales) {
		this.estadorequisicionTotales = estadorequisicionTotales;
	}	
	
	public EstadoRequisicion getestadorequisicionBean() {
		return this.estadorequisicionBean;
	}

	public void setestadorequisicionBean(EstadoRequisicion estadorequisicionBean) {
		this.estadorequisicionBean = estadorequisicionBean;
	}	
	
	public EstadoRequisicionParameterReturnGeneral getestadorequisicionReturnGeneral() {
		return this.estadorequisicionReturnGeneral;
	}

	public void setestadorequisicionReturnGeneral(EstadoRequisicionParameterReturnGeneral estadorequisicionReturnGeneral) {
		this.estadorequisicionReturnGeneral = estadorequisicionReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoRequisicionLogic getEstadoRequisicionLogic()	{		
		return estadorequisicionLogic;
	}

	public void setEstadoRequisicionLogic(EstadoRequisicionLogic estadorequisicionLogic) {
		this.estadorequisicionLogic = estadorequisicionLogic;
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
	
	public Boolean getIsEsNuevoEstadoRequisicion() {
		return isEsNuevoEstadoRequisicion;
	}

	public void setIsEsNuevoEstadoRequisicion(Boolean isEsNuevoEstadoRequisicion) {
		this.isEsNuevoEstadoRequisicion = isEsNuevoEstadoRequisicion;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoRequisicion() {
		return esParaAccionDesdeFormularioEstadoRequisicion;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoRequisicion(Boolean esParaAccionDesdeFormularioEstadoRequisicion) {
		this.esParaAccionDesdeFormularioEstadoRequisicion = esParaAccionDesdeFormularioEstadoRequisicion;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoRequisicion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoRequisicionConstantesFunciones.refrescarForeignKeysDescripcionesEstadoRequisicion(this.estadorequisicionLogic.getEstadoRequisicions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoRequisicionConstantesFunciones.refrescarForeignKeysDescripcionesEstadoRequisicion(this.estadorequisicions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadorequisicionLogic.setEstadoRequisicions(this.estadorequisicions);
			estadorequisicionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoRequisicionParameterReturnGeneral getEstadoRequisicionParameterGeneral() {
		return this.estadorequisicionParameterGeneral;
	}
	
	public void setEstadoRequisicionParameterGeneral(EstadoRequisicionParameterReturnGeneral estadorequisicionParameterGeneral) {
		this.estadorequisicionParameterGeneral = estadorequisicionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoRequisicion() {
		return isPermisoTodoEstadoRequisicion;
	}

	public void setIsPermisoTodoEstadoRequisicion(Boolean isPermisoTodoEstadoRequisicion) {
		this.isPermisoTodoEstadoRequisicion = isPermisoTodoEstadoRequisicion;
	}

	public Boolean getIsPermisoNuevoEstadoRequisicion() {
		return isPermisoNuevoEstadoRequisicion;
	}

	public void setIsPermisoNuevoEstadoRequisicion(Boolean isPermisoNuevoEstadoRequisicion) {
		this.isPermisoNuevoEstadoRequisicion = isPermisoNuevoEstadoRequisicion;
	}

	public Boolean getIsPermisoActualizarEstadoRequisicion() {
		return isPermisoActualizarEstadoRequisicion;
	}

	public void setIsPermisoActualizarEstadoRequisicion(Boolean isPermisoActualizarEstadoRequisicion) {
		this.isPermisoActualizarEstadoRequisicion = isPermisoActualizarEstadoRequisicion;
	}

	public Boolean getIsPermisoEliminarEstadoRequisicion() {
		return isPermisoEliminarEstadoRequisicion;
	}

	public void setIsPermisoEliminarEstadoRequisicion(Boolean isPermisoEliminarEstadoRequisicion) {
		this.isPermisoEliminarEstadoRequisicion = isPermisoEliminarEstadoRequisicion;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoRequisicion() {
		return isPermisoGuardarCambiosEstadoRequisicion;
	}

	public void setIsPermisoGuardarCambiosEstadoRequisicion(Boolean isPermisoGuardarCambiosEstadoRequisicion) {
		this.isPermisoGuardarCambiosEstadoRequisicion = isPermisoGuardarCambiosEstadoRequisicion;
	}
	
	public Boolean getIsPermisoConsultaEstadoRequisicion() {
		return isPermisoConsultaEstadoRequisicion;
	}

	public void setIsPermisoConsultaEstadoRequisicion(Boolean isPermisoConsultaEstadoRequisicion) {
		this.isPermisoConsultaEstadoRequisicion = isPermisoConsultaEstadoRequisicion;
	}

	public Boolean getIsPermisoBusquedaEstadoRequisicion() {
		return isPermisoBusquedaEstadoRequisicion;
	}

	public void setIsPermisoBusquedaEstadoRequisicion(Boolean isPermisoBusquedaEstadoRequisicion) {
		this.isPermisoBusquedaEstadoRequisicion = isPermisoBusquedaEstadoRequisicion;
	}

	public Boolean getIsPermisoReporteEstadoRequisicion() {
		return isPermisoReporteEstadoRequisicion;
	}

	public void setIsPermisoReporteEstadoRequisicion(Boolean isPermisoReporteEstadoRequisicion) {
		this.isPermisoReporteEstadoRequisicion = isPermisoReporteEstadoRequisicion;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoRequisicion() {
		return isPermisoPaginacionMedioEstadoRequisicion;
	}

	public void setIsPermisoPaginacionMedioEstadoRequisicion(Boolean isPermisoPaginacionMedioEstadoRequisicion) {
		this.isPermisoPaginacionMedioEstadoRequisicion = isPermisoPaginacionMedioEstadoRequisicion;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoRequisicion() {
		return isPermisoPaginacionTodoEstadoRequisicion;
	}

	public void setIsPermisoPaginacionTodoEstadoRequisicion(Boolean isPermisoPaginacionTodoEstadoRequisicion) {
		this.isPermisoPaginacionTodoEstadoRequisicion = isPermisoPaginacionTodoEstadoRequisicion;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoRequisicion() {
		return isPermisoPaginacionAltoEstadoRequisicion;
	}

	public void setIsPermisoPaginacionAltoEstadoRequisicion(Boolean isPermisoPaginacionAltoEstadoRequisicion) {
		this.isPermisoPaginacionAltoEstadoRequisicion = isPermisoPaginacionAltoEstadoRequisicion;
	}
	
	public Boolean getIsPermisoCopiarEstadoRequisicion() {
		return isPermisoCopiarEstadoRequisicion;
	}

	public void setIsPermisoCopiarEstadoRequisicion(Boolean isPermisoCopiarEstadoRequisicion) {
		this.isPermisoCopiarEstadoRequisicion = isPermisoCopiarEstadoRequisicion;
	}
	
	public Boolean getIsPermisoVerFormEstadoRequisicion() {
		return isPermisoVerFormEstadoRequisicion;
	}

	public void setIsPermisoVerFormEstadoRequisicion(Boolean isPermisoVerFormEstadoRequisicion) {
		this.isPermisoVerFormEstadoRequisicion = isPermisoVerFormEstadoRequisicion;
	}
	
	public Boolean getIsPermisoDuplicarEstadoRequisicion() {
		return isPermisoDuplicarEstadoRequisicion;
	}

	public void setIsPermisoDuplicarEstadoRequisicion(Boolean isPermisoDuplicarEstadoRequisicion) {
		this.isPermisoDuplicarEstadoRequisicion = isPermisoDuplicarEstadoRequisicion;
	}
	
	public Boolean getIsPermisoOrdenEstadoRequisicion() {
		return isPermisoOrdenEstadoRequisicion;
	}

	public void setIsPermisoOrdenEstadoRequisicion(Boolean isPermisoOrdenEstadoRequisicion) {
		this.isPermisoOrdenEstadoRequisicion = isPermisoOrdenEstadoRequisicion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoRequisicion() {
		return isVisibilidadCeldaNuevoEstadoRequisicion;
	}

	public void setIsVisibilidadCeldaNuevoEstadoRequisicion(Boolean isVisibilidadCeldaNuevoEstadoRequisicion) {
		this.isVisibilidadCeldaNuevoEstadoRequisicion = isVisibilidadCeldaNuevoEstadoRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoRequisicion() {
		return isVisibilidadCeldaDuplicarEstadoRequisicion;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoRequisicion(Boolean isVisibilidadCeldaDuplicarEstadoRequisicion) {
		this.isVisibilidadCeldaDuplicarEstadoRequisicion = isVisibilidadCeldaDuplicarEstadoRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoRequisicion() {
		return isVisibilidadCeldaCopiarEstadoRequisicion;
	}

	public void setIsVisibilidadCeldaCopiarEstadoRequisicion(Boolean isVisibilidadCeldaCopiarEstadoRequisicion) {
		this.isVisibilidadCeldaCopiarEstadoRequisicion = isVisibilidadCeldaCopiarEstadoRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoRequisicion() {
		return isVisibilidadCeldaVerFormEstadoRequisicion;
	}

	public void setIsVisibilidadCeldaVerFormEstadoRequisicion(Boolean isVisibilidadCeldaVerFormEstadoRequisicion) {
		this.isVisibilidadCeldaVerFormEstadoRequisicion = isVisibilidadCeldaVerFormEstadoRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoRequisicion() {
		return isVisibilidadCeldaOrdenEstadoRequisicion;
	}

	public void setIsVisibilidadCeldaOrdenEstadoRequisicion(Boolean isVisibilidadCeldaOrdenEstadoRequisicion) {
		this.isVisibilidadCeldaOrdenEstadoRequisicion = isVisibilidadCeldaOrdenEstadoRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoRequisicion() {
		return isVisibilidadCeldaNuevoRelacionesEstadoRequisicion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoRequisicion(Boolean isVisibilidadCeldaNuevoRelacionesEstadoRequisicion) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoRequisicion = isVisibilidadCeldaNuevoRelacionesEstadoRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoRequisicion() {
		return isVisibilidadCeldaModificarEstadoRequisicion;
	}

	public void setIsVisibilidadCeldaModificarEstadoRequisicion(Boolean isVisibilidadCeldaModificarEstadoRequisicion) {
		this.isVisibilidadCeldaModificarEstadoRequisicion = isVisibilidadCeldaModificarEstadoRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoRequisicion() {
		return isVisibilidadCeldaActualizarEstadoRequisicion;
	}

	public void setIsVisibilidadCeldaActualizarEstadoRequisicion(Boolean isVisibilidadCeldaActualizarEstadoRequisicion) {
		this.isVisibilidadCeldaActualizarEstadoRequisicion = isVisibilidadCeldaActualizarEstadoRequisicion;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoRequisicion() {
		return isVisibilidadCeldaEliminarEstadoRequisicion;
	}

	public void setIsVisibilidadCeldaEliminarEstadoRequisicion(Boolean isVisibilidadCeldaEliminarEstadoRequisicion) {
		this.isVisibilidadCeldaEliminarEstadoRequisicion = isVisibilidadCeldaEliminarEstadoRequisicion;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoRequisicion() {
		return isVisibilidadCeldaCancelarEstadoRequisicion;
	}

	public void setIsVisibilidadCeldaCancelarEstadoRequisicion(Boolean isVisibilidadCeldaCancelarEstadoRequisicion) {
		this.isVisibilidadCeldaCancelarEstadoRequisicion = isVisibilidadCeldaCancelarEstadoRequisicion;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoRequisicion() {
		return isVisibilidadCeldaGuardarEstadoRequisicion;
	}

	public void setIsVisibilidadCeldaGuardarEstadoRequisicion(Boolean isVisibilidadCeldaGuardarEstadoRequisicion) {
		this.isVisibilidadCeldaGuardarEstadoRequisicion = isVisibilidadCeldaGuardarEstadoRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoRequisicion() {
		return isVisibilidadCeldaGuardarCambiosEstadoRequisicion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoRequisicion(Boolean isVisibilidadCeldaGuardarCambiosEstadoRequisicion) {
		this.isVisibilidadCeldaGuardarCambiosEstadoRequisicion = isVisibilidadCeldaGuardarCambiosEstadoRequisicion;
	}
		
	public EstadoRequisicionSessionBean getestadorequisicionSessionBean() {
		return this.estadorequisicionSessionBean;
	}
	
	public void setestadorequisicionSessionBean(EstadoRequisicionSessionBean estadorequisicionSessionBean) {
		this.estadorequisicionSessionBean=estadorequisicionSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoRequisicion(EstadoRequisicion estadorequisicion)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoRequisicion estadorequisicion,EstadoRequisicion estadorequisicionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoRequisicion(estadorequisicion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadorequisicionAux.setId(estadorequisicion.getId());
		estadorequisicionAux.setVersionRow(estadorequisicion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoRequisicion();
		
			int intSelectedRow = this.jTableDatosEstadoRequisicion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorequisicion =(EstadoRequisicion) this.estadorequisicionLogic.getEstadoRequisicions().toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadorequisicion =(EstadoRequisicion) this.estadorequisicions.toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoRequisicion(this.estadorequisicion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoRequisicion(this.estadorequisicion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadorequisicionValidator.getInvalidValues(this.estadorequisicion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadorequisicionLogic.setDatosCliente(datosCliente);
			estadorequisicionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadorequisicionAux=new  EstadoRequisicion();
				
				estadorequisicionAux.setIsNew(true);
				estadorequisicionAux.setIsChanged(true);
				
				estadorequisicionAux.setEstadoRequisicionOriginal(this.estadorequisicion);
				
				estadorequisicionAux.setId(this.estadorequisicion.getId());	
				estadorequisicionAux.setVersionRow(this.estadorequisicion.getVersionRow());	
				estadorequisicionAux.setcodigo(this.estadorequisicion.getcodigo());	
				estadorequisicionAux.setnombre(this.estadorequisicion.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadorequisicionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadorequisicionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadorequisicionAux,estadorequisicionLogic.getEstadoRequisicions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadorequisicionAux,estadorequisicions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadorequisicionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadorequisicionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadorequisicionLogic.saveEstadoRequisicions();//WithConnection
						//estadorequisicionLogic.getSetVersionRowEstadoRequisicions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadorequisicion,estadorequisicionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadorequisicionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncompraLogic.getRequisicionCompras().addAll(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncomprasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncompras.addAll(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncomprasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.jInternalFrameDetalleFormRequisicionCompra.detallerequisicioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.jInternalFrameDetalleFormRequisicionCompra.detallerequisicioncompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.jInternalFrameDetalleFormRequisicionCompra.detallerequisicioncompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.jInternalFrameDetalleFormRequisicionCompra.detallerequisicioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.jInternalFrameDetalleFormRequisicionCompra.detallerequisicioncompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.jInternalFrameDetalleFormRequisicionCompra.detallerequisicioncompraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadorequisicionLogic.saveEstadoRequisicionRelaciones(estadorequisicionAux,this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncompraLogic.getRequisicionCompras());//WithConnection
								//estadorequisicionLogic.getSetVersionRowEstadoRequisicions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadorequisicion,estadorequisicionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncompraLogic.setRequisicionCompras(new ArrayList<RequisicionCompra>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncompras= new ArrayList<RequisicionCompra>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.quitarFilaTotales();}
							estadorequisicionAux.setRequisicionCompraCompras(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncompraLogic.getRequisicionCompras());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadorequisicionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadorequisicionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadorequisicionAux,estadorequisicionLogic.getEstadoRequisicions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadorequisicionAux,estadorequisicions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadorequisicion,estadorequisicionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadorequisicionAux=new  EstadoRequisicion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadorequisicionSessionBean.getEsGuardarRelacionado() 
					|| (this.estadorequisicionSessionBean.getEsGuardarRelacionado() && this.estadorequisicion.getId()>=0)) {
						
					estadorequisicionAux.setIsNew(false);
				}
				
				estadorequisicionAux.setIsDeleted(false);
			
				estadorequisicionAux.setId(this.estadorequisicion.getId());	
				estadorequisicionAux.setVersionRow(this.estadorequisicion.getVersionRow());	
				estadorequisicionAux.setcodigo(this.estadorequisicion.getcodigo());	
				estadorequisicionAux.setnombre(this.estadorequisicion.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadorequisicionAux,estadorequisicionLogic.getEstadoRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadorequisicionAux,estadorequisicions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadorequisicionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadorequisicionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadorequisicionLogic.saveEstadoRequisicions();//WithConnection
						//estadorequisicionLogic.getSetVersionRowEstadoRequisicions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadorequisicion,estadorequisicionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadorequisicionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncompraLogic.getRequisicionCompras().addAll(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncomprasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncompras.addAll(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncomprasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.jInternalFrameDetalleFormRequisicionCompra.detallerequisicioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.jInternalFrameDetalleFormRequisicionCompra.detallerequisicioncompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.jInternalFrameDetalleFormRequisicionCompra.detallerequisicioncompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.jInternalFrameDetalleFormRequisicionCompra.detallerequisicioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.jInternalFrameDetalleFormRequisicionCompra.detallerequisicioncompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.jInternalFrameDetalleFormRequisicionCompra.detallerequisicioncompraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadorequisicionLogic.saveEstadoRequisicionRelaciones(estadorequisicionAux,this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncompraLogic.getRequisicionCompras());//WithConnection
								//estadorequisicionLogic.getSetVersionRowEstadoRequisicions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadorequisicion,estadorequisicionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncompraLogic.setRequisicionCompras(new ArrayList<RequisicionCompra>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncompras= new ArrayList<RequisicionCompra>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.quitarFilaTotales();}
							estadorequisicionAux.setRequisicionCompraCompras(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncompraLogic.getRequisicionCompras());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadorequisicionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadorequisicionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadorequisicionAux,estadorequisicionLogic.getEstadoRequisicions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadorequisicionAux,estadorequisicions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadorequisicion,estadorequisicionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadorequisicionAux=new  EstadoRequisicion();
				
				estadorequisicionAux.setIsNew(false);
				estadorequisicionAux.setIsChanged(false);
				
				estadorequisicionAux.setIsDeleted(true);
				
				estadorequisicionAux.setId(this.estadorequisicion.getId());	
				estadorequisicionAux.setVersionRow(this.estadorequisicion.getVersionRow());	
				estadorequisicionAux.setcodigo(this.estadorequisicion.getcodigo());	
				estadorequisicionAux.setnombre(this.estadorequisicion.getnombre());	
				
				if(this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadorequisicionAux.getId()>=0) {	
						this.estadorequisicionsEliminados.add(estadorequisicionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadorequisicionAux,estadorequisicionLogic.getEstadoRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadorequisicionAux,estadorequisicions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadorequisicionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadorequisicionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadorequisicionLogic.saveEstadoRequisicions();//WithConnection
						//estadorequisicionLogic.getSetVersionRowEstadoRequisicions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadorequisicionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncompraLogic.getRequisicionCompras().addAll(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncomprasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncompras.addAll(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncomprasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.jInternalFrameDetalleFormRequisicionCompra.detallerequisicioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.jInternalFrameDetalleFormRequisicionCompra.detallerequisicioncompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.jInternalFrameDetalleFormRequisicionCompra.detallerequisicioncompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.jInternalFrameDetalleFormRequisicionCompra.detallerequisicioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.jInternalFrameDetalleFormRequisicionCompra.detallerequisicioncompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.jInternalFrameDetalleFormRequisicionCompra.detallerequisicioncompraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadorequisicionLogic.saveEstadoRequisicionRelaciones(estadorequisicionAux,this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncompraLogic.getRequisicionCompras());//WithConnection
								//estadorequisicionLogic.getSetVersionRowEstadoRequisicions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncompraLogic.setRequisicionCompras(new ArrayList<RequisicionCompra>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncompras= new ArrayList<RequisicionCompra>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.quitarFilaTotales();}
							estadorequisicionAux.setRequisicionCompraCompras(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncompraLogic.getRequisicionCompras());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadorequisicionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadorequisicionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadorequisicionAux,estadorequisicionLogic.getEstadoRequisicions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadorequisicionAux,estadorequisicions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorequisicionLogic.getEstadoRequisicions().addAll(this.estadorequisicionsEliminados);
					
					estadorequisicionLogic.saveEstadoRequisicions();//WithConnection
					//estadorequisicionLogic.getSetVersionRowEstadoRequisicions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadorequisicionsEliminados= new ArrayList<EstadoRequisicion>();		
			}
			
			if(this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Requisicion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Requisicion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadorequisicion=estadorequisicionAux;
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
      		//this.finishProcessEstadoRequisicion();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoRequisicion estadorequisicionLocal) throws Exception {
		
		if(this.estadorequisicionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadorequisicionLocal.setRequisicionCompraCompras(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncompraLogic.getRequisicionCompras());
			
			} else {
			
				estadorequisicionLocal.setRequisicionCompraCompras(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncompras);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoRequisicion estadorequisicionLocal) throws Exception {	
		if(this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoRequisicionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoRequisicion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadorequisicion =(EstadoRequisicion) this.estadorequisicionLogic.getEstadoRequisicions().toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadorequisicion =(EstadoRequisicion) this.estadorequisicions.toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadorequisicionValidator.getInvalidValues(this.estadorequisicion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoRequisicion estadorequisicion,List<EstadoRequisicion> estadorequisicions) throws Exception {
		try	{		
			EstadoRequisicionConstantesFunciones.actualizarLista(estadorequisicion,estadorequisicions,this.estadorequisicionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoRequisicion estadorequisicion,List<EstadoRequisicion> estadorequisicions) throws Exception {
		try	{			
			EstadoRequisicionConstantesFunciones.actualizarSelectedLista(estadorequisicion,estadorequisicions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoRequisicion> estadorequisicionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadorequisicionsLocal=this.estadorequisicionLogic.getEstadoRequisicions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadorequisicionsLocal=this.estadorequisicions;
			}
			//ARCHITECTURE
		
			for(EstadoRequisicion estadorequisicionLocal:estadorequisicionsLocal) {
				if(this.permiteMantenimiento(estadorequisicionLocal) && estadorequisicionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoRequisicionConstantesFunciones.getEstadoRequisicionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoRequisicionConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoRequisicion.jLabelcodigoEstadoRequisicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoRequisicionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoRequisicion.jLabelnombreEstadoRequisicion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoRequisicion.jLabelcodigoEstadoRequisicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoRequisicion.jLabelnombreEstadoRequisicion,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("RequisicionCompra")) {
			if(this.estadorequisicion==null) {
				this.estadorequisicion= new EstadoRequisicion();
			}

			if(this.estadorequisicionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoRequisicion
				this.setVariablesFormularioToObjetoActualEstadoRequisicion(this.estadorequisicion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoRequisicion(this.estadorequisicion);

				this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.getrequisicioncompra().setEstadoRequisicionCompra(this.estadorequisicion);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoRequisicion--;	
		
		
		this.estadorequisicionAux=new EstadoRequisicion();
		
		this.estadorequisicionAux.setId(this.iIdNuevoEstadoRequisicion);
		this.estadorequisicionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadorequisicionLogic.getEstadoRequisicions().add(this.estadorequisicionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadorequisicions.add(this.estadorequisicionAux);
		}
		//ARCHITECTURE
		
		this.estadorequisicion=this.estadorequisicionAux;
		
		if(EstadoRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoRequisicion(this.estadorequisicion);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoRequisicion(this.estadorequisicion);
		}
				
		//this.setDefaultControlesEstadoRequisicion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoRequisicion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoRequisicion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoRequisicion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoRequisicion(this.estadorequisicionBean,this.estadorequisicion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoRequisicion(this.estadorequisicion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoRequisicionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadorequisicionSessionBean.getConGuardarRelaciones()) {
			classes=EstadoRequisicionConstantesFunciones.getClassesRelationshipsOfEstadoRequisicion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadorequisicionReturnGeneral=estadorequisicionLogic.procesarEventosEstadoRequisicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadorequisicionLogic.getEstadoRequisicions(),this.estadorequisicion,this.estadorequisicionParameterGeneral,this.isEsNuevoEstadoRequisicion,classes);//this.estadorequisicionLogic.getEstadoRequisicion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoRequisicion(this.estadorequisicionReturnGeneral,this.estadorequisicionBean,false);
		
		if(this.estadorequisicionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoRequisicion(this.estadorequisicionReturnGeneral.getEstadoRequisicion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoRequisicion(this.estadorequisicionReturnGeneral.getEstadoRequisicion());
		}
		
		if(this.estadorequisicionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoRequisicion(this.estadorequisicionReturnGeneral.getEstadoRequisicion(),classes);//this.estadorequisicionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoRequisicion(this.estadorequisicion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoRequisicion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoRequisicion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoRequisicionBeanSwingJInternalFrameAdditional.RecargarFormEstadoRequisicion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoRequisicion(false);
						
			if(estadorequisicionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncompraSessionBean.getEsGuardarRelacionado() && RequisicionCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonRequisicionCompraActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoRequisicionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoRequisicion();
			}
			
			this.actualizarVisualTableDatosEstadoRequisicion();
			
			this.jTableDatosEstadoRequisicion.setRowSelectionInterval(this.getIndiceNuevoEstadoRequisicion(), this.getIndiceNuevoEstadoRequisicion());
			
			this.seleccionarFilaTablaEstadoRequisicionActual();
						
			this.actualizarEstadoCeldasBotonesEstadoRequisicion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoRequisicion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoRequisicion.jTextFieldcodigoEstadoRequisicion.setEnabled(isHabilitar && this.estadorequisicionConstantesFunciones.activarcodigoEstadoRequisicion);
		this.jInternalFrameDetalleFormEstadoRequisicion.jTextFieldnombreEstadoRequisicion.setEnabled(isHabilitar && this.estadorequisicionConstantesFunciones.activarnombreEstadoRequisicion);	
		
	};
	
	public void setDefaultControlesEstadoRequisicion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoRequisicion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadorequisicionSessionBean.setConGuardarRelaciones(true);			
			this.estadorequisicionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoRequisicion.jTabbedPaneRelacionesEstadoRequisicion.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncompraSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadorequisicionSessionBean.setConGuardarRelaciones(false);			
			this.estadorequisicionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoRequisicion.jTabbedPaneRelacionesEstadoRequisicion.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncompraSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoRequisicion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoRequisicion estadorequisicionAux:this.estadorequisicionLogic.getEstadoRequisicions()) {
				if(estadorequisicionAux.getId().equals(this.iIdNuevoEstadoRequisicion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoRequisicion estadorequisicionAux:this.estadorequisicions) {
				if(estadorequisicionAux.getId().equals(this.iIdNuevoEstadoRequisicion)) {
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
	
	public int getIndiceActualEstadoRequisicion(EstadoRequisicion estadorequisicion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoRequisicion estadorequisicionAux:this.estadorequisicionLogic.getEstadoRequisicions()) {
				if(estadorequisicionAux.getId().equals(estadorequisicion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoRequisicion estadorequisicionAux:this.estadorequisicions) {
				if(estadorequisicionAux.getId().equals(estadorequisicion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoRequisicion(EstadoRequisicion estadorequisicionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoRequisicion estadorequisicionAux:this.estadorequisicionLogic.getEstadoRequisicions()) {
				if(estadorequisicionAux.getEstadoRequisicionOriginal().getId().equals(estadorequisicionOriginal.getId())) {
					existe=true;
					estadorequisicionOriginal.setId(estadorequisicionAux.getId());
					estadorequisicionOriginal.setVersionRow(estadorequisicionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoRequisicion estadorequisicionAux:this.estadorequisicions) {
				if(estadorequisicionAux.getEstadoRequisicionOriginal().getId().equals(estadorequisicionOriginal.getId())) {
					existe=true;
					estadorequisicionOriginal.setId(estadorequisicionAux.getId());
					estadorequisicionOriginal.setVersionRow(estadorequisicionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoRequisicion(Boolean esParaCancelar) throws Exception {
		estadorequisicionsAux=new ArrayList<EstadoRequisicion>();
		estadorequisicionAux=new EstadoRequisicion();
		
		if(!this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoRequisicion estadorequisicionAux:this.estadorequisicionLogic.getEstadoRequisicions()) {
					if(estadorequisicionAux.getId()<0) {
						estadorequisicionsAux.add(estadorequisicionAux);
					}		
				}
				this.iIdNuevoEstadoRequisicion=0L;
				this.estadorequisicionLogic.getEstadoRequisicions().removeAll(estadorequisicionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoRequisicion estadorequisicionAux:this.estadorequisicions) {
					if(estadorequisicionAux.getId()<0) {
						estadorequisicionsAux.add(estadorequisicionAux);
					}		
				}
				this.iIdNuevoEstadoRequisicion=0L;
				this.estadorequisicions.removeAll(estadorequisicionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoRequisicion 
					&& this.estadorequisicionLogic.getEstadoRequisicions().size()>0
					) {
					estadorequisicionAux=this.estadorequisicionLogic.getEstadoRequisicions().get(this.estadorequisicionLogic.getEstadoRequisicions().size() - 1);
				
					if(estadorequisicionAux.getId()<0) {
						this.estadorequisicionLogic.getEstadoRequisicions().remove(estadorequisicionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoRequisicion && this.estadorequisicions.size()>0) {
					estadorequisicionAux=this.estadorequisicions.get(this.estadorequisicions.size() - 1);
				
					if(estadorequisicionAux.getId()<0) {
						this.estadorequisicions.remove(estadorequisicionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoRequisicion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadorequisicion.getId()<0) {
				this.estadorequisicionLogic.getEstadoRequisicions().remove(this.estadorequisicion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadorequisicion.getId()<0) {
				this.estadorequisicions.remove(this.estadorequisicion);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoRequisicion(List<EstadoRequisicion> estadorequisicionsAux) throws Exception {
		EstadoRequisicionConstantesFunciones.setEstadosInicialesEstadoRequisicion(estadorequisicionsAux);
	}
	
	public void setEstadosInicialesEstadoRequisicion(EstadoRequisicion estadorequisicionAux) throws Exception {
		EstadoRequisicionConstantesFunciones.setEstadosInicialesEstadoRequisicion(estadorequisicionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoRequisicionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoRequisicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoRequisicionActual()) {
				if(!this.isEsNuevoEstadoRequisicion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoRequisicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoRequisicion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoRequisicionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Requisicion ?", "MANTENIMIENTO DE Estado Requisicion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoRequisicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoRequisicion estadorequisicion) throws Exception {
		EstadoRequisicionConstantesFunciones.seleccionarAsignar(this.estadorequisicion,estadorequisicion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoRequisicion=this.isPermisoActualizarOriginalEstadoRequisicion;
			
			
			this.seleccionarAsignar(estadorequisicion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoRequisicionConstantesFunciones.quitarEspaciosEstadoRequisicion(this.estadorequisicion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoRequisicion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadorequisicionSessionBean.setsFuncionBusquedaRapida(this.estadorequisicionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoRequisicion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoRequisicion(esParaCancelar);				
				this.cancelarNuevoEstadoRequisicion(esParaCancelar);								
			}
			
			this.estadorequisicion=new EstadoRequisicion();
			
			this.inicializarEstadoRequisicion();
			
			this.actualizarEstadoCeldasBotonesEstadoRequisicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoRequisicion() throws Exception {
		try {
			EstadoRequisicionConstantesFunciones.inicializarEstadoRequisicion(this.estadorequisicion);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadorequisicionLogic.getEstadoRequisicions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoRequisicions(String sAccionBusqueda,List<EstadoRequisicion> estadorequisicionsParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoRequisicion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoRequisicionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoRequisicionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoRequisicion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Requisiciones");		
		parameters.put("busquedapor", EstadoRequisicionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(RequisicionCompra.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoRequisicionLogic estadorequisicionLogicAuxiliar=new EstadoRequisicionLogic();
					estadorequisicionLogicAuxiliar.setDatosCliente(estadorequisicionLogic.getDatosCliente());				
					estadorequisicionLogicAuxiliar.setEstadoRequisicions(estadorequisicionsParaReportes);
					
					estadorequisicionLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoRequisicionWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadorequisicionsParaReportes=estadorequisicionLogicAuxiliar.getEstadoRequisicions();
					
					//estadorequisicionLogic.getNewConnexionToDeep();
					
					//for (EstadoRequisicion estadorequisicion:estadorequisicionsParaReportes) {
					//	estadorequisicionLogic.deepLoad(estadorequisicion, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadorequisicionLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadorequisicionLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileRequisicionCompra = AuxiliarReportes.class.getResourceAsStream("RequisicionCompraDetalleRelacionesDesign.jasper");
			parameters.put("subreport_requisicioncompra", reportFileRequisicionCompra);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoRequisicion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoRequisicionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoRequisicionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoRequisicion=new JRBeanArrayDataSource(EstadoRequisicionJInternalFrame.TraerEstadoRequisicionBeans(estadorequisicionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoRequisicion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoRequisicionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoRequisicionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoRequisicionBean.TraerEstadoRequisicionBeans(estadorequisicionsParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoRequisicions(sAccionBusqueda,sTipoArchivoReporte,estadorequisicionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoRequisicions(sAccionBusqueda,sTipoArchivoReporte,estadorequisicionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoRequisicionActionPerformed(null);
					//this.generarExcelReporteEstadoRequisicions(sAccionBusqueda,sTipoArchivoReporte,estadorequisicionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoRequisicions(sAccionBusqueda,sTipoArchivoReporte,estadorequisicionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoRequisicions(sAccionBusqueda,sTipoArchivoReporte,estadorequisicionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoRequisicions(sAccionBusqueda,sTipoArchivoReporte,estadorequisicionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoRequisicions(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoRequisicion> estadorequisicionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadorequisicion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoRequisicions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoRequisicion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoRequisicion estadorequisicion : estadorequisicionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoRequisicionConstantesFunciones.generarExcelReporteDataEstadoRequisicion("NORMAL",row,workbook,estadorequisicion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Requisicion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoRequisicion(String sTipo,Row row,Workbook workbook) {
		
		EstadoRequisicionConstantesFunciones.generarExcelReporteHeaderEstadoRequisicion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoRequisicions(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoRequisicion> estadorequisicionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadorequisicion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoRequisicions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoRequisicion estadorequisicion : estadorequisicionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoRequisicionConstantesFunciones.getEstadoRequisicionDescripcion(estadorequisicion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoRequisicionConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoRequisicionConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadorequisicion.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoRequisicionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoRequisicionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadorequisicion.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Requisicion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoRequisicions(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoRequisicion> estadorequisicionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoRequisicion> estadorequisicionsRespaldo=null;
		
		classes=EstadoRequisicionConstantesFunciones.getClassesRelationshipsOfEstadoRequisicion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadorequisicionLogic.setDatosCliente(this.datosCliente);
		this.estadorequisicionLogic.setDatosDeep(this.datosDeep);
		this.estadorequisicionLogic.setIsConDeep(true);
		
		estadorequisicionsRespaldo=this.estadorequisicionLogic.getEstadoRequisicions();
		
		this.estadorequisicionLogic.setEstadoRequisicions(estadorequisicionsParaReportes);	
		this.estadorequisicionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadorequisicionsParaReportes=this.estadorequisicionLogic.getEstadoRequisicions();
		this.estadorequisicionLogic.setEstadoRequisicions(estadorequisicionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadorequisicion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoRequisicions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoRequisicion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoRequisicion estadorequisicion : estadorequisicionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoRequisicion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoRequisicionConstantesFunciones.generarExcelReporteDataEstadoRequisicion("NORMAL",row,workbook,estadorequisicion,cellStyleDataAux);
		
			
			


				//RequisicionCompra
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(RequisicionCompraConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadorequisicion.getRequisicionCompraCompras()!=null && estadorequisicion.getRequisicionCompraCompras().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(RequisicionCompraConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					RequisicionCompraConstantesFunciones.generarExcelReporteHeaderRequisicionCompra("RELACIONADO",row,workbook);
				}

				if(estadorequisicion.getRequisicionCompraCompras()!=null) {
					i2=0;
					for(RequisicionCompra requisicioncompra : estadorequisicion.getRequisicionCompraCompras()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						RequisicionCompraConstantesFunciones.generarExcelReporteDataRequisicionCompra("RELACIONADO",row,workbook,requisicioncompra,cellStyleDataAuxHijo);
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
		cell.setCellValue(EstadoRequisicionConstantesFunciones.getEstadoRequisicionDescripcion(estadorequisicion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Requisicion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoRequisicion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoRequisicion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoRequisicion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoRequisicion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoRequisicion() throws Exception {		
		this.startProcessEstadoRequisicion(true);
	}
	
	public void startProcessEstadoRequisicion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoRequisicion, this.jScrollPanelDatosEstadoRequisicion,this.jPanelPaginacionEstadoRequisicion, this.jScrollPanelDatosEdicionEstadoRequisicion, this.jPanelAccionesEstadoRequisicion,this.jPanelAccionesFormularioEstadoRequisicion,this.jmenuBarEstadoRequisicion,this.jmenuBarDetalleEstadoRequisicion,this.jTtoolBarEstadoRequisicion,this.jTtoolBarDetalleEstadoRequisicion);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoRequisicion=null; 
		
		final JPanel jPanelParametrosReportesEstadoRequisicion=this.jPanelParametrosReportesEstadoRequisicion;
		//final JScrollPane jScrollPanelDatosEstadoRequisicion=this.jScrollPanelDatosEstadoRequisicion;
		final JTable jTableDatosEstadoRequisicion=this.jTableDatosEstadoRequisicion;		
		final JPanel jPanelPaginacionEstadoRequisicion=this.jPanelPaginacionEstadoRequisicion;
		//final JScrollPane jScrollPanelDatosEdicionEstadoRequisicion=this.jScrollPanelDatosEdicionEstadoRequisicion;
		final JPanel jPanelAccionesEstadoRequisicion=this.jPanelAccionesEstadoRequisicion;
		
		JPanel jPanelCamposAuxiliarEstadoRequisicion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoRequisicion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) {
			jPanelCamposAuxiliarEstadoRequisicion=this.jInternalFrameDetalleFormEstadoRequisicion.jPanelCamposEstadoRequisicion;
			jPanelAccionesFormularioAuxiliarEstadoRequisicion=this.jInternalFrameDetalleFormEstadoRequisicion.jPanelAccionesFormularioEstadoRequisicion;
		}
		
		final JPanel jPanelCamposEstadoRequisicion=jPanelCamposAuxiliarEstadoRequisicion;
		final JPanel jPanelAccionesFormularioEstadoRequisicion=jPanelAccionesFormularioAuxiliarEstadoRequisicion;
		
		
		final JMenuBar jmenuBarEstadoRequisicion=this.jmenuBarEstadoRequisicion;
		final JToolBar jTtoolBarEstadoRequisicion=this.jTtoolBarEstadoRequisicion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoRequisicion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoRequisicion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) {
			jmenuBarDetalleAuxiliarEstadoRequisicion=this.jInternalFrameDetalleFormEstadoRequisicion.jmenuBarDetalleEstadoRequisicion;
			jTtoolBarDetalleAuxiliarEstadoRequisicion=this.jInternalFrameDetalleFormEstadoRequisicion.jTtoolBarDetalleEstadoRequisicion;
		}
		
		final JMenuBar jmenuBarDetalleEstadoRequisicion=jmenuBarDetalleAuxiliarEstadoRequisicion;
		final JToolBar jTtoolBarDetalleEstadoRequisicion=jTtoolBarDetalleAuxiliarEstadoRequisicion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoRequisicion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoRequisicion;
			processRunnable.jTableDatos=jTableDatosEstadoRequisicion;
			processRunnable.jPanelCampos=jPanelCamposEstadoRequisicion;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoRequisicion;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoRequisicion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoRequisicion;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoRequisicion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoRequisicion;
			processRunnable.jTtoolBar=jTtoolBarEstadoRequisicion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoRequisicion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoRequisicion ,jPanelParametrosReportesEstadoRequisicion,jTableDatosEstadoRequisicion, /*jScrollPanelDatosEstadoRequisicion,*/jPanelCamposEstadoRequisicion,jPanelPaginacionEstadoRequisicion, /*jScrollPanelDatosEdicionEstadoRequisicion,*/ jPanelAccionesEstadoRequisicion,jPanelAccionesFormularioEstadoRequisicion,jmenuBarEstadoRequisicion,jmenuBarDetalleEstadoRequisicion,jTtoolBarEstadoRequisicion,jTtoolBarDetalleEstadoRequisicion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoRequisicion, jScrollPanelDatosEstadoRequisicion,jPanelPaginacionEstadoRequisicion, jScrollPanelDatosEdicionEstadoRequisicion, jPanelAccionesEstadoRequisicion,jPanelAccionesFormularioEstadoRequisicion,jmenuBarEstadoRequisicion,jmenuBarDetalleEstadoRequisicion,jTtoolBarEstadoRequisicion,jTtoolBarDetalleEstadoRequisicion);
						
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
	
	public void finishProcessEstadoRequisicion() {// throws Exception 
		this.finishProcessEstadoRequisicion(true);
	}
	
	public void finishProcessEstadoRequisicion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoRequisicion, this.jScrollPanelDatosEstadoRequisicion,this.jPanelPaginacionEstadoRequisicion, this.jScrollPanelDatosEdicionEstadoRequisicion, this.jPanelAccionesEstadoRequisicion,this.jPanelAccionesFormularioEstadoRequisicion,this.jmenuBarEstadoRequisicion,this.jmenuBarDetalleEstadoRequisicion,this.jTtoolBarEstadoRequisicion,this.jTtoolBarDetalleEstadoRequisicion);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoRequisicion=null; 
		
		final JPanel jPanelParametrosReportesEstadoRequisicion=this.jPanelParametrosReportesEstadoRequisicion;
		//final JScrollPane jScrollPanelDatosEstadoRequisicion=this.jScrollPanelDatosEstadoRequisicion;
		final JTable jTableDatosEstadoRequisicion=this.jTableDatosEstadoRequisicion;		
		final JPanel jPanelPaginacionEstadoRequisicion=this.jPanelPaginacionEstadoRequisicion;
		//final JScrollPane jScrollPanelDatosEdicionEstadoRequisicion=this.jScrollPanelDatosEdicionEstadoRequisicion;
		final JPanel jPanelAccionesEstadoRequisicion=this.jPanelAccionesEstadoRequisicion;
		
		JPanel jPanelCamposAuxiliarEstadoRequisicion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoRequisicion=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) {
			jPanelCamposAuxiliarEstadoRequisicion=this.jInternalFrameDetalleFormEstadoRequisicion.jPanelCamposEstadoRequisicion;
			jPanelAccionesFormularioAuxiliarEstadoRequisicion=this.jInternalFrameDetalleFormEstadoRequisicion.jPanelAccionesFormularioEstadoRequisicion;
		}
		
		final JPanel jPanelCamposEstadoRequisicion=jPanelCamposAuxiliarEstadoRequisicion;
		final JPanel jPanelAccionesFormularioEstadoRequisicion=jPanelAccionesFormularioAuxiliarEstadoRequisicion;
		
		
		final JMenuBar jmenuBarEstadoRequisicion=this.jmenuBarEstadoRequisicion;		
		final JToolBar jTtoolBarEstadoRequisicion=this.jTtoolBarEstadoRequisicion;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoRequisicion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoRequisicion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) {
			jmenuBarDetalleAuxiliarEstadoRequisicion=this.jInternalFrameDetalleFormEstadoRequisicion.jmenuBarDetalleEstadoRequisicion;
			jTtoolBarDetalleAuxiliarEstadoRequisicion=this.jInternalFrameDetalleFormEstadoRequisicion.jTtoolBarDetalleEstadoRequisicion;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoRequisicion=jmenuBarDetalleAuxiliarEstadoRequisicion;
		final JToolBar jTtoolBarDetalleEstadoRequisicion=jTtoolBarDetalleAuxiliarEstadoRequisicion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoRequisicion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoRequisicion;
			processRunnable.jTableDatos=jTableDatosEstadoRequisicion;
			processRunnable.jPanelCampos=jPanelCamposEstadoRequisicion;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoRequisicion;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoRequisicion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoRequisicion;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoRequisicion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoRequisicion;
			processRunnable.jTtoolBar=jTtoolBarEstadoRequisicion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoRequisicion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoRequisicion ,jPanelParametrosReportesEstadoRequisicion, jTableDatosEstadoRequisicion,/*jScrollPanelDatosEstadoRequisicion,*/jPanelCamposEstadoRequisicion,jPanelPaginacionEstadoRequisicion, /*jScrollPanelDatosEdicionEstadoRequisicion,*/ jPanelAccionesEstadoRequisicion,jPanelAccionesFormularioEstadoRequisicion,jmenuBarEstadoRequisicion,jmenuBarDetalleEstadoRequisicion,jTtoolBarEstadoRequisicion,jTtoolBarDetalleEstadoRequisicion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoRequisicion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoRequisicion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoRequisicion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoRequisicion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoRequisicion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoRequisicion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoRequisicion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoRequisicion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoRequisicion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadorequisicionConstantesFunciones.getsFinalQueryEstadoRequisicion();
		String  finalQueryPaginacionTodos=this.estadorequisicionConstantesFunciones.getsFinalQueryEstadoRequisicion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoRequisicionConstantesFunciones.getArrayColumnasGlobalesNoEstadoRequisicion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoRequisicionConstantesFunciones.getArrayColumnasGlobalesEstadoRequisicion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoRequisicionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadorequisicionsEliminados= new ArrayList<EstadoRequisicion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoRequisicion();
		
				///*EstadoRequisicionSessionBean*/this.estadorequisicionSessionBean=new EstadoRequisicionSessionBean();
			
			if(this.estadorequisicionSessionBean==null) {
				this.estadorequisicionSessionBean=new EstadoRequisicionSessionBean();
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
					this.iNumeroPaginacion=EstadoRequisicionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoRequisicionConstantesFunciones.getClassesForeignKeysOfEstadoRequisicion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadorequisicion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadorequisicionsAux= new ArrayList<EstadoRequisicion>();
			
				
			estadorequisicionLogic.setDatosCliente(this.datosCliente);
			estadorequisicionLogic.setDatosDeep(this.datosDeep);
			estadorequisicionLogic.setIsConDeep(true);
			
			
			estadorequisicionLogic.getEstadoRequisicionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadorequisicionLogic.getTodosEstadoRequisicions(finalQueryGlobal,pagination);
					
					//estadorequisicionLogic.getTodosEstadoRequisicionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadorequisicionLogic.getEstadoRequisicions()==null|| estadorequisicionLogic.getEstadoRequisicions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadorequisicionsAux= new ArrayList<EstadoRequisicion>();
							estadorequisicionsAux.addAll(estadorequisicionLogic.getEstadoRequisicions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadorequisicionsAux= new ArrayList<EstadoRequisicion>();
							estadorequisicionsAux.addAll(estadorequisicions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadorequisicionLogic.getTodosEstadoRequisicions(finalQueryGlobal+"",this.pagination);												
							
							//estadorequisicionLogic.getTodosEstadoRequisicionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoRequisicions("Todos",estadorequisicionLogic.getEstadoRequisicions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadorequisicionLogic.setEstadoRequisicions(new ArrayList<EstadoRequisicion>());					
							estadorequisicionLogic.getEstadoRequisicions().addAll(estadorequisicionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadorequisicions=new ArrayList<EstadoRequisicion>();
							estadorequisicions.addAll(estadorequisicionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoRequisicion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoRequisicion=this.idActual;
				
				} else if(this.idEstadoRequisicionActual!=null && this.idEstadoRequisicionActual!=0L) {
					idEstadoRequisicion=idEstadoRequisicionActual;
				}
				
					
				this.sDetalleReporte=EstadoRequisicionConstantesFunciones.getDetalleIndicePorId(idEstadoRequisicion);
				
				this.estadorequisicions=new ArrayList<EstadoRequisicion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadorequisicionLogic.getEntity(idEstadoRequisicion);
					
					//estadorequisicionLogic.getEntityWithConnection(idEstadoRequisicion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadorequisicionLogic.setEstadoRequisicions(new ArrayList<EstadoRequisicion>());
					estadorequisicionLogic.getEstadoRequisicions().add(estadorequisicionLogic.getEstadoRequisicion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadorequisicions=new ArrayList<EstadoRequisicion>();
					this.estadorequisicions.add(estadorequisicion);
				}
				
				if(estadorequisicionLogic.getEstadoRequisicion()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoRequisicion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoRequisicion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadorequisicionLogic.getEstadoRequisicions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadorequisicions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadorequisicionLogic.getEstadoRequisicions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadorequisicions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoRequisicion estadorequisicion) {
		Boolean permite=true;
		
		if(this.estadorequisicion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoRequisicionConstantesFunciones.getOrderByListaEstadoRequisicion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoRequisicionConstantesFunciones.getOrderByListaEstadoRequisicion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoRequisicion estadorequisicion:estadorequisicionLogic.getEstadoRequisicions()) {
				if(estadorequisicion.getsType().equals(Constantes2.S_TOTALES)) {
					estadorequisicionTotales=estadorequisicion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoRequisicion estadorequisicion:this.estadorequisicions) {
				if(estadorequisicion.getsType().equals(Constantes2.S_TOTALES)) {
					estadorequisicionTotales=estadorequisicion;
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
			this.estadorequisicionAux=new EstadoRequisicion();
			this.estadorequisicionAux.setsType(Constantes2.S_TOTALES);
			this.estadorequisicionAux.setIsNew(false);
			this.estadorequisicionAux.setIsChanged(false);
			this.estadorequisicionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoRequisicionConstantesFunciones.TotalizarValoresFilaEstadoRequisicion(this.estadorequisicionLogic.getEstadoRequisicions(),this.estadorequisicionAux);
				
				this.estadorequisicionLogic.getEstadoRequisicions().add(this.estadorequisicionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoRequisicionConstantesFunciones.TotalizarValoresFilaEstadoRequisicion(this.estadorequisicions,this.estadorequisicionAux);
				
				this.estadorequisicions.add(this.estadorequisicionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadorequisicionTotales=new EstadoRequisicion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadorequisicionLogic.getEstadoRequisicions().remove(estadorequisicionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadorequisicions.remove(estadorequisicionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadorequisicionTotales=new EstadoRequisicion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoRequisicion estadorequisicion:estadorequisicionLogic.getEstadoRequisicions()) {
				if(estadorequisicion.getsType().equals(Constantes2.S_TOTALES)) {
					estadorequisicionTotales=estadorequisicion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoRequisicionConstantesFunciones.TotalizarValoresFilaEstadoRequisicion(this.estadorequisicionLogic.getEstadoRequisicions(),estadorequisicionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoRequisicion estadorequisicion:this.estadorequisicions) {
				if(estadorequisicion.getsType().equals(Constantes2.S_TOTALES)) {
					estadorequisicionTotales=estadorequisicion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoRequisicionConstantesFunciones.TotalizarValoresFilaEstadoRequisicion(this.estadorequisicions,estadorequisicionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosEstadoRequisicion() {
		this.isPermisoTodoEstadoRequisicion=false;
		this.isPermisoNuevoEstadoRequisicion=false;
		this.isPermisoActualizarEstadoRequisicion=false;
		this.isPermisoActualizarOriginalEstadoRequisicion=false;
		this.isPermisoEliminarEstadoRequisicion=false;
		this.isPermisoGuardarCambiosEstadoRequisicion=false;
		this.isPermisoConsultaEstadoRequisicion=false;
		this.isPermisoBusquedaEstadoRequisicion=false;
		this.isPermisoReporteEstadoRequisicion=false;		
		this.isPermisoOrdenEstadoRequisicion=false;		
		this.isPermisoPaginacionMedioEstadoRequisicion=false;		
		this.isPermisoPaginacionAltoEstadoRequisicion=false;
		this.isPermisoPaginacionTodoEstadoRequisicion=false;
		this.isPermisoCopiarEstadoRequisicion=false;		
		this.isPermisoVerFormEstadoRequisicion=false;		
		this.isPermisoDuplicarEstadoRequisicion=false;		
		this.isPermisoOrdenEstadoRequisicion=false;		
	}
	
	public void setPermisosUsuarioEstadoRequisicion(Boolean isPermiso) {
		this.isPermisoTodoEstadoRequisicion=isPermiso;
		this.isPermisoNuevoEstadoRequisicion=isPermiso;
		this.isPermisoActualizarEstadoRequisicion=isPermiso;
		this.isPermisoActualizarOriginalEstadoRequisicion=isPermiso;
		this.isPermisoEliminarEstadoRequisicion=isPermiso;
		this.isPermisoGuardarCambiosEstadoRequisicion=isPermiso;
		this.isPermisoConsultaEstadoRequisicion=isPermiso;
		this.isPermisoBusquedaEstadoRequisicion=isPermiso;
		this.isPermisoReporteEstadoRequisicion=isPermiso;
		this.isPermisoOrdenEstadoRequisicion=isPermiso;		
		this.isPermisoPaginacionMedioEstadoRequisicion=isPermiso;		
		this.isPermisoPaginacionAltoEstadoRequisicion=isPermiso;		
		this.isPermisoPaginacionTodoEstadoRequisicion=isPermiso;		
		this.isPermisoCopiarEstadoRequisicion=isPermiso;		
		this.isPermisoVerFormEstadoRequisicion=isPermiso;		
		this.isPermisoDuplicarEstadoRequisicion=isPermiso;
		this.isPermisoOrdenEstadoRequisicion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoRequisicion(Boolean isPermiso) {
		//this.isPermisoTodoEstadoRequisicion=isPermiso;
		this.isPermisoNuevoEstadoRequisicion=isPermiso;
		this.isPermisoActualizarEstadoRequisicion=isPermiso;
		this.isPermisoActualizarOriginalEstadoRequisicion=isPermiso;
		this.isPermisoEliminarEstadoRequisicion=isPermiso;
		this.isPermisoGuardarCambiosEstadoRequisicion=isPermiso;
		//this.isPermisoConsultaEstadoRequisicion=isPermiso;
		//this.isPermisoBusquedaEstadoRequisicion=isPermiso;
		//this.isPermisoReporteEstadoRequisicion=isPermiso;
		//this.isPermisoOrdenEstadoRequisicion=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoRequisicion=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoRequisicion=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoRequisicion=isPermiso;		
		//this.isPermisoCopiarEstadoRequisicion=isPermiso;		
		//this.isPermisoDuplicarEstadoRequisicion=isPermiso;
		//this.isPermisoOrdenEstadoRequisicion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoRequisicionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(RequisicionCompraConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoRequisicionJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosRequisicionCompra=false;
		this.isTienePermisosRequisicionCompra=this.verificarGetPermisosUsuarioOpcionEstadoRequisicionClaseRelacionada(this.opcionsRelacionadas,RequisicionCompraConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoRequisicion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoRequisicionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosRequisicionCompra=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoRequisicionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoRequisicionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoRequisicionClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosRequisicionCompra && this.jInternalFrameDetalleFormEstadoRequisicion!=null && this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoRequisicion.jTabbedPaneRelacionesEstadoRequisicion.remove(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoRequisicion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoRequisicionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoRequisicionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoRequisicion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoRequisicion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoRequisicion=this.isPermisoActualizarEstadoRequisicion;
			this.isPermisoEliminarEstadoRequisicion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoRequisicion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoRequisicion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoRequisicion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoRequisicion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoRequisicion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoRequisicion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoRequisicion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoRequisicion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoRequisicion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoRequisicion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoRequisicion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoRequisicion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoRequisicion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoRequisicion.setToolTipText(this.jTableDatosEstadoRequisicion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoRequisicion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoRequisicion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoRequisicionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoRequisicionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoRequisicion() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosRequisicionCompra && this.estadorequisicionConstantesFunciones.mostrarRequisicionCompraEstadoRequisicion && !EstadoRequisicionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Requisicion Compra");
			reporte.setsDescripcion("Requisicion Compra");
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
	
		
	public void inicializarCombosForeignKeyEstadoRequisicionListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoRequisicionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoRequisicionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoRequisicionListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoRequisicionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoRequisicion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoRequisicion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoRequisicion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoRequisicion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoRequisicion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoRequisicion(EstadoRequisicion estadorequisicion)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoRequisicion(EstadoRequisicion estadorequisicion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoRequisicion()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoRequisicion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoRequisicion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoRequisicion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoRequisicion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoRequisicion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoRequisicion(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoRequisicion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoRequisicionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoRequisicionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoRequisicionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadorequisicionSessionBean=new EstadoRequisicionSessionBean(); 
		this.estadorequisicionConstantesFunciones=new EstadoRequisicionConstantesFunciones(); 
		this.estadorequisicionBean=new EstadoRequisicion();//(this.estadorequisicionConstantesFunciones); 		
		this.estadorequisicionReturnGeneral=new EstadoRequisicionParameterReturnGeneral(); 
		
		this.estadorequisicionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadorequisicionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoRequisicionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoRequisicionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoRequisicionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoRequisicion(true);
			
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
			
			this.estadorequisicionConstantesFunciones=new EstadoRequisicionConstantesFunciones(); 
			this.estadorequisicionBean=new EstadoRequisicion();//this.estadorequisicionConstantesFunciones); 			
			this.estadorequisicionReturnGeneral=new EstadoRequisicionParameterReturnGeneral(); 
		
			EstadoRequisicionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Requisicion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadorequisicion=new EstadoRequisicion();
			this.estadorequisicions = new ArrayList<EstadoRequisicion>();
			this.estadorequisicionsAux = new ArrayList<EstadoRequisicion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicionLogic=new EstadoRequisicionLogic();
				this.estadorequisicionLogic.getNewConnexionToDeep("");
			}
			
			//this.estadorequisicionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadorequisicionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoRequisicion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoRequisicion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoRequisicion);	
					}
					
					if(this.jInternalFrameImportacionEstadoRequisicion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoRequisicion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoRequisicion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoRequisicion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoRequisicion);
				this.jInternalFrameDetalleFormEstadoRequisicion.setVisible(false);
				this.jInternalFrameDetalleFormEstadoRequisicion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoRequisicion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoRequisicion);
					this.jInternalFrameReporteDinamicoEstadoRequisicion.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoRequisicion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoRequisicion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoRequisicion);
					this.jInternalFrameImportacionEstadoRequisicion.setVisible(false);
					this.jInternalFrameImportacionEstadoRequisicion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoRequisicion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoRequisicion);
					this.jInternalFrameOrderByEstadoRequisicion.setVisible(false);
					this.jInternalFrameOrderByEstadoRequisicion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoRequisicionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoRequisicionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadorequisicionReturnGeneral=new EstadoRequisicionParameterReturnGeneral();
			
			this.estadorequisicionParameterGeneral=new EstadoRequisicionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadorequisicionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoRequisicionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(RequisicionCompraConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoRequisicionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadorequisicionSessionBean.getEsGuardarRelacionado(),this.estadorequisicionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoRequisicionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadorequisicionSessionBean.getEsGuardarRelacionado(),this.estadorequisicionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoRequisicion=false;
			this.isVisibilidadCeldaDuplicarEstadoRequisicion=true;
			this.isVisibilidadCeldaCopiarEstadoRequisicion=true;
			this.isVisibilidadCeldaVerFormEstadoRequisicion=true;
			this.isVisibilidadCeldaOrdenEstadoRequisicion=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRequisicion=false;
			this.isVisibilidadCeldaModificarEstadoRequisicion=false;
			this.isVisibilidadCeldaActualizarEstadoRequisicion=false;
			this.isVisibilidadCeldaEliminarEstadoRequisicion=false;
			this.isVisibilidadCeldaCancelarEstadoRequisicion=false;
			this.isVisibilidadCeldaGuardarEstadoRequisicion=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoRequisicion=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoRequisicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoRequisicion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoRequisicion(false);
			
			this.setPermisosUsuarioEstadoRequisicion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadorequisicionSessionBean.getEsGuardarRelacionado() 
				|| (this.estadorequisicionSessionBean.getEsGuardarRelacionado() && this.estadorequisicionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoRequisicionClasesRelacionadas();
			}
			
			if(this.estadorequisicionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoRequisicionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoRequisicionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoRequisicion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoRequisicion();
			}
			
			if(!this.isPermisoBusquedaEstadoRequisicion) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoRequisicion,this.isPermisoPaginacionMedioEstadoRequisicion,this.isPermisoPaginacionTodoEstadoRequisicion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoRequisicionConstantesFunciones.getTiposSeleccionarEstadoRequisicion());
				
				this.tiposColumnasSelect=EstadoRequisicionConstantesFunciones.getTiposSeleccionarEstadoRequisicion(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoRequisicion();				
				//this.tiposRelacionesSelect=EstadoRequisicionConstantesFunciones.getTiposRelacionesEstadoRequisicion(true);
				
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
			//if(!this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoRequisicion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoRequisicion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoRequisicion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoRequisicion() ;
			
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
			
			
			this.requisicioncompraCompraLogic=new RequisicionCompraLogic(); 
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
				estadorequisicionImplementable= (EstadoRequisicionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoRequisicionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadorequisicionImplementableHome= (EstadoRequisicionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoRequisicionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadorequisicions= new ArrayList<EstadoRequisicion>();
			this.estadorequisicionsEliminados= new ArrayList<EstadoRequisicion>();
						
			this.isEsNuevoEstadoRequisicion=false;
			this.esParaAccionDesdeFormularioEstadoRequisicion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoRequisicion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoRequisicion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EstadoRequisicionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoRequisicionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoRequisicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoRequisicion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoRequisicion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoRequisicion();
			}
			
			EstadoRequisicionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoRequisicion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoRequisicion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoRequisicion() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(RequisicionCompraConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(RequisicionCompraConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoRequisicion")) {
				iIndex=this.jInternalFrameDetalleFormEstadoRequisicion.jTabbedPaneRelacionesEstadoRequisicion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoRequisicion.jTabbedPaneRelacionesEstadoRequisicion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoRequisicion.getSelectedRow();	
				
				

				if(sTitle.equals("Requisicion Compras")) {
					if(!RequisicionCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoRequisicion();

						this.cargarParteTabPanelRelacionadaRequisicionCompra(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoRequisicion();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaRequisicionCompra(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoRequisicion.cargarSessionConBeanSwingJInternalFrameRequisicionCompra(false,true,iIndex);
		this.jButtonRequisicionCompraActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaRequisicionCompra();

		//this.jTabbedPaneRelacionesEstadoRequisicion.updateUI();
		//this.jTabbedPaneRelacionesEstadoRequisicion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoRequisicion.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("RequisicionCompra")) {
				int row=this.jTableDatosEstadoRequisicion.getSelectedRow();
				jButtonRequisicionCompraActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Requisicion Compra")) {

					if(this.isTienePermisosRequisicionCompra && this.estadorequisicionConstantesFunciones.mostrarRequisicionCompraEstadoRequisicion && !EstadoRequisicionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Requisicion Compras"+"("+RequisicionCompraConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Requisicion Compras");

						if(estadorequisicionConstantesFunciones.resaltarRequisicionCompraEstadoRequisicion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadorequisicionConstantesFunciones.resaltarRequisicionCompraEstadoRequisicion);
						}

						jmenuItem.setEnabled(this.estadorequisicionConstantesFunciones.activarRequisicionCompraEstadoRequisicion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"RequisicionCompra"));

						

						this.jInternalFrameDetalleFormEstadoRequisicion.jmenuDetalleEstadoRequisicion.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoRequisicion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoRequisicion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoRequisicion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoRequisicionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoRequisicion();
		
		this.cargarCombosFrameForeignKeyEstadoRequisicion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoRequisicion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoRequisicion();
		}
	}
	
	
	
	public void jButtonNuevoEstadoRequisicionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadorequisicionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoRequisicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
			
			
			if(jTableDatosEstadoRequisicion.getRowCount()>=1) {
				jTableDatosEstadoRequisicion.removeRowSelectionInterval(0, jTableDatosEstadoRequisicion.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoRequisicion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoRequisicion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoRequisicion(true);			
			//this.estadorequisicion=new EstadoRequisicion();
			//this.estadorequisicion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoRequisicion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoRequisicion() ;
			
			if(EstadoRequisicionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoRequisicion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadorequisicion);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadorequisicion);				
			
			EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
			
			if(this.estadorequisicionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoRequisicion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoRequisicionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoRequisicion> estadorequisicionsSeleccionados=new ArrayList<EstadoRequisicion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoRequisicion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoRequisicion.getSelectedRows().length;			
			}
			
			estadorequisicionsSeleccionados=this.getEstadoRequisicionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoRequisicion--;			
				//EstadoRequisicion estadorequisicionAux= new EstadoRequisicion();			
				//estadorequisicionAux.setId(this.iIdNuevoEstadoRequisicion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoRequisicion estadorequisicionOrigen=new EstadoRequisicion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoRequisicion estadorequisicionOrigen : estadorequisicionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoRequisicion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadorequisicionOrigen =(EstadoRequisicion) this.estadorequisicionLogic.getEstadoRequisicions().toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadorequisicionOrigen =(EstadoRequisicion) this.estadorequisicions.toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoRequisicion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadorequisicion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoRequisicion(estadorequisicionOrigen,this.estadorequisicion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRequisicion(this.estadorequisicion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadorequisicionLogic.getEstadoRequisicions().add(this.estadorequisicionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadorequisicions.add(this.estadorequisicionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoRequisicion(false);
				
				this.jTableDatosEstadoRequisicion.setRowSelectionInterval(this.getIndiceNuevoEstadoRequisicion(), this.getIndiceNuevoEstadoRequisicion());
				
				int iLastRow =  this.jTableDatosEstadoRequisicion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoRequisicion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoRequisicion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoRequisicion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoRequisicion> estadorequisicionsSeleccionados=new ArrayList<EstadoRequisicion>();									
		
			EstadoRequisicion estadorequisicionOrigen=new EstadoRequisicion();
			EstadoRequisicion estadorequisicionDestino=new EstadoRequisicion();
				
			estadorequisicionsSeleccionados=this.getEstadoRequisicionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoRequisicion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadorequisicionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoRequisicion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadorequisicionOrigen =(EstadoRequisicion) this.estadorequisicionLogic.getEstadoRequisicions().toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadorequisicionOrigen =(EstadoRequisicion) this.estadorequisicions.toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadorequisicionDestino =(EstadoRequisicion) this.estadorequisicionLogic.getEstadoRequisicions().toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadorequisicionDestino =(EstadoRequisicion) this.estadorequisicions.toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadorequisicionOrigen =estadorequisicionsSeleccionados.get(0);
				estadorequisicionDestino =estadorequisicionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoRequisicion(estadorequisicionOrigen,estadorequisicionDestino,true,false);
				
				estadorequisicionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadorequisicionDestino,estadorequisicionLogic.getEstadoRequisicions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadorequisicionDestino,estadorequisicions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoRequisicion(false);
				
				//this.jTableDatosEstadoRequisicion.setRowSelectionInterval(this.getIndiceNuevoEstadoRequisicion(), this.getIndiceNuevoEstadoRequisicion());
				
				int iLastRow =  this.jTableDatosEstadoRequisicion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoRequisicion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoRequisicion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoRequisicion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoRequisicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoRequisicion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoRequisicion.isVisible();
			
			
			this.jPanelParametrosReportesEstadoRequisicion.setVisible(!isVisible);
			this.jPanelPaginacionEstadoRequisicion.setVisible(!isVisible);
			this.jPanelAccionesEstadoRequisicion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoRequisicion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoRequisicion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoRequisicion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoRequisicion();
			
			this.abrirFrameOrderByEstadoRequisicion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoRequisicion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoRequisicion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoRequisicion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoRequisicion.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoRequisicion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoRequisicion.setSize(this.jInternalFrameDetalleFormEstadoRequisicion.iWidthFormulario,this.jInternalFrameDetalleFormEstadoRequisicion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoRequisicion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoRequisicion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoRequisicion.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoRequisicion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoRequisicion.jContentPaneDetalleEstadoRequisicion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoRequisicion.jTabbedPaneRelacionesEstadoRequisicion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoRequisicion.jContentPaneDetalleEstadoRequisicion.getWidth(),EstadoRequisicionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoRequisicion.jTabbedPaneRelacionesEstadoRequisicion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoRequisicion.jContentPaneDetalleEstadoRequisicion.getWidth(),EstadoRequisicionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoRequisicion.jTabbedPaneRelacionesEstadoRequisicion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoRequisicion.jContentPaneDetalleEstadoRequisicion.getWidth(),EstadoRequisicionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(RequisicionCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaRequisicionCompra();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoRequisicion.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoRequisicion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoRequisicion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoRequisicion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoRequisicion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoRequisicion,false,this);
				} else {
					this.jInternalFrameOrderByEstadoRequisicion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoRequisicion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoRequisicion);
				this.jInternalFrameOrderByEstadoRequisicion.setVisible(false);
				this.jInternalFrameOrderByEstadoRequisicion.setSelected(false);
				
				this.jInternalFrameOrderByEstadoRequisicion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoRequisicion"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoRequisicion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoRequisicion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoRequisicion==null) {
				
				this.jInternalFrameImportacionEstadoRequisicion=new ImportacionJInternalFrame(EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoRequisicion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoRequisicion);
				this.jInternalFrameImportacionEstadoRequisicion.setVisible(false);
				this.jInternalFrameImportacionEstadoRequisicion.setSelected(false);


				this.jInternalFrameImportacionEstadoRequisicion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoRequisicion"));
				this.jInternalFrameImportacionEstadoRequisicion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoRequisicion"));
				this.jInternalFrameImportacionEstadoRequisicion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoRequisicion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoRequisicion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoRequisicion==null) {
				this.jInternalFrameReporteDinamicoEstadoRequisicion=new ReporteDinamicoJInternalFrame(EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoRequisicion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoRequisicion);
				this.jInternalFrameReporteDinamicoEstadoRequisicion.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoRequisicion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoRequisicion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoRequisicion"));
				this.jInternalFrameReporteDinamicoEstadoRequisicion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoRequisicion"));
				this.jInternalFrameReporteDinamicoEstadoRequisicion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoRequisicion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoRequisicion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaRequisicionCompra() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.jScrollPanelDatosRequisicionCompra.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoRequisicion.jContentPaneDetalleEstadoRequisicion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.jScrollPanelDatosRequisicionCompra.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.jScrollPanelDatosRequisicionCompra.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.jScrollPanelDatosRequisicionCompra.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoRequisicion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoRequisicion);
			
	       	this.jInternalFrameDetalleFormEstadoRequisicion.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoRequisicion.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoRequisicion.dispose();
			//this.jInternalFrameDetalleFormEstadoRequisicion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoRequisicion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoRequisicion.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoRequisicion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoRequisicion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoRequisicion.setVisible(true);
	        this.jInternalFrameImportacionEstadoRequisicion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoRequisicion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoRequisicion.setVisible(true);
	        this.jInternalFrameOrderByEstadoRequisicion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoRequisicion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoRequisicion.setVisible(false);
	        this.jInternalFrameOrderByEstadoRequisicion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoRequisicion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoRequisicion.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoRequisicion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoRequisicion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoRequisicion.setVisible(false);
	        this.jInternalFrameImportacionEstadoRequisicion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoRequisicion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoRequisicion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoRequisicion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoRequisicion(true);
			//this.isEsNuevoEstadoRequisicion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicion =(EstadoRequisicion) this.estadorequisicionLogic.getEstadoRequisicions().toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadorequisicion =(EstadoRequisicion) this.estadorequisicions.toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoRequisicion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoRequisicion(false) ;
			
			if(estadorequisicionSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncompraSessionBean.getEsGuardarRelacionado() && RequisicionCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonRequisicionCompraActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoRequisicionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoRequisicion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoRequisicion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoRequisicionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoRequisicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorequisicion =(EstadoRequisicion) this.estadorequisicionLogic.getEstadoRequisicions().toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadorequisicion =(EstadoRequisicion) this.estadorequisicions.toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoRequisicion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoRequisicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoRequisicion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoRequisicion(true);
			//this.isEsNuevoEstadoRequisicion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicion =(EstadoRequisicion) this.estadorequisicionLogic.getEstadoRequisicions().toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadorequisicion =(EstadoRequisicion) this.estadorequisicions.toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadorequisicion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoRequisicion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoRequisicion(false) ;
			
			if(EstadoRequisicionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoRequisicion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoRequisicion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoRequisicion(false);
			
			//if(!this.isEsNuevoEstadoRequisicion) {								
				int intSelectedRow = this.jTableDatosEstadoRequisicion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorequisicion =(EstadoRequisicion) this.estadorequisicionLogic.getEstadoRequisicions().toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadorequisicion =(EstadoRequisicion) this.estadorequisicions.toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoRequisicion(this.estadorequisicion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoRequisicion(this.estadorequisicion);
				
			}
			
			if(this.permiteMantenimiento(this.estadorequisicion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoRequisicion=true;
					this.inicializarActualizarBindingTablaEstadoRequisicion(false);
					this.isEsNuevoEstadoRequisicion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoRequisicion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoRequisicion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoRequisicion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoRequisicion(false);
				
				this.habilitarDeshabilitarControlesEstadoRequisicion(false);
			
												
				
				if(EstadoRequisicionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoRequisicion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoRequisicionActionPerformed(evt,estadorequisicionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoRequisicion(this.estadorequisicion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoRequisicion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadorequisicionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadorequisicion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoRequisicion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRequisicion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoRequisicion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicion =(EstadoRequisicion) this.estadorequisicionLogic.getEstadoRequisicions().toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
				this.estadorequisicion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadorequisicion =(EstadoRequisicion) this.estadorequisicions.toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
				this.estadorequisicion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadorequisicion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoRequisicionModel) this.jTableDatosEstadoRequisicion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoRequisicion=true;
				this.inicializarActualizarBindingTablaEstadoRequisicion(false);
				this.isEsNuevoEstadoRequisicion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoRequisicion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoRequisicion(false);
				
				this.habilitarDeshabilitarControlesEstadoRequisicion(false);
				
				
				
				if(EstadoRequisicionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoRequisicion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoRequisicionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoRequisicion.getRowCount()>=1) {
				jTableDatosEstadoRequisicion.removeRowSelectionInterval(0, jTableDatosEstadoRequisicion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoRequisicion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoRequisicion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoRequisicion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoRequisicion(false) ;
			
			this.isEsNuevoEstadoRequisicion=false;
			
			if(EstadoRequisicionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoRequisicion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoRequisicionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoRequisicion(false);
				
				//SI ES MANUAL
				if(EstadoRequisicionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoRequisicion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoRequisicionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoRequisicion--;			
			//EstadoRequisicion estadorequisicionAux= new EstadoRequisicion();			
			//estadorequisicionAux.setId(this.iIdNuevoEstadoRequisicion);
			
			if(this.jInternalFrameDetalleFormEstadoRequisicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoRequisicion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoRequisicion(this.estadorequisicion);
			
			this.estadorequisicion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadorequisicionLogic.getEstadoRequisicions().add(this.estadorequisicionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadorequisicions.add(this.estadorequisicionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoRequisicion(false);
			
			this.jTableDatosEstadoRequisicion.setRowSelectionInterval(this.getIndiceNuevoEstadoRequisicion(), this.getIndiceNuevoEstadoRequisicion());
			
			int iLastRow =  this.jTableDatosEstadoRequisicion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoRequisicion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoRequisicion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoRequisicion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoRequisicionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoRequisicion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoRequisicion(false);
			
			//SI ES MANUAL
			if(EstadoRequisicionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoRequisicion();
			}
			
			//this.abrirFrameTreeEstadoRequisicion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoRequisicionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado RequisicionES ?", "MANTENIMIENTO DE Estado Requisicion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoRequisicion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoRequisicion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadorequisicionReturnGeneral=estadorequisicionLogic.procesarImportacionEstadoRequisicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadorequisicionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoRequisicionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoRequisicionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoRequisicion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoRequisicion.setFileImportacion(this.jInternalFrameImportacionEstadoRequisicion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoRequisicion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoRequisicion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoRequisicion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoRequisicion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoRequisicionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoRequisicion> estadorequisicionsSeleccionados=new ArrayList<EstadoRequisicion>();		

		estadorequisicionsSeleccionados=this.getEstadoRequisicionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoRequisicion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoRequisicion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoRequisicionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoRequisicionBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoRequisicions("Todos",estadorequisicionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Requisicion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoRequisicion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoRequisicion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoRequisicionConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoRequisicionConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoRequisicion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoRequisicion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoRequisicion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoRequisicionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoRequisicionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoRequisicion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoRequisicionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoRequisicionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoRequisicion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoRequisicion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoRequisicionConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoRequisicionConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoRequisicionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoRequisicion> estadorequisicionsSeleccionados=new ArrayList<EstadoRequisicion>();		
		
		estadorequisicionsSeleccionados=this.getEstadoRequisicionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadorequisicion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoRequisicions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoRequisicion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoRequisicion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoRequisicionConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoRequisicionConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoRequisicion estadorequisicion:estadorequisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadorequisicion.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoRequisicionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoRequisicionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoRequisicion estadorequisicion:estadorequisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadorequisicion.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoRequisicion(row);				
			//	iRow++;
			//}				
			
			//for(EstadoRequisicion estadorequisicionAux:estadorequisicionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoRequisicion(estadorequisicionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Requisicion",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadorequisicionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoRequisicion(false);
			
			//SI ES MANUAL
			if(EstadoRequisicionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoRequisicion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoRequisicionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoRequisicion(false);
			
			//SI ES MANUAL
			if(EstadoRequisicionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoRequisicion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoRequisicionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoRequisicion(false);
			
			//SI ES MANUAL
			if(EstadoRequisicionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoRequisicion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorequisicionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoRequisicion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoRequisicion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoRequisicion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoRequisicion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoRequisicion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoRequisicion.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoRequisicion.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoRequisicion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoRequisicion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoRequisicion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoRequisicion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoRequisicion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoRequisicion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoRequisicion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoRequisicion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoRequisicion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoRequisicionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoRequisicion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoRequisicion();
		
		this.inicializarActualizarBindingBotonesManualEstadoRequisicion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoRequisicion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoRequisicion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoRequisicion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoRequisicion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoRequisicion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoRequisicion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoRequisicion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoRequisicion.jCheckBoxPostAccionNuevoEstadoRequisicion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoRequisicion.jCheckBoxPostAccionSinCerrarEstadoRequisicion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoRequisicion.jCheckBoxPostAccionSinMensajeEstadoRequisicion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoRequisicion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoRequisicion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoRequisicion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) {
				this.jInternalFrameDetalleFormEstadoRequisicion.jCheckBoxPostAccionNuevoEstadoRequisicion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoRequisicion.jCheckBoxPostAccionSinCerrarEstadoRequisicion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoRequisicion.jCheckBoxPostAccionSinMensajeEstadoRequisicion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoRequisicion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoRequisicion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoRequisicion.jComboBoxTiposAccionesFormularioEstadoRequisicion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoRequisicion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoRequisicion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoRequisicion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoRequisicion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoRequisicion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoRequisicion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoRequisicion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoRequisicion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoRequisicion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoRequisicion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoRequisicion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoRequisicion(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoRequisicionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoRequisicion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoRequisicion() throws Exception {
		try	{
			if(EstadoRequisicionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoRequisicion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoRequisicion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoRequisicion.jComboBoxTiposAccionesFormularioEstadoRequisicion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoRequisicion.jComboBoxTiposAccionesFormularioEstadoRequisicion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoRequisicion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoRequisicion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoRequisicion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoRequisicion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoRequisicion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoRequisicion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoRequisicion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoRequisicion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoRequisicion.addItem(reporte);
			}
			
			
			if(!this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoRequisicion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoRequisicion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoRequisicion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoRequisicion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoRequisicion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoRequisicion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoRequisicion.jComboBoxTiposAccionesFormularioEstadoRequisicion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoRequisicion.jComboBoxTiposAccionesFormularioEstadoRequisicion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoRequisicion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoRequisicion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoRequisicion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoRequisicion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoRequisicion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoRequisicion!=null) {
				this.jInternalFrameReporteDinamicoEstadoRequisicion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoRequisicion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoRequisicion!=null) {
				this.jInternalFrameReporteDinamicoEstadoRequisicion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoRequisicion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoRequisicion!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoRequisicion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoRequisicion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoRequisicion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoRequisicion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoRequisicion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoRequisicion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoRequisicion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoRequisicion(Boolean esInicializar) throws Exception {				
		if(EstadoRequisicionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoRequisicion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoRequisicion() throws Exception {
		this.inicializarActualizarBindingTablaEstadoRequisicion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoRequisicion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoRequisicion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoRequisicion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoRequisicion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoRequisicionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoRequisicion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoRequisicion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoRequisicionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoRequisicionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoRequisicionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoRequisicionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoRequisicion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoRequisicion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoRequisicionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoRequisicion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoRequisicion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadorequisicionLogic.getEstadoRequisicions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadorequisicions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoRequisicion.setModel(new EstadoRequisicionModel(this.estadorequisicionLogic.getEstadoRequisicions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoRequisicion.setModel(new EstadoRequisicionModel(this.estadorequisicions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoRequisicion!=null && this.jInternalFrameOrderByEstadoRequisicion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoRequisicion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoRequisicion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoRequisicionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO,estadorequisicionConstantesFunciones.resaltarSeleccionarEstadoRequisicion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoRequisicionConstantesFunciones.SCLASSWEBTITULO,estadorequisicionConstantesFunciones.resaltarSeleccionarEstadoRequisicion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoRequisicion,EstadoRequisicionConstantesFunciones.LABEL_ID));

		if(this.estadorequisicionConstantesFunciones.mostraridEstadoRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoRequisicionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadorequisicionConstantesFunciones.resaltaridEstadoRequisicion,this.estadorequisicionConstantesFunciones.activaridEstadoRequisicion,this,true,"idEstadoRequisicion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadorequisicionConstantesFunciones.resaltaridEstadoRequisicion,this.estadorequisicionConstantesFunciones.activaridEstadoRequisicion,this,true,"idEstadoRequisicion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoRequisicion,EstadoRequisicionConstantesFunciones.LABEL_CODIGO));

		if(this.estadorequisicionConstantesFunciones.mostrarcodigoEstadoRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoRequisicionConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadorequisicionConstantesFunciones.resaltarcodigoEstadoRequisicion,this.estadorequisicionConstantesFunciones.activarcodigoEstadoRequisicion,this,true,"codigoEstadoRequisicion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadorequisicionConstantesFunciones.resaltarcodigoEstadoRequisicion,this.estadorequisicionConstantesFunciones.activarcodigoEstadoRequisicion,this,true,"codigoEstadoRequisicion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoRequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoRequisicion,EstadoRequisicionConstantesFunciones.LABEL_NOMBRE));

		if(this.estadorequisicionConstantesFunciones.mostrarnombreEstadoRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoRequisicionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadorequisicionConstantesFunciones.resaltarnombreEstadoRequisicion,this.estadorequisicionConstantesFunciones.activarnombreEstadoRequisicion,this,true,"nombreEstadoRequisicion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadorequisicionConstantesFunciones.resaltarnombreEstadoRequisicion,this.estadorequisicionConstantesFunciones.activarnombreEstadoRequisicion,this,true,"nombreEstadoRequisicion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoRequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadorequisicionSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosRequisicionCompra && this.estadorequisicionConstantesFunciones.mostrarRequisicionCompraEstadoRequisicion && !EstadoRequisicionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Requisicion Compras");
				tableColumn.setHeaderValue("Requisicion Compras");
				tableColumn.setCellRenderer(new RequisicionCompraTableCell(estadorequisicionConstantesFunciones.resaltarRequisicionCompraEstadoRequisicion,this,this.estadorequisicionConstantesFunciones.activarRequisicionCompraEstadoRequisicion));
				tableColumn.setCellEditor(new RequisicionCompraTableCell(estadorequisicionConstantesFunciones.resaltarRequisicionCompraEstadoRequisicion,this,this.estadorequisicionConstantesFunciones.activarRequisicionCompraEstadoRequisicion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoRequisicion.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadorequisicionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadorequisicionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoRequisicion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadorequisicionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadorequisicionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoRequisicion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoRequisicion && this.isPermisoGuardarCambiosEstadoRequisicion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadorequisicionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadorequisicionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoRequisicion.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadorequisicionSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEstadoRequisicion.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoRequisicion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoRequisicion && this.isPermisoGuardarCambiosEstadoRequisicion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadorequisicionSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoRequisicion && this.isPermisoGuardarCambiosEstadoRequisicion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoRequisicion.moveColumn(this.jTableDatosEstadoRequisicion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoRequisicion.moveColumn(this.jTableDatosEstadoRequisicion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadorequisicionSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoRequisicion.moveColumn(this.jTableDatosEstadoRequisicion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoRequisicion.moveColumn(this.jTableDatosEstadoRequisicion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoRequisicion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoRequisicion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoRequisicion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoRequisicion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoRequisicion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoRequisicion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoRequisicion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoRequisicion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadorequisicionLogic.getEstadoRequisicions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadorequisicions.size()-1;
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
		//this.jTableDatosEstadoRequisicion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoRequisicion();
			
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
				
				//this.isEsNuevoEstadoRequisicion=false;
					
				EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
			
				if(this.estadorequisicionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoRequisicion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoRequisicion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoRequisicion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorequisicion =(EstadoRequisicion) this.estadorequisicionLogic.getEstadoRequisicions().toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadorequisicion =(EstadoRequisicion) this.estadorequisicions.toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadorequisicion.getsType().equals("DUPLICADO")
				   || this.estadorequisicion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoRequisicion=true;
				
				} else {
					this.isEsNuevoEstadoRequisicion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {
					if(this.estadorequisicion.getId()>=0 && !this.estadorequisicion.getIsNew()) {						
						this.isEsNuevoEstadoRequisicion=false;
						
					} else {
						this.isEsNuevoEstadoRequisicion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoRequisicion(esRelaciones);						
				
				this.seleccionarEstadoRequisicion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadorequisicion.getId()<0) {
					this.isEsNuevoEstadoRequisicion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoRequisicion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoRequisicion(evt,rowIndex);
				}	
				
				if(this.estadorequisicionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoRequisicion: " + this.dDif); 
					}
				}								
				
				EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoRequisicion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadorequisicion)) {
					if(this.estadorequisicion.getId()>0) {
						this.estadorequisicion.setIsDeleted(true);
						
						this.estadorequisicionsEliminados.add(this.estadorequisicion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadorequisicionLogic.getEstadoRequisicions().remove(this.estadorequisicion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadorequisicions.remove(this.estadorequisicion);				
					}
					
					
					((EstadoRequisicionModel) this.jTableDatosEstadoRequisicion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoRequisicion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoRequisicion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoRequisicion) {
			
			if(this.jInternalFrameDetalleFormEstadoRequisicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoRequisicion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoRequisicion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorequisicion =(EstadoRequisicion) this.estadorequisicionLogic.getEstadoRequisicions().toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadorequisicion =(EstadoRequisicion) this.estadorequisicions.toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoRequisicion(this.estadorequisicion);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoRequisicion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoRequisicion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoRequisicion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoRequisicion(EstadoRequisicion estadorequisicion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoRequisicion(estadorequisicion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoRequisicion(EstadoRequisicion estadorequisicion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoRequisicion(estadorequisicion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoRequisicion(estadorequisicion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoRequisicion(estadorequisicion);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoRequisicion(EstadoRequisicion estadorequisicion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoRequisicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoRequisicion.jTextFieldidEstadoRequisicion.setText(estadorequisicion.getId().toString());
			this.jInternalFrameDetalleFormEstadoRequisicion.jTextFieldcodigoEstadoRequisicion.setText(estadorequisicion.getcodigo());
			this.jInternalFrameDetalleFormEstadoRequisicion.jTextFieldnombreEstadoRequisicion.setText(estadorequisicion.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoRequisicion estadorequisicionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadorequisicionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoRequisicion estadorequisicionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadorequisicionLocal=this.estadorequisicion;
			} else {
				estadorequisicionLocal=this.estadorequisicionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadorequisicionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoRequisicion(estadorequisicionLocal,true);
					
					if(estadorequisicionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadorequisicionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadorequisicionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoRequisicion(EstadoRequisicion estadorequisicion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoRequisicion(estadorequisicion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoRequisicion(estadorequisicion);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoRequisicion(EstadoRequisicion estadorequisicion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoRequisicion(estadorequisicion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoRequisicion(EstadoRequisicion estadorequisicion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoRequisicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoRequisicion.jTextFieldidEstadoRequisicion.getText()==null || this.jInternalFrameDetalleFormEstadoRequisicion.jTextFieldidEstadoRequisicion.getText()=="" || this.jInternalFrameDetalleFormEstadoRequisicion.jTextFieldidEstadoRequisicion.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoRequisicion.jTextFieldidEstadoRequisicion.setText("0");
			}

			if(conColumnasBase) {estadorequisicion.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoRequisicion.jTextFieldidEstadoRequisicion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoRequisicionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoRequisicion.jLabelIdEstadoRequisicion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadorequisicion.setcodigo(this.jInternalFrameDetalleFormEstadoRequisicion.jTextFieldcodigoEstadoRequisicion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoRequisicionConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoRequisicion.jLabelcodigoEstadoRequisicion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadorequisicion.setnombre(this.jInternalFrameDetalleFormEstadoRequisicion.jTextFieldnombreEstadoRequisicion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoRequisicionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoRequisicion.jLabelnombreEstadoRequisicion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoRequisicion(EstadoRequisicion estadorequisicionBean,EstadoRequisicion estadorequisicion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoRequisicion(EstadoRequisicion estadorequisicionOrigen,EstadoRequisicion estadorequisicion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadorequisicionOrigen.getId()!=null && !estadorequisicionOrigen.getId().equals(0L))) {estadorequisicion.setId(estadorequisicionOrigen.getId());}}
			if(conDefault || (!conDefault && estadorequisicionOrigen.getcodigo()!=null && !estadorequisicionOrigen.getcodigo().equals(""))) {estadorequisicion.setcodigo(estadorequisicionOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadorequisicionOrigen.getnombre()!=null && !estadorequisicionOrigen.getnombre().equals(""))) {estadorequisicion.setnombre(estadorequisicionOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoRequisicion(EstadoRequisicion estadorequisicion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoRequisicion.jTextFieldidEstadoRequisicion.setText(estadorequisicion.getId().toString());
			this.jInternalFrameDetalleFormEstadoRequisicion.jTextFieldcodigoEstadoRequisicion.setText(estadorequisicion.getcodigo());
			this.jInternalFrameDetalleFormEstadoRequisicion.jTextFieldnombreEstadoRequisicion.setText(estadorequisicion.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoRequisicion(EstadoRequisicionBean estadorequisicionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoRequisicion.jTextFieldidEstadoRequisicion.setText(estadorequisicionBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoRequisicion.jTextFieldcodigoEstadoRequisicion.setText(estadorequisicionBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoRequisicion.jTextFieldnombreEstadoRequisicion.setText(estadorequisicionBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoRequisicion(EstadoRequisicionParameterReturnGeneral estadorequisicionReturnGeneral,EstadoRequisicionBean estadorequisicionBean,Boolean conDefault) throws Exception { 
		try {
			EstadoRequisicion estadorequisicionLocal=new EstadoRequisicion();
			
			estadorequisicionLocal=estadorequisicionReturnGeneral.getEstadoRequisicion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadorequisicionLocal.getId()!=null && !estadorequisicionLocal.getId().equals(0L))) {estadorequisicionBean.setId(estadorequisicionLocal.getId());}}
			if(conDefault || (!conDefault && estadorequisicionLocal.getcodigo()!=null && !estadorequisicionLocal.getcodigo().equals(""))) {estadorequisicionBean.setcodigo(estadorequisicionLocal.getcodigo());}
			if(conDefault || (!conDefault && estadorequisicionLocal.getnombre()!=null && !estadorequisicionLocal.getnombre().equals(""))) {estadorequisicionBean.setnombre(estadorequisicionLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoRequisicionGenerico(Long idEstadoRequisicionSeleccionado,JComboBox jComboBoxEstadoRequisicion,List<EstadoRequisicion> estadorequisicionsLocal)throws Exception {
		try {
			EstadoRequisicion  estadorequisicionTemp=null;

			for(EstadoRequisicion estadorequisicionAux:estadorequisicionsLocal) {
				if(estadorequisicionAux.getId()!=null && estadorequisicionAux.getId().equals(idEstadoRequisicionSeleccionado)) {
					estadorequisicionTemp=estadorequisicionAux;
					break;
				}
			}

			jComboBoxEstadoRequisicion.setSelectedItem(estadorequisicionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoRequisicionGenerico(JComboBox jComboBoxEstadoRequisicion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoRequisicion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoRequisicion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoRequisicion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoRequisicion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("RequisicionCompra")) {
			jButtonRequisicionCompraActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadorequisicion=(EstadoRequisicion) estadorequisicionLogic.getEstadoRequisicions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadorequisicion =(EstadoRequisicion) estadorequisicions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoRequisicion estadorequisicionRow=new EstadoRequisicion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadorequisicionRow=(EstadoRequisicion) estadorequisicionLogic.getEstadoRequisicions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadorequisicionRow=(EstadoRequisicion) estadorequisicions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonRequisicionCompraActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoRequisicion estadorequisicion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoRequisicion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorequisicionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadorequisicion = (EstadoRequisicion)this.estadorequisicionLogic.getEstadoRequisicions().toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadorequisicion = (EstadoRequisicion)this.estadorequisicions.toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadorequisicion!=null) {
						this.estadorequisicion = estadorequisicion;
					} else {
						this.estadorequisicion = new EstadoRequisicion();
					}
				}

				if(this.isTienePermisosRequisicionCompra && this.permiteMantenimiento(this.estadorequisicion)) {
					RequisicionCompraBeanSwingJInternalFrame requisicioncompraBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFramePopup=new RequisicionCompraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						requisicioncompraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFramePopup;
					} else {
						requisicioncompraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame;
					}

					List<EstadoRequisicion> estadorequisicions=new ArrayList<EstadoRequisicion>();
					estadorequisicions.add(this.estadorequisicion);
					if(!esRelacionado) {
						//requisicioncompraBeanSwingJInternalFrame.requisicioncompraSessionBean.setConGuardarRelaciones(false);
						//requisicioncompraBeanSwingJInternalFrame.requisicioncompraSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					requisicioncompraBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoRequisicion.cargarRequisicionCompraBeanSwingJInternalFrame(estadorequisicions,this.estadorequisicion,requisicioncompraBeanSwingJInternalFrame,/*conInicializar,*/requisicioncompraBeanSwingJInternalFrame.requisicioncompraSessionBean.getConGuardarRelaciones(),requisicioncompraBeanSwingJInternalFrame.requisicioncompraSessionBean.getEsGuardarRelacionado());
					requisicioncompraBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						requisicioncompraBeanSwingJInternalFrame.actualizarEstadoPanelsRequisicionCompra("no_relacionado");

						requisicioncompraBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(RequisicionCompraConstantesFunciones.ITAMANIOFILATABLA + (RequisicionCompraConstantesFunciones.ITAMANIOFILATABLA/2));

						requisicioncompraBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoRequisicion=(TitledBorder)this.jScrollPanelDatosEstadoRequisicion.getBorder();
						TitledBorder titledBorderRequisicionCompra=(TitledBorder)requisicioncompraBeanSwingJInternalFrame.jScrollPanelDatosRequisicionCompra.getBorder();

						titledBorderRequisicionCompra.setTitle(titledBorderEstadoRequisicion.getTitle() + " -> Requisicion Compra");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,requisicioncompraBeanSwingJInternalFrame);
						}

						requisicioncompraBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(requisicioncompraBeanSwingJInternalFrame);

						requisicioncompraBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadorequisicionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Requisicion Compra",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorequisicionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorequisicionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorequisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoRequisicion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoRequisicion.setVisible((this.isVisibilidadCeldaNuevoEstadoRequisicion && this.isPermisoNuevoEstadoRequisicion));			
			this.jButtonDuplicarEstadoRequisicion.setVisible((this.isVisibilidadCeldaDuplicarEstadoRequisicion && this.isPermisoDuplicarEstadoRequisicion));			
			this.jButtonCopiarEstadoRequisicion.setVisible((this.isVisibilidadCeldaCopiarEstadoRequisicion && this.isPermisoCopiarEstadoRequisicion));
			this.jButtonVerFormEstadoRequisicion.setVisible((this.isVisibilidadCeldaVerFormEstadoRequisicion && this.isPermisoVerFormEstadoRequisicion));
			
			this.jButtonAbrirOrderByEstadoRequisicion.setVisible((this.isVisibilidadCeldaOrdenEstadoRequisicion && this.isPermisoOrdenEstadoRequisicion));			
			
			this.jButtonNuevoRelacionesEstadoRequisicion.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoRequisicion && this.isPermisoNuevoEstadoRequisicion));			
			this.jButtonNuevoGuardarCambiosEstadoRequisicion.setVisible((this.isVisibilidadCeldaNuevoEstadoRequisicion && this.isPermisoNuevoEstadoRequisicion && this.isPermisoGuardarCambiosEstadoRequisicion));
			
			if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) {
			this.jInternalFrameDetalleFormEstadoRequisicion.jButtonModificarEstadoRequisicion.setVisible((this.isVisibilidadCeldaModificarEstadoRequisicion && this.isPermisoActualizarEstadoRequisicion));	
			this.jInternalFrameDetalleFormEstadoRequisicion.jButtonActualizarEstadoRequisicion.setVisible((this.isVisibilidadCeldaActualizarEstadoRequisicion && this.isPermisoActualizarEstadoRequisicion));	
			this.jInternalFrameDetalleFormEstadoRequisicion.jButtonEliminarEstadoRequisicion.setVisible((this.isVisibilidadCeldaEliminarEstadoRequisicion && this.isPermisoEliminarEstadoRequisicion));
			this.jInternalFrameDetalleFormEstadoRequisicion.jButtonCancelarEstadoRequisicion.setVisible(this.isVisibilidadCeldaCancelarEstadoRequisicion);							
			this.jInternalFrameDetalleFormEstadoRequisicion.jButtonGuardarCambiosEstadoRequisicion.setVisible((this.isVisibilidadCeldaGuardarEstadoRequisicion && this.isPermisoGuardarCambiosEstadoRequisicion));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoRequisicion.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoRequisicion && this.isPermisoGuardarCambiosEstadoRequisicion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoRequisicion.setVisible((this.isVisibilidadCeldaNuevoEstadoRequisicion && this.isPermisoNuevoEstadoRequisicion));						
			this.jButtonDuplicarToolBarEstadoRequisicion.setVisible((this.isVisibilidadCeldaDuplicarEstadoRequisicion && this.isPermisoDuplicarEstadoRequisicion));						
			this.jButtonCopiarToolBarEstadoRequisicion.setVisible((this.isVisibilidadCeldaCopiarEstadoRequisicion && this.isPermisoCopiarEstadoRequisicion));			
			this.jButtonVerFormToolBarEstadoRequisicion.setVisible((this.isVisibilidadCeldaVerFormEstadoRequisicion && this.isPermisoVerFormEstadoRequisicion));			
			this.jButtonAbrirOrderByToolBarEstadoRequisicion.setVisible((this.isVisibilidadCeldaOrdenEstadoRequisicion && this.isPermisoOrdenEstadoRequisicion));
			this.jButtonNuevoRelacionesToolBarEstadoRequisicion.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoRequisicion && this.isPermisoNuevoEstadoRequisicion));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoRequisicion.setVisible((this.isVisibilidadCeldaNuevoEstadoRequisicion && this.isPermisoNuevoEstadoRequisicion && this.isPermisoGuardarCambiosEstadoRequisicion));			
			
			if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) {
			this.jInternalFrameDetalleFormEstadoRequisicion.jButtonModificarToolBarEstadoRequisicion.setVisible((this.isVisibilidadCeldaModificarEstadoRequisicion && this.isPermisoActualizarEstadoRequisicion));	
			this.jInternalFrameDetalleFormEstadoRequisicion.jButtonActualizarToolBarEstadoRequisicion.setVisible((this.isVisibilidadCeldaActualizarEstadoRequisicion  && this.isPermisoActualizarEstadoRequisicion));	
			this.jInternalFrameDetalleFormEstadoRequisicion.jButtonEliminarToolBarEstadoRequisicion.setVisible((this.isVisibilidadCeldaEliminarEstadoRequisicion && this.isPermisoEliminarEstadoRequisicion));
			this.jInternalFrameDetalleFormEstadoRequisicion.jButtonCancelarToolBarEstadoRequisicion.setVisible(this.isVisibilidadCeldaCancelarEstadoRequisicion);				
			this.jInternalFrameDetalleFormEstadoRequisicion.jButtonGuardarCambiosToolBarEstadoRequisicion.setVisible((this.isVisibilidadCeldaGuardarEstadoRequisicion && this.isPermisoGuardarCambiosEstadoRequisicion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoRequisicion.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoRequisicion && this.isPermisoGuardarCambiosEstadoRequisicion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoRequisicion.setVisible((this.isVisibilidadCeldaNuevoEstadoRequisicion && this.isPermisoNuevoEstadoRequisicion));			
			this.jMenuItemDuplicarEstadoRequisicion.setVisible((this.isVisibilidadCeldaDuplicarEstadoRequisicion && this.isPermisoDuplicarEstadoRequisicion));			
			this.jMenuItemCopiarEstadoRequisicion.setVisible((this.isVisibilidadCeldaCopiarEstadoRequisicion && this.isPermisoCopiarEstadoRequisicion));			
			this.jMenuItemVerFormEstadoRequisicion.setVisible((this.isVisibilidadCeldaVerFormEstadoRequisicion && this.isPermisoVerFormEstadoRequisicion));			
			this.jMenuItemAbrirOrderByEstadoRequisicion.setVisible((this.isVisibilidadCeldaOrdenEstadoRequisicion && this.isPermisoOrdenEstadoRequisicion));			
			//this.jMenuItemMostrarOcultarEstadoRequisicion.setVisible((this.isVisibilidadCeldaOrdenEstadoRequisicion && this.isPermisoOrdenEstadoRequisicion));
			this.jMenuItemDetalleAbrirOrderByEstadoRequisicion.setVisible((this.isVisibilidadCeldaOrdenEstadoRequisicion && this.isPermisoOrdenEstadoRequisicion));			
			//this.jMenuItemDetalleMostrarOcultarEstadoRequisicion.setVisible((this.isVisibilidadCeldaOrdenEstadoRequisicion && this.isPermisoOrdenEstadoRequisicion));			
			this.jMenuItemNuevoRelacionesEstadoRequisicion.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoRequisicion && this.isPermisoNuevoEstadoRequisicion));			
			this.jMenuItemNuevoGuardarCambiosEstadoRequisicion.setVisible((this.isVisibilidadCeldaNuevoEstadoRequisicion && this.isPermisoNuevoEstadoRequisicion && this.isPermisoGuardarCambiosEstadoRequisicion));									
			
			if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) {
			this.jInternalFrameDetalleFormEstadoRequisicion.jMenuItemModificarEstadoRequisicion.setVisible((this.isVisibilidadCeldaModificarEstadoRequisicion && this.isPermisoActualizarEstadoRequisicion));	
			this.jInternalFrameDetalleFormEstadoRequisicion.jMenuItemActualizarEstadoRequisicion.setVisible((this.isVisibilidadCeldaActualizarEstadoRequisicion && this.isPermisoActualizarEstadoRequisicion));	
			this.jInternalFrameDetalleFormEstadoRequisicion.jMenuItemEliminarEstadoRequisicion.setVisible((this.isVisibilidadCeldaEliminarEstadoRequisicion && this.isPermisoEliminarEstadoRequisicion));
			this.jInternalFrameDetalleFormEstadoRequisicion.jMenuItemCancelarEstadoRequisicion.setVisible(this.isVisibilidadCeldaCancelarEstadoRequisicion);				
			}
			
			this.jMenuItemGuardarCambiosEstadoRequisicion.setVisible((this.isVisibilidadCeldaGuardarEstadoRequisicion && this.isPermisoGuardarCambiosEstadoRequisicion));						
			this.jMenuItemGuardarCambiosTablaEstadoRequisicion.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoRequisicion && this.isPermisoGuardarCambiosEstadoRequisicion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoRequisicion=this.jButtonNuevoEstadoRequisicion.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoRequisicion=this.jButtonDuplicarEstadoRequisicion.isVisible();
			this.isVisibilidadCeldaCopiarEstadoRequisicion=this.jButtonCopiarEstadoRequisicion.isVisible();
			this.isVisibilidadCeldaVerFormEstadoRequisicion=this.jButtonVerFormEstadoRequisicion.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoRequisicion=this.jButtonAbrirOrderByEstadoRequisicion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoRequisicion=this.jButtonNuevoRelacionesEstadoRequisicion.isVisible();
			this.isVisibilidadCeldaModificarEstadoRequisicion=this.jButtonModificarEstadoRequisicion.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) {
			this.isVisibilidadCeldaActualizarEstadoRequisicion=this.jInternalFrameDetalleFormEstadoRequisicion.jButtonActualizarEstadoRequisicion.isVisible();
			this.isVisibilidadCeldaEliminarEstadoRequisicion=this.jInternalFrameDetalleFormEstadoRequisicion.jButtonEliminarEstadoRequisicion.isVisible();
			this.isVisibilidadCeldaCancelarEstadoRequisicion=this.jInternalFrameDetalleFormEstadoRequisicion.jButtonCancelarEstadoRequisicion.isVisible();
			this.isVisibilidadCeldaGuardarEstadoRequisicion=this.jInternalFrameDetalleFormEstadoRequisicion.jButtonGuardarCambiosEstadoRequisicion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoRequisicion=this.jButtonGuardarCambiosTablaEstadoRequisicion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoRequisicion=this.jButtonNuevoToolBarEstadoRequisicion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoRequisicion=this.jButtonNuevoRelacionesToolBarEstadoRequisicion.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) {
			this.isVisibilidadCeldaModificarEstadoRequisicion=this.jInternalFrameDetalleFormEstadoRequisicion.jButtonModificarToolBarEstadoRequisicion.isVisible();
			this.isVisibilidadCeldaActualizarEstadoRequisicion=this.jInternalFrameDetalleFormEstadoRequisicion.jButtonActualizarToolBarEstadoRequisicion.isVisible();
			this.isVisibilidadCeldaEliminarEstadoRequisicion=this.jInternalFrameDetalleFormEstadoRequisicion.jButtonEliminarToolBarEstadoRequisicion.isVisible();
			this.isVisibilidadCeldaCancelarEstadoRequisicion=this.jInternalFrameDetalleFormEstadoRequisicion.jButtonCancelarToolBarEstadoRequisicion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoRequisicion=this.jButtonGuardarCambiosToolBarEstadoRequisicion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoRequisicion=this.jButtonGuardarCambiosTablaToolBarEstadoRequisicion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoRequisicion=this.jMenuItemNuevoEstadoRequisicion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoRequisicion=this.jMenuItemNuevoRelacionesEstadoRequisicion.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) {
			this.isVisibilidadCeldaModificarEstadoRequisicion=this.jInternalFrameDetalleFormEstadoRequisicion.jMenuItemModificarEstadoRequisicion.isVisible();
			this.isVisibilidadCeldaActualizarEstadoRequisicion=this.jInternalFrameDetalleFormEstadoRequisicion.jMenuItemActualizarEstadoRequisicion.isVisible();
			this.isVisibilidadCeldaEliminarEstadoRequisicion=this.jInternalFrameDetalleFormEstadoRequisicion.jMenuItemEliminarEstadoRequisicion.isVisible();
			this.isVisibilidadCeldaCancelarEstadoRequisicion=this.jInternalFrameDetalleFormEstadoRequisicion.jMenuItemCancelarEstadoRequisicion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoRequisicion=this.jMenuItemGuardarCambiosEstadoRequisicion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoRequisicion=this.jMenuItemGuardarCambiosTablaEstadoRequisicion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoRequisicion(Boolean esInicializar) {
		if(EstadoRequisicionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadorequisicionSessionBean.getConGuardarRelaciones()) {
				//if(this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoRequisicion();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoRequisicion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoRequisicion() {
		this.jButtonNuevoEstadoRequisicion.setVisible(this.isPermisoNuevoEstadoRequisicion);			
		this.jButtonDuplicarEstadoRequisicion.setVisible(this.isPermisoDuplicarEstadoRequisicion);			
		this.jButtonCopiarEstadoRequisicion.setVisible(this.isPermisoCopiarEstadoRequisicion);			
		this.jButtonVerFormEstadoRequisicion.setVisible(this.isPermisoVerFormEstadoRequisicion);			
		
		this.jButtonAbrirOrderByEstadoRequisicion.setVisible(this.isPermisoOrdenEstadoRequisicion);					
		
		this.jButtonNuevoRelacionesEstadoRequisicion.setVisible(this.isPermisoNuevoEstadoRequisicion);			
		
		if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRequisicion.jButtonModificarEstadoRequisicion.setVisible(this.isPermisoActualizarEstadoRequisicion);	
			this.jInternalFrameDetalleFormEstadoRequisicion.jButtonActualizarEstadoRequisicion.setVisible(this.isPermisoActualizarEstadoRequisicion);	
			this.jInternalFrameDetalleFormEstadoRequisicion.jButtonEliminarEstadoRequisicion.setVisible(this.isPermisoEliminarEstadoRequisicion);
			this.jInternalFrameDetalleFormEstadoRequisicion.jButtonCancelarEstadoRequisicion.setVisible(this.isVisibilidadCeldaCancelarEstadoRequisicion);						
			this.jInternalFrameDetalleFormEstadoRequisicion.jButtonGuardarCambiosEstadoRequisicion.setVisible(this.isPermisoGuardarCambiosEstadoRequisicion);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoRequisicion.setVisible(this.isPermisoActualizarEstadoRequisicion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoRequisicion() {
		this.jInternalFrameDetalleFormEstadoRequisicion.jButtonModificarEstadoRequisicion.setVisible(this.isPermisoActualizarEstadoRequisicion);	
		this.jInternalFrameDetalleFormEstadoRequisicion.jButtonActualizarEstadoRequisicion.setVisible(this.isPermisoActualizarEstadoRequisicion);	
		this.jInternalFrameDetalleFormEstadoRequisicion.jButtonEliminarEstadoRequisicion.setVisible(this.isPermisoEliminarEstadoRequisicion);
		this.jInternalFrameDetalleFormEstadoRequisicion.jButtonCancelarEstadoRequisicion.setVisible(this.isVisibilidadCeldaCancelarEstadoRequisicion);							
		this.jInternalFrameDetalleFormEstadoRequisicion.jButtonGuardarCambiosEstadoRequisicion.setVisible((this.isVisibilidadCeldaGuardarEstadoRequisicion && this.isPermisoGuardarCambiosEstadoRequisicion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoRequisicion() {
		if(EstadoRequisicionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoRequisicion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoRequisicion() {
	}
	
	public void jTableDatosEstadoRequisicionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoRequisicion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorequisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoRequisicion(this.getestadorequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRequisicion(this.estadorequisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadorequisicion =(EstadoRequisicion) this.estadorequisicionLogic.getEstadoRequisicions().toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadorequisicion =(EstadoRequisicion) this.estadorequisicions.toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadorequisicion==null) {
						this.estadorequisicion = new EstadoRequisicion();
					}

					this.setVariablesFormularioToObjetoActualEstadoRequisicion(this.estadorequisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRequisicion(this.estadorequisicion);
				}

				if(this.estadorequisicion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadorequisicion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorequisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorequisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorequisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorequisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoRequisicion(this.getestadorequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRequisicion(this.estadorequisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadorequisicion =(EstadoRequisicion) this.estadorequisicionLogic.getEstadoRequisicions().toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadorequisicion =(EstadoRequisicion) this.estadorequisicions.toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadorequisicion==null) {
						this.estadorequisicion = new EstadoRequisicion();
					}

					this.setVariablesFormularioToObjetoActualEstadoRequisicion(this.estadorequisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRequisicion(this.estadorequisicion);
				}

				if(this.estadorequisicion.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadorequisicion.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorequisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorequisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorequisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorequisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoRequisicion(this.getestadorequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRequisicion(this.estadorequisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadorequisicion =(EstadoRequisicion) this.estadorequisicionLogic.getEstadoRequisicions().toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadorequisicion =(EstadoRequisicion) this.estadorequisicions.toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadorequisicion==null) {
						this.estadorequisicion = new EstadoRequisicion();
					}

					this.setVariablesFormularioToObjetoActualEstadoRequisicion(this.estadorequisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRequisicion(this.estadorequisicion);
				}

				if(this.estadorequisicion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadorequisicion.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorequisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorequisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorequisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoRequisicion() {
		if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) {
			this.jInternalFrameDetalleFormEstadoRequisicion.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoRequisicion.dispose();
			this.jInternalFrameDetalleFormEstadoRequisicion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoRequisicion!=null) {
			this.jInternalFrameReporteDinamicoEstadoRequisicion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoRequisicion.dispose();
			this.jInternalFrameReporteDinamicoEstadoRequisicion=null;
		}
		
		if(this.jInternalFrameImportacionEstadoRequisicion!=null) {
			this.jInternalFrameImportacionEstadoRequisicion.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoRequisicion.dispose();
			this.jInternalFrameImportacionEstadoRequisicion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoRequisicion();
			
			EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoRequisicion")) {
				jButtonNuevoEstadoRequisicionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoRequisicion")) {
				jButtonDuplicarEstadoRequisicionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoRequisicion")) {
				jButtonCopiarEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoRequisicion")) {
				jButtonVerFormEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoRequisicion")) {
				jButtonNuevoEstadoRequisicionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoRequisicion")) {
				jButtonDuplicarEstadoRequisicionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoRequisicion")) {
				jButtonNuevoEstadoRequisicionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoRequisicion")) {
				jButtonDuplicarEstadoRequisicionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoRequisicion")) {
				jButtonNuevoEstadoRequisicionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoRequisicion")) {
				jButtonNuevoEstadoRequisicionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoRequisicion")) {
				jButtonNuevoEstadoRequisicionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoRequisicion")) {
				jButtonModificarEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoRequisicion")) {
				jButtonModificarEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoRequisicion")) {
				jButtonModificarEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoRequisicion")) {
				jButtonActualizarEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoRequisicion")) {
				jButtonActualizarEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoRequisicion")) {
				jButtonActualizarEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoRequisicion")) {
				jButtonEliminarEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoRequisicion")) {
				jButtonEliminarEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoRequisicion")) {
				jButtonEliminarEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoRequisicion")) {
				jButtonCancelarEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoRequisicion")) {
				jButtonCancelarEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoRequisicion")) {
				jButtonCancelarEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoRequisicion")) {
				jButtonCerrarEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoRequisicion")) {
				jButtonCerrarEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoRequisicion")) {
				jButtonCerrarEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoRequisicion")) {
				jButtonMostrarOcultarEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoRequisicion")) {
				jButtonCancelarEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoRequisicion")) {
				jButtonGuardarCambiosEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoRequisicion")) {
				jButtonGuardarCambiosEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoRequisicion")) {
				jButtonCopiarEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoRequisicion")) {
				jButtonVerFormEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoRequisicion")) {
				jButtonGuardarCambiosEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoRequisicion")) {
				jButtonCopiarEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoRequisicion")) {
				jButtonVerFormEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoRequisicion")) {
				jButtonGuardarCambiosEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoRequisicion")) {
				jButtonGuardarCambiosEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoRequisicion")) {
				jButtonGuardarCambiosEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoRequisicion")) {
				jButtonRecargarInformacionEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoRequisicion")) {
				jButtonRecargarInformacionEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoRequisicion")) {
				jButtonRecargarInformacionEstadoRequisicionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoRequisicion")) {
				jButtonAnterioresEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoRequisicion")) {
				jButtonAnterioresEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoRequisicion")) {
				jButtonAnterioresEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoRequisicion")) {
				jButtonSiguientesEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoRequisicion")) {
				jButtonSiguientesEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoRequisicion")) {
				jButtonSiguientesEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoRequisicion") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoRequisicion")) {
				jButtonAbrirOrderByEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoRequisicion") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoRequisicion")) {
				jButtonMostrarOcultarEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoRequisicion")) {
				jButtonNuevoGuardarCambiosEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoRequisicion")) {
				jButtonNuevoGuardarCambiosEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoRequisicion")) {
				jButtonNuevoGuardarCambiosEstadoRequisicionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoRequisicion")) {
				jButtonCerrarReporteDinamicoEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoRequisicion")) {
				jButtonGenerarReporteDinamicoEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoRequisicion")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoRequisicion")) {
				jButtonCerrarImportacionEstadoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoRequisicion")) {
				
				jButtonGenerarImportacionEstadoRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoRequisicion")) {
				
				jButtonAbrirImportacionEstadoRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoRequisicion")) {
				jComboBoxTiposAccionesEstadoRequisicionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoRequisicion")) {
				jComboBoxTiposRelacionesEstadoRequisicionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoRequisicion")) {
				jComboBoxTiposAccionesEstadoRequisicionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoRequisicion")) {
				
				jComboBoxTiposSeleccionarEstadoRequisicionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoRequisicion")) {
				jTextFieldValorCampoGeneralEstadoRequisicionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoRequisicion")) {
				jButtonAbrirOrderByEstadoRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoRequisicion")) {
				jButtonAbrirOrderByEstadoRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoRequisicion")) {
				jButtonCerrarOrderByEstadoRequisicionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoRequisicionBusqueda")) {
				this.jButtonidEstadoRequisicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoRequisicionBusqueda")) {
				this.jButtoncodigoEstadoRequisicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoRequisicionBusqueda")) {
				this.jButtonnombreEstadoRequisicionBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoRequisicion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoRequisicionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadorequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadorequisicion);
				
				EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
				
				


				
				EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRequisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRequisicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoRequisicion estadorequisicionLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadorequisicionLocal=this.estadorequisicion;
			} else {
				estadorequisicionLocal=this.estadorequisicionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadorequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadorequisicion);
				
				EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
							
				
				


				
				EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRequisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRequisicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRequisicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoRequisicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorequisicionAnterior =(EstadoRequisicion) this.estadorequisicionLogic.getEstadoRequisicions().toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadorequisicionAnterior =(EstadoRequisicion) this.estadorequisicions.toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
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
			
			EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
			
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
			
			


			
			EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoRequisicionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadorequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadorequisicion);
				
				EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
								
						
				


				
				EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRequisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRequisicion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadorequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadorequisicion);
				
				EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
								
				
				


				
				EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRequisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRequisicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRequisicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoRequisicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorequisicionAnterior =(EstadoRequisicion) this.estadorequisicionLogic.getEstadoRequisicions().toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadorequisicionAnterior =(EstadoRequisicion) this.estadorequisicions.toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadorequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadorequisicion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRequisicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoRequisicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorequisicionAnterior =(EstadoRequisicion) this.estadorequisicionLogic.getEstadoRequisicions().toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadorequisicionAnterior =(EstadoRequisicion) this.estadorequisicions.toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRequisicionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadorequisicion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadorequisicion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadorequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadorequisicion);
				
				EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
							
				
				


				
				EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRequisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRequisicion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoRequisicionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoRequisicion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadorequisicionAnterior =(EstadoRequisicion) this.estadorequisicionLogic.getEstadoRequisicions().toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadorequisicionAnterior =(EstadoRequisicion) this.estadorequisicions.toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
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
			
			EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
			
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
			
			


			
			EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRequisicionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadorequisicion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadorequisicion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadorequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadorequisicion);
				
				EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
								
				
				


				
				EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRequisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRequisicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRequisicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoRequisicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorequisicionAnterior =(EstadoRequisicion) this.estadorequisicionLogic.getEstadoRequisicions().toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadorequisicionAnterior =(EstadoRequisicion) this.estadorequisicions.toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRequisicionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadorequisicion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadorequisicion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoRequisicionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadorequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadorequisicion);
				
				EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoRequisicion")) {
					jCheckBoxSeleccionarTodosEstadoRequisicionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoRequisicion")) {
					jCheckBoxSeleccionadosEstadoRequisicionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoRequisicion")) {
					
				}
				
				


				
				
				EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRequisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRequisicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadorequisicion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadorequisicion);
				
				EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
												
				
				


				
				
				EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRequisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRequisicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoRequisicionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoRequisicion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadorequisicionAnterior =(EstadoRequisicion) this.estadorequisicionLogic.getEstadoRequisicions().toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadorequisicionAnterior =(EstadoRequisicion) this.estadorequisicions.toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoRequisicionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadorequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadorequisicion);
				
				EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
				
				
				EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
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
			
			EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
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
			
			


			
			EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoRequisicionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadorequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadorequisicion);
				
				EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRequisicion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRequisicion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadorequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadorequisicion);
				
				EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
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
				
				


				
				EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRequisicion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRequisicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRequisicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoRequisicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorequisicionAnterior =(EstadoRequisicion) this.estadorequisicionLogic.getEstadoRequisicions().toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadorequisicionAnterior =(EstadoRequisicion) this.estadorequisicions.toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoRequisicion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoRequisicionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoRequisicion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadorequisicion =(EstadoRequisicion) this.estadorequisicionLogic.getEstadoRequisicions().toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadorequisicion =(EstadoRequisicion) this.estadorequisicions.toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadorequisicion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoRequisicion")) {
				
				}
				
				EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoRequisicion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoRequisicion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoRequisicion")) {
			
			}
			
			EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoRequisicion();
			
			EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoRequisicion")) {
				jButtonNuevoEstadoRequisicionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoRequisicion")) {
				jButtonDuplicarEstadoRequisicionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoRequisicion")) {
				jButtonCopiarEstadoRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoRequisicion")) {
				jButtonVerFormEstadoRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoRequisicion")) {
				jButtonNuevoEstadoRequisicionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoRequisicion")) {
				jButtonModificarEstadoRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoRequisicion")) {
				jButtonActualizarEstadoRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoRequisicion")) {
				jButtonEliminarEstadoRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoRequisicion")) {
				jButtonGuardarCambiosEstadoRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoRequisicion")) {
				jButtonCancelarEstadoRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoRequisicion")) {
				jButtonCerrarEstadoRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoRequisicion")) {
				jButtonGuardarCambiosEstadoRequisicionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoRequisicion")) {
				jButtonNuevoGuardarCambiosEstadoRequisicionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoRequisicion")) {
				jButtonAbrirOrderByEstadoRequisicionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoRequisicion")) {
				jButtonRecargarInformacionEstadoRequisicionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoRequisicion")) {
				jButtonAnterioresEstadoRequisicionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoRequisicion")) {
				jButtonSiguientesEstadoRequisicionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoRequisicionBusqueda")) {
				this.jButtonidEstadoRequisicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoRequisicionBusqueda")) {
				this.jButtoncodigoEstadoRequisicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoRequisicionBusqueda")) {
				this.jButtonnombreEstadoRequisicionBusquedaActionPerformed(evt);
			}
			
			EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoRequisicion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoRequisicion")) {
				closingInternalFrameEstadoRequisicion();
				
			} else if(sTipo.equals("jButtonCancelarEstadoRequisicion")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoRequisicion = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoRequisicionBeanSwingJInternalFrame jInternalFrameParent=(EstadoRequisicionBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoRequisicion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoRequisicionActionPerformed(null);
			}
			
			EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadorequisicion,new Object(),this.estadorequisicionParameterGeneral,this.estadorequisicionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoRequisicion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoRequisicion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoRequisicion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadorequisicion)) {
			if(!esControlTabla) {
				if(EstadoRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoRequisicion(this.estadorequisicion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRequisicion(this.estadorequisicion);			
				}
				
				if(this.estadorequisicionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoRequisicion(this.estadorequisicion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadorequisicionReturnGeneral=estadorequisicionLogic.procesarEventosEstadoRequisicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadorequisicionLogic.getEstadoRequisicions(),this.estadorequisicion,this.estadorequisicionParameterGeneral,this.isEsNuevoEstadoRequisicion,classes);//this.estadorequisicionLogic.getEstadoRequisicion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoRequisicion(this.estadorequisicionReturnGeneral,this.estadorequisicionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadorequisicionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoRequisicion(classes,this.estadorequisicionReturnGeneral,this.estadorequisicionBean,false);
					}
						
					if(this.estadorequisicionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoRequisicion(this.estadorequisicionReturnGeneral.getEstadoRequisicion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoRequisicion(this.estadorequisicionReturnGeneral.getEstadoRequisicion());	
					}
						
					if(this.estadorequisicionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoRequisicion(this.estadorequisicionReturnGeneral.getEstadoRequisicion(),classes);//this.estadorequisicionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoRequisicion(this.estadorequisicion,classes);//this.estadorequisicionBean);									
				}
			
				if(EstadoRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoRequisicion(this.estadorequisicion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRequisicion(this.estadorequisicion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadorequisicionAnterior!=null) {
						this.estadorequisicion=this.estadorequisicionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadorequisicionReturnGeneral=estadorequisicionLogic.procesarEventosEstadoRequisicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadorequisicionLogic.getEstadoRequisicions(),this.estadorequisicion,this.estadorequisicionParameterGeneral,this.isEsNuevoEstadoRequisicion,classes);//this.estadorequisicionLogic.getEstadoRequisicion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadorequisicionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadorequisicionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadorequisicionReturnGeneral.getEstadoRequisicion(),estadorequisicionLogic.getEstadoRequisicions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadorequisicionReturnGeneral.getEstadoRequisicion(),this.estadorequisicions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoRequisicion.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoRequisicion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoRequisicion();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoRequisicion() throws Exception {
		
		EstadoRequisicionModel estadorequisicionModel=(EstadoRequisicionModel)this.jTableDatosEstadoRequisicion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadorequisicionModel.estadorequisicions=this.estadorequisicionLogic.getEstadoRequisicions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadorequisicionModel.estadorequisicions=this.estadorequisicions;
		}
		
		
		((EstadoRequisicionModel) this.jTableDatosEstadoRequisicion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoRequisicion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadorequisicionAnterior(),this.estadorequisicionLogic.getEstadoRequisicions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadorequisicionAnterior(),this.estadorequisicions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoRequisicion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoRequisicion(EstadoRequisicion estadorequisicion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(RequisicionCompra.class)) {
					this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncompraLogic.setRequisicionCompras(estadorequisicion.getRequisicionCompraCompras());
					this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaRequisicionCompra(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
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
										
				EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadorequisicion,new Object(),generalEntityParameterGeneral,this.estadorequisicionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadorequisicionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoRequisicionConstantesFunciones.getClassesRelationshipsOfEstadoRequisicion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoRequisicionConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoRequisicion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoRequisicion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadorequisicion,new Object(),generalEntityParameterGeneral,this.estadorequisicionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoRequisicion(EstadoRequisicionBean estadorequisicionBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(RequisicionCompra.class)) {
					this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncompraLogic.setRequisicionCompras(estadorequisicion.getRequisicionCompraCompras());
					this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaRequisicionCompra(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoRequisicion(ArrayList<Classe> classes,EstadoRequisicionReturnGeneral estadorequisicionReturnGeneral,EstadoRequisicionBean estadorequisicionBean,Boolean conDefault) throws Exception {
		
			this.estadorequisicionBean.setRequisicionCompras(estadorequisicionReturnGeneral.getEstadoRequisicion().getRequisicionCompras());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoRequisicion(EstadoRequisicion estadorequisicion,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(RequisicionCompra.class)) {
					estadorequisicion.setRequisicionCompraCompras(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraBeanSwingJInternalFrame.requisicioncompraLogic.getRequisicionCompras());
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
		if(!paraTabla && !this.permiteMantenimiento(this.estadorequisicion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoRequisicion = new EstadoRequisicionDetalleFormJInternalFrame(jDesktopPane,this.estadorequisicionSessionBean.getConGuardarRelaciones(),this.estadorequisicionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoRequisicion);
		this.jInternalFrameDetalleFormEstadoRequisicion.setVisible(false);
		this.jInternalFrameDetalleFormEstadoRequisicion.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoRequisicion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoRequisicion.estadorequisicionLogic=this.estadorequisicionLogic;
		
		this.cargarCombosFrameForeignKeyEstadoRequisicion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoRequisicion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoRequisicion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoRequisicion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoRequisicion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoRequisicion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoRequisicion"));
		
		this.jInternalFrameDetalleFormEstadoRequisicion.jButtonModificarEstadoRequisicion.addActionListener(new ButtonActionListener(this,"ModificarEstadoRequisicion"));

		
		this.jInternalFrameDetalleFormEstadoRequisicion.jButtonModificarToolBarEstadoRequisicion.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoRequisicion"));
					
		this.jInternalFrameDetalleFormEstadoRequisicion.jMenuItemModificarEstadoRequisicion.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoRequisicion"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoRequisicion.jButtonActualizarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"ActualizarEstadoRequisicion"));
		
		
		this.jInternalFrameDetalleFormEstadoRequisicion.jButtonActualizarToolBarEstadoRequisicion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoRequisicion"));
						
		this.jInternalFrameDetalleFormEstadoRequisicion.jMenuItemActualizarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoRequisicion"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoRequisicion.jButtonEliminarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"EliminarEstadoRequisicion"));
		
		
		this.jInternalFrameDetalleFormEstadoRequisicion.jButtonEliminarToolBarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoRequisicion"));
								
		this.jInternalFrameDetalleFormEstadoRequisicion.jMenuItemEliminarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoRequisicion"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoRequisicion.jButtonCancelarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"CancelarEstadoRequisicion"));
		
		
		this.jInternalFrameDetalleFormEstadoRequisicion.jButtonCancelarToolBarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoRequisicion"));
					
		this.jInternalFrameDetalleFormEstadoRequisicion.jMenuItemCancelarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoRequisicion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoRequisicion.jMenuItemDetalleCerrarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoRequisicion"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoRequisicion.jButtonGuardarCambiosToolBarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoRequisicion"));
		
		
		
		this.jInternalFrameDetalleFormEstadoRequisicion.jButtonGuardarCambiosToolBarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoRequisicion"));
		
		
		
		this.jInternalFrameDetalleFormEstadoRequisicion.jComboBoxTiposAccionesFormularioEstadoRequisicion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoRequisicion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRequisicion.jButtonidEstadoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRequisicion.jButtoncodigoEstadoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRequisicion.jButtonnombreEstadoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoRequisicionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoRequisicion.jTabbedPaneRelacionesEstadoRequisicion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoRequisicion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoRequisicion"));
		
		if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRequisicion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoRequisicion"));
		}
		
		this.jTableDatosEstadoRequisicion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoRequisicion"));
		
		this.jTableDatosEstadoRequisicion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoRequisicion"));
		
		this.jButtonNuevoEstadoRequisicion.addActionListener(new ButtonActionListener(this,"NuevoEstadoRequisicion"));
		
		this.jButtonDuplicarEstadoRequisicion.addActionListener(new ButtonActionListener(this,"DuplicarEstadoRequisicion"));
		
		this.jButtonCopiarEstadoRequisicion.addActionListener(new ButtonActionListener(this,"CopiarEstadoRequisicion"));
		
		this.jButtonVerFormEstadoRequisicion.addActionListener(new ButtonActionListener(this,"VerFormEstadoRequisicion"));
		
		
		this.jButtonNuevoToolBarEstadoRequisicion.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoRequisicion"));
			
		this.jButtonDuplicarToolBarEstadoRequisicion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoRequisicion"));
			
		this.jMenuItemNuevoEstadoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoRequisicion"));
			
		this.jMenuItemDuplicarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoRequisicion"));		
		
		
		this.jButtonNuevoRelacionesEstadoRequisicion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoRequisicion"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoRequisicion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoRequisicion"));
			
		this.jMenuItemNuevoRelacionesEstadoRequisicion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoRequisicion"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRequisicion.jButtonModificarEstadoRequisicion.addActionListener(new ButtonActionListener(this,"ModificarEstadoRequisicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRequisicion.jButtonModificarToolBarEstadoRequisicion.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoRequisicion"));
			
			this.jInternalFrameDetalleFormEstadoRequisicion.jMenuItemModificarEstadoRequisicion.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoRequisicion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoRequisicion.jButtonActualizarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"ActualizarEstadoRequisicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRequisicion.jButtonActualizarToolBarEstadoRequisicion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoRequisicion"));
				
			this.jInternalFrameDetalleFormEstadoRequisicion.jMenuItemActualizarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoRequisicion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRequisicion.jButtonEliminarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"EliminarEstadoRequisicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRequisicion.jButtonEliminarToolBarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoRequisicion"));
						
			this.jInternalFrameDetalleFormEstadoRequisicion.jMenuItemEliminarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoRequisicion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRequisicion.jButtonCancelarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"CancelarEstadoRequisicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRequisicion.jButtonCancelarToolBarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoRequisicion"));
			
			this.jInternalFrameDetalleFormEstadoRequisicion.jMenuItemCancelarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoRequisicion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoRequisicion"));		
		
		
		this.jButtonCerrarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"CerrarEstadoRequisicion"));
		
		
		this.jButtonCerrarToolBarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoRequisicion"));
			
		this.jMenuItemCerrarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoRequisicion"));
			
		if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRequisicion.jMenuItemDetalleCerrarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoRequisicion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRequisicion.jButtonGuardarCambiosEstadoRequisicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoRequisicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRequisicion.jButtonGuardarCambiosToolBarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoRequisicion"));
		}
		
		this.jButtonCopiarToolBarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoRequisicion"));
			
		this.jButtonVerFormToolBarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoRequisicion"));
		
		this.jMenuItemGuardarCambiosEstadoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoRequisicion"));
			
		this.jMenuItemCopiarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoRequisicion"));		
		
		this.jMenuItemVerFormEstadoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoRequisicion"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoRequisicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoRequisicion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoRequisicion"));
			
		this.jMenuItemGuardarCambiosTablaEstadoRequisicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoRequisicion"));		
		
		
		
		this.jButtonRecargarInformacionEstadoRequisicion.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoRequisicion"));
					
		this.jButtonRecargarInformacionToolBarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoRequisicion"));
		
		this.jMenuItemRecargarInformacionEstadoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoRequisicion"));		
		
		
		
		this.jButtonAnterioresEstadoRequisicion.addActionListener (new ButtonActionListener(this,"AnterioresEstadoRequisicion"));
		
		
		this.jButtonAnterioresToolBarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoRequisicion"));
		
		this.jMenuItemAnterioresEstadoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoRequisicion"));		
		
		
		this.jButtonSiguientesEstadoRequisicion.addActionListener (new ButtonActionListener(this,"SiguientesEstadoRequisicion"));
		
		
		this.jButtonSiguientesToolBarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoRequisicion"));
			
		this.jMenuItemSiguientesEstadoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoRequisicion"));
			
		this.jMenuItemAbrirOrderByEstadoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoRequisicion"));
			
		this.jMenuItemMostrarOcultarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoRequisicion"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoRequisicion"));
			
		this.jMenuItemDetalleMostarOcultarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoRequisicion"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoRequisicion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoRequisicion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoRequisicion"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoRequisicion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoRequisicion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoRequisicion"));

		this.jCheckBoxSeleccionadosEstadoRequisicion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoRequisicion"));
		
		if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRequisicion.jComboBoxTiposAccionesFormularioEstadoRequisicion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoRequisicion"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoRequisicion.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoRequisicion"));
			
		this.jComboBoxTiposAccionesEstadoRequisicion.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoRequisicion"));
					
		this.jComboBoxTiposSeleccionarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoRequisicion"));
			
		this.jTextFieldValorCampoGeneralEstadoRequisicion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoRequisicion"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRequisicion.jButtonidEstadoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRequisicion.jButtoncodigoEstadoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRequisicion.jButtonnombreEstadoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoRequisicionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoRequisicion!=null) {
				this.jInternalFrameReporteDinamicoEstadoRequisicion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoRequisicion"));
				this.jInternalFrameReporteDinamicoEstadoRequisicion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoRequisicion"));
				this.jInternalFrameReporteDinamicoEstadoRequisicion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoRequisicion"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoRequisicion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoRequisicion"));				
			//this.jButtonGenerarReporteDinamicoEstadoRequisicion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoRequisicion"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoRequisicion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoRequisicion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoRequisicion!=null) {
				this.jInternalFrameImportacionEstadoRequisicion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoRequisicion"));
				this.jInternalFrameImportacionEstadoRequisicion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoRequisicion"));
				this.jInternalFrameImportacionEstadoRequisicion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoRequisicion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoRequisicion.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoRequisicion"));
			
			this.jButtonAbrirOrderByToolBarEstadoRequisicion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoRequisicion"));			
			
			if(this.jInternalFrameOrderByEstadoRequisicion!=null) {
				this.jInternalFrameOrderByEstadoRequisicion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoRequisicion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRequisicion.jTabbedPaneRelacionesEstadoRequisicion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoRequisicion"));
		
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
            		closingInternalFrameEstadoRequisicion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoRequisicion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoRequisicion = (JInternalFrameBase)event.getSource();
	            	
	            EstadoRequisicionBeanSwingJInternalFrame jInternalFrameParent=(EstadoRequisicionBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoRequisicion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoRequisicionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoRequisicion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoRequisicionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoRequisicion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoRequisicion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoRequisicionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoRequisicionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoRequisicionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoRequisicion";
		inputMap = this.jButtonNuevoEstadoRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoRequisicionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoRequisicionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoRequisicionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoRequisicionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoRequisicion";
		inputMap = this.jButtonNuevoRelacionesEstadoRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoRequisicionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoRequisicion";
		inputMap = this.jButtonModificarEstadoRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoRequisicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoRequisicion";
		inputMap = this.jButtonActualizarEstadoRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoRequisicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoRequisicion";
		inputMap = this.jButtonEliminarEstadoRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoRequisicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoRequisicion";
		inputMap = this.jButtonCancelarEstadoRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoRequisicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoRequisicion";
		inputMap = this.jButtonCerrarEstadoRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoRequisicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoRequisicion.jButtonGuardarCambiosEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoRequisicion";
		inputMap = this.jInternalFrameDetalleFormEstadoRequisicion.jButtonGuardarCambiosEstadoRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoRequisicion.jButtonGuardarCambiosEstadoRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoRequisicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoRequisicion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoRequisicionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoRequisicion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoRequisicionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoRequisicion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoRequisicionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoRequisicion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoRequisicionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRequisicion.jButtonidEstadoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRequisicion.jButtoncodigoEstadoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRequisicion.jButtonnombreEstadoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoRequisicionBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoRequisicionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoRequisicion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoRequisicion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoRequisicion estadorequisicionAux:this.estadorequisicionLogic.getEstadoRequisicions()) {
					estadorequisicionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoRequisicion estadorequisicionAux:estadorequisicions) {
					estadorequisicionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoRequisicionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoRequisicion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoRequisicion estadorequisicionAux:this.estadorequisicionLogic.getEstadoRequisicions()) {
						estadorequisicionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoRequisicion estadorequisicionAux:estadorequisicions) {
						estadorequisicionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoRequisicion estadorequisicionAux:this.estadorequisicionLogic.getEstadoRequisicions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoRequisicion estadorequisicionAux:estadorequisicions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoRequisicion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoRequisicion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoRequisicion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoRequisicion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoRequisicionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoRequisicion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoRequisicion.getSelectedRows();
			
			EstadoRequisicion estadorequisicionLocal=new EstadoRequisicion();
			
			//this.seleccionarTodosEstadoRequisicion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadorequisicionLocal =(EstadoRequisicion) this.estadorequisicionLogic.getEstadoRequisicions().toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadorequisicionLocal =(EstadoRequisicion) this.estadorequisicions.toArray()[this.jTableDatosEstadoRequisicion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadorequisicionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoRequisicion estadorequisicionAux:this.estadorequisicionLogic.getEstadoRequisicions()) {
						estadorequisicionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoRequisicion estadorequisicionAux:estadorequisicions) {
						estadorequisicionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoRequisicion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoRequisicion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoRequisicion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoRequisicion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoRequisicionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoRequisicionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoRequisicionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoRequisicion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoRequisicion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoRequisicion estadorequisicionAux:this.estadorequisicionLogic.getEstadoRequisicions()) {
				
						if(sTipoSeleccionar.equals(EstadoRequisicionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadorequisicionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoRequisicionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadorequisicionAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoRequisicion estadorequisicionAux:estadorequisicions) {
					
						if(sTipoSeleccionar.equals(EstadoRequisicionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadorequisicionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoRequisicionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadorequisicionAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoRequisicion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoRequisicionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoRequisicion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoRequisicion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoRequisicion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoRequisicion.jComboBoxTiposAccionesFormularioEstadoRequisicion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoRequisicion) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoRequisicion(conSplash);
				
					this.generarReporteEstadoRequisicionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoRequisicion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoRequisicion.jComboBoxTiposAccionesFormularioEstadoRequisicion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoRequisicionsSeleccionados();
				//this.jComboBoxTiposAccionesEstadoRequisicion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoRequisicionsSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoRequisicion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoRequisicionsSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoRequisicion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoRequisicion();
				
				this.exportarEstadoRequisicionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoRequisicion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoRequisicion.jComboBoxTiposAccionesFormularioEstadoRequisicion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoRequisicions();
				//this.importarEstadoRequisicions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoRequisicion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoRequisicion.jComboBoxTiposAccionesFormularioEstadoRequisicion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoRequisicion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoRequisicionsSeleccionados();
				//this.jComboBoxTiposAccionesEstadoRequisicion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Requisicion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoRequisicion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoRequisicion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoRequisicion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Requisicion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoRequisicion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoRequisicion.jComboBoxTiposAccionesFormularioEstadoRequisicion.setSelectedIndex(0);					
				}	
			} 			
			else if(EstadoRequisicionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEstadoRequisicion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEstadoRequisicion(conSplash);
					
						//this.actualizarParametrosGeneralEstadoRequisicion();
						
						this.generarReporteProcesoAccionEstadoRequisicionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEstadoRequisicion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEstadoRequisicion.jComboBoxTiposAccionesFormularioEstadoRequisicion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EstadoRequisicionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Estado RequisicionES SELECCIONADOS?", "MANTENIMIENTO DE Estado Requisicion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEstadoRequisicion();
				
						this.actualizarParametrosGeneralEstadoRequisicion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.estadorequisicionReturnGeneral=estadorequisicionLogic.procesarAccionEstadoRequisicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.estadorequisicionLogic.getEstadoRequisicions(),this.estadorequisicionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEstadoRequisicionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoRequisicion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoRequisicion.jComboBoxTiposAccionesFormularioEstadoRequisicion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoRequisicion();
					
					EstadoRequisicionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEstadoRequisicionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoRequisicion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoRequisicion.jComboBoxTiposAccionesFormularioEstadoRequisicion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoRequisicion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoRequisicionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoRequisicion();
			
			if(this.jInternalFrameDetalleFormEstadoRequisicion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoRequisicion> estadorequisicionsSeleccionados=new ArrayList<EstadoRequisicion>();		
			EstadoRequisicion estadorequisicion=new EstadoRequisicion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoRequisicion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoRequisicion.getSelectedItem();
			
			
			
			
			estadorequisicionsSeleccionados=this.getEstadoRequisicionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadorequisicionsSeleccionados.size()==1) {
				for(EstadoRequisicion estadorequisicionAux:estadorequisicionsSeleccionados) {
					estadorequisicion=estadorequisicionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Requisicion Compra")) {
					jButtonRequisicionCompraActionPerformed(null,rowIndex,true,false,estadorequisicion);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoRequisicion();
			
      		//this.finishProcessEstadoRequisicion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoRequisicionReturnGeneral() throws Exception {
		if(this.estadorequisicionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadorequisicionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadorequisicionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadorequisicionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadorequisicionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadorequisicionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoRequisicion(false);
		}
		
		if(this.estadorequisicionReturnGeneral.getConRetornoLista() || this.estadorequisicionReturnGeneral.getConRetornoObjeto()) {
			if(this.estadorequisicionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadorequisicionLogic.setEstadoRequisicions(this.estadorequisicionReturnGeneral.getEstadoRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadorequisicionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadorequisicionLogic.setEstadoRequisicion(this.estadorequisicionReturnGeneral.getEstadoRequisicion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoRequisicion(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoRequisicion() throws Exception {
		
		
	}
	
	public ArrayList<EstadoRequisicion> getEstadoRequisicionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoRequisicion> estadorequisicionsSeleccionados=new ArrayList<EstadoRequisicion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoRequisicion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoRequisicion estadorequisicionAux:estadorequisicionLogic.getEstadoRequisicions()) {
					if(estadorequisicionAux.getIsSelected()) {
						estadorequisicionsSeleccionados.add(estadorequisicionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoRequisicion estadorequisicionAux:this.estadorequisicions) {
					if(estadorequisicionAux.getIsSelected()) {
						estadorequisicionsSeleccionados.add(estadorequisicionAux);				
					}
				}
			}
			
			if(estadorequisicionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadorequisicionsSeleccionados.addAll(this.estadorequisicionLogic.getEstadoRequisicions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadorequisicionsSeleccionados.addAll(this.estadorequisicions);				
					}
				}
			}
		} else {
			estadorequisicionsSeleccionados.add(this.estadorequisicion);
		}
		
		return estadorequisicionsSeleccionados;
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
	
	public void generarReporteEstadoRequisicionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoRequisicionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoRequisicionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoRequisicionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoRequisicionsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoRequisicionsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Requisicion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoRequisicionsSeleccionados() throws Exception {
		ArrayList<EstadoRequisicion> estadorequisicionsSeleccionados=new ArrayList<EstadoRequisicion>();		
		
		estadorequisicionsSeleccionados=this.getEstadoRequisicionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoRequisicions("Todos",estadorequisicionsSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoRequisicionsSeleccionados() throws Exception {
		ArrayList<EstadoRequisicion> estadorequisicionsSeleccionados=new ArrayList<EstadoRequisicion>();		
		
		estadorequisicionsSeleccionados=this.getEstadoRequisicionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoRequisicions("Todos",estadorequisicionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoRequisicionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoRequisicion> estadorequisicionsSeleccionados=new ArrayList<EstadoRequisicion>();
		
		estadorequisicionsSeleccionados=this.getEstadoRequisicionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoRequisicions("Todos",estadorequisicionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoRequisicionsSeleccionados() throws Exception {
		ArrayList<EstadoRequisicion> estadorequisicionsSeleccionados=new ArrayList<EstadoRequisicion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoRequisicion();
		
		
		estadorequisicionsSeleccionados=this.getEstadoRequisicionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoRequisicion();
		
		
		//this.generarReporteEstadoRequisicions("Todos",estadorequisicionsSeleccionados ,estadorequisicionImplementable,estadorequisicionImplementableHome);
	}
	
	public void mostrarImportacionEstadoRequisicions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoRequisicion();
		
		this.abrirFrameImportacionEstadoRequisicion();		
		
			
		//this.generarReporteEstadoRequisicions("Todos",estadorequisicionsSeleccionados ,estadorequisicionImplementable,estadorequisicionImplementableHome);
	}
	
	public void importarEstadoRequisicions() throws Exception {		
	
	}
	
	public void exportarEstadoRequisicionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoRequisicionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoRequisicionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoRequisicionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Requisicion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoRequisicionsSeleccionados() throws Exception {
		ArrayList<EstadoRequisicion> estadorequisicionsSeleccionados=new ArrayList<EstadoRequisicion>();		
		
		estadorequisicionsSeleccionados=this.getEstadoRequisicionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadorequisicion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoRequisicion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoRequisicion estadorequisicionAux:estadorequisicionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoRequisicion(estadorequisicionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadorequisicionAux.setsDetalleGeneralEntityReporte(estadorequisicionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Requisicion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoRequisicion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoRequisicionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoRequisicionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoRequisicionConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoRequisicionConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoRequisicion(EstadoRequisicion estadorequisicion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadorequisicion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadorequisicion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadorequisicion.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadorequisicion.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoRequisicionsSeleccionados() throws Exception {
		ArrayList<EstadoRequisicion> estadorequisicionsSeleccionados=new ArrayList<EstadoRequisicion>();		
		
		estadorequisicionsSeleccionados=this.getEstadoRequisicionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadorequisicion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoRequisicions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoRequisicion(row);				
				iRow++;
			}				
			
			for(EstadoRequisicion estadorequisicionAux:estadorequisicionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoRequisicion(estadorequisicionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Requisicion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoRequisicionsSeleccionados() throws Exception {
		ArrayList<EstadoRequisicion> estadorequisicionsSeleccionados=new ArrayList<EstadoRequisicion>();		
		
		estadorequisicionsSeleccionados=this.getEstadoRequisicionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadorequisicion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadorequisicions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadorequisicion");
			//elementRoot.appendChild(element);
		
			for(EstadoRequisicion estadorequisicionAux:estadorequisicionsSeleccionados) {
				element = document.createElement("estadorequisicion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoRequisicion(estadorequisicionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Requisicion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoRequisicion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoRequisicionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoRequisicionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoRequisicionConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoRequisicionConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoRequisicion(EstadoRequisicion estadorequisicion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadorequisicion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadorequisicion.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadorequisicion.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoRequisicion(EstadoRequisicion estadorequisicion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoRequisicionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadorequisicion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoRequisicionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadorequisicion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoRequisicionConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadorequisicion.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoRequisicionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadorequisicion.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoRequisicionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoRequisicion> estadorequisicionsSeleccionados=new ArrayList<EstadoRequisicion>();
		
		estadorequisicionsSeleccionados=this.getEstadoRequisicionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoRequisicion(estadorequisicionsSeleccionados);
		
		this.generarReporteEstadoRequisicions("Todos",estadorequisicionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoRequisicion(ArrayList<EstadoRequisicion> estadorequisicionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoRequisicion estadorequisicionAux:estadorequisicionsSeleccionados) {
				estadorequisicionAux.setsDetalleGeneralEntityReporte(estadorequisicionAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoRequisicionConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadorequisicionAux.setsDescripcionGeneralEntityReporte1(estadorequisicionAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoRequisicionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadorequisicionAux.setsDescripcionGeneralEntityReporte1(estadorequisicionAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoRequisicion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoRequisicion=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoRequisicion=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoRequisicion=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoRequisicion=false;
			this.isVisibilidadCeldaActualizarEstadoRequisicion=false;
			this.isVisibilidadCeldaEliminarEstadoRequisicion=false;
			this.isVisibilidadCeldaCancelarEstadoRequisicion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoRequisicion=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoRequisicion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoRequisicion=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRequisicion=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoRequisicion=false;
			this.isVisibilidadCeldaModificarEstadoRequisicion=false;
			this.isVisibilidadCeldaActualizarEstadoRequisicion=true;
			this.isVisibilidadCeldaEliminarEstadoRequisicion=false;
			this.isVisibilidadCeldaCancelarEstadoRequisicion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoRequisicion=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoRequisicion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoRequisicion=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRequisicion=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoRequisicion=false;
			this.isVisibilidadCeldaModificarEstadoRequisicion=false;
			this.isVisibilidadCeldaActualizarEstadoRequisicion=true;
			this.isVisibilidadCeldaEliminarEstadoRequisicion=true;
			this.isVisibilidadCeldaCancelarEstadoRequisicion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoRequisicion=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoRequisicion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoRequisicion=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRequisicion=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoRequisicion=false;
			this.isVisibilidadCeldaModificarEstadoRequisicion=false;
			this.isVisibilidadCeldaActualizarEstadoRequisicion=true;
			this.isVisibilidadCeldaEliminarEstadoRequisicion=false;
			this.isVisibilidadCeldaCancelarEstadoRequisicion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoRequisicion=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoRequisicion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoRequisicion=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRequisicion=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoRequisicion=true;
			this.isVisibilidadCeldaModificarEstadoRequisicion=false;
			this.isVisibilidadCeldaActualizarEstadoRequisicion=false;
			this.isVisibilidadCeldaEliminarEstadoRequisicion=false;
			this.isVisibilidadCeldaCancelarEstadoRequisicion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoRequisicion=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoRequisicion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoRequisicion=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRequisicion=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoRequisicion=false;
			this.isVisibilidadCeldaActualizarEstadoRequisicion=false;
			this.isVisibilidadCeldaEliminarEstadoRequisicion=false;
			this.isVisibilidadCeldaCancelarEstadoRequisicion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoRequisicion=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoRequisicion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoRequisicion=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRequisicion=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoRequisicion=false;
			this.isVisibilidadCeldaModificarEstadoRequisicion=true;
			this.isVisibilidadCeldaActualizarEstadoRequisicion=false;
			this.isVisibilidadCeldaEliminarEstadoRequisicion=false;
			this.isVisibilidadCeldaCancelarEstadoRequisicion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoRequisicion=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoRequisicion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoRequisicionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoRequisicion=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRequisicion=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoRequisicion=true;
		} else {
			this.actualizarEstadoPanelsEstadoRequisicion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoRequisicion=false;
			//this.isVisibilidadCeldaVerFormEstadoRequisicion=false;
			this.isVisibilidadCeldaDuplicarEstadoRequisicion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadorequisicionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoRequisicion=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoRequisicion=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoRequisicion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadorequisicionSessionBean.getEsGuardarRelacionado()) {
			if(!estadorequisicionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoRequisicion=false;												
			}
			
			this.jButtonCerrarEstadoRequisicion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoRequisicion=false;
		}
		
		if(!this.permiteMantenimiento(this.estadorequisicion)) {
			this.isVisibilidadCeldaActualizarEstadoRequisicion=false;
			this.isVisibilidadCeldaEliminarEstadoRequisicion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoRequisicion() {
		this.isVisibilidadCeldaNuevoEstadoRequisicion=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoRequisicion=false;
	}
	
	public void actualizarEstadoPanelsEstadoRequisicion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoRequisicion!=null) {
				this.jScrollPanelDatosEdicionEstadoRequisicion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoRequisicion!=null) {
				this.jScrollPanelDatosEstadoRequisicion.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoRequisicion!=null) {
				this.jPanelPaginacionEstadoRequisicion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoRequisicion!=null) {
				this.jPanelParametrosReportesEstadoRequisicion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoRequisicion!=null) {
				this.jScrollPanelDatosEdicionEstadoRequisicion.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoRequisicion!=null) {
				this.jScrollPanelDatosEstadoRequisicion.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoRequisicion!=null) {
				this.jPanelPaginacionEstadoRequisicion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoRequisicion!=null) {
				this.jPanelParametrosReportesEstadoRequisicion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoRequisicion!=null) {
				this.jScrollPanelDatosEdicionEstadoRequisicion.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoRequisicion!=null) {
				this.jScrollPanelDatosEstadoRequisicion.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoRequisicion!=null) {
				this.jPanelPaginacionEstadoRequisicion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoRequisicion!=null) {
				this.jPanelParametrosReportesEstadoRequisicion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoRequisicion!=null) {
				this.jScrollPanelDatosEdicionEstadoRequisicion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoRequisicion!=null) {
				this.jScrollPanelDatosEstadoRequisicion.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoRequisicion!=null) {
				this.jPanelPaginacionEstadoRequisicion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoRequisicion!=null) {
				this.jPanelParametrosReportesEstadoRequisicion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoRequisicion!=null) {
				this.jScrollPanelDatosEdicionEstadoRequisicion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoRequisicion!=null) {
				this.jScrollPanelDatosEstadoRequisicion.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoRequisicion!=null) {
				this.jPanelPaginacionEstadoRequisicion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoRequisicion!=null) {
				this.jPanelParametrosReportesEstadoRequisicion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoRequisicion!=null) {
				this.jScrollPanelDatosEdicionEstadoRequisicion.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoRequisicion!=null) {
				this.jScrollPanelDatosEstadoRequisicion.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoRequisicion!=null) {
				this.jPanelPaginacionEstadoRequisicion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoRequisicion!=null) {
				this.jPanelParametrosReportesEstadoRequisicion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoRequisicion!=null) {
				this.jScrollPanelDatosEdicionEstadoRequisicion.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoRequisicion!=null) {
				this.jScrollPanelDatosEstadoRequisicion.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoRequisicion!=null) {
				this.jPanelPaginacionEstadoRequisicion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoRequisicion!=null) {
				this.jPanelParametrosReportesEstadoRequisicion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadorequisicionSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionEstadoRequisicionCompraParaRequisicionCompras() throws Exception {
		Boolean isPaginaPopupRequisicionCompra=false;

		try {

			if(this.estadorequisicionSessionBean==null) {
				this.estadorequisicionSessionBean=new EstadoRequisicionSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraSessionBean=new RequisicionCompraSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraSessionBean.setsPathNavegacionActual(estadorequisicionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupRequisicionCompra=this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeRequisicionCompra(true);
			this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeRequisicionCompra(EstadoRequisicionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraSessionBean.setisBusquedaDesdeForeignKeySesionEstadoRequisicionCompra(true);
			this.jInternalFrameDetalleFormEstadoRequisicion.requisicioncompraSessionBean.setlidEstadoRequisicionCompraActual(this.idEstadoRequisicionActual);

			estadorequisicionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoRequisicion(true);
			estadorequisicionSessionBean.setlIdEstadoRequisicionActualForeignKey(this.idEstadoRequisicionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoRequisicionSessionBean estadorequisicionSessionBean=new EstadoRequisicionSessionBean();
		
		if(this.estadorequisicionSessionBean==null) {
			this.estadorequisicionSessionBean=new EstadoRequisicionSessionBean();
		}
		
		this.estadorequisicionSessionBean.setsUltimaBusquedaEstadoRequisicion(this.getsAccionBusqueda());
		this.estadorequisicionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadorequisicionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoRequisicionSessionBean estadorequisicionSessionBean=new EstadoRequisicionSessionBean();
		
		if(this.estadorequisicionSessionBean==null) {
			this.estadorequisicionSessionBean=new EstadoRequisicionSessionBean();
		}
		
		if(this.estadorequisicionSessionBean.getsUltimaBusquedaEstadoRequisicion()!=null&&!this.estadorequisicionSessionBean.getsUltimaBusquedaEstadoRequisicion().equals("")) {
			this.setsAccionBusqueda(estadorequisicionSessionBean.getsUltimaBusquedaEstadoRequisicion());
			this.setiNumeroPaginacion(estadorequisicionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadorequisicionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadorequisicionSessionBean.setsUltimaBusquedaEstadoRequisicion("");
		this.estadorequisicionSessionBean.setiNumeroPaginacion(EstadoRequisicionConstantesFunciones.INUMEROPAGINACION);
		this.estadorequisicionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoRequisicion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoRequisicion() {
		this.updateBorderResaltarBusquedasFormularioEstadoRequisicion();
		this.updateVisibilidadBusquedasFormularioEstadoRequisicion();
		this.updateHabilitarBusquedasFormularioEstadoRequisicion();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoRequisicion() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoRequisicion() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoRequisicion() {
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
	
	public void updateControlesFormularioEstadoRequisicion() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoRequisicion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoRequisicion();
		this.updateVisibilidadResaltarControlesFormularioEstadoRequisicion();
		this.updateHabilitarResaltarControlesFormularioEstadoRequisicion();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoRequisicion() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoRequisicion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadorequisicionConstantesFunciones.resaltaridEstadoRequisicion!=null && this.jInternalFrameDetalleFormEstadoRequisicion!=null) {this.jInternalFrameDetalleFormEstadoRequisicion.jTextFieldidEstadoRequisicion.setBorder(this.estadorequisicionConstantesFunciones.resaltaridEstadoRequisicion);}
		if(this.estadorequisicionConstantesFunciones.resaltarcodigoEstadoRequisicion!=null && this.jInternalFrameDetalleFormEstadoRequisicion!=null) {this.jInternalFrameDetalleFormEstadoRequisicion.jTextFieldcodigoEstadoRequisicion.setBorder(this.estadorequisicionConstantesFunciones.resaltarcodigoEstadoRequisicion);}
		if(this.estadorequisicionConstantesFunciones.resaltarnombreEstadoRequisicion!=null && this.jInternalFrameDetalleFormEstadoRequisicion!=null) {this.jInternalFrameDetalleFormEstadoRequisicion.jTextFieldnombreEstadoRequisicion.setBorder(this.estadorequisicionConstantesFunciones.resaltarnombreEstadoRequisicion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoRequisicion() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoRequisicion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) {
	
		//this.jInternalFrameDetalleFormEstadoRequisicion.jTextFieldidEstadoRequisicion.setVisible(this.estadorequisicionConstantesFunciones.mostraridEstadoRequisicion);
		this.jInternalFrameDetalleFormEstadoRequisicion.jPanelidEstadoRequisicion.setVisible(this.estadorequisicionConstantesFunciones.mostraridEstadoRequisicion);
		//this.jInternalFrameDetalleFormEstadoRequisicion.jTextFieldcodigoEstadoRequisicion.setVisible(this.estadorequisicionConstantesFunciones.mostrarcodigoEstadoRequisicion);
		this.jInternalFrameDetalleFormEstadoRequisicion.jPanelcodigoEstadoRequisicion.setVisible(this.estadorequisicionConstantesFunciones.mostrarcodigoEstadoRequisicion);
		//this.jInternalFrameDetalleFormEstadoRequisicion.jTextFieldnombreEstadoRequisicion.setVisible(this.estadorequisicionConstantesFunciones.mostrarnombreEstadoRequisicion);
		this.jInternalFrameDetalleFormEstadoRequisicion.jPanelnombreEstadoRequisicion.setVisible(this.estadorequisicionConstantesFunciones.mostrarnombreEstadoRequisicion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoRequisicion() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoRequisicion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoRequisicion!=null) {
	
		this.jInternalFrameDetalleFormEstadoRequisicion.jTextFieldidEstadoRequisicion.setEnabled(this.estadorequisicionConstantesFunciones.activaridEstadoRequisicion);
		this.jInternalFrameDetalleFormEstadoRequisicion.jTextFieldcodigoEstadoRequisicion.setEnabled(this.estadorequisicionConstantesFunciones.activarcodigoEstadoRequisicion);
		this.jInternalFrameDetalleFormEstadoRequisicion.jTextFieldnombreEstadoRequisicion.setEnabled(this.estadorequisicionConstantesFunciones.activarnombreEstadoRequisicion);
		}
	}
	
		
}