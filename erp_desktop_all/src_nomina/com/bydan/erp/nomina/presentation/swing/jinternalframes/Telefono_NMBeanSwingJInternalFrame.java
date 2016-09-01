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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;




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

import com.bydan.erp.nomina.util.Telefono_NMConstantesFunciones;
import com.bydan.erp.nomina.util.Telefono_NMParameterReturnGeneral;
//import com.bydan.erp.nomina.util.Telefono_NMParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.Telefono_NMBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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
public class Telefono_NMBeanSwingJInternalFrame extends Telefono_NMJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(Telefono_NMBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Telefono_NM> telefono_nmValidator = new ClassValidator<Telefono_NM>(Telefono_NM.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Telefono_NM telefono_nm;	
	public Telefono_NM telefono_nmAux;
	public Telefono_NM telefono_nmAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Telefono_NM telefono_nmTotales;
	public Long idTelefono_NMActual;
	public Long iIdNuevoTelefono_NM=0L;
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

	public String sFinalQueryComboEmpleado="";

	public List<Empleado> empleadosForeignKey;

	public List<Empleado> getempleadosForeignKey() {
		return empleadosForeignKey;
	}

	public void setempleadosForeignKey(List<Empleado> empleadosForeignKey) {
		this.empleadosForeignKey = empleadosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empleado empleadoForeignKey;

	public Empleado getempleadoForeignKey() {
		return empleadoForeignKey;
	}

	public void setempleadoForeignKey(Empleado empleadoForeignKey) {
		this.empleadoForeignKey = empleadoForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idEmpleadoActual=0L;

	public Long getidEmpleadoActual() {
		return idEmpleadoActual;
	}

	public void setidEmpleadoActual(Long idEmpleadoActual) {
		this.idEmpleadoActual= idEmpleadoActual;
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
	
	public Boolean isPermisoTodoTelefono_NM;
	public Boolean isPermisoNuevoTelefono_NM;
	public Boolean isPermisoActualizarTelefono_NM;
	public Boolean isPermisoActualizarOriginalTelefono_NM;
	public Boolean isPermisoEliminarTelefono_NM;
	public Boolean isPermisoGuardarCambiosTelefono_NM;
	public Boolean isPermisoConsultaTelefono_NM;
	public Boolean isPermisoBusquedaTelefono_NM;
	public Boolean isPermisoReporteTelefono_NM;
	public Boolean isPermisoPaginacionMedioTelefono_NM;
	public Boolean isPermisoPaginacionAltoTelefono_NM;
	public Boolean isPermisoPaginacionTodoTelefono_NM;
	public Boolean isPermisoCopiarTelefono_NM;
	public Boolean isPermisoVerFormTelefono_NM;
	public Boolean isPermisoDuplicarTelefono_NM;
	public Boolean isPermisoOrdenTelefono_NM;
	
	
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
	
	public Telefono_NMParameterReturnGeneral telefono_nmReturnGeneral;
	public Telefono_NMParameterReturnGeneral telefono_nmParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTelefono_NM=false;
	public Boolean esParaAccionDesdeFormularioTelefono_NM=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected Telefono_NMSessionBeanAdditional telefono_nmSessionBeanAdditional=null;
	
	public Telefono_NMSessionBeanAdditional getTelefono_NMSessionBeanAdditional() {
		return this.telefono_nmSessionBeanAdditional;
	}
	
	public void setTelefono_NMSessionBeanAdditional(Telefono_NMSessionBeanAdditional telefono_nmSessionBeanAdditional) {
		try {
			this.telefono_nmSessionBeanAdditional=telefono_nmSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected Telefono_NMBeanSwingJInternalFrameAdditional telefono_nmBeanSwingJInternalFrameAdditional=null;
	//public class Telefono_NMBeanSwingJInternalFrame
	
	public Telefono_NMBeanSwingJInternalFrameAdditional getTelefono_NMBeanSwingJInternalFrameAdditional() {
		return this.telefono_nmBeanSwingJInternalFrameAdditional;
	}
	
	public void setTelefono_NMBeanSwingJInternalFrameAdditional(Telefono_NMBeanSwingJInternalFrameAdditional telefono_nmBeanSwingJInternalFrameAdditional) {
		try {
			this.telefono_nmBeanSwingJInternalFrameAdditional=telefono_nmBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public Telefono_NMLogic telefono_nmLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Telefono_NM telefono_nmBean;
	public Telefono_NMConstantesFunciones telefono_nmConstantesFunciones;
	//public Telefono_NMParameterReturnGeneral telefono_nmReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EmpleadoLogic empleadoLogic;
	
	//PARAMETROS
	
	
	//public List<Telefono_NM> telefono_nms;	
	//public List<Telefono_NM> telefono_nmsEliminados;
	//public List<Telefono_NM> telefono_nmsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTelefono_NM=false;
	public Boolean isVisibilidadCeldaDuplicarTelefono_NM=true;
	public Boolean isVisibilidadCeldaCopiarTelefono_NM=true;
	public Boolean isVisibilidadCeldaVerFormTelefono_NM=true;
	public Boolean isVisibilidadCeldaOrdenTelefono_NM=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTelefono_NM=false;
	public Boolean isVisibilidadCeldaModificarTelefono_NM=false;
	public Boolean isVisibilidadCeldaActualizarTelefono_NM=false;
	public Boolean isVisibilidadCeldaEliminarTelefono_NM=false;
	public Boolean isVisibilidadCeldaCancelarTelefono_NM=false;
	public Boolean isVisibilidadCeldaGuardarTelefono_NM=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTelefono_NM=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTelefono_NM() {
		return this.iIdNuevoTelefono_NM;
	}

	public void setiIdNuevoTelefono_NM(Long iIdNuevoTelefono_NM) {
		this.iIdNuevoTelefono_NM = iIdNuevoTelefono_NM;
	}
	
	public Long getidTelefono_NMActual() {
		return this.idTelefono_NMActual;
	}

	public void setidTelefono_NMActual(Long idTelefono_NMActual) {
		this.idTelefono_NMActual = idTelefono_NMActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Telefono_NM gettelefono_nm() {
		return this.telefono_nm;
	}

	public void settelefono_nm(Telefono_NM telefono_nm) {
		this.telefono_nm = telefono_nm;
	}
	
	public Telefono_NM gettelefono_nmAux() {
		return this.telefono_nmAux;
	}

	public void settelefono_nmAux(Telefono_NM telefono_nmAux) {
		this.telefono_nmAux = telefono_nmAux;
	}				
	
	public Telefono_NM gettelefono_nmAnterior() {
		return this.telefono_nmAnterior;
	}

	public void settelefono_nmAnterior(Telefono_NM telefono_nmAnterior) {
		this.telefono_nmAnterior = telefono_nmAnterior;
	}	
	
	public Telefono_NM gettelefono_nmTotales() {
		return this.telefono_nmTotales;
	}

	public void settelefono_nmTotales(Telefono_NM telefono_nmTotales) {
		this.telefono_nmTotales = telefono_nmTotales;
	}	
	
	public Telefono_NM gettelefono_nmBean() {
		return this.telefono_nmBean;
	}

	public void settelefono_nmBean(Telefono_NM telefono_nmBean) {
		this.telefono_nmBean = telefono_nmBean;
	}	
	
	public Telefono_NMParameterReturnGeneral gettelefono_nmReturnGeneral() {
		return this.telefono_nmReturnGeneral;
	}

	public void settelefono_nmReturnGeneral(Telefono_NMParameterReturnGeneral telefono_nmReturnGeneral) {
		this.telefono_nmReturnGeneral = telefono_nmReturnGeneral;
	}	
	
	
	public Long id_empleadoFK_IdEmpleado=-1L;

	public Long getid_empleadoFK_IdEmpleado() {
		return this.id_empleadoFK_IdEmpleado;
	}

	public void setid_empleadoFK_IdEmpleado(Long id_empleadoFK_IdEmpleado) {
		this.id_empleadoFK_IdEmpleado = id_empleadoFK_IdEmpleado;
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
	
	
	public Telefono_NMLogic getTelefono_NMLogic()	{		
		return telefono_nmLogic;
	}

	public void setTelefono_NMLogic(Telefono_NMLogic telefono_nmLogic) {
		this.telefono_nmLogic = telefono_nmLogic;
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
	
	public Boolean getIsEsNuevoTelefono_NM() {
		return isEsNuevoTelefono_NM;
	}

	public void setIsEsNuevoTelefono_NM(Boolean isEsNuevoTelefono_NM) {
		this.isEsNuevoTelefono_NM = isEsNuevoTelefono_NM;
	}

	public Boolean getEsParaAccionDesdeFormularioTelefono_NM() {
		return esParaAccionDesdeFormularioTelefono_NM;
	}
	
	public void setEsParaAccionDesdeFormularioTelefono_NM(Boolean esParaAccionDesdeFormularioTelefono_NM) {
		this.esParaAccionDesdeFormularioTelefono_NM = esParaAccionDesdeFormularioTelefono_NM;
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

			if(this.telefono_nmSessionBean==null) {
				this.telefono_nmSessionBean=new Telefono_NMSessionBean();
			}

			if(!this.telefono_nmSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(telefono_nmSessionBean.getlidEmpresaActual());
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

	public void cargarCombosEmpleadosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empleadosForeignKey=new ArrayList<Empleado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpleadoLogic empleadoLogic=new EmpleadoLogic();

			//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.telefono_nmSessionBean==null) {
				this.telefono_nmSessionBean=new Telefono_NMSessionBean();
			}

			if(!this.telefono_nmSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

					empleadoLogic.getTodosEmpleadosWithConnection(sFinalQuery,new Pagination());

					this.empleadosForeignKey=empleadoLogic.getEmpleados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpleado(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(telefono_nmSessionBean.getlidEmpleadoActual());
					this.empleadosForeignKey.add(empleadoLogic.getEmpleado());
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

					if(this.telefono_nm!=null) {
						this.telefono_nm.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTelefono_NM!=null) {
						this.jInternalFrameDetalleFormTelefono_NM.jComboBoxid_empresaTelefono_NM.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTelefono_NM.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTelefono_NM!=null) {
						if(this.jInternalFrameDetalleFormTelefono_NM.jComboBoxid_empresaTelefono_NM.getItemCount()>0) {
							this.jInternalFrameDetalleFormTelefono_NM.jComboBoxid_empresaTelefono_NM.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTelefono_NMGenerico)throws Exception
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
				jComboBoxid_empresaTelefono_NMGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTelefono_NMGenerico!=null && jComboBoxid_empresaTelefono_NMGenerico.getItemCount()>0) {
					jComboBoxid_empresaTelefono_NMGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEmpleadoForeignKey(Long idEmpleadoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empleadoTemp!=null) {

					if(this.telefono_nm!=null) {
						this.telefono_nm.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormTelefono_NM!=null) {
						this.jInternalFrameDetalleFormTelefono_NM.jComboBoxid_empleadoTelefono_NM.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoTelefono_NM.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormTelefono_NM!=null) {
						if(this.jInternalFrameDetalleFormTelefono_NM.jComboBoxid_empleadoTelefono_NM.getItemCount()>0) {
							this.jInternalFrameDetalleFormTelefono_NM.jComboBoxid_empleadoTelefono_NM.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoTelefono_NM!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoTelefono_NM.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoTelefono_NM!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoTelefono_NM.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoTelefono_NM.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoTelefono_NM.setSelectedIndex(0);
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

	public String getActualEmpleadoForeignKeyDescripcion(Long idEmpleadoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}


			sDescripcion=EmpleadoConstantesFunciones.getEmpleadoDescripcion(empleadoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoTelefono_NMGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}

			if(empleadoTemp!=null) {
				jComboBoxid_empleadoTelefono_NMGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoTelefono_NMGenerico!=null && jComboBoxid_empleadoTelefono_NMGenerico.getItemCount()>0) {
					jComboBoxid_empleadoTelefono_NMGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Telefono_NM telefono_nm,JComboBox jComboBoxid_empresaTelefono_NMGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTelefono_NMGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTelefono_NM.jComboBoxid_empresaTelefono_NM.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTelefono_NMGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				telefono_nm.setid_empresa(empresaAux.getId());
				telefono_nm.setempresa_descripcion(Telefono_NMConstantesFunciones.getEmpresaDescripcion(empresaAux));
				telefono_nm.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(Telefono_NM telefono_nm,JComboBox jComboBoxid_empleadoTelefono_NMGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoTelefono_NMGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormTelefono_NM.jComboBoxid_empleadoTelefono_NM.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoTelefono_NMGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				telefono_nm.setid_empleado(empleadoAux.getId());
				telefono_nm.setempleado_descripcion(Telefono_NMConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				telefono_nm.setEmpleado(empleadoAux);			}
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

					if(!Telefono_NMJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTelefono_NM!=null) { 
							this.jInternalFrameDetalleFormTelefono_NM.jComboBoxid_empresaTelefono_NM.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTelefono_NM.jComboBoxid_empresaTelefono_NM.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTelefono_NM!=null) { 
					}

					if(!Telefono_NMJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpleadosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!Telefono_NMJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTelefono_NM!=null) { 
							this.jInternalFrameDetalleFormTelefono_NM.jComboBoxid_empleadoTelefono_NM.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormTelefono_NM.jComboBoxid_empleadoTelefono_NM.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTelefono_NM!=null) { 
					}

					if(!Telefono_NMJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!Telefono_NMJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoTelefono_NM.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoTelefono_NM.addItem(empleado);
							}
						}

						if(!Telefono_NMJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTelefono_NM!=null) {
							this.jInternalFrameDetalleFormTelefono_NM.jComboBoxid_empresaTelefono_NM.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTelefono_NM!=null) {
							this.jInternalFrameDetalleFormTelefono_NM.jComboBoxid_empresaTelefono_NM.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEmpleadoForeignKey(Empleado empleado,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTelefono_NM!=null) {
							this.jInternalFrameDetalleFormTelefono_NM.jComboBoxid_empleadoTelefono_NM.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormTelefono_NM!=null) {
							this.jInternalFrameDetalleFormTelefono_NM.jComboBoxid_empleadoTelefono_NM.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoTelefono_NM.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoTelefono_NM.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTelefono_NM() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			Telefono_NMConstantesFunciones.refrescarForeignKeysDescripcionesTelefono_NM(this.telefono_nmLogic.getTelefono_NMs());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			Telefono_NMConstantesFunciones.refrescarForeignKeysDescripcionesTelefono_NM(this.telefono_nms);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Empleado.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//telefono_nmLogic.setTelefono_NMs(this.telefono_nms);
			telefono_nmLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public Telefono_NMParameterReturnGeneral getTelefono_NMParameterGeneral() {
		return this.telefono_nmParameterGeneral;
	}
	
	public void setTelefono_NMParameterGeneral(Telefono_NMParameterReturnGeneral telefono_nmParameterGeneral) {
		this.telefono_nmParameterGeneral = telefono_nmParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTelefono_NM() {
		return isPermisoTodoTelefono_NM;
	}

	public void setIsPermisoTodoTelefono_NM(Boolean isPermisoTodoTelefono_NM) {
		this.isPermisoTodoTelefono_NM = isPermisoTodoTelefono_NM;
	}

	public Boolean getIsPermisoNuevoTelefono_NM() {
		return isPermisoNuevoTelefono_NM;
	}

	public void setIsPermisoNuevoTelefono_NM(Boolean isPermisoNuevoTelefono_NM) {
		this.isPermisoNuevoTelefono_NM = isPermisoNuevoTelefono_NM;
	}

	public Boolean getIsPermisoActualizarTelefono_NM() {
		return isPermisoActualizarTelefono_NM;
	}

	public void setIsPermisoActualizarTelefono_NM(Boolean isPermisoActualizarTelefono_NM) {
		this.isPermisoActualizarTelefono_NM = isPermisoActualizarTelefono_NM;
	}

	public Boolean getIsPermisoEliminarTelefono_NM() {
		return isPermisoEliminarTelefono_NM;
	}

	public void setIsPermisoEliminarTelefono_NM(Boolean isPermisoEliminarTelefono_NM) {
		this.isPermisoEliminarTelefono_NM = isPermisoEliminarTelefono_NM;
	}

	public Boolean getIsPermisoGuardarCambiosTelefono_NM() {
		return isPermisoGuardarCambiosTelefono_NM;
	}

	public void setIsPermisoGuardarCambiosTelefono_NM(Boolean isPermisoGuardarCambiosTelefono_NM) {
		this.isPermisoGuardarCambiosTelefono_NM = isPermisoGuardarCambiosTelefono_NM;
	}
	
	public Boolean getIsPermisoConsultaTelefono_NM() {
		return isPermisoConsultaTelefono_NM;
	}

	public void setIsPermisoConsultaTelefono_NM(Boolean isPermisoConsultaTelefono_NM) {
		this.isPermisoConsultaTelefono_NM = isPermisoConsultaTelefono_NM;
	}

	public Boolean getIsPermisoBusquedaTelefono_NM() {
		return isPermisoBusquedaTelefono_NM;
	}

	public void setIsPermisoBusquedaTelefono_NM(Boolean isPermisoBusquedaTelefono_NM) {
		this.isPermisoBusquedaTelefono_NM = isPermisoBusquedaTelefono_NM;
	}

	public Boolean getIsPermisoReporteTelefono_NM() {
		return isPermisoReporteTelefono_NM;
	}

	public void setIsPermisoReporteTelefono_NM(Boolean isPermisoReporteTelefono_NM) {
		this.isPermisoReporteTelefono_NM = isPermisoReporteTelefono_NM;
	}
	
	public Boolean getIsPermisoPaginacionMedioTelefono_NM() {
		return isPermisoPaginacionMedioTelefono_NM;
	}

	public void setIsPermisoPaginacionMedioTelefono_NM(Boolean isPermisoPaginacionMedioTelefono_NM) {
		this.isPermisoPaginacionMedioTelefono_NM = isPermisoPaginacionMedioTelefono_NM;
	}
	
	public Boolean getIsPermisoPaginacionTodoTelefono_NM() {
		return isPermisoPaginacionTodoTelefono_NM;
	}

	public void setIsPermisoPaginacionTodoTelefono_NM(Boolean isPermisoPaginacionTodoTelefono_NM) {
		this.isPermisoPaginacionTodoTelefono_NM = isPermisoPaginacionTodoTelefono_NM;
	}
	
	public Boolean getIsPermisoPaginacionAltoTelefono_NM() {
		return isPermisoPaginacionAltoTelefono_NM;
	}

	public void setIsPermisoPaginacionAltoTelefono_NM(Boolean isPermisoPaginacionAltoTelefono_NM) {
		this.isPermisoPaginacionAltoTelefono_NM = isPermisoPaginacionAltoTelefono_NM;
	}
	
	public Boolean getIsPermisoCopiarTelefono_NM() {
		return isPermisoCopiarTelefono_NM;
	}

	public void setIsPermisoCopiarTelefono_NM(Boolean isPermisoCopiarTelefono_NM) {
		this.isPermisoCopiarTelefono_NM = isPermisoCopiarTelefono_NM;
	}
	
	public Boolean getIsPermisoVerFormTelefono_NM() {
		return isPermisoVerFormTelefono_NM;
	}

	public void setIsPermisoVerFormTelefono_NM(Boolean isPermisoVerFormTelefono_NM) {
		this.isPermisoVerFormTelefono_NM = isPermisoVerFormTelefono_NM;
	}
	
	public Boolean getIsPermisoDuplicarTelefono_NM() {
		return isPermisoDuplicarTelefono_NM;
	}

	public void setIsPermisoDuplicarTelefono_NM(Boolean isPermisoDuplicarTelefono_NM) {
		this.isPermisoDuplicarTelefono_NM = isPermisoDuplicarTelefono_NM;
	}
	
	public Boolean getIsPermisoOrdenTelefono_NM() {
		return isPermisoOrdenTelefono_NM;
	}

	public void setIsPermisoOrdenTelefono_NM(Boolean isPermisoOrdenTelefono_NM) {
		this.isPermisoOrdenTelefono_NM = isPermisoOrdenTelefono_NM;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTelefono_NM() {
		return isVisibilidadCeldaNuevoTelefono_NM;
	}

	public void setIsVisibilidadCeldaNuevoTelefono_NM(Boolean isVisibilidadCeldaNuevoTelefono_NM) {
		this.isVisibilidadCeldaNuevoTelefono_NM = isVisibilidadCeldaNuevoTelefono_NM;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTelefono_NM() {
		return isVisibilidadCeldaDuplicarTelefono_NM;
	}

	public void setIsVisibilidadCeldaDuplicarTelefono_NM(Boolean isVisibilidadCeldaDuplicarTelefono_NM) {
		this.isVisibilidadCeldaDuplicarTelefono_NM = isVisibilidadCeldaDuplicarTelefono_NM;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTelefono_NM() {
		return isVisibilidadCeldaCopiarTelefono_NM;
	}

	public void setIsVisibilidadCeldaCopiarTelefono_NM(Boolean isVisibilidadCeldaCopiarTelefono_NM) {
		this.isVisibilidadCeldaCopiarTelefono_NM = isVisibilidadCeldaCopiarTelefono_NM;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTelefono_NM() {
		return isVisibilidadCeldaVerFormTelefono_NM;
	}

	public void setIsVisibilidadCeldaVerFormTelefono_NM(Boolean isVisibilidadCeldaVerFormTelefono_NM) {
		this.isVisibilidadCeldaVerFormTelefono_NM = isVisibilidadCeldaVerFormTelefono_NM;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTelefono_NM() {
		return isVisibilidadCeldaOrdenTelefono_NM;
	}

	public void setIsVisibilidadCeldaOrdenTelefono_NM(Boolean isVisibilidadCeldaOrdenTelefono_NM) {
		this.isVisibilidadCeldaOrdenTelefono_NM = isVisibilidadCeldaOrdenTelefono_NM;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTelefono_NM() {
		return isVisibilidadCeldaNuevoRelacionesTelefono_NM;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTelefono_NM(Boolean isVisibilidadCeldaNuevoRelacionesTelefono_NM) {
		this.isVisibilidadCeldaNuevoRelacionesTelefono_NM = isVisibilidadCeldaNuevoRelacionesTelefono_NM;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTelefono_NM() {
		return isVisibilidadCeldaModificarTelefono_NM;
	}

	public void setIsVisibilidadCeldaModificarTelefono_NM(Boolean isVisibilidadCeldaModificarTelefono_NM) {
		this.isVisibilidadCeldaModificarTelefono_NM = isVisibilidadCeldaModificarTelefono_NM;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTelefono_NM() {
		return isVisibilidadCeldaActualizarTelefono_NM;
	}

	public void setIsVisibilidadCeldaActualizarTelefono_NM(Boolean isVisibilidadCeldaActualizarTelefono_NM) {
		this.isVisibilidadCeldaActualizarTelefono_NM = isVisibilidadCeldaActualizarTelefono_NM;
	}

	public Boolean getIsVisibilidadCeldaEliminarTelefono_NM() {
		return isVisibilidadCeldaEliminarTelefono_NM;
	}

	public void setIsVisibilidadCeldaEliminarTelefono_NM(Boolean isVisibilidadCeldaEliminarTelefono_NM) {
		this.isVisibilidadCeldaEliminarTelefono_NM = isVisibilidadCeldaEliminarTelefono_NM;
	}

	public Boolean getIsVisibilidadCeldaCancelarTelefono_NM() {
		return isVisibilidadCeldaCancelarTelefono_NM;
	}

	public void setIsVisibilidadCeldaCancelarTelefono_NM(Boolean isVisibilidadCeldaCancelarTelefono_NM) {
		this.isVisibilidadCeldaCancelarTelefono_NM = isVisibilidadCeldaCancelarTelefono_NM;
	}

	public Boolean getIsVisibilidadCeldaGuardarTelefono_NM() {
		return isVisibilidadCeldaGuardarTelefono_NM;
	}

	public void setIsVisibilidadCeldaGuardarTelefono_NM(Boolean isVisibilidadCeldaGuardarTelefono_NM) {
		this.isVisibilidadCeldaGuardarTelefono_NM = isVisibilidadCeldaGuardarTelefono_NM;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTelefono_NM() {
		return isVisibilidadCeldaGuardarCambiosTelefono_NM;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTelefono_NM(Boolean isVisibilidadCeldaGuardarCambiosTelefono_NM) {
		this.isVisibilidadCeldaGuardarCambiosTelefono_NM = isVisibilidadCeldaGuardarCambiosTelefono_NM;
	}
		
	public Telefono_NMSessionBean gettelefono_nmSessionBean() {
		return this.telefono_nmSessionBean;
	}
	
	public void settelefono_nmSessionBean(Telefono_NMSessionBean telefono_nmSessionBean) {
		this.telefono_nmSessionBean=telefono_nmSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpleado() {
		return this.isVisibilidadFK_IdEmpleado;
	}

	public void setisVisibilidadFK_IdEmpleado(Boolean isVisibilidadFK_IdEmpleado) {
		this.isVisibilidadFK_IdEmpleado=isVisibilidadFK_IdEmpleado;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTelefono_NM(Telefono_NM telefono_nm)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(telefono_nm,null);
				this.setActualParaGuardarEmpleadoForeignKey(telefono_nm,null);
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
	
	public void bugActualizarReferenciaActual(Telefono_NM telefono_nm,Telefono_NM telefono_nmAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTelefono_NM(telefono_nm);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		telefono_nmAux.setId(telefono_nm.getId());
		telefono_nmAux.setVersionRow(telefono_nm.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTelefono_NM();
		
			int intSelectedRow = this.jTableDatosTelefono_NM.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono_nm =(Telefono_NM) this.telefono_nmLogic.getTelefono_NMs().toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.telefono_nm =(Telefono_NM) this.telefono_nms.toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(Telefono_NMJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTelefono_NM(this.telefono_nm,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTelefono_NM(this.telefono_nm);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = telefono_nmValidator.getInvalidValues(this.telefono_nm);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			telefono_nmLogic.setDatosCliente(datosCliente);
			telefono_nmLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				telefono_nmAux=new  Telefono_NM();
				
				telefono_nmAux.setIsNew(true);
				telefono_nmAux.setIsChanged(true);
				
				telefono_nmAux.setTelefono_NMOriginal(this.telefono_nm);
				
				telefono_nmAux.setId(this.telefono_nm.getId());	
				telefono_nmAux.setVersionRow(this.telefono_nm.getVersionRow());	
				telefono_nmAux.setid_empresa(this.telefono_nm.getid_empresa());	
				telefono_nmAux.setid_empleado(this.telefono_nm.getid_empleado());	
				telefono_nmAux.settelefono(this.telefono_nm.gettelefono());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.telefono_nmSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.telefono_nmSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(telefono_nmAux,telefono_nmLogic.getTelefono_NMs());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(telefono_nmAux,telefono_nms);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.telefono_nmSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.telefono_nmSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						telefono_nmLogic.saveTelefono_NMs();//WithConnection
						//telefono_nmLogic.getSetVersionRowTelefono_NMs();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.telefono_nm,telefono_nmAux);
					
					this.refrescarForeignKeysDescripcionesTelefono_NM();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.telefono_nmSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.telefono_nmSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								telefono_nmLogic.saveTelefono_NMRelaciones(telefono_nmAux);//WithConnection
								//telefono_nmLogic.getSetVersionRowTelefono_NMs();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.telefono_nm,telefono_nmAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.telefono_nmSessionBean.getEstaModoGuardarRelaciones() 
									|| this.telefono_nmSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(telefono_nmAux,telefono_nmLogic.getTelefono_NMs());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(telefono_nmAux,telefono_nms);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.telefono_nm,telefono_nmAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				telefono_nmAux=new  Telefono_NM();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.telefono_nmSessionBean.getEsGuardarRelacionado() 
					|| (this.telefono_nmSessionBean.getEsGuardarRelacionado() && this.telefono_nm.getId()>=0)) {
						
					telefono_nmAux.setIsNew(false);
				}
				
				telefono_nmAux.setIsDeleted(false);
			
				telefono_nmAux.setId(this.telefono_nm.getId());	
				telefono_nmAux.setVersionRow(this.telefono_nm.getVersionRow());	
				telefono_nmAux.setid_empresa(this.telefono_nm.getid_empresa());	
				telefono_nmAux.setid_empleado(this.telefono_nm.getid_empleado());	
				telefono_nmAux.settelefono(this.telefono_nm.gettelefono());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(telefono_nmAux,telefono_nmLogic.getTelefono_NMs());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(telefono_nmAux,telefono_nms);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.telefono_nmSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.telefono_nmSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						telefono_nmLogic.saveTelefono_NMs();//WithConnection
						//telefono_nmLogic.getSetVersionRowTelefono_NMs();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.telefono_nm,telefono_nmAux);
					
					this.refrescarForeignKeysDescripcionesTelefono_NM();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.telefono_nmSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.telefono_nmSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								telefono_nmLogic.saveTelefono_NMRelaciones(telefono_nmAux);//WithConnection
								//telefono_nmLogic.getSetVersionRowTelefono_NMs();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.telefono_nm,telefono_nmAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.telefono_nmSessionBean.getEstaModoGuardarRelaciones() 
									|| this.telefono_nmSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(telefono_nmAux,telefono_nmLogic.getTelefono_NMs());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(telefono_nmAux,telefono_nms);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.telefono_nm,telefono_nmAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				telefono_nmAux=new  Telefono_NM();
				
				telefono_nmAux.setIsNew(false);
				telefono_nmAux.setIsChanged(false);
				
				telefono_nmAux.setIsDeleted(true);
				
				telefono_nmAux.setId(this.telefono_nm.getId());	
				telefono_nmAux.setVersionRow(this.telefono_nm.getVersionRow());	
				telefono_nmAux.setid_empresa(this.telefono_nm.getid_empresa());	
				telefono_nmAux.setid_empleado(this.telefono_nm.getid_empleado());	
				telefono_nmAux.settelefono(this.telefono_nm.gettelefono());	
				
				if(this.telefono_nmSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.telefono_nmAux.getId()>=0) {	
						this.telefono_nmsEliminados.add(telefono_nmAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(telefono_nmAux,telefono_nmLogic.getTelefono_NMs());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(telefono_nmAux,telefono_nms);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.telefono_nmSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.telefono_nmSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						telefono_nmLogic.saveTelefono_NMs();//WithConnection
						//telefono_nmLogic.getSetVersionRowTelefono_NMs();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.telefono_nmSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.telefono_nmSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								telefono_nmLogic.saveTelefono_NMRelaciones(telefono_nmAux);//WithConnection
								//telefono_nmLogic.getSetVersionRowTelefono_NMs();//WithConnection
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
							if(this.telefono_nmSessionBean.getEstaModoGuardarRelaciones() 
								|| this.telefono_nmSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(telefono_nmAux,telefono_nmLogic.getTelefono_NMs());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(telefono_nmAux,telefono_nms);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono_nmLogic.getTelefono_NMs().addAll(this.telefono_nmsEliminados);
					
					telefono_nmLogic.saveTelefono_NMs();//WithConnection
					//telefono_nmLogic.getSetVersionRowTelefono_NMs();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTelefono_NM();
				
				this.telefono_nmsEliminados= new ArrayList<Telefono_NM>();		
			}
			
			if(this.telefono_nmSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.telefono_nmSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Telefono_ N M GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Telefono_ N M",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.telefono_nm=telefono_nmAux;
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
      		//this.finishProcessTelefono_NM();
      	}
		
	}	
	
	public void actualizarRelaciones(Telefono_NM telefono_nmLocal) throws Exception {
		
		if(this.telefono_nmSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Telefono_NM telefono_nmLocal) throws Exception {	
		if(this.telefono_nmSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				telefono_nmLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				telefono_nmLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTelefono_NMActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTelefono_NM.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.telefono_nm =(Telefono_NM) this.telefono_nmLogic.getTelefono_NMs().toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.telefono_nm =(Telefono_NM) this.telefono_nms.toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = telefono_nmValidator.getInvalidValues(this.telefono_nm);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Telefono_NM telefono_nm,List<Telefono_NM> telefono_nms) throws Exception {
		try	{		
			Telefono_NMConstantesFunciones.actualizarLista(telefono_nm,telefono_nms,this.telefono_nmSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Telefono_NM telefono_nm,List<Telefono_NM> telefono_nms) throws Exception {
		try	{			
			Telefono_NMConstantesFunciones.actualizarSelectedLista(telefono_nm,telefono_nms);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Telefono_NM> telefono_nmsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				telefono_nmsLocal=this.telefono_nmLogic.getTelefono_NMs();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				telefono_nmsLocal=this.telefono_nms;
			}
			//ARCHITECTURE
		
			for(Telefono_NM telefono_nmLocal:telefono_nmsLocal) {
				if(this.permiteMantenimiento(telefono_nmLocal) && telefono_nmLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+Telefono_NMConstantesFunciones.getTelefono_NMLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(Telefono_NMConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTelefono_NM.jLabelid_empresaTelefono_NM,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(Telefono_NMConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTelefono_NM.jLabelid_empleadoTelefono_NM,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(Telefono_NMConstantesFunciones.TELEFONO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTelefono_NM.jLabeltelefonoTelefono_NM,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTelefono_NM!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTelefono_NM.jLabelid_empresaTelefono_NM,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTelefono_NM.jLabelid_empleadoTelefono_NM,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTelefono_NM.jLabeltelefonoTelefono_NM,"");
		
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
		this.iIdNuevoTelefono_NM--;	
		
		
		this.telefono_nmAux=new Telefono_NM();
		
		this.telefono_nmAux.setId(this.iIdNuevoTelefono_NM);
		this.telefono_nmAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.telefono_nmLogic.getTelefono_NMs().add(this.telefono_nmAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.telefono_nms.add(this.telefono_nmAux);
		}
		//ARCHITECTURE
		
		this.telefono_nm=this.telefono_nmAux;
		
		if(Telefono_NMJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTelefono_NM(this.telefono_nm);
			this.setVariablesObjetoActualToFormularioForeignKeyTelefono_NM(this.telefono_nm);
		}
				
		//this.setDefaultControlesTelefono_NM();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTelefono_NM();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTelefono_NM();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTelefono_NM();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTelefono_NM(this.telefono_nmBean,this.telefono_nm,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTelefono_NM(this.telefono_nm);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(Telefono_NMConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.telefono_nmSessionBean.getConGuardarRelaciones()) {
			classes=Telefono_NMConstantesFunciones.getClassesRelationshipsOfTelefono_NM(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.telefono_nmReturnGeneral=telefono_nmLogic.procesarEventosTelefono_NMsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.telefono_nmLogic.getTelefono_NMs(),this.telefono_nm,this.telefono_nmParameterGeneral,this.isEsNuevoTelefono_NM,classes);//this.telefono_nmLogic.getTelefono_NM()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTelefono_NM(this.telefono_nmReturnGeneral,this.telefono_nmBean,false);
		
		if(this.telefono_nmReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTelefono_NM(this.telefono_nmReturnGeneral.getTelefono_NM());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTelefono_NM(this.telefono_nmReturnGeneral.getTelefono_NM());
		}
		
		if(this.telefono_nmReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTelefono_NM(this.telefono_nmReturnGeneral.getTelefono_NM(),classes);//this.telefono_nmBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTelefono_NM(this.telefono_nm,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTelefono_NM();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTelefono_NM();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			Telefono_NMBeanSwingJInternalFrameAdditional.RecargarFormTelefono_NM(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTelefono_NM(false);
						
			if(telefono_nmSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(Telefono_NMJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTelefono_NM();
			}
			
			this.actualizarVisualTableDatosTelefono_NM();
			
			this.jTableDatosTelefono_NM.setRowSelectionInterval(this.getIndiceNuevoTelefono_NM(), this.getIndiceNuevoTelefono_NM());
			
			this.seleccionarFilaTablaTelefono_NMActual();
						
			this.actualizarEstadoCeldasBotonesTelefono_NM("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTelefono_NM(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTelefono_NM.jTextFieldtelefonoTelefono_NM.setEnabled(isHabilitar && this.telefono_nmConstantesFunciones.activartelefonoTelefono_NM);	
		//
		this.jInternalFrameDetalleFormTelefono_NM.jComboBoxid_empresaTelefono_NM.setEnabled(isHabilitar && this.telefono_nmConstantesFunciones.activarid_empresaTelefono_NM);
		this.jInternalFrameDetalleFormTelefono_NM.jComboBoxid_empleadoTelefono_NM.setEnabled(isHabilitar && this.telefono_nmConstantesFunciones.activarid_empleadoTelefono_NM);
	};
	
	public void setDefaultControlesTelefono_NM() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTelefono_NM(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.telefono_nmSessionBean.setConGuardarRelaciones(true);			
			this.telefono_nmSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTelefono_NM.jTabbedPaneRelacionesTelefono_NM.setVisible(true);
			
					
		} else {
			//this.telefono_nmSessionBean.setConGuardarRelaciones(false);			
			this.telefono_nmSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTelefono_NM.jTabbedPaneRelacionesTelefono_NM.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTelefono_NM() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Telefono_NM telefono_nmAux:this.telefono_nmLogic.getTelefono_NMs()) {
				if(telefono_nmAux.getId().equals(this.iIdNuevoTelefono_NM)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Telefono_NM telefono_nmAux:this.telefono_nms) {
				if(telefono_nmAux.getId().equals(this.iIdNuevoTelefono_NM)) {
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
	
	public int getIndiceActualTelefono_NM(Telefono_NM telefono_nm,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Telefono_NM telefono_nmAux:this.telefono_nmLogic.getTelefono_NMs()) {
				if(telefono_nmAux.getId().equals(telefono_nm.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Telefono_NM telefono_nmAux:this.telefono_nms) {
				if(telefono_nmAux.getId().equals(telefono_nm.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTelefono_NM(Telefono_NM telefono_nmOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Telefono_NM telefono_nmAux:this.telefono_nmLogic.getTelefono_NMs()) {
				if(telefono_nmAux.getTelefono_NMOriginal().getId().equals(telefono_nmOriginal.getId())) {
					existe=true;
					telefono_nmOriginal.setId(telefono_nmAux.getId());
					telefono_nmOriginal.setVersionRow(telefono_nmAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Telefono_NM telefono_nmAux:this.telefono_nms) {
				if(telefono_nmAux.getTelefono_NMOriginal().getId().equals(telefono_nmOriginal.getId())) {
					existe=true;
					telefono_nmOriginal.setId(telefono_nmAux.getId());
					telefono_nmOriginal.setVersionRow(telefono_nmAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTelefono_NM(Boolean esParaCancelar) throws Exception {
		telefono_nmsAux=new ArrayList<Telefono_NM>();
		telefono_nmAux=new Telefono_NM();
		
		if(!this.telefono_nmSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Telefono_NM telefono_nmAux:this.telefono_nmLogic.getTelefono_NMs()) {
					if(telefono_nmAux.getId()<0) {
						telefono_nmsAux.add(telefono_nmAux);
					}		
				}
				this.iIdNuevoTelefono_NM=0L;
				this.telefono_nmLogic.getTelefono_NMs().removeAll(telefono_nmsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Telefono_NM telefono_nmAux:this.telefono_nms) {
					if(telefono_nmAux.getId()<0) {
						telefono_nmsAux.add(telefono_nmAux);
					}		
				}
				this.iIdNuevoTelefono_NM=0L;
				this.telefono_nms.removeAll(telefono_nmsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTelefono_NM 
					&& this.telefono_nmLogic.getTelefono_NMs().size()>0
					) {
					telefono_nmAux=this.telefono_nmLogic.getTelefono_NMs().get(this.telefono_nmLogic.getTelefono_NMs().size() - 1);
				
					if(telefono_nmAux.getId()<0) {
						this.telefono_nmLogic.getTelefono_NMs().remove(telefono_nmAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTelefono_NM && this.telefono_nms.size()>0) {
					telefono_nmAux=this.telefono_nms.get(this.telefono_nms.size() - 1);
				
					if(telefono_nmAux.getId()<0) {
						this.telefono_nms.remove(telefono_nmAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTelefono_NM(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(telefono_nm.getId()<0) {
				this.telefono_nmLogic.getTelefono_NMs().remove(this.telefono_nm);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(telefono_nm.getId()<0) {
				this.telefono_nms.remove(this.telefono_nm);
			}
		}			
	}
	
	public void setEstadosInicialesTelefono_NM(List<Telefono_NM> telefono_nmsAux) throws Exception {
		Telefono_NMConstantesFunciones.setEstadosInicialesTelefono_NM(telefono_nmsAux);
	}
	
	public void setEstadosInicialesTelefono_NM(Telefono_NM telefono_nmAux) throws Exception {
		Telefono_NMConstantesFunciones.setEstadosInicialesTelefono_NM(telefono_nmAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTelefono_NMActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTelefono_NM("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTelefono_NMActual()) {
				if(!this.isEsNuevoTelefono_NM) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTelefono_NM("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTelefono_NM=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTelefono_NMActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Telefono_ N M ?", "MANTENIMIENTO DE Telefono_ N M", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTelefono_NM("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Telefono_NM telefono_nm) throws Exception {
		Telefono_NMConstantesFunciones.seleccionarAsignar(this.telefono_nm,telefono_nm);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTelefono_NM=this.isPermisoActualizarOriginalTelefono_NM;
			
			
			this.seleccionarAsignar(telefono_nm);
			
			

			idEmpleadoActual=telefono_nm.getid_empleado();
			this.seleccionarEmpleadoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			Telefono_NMConstantesFunciones.quitarEspaciosTelefono_NM(this.telefono_nm,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTelefono_NM("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.telefono_nmSessionBean.setsFuncionBusquedaRapida(this.telefono_nmSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarEmpleadoActual() throws Exception {
		try	{
			Empleado empleadoAux=new Empleado();

			if(this.idEmpleadoActual != null && this.idEmpleadoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(this.idEmpleadoActual);
					empleadoAux= empleadoLogic.getEmpleado();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				empleadosForeignKey=new ArrayList<Empleado>();
				empleadosForeignKey.add(empleadoAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTelefono_NM) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTelefono_NM(esParaCancelar);				
				this.cancelarNuevoTelefono_NM(esParaCancelar);								
			}
			
			this.telefono_nm=new Telefono_NM();
			
			this.inicializarTelefono_NM();
			
			this.actualizarEstadoCeldasBotonesTelefono_NM("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTelefono_NM() throws Exception {
		try {
			Telefono_NMConstantesFunciones.inicializarTelefono_NM(this.telefono_nm);
			
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
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.telefono_nmLogic.getTelefono_NMs().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTelefono_NMs(String sAccionBusqueda,List<Telefono_NM> telefono_nmsParaReportes) throws Exception {
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
					sPathReporteFinal="Telefono_NM"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="Telefono_NMMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("Telefono_NMMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Telefono_NM"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Telefono_ N Mes");		
		parameters.put("busquedapor", Telefono_NMConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTelefono_NM=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			Telefono_NMConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			Telefono_NMConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTelefono_NM=new JRBeanArrayDataSource(Telefono_NMJInternalFrame.TraerTelefono_NMBeans(telefono_nmsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTelefono_NM);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+Telefono_NMConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+Telefono_NMConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(Telefono_NMBean.TraerTelefono_NMBeans(telefono_nmsParaReportes).toArray()));
							
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
				this.generarExcelReporteTelefono_NMs(sAccionBusqueda,sTipoArchivoReporte,telefono_nmsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTelefono_NMs(sAccionBusqueda,sTipoArchivoReporte,telefono_nmsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTelefono_NMActionPerformed(null);
					//this.generarExcelReporteTelefono_NMs(sAccionBusqueda,sTipoArchivoReporte,telefono_nmsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTelefono_NMs(sAccionBusqueda,sTipoArchivoReporte,telefono_nmsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTelefono_NMs(sAccionBusqueda,sTipoArchivoReporte,telefono_nmsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTelefono_NMs(sAccionBusqueda,sTipoArchivoReporte,telefono_nmsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTelefono_NMs(String sAccionBusqueda,String sTipoArchivoReporte,List<Telefono_NM> telefono_nmsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"telefono_nm";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Telefono_NMs");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTelefono_NM("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Telefono_NM telefono_nm : telefono_nmsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			Telefono_NMConstantesFunciones.generarExcelReporteDataTelefono_NM("NORMAL",row,workbook,telefono_nm,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.telefono_nmSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Telefono_ N M",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTelefono_NM(String sTipo,Row row,Workbook workbook) {
		
		Telefono_NMConstantesFunciones.generarExcelReporteHeaderTelefono_NM(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTelefono_NMs(String sAccionBusqueda,String sTipoArchivoReporte,List<Telefono_NM> telefono_nmsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"telefono_nm_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Telefono_NMs");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Telefono_NM telefono_nm : telefono_nmsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(Telefono_NMConstantesFunciones.getTelefono_NMDescripcion(telefono_nm));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(Telefono_NMConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(Telefono_NMConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(telefono_nm.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(Telefono_NMConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(Telefono_NMConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(telefono_nm.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(Telefono_NMConstantesFunciones.LABEL_TELEFONO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(Telefono_NMConstantesFunciones.LABEL_TELEFONO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(telefono_nm.gettelefono());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.telefono_nmSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Telefono_ N M",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTelefono_NMs(String sAccionBusqueda,String sTipoArchivoReporte,List<Telefono_NM> telefono_nmsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Telefono_NM> telefono_nmsRespaldo=null;
		
		classes=Telefono_NMConstantesFunciones.getClassesRelationshipsOfTelefono_NM(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.telefono_nmLogic.setDatosCliente(this.datosCliente);
		this.telefono_nmLogic.setDatosDeep(this.datosDeep);
		this.telefono_nmLogic.setIsConDeep(true);
		
		telefono_nmsRespaldo=this.telefono_nmLogic.getTelefono_NMs();
		
		this.telefono_nmLogic.setTelefono_NMs(telefono_nmsParaReportes);	
		this.telefono_nmLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		telefono_nmsParaReportes=this.telefono_nmLogic.getTelefono_NMs();
		this.telefono_nmLogic.setTelefono_NMs(telefono_nmsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"telefono_nm_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Telefono_NMs");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTelefono_NM("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Telefono_NM telefono_nm : telefono_nmsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTelefono_NM("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			Telefono_NMConstantesFunciones.generarExcelReporteDataTelefono_NM("NORMAL",row,workbook,telefono_nm,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(Telefono_NMConstantesFunciones.getTelefono_NMDescripcion(telefono_nm));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.telefono_nmSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Telefono_ N M",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTelefono_NM.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTelefono_NM.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTelefono_NM.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTelefono_NM.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTelefono_NM() throws Exception {		
		this.startProcessTelefono_NM(true);
	}
	
	public void startProcessTelefono_NM(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTelefono_NM ,this.jPanelParametrosReportesTelefono_NM, this.jScrollPanelDatosTelefono_NM,this.jPanelPaginacionTelefono_NM, this.jScrollPanelDatosEdicionTelefono_NM, this.jPanelAccionesTelefono_NM,this.jPanelAccionesFormularioTelefono_NM,this.jmenuBarTelefono_NM,this.jmenuBarDetalleTelefono_NM,this.jTtoolBarTelefono_NM,this.jTtoolBarDetalleTelefono_NM);		
		
		final JTabbedPane jTabbedPaneBusquedasTelefono_NM=this.jTabbedPaneBusquedasTelefono_NM; 
		
		final JPanel jPanelParametrosReportesTelefono_NM=this.jPanelParametrosReportesTelefono_NM;
		//final JScrollPane jScrollPanelDatosTelefono_NM=this.jScrollPanelDatosTelefono_NM;
		final JTable jTableDatosTelefono_NM=this.jTableDatosTelefono_NM;		
		final JPanel jPanelPaginacionTelefono_NM=this.jPanelPaginacionTelefono_NM;
		//final JScrollPane jScrollPanelDatosEdicionTelefono_NM=this.jScrollPanelDatosEdicionTelefono_NM;
		final JPanel jPanelAccionesTelefono_NM=this.jPanelAccionesTelefono_NM;
		
		JPanel jPanelCamposAuxiliarTelefono_NM=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTelefono_NM=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTelefono_NM!=null) {
			jPanelCamposAuxiliarTelefono_NM=this.jInternalFrameDetalleFormTelefono_NM.jPanelCamposTelefono_NM;
			jPanelAccionesFormularioAuxiliarTelefono_NM=this.jInternalFrameDetalleFormTelefono_NM.jPanelAccionesFormularioTelefono_NM;
		}
		
		final JPanel jPanelCamposTelefono_NM=jPanelCamposAuxiliarTelefono_NM;
		final JPanel jPanelAccionesFormularioTelefono_NM=jPanelAccionesFormularioAuxiliarTelefono_NM;
		
		
		final JMenuBar jmenuBarTelefono_NM=this.jmenuBarTelefono_NM;
		final JToolBar jTtoolBarTelefono_NM=this.jTtoolBarTelefono_NM;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTelefono_NM=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTelefono_NM=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTelefono_NM!=null) {
			jmenuBarDetalleAuxiliarTelefono_NM=this.jInternalFrameDetalleFormTelefono_NM.jmenuBarDetalleTelefono_NM;
			jTtoolBarDetalleAuxiliarTelefono_NM=this.jInternalFrameDetalleFormTelefono_NM.jTtoolBarDetalleTelefono_NM;
		}
		
		final JMenuBar jmenuBarDetalleTelefono_NM=jmenuBarDetalleAuxiliarTelefono_NM;
		final JToolBar jTtoolBarDetalleTelefono_NM=jTtoolBarDetalleAuxiliarTelefono_NM;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTelefono_NM;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTelefono_NM;
			processRunnable.jTableDatos=jTableDatosTelefono_NM;
			processRunnable.jPanelCampos=jPanelCamposTelefono_NM;
			processRunnable.jPanelPaginacion=jPanelPaginacionTelefono_NM;
			processRunnable.jPanelAcciones=jPanelAccionesTelefono_NM;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTelefono_NM;
			
			
			processRunnable.jmenuBar=jmenuBarTelefono_NM;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTelefono_NM;
			processRunnable.jTtoolBar=jTtoolBarTelefono_NM;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTelefono_NM;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTelefono_NM ,jPanelParametrosReportesTelefono_NM,jTableDatosTelefono_NM, /*jScrollPanelDatosTelefono_NM,*/jPanelCamposTelefono_NM,jPanelPaginacionTelefono_NM, /*jScrollPanelDatosEdicionTelefono_NM,*/ jPanelAccionesTelefono_NM,jPanelAccionesFormularioTelefono_NM,jmenuBarTelefono_NM,jmenuBarDetalleTelefono_NM,jTtoolBarTelefono_NM,jTtoolBarDetalleTelefono_NM);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTelefono_NM ,jPanelParametrosReportesTelefono_NM, jScrollPanelDatosTelefono_NM,jPanelPaginacionTelefono_NM, jScrollPanelDatosEdicionTelefono_NM, jPanelAccionesTelefono_NM,jPanelAccionesFormularioTelefono_NM,jmenuBarTelefono_NM,jmenuBarDetalleTelefono_NM,jTtoolBarTelefono_NM,jTtoolBarDetalleTelefono_NM);
						
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
	
	public void finishProcessTelefono_NM() {// throws Exception 
		this.finishProcessTelefono_NM(true);
	}
	
	public void finishProcessTelefono_NM(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTelefono_NM ,this.jPanelParametrosReportesTelefono_NM, this.jScrollPanelDatosTelefono_NM,this.jPanelPaginacionTelefono_NM, this.jScrollPanelDatosEdicionTelefono_NM, this.jPanelAccionesTelefono_NM,this.jPanelAccionesFormularioTelefono_NM,this.jmenuBarTelefono_NM,this.jmenuBarDetalleTelefono_NM,this.jTtoolBarTelefono_NM,this.jTtoolBarDetalleTelefono_NM);		
		
		final JTabbedPane jTabbedPaneBusquedasTelefono_NM=this.jTabbedPaneBusquedasTelefono_NM; 
		
		final JPanel jPanelParametrosReportesTelefono_NM=this.jPanelParametrosReportesTelefono_NM;
		//final JScrollPane jScrollPanelDatosTelefono_NM=this.jScrollPanelDatosTelefono_NM;
		final JTable jTableDatosTelefono_NM=this.jTableDatosTelefono_NM;		
		final JPanel jPanelPaginacionTelefono_NM=this.jPanelPaginacionTelefono_NM;
		//final JScrollPane jScrollPanelDatosEdicionTelefono_NM=this.jScrollPanelDatosEdicionTelefono_NM;
		final JPanel jPanelAccionesTelefono_NM=this.jPanelAccionesTelefono_NM;
		
		JPanel jPanelCamposAuxiliarTelefono_NM=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTelefono_NM=new JPanel();
		
		if(this.jInternalFrameDetalleFormTelefono_NM!=null) {
			jPanelCamposAuxiliarTelefono_NM=this.jInternalFrameDetalleFormTelefono_NM.jPanelCamposTelefono_NM;
			jPanelAccionesFormularioAuxiliarTelefono_NM=this.jInternalFrameDetalleFormTelefono_NM.jPanelAccionesFormularioTelefono_NM;
		}
		
		final JPanel jPanelCamposTelefono_NM=jPanelCamposAuxiliarTelefono_NM;
		final JPanel jPanelAccionesFormularioTelefono_NM=jPanelAccionesFormularioAuxiliarTelefono_NM;
		
		
		final JMenuBar jmenuBarTelefono_NM=this.jmenuBarTelefono_NM;		
		final JToolBar jTtoolBarTelefono_NM=this.jTtoolBarTelefono_NM;
				
		JMenuBar jmenuBarDetalleAuxiliarTelefono_NM=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTelefono_NM=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTelefono_NM!=null) {
			jmenuBarDetalleAuxiliarTelefono_NM=this.jInternalFrameDetalleFormTelefono_NM.jmenuBarDetalleTelefono_NM;
			jTtoolBarDetalleAuxiliarTelefono_NM=this.jInternalFrameDetalleFormTelefono_NM.jTtoolBarDetalleTelefono_NM;		
		}
		
		final JMenuBar jmenuBarDetalleTelefono_NM=jmenuBarDetalleAuxiliarTelefono_NM;
		final JToolBar jTtoolBarDetalleTelefono_NM=jTtoolBarDetalleAuxiliarTelefono_NM;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTelefono_NM;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTelefono_NM;
			processRunnable.jTableDatos=jTableDatosTelefono_NM;
			processRunnable.jPanelCampos=jPanelCamposTelefono_NM;
			processRunnable.jPanelPaginacion=jPanelPaginacionTelefono_NM;
			processRunnable.jPanelAcciones=jPanelAccionesTelefono_NM;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTelefono_NM;
			
			
			processRunnable.jmenuBar=jmenuBarTelefono_NM;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTelefono_NM;
			processRunnable.jTtoolBar=jTtoolBarTelefono_NM;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTelefono_NM;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTelefono_NM ,jPanelParametrosReportesTelefono_NM, jTableDatosTelefono_NM,/*jScrollPanelDatosTelefono_NM,*/jPanelCamposTelefono_NM,jPanelPaginacionTelefono_NM, /*jScrollPanelDatosEdicionTelefono_NM,*/ jPanelAccionesTelefono_NM,jPanelAccionesFormularioTelefono_NM,jmenuBarTelefono_NM,jmenuBarDetalleTelefono_NM,jTtoolBarTelefono_NM,jTtoolBarDetalleTelefono_NM));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTelefono_NM(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTelefono_NM(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTelefono_NM(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTelefono_NM(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTelefono_NM,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTelefono_NM,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTelefono_NM(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTelefono_NM,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTelefono_NM,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.telefono_nmConstantesFunciones.getsFinalQueryTelefono_NM();
		String  finalQueryPaginacionTodos=this.telefono_nmConstantesFunciones.getsFinalQueryTelefono_NM();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=Telefono_NMConstantesFunciones.getArrayColumnasGlobalesNoTelefono_NM(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=Telefono_NMConstantesFunciones.getArrayColumnasGlobalesTelefono_NM(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,Telefono_NMConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.telefono_nmsEliminados= new ArrayList<Telefono_NM>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTelefono_NM();
		
				///*Telefono_NMSessionBean*/this.telefono_nmSessionBean=new Telefono_NMSessionBean();
			
			if(this.telefono_nmSessionBean==null) {
				this.telefono_nmSessionBean=new Telefono_NMSessionBean();
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
					this.iNumeroPaginacion=Telefono_NMConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=Telefono_NMConstantesFunciones.getClassesForeignKeysOfTelefono_NM(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/telefono_nm."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			telefono_nmsAux= new ArrayList<Telefono_NM>();
			
				
			telefono_nmLogic.setDatosCliente(this.datosCliente);
			telefono_nmLogic.setDatosDeep(this.datosDeep);
			telefono_nmLogic.setIsConDeep(true);
			
			
			telefono_nmLogic.getTelefono_NMDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					telefono_nmLogic.getTodosTelefono_NMs(finalQueryGlobal,pagination);
					
					//telefono_nmLogic.getTodosTelefono_NMsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(telefono_nmLogic.getTelefono_NMs()==null|| telefono_nmLogic.getTelefono_NMs().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							telefono_nmsAux= new ArrayList<Telefono_NM>();
							telefono_nmsAux.addAll(telefono_nmLogic.getTelefono_NMs());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							telefono_nmsAux= new ArrayList<Telefono_NM>();
							telefono_nmsAux.addAll(telefono_nms);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							telefono_nmLogic.getTodosTelefono_NMs(finalQueryGlobal+"",this.pagination);												
							
							//telefono_nmLogic.getTodosTelefono_NMsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTelefono_NMs("Todos",telefono_nmLogic.getTelefono_NMs() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							telefono_nmLogic.setTelefono_NMs(new ArrayList<Telefono_NM>());					
							telefono_nmLogic.getTelefono_NMs().addAll(telefono_nmsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							telefono_nms=new ArrayList<Telefono_NM>();
							telefono_nms.addAll(telefono_nmsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTelefono_NM=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTelefono_NM=this.idActual;
				
				} else if(this.idTelefono_NMActual!=null && this.idTelefono_NMActual!=0L) {
					idTelefono_NM=idTelefono_NMActual;
				}
				
					
				this.sDetalleReporte=Telefono_NMConstantesFunciones.getDetalleIndicePorId(idTelefono_NM);
				
				this.telefono_nms=new ArrayList<Telefono_NM>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					telefono_nmLogic.getEntity(idTelefono_NM);
					
					//telefono_nmLogic.getEntityWithConnection(idTelefono_NM);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					telefono_nmLogic.setTelefono_NMs(new ArrayList<Telefono_NM>());
					telefono_nmLogic.getTelefono_NMs().add(telefono_nmLogic.getTelefono_NM());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.telefono_nms=new ArrayList<Telefono_NM>();
					this.telefono_nms.add(telefono_nm);
				}
				
				if(telefono_nmLogic.getTelefono_NM()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=Telefono_NMConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					telefono_nmLogic.getTelefono_NMsFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=Telefono_NMConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=Telefono_NMConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=telefono_nmLogic.getTelefono_NMs()==null||telefono_nmLogic.getTelefono_NMs().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=telefono_nms==null|| telefono_nms.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						telefono_nmsAux=new ArrayList<Telefono_NM>();
						telefono_nmsAux.addAll(telefono_nmLogic.getTelefono_NMs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							telefono_nmsAux=new ArrayList<Telefono_NM>();
							telefono_nmsAux.addAll(telefono_nms);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							telefono_nmLogic.getTelefono_NMsFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=Telefono_NMConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=Telefono_NMConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTelefono_NMs("FK_IdEmpleado",telefono_nmLogic.getTelefono_NMs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTelefono_NMs("FK_IdEmpleado",telefono_nms);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						telefono_nmLogic.setTelefono_NMs(new ArrayList<Telefono_NM>());
						telefono_nmLogic.getTelefono_NMs().addAll(telefono_nmsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							telefono_nms=new ArrayList<Telefono_NM>();
							telefono_nms.addAll(telefono_nmsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=Telefono_NMConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					telefono_nmLogic.getTelefono_NMsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=Telefono_NMConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=Telefono_NMConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=telefono_nmLogic.getTelefono_NMs()==null||telefono_nmLogic.getTelefono_NMs().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=telefono_nms==null|| telefono_nms.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						telefono_nmsAux=new ArrayList<Telefono_NM>();
						telefono_nmsAux.addAll(telefono_nmLogic.getTelefono_NMs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							telefono_nmsAux=new ArrayList<Telefono_NM>();
							telefono_nmsAux.addAll(telefono_nms);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							telefono_nmLogic.getTelefono_NMsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=Telefono_NMConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=Telefono_NMConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTelefono_NMs("FK_IdEmpresa",telefono_nmLogic.getTelefono_NMs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTelefono_NMs("FK_IdEmpresa",telefono_nms);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						telefono_nmLogic.setTelefono_NMs(new ArrayList<Telefono_NM>());
						telefono_nmLogic.getTelefono_NMs().addAll(telefono_nmsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							telefono_nms=new ArrayList<Telefono_NM>();
							telefono_nms.addAll(telefono_nmsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTelefono_NM();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTelefono_NM();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=telefono_nmLogic.getTelefono_NMs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=telefono_nms.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=telefono_nmLogic.getTelefono_NMs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=telefono_nms.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Telefono_NM telefono_nm) {
		Boolean permite=true;
		
		if(this.telefono_nm.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=Telefono_NMConstantesFunciones.getOrderByListaTelefono_NM();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=Telefono_NMConstantesFunciones.getOrderByListaTelefono_NM();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Telefono_NM telefono_nm:telefono_nmLogic.getTelefono_NMs()) {
				if(telefono_nm.getsType().equals(Constantes2.S_TOTALES)) {
					telefono_nmTotales=telefono_nm;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Telefono_NM telefono_nm:this.telefono_nms) {
				if(telefono_nm.getsType().equals(Constantes2.S_TOTALES)) {
					telefono_nmTotales=telefono_nm;
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
			this.telefono_nmAux=new Telefono_NM();
			this.telefono_nmAux.setsType(Constantes2.S_TOTALES);
			this.telefono_nmAux.setIsNew(false);
			this.telefono_nmAux.setIsChanged(false);
			this.telefono_nmAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				Telefono_NMConstantesFunciones.TotalizarValoresFilaTelefono_NM(this.telefono_nmLogic.getTelefono_NMs(),this.telefono_nmAux);
				
				this.telefono_nmLogic.getTelefono_NMs().add(this.telefono_nmAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				Telefono_NMConstantesFunciones.TotalizarValoresFilaTelefono_NM(this.telefono_nms,this.telefono_nmAux);
				
				this.telefono_nms.add(this.telefono_nmAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		telefono_nmTotales=new Telefono_NM();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.telefono_nmLogic.getTelefono_NMs().remove(telefono_nmTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.telefono_nms.remove(telefono_nmTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		telefono_nmTotales=new Telefono_NM();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Telefono_NM telefono_nm:telefono_nmLogic.getTelefono_NMs()) {
				if(telefono_nm.getsType().equals(Constantes2.S_TOTALES)) {
					telefono_nmTotales=telefono_nm;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				Telefono_NMConstantesFunciones.TotalizarValoresFilaTelefono_NM(this.telefono_nmLogic.getTelefono_NMs(),telefono_nmTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Telefono_NM telefono_nm:this.telefono_nms) {
				if(telefono_nm.getsType().equals(Constantes2.S_TOTALES)) {
					telefono_nmTotales=telefono_nm;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				Telefono_NMConstantesFunciones.TotalizarValoresFilaTelefono_NM(this.telefono_nms,telefono_nmTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTelefono_NMsFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTelefono_NMsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTelefono_NMsFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					telefono_nmLogic.getTelefono_NMsFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTelefono_NMsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					telefono_nmLogic.getTelefono_NMsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTelefono_NM() {
		this.isPermisoTodoTelefono_NM=false;
		this.isPermisoNuevoTelefono_NM=false;
		this.isPermisoActualizarTelefono_NM=false;
		this.isPermisoActualizarOriginalTelefono_NM=false;
		this.isPermisoEliminarTelefono_NM=false;
		this.isPermisoGuardarCambiosTelefono_NM=false;
		this.isPermisoConsultaTelefono_NM=false;
		this.isPermisoBusquedaTelefono_NM=false;
		this.isPermisoReporteTelefono_NM=false;		
		this.isPermisoOrdenTelefono_NM=false;		
		this.isPermisoPaginacionMedioTelefono_NM=false;		
		this.isPermisoPaginacionAltoTelefono_NM=false;
		this.isPermisoPaginacionTodoTelefono_NM=false;
		this.isPermisoCopiarTelefono_NM=false;		
		this.isPermisoVerFormTelefono_NM=false;		
		this.isPermisoDuplicarTelefono_NM=false;		
		this.isPermisoOrdenTelefono_NM=false;		
	}
	
	public void setPermisosUsuarioTelefono_NM(Boolean isPermiso) {
		this.isPermisoTodoTelefono_NM=isPermiso;
		this.isPermisoNuevoTelefono_NM=isPermiso;
		this.isPermisoActualizarTelefono_NM=isPermiso;
		this.isPermisoActualizarOriginalTelefono_NM=isPermiso;
		this.isPermisoEliminarTelefono_NM=isPermiso;
		this.isPermisoGuardarCambiosTelefono_NM=isPermiso;
		this.isPermisoConsultaTelefono_NM=isPermiso;
		this.isPermisoBusquedaTelefono_NM=isPermiso;
		this.isPermisoReporteTelefono_NM=isPermiso;
		this.isPermisoOrdenTelefono_NM=isPermiso;		
		this.isPermisoPaginacionMedioTelefono_NM=isPermiso;		
		this.isPermisoPaginacionAltoTelefono_NM=isPermiso;		
		this.isPermisoPaginacionTodoTelefono_NM=isPermiso;		
		this.isPermisoCopiarTelefono_NM=isPermiso;		
		this.isPermisoVerFormTelefono_NM=isPermiso;		
		this.isPermisoDuplicarTelefono_NM=isPermiso;
		this.isPermisoOrdenTelefono_NM=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTelefono_NM(Boolean isPermiso) {
		//this.isPermisoTodoTelefono_NM=isPermiso;
		this.isPermisoNuevoTelefono_NM=isPermiso;
		this.isPermisoActualizarTelefono_NM=isPermiso;
		this.isPermisoActualizarOriginalTelefono_NM=isPermiso;
		this.isPermisoEliminarTelefono_NM=isPermiso;
		this.isPermisoGuardarCambiosTelefono_NM=isPermiso;
		//this.isPermisoConsultaTelefono_NM=isPermiso;
		//this.isPermisoBusquedaTelefono_NM=isPermiso;
		//this.isPermisoReporteTelefono_NM=isPermiso;
		//this.isPermisoOrdenTelefono_NM=isPermiso;		
		//this.isPermisoPaginacionMedioTelefono_NM=isPermiso;		
		//this.isPermisoPaginacionAltoTelefono_NM=isPermiso;		
		//this.isPermisoPaginacionTodoTelefono_NM=isPermiso;		
		//this.isPermisoCopiarTelefono_NM=isPermiso;		
		//this.isPermisoDuplicarTelefono_NM=isPermiso;
		//this.isPermisoOrdenTelefono_NM=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTelefono_NMClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(Telefono_NMJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTelefono_NM(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTelefono_NMClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTelefono_NMClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTelefono_NMClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTelefono_NMClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTelefono_NM() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(Telefono_NMJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.telefono_nmSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, Telefono_NMConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTelefono_NM=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTelefono_NM=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTelefono_NM=this.isPermisoActualizarTelefono_NM;
			this.isPermisoEliminarTelefono_NM=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTelefono_NM=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTelefono_NM=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTelefono_NM=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTelefono_NM=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTelefono_NM=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTelefono_NM=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTelefono_NM=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTelefono_NM=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTelefono_NM=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTelefono_NM=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTelefono_NM=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTelefono_NM=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTelefono_NM=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.telefono_nmSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTelefono_NM.setToolTipText(this.jTableDatosTelefono_NM.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTelefono_NM(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTelefono_NM(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(Telefono_NMJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(Telefono_NMJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTelefono_NM() throws Exception {
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
	public void inicializarCombosForeignKeyTelefono_NMListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTelefono_NMListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(Telefono_NMJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTelefono_NMListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEmpleadoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpleadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTelefono_NMListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			Telefono_NMParameterReturnGeneral telefono_nmReturnGeneral=new Telefono_NMParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.telefono_nmConstantesFunciones.cargarid_empresaTelefono_NM)
					 || (this.esRecargarFks && this.telefono_nmConstantesFunciones.cargarid_empresaTelefono_NM)) {

					if(!this.telefono_nmSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+telefono_nmSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.telefono_nmConstantesFunciones.cargarid_empleadoTelefono_NM)
					 || (this.esRecargarFks && this.telefono_nmConstantesFunciones.cargarid_empleadoTelefono_NM)) {

					if(!this.telefono_nmSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+telefono_nmSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				telefono_nmReturnGeneral=telefono_nmLogic.cargarCombosLoteForeignKeyTelefono_NM(finalQueryGlobalEmpresa,finalQueryGlobalEmpleado);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=telefono_nmReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=telefono_nmReturnGeneral.getempleadosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTelefono_NM()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpleado();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.telefono_nmSessionBean==null) {
				this.telefono_nmSessionBean=new Telefono_NMSessionBean();
			}

			if(!this.telefono_nmSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.telefono_nmSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				Empleado empleado=new Empleado();
				EmpleadoConstantesFunciones.setEmpleadoDescripcion(empleado,Constantes.SMENSAJE_ESCOJA_OPCION);
				empleado.setId(null);

				if(!EmpleadoConstantesFunciones.ExisteEnLista(this.empleadosForeignKey,empleado,true)) {

					this.empleadosForeignKey.add(0,empleado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTelefono_NM()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTelefono_NM(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTelefono_NM()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTelefono_NM();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTelefono_NM(Telefono_NM telefono_nm)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(telefono_nm.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTelefono_NM(Telefono_NM telefono_nm,String sTipoEvento)throws Exception {	
		try {
			
			

				if(telefono_nm.getEmpleado()!=null && !sTipoEvento.equals("id_empleadoTelefono_NM")) { //sTipoEvento Evita Bucle Infinito

					this.empleadosForeignKey=new ArrayList<Empleado>();
					this.empleadosForeignKey.add(telefono_nm.getEmpleado());

					this.addItemDefectoCombosForeignKeyEmpleado();
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTelefono_NM()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.telefono_nmConstantesFunciones.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTelefono_NM()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTelefono_NM()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTelefono_NM()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTelefono_NM()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTelefono_NM()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTelefono_NM(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTelefono_NM()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTelefono_NM.jComboBoxid_empresaTelefono_NM!=null && this.jInternalFrameDetalleFormTelefono_NM.jComboBoxid_empresaTelefono_NM.getItemCount()>0) {
				this.jInternalFrameDetalleFormTelefono_NM.jComboBoxid_empresaTelefono_NM.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTelefono_NM.jComboBoxid_empleadoTelefono_NM!=null && this.jInternalFrameDetalleFormTelefono_NM.jComboBoxid_empleadoTelefono_NM.getItemCount()>0) {
				this.jInternalFrameDetalleFormTelefono_NM.jComboBoxid_empleadoTelefono_NM.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public Telefono_NMBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public Telefono_NMBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public Telefono_NMBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.telefono_nmSessionBean=new Telefono_NMSessionBean(); 
		this.telefono_nmConstantesFunciones=new Telefono_NMConstantesFunciones(); 
		this.telefono_nmBean=new Telefono_NM();//(this.telefono_nmConstantesFunciones); 		
		this.telefono_nmReturnGeneral=new Telefono_NMParameterReturnGeneral(); 
		
		this.telefono_nmSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.telefono_nmSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public Telefono_NMBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public Telefono_NMBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public Telefono_NMBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTelefono_NM(true);
			
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
			
			this.telefono_nmConstantesFunciones=new Telefono_NMConstantesFunciones(); 
			this.telefono_nmBean=new Telefono_NM();//this.telefono_nmConstantesFunciones); 			
			this.telefono_nmReturnGeneral=new Telefono_NMParameterReturnGeneral(); 
		
			Telefono_NMBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Telefono_ N M Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.telefono_nm=new Telefono_NM();
			this.telefono_nms = new ArrayList<Telefono_NM>();
			this.telefono_nmsAux = new ArrayList<Telefono_NM>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic=new Telefono_NMLogic();
				this.telefono_nmLogic.getNewConnexionToDeep("");
			}
			
			//this.telefono_nmSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.telefono_nmSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTelefono_NM);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTelefono_NM!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTelefono_NM);	
					}
					
					if(this.jInternalFrameImportacionTelefono_NM!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTelefono_NM);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTelefono_NM!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTelefono_NM);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTelefono_NM!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTelefono_NM);
				this.jInternalFrameDetalleFormTelefono_NM.setVisible(false);
				this.jInternalFrameDetalleFormTelefono_NM.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTelefono_NM!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTelefono_NM);
					this.jInternalFrameReporteDinamicoTelefono_NM.setVisible(false);
					this.jInternalFrameReporteDinamicoTelefono_NM.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTelefono_NM!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTelefono_NM);
					this.jInternalFrameImportacionTelefono_NM.setVisible(false);
					this.jInternalFrameImportacionTelefono_NM.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTelefono_NM!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTelefono_NM);
					this.jInternalFrameOrderByTelefono_NM.setVisible(false);
					this.jInternalFrameOrderByTelefono_NM.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTelefono_NMActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=Telefono_NMConstantesFunciones.INUMEROPAGINACION;
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
			
			this.telefono_nmReturnGeneral=new Telefono_NMParameterReturnGeneral();
			
			this.telefono_nmParameterGeneral=new Telefono_NMParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.telefono_nmLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.telefono_nmSessionBean.getEsGuardarRelacionado()) {
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
			
			if(Telefono_NMJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.telefono_nmSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,Telefono_NMConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.telefono_nmSessionBean.getEsGuardarRelacionado(),this.telefono_nmSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,Telefono_NMConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.telefono_nmSessionBean.getEsGuardarRelacionado(),this.telefono_nmSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTelefono_NM=false;
			this.isVisibilidadCeldaDuplicarTelefono_NM=true;
			this.isVisibilidadCeldaCopiarTelefono_NM=true;
			this.isVisibilidadCeldaVerFormTelefono_NM=true;
			this.isVisibilidadCeldaOrdenTelefono_NM=true;
			this.isVisibilidadCeldaNuevoRelacionesTelefono_NM=false;
			this.isVisibilidadCeldaModificarTelefono_NM=false;
			this.isVisibilidadCeldaActualizarTelefono_NM=false;
			this.isVisibilidadCeldaEliminarTelefono_NM=false;
			this.isVisibilidadCeldaCancelarTelefono_NM=false;
			this.isVisibilidadCeldaGuardarTelefono_NM=false;
			this.isVisibilidadCeldaGuardarCambiosTelefono_NM=false;
			
			
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTelefono_NM("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTelefono_NM();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTelefono_NM(false);
			
			this.setPermisosUsuarioTelefono_NM();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.telefono_nmSessionBean.getEsGuardarRelacionado() 
				|| (this.telefono_nmSessionBean.getEsGuardarRelacionado() && this.telefono_nmSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTelefono_NMClasesRelacionadas();
			}
			
			if(this.telefono_nmSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTelefono_NMClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!Telefono_NMJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTelefono_NM();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTelefono_NM();
			}
			
			if(!this.isPermisoBusquedaTelefono_NM) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTelefono_NM.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.telefono_nmSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTelefono_NM,this.isPermisoPaginacionMedioTelefono_NM,this.isPermisoPaginacionTodoTelefono_NM);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(Telefono_NMConstantesFunciones.getTiposSeleccionarTelefono_NM());
				
				this.tiposColumnasSelect=Telefono_NMConstantesFunciones.getTiposSeleccionarTelefono_NM(true);
				
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
			//if(!this.telefono_nmSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTelefono_NM();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTelefono_NM(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTelefono_NM(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTelefono_NM() ;
			
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
			this.empleadoLogic=new EmpleadoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				telefono_nmImplementable= (Telefono_NMImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+Telefono_NMConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				telefono_nmImplementableHome= (Telefono_NMImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+Telefono_NMConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.telefono_nms= new ArrayList<Telefono_NM>();
			this.telefono_nmsEliminados= new ArrayList<Telefono_NM>();
						
			this.isEsNuevoTelefono_NM=false;
			this.esParaAccionDesdeFormularioTelefono_NM=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idEmpleadoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTelefono_NM(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTelefono_NM();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.telefono_nmSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			Telefono_NMBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=Telefono_NMConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTelefono_NM("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTelefono_NM(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTelefono_NM!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTelefono_NM();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTelefono_NM();
			}
			
			Telefono_NMBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTelefono_NM.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTelefono_NM.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTelefono_NM.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTelefono_NM(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Telefono_NM: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTelefono_NM() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTelefono_NM")) {
				iIndex=this.jInternalFrameDetalleFormTelefono_NM.jTabbedPaneRelacionesTelefono_NM.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTelefono_NM.jTabbedPaneRelacionesTelefono_NM.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTelefono_NM.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTelefono_NM();	
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
	
	public void cargarCombosForeignKeyTelefono_NM(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTelefono_NM(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTelefono_NM(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTelefono_NMListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTelefono_NM();
		
		this.cargarCombosFrameForeignKeyTelefono_NM();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTelefono_NM();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTelefono_NM();
		}
	}
	
	

	public void cargarCombosForeignKeyEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEmpleado(this.empleadosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTelefono_NMActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.telefono_nmSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTelefono_NM==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
			
			
			if(jTableDatosTelefono_NM.getRowCount()>=1) {
				jTableDatosTelefono_NM.removeRowSelectionInterval(0, jTableDatosTelefono_NM.getRowCount()-1);						
			}
			
			this.isEsNuevoTelefono_NM=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTelefono_NM(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTelefono_NM(true);			
			//this.telefono_nm=new Telefono_NM();
			//this.telefono_nm.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTelefono_NM(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTelefono_NM() ;
			
			if(Telefono_NMJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTelefono_NM(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.telefono_nm);	
			this.actualizarInformacion("INFO_PADRE",false,this.telefono_nm);				
			
			Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
			
			if(this.telefono_nmSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Telefono_NM: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTelefono_NMActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Telefono_NM> telefono_nmsSeleccionados=new ArrayList<Telefono_NM>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTelefono_NM.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTelefono_NM.getSelectedRows().length;			
			}
			
			telefono_nmsSeleccionados=this.getTelefono_NMsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTelefono_NM--;			
				//Telefono_NM telefono_nmAux= new Telefono_NM();			
				//telefono_nmAux.setId(this.iIdNuevoTelefono_NM);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Telefono_NM telefono_nmOrigen=new Telefono_NM();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Telefono_NM telefono_nmOrigen : telefono_nmsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTelefono_NM.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							telefono_nmOrigen =(Telefono_NM) this.telefono_nmLogic.getTelefono_NMs().toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							telefono_nmOrigen =(Telefono_NM) this.telefono_nms.toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTelefono_NM();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.telefono_nm.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTelefono_NM(telefono_nmOrigen,this.telefono_nm,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono_NM(this.telefono_nm);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.telefono_nmLogic.getTelefono_NMs().add(this.telefono_nmAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.telefono_nms.add(this.telefono_nmAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTelefono_NM(false);
				
				this.jTableDatosTelefono_NM.setRowSelectionInterval(this.getIndiceNuevoTelefono_NM(), this.getIndiceNuevoTelefono_NM());
				
				int iLastRow =  this.jTableDatosTelefono_NM.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTelefono_NM.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTelefono_NM.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTelefono_NM(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTelefono_NMActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Telefono_NM> telefono_nmsSeleccionados=new ArrayList<Telefono_NM>();									
		
			Telefono_NM telefono_nmOrigen=new Telefono_NM();
			Telefono_NM telefono_nmDestino=new Telefono_NM();
				
			telefono_nmsSeleccionados=this.getTelefono_NMsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTelefono_NM.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || telefono_nmsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTelefono_NM.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						telefono_nmOrigen =(Telefono_NM) this.telefono_nmLogic.getTelefono_NMs().toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						telefono_nmOrigen =(Telefono_NM) this.telefono_nms.toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						telefono_nmDestino =(Telefono_NM) this.telefono_nmLogic.getTelefono_NMs().toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						telefono_nmDestino =(Telefono_NM) this.telefono_nms.toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				telefono_nmOrigen =telefono_nmsSeleccionados.get(0);
				telefono_nmDestino =telefono_nmsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTelefono_NM(telefono_nmOrigen,telefono_nmDestino,true,false);
				
				telefono_nmDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(telefono_nmDestino,telefono_nmLogic.getTelefono_NMs());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(telefono_nmDestino,telefono_nms);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTelefono_NM(false);
				
				//this.jTableDatosTelefono_NM.setRowSelectionInterval(this.getIndiceNuevoTelefono_NM(), this.getIndiceNuevoTelefono_NM());
				
				int iLastRow =  this.jTableDatosTelefono_NM.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTelefono_NM.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTelefono_NM.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTelefono_NM(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTelefono_NMActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTelefono_NM==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTelefono_NM.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTelefono_NMActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTelefono_NM.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTelefono_NM.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTelefono_NM.setVisible(!isVisible);
			this.jPanelPaginacionTelefono_NM.setVisible(!isVisible);
			this.jPanelAccionesTelefono_NM.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTelefono_NMActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTelefono_NM();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTelefono_NMActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTelefono_NM();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTelefono_NMActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTelefono_NM();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTelefono_NMActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTelefono_NM();
			
			this.abrirFrameOrderByTelefono_NM();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTelefono_NMActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTelefono_NM();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTelefono_NM(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTelefono_NM);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTelefono_NM.isMaximum()) {
					this.jInternalFrameDetalleFormTelefono_NM.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTelefono_NM.setSize(this.jInternalFrameDetalleFormTelefono_NM.iWidthFormulario,this.jInternalFrameDetalleFormTelefono_NM.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTelefono_NM.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTelefono_NM.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTelefono_NM.isMaximum()) {
						this.jInternalFrameDetalleFormTelefono_NM.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTelefono_NM.jContentPaneDetalleTelefono_NM.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTelefono_NM.jTabbedPaneRelacionesTelefono_NM.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTelefono_NM.jContentPaneDetalleTelefono_NM.getWidth(),Telefono_NMConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTelefono_NM.jTabbedPaneRelacionesTelefono_NM.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTelefono_NM.jContentPaneDetalleTelefono_NM.getWidth(),Telefono_NMConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTelefono_NM.jTabbedPaneRelacionesTelefono_NM.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTelefono_NM.jContentPaneDetalleTelefono_NM.getWidth(),Telefono_NMConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTelefono_NM.setVisible(true);
	        this.jInternalFrameDetalleFormTelefono_NM.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTelefono_NM() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTelefono_NM==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTelefono_NM=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTelefono_NM,false,this);
				} else {
					this.jInternalFrameOrderByTelefono_NM=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTelefono_NM,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTelefono_NM);
				this.jInternalFrameOrderByTelefono_NM.setVisible(false);
				this.jInternalFrameOrderByTelefono_NM.setSelected(false);
				
				this.jInternalFrameOrderByTelefono_NM.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTelefono_NM"));
				
				this.inicializarActualizarBindingTablaOrderByTelefono_NM();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTelefono_NM() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTelefono_NM==null) {
				
				this.jInternalFrameImportacionTelefono_NM=new ImportacionJInternalFrame(Telefono_NMConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTelefono_NM);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTelefono_NM);
				this.jInternalFrameImportacionTelefono_NM.setVisible(false);
				this.jInternalFrameImportacionTelefono_NM.setSelected(false);


				this.jInternalFrameImportacionTelefono_NM.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTelefono_NM"));
				this.jInternalFrameImportacionTelefono_NM.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTelefono_NM"));
				this.jInternalFrameImportacionTelefono_NM.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTelefono_NM"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTelefono_NM() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTelefono_NM==null) {
				this.jInternalFrameReporteDinamicoTelefono_NM=new ReporteDinamicoJInternalFrame(Telefono_NMConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTelefono_NM);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTelefono_NM);
				this.jInternalFrameReporteDinamicoTelefono_NM.setVisible(false);
				this.jInternalFrameReporteDinamicoTelefono_NM.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTelefono_NM.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTelefono_NM"));
				this.jInternalFrameReporteDinamicoTelefono_NM.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTelefono_NM"));
				this.jInternalFrameReporteDinamicoTelefono_NM.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTelefono_NM"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTelefono_NM();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTelefono_NM() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTelefono_NM);
			
	       	this.jInternalFrameDetalleFormTelefono_NM.setVisible(false);
	        this.jInternalFrameDetalleFormTelefono_NM.setSelected(false);
			
			//this.jInternalFrameDetalleFormTelefono_NM.dispose();
			//this.jInternalFrameDetalleFormTelefono_NM=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTelefono_NM() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTelefono_NM.setVisible(true);
	        this.jInternalFrameReporteDinamicoTelefono_NM.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTelefono_NM() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTelefono_NM.setVisible(true);
	        this.jInternalFrameImportacionTelefono_NM.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTelefono_NM() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTelefono_NM.setVisible(true);
	        this.jInternalFrameOrderByTelefono_NM.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTelefono_NM() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTelefono_NM.setVisible(false);
	        this.jInternalFrameOrderByTelefono_NM.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTelefono_NM() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTelefono_NM.setVisible(false);
	        this.jInternalFrameReporteDinamicoTelefono_NM.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTelefono_NM() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTelefono_NM.setVisible(false);
	        this.jInternalFrameImportacionTelefono_NM.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTelefono_NMActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTelefono_NM(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTelefono_NM(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTelefono_NM.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTelefono_NM(true);
			//this.isEsNuevoTelefono_NM=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nm =(Telefono_NM) this.telefono_nmLogic.getTelefono_NMs().toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.telefono_nm =(Telefono_NM) this.telefono_nms.toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTelefono_NM("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTelefono_NM(false) ;
			
			if(telefono_nmSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(Telefono_NMJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTelefono_NM(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTelefono_NM(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTelefono_NMActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTelefono_NM.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono_nm =(Telefono_NM) this.telefono_nmLogic.getTelefono_NMs().toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.telefono_nm =(Telefono_NM) this.telefono_nms.toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTelefono_NM(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTelefono_NM==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTelefono_NM.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTelefono_NM(true);
			//this.isEsNuevoTelefono_NM=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nm =(Telefono_NM) this.telefono_nmLogic.getTelefono_NMs().toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.telefono_nm =(Telefono_NM) this.telefono_nms.toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.telefono_nm.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTelefono_NM("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTelefono_NM(false) ;
			
			if(Telefono_NMJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTelefono_NM(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTelefono_NM(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Empleado")) {
				if(!this.telefono_nmConstantesFunciones.cargarid_empleadoTelefono_NM) {
					this.cargarCombosEmpleadosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingTelefono_NM(false,false);
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_empleado (id);

				this.recargarComboTablaEmpleado(this.empleadosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosTelefono_NM.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTelefono_NM,Telefono_NMConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTelefono_NM.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_empleado (Long id) throws Exception {
		this.setActualEmpleadoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarTelefono_NMActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTelefono_NM(false);
			
			//if(!this.isEsNuevoTelefono_NM) {								
				int intSelectedRow = this.jTableDatosTelefono_NM.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono_nm =(Telefono_NM) this.telefono_nmLogic.getTelefono_NMs().toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.telefono_nm =(Telefono_NM) this.telefono_nms.toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(Telefono_NMJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTelefono_NM(this.telefono_nm,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTelefono_NM(this.telefono_nm);
				
			}
			
			if(this.permiteMantenimiento(this.telefono_nm)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.telefono_nmSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTelefono_NM=true;
					this.inicializarActualizarBindingTablaTelefono_NM(false);
					this.isEsNuevoTelefono_NM=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTelefono_NM=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTelefono_NM=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTelefono_NM(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTelefono_NM(false);
				
				this.habilitarDeshabilitarControlesTelefono_NM(false);
			
												
				
				if(Telefono_NMJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTelefono_NM();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTelefono_NMActionPerformed(evt,telefono_nmSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTelefono_NM(this.telefono_nm,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTelefono_NM.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,telefono_nmSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.telefono_nm.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Telefono_NM.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Telefono_NM.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTelefono_NMActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTelefono_NM.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nm =(Telefono_NM) this.telefono_nmLogic.getTelefono_NMs().toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
				this.telefono_nm.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.telefono_nm =(Telefono_NM) this.telefono_nms.toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
				this.telefono_nm.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.telefono_nm)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.telefono_nmSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((Telefono_NMModel) this.jTableDatosTelefono_NM.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTelefono_NM=true;
				this.inicializarActualizarBindingTablaTelefono_NM(false);
				this.isEsNuevoTelefono_NM=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTelefono_NM(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTelefono_NM(false);
				
				this.habilitarDeshabilitarControlesTelefono_NM(false);
				
				
				
				if(Telefono_NMJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTelefono_NM();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTelefono_NMActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTelefono_NM.getRowCount()>=1) {
				jTableDatosTelefono_NM.removeRowSelectionInterval(0, jTableDatosTelefono_NM.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTelefono_NM(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTelefono_NM(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTelefono_NM(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTelefono_NM(false) ;
			
			this.isEsNuevoTelefono_NM=false;
			
			if(Telefono_NMJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTelefono_NM();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTelefono_NMActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTelefono_NM(false);
				
				//SI ES MANUAL
				if(Telefono_NMJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTelefono_NM();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTelefono_NMActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTelefono_NM--;			
			//Telefono_NM telefono_nmAux= new Telefono_NM();			
			//telefono_nmAux.setId(this.iIdNuevoTelefono_NM);
			
			if(this.jInternalFrameDetalleFormTelefono_NM==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTelefono_NM();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTelefono_NM(this.telefono_nm);
			
			this.telefono_nm.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.telefono_nmLogic.getTelefono_NMs().add(this.telefono_nmAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.telefono_nms.add(this.telefono_nmAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTelefono_NM(false);
			
			this.jTableDatosTelefono_NM.setRowSelectionInterval(this.getIndiceNuevoTelefono_NM(), this.getIndiceNuevoTelefono_NM());
			
			int iLastRow =  this.jTableDatosTelefono_NM.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTelefono_NM.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTelefono_NM.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTelefono_NM(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTelefono_NMActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTelefono_NM(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTelefono_NM(false);
			
			//SI ES MANUAL
			if(Telefono_NMJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTelefono_NM();
			}
			
			//this.abrirFrameTreeTelefono_NM();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTelefono_NMActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Telefono_ N MES ?", "MANTENIMIENTO DE Telefono_ N M", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTelefono_NM.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTelefono_NM();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.telefono_nmReturnGeneral=telefono_nmLogic.procesarImportacionTelefono_NMsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.telefono_nmParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTelefono_NMReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTelefono_NMActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTelefono_NM.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTelefono_NM.setFileImportacion(this.jInternalFrameImportacionTelefono_NM.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTelefono_NM.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTelefono_NM.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTelefono_NM.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTelefono_NM.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTelefono_NMActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Telefono_NM> telefono_nmsSeleccionados=new ArrayList<Telefono_NM>();		

		telefono_nmsSeleccionados=this.getTelefono_NMsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTelefono_NM.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTelefono_NM.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("Telefono_NMBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"Telefono_NMBaseDesign.jrxml";
			
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
			
			this.generarReporteTelefono_NMs("Todos",telefono_nmsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.telefono_nmSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Telefono_ N M",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTelefono_NM.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTelefono_NM.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case Telefono_NMConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case Telefono_NMConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case Telefono_NMConstantesFunciones.LABEL_TELEFONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefono_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefono_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefono_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefono_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTelefono_NM.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTelefono_NM.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTelefono_NM.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case Telefono_NMConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case Telefono_NMConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case Telefono_NMConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoria="telefono";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTelefono_NM.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case Telefono_NMConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case Telefono_NMConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case Telefono_NMConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoriaValor="telefono";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTelefono_NM.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTelefono_NM.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case Telefono_NMConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case Telefono_NMConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case Telefono_NMConstantesFunciones.LABEL_TELEFONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono");
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
	
	public void jButtonGenerarExcelReporteDinamicoTelefono_NMActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Telefono_NM> telefono_nmsSeleccionados=new ArrayList<Telefono_NM>();		
		
		telefono_nmsSeleccionados=this.getTelefono_NMsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"telefono_nm";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Telefono_NMs");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTelefono_NM.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTelefono_NM.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case Telefono_NMConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(Telefono_NMConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Telefono_NM telefono_nm:telefono_nmsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(telefono_nm.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case Telefono_NMConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(Telefono_NMConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(Telefono_NM telefono_nm:telefono_nmsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(telefono_nm.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case Telefono_NMConstantesFunciones.LABEL_TELEFONO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(Telefono_NMConstantesFunciones.LABEL_TELEFONO);
					iRow++;

					for(Telefono_NM telefono_nm:telefono_nmsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(telefono_nm.gettelefono());
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
			//	this.getFilaCabeceraExportarExcelTelefono_NM(row);				
			//	iRow++;
			//}				
			
			//for(Telefono_NM telefono_nmAux:telefono_nmsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTelefono_NM(telefono_nmAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.telefono_nmSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Telefono_ N M",JOptionPane.INFORMATION_MESSAGE);
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
				this.telefono_nmLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTelefono_NM(false);
			
			//SI ES MANUAL
			if(Telefono_NMJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTelefono_NM();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTelefono_NMActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTelefono_NM(false);
			
			//SI ES MANUAL
			if(Telefono_NMJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTelefono_NM();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTelefono_NMActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTelefono_NM(false);
			
			//SI ES MANUAL
			if(Telefono_NMJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTelefono_NM();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTelefono_NM() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTelefono_NM.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTelefono_NM.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTelefono_NM.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTelefono_NM.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTelefono_NM.setMinimumSize(dimensionMinimum);
		this.jTableDatosTelefono_NM.setMaximumSize(dimensionMaximum);
		this.jTableDatosTelefono_NM.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTelefono_NM(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTelefono_NM(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTelefono_NM(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTelefono_NM(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTelefono_NM(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.telefono_nmSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTelefono_NM(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTelefono_NM(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTelefono_NM(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !Telefono_NMJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!Telefono_NMJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTelefono_NM() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTelefono_NM();
		
		this.inicializarActualizarBindingBotonesManualTelefono_NM(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.telefono_nmSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTelefono_NM();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTelefono_NM() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTelefono_NM(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTelefono_NM(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTelefono_NM.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTelefono_NM.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTelefono_NM.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTelefono_NM!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTelefono_NM.jCheckBoxPostAccionNuevoTelefono_NM.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTelefono_NM.jCheckBoxPostAccionSinCerrarTelefono_NM.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTelefono_NM.jCheckBoxPostAccionSinMensajeTelefono_NM.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTelefono_NM.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTelefono_NM.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTelefono_NM.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTelefono_NM!=null) {
				this.jInternalFrameDetalleFormTelefono_NM.jCheckBoxPostAccionNuevoTelefono_NM.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTelefono_NM.jCheckBoxPostAccionSinCerrarTelefono_NM.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTelefono_NM.jCheckBoxPostAccionSinMensajeTelefono_NM.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTelefono_NM.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTelefono_NM.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTelefono_NM!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTelefono_NM.jComboBoxTiposAccionesFormularioTelefono_NM.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTelefono_NM.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTelefono_NM!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTelefono_NM.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTelefono_NM.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTelefono_NM.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTelefono_NM.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTelefono_NM.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTelefono_NM!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTelefono_NM.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTelefono_NM.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTelefono_NM.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTelefono_NM(Boolean esInicializar) throws Exception {
		try	{	
			if(Telefono_NMJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTelefono_NM(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTelefono_NM() throws Exception {
		try	{
			if(Telefono_NMJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTelefono_NM();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTelefono_NM() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTelefono_NM.jComboBoxTiposAccionesFormularioTelefono_NM.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTelefono_NM.jComboBoxTiposAccionesFormularioTelefono_NM.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTelefono_NM() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTelefono_NM.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTelefono_NM.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTelefono_NM.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTelefono_NM.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTelefono_NM.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTelefono_NM.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTelefono_NM.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTelefono_NM.addItem(reporte);
			}
			
			
			if(!this.telefono_nmSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTelefono_NM.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTelefono_NM.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTelefono_NM.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTelefono_NM.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTelefono_NM.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTelefono_NM.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTelefono_NM!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTelefono_NM.jComboBoxTiposAccionesFormularioTelefono_NM.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTelefono_NM.jComboBoxTiposAccionesFormularioTelefono_NM.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTelefono_NM.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTelefono_NM.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTelefono_NM.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTelefono_NM();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTelefono_NM() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTelefono_NM!=null) {
				this.jInternalFrameReporteDinamicoTelefono_NM.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTelefono_NM.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTelefono_NM!=null) {
				this.jInternalFrameReporteDinamicoTelefono_NM.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTelefono_NM.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTelefono_NM!=null) {
				
				if(this.jInternalFrameReporteDinamicoTelefono_NM.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTelefono_NM.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTelefono_NM.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTelefono_NM.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTelefono_NM.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTelefono_NM.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTelefono_NM()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoTelefono_NM.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoTelefono_NM.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTelefono_NM(Boolean esInicializar) throws Exception {				
		if(Telefono_NMJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTelefono_NM();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTelefono_NM() throws Exception {
		this.inicializarActualizarBindingTablaTelefono_NM(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTelefono_NM() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTelefono_NM.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTelefono_NM.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTelefono_NM.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new Telefono_NMPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTelefono_NM.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTelefono_NM.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new Telefono_NMPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTelefono_NMOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTelefono_NMOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new Telefono_NMPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTelefono_NM.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTelefono_NM.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new Telefono_NMPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTelefono_NM.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTelefono_NM(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=telefono_nmLogic.getTelefono_NMs().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=telefono_nms.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(Telefono_NMJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTelefono_NM.setModel(new Telefono_NMModel(this.telefono_nmLogic.getTelefono_NMs(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTelefono_NM.setModel(new Telefono_NMModel(this.telefono_nms,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTelefono_NM!=null && this.jInternalFrameOrderByTelefono_NM.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTelefono_NM();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTelefono_NM.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTelefono_NM,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new Telefono_NMPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO,telefono_nmConstantesFunciones.resaltarSeleccionarTelefono_NM,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+Telefono_NMConstantesFunciones.SCLASSWEBTITULO,telefono_nmConstantesFunciones.resaltarSeleccionarTelefono_NM,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTelefono_NM.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTelefono_NM,Telefono_NMConstantesFunciones.LABEL_ID));

		if(this.telefono_nmConstantesFunciones.mostraridTelefono_NM && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,Telefono_NMConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.telefono_nmConstantesFunciones.resaltaridTelefono_NM,this.telefono_nmConstantesFunciones.activaridTelefono_NM,this,true,"idTelefono_NM","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.telefono_nmConstantesFunciones.resaltaridTelefono_NM,this.telefono_nmConstantesFunciones.activaridTelefono_NM,this,true,"idTelefono_NM","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTelefono_NM.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTelefono_NM,Telefono_NMConstantesFunciones.LABEL_IDEMPRESA));

		if(this.telefono_nmConstantesFunciones.mostrarid_empresaTelefono_NM && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,Telefono_NMConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.telefono_nmConstantesFunciones.resaltarid_empresaTelefono_NM,this,this.telefono_nmConstantesFunciones.activarid_empresaTelefono_NM));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.telefono_nmConstantesFunciones.resaltarid_empresaTelefono_NM,this,this.telefono_nmConstantesFunciones.activarid_empresaTelefono_NM,false,"id_empresaTelefono_NM","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new Telefono_NMPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTelefono_NM.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTelefono_NM,Telefono_NMConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.telefono_nmConstantesFunciones.mostrarid_empleadoTelefono_NM && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,Telefono_NMConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.telefono_nmConstantesFunciones.resaltarid_empleadoTelefono_NM,this,this.telefono_nmConstantesFunciones.activarid_empleadoTelefono_NM));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.telefono_nmConstantesFunciones.resaltarid_empleadoTelefono_NM,this,this.telefono_nmConstantesFunciones.activarid_empleadoTelefono_NM,true,"id_empleadoTelefono_NM","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new Telefono_NMPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTelefono_NM.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTelefono_NM,Telefono_NMConstantesFunciones.LABEL_TELEFONO));

		if(this.telefono_nmConstantesFunciones.mostrartelefonoTelefono_NM && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,Telefono_NMConstantesFunciones.LABEL_TELEFONO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.telefono_nmConstantesFunciones.resaltartelefonoTelefono_NM,this.telefono_nmConstantesFunciones.activartelefonoTelefono_NM,this,true,"telefonoTelefono_NM","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.telefono_nmConstantesFunciones.resaltartelefonoTelefono_NM,this.telefono_nmConstantesFunciones.activartelefonoTelefono_NM,this,true,"telefonoTelefono_NM","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new Telefono_NMPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.telefono_nmSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.telefono_nmSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.telefono_nmSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTelefono_NM.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.telefono_nmSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.telefono_nmSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTelefono_NM.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTelefono_NM && this.isPermisoGuardarCambiosTelefono_NM) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.telefono_nmSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.telefono_nmSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTelefono_NM.addColumn(tableColumn);
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
			
			this.jTableDatosTelefono_NM.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTelefono_NM && this.isPermisoGuardarCambiosTelefono_NM) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTelefono_NM && this.isPermisoGuardarCambiosTelefono_NM) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTelefono_NM.moveColumn(this.jTableDatosTelefono_NM.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTelefono_NM.moveColumn(this.jTableDatosTelefono_NM.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTelefono_NM.moveColumn(this.jTableDatosTelefono_NM.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTelefono_NM.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTelefono_NM.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTelefono_NM,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!Telefono_NMJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTelefono_NM.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTelefono_NM.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!Telefono_NMJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!Telefono_NMJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTelefono_NM.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTelefono_NM.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTelefono_NM.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=telefono_nmLogic.getTelefono_NMs().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=telefono_nms.size()-1;
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
		//this.jTableDatosTelefono_NM.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTelefono_NM.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTelefono_NM();
			
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
				
				//this.isEsNuevoTelefono_NM=false;
					
				Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
			
				if(this.telefono_nmSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTelefono_NM==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTelefono_NM.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTelefono_NM.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono_nm =(Telefono_NM) this.telefono_nmLogic.getTelefono_NMs().toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.telefono_nm =(Telefono_NM) this.telefono_nms.toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.telefono_nm.getsType().equals("DUPLICADO")
				   || this.telefono_nm.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTelefono_NM=true;
				
				} else {
					this.isEsNuevoTelefono_NM=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.telefono_nmSessionBean.getEsGuardarRelacionado()) {
					if(this.telefono_nm.getId()>=0 && !this.telefono_nm.getIsNew()) {						
						this.isEsNuevoTelefono_NM=false;
						
					} else {
						this.isEsNuevoTelefono_NM=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTelefono_NM(esRelaciones);						
				
				this.seleccionarTelefono_NM(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.telefono_nm.getId()<0) {
					this.isEsNuevoTelefono_NM=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTelefono_NM(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTelefono_NM(evt,rowIndex);
				}	
				
				if(this.telefono_nmSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Telefono_NM: " + this.dDif); 
					}
				}								
				
				Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTelefono_NM(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.telefono_nm)) {
					if(this.telefono_nm.getId()>0) {
						this.telefono_nm.setIsDeleted(true);
						
						this.telefono_nmsEliminados.add(this.telefono_nm);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.telefono_nmLogic.getTelefono_NMs().remove(this.telefono_nm);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.telefono_nms.remove(this.telefono_nm);				
					}
					
					
					((Telefono_NMModel) this.jTableDatosTelefono_NM.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTelefono_NM(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTelefono_NM(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTelefono_NM) {
			
			if(this.jInternalFrameDetalleFormTelefono_NM==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTelefono_NM.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTelefono_NM.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono_nm =(Telefono_NM) this.telefono_nmLogic.getTelefono_NMs().toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.telefono_nm =(Telefono_NM) this.telefono_nms.toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(Telefono_NMJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTelefono_NM(this.telefono_nm);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.telefono_nmConstantesFunciones.cargarid_empresaTelefono_NM || this.telefono_nmConstantesFunciones.event_dependid_empresaTelefono_NM) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.telefono_nm.getid_empresa());
									//this.inicializarActualizarBindingTelefono_NM(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(telefono_nm.getEmpresa()!=null) {
							this.empresasForeignKey.add(telefono_nm.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.telefono_nm.getid_empresa(),false,"Formulario");

					//Empleado
					if(!this.telefono_nmConstantesFunciones.cargarid_empleadoTelefono_NM || this.telefono_nmConstantesFunciones.event_dependid_empleadoTelefono_NM) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.telefono_nm.getid_empleado());
									//this.inicializarActualizarBindingTelefono_NM(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(telefono_nm.getEmpleado()!=null) {
							this.empleadosForeignKey.add(telefono_nm.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.telefono_nm.getid_empleado(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTelefono_NM("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTelefono_NM(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTelefono_NM() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTelefono_NM(Telefono_NM telefono_nm) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTelefono_NM(telefono_nm,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTelefono_NM(Telefono_NM telefono_nm,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTelefono_NM(telefono_nm);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTelefono_NM(telefono_nm,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTelefono_NM(telefono_nm);
	}
	
	public void setVariablesObjetoActualToFormularioTelefono_NM(Telefono_NM telefono_nm) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTelefono_NM==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTelefono_NM.jLabelidTelefono_NM.setText(telefono_nm.getId().toString());
			this.jInternalFrameDetalleFormTelefono_NM.jTextFieldtelefonoTelefono_NM.setText(telefono_nm.gettelefono());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Telefono_NM telefono_nmLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,telefono_nmLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Telefono_NM telefono_nmLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				telefono_nmLocal=this.telefono_nm;
			} else {
				telefono_nmLocal=this.telefono_nmAnterior;
			}
		}
		
		if(this.permiteMantenimiento(telefono_nmLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTelefono_NM(telefono_nmLocal,true);
					
					if(telefono_nmSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(telefono_nmLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.telefono_nmSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(telefono_nmLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTelefono_NM(Telefono_NM telefono_nm,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTelefono_NM(telefono_nm,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTelefono_NM(telefono_nm);
	}
	
	public void setVariablesFormularioToObjetoActualTelefono_NM(Telefono_NM telefono_nm,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTelefono_NM(telefono_nm,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTelefono_NM(Telefono_NM telefono_nm,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTelefono_NM==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTelefono_NM.jLabelidTelefono_NM.getText()==null || this.jInternalFrameDetalleFormTelefono_NM.jLabelidTelefono_NM.getText()=="" || this.jInternalFrameDetalleFormTelefono_NM.jLabelidTelefono_NM.getText()=="Id") {
				this.jInternalFrameDetalleFormTelefono_NM.jLabelidTelefono_NM.setText("0");
			}

			if(conColumnasBase) {telefono_nm.setId(Long.parseLong(this.jInternalFrameDetalleFormTelefono_NM.jLabelidTelefono_NM.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Telefono_NMConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTelefono_NM.jLabelIdTelefono_NM,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			telefono_nm.settelefono(this.jInternalFrameDetalleFormTelefono_NM.jTextFieldtelefonoTelefono_NM.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+Telefono_NMConstantesFunciones.LABEL_TELEFONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTelefono_NM.jLabeltelefonoTelefono_NM,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTelefono_NM(Telefono_NM telefono_nmBean,Telefono_NM telefono_nm,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && telefono_nmBean.getid_empleado()!=null && !telefono_nmBean.getid_empleado().equals(-1L))) {telefono_nm.setid_empleado(telefono_nmBean.getid_empleado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTelefono_NM(Telefono_NM telefono_nmOrigen,Telefono_NM telefono_nm,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && telefono_nmOrigen.getId()!=null && !telefono_nmOrigen.getId().equals(0L))) {telefono_nm.setId(telefono_nmOrigen.getId());}}
			if(conDefault || (!conDefault && telefono_nmOrigen.getid_empleado()!=null && !telefono_nmOrigen.getid_empleado().equals(-1L))) {telefono_nm.setid_empleado(telefono_nmOrigen.getid_empleado());}
			if(conDefault || (!conDefault && telefono_nmOrigen.gettelefono()!=null && !telefono_nmOrigen.gettelefono().equals(""))) {telefono_nm.settelefono(telefono_nmOrigen.gettelefono());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTelefono_NM(Telefono_NM telefono_nm) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTelefono_NM.jLabelidTelefono_NM.setText(telefono_nm.getId().toString());
			this.jInternalFrameDetalleFormTelefono_NM.jTextFieldtelefonoTelefono_NM.setText(telefono_nm.gettelefono());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTelefono_NM(Telefono_NMBean telefono_nmBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTelefono_NM.jLabelidTelefono_NM.setText(telefono_nmBean.getId().toString());
			this.jInternalFrameDetalleFormTelefono_NM.jTextFieldtelefonoTelefono_NM.setText(telefono_nmBean.gettelefono());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTelefono_NM(Telefono_NMParameterReturnGeneral telefono_nmReturnGeneral,Telefono_NMBean telefono_nmBean,Boolean conDefault) throws Exception { 
		try {
			Telefono_NM telefono_nmLocal=new Telefono_NM();
			
			telefono_nmLocal=telefono_nmReturnGeneral.getTelefono_NM();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && telefono_nmLocal.getId()!=null && !telefono_nmLocal.getId().equals(0L))) {telefono_nmBean.setId(telefono_nmLocal.getId());}}
			if(conDefault || (!conDefault && telefono_nmLocal.getid_empleado()!=null && !telefono_nmLocal.getid_empleado().equals(-1L))) {telefono_nmBean.setid_empleado(telefono_nmLocal.getid_empleado());}
			if(conDefault || (!conDefault && telefono_nmLocal.gettelefono()!=null && !telefono_nmLocal.gettelefono().equals(""))) {telefono_nmBean.settelefono(telefono_nmLocal.gettelefono());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTelefono_NMGenerico(Long idTelefono_NMSeleccionado,JComboBox jComboBoxTelefono_NM,List<Telefono_NM> telefono_nmsLocal)throws Exception {
		try {
			Telefono_NM  telefono_nmTemp=null;

			for(Telefono_NM telefono_nmAux:telefono_nmsLocal) {
				if(telefono_nmAux.getId()!=null && telefono_nmAux.getId().equals(idTelefono_NMSeleccionado)) {
					telefono_nmTemp=telefono_nmAux;
					break;
				}
			}

			jComboBoxTelefono_NM.setSelectedItem(telefono_nmTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTelefono_NMGenerico(JComboBox jComboBoxTelefono_NM,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTelefono_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTelefono_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTelefono_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTelefono_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTelefono_NM.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTelefono_NM.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTelefono_NM.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTelefono_NM.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTelefono_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTelefono_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			telefono_nm=(Telefono_NM) telefono_nmLogic.getTelefono_NMs().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			telefono_nm =(Telefono_NM) telefono_nms.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!telefono_nm.getIsNew() && !telefono_nm.getIsChanged() && !telefono_nm.getIsDeleted()) {
				sDescripcion=telefono_nm.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=telefono_nm.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!telefono_nm.getIsNew() && !telefono_nm.getIsChanged() && !telefono_nm.getIsDeleted()) {
				sDescripcion=telefono_nm.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=telefono_nm.getempleado_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Telefono_NM telefono_nmRow=new Telefono_NM();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			telefono_nmRow=(Telefono_NM) telefono_nmLogic.getTelefono_NMs().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			telefono_nmRow=(Telefono_NM) telefono_nms.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTelefono_NM(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTelefono_NM.setVisible((this.isVisibilidadCeldaNuevoTelefono_NM && this.isPermisoNuevoTelefono_NM));			
			this.jButtonDuplicarTelefono_NM.setVisible((this.isVisibilidadCeldaDuplicarTelefono_NM && this.isPermisoDuplicarTelefono_NM));			
			this.jButtonCopiarTelefono_NM.setVisible((this.isVisibilidadCeldaCopiarTelefono_NM && this.isPermisoCopiarTelefono_NM));
			this.jButtonVerFormTelefono_NM.setVisible((this.isVisibilidadCeldaVerFormTelefono_NM && this.isPermisoVerFormTelefono_NM));
			
			this.jButtonAbrirOrderByTelefono_NM.setVisible((this.isVisibilidadCeldaOrdenTelefono_NM && this.isPermisoOrdenTelefono_NM));			
			
			this.jButtonNuevoRelacionesTelefono_NM.setVisible((this.isVisibilidadCeldaNuevoRelacionesTelefono_NM && this.isPermisoNuevoTelefono_NM));			
			this.jButtonNuevoGuardarCambiosTelefono_NM.setVisible((this.isVisibilidadCeldaNuevoTelefono_NM && this.isPermisoNuevoTelefono_NM && this.isPermisoGuardarCambiosTelefono_NM));
			
			if(this.jInternalFrameDetalleFormTelefono_NM!=null) {
			this.jInternalFrameDetalleFormTelefono_NM.jButtonModificarTelefono_NM.setVisible((this.isVisibilidadCeldaModificarTelefono_NM && this.isPermisoActualizarTelefono_NM));	
			this.jInternalFrameDetalleFormTelefono_NM.jButtonActualizarTelefono_NM.setVisible((this.isVisibilidadCeldaActualizarTelefono_NM && this.isPermisoActualizarTelefono_NM));	
			this.jInternalFrameDetalleFormTelefono_NM.jButtonEliminarTelefono_NM.setVisible((this.isVisibilidadCeldaEliminarTelefono_NM && this.isPermisoEliminarTelefono_NM));
			this.jInternalFrameDetalleFormTelefono_NM.jButtonCancelarTelefono_NM.setVisible(this.isVisibilidadCeldaCancelarTelefono_NM);							
			this.jInternalFrameDetalleFormTelefono_NM.jButtonGuardarCambiosTelefono_NM.setVisible((this.isVisibilidadCeldaGuardarTelefono_NM && this.isPermisoGuardarCambiosTelefono_NM));			
			
			}
						
			this.jButtonGuardarCambiosTablaTelefono_NM.setVisible((this.isVisibilidadCeldaGuardarCambiosTelefono_NM && this.isPermisoGuardarCambiosTelefono_NM));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTelefono_NM.setVisible((this.isVisibilidadCeldaNuevoTelefono_NM && this.isPermisoNuevoTelefono_NM));						
			this.jButtonDuplicarToolBarTelefono_NM.setVisible((this.isVisibilidadCeldaDuplicarTelefono_NM && this.isPermisoDuplicarTelefono_NM));						
			this.jButtonCopiarToolBarTelefono_NM.setVisible((this.isVisibilidadCeldaCopiarTelefono_NM && this.isPermisoCopiarTelefono_NM));			
			this.jButtonVerFormToolBarTelefono_NM.setVisible((this.isVisibilidadCeldaVerFormTelefono_NM && this.isPermisoVerFormTelefono_NM));			
			this.jButtonAbrirOrderByToolBarTelefono_NM.setVisible((this.isVisibilidadCeldaOrdenTelefono_NM && this.isPermisoOrdenTelefono_NM));
			this.jButtonNuevoRelacionesToolBarTelefono_NM.setVisible((this.isVisibilidadCeldaNuevoRelacionesTelefono_NM && this.isPermisoNuevoTelefono_NM));			
			this.jButtonNuevoGuardarCambiosToolBarTelefono_NM.setVisible((this.isVisibilidadCeldaNuevoTelefono_NM && this.isPermisoNuevoTelefono_NM && this.isPermisoGuardarCambiosTelefono_NM));			
			
			if(this.jInternalFrameDetalleFormTelefono_NM!=null) {
			this.jInternalFrameDetalleFormTelefono_NM.jButtonModificarToolBarTelefono_NM.setVisible((this.isVisibilidadCeldaModificarTelefono_NM && this.isPermisoActualizarTelefono_NM));	
			this.jInternalFrameDetalleFormTelefono_NM.jButtonActualizarToolBarTelefono_NM.setVisible((this.isVisibilidadCeldaActualizarTelefono_NM  && this.isPermisoActualizarTelefono_NM));	
			this.jInternalFrameDetalleFormTelefono_NM.jButtonEliminarToolBarTelefono_NM.setVisible((this.isVisibilidadCeldaEliminarTelefono_NM && this.isPermisoEliminarTelefono_NM));
			this.jInternalFrameDetalleFormTelefono_NM.jButtonCancelarToolBarTelefono_NM.setVisible(this.isVisibilidadCeldaCancelarTelefono_NM);				
			this.jInternalFrameDetalleFormTelefono_NM.jButtonGuardarCambiosToolBarTelefono_NM.setVisible((this.isVisibilidadCeldaGuardarTelefono_NM && this.isPermisoGuardarCambiosTelefono_NM));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTelefono_NM.setVisible((this.isVisibilidadCeldaGuardarCambiosTelefono_NM && this.isPermisoGuardarCambiosTelefono_NM));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTelefono_NM.setVisible((this.isVisibilidadCeldaNuevoTelefono_NM && this.isPermisoNuevoTelefono_NM));			
			this.jMenuItemDuplicarTelefono_NM.setVisible((this.isVisibilidadCeldaDuplicarTelefono_NM && this.isPermisoDuplicarTelefono_NM));			
			this.jMenuItemCopiarTelefono_NM.setVisible((this.isVisibilidadCeldaCopiarTelefono_NM && this.isPermisoCopiarTelefono_NM));			
			this.jMenuItemVerFormTelefono_NM.setVisible((this.isVisibilidadCeldaVerFormTelefono_NM && this.isPermisoVerFormTelefono_NM));			
			this.jMenuItemAbrirOrderByTelefono_NM.setVisible((this.isVisibilidadCeldaOrdenTelefono_NM && this.isPermisoOrdenTelefono_NM));			
			//this.jMenuItemMostrarOcultarTelefono_NM.setVisible((this.isVisibilidadCeldaOrdenTelefono_NM && this.isPermisoOrdenTelefono_NM));
			this.jMenuItemDetalleAbrirOrderByTelefono_NM.setVisible((this.isVisibilidadCeldaOrdenTelefono_NM && this.isPermisoOrdenTelefono_NM));			
			//this.jMenuItemDetalleMostrarOcultarTelefono_NM.setVisible((this.isVisibilidadCeldaOrdenTelefono_NM && this.isPermisoOrdenTelefono_NM));			
			this.jMenuItemNuevoRelacionesTelefono_NM.setVisible((this.isVisibilidadCeldaNuevoRelacionesTelefono_NM && this.isPermisoNuevoTelefono_NM));			
			this.jMenuItemNuevoGuardarCambiosTelefono_NM.setVisible((this.isVisibilidadCeldaNuevoTelefono_NM && this.isPermisoNuevoTelefono_NM && this.isPermisoGuardarCambiosTelefono_NM));									
			
			if(this.jInternalFrameDetalleFormTelefono_NM!=null) {
			this.jInternalFrameDetalleFormTelefono_NM.jMenuItemModificarTelefono_NM.setVisible((this.isVisibilidadCeldaModificarTelefono_NM && this.isPermisoActualizarTelefono_NM));	
			this.jInternalFrameDetalleFormTelefono_NM.jMenuItemActualizarTelefono_NM.setVisible((this.isVisibilidadCeldaActualizarTelefono_NM && this.isPermisoActualizarTelefono_NM));	
			this.jInternalFrameDetalleFormTelefono_NM.jMenuItemEliminarTelefono_NM.setVisible((this.isVisibilidadCeldaEliminarTelefono_NM && this.isPermisoEliminarTelefono_NM));
			this.jInternalFrameDetalleFormTelefono_NM.jMenuItemCancelarTelefono_NM.setVisible(this.isVisibilidadCeldaCancelarTelefono_NM);				
			}
			
			this.jMenuItemGuardarCambiosTelefono_NM.setVisible((this.isVisibilidadCeldaGuardarTelefono_NM && this.isPermisoGuardarCambiosTelefono_NM));						
			this.jMenuItemGuardarCambiosTablaTelefono_NM.setVisible((this.isVisibilidadCeldaGuardarCambiosTelefono_NM && this.isPermisoGuardarCambiosTelefono_NM));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTelefono_NM=this.jButtonNuevoTelefono_NM.isVisible();
			this.isVisibilidadCeldaDuplicarTelefono_NM=this.jButtonDuplicarTelefono_NM.isVisible();
			this.isVisibilidadCeldaCopiarTelefono_NM=this.jButtonCopiarTelefono_NM.isVisible();
			this.isVisibilidadCeldaVerFormTelefono_NM=this.jButtonVerFormTelefono_NM.isVisible();
			
			this.isVisibilidadCeldaOrdenTelefono_NM=this.jButtonAbrirOrderByTelefono_NM.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTelefono_NM=this.jButtonNuevoRelacionesTelefono_NM.isVisible();
			this.isVisibilidadCeldaModificarTelefono_NM=this.jButtonModificarTelefono_NM.isVisible();
			
			if(this.jInternalFrameDetalleFormTelefono_NM!=null) {
			this.isVisibilidadCeldaActualizarTelefono_NM=this.jInternalFrameDetalleFormTelefono_NM.jButtonActualizarTelefono_NM.isVisible();
			this.isVisibilidadCeldaEliminarTelefono_NM=this.jInternalFrameDetalleFormTelefono_NM.jButtonEliminarTelefono_NM.isVisible();
			this.isVisibilidadCeldaCancelarTelefono_NM=this.jInternalFrameDetalleFormTelefono_NM.jButtonCancelarTelefono_NM.isVisible();
			this.isVisibilidadCeldaGuardarTelefono_NM=this.jInternalFrameDetalleFormTelefono_NM.jButtonGuardarCambiosTelefono_NM.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTelefono_NM=this.jButtonGuardarCambiosTablaTelefono_NM.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTelefono_NM=this.jButtonNuevoToolBarTelefono_NM.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTelefono_NM=this.jButtonNuevoRelacionesToolBarTelefono_NM.isVisible();
			
			if(this.jInternalFrameDetalleFormTelefono_NM!=null) {
			this.isVisibilidadCeldaModificarTelefono_NM=this.jInternalFrameDetalleFormTelefono_NM.jButtonModificarToolBarTelefono_NM.isVisible();
			this.isVisibilidadCeldaActualizarTelefono_NM=this.jInternalFrameDetalleFormTelefono_NM.jButtonActualizarToolBarTelefono_NM.isVisible();
			this.isVisibilidadCeldaEliminarTelefono_NM=this.jInternalFrameDetalleFormTelefono_NM.jButtonEliminarToolBarTelefono_NM.isVisible();
			this.isVisibilidadCeldaCancelarTelefono_NM=this.jInternalFrameDetalleFormTelefono_NM.jButtonCancelarToolBarTelefono_NM.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTelefono_NM=this.jButtonGuardarCambiosToolBarTelefono_NM.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTelefono_NM=this.jButtonGuardarCambiosTablaToolBarTelefono_NM.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTelefono_NM=this.jMenuItemNuevoTelefono_NM.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTelefono_NM=this.jMenuItemNuevoRelacionesTelefono_NM.isVisible();
			
			if(this.jInternalFrameDetalleFormTelefono_NM!=null) {
			this.isVisibilidadCeldaModificarTelefono_NM=this.jInternalFrameDetalleFormTelefono_NM.jMenuItemModificarTelefono_NM.isVisible();
			this.isVisibilidadCeldaActualizarTelefono_NM=this.jInternalFrameDetalleFormTelefono_NM.jMenuItemActualizarTelefono_NM.isVisible();
			this.isVisibilidadCeldaEliminarTelefono_NM=this.jInternalFrameDetalleFormTelefono_NM.jMenuItemEliminarTelefono_NM.isVisible();
			this.isVisibilidadCeldaCancelarTelefono_NM=this.jInternalFrameDetalleFormTelefono_NM.jMenuItemCancelarTelefono_NM.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTelefono_NM=this.jMenuItemGuardarCambiosTelefono_NM.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTelefono_NM=this.jMenuItemGuardarCambiosTablaTelefono_NM.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTelefono_NM(Boolean esInicializar) {
		if(Telefono_NMJInternalFrame.ISBINDING_MANUAL) {			
			if(this.telefono_nmSessionBean.getConGuardarRelaciones()) {
				//if(this.telefono_nmSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTelefono_NM();
			}
			
			this.inicializarActualizarBindingBotonesManualTelefono_NM(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTelefono_NM() {
		this.jButtonNuevoTelefono_NM.setVisible(this.isPermisoNuevoTelefono_NM);			
		this.jButtonDuplicarTelefono_NM.setVisible(this.isPermisoDuplicarTelefono_NM);			
		this.jButtonCopiarTelefono_NM.setVisible(this.isPermisoCopiarTelefono_NM);			
		this.jButtonVerFormTelefono_NM.setVisible(this.isPermisoVerFormTelefono_NM);			
		
		this.jButtonAbrirOrderByTelefono_NM.setVisible(this.isPermisoOrdenTelefono_NM);					
		
		this.jButtonNuevoRelacionesTelefono_NM.setVisible(this.isPermisoNuevoTelefono_NM);			
		
		if(this.jInternalFrameDetalleFormTelefono_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefono_NM.jButtonModificarTelefono_NM.setVisible(this.isPermisoActualizarTelefono_NM);	
			this.jInternalFrameDetalleFormTelefono_NM.jButtonActualizarTelefono_NM.setVisible(this.isPermisoActualizarTelefono_NM);	
			this.jInternalFrameDetalleFormTelefono_NM.jButtonEliminarTelefono_NM.setVisible(this.isPermisoEliminarTelefono_NM);
			this.jInternalFrameDetalleFormTelefono_NM.jButtonCancelarTelefono_NM.setVisible(this.isVisibilidadCeldaCancelarTelefono_NM);						
			this.jInternalFrameDetalleFormTelefono_NM.jButtonGuardarCambiosTelefono_NM.setVisible(this.isPermisoGuardarCambiosTelefono_NM);							
		}
		
		this.jButtonGuardarCambiosTablaTelefono_NM.setVisible(this.isPermisoActualizarTelefono_NM);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTelefono_NM() {
		this.jInternalFrameDetalleFormTelefono_NM.jButtonModificarTelefono_NM.setVisible(this.isPermisoActualizarTelefono_NM);	
		this.jInternalFrameDetalleFormTelefono_NM.jButtonActualizarTelefono_NM.setVisible(this.isPermisoActualizarTelefono_NM);	
		this.jInternalFrameDetalleFormTelefono_NM.jButtonEliminarTelefono_NM.setVisible(this.isPermisoEliminarTelefono_NM);
		this.jInternalFrameDetalleFormTelefono_NM.jButtonCancelarTelefono_NM.setVisible(this.isVisibilidadCeldaCancelarTelefono_NM);							
		this.jInternalFrameDetalleFormTelefono_NM.jButtonGuardarCambiosTelefono_NM.setVisible((this.isVisibilidadCeldaGuardarTelefono_NM && this.isPermisoGuardarCambiosTelefono_NM));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTelefono_NM() {
		if(Telefono_NMJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTelefono_NM();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTelefono_NM() {
	}
	
	public void jTableDatosTelefono_NMListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTelefono_NM(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTelefono_NMBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono_nmLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTelefono_NM.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTelefono_NM(this.gettelefono_nm(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono_NM(this.telefono_nm);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.telefono_nm =(Telefono_NM) this.telefono_nmLogic.getTelefono_NMs().toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.telefono_nm =(Telefono_NM) this.telefono_nms.toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.telefono_nm==null) {
						this.telefono_nm = new Telefono_NM();
					}

					this.setVariablesFormularioToObjetoActualTelefono_NM(this.telefono_nm,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono_NM(this.telefono_nm);
				}

				if(this.telefono_nm.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.telefono_nm.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTelefono_NM(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono_nmLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono_nmLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono_nmLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTelefono_NMUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTelefono_NM(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTelefono_NM.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTelefono_NM.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTelefono_NM.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono_nm =(Telefono_NM) this.telefono_nmLogic.getTelefono_NMs().toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.telefono_nm =(Telefono_NM) this.telefono_nms.toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTelefono_NM(this.gettelefono_nm(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTelefono_NM(this.telefono_nm);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.telefono_nmLogic.getConnexion());

				if(this.telefono_nm.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.telefono_nm.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTelefono_NM=(TitledBorder)this.jScrollPanelDatosTelefono_NM.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTelefono_NM.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTelefono_NMBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono_nmLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTelefono_NM.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTelefono_NM(this.gettelefono_nm(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono_NM(this.telefono_nm);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.telefono_nm =(Telefono_NM) this.telefono_nmLogic.getTelefono_NMs().toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.telefono_nm =(Telefono_NM) this.telefono_nms.toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.telefono_nm==null) {
						this.telefono_nm = new Telefono_NM();
					}

					this.setVariablesFormularioToObjetoActualTelefono_NM(this.telefono_nm,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono_NM(this.telefono_nm);
				}

				if(this.telefono_nm.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.telefono_nm.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTelefono_NM(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono_nmLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono_nmLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono_nmLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoTelefono_NMActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="Empleado";

			if(!this.sFinalQueryGeneral_empleado.equals("")) {
				this.empleadoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_empleado);
				this.empleadoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.empleadoBeanSwingJInternalFrame.procesarBusqueda(this.empleadoBeanSwingJInternalFrame.sAccionBusqueda);
				this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingEmpleado(false);
			}

			if(!this.sFinalQueryComboEmpleado.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderTelefono_NM=null;
			TitledBorder titledBorderempleado=null;

			if(!this.jScrollPanelDatosTelefono_NM.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderTelefono_NM=(TitledBorder)this.jScrollPanelDatosTelefono_NM.getBorder();
				titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderTelefono_NM.getTitle() + " -> Empleado");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_empleadoTelefono_NMUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebTelefono_NM(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTelefono_NM.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTelefono_NM.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTelefono_NM.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono_nm =(Telefono_NM) this.telefono_nmLogic.getTelefono_NMs().toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.telefono_nm =(Telefono_NM) this.telefono_nms.toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTelefono_NM(this.gettelefono_nm(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTelefono_NM(this.telefono_nm);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.telefono_nmLogic.getConnexion());

				if(this.telefono_nm.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.telefono_nm.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTelefono_NM=(TitledBorder)this.jScrollPanelDatosTelefono_NM.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderTelefono_NM.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoTelefono_NMBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono_nmLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTelefono_NM.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTelefono_NM(this.gettelefono_nm(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono_NM(this.telefono_nm);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.telefono_nm =(Telefono_NM) this.telefono_nmLogic.getTelefono_NMs().toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.telefono_nm =(Telefono_NM) this.telefono_nms.toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.telefono_nm==null) {
						this.telefono_nm = new Telefono_NM();
					}

					this.setVariablesFormularioToObjetoActualTelefono_NM(this.telefono_nm,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono_NM(this.telefono_nm);
				}

				if(this.telefono_nm.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.telefono_nm.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTelefono_NM(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono_nmLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono_nmLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono_nmLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefonoTelefono_NMBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono_nmLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTelefono_NM.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTelefono_NM(this.gettelefono_nm(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono_NM(this.telefono_nm);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.telefono_nm =(Telefono_NM) this.telefono_nmLogic.getTelefono_NMs().toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.telefono_nm =(Telefono_NM) this.telefono_nms.toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.telefono_nm==null) {
						this.telefono_nm = new Telefono_NM();
					}

					this.setVariablesFormularioToObjetoActualTelefono_NM(this.telefono_nm,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono_NM(this.telefono_nm);
				}

				if(this.telefono_nm.gettelefono()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono like '%"+this.telefono_nm.gettelefono()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTelefono_NM(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono_nmLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono_nmLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono_nmLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpleadoTelefono_NMActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTelefono_NM(false,false);

			this.getTelefono_NMsFK_IdEmpleado();

			this.inicializarActualizarBindingTelefono_NM(false);

			//if(Telefono_NMBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTelefono_NM(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTelefono_NMActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTelefono_NM(false,false);

			this.getTelefono_NMsFK_IdEmpresa();

			this.inicializarActualizarBindingTelefono_NM(false);

			//if(Telefono_NMBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTelefono_NM(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.telefono_nmLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTelefono_NM() {
		if(this.jInternalFrameDetalleFormTelefono_NM!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTelefono_NM!=null) {
			this.jInternalFrameDetalleFormTelefono_NM.setVisible(false);	    			
			this.jInternalFrameDetalleFormTelefono_NM.dispose();
			this.jInternalFrameDetalleFormTelefono_NM=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTelefono_NM!=null) {
			this.jInternalFrameReporteDinamicoTelefono_NM.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTelefono_NM.dispose();
			this.jInternalFrameReporteDinamicoTelefono_NM=null;
		}
		
		if(this.jInternalFrameImportacionTelefono_NM!=null) {
			this.jInternalFrameImportacionTelefono_NM.setVisible(false);	    			
			this.jInternalFrameImportacionTelefono_NM.dispose();
			this.jInternalFrameImportacionTelefono_NM=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTelefono_NM();
			
			Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
			
			
			if(sTipo.equals("NuevoTelefono_NM")) {
				jButtonNuevoTelefono_NMActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTelefono_NM")) {
				jButtonDuplicarTelefono_NMActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTelefono_NM")) {
				jButtonCopiarTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("VerFormTelefono_NM")) {
				jButtonVerFormTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTelefono_NM")) {
				jButtonNuevoTelefono_NMActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTelefono_NM")) {
				jButtonDuplicarTelefono_NMActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTelefono_NM")) {
				jButtonNuevoTelefono_NMActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTelefono_NM")) {
				jButtonDuplicarTelefono_NMActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTelefono_NM")) {
				jButtonNuevoTelefono_NMActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTelefono_NM")) {
				jButtonNuevoTelefono_NMActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTelefono_NM")) {
				jButtonNuevoTelefono_NMActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTelefono_NM")) {
				jButtonModificarTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTelefono_NM")) {
				jButtonModificarTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTelefono_NM")) {
				jButtonModificarTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTelefono_NM")) {
				jButtonActualizarTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTelefono_NM")) {
				jButtonActualizarTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTelefono_NM")) {
				jButtonActualizarTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("EliminarTelefono_NM")) {
				jButtonEliminarTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTelefono_NM")) {
				jButtonEliminarTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTelefono_NM")) {
				jButtonEliminarTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("CancelarTelefono_NM")) {
				jButtonCancelarTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTelefono_NM")) {
				jButtonCancelarTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTelefono_NM")) {
				jButtonCancelarTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("CerrarTelefono_NM")) {
				jButtonCerrarTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTelefono_NM")) {
				jButtonCerrarTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTelefono_NM")) {
				jButtonCerrarTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTelefono_NM")) {
				jButtonMostrarOcultarTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTelefono_NM")) {
				jButtonCancelarTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTelefono_NM")) {
				jButtonGuardarCambiosTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTelefono_NM")) {
				jButtonGuardarCambiosTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTelefono_NM")) {
				jButtonCopiarTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTelefono_NM")) {
				jButtonVerFormTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTelefono_NM")) {
				jButtonGuardarCambiosTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTelefono_NM")) {
				jButtonCopiarTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTelefono_NM")) {
				jButtonVerFormTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTelefono_NM")) {
				jButtonGuardarCambiosTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTelefono_NM")) {
				jButtonGuardarCambiosTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTelefono_NM")) {
				jButtonGuardarCambiosTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTelefono_NM")) {
				jButtonRecargarInformacionTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTelefono_NM")) {
				jButtonRecargarInformacionTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTelefono_NM")) {
				jButtonRecargarInformacionTelefono_NMActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTelefono_NM")) {
				jButtonAnterioresTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTelefono_NM")) {
				jButtonAnterioresTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTelefono_NM")) {
				jButtonAnterioresTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTelefono_NM")) {
				jButtonSiguientesTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTelefono_NM")) {
				jButtonSiguientesTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTelefono_NM")) {
				jButtonSiguientesTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTelefono_NM") || sTipo.equals("MenuItemDetalleAbrirOrderByTelefono_NM")) {
				jButtonAbrirOrderByTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTelefono_NM") || sTipo.equals("MenuItemDetalleMostrarOcultarTelefono_NM")) {
				jButtonMostrarOcultarTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTelefono_NM")) {
				jButtonNuevoGuardarCambiosTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTelefono_NM")) {
				jButtonNuevoGuardarCambiosTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTelefono_NM")) {
				jButtonNuevoGuardarCambiosTelefono_NMActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTelefono_NM")) {
				jButtonCerrarReporteDinamicoTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTelefono_NM")) {
				jButtonGenerarReporteDinamicoTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTelefono_NM")) {
				
				jButtonGenerarExcelReporteDinamicoTelefono_NMActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTelefono_NM")) {
				jButtonCerrarImportacionTelefono_NMActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTelefono_NM")) {
				
				jButtonGenerarImportacionTelefono_NMActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTelefono_NM")) {
				
				jButtonAbrirImportacionTelefono_NMActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTelefono_NM")) {
				jComboBoxTiposAccionesTelefono_NMActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTelefono_NM")) {
				jComboBoxTiposRelacionesTelefono_NMActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTelefono_NM")) {
				jComboBoxTiposAccionesTelefono_NMActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTelefono_NM")) {
				
				jComboBoxTiposSeleccionarTelefono_NMActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTelefono_NM")) {
				jTextFieldValorCampoGeneralTelefono_NMActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTelefono_NM")) {
				jButtonAbrirOrderByTelefono_NMActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTelefono_NM")) {
				jButtonAbrirOrderByTelefono_NMActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTelefono_NM")) {
				jButtonCerrarOrderByTelefono_NMActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTelefono_NMBusqueda")) {
				this.jButtonidTelefono_NMBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTelefono_NMUpdate")) {
				this.jButtonid_empresaTelefono_NMUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTelefono_NMBusqueda")) {
				this.jButtonid_empresaTelefono_NMBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoTelefono_NM")) {
				this.jButtonid_empleadoTelefono_NMActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoTelefono_NMUpdate")) {
				this.jButtonid_empleadoTelefono_NMUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoTelefono_NMBusqueda")) {
				this.jButtonid_empleadoTelefono_NMBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoTelefono_NMBusqueda")) {
				this.jButtontelefonoTelefono_NMBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_empleadoTelefono_NM")) {
				this.jButtonid_empleadoTelefono_NMActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdEmpleadoTelefono_NM")) {
				this.jButtonFK_IdEmpleadoTelefono_NMActionPerformed(evt);
			}
			
			;
			
			
			Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTelefono_NM();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTelefono_NMActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefono_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefono_nm);
				
				Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
				
				


				
				Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Telefono_NM.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Telefono_NM.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Telefono_NM telefono_nmLocal=null;
			
			if(!this.getEsControlTabla()) {
				telefono_nmLocal=this.telefono_nm;
			} else {
				telefono_nmLocal=this.telefono_nmAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefono_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefono_nm);
				
				Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
							
				
				


				
				Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Telefono_NM.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Telefono_NM.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTelefono_NMActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTelefono_NM.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono_nmAnterior =(Telefono_NM) this.telefono_nmLogic.getTelefono_NMs().toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.telefono_nmAnterior =(Telefono_NM) this.telefono_nms.toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
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
			
			Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
			
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
			
			


			
			Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTelefono_NMActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefono_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefono_nm);
				
				Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
								
						
				


				
				Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Telefono_NM.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Telefono_NM.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefono_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefono_nm);
				
				Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
								
				
				


				
				Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Telefono_NM.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Telefono_NM.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTelefono_NMActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTelefono_NM.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono_nmAnterior =(Telefono_NM) this.telefono_nmLogic.getTelefono_NMs().toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.telefono_nmAnterior =(Telefono_NM) this.telefono_nms.toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefono_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefono_nm);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTelefono_NMActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTelefono_NM.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono_nmAnterior =(Telefono_NM) this.telefono_nmLogic.getTelefono_NMs().toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.telefono_nmAnterior =(Telefono_NM) this.telefono_nms.toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTelefono_NMActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.telefono_nm);
			
			this.actualizarInformacion("INFO_PADRE",false,this.telefono_nm);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefono_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefono_nm);
				
				Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
							
				
				


				
				Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Telefono_NM.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Telefono_NM.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTelefono_NMActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTelefono_NM.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.telefono_nmAnterior =(Telefono_NM) this.telefono_nmLogic.getTelefono_NMs().toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.telefono_nmAnterior =(Telefono_NM) this.telefono_nms.toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
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
			
			Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
			
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
			
			


			
			Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTelefono_NMActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.telefono_nm);
			
			this.actualizarInformacion("INFO_PADRE",false,this.telefono_nm);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefono_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefono_nm);
				
				Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
								
				
				


				
				Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Telefono_NM.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Telefono_NM.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTelefono_NMActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTelefono_NM.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono_nmAnterior =(Telefono_NM) this.telefono_nmLogic.getTelefono_NMs().toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.telefono_nmAnterior =(Telefono_NM) this.telefono_nms.toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTelefono_NMActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.telefono_nm);
			
			this.actualizarInformacion("INFO_PADRE",false,this.telefono_nm);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTelefono_NMActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefono_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefono_nm);
				
				Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTelefono_NM")) {
					jCheckBoxSeleccionarTodosTelefono_NMItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTelefono_NM")) {
					jCheckBoxSeleccionadosTelefono_NMItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTelefono_NM")) {
					
				}
				
				


				
				
				Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Telefono_NM.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Telefono_NM.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.telefono_nm);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.telefono_nm);
				
				Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
												
				
				


				
				
				Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Telefono_NM.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Telefono_NM.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTelefono_NMActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTelefono_NM.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.telefono_nmAnterior =(Telefono_NM) this.telefono_nmLogic.getTelefono_NMs().toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.telefono_nmAnterior =(Telefono_NM) this.telefono_nms.toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTelefono_NMActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefono_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefono_nm);
				
				Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
				
				
				Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
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
			
			Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
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
			
			


			
			Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTelefono_NMActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefono_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefono_nm);
				
				Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Telefono_NM.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Telefono_NM.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.telefono_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.telefono_nm);
				
				Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
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
				
				


				
				Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Telefono_NM.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Telefono_NM.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTelefono_NMActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTelefono_NM.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.telefono_nmAnterior =(Telefono_NM) this.telefono_nmLogic.getTelefono_NMs().toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.telefono_nmAnterior =(Telefono_NM) this.telefono_nms.toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTelefono_NM")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTelefono_NMListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTelefono_NM.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.telefono_nm =(Telefono_NM) this.telefono_nmLogic.getTelefono_NMs().toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.telefono_nm =(Telefono_NM) this.telefono_nms.toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.telefono_nm);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTelefono_NM")) {
				
				}
				
				Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTelefono_NM")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTelefono_NM.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTelefono_NM")) {
			
			}
			
			Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTelefono_NM();
			
			Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
			
			if(sTipo.equals("NuevoTelefono_NM")) {
				jButtonNuevoTelefono_NMActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTelefono_NM")) {
				jButtonDuplicarTelefono_NMActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTelefono_NM")) {
				jButtonCopiarTelefono_NMActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTelefono_NM")) {
				jButtonVerFormTelefono_NMActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTelefono_NM")) {
				jButtonNuevoTelefono_NMActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTelefono_NM")) {
				jButtonModificarTelefono_NMActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTelefono_NM")) {
				jButtonActualizarTelefono_NMActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTelefono_NM")) {
				jButtonEliminarTelefono_NMActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTelefono_NM")) {
				jButtonGuardarCambiosTelefono_NMActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTelefono_NM")) {
				jButtonCancelarTelefono_NMActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTelefono_NM")) {
				jButtonCerrarTelefono_NMActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTelefono_NM")) {
				jButtonGuardarCambiosTelefono_NMActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTelefono_NM")) {
				jButtonNuevoGuardarCambiosTelefono_NMActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTelefono_NM")) {
				jButtonAbrirOrderByTelefono_NMActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTelefono_NM")) {
				jButtonRecargarInformacionTelefono_NMActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTelefono_NM")) {
				jButtonAnterioresTelefono_NMActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTelefono_NM")) {
				jButtonSiguientesTelefono_NMActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTelefono_NMBusqueda")) {
				this.jButtonidTelefono_NMBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTelefono_NMUpdate")) {
				this.jButtonid_empresaTelefono_NMUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTelefono_NMBusqueda")) {
				this.jButtonid_empresaTelefono_NMBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoTelefono_NM")) {
				this.jButtonid_empleadoTelefono_NMActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoTelefono_NMUpdate")) {
				this.jButtonid_empleadoTelefono_NMUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoTelefono_NMBusqueda")) {
				this.jButtonid_empleadoTelefono_NMBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoTelefono_NMBusqueda")) {
				this.jButtontelefonoTelefono_NMBusquedaActionPerformed(evt);
			}
			
			Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTelefono_NM();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTelefono_NM")) {
				closingInternalFrameTelefono_NM();
				
			} else if(sTipo.equals("jButtonCancelarTelefono_NM")) {
				JInternalFrameBase jInternalFrameDetalleFormTelefono_NM = (JInternalFrameBase)evt.getSource();
	            	
	            Telefono_NMBeanSwingJInternalFrame jInternalFrameParent=(Telefono_NMBeanSwingJInternalFrame)jInternalFrameDetalleFormTelefono_NM.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTelefono_NMActionPerformed(null);
			}
			
			Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.telefono_nm,new Object(),this.telefono_nmParameterGeneral,this.telefono_nmReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTelefono_NM(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTelefono_NM(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTelefono_NM(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.telefono_nm)) {
			if(!esControlTabla) {
				if(Telefono_NMJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTelefono_NM(this.telefono_nm,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono_NM(this.telefono_nm);			
				}
				
				if(this.telefono_nmSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTelefono_NM(this.telefono_nm,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.telefono_nmReturnGeneral=telefono_nmLogic.procesarEventosTelefono_NMsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.telefono_nmLogic.getTelefono_NMs(),this.telefono_nm,this.telefono_nmParameterGeneral,this.isEsNuevoTelefono_NM,classes);//this.telefono_nmLogic.getTelefono_NM()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTelefono_NM(this.telefono_nmReturnGeneral,this.telefono_nmBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.telefono_nmSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTelefono_NM(classes,this.telefono_nmReturnGeneral,this.telefono_nmBean,false);
					}
						
					if(this.telefono_nmReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTelefono_NM(this.telefono_nmReturnGeneral.getTelefono_NM());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTelefono_NM(this.telefono_nmReturnGeneral.getTelefono_NM());	
					}
						
					if(this.telefono_nmReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTelefono_NM(this.telefono_nmReturnGeneral.getTelefono_NM(),classes);//this.telefono_nmBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTelefono_NM(this.telefono_nm,classes);//this.telefono_nmBean);									
				}
			
				if(Telefono_NMJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTelefono_NM(this.telefono_nm,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTelefono_NM(this.telefono_nm);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.telefono_nmAnterior!=null) {
						this.telefono_nm=this.telefono_nmAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.telefono_nmReturnGeneral=telefono_nmLogic.procesarEventosTelefono_NMsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.telefono_nmLogic.getTelefono_NMs(),this.telefono_nm,this.telefono_nmParameterGeneral,this.isEsNuevoTelefono_NM,classes);//this.telefono_nmLogic.getTelefono_NM()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.telefono_nmSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.telefono_nmSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.telefono_nmReturnGeneral.getTelefono_NM(),telefono_nmLogic.getTelefono_NMs());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.telefono_nmReturnGeneral.getTelefono_NM(),this.telefono_nms);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTelefono_NM.repaint();
				
				//((AbstractTableModel) this.jTableDatosTelefono_NM.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTelefono_NM();
			}
		}
	}
	
	public void actualizarVisualTableDatosTelefono_NM() throws Exception {
		
		Telefono_NMModel telefono_nmModel=(Telefono_NMModel)this.jTableDatosTelefono_NM.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			telefono_nmModel.telefono_nms=this.telefono_nmLogic.getTelefono_NMs();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			telefono_nmModel.telefono_nms=this.telefono_nms;
		}
		
		
		((Telefono_NMModel) this.jTableDatosTelefono_NM.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTelefono_NM() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettelefono_nmAnterior(),this.telefono_nmLogic.getTelefono_NMs());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettelefono_nmAnterior(),this.telefono_nms);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTelefono_NM();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTelefono_NM(Telefono_NM telefono_nm,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
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
										
				Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.telefono_nm,new Object(),generalEntityParameterGeneral,this.telefono_nmReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.telefono_nmSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=Telefono_NMConstantesFunciones.getClassesRelationshipsOfTelefono_NM(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=Telefono_NMConstantesFunciones.getClassesRelationshipsFromStringsOfTelefono_NM(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTelefono_NM(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				Telefono_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.telefono_nm,new Object(),generalEntityParameterGeneral,this.telefono_nmReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTelefono_NM(Telefono_NMBean telefono_nmBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTelefono_NM(ArrayList<Classe> classes,Telefono_NMReturnGeneral telefono_nmReturnGeneral,Telefono_NMBean telefono_nmBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTelefono_NM(Telefono_NM telefono_nm,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.telefono_nm)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTelefono_NM = new Telefono_NMDetalleFormJInternalFrame(jDesktopPane,this.telefono_nmSessionBean.getConGuardarRelaciones(),this.telefono_nmSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTelefono_NM);
		this.jInternalFrameDetalleFormTelefono_NM.setVisible(false);
		this.jInternalFrameDetalleFormTelefono_NM.setSelected(false);						
		
		this.jInternalFrameDetalleFormTelefono_NM.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTelefono_NM.telefono_nmLogic=this.telefono_nmLogic;
		
		this.cargarCombosFrameForeignKeyTelefono_NM("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTelefono_NM();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTelefono_NM();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTelefono_NM("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTelefono_NM();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTelefono_NM.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTelefono_NM"));
		
		this.jInternalFrameDetalleFormTelefono_NM.jButtonModificarTelefono_NM.addActionListener(new ButtonActionListener(this,"ModificarTelefono_NM"));

		
		this.jInternalFrameDetalleFormTelefono_NM.jButtonModificarToolBarTelefono_NM.addActionListener(new ButtonActionListener(this,"ModificarToolBarTelefono_NM"));
					
		this.jInternalFrameDetalleFormTelefono_NM.jMenuItemModificarTelefono_NM.addActionListener(new ButtonActionListener(this,"MenuItemModificarTelefono_NM"));		
		
		
		
		this.jInternalFrameDetalleFormTelefono_NM.jButtonActualizarTelefono_NM.addActionListener (new ButtonActionListener(this,"ActualizarTelefono_NM"));
		
		
		this.jInternalFrameDetalleFormTelefono_NM.jButtonActualizarToolBarTelefono_NM.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTelefono_NM"));
						
		this.jInternalFrameDetalleFormTelefono_NM.jMenuItemActualizarTelefono_NM.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTelefono_NM"));		
		
		
		
		this.jInternalFrameDetalleFormTelefono_NM.jButtonEliminarTelefono_NM.addActionListener (new ButtonActionListener(this,"EliminarTelefono_NM"));
		
		
		this.jInternalFrameDetalleFormTelefono_NM.jButtonEliminarToolBarTelefono_NM.addActionListener (new ButtonActionListener(this,"EliminarToolBarTelefono_NM"));
								
		this.jInternalFrameDetalleFormTelefono_NM.jMenuItemEliminarTelefono_NM.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTelefono_NM"));		
		
		
		
		this.jInternalFrameDetalleFormTelefono_NM.jButtonCancelarTelefono_NM.addActionListener (new ButtonActionListener(this,"CancelarTelefono_NM"));
		
		
		this.jInternalFrameDetalleFormTelefono_NM.jButtonCancelarToolBarTelefono_NM.addActionListener (new ButtonActionListener(this,"CancelarToolBarTelefono_NM"));
					
		this.jInternalFrameDetalleFormTelefono_NM.jMenuItemCancelarTelefono_NM.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTelefono_NM"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTelefono_NM.jMenuItemDetalleCerrarTelefono_NM.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTelefono_NM"));		
		
		
		
		this.jInternalFrameDetalleFormTelefono_NM.jButtonGuardarCambiosToolBarTelefono_NM.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTelefono_NM"));
		
		
		
		this.jInternalFrameDetalleFormTelefono_NM.jButtonGuardarCambiosToolBarTelefono_NM.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTelefono_NM"));
		
		
		
		this.jInternalFrameDetalleFormTelefono_NM.jComboBoxTiposAccionesFormularioTelefono_NM.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTelefono_NM"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono_NM.jButtonidTelefono_NMBusqueda.addActionListener(new ButtonActionListener(this,"idTelefono_NMBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTelefono_NM.jButtonid_empresaTelefono_NMUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTelefono_NMUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono_NM.jButtonid_empresaTelefono_NMBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTelefono_NMBusqueda"));
		//jButtonid_empleadoTelefono_NM.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoTelefono_NMActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTelefono_NM.jButtonid_empleadoTelefono_NM.addActionListener(new ButtonActionListener(this,"id_empleadoTelefono_NM"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTelefono_NM.jButtonid_empleadoTelefono_NMUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoTelefono_NMUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono_NM.jButtonid_empleadoTelefono_NMBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoTelefono_NMBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono_NM.jButtontelefonoTelefono_NMBusqueda.addActionListener(new ButtonActionListener(this,"telefonoTelefono_NMBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTelefono_NM.jTabbedPaneRelacionesTelefono_NM.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTelefono_NM"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTelefono_NM"));
		
		if(this.jInternalFrameDetalleFormTelefono_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefono_NM.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTelefono_NM"));
		}
		
		this.jTableDatosTelefono_NM.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTelefono_NM"));
		
		this.jTableDatosTelefono_NM.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTelefono_NM"));
		
		this.jButtonNuevoTelefono_NM.addActionListener(new ButtonActionListener(this,"NuevoTelefono_NM"));
		
		this.jButtonDuplicarTelefono_NM.addActionListener(new ButtonActionListener(this,"DuplicarTelefono_NM"));
		
		this.jButtonCopiarTelefono_NM.addActionListener(new ButtonActionListener(this,"CopiarTelefono_NM"));
		
		this.jButtonVerFormTelefono_NM.addActionListener(new ButtonActionListener(this,"VerFormTelefono_NM"));
		
		
		this.jButtonNuevoToolBarTelefono_NM.addActionListener(new ButtonActionListener(this,"NuevoToolBarTelefono_NM"));
			
		this.jButtonDuplicarToolBarTelefono_NM.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTelefono_NM"));
			
		this.jMenuItemNuevoTelefono_NM.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTelefono_NM"));
			
		this.jMenuItemDuplicarTelefono_NM.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTelefono_NM"));		
		
		
		this.jButtonNuevoRelacionesTelefono_NM.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTelefono_NM"));
		
		
		this.jButtonNuevoRelacionesToolBarTelefono_NM.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTelefono_NM"));
			
		this.jMenuItemNuevoRelacionesTelefono_NM.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTelefono_NM"));		
		
		
		if(this.jInternalFrameDetalleFormTelefono_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefono_NM.jButtonModificarTelefono_NM.addActionListener(new ButtonActionListener(this,"ModificarTelefono_NM"));
		}
		
		
		if(this.jInternalFrameDetalleFormTelefono_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefono_NM.jButtonModificarToolBarTelefono_NM.addActionListener(new ButtonActionListener(this,"ModificarToolBarTelefono_NM"));
			
			this.jInternalFrameDetalleFormTelefono_NM.jMenuItemModificarTelefono_NM.addActionListener(new ButtonActionListener(this,"MenuItemModificarTelefono_NM"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTelefono_NM!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTelefono_NM.jButtonActualizarTelefono_NM.addActionListener (new ButtonActionListener(this,"ActualizarTelefono_NM"));
		}
		
		
		if(this.jInternalFrameDetalleFormTelefono_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefono_NM.jButtonActualizarToolBarTelefono_NM.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTelefono_NM"));
				
			this.jInternalFrameDetalleFormTelefono_NM.jMenuItemActualizarTelefono_NM.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTelefono_NM"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTelefono_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefono_NM.jButtonEliminarTelefono_NM.addActionListener (new ButtonActionListener(this,"EliminarTelefono_NM"));
		}
		
		
		if(this.jInternalFrameDetalleFormTelefono_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefono_NM.jButtonEliminarToolBarTelefono_NM.addActionListener (new ButtonActionListener(this,"EliminarToolBarTelefono_NM"));
						
			this.jInternalFrameDetalleFormTelefono_NM.jMenuItemEliminarTelefono_NM.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTelefono_NM"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTelefono_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefono_NM.jButtonCancelarTelefono_NM.addActionListener (new ButtonActionListener(this,"CancelarTelefono_NM"));
		}
		
		
		if(this.jInternalFrameDetalleFormTelefono_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefono_NM.jButtonCancelarToolBarTelefono_NM.addActionListener (new ButtonActionListener(this,"CancelarToolBarTelefono_NM"));
			
			this.jInternalFrameDetalleFormTelefono_NM.jMenuItemCancelarTelefono_NM.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTelefono_NM"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTelefono_NM.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTelefono_NM"));		
		
		
		this.jButtonCerrarTelefono_NM.addActionListener (new ButtonActionListener(this,"CerrarTelefono_NM"));
		
		
		this.jButtonCerrarToolBarTelefono_NM.addActionListener (new ButtonActionListener(this,"CerrarToolBarTelefono_NM"));
			
		this.jMenuItemCerrarTelefono_NM.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTelefono_NM"));
			
		if(this.jInternalFrameDetalleFormTelefono_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefono_NM.jMenuItemDetalleCerrarTelefono_NM.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTelefono_NM"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTelefono_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefono_NM.jButtonGuardarCambiosTelefono_NM.addActionListener (new ButtonActionListener(this,"GuardarCambiosTelefono_NM"));
		}
		
		
		if(this.jInternalFrameDetalleFormTelefono_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefono_NM.jButtonGuardarCambiosToolBarTelefono_NM.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTelefono_NM"));
		}
		
		this.jButtonCopiarToolBarTelefono_NM.addActionListener (new ButtonActionListener(this,"CopiarToolBarTelefono_NM"));
			
		this.jButtonVerFormToolBarTelefono_NM.addActionListener (new ButtonActionListener(this,"VerFormToolBarTelefono_NM"));
		
		this.jMenuItemGuardarCambiosTelefono_NM.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTelefono_NM"));
			
		this.jMenuItemCopiarTelefono_NM.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTelefono_NM"));		
		
		this.jMenuItemVerFormTelefono_NM.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTelefono_NM"));		
		
		
		this.jButtonGuardarCambiosTablaTelefono_NM.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTelefono_NM"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTelefono_NM.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTelefono_NM"));
			
		this.jMenuItemGuardarCambiosTablaTelefono_NM.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTelefono_NM"));		
		
		
		
		this.jButtonRecargarInformacionTelefono_NM.addActionListener (new ButtonActionListener(this,"RecargarInformacionTelefono_NM"));
					
		this.jButtonRecargarInformacionToolBarTelefono_NM.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTelefono_NM"));
		
		this.jMenuItemRecargarInformacionTelefono_NM.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTelefono_NM"));		
		
		
		
		this.jButtonAnterioresTelefono_NM.addActionListener (new ButtonActionListener(this,"AnterioresTelefono_NM"));
		
		
		this.jButtonAnterioresToolBarTelefono_NM.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTelefono_NM"));
		
		this.jMenuItemAnterioresTelefono_NM.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTelefono_NM"));		
		
		
		this.jButtonSiguientesTelefono_NM.addActionListener (new ButtonActionListener(this,"SiguientesTelefono_NM"));
		
		
		this.jButtonSiguientesToolBarTelefono_NM.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTelefono_NM"));
			
		this.jMenuItemSiguientesTelefono_NM.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTelefono_NM"));
			
		this.jMenuItemAbrirOrderByTelefono_NM.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTelefono_NM"));
			
		this.jMenuItemMostrarOcultarTelefono_NM.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTelefono_NM"));
			
		this.jMenuItemDetalleAbrirOrderByTelefono_NM.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTelefono_NM"));
			
		this.jMenuItemDetalleMostarOcultarTelefono_NM.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTelefono_NM"));		
		
		
		this.jButtonNuevoGuardarCambiosTelefono_NM.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTelefono_NM"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTelefono_NM.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTelefono_NM"));
			
		this.jMenuItemNuevoGuardarCambiosTelefono_NM.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTelefono_NM"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTelefono_NM.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTelefono_NM"));

		this.jCheckBoxSeleccionadosTelefono_NM.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTelefono_NM"));
		
		if(this.jInternalFrameDetalleFormTelefono_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefono_NM.jComboBoxTiposAccionesFormularioTelefono_NM.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTelefono_NM"));
		}
		
		
		this.jComboBoxTiposRelacionesTelefono_NM.addActionListener (new ButtonActionListener(this,"TiposRelacionesTelefono_NM"));
			
		this.jComboBoxTiposAccionesTelefono_NM.addActionListener (new ButtonActionListener(this,"TiposAccionesTelefono_NM"));
					
		this.jComboBoxTiposSeleccionarTelefono_NM.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTelefono_NM"));
			
		this.jTextFieldValorCampoGeneralTelefono_NM.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTelefono_NM"));		
		
		
		if(this.jInternalFrameDetalleFormTelefono_NM!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono_NM.jButtonidTelefono_NMBusqueda.addActionListener(new ButtonActionListener(this,"idTelefono_NMBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTelefono_NM.jButtonid_empresaTelefono_NMUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTelefono_NMUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono_NM.jButtonid_empresaTelefono_NMBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTelefono_NMBusqueda"));
		//jButtonid_empleadoTelefono_NM.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoTelefono_NMActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTelefono_NM.jButtonid_empleadoTelefono_NM.addActionListener(new ButtonActionListener(this,"id_empleadoTelefono_NM"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTelefono_NM.jButtonid_empleadoTelefono_NMUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoTelefono_NMUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono_NM.jButtonid_empleadoTelefono_NMBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoTelefono_NMBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono_NM.jButtontelefonoTelefono_NMBusqueda.addActionListener(new ButtonActionListener(this,"telefonoTelefono_NMBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoTelefono_NM.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoTelefono_NM"));

			this.jButtonBuscarFK_IdEmpleadoid_empleadoTelefono_NM.addActionListener(new ButtonActionListener(this,"id_empleadoTelefono_NM"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTelefono_NM!=null) {
				this.jInternalFrameReporteDinamicoTelefono_NM.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTelefono_NM"));
				this.jInternalFrameReporteDinamicoTelefono_NM.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTelefono_NM"));
				this.jInternalFrameReporteDinamicoTelefono_NM.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTelefono_NM"));
			}
			
			//this.jButtonCerrarReporteDinamicoTelefono_NM.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTelefono_NM"));				
			//this.jButtonGenerarReporteDinamicoTelefono_NM.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTelefono_NM"));
			//this.jButtonGenerarExcelReporteDinamicoTelefono_NM.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTelefono_NM"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTelefono_NM!=null) {
				this.jInternalFrameImportacionTelefono_NM.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTelefono_NM"));
				this.jInternalFrameImportacionTelefono_NM.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTelefono_NM"));
				this.jInternalFrameImportacionTelefono_NM.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTelefono_NM"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTelefono_NM.addActionListener (new ButtonActionListener(this,"AbrirOrderByTelefono_NM"));
			
			this.jButtonAbrirOrderByToolBarTelefono_NM.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTelefono_NM"));			
			
			if(this.jInternalFrameOrderByTelefono_NM!=null) {
				this.jInternalFrameOrderByTelefono_NM.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTelefono_NM"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTelefono_NM!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTelefono_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTelefono_NM.jTabbedPaneRelacionesTelefono_NM.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTelefono_NM"));
		
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
            		closingInternalFrameTelefono_NM();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTelefono_NM.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTelefono_NM = (JInternalFrameBase)event.getSource();
	            	
	            Telefono_NMBeanSwingJInternalFrame jInternalFrameParent=(Telefono_NMBeanSwingJInternalFrame)jInternalFrameDetalleFormTelefono_NM.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTelefono_NMActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTelefono_NM.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTelefono_NMListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTelefono_NM.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTelefono_NM.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTelefono_NMActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTelefono_NMActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTelefono_NMActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTelefono_NM";
		inputMap = this.jButtonNuevoTelefono_NM.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTelefono_NM.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTelefono_NMActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTelefono_NMActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTelefono_NMActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTelefono_NMActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTelefono_NM";
		inputMap = this.jButtonNuevoRelacionesTelefono_NM.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTelefono_NM.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTelefono_NMActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTelefono_NM";
		inputMap = this.jButtonModificarTelefono_NM.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTelefono_NM.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTelefono_NMActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTelefono_NM";
		inputMap = this.jButtonActualizarTelefono_NM.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTelefono_NM.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTelefono_NMActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTelefono_NM";
		inputMap = this.jButtonEliminarTelefono_NM.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTelefono_NM.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTelefono_NMActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTelefono_NM";
		inputMap = this.jButtonCancelarTelefono_NM.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTelefono_NM.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTelefono_NMActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTelefono_NM";
		inputMap = this.jButtonCerrarTelefono_NM.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTelefono_NM.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTelefono_NMActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTelefono_NM.jButtonGuardarCambiosTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTelefono_NM";
		inputMap = this.jInternalFrameDetalleFormTelefono_NM.jButtonGuardarCambiosTelefono_NM.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTelefono_NM.jButtonGuardarCambiosTelefono_NM.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTelefono_NMActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTelefono_NM.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTelefono_NMItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTelefono_NM.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTelefono_NMActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTelefono_NM.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTelefono_NMActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTelefono_NM.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTelefono_NMActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono_NM.jButtonidTelefono_NMBusqueda.addActionListener(new ButtonActionListener(this,"idTelefono_NMBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTelefono_NM.jButtonid_empresaTelefono_NMUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTelefono_NMUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono_NM.jButtonid_empresaTelefono_NMBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTelefono_NMBusqueda"));
		//jButtonid_empleadoTelefono_NM.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoTelefono_NMActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTelefono_NM.jButtonid_empleadoTelefono_NM.addActionListener(new ButtonActionListener(this,"id_empleadoTelefono_NM"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTelefono_NM.jButtonid_empleadoTelefono_NMUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoTelefono_NMUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono_NM.jButtonid_empleadoTelefono_NMBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoTelefono_NMBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTelefono_NM.jButtontelefonoTelefono_NMBusqueda.addActionListener(new ButtonActionListener(this,"telefonoTelefono_NMBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoTelefono_NM.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoTelefono_NM"));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoTelefono_NM.addActionListener(new ButtonActionListener(this,"id_empleadoTelefono_NM"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTelefono_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTelefono_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTelefono_NMActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTelefono_NM.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTelefono_NM(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Telefono_NM telefono_nmAux:this.telefono_nmLogic.getTelefono_NMs()) {
					telefono_nmAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Telefono_NM telefono_nmAux:telefono_nms) {
					telefono_nmAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTelefono_NMItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTelefono_NM(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Telefono_NM telefono_nmAux:this.telefono_nmLogic.getTelefono_NMs()) {
						telefono_nmAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Telefono_NM telefono_nmAux:telefono_nms) {
						telefono_nmAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Telefono_NM telefono_nmAux:this.telefono_nmLogic.getTelefono_NMs()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Telefono_NM telefono_nmAux:telefono_nms) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTelefono_NM(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTelefono_NM.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTelefono_NM.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTelefono_NM,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTelefono_NMItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTelefono_NM(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTelefono_NM.getSelectedRows();
			
			Telefono_NM telefono_nmLocal=new Telefono_NM();
			
			//this.seleccionarTodosTelefono_NM(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					telefono_nmLocal =(Telefono_NM) this.telefono_nmLogic.getTelefono_NMs().toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					telefono_nmLocal =(Telefono_NM) this.telefono_nms.toArray()[this.jTableDatosTelefono_NM.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				telefono_nmLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Telefono_NM telefono_nmAux:this.telefono_nmLogic.getTelefono_NMs()) {
						telefono_nmAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Telefono_NM telefono_nmAux:telefono_nms) {
						telefono_nmAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTelefono_NM(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTelefono_NM.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTelefono_NM.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTelefono_NM,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTelefono_NMItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTelefono_NMParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTelefono_NMActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTelefono_NM(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTelefono_NM.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Telefono_NM telefono_nmAux:this.telefono_nmLogic.getTelefono_NMs()) {
				
						if(sTipoSeleccionar.equals(Telefono_NMConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							telefono_nmAux.settelefono(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Telefono_NM telefono_nmAux:telefono_nms) {
					
						if(sTipoSeleccionar.equals(Telefono_NMConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							telefono_nmAux.settelefono(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTelefono_NM(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTelefono_NMActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTelefono_NM(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTelefono_NM=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTelefono_NM.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTelefono_NM.jComboBoxTiposAccionesFormularioTelefono_NM.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTelefono_NM) {				
					conSplash=true;//false;										
					
					//this.startProcessTelefono_NM(conSplash);
				
					this.generarReporteTelefono_NMsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTelefono_NM.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTelefono_NM.jComboBoxTiposAccionesFormularioTelefono_NM.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTelefono_NMsSeleccionados();
				//this.jComboBoxTiposAccionesTelefono_NM.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTelefono_NMsSeleccionados(false);
				//this.jComboBoxTiposAccionesTelefono_NM.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTelefono_NMsSeleccionados(true);
				//this.jComboBoxTiposAccionesTelefono_NM.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTelefono_NM();
				
				this.exportarTelefono_NMsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTelefono_NM.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTelefono_NM.jComboBoxTiposAccionesFormularioTelefono_NM.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTelefono_NMs();
				//this.importarTelefono_NMs();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTelefono_NM.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTelefono_NM.jComboBoxTiposAccionesFormularioTelefono_NM.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTelefono_NM();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTelefono_NMsSeleccionados();
				//this.jComboBoxTiposAccionesTelefono_NM.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Telefono_ N M", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTelefono_NM();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTelefono_NM)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTelefono_NM(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Telefono_ N M",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTelefono_NM.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTelefono_NM.jComboBoxTiposAccionesFormularioTelefono_NM.setSelectedIndex(0);					
				}	
			} 			
			else if(Telefono_NMBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTelefono_NM) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTelefono_NM(conSplash);
					
						//this.actualizarParametrosGeneralTelefono_NM();
						
						this.generarReporteProcesoAccionTelefono_NMsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTelefono_NM.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTelefono_NM.jComboBoxTiposAccionesFormularioTelefono_NM.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(Telefono_NMBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Telefono_ N MES SELECCIONADOS?", "MANTENIMIENTO DE Telefono_ N M", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTelefono_NM();
				
						this.actualizarParametrosGeneralTelefono_NM();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.telefono_nmReturnGeneral=telefono_nmLogic.procesarAccionTelefono_NMsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.telefono_nmLogic.getTelefono_NMs(),this.telefono_nmParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTelefono_NMReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTelefono_NM.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTelefono_NM.jComboBoxTiposAccionesFormularioTelefono_NM.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTelefono_NM();
					
					Telefono_NMBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTelefono_NMReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTelefono_NM.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTelefono_NM.jComboBoxTiposAccionesFormularioTelefono_NM.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTelefono_NM(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTelefono_NMActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTelefono_NM();
			
			if(this.jInternalFrameDetalleFormTelefono_NM==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Telefono_NM> telefono_nmsSeleccionados=new ArrayList<Telefono_NM>();		
			Telefono_NM telefono_nm=new Telefono_NM();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTelefono_NM(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTelefono_NM.getSelectedItem();
			
			
			
			
			telefono_nmsSeleccionados=this.getTelefono_NMsSeleccionados(true);
			//this.sTipoAccion;
			
			if(telefono_nmsSeleccionados.size()==1) {
				for(Telefono_NM telefono_nmAux:telefono_nmsSeleccionados) {
					telefono_nm=telefono_nmAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTelefono_NM();
			
      		//this.finishProcessTelefono_NM(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTelefono_NMReturnGeneral() throws Exception {
		if(this.telefono_nmReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.telefono_nmReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.telefono_nmReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.telefono_nmReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.telefono_nmReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.telefono_nmReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTelefono_NM(false);
		}
		
		if(this.telefono_nmReturnGeneral.getConRetornoLista() || this.telefono_nmReturnGeneral.getConRetornoObjeto()) {
			if(this.telefono_nmReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.telefono_nmLogic.setTelefono_NMs(this.telefono_nmReturnGeneral.getTelefono_NMs());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.telefono_nmReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.telefono_nmLogic.setTelefono_NM(this.telefono_nmReturnGeneral.getTelefono_NM());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTelefono_NM(false);
		}
	}
	
	public void actualizarParametrosGeneralTelefono_NM() throws Exception {
		
		
	}
	
	public ArrayList<Telefono_NM> getTelefono_NMsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Telefono_NM> telefono_nmsSeleccionados=new ArrayList<Telefono_NM>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTelefono_NM) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Telefono_NM telefono_nmAux:telefono_nmLogic.getTelefono_NMs()) {
					if(telefono_nmAux.getIsSelected()) {
						telefono_nmsSeleccionados.add(telefono_nmAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Telefono_NM telefono_nmAux:this.telefono_nms) {
					if(telefono_nmAux.getIsSelected()) {
						telefono_nmsSeleccionados.add(telefono_nmAux);				
					}
				}
			}
			
			if(telefono_nmsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						telefono_nmsSeleccionados.addAll(this.telefono_nmLogic.getTelefono_NMs());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						telefono_nmsSeleccionados.addAll(this.telefono_nms);				
					}
				}
			}
		} else {
			telefono_nmsSeleccionados.add(this.telefono_nm);
		}
		
		return telefono_nmsSeleccionados;
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
	
	public void generarReporteTelefono_NMsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTelefono_NMsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTelefono_NMsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTelefono_NMsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTelefono_NMsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Telefono_ N M",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTelefono_NMsSeleccionados() throws Exception {
		ArrayList<Telefono_NM> telefono_nmsSeleccionados=new ArrayList<Telefono_NM>();		
		
		telefono_nmsSeleccionados=this.getTelefono_NMsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTelefono_NMs("Todos",telefono_nmsSeleccionados);
		
	}	
	
	public void generarReporteNormalTelefono_NMsSeleccionados() throws Exception {
		ArrayList<Telefono_NM> telefono_nmsSeleccionados=new ArrayList<Telefono_NM>();		
		
		telefono_nmsSeleccionados=this.getTelefono_NMsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTelefono_NMs("Todos",telefono_nmsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTelefono_NMsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Telefono_NM> telefono_nmsSeleccionados=new ArrayList<Telefono_NM>();
		
		telefono_nmsSeleccionados=this.getTelefono_NMsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTelefono_NMs("Todos",telefono_nmsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTelefono_NMsSeleccionados() throws Exception {
		ArrayList<Telefono_NM> telefono_nmsSeleccionados=new ArrayList<Telefono_NM>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTelefono_NM();
		
		
		telefono_nmsSeleccionados=this.getTelefono_NMsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTelefono_NM();
		
		
		//this.generarReporteTelefono_NMs("Todos",telefono_nmsSeleccionados ,telefono_nmImplementable,telefono_nmImplementableHome);
	}
	
	public void mostrarImportacionTelefono_NMs() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTelefono_NM();
		
		this.abrirFrameImportacionTelefono_NM();		
		
			
		//this.generarReporteTelefono_NMs("Todos",telefono_nmsSeleccionados ,telefono_nmImplementable,telefono_nmImplementableHome);
	}
	
	public void importarTelefono_NMs() throws Exception {		
	
	}
	
	public void exportarTelefono_NMsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTelefono_NMsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTelefono_NMsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTelefono_NMsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Telefono_ N M",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTelefono_NMsSeleccionados() throws Exception {
		ArrayList<Telefono_NM> telefono_nmsSeleccionados=new ArrayList<Telefono_NM>();		
		
		telefono_nmsSeleccionados=this.getTelefono_NMsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"telefono_nm."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTelefono_NM(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Telefono_NM telefono_nmAux:telefono_nmsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTelefono_NM(telefono_nmAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//telefono_nmAux.setsDetalleGeneralEntityReporte(telefono_nmAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.telefono_nmSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Telefono_ N M",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTelefono_NM(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=Telefono_NMConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Telefono_NMConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Telefono_NMConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Telefono_NMConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=Telefono_NMConstantesFunciones.LABEL_TELEFONO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTelefono_NM(Telefono_NM telefono_nm,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=telefono_nm.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=telefono_nm.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=telefono_nm.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=telefono_nm.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=telefono_nm.gettelefono();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTelefono_NMsSeleccionados() throws Exception {
		ArrayList<Telefono_NM> telefono_nmsSeleccionados=new ArrayList<Telefono_NM>();		
		
		telefono_nmsSeleccionados=this.getTelefono_NMsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"telefono_nm.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Telefono_NMs");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTelefono_NM(row);				
				iRow++;
			}				
			
			for(Telefono_NM telefono_nmAux:telefono_nmsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTelefono_NM(telefono_nmAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.telefono_nmSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Telefono_ N M",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTelefono_NMsSeleccionados() throws Exception {
		ArrayList<Telefono_NM> telefono_nmsSeleccionados=new ArrayList<Telefono_NM>();		
		
		telefono_nmsSeleccionados=this.getTelefono_NMsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"telefono_nm.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("telefono_nms");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("telefono_nm");
			//elementRoot.appendChild(element);
		
			for(Telefono_NM telefono_nmAux:telefono_nmsSeleccionados) {
				element = document.createElement("telefono_nm");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTelefono_NM(telefono_nmAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.telefono_nmSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Telefono_ N M",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTelefono_NM(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(Telefono_NMConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(Telefono_NMConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(Telefono_NMConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(Telefono_NMConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(Telefono_NMConstantesFunciones.LABEL_TELEFONO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTelefono_NM(Telefono_NM telefono_nm,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(telefono_nm.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(telefono_nm.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(telefono_nm.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(telefono_nm.gettelefono());				
	}
	
	public void setFilaDatosExportarXmlTelefono_NM(Telefono_NM telefono_nm,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(Telefono_NMConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(telefono_nm.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(Telefono_NMConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(telefono_nm.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(Telefono_NMConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(telefono_nm.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempleado_descripcion = document.createElement(Telefono_NMConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(telefono_nm.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementtelefono = document.createElement(Telefono_NMConstantesFunciones.TELEFONO);
		elementtelefono.appendChild(document.createTextNode(telefono_nm.gettelefono().trim()));
		element.appendChild(elementtelefono);
	}
	
	public void generarReporteGroupGenericoTelefono_NMsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Telefono_NM> telefono_nmsSeleccionados=new ArrayList<Telefono_NM>();
		
		telefono_nmsSeleccionados=this.getTelefono_NMsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTelefono_NM(telefono_nmsSeleccionados);
		
		this.generarReporteTelefono_NMs("Todos",telefono_nmsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTelefono_NM(ArrayList<Telefono_NM> telefono_nmsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Telefono_NM telefono_nmAux:telefono_nmsSeleccionados) {
				telefono_nmAux.setsDetalleGeneralEntityReporte(telefono_nmAux.toString());
			
				if(sTipoSeleccionar.equals(Telefono_NMConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					telefono_nmAux.setsDescripcionGeneralEntityReporte1(telefono_nmAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(Telefono_NMConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					telefono_nmAux.setsDescripcionGeneralEntityReporte1(telefono_nmAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(Telefono_NMConstantesFunciones.LABEL_TELEFONO)) {
					existe=true;
					telefono_nmAux.setsDescripcionGeneralEntityReporte1(telefono_nmAux.gettelefono());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,Telefono_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTelefono_NM(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTelefono_NM=true;
				this.isVisibilidadCeldaNuevoRelacionesTelefono_NM=true;
				this.isVisibilidadCeldaGuardarCambiosTelefono_NM=true;
			}
			
			this.isVisibilidadCeldaModificarTelefono_NM=false;
			this.isVisibilidadCeldaActualizarTelefono_NM=false;
			this.isVisibilidadCeldaEliminarTelefono_NM=false;
			this.isVisibilidadCeldaCancelarTelefono_NM=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTelefono_NM=true;
				} else {
					this.isVisibilidadCeldaGuardarTelefono_NM=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTelefono_NM=false;
			this.isVisibilidadCeldaNuevoRelacionesTelefono_NM=false;
			this.isVisibilidadCeldaGuardarCambiosTelefono_NM=false;
			this.isVisibilidadCeldaModificarTelefono_NM=false;
			this.isVisibilidadCeldaActualizarTelefono_NM=true;
			this.isVisibilidadCeldaEliminarTelefono_NM=false;
			this.isVisibilidadCeldaCancelarTelefono_NM=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTelefono_NM=true;
				} else {
					this.isVisibilidadCeldaGuardarTelefono_NM=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTelefono_NM=false;
			this.isVisibilidadCeldaNuevoRelacionesTelefono_NM=false;
			this.isVisibilidadCeldaGuardarCambiosTelefono_NM=false;
			this.isVisibilidadCeldaModificarTelefono_NM=false;
			this.isVisibilidadCeldaActualizarTelefono_NM=true;
			this.isVisibilidadCeldaEliminarTelefono_NM=true;
			this.isVisibilidadCeldaCancelarTelefono_NM=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTelefono_NM=true;
				} else {
					this.isVisibilidadCeldaGuardarTelefono_NM=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTelefono_NM=false;
			this.isVisibilidadCeldaNuevoRelacionesTelefono_NM=false;
			this.isVisibilidadCeldaGuardarCambiosTelefono_NM=false;
			this.isVisibilidadCeldaModificarTelefono_NM=false;
			this.isVisibilidadCeldaActualizarTelefono_NM=true;
			this.isVisibilidadCeldaEliminarTelefono_NM=false;
			this.isVisibilidadCeldaCancelarTelefono_NM=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTelefono_NM=false;
				} else {
					this.isVisibilidadCeldaGuardarTelefono_NM=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTelefono_NM=true;
			this.isVisibilidadCeldaNuevoRelacionesTelefono_NM=true;
			this.isVisibilidadCeldaGuardarCambiosTelefono_NM=true;
			this.isVisibilidadCeldaModificarTelefono_NM=false;
			this.isVisibilidadCeldaActualizarTelefono_NM=false;
			this.isVisibilidadCeldaEliminarTelefono_NM=false;
			this.isVisibilidadCeldaCancelarTelefono_NM=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTelefono_NM=true;
				} else {
					this.isVisibilidadCeldaGuardarTelefono_NM=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTelefono_NM=false;
			this.isVisibilidadCeldaNuevoRelacionesTelefono_NM=false;
			this.isVisibilidadCeldaGuardarCambiosTelefono_NM=false;
			this.isVisibilidadCeldaActualizarTelefono_NM=false;
			this.isVisibilidadCeldaEliminarTelefono_NM=false;
			this.isVisibilidadCeldaCancelarTelefono_NM=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTelefono_NM=false;
				} else {
					this.isVisibilidadCeldaGuardarTelefono_NM=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTelefono_NM=false;
			this.isVisibilidadCeldaNuevoRelacionesTelefono_NM=false;
			this.isVisibilidadCeldaGuardarCambiosTelefono_NM=false;
			this.isVisibilidadCeldaModificarTelefono_NM=true;
			this.isVisibilidadCeldaActualizarTelefono_NM=false;
			this.isVisibilidadCeldaEliminarTelefono_NM=false;
			this.isVisibilidadCeldaCancelarTelefono_NM=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTelefono_NM=false;
				} else {
					this.isVisibilidadCeldaGuardarTelefono_NM=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(Telefono_NMJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTelefono_NM=true;
			this.isVisibilidadCeldaNuevoRelacionesTelefono_NM=true;
			this.isVisibilidadCeldaGuardarCambiosTelefono_NM=true;
		} else {
			this.actualizarEstadoPanelsTelefono_NM(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTelefono_NM=false;
			//this.isVisibilidadCeldaVerFormTelefono_NM=false;
			this.isVisibilidadCeldaDuplicarTelefono_NM=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!telefono_nmSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTelefono_NM=false;
		} else {
			this.isVisibilidadCeldaNuevoTelefono_NM=false;
			this.isVisibilidadCeldaGuardarCambiosTelefono_NM=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(telefono_nmSessionBean.getEsGuardarRelacionado()) {
			if(!telefono_nmSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTelefono_NM=false;												
			}
			
			this.jButtonCerrarTelefono_NM.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTelefono_NM=false;
		}
		
		if(!this.permiteMantenimiento(this.telefono_nm)) {
			this.isVisibilidadCeldaActualizarTelefono_NM=false;
			this.isVisibilidadCeldaEliminarTelefono_NM=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTelefono_NM() {
	}
	
	public void actualizarEstadoPanelsTelefono_NM(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTelefono_NM!=null) {
				this.jScrollPanelDatosEdicionTelefono_NM.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTelefono_NM!=null) {
				this.jTabbedPaneBusquedasTelefono_NM.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTelefono_NM!=null) {
				this.jScrollPanelDatosTelefono_NM.setVisible(true);
			}
			
			if(this.jPanelPaginacionTelefono_NM!=null) {
				this.jPanelPaginacionTelefono_NM.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTelefono_NM!=null) {
				this.jPanelParametrosReportesTelefono_NM.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTelefono_NM!=null) {
				this.jScrollPanelDatosEdicionTelefono_NM.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTelefono_NM!=null) {
				this.jTabbedPaneBusquedasTelefono_NM.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTelefono_NM!=null) {
				this.jScrollPanelDatosTelefono_NM.setVisible(false);
			}
			
			if(this.jPanelPaginacionTelefono_NM!=null) {
				this.jPanelPaginacionTelefono_NM.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTelefono_NM!=null) {
				this.jPanelParametrosReportesTelefono_NM.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTelefono_NM!=null) {
				this.jScrollPanelDatosEdicionTelefono_NM.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTelefono_NM!=null) {
				this.jTabbedPaneBusquedasTelefono_NM.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTelefono_NM!=null) {
				this.jScrollPanelDatosTelefono_NM.setVisible(false);
			}
			
			if(this.jPanelPaginacionTelefono_NM!=null) {
				this.jPanelPaginacionTelefono_NM.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTelefono_NM!=null) {
				this.jPanelParametrosReportesTelefono_NM.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTelefono_NM!=null) {
				this.jScrollPanelDatosEdicionTelefono_NM.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTelefono_NM!=null) {
				this.jTabbedPaneBusquedasTelefono_NM.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTelefono_NM!=null) {
				this.jScrollPanelDatosTelefono_NM.setVisible(false);
			}
			
			if(this.jPanelPaginacionTelefono_NM!=null) {
				this.jPanelPaginacionTelefono_NM.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTelefono_NM!=null) {
				this.jPanelParametrosReportesTelefono_NM.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTelefono_NM!=null) {
				this.jScrollPanelDatosEdicionTelefono_NM.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTelefono_NM!=null) {
				this.jTabbedPaneBusquedasTelefono_NM.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTelefono_NM!=null) {
				this.jScrollPanelDatosTelefono_NM.setVisible(true);
			}
			
			if(this.jPanelPaginacionTelefono_NM!=null) {
				this.jPanelPaginacionTelefono_NM.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTelefono_NM!=null) {
				this.jPanelParametrosReportesTelefono_NM.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTelefono_NM!=null) {
				this.jScrollPanelDatosEdicionTelefono_NM.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTelefono_NM!=null) {
				this.jTabbedPaneBusquedasTelefono_NM.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTelefono_NM!=null) {
				this.jScrollPanelDatosTelefono_NM.setVisible(true);
			}
			
			if(this.jPanelPaginacionTelefono_NM!=null) {
				this.jPanelPaginacionTelefono_NM.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTelefono_NM!=null) {
				this.jPanelParametrosReportesTelefono_NM.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTelefono_NM!=null) {
				this.jScrollPanelDatosEdicionTelefono_NM.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTelefono_NM!=null) {
				this.jTabbedPaneBusquedasTelefono_NM.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTelefono_NM!=null) {
				this.jScrollPanelDatosTelefono_NM.setVisible(true);
			}
			
			if(this.jPanelPaginacionTelefono_NM!=null) {
				this.jPanelPaginacionTelefono_NM.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTelefono_NM!=null) {
				this.jPanelParametrosReportesTelefono_NM.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.telefono_nmSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTelefono_NM!=null) {
					this.jTabbedPaneBusquedasTelefono_NM.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTelefono_NM!=null) {
				this.jPanelParametrosReportesTelefono_NM.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.telefono_nmSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTelefono_NM!=null) {
				this.jTabbedPaneBusquedasTelefono_NM.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTelefono_NM!=null) {
				this.jPanelParametrosReportesTelefono_NM.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasTelefono_NM.remove(jPanelFK_IdEmpleadoTelefono_NM);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasTelefono_NM.remove(jPanelFK_IdEmpleadoTelefono_NM);}
		}
		
	}
	
	
	
	

	public String registrarSesionTelefono_NMParaBusquedaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(telefono_nmSessionBean==null) {
				telefono_nmSessionBean=new Telefono_NMSessionBean();
			}

			if(empleadoSessionBean==null) {
				empleadoSessionBean=new EmpleadoSessionBean();
			}

			empleadoSessionBean.setsPathNavegacionActual(telefono_nmSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			empleadoSessionBean.setisPermiteRecargarInformacion(false);
			empleadoSessionBean.setisPaginaPopup(true);
			isPaginaPopupEmpleado=empleadoSessionBean.getisPaginaPopup();
			empleadoSessionBean.setisPaginaPopup(false);
			empleadoSessionBean.setEstaModoBusqueda(true);
			empleadoSessionBean.setsFuncionBusquedaRapida("window.opener.telefono_nmFuncionGeneral.setCombosCodigoDesdeBusquedaid_empleado(TO_REPLACE);");
			empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(Telefono_NMConstantesFunciones.SNOMBREOPCION);
			//empleadoSessionBean.setisBusquedaDesdeForeignKeySesionTelefono_NM(true);
			//empleadoSessionBean.setlidTelefono_NMActual(this.idTelefono_NMActual);

			telefono_nmSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTelefono_NM(true);
			telefono_nmSessionBean.setlIdTelefono_NMActualForeignKey(this.idTelefono_NMActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//Telefono_NMSessionBean telefono_nmSessionBean=new Telefono_NMSessionBean();
		
		if(this.telefono_nmSessionBean==null) {
			this.telefono_nmSessionBean=new Telefono_NMSessionBean();
		}
		
		this.telefono_nmSessionBean.setsUltimaBusquedaTelefono_NM(this.getsAccionBusqueda());
		this.telefono_nmSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.telefono_nmSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			telefono_nmSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			telefono_nmSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//Telefono_NMSessionBean telefono_nmSessionBean=new Telefono_NMSessionBean();
		
		if(this.telefono_nmSessionBean==null) {
			this.telefono_nmSessionBean=new Telefono_NMSessionBean();
		}
		
		if(this.telefono_nmSessionBean.getsUltimaBusquedaTelefono_NM()!=null&&!this.telefono_nmSessionBean.getsUltimaBusquedaTelefono_NM().equals("")) {
			this.setsAccionBusqueda(telefono_nmSessionBean.getsUltimaBusquedaTelefono_NM());
			this.setiNumeroPaginacion(telefono_nmSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(telefono_nmSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(telefono_nmSessionBean.getid_empleado());
				telefono_nmSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(telefono_nmSessionBean.getid_empresa());
				telefono_nmSessionBean.setid_empresa(-1L);
			}
		}
		
		this.telefono_nmSessionBean.setsUltimaBusquedaTelefono_NM("");
		this.telefono_nmSessionBean.setiNumeroPaginacion(Telefono_NMConstantesFunciones.INUMEROPAGINACION);
		this.telefono_nmSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTelefono_NM(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTelefono_NM() {
		this.updateBorderResaltarBusquedasFormularioTelefono_NM();
		this.updateVisibilidadBusquedasFormularioTelefono_NM();
		this.updateHabilitarBusquedasFormularioTelefono_NM();
	}
	
	public void updateBorderResaltarBusquedasFormularioTelefono_NM() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTelefono_NM.getComponents().length>0) {
	

		if(this.telefono_nmConstantesFunciones.resaltarFK_IdEmpleadoTelefono_NM!=null) {
			index= this.jTabbedPaneBusquedasTelefono_NM.indexOfComponent(this.jPanelFK_IdEmpleadoTelefono_NM);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTelefono_NM.getComponent(index);
				jPanel.setBorder(this.telefono_nmConstantesFunciones.resaltarFK_IdEmpleadoTelefono_NM);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTelefono_NM() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTelefono_NM.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTelefono_NM.indexOfComponent(this.jPanelFK_IdEmpleadoTelefono_NM);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTelefono_NM.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.telefono_nmConstantesFunciones.mostrarFK_IdEmpleadoTelefono_NM);
			if(!this.telefono_nmConstantesFunciones.mostrarFK_IdEmpleadoTelefono_NM && index>-1) {
				this.jTabbedPaneBusquedasTelefono_NM.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTelefono_NM() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTelefono_NM.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTelefono_NM.indexOfComponent(this.jPanelFK_IdEmpleadoTelefono_NM);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTelefono_NM.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.telefono_nmConstantesFunciones.activarFK_IdEmpleadoTelefono_NM);
				this.jTabbedPaneBusquedasTelefono_NM.setEnabledAt(index,this.telefono_nmConstantesFunciones.activarFK_IdEmpleadoTelefono_NM);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTelefono_NM(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasTelefono_NM.indexOfComponent(this.jPanelFK_IdEmpleadoTelefono_NM);

			this.jTabbedPaneBusquedasTelefono_NM.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTelefono_NM.getComponent(index);

			this.telefono_nmConstantesFunciones.setResaltarFK_IdEmpleadoTelefono_NM(resaltar);

			jPanel.setBorder(this.telefono_nmConstantesFunciones.resaltarFK_IdEmpleadoTelefono_NM);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTelefono_NM.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTelefono_NM() throws Exception {

		if(this.jInternalFrameDetalleFormTelefono_NM==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTelefono_NM();
		this.updateVisibilidadResaltarControlesFormularioTelefono_NM();
		this.updateHabilitarResaltarControlesFormularioTelefono_NM();
		
	}
	
	public void updateBorderResaltarControlesFormularioTelefono_NM() throws Exception {
		if(this.jInternalFrameDetalleFormTelefono_NM==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.telefono_nmConstantesFunciones.resaltaridTelefono_NM!=null && this.jInternalFrameDetalleFormTelefono_NM!=null) {this.jInternalFrameDetalleFormTelefono_NM.jLabelidTelefono_NM.setBorder(this.telefono_nmConstantesFunciones.resaltaridTelefono_NM);}
		if(this.telefono_nmConstantesFunciones.resaltarid_empresaTelefono_NM!=null && this.jInternalFrameDetalleFormTelefono_NM!=null) {this.jInternalFrameDetalleFormTelefono_NM.jComboBoxid_empresaTelefono_NM.setBorder(this.telefono_nmConstantesFunciones.resaltarid_empresaTelefono_NM);}
		if(this.telefono_nmConstantesFunciones.resaltarid_empleadoTelefono_NM!=null && this.jInternalFrameDetalleFormTelefono_NM!=null) {this.jInternalFrameDetalleFormTelefono_NM.jComboBoxid_empleadoTelefono_NM.setBorder(this.telefono_nmConstantesFunciones.resaltarid_empleadoTelefono_NM);}
		if(this.telefono_nmConstantesFunciones.resaltartelefonoTelefono_NM!=null && this.jInternalFrameDetalleFormTelefono_NM!=null) {this.jInternalFrameDetalleFormTelefono_NM.jTextFieldtelefonoTelefono_NM.setBorder(this.telefono_nmConstantesFunciones.resaltartelefonoTelefono_NM);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTelefono_NM() throws Exception {		
		if(this.jInternalFrameDetalleFormTelefono_NM==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTelefono_NM!=null) {
	
		//this.jInternalFrameDetalleFormTelefono_NM.jLabelidTelefono_NM.setVisible(this.telefono_nmConstantesFunciones.mostraridTelefono_NM);
		this.jInternalFrameDetalleFormTelefono_NM.jPanelidTelefono_NM.setVisible(this.telefono_nmConstantesFunciones.mostraridTelefono_NM);
		//this.jInternalFrameDetalleFormTelefono_NM.jComboBoxid_empresaTelefono_NM.setVisible(this.telefono_nmConstantesFunciones.mostrarid_empresaTelefono_NM);
		this.jInternalFrameDetalleFormTelefono_NM.jPanelid_empresaTelefono_NM.setVisible(this.telefono_nmConstantesFunciones.mostrarid_empresaTelefono_NM);
		//this.jInternalFrameDetalleFormTelefono_NM.jComboBoxid_empleadoTelefono_NM.setVisible(this.telefono_nmConstantesFunciones.mostrarid_empleadoTelefono_NM);
		this.jInternalFrameDetalleFormTelefono_NM.jPanelid_empleadoTelefono_NM.setVisible(this.telefono_nmConstantesFunciones.mostrarid_empleadoTelefono_NM);
			this.jInternalFrameDetalleFormTelefono_NM.jButtonid_empleadoTelefono_NM.setVisible(this.telefono_nmConstantesFunciones.mostrarid_empleadoTelefono_NM);
		//this.jInternalFrameDetalleFormTelefono_NM.jTextFieldtelefonoTelefono_NM.setVisible(this.telefono_nmConstantesFunciones.mostrartelefonoTelefono_NM);
		this.jInternalFrameDetalleFormTelefono_NM.jPaneltelefonoTelefono_NM.setVisible(this.telefono_nmConstantesFunciones.mostrartelefonoTelefono_NM);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTelefono_NM() throws Exception {
		if(this.jInternalFrameDetalleFormTelefono_NM==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTelefono_NM!=null) {
	
		this.jInternalFrameDetalleFormTelefono_NM.jLabelidTelefono_NM.setEnabled(this.telefono_nmConstantesFunciones.activaridTelefono_NM);
		this.jInternalFrameDetalleFormTelefono_NM.jComboBoxid_empresaTelefono_NM.setEnabled(this.telefono_nmConstantesFunciones.activarid_empresaTelefono_NM);
		this.jInternalFrameDetalleFormTelefono_NM.jComboBoxid_empleadoTelefono_NM.setEnabled(this.telefono_nmConstantesFunciones.activarid_empleadoTelefono_NM);
			this.jInternalFrameDetalleFormTelefono_NM.jButtonid_empleadoTelefono_NM.setEnabled(this.telefono_nmConstantesFunciones.activarid_empleadoTelefono_NM);
		this.jInternalFrameDetalleFormTelefono_NM.jTextFieldtelefonoTelefono_NM.setEnabled(this.telefono_nmConstantesFunciones.activartelefonoTelefono_NM);
		}
	}
	
		
}