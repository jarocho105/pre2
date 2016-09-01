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


import java.sql.Time;


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

import com.bydan.erp.inventario.util.TipoRequisicionConstantesFunciones;
import com.bydan.erp.inventario.util.TipoRequisicionParameterReturnGeneral;
//import com.bydan.erp.inventario.util.TipoRequisicionParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.TipoRequisicionBean;
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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoRequisicionBeanSwingJInternalFrame extends TipoRequisicionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoRequisicionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoRequisicion> tiporequisicionValidator = new ClassValidator<TipoRequisicion>(TipoRequisicion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoRequisicion tiporequisicion;	
	public TipoRequisicion tiporequisicionAux;
	public TipoRequisicion tiporequisicionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoRequisicion tiporequisicionTotales;
	public Long idTipoRequisicionActual;
	public Long iIdNuevoTipoRequisicion=0L;
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

	public String sFinalQueryComboTipoPeriodo="";

	public List<TipoPeriodo> tipoperiodosForeignKey;

	public List<TipoPeriodo> gettipoperiodosForeignKey() {
		return tipoperiodosForeignKey;
	}

	public void settipoperiodosForeignKey(List<TipoPeriodo> tipoperiodosForeignKey) {
		this.tipoperiodosForeignKey = tipoperiodosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoPeriodo tipoperiodoForeignKey;

	public TipoPeriodo gettipoperiodoForeignKey() {
		return tipoperiodoForeignKey;
	}

	public void settipoperiodoForeignKey(TipoPeriodo tipoperiodoForeignKey) {
		this.tipoperiodoForeignKey = tipoperiodoForeignKey;
	}

	public String sFinalQueryComboDia="";

	public List<Dia> diasForeignKey;

	public List<Dia> getdiasForeignKey() {
		return diasForeignKey;
	}

	public void setdiasForeignKey(List<Dia> diasForeignKey) {
		this.diasForeignKey = diasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Dia diaForeignKey;

	public Dia getdiaForeignKey() {
		return diaForeignKey;
	}

	public void setdiaForeignKey(Dia diaForeignKey) {
		this.diaForeignKey = diaForeignKey;
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
	
	public Boolean isPermisoTodoTipoRequisicion;
	public Boolean isPermisoNuevoTipoRequisicion;
	public Boolean isPermisoActualizarTipoRequisicion;
	public Boolean isPermisoActualizarOriginalTipoRequisicion;
	public Boolean isPermisoEliminarTipoRequisicion;
	public Boolean isPermisoGuardarCambiosTipoRequisicion;
	public Boolean isPermisoConsultaTipoRequisicion;
	public Boolean isPermisoBusquedaTipoRequisicion;
	public Boolean isPermisoReporteTipoRequisicion;
	public Boolean isPermisoPaginacionMedioTipoRequisicion;
	public Boolean isPermisoPaginacionAltoTipoRequisicion;
	public Boolean isPermisoPaginacionTodoTipoRequisicion;
	public Boolean isPermisoCopiarTipoRequisicion;
	public Boolean isPermisoVerFormTipoRequisicion;
	public Boolean isPermisoDuplicarTipoRequisicion;
	public Boolean isPermisoOrdenTipoRequisicion;
	
	
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
	
	public TipoRequisicionParameterReturnGeneral tiporequisicionReturnGeneral;
	public TipoRequisicionParameterReturnGeneral tiporequisicionParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoRequisicion=false;
	public Boolean esParaAccionDesdeFormularioTipoRequisicion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoRequisicionSessionBeanAdditional tiporequisicionSessionBeanAdditional=null;
	
	public TipoRequisicionSessionBeanAdditional getTipoRequisicionSessionBeanAdditional() {
		return this.tiporequisicionSessionBeanAdditional;
	}
	
	public void setTipoRequisicionSessionBeanAdditional(TipoRequisicionSessionBeanAdditional tiporequisicionSessionBeanAdditional) {
		try {
			this.tiporequisicionSessionBeanAdditional=tiporequisicionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoRequisicionBeanSwingJInternalFrameAdditional tiporequisicionBeanSwingJInternalFrameAdditional=null;
	//public class TipoRequisicionBeanSwingJInternalFrame
	
	public TipoRequisicionBeanSwingJInternalFrameAdditional getTipoRequisicionBeanSwingJInternalFrameAdditional() {
		return this.tiporequisicionBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoRequisicionBeanSwingJInternalFrameAdditional(TipoRequisicionBeanSwingJInternalFrameAdditional tiporequisicionBeanSwingJInternalFrameAdditional) {
		try {
			this.tiporequisicionBeanSwingJInternalFrameAdditional=tiporequisicionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoRequisicionLogic tiporequisicionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoRequisicion tiporequisicionBean;
	public TipoRequisicionConstantesFunciones tiporequisicionConstantesFunciones;
	//public TipoRequisicionParameterReturnGeneral tiporequisicionReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TipoPeriodoLogic tipoperiodoLogic;
	public DiaLogic diaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoRequisicion> tiporequisicions;	
	//public List<TipoRequisicion> tiporequisicionsEliminados;
	//public List<TipoRequisicion> tiporequisicionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoRequisicion=false;
	public Boolean isVisibilidadCeldaDuplicarTipoRequisicion=true;
	public Boolean isVisibilidadCeldaCopiarTipoRequisicion=true;
	public Boolean isVisibilidadCeldaVerFormTipoRequisicion=true;
	public Boolean isVisibilidadCeldaOrdenTipoRequisicion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoRequisicion=false;
	public Boolean isVisibilidadCeldaModificarTipoRequisicion=false;
	public Boolean isVisibilidadCeldaActualizarTipoRequisicion=false;
	public Boolean isVisibilidadCeldaEliminarTipoRequisicion=false;
	public Boolean isVisibilidadCeldaCancelarTipoRequisicion=false;
	public Boolean isVisibilidadCeldaGuardarTipoRequisicion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoRequisicion=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdDia=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoPeriodo=false;
	
	public Long getiIdNuevoTipoRequisicion() {
		return this.iIdNuevoTipoRequisicion;
	}

	public void setiIdNuevoTipoRequisicion(Long iIdNuevoTipoRequisicion) {
		this.iIdNuevoTipoRequisicion = iIdNuevoTipoRequisicion;
	}
	
	public Long getidTipoRequisicionActual() {
		return this.idTipoRequisicionActual;
	}

	public void setidTipoRequisicionActual(Long idTipoRequisicionActual) {
		this.idTipoRequisicionActual = idTipoRequisicionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoRequisicion gettiporequisicion() {
		return this.tiporequisicion;
	}

	public void settiporequisicion(TipoRequisicion tiporequisicion) {
		this.tiporequisicion = tiporequisicion;
	}
	
	public TipoRequisicion gettiporequisicionAux() {
		return this.tiporequisicionAux;
	}

	public void settiporequisicionAux(TipoRequisicion tiporequisicionAux) {
		this.tiporequisicionAux = tiporequisicionAux;
	}				
	
	public TipoRequisicion gettiporequisicionAnterior() {
		return this.tiporequisicionAnterior;
	}

	public void settiporequisicionAnterior(TipoRequisicion tiporequisicionAnterior) {
		this.tiporequisicionAnterior = tiporequisicionAnterior;
	}	
	
	public TipoRequisicion gettiporequisicionTotales() {
		return this.tiporequisicionTotales;
	}

	public void settiporequisicionTotales(TipoRequisicion tiporequisicionTotales) {
		this.tiporequisicionTotales = tiporequisicionTotales;
	}	
	
	public TipoRequisicion gettiporequisicionBean() {
		return this.tiporequisicionBean;
	}

	public void settiporequisicionBean(TipoRequisicion tiporequisicionBean) {
		this.tiporequisicionBean = tiporequisicionBean;
	}	
	
	public TipoRequisicionParameterReturnGeneral gettiporequisicionReturnGeneral() {
		return this.tiporequisicionReturnGeneral;
	}

	public void settiporequisicionReturnGeneral(TipoRequisicionParameterReturnGeneral tiporequisicionReturnGeneral) {
		this.tiporequisicionReturnGeneral = tiporequisicionReturnGeneral;
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

	public Long id_diaFK_IdDia=-1L;

	public Long getid_diaFK_IdDia() {
		return this.id_diaFK_IdDia;
	}

	public void setid_diaFK_IdDia(Long id_diaFK_IdDia) {
		this.id_diaFK_IdDia = id_diaFK_IdDia;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_tipo_periodoFK_IdTipoPeriodo=-1L;

	public Long getid_tipo_periodoFK_IdTipoPeriodo() {
		return this.id_tipo_periodoFK_IdTipoPeriodo;
	}

	public void setid_tipo_periodoFK_IdTipoPeriodo(Long id_tipo_periodoFK_IdTipoPeriodo) {
		this.id_tipo_periodoFK_IdTipoPeriodo = id_tipo_periodoFK_IdTipoPeriodo;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoRequisicionLogic getTipoRequisicionLogic()	{		
		return tiporequisicionLogic;
	}

	public void setTipoRequisicionLogic(TipoRequisicionLogic tiporequisicionLogic) {
		this.tiporequisicionLogic = tiporequisicionLogic;
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
	
	public Boolean getIsEsNuevoTipoRequisicion() {
		return isEsNuevoTipoRequisicion;
	}

	public void setIsEsNuevoTipoRequisicion(Boolean isEsNuevoTipoRequisicion) {
		this.isEsNuevoTipoRequisicion = isEsNuevoTipoRequisicion;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoRequisicion() {
		return esParaAccionDesdeFormularioTipoRequisicion;
	}
	
	public void setEsParaAccionDesdeFormularioTipoRequisicion(Boolean esParaAccionDesdeFormularioTipoRequisicion) {
		this.esParaAccionDesdeFormularioTipoRequisicion = esParaAccionDesdeFormularioTipoRequisicion;
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

			if(this.tiporequisicionSessionBean==null) {
				this.tiporequisicionSessionBean=new TipoRequisicionSessionBean();
			}

			if(!this.tiporequisicionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tiporequisicionSessionBean.getlidEmpresaActual());
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

	public void cargarCombosTipoPeriodosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoperiodosForeignKey=new ArrayList<TipoPeriodo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoPeriodoLogic tipoperiodoLogic=new TipoPeriodoLogic();

			//tipoperiodoLogic.getTipoPeriodoDataAccess().setIsForForeingKeyData(true);

			if(this.tiporequisicionSessionBean==null) {
				this.tiporequisicionSessionBean=new TipoRequisicionSessionBean();
			}

			if(!this.tiporequisicionSessionBean.getisBusquedaDesdeForeignKeySesionTipoPeriodo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoperiodoLogic.getTipoPeriodoDataAccess().setIsForForeingKeyData(true);

					tipoperiodoLogic.getTodosTipoPeriodosWithConnection(sFinalQuery,new Pagination());

					this.tipoperiodosForeignKey=tipoperiodoLogic.getTipoPeriodos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoPeriodo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoperiodoLogic.getEntityWithConnection(tiporequisicionSessionBean.getlidTipoPeriodoActual());
					this.tipoperiodosForeignKey.add(tipoperiodoLogic.getTipoPeriodo());
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

	public void cargarCombosDiasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.diasForeignKey=new ArrayList<Dia>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			DiaLogic diaLogic=new DiaLogic();

			//diaLogic.getDiaDataAccess().setIsForForeingKeyData(true);

			if(this.tiporequisicionSessionBean==null) {
				this.tiporequisicionSessionBean=new TipoRequisicionSessionBean();
			}

			if(!this.tiporequisicionSessionBean.getisBusquedaDesdeForeignKeySesionDia()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//diaLogic.getDiaDataAccess().setIsForForeingKeyData(true);

					diaLogic.getTodosDiasWithConnection(sFinalQuery,new Pagination());

					this.diasForeignKey=diaLogic.getDias();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaDia(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					diaLogic.getEntityWithConnection(tiporequisicionSessionBean.getlidDiaActual());
					this.diasForeignKey.add(diaLogic.getDia());
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

					if(this.tiporequisicion!=null) {
						this.tiporequisicion.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoRequisicion!=null) {
						this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_empresaTipoRequisicion.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoRequisicion.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoRequisicion!=null) {
						if(this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_empresaTipoRequisicion.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_empresaTipoRequisicion.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoRequisicionGenerico)throws Exception
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
				jComboBoxid_empresaTipoRequisicionGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoRequisicionGenerico!=null && jComboBoxid_empresaTipoRequisicionGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoRequisicionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoPeriodoForeignKey(Long idTipoPeriodoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoPeriodo  tipoperiodoTemp=null;

			for(TipoPeriodo tipoperiodoAux:tipoperiodosForeignKey) {
				if(tipoperiodoAux.getId()!=null && tipoperiodoAux.getId().equals(idTipoPeriodoSeleccionado)) {
					tipoperiodoTemp=tipoperiodoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoperiodoTemp!=null) {

					if(this.tiporequisicion!=null) {
						this.tiporequisicion.setTipoPeriodo(tipoperiodoTemp);
					}

					if(this.jInternalFrameDetalleFormTipoRequisicion!=null) {
						this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_tipo_periodoTipoRequisicion.setSelectedItem(tipoperiodoTemp);
					}
				} else {
					//jComboBoxid_tipo_periodoTipoRequisicion.setSelectedItem(tipoperiodoTemp);
					if(this.jInternalFrameDetalleFormTipoRequisicion!=null) {
						if(this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_tipo_periodoTipoRequisicion.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_tipo_periodoTipoRequisicion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoPeriodo") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoperiodoTemp!=null && jComboBoxid_tipo_periodoFK_IdTipoPeriodoTipoRequisicion!=null) {
						jComboBoxid_tipo_periodoFK_IdTipoPeriodoTipoRequisicion.setSelectedItem(tipoperiodoTemp);
					} else {
						if(jComboBoxid_tipo_periodoFK_IdTipoPeriodoTipoRequisicion!=null) {
							//jComboBoxid_tipo_periodoFK_IdTipoPeriodoTipoRequisicion.setSelectedItem(tipoperiodoTemp);
							if(jComboBoxid_tipo_periodoFK_IdTipoPeriodoTipoRequisicion.getItemCount()>0) {
								jComboBoxid_tipo_periodoFK_IdTipoPeriodoTipoRequisicion.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualTipoPeriodoForeignKeyDescripcion(Long idTipoPeriodoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoPeriodo  tipoperiodoTemp=null;

			for(TipoPeriodo tipoperiodoAux:tipoperiodosForeignKey) {
				if(tipoperiodoAux.getId()!=null && tipoperiodoAux.getId().equals(idTipoPeriodoSeleccionado)) {
					tipoperiodoTemp=tipoperiodoAux;
					break;
				}
			}


			sDescripcion=TipoPeriodoConstantesFunciones.getTipoPeriodoDescripcion(tipoperiodoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoPeriodoForeignKeyGenerico(Long idTipoPeriodoSeleccionado,JComboBox jComboBoxid_tipo_periodoTipoRequisicionGenerico)throws Exception
	{
		try
		{
			TipoPeriodo  tipoperiodoTemp=null;

			for(TipoPeriodo tipoperiodoAux:tipoperiodosForeignKey) {
				if(tipoperiodoAux.getId()!=null && tipoperiodoAux.getId().equals(idTipoPeriodoSeleccionado)) {
					tipoperiodoTemp=tipoperiodoAux;
					break;
				}
			}

			if(tipoperiodoTemp!=null) {
				jComboBoxid_tipo_periodoTipoRequisicionGenerico.setSelectedItem(tipoperiodoTemp);
			} else {
				if(jComboBoxid_tipo_periodoTipoRequisicionGenerico!=null && jComboBoxid_tipo_periodoTipoRequisicionGenerico.getItemCount()>0) {
					jComboBoxid_tipo_periodoTipoRequisicionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualDiaForeignKey(Long idDiaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Dia  diaTemp=null;

			for(Dia diaAux:diasForeignKey) {
				if(diaAux.getId()!=null && diaAux.getId().equals(idDiaSeleccionado)) {
					diaTemp=diaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(diaTemp!=null) {

					if(this.tiporequisicion!=null) {
						this.tiporequisicion.setDia(diaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoRequisicion!=null) {
						this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_diaTipoRequisicion.setSelectedItem(diaTemp);
					}
				} else {
					//jComboBoxid_diaTipoRequisicion.setSelectedItem(diaTemp);
					if(this.jInternalFrameDetalleFormTipoRequisicion!=null) {
						if(this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_diaTipoRequisicion.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_diaTipoRequisicion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdDia") || sFormularioTipoBusqueda.equals("Todos")){
					if(diaTemp!=null && jComboBoxid_diaFK_IdDiaTipoRequisicion!=null) {
						jComboBoxid_diaFK_IdDiaTipoRequisicion.setSelectedItem(diaTemp);
					} else {
						if(jComboBoxid_diaFK_IdDiaTipoRequisicion!=null) {
							//jComboBoxid_diaFK_IdDiaTipoRequisicion.setSelectedItem(diaTemp);
							if(jComboBoxid_diaFK_IdDiaTipoRequisicion.getItemCount()>0) {
								jComboBoxid_diaFK_IdDiaTipoRequisicion.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualDiaForeignKeyDescripcion(Long idDiaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Dia  diaTemp=null;

			for(Dia diaAux:diasForeignKey) {
				if(diaAux.getId()!=null && diaAux.getId().equals(idDiaSeleccionado)) {
					diaTemp=diaAux;
					break;
				}
			}


			sDescripcion=DiaConstantesFunciones.getDiaDescripcion(diaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualDiaForeignKeyGenerico(Long idDiaSeleccionado,JComboBox jComboBoxid_diaTipoRequisicionGenerico)throws Exception
	{
		try
		{
			Dia  diaTemp=null;

			for(Dia diaAux:diasForeignKey) {
				if(diaAux.getId()!=null && diaAux.getId().equals(idDiaSeleccionado)) {
					diaTemp=diaAux;
					break;
				}
			}

			if(diaTemp!=null) {
				jComboBoxid_diaTipoRequisicionGenerico.setSelectedItem(diaTemp);
			} else {
				if(jComboBoxid_diaTipoRequisicionGenerico!=null && jComboBoxid_diaTipoRequisicionGenerico.getItemCount()>0) {
					jComboBoxid_diaTipoRequisicionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoRequisicion tiporequisicion,JComboBox jComboBoxid_empresaTipoRequisicionGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoRequisicionGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_empresaTipoRequisicion.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoRequisicionGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tiporequisicion.setid_empresa(empresaAux.getId());
				tiporequisicion.setempresa_descripcion(TipoRequisicionConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tiporequisicion.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoPeriodoForeignKey(TipoRequisicion tiporequisicion,JComboBox jComboBoxid_tipo_periodoTipoRequisicionGenerico)throws Exception
	{
		try
		{
			TipoPeriodo  tipoperiodoAux=new TipoPeriodo();

			if(jComboBoxid_tipo_periodoTipoRequisicionGenerico==null) {
				tipoperiodoAux=(TipoPeriodo)this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_tipo_periodoTipoRequisicion.getSelectedItem();
			} else {
				tipoperiodoAux=(TipoPeriodo)jComboBoxid_tipo_periodoTipoRequisicionGenerico.getSelectedItem();
			}

			if(tipoperiodoAux!=null && tipoperiodoAux.getId()!=null) {
				tiporequisicion.setid_tipo_periodo(tipoperiodoAux.getId());
				tiporequisicion.settipoperiodo_descripcion(TipoRequisicionConstantesFunciones.getTipoPeriodoDescripcion(tipoperiodoAux));
				tiporequisicion.setTipoPeriodo(tipoperiodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarDiaForeignKey(TipoRequisicion tiporequisicion,JComboBox jComboBoxid_diaTipoRequisicionGenerico)throws Exception
	{
		try
		{
			Dia  diaAux=new Dia();

			if(jComboBoxid_diaTipoRequisicionGenerico==null) {
				diaAux=(Dia)this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_diaTipoRequisicion.getSelectedItem();
			} else {
				diaAux=(Dia)jComboBoxid_diaTipoRequisicionGenerico.getSelectedItem();
			}

			if(diaAux!=null && diaAux.getId()!=null) {
				tiporequisicion.setid_dia(diaAux.getId());
				tiporequisicion.setdia_descripcion(TipoRequisicionConstantesFunciones.getDiaDescripcion(diaAux));
				tiporequisicion.setDia(diaAux);			}
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

					if(!TipoRequisicionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoRequisicion!=null) { 
							this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_empresaTipoRequisicion.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_empresaTipoRequisicion.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoRequisicion!=null) { 
					}

					if(!TipoRequisicionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoPeriodosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoPeriodo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TipoRequisicionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoRequisicion!=null) { 
							this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_tipo_periodoTipoRequisicion.removeAllItems();

							for(TipoPeriodo tipoperiodo:this.tipoperiodosForeignKey) {
								this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_tipo_periodoTipoRequisicion.addItem(tipoperiodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoRequisicion!=null) { 
					}

					if(!TipoRequisicionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoPeriodo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoRequisicionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_periodoFK_IdTipoPeriodoTipoRequisicion.removeAllItems();

							for(TipoPeriodo tipoperiodo:this.tipoperiodosForeignKey) {
								this.jComboBoxid_tipo_periodoFK_IdTipoPeriodoTipoRequisicion.addItem(tipoperiodo);
							}
						}

						if(!TipoRequisicionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameDiasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingDia=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TipoRequisicionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoRequisicion!=null) { 
							this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_diaTipoRequisicion.removeAllItems();

							for(Dia dia:this.diasForeignKey) {
								this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_diaTipoRequisicion.addItem(dia);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoRequisicion!=null) { 
					}

					if(!TipoRequisicionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdDia") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoRequisicionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_diaFK_IdDiaTipoRequisicion.removeAllItems();

							for(Dia dia:this.diasForeignKey) {
								this.jComboBoxid_diaFK_IdDiaTipoRequisicion.addItem(dia);
							}
						}

						if(!TipoRequisicionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoRequisicion!=null) {
							this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_empresaTipoRequisicion.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoRequisicion!=null) {
							this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_empresaTipoRequisicion.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoPeriodoForeignKey(TipoPeriodo tipoperiodo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoRequisicion!=null) {
							this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_tipo_periodoTipoRequisicion.setSelectedItem(tipoperiodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoRequisicion!=null) {
							this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_tipo_periodoTipoRequisicion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_periodoFK_IdTipoPeriodoTipoRequisicion.setSelectedItem(tipoperiodo);
						} else {
							this.jComboBoxid_tipo_periodoFK_IdTipoPeriodoTipoRequisicion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameDiaForeignKey(Dia dia,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoRequisicion!=null) {
							this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_diaTipoRequisicion.setSelectedItem(dia);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoRequisicion!=null) {
							this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_diaTipoRequisicion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_diaFK_IdDiaTipoRequisicion.setSelectedItem(dia);
						} else {
							this.jComboBoxid_diaFK_IdDiaTipoRequisicion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTipoRequisicion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoRequisicionConstantesFunciones.refrescarForeignKeysDescripcionesTipoRequisicion(this.tiporequisicionLogic.getTipoRequisicions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoRequisicionConstantesFunciones.refrescarForeignKeysDescripcionesTipoRequisicion(this.tiporequisicions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(TipoPeriodo.class));
		classes.add(new Classe(Dia.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tiporequisicionLogic.setTipoRequisicions(this.tiporequisicions);
			tiporequisicionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoRequisicionParameterReturnGeneral getTipoRequisicionParameterGeneral() {
		return this.tiporequisicionParameterGeneral;
	}
	
	public void setTipoRequisicionParameterGeneral(TipoRequisicionParameterReturnGeneral tiporequisicionParameterGeneral) {
		this.tiporequisicionParameterGeneral = tiporequisicionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoRequisicion() {
		return isPermisoTodoTipoRequisicion;
	}

	public void setIsPermisoTodoTipoRequisicion(Boolean isPermisoTodoTipoRequisicion) {
		this.isPermisoTodoTipoRequisicion = isPermisoTodoTipoRequisicion;
	}

	public Boolean getIsPermisoNuevoTipoRequisicion() {
		return isPermisoNuevoTipoRequisicion;
	}

	public void setIsPermisoNuevoTipoRequisicion(Boolean isPermisoNuevoTipoRequisicion) {
		this.isPermisoNuevoTipoRequisicion = isPermisoNuevoTipoRequisicion;
	}

	public Boolean getIsPermisoActualizarTipoRequisicion() {
		return isPermisoActualizarTipoRequisicion;
	}

	public void setIsPermisoActualizarTipoRequisicion(Boolean isPermisoActualizarTipoRequisicion) {
		this.isPermisoActualizarTipoRequisicion = isPermisoActualizarTipoRequisicion;
	}

	public Boolean getIsPermisoEliminarTipoRequisicion() {
		return isPermisoEliminarTipoRequisicion;
	}

	public void setIsPermisoEliminarTipoRequisicion(Boolean isPermisoEliminarTipoRequisicion) {
		this.isPermisoEliminarTipoRequisicion = isPermisoEliminarTipoRequisicion;
	}

	public Boolean getIsPermisoGuardarCambiosTipoRequisicion() {
		return isPermisoGuardarCambiosTipoRequisicion;
	}

	public void setIsPermisoGuardarCambiosTipoRequisicion(Boolean isPermisoGuardarCambiosTipoRequisicion) {
		this.isPermisoGuardarCambiosTipoRequisicion = isPermisoGuardarCambiosTipoRequisicion;
	}
	
	public Boolean getIsPermisoConsultaTipoRequisicion() {
		return isPermisoConsultaTipoRequisicion;
	}

	public void setIsPermisoConsultaTipoRequisicion(Boolean isPermisoConsultaTipoRequisicion) {
		this.isPermisoConsultaTipoRequisicion = isPermisoConsultaTipoRequisicion;
	}

	public Boolean getIsPermisoBusquedaTipoRequisicion() {
		return isPermisoBusquedaTipoRequisicion;
	}

	public void setIsPermisoBusquedaTipoRequisicion(Boolean isPermisoBusquedaTipoRequisicion) {
		this.isPermisoBusquedaTipoRequisicion = isPermisoBusquedaTipoRequisicion;
	}

	public Boolean getIsPermisoReporteTipoRequisicion() {
		return isPermisoReporteTipoRequisicion;
	}

	public void setIsPermisoReporteTipoRequisicion(Boolean isPermisoReporteTipoRequisicion) {
		this.isPermisoReporteTipoRequisicion = isPermisoReporteTipoRequisicion;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoRequisicion() {
		return isPermisoPaginacionMedioTipoRequisicion;
	}

	public void setIsPermisoPaginacionMedioTipoRequisicion(Boolean isPermisoPaginacionMedioTipoRequisicion) {
		this.isPermisoPaginacionMedioTipoRequisicion = isPermisoPaginacionMedioTipoRequisicion;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoRequisicion() {
		return isPermisoPaginacionTodoTipoRequisicion;
	}

	public void setIsPermisoPaginacionTodoTipoRequisicion(Boolean isPermisoPaginacionTodoTipoRequisicion) {
		this.isPermisoPaginacionTodoTipoRequisicion = isPermisoPaginacionTodoTipoRequisicion;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoRequisicion() {
		return isPermisoPaginacionAltoTipoRequisicion;
	}

	public void setIsPermisoPaginacionAltoTipoRequisicion(Boolean isPermisoPaginacionAltoTipoRequisicion) {
		this.isPermisoPaginacionAltoTipoRequisicion = isPermisoPaginacionAltoTipoRequisicion;
	}
	
	public Boolean getIsPermisoCopiarTipoRequisicion() {
		return isPermisoCopiarTipoRequisicion;
	}

	public void setIsPermisoCopiarTipoRequisicion(Boolean isPermisoCopiarTipoRequisicion) {
		this.isPermisoCopiarTipoRequisicion = isPermisoCopiarTipoRequisicion;
	}
	
	public Boolean getIsPermisoVerFormTipoRequisicion() {
		return isPermisoVerFormTipoRequisicion;
	}

	public void setIsPermisoVerFormTipoRequisicion(Boolean isPermisoVerFormTipoRequisicion) {
		this.isPermisoVerFormTipoRequisicion = isPermisoVerFormTipoRequisicion;
	}
	
	public Boolean getIsPermisoDuplicarTipoRequisicion() {
		return isPermisoDuplicarTipoRequisicion;
	}

	public void setIsPermisoDuplicarTipoRequisicion(Boolean isPermisoDuplicarTipoRequisicion) {
		this.isPermisoDuplicarTipoRequisicion = isPermisoDuplicarTipoRequisicion;
	}
	
	public Boolean getIsPermisoOrdenTipoRequisicion() {
		return isPermisoOrdenTipoRequisicion;
	}

	public void setIsPermisoOrdenTipoRequisicion(Boolean isPermisoOrdenTipoRequisicion) {
		this.isPermisoOrdenTipoRequisicion = isPermisoOrdenTipoRequisicion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoRequisicion() {
		return isVisibilidadCeldaNuevoTipoRequisicion;
	}

	public void setIsVisibilidadCeldaNuevoTipoRequisicion(Boolean isVisibilidadCeldaNuevoTipoRequisicion) {
		this.isVisibilidadCeldaNuevoTipoRequisicion = isVisibilidadCeldaNuevoTipoRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoRequisicion() {
		return isVisibilidadCeldaDuplicarTipoRequisicion;
	}

	public void setIsVisibilidadCeldaDuplicarTipoRequisicion(Boolean isVisibilidadCeldaDuplicarTipoRequisicion) {
		this.isVisibilidadCeldaDuplicarTipoRequisicion = isVisibilidadCeldaDuplicarTipoRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoRequisicion() {
		return isVisibilidadCeldaCopiarTipoRequisicion;
	}

	public void setIsVisibilidadCeldaCopiarTipoRequisicion(Boolean isVisibilidadCeldaCopiarTipoRequisicion) {
		this.isVisibilidadCeldaCopiarTipoRequisicion = isVisibilidadCeldaCopiarTipoRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoRequisicion() {
		return isVisibilidadCeldaVerFormTipoRequisicion;
	}

	public void setIsVisibilidadCeldaVerFormTipoRequisicion(Boolean isVisibilidadCeldaVerFormTipoRequisicion) {
		this.isVisibilidadCeldaVerFormTipoRequisicion = isVisibilidadCeldaVerFormTipoRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoRequisicion() {
		return isVisibilidadCeldaOrdenTipoRequisicion;
	}

	public void setIsVisibilidadCeldaOrdenTipoRequisicion(Boolean isVisibilidadCeldaOrdenTipoRequisicion) {
		this.isVisibilidadCeldaOrdenTipoRequisicion = isVisibilidadCeldaOrdenTipoRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoRequisicion() {
		return isVisibilidadCeldaNuevoRelacionesTipoRequisicion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoRequisicion(Boolean isVisibilidadCeldaNuevoRelacionesTipoRequisicion) {
		this.isVisibilidadCeldaNuevoRelacionesTipoRequisicion = isVisibilidadCeldaNuevoRelacionesTipoRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoRequisicion() {
		return isVisibilidadCeldaModificarTipoRequisicion;
	}

	public void setIsVisibilidadCeldaModificarTipoRequisicion(Boolean isVisibilidadCeldaModificarTipoRequisicion) {
		this.isVisibilidadCeldaModificarTipoRequisicion = isVisibilidadCeldaModificarTipoRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoRequisicion() {
		return isVisibilidadCeldaActualizarTipoRequisicion;
	}

	public void setIsVisibilidadCeldaActualizarTipoRequisicion(Boolean isVisibilidadCeldaActualizarTipoRequisicion) {
		this.isVisibilidadCeldaActualizarTipoRequisicion = isVisibilidadCeldaActualizarTipoRequisicion;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoRequisicion() {
		return isVisibilidadCeldaEliminarTipoRequisicion;
	}

	public void setIsVisibilidadCeldaEliminarTipoRequisicion(Boolean isVisibilidadCeldaEliminarTipoRequisicion) {
		this.isVisibilidadCeldaEliminarTipoRequisicion = isVisibilidadCeldaEliminarTipoRequisicion;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoRequisicion() {
		return isVisibilidadCeldaCancelarTipoRequisicion;
	}

	public void setIsVisibilidadCeldaCancelarTipoRequisicion(Boolean isVisibilidadCeldaCancelarTipoRequisicion) {
		this.isVisibilidadCeldaCancelarTipoRequisicion = isVisibilidadCeldaCancelarTipoRequisicion;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoRequisicion() {
		return isVisibilidadCeldaGuardarTipoRequisicion;
	}

	public void setIsVisibilidadCeldaGuardarTipoRequisicion(Boolean isVisibilidadCeldaGuardarTipoRequisicion) {
		this.isVisibilidadCeldaGuardarTipoRequisicion = isVisibilidadCeldaGuardarTipoRequisicion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoRequisicion() {
		return isVisibilidadCeldaGuardarCambiosTipoRequisicion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoRequisicion(Boolean isVisibilidadCeldaGuardarCambiosTipoRequisicion) {
		this.isVisibilidadCeldaGuardarCambiosTipoRequisicion = isVisibilidadCeldaGuardarCambiosTipoRequisicion;
	}
		
	public TipoRequisicionSessionBean gettiporequisicionSessionBean() {
		return this.tiporequisicionSessionBean;
	}
	
	public void settiporequisicionSessionBean(TipoRequisicionSessionBean tiporequisicionSessionBean) {
		this.tiporequisicionSessionBean=tiporequisicionSessionBean;
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

	public Boolean getisVisibilidadFK_IdDia() {
		return this.isVisibilidadFK_IdDia;
	}

	public void setisVisibilidadFK_IdDia(Boolean isVisibilidadFK_IdDia) {
		this.isVisibilidadFK_IdDia=isVisibilidadFK_IdDia;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdTipoPeriodo() {
		return this.isVisibilidadFK_IdTipoPeriodo;
	}

	public void setisVisibilidadFK_IdTipoPeriodo(Boolean isVisibilidadFK_IdTipoPeriodo) {
		this.isVisibilidadFK_IdTipoPeriodo=isVisibilidadFK_IdTipoPeriodo;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoRequisicion(TipoRequisicion tiporequisicion)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tiporequisicion,null);
				this.setActualParaGuardarTipoPeriodoForeignKey(tiporequisicion,null);
				this.setActualParaGuardarDiaForeignKey(tiporequisicion,null);
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
	
	public void bugActualizarReferenciaActual(TipoRequisicion tiporequisicion,TipoRequisicion tiporequisicionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoRequisicion(tiporequisicion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tiporequisicionAux.setId(tiporequisicion.getId());
		tiporequisicionAux.setVersionRow(tiporequisicion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoRequisicion();
		
			int intSelectedRow = this.jTableDatosTipoRequisicion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicion =(TipoRequisicion) this.tiporequisicionLogic.getTipoRequisicions().toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tiporequisicion =(TipoRequisicion) this.tiporequisicions.toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoRequisicion(this.tiporequisicion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRequisicion(this.tiporequisicion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tiporequisicionValidator.getInvalidValues(this.tiporequisicion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tiporequisicionLogic.setDatosCliente(datosCliente);
			tiporequisicionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tiporequisicionAux=new  TipoRequisicion();
				
				tiporequisicionAux.setIsNew(true);
				tiporequisicionAux.setIsChanged(true);
				
				tiporequisicionAux.setTipoRequisicionOriginal(this.tiporequisicion);
				
				tiporequisicionAux.setId(this.tiporequisicion.getId());	
				tiporequisicionAux.setVersionRow(this.tiporequisicion.getVersionRow());	
				tiporequisicionAux.setid_empresa(this.tiporequisicion.getid_empresa());	
				tiporequisicionAux.setcodigo(this.tiporequisicion.getcodigo());	
				tiporequisicionAux.setnombre(this.tiporequisicion.getnombre());	
				tiporequisicionAux.setid_tipo_periodo(this.tiporequisicion.getid_tipo_periodo());	
				tiporequisicionAux.setid_dia(this.tiporequisicion.getid_dia());	
				tiporequisicionAux.sethora(this.tiporequisicion.gethora());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiporequisicionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiporequisicionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tiporequisicionAux,tiporequisicionLogic.getTipoRequisicions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporequisicionAux,tiporequisicions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tiporequisicionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporequisicionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporequisicionLogic.saveTipoRequisicions();//WithConnection
						//tiporequisicionLogic.getSetVersionRowTipoRequisicions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiporequisicion,tiporequisicionAux);
					
					this.refrescarForeignKeysDescripcionesTipoRequisicion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporequisicionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiporequisicionLogic.saveTipoRequisicionRelaciones(tiporequisicionAux);//WithConnection
								//tiporequisicionLogic.getSetVersionRowTipoRequisicions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiporequisicion,tiporequisicionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiporequisicionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiporequisicionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiporequisicionAux,tiporequisicionLogic.getTipoRequisicions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiporequisicionAux,tiporequisicions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiporequisicion,tiporequisicionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tiporequisicionAux=new  TipoRequisicion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tiporequisicionSessionBean.getEsGuardarRelacionado() 
					|| (this.tiporequisicionSessionBean.getEsGuardarRelacionado() && this.tiporequisicion.getId()>=0)) {
						
					tiporequisicionAux.setIsNew(false);
				}
				
				tiporequisicionAux.setIsDeleted(false);
			
				tiporequisicionAux.setId(this.tiporequisicion.getId());	
				tiporequisicionAux.setVersionRow(this.tiporequisicion.getVersionRow());	
				tiporequisicionAux.setid_empresa(this.tiporequisicion.getid_empresa());	
				tiporequisicionAux.setcodigo(this.tiporequisicion.getcodigo());	
				tiporequisicionAux.setnombre(this.tiporequisicion.getnombre());	
				tiporequisicionAux.setid_tipo_periodo(this.tiporequisicion.getid_tipo_periodo());	
				tiporequisicionAux.setid_dia(this.tiporequisicion.getid_dia());	
				tiporequisicionAux.sethora(this.tiporequisicion.gethora());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiporequisicionAux,tiporequisicionLogic.getTipoRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporequisicionAux,tiporequisicions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tiporequisicionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporequisicionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporequisicionLogic.saveTipoRequisicions();//WithConnection
						//tiporequisicionLogic.getSetVersionRowTipoRequisicions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiporequisicion,tiporequisicionAux);
					
					this.refrescarForeignKeysDescripcionesTipoRequisicion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporequisicionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiporequisicionLogic.saveTipoRequisicionRelaciones(tiporequisicionAux);//WithConnection
								//tiporequisicionLogic.getSetVersionRowTipoRequisicions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiporequisicion,tiporequisicionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiporequisicionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiporequisicionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiporequisicionAux,tiporequisicionLogic.getTipoRequisicions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiporequisicionAux,tiporequisicions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiporequisicion,tiporequisicionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tiporequisicionAux=new  TipoRequisicion();
				
				tiporequisicionAux.setIsNew(false);
				tiporequisicionAux.setIsChanged(false);
				
				tiporequisicionAux.setIsDeleted(true);
				
				tiporequisicionAux.setId(this.tiporequisicion.getId());	
				tiporequisicionAux.setVersionRow(this.tiporequisicion.getVersionRow());	
				tiporequisicionAux.setid_empresa(this.tiporequisicion.getid_empresa());	
				tiporequisicionAux.setcodigo(this.tiporequisicion.getcodigo());	
				tiporequisicionAux.setnombre(this.tiporequisicion.getnombre());	
				tiporequisicionAux.setid_tipo_periodo(this.tiporequisicion.getid_tipo_periodo());	
				tiporequisicionAux.setid_dia(this.tiporequisicion.getid_dia());	
				tiporequisicionAux.sethora(this.tiporequisicion.gethora());	
				
				if(this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tiporequisicionAux.getId()>=0) {	
						this.tiporequisicionsEliminados.add(tiporequisicionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tiporequisicionAux,tiporequisicionLogic.getTipoRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporequisicionAux,tiporequisicions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tiporequisicionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporequisicionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporequisicionLogic.saveTipoRequisicions();//WithConnection
						//tiporequisicionLogic.getSetVersionRowTipoRequisicions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporequisicionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiporequisicionLogic.saveTipoRequisicionRelaciones(tiporequisicionAux);//WithConnection
								//tiporequisicionLogic.getSetVersionRowTipoRequisicions();//WithConnection
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
							if(this.tiporequisicionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tiporequisicionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tiporequisicionAux,tiporequisicionLogic.getTipoRequisicions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tiporequisicionAux,tiporequisicions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionLogic.getTipoRequisicions().addAll(this.tiporequisicionsEliminados);
					
					tiporequisicionLogic.saveTipoRequisicions();//WithConnection
					//tiporequisicionLogic.getSetVersionRowTipoRequisicions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoRequisicion();
				
				this.tiporequisicionsEliminados= new ArrayList<TipoRequisicion>();		
			}
			
			if(this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Requesicion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Requesicion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tiporequisicion=tiporequisicionAux;
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
      		//this.finishProcessTipoRequisicion();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoRequisicion tiporequisicionLocal) throws Exception {
		
		if(this.tiporequisicionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoRequisicion tiporequisicionLocal) throws Exception {	
		if(this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tiporequisicionLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoPeriodoDetalleFormJInternalFrame.class)) {
				TipoPeriodoBeanSwingJInternalFrame tipoperiodoBeanSwingJInternalFrameLocal=(TipoPeriodoBeanSwingJInternalFrame) ((TipoPeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoperiodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoPeriodo(tipoperiodoBeanSwingJInternalFrameLocal.gettipoperiodo(),true);
				tipoperiodoBeanSwingJInternalFrameLocal.actualizarLista(tipoperiodoBeanSwingJInternalFrameLocal.tipoperiodo,this.tipoperiodosForeignKey);

				tipoperiodoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoperiodoBeanSwingJInternalFrameLocal.tipoperiodo);

				tiporequisicionLocal.setTipoPeriodo(tipoperiodoBeanSwingJInternalFrameLocal.tipoperiodo);

				this.addItemDefectoCombosForeignKeyTipoPeriodo();
				this.cargarCombosFrameTipoPeriodosForeignKey("Formulario");
				this.setActualTipoPeriodoForeignKey(tipoperiodoBeanSwingJInternalFrameLocal.tipoperiodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(DiaDetalleFormJInternalFrame.class)) {
				DiaBeanSwingJInternalFrame diaBeanSwingJInternalFrameLocal=(DiaBeanSwingJInternalFrame) ((DiaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				diaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoDia(diaBeanSwingJInternalFrameLocal.getdia(),true);
				diaBeanSwingJInternalFrameLocal.actualizarLista(diaBeanSwingJInternalFrameLocal.dia,this.diasForeignKey);

				diaBeanSwingJInternalFrameLocal.actualizarRelaciones(diaBeanSwingJInternalFrameLocal.dia);

				tiporequisicionLocal.setDia(diaBeanSwingJInternalFrameLocal.dia);

				this.addItemDefectoCombosForeignKeyDia();
				this.cargarCombosFrameDiasForeignKey("Formulario");
				this.setActualDiaForeignKey(diaBeanSwingJInternalFrameLocal.dia.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoRequisicionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoRequisicion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiporequisicion =(TipoRequisicion) this.tiporequisicionLogic.getTipoRequisicions().toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tiporequisicion =(TipoRequisicion) this.tiporequisicions.toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tiporequisicionValidator.getInvalidValues(this.tiporequisicion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoRequisicion tiporequisicion,List<TipoRequisicion> tiporequisicions) throws Exception {
		try	{		
			TipoRequisicionConstantesFunciones.actualizarLista(tiporequisicion,tiporequisicions,this.tiporequisicionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoRequisicion tiporequisicion,List<TipoRequisicion> tiporequisicions) throws Exception {
		try	{			
			TipoRequisicionConstantesFunciones.actualizarSelectedLista(tiporequisicion,tiporequisicions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoRequisicion> tiporequisicionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tiporequisicionsLocal=this.tiporequisicionLogic.getTipoRequisicions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tiporequisicionsLocal=this.tiporequisicions;
			}
			//ARCHITECTURE
		
			for(TipoRequisicion tiporequisicionLocal:tiporequisicionsLocal) {
				if(this.permiteMantenimiento(tiporequisicionLocal) && tiporequisicionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoRequisicionConstantesFunciones.getTipoRequisicionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoRequisicionConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRequisicion.jLabelid_empresaTipoRequisicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRequisicionConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRequisicion.jLabelcodigoTipoRequisicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRequisicionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRequisicion.jLabelnombreTipoRequisicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRequisicionConstantesFunciones.IDTIPOPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRequisicion.jLabelid_tipo_periodoTipoRequisicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRequisicionConstantesFunciones.IDDIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRequisicion.jLabelid_diaTipoRequisicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRequisicionConstantesFunciones.HORA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRequisicion.jLabelhoraTipoRequisicion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoRequisicion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRequisicion.jLabelid_empresaTipoRequisicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRequisicion.jLabelcodigoTipoRequisicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRequisicion.jLabelnombreTipoRequisicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRequisicion.jLabelid_tipo_periodoTipoRequisicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRequisicion.jLabelid_diaTipoRequisicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRequisicion.jLabelhoraTipoRequisicion,"");
		
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
		this.iIdNuevoTipoRequisicion--;	
		
		
		this.tiporequisicionAux=new TipoRequisicion();
		
		this.tiporequisicionAux.setId(this.iIdNuevoTipoRequisicion);
		this.tiporequisicionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiporequisicionLogic.getTipoRequisicions().add(this.tiporequisicionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tiporequisicions.add(this.tiporequisicionAux);
		}
		//ARCHITECTURE
		
		this.tiporequisicion=this.tiporequisicionAux;
		
		if(TipoRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoRequisicion(this.tiporequisicion);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoRequisicion(this.tiporequisicion);
		}
				
		//this.setDefaultControlesTipoRequisicion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoRequisicion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoRequisicion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRequisicion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoRequisicion(this.tiporequisicionBean,this.tiporequisicion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoRequisicion(this.tiporequisicion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoRequisicionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tiporequisicionSessionBean.getConGuardarRelaciones()) {
			classes=TipoRequisicionConstantesFunciones.getClassesRelationshipsOfTipoRequisicion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tiporequisicionReturnGeneral=tiporequisicionLogic.procesarEventosTipoRequisicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporequisicionLogic.getTipoRequisicions(),this.tiporequisicion,this.tiporequisicionParameterGeneral,this.isEsNuevoTipoRequisicion,classes);//this.tiporequisicionLogic.getTipoRequisicion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoRequisicion(this.tiporequisicionReturnGeneral,this.tiporequisicionBean,false);
		
		if(this.tiporequisicionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoRequisicion(this.tiporequisicionReturnGeneral.getTipoRequisicion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoRequisicion(this.tiporequisicionReturnGeneral.getTipoRequisicion());
		}
		
		if(this.tiporequisicionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoRequisicion(this.tiporequisicionReturnGeneral.getTipoRequisicion(),classes);//this.tiporequisicionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoRequisicion(this.tiporequisicion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoRequisicion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoRequisicion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoRequisicionBeanSwingJInternalFrameAdditional.RecargarFormTipoRequisicion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoRequisicion(false);
						
			if(tiporequisicionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoRequisicionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRequisicion();
			}
			
			this.actualizarVisualTableDatosTipoRequisicion();
			
			this.jTableDatosTipoRequisicion.setRowSelectionInterval(this.getIndiceNuevoTipoRequisicion(), this.getIndiceNuevoTipoRequisicion());
			
			this.seleccionarFilaTablaTipoRequisicionActual();
						
			this.actualizarEstadoCeldasBotonesTipoRequisicion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoRequisicion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoRequisicion.jTextFieldcodigoTipoRequisicion.setEnabled(isHabilitar && this.tiporequisicionConstantesFunciones.activarcodigoTipoRequisicion);
		this.jInternalFrameDetalleFormTipoRequisicion.jTextFieldnombreTipoRequisicion.setEnabled(isHabilitar && this.tiporequisicionConstantesFunciones.activarnombreTipoRequisicion);
		this.jInternalFrameDetalleFormTipoRequisicion.jSpinnerhoraTipoRequisicion.setEnabled(isHabilitar && this.tiporequisicionConstantesFunciones.activarhoraTipoRequisicion);	
		//
		this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_empresaTipoRequisicion.setEnabled(isHabilitar && this.tiporequisicionConstantesFunciones.activarid_empresaTipoRequisicion);
		this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_tipo_periodoTipoRequisicion.setEnabled(isHabilitar && this.tiporequisicionConstantesFunciones.activarid_tipo_periodoTipoRequisicion);
		this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_diaTipoRequisicion.setEnabled(isHabilitar && this.tiporequisicionConstantesFunciones.activarid_diaTipoRequisicion);
	};
	
	public void setDefaultControlesTipoRequisicion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoRequisicion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tiporequisicionSessionBean.setConGuardarRelaciones(true);			
			this.tiporequisicionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoRequisicion.jTabbedPaneRelacionesTipoRequisicion.setVisible(true);
			
					
		} else {
			//this.tiporequisicionSessionBean.setConGuardarRelaciones(false);			
			this.tiporequisicionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoRequisicion.jTabbedPaneRelacionesTipoRequisicion.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoRequisicion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRequisicion tiporequisicionAux:this.tiporequisicionLogic.getTipoRequisicions()) {
				if(tiporequisicionAux.getId().equals(this.iIdNuevoTipoRequisicion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRequisicion tiporequisicionAux:this.tiporequisicions) {
				if(tiporequisicionAux.getId().equals(this.iIdNuevoTipoRequisicion)) {
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
	
	public int getIndiceActualTipoRequisicion(TipoRequisicion tiporequisicion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRequisicion tiporequisicionAux:this.tiporequisicionLogic.getTipoRequisicions()) {
				if(tiporequisicionAux.getId().equals(tiporequisicion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRequisicion tiporequisicionAux:this.tiporequisicions) {
				if(tiporequisicionAux.getId().equals(tiporequisicion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoRequisicion(TipoRequisicion tiporequisicionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRequisicion tiporequisicionAux:this.tiporequisicionLogic.getTipoRequisicions()) {
				if(tiporequisicionAux.getTipoRequisicionOriginal().getId().equals(tiporequisicionOriginal.getId())) {
					existe=true;
					tiporequisicionOriginal.setId(tiporequisicionAux.getId());
					tiporequisicionOriginal.setVersionRow(tiporequisicionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRequisicion tiporequisicionAux:this.tiporequisicions) {
				if(tiporequisicionAux.getTipoRequisicionOriginal().getId().equals(tiporequisicionOriginal.getId())) {
					existe=true;
					tiporequisicionOriginal.setId(tiporequisicionAux.getId());
					tiporequisicionOriginal.setVersionRow(tiporequisicionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoRequisicion(Boolean esParaCancelar) throws Exception {
		tiporequisicionsAux=new ArrayList<TipoRequisicion>();
		tiporequisicionAux=new TipoRequisicion();
		
		if(!this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoRequisicion tiporequisicionAux:this.tiporequisicionLogic.getTipoRequisicions()) {
					if(tiporequisicionAux.getId()<0) {
						tiporequisicionsAux.add(tiporequisicionAux);
					}		
				}
				this.iIdNuevoTipoRequisicion=0L;
				this.tiporequisicionLogic.getTipoRequisicions().removeAll(tiporequisicionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRequisicion tiporequisicionAux:this.tiporequisicions) {
					if(tiporequisicionAux.getId()<0) {
						tiporequisicionsAux.add(tiporequisicionAux);
					}		
				}
				this.iIdNuevoTipoRequisicion=0L;
				this.tiporequisicions.removeAll(tiporequisicionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoRequisicion 
					&& this.tiporequisicionLogic.getTipoRequisicions().size()>0
					) {
					tiporequisicionAux=this.tiporequisicionLogic.getTipoRequisicions().get(this.tiporequisicionLogic.getTipoRequisicions().size() - 1);
				
					if(tiporequisicionAux.getId()<0) {
						this.tiporequisicionLogic.getTipoRequisicions().remove(tiporequisicionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoRequisicion && this.tiporequisicions.size()>0) {
					tiporequisicionAux=this.tiporequisicions.get(this.tiporequisicions.size() - 1);
				
					if(tiporequisicionAux.getId()<0) {
						this.tiporequisicions.remove(tiporequisicionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoRequisicion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tiporequisicion.getId()<0) {
				this.tiporequisicionLogic.getTipoRequisicions().remove(this.tiporequisicion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tiporequisicion.getId()<0) {
				this.tiporequisicions.remove(this.tiporequisicion);
			}
		}			
	}
	
	public void setEstadosInicialesTipoRequisicion(List<TipoRequisicion> tiporequisicionsAux) throws Exception {
		TipoRequisicionConstantesFunciones.setEstadosInicialesTipoRequisicion(tiporequisicionsAux);
	}
	
	public void setEstadosInicialesTipoRequisicion(TipoRequisicion tiporequisicionAux) throws Exception {
		TipoRequisicionConstantesFunciones.setEstadosInicialesTipoRequisicion(tiporequisicionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoRequisicionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoRequisicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoRequisicionActual()) {
				if(!this.isEsNuevoTipoRequisicion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoRequisicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoRequisicion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoRequisicionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Requesicion ?", "MANTENIMIENTO DE Tipo Requesicion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoRequisicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoRequisicion tiporequisicion) throws Exception {
		TipoRequisicionConstantesFunciones.seleccionarAsignar(this.tiporequisicion,tiporequisicion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoRequisicion=this.isPermisoActualizarOriginalTipoRequisicion;
			
			
			this.seleccionarAsignar(tiporequisicion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoRequisicionConstantesFunciones.quitarEspaciosTipoRequisicion(this.tiporequisicion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoRequisicion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tiporequisicionSessionBean.setsFuncionBusquedaRapida(this.tiporequisicionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoRequisicion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoRequisicion(esParaCancelar);				
				this.cancelarNuevoTipoRequisicion(esParaCancelar);								
			}
			
			this.tiporequisicion=new TipoRequisicion();
			
			this.inicializarTipoRequisicion();
			
			this.actualizarEstadoCeldasBotonesTipoRequisicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoRequisicion() throws Exception {
		try {
			TipoRequisicionConstantesFunciones.inicializarTipoRequisicion(this.tiporequisicion);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tiporequisicionLogic.getTipoRequisicions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoRequisicions(String sAccionBusqueda,List<TipoRequisicion> tiporequisicionsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoRequisicion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoRequisicionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoRequisicionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoRequisicion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Requesiciones");		
		parameters.put("busquedapor", TipoRequisicionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoRequisicion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoRequisicionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoRequisicionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoRequisicion=new JRBeanArrayDataSource(TipoRequisicionJInternalFrame.TraerTipoRequisicionBeans(tiporequisicionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoRequisicion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoRequisicionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoRequisicionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoRequisicionBean.TraerTipoRequisicionBeans(tiporequisicionsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoRequisicions(sAccionBusqueda,sTipoArchivoReporte,tiporequisicionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoRequisicions(sAccionBusqueda,sTipoArchivoReporte,tiporequisicionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoRequisicionActionPerformed(null);
					//this.generarExcelReporteTipoRequisicions(sAccionBusqueda,sTipoArchivoReporte,tiporequisicionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoRequisicions(sAccionBusqueda,sTipoArchivoReporte,tiporequisicionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoRequisicions(sAccionBusqueda,sTipoArchivoReporte,tiporequisicionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoRequisicions(sAccionBusqueda,sTipoArchivoReporte,tiporequisicionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoRequisicions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRequisicion> tiporequisicionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporequisicion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRequisicions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoRequisicion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoRequisicion tiporequisicion : tiporequisicionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoRequisicionConstantesFunciones.generarExcelReporteDataTipoRequisicion("NORMAL",row,workbook,tiporequisicion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Requesicion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoRequisicion(String sTipo,Row row,Workbook workbook) {
		
		TipoRequisicionConstantesFunciones.generarExcelReporteHeaderTipoRequisicion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoRequisicions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRequisicion> tiporequisicionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporequisicion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRequisicions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoRequisicion tiporequisicion : tiporequisicionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoRequisicionConstantesFunciones.getTipoRequisicionDescripcion(tiporequisicion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRequisicionConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRequisicionConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporequisicion.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRequisicionConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRequisicionConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporequisicion.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRequisicionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRequisicionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporequisicion.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRequisicionConstantesFunciones.LABEL_IDTIPOPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRequisicionConstantesFunciones.LABEL_IDTIPOPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporequisicion.gettipoperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRequisicionConstantesFunciones.LABEL_IDDIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRequisicionConstantesFunciones.LABEL_IDDIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporequisicion.getdia_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRequisicionConstantesFunciones.LABEL_HORA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRequisicionConstantesFunciones.LABEL_HORA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporequisicion.gethora());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Requesicion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoRequisicions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRequisicion> tiporequisicionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoRequisicion> tiporequisicionsRespaldo=null;
		
		classes=TipoRequisicionConstantesFunciones.getClassesRelationshipsOfTipoRequisicion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tiporequisicionLogic.setDatosCliente(this.datosCliente);
		this.tiporequisicionLogic.setDatosDeep(this.datosDeep);
		this.tiporequisicionLogic.setIsConDeep(true);
		
		tiporequisicionsRespaldo=this.tiporequisicionLogic.getTipoRequisicions();
		
		this.tiporequisicionLogic.setTipoRequisicions(tiporequisicionsParaReportes);	
		this.tiporequisicionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tiporequisicionsParaReportes=this.tiporequisicionLogic.getTipoRequisicions();
		this.tiporequisicionLogic.setTipoRequisicions(tiporequisicionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporequisicion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRequisicions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoRequisicion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoRequisicion tiporequisicion : tiporequisicionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoRequisicion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoRequisicionConstantesFunciones.generarExcelReporteDataTipoRequisicion("NORMAL",row,workbook,tiporequisicion,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoRequisicionConstantesFunciones.getTipoRequisicionDescripcion(tiporequisicion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Requesicion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRequisicion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRequisicion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRequisicion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRequisicion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoRequisicion() throws Exception {		
		this.startProcessTipoRequisicion(true);
	}
	
	public void startProcessTipoRequisicion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoRequisicion ,this.jPanelParametrosReportesTipoRequisicion, this.jScrollPanelDatosTipoRequisicion,this.jPanelPaginacionTipoRequisicion, this.jScrollPanelDatosEdicionTipoRequisicion, this.jPanelAccionesTipoRequisicion,this.jPanelAccionesFormularioTipoRequisicion,this.jmenuBarTipoRequisicion,this.jmenuBarDetalleTipoRequisicion,this.jTtoolBarTipoRequisicion,this.jTtoolBarDetalleTipoRequisicion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoRequisicion=this.jTabbedPaneBusquedasTipoRequisicion; 
		
		final JPanel jPanelParametrosReportesTipoRequisicion=this.jPanelParametrosReportesTipoRequisicion;
		//final JScrollPane jScrollPanelDatosTipoRequisicion=this.jScrollPanelDatosTipoRequisicion;
		final JTable jTableDatosTipoRequisicion=this.jTableDatosTipoRequisicion;		
		final JPanel jPanelPaginacionTipoRequisicion=this.jPanelPaginacionTipoRequisicion;
		//final JScrollPane jScrollPanelDatosEdicionTipoRequisicion=this.jScrollPanelDatosEdicionTipoRequisicion;
		final JPanel jPanelAccionesTipoRequisicion=this.jPanelAccionesTipoRequisicion;
		
		JPanel jPanelCamposAuxiliarTipoRequisicion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoRequisicion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoRequisicion!=null) {
			jPanelCamposAuxiliarTipoRequisicion=this.jInternalFrameDetalleFormTipoRequisicion.jPanelCamposTipoRequisicion;
			jPanelAccionesFormularioAuxiliarTipoRequisicion=this.jInternalFrameDetalleFormTipoRequisicion.jPanelAccionesFormularioTipoRequisicion;
		}
		
		final JPanel jPanelCamposTipoRequisicion=jPanelCamposAuxiliarTipoRequisicion;
		final JPanel jPanelAccionesFormularioTipoRequisicion=jPanelAccionesFormularioAuxiliarTipoRequisicion;
		
		
		final JMenuBar jmenuBarTipoRequisicion=this.jmenuBarTipoRequisicion;
		final JToolBar jTtoolBarTipoRequisicion=this.jTtoolBarTipoRequisicion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoRequisicion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoRequisicion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoRequisicion!=null) {
			jmenuBarDetalleAuxiliarTipoRequisicion=this.jInternalFrameDetalleFormTipoRequisicion.jmenuBarDetalleTipoRequisicion;
			jTtoolBarDetalleAuxiliarTipoRequisicion=this.jInternalFrameDetalleFormTipoRequisicion.jTtoolBarDetalleTipoRequisicion;
		}
		
		final JMenuBar jmenuBarDetalleTipoRequisicion=jmenuBarDetalleAuxiliarTipoRequisicion;
		final JToolBar jTtoolBarDetalleTipoRequisicion=jTtoolBarDetalleAuxiliarTipoRequisicion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoRequisicion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoRequisicion;
			processRunnable.jTableDatos=jTableDatosTipoRequisicion;
			processRunnable.jPanelCampos=jPanelCamposTipoRequisicion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoRequisicion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoRequisicion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoRequisicion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoRequisicion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoRequisicion;
			processRunnable.jTtoolBar=jTtoolBarTipoRequisicion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoRequisicion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoRequisicion ,jPanelParametrosReportesTipoRequisicion,jTableDatosTipoRequisicion, /*jScrollPanelDatosTipoRequisicion,*/jPanelCamposTipoRequisicion,jPanelPaginacionTipoRequisicion, /*jScrollPanelDatosEdicionTipoRequisicion,*/ jPanelAccionesTipoRequisicion,jPanelAccionesFormularioTipoRequisicion,jmenuBarTipoRequisicion,jmenuBarDetalleTipoRequisicion,jTtoolBarTipoRequisicion,jTtoolBarDetalleTipoRequisicion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoRequisicion ,jPanelParametrosReportesTipoRequisicion, jScrollPanelDatosTipoRequisicion,jPanelPaginacionTipoRequisicion, jScrollPanelDatosEdicionTipoRequisicion, jPanelAccionesTipoRequisicion,jPanelAccionesFormularioTipoRequisicion,jmenuBarTipoRequisicion,jmenuBarDetalleTipoRequisicion,jTtoolBarTipoRequisicion,jTtoolBarDetalleTipoRequisicion);
						
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
	
	public void finishProcessTipoRequisicion() {// throws Exception 
		this.finishProcessTipoRequisicion(true);
	}
	
	public void finishProcessTipoRequisicion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoRequisicion ,this.jPanelParametrosReportesTipoRequisicion, this.jScrollPanelDatosTipoRequisicion,this.jPanelPaginacionTipoRequisicion, this.jScrollPanelDatosEdicionTipoRequisicion, this.jPanelAccionesTipoRequisicion,this.jPanelAccionesFormularioTipoRequisicion,this.jmenuBarTipoRequisicion,this.jmenuBarDetalleTipoRequisicion,this.jTtoolBarTipoRequisicion,this.jTtoolBarDetalleTipoRequisicion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoRequisicion=this.jTabbedPaneBusquedasTipoRequisicion; 
		
		final JPanel jPanelParametrosReportesTipoRequisicion=this.jPanelParametrosReportesTipoRequisicion;
		//final JScrollPane jScrollPanelDatosTipoRequisicion=this.jScrollPanelDatosTipoRequisicion;
		final JTable jTableDatosTipoRequisicion=this.jTableDatosTipoRequisicion;		
		final JPanel jPanelPaginacionTipoRequisicion=this.jPanelPaginacionTipoRequisicion;
		//final JScrollPane jScrollPanelDatosEdicionTipoRequisicion=this.jScrollPanelDatosEdicionTipoRequisicion;
		final JPanel jPanelAccionesTipoRequisicion=this.jPanelAccionesTipoRequisicion;
		
		JPanel jPanelCamposAuxiliarTipoRequisicion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoRequisicion=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoRequisicion!=null) {
			jPanelCamposAuxiliarTipoRequisicion=this.jInternalFrameDetalleFormTipoRequisicion.jPanelCamposTipoRequisicion;
			jPanelAccionesFormularioAuxiliarTipoRequisicion=this.jInternalFrameDetalleFormTipoRequisicion.jPanelAccionesFormularioTipoRequisicion;
		}
		
		final JPanel jPanelCamposTipoRequisicion=jPanelCamposAuxiliarTipoRequisicion;
		final JPanel jPanelAccionesFormularioTipoRequisicion=jPanelAccionesFormularioAuxiliarTipoRequisicion;
		
		
		final JMenuBar jmenuBarTipoRequisicion=this.jmenuBarTipoRequisicion;		
		final JToolBar jTtoolBarTipoRequisicion=this.jTtoolBarTipoRequisicion;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoRequisicion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoRequisicion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoRequisicion!=null) {
			jmenuBarDetalleAuxiliarTipoRequisicion=this.jInternalFrameDetalleFormTipoRequisicion.jmenuBarDetalleTipoRequisicion;
			jTtoolBarDetalleAuxiliarTipoRequisicion=this.jInternalFrameDetalleFormTipoRequisicion.jTtoolBarDetalleTipoRequisicion;		
		}
		
		final JMenuBar jmenuBarDetalleTipoRequisicion=jmenuBarDetalleAuxiliarTipoRequisicion;
		final JToolBar jTtoolBarDetalleTipoRequisicion=jTtoolBarDetalleAuxiliarTipoRequisicion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoRequisicion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoRequisicion;
			processRunnable.jTableDatos=jTableDatosTipoRequisicion;
			processRunnable.jPanelCampos=jPanelCamposTipoRequisicion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoRequisicion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoRequisicion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoRequisicion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoRequisicion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoRequisicion;
			processRunnable.jTtoolBar=jTtoolBarTipoRequisicion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoRequisicion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoRequisicion ,jPanelParametrosReportesTipoRequisicion, jTableDatosTipoRequisicion,/*jScrollPanelDatosTipoRequisicion,*/jPanelCamposTipoRequisicion,jPanelPaginacionTipoRequisicion, /*jScrollPanelDatosEdicionTipoRequisicion,*/ jPanelAccionesTipoRequisicion,jPanelAccionesFormularioTipoRequisicion,jmenuBarTipoRequisicion,jmenuBarDetalleTipoRequisicion,jTtoolBarTipoRequisicion,jTtoolBarDetalleTipoRequisicion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoRequisicion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoRequisicion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoRequisicion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoRequisicion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoRequisicion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoRequisicion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoRequisicion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoRequisicion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoRequisicion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tiporequisicionConstantesFunciones.getsFinalQueryTipoRequisicion();
		String  finalQueryPaginacionTodos=this.tiporequisicionConstantesFunciones.getsFinalQueryTipoRequisicion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoRequisicionConstantesFunciones.getArrayColumnasGlobalesNoTipoRequisicion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoRequisicionConstantesFunciones.getArrayColumnasGlobalesTipoRequisicion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoRequisicionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tiporequisicionsEliminados= new ArrayList<TipoRequisicion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoRequisicion();
		
				///*TipoRequisicionSessionBean*/this.tiporequisicionSessionBean=new TipoRequisicionSessionBean();
			
			if(this.tiporequisicionSessionBean==null) {
				this.tiporequisicionSessionBean=new TipoRequisicionSessionBean();
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
					this.iNumeroPaginacion=TipoRequisicionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoRequisicionConstantesFunciones.getClassesForeignKeysOfTipoRequisicion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tiporequisicion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tiporequisicionsAux= new ArrayList<TipoRequisicion>();
			
				
			tiporequisicionLogic.setDatosCliente(this.datosCliente);
			tiporequisicionLogic.setDatosDeep(this.datosDeep);
			tiporequisicionLogic.setIsConDeep(true);
			
			
			tiporequisicionLogic.getTipoRequisicionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tiporequisicionLogic.getTodosTipoRequisicions(finalQueryGlobal,pagination);
					
					//tiporequisicionLogic.getTodosTipoRequisicionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tiporequisicionLogic.getTipoRequisicions()==null|| tiporequisicionLogic.getTipoRequisicions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporequisicionsAux= new ArrayList<TipoRequisicion>();
							tiporequisicionsAux.addAll(tiporequisicionLogic.getTipoRequisicions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporequisicionsAux= new ArrayList<TipoRequisicion>();
							tiporequisicionsAux.addAll(tiporequisicions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporequisicionLogic.getTodosTipoRequisicions(finalQueryGlobal+"",this.pagination);												
							
							//tiporequisicionLogic.getTodosTipoRequisicionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoRequisicions("Todos",tiporequisicionLogic.getTipoRequisicions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporequisicionLogic.setTipoRequisicions(new ArrayList<TipoRequisicion>());					
							tiporequisicionLogic.getTipoRequisicions().addAll(tiporequisicionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporequisicions=new ArrayList<TipoRequisicion>();
							tiporequisicions.addAll(tiporequisicionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoRequisicion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoRequisicion=this.idActual;
				
				} else if(this.idTipoRequisicionActual!=null && this.idTipoRequisicionActual!=0L) {
					idTipoRequisicion=idTipoRequisicionActual;
				}
				
					
				this.sDetalleReporte=TipoRequisicionConstantesFunciones.getDetalleIndicePorId(idTipoRequisicion);
				
				this.tiporequisicions=new ArrayList<TipoRequisicion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tiporequisicionLogic.getEntity(idTipoRequisicion);
					
					//tiporequisicionLogic.getEntityWithConnection(idTipoRequisicion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporequisicionLogic.setTipoRequisicions(new ArrayList<TipoRequisicion>());
					tiporequisicionLogic.getTipoRequisicions().add(tiporequisicionLogic.getTipoRequisicion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporequisicions=new ArrayList<TipoRequisicion>();
					this.tiporequisicions.add(tiporequisicion);
				}
				
				if(tiporequisicionLogic.getTipoRequisicion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TipoRequisicionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tiporequisicionLogic.getTipoRequisicionsBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRequisicionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRequisicionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tiporequisicionLogic.getTipoRequisicions()==null||tiporequisicionLogic.getTipoRequisicions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tiporequisicions==null|| tiporequisicions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporequisicionsAux=new ArrayList<TipoRequisicion>();
						tiporequisicionsAux.addAll(tiporequisicionLogic.getTipoRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporequisicionsAux=new ArrayList<TipoRequisicion>();
							tiporequisicionsAux.addAll(tiporequisicions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tiporequisicionLogic.getTipoRequisicionsBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRequisicionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRequisicionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoRequisicions("BusquedaPorCodigo",tiporequisicionLogic.getTipoRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoRequisicions("BusquedaPorCodigo",tiporequisicions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporequisicionLogic.setTipoRequisicions(new ArrayList<TipoRequisicion>());
						tiporequisicionLogic.getTipoRequisicions().addAll(tiporequisicionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporequisicions=new ArrayList<TipoRequisicion>();
							tiporequisicions.addAll(tiporequisicionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoRequisicionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tiporequisicionLogic.getTipoRequisicionsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRequisicionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRequisicionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tiporequisicionLogic.getTipoRequisicions()==null||tiporequisicionLogic.getTipoRequisicions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tiporequisicions==null|| tiporequisicions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporequisicionsAux=new ArrayList<TipoRequisicion>();
						tiporequisicionsAux.addAll(tiporequisicionLogic.getTipoRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporequisicionsAux=new ArrayList<TipoRequisicion>();
							tiporequisicionsAux.addAll(tiporequisicions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tiporequisicionLogic.getTipoRequisicionsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRequisicionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRequisicionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoRequisicions("BusquedaPorNombre",tiporequisicionLogic.getTipoRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoRequisicions("BusquedaPorNombre",tiporequisicions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporequisicionLogic.setTipoRequisicions(new ArrayList<TipoRequisicion>());
						tiporequisicionLogic.getTipoRequisicions().addAll(tiporequisicionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporequisicions=new ArrayList<TipoRequisicion>();
							tiporequisicions.addAll(tiporequisicionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdDia")) {
				this.sDetalleReporte=TipoRequisicionConstantesFunciones.getDetalleIndiceFK_IdDia(id_diaFK_IdDia);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tiporequisicionLogic.getTipoRequisicionsFK_IdDia(finalQueryGlobal,pagination,id_diaFK_IdDia);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRequisicionConstantesFunciones.getDetalleIndiceFK_IdDia(id_diaFK_IdDia);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRequisicionConstantesFunciones.getDetalleIndiceFK_IdDia(id_diaFK_IdDia);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tiporequisicionLogic.getTipoRequisicions()==null||tiporequisicionLogic.getTipoRequisicions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tiporequisicions==null|| tiporequisicions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporequisicionsAux=new ArrayList<TipoRequisicion>();
						tiporequisicionsAux.addAll(tiporequisicionLogic.getTipoRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporequisicionsAux=new ArrayList<TipoRequisicion>();
							tiporequisicionsAux.addAll(tiporequisicions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tiporequisicionLogic.getTipoRequisicionsFK_IdDia(finalQueryGlobal,pagination,id_diaFK_IdDia);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRequisicionConstantesFunciones.getDetalleIndiceFK_IdDia(id_diaFK_IdDia);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRequisicionConstantesFunciones.getDetalleIndiceFK_IdDia(id_diaFK_IdDia);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoRequisicions("FK_IdDia",tiporequisicionLogic.getTipoRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoRequisicions("FK_IdDia",tiporequisicions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporequisicionLogic.setTipoRequisicions(new ArrayList<TipoRequisicion>());
						tiporequisicionLogic.getTipoRequisicions().addAll(tiporequisicionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporequisicions=new ArrayList<TipoRequisicion>();
							tiporequisicions.addAll(tiporequisicionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoRequisicionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tiporequisicionLogic.getTipoRequisicionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRequisicionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRequisicionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tiporequisicionLogic.getTipoRequisicions()==null||tiporequisicionLogic.getTipoRequisicions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tiporequisicions==null|| tiporequisicions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporequisicionsAux=new ArrayList<TipoRequisicion>();
						tiporequisicionsAux.addAll(tiporequisicionLogic.getTipoRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporequisicionsAux=new ArrayList<TipoRequisicion>();
							tiporequisicionsAux.addAll(tiporequisicions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tiporequisicionLogic.getTipoRequisicionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRequisicionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRequisicionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoRequisicions("FK_IdEmpresa",tiporequisicionLogic.getTipoRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoRequisicions("FK_IdEmpresa",tiporequisicions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporequisicionLogic.setTipoRequisicions(new ArrayList<TipoRequisicion>());
						tiporequisicionLogic.getTipoRequisicions().addAll(tiporequisicionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporequisicions=new ArrayList<TipoRequisicion>();
							tiporequisicions.addAll(tiporequisicionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoPeriodo")) {
				this.sDetalleReporte=TipoRequisicionConstantesFunciones.getDetalleIndiceFK_IdTipoPeriodo(id_tipo_periodoFK_IdTipoPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tiporequisicionLogic.getTipoRequisicionsFK_IdTipoPeriodo(finalQueryGlobal,pagination,id_tipo_periodoFK_IdTipoPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRequisicionConstantesFunciones.getDetalleIndiceFK_IdTipoPeriodo(id_tipo_periodoFK_IdTipoPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRequisicionConstantesFunciones.getDetalleIndiceFK_IdTipoPeriodo(id_tipo_periodoFK_IdTipoPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tiporequisicionLogic.getTipoRequisicions()==null||tiporequisicionLogic.getTipoRequisicions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tiporequisicions==null|| tiporequisicions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporequisicionsAux=new ArrayList<TipoRequisicion>();
						tiporequisicionsAux.addAll(tiporequisicionLogic.getTipoRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporequisicionsAux=new ArrayList<TipoRequisicion>();
							tiporequisicionsAux.addAll(tiporequisicions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tiporequisicionLogic.getTipoRequisicionsFK_IdTipoPeriodo(finalQueryGlobal,pagination,id_tipo_periodoFK_IdTipoPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRequisicionConstantesFunciones.getDetalleIndiceFK_IdTipoPeriodo(id_tipo_periodoFK_IdTipoPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRequisicionConstantesFunciones.getDetalleIndiceFK_IdTipoPeriodo(id_tipo_periodoFK_IdTipoPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoRequisicions("FK_IdTipoPeriodo",tiporequisicionLogic.getTipoRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoRequisicions("FK_IdTipoPeriodo",tiporequisicions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporequisicionLogic.setTipoRequisicions(new ArrayList<TipoRequisicion>());
						tiporequisicionLogic.getTipoRequisicions().addAll(tiporequisicionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporequisicions=new ArrayList<TipoRequisicion>();
							tiporequisicions.addAll(tiporequisicionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoRequisicion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoRequisicion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiporequisicionLogic.getTipoRequisicions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporequisicions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiporequisicionLogic.getTipoRequisicions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporequisicions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoRequisicion tiporequisicion) {
		Boolean permite=true;
		
		if(this.tiporequisicion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoRequisicionConstantesFunciones.getOrderByListaTipoRequisicion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoRequisicionConstantesFunciones.getOrderByListaTipoRequisicion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRequisicion tiporequisicion:tiporequisicionLogic.getTipoRequisicions()) {
				if(tiporequisicion.getsType().equals(Constantes2.S_TOTALES)) {
					tiporequisicionTotales=tiporequisicion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRequisicion tiporequisicion:this.tiporequisicions) {
				if(tiporequisicion.getsType().equals(Constantes2.S_TOTALES)) {
					tiporequisicionTotales=tiporequisicion;
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
			this.tiporequisicionAux=new TipoRequisicion();
			this.tiporequisicionAux.setsType(Constantes2.S_TOTALES);
			this.tiporequisicionAux.setIsNew(false);
			this.tiporequisicionAux.setIsChanged(false);
			this.tiporequisicionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoRequisicionConstantesFunciones.TotalizarValoresFilaTipoRequisicion(this.tiporequisicionLogic.getTipoRequisicions(),this.tiporequisicionAux);
				
				this.tiporequisicionLogic.getTipoRequisicions().add(this.tiporequisicionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoRequisicionConstantesFunciones.TotalizarValoresFilaTipoRequisicion(this.tiporequisicions,this.tiporequisicionAux);
				
				this.tiporequisicions.add(this.tiporequisicionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tiporequisicionTotales=new TipoRequisicion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiporequisicionLogic.getTipoRequisicions().remove(tiporequisicionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiporequisicions.remove(tiporequisicionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tiporequisicionTotales=new TipoRequisicion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRequisicion tiporequisicion:tiporequisicionLogic.getTipoRequisicions()) {
				if(tiporequisicion.getsType().equals(Constantes2.S_TOTALES)) {
					tiporequisicionTotales=tiporequisicion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoRequisicionConstantesFunciones.TotalizarValoresFilaTipoRequisicion(this.tiporequisicionLogic.getTipoRequisicions(),tiporequisicionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRequisicion tiporequisicion:this.tiporequisicions) {
				if(tiporequisicion.getsType().equals(Constantes2.S_TOTALES)) {
					tiporequisicionTotales=tiporequisicion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoRequisicionConstantesFunciones.TotalizarValoresFilaTipoRequisicion(this.tiporequisicions,tiporequisicionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoRequisicionsBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoRequisicionsBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoRequisicionsFK_IdDia()throws Exception {
		try {
			sAccionBusqueda="FK_IdDia";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoRequisicionsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoRequisicionsFK_IdTipoPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoRequisicionsBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporequisicionLogic.getTipoRequisicionsBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoRequisicionsBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporequisicionLogic.getTipoRequisicionsBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoRequisicionsFK_IdDia(String sFinalQuery,Long id_dia)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporequisicionLogic.getTipoRequisicionsFK_IdDia(sFinalQuery,this.pagination,id_dia);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoRequisicionsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporequisicionLogic.getTipoRequisicionsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoRequisicionsFK_IdTipoPeriodo(String sFinalQuery,Long id_tipo_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporequisicionLogic.getTipoRequisicionsFK_IdTipoPeriodo(sFinalQuery,this.pagination,id_tipo_periodo);
				
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
	
	public void inicializarPermisosTipoRequisicion() {
		this.isPermisoTodoTipoRequisicion=false;
		this.isPermisoNuevoTipoRequisicion=false;
		this.isPermisoActualizarTipoRequisicion=false;
		this.isPermisoActualizarOriginalTipoRequisicion=false;
		this.isPermisoEliminarTipoRequisicion=false;
		this.isPermisoGuardarCambiosTipoRequisicion=false;
		this.isPermisoConsultaTipoRequisicion=false;
		this.isPermisoBusquedaTipoRequisicion=false;
		this.isPermisoReporteTipoRequisicion=false;		
		this.isPermisoOrdenTipoRequisicion=false;		
		this.isPermisoPaginacionMedioTipoRequisicion=false;		
		this.isPermisoPaginacionAltoTipoRequisicion=false;
		this.isPermisoPaginacionTodoTipoRequisicion=false;
		this.isPermisoCopiarTipoRequisicion=false;		
		this.isPermisoVerFormTipoRequisicion=false;		
		this.isPermisoDuplicarTipoRequisicion=false;		
		this.isPermisoOrdenTipoRequisicion=false;		
	}
	
	public void setPermisosUsuarioTipoRequisicion(Boolean isPermiso) {
		this.isPermisoTodoTipoRequisicion=isPermiso;
		this.isPermisoNuevoTipoRequisicion=isPermiso;
		this.isPermisoActualizarTipoRequisicion=isPermiso;
		this.isPermisoActualizarOriginalTipoRequisicion=isPermiso;
		this.isPermisoEliminarTipoRequisicion=isPermiso;
		this.isPermisoGuardarCambiosTipoRequisicion=isPermiso;
		this.isPermisoConsultaTipoRequisicion=isPermiso;
		this.isPermisoBusquedaTipoRequisicion=isPermiso;
		this.isPermisoReporteTipoRequisicion=isPermiso;
		this.isPermisoOrdenTipoRequisicion=isPermiso;		
		this.isPermisoPaginacionMedioTipoRequisicion=isPermiso;		
		this.isPermisoPaginacionAltoTipoRequisicion=isPermiso;		
		this.isPermisoPaginacionTodoTipoRequisicion=isPermiso;		
		this.isPermisoCopiarTipoRequisicion=isPermiso;		
		this.isPermisoVerFormTipoRequisicion=isPermiso;		
		this.isPermisoDuplicarTipoRequisicion=isPermiso;
		this.isPermisoOrdenTipoRequisicion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoRequisicion(Boolean isPermiso) {
		//this.isPermisoTodoTipoRequisicion=isPermiso;
		this.isPermisoNuevoTipoRequisicion=isPermiso;
		this.isPermisoActualizarTipoRequisicion=isPermiso;
		this.isPermisoActualizarOriginalTipoRequisicion=isPermiso;
		this.isPermisoEliminarTipoRequisicion=isPermiso;
		this.isPermisoGuardarCambiosTipoRequisicion=isPermiso;
		//this.isPermisoConsultaTipoRequisicion=isPermiso;
		//this.isPermisoBusquedaTipoRequisicion=isPermiso;
		//this.isPermisoReporteTipoRequisicion=isPermiso;
		//this.isPermisoOrdenTipoRequisicion=isPermiso;		
		//this.isPermisoPaginacionMedioTipoRequisicion=isPermiso;		
		//this.isPermisoPaginacionAltoTipoRequisicion=isPermiso;		
		//this.isPermisoPaginacionTodoTipoRequisicion=isPermiso;		
		//this.isPermisoCopiarTipoRequisicion=isPermiso;		
		//this.isPermisoDuplicarTipoRequisicion=isPermiso;
		//this.isPermisoOrdenTipoRequisicion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoRequisicionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoRequisicionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoRequisicion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoRequisicionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoRequisicionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoRequisicionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoRequisicionClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoRequisicion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoRequisicionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoRequisicionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoRequisicion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoRequisicion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoRequisicion=this.isPermisoActualizarTipoRequisicion;
			this.isPermisoEliminarTipoRequisicion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoRequisicion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoRequisicion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoRequisicion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoRequisicion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoRequisicion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoRequisicion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoRequisicion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoRequisicion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoRequisicion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoRequisicion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoRequisicion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoRequisicion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoRequisicion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoRequisicion.setToolTipText(this.jTableDatosTipoRequisicion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoRequisicion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoRequisicion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoRequisicionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoRequisicionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoRequisicion() throws Exception {
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
	public void inicializarCombosForeignKeyTipoRequisicionListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.tipoperiodosForeignKey=new ArrayList();
				this.diasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoRequisicionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoRequisicionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoRequisicionListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyDiaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoPeriodoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoperiodosForeignKey==null||this.tipoperiodosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoPeriodoConstantesFunciones.getArrayColumnasGlobalesTipoPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoPeriodoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoPeriodoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoPeriodosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyDiaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.diasForeignKey==null||this.diasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=DiaConstantesFunciones.getArrayColumnasGlobalesDia(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DiaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=DiaConstantesFunciones.SFINALQUERY;

				this.cargarCombosDiasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTipoRequisicionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoRequisicionParameterReturnGeneral tiporequisicionReturnGeneral=new TipoRequisicionParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tiporequisicionConstantesFunciones.cargarid_empresaTipoRequisicion)
					 || (this.esRecargarFks && this.tiporequisicionConstantesFunciones.cargarid_empresaTipoRequisicion)) {

					if(!this.tiporequisicionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tiporequisicionSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalTipoPeriodo="";

				if(((this.tipoperiodosForeignKey==null||this.tipoperiodosForeignKey.size()<=0) && this.tiporequisicionConstantesFunciones.cargarid_tipo_periodoTipoRequisicion)
					 || (this.esRecargarFks && this.tiporequisicionConstantesFunciones.cargarid_tipo_periodoTipoRequisicion)) {

					if(!this.tiporequisicionSessionBean.getisBusquedaDesdeForeignKeySesionTipoPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoPeriodoConstantesFunciones.getArrayColumnasGlobalesTipoPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoPeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoPeriodo, "");
						finalQueryGlobalTipoPeriodo+=TipoPeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoPeriodo=" WHERE " + ConstantesSql.ID + "="+tiporequisicionSessionBean.getlidTipoPeriodoActual();
					}
				} else {
					finalQueryGlobalTipoPeriodo="NONE";
				}


				String finalQueryGlobalDia="";

				if(((this.diasForeignKey==null||this.diasForeignKey.size()<=0) && this.tiporequisicionConstantesFunciones.cargarid_diaTipoRequisicion)
					 || (this.esRecargarFks && this.tiporequisicionConstantesFunciones.cargarid_diaTipoRequisicion)) {

					if(!this.tiporequisicionSessionBean.getisBusquedaDesdeForeignKeySesionDia()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=DiaConstantesFunciones.getArrayColumnasGlobalesDia(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalDia=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DiaConstantesFunciones.TABLENAME);

						finalQueryGlobalDia=Funciones.GetFinalQueryAppend(finalQueryGlobalDia, "");
						finalQueryGlobalDia+=DiaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosDiasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalDia=" WHERE " + ConstantesSql.ID + "="+tiporequisicionSessionBean.getlidDiaActual();
					}
				} else {
					finalQueryGlobalDia="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tiporequisicionReturnGeneral=tiporequisicionLogic.cargarCombosLoteForeignKeyTipoRequisicion(finalQueryGlobalEmpresa,finalQueryGlobalTipoPeriodo,finalQueryGlobalDia);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tiporequisicionReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalTipoPeriodo.equals("NONE")) {
				this.tipoperiodosForeignKey=tiporequisicionReturnGeneral.gettipoperiodosForeignKey();
			}

			if(!finalQueryGlobalDia.equals("NONE")) {
				this.diasForeignKey=tiporequisicionReturnGeneral.getdiasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoRequisicion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTipoPeriodo();
			this.addItemDefectoCombosForeignKeyDia();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tiporequisicionSessionBean==null) {
				this.tiporequisicionSessionBean=new TipoRequisicionSessionBean();
			}

			if(!this.tiporequisicionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyTipoPeriodo()throws Exception {
		try {

			if(!this.tiporequisicionSessionBean.getisBusquedaDesdeForeignKeySesionTipoPeriodo()) {
				TipoPeriodo tipoperiodo=new TipoPeriodo();
				TipoPeriodoConstantesFunciones.setTipoPeriodoDescripcion(tipoperiodo,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoperiodo.setId(null);

				if(!TipoPeriodoConstantesFunciones.ExisteEnLista(this.tipoperiodosForeignKey,tipoperiodo,true)) {

					this.tipoperiodosForeignKey.add(0,tipoperiodo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyDia()throws Exception {
		try {

			if(!this.tiporequisicionSessionBean.getisBusquedaDesdeForeignKeySesionDia()) {
				Dia dia=new Dia();
				DiaConstantesFunciones.setDiaDescripcion(dia,Constantes.SMENSAJE_ESCOJA_OPCION);
				dia.setId(null);

				if(!DiaConstantesFunciones.ExisteEnLista(this.diasForeignKey,dia,true)) {

					this.diasForeignKey.add(0,dia);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTipoRequisicion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoRequisicion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoRequisicion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRequisicion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoRequisicion(TipoRequisicion tiporequisicion)throws Exception {	
		try {
			
			this.setActualTipoPeriodoForeignKey(tiporequisicion.getid_tipo_periodo(),false,"Formulario");
			this.setActualDiaForeignKey(tiporequisicion.getid_dia(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoRequisicion(TipoRequisicion tiporequisicion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoRequisicion()throws Exception {	
		try {
			
			this.setActualTipoPeriodoForeignKey(this.tiporequisicionConstantesFunciones.getid_tipo_periodo(),false,"Formulario");
			this.setActualDiaForeignKey(this.tiporequisicionConstantesFunciones.getid_dia(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRequisicion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoRequisicion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoRequisicion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoRequisicion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoRequisicion()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTipoPeriodosForeignKey("Todos");
			this.cargarCombosFrameDiasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoRequisicion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoPeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameDiasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoRequisicion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_empresaTipoRequisicion!=null && this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_empresaTipoRequisicion.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_empresaTipoRequisicion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_tipo_periodoTipoRequisicion!=null && this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_tipo_periodoTipoRequisicion.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_tipo_periodoTipoRequisicion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_diaTipoRequisicion!=null && this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_diaTipoRequisicion.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_diaTipoRequisicion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public TipoRequisicionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoRequisicionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoRequisicionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tiporequisicionSessionBean=new TipoRequisicionSessionBean(); 
		this.tiporequisicionConstantesFunciones=new TipoRequisicionConstantesFunciones(); 
		this.tiporequisicionBean=new TipoRequisicion();//(this.tiporequisicionConstantesFunciones); 		
		this.tiporequisicionReturnGeneral=new TipoRequisicionParameterReturnGeneral(); 
		
		this.tiporequisicionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporequisicionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoRequisicionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoRequisicionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoRequisicionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoRequisicion(true);
			
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
			
			this.tiporequisicionConstantesFunciones=new TipoRequisicionConstantesFunciones(); 
			this.tiporequisicionBean=new TipoRequisicion();//this.tiporequisicionConstantesFunciones); 			
			this.tiporequisicionReturnGeneral=new TipoRequisicionParameterReturnGeneral(); 
		
			TipoRequisicionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Requesicion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tiporequisicion=new TipoRequisicion();
			this.tiporequisicions = new ArrayList<TipoRequisicion>();
			this.tiporequisicionsAux = new ArrayList<TipoRequisicion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic=new TipoRequisicionLogic();
				this.tiporequisicionLogic.getNewConnexionToDeep("");
			}
			
			//this.tiporequisicionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tiporequisicionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoRequisicion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoRequisicion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoRequisicion);	
					}
					
					if(this.jInternalFrameImportacionTipoRequisicion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoRequisicion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoRequisicion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoRequisicion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoRequisicion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoRequisicion);
				this.jInternalFrameDetalleFormTipoRequisicion.setVisible(false);
				this.jInternalFrameDetalleFormTipoRequisicion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoRequisicion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoRequisicion);
					this.jInternalFrameReporteDinamicoTipoRequisicion.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoRequisicion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoRequisicion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoRequisicion);
					this.jInternalFrameImportacionTipoRequisicion.setVisible(false);
					this.jInternalFrameImportacionTipoRequisicion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoRequisicion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoRequisicion);
					this.jInternalFrameOrderByTipoRequisicion.setVisible(false);
					this.jInternalFrameOrderByTipoRequisicion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoRequisicionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoRequisicionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tiporequisicionReturnGeneral=new TipoRequisicionParameterReturnGeneral();
			
			this.tiporequisicionParameterGeneral=new TipoRequisicionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tiporequisicionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoRequisicionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoRequisicionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiporequisicionSessionBean.getEsGuardarRelacionado(),this.tiporequisicionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoRequisicionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiporequisicionSessionBean.getEsGuardarRelacionado(),this.tiporequisicionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoRequisicion=false;
			this.isVisibilidadCeldaDuplicarTipoRequisicion=true;
			this.isVisibilidadCeldaCopiarTipoRequisicion=true;
			this.isVisibilidadCeldaVerFormTipoRequisicion=true;
			this.isVisibilidadCeldaOrdenTipoRequisicion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRequisicion=false;
			this.isVisibilidadCeldaModificarTipoRequisicion=false;
			this.isVisibilidadCeldaActualizarTipoRequisicion=false;
			this.isVisibilidadCeldaEliminarTipoRequisicion=false;
			this.isVisibilidadCeldaCancelarTipoRequisicion=false;
			this.isVisibilidadCeldaGuardarTipoRequisicion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRequisicion=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdDia=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoPeriodo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoRequisicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoRequisicion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoRequisicion(false);
			
			this.setPermisosUsuarioTipoRequisicion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporequisicionSessionBean.getEsGuardarRelacionado() 
				|| (this.tiporequisicionSessionBean.getEsGuardarRelacionado() && this.tiporequisicionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoRequisicionClasesRelacionadas();
			}
			
			if(this.tiporequisicionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoRequisicionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoRequisicionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoRequisicion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoRequisicion();
			}
			
			if(!this.isPermisoBusquedaTipoRequisicion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoRequisicion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoRequisicion,this.isPermisoPaginacionMedioTipoRequisicion,this.isPermisoPaginacionTodoTipoRequisicion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoRequisicionConstantesFunciones.getTiposSeleccionarTipoRequisicion());
				
				this.tiposColumnasSelect=TipoRequisicionConstantesFunciones.getTiposSeleccionarTipoRequisicion(true);
				
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
			//if(!this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoRequisicion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoRequisicion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoRequisicion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRequisicion() ;
			
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
			this.tipoperiodoLogic=new TipoPeriodoLogic();
			this.diaLogic=new DiaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tiporequisicionImplementable= (TipoRequisicionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoRequisicionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tiporequisicionImplementableHome= (TipoRequisicionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoRequisicionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tiporequisicions= new ArrayList<TipoRequisicion>();
			this.tiporequisicionsEliminados= new ArrayList<TipoRequisicion>();
						
			this.isEsNuevoTipoRequisicion=false;
			this.esParaAccionDesdeFormularioTipoRequisicion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.tipoperiodosForeignKey=new ArrayList<TipoPeriodo>() ;
			this.diasForeignKey=new ArrayList<Dia>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoRequisicion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoRequisicion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoRequisicionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoRequisicionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoRequisicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoRequisicion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoRequisicion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoRequisicion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoRequisicion();
			}
			
			TipoRequisicionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoRequisicion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoRequisicion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoRequisicion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoRequisicion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoRequisicion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoRequisicion() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoRequisicion")) {
				iIndex=this.jInternalFrameDetalleFormTipoRequisicion.jTabbedPaneRelacionesTipoRequisicion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoRequisicion.jTabbedPaneRelacionesTipoRequisicion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoRequisicion.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoRequisicion();	
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
	
	public void cargarCombosForeignKeyTipoRequisicion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoRequisicion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoRequisicion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoRequisicionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoRequisicion();
		
		this.cargarCombosFrameForeignKeyTipoRequisicion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoRequisicion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoRequisicion();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoPeriodo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoPeriodo();
				this.cargarCombosFrameTipoPeriodosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoPeriodo(this.tipoperiodosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyDia(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyDiaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyDia();
				this.cargarCombosFrameDiasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaDia(this.diasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTipoRequisicionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tiporequisicionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoRequisicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
			
			
			if(jTableDatosTipoRequisicion.getRowCount()>=1) {
				jTableDatosTipoRequisicion.removeRowSelectionInterval(0, jTableDatosTipoRequisicion.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoRequisicion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoRequisicion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoRequisicion(true);			
			//this.tiporequisicion=new TipoRequisicion();
			//this.tiporequisicion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRequisicion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRequisicion() ;
			
			if(TipoRequisicionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRequisicion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tiporequisicion);	
			this.actualizarInformacion("INFO_PADRE",false,this.tiporequisicion);				
			
			TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
			
			if(this.tiporequisicionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoRequisicion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoRequisicionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoRequisicion> tiporequisicionsSeleccionados=new ArrayList<TipoRequisicion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoRequisicion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoRequisicion.getSelectedRows().length;			
			}
			
			tiporequisicionsSeleccionados=this.getTipoRequisicionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoRequisicion--;			
				//TipoRequisicion tiporequisicionAux= new TipoRequisicion();			
				//tiporequisicionAux.setId(this.iIdNuevoTipoRequisicion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoRequisicion tiporequisicionOrigen=new TipoRequisicion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoRequisicion tiporequisicionOrigen : tiporequisicionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoRequisicion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tiporequisicionOrigen =(TipoRequisicion) this.tiporequisicionLogic.getTipoRequisicions().toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporequisicionOrigen =(TipoRequisicion) this.tiporequisicions.toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoRequisicion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tiporequisicion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoRequisicion(tiporequisicionOrigen,this.tiporequisicion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRequisicion(this.tiporequisicion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiporequisicionLogic.getTipoRequisicions().add(this.tiporequisicionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiporequisicions.add(this.tiporequisicionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoRequisicion(false);
				
				this.jTableDatosTipoRequisicion.setRowSelectionInterval(this.getIndiceNuevoTipoRequisicion(), this.getIndiceNuevoTipoRequisicion());
				
				int iLastRow =  this.jTableDatosTipoRequisicion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoRequisicion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoRequisicion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRequisicion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoRequisicion> tiporequisicionsSeleccionados=new ArrayList<TipoRequisicion>();									
		
			TipoRequisicion tiporequisicionOrigen=new TipoRequisicion();
			TipoRequisicion tiporequisicionDestino=new TipoRequisicion();
				
			tiporequisicionsSeleccionados=this.getTipoRequisicionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoRequisicion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tiporequisicionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoRequisicion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporequisicionOrigen =(TipoRequisicion) this.tiporequisicionLogic.getTipoRequisicions().toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiporequisicionOrigen =(TipoRequisicion) this.tiporequisicions.toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporequisicionDestino =(TipoRequisicion) this.tiporequisicionLogic.getTipoRequisicions().toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiporequisicionDestino =(TipoRequisicion) this.tiporequisicions.toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tiporequisicionOrigen =tiporequisicionsSeleccionados.get(0);
				tiporequisicionDestino =tiporequisicionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoRequisicion(tiporequisicionOrigen,tiporequisicionDestino,true,false);
				
				tiporequisicionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiporequisicionDestino,tiporequisicionLogic.getTipoRequisicions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporequisicionDestino,tiporequisicions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoRequisicion(false);
				
				//this.jTableDatosTipoRequisicion.setRowSelectionInterval(this.getIndiceNuevoTipoRequisicion(), this.getIndiceNuevoTipoRequisicion());
				
				int iLastRow =  this.jTableDatosTipoRequisicion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoRequisicion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoRequisicion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRequisicion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoRequisicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoRequisicion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoRequisicion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoRequisicion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoRequisicion.setVisible(!isVisible);
			this.jPanelPaginacionTipoRequisicion.setVisible(!isVisible);
			this.jPanelAccionesTipoRequisicion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoRequisicion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoRequisicion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoRequisicion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoRequisicion();
			
			this.abrirFrameOrderByTipoRequisicion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoRequisicion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoRequisicion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoRequisicion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoRequisicion.isMaximum()) {
					this.jInternalFrameDetalleFormTipoRequisicion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoRequisicion.setSize(this.jInternalFrameDetalleFormTipoRequisicion.iWidthFormulario,this.jInternalFrameDetalleFormTipoRequisicion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoRequisicion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoRequisicion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoRequisicion.isMaximum()) {
						this.jInternalFrameDetalleFormTipoRequisicion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoRequisicion.jContentPaneDetalleTipoRequisicion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoRequisicion.jTabbedPaneRelacionesTipoRequisicion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoRequisicion.jContentPaneDetalleTipoRequisicion.getWidth(),TipoRequisicionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoRequisicion.jTabbedPaneRelacionesTipoRequisicion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoRequisicion.jContentPaneDetalleTipoRequisicion.getWidth(),TipoRequisicionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoRequisicion.jTabbedPaneRelacionesTipoRequisicion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoRequisicion.jContentPaneDetalleTipoRequisicion.getWidth(),TipoRequisicionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoRequisicion.setVisible(true);
	        this.jInternalFrameDetalleFormTipoRequisicion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoRequisicion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoRequisicion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoRequisicion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRequisicion,false,this);
				} else {
					this.jInternalFrameOrderByTipoRequisicion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRequisicion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoRequisicion);
				this.jInternalFrameOrderByTipoRequisicion.setVisible(false);
				this.jInternalFrameOrderByTipoRequisicion.setSelected(false);
				
				this.jInternalFrameOrderByTipoRequisicion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoRequisicion"));
				
				this.inicializarActualizarBindingTablaOrderByTipoRequisicion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoRequisicion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoRequisicion==null) {
				
				this.jInternalFrameImportacionTipoRequisicion=new ImportacionJInternalFrame(TipoRequisicionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoRequisicion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoRequisicion);
				this.jInternalFrameImportacionTipoRequisicion.setVisible(false);
				this.jInternalFrameImportacionTipoRequisicion.setSelected(false);


				this.jInternalFrameImportacionTipoRequisicion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoRequisicion"));
				this.jInternalFrameImportacionTipoRequisicion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoRequisicion"));
				this.jInternalFrameImportacionTipoRequisicion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoRequisicion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoRequisicion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoRequisicion==null) {
				this.jInternalFrameReporteDinamicoTipoRequisicion=new ReporteDinamicoJInternalFrame(TipoRequisicionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoRequisicion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoRequisicion);
				this.jInternalFrameReporteDinamicoTipoRequisicion.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoRequisicion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoRequisicion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRequisicion"));
				this.jInternalFrameReporteDinamicoTipoRequisicion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRequisicion"));
				this.jInternalFrameReporteDinamicoTipoRequisicion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRequisicion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRequisicion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoRequisicion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoRequisicion);
			
	       	this.jInternalFrameDetalleFormTipoRequisicion.setVisible(false);
	        this.jInternalFrameDetalleFormTipoRequisicion.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoRequisicion.dispose();
			//this.jInternalFrameDetalleFormTipoRequisicion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoRequisicion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoRequisicion.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoRequisicion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoRequisicion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoRequisicion.setVisible(true);
	        this.jInternalFrameImportacionTipoRequisicion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoRequisicion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoRequisicion.setVisible(true);
	        this.jInternalFrameOrderByTipoRequisicion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoRequisicion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoRequisicion.setVisible(false);
	        this.jInternalFrameOrderByTipoRequisicion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoRequisicion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoRequisicion.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoRequisicion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoRequisicion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoRequisicion.setVisible(false);
	        this.jInternalFrameImportacionTipoRequisicion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoRequisicion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoRequisicion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoRequisicion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoRequisicion(true);
			//this.isEsNuevoTipoRequisicion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicion =(TipoRequisicion) this.tiporequisicionLogic.getTipoRequisicions().toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporequisicion =(TipoRequisicion) this.tiporequisicions.toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoRequisicion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRequisicion(false) ;
			
			if(tiporequisicionSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoRequisicionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRequisicion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRequisicion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoRequisicionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoRequisicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicion =(TipoRequisicion) this.tiporequisicionLogic.getTipoRequisicions().toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporequisicion =(TipoRequisicion) this.tiporequisicions.toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoRequisicion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoRequisicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoRequisicion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoRequisicion(true);
			//this.isEsNuevoTipoRequisicion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicion =(TipoRequisicion) this.tiporequisicionLogic.getTipoRequisicions().toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporequisicion =(TipoRequisicion) this.tiporequisicions.toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tiporequisicion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoRequisicion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoRequisicion(false) ;
			
			if(TipoRequisicionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRequisicion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRequisicion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTipoPeriodo(List<TipoPeriodo> tipoperiodosForeignKey)throws Exception{
		TableColumn tableColumnTipoPeriodo=this.jTableDatosTipoRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRequisicion,TipoRequisicionConstantesFunciones.LABEL_IDTIPOPERIODO));
		TableCellEditor tableCellEditorTipoPeriodo =tableColumnTipoPeriodo.getCellEditor();

		TipoPeriodoTableCell tipoperiodoTableCellFk=(TipoPeriodoTableCell)tableCellEditorTipoPeriodo;

		if(tipoperiodoTableCellFk!=null) {
			tipoperiodoTableCellFk.settipoperiodosForeignKey(tipoperiodosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoRequisicion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoperiodoTableCellFk.setRowActual(intSelectedRow);
			//tipoperiodoTableCellFk.settipoperiodosForeignKeyActual(tipoperiodosForeignKey);
		//}


		if(tipoperiodoTableCellFk!=null) {
			tipoperiodoTableCellFk.RecargarTipoPeriodosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaDia(List<Dia> diasForeignKey)throws Exception{
		TableColumn tableColumnDia=this.jTableDatosTipoRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRequisicion,TipoRequisicionConstantesFunciones.LABEL_IDDIA));
		TableCellEditor tableCellEditorDia =tableColumnDia.getCellEditor();

		DiaTableCell diaTableCellFk=(DiaTableCell)tableCellEditorDia;

		if(diaTableCellFk!=null) {
			diaTableCellFk.setdiasForeignKey(diasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoRequisicion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//diaTableCellFk.setRowActual(intSelectedRow);
			//diaTableCellFk.setdiasForeignKeyActual(diasForeignKey);
		//}


		if(diaTableCellFk!=null) {
			diaTableCellFk.RecargarDiasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTipoRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoRequisicion(false);
			
			//if(!this.isEsNuevoTipoRequisicion) {								
				int intSelectedRow = this.jTableDatosTipoRequisicion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicion =(TipoRequisicion) this.tiporequisicionLogic.getTipoRequisicions().toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporequisicion =(TipoRequisicion) this.tiporequisicions.toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoRequisicion(this.tiporequisicion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRequisicion(this.tiporequisicion);
				
			}
			
			if(this.permiteMantenimiento(this.tiporequisicion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoRequisicion=true;
					this.inicializarActualizarBindingTablaTipoRequisicion(false);
					this.isEsNuevoTipoRequisicion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoRequisicion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoRequisicion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoRequisicion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRequisicion(false);
				
				this.habilitarDeshabilitarControlesTipoRequisicion(false);
			
												
				
				if(TipoRequisicionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoRequisicion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoRequisicionActionPerformed(evt,tiporequisicionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoRequisicion(this.tiporequisicion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoRequisicion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tiporequisicionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tiporequisicion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoRequisicion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRequisicion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoRequisicionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoRequisicion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicion =(TipoRequisicion) this.tiporequisicionLogic.getTipoRequisicions().toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
				this.tiporequisicion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporequisicion =(TipoRequisicion) this.tiporequisicions.toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
				this.tiporequisicion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tiporequisicion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoRequisicionModel) this.jTableDatosTipoRequisicion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoRequisicion=true;
				this.inicializarActualizarBindingTablaTipoRequisicion(false);
				this.isEsNuevoTipoRequisicion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoRequisicion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRequisicion(false);
				
				this.habilitarDeshabilitarControlesTipoRequisicion(false);
				
				
				
				if(TipoRequisicionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoRequisicion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoRequisicionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoRequisicion.getRowCount()>=1) {
				jTableDatosTipoRequisicion.removeRowSelectionInterval(0, jTableDatosTipoRequisicion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoRequisicion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoRequisicion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRequisicion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRequisicion(false) ;
			
			this.isEsNuevoTipoRequisicion=false;
			
			if(TipoRequisicionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoRequisicion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoRequisicionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoRequisicion(false);
				
				//SI ES MANUAL
				if(TipoRequisicionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoRequisicion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoRequisicionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoRequisicion--;			
			//TipoRequisicion tiporequisicionAux= new TipoRequisicion();			
			//tiporequisicionAux.setId(this.iIdNuevoTipoRequisicion);
			
			if(this.jInternalFrameDetalleFormTipoRequisicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoRequisicion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoRequisicion(this.tiporequisicion);
			
			this.tiporequisicion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tiporequisicionLogic.getTipoRequisicions().add(this.tiporequisicionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tiporequisicions.add(this.tiporequisicionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoRequisicion(false);
			
			this.jTableDatosTipoRequisicion.setRowSelectionInterval(this.getIndiceNuevoTipoRequisicion(), this.getIndiceNuevoTipoRequisicion());
			
			int iLastRow =  this.jTableDatosTipoRequisicion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoRequisicion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoRequisicion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoRequisicion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoRequisicionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoRequisicion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRequisicion(false);
			
			//SI ES MANUAL
			if(TipoRequisicionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRequisicion();
			}
			
			//this.abrirFrameTreeTipoRequisicion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoRequisicionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo RequesicionES ?", "MANTENIMIENTO DE Tipo Requesicion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoRequisicion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoRequisicion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tiporequisicionReturnGeneral=tiporequisicionLogic.procesarImportacionTipoRequisicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tiporequisicionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoRequisicionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoRequisicionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoRequisicion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoRequisicion.setFileImportacion(this.jInternalFrameImportacionTipoRequisicion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoRequisicion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoRequisicion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoRequisicion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoRequisicion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoRequisicionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoRequisicion> tiporequisicionsSeleccionados=new ArrayList<TipoRequisicion>();		

		tiporequisicionsSeleccionados=this.getTipoRequisicionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRequisicion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRequisicion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoRequisicionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoRequisicionBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoRequisicions("Todos",tiporequisicionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Requesicion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRequisicion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRequisicion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoRequisicionConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRequisicionConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRequisicionConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRequisicionConstantesFunciones.LABEL_IDTIPOPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoPeriodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoPeriodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoPeriodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoPeriodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRequisicionConstantesFunciones.LABEL_IDDIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Dia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Dia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Dia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Dia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRequisicionConstantesFunciones.LABEL_HORA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ra_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoRequisicion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoRequisicion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoRequisicion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoRequisicionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoRequisicionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoRequisicionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoRequisicionConstantesFunciones.LABEL_IDTIPOPERIODO:
					sNombreCampoCategoria="id_tipo_periodo";
					break;

				case TipoRequisicionConstantesFunciones.LABEL_IDDIA:
					sNombreCampoCategoria="id_dia";
					break;

				case TipoRequisicionConstantesFunciones.LABEL_HORA:
					sNombreCampoCategoria="hora";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoRequisicion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoRequisicionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoRequisicionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoRequisicionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoRequisicionConstantesFunciones.LABEL_IDTIPOPERIODO:
					sNombreCampoCategoriaValor="id_tipo_periodo";
					break;

				case TipoRequisicionConstantesFunciones.LABEL_IDDIA:
					sNombreCampoCategoriaValor="id_dia";
					break;

				case TipoRequisicionConstantesFunciones.LABEL_HORA:
					sNombreCampoCategoriaValor="hora";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoRequisicion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRequisicion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoRequisicionConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoRequisicionConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoRequisicionConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoRequisicionConstantesFunciones.LABEL_IDTIPOPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_periodo");
					break;

				case TipoRequisicionConstantesFunciones.LABEL_IDDIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_dia");
					break;

				case TipoRequisicionConstantesFunciones.LABEL_HORA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hora",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hora");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoRequisicionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoRequisicion> tiporequisicionsSeleccionados=new ArrayList<TipoRequisicion>();		
		
		tiporequisicionsSeleccionados=this.getTipoRequisicionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporequisicion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoRequisicions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoRequisicion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRequisicion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoRequisicionConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRequisicionConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoRequisicion tiporequisicion:tiporequisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporequisicion.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRequisicionConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRequisicionConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoRequisicion tiporequisicion:tiporequisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporequisicion.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRequisicionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRequisicionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoRequisicion tiporequisicion:tiporequisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporequisicion.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRequisicionConstantesFunciones.LABEL_IDTIPOPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRequisicionConstantesFunciones.LABEL_IDTIPOPERIODO);
					iRow++;

					for(TipoRequisicion tiporequisicion:tiporequisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporequisicion.gettipoperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRequisicionConstantesFunciones.LABEL_IDDIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRequisicionConstantesFunciones.LABEL_IDDIA);
					iRow++;

					for(TipoRequisicion tiporequisicion:tiporequisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporequisicion.getdia_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRequisicionConstantesFunciones.LABEL_HORA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRequisicionConstantesFunciones.LABEL_HORA);
					iRow++;

					for(TipoRequisicion tiporequisicion:tiporequisicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporequisicion.gethora());
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
			//	this.getFilaCabeceraExportarExcelTipoRequisicion(row);				
			//	iRow++;
			//}				
			
			//for(TipoRequisicion tiporequisicionAux:tiporequisicionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoRequisicion(tiporequisicionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Requesicion",JOptionPane.INFORMATION_MESSAGE);
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
				this.tiporequisicionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRequisicion(false);
			
			//SI ES MANUAL
			if(TipoRequisicionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRequisicion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoRequisicionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRequisicion(false);
			
			//SI ES MANUAL
			if(TipoRequisicionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoRequisicion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoRequisicionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRequisicion(false);
			
			//SI ES MANUAL
			if(TipoRequisicionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoRequisicion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoRequisicion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoRequisicion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoRequisicion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoRequisicion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoRequisicion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoRequisicion.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoRequisicion.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoRequisicion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoRequisicion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoRequisicion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoRequisicion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoRequisicion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoRequisicion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoRequisicion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRequisicion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoRequisicion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoRequisicionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoRequisicion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoRequisicion();
		
		this.inicializarActualizarBindingBotonesManualTipoRequisicion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoRequisicion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRequisicion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRequisicion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRequisicion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoRequisicion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoRequisicion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoRequisicion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoRequisicion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoRequisicion.jCheckBoxPostAccionNuevoTipoRequisicion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoRequisicion.jCheckBoxPostAccionSinCerrarTipoRequisicion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoRequisicion.jCheckBoxPostAccionSinMensajeTipoRequisicion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoRequisicion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoRequisicion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoRequisicion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoRequisicion!=null) {
				this.jInternalFrameDetalleFormTipoRequisicion.jCheckBoxPostAccionNuevoTipoRequisicion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoRequisicion.jCheckBoxPostAccionSinCerrarTipoRequisicion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoRequisicion.jCheckBoxPostAccionSinMensajeTipoRequisicion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoRequisicion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoRequisicion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoRequisicion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxTiposAccionesFormularioTipoRequisicion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoRequisicion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoRequisicion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRequisicion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoRequisicion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoRequisicion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoRequisicion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoRequisicion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoRequisicion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRequisicion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoRequisicion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoRequisicion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoRequisicion(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoRequisicionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRequisicion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoRequisicion() throws Exception {
		try	{
			if(TipoRequisicionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoRequisicion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoRequisicion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxTiposAccionesFormularioTipoRequisicion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxTiposAccionesFormularioTipoRequisicion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoRequisicion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoRequisicion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoRequisicion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoRequisicion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoRequisicion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoRequisicion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoRequisicion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoRequisicion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoRequisicion.addItem(reporte);
			}
			
			
			if(!this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoRequisicion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoRequisicion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoRequisicion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoRequisicion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoRequisicion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoRequisicion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoRequisicion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxTiposAccionesFormularioTipoRequisicion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxTiposAccionesFormularioTipoRequisicion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoRequisicion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoRequisicion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoRequisicion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRequisicion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRequisicion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoRequisicion!=null) {
				this.jInternalFrameReporteDinamicoTipoRequisicion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoRequisicion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoRequisicion!=null) {
				this.jInternalFrameReporteDinamicoTipoRequisicion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoRequisicion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoRequisicion!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoRequisicion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoRequisicion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoRequisicion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoRequisicion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoRequisicion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoRequisicion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoRequisicion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoTipoRequisicion.getText();
		this.nombreBusquedaPorNombre=this.jTextFieldnombreBusquedaPorNombreTipoRequisicion.getText();
		if(this.jComboBoxid_diaFK_IdDiaTipoRequisicion.getSelectedItem()!=null){this.id_diaFK_IdDia=((Dia)this.jComboBoxid_diaFK_IdDiaTipoRequisicion.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_periodoFK_IdTipoPeriodoTipoRequisicion.getSelectedItem()!=null){this.id_tipo_periodoFK_IdTipoPeriodo=((TipoPeriodo)this.jComboBoxid_tipo_periodoFK_IdTipoPeriodoTipoRequisicion.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoRequisicion(Boolean esInicializar) throws Exception {				
		if(TipoRequisicionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoRequisicion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoRequisicion() throws Exception {
		this.inicializarActualizarBindingTablaTipoRequisicion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoRequisicion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoRequisicion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoRequisicion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRequisicion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoRequisicionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoRequisicion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRequisicion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoRequisicionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoRequisicionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRequisicionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoRequisicionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoRequisicion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRequisicion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoRequisicionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoRequisicion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoRequisicion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tiporequisicionLogic.getTipoRequisicions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tiporequisicions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoRequisicion.setModel(new TipoRequisicionModel(this.tiporequisicionLogic.getTipoRequisicions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoRequisicion.setModel(new TipoRequisicionModel(this.tiporequisicions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoRequisicion!=null && this.jInternalFrameOrderByTipoRequisicion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoRequisicion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRequisicion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoRequisicionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO,tiporequisicionConstantesFunciones.resaltarSeleccionarTipoRequisicion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO,tiporequisicionConstantesFunciones.resaltarSeleccionarTipoRequisicion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRequisicion,TipoRequisicionConstantesFunciones.LABEL_ID));

		if(this.tiporequisicionConstantesFunciones.mostraridTipoRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRequisicionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tiporequisicionConstantesFunciones.resaltaridTipoRequisicion,this.tiporequisicionConstantesFunciones.activaridTipoRequisicion,this,true,"idTipoRequisicion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporequisicionConstantesFunciones.resaltaridTipoRequisicion,this.tiporequisicionConstantesFunciones.activaridTipoRequisicion,this,true,"idTipoRequisicion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRequisicion,TipoRequisicionConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tiporequisicionConstantesFunciones.mostrarid_empresaTipoRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRequisicionConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tiporequisicionConstantesFunciones.resaltarid_empresaTipoRequisicion,this,this.tiporequisicionConstantesFunciones.activarid_empresaTipoRequisicion));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tiporequisicionConstantesFunciones.resaltarid_empresaTipoRequisicion,this,this.tiporequisicionConstantesFunciones.activarid_empresaTipoRequisicion,false,"id_empresaTipoRequisicion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoRequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRequisicion,TipoRequisicionConstantesFunciones.LABEL_CODIGO));

		if(this.tiporequisicionConstantesFunciones.mostrarcodigoTipoRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRequisicionConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiporequisicionConstantesFunciones.resaltarcodigoTipoRequisicion,this.tiporequisicionConstantesFunciones.activarcodigoTipoRequisicion,this,true,"codigoTipoRequisicion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporequisicionConstantesFunciones.resaltarcodigoTipoRequisicion,this.tiporequisicionConstantesFunciones.activarcodigoTipoRequisicion,this,true,"codigoTipoRequisicion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoRequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRequisicion,TipoRequisicionConstantesFunciones.LABEL_NOMBRE));

		if(this.tiporequisicionConstantesFunciones.mostrarnombreTipoRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRequisicionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiporequisicionConstantesFunciones.resaltarnombreTipoRequisicion,this.tiporequisicionConstantesFunciones.activarnombreTipoRequisicion,this,true,"nombreTipoRequisicion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporequisicionConstantesFunciones.resaltarnombreTipoRequisicion,this.tiporequisicionConstantesFunciones.activarnombreTipoRequisicion,this,true,"nombreTipoRequisicion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoRequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRequisicion,TipoRequisicionConstantesFunciones.LABEL_IDTIPOPERIODO));

		if(this.tiporequisicionConstantesFunciones.mostrarid_tipo_periodoTipoRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRequisicionConstantesFunciones.LABEL_IDTIPOPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoPeriodoTableCell(this.tipoperiodosForeignKey,this.tiporequisicionConstantesFunciones.resaltarid_tipo_periodoTipoRequisicion,this,this.tiporequisicionConstantesFunciones.activarid_tipo_periodoTipoRequisicion));
			tableColumn.setCellEditor(new TipoPeriodoTableCell(this.tipoperiodosForeignKey,this.tiporequisicionConstantesFunciones.resaltarid_tipo_periodoTipoRequisicion,this,this.tiporequisicionConstantesFunciones.activarid_tipo_periodoTipoRequisicion,true,"id_tipo_periodoTipoRequisicion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoRequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRequisicion,TipoRequisicionConstantesFunciones.LABEL_IDDIA));

		if(this.tiporequisicionConstantesFunciones.mostrarid_diaTipoRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRequisicionConstantesFunciones.LABEL_IDDIA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new DiaTableCell(this.diasForeignKey,this.tiporequisicionConstantesFunciones.resaltarid_diaTipoRequisicion,this,this.tiporequisicionConstantesFunciones.activarid_diaTipoRequisicion));
			tableColumn.setCellEditor(new DiaTableCell(this.diasForeignKey,this.tiporequisicionConstantesFunciones.resaltarid_diaTipoRequisicion,this,this.tiporequisicionConstantesFunciones.activarid_diaTipoRequisicion,true,"id_diaTipoRequisicion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoRequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRequisicion,TipoRequisicionConstantesFunciones.LABEL_HORA));

		if(this.tiporequisicionConstantesFunciones.mostrarhoraTipoRequisicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRequisicionConstantesFunciones.LABEL_HORA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TimeRenderer(this.tiporequisicionConstantesFunciones.resaltarhoraTipoRequisicion,this.tiporequisicionConstantesFunciones.activarhoraTipoRequisicion,this,true,"horaTipoRequisicion","BASICO"));
			tableColumn.setCellEditor(new TimeEditorRenderer(this.tiporequisicionConstantesFunciones.resaltarhoraTipoRequisicion,this.tiporequisicionConstantesFunciones.activarhoraTipoRequisicion,this,true,"horaTipoRequisicion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new TipoRequisicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tiporequisicionSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiporequisicionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiporequisicionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoRequisicion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiporequisicionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiporequisicionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoRequisicion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoRequisicion && this.isPermisoGuardarCambiosTipoRequisicion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tiporequisicionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tiporequisicionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoRequisicion.addColumn(tableColumn);
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
			
			this.jTableDatosTipoRequisicion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoRequisicion && this.isPermisoGuardarCambiosTipoRequisicion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoRequisicion && this.isPermisoGuardarCambiosTipoRequisicion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoRequisicion.moveColumn(this.jTableDatosTipoRequisicion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoRequisicion.moveColumn(this.jTableDatosTipoRequisicion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoRequisicion.moveColumn(this.jTableDatosTipoRequisicion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoRequisicion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoRequisicion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoRequisicion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoRequisicion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoRequisicion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoRequisicion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoRequisicion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoRequisicion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tiporequisicionLogic.getTipoRequisicions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tiporequisicions.size()-1;
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
		//this.jTableDatosTipoRequisicion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoRequisicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoRequisicion();
			
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
				
				//this.isEsNuevoTipoRequisicion=false;
					
				TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
			
				if(this.tiporequisicionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoRequisicion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoRequisicion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoRequisicion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicion =(TipoRequisicion) this.tiporequisicionLogic.getTipoRequisicions().toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporequisicion =(TipoRequisicion) this.tiporequisicions.toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tiporequisicion.getsType().equals("DUPLICADO")
				   || this.tiporequisicion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoRequisicion=true;
				
				} else {
					this.isEsNuevoTipoRequisicion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {
					if(this.tiporequisicion.getId()>=0 && !this.tiporequisicion.getIsNew()) {						
						this.isEsNuevoTipoRequisicion=false;
						
					} else {
						this.isEsNuevoTipoRequisicion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoRequisicion(esRelaciones);						
				
				this.seleccionarTipoRequisicion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tiporequisicion.getId()<0) {
					this.isEsNuevoTipoRequisicion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoRequisicion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoRequisicion(evt,rowIndex);
				}	
				
				if(this.tiporequisicionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoRequisicion: " + this.dDif); 
					}
				}								
				
				TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoRequisicion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tiporequisicion)) {
					if(this.tiporequisicion.getId()>0) {
						this.tiporequisicion.setIsDeleted(true);
						
						this.tiporequisicionsEliminados.add(this.tiporequisicion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiporequisicionLogic.getTipoRequisicions().remove(this.tiporequisicion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiporequisicions.remove(this.tiporequisicion);				
					}
					
					
					((TipoRequisicionModel) this.jTableDatosTipoRequisicion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRequisicion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoRequisicion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoRequisicion) {
			
			if(this.jInternalFrameDetalleFormTipoRequisicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoRequisicion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoRequisicion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicion =(TipoRequisicion) this.tiporequisicionLogic.getTipoRequisicions().toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporequisicion =(TipoRequisicion) this.tiporequisicions.toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoRequisicion(this.tiporequisicion);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tiporequisicionConstantesFunciones.cargarid_empresaTipoRequisicion || this.tiporequisicionConstantesFunciones.event_dependid_empresaTipoRequisicion) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tiporequisicion.getid_empresa());
									//this.inicializarActualizarBindingTipoRequisicion(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tiporequisicion.getEmpresa()!=null) {
							this.empresasForeignKey.add(tiporequisicion.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tiporequisicion.getid_empresa(),false,"Formulario");

					//TipoPeriodo
					if(!this.tiporequisicionConstantesFunciones.cargarid_tipo_periodoTipoRequisicion || this.tiporequisicionConstantesFunciones.event_dependid_tipo_periodoTipoRequisicion) {
						//this.cargarCombosTipoPeriodosForeignKeyLista(" where id="+this.tiporequisicion.getid_tipo_periodo());
									//this.inicializarActualizarBindingTipoRequisicion(false,false);
						this.tipoperiodosForeignKey=new ArrayList<TipoPeriodo>();

						if(tiporequisicion.getTipoPeriodo()!=null) {
							this.tipoperiodosForeignKey.add(tiporequisicion.getTipoPeriodo());
						}

						this.addItemDefectoCombosForeignKeyTipoPeriodo();
						this.cargarCombosFrameTipoPeriodosForeignKey("Todos");
					}
					this.setActualTipoPeriodoForeignKey(this.tiporequisicion.getid_tipo_periodo(),false,"Formulario");

					//Dia
					if(!this.tiporequisicionConstantesFunciones.cargarid_diaTipoRequisicion || this.tiporequisicionConstantesFunciones.event_dependid_diaTipoRequisicion) {
						//this.cargarCombosDiasForeignKeyLista(" where id="+this.tiporequisicion.getid_dia());
									//this.inicializarActualizarBindingTipoRequisicion(false,false);
						this.diasForeignKey=new ArrayList<Dia>();

						if(tiporequisicion.getDia()!=null) {
							this.diasForeignKey.add(tiporequisicion.getDia());
						}

						this.addItemDefectoCombosForeignKeyDia();
						this.cargarCombosFrameDiasForeignKey("Todos");
					}
					this.setActualDiaForeignKey(this.tiporequisicion.getid_dia(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoRequisicion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoRequisicion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRequisicion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoRequisicion(TipoRequisicion tiporequisicion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoRequisicion(tiporequisicion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoRequisicion(TipoRequisicion tiporequisicion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoRequisicion(tiporequisicion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoRequisicion(tiporequisicion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoRequisicion(tiporequisicion);
	}
	
	public void setVariablesObjetoActualToFormularioTipoRequisicion(TipoRequisicion tiporequisicion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoRequisicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoRequisicion.jLabelidTipoRequisicion.setText(tiporequisicion.getId().toString());
			this.jInternalFrameDetalleFormTipoRequisicion.jTextFieldcodigoTipoRequisicion.setText(tiporequisicion.getcodigo());
			this.jInternalFrameDetalleFormTipoRequisicion.jTextFieldnombreTipoRequisicion.setText(tiporequisicion.getnombre());
			this.jInternalFrameDetalleFormTipoRequisicion.jSpinnerhoraTipoRequisicion.setValue(tiporequisicion.gethora());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoRequisicion tiporequisicionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tiporequisicionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoRequisicion tiporequisicionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tiporequisicionLocal=this.tiporequisicion;
			} else {
				tiporequisicionLocal=this.tiporequisicionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tiporequisicionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoRequisicion(tiporequisicionLocal,true);
					
					if(tiporequisicionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tiporequisicionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tiporequisicionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoRequisicion(TipoRequisicion tiporequisicion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoRequisicion(tiporequisicion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoRequisicion(tiporequisicion);
	}
	
	public void setVariablesFormularioToObjetoActualTipoRequisicion(TipoRequisicion tiporequisicion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoRequisicion(tiporequisicion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoRequisicion(TipoRequisicion tiporequisicion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoRequisicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoRequisicion.jLabelidTipoRequisicion.getText()==null || this.jInternalFrameDetalleFormTipoRequisicion.jLabelidTipoRequisicion.getText()=="" || this.jInternalFrameDetalleFormTipoRequisicion.jLabelidTipoRequisicion.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoRequisicion.jLabelidTipoRequisicion.setText("0");
			}

			if(conColumnasBase) {tiporequisicion.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoRequisicion.jLabelidTipoRequisicion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRequisicionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRequisicion.jLabelIdTipoRequisicion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporequisicion.setcodigo(this.jInternalFrameDetalleFormTipoRequisicion.jTextFieldcodigoTipoRequisicion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRequisicionConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRequisicion.jLabelcodigoTipoRequisicion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporequisicion.setnombre(this.jInternalFrameDetalleFormTipoRequisicion.jTextFieldnombreTipoRequisicion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRequisicionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRequisicion.jLabelnombreTipoRequisicion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporequisicion.sethora(new Time(((Date)this.jInternalFrameDetalleFormTipoRequisicion.jSpinnerhoraTipoRequisicion.getValue()).getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRequisicionConstantesFunciones.LABEL_HORA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRequisicion.jLabelhoraTipoRequisicion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoRequisicion(TipoRequisicion tiporequisicionBean,TipoRequisicion tiporequisicion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tiporequisicionBean.getid_tipo_periodo()!=null && !tiporequisicionBean.getid_tipo_periodo().equals(-1L))) {tiporequisicion.setid_tipo_periodo(tiporequisicionBean.getid_tipo_periodo());}
			if(conDefault || (!conDefault && tiporequisicionBean.getid_dia()!=null && !tiporequisicionBean.getid_dia().equals(-1L))) {tiporequisicion.setid_dia(tiporequisicionBean.getid_dia());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoRequisicion(TipoRequisicion tiporequisicionOrigen,TipoRequisicion tiporequisicion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiporequisicionOrigen.getId()!=null && !tiporequisicionOrigen.getId().equals(0L))) {tiporequisicion.setId(tiporequisicionOrigen.getId());}}
			if(conDefault || (!conDefault && tiporequisicionOrigen.getcodigo()!=null && !tiporequisicionOrigen.getcodigo().equals(""))) {tiporequisicion.setcodigo(tiporequisicionOrigen.getcodigo());}
			if(conDefault || (!conDefault && tiporequisicionOrigen.getnombre()!=null && !tiporequisicionOrigen.getnombre().equals(""))) {tiporequisicion.setnombre(tiporequisicionOrigen.getnombre());}
			if(conDefault || (!conDefault && tiporequisicionOrigen.getid_tipo_periodo()!=null && !tiporequisicionOrigen.getid_tipo_periodo().equals(-1L))) {tiporequisicion.setid_tipo_periodo(tiporequisicionOrigen.getid_tipo_periodo());}
			if(conDefault || (!conDefault && tiporequisicionOrigen.getid_dia()!=null && !tiporequisicionOrigen.getid_dia().equals(-1L))) {tiporequisicion.setid_dia(tiporequisicionOrigen.getid_dia());}
			if(conDefault || (!conDefault && tiporequisicionOrigen.gethora()!=null && !tiporequisicionOrigen.gethora().equals(new Time((new Date()).getTime())))) {tiporequisicion.sethora(tiporequisicionOrigen.gethora());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoRequisicion(TipoRequisicion tiporequisicion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoRequisicion.jLabelidTipoRequisicion.setText(tiporequisicion.getId().toString());
			this.jInternalFrameDetalleFormTipoRequisicion.jTextFieldcodigoTipoRequisicion.setText(tiporequisicion.getcodigo());
			this.jInternalFrameDetalleFormTipoRequisicion.jTextFieldnombreTipoRequisicion.setText(tiporequisicion.getnombre());
			this.jInternalFrameDetalleFormTipoRequisicion.jSpinnerhoraTipoRequisicion.setValue(tiporequisicion.gethora());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoRequisicion(TipoRequisicionBean tiporequisicionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoRequisicion.jLabelidTipoRequisicion.setText(tiporequisicionBean.getId().toString());
			this.jInternalFrameDetalleFormTipoRequisicion.jTextFieldcodigoTipoRequisicion.setText(tiporequisicionBean.getcodigo());
			this.jInternalFrameDetalleFormTipoRequisicion.jTextFieldnombreTipoRequisicion.setText(tiporequisicionBean.getnombre());
			this.jInternalFrameDetalleFormTipoRequisicion.jSpinnerhoraTipoRequisicion.setValue(tiporequisicionBean.gethora());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoRequisicion(TipoRequisicionParameterReturnGeneral tiporequisicionReturnGeneral,TipoRequisicionBean tiporequisicionBean,Boolean conDefault) throws Exception { 
		try {
			TipoRequisicion tiporequisicionLocal=new TipoRequisicion();
			
			tiporequisicionLocal=tiporequisicionReturnGeneral.getTipoRequisicion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiporequisicionLocal.getId()!=null && !tiporequisicionLocal.getId().equals(0L))) {tiporequisicionBean.setId(tiporequisicionLocal.getId());}}
			if(conDefault || (!conDefault && tiporequisicionLocal.getcodigo()!=null && !tiporequisicionLocal.getcodigo().equals(""))) {tiporequisicionBean.setcodigo(tiporequisicionLocal.getcodigo());}
			if(conDefault || (!conDefault && tiporequisicionLocal.getnombre()!=null && !tiporequisicionLocal.getnombre().equals(""))) {tiporequisicionBean.setnombre(tiporequisicionLocal.getnombre());}
			if(conDefault || (!conDefault && tiporequisicionLocal.getid_tipo_periodo()!=null && !tiporequisicionLocal.getid_tipo_periodo().equals(-1L))) {tiporequisicionBean.setid_tipo_periodo(tiporequisicionLocal.getid_tipo_periodo());}
			if(conDefault || (!conDefault && tiporequisicionLocal.getid_dia()!=null && !tiporequisicionLocal.getid_dia().equals(-1L))) {tiporequisicionBean.setid_dia(tiporequisicionLocal.getid_dia());}
			if(conDefault || (!conDefault && tiporequisicionLocal.gethora()!=null && !tiporequisicionLocal.gethora().equals(new Time((new Date()).getTime())))) {tiporequisicionBean.sethora(tiporequisicionLocal.gethora());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoRequisicionGenerico(Long idTipoRequisicionSeleccionado,JComboBox jComboBoxTipoRequisicion,List<TipoRequisicion> tiporequisicionsLocal)throws Exception {
		try {
			TipoRequisicion  tiporequisicionTemp=null;

			for(TipoRequisicion tiporequisicionAux:tiporequisicionsLocal) {
				if(tiporequisicionAux.getId()!=null && tiporequisicionAux.getId().equals(idTipoRequisicionSeleccionado)) {
					tiporequisicionTemp=tiporequisicionAux;
					break;
				}
			}

			jComboBoxTipoRequisicion.setSelectedItem(tiporequisicionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoRequisicionGenerico(JComboBox jComboBoxTipoRequisicion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoRequisicion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoRequisicion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoRequisicion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoRequisicion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporequisicion=(TipoRequisicion) tiporequisicionLogic.getTipoRequisicions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiporequisicion =(TipoRequisicion) tiporequisicions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tiporequisicion.getIsNew() && !tiporequisicion.getIsChanged() && !tiporequisicion.getIsDeleted()) {
				sDescripcion=tiporequisicion.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tiporequisicion.getempresa_descripcion();
			}
		}

		if(sTipo.equals("TipoPeriodo")) {
			//sDescripcion=this.getActualTipoPeriodoForeignKeyDescripcion((Long)value);
			if(!tiporequisicion.getIsNew() && !tiporequisicion.getIsChanged() && !tiporequisicion.getIsDeleted()) {
				sDescripcion=tiporequisicion.gettipoperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualTipoPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=tiporequisicion.gettipoperiodo_descripcion();
			}
		}

		if(sTipo.equals("Dia")) {
			//sDescripcion=this.getActualDiaForeignKeyDescripcion((Long)value);
			if(!tiporequisicion.getIsNew() && !tiporequisicion.getIsChanged() && !tiporequisicion.getIsDeleted()) {
				sDescripcion=tiporequisicion.getdia_descripcion();
			} else {
				//sDescripcion=this.getActualDiaForeignKeyDescripcion((Long)value);
				sDescripcion=tiporequisicion.getdia_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoRequisicion tiporequisicionRow=new TipoRequisicion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporequisicionRow=(TipoRequisicion) tiporequisicionLogic.getTipoRequisicions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiporequisicionRow=(TipoRequisicion) tiporequisicions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoRequisicion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoRequisicion.setVisible((this.isVisibilidadCeldaNuevoTipoRequisicion && this.isPermisoNuevoTipoRequisicion));			
			this.jButtonDuplicarTipoRequisicion.setVisible((this.isVisibilidadCeldaDuplicarTipoRequisicion && this.isPermisoDuplicarTipoRequisicion));			
			this.jButtonCopiarTipoRequisicion.setVisible((this.isVisibilidadCeldaCopiarTipoRequisicion && this.isPermisoCopiarTipoRequisicion));
			this.jButtonVerFormTipoRequisicion.setVisible((this.isVisibilidadCeldaVerFormTipoRequisicion && this.isPermisoVerFormTipoRequisicion));
			
			this.jButtonAbrirOrderByTipoRequisicion.setVisible((this.isVisibilidadCeldaOrdenTipoRequisicion && this.isPermisoOrdenTipoRequisicion));			
			
			this.jButtonNuevoRelacionesTipoRequisicion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRequisicion && this.isPermisoNuevoTipoRequisicion));			
			this.jButtonNuevoGuardarCambiosTipoRequisicion.setVisible((this.isVisibilidadCeldaNuevoTipoRequisicion && this.isPermisoNuevoTipoRequisicion && this.isPermisoGuardarCambiosTipoRequisicion));
			
			if(this.jInternalFrameDetalleFormTipoRequisicion!=null) {
			this.jInternalFrameDetalleFormTipoRequisicion.jButtonModificarTipoRequisicion.setVisible((this.isVisibilidadCeldaModificarTipoRequisicion && this.isPermisoActualizarTipoRequisicion));	
			this.jInternalFrameDetalleFormTipoRequisicion.jButtonActualizarTipoRequisicion.setVisible((this.isVisibilidadCeldaActualizarTipoRequisicion && this.isPermisoActualizarTipoRequisicion));	
			this.jInternalFrameDetalleFormTipoRequisicion.jButtonEliminarTipoRequisicion.setVisible((this.isVisibilidadCeldaEliminarTipoRequisicion && this.isPermisoEliminarTipoRequisicion));
			this.jInternalFrameDetalleFormTipoRequisicion.jButtonCancelarTipoRequisicion.setVisible(this.isVisibilidadCeldaCancelarTipoRequisicion);							
			this.jInternalFrameDetalleFormTipoRequisicion.jButtonGuardarCambiosTipoRequisicion.setVisible((this.isVisibilidadCeldaGuardarTipoRequisicion && this.isPermisoGuardarCambiosTipoRequisicion));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoRequisicion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRequisicion && this.isPermisoGuardarCambiosTipoRequisicion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoRequisicion.setVisible((this.isVisibilidadCeldaNuevoTipoRequisicion && this.isPermisoNuevoTipoRequisicion));						
			this.jButtonDuplicarToolBarTipoRequisicion.setVisible((this.isVisibilidadCeldaDuplicarTipoRequisicion && this.isPermisoDuplicarTipoRequisicion));						
			this.jButtonCopiarToolBarTipoRequisicion.setVisible((this.isVisibilidadCeldaCopiarTipoRequisicion && this.isPermisoCopiarTipoRequisicion));			
			this.jButtonVerFormToolBarTipoRequisicion.setVisible((this.isVisibilidadCeldaVerFormTipoRequisicion && this.isPermisoVerFormTipoRequisicion));			
			this.jButtonAbrirOrderByToolBarTipoRequisicion.setVisible((this.isVisibilidadCeldaOrdenTipoRequisicion && this.isPermisoOrdenTipoRequisicion));
			this.jButtonNuevoRelacionesToolBarTipoRequisicion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRequisicion && this.isPermisoNuevoTipoRequisicion));			
			this.jButtonNuevoGuardarCambiosToolBarTipoRequisicion.setVisible((this.isVisibilidadCeldaNuevoTipoRequisicion && this.isPermisoNuevoTipoRequisicion && this.isPermisoGuardarCambiosTipoRequisicion));			
			
			if(this.jInternalFrameDetalleFormTipoRequisicion!=null) {
			this.jInternalFrameDetalleFormTipoRequisicion.jButtonModificarToolBarTipoRequisicion.setVisible((this.isVisibilidadCeldaModificarTipoRequisicion && this.isPermisoActualizarTipoRequisicion));	
			this.jInternalFrameDetalleFormTipoRequisicion.jButtonActualizarToolBarTipoRequisicion.setVisible((this.isVisibilidadCeldaActualizarTipoRequisicion  && this.isPermisoActualizarTipoRequisicion));	
			this.jInternalFrameDetalleFormTipoRequisicion.jButtonEliminarToolBarTipoRequisicion.setVisible((this.isVisibilidadCeldaEliminarTipoRequisicion && this.isPermisoEliminarTipoRequisicion));
			this.jInternalFrameDetalleFormTipoRequisicion.jButtonCancelarToolBarTipoRequisicion.setVisible(this.isVisibilidadCeldaCancelarTipoRequisicion);				
			this.jInternalFrameDetalleFormTipoRequisicion.jButtonGuardarCambiosToolBarTipoRequisicion.setVisible((this.isVisibilidadCeldaGuardarTipoRequisicion && this.isPermisoGuardarCambiosTipoRequisicion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoRequisicion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRequisicion && this.isPermisoGuardarCambiosTipoRequisicion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoRequisicion.setVisible((this.isVisibilidadCeldaNuevoTipoRequisicion && this.isPermisoNuevoTipoRequisicion));			
			this.jMenuItemDuplicarTipoRequisicion.setVisible((this.isVisibilidadCeldaDuplicarTipoRequisicion && this.isPermisoDuplicarTipoRequisicion));			
			this.jMenuItemCopiarTipoRequisicion.setVisible((this.isVisibilidadCeldaCopiarTipoRequisicion && this.isPermisoCopiarTipoRequisicion));			
			this.jMenuItemVerFormTipoRequisicion.setVisible((this.isVisibilidadCeldaVerFormTipoRequisicion && this.isPermisoVerFormTipoRequisicion));			
			this.jMenuItemAbrirOrderByTipoRequisicion.setVisible((this.isVisibilidadCeldaOrdenTipoRequisicion && this.isPermisoOrdenTipoRequisicion));			
			//this.jMenuItemMostrarOcultarTipoRequisicion.setVisible((this.isVisibilidadCeldaOrdenTipoRequisicion && this.isPermisoOrdenTipoRequisicion));
			this.jMenuItemDetalleAbrirOrderByTipoRequisicion.setVisible((this.isVisibilidadCeldaOrdenTipoRequisicion && this.isPermisoOrdenTipoRequisicion));			
			//this.jMenuItemDetalleMostrarOcultarTipoRequisicion.setVisible((this.isVisibilidadCeldaOrdenTipoRequisicion && this.isPermisoOrdenTipoRequisicion));			
			this.jMenuItemNuevoRelacionesTipoRequisicion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRequisicion && this.isPermisoNuevoTipoRequisicion));			
			this.jMenuItemNuevoGuardarCambiosTipoRequisicion.setVisible((this.isVisibilidadCeldaNuevoTipoRequisicion && this.isPermisoNuevoTipoRequisicion && this.isPermisoGuardarCambiosTipoRequisicion));									
			
			if(this.jInternalFrameDetalleFormTipoRequisicion!=null) {
			this.jInternalFrameDetalleFormTipoRequisicion.jMenuItemModificarTipoRequisicion.setVisible((this.isVisibilidadCeldaModificarTipoRequisicion && this.isPermisoActualizarTipoRequisicion));	
			this.jInternalFrameDetalleFormTipoRequisicion.jMenuItemActualizarTipoRequisicion.setVisible((this.isVisibilidadCeldaActualizarTipoRequisicion && this.isPermisoActualizarTipoRequisicion));	
			this.jInternalFrameDetalleFormTipoRequisicion.jMenuItemEliminarTipoRequisicion.setVisible((this.isVisibilidadCeldaEliminarTipoRequisicion && this.isPermisoEliminarTipoRequisicion));
			this.jInternalFrameDetalleFormTipoRequisicion.jMenuItemCancelarTipoRequisicion.setVisible(this.isVisibilidadCeldaCancelarTipoRequisicion);				
			}
			
			this.jMenuItemGuardarCambiosTipoRequisicion.setVisible((this.isVisibilidadCeldaGuardarTipoRequisicion && this.isPermisoGuardarCambiosTipoRequisicion));						
			this.jMenuItemGuardarCambiosTablaTipoRequisicion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRequisicion && this.isPermisoGuardarCambiosTipoRequisicion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoRequisicion=this.jButtonNuevoTipoRequisicion.isVisible();
			this.isVisibilidadCeldaDuplicarTipoRequisicion=this.jButtonDuplicarTipoRequisicion.isVisible();
			this.isVisibilidadCeldaCopiarTipoRequisicion=this.jButtonCopiarTipoRequisicion.isVisible();
			this.isVisibilidadCeldaVerFormTipoRequisicion=this.jButtonVerFormTipoRequisicion.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoRequisicion=this.jButtonAbrirOrderByTipoRequisicion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoRequisicion=this.jButtonNuevoRelacionesTipoRequisicion.isVisible();
			this.isVisibilidadCeldaModificarTipoRequisicion=this.jButtonModificarTipoRequisicion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRequisicion!=null) {
			this.isVisibilidadCeldaActualizarTipoRequisicion=this.jInternalFrameDetalleFormTipoRequisicion.jButtonActualizarTipoRequisicion.isVisible();
			this.isVisibilidadCeldaEliminarTipoRequisicion=this.jInternalFrameDetalleFormTipoRequisicion.jButtonEliminarTipoRequisicion.isVisible();
			this.isVisibilidadCeldaCancelarTipoRequisicion=this.jInternalFrameDetalleFormTipoRequisicion.jButtonCancelarTipoRequisicion.isVisible();
			this.isVisibilidadCeldaGuardarTipoRequisicion=this.jInternalFrameDetalleFormTipoRequisicion.jButtonGuardarCambiosTipoRequisicion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoRequisicion=this.jButtonGuardarCambiosTablaTipoRequisicion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoRequisicion=this.jButtonNuevoToolBarTipoRequisicion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoRequisicion=this.jButtonNuevoRelacionesToolBarTipoRequisicion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRequisicion!=null) {
			this.isVisibilidadCeldaModificarTipoRequisicion=this.jInternalFrameDetalleFormTipoRequisicion.jButtonModificarToolBarTipoRequisicion.isVisible();
			this.isVisibilidadCeldaActualizarTipoRequisicion=this.jInternalFrameDetalleFormTipoRequisicion.jButtonActualizarToolBarTipoRequisicion.isVisible();
			this.isVisibilidadCeldaEliminarTipoRequisicion=this.jInternalFrameDetalleFormTipoRequisicion.jButtonEliminarToolBarTipoRequisicion.isVisible();
			this.isVisibilidadCeldaCancelarTipoRequisicion=this.jInternalFrameDetalleFormTipoRequisicion.jButtonCancelarToolBarTipoRequisicion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoRequisicion=this.jButtonGuardarCambiosToolBarTipoRequisicion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoRequisicion=this.jButtonGuardarCambiosTablaToolBarTipoRequisicion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoRequisicion=this.jMenuItemNuevoTipoRequisicion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoRequisicion=this.jMenuItemNuevoRelacionesTipoRequisicion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRequisicion!=null) {
			this.isVisibilidadCeldaModificarTipoRequisicion=this.jInternalFrameDetalleFormTipoRequisicion.jMenuItemModificarTipoRequisicion.isVisible();
			this.isVisibilidadCeldaActualizarTipoRequisicion=this.jInternalFrameDetalleFormTipoRequisicion.jMenuItemActualizarTipoRequisicion.isVisible();
			this.isVisibilidadCeldaEliminarTipoRequisicion=this.jInternalFrameDetalleFormTipoRequisicion.jMenuItemEliminarTipoRequisicion.isVisible();
			this.isVisibilidadCeldaCancelarTipoRequisicion=this.jInternalFrameDetalleFormTipoRequisicion.jMenuItemCancelarTipoRequisicion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoRequisicion=this.jMenuItemGuardarCambiosTipoRequisicion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoRequisicion=this.jMenuItemGuardarCambiosTablaTipoRequisicion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoRequisicion(Boolean esInicializar) {
		if(TipoRequisicionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tiporequisicionSessionBean.getConGuardarRelaciones()) {
				//if(this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoRequisicion();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoRequisicion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoRequisicion() {
		this.jButtonNuevoTipoRequisicion.setVisible(this.isPermisoNuevoTipoRequisicion);			
		this.jButtonDuplicarTipoRequisicion.setVisible(this.isPermisoDuplicarTipoRequisicion);			
		this.jButtonCopiarTipoRequisicion.setVisible(this.isPermisoCopiarTipoRequisicion);			
		this.jButtonVerFormTipoRequisicion.setVisible(this.isPermisoVerFormTipoRequisicion);			
		
		this.jButtonAbrirOrderByTipoRequisicion.setVisible(this.isPermisoOrdenTipoRequisicion);					
		
		this.jButtonNuevoRelacionesTipoRequisicion.setVisible(this.isPermisoNuevoTipoRequisicion);			
		
		if(this.jInternalFrameDetalleFormTipoRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRequisicion.jButtonModificarTipoRequisicion.setVisible(this.isPermisoActualizarTipoRequisicion);	
			this.jInternalFrameDetalleFormTipoRequisicion.jButtonActualizarTipoRequisicion.setVisible(this.isPermisoActualizarTipoRequisicion);	
			this.jInternalFrameDetalleFormTipoRequisicion.jButtonEliminarTipoRequisicion.setVisible(this.isPermisoEliminarTipoRequisicion);
			this.jInternalFrameDetalleFormTipoRequisicion.jButtonCancelarTipoRequisicion.setVisible(this.isVisibilidadCeldaCancelarTipoRequisicion);						
			this.jInternalFrameDetalleFormTipoRequisicion.jButtonGuardarCambiosTipoRequisicion.setVisible(this.isPermisoGuardarCambiosTipoRequisicion);							
		}
		
		this.jButtonGuardarCambiosTablaTipoRequisicion.setVisible(this.isPermisoActualizarTipoRequisicion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoRequisicion() {
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonModificarTipoRequisicion.setVisible(this.isPermisoActualizarTipoRequisicion);	
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonActualizarTipoRequisicion.setVisible(this.isPermisoActualizarTipoRequisicion);	
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonEliminarTipoRequisicion.setVisible(this.isPermisoEliminarTipoRequisicion);
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonCancelarTipoRequisicion.setVisible(this.isVisibilidadCeldaCancelarTipoRequisicion);							
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonGuardarCambiosTipoRequisicion.setVisible((this.isVisibilidadCeldaGuardarTipoRequisicion && this.isPermisoGuardarCambiosTipoRequisicion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoRequisicion() {
		if(TipoRequisicionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoRequisicion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoRequisicion() {
	}
	
	public void jTableDatosTipoRequisicionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoRequisicion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRequisicion(this.gettiporequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRequisicion(this.tiporequisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporequisicion =(TipoRequisicion) this.tiporequisicionLogic.getTipoRequisicions().toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporequisicion =(TipoRequisicion) this.tiporequisicions.toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporequisicion==null) {
						this.tiporequisicion = new TipoRequisicion();
					}

					this.setVariablesFormularioToObjetoActualTipoRequisicion(this.tiporequisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRequisicion(this.tiporequisicion);
				}

				if(this.tiporequisicion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tiporequisicion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoRequisicionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoRequisicion(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRequisicion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoRequisicion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoRequisicion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicion =(TipoRequisicion) this.tiporequisicionLogic.getTipoRequisicions().toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporequisicion =(TipoRequisicion) this.tiporequisicions.toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoRequisicion(this.gettiporequisicion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRequisicion(this.tiporequisicion);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tiporequisicionLogic.getConnexion());

				if(this.tiporequisicion.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tiporequisicion.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoRequisicion=(TitledBorder)this.jScrollPanelDatosTipoRequisicion.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoRequisicion.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRequisicion(this.gettiporequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRequisicion(this.tiporequisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporequisicion =(TipoRequisicion) this.tiporequisicionLogic.getTipoRequisicions().toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporequisicion =(TipoRequisicion) this.tiporequisicions.toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporequisicion==null) {
						this.tiporequisicion = new TipoRequisicion();
					}

					this.setVariablesFormularioToObjetoActualTipoRequisicion(this.tiporequisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRequisicion(this.tiporequisicion);
				}

				if(this.tiporequisicion.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tiporequisicion.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRequisicion(this.gettiporequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRequisicion(this.tiporequisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporequisicion =(TipoRequisicion) this.tiporequisicionLogic.getTipoRequisicions().toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporequisicion =(TipoRequisicion) this.tiporequisicions.toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporequisicion==null) {
						this.tiporequisicion = new TipoRequisicion();
					}

					this.setVariablesFormularioToObjetoActualTipoRequisicion(this.tiporequisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRequisicion(this.tiporequisicion);
				}

				if(this.tiporequisicion.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tiporequisicion.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRequisicion(this.gettiporequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRequisicion(this.tiporequisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporequisicion =(TipoRequisicion) this.tiporequisicionLogic.getTipoRequisicions().toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporequisicion =(TipoRequisicion) this.tiporequisicions.toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporequisicion==null) {
						this.tiporequisicion = new TipoRequisicion();
					}

					this.setVariablesFormularioToObjetoActualTipoRequisicion(this.tiporequisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRequisicion(this.tiporequisicion);
				}

				if(this.tiporequisicion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tiporequisicion.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_periodoTipoRequisicionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoperiodo=true;

			idTienePermisotipoperiodo=this.tienePermisosUsuarioEnPaginaWebTipoRequisicion(TipoPeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRequisicion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoRequisicion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoRequisicion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicion =(TipoRequisicion) this.tiporequisicionLogic.getTipoRequisicions().toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporequisicion =(TipoRequisicion) this.tiporequisicions.toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoRequisicion(this.gettiporequisicion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRequisicion(this.tiporequisicion);

				this.tipoperiodoBeanSwingJInternalFrame=new TipoPeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoperiodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoperiodoBeanSwingJInternalFrame.getTipoPeriodoLogic().setConnexion(this.tiporequisicionLogic.getConnexion());

				if(this.tiporequisicion.getid_tipo_periodo()!=null) {
					this.tipoperiodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoperiodoBeanSwingJInternalFrame.setIdActual(this.tiporequisicion.getid_tipo_periodo());
					this.tipoperiodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoperiodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoperiodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.tipoperiodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoRequisicion=(TitledBorder)this.jScrollPanelDatosTipoRequisicion.getBorder();
				TitledBorder titledBordertipoperiodo=(TitledBorder)this.tipoperiodoBeanSwingJInternalFrame.jScrollPanelDatosTipoPeriodo.getBorder();

				titledBordertipoperiodo.setTitle(titledBorderTipoRequisicion.getTitle() + " -> Tipo Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_periodoTipoRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRequisicion(this.gettiporequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRequisicion(this.tiporequisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporequisicion =(TipoRequisicion) this.tiporequisicionLogic.getTipoRequisicions().toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporequisicion =(TipoRequisicion) this.tiporequisicions.toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporequisicion==null) {
						this.tiporequisicion = new TipoRequisicion();
					}

					this.setVariablesFormularioToObjetoActualTipoRequisicion(this.tiporequisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRequisicion(this.tiporequisicion);
				}

				if(this.tiporequisicion.getid_tipo_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_periodo = "+this.tiporequisicion.getid_tipo_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_diaTipoRequisicionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisodia=true;

			idTienePermisodia=this.tienePermisosUsuarioEnPaginaWebTipoRequisicion(DiaConstantesFunciones.CLASSNAME);

			if(idTienePermisodia) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRequisicion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoRequisicion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoRequisicion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicion =(TipoRequisicion) this.tiporequisicionLogic.getTipoRequisicions().toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporequisicion =(TipoRequisicion) this.tiporequisicions.toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoRequisicion(this.gettiporequisicion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRequisicion(this.tiporequisicion);

				this.diaBeanSwingJInternalFrame=new DiaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.diaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.diaBeanSwingJInternalFrame.getDiaLogic().setConnexion(this.tiporequisicionLogic.getConnexion());

				if(this.tiporequisicion.getid_dia()!=null) {
					this.diaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.diaBeanSwingJInternalFrame.setIdActual(this.tiporequisicion.getid_dia());
					this.diaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.diaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.diaBeanSwingJInternalFrame.inicializarActualizarBindingTablaDia();
				}

				JInternalFrameBase jinternalFrame =this.diaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoRequisicion=(TitledBorder)this.jScrollPanelDatosTipoRequisicion.getBorder();
				TitledBorder titledBorderdia=(TitledBorder)this.diaBeanSwingJInternalFrame.jScrollPanelDatosDia.getBorder();

				titledBorderdia.setTitle(titledBorderTipoRequisicion.getTitle() + " -> Dia");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_diaTipoRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRequisicion(this.gettiporequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRequisicion(this.tiporequisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporequisicion =(TipoRequisicion) this.tiporequisicionLogic.getTipoRequisicions().toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporequisicion =(TipoRequisicion) this.tiporequisicions.toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporequisicion==null) {
						this.tiporequisicion = new TipoRequisicion();
					}

					this.setVariablesFormularioToObjetoActualTipoRequisicion(this.tiporequisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRequisicion(this.tiporequisicion);
				}

				if(this.tiporequisicion.getid_dia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_dia = "+this.tiporequisicion.getid_dia().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhoraTipoRequisicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRequisicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRequisicion(this.gettiporequisicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRequisicion(this.tiporequisicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporequisicion =(TipoRequisicion) this.tiporequisicionLogic.getTipoRequisicions().toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporequisicion =(TipoRequisicion) this.tiporequisicions.toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporequisicion==null) {
						this.tiporequisicion = new TipoRequisicion();
					}

					this.setVariablesFormularioToObjetoActualTipoRequisicion(this.tiporequisicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRequisicion(this.tiporequisicion);
				}

				if(this.tiporequisicion.gethora()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hora = "+this.tiporequisicion.gethora().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRequisicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTipoRequisicionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoRequisicion(false,false);

			this.getTipoRequisicionsBusquedaPorCodigo();

			this.inicializarActualizarBindingTipoRequisicion(false);

			//if(TipoRequisicionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoRequisicion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoRequisicionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoRequisicion(false,false);

			this.getTipoRequisicionsBusquedaPorNombre();

			this.inicializarActualizarBindingTipoRequisicion(false);

			//if(TipoRequisicionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoRequisicion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdDiaTipoRequisicionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoRequisicion(false,false);

			this.getTipoRequisicionsFK_IdDia();

			this.inicializarActualizarBindingTipoRequisicion(false);

			//if(TipoRequisicionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoRequisicion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTipoRequisicionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoRequisicion(false,false);

			this.getTipoRequisicionsFK_IdEmpresa();

			this.inicializarActualizarBindingTipoRequisicion(false);

			//if(TipoRequisicionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoRequisicion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoPeriodoTipoRequisicionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoRequisicion(false,false);

			this.getTipoRequisicionsFK_IdTipoPeriodo();

			this.inicializarActualizarBindingTipoRequisicion(false);

			//if(TipoRequisicionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoRequisicion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporequisicionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoRequisicion() {
		if(this.jInternalFrameDetalleFormTipoRequisicion!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoRequisicion!=null) {
			this.jInternalFrameDetalleFormTipoRequisicion.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoRequisicion.dispose();
			this.jInternalFrameDetalleFormTipoRequisicion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoRequisicion!=null) {
			this.jInternalFrameReporteDinamicoTipoRequisicion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoRequisicion.dispose();
			this.jInternalFrameReporteDinamicoTipoRequisicion=null;
		}
		
		if(this.jInternalFrameImportacionTipoRequisicion!=null) {
			this.jInternalFrameImportacionTipoRequisicion.setVisible(false);	    			
			this.jInternalFrameImportacionTipoRequisicion.dispose();
			this.jInternalFrameImportacionTipoRequisicion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoRequisicion();
			
			TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoRequisicion")) {
				jButtonNuevoTipoRequisicionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoRequisicion")) {
				jButtonDuplicarTipoRequisicionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoRequisicion")) {
				jButtonCopiarTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoRequisicion")) {
				jButtonVerFormTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoRequisicion")) {
				jButtonNuevoTipoRequisicionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoRequisicion")) {
				jButtonDuplicarTipoRequisicionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoRequisicion")) {
				jButtonNuevoTipoRequisicionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoRequisicion")) {
				jButtonDuplicarTipoRequisicionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoRequisicion")) {
				jButtonNuevoTipoRequisicionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoRequisicion")) {
				jButtonNuevoTipoRequisicionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoRequisicion")) {
				jButtonNuevoTipoRequisicionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoRequisicion")) {
				jButtonModificarTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoRequisicion")) {
				jButtonModificarTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoRequisicion")) {
				jButtonModificarTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoRequisicion")) {
				jButtonActualizarTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoRequisicion")) {
				jButtonActualizarTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoRequisicion")) {
				jButtonActualizarTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoRequisicion")) {
				jButtonEliminarTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoRequisicion")) {
				jButtonEliminarTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoRequisicion")) {
				jButtonEliminarTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoRequisicion")) {
				jButtonCancelarTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoRequisicion")) {
				jButtonCancelarTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoRequisicion")) {
				jButtonCancelarTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoRequisicion")) {
				jButtonCerrarTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoRequisicion")) {
				jButtonCerrarTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoRequisicion")) {
				jButtonCerrarTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoRequisicion")) {
				jButtonMostrarOcultarTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoRequisicion")) {
				jButtonCancelarTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoRequisicion")) {
				jButtonGuardarCambiosTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoRequisicion")) {
				jButtonGuardarCambiosTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoRequisicion")) {
				jButtonCopiarTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoRequisicion")) {
				jButtonVerFormTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoRequisicion")) {
				jButtonGuardarCambiosTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoRequisicion")) {
				jButtonCopiarTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoRequisicion")) {
				jButtonVerFormTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoRequisicion")) {
				jButtonGuardarCambiosTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoRequisicion")) {
				jButtonGuardarCambiosTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoRequisicion")) {
				jButtonGuardarCambiosTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoRequisicion")) {
				jButtonRecargarInformacionTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoRequisicion")) {
				jButtonRecargarInformacionTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoRequisicion")) {
				jButtonRecargarInformacionTipoRequisicionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoRequisicion")) {
				jButtonAnterioresTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoRequisicion")) {
				jButtonAnterioresTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoRequisicion")) {
				jButtonAnterioresTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoRequisicion")) {
				jButtonSiguientesTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoRequisicion")) {
				jButtonSiguientesTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoRequisicion")) {
				jButtonSiguientesTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoRequisicion") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoRequisicion")) {
				jButtonAbrirOrderByTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoRequisicion") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoRequisicion")) {
				jButtonMostrarOcultarTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoRequisicion")) {
				jButtonNuevoGuardarCambiosTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoRequisicion")) {
				jButtonNuevoGuardarCambiosTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoRequisicion")) {
				jButtonNuevoGuardarCambiosTipoRequisicionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoRequisicion")) {
				jButtonCerrarReporteDinamicoTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoRequisicion")) {
				jButtonGenerarReporteDinamicoTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoRequisicion")) {
				
				jButtonGenerarExcelReporteDinamicoTipoRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoRequisicion")) {
				jButtonCerrarImportacionTipoRequisicionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoRequisicion")) {
				
				jButtonGenerarImportacionTipoRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoRequisicion")) {
				
				jButtonAbrirImportacionTipoRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoRequisicion")) {
				jComboBoxTiposAccionesTipoRequisicionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoRequisicion")) {
				jComboBoxTiposRelacionesTipoRequisicionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoRequisicion")) {
				jComboBoxTiposAccionesTipoRequisicionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoRequisicion")) {
				
				jComboBoxTiposSeleccionarTipoRequisicionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoRequisicion")) {
				jTextFieldValorCampoGeneralTipoRequisicionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoRequisicion")) {
				jButtonAbrirOrderByTipoRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoRequisicion")) {
				jButtonAbrirOrderByTipoRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoRequisicion")) {
				jButtonCerrarOrderByTipoRequisicionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoRequisicionBusqueda")) {
				this.jButtonidTipoRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoRequisicionUpdate")) {
				this.jButtonid_empresaTipoRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoRequisicionBusqueda")) {
				this.jButtonid_empresaTipoRequisicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoRequisicionBusqueda")) {
				this.jButtoncodigoTipoRequisicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoRequisicionBusqueda")) {
				this.jButtonnombreTipoRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_periodoTipoRequisicionUpdate")) {
				this.jButtonid_tipo_periodoTipoRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_periodoTipoRequisicionBusqueda")) {
				this.jButtonid_tipo_periodoTipoRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_diaTipoRequisicionUpdate")) {
				this.jButtonid_diaTipoRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_diaTipoRequisicionBusqueda")) {
				this.jButtonid_diaTipoRequisicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horaTipoRequisicionBusqueda")) {
				this.jButtonhoraTipoRequisicionBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoTipoRequisicion")) {
				this.jButtonBusquedaPorCodigoTipoRequisicionActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoRequisicion")) {
				this.jButtonBusquedaPorNombreTipoRequisicionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdDiaTipoRequisicion")) {
				this.jButtonFK_IdDiaTipoRequisicionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoPeriodoTipoRequisicion")) {
				this.jButtonFK_IdTipoPeriodoTipoRequisicionActionPerformed(evt);
			}
			
			;
			
			
			TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoRequisicion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRequisicionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporequisicion);
				
				TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
				
				


				
				TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRequisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRequisicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoRequisicion tiporequisicionLocal=null;
			
			if(!this.getEsControlTabla()) {
				tiporequisicionLocal=this.tiporequisicion;
			} else {
				tiporequisicionLocal=this.tiporequisicionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporequisicion);
				
				TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
							
				
				


				
				TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRequisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRequisicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRequisicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRequisicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionAnterior =(TipoRequisicion) this.tiporequisicionLogic.getTipoRequisicions().toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporequisicionAnterior =(TipoRequisicion) this.tiporequisicions.toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
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
			
			TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
			
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
			
			


			
			TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRequisicionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporequisicion);
				
				TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
								
						
				


				
				TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRequisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRequisicion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporequisicion);
				
				TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
								
				
				


				
				TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRequisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRequisicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRequisicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRequisicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionAnterior =(TipoRequisicion) this.tiporequisicionLogic.getTipoRequisicions().toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporequisicionAnterior =(TipoRequisicion) this.tiporequisicions.toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporequisicion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRequisicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRequisicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionAnterior =(TipoRequisicion) this.tiporequisicionLogic.getTipoRequisicions().toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporequisicionAnterior =(TipoRequisicion) this.tiporequisicions.toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRequisicionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporequisicion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporequisicion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporequisicion);
				
				TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
							
				
				


				
				TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRequisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRequisicion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRequisicionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoRequisicion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporequisicionAnterior =(TipoRequisicion) this.tiporequisicionLogic.getTipoRequisicions().toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiporequisicionAnterior =(TipoRequisicion) this.tiporequisicions.toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
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
			
			TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
			
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
			
			


			
			TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRequisicionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporequisicion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporequisicion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporequisicion);
				
				TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
								
				
				


				
				TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRequisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRequisicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRequisicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRequisicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionAnterior =(TipoRequisicion) this.tiporequisicionLogic.getTipoRequisicions().toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporequisicionAnterior =(TipoRequisicion) this.tiporequisicions.toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRequisicionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporequisicion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporequisicion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRequisicionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporequisicion);
				
				TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoRequisicion")) {
					jCheckBoxSeleccionarTodosTipoRequisicionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoRequisicion")) {
					jCheckBoxSeleccionadosTipoRequisicionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoRequisicion")) {
					
				}
				
				


				
				
				TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRequisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRequisicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporequisicion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tiporequisicion);
				
				TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
												
				
				


				
				
				TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRequisicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRequisicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRequisicionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoRequisicion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporequisicionAnterior =(TipoRequisicion) this.tiporequisicionLogic.getTipoRequisicions().toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiporequisicionAnterior =(TipoRequisicion) this.tiporequisicions.toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRequisicionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporequisicion);
				
				TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
				
				
				TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
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
			
			TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
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
			
			


			
			TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRequisicionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporequisicion);
				
				TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRequisicion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRequisicion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporequisicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporequisicion);
				
				TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
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
				
				


				
				TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRequisicion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRequisicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRequisicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRequisicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporequisicionAnterior =(TipoRequisicion) this.tiporequisicionLogic.getTipoRequisicions().toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporequisicionAnterior =(TipoRequisicion) this.tiporequisicions.toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoRequisicion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoRequisicionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoRequisicion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tiporequisicion =(TipoRequisicion) this.tiporequisicionLogic.getTipoRequisicions().toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tiporequisicion =(TipoRequisicion) this.tiporequisicions.toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tiporequisicion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoRequisicion")) {
				
				}
				
				TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoRequisicion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoRequisicion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoRequisicion")) {
			
			}
			
			TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoRequisicion();
			
			TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
			
			if(sTipo.equals("NuevoTipoRequisicion")) {
				jButtonNuevoTipoRequisicionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoRequisicion")) {
				jButtonDuplicarTipoRequisicionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoRequisicion")) {
				jButtonCopiarTipoRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoRequisicion")) {
				jButtonVerFormTipoRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoRequisicion")) {
				jButtonNuevoTipoRequisicionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoRequisicion")) {
				jButtonModificarTipoRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoRequisicion")) {
				jButtonActualizarTipoRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoRequisicion")) {
				jButtonEliminarTipoRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoRequisicion")) {
				jButtonGuardarCambiosTipoRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoRequisicion")) {
				jButtonCancelarTipoRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoRequisicion")) {
				jButtonCerrarTipoRequisicionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoRequisicion")) {
				jButtonGuardarCambiosTipoRequisicionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoRequisicion")) {
				jButtonNuevoGuardarCambiosTipoRequisicionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoRequisicion")) {
				jButtonAbrirOrderByTipoRequisicionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoRequisicion")) {
				jButtonRecargarInformacionTipoRequisicionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoRequisicion")) {
				jButtonAnterioresTipoRequisicionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoRequisicion")) {
				jButtonSiguientesTipoRequisicionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoRequisicionBusqueda")) {
				this.jButtonidTipoRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoRequisicionUpdate")) {
				this.jButtonid_empresaTipoRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoRequisicionBusqueda")) {
				this.jButtonid_empresaTipoRequisicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoRequisicionBusqueda")) {
				this.jButtoncodigoTipoRequisicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoRequisicionBusqueda")) {
				this.jButtonnombreTipoRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_periodoTipoRequisicionUpdate")) {
				this.jButtonid_tipo_periodoTipoRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_periodoTipoRequisicionBusqueda")) {
				this.jButtonid_tipo_periodoTipoRequisicionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_diaTipoRequisicionUpdate")) {
				this.jButtonid_diaTipoRequisicionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_diaTipoRequisicionBusqueda")) {
				this.jButtonid_diaTipoRequisicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horaTipoRequisicionBusqueda")) {
				this.jButtonhoraTipoRequisicionBusquedaActionPerformed(evt);
			}
			
			TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoRequisicion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoRequisicion")) {
				closingInternalFrameTipoRequisicion();
				
			} else if(sTipo.equals("jButtonCancelarTipoRequisicion")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoRequisicion = (JInternalFrameBase)evt.getSource();
	            	
	            TipoRequisicionBeanSwingJInternalFrame jInternalFrameParent=(TipoRequisicionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoRequisicion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoRequisicionActionPerformed(null);
			}
			
			TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiporequisicion,new Object(),this.tiporequisicionParameterGeneral,this.tiporequisicionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoRequisicion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoRequisicion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoRequisicion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tiporequisicion)) {
			if(!esControlTabla) {
				if(TipoRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoRequisicion(this.tiporequisicion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRequisicion(this.tiporequisicion);			
				}
				
				if(this.tiporequisicionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoRequisicion(this.tiporequisicion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiporequisicionReturnGeneral=tiporequisicionLogic.procesarEventosTipoRequisicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporequisicionLogic.getTipoRequisicions(),this.tiporequisicion,this.tiporequisicionParameterGeneral,this.isEsNuevoTipoRequisicion,classes);//this.tiporequisicionLogic.getTipoRequisicion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoRequisicion(this.tiporequisicionReturnGeneral,this.tiporequisicionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tiporequisicionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoRequisicion(classes,this.tiporequisicionReturnGeneral,this.tiporequisicionBean,false);
					}
						
					if(this.tiporequisicionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoRequisicion(this.tiporequisicionReturnGeneral.getTipoRequisicion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoRequisicion(this.tiporequisicionReturnGeneral.getTipoRequisicion());	
					}
						
					if(this.tiporequisicionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoRequisicion(this.tiporequisicionReturnGeneral.getTipoRequisicion(),classes);//this.tiporequisicionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoRequisicion(this.tiporequisicion,classes);//this.tiporequisicionBean);									
				}
			
				if(TipoRequisicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoRequisicion(this.tiporequisicion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRequisicion(this.tiporequisicion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tiporequisicionAnterior!=null) {
						this.tiporequisicion=this.tiporequisicionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiporequisicionReturnGeneral=tiporequisicionLogic.procesarEventosTipoRequisicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporequisicionLogic.getTipoRequisicions(),this.tiporequisicion,this.tiporequisicionParameterGeneral,this.isEsNuevoTipoRequisicion,classes);//this.tiporequisicionLogic.getTipoRequisicion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiporequisicionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiporequisicionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tiporequisicionReturnGeneral.getTipoRequisicion(),tiporequisicionLogic.getTipoRequisicions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tiporequisicionReturnGeneral.getTipoRequisicion(),this.tiporequisicions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoRequisicion.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoRequisicion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoRequisicion();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoRequisicion() throws Exception {
		
		TipoRequisicionModel tiporequisicionModel=(TipoRequisicionModel)this.jTableDatosTipoRequisicion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporequisicionModel.tiporequisicions=this.tiporequisicionLogic.getTipoRequisicions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tiporequisicionModel.tiporequisicions=this.tiporequisicions;
		}
		
		
		((TipoRequisicionModel) this.jTableDatosTipoRequisicion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoRequisicion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettiporequisicionAnterior(),this.tiporequisicionLogic.getTipoRequisicions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettiporequisicionAnterior(),this.tiporequisicions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoRequisicion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoRequisicion(TipoRequisicion tiporequisicion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
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
										
				TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporequisicion,new Object(),generalEntityParameterGeneral,this.tiporequisicionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tiporequisicionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoRequisicionConstantesFunciones.getClassesRelationshipsOfTipoRequisicion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoRequisicionConstantesFunciones.getClassesRelationshipsFromStringsOfTipoRequisicion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoRequisicion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoRequisicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporequisicion,new Object(),generalEntityParameterGeneral,this.tiporequisicionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoRequisicion(TipoRequisicionBean tiporequisicionBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoRequisicion(ArrayList<Classe> classes,TipoRequisicionReturnGeneral tiporequisicionReturnGeneral,TipoRequisicionBean tiporequisicionBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoRequisicion(TipoRequisicion tiporequisicion,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tiporequisicion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoRequisicion = new TipoRequisicionDetalleFormJInternalFrame(jDesktopPane,this.tiporequisicionSessionBean.getConGuardarRelaciones(),this.tiporequisicionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoRequisicion);
		this.jInternalFrameDetalleFormTipoRequisicion.setVisible(false);
		this.jInternalFrameDetalleFormTipoRequisicion.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoRequisicion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoRequisicion.tiporequisicionLogic=this.tiporequisicionLogic;
		
		this.cargarCombosFrameForeignKeyTipoRequisicion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoRequisicion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoRequisicion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoRequisicion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoRequisicion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoRequisicion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoRequisicion"));
		
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonModificarTipoRequisicion.addActionListener(new ButtonActionListener(this,"ModificarTipoRequisicion"));

		
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonModificarToolBarTipoRequisicion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoRequisicion"));
					
		this.jInternalFrameDetalleFormTipoRequisicion.jMenuItemModificarTipoRequisicion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoRequisicion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonActualizarTipoRequisicion.addActionListener (new ButtonActionListener(this,"ActualizarTipoRequisicion"));
		
		
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonActualizarToolBarTipoRequisicion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoRequisicion"));
						
		this.jInternalFrameDetalleFormTipoRequisicion.jMenuItemActualizarTipoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoRequisicion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonEliminarTipoRequisicion.addActionListener (new ButtonActionListener(this,"EliminarTipoRequisicion"));
		
		
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonEliminarToolBarTipoRequisicion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoRequisicion"));
								
		this.jInternalFrameDetalleFormTipoRequisicion.jMenuItemEliminarTipoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoRequisicion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonCancelarTipoRequisicion.addActionListener (new ButtonActionListener(this,"CancelarTipoRequisicion"));
		
		
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonCancelarToolBarTipoRequisicion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoRequisicion"));
					
		this.jInternalFrameDetalleFormTipoRequisicion.jMenuItemCancelarTipoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoRequisicion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoRequisicion.jMenuItemDetalleCerrarTipoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoRequisicion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonGuardarCambiosToolBarTipoRequisicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRequisicion"));
		
		
		
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonGuardarCambiosToolBarTipoRequisicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRequisicion"));
		
		
		
		this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxTiposAccionesFormularioTipoRequisicion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoRequisicion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonidTipoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonid_empresaTipoRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonid_empresaTipoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRequisicion.jButtoncodigoTipoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonnombreTipoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonid_tipo_periodoTipoRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_periodoTipoRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonid_tipo_periodoTipoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_periodoTipoRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonid_diaTipoRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_diaTipoRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonid_diaTipoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_diaTipoRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonhoraTipoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"horaTipoRequisicionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoRequisicion.jTabbedPaneRelacionesTipoRequisicion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoRequisicion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoRequisicion"));
		
		if(this.jInternalFrameDetalleFormTipoRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRequisicion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoRequisicion"));
		}
		
		this.jTableDatosTipoRequisicion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoRequisicion"));
		
		this.jTableDatosTipoRequisicion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoRequisicion"));
		
		this.jButtonNuevoTipoRequisicion.addActionListener(new ButtonActionListener(this,"NuevoTipoRequisicion"));
		
		this.jButtonDuplicarTipoRequisicion.addActionListener(new ButtonActionListener(this,"DuplicarTipoRequisicion"));
		
		this.jButtonCopiarTipoRequisicion.addActionListener(new ButtonActionListener(this,"CopiarTipoRequisicion"));
		
		this.jButtonVerFormTipoRequisicion.addActionListener(new ButtonActionListener(this,"VerFormTipoRequisicion"));
		
		
		this.jButtonNuevoToolBarTipoRequisicion.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoRequisicion"));
			
		this.jButtonDuplicarToolBarTipoRequisicion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoRequisicion"));
			
		this.jMenuItemNuevoTipoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoRequisicion"));
			
		this.jMenuItemDuplicarTipoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoRequisicion"));		
		
		
		this.jButtonNuevoRelacionesTipoRequisicion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoRequisicion"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoRequisicion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoRequisicion"));
			
		this.jMenuItemNuevoRelacionesTipoRequisicion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoRequisicion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRequisicion.jButtonModificarTipoRequisicion.addActionListener(new ButtonActionListener(this,"ModificarTipoRequisicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRequisicion.jButtonModificarToolBarTipoRequisicion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoRequisicion"));
			
			this.jInternalFrameDetalleFormTipoRequisicion.jMenuItemModificarTipoRequisicion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoRequisicion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRequisicion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoRequisicion.jButtonActualizarTipoRequisicion.addActionListener (new ButtonActionListener(this,"ActualizarTipoRequisicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRequisicion.jButtonActualizarToolBarTipoRequisicion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoRequisicion"));
				
			this.jInternalFrameDetalleFormTipoRequisicion.jMenuItemActualizarTipoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoRequisicion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRequisicion.jButtonEliminarTipoRequisicion.addActionListener (new ButtonActionListener(this,"EliminarTipoRequisicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRequisicion.jButtonEliminarToolBarTipoRequisicion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoRequisicion"));
						
			this.jInternalFrameDetalleFormTipoRequisicion.jMenuItemEliminarTipoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoRequisicion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRequisicion.jButtonCancelarTipoRequisicion.addActionListener (new ButtonActionListener(this,"CancelarTipoRequisicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRequisicion.jButtonCancelarToolBarTipoRequisicion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoRequisicion"));
			
			this.jInternalFrameDetalleFormTipoRequisicion.jMenuItemCancelarTipoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoRequisicion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoRequisicion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoRequisicion"));		
		
		
		this.jButtonCerrarTipoRequisicion.addActionListener (new ButtonActionListener(this,"CerrarTipoRequisicion"));
		
		
		this.jButtonCerrarToolBarTipoRequisicion.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoRequisicion"));
			
		this.jMenuItemCerrarTipoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoRequisicion"));
			
		if(this.jInternalFrameDetalleFormTipoRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRequisicion.jMenuItemDetalleCerrarTipoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoRequisicion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRequisicion.jButtonGuardarCambiosTipoRequisicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoRequisicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRequisicion.jButtonGuardarCambiosToolBarTipoRequisicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRequisicion"));
		}
		
		this.jButtonCopiarToolBarTipoRequisicion.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoRequisicion"));
			
		this.jButtonVerFormToolBarTipoRequisicion.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoRequisicion"));
		
		this.jMenuItemGuardarCambiosTipoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoRequisicion"));
			
		this.jMenuItemCopiarTipoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoRequisicion"));		
		
		this.jMenuItemVerFormTipoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoRequisicion"));		
		
		
		this.jButtonGuardarCambiosTablaTipoRequisicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoRequisicion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoRequisicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoRequisicion"));
			
		this.jMenuItemGuardarCambiosTablaTipoRequisicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoRequisicion"));		
		
		
		
		this.jButtonRecargarInformacionTipoRequisicion.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoRequisicion"));
					
		this.jButtonRecargarInformacionToolBarTipoRequisicion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoRequisicion"));
		
		this.jMenuItemRecargarInformacionTipoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoRequisicion"));		
		
		
		
		this.jButtonAnterioresTipoRequisicion.addActionListener (new ButtonActionListener(this,"AnterioresTipoRequisicion"));
		
		
		this.jButtonAnterioresToolBarTipoRequisicion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoRequisicion"));
		
		this.jMenuItemAnterioresTipoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoRequisicion"));		
		
		
		this.jButtonSiguientesTipoRequisicion.addActionListener (new ButtonActionListener(this,"SiguientesTipoRequisicion"));
		
		
		this.jButtonSiguientesToolBarTipoRequisicion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoRequisicion"));
			
		this.jMenuItemSiguientesTipoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoRequisicion"));
			
		this.jMenuItemAbrirOrderByTipoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoRequisicion"));
			
		this.jMenuItemMostrarOcultarTipoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoRequisicion"));
			
		this.jMenuItemDetalleAbrirOrderByTipoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoRequisicion"));
			
		this.jMenuItemDetalleMostarOcultarTipoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoRequisicion"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoRequisicion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoRequisicion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRequisicion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoRequisicion"));
			
		this.jMenuItemNuevoGuardarCambiosTipoRequisicion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoRequisicion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoRequisicion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoRequisicion"));

		this.jCheckBoxSeleccionadosTipoRequisicion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoRequisicion"));
		
		if(this.jInternalFrameDetalleFormTipoRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxTiposAccionesFormularioTipoRequisicion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoRequisicion"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoRequisicion.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoRequisicion"));
			
		this.jComboBoxTiposAccionesTipoRequisicion.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoRequisicion"));
					
		this.jComboBoxTiposSeleccionarTipoRequisicion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoRequisicion"));
			
		this.jTextFieldValorCampoGeneralTipoRequisicion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoRequisicion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoRequisicion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonidTipoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonid_empresaTipoRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonid_empresaTipoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRequisicion.jButtoncodigoTipoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonnombreTipoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonid_tipo_periodoTipoRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_periodoTipoRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonid_tipo_periodoTipoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_periodoTipoRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonid_diaTipoRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_diaTipoRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonid_diaTipoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_diaTipoRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonhoraTipoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"horaTipoRequisicionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTipoRequisicion.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoRequisicion"));

			this.jButtonBusquedaPorNombreTipoRequisicion.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoRequisicion"));

			this.jButtonFK_IdDiaTipoRequisicion.addActionListener(new ButtonActionListener(this,"FK_IdDiaTipoRequisicion"));

			this.jButtonFK_IdTipoPeriodoTipoRequisicion.addActionListener(new ButtonActionListener(this,"FK_IdTipoPeriodoTipoRequisicion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoRequisicion!=null) {
				this.jInternalFrameReporteDinamicoTipoRequisicion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRequisicion"));
				this.jInternalFrameReporteDinamicoTipoRequisicion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRequisicion"));
				this.jInternalFrameReporteDinamicoTipoRequisicion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRequisicion"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoRequisicion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRequisicion"));				
			//this.jButtonGenerarReporteDinamicoTipoRequisicion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRequisicion"));
			//this.jButtonGenerarExcelReporteDinamicoTipoRequisicion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRequisicion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoRequisicion!=null) {
				this.jInternalFrameImportacionTipoRequisicion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoRequisicion"));
				this.jInternalFrameImportacionTipoRequisicion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoRequisicion"));
				this.jInternalFrameImportacionTipoRequisicion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoRequisicion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoRequisicion.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoRequisicion"));
			
			this.jButtonAbrirOrderByToolBarTipoRequisicion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoRequisicion"));			
			
			if(this.jInternalFrameOrderByTipoRequisicion!=null) {
				this.jInternalFrameOrderByTipoRequisicion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoRequisicion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoRequisicion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoRequisicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRequisicion.jTabbedPaneRelacionesTipoRequisicion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoRequisicion"));
		
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
            		closingInternalFrameTipoRequisicion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoRequisicion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoRequisicion = (JInternalFrameBase)event.getSource();
	            	
	            TipoRequisicionBeanSwingJInternalFrame jInternalFrameParent=(TipoRequisicionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoRequisicion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoRequisicionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoRequisicion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoRequisicionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoRequisicion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoRequisicion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRequisicionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRequisicionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRequisicionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoRequisicion";
		inputMap = this.jButtonNuevoTipoRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoRequisicionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRequisicionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRequisicionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRequisicionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoRequisicion";
		inputMap = this.jButtonNuevoRelacionesTipoRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoRequisicionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoRequisicion";
		inputMap = this.jButtonModificarTipoRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoRequisicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoRequisicion";
		inputMap = this.jButtonActualizarTipoRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoRequisicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoRequisicion";
		inputMap = this.jButtonEliminarTipoRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoRequisicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoRequisicion";
		inputMap = this.jButtonCancelarTipoRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoRequisicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoRequisicion";
		inputMap = this.jButtonCerrarTipoRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoRequisicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonGuardarCambiosTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoRequisicion";
		inputMap = this.jInternalFrameDetalleFormTipoRequisicion.jButtonGuardarCambiosTipoRequisicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonGuardarCambiosTipoRequisicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoRequisicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoRequisicion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoRequisicionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoRequisicion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoRequisicionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoRequisicion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoRequisicionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoRequisicion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoRequisicionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonidTipoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonid_empresaTipoRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonid_empresaTipoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRequisicion.jButtoncodigoTipoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonnombreTipoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonid_tipo_periodoTipoRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_periodoTipoRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonid_tipo_periodoTipoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_periodoTipoRequisicionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonid_diaTipoRequisicionUpdate.addActionListener(new ButtonActionListener(this,"id_diaTipoRequisicionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonid_diaTipoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"id_diaTipoRequisicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRequisicion.jButtonhoraTipoRequisicionBusqueda.addActionListener(new ButtonActionListener(this,"horaTipoRequisicionBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTipoRequisicion.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoRequisicion"));

		this.jButtonBusquedaPorNombreTipoRequisicion.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoRequisicion"));

		this.jButtonFK_IdDiaTipoRequisicion.addActionListener(new ButtonActionListener(this,"FK_IdDiaTipoRequisicion"));

		this.jButtonFK_IdTipoPeriodoTipoRequisicion.addActionListener(new ButtonActionListener(this,"FK_IdTipoPeriodoTipoRequisicion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoRequisicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoRequisicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoRequisicionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoRequisicion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoRequisicion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoRequisicion tiporequisicionAux:this.tiporequisicionLogic.getTipoRequisicions()) {
					tiporequisicionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRequisicion tiporequisicionAux:tiporequisicions) {
					tiporequisicionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoRequisicionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoRequisicion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoRequisicion tiporequisicionAux:this.tiporequisicionLogic.getTipoRequisicions()) {
						tiporequisicionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRequisicion tiporequisicionAux:tiporequisicions) {
						tiporequisicionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoRequisicion tiporequisicionAux:this.tiporequisicionLogic.getTipoRequisicions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRequisicion tiporequisicionAux:tiporequisicions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoRequisicion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoRequisicion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoRequisicion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoRequisicion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoRequisicionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoRequisicion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoRequisicion.getSelectedRows();
			
			TipoRequisicion tiporequisicionLocal=new TipoRequisicion();
			
			//this.seleccionarTodosTipoRequisicion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporequisicionLocal =(TipoRequisicion) this.tiporequisicionLogic.getTipoRequisicions().toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tiporequisicionLocal =(TipoRequisicion) this.tiporequisicions.toArray()[this.jTableDatosTipoRequisicion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tiporequisicionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoRequisicion tiporequisicionAux:this.tiporequisicionLogic.getTipoRequisicions()) {
						tiporequisicionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRequisicion tiporequisicionAux:tiporequisicions) {
						tiporequisicionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoRequisicion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoRequisicion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoRequisicion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoRequisicion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoRequisicionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoRequisicionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoRequisicionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoRequisicion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoRequisicion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoRequisicion tiporequisicionAux:this.tiporequisicionLogic.getTipoRequisicions()) {
				
						if(sTipoSeleccionar.equals(TipoRequisicionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiporequisicionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoRequisicionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiporequisicionAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoRequisicionConstantesFunciones.LABEL_HORA)) {
							existe=true;
							tiporequisicionAux.sethora(Time.valueOf(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRequisicion tiporequisicionAux:tiporequisicions) {
					
						if(sTipoSeleccionar.equals(TipoRequisicionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiporequisicionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoRequisicionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiporequisicionAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoRequisicionConstantesFunciones.LABEL_HORA)) {
							existe=true;
							tiporequisicionAux.sethora(Time.valueOf(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoRequisicion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoRequisicionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoRequisicion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoRequisicion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoRequisicion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxTiposAccionesFormularioTipoRequisicion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoRequisicion) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoRequisicion(conSplash);
				
					this.generarReporteTipoRequisicionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRequisicion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxTiposAccionesFormularioTipoRequisicion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoRequisicionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoRequisicion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoRequisicionsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoRequisicion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoRequisicionsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoRequisicion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoRequisicion();
				
				this.exportarTipoRequisicionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRequisicion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxTiposAccionesFormularioTipoRequisicion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoRequisicions();
				//this.importarTipoRequisicions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRequisicion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxTiposAccionesFormularioTipoRequisicion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoRequisicion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoRequisicionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoRequisicion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Requesicion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoRequisicion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoRequisicion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoRequisicion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Requesicion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRequisicion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxTiposAccionesFormularioTipoRequisicion.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoRequisicionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoRequisicion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoRequisicion(conSplash);
					
						//this.actualizarParametrosGeneralTipoRequisicion();
						
						this.generarReporteProcesoAccionTipoRequisicionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoRequisicion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxTiposAccionesFormularioTipoRequisicion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoRequisicionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo RequesicionES SELECCIONADOS?", "MANTENIMIENTO DE Tipo Requesicion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoRequisicion();
				
						this.actualizarParametrosGeneralTipoRequisicion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tiporequisicionReturnGeneral=tiporequisicionLogic.procesarAccionTipoRequisicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tiporequisicionLogic.getTipoRequisicions(),this.tiporequisicionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoRequisicionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoRequisicion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxTiposAccionesFormularioTipoRequisicion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoRequisicion();
					
					TipoRequisicionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoRequisicionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoRequisicion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxTiposAccionesFormularioTipoRequisicion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoRequisicion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoRequisicionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoRequisicion();
			
			if(this.jInternalFrameDetalleFormTipoRequisicion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoRequisicion> tiporequisicionsSeleccionados=new ArrayList<TipoRequisicion>();		
			TipoRequisicion tiporequisicion=new TipoRequisicion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoRequisicion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoRequisicion.getSelectedItem();
			
			
			
			
			tiporequisicionsSeleccionados=this.getTipoRequisicionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tiporequisicionsSeleccionados.size()==1) {
				for(TipoRequisicion tiporequisicionAux:tiporequisicionsSeleccionados) {
					tiporequisicion=tiporequisicionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoRequisicion();
			
      		//this.finishProcessTipoRequisicion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoRequisicionReturnGeneral() throws Exception {
		if(this.tiporequisicionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tiporequisicionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tiporequisicionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tiporequisicionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tiporequisicionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tiporequisicionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoRequisicion(false);
		}
		
		if(this.tiporequisicionReturnGeneral.getConRetornoLista() || this.tiporequisicionReturnGeneral.getConRetornoObjeto()) {
			if(this.tiporequisicionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiporequisicionLogic.setTipoRequisicions(this.tiporequisicionReturnGeneral.getTipoRequisicions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tiporequisicionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiporequisicionLogic.setTipoRequisicion(this.tiporequisicionReturnGeneral.getTipoRequisicion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoRequisicion(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoRequisicion() throws Exception {
		
		
	}
	
	public ArrayList<TipoRequisicion> getTipoRequisicionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoRequisicion> tiporequisicionsSeleccionados=new ArrayList<TipoRequisicion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoRequisicion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoRequisicion tiporequisicionAux:tiporequisicionLogic.getTipoRequisicions()) {
					if(tiporequisicionAux.getIsSelected()) {
						tiporequisicionsSeleccionados.add(tiporequisicionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRequisicion tiporequisicionAux:this.tiporequisicions) {
					if(tiporequisicionAux.getIsSelected()) {
						tiporequisicionsSeleccionados.add(tiporequisicionAux);				
					}
				}
			}
			
			if(tiporequisicionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tiporequisicionsSeleccionados.addAll(this.tiporequisicionLogic.getTipoRequisicions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tiporequisicionsSeleccionados.addAll(this.tiporequisicions);				
					}
				}
			}
		} else {
			tiporequisicionsSeleccionados.add(this.tiporequisicion);
		}
		
		return tiporequisicionsSeleccionados;
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
	
	public void generarReporteTipoRequisicionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoRequisicionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoRequisicionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoRequisicionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoRequisicionsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Requesicion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoRequisicionsSeleccionados() throws Exception {
		ArrayList<TipoRequisicion> tiporequisicionsSeleccionados=new ArrayList<TipoRequisicion>();		
		
		tiporequisicionsSeleccionados=this.getTipoRequisicionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoRequisicions("Todos",tiporequisicionsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoRequisicionsSeleccionados() throws Exception {
		ArrayList<TipoRequisicion> tiporequisicionsSeleccionados=new ArrayList<TipoRequisicion>();		
		
		tiporequisicionsSeleccionados=this.getTipoRequisicionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoRequisicions("Todos",tiporequisicionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoRequisicionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoRequisicion> tiporequisicionsSeleccionados=new ArrayList<TipoRequisicion>();
		
		tiporequisicionsSeleccionados=this.getTipoRequisicionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoRequisicions("Todos",tiporequisicionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoRequisicionsSeleccionados() throws Exception {
		ArrayList<TipoRequisicion> tiporequisicionsSeleccionados=new ArrayList<TipoRequisicion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoRequisicion();
		
		
		tiporequisicionsSeleccionados=this.getTipoRequisicionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoRequisicion();
		
		
		//this.generarReporteTipoRequisicions("Todos",tiporequisicionsSeleccionados ,tiporequisicionImplementable,tiporequisicionImplementableHome);
	}
	
	public void mostrarImportacionTipoRequisicions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoRequisicion();
		
		this.abrirFrameImportacionTipoRequisicion();		
		
			
		//this.generarReporteTipoRequisicions("Todos",tiporequisicionsSeleccionados ,tiporequisicionImplementable,tiporequisicionImplementableHome);
	}
	
	public void importarTipoRequisicions() throws Exception {		
	
	}
	
	public void exportarTipoRequisicionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoRequisicionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoRequisicionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoRequisicionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Requesicion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoRequisicionsSeleccionados() throws Exception {
		ArrayList<TipoRequisicion> tiporequisicionsSeleccionados=new ArrayList<TipoRequisicion>();		
		
		tiporequisicionsSeleccionados=this.getTipoRequisicionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporequisicion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoRequisicion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoRequisicion tiporequisicionAux:tiporequisicionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoRequisicion(tiporequisicionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tiporequisicionAux.setsDetalleGeneralEntityReporte(tiporequisicionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Requesicion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoRequisicion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoRequisicionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRequisicionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRequisicionConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRequisicionConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRequisicionConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRequisicionConstantesFunciones.LABEL_IDTIPOPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRequisicionConstantesFunciones.LABEL_IDDIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRequisicionConstantesFunciones.LABEL_HORA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoRequisicion(TipoRequisicion tiporequisicion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tiporequisicion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporequisicion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporequisicion.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporequisicion.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporequisicion.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporequisicion.gettipoperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporequisicion.getdia_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporequisicion.gethora().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoRequisicionsSeleccionados() throws Exception {
		ArrayList<TipoRequisicion> tiporequisicionsSeleccionados=new ArrayList<TipoRequisicion>();		
		
		tiporequisicionsSeleccionados=this.getTipoRequisicionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporequisicion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoRequisicions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoRequisicion(row);				
				iRow++;
			}				
			
			for(TipoRequisicion tiporequisicionAux:tiporequisicionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoRequisicion(tiporequisicionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Requesicion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoRequisicionsSeleccionados() throws Exception {
		ArrayList<TipoRequisicion> tiporequisicionsSeleccionados=new ArrayList<TipoRequisicion>();		
		
		tiporequisicionsSeleccionados=this.getTipoRequisicionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporequisicion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tiporequisicions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tiporequisicion");
			//elementRoot.appendChild(element);
		
			for(TipoRequisicion tiporequisicionAux:tiporequisicionsSeleccionados) {
				element = document.createElement("tiporequisicion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoRequisicion(tiporequisicionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Requesicion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoRequisicion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRequisicionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRequisicionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoRequisicionConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRequisicionConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRequisicionConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRequisicionConstantesFunciones.LABEL_IDTIPOPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRequisicionConstantesFunciones.LABEL_IDDIA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRequisicionConstantesFunciones.LABEL_HORA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoRequisicion(TipoRequisicion tiporequisicion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tiporequisicion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporequisicion.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporequisicion.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporequisicion.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporequisicion.gettipoperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporequisicion.getdia_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporequisicion.gethora());				
	}
	
	public void setFilaDatosExportarXmlTipoRequisicion(TipoRequisicion tiporequisicion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoRequisicionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tiporequisicion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoRequisicionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tiporequisicion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoRequisicionConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tiporequisicion.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoRequisicionConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tiporequisicion.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoRequisicionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tiporequisicion.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementtipoperiodo_descripcion = document.createElement(TipoRequisicionConstantesFunciones.IDTIPOPERIODO);
		elementtipoperiodo_descripcion.appendChild(document.createTextNode(tiporequisicion.gettipoperiodo_descripcion()));
		element.appendChild(elementtipoperiodo_descripcion);

		Element elementdia_descripcion = document.createElement(TipoRequisicionConstantesFunciones.IDDIA);
		elementdia_descripcion.appendChild(document.createTextNode(tiporequisicion.getdia_descripcion()));
		element.appendChild(elementdia_descripcion);

		Element elementhora = document.createElement(TipoRequisicionConstantesFunciones.HORA);
		elementhora.appendChild(document.createTextNode(tiporequisicion.gethora().toString().trim()));
		element.appendChild(elementhora);
	}
	
	public void generarReporteGroupGenericoTipoRequisicionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoRequisicion> tiporequisicionsSeleccionados=new ArrayList<TipoRequisicion>();
		
		tiporequisicionsSeleccionados=this.getTipoRequisicionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoRequisicion(tiporequisicionsSeleccionados);
		
		this.generarReporteTipoRequisicions("Todos",tiporequisicionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoRequisicion(ArrayList<TipoRequisicion> tiporequisicionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoRequisicion tiporequisicionAux:tiporequisicionsSeleccionados) {
				tiporequisicionAux.setsDetalleGeneralEntityReporte(tiporequisicionAux.toString());
			
				if(sTipoSeleccionar.equals(TipoRequisicionConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tiporequisicionAux.setsDescripcionGeneralEntityReporte1(tiporequisicionAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoRequisicionConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tiporequisicionAux.setsDescripcionGeneralEntityReporte1(tiporequisicionAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoRequisicionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tiporequisicionAux.setsDescripcionGeneralEntityReporte1(tiporequisicionAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoRequisicionConstantesFunciones.LABEL_IDTIPOPERIODO)) {
					existe=true;
					tiporequisicionAux.setsDescripcionGeneralEntityReporte1(tiporequisicionAux.gettipoperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoRequisicionConstantesFunciones.LABEL_IDDIA)) {
					existe=true;
					tiporequisicionAux.setsDescripcionGeneralEntityReporte1(tiporequisicionAux.getdia_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoRequisicionConstantesFunciones.LABEL_HORA)) {
					existe=true;
					tiporequisicionAux.setsDescripcionGeneralEntityReporte1(tiporequisicionAux.gethora().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRequisicionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoRequisicion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoRequisicion=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoRequisicion=true;
				this.isVisibilidadCeldaGuardarCambiosTipoRequisicion=true;
			}
			
			this.isVisibilidadCeldaModificarTipoRequisicion=false;
			this.isVisibilidadCeldaActualizarTipoRequisicion=false;
			this.isVisibilidadCeldaEliminarTipoRequisicion=false;
			this.isVisibilidadCeldaCancelarTipoRequisicion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRequisicion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRequisicion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoRequisicion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRequisicion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRequisicion=false;
			this.isVisibilidadCeldaModificarTipoRequisicion=false;
			this.isVisibilidadCeldaActualizarTipoRequisicion=true;
			this.isVisibilidadCeldaEliminarTipoRequisicion=false;
			this.isVisibilidadCeldaCancelarTipoRequisicion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRequisicion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRequisicion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoRequisicion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRequisicion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRequisicion=false;
			this.isVisibilidadCeldaModificarTipoRequisicion=false;
			this.isVisibilidadCeldaActualizarTipoRequisicion=true;
			this.isVisibilidadCeldaEliminarTipoRequisicion=true;
			this.isVisibilidadCeldaCancelarTipoRequisicion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRequisicion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRequisicion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoRequisicion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRequisicion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRequisicion=false;
			this.isVisibilidadCeldaModificarTipoRequisicion=false;
			this.isVisibilidadCeldaActualizarTipoRequisicion=true;
			this.isVisibilidadCeldaEliminarTipoRequisicion=false;
			this.isVisibilidadCeldaCancelarTipoRequisicion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRequisicion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRequisicion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoRequisicion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRequisicion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoRequisicion=true;
			this.isVisibilidadCeldaModificarTipoRequisicion=false;
			this.isVisibilidadCeldaActualizarTipoRequisicion=false;
			this.isVisibilidadCeldaEliminarTipoRequisicion=false;
			this.isVisibilidadCeldaCancelarTipoRequisicion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRequisicion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRequisicion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoRequisicion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRequisicion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRequisicion=false;
			this.isVisibilidadCeldaActualizarTipoRequisicion=false;
			this.isVisibilidadCeldaEliminarTipoRequisicion=false;
			this.isVisibilidadCeldaCancelarTipoRequisicion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRequisicion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRequisicion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoRequisicion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRequisicion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRequisicion=false;
			this.isVisibilidadCeldaModificarTipoRequisicion=true;
			this.isVisibilidadCeldaActualizarTipoRequisicion=false;
			this.isVisibilidadCeldaEliminarTipoRequisicion=false;
			this.isVisibilidadCeldaCancelarTipoRequisicion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRequisicion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRequisicion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoRequisicionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoRequisicion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRequisicion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoRequisicion=true;
		} else {
			this.actualizarEstadoPanelsTipoRequisicion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoRequisicion=false;
			//this.isVisibilidadCeldaVerFormTipoRequisicion=false;
			this.isVisibilidadCeldaDuplicarTipoRequisicion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tiporequisicionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoRequisicion=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoRequisicion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRequisicion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tiporequisicionSessionBean.getEsGuardarRelacionado()) {
			if(!tiporequisicionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoRequisicion=false;												
			}
			
			this.jButtonCerrarTipoRequisicion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoRequisicion=false;
		}
		
		if(!this.permiteMantenimiento(this.tiporequisicion)) {
			this.isVisibilidadCeldaActualizarTipoRequisicion=false;
			this.isVisibilidadCeldaEliminarTipoRequisicion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoRequisicion() {
	}
	
	public void actualizarEstadoPanelsTipoRequisicion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoRequisicion!=null) {
				this.jScrollPanelDatosEdicionTipoRequisicion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRequisicion!=null) {
				this.jTabbedPaneBusquedasTipoRequisicion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRequisicion!=null) {
				this.jScrollPanelDatosTipoRequisicion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRequisicion!=null) {
				this.jPanelPaginacionTipoRequisicion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRequisicion!=null) {
				this.jPanelParametrosReportesTipoRequisicion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoRequisicion!=null) {
				this.jScrollPanelDatosEdicionTipoRequisicion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRequisicion!=null) {
				this.jTabbedPaneBusquedasTipoRequisicion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoRequisicion!=null) {
				this.jScrollPanelDatosTipoRequisicion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRequisicion!=null) {
				this.jPanelPaginacionTipoRequisicion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRequisicion!=null) {
				this.jPanelParametrosReportesTipoRequisicion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoRequisicion!=null) {
				this.jScrollPanelDatosEdicionTipoRequisicion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRequisicion!=null) {
				this.jTabbedPaneBusquedasTipoRequisicion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoRequisicion!=null) {
				this.jScrollPanelDatosTipoRequisicion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRequisicion!=null) {
				this.jPanelPaginacionTipoRequisicion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRequisicion!=null) {
				this.jPanelParametrosReportesTipoRequisicion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoRequisicion!=null) {
				this.jScrollPanelDatosEdicionTipoRequisicion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRequisicion!=null) {
				this.jTabbedPaneBusquedasTipoRequisicion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoRequisicion!=null) {
				this.jScrollPanelDatosTipoRequisicion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRequisicion!=null) {
				this.jPanelPaginacionTipoRequisicion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRequisicion!=null) {
				this.jPanelParametrosReportesTipoRequisicion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoRequisicion!=null) {
				this.jScrollPanelDatosEdicionTipoRequisicion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRequisicion!=null) {
				this.jTabbedPaneBusquedasTipoRequisicion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRequisicion!=null) {
				this.jScrollPanelDatosTipoRequisicion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRequisicion!=null) {
				this.jPanelPaginacionTipoRequisicion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRequisicion!=null) {
				this.jPanelParametrosReportesTipoRequisicion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoRequisicion!=null) {
				this.jScrollPanelDatosEdicionTipoRequisicion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRequisicion!=null) {
				this.jTabbedPaneBusquedasTipoRequisicion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRequisicion!=null) {
				this.jScrollPanelDatosTipoRequisicion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRequisicion!=null) {
				this.jPanelPaginacionTipoRequisicion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRequisicion!=null) {
				this.jPanelParametrosReportesTipoRequisicion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoRequisicion!=null) {
				this.jScrollPanelDatosEdicionTipoRequisicion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRequisicion!=null) {
				this.jTabbedPaneBusquedasTipoRequisicion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRequisicion!=null) {
				this.jScrollPanelDatosTipoRequisicion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRequisicion!=null) {
				this.jPanelPaginacionTipoRequisicion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRequisicion!=null) {
				this.jPanelParametrosReportesTipoRequisicion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoRequisicion!=null) {
					this.jTabbedPaneBusquedasTipoRequisicion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoRequisicion!=null) {
				this.jPanelParametrosReportesTipoRequisicion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRequisicion!=null) {
				this.jTabbedPaneBusquedasTipoRequisicion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoRequisicion!=null) {
				this.jPanelParametrosReportesTipoRequisicion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTipoRequisicion.remove(jPanelBusquedaPorCodigoTipoRequisicion);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoRequisicion.remove(jPanelBusquedaPorNombreTipoRequisicion);}

			this.isVisibilidadFK_IdDia=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdDia) {this.jTabbedPaneBusquedasTipoRequisicion.remove(jPanelFK_IdDiaTipoRequisicion);}

			this.isVisibilidadFK_IdTipoPeriodo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoPeriodo) {this.jTabbedPaneBusquedasTipoRequisicion.remove(jPanelFK_IdTipoPeriodoTipoRequisicion);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoPeriodo(Boolean isParaTipoPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoPeriodoNegation=!isParaTipoPeriodo;

			this.isVisibilidadBusquedaPorCodigo=isParaTipoPeriodoNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTipoRequisicion.remove(jPanelBusquedaPorCodigoTipoRequisicion);}

			this.isVisibilidadBusquedaPorNombre=isParaTipoPeriodoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoRequisicion.remove(jPanelBusquedaPorNombreTipoRequisicion);}

			this.isVisibilidadFK_IdDia=isParaTipoPeriodoNegation;
			if(!this.isVisibilidadFK_IdDia) {this.jTabbedPaneBusquedasTipoRequisicion.remove(jPanelFK_IdDiaTipoRequisicion);}

			this.isVisibilidadFK_IdTipoPeriodo=isParaTipoPeriodo;
			if(!this.isVisibilidadFK_IdTipoPeriodo) {this.jTabbedPaneBusquedasTipoRequisicion.remove(jPanelFK_IdTipoPeriodoTipoRequisicion);}
		}
		
	}

	public void setVisibilidadBusquedasParaDia(Boolean isParaDia){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaDiaNegation=!isParaDia;

			this.isVisibilidadBusquedaPorCodigo=isParaDiaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTipoRequisicion.remove(jPanelBusquedaPorCodigoTipoRequisicion);}

			this.isVisibilidadBusquedaPorNombre=isParaDiaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoRequisicion.remove(jPanelBusquedaPorNombreTipoRequisicion);}

			this.isVisibilidadFK_IdDia=isParaDia;
			if(!this.isVisibilidadFK_IdDia) {this.jTabbedPaneBusquedasTipoRequisicion.remove(jPanelFK_IdDiaTipoRequisicion);}

			this.isVisibilidadFK_IdTipoPeriodo=isParaDiaNegation;
			if(!this.isVisibilidadFK_IdTipoPeriodo) {this.jTabbedPaneBusquedasTipoRequisicion.remove(jPanelFK_IdTipoPeriodoTipoRequisicion);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoRequisicionSessionBean tiporequisicionSessionBean=new TipoRequisicionSessionBean();
		
		if(this.tiporequisicionSessionBean==null) {
			this.tiporequisicionSessionBean=new TipoRequisicionSessionBean();
		}
		
		this.tiporequisicionSessionBean.setsUltimaBusquedaTipoRequisicion(this.getsAccionBusqueda());
		this.tiporequisicionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tiporequisicionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			tiporequisicionSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tiporequisicionSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdDia")) {
			tiporequisicionSessionBean.setid_dia(this.getid_diaFK_IdDia());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tiporequisicionSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoPeriodo")) {
			tiporequisicionSessionBean.setid_tipo_periodo(this.getid_tipo_periodoFK_IdTipoPeriodo());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoRequisicionSessionBean tiporequisicionSessionBean=new TipoRequisicionSessionBean();
		
		if(this.tiporequisicionSessionBean==null) {
			this.tiporequisicionSessionBean=new TipoRequisicionSessionBean();
		}
		
		if(this.tiporequisicionSessionBean.getsUltimaBusquedaTipoRequisicion()!=null&&!this.tiporequisicionSessionBean.getsUltimaBusquedaTipoRequisicion().equals("")) {
			this.setsAccionBusqueda(tiporequisicionSessionBean.getsUltimaBusquedaTipoRequisicion());
			this.setiNumeroPaginacion(tiporequisicionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tiporequisicionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(tiporequisicionSessionBean.getcodigo());
				tiporequisicionSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tiporequisicionSessionBean.getnombre());
				tiporequisicionSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdDia")) {
				this.setid_diaFK_IdDia(tiporequisicionSessionBean.getid_dia());
				tiporequisicionSessionBean.setid_dia(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tiporequisicionSessionBean.getid_empresa());
				tiporequisicionSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoPeriodo")) {
				this.setid_tipo_periodoFK_IdTipoPeriodo(tiporequisicionSessionBean.getid_tipo_periodo());
				tiporequisicionSessionBean.setid_tipo_periodo(-1L);
			}
		}
		
		this.tiporequisicionSessionBean.setsUltimaBusquedaTipoRequisicion("");
		this.tiporequisicionSessionBean.setiNumeroPaginacion(TipoRequisicionConstantesFunciones.INUMEROPAGINACION);
		this.tiporequisicionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoRequisicion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoRequisicion() {
		this.updateBorderResaltarBusquedasFormularioTipoRequisicion();
		this.updateVisibilidadBusquedasFormularioTipoRequisicion();
		this.updateHabilitarBusquedasFormularioTipoRequisicion();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoRequisicion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoRequisicion.getComponents().length>0) {
	

		if(this.tiporequisicionConstantesFunciones.resaltarBusquedaPorCodigoTipoRequisicion!=null) {
			index= this.jTabbedPaneBusquedasTipoRequisicion.indexOfComponent(this.jPanelBusquedaPorCodigoTipoRequisicion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRequisicion.getComponent(index);
				jPanel.setBorder(this.tiporequisicionConstantesFunciones.resaltarBusquedaPorCodigoTipoRequisicion);
			}
		}

		if(this.tiporequisicionConstantesFunciones.resaltarBusquedaPorNombreTipoRequisicion!=null) {
			index= this.jTabbedPaneBusquedasTipoRequisicion.indexOfComponent(this.jPanelBusquedaPorNombreTipoRequisicion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRequisicion.getComponent(index);
				jPanel.setBorder(this.tiporequisicionConstantesFunciones.resaltarBusquedaPorNombreTipoRequisicion);
			}
		}

		if(this.tiporequisicionConstantesFunciones.resaltarFK_IdDiaTipoRequisicion!=null) {
			index= this.jTabbedPaneBusquedasTipoRequisicion.indexOfComponent(this.jPanelFK_IdDiaTipoRequisicion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRequisicion.getComponent(index);
				jPanel.setBorder(this.tiporequisicionConstantesFunciones.resaltarFK_IdDiaTipoRequisicion);
			}
		}

		if(this.tiporequisicionConstantesFunciones.resaltarFK_IdTipoPeriodoTipoRequisicion!=null) {
			index= this.jTabbedPaneBusquedasTipoRequisicion.indexOfComponent(this.jPanelFK_IdTipoPeriodoTipoRequisicion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRequisicion.getComponent(index);
				jPanel.setBorder(this.tiporequisicionConstantesFunciones.resaltarFK_IdTipoPeriodoTipoRequisicion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoRequisicion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoRequisicion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoRequisicion.indexOfComponent(this.jPanelBusquedaPorCodigoTipoRequisicion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRequisicion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tiporequisicionConstantesFunciones.mostrarBusquedaPorCodigoTipoRequisicion);
			if(!this.tiporequisicionConstantesFunciones.mostrarBusquedaPorCodigoTipoRequisicion && index>-1) {
				this.jTabbedPaneBusquedasTipoRequisicion.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoRequisicion.indexOfComponent(this.jPanelBusquedaPorNombreTipoRequisicion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRequisicion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tiporequisicionConstantesFunciones.mostrarBusquedaPorNombreTipoRequisicion);
			if(!this.tiporequisicionConstantesFunciones.mostrarBusquedaPorNombreTipoRequisicion && index>-1) {
				this.jTabbedPaneBusquedasTipoRequisicion.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoRequisicion.indexOfComponent(this.jPanelFK_IdDiaTipoRequisicion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRequisicion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tiporequisicionConstantesFunciones.mostrarFK_IdDiaTipoRequisicion);
			if(!this.tiporequisicionConstantesFunciones.mostrarFK_IdDiaTipoRequisicion && index>-1) {
				this.jTabbedPaneBusquedasTipoRequisicion.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoRequisicion.indexOfComponent(this.jPanelFK_IdTipoPeriodoTipoRequisicion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRequisicion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tiporequisicionConstantesFunciones.mostrarFK_IdTipoPeriodoTipoRequisicion);
			if(!this.tiporequisicionConstantesFunciones.mostrarFK_IdTipoPeriodoTipoRequisicion && index>-1) {
				this.jTabbedPaneBusquedasTipoRequisicion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoRequisicion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoRequisicion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoRequisicion.indexOfComponent(this.jPanelBusquedaPorCodigoTipoRequisicion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRequisicion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tiporequisicionConstantesFunciones.activarBusquedaPorCodigoTipoRequisicion);
				this.jTabbedPaneBusquedasTipoRequisicion.setEnabledAt(index,this.tiporequisicionConstantesFunciones.activarBusquedaPorCodigoTipoRequisicion);
			}

			index= this.jTabbedPaneBusquedasTipoRequisicion.indexOfComponent(this.jPanelBusquedaPorNombreTipoRequisicion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRequisicion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tiporequisicionConstantesFunciones.activarBusquedaPorNombreTipoRequisicion);
				this.jTabbedPaneBusquedasTipoRequisicion.setEnabledAt(index,this.tiporequisicionConstantesFunciones.activarBusquedaPorNombreTipoRequisicion);
			}

			index= this.jTabbedPaneBusquedasTipoRequisicion.indexOfComponent(this.jPanelFK_IdDiaTipoRequisicion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRequisicion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tiporequisicionConstantesFunciones.activarFK_IdDiaTipoRequisicion);
				this.jTabbedPaneBusquedasTipoRequisicion.setEnabledAt(index,this.tiporequisicionConstantesFunciones.activarFK_IdDiaTipoRequisicion);
			}

			index= this.jTabbedPaneBusquedasTipoRequisicion.indexOfComponent(this.jPanelFK_IdTipoPeriodoTipoRequisicion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRequisicion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tiporequisicionConstantesFunciones.activarFK_IdTipoPeriodoTipoRequisicion);
				this.jTabbedPaneBusquedasTipoRequisicion.setEnabledAt(index,this.tiporequisicionConstantesFunciones.activarFK_IdTipoPeriodoTipoRequisicion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoRequisicion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTipoRequisicion.indexOfComponent(this.jPanelBusquedaPorCodigoTipoRequisicion);

			this.jTabbedPaneBusquedasTipoRequisicion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRequisicion.getComponent(index);

			this.tiporequisicionConstantesFunciones.setResaltarBusquedaPorCodigoTipoRequisicion(resaltar);

			jPanel.setBorder(this.tiporequisicionConstantesFunciones.resaltarBusquedaPorCodigoTipoRequisicion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoRequisicion.indexOfComponent(this.jPanelBusquedaPorNombreTipoRequisicion);

			this.jTabbedPaneBusquedasTipoRequisicion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRequisicion.getComponent(index);

			this.tiporequisicionConstantesFunciones.setResaltarBusquedaPorNombreTipoRequisicion(resaltar);

			jPanel.setBorder(this.tiporequisicionConstantesFunciones.resaltarBusquedaPorNombreTipoRequisicion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdDia")) {
			index= this.jTabbedPaneBusquedasTipoRequisicion.indexOfComponent(this.jPanelFK_IdDiaTipoRequisicion);

			this.jTabbedPaneBusquedasTipoRequisicion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRequisicion.getComponent(index);

			this.tiporequisicionConstantesFunciones.setResaltarFK_IdDiaTipoRequisicion(resaltar);

			jPanel.setBorder(this.tiporequisicionConstantesFunciones.resaltarFK_IdDiaTipoRequisicion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoPeriodo")) {
			index= this.jTabbedPaneBusquedasTipoRequisicion.indexOfComponent(this.jPanelFK_IdTipoPeriodoTipoRequisicion);

			this.jTabbedPaneBusquedasTipoRequisicion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRequisicion.getComponent(index);

			this.tiporequisicionConstantesFunciones.setResaltarFK_IdTipoPeriodoTipoRequisicion(resaltar);

			jPanel.setBorder(this.tiporequisicionConstantesFunciones.resaltarFK_IdTipoPeriodoTipoRequisicion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoRequisicion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoRequisicion() throws Exception {

		if(this.jInternalFrameDetalleFormTipoRequisicion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoRequisicion();
		this.updateVisibilidadResaltarControlesFormularioTipoRequisicion();
		this.updateHabilitarResaltarControlesFormularioTipoRequisicion();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoRequisicion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoRequisicion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tiporequisicionConstantesFunciones.resaltaridTipoRequisicion!=null && this.jInternalFrameDetalleFormTipoRequisicion!=null) {this.jInternalFrameDetalleFormTipoRequisicion.jLabelidTipoRequisicion.setBorder(this.tiporequisicionConstantesFunciones.resaltaridTipoRequisicion);}
		if(this.tiporequisicionConstantesFunciones.resaltarid_empresaTipoRequisicion!=null && this.jInternalFrameDetalleFormTipoRequisicion!=null) {this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_empresaTipoRequisicion.setBorder(this.tiporequisicionConstantesFunciones.resaltarid_empresaTipoRequisicion);}
		if(this.tiporequisicionConstantesFunciones.resaltarcodigoTipoRequisicion!=null && this.jInternalFrameDetalleFormTipoRequisicion!=null) {this.jInternalFrameDetalleFormTipoRequisicion.jTextFieldcodigoTipoRequisicion.setBorder(this.tiporequisicionConstantesFunciones.resaltarcodigoTipoRequisicion);}
		if(this.tiporequisicionConstantesFunciones.resaltarnombreTipoRequisicion!=null && this.jInternalFrameDetalleFormTipoRequisicion!=null) {this.jInternalFrameDetalleFormTipoRequisicion.jTextFieldnombreTipoRequisicion.setBorder(this.tiporequisicionConstantesFunciones.resaltarnombreTipoRequisicion);}
		if(this.tiporequisicionConstantesFunciones.resaltarid_tipo_periodoTipoRequisicion!=null && this.jInternalFrameDetalleFormTipoRequisicion!=null) {this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_tipo_periodoTipoRequisicion.setBorder(this.tiporequisicionConstantesFunciones.resaltarid_tipo_periodoTipoRequisicion);}
		if(this.tiporequisicionConstantesFunciones.resaltarid_diaTipoRequisicion!=null && this.jInternalFrameDetalleFormTipoRequisicion!=null) {this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_diaTipoRequisicion.setBorder(this.tiporequisicionConstantesFunciones.resaltarid_diaTipoRequisicion);}
		if(this.tiporequisicionConstantesFunciones.resaltarhoraTipoRequisicion!=null && this.jInternalFrameDetalleFormTipoRequisicion!=null) {this.jInternalFrameDetalleFormTipoRequisicion.jSpinnerhoraTipoRequisicion.setBorder(this.tiporequisicionConstantesFunciones.resaltarhoraTipoRequisicion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoRequisicion() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoRequisicion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoRequisicion!=null) {
	
		//this.jInternalFrameDetalleFormTipoRequisicion.jLabelidTipoRequisicion.setVisible(this.tiporequisicionConstantesFunciones.mostraridTipoRequisicion);
		this.jInternalFrameDetalleFormTipoRequisicion.jPanelidTipoRequisicion.setVisible(this.tiporequisicionConstantesFunciones.mostraridTipoRequisicion);
		//this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_empresaTipoRequisicion.setVisible(this.tiporequisicionConstantesFunciones.mostrarid_empresaTipoRequisicion);
		this.jInternalFrameDetalleFormTipoRequisicion.jPanelid_empresaTipoRequisicion.setVisible(this.tiporequisicionConstantesFunciones.mostrarid_empresaTipoRequisicion);
		//this.jInternalFrameDetalleFormTipoRequisicion.jTextFieldcodigoTipoRequisicion.setVisible(this.tiporequisicionConstantesFunciones.mostrarcodigoTipoRequisicion);
		this.jInternalFrameDetalleFormTipoRequisicion.jPanelcodigoTipoRequisicion.setVisible(this.tiporequisicionConstantesFunciones.mostrarcodigoTipoRequisicion);
		//this.jInternalFrameDetalleFormTipoRequisicion.jTextFieldnombreTipoRequisicion.setVisible(this.tiporequisicionConstantesFunciones.mostrarnombreTipoRequisicion);
		this.jInternalFrameDetalleFormTipoRequisicion.jPanelnombreTipoRequisicion.setVisible(this.tiporequisicionConstantesFunciones.mostrarnombreTipoRequisicion);
		//this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_tipo_periodoTipoRequisicion.setVisible(this.tiporequisicionConstantesFunciones.mostrarid_tipo_periodoTipoRequisicion);
		this.jInternalFrameDetalleFormTipoRequisicion.jPanelid_tipo_periodoTipoRequisicion.setVisible(this.tiporequisicionConstantesFunciones.mostrarid_tipo_periodoTipoRequisicion);
		//this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_diaTipoRequisicion.setVisible(this.tiporequisicionConstantesFunciones.mostrarid_diaTipoRequisicion);
		this.jInternalFrameDetalleFormTipoRequisicion.jPanelid_diaTipoRequisicion.setVisible(this.tiporequisicionConstantesFunciones.mostrarid_diaTipoRequisicion);
		//this.jInternalFrameDetalleFormTipoRequisicion.jSpinnerhoraTipoRequisicion.setVisible(this.tiporequisicionConstantesFunciones.mostrarhoraTipoRequisicion);
		this.jInternalFrameDetalleFormTipoRequisicion.jPanelhoraTipoRequisicion.setVisible(this.tiporequisicionConstantesFunciones.mostrarhoraTipoRequisicion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoRequisicion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoRequisicion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoRequisicion!=null) {
	
		this.jInternalFrameDetalleFormTipoRequisicion.jLabelidTipoRequisicion.setEnabled(this.tiporequisicionConstantesFunciones.activaridTipoRequisicion);
		this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_empresaTipoRequisicion.setEnabled(this.tiporequisicionConstantesFunciones.activarid_empresaTipoRequisicion);
		this.jInternalFrameDetalleFormTipoRequisicion.jTextFieldcodigoTipoRequisicion.setEnabled(this.tiporequisicionConstantesFunciones.activarcodigoTipoRequisicion);
		this.jInternalFrameDetalleFormTipoRequisicion.jTextFieldnombreTipoRequisicion.setEnabled(this.tiporequisicionConstantesFunciones.activarnombreTipoRequisicion);
		this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_tipo_periodoTipoRequisicion.setEnabled(this.tiporequisicionConstantesFunciones.activarid_tipo_periodoTipoRequisicion);
		this.jInternalFrameDetalleFormTipoRequisicion.jComboBoxid_diaTipoRequisicion.setEnabled(this.tiporequisicionConstantesFunciones.activarid_diaTipoRequisicion);
		this.jInternalFrameDetalleFormTipoRequisicion.jSpinnerhoraTipoRequisicion.setEnabled(this.tiporequisicionConstantesFunciones.activarhoraTipoRequisicion);
		}
	}
	
		
}