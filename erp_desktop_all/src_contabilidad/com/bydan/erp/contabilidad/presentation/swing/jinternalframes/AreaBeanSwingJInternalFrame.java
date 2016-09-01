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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;




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

import com.bydan.erp.contabilidad.util.AreaConstantesFunciones;
import com.bydan.erp.contabilidad.util.AreaParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.AreaParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.AreaBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class AreaBeanSwingJInternalFrame extends AreaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(AreaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Area> areaValidator = new ClassValidator<Area>(Area.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Area area;	
	public Area areaAux;
	public Area areaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Area areaTotales;
	public Long idAreaActual;
	public Long iIdNuevoArea=0L;
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

	public String sFinalQueryComboEmpleadoSustituto="";

	public List<Empleado> empleadosustitutosForeignKey;

	public List<Empleado> getempleadosustitutosForeignKey() {
		return empleadosustitutosForeignKey;
	}

	public void setempleadosustitutosForeignKey(List<Empleado> empleadosustitutosForeignKey) {
		this.empleadosustitutosForeignKey = empleadosustitutosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empleado empleadosustitutoForeignKey;

	public Empleado getempleadosustitutoForeignKey() {
		return empleadosustitutoForeignKey;
	}

	public void setempleadosustitutoForeignKey(Empleado empleadosustitutoForeignKey) {
		this.empleadosustitutoForeignKey = empleadosustitutoForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idEmpleadoActual=0L;

	public Long getidEmpleadoActual() {
		return idEmpleadoActual;
	}

	public void setidEmpleadoActual(Long idEmpleadoActual) {
		this.idEmpleadoActual= idEmpleadoActual;
	}
	public Long idEmpleadoSustitutoActual=0L;

	public Long getidEmpleadoSustitutoActual() {
		return idEmpleadoSustitutoActual;
	}

	public void setidEmpleadoSustitutoActual(Long idEmpleadoSustitutoActual) {
		this.idEmpleadoSustitutoActual= idEmpleadoSustitutoActual;
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
	
	public Boolean isPermisoTodoArea;
	public Boolean isPermisoNuevoArea;
	public Boolean isPermisoActualizarArea;
	public Boolean isPermisoActualizarOriginalArea;
	public Boolean isPermisoEliminarArea;
	public Boolean isPermisoGuardarCambiosArea;
	public Boolean isPermisoConsultaArea;
	public Boolean isPermisoBusquedaArea;
	public Boolean isPermisoReporteArea;
	public Boolean isPermisoPaginacionMedioArea;
	public Boolean isPermisoPaginacionAltoArea;
	public Boolean isPermisoPaginacionTodoArea;
	public Boolean isPermisoCopiarArea;
	public Boolean isPermisoVerFormArea;
	public Boolean isPermisoDuplicarArea;
	public Boolean isPermisoOrdenArea;
	
	
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
	
	public AreaParameterReturnGeneral areaReturnGeneral;
	public AreaParameterReturnGeneral areaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoArea=false;
	public Boolean esParaAccionDesdeFormularioArea=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected AreaSessionBeanAdditional areaSessionBeanAdditional=null;
	
	public AreaSessionBeanAdditional getAreaSessionBeanAdditional() {
		return this.areaSessionBeanAdditional;
	}
	
	public void setAreaSessionBeanAdditional(AreaSessionBeanAdditional areaSessionBeanAdditional) {
		try {
			this.areaSessionBeanAdditional=areaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected AreaBeanSwingJInternalFrameAdditional areaBeanSwingJInternalFrameAdditional=null;
	//public class AreaBeanSwingJInternalFrame
	
	public AreaBeanSwingJInternalFrameAdditional getAreaBeanSwingJInternalFrameAdditional() {
		return this.areaBeanSwingJInternalFrameAdditional;
	}
	
	public void setAreaBeanSwingJInternalFrameAdditional(AreaBeanSwingJInternalFrameAdditional areaBeanSwingJInternalFrameAdditional) {
		try {
			this.areaBeanSwingJInternalFrameAdditional=areaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public AreaLogic areaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Area areaBean;
	public AreaConstantesFunciones areaConstantesFunciones;
	//public AreaParameterReturnGeneral areaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EmpleadoLogic empleadoLogic;
	public EmpleadoLogic empleadosustitutoLogic;
	
	//PARAMETROS
	
	
	//public List<Area> areas;	
	//public List<Area> areasEliminados;
	//public List<Area> areasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoArea=false;
	public Boolean isVisibilidadCeldaDuplicarArea=true;
	public Boolean isVisibilidadCeldaCopiarArea=true;
	public Boolean isVisibilidadCeldaVerFormArea=true;
	public Boolean isVisibilidadCeldaOrdenArea=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesArea=false;
	public Boolean isVisibilidadCeldaModificarArea=false;
	public Boolean isVisibilidadCeldaActualizarArea=false;
	public Boolean isVisibilidadCeldaEliminarArea=false;
	public Boolean isVisibilidadCeldaCancelarArea=false;
	public Boolean isVisibilidadCeldaGuardarArea=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosArea=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpleadoSustituto=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoArea() {
		return this.iIdNuevoArea;
	}

	public void setiIdNuevoArea(Long iIdNuevoArea) {
		this.iIdNuevoArea = iIdNuevoArea;
	}
	
	public Long getidAreaActual() {
		return this.idAreaActual;
	}

	public void setidAreaActual(Long idAreaActual) {
		this.idAreaActual = idAreaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Area getarea() {
		return this.area;
	}

	public void setarea(Area area) {
		this.area = area;
	}
	
	public Area getareaAux() {
		return this.areaAux;
	}

	public void setareaAux(Area areaAux) {
		this.areaAux = areaAux;
	}				
	
	public Area getareaAnterior() {
		return this.areaAnterior;
	}

	public void setareaAnterior(Area areaAnterior) {
		this.areaAnterior = areaAnterior;
	}	
	
	public Area getareaTotales() {
		return this.areaTotales;
	}

	public void setareaTotales(Area areaTotales) {
		this.areaTotales = areaTotales;
	}	
	
	public Area getareaBean() {
		return this.areaBean;
	}

	public void setareaBean(Area areaBean) {
		this.areaBean = areaBean;
	}	
	
	public AreaParameterReturnGeneral getareaReturnGeneral() {
		return this.areaReturnGeneral;
	}

	public void setareaReturnGeneral(AreaParameterReturnGeneral areaReturnGeneral) {
		this.areaReturnGeneral = areaReturnGeneral;
	}	
	
	
	public Long id_empleadoFK_IdEmpleado=-1L;

	public Long getid_empleadoFK_IdEmpleado() {
		return this.id_empleadoFK_IdEmpleado;
	}

	public void setid_empleadoFK_IdEmpleado(Long id_empleadoFK_IdEmpleado) {
		this.id_empleadoFK_IdEmpleado = id_empleadoFK_IdEmpleado;
	}

	public Long id_empleado_sustitutoFK_IdEmpleadoSustituto=-1L;

	public Long getid_empleado_sustitutoFK_IdEmpleadoSustituto() {
		return this.id_empleado_sustitutoFK_IdEmpleadoSustituto;
	}

	public void setid_empleado_sustitutoFK_IdEmpleadoSustituto(Long id_empleado_sustitutoFK_IdEmpleadoSustituto) {
		this.id_empleado_sustitutoFK_IdEmpleadoSustituto = id_empleado_sustitutoFK_IdEmpleadoSustituto;
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
	
	
	public AreaLogic getAreaLogic()	{		
		return areaLogic;
	}

	public void setAreaLogic(AreaLogic areaLogic) {
		this.areaLogic = areaLogic;
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
	
	public Boolean getIsEsNuevoArea() {
		return isEsNuevoArea;
	}

	public void setIsEsNuevoArea(Boolean isEsNuevoArea) {
		this.isEsNuevoArea = isEsNuevoArea;
	}

	public Boolean getEsParaAccionDesdeFormularioArea() {
		return esParaAccionDesdeFormularioArea;
	}
	
	public void setEsParaAccionDesdeFormularioArea(Boolean esParaAccionDesdeFormularioArea) {
		this.esParaAccionDesdeFormularioArea = esParaAccionDesdeFormularioArea;
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

			if(this.areaSessionBean==null) {
				this.areaSessionBean=new AreaSessionBean();
			}

			if(!this.areaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(areaSessionBean.getlidEmpresaActual());
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

			if(this.areaSessionBean==null) {
				this.areaSessionBean=new AreaSessionBean();
			}

			if(!this.areaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(areaSessionBean.getlidEmpleadoActual());
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

	public void cargarCombosEmpleadoSustitutosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empleadosustitutosForeignKey=new ArrayList<Empleado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpleadoLogic empleadoLogic=new EmpleadoLogic();

			//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.areaSessionBean==null) {
				this.areaSessionBean=new AreaSessionBean();
			}

			if(!this.areaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleadoSustituto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empleadosustitutoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

					empleadoLogic.getTodosEmpleadosWithConnection(sFinalQuery,new Pagination());

					this.empleadosustitutosForeignKey=empleadoLogic.getEmpleados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpleadoSustituto(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(areaSessionBean.getlidEmpleadoSustitutoActual());
					this.empleadosustitutosForeignKey.add(empleadoLogic.getEmpleado());
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

					if(this.area!=null) {
						this.area.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormArea!=null) {
						this.jInternalFrameDetalleFormArea.jComboBoxid_empresaArea.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaArea.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormArea!=null) {
						if(this.jInternalFrameDetalleFormArea.jComboBoxid_empresaArea.getItemCount()>0) {
							this.jInternalFrameDetalleFormArea.jComboBoxid_empresaArea.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaAreaGenerico)throws Exception
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
				jComboBoxid_empresaAreaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaAreaGenerico!=null && jComboBoxid_empresaAreaGenerico.getItemCount()>0) {
					jComboBoxid_empresaAreaGenerico.setSelectedIndex(0);
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

					if(this.area!=null) {
						this.area.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormArea!=null) {
						this.jInternalFrameDetalleFormArea.jComboBoxid_empleadoArea.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoArea.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormArea!=null) {
						if(this.jInternalFrameDetalleFormArea.jComboBoxid_empleadoArea.getItemCount()>0) {
							this.jInternalFrameDetalleFormArea.jComboBoxid_empleadoArea.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoArea!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoArea.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoArea!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoArea.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoArea.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoArea.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoAreaGenerico)throws Exception
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
				jComboBoxid_empleadoAreaGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoAreaGenerico!=null && jComboBoxid_empleadoAreaGenerico.getItemCount()>0) {
					jComboBoxid_empleadoAreaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEmpleadoSustitutoForeignKey(Long idEmpleadoSustitutoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empleado  empleadosustitutoTemp=null;

			for(Empleado empleadosustitutoAux:empleadosustitutosForeignKey) {
				if(empleadosustitutoAux.getId()!=null && empleadosustitutoAux.getId().equals(idEmpleadoSustitutoSeleccionado)) {
					empleadosustitutoTemp=empleadosustitutoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empleadosustitutoTemp!=null) {

					if(this.area!=null) {
						this.area.setEmpleadoSustituto(empleadosustitutoTemp);
					}

					if(this.jInternalFrameDetalleFormArea!=null) {
						this.jInternalFrameDetalleFormArea.jComboBoxid_empleado_sustitutoArea.setSelectedItem(empleadosustitutoTemp);
					}
				} else {
					//jComboBoxid_empleado_sustitutoArea.setSelectedItem(empleadosustitutoTemp);
					if(this.jInternalFrameDetalleFormArea!=null) {
						if(this.jInternalFrameDetalleFormArea.jComboBoxid_empleado_sustitutoArea.getItemCount()>0) {
							this.jInternalFrameDetalleFormArea.jComboBoxid_empleado_sustitutoArea.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleadoSustituto") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadosustitutoTemp!=null && jComboBoxid_empleado_sustitutoFK_IdEmpleadoSustitutoArea!=null) {
						jComboBoxid_empleado_sustitutoFK_IdEmpleadoSustitutoArea.setSelectedItem(empleadosustitutoTemp);
					} else {
						if(jComboBoxid_empleado_sustitutoFK_IdEmpleadoSustitutoArea!=null) {
							//jComboBoxid_empleado_sustitutoFK_IdEmpleadoSustitutoArea.setSelectedItem(empleadosustitutoTemp);
							if(jComboBoxid_empleado_sustitutoFK_IdEmpleadoSustitutoArea.getItemCount()>0) {
								jComboBoxid_empleado_sustitutoFK_IdEmpleadoSustitutoArea.setSelectedIndex(0);
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

	public String getActualEmpleadoSustitutoForeignKeyDescripcion(Long idEmpleadoSustitutoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empleado  empleadosustitutoTemp=null;

			for(Empleado empleadosustitutoAux:empleadosustitutosForeignKey) {
				if(empleadosustitutoAux.getId()!=null && empleadosustitutoAux.getId().equals(idEmpleadoSustitutoSeleccionado)) {
					empleadosustitutoTemp=empleadosustitutoAux;
					break;
				}
			}


			sDescripcion=EmpleadoConstantesFunciones.getEmpleadoDescripcion(empleadosustitutoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpleadoSustitutoForeignKeyGenerico(Long idEmpleadoSustitutoSeleccionado,JComboBox jComboBoxid_empleado_sustitutoAreaGenerico)throws Exception
	{
		try
		{
			Empleado  empleadosustitutoTemp=null;

			for(Empleado empleadosustitutoAux:empleadosustitutosForeignKey) {
				if(empleadosustitutoAux.getId()!=null && empleadosustitutoAux.getId().equals(idEmpleadoSustitutoSeleccionado)) {
					empleadosustitutoTemp=empleadosustitutoAux;
					break;
				}
			}

			if(empleadosustitutoTemp!=null) {
				jComboBoxid_empleado_sustitutoAreaGenerico.setSelectedItem(empleadosustitutoTemp);
			} else {
				if(jComboBoxid_empleado_sustitutoAreaGenerico!=null && jComboBoxid_empleado_sustitutoAreaGenerico.getItemCount()>0) {
					jComboBoxid_empleado_sustitutoAreaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Area area,JComboBox jComboBoxid_empresaAreaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaAreaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormArea.jComboBoxid_empresaArea.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaAreaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				area.setid_empresa(empresaAux.getId());
				area.setempresa_descripcion(AreaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				area.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(Area area,JComboBox jComboBoxid_empleadoAreaGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoAreaGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormArea.jComboBoxid_empleadoArea.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoAreaGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				area.setid_empleado(empleadoAux.getId());
				area.setempleado_descripcion(AreaConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				area.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoSustitutoForeignKey(Area area,JComboBox jComboBoxid_empleado_sustitutoAreaGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleado_sustitutoAreaGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormArea.jComboBoxid_empleado_sustitutoArea.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleado_sustitutoAreaGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				area.setid_empleado_sustituto(empleadoAux.getId());
				area.setempleadosustituto_descripcion(AreaConstantesFunciones.getEmpleadoSustitutoDescripcion(empleadoAux));
				area.setEmpleadoSustituto(empleadoAux);			}
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

					if(!AreaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormArea!=null) { 
							this.jInternalFrameDetalleFormArea.jComboBoxid_empresaArea.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormArea.jComboBoxid_empresaArea.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormArea!=null) { 
					}

					if(!AreaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!AreaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormArea!=null) { 
							this.jInternalFrameDetalleFormArea.jComboBoxid_empleadoArea.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormArea.jComboBoxid_empleadoArea.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormArea!=null) { 
					}

					if(!AreaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AreaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoArea.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoArea.addItem(empleado);
							}
						}

						if(!AreaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpleadoSustitutosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!AreaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormArea!=null) { 
							this.jInternalFrameDetalleFormArea.jComboBoxid_empleado_sustitutoArea.removeAllItems();

							for(Empleado empleadosustituto:this.empleadosustitutosForeignKey) {
								this.jInternalFrameDetalleFormArea.jComboBoxid_empleado_sustitutoArea.addItem(empleadosustituto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormArea!=null) { 
					}

					if(!AreaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleadoSustituto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AreaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleado_sustitutoFK_IdEmpleadoSustitutoArea.removeAllItems();

							for(Empleado empleadosustituto:this.empleadosustitutosForeignKey) {
								this.jComboBoxid_empleado_sustitutoFK_IdEmpleadoSustitutoArea.addItem(empleadosustituto);
							}
						}

						if(!AreaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormArea!=null) {
							this.jInternalFrameDetalleFormArea.jComboBoxid_empresaArea.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormArea!=null) {
							this.jInternalFrameDetalleFormArea.jComboBoxid_empresaArea.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormArea!=null) {
							this.jInternalFrameDetalleFormArea.jComboBoxid_empleadoArea.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormArea!=null) {
							this.jInternalFrameDetalleFormArea.jComboBoxid_empleadoArea.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoArea.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoArea.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEmpleadoSustitutoForeignKey(Empleado empleadosustituto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormArea!=null) {
							this.jInternalFrameDetalleFormArea.jComboBoxid_empleado_sustitutoArea.setSelectedItem(empleadosustituto);
						}
					} else {
						if(this.jInternalFrameDetalleFormArea!=null) {
							this.jInternalFrameDetalleFormArea.jComboBoxid_empleado_sustitutoArea.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleado_sustitutoFK_IdEmpleadoSustitutoArea.setSelectedItem(empleadosustituto);
						} else {
							this.jComboBoxid_empleado_sustitutoFK_IdEmpleadoSustitutoArea.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesArea() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			AreaConstantesFunciones.refrescarForeignKeysDescripcionesArea(this.areaLogic.getAreas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			AreaConstantesFunciones.refrescarForeignKeysDescripcionesArea(this.areas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Empleado.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//areaLogic.setAreas(this.areas);
			areaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public AreaParameterReturnGeneral getAreaParameterGeneral() {
		return this.areaParameterGeneral;
	}
	
	public void setAreaParameterGeneral(AreaParameterReturnGeneral areaParameterGeneral) {
		this.areaParameterGeneral = areaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoArea() {
		return isPermisoTodoArea;
	}

	public void setIsPermisoTodoArea(Boolean isPermisoTodoArea) {
		this.isPermisoTodoArea = isPermisoTodoArea;
	}

	public Boolean getIsPermisoNuevoArea() {
		return isPermisoNuevoArea;
	}

	public void setIsPermisoNuevoArea(Boolean isPermisoNuevoArea) {
		this.isPermisoNuevoArea = isPermisoNuevoArea;
	}

	public Boolean getIsPermisoActualizarArea() {
		return isPermisoActualizarArea;
	}

	public void setIsPermisoActualizarArea(Boolean isPermisoActualizarArea) {
		this.isPermisoActualizarArea = isPermisoActualizarArea;
	}

	public Boolean getIsPermisoEliminarArea() {
		return isPermisoEliminarArea;
	}

	public void setIsPermisoEliminarArea(Boolean isPermisoEliminarArea) {
		this.isPermisoEliminarArea = isPermisoEliminarArea;
	}

	public Boolean getIsPermisoGuardarCambiosArea() {
		return isPermisoGuardarCambiosArea;
	}

	public void setIsPermisoGuardarCambiosArea(Boolean isPermisoGuardarCambiosArea) {
		this.isPermisoGuardarCambiosArea = isPermisoGuardarCambiosArea;
	}
	
	public Boolean getIsPermisoConsultaArea() {
		return isPermisoConsultaArea;
	}

	public void setIsPermisoConsultaArea(Boolean isPermisoConsultaArea) {
		this.isPermisoConsultaArea = isPermisoConsultaArea;
	}

	public Boolean getIsPermisoBusquedaArea() {
		return isPermisoBusquedaArea;
	}

	public void setIsPermisoBusquedaArea(Boolean isPermisoBusquedaArea) {
		this.isPermisoBusquedaArea = isPermisoBusquedaArea;
	}

	public Boolean getIsPermisoReporteArea() {
		return isPermisoReporteArea;
	}

	public void setIsPermisoReporteArea(Boolean isPermisoReporteArea) {
		this.isPermisoReporteArea = isPermisoReporteArea;
	}
	
	public Boolean getIsPermisoPaginacionMedioArea() {
		return isPermisoPaginacionMedioArea;
	}

	public void setIsPermisoPaginacionMedioArea(Boolean isPermisoPaginacionMedioArea) {
		this.isPermisoPaginacionMedioArea = isPermisoPaginacionMedioArea;
	}
	
	public Boolean getIsPermisoPaginacionTodoArea() {
		return isPermisoPaginacionTodoArea;
	}

	public void setIsPermisoPaginacionTodoArea(Boolean isPermisoPaginacionTodoArea) {
		this.isPermisoPaginacionTodoArea = isPermisoPaginacionTodoArea;
	}
	
	public Boolean getIsPermisoPaginacionAltoArea() {
		return isPermisoPaginacionAltoArea;
	}

	public void setIsPermisoPaginacionAltoArea(Boolean isPermisoPaginacionAltoArea) {
		this.isPermisoPaginacionAltoArea = isPermisoPaginacionAltoArea;
	}
	
	public Boolean getIsPermisoCopiarArea() {
		return isPermisoCopiarArea;
	}

	public void setIsPermisoCopiarArea(Boolean isPermisoCopiarArea) {
		this.isPermisoCopiarArea = isPermisoCopiarArea;
	}
	
	public Boolean getIsPermisoVerFormArea() {
		return isPermisoVerFormArea;
	}

	public void setIsPermisoVerFormArea(Boolean isPermisoVerFormArea) {
		this.isPermisoVerFormArea = isPermisoVerFormArea;
	}
	
	public Boolean getIsPermisoDuplicarArea() {
		return isPermisoDuplicarArea;
	}

	public void setIsPermisoDuplicarArea(Boolean isPermisoDuplicarArea) {
		this.isPermisoDuplicarArea = isPermisoDuplicarArea;
	}
	
	public Boolean getIsPermisoOrdenArea() {
		return isPermisoOrdenArea;
	}

	public void setIsPermisoOrdenArea(Boolean isPermisoOrdenArea) {
		this.isPermisoOrdenArea = isPermisoOrdenArea;
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
	
	public Boolean getIsVisibilidadCeldaNuevoArea() {
		return isVisibilidadCeldaNuevoArea;
	}

	public void setIsVisibilidadCeldaNuevoArea(Boolean isVisibilidadCeldaNuevoArea) {
		this.isVisibilidadCeldaNuevoArea = isVisibilidadCeldaNuevoArea;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarArea() {
		return isVisibilidadCeldaDuplicarArea;
	}

	public void setIsVisibilidadCeldaDuplicarArea(Boolean isVisibilidadCeldaDuplicarArea) {
		this.isVisibilidadCeldaDuplicarArea = isVisibilidadCeldaDuplicarArea;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarArea() {
		return isVisibilidadCeldaCopiarArea;
	}

	public void setIsVisibilidadCeldaCopiarArea(Boolean isVisibilidadCeldaCopiarArea) {
		this.isVisibilidadCeldaCopiarArea = isVisibilidadCeldaCopiarArea;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormArea() {
		return isVisibilidadCeldaVerFormArea;
	}

	public void setIsVisibilidadCeldaVerFormArea(Boolean isVisibilidadCeldaVerFormArea) {
		this.isVisibilidadCeldaVerFormArea = isVisibilidadCeldaVerFormArea;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenArea() {
		return isVisibilidadCeldaOrdenArea;
	}

	public void setIsVisibilidadCeldaOrdenArea(Boolean isVisibilidadCeldaOrdenArea) {
		this.isVisibilidadCeldaOrdenArea = isVisibilidadCeldaOrdenArea;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesArea() {
		return isVisibilidadCeldaNuevoRelacionesArea;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesArea(Boolean isVisibilidadCeldaNuevoRelacionesArea) {
		this.isVisibilidadCeldaNuevoRelacionesArea = isVisibilidadCeldaNuevoRelacionesArea;
	}
	
	public Boolean getIsVisibilidadCeldaModificarArea() {
		return isVisibilidadCeldaModificarArea;
	}

	public void setIsVisibilidadCeldaModificarArea(Boolean isVisibilidadCeldaModificarArea) {
		this.isVisibilidadCeldaModificarArea = isVisibilidadCeldaModificarArea;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarArea() {
		return isVisibilidadCeldaActualizarArea;
	}

	public void setIsVisibilidadCeldaActualizarArea(Boolean isVisibilidadCeldaActualizarArea) {
		this.isVisibilidadCeldaActualizarArea = isVisibilidadCeldaActualizarArea;
	}

	public Boolean getIsVisibilidadCeldaEliminarArea() {
		return isVisibilidadCeldaEliminarArea;
	}

	public void setIsVisibilidadCeldaEliminarArea(Boolean isVisibilidadCeldaEliminarArea) {
		this.isVisibilidadCeldaEliminarArea = isVisibilidadCeldaEliminarArea;
	}

	public Boolean getIsVisibilidadCeldaCancelarArea() {
		return isVisibilidadCeldaCancelarArea;
	}

	public void setIsVisibilidadCeldaCancelarArea(Boolean isVisibilidadCeldaCancelarArea) {
		this.isVisibilidadCeldaCancelarArea = isVisibilidadCeldaCancelarArea;
	}

	public Boolean getIsVisibilidadCeldaGuardarArea() {
		return isVisibilidadCeldaGuardarArea;
	}

	public void setIsVisibilidadCeldaGuardarArea(Boolean isVisibilidadCeldaGuardarArea) {
		this.isVisibilidadCeldaGuardarArea = isVisibilidadCeldaGuardarArea;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosArea() {
		return isVisibilidadCeldaGuardarCambiosArea;
	}

	public void setIsVisibilidadCeldaGuardarCambiosArea(Boolean isVisibilidadCeldaGuardarCambiosArea) {
		this.isVisibilidadCeldaGuardarCambiosArea = isVisibilidadCeldaGuardarCambiosArea;
	}
		
	public AreaSessionBean getareaSessionBean() {
		return this.areaSessionBean;
	}
	
	public void setareaSessionBean(AreaSessionBean areaSessionBean) {
		this.areaSessionBean=areaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpleado() {
		return this.isVisibilidadFK_IdEmpleado;
	}

	public void setisVisibilidadFK_IdEmpleado(Boolean isVisibilidadFK_IdEmpleado) {
		this.isVisibilidadFK_IdEmpleado=isVisibilidadFK_IdEmpleado;
	}

	public Boolean getisVisibilidadFK_IdEmpleadoSustituto() {
		return this.isVisibilidadFK_IdEmpleadoSustituto;
	}

	public void setisVisibilidadFK_IdEmpleadoSustituto(Boolean isVisibilidadFK_IdEmpleadoSustituto) {
		this.isVisibilidadFK_IdEmpleadoSustituto=isVisibilidadFK_IdEmpleadoSustituto;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysArea(Area area)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(area,null);
				this.setActualParaGuardarEmpleadoForeignKey(area,null);
				this.setActualParaGuardarEmpleadoSustitutoForeignKey(area,null);
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
	
	public void bugActualizarReferenciaActual(Area area,Area areaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalArea(area);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		areaAux.setId(area.getId());
		areaAux.setVersionRow(area.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessArea();
		
			int intSelectedRow = this.jTableDatosArea.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.area =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.area =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(AreaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualArea(this.area,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysArea(this.area);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = areaValidator.getInvalidValues(this.area);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			areaLogic.setDatosCliente(datosCliente);
			areaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				areaAux=new  Area();
				
				areaAux.setIsNew(true);
				areaAux.setIsChanged(true);
				
				areaAux.setAreaOriginal(this.area);
				
				areaAux.setId(this.area.getId());	
				areaAux.setVersionRow(this.area.getVersionRow());	
				areaAux.setid_empresa(this.area.getid_empresa());	
				areaAux.setid_empleado(this.area.getid_empleado());	
				areaAux.setid_empleado_sustituto(this.area.getid_empleado_sustituto());	
				areaAux.setcodigo(this.area.getcodigo());	
				areaAux.setnombre(this.area.getnombre());	
				areaAux.setsecuencial_pedido(this.area.getsecuencial_pedido());	
				areaAux.setsecuencial_cotizacion(this.area.getsecuencial_cotizacion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.areaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.areaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(areaAux,areaLogic.getAreas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(areaAux,areas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.areaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.areaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						areaLogic.saveAreas();//WithConnection
						//areaLogic.getSetVersionRowAreas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.area,areaAux);
					
					this.refrescarForeignKeysDescripcionesArea();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.areaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.areaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								areaLogic.saveAreaRelaciones(areaAux);//WithConnection
								//areaLogic.getSetVersionRowAreas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.area,areaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.areaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.areaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(areaAux,areaLogic.getAreas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(areaAux,areas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.area,areaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				areaAux=new  Area();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.areaSessionBean.getEsGuardarRelacionado() 
					|| (this.areaSessionBean.getEsGuardarRelacionado() && this.area.getId()>=0)) {
						
					areaAux.setIsNew(false);
				}
				
				areaAux.setIsDeleted(false);
			
				areaAux.setId(this.area.getId());	
				areaAux.setVersionRow(this.area.getVersionRow());	
				areaAux.setid_empresa(this.area.getid_empresa());	
				areaAux.setid_empleado(this.area.getid_empleado());	
				areaAux.setid_empleado_sustituto(this.area.getid_empleado_sustituto());	
				areaAux.setcodigo(this.area.getcodigo());	
				areaAux.setnombre(this.area.getnombre());	
				areaAux.setsecuencial_pedido(this.area.getsecuencial_pedido());	
				areaAux.setsecuencial_cotizacion(this.area.getsecuencial_cotizacion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(areaAux,areaLogic.getAreas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(areaAux,areas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.areaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.areaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						areaLogic.saveAreas();//WithConnection
						//areaLogic.getSetVersionRowAreas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.area,areaAux);
					
					this.refrescarForeignKeysDescripcionesArea();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.areaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.areaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								areaLogic.saveAreaRelaciones(areaAux);//WithConnection
								//areaLogic.getSetVersionRowAreas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.area,areaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.areaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.areaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(areaAux,areaLogic.getAreas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(areaAux,areas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.area,areaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				areaAux=new  Area();
				
				areaAux.setIsNew(false);
				areaAux.setIsChanged(false);
				
				areaAux.setIsDeleted(true);
				
				areaAux.setId(this.area.getId());	
				areaAux.setVersionRow(this.area.getVersionRow());	
				areaAux.setid_empresa(this.area.getid_empresa());	
				areaAux.setid_empleado(this.area.getid_empleado());	
				areaAux.setid_empleado_sustituto(this.area.getid_empleado_sustituto());	
				areaAux.setcodigo(this.area.getcodigo());	
				areaAux.setnombre(this.area.getnombre());	
				areaAux.setsecuencial_pedido(this.area.getsecuencial_pedido());	
				areaAux.setsecuencial_cotizacion(this.area.getsecuencial_cotizacion());	
				
				if(this.areaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.areaAux.getId()>=0) {	
						this.areasEliminados.add(areaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(areaAux,areaLogic.getAreas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(areaAux,areas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.areaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.areaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						areaLogic.saveAreas();//WithConnection
						//areaLogic.getSetVersionRowAreas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.areaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.areaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								areaLogic.saveAreaRelaciones(areaAux);//WithConnection
								//areaLogic.getSetVersionRowAreas();//WithConnection
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
							if(this.areaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.areaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(areaAux,areaLogic.getAreas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(areaAux,areas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.getAreas().addAll(this.areasEliminados);
					
					areaLogic.saveAreas();//WithConnection
					//areaLogic.getSetVersionRowAreas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesArea();
				
				this.areasEliminados= new ArrayList<Area>();		
			}
			
			if(this.areaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.areaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Area GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Area",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.area=areaAux;
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
      		//this.finishProcessArea();
      	}
		
	}	
	
	public void actualizarRelaciones(Area areaLocal) throws Exception {
		
		if(this.areaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Area areaLocal) throws Exception {	
		if(this.areaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				areaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				areaLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadosustitutoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadosustitutoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadosustitutoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadosustitutoBeanSwingJInternalFrameLocal.actualizarLista(empleadosustitutoBeanSwingJInternalFrameLocal.empleado,this.empleadosustitutosForeignKey);

				empleadosustitutoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadosustitutoBeanSwingJInternalFrameLocal.empleado);

				areaLocal.setEmpleadoSustituto(empleadosustitutoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleadoSustituto();
				this.cargarCombosFrameEmpleadoSustitutosForeignKey("Formulario");
				this.setActualEmpleadoSustitutoForeignKey(empleadosustitutoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarAreaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosArea.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.area =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.area =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = areaValidator.getInvalidValues(this.area);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Area area,List<Area> areas) throws Exception {
		try	{		
			AreaConstantesFunciones.actualizarLista(area,areas,this.areaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Area area,List<Area> areas) throws Exception {
		try	{			
			AreaConstantesFunciones.actualizarSelectedLista(area,areas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Area> areasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				areasLocal=this.areaLogic.getAreas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				areasLocal=this.areas;
			}
			//ARCHITECTURE
		
			for(Area areaLocal:areasLocal) {
				if(this.permiteMantenimiento(areaLocal) && areaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+AreaConstantesFunciones.getAreaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(AreaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormArea.jLabelid_empresaArea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AreaConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormArea.jLabelid_empleadoArea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AreaConstantesFunciones.IDEMPLEADOSUSTITUTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormArea.jLabelid_empleado_sustitutoArea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AreaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormArea.jLabelcodigoArea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AreaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormArea.jLabelnombreArea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AreaConstantesFunciones.SECUENCIALPEDIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormArea.jLabelsecuencial_pedidoArea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AreaConstantesFunciones.SECUENCIALCOTIZACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormArea.jLabelsecuencial_cotizacionArea,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormArea!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormArea.jLabelid_empresaArea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormArea.jLabelid_empleadoArea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormArea.jLabelid_empleado_sustitutoArea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormArea.jLabelcodigoArea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormArea.jLabelnombreArea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormArea.jLabelsecuencial_pedidoArea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormArea.jLabelsecuencial_cotizacionArea,"");
		
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
		this.iIdNuevoArea--;	
		
		
		this.areaAux=new Area();
		
		this.areaAux.setId(this.iIdNuevoArea);
		this.areaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.areaLogic.getAreas().add(this.areaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.areas.add(this.areaAux);
		}
		//ARCHITECTURE
		
		this.area=this.areaAux;
		
		if(AreaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioArea(this.area);
			this.setVariablesObjetoActualToFormularioForeignKeyArea(this.area);
		}
				
		//this.setDefaultControlesArea();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyArea();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyArea();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyArea();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualArea(this.areaBean,this.area,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysArea(this.area);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(AreaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.areaSessionBean.getConGuardarRelaciones()) {
			classes=AreaConstantesFunciones.getClassesRelationshipsOfArea(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.areaReturnGeneral=areaLogic.procesarEventosAreasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.areaLogic.getAreas(),this.area,this.areaParameterGeneral,this.isEsNuevoArea,classes);//this.areaLogic.getArea()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanArea(this.areaReturnGeneral,this.areaBean,false);
		
		if(this.areaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyArea(this.areaReturnGeneral.getArea());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioArea(this.areaReturnGeneral.getArea());
		}
		
		if(this.areaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioArea(this.areaReturnGeneral.getArea(),classes);//this.areaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualArea(this.area,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyArea();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyArea();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AreaBeanSwingJInternalFrameAdditional.RecargarFormArea(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingArea(false);
						
			if(areaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(AreaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualArea();
			}
			
			this.actualizarVisualTableDatosArea();
			
			this.jTableDatosArea.setRowSelectionInterval(this.getIndiceNuevoArea(), this.getIndiceNuevoArea());
			
			this.seleccionarFilaTablaAreaActual();
						
			this.actualizarEstadoCeldasBotonesArea("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesArea(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormArea.jTextFieldcodigoArea.setEnabled(isHabilitar && this.areaConstantesFunciones.activarcodigoArea);
		this.jInternalFrameDetalleFormArea.jTextAreanombreArea.setEnabled(isHabilitar && this.areaConstantesFunciones.activarnombreArea);
		this.jInternalFrameDetalleFormArea.jTextFieldsecuencial_pedidoArea.setEnabled(isHabilitar && this.areaConstantesFunciones.activarsecuencial_pedidoArea);
		this.jInternalFrameDetalleFormArea.jTextFieldsecuencial_cotizacionArea.setEnabled(isHabilitar && this.areaConstantesFunciones.activarsecuencial_cotizacionArea);	
		//
		this.jInternalFrameDetalleFormArea.jComboBoxid_empresaArea.setEnabled(isHabilitar && this.areaConstantesFunciones.activarid_empresaArea);
		this.jInternalFrameDetalleFormArea.jComboBoxid_empleadoArea.setEnabled(isHabilitar && this.areaConstantesFunciones.activarid_empleadoArea);
		this.jInternalFrameDetalleFormArea.jComboBoxid_empleado_sustitutoArea.setEnabled(isHabilitar && this.areaConstantesFunciones.activarid_empleado_sustitutoArea);
	};
	
	public void setDefaultControlesArea() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoArea(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.areaSessionBean.setConGuardarRelaciones(true);			
			this.areaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormArea.jTabbedPaneRelacionesArea.setVisible(true);
			
					
		} else {
			//this.areaSessionBean.setConGuardarRelaciones(false);			
			this.areaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormArea.jTabbedPaneRelacionesArea.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoArea() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Area areaAux:this.areaLogic.getAreas()) {
				if(areaAux.getId().equals(this.iIdNuevoArea)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Area areaAux:this.areas) {
				if(areaAux.getId().equals(this.iIdNuevoArea)) {
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
	
	public int getIndiceActualArea(Area area,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Area areaAux:this.areaLogic.getAreas()) {
				if(areaAux.getId().equals(area.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Area areaAux:this.areas) {
				if(areaAux.getId().equals(area.getId())) {
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
	
	public void setCamposBaseDesdeOriginalArea(Area areaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Area areaAux:this.areaLogic.getAreas()) {
				if(areaAux.getAreaOriginal().getId().equals(areaOriginal.getId())) {
					existe=true;
					areaOriginal.setId(areaAux.getId());
					areaOriginal.setVersionRow(areaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Area areaAux:this.areas) {
				if(areaAux.getAreaOriginal().getId().equals(areaOriginal.getId())) {
					existe=true;
					areaOriginal.setId(areaAux.getId());
					areaOriginal.setVersionRow(areaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosArea(Boolean esParaCancelar) throws Exception {
		areasAux=new ArrayList<Area>();
		areaAux=new Area();
		
		if(!this.areaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Area areaAux:this.areaLogic.getAreas()) {
					if(areaAux.getId()<0) {
						areasAux.add(areaAux);
					}		
				}
				this.iIdNuevoArea=0L;
				this.areaLogic.getAreas().removeAll(areasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Area areaAux:this.areas) {
					if(areaAux.getId()<0) {
						areasAux.add(areaAux);
					}		
				}
				this.iIdNuevoArea=0L;
				this.areas.removeAll(areasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoArea 
					&& this.areaLogic.getAreas().size()>0
					) {
					areaAux=this.areaLogic.getAreas().get(this.areaLogic.getAreas().size() - 1);
				
					if(areaAux.getId()<0) {
						this.areaLogic.getAreas().remove(areaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoArea && this.areas.size()>0) {
					areaAux=this.areas.get(this.areas.size() - 1);
				
					if(areaAux.getId()<0) {
						this.areas.remove(areaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoArea(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(area.getId()<0) {
				this.areaLogic.getAreas().remove(this.area);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(area.getId()<0) {
				this.areas.remove(this.area);
			}
		}			
	}
	
	public void setEstadosInicialesArea(List<Area> areasAux) throws Exception {
		AreaConstantesFunciones.setEstadosInicialesArea(areasAux);
	}
	
	public void setEstadosInicialesArea(Area areaAux) throws Exception {
		AreaConstantesFunciones.setEstadosInicialesArea(areaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarAreaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesArea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarAreaActual()) {
				if(!this.isEsNuevoArea) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesArea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoArea=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarAreaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Area ?", "MANTENIMIENTO DE Area", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesArea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Area area) throws Exception {
		AreaConstantesFunciones.seleccionarAsignar(this.area,area);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarArea=this.isPermisoActualizarOriginalArea;
			
			
			this.seleccionarAsignar(area);
			
			

			idEmpleadoActual=area.getid_empleado();
			this.seleccionarEmpleadoActual();

			idEmpleadoSustitutoActual=area.getid_empleado_sustituto();
			this.seleccionarEmpleadoSustitutoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AreaConstantesFunciones.quitarEspaciosArea(this.area,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesArea("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.areaSessionBean.setsFuncionBusquedaRapida(this.areaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
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
	public void seleccionarEmpleadoSustitutoActual() throws Exception {
		try	{
			Empleado empleadosustitutoAux=new Empleado();

			if(this.idEmpleadoSustitutoActual != null && this.idEmpleadoSustitutoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadosustitutoLogic.getEntityWithConnection(this.idEmpleadoSustitutoActual);
					empleadosustitutoAux= empleadosustitutoLogic.getEmpleado();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				empleadosustitutosForeignKey=new ArrayList<Empleado>();
				empleadosustitutosForeignKey.add(empleadosustitutoAux);
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
			if(this.isEsNuevoArea) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosArea(esParaCancelar);				
				this.cancelarNuevoArea(esParaCancelar);								
			}
			
			this.area=new Area();
			
			this.inicializarArea();
			
			this.actualizarEstadoCeldasBotonesArea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarArea() throws Exception {
		try {
			AreaConstantesFunciones.inicializarArea(this.area);
			
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
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.areaLogic.getAreas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteAreas(String sAccionBusqueda,List<Area> areasParaReportes) throws Exception {
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
					sPathReporteFinal="Area"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="AreaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("AreaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Area"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Areas");		
		parameters.put("busquedapor", AreaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceArea=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			AreaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			AreaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceArea=new JRBeanArrayDataSource(AreaJInternalFrame.TraerAreaBeans(areasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceArea);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+AreaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+AreaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(AreaBean.TraerAreaBeans(areasParaReportes).toArray()));
							
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
				this.generarExcelReporteAreas(sAccionBusqueda,sTipoArchivoReporte,areasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalAreas(sAccionBusqueda,sTipoArchivoReporte,areasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoAreaActionPerformed(null);
					//this.generarExcelReporteAreas(sAccionBusqueda,sTipoArchivoReporte,areasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalAreas(sAccionBusqueda,sTipoArchivoReporte,areasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesAreas(sAccionBusqueda,sTipoArchivoReporte,areasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesAreas(sAccionBusqueda,sTipoArchivoReporte,areasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteAreas(String sAccionBusqueda,String sTipoArchivoReporte,List<Area> areasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"area";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Areas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderArea("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Area area : areasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			AreaConstantesFunciones.generarExcelReporteDataArea("NORMAL",row,workbook,area,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.areaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Area",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderArea(String sTipo,Row row,Workbook workbook) {
		
		AreaConstantesFunciones.generarExcelReporteHeaderArea(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalAreas(String sAccionBusqueda,String sTipoArchivoReporte,List<Area> areasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"area_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Areas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Area area : areasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(AreaConstantesFunciones.getAreaDescripcion(area));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AreaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AreaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(area.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AreaConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AreaConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(area.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AreaConstantesFunciones.LABEL_IDEMPLEADOSUSTITUTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AreaConstantesFunciones.LABEL_IDEMPLEADOSUSTITUTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(area.getempleadosustituto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AreaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AreaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(area.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AreaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AreaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(area.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AreaConstantesFunciones.LABEL_SECUENCIALPEDIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AreaConstantesFunciones.LABEL_SECUENCIALPEDIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(area.getsecuencial_pedido());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AreaConstantesFunciones.LABEL_SECUENCIALCOTIZACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AreaConstantesFunciones.LABEL_SECUENCIALCOTIZACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(area.getsecuencial_cotizacion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.areaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Area",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesAreas(String sAccionBusqueda,String sTipoArchivoReporte,List<Area> areasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Area> areasRespaldo=null;
		
		classes=AreaConstantesFunciones.getClassesRelationshipsOfArea(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.areaLogic.setDatosCliente(this.datosCliente);
		this.areaLogic.setDatosDeep(this.datosDeep);
		this.areaLogic.setIsConDeep(true);
		
		areasRespaldo=this.areaLogic.getAreas();
		
		this.areaLogic.setAreas(areasParaReportes);	
		this.areaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		areasParaReportes=this.areaLogic.getAreas();
		this.areaLogic.setAreas(areasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"area_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Areas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderArea("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Area area : areasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderArea("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			AreaConstantesFunciones.generarExcelReporteDataArea("NORMAL",row,workbook,area,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(AreaConstantesFunciones.getAreaDescripcion(area));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.areaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Area",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoArea.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoArea.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoArea.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoArea.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessArea() throws Exception {		
		this.startProcessArea(true);
	}
	
	public void startProcessArea(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasArea ,this.jPanelParametrosReportesArea, this.jScrollPanelDatosArea,this.jPanelPaginacionArea, this.jScrollPanelDatosEdicionArea, this.jPanelAccionesArea,this.jPanelAccionesFormularioArea,this.jmenuBarArea,this.jmenuBarDetalleArea,this.jTtoolBarArea,this.jTtoolBarDetalleArea);		
		
		final JTabbedPane jTabbedPaneBusquedasArea=this.jTabbedPaneBusquedasArea; 
		
		final JPanel jPanelParametrosReportesArea=this.jPanelParametrosReportesArea;
		//final JScrollPane jScrollPanelDatosArea=this.jScrollPanelDatosArea;
		final JTable jTableDatosArea=this.jTableDatosArea;		
		final JPanel jPanelPaginacionArea=this.jPanelPaginacionArea;
		//final JScrollPane jScrollPanelDatosEdicionArea=this.jScrollPanelDatosEdicionArea;
		final JPanel jPanelAccionesArea=this.jPanelAccionesArea;
		
		JPanel jPanelCamposAuxiliarArea=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarArea=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormArea!=null) {
			jPanelCamposAuxiliarArea=this.jInternalFrameDetalleFormArea.jPanelCamposArea;
			jPanelAccionesFormularioAuxiliarArea=this.jInternalFrameDetalleFormArea.jPanelAccionesFormularioArea;
		}
		
		final JPanel jPanelCamposArea=jPanelCamposAuxiliarArea;
		final JPanel jPanelAccionesFormularioArea=jPanelAccionesFormularioAuxiliarArea;
		
		
		final JMenuBar jmenuBarArea=this.jmenuBarArea;
		final JToolBar jTtoolBarArea=this.jTtoolBarArea;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarArea=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarArea=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormArea!=null) {
			jmenuBarDetalleAuxiliarArea=this.jInternalFrameDetalleFormArea.jmenuBarDetalleArea;
			jTtoolBarDetalleAuxiliarArea=this.jInternalFrameDetalleFormArea.jTtoolBarDetalleArea;
		}
		
		final JMenuBar jmenuBarDetalleArea=jmenuBarDetalleAuxiliarArea;
		final JToolBar jTtoolBarDetalleArea=jTtoolBarDetalleAuxiliarArea;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasArea;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesArea;
			processRunnable.jTableDatos=jTableDatosArea;
			processRunnable.jPanelCampos=jPanelCamposArea;
			processRunnable.jPanelPaginacion=jPanelPaginacionArea;
			processRunnable.jPanelAcciones=jPanelAccionesArea;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioArea;
			
			
			processRunnable.jmenuBar=jmenuBarArea;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleArea;
			processRunnable.jTtoolBar=jTtoolBarArea;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleArea;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasArea ,jPanelParametrosReportesArea,jTableDatosArea, /*jScrollPanelDatosArea,*/jPanelCamposArea,jPanelPaginacionArea, /*jScrollPanelDatosEdicionArea,*/ jPanelAccionesArea,jPanelAccionesFormularioArea,jmenuBarArea,jmenuBarDetalleArea,jTtoolBarArea,jTtoolBarDetalleArea);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasArea ,jPanelParametrosReportesArea, jScrollPanelDatosArea,jPanelPaginacionArea, jScrollPanelDatosEdicionArea, jPanelAccionesArea,jPanelAccionesFormularioArea,jmenuBarArea,jmenuBarDetalleArea,jTtoolBarArea,jTtoolBarDetalleArea);
						
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
	
	public void finishProcessArea() {// throws Exception 
		this.finishProcessArea(true);
	}
	
	public void finishProcessArea(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasArea ,this.jPanelParametrosReportesArea, this.jScrollPanelDatosArea,this.jPanelPaginacionArea, this.jScrollPanelDatosEdicionArea, this.jPanelAccionesArea,this.jPanelAccionesFormularioArea,this.jmenuBarArea,this.jmenuBarDetalleArea,this.jTtoolBarArea,this.jTtoolBarDetalleArea);		
		
		final JTabbedPane jTabbedPaneBusquedasArea=this.jTabbedPaneBusquedasArea; 
		
		final JPanel jPanelParametrosReportesArea=this.jPanelParametrosReportesArea;
		//final JScrollPane jScrollPanelDatosArea=this.jScrollPanelDatosArea;
		final JTable jTableDatosArea=this.jTableDatosArea;		
		final JPanel jPanelPaginacionArea=this.jPanelPaginacionArea;
		//final JScrollPane jScrollPanelDatosEdicionArea=this.jScrollPanelDatosEdicionArea;
		final JPanel jPanelAccionesArea=this.jPanelAccionesArea;
		
		JPanel jPanelCamposAuxiliarArea=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarArea=new JPanel();
		
		if(this.jInternalFrameDetalleFormArea!=null) {
			jPanelCamposAuxiliarArea=this.jInternalFrameDetalleFormArea.jPanelCamposArea;
			jPanelAccionesFormularioAuxiliarArea=this.jInternalFrameDetalleFormArea.jPanelAccionesFormularioArea;
		}
		
		final JPanel jPanelCamposArea=jPanelCamposAuxiliarArea;
		final JPanel jPanelAccionesFormularioArea=jPanelAccionesFormularioAuxiliarArea;
		
		
		final JMenuBar jmenuBarArea=this.jmenuBarArea;		
		final JToolBar jTtoolBarArea=this.jTtoolBarArea;
				
		JMenuBar jmenuBarDetalleAuxiliarArea=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarArea=new JToolBar();
		
		if(this.jInternalFrameDetalleFormArea!=null) {
			jmenuBarDetalleAuxiliarArea=this.jInternalFrameDetalleFormArea.jmenuBarDetalleArea;
			jTtoolBarDetalleAuxiliarArea=this.jInternalFrameDetalleFormArea.jTtoolBarDetalleArea;		
		}
		
		final JMenuBar jmenuBarDetalleArea=jmenuBarDetalleAuxiliarArea;
		final JToolBar jTtoolBarDetalleArea=jTtoolBarDetalleAuxiliarArea;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasArea;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesArea;
			processRunnable.jTableDatos=jTableDatosArea;
			processRunnable.jPanelCampos=jPanelCamposArea;
			processRunnable.jPanelPaginacion=jPanelPaginacionArea;
			processRunnable.jPanelAcciones=jPanelAccionesArea;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioArea;
			
			
			processRunnable.jmenuBar=jmenuBarArea;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleArea;
			processRunnable.jTtoolBar=jTtoolBarArea;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleArea;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasArea ,jPanelParametrosReportesArea, jTableDatosArea,/*jScrollPanelDatosArea,*/jPanelCamposArea,jPanelPaginacionArea, /*jScrollPanelDatosEdicionArea,*/ jPanelAccionesArea,jPanelAccionesFormularioArea,jmenuBarArea,jmenuBarDetalleArea,jTtoolBarArea,jTtoolBarDetalleArea));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesArea(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarArea(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuArea(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarArea(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarArea,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleArea,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuArea(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarArea,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleArea,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.areaConstantesFunciones.getsFinalQueryArea();
		String  finalQueryPaginacionTodos=this.areaConstantesFunciones.getsFinalQueryArea();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=AreaConstantesFunciones.getArrayColumnasGlobalesNoArea(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=AreaConstantesFunciones.getArrayColumnasGlobalesArea(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,AreaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.areasEliminados= new ArrayList<Area>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessArea();
		
				///*AreaSessionBean*/this.areaSessionBean=new AreaSessionBean();
			
			if(this.areaSessionBean==null) {
				this.areaSessionBean=new AreaSessionBean();
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
					this.iNumeroPaginacion=AreaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=AreaConstantesFunciones.getClassesForeignKeysOfArea(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/area."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			areasAux= new ArrayList<Area>();
			
				
			areaLogic.setDatosCliente(this.datosCliente);
			areaLogic.setDatosDeep(this.datosDeep);
			areaLogic.setIsConDeep(true);
			
			
			areaLogic.getAreaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					areaLogic.getTodosAreas(finalQueryGlobal,pagination);
					
					//areaLogic.getTodosAreasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(areaLogic.getAreas()==null|| areaLogic.getAreas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							areasAux= new ArrayList<Area>();
							areasAux.addAll(areaLogic.getAreas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							areasAux= new ArrayList<Area>();
							areasAux.addAll(areas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							areaLogic.getTodosAreas(finalQueryGlobal+"",this.pagination);												
							
							//areaLogic.getTodosAreasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteAreas("Todos",areaLogic.getAreas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							areaLogic.setAreas(new ArrayList<Area>());					
							areaLogic.getAreas().addAll(areasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							areas=new ArrayList<Area>();
							areas.addAll(areasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idArea=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idArea=this.idActual;
				
				} else if(this.idAreaActual!=null && this.idAreaActual!=0L) {
					idArea=idAreaActual;
				}
				
					
				this.sDetalleReporte=AreaConstantesFunciones.getDetalleIndicePorId(idArea);
				
				this.areas=new ArrayList<Area>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					areaLogic.getEntity(idArea);
					
					//areaLogic.getEntityWithConnection(idArea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					areaLogic.setAreas(new ArrayList<Area>());
					areaLogic.getAreas().add(areaLogic.getArea());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.areas=new ArrayList<Area>();
					this.areas.add(area);
				}
				
				if(areaLogic.getArea()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=AreaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					areaLogic.getAreasFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AreaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AreaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=areaLogic.getAreas()==null||areaLogic.getAreas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=areas==null|| areas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						areasAux=new ArrayList<Area>();
						areasAux.addAll(areaLogic.getAreas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							areasAux=new ArrayList<Area>();
							areasAux.addAll(areas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							areaLogic.getAreasFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AreaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AreaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAreas("FK_IdEmpleado",areaLogic.getAreas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAreas("FK_IdEmpleado",areas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						areaLogic.setAreas(new ArrayList<Area>());
						areaLogic.getAreas().addAll(areasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							areas=new ArrayList<Area>();
							areas.addAll(areasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleadoSustituto")) {
				this.sDetalleReporte=AreaConstantesFunciones.getDetalleIndiceFK_IdEmpleadoSustituto(id_empleado_sustitutoFK_IdEmpleadoSustituto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					areaLogic.getAreasFK_IdEmpleadoSustituto(finalQueryGlobal,pagination,id_empleado_sustitutoFK_IdEmpleadoSustituto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AreaConstantesFunciones.getDetalleIndiceFK_IdEmpleadoSustituto(id_empleado_sustitutoFK_IdEmpleadoSustituto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AreaConstantesFunciones.getDetalleIndiceFK_IdEmpleadoSustituto(id_empleado_sustitutoFK_IdEmpleadoSustituto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=areaLogic.getAreas()==null||areaLogic.getAreas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=areas==null|| areas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						areasAux=new ArrayList<Area>();
						areasAux.addAll(areaLogic.getAreas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							areasAux=new ArrayList<Area>();
							areasAux.addAll(areas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							areaLogic.getAreasFK_IdEmpleadoSustituto(finalQueryGlobal,pagination,id_empleado_sustitutoFK_IdEmpleadoSustituto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AreaConstantesFunciones.getDetalleIndiceFK_IdEmpleadoSustituto(id_empleado_sustitutoFK_IdEmpleadoSustituto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AreaConstantesFunciones.getDetalleIndiceFK_IdEmpleadoSustituto(id_empleado_sustitutoFK_IdEmpleadoSustituto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAreas("FK_IdEmpleadoSustituto",areaLogic.getAreas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAreas("FK_IdEmpleadoSustituto",areas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						areaLogic.setAreas(new ArrayList<Area>());
						areaLogic.getAreas().addAll(areasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							areas=new ArrayList<Area>();
							areas.addAll(areasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=AreaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					areaLogic.getAreasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AreaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AreaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=areaLogic.getAreas()==null||areaLogic.getAreas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=areas==null|| areas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						areasAux=new ArrayList<Area>();
						areasAux.addAll(areaLogic.getAreas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							areasAux=new ArrayList<Area>();
							areasAux.addAll(areas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							areaLogic.getAreasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AreaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AreaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAreas("FK_IdEmpresa",areaLogic.getAreas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAreas("FK_IdEmpresa",areas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						areaLogic.setAreas(new ArrayList<Area>());
						areaLogic.getAreas().addAll(areasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							areas=new ArrayList<Area>();
							areas.addAll(areasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesArea();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessArea();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=areaLogic.getAreas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=areas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=areaLogic.getAreas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=areas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Area area) {
		Boolean permite=true;
		
		if(this.area.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=AreaConstantesFunciones.getOrderByListaArea();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=AreaConstantesFunciones.getOrderByListaArea();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Area area:areaLogic.getAreas()) {
				if(area.getsType().equals(Constantes2.S_TOTALES)) {
					areaTotales=area;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Area area:this.areas) {
				if(area.getsType().equals(Constantes2.S_TOTALES)) {
					areaTotales=area;
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
			this.areaAux=new Area();
			this.areaAux.setsType(Constantes2.S_TOTALES);
			this.areaAux.setIsNew(false);
			this.areaAux.setIsChanged(false);
			this.areaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				AreaConstantesFunciones.TotalizarValoresFilaArea(this.areaLogic.getAreas(),this.areaAux);
				
				this.areaLogic.getAreas().add(this.areaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				AreaConstantesFunciones.TotalizarValoresFilaArea(this.areas,this.areaAux);
				
				this.areas.add(this.areaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		areaTotales=new Area();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.areaLogic.getAreas().remove(areaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.areas.remove(areaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		areaTotales=new Area();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Area area:areaLogic.getAreas()) {
				if(area.getsType().equals(Constantes2.S_TOTALES)) {
					areaTotales=area;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AreaConstantesFunciones.TotalizarValoresFilaArea(this.areaLogic.getAreas(),areaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Area area:this.areas) {
				if(area.getsType().equals(Constantes2.S_TOTALES)) {
					areaTotales=area;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AreaConstantesFunciones.TotalizarValoresFilaArea(this.areas,areaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getAreasFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAreasFK_IdEmpleadoSustituto()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleadoSustituto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAreasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getAreasFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					areaLogic.getAreasFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAreasFK_IdEmpleadoSustituto(String sFinalQuery,Long id_empleado_sustituto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					areaLogic.getAreasFK_IdEmpleadoSustituto(sFinalQuery,this.pagination,id_empleado_sustituto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAreasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					areaLogic.getAreasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosArea() {
		this.isPermisoTodoArea=false;
		this.isPermisoNuevoArea=false;
		this.isPermisoActualizarArea=false;
		this.isPermisoActualizarOriginalArea=false;
		this.isPermisoEliminarArea=false;
		this.isPermisoGuardarCambiosArea=false;
		this.isPermisoConsultaArea=false;
		this.isPermisoBusquedaArea=false;
		this.isPermisoReporteArea=false;		
		this.isPermisoOrdenArea=false;		
		this.isPermisoPaginacionMedioArea=false;		
		this.isPermisoPaginacionAltoArea=false;
		this.isPermisoPaginacionTodoArea=false;
		this.isPermisoCopiarArea=false;		
		this.isPermisoVerFormArea=false;		
		this.isPermisoDuplicarArea=false;		
		this.isPermisoOrdenArea=false;		
	}
	
	public void setPermisosUsuarioArea(Boolean isPermiso) {
		this.isPermisoTodoArea=isPermiso;
		this.isPermisoNuevoArea=isPermiso;
		this.isPermisoActualizarArea=isPermiso;
		this.isPermisoActualizarOriginalArea=isPermiso;
		this.isPermisoEliminarArea=isPermiso;
		this.isPermisoGuardarCambiosArea=isPermiso;
		this.isPermisoConsultaArea=isPermiso;
		this.isPermisoBusquedaArea=isPermiso;
		this.isPermisoReporteArea=isPermiso;
		this.isPermisoOrdenArea=isPermiso;		
		this.isPermisoPaginacionMedioArea=isPermiso;		
		this.isPermisoPaginacionAltoArea=isPermiso;		
		this.isPermisoPaginacionTodoArea=isPermiso;		
		this.isPermisoCopiarArea=isPermiso;		
		this.isPermisoVerFormArea=isPermiso;		
		this.isPermisoDuplicarArea=isPermiso;
		this.isPermisoOrdenArea=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioArea(Boolean isPermiso) {
		//this.isPermisoTodoArea=isPermiso;
		this.isPermisoNuevoArea=isPermiso;
		this.isPermisoActualizarArea=isPermiso;
		this.isPermisoActualizarOriginalArea=isPermiso;
		this.isPermisoEliminarArea=isPermiso;
		this.isPermisoGuardarCambiosArea=isPermiso;
		//this.isPermisoConsultaArea=isPermiso;
		//this.isPermisoBusquedaArea=isPermiso;
		//this.isPermisoReporteArea=isPermiso;
		//this.isPermisoOrdenArea=isPermiso;		
		//this.isPermisoPaginacionMedioArea=isPermiso;		
		//this.isPermisoPaginacionAltoArea=isPermiso;		
		//this.isPermisoPaginacionTodoArea=isPermiso;		
		//this.isPermisoCopiarArea=isPermiso;		
		//this.isPermisoDuplicarArea=isPermiso;
		//this.isPermisoOrdenArea=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioAreaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(AreaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebArea(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioAreaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioAreaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionAreaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioAreaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioArea() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(AreaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.areaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, AreaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoArea=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarArea=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalArea=this.isPermisoActualizarArea;
			this.isPermisoEliminarArea=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosArea=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaArea=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaArea=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoArea=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteArea=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenArea=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioArea=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoArea=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoArea=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarArea=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormArea=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarArea=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenArea=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.areaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosArea.setToolTipText(this.jTableDatosArea.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioArea(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioArea(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(AreaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(AreaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioArea() throws Exception {
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
	public void inicializarCombosForeignKeyAreaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.empleadosustitutosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyAreaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(AreaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyAreaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoSustitutoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEmpleadoSustitutoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empleadosustitutosForeignKey==null||this.empleadosustitutosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpleadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpleadoSustitutosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyAreaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			AreaParameterReturnGeneral areaReturnGeneral=new AreaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.areaConstantesFunciones.cargarid_empresaArea)
					 || (this.esRecargarFks && this.areaConstantesFunciones.cargarid_empresaArea)) {

					if(!this.areaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+areaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.areaConstantesFunciones.cargarid_empleadoArea)
					 || (this.esRecargarFks && this.areaConstantesFunciones.cargarid_empleadoArea)) {

					if(!this.areaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+areaSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalEmpleadoSustituto="";

				if(((this.empleadosustitutosForeignKey==null||this.empleadosustitutosForeignKey.size()<=0) && this.areaConstantesFunciones.cargarid_empleado_sustitutoArea)
					 || (this.esRecargarFks && this.areaConstantesFunciones.cargarid_empleado_sustitutoArea)) {

					if(!this.areaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleadoSustituto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleadoSustituto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleadoSustituto=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleadoSustituto, "");
						finalQueryGlobalEmpleadoSustituto+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadoSustitutosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleadoSustituto=" WHERE " + ConstantesSql.ID + "="+areaSessionBean.getlidEmpleadoSustitutoActual();
					}
				} else {
					finalQueryGlobalEmpleadoSustituto="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				areaReturnGeneral=areaLogic.cargarCombosLoteForeignKeyArea(finalQueryGlobalEmpresa,finalQueryGlobalEmpleado,finalQueryGlobalEmpleadoSustituto);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=areaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=areaReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalEmpleadoSustituto.equals("NONE")) {
				this.empleadosustitutosForeignKey=areaReturnGeneral.getempleadosustitutosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyArea()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyEmpleadoSustituto();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.areaSessionBean==null) {
				this.areaSessionBean=new AreaSessionBean();
			}

			if(!this.areaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.areaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

	public void addItemDefectoCombosForeignKeyEmpleadoSustituto()throws Exception {
		try {

			if(!this.areaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleadoSustituto()) {
				Empleado empleadosustituto=new Empleado();
				EmpleadoConstantesFunciones.setEmpleadoDescripcion(empleadosustituto,Constantes.SMENSAJE_ESCOJA_OPCION);
				empleadosustituto.setId(null);

				if(!EmpleadoConstantesFunciones.ExisteEnLista(this.empleadosustitutosForeignKey,empleadosustituto,true)) {

					this.empleadosustitutosForeignKey.add(0,empleadosustituto);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyArea()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyArea(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyArea()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyArea();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyArea(Area area)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(area.getid_empleado(),false,"Formulario");
			this.setActualEmpleadoSustitutoForeignKey(area.getid_empleado_sustituto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyArea(Area area,String sTipoEvento)throws Exception {	
		try {
			
			

				if(area.getEmpleado()!=null && !sTipoEvento.equals("id_empleadoArea")) { //sTipoEvento Evita Bucle Infinito

					this.empleadosForeignKey=new ArrayList<Empleado>();
					this.empleadosForeignKey.add(area.getEmpleado());

					this.addItemDefectoCombosForeignKeyEmpleado();
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}

				if(area.getEmpleadoSustituto()!=null && !sTipoEvento.equals("id_empleado_sustitutoArea")) { //sTipoEvento Evita Bucle Infinito

					this.empleadosustitutosForeignKey=new ArrayList<Empleado>();
					this.empleadosustitutosForeignKey.add(area.getEmpleadoSustituto());

					this.addItemDefectoCombosForeignKeyEmpleadoSustituto();
					this.cargarCombosFrameEmpleadoSustitutosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyArea()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.areaConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualEmpleadoSustitutoForeignKey(this.areaConstantesFunciones.getid_empleado_sustituto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyArea()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyArea()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyArea()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroArea()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyArea()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameEmpleadoSustitutosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyArea(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadoSustitutosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyArea()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormArea.jComboBoxid_empresaArea!=null && this.jInternalFrameDetalleFormArea.jComboBoxid_empresaArea.getItemCount()>0) {
				this.jInternalFrameDetalleFormArea.jComboBoxid_empresaArea.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormArea.jComboBoxid_empleadoArea!=null && this.jInternalFrameDetalleFormArea.jComboBoxid_empleadoArea.getItemCount()>0) {
				this.jInternalFrameDetalleFormArea.jComboBoxid_empleadoArea.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormArea.jComboBoxid_empleado_sustitutoArea!=null && this.jInternalFrameDetalleFormArea.jComboBoxid_empleado_sustitutoArea.getItemCount()>0) {
				this.jInternalFrameDetalleFormArea.jComboBoxid_empleado_sustitutoArea.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public AreaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public AreaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public AreaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.areaSessionBean=new AreaSessionBean(); 
		this.areaConstantesFunciones=new AreaConstantesFunciones(); 
		this.areaBean=new Area();//(this.areaConstantesFunciones); 		
		this.areaReturnGeneral=new AreaParameterReturnGeneral(); 
		
		this.areaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.areaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public AreaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public AreaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public AreaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessArea(true);
			
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
			
			this.areaConstantesFunciones=new AreaConstantesFunciones(); 
			this.areaBean=new Area();//this.areaConstantesFunciones); 			
			this.areaReturnGeneral=new AreaParameterReturnGeneral(); 
		
			AreaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Area Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.area=new Area();
			this.areas = new ArrayList<Area>();
			this.areasAux = new ArrayList<Area>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic=new AreaLogic();
				this.areaLogic.getNewConnexionToDeep("");
			}
			
			//this.areaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.areaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormArea);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoArea!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoArea);	
					}
					
					if(this.jInternalFrameImportacionArea!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionArea);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByArea!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByArea);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormArea!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormArea);
				this.jInternalFrameDetalleFormArea.setVisible(false);
				this.jInternalFrameDetalleFormArea.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoArea!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoArea);
					this.jInternalFrameReporteDinamicoArea.setVisible(false);
					this.jInternalFrameReporteDinamicoArea.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionArea!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionArea);
					this.jInternalFrameImportacionArea.setVisible(false);
					this.jInternalFrameImportacionArea.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByArea!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByArea);
					this.jInternalFrameOrderByArea.setVisible(false);
					this.jInternalFrameOrderByArea.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idAreaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=AreaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.areaReturnGeneral=new AreaParameterReturnGeneral();
			
			this.areaParameterGeneral=new AreaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.areaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.areaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(AreaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.areaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AreaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.areaSessionBean.getEsGuardarRelacionado(),this.areaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AreaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.areaSessionBean.getEsGuardarRelacionado(),this.areaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoArea=false;
			this.isVisibilidadCeldaDuplicarArea=true;
			this.isVisibilidadCeldaCopiarArea=true;
			this.isVisibilidadCeldaVerFormArea=true;
			this.isVisibilidadCeldaOrdenArea=true;
			this.isVisibilidadCeldaNuevoRelacionesArea=false;
			this.isVisibilidadCeldaModificarArea=false;
			this.isVisibilidadCeldaActualizarArea=false;
			this.isVisibilidadCeldaEliminarArea=false;
			this.isVisibilidadCeldaCancelarArea=false;
			this.isVisibilidadCeldaGuardarArea=false;
			this.isVisibilidadCeldaGuardarCambiosArea=false;
			
			
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpleadoSustituto=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesArea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosArea();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioArea(false);
			
			this.setPermisosUsuarioArea();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.areaSessionBean.getEsGuardarRelacionado() 
				|| (this.areaSessionBean.getEsGuardarRelacionado() && this.areaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioAreaClasesRelacionadas();
			}
			
			if(this.areaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioAreaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!AreaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosArea();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualArea();
			}
			
			if(!this.isPermisoBusquedaArea) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasArea.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.areaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioArea,this.isPermisoPaginacionMedioArea,this.isPermisoPaginacionTodoArea);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(AreaConstantesFunciones.getTiposSeleccionarArea());
				
				this.tiposColumnasSelect=AreaConstantesFunciones.getTiposSeleccionarArea(true);
				
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
			//if(!this.areaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioArea();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioArea(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioArea(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesArea() ;
			
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
			this.empleadosustitutoLogic=new EmpleadoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				areaImplementable= (AreaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AreaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				areaImplementableHome= (AreaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AreaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.areas= new ArrayList<Area>();
			this.areasEliminados= new ArrayList<Area>();
						
			this.isEsNuevoArea=false;
			this.esParaAccionDesdeFormularioArea=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idEmpleadoActual=0L;
			this.idEmpleadoSustitutoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.empleadosustitutosForeignKey=new ArrayList<Empleado>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyArea(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroArea();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.areaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			AreaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=AreaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesArea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingArea(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormArea!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioArea();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioArea();
			}
			
			AreaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasArea.getTabCount(); i++) {
					this.jTabbedPaneBusquedasArea.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasArea.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessArea(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Area: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectArea() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesArea")) {
				iIndex=this.jInternalFrameDetalleFormArea.jTabbedPaneRelacionesArea.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormArea.jTabbedPaneRelacionesArea.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosArea.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessArea();	
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
	
	public void cargarCombosForeignKeyArea(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyArea(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyArea(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyAreaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyArea();
		
		this.cargarCombosFrameForeignKeyArea();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyArea();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyArea();
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

	public void cargarCombosForeignKeyEmpleadoSustituto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEmpleadoSustitutoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEmpleadoSustituto();
				this.cargarCombosFrameEmpleadoSustitutosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEmpleadoSustituto(this.empleadosustitutosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoAreaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.areaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormArea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
			
			
			if(jTableDatosArea.getRowCount()>=1) {
				jTableDatosArea.removeRowSelectionInterval(0, jTableDatosArea.getRowCount()-1);						
			}
			
			this.isEsNuevoArea=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoArea(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesArea(true);			
			//this.area=new Area();
			//this.area.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesArea(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualArea() ;
			
			if(AreaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleArea(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.area);	
			this.actualizarInformacion("INFO_PADRE",false,this.area);				
			
			AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
			
			if(this.areaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Area: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarAreaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Area> areasSeleccionados=new ArrayList<Area>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosArea.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosArea.getSelectedRows().length;			
			}
			
			areasSeleccionados=this.getAreasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoArea--;			
				//Area areaAux= new Area();			
				//areaAux.setId(this.iIdNuevoArea);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Area areaOrigen=new Area();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Area areaOrigen : areasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosArea.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							areaOrigen =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							areaOrigen =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaArea();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.area.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosArea(areaOrigen,this.area,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysArea(this.area);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.areaLogic.getAreas().add(this.areaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.areas.add(this.areaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaArea(false);
				
				this.jTableDatosArea.setRowSelectionInterval(this.getIndiceNuevoArea(), this.getIndiceNuevoArea());
				
				int iLastRow =  this.jTableDatosArea.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosArea.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosArea.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaArea(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarAreaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Area> areasSeleccionados=new ArrayList<Area>();									
		
			Area areaOrigen=new Area();
			Area areaDestino=new Area();
				
			areasSeleccionados=this.getAreasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosArea.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || areasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosArea.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						areaOrigen =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						areaOrigen =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						areaDestino =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						areaDestino =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				areaOrigen =areasSeleccionados.get(0);
				areaDestino =areasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosArea(areaOrigen,areaDestino,true,false);
				
				areaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(areaDestino,areaLogic.getAreas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(areaDestino,areas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaArea(false);
				
				//this.jTableDatosArea.setRowSelectionInterval(this.getIndiceNuevoArea(), this.getIndiceNuevoArea());
				
				int iLastRow =  this.jTableDatosArea.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosArea.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosArea.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaArea(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormAreaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormArea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormArea.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarAreaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesArea.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasArea.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesArea.setVisible(!isVisible);
			this.jPanelPaginacionArea.setVisible(!isVisible);
			this.jPanelAccionesArea.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarAreaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameArea();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoAreaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoArea();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionAreaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionArea();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByAreaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByArea();
			
			this.abrirFrameOrderByArea();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByAreaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByArea();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleArea(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormArea);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormArea.isMaximum()) {
					this.jInternalFrameDetalleFormArea.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormArea.setSize(this.jInternalFrameDetalleFormArea.iWidthFormulario,this.jInternalFrameDetalleFormArea.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormArea.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormArea.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormArea.isMaximum()) {
						this.jInternalFrameDetalleFormArea.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormArea.jContentPaneDetalleArea.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormArea.jTabbedPaneRelacionesArea.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormArea.jContentPaneDetalleArea.getWidth(),AreaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormArea.jTabbedPaneRelacionesArea.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormArea.jContentPaneDetalleArea.getWidth(),AreaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormArea.jTabbedPaneRelacionesArea.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormArea.jContentPaneDetalleArea.getWidth(),AreaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormArea.setVisible(true);
	        this.jInternalFrameDetalleFormArea.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByArea() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByArea==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByArea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByArea,false,this);
				} else {
					this.jInternalFrameOrderByArea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByArea,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByArea);
				this.jInternalFrameOrderByArea.setVisible(false);
				this.jInternalFrameOrderByArea.setSelected(false);
				
				this.jInternalFrameOrderByArea.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByArea"));
				
				this.inicializarActualizarBindingTablaOrderByArea();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionArea() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionArea==null) {
				
				this.jInternalFrameImportacionArea=new ImportacionJInternalFrame(AreaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionArea);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionArea);
				this.jInternalFrameImportacionArea.setVisible(false);
				this.jInternalFrameImportacionArea.setSelected(false);


				this.jInternalFrameImportacionArea.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionArea"));
				this.jInternalFrameImportacionArea.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionArea"));
				this.jInternalFrameImportacionArea.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionArea"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoArea() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoArea==null) {
				this.jInternalFrameReporteDinamicoArea=new ReporteDinamicoJInternalFrame(AreaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoArea);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoArea);
				this.jInternalFrameReporteDinamicoArea.setVisible(false);
				this.jInternalFrameReporteDinamicoArea.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoArea.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoArea"));
				this.jInternalFrameReporteDinamicoArea.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoArea"));
				this.jInternalFrameReporteDinamicoArea.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoArea"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualArea();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleArea() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormArea);
			
	       	this.jInternalFrameDetalleFormArea.setVisible(false);
	        this.jInternalFrameDetalleFormArea.setSelected(false);
			
			//this.jInternalFrameDetalleFormArea.dispose();
			//this.jInternalFrameDetalleFormArea=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoArea() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoArea.setVisible(true);
	        this.jInternalFrameReporteDinamicoArea.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionArea() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionArea.setVisible(true);
	        this.jInternalFrameImportacionArea.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByArea() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByArea.setVisible(true);
	        this.jInternalFrameOrderByArea.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByArea() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByArea.setVisible(false);
	        this.jInternalFrameOrderByArea.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoArea() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoArea.setVisible(false);
	        this.jInternalFrameReporteDinamicoArea.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionArea() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionArea.setVisible(false);
	        this.jInternalFrameImportacionArea.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarAreaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarArea(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarArea(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosArea.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesArea(true);
			//this.isEsNuevoArea=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.area =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.area =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesArea("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesArea(false) ;
			
			if(areaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(AreaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleArea(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualArea(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaAreaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosArea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.area =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.area =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarArea(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormArea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosArea.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesArea(true);
			//this.isEsNuevoArea=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.area =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.area =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.area.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesArea("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesArea(false) ;
			
			if(AreaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleArea(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualArea(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Empleado")) {
				if(!this.areaConstantesFunciones.cargarid_empleadoArea) {
					this.cargarCombosEmpleadosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingArea(false,false);
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_empleado (id);

				this.recargarComboTablaEmpleado(this.empleadosForeignKey);

			}
			
			if(sType.equals("EmpleadoSustituto")) {
				if(!this.areaConstantesFunciones.cargarid_empleado_sustitutoArea) {
					this.cargarCombosEmpleadoSustitutosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingArea(false,false);
					this.cargarCombosFrameEmpleadoSustitutosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_empleado_sustituto (id);

				this.recargarComboTablaEmpleadoSustituto(this.empleadosustitutosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosArea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosArea,AreaConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosArea.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEmpleadoSustituto(List<Empleado> empleadosustitutosForeignKey)throws Exception{
		TableColumn tableColumnEmpleadoSustituto=this.jTableDatosArea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosArea,AreaConstantesFunciones.LABEL_IDEMPLEADOSUSTITUTO));
		TableCellEditor tableCellEditorEmpleadoSustituto =tableColumnEmpleadoSustituto.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleadoSustituto;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosustitutosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosArea.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosustitutosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_empleado (Long id) throws Exception {
		this.setActualEmpleadoForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_empleado_sustituto (Long id) throws Exception {
		this.setActualEmpleadoSustitutoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarAreaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesArea(false);
			
			//if(!this.isEsNuevoArea) {								
				int intSelectedRow = this.jTableDatosArea.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.area =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.area =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(AreaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualArea(this.area,true);
				this.setVariablesFormularioToObjetoActualForeignKeysArea(this.area);
				
			}
			
			if(this.permiteMantenimiento(this.area)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.areaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoArea=true;
					this.inicializarActualizarBindingTablaArea(false);
					this.isEsNuevoArea=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoArea=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoArea=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesArea(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualArea(false);
				
				this.habilitarDeshabilitarControlesArea(false);
			
												
				
				if(AreaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleArea();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoAreaActionPerformed(evt,areaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualArea(this.area,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosArea.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,areaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.area.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Area.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Area.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarAreaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosArea.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.area =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
				this.area.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.area =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
				this.area.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.area)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.areaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((AreaModel) this.jTableDatosArea.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoArea=true;
				this.inicializarActualizarBindingTablaArea(false);
				this.isEsNuevoArea=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesArea(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualArea(false);
				
				this.habilitarDeshabilitarControlesArea(false);
				
				
				
				if(AreaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleArea();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarAreaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosArea.getRowCount()>=1) {
				jTableDatosArea.removeRowSelectionInterval(0, jTableDatosArea.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesArea(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaArea(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesArea(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualArea(false) ;
			
			this.isEsNuevoArea=false;
			
			if(AreaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleArea();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosAreaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingArea(false);
				
				//SI ES MANUAL
				if(AreaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualArea();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosAreaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoArea--;			
			//Area areaAux= new Area();			
			//areaAux.setId(this.iIdNuevoArea);
			
			if(this.jInternalFrameDetalleFormArea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaArea();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysArea(this.area);
			
			this.area.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.areaLogic.getAreas().add(this.areaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.areas.add(this.areaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaArea(false);
			
			this.jTableDatosArea.setRowSelectionInterval(this.getIndiceNuevoArea(), this.getIndiceNuevoArea());
			
			int iLastRow =  this.jTableDatosArea.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosArea.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosArea.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaArea(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionAreaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingArea(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingArea(false);
			
			//SI ES MANUAL
			if(AreaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualArea();
			}
			
			//this.abrirFrameTreeArea();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionAreaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE AreaS ?", "MANTENIMIENTO DE Area", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionArea.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralArea();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.areaReturnGeneral=areaLogic.procesarImportacionAreasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.areaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarAreaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionAreaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionArea.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionArea.setFileImportacion(this.jInternalFrameImportacionArea.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionArea.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionArea.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionArea.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionArea.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoAreaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Area> areasSeleccionados=new ArrayList<Area>();		

		areasSeleccionados=this.getAreasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoArea.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoArea.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("AreaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"AreaBaseDesign.jrxml";
			
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
			
			this.generarReporteAreas("Todos",areasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.areaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Area",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoArea.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoArea.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AreaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AreaConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AreaConstantesFunciones.LABEL_IDEMPLEADOSUSTITUTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EmpleadoSustituto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EmpleadoSustituto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EmpleadoSustituto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EmpleadoSustituto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AreaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AreaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AreaConstantesFunciones.LABEL_SECUENCIALPEDIDO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cuencialPedido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cuencialPedido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cuencialPedido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cuencialPedido_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AreaConstantesFunciones.LABEL_SECUENCIALCOTIZACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cuencialCotizacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cuencialCotizacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cuencialCotizacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cuencialCotizacion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoArea.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoArea.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoArea.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case AreaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case AreaConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case AreaConstantesFunciones.LABEL_IDEMPLEADOSUSTITUTO:
					sNombreCampoCategoria="id_empleado_sustituto";
					break;

				case AreaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case AreaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case AreaConstantesFunciones.LABEL_SECUENCIALPEDIDO:
					sNombreCampoCategoria="secuencial_pedido";
					break;

				case AreaConstantesFunciones.LABEL_SECUENCIALCOTIZACION:
					sNombreCampoCategoria="secuencial_cotizacion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoArea.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case AreaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case AreaConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case AreaConstantesFunciones.LABEL_IDEMPLEADOSUSTITUTO:
					sNombreCampoCategoriaValor="id_empleado_sustituto";
					break;

				case AreaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case AreaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case AreaConstantesFunciones.LABEL_SECUENCIALPEDIDO:
					sNombreCampoCategoriaValor="secuencial_pedido";
					break;

				case AreaConstantesFunciones.LABEL_SECUENCIALCOTIZACION:
					sNombreCampoCategoriaValor="secuencial_cotizacion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoArea.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoArea.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AreaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case AreaConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case AreaConstantesFunciones.LABEL_IDEMPLEADOSUSTITUTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado Sustituto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado_sustituto");
					break;

				case AreaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case AreaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case AreaConstantesFunciones.LABEL_SECUENCIALPEDIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Secuencial Pedido",sNombreCampoCategoria,sNombreCampoCategoriaValor,"secuencial_pedido");
					break;

				case AreaConstantesFunciones.LABEL_SECUENCIALCOTIZACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Secuencial Cotizacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"secuencial_cotizacion");
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
	
	public void jButtonGenerarExcelReporteDinamicoAreaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Area> areasSeleccionados=new ArrayList<Area>();		
		
		areasSeleccionados=this.getAreasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"area";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Areas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoArea.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoArea.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case AreaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AreaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Area area:areasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(area.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AreaConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AreaConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(Area area:areasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(area.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AreaConstantesFunciones.LABEL_IDEMPLEADOSUSTITUTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AreaConstantesFunciones.LABEL_IDEMPLEADOSUSTITUTO);
					iRow++;

					for(Area area:areasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(area.getempleadosustituto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AreaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AreaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Area area:areasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(area.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AreaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AreaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Area area:areasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(area.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AreaConstantesFunciones.LABEL_SECUENCIALPEDIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AreaConstantesFunciones.LABEL_SECUENCIALPEDIDO);
					iRow++;

					for(Area area:areasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(area.getsecuencial_pedido());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AreaConstantesFunciones.LABEL_SECUENCIALCOTIZACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AreaConstantesFunciones.LABEL_SECUENCIALCOTIZACION);
					iRow++;

					for(Area area:areasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(area.getsecuencial_cotizacion());
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
			//	this.getFilaCabeceraExportarExcelArea(row);				
			//	iRow++;
			//}				
			
			//for(Area areaAux:areasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelArea(areaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.areaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Area",JOptionPane.INFORMATION_MESSAGE);
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
				this.areaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingArea(false);
			
			//SI ES MANUAL
			if(AreaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualArea();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresAreaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingArea(false);
			
			//SI ES MANUAL
			if(AreaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualArea();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesAreaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingArea(false);
			
			//SI ES MANUAL
			if(AreaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualArea();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaArea() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosArea.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosArea.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosArea.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosArea.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosArea.setMinimumSize(dimensionMinimum);
		this.jTableDatosArea.setMaximumSize(dimensionMaximum);
		this.jTableDatosArea.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingArea(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingArea(esInicializar,true);
	}
	
	public void inicializarActualizarBindingArea(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaArea(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesArea(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.areaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasArea(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesArea(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesArea(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !AreaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!AreaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualArea() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaArea();
		
		this.inicializarActualizarBindingBotonesManualArea(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.areaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualArea();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesArea() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualArea(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualArea(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosArea.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosArea.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteArea.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormArea!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormArea.jCheckBoxPostAccionNuevoArea.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormArea.jCheckBoxPostAccionSinCerrarArea.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormArea.jCheckBoxPostAccionSinMensajeArea.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosArea.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosArea.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteArea.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormArea!=null) {
				this.jInternalFrameDetalleFormArea.jCheckBoxPostAccionNuevoArea.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormArea.jCheckBoxPostAccionSinCerrarArea.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormArea.jCheckBoxPostAccionSinMensajeArea.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionArea.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionArea.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormArea!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormArea.jComboBoxTiposAccionesFormularioArea.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesArea.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoArea!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoArea.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesArea.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesArea.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarArea.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesArea.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoArea!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoArea.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesArea.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralArea.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesArea(Boolean esInicializar) throws Exception {
		try	{	
			if(AreaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualArea(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesArea() throws Exception {
		try	{
			if(AreaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualArea();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleArea() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormArea.jComboBoxTiposAccionesFormularioArea.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormArea.jComboBoxTiposAccionesFormularioArea.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualArea() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesArea.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesArea.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesArea.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesArea.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesArea.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesArea.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionArea.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionArea.addItem(reporte);
			}
			
			
			if(!this.areaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionArea.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionArea.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesArea.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesArea.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesArea.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesArea.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormArea!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormArea.jComboBoxTiposAccionesFormularioArea.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormArea.jComboBoxTiposAccionesFormularioArea.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarArea.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarArea.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarArea.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualArea();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualArea() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoArea!=null) {
				this.jInternalFrameReporteDinamicoArea.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoArea.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoArea!=null) {
				this.jInternalFrameReporteDinamicoArea.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoArea.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoArea!=null) {
				
				if(this.jInternalFrameReporteDinamicoArea.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoArea.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoArea.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoArea.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoArea.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoArea.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualArea()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoArea.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoArea.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleado_sustitutoFK_IdEmpleadoSustitutoArea.getSelectedItem()!=null){this.id_empleado_sustitutoFK_IdEmpleadoSustituto=((Empleado)this.jComboBoxid_empleado_sustitutoFK_IdEmpleadoSustitutoArea.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasArea(Boolean esInicializar) throws Exception {				
		if(AreaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualArea();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaArea() throws Exception {
		this.inicializarActualizarBindingTablaArea(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByArea() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByArea.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByArea.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByArea.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new AreaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByArea.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByArea.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new AreaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosAreaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAreaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new AreaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByArea.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByArea.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new AreaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByArea.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaArea(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=areaLogic.getAreas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=areas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(AreaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosArea.setModel(new AreaModel(this.areaLogic.getAreas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosArea.setModel(new AreaModel(this.areas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByArea!=null && this.jInternalFrameOrderByArea.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByArea();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosArea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosArea,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new AreaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+AreaConstantesFunciones.SCLASSWEBTITULO,areaConstantesFunciones.resaltarSeleccionarArea,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+AreaConstantesFunciones.SCLASSWEBTITULO,areaConstantesFunciones.resaltarSeleccionarArea,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosArea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosArea,AreaConstantesFunciones.LABEL_ID));

		if(this.areaConstantesFunciones.mostraridArea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AreaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.areaConstantesFunciones.resaltaridArea,this.areaConstantesFunciones.activaridArea,this,true,"idArea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.areaConstantesFunciones.resaltaridArea,this.areaConstantesFunciones.activaridArea,this,true,"idArea","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosArea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosArea,AreaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.areaConstantesFunciones.mostrarid_empresaArea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AreaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.areaConstantesFunciones.resaltarid_empresaArea,this,this.areaConstantesFunciones.activarid_empresaArea));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.areaConstantesFunciones.resaltarid_empresaArea,this,this.areaConstantesFunciones.activarid_empresaArea,false,"id_empresaArea","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AreaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosArea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosArea,AreaConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.areaConstantesFunciones.mostrarid_empleadoArea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AreaConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.areaConstantesFunciones.resaltarid_empleadoArea,this,this.areaConstantesFunciones.activarid_empleadoArea));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.areaConstantesFunciones.resaltarid_empleadoArea,this,this.areaConstantesFunciones.activarid_empleadoArea,true,"id_empleadoArea","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new AreaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosArea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosArea,AreaConstantesFunciones.LABEL_IDEMPLEADOSUSTITUTO));

		if(this.areaConstantesFunciones.mostrarid_empleado_sustitutoArea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AreaConstantesFunciones.LABEL_IDEMPLEADOSUSTITUTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosustitutosForeignKey,this.areaConstantesFunciones.resaltarid_empleado_sustitutoArea,this,this.areaConstantesFunciones.activarid_empleado_sustitutoArea));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosustitutosForeignKey,this.areaConstantesFunciones.resaltarid_empleado_sustitutoArea,this,this.areaConstantesFunciones.activarid_empleado_sustitutoArea,true,"id_empleado_sustitutoArea","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new AreaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosArea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosArea,AreaConstantesFunciones.LABEL_CODIGO));

		if(this.areaConstantesFunciones.mostrarcodigoArea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AreaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.areaConstantesFunciones.resaltarcodigoArea,this.areaConstantesFunciones.activarcodigoArea,this,true,"codigoArea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.areaConstantesFunciones.resaltarcodigoArea,this.areaConstantesFunciones.activarcodigoArea,this,true,"codigoArea","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AreaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosArea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosArea,AreaConstantesFunciones.LABEL_NOMBRE));

		if(this.areaConstantesFunciones.mostrarnombreArea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AreaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.areaConstantesFunciones.resaltarnombreArea,this.areaConstantesFunciones.activarnombreArea,this,true,"nombreArea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.areaConstantesFunciones.resaltarnombreArea,this.areaConstantesFunciones.activarnombreArea,this,true,"nombreArea","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AreaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosArea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosArea,AreaConstantesFunciones.LABEL_SECUENCIALPEDIDO));

		if(this.areaConstantesFunciones.mostrarsecuencial_pedidoArea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AreaConstantesFunciones.LABEL_SECUENCIALPEDIDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.areaConstantesFunciones.resaltarsecuencial_pedidoArea,this.areaConstantesFunciones.activarsecuencial_pedidoArea,this,true,"secuencial_pedidoArea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.areaConstantesFunciones.resaltarsecuencial_pedidoArea,this.areaConstantesFunciones.activarsecuencial_pedidoArea,this,true,"secuencial_pedidoArea","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AreaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosArea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosArea,AreaConstantesFunciones.LABEL_SECUENCIALCOTIZACION));

		if(this.areaConstantesFunciones.mostrarsecuencial_cotizacionArea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AreaConstantesFunciones.LABEL_SECUENCIALCOTIZACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.areaConstantesFunciones.resaltarsecuencial_cotizacionArea,this.areaConstantesFunciones.activarsecuencial_cotizacionArea,this,true,"secuencial_cotizacionArea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.areaConstantesFunciones.resaltarsecuencial_cotizacionArea,this.areaConstantesFunciones.activarsecuencial_cotizacionArea,this,true,"secuencial_cotizacionArea","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AreaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.areaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.areaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.areaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosArea.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.areaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.areaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosArea.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarArea && this.isPermisoGuardarCambiosArea) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.areaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.areaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosArea.addColumn(tableColumn);
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
			
			this.jTableDatosArea.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarArea && this.isPermisoGuardarCambiosArea) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarArea && this.isPermisoGuardarCambiosArea) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosArea.moveColumn(this.jTableDatosArea.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosArea.moveColumn(this.jTableDatosArea.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosArea.moveColumn(this.jTableDatosArea.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosArea.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosArea.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosArea,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!AreaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosArea.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosArea.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!AreaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!AreaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosArea.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosArea.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosArea.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=areaLogic.getAreas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=areas.size()-1;
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
		//this.jTableDatosArea.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosArea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosArea();
			
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
				
				//this.isEsNuevoArea=false;
					
				AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
			
				if(this.areaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormArea==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosArea.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosArea.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.area =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.area =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.area.getsType().equals("DUPLICADO")
				   || this.area.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoArea=true;
				
				} else {
					this.isEsNuevoArea=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.areaSessionBean.getEsGuardarRelacionado()) {
					if(this.area.getId()>=0 && !this.area.getIsNew()) {						
						this.isEsNuevoArea=false;
						
					} else {
						this.isEsNuevoArea=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoArea(esRelaciones);						
				
				this.seleccionarArea(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.area.getId()<0) {
					this.isEsNuevoArea=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarArea(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarArea(evt,rowIndex);
				}	
				
				if(this.areaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Area: " + this.dDif); 
					}
				}								
				
				AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarArea(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.area)) {
					if(this.area.getId()>0) {
						this.area.setIsDeleted(true);
						
						this.areasEliminados.add(this.area);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.areaLogic.getAreas().remove(this.area);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.areas.remove(this.area);				
					}
					
					
					((AreaModel) this.jTableDatosArea.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaArea(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarArea(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoArea) {
			
			if(this.jInternalFrameDetalleFormArea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosArea.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosArea.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.area =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.area =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(AreaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioArea(this.area);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.areaConstantesFunciones.cargarid_empresaArea || this.areaConstantesFunciones.event_dependid_empresaArea) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.area.getid_empresa());
									//this.inicializarActualizarBindingArea(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(area.getEmpresa()!=null) {
							this.empresasForeignKey.add(area.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.area.getid_empresa(),false,"Formulario");

					//Empleado
					if(!this.areaConstantesFunciones.cargarid_empleadoArea || this.areaConstantesFunciones.event_dependid_empleadoArea) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.area.getid_empleado());
									//this.inicializarActualizarBindingArea(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(area.getEmpleado()!=null) {
							this.empleadosForeignKey.add(area.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.area.getid_empleado(),false,"Formulario");

					//EmpleadoSustituto
					if(!this.areaConstantesFunciones.cargarid_empleado_sustitutoArea || this.areaConstantesFunciones.event_dependid_empleado_sustitutoArea) {
						//this.cargarCombosEmpleadoSustitutosForeignKeyLista(" where id="+this.area.getid_empleado_sustituto());
									//this.inicializarActualizarBindingArea(false,false);
						this.empleadosustitutosForeignKey=new ArrayList<Empleado>();

						if(area.getEmpleadoSustituto()!=null) {
							this.empleadosustitutosForeignKey.add(area.getEmpleadoSustituto());
						}

						this.addItemDefectoCombosForeignKeyEmpleadoSustituto();
						this.cargarCombosFrameEmpleadoSustitutosForeignKey("Todos");
					}
					this.setActualEmpleadoSustitutoForeignKey(this.area.getid_empleado_sustituto(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesArea("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesArea(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualArea() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoArea(Area area) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoArea(area,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoArea(Area area,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioArea(area);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyArea(area,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyArea(area);
	}
	
	public void setVariablesObjetoActualToFormularioArea(Area area) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormArea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormArea.jLabelidArea.setText(area.getId().toString());
			this.jInternalFrameDetalleFormArea.jTextFieldcodigoArea.setText(area.getcodigo());
			this.jInternalFrameDetalleFormArea.jTextAreanombreArea.setText(area.getnombre());
			this.jInternalFrameDetalleFormArea.jTextFieldsecuencial_pedidoArea.setText(area.getsecuencial_pedido());
			this.jInternalFrameDetalleFormArea.jTextFieldsecuencial_cotizacionArea.setText(area.getsecuencial_cotizacion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Area areaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,areaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Area areaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				areaLocal=this.area;
			} else {
				areaLocal=this.areaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(areaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoArea(areaLocal,true);
					
					if(areaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(areaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.areaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(areaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoArea(Area area,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualArea(area,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysArea(area);
	}
	
	public void setVariablesFormularioToObjetoActualArea(Area area,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualArea(area,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualArea(Area area,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormArea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormArea.jLabelidArea.getText()==null || this.jInternalFrameDetalleFormArea.jLabelidArea.getText()=="" || this.jInternalFrameDetalleFormArea.jLabelidArea.getText()=="Id") {
				this.jInternalFrameDetalleFormArea.jLabelidArea.setText("0");
			}

			if(conColumnasBase) {area.setId(Long.parseLong(this.jInternalFrameDetalleFormArea.jLabelidArea.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AreaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormArea.jLabelIdArea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			area.setcodigo(this.jInternalFrameDetalleFormArea.jTextFieldcodigoArea.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AreaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormArea.jLabelcodigoArea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			area.setnombre(this.jInternalFrameDetalleFormArea.jTextAreanombreArea.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AreaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormArea.jLabelnombreArea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			area.setsecuencial_pedido(this.jInternalFrameDetalleFormArea.jTextFieldsecuencial_pedidoArea.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AreaConstantesFunciones.LABEL_SECUENCIALPEDIDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormArea.jLabelsecuencial_pedidoArea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			area.setsecuencial_cotizacion(this.jInternalFrameDetalleFormArea.jTextFieldsecuencial_cotizacionArea.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AreaConstantesFunciones.LABEL_SECUENCIALCOTIZACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormArea.jLabelsecuencial_cotizacionArea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualArea(Area areaBean,Area area,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && areaBean.getid_empleado()!=null && !areaBean.getid_empleado().equals(-1L))) {area.setid_empleado(areaBean.getid_empleado());}
			if(conDefault || (!conDefault && areaBean.getid_empleado_sustituto()!=null && !areaBean.getid_empleado_sustituto().equals(-1L))) {area.setid_empleado_sustituto(areaBean.getid_empleado_sustituto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosArea(Area areaOrigen,Area area,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && areaOrigen.getId()!=null && !areaOrigen.getId().equals(0L))) {area.setId(areaOrigen.getId());}}
			if(conDefault || (!conDefault && areaOrigen.getid_empleado()!=null && !areaOrigen.getid_empleado().equals(-1L))) {area.setid_empleado(areaOrigen.getid_empleado());}
			if(conDefault || (!conDefault && areaOrigen.getid_empleado_sustituto()!=null && !areaOrigen.getid_empleado_sustituto().equals(-1L))) {area.setid_empleado_sustituto(areaOrigen.getid_empleado_sustituto());}
			if(conDefault || (!conDefault && areaOrigen.getcodigo()!=null && !areaOrigen.getcodigo().equals(""))) {area.setcodigo(areaOrigen.getcodigo());}
			if(conDefault || (!conDefault && areaOrigen.getnombre()!=null && !areaOrigen.getnombre().equals(""))) {area.setnombre(areaOrigen.getnombre());}
			if(conDefault || (!conDefault && areaOrigen.getsecuencial_pedido()!=null && !areaOrigen.getsecuencial_pedido().equals(""))) {area.setsecuencial_pedido(areaOrigen.getsecuencial_pedido());}
			if(conDefault || (!conDefault && areaOrigen.getsecuencial_cotizacion()!=null && !areaOrigen.getsecuencial_cotizacion().equals(""))) {area.setsecuencial_cotizacion(areaOrigen.getsecuencial_cotizacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioArea(Area area) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormArea.jLabelidArea.setText(area.getId().toString());
			this.jInternalFrameDetalleFormArea.jTextFieldcodigoArea.setText(area.getcodigo());
			this.jInternalFrameDetalleFormArea.jTextAreanombreArea.setText(area.getnombre());
			this.jInternalFrameDetalleFormArea.jTextFieldsecuencial_pedidoArea.setText(area.getsecuencial_pedido());
			this.jInternalFrameDetalleFormArea.jTextFieldsecuencial_cotizacionArea.setText(area.getsecuencial_cotizacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioArea(AreaBean areaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormArea.jLabelidArea.setText(areaBean.getId().toString());
			this.jInternalFrameDetalleFormArea.jTextFieldcodigoArea.setText(areaBean.getcodigo());
			this.jInternalFrameDetalleFormArea.jTextAreanombreArea.setText(areaBean.getnombre());
			this.jInternalFrameDetalleFormArea.jTextFieldsecuencial_pedidoArea.setText(areaBean.getsecuencial_pedido());
			this.jInternalFrameDetalleFormArea.jTextFieldsecuencial_cotizacionArea.setText(areaBean.getsecuencial_cotizacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanArea(AreaParameterReturnGeneral areaReturnGeneral,AreaBean areaBean,Boolean conDefault) throws Exception { 
		try {
			Area areaLocal=new Area();
			
			areaLocal=areaReturnGeneral.getArea();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && areaLocal.getId()!=null && !areaLocal.getId().equals(0L))) {areaBean.setId(areaLocal.getId());}}
			if(conDefault || (!conDefault && areaLocal.getid_empleado()!=null && !areaLocal.getid_empleado().equals(-1L))) {areaBean.setid_empleado(areaLocal.getid_empleado());}
			if(conDefault || (!conDefault && areaLocal.getid_empleado_sustituto()!=null && !areaLocal.getid_empleado_sustituto().equals(-1L))) {areaBean.setid_empleado_sustituto(areaLocal.getid_empleado_sustituto());}
			if(conDefault || (!conDefault && areaLocal.getcodigo()!=null && !areaLocal.getcodigo().equals(""))) {areaBean.setcodigo(areaLocal.getcodigo());}
			if(conDefault || (!conDefault && areaLocal.getnombre()!=null && !areaLocal.getnombre().equals(""))) {areaBean.setnombre(areaLocal.getnombre());}
			if(conDefault || (!conDefault && areaLocal.getsecuencial_pedido()!=null && !areaLocal.getsecuencial_pedido().equals(""))) {areaBean.setsecuencial_pedido(areaLocal.getsecuencial_pedido());}
			if(conDefault || (!conDefault && areaLocal.getsecuencial_cotizacion()!=null && !areaLocal.getsecuencial_cotizacion().equals(""))) {areaBean.setsecuencial_cotizacion(areaLocal.getsecuencial_cotizacion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxAreaGenerico(Long idAreaSeleccionado,JComboBox jComboBoxArea,List<Area> areasLocal)throws Exception {
		try {
			Area  areaTemp=null;

			for(Area areaAux:areasLocal) {
				if(areaAux.getId()!=null && areaAux.getId().equals(idAreaSeleccionado)) {
					areaTemp=areaAux;
					break;
				}
			}

			jComboBoxArea.setSelectedItem(areaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxAreaGenerico(JComboBox jComboBoxArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxArea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxArea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxArea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxArea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxArea.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxArea.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxArea.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxArea.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxArea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxArea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			area=(Area) areaLogic.getAreas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			area =(Area) areas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!area.getIsNew() && !area.getIsChanged() && !area.getIsDeleted()) {
				sDescripcion=area.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=area.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!area.getIsNew() && !area.getIsChanged() && !area.getIsDeleted()) {
				sDescripcion=area.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=area.getempleado_descripcion();
			}
		}

		if(sTipo.equals("EmpleadoSustituto")) {
			//sDescripcion=this.getActualEmpleadoSustitutoForeignKeyDescripcion((Long)value);
			if(!area.getIsNew() && !area.getIsChanged() && !area.getIsDeleted()) {
				sDescripcion=area.getempleadosustituto_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoSustitutoForeignKeyDescripcion((Long)value);
				sDescripcion=area.getempleadosustituto_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Area areaRow=new Area();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			areaRow=(Area) areaLogic.getAreas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			areaRow=(Area) areas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualArea(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoArea.setVisible((this.isVisibilidadCeldaNuevoArea && this.isPermisoNuevoArea));			
			this.jButtonDuplicarArea.setVisible((this.isVisibilidadCeldaDuplicarArea && this.isPermisoDuplicarArea));			
			this.jButtonCopiarArea.setVisible((this.isVisibilidadCeldaCopiarArea && this.isPermisoCopiarArea));
			this.jButtonVerFormArea.setVisible((this.isVisibilidadCeldaVerFormArea && this.isPermisoVerFormArea));
			
			this.jButtonAbrirOrderByArea.setVisible((this.isVisibilidadCeldaOrdenArea && this.isPermisoOrdenArea));			
			
			this.jButtonNuevoRelacionesArea.setVisible((this.isVisibilidadCeldaNuevoRelacionesArea && this.isPermisoNuevoArea));			
			this.jButtonNuevoGuardarCambiosArea.setVisible((this.isVisibilidadCeldaNuevoArea && this.isPermisoNuevoArea && this.isPermisoGuardarCambiosArea));
			
			if(this.jInternalFrameDetalleFormArea!=null) {
			this.jInternalFrameDetalleFormArea.jButtonModificarArea.setVisible((this.isVisibilidadCeldaModificarArea && this.isPermisoActualizarArea));	
			this.jInternalFrameDetalleFormArea.jButtonActualizarArea.setVisible((this.isVisibilidadCeldaActualizarArea && this.isPermisoActualizarArea));	
			this.jInternalFrameDetalleFormArea.jButtonEliminarArea.setVisible((this.isVisibilidadCeldaEliminarArea && this.isPermisoEliminarArea));
			this.jInternalFrameDetalleFormArea.jButtonCancelarArea.setVisible(this.isVisibilidadCeldaCancelarArea);							
			this.jInternalFrameDetalleFormArea.jButtonGuardarCambiosArea.setVisible((this.isVisibilidadCeldaGuardarArea && this.isPermisoGuardarCambiosArea));			
			
			}
						
			this.jButtonGuardarCambiosTablaArea.setVisible((this.isVisibilidadCeldaGuardarCambiosArea && this.isPermisoGuardarCambiosArea));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarArea.setVisible((this.isVisibilidadCeldaNuevoArea && this.isPermisoNuevoArea));						
			this.jButtonDuplicarToolBarArea.setVisible((this.isVisibilidadCeldaDuplicarArea && this.isPermisoDuplicarArea));						
			this.jButtonCopiarToolBarArea.setVisible((this.isVisibilidadCeldaCopiarArea && this.isPermisoCopiarArea));			
			this.jButtonVerFormToolBarArea.setVisible((this.isVisibilidadCeldaVerFormArea && this.isPermisoVerFormArea));			
			this.jButtonAbrirOrderByToolBarArea.setVisible((this.isVisibilidadCeldaOrdenArea && this.isPermisoOrdenArea));
			this.jButtonNuevoRelacionesToolBarArea.setVisible((this.isVisibilidadCeldaNuevoRelacionesArea && this.isPermisoNuevoArea));			
			this.jButtonNuevoGuardarCambiosToolBarArea.setVisible((this.isVisibilidadCeldaNuevoArea && this.isPermisoNuevoArea && this.isPermisoGuardarCambiosArea));			
			
			if(this.jInternalFrameDetalleFormArea!=null) {
			this.jInternalFrameDetalleFormArea.jButtonModificarToolBarArea.setVisible((this.isVisibilidadCeldaModificarArea && this.isPermisoActualizarArea));	
			this.jInternalFrameDetalleFormArea.jButtonActualizarToolBarArea.setVisible((this.isVisibilidadCeldaActualizarArea  && this.isPermisoActualizarArea));	
			this.jInternalFrameDetalleFormArea.jButtonEliminarToolBarArea.setVisible((this.isVisibilidadCeldaEliminarArea && this.isPermisoEliminarArea));
			this.jInternalFrameDetalleFormArea.jButtonCancelarToolBarArea.setVisible(this.isVisibilidadCeldaCancelarArea);				
			this.jInternalFrameDetalleFormArea.jButtonGuardarCambiosToolBarArea.setVisible((this.isVisibilidadCeldaGuardarArea && this.isPermisoGuardarCambiosArea));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarArea.setVisible((this.isVisibilidadCeldaGuardarCambiosArea && this.isPermisoGuardarCambiosArea));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoArea.setVisible((this.isVisibilidadCeldaNuevoArea && this.isPermisoNuevoArea));			
			this.jMenuItemDuplicarArea.setVisible((this.isVisibilidadCeldaDuplicarArea && this.isPermisoDuplicarArea));			
			this.jMenuItemCopiarArea.setVisible((this.isVisibilidadCeldaCopiarArea && this.isPermisoCopiarArea));			
			this.jMenuItemVerFormArea.setVisible((this.isVisibilidadCeldaVerFormArea && this.isPermisoVerFormArea));			
			this.jMenuItemAbrirOrderByArea.setVisible((this.isVisibilidadCeldaOrdenArea && this.isPermisoOrdenArea));			
			//this.jMenuItemMostrarOcultarArea.setVisible((this.isVisibilidadCeldaOrdenArea && this.isPermisoOrdenArea));
			this.jMenuItemDetalleAbrirOrderByArea.setVisible((this.isVisibilidadCeldaOrdenArea && this.isPermisoOrdenArea));			
			//this.jMenuItemDetalleMostrarOcultarArea.setVisible((this.isVisibilidadCeldaOrdenArea && this.isPermisoOrdenArea));			
			this.jMenuItemNuevoRelacionesArea.setVisible((this.isVisibilidadCeldaNuevoRelacionesArea && this.isPermisoNuevoArea));			
			this.jMenuItemNuevoGuardarCambiosArea.setVisible((this.isVisibilidadCeldaNuevoArea && this.isPermisoNuevoArea && this.isPermisoGuardarCambiosArea));									
			
			if(this.jInternalFrameDetalleFormArea!=null) {
			this.jInternalFrameDetalleFormArea.jMenuItemModificarArea.setVisible((this.isVisibilidadCeldaModificarArea && this.isPermisoActualizarArea));	
			this.jInternalFrameDetalleFormArea.jMenuItemActualizarArea.setVisible((this.isVisibilidadCeldaActualizarArea && this.isPermisoActualizarArea));	
			this.jInternalFrameDetalleFormArea.jMenuItemEliminarArea.setVisible((this.isVisibilidadCeldaEliminarArea && this.isPermisoEliminarArea));
			this.jInternalFrameDetalleFormArea.jMenuItemCancelarArea.setVisible(this.isVisibilidadCeldaCancelarArea);				
			}
			
			this.jMenuItemGuardarCambiosArea.setVisible((this.isVisibilidadCeldaGuardarArea && this.isPermisoGuardarCambiosArea));						
			this.jMenuItemGuardarCambiosTablaArea.setVisible((this.isVisibilidadCeldaGuardarCambiosArea && this.isPermisoGuardarCambiosArea));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoArea=this.jButtonNuevoArea.isVisible();
			this.isVisibilidadCeldaDuplicarArea=this.jButtonDuplicarArea.isVisible();
			this.isVisibilidadCeldaCopiarArea=this.jButtonCopiarArea.isVisible();
			this.isVisibilidadCeldaVerFormArea=this.jButtonVerFormArea.isVisible();
			
			this.isVisibilidadCeldaOrdenArea=this.jButtonAbrirOrderByArea.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesArea=this.jButtonNuevoRelacionesArea.isVisible();
			this.isVisibilidadCeldaModificarArea=this.jButtonModificarArea.isVisible();
			
			if(this.jInternalFrameDetalleFormArea!=null) {
			this.isVisibilidadCeldaActualizarArea=this.jInternalFrameDetalleFormArea.jButtonActualizarArea.isVisible();
			this.isVisibilidadCeldaEliminarArea=this.jInternalFrameDetalleFormArea.jButtonEliminarArea.isVisible();
			this.isVisibilidadCeldaCancelarArea=this.jInternalFrameDetalleFormArea.jButtonCancelarArea.isVisible();
			this.isVisibilidadCeldaGuardarArea=this.jInternalFrameDetalleFormArea.jButtonGuardarCambiosArea.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosArea=this.jButtonGuardarCambiosTablaArea.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoArea=this.jButtonNuevoToolBarArea.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesArea=this.jButtonNuevoRelacionesToolBarArea.isVisible();
			
			if(this.jInternalFrameDetalleFormArea!=null) {
			this.isVisibilidadCeldaModificarArea=this.jInternalFrameDetalleFormArea.jButtonModificarToolBarArea.isVisible();
			this.isVisibilidadCeldaActualizarArea=this.jInternalFrameDetalleFormArea.jButtonActualizarToolBarArea.isVisible();
			this.isVisibilidadCeldaEliminarArea=this.jInternalFrameDetalleFormArea.jButtonEliminarToolBarArea.isVisible();
			this.isVisibilidadCeldaCancelarArea=this.jInternalFrameDetalleFormArea.jButtonCancelarToolBarArea.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarArea=this.jButtonGuardarCambiosToolBarArea.isVisible();
			this.isVisibilidadCeldaGuardarCambiosArea=this.jButtonGuardarCambiosTablaToolBarArea.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoArea=this.jMenuItemNuevoArea.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesArea=this.jMenuItemNuevoRelacionesArea.isVisible();
			
			if(this.jInternalFrameDetalleFormArea!=null) {
			this.isVisibilidadCeldaModificarArea=this.jInternalFrameDetalleFormArea.jMenuItemModificarArea.isVisible();
			this.isVisibilidadCeldaActualizarArea=this.jInternalFrameDetalleFormArea.jMenuItemActualizarArea.isVisible();
			this.isVisibilidadCeldaEliminarArea=this.jInternalFrameDetalleFormArea.jMenuItemEliminarArea.isVisible();
			this.isVisibilidadCeldaCancelarArea=this.jInternalFrameDetalleFormArea.jMenuItemCancelarArea.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarArea=this.jMenuItemGuardarCambiosArea.isVisible();
			this.isVisibilidadCeldaGuardarCambiosArea=this.jMenuItemGuardarCambiosTablaArea.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesArea(Boolean esInicializar) {
		if(AreaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.areaSessionBean.getConGuardarRelaciones()) {
				//if(this.areaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesArea();
			}
			
			this.inicializarActualizarBindingBotonesManualArea(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualArea() {
		this.jButtonNuevoArea.setVisible(this.isPermisoNuevoArea);			
		this.jButtonDuplicarArea.setVisible(this.isPermisoDuplicarArea);			
		this.jButtonCopiarArea.setVisible(this.isPermisoCopiarArea);			
		this.jButtonVerFormArea.setVisible(this.isPermisoVerFormArea);			
		
		this.jButtonAbrirOrderByArea.setVisible(this.isPermisoOrdenArea);					
		
		this.jButtonNuevoRelacionesArea.setVisible(this.isPermisoNuevoArea);			
		
		if(this.jInternalFrameDetalleFormArea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormArea.jButtonModificarArea.setVisible(this.isPermisoActualizarArea);	
			this.jInternalFrameDetalleFormArea.jButtonActualizarArea.setVisible(this.isPermisoActualizarArea);	
			this.jInternalFrameDetalleFormArea.jButtonEliminarArea.setVisible(this.isPermisoEliminarArea);
			this.jInternalFrameDetalleFormArea.jButtonCancelarArea.setVisible(this.isVisibilidadCeldaCancelarArea);						
			this.jInternalFrameDetalleFormArea.jButtonGuardarCambiosArea.setVisible(this.isPermisoGuardarCambiosArea);							
		}
		
		this.jButtonGuardarCambiosTablaArea.setVisible(this.isPermisoActualizarArea);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleArea() {
		this.jInternalFrameDetalleFormArea.jButtonModificarArea.setVisible(this.isPermisoActualizarArea);	
		this.jInternalFrameDetalleFormArea.jButtonActualizarArea.setVisible(this.isPermisoActualizarArea);	
		this.jInternalFrameDetalleFormArea.jButtonEliminarArea.setVisible(this.isPermisoEliminarArea);
		this.jInternalFrameDetalleFormArea.jButtonCancelarArea.setVisible(this.isVisibilidadCeldaCancelarArea);							
		this.jInternalFrameDetalleFormArea.jButtonGuardarCambiosArea.setVisible((this.isVisibilidadCeldaGuardarArea && this.isPermisoGuardarCambiosArea));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosArea() {
		if(AreaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualArea();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesArea() {
	}
	
	public void jTableDatosAreaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarArea(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidAreaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosArea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualArea(this.getarea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysArea(this.area);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.area =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.area =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.area==null) {
						this.area = new Area();
					}

					this.setVariablesFormularioToObjetoActualArea(this.area,true);
					this.setVariablesFormularioToObjetoActualForeignKeysArea(this.area);
				}

				if(this.area.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.area.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingArea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaAreaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebArea(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosArea.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosArea.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosArea.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.area =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.area =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualArea(this.getarea(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysArea(this.area);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.areaLogic.getConnexion());

				if(this.area.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.area.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderArea=(TitledBorder)this.jScrollPanelDatosArea.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderArea.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaAreaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosArea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualArea(this.getarea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysArea(this.area);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.area =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.area =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.area==null) {
						this.area = new Area();
					}

					this.setVariablesFormularioToObjetoActualArea(this.area,true);
					this.setVariablesFormularioToObjetoActualForeignKeysArea(this.area);
				}

				if(this.area.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.area.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingArea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoAreaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderArea=null;
			TitledBorder titledBorderempleado=null;

			if(!this.jScrollPanelDatosArea.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderArea=(TitledBorder)this.jScrollPanelDatosArea.getBorder();
				titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderArea.getTitle() + " -> Empleado");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_empleadoAreaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebArea(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosArea.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosArea.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosArea.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.area =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.area =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualArea(this.getarea(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysArea(this.area);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.areaLogic.getConnexion());

				if(this.area.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.area.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderArea=(TitledBorder)this.jScrollPanelDatosArea.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderArea.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoAreaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosArea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualArea(this.getarea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysArea(this.area);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.area =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.area =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.area==null) {
						this.area = new Area();
					}

					this.setVariablesFormularioToObjetoActualArea(this.area,true);
					this.setVariablesFormularioToObjetoActualForeignKeysArea(this.area);
				}

				if(this.area.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.area.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingArea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleado_sustitutoAreaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.empleadosustitutoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.empleadosustitutoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.empleadosustitutoBeanSwingJInternalFrame.sTipoBusqueda="EmpleadoSustituto";

			if(!this.sFinalQueryGeneral_empleadosustituto.equals("")) {
				this.empleadosustitutoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_empleadosustituto);
				this.empleadosustitutoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.empleadosustitutoBeanSwingJInternalFrame.procesarBusqueda(this.empleadosustitutoBeanSwingJInternalFrame.sAccionBusqueda);
				this.empleadosustitutoBeanSwingJInternalFrame.inicializarActualizarBindingEmpleado(false);
			}

			if(!this.sFinalQueryComboEmpleadoSustituto.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.empleadosustitutoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderArea=null;
			TitledBorder titledBorderempleadosustituto=null;

			if(!this.jScrollPanelDatosArea.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderArea=(TitledBorder)this.jScrollPanelDatosArea.getBorder();
				titledBorderempleadosustituto=(TitledBorder)this.empleadosustitutoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleadosustituto.setTitle(titledBorderArea.getTitle() + " -> Empleado");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_empleado_sustitutoAreaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleadosustituto=true;

			idTienePermisoempleadosustituto=this.tienePermisosUsuarioEnPaginaWebArea(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleadosustituto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosArea.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosArea.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosArea.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.area =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.area =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualArea(this.getarea(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysArea(this.area);

				this.empleadosustitutoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadosustitutoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadosustitutoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.areaLogic.getConnexion());

				if(this.area.getid_empleado_sustituto()!=null) {
					this.empleadosustitutoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadosustitutoBeanSwingJInternalFrame.setIdActual(this.area.getid_empleado_sustituto());
					this.empleadosustitutoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadosustitutoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadosustitutoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadosustitutoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderArea=(TitledBorder)this.jScrollPanelDatosArea.getBorder();
				TitledBorder titledBorderempleadosustituto=(TitledBorder)this.empleadosustitutoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleadosustituto.setTitle(titledBorderArea.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleado_sustitutoAreaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosArea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualArea(this.getarea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysArea(this.area);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.area =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.area =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.area==null) {
						this.area = new Area();
					}

					this.setVariablesFormularioToObjetoActualArea(this.area,true);
					this.setVariablesFormularioToObjetoActualForeignKeysArea(this.area);
				}

				if(this.area.getid_empleado_sustituto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado_sustituto = "+this.area.getid_empleado_sustituto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingArea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoAreaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosArea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualArea(this.getarea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysArea(this.area);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.area =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.area =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.area==null) {
						this.area = new Area();
					}

					this.setVariablesFormularioToObjetoActualArea(this.area,true);
					this.setVariablesFormularioToObjetoActualForeignKeysArea(this.area);
				}

				if(this.area.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.area.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingArea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreAreaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosArea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualArea(this.getarea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysArea(this.area);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.area =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.area =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.area==null) {
						this.area = new Area();
					}

					this.setVariablesFormularioToObjetoActualArea(this.area,true);
					this.setVariablesFormularioToObjetoActualForeignKeysArea(this.area);
				}

				if(this.area.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.area.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingArea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsecuencial_pedidoAreaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosArea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualArea(this.getarea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysArea(this.area);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.area =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.area =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.area==null) {
						this.area = new Area();
					}

					this.setVariablesFormularioToObjetoActualArea(this.area,true);
					this.setVariablesFormularioToObjetoActualForeignKeysArea(this.area);
				}

				if(this.area.getsecuencial_pedido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where secuencial_pedido like '%"+this.area.getsecuencial_pedido()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingArea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsecuencial_cotizacionAreaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosArea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualArea(this.getarea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysArea(this.area);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.area =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.area =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.area==null) {
						this.area = new Area();
					}

					this.setVariablesFormularioToObjetoActualArea(this.area,true);
					this.setVariablesFormularioToObjetoActualForeignKeysArea(this.area);
				}

				if(this.area.getsecuencial_cotizacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where secuencial_cotizacion like '%"+this.area.getsecuencial_cotizacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingArea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpleadoAreaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingArea(false,false);

			this.getAreasFK_IdEmpleado();

			this.inicializarActualizarBindingArea(false);

			//if(AreaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingArea(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoSustitutoAreaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingArea(false,false);

			this.getAreasFK_IdEmpleadoSustituto();

			this.inicializarActualizarBindingArea(false);

			//if(AreaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingArea(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaAreaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingArea(false,false);

			this.getAreasFK_IdEmpresa();

			this.inicializarActualizarBindingArea(false);

			//if(AreaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingArea(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameArea() {
		if(this.jInternalFrameDetalleFormArea!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormArea!=null) {
			this.jInternalFrameDetalleFormArea.setVisible(false);	    			
			this.jInternalFrameDetalleFormArea.dispose();
			this.jInternalFrameDetalleFormArea=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoArea!=null) {
			this.jInternalFrameReporteDinamicoArea.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoArea.dispose();
			this.jInternalFrameReporteDinamicoArea=null;
		}
		
		if(this.jInternalFrameImportacionArea!=null) {
			this.jInternalFrameImportacionArea.setVisible(false);	    			
			this.jInternalFrameImportacionArea.dispose();
			this.jInternalFrameImportacionArea=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessArea();
			
			AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
			
			
			if(sTipo.equals("NuevoArea")) {
				jButtonNuevoAreaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarArea")) {
				jButtonDuplicarAreaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarArea")) {
				jButtonCopiarAreaActionPerformed(evt);
			} else if(sTipo.equals("VerFormArea")) {
				jButtonVerFormAreaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarArea")) {
				jButtonNuevoAreaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarArea")) {
				jButtonDuplicarAreaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoArea")) {
				jButtonNuevoAreaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarArea")) {
				jButtonDuplicarAreaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesArea")) {
				jButtonNuevoAreaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarArea")) {
				jButtonNuevoAreaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesArea")) {
				jButtonNuevoAreaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarArea")) {
				jButtonModificarAreaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarArea")) {
				jButtonModificarAreaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarArea")) {
				jButtonModificarAreaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarArea")) {
				jButtonActualizarAreaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarArea")) {
				jButtonActualizarAreaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarArea")) {
				jButtonActualizarAreaActionPerformed(evt);
			} else if(sTipo.equals("EliminarArea")) {
				jButtonEliminarAreaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarArea")) {
				jButtonEliminarAreaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarArea")) {
				jButtonEliminarAreaActionPerformed(evt);
			} else if(sTipo.equals("CancelarArea")) {
				jButtonCancelarAreaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarArea")) {
				jButtonCancelarAreaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarArea")) {
				jButtonCancelarAreaActionPerformed(evt);
			} else if(sTipo.equals("CerrarArea")) {
				jButtonCerrarAreaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarArea")) {
				jButtonCerrarAreaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarArea")) {
				jButtonCerrarAreaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarArea")) {
				jButtonMostrarOcultarAreaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarArea")) {
				jButtonCancelarAreaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosArea")) {
				jButtonGuardarCambiosAreaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarArea")) {
				jButtonGuardarCambiosAreaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarArea")) {
				jButtonCopiarAreaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarArea")) {
				jButtonVerFormAreaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosArea")) {
				jButtonGuardarCambiosAreaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarArea")) {
				jButtonCopiarAreaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormArea")) {
				jButtonVerFormAreaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaArea")) {
				jButtonGuardarCambiosAreaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarArea")) {
				jButtonGuardarCambiosAreaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaArea")) {
				jButtonGuardarCambiosAreaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionArea")) {
				jButtonRecargarInformacionAreaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarArea")) {
				jButtonRecargarInformacionAreaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionArea")) {
				jButtonRecargarInformacionAreaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresArea")) {
				jButtonAnterioresAreaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarArea")) {
				jButtonAnterioresAreaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreArea")) {
				jButtonAnterioresAreaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesArea")) {
				jButtonSiguientesAreaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarArea")) {
				jButtonSiguientesAreaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesArea")) {
				jButtonSiguientesAreaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByArea") || sTipo.equals("MenuItemDetalleAbrirOrderByArea")) {
				jButtonAbrirOrderByAreaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarArea") || sTipo.equals("MenuItemDetalleMostrarOcultarArea")) {
				jButtonMostrarOcultarAreaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosArea")) {
				jButtonNuevoGuardarCambiosAreaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarArea")) {
				jButtonNuevoGuardarCambiosAreaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosArea")) {
				jButtonNuevoGuardarCambiosAreaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoArea")) {
				jButtonCerrarReporteDinamicoAreaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoArea")) {
				jButtonGenerarReporteDinamicoAreaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoArea")) {
				
				jButtonGenerarExcelReporteDinamicoAreaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionArea")) {
				jButtonCerrarImportacionAreaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionArea")) {
				
				jButtonGenerarImportacionAreaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionArea")) {
				
				jButtonAbrirImportacionAreaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesArea")) {
				jComboBoxTiposAccionesAreaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesArea")) {
				jComboBoxTiposRelacionesAreaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioArea")) {
				jComboBoxTiposAccionesAreaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarArea")) {
				
				jComboBoxTiposSeleccionarAreaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralArea")) {
				jTextFieldValorCampoGeneralAreaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByArea")) {
				jButtonAbrirOrderByAreaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarArea")) {
				jButtonAbrirOrderByAreaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByArea")) {
				jButtonCerrarOrderByAreaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAreaBusqueda")) {
				this.jButtonidAreaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaAreaUpdate")) {
				this.jButtonid_empresaAreaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaAreaBusqueda")) {
				this.jButtonid_empresaAreaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoArea")) {
				this.jButtonid_empleadoAreaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoAreaUpdate")) {
				this.jButtonid_empleadoAreaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoAreaBusqueda")) {
				this.jButtonid_empleadoAreaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleado_sustitutoArea")) {
				this.jButtonid_empleado_sustitutoAreaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleado_sustitutoAreaUpdate")) {
				this.jButtonid_empleado_sustitutoAreaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleado_sustitutoAreaBusqueda")) {
				this.jButtonid_empleado_sustitutoAreaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoAreaBusqueda")) {
				this.jButtoncodigoAreaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreAreaBusqueda")) {
				this.jButtonnombreAreaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencial_pedidoAreaBusqueda")) {
				this.jButtonsecuencial_pedidoAreaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencial_cotizacionAreaBusqueda")) {
				this.jButtonsecuencial_cotizacionAreaBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_empleadoArea")) {
				this.jButtonid_empleadoAreaActionPerformed(evt);
			}
			else if(sTipo.equals("id_empleado_sustitutoArea")) {
				this.jButtonid_empleado_sustitutoAreaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdEmpleadoArea")) {
				this.jButtonFK_IdEmpleadoAreaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEmpleadoSustitutoArea")) {
				this.jButtonFK_IdEmpleadoSustitutoAreaActionPerformed(evt);
			}
			
			;
			
			
			AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessArea();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAreaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.area);
				
				this.actualizarInformacion("INFO_PADRE",false,this.area);
				
				AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
				
				


				
				AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Area.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Area.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Area areaLocal=null;
			
			if(!this.getEsControlTabla()) {
				areaLocal=this.area;
			} else {
				areaLocal=this.areaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.area);
				
				this.actualizarInformacion("INFO_PADRE",false,this.area);
				
				AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
							
				
				


				
				AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Area.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Area.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAreaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosArea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaAnterior =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.areaAnterior =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
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
			
			AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
			
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
			
			


			
			AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAreaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.area);
				
				this.actualizarInformacion("INFO_PADRE",false,this.area);
				
				AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
								
						
				


				
				AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Area.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Area.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.area);
				
				this.actualizarInformacion("INFO_PADRE",false,this.area);
				
				AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
								
				
				


				
				AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Area.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Area.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAreaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosArea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaAnterior =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.areaAnterior =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.area);
				
				this.actualizarInformacion("INFO_PADRE",false,this.area);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAreaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosArea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaAnterior =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.areaAnterior =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAreaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.area);
			
			this.actualizarInformacion("INFO_PADRE",false,this.area);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.area);
				
				this.actualizarInformacion("INFO_PADRE",false,this.area);
				
				AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
							
				
				


				
				AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Area.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Area.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAreaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosArea.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.areaAnterior =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.areaAnterior =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
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
			
			AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
			
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
			
			


			
			AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAreaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.area);
			
			this.actualizarInformacion("INFO_PADRE",false,this.area);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.area);
				
				this.actualizarInformacion("INFO_PADRE",false,this.area);
				
				AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
								
				
				


				
				AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Area.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Area.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAreaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosArea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaAnterior =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.areaAnterior =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAreaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.area);
			
			this.actualizarInformacion("INFO_PADRE",false,this.area);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAreaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.area);
				
				this.actualizarInformacion("INFO_PADRE",false,this.area);
				
				AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosArea")) {
					jCheckBoxSeleccionarTodosAreaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosArea")) {
					jCheckBoxSeleccionadosAreaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarArea")) {
					
				}
				
				


				
				
				AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Area.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Area.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.area);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.area);
				
				AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
												
				
				


				
				
				AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Area.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Area.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAreaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosArea.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.areaAnterior =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.areaAnterior =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAreaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.area);
				
				this.actualizarInformacion("INFO_PADRE",false,this.area);
				
				AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
				
				
				AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
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
			
			AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
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
			
			


			
			AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAreaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.area);
				
				this.actualizarInformacion("INFO_PADRE",false,this.area);
				
				AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Area.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Area.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.area);
				
				this.actualizarInformacion("INFO_PADRE",false,this.area);
				
				AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
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
				
				


				
				AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Area.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Area.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAreaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosArea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areaAnterior =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.areaAnterior =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarArea")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosAreaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosArea.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.area =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.area =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.area);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarArea")) {
				
				}
				
				AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarArea")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosArea.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarArea")) {
			
			}
			
			AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessArea();
			
			AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
			
			if(sTipo.equals("NuevoArea")) {
				jButtonNuevoAreaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarArea")) {
				jButtonDuplicarAreaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarArea")) {
				jButtonCopiarAreaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormArea")) {
				jButtonVerFormAreaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesArea")) {
				jButtonNuevoAreaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarArea")) {
				jButtonModificarAreaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarArea")) {
				jButtonActualizarAreaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarArea")) {
				jButtonEliminarAreaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaArea")) {
				jButtonGuardarCambiosAreaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarArea")) {
				jButtonCancelarAreaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarArea")) {
				jButtonCerrarAreaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosArea")) {
				jButtonGuardarCambiosAreaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosArea")) {
				jButtonNuevoGuardarCambiosAreaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByArea")) {
				jButtonAbrirOrderByAreaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionArea")) {
				jButtonRecargarInformacionAreaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresArea")) {
				jButtonAnterioresAreaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesArea")) {
				jButtonSiguientesAreaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAreaBusqueda")) {
				this.jButtonidAreaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaAreaUpdate")) {
				this.jButtonid_empresaAreaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaAreaBusqueda")) {
				this.jButtonid_empresaAreaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoArea")) {
				this.jButtonid_empleadoAreaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoAreaUpdate")) {
				this.jButtonid_empleadoAreaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoAreaBusqueda")) {
				this.jButtonid_empleadoAreaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleado_sustitutoArea")) {
				this.jButtonid_empleado_sustitutoAreaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleado_sustitutoAreaUpdate")) {
				this.jButtonid_empleado_sustitutoAreaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleado_sustitutoAreaBusqueda")) {
				this.jButtonid_empleado_sustitutoAreaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoAreaBusqueda")) {
				this.jButtoncodigoAreaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreAreaBusqueda")) {
				this.jButtonnombreAreaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencial_pedidoAreaBusqueda")) {
				this.jButtonsecuencial_pedidoAreaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencial_cotizacionAreaBusqueda")) {
				this.jButtonsecuencial_cotizacionAreaBusquedaActionPerformed(evt);
			}
			
			AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessArea();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameArea")) {
				closingInternalFrameArea();
				
			} else if(sTipo.equals("jButtonCancelarArea")) {
				JInternalFrameBase jInternalFrameDetalleFormArea = (JInternalFrameBase)evt.getSource();
	            	
	            AreaBeanSwingJInternalFrame jInternalFrameParent=(AreaBeanSwingJInternalFrame)jInternalFrameDetalleFormArea.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarAreaActionPerformed(null);
			}
			
			AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.area,new Object(),this.areaParameterGeneral,this.areaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormArea(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormArea(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormArea(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.area)) {
			if(!esControlTabla) {
				if(AreaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualArea(this.area,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysArea(this.area);			
				}
				
				if(this.areaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualArea(this.area,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.areaReturnGeneral=areaLogic.procesarEventosAreasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.areaLogic.getAreas(),this.area,this.areaParameterGeneral,this.isEsNuevoArea,classes);//this.areaLogic.getArea()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanArea(this.areaReturnGeneral,this.areaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.areaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanArea(classes,this.areaReturnGeneral,this.areaBean,false);
					}
						
					if(this.areaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyArea(this.areaReturnGeneral.getArea());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioArea(this.areaReturnGeneral.getArea());	
					}
						
					if(this.areaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioArea(this.areaReturnGeneral.getArea(),classes);//this.areaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioArea(this.area,classes);//this.areaBean);									
				}
			
				if(AreaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualArea(this.area,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysArea(this.area);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.areaAnterior!=null) {
						this.area=this.areaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.areaReturnGeneral=areaLogic.procesarEventosAreasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.areaLogic.getAreas(),this.area,this.areaParameterGeneral,this.isEsNuevoArea,classes);//this.areaLogic.getArea()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.areaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.areaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.areaReturnGeneral.getArea(),areaLogic.getAreas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.areaReturnGeneral.getArea(),this.areas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosArea.repaint();
				
				//((AbstractTableModel) this.jTableDatosArea.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosArea();
			}
		}
	}
	
	public void actualizarVisualTableDatosArea() throws Exception {
		
		AreaModel areaModel=(AreaModel)this.jTableDatosArea.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			areaModel.areas=this.areaLogic.getAreas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			areaModel.areas=this.areas;
		}
		
		
		((AreaModel) this.jTableDatosArea.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaArea() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getareaAnterior(),this.areaLogic.getAreas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getareaAnterior(),this.areas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosArea();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioArea(Area area,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
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
										
				AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.area,new Object(),generalEntityParameterGeneral,this.areaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.areaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=AreaConstantesFunciones.getClassesRelationshipsOfArea(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=AreaConstantesFunciones.getClassesRelationshipsFromStringsOfArea(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormArea(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				AreaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.area,new Object(),generalEntityParameterGeneral,this.areaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioArea(AreaBean areaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanArea(ArrayList<Classe> classes,AreaReturnGeneral areaReturnGeneral,AreaBean areaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualArea(Area area,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.area)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormArea = new AreaDetalleFormJInternalFrame(jDesktopPane,this.areaSessionBean.getConGuardarRelaciones(),this.areaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormArea);
		this.jInternalFrameDetalleFormArea.setVisible(false);
		this.jInternalFrameDetalleFormArea.setSelected(false);						
		
		this.jInternalFrameDetalleFormArea.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormArea.areaLogic=this.areaLogic;
		
		this.cargarCombosFrameForeignKeyArea("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleArea();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleArea();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyArea("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyArea();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormArea.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarArea"));
		
		this.jInternalFrameDetalleFormArea.jButtonModificarArea.addActionListener(new ButtonActionListener(this,"ModificarArea"));

		
		this.jInternalFrameDetalleFormArea.jButtonModificarToolBarArea.addActionListener(new ButtonActionListener(this,"ModificarToolBarArea"));
					
		this.jInternalFrameDetalleFormArea.jMenuItemModificarArea.addActionListener(new ButtonActionListener(this,"MenuItemModificarArea"));		
		
		
		
		this.jInternalFrameDetalleFormArea.jButtonActualizarArea.addActionListener (new ButtonActionListener(this,"ActualizarArea"));
		
		
		this.jInternalFrameDetalleFormArea.jButtonActualizarToolBarArea.addActionListener(new ButtonActionListener(this,"ActualizarToolBarArea"));
						
		this.jInternalFrameDetalleFormArea.jMenuItemActualizarArea.addActionListener (new ButtonActionListener(this,"MenuItemActualizarArea"));		
		
		
		
		this.jInternalFrameDetalleFormArea.jButtonEliminarArea.addActionListener (new ButtonActionListener(this,"EliminarArea"));
		
		
		this.jInternalFrameDetalleFormArea.jButtonEliminarToolBarArea.addActionListener (new ButtonActionListener(this,"EliminarToolBarArea"));
								
		this.jInternalFrameDetalleFormArea.jMenuItemEliminarArea.addActionListener (new ButtonActionListener(this,"MenuItemEliminarArea"));		
		
		
		
		this.jInternalFrameDetalleFormArea.jButtonCancelarArea.addActionListener (new ButtonActionListener(this,"CancelarArea"));
		
		
		this.jInternalFrameDetalleFormArea.jButtonCancelarToolBarArea.addActionListener (new ButtonActionListener(this,"CancelarToolBarArea"));
					
		this.jInternalFrameDetalleFormArea.jMenuItemCancelarArea.addActionListener (new ButtonActionListener(this,"MenuItemCancelarArea"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormArea.jMenuItemDetalleCerrarArea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarArea"));		
		
		
		
		this.jInternalFrameDetalleFormArea.jButtonGuardarCambiosToolBarArea.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarArea"));
		
		
		
		this.jInternalFrameDetalleFormArea.jButtonGuardarCambiosToolBarArea.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarArea"));
		
		
		
		this.jInternalFrameDetalleFormArea.jComboBoxTiposAccionesFormularioArea.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioArea"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArea.jButtonidAreaBusqueda.addActionListener(new ButtonActionListener(this,"idAreaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormArea.jButtonid_empresaAreaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAreaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArea.jButtonid_empresaAreaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAreaBusqueda"));
		//jButtonid_empleadoArea.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoAreaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormArea.jButtonid_empleadoArea.addActionListener(new ButtonActionListener(this,"id_empleadoArea"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormArea.jButtonid_empleadoAreaUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoAreaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArea.jButtonid_empleadoAreaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoAreaBusqueda"));
		//jButtonid_empleado_sustitutoArea.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleado_sustitutoAreaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormArea.jButtonid_empleado_sustitutoArea.addActionListener(new ButtonActionListener(this,"id_empleado_sustitutoArea"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormArea.jButtonid_empleado_sustitutoAreaUpdate.addActionListener(new ButtonActionListener(this,"id_empleado_sustitutoAreaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArea.jButtonid_empleado_sustitutoAreaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleado_sustitutoAreaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArea.jButtoncodigoAreaBusqueda.addActionListener(new ButtonActionListener(this,"codigoAreaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArea.jButtonnombreAreaBusqueda.addActionListener(new ButtonActionListener(this,"nombreAreaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArea.jButtonsecuencial_pedidoAreaBusqueda.addActionListener(new ButtonActionListener(this,"secuencial_pedidoAreaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArea.jButtonsecuencial_cotizacionAreaBusqueda.addActionListener(new ButtonActionListener(this,"secuencial_cotizacionAreaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormArea.jTabbedPaneRelacionesArea.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesArea"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameArea"));
		
		if(this.jInternalFrameDetalleFormArea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormArea.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarArea"));
		}
		
		this.jTableDatosArea.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarArea"));
		
		this.jTableDatosArea.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarArea"));
		
		this.jButtonNuevoArea.addActionListener(new ButtonActionListener(this,"NuevoArea"));
		
		this.jButtonDuplicarArea.addActionListener(new ButtonActionListener(this,"DuplicarArea"));
		
		this.jButtonCopiarArea.addActionListener(new ButtonActionListener(this,"CopiarArea"));
		
		this.jButtonVerFormArea.addActionListener(new ButtonActionListener(this,"VerFormArea"));
		
		
		this.jButtonNuevoToolBarArea.addActionListener(new ButtonActionListener(this,"NuevoToolBarArea"));
			
		this.jButtonDuplicarToolBarArea.addActionListener(new ButtonActionListener(this,"DuplicarToolBarArea"));
			
		this.jMenuItemNuevoArea.addActionListener (new ButtonActionListener(this,"MenuItemNuevoArea"));
			
		this.jMenuItemDuplicarArea.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarArea"));		
		
		
		this.jButtonNuevoRelacionesArea.addActionListener (new ButtonActionListener(this,"NuevoRelacionesArea"));
		
		
		this.jButtonNuevoRelacionesToolBarArea.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarArea"));
			
		this.jMenuItemNuevoRelacionesArea.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesArea"));		
		
		
		if(this.jInternalFrameDetalleFormArea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormArea.jButtonModificarArea.addActionListener(new ButtonActionListener(this,"ModificarArea"));
		}
		
		
		if(this.jInternalFrameDetalleFormArea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormArea.jButtonModificarToolBarArea.addActionListener(new ButtonActionListener(this,"ModificarToolBarArea"));
			
			this.jInternalFrameDetalleFormArea.jMenuItemModificarArea.addActionListener(new ButtonActionListener(this,"MenuItemModificarArea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormArea!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormArea.jButtonActualizarArea.addActionListener (new ButtonActionListener(this,"ActualizarArea"));
		}
		
		
		if(this.jInternalFrameDetalleFormArea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormArea.jButtonActualizarToolBarArea.addActionListener(new ButtonActionListener(this,"ActualizarToolBarArea"));
				
			this.jInternalFrameDetalleFormArea.jMenuItemActualizarArea.addActionListener (new ButtonActionListener(this,"MenuItemActualizarArea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormArea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormArea.jButtonEliminarArea.addActionListener (new ButtonActionListener(this,"EliminarArea"));
		}
		
		
		if(this.jInternalFrameDetalleFormArea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormArea.jButtonEliminarToolBarArea.addActionListener (new ButtonActionListener(this,"EliminarToolBarArea"));
						
			this.jInternalFrameDetalleFormArea.jMenuItemEliminarArea.addActionListener (new ButtonActionListener(this,"MenuItemEliminarArea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormArea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormArea.jButtonCancelarArea.addActionListener (new ButtonActionListener(this,"CancelarArea"));
		}
		
		
		if(this.jInternalFrameDetalleFormArea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormArea.jButtonCancelarToolBarArea.addActionListener (new ButtonActionListener(this,"CancelarToolBarArea"));
			
			this.jInternalFrameDetalleFormArea.jMenuItemCancelarArea.addActionListener (new ButtonActionListener(this,"MenuItemCancelarArea"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarArea.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarArea"));		
		
		
		this.jButtonCerrarArea.addActionListener (new ButtonActionListener(this,"CerrarArea"));
		
		
		this.jButtonCerrarToolBarArea.addActionListener (new ButtonActionListener(this,"CerrarToolBarArea"));
			
		this.jMenuItemCerrarArea.addActionListener (new ButtonActionListener(this,"MenuItemCerrarArea"));
			
		if(this.jInternalFrameDetalleFormArea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormArea.jMenuItemDetalleCerrarArea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarArea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormArea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormArea.jButtonGuardarCambiosArea.addActionListener (new ButtonActionListener(this,"GuardarCambiosArea"));
		}
		
		
		if(this.jInternalFrameDetalleFormArea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormArea.jButtonGuardarCambiosToolBarArea.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarArea"));
		}
		
		this.jButtonCopiarToolBarArea.addActionListener (new ButtonActionListener(this,"CopiarToolBarArea"));
			
		this.jButtonVerFormToolBarArea.addActionListener (new ButtonActionListener(this,"VerFormToolBarArea"));
		
		this.jMenuItemGuardarCambiosArea.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosArea"));
			
		this.jMenuItemCopiarArea.addActionListener (new ButtonActionListener(this,"MenuItemCopiarArea"));		
		
		this.jMenuItemVerFormArea.addActionListener (new ButtonActionListener(this,"MenuItemVerFormArea"));		
		
		
		this.jButtonGuardarCambiosTablaArea.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaArea"));
		
		
		this.jButtonGuardarCambiosTablaToolBarArea.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarArea"));
			
		this.jMenuItemGuardarCambiosTablaArea.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaArea"));		
		
		
		
		this.jButtonRecargarInformacionArea.addActionListener (new ButtonActionListener(this,"RecargarInformacionArea"));
					
		this.jButtonRecargarInformacionToolBarArea.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarArea"));
		
		this.jMenuItemRecargarInformacionArea.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionArea"));		
		
		
		
		this.jButtonAnterioresArea.addActionListener (new ButtonActionListener(this,"AnterioresArea"));
		
		
		this.jButtonAnterioresToolBarArea.addActionListener (new ButtonActionListener(this,"AnterioresToolBarArea"));
		
		this.jMenuItemAnterioresArea.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresArea"));		
		
		
		this.jButtonSiguientesArea.addActionListener (new ButtonActionListener(this,"SiguientesArea"));
		
		
		this.jButtonSiguientesToolBarArea.addActionListener (new ButtonActionListener(this,"SiguientesToolBarArea"));
			
		this.jMenuItemSiguientesArea.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesArea"));
			
		this.jMenuItemAbrirOrderByArea.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByArea"));
			
		this.jMenuItemMostrarOcultarArea.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarArea"));
			
		this.jMenuItemDetalleAbrirOrderByArea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByArea"));
			
		this.jMenuItemDetalleMostarOcultarArea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarArea"));		
		
		
		this.jButtonNuevoGuardarCambiosArea.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosArea"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarArea.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarArea"));
			
		this.jMenuItemNuevoGuardarCambiosArea.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosArea"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosArea.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosArea"));

		this.jCheckBoxSeleccionadosArea.addItemListener(new CheckBoxItemListener(this,"SeleccionadosArea"));
		
		if(this.jInternalFrameDetalleFormArea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormArea.jComboBoxTiposAccionesFormularioArea.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioArea"));
		}
		
		
		this.jComboBoxTiposRelacionesArea.addActionListener (new ButtonActionListener(this,"TiposRelacionesArea"));
			
		this.jComboBoxTiposAccionesArea.addActionListener (new ButtonActionListener(this,"TiposAccionesArea"));
					
		this.jComboBoxTiposSeleccionarArea.addActionListener (new ButtonActionListener(this,"TiposSeleccionarArea"));
			
		this.jTextFieldValorCampoGeneralArea.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralArea"));		
		
		
		if(this.jInternalFrameDetalleFormArea!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArea.jButtonidAreaBusqueda.addActionListener(new ButtonActionListener(this,"idAreaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormArea.jButtonid_empresaAreaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAreaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArea.jButtonid_empresaAreaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAreaBusqueda"));
		//jButtonid_empleadoArea.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoAreaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormArea.jButtonid_empleadoArea.addActionListener(new ButtonActionListener(this,"id_empleadoArea"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormArea.jButtonid_empleadoAreaUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoAreaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArea.jButtonid_empleadoAreaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoAreaBusqueda"));
		//jButtonid_empleado_sustitutoArea.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleado_sustitutoAreaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormArea.jButtonid_empleado_sustitutoArea.addActionListener(new ButtonActionListener(this,"id_empleado_sustitutoArea"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormArea.jButtonid_empleado_sustitutoAreaUpdate.addActionListener(new ButtonActionListener(this,"id_empleado_sustitutoAreaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArea.jButtonid_empleado_sustitutoAreaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleado_sustitutoAreaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArea.jButtoncodigoAreaBusqueda.addActionListener(new ButtonActionListener(this,"codigoAreaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArea.jButtonnombreAreaBusqueda.addActionListener(new ButtonActionListener(this,"nombreAreaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArea.jButtonsecuencial_pedidoAreaBusqueda.addActionListener(new ButtonActionListener(this,"secuencial_pedidoAreaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArea.jButtonsecuencial_cotizacionAreaBusqueda.addActionListener(new ButtonActionListener(this,"secuencial_cotizacionAreaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoArea.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoArea"));

			this.jButtonBuscarFK_IdEmpleadoid_empleadoArea.addActionListener(new ButtonActionListener(this,"id_empleadoArea"));

			this.jButtonFK_IdEmpleadoSustitutoArea.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoSustitutoArea"));

			this.jButtonBuscarFK_IdEmpleadoSustitutoid_empleado_sustitutoArea.addActionListener(new ButtonActionListener(this,"id_empleado_sustitutoArea"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoArea!=null) {
				this.jInternalFrameReporteDinamicoArea.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoArea"));
				this.jInternalFrameReporteDinamicoArea.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoArea"));
				this.jInternalFrameReporteDinamicoArea.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoArea"));
			}
			
			//this.jButtonCerrarReporteDinamicoArea.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoArea"));				
			//this.jButtonGenerarReporteDinamicoArea.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoArea"));
			//this.jButtonGenerarExcelReporteDinamicoArea.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoArea"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionArea!=null) {
				this.jInternalFrameImportacionArea.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionArea"));
				this.jInternalFrameImportacionArea.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionArea"));
				this.jInternalFrameImportacionArea.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionArea"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByArea.addActionListener (new ButtonActionListener(this,"AbrirOrderByArea"));
			
			this.jButtonAbrirOrderByToolBarArea.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarArea"));			
			
			if(this.jInternalFrameOrderByArea!=null) {
				this.jInternalFrameOrderByArea.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByArea"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormArea!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormArea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormArea.jTabbedPaneRelacionesArea.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesArea"));
		
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
            		closingInternalFrameArea();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormArea.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormArea = (JInternalFrameBase)event.getSource();
	            	
	            AreaBeanSwingJInternalFrame jInternalFrameParent=(AreaBeanSwingJInternalFrame)jInternalFrameDetalleFormArea.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarAreaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosArea.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosAreaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosArea.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosArea.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAreaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAreaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAreaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoArea";
		inputMap = this.jButtonNuevoArea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoArea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAreaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAreaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAreaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAreaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesArea";
		inputMap = this.jButtonNuevoRelacionesArea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesArea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAreaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarArea";
		inputMap = this.jButtonModificarArea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarArea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarAreaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarArea";
		inputMap = this.jButtonActualizarArea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarArea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarAreaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarArea";
		inputMap = this.jButtonEliminarArea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarArea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarAreaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarArea";
		inputMap = this.jButtonCancelarArea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarArea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarAreaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarArea";
		inputMap = this.jButtonCerrarArea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarArea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarAreaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormArea.jButtonGuardarCambiosArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosArea";
		inputMap = this.jInternalFrameDetalleFormArea.jButtonGuardarCambiosArea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormArea.jButtonGuardarCambiosArea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosAreaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosArea.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosAreaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesArea.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesAreaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarArea.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarAreaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralArea.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralAreaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArea.jButtonidAreaBusqueda.addActionListener(new ButtonActionListener(this,"idAreaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormArea.jButtonid_empresaAreaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAreaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArea.jButtonid_empresaAreaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAreaBusqueda"));
		//jButtonid_empleadoArea.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoAreaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormArea.jButtonid_empleadoArea.addActionListener(new ButtonActionListener(this,"id_empleadoArea"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormArea.jButtonid_empleadoAreaUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoAreaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArea.jButtonid_empleadoAreaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoAreaBusqueda"));
		//jButtonid_empleado_sustitutoArea.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleado_sustitutoAreaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormArea.jButtonid_empleado_sustitutoArea.addActionListener(new ButtonActionListener(this,"id_empleado_sustitutoArea"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormArea.jButtonid_empleado_sustitutoAreaUpdate.addActionListener(new ButtonActionListener(this,"id_empleado_sustitutoAreaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArea.jButtonid_empleado_sustitutoAreaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleado_sustitutoAreaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArea.jButtoncodigoAreaBusqueda.addActionListener(new ButtonActionListener(this,"codigoAreaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArea.jButtonnombreAreaBusqueda.addActionListener(new ButtonActionListener(this,"nombreAreaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArea.jButtonsecuencial_pedidoAreaBusqueda.addActionListener(new ButtonActionListener(this,"secuencial_pedidoAreaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormArea.jButtonsecuencial_cotizacionAreaBusqueda.addActionListener(new ButtonActionListener(this,"secuencial_cotizacionAreaBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoArea.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoArea"));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoArea.addActionListener(new ButtonActionListener(this,"id_empleadoArea"));

		this.jButtonFK_IdEmpleadoSustitutoArea.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoSustitutoArea"));

		this.jButtonBuscarFK_IdEmpleadoSustitutoid_empleado_sustitutoArea.addActionListener(new ButtonActionListener(this,"id_empleado_sustitutoArea"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionArea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionAreaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarAreaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarArea.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosArea(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Area areaAux:this.areaLogic.getAreas()) {
					areaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Area areaAux:areas) {
					areaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosAreaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingArea(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Area areaAux:this.areaLogic.getAreas()) {
						areaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Area areaAux:areas) {
						areaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Area areaAux:this.areaLogic.getAreas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Area areaAux:areas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaArea(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosArea.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosArea.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosArea,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosAreaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingArea(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosArea.getSelectedRows();
			
			Area areaLocal=new Area();
			
			//this.seleccionarTodosArea(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					areaLocal =(Area) this.areaLogic.getAreas().toArray()[this.jTableDatosArea.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					areaLocal =(Area) this.areas.toArray()[this.jTableDatosArea.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				areaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Area areaAux:this.areaLogic.getAreas()) {
						areaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Area areaAux:areas) {
						areaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaArea(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosArea.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosArea.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosArea,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualAreaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarAreaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralAreaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingArea(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralArea.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Area areaAux:this.areaLogic.getAreas()) {
				
						if(sTipoSeleccionar.equals(AreaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							areaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AreaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							areaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AreaConstantesFunciones.LABEL_SECUENCIALPEDIDO)) {
							existe=true;
							areaAux.setsecuencial_pedido(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AreaConstantesFunciones.LABEL_SECUENCIALCOTIZACION)) {
							existe=true;
							areaAux.setsecuencial_cotizacion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Area areaAux:areas) {
					
						if(sTipoSeleccionar.equals(AreaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							areaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AreaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							areaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AreaConstantesFunciones.LABEL_SECUENCIALPEDIDO)) {
							existe=true;
							areaAux.setsecuencial_pedido(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AreaConstantesFunciones.LABEL_SECUENCIALCOTIZACION)) {
							existe=true;
							areaAux.setsecuencial_cotizacion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaArea(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesAreaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingArea(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioArea=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesArea.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormArea.jComboBoxTiposAccionesFormularioArea.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteArea) {				
					conSplash=true;//false;										
					
					//this.startProcessArea(conSplash);
				
					this.generarReporteAreasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesArea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormArea.jComboBoxTiposAccionesFormularioArea.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoAreasSeleccionados();
				//this.jComboBoxTiposAccionesArea.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAreasSeleccionados(false);
				//this.jComboBoxTiposAccionesArea.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAreasSeleccionados(true);
				//this.jComboBoxTiposAccionesArea.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessArea();
				
				this.exportarAreasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesArea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormArea.jComboBoxTiposAccionesFormularioArea.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionAreas();
				//this.importarAreas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesArea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormArea.jComboBoxTiposAccionesFormularioArea.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessArea();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelAreasSeleccionados();
				//this.jComboBoxTiposAccionesArea.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Area", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessArea();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoArea)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyArea(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Area",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesArea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormArea.jComboBoxTiposAccionesFormularioArea.setSelectedIndex(0);					
				}	
			} 			
			else if(AreaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteArea) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessArea(conSplash);
					
						//this.actualizarParametrosGeneralArea();
						
						this.generarReporteProcesoAccionAreasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesArea.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormArea.jComboBoxTiposAccionesFormularioArea.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(AreaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO AreaS SELECCIONADOS?", "MANTENIMIENTO DE Area", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessArea();
				
						this.actualizarParametrosGeneralArea();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.areaReturnGeneral=areaLogic.procesarAccionAreasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.areaLogic.getAreas(),this.areaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarAreaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesArea.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormArea.jComboBoxTiposAccionesFormularioArea.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralArea();
					
					AreaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarAreaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesArea.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormArea.jComboBoxTiposAccionesFormularioArea.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessArea(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesAreaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessArea();
			
			if(this.jInternalFrameDetalleFormArea==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Area> areasSeleccionados=new ArrayList<Area>();		
			Area area=new Area();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingArea(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesArea.getSelectedItem();
			
			
			
			
			areasSeleccionados=this.getAreasSeleccionados(true);
			//this.sTipoAccion;
			
			if(areasSeleccionados.size()==1) {
				for(Area areaAux:areasSeleccionados) {
					area=areaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessArea();
			
      		//this.finishProcessArea(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarAreaReturnGeneral() throws Exception {
		if(this.areaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.areaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.areaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.areaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.areaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.areaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingArea(false);
		}
		
		if(this.areaReturnGeneral.getConRetornoLista() || this.areaReturnGeneral.getConRetornoObjeto()) {
			if(this.areaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.areaLogic.setAreas(this.areaReturnGeneral.getAreas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.areaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.areaLogic.setArea(this.areaReturnGeneral.getArea());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingArea(false);
		}
	}
	
	public void actualizarParametrosGeneralArea() throws Exception {
		
		
	}
	
	public ArrayList<Area> getAreasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Area> areasSeleccionados=new ArrayList<Area>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioArea) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Area areaAux:areaLogic.getAreas()) {
					if(areaAux.getIsSelected()) {
						areasSeleccionados.add(areaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Area areaAux:this.areas) {
					if(areaAux.getIsSelected()) {
						areasSeleccionados.add(areaAux);				
					}
				}
			}
			
			if(areasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						areasSeleccionados.addAll(this.areaLogic.getAreas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						areasSeleccionados.addAll(this.areas);				
					}
				}
			}
		} else {
			areasSeleccionados.add(this.area);
		}
		
		return areasSeleccionados;
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
	
	public void generarReporteAreasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalAreasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoAreasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAreasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAreasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Area",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesAreasSeleccionados() throws Exception {
		ArrayList<Area> areasSeleccionados=new ArrayList<Area>();		
		
		areasSeleccionados=this.getAreasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteAreas("Todos",areasSeleccionados);
		
	}	
	
	public void generarReporteNormalAreasSeleccionados() throws Exception {
		ArrayList<Area> areasSeleccionados=new ArrayList<Area>();		
		
		areasSeleccionados=this.getAreasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteAreas("Todos",areasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionAreasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Area> areasSeleccionados=new ArrayList<Area>();
		
		areasSeleccionados=this.getAreasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteAreas("Todos",areasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoAreasSeleccionados() throws Exception {
		ArrayList<Area> areasSeleccionados=new ArrayList<Area>();		
		
		
		this.abrirInicializarFrameReporteDinamicoArea();
		
		
		areasSeleccionados=this.getAreasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoArea();
		
		
		//this.generarReporteAreas("Todos",areasSeleccionados ,areaImplementable,areaImplementableHome);
	}
	
	public void mostrarImportacionAreas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionArea();
		
		this.abrirFrameImportacionArea();		
		
			
		//this.generarReporteAreas("Todos",areasSeleccionados ,areaImplementable,areaImplementableHome);
	}
	
	public void importarAreas() throws Exception {		
	
	}
	
	public void exportarAreasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelAreasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoAreasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlAreasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Area",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoAreasSeleccionados() throws Exception {
		ArrayList<Area> areasSeleccionados=new ArrayList<Area>();		
		
		areasSeleccionados=this.getAreasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"area."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarArea(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Area areaAux:areasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarArea(areaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//areaAux.setsDetalleGeneralEntityReporte(areaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.areaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Area",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarArea(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=AreaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AreaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AreaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AreaConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AreaConstantesFunciones.LABEL_IDEMPLEADOSUSTITUTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AreaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AreaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AreaConstantesFunciones.LABEL_SECUENCIALPEDIDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AreaConstantesFunciones.LABEL_SECUENCIALCOTIZACION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarArea(Area area,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=area.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=area.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=area.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=area.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=area.getempleadosustituto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=area.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=area.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=area.getsecuencial_pedido();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=area.getsecuencial_cotizacion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelAreasSeleccionados() throws Exception {
		ArrayList<Area> areasSeleccionados=new ArrayList<Area>();		
		
		areasSeleccionados=this.getAreasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"area.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Areas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelArea(row);				
				iRow++;
			}				
			
			for(Area areaAux:areasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelArea(areaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.areaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Area",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlAreasSeleccionados() throws Exception {
		ArrayList<Area> areasSeleccionados=new ArrayList<Area>();		
		
		areasSeleccionados=this.getAreasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"area.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("areas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("area");
			//elementRoot.appendChild(element);
		
			for(Area areaAux:areasSeleccionados) {
				element = document.createElement("area");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlArea(areaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.areaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Area",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelArea(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(AreaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(AreaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(AreaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(AreaConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(AreaConstantesFunciones.LABEL_IDEMPLEADOSUSTITUTO);
		cell = row.createCell(iColumn++);cell.setCellValue(AreaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(AreaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(AreaConstantesFunciones.LABEL_SECUENCIALPEDIDO);
		cell = row.createCell(iColumn++);cell.setCellValue(AreaConstantesFunciones.LABEL_SECUENCIALCOTIZACION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelArea(Area area,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(area.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(area.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(area.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(area.getempleadosustituto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(area.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(area.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(area.getsecuencial_pedido());
		cell = row.createCell(iColumn++);cell.setCellValue(area.getsecuencial_cotizacion());				
	}
	
	public void setFilaDatosExportarXmlArea(Area area,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(AreaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(area.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(AreaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(area.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(AreaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(area.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempleado_descripcion = document.createElement(AreaConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(area.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementempleadosustituto_descripcion = document.createElement(AreaConstantesFunciones.IDEMPLEADOSUSTITUTO);
		elementempleadosustituto_descripcion.appendChild(document.createTextNode(area.getempleadosustituto_descripcion()));
		element.appendChild(elementempleadosustituto_descripcion);

		Element elementcodigo = document.createElement(AreaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(area.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(AreaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(area.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementsecuencial_pedido = document.createElement(AreaConstantesFunciones.SECUENCIALPEDIDO);
		elementsecuencial_pedido.appendChild(document.createTextNode(area.getsecuencial_pedido().trim()));
		element.appendChild(elementsecuencial_pedido);

		Element elementsecuencial_cotizacion = document.createElement(AreaConstantesFunciones.SECUENCIALCOTIZACION);
		elementsecuencial_cotizacion.appendChild(document.createTextNode(area.getsecuencial_cotizacion().trim()));
		element.appendChild(elementsecuencial_cotizacion);
	}
	
	public void generarReporteGroupGenericoAreasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Area> areasSeleccionados=new ArrayList<Area>();
		
		areasSeleccionados=this.getAreasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoArea(areasSeleccionados);
		
		this.generarReporteAreas("Todos",areasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoArea(ArrayList<Area> areasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Area areaAux:areasSeleccionados) {
				areaAux.setsDetalleGeneralEntityReporte(areaAux.toString());
			
				if(sTipoSeleccionar.equals(AreaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					areaAux.setsDescripcionGeneralEntityReporte1(areaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AreaConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					areaAux.setsDescripcionGeneralEntityReporte1(areaAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AreaConstantesFunciones.LABEL_IDEMPLEADOSUSTITUTO)) {
					existe=true;
					areaAux.setsDescripcionGeneralEntityReporte1(areaAux.getempleadosustituto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AreaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					areaAux.setsDescripcionGeneralEntityReporte1(areaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(AreaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					areaAux.setsDescripcionGeneralEntityReporte1(areaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(AreaConstantesFunciones.LABEL_SECUENCIALPEDIDO)) {
					existe=true;
					areaAux.setsDescripcionGeneralEntityReporte1(areaAux.getsecuencial_pedido());
				}
				 else if(sTipoSeleccionar.equals(AreaConstantesFunciones.LABEL_SECUENCIALCOTIZACION)) {
					existe=true;
					areaAux.setsDescripcionGeneralEntityReporte1(areaAux.getsecuencial_cotizacion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesArea(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoArea=true;
				this.isVisibilidadCeldaNuevoRelacionesArea=true;
				this.isVisibilidadCeldaGuardarCambiosArea=true;
			}
			
			this.isVisibilidadCeldaModificarArea=false;
			this.isVisibilidadCeldaActualizarArea=false;
			this.isVisibilidadCeldaEliminarArea=false;
			this.isVisibilidadCeldaCancelarArea=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarArea=true;
				} else {
					this.isVisibilidadCeldaGuardarArea=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoArea=false;
			this.isVisibilidadCeldaNuevoRelacionesArea=false;
			this.isVisibilidadCeldaGuardarCambiosArea=false;
			this.isVisibilidadCeldaModificarArea=false;
			this.isVisibilidadCeldaActualizarArea=true;
			this.isVisibilidadCeldaEliminarArea=false;
			this.isVisibilidadCeldaCancelarArea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarArea=true;
				} else {
					this.isVisibilidadCeldaGuardarArea=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoArea=false;
			this.isVisibilidadCeldaNuevoRelacionesArea=false;
			this.isVisibilidadCeldaGuardarCambiosArea=false;
			this.isVisibilidadCeldaModificarArea=false;
			this.isVisibilidadCeldaActualizarArea=true;
			this.isVisibilidadCeldaEliminarArea=true;
			this.isVisibilidadCeldaCancelarArea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarArea=true;
				} else {
					this.isVisibilidadCeldaGuardarArea=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoArea=false;
			this.isVisibilidadCeldaNuevoRelacionesArea=false;
			this.isVisibilidadCeldaGuardarCambiosArea=false;
			this.isVisibilidadCeldaModificarArea=false;
			this.isVisibilidadCeldaActualizarArea=true;
			this.isVisibilidadCeldaEliminarArea=false;
			this.isVisibilidadCeldaCancelarArea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarArea=false;
				} else {
					this.isVisibilidadCeldaGuardarArea=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoArea=true;
			this.isVisibilidadCeldaNuevoRelacionesArea=true;
			this.isVisibilidadCeldaGuardarCambiosArea=true;
			this.isVisibilidadCeldaModificarArea=false;
			this.isVisibilidadCeldaActualizarArea=false;
			this.isVisibilidadCeldaEliminarArea=false;
			this.isVisibilidadCeldaCancelarArea=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarArea=true;
				} else {
					this.isVisibilidadCeldaGuardarArea=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoArea=false;
			this.isVisibilidadCeldaNuevoRelacionesArea=false;
			this.isVisibilidadCeldaGuardarCambiosArea=false;
			this.isVisibilidadCeldaActualizarArea=false;
			this.isVisibilidadCeldaEliminarArea=false;
			this.isVisibilidadCeldaCancelarArea=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarArea=false;
				} else {
					this.isVisibilidadCeldaGuardarArea=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoArea=false;
			this.isVisibilidadCeldaNuevoRelacionesArea=false;
			this.isVisibilidadCeldaGuardarCambiosArea=false;
			this.isVisibilidadCeldaModificarArea=true;
			this.isVisibilidadCeldaActualizarArea=false;
			this.isVisibilidadCeldaEliminarArea=false;
			this.isVisibilidadCeldaCancelarArea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarArea=false;
				} else {
					this.isVisibilidadCeldaGuardarArea=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(AreaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoArea=true;
			this.isVisibilidadCeldaNuevoRelacionesArea=true;
			this.isVisibilidadCeldaGuardarCambiosArea=true;
		} else {
			this.actualizarEstadoPanelsArea(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarArea=false;
			//this.isVisibilidadCeldaVerFormArea=false;
			this.isVisibilidadCeldaDuplicarArea=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!areaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesArea=false;
		} else {
			this.isVisibilidadCeldaNuevoArea=false;
			this.isVisibilidadCeldaGuardarCambiosArea=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(areaSessionBean.getEsGuardarRelacionado()) {
			if(!areaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesArea=false;												
			}
			
			this.jButtonCerrarArea.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesArea=false;
		}
		
		if(!this.permiteMantenimiento(this.area)) {
			this.isVisibilidadCeldaActualizarArea=false;
			this.isVisibilidadCeldaEliminarArea=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesArea() {
	}
	
	public void actualizarEstadoPanelsArea(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionArea!=null) {
				this.jScrollPanelDatosEdicionArea.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasArea!=null) {
				this.jTabbedPaneBusquedasArea.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosArea!=null) {
				this.jScrollPanelDatosArea.setVisible(true);
			}
			
			if(this.jPanelPaginacionArea!=null) {
				this.jPanelPaginacionArea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesArea!=null) {
				this.jPanelParametrosReportesArea.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionArea!=null) {
				this.jScrollPanelDatosEdicionArea.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasArea!=null) {
				this.jTabbedPaneBusquedasArea.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosArea!=null) {
				this.jScrollPanelDatosArea.setVisible(false);
			}
			
			if(this.jPanelPaginacionArea!=null) {
				this.jPanelPaginacionArea.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesArea!=null) {
				this.jPanelParametrosReportesArea.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionArea!=null) {
				this.jScrollPanelDatosEdicionArea.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasArea!=null) {
				this.jTabbedPaneBusquedasArea.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosArea!=null) {
				this.jScrollPanelDatosArea.setVisible(false);
			}
			
			if(this.jPanelPaginacionArea!=null) {
				this.jPanelPaginacionArea.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesArea!=null) {
				this.jPanelParametrosReportesArea.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionArea!=null) {
				this.jScrollPanelDatosEdicionArea.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasArea!=null) {
				this.jTabbedPaneBusquedasArea.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosArea!=null) {
				this.jScrollPanelDatosArea.setVisible(false);
			}
			
			if(this.jPanelPaginacionArea!=null) {
				this.jPanelPaginacionArea.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesArea!=null) {
				this.jPanelParametrosReportesArea.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionArea!=null) {
				this.jScrollPanelDatosEdicionArea.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasArea!=null) {
				this.jTabbedPaneBusquedasArea.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosArea!=null) {
				this.jScrollPanelDatosArea.setVisible(true);
			}
			
			if(this.jPanelPaginacionArea!=null) {
				this.jPanelPaginacionArea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesArea!=null) {
				this.jPanelParametrosReportesArea.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionArea!=null) {
				this.jScrollPanelDatosEdicionArea.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasArea!=null) {
				this.jTabbedPaneBusquedasArea.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosArea!=null) {
				this.jScrollPanelDatosArea.setVisible(true);
			}
			
			if(this.jPanelPaginacionArea!=null) {
				this.jPanelPaginacionArea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesArea!=null) {
				this.jPanelParametrosReportesArea.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionArea!=null) {
				this.jScrollPanelDatosEdicionArea.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasArea!=null) {
				this.jTabbedPaneBusquedasArea.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosArea!=null) {
				this.jScrollPanelDatosArea.setVisible(true);
			}
			
			if(this.jPanelPaginacionArea!=null) {
				this.jPanelPaginacionArea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesArea!=null) {
				this.jPanelParametrosReportesArea.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.areaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasArea!=null) {
					this.jTabbedPaneBusquedasArea.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesArea!=null) {
				this.jPanelParametrosReportesArea.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.areaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasArea!=null) {
				this.jTabbedPaneBusquedasArea.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesArea!=null) {
				this.jPanelParametrosReportesArea.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasArea.remove(jPanelFK_IdEmpleadoArea);}

			this.isVisibilidadFK_IdEmpleadoSustituto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleadoSustituto) {this.jTabbedPaneBusquedasArea.remove(jPanelFK_IdEmpleadoSustitutoArea);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasArea.remove(jPanelFK_IdEmpleadoArea);}

			this.isVisibilidadFK_IdEmpleadoSustituto=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEmpleadoSustituto) {this.jTabbedPaneBusquedasArea.remove(jPanelFK_IdEmpleadoSustitutoArea);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleadoSustituto(Boolean isParaEmpleadoSustituto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoSustitutoNegation=!isParaEmpleadoSustituto;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleadoSustitutoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasArea.remove(jPanelFK_IdEmpleadoArea);}

			this.isVisibilidadFK_IdEmpleadoSustituto=isParaEmpleadoSustituto;
			if(!this.isVisibilidadFK_IdEmpleadoSustituto) {this.jTabbedPaneBusquedasArea.remove(jPanelFK_IdEmpleadoSustitutoArea);}
		}
		
	}
	
	
	
	

	public String registrarSesionAreaParaBusquedaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(areaSessionBean==null) {
				areaSessionBean=new AreaSessionBean();
			}

			if(empleadoSessionBean==null) {
				empleadoSessionBean=new EmpleadoSessionBean();
			}

			empleadoSessionBean.setsPathNavegacionActual(areaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			empleadoSessionBean.setisPermiteRecargarInformacion(false);
			empleadoSessionBean.setisPaginaPopup(true);
			isPaginaPopupEmpleado=empleadoSessionBean.getisPaginaPopup();
			empleadoSessionBean.setisPaginaPopup(false);
			empleadoSessionBean.setEstaModoBusqueda(true);
			empleadoSessionBean.setsFuncionBusquedaRapida("window.opener.areaFuncionGeneral.setCombosCodigoDesdeBusquedaid_empleado(TO_REPLACE);");
			empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(AreaConstantesFunciones.SNOMBREOPCION);
			//empleadoSessionBean.setisBusquedaDesdeForeignKeySesionArea(true);
			//empleadoSessionBean.setlidAreaActual(this.idAreaActual);

			areaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyArea(true);
			areaSessionBean.setlIdAreaActualForeignKey(this.idAreaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionAreaParaBusquedaEmpleadoSustitutos() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(areaSessionBean==null) {
				areaSessionBean=new AreaSessionBean();
			}

			if(empleadosustitutoSessionBean==null) {
				empleadosustitutoSessionBean=new EmpleadoSessionBean();
			}

			empleadosustitutoSessionBean.setsPathNavegacionActual(areaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			empleadosustitutoSessionBean.setisPermiteRecargarInformacion(false);
			empleadosustitutoSessionBean.setisPaginaPopup(true);
			isPaginaPopupEmpleado=empleadosustitutoSessionBean.getisPaginaPopup();
			empleadosustitutoSessionBean.setisPaginaPopup(false);
			empleadosustitutoSessionBean.setEstaModoBusqueda(true);
			empleadosustitutoSessionBean.setsFuncionBusquedaRapida("window.opener.areaFuncionGeneral.setCombosCodigoDesdeBusquedaid_empleado_sustituto(TO_REPLACE);");
			empleadosustitutoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			empleadosustitutoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(AreaConstantesFunciones.SNOMBREOPCION);
			//empleadoSessionBean.setisBusquedaDesdeForeignKeySesionArea(true);
			//empleadoSessionBean.setlidAreaActual(this.idAreaActual);

			areaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyArea(true);
			areaSessionBean.setlIdAreaActualForeignKey(this.idAreaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//AreaSessionBean areaSessionBean=new AreaSessionBean();
		
		if(this.areaSessionBean==null) {
			this.areaSessionBean=new AreaSessionBean();
		}
		
		this.areaSessionBean.setsUltimaBusquedaArea(this.getsAccionBusqueda());
		this.areaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.areaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			areaSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleadoSustituto")) {
			areaSessionBean.setid_empleado_sustituto(this.getid_empleado_sustitutoFK_IdEmpleadoSustituto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			areaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//AreaSessionBean areaSessionBean=new AreaSessionBean();
		
		if(this.areaSessionBean==null) {
			this.areaSessionBean=new AreaSessionBean();
		}
		
		if(this.areaSessionBean.getsUltimaBusquedaArea()!=null&&!this.areaSessionBean.getsUltimaBusquedaArea().equals("")) {
			this.setsAccionBusqueda(areaSessionBean.getsUltimaBusquedaArea());
			this.setiNumeroPaginacion(areaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(areaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(areaSessionBean.getid_empleado());
				areaSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleadoSustituto")) {
				this.setid_empleado_sustitutoFK_IdEmpleadoSustituto(areaSessionBean.getid_empleado_sustituto());
				areaSessionBean.setid_empleado_sustituto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(areaSessionBean.getid_empresa());
				areaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.areaSessionBean.setsUltimaBusquedaArea("");
		this.areaSessionBean.setiNumeroPaginacion(AreaConstantesFunciones.INUMEROPAGINACION);
		this.areaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaArea(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioArea() {
		this.updateBorderResaltarBusquedasFormularioArea();
		this.updateVisibilidadBusquedasFormularioArea();
		this.updateHabilitarBusquedasFormularioArea();
	}
	
	public void updateBorderResaltarBusquedasFormularioArea() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasArea.getComponents().length>0) {
	

		if(this.areaConstantesFunciones.resaltarFK_IdEmpleadoArea!=null) {
			index= this.jTabbedPaneBusquedasArea.indexOfComponent(this.jPanelFK_IdEmpleadoArea);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasArea.getComponent(index);
				jPanel.setBorder(this.areaConstantesFunciones.resaltarFK_IdEmpleadoArea);
			}
		}

		if(this.areaConstantesFunciones.resaltarFK_IdEmpleadoSustitutoArea!=null) {
			index= this.jTabbedPaneBusquedasArea.indexOfComponent(this.jPanelFK_IdEmpleadoSustitutoArea);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasArea.getComponent(index);
				jPanel.setBorder(this.areaConstantesFunciones.resaltarFK_IdEmpleadoSustitutoArea);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioArea() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasArea.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasArea.indexOfComponent(this.jPanelFK_IdEmpleadoArea);
			jPanel=(JPanel)this.jTabbedPaneBusquedasArea.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.areaConstantesFunciones.mostrarFK_IdEmpleadoArea);
			if(!this.areaConstantesFunciones.mostrarFK_IdEmpleadoArea && index>-1) {
				this.jTabbedPaneBusquedasArea.remove(index);
			}

			index= this.jTabbedPaneBusquedasArea.indexOfComponent(this.jPanelFK_IdEmpleadoSustitutoArea);
			jPanel=(JPanel)this.jTabbedPaneBusquedasArea.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.areaConstantesFunciones.mostrarFK_IdEmpleadoSustitutoArea);
			if(!this.areaConstantesFunciones.mostrarFK_IdEmpleadoSustitutoArea && index>-1) {
				this.jTabbedPaneBusquedasArea.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioArea() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasArea.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasArea.indexOfComponent(this.jPanelFK_IdEmpleadoArea);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasArea.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.areaConstantesFunciones.activarFK_IdEmpleadoArea);
				this.jTabbedPaneBusquedasArea.setEnabledAt(index,this.areaConstantesFunciones.activarFK_IdEmpleadoArea);
			}

			index= this.jTabbedPaneBusquedasArea.indexOfComponent(this.jPanelFK_IdEmpleadoSustitutoArea);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasArea.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.areaConstantesFunciones.activarFK_IdEmpleadoSustitutoArea);
				this.jTabbedPaneBusquedasArea.setEnabledAt(index,this.areaConstantesFunciones.activarFK_IdEmpleadoSustitutoArea);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaArea(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasArea.indexOfComponent(this.jPanelFK_IdEmpleadoArea);

			this.jTabbedPaneBusquedasArea.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasArea.getComponent(index);

			this.areaConstantesFunciones.setResaltarFK_IdEmpleadoArea(resaltar);

			jPanel.setBorder(this.areaConstantesFunciones.resaltarFK_IdEmpleadoArea);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEmpleadoSustituto")) {
			index= this.jTabbedPaneBusquedasArea.indexOfComponent(this.jPanelFK_IdEmpleadoSustitutoArea);

			this.jTabbedPaneBusquedasArea.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasArea.getComponent(index);

			this.areaConstantesFunciones.setResaltarFK_IdEmpleadoSustitutoArea(resaltar);

			jPanel.setBorder(this.areaConstantesFunciones.resaltarFK_IdEmpleadoSustitutoArea);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarArea.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioArea() throws Exception {

		if(this.jInternalFrameDetalleFormArea==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioArea();
		this.updateVisibilidadResaltarControlesFormularioArea();
		this.updateHabilitarResaltarControlesFormularioArea();
		
	}
	
	public void updateBorderResaltarControlesFormularioArea() throws Exception {
		if(this.jInternalFrameDetalleFormArea==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.areaConstantesFunciones.resaltaridArea!=null && this.jInternalFrameDetalleFormArea!=null) {this.jInternalFrameDetalleFormArea.jLabelidArea.setBorder(this.areaConstantesFunciones.resaltaridArea);}
		if(this.areaConstantesFunciones.resaltarid_empresaArea!=null && this.jInternalFrameDetalleFormArea!=null) {this.jInternalFrameDetalleFormArea.jComboBoxid_empresaArea.setBorder(this.areaConstantesFunciones.resaltarid_empresaArea);}
		if(this.areaConstantesFunciones.resaltarid_empleadoArea!=null && this.jInternalFrameDetalleFormArea!=null) {this.jInternalFrameDetalleFormArea.jComboBoxid_empleadoArea.setBorder(this.areaConstantesFunciones.resaltarid_empleadoArea);}
		if(this.areaConstantesFunciones.resaltarid_empleado_sustitutoArea!=null && this.jInternalFrameDetalleFormArea!=null) {this.jInternalFrameDetalleFormArea.jComboBoxid_empleado_sustitutoArea.setBorder(this.areaConstantesFunciones.resaltarid_empleado_sustitutoArea);}
		if(this.areaConstantesFunciones.resaltarcodigoArea!=null && this.jInternalFrameDetalleFormArea!=null) {this.jInternalFrameDetalleFormArea.jTextFieldcodigoArea.setBorder(this.areaConstantesFunciones.resaltarcodigoArea);}
		if(this.areaConstantesFunciones.resaltarnombreArea!=null && this.jInternalFrameDetalleFormArea!=null) {this.jInternalFrameDetalleFormArea.jTextAreanombreArea.setBorder(this.areaConstantesFunciones.resaltarnombreArea);}
		if(this.areaConstantesFunciones.resaltarsecuencial_pedidoArea!=null && this.jInternalFrameDetalleFormArea!=null) {this.jInternalFrameDetalleFormArea.jTextFieldsecuencial_pedidoArea.setBorder(this.areaConstantesFunciones.resaltarsecuencial_pedidoArea);}
		if(this.areaConstantesFunciones.resaltarsecuencial_cotizacionArea!=null && this.jInternalFrameDetalleFormArea!=null) {this.jInternalFrameDetalleFormArea.jTextFieldsecuencial_cotizacionArea.setBorder(this.areaConstantesFunciones.resaltarsecuencial_cotizacionArea);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioArea() throws Exception {		
		if(this.jInternalFrameDetalleFormArea==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormArea!=null) {
	
		//this.jInternalFrameDetalleFormArea.jLabelidArea.setVisible(this.areaConstantesFunciones.mostraridArea);
		this.jInternalFrameDetalleFormArea.jPanelidArea.setVisible(this.areaConstantesFunciones.mostraridArea);
		//this.jInternalFrameDetalleFormArea.jComboBoxid_empresaArea.setVisible(this.areaConstantesFunciones.mostrarid_empresaArea);
		this.jInternalFrameDetalleFormArea.jPanelid_empresaArea.setVisible(this.areaConstantesFunciones.mostrarid_empresaArea);
		//this.jInternalFrameDetalleFormArea.jComboBoxid_empleadoArea.setVisible(this.areaConstantesFunciones.mostrarid_empleadoArea);
		this.jInternalFrameDetalleFormArea.jPanelid_empleadoArea.setVisible(this.areaConstantesFunciones.mostrarid_empleadoArea);
			this.jInternalFrameDetalleFormArea.jButtonid_empleadoArea.setVisible(this.areaConstantesFunciones.mostrarid_empleadoArea);
		//this.jInternalFrameDetalleFormArea.jComboBoxid_empleado_sustitutoArea.setVisible(this.areaConstantesFunciones.mostrarid_empleado_sustitutoArea);
		this.jInternalFrameDetalleFormArea.jPanelid_empleado_sustitutoArea.setVisible(this.areaConstantesFunciones.mostrarid_empleado_sustitutoArea);
			this.jInternalFrameDetalleFormArea.jButtonid_empleado_sustitutoArea.setVisible(this.areaConstantesFunciones.mostrarid_empleado_sustitutoArea);
		//this.jInternalFrameDetalleFormArea.jTextFieldcodigoArea.setVisible(this.areaConstantesFunciones.mostrarcodigoArea);
		this.jInternalFrameDetalleFormArea.jPanelcodigoArea.setVisible(this.areaConstantesFunciones.mostrarcodigoArea);
		//this.jInternalFrameDetalleFormArea.jTextAreanombreArea.setVisible(this.areaConstantesFunciones.mostrarnombreArea);
		this.jInternalFrameDetalleFormArea.jPanelnombreArea.setVisible(this.areaConstantesFunciones.mostrarnombreArea);
		//this.jInternalFrameDetalleFormArea.jTextFieldsecuencial_pedidoArea.setVisible(this.areaConstantesFunciones.mostrarsecuencial_pedidoArea);
		this.jInternalFrameDetalleFormArea.jPanelsecuencial_pedidoArea.setVisible(this.areaConstantesFunciones.mostrarsecuencial_pedidoArea);
		//this.jInternalFrameDetalleFormArea.jTextFieldsecuencial_cotizacionArea.setVisible(this.areaConstantesFunciones.mostrarsecuencial_cotizacionArea);
		this.jInternalFrameDetalleFormArea.jPanelsecuencial_cotizacionArea.setVisible(this.areaConstantesFunciones.mostrarsecuencial_cotizacionArea);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioArea() throws Exception {
		if(this.jInternalFrameDetalleFormArea==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormArea!=null) {
	
		this.jInternalFrameDetalleFormArea.jLabelidArea.setEnabled(this.areaConstantesFunciones.activaridArea);
		this.jInternalFrameDetalleFormArea.jComboBoxid_empresaArea.setEnabled(this.areaConstantesFunciones.activarid_empresaArea);
		this.jInternalFrameDetalleFormArea.jComboBoxid_empleadoArea.setEnabled(this.areaConstantesFunciones.activarid_empleadoArea);
			this.jInternalFrameDetalleFormArea.jButtonid_empleadoArea.setEnabled(this.areaConstantesFunciones.activarid_empleadoArea);
		this.jInternalFrameDetalleFormArea.jComboBoxid_empleado_sustitutoArea.setEnabled(this.areaConstantesFunciones.activarid_empleado_sustitutoArea);
			this.jInternalFrameDetalleFormArea.jButtonid_empleado_sustitutoArea.setEnabled(this.areaConstantesFunciones.activarid_empleado_sustitutoArea);
		this.jInternalFrameDetalleFormArea.jTextFieldcodigoArea.setEnabled(this.areaConstantesFunciones.activarcodigoArea);
		this.jInternalFrameDetalleFormArea.jTextAreanombreArea.setEnabled(this.areaConstantesFunciones.activarnombreArea);
		this.jInternalFrameDetalleFormArea.jTextFieldsecuencial_pedidoArea.setEnabled(this.areaConstantesFunciones.activarsecuencial_pedidoArea);
		this.jInternalFrameDetalleFormArea.jTextFieldsecuencial_cotizacionArea.setEnabled(this.areaConstantesFunciones.activarsecuencial_cotizacionArea);
		}
	}
	
		
}