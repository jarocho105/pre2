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

import com.bydan.erp.tesoreria.util.TipoMovimiento_TSConstantesFunciones;
import com.bydan.erp.tesoreria.util.TipoMovimiento_TSParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.TipoMovimiento_TSParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.TipoMovimiento_TSBean;
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
public class TipoMovimiento_TSBeanSwingJInternalFrame extends TipoMovimiento_TSJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoMovimiento_TSBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoMovimiento_TS> tipomovimiento_tsValidator = new ClassValidator<TipoMovimiento_TS>(TipoMovimiento_TS.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoMovimiento_TS tipomovimiento_ts;	
	public TipoMovimiento_TS tipomovimiento_tsAux;
	public TipoMovimiento_TS tipomovimiento_tsAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoMovimiento_TS tipomovimiento_tsTotales;
	public Long idTipoMovimiento_TSActual;
	public Long iIdNuevoTipoMovimiento_TS=0L;
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
	
	public Boolean isPermisoTodoTipoMovimiento_TS;
	public Boolean isPermisoNuevoTipoMovimiento_TS;
	public Boolean isPermisoActualizarTipoMovimiento_TS;
	public Boolean isPermisoActualizarOriginalTipoMovimiento_TS;
	public Boolean isPermisoEliminarTipoMovimiento_TS;
	public Boolean isPermisoGuardarCambiosTipoMovimiento_TS;
	public Boolean isPermisoConsultaTipoMovimiento_TS;
	public Boolean isPermisoBusquedaTipoMovimiento_TS;
	public Boolean isPermisoReporteTipoMovimiento_TS;
	public Boolean isPermisoPaginacionMedioTipoMovimiento_TS;
	public Boolean isPermisoPaginacionAltoTipoMovimiento_TS;
	public Boolean isPermisoPaginacionTodoTipoMovimiento_TS;
	public Boolean isPermisoCopiarTipoMovimiento_TS;
	public Boolean isPermisoVerFormTipoMovimiento_TS;
	public Boolean isPermisoDuplicarTipoMovimiento_TS;
	public Boolean isPermisoOrdenTipoMovimiento_TS;
	
	
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
	
	public TipoMovimiento_TSParameterReturnGeneral tipomovimiento_tsReturnGeneral;
	public TipoMovimiento_TSParameterReturnGeneral tipomovimiento_tsParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoMovimiento_TS=false;
	public Boolean esParaAccionDesdeFormularioTipoMovimiento_TS=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoMovimiento_TSSessionBeanAdditional tipomovimiento_tsSessionBeanAdditional=null;
	
	public TipoMovimiento_TSSessionBeanAdditional getTipoMovimiento_TSSessionBeanAdditional() {
		return this.tipomovimiento_tsSessionBeanAdditional;
	}
	
	public void setTipoMovimiento_TSSessionBeanAdditional(TipoMovimiento_TSSessionBeanAdditional tipomovimiento_tsSessionBeanAdditional) {
		try {
			this.tipomovimiento_tsSessionBeanAdditional=tipomovimiento_tsSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoMovimiento_TSBeanSwingJInternalFrameAdditional tipomovimiento_tsBeanSwingJInternalFrameAdditional=null;
	//public class TipoMovimiento_TSBeanSwingJInternalFrame
	
	public TipoMovimiento_TSBeanSwingJInternalFrameAdditional getTipoMovimiento_TSBeanSwingJInternalFrameAdditional() {
		return this.tipomovimiento_tsBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoMovimiento_TSBeanSwingJInternalFrameAdditional(TipoMovimiento_TSBeanSwingJInternalFrameAdditional tipomovimiento_tsBeanSwingJInternalFrameAdditional) {
		try {
			this.tipomovimiento_tsBeanSwingJInternalFrameAdditional=tipomovimiento_tsBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoMovimiento_TSLogic tipomovimiento_tsLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoMovimiento_TS tipomovimiento_tsBean;
	public TipoMovimiento_TSConstantesFunciones tipomovimiento_tsConstantesFunciones;
	//public TipoMovimiento_TSParameterReturnGeneral tipomovimiento_tsReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoMovimiento_TS> tipomovimiento_tss;	
	//public List<TipoMovimiento_TS> tipomovimiento_tssEliminados;
	//public List<TipoMovimiento_TS> tipomovimiento_tssAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoMovimiento_TS=false;
	public Boolean isVisibilidadCeldaDuplicarTipoMovimiento_TS=true;
	public Boolean isVisibilidadCeldaCopiarTipoMovimiento_TS=true;
	public Boolean isVisibilidadCeldaVerFormTipoMovimiento_TS=true;
	public Boolean isVisibilidadCeldaOrdenTipoMovimiento_TS=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoMovimiento_TS=false;
	public Boolean isVisibilidadCeldaModificarTipoMovimiento_TS=false;
	public Boolean isVisibilidadCeldaActualizarTipoMovimiento_TS=false;
	public Boolean isVisibilidadCeldaEliminarTipoMovimiento_TS=false;
	public Boolean isVisibilidadCeldaCancelarTipoMovimiento_TS=false;
	public Boolean isVisibilidadCeldaGuardarTipoMovimiento_TS=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoMovimiento_TS=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoMovimiento_TS() {
		return this.iIdNuevoTipoMovimiento_TS;
	}

	public void setiIdNuevoTipoMovimiento_TS(Long iIdNuevoTipoMovimiento_TS) {
		this.iIdNuevoTipoMovimiento_TS = iIdNuevoTipoMovimiento_TS;
	}
	
	public Long getidTipoMovimiento_TSActual() {
		return this.idTipoMovimiento_TSActual;
	}

	public void setidTipoMovimiento_TSActual(Long idTipoMovimiento_TSActual) {
		this.idTipoMovimiento_TSActual = idTipoMovimiento_TSActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoMovimiento_TS gettipomovimiento_ts() {
		return this.tipomovimiento_ts;
	}

	public void settipomovimiento_ts(TipoMovimiento_TS tipomovimiento_ts) {
		this.tipomovimiento_ts = tipomovimiento_ts;
	}
	
	public TipoMovimiento_TS gettipomovimiento_tsAux() {
		return this.tipomovimiento_tsAux;
	}

	public void settipomovimiento_tsAux(TipoMovimiento_TS tipomovimiento_tsAux) {
		this.tipomovimiento_tsAux = tipomovimiento_tsAux;
	}				
	
	public TipoMovimiento_TS gettipomovimiento_tsAnterior() {
		return this.tipomovimiento_tsAnterior;
	}

	public void settipomovimiento_tsAnterior(TipoMovimiento_TS tipomovimiento_tsAnterior) {
		this.tipomovimiento_tsAnterior = tipomovimiento_tsAnterior;
	}	
	
	public TipoMovimiento_TS gettipomovimiento_tsTotales() {
		return this.tipomovimiento_tsTotales;
	}

	public void settipomovimiento_tsTotales(TipoMovimiento_TS tipomovimiento_tsTotales) {
		this.tipomovimiento_tsTotales = tipomovimiento_tsTotales;
	}	
	
	public TipoMovimiento_TS gettipomovimiento_tsBean() {
		return this.tipomovimiento_tsBean;
	}

	public void settipomovimiento_tsBean(TipoMovimiento_TS tipomovimiento_tsBean) {
		this.tipomovimiento_tsBean = tipomovimiento_tsBean;
	}	
	
	public TipoMovimiento_TSParameterReturnGeneral gettipomovimiento_tsReturnGeneral() {
		return this.tipomovimiento_tsReturnGeneral;
	}

	public void settipomovimiento_tsReturnGeneral(TipoMovimiento_TSParameterReturnGeneral tipomovimiento_tsReturnGeneral) {
		this.tipomovimiento_tsReturnGeneral = tipomovimiento_tsReturnGeneral;
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
	
	
	public TipoMovimiento_TSLogic getTipoMovimiento_TSLogic()	{		
		return tipomovimiento_tsLogic;
	}

	public void setTipoMovimiento_TSLogic(TipoMovimiento_TSLogic tipomovimiento_tsLogic) {
		this.tipomovimiento_tsLogic = tipomovimiento_tsLogic;
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
	
	public Boolean getIsEsNuevoTipoMovimiento_TS() {
		return isEsNuevoTipoMovimiento_TS;
	}

	public void setIsEsNuevoTipoMovimiento_TS(Boolean isEsNuevoTipoMovimiento_TS) {
		this.isEsNuevoTipoMovimiento_TS = isEsNuevoTipoMovimiento_TS;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoMovimiento_TS() {
		return esParaAccionDesdeFormularioTipoMovimiento_TS;
	}
	
	public void setEsParaAccionDesdeFormularioTipoMovimiento_TS(Boolean esParaAccionDesdeFormularioTipoMovimiento_TS) {
		this.esParaAccionDesdeFormularioTipoMovimiento_TS = esParaAccionDesdeFormularioTipoMovimiento_TS;
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

			if(this.tipomovimiento_tsSessionBean==null) {
				this.tipomovimiento_tsSessionBean=new TipoMovimiento_TSSessionBean();
			}

			if(!this.tipomovimiento_tsSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipomovimiento_tsSessionBean.getlidEmpresaActual());
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

					if(this.tipomovimiento_ts!=null) {
						this.tipomovimiento_ts.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) {
						this.jInternalFrameDetalleFormTipoMovimiento_TS.jComboBoxid_empresaTipoMovimiento_TS.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoMovimiento_TS.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) {
						if(this.jInternalFrameDetalleFormTipoMovimiento_TS.jComboBoxid_empresaTipoMovimiento_TS.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoMovimiento_TS.jComboBoxid_empresaTipoMovimiento_TS.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoMovimiento_TSGenerico)throws Exception
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
				jComboBoxid_empresaTipoMovimiento_TSGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoMovimiento_TSGenerico!=null && jComboBoxid_empresaTipoMovimiento_TSGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoMovimiento_TSGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoMovimiento_TS tipomovimiento_ts,JComboBox jComboBoxid_empresaTipoMovimiento_TSGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoMovimiento_TSGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoMovimiento_TS.jComboBoxid_empresaTipoMovimiento_TS.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoMovimiento_TSGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipomovimiento_ts.setid_empresa(empresaAux.getId());
				tipomovimiento_ts.setempresa_descripcion(TipoMovimiento_TSConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipomovimiento_ts.setEmpresa(empresaAux);			}
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

					if(!TipoMovimiento_TSJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) { 
							this.jInternalFrameDetalleFormTipoMovimiento_TS.jComboBoxid_empresaTipoMovimiento_TS.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoMovimiento_TS.jComboBoxid_empresaTipoMovimiento_TS.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) { 
					}

					if(!TipoMovimiento_TSJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) {
							this.jInternalFrameDetalleFormTipoMovimiento_TS.jComboBoxid_empresaTipoMovimiento_TS.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) {
							this.jInternalFrameDetalleFormTipoMovimiento_TS.jComboBoxid_empresaTipoMovimiento_TS.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoMovimiento_TS() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoMovimiento_TSConstantesFunciones.refrescarForeignKeysDescripcionesTipoMovimiento_TS(this.tipomovimiento_tsLogic.getTipoMovimiento_TSs());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoMovimiento_TSConstantesFunciones.refrescarForeignKeysDescripcionesTipoMovimiento_TS(this.tipomovimiento_tss);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipomovimiento_tsLogic.setTipoMovimiento_TSs(this.tipomovimiento_tss);
			tipomovimiento_tsLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoMovimiento_TSParameterReturnGeneral getTipoMovimiento_TSParameterGeneral() {
		return this.tipomovimiento_tsParameterGeneral;
	}
	
	public void setTipoMovimiento_TSParameterGeneral(TipoMovimiento_TSParameterReturnGeneral tipomovimiento_tsParameterGeneral) {
		this.tipomovimiento_tsParameterGeneral = tipomovimiento_tsParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoMovimiento_TS() {
		return isPermisoTodoTipoMovimiento_TS;
	}

	public void setIsPermisoTodoTipoMovimiento_TS(Boolean isPermisoTodoTipoMovimiento_TS) {
		this.isPermisoTodoTipoMovimiento_TS = isPermisoTodoTipoMovimiento_TS;
	}

	public Boolean getIsPermisoNuevoTipoMovimiento_TS() {
		return isPermisoNuevoTipoMovimiento_TS;
	}

	public void setIsPermisoNuevoTipoMovimiento_TS(Boolean isPermisoNuevoTipoMovimiento_TS) {
		this.isPermisoNuevoTipoMovimiento_TS = isPermisoNuevoTipoMovimiento_TS;
	}

	public Boolean getIsPermisoActualizarTipoMovimiento_TS() {
		return isPermisoActualizarTipoMovimiento_TS;
	}

	public void setIsPermisoActualizarTipoMovimiento_TS(Boolean isPermisoActualizarTipoMovimiento_TS) {
		this.isPermisoActualizarTipoMovimiento_TS = isPermisoActualizarTipoMovimiento_TS;
	}

	public Boolean getIsPermisoEliminarTipoMovimiento_TS() {
		return isPermisoEliminarTipoMovimiento_TS;
	}

	public void setIsPermisoEliminarTipoMovimiento_TS(Boolean isPermisoEliminarTipoMovimiento_TS) {
		this.isPermisoEliminarTipoMovimiento_TS = isPermisoEliminarTipoMovimiento_TS;
	}

	public Boolean getIsPermisoGuardarCambiosTipoMovimiento_TS() {
		return isPermisoGuardarCambiosTipoMovimiento_TS;
	}

	public void setIsPermisoGuardarCambiosTipoMovimiento_TS(Boolean isPermisoGuardarCambiosTipoMovimiento_TS) {
		this.isPermisoGuardarCambiosTipoMovimiento_TS = isPermisoGuardarCambiosTipoMovimiento_TS;
	}
	
	public Boolean getIsPermisoConsultaTipoMovimiento_TS() {
		return isPermisoConsultaTipoMovimiento_TS;
	}

	public void setIsPermisoConsultaTipoMovimiento_TS(Boolean isPermisoConsultaTipoMovimiento_TS) {
		this.isPermisoConsultaTipoMovimiento_TS = isPermisoConsultaTipoMovimiento_TS;
	}

	public Boolean getIsPermisoBusquedaTipoMovimiento_TS() {
		return isPermisoBusquedaTipoMovimiento_TS;
	}

	public void setIsPermisoBusquedaTipoMovimiento_TS(Boolean isPermisoBusquedaTipoMovimiento_TS) {
		this.isPermisoBusquedaTipoMovimiento_TS = isPermisoBusquedaTipoMovimiento_TS;
	}

	public Boolean getIsPermisoReporteTipoMovimiento_TS() {
		return isPermisoReporteTipoMovimiento_TS;
	}

	public void setIsPermisoReporteTipoMovimiento_TS(Boolean isPermisoReporteTipoMovimiento_TS) {
		this.isPermisoReporteTipoMovimiento_TS = isPermisoReporteTipoMovimiento_TS;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoMovimiento_TS() {
		return isPermisoPaginacionMedioTipoMovimiento_TS;
	}

	public void setIsPermisoPaginacionMedioTipoMovimiento_TS(Boolean isPermisoPaginacionMedioTipoMovimiento_TS) {
		this.isPermisoPaginacionMedioTipoMovimiento_TS = isPermisoPaginacionMedioTipoMovimiento_TS;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoMovimiento_TS() {
		return isPermisoPaginacionTodoTipoMovimiento_TS;
	}

	public void setIsPermisoPaginacionTodoTipoMovimiento_TS(Boolean isPermisoPaginacionTodoTipoMovimiento_TS) {
		this.isPermisoPaginacionTodoTipoMovimiento_TS = isPermisoPaginacionTodoTipoMovimiento_TS;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoMovimiento_TS() {
		return isPermisoPaginacionAltoTipoMovimiento_TS;
	}

	public void setIsPermisoPaginacionAltoTipoMovimiento_TS(Boolean isPermisoPaginacionAltoTipoMovimiento_TS) {
		this.isPermisoPaginacionAltoTipoMovimiento_TS = isPermisoPaginacionAltoTipoMovimiento_TS;
	}
	
	public Boolean getIsPermisoCopiarTipoMovimiento_TS() {
		return isPermisoCopiarTipoMovimiento_TS;
	}

	public void setIsPermisoCopiarTipoMovimiento_TS(Boolean isPermisoCopiarTipoMovimiento_TS) {
		this.isPermisoCopiarTipoMovimiento_TS = isPermisoCopiarTipoMovimiento_TS;
	}
	
	public Boolean getIsPermisoVerFormTipoMovimiento_TS() {
		return isPermisoVerFormTipoMovimiento_TS;
	}

	public void setIsPermisoVerFormTipoMovimiento_TS(Boolean isPermisoVerFormTipoMovimiento_TS) {
		this.isPermisoVerFormTipoMovimiento_TS = isPermisoVerFormTipoMovimiento_TS;
	}
	
	public Boolean getIsPermisoDuplicarTipoMovimiento_TS() {
		return isPermisoDuplicarTipoMovimiento_TS;
	}

	public void setIsPermisoDuplicarTipoMovimiento_TS(Boolean isPermisoDuplicarTipoMovimiento_TS) {
		this.isPermisoDuplicarTipoMovimiento_TS = isPermisoDuplicarTipoMovimiento_TS;
	}
	
	public Boolean getIsPermisoOrdenTipoMovimiento_TS() {
		return isPermisoOrdenTipoMovimiento_TS;
	}

	public void setIsPermisoOrdenTipoMovimiento_TS(Boolean isPermisoOrdenTipoMovimiento_TS) {
		this.isPermisoOrdenTipoMovimiento_TS = isPermisoOrdenTipoMovimiento_TS;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoMovimiento_TS() {
		return isVisibilidadCeldaNuevoTipoMovimiento_TS;
	}

	public void setIsVisibilidadCeldaNuevoTipoMovimiento_TS(Boolean isVisibilidadCeldaNuevoTipoMovimiento_TS) {
		this.isVisibilidadCeldaNuevoTipoMovimiento_TS = isVisibilidadCeldaNuevoTipoMovimiento_TS;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoMovimiento_TS() {
		return isVisibilidadCeldaDuplicarTipoMovimiento_TS;
	}

	public void setIsVisibilidadCeldaDuplicarTipoMovimiento_TS(Boolean isVisibilidadCeldaDuplicarTipoMovimiento_TS) {
		this.isVisibilidadCeldaDuplicarTipoMovimiento_TS = isVisibilidadCeldaDuplicarTipoMovimiento_TS;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoMovimiento_TS() {
		return isVisibilidadCeldaCopiarTipoMovimiento_TS;
	}

	public void setIsVisibilidadCeldaCopiarTipoMovimiento_TS(Boolean isVisibilidadCeldaCopiarTipoMovimiento_TS) {
		this.isVisibilidadCeldaCopiarTipoMovimiento_TS = isVisibilidadCeldaCopiarTipoMovimiento_TS;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoMovimiento_TS() {
		return isVisibilidadCeldaVerFormTipoMovimiento_TS;
	}

	public void setIsVisibilidadCeldaVerFormTipoMovimiento_TS(Boolean isVisibilidadCeldaVerFormTipoMovimiento_TS) {
		this.isVisibilidadCeldaVerFormTipoMovimiento_TS = isVisibilidadCeldaVerFormTipoMovimiento_TS;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoMovimiento_TS() {
		return isVisibilidadCeldaOrdenTipoMovimiento_TS;
	}

	public void setIsVisibilidadCeldaOrdenTipoMovimiento_TS(Boolean isVisibilidadCeldaOrdenTipoMovimiento_TS) {
		this.isVisibilidadCeldaOrdenTipoMovimiento_TS = isVisibilidadCeldaOrdenTipoMovimiento_TS;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoMovimiento_TS() {
		return isVisibilidadCeldaNuevoRelacionesTipoMovimiento_TS;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoMovimiento_TS(Boolean isVisibilidadCeldaNuevoRelacionesTipoMovimiento_TS) {
		this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento_TS = isVisibilidadCeldaNuevoRelacionesTipoMovimiento_TS;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoMovimiento_TS() {
		return isVisibilidadCeldaModificarTipoMovimiento_TS;
	}

	public void setIsVisibilidadCeldaModificarTipoMovimiento_TS(Boolean isVisibilidadCeldaModificarTipoMovimiento_TS) {
		this.isVisibilidadCeldaModificarTipoMovimiento_TS = isVisibilidadCeldaModificarTipoMovimiento_TS;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoMovimiento_TS() {
		return isVisibilidadCeldaActualizarTipoMovimiento_TS;
	}

	public void setIsVisibilidadCeldaActualizarTipoMovimiento_TS(Boolean isVisibilidadCeldaActualizarTipoMovimiento_TS) {
		this.isVisibilidadCeldaActualizarTipoMovimiento_TS = isVisibilidadCeldaActualizarTipoMovimiento_TS;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoMovimiento_TS() {
		return isVisibilidadCeldaEliminarTipoMovimiento_TS;
	}

	public void setIsVisibilidadCeldaEliminarTipoMovimiento_TS(Boolean isVisibilidadCeldaEliminarTipoMovimiento_TS) {
		this.isVisibilidadCeldaEliminarTipoMovimiento_TS = isVisibilidadCeldaEliminarTipoMovimiento_TS;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoMovimiento_TS() {
		return isVisibilidadCeldaCancelarTipoMovimiento_TS;
	}

	public void setIsVisibilidadCeldaCancelarTipoMovimiento_TS(Boolean isVisibilidadCeldaCancelarTipoMovimiento_TS) {
		this.isVisibilidadCeldaCancelarTipoMovimiento_TS = isVisibilidadCeldaCancelarTipoMovimiento_TS;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoMovimiento_TS() {
		return isVisibilidadCeldaGuardarTipoMovimiento_TS;
	}

	public void setIsVisibilidadCeldaGuardarTipoMovimiento_TS(Boolean isVisibilidadCeldaGuardarTipoMovimiento_TS) {
		this.isVisibilidadCeldaGuardarTipoMovimiento_TS = isVisibilidadCeldaGuardarTipoMovimiento_TS;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoMovimiento_TS() {
		return isVisibilidadCeldaGuardarCambiosTipoMovimiento_TS;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoMovimiento_TS(Boolean isVisibilidadCeldaGuardarCambiosTipoMovimiento_TS) {
		this.isVisibilidadCeldaGuardarCambiosTipoMovimiento_TS = isVisibilidadCeldaGuardarCambiosTipoMovimiento_TS;
	}
		
	public TipoMovimiento_TSSessionBean gettipomovimiento_tsSessionBean() {
		return this.tipomovimiento_tsSessionBean;
	}
	
	public void settipomovimiento_tsSessionBean(TipoMovimiento_TSSessionBean tipomovimiento_tsSessionBean) {
		this.tipomovimiento_tsSessionBean=tipomovimiento_tsSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento_TS(TipoMovimiento_TS tipomovimiento_ts)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipomovimiento_ts,null);
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
	
	public void bugActualizarReferenciaActual(TipoMovimiento_TS tipomovimiento_ts,TipoMovimiento_TS tipomovimiento_tsAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoMovimiento_TS(tipomovimiento_ts);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipomovimiento_tsAux.setId(tipomovimiento_ts.getId());
		tipomovimiento_tsAux.setVersionRow(tipomovimiento_ts.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoMovimiento_TS();
		
			int intSelectedRow = this.jTableDatosTipoMovimiento_TS.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento_ts =(TipoMovimiento_TS) this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipomovimiento_ts =(TipoMovimiento_TS) this.tipomovimiento_tss.toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoMovimiento_TSJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoMovimiento_TS(this.tipomovimiento_ts,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento_TS(this.tipomovimiento_ts);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipomovimiento_tsValidator.getInvalidValues(this.tipomovimiento_ts);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipomovimiento_tsLogic.setDatosCliente(datosCliente);
			tipomovimiento_tsLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipomovimiento_tsAux=new  TipoMovimiento_TS();
				
				tipomovimiento_tsAux.setIsNew(true);
				tipomovimiento_tsAux.setIsChanged(true);
				
				tipomovimiento_tsAux.setTipoMovimiento_TSOriginal(this.tipomovimiento_ts);
				
				tipomovimiento_tsAux.setId(this.tipomovimiento_ts.getId());	
				tipomovimiento_tsAux.setVersionRow(this.tipomovimiento_ts.getVersionRow());	
				tipomovimiento_tsAux.setcodigo(this.tipomovimiento_ts.getcodigo());	
				tipomovimiento_tsAux.setnombre(this.tipomovimiento_ts.getnombre());	
				tipomovimiento_tsAux.setid_empresa(this.tipomovimiento_ts.getid_empresa());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipomovimiento_tsSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipomovimiento_tsAux,tipomovimiento_tsLogic.getTipoMovimiento_TSs());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomovimiento_tsAux,tipomovimiento_tss);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipomovimiento_tsSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomovimiento_tsLogic.saveTipoMovimiento_TSs();//WithConnection
						//tipomovimiento_tsLogic.getSetVersionRowTipoMovimiento_TSs();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipomovimiento_ts,tipomovimiento_tsAux);
					
					this.refrescarForeignKeysDescripcionesTipoMovimiento_TS();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipomovimiento_tsSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipomovimiento_tsLogic.saveTipoMovimiento_TSRelaciones(tipomovimiento_tsAux);//WithConnection
								//tipomovimiento_tsLogic.getSetVersionRowTipoMovimiento_TSs();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipomovimiento_ts,tipomovimiento_tsAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipomovimiento_tsSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipomovimiento_tsAux,tipomovimiento_tsLogic.getTipoMovimiento_TSs());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipomovimiento_tsAux,tipomovimiento_tss);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipomovimiento_ts,tipomovimiento_tsAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipomovimiento_tsAux=new  TipoMovimiento_TS();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado() 
					|| (this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado() && this.tipomovimiento_ts.getId()>=0)) {
						
					tipomovimiento_tsAux.setIsNew(false);
				}
				
				tipomovimiento_tsAux.setIsDeleted(false);
			
				tipomovimiento_tsAux.setId(this.tipomovimiento_ts.getId());	
				tipomovimiento_tsAux.setVersionRow(this.tipomovimiento_ts.getVersionRow());	
				tipomovimiento_tsAux.setcodigo(this.tipomovimiento_ts.getcodigo());	
				tipomovimiento_tsAux.setnombre(this.tipomovimiento_ts.getnombre());	
				tipomovimiento_tsAux.setid_empresa(this.tipomovimiento_ts.getid_empresa());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipomovimiento_tsAux,tipomovimiento_tsLogic.getTipoMovimiento_TSs());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomovimiento_tsAux,tipomovimiento_tss);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipomovimiento_tsSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomovimiento_tsLogic.saveTipoMovimiento_TSs();//WithConnection
						//tipomovimiento_tsLogic.getSetVersionRowTipoMovimiento_TSs();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipomovimiento_ts,tipomovimiento_tsAux);
					
					this.refrescarForeignKeysDescripcionesTipoMovimiento_TS();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipomovimiento_tsSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipomovimiento_tsLogic.saveTipoMovimiento_TSRelaciones(tipomovimiento_tsAux);//WithConnection
								//tipomovimiento_tsLogic.getSetVersionRowTipoMovimiento_TSs();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipomovimiento_ts,tipomovimiento_tsAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipomovimiento_tsSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipomovimiento_tsAux,tipomovimiento_tsLogic.getTipoMovimiento_TSs());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipomovimiento_tsAux,tipomovimiento_tss);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipomovimiento_ts,tipomovimiento_tsAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipomovimiento_tsAux=new  TipoMovimiento_TS();
				
				tipomovimiento_tsAux.setIsNew(false);
				tipomovimiento_tsAux.setIsChanged(false);
				
				tipomovimiento_tsAux.setIsDeleted(true);
				
				tipomovimiento_tsAux.setId(this.tipomovimiento_ts.getId());	
				tipomovimiento_tsAux.setVersionRow(this.tipomovimiento_ts.getVersionRow());	
				tipomovimiento_tsAux.setcodigo(this.tipomovimiento_ts.getcodigo());	
				tipomovimiento_tsAux.setnombre(this.tipomovimiento_ts.getnombre());	
				tipomovimiento_tsAux.setid_empresa(this.tipomovimiento_ts.getid_empresa());	
				
				if(this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipomovimiento_tsAux.getId()>=0) {	
						this.tipomovimiento_tssEliminados.add(tipomovimiento_tsAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipomovimiento_tsAux,tipomovimiento_tsLogic.getTipoMovimiento_TSs());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomovimiento_tsAux,tipomovimiento_tss);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipomovimiento_tsSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomovimiento_tsLogic.saveTipoMovimiento_TSs();//WithConnection
						//tipomovimiento_tsLogic.getSetVersionRowTipoMovimiento_TSs();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipomovimiento_tsSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipomovimiento_tsLogic.saveTipoMovimiento_TSRelaciones(tipomovimiento_tsAux);//WithConnection
								//tipomovimiento_tsLogic.getSetVersionRowTipoMovimiento_TSs();//WithConnection
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
							if(this.tipomovimiento_tsSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipomovimiento_tsAux,tipomovimiento_tsLogic.getTipoMovimiento_TSs());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipomovimiento_tsAux,tipomovimiento_tss);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().addAll(this.tipomovimiento_tssEliminados);
					
					tipomovimiento_tsLogic.saveTipoMovimiento_TSs();//WithConnection
					//tipomovimiento_tsLogic.getSetVersionRowTipoMovimiento_TSs();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoMovimiento_TS();
				
				this.tipomovimiento_tssEliminados= new ArrayList<TipoMovimiento_TS>();		
			}
			
			if(this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Movimiento_ T S GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Movimiento_ T S",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipomovimiento_ts=tipomovimiento_tsAux;
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
      		//this.finishProcessTipoMovimiento_TS();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoMovimiento_TS tipomovimiento_tsLocal) throws Exception {
		
		if(this.tipomovimiento_tsSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoMovimiento_TS tipomovimiento_tsLocal) throws Exception {	
		if(this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipomovimiento_tsLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoMovimiento_TSActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoMovimiento_TS.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipomovimiento_ts =(TipoMovimiento_TS) this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipomovimiento_ts =(TipoMovimiento_TS) this.tipomovimiento_tss.toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipomovimiento_tsValidator.getInvalidValues(this.tipomovimiento_ts);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoMovimiento_TS tipomovimiento_ts,List<TipoMovimiento_TS> tipomovimiento_tss) throws Exception {
		try	{		
			TipoMovimiento_TSConstantesFunciones.actualizarLista(tipomovimiento_ts,tipomovimiento_tss,this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoMovimiento_TS tipomovimiento_ts,List<TipoMovimiento_TS> tipomovimiento_tss) throws Exception {
		try	{			
			TipoMovimiento_TSConstantesFunciones.actualizarSelectedLista(tipomovimiento_ts,tipomovimiento_tss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoMovimiento_TS> tipomovimiento_tssLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipomovimiento_tssLocal=this.tipomovimiento_tsLogic.getTipoMovimiento_TSs();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipomovimiento_tssLocal=this.tipomovimiento_tss;
			}
			//ARCHITECTURE
		
			for(TipoMovimiento_TS tipomovimiento_tsLocal:tipomovimiento_tssLocal) {
				if(this.permiteMantenimiento(tipomovimiento_tsLocal) && tipomovimiento_tsLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoMovimiento_TSConstantesFunciones.getTipoMovimiento_TSLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoMovimiento_TSConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMovimiento_TS.jLabelcodigoTipoMovimiento_TS,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoMovimiento_TSConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMovimiento_TS.jLabelnombreTipoMovimiento_TS,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoMovimiento_TSConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMovimiento_TS.jLabelid_empresaTipoMovimiento_TS,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMovimiento_TS.jLabelcodigoTipoMovimiento_TS,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMovimiento_TS.jLabelnombreTipoMovimiento_TS,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMovimiento_TS.jLabelid_empresaTipoMovimiento_TS,"");
		
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
		this.iIdNuevoTipoMovimiento_TS--;	
		
		
		this.tipomovimiento_tsAux=new TipoMovimiento_TS();
		
		this.tipomovimiento_tsAux.setId(this.iIdNuevoTipoMovimiento_TS);
		this.tipomovimiento_tsAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().add(this.tipomovimiento_tsAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipomovimiento_tss.add(this.tipomovimiento_tsAux);
		}
		//ARCHITECTURE
		
		this.tipomovimiento_ts=this.tipomovimiento_tsAux;
		
		if(TipoMovimiento_TSJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoMovimiento_TS(this.tipomovimiento_ts);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoMovimiento_TS(this.tipomovimiento_ts);
		}
				
		//this.setDefaultControlesTipoMovimiento_TS();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoMovimiento_TS();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoMovimiento_TS();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoMovimiento_TS();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoMovimiento_TS(this.tipomovimiento_tsBean,this.tipomovimiento_ts,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento_TS(this.tipomovimiento_ts);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipomovimiento_tsSessionBean.getConGuardarRelaciones()) {
			classes=TipoMovimiento_TSConstantesFunciones.getClassesRelationshipsOfTipoMovimiento_TS(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipomovimiento_tsReturnGeneral=tipomovimiento_tsLogic.procesarEventosTipoMovimiento_TSsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipomovimiento_tsLogic.getTipoMovimiento_TSs(),this.tipomovimiento_ts,this.tipomovimiento_tsParameterGeneral,this.isEsNuevoTipoMovimiento_TS,classes);//this.tipomovimiento_tsLogic.getTipoMovimiento_TS()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoMovimiento_TS(this.tipomovimiento_tsReturnGeneral,this.tipomovimiento_tsBean,false);
		
		if(this.tipomovimiento_tsReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoMovimiento_TS(this.tipomovimiento_tsReturnGeneral.getTipoMovimiento_TS());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoMovimiento_TS(this.tipomovimiento_tsReturnGeneral.getTipoMovimiento_TS());
		}
		
		if(this.tipomovimiento_tsReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoMovimiento_TS(this.tipomovimiento_tsReturnGeneral.getTipoMovimiento_TS(),classes);//this.tipomovimiento_tsBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoMovimiento_TS(this.tipomovimiento_ts,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoMovimiento_TS();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoMovimiento_TS();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoMovimiento_TSBeanSwingJInternalFrameAdditional.RecargarFormTipoMovimiento_TS(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoMovimiento_TS(false);
						
			if(tipomovimiento_tsSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoMovimiento_TSJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoMovimiento_TS();
			}
			
			this.actualizarVisualTableDatosTipoMovimiento_TS();
			
			this.jTableDatosTipoMovimiento_TS.setRowSelectionInterval(this.getIndiceNuevoTipoMovimiento_TS(), this.getIndiceNuevoTipoMovimiento_TS());
			
			this.seleccionarFilaTablaTipoMovimiento_TSActual();
						
			this.actualizarEstadoCeldasBotonesTipoMovimiento_TS("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoMovimiento_TS(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jTextFieldcodigoTipoMovimiento_TS.setEnabled(isHabilitar && this.tipomovimiento_tsConstantesFunciones.activarcodigoTipoMovimiento_TS);
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jTextAreanombreTipoMovimiento_TS.setEnabled(isHabilitar && this.tipomovimiento_tsConstantesFunciones.activarnombreTipoMovimiento_TS);	
		//
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jComboBoxid_empresaTipoMovimiento_TS.setEnabled(isHabilitar && this.tipomovimiento_tsConstantesFunciones.activarid_empresaTipoMovimiento_TS);
	};
	
	public void setDefaultControlesTipoMovimiento_TS() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoMovimiento_TS(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipomovimiento_tsSessionBean.setConGuardarRelaciones(true);			
			this.tipomovimiento_tsSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jTabbedPaneRelacionesTipoMovimiento_TS.setVisible(true);
			
					
		} else {
			//this.tipomovimiento_tsSessionBean.setConGuardarRelaciones(false);			
			this.tipomovimiento_tsSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jTabbedPaneRelacionesTipoMovimiento_TS.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoMovimiento_TS() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMovimiento_TS tipomovimiento_tsAux:this.tipomovimiento_tsLogic.getTipoMovimiento_TSs()) {
				if(tipomovimiento_tsAux.getId().equals(this.iIdNuevoTipoMovimiento_TS)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMovimiento_TS tipomovimiento_tsAux:this.tipomovimiento_tss) {
				if(tipomovimiento_tsAux.getId().equals(this.iIdNuevoTipoMovimiento_TS)) {
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
	
	public int getIndiceActualTipoMovimiento_TS(TipoMovimiento_TS tipomovimiento_ts,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMovimiento_TS tipomovimiento_tsAux:this.tipomovimiento_tsLogic.getTipoMovimiento_TSs()) {
				if(tipomovimiento_tsAux.getId().equals(tipomovimiento_ts.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMovimiento_TS tipomovimiento_tsAux:this.tipomovimiento_tss) {
				if(tipomovimiento_tsAux.getId().equals(tipomovimiento_ts.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoMovimiento_TS(TipoMovimiento_TS tipomovimiento_tsOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMovimiento_TS tipomovimiento_tsAux:this.tipomovimiento_tsLogic.getTipoMovimiento_TSs()) {
				if(tipomovimiento_tsAux.getTipoMovimiento_TSOriginal().getId().equals(tipomovimiento_tsOriginal.getId())) {
					existe=true;
					tipomovimiento_tsOriginal.setId(tipomovimiento_tsAux.getId());
					tipomovimiento_tsOriginal.setVersionRow(tipomovimiento_tsAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMovimiento_TS tipomovimiento_tsAux:this.tipomovimiento_tss) {
				if(tipomovimiento_tsAux.getTipoMovimiento_TSOriginal().getId().equals(tipomovimiento_tsOriginal.getId())) {
					existe=true;
					tipomovimiento_tsOriginal.setId(tipomovimiento_tsAux.getId());
					tipomovimiento_tsOriginal.setVersionRow(tipomovimiento_tsAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoMovimiento_TS(Boolean esParaCancelar) throws Exception {
		tipomovimiento_tssAux=new ArrayList<TipoMovimiento_TS>();
		tipomovimiento_tsAux=new TipoMovimiento_TS();
		
		if(!this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoMovimiento_TS tipomovimiento_tsAux:this.tipomovimiento_tsLogic.getTipoMovimiento_TSs()) {
					if(tipomovimiento_tsAux.getId()<0) {
						tipomovimiento_tssAux.add(tipomovimiento_tsAux);
					}		
				}
				this.iIdNuevoTipoMovimiento_TS=0L;
				this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().removeAll(tipomovimiento_tssAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMovimiento_TS tipomovimiento_tsAux:this.tipomovimiento_tss) {
					if(tipomovimiento_tsAux.getId()<0) {
						tipomovimiento_tssAux.add(tipomovimiento_tsAux);
					}		
				}
				this.iIdNuevoTipoMovimiento_TS=0L;
				this.tipomovimiento_tss.removeAll(tipomovimiento_tssAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoMovimiento_TS 
					&& this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().size()>0
					) {
					tipomovimiento_tsAux=this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().get(this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().size() - 1);
				
					if(tipomovimiento_tsAux.getId()<0) {
						this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().remove(tipomovimiento_tsAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoMovimiento_TS && this.tipomovimiento_tss.size()>0) {
					tipomovimiento_tsAux=this.tipomovimiento_tss.get(this.tipomovimiento_tss.size() - 1);
				
					if(tipomovimiento_tsAux.getId()<0) {
						this.tipomovimiento_tss.remove(tipomovimiento_tsAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoMovimiento_TS(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipomovimiento_ts.getId()<0) {
				this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().remove(this.tipomovimiento_ts);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipomovimiento_ts.getId()<0) {
				this.tipomovimiento_tss.remove(this.tipomovimiento_ts);
			}
		}			
	}
	
	public void setEstadosInicialesTipoMovimiento_TS(List<TipoMovimiento_TS> tipomovimiento_tssAux) throws Exception {
		TipoMovimiento_TSConstantesFunciones.setEstadosInicialesTipoMovimiento_TS(tipomovimiento_tssAux);
	}
	
	public void setEstadosInicialesTipoMovimiento_TS(TipoMovimiento_TS tipomovimiento_tsAux) throws Exception {
		TipoMovimiento_TSConstantesFunciones.setEstadosInicialesTipoMovimiento_TS(tipomovimiento_tsAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoMovimiento_TSActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoMovimiento_TS("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoMovimiento_TSActual()) {
				if(!this.isEsNuevoTipoMovimiento_TS) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoMovimiento_TS("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoMovimiento_TS=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoMovimiento_TSActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Movimiento_ T S ?", "MANTENIMIENTO DE Tipo Movimiento_ T S", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoMovimiento_TS("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoMovimiento_TS tipomovimiento_ts) throws Exception {
		TipoMovimiento_TSConstantesFunciones.seleccionarAsignar(this.tipomovimiento_ts,tipomovimiento_ts);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoMovimiento_TS=this.isPermisoActualizarOriginalTipoMovimiento_TS;
			
			
			this.seleccionarAsignar(tipomovimiento_ts);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoMovimiento_TSConstantesFunciones.quitarEspaciosTipoMovimiento_TS(this.tipomovimiento_ts,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoMovimiento_TS("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipomovimiento_tsSessionBean.setsFuncionBusquedaRapida(this.tipomovimiento_tsSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoMovimiento_TS) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoMovimiento_TS(esParaCancelar);				
				this.cancelarNuevoTipoMovimiento_TS(esParaCancelar);								
			}
			
			this.tipomovimiento_ts=new TipoMovimiento_TS();
			
			this.inicializarTipoMovimiento_TS();
			
			this.actualizarEstadoCeldasBotonesTipoMovimiento_TS("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoMovimiento_TS() throws Exception {
		try {
			TipoMovimiento_TSConstantesFunciones.inicializarTipoMovimiento_TS(this.tipomovimiento_ts);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoMovimiento_TSs(String sAccionBusqueda,List<TipoMovimiento_TS> tipomovimiento_tssParaReportes) throws Exception {
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
					sPathReporteFinal="TipoMovimiento_TS"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoMovimiento_TSMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoMovimiento_TSMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoMovimiento_TS"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Movimiento_ T Ses");		
		parameters.put("busquedapor", TipoMovimiento_TSConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoMovimiento_TS=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoMovimiento_TSConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoMovimiento_TSConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoMovimiento_TS=new JRBeanArrayDataSource(TipoMovimiento_TSJInternalFrame.TraerTipoMovimiento_TSBeans(tipomovimiento_tssParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoMovimiento_TS);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoMovimiento_TSConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoMovimiento_TSConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoMovimiento_TSBean.TraerTipoMovimiento_TSBeans(tipomovimiento_tssParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoMovimiento_TSs(sAccionBusqueda,sTipoArchivoReporte,tipomovimiento_tssParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoMovimiento_TSs(sAccionBusqueda,sTipoArchivoReporte,tipomovimiento_tssParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoMovimiento_TSActionPerformed(null);
					//this.generarExcelReporteTipoMovimiento_TSs(sAccionBusqueda,sTipoArchivoReporte,tipomovimiento_tssParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoMovimiento_TSs(sAccionBusqueda,sTipoArchivoReporte,tipomovimiento_tssParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoMovimiento_TSs(sAccionBusqueda,sTipoArchivoReporte,tipomovimiento_tssParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoMovimiento_TSs(sAccionBusqueda,sTipoArchivoReporte,tipomovimiento_tssParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoMovimiento_TSs(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoMovimiento_TS> tipomovimiento_tssParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomovimiento_ts";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoMovimiento_TSs");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoMovimiento_TS("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoMovimiento_TS tipomovimiento_ts : tipomovimiento_tssParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoMovimiento_TSConstantesFunciones.generarExcelReporteDataTipoMovimiento_TS("NORMAL",row,workbook,tipomovimiento_ts,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movimiento_ T S",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoMovimiento_TS(String sTipo,Row row,Workbook workbook) {
		
		TipoMovimiento_TSConstantesFunciones.generarExcelReporteHeaderTipoMovimiento_TS(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoMovimiento_TSs(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoMovimiento_TS> tipomovimiento_tssParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomovimiento_ts_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoMovimiento_TSs");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoMovimiento_TS tipomovimiento_ts : tipomovimiento_tssParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoMovimiento_TSConstantesFunciones.getTipoMovimiento_TSDescripcion(tipomovimiento_ts));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMovimiento_TSConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMovimiento_TSConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomovimiento_ts.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMovimiento_TSConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMovimiento_TSConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomovimiento_ts.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMovimiento_TSConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMovimiento_TSConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomovimiento_ts.getempresa_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movimiento_ T S",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoMovimiento_TSs(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoMovimiento_TS> tipomovimiento_tssParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoMovimiento_TS> tipomovimiento_tssRespaldo=null;
		
		classes=TipoMovimiento_TSConstantesFunciones.getClassesRelationshipsOfTipoMovimiento_TS(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipomovimiento_tsLogic.setDatosCliente(this.datosCliente);
		this.tipomovimiento_tsLogic.setDatosDeep(this.datosDeep);
		this.tipomovimiento_tsLogic.setIsConDeep(true);
		
		tipomovimiento_tssRespaldo=this.tipomovimiento_tsLogic.getTipoMovimiento_TSs();
		
		this.tipomovimiento_tsLogic.setTipoMovimiento_TSs(tipomovimiento_tssParaReportes);	
		this.tipomovimiento_tsLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipomovimiento_tssParaReportes=this.tipomovimiento_tsLogic.getTipoMovimiento_TSs();
		this.tipomovimiento_tsLogic.setTipoMovimiento_TSs(tipomovimiento_tssRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomovimiento_ts_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoMovimiento_TSs");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoMovimiento_TS("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoMovimiento_TS tipomovimiento_ts : tipomovimiento_tssParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoMovimiento_TS("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoMovimiento_TSConstantesFunciones.generarExcelReporteDataTipoMovimiento_TS("NORMAL",row,workbook,tipomovimiento_ts,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoMovimiento_TSConstantesFunciones.getTipoMovimiento_TSDescripcion(tipomovimiento_ts));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movimiento_ T S",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoMovimiento_TS() throws Exception {		
		this.startProcessTipoMovimiento_TS(true);
	}
	
	public void startProcessTipoMovimiento_TS(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoMovimiento_TS ,this.jPanelParametrosReportesTipoMovimiento_TS, this.jScrollPanelDatosTipoMovimiento_TS,this.jPanelPaginacionTipoMovimiento_TS, this.jScrollPanelDatosEdicionTipoMovimiento_TS, this.jPanelAccionesTipoMovimiento_TS,this.jPanelAccionesFormularioTipoMovimiento_TS,this.jmenuBarTipoMovimiento_TS,this.jmenuBarDetalleTipoMovimiento_TS,this.jTtoolBarTipoMovimiento_TS,this.jTtoolBarDetalleTipoMovimiento_TS);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoMovimiento_TS=this.jTabbedPaneBusquedasTipoMovimiento_TS; 
		
		final JPanel jPanelParametrosReportesTipoMovimiento_TS=this.jPanelParametrosReportesTipoMovimiento_TS;
		//final JScrollPane jScrollPanelDatosTipoMovimiento_TS=this.jScrollPanelDatosTipoMovimiento_TS;
		final JTable jTableDatosTipoMovimiento_TS=this.jTableDatosTipoMovimiento_TS;		
		final JPanel jPanelPaginacionTipoMovimiento_TS=this.jPanelPaginacionTipoMovimiento_TS;
		//final JScrollPane jScrollPanelDatosEdicionTipoMovimiento_TS=this.jScrollPanelDatosEdicionTipoMovimiento_TS;
		final JPanel jPanelAccionesTipoMovimiento_TS=this.jPanelAccionesTipoMovimiento_TS;
		
		JPanel jPanelCamposAuxiliarTipoMovimiento_TS=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoMovimiento_TS=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) {
			jPanelCamposAuxiliarTipoMovimiento_TS=this.jInternalFrameDetalleFormTipoMovimiento_TS.jPanelCamposTipoMovimiento_TS;
			jPanelAccionesFormularioAuxiliarTipoMovimiento_TS=this.jInternalFrameDetalleFormTipoMovimiento_TS.jPanelAccionesFormularioTipoMovimiento_TS;
		}
		
		final JPanel jPanelCamposTipoMovimiento_TS=jPanelCamposAuxiliarTipoMovimiento_TS;
		final JPanel jPanelAccionesFormularioTipoMovimiento_TS=jPanelAccionesFormularioAuxiliarTipoMovimiento_TS;
		
		
		final JMenuBar jmenuBarTipoMovimiento_TS=this.jmenuBarTipoMovimiento_TS;
		final JToolBar jTtoolBarTipoMovimiento_TS=this.jTtoolBarTipoMovimiento_TS;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoMovimiento_TS=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoMovimiento_TS=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) {
			jmenuBarDetalleAuxiliarTipoMovimiento_TS=this.jInternalFrameDetalleFormTipoMovimiento_TS.jmenuBarDetalleTipoMovimiento_TS;
			jTtoolBarDetalleAuxiliarTipoMovimiento_TS=this.jInternalFrameDetalleFormTipoMovimiento_TS.jTtoolBarDetalleTipoMovimiento_TS;
		}
		
		final JMenuBar jmenuBarDetalleTipoMovimiento_TS=jmenuBarDetalleAuxiliarTipoMovimiento_TS;
		final JToolBar jTtoolBarDetalleTipoMovimiento_TS=jTtoolBarDetalleAuxiliarTipoMovimiento_TS;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoMovimiento_TS;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoMovimiento_TS;
			processRunnable.jTableDatos=jTableDatosTipoMovimiento_TS;
			processRunnable.jPanelCampos=jPanelCamposTipoMovimiento_TS;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoMovimiento_TS;
			processRunnable.jPanelAcciones=jPanelAccionesTipoMovimiento_TS;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoMovimiento_TS;
			
			
			processRunnable.jmenuBar=jmenuBarTipoMovimiento_TS;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoMovimiento_TS;
			processRunnable.jTtoolBar=jTtoolBarTipoMovimiento_TS;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoMovimiento_TS;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoMovimiento_TS ,jPanelParametrosReportesTipoMovimiento_TS,jTableDatosTipoMovimiento_TS, /*jScrollPanelDatosTipoMovimiento_TS,*/jPanelCamposTipoMovimiento_TS,jPanelPaginacionTipoMovimiento_TS, /*jScrollPanelDatosEdicionTipoMovimiento_TS,*/ jPanelAccionesTipoMovimiento_TS,jPanelAccionesFormularioTipoMovimiento_TS,jmenuBarTipoMovimiento_TS,jmenuBarDetalleTipoMovimiento_TS,jTtoolBarTipoMovimiento_TS,jTtoolBarDetalleTipoMovimiento_TS);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoMovimiento_TS ,jPanelParametrosReportesTipoMovimiento_TS, jScrollPanelDatosTipoMovimiento_TS,jPanelPaginacionTipoMovimiento_TS, jScrollPanelDatosEdicionTipoMovimiento_TS, jPanelAccionesTipoMovimiento_TS,jPanelAccionesFormularioTipoMovimiento_TS,jmenuBarTipoMovimiento_TS,jmenuBarDetalleTipoMovimiento_TS,jTtoolBarTipoMovimiento_TS,jTtoolBarDetalleTipoMovimiento_TS);
						
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
	
	public void finishProcessTipoMovimiento_TS() {// throws Exception 
		this.finishProcessTipoMovimiento_TS(true);
	}
	
	public void finishProcessTipoMovimiento_TS(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoMovimiento_TS ,this.jPanelParametrosReportesTipoMovimiento_TS, this.jScrollPanelDatosTipoMovimiento_TS,this.jPanelPaginacionTipoMovimiento_TS, this.jScrollPanelDatosEdicionTipoMovimiento_TS, this.jPanelAccionesTipoMovimiento_TS,this.jPanelAccionesFormularioTipoMovimiento_TS,this.jmenuBarTipoMovimiento_TS,this.jmenuBarDetalleTipoMovimiento_TS,this.jTtoolBarTipoMovimiento_TS,this.jTtoolBarDetalleTipoMovimiento_TS);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoMovimiento_TS=this.jTabbedPaneBusquedasTipoMovimiento_TS; 
		
		final JPanel jPanelParametrosReportesTipoMovimiento_TS=this.jPanelParametrosReportesTipoMovimiento_TS;
		//final JScrollPane jScrollPanelDatosTipoMovimiento_TS=this.jScrollPanelDatosTipoMovimiento_TS;
		final JTable jTableDatosTipoMovimiento_TS=this.jTableDatosTipoMovimiento_TS;		
		final JPanel jPanelPaginacionTipoMovimiento_TS=this.jPanelPaginacionTipoMovimiento_TS;
		//final JScrollPane jScrollPanelDatosEdicionTipoMovimiento_TS=this.jScrollPanelDatosEdicionTipoMovimiento_TS;
		final JPanel jPanelAccionesTipoMovimiento_TS=this.jPanelAccionesTipoMovimiento_TS;
		
		JPanel jPanelCamposAuxiliarTipoMovimiento_TS=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoMovimiento_TS=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) {
			jPanelCamposAuxiliarTipoMovimiento_TS=this.jInternalFrameDetalleFormTipoMovimiento_TS.jPanelCamposTipoMovimiento_TS;
			jPanelAccionesFormularioAuxiliarTipoMovimiento_TS=this.jInternalFrameDetalleFormTipoMovimiento_TS.jPanelAccionesFormularioTipoMovimiento_TS;
		}
		
		final JPanel jPanelCamposTipoMovimiento_TS=jPanelCamposAuxiliarTipoMovimiento_TS;
		final JPanel jPanelAccionesFormularioTipoMovimiento_TS=jPanelAccionesFormularioAuxiliarTipoMovimiento_TS;
		
		
		final JMenuBar jmenuBarTipoMovimiento_TS=this.jmenuBarTipoMovimiento_TS;		
		final JToolBar jTtoolBarTipoMovimiento_TS=this.jTtoolBarTipoMovimiento_TS;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoMovimiento_TS=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoMovimiento_TS=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) {
			jmenuBarDetalleAuxiliarTipoMovimiento_TS=this.jInternalFrameDetalleFormTipoMovimiento_TS.jmenuBarDetalleTipoMovimiento_TS;
			jTtoolBarDetalleAuxiliarTipoMovimiento_TS=this.jInternalFrameDetalleFormTipoMovimiento_TS.jTtoolBarDetalleTipoMovimiento_TS;		
		}
		
		final JMenuBar jmenuBarDetalleTipoMovimiento_TS=jmenuBarDetalleAuxiliarTipoMovimiento_TS;
		final JToolBar jTtoolBarDetalleTipoMovimiento_TS=jTtoolBarDetalleAuxiliarTipoMovimiento_TS;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoMovimiento_TS;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoMovimiento_TS;
			processRunnable.jTableDatos=jTableDatosTipoMovimiento_TS;
			processRunnable.jPanelCampos=jPanelCamposTipoMovimiento_TS;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoMovimiento_TS;
			processRunnable.jPanelAcciones=jPanelAccionesTipoMovimiento_TS;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoMovimiento_TS;
			
			
			processRunnable.jmenuBar=jmenuBarTipoMovimiento_TS;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoMovimiento_TS;
			processRunnable.jTtoolBar=jTtoolBarTipoMovimiento_TS;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoMovimiento_TS;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoMovimiento_TS ,jPanelParametrosReportesTipoMovimiento_TS, jTableDatosTipoMovimiento_TS,/*jScrollPanelDatosTipoMovimiento_TS,*/jPanelCamposTipoMovimiento_TS,jPanelPaginacionTipoMovimiento_TS, /*jScrollPanelDatosEdicionTipoMovimiento_TS,*/ jPanelAccionesTipoMovimiento_TS,jPanelAccionesFormularioTipoMovimiento_TS,jmenuBarTipoMovimiento_TS,jmenuBarDetalleTipoMovimiento_TS,jTtoolBarTipoMovimiento_TS,jTtoolBarDetalleTipoMovimiento_TS));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoMovimiento_TS(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoMovimiento_TS(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoMovimiento_TS(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoMovimiento_TS(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoMovimiento_TS,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoMovimiento_TS,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoMovimiento_TS(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoMovimiento_TS,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoMovimiento_TS,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipomovimiento_tsConstantesFunciones.getsFinalQueryTipoMovimiento_TS();
		String  finalQueryPaginacionTodos=this.tipomovimiento_tsConstantesFunciones.getsFinalQueryTipoMovimiento_TS();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoMovimiento_TSConstantesFunciones.getArrayColumnasGlobalesNoTipoMovimiento_TS(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoMovimiento_TSConstantesFunciones.getArrayColumnasGlobalesTipoMovimiento_TS(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoMovimiento_TSConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipomovimiento_tssEliminados= new ArrayList<TipoMovimiento_TS>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoMovimiento_TS();
		
				///*TipoMovimiento_TSSessionBean*/this.tipomovimiento_tsSessionBean=new TipoMovimiento_TSSessionBean();
			
			if(this.tipomovimiento_tsSessionBean==null) {
				this.tipomovimiento_tsSessionBean=new TipoMovimiento_TSSessionBean();
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
					this.iNumeroPaginacion=TipoMovimiento_TSConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoMovimiento_TSConstantesFunciones.getClassesForeignKeysOfTipoMovimiento_TS(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipomovimiento_ts."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipomovimiento_tssAux= new ArrayList<TipoMovimiento_TS>();
			
				
			tipomovimiento_tsLogic.setDatosCliente(this.datosCliente);
			tipomovimiento_tsLogic.setDatosDeep(this.datosDeep);
			tipomovimiento_tsLogic.setIsConDeep(true);
			
			
			tipomovimiento_tsLogic.getTipoMovimiento_TSDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipomovimiento_tsLogic.getTodosTipoMovimiento_TSs(finalQueryGlobal,pagination);
					
					//tipomovimiento_tsLogic.getTodosTipoMovimiento_TSsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipomovimiento_tsLogic.getTipoMovimiento_TSs()==null|| tipomovimiento_tsLogic.getTipoMovimiento_TSs().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipomovimiento_tssAux= new ArrayList<TipoMovimiento_TS>();
							tipomovimiento_tssAux.addAll(tipomovimiento_tsLogic.getTipoMovimiento_TSs());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomovimiento_tssAux= new ArrayList<TipoMovimiento_TS>();
							tipomovimiento_tssAux.addAll(tipomovimiento_tss);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipomovimiento_tsLogic.getTodosTipoMovimiento_TSs(finalQueryGlobal+"",this.pagination);												
							
							//tipomovimiento_tsLogic.getTodosTipoMovimiento_TSsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoMovimiento_TSs("Todos",tipomovimiento_tsLogic.getTipoMovimiento_TSs() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipomovimiento_tsLogic.setTipoMovimiento_TSs(new ArrayList<TipoMovimiento_TS>());					
							tipomovimiento_tsLogic.getTipoMovimiento_TSs().addAll(tipomovimiento_tssAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomovimiento_tss=new ArrayList<TipoMovimiento_TS>();
							tipomovimiento_tss.addAll(tipomovimiento_tssAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoMovimiento_TS=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoMovimiento_TS=this.idActual;
				
				} else if(this.idTipoMovimiento_TSActual!=null && this.idTipoMovimiento_TSActual!=0L) {
					idTipoMovimiento_TS=idTipoMovimiento_TSActual;
				}
				
					
				this.sDetalleReporte=TipoMovimiento_TSConstantesFunciones.getDetalleIndicePorId(idTipoMovimiento_TS);
				
				this.tipomovimiento_tss=new ArrayList<TipoMovimiento_TS>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipomovimiento_tsLogic.getEntity(idTipoMovimiento_TS);
					
					//tipomovimiento_tsLogic.getEntityWithConnection(idTipoMovimiento_TS);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomovimiento_tsLogic.setTipoMovimiento_TSs(new ArrayList<TipoMovimiento_TS>());
					tipomovimiento_tsLogic.getTipoMovimiento_TSs().add(tipomovimiento_tsLogic.getTipoMovimiento_TS());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipomovimiento_tss=new ArrayList<TipoMovimiento_TS>();
					this.tipomovimiento_tss.add(tipomovimiento_ts);
				}
				
				if(tipomovimiento_tsLogic.getTipoMovimiento_TS()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoMovimiento_TSConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipomovimiento_tsLogic.getTipoMovimiento_TSsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoMovimiento_TSConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoMovimiento_TSConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipomovimiento_tsLogic.getTipoMovimiento_TSs()==null||tipomovimiento_tsLogic.getTipoMovimiento_TSs().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipomovimiento_tss==null|| tipomovimiento_tss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomovimiento_tssAux=new ArrayList<TipoMovimiento_TS>();
						tipomovimiento_tssAux.addAll(tipomovimiento_tsLogic.getTipoMovimiento_TSs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomovimiento_tssAux=new ArrayList<TipoMovimiento_TS>();
							tipomovimiento_tssAux.addAll(tipomovimiento_tss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipomovimiento_tsLogic.getTipoMovimiento_TSsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoMovimiento_TSConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoMovimiento_TSConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoMovimiento_TSs("FK_IdEmpresa",tipomovimiento_tsLogic.getTipoMovimiento_TSs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoMovimiento_TSs("FK_IdEmpresa",tipomovimiento_tss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomovimiento_tsLogic.setTipoMovimiento_TSs(new ArrayList<TipoMovimiento_TS>());
						tipomovimiento_tsLogic.getTipoMovimiento_TSs().addAll(tipomovimiento_tssAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomovimiento_tss=new ArrayList<TipoMovimiento_TS>();
							tipomovimiento_tss.addAll(tipomovimiento_tssAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoMovimiento_TS();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoMovimiento_TS();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipomovimiento_tsLogic.getTipoMovimiento_TSs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipomovimiento_tss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipomovimiento_tsLogic.getTipoMovimiento_TSs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipomovimiento_tss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoMovimiento_TS tipomovimiento_ts) {
		Boolean permite=true;
		
		if(this.tipomovimiento_ts.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoMovimiento_TSConstantesFunciones.getOrderByListaTipoMovimiento_TS();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoMovimiento_TSConstantesFunciones.getOrderByListaTipoMovimiento_TS();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMovimiento_TS tipomovimiento_ts:tipomovimiento_tsLogic.getTipoMovimiento_TSs()) {
				if(tipomovimiento_ts.getsType().equals(Constantes2.S_TOTALES)) {
					tipomovimiento_tsTotales=tipomovimiento_ts;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMovimiento_TS tipomovimiento_ts:this.tipomovimiento_tss) {
				if(tipomovimiento_ts.getsType().equals(Constantes2.S_TOTALES)) {
					tipomovimiento_tsTotales=tipomovimiento_ts;
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
			this.tipomovimiento_tsAux=new TipoMovimiento_TS();
			this.tipomovimiento_tsAux.setsType(Constantes2.S_TOTALES);
			this.tipomovimiento_tsAux.setIsNew(false);
			this.tipomovimiento_tsAux.setIsChanged(false);
			this.tipomovimiento_tsAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoMovimiento_TSConstantesFunciones.TotalizarValoresFilaTipoMovimiento_TS(this.tipomovimiento_tsLogic.getTipoMovimiento_TSs(),this.tipomovimiento_tsAux);
				
				this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().add(this.tipomovimiento_tsAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoMovimiento_TSConstantesFunciones.TotalizarValoresFilaTipoMovimiento_TS(this.tipomovimiento_tss,this.tipomovimiento_tsAux);
				
				this.tipomovimiento_tss.add(this.tipomovimiento_tsAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipomovimiento_tsTotales=new TipoMovimiento_TS();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().remove(tipomovimiento_tsTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipomovimiento_tss.remove(tipomovimiento_tsTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipomovimiento_tsTotales=new TipoMovimiento_TS();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMovimiento_TS tipomovimiento_ts:tipomovimiento_tsLogic.getTipoMovimiento_TSs()) {
				if(tipomovimiento_ts.getsType().equals(Constantes2.S_TOTALES)) {
					tipomovimiento_tsTotales=tipomovimiento_ts;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoMovimiento_TSConstantesFunciones.TotalizarValoresFilaTipoMovimiento_TS(this.tipomovimiento_tsLogic.getTipoMovimiento_TSs(),tipomovimiento_tsTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMovimiento_TS tipomovimiento_ts:this.tipomovimiento_tss) {
				if(tipomovimiento_ts.getsType().equals(Constantes2.S_TOTALES)) {
					tipomovimiento_tsTotales=tipomovimiento_ts;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoMovimiento_TSConstantesFunciones.TotalizarValoresFilaTipoMovimiento_TS(this.tipomovimiento_tss,tipomovimiento_tsTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoMovimiento_TSsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoMovimiento_TSsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomovimiento_tsLogic.getTipoMovimiento_TSsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoMovimiento_TS() {
		this.isPermisoTodoTipoMovimiento_TS=false;
		this.isPermisoNuevoTipoMovimiento_TS=false;
		this.isPermisoActualizarTipoMovimiento_TS=false;
		this.isPermisoActualizarOriginalTipoMovimiento_TS=false;
		this.isPermisoEliminarTipoMovimiento_TS=false;
		this.isPermisoGuardarCambiosTipoMovimiento_TS=false;
		this.isPermisoConsultaTipoMovimiento_TS=false;
		this.isPermisoBusquedaTipoMovimiento_TS=false;
		this.isPermisoReporteTipoMovimiento_TS=false;		
		this.isPermisoOrdenTipoMovimiento_TS=false;		
		this.isPermisoPaginacionMedioTipoMovimiento_TS=false;		
		this.isPermisoPaginacionAltoTipoMovimiento_TS=false;
		this.isPermisoPaginacionTodoTipoMovimiento_TS=false;
		this.isPermisoCopiarTipoMovimiento_TS=false;		
		this.isPermisoVerFormTipoMovimiento_TS=false;		
		this.isPermisoDuplicarTipoMovimiento_TS=false;		
		this.isPermisoOrdenTipoMovimiento_TS=false;		
	}
	
	public void setPermisosUsuarioTipoMovimiento_TS(Boolean isPermiso) {
		this.isPermisoTodoTipoMovimiento_TS=isPermiso;
		this.isPermisoNuevoTipoMovimiento_TS=isPermiso;
		this.isPermisoActualizarTipoMovimiento_TS=isPermiso;
		this.isPermisoActualizarOriginalTipoMovimiento_TS=isPermiso;
		this.isPermisoEliminarTipoMovimiento_TS=isPermiso;
		this.isPermisoGuardarCambiosTipoMovimiento_TS=isPermiso;
		this.isPermisoConsultaTipoMovimiento_TS=isPermiso;
		this.isPermisoBusquedaTipoMovimiento_TS=isPermiso;
		this.isPermisoReporteTipoMovimiento_TS=isPermiso;
		this.isPermisoOrdenTipoMovimiento_TS=isPermiso;		
		this.isPermisoPaginacionMedioTipoMovimiento_TS=isPermiso;		
		this.isPermisoPaginacionAltoTipoMovimiento_TS=isPermiso;		
		this.isPermisoPaginacionTodoTipoMovimiento_TS=isPermiso;		
		this.isPermisoCopiarTipoMovimiento_TS=isPermiso;		
		this.isPermisoVerFormTipoMovimiento_TS=isPermiso;		
		this.isPermisoDuplicarTipoMovimiento_TS=isPermiso;
		this.isPermisoOrdenTipoMovimiento_TS=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoMovimiento_TS(Boolean isPermiso) {
		//this.isPermisoTodoTipoMovimiento_TS=isPermiso;
		this.isPermisoNuevoTipoMovimiento_TS=isPermiso;
		this.isPermisoActualizarTipoMovimiento_TS=isPermiso;
		this.isPermisoActualizarOriginalTipoMovimiento_TS=isPermiso;
		this.isPermisoEliminarTipoMovimiento_TS=isPermiso;
		this.isPermisoGuardarCambiosTipoMovimiento_TS=isPermiso;
		//this.isPermisoConsultaTipoMovimiento_TS=isPermiso;
		//this.isPermisoBusquedaTipoMovimiento_TS=isPermiso;
		//this.isPermisoReporteTipoMovimiento_TS=isPermiso;
		//this.isPermisoOrdenTipoMovimiento_TS=isPermiso;		
		//this.isPermisoPaginacionMedioTipoMovimiento_TS=isPermiso;		
		//this.isPermisoPaginacionAltoTipoMovimiento_TS=isPermiso;		
		//this.isPermisoPaginacionTodoTipoMovimiento_TS=isPermiso;		
		//this.isPermisoCopiarTipoMovimiento_TS=isPermiso;		
		//this.isPermisoDuplicarTipoMovimiento_TS=isPermiso;
		//this.isPermisoOrdenTipoMovimiento_TS=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoMovimiento_TSClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoMovimiento_TSJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoMovimiento_TS(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoMovimiento_TSClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoMovimiento_TSClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoMovimiento_TSClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoMovimiento_TSClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoMovimiento_TS() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoMovimiento_TSJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoMovimiento_TSConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoMovimiento_TS=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoMovimiento_TS=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoMovimiento_TS=this.isPermisoActualizarTipoMovimiento_TS;
			this.isPermisoEliminarTipoMovimiento_TS=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoMovimiento_TS=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoMovimiento_TS=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoMovimiento_TS=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoMovimiento_TS=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoMovimiento_TS=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoMovimiento_TS=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoMovimiento_TS=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoMovimiento_TS=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoMovimiento_TS=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoMovimiento_TS=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoMovimiento_TS=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoMovimiento_TS=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoMovimiento_TS=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoMovimiento_TS.setToolTipText(this.jTableDatosTipoMovimiento_TS.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoMovimiento_TS(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoMovimiento_TS(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoMovimiento_TSJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoMovimiento_TSJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoMovimiento_TS() throws Exception {
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
	public void inicializarCombosForeignKeyTipoMovimiento_TSListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoMovimiento_TSListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoMovimiento_TSJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoMovimiento_TSListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoMovimiento_TSListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoMovimiento_TSParameterReturnGeneral tipomovimiento_tsReturnGeneral=new TipoMovimiento_TSParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipomovimiento_tsConstantesFunciones.cargarid_empresaTipoMovimiento_TS)
					 || (this.esRecargarFks && this.tipomovimiento_tsConstantesFunciones.cargarid_empresaTipoMovimiento_TS)) {

					if(!this.tipomovimiento_tsSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipomovimiento_tsSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipomovimiento_tsReturnGeneral=tipomovimiento_tsLogic.cargarCombosLoteForeignKeyTipoMovimiento_TS(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipomovimiento_tsReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoMovimiento_TS()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipomovimiento_tsSessionBean==null) {
				this.tipomovimiento_tsSessionBean=new TipoMovimiento_TSSessionBean();
			}

			if(!this.tipomovimiento_tsSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoMovimiento_TS()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoMovimiento_TS(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoMovimiento_TS()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoMovimiento_TS();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoMovimiento_TS(TipoMovimiento_TS tipomovimiento_ts)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoMovimiento_TS(TipoMovimiento_TS tipomovimiento_ts,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoMovimiento_TS()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoMovimiento_TS()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoMovimiento_TS()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoMovimiento_TS()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoMovimiento_TS()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoMovimiento_TS()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoMovimiento_TS(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoMovimiento_TS()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoMovimiento_TS.jComboBoxid_empresaTipoMovimiento_TS!=null && this.jInternalFrameDetalleFormTipoMovimiento_TS.jComboBoxid_empresaTipoMovimiento_TS.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoMovimiento_TS.jComboBoxid_empresaTipoMovimiento_TS.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoMovimiento_TSBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoMovimiento_TSBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoMovimiento_TSBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipomovimiento_tsSessionBean=new TipoMovimiento_TSSessionBean(); 
		this.tipomovimiento_tsConstantesFunciones=new TipoMovimiento_TSConstantesFunciones(); 
		this.tipomovimiento_tsBean=new TipoMovimiento_TS();//(this.tipomovimiento_tsConstantesFunciones); 		
		this.tipomovimiento_tsReturnGeneral=new TipoMovimiento_TSParameterReturnGeneral(); 
		
		this.tipomovimiento_tsSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipomovimiento_tsSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoMovimiento_TSBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoMovimiento_TSBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoMovimiento_TSBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoMovimiento_TS(true);
			
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
			
			this.tipomovimiento_tsConstantesFunciones=new TipoMovimiento_TSConstantesFunciones(); 
			this.tipomovimiento_tsBean=new TipoMovimiento_TS();//this.tipomovimiento_tsConstantesFunciones); 			
			this.tipomovimiento_tsReturnGeneral=new TipoMovimiento_TSParameterReturnGeneral(); 
		
			TipoMovimiento_TSBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Movimiento_ T S Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipomovimiento_ts=new TipoMovimiento_TS();
			this.tipomovimiento_tss = new ArrayList<TipoMovimiento_TS>();
			this.tipomovimiento_tssAux = new ArrayList<TipoMovimiento_TS>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic=new TipoMovimiento_TSLogic();
				this.tipomovimiento_tsLogic.getNewConnexionToDeep("");
			}
			
			//this.tipomovimiento_tsSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipomovimiento_tsSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoMovimiento_TS);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoMovimiento_TS!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoMovimiento_TS);	
					}
					
					if(this.jInternalFrameImportacionTipoMovimiento_TS!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoMovimiento_TS);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoMovimiento_TS!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoMovimiento_TS);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoMovimiento_TS);
				this.jInternalFrameDetalleFormTipoMovimiento_TS.setVisible(false);
				this.jInternalFrameDetalleFormTipoMovimiento_TS.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoMovimiento_TS!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoMovimiento_TS);
					this.jInternalFrameReporteDinamicoTipoMovimiento_TS.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoMovimiento_TS.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoMovimiento_TS!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoMovimiento_TS);
					this.jInternalFrameImportacionTipoMovimiento_TS.setVisible(false);
					this.jInternalFrameImportacionTipoMovimiento_TS.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoMovimiento_TS!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoMovimiento_TS);
					this.jInternalFrameOrderByTipoMovimiento_TS.setVisible(false);
					this.jInternalFrameOrderByTipoMovimiento_TS.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoMovimiento_TSActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoMovimiento_TSConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipomovimiento_tsReturnGeneral=new TipoMovimiento_TSParameterReturnGeneral();
			
			this.tipomovimiento_tsParameterGeneral=new TipoMovimiento_TSParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipomovimiento_tsLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoMovimiento_TSJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoMovimiento_TSConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado(),this.tipomovimiento_tsSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoMovimiento_TSConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado(),this.tipomovimiento_tsSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoMovimiento_TS=false;
			this.isVisibilidadCeldaDuplicarTipoMovimiento_TS=true;
			this.isVisibilidadCeldaCopiarTipoMovimiento_TS=true;
			this.isVisibilidadCeldaVerFormTipoMovimiento_TS=true;
			this.isVisibilidadCeldaOrdenTipoMovimiento_TS=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento_TS=false;
			this.isVisibilidadCeldaModificarTipoMovimiento_TS=false;
			this.isVisibilidadCeldaActualizarTipoMovimiento_TS=false;
			this.isVisibilidadCeldaEliminarTipoMovimiento_TS=false;
			this.isVisibilidadCeldaCancelarTipoMovimiento_TS=false;
			this.isVisibilidadCeldaGuardarTipoMovimiento_TS=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMovimiento_TS=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoMovimiento_TS("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoMovimiento_TS();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoMovimiento_TS(false);
			
			this.setPermisosUsuarioTipoMovimiento_TS();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado() 
				|| (this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado() && this.tipomovimiento_tsSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoMovimiento_TSClasesRelacionadas();
			}
			
			if(this.tipomovimiento_tsSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoMovimiento_TSClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoMovimiento_TSJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoMovimiento_TS();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoMovimiento_TS();
			}
			
			if(!this.isPermisoBusquedaTipoMovimiento_TS) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoMovimiento_TS.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoMovimiento_TS,this.isPermisoPaginacionMedioTipoMovimiento_TS,this.isPermisoPaginacionTodoTipoMovimiento_TS);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoMovimiento_TSConstantesFunciones.getTiposSeleccionarTipoMovimiento_TS());
				
				this.tiposColumnasSelect=TipoMovimiento_TSConstantesFunciones.getTiposSeleccionarTipoMovimiento_TS(true);
				
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
			//if(!this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoMovimiento_TS();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoMovimiento_TS(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoMovimiento_TS(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoMovimiento_TS() ;
			
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
				tipomovimiento_tsImplementable= (TipoMovimiento_TSImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoMovimiento_TSConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipomovimiento_tsImplementableHome= (TipoMovimiento_TSImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoMovimiento_TSConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipomovimiento_tss= new ArrayList<TipoMovimiento_TS>();
			this.tipomovimiento_tssEliminados= new ArrayList<TipoMovimiento_TS>();
						
			this.isEsNuevoTipoMovimiento_TS=false;
			this.esParaAccionDesdeFormularioTipoMovimiento_TS=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoMovimiento_TS(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoMovimiento_TS();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoMovimiento_TSBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoMovimiento_TSConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoMovimiento_TS("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoMovimiento_TS(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoMovimiento_TS();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoMovimiento_TS();
			}
			
			TipoMovimiento_TSBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoMovimiento_TS.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoMovimiento_TS.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoMovimiento_TS.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoMovimiento_TS(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoMovimiento_TS: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoMovimiento_TS() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoMovimiento_TS")) {
				iIndex=this.jInternalFrameDetalleFormTipoMovimiento_TS.jTabbedPaneRelacionesTipoMovimiento_TS.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoMovimiento_TS.jTabbedPaneRelacionesTipoMovimiento_TS.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoMovimiento_TS.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoMovimiento_TS();	
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
	
	public void cargarCombosForeignKeyTipoMovimiento_TS(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoMovimiento_TS(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoMovimiento_TS(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoMovimiento_TSListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoMovimiento_TS();
		
		this.cargarCombosFrameForeignKeyTipoMovimiento_TS();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoMovimiento_TS();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoMovimiento_TS();
		}
	}
	
	
	
	public void jButtonNuevoTipoMovimiento_TSActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipomovimiento_tsSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoMovimiento_TS==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
			
			
			if(jTableDatosTipoMovimiento_TS.getRowCount()>=1) {
				jTableDatosTipoMovimiento_TS.removeRowSelectionInterval(0, jTableDatosTipoMovimiento_TS.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoMovimiento_TS=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoMovimiento_TS(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoMovimiento_TS(true);			
			//this.tipomovimiento_ts=new TipoMovimiento_TS();
			//this.tipomovimiento_ts.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoMovimiento_TS(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMovimiento_TS() ;
			
			if(TipoMovimiento_TSJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoMovimiento_TS(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipomovimiento_ts);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento_ts);				
			
			TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
			
			if(this.tipomovimiento_tsSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoMovimiento_TS: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoMovimiento_TSActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoMovimiento_TS> tipomovimiento_tssSeleccionados=new ArrayList<TipoMovimiento_TS>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoMovimiento_TS.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoMovimiento_TS.getSelectedRows().length;			
			}
			
			tipomovimiento_tssSeleccionados=this.getTipoMovimiento_TSsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoMovimiento_TS--;			
				//TipoMovimiento_TS tipomovimiento_tsAux= new TipoMovimiento_TS();			
				//tipomovimiento_tsAux.setId(this.iIdNuevoTipoMovimiento_TS);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoMovimiento_TS tipomovimiento_tsOrigen=new TipoMovimiento_TS();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoMovimiento_TS tipomovimiento_tsOrigen : tipomovimiento_tssSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoMovimiento_TS.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipomovimiento_tsOrigen =(TipoMovimiento_TS) this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomovimiento_tsOrigen =(TipoMovimiento_TS) this.tipomovimiento_tss.toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoMovimiento_TS();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipomovimiento_ts.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoMovimiento_TS(tipomovimiento_tsOrigen,this.tipomovimiento_ts,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento_TS(this.tipomovimiento_ts);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().add(this.tipomovimiento_tsAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipomovimiento_tss.add(this.tipomovimiento_tsAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoMovimiento_TS(false);
				
				this.jTableDatosTipoMovimiento_TS.setRowSelectionInterval(this.getIndiceNuevoTipoMovimiento_TS(), this.getIndiceNuevoTipoMovimiento_TS());
				
				int iLastRow =  this.jTableDatosTipoMovimiento_TS.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoMovimiento_TS.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoMovimiento_TS.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoMovimiento_TS(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoMovimiento_TSActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoMovimiento_TS> tipomovimiento_tssSeleccionados=new ArrayList<TipoMovimiento_TS>();									
		
			TipoMovimiento_TS tipomovimiento_tsOrigen=new TipoMovimiento_TS();
			TipoMovimiento_TS tipomovimiento_tsDestino=new TipoMovimiento_TS();
				
			tipomovimiento_tssSeleccionados=this.getTipoMovimiento_TSsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoMovimiento_TS.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipomovimiento_tssSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoMovimiento_TS.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomovimiento_tsOrigen =(TipoMovimiento_TS) this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipomovimiento_tsOrigen =(TipoMovimiento_TS) this.tipomovimiento_tss.toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomovimiento_tsDestino =(TipoMovimiento_TS) this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipomovimiento_tsDestino =(TipoMovimiento_TS) this.tipomovimiento_tss.toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipomovimiento_tsOrigen =tipomovimiento_tssSeleccionados.get(0);
				tipomovimiento_tsDestino =tipomovimiento_tssSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoMovimiento_TS(tipomovimiento_tsOrigen,tipomovimiento_tsDestino,true,false);
				
				tipomovimiento_tsDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipomovimiento_tsDestino,tipomovimiento_tsLogic.getTipoMovimiento_TSs());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomovimiento_tsDestino,tipomovimiento_tss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoMovimiento_TS(false);
				
				//this.jTableDatosTipoMovimiento_TS.setRowSelectionInterval(this.getIndiceNuevoTipoMovimiento_TS(), this.getIndiceNuevoTipoMovimiento_TS());
				
				int iLastRow =  this.jTableDatosTipoMovimiento_TS.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoMovimiento_TS.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoMovimiento_TS.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoMovimiento_TS(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoMovimiento_TSActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoMovimiento_TS==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoMovimiento_TS.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoMovimiento_TSActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoMovimiento_TS.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoMovimiento_TS.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoMovimiento_TS.setVisible(!isVisible);
			this.jPanelPaginacionTipoMovimiento_TS.setVisible(!isVisible);
			this.jPanelAccionesTipoMovimiento_TS.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoMovimiento_TSActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoMovimiento_TS();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoMovimiento_TSActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoMovimiento_TS();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoMovimiento_TSActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoMovimiento_TS();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoMovimiento_TSActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoMovimiento_TS();
			
			this.abrirFrameOrderByTipoMovimiento_TS();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoMovimiento_TSActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoMovimiento_TS();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoMovimiento_TS(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoMovimiento_TS);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoMovimiento_TS.isMaximum()) {
					this.jInternalFrameDetalleFormTipoMovimiento_TS.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoMovimiento_TS.setSize(this.jInternalFrameDetalleFormTipoMovimiento_TS.iWidthFormulario,this.jInternalFrameDetalleFormTipoMovimiento_TS.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoMovimiento_TS.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoMovimiento_TS.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoMovimiento_TS.isMaximum()) {
						this.jInternalFrameDetalleFormTipoMovimiento_TS.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoMovimiento_TS.jContentPaneDetalleTipoMovimiento_TS.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoMovimiento_TS.jTabbedPaneRelacionesTipoMovimiento_TS.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoMovimiento_TS.jContentPaneDetalleTipoMovimiento_TS.getWidth(),TipoMovimiento_TSConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoMovimiento_TS.jTabbedPaneRelacionesTipoMovimiento_TS.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoMovimiento_TS.jContentPaneDetalleTipoMovimiento_TS.getWidth(),TipoMovimiento_TSConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoMovimiento_TS.jTabbedPaneRelacionesTipoMovimiento_TS.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoMovimiento_TS.jContentPaneDetalleTipoMovimiento_TS.getWidth(),TipoMovimiento_TSConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoMovimiento_TS.setVisible(true);
	        this.jInternalFrameDetalleFormTipoMovimiento_TS.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoMovimiento_TS() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoMovimiento_TS==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoMovimiento_TS=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMovimiento_TS,false,this);
				} else {
					this.jInternalFrameOrderByTipoMovimiento_TS=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMovimiento_TS,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoMovimiento_TS);
				this.jInternalFrameOrderByTipoMovimiento_TS.setVisible(false);
				this.jInternalFrameOrderByTipoMovimiento_TS.setSelected(false);
				
				this.jInternalFrameOrderByTipoMovimiento_TS.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoMovimiento_TS"));
				
				this.inicializarActualizarBindingTablaOrderByTipoMovimiento_TS();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoMovimiento_TS() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoMovimiento_TS==null) {
				
				this.jInternalFrameImportacionTipoMovimiento_TS=new ImportacionJInternalFrame(TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoMovimiento_TS);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoMovimiento_TS);
				this.jInternalFrameImportacionTipoMovimiento_TS.setVisible(false);
				this.jInternalFrameImportacionTipoMovimiento_TS.setSelected(false);


				this.jInternalFrameImportacionTipoMovimiento_TS.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoMovimiento_TS"));
				this.jInternalFrameImportacionTipoMovimiento_TS.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoMovimiento_TS"));
				this.jInternalFrameImportacionTipoMovimiento_TS.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoMovimiento_TS"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoMovimiento_TS() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoMovimiento_TS==null) {
				this.jInternalFrameReporteDinamicoTipoMovimiento_TS=new ReporteDinamicoJInternalFrame(TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoMovimiento_TS);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoMovimiento_TS);
				this.jInternalFrameReporteDinamicoTipoMovimiento_TS.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoMovimiento_TS.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoMovimiento_TS"));
				this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoMovimiento_TS"));
				this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoMovimiento_TS"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoMovimiento_TS();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoMovimiento_TS() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoMovimiento_TS);
			
	       	this.jInternalFrameDetalleFormTipoMovimiento_TS.setVisible(false);
	        this.jInternalFrameDetalleFormTipoMovimiento_TS.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoMovimiento_TS.dispose();
			//this.jInternalFrameDetalleFormTipoMovimiento_TS=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoMovimiento_TS() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoMovimiento_TS.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoMovimiento_TS.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoMovimiento_TS() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoMovimiento_TS.setVisible(true);
	        this.jInternalFrameImportacionTipoMovimiento_TS.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoMovimiento_TS() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoMovimiento_TS.setVisible(true);
	        this.jInternalFrameOrderByTipoMovimiento_TS.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoMovimiento_TS() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoMovimiento_TS.setVisible(false);
	        this.jInternalFrameOrderByTipoMovimiento_TS.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoMovimiento_TS() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoMovimiento_TS.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoMovimiento_TS.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoMovimiento_TS() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoMovimiento_TS.setVisible(false);
	        this.jInternalFrameImportacionTipoMovimiento_TS.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoMovimiento_TSActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoMovimiento_TS(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoMovimiento_TS(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoMovimiento_TS.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoMovimiento_TS(true);
			//this.isEsNuevoTipoMovimiento_TS=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_ts =(TipoMovimiento_TS) this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipomovimiento_ts =(TipoMovimiento_TS) this.tipomovimiento_tss.toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoMovimiento_TS("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoMovimiento_TS(false) ;
			
			if(tipomovimiento_tsSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoMovimiento_TSJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoMovimiento_TS(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMovimiento_TS(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoMovimiento_TSActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoMovimiento_TS.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento_ts =(TipoMovimiento_TS) this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovimiento_ts =(TipoMovimiento_TS) this.tipomovimiento_tss.toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoMovimiento_TS(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoMovimiento_TS==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoMovimiento_TS.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoMovimiento_TS(true);
			//this.isEsNuevoTipoMovimiento_TS=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_ts =(TipoMovimiento_TS) this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipomovimiento_ts =(TipoMovimiento_TS) this.tipomovimiento_tss.toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipomovimiento_ts.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoMovimiento_TS("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoMovimiento_TS(false) ;
			
			if(TipoMovimiento_TSJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoMovimiento_TS(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMovimiento_TS(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoMovimiento_TSActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoMovimiento_TS(false);
			
			//if(!this.isEsNuevoTipoMovimiento_TS) {								
				int intSelectedRow = this.jTableDatosTipoMovimiento_TS.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento_ts =(TipoMovimiento_TS) this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipomovimiento_ts =(TipoMovimiento_TS) this.tipomovimiento_tss.toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoMovimiento_TSJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoMovimiento_TS(this.tipomovimiento_ts,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento_TS(this.tipomovimiento_ts);
				
			}
			
			if(this.permiteMantenimiento(this.tipomovimiento_ts)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoMovimiento_TS=true;
					this.inicializarActualizarBindingTablaTipoMovimiento_TS(false);
					this.isEsNuevoTipoMovimiento_TS=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoMovimiento_TS=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoMovimiento_TS=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoMovimiento_TS(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoMovimiento_TS(false);
				
				this.habilitarDeshabilitarControlesTipoMovimiento_TS(false);
			
												
				
				if(TipoMovimiento_TSJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoMovimiento_TS();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoMovimiento_TSActionPerformed(evt,tipomovimiento_tsSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoMovimiento_TS(this.tipomovimiento_ts,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoMovimiento_TS.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipomovimiento_tsSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipomovimiento_ts.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoMovimiento_TS.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimiento_TS.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoMovimiento_TSActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoMovimiento_TS.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_ts =(TipoMovimiento_TS) this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
				this.tipomovimiento_ts.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipomovimiento_ts =(TipoMovimiento_TS) this.tipomovimiento_tss.toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
				this.tipomovimiento_ts.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipomovimiento_ts)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoMovimiento_TSModel) this.jTableDatosTipoMovimiento_TS.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoMovimiento_TS=true;
				this.inicializarActualizarBindingTablaTipoMovimiento_TS(false);
				this.isEsNuevoTipoMovimiento_TS=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoMovimiento_TS(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoMovimiento_TS(false);
				
				this.habilitarDeshabilitarControlesTipoMovimiento_TS(false);
				
				
				
				if(TipoMovimiento_TSJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoMovimiento_TS();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoMovimiento_TSActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoMovimiento_TS.getRowCount()>=1) {
				jTableDatosTipoMovimiento_TS.removeRowSelectionInterval(0, jTableDatosTipoMovimiento_TS.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoMovimiento_TS(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoMovimiento_TS(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoMovimiento_TS(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMovimiento_TS(false) ;
			
			this.isEsNuevoTipoMovimiento_TS=false;
			
			if(TipoMovimiento_TSJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoMovimiento_TS();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoMovimiento_TSActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoMovimiento_TS(false);
				
				//SI ES MANUAL
				if(TipoMovimiento_TSJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoMovimiento_TS();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoMovimiento_TSActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoMovimiento_TS--;			
			//TipoMovimiento_TS tipomovimiento_tsAux= new TipoMovimiento_TS();			
			//tipomovimiento_tsAux.setId(this.iIdNuevoTipoMovimiento_TS);
			
			if(this.jInternalFrameDetalleFormTipoMovimiento_TS==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoMovimiento_TS();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento_TS(this.tipomovimiento_ts);
			
			this.tipomovimiento_ts.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().add(this.tipomovimiento_tsAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipomovimiento_tss.add(this.tipomovimiento_tsAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoMovimiento_TS(false);
			
			this.jTableDatosTipoMovimiento_TS.setRowSelectionInterval(this.getIndiceNuevoTipoMovimiento_TS(), this.getIndiceNuevoTipoMovimiento_TS());
			
			int iLastRow =  this.jTableDatosTipoMovimiento_TS.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoMovimiento_TS.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoMovimiento_TS.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoMovimiento_TS(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoMovimiento_TSActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoMovimiento_TS(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMovimiento_TS(false);
			
			//SI ES MANUAL
			if(TipoMovimiento_TSJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoMovimiento_TS();
			}
			
			//this.abrirFrameTreeTipoMovimiento_TS();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoMovimiento_TSActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Movimiento_ T SES ?", "MANTENIMIENTO DE Tipo Movimiento_ T S", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoMovimiento_TS.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoMovimiento_TS();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipomovimiento_tsReturnGeneral=tipomovimiento_tsLogic.procesarImportacionTipoMovimiento_TSsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipomovimiento_tsParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoMovimiento_TSReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoMovimiento_TSActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoMovimiento_TS.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoMovimiento_TS.setFileImportacion(this.jInternalFrameImportacionTipoMovimiento_TS.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoMovimiento_TS.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoMovimiento_TS.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoMovimiento_TS.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoMovimiento_TS.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoMovimiento_TSActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoMovimiento_TS> tipomovimiento_tssSeleccionados=new ArrayList<TipoMovimiento_TS>();		

		tipomovimiento_tssSeleccionados=this.getTipoMovimiento_TSsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoMovimiento_TSBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoMovimiento_TSBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoMovimiento_TSs("Todos",tipomovimiento_tssSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movimiento_ T S",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoMovimiento_TSConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoMovimiento_TSConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoMovimiento_TSConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoMovimiento_TSConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoMovimiento_TSConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoMovimiento_TSConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoMovimiento_TSConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoMovimiento_TSConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoMovimiento_TSConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoMovimiento_TSConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoMovimiento_TSConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoMovimiento_TSConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoMovimiento_TSActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoMovimiento_TS> tipomovimiento_tssSeleccionados=new ArrayList<TipoMovimiento_TS>();		
		
		tipomovimiento_tssSeleccionados=this.getTipoMovimiento_TSsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomovimiento_ts";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoMovimiento_TSs");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoMovimiento_TSConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMovimiento_TSConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoMovimiento_TS tipomovimiento_ts:tipomovimiento_tssSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomovimiento_ts.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoMovimiento_TSConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMovimiento_TSConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoMovimiento_TS tipomovimiento_ts:tipomovimiento_tssSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomovimiento_ts.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoMovimiento_TSConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMovimiento_TSConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoMovimiento_TS tipomovimiento_ts:tipomovimiento_tssSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomovimiento_ts.getempresa_descripcion());
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
			//	this.getFilaCabeceraExportarExcelTipoMovimiento_TS(row);				
			//	iRow++;
			//}				
			
			//for(TipoMovimiento_TS tipomovimiento_tsAux:tipomovimiento_tssSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoMovimiento_TS(tipomovimiento_tsAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movimiento_ T S",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipomovimiento_tsLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMovimiento_TS(false);
			
			//SI ES MANUAL
			if(TipoMovimiento_TSJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoMovimiento_TS();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoMovimiento_TSActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMovimiento_TS(false);
			
			//SI ES MANUAL
			if(TipoMovimiento_TSJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoMovimiento_TS();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoMovimiento_TSActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMovimiento_TS(false);
			
			//SI ES MANUAL
			if(TipoMovimiento_TSJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoMovimiento_TS();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoMovimiento_TS() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoMovimiento_TS.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoMovimiento_TS.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoMovimiento_TS.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoMovimiento_TS.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoMovimiento_TS.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoMovimiento_TS.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoMovimiento_TS.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoMovimiento_TS(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoMovimiento_TS(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoMovimiento_TS(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoMovimiento_TS(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoMovimiento_TS(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoMovimiento_TS(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoMovimiento_TS(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoMovimiento_TS(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoMovimiento_TSJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoMovimiento_TSJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoMovimiento_TS() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoMovimiento_TS();
		
		this.inicializarActualizarBindingBotonesManualTipoMovimiento_TS(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoMovimiento_TS();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoMovimiento_TS() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoMovimiento_TS(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoMovimiento_TS(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoMovimiento_TS.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoMovimiento_TS.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoMovimiento_TS.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoMovimiento_TS.jCheckBoxPostAccionNuevoTipoMovimiento_TS.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoMovimiento_TS.jCheckBoxPostAccionSinCerrarTipoMovimiento_TS.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoMovimiento_TS.jCheckBoxPostAccionSinMensajeTipoMovimiento_TS.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoMovimiento_TS.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoMovimiento_TS.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoMovimiento_TS.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) {
				this.jInternalFrameDetalleFormTipoMovimiento_TS.jCheckBoxPostAccionNuevoTipoMovimiento_TS.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoMovimiento_TS.jCheckBoxPostAccionSinCerrarTipoMovimiento_TS.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoMovimiento_TS.jCheckBoxPostAccionSinMensajeTipoMovimiento_TS.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoMovimiento_TS.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoMovimiento_TS.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoMovimiento_TS.jComboBoxTiposAccionesFormularioTipoMovimiento_TS.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoMovimiento_TS.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoMovimiento_TS!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoMovimiento_TS.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoMovimiento_TS.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoMovimiento_TS.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoMovimiento_TS.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoMovimiento_TS!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoMovimiento_TS.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoMovimiento_TS.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoMovimiento_TS(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoMovimiento_TSJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoMovimiento_TS(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoMovimiento_TS() throws Exception {
		try	{
			if(TipoMovimiento_TSJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoMovimiento_TS();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoMovimiento_TS() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jComboBoxTiposAccionesFormularioTipoMovimiento_TS.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jComboBoxTiposAccionesFormularioTipoMovimiento_TS.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoMovimiento_TS() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoMovimiento_TS.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoMovimiento_TS.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoMovimiento_TS.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoMovimiento_TS.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoMovimiento_TS.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoMovimiento_TS.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoMovimiento_TS.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoMovimiento_TS.addItem(reporte);
			}
			
			
			if(!this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoMovimiento_TS.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoMovimiento_TS.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoMovimiento_TS.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoMovimiento_TS.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoMovimiento_TS.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoMovimiento_TS.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoMovimiento_TS.jComboBoxTiposAccionesFormularioTipoMovimiento_TS.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoMovimiento_TS.jComboBoxTiposAccionesFormularioTipoMovimiento_TS.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoMovimiento_TS.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoMovimiento_TS.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoMovimiento_TS.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoMovimiento_TS();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoMovimiento_TS() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoMovimiento_TS!=null) {
				this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoMovimiento_TS!=null) {
				this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoMovimiento_TS!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoMovimiento_TS()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoMovimiento_TS(Boolean esInicializar) throws Exception {				
		if(TipoMovimiento_TSJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoMovimiento_TS();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoMovimiento_TS() throws Exception {
		this.inicializarActualizarBindingTablaTipoMovimiento_TS(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoMovimiento_TS() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoMovimiento_TS.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoMovimiento_TS.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoMovimiento_TS.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoMovimiento_TSPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoMovimiento_TS.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoMovimiento_TS.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoMovimiento_TSPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoMovimiento_TSOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMovimiento_TSOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoMovimiento_TSPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoMovimiento_TS.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoMovimiento_TS.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoMovimiento_TSPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoMovimiento_TS.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoMovimiento_TS(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipomovimiento_tsLogic.getTipoMovimiento_TSs().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipomovimiento_tss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoMovimiento_TSJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoMovimiento_TS.setModel(new TipoMovimiento_TSModel(this.tipomovimiento_tsLogic.getTipoMovimiento_TSs(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoMovimiento_TS.setModel(new TipoMovimiento_TSModel(this.tipomovimiento_tss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoMovimiento_TS!=null && this.jInternalFrameOrderByTipoMovimiento_TS.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoMovimiento_TS();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoMovimiento_TS.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMovimiento_TS,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoMovimiento_TSPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO,tipomovimiento_tsConstantesFunciones.resaltarSeleccionarTipoMovimiento_TS,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO,tipomovimiento_tsConstantesFunciones.resaltarSeleccionarTipoMovimiento_TS,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoMovimiento_TS.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMovimiento_TS,TipoMovimiento_TSConstantesFunciones.LABEL_ID));

		if(this.tipomovimiento_tsConstantesFunciones.mostraridTipoMovimiento_TS && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMovimiento_TSConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipomovimiento_tsConstantesFunciones.resaltaridTipoMovimiento_TS,this.tipomovimiento_tsConstantesFunciones.activaridTipoMovimiento_TS,this,true,"idTipoMovimiento_TS","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomovimiento_tsConstantesFunciones.resaltaridTipoMovimiento_TS,this.tipomovimiento_tsConstantesFunciones.activaridTipoMovimiento_TS,this,true,"idTipoMovimiento_TS","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMovimiento_TS.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMovimiento_TS,TipoMovimiento_TSConstantesFunciones.LABEL_CODIGO));

		if(this.tipomovimiento_tsConstantesFunciones.mostrarcodigoTipoMovimiento_TS && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMovimiento_TSConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipomovimiento_tsConstantesFunciones.resaltarcodigoTipoMovimiento_TS,this.tipomovimiento_tsConstantesFunciones.activarcodigoTipoMovimiento_TS,this,true,"codigoTipoMovimiento_TS","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomovimiento_tsConstantesFunciones.resaltarcodigoTipoMovimiento_TS,this.tipomovimiento_tsConstantesFunciones.activarcodigoTipoMovimiento_TS,this,true,"codigoTipoMovimiento_TS","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoMovimiento_TSPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMovimiento_TS.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMovimiento_TS,TipoMovimiento_TSConstantesFunciones.LABEL_NOMBRE));

		if(this.tipomovimiento_tsConstantesFunciones.mostrarnombreTipoMovimiento_TS && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMovimiento_TSConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipomovimiento_tsConstantesFunciones.resaltarnombreTipoMovimiento_TS,this.tipomovimiento_tsConstantesFunciones.activarnombreTipoMovimiento_TS,this,true,"nombreTipoMovimiento_TS","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomovimiento_tsConstantesFunciones.resaltarnombreTipoMovimiento_TS,this.tipomovimiento_tsConstantesFunciones.activarnombreTipoMovimiento_TS,this,true,"nombreTipoMovimiento_TS","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoMovimiento_TSPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMovimiento_TS.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMovimiento_TS,TipoMovimiento_TSConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipomovimiento_tsConstantesFunciones.mostrarid_empresaTipoMovimiento_TS && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMovimiento_TSConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipomovimiento_tsConstantesFunciones.resaltarid_empresaTipoMovimiento_TS,this,this.tipomovimiento_tsConstantesFunciones.activarid_empresaTipoMovimiento_TS));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipomovimiento_tsConstantesFunciones.resaltarid_empresaTipoMovimiento_TS,this,this.tipomovimiento_tsConstantesFunciones.activarid_empresaTipoMovimiento_TS,false,"id_empresaTipoMovimiento_TS","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoMovimiento_TSPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoMovimiento_TS.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoMovimiento_TS.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoMovimiento_TS && this.isPermisoGuardarCambiosTipoMovimiento_TS) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoMovimiento_TS.addColumn(tableColumn);
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
			
			this.jTableDatosTipoMovimiento_TS.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoMovimiento_TS && this.isPermisoGuardarCambiosTipoMovimiento_TS) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoMovimiento_TS && this.isPermisoGuardarCambiosTipoMovimiento_TS) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoMovimiento_TS.moveColumn(this.jTableDatosTipoMovimiento_TS.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoMovimiento_TS.moveColumn(this.jTableDatosTipoMovimiento_TS.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoMovimiento_TS.moveColumn(this.jTableDatosTipoMovimiento_TS.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoMovimiento_TS.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoMovimiento_TS.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoMovimiento_TS,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoMovimiento_TSJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoMovimiento_TS.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoMovimiento_TS.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoMovimiento_TSJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoMovimiento_TSJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoMovimiento_TS.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoMovimiento_TS.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoMovimiento_TS.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipomovimiento_tsLogic.getTipoMovimiento_TSs().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipomovimiento_tss.size()-1;
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
		//this.jTableDatosTipoMovimiento_TS.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoMovimiento_TS.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoMovimiento_TS();
			
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
				
				//this.isEsNuevoTipoMovimiento_TS=false;
					
				TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
			
				if(this.tipomovimiento_tsSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoMovimiento_TS==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoMovimiento_TS.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoMovimiento_TS.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento_ts =(TipoMovimiento_TS) this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovimiento_ts =(TipoMovimiento_TS) this.tipomovimiento_tss.toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipomovimiento_ts.getsType().equals("DUPLICADO")
				   || this.tipomovimiento_ts.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoMovimiento_TS=true;
				
				} else {
					this.isEsNuevoTipoMovimiento_TS=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {
					if(this.tipomovimiento_ts.getId()>=0 && !this.tipomovimiento_ts.getIsNew()) {						
						this.isEsNuevoTipoMovimiento_TS=false;
						
					} else {
						this.isEsNuevoTipoMovimiento_TS=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoMovimiento_TS(esRelaciones);						
				
				this.seleccionarTipoMovimiento_TS(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipomovimiento_ts.getId()<0) {
					this.isEsNuevoTipoMovimiento_TS=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoMovimiento_TS(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoMovimiento_TS(evt,rowIndex);
				}	
				
				if(this.tipomovimiento_tsSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoMovimiento_TS: " + this.dDif); 
					}
				}								
				
				TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoMovimiento_TS(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipomovimiento_ts)) {
					if(this.tipomovimiento_ts.getId()>0) {
						this.tipomovimiento_ts.setIsDeleted(true);
						
						this.tipomovimiento_tssEliminados.add(this.tipomovimiento_ts);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().remove(this.tipomovimiento_ts);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipomovimiento_tss.remove(this.tipomovimiento_ts);				
					}
					
					
					((TipoMovimiento_TSModel) this.jTableDatosTipoMovimiento_TS.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoMovimiento_TS(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoMovimiento_TS(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoMovimiento_TS) {
			
			if(this.jInternalFrameDetalleFormTipoMovimiento_TS==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoMovimiento_TS.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoMovimiento_TS.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento_ts =(TipoMovimiento_TS) this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovimiento_ts =(TipoMovimiento_TS) this.tipomovimiento_tss.toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoMovimiento_TSJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoMovimiento_TS(this.tipomovimiento_ts);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipomovimiento_tsConstantesFunciones.cargarid_empresaTipoMovimiento_TS || this.tipomovimiento_tsConstantesFunciones.event_dependid_empresaTipoMovimiento_TS) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipomovimiento_ts.getid_empresa());
									//this.inicializarActualizarBindingTipoMovimiento_TS(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipomovimiento_ts.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipomovimiento_ts.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipomovimiento_ts.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoMovimiento_TS("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoMovimiento_TS(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoMovimiento_TS() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoMovimiento_TS(TipoMovimiento_TS tipomovimiento_ts) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoMovimiento_TS(tipomovimiento_ts,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoMovimiento_TS(TipoMovimiento_TS tipomovimiento_ts,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoMovimiento_TS(tipomovimiento_ts);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoMovimiento_TS(tipomovimiento_ts,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoMovimiento_TS(tipomovimiento_ts);
	}
	
	public void setVariablesObjetoActualToFormularioTipoMovimiento_TS(TipoMovimiento_TS tipomovimiento_ts) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoMovimiento_TS==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jLabelidTipoMovimiento_TS.setText(tipomovimiento_ts.getId().toString());
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jTextFieldcodigoTipoMovimiento_TS.setText(tipomovimiento_ts.getcodigo());
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jTextAreanombreTipoMovimiento_TS.setText(tipomovimiento_ts.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoMovimiento_TS tipomovimiento_tsLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipomovimiento_tsLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoMovimiento_TS tipomovimiento_tsLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipomovimiento_tsLocal=this.tipomovimiento_ts;
			} else {
				tipomovimiento_tsLocal=this.tipomovimiento_tsAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipomovimiento_tsLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoMovimiento_TS(tipomovimiento_tsLocal,true);
					
					if(tipomovimiento_tsSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipomovimiento_tsLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipomovimiento_tsLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoMovimiento_TS(TipoMovimiento_TS tipomovimiento_ts,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoMovimiento_TS(tipomovimiento_ts,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento_TS(tipomovimiento_ts);
	}
	
	public void setVariablesFormularioToObjetoActualTipoMovimiento_TS(TipoMovimiento_TS tipomovimiento_ts,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoMovimiento_TS(tipomovimiento_ts,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoMovimiento_TS(TipoMovimiento_TS tipomovimiento_ts,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoMovimiento_TS==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoMovimiento_TS.jLabelidTipoMovimiento_TS.getText()==null || this.jInternalFrameDetalleFormTipoMovimiento_TS.jLabelidTipoMovimiento_TS.getText()=="" || this.jInternalFrameDetalleFormTipoMovimiento_TS.jLabelidTipoMovimiento_TS.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoMovimiento_TS.jLabelidTipoMovimiento_TS.setText("0");
			}

			if(conColumnasBase) {tipomovimiento_ts.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoMovimiento_TS.jLabelidTipoMovimiento_TS.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMovimiento_TSConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMovimiento_TS.jLabelIdTipoMovimiento_TS,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipomovimiento_ts.setcodigo(this.jInternalFrameDetalleFormTipoMovimiento_TS.jTextFieldcodigoTipoMovimiento_TS.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMovimiento_TSConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMovimiento_TS.jLabelcodigoTipoMovimiento_TS,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipomovimiento_ts.setnombre(this.jInternalFrameDetalleFormTipoMovimiento_TS.jTextAreanombreTipoMovimiento_TS.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMovimiento_TSConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMovimiento_TS.jLabelnombreTipoMovimiento_TS,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoMovimiento_TS(TipoMovimiento_TS tipomovimiento_tsBean,TipoMovimiento_TS tipomovimiento_ts,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoMovimiento_TS(TipoMovimiento_TS tipomovimiento_tsOrigen,TipoMovimiento_TS tipomovimiento_ts,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipomovimiento_tsOrigen.getId()!=null && !tipomovimiento_tsOrigen.getId().equals(0L))) {tipomovimiento_ts.setId(tipomovimiento_tsOrigen.getId());}}
			if(conDefault || (!conDefault && tipomovimiento_tsOrigen.getcodigo()!=null && !tipomovimiento_tsOrigen.getcodigo().equals(""))) {tipomovimiento_ts.setcodigo(tipomovimiento_tsOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipomovimiento_tsOrigen.getnombre()!=null && !tipomovimiento_tsOrigen.getnombre().equals(""))) {tipomovimiento_ts.setnombre(tipomovimiento_tsOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoMovimiento_TS(TipoMovimiento_TS tipomovimiento_ts) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jLabelidTipoMovimiento_TS.setText(tipomovimiento_ts.getId().toString());
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jTextFieldcodigoTipoMovimiento_TS.setText(tipomovimiento_ts.getcodigo());
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jTextAreanombreTipoMovimiento_TS.setText(tipomovimiento_ts.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoMovimiento_TS(TipoMovimiento_TSBean tipomovimiento_tsBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jLabelidTipoMovimiento_TS.setText(tipomovimiento_tsBean.getId().toString());
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jTextFieldcodigoTipoMovimiento_TS.setText(tipomovimiento_tsBean.getcodigo());
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jTextAreanombreTipoMovimiento_TS.setText(tipomovimiento_tsBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoMovimiento_TS(TipoMovimiento_TSParameterReturnGeneral tipomovimiento_tsReturnGeneral,TipoMovimiento_TSBean tipomovimiento_tsBean,Boolean conDefault) throws Exception { 
		try {
			TipoMovimiento_TS tipomovimiento_tsLocal=new TipoMovimiento_TS();
			
			tipomovimiento_tsLocal=tipomovimiento_tsReturnGeneral.getTipoMovimiento_TS();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipomovimiento_tsLocal.getId()!=null && !tipomovimiento_tsLocal.getId().equals(0L))) {tipomovimiento_tsBean.setId(tipomovimiento_tsLocal.getId());}}
			if(conDefault || (!conDefault && tipomovimiento_tsLocal.getcodigo()!=null && !tipomovimiento_tsLocal.getcodigo().equals(""))) {tipomovimiento_tsBean.setcodigo(tipomovimiento_tsLocal.getcodigo());}
			if(conDefault || (!conDefault && tipomovimiento_tsLocal.getnombre()!=null && !tipomovimiento_tsLocal.getnombre().equals(""))) {tipomovimiento_tsBean.setnombre(tipomovimiento_tsLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoMovimiento_TSGenerico(Long idTipoMovimiento_TSSeleccionado,JComboBox jComboBoxTipoMovimiento_TS,List<TipoMovimiento_TS> tipomovimiento_tssLocal)throws Exception {
		try {
			TipoMovimiento_TS  tipomovimiento_tsTemp=null;

			for(TipoMovimiento_TS tipomovimiento_tsAux:tipomovimiento_tssLocal) {
				if(tipomovimiento_tsAux.getId()!=null && tipomovimiento_tsAux.getId().equals(idTipoMovimiento_TSSeleccionado)) {
					tipomovimiento_tsTemp=tipomovimiento_tsAux;
					break;
				}
			}

			jComboBoxTipoMovimiento_TS.setSelectedItem(tipomovimiento_tsTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoMovimiento_TSGenerico(JComboBox jComboBoxTipoMovimiento_TS,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoMovimiento_TS.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoMovimiento_TS.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoMovimiento_TS.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoMovimiento_TS.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoMovimiento_TS.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoMovimiento_TS.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoMovimiento_TS.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoMovimiento_TS.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoMovimiento_TS.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoMovimiento_TS.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipomovimiento_ts=(TipoMovimiento_TS) tipomovimiento_tsLogic.getTipoMovimiento_TSs().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipomovimiento_ts =(TipoMovimiento_TS) tipomovimiento_tss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipomovimiento_ts.getIsNew() && !tipomovimiento_ts.getIsChanged() && !tipomovimiento_ts.getIsDeleted()) {
				sDescripcion=tipomovimiento_ts.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipomovimiento_ts.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoMovimiento_TS tipomovimiento_tsRow=new TipoMovimiento_TS();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipomovimiento_tsRow=(TipoMovimiento_TS) tipomovimiento_tsLogic.getTipoMovimiento_TSs().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipomovimiento_tsRow=(TipoMovimiento_TS) tipomovimiento_tss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoMovimiento_TS(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaNuevoTipoMovimiento_TS && this.isPermisoNuevoTipoMovimiento_TS));			
			this.jButtonDuplicarTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaDuplicarTipoMovimiento_TS && this.isPermisoDuplicarTipoMovimiento_TS));			
			this.jButtonCopiarTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaCopiarTipoMovimiento_TS && this.isPermisoCopiarTipoMovimiento_TS));
			this.jButtonVerFormTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaVerFormTipoMovimiento_TS && this.isPermisoVerFormTipoMovimiento_TS));
			
			this.jButtonAbrirOrderByTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaOrdenTipoMovimiento_TS && this.isPermisoOrdenTipoMovimiento_TS));			
			
			this.jButtonNuevoRelacionesTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento_TS && this.isPermisoNuevoTipoMovimiento_TS));			
			this.jButtonNuevoGuardarCambiosTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaNuevoTipoMovimiento_TS && this.isPermisoNuevoTipoMovimiento_TS && this.isPermisoGuardarCambiosTipoMovimiento_TS));
			
			if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) {
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonModificarTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaModificarTipoMovimiento_TS && this.isPermisoActualizarTipoMovimiento_TS));	
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonActualizarTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaActualizarTipoMovimiento_TS && this.isPermisoActualizarTipoMovimiento_TS));	
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonEliminarTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaEliminarTipoMovimiento_TS && this.isPermisoEliminarTipoMovimiento_TS));
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonCancelarTipoMovimiento_TS.setVisible(this.isVisibilidadCeldaCancelarTipoMovimiento_TS);							
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonGuardarCambiosTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaGuardarTipoMovimiento_TS && this.isPermisoGuardarCambiosTipoMovimiento_TS));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoMovimiento_TS && this.isPermisoGuardarCambiosTipoMovimiento_TS));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaNuevoTipoMovimiento_TS && this.isPermisoNuevoTipoMovimiento_TS));						
			this.jButtonDuplicarToolBarTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaDuplicarTipoMovimiento_TS && this.isPermisoDuplicarTipoMovimiento_TS));						
			this.jButtonCopiarToolBarTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaCopiarTipoMovimiento_TS && this.isPermisoCopiarTipoMovimiento_TS));			
			this.jButtonVerFormToolBarTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaVerFormTipoMovimiento_TS && this.isPermisoVerFormTipoMovimiento_TS));			
			this.jButtonAbrirOrderByToolBarTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaOrdenTipoMovimiento_TS && this.isPermisoOrdenTipoMovimiento_TS));
			this.jButtonNuevoRelacionesToolBarTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento_TS && this.isPermisoNuevoTipoMovimiento_TS));			
			this.jButtonNuevoGuardarCambiosToolBarTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaNuevoTipoMovimiento_TS && this.isPermisoNuevoTipoMovimiento_TS && this.isPermisoGuardarCambiosTipoMovimiento_TS));			
			
			if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) {
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonModificarToolBarTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaModificarTipoMovimiento_TS && this.isPermisoActualizarTipoMovimiento_TS));	
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonActualizarToolBarTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaActualizarTipoMovimiento_TS  && this.isPermisoActualizarTipoMovimiento_TS));	
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonEliminarToolBarTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaEliminarTipoMovimiento_TS && this.isPermisoEliminarTipoMovimiento_TS));
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonCancelarToolBarTipoMovimiento_TS.setVisible(this.isVisibilidadCeldaCancelarTipoMovimiento_TS);				
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonGuardarCambiosToolBarTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaGuardarTipoMovimiento_TS && this.isPermisoGuardarCambiosTipoMovimiento_TS));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoMovimiento_TS && this.isPermisoGuardarCambiosTipoMovimiento_TS));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaNuevoTipoMovimiento_TS && this.isPermisoNuevoTipoMovimiento_TS));			
			this.jMenuItemDuplicarTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaDuplicarTipoMovimiento_TS && this.isPermisoDuplicarTipoMovimiento_TS));			
			this.jMenuItemCopiarTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaCopiarTipoMovimiento_TS && this.isPermisoCopiarTipoMovimiento_TS));			
			this.jMenuItemVerFormTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaVerFormTipoMovimiento_TS && this.isPermisoVerFormTipoMovimiento_TS));			
			this.jMenuItemAbrirOrderByTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaOrdenTipoMovimiento_TS && this.isPermisoOrdenTipoMovimiento_TS));			
			//this.jMenuItemMostrarOcultarTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaOrdenTipoMovimiento_TS && this.isPermisoOrdenTipoMovimiento_TS));
			this.jMenuItemDetalleAbrirOrderByTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaOrdenTipoMovimiento_TS && this.isPermisoOrdenTipoMovimiento_TS));			
			//this.jMenuItemDetalleMostrarOcultarTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaOrdenTipoMovimiento_TS && this.isPermisoOrdenTipoMovimiento_TS));			
			this.jMenuItemNuevoRelacionesTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento_TS && this.isPermisoNuevoTipoMovimiento_TS));			
			this.jMenuItemNuevoGuardarCambiosTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaNuevoTipoMovimiento_TS && this.isPermisoNuevoTipoMovimiento_TS && this.isPermisoGuardarCambiosTipoMovimiento_TS));									
			
			if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) {
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jMenuItemModificarTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaModificarTipoMovimiento_TS && this.isPermisoActualizarTipoMovimiento_TS));	
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jMenuItemActualizarTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaActualizarTipoMovimiento_TS && this.isPermisoActualizarTipoMovimiento_TS));	
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jMenuItemEliminarTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaEliminarTipoMovimiento_TS && this.isPermisoEliminarTipoMovimiento_TS));
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jMenuItemCancelarTipoMovimiento_TS.setVisible(this.isVisibilidadCeldaCancelarTipoMovimiento_TS);				
			}
			
			this.jMenuItemGuardarCambiosTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaGuardarTipoMovimiento_TS && this.isPermisoGuardarCambiosTipoMovimiento_TS));						
			this.jMenuItemGuardarCambiosTablaTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoMovimiento_TS && this.isPermisoGuardarCambiosTipoMovimiento_TS));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoMovimiento_TS=this.jButtonNuevoTipoMovimiento_TS.isVisible();
			this.isVisibilidadCeldaDuplicarTipoMovimiento_TS=this.jButtonDuplicarTipoMovimiento_TS.isVisible();
			this.isVisibilidadCeldaCopiarTipoMovimiento_TS=this.jButtonCopiarTipoMovimiento_TS.isVisible();
			this.isVisibilidadCeldaVerFormTipoMovimiento_TS=this.jButtonVerFormTipoMovimiento_TS.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoMovimiento_TS=this.jButtonAbrirOrderByTipoMovimiento_TS.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento_TS=this.jButtonNuevoRelacionesTipoMovimiento_TS.isVisible();
			this.isVisibilidadCeldaModificarTipoMovimiento_TS=this.jButtonModificarTipoMovimiento_TS.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) {
			this.isVisibilidadCeldaActualizarTipoMovimiento_TS=this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonActualizarTipoMovimiento_TS.isVisible();
			this.isVisibilidadCeldaEliminarTipoMovimiento_TS=this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonEliminarTipoMovimiento_TS.isVisible();
			this.isVisibilidadCeldaCancelarTipoMovimiento_TS=this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonCancelarTipoMovimiento_TS.isVisible();
			this.isVisibilidadCeldaGuardarTipoMovimiento_TS=this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonGuardarCambiosTipoMovimiento_TS.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoMovimiento_TS=this.jButtonGuardarCambiosTablaTipoMovimiento_TS.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoMovimiento_TS=this.jButtonNuevoToolBarTipoMovimiento_TS.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento_TS=this.jButtonNuevoRelacionesToolBarTipoMovimiento_TS.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) {
			this.isVisibilidadCeldaModificarTipoMovimiento_TS=this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonModificarToolBarTipoMovimiento_TS.isVisible();
			this.isVisibilidadCeldaActualizarTipoMovimiento_TS=this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonActualizarToolBarTipoMovimiento_TS.isVisible();
			this.isVisibilidadCeldaEliminarTipoMovimiento_TS=this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonEliminarToolBarTipoMovimiento_TS.isVisible();
			this.isVisibilidadCeldaCancelarTipoMovimiento_TS=this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonCancelarToolBarTipoMovimiento_TS.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoMovimiento_TS=this.jButtonGuardarCambiosToolBarTipoMovimiento_TS.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoMovimiento_TS=this.jButtonGuardarCambiosTablaToolBarTipoMovimiento_TS.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoMovimiento_TS=this.jMenuItemNuevoTipoMovimiento_TS.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento_TS=this.jMenuItemNuevoRelacionesTipoMovimiento_TS.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) {
			this.isVisibilidadCeldaModificarTipoMovimiento_TS=this.jInternalFrameDetalleFormTipoMovimiento_TS.jMenuItemModificarTipoMovimiento_TS.isVisible();
			this.isVisibilidadCeldaActualizarTipoMovimiento_TS=this.jInternalFrameDetalleFormTipoMovimiento_TS.jMenuItemActualizarTipoMovimiento_TS.isVisible();
			this.isVisibilidadCeldaEliminarTipoMovimiento_TS=this.jInternalFrameDetalleFormTipoMovimiento_TS.jMenuItemEliminarTipoMovimiento_TS.isVisible();
			this.isVisibilidadCeldaCancelarTipoMovimiento_TS=this.jInternalFrameDetalleFormTipoMovimiento_TS.jMenuItemCancelarTipoMovimiento_TS.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoMovimiento_TS=this.jMenuItemGuardarCambiosTipoMovimiento_TS.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoMovimiento_TS=this.jMenuItemGuardarCambiosTablaTipoMovimiento_TS.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoMovimiento_TS(Boolean esInicializar) {
		if(TipoMovimiento_TSJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipomovimiento_tsSessionBean.getConGuardarRelaciones()) {
				//if(this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoMovimiento_TS();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoMovimiento_TS(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoMovimiento_TS() {
		this.jButtonNuevoTipoMovimiento_TS.setVisible(this.isPermisoNuevoTipoMovimiento_TS);			
		this.jButtonDuplicarTipoMovimiento_TS.setVisible(this.isPermisoDuplicarTipoMovimiento_TS);			
		this.jButtonCopiarTipoMovimiento_TS.setVisible(this.isPermisoCopiarTipoMovimiento_TS);			
		this.jButtonVerFormTipoMovimiento_TS.setVisible(this.isPermisoVerFormTipoMovimiento_TS);			
		
		this.jButtonAbrirOrderByTipoMovimiento_TS.setVisible(this.isPermisoOrdenTipoMovimiento_TS);					
		
		this.jButtonNuevoRelacionesTipoMovimiento_TS.setVisible(this.isPermisoNuevoTipoMovimiento_TS);			
		
		if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonModificarTipoMovimiento_TS.setVisible(this.isPermisoActualizarTipoMovimiento_TS);	
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonActualizarTipoMovimiento_TS.setVisible(this.isPermisoActualizarTipoMovimiento_TS);	
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonEliminarTipoMovimiento_TS.setVisible(this.isPermisoEliminarTipoMovimiento_TS);
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonCancelarTipoMovimiento_TS.setVisible(this.isVisibilidadCeldaCancelarTipoMovimiento_TS);						
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonGuardarCambiosTipoMovimiento_TS.setVisible(this.isPermisoGuardarCambiosTipoMovimiento_TS);							
		}
		
		this.jButtonGuardarCambiosTablaTipoMovimiento_TS.setVisible(this.isPermisoActualizarTipoMovimiento_TS);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoMovimiento_TS() {
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonModificarTipoMovimiento_TS.setVisible(this.isPermisoActualizarTipoMovimiento_TS);	
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonActualizarTipoMovimiento_TS.setVisible(this.isPermisoActualizarTipoMovimiento_TS);	
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonEliminarTipoMovimiento_TS.setVisible(this.isPermisoEliminarTipoMovimiento_TS);
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonCancelarTipoMovimiento_TS.setVisible(this.isVisibilidadCeldaCancelarTipoMovimiento_TS);							
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonGuardarCambiosTipoMovimiento_TS.setVisible((this.isVisibilidadCeldaGuardarTipoMovimiento_TS && this.isPermisoGuardarCambiosTipoMovimiento_TS));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoMovimiento_TS() {
		if(TipoMovimiento_TSJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoMovimiento_TS();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoMovimiento_TS() {
	}
	
	public void jTableDatosTipoMovimiento_TSListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoMovimiento_TS(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoMovimiento_TSBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento_tsLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMovimiento_TS.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMovimiento_TS(this.gettipomovimiento_ts(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento_TS(this.tipomovimiento_ts);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomovimiento_ts =(TipoMovimiento_TS) this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomovimiento_ts =(TipoMovimiento_TS) this.tipomovimiento_tss.toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomovimiento_ts==null) {
						this.tipomovimiento_ts = new TipoMovimiento_TS();
					}

					this.setVariablesFormularioToObjetoActualTipoMovimiento_TS(this.tipomovimiento_ts,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento_TS(this.tipomovimiento_ts);
				}

				if(this.tipomovimiento_ts.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipomovimiento_ts.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMovimiento_TS(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento_tsLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento_tsLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento_tsLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoMovimiento_TSBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento_tsLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMovimiento_TS.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMovimiento_TS(this.gettipomovimiento_ts(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento_TS(this.tipomovimiento_ts);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomovimiento_ts =(TipoMovimiento_TS) this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomovimiento_ts =(TipoMovimiento_TS) this.tipomovimiento_tss.toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomovimiento_ts==null) {
						this.tipomovimiento_ts = new TipoMovimiento_TS();
					}

					this.setVariablesFormularioToObjetoActualTipoMovimiento_TS(this.tipomovimiento_ts,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento_TS(this.tipomovimiento_ts);
				}

				if(this.tipomovimiento_ts.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipomovimiento_ts.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMovimiento_TS(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento_tsLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento_tsLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento_tsLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoMovimiento_TSBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento_tsLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMovimiento_TS.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMovimiento_TS(this.gettipomovimiento_ts(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento_TS(this.tipomovimiento_ts);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomovimiento_ts =(TipoMovimiento_TS) this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomovimiento_ts =(TipoMovimiento_TS) this.tipomovimiento_tss.toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomovimiento_ts==null) {
						this.tipomovimiento_ts = new TipoMovimiento_TS();
					}

					this.setVariablesFormularioToObjetoActualTipoMovimiento_TS(this.tipomovimiento_ts,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento_TS(this.tipomovimiento_ts);
				}

				if(this.tipomovimiento_ts.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipomovimiento_ts.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMovimiento_TS(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento_tsLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento_tsLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento_tsLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoMovimiento_TSUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoMovimiento_TS(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMovimiento_TS.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoMovimiento_TS.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoMovimiento_TS.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento_ts =(TipoMovimiento_TS) this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipomovimiento_ts =(TipoMovimiento_TS) this.tipomovimiento_tss.toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoMovimiento_TS(this.gettipomovimiento_ts(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento_TS(this.tipomovimiento_ts);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipomovimiento_tsLogic.getConnexion());

				if(this.tipomovimiento_ts.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipomovimiento_ts.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoMovimiento_TS=(TitledBorder)this.jScrollPanelDatosTipoMovimiento_TS.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoMovimiento_TS.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoMovimiento_TSBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento_tsLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMovimiento_TS.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMovimiento_TS(this.gettipomovimiento_ts(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento_TS(this.tipomovimiento_ts);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomovimiento_ts =(TipoMovimiento_TS) this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomovimiento_ts =(TipoMovimiento_TS) this.tipomovimiento_tss.toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomovimiento_ts==null) {
						this.tipomovimiento_ts = new TipoMovimiento_TS();
					}

					this.setVariablesFormularioToObjetoActualTipoMovimiento_TS(this.tipomovimiento_ts,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento_TS(this.tipomovimiento_ts);
				}

				if(this.tipomovimiento_ts.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipomovimiento_ts.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMovimiento_TS(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento_tsLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento_tsLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento_tsLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoMovimiento_TSActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoMovimiento_TS(false,false);

			this.getTipoMovimiento_TSsFK_IdEmpresa();

			this.inicializarActualizarBindingTipoMovimiento_TS(false);

			//if(TipoMovimiento_TSBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoMovimiento_TS(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimiento_tsLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoMovimiento_TS() {
		if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) {
			this.jInternalFrameDetalleFormTipoMovimiento_TS.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoMovimiento_TS.dispose();
			this.jInternalFrameDetalleFormTipoMovimiento_TS=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoMovimiento_TS!=null) {
			this.jInternalFrameReporteDinamicoTipoMovimiento_TS.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoMovimiento_TS.dispose();
			this.jInternalFrameReporteDinamicoTipoMovimiento_TS=null;
		}
		
		if(this.jInternalFrameImportacionTipoMovimiento_TS!=null) {
			this.jInternalFrameImportacionTipoMovimiento_TS.setVisible(false);	    			
			this.jInternalFrameImportacionTipoMovimiento_TS.dispose();
			this.jInternalFrameImportacionTipoMovimiento_TS=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoMovimiento_TS();
			
			TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoMovimiento_TS")) {
				jButtonNuevoTipoMovimiento_TSActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoMovimiento_TS")) {
				jButtonDuplicarTipoMovimiento_TSActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoMovimiento_TS")) {
				jButtonCopiarTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoMovimiento_TS")) {
				jButtonVerFormTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoMovimiento_TS")) {
				jButtonNuevoTipoMovimiento_TSActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoMovimiento_TS")) {
				jButtonDuplicarTipoMovimiento_TSActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoMovimiento_TS")) {
				jButtonNuevoTipoMovimiento_TSActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoMovimiento_TS")) {
				jButtonDuplicarTipoMovimiento_TSActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoMovimiento_TS")) {
				jButtonNuevoTipoMovimiento_TSActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoMovimiento_TS")) {
				jButtonNuevoTipoMovimiento_TSActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoMovimiento_TS")) {
				jButtonNuevoTipoMovimiento_TSActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoMovimiento_TS")) {
				jButtonModificarTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoMovimiento_TS")) {
				jButtonModificarTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoMovimiento_TS")) {
				jButtonModificarTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoMovimiento_TS")) {
				jButtonActualizarTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoMovimiento_TS")) {
				jButtonActualizarTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoMovimiento_TS")) {
				jButtonActualizarTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoMovimiento_TS")) {
				jButtonEliminarTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoMovimiento_TS")) {
				jButtonEliminarTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoMovimiento_TS")) {
				jButtonEliminarTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoMovimiento_TS")) {
				jButtonCancelarTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoMovimiento_TS")) {
				jButtonCancelarTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoMovimiento_TS")) {
				jButtonCancelarTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoMovimiento_TS")) {
				jButtonCerrarTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoMovimiento_TS")) {
				jButtonCerrarTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoMovimiento_TS")) {
				jButtonCerrarTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoMovimiento_TS")) {
				jButtonMostrarOcultarTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoMovimiento_TS")) {
				jButtonCancelarTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoMovimiento_TS")) {
				jButtonGuardarCambiosTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoMovimiento_TS")) {
				jButtonGuardarCambiosTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoMovimiento_TS")) {
				jButtonCopiarTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoMovimiento_TS")) {
				jButtonVerFormTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoMovimiento_TS")) {
				jButtonGuardarCambiosTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoMovimiento_TS")) {
				jButtonCopiarTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoMovimiento_TS")) {
				jButtonVerFormTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoMovimiento_TS")) {
				jButtonGuardarCambiosTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoMovimiento_TS")) {
				jButtonGuardarCambiosTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoMovimiento_TS")) {
				jButtonGuardarCambiosTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoMovimiento_TS")) {
				jButtonRecargarInformacionTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoMovimiento_TS")) {
				jButtonRecargarInformacionTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoMovimiento_TS")) {
				jButtonRecargarInformacionTipoMovimiento_TSActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoMovimiento_TS")) {
				jButtonAnterioresTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoMovimiento_TS")) {
				jButtonAnterioresTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoMovimiento_TS")) {
				jButtonAnterioresTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoMovimiento_TS")) {
				jButtonSiguientesTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoMovimiento_TS")) {
				jButtonSiguientesTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoMovimiento_TS")) {
				jButtonSiguientesTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoMovimiento_TS") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoMovimiento_TS")) {
				jButtonAbrirOrderByTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoMovimiento_TS") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoMovimiento_TS")) {
				jButtonMostrarOcultarTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoMovimiento_TS")) {
				jButtonNuevoGuardarCambiosTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoMovimiento_TS")) {
				jButtonNuevoGuardarCambiosTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoMovimiento_TS")) {
				jButtonNuevoGuardarCambiosTipoMovimiento_TSActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoMovimiento_TS")) {
				jButtonCerrarReporteDinamicoTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoMovimiento_TS")) {
				jButtonGenerarReporteDinamicoTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoMovimiento_TS")) {
				
				jButtonGenerarExcelReporteDinamicoTipoMovimiento_TSActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoMovimiento_TS")) {
				jButtonCerrarImportacionTipoMovimiento_TSActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoMovimiento_TS")) {
				
				jButtonGenerarImportacionTipoMovimiento_TSActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoMovimiento_TS")) {
				
				jButtonAbrirImportacionTipoMovimiento_TSActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoMovimiento_TS")) {
				jComboBoxTiposAccionesTipoMovimiento_TSActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoMovimiento_TS")) {
				jComboBoxTiposRelacionesTipoMovimiento_TSActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoMovimiento_TS")) {
				jComboBoxTiposAccionesTipoMovimiento_TSActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoMovimiento_TS")) {
				
				jComboBoxTiposSeleccionarTipoMovimiento_TSActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoMovimiento_TS")) {
				jTextFieldValorCampoGeneralTipoMovimiento_TSActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoMovimiento_TS")) {
				jButtonAbrirOrderByTipoMovimiento_TSActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoMovimiento_TS")) {
				jButtonAbrirOrderByTipoMovimiento_TSActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoMovimiento_TS")) {
				jButtonCerrarOrderByTipoMovimiento_TSActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoMovimiento_TSBusqueda")) {
				this.jButtonidTipoMovimiento_TSBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoMovimiento_TSBusqueda")) {
				this.jButtoncodigoTipoMovimiento_TSBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoMovimiento_TSBusqueda")) {
				this.jButtonnombreTipoMovimiento_TSBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoMovimiento_TSUpdate")) {
				this.jButtonid_empresaTipoMovimiento_TSUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoMovimiento_TSBusqueda")) {
				this.jButtonid_empresaTipoMovimiento_TSBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoMovimiento_TS();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMovimiento_TSActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimiento_ts);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento_ts);
				
				TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
				
				


				
				TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMovimiento_TS.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimiento_TS.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoMovimiento_TS tipomovimiento_tsLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipomovimiento_tsLocal=this.tipomovimiento_ts;
			} else {
				tipomovimiento_tsLocal=this.tipomovimiento_tsAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimiento_ts);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento_ts);
				
				TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
							
				
				


				
				TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMovimiento_TS.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimiento_TS.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMovimiento_TSActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMovimiento_TS.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento_tsAnterior =(TipoMovimiento_TS) this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovimiento_tsAnterior =(TipoMovimiento_TS) this.tipomovimiento_tss.toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
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
			
			TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
			
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
			
			


			
			TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMovimiento_TSActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimiento_ts);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento_ts);
				
				TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
								
						
				


				
				TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMovimiento_TS.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimiento_TS.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimiento_ts);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento_ts);
				
				TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
								
				
				


				
				TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMovimiento_TS.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimiento_TS.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMovimiento_TSActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMovimiento_TS.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento_tsAnterior =(TipoMovimiento_TS) this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovimiento_tsAnterior =(TipoMovimiento_TS) this.tipomovimiento_tss.toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimiento_ts);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento_ts);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMovimiento_TSActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMovimiento_TS.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento_tsAnterior =(TipoMovimiento_TS) this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovimiento_tsAnterior =(TipoMovimiento_TS) this.tipomovimiento_tss.toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMovimiento_TSActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimiento_ts);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento_ts);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimiento_ts);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento_ts);
				
				TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
							
				
				


				
				TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMovimiento_TS.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimiento_TS.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMovimiento_TSActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoMovimiento_TS.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomovimiento_tsAnterior =(TipoMovimiento_TS) this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipomovimiento_tsAnterior =(TipoMovimiento_TS) this.tipomovimiento_tss.toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
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
			
			TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
			
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
			
			


			
			TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMovimiento_TSActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimiento_ts);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento_ts);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimiento_ts);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento_ts);
				
				TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
								
				
				


				
				TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMovimiento_TS.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimiento_TS.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMovimiento_TSActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMovimiento_TS.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento_tsAnterior =(TipoMovimiento_TS) this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovimiento_tsAnterior =(TipoMovimiento_TS) this.tipomovimiento_tss.toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMovimiento_TSActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimiento_ts);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento_ts);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMovimiento_TSActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimiento_ts);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento_ts);
				
				TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoMovimiento_TS")) {
					jCheckBoxSeleccionarTodosTipoMovimiento_TSItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoMovimiento_TS")) {
					jCheckBoxSeleccionadosTipoMovimiento_TSItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoMovimiento_TS")) {
					
				}
				
				


				
				
				TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMovimiento_TS.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimiento_TS.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimiento_ts);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento_ts);
				
				TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
												
				
				


				
				
				TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMovimiento_TS.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimiento_TS.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMovimiento_TSActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoMovimiento_TS.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomovimiento_tsAnterior =(TipoMovimiento_TS) this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipomovimiento_tsAnterior =(TipoMovimiento_TS) this.tipomovimiento_tss.toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMovimiento_TSActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimiento_ts);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento_ts);
				
				TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
				
				
				TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
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
			
			TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
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
			
			


			
			TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMovimiento_TSActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimiento_ts);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento_ts);
				
				TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMovimiento_TS.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimiento_TS.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimiento_ts);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimiento_ts);
				
				TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
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
				
				


				
				TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMovimiento_TS.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimiento_TS.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMovimiento_TSActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMovimiento_TS.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimiento_tsAnterior =(TipoMovimiento_TS) this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovimiento_tsAnterior =(TipoMovimiento_TS) this.tipomovimiento_tss.toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoMovimiento_TS")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoMovimiento_TSListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoMovimiento_TS.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipomovimiento_ts =(TipoMovimiento_TS) this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipomovimiento_ts =(TipoMovimiento_TS) this.tipomovimiento_tss.toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipomovimiento_ts);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoMovimiento_TS")) {
				
				}
				
				TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoMovimiento_TS")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoMovimiento_TS.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoMovimiento_TS")) {
			
			}
			
			TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoMovimiento_TS();
			
			TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
			
			if(sTipo.equals("NuevoTipoMovimiento_TS")) {
				jButtonNuevoTipoMovimiento_TSActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoMovimiento_TS")) {
				jButtonDuplicarTipoMovimiento_TSActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoMovimiento_TS")) {
				jButtonCopiarTipoMovimiento_TSActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoMovimiento_TS")) {
				jButtonVerFormTipoMovimiento_TSActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoMovimiento_TS")) {
				jButtonNuevoTipoMovimiento_TSActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoMovimiento_TS")) {
				jButtonModificarTipoMovimiento_TSActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoMovimiento_TS")) {
				jButtonActualizarTipoMovimiento_TSActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoMovimiento_TS")) {
				jButtonEliminarTipoMovimiento_TSActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoMovimiento_TS")) {
				jButtonGuardarCambiosTipoMovimiento_TSActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoMovimiento_TS")) {
				jButtonCancelarTipoMovimiento_TSActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoMovimiento_TS")) {
				jButtonCerrarTipoMovimiento_TSActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoMovimiento_TS")) {
				jButtonGuardarCambiosTipoMovimiento_TSActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoMovimiento_TS")) {
				jButtonNuevoGuardarCambiosTipoMovimiento_TSActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoMovimiento_TS")) {
				jButtonAbrirOrderByTipoMovimiento_TSActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoMovimiento_TS")) {
				jButtonRecargarInformacionTipoMovimiento_TSActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoMovimiento_TS")) {
				jButtonAnterioresTipoMovimiento_TSActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoMovimiento_TS")) {
				jButtonSiguientesTipoMovimiento_TSActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoMovimiento_TSBusqueda")) {
				this.jButtonidTipoMovimiento_TSBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoMovimiento_TSBusqueda")) {
				this.jButtoncodigoTipoMovimiento_TSBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoMovimiento_TSBusqueda")) {
				this.jButtonnombreTipoMovimiento_TSBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoMovimiento_TSUpdate")) {
				this.jButtonid_empresaTipoMovimiento_TSUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoMovimiento_TSBusqueda")) {
				this.jButtonid_empresaTipoMovimiento_TSBusquedaActionPerformed(evt);
			}
			
			TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoMovimiento_TS();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoMovimiento_TS")) {
				closingInternalFrameTipoMovimiento_TS();
				
			} else if(sTipo.equals("jButtonCancelarTipoMovimiento_TS")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoMovimiento_TS = (JInternalFrameBase)evt.getSource();
	            	
	            TipoMovimiento_TSBeanSwingJInternalFrame jInternalFrameParent=(TipoMovimiento_TSBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoMovimiento_TS.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoMovimiento_TSActionPerformed(null);
			}
			
			TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipomovimiento_ts,new Object(),this.tipomovimiento_tsParameterGeneral,this.tipomovimiento_tsReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoMovimiento_TS(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoMovimiento_TS(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoMovimiento_TS(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipomovimiento_ts)) {
			if(!esControlTabla) {
				if(TipoMovimiento_TSJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoMovimiento_TS(this.tipomovimiento_ts,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento_TS(this.tipomovimiento_ts);			
				}
				
				if(this.tipomovimiento_tsSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoMovimiento_TS(this.tipomovimiento_ts,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipomovimiento_tsReturnGeneral=tipomovimiento_tsLogic.procesarEventosTipoMovimiento_TSsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomovimiento_tsLogic.getTipoMovimiento_TSs(),this.tipomovimiento_ts,this.tipomovimiento_tsParameterGeneral,this.isEsNuevoTipoMovimiento_TS,classes);//this.tipomovimiento_tsLogic.getTipoMovimiento_TS()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoMovimiento_TS(this.tipomovimiento_tsReturnGeneral,this.tipomovimiento_tsBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipomovimiento_tsSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoMovimiento_TS(classes,this.tipomovimiento_tsReturnGeneral,this.tipomovimiento_tsBean,false);
					}
						
					if(this.tipomovimiento_tsReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoMovimiento_TS(this.tipomovimiento_tsReturnGeneral.getTipoMovimiento_TS());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoMovimiento_TS(this.tipomovimiento_tsReturnGeneral.getTipoMovimiento_TS());	
					}
						
					if(this.tipomovimiento_tsReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoMovimiento_TS(this.tipomovimiento_tsReturnGeneral.getTipoMovimiento_TS(),classes);//this.tipomovimiento_tsBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoMovimiento_TS(this.tipomovimiento_ts,classes);//this.tipomovimiento_tsBean);									
				}
			
				if(TipoMovimiento_TSJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoMovimiento_TS(this.tipomovimiento_ts,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimiento_TS(this.tipomovimiento_ts);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipomovimiento_tsAnterior!=null) {
						this.tipomovimiento_ts=this.tipomovimiento_tsAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipomovimiento_tsReturnGeneral=tipomovimiento_tsLogic.procesarEventosTipoMovimiento_TSsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomovimiento_tsLogic.getTipoMovimiento_TSs(),this.tipomovimiento_ts,this.tipomovimiento_tsParameterGeneral,this.isEsNuevoTipoMovimiento_TS,classes);//this.tipomovimiento_tsLogic.getTipoMovimiento_TS()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipomovimiento_tsSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipomovimiento_tsReturnGeneral.getTipoMovimiento_TS(),tipomovimiento_tsLogic.getTipoMovimiento_TSs());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipomovimiento_tsReturnGeneral.getTipoMovimiento_TS(),this.tipomovimiento_tss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoMovimiento_TS.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoMovimiento_TS.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoMovimiento_TS();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoMovimiento_TS() throws Exception {
		
		TipoMovimiento_TSModel tipomovimiento_tsModel=(TipoMovimiento_TSModel)this.jTableDatosTipoMovimiento_TS.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipomovimiento_tsModel.tipomovimiento_tss=this.tipomovimiento_tsLogic.getTipoMovimiento_TSs();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipomovimiento_tsModel.tipomovimiento_tss=this.tipomovimiento_tss;
		}
		
		
		((TipoMovimiento_TSModel) this.jTableDatosTipoMovimiento_TS.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoMovimiento_TS() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipomovimiento_tsAnterior(),this.tipomovimiento_tsLogic.getTipoMovimiento_TSs());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipomovimiento_tsAnterior(),this.tipomovimiento_tss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoMovimiento_TS();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoMovimiento_TS(TipoMovimiento_TS tipomovimiento_ts,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
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
										
				TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomovimiento_ts,new Object(),generalEntityParameterGeneral,this.tipomovimiento_tsReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipomovimiento_tsSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoMovimiento_TSConstantesFunciones.getClassesRelationshipsOfTipoMovimiento_TS(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoMovimiento_TSConstantesFunciones.getClassesRelationshipsFromStringsOfTipoMovimiento_TS(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoMovimiento_TS(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoMovimiento_TSBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomovimiento_ts,new Object(),generalEntityParameterGeneral,this.tipomovimiento_tsReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoMovimiento_TS(TipoMovimiento_TSBean tipomovimiento_tsBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoMovimiento_TS(ArrayList<Classe> classes,TipoMovimiento_TSReturnGeneral tipomovimiento_tsReturnGeneral,TipoMovimiento_TSBean tipomovimiento_tsBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoMovimiento_TS(TipoMovimiento_TS tipomovimiento_ts,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipomovimiento_ts)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoMovimiento_TS = new TipoMovimiento_TSDetalleFormJInternalFrame(jDesktopPane,this.tipomovimiento_tsSessionBean.getConGuardarRelaciones(),this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoMovimiento_TS);
		this.jInternalFrameDetalleFormTipoMovimiento_TS.setVisible(false);
		this.jInternalFrameDetalleFormTipoMovimiento_TS.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoMovimiento_TS.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoMovimiento_TS.tipomovimiento_tsLogic=this.tipomovimiento_tsLogic;
		
		this.cargarCombosFrameForeignKeyTipoMovimiento_TS("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoMovimiento_TS();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoMovimiento_TS();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoMovimiento_TS("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoMovimiento_TS();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoMovimiento_TS.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoMovimiento_TS"));
		
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonModificarTipoMovimiento_TS.addActionListener(new ButtonActionListener(this,"ModificarTipoMovimiento_TS"));

		
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonModificarToolBarTipoMovimiento_TS.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoMovimiento_TS"));
					
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jMenuItemModificarTipoMovimiento_TS.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoMovimiento_TS"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonActualizarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"ActualizarTipoMovimiento_TS"));
		
		
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonActualizarToolBarTipoMovimiento_TS.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoMovimiento_TS"));
						
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jMenuItemActualizarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoMovimiento_TS"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonEliminarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"EliminarTipoMovimiento_TS"));
		
		
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonEliminarToolBarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoMovimiento_TS"));
								
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jMenuItemEliminarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoMovimiento_TS"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonCancelarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"CancelarTipoMovimiento_TS"));
		
		
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonCancelarToolBarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoMovimiento_TS"));
					
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jMenuItemCancelarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoMovimiento_TS"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jMenuItemDetalleCerrarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoMovimiento_TS"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonGuardarCambiosToolBarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoMovimiento_TS"));
		
		
		
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonGuardarCambiosToolBarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoMovimiento_TS"));
		
		
		
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jComboBoxTiposAccionesFormularioTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoMovimiento_TS"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonidTipoMovimiento_TSBusqueda.addActionListener(new ButtonActionListener(this,"idTipoMovimiento_TSBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtoncodigoTipoMovimiento_TSBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoMovimiento_TSBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonnombreTipoMovimiento_TSBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoMovimiento_TSBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonid_empresaTipoMovimiento_TSUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoMovimiento_TSUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonid_empresaTipoMovimiento_TSBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoMovimiento_TSBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jTabbedPaneRelacionesTipoMovimiento_TS.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoMovimiento_TS"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoMovimiento_TS"));
		
		if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimiento_TS.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoMovimiento_TS"));
		}
		
		this.jTableDatosTipoMovimiento_TS.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoMovimiento_TS"));
		
		this.jTableDatosTipoMovimiento_TS.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoMovimiento_TS"));
		
		this.jButtonNuevoTipoMovimiento_TS.addActionListener(new ButtonActionListener(this,"NuevoTipoMovimiento_TS"));
		
		this.jButtonDuplicarTipoMovimiento_TS.addActionListener(new ButtonActionListener(this,"DuplicarTipoMovimiento_TS"));
		
		this.jButtonCopiarTipoMovimiento_TS.addActionListener(new ButtonActionListener(this,"CopiarTipoMovimiento_TS"));
		
		this.jButtonVerFormTipoMovimiento_TS.addActionListener(new ButtonActionListener(this,"VerFormTipoMovimiento_TS"));
		
		
		this.jButtonNuevoToolBarTipoMovimiento_TS.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoMovimiento_TS"));
			
		this.jButtonDuplicarToolBarTipoMovimiento_TS.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoMovimiento_TS"));
			
		this.jMenuItemNuevoTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoMovimiento_TS"));
			
		this.jMenuItemDuplicarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoMovimiento_TS"));		
		
		
		this.jButtonNuevoRelacionesTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoMovimiento_TS"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoMovimiento_TS.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoMovimiento_TS"));
			
		this.jMenuItemNuevoRelacionesTipoMovimiento_TS.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoMovimiento_TS"));		
		
		
		if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonModificarTipoMovimiento_TS.addActionListener(new ButtonActionListener(this,"ModificarTipoMovimiento_TS"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonModificarToolBarTipoMovimiento_TS.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoMovimiento_TS"));
			
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jMenuItemModificarTipoMovimiento_TS.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoMovimiento_TS"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonActualizarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"ActualizarTipoMovimiento_TS"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonActualizarToolBarTipoMovimiento_TS.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoMovimiento_TS"));
				
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jMenuItemActualizarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoMovimiento_TS"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonEliminarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"EliminarTipoMovimiento_TS"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonEliminarToolBarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoMovimiento_TS"));
						
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jMenuItemEliminarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoMovimiento_TS"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonCancelarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"CancelarTipoMovimiento_TS"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonCancelarToolBarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoMovimiento_TS"));
			
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jMenuItemCancelarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoMovimiento_TS"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoMovimiento_TS"));		
		
		
		this.jButtonCerrarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"CerrarTipoMovimiento_TS"));
		
		
		this.jButtonCerrarToolBarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoMovimiento_TS"));
			
		this.jMenuItemCerrarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoMovimiento_TS"));
			
		if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jMenuItemDetalleCerrarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoMovimiento_TS"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonGuardarCambiosTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoMovimiento_TS"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonGuardarCambiosToolBarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoMovimiento_TS"));
		}
		
		this.jButtonCopiarToolBarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoMovimiento_TS"));
			
		this.jButtonVerFormToolBarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoMovimiento_TS"));
		
		this.jMenuItemGuardarCambiosTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoMovimiento_TS"));
			
		this.jMenuItemCopiarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoMovimiento_TS"));		
		
		this.jMenuItemVerFormTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoMovimiento_TS"));		
		
		
		this.jButtonGuardarCambiosTablaTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoMovimiento_TS"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoMovimiento_TS"));
			
		this.jMenuItemGuardarCambiosTablaTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoMovimiento_TS"));		
		
		
		
		this.jButtonRecargarInformacionTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoMovimiento_TS"));
					
		this.jButtonRecargarInformacionToolBarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoMovimiento_TS"));
		
		this.jMenuItemRecargarInformacionTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoMovimiento_TS"));		
		
		
		
		this.jButtonAnterioresTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"AnterioresTipoMovimiento_TS"));
		
		
		this.jButtonAnterioresToolBarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoMovimiento_TS"));
		
		this.jMenuItemAnterioresTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoMovimiento_TS"));		
		
		
		this.jButtonSiguientesTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"SiguientesTipoMovimiento_TS"));
		
		
		this.jButtonSiguientesToolBarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoMovimiento_TS"));
			
		this.jMenuItemSiguientesTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoMovimiento_TS"));
			
		this.jMenuItemAbrirOrderByTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoMovimiento_TS"));
			
		this.jMenuItemMostrarOcultarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoMovimiento_TS"));
			
		this.jMenuItemDetalleAbrirOrderByTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoMovimiento_TS"));
			
		this.jMenuItemDetalleMostarOcultarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoMovimiento_TS"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoMovimiento_TS"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoMovimiento_TS"));
			
		this.jMenuItemNuevoGuardarCambiosTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoMovimiento_TS"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoMovimiento_TS.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoMovimiento_TS"));

		this.jCheckBoxSeleccionadosTipoMovimiento_TS.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoMovimiento_TS"));
		
		if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jComboBoxTiposAccionesFormularioTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoMovimiento_TS"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoMovimiento_TS"));
			
		this.jComboBoxTiposAccionesTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoMovimiento_TS"));
					
		this.jComboBoxTiposSeleccionarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoMovimiento_TS"));
			
		this.jTextFieldValorCampoGeneralTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoMovimiento_TS"));		
		
		
		if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonidTipoMovimiento_TSBusqueda.addActionListener(new ButtonActionListener(this,"idTipoMovimiento_TSBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtoncodigoTipoMovimiento_TSBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoMovimiento_TSBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonnombreTipoMovimiento_TSBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoMovimiento_TSBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonid_empresaTipoMovimiento_TSUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoMovimiento_TSUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonid_empresaTipoMovimiento_TSBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoMovimiento_TSBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoMovimiento_TS!=null) {
				this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoMovimiento_TS"));
				this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoMovimiento_TS"));
				this.jInternalFrameReporteDinamicoTipoMovimiento_TS.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoMovimiento_TS"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoMovimiento_TS"));				
			//this.jButtonGenerarReporteDinamicoTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoMovimiento_TS"));
			//this.jButtonGenerarExcelReporteDinamicoTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoMovimiento_TS"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoMovimiento_TS!=null) {
				this.jInternalFrameImportacionTipoMovimiento_TS.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoMovimiento_TS"));
				this.jInternalFrameImportacionTipoMovimiento_TS.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoMovimiento_TS"));
				this.jInternalFrameImportacionTipoMovimiento_TS.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoMovimiento_TS"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoMovimiento_TS"));
			
			this.jButtonAbrirOrderByToolBarTipoMovimiento_TS.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoMovimiento_TS"));			
			
			if(this.jInternalFrameOrderByTipoMovimiento_TS!=null) {
				this.jInternalFrameOrderByTipoMovimiento_TS.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoMovimiento_TS"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimiento_TS.jTabbedPaneRelacionesTipoMovimiento_TS.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoMovimiento_TS"));
		
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
            		closingInternalFrameTipoMovimiento_TS();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoMovimiento_TS.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoMovimiento_TS = (JInternalFrameBase)event.getSource();
	            	
	            TipoMovimiento_TSBeanSwingJInternalFrame jInternalFrameParent=(TipoMovimiento_TSBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoMovimiento_TS.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoMovimiento_TSActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoMovimiento_TS.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoMovimiento_TSListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoMovimiento_TS.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoMovimiento_TS.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMovimiento_TSActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMovimiento_TSActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMovimiento_TSActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoMovimiento_TS";
		inputMap = this.jButtonNuevoTipoMovimiento_TS.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoMovimiento_TS.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoMovimiento_TSActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMovimiento_TSActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMovimiento_TSActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMovimiento_TSActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoMovimiento_TS";
		inputMap = this.jButtonNuevoRelacionesTipoMovimiento_TS.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoMovimiento_TS.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoMovimiento_TSActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoMovimiento_TS";
		inputMap = this.jButtonModificarTipoMovimiento_TS.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoMovimiento_TS.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoMovimiento_TSActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoMovimiento_TS";
		inputMap = this.jButtonActualizarTipoMovimiento_TS.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoMovimiento_TS.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoMovimiento_TSActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoMovimiento_TS";
		inputMap = this.jButtonEliminarTipoMovimiento_TS.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoMovimiento_TS.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoMovimiento_TSActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoMovimiento_TS";
		inputMap = this.jButtonCancelarTipoMovimiento_TS.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoMovimiento_TS.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoMovimiento_TSActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoMovimiento_TS";
		inputMap = this.jButtonCerrarTipoMovimiento_TS.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoMovimiento_TS.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoMovimiento_TSActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonGuardarCambiosTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoMovimiento_TS";
		inputMap = this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonGuardarCambiosTipoMovimiento_TS.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonGuardarCambiosTipoMovimiento_TS.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoMovimiento_TSActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoMovimiento_TS.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoMovimiento_TSItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoMovimiento_TS.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoMovimiento_TSActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoMovimiento_TS.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoMovimiento_TSActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoMovimiento_TS.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoMovimiento_TSActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonidTipoMovimiento_TSBusqueda.addActionListener(new ButtonActionListener(this,"idTipoMovimiento_TSBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtoncodigoTipoMovimiento_TSBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoMovimiento_TSBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonnombreTipoMovimiento_TSBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoMovimiento_TSBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonid_empresaTipoMovimiento_TSUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoMovimiento_TSUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jButtonid_empresaTipoMovimiento_TSBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoMovimiento_TSBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoMovimiento_TS.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoMovimiento_TSActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoMovimiento_TSActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoMovimiento_TS.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoMovimiento_TS(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoMovimiento_TS tipomovimiento_tsAux:this.tipomovimiento_tsLogic.getTipoMovimiento_TSs()) {
					tipomovimiento_tsAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMovimiento_TS tipomovimiento_tsAux:tipomovimiento_tss) {
					tipomovimiento_tsAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoMovimiento_TSItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoMovimiento_TS(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoMovimiento_TS tipomovimiento_tsAux:this.tipomovimiento_tsLogic.getTipoMovimiento_TSs()) {
						tipomovimiento_tsAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoMovimiento_TS tipomovimiento_tsAux:tipomovimiento_tss) {
						tipomovimiento_tsAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoMovimiento_TS tipomovimiento_tsAux:this.tipomovimiento_tsLogic.getTipoMovimiento_TSs()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoMovimiento_TS tipomovimiento_tsAux:tipomovimiento_tss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoMovimiento_TS(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoMovimiento_TS.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoMovimiento_TS.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoMovimiento_TS,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoMovimiento_TSItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoMovimiento_TS(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoMovimiento_TS.getSelectedRows();
			
			TipoMovimiento_TS tipomovimiento_tsLocal=new TipoMovimiento_TS();
			
			//this.seleccionarTodosTipoMovimiento_TS(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomovimiento_tsLocal =(TipoMovimiento_TS) this.tipomovimiento_tsLogic.getTipoMovimiento_TSs().toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipomovimiento_tsLocal =(TipoMovimiento_TS) this.tipomovimiento_tss.toArray()[this.jTableDatosTipoMovimiento_TS.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipomovimiento_tsLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoMovimiento_TS tipomovimiento_tsAux:this.tipomovimiento_tsLogic.getTipoMovimiento_TSs()) {
						tipomovimiento_tsAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoMovimiento_TS tipomovimiento_tsAux:tipomovimiento_tss) {
						tipomovimiento_tsAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoMovimiento_TS(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoMovimiento_TS.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoMovimiento_TS.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoMovimiento_TS,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoMovimiento_TSItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoMovimiento_TSParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoMovimiento_TSActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoMovimiento_TS(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoMovimiento_TS.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoMovimiento_TS tipomovimiento_tsAux:this.tipomovimiento_tsLogic.getTipoMovimiento_TSs()) {
				
						if(sTipoSeleccionar.equals(TipoMovimiento_TSConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipomovimiento_tsAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoMovimiento_TSConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipomovimiento_tsAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMovimiento_TS tipomovimiento_tsAux:tipomovimiento_tss) {
					
						if(sTipoSeleccionar.equals(TipoMovimiento_TSConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipomovimiento_tsAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoMovimiento_TSConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipomovimiento_tsAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoMovimiento_TS(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoMovimiento_TSActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoMovimiento_TS(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoMovimiento_TS=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoMovimiento_TS.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoMovimiento_TS.jComboBoxTiposAccionesFormularioTipoMovimiento_TS.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoMovimiento_TS) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoMovimiento_TS(conSplash);
				
					this.generarReporteTipoMovimiento_TSsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMovimiento_TS.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMovimiento_TS.jComboBoxTiposAccionesFormularioTipoMovimiento_TS.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoMovimiento_TSsSeleccionados();
				//this.jComboBoxTiposAccionesTipoMovimiento_TS.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoMovimiento_TSsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoMovimiento_TS.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoMovimiento_TSsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoMovimiento_TS.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoMovimiento_TS();
				
				this.exportarTipoMovimiento_TSsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMovimiento_TS.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMovimiento_TS.jComboBoxTiposAccionesFormularioTipoMovimiento_TS.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoMovimiento_TSs();
				//this.importarTipoMovimiento_TSs();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMovimiento_TS.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMovimiento_TS.jComboBoxTiposAccionesFormularioTipoMovimiento_TS.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoMovimiento_TS();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoMovimiento_TSsSeleccionados();
				//this.jComboBoxTiposAccionesTipoMovimiento_TS.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Movimiento_ T S", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoMovimiento_TS();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoMovimiento_TS)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoMovimiento_TS(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Movimiento_ T S",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMovimiento_TS.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMovimiento_TS.jComboBoxTiposAccionesFormularioTipoMovimiento_TS.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoMovimiento_TSBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoMovimiento_TS) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoMovimiento_TS(conSplash);
					
						//this.actualizarParametrosGeneralTipoMovimiento_TS();
						
						this.generarReporteProcesoAccionTipoMovimiento_TSsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoMovimiento_TS.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoMovimiento_TS.jComboBoxTiposAccionesFormularioTipoMovimiento_TS.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoMovimiento_TSBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Movimiento_ T SES SELECCIONADOS?", "MANTENIMIENTO DE Tipo Movimiento_ T S", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoMovimiento_TS();
				
						this.actualizarParametrosGeneralTipoMovimiento_TS();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipomovimiento_tsReturnGeneral=tipomovimiento_tsLogic.procesarAccionTipoMovimiento_TSsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipomovimiento_tsLogic.getTipoMovimiento_TSs(),this.tipomovimiento_tsParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoMovimiento_TSReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoMovimiento_TS.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoMovimiento_TS.jComboBoxTiposAccionesFormularioTipoMovimiento_TS.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoMovimiento_TS();
					
					TipoMovimiento_TSBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoMovimiento_TSReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoMovimiento_TS.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoMovimiento_TS.jComboBoxTiposAccionesFormularioTipoMovimiento_TS.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoMovimiento_TS(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoMovimiento_TSActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoMovimiento_TS();
			
			if(this.jInternalFrameDetalleFormTipoMovimiento_TS==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoMovimiento_TS> tipomovimiento_tssSeleccionados=new ArrayList<TipoMovimiento_TS>();		
			TipoMovimiento_TS tipomovimiento_ts=new TipoMovimiento_TS();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoMovimiento_TS(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoMovimiento_TS.getSelectedItem();
			
			
			
			
			tipomovimiento_tssSeleccionados=this.getTipoMovimiento_TSsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipomovimiento_tssSeleccionados.size()==1) {
				for(TipoMovimiento_TS tipomovimiento_tsAux:tipomovimiento_tssSeleccionados) {
					tipomovimiento_ts=tipomovimiento_tsAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoMovimiento_TS();
			
      		//this.finishProcessTipoMovimiento_TS(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoMovimiento_TSReturnGeneral() throws Exception {
		if(this.tipomovimiento_tsReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipomovimiento_tsReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipomovimiento_tsReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipomovimiento_tsReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipomovimiento_tsReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipomovimiento_tsReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoMovimiento_TS(false);
		}
		
		if(this.tipomovimiento_tsReturnGeneral.getConRetornoLista() || this.tipomovimiento_tsReturnGeneral.getConRetornoObjeto()) {
			if(this.tipomovimiento_tsReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipomovimiento_tsLogic.setTipoMovimiento_TSs(this.tipomovimiento_tsReturnGeneral.getTipoMovimiento_TSs());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipomovimiento_tsReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipomovimiento_tsLogic.setTipoMovimiento_TS(this.tipomovimiento_tsReturnGeneral.getTipoMovimiento_TS());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoMovimiento_TS(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoMovimiento_TS() throws Exception {
		
		
	}
	
	public ArrayList<TipoMovimiento_TS> getTipoMovimiento_TSsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoMovimiento_TS> tipomovimiento_tssSeleccionados=new ArrayList<TipoMovimiento_TS>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoMovimiento_TS) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoMovimiento_TS tipomovimiento_tsAux:tipomovimiento_tsLogic.getTipoMovimiento_TSs()) {
					if(tipomovimiento_tsAux.getIsSelected()) {
						tipomovimiento_tssSeleccionados.add(tipomovimiento_tsAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMovimiento_TS tipomovimiento_tsAux:this.tipomovimiento_tss) {
					if(tipomovimiento_tsAux.getIsSelected()) {
						tipomovimiento_tssSeleccionados.add(tipomovimiento_tsAux);				
					}
				}
			}
			
			if(tipomovimiento_tssSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipomovimiento_tssSeleccionados.addAll(this.tipomovimiento_tsLogic.getTipoMovimiento_TSs());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipomovimiento_tssSeleccionados.addAll(this.tipomovimiento_tss);				
					}
				}
			}
		} else {
			tipomovimiento_tssSeleccionados.add(this.tipomovimiento_ts);
		}
		
		return tipomovimiento_tssSeleccionados;
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
	
	public void generarReporteTipoMovimiento_TSsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoMovimiento_TSsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoMovimiento_TSsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoMovimiento_TSsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoMovimiento_TSsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Movimiento_ T S",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoMovimiento_TSsSeleccionados() throws Exception {
		ArrayList<TipoMovimiento_TS> tipomovimiento_tssSeleccionados=new ArrayList<TipoMovimiento_TS>();		
		
		tipomovimiento_tssSeleccionados=this.getTipoMovimiento_TSsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoMovimiento_TSs("Todos",tipomovimiento_tssSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoMovimiento_TSsSeleccionados() throws Exception {
		ArrayList<TipoMovimiento_TS> tipomovimiento_tssSeleccionados=new ArrayList<TipoMovimiento_TS>();		
		
		tipomovimiento_tssSeleccionados=this.getTipoMovimiento_TSsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoMovimiento_TSs("Todos",tipomovimiento_tssSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoMovimiento_TSsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoMovimiento_TS> tipomovimiento_tssSeleccionados=new ArrayList<TipoMovimiento_TS>();
		
		tipomovimiento_tssSeleccionados=this.getTipoMovimiento_TSsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoMovimiento_TSs("Todos",tipomovimiento_tssSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoMovimiento_TSsSeleccionados() throws Exception {
		ArrayList<TipoMovimiento_TS> tipomovimiento_tssSeleccionados=new ArrayList<TipoMovimiento_TS>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoMovimiento_TS();
		
		
		tipomovimiento_tssSeleccionados=this.getTipoMovimiento_TSsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoMovimiento_TS();
		
		
		//this.generarReporteTipoMovimiento_TSs("Todos",tipomovimiento_tssSeleccionados ,tipomovimiento_tsImplementable,tipomovimiento_tsImplementableHome);
	}
	
	public void mostrarImportacionTipoMovimiento_TSs() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoMovimiento_TS();
		
		this.abrirFrameImportacionTipoMovimiento_TS();		
		
			
		//this.generarReporteTipoMovimiento_TSs("Todos",tipomovimiento_tssSeleccionados ,tipomovimiento_tsImplementable,tipomovimiento_tsImplementableHome);
	}
	
	public void importarTipoMovimiento_TSs() throws Exception {		
	
	}
	
	public void exportarTipoMovimiento_TSsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoMovimiento_TSsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoMovimiento_TSsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoMovimiento_TSsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Movimiento_ T S",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoMovimiento_TSsSeleccionados() throws Exception {
		ArrayList<TipoMovimiento_TS> tipomovimiento_tssSeleccionados=new ArrayList<TipoMovimiento_TS>();		
		
		tipomovimiento_tssSeleccionados=this.getTipoMovimiento_TSsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomovimiento_ts."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoMovimiento_TS(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoMovimiento_TS tipomovimiento_tsAux:tipomovimiento_tssSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoMovimiento_TS(tipomovimiento_tsAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipomovimiento_tsAux.setsDetalleGeneralEntityReporte(tipomovimiento_tsAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movimiento_ T S",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoMovimiento_TS(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoMovimiento_TSConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMovimiento_TSConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMovimiento_TSConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMovimiento_TSConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMovimiento_TSConstantesFunciones.LABEL_IDEMPRESA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoMovimiento_TS(TipoMovimiento_TS tipomovimiento_ts,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipomovimiento_ts.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomovimiento_ts.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomovimiento_ts.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomovimiento_ts.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomovimiento_ts.getempresa_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoMovimiento_TSsSeleccionados() throws Exception {
		ArrayList<TipoMovimiento_TS> tipomovimiento_tssSeleccionados=new ArrayList<TipoMovimiento_TS>();		
		
		tipomovimiento_tssSeleccionados=this.getTipoMovimiento_TSsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomovimiento_ts.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoMovimiento_TSs");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoMovimiento_TS(row);				
				iRow++;
			}				
			
			for(TipoMovimiento_TS tipomovimiento_tsAux:tipomovimiento_tssSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoMovimiento_TS(tipomovimiento_tsAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movimiento_ T S",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoMovimiento_TSsSeleccionados() throws Exception {
		ArrayList<TipoMovimiento_TS> tipomovimiento_tssSeleccionados=new ArrayList<TipoMovimiento_TS>();		
		
		tipomovimiento_tssSeleccionados=this.getTipoMovimiento_TSsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomovimiento_ts.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipomovimiento_tss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipomovimiento_ts");
			//elementRoot.appendChild(element);
		
			for(TipoMovimiento_TS tipomovimiento_tsAux:tipomovimiento_tssSeleccionados) {
				element = document.createElement("tipomovimiento_ts");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoMovimiento_TS(tipomovimiento_tsAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movimiento_ T S",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoMovimiento_TS(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMovimiento_TSConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMovimiento_TSConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoMovimiento_TSConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMovimiento_TSConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMovimiento_TSConstantesFunciones.LABEL_IDEMPRESA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoMovimiento_TS(TipoMovimiento_TS tipomovimiento_ts,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipomovimiento_ts.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomovimiento_ts.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomovimiento_ts.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomovimiento_ts.getempresa_descripcion());				
	}
	
	public void setFilaDatosExportarXmlTipoMovimiento_TS(TipoMovimiento_TS tipomovimiento_ts,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoMovimiento_TSConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipomovimiento_ts.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoMovimiento_TSConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipomovimiento_ts.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoMovimiento_TSConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipomovimiento_ts.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoMovimiento_TSConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipomovimiento_ts.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementempresa_descripcion = document.createElement(TipoMovimiento_TSConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipomovimiento_ts.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);
	}
	
	public void generarReporteGroupGenericoTipoMovimiento_TSsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoMovimiento_TS> tipomovimiento_tssSeleccionados=new ArrayList<TipoMovimiento_TS>();
		
		tipomovimiento_tssSeleccionados=this.getTipoMovimiento_TSsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoMovimiento_TS(tipomovimiento_tssSeleccionados);
		
		this.generarReporteTipoMovimiento_TSs("Todos",tipomovimiento_tssSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoMovimiento_TS(ArrayList<TipoMovimiento_TS> tipomovimiento_tssSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoMovimiento_TS tipomovimiento_tsAux:tipomovimiento_tssSeleccionados) {
				tipomovimiento_tsAux.setsDetalleGeneralEntityReporte(tipomovimiento_tsAux.toString());
			
				if(sTipoSeleccionar.equals(TipoMovimiento_TSConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipomovimiento_tsAux.setsDescripcionGeneralEntityReporte1(tipomovimiento_tsAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoMovimiento_TSConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipomovimiento_tsAux.setsDescripcionGeneralEntityReporte1(tipomovimiento_tsAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoMovimiento_TSConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipomovimiento_tsAux.setsDescripcionGeneralEntityReporte1(tipomovimiento_tsAux.getempresa_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimiento_TSConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoMovimiento_TS(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoMovimiento_TS=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento_TS=true;
				this.isVisibilidadCeldaGuardarCambiosTipoMovimiento_TS=true;
			}
			
			this.isVisibilidadCeldaModificarTipoMovimiento_TS=false;
			this.isVisibilidadCeldaActualizarTipoMovimiento_TS=false;
			this.isVisibilidadCeldaEliminarTipoMovimiento_TS=false;
			this.isVisibilidadCeldaCancelarTipoMovimiento_TS=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMovimiento_TS=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMovimiento_TS=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoMovimiento_TS=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento_TS=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMovimiento_TS=false;
			this.isVisibilidadCeldaModificarTipoMovimiento_TS=false;
			this.isVisibilidadCeldaActualizarTipoMovimiento_TS=true;
			this.isVisibilidadCeldaEliminarTipoMovimiento_TS=false;
			this.isVisibilidadCeldaCancelarTipoMovimiento_TS=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMovimiento_TS=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMovimiento_TS=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoMovimiento_TS=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento_TS=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMovimiento_TS=false;
			this.isVisibilidadCeldaModificarTipoMovimiento_TS=false;
			this.isVisibilidadCeldaActualizarTipoMovimiento_TS=true;
			this.isVisibilidadCeldaEliminarTipoMovimiento_TS=true;
			this.isVisibilidadCeldaCancelarTipoMovimiento_TS=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMovimiento_TS=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMovimiento_TS=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoMovimiento_TS=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento_TS=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMovimiento_TS=false;
			this.isVisibilidadCeldaModificarTipoMovimiento_TS=false;
			this.isVisibilidadCeldaActualizarTipoMovimiento_TS=true;
			this.isVisibilidadCeldaEliminarTipoMovimiento_TS=false;
			this.isVisibilidadCeldaCancelarTipoMovimiento_TS=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMovimiento_TS=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoMovimiento_TS=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoMovimiento_TS=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento_TS=true;
			this.isVisibilidadCeldaGuardarCambiosTipoMovimiento_TS=true;
			this.isVisibilidadCeldaModificarTipoMovimiento_TS=false;
			this.isVisibilidadCeldaActualizarTipoMovimiento_TS=false;
			this.isVisibilidadCeldaEliminarTipoMovimiento_TS=false;
			this.isVisibilidadCeldaCancelarTipoMovimiento_TS=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMovimiento_TS=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMovimiento_TS=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoMovimiento_TS=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento_TS=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMovimiento_TS=false;
			this.isVisibilidadCeldaActualizarTipoMovimiento_TS=false;
			this.isVisibilidadCeldaEliminarTipoMovimiento_TS=false;
			this.isVisibilidadCeldaCancelarTipoMovimiento_TS=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMovimiento_TS=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoMovimiento_TS=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoMovimiento_TS=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento_TS=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMovimiento_TS=false;
			this.isVisibilidadCeldaModificarTipoMovimiento_TS=true;
			this.isVisibilidadCeldaActualizarTipoMovimiento_TS=false;
			this.isVisibilidadCeldaEliminarTipoMovimiento_TS=false;
			this.isVisibilidadCeldaCancelarTipoMovimiento_TS=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMovimiento_TS=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoMovimiento_TS=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoMovimiento_TSJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoMovimiento_TS=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento_TS=true;
			this.isVisibilidadCeldaGuardarCambiosTipoMovimiento_TS=true;
		} else {
			this.actualizarEstadoPanelsTipoMovimiento_TS(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoMovimiento_TS=false;
			//this.isVisibilidadCeldaVerFormTipoMovimiento_TS=false;
			this.isVisibilidadCeldaDuplicarTipoMovimiento_TS=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipomovimiento_tsSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento_TS=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoMovimiento_TS=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMovimiento_TS=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {
			if(!tipomovimiento_tsSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento_TS=false;												
			}
			
			this.jButtonCerrarTipoMovimiento_TS.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimiento_TS=false;
		}
		
		if(!this.permiteMantenimiento(this.tipomovimiento_ts)) {
			this.isVisibilidadCeldaActualizarTipoMovimiento_TS=false;
			this.isVisibilidadCeldaEliminarTipoMovimiento_TS=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoMovimiento_TS() {
	}
	
	public void actualizarEstadoPanelsTipoMovimiento_TS(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoMovimiento_TS!=null) {
				this.jScrollPanelDatosEdicionTipoMovimiento_TS.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMovimiento_TS!=null) {
				this.jTabbedPaneBusquedasTipoMovimiento_TS.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMovimiento_TS!=null) {
				this.jScrollPanelDatosTipoMovimiento_TS.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMovimiento_TS!=null) {
				this.jPanelPaginacionTipoMovimiento_TS.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMovimiento_TS!=null) {
				this.jPanelParametrosReportesTipoMovimiento_TS.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoMovimiento_TS!=null) {
				this.jScrollPanelDatosEdicionTipoMovimiento_TS.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMovimiento_TS!=null) {
				this.jTabbedPaneBusquedasTipoMovimiento_TS.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoMovimiento_TS!=null) {
				this.jScrollPanelDatosTipoMovimiento_TS.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoMovimiento_TS!=null) {
				this.jPanelPaginacionTipoMovimiento_TS.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoMovimiento_TS!=null) {
				this.jPanelParametrosReportesTipoMovimiento_TS.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoMovimiento_TS!=null) {
				this.jScrollPanelDatosEdicionTipoMovimiento_TS.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMovimiento_TS!=null) {
				this.jTabbedPaneBusquedasTipoMovimiento_TS.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoMovimiento_TS!=null) {
				this.jScrollPanelDatosTipoMovimiento_TS.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoMovimiento_TS!=null) {
				this.jPanelPaginacionTipoMovimiento_TS.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoMovimiento_TS!=null) {
				this.jPanelParametrosReportesTipoMovimiento_TS.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoMovimiento_TS!=null) {
				this.jScrollPanelDatosEdicionTipoMovimiento_TS.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMovimiento_TS!=null) {
				this.jTabbedPaneBusquedasTipoMovimiento_TS.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoMovimiento_TS!=null) {
				this.jScrollPanelDatosTipoMovimiento_TS.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoMovimiento_TS!=null) {
				this.jPanelPaginacionTipoMovimiento_TS.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoMovimiento_TS!=null) {
				this.jPanelParametrosReportesTipoMovimiento_TS.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoMovimiento_TS!=null) {
				this.jScrollPanelDatosEdicionTipoMovimiento_TS.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMovimiento_TS!=null) {
				this.jTabbedPaneBusquedasTipoMovimiento_TS.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMovimiento_TS!=null) {
				this.jScrollPanelDatosTipoMovimiento_TS.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMovimiento_TS!=null) {
				this.jPanelPaginacionTipoMovimiento_TS.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMovimiento_TS!=null) {
				this.jPanelParametrosReportesTipoMovimiento_TS.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoMovimiento_TS!=null) {
				this.jScrollPanelDatosEdicionTipoMovimiento_TS.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMovimiento_TS!=null) {
				this.jTabbedPaneBusquedasTipoMovimiento_TS.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMovimiento_TS!=null) {
				this.jScrollPanelDatosTipoMovimiento_TS.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMovimiento_TS!=null) {
				this.jPanelPaginacionTipoMovimiento_TS.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMovimiento_TS!=null) {
				this.jPanelParametrosReportesTipoMovimiento_TS.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoMovimiento_TS!=null) {
				this.jScrollPanelDatosEdicionTipoMovimiento_TS.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMovimiento_TS!=null) {
				this.jTabbedPaneBusquedasTipoMovimiento_TS.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMovimiento_TS!=null) {
				this.jScrollPanelDatosTipoMovimiento_TS.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMovimiento_TS!=null) {
				this.jPanelPaginacionTipoMovimiento_TS.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMovimiento_TS!=null) {
				this.jPanelParametrosReportesTipoMovimiento_TS.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoMovimiento_TS!=null) {
					this.jTabbedPaneBusquedasTipoMovimiento_TS.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoMovimiento_TS!=null) {
				this.jPanelParametrosReportesTipoMovimiento_TS.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMovimiento_TS!=null) {
				this.jTabbedPaneBusquedasTipoMovimiento_TS.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoMovimiento_TS!=null) {
				this.jPanelParametrosReportesTipoMovimiento_TS.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoMovimiento_TSSessionBean tipomovimiento_tsSessionBean=new TipoMovimiento_TSSessionBean();
		
		if(this.tipomovimiento_tsSessionBean==null) {
			this.tipomovimiento_tsSessionBean=new TipoMovimiento_TSSessionBean();
		}
		
		this.tipomovimiento_tsSessionBean.setsUltimaBusquedaTipoMovimiento_TS(this.getsAccionBusqueda());
		this.tipomovimiento_tsSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipomovimiento_tsSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipomovimiento_tsSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoMovimiento_TSSessionBean tipomovimiento_tsSessionBean=new TipoMovimiento_TSSessionBean();
		
		if(this.tipomovimiento_tsSessionBean==null) {
			this.tipomovimiento_tsSessionBean=new TipoMovimiento_TSSessionBean();
		}
		
		if(this.tipomovimiento_tsSessionBean.getsUltimaBusquedaTipoMovimiento_TS()!=null&&!this.tipomovimiento_tsSessionBean.getsUltimaBusquedaTipoMovimiento_TS().equals("")) {
			this.setsAccionBusqueda(tipomovimiento_tsSessionBean.getsUltimaBusquedaTipoMovimiento_TS());
			this.setiNumeroPaginacion(tipomovimiento_tsSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipomovimiento_tsSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipomovimiento_tsSessionBean.getid_empresa());
				tipomovimiento_tsSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipomovimiento_tsSessionBean.setsUltimaBusquedaTipoMovimiento_TS("");
		this.tipomovimiento_tsSessionBean.setiNumeroPaginacion(TipoMovimiento_TSConstantesFunciones.INUMEROPAGINACION);
		this.tipomovimiento_tsSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoMovimiento_TS(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoMovimiento_TS() {
		this.updateBorderResaltarBusquedasFormularioTipoMovimiento_TS();
		this.updateVisibilidadBusquedasFormularioTipoMovimiento_TS();
		this.updateHabilitarBusquedasFormularioTipoMovimiento_TS();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoMovimiento_TS() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoMovimiento_TS.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoMovimiento_TS() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoMovimiento_TS.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoMovimiento_TS() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoMovimiento_TS.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoMovimiento_TS(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoMovimiento_TS.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoMovimiento_TS() throws Exception {

		if(this.jInternalFrameDetalleFormTipoMovimiento_TS==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoMovimiento_TS();
		this.updateVisibilidadResaltarControlesFormularioTipoMovimiento_TS();
		this.updateHabilitarResaltarControlesFormularioTipoMovimiento_TS();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoMovimiento_TS() throws Exception {
		if(this.jInternalFrameDetalleFormTipoMovimiento_TS==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipomovimiento_tsConstantesFunciones.resaltaridTipoMovimiento_TS!=null && this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) {this.jInternalFrameDetalleFormTipoMovimiento_TS.jLabelidTipoMovimiento_TS.setBorder(this.tipomovimiento_tsConstantesFunciones.resaltaridTipoMovimiento_TS);}
		if(this.tipomovimiento_tsConstantesFunciones.resaltarcodigoTipoMovimiento_TS!=null && this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) {this.jInternalFrameDetalleFormTipoMovimiento_TS.jTextFieldcodigoTipoMovimiento_TS.setBorder(this.tipomovimiento_tsConstantesFunciones.resaltarcodigoTipoMovimiento_TS);}
		if(this.tipomovimiento_tsConstantesFunciones.resaltarnombreTipoMovimiento_TS!=null && this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) {this.jInternalFrameDetalleFormTipoMovimiento_TS.jTextAreanombreTipoMovimiento_TS.setBorder(this.tipomovimiento_tsConstantesFunciones.resaltarnombreTipoMovimiento_TS);}
		if(this.tipomovimiento_tsConstantesFunciones.resaltarid_empresaTipoMovimiento_TS!=null && this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) {this.jInternalFrameDetalleFormTipoMovimiento_TS.jComboBoxid_empresaTipoMovimiento_TS.setBorder(this.tipomovimiento_tsConstantesFunciones.resaltarid_empresaTipoMovimiento_TS);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoMovimiento_TS() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoMovimiento_TS==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) {
	
		//this.jInternalFrameDetalleFormTipoMovimiento_TS.jLabelidTipoMovimiento_TS.setVisible(this.tipomovimiento_tsConstantesFunciones.mostraridTipoMovimiento_TS);
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jPanelidTipoMovimiento_TS.setVisible(this.tipomovimiento_tsConstantesFunciones.mostraridTipoMovimiento_TS);
		//this.jInternalFrameDetalleFormTipoMovimiento_TS.jTextFieldcodigoTipoMovimiento_TS.setVisible(this.tipomovimiento_tsConstantesFunciones.mostrarcodigoTipoMovimiento_TS);
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jPanelcodigoTipoMovimiento_TS.setVisible(this.tipomovimiento_tsConstantesFunciones.mostrarcodigoTipoMovimiento_TS);
		//this.jInternalFrameDetalleFormTipoMovimiento_TS.jTextAreanombreTipoMovimiento_TS.setVisible(this.tipomovimiento_tsConstantesFunciones.mostrarnombreTipoMovimiento_TS);
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jPanelnombreTipoMovimiento_TS.setVisible(this.tipomovimiento_tsConstantesFunciones.mostrarnombreTipoMovimiento_TS);
		//this.jInternalFrameDetalleFormTipoMovimiento_TS.jComboBoxid_empresaTipoMovimiento_TS.setVisible(this.tipomovimiento_tsConstantesFunciones.mostrarid_empresaTipoMovimiento_TS);
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jPanelid_empresaTipoMovimiento_TS.setVisible(this.tipomovimiento_tsConstantesFunciones.mostrarid_empresaTipoMovimiento_TS);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoMovimiento_TS() throws Exception {
		if(this.jInternalFrameDetalleFormTipoMovimiento_TS==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoMovimiento_TS!=null) {
	
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jLabelidTipoMovimiento_TS.setEnabled(this.tipomovimiento_tsConstantesFunciones.activaridTipoMovimiento_TS);
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jTextFieldcodigoTipoMovimiento_TS.setEnabled(this.tipomovimiento_tsConstantesFunciones.activarcodigoTipoMovimiento_TS);
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jTextAreanombreTipoMovimiento_TS.setEnabled(this.tipomovimiento_tsConstantesFunciones.activarnombreTipoMovimiento_TS);
		this.jInternalFrameDetalleFormTipoMovimiento_TS.jComboBoxid_empresaTipoMovimiento_TS.setEnabled(this.tipomovimiento_tsConstantesFunciones.activarid_empresaTipoMovimiento_TS);
		}
	}
	
		
}