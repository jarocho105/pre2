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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.cartera.util.ControlProveedoresConstantesFunciones;
import com.bydan.erp.cartera.util.report.ControlProveedoresParameterReturnGeneral;
//import com.bydan.erp.cartera.util.report.ControlProveedoresParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.report.ControlProveedoresBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.cartera.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.cartera.util.*;

import com.bydan.erp.cartera.util.report.*;
import com.bydan.erp.cartera.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.business.entity.report.*;
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

//import org.hibernate.collection.PersistentBag;

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
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;

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
public class ControlProveedoresBeanSwingJInternalFrame extends ControlProveedoresJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ControlProveedoresBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ControlProveedores> controlproveedoresValidator = new ClassValidator<ControlProveedores>(ControlProveedores.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ControlProveedores controlproveedores;	
	public ControlProveedores controlproveedoresAux;
	public ControlProveedores controlproveedoresAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ControlProveedores controlproveedoresTotales;
	public Long idControlProveedoresActual;
	public Long iIdNuevoControlProveedores=0L;
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
	
	public Boolean isPermisoTodoControlProveedores;
	public Boolean isPermisoNuevoControlProveedores;
	public Boolean isPermisoActualizarControlProveedores;
	public Boolean isPermisoActualizarOriginalControlProveedores;
	public Boolean isPermisoEliminarControlProveedores;
	public Boolean isPermisoGuardarCambiosControlProveedores;
	public Boolean isPermisoConsultaControlProveedores;
	public Boolean isPermisoBusquedaControlProveedores;
	public Boolean isPermisoReporteControlProveedores;
	public Boolean isPermisoPaginacionMedioControlProveedores;
	public Boolean isPermisoPaginacionAltoControlProveedores;
	public Boolean isPermisoPaginacionTodoControlProveedores;
	public Boolean isPermisoCopiarControlProveedores;
	public Boolean isPermisoVerFormControlProveedores;
	public Boolean isPermisoDuplicarControlProveedores;
	public Boolean isPermisoOrdenControlProveedores;
	
	
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
	
	public ControlProveedoresParameterReturnGeneral controlproveedoresReturnGeneral;
	public ControlProveedoresParameterReturnGeneral controlproveedoresParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoControlProveedores=false;
	public Boolean esParaAccionDesdeFormularioControlProveedores=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ControlProveedoresSessionBeanAdditional controlproveedoresSessionBeanAdditional=null;
	
	public ControlProveedoresSessionBeanAdditional getControlProveedoresSessionBeanAdditional() {
		return this.controlproveedoresSessionBeanAdditional;
	}
	
	public void setControlProveedoresSessionBeanAdditional(ControlProveedoresSessionBeanAdditional controlproveedoresSessionBeanAdditional) {
		try {
			this.controlproveedoresSessionBeanAdditional=controlproveedoresSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ControlProveedoresBeanSwingJInternalFrameAdditional controlproveedoresBeanSwingJInternalFrameAdditional=null;
	//public class ControlProveedoresBeanSwingJInternalFrame
	
	public ControlProveedoresBeanSwingJInternalFrameAdditional getControlProveedoresBeanSwingJInternalFrameAdditional() {
		return this.controlproveedoresBeanSwingJInternalFrameAdditional;
	}
	
	public void setControlProveedoresBeanSwingJInternalFrameAdditional(ControlProveedoresBeanSwingJInternalFrameAdditional controlproveedoresBeanSwingJInternalFrameAdditional) {
		try {
			this.controlproveedoresBeanSwingJInternalFrameAdditional=controlproveedoresBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ControlProveedoresLogic controlproveedoresLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ControlProveedores controlproveedoresBean;
	public ControlProveedoresConstantesFunciones controlproveedoresConstantesFunciones;
	//public ControlProveedoresParameterReturnGeneral controlproveedoresReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<ControlProveedores> controlproveedoress;	
	//public List<ControlProveedores> controlproveedoressEliminados;
	//public List<ControlProveedores> controlproveedoressAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoControlProveedores=false;
	public Boolean isVisibilidadCeldaDuplicarControlProveedores=true;
	public Boolean isVisibilidadCeldaCopiarControlProveedores=true;
	public Boolean isVisibilidadCeldaVerFormControlProveedores=true;
	public Boolean isVisibilidadCeldaOrdenControlProveedores=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesControlProveedores=false;
	public Boolean isVisibilidadCeldaModificarControlProveedores=false;
	public Boolean isVisibilidadCeldaActualizarControlProveedores=false;
	public Boolean isVisibilidadCeldaEliminarControlProveedores=false;
	public Boolean isVisibilidadCeldaCancelarControlProveedores=false;
	public Boolean isVisibilidadCeldaGuardarControlProveedores=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosControlProveedores=false;	
	
	
	public Boolean isVisibilidadBusquedaControlProveedores=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoControlProveedores() {
		return this.iIdNuevoControlProveedores;
	}

	public void setiIdNuevoControlProveedores(Long iIdNuevoControlProveedores) {
		this.iIdNuevoControlProveedores = iIdNuevoControlProveedores;
	}
	
	public Long getidControlProveedoresActual() {
		return this.idControlProveedoresActual;
	}

	public void setidControlProveedoresActual(Long idControlProveedoresActual) {
		this.idControlProveedoresActual = idControlProveedoresActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ControlProveedores getcontrolproveedores() {
		return this.controlproveedores;
	}

	public void setcontrolproveedores(ControlProveedores controlproveedores) {
		this.controlproveedores = controlproveedores;
	}
	
	public ControlProveedores getcontrolproveedoresAux() {
		return this.controlproveedoresAux;
	}

	public void setcontrolproveedoresAux(ControlProveedores controlproveedoresAux) {
		this.controlproveedoresAux = controlproveedoresAux;
	}				
	
	public ControlProveedores getcontrolproveedoresAnterior() {
		return this.controlproveedoresAnterior;
	}

	public void setcontrolproveedoresAnterior(ControlProveedores controlproveedoresAnterior) {
		this.controlproveedoresAnterior = controlproveedoresAnterior;
	}	
	
	public ControlProveedores getcontrolproveedoresTotales() {
		return this.controlproveedoresTotales;
	}

	public void setcontrolproveedoresTotales(ControlProveedores controlproveedoresTotales) {
		this.controlproveedoresTotales = controlproveedoresTotales;
	}	
	
	public ControlProveedores getcontrolproveedoresBean() {
		return this.controlproveedoresBean;
	}

	public void setcontrolproveedoresBean(ControlProveedores controlproveedoresBean) {
		this.controlproveedoresBean = controlproveedoresBean;
	}	
	
	public ControlProveedoresParameterReturnGeneral getcontrolproveedoresReturnGeneral() {
		return this.controlproveedoresReturnGeneral;
	}

	public void setcontrolproveedoresReturnGeneral(ControlProveedoresParameterReturnGeneral controlproveedoresReturnGeneral) {
		this.controlproveedoresReturnGeneral = controlproveedoresReturnGeneral;
	}	
	
	
	public Date fecha_emision_hastaBusquedaControlProveedores=new Date();

	public Date getfecha_emision_hastaBusquedaControlProveedores() {
		return this.fecha_emision_hastaBusquedaControlProveedores;
	}

	public void setfecha_emision_hastaBusquedaControlProveedores(Date fecha_emision_hastaBusquedaControlProveedores) {
		this.fecha_emision_hastaBusquedaControlProveedores = fecha_emision_hastaBusquedaControlProveedores;
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
	
	
	public ControlProveedoresLogic getControlProveedoresLogic()	{		
		return controlproveedoresLogic;
	}

	public void setControlProveedoresLogic(ControlProveedoresLogic controlproveedoresLogic) {
		this.controlproveedoresLogic = controlproveedoresLogic;
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
	
	public Boolean getIsEsNuevoControlProveedores() {
		return isEsNuevoControlProveedores;
	}

	public void setIsEsNuevoControlProveedores(Boolean isEsNuevoControlProveedores) {
		this.isEsNuevoControlProveedores = isEsNuevoControlProveedores;
	}

	public Boolean getEsParaAccionDesdeFormularioControlProveedores() {
		return esParaAccionDesdeFormularioControlProveedores;
	}
	
	public void setEsParaAccionDesdeFormularioControlProveedores(Boolean esParaAccionDesdeFormularioControlProveedores) {
		this.esParaAccionDesdeFormularioControlProveedores = esParaAccionDesdeFormularioControlProveedores;
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

			if(this.controlproveedoresSessionBean==null) {
				this.controlproveedoresSessionBean=new ControlProveedoresSessionBean();
			}

			if(!this.controlproveedoresSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(controlproveedoresSessionBean.getlidEmpresaActual());
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

					if(this.controlproveedores!=null) {
						this.controlproveedores.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormControlProveedores!=null) {
						this.jInternalFrameDetalleFormControlProveedores.jComboBoxid_empresaControlProveedores.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaControlProveedores.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormControlProveedores!=null) {
						if(this.jInternalFrameDetalleFormControlProveedores.jComboBoxid_empresaControlProveedores.getItemCount()>0) {
							this.jInternalFrameDetalleFormControlProveedores.jComboBoxid_empresaControlProveedores.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaControlProveedoresGenerico)throws Exception
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
				jComboBoxid_empresaControlProveedoresGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaControlProveedoresGenerico!=null && jComboBoxid_empresaControlProveedoresGenerico.getItemCount()>0) {
					jComboBoxid_empresaControlProveedoresGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ControlProveedores controlproveedores,JComboBox jComboBoxid_empresaControlProveedoresGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaControlProveedoresGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormControlProveedores.jComboBoxid_empresaControlProveedores.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaControlProveedoresGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				controlproveedores.setid_empresa(empresaAux.getId());
				controlproveedores.setempresa_descripcion(ControlProveedoresConstantesFunciones.getEmpresaDescripcion(empresaAux));
				controlproveedores.setEmpresa(empresaAux);			}
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

					if(!ControlProveedoresJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormControlProveedores!=null) { 
							this.jInternalFrameDetalleFormControlProveedores.jComboBoxid_empresaControlProveedores.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormControlProveedores.jComboBoxid_empresaControlProveedores.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormControlProveedores!=null) { 
					}

					if(!ControlProveedoresJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormControlProveedores!=null) {
							this.jInternalFrameDetalleFormControlProveedores.jComboBoxid_empresaControlProveedores.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormControlProveedores!=null) {
							this.jInternalFrameDetalleFormControlProveedores.jComboBoxid_empresaControlProveedores.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesControlProveedores() throws Exception {
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
		
	public ControlProveedoresParameterReturnGeneral getControlProveedoresParameterGeneral() {
		return this.controlproveedoresParameterGeneral;
	}
	
	public void setControlProveedoresParameterGeneral(ControlProveedoresParameterReturnGeneral controlproveedoresParameterGeneral) {
		this.controlproveedoresParameterGeneral = controlproveedoresParameterGeneral;
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
	
	public Boolean getIsPermisoTodoControlProveedores() {
		return isPermisoTodoControlProveedores;
	}

	public void setIsPermisoTodoControlProveedores(Boolean isPermisoTodoControlProveedores) {
		this.isPermisoTodoControlProveedores = isPermisoTodoControlProveedores;
	}

	public Boolean getIsPermisoNuevoControlProveedores() {
		return isPermisoNuevoControlProveedores;
	}

	public void setIsPermisoNuevoControlProveedores(Boolean isPermisoNuevoControlProveedores) {
		this.isPermisoNuevoControlProveedores = isPermisoNuevoControlProveedores;
	}

	public Boolean getIsPermisoActualizarControlProveedores() {
		return isPermisoActualizarControlProveedores;
	}

	public void setIsPermisoActualizarControlProveedores(Boolean isPermisoActualizarControlProveedores) {
		this.isPermisoActualizarControlProveedores = isPermisoActualizarControlProveedores;
	}

	public Boolean getIsPermisoEliminarControlProveedores() {
		return isPermisoEliminarControlProveedores;
	}

	public void setIsPermisoEliminarControlProveedores(Boolean isPermisoEliminarControlProveedores) {
		this.isPermisoEliminarControlProveedores = isPermisoEliminarControlProveedores;
	}

	public Boolean getIsPermisoGuardarCambiosControlProveedores() {
		return isPermisoGuardarCambiosControlProveedores;
	}

	public void setIsPermisoGuardarCambiosControlProveedores(Boolean isPermisoGuardarCambiosControlProveedores) {
		this.isPermisoGuardarCambiosControlProveedores = isPermisoGuardarCambiosControlProveedores;
	}
	
	public Boolean getIsPermisoConsultaControlProveedores() {
		return isPermisoConsultaControlProveedores;
	}

	public void setIsPermisoConsultaControlProveedores(Boolean isPermisoConsultaControlProveedores) {
		this.isPermisoConsultaControlProveedores = isPermisoConsultaControlProveedores;
	}

	public Boolean getIsPermisoBusquedaControlProveedores() {
		return isPermisoBusquedaControlProveedores;
	}

	public void setIsPermisoBusquedaControlProveedores(Boolean isPermisoBusquedaControlProveedores) {
		this.isPermisoBusquedaControlProveedores = isPermisoBusquedaControlProveedores;
	}

	public Boolean getIsPermisoReporteControlProveedores() {
		return isPermisoReporteControlProveedores;
	}

	public void setIsPermisoReporteControlProveedores(Boolean isPermisoReporteControlProveedores) {
		this.isPermisoReporteControlProveedores = isPermisoReporteControlProveedores;
	}
	
	public Boolean getIsPermisoPaginacionMedioControlProveedores() {
		return isPermisoPaginacionMedioControlProveedores;
	}

	public void setIsPermisoPaginacionMedioControlProveedores(Boolean isPermisoPaginacionMedioControlProveedores) {
		this.isPermisoPaginacionMedioControlProveedores = isPermisoPaginacionMedioControlProveedores;
	}
	
	public Boolean getIsPermisoPaginacionTodoControlProveedores() {
		return isPermisoPaginacionTodoControlProveedores;
	}

	public void setIsPermisoPaginacionTodoControlProveedores(Boolean isPermisoPaginacionTodoControlProveedores) {
		this.isPermisoPaginacionTodoControlProveedores = isPermisoPaginacionTodoControlProveedores;
	}
	
	public Boolean getIsPermisoPaginacionAltoControlProveedores() {
		return isPermisoPaginacionAltoControlProveedores;
	}

	public void setIsPermisoPaginacionAltoControlProveedores(Boolean isPermisoPaginacionAltoControlProveedores) {
		this.isPermisoPaginacionAltoControlProveedores = isPermisoPaginacionAltoControlProveedores;
	}
	
	public Boolean getIsPermisoCopiarControlProveedores() {
		return isPermisoCopiarControlProveedores;
	}

	public void setIsPermisoCopiarControlProveedores(Boolean isPermisoCopiarControlProveedores) {
		this.isPermisoCopiarControlProveedores = isPermisoCopiarControlProveedores;
	}
	
	public Boolean getIsPermisoVerFormControlProveedores() {
		return isPermisoVerFormControlProveedores;
	}

	public void setIsPermisoVerFormControlProveedores(Boolean isPermisoVerFormControlProveedores) {
		this.isPermisoVerFormControlProveedores = isPermisoVerFormControlProveedores;
	}
	
	public Boolean getIsPermisoDuplicarControlProveedores() {
		return isPermisoDuplicarControlProveedores;
	}

	public void setIsPermisoDuplicarControlProveedores(Boolean isPermisoDuplicarControlProveedores) {
		this.isPermisoDuplicarControlProveedores = isPermisoDuplicarControlProveedores;
	}
	
	public Boolean getIsPermisoOrdenControlProveedores() {
		return isPermisoOrdenControlProveedores;
	}

	public void setIsPermisoOrdenControlProveedores(Boolean isPermisoOrdenControlProveedores) {
		this.isPermisoOrdenControlProveedores = isPermisoOrdenControlProveedores;
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
	
	public Boolean getIsVisibilidadCeldaNuevoControlProveedores() {
		return isVisibilidadCeldaNuevoControlProveedores;
	}

	public void setIsVisibilidadCeldaNuevoControlProveedores(Boolean isVisibilidadCeldaNuevoControlProveedores) {
		this.isVisibilidadCeldaNuevoControlProveedores = isVisibilidadCeldaNuevoControlProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarControlProveedores() {
		return isVisibilidadCeldaDuplicarControlProveedores;
	}

	public void setIsVisibilidadCeldaDuplicarControlProveedores(Boolean isVisibilidadCeldaDuplicarControlProveedores) {
		this.isVisibilidadCeldaDuplicarControlProveedores = isVisibilidadCeldaDuplicarControlProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarControlProveedores() {
		return isVisibilidadCeldaCopiarControlProveedores;
	}

	public void setIsVisibilidadCeldaCopiarControlProveedores(Boolean isVisibilidadCeldaCopiarControlProveedores) {
		this.isVisibilidadCeldaCopiarControlProveedores = isVisibilidadCeldaCopiarControlProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormControlProveedores() {
		return isVisibilidadCeldaVerFormControlProveedores;
	}

	public void setIsVisibilidadCeldaVerFormControlProveedores(Boolean isVisibilidadCeldaVerFormControlProveedores) {
		this.isVisibilidadCeldaVerFormControlProveedores = isVisibilidadCeldaVerFormControlProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenControlProveedores() {
		return isVisibilidadCeldaOrdenControlProveedores;
	}

	public void setIsVisibilidadCeldaOrdenControlProveedores(Boolean isVisibilidadCeldaOrdenControlProveedores) {
		this.isVisibilidadCeldaOrdenControlProveedores = isVisibilidadCeldaOrdenControlProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesControlProveedores() {
		return isVisibilidadCeldaNuevoRelacionesControlProveedores;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesControlProveedores(Boolean isVisibilidadCeldaNuevoRelacionesControlProveedores) {
		this.isVisibilidadCeldaNuevoRelacionesControlProveedores = isVisibilidadCeldaNuevoRelacionesControlProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaModificarControlProveedores() {
		return isVisibilidadCeldaModificarControlProveedores;
	}

	public void setIsVisibilidadCeldaModificarControlProveedores(Boolean isVisibilidadCeldaModificarControlProveedores) {
		this.isVisibilidadCeldaModificarControlProveedores = isVisibilidadCeldaModificarControlProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarControlProveedores() {
		return isVisibilidadCeldaActualizarControlProveedores;
	}

	public void setIsVisibilidadCeldaActualizarControlProveedores(Boolean isVisibilidadCeldaActualizarControlProveedores) {
		this.isVisibilidadCeldaActualizarControlProveedores = isVisibilidadCeldaActualizarControlProveedores;
	}

	public Boolean getIsVisibilidadCeldaEliminarControlProveedores() {
		return isVisibilidadCeldaEliminarControlProveedores;
	}

	public void setIsVisibilidadCeldaEliminarControlProveedores(Boolean isVisibilidadCeldaEliminarControlProveedores) {
		this.isVisibilidadCeldaEliminarControlProveedores = isVisibilidadCeldaEliminarControlProveedores;
	}

	public Boolean getIsVisibilidadCeldaCancelarControlProveedores() {
		return isVisibilidadCeldaCancelarControlProveedores;
	}

	public void setIsVisibilidadCeldaCancelarControlProveedores(Boolean isVisibilidadCeldaCancelarControlProveedores) {
		this.isVisibilidadCeldaCancelarControlProveedores = isVisibilidadCeldaCancelarControlProveedores;
	}

	public Boolean getIsVisibilidadCeldaGuardarControlProveedores() {
		return isVisibilidadCeldaGuardarControlProveedores;
	}

	public void setIsVisibilidadCeldaGuardarControlProveedores(Boolean isVisibilidadCeldaGuardarControlProveedores) {
		this.isVisibilidadCeldaGuardarControlProveedores = isVisibilidadCeldaGuardarControlProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosControlProveedores() {
		return isVisibilidadCeldaGuardarCambiosControlProveedores;
	}

	public void setIsVisibilidadCeldaGuardarCambiosControlProveedores(Boolean isVisibilidadCeldaGuardarCambiosControlProveedores) {
		this.isVisibilidadCeldaGuardarCambiosControlProveedores = isVisibilidadCeldaGuardarCambiosControlProveedores;
	}
		
	public ControlProveedoresSessionBean getcontrolproveedoresSessionBean() {
		return this.controlproveedoresSessionBean;
	}
	
	public void setcontrolproveedoresSessionBean(ControlProveedoresSessionBean controlproveedoresSessionBean) {
		this.controlproveedoresSessionBean=controlproveedoresSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaControlProveedores() {
		return this.isVisibilidadBusquedaControlProveedores;
	}

	public void setisVisibilidadBusquedaControlProveedores(Boolean isVisibilidadBusquedaControlProveedores) {
		this.isVisibilidadBusquedaControlProveedores=isVisibilidadBusquedaControlProveedores;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysControlProveedores(ControlProveedores controlproveedores)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(controlproveedores,null);
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
	
	public void bugActualizarReferenciaActual(ControlProveedores controlproveedores,ControlProveedores controlproveedoresAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalControlProveedores(controlproveedores);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		controlproveedoresAux.setId(controlproveedores.getId());
		controlproveedoresAux.setVersionRow(controlproveedores.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ControlProveedores controlproveedoresLocal) throws Exception {
		
		if(this.controlproveedoresSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ControlProveedores controlproveedoresLocal) throws Exception {	
		if(this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				controlproveedoresLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarControlProveedoresActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.controlproveedores =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.controlproveedores =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = controlproveedoresValidator.getInvalidValues(this.controlproveedores);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ControlProveedores controlproveedores,List<ControlProveedores> controlproveedoress) throws Exception {
	}		
	
	public void actualizarSelectedLista(ControlProveedores controlproveedores,List<ControlProveedores> controlproveedoress) throws Exception {
		try	{			
			ControlProveedoresConstantesFunciones.actualizarSelectedLista(controlproveedores,controlproveedoress);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ControlProveedores> controlproveedoressLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				controlproveedoressLocal=this.controlproveedoresLogic.getControlProveedoress();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				controlproveedoressLocal=this.controlproveedoress;
			}
			//ARCHITECTURE
		
			for(ControlProveedores controlproveedoresLocal:controlproveedoressLocal) {
				if(this.permiteMantenimiento(controlproveedoresLocal) && controlproveedoresLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ControlProveedoresConstantesFunciones.getControlProveedoresLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ControlProveedoresConstantesFunciones.NOMBREZONA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlProveedores.jLabelnombre_zonaControlProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ControlProveedoresConstantesFunciones.NOMBRECIUDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlProveedores.jLabelnombre_ciudadControlProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ControlProveedoresConstantesFunciones.NOMBREGRUPOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlProveedores.jLabelnombre_grupo_clienteControlProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ControlProveedoresConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlProveedores.jLabelcodigoControlProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ControlProveedoresConstantesFunciones.NOMBRECLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlProveedores.jLabelnombre_clienteControlProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ControlProveedoresConstantesFunciones.RUC)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlProveedores.jLabelrucControlProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ControlProveedoresConstantesFunciones.TELEFONOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlProveedores.jLabeltelefonosControlProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ControlProveedoresConstantesFunciones.DIRECCIONES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlProveedores.jLabeldireccionesControlProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ControlProveedoresConstantesFunciones.EMAILS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlProveedores.jLabelemailsControlProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ControlProveedoresConstantesFunciones.NUMEROFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlProveedores.jLabelnumero_facturaControlProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ControlProveedoresConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlProveedores.jLabelfecha_emisionControlProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ControlProveedoresConstantesFunciones.FECHAVENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlProveedores.jLabelfecha_ventaControlProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ControlProveedoresConstantesFunciones.SALDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlProveedores.jLabelsaldoControlProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ControlProveedoresConstantesFunciones.DEBITOMONELOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlProveedores.jLabeldebito_mone_localControlProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ControlProveedoresConstantesFunciones.CREDITOMONELOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlProveedores.jLabelcredito_mone_localControlProveedores,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormControlProveedores!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormControlProveedores.jLabelnombre_zonaControlProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormControlProveedores.jLabelnombre_ciudadControlProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormControlProveedores.jLabelnombre_grupo_clienteControlProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormControlProveedores.jLabelcodigoControlProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormControlProveedores.jLabelnombre_clienteControlProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormControlProveedores.jLabelrucControlProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormControlProveedores.jLabeltelefonosControlProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormControlProveedores.jLabeldireccionesControlProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormControlProveedores.jLabelemailsControlProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormControlProveedores.jLabelnumero_facturaControlProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormControlProveedores.jLabelfecha_emisionControlProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormControlProveedores.jLabelfecha_ventaControlProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormControlProveedores.jLabelsaldoControlProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormControlProveedores.jLabeldebito_mone_localControlProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormControlProveedores.jLabelcredito_mone_localControlProveedores,"");
		
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
		this.iIdNuevoControlProveedores--;	
		
		
		this.controlproveedoresAux=new ControlProveedores();
		
		this.controlproveedoresAux.setId(this.iIdNuevoControlProveedores);
		this.controlproveedoresAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.controlproveedoresLogic.getControlProveedoress().add(this.controlproveedoresAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.controlproveedoress.add(this.controlproveedoresAux);
		}
		//ARCHITECTURE
		
		this.controlproveedores=this.controlproveedoresAux;
		
		if(ControlProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioControlProveedores(this.controlproveedores);
			this.setVariablesObjetoActualToFormularioForeignKeyControlProveedores(this.controlproveedores);
		}
				
		//this.setDefaultControlesControlProveedores();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyControlProveedores();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyControlProveedores();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyControlProveedores();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualControlProveedores(this.controlproveedoresBean,this.controlproveedores,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanControlProveedores(this.controlproveedoresReturnGeneral,this.controlproveedoresBean,false);
		
		if(this.controlproveedoresReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyControlProveedores(this.controlproveedoresReturnGeneral.getControlProveedores());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioControlProveedores(this.controlproveedoresReturnGeneral.getControlProveedores());
		}
		
		if(this.controlproveedoresReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioControlProveedores(this.controlproveedoresReturnGeneral.getControlProveedores(),classes);//this.controlproveedoresBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualControlProveedores(this.controlproveedores,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyControlProveedores();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyControlProveedores();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ControlProveedoresBeanSwingJInternalFrameAdditional.RecargarFormControlProveedores(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingControlProveedores(false);
						
			if(controlproveedoresSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ControlProveedoresJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualControlProveedores();
			}
			
			this.actualizarVisualTableDatosControlProveedores();
			
			this.jTableDatosControlProveedores.setRowSelectionInterval(this.getIndiceNuevoControlProveedores(), this.getIndiceNuevoControlProveedores());
			
			this.seleccionarFilaTablaControlProveedoresActual();
						
			this.actualizarEstadoCeldasBotonesControlProveedores("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesControlProveedores(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormControlProveedores.jDateChooserfecha_emision_hastaControlProveedores.setEnabled(isHabilitar && this.controlproveedoresConstantesFunciones.activarfecha_emision_hastaControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jTextFieldnombre_zonaControlProveedores.setEnabled(isHabilitar && this.controlproveedoresConstantesFunciones.activarnombre_zonaControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jTextAreanombre_ciudadControlProveedores.setEnabled(isHabilitar && this.controlproveedoresConstantesFunciones.activarnombre_ciudadControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jTextAreanombre_grupo_clienteControlProveedores.setEnabled(isHabilitar && this.controlproveedoresConstantesFunciones.activarnombre_grupo_clienteControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jTextFieldcodigoControlProveedores.setEnabled(isHabilitar && this.controlproveedoresConstantesFunciones.activarcodigoControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jTextAreanombre_clienteControlProveedores.setEnabled(isHabilitar && this.controlproveedoresConstantesFunciones.activarnombre_clienteControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jTextFieldrucControlProveedores.setEnabled(isHabilitar && this.controlproveedoresConstantesFunciones.activarrucControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jTextAreatelefonosControlProveedores.setEnabled(isHabilitar && this.controlproveedoresConstantesFunciones.activartelefonosControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jTextAreadireccionesControlProveedores.setEnabled(isHabilitar && this.controlproveedoresConstantesFunciones.activardireccionesControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jTextAreaemailsControlProveedores.setEnabled(isHabilitar && this.controlproveedoresConstantesFunciones.activaremailsControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jTextFieldnumero_facturaControlProveedores.setEnabled(isHabilitar && this.controlproveedoresConstantesFunciones.activarnumero_facturaControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jDateChooserfecha_emisionControlProveedores.setEnabled(isHabilitar && this.controlproveedoresConstantesFunciones.activarfecha_emisionControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jDateChooserfecha_ventaControlProveedores.setEnabled(isHabilitar && this.controlproveedoresConstantesFunciones.activarfecha_ventaControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jTextFieldsaldoControlProveedores.setEnabled(isHabilitar && this.controlproveedoresConstantesFunciones.activarsaldoControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jTextFielddebito_mone_localControlProveedores.setEnabled(isHabilitar && this.controlproveedoresConstantesFunciones.activardebito_mone_localControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jTextFieldcredito_mone_localControlProveedores.setEnabled(isHabilitar && this.controlproveedoresConstantesFunciones.activarcredito_mone_localControlProveedores);	
		//
		this.jInternalFrameDetalleFormControlProveedores.jComboBoxid_empresaControlProveedores.setEnabled(isHabilitar && this.controlproveedoresConstantesFunciones.activarid_empresaControlProveedores);
	};
	
	public void setDefaultControlesControlProveedores() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoControlProveedores(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.controlproveedoresSessionBean.setConGuardarRelaciones(true);			
			this.controlproveedoresSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormControlProveedores.jTabbedPaneRelacionesControlProveedores.setVisible(true);
			
					
		} else {
			//this.controlproveedoresSessionBean.setConGuardarRelaciones(false);			
			this.controlproveedoresSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormControlProveedores.jTabbedPaneRelacionesControlProveedores.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoControlProveedores() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ControlProveedores controlproveedoresAux:this.controlproveedoresLogic.getControlProveedoress()) {
				if(controlproveedoresAux.getId().equals(this.iIdNuevoControlProveedores)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ControlProveedores controlproveedoresAux:this.controlproveedoress) {
				if(controlproveedoresAux.getId().equals(this.iIdNuevoControlProveedores)) {
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
	
	public int getIndiceActualControlProveedores(ControlProveedores controlproveedores,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ControlProveedores controlproveedoresAux:this.controlproveedoresLogic.getControlProveedoress()) {
				if(controlproveedoresAux.getId().equals(controlproveedores.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ControlProveedores controlproveedoresAux:this.controlproveedoress) {
				if(controlproveedoresAux.getId().equals(controlproveedores.getId())) {
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
	
	public void setCamposBaseDesdeOriginalControlProveedores(ControlProveedores controlproveedoresOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ControlProveedores controlproveedoresAux:this.controlproveedoresLogic.getControlProveedoress()) {
				if(controlproveedoresAux.getControlProveedoresOriginal().getId().equals(controlproveedoresOriginal.getId())) {
					existe=true;
					controlproveedoresOriginal.setId(controlproveedoresAux.getId());
					controlproveedoresOriginal.setVersionRow(controlproveedoresAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ControlProveedores controlproveedoresAux:this.controlproveedoress) {
				if(controlproveedoresAux.getControlProveedoresOriginal().getId().equals(controlproveedoresOriginal.getId())) {
					existe=true;
					controlproveedoresOriginal.setId(controlproveedoresAux.getId());
					controlproveedoresOriginal.setVersionRow(controlproveedoresAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosControlProveedores(Boolean esParaCancelar) throws Exception {
		controlproveedoressAux=new ArrayList<ControlProveedores>();
		controlproveedoresAux=new ControlProveedores();
		
		if(!this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ControlProveedores controlproveedoresAux:this.controlproveedoresLogic.getControlProveedoress()) {
					if(controlproveedoresAux.getId()<0) {
						controlproveedoressAux.add(controlproveedoresAux);
					}		
				}
				this.iIdNuevoControlProveedores=0L;
				this.controlproveedoresLogic.getControlProveedoress().removeAll(controlproveedoressAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ControlProveedores controlproveedoresAux:this.controlproveedoress) {
					if(controlproveedoresAux.getId()<0) {
						controlproveedoressAux.add(controlproveedoresAux);
					}		
				}
				this.iIdNuevoControlProveedores=0L;
				this.controlproveedoress.removeAll(controlproveedoressAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoControlProveedores 
					&& this.controlproveedoresLogic.getControlProveedoress().size()>0
					) {
					controlproveedoresAux=this.controlproveedoresLogic.getControlProveedoress().get(this.controlproveedoresLogic.getControlProveedoress().size() - 1);
				
					if(controlproveedoresAux.getId()<0) {
						this.controlproveedoresLogic.getControlProveedoress().remove(controlproveedoresAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoControlProveedores && this.controlproveedoress.size()>0) {
					controlproveedoresAux=this.controlproveedoress.get(this.controlproveedoress.size() - 1);
				
					if(controlproveedoresAux.getId()<0) {
						this.controlproveedoress.remove(controlproveedoresAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoControlProveedores(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(controlproveedores.getId()<0) {
				this.controlproveedoresLogic.getControlProveedoress().remove(this.controlproveedores);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(controlproveedores.getId()<0) {
				this.controlproveedoress.remove(this.controlproveedores);
			}
		}			
	}
	
	public void setEstadosInicialesControlProveedores(List<ControlProveedores> controlproveedoressAux) throws Exception {
		ControlProveedoresConstantesFunciones.setEstadosInicialesControlProveedores(controlproveedoressAux);
	}
	
	public void setEstadosInicialesControlProveedores(ControlProveedores controlproveedoresAux) throws Exception {
		ControlProveedoresConstantesFunciones.setEstadosInicialesControlProveedores(controlproveedoresAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarControlProveedoresActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesControlProveedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarControlProveedoresActual()) {
				if(!this.isEsNuevoControlProveedores) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesControlProveedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoControlProveedores=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarControlProveedoresActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Control Proveedores ?", "MANTENIMIENTO DE Control Proveedores", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesControlProveedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ControlProveedores controlproveedores) throws Exception {
		ControlProveedoresConstantesFunciones.seleccionarAsignar(this.controlproveedores,controlproveedores);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarControlProveedores=this.isPermisoActualizarOriginalControlProveedores;
			
			
			this.seleccionarAsignar(controlproveedores);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesControlProveedores("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.controlproveedoresSessionBean.setsFuncionBusquedaRapida(this.controlproveedoresSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoControlProveedores) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosControlProveedores(esParaCancelar);				
				this.cancelarNuevoControlProveedores(esParaCancelar);								
			}
			
			this.controlproveedores=new ControlProveedores();
			
			this.inicializarControlProveedores();
			
			this.actualizarEstadoCeldasBotonesControlProveedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarControlProveedores() throws Exception {
		try {
			ControlProveedoresConstantesFunciones.inicializarControlProveedores(this.controlproveedores);
			
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
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.controlproveedoresLogic.getControlProveedoress().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteControlProveedoress(String sAccionBusqueda,List<ControlProveedores> controlproveedoressParaReportes) throws Exception {
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
					sPathReporteFinal="ControlProveedores"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ControlProveedoresMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ControlProveedoresMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ControlProveedores"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Control Proveedoreses");		
		parameters.put("busquedapor", ControlProveedoresConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceControlProveedores=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ControlProveedoresConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ControlProveedoresConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceControlProveedores=new JRBeanArrayDataSource(ControlProveedoresJInternalFrame.TraerControlProveedoresBeans(controlproveedoressParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceControlProveedores);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ControlProveedoresConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ControlProveedoresConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ControlProveedoresBean.TraerControlProveedoresBeans(controlproveedoressParaReportes).toArray()));
							
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
				this.generarExcelReporteControlProveedoress(sAccionBusqueda,sTipoArchivoReporte,controlproveedoressParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalControlProveedoress(sAccionBusqueda,sTipoArchivoReporte,controlproveedoressParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoControlProveedoresActionPerformed(null);
					//this.generarExcelReporteControlProveedoress(sAccionBusqueda,sTipoArchivoReporte,controlproveedoressParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalControlProveedoress(sAccionBusqueda,sTipoArchivoReporte,controlproveedoressParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesControlProveedoress(sAccionBusqueda,sTipoArchivoReporte,controlproveedoressParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesControlProveedoress(sAccionBusqueda,sTipoArchivoReporte,controlproveedoressParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteControlProveedoress(String sAccionBusqueda,String sTipoArchivoReporte,List<ControlProveedores> controlproveedoressParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"controlproveedores";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ControlProveedoress");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderControlProveedores("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ControlProveedores controlproveedores : controlproveedoressParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ControlProveedoresConstantesFunciones.generarExcelReporteDataControlProveedores("NORMAL",row,workbook,controlproveedores,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Control Proveedores",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderControlProveedores(String sTipo,Row row,Workbook workbook) {
		
		ControlProveedoresConstantesFunciones.generarExcelReporteHeaderControlProveedores(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalControlProveedoress(String sAccionBusqueda,String sTipoArchivoReporte,List<ControlProveedores> controlproveedoressParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"controlproveedores_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ControlProveedoress");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ControlProveedores controlproveedores : controlproveedoressParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ControlProveedoresConstantesFunciones.getControlProveedoresDescripcion(controlproveedores));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ControlProveedoresConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(controlproveedores.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ControlProveedoresConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(controlproveedores.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ControlProveedoresConstantesFunciones.LABEL_NOMBREZONA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_NOMBREZONA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(controlproveedores.getnombre_zona());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ControlProveedoresConstantesFunciones.LABEL_NOMBRECIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_NOMBRECIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(controlproveedores.getnombre_ciudad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ControlProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(controlproveedores.getnombre_grupo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ControlProveedoresConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(controlproveedores.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ControlProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(controlproveedores.getnombre_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ControlProveedoresConstantesFunciones.LABEL_RUC))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_RUC);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(controlproveedores.getruc());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ControlProveedoresConstantesFunciones.LABEL_TELEFONOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_TELEFONOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(controlproveedores.gettelefonos());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ControlProveedoresConstantesFunciones.LABEL_DIRECCIONES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_DIRECCIONES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(controlproveedores.getdirecciones());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ControlProveedoresConstantesFunciones.LABEL_EMAILS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_EMAILS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(controlproveedores.getemails());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ControlProveedoresConstantesFunciones.LABEL_NUMEROFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_NUMEROFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(controlproveedores.getnumero_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ControlProveedoresConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(controlproveedores.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ControlProveedoresConstantesFunciones.LABEL_FECHAVENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_FECHAVENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(controlproveedores.getfecha_venta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ControlProveedoresConstantesFunciones.LABEL_SALDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_SALDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(controlproveedores.getsaldo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ControlProveedoresConstantesFunciones.LABEL_DEBITOMONELOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_DEBITOMONELOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(controlproveedores.getdebito_mone_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ControlProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(controlproveedores.getcredito_mone_local());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Control Proveedores",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesControlProveedoress(String sAccionBusqueda,String sTipoArchivoReporte,List<ControlProveedores> controlproveedoressParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ControlProveedores> controlproveedoressRespaldo=null;
		
		classes=ControlProveedoresConstantesFunciones.getClassesRelationshipsOfControlProveedores(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.controlproveedoresLogic.setDatosCliente(this.datosCliente);
		this.controlproveedoresLogic.setDatosDeep(this.datosDeep);
		this.controlproveedoresLogic.setIsConDeep(true);
		
		controlproveedoressRespaldo=this.controlproveedoresLogic.getControlProveedoress();
		
		this.controlproveedoresLogic.setControlProveedoress(controlproveedoressParaReportes);	
		this.controlproveedoresLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		controlproveedoressParaReportes=this.controlproveedoresLogic.getControlProveedoress();
		this.controlproveedoresLogic.setControlProveedoress(controlproveedoressRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"controlproveedores_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ControlProveedoress");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderControlProveedores("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ControlProveedores controlproveedores : controlproveedoressParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderControlProveedores("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ControlProveedoresConstantesFunciones.generarExcelReporteDataControlProveedores("NORMAL",row,workbook,controlproveedores,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ControlProveedoresConstantesFunciones.getControlProveedoresDescripcion(controlproveedores));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Control Proveedores",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoControlProveedores.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoControlProveedores.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoControlProveedores.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoControlProveedores.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessControlProveedores() throws Exception {		
		this.startProcessControlProveedores(true);
	}
	
	public void startProcessControlProveedores(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasControlProveedores ,this.jPanelParametrosReportesControlProveedores, this.jScrollPanelDatosControlProveedores,this.jPanelPaginacionControlProveedores, this.jScrollPanelDatosEdicionControlProveedores, this.jPanelAccionesControlProveedores,this.jPanelAccionesFormularioControlProveedores,this.jmenuBarControlProveedores,this.jmenuBarDetalleControlProveedores,this.jTtoolBarControlProveedores,this.jTtoolBarDetalleControlProveedores);		
		
		final JTabbedPane jTabbedPaneBusquedasControlProveedores=this.jTabbedPaneBusquedasControlProveedores; 
		
		final JPanel jPanelParametrosReportesControlProveedores=this.jPanelParametrosReportesControlProveedores;
		//final JScrollPane jScrollPanelDatosControlProveedores=this.jScrollPanelDatosControlProveedores;
		final JTable jTableDatosControlProveedores=this.jTableDatosControlProveedores;		
		final JPanel jPanelPaginacionControlProveedores=this.jPanelPaginacionControlProveedores;
		//final JScrollPane jScrollPanelDatosEdicionControlProveedores=this.jScrollPanelDatosEdicionControlProveedores;
		final JPanel jPanelAccionesControlProveedores=this.jPanelAccionesControlProveedores;
		
		JPanel jPanelCamposAuxiliarControlProveedores=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarControlProveedores=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormControlProveedores!=null) {
			jPanelCamposAuxiliarControlProveedores=this.jInternalFrameDetalleFormControlProveedores.jPanelCamposControlProveedores;
			jPanelAccionesFormularioAuxiliarControlProveedores=this.jInternalFrameDetalleFormControlProveedores.jPanelAccionesFormularioControlProveedores;
		}
		
		final JPanel jPanelCamposControlProveedores=jPanelCamposAuxiliarControlProveedores;
		final JPanel jPanelAccionesFormularioControlProveedores=jPanelAccionesFormularioAuxiliarControlProveedores;
		
		
		final JMenuBar jmenuBarControlProveedores=this.jmenuBarControlProveedores;
		final JToolBar jTtoolBarControlProveedores=this.jTtoolBarControlProveedores;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarControlProveedores=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarControlProveedores=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormControlProveedores!=null) {
			jmenuBarDetalleAuxiliarControlProveedores=this.jInternalFrameDetalleFormControlProveedores.jmenuBarDetalleControlProveedores;
			jTtoolBarDetalleAuxiliarControlProveedores=this.jInternalFrameDetalleFormControlProveedores.jTtoolBarDetalleControlProveedores;
		}
		
		final JMenuBar jmenuBarDetalleControlProveedores=jmenuBarDetalleAuxiliarControlProveedores;
		final JToolBar jTtoolBarDetalleControlProveedores=jTtoolBarDetalleAuxiliarControlProveedores;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasControlProveedores;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesControlProveedores;
			processRunnable.jTableDatos=jTableDatosControlProveedores;
			processRunnable.jPanelCampos=jPanelCamposControlProveedores;
			processRunnable.jPanelPaginacion=jPanelPaginacionControlProveedores;
			processRunnable.jPanelAcciones=jPanelAccionesControlProveedores;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioControlProveedores;
			
			
			processRunnable.jmenuBar=jmenuBarControlProveedores;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleControlProveedores;
			processRunnable.jTtoolBar=jTtoolBarControlProveedores;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleControlProveedores;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasControlProveedores ,jPanelParametrosReportesControlProveedores,jTableDatosControlProveedores, /*jScrollPanelDatosControlProveedores,*/jPanelCamposControlProveedores,jPanelPaginacionControlProveedores, /*jScrollPanelDatosEdicionControlProveedores,*/ jPanelAccionesControlProveedores,jPanelAccionesFormularioControlProveedores,jmenuBarControlProveedores,jmenuBarDetalleControlProveedores,jTtoolBarControlProveedores,jTtoolBarDetalleControlProveedores);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasControlProveedores ,jPanelParametrosReportesControlProveedores, jScrollPanelDatosControlProveedores,jPanelPaginacionControlProveedores, jScrollPanelDatosEdicionControlProveedores, jPanelAccionesControlProveedores,jPanelAccionesFormularioControlProveedores,jmenuBarControlProveedores,jmenuBarDetalleControlProveedores,jTtoolBarControlProveedores,jTtoolBarDetalleControlProveedores);
						
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
	
	public void finishProcessControlProveedores() {// throws Exception 
		this.finishProcessControlProveedores(true);
	}
	
	public void finishProcessControlProveedores(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasControlProveedores ,this.jPanelParametrosReportesControlProveedores, this.jScrollPanelDatosControlProveedores,this.jPanelPaginacionControlProveedores, this.jScrollPanelDatosEdicionControlProveedores, this.jPanelAccionesControlProveedores,this.jPanelAccionesFormularioControlProveedores,this.jmenuBarControlProveedores,this.jmenuBarDetalleControlProveedores,this.jTtoolBarControlProveedores,this.jTtoolBarDetalleControlProveedores);		
		
		final JTabbedPane jTabbedPaneBusquedasControlProveedores=this.jTabbedPaneBusquedasControlProveedores; 
		
		final JPanel jPanelParametrosReportesControlProveedores=this.jPanelParametrosReportesControlProveedores;
		//final JScrollPane jScrollPanelDatosControlProveedores=this.jScrollPanelDatosControlProveedores;
		final JTable jTableDatosControlProveedores=this.jTableDatosControlProveedores;		
		final JPanel jPanelPaginacionControlProveedores=this.jPanelPaginacionControlProveedores;
		//final JScrollPane jScrollPanelDatosEdicionControlProveedores=this.jScrollPanelDatosEdicionControlProveedores;
		final JPanel jPanelAccionesControlProveedores=this.jPanelAccionesControlProveedores;
		
		JPanel jPanelCamposAuxiliarControlProveedores=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarControlProveedores=new JPanel();
		
		if(this.jInternalFrameDetalleFormControlProveedores!=null) {
			jPanelCamposAuxiliarControlProveedores=this.jInternalFrameDetalleFormControlProveedores.jPanelCamposControlProveedores;
			jPanelAccionesFormularioAuxiliarControlProveedores=this.jInternalFrameDetalleFormControlProveedores.jPanelAccionesFormularioControlProveedores;
		}
		
		final JPanel jPanelCamposControlProveedores=jPanelCamposAuxiliarControlProveedores;
		final JPanel jPanelAccionesFormularioControlProveedores=jPanelAccionesFormularioAuxiliarControlProveedores;
		
		
		final JMenuBar jmenuBarControlProveedores=this.jmenuBarControlProveedores;		
		final JToolBar jTtoolBarControlProveedores=this.jTtoolBarControlProveedores;
				
		JMenuBar jmenuBarDetalleAuxiliarControlProveedores=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarControlProveedores=new JToolBar();
		
		if(this.jInternalFrameDetalleFormControlProveedores!=null) {
			jmenuBarDetalleAuxiliarControlProveedores=this.jInternalFrameDetalleFormControlProveedores.jmenuBarDetalleControlProveedores;
			jTtoolBarDetalleAuxiliarControlProveedores=this.jInternalFrameDetalleFormControlProveedores.jTtoolBarDetalleControlProveedores;		
		}
		
		final JMenuBar jmenuBarDetalleControlProveedores=jmenuBarDetalleAuxiliarControlProveedores;
		final JToolBar jTtoolBarDetalleControlProveedores=jTtoolBarDetalleAuxiliarControlProveedores;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasControlProveedores;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesControlProveedores;
			processRunnable.jTableDatos=jTableDatosControlProveedores;
			processRunnable.jPanelCampos=jPanelCamposControlProveedores;
			processRunnable.jPanelPaginacion=jPanelPaginacionControlProveedores;
			processRunnable.jPanelAcciones=jPanelAccionesControlProveedores;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioControlProveedores;
			
			
			processRunnable.jmenuBar=jmenuBarControlProveedores;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleControlProveedores;
			processRunnable.jTtoolBar=jTtoolBarControlProveedores;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleControlProveedores;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasControlProveedores ,jPanelParametrosReportesControlProveedores, jTableDatosControlProveedores,/*jScrollPanelDatosControlProveedores,*/jPanelCamposControlProveedores,jPanelPaginacionControlProveedores, /*jScrollPanelDatosEdicionControlProveedores,*/ jPanelAccionesControlProveedores,jPanelAccionesFormularioControlProveedores,jmenuBarControlProveedores,jmenuBarDetalleControlProveedores,jTtoolBarControlProveedores,jTtoolBarDetalleControlProveedores));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesControlProveedores(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarControlProveedores(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuControlProveedores(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarControlProveedores(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarControlProveedores,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleControlProveedores,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuControlProveedores(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarControlProveedores,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleControlProveedores,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.controlproveedoresConstantesFunciones.getsFinalQueryControlProveedores();
		String  finalQueryPaginacionTodos=this.controlproveedoresConstantesFunciones.getsFinalQueryControlProveedores();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ControlProveedoresConstantesFunciones.getArrayColumnasGlobalesNoControlProveedores(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ControlProveedoresConstantesFunciones.getArrayColumnasGlobalesControlProveedores(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ControlProveedoresConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.controlproveedoressEliminados= new ArrayList<ControlProveedores>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessControlProveedores();
		
				///*ControlProveedoresSessionBean*/this.controlproveedoresSessionBean=new ControlProveedoresSessionBean();
			
			if(this.controlproveedoresSessionBean==null) {
				this.controlproveedoresSessionBean=new ControlProveedoresSessionBean();
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
					this.iNumeroPaginacion=ControlProveedoresConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ControlProveedoresConstantesFunciones.getClassesForeignKeysOfControlProveedores(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/controlproveedores."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			controlproveedoressAux= new ArrayList<ControlProveedores>();
			
				
			controlproveedoresLogic.setDatosCliente(this.datosCliente);
			controlproveedoresLogic.setDatosDeep(this.datosDeep);
			controlproveedoresLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaControlProveedores")) {
				this.sDetalleReporte=ControlProveedoresConstantesFunciones.getDetalleIndiceBusquedaControlProveedores(fecha_emision_hastaBusquedaControlProveedores);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					controlproveedoresLogic.getControlProveedoressBusquedaControlProveedores(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_emision_hastaBusquedaControlProveedores);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ControlProveedoresConstantesFunciones.getDetalleIndiceBusquedaControlProveedores(fecha_emision_hastaBusquedaControlProveedores);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ControlProveedoresConstantesFunciones.getDetalleIndiceBusquedaControlProveedores(fecha_emision_hastaBusquedaControlProveedores);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=controlproveedoresLogic.getControlProveedoress()==null||controlproveedoresLogic.getControlProveedoress().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=controlproveedoress==null|| controlproveedoress.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						controlproveedoressAux=new ArrayList<ControlProveedores>();
						controlproveedoressAux.addAll(controlproveedoresLogic.getControlProveedoress());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							controlproveedoressAux=new ArrayList<ControlProveedores>();
							controlproveedoressAux.addAll(controlproveedoress);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							controlproveedoresLogic.getControlProveedoressBusquedaControlProveedores(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_emision_hastaBusquedaControlProveedores);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ControlProveedoresConstantesFunciones.getDetalleIndiceBusquedaControlProveedores(fecha_emision_hastaBusquedaControlProveedores);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ControlProveedoresConstantesFunciones.getDetalleIndiceBusquedaControlProveedores(fecha_emision_hastaBusquedaControlProveedores);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteControlProveedoress("BusquedaControlProveedores",controlproveedoresLogic.getControlProveedoress());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteControlProveedoress("BusquedaControlProveedores",controlproveedoress);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						controlproveedoresLogic.setControlProveedoress(new ArrayList<ControlProveedores>());
						controlproveedoresLogic.getControlProveedoress().addAll(controlproveedoressAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							controlproveedoress=new ArrayList<ControlProveedores>();
							controlproveedoress.addAll(controlproveedoressAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesControlProveedores();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessControlProveedores();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=controlproveedoresLogic.getControlProveedoress().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=controlproveedoress.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=controlproveedoresLogic.getControlProveedoress().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=controlproveedoress.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ControlProveedores controlproveedores) {
		Boolean permite=true;
		
		if(this.controlproveedores.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ControlProveedoresConstantesFunciones.getOrderByListaControlProveedores();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ControlProveedoresConstantesFunciones.getOrderByListaControlProveedores();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ControlProveedores controlproveedores:controlproveedoresLogic.getControlProveedoress()) {
				if(controlproveedores.getsType().equals(Constantes2.S_TOTALES)) {
					controlproveedoresTotales=controlproveedores;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ControlProveedores controlproveedores:this.controlproveedoress) {
				if(controlproveedores.getsType().equals(Constantes2.S_TOTALES)) {
					controlproveedoresTotales=controlproveedores;
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
			this.controlproveedoresAux=new ControlProveedores();
			this.controlproveedoresAux.setsType(Constantes2.S_TOTALES);
			this.controlproveedoresAux.setIsNew(false);
			this.controlproveedoresAux.setIsChanged(false);
			this.controlproveedoresAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ControlProveedoresConstantesFunciones.TotalizarValoresFilaControlProveedores(this.controlproveedoresLogic.getControlProveedoress(),this.controlproveedoresAux);
				
				//this.controlproveedoresLogic.getControlProveedoress().add(this.controlproveedoresAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ControlProveedoresConstantesFunciones.TotalizarValoresFilaControlProveedores(this.controlproveedoress,this.controlproveedoresAux);
				
				this.controlproveedoress.add(this.controlproveedoresAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		controlproveedoresTotales=new ControlProveedores();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.controlproveedoresLogic.getControlProveedoress().remove(controlproveedoresTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.controlproveedoress.remove(controlproveedoresTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		controlproveedoresTotales=new ControlProveedores();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ControlProveedores controlproveedores:controlproveedoresLogic.getControlProveedoress()) {
				if(controlproveedores.getsType().equals(Constantes2.S_TOTALES)) {
					controlproveedoresTotales=controlproveedores;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ControlProveedoresConstantesFunciones.TotalizarValoresFilaControlProveedores(this.controlproveedoresLogic.getControlProveedoress(),controlproveedoresTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ControlProveedores controlproveedores:this.controlproveedoress) {
				if(controlproveedores.getsType().equals(Constantes2.S_TOTALES)) {
					controlproveedoresTotales=controlproveedores;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ControlProveedoresConstantesFunciones.TotalizarValoresFilaControlProveedores(this.controlproveedoress,controlproveedoresTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getControlProveedoressBusquedaControlProveedores()throws Exception {
		try {
			sAccionBusqueda="BusquedaControlProveedores";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getControlProveedoressFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getControlProveedoressBusquedaControlProveedores(String sFinalQuery,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//controlproveedoresLogic.getControlProveedoressBusquedaControlProveedores(sFinalQuery,this.pagination,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getControlProveedoressFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//controlproveedoresLogic.getControlProveedoressFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
								
			//this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosControlProveedores() {
		this.isPermisoTodoControlProveedores=false;
		this.isPermisoNuevoControlProveedores=false;
		this.isPermisoActualizarControlProveedores=false;
		this.isPermisoActualizarOriginalControlProveedores=false;
		this.isPermisoEliminarControlProveedores=false;
		this.isPermisoGuardarCambiosControlProveedores=false;
		this.isPermisoConsultaControlProveedores=true;
		this.isPermisoBusquedaControlProveedores=true;
		this.isPermisoReporteControlProveedores=true;
		this.isPermisoOrdenControlProveedores=false;		
		this.isPermisoPaginacionMedioControlProveedores=false;		
		this.isPermisoPaginacionAltoControlProveedores=false;		
		this.isPermisoPaginacionTodoControlProveedores=false;		
		this.isPermisoCopiarControlProveedores=false;		
		this.isPermisoVerFormControlProveedores=false;		
		this.isPermisoDuplicarControlProveedores=false;
		this.isPermisoOrdenControlProveedores=false;
	}
	
	public void setPermisosUsuarioControlProveedores(Boolean isPermiso) {
		this.isPermisoTodoControlProveedores=isPermiso;
		this.isPermisoNuevoControlProveedores=isPermiso;
		this.isPermisoActualizarControlProveedores=isPermiso;
		this.isPermisoActualizarOriginalControlProveedores=isPermiso;
		this.isPermisoEliminarControlProveedores=isPermiso;
		this.isPermisoGuardarCambiosControlProveedores=isPermiso;
		this.isPermisoConsultaControlProveedores=isPermiso;
		this.isPermisoBusquedaControlProveedores=isPermiso;
		this.isPermisoReporteControlProveedores=isPermiso;
		this.isPermisoOrdenControlProveedores=isPermiso;		
		this.isPermisoPaginacionMedioControlProveedores=isPermiso;		
		this.isPermisoPaginacionAltoControlProveedores=isPermiso;		
		this.isPermisoPaginacionTodoControlProveedores=isPermiso;		
		this.isPermisoCopiarControlProveedores=isPermiso;		
		this.isPermisoVerFormControlProveedores=isPermiso;		
		this.isPermisoDuplicarControlProveedores=isPermiso;
		this.isPermisoOrdenControlProveedores=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioControlProveedores(Boolean isPermiso) {
		//this.isPermisoTodoControlProveedores=isPermiso;
		this.isPermisoNuevoControlProveedores=isPermiso;
		this.isPermisoActualizarControlProveedores=isPermiso;
		this.isPermisoActualizarOriginalControlProveedores=isPermiso;
		this.isPermisoEliminarControlProveedores=isPermiso;
		this.isPermisoGuardarCambiosControlProveedores=isPermiso;
		//this.isPermisoConsultaControlProveedores=isPermiso;
		//this.isPermisoBusquedaControlProveedores=isPermiso;
		//this.isPermisoReporteControlProveedores=isPermiso;
		//this.isPermisoOrdenControlProveedores=isPermiso;		
		//this.isPermisoPaginacionMedioControlProveedores=isPermiso;		
		//this.isPermisoPaginacionAltoControlProveedores=isPermiso;		
		//this.isPermisoPaginacionTodoControlProveedores=isPermiso;		
		//this.isPermisoCopiarControlProveedores=isPermiso;		
		//this.isPermisoDuplicarControlProveedores=isPermiso;
		//this.isPermisoOrdenControlProveedores=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioControlProveedoresClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ControlProveedoresJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebControlProveedores(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioControlProveedoresClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioControlProveedoresClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionControlProveedoresClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioControlProveedoresClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioControlProveedores() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ControlProveedoresJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ControlProveedoresConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoControlProveedores=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarControlProveedores=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalControlProveedores=this.isPermisoActualizarControlProveedores;
			this.isPermisoEliminarControlProveedores=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosControlProveedores=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaControlProveedores=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaControlProveedores=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoControlProveedores=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteControlProveedores=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenControlProveedores=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioControlProveedores=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoControlProveedores=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoControlProveedores=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarControlProveedores=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormControlProveedores=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarControlProveedores=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenControlProveedores=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosControlProveedores.setToolTipText(this.jTableDatosControlProveedores.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioControlProveedores(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioControlProveedores(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ControlProveedoresJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ControlProveedoresJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioControlProveedores() throws Exception {
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
	public void inicializarCombosForeignKeyControlProveedoresListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyControlProveedoresListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ControlProveedoresJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyControlProveedores()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.controlproveedoresSessionBean==null) {
				this.controlproveedoresSessionBean=new ControlProveedoresSessionBean();
			}

			if(!this.controlproveedoresSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyControlProveedores()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyControlProveedores(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyControlProveedores()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyControlProveedores();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyControlProveedores(ControlProveedores controlproveedores)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyControlProveedores(ControlProveedores controlproveedores,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyControlProveedores()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyControlProveedores()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyControlProveedores()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyControlProveedores()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroControlProveedores()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyControlProveedores()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyControlProveedores(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyControlProveedores()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormControlProveedores.jComboBoxid_empresaControlProveedores!=null && this.jInternalFrameDetalleFormControlProveedores.jComboBoxid_empresaControlProveedores.getItemCount()>0) {
				this.jInternalFrameDetalleFormControlProveedores.jComboBoxid_empresaControlProveedores.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public ControlProveedoresBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ControlProveedoresBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ControlProveedoresBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.controlproveedoresSessionBean=new ControlProveedoresSessionBean(); 
		this.controlproveedoresConstantesFunciones=new ControlProveedoresConstantesFunciones(); 
		this.controlproveedoresBean=new ControlProveedores();//(this.controlproveedoresConstantesFunciones); 		
		this.controlproveedoresReturnGeneral=new ControlProveedoresParameterReturnGeneral(); 
		
		this.controlproveedoresSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.controlproveedoresSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ControlProveedoresBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ControlProveedoresBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ControlProveedoresBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessControlProveedores(true);
			
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
			
			this.controlproveedoresConstantesFunciones=new ControlProveedoresConstantesFunciones(); 
			this.controlproveedoresBean=new ControlProveedores();//this.controlproveedoresConstantesFunciones); 			
			this.controlproveedoresReturnGeneral=new ControlProveedoresParameterReturnGeneral(); 
		
			ControlProveedoresBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Control Proveedores Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.controlproveedores=new ControlProveedores();
			this.controlproveedoress = new ArrayList<ControlProveedores>();
			this.controlproveedoressAux = new ArrayList<ControlProveedores>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic=new ControlProveedoresLogic();
				this.controlproveedoresLogic.getNewConnexionToDeep("");
			}
			
			//this.controlproveedoresSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.controlproveedoresSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormControlProveedores);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoControlProveedores!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoControlProveedores);	
					}
					
					if(this.jInternalFrameImportacionControlProveedores!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionControlProveedores);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByControlProveedores!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByControlProveedores);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormControlProveedores!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormControlProveedores);
				this.jInternalFrameDetalleFormControlProveedores.setVisible(false);
				this.jInternalFrameDetalleFormControlProveedores.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoControlProveedores!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoControlProveedores);
					this.jInternalFrameReporteDinamicoControlProveedores.setVisible(false);
					this.jInternalFrameReporteDinamicoControlProveedores.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionControlProveedores!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionControlProveedores);
					this.jInternalFrameImportacionControlProveedores.setVisible(false);
					this.jInternalFrameImportacionControlProveedores.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByControlProveedores!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByControlProveedores);
					this.jInternalFrameOrderByControlProveedores.setVisible(false);
					this.jInternalFrameOrderByControlProveedores.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idControlProveedoresActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ControlProveedoresConstantesFunciones.INUMEROPAGINACION;
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
			
			this.controlproveedoresReturnGeneral=new ControlProveedoresParameterReturnGeneral();
			
			this.controlproveedoresParameterGeneral=new ControlProveedoresParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.controlproveedoresLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ControlProveedoresJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ControlProveedoresConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.controlproveedoresSessionBean.getEsGuardarRelacionado(),this.controlproveedoresSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ControlProveedoresConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.controlproveedoresSessionBean.getEsGuardarRelacionado(),this.controlproveedoresSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoControlProveedores=false;
			this.isVisibilidadCeldaDuplicarControlProveedores=true;
			this.isVisibilidadCeldaCopiarControlProveedores=true;
			this.isVisibilidadCeldaVerFormControlProveedores=true;
			this.isVisibilidadCeldaOrdenControlProveedores=true;
			this.isVisibilidadCeldaNuevoRelacionesControlProveedores=false;
			this.isVisibilidadCeldaModificarControlProveedores=false;
			this.isVisibilidadCeldaActualizarControlProveedores=false;
			this.isVisibilidadCeldaEliminarControlProveedores=false;
			this.isVisibilidadCeldaCancelarControlProveedores=false;
			this.isVisibilidadCeldaGuardarControlProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosControlProveedores=false;
			
			
			this.isVisibilidadBusquedaControlProveedores=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesControlProveedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosControlProveedores();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioControlProveedores(false);
			
			this.setPermisosUsuarioControlProveedores();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.controlproveedoresSessionBean.getEsGuardarRelacionado() 
				|| (this.controlproveedoresSessionBean.getEsGuardarRelacionado() && this.controlproveedoresSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioControlProveedoresClasesRelacionadas();
			}
			
			if(this.controlproveedoresSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioControlProveedoresClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ControlProveedoresJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosControlProveedores();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualControlProveedores();
			}
			
			if(!this.isPermisoBusquedaControlProveedores) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasControlProveedores.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ControlProveedoresConstantesFunciones.getTiposSeleccionarControlProveedores());
				
				this.tiposColumnasSelect=ControlProveedoresConstantesFunciones.getTiposSeleccionarControlProveedores(true);
				
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
			//if(!this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioControlProveedores();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioControlProveedores(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioControlProveedores(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesControlProveedores() ;
			
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
				controlproveedoresImplementable= (ControlProveedoresImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ControlProveedoresConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				controlproveedoresImplementableHome= (ControlProveedoresImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ControlProveedoresConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.controlproveedoress= new ArrayList<ControlProveedores>();
			this.controlproveedoressEliminados= new ArrayList<ControlProveedores>();
						
			this.isEsNuevoControlProveedores=false;
			this.esParaAccionDesdeFormularioControlProveedores=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyControlProveedores(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroControlProveedores();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ControlProveedoresBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ControlProveedoresConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesControlProveedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingControlProveedores(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormControlProveedores!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioControlProveedores();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioControlProveedores();
			}
			
			ControlProveedoresBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasControlProveedores.getTabCount(); i++) {
					this.jTabbedPaneBusquedasControlProveedores.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasControlProveedores.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessControlProveedores(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ControlProveedores: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectControlProveedores() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesControlProveedores")) {
				iIndex=this.jInternalFrameDetalleFormControlProveedores.jTabbedPaneRelacionesControlProveedores.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormControlProveedores.jTabbedPaneRelacionesControlProveedores.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessControlProveedores();	
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
	
	public void cargarCombosForeignKeyControlProveedores(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyControlProveedores(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyControlProveedores(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyControlProveedoresListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyControlProveedores();
		
		this.cargarCombosFrameForeignKeyControlProveedores();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyControlProveedores();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyControlProveedores();
		}
	}
	
	
	
	public void jButtonNuevoControlProveedoresActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.controlproveedoresSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormControlProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
			
			
			if(jTableDatosControlProveedores.getRowCount()>=1) {
				jTableDatosControlProveedores.removeRowSelectionInterval(0, jTableDatosControlProveedores.getRowCount()-1);						
			}
			
			this.isEsNuevoControlProveedores=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoControlProveedores(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesControlProveedores(true);			
			//this.controlproveedores=new ControlProveedores();
			//this.controlproveedores.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesControlProveedores(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualControlProveedores() ;
			
			if(ControlProveedoresJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleControlProveedores(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.controlproveedores);	
			this.actualizarInformacion("INFO_PADRE",false,this.controlproveedores);				
			
			ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
			
			if(this.controlproveedoresSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ControlProveedores: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarControlProveedoresActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ControlProveedores> controlproveedoressSeleccionados=new ArrayList<ControlProveedores>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosControlProveedores.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosControlProveedores.getSelectedRows().length;			
			}
			
			controlproveedoressSeleccionados=this.getControlProveedoressSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoControlProveedores--;			
				//ControlProveedores controlproveedoresAux= new ControlProveedores();			
				//controlproveedoresAux.setId(this.iIdNuevoControlProveedores);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ControlProveedores controlproveedoresOrigen=new ControlProveedores();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ControlProveedores controlproveedoresOrigen : controlproveedoressSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							controlproveedoresOrigen =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							controlproveedoresOrigen =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaControlProveedores();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.controlproveedores.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosControlProveedores(controlproveedoresOrigen,this.controlproveedores,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.controlproveedoresLogic.getControlProveedoress().add(this.controlproveedoresAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.controlproveedoress.add(this.controlproveedoresAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaControlProveedores(false);
				
				this.jTableDatosControlProveedores.setRowSelectionInterval(this.getIndiceNuevoControlProveedores(), this.getIndiceNuevoControlProveedores());
				
				int iLastRow =  this.jTableDatosControlProveedores.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosControlProveedores.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosControlProveedores.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaControlProveedores(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarControlProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ControlProveedores> controlproveedoressSeleccionados=new ArrayList<ControlProveedores>();									
		
			ControlProveedores controlproveedoresOrigen=new ControlProveedores();
			ControlProveedores controlproveedoresDestino=new ControlProveedores();
				
			controlproveedoressSeleccionados=this.getControlProveedoressSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosControlProveedores.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || controlproveedoressSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosControlProveedores.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						controlproveedoresOrigen =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						controlproveedoresOrigen =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						controlproveedoresDestino =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						controlproveedoresDestino =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				controlproveedoresOrigen =controlproveedoressSeleccionados.get(0);
				controlproveedoresDestino =controlproveedoressSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosControlProveedores(controlproveedoresOrigen,controlproveedoresDestino,true,false);
				
				controlproveedoresDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(controlproveedoresDestino,controlproveedoresLogic.getControlProveedoress());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(controlproveedoresDestino,controlproveedoress);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaControlProveedores(false);
				
				//this.jTableDatosControlProveedores.setRowSelectionInterval(this.getIndiceNuevoControlProveedores(), this.getIndiceNuevoControlProveedores());
				
				int iLastRow =  this.jTableDatosControlProveedores.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosControlProveedores.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosControlProveedores.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaControlProveedores(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormControlProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormControlProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormControlProveedores.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarControlProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesControlProveedores.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasControlProveedores.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesControlProveedores.setVisible(!isVisible);
			this.jPanelPaginacionControlProveedores.setVisible(!isVisible);
			this.jPanelAccionesControlProveedores.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarControlProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameControlProveedores();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoControlProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoControlProveedores();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionControlProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionControlProveedores();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByControlProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByControlProveedores();
			
			this.abrirFrameOrderByControlProveedores();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByControlProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByControlProveedores();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleControlProveedores(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormControlProveedores);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormControlProveedores.isMaximum()) {
					this.jInternalFrameDetalleFormControlProveedores.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormControlProveedores.setSize(this.jInternalFrameDetalleFormControlProveedores.iWidthFormulario,this.jInternalFrameDetalleFormControlProveedores.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormControlProveedores.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormControlProveedores.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormControlProveedores.isMaximum()) {
						this.jInternalFrameDetalleFormControlProveedores.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormControlProveedores.jContentPaneDetalleControlProveedores.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormControlProveedores.jTabbedPaneRelacionesControlProveedores.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormControlProveedores.jContentPaneDetalleControlProveedores.getWidth(),ControlProveedoresConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormControlProveedores.jTabbedPaneRelacionesControlProveedores.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormControlProveedores.jContentPaneDetalleControlProveedores.getWidth(),ControlProveedoresConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormControlProveedores.jTabbedPaneRelacionesControlProveedores.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormControlProveedores.jContentPaneDetalleControlProveedores.getWidth(),ControlProveedoresConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormControlProveedores.setVisible(true);
	        this.jInternalFrameDetalleFormControlProveedores.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByControlProveedores() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByControlProveedores==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByControlProveedores=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByControlProveedores,false,this);
				} else {
					this.jInternalFrameOrderByControlProveedores=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByControlProveedores,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByControlProveedores);
				this.jInternalFrameOrderByControlProveedores.setVisible(false);
				this.jInternalFrameOrderByControlProveedores.setSelected(false);
				
				this.jInternalFrameOrderByControlProveedores.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByControlProveedores"));
				
				this.inicializarActualizarBindingTablaOrderByControlProveedores();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionControlProveedores() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionControlProveedores==null) {
				
				this.jInternalFrameImportacionControlProveedores=new ImportacionJInternalFrame(ControlProveedoresConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionControlProveedores);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionControlProveedores);
				this.jInternalFrameImportacionControlProveedores.setVisible(false);
				this.jInternalFrameImportacionControlProveedores.setSelected(false);


				this.jInternalFrameImportacionControlProveedores.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionControlProveedores"));
				this.jInternalFrameImportacionControlProveedores.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionControlProveedores"));
				this.jInternalFrameImportacionControlProveedores.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionControlProveedores"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoControlProveedores() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoControlProveedores==null) {
				this.jInternalFrameReporteDinamicoControlProveedores=new ReporteDinamicoJInternalFrame(ControlProveedoresConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoControlProveedores);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoControlProveedores);
				this.jInternalFrameReporteDinamicoControlProveedores.setVisible(false);
				this.jInternalFrameReporteDinamicoControlProveedores.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoControlProveedores.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoControlProveedores"));
				this.jInternalFrameReporteDinamicoControlProveedores.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoControlProveedores"));
				this.jInternalFrameReporteDinamicoControlProveedores.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoControlProveedores"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualControlProveedores();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleControlProveedores() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormControlProveedores);
			
	       	this.jInternalFrameDetalleFormControlProveedores.setVisible(false);
	        this.jInternalFrameDetalleFormControlProveedores.setSelected(false);
			
			//this.jInternalFrameDetalleFormControlProveedores.dispose();
			//this.jInternalFrameDetalleFormControlProveedores=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoControlProveedores() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoControlProveedores.setVisible(true);
	        this.jInternalFrameReporteDinamicoControlProveedores.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionControlProveedores() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionControlProveedores.setVisible(true);
	        this.jInternalFrameImportacionControlProveedores.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByControlProveedores() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByControlProveedores.setVisible(true);
	        this.jInternalFrameOrderByControlProveedores.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByControlProveedores() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByControlProveedores.setVisible(false);
	        this.jInternalFrameOrderByControlProveedores.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoControlProveedores() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoControlProveedores.setVisible(false);
	        this.jInternalFrameReporteDinamicoControlProveedores.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionControlProveedores() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionControlProveedores.setVisible(false);
	        this.jInternalFrameImportacionControlProveedores.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarControlProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarControlProveedores(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarControlProveedores(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesControlProveedores(true);
			//this.isEsNuevoControlProveedores=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedores =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.controlproveedores =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesControlProveedores("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesControlProveedores(false) ;
			
			if(controlproveedoresSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ControlProveedoresJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleControlProveedores(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualControlProveedores(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaControlProveedoresActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedores =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.controlproveedores =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarControlProveedores(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormControlProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesControlProveedores(true);
			//this.isEsNuevoControlProveedores=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedores =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.controlproveedores =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.controlproveedores.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesControlProveedores("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesControlProveedores(false) ;
			
			if(ControlProveedoresJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleControlProveedores(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualControlProveedores(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarControlProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesControlProveedores(false);
			
			//if(!this.isEsNuevoControlProveedores) {								
				int intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedores =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.controlproveedores =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ControlProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualControlProveedores(this.controlproveedores,true);
				this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
				
			}
			
			if(this.permiteMantenimiento(this.controlproveedores)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoControlProveedores=true;
					this.inicializarActualizarBindingTablaControlProveedores(false);
					this.isEsNuevoControlProveedores=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoControlProveedores=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoControlProveedores=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesControlProveedores(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualControlProveedores(false);
				
				this.habilitarDeshabilitarControlesControlProveedores(false);
			
												
				
				if(ControlProveedoresJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleControlProveedores();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoControlProveedoresActionPerformed(evt,controlproveedoresSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualControlProveedores(this.controlproveedores,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosControlProveedores.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,controlproveedoresSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.controlproveedores.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ControlProveedores.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ControlProveedores.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarControlProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedores =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
				this.controlproveedores.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.controlproveedores =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
				this.controlproveedores.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.controlproveedores)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ControlProveedoresModel) this.jTableDatosControlProveedores.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoControlProveedores=true;
				this.inicializarActualizarBindingTablaControlProveedores(false);
				this.isEsNuevoControlProveedores=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesControlProveedores(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualControlProveedores(false);
				
				this.habilitarDeshabilitarControlesControlProveedores(false);
				
				
				
				if(ControlProveedoresJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleControlProveedores();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarControlProveedoresActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosControlProveedores.getRowCount()>=1) {
				jTableDatosControlProveedores.removeRowSelectionInterval(0, jTableDatosControlProveedores.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesControlProveedores(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaControlProveedores(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesControlProveedores(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualControlProveedores(false) ;
			
			this.isEsNuevoControlProveedores=false;
			
			if(ControlProveedoresJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleControlProveedores();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosControlProveedoresActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingControlProveedores(false);
				
				//SI ES MANUAL
				if(ControlProveedoresJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualControlProveedores();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosControlProveedoresActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoControlProveedores--;			
			//ControlProveedores controlproveedoresAux= new ControlProveedores();			
			//controlproveedoresAux.setId(this.iIdNuevoControlProveedores);
			
			if(this.jInternalFrameDetalleFormControlProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaControlProveedores();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
			
			this.controlproveedores.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.controlproveedoresLogic.getControlProveedoress().add(this.controlproveedoresAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.controlproveedoress.add(this.controlproveedoresAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaControlProveedores(false);
			
			this.jTableDatosControlProveedores.setRowSelectionInterval(this.getIndiceNuevoControlProveedores(), this.getIndiceNuevoControlProveedores());
			
			int iLastRow =  this.jTableDatosControlProveedores.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosControlProveedores.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosControlProveedores.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaControlProveedores(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionControlProveedoresActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingControlProveedores(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingControlProveedores(false);
			
			//SI ES MANUAL
			if(ControlProveedoresJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualControlProveedores();
			}
			
			//this.abrirFrameTreeControlProveedores();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionControlProveedoresActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionControlProveedoresActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionControlProveedores.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionControlProveedores.setFileImportacion(this.jInternalFrameImportacionControlProveedores.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionControlProveedores.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionControlProveedores.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionControlProveedores.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionControlProveedores.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoControlProveedoresActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ControlProveedores> controlproveedoressSeleccionados=new ArrayList<ControlProveedores>();		

		controlproveedoressSeleccionados=this.getControlProveedoressSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoControlProveedores.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoControlProveedores.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ControlProveedoresBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ControlProveedoresBaseDesign.jrxml";
			
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
			
			this.generarReporteControlProveedoress("Todos",controlproveedoressSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Control Proveedores",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoControlProveedores.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoControlProveedores.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ControlProveedoresConstantesFunciones.LABEL_NOMBREZONA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreZona_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreZona_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreZona_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreZona_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ControlProveedoresConstantesFunciones.LABEL_NOMBRECIUDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCiudad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCiudad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCiudad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCiudad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ControlProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreGrupoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreGrupoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreGrupoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreGrupoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ControlProveedoresConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ControlProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ControlProveedoresConstantesFunciones.LABEL_RUC:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_c_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_c_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_c_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_c_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ControlProveedoresConstantesFunciones.LABEL_TELEFONOS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefonos_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefonos_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefonos_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefonos_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ControlProveedoresConstantesFunciones.LABEL_DIRECCIONES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_recciones_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_recciones_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_recciones_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_recciones_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ControlProveedoresConstantesFunciones.LABEL_EMAILS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ails_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ails_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ails_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ails_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ControlProveedoresConstantesFunciones.LABEL_NUMEROFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ControlProveedoresConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ControlProveedoresConstantesFunciones.LABEL_FECHAVENTA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ControlProveedoresConstantesFunciones.LABEL_SALDO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ldo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ldo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ldo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ldo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ControlProveedoresConstantesFunciones.LABEL_DEBITOMONELOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bitoMoneLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bitoMoneLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bitoMoneLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bitoMoneLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ControlProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_editoMoneLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_editoMoneLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_editoMoneLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_editoMoneLocal_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoControlProveedores.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoControlProveedores.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoControlProveedores.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ControlProveedoresConstantesFunciones.LABEL_NOMBREZONA:
					sNombreCampoCategoria="nombre_zona";
					break;

				case ControlProveedoresConstantesFunciones.LABEL_NOMBRECIUDAD:
					sNombreCampoCategoria="nombre_ciudad";
					break;

				case ControlProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					sNombreCampoCategoria="nombre_grupo_cliente";
					break;

				case ControlProveedoresConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ControlProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoria="nombre_cliente";
					break;

				case ControlProveedoresConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoria="ruc";
					break;

				case ControlProveedoresConstantesFunciones.LABEL_TELEFONOS:
					sNombreCampoCategoria="telefonos";
					break;

				case ControlProveedoresConstantesFunciones.LABEL_DIRECCIONES:
					sNombreCampoCategoria="direcciones";
					break;

				case ControlProveedoresConstantesFunciones.LABEL_EMAILS:
					sNombreCampoCategoria="emails";
					break;

				case ControlProveedoresConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoria="numero_factura";
					break;

				case ControlProveedoresConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case ControlProveedoresConstantesFunciones.LABEL_FECHAVENTA:
					sNombreCampoCategoria="fecha_venta";
					break;

				case ControlProveedoresConstantesFunciones.LABEL_SALDO:
					sNombreCampoCategoria="saldo";
					break;

				case ControlProveedoresConstantesFunciones.LABEL_DEBITOMONELOCAL:
					sNombreCampoCategoria="debito_mone_local";
					break;

				case ControlProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL:
					sNombreCampoCategoria="credito_mone_local";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoControlProveedores.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ControlProveedoresConstantesFunciones.LABEL_NOMBREZONA:
					sNombreCampoCategoriaValor="nombre_zona";
					break;

				case ControlProveedoresConstantesFunciones.LABEL_NOMBRECIUDAD:
					sNombreCampoCategoriaValor="nombre_ciudad";
					break;

				case ControlProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					sNombreCampoCategoriaValor="nombre_grupo_cliente";
					break;

				case ControlProveedoresConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ControlProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoriaValor="nombre_cliente";
					break;

				case ControlProveedoresConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoriaValor="ruc";
					break;

				case ControlProveedoresConstantesFunciones.LABEL_TELEFONOS:
					sNombreCampoCategoriaValor="telefonos";
					break;

				case ControlProveedoresConstantesFunciones.LABEL_DIRECCIONES:
					sNombreCampoCategoriaValor="direcciones";
					break;

				case ControlProveedoresConstantesFunciones.LABEL_EMAILS:
					sNombreCampoCategoriaValor="emails";
					break;

				case ControlProveedoresConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoriaValor="numero_factura";
					break;

				case ControlProveedoresConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case ControlProveedoresConstantesFunciones.LABEL_FECHAVENTA:
					sNombreCampoCategoriaValor="fecha_venta";
					break;

				case ControlProveedoresConstantesFunciones.LABEL_SALDO:
					sNombreCampoCategoriaValor="saldo";
					break;

				case ControlProveedoresConstantesFunciones.LABEL_DEBITOMONELOCAL:
					sNombreCampoCategoriaValor="debito_mone_local";
					break;

				case ControlProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL:
					sNombreCampoCategoriaValor="credito_mone_local";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoControlProveedores.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoControlProveedores.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ControlProveedoresConstantesFunciones.LABEL_NOMBREZONA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Zona",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_zona");
					break;

				case ControlProveedoresConstantesFunciones.LABEL_NOMBRECIUDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Ciudad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_ciudad");
					break;

				case ControlProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Grupo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_grupo_cliente");
					break;

				case ControlProveedoresConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ControlProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cliente");
					break;

				case ControlProveedoresConstantesFunciones.LABEL_RUC:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ruc",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ruc");
					break;

				case ControlProveedoresConstantesFunciones.LABEL_TELEFONOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefonos",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefonos");
					break;

				case ControlProveedoresConstantesFunciones.LABEL_DIRECCIONES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direcciones",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direcciones");
					break;

				case ControlProveedoresConstantesFunciones.LABEL_EMAILS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Emails",sNombreCampoCategoria,sNombreCampoCategoriaValor,"emails");
					break;

				case ControlProveedoresConstantesFunciones.LABEL_NUMEROFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_factura");
					break;

				case ControlProveedoresConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case ControlProveedoresConstantesFunciones.LABEL_FECHAVENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Venta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_venta");
					break;

				case ControlProveedoresConstantesFunciones.LABEL_SALDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Saldo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"saldo");
					break;

				case ControlProveedoresConstantesFunciones.LABEL_DEBITOMONELOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Debito Mone Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"debito_mone_local");
					break;

				case ControlProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Credito Mone Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"credito_mone_local");
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
	
	public void jButtonGenerarExcelReporteDinamicoControlProveedoresActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ControlProveedores> controlproveedoressSeleccionados=new ArrayList<ControlProveedores>();		
		
		controlproveedoressSeleccionados=this.getControlProveedoressSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"controlproveedores";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ControlProveedoress");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoControlProveedores.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoControlProveedores.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ControlProveedoresConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ControlProveedores controlproveedores:controlproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(controlproveedores.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ControlProveedoresConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(ControlProveedores controlproveedores:controlproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(controlproveedores.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ControlProveedoresConstantesFunciones.LABEL_NOMBREZONA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_NOMBREZONA);
					iRow++;

					for(ControlProveedores controlproveedores:controlproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(controlproveedores.getnombre_zona());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ControlProveedoresConstantesFunciones.LABEL_NOMBRECIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_NOMBRECIUDAD);
					iRow++;

					for(ControlProveedores controlproveedores:controlproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(controlproveedores.getnombre_ciudad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ControlProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
					iRow++;

					for(ControlProveedores controlproveedores:controlproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(controlproveedores.getnombre_grupo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ControlProveedoresConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ControlProveedores controlproveedores:controlproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(controlproveedores.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ControlProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE);
					iRow++;

					for(ControlProveedores controlproveedores:controlproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(controlproveedores.getnombre_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ControlProveedoresConstantesFunciones.LABEL_RUC:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_RUC);
					iRow++;

					for(ControlProveedores controlproveedores:controlproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(controlproveedores.getruc());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ControlProveedoresConstantesFunciones.LABEL_TELEFONOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_TELEFONOS);
					iRow++;

					for(ControlProveedores controlproveedores:controlproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(controlproveedores.gettelefonos());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ControlProveedoresConstantesFunciones.LABEL_DIRECCIONES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_DIRECCIONES);
					iRow++;

					for(ControlProveedores controlproveedores:controlproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(controlproveedores.getdirecciones());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ControlProveedoresConstantesFunciones.LABEL_EMAILS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_EMAILS);
					iRow++;

					for(ControlProveedores controlproveedores:controlproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(controlproveedores.getemails());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ControlProveedoresConstantesFunciones.LABEL_NUMEROFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_NUMEROFACTURA);
					iRow++;

					for(ControlProveedores controlproveedores:controlproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(controlproveedores.getnumero_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ControlProveedoresConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(ControlProveedores controlproveedores:controlproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(controlproveedores.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ControlProveedoresConstantesFunciones.LABEL_FECHAVENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_FECHAVENTA);
					iRow++;

					for(ControlProveedores controlproveedores:controlproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(controlproveedores.getfecha_venta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ControlProveedoresConstantesFunciones.LABEL_SALDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_SALDO);
					iRow++;

					for(ControlProveedores controlproveedores:controlproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(controlproveedores.getsaldo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ControlProveedoresConstantesFunciones.LABEL_DEBITOMONELOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_DEBITOMONELOCAL);
					iRow++;

					for(ControlProveedores controlproveedores:controlproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(controlproveedores.getdebito_mone_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ControlProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL);
					iRow++;

					for(ControlProveedores controlproveedores:controlproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(controlproveedores.getcredito_mone_local());
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
			//	this.getFilaCabeceraExportarExcelControlProveedores(row);				
			//	iRow++;
			//}				
			
			//for(ControlProveedores controlproveedoresAux:controlproveedoressSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelControlProveedores(controlproveedoresAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Control Proveedores",JOptionPane.INFORMATION_MESSAGE);
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
				this.controlproveedoresLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingControlProveedores(false);
			
			//SI ES MANUAL
			if(ControlProveedoresJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualControlProveedores();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresControlProveedoresActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingControlProveedores(false);
			
			//SI ES MANUAL
			if(ControlProveedoresJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualControlProveedores();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesControlProveedoresActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingControlProveedores(false);
			
			//SI ES MANUAL
			if(ControlProveedoresJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualControlProveedores();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaControlProveedores() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosControlProveedores.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosControlProveedores.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosControlProveedores.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosControlProveedores.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosControlProveedores.setMinimumSize(dimensionMinimum);
		this.jTableDatosControlProveedores.setMaximumSize(dimensionMaximum);
		this.jTableDatosControlProveedores.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingControlProveedores(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingControlProveedores(esInicializar,true);
	}
	
	public void inicializarActualizarBindingControlProveedores(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaControlProveedores(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesControlProveedores(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasControlProveedores(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesControlProveedores(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesControlProveedores(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ControlProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ControlProveedoresJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualControlProveedores() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaControlProveedores();
		
		this.inicializarActualizarBindingBotonesManualControlProveedores(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualControlProveedores();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesControlProveedores() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualControlProveedores(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualControlProveedores(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosControlProveedores.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosControlProveedores.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteControlProveedores.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormControlProveedores!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormControlProveedores.jCheckBoxPostAccionNuevoControlProveedores.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormControlProveedores.jCheckBoxPostAccionSinCerrarControlProveedores.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormControlProveedores.jCheckBoxPostAccionSinMensajeControlProveedores.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosControlProveedores.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosControlProveedores.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteControlProveedores.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormControlProveedores!=null) {
				this.jInternalFrameDetalleFormControlProveedores.jCheckBoxPostAccionNuevoControlProveedores.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormControlProveedores.jCheckBoxPostAccionSinCerrarControlProveedores.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormControlProveedores.jCheckBoxPostAccionSinMensajeControlProveedores.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionControlProveedores.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionControlProveedores.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormControlProveedores!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormControlProveedores.jComboBoxTiposAccionesFormularioControlProveedores.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesControlProveedores.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoControlProveedores!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoControlProveedores.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesControlProveedores.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesControlProveedores.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarControlProveedores.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesControlProveedores.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoControlProveedores!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoControlProveedores.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesControlProveedores.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralControlProveedores.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesControlProveedores(Boolean esInicializar) throws Exception {
		try	{	
			if(ControlProveedoresJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualControlProveedores(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesControlProveedores() throws Exception {
		try	{
			if(ControlProveedoresJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualControlProveedores();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleControlProveedores() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormControlProveedores.jComboBoxTiposAccionesFormularioControlProveedores.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormControlProveedores.jComboBoxTiposAccionesFormularioControlProveedores.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualControlProveedores() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesControlProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesControlProveedores.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesControlProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesControlProveedores.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesControlProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesControlProveedores.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionControlProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionControlProveedores.addItem(reporte);
			}
			
			
			if(!this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionControlProveedores.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionControlProveedores.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesControlProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesControlProveedores.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesControlProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesControlProveedores.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormControlProveedores!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormControlProveedores.jComboBoxTiposAccionesFormularioControlProveedores.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormControlProveedores.jComboBoxTiposAccionesFormularioControlProveedores.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarControlProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarControlProveedores.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarControlProveedores.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualControlProveedores();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualControlProveedores() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoControlProveedores!=null) {
				this.jInternalFrameReporteDinamicoControlProveedores.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoControlProveedores.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoControlProveedores!=null) {
				this.jInternalFrameReporteDinamicoControlProveedores.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoControlProveedores.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoControlProveedores!=null) {
				
				if(this.jInternalFrameReporteDinamicoControlProveedores.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoControlProveedores.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoControlProveedores.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoControlProveedores.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoControlProveedores.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoControlProveedores.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoControlProveedores.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoControlProveedores.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ControlProveedoresConstantesFunciones.getTiposSeleccionarControlProveedores(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoControlProveedores.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoControlProveedores.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoControlProveedores.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ControlProveedoresConstantesFunciones.getTiposSeleccionarControlProveedores(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoControlProveedores.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoControlProveedores.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoControlProveedores.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ControlProveedoresConstantesFunciones.getTiposSeleccionarControlProveedores(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoControlProveedores.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoControlProveedores.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoControlProveedores.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoControlProveedores.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualControlProveedores()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_emision_hastaBusquedaControlProveedores=new Date(this.jDateChooserfecha_emision_hastaBusquedaControlProveedoresControlProveedores.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasControlProveedores(Boolean esInicializar) throws Exception {				
		if(ControlProveedoresJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualControlProveedores();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaControlProveedores() throws Exception {
		this.inicializarActualizarBindingTablaControlProveedores(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByControlProveedores() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByControlProveedores.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByControlProveedores.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByControlProveedores.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ControlProveedoresPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByControlProveedores.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByControlProveedores.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ControlProveedoresPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosControlProveedoresOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosControlProveedoresOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ControlProveedoresPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByControlProveedores.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByControlProveedores.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ControlProveedoresPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByControlProveedores.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaControlProveedores(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=controlproveedoresLogic.getControlProveedoress().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=controlproveedoress.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ControlProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosControlProveedores.setModel(new ControlProveedoresModel(this.controlproveedoresLogic.getControlProveedoress(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosControlProveedores.setModel(new ControlProveedoresModel(this.controlproveedoress,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByControlProveedores!=null && this.jInternalFrameOrderByControlProveedores.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByControlProveedores();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosControlProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosControlProveedores,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ControlProveedoresPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO,controlproveedoresConstantesFunciones.resaltarSeleccionarControlProveedores,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ControlProveedoresConstantesFunciones.SCLASSWEBTITULO,controlproveedoresConstantesFunciones.resaltarSeleccionarControlProveedores,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosControlProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosControlProveedores,ControlProveedoresConstantesFunciones.LABEL_ID));

		if(this.controlproveedoresConstantesFunciones.mostraridControlProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ControlProveedoresConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.controlproveedoresConstantesFunciones.resaltaridControlProveedores,this.controlproveedoresConstantesFunciones.activaridControlProveedores,iSizeTabla,this,true,"idControlProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.controlproveedoresConstantesFunciones.resaltaridControlProveedores,this.controlproveedoresConstantesFunciones.activaridControlProveedores,this,true,"idControlProveedores","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosControlProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosControlProveedores,ControlProveedoresConstantesFunciones.LABEL_NOMBREZONA));

		if(this.controlproveedoresConstantesFunciones.mostrarnombre_zonaControlProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ControlProveedoresConstantesFunciones.LABEL_NOMBREZONA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.controlproveedoresConstantesFunciones.resaltarnombre_zonaControlProveedores,this.controlproveedoresConstantesFunciones.activarnombre_zonaControlProveedores,iSizeTabla,this,true,"nombre_zonaControlProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.controlproveedoresConstantesFunciones.resaltarnombre_zonaControlProveedores,this.controlproveedoresConstantesFunciones.activarnombre_zonaControlProveedores,this,true,"nombre_zonaControlProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ControlProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosControlProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosControlProveedores,ControlProveedoresConstantesFunciones.LABEL_NOMBRECIUDAD));

		if(this.controlproveedoresConstantesFunciones.mostrarnombre_ciudadControlProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ControlProveedoresConstantesFunciones.LABEL_NOMBRECIUDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.controlproveedoresConstantesFunciones.resaltarnombre_ciudadControlProveedores,this.controlproveedoresConstantesFunciones.activarnombre_ciudadControlProveedores,iSizeTabla,this,true,"nombre_ciudadControlProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.controlproveedoresConstantesFunciones.resaltarnombre_ciudadControlProveedores,this.controlproveedoresConstantesFunciones.activarnombre_ciudadControlProveedores,this,true,"nombre_ciudadControlProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ControlProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosControlProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosControlProveedores,ControlProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE));

		if(this.controlproveedoresConstantesFunciones.mostrarnombre_grupo_clienteControlProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ControlProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.controlproveedoresConstantesFunciones.resaltarnombre_grupo_clienteControlProveedores,this.controlproveedoresConstantesFunciones.activarnombre_grupo_clienteControlProveedores,iSizeTabla,this,true,"nombre_grupo_clienteControlProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.controlproveedoresConstantesFunciones.resaltarnombre_grupo_clienteControlProveedores,this.controlproveedoresConstantesFunciones.activarnombre_grupo_clienteControlProveedores,this,true,"nombre_grupo_clienteControlProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ControlProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosControlProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosControlProveedores,ControlProveedoresConstantesFunciones.LABEL_CODIGO));

		if(this.controlproveedoresConstantesFunciones.mostrarcodigoControlProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ControlProveedoresConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.controlproveedoresConstantesFunciones.resaltarcodigoControlProveedores,this.controlproveedoresConstantesFunciones.activarcodigoControlProveedores,iSizeTabla,this,true,"codigoControlProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.controlproveedoresConstantesFunciones.resaltarcodigoControlProveedores,this.controlproveedoresConstantesFunciones.activarcodigoControlProveedores,this,true,"codigoControlProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ControlProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosControlProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosControlProveedores,ControlProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE));

		if(this.controlproveedoresConstantesFunciones.mostrarnombre_clienteControlProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ControlProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.controlproveedoresConstantesFunciones.resaltarnombre_clienteControlProveedores,this.controlproveedoresConstantesFunciones.activarnombre_clienteControlProveedores,iSizeTabla,this,true,"nombre_clienteControlProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.controlproveedoresConstantesFunciones.resaltarnombre_clienteControlProveedores,this.controlproveedoresConstantesFunciones.activarnombre_clienteControlProveedores,this,true,"nombre_clienteControlProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ControlProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosControlProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosControlProveedores,ControlProveedoresConstantesFunciones.LABEL_RUC));

		if(this.controlproveedoresConstantesFunciones.mostrarrucControlProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ControlProveedoresConstantesFunciones.LABEL_RUC,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.controlproveedoresConstantesFunciones.resaltarrucControlProveedores,this.controlproveedoresConstantesFunciones.activarrucControlProveedores,iSizeTabla,this,true,"rucControlProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.controlproveedoresConstantesFunciones.resaltarrucControlProveedores,this.controlproveedoresConstantesFunciones.activarrucControlProveedores,this,true,"rucControlProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ControlProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosControlProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosControlProveedores,ControlProveedoresConstantesFunciones.LABEL_TELEFONOS));

		if(this.controlproveedoresConstantesFunciones.mostrartelefonosControlProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ControlProveedoresConstantesFunciones.LABEL_TELEFONOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.controlproveedoresConstantesFunciones.resaltartelefonosControlProveedores,this.controlproveedoresConstantesFunciones.activartelefonosControlProveedores,iSizeTabla,this,true,"telefonosControlProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.controlproveedoresConstantesFunciones.resaltartelefonosControlProveedores,this.controlproveedoresConstantesFunciones.activartelefonosControlProveedores,this,true,"telefonosControlProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ControlProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosControlProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosControlProveedores,ControlProveedoresConstantesFunciones.LABEL_DIRECCIONES));

		if(this.controlproveedoresConstantesFunciones.mostrardireccionesControlProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ControlProveedoresConstantesFunciones.LABEL_DIRECCIONES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.controlproveedoresConstantesFunciones.resaltardireccionesControlProveedores,this.controlproveedoresConstantesFunciones.activardireccionesControlProveedores,iSizeTabla,this,true,"direccionesControlProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.controlproveedoresConstantesFunciones.resaltardireccionesControlProveedores,this.controlproveedoresConstantesFunciones.activardireccionesControlProveedores,this,true,"direccionesControlProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ControlProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosControlProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosControlProveedores,ControlProveedoresConstantesFunciones.LABEL_EMAILS));

		if(this.controlproveedoresConstantesFunciones.mostraremailsControlProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ControlProveedoresConstantesFunciones.LABEL_EMAILS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.controlproveedoresConstantesFunciones.resaltaremailsControlProveedores,this.controlproveedoresConstantesFunciones.activaremailsControlProveedores,iSizeTabla,this,true,"emailsControlProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.controlproveedoresConstantesFunciones.resaltaremailsControlProveedores,this.controlproveedoresConstantesFunciones.activaremailsControlProveedores,this,true,"emailsControlProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ControlProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosControlProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosControlProveedores,ControlProveedoresConstantesFunciones.LABEL_NUMEROFACTURA));

		if(this.controlproveedoresConstantesFunciones.mostrarnumero_facturaControlProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ControlProveedoresConstantesFunciones.LABEL_NUMEROFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.controlproveedoresConstantesFunciones.resaltarnumero_facturaControlProveedores,this.controlproveedoresConstantesFunciones.activarnumero_facturaControlProveedores,iSizeTabla,this,true,"numero_facturaControlProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.controlproveedoresConstantesFunciones.resaltarnumero_facturaControlProveedores,this.controlproveedoresConstantesFunciones.activarnumero_facturaControlProveedores,this,true,"numero_facturaControlProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ControlProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosControlProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosControlProveedores,ControlProveedoresConstantesFunciones.LABEL_FECHAEMISION));

		if(this.controlproveedoresConstantesFunciones.mostrarfecha_emisionControlProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ControlProveedoresConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.controlproveedoresConstantesFunciones.resaltarfecha_emisionControlProveedores,this.controlproveedoresConstantesFunciones.activarfecha_emisionControlProveedores,iSizeTabla,this,true,"fecha_emisionControlProveedores","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.controlproveedoresConstantesFunciones.resaltarfecha_emisionControlProveedores,this.controlproveedoresConstantesFunciones.activarfecha_emisionControlProveedores,this,true,"fecha_emisionControlProveedores","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ControlProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosControlProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosControlProveedores,ControlProveedoresConstantesFunciones.LABEL_FECHAVENTA));

		if(this.controlproveedoresConstantesFunciones.mostrarfecha_ventaControlProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ControlProveedoresConstantesFunciones.LABEL_FECHAVENTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.controlproveedoresConstantesFunciones.resaltarfecha_ventaControlProveedores,this.controlproveedoresConstantesFunciones.activarfecha_ventaControlProveedores,iSizeTabla,this,true,"fecha_ventaControlProveedores","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.controlproveedoresConstantesFunciones.resaltarfecha_ventaControlProveedores,this.controlproveedoresConstantesFunciones.activarfecha_ventaControlProveedores,this,true,"fecha_ventaControlProveedores","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ControlProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosControlProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosControlProveedores,ControlProveedoresConstantesFunciones.LABEL_SALDO));

		if(this.controlproveedoresConstantesFunciones.mostrarsaldoControlProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ControlProveedoresConstantesFunciones.LABEL_SALDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.controlproveedoresConstantesFunciones.resaltarsaldoControlProveedores,this.controlproveedoresConstantesFunciones.activarsaldoControlProveedores,iSizeTabla,this,true,"saldoControlProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.controlproveedoresConstantesFunciones.resaltarsaldoControlProveedores,this.controlproveedoresConstantesFunciones.activarsaldoControlProveedores,this,true,"saldoControlProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ControlProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosControlProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosControlProveedores,ControlProveedoresConstantesFunciones.LABEL_DEBITOMONELOCAL));

		if(this.controlproveedoresConstantesFunciones.mostrardebito_mone_localControlProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ControlProveedoresConstantesFunciones.LABEL_DEBITOMONELOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.controlproveedoresConstantesFunciones.resaltardebito_mone_localControlProveedores,this.controlproveedoresConstantesFunciones.activardebito_mone_localControlProveedores,iSizeTabla,this,true,"debito_mone_localControlProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.controlproveedoresConstantesFunciones.resaltardebito_mone_localControlProveedores,this.controlproveedoresConstantesFunciones.activardebito_mone_localControlProveedores,this,true,"debito_mone_localControlProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ControlProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosControlProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosControlProveedores,ControlProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL));

		if(this.controlproveedoresConstantesFunciones.mostrarcredito_mone_localControlProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ControlProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.controlproveedoresConstantesFunciones.resaltarcredito_mone_localControlProveedores,this.controlproveedoresConstantesFunciones.activarcredito_mone_localControlProveedores,iSizeTabla,this,true,"credito_mone_localControlProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.controlproveedoresConstantesFunciones.resaltarcredito_mone_localControlProveedores,this.controlproveedoresConstantesFunciones.activarcredito_mone_localControlProveedores,this,true,"credito_mone_localControlProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ControlProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.controlproveedoresSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.controlproveedoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.controlproveedoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosControlProveedores.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.controlproveedoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.controlproveedoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosControlProveedores.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarControlProveedores && this.isPermisoGuardarCambiosControlProveedores) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.controlproveedoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.controlproveedoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosControlProveedores.addColumn(tableColumn);
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
			
			this.jTableDatosControlProveedores.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarControlProveedores && this.isPermisoGuardarCambiosControlProveedores) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarControlProveedores && this.isPermisoGuardarCambiosControlProveedores) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosControlProveedores.moveColumn(this.jTableDatosControlProveedores.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosControlProveedores.moveColumn(this.jTableDatosControlProveedores.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosControlProveedores.moveColumn(this.jTableDatosControlProveedores.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosControlProveedores.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosControlProveedores.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosControlProveedores,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ControlProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosControlProveedores.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosControlProveedores.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ControlProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ControlProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosControlProveedores.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosControlProveedores.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosControlProveedores.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=controlproveedoresLogic.getControlProveedoress().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=controlproveedoress.size()-1;
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
		//this.jTableDatosControlProveedores.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosControlProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosControlProveedores();
			
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
				
				//this.isEsNuevoControlProveedores=false;
					
				ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
			
				if(this.controlproveedoresSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormControlProveedores==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosControlProveedores.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosControlProveedores.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedores =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.controlproveedores =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.controlproveedores.getsType().equals("DUPLICADO")
				   || this.controlproveedores.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoControlProveedores=true;
				
				} else {
					this.isEsNuevoControlProveedores=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {
					if(this.controlproveedores.getId()>=0 && !this.controlproveedores.getIsNew()) {						
						this.isEsNuevoControlProveedores=false;
						
					} else {
						this.isEsNuevoControlProveedores=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoControlProveedores(esRelaciones);						
				
				this.seleccionarControlProveedores(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.controlproveedores.getId()<0) {
					this.isEsNuevoControlProveedores=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarControlProveedores(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarControlProveedores(evt,rowIndex);
				}	
				
				if(this.controlproveedoresSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ControlProveedores: " + this.dDif); 
					}
				}								
				
				ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarControlProveedores(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.controlproveedores)) {
					if(this.controlproveedores.getId()>0) {
						this.controlproveedores.setIsDeleted(true);
						
						this.controlproveedoressEliminados.add(this.controlproveedores);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.controlproveedoresLogic.getControlProveedoress().remove(this.controlproveedores);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.controlproveedoress.remove(this.controlproveedores);				
					}
					
					
					((ControlProveedoresModel) this.jTableDatosControlProveedores.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaControlProveedores(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarControlProveedores(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoControlProveedores) {
			
			if(this.jInternalFrameDetalleFormControlProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosControlProveedores.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosControlProveedores.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedores =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.controlproveedores =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ControlProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioControlProveedores(this.controlproveedores);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesControlProveedores("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesControlProveedores(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualControlProveedores() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoControlProveedores(ControlProveedores controlproveedores) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoControlProveedores(controlproveedores,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoControlProveedores(ControlProveedores controlproveedores,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioControlProveedores(controlproveedores);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyControlProveedores(controlproveedores,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyControlProveedores(controlproveedores);
	}
	
	public void setVariablesObjetoActualToFormularioControlProveedores(ControlProveedores controlproveedores) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormControlProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormControlProveedores.jLabelidControlProveedores.setText(controlproveedores.getId().toString());
			this.jInternalFrameDetalleFormControlProveedores.jTextFieldnombre_zonaControlProveedores.setText(controlproveedores.getnombre_zona());
			this.jInternalFrameDetalleFormControlProveedores.jTextAreanombre_ciudadControlProveedores.setText(controlproveedores.getnombre_ciudad());
			this.jInternalFrameDetalleFormControlProveedores.jTextAreanombre_grupo_clienteControlProveedores.setText(controlproveedores.getnombre_grupo_cliente());
			this.jInternalFrameDetalleFormControlProveedores.jTextFieldcodigoControlProveedores.setText(controlproveedores.getcodigo());
			this.jInternalFrameDetalleFormControlProveedores.jTextAreanombre_clienteControlProveedores.setText(controlproveedores.getnombre_cliente());
			this.jInternalFrameDetalleFormControlProveedores.jTextFieldrucControlProveedores.setText(controlproveedores.getruc());
			this.jInternalFrameDetalleFormControlProveedores.jTextAreatelefonosControlProveedores.setText(controlproveedores.gettelefonos());
			this.jInternalFrameDetalleFormControlProveedores.jTextAreadireccionesControlProveedores.setText(controlproveedores.getdirecciones());
			this.jInternalFrameDetalleFormControlProveedores.jTextAreaemailsControlProveedores.setText(controlproveedores.getemails());
			this.jInternalFrameDetalleFormControlProveedores.jTextFieldnumero_facturaControlProveedores.setText(controlproveedores.getnumero_factura());
			this.jInternalFrameDetalleFormControlProveedores.jDateChooserfecha_emisionControlProveedores.setDate(controlproveedores.getfecha_emision());
			this.jInternalFrameDetalleFormControlProveedores.jDateChooserfecha_ventaControlProveedores.setDate(controlproveedores.getfecha_venta());
			this.jInternalFrameDetalleFormControlProveedores.jTextFieldsaldoControlProveedores.setText(controlproveedores.getsaldo().toString());
			this.jInternalFrameDetalleFormControlProveedores.jTextFielddebito_mone_localControlProveedores.setText(controlproveedores.getdebito_mone_local().toString());
			this.jInternalFrameDetalleFormControlProveedores.jTextFieldcredito_mone_localControlProveedores.setText(controlproveedores.getcredito_mone_local().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ControlProveedores controlproveedoresLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,controlproveedoresLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ControlProveedores controlproveedoresLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				controlproveedoresLocal=this.controlproveedores;
			} else {
				controlproveedoresLocal=this.controlproveedoresAnterior;
			}
		}
		
		if(this.permiteMantenimiento(controlproveedoresLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoControlProveedores(controlproveedoresLocal,true);
					
					if(controlproveedoresSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(controlproveedoresLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(controlproveedoresLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoControlProveedores(ControlProveedores controlproveedores,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualControlProveedores(controlproveedores,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(controlproveedores);
	}
	
	public void setVariablesFormularioToObjetoActualControlProveedores(ControlProveedores controlproveedores,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualControlProveedores(controlproveedores,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualControlProveedores(ControlProveedores controlproveedores,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormControlProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormControlProveedores.jLabelidControlProveedores.getText()==null || this.jInternalFrameDetalleFormControlProveedores.jLabelidControlProveedores.getText()=="" || this.jInternalFrameDetalleFormControlProveedores.jLabelidControlProveedores.getText()=="Id") {
				this.jInternalFrameDetalleFormControlProveedores.jLabelidControlProveedores.setText("0");
			}

			if(conColumnasBase) {controlproveedores.setId(Long.parseLong(this.jInternalFrameDetalleFormControlProveedores.jLabelidControlProveedores.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ControlProveedoresConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlProveedores.jLabelIdControlProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			controlproveedores.setnombre_zona(this.jInternalFrameDetalleFormControlProveedores.jTextFieldnombre_zonaControlProveedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ControlProveedoresConstantesFunciones.LABEL_NOMBREZONA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlProveedores.jLabelnombre_zonaControlProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			controlproveedores.setnombre_ciudad(this.jInternalFrameDetalleFormControlProveedores.jTextAreanombre_ciudadControlProveedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ControlProveedoresConstantesFunciones.LABEL_NOMBRECIUDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlProveedores.jLabelnombre_ciudadControlProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			controlproveedores.setnombre_grupo_cliente(this.jInternalFrameDetalleFormControlProveedores.jTextAreanombre_grupo_clienteControlProveedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ControlProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlProveedores.jLabelnombre_grupo_clienteControlProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			controlproveedores.setcodigo(this.jInternalFrameDetalleFormControlProveedores.jTextFieldcodigoControlProveedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ControlProveedoresConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlProveedores.jLabelcodigoControlProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			controlproveedores.setnombre_cliente(this.jInternalFrameDetalleFormControlProveedores.jTextAreanombre_clienteControlProveedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ControlProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlProveedores.jLabelnombre_clienteControlProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			controlproveedores.setruc(this.jInternalFrameDetalleFormControlProveedores.jTextFieldrucControlProveedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ControlProveedoresConstantesFunciones.LABEL_RUC+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlProveedores.jLabelrucControlProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			controlproveedores.settelefonos(this.jInternalFrameDetalleFormControlProveedores.jTextAreatelefonosControlProveedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ControlProveedoresConstantesFunciones.LABEL_TELEFONOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlProveedores.jLabeltelefonosControlProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			controlproveedores.setdirecciones(this.jInternalFrameDetalleFormControlProveedores.jTextAreadireccionesControlProveedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ControlProveedoresConstantesFunciones.LABEL_DIRECCIONES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlProveedores.jLabeldireccionesControlProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			controlproveedores.setemails(this.jInternalFrameDetalleFormControlProveedores.jTextAreaemailsControlProveedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ControlProveedoresConstantesFunciones.LABEL_EMAILS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlProveedores.jLabelemailsControlProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			controlproveedores.setnumero_factura(this.jInternalFrameDetalleFormControlProveedores.jTextFieldnumero_facturaControlProveedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ControlProveedoresConstantesFunciones.LABEL_NUMEROFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlProveedores.jLabelnumero_facturaControlProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			controlproveedores.setfecha_emision(this.jInternalFrameDetalleFormControlProveedores.jDateChooserfecha_emisionControlProveedores.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ControlProveedoresConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlProveedores.jLabelfecha_emisionControlProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			controlproveedores.setfecha_venta(this.jInternalFrameDetalleFormControlProveedores.jDateChooserfecha_ventaControlProveedores.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ControlProveedoresConstantesFunciones.LABEL_FECHAVENTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlProveedores.jLabelfecha_ventaControlProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			controlproveedores.setsaldo(Double.parseDouble(this.jInternalFrameDetalleFormControlProveedores.jTextFieldsaldoControlProveedores.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ControlProveedoresConstantesFunciones.LABEL_SALDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlProveedores.jLabelsaldoControlProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			controlproveedores.setdebito_mone_local(Double.parseDouble(this.jInternalFrameDetalleFormControlProveedores.jTextFielddebito_mone_localControlProveedores.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ControlProveedoresConstantesFunciones.LABEL_DEBITOMONELOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlProveedores.jLabeldebito_mone_localControlProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			controlproveedores.setcredito_mone_local(Double.parseDouble(this.jInternalFrameDetalleFormControlProveedores.jTextFieldcredito_mone_localControlProveedores.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ControlProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormControlProveedores.jLabelcredito_mone_localControlProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualControlProveedores(ControlProveedores controlproveedoresBean,ControlProveedores controlproveedores,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosControlProveedores(ControlProveedores controlproveedoresOrigen,ControlProveedores controlproveedores,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && controlproveedoresOrigen.getId()!=null && !controlproveedoresOrigen.getId().equals(0L))) {controlproveedores.setId(controlproveedoresOrigen.getId());}}
			if(conDefault || (!conDefault && controlproveedoresOrigen.getfecha_emision_hasta()!=null && !controlproveedoresOrigen.getfecha_emision_hasta().equals(new Date()))) {controlproveedores.setfecha_emision_hasta(controlproveedoresOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && controlproveedoresOrigen.getnombre_zona()!=null && !controlproveedoresOrigen.getnombre_zona().equals(""))) {controlproveedores.setnombre_zona(controlproveedoresOrigen.getnombre_zona());}
			if(conDefault || (!conDefault && controlproveedoresOrigen.getnombre_ciudad()!=null && !controlproveedoresOrigen.getnombre_ciudad().equals(""))) {controlproveedores.setnombre_ciudad(controlproveedoresOrigen.getnombre_ciudad());}
			if(conDefault || (!conDefault && controlproveedoresOrigen.getnombre_grupo_cliente()!=null && !controlproveedoresOrigen.getnombre_grupo_cliente().equals(""))) {controlproveedores.setnombre_grupo_cliente(controlproveedoresOrigen.getnombre_grupo_cliente());}
			if(conDefault || (!conDefault && controlproveedoresOrigen.getcodigo()!=null && !controlproveedoresOrigen.getcodigo().equals(""))) {controlproveedores.setcodigo(controlproveedoresOrigen.getcodigo());}
			if(conDefault || (!conDefault && controlproveedoresOrigen.getnombre_cliente()!=null && !controlproveedoresOrigen.getnombre_cliente().equals(""))) {controlproveedores.setnombre_cliente(controlproveedoresOrigen.getnombre_cliente());}
			if(conDefault || (!conDefault && controlproveedoresOrigen.getruc()!=null && !controlproveedoresOrigen.getruc().equals(""))) {controlproveedores.setruc(controlproveedoresOrigen.getruc());}
			if(conDefault || (!conDefault && controlproveedoresOrigen.gettelefonos()!=null && !controlproveedoresOrigen.gettelefonos().equals(""))) {controlproveedores.settelefonos(controlproveedoresOrigen.gettelefonos());}
			if(conDefault || (!conDefault && controlproveedoresOrigen.getdirecciones()!=null && !controlproveedoresOrigen.getdirecciones().equals(""))) {controlproveedores.setdirecciones(controlproveedoresOrigen.getdirecciones());}
			if(conDefault || (!conDefault && controlproveedoresOrigen.getemails()!=null && !controlproveedoresOrigen.getemails().equals(""))) {controlproveedores.setemails(controlproveedoresOrigen.getemails());}
			if(conDefault || (!conDefault && controlproveedoresOrigen.getnumero_factura()!=null && !controlproveedoresOrigen.getnumero_factura().equals(""))) {controlproveedores.setnumero_factura(controlproveedoresOrigen.getnumero_factura());}
			if(conDefault || (!conDefault && controlproveedoresOrigen.getfecha_emision()!=null && !controlproveedoresOrigen.getfecha_emision().equals(new Date()))) {controlproveedores.setfecha_emision(controlproveedoresOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && controlproveedoresOrigen.getfecha_venta()!=null && !controlproveedoresOrigen.getfecha_venta().equals(new Date()))) {controlproveedores.setfecha_venta(controlproveedoresOrigen.getfecha_venta());}
			if(conDefault || (!conDefault && controlproveedoresOrigen.getsaldo()!=null && !controlproveedoresOrigen.getsaldo().equals(0.0))) {controlproveedores.setsaldo(controlproveedoresOrigen.getsaldo());}
			if(conDefault || (!conDefault && controlproveedoresOrigen.getdebito_mone_local()!=null && !controlproveedoresOrigen.getdebito_mone_local().equals(0.0))) {controlproveedores.setdebito_mone_local(controlproveedoresOrigen.getdebito_mone_local());}
			if(conDefault || (!conDefault && controlproveedoresOrigen.getcredito_mone_local()!=null && !controlproveedoresOrigen.getcredito_mone_local().equals(0.0))) {controlproveedores.setcredito_mone_local(controlproveedoresOrigen.getcredito_mone_local());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioControlProveedores(ControlProveedores controlproveedores) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormControlProveedores.jLabelidControlProveedores.setText(controlproveedores.getId().toString());
			this.jInternalFrameDetalleFormControlProveedores.jTextFieldnombre_zonaControlProveedores.setText(controlproveedores.getnombre_zona());
			this.jInternalFrameDetalleFormControlProveedores.jTextAreanombre_ciudadControlProveedores.setText(controlproveedores.getnombre_ciudad());
			this.jInternalFrameDetalleFormControlProveedores.jTextAreanombre_grupo_clienteControlProveedores.setText(controlproveedores.getnombre_grupo_cliente());
			this.jInternalFrameDetalleFormControlProveedores.jTextFieldcodigoControlProveedores.setText(controlproveedores.getcodigo());
			this.jInternalFrameDetalleFormControlProveedores.jTextAreanombre_clienteControlProveedores.setText(controlproveedores.getnombre_cliente());
			this.jInternalFrameDetalleFormControlProveedores.jTextFieldrucControlProveedores.setText(controlproveedores.getruc());
			this.jInternalFrameDetalleFormControlProveedores.jTextAreatelefonosControlProveedores.setText(controlproveedores.gettelefonos());
			this.jInternalFrameDetalleFormControlProveedores.jTextAreadireccionesControlProveedores.setText(controlproveedores.getdirecciones());
			this.jInternalFrameDetalleFormControlProveedores.jTextAreaemailsControlProveedores.setText(controlproveedores.getemails());
			this.jInternalFrameDetalleFormControlProveedores.jTextFieldnumero_facturaControlProveedores.setText(controlproveedores.getnumero_factura());
			this.jInternalFrameDetalleFormControlProveedores.jDateChooserfecha_emisionControlProveedores.setDate(controlproveedores.getfecha_emision());
			this.jInternalFrameDetalleFormControlProveedores.jDateChooserfecha_ventaControlProveedores.setDate(controlproveedores.getfecha_venta());
			this.jInternalFrameDetalleFormControlProveedores.jTextFieldsaldoControlProveedores.setText(controlproveedores.getsaldo().toString());
			this.jInternalFrameDetalleFormControlProveedores.jTextFielddebito_mone_localControlProveedores.setText(controlproveedores.getdebito_mone_local().toString());
			this.jInternalFrameDetalleFormControlProveedores.jTextFieldcredito_mone_localControlProveedores.setText(controlproveedores.getcredito_mone_local().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioControlProveedores(ControlProveedoresBean controlproveedoresBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormControlProveedores.jLabelidControlProveedores.setText(controlproveedoresBean.getId().toString());
			this.jInternalFrameDetalleFormControlProveedores.jTextFieldnombre_zonaControlProveedores.setText(controlproveedoresBean.getnombre_zona());
			this.jInternalFrameDetalleFormControlProveedores.jTextAreanombre_ciudadControlProveedores.setText(controlproveedoresBean.getnombre_ciudad());
			this.jInternalFrameDetalleFormControlProveedores.jTextAreanombre_grupo_clienteControlProveedores.setText(controlproveedoresBean.getnombre_grupo_cliente());
			this.jInternalFrameDetalleFormControlProveedores.jTextFieldcodigoControlProveedores.setText(controlproveedoresBean.getcodigo());
			this.jInternalFrameDetalleFormControlProveedores.jTextAreanombre_clienteControlProveedores.setText(controlproveedoresBean.getnombre_cliente());
			this.jInternalFrameDetalleFormControlProveedores.jTextFieldrucControlProveedores.setText(controlproveedoresBean.getruc());
			this.jInternalFrameDetalleFormControlProveedores.jTextAreatelefonosControlProveedores.setText(controlproveedoresBean.gettelefonos());
			this.jInternalFrameDetalleFormControlProveedores.jTextAreadireccionesControlProveedores.setText(controlproveedoresBean.getdirecciones());
			this.jInternalFrameDetalleFormControlProveedores.jTextAreaemailsControlProveedores.setText(controlproveedoresBean.getemails());
			this.jInternalFrameDetalleFormControlProveedores.jTextFieldnumero_facturaControlProveedores.setText(controlproveedoresBean.getnumero_factura());
			this.jInternalFrameDetalleFormControlProveedores.jDateChooserfecha_emisionControlProveedores.setDate(controlproveedoresBean.getfecha_emision());
			this.jInternalFrameDetalleFormControlProveedores.jDateChooserfecha_ventaControlProveedores.setDate(controlproveedoresBean.getfecha_venta());
			this.jInternalFrameDetalleFormControlProveedores.jTextFieldsaldoControlProveedores.setText(controlproveedoresBean.getsaldo().toString());
			this.jInternalFrameDetalleFormControlProveedores.jTextFielddebito_mone_localControlProveedores.setText(controlproveedoresBean.getdebito_mone_local().toString());
			this.jInternalFrameDetalleFormControlProveedores.jTextFieldcredito_mone_localControlProveedores.setText(controlproveedoresBean.getcredito_mone_local().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanControlProveedores(ControlProveedoresParameterReturnGeneral controlproveedoresReturnGeneral,ControlProveedoresBean controlproveedoresBean,Boolean conDefault) throws Exception { 
		try {
			ControlProveedores controlproveedoresLocal=new ControlProveedores();
			
			controlproveedoresLocal=controlproveedoresReturnGeneral.getControlProveedores();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && controlproveedoresLocal.getId()!=null && !controlproveedoresLocal.getId().equals(0L))) {controlproveedoresBean.setId(controlproveedoresLocal.getId());}}
			if(conDefault || (!conDefault && controlproveedoresLocal.getnombre_zona()!=null && !controlproveedoresLocal.getnombre_zona().equals(""))) {controlproveedoresBean.setnombre_zona(controlproveedoresLocal.getnombre_zona());}
			if(conDefault || (!conDefault && controlproveedoresLocal.getnombre_ciudad()!=null && !controlproveedoresLocal.getnombre_ciudad().equals(""))) {controlproveedoresBean.setnombre_ciudad(controlproveedoresLocal.getnombre_ciudad());}
			if(conDefault || (!conDefault && controlproveedoresLocal.getnombre_grupo_cliente()!=null && !controlproveedoresLocal.getnombre_grupo_cliente().equals(""))) {controlproveedoresBean.setnombre_grupo_cliente(controlproveedoresLocal.getnombre_grupo_cliente());}
			if(conDefault || (!conDefault && controlproveedoresLocal.getcodigo()!=null && !controlproveedoresLocal.getcodigo().equals(""))) {controlproveedoresBean.setcodigo(controlproveedoresLocal.getcodigo());}
			if(conDefault || (!conDefault && controlproveedoresLocal.getnombre_cliente()!=null && !controlproveedoresLocal.getnombre_cliente().equals(""))) {controlproveedoresBean.setnombre_cliente(controlproveedoresLocal.getnombre_cliente());}
			if(conDefault || (!conDefault && controlproveedoresLocal.getruc()!=null && !controlproveedoresLocal.getruc().equals(""))) {controlproveedoresBean.setruc(controlproveedoresLocal.getruc());}
			if(conDefault || (!conDefault && controlproveedoresLocal.gettelefonos()!=null && !controlproveedoresLocal.gettelefonos().equals(""))) {controlproveedoresBean.settelefonos(controlproveedoresLocal.gettelefonos());}
			if(conDefault || (!conDefault && controlproveedoresLocal.getdirecciones()!=null && !controlproveedoresLocal.getdirecciones().equals(""))) {controlproveedoresBean.setdirecciones(controlproveedoresLocal.getdirecciones());}
			if(conDefault || (!conDefault && controlproveedoresLocal.getemails()!=null && !controlproveedoresLocal.getemails().equals(""))) {controlproveedoresBean.setemails(controlproveedoresLocal.getemails());}
			if(conDefault || (!conDefault && controlproveedoresLocal.getnumero_factura()!=null && !controlproveedoresLocal.getnumero_factura().equals(""))) {controlproveedoresBean.setnumero_factura(controlproveedoresLocal.getnumero_factura());}
			if(conDefault || (!conDefault && controlproveedoresLocal.getfecha_emision()!=null && !controlproveedoresLocal.getfecha_emision().equals(new Date()))) {controlproveedoresBean.setfecha_emision(controlproveedoresLocal.getfecha_emision());}
			if(conDefault || (!conDefault && controlproveedoresLocal.getfecha_venta()!=null && !controlproveedoresLocal.getfecha_venta().equals(new Date()))) {controlproveedoresBean.setfecha_venta(controlproveedoresLocal.getfecha_venta());}
			if(conDefault || (!conDefault && controlproveedoresLocal.getsaldo()!=null && !controlproveedoresLocal.getsaldo().equals(0.0))) {controlproveedoresBean.setsaldo(controlproveedoresLocal.getsaldo());}
			if(conDefault || (!conDefault && controlproveedoresLocal.getdebito_mone_local()!=null && !controlproveedoresLocal.getdebito_mone_local().equals(0.0))) {controlproveedoresBean.setdebito_mone_local(controlproveedoresLocal.getdebito_mone_local());}
			if(conDefault || (!conDefault && controlproveedoresLocal.getcredito_mone_local()!=null && !controlproveedoresLocal.getcredito_mone_local().equals(0.0))) {controlproveedoresBean.setcredito_mone_local(controlproveedoresLocal.getcredito_mone_local());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxControlProveedoresGenerico(Long idControlProveedoresSeleccionado,JComboBox jComboBoxControlProveedores,List<ControlProveedores> controlproveedoressLocal)throws Exception {
		try {
			ControlProveedores  controlproveedoresTemp=null;

			for(ControlProveedores controlproveedoresAux:controlproveedoressLocal) {
				if(controlproveedoresAux.getId()!=null && controlproveedoresAux.getId().equals(idControlProveedoresSeleccionado)) {
					controlproveedoresTemp=controlproveedoresAux;
					break;
				}
			}

			jComboBoxControlProveedores.setSelectedItem(controlproveedoresTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxControlProveedoresGenerico(JComboBox jComboBoxControlProveedores,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxControlProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxControlProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxControlProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxControlProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxControlProveedores.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxControlProveedores.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxControlProveedores.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxControlProveedores.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxControlProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxControlProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			controlproveedores=(ControlProveedores) controlproveedoresLogic.getControlProveedoress().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			controlproveedores =(ControlProveedores) controlproveedoress.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!controlproveedores.getIsNew() && !controlproveedores.getIsChanged() && !controlproveedores.getIsDeleted()) {
				sDescripcion=controlproveedores.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=controlproveedores.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ControlProveedores controlproveedoresRow=new ControlProveedores();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			controlproveedoresRow=(ControlProveedores) controlproveedoresLogic.getControlProveedoress().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			controlproveedoresRow=(ControlProveedores) controlproveedoress.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualControlProveedores(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoControlProveedores.setVisible((this.isVisibilidadCeldaNuevoControlProveedores && this.isPermisoNuevoControlProveedores));			
			this.jButtonDuplicarControlProveedores.setVisible((this.isVisibilidadCeldaDuplicarControlProveedores && this.isPermisoDuplicarControlProveedores));			
			this.jButtonCopiarControlProveedores.setVisible((this.isVisibilidadCeldaCopiarControlProveedores && this.isPermisoCopiarControlProveedores));
			this.jButtonVerFormControlProveedores.setVisible((this.isVisibilidadCeldaVerFormControlProveedores && this.isPermisoVerFormControlProveedores));
			
			this.jButtonAbrirOrderByControlProveedores.setVisible((this.isVisibilidadCeldaOrdenControlProveedores && this.isPermisoOrdenControlProveedores));			
			
			this.jButtonNuevoRelacionesControlProveedores.setVisible((this.isVisibilidadCeldaNuevoRelacionesControlProveedores && this.isPermisoNuevoControlProveedores));			
			this.jButtonNuevoGuardarCambiosControlProveedores.setVisible((this.isVisibilidadCeldaNuevoControlProveedores && this.isPermisoNuevoControlProveedores && this.isPermisoGuardarCambiosControlProveedores));
			
			if(this.jInternalFrameDetalleFormControlProveedores!=null) {
			this.jInternalFrameDetalleFormControlProveedores.jButtonModificarControlProveedores.setVisible((this.isVisibilidadCeldaModificarControlProveedores && this.isPermisoActualizarControlProveedores));	
			this.jInternalFrameDetalleFormControlProveedores.jButtonActualizarControlProveedores.setVisible((this.isVisibilidadCeldaActualizarControlProveedores && this.isPermisoActualizarControlProveedores));	
			this.jInternalFrameDetalleFormControlProveedores.jButtonEliminarControlProveedores.setVisible((this.isVisibilidadCeldaEliminarControlProveedores && this.isPermisoEliminarControlProveedores));
			this.jInternalFrameDetalleFormControlProveedores.jButtonCancelarControlProveedores.setVisible(this.isVisibilidadCeldaCancelarControlProveedores);							
			this.jInternalFrameDetalleFormControlProveedores.jButtonGuardarCambiosControlProveedores.setVisible((this.isVisibilidadCeldaGuardarControlProveedores && this.isPermisoGuardarCambiosControlProveedores));			
			
			}
						
			this.jButtonGuardarCambiosTablaControlProveedores.setVisible((this.isVisibilidadCeldaGuardarCambiosControlProveedores && this.isPermisoGuardarCambiosControlProveedores));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarControlProveedores.setVisible((this.isVisibilidadCeldaNuevoControlProveedores && this.isPermisoNuevoControlProveedores));						
			this.jButtonDuplicarToolBarControlProveedores.setVisible((this.isVisibilidadCeldaDuplicarControlProveedores && this.isPermisoDuplicarControlProveedores));						
			this.jButtonCopiarToolBarControlProveedores.setVisible((this.isVisibilidadCeldaCopiarControlProveedores && this.isPermisoCopiarControlProveedores));			
			this.jButtonVerFormToolBarControlProveedores.setVisible((this.isVisibilidadCeldaVerFormControlProveedores && this.isPermisoVerFormControlProveedores));			
			this.jButtonAbrirOrderByToolBarControlProveedores.setVisible((this.isVisibilidadCeldaOrdenControlProveedores && this.isPermisoOrdenControlProveedores));
			this.jButtonNuevoRelacionesToolBarControlProveedores.setVisible((this.isVisibilidadCeldaNuevoRelacionesControlProveedores && this.isPermisoNuevoControlProveedores));			
			this.jButtonNuevoGuardarCambiosToolBarControlProveedores.setVisible((this.isVisibilidadCeldaNuevoControlProveedores && this.isPermisoNuevoControlProveedores && this.isPermisoGuardarCambiosControlProveedores));			
			
			if(this.jInternalFrameDetalleFormControlProveedores!=null) {
			this.jInternalFrameDetalleFormControlProveedores.jButtonModificarToolBarControlProveedores.setVisible((this.isVisibilidadCeldaModificarControlProveedores && this.isPermisoActualizarControlProveedores));	
			this.jInternalFrameDetalleFormControlProveedores.jButtonActualizarToolBarControlProveedores.setVisible((this.isVisibilidadCeldaActualizarControlProveedores  && this.isPermisoActualizarControlProveedores));	
			this.jInternalFrameDetalleFormControlProveedores.jButtonEliminarToolBarControlProveedores.setVisible((this.isVisibilidadCeldaEliminarControlProveedores && this.isPermisoEliminarControlProveedores));
			this.jInternalFrameDetalleFormControlProveedores.jButtonCancelarToolBarControlProveedores.setVisible(this.isVisibilidadCeldaCancelarControlProveedores);				
			this.jInternalFrameDetalleFormControlProveedores.jButtonGuardarCambiosToolBarControlProveedores.setVisible((this.isVisibilidadCeldaGuardarControlProveedores && this.isPermisoGuardarCambiosControlProveedores));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarControlProveedores.setVisible((this.isVisibilidadCeldaGuardarCambiosControlProveedores && this.isPermisoGuardarCambiosControlProveedores));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoControlProveedores.setVisible((this.isVisibilidadCeldaNuevoControlProveedores && this.isPermisoNuevoControlProveedores));			
			this.jMenuItemDuplicarControlProveedores.setVisible((this.isVisibilidadCeldaDuplicarControlProveedores && this.isPermisoDuplicarControlProveedores));			
			this.jMenuItemCopiarControlProveedores.setVisible((this.isVisibilidadCeldaCopiarControlProveedores && this.isPermisoCopiarControlProveedores));			
			this.jMenuItemVerFormControlProveedores.setVisible((this.isVisibilidadCeldaVerFormControlProveedores && this.isPermisoVerFormControlProveedores));			
			this.jMenuItemAbrirOrderByControlProveedores.setVisible((this.isVisibilidadCeldaOrdenControlProveedores && this.isPermisoOrdenControlProveedores));			
			//this.jMenuItemMostrarOcultarControlProveedores.setVisible((this.isVisibilidadCeldaOrdenControlProveedores && this.isPermisoOrdenControlProveedores));
			this.jMenuItemDetalleAbrirOrderByControlProveedores.setVisible((this.isVisibilidadCeldaOrdenControlProveedores && this.isPermisoOrdenControlProveedores));			
			//this.jMenuItemDetalleMostrarOcultarControlProveedores.setVisible((this.isVisibilidadCeldaOrdenControlProveedores && this.isPermisoOrdenControlProveedores));			
			this.jMenuItemNuevoRelacionesControlProveedores.setVisible((this.isVisibilidadCeldaNuevoRelacionesControlProveedores && this.isPermisoNuevoControlProveedores));			
			this.jMenuItemNuevoGuardarCambiosControlProveedores.setVisible((this.isVisibilidadCeldaNuevoControlProveedores && this.isPermisoNuevoControlProveedores && this.isPermisoGuardarCambiosControlProveedores));									
			
			if(this.jInternalFrameDetalleFormControlProveedores!=null) {
			this.jInternalFrameDetalleFormControlProveedores.jMenuItemModificarControlProveedores.setVisible((this.isVisibilidadCeldaModificarControlProveedores && this.isPermisoActualizarControlProveedores));	
			this.jInternalFrameDetalleFormControlProveedores.jMenuItemActualizarControlProveedores.setVisible((this.isVisibilidadCeldaActualizarControlProveedores && this.isPermisoActualizarControlProveedores));	
			this.jInternalFrameDetalleFormControlProveedores.jMenuItemEliminarControlProveedores.setVisible((this.isVisibilidadCeldaEliminarControlProveedores && this.isPermisoEliminarControlProveedores));
			this.jInternalFrameDetalleFormControlProveedores.jMenuItemCancelarControlProveedores.setVisible(this.isVisibilidadCeldaCancelarControlProveedores);				
			}
			
			this.jMenuItemGuardarCambiosControlProveedores.setVisible((this.isVisibilidadCeldaGuardarControlProveedores && this.isPermisoGuardarCambiosControlProveedores));						
			this.jMenuItemGuardarCambiosTablaControlProveedores.setVisible((this.isVisibilidadCeldaGuardarCambiosControlProveedores && this.isPermisoGuardarCambiosControlProveedores));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoControlProveedores=this.jButtonNuevoControlProveedores.isVisible();
			this.isVisibilidadCeldaDuplicarControlProveedores=this.jButtonDuplicarControlProveedores.isVisible();
			this.isVisibilidadCeldaCopiarControlProveedores=this.jButtonCopiarControlProveedores.isVisible();
			this.isVisibilidadCeldaVerFormControlProveedores=this.jButtonVerFormControlProveedores.isVisible();
			
			this.isVisibilidadCeldaOrdenControlProveedores=this.jButtonAbrirOrderByControlProveedores.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesControlProveedores=this.jButtonNuevoRelacionesControlProveedores.isVisible();
			this.isVisibilidadCeldaModificarControlProveedores=this.jButtonModificarControlProveedores.isVisible();
			
			if(this.jInternalFrameDetalleFormControlProveedores!=null) {
			this.isVisibilidadCeldaActualizarControlProveedores=this.jInternalFrameDetalleFormControlProveedores.jButtonActualizarControlProveedores.isVisible();
			this.isVisibilidadCeldaEliminarControlProveedores=this.jInternalFrameDetalleFormControlProveedores.jButtonEliminarControlProveedores.isVisible();
			this.isVisibilidadCeldaCancelarControlProveedores=this.jInternalFrameDetalleFormControlProveedores.jButtonCancelarControlProveedores.isVisible();
			this.isVisibilidadCeldaGuardarControlProveedores=this.jInternalFrameDetalleFormControlProveedores.jButtonGuardarCambiosControlProveedores.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosControlProveedores=this.jButtonGuardarCambiosTablaControlProveedores.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoControlProveedores=this.jButtonNuevoToolBarControlProveedores.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesControlProveedores=this.jButtonNuevoRelacionesToolBarControlProveedores.isVisible();
			
			if(this.jInternalFrameDetalleFormControlProveedores!=null) {
			this.isVisibilidadCeldaModificarControlProveedores=this.jInternalFrameDetalleFormControlProveedores.jButtonModificarToolBarControlProveedores.isVisible();
			this.isVisibilidadCeldaActualizarControlProveedores=this.jInternalFrameDetalleFormControlProveedores.jButtonActualizarToolBarControlProveedores.isVisible();
			this.isVisibilidadCeldaEliminarControlProveedores=this.jInternalFrameDetalleFormControlProveedores.jButtonEliminarToolBarControlProveedores.isVisible();
			this.isVisibilidadCeldaCancelarControlProveedores=this.jInternalFrameDetalleFormControlProveedores.jButtonCancelarToolBarControlProveedores.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarControlProveedores=this.jButtonGuardarCambiosToolBarControlProveedores.isVisible();
			this.isVisibilidadCeldaGuardarCambiosControlProveedores=this.jButtonGuardarCambiosTablaToolBarControlProveedores.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoControlProveedores=this.jMenuItemNuevoControlProveedores.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesControlProveedores=this.jMenuItemNuevoRelacionesControlProveedores.isVisible();
			
			if(this.jInternalFrameDetalleFormControlProveedores!=null) {
			this.isVisibilidadCeldaModificarControlProveedores=this.jInternalFrameDetalleFormControlProveedores.jMenuItemModificarControlProveedores.isVisible();
			this.isVisibilidadCeldaActualizarControlProveedores=this.jInternalFrameDetalleFormControlProveedores.jMenuItemActualizarControlProveedores.isVisible();
			this.isVisibilidadCeldaEliminarControlProveedores=this.jInternalFrameDetalleFormControlProveedores.jMenuItemEliminarControlProveedores.isVisible();
			this.isVisibilidadCeldaCancelarControlProveedores=this.jInternalFrameDetalleFormControlProveedores.jMenuItemCancelarControlProveedores.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarControlProveedores=this.jMenuItemGuardarCambiosControlProveedores.isVisible();
			this.isVisibilidadCeldaGuardarCambiosControlProveedores=this.jMenuItemGuardarCambiosTablaControlProveedores.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesControlProveedores(Boolean esInicializar) {
		if(ControlProveedoresJInternalFrame.ISBINDING_MANUAL) {			
			if(this.controlproveedoresSessionBean.getConGuardarRelaciones()) {
				//if(this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesControlProveedores();
			}
			
			this.inicializarActualizarBindingBotonesManualControlProveedores(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualControlProveedores() {
		this.jButtonNuevoControlProveedores.setVisible(this.isPermisoNuevoControlProveedores);			
		this.jButtonDuplicarControlProveedores.setVisible(this.isPermisoDuplicarControlProveedores);			
		this.jButtonCopiarControlProveedores.setVisible(this.isPermisoCopiarControlProveedores);			
		this.jButtonVerFormControlProveedores.setVisible(this.isPermisoVerFormControlProveedores);			
		
		this.jButtonAbrirOrderByControlProveedores.setVisible(this.isPermisoOrdenControlProveedores);					
		
		this.jButtonNuevoRelacionesControlProveedores.setVisible(this.isPermisoNuevoControlProveedores);			
		
		if(this.jInternalFrameDetalleFormControlProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormControlProveedores.jButtonModificarControlProveedores.setVisible(this.isPermisoActualizarControlProveedores);	
			this.jInternalFrameDetalleFormControlProveedores.jButtonActualizarControlProveedores.setVisible(this.isPermisoActualizarControlProveedores);	
			this.jInternalFrameDetalleFormControlProveedores.jButtonEliminarControlProveedores.setVisible(this.isPermisoEliminarControlProveedores);
			this.jInternalFrameDetalleFormControlProveedores.jButtonCancelarControlProveedores.setVisible(this.isVisibilidadCeldaCancelarControlProveedores);						
			this.jInternalFrameDetalleFormControlProveedores.jButtonGuardarCambiosControlProveedores.setVisible(this.isPermisoGuardarCambiosControlProveedores);							
		}
		
		this.jButtonGuardarCambiosTablaControlProveedores.setVisible(this.isPermisoActualizarControlProveedores);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleControlProveedores() {
		this.jInternalFrameDetalleFormControlProveedores.jButtonModificarControlProveedores.setVisible(this.isPermisoActualizarControlProveedores);	
		this.jInternalFrameDetalleFormControlProveedores.jButtonActualizarControlProveedores.setVisible(this.isPermisoActualizarControlProveedores);	
		this.jInternalFrameDetalleFormControlProveedores.jButtonEliminarControlProveedores.setVisible(this.isPermisoEliminarControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jButtonCancelarControlProveedores.setVisible(this.isVisibilidadCeldaCancelarControlProveedores);							
		this.jInternalFrameDetalleFormControlProveedores.jButtonGuardarCambiosControlProveedores.setVisible((this.isVisibilidadCeldaGuardarControlProveedores && this.isPermisoGuardarCambiosControlProveedores));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosControlProveedores() {
		if(ControlProveedoresJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualControlProveedores();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesControlProveedores() {
	}
	
	public void jTableDatosControlProveedoresListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarControlProveedores(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidControlProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualControlProveedores(this.getcontrolproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.controlproveedores==null) {
						this.controlproveedores = new ControlProveedores();
					}

					this.setVariablesFormularioToObjetoActualControlProveedores(this.controlproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
				}

				if(this.controlproveedores.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.controlproveedores.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingControlProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaControlProveedoresUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebControlProveedores(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosControlProveedores.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosControlProveedores.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedores =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.controlproveedores =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualControlProveedores(this.getcontrolproveedores(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.controlproveedoresLogic.getConnexion());

				if(this.controlproveedores.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.controlproveedores.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderControlProveedores=(TitledBorder)this.jScrollPanelDatosControlProveedores.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderControlProveedores.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaControlProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualControlProveedores(this.getcontrolproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.controlproveedores==null) {
						this.controlproveedores = new ControlProveedores();
					}

					this.setVariablesFormularioToObjetoActualControlProveedores(this.controlproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
				}

				if(this.controlproveedores.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.controlproveedores.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingControlProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaControlProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualControlProveedores(this.getcontrolproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.controlproveedores==null) {
						this.controlproveedores = new ControlProveedores();
					}

					this.setVariablesFormularioToObjetoActualControlProveedores(this.controlproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
				}

				if(this.controlproveedores.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.controlproveedores.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingControlProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_zonaControlProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualControlProveedores(this.getcontrolproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.controlproveedores==null) {
						this.controlproveedores = new ControlProveedores();
					}

					this.setVariablesFormularioToObjetoActualControlProveedores(this.controlproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
				}

				if(this.controlproveedores.getnombre_zona()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_zona like '%"+this.controlproveedores.getnombre_zona()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingControlProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_ciudadControlProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualControlProveedores(this.getcontrolproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.controlproveedores==null) {
						this.controlproveedores = new ControlProveedores();
					}

					this.setVariablesFormularioToObjetoActualControlProveedores(this.controlproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
				}

				if(this.controlproveedores.getnombre_ciudad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_ciudad like '%"+this.controlproveedores.getnombre_ciudad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingControlProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_grupo_clienteControlProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualControlProveedores(this.getcontrolproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.controlproveedores==null) {
						this.controlproveedores = new ControlProveedores();
					}

					this.setVariablesFormularioToObjetoActualControlProveedores(this.controlproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
				}

				if(this.controlproveedores.getnombre_grupo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_grupo_cliente like '%"+this.controlproveedores.getnombre_grupo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingControlProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoControlProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualControlProveedores(this.getcontrolproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.controlproveedores==null) {
						this.controlproveedores = new ControlProveedores();
					}

					this.setVariablesFormularioToObjetoActualControlProveedores(this.controlproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
				}

				if(this.controlproveedores.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.controlproveedores.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingControlProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_clienteControlProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualControlProveedores(this.getcontrolproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.controlproveedores==null) {
						this.controlproveedores = new ControlProveedores();
					}

					this.setVariablesFormularioToObjetoActualControlProveedores(this.controlproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
				}

				if(this.controlproveedores.getnombre_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cliente like '%"+this.controlproveedores.getnombre_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingControlProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonrucControlProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualControlProveedores(this.getcontrolproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.controlproveedores==null) {
						this.controlproveedores = new ControlProveedores();
					}

					this.setVariablesFormularioToObjetoActualControlProveedores(this.controlproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
				}

				if(this.controlproveedores.getruc()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc like '%"+this.controlproveedores.getruc()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingControlProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefonosControlProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualControlProveedores(this.getcontrolproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.controlproveedores==null) {
						this.controlproveedores = new ControlProveedores();
					}

					this.setVariablesFormularioToObjetoActualControlProveedores(this.controlproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
				}

				if(this.controlproveedores.gettelefonos()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefonos like '%"+this.controlproveedores.gettelefonos()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingControlProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccionesControlProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualControlProveedores(this.getcontrolproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.controlproveedores==null) {
						this.controlproveedores = new ControlProveedores();
					}

					this.setVariablesFormularioToObjetoActualControlProveedores(this.controlproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
				}

				if(this.controlproveedores.getdirecciones()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direcciones like '%"+this.controlproveedores.getdirecciones()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingControlProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonemailsControlProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualControlProveedores(this.getcontrolproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.controlproveedores==null) {
						this.controlproveedores = new ControlProveedores();
					}

					this.setVariablesFormularioToObjetoActualControlProveedores(this.controlproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
				}

				if(this.controlproveedores.getemails()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where emails like '%"+this.controlproveedores.getemails()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingControlProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_facturaControlProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualControlProveedores(this.getcontrolproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.controlproveedores==null) {
						this.controlproveedores = new ControlProveedores();
					}

					this.setVariablesFormularioToObjetoActualControlProveedores(this.controlproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
				}

				if(this.controlproveedores.getnumero_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_factura like '%"+this.controlproveedores.getnumero_factura()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingControlProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionControlProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualControlProveedores(this.getcontrolproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.controlproveedores==null) {
						this.controlproveedores = new ControlProveedores();
					}

					this.setVariablesFormularioToObjetoActualControlProveedores(this.controlproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
				}

				if(this.controlproveedores.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.controlproveedores.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingControlProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_ventaControlProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualControlProveedores(this.getcontrolproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.controlproveedores==null) {
						this.controlproveedores = new ControlProveedores();
					}

					this.setVariablesFormularioToObjetoActualControlProveedores(this.controlproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
				}

				if(this.controlproveedores.getfecha_venta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_venta = '"+Funciones2.getStringPostgresDate(this.controlproveedores.getfecha_venta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingControlProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsaldoControlProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualControlProveedores(this.getcontrolproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.controlproveedores==null) {
						this.controlproveedores = new ControlProveedores();
					}

					this.setVariablesFormularioToObjetoActualControlProveedores(this.controlproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
				}

				if(this.controlproveedores.getsaldo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where saldo = "+this.controlproveedores.getsaldo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingControlProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondebito_mone_localControlProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualControlProveedores(this.getcontrolproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.controlproveedores==null) {
						this.controlproveedores = new ControlProveedores();
					}

					this.setVariablesFormularioToObjetoActualControlProveedores(this.controlproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
				}

				if(this.controlproveedores.getdebito_mone_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where debito_mone_local = "+this.controlproveedores.getdebito_mone_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingControlProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncredito_mone_localControlProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualControlProveedores(this.getcontrolproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.controlproveedores =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.controlproveedores==null) {
						this.controlproveedores = new ControlProveedores();
					}

					this.setVariablesFormularioToObjetoActualControlProveedores(this.controlproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);
				}

				if(this.controlproveedores.getcredito_mone_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where credito_mone_local = "+this.controlproveedores.getcredito_mone_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingControlProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaControlProveedoresControlProveedoresActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingControlProveedores(false,false);

			this.getControlProveedoressBusquedaControlProveedores();

			this.inicializarActualizarBindingControlProveedores(false);

			//if(ControlProveedoresBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingControlProveedores(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaControlProveedoresActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingControlProveedores(false,false);

			this.getControlProveedoressFK_IdEmpresa();

			this.inicializarActualizarBindingControlProveedores(false);

			//if(ControlProveedoresBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingControlProveedores(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.controlproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameControlProveedores() {
		if(this.jInternalFrameDetalleFormControlProveedores!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormControlProveedores!=null) {
			this.jInternalFrameDetalleFormControlProveedores.setVisible(false);	    			
			this.jInternalFrameDetalleFormControlProveedores.dispose();
			this.jInternalFrameDetalleFormControlProveedores=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoControlProveedores!=null) {
			this.jInternalFrameReporteDinamicoControlProveedores.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoControlProveedores.dispose();
			this.jInternalFrameReporteDinamicoControlProveedores=null;
		}
		
		if(this.jInternalFrameImportacionControlProveedores!=null) {
			this.jInternalFrameImportacionControlProveedores.setVisible(false);	    			
			this.jInternalFrameImportacionControlProveedores.dispose();
			this.jInternalFrameImportacionControlProveedores=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessControlProveedores();
			
			ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
			
			
			if(sTipo.equals("NuevoControlProveedores")) {
				jButtonNuevoControlProveedoresActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarControlProveedores")) {
				jButtonDuplicarControlProveedoresActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarControlProveedores")) {
				jButtonCopiarControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("VerFormControlProveedores")) {
				jButtonVerFormControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarControlProveedores")) {
				jButtonNuevoControlProveedoresActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarControlProveedores")) {
				jButtonDuplicarControlProveedoresActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoControlProveedores")) {
				jButtonNuevoControlProveedoresActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarControlProveedores")) {
				jButtonDuplicarControlProveedoresActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesControlProveedores")) {
				jButtonNuevoControlProveedoresActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarControlProveedores")) {
				jButtonNuevoControlProveedoresActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesControlProveedores")) {
				jButtonNuevoControlProveedoresActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarControlProveedores")) {
				jButtonModificarControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarControlProveedores")) {
				jButtonModificarControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarControlProveedores")) {
				jButtonModificarControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("ActualizarControlProveedores")) {
				jButtonActualizarControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarControlProveedores")) {
				jButtonActualizarControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarControlProveedores")) {
				jButtonActualizarControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("EliminarControlProveedores")) {
				jButtonEliminarControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarControlProveedores")) {
				jButtonEliminarControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarControlProveedores")) {
				jButtonEliminarControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("CancelarControlProveedores")) {
				jButtonCancelarControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarControlProveedores")) {
				jButtonCancelarControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarControlProveedores")) {
				jButtonCancelarControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("CerrarControlProveedores")) {
				jButtonCerrarControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarControlProveedores")) {
				jButtonCerrarControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarControlProveedores")) {
				jButtonCerrarControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarControlProveedores")) {
				jButtonMostrarOcultarControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarControlProveedores")) {
				jButtonCancelarControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosControlProveedores")) {
				jButtonGuardarCambiosControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarControlProveedores")) {
				jButtonGuardarCambiosControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarControlProveedores")) {
				jButtonCopiarControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarControlProveedores")) {
				jButtonVerFormControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosControlProveedores")) {
				jButtonGuardarCambiosControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarControlProveedores")) {
				jButtonCopiarControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormControlProveedores")) {
				jButtonVerFormControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaControlProveedores")) {
				jButtonGuardarCambiosControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarControlProveedores")) {
				jButtonGuardarCambiosControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaControlProveedores")) {
				jButtonGuardarCambiosControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionControlProveedores")) {
				jButtonRecargarInformacionControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarControlProveedores")) {
				jButtonRecargarInformacionControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionControlProveedores")) {
				jButtonRecargarInformacionControlProveedoresActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresControlProveedores")) {
				jButtonAnterioresControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarControlProveedores")) {
				jButtonAnterioresControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreControlProveedores")) {
				jButtonAnterioresControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("SiguientesControlProveedores")) {
				jButtonSiguientesControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarControlProveedores")) {
				jButtonSiguientesControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesControlProveedores")) {
				jButtonSiguientesControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByControlProveedores") || sTipo.equals("MenuItemDetalleAbrirOrderByControlProveedores")) {
				jButtonAbrirOrderByControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarControlProveedores") || sTipo.equals("MenuItemDetalleMostrarOcultarControlProveedores")) {
				jButtonMostrarOcultarControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosControlProveedores")) {
				jButtonNuevoGuardarCambiosControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarControlProveedores")) {
				jButtonNuevoGuardarCambiosControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosControlProveedores")) {
				jButtonNuevoGuardarCambiosControlProveedoresActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoControlProveedores")) {
				jButtonCerrarReporteDinamicoControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoControlProveedores")) {
				jButtonGenerarReporteDinamicoControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoControlProveedores")) {
				
				jButtonGenerarExcelReporteDinamicoControlProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionControlProveedores")) {
				jButtonCerrarImportacionControlProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionControlProveedores")) {
				
				jButtonGenerarImportacionControlProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionControlProveedores")) {
				
				jButtonAbrirImportacionControlProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesControlProveedores")) {
				jComboBoxTiposAccionesControlProveedoresActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesControlProveedores")) {
				jComboBoxTiposRelacionesControlProveedoresActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioControlProveedores")) {
				jComboBoxTiposAccionesControlProveedoresActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarControlProveedores")) {
				
				jComboBoxTiposSeleccionarControlProveedoresActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralControlProveedores")) {
				jTextFieldValorCampoGeneralControlProveedoresActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByControlProveedores")) {
				jButtonAbrirOrderByControlProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarControlProveedores")) {
				jButtonAbrirOrderByControlProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByControlProveedores")) {
				jButtonCerrarOrderByControlProveedoresActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idControlProveedoresBusqueda")) {
				this.jButtonidControlProveedoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaControlProveedoresUpdate")) {
				this.jButtonid_empresaControlProveedoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaControlProveedoresBusqueda")) {
				this.jButtonid_empresaControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaControlProveedoresBusqueda")) {
				this.jButtonfecha_emision_hastaControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_zonaControlProveedoresBusqueda")) {
				this.jButtonnombre_zonaControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_ciudadControlProveedoresBusqueda")) {
				this.jButtonnombre_ciudadControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_grupo_clienteControlProveedoresBusqueda")) {
				this.jButtonnombre_grupo_clienteControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoControlProveedoresBusqueda")) {
				this.jButtoncodigoControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteControlProveedoresBusqueda")) {
				this.jButtonnombre_clienteControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucControlProveedoresBusqueda")) {
				this.jButtonrucControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonosControlProveedoresBusqueda")) {
				this.jButtontelefonosControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionesControlProveedoresBusqueda")) {
				this.jButtondireccionesControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("emailsControlProveedoresBusqueda")) {
				this.jButtonemailsControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaControlProveedoresBusqueda")) {
				this.jButtonnumero_facturaControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionControlProveedoresBusqueda")) {
				this.jButtonfecha_emisionControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ventaControlProveedoresBusqueda")) {
				this.jButtonfecha_ventaControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldoControlProveedoresBusqueda")) {
				this.jButtonsaldoControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_mone_localControlProveedoresBusqueda")) {
				this.jButtondebito_mone_localControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_mone_localControlProveedoresBusqueda")) {
				this.jButtoncredito_mone_localControlProveedoresBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaControlProveedoresControlProveedores")) {
				this.jButtonBusquedaControlProveedoresControlProveedoresActionPerformed(evt);
			}
			
			;
			
			
			ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessControlProveedores();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaControlProveedoresActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.controlproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.controlproveedores);
				
				ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
				
				


				
				ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ControlProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ControlProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ControlProveedores controlproveedoresLocal=null;
			
			if(!this.getEsControlTabla()) {
				controlproveedoresLocal=this.controlproveedores;
			} else {
				controlproveedoresLocal=this.controlproveedoresAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.controlproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.controlproveedores);
				
				ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
							
				
				


				
				ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ControlProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ControlProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaControlProveedoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresAnterior =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.controlproveedoresAnterior =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
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
			
			ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
			
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
			
			


			
			ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaControlProveedoresActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.controlproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.controlproveedores);
				
				ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
								
						
				


				
				ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ControlProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ControlProveedores.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.controlproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.controlproveedores);
				
				ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
								
				
				


				
				ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ControlProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ControlProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaControlProveedoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresAnterior =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.controlproveedoresAnterior =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.controlproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.controlproveedores);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaControlProveedoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresAnterior =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.controlproveedoresAnterior =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaControlProveedoresActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.controlproveedores);
			
			this.actualizarInformacion("INFO_PADRE",false,this.controlproveedores);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.controlproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.controlproveedores);
				
				ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
							
				
				


				
				ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ControlProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ControlProveedores.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaControlProveedoresActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.controlproveedoresAnterior =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.controlproveedoresAnterior =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
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
			
			ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
			
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
			
			


			
			ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaControlProveedoresActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.controlproveedores);
			
			this.actualizarInformacion("INFO_PADRE",false,this.controlproveedores);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.controlproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.controlproveedores);
				
				ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
								
				
				


				
				ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ControlProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ControlProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaControlProveedoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresAnterior =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.controlproveedoresAnterior =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaControlProveedoresActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.controlproveedores);
			
			this.actualizarInformacion("INFO_PADRE",false,this.controlproveedores);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaControlProveedoresActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.controlproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.controlproveedores);
				
				ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosControlProveedores")) {
					jCheckBoxSeleccionarTodosControlProveedoresItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosControlProveedores")) {
					jCheckBoxSeleccionadosControlProveedoresItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarControlProveedores")) {
					
				}
				
				


				
				
				ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ControlProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ControlProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.controlproveedores);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.controlproveedores);
				
				ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
												
				
				


				
				
				ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ControlProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ControlProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaControlProveedoresActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.controlproveedoresAnterior =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.controlproveedoresAnterior =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaControlProveedoresActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.controlproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.controlproveedores);
				
				ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
				
				
				ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
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
			
			ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
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
			
			


			
			ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaControlProveedoresActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.controlproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.controlproveedores);
				
				ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ControlProveedores.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ControlProveedores.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.controlproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.controlproveedores);
				
				ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
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
				
				


				
				ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ControlProveedores.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ControlProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaControlProveedoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.controlproveedoresAnterior =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.controlproveedoresAnterior =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarControlProveedores")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosControlProveedoresListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosControlProveedores.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.controlproveedores =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.controlproveedores =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.controlproveedores);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarControlProveedores")) {
				
				}
				
				ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarControlProveedores")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosControlProveedores.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarControlProveedores")) {
			
			}
			
			ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessControlProveedores();
			
			ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
			
			if(sTipo.equals("NuevoControlProveedores")) {
				jButtonNuevoControlProveedoresActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarControlProveedores")) {
				jButtonDuplicarControlProveedoresActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarControlProveedores")) {
				jButtonCopiarControlProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormControlProveedores")) {
				jButtonVerFormControlProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesControlProveedores")) {
				jButtonNuevoControlProveedoresActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarControlProveedores")) {
				jButtonModificarControlProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarControlProveedores")) {
				jButtonActualizarControlProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarControlProveedores")) {
				jButtonEliminarControlProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaControlProveedores")) {
				jButtonGuardarCambiosControlProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarControlProveedores")) {
				jButtonCancelarControlProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarControlProveedores")) {
				jButtonCerrarControlProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosControlProveedores")) {
				jButtonGuardarCambiosControlProveedoresActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosControlProveedores")) {
				jButtonNuevoGuardarCambiosControlProveedoresActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByControlProveedores")) {
				jButtonAbrirOrderByControlProveedoresActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionControlProveedores")) {
				jButtonRecargarInformacionControlProveedoresActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresControlProveedores")) {
				jButtonAnterioresControlProveedoresActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesControlProveedores")) {
				jButtonSiguientesControlProveedoresActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idControlProveedoresBusqueda")) {
				this.jButtonidControlProveedoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaControlProveedoresUpdate")) {
				this.jButtonid_empresaControlProveedoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaControlProveedoresBusqueda")) {
				this.jButtonid_empresaControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaControlProveedoresBusqueda")) {
				this.jButtonfecha_emision_hastaControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_zonaControlProveedoresBusqueda")) {
				this.jButtonnombre_zonaControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_ciudadControlProveedoresBusqueda")) {
				this.jButtonnombre_ciudadControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_grupo_clienteControlProveedoresBusqueda")) {
				this.jButtonnombre_grupo_clienteControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoControlProveedoresBusqueda")) {
				this.jButtoncodigoControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteControlProveedoresBusqueda")) {
				this.jButtonnombre_clienteControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucControlProveedoresBusqueda")) {
				this.jButtonrucControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonosControlProveedoresBusqueda")) {
				this.jButtontelefonosControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionesControlProveedoresBusqueda")) {
				this.jButtondireccionesControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("emailsControlProveedoresBusqueda")) {
				this.jButtonemailsControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaControlProveedoresBusqueda")) {
				this.jButtonnumero_facturaControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionControlProveedoresBusqueda")) {
				this.jButtonfecha_emisionControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ventaControlProveedoresBusqueda")) {
				this.jButtonfecha_ventaControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldoControlProveedoresBusqueda")) {
				this.jButtonsaldoControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_mone_localControlProveedoresBusqueda")) {
				this.jButtondebito_mone_localControlProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_mone_localControlProveedoresBusqueda")) {
				this.jButtoncredito_mone_localControlProveedoresBusquedaActionPerformed(evt);
			}
			
			ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessControlProveedores();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameControlProveedores")) {
				closingInternalFrameControlProveedores();
				
			} else if(sTipo.equals("jButtonCancelarControlProveedores")) {
				JInternalFrameBase jInternalFrameDetalleFormControlProveedores = (JInternalFrameBase)evt.getSource();
	            	
	            ControlProveedoresBeanSwingJInternalFrame jInternalFrameParent=(ControlProveedoresBeanSwingJInternalFrame)jInternalFrameDetalleFormControlProveedores.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarControlProveedoresActionPerformed(null);
			}
			
			ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.controlproveedores,new Object(),this.controlproveedoresParameterGeneral,this.controlproveedoresReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormControlProveedores(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormControlProveedores(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormControlProveedores(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.controlproveedores)) {
			if(!esControlTabla) {
				if(ControlProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualControlProveedores(this.controlproveedores,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);			
				}
				
				if(this.controlproveedoresSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualControlProveedores(this.controlproveedores,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanControlProveedores(this.controlproveedoresReturnGeneral,this.controlproveedoresBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.controlproveedoresSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanControlProveedores(classes,this.controlproveedoresReturnGeneral,this.controlproveedoresBean,false);
					}
						
					if(this.controlproveedoresReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyControlProveedores(this.controlproveedoresReturnGeneral.getControlProveedores());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioControlProveedores(this.controlproveedoresReturnGeneral.getControlProveedores());	
					}
						
					if(this.controlproveedoresReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioControlProveedores(this.controlproveedoresReturnGeneral.getControlProveedores(),classes);//this.controlproveedoresBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioControlProveedores(this.controlproveedores,classes);//this.controlproveedoresBean);									
				}
			
				if(ControlProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualControlProveedores(this.controlproveedores,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysControlProveedores(this.controlproveedores);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.controlproveedoresAnterior!=null) {
						this.controlproveedores=this.controlproveedoresAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.controlproveedoresSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.controlproveedoresSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.controlproveedoresReturnGeneral.getControlProveedores(),controlproveedoresLogic.getControlProveedoress());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.controlproveedoresReturnGeneral.getControlProveedores(),this.controlproveedoress);
				}
				//ARCHITECTURE
				
				//this.jTableDatosControlProveedores.repaint();
				
				//((AbstractTableModel) this.jTableDatosControlProveedores.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosControlProveedores();
			}
		}
	}
	
	public void actualizarVisualTableDatosControlProveedores() throws Exception {
		
		ControlProveedoresModel controlproveedoresModel=(ControlProveedoresModel)this.jTableDatosControlProveedores.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			controlproveedoresModel.controlproveedoress=this.controlproveedoresLogic.getControlProveedoress();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			controlproveedoresModel.controlproveedoress=this.controlproveedoress;
		}
		
		
		((ControlProveedoresModel) this.jTableDatosControlProveedores.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaControlProveedores() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcontrolproveedoresAnterior(),this.controlproveedoresLogic.getControlProveedoress());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcontrolproveedoresAnterior(),this.controlproveedoress);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosControlProveedores();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioControlProveedores(ControlProveedores controlproveedores,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
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
										
				ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.controlproveedores,new Object(),generalEntityParameterGeneral,this.controlproveedoresReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.controlproveedoresSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ControlProveedoresConstantesFunciones.getClassesRelationshipsOfControlProveedores(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ControlProveedoresConstantesFunciones.getClassesRelationshipsFromStringsOfControlProveedores(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormControlProveedores(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ControlProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.controlproveedores,new Object(),generalEntityParameterGeneral,this.controlproveedoresReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioControlProveedores(ControlProveedoresBean controlproveedoresBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanControlProveedores(ArrayList<Classe> classes,ControlProveedoresReturnGeneral controlproveedoresReturnGeneral,ControlProveedoresBean controlproveedoresBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualControlProveedores(ControlProveedores controlproveedores,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.controlproveedores)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormControlProveedores = new ControlProveedoresDetalleFormJInternalFrame(jDesktopPane,this.controlproveedoresSessionBean.getConGuardarRelaciones(),this.controlproveedoresSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.setVisible(false);
		this.jInternalFrameDetalleFormControlProveedores.setSelected(false);						
		
		this.jInternalFrameDetalleFormControlProveedores.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormControlProveedores.controlproveedoresLogic=this.controlproveedoresLogic;
		
		this.cargarCombosFrameForeignKeyControlProveedores("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleControlProveedores();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleControlProveedores();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyControlProveedores("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyControlProveedores();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormControlProveedores.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarControlProveedores"));
		
		this.jInternalFrameDetalleFormControlProveedores.jButtonModificarControlProveedores.addActionListener(new ButtonActionListener(this,"ModificarControlProveedores"));

		
		this.jInternalFrameDetalleFormControlProveedores.jButtonModificarToolBarControlProveedores.addActionListener(new ButtonActionListener(this,"ModificarToolBarControlProveedores"));
					
		this.jInternalFrameDetalleFormControlProveedores.jMenuItemModificarControlProveedores.addActionListener(new ButtonActionListener(this,"MenuItemModificarControlProveedores"));		
		
		
		
		this.jInternalFrameDetalleFormControlProveedores.jButtonActualizarControlProveedores.addActionListener (new ButtonActionListener(this,"ActualizarControlProveedores"));
		
		
		this.jInternalFrameDetalleFormControlProveedores.jButtonActualizarToolBarControlProveedores.addActionListener(new ButtonActionListener(this,"ActualizarToolBarControlProveedores"));
						
		this.jInternalFrameDetalleFormControlProveedores.jMenuItemActualizarControlProveedores.addActionListener (new ButtonActionListener(this,"MenuItemActualizarControlProveedores"));		
		
		
		
		this.jInternalFrameDetalleFormControlProveedores.jButtonEliminarControlProveedores.addActionListener (new ButtonActionListener(this,"EliminarControlProveedores"));
		
		
		this.jInternalFrameDetalleFormControlProveedores.jButtonEliminarToolBarControlProveedores.addActionListener (new ButtonActionListener(this,"EliminarToolBarControlProveedores"));
								
		this.jInternalFrameDetalleFormControlProveedores.jMenuItemEliminarControlProveedores.addActionListener (new ButtonActionListener(this,"MenuItemEliminarControlProveedores"));		
		
		
		
		this.jInternalFrameDetalleFormControlProveedores.jButtonCancelarControlProveedores.addActionListener (new ButtonActionListener(this,"CancelarControlProveedores"));
		
		
		this.jInternalFrameDetalleFormControlProveedores.jButtonCancelarToolBarControlProveedores.addActionListener (new ButtonActionListener(this,"CancelarToolBarControlProveedores"));
					
		this.jInternalFrameDetalleFormControlProveedores.jMenuItemCancelarControlProveedores.addActionListener (new ButtonActionListener(this,"MenuItemCancelarControlProveedores"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormControlProveedores.jMenuItemDetalleCerrarControlProveedores.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarControlProveedores"));		
		
		
		
		this.jInternalFrameDetalleFormControlProveedores.jButtonGuardarCambiosToolBarControlProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarControlProveedores"));
		
		
		
		this.jInternalFrameDetalleFormControlProveedores.jButtonGuardarCambiosToolBarControlProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarControlProveedores"));
		
		
		
		this.jInternalFrameDetalleFormControlProveedores.jComboBoxTiposAccionesFormularioControlProveedores.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioControlProveedores"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonidControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"idControlProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormControlProveedores.jButtonid_empresaControlProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_empresaControlProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonid_empresaControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonfecha_emision_hastaControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonnombre_zonaControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonnombre_ciudadControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonnombre_grupo_clienteControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_grupo_clienteControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtoncodigoControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"codigoControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonnombre_clienteControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonrucControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"rucControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtontelefonosControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"telefonosControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtondireccionesControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"direccionesControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonemailsControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"emailsControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonnumero_facturaControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonfecha_emisionControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonfecha_ventaControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ventaControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonsaldoControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"saldoControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtondebito_mone_localControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_localControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtoncredito_mone_localControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_localControlProveedoresBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormControlProveedores.jTabbedPaneRelacionesControlProveedores.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesControlProveedores"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameControlProveedores"));
		
		if(this.jInternalFrameDetalleFormControlProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormControlProveedores.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarControlProveedores"));
		}
		
		this.jTableDatosControlProveedores.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarControlProveedores"));
		
		this.jTableDatosControlProveedores.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarControlProveedores"));
		
		this.jButtonNuevoControlProveedores.addActionListener(new ButtonActionListener(this,"NuevoControlProveedores"));
		
		this.jButtonDuplicarControlProveedores.addActionListener(new ButtonActionListener(this,"DuplicarControlProveedores"));
		
		this.jButtonCopiarControlProveedores.addActionListener(new ButtonActionListener(this,"CopiarControlProveedores"));
		
		this.jButtonVerFormControlProveedores.addActionListener(new ButtonActionListener(this,"VerFormControlProveedores"));
		
		
		this.jButtonNuevoToolBarControlProveedores.addActionListener(new ButtonActionListener(this,"NuevoToolBarControlProveedores"));
			
		this.jButtonDuplicarToolBarControlProveedores.addActionListener(new ButtonActionListener(this,"DuplicarToolBarControlProveedores"));
			
		this.jMenuItemNuevoControlProveedores.addActionListener (new ButtonActionListener(this,"MenuItemNuevoControlProveedores"));
			
		this.jMenuItemDuplicarControlProveedores.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarControlProveedores"));		
		
		
		this.jButtonNuevoRelacionesControlProveedores.addActionListener (new ButtonActionListener(this,"NuevoRelacionesControlProveedores"));
		
		
		this.jButtonNuevoRelacionesToolBarControlProveedores.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarControlProveedores"));
			
		this.jMenuItemNuevoRelacionesControlProveedores.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesControlProveedores"));		
		
		
		if(this.jInternalFrameDetalleFormControlProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormControlProveedores.jButtonModificarControlProveedores.addActionListener(new ButtonActionListener(this,"ModificarControlProveedores"));
		}
		
		
		if(this.jInternalFrameDetalleFormControlProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormControlProveedores.jButtonModificarToolBarControlProveedores.addActionListener(new ButtonActionListener(this,"ModificarToolBarControlProveedores"));
			
			this.jInternalFrameDetalleFormControlProveedores.jMenuItemModificarControlProveedores.addActionListener(new ButtonActionListener(this,"MenuItemModificarControlProveedores"));		
		}
		
		
		if(this.jInternalFrameDetalleFormControlProveedores!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormControlProveedores.jButtonActualizarControlProveedores.addActionListener (new ButtonActionListener(this,"ActualizarControlProveedores"));
		}
		
		
		if(this.jInternalFrameDetalleFormControlProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormControlProveedores.jButtonActualizarToolBarControlProveedores.addActionListener(new ButtonActionListener(this,"ActualizarToolBarControlProveedores"));
				
			this.jInternalFrameDetalleFormControlProveedores.jMenuItemActualizarControlProveedores.addActionListener (new ButtonActionListener(this,"MenuItemActualizarControlProveedores"));		
		}
		
		
		if(this.jInternalFrameDetalleFormControlProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormControlProveedores.jButtonEliminarControlProveedores.addActionListener (new ButtonActionListener(this,"EliminarControlProveedores"));
		}
		
		
		if(this.jInternalFrameDetalleFormControlProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormControlProveedores.jButtonEliminarToolBarControlProveedores.addActionListener (new ButtonActionListener(this,"EliminarToolBarControlProveedores"));
						
			this.jInternalFrameDetalleFormControlProveedores.jMenuItemEliminarControlProveedores.addActionListener (new ButtonActionListener(this,"MenuItemEliminarControlProveedores"));		
		}
		
		
		if(this.jInternalFrameDetalleFormControlProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormControlProveedores.jButtonCancelarControlProveedores.addActionListener (new ButtonActionListener(this,"CancelarControlProveedores"));
		}
		
		
		if(this.jInternalFrameDetalleFormControlProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormControlProveedores.jButtonCancelarToolBarControlProveedores.addActionListener (new ButtonActionListener(this,"CancelarToolBarControlProveedores"));
			
			this.jInternalFrameDetalleFormControlProveedores.jMenuItemCancelarControlProveedores.addActionListener (new ButtonActionListener(this,"MenuItemCancelarControlProveedores"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarControlProveedores.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarControlProveedores"));		
		
		
		this.jButtonCerrarControlProveedores.addActionListener (new ButtonActionListener(this,"CerrarControlProveedores"));
		
		
		this.jButtonCerrarToolBarControlProveedores.addActionListener (new ButtonActionListener(this,"CerrarToolBarControlProveedores"));
			
		this.jMenuItemCerrarControlProveedores.addActionListener (new ButtonActionListener(this,"MenuItemCerrarControlProveedores"));
			
		if(this.jInternalFrameDetalleFormControlProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormControlProveedores.jMenuItemDetalleCerrarControlProveedores.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarControlProveedores"));		
		}
		
		
		if(this.jInternalFrameDetalleFormControlProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormControlProveedores.jButtonGuardarCambiosControlProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosControlProveedores"));
		}
		
		
		if(this.jInternalFrameDetalleFormControlProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormControlProveedores.jButtonGuardarCambiosToolBarControlProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarControlProveedores"));
		}
		
		this.jButtonCopiarToolBarControlProveedores.addActionListener (new ButtonActionListener(this,"CopiarToolBarControlProveedores"));
			
		this.jButtonVerFormToolBarControlProveedores.addActionListener (new ButtonActionListener(this,"VerFormToolBarControlProveedores"));
		
		this.jMenuItemGuardarCambiosControlProveedores.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosControlProveedores"));
			
		this.jMenuItemCopiarControlProveedores.addActionListener (new ButtonActionListener(this,"MenuItemCopiarControlProveedores"));		
		
		this.jMenuItemVerFormControlProveedores.addActionListener (new ButtonActionListener(this,"MenuItemVerFormControlProveedores"));		
		
		
		this.jButtonGuardarCambiosTablaControlProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaControlProveedores"));
		
		
		this.jButtonGuardarCambiosTablaToolBarControlProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarControlProveedores"));
			
		this.jMenuItemGuardarCambiosTablaControlProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaControlProveedores"));		
		
		
		
		this.jButtonRecargarInformacionControlProveedores.addActionListener (new ButtonActionListener(this,"RecargarInformacionControlProveedores"));
					
		this.jButtonRecargarInformacionToolBarControlProveedores.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarControlProveedores"));
		
		this.jMenuItemRecargarInformacionControlProveedores.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionControlProveedores"));		
		
		
		
		this.jButtonAnterioresControlProveedores.addActionListener (new ButtonActionListener(this,"AnterioresControlProveedores"));
		
		
		this.jButtonAnterioresToolBarControlProveedores.addActionListener (new ButtonActionListener(this,"AnterioresToolBarControlProveedores"));
		
		this.jMenuItemAnterioresControlProveedores.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresControlProveedores"));		
		
		
		this.jButtonSiguientesControlProveedores.addActionListener (new ButtonActionListener(this,"SiguientesControlProveedores"));
		
		
		this.jButtonSiguientesToolBarControlProveedores.addActionListener (new ButtonActionListener(this,"SiguientesToolBarControlProveedores"));
			
		this.jMenuItemSiguientesControlProveedores.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesControlProveedores"));
			
		this.jMenuItemAbrirOrderByControlProveedores.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByControlProveedores"));
			
		this.jMenuItemMostrarOcultarControlProveedores.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarControlProveedores"));
			
		this.jMenuItemDetalleAbrirOrderByControlProveedores.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByControlProveedores"));
			
		this.jMenuItemDetalleMostarOcultarControlProveedores.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarControlProveedores"));		
		
		
		this.jButtonNuevoGuardarCambiosControlProveedores.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosControlProveedores"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarControlProveedores.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarControlProveedores"));
			
		this.jMenuItemNuevoGuardarCambiosControlProveedores.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosControlProveedores"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosControlProveedores.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosControlProveedores"));

		this.jCheckBoxSeleccionadosControlProveedores.addItemListener(new CheckBoxItemListener(this,"SeleccionadosControlProveedores"));
		
		if(this.jInternalFrameDetalleFormControlProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormControlProveedores.jComboBoxTiposAccionesFormularioControlProveedores.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioControlProveedores"));
		}
		
		
		this.jComboBoxTiposRelacionesControlProveedores.addActionListener (new ButtonActionListener(this,"TiposRelacionesControlProveedores"));
			
		this.jComboBoxTiposAccionesControlProveedores.addActionListener (new ButtonActionListener(this,"TiposAccionesControlProveedores"));
					
		this.jComboBoxTiposSeleccionarControlProveedores.addActionListener (new ButtonActionListener(this,"TiposSeleccionarControlProveedores"));
			
		this.jTextFieldValorCampoGeneralControlProveedores.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralControlProveedores"));		
		
		
		if(this.jInternalFrameDetalleFormControlProveedores!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonidControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"idControlProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormControlProveedores.jButtonid_empresaControlProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_empresaControlProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonid_empresaControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonfecha_emision_hastaControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonnombre_zonaControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonnombre_ciudadControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonnombre_grupo_clienteControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_grupo_clienteControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtoncodigoControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"codigoControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonnombre_clienteControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonrucControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"rucControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtontelefonosControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"telefonosControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtondireccionesControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"direccionesControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonemailsControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"emailsControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonnumero_facturaControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonfecha_emisionControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonfecha_ventaControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ventaControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonsaldoControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"saldoControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtondebito_mone_localControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_localControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtoncredito_mone_localControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_localControlProveedoresBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaControlProveedoresControlProveedores.addActionListener(new ButtonActionListener(this,"BusquedaControlProveedoresControlProveedores"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoControlProveedores!=null) {
				this.jInternalFrameReporteDinamicoControlProveedores.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoControlProveedores"));
				this.jInternalFrameReporteDinamicoControlProveedores.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoControlProveedores"));
				this.jInternalFrameReporteDinamicoControlProveedores.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoControlProveedores"));
			}
			
			//this.jButtonCerrarReporteDinamicoControlProveedores.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoControlProveedores"));				
			//this.jButtonGenerarReporteDinamicoControlProveedores.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoControlProveedores"));
			//this.jButtonGenerarExcelReporteDinamicoControlProveedores.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoControlProveedores"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionControlProveedores!=null) {
				this.jInternalFrameImportacionControlProveedores.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionControlProveedores"));
				this.jInternalFrameImportacionControlProveedores.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionControlProveedores"));
				this.jInternalFrameImportacionControlProveedores.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionControlProveedores"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByControlProveedores.addActionListener (new ButtonActionListener(this,"AbrirOrderByControlProveedores"));
			
			this.jButtonAbrirOrderByToolBarControlProveedores.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarControlProveedores"));			
			
			if(this.jInternalFrameOrderByControlProveedores!=null) {
				this.jInternalFrameOrderByControlProveedores.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByControlProveedores"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormControlProveedores!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormControlProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormControlProveedores.jTabbedPaneRelacionesControlProveedores.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesControlProveedores"));
		
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
            		closingInternalFrameControlProveedores();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormControlProveedores.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormControlProveedores = (JInternalFrameBase)event.getSource();
	            	
	            ControlProveedoresBeanSwingJInternalFrame jInternalFrameParent=(ControlProveedoresBeanSwingJInternalFrame)jInternalFrameDetalleFormControlProveedores.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarControlProveedoresActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosControlProveedores.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosControlProveedoresListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosControlProveedores.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosControlProveedores.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoControlProveedoresActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoControlProveedoresActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoControlProveedoresActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoControlProveedores";
		inputMap = this.jButtonNuevoControlProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoControlProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoControlProveedoresActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoControlProveedoresActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoControlProveedoresActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoControlProveedoresActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesControlProveedores";
		inputMap = this.jButtonNuevoRelacionesControlProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesControlProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoControlProveedoresActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarControlProveedores";
		inputMap = this.jButtonModificarControlProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarControlProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarControlProveedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarControlProveedores";
		inputMap = this.jButtonActualizarControlProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarControlProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarControlProveedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarControlProveedores";
		inputMap = this.jButtonEliminarControlProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarControlProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarControlProveedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarControlProveedores";
		inputMap = this.jButtonCancelarControlProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarControlProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarControlProveedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarControlProveedores";
		inputMap = this.jButtonCerrarControlProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarControlProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarControlProveedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormControlProveedores.jButtonGuardarCambiosControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosControlProveedores";
		inputMap = this.jInternalFrameDetalleFormControlProveedores.jButtonGuardarCambiosControlProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormControlProveedores.jButtonGuardarCambiosControlProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosControlProveedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosControlProveedores.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosControlProveedoresItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesControlProveedores.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesControlProveedoresActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarControlProveedores.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarControlProveedoresActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralControlProveedores.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralControlProveedoresActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonidControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"idControlProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormControlProveedores.jButtonid_empresaControlProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_empresaControlProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonid_empresaControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonfecha_emision_hastaControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonnombre_zonaControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonnombre_ciudadControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonnombre_grupo_clienteControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_grupo_clienteControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtoncodigoControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"codigoControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonnombre_clienteControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonrucControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"rucControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtontelefonosControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"telefonosControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtondireccionesControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"direccionesControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonemailsControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"emailsControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonnumero_facturaControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonfecha_emisionControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonfecha_ventaControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ventaControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtonsaldoControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"saldoControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtondebito_mone_localControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_localControlProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormControlProveedores.jButtoncredito_mone_localControlProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_localControlProveedoresBusqueda"));
		
		
		this.jButtonBusquedaControlProveedoresControlProveedores.addActionListener(new ButtonActionListener(this,"BusquedaControlProveedoresControlProveedores"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionControlProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionControlProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarControlProveedoresActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarControlProveedores.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosControlProveedores(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ControlProveedores controlproveedoresAux:this.controlproveedoresLogic.getControlProveedoress()) {
					controlproveedoresAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ControlProveedores controlproveedoresAux:controlproveedoress) {
					controlproveedoresAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosControlProveedoresItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingControlProveedores(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ControlProveedores controlproveedoresAux:this.controlproveedoresLogic.getControlProveedoress()) {
						controlproveedoresAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ControlProveedores controlproveedoresAux:controlproveedoress) {
						controlproveedoresAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ControlProveedores controlproveedoresAux:this.controlproveedoresLogic.getControlProveedoress()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ControlProveedores controlproveedoresAux:controlproveedoress) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaControlProveedores(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosControlProveedores.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosControlProveedores.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosControlProveedores,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosControlProveedoresItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingControlProveedores(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosControlProveedores.getSelectedRows();
			
			ControlProveedores controlproveedoresLocal=new ControlProveedores();
			
			//this.seleccionarTodosControlProveedores(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					controlproveedoresLocal =(ControlProveedores) this.controlproveedoresLogic.getControlProveedoress().toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					controlproveedoresLocal =(ControlProveedores) this.controlproveedoress.toArray()[this.jTableDatosControlProveedores.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				controlproveedoresLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ControlProveedores controlproveedoresAux:this.controlproveedoresLogic.getControlProveedoress()) {
						controlproveedoresAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ControlProveedores controlproveedoresAux:controlproveedoress) {
						controlproveedoresAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaControlProveedores(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosControlProveedores.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosControlProveedores.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosControlProveedores,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualControlProveedoresItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarControlProveedoresParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralControlProveedoresActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingControlProveedores(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralControlProveedores.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ControlProveedores controlproveedoresAux:this.controlproveedoresLogic.getControlProveedoress()) {
				
						if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							controlproveedoresAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_NOMBREZONA)) {
							existe=true;
							controlproveedoresAux.setnombre_zona(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_NOMBRECIUDAD)) {
							existe=true;
							controlproveedoresAux.setnombre_ciudad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE)) {
							existe=true;
							controlproveedoresAux.setnombre_grupo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							controlproveedoresAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							controlproveedoresAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_RUC)) {
							existe=true;
							controlproveedoresAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_TELEFONOS)) {
							existe=true;
							controlproveedoresAux.settelefonos(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_DIRECCIONES)) {
							existe=true;
							controlproveedoresAux.setdirecciones(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_EMAILS)) {
							existe=true;
							controlproveedoresAux.setemails(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							controlproveedoresAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							controlproveedoresAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_FECHAVENTA)) {
							existe=true;
							controlproveedoresAux.setfecha_venta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_SALDO)) {
							existe=true;
							controlproveedoresAux.setsaldo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_DEBITOMONELOCAL)) {
							existe=true;
							controlproveedoresAux.setdebito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL)) {
							existe=true;
							controlproveedoresAux.setcredito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ControlProveedores controlproveedoresAux:controlproveedoress) {
					
						if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							controlproveedoresAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_NOMBREZONA)) {
							existe=true;
							controlproveedoresAux.setnombre_zona(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_NOMBRECIUDAD)) {
							existe=true;
							controlproveedoresAux.setnombre_ciudad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE)) {
							existe=true;
							controlproveedoresAux.setnombre_grupo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							controlproveedoresAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							controlproveedoresAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_RUC)) {
							existe=true;
							controlproveedoresAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_TELEFONOS)) {
							existe=true;
							controlproveedoresAux.settelefonos(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_DIRECCIONES)) {
							existe=true;
							controlproveedoresAux.setdirecciones(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_EMAILS)) {
							existe=true;
							controlproveedoresAux.setemails(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							controlproveedoresAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							controlproveedoresAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_FECHAVENTA)) {
							existe=true;
							controlproveedoresAux.setfecha_venta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_SALDO)) {
							existe=true;
							controlproveedoresAux.setsaldo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_DEBITOMONELOCAL)) {
							existe=true;
							controlproveedoresAux.setdebito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL)) {
							existe=true;
							controlproveedoresAux.setcredito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaControlProveedores(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesControlProveedoresActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingControlProveedores(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioControlProveedores=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesControlProveedores.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormControlProveedores.jComboBoxTiposAccionesFormularioControlProveedores.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteControlProveedores) {				
					conSplash=true;//false;										
					
					//this.startProcessControlProveedores(conSplash);
				
					this.generarReporteControlProveedoressSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesControlProveedores.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormControlProveedores.jComboBoxTiposAccionesFormularioControlProveedores.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoControlProveedoressSeleccionados();
				//this.jComboBoxTiposAccionesControlProveedores.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoControlProveedoressSeleccionados(false);
				//this.jComboBoxTiposAccionesControlProveedores.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoControlProveedoressSeleccionados(true);
				//this.jComboBoxTiposAccionesControlProveedores.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessControlProveedores();
				
				this.exportarControlProveedoressSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesControlProveedores.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormControlProveedores.jComboBoxTiposAccionesFormularioControlProveedores.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionControlProveedoress();
				//this.importarControlProveedoress();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesControlProveedores.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormControlProveedores.jComboBoxTiposAccionesFormularioControlProveedores.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessControlProveedores();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelControlProveedoressSeleccionados();
				//this.jComboBoxTiposAccionesControlProveedores.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Control Proveedores", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessControlProveedores();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoControlProveedores)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyControlProveedores(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Control Proveedores",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesControlProveedores.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormControlProveedores.jComboBoxTiposAccionesFormularioControlProveedores.setSelectedIndex(0);					
				}	
			} 			
			else if(ControlProveedoresBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteControlProveedores) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessControlProveedores(conSplash);
					
						//this.actualizarParametrosGeneralControlProveedores();
						
						this.generarReporteProcesoAccionControlProveedoressSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesControlProveedores.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormControlProveedores.jComboBoxTiposAccionesFormularioControlProveedores.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ControlProveedoresBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Control ProveedoresES SELECCIONADOS?", "MANTENIMIENTO DE Control Proveedores", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessControlProveedores();
				
						this.actualizarParametrosGeneralControlProveedores();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.controlproveedoresReturnGeneral=controlproveedoresLogic.procesarAccionControlProveedoressWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.controlproveedoresLogic.getControlProveedoress(),this.controlproveedoresParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarControlProveedoresReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesControlProveedores.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormControlProveedores.jComboBoxTiposAccionesFormularioControlProveedores.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralControlProveedores();
					
					ControlProveedoresBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarControlProveedoresReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesControlProveedores.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormControlProveedores.jComboBoxTiposAccionesFormularioControlProveedores.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessControlProveedores(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesControlProveedoresActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessControlProveedores();
			
			if(this.jInternalFrameDetalleFormControlProveedores==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ControlProveedores> controlproveedoressSeleccionados=new ArrayList<ControlProveedores>();		
			ControlProveedores controlproveedores=new ControlProveedores();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingControlProveedores(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesControlProveedores.getSelectedItem();
			
			
			
			
			controlproveedoressSeleccionados=this.getControlProveedoressSeleccionados(true);
			//this.sTipoAccion;
			
			if(controlproveedoressSeleccionados.size()==1) {
				for(ControlProveedores controlproveedoresAux:controlproveedoressSeleccionados) {
					controlproveedores=controlproveedoresAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessControlProveedores();
			
      		//this.finishProcessControlProveedores(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarControlProveedoresReturnGeneral() throws Exception {
		if(this.controlproveedoresReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.controlproveedoresReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.controlproveedoresReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.controlproveedoresReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.controlproveedoresReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.controlproveedoresReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingControlProveedores(false);
		}
		
		if(this.controlproveedoresReturnGeneral.getConRetornoLista() || this.controlproveedoresReturnGeneral.getConRetornoObjeto()) {
			if(this.controlproveedoresReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.controlproveedoresLogic.setControlProveedoress(this.controlproveedoresReturnGeneral.getControlProveedoress());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingControlProveedores(false);
		}
	}
	
	public void actualizarParametrosGeneralControlProveedores() throws Exception {
		
		
	}
	
	public ArrayList<ControlProveedores> getControlProveedoressSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ControlProveedores> controlproveedoressSeleccionados=new ArrayList<ControlProveedores>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioControlProveedores) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ControlProveedores controlproveedoresAux:controlproveedoresLogic.getControlProveedoress()) {
					if(controlproveedoresAux.getIsSelected()) {
						controlproveedoressSeleccionados.add(controlproveedoresAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ControlProveedores controlproveedoresAux:this.controlproveedoress) {
					if(controlproveedoresAux.getIsSelected()) {
						controlproveedoressSeleccionados.add(controlproveedoresAux);				
					}
				}
			}
			
			if(controlproveedoressSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						controlproveedoressSeleccionados.addAll(this.controlproveedoresLogic.getControlProveedoress());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						controlproveedoressSeleccionados.addAll(this.controlproveedoress);				
					}
				}
			}
		} else {
			controlproveedoressSeleccionados.add(this.controlproveedores);
		}
		
		return controlproveedoressSeleccionados;
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
	
	public void generarReporteControlProveedoressSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalControlProveedoressSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoControlProveedoressSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoControlProveedoressSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoControlProveedoressSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Control Proveedores",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesControlProveedoressSeleccionados() throws Exception {
		ArrayList<ControlProveedores> controlproveedoressSeleccionados=new ArrayList<ControlProveedores>();		
		
		controlproveedoressSeleccionados=this.getControlProveedoressSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteControlProveedoress("Todos",controlproveedoressSeleccionados);
		
	}	
	
	public void generarReporteNormalControlProveedoressSeleccionados() throws Exception {
		ArrayList<ControlProveedores> controlproveedoressSeleccionados=new ArrayList<ControlProveedores>();		
		
		controlproveedoressSeleccionados=this.getControlProveedoressSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteControlProveedoress("Todos",controlproveedoressSeleccionados);
	}		
	
	public void generarReporteProcesoAccionControlProveedoressSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ControlProveedores> controlproveedoressSeleccionados=new ArrayList<ControlProveedores>();
		
		controlproveedoressSeleccionados=this.getControlProveedoressSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteControlProveedoress("Todos",controlproveedoressSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoControlProveedoressSeleccionados() throws Exception {
		ArrayList<ControlProveedores> controlproveedoressSeleccionados=new ArrayList<ControlProveedores>();		
		
		
		this.abrirInicializarFrameReporteDinamicoControlProveedores();
		
		
		controlproveedoressSeleccionados=this.getControlProveedoressSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoControlProveedores();
		
		
		//this.generarReporteControlProveedoress("Todos",controlproveedoressSeleccionados ,controlproveedoresImplementable,controlproveedoresImplementableHome);
	}
	
	public void mostrarImportacionControlProveedoress() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionControlProveedores();
		
		this.abrirFrameImportacionControlProveedores();		
		
			
		//this.generarReporteControlProveedoress("Todos",controlproveedoressSeleccionados ,controlproveedoresImplementable,controlproveedoresImplementableHome);
	}
	
	public void importarControlProveedoress() throws Exception {		
	
	}
	
	public void exportarControlProveedoressSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelControlProveedoressSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoControlProveedoressSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlControlProveedoressSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Control Proveedores",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoControlProveedoressSeleccionados() throws Exception {
		ArrayList<ControlProveedores> controlproveedoressSeleccionados=new ArrayList<ControlProveedores>();		
		
		controlproveedoressSeleccionados=this.getControlProveedoressSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"controlproveedores."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarControlProveedores(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ControlProveedores controlproveedoresAux:controlproveedoressSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarControlProveedores(controlproveedoresAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//controlproveedoresAux.setsDetalleGeneralEntityReporte(controlproveedoresAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Control Proveedores",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarControlProveedores(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ControlProveedoresConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ControlProveedoresConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ControlProveedoresConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ControlProveedoresConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ControlProveedoresConstantesFunciones.LABEL_NOMBREZONA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ControlProveedoresConstantesFunciones.LABEL_NOMBRECIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ControlProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ControlProveedoresConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ControlProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ControlProveedoresConstantesFunciones.LABEL_RUC;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ControlProveedoresConstantesFunciones.LABEL_TELEFONOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ControlProveedoresConstantesFunciones.LABEL_DIRECCIONES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ControlProveedoresConstantesFunciones.LABEL_EMAILS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ControlProveedoresConstantesFunciones.LABEL_NUMEROFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ControlProveedoresConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ControlProveedoresConstantesFunciones.LABEL_FECHAVENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ControlProveedoresConstantesFunciones.LABEL_SALDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ControlProveedoresConstantesFunciones.LABEL_DEBITOMONELOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ControlProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarControlProveedores(ControlProveedores controlproveedores,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=controlproveedores.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=controlproveedores.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=controlproveedores.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=controlproveedores.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=controlproveedores.getnombre_zona();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=controlproveedores.getnombre_ciudad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=controlproveedores.getnombre_grupo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=controlproveedores.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=controlproveedores.getnombre_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=controlproveedores.getruc();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=controlproveedores.gettelefonos();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=controlproveedores.getdirecciones();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=controlproveedores.getemails();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=controlproveedores.getnumero_factura();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=controlproveedores.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=controlproveedores.getfecha_venta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=controlproveedores.getsaldo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=controlproveedores.getdebito_mone_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=controlproveedores.getcredito_mone_local().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelControlProveedoressSeleccionados() throws Exception {
		ArrayList<ControlProveedores> controlproveedoressSeleccionados=new ArrayList<ControlProveedores>();		
		
		controlproveedoressSeleccionados=this.getControlProveedoressSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"controlproveedores.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ControlProveedoress");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelControlProveedores(row);				
				iRow++;
			}				
			
			for(ControlProveedores controlproveedoresAux:controlproveedoressSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelControlProveedores(controlproveedoresAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Control Proveedores",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlControlProveedoressSeleccionados() throws Exception {
		ArrayList<ControlProveedores> controlproveedoressSeleccionados=new ArrayList<ControlProveedores>();		
		
		controlproveedoressSeleccionados=this.getControlProveedoressSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"controlproveedores.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("controlproveedoress");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("controlproveedores");
			//elementRoot.appendChild(element);
		
			for(ControlProveedores controlproveedoresAux:controlproveedoressSeleccionados) {
				element = document.createElement("controlproveedores");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlControlProveedores(controlproveedoresAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Control Proveedores",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelControlProveedores(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_NOMBREZONA);
		cell = row.createCell(iColumn++);cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_NOMBRECIUDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_RUC);
		cell = row.createCell(iColumn++);cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_TELEFONOS);
		cell = row.createCell(iColumn++);cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_DIRECCIONES);
		cell = row.createCell(iColumn++);cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_EMAILS);
		cell = row.createCell(iColumn++);cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_NUMEROFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_FECHAVENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_SALDO);
		cell = row.createCell(iColumn++);cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_DEBITOMONELOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ControlProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelControlProveedores(ControlProveedores controlproveedores,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(controlproveedores.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(controlproveedores.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(controlproveedores.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(controlproveedores.getnombre_zona());
		cell = row.createCell(iColumn++);cell.setCellValue(controlproveedores.getnombre_ciudad());
		cell = row.createCell(iColumn++);cell.setCellValue(controlproveedores.getnombre_grupo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(controlproveedores.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(controlproveedores.getnombre_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(controlproveedores.getruc());
		cell = row.createCell(iColumn++);cell.setCellValue(controlproveedores.gettelefonos());
		cell = row.createCell(iColumn++);cell.setCellValue(controlproveedores.getdirecciones());
		cell = row.createCell(iColumn++);cell.setCellValue(controlproveedores.getemails());
		cell = row.createCell(iColumn++);cell.setCellValue(controlproveedores.getnumero_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(controlproveedores.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(controlproveedores.getfecha_venta());
		cell = row.createCell(iColumn++);cell.setCellValue(controlproveedores.getsaldo());
		cell = row.createCell(iColumn++);cell.setCellValue(controlproveedores.getdebito_mone_local());
		cell = row.createCell(iColumn++);cell.setCellValue(controlproveedores.getcredito_mone_local());				
	}
	
	public void setFilaDatosExportarXmlControlProveedores(ControlProveedores controlproveedores,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ControlProveedoresConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(controlproveedores.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ControlProveedoresConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(controlproveedores.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ControlProveedoresConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(controlproveedores.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementfecha_emision_hasta = document.createElement(ControlProveedoresConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(controlproveedores.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementnombre_zona = document.createElement(ControlProveedoresConstantesFunciones.NOMBREZONA);
		elementnombre_zona.appendChild(document.createTextNode(controlproveedores.getnombre_zona().trim()));
		element.appendChild(elementnombre_zona);

		Element elementnombre_ciudad = document.createElement(ControlProveedoresConstantesFunciones.NOMBRECIUDAD);
		elementnombre_ciudad.appendChild(document.createTextNode(controlproveedores.getnombre_ciudad().trim()));
		element.appendChild(elementnombre_ciudad);

		Element elementnombre_grupo_cliente = document.createElement(ControlProveedoresConstantesFunciones.NOMBREGRUPOCLIENTE);
		elementnombre_grupo_cliente.appendChild(document.createTextNode(controlproveedores.getnombre_grupo_cliente().trim()));
		element.appendChild(elementnombre_grupo_cliente);

		Element elementcodigo = document.createElement(ControlProveedoresConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(controlproveedores.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre_cliente = document.createElement(ControlProveedoresConstantesFunciones.NOMBRECLIENTE);
		elementnombre_cliente.appendChild(document.createTextNode(controlproveedores.getnombre_cliente().trim()));
		element.appendChild(elementnombre_cliente);

		Element elementruc = document.createElement(ControlProveedoresConstantesFunciones.RUC);
		elementruc.appendChild(document.createTextNode(controlproveedores.getruc().trim()));
		element.appendChild(elementruc);

		Element elementtelefonos = document.createElement(ControlProveedoresConstantesFunciones.TELEFONOS);
		elementtelefonos.appendChild(document.createTextNode(controlproveedores.gettelefonos().trim()));
		element.appendChild(elementtelefonos);

		Element elementdirecciones = document.createElement(ControlProveedoresConstantesFunciones.DIRECCIONES);
		elementdirecciones.appendChild(document.createTextNode(controlproveedores.getdirecciones().trim()));
		element.appendChild(elementdirecciones);

		Element elementemails = document.createElement(ControlProveedoresConstantesFunciones.EMAILS);
		elementemails.appendChild(document.createTextNode(controlproveedores.getemails().trim()));
		element.appendChild(elementemails);

		Element elementnumero_factura = document.createElement(ControlProveedoresConstantesFunciones.NUMEROFACTURA);
		elementnumero_factura.appendChild(document.createTextNode(controlproveedores.getnumero_factura().trim()));
		element.appendChild(elementnumero_factura);

		Element elementfecha_emision = document.createElement(ControlProveedoresConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(controlproveedores.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementfecha_venta = document.createElement(ControlProveedoresConstantesFunciones.FECHAVENTA);
		elementfecha_venta.appendChild(document.createTextNode(controlproveedores.getfecha_venta().toString().trim()));
		element.appendChild(elementfecha_venta);

		Element elementsaldo = document.createElement(ControlProveedoresConstantesFunciones.SALDO);
		elementsaldo.appendChild(document.createTextNode(controlproveedores.getsaldo().toString().trim()));
		element.appendChild(elementsaldo);

		Element elementdebito_mone_local = document.createElement(ControlProveedoresConstantesFunciones.DEBITOMONELOCAL);
		elementdebito_mone_local.appendChild(document.createTextNode(controlproveedores.getdebito_mone_local().toString().trim()));
		element.appendChild(elementdebito_mone_local);

		Element elementcredito_mone_local = document.createElement(ControlProveedoresConstantesFunciones.CREDITOMONELOCAL);
		elementcredito_mone_local.appendChild(document.createTextNode(controlproveedores.getcredito_mone_local().toString().trim()));
		element.appendChild(elementcredito_mone_local);
	}
	
	public void generarReporteGroupGenericoControlProveedoressSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ControlProveedores> controlproveedoressSeleccionados=new ArrayList<ControlProveedores>();
		
		controlproveedoressSeleccionados=this.getControlProveedoressSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoControlProveedores(controlproveedoressSeleccionados);
		
		this.generarReporteControlProveedoress("Todos",controlproveedoressSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoControlProveedores(ArrayList<ControlProveedores> controlproveedoressSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ControlProveedores controlproveedoresAux:controlproveedoressSeleccionados) {
				controlproveedoresAux.setsDetalleGeneralEntityReporte(controlproveedoresAux.toString());
			
				if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					controlproveedoresAux.setsDescripcionGeneralEntityReporte1(controlproveedoresAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					controlproveedoresAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(controlproveedoresAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_NOMBREZONA)) {
					existe=true;
					controlproveedoresAux.setsDescripcionGeneralEntityReporte1(controlproveedoresAux.getnombre_zona());
				}
				 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_NOMBRECIUDAD)) {
					existe=true;
					controlproveedoresAux.setsDescripcionGeneralEntityReporte1(controlproveedoresAux.getnombre_ciudad());
				}
				 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE)) {
					existe=true;
					controlproveedoresAux.setsDescripcionGeneralEntityReporte1(controlproveedoresAux.getnombre_grupo_cliente());
				}
				 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					controlproveedoresAux.setsDescripcionGeneralEntityReporte1(controlproveedoresAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE)) {
					existe=true;
					controlproveedoresAux.setsDescripcionGeneralEntityReporte1(controlproveedoresAux.getnombre_cliente());
				}
				 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_RUC)) {
					existe=true;
					controlproveedoresAux.setsDescripcionGeneralEntityReporte1(controlproveedoresAux.getruc());
				}
				 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_TELEFONOS)) {
					existe=true;
					controlproveedoresAux.setsDescripcionGeneralEntityReporte1(controlproveedoresAux.gettelefonos());
				}
				 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_DIRECCIONES)) {
					existe=true;
					controlproveedoresAux.setsDescripcionGeneralEntityReporte1(controlproveedoresAux.getdirecciones());
				}
				 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_EMAILS)) {
					existe=true;
					controlproveedoresAux.setsDescripcionGeneralEntityReporte1(controlproveedoresAux.getemails());
				}
				 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_NUMEROFACTURA)) {
					existe=true;
					controlproveedoresAux.setsDescripcionGeneralEntityReporte1(controlproveedoresAux.getnumero_factura());
				}
				 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					controlproveedoresAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(controlproveedoresAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(ControlProveedoresConstantesFunciones.LABEL_FECHAVENTA)) {
					existe=true;
					controlproveedoresAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(controlproveedoresAux.getfecha_venta()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ControlProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesControlProveedores(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoControlProveedores=true;
				this.isVisibilidadCeldaNuevoRelacionesControlProveedores=true;
				this.isVisibilidadCeldaGuardarCambiosControlProveedores=true;
			}
			
			this.isVisibilidadCeldaModificarControlProveedores=false;
			this.isVisibilidadCeldaActualizarControlProveedores=false;
			this.isVisibilidadCeldaEliminarControlProveedores=false;
			this.isVisibilidadCeldaCancelarControlProveedores=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarControlProveedores=true;
				} else {
					this.isVisibilidadCeldaGuardarControlProveedores=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoControlProveedores=false;
			this.isVisibilidadCeldaNuevoRelacionesControlProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosControlProveedores=false;
			this.isVisibilidadCeldaModificarControlProveedores=false;
			this.isVisibilidadCeldaActualizarControlProveedores=true;
			this.isVisibilidadCeldaEliminarControlProveedores=false;
			this.isVisibilidadCeldaCancelarControlProveedores=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarControlProveedores=true;
				} else {
					this.isVisibilidadCeldaGuardarControlProveedores=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoControlProveedores=false;
			this.isVisibilidadCeldaNuevoRelacionesControlProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosControlProveedores=false;
			this.isVisibilidadCeldaModificarControlProveedores=false;
			this.isVisibilidadCeldaActualizarControlProveedores=true;
			this.isVisibilidadCeldaEliminarControlProveedores=true;
			this.isVisibilidadCeldaCancelarControlProveedores=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarControlProveedores=true;
				} else {
					this.isVisibilidadCeldaGuardarControlProveedores=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoControlProveedores=false;
			this.isVisibilidadCeldaNuevoRelacionesControlProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosControlProveedores=false;
			this.isVisibilidadCeldaModificarControlProveedores=false;
			this.isVisibilidadCeldaActualizarControlProveedores=true;
			this.isVisibilidadCeldaEliminarControlProveedores=false;
			this.isVisibilidadCeldaCancelarControlProveedores=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarControlProveedores=false;
				} else {
					this.isVisibilidadCeldaGuardarControlProveedores=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoControlProveedores=true;
			this.isVisibilidadCeldaNuevoRelacionesControlProveedores=true;
			this.isVisibilidadCeldaGuardarCambiosControlProveedores=true;
			this.isVisibilidadCeldaModificarControlProveedores=false;
			this.isVisibilidadCeldaActualizarControlProveedores=false;
			this.isVisibilidadCeldaEliminarControlProveedores=false;
			this.isVisibilidadCeldaCancelarControlProveedores=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarControlProveedores=true;
				} else {
					this.isVisibilidadCeldaGuardarControlProveedores=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoControlProveedores=false;
			this.isVisibilidadCeldaNuevoRelacionesControlProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosControlProveedores=false;
			this.isVisibilidadCeldaActualizarControlProveedores=false;
			this.isVisibilidadCeldaEliminarControlProveedores=false;
			this.isVisibilidadCeldaCancelarControlProveedores=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarControlProveedores=false;
				} else {
					this.isVisibilidadCeldaGuardarControlProveedores=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoControlProveedores=false;
			this.isVisibilidadCeldaNuevoRelacionesControlProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosControlProveedores=false;
			this.isVisibilidadCeldaModificarControlProveedores=true;
			this.isVisibilidadCeldaActualizarControlProveedores=false;
			this.isVisibilidadCeldaEliminarControlProveedores=false;
			this.isVisibilidadCeldaCancelarControlProveedores=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarControlProveedores=false;
				} else {
					this.isVisibilidadCeldaGuardarControlProveedores=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ControlProveedoresJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoControlProveedores=true;
			this.isVisibilidadCeldaNuevoRelacionesControlProveedores=true;
			this.isVisibilidadCeldaGuardarCambiosControlProveedores=true;
		} else {
			this.actualizarEstadoPanelsControlProveedores(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarControlProveedores=false;
			//this.isVisibilidadCeldaVerFormControlProveedores=false;
			this.isVisibilidadCeldaDuplicarControlProveedores=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!controlproveedoresSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesControlProveedores=false;
		} else {
			this.isVisibilidadCeldaNuevoControlProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosControlProveedores=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(controlproveedoresSessionBean.getEsGuardarRelacionado()) {
			if(!controlproveedoresSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesControlProveedores=false;												
			}
			
			this.jButtonCerrarControlProveedores.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesControlProveedores=false;
		}
		
		if(!this.permiteMantenimiento(this.controlproveedores)) {
			this.isVisibilidadCeldaActualizarControlProveedores=false;
			this.isVisibilidadCeldaEliminarControlProveedores=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoControlProveedores=false;
		this.isVisibilidadCeldaNuevoRelacionesControlProveedores=false;
		this.isVisibilidadCeldaGuardarCambiosControlProveedores=false;
		//this.isVisibilidadCeldaModificarControlProveedores=true;
		this.isVisibilidadCeldaActualizarControlProveedores=false;
		this.isVisibilidadCeldaEliminarControlProveedores=false;
		//this.isVisibilidadCeldaCancelarControlProveedores=true;			
		this.isVisibilidadCeldaGuardarControlProveedores=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesControlProveedores() {
	}
	
	public void actualizarEstadoPanelsControlProveedores(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionControlProveedores!=null) {
				this.jScrollPanelDatosEdicionControlProveedores.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasControlProveedores!=null) {
				this.jTabbedPaneBusquedasControlProveedores.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosControlProveedores!=null) {
				this.jScrollPanelDatosControlProveedores.setVisible(true);
			}
			
			if(this.jPanelPaginacionControlProveedores!=null) {
				this.jPanelPaginacionControlProveedores.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesControlProveedores!=null) {
				this.jPanelParametrosReportesControlProveedores.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionControlProveedores!=null) {
				this.jScrollPanelDatosEdicionControlProveedores.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasControlProveedores!=null) {
				this.jTabbedPaneBusquedasControlProveedores.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosControlProveedores!=null) {
				this.jScrollPanelDatosControlProveedores.setVisible(false);
			}
			
			if(this.jPanelPaginacionControlProveedores!=null) {
				this.jPanelPaginacionControlProveedores.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesControlProveedores!=null) {
				this.jPanelParametrosReportesControlProveedores.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionControlProveedores!=null) {
				this.jScrollPanelDatosEdicionControlProveedores.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasControlProveedores!=null) {
				this.jTabbedPaneBusquedasControlProveedores.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosControlProveedores!=null) {
				this.jScrollPanelDatosControlProveedores.setVisible(false);
			}
			
			if(this.jPanelPaginacionControlProveedores!=null) {
				this.jPanelPaginacionControlProveedores.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesControlProveedores!=null) {
				this.jPanelParametrosReportesControlProveedores.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionControlProveedores!=null) {
				this.jScrollPanelDatosEdicionControlProveedores.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasControlProveedores!=null) {
				this.jTabbedPaneBusquedasControlProveedores.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosControlProveedores!=null) {
				this.jScrollPanelDatosControlProveedores.setVisible(false);
			}
			
			if(this.jPanelPaginacionControlProveedores!=null) {
				this.jPanelPaginacionControlProveedores.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesControlProveedores!=null) {
				this.jPanelParametrosReportesControlProveedores.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionControlProveedores!=null) {
				this.jScrollPanelDatosEdicionControlProveedores.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasControlProveedores!=null) {
				this.jTabbedPaneBusquedasControlProveedores.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosControlProveedores!=null) {
				this.jScrollPanelDatosControlProveedores.setVisible(true);
			}
			
			if(this.jPanelPaginacionControlProveedores!=null) {
				this.jPanelPaginacionControlProveedores.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesControlProveedores!=null) {
				this.jPanelParametrosReportesControlProveedores.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionControlProveedores!=null) {
				this.jScrollPanelDatosEdicionControlProveedores.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasControlProveedores!=null) {
				this.jTabbedPaneBusquedasControlProveedores.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosControlProveedores!=null) {
				this.jScrollPanelDatosControlProveedores.setVisible(true);
			}
			
			if(this.jPanelPaginacionControlProveedores!=null) {
				this.jPanelPaginacionControlProveedores.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesControlProveedores!=null) {
				this.jPanelParametrosReportesControlProveedores.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionControlProveedores!=null) {
				this.jScrollPanelDatosEdicionControlProveedores.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasControlProveedores!=null) {
				this.jTabbedPaneBusquedasControlProveedores.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosControlProveedores!=null) {
				this.jScrollPanelDatosControlProveedores.setVisible(true);
			}
			
			if(this.jPanelPaginacionControlProveedores!=null) {
				this.jPanelPaginacionControlProveedores.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesControlProveedores!=null) {
				this.jPanelParametrosReportesControlProveedores.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasControlProveedores!=null) {
					this.jTabbedPaneBusquedasControlProveedores.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesControlProveedores!=null) {
				this.jPanelParametrosReportesControlProveedores.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.controlproveedoresSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasControlProveedores!=null) {
				this.jTabbedPaneBusquedasControlProveedores.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesControlProveedores!=null) {
				this.jPanelParametrosReportesControlProveedores.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaControlProveedores=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaControlProveedores) {this.jTabbedPaneBusquedasControlProveedores.remove(jPanelBusquedaControlProveedoresControlProveedores);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaControlProveedores(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioControlProveedores() {
		this.updateBorderResaltarBusquedasFormularioControlProveedores();
		this.updateVisibilidadBusquedasFormularioControlProveedores();
		this.updateHabilitarBusquedasFormularioControlProveedores();
	}
	
	public void updateBorderResaltarBusquedasFormularioControlProveedores() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasControlProveedores.getComponents().length>0) {
	

		if(this.controlproveedoresConstantesFunciones.resaltarBusquedaControlProveedoresControlProveedores!=null) {
			index= this.jTabbedPaneBusquedasControlProveedores.indexOfComponent(this.jPanelBusquedaControlProveedoresControlProveedores);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasControlProveedores.getComponent(index);
				jPanel.setBorder(this.controlproveedoresConstantesFunciones.resaltarBusquedaControlProveedoresControlProveedores);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioControlProveedores() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasControlProveedores.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasControlProveedores.indexOfComponent(this.jPanelBusquedaControlProveedoresControlProveedores);
			jPanel=(JPanel)this.jTabbedPaneBusquedasControlProveedores.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.controlproveedoresConstantesFunciones.mostrarBusquedaControlProveedoresControlProveedores);
			if(!this.controlproveedoresConstantesFunciones.mostrarBusquedaControlProveedoresControlProveedores && index>-1) {
				this.jTabbedPaneBusquedasControlProveedores.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioControlProveedores() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasControlProveedores.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasControlProveedores.indexOfComponent(this.jPanelBusquedaControlProveedoresControlProveedores);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasControlProveedores.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.controlproveedoresConstantesFunciones.activarBusquedaControlProveedoresControlProveedores);
				this.jTabbedPaneBusquedasControlProveedores.setEnabledAt(index,this.controlproveedoresConstantesFunciones.activarBusquedaControlProveedoresControlProveedores);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaControlProveedores(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaControlProveedores")) {
			index= this.jTabbedPaneBusquedasControlProveedores.indexOfComponent(this.jPanelBusquedaControlProveedoresControlProveedores);

			this.jTabbedPaneBusquedasControlProveedores.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasControlProveedores.getComponent(index);

			this.controlproveedoresConstantesFunciones.setResaltarBusquedaControlProveedoresControlProveedores(resaltar);

			jPanel.setBorder(this.controlproveedoresConstantesFunciones.resaltarBusquedaControlProveedoresControlProveedores);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarControlProveedores.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioControlProveedores() throws Exception {

		if(this.jInternalFrameDetalleFormControlProveedores==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioControlProveedores();
		this.updateVisibilidadResaltarControlesFormularioControlProveedores();
		this.updateHabilitarResaltarControlesFormularioControlProveedores();
		
	}
	
	public void updateBorderResaltarControlesFormularioControlProveedores() throws Exception {
		if(this.jInternalFrameDetalleFormControlProveedores==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.controlproveedoresConstantesFunciones.resaltaridControlProveedores!=null && this.jInternalFrameDetalleFormControlProveedores!=null) {this.jInternalFrameDetalleFormControlProveedores.jLabelidControlProveedores.setBorder(this.controlproveedoresConstantesFunciones.resaltaridControlProveedores);}
		if(this.controlproveedoresConstantesFunciones.resaltarid_empresaControlProveedores!=null && this.jInternalFrameDetalleFormControlProveedores!=null) {this.jInternalFrameDetalleFormControlProveedores.jComboBoxid_empresaControlProveedores.setBorder(this.controlproveedoresConstantesFunciones.resaltarid_empresaControlProveedores);}
		if(this.controlproveedoresConstantesFunciones.resaltarfecha_emision_hastaControlProveedores!=null && this.jInternalFrameDetalleFormControlProveedores!=null) {this.jInternalFrameDetalleFormControlProveedores.jDateChooserfecha_emision_hastaControlProveedores.setBorder(this.controlproveedoresConstantesFunciones.resaltarfecha_emision_hastaControlProveedores);}
		if(this.controlproveedoresConstantesFunciones.resaltarnombre_zonaControlProveedores!=null && this.jInternalFrameDetalleFormControlProveedores!=null) {this.jInternalFrameDetalleFormControlProveedores.jTextFieldnombre_zonaControlProveedores.setBorder(this.controlproveedoresConstantesFunciones.resaltarnombre_zonaControlProveedores);}
		if(this.controlproveedoresConstantesFunciones.resaltarnombre_ciudadControlProveedores!=null && this.jInternalFrameDetalleFormControlProveedores!=null) {this.jInternalFrameDetalleFormControlProveedores.jTextAreanombre_ciudadControlProveedores.setBorder(this.controlproveedoresConstantesFunciones.resaltarnombre_ciudadControlProveedores);}
		if(this.controlproveedoresConstantesFunciones.resaltarnombre_grupo_clienteControlProveedores!=null && this.jInternalFrameDetalleFormControlProveedores!=null) {this.jInternalFrameDetalleFormControlProveedores.jTextAreanombre_grupo_clienteControlProveedores.setBorder(this.controlproveedoresConstantesFunciones.resaltarnombre_grupo_clienteControlProveedores);}
		if(this.controlproveedoresConstantesFunciones.resaltarcodigoControlProveedores!=null && this.jInternalFrameDetalleFormControlProveedores!=null) {this.jInternalFrameDetalleFormControlProveedores.jTextFieldcodigoControlProveedores.setBorder(this.controlproveedoresConstantesFunciones.resaltarcodigoControlProveedores);}
		if(this.controlproveedoresConstantesFunciones.resaltarnombre_clienteControlProveedores!=null && this.jInternalFrameDetalleFormControlProveedores!=null) {this.jInternalFrameDetalleFormControlProveedores.jTextAreanombre_clienteControlProveedores.setBorder(this.controlproveedoresConstantesFunciones.resaltarnombre_clienteControlProveedores);}
		if(this.controlproveedoresConstantesFunciones.resaltarrucControlProveedores!=null && this.jInternalFrameDetalleFormControlProveedores!=null) {this.jInternalFrameDetalleFormControlProveedores.jTextFieldrucControlProveedores.setBorder(this.controlproveedoresConstantesFunciones.resaltarrucControlProveedores);}
		if(this.controlproveedoresConstantesFunciones.resaltartelefonosControlProveedores!=null && this.jInternalFrameDetalleFormControlProveedores!=null) {this.jInternalFrameDetalleFormControlProveedores.jTextAreatelefonosControlProveedores.setBorder(this.controlproveedoresConstantesFunciones.resaltartelefonosControlProveedores);}
		if(this.controlproveedoresConstantesFunciones.resaltardireccionesControlProveedores!=null && this.jInternalFrameDetalleFormControlProveedores!=null) {this.jInternalFrameDetalleFormControlProveedores.jTextAreadireccionesControlProveedores.setBorder(this.controlproveedoresConstantesFunciones.resaltardireccionesControlProveedores);}
		if(this.controlproveedoresConstantesFunciones.resaltaremailsControlProveedores!=null && this.jInternalFrameDetalleFormControlProveedores!=null) {this.jInternalFrameDetalleFormControlProveedores.jTextAreaemailsControlProveedores.setBorder(this.controlproveedoresConstantesFunciones.resaltaremailsControlProveedores);}
		if(this.controlproveedoresConstantesFunciones.resaltarnumero_facturaControlProveedores!=null && this.jInternalFrameDetalleFormControlProveedores!=null) {this.jInternalFrameDetalleFormControlProveedores.jTextFieldnumero_facturaControlProveedores.setBorder(this.controlproveedoresConstantesFunciones.resaltarnumero_facturaControlProveedores);}
		if(this.controlproveedoresConstantesFunciones.resaltarfecha_emisionControlProveedores!=null && this.jInternalFrameDetalleFormControlProveedores!=null) {this.jInternalFrameDetalleFormControlProveedores.jDateChooserfecha_emisionControlProveedores.setBorder(this.controlproveedoresConstantesFunciones.resaltarfecha_emisionControlProveedores);}
		if(this.controlproveedoresConstantesFunciones.resaltarfecha_ventaControlProveedores!=null && this.jInternalFrameDetalleFormControlProveedores!=null) {this.jInternalFrameDetalleFormControlProveedores.jDateChooserfecha_ventaControlProveedores.setBorder(this.controlproveedoresConstantesFunciones.resaltarfecha_ventaControlProveedores);}
		if(this.controlproveedoresConstantesFunciones.resaltarsaldoControlProveedores!=null && this.jInternalFrameDetalleFormControlProveedores!=null) {this.jInternalFrameDetalleFormControlProveedores.jTextFieldsaldoControlProveedores.setBorder(this.controlproveedoresConstantesFunciones.resaltarsaldoControlProveedores);}
		if(this.controlproveedoresConstantesFunciones.resaltardebito_mone_localControlProveedores!=null && this.jInternalFrameDetalleFormControlProveedores!=null) {this.jInternalFrameDetalleFormControlProveedores.jTextFielddebito_mone_localControlProveedores.setBorder(this.controlproveedoresConstantesFunciones.resaltardebito_mone_localControlProveedores);}
		if(this.controlproveedoresConstantesFunciones.resaltarcredito_mone_localControlProveedores!=null && this.jInternalFrameDetalleFormControlProveedores!=null) {this.jInternalFrameDetalleFormControlProveedores.jTextFieldcredito_mone_localControlProveedores.setBorder(this.controlproveedoresConstantesFunciones.resaltarcredito_mone_localControlProveedores);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioControlProveedores() throws Exception {		
		if(this.jInternalFrameDetalleFormControlProveedores==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormControlProveedores!=null) {
	
		//this.jInternalFrameDetalleFormControlProveedores.jLabelidControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostraridControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jPanelidControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostraridControlProveedores);
		//this.jInternalFrameDetalleFormControlProveedores.jComboBoxid_empresaControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrarid_empresaControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jPanelid_empresaControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrarid_empresaControlProveedores);
		//this.jInternalFrameDetalleFormControlProveedores.jDateChooserfecha_emision_hastaControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrarfecha_emision_hastaControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jPanelfecha_emision_hastaControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrarfecha_emision_hastaControlProveedores);
		//this.jInternalFrameDetalleFormControlProveedores.jTextFieldnombre_zonaControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrarnombre_zonaControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jPanelnombre_zonaControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrarnombre_zonaControlProveedores);
		//this.jInternalFrameDetalleFormControlProveedores.jTextAreanombre_ciudadControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrarnombre_ciudadControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jPanelnombre_ciudadControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrarnombre_ciudadControlProveedores);
		//this.jInternalFrameDetalleFormControlProveedores.jTextAreanombre_grupo_clienteControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrarnombre_grupo_clienteControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jPanelnombre_grupo_clienteControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrarnombre_grupo_clienteControlProveedores);
		//this.jInternalFrameDetalleFormControlProveedores.jTextFieldcodigoControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrarcodigoControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jPanelcodigoControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrarcodigoControlProveedores);
		//this.jInternalFrameDetalleFormControlProveedores.jTextAreanombre_clienteControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrarnombre_clienteControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jPanelnombre_clienteControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrarnombre_clienteControlProveedores);
		//this.jInternalFrameDetalleFormControlProveedores.jTextFieldrucControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrarrucControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jPanelrucControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrarrucControlProveedores);
		//this.jInternalFrameDetalleFormControlProveedores.jTextAreatelefonosControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrartelefonosControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jPaneltelefonosControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrartelefonosControlProveedores);
		//this.jInternalFrameDetalleFormControlProveedores.jTextAreadireccionesControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrardireccionesControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jPaneldireccionesControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrardireccionesControlProveedores);
		//this.jInternalFrameDetalleFormControlProveedores.jTextAreaemailsControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostraremailsControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jPanelemailsControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostraremailsControlProveedores);
		//this.jInternalFrameDetalleFormControlProveedores.jTextFieldnumero_facturaControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrarnumero_facturaControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jPanelnumero_facturaControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrarnumero_facturaControlProveedores);
		//this.jInternalFrameDetalleFormControlProveedores.jDateChooserfecha_emisionControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrarfecha_emisionControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jPanelfecha_emisionControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrarfecha_emisionControlProveedores);
		//this.jInternalFrameDetalleFormControlProveedores.jDateChooserfecha_ventaControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrarfecha_ventaControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jPanelfecha_ventaControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrarfecha_ventaControlProveedores);
		//this.jInternalFrameDetalleFormControlProveedores.jTextFieldsaldoControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrarsaldoControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jPanelsaldoControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrarsaldoControlProveedores);
		//this.jInternalFrameDetalleFormControlProveedores.jTextFielddebito_mone_localControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrardebito_mone_localControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jPaneldebito_mone_localControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrardebito_mone_localControlProveedores);
		//this.jInternalFrameDetalleFormControlProveedores.jTextFieldcredito_mone_localControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrarcredito_mone_localControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jPanelcredito_mone_localControlProveedores.setVisible(this.controlproveedoresConstantesFunciones.mostrarcredito_mone_localControlProveedores);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioControlProveedores() throws Exception {
		if(this.jInternalFrameDetalleFormControlProveedores==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormControlProveedores!=null) {
	
		this.jInternalFrameDetalleFormControlProveedores.jLabelidControlProveedores.setEnabled(this.controlproveedoresConstantesFunciones.activaridControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jComboBoxid_empresaControlProveedores.setEnabled(this.controlproveedoresConstantesFunciones.activarid_empresaControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jDateChooserfecha_emision_hastaControlProveedores.setEnabled(this.controlproveedoresConstantesFunciones.activarfecha_emision_hastaControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jTextFieldnombre_zonaControlProveedores.setEnabled(this.controlproveedoresConstantesFunciones.activarnombre_zonaControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jTextAreanombre_ciudadControlProveedores.setEnabled(this.controlproveedoresConstantesFunciones.activarnombre_ciudadControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jTextAreanombre_grupo_clienteControlProveedores.setEnabled(this.controlproveedoresConstantesFunciones.activarnombre_grupo_clienteControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jTextFieldcodigoControlProveedores.setEnabled(this.controlproveedoresConstantesFunciones.activarcodigoControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jTextAreanombre_clienteControlProveedores.setEnabled(this.controlproveedoresConstantesFunciones.activarnombre_clienteControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jTextFieldrucControlProveedores.setEnabled(this.controlproveedoresConstantesFunciones.activarrucControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jTextAreatelefonosControlProveedores.setEnabled(this.controlproveedoresConstantesFunciones.activartelefonosControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jTextAreadireccionesControlProveedores.setEnabled(this.controlproveedoresConstantesFunciones.activardireccionesControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jTextAreaemailsControlProveedores.setEnabled(this.controlproveedoresConstantesFunciones.activaremailsControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jTextFieldnumero_facturaControlProveedores.setEnabled(this.controlproveedoresConstantesFunciones.activarnumero_facturaControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jDateChooserfecha_emisionControlProveedores.setEnabled(this.controlproveedoresConstantesFunciones.activarfecha_emisionControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jDateChooserfecha_ventaControlProveedores.setEnabled(this.controlproveedoresConstantesFunciones.activarfecha_ventaControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jTextFieldsaldoControlProveedores.setEnabled(this.controlproveedoresConstantesFunciones.activarsaldoControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jTextFielddebito_mone_localControlProveedores.setEnabled(this.controlproveedoresConstantesFunciones.activardebito_mone_localControlProveedores);
		this.jInternalFrameDetalleFormControlProveedores.jTextFieldcredito_mone_localControlProveedores.setEnabled(this.controlproveedoresConstantesFunciones.activarcredito_mone_localControlProveedores);
		}
	}
	
		
}