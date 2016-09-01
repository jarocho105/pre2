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

import com.bydan.erp.nomina.util.UtilidadEmpleadoConstantesFunciones;
import com.bydan.erp.nomina.util.UtilidadEmpleadoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.UtilidadEmpleadoParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.UtilidadEmpleadoBean;
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
public class UtilidadEmpleadoBeanSwingJInternalFrame extends UtilidadEmpleadoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(UtilidadEmpleadoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<UtilidadEmpleado> utilidadempleadoValidator = new ClassValidator<UtilidadEmpleado>(UtilidadEmpleado.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public UtilidadEmpleado utilidadempleado;	
	public UtilidadEmpleado utilidadempleadoAux;
	public UtilidadEmpleado utilidadempleadoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public UtilidadEmpleado utilidadempleadoTotales;
	public Long idUtilidadEmpleadoActual;
	public Long iIdNuevoUtilidadEmpleado=0L;
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

	public String sFinalQueryComboAnio="";

	public List<Anio> aniosForeignKey;

	public List<Anio> getaniosForeignKey() {
		return aniosForeignKey;
	}

	public void setaniosForeignKey(List<Anio> aniosForeignKey) {
		this.aniosForeignKey = aniosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Anio anioForeignKey;

	public Anio getanioForeignKey() {
		return anioForeignKey;
	}

	public void setanioForeignKey(Anio anioForeignKey) {
		this.anioForeignKey = anioForeignKey;
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
	
	public Boolean isPermisoTodoUtilidadEmpleado;
	public Boolean isPermisoNuevoUtilidadEmpleado;
	public Boolean isPermisoActualizarUtilidadEmpleado;
	public Boolean isPermisoActualizarOriginalUtilidadEmpleado;
	public Boolean isPermisoEliminarUtilidadEmpleado;
	public Boolean isPermisoGuardarCambiosUtilidadEmpleado;
	public Boolean isPermisoConsultaUtilidadEmpleado;
	public Boolean isPermisoBusquedaUtilidadEmpleado;
	public Boolean isPermisoReporteUtilidadEmpleado;
	public Boolean isPermisoPaginacionMedioUtilidadEmpleado;
	public Boolean isPermisoPaginacionAltoUtilidadEmpleado;
	public Boolean isPermisoPaginacionTodoUtilidadEmpleado;
	public Boolean isPermisoCopiarUtilidadEmpleado;
	public Boolean isPermisoVerFormUtilidadEmpleado;
	public Boolean isPermisoDuplicarUtilidadEmpleado;
	public Boolean isPermisoOrdenUtilidadEmpleado;
	
	
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
	
	public UtilidadEmpleadoParameterReturnGeneral utilidadempleadoReturnGeneral;
	public UtilidadEmpleadoParameterReturnGeneral utilidadempleadoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoUtilidadEmpleado=false;
	public Boolean esParaAccionDesdeFormularioUtilidadEmpleado=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected UtilidadEmpleadoSessionBeanAdditional utilidadempleadoSessionBeanAdditional=null;
	
	public UtilidadEmpleadoSessionBeanAdditional getUtilidadEmpleadoSessionBeanAdditional() {
		return this.utilidadempleadoSessionBeanAdditional;
	}
	
	public void setUtilidadEmpleadoSessionBeanAdditional(UtilidadEmpleadoSessionBeanAdditional utilidadempleadoSessionBeanAdditional) {
		try {
			this.utilidadempleadoSessionBeanAdditional=utilidadempleadoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected UtilidadEmpleadoBeanSwingJInternalFrameAdditional utilidadempleadoBeanSwingJInternalFrameAdditional=null;
	//public class UtilidadEmpleadoBeanSwingJInternalFrame
	
	public UtilidadEmpleadoBeanSwingJInternalFrameAdditional getUtilidadEmpleadoBeanSwingJInternalFrameAdditional() {
		return this.utilidadempleadoBeanSwingJInternalFrameAdditional;
	}
	
	public void setUtilidadEmpleadoBeanSwingJInternalFrameAdditional(UtilidadEmpleadoBeanSwingJInternalFrameAdditional utilidadempleadoBeanSwingJInternalFrameAdditional) {
		try {
			this.utilidadempleadoBeanSwingJInternalFrameAdditional=utilidadempleadoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public UtilidadEmpleadoLogic utilidadempleadoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public UtilidadEmpleado utilidadempleadoBean;
	public UtilidadEmpleadoConstantesFunciones utilidadempleadoConstantesFunciones;
	//public UtilidadEmpleadoParameterReturnGeneral utilidadempleadoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EmpleadoLogic empleadoLogic;
	public AnioLogic anioLogic;
	
	//PARAMETROS
	
	
	//public List<UtilidadEmpleado> utilidadempleados;	
	//public List<UtilidadEmpleado> utilidadempleadosEliminados;
	//public List<UtilidadEmpleado> utilidadempleadosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoUtilidadEmpleado=false;
	public Boolean isVisibilidadCeldaDuplicarUtilidadEmpleado=true;
	public Boolean isVisibilidadCeldaCopiarUtilidadEmpleado=true;
	public Boolean isVisibilidadCeldaVerFormUtilidadEmpleado=true;
	public Boolean isVisibilidadCeldaOrdenUtilidadEmpleado=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesUtilidadEmpleado=false;
	public Boolean isVisibilidadCeldaModificarUtilidadEmpleado=false;
	public Boolean isVisibilidadCeldaActualizarUtilidadEmpleado=false;
	public Boolean isVisibilidadCeldaEliminarUtilidadEmpleado=false;
	public Boolean isVisibilidadCeldaCancelarUtilidadEmpleado=false;
	public Boolean isVisibilidadCeldaGuardarUtilidadEmpleado=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosUtilidadEmpleado=false;	
	
	
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoUtilidadEmpleado() {
		return this.iIdNuevoUtilidadEmpleado;
	}

	public void setiIdNuevoUtilidadEmpleado(Long iIdNuevoUtilidadEmpleado) {
		this.iIdNuevoUtilidadEmpleado = iIdNuevoUtilidadEmpleado;
	}
	
	public Long getidUtilidadEmpleadoActual() {
		return this.idUtilidadEmpleadoActual;
	}

	public void setidUtilidadEmpleadoActual(Long idUtilidadEmpleadoActual) {
		this.idUtilidadEmpleadoActual = idUtilidadEmpleadoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public UtilidadEmpleado getutilidadempleado() {
		return this.utilidadempleado;
	}

	public void setutilidadempleado(UtilidadEmpleado utilidadempleado) {
		this.utilidadempleado = utilidadempleado;
	}
	
	public UtilidadEmpleado getutilidadempleadoAux() {
		return this.utilidadempleadoAux;
	}

	public void setutilidadempleadoAux(UtilidadEmpleado utilidadempleadoAux) {
		this.utilidadempleadoAux = utilidadempleadoAux;
	}				
	
	public UtilidadEmpleado getutilidadempleadoAnterior() {
		return this.utilidadempleadoAnterior;
	}

	public void setutilidadempleadoAnterior(UtilidadEmpleado utilidadempleadoAnterior) {
		this.utilidadempleadoAnterior = utilidadempleadoAnterior;
	}	
	
	public UtilidadEmpleado getutilidadempleadoTotales() {
		return this.utilidadempleadoTotales;
	}

	public void setutilidadempleadoTotales(UtilidadEmpleado utilidadempleadoTotales) {
		this.utilidadempleadoTotales = utilidadempleadoTotales;
	}	
	
	public UtilidadEmpleado getutilidadempleadoBean() {
		return this.utilidadempleadoBean;
	}

	public void setutilidadempleadoBean(UtilidadEmpleado utilidadempleadoBean) {
		this.utilidadempleadoBean = utilidadempleadoBean;
	}	
	
	public UtilidadEmpleadoParameterReturnGeneral getutilidadempleadoReturnGeneral() {
		return this.utilidadempleadoReturnGeneral;
	}

	public void setutilidadempleadoReturnGeneral(UtilidadEmpleadoParameterReturnGeneral utilidadempleadoReturnGeneral) {
		this.utilidadempleadoReturnGeneral = utilidadempleadoReturnGeneral;
	}	
	
	
	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
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
	
	
	public UtilidadEmpleadoLogic getUtilidadEmpleadoLogic()	{		
		return utilidadempleadoLogic;
	}

	public void setUtilidadEmpleadoLogic(UtilidadEmpleadoLogic utilidadempleadoLogic) {
		this.utilidadempleadoLogic = utilidadempleadoLogic;
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
	
	public Boolean getIsEsNuevoUtilidadEmpleado() {
		return isEsNuevoUtilidadEmpleado;
	}

	public void setIsEsNuevoUtilidadEmpleado(Boolean isEsNuevoUtilidadEmpleado) {
		this.isEsNuevoUtilidadEmpleado = isEsNuevoUtilidadEmpleado;
	}

	public Boolean getEsParaAccionDesdeFormularioUtilidadEmpleado() {
		return esParaAccionDesdeFormularioUtilidadEmpleado;
	}
	
	public void setEsParaAccionDesdeFormularioUtilidadEmpleado(Boolean esParaAccionDesdeFormularioUtilidadEmpleado) {
		this.esParaAccionDesdeFormularioUtilidadEmpleado = esParaAccionDesdeFormularioUtilidadEmpleado;
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

			if(this.utilidadempleadoSessionBean==null) {
				this.utilidadempleadoSessionBean=new UtilidadEmpleadoSessionBean();
			}

			if(!this.utilidadempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(utilidadempleadoSessionBean.getlidEmpresaActual());
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

			if(this.utilidadempleadoSessionBean==null) {
				this.utilidadempleadoSessionBean=new UtilidadEmpleadoSessionBean();
			}

			if(!this.utilidadempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(utilidadempleadoSessionBean.getlidEmpleadoActual());
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

	public void cargarCombosAniosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.aniosForeignKey=new ArrayList<Anio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AnioLogic anioLogic=new AnioLogic();

			//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

			if(this.utilidadempleadoSessionBean==null) {
				this.utilidadempleadoSessionBean=new UtilidadEmpleadoSessionBean();
			}

			if(!this.utilidadempleadoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

					anioLogic.getTodosAniosWithConnection(sFinalQuery,new Pagination());

					this.aniosForeignKey=anioLogic.getAnios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAnio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getEntityWithConnection(utilidadempleadoSessionBean.getlidAnioActual());
					this.aniosForeignKey.add(anioLogic.getAnio());
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

					if(this.utilidadempleado!=null) {
						this.utilidadempleado.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {
						this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_empresaUtilidadEmpleado.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaUtilidadEmpleado.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {
						if(this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_empresaUtilidadEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_empresaUtilidadEmpleado.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaUtilidadEmpleadoGenerico)throws Exception
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
				jComboBoxid_empresaUtilidadEmpleadoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaUtilidadEmpleadoGenerico!=null && jComboBoxid_empresaUtilidadEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_empresaUtilidadEmpleadoGenerico.setSelectedIndex(0);
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

					if(this.utilidadempleado!=null) {
						this.utilidadempleado.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {
						this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_empleadoUtilidadEmpleado.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoUtilidadEmpleado.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {
						if(this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_empleadoUtilidadEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_empleadoUtilidadEmpleado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoUtilidadEmpleado!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoUtilidadEmpleado.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoUtilidadEmpleado!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoUtilidadEmpleado.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoUtilidadEmpleado.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoUtilidadEmpleado.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoUtilidadEmpleadoGenerico)throws Exception
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
				jComboBoxid_empleadoUtilidadEmpleadoGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoUtilidadEmpleadoGenerico!=null && jComboBoxid_empleadoUtilidadEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_empleadoUtilidadEmpleadoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAnioForeignKey(Long idAnioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(anioTemp!=null) {

					if(this.utilidadempleado!=null) {
						this.utilidadempleado.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {
						this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_anioUtilidadEmpleado.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioUtilidadEmpleado.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {
						if(this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_anioUtilidadEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_anioUtilidadEmpleado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioTemp!=null && jComboBoxid_anioFK_IdAnioUtilidadEmpleado!=null) {
						jComboBoxid_anioFK_IdAnioUtilidadEmpleado.setSelectedItem(anioTemp);
					} else {
						if(jComboBoxid_anioFK_IdAnioUtilidadEmpleado!=null) {
							//jComboBoxid_anioFK_IdAnioUtilidadEmpleado.setSelectedItem(anioTemp);
							if(jComboBoxid_anioFK_IdAnioUtilidadEmpleado.getItemCount()>0) {
								jComboBoxid_anioFK_IdAnioUtilidadEmpleado.setSelectedIndex(0);
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

	public String getActualAnioForeignKeyDescripcion(Long idAnioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}


			sDescripcion=AnioConstantesFunciones.getAnioDescripcion(anioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioUtilidadEmpleadoGenerico)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(anioTemp!=null) {
				jComboBoxid_anioUtilidadEmpleadoGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioUtilidadEmpleadoGenerico!=null && jComboBoxid_anioUtilidadEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_anioUtilidadEmpleadoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(UtilidadEmpleado utilidadempleado,JComboBox jComboBoxid_empresaUtilidadEmpleadoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaUtilidadEmpleadoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_empresaUtilidadEmpleado.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaUtilidadEmpleadoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				utilidadempleado.setid_empresa(empresaAux.getId());
				utilidadempleado.setempresa_descripcion(UtilidadEmpleadoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				utilidadempleado.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(UtilidadEmpleado utilidadempleado,JComboBox jComboBoxid_empleadoUtilidadEmpleadoGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoUtilidadEmpleadoGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_empleadoUtilidadEmpleado.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoUtilidadEmpleadoGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				utilidadempleado.setid_empleado(empleadoAux.getId());
				utilidadempleado.setempleado_descripcion(UtilidadEmpleadoConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				utilidadempleado.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(UtilidadEmpleado utilidadempleado,JComboBox jComboBoxid_anioUtilidadEmpleadoGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioUtilidadEmpleadoGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_anioUtilidadEmpleado.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioUtilidadEmpleadoGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				utilidadempleado.setid_anio(anioAux.getId());
				utilidadempleado.setanio_descripcion(UtilidadEmpleadoConstantesFunciones.getAnioDescripcion(anioAux));
				utilidadempleado.setAnio(anioAux);			}
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

					if(!UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) { 
							this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_empresaUtilidadEmpleado.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_empresaUtilidadEmpleado.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) { 
					}

					if(!UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) { 
							this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_empleadoUtilidadEmpleado.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_empleadoUtilidadEmpleado.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) { 
					}

					if(!UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoUtilidadEmpleado.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoUtilidadEmpleado.addItem(empleado);
							}
						}

						if(!UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAniosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAnio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) { 
							this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_anioUtilidadEmpleado.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_anioUtilidadEmpleado.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) { 
					}

					if(!UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anioFK_IdAnioUtilidadEmpleado.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jComboBoxid_anioFK_IdAnioUtilidadEmpleado.addItem(anio);
							}
						}

						if(!UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {
							this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_empresaUtilidadEmpleado.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {
							this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_empresaUtilidadEmpleado.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {
							this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_empleadoUtilidadEmpleado.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {
							this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_empleadoUtilidadEmpleado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoUtilidadEmpleado.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoUtilidadEmpleado.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameAnioForeignKey(Anio anio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {
							this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_anioUtilidadEmpleado.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {
							this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_anioUtilidadEmpleado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_anioFK_IdAnioUtilidadEmpleado.setSelectedItem(anio);
						} else {
							this.jComboBoxid_anioFK_IdAnioUtilidadEmpleado.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesUtilidadEmpleado() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			UtilidadEmpleadoConstantesFunciones.refrescarForeignKeysDescripcionesUtilidadEmpleado(this.utilidadempleadoLogic.getUtilidadEmpleados());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			UtilidadEmpleadoConstantesFunciones.refrescarForeignKeysDescripcionesUtilidadEmpleado(this.utilidadempleados);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(Anio.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//utilidadempleadoLogic.setUtilidadEmpleados(this.utilidadempleados);
			utilidadempleadoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public UtilidadEmpleadoParameterReturnGeneral getUtilidadEmpleadoParameterGeneral() {
		return this.utilidadempleadoParameterGeneral;
	}
	
	public void setUtilidadEmpleadoParameterGeneral(UtilidadEmpleadoParameterReturnGeneral utilidadempleadoParameterGeneral) {
		this.utilidadempleadoParameterGeneral = utilidadempleadoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoUtilidadEmpleado() {
		return isPermisoTodoUtilidadEmpleado;
	}

	public void setIsPermisoTodoUtilidadEmpleado(Boolean isPermisoTodoUtilidadEmpleado) {
		this.isPermisoTodoUtilidadEmpleado = isPermisoTodoUtilidadEmpleado;
	}

	public Boolean getIsPermisoNuevoUtilidadEmpleado() {
		return isPermisoNuevoUtilidadEmpleado;
	}

	public void setIsPermisoNuevoUtilidadEmpleado(Boolean isPermisoNuevoUtilidadEmpleado) {
		this.isPermisoNuevoUtilidadEmpleado = isPermisoNuevoUtilidadEmpleado;
	}

	public Boolean getIsPermisoActualizarUtilidadEmpleado() {
		return isPermisoActualizarUtilidadEmpleado;
	}

	public void setIsPermisoActualizarUtilidadEmpleado(Boolean isPermisoActualizarUtilidadEmpleado) {
		this.isPermisoActualizarUtilidadEmpleado = isPermisoActualizarUtilidadEmpleado;
	}

	public Boolean getIsPermisoEliminarUtilidadEmpleado() {
		return isPermisoEliminarUtilidadEmpleado;
	}

	public void setIsPermisoEliminarUtilidadEmpleado(Boolean isPermisoEliminarUtilidadEmpleado) {
		this.isPermisoEliminarUtilidadEmpleado = isPermisoEliminarUtilidadEmpleado;
	}

	public Boolean getIsPermisoGuardarCambiosUtilidadEmpleado() {
		return isPermisoGuardarCambiosUtilidadEmpleado;
	}

	public void setIsPermisoGuardarCambiosUtilidadEmpleado(Boolean isPermisoGuardarCambiosUtilidadEmpleado) {
		this.isPermisoGuardarCambiosUtilidadEmpleado = isPermisoGuardarCambiosUtilidadEmpleado;
	}
	
	public Boolean getIsPermisoConsultaUtilidadEmpleado() {
		return isPermisoConsultaUtilidadEmpleado;
	}

	public void setIsPermisoConsultaUtilidadEmpleado(Boolean isPermisoConsultaUtilidadEmpleado) {
		this.isPermisoConsultaUtilidadEmpleado = isPermisoConsultaUtilidadEmpleado;
	}

	public Boolean getIsPermisoBusquedaUtilidadEmpleado() {
		return isPermisoBusquedaUtilidadEmpleado;
	}

	public void setIsPermisoBusquedaUtilidadEmpleado(Boolean isPermisoBusquedaUtilidadEmpleado) {
		this.isPermisoBusquedaUtilidadEmpleado = isPermisoBusquedaUtilidadEmpleado;
	}

	public Boolean getIsPermisoReporteUtilidadEmpleado() {
		return isPermisoReporteUtilidadEmpleado;
	}

	public void setIsPermisoReporteUtilidadEmpleado(Boolean isPermisoReporteUtilidadEmpleado) {
		this.isPermisoReporteUtilidadEmpleado = isPermisoReporteUtilidadEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionMedioUtilidadEmpleado() {
		return isPermisoPaginacionMedioUtilidadEmpleado;
	}

	public void setIsPermisoPaginacionMedioUtilidadEmpleado(Boolean isPermisoPaginacionMedioUtilidadEmpleado) {
		this.isPermisoPaginacionMedioUtilidadEmpleado = isPermisoPaginacionMedioUtilidadEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionTodoUtilidadEmpleado() {
		return isPermisoPaginacionTodoUtilidadEmpleado;
	}

	public void setIsPermisoPaginacionTodoUtilidadEmpleado(Boolean isPermisoPaginacionTodoUtilidadEmpleado) {
		this.isPermisoPaginacionTodoUtilidadEmpleado = isPermisoPaginacionTodoUtilidadEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionAltoUtilidadEmpleado() {
		return isPermisoPaginacionAltoUtilidadEmpleado;
	}

	public void setIsPermisoPaginacionAltoUtilidadEmpleado(Boolean isPermisoPaginacionAltoUtilidadEmpleado) {
		this.isPermisoPaginacionAltoUtilidadEmpleado = isPermisoPaginacionAltoUtilidadEmpleado;
	}
	
	public Boolean getIsPermisoCopiarUtilidadEmpleado() {
		return isPermisoCopiarUtilidadEmpleado;
	}

	public void setIsPermisoCopiarUtilidadEmpleado(Boolean isPermisoCopiarUtilidadEmpleado) {
		this.isPermisoCopiarUtilidadEmpleado = isPermisoCopiarUtilidadEmpleado;
	}
	
	public Boolean getIsPermisoVerFormUtilidadEmpleado() {
		return isPermisoVerFormUtilidadEmpleado;
	}

	public void setIsPermisoVerFormUtilidadEmpleado(Boolean isPermisoVerFormUtilidadEmpleado) {
		this.isPermisoVerFormUtilidadEmpleado = isPermisoVerFormUtilidadEmpleado;
	}
	
	public Boolean getIsPermisoDuplicarUtilidadEmpleado() {
		return isPermisoDuplicarUtilidadEmpleado;
	}

	public void setIsPermisoDuplicarUtilidadEmpleado(Boolean isPermisoDuplicarUtilidadEmpleado) {
		this.isPermisoDuplicarUtilidadEmpleado = isPermisoDuplicarUtilidadEmpleado;
	}
	
	public Boolean getIsPermisoOrdenUtilidadEmpleado() {
		return isPermisoOrdenUtilidadEmpleado;
	}

	public void setIsPermisoOrdenUtilidadEmpleado(Boolean isPermisoOrdenUtilidadEmpleado) {
		this.isPermisoOrdenUtilidadEmpleado = isPermisoOrdenUtilidadEmpleado;
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
	
	public Boolean getIsVisibilidadCeldaNuevoUtilidadEmpleado() {
		return isVisibilidadCeldaNuevoUtilidadEmpleado;
	}

	public void setIsVisibilidadCeldaNuevoUtilidadEmpleado(Boolean isVisibilidadCeldaNuevoUtilidadEmpleado) {
		this.isVisibilidadCeldaNuevoUtilidadEmpleado = isVisibilidadCeldaNuevoUtilidadEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarUtilidadEmpleado() {
		return isVisibilidadCeldaDuplicarUtilidadEmpleado;
	}

	public void setIsVisibilidadCeldaDuplicarUtilidadEmpleado(Boolean isVisibilidadCeldaDuplicarUtilidadEmpleado) {
		this.isVisibilidadCeldaDuplicarUtilidadEmpleado = isVisibilidadCeldaDuplicarUtilidadEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarUtilidadEmpleado() {
		return isVisibilidadCeldaCopiarUtilidadEmpleado;
	}

	public void setIsVisibilidadCeldaCopiarUtilidadEmpleado(Boolean isVisibilidadCeldaCopiarUtilidadEmpleado) {
		this.isVisibilidadCeldaCopiarUtilidadEmpleado = isVisibilidadCeldaCopiarUtilidadEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormUtilidadEmpleado() {
		return isVisibilidadCeldaVerFormUtilidadEmpleado;
	}

	public void setIsVisibilidadCeldaVerFormUtilidadEmpleado(Boolean isVisibilidadCeldaVerFormUtilidadEmpleado) {
		this.isVisibilidadCeldaVerFormUtilidadEmpleado = isVisibilidadCeldaVerFormUtilidadEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenUtilidadEmpleado() {
		return isVisibilidadCeldaOrdenUtilidadEmpleado;
	}

	public void setIsVisibilidadCeldaOrdenUtilidadEmpleado(Boolean isVisibilidadCeldaOrdenUtilidadEmpleado) {
		this.isVisibilidadCeldaOrdenUtilidadEmpleado = isVisibilidadCeldaOrdenUtilidadEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesUtilidadEmpleado() {
		return isVisibilidadCeldaNuevoRelacionesUtilidadEmpleado;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesUtilidadEmpleado(Boolean isVisibilidadCeldaNuevoRelacionesUtilidadEmpleado) {
		this.isVisibilidadCeldaNuevoRelacionesUtilidadEmpleado = isVisibilidadCeldaNuevoRelacionesUtilidadEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaModificarUtilidadEmpleado() {
		return isVisibilidadCeldaModificarUtilidadEmpleado;
	}

	public void setIsVisibilidadCeldaModificarUtilidadEmpleado(Boolean isVisibilidadCeldaModificarUtilidadEmpleado) {
		this.isVisibilidadCeldaModificarUtilidadEmpleado = isVisibilidadCeldaModificarUtilidadEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarUtilidadEmpleado() {
		return isVisibilidadCeldaActualizarUtilidadEmpleado;
	}

	public void setIsVisibilidadCeldaActualizarUtilidadEmpleado(Boolean isVisibilidadCeldaActualizarUtilidadEmpleado) {
		this.isVisibilidadCeldaActualizarUtilidadEmpleado = isVisibilidadCeldaActualizarUtilidadEmpleado;
	}

	public Boolean getIsVisibilidadCeldaEliminarUtilidadEmpleado() {
		return isVisibilidadCeldaEliminarUtilidadEmpleado;
	}

	public void setIsVisibilidadCeldaEliminarUtilidadEmpleado(Boolean isVisibilidadCeldaEliminarUtilidadEmpleado) {
		this.isVisibilidadCeldaEliminarUtilidadEmpleado = isVisibilidadCeldaEliminarUtilidadEmpleado;
	}

	public Boolean getIsVisibilidadCeldaCancelarUtilidadEmpleado() {
		return isVisibilidadCeldaCancelarUtilidadEmpleado;
	}

	public void setIsVisibilidadCeldaCancelarUtilidadEmpleado(Boolean isVisibilidadCeldaCancelarUtilidadEmpleado) {
		this.isVisibilidadCeldaCancelarUtilidadEmpleado = isVisibilidadCeldaCancelarUtilidadEmpleado;
	}

	public Boolean getIsVisibilidadCeldaGuardarUtilidadEmpleado() {
		return isVisibilidadCeldaGuardarUtilidadEmpleado;
	}

	public void setIsVisibilidadCeldaGuardarUtilidadEmpleado(Boolean isVisibilidadCeldaGuardarUtilidadEmpleado) {
		this.isVisibilidadCeldaGuardarUtilidadEmpleado = isVisibilidadCeldaGuardarUtilidadEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosUtilidadEmpleado() {
		return isVisibilidadCeldaGuardarCambiosUtilidadEmpleado;
	}

	public void setIsVisibilidadCeldaGuardarCambiosUtilidadEmpleado(Boolean isVisibilidadCeldaGuardarCambiosUtilidadEmpleado) {
		this.isVisibilidadCeldaGuardarCambiosUtilidadEmpleado = isVisibilidadCeldaGuardarCambiosUtilidadEmpleado;
	}
		
	public UtilidadEmpleadoSessionBean getutilidadempleadoSessionBean() {
		return this.utilidadempleadoSessionBean;
	}
	
	public void setutilidadempleadoSessionBean(UtilidadEmpleadoSessionBean utilidadempleadoSessionBean) {
		this.utilidadempleadoSessionBean=utilidadempleadoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(UtilidadEmpleado utilidadempleado)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(utilidadempleado,null);
				this.setActualParaGuardarEmpleadoForeignKey(utilidadempleado,null);
				this.setActualParaGuardarAnioForeignKey(utilidadempleado,null);
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
	
	public void bugActualizarReferenciaActual(UtilidadEmpleado utilidadempleado,UtilidadEmpleado utilidadempleadoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalUtilidadEmpleado(utilidadempleado);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		utilidadempleadoAux.setId(utilidadempleado.getId());
		utilidadempleadoAux.setVersionRow(utilidadempleado.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessUtilidadEmpleado();
		
			int intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.utilidadempleado,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = utilidadempleadoValidator.getInvalidValues(this.utilidadempleado);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			utilidadempleadoLogic.setDatosCliente(datosCliente);
			utilidadempleadoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				utilidadempleadoAux=new  UtilidadEmpleado();
				
				utilidadempleadoAux.setIsNew(true);
				utilidadempleadoAux.setIsChanged(true);
				
				utilidadempleadoAux.setUtilidadEmpleadoOriginal(this.utilidadempleado);
				
				utilidadempleadoAux.setId(this.utilidadempleado.getId());	
				utilidadempleadoAux.setVersionRow(this.utilidadempleado.getVersionRow());	
				utilidadempleadoAux.setid_empresa(this.utilidadempleado.getid_empresa());	
				utilidadempleadoAux.setid_empleado(this.utilidadempleado.getid_empleado());	
				utilidadempleadoAux.setid_anio(this.utilidadempleado.getid_anio());	
				utilidadempleadoAux.setfecha_ingreso(this.utilidadempleado.getfecha_ingreso());	
				utilidadempleadoAux.setfecha_salida(this.utilidadempleado.getfecha_salida());	
				utilidadempleadoAux.setvalor(this.utilidadempleado.getvalor());	
				utilidadempleadoAux.setnumero_dias(this.utilidadempleado.getnumero_dias());	
				utilidadempleadoAux.setnumero_cargas(this.utilidadempleado.getnumero_cargas());	
				utilidadempleadoAux.setnumero_factor10(this.utilidadempleado.getnumero_factor10());	
				utilidadempleadoAux.setvalor_factor10(this.utilidadempleado.getvalor_factor10());	
				utilidadempleadoAux.setutilidad_factor10(this.utilidadempleado.getutilidad_factor10());	
				utilidadempleadoAux.setnumero_factor5(this.utilidadempleado.getnumero_factor5());	
				utilidadempleadoAux.setvalor_factor5(this.utilidadempleado.getvalor_factor5());	
				utilidadempleadoAux.setutilidad_factor5(this.utilidadempleado.getutilidad_factor5());	
				utilidadempleadoAux.settotal(this.utilidadempleado.gettotal());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.utilidadempleadoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.utilidadempleadoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(utilidadempleadoAux,utilidadempleadoLogic.getUtilidadEmpleados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(utilidadempleadoAux,utilidadempleados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.utilidadempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.utilidadempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadempleadoLogic.saveUtilidadEmpleados();//WithConnection
						//utilidadempleadoLogic.getSetVersionRowUtilidadEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.utilidadempleado,utilidadempleadoAux);
					
					this.refrescarForeignKeysDescripcionesUtilidadEmpleado();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.utilidadempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								utilidadempleadoLogic.saveUtilidadEmpleadoRelaciones(utilidadempleadoAux);//WithConnection
								//utilidadempleadoLogic.getSetVersionRowUtilidadEmpleados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.utilidadempleado,utilidadempleadoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.utilidadempleadoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.utilidadempleadoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(utilidadempleadoAux,utilidadempleadoLogic.getUtilidadEmpleados());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(utilidadempleadoAux,utilidadempleados);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.utilidadempleado,utilidadempleadoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				utilidadempleadoAux=new  UtilidadEmpleado();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.utilidadempleadoSessionBean.getEsGuardarRelacionado() 
					|| (this.utilidadempleadoSessionBean.getEsGuardarRelacionado() && this.utilidadempleado.getId()>=0)) {
						
					utilidadempleadoAux.setIsNew(false);
				}
				
				utilidadempleadoAux.setIsDeleted(false);
			
				utilidadempleadoAux.setId(this.utilidadempleado.getId());	
				utilidadempleadoAux.setVersionRow(this.utilidadempleado.getVersionRow());	
				utilidadempleadoAux.setid_empresa(this.utilidadempleado.getid_empresa());	
				utilidadempleadoAux.setid_empleado(this.utilidadempleado.getid_empleado());	
				utilidadempleadoAux.setid_anio(this.utilidadempleado.getid_anio());	
				utilidadempleadoAux.setfecha_ingreso(this.utilidadempleado.getfecha_ingreso());	
				utilidadempleadoAux.setfecha_salida(this.utilidadempleado.getfecha_salida());	
				utilidadempleadoAux.setvalor(this.utilidadempleado.getvalor());	
				utilidadempleadoAux.setnumero_dias(this.utilidadempleado.getnumero_dias());	
				utilidadempleadoAux.setnumero_cargas(this.utilidadempleado.getnumero_cargas());	
				utilidadempleadoAux.setnumero_factor10(this.utilidadempleado.getnumero_factor10());	
				utilidadempleadoAux.setvalor_factor10(this.utilidadempleado.getvalor_factor10());	
				utilidadempleadoAux.setutilidad_factor10(this.utilidadempleado.getutilidad_factor10());	
				utilidadempleadoAux.setnumero_factor5(this.utilidadempleado.getnumero_factor5());	
				utilidadempleadoAux.setvalor_factor5(this.utilidadempleado.getvalor_factor5());	
				utilidadempleadoAux.setutilidad_factor5(this.utilidadempleado.getutilidad_factor5());	
				utilidadempleadoAux.settotal(this.utilidadempleado.gettotal());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(utilidadempleadoAux,utilidadempleadoLogic.getUtilidadEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(utilidadempleadoAux,utilidadempleados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.utilidadempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.utilidadempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadempleadoLogic.saveUtilidadEmpleados();//WithConnection
						//utilidadempleadoLogic.getSetVersionRowUtilidadEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.utilidadempleado,utilidadempleadoAux);
					
					this.refrescarForeignKeysDescripcionesUtilidadEmpleado();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.utilidadempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								utilidadempleadoLogic.saveUtilidadEmpleadoRelaciones(utilidadempleadoAux);//WithConnection
								//utilidadempleadoLogic.getSetVersionRowUtilidadEmpleados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.utilidadempleado,utilidadempleadoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.utilidadempleadoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.utilidadempleadoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(utilidadempleadoAux,utilidadempleadoLogic.getUtilidadEmpleados());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(utilidadempleadoAux,utilidadempleados);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.utilidadempleado,utilidadempleadoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				utilidadempleadoAux=new  UtilidadEmpleado();
				
				utilidadempleadoAux.setIsNew(false);
				utilidadempleadoAux.setIsChanged(false);
				
				utilidadempleadoAux.setIsDeleted(true);
				
				utilidadempleadoAux.setId(this.utilidadempleado.getId());	
				utilidadempleadoAux.setVersionRow(this.utilidadempleado.getVersionRow());	
				utilidadempleadoAux.setid_empresa(this.utilidadempleado.getid_empresa());	
				utilidadempleadoAux.setid_empleado(this.utilidadempleado.getid_empleado());	
				utilidadempleadoAux.setid_anio(this.utilidadempleado.getid_anio());	
				utilidadempleadoAux.setfecha_ingreso(this.utilidadempleado.getfecha_ingreso());	
				utilidadempleadoAux.setfecha_salida(this.utilidadempleado.getfecha_salida());	
				utilidadempleadoAux.setvalor(this.utilidadempleado.getvalor());	
				utilidadempleadoAux.setnumero_dias(this.utilidadempleado.getnumero_dias());	
				utilidadempleadoAux.setnumero_cargas(this.utilidadempleado.getnumero_cargas());	
				utilidadempleadoAux.setnumero_factor10(this.utilidadempleado.getnumero_factor10());	
				utilidadempleadoAux.setvalor_factor10(this.utilidadempleado.getvalor_factor10());	
				utilidadempleadoAux.setutilidad_factor10(this.utilidadempleado.getutilidad_factor10());	
				utilidadempleadoAux.setnumero_factor5(this.utilidadempleado.getnumero_factor5());	
				utilidadempleadoAux.setvalor_factor5(this.utilidadempleado.getvalor_factor5());	
				utilidadempleadoAux.setutilidad_factor5(this.utilidadempleado.getutilidad_factor5());	
				utilidadempleadoAux.settotal(this.utilidadempleado.gettotal());	
				
				if(this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.utilidadempleadoAux.getId()>=0) {	
						this.utilidadempleadosEliminados.add(utilidadempleadoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(utilidadempleadoAux,utilidadempleadoLogic.getUtilidadEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(utilidadempleadoAux,utilidadempleados);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.utilidadempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.utilidadempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadempleadoLogic.saveUtilidadEmpleados();//WithConnection
						//utilidadempleadoLogic.getSetVersionRowUtilidadEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.utilidadempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								utilidadempleadoLogic.saveUtilidadEmpleadoRelaciones(utilidadempleadoAux);//WithConnection
								//utilidadempleadoLogic.getSetVersionRowUtilidadEmpleados();//WithConnection
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
							if(this.utilidadempleadoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.utilidadempleadoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(utilidadempleadoAux,utilidadempleadoLogic.getUtilidadEmpleados());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(utilidadempleadoAux,utilidadempleados);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.getUtilidadEmpleados().addAll(this.utilidadempleadosEliminados);
					
					utilidadempleadoLogic.saveUtilidadEmpleados();//WithConnection
					//utilidadempleadoLogic.getSetVersionRowUtilidadEmpleados();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesUtilidadEmpleado();
				
				this.utilidadempleadosEliminados= new ArrayList<UtilidadEmpleado>();		
			}
			
			if(this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Utilidad Empleado GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Utilidad Empleado",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.utilidadempleado=utilidadempleadoAux;
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
      		//this.finishProcessUtilidadEmpleado();
      	}
		
	}	
	
	public void actualizarRelaciones(UtilidadEmpleado utilidadempleadoLocal) throws Exception {
		
		if(this.utilidadempleadoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(UtilidadEmpleado utilidadempleadoLocal) throws Exception {	
		if(this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				utilidadempleadoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				utilidadempleadoLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				utilidadempleadoLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarUtilidadEmpleadoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = utilidadempleadoValidator.getInvalidValues(this.utilidadempleado);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(UtilidadEmpleado utilidadempleado,List<UtilidadEmpleado> utilidadempleados) throws Exception {
		try	{		
			UtilidadEmpleadoConstantesFunciones.actualizarLista(utilidadempleado,utilidadempleados,this.utilidadempleadoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(UtilidadEmpleado utilidadempleado,List<UtilidadEmpleado> utilidadempleados) throws Exception {
		try	{			
			UtilidadEmpleadoConstantesFunciones.actualizarSelectedLista(utilidadempleado,utilidadempleados);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<UtilidadEmpleado> utilidadempleadosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				utilidadempleadosLocal=this.utilidadempleadoLogic.getUtilidadEmpleados();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				utilidadempleadosLocal=this.utilidadempleados;
			}
			//ARCHITECTURE
		
			for(UtilidadEmpleado utilidadempleadoLocal:utilidadempleadosLocal) {
				if(this.permiteMantenimiento(utilidadempleadoLocal) && utilidadempleadoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+UtilidadEmpleadoConstantesFunciones.getUtilidadEmpleadoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(UtilidadEmpleadoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelid_empresaUtilidadEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UtilidadEmpleadoConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelid_empleadoUtilidadEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UtilidadEmpleadoConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelid_anioUtilidadEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UtilidadEmpleadoConstantesFunciones.FECHAINGRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelfecha_ingresoUtilidadEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UtilidadEmpleadoConstantesFunciones.FECHASALIDA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelfecha_salidaUtilidadEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UtilidadEmpleadoConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelvalorUtilidadEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UtilidadEmpleadoConstantesFunciones.NUMERODIAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelnumero_diasUtilidadEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UtilidadEmpleadoConstantesFunciones.NUMEROCARGAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelnumero_cargasUtilidadEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UtilidadEmpleadoConstantesFunciones.NUMEROFACTOR10)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelnumero_factor10UtilidadEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UtilidadEmpleadoConstantesFunciones.VALORFACTOR10)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelvalor_factor10UtilidadEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UtilidadEmpleadoConstantesFunciones.UTILIDADFACTOR10)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelutilidad_factor10UtilidadEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UtilidadEmpleadoConstantesFunciones.NUMEROFACTOR5)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelnumero_factor5UtilidadEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UtilidadEmpleadoConstantesFunciones.VALORFACTOR5)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelvalor_factor5UtilidadEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UtilidadEmpleadoConstantesFunciones.UTILIDADFACTOR5)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelutilidad_factor5UtilidadEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UtilidadEmpleadoConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabeltotalUtilidadEmpleado,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelid_empresaUtilidadEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelid_empleadoUtilidadEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelid_anioUtilidadEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelfecha_ingresoUtilidadEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelfecha_salidaUtilidadEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelvalorUtilidadEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelnumero_diasUtilidadEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelnumero_cargasUtilidadEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelnumero_factor10UtilidadEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelvalor_factor10UtilidadEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelutilidad_factor10UtilidadEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelnumero_factor5UtilidadEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelvalor_factor5UtilidadEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelutilidad_factor5UtilidadEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabeltotalUtilidadEmpleado,"");
		
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
		this.iIdNuevoUtilidadEmpleado--;	
		
		
		this.utilidadempleadoAux=new UtilidadEmpleado();
		
		this.utilidadempleadoAux.setId(this.iIdNuevoUtilidadEmpleado);
		this.utilidadempleadoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.utilidadempleadoLogic.getUtilidadEmpleados().add(this.utilidadempleadoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.utilidadempleados.add(this.utilidadempleadoAux);
		}
		//ARCHITECTURE
		
		this.utilidadempleado=this.utilidadempleadoAux;
		
		if(UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioUtilidadEmpleado(this.utilidadempleado);
			this.setVariablesObjetoActualToFormularioForeignKeyUtilidadEmpleado(this.utilidadempleado);
		}
				
		//this.setDefaultControlesUtilidadEmpleado();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyUtilidadEmpleado();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyUtilidadEmpleado();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyUtilidadEmpleado();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualUtilidadEmpleado(this.utilidadempleadoBean,this.utilidadempleado,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.utilidadempleadoSessionBean.getConGuardarRelaciones()) {
			classes=UtilidadEmpleadoConstantesFunciones.getClassesRelationshipsOfUtilidadEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.utilidadempleadoReturnGeneral=utilidadempleadoLogic.procesarEventosUtilidadEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.utilidadempleadoLogic.getUtilidadEmpleados(),this.utilidadempleado,this.utilidadempleadoParameterGeneral,this.isEsNuevoUtilidadEmpleado,classes);//this.utilidadempleadoLogic.getUtilidadEmpleado()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanUtilidadEmpleado(this.utilidadempleadoReturnGeneral,this.utilidadempleadoBean,false);
		
		if(this.utilidadempleadoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyUtilidadEmpleado(this.utilidadempleadoReturnGeneral.getUtilidadEmpleado());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioUtilidadEmpleado(this.utilidadempleadoReturnGeneral.getUtilidadEmpleado());
		}
		
		if(this.utilidadempleadoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioUtilidadEmpleado(this.utilidadempleadoReturnGeneral.getUtilidadEmpleado(),classes);//this.utilidadempleadoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.utilidadempleado,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyUtilidadEmpleado();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyUtilidadEmpleado();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			UtilidadEmpleadoBeanSwingJInternalFrameAdditional.RecargarFormUtilidadEmpleado(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingUtilidadEmpleado(false);
						
			if(utilidadempleadoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualUtilidadEmpleado();
			}
			
			this.actualizarVisualTableDatosUtilidadEmpleado();
			
			this.jTableDatosUtilidadEmpleado.setRowSelectionInterval(this.getIndiceNuevoUtilidadEmpleado(), this.getIndiceNuevoUtilidadEmpleado());
			
			this.seleccionarFilaTablaUtilidadEmpleadoActual();
						
			this.actualizarEstadoCeldasBotonesUtilidadEmpleado("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesUtilidadEmpleado(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormUtilidadEmpleado.jDateChooserfecha_ingresoUtilidadEmpleado.setEnabled(isHabilitar && this.utilidadempleadoConstantesFunciones.activarfecha_ingresoUtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jDateChooserfecha_salidaUtilidadEmpleado.setEnabled(isHabilitar && this.utilidadempleadoConstantesFunciones.activarfecha_salidaUtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldvalorUtilidadEmpleado.setEnabled(isHabilitar && this.utilidadempleadoConstantesFunciones.activarvalorUtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_diasUtilidadEmpleado.setEnabled(isHabilitar && this.utilidadempleadoConstantesFunciones.activarnumero_diasUtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_cargasUtilidadEmpleado.setEnabled(isHabilitar && this.utilidadempleadoConstantesFunciones.activarnumero_cargasUtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_factor10UtilidadEmpleado.setEnabled(isHabilitar && this.utilidadempleadoConstantesFunciones.activarnumero_factor10UtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldvalor_factor10UtilidadEmpleado.setEnabled(isHabilitar && this.utilidadempleadoConstantesFunciones.activarvalor_factor10UtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldutilidad_factor10UtilidadEmpleado.setEnabled(isHabilitar && this.utilidadempleadoConstantesFunciones.activarutilidad_factor10UtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_factor5UtilidadEmpleado.setEnabled(isHabilitar && this.utilidadempleadoConstantesFunciones.activarnumero_factor5UtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldvalor_factor5UtilidadEmpleado.setEnabled(isHabilitar && this.utilidadempleadoConstantesFunciones.activarvalor_factor5UtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldutilidad_factor5UtilidadEmpleado.setEnabled(isHabilitar && this.utilidadempleadoConstantesFunciones.activarutilidad_factor5UtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldtotalUtilidadEmpleado.setEnabled(isHabilitar && this.utilidadempleadoConstantesFunciones.activartotalUtilidadEmpleado);	
		//
		this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_empresaUtilidadEmpleado.setEnabled(isHabilitar && this.utilidadempleadoConstantesFunciones.activarid_empresaUtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_empleadoUtilidadEmpleado.setEnabled(isHabilitar && this.utilidadempleadoConstantesFunciones.activarid_empleadoUtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_anioUtilidadEmpleado.setEnabled(isHabilitar && this.utilidadempleadoConstantesFunciones.activarid_anioUtilidadEmpleado);
	};
	
	public void setDefaultControlesUtilidadEmpleado() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoUtilidadEmpleado(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.utilidadempleadoSessionBean.setConGuardarRelaciones(true);			
			this.utilidadempleadoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTabbedPaneRelacionesUtilidadEmpleado.setVisible(true);
			
					
		} else {
			//this.utilidadempleadoSessionBean.setConGuardarRelaciones(false);			
			this.utilidadempleadoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTabbedPaneRelacionesUtilidadEmpleado.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoUtilidadEmpleado() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UtilidadEmpleado utilidadempleadoAux:this.utilidadempleadoLogic.getUtilidadEmpleados()) {
				if(utilidadempleadoAux.getId().equals(this.iIdNuevoUtilidadEmpleado)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UtilidadEmpleado utilidadempleadoAux:this.utilidadempleados) {
				if(utilidadempleadoAux.getId().equals(this.iIdNuevoUtilidadEmpleado)) {
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
	
	public int getIndiceActualUtilidadEmpleado(UtilidadEmpleado utilidadempleado,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UtilidadEmpleado utilidadempleadoAux:this.utilidadempleadoLogic.getUtilidadEmpleados()) {
				if(utilidadempleadoAux.getId().equals(utilidadempleado.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UtilidadEmpleado utilidadempleadoAux:this.utilidadempleados) {
				if(utilidadempleadoAux.getId().equals(utilidadempleado.getId())) {
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
	
	public void setCamposBaseDesdeOriginalUtilidadEmpleado(UtilidadEmpleado utilidadempleadoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UtilidadEmpleado utilidadempleadoAux:this.utilidadempleadoLogic.getUtilidadEmpleados()) {
				if(utilidadempleadoAux.getUtilidadEmpleadoOriginal().getId().equals(utilidadempleadoOriginal.getId())) {
					existe=true;
					utilidadempleadoOriginal.setId(utilidadempleadoAux.getId());
					utilidadempleadoOriginal.setVersionRow(utilidadempleadoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UtilidadEmpleado utilidadempleadoAux:this.utilidadempleados) {
				if(utilidadempleadoAux.getUtilidadEmpleadoOriginal().getId().equals(utilidadempleadoOriginal.getId())) {
					existe=true;
					utilidadempleadoOriginal.setId(utilidadempleadoAux.getId());
					utilidadempleadoOriginal.setVersionRow(utilidadempleadoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosUtilidadEmpleado(Boolean esParaCancelar) throws Exception {
		utilidadempleadosAux=new ArrayList<UtilidadEmpleado>();
		utilidadempleadoAux=new UtilidadEmpleado();
		
		if(!this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(UtilidadEmpleado utilidadempleadoAux:this.utilidadempleadoLogic.getUtilidadEmpleados()) {
					if(utilidadempleadoAux.getId()<0) {
						utilidadempleadosAux.add(utilidadempleadoAux);
					}		
				}
				this.iIdNuevoUtilidadEmpleado=0L;
				this.utilidadempleadoLogic.getUtilidadEmpleados().removeAll(utilidadempleadosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UtilidadEmpleado utilidadempleadoAux:this.utilidadempleados) {
					if(utilidadempleadoAux.getId()<0) {
						utilidadempleadosAux.add(utilidadempleadoAux);
					}		
				}
				this.iIdNuevoUtilidadEmpleado=0L;
				this.utilidadempleados.removeAll(utilidadempleadosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoUtilidadEmpleado 
					&& this.utilidadempleadoLogic.getUtilidadEmpleados().size()>0
					) {
					utilidadempleadoAux=this.utilidadempleadoLogic.getUtilidadEmpleados().get(this.utilidadempleadoLogic.getUtilidadEmpleados().size() - 1);
				
					if(utilidadempleadoAux.getId()<0) {
						this.utilidadempleadoLogic.getUtilidadEmpleados().remove(utilidadempleadoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoUtilidadEmpleado && this.utilidadempleados.size()>0) {
					utilidadempleadoAux=this.utilidadempleados.get(this.utilidadempleados.size() - 1);
				
					if(utilidadempleadoAux.getId()<0) {
						this.utilidadempleados.remove(utilidadempleadoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoUtilidadEmpleado(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(utilidadempleado.getId()<0) {
				this.utilidadempleadoLogic.getUtilidadEmpleados().remove(this.utilidadempleado);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(utilidadempleado.getId()<0) {
				this.utilidadempleados.remove(this.utilidadempleado);
			}
		}			
	}
	
	public void setEstadosInicialesUtilidadEmpleado(List<UtilidadEmpleado> utilidadempleadosAux) throws Exception {
		UtilidadEmpleadoConstantesFunciones.setEstadosInicialesUtilidadEmpleado(utilidadempleadosAux);
	}
	
	public void setEstadosInicialesUtilidadEmpleado(UtilidadEmpleado utilidadempleadoAux) throws Exception {
		UtilidadEmpleadoConstantesFunciones.setEstadosInicialesUtilidadEmpleado(utilidadempleadoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarUtilidadEmpleadoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesUtilidadEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarUtilidadEmpleadoActual()) {
				if(!this.isEsNuevoUtilidadEmpleado) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesUtilidadEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoUtilidadEmpleado=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarUtilidadEmpleadoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Utilidad Empleado ?", "MANTENIMIENTO DE Utilidad Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesUtilidadEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(UtilidadEmpleado utilidadempleado) throws Exception {
		UtilidadEmpleadoConstantesFunciones.seleccionarAsignar(this.utilidadempleado,utilidadempleado);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarUtilidadEmpleado=this.isPermisoActualizarOriginalUtilidadEmpleado;
			
			
			this.seleccionarAsignar(utilidadempleado);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			UtilidadEmpleadoConstantesFunciones.quitarEspaciosUtilidadEmpleado(this.utilidadempleado,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesUtilidadEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.utilidadempleadoSessionBean.setsFuncionBusquedaRapida(this.utilidadempleadoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoUtilidadEmpleado) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosUtilidadEmpleado(esParaCancelar);				
				this.cancelarNuevoUtilidadEmpleado(esParaCancelar);								
			}
			
			this.utilidadempleado=new UtilidadEmpleado();
			
			this.inicializarUtilidadEmpleado();
			
			this.actualizarEstadoCeldasBotonesUtilidadEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarUtilidadEmpleado() throws Exception {
		try {
			UtilidadEmpleadoConstantesFunciones.inicializarUtilidadEmpleado(this.utilidadempleado);
			
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
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.utilidadempleadoLogic.getUtilidadEmpleados().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteUtilidadEmpleados(String sAccionBusqueda,List<UtilidadEmpleado> utilidadempleadosParaReportes) throws Exception {
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
					sPathReporteFinal="UtilidadEmpleado"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="UtilidadEmpleadoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("UtilidadEmpleadoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="UtilidadEmpleado"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Utilidad Empleados");		
		parameters.put("busquedapor", UtilidadEmpleadoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceUtilidadEmpleado=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			UtilidadEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			UtilidadEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceUtilidadEmpleado=new JRBeanArrayDataSource(UtilidadEmpleadoJInternalFrame.TraerUtilidadEmpleadoBeans(utilidadempleadosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceUtilidadEmpleado);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+UtilidadEmpleadoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+UtilidadEmpleadoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(UtilidadEmpleadoBean.TraerUtilidadEmpleadoBeans(utilidadempleadosParaReportes).toArray()));
							
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
				this.generarExcelReporteUtilidadEmpleados(sAccionBusqueda,sTipoArchivoReporte,utilidadempleadosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalUtilidadEmpleados(sAccionBusqueda,sTipoArchivoReporte,utilidadempleadosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoUtilidadEmpleadoActionPerformed(null);
					//this.generarExcelReporteUtilidadEmpleados(sAccionBusqueda,sTipoArchivoReporte,utilidadempleadosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalUtilidadEmpleados(sAccionBusqueda,sTipoArchivoReporte,utilidadempleadosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesUtilidadEmpleados(sAccionBusqueda,sTipoArchivoReporte,utilidadempleadosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesUtilidadEmpleados(sAccionBusqueda,sTipoArchivoReporte,utilidadempleadosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteUtilidadEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<UtilidadEmpleado> utilidadempleadosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"utilidadempleado";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("UtilidadEmpleados");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderUtilidadEmpleado("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(UtilidadEmpleado utilidadempleado : utilidadempleadosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			UtilidadEmpleadoConstantesFunciones.generarExcelReporteDataUtilidadEmpleado("NORMAL",row,workbook,utilidadempleado,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidad Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderUtilidadEmpleado(String sTipo,Row row,Workbook workbook) {
		
		UtilidadEmpleadoConstantesFunciones.generarExcelReporteHeaderUtilidadEmpleado(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalUtilidadEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<UtilidadEmpleado> utilidadempleadosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"utilidadempleado_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("UtilidadEmpleados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(UtilidadEmpleado utilidadempleado : utilidadempleadosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(UtilidadEmpleadoConstantesFunciones.getUtilidadEmpleadoDescripcion(utilidadempleado));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadempleado.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadempleado.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadEmpleadoConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadempleado.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadEmpleadoConstantesFunciones.LABEL_FECHAINGRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_FECHAINGRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadempleado.getfecha_ingreso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadEmpleadoConstantesFunciones.LABEL_FECHASALIDA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_FECHASALIDA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadempleado.getfecha_salida());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadEmpleadoConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadempleado.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadEmpleadoConstantesFunciones.LABEL_NUMERODIAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_NUMERODIAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadempleado.getnumero_dias());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROCARGAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROCARGAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadempleado.getnumero_cargas());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR10))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR10);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadempleado.getnumero_factor10());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR10))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR10);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadempleado.getvalor_factor10());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR10))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR10);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadempleado.getutilidad_factor10());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR5))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR5);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadempleado.getnumero_factor5());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR5))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR5);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadempleado.getvalor_factor5());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR5))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR5);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadempleado.getutilidad_factor5());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadEmpleadoConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadempleado.gettotal());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidad Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesUtilidadEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<UtilidadEmpleado> utilidadempleadosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<UtilidadEmpleado> utilidadempleadosRespaldo=null;
		
		classes=UtilidadEmpleadoConstantesFunciones.getClassesRelationshipsOfUtilidadEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.utilidadempleadoLogic.setDatosCliente(this.datosCliente);
		this.utilidadempleadoLogic.setDatosDeep(this.datosDeep);
		this.utilidadempleadoLogic.setIsConDeep(true);
		
		utilidadempleadosRespaldo=this.utilidadempleadoLogic.getUtilidadEmpleados();
		
		this.utilidadempleadoLogic.setUtilidadEmpleados(utilidadempleadosParaReportes);	
		this.utilidadempleadoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		utilidadempleadosParaReportes=this.utilidadempleadoLogic.getUtilidadEmpleados();
		this.utilidadempleadoLogic.setUtilidadEmpleados(utilidadempleadosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"utilidadempleado_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("UtilidadEmpleados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderUtilidadEmpleado("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(UtilidadEmpleado utilidadempleado : utilidadempleadosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderUtilidadEmpleado("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			UtilidadEmpleadoConstantesFunciones.generarExcelReporteDataUtilidadEmpleado("NORMAL",row,workbook,utilidadempleado,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(UtilidadEmpleadoConstantesFunciones.getUtilidadEmpleadoDescripcion(utilidadempleado));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidad Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessUtilidadEmpleado() throws Exception {		
		this.startProcessUtilidadEmpleado(true);
	}
	
	public void startProcessUtilidadEmpleado(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasUtilidadEmpleado ,this.jPanelParametrosReportesUtilidadEmpleado, this.jScrollPanelDatosUtilidadEmpleado,this.jPanelPaginacionUtilidadEmpleado, this.jScrollPanelDatosEdicionUtilidadEmpleado, this.jPanelAccionesUtilidadEmpleado,this.jPanelAccionesFormularioUtilidadEmpleado,this.jmenuBarUtilidadEmpleado,this.jmenuBarDetalleUtilidadEmpleado,this.jTtoolBarUtilidadEmpleado,this.jTtoolBarDetalleUtilidadEmpleado);		
		
		final JTabbedPane jTabbedPaneBusquedasUtilidadEmpleado=this.jTabbedPaneBusquedasUtilidadEmpleado; 
		
		final JPanel jPanelParametrosReportesUtilidadEmpleado=this.jPanelParametrosReportesUtilidadEmpleado;
		//final JScrollPane jScrollPanelDatosUtilidadEmpleado=this.jScrollPanelDatosUtilidadEmpleado;
		final JTable jTableDatosUtilidadEmpleado=this.jTableDatosUtilidadEmpleado;		
		final JPanel jPanelPaginacionUtilidadEmpleado=this.jPanelPaginacionUtilidadEmpleado;
		//final JScrollPane jScrollPanelDatosEdicionUtilidadEmpleado=this.jScrollPanelDatosEdicionUtilidadEmpleado;
		final JPanel jPanelAccionesUtilidadEmpleado=this.jPanelAccionesUtilidadEmpleado;
		
		JPanel jPanelCamposAuxiliarUtilidadEmpleado=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarUtilidadEmpleado=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {
			jPanelCamposAuxiliarUtilidadEmpleado=this.jInternalFrameDetalleFormUtilidadEmpleado.jPanelCamposUtilidadEmpleado;
			jPanelAccionesFormularioAuxiliarUtilidadEmpleado=this.jInternalFrameDetalleFormUtilidadEmpleado.jPanelAccionesFormularioUtilidadEmpleado;
		}
		
		final JPanel jPanelCamposUtilidadEmpleado=jPanelCamposAuxiliarUtilidadEmpleado;
		final JPanel jPanelAccionesFormularioUtilidadEmpleado=jPanelAccionesFormularioAuxiliarUtilidadEmpleado;
		
		
		final JMenuBar jmenuBarUtilidadEmpleado=this.jmenuBarUtilidadEmpleado;
		final JToolBar jTtoolBarUtilidadEmpleado=this.jTtoolBarUtilidadEmpleado;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarUtilidadEmpleado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarUtilidadEmpleado=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {
			jmenuBarDetalleAuxiliarUtilidadEmpleado=this.jInternalFrameDetalleFormUtilidadEmpleado.jmenuBarDetalleUtilidadEmpleado;
			jTtoolBarDetalleAuxiliarUtilidadEmpleado=this.jInternalFrameDetalleFormUtilidadEmpleado.jTtoolBarDetalleUtilidadEmpleado;
		}
		
		final JMenuBar jmenuBarDetalleUtilidadEmpleado=jmenuBarDetalleAuxiliarUtilidadEmpleado;
		final JToolBar jTtoolBarDetalleUtilidadEmpleado=jTtoolBarDetalleAuxiliarUtilidadEmpleado;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasUtilidadEmpleado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesUtilidadEmpleado;
			processRunnable.jTableDatos=jTableDatosUtilidadEmpleado;
			processRunnable.jPanelCampos=jPanelCamposUtilidadEmpleado;
			processRunnable.jPanelPaginacion=jPanelPaginacionUtilidadEmpleado;
			processRunnable.jPanelAcciones=jPanelAccionesUtilidadEmpleado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioUtilidadEmpleado;
			
			
			processRunnable.jmenuBar=jmenuBarUtilidadEmpleado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleUtilidadEmpleado;
			processRunnable.jTtoolBar=jTtoolBarUtilidadEmpleado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleUtilidadEmpleado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasUtilidadEmpleado ,jPanelParametrosReportesUtilidadEmpleado,jTableDatosUtilidadEmpleado, /*jScrollPanelDatosUtilidadEmpleado,*/jPanelCamposUtilidadEmpleado,jPanelPaginacionUtilidadEmpleado, /*jScrollPanelDatosEdicionUtilidadEmpleado,*/ jPanelAccionesUtilidadEmpleado,jPanelAccionesFormularioUtilidadEmpleado,jmenuBarUtilidadEmpleado,jmenuBarDetalleUtilidadEmpleado,jTtoolBarUtilidadEmpleado,jTtoolBarDetalleUtilidadEmpleado);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasUtilidadEmpleado ,jPanelParametrosReportesUtilidadEmpleado, jScrollPanelDatosUtilidadEmpleado,jPanelPaginacionUtilidadEmpleado, jScrollPanelDatosEdicionUtilidadEmpleado, jPanelAccionesUtilidadEmpleado,jPanelAccionesFormularioUtilidadEmpleado,jmenuBarUtilidadEmpleado,jmenuBarDetalleUtilidadEmpleado,jTtoolBarUtilidadEmpleado,jTtoolBarDetalleUtilidadEmpleado);
						
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
	
	public void finishProcessUtilidadEmpleado() {// throws Exception 
		this.finishProcessUtilidadEmpleado(true);
	}
	
	public void finishProcessUtilidadEmpleado(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasUtilidadEmpleado ,this.jPanelParametrosReportesUtilidadEmpleado, this.jScrollPanelDatosUtilidadEmpleado,this.jPanelPaginacionUtilidadEmpleado, this.jScrollPanelDatosEdicionUtilidadEmpleado, this.jPanelAccionesUtilidadEmpleado,this.jPanelAccionesFormularioUtilidadEmpleado,this.jmenuBarUtilidadEmpleado,this.jmenuBarDetalleUtilidadEmpleado,this.jTtoolBarUtilidadEmpleado,this.jTtoolBarDetalleUtilidadEmpleado);		
		
		final JTabbedPane jTabbedPaneBusquedasUtilidadEmpleado=this.jTabbedPaneBusquedasUtilidadEmpleado; 
		
		final JPanel jPanelParametrosReportesUtilidadEmpleado=this.jPanelParametrosReportesUtilidadEmpleado;
		//final JScrollPane jScrollPanelDatosUtilidadEmpleado=this.jScrollPanelDatosUtilidadEmpleado;
		final JTable jTableDatosUtilidadEmpleado=this.jTableDatosUtilidadEmpleado;		
		final JPanel jPanelPaginacionUtilidadEmpleado=this.jPanelPaginacionUtilidadEmpleado;
		//final JScrollPane jScrollPanelDatosEdicionUtilidadEmpleado=this.jScrollPanelDatosEdicionUtilidadEmpleado;
		final JPanel jPanelAccionesUtilidadEmpleado=this.jPanelAccionesUtilidadEmpleado;
		
		JPanel jPanelCamposAuxiliarUtilidadEmpleado=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarUtilidadEmpleado=new JPanel();
		
		if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {
			jPanelCamposAuxiliarUtilidadEmpleado=this.jInternalFrameDetalleFormUtilidadEmpleado.jPanelCamposUtilidadEmpleado;
			jPanelAccionesFormularioAuxiliarUtilidadEmpleado=this.jInternalFrameDetalleFormUtilidadEmpleado.jPanelAccionesFormularioUtilidadEmpleado;
		}
		
		final JPanel jPanelCamposUtilidadEmpleado=jPanelCamposAuxiliarUtilidadEmpleado;
		final JPanel jPanelAccionesFormularioUtilidadEmpleado=jPanelAccionesFormularioAuxiliarUtilidadEmpleado;
		
		
		final JMenuBar jmenuBarUtilidadEmpleado=this.jmenuBarUtilidadEmpleado;		
		final JToolBar jTtoolBarUtilidadEmpleado=this.jTtoolBarUtilidadEmpleado;
				
		JMenuBar jmenuBarDetalleAuxiliarUtilidadEmpleado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarUtilidadEmpleado=new JToolBar();
		
		if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {
			jmenuBarDetalleAuxiliarUtilidadEmpleado=this.jInternalFrameDetalleFormUtilidadEmpleado.jmenuBarDetalleUtilidadEmpleado;
			jTtoolBarDetalleAuxiliarUtilidadEmpleado=this.jInternalFrameDetalleFormUtilidadEmpleado.jTtoolBarDetalleUtilidadEmpleado;		
		}
		
		final JMenuBar jmenuBarDetalleUtilidadEmpleado=jmenuBarDetalleAuxiliarUtilidadEmpleado;
		final JToolBar jTtoolBarDetalleUtilidadEmpleado=jTtoolBarDetalleAuxiliarUtilidadEmpleado;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasUtilidadEmpleado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesUtilidadEmpleado;
			processRunnable.jTableDatos=jTableDatosUtilidadEmpleado;
			processRunnable.jPanelCampos=jPanelCamposUtilidadEmpleado;
			processRunnable.jPanelPaginacion=jPanelPaginacionUtilidadEmpleado;
			processRunnable.jPanelAcciones=jPanelAccionesUtilidadEmpleado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioUtilidadEmpleado;
			
			
			processRunnable.jmenuBar=jmenuBarUtilidadEmpleado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleUtilidadEmpleado;
			processRunnable.jTtoolBar=jTtoolBarUtilidadEmpleado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleUtilidadEmpleado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasUtilidadEmpleado ,jPanelParametrosReportesUtilidadEmpleado, jTableDatosUtilidadEmpleado,/*jScrollPanelDatosUtilidadEmpleado,*/jPanelCamposUtilidadEmpleado,jPanelPaginacionUtilidadEmpleado, /*jScrollPanelDatosEdicionUtilidadEmpleado,*/ jPanelAccionesUtilidadEmpleado,jPanelAccionesFormularioUtilidadEmpleado,jmenuBarUtilidadEmpleado,jmenuBarDetalleUtilidadEmpleado,jTtoolBarUtilidadEmpleado,jTtoolBarDetalleUtilidadEmpleado));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesUtilidadEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarUtilidadEmpleado(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuUtilidadEmpleado(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarUtilidadEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarUtilidadEmpleado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleUtilidadEmpleado,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuUtilidadEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarUtilidadEmpleado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleUtilidadEmpleado,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.utilidadempleadoConstantesFunciones.getsFinalQueryUtilidadEmpleado();
		String  finalQueryPaginacionTodos=this.utilidadempleadoConstantesFunciones.getsFinalQueryUtilidadEmpleado();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=UtilidadEmpleadoConstantesFunciones.getArrayColumnasGlobalesNoUtilidadEmpleado(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=UtilidadEmpleadoConstantesFunciones.getArrayColumnasGlobalesUtilidadEmpleado(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,UtilidadEmpleadoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.utilidadempleadosEliminados= new ArrayList<UtilidadEmpleado>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessUtilidadEmpleado();
		
				///*UtilidadEmpleadoSessionBean*/this.utilidadempleadoSessionBean=new UtilidadEmpleadoSessionBean();
			
			if(this.utilidadempleadoSessionBean==null) {
				this.utilidadempleadoSessionBean=new UtilidadEmpleadoSessionBean();
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
					this.iNumeroPaginacion=UtilidadEmpleadoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=UtilidadEmpleadoConstantesFunciones.getClassesForeignKeysOfUtilidadEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/utilidadempleado."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			utilidadempleadosAux= new ArrayList<UtilidadEmpleado>();
			
				
			utilidadempleadoLogic.setDatosCliente(this.datosCliente);
			utilidadempleadoLogic.setDatosDeep(this.datosDeep);
			utilidadempleadoLogic.setIsConDeep(true);
			
			
			utilidadempleadoLogic.getUtilidadEmpleadoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					utilidadempleadoLogic.getTodosUtilidadEmpleados(finalQueryGlobal,pagination);
					
					//utilidadempleadoLogic.getTodosUtilidadEmpleadosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(utilidadempleadoLogic.getUtilidadEmpleados()==null|| utilidadempleadoLogic.getUtilidadEmpleados().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							utilidadempleadosAux= new ArrayList<UtilidadEmpleado>();
							utilidadempleadosAux.addAll(utilidadempleadoLogic.getUtilidadEmpleados());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadempleadosAux= new ArrayList<UtilidadEmpleado>();
							utilidadempleadosAux.addAll(utilidadempleados);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							utilidadempleadoLogic.getTodosUtilidadEmpleados(finalQueryGlobal+"",this.pagination);												
							
							//utilidadempleadoLogic.getTodosUtilidadEmpleadosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteUtilidadEmpleados("Todos",utilidadempleadoLogic.getUtilidadEmpleados() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							utilidadempleadoLogic.setUtilidadEmpleados(new ArrayList<UtilidadEmpleado>());					
							utilidadempleadoLogic.getUtilidadEmpleados().addAll(utilidadempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadempleados=new ArrayList<UtilidadEmpleado>();
							utilidadempleados.addAll(utilidadempleadosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idUtilidadEmpleado=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idUtilidadEmpleado=this.idActual;
				
				} else if(this.idUtilidadEmpleadoActual!=null && this.idUtilidadEmpleadoActual!=0L) {
					idUtilidadEmpleado=idUtilidadEmpleadoActual;
				}
				
					
				this.sDetalleReporte=UtilidadEmpleadoConstantesFunciones.getDetalleIndicePorId(idUtilidadEmpleado);
				
				this.utilidadempleados=new ArrayList<UtilidadEmpleado>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					utilidadempleadoLogic.getEntity(idUtilidadEmpleado);
					
					//utilidadempleadoLogic.getEntityWithConnection(idUtilidadEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					utilidadempleadoLogic.setUtilidadEmpleados(new ArrayList<UtilidadEmpleado>());
					utilidadempleadoLogic.getUtilidadEmpleados().add(utilidadempleadoLogic.getUtilidadEmpleado());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.utilidadempleados=new ArrayList<UtilidadEmpleado>();
					this.utilidadempleados.add(utilidadempleado);
				}
				
				if(utilidadempleadoLogic.getUtilidadEmpleado()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdAnio")) {
				this.sDetalleReporte=UtilidadEmpleadoConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					utilidadempleadoLogic.getUtilidadEmpleadosFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UtilidadEmpleadoConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UtilidadEmpleadoConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=utilidadempleadoLogic.getUtilidadEmpleados()==null||utilidadempleadoLogic.getUtilidadEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=utilidadempleados==null|| utilidadempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadempleadosAux=new ArrayList<UtilidadEmpleado>();
						utilidadempleadosAux.addAll(utilidadempleadoLogic.getUtilidadEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadempleadosAux=new ArrayList<UtilidadEmpleado>();
							utilidadempleadosAux.addAll(utilidadempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							utilidadempleadoLogic.getUtilidadEmpleadosFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UtilidadEmpleadoConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UtilidadEmpleadoConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteUtilidadEmpleados("FK_IdAnio",utilidadempleadoLogic.getUtilidadEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteUtilidadEmpleados("FK_IdAnio",utilidadempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadempleadoLogic.setUtilidadEmpleados(new ArrayList<UtilidadEmpleado>());
						utilidadempleadoLogic.getUtilidadEmpleados().addAll(utilidadempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadempleados=new ArrayList<UtilidadEmpleado>();
							utilidadempleados.addAll(utilidadempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=UtilidadEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					utilidadempleadoLogic.getUtilidadEmpleadosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UtilidadEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UtilidadEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=utilidadempleadoLogic.getUtilidadEmpleados()==null||utilidadempleadoLogic.getUtilidadEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=utilidadempleados==null|| utilidadempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadempleadosAux=new ArrayList<UtilidadEmpleado>();
						utilidadempleadosAux.addAll(utilidadempleadoLogic.getUtilidadEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadempleadosAux=new ArrayList<UtilidadEmpleado>();
							utilidadempleadosAux.addAll(utilidadempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							utilidadempleadoLogic.getUtilidadEmpleadosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UtilidadEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UtilidadEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteUtilidadEmpleados("FK_IdEmpleado",utilidadempleadoLogic.getUtilidadEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteUtilidadEmpleados("FK_IdEmpleado",utilidadempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadempleadoLogic.setUtilidadEmpleados(new ArrayList<UtilidadEmpleado>());
						utilidadempleadoLogic.getUtilidadEmpleados().addAll(utilidadempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadempleados=new ArrayList<UtilidadEmpleado>();
							utilidadempleados.addAll(utilidadempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=UtilidadEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					utilidadempleadoLogic.getUtilidadEmpleadosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UtilidadEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UtilidadEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=utilidadempleadoLogic.getUtilidadEmpleados()==null||utilidadempleadoLogic.getUtilidadEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=utilidadempleados==null|| utilidadempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadempleadosAux=new ArrayList<UtilidadEmpleado>();
						utilidadempleadosAux.addAll(utilidadempleadoLogic.getUtilidadEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadempleadosAux=new ArrayList<UtilidadEmpleado>();
							utilidadempleadosAux.addAll(utilidadempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							utilidadempleadoLogic.getUtilidadEmpleadosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UtilidadEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UtilidadEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteUtilidadEmpleados("FK_IdEmpresa",utilidadempleadoLogic.getUtilidadEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteUtilidadEmpleados("FK_IdEmpresa",utilidadempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadempleadoLogic.setUtilidadEmpleados(new ArrayList<UtilidadEmpleado>());
						utilidadempleadoLogic.getUtilidadEmpleados().addAll(utilidadempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadempleados=new ArrayList<UtilidadEmpleado>();
							utilidadempleados.addAll(utilidadempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesUtilidadEmpleado();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessUtilidadEmpleado();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=utilidadempleadoLogic.getUtilidadEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=utilidadempleados.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=utilidadempleadoLogic.getUtilidadEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=utilidadempleados.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(UtilidadEmpleado utilidadempleado) {
		Boolean permite=true;
		
		if(this.utilidadempleado.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=UtilidadEmpleadoConstantesFunciones.getOrderByListaUtilidadEmpleado();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=UtilidadEmpleadoConstantesFunciones.getOrderByListaUtilidadEmpleado();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UtilidadEmpleado utilidadempleado:utilidadempleadoLogic.getUtilidadEmpleados()) {
				if(utilidadempleado.getsType().equals(Constantes2.S_TOTALES)) {
					utilidadempleadoTotales=utilidadempleado;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UtilidadEmpleado utilidadempleado:this.utilidadempleados) {
				if(utilidadempleado.getsType().equals(Constantes2.S_TOTALES)) {
					utilidadempleadoTotales=utilidadempleado;
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
			this.utilidadempleadoAux=new UtilidadEmpleado();
			this.utilidadempleadoAux.setsType(Constantes2.S_TOTALES);
			this.utilidadempleadoAux.setIsNew(false);
			this.utilidadempleadoAux.setIsChanged(false);
			this.utilidadempleadoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				UtilidadEmpleadoConstantesFunciones.TotalizarValoresFilaUtilidadEmpleado(this.utilidadempleadoLogic.getUtilidadEmpleados(),this.utilidadempleadoAux);
				
				this.utilidadempleadoLogic.getUtilidadEmpleados().add(this.utilidadempleadoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				UtilidadEmpleadoConstantesFunciones.TotalizarValoresFilaUtilidadEmpleado(this.utilidadempleados,this.utilidadempleadoAux);
				
				this.utilidadempleados.add(this.utilidadempleadoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		utilidadempleadoTotales=new UtilidadEmpleado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.utilidadempleadoLogic.getUtilidadEmpleados().remove(utilidadempleadoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.utilidadempleados.remove(utilidadempleadoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		utilidadempleadoTotales=new UtilidadEmpleado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UtilidadEmpleado utilidadempleado:utilidadempleadoLogic.getUtilidadEmpleados()) {
				if(utilidadempleado.getsType().equals(Constantes2.S_TOTALES)) {
					utilidadempleadoTotales=utilidadempleado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				UtilidadEmpleadoConstantesFunciones.TotalizarValoresFilaUtilidadEmpleado(this.utilidadempleadoLogic.getUtilidadEmpleados(),utilidadempleadoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UtilidadEmpleado utilidadempleado:this.utilidadempleados) {
				if(utilidadempleado.getsType().equals(Constantes2.S_TOTALES)) {
					utilidadempleadoTotales=utilidadempleado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				UtilidadEmpleadoConstantesFunciones.TotalizarValoresFilaUtilidadEmpleado(this.utilidadempleados,utilidadempleadoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getUtilidadEmpleadosFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getUtilidadEmpleadosFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getUtilidadEmpleadosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getUtilidadEmpleadosFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					utilidadempleadoLogic.getUtilidadEmpleadosFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getUtilidadEmpleadosFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					utilidadempleadoLogic.getUtilidadEmpleadosFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getUtilidadEmpleadosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					utilidadempleadoLogic.getUtilidadEmpleadosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosUtilidadEmpleado() {
		this.isPermisoTodoUtilidadEmpleado=false;
		this.isPermisoNuevoUtilidadEmpleado=false;
		this.isPermisoActualizarUtilidadEmpleado=false;
		this.isPermisoActualizarOriginalUtilidadEmpleado=false;
		this.isPermisoEliminarUtilidadEmpleado=false;
		this.isPermisoGuardarCambiosUtilidadEmpleado=false;
		this.isPermisoConsultaUtilidadEmpleado=false;
		this.isPermisoBusquedaUtilidadEmpleado=false;
		this.isPermisoReporteUtilidadEmpleado=false;		
		this.isPermisoOrdenUtilidadEmpleado=false;		
		this.isPermisoPaginacionMedioUtilidadEmpleado=false;		
		this.isPermisoPaginacionAltoUtilidadEmpleado=false;
		this.isPermisoPaginacionTodoUtilidadEmpleado=false;
		this.isPermisoCopiarUtilidadEmpleado=false;		
		this.isPermisoVerFormUtilidadEmpleado=false;		
		this.isPermisoDuplicarUtilidadEmpleado=false;		
		this.isPermisoOrdenUtilidadEmpleado=false;		
	}
	
	public void setPermisosUsuarioUtilidadEmpleado(Boolean isPermiso) {
		this.isPermisoTodoUtilidadEmpleado=isPermiso;
		this.isPermisoNuevoUtilidadEmpleado=isPermiso;
		this.isPermisoActualizarUtilidadEmpleado=isPermiso;
		this.isPermisoActualizarOriginalUtilidadEmpleado=isPermiso;
		this.isPermisoEliminarUtilidadEmpleado=isPermiso;
		this.isPermisoGuardarCambiosUtilidadEmpleado=isPermiso;
		this.isPermisoConsultaUtilidadEmpleado=isPermiso;
		this.isPermisoBusquedaUtilidadEmpleado=isPermiso;
		this.isPermisoReporteUtilidadEmpleado=isPermiso;
		this.isPermisoOrdenUtilidadEmpleado=isPermiso;		
		this.isPermisoPaginacionMedioUtilidadEmpleado=isPermiso;		
		this.isPermisoPaginacionAltoUtilidadEmpleado=isPermiso;		
		this.isPermisoPaginacionTodoUtilidadEmpleado=isPermiso;		
		this.isPermisoCopiarUtilidadEmpleado=isPermiso;		
		this.isPermisoVerFormUtilidadEmpleado=isPermiso;		
		this.isPermisoDuplicarUtilidadEmpleado=isPermiso;
		this.isPermisoOrdenUtilidadEmpleado=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioUtilidadEmpleado(Boolean isPermiso) {
		//this.isPermisoTodoUtilidadEmpleado=isPermiso;
		this.isPermisoNuevoUtilidadEmpleado=isPermiso;
		this.isPermisoActualizarUtilidadEmpleado=isPermiso;
		this.isPermisoActualizarOriginalUtilidadEmpleado=isPermiso;
		this.isPermisoEliminarUtilidadEmpleado=isPermiso;
		this.isPermisoGuardarCambiosUtilidadEmpleado=isPermiso;
		//this.isPermisoConsultaUtilidadEmpleado=isPermiso;
		//this.isPermisoBusquedaUtilidadEmpleado=isPermiso;
		//this.isPermisoReporteUtilidadEmpleado=isPermiso;
		//this.isPermisoOrdenUtilidadEmpleado=isPermiso;		
		//this.isPermisoPaginacionMedioUtilidadEmpleado=isPermiso;		
		//this.isPermisoPaginacionAltoUtilidadEmpleado=isPermiso;		
		//this.isPermisoPaginacionTodoUtilidadEmpleado=isPermiso;		
		//this.isPermisoCopiarUtilidadEmpleado=isPermiso;		
		//this.isPermisoDuplicarUtilidadEmpleado=isPermiso;
		//this.isPermisoOrdenUtilidadEmpleado=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioUtilidadEmpleadoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(UtilidadEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebUtilidadEmpleado(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioUtilidadEmpleadoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioUtilidadEmpleadoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionUtilidadEmpleadoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioUtilidadEmpleadoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioUtilidadEmpleado() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(UtilidadEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, UtilidadEmpleadoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoUtilidadEmpleado=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarUtilidadEmpleado=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalUtilidadEmpleado=this.isPermisoActualizarUtilidadEmpleado;
			this.isPermisoEliminarUtilidadEmpleado=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosUtilidadEmpleado=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaUtilidadEmpleado=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaUtilidadEmpleado=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoUtilidadEmpleado=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteUtilidadEmpleado=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenUtilidadEmpleado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioUtilidadEmpleado=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoUtilidadEmpleado=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoUtilidadEmpleado=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarUtilidadEmpleado=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormUtilidadEmpleado=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarUtilidadEmpleado=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenUtilidadEmpleado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosUtilidadEmpleado.setToolTipText(this.jTableDatosUtilidadEmpleado.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioUtilidadEmpleado(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioUtilidadEmpleado(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(UtilidadEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(UtilidadEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioUtilidadEmpleado() throws Exception {
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
	public void inicializarCombosForeignKeyUtilidadEmpleadoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyUtilidadEmpleadoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(UtilidadEmpleadoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyUtilidadEmpleadoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyAnioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AnioConstantesFunciones.SFINALQUERY;

				this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyUtilidadEmpleadoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			UtilidadEmpleadoParameterReturnGeneral utilidadempleadoReturnGeneral=new UtilidadEmpleadoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.utilidadempleadoConstantesFunciones.cargarid_empresaUtilidadEmpleado)
					 || (this.esRecargarFks && this.utilidadempleadoConstantesFunciones.cargarid_empresaUtilidadEmpleado)) {

					if(!this.utilidadempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+utilidadempleadoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.utilidadempleadoConstantesFunciones.cargarid_empleadoUtilidadEmpleado)
					 || (this.esRecargarFks && this.utilidadempleadoConstantesFunciones.cargarid_empleadoUtilidadEmpleado)) {

					if(!this.utilidadempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+utilidadempleadoSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.utilidadempleadoConstantesFunciones.cargarid_anioUtilidadEmpleado)
					 || (this.esRecargarFks && this.utilidadempleadoConstantesFunciones.cargarid_anioUtilidadEmpleado)) {

					if(!this.utilidadempleadoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+utilidadempleadoSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				utilidadempleadoReturnGeneral=utilidadempleadoLogic.cargarCombosLoteForeignKeyUtilidadEmpleado(finalQueryGlobalEmpresa,finalQueryGlobalEmpleado,finalQueryGlobalAnio);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=utilidadempleadoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=utilidadempleadoReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=utilidadempleadoReturnGeneral.getaniosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyUtilidadEmpleado()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyAnio();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.utilidadempleadoSessionBean==null) {
				this.utilidadempleadoSessionBean=new UtilidadEmpleadoSessionBean();
			}

			if(!this.utilidadempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.utilidadempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.utilidadempleadoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				Anio anio=new Anio();
				AnioConstantesFunciones.setAnioDescripcion(anio,Constantes.SMENSAJE_ESCOJA_OPCION);
				anio.setId(null);

				if(!AnioConstantesFunciones.ExisteEnLista(this.aniosForeignKey,anio,true)) {

					this.aniosForeignKey.add(0,anio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyUtilidadEmpleado()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyUtilidadEmpleado(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyUtilidadEmpleado()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
				this.utilidadempleado.setfecha_ingreso(this.parametroGeneralUsuario.getfecha_sistema());
				this.utilidadempleado.setfecha_salida(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyUtilidadEmpleado();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyUtilidadEmpleado(UtilidadEmpleado utilidadempleado)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(utilidadempleado.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyUtilidadEmpleado(UtilidadEmpleado utilidadempleado,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyUtilidadEmpleado()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.utilidadempleadoConstantesFunciones.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyUtilidadEmpleado()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyUtilidadEmpleado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyUtilidadEmpleado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroUtilidadEmpleado()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyUtilidadEmpleado()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyUtilidadEmpleado(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyUtilidadEmpleado()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_empresaUtilidadEmpleado!=null && this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_empresaUtilidadEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_empresaUtilidadEmpleado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_empleadoUtilidadEmpleado!=null && this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_empleadoUtilidadEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_empleadoUtilidadEmpleado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_anioUtilidadEmpleado!=null && this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_anioUtilidadEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_anioUtilidadEmpleado.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public UtilidadEmpleadoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public UtilidadEmpleadoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public UtilidadEmpleadoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.utilidadempleadoSessionBean=new UtilidadEmpleadoSessionBean(); 
		this.utilidadempleadoConstantesFunciones=new UtilidadEmpleadoConstantesFunciones(); 
		this.utilidadempleadoBean=new UtilidadEmpleado();//(this.utilidadempleadoConstantesFunciones); 		
		this.utilidadempleadoReturnGeneral=new UtilidadEmpleadoParameterReturnGeneral(); 
		
		this.utilidadempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.utilidadempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public UtilidadEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public UtilidadEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public UtilidadEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessUtilidadEmpleado(true);
			
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
			
			this.utilidadempleadoConstantesFunciones=new UtilidadEmpleadoConstantesFunciones(); 
			this.utilidadempleadoBean=new UtilidadEmpleado();//this.utilidadempleadoConstantesFunciones); 			
			this.utilidadempleadoReturnGeneral=new UtilidadEmpleadoParameterReturnGeneral(); 
		
			UtilidadEmpleadoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Utilidad Empleado Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.utilidadempleado=new UtilidadEmpleado();
			this.utilidadempleados = new ArrayList<UtilidadEmpleado>();
			this.utilidadempleadosAux = new ArrayList<UtilidadEmpleado>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic=new UtilidadEmpleadoLogic();
				this.utilidadempleadoLogic.getNewConnexionToDeep("");
			}
			
			//this.utilidadempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.utilidadempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormUtilidadEmpleado);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoUtilidadEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoUtilidadEmpleado);	
					}
					
					if(this.jInternalFrameImportacionUtilidadEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionUtilidadEmpleado);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByUtilidadEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByUtilidadEmpleado);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormUtilidadEmpleado);
				this.jInternalFrameDetalleFormUtilidadEmpleado.setVisible(false);
				this.jInternalFrameDetalleFormUtilidadEmpleado.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoUtilidadEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoUtilidadEmpleado);
					this.jInternalFrameReporteDinamicoUtilidadEmpleado.setVisible(false);
					this.jInternalFrameReporteDinamicoUtilidadEmpleado.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionUtilidadEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionUtilidadEmpleado);
					this.jInternalFrameImportacionUtilidadEmpleado.setVisible(false);
					this.jInternalFrameImportacionUtilidadEmpleado.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByUtilidadEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByUtilidadEmpleado);
					this.jInternalFrameOrderByUtilidadEmpleado.setVisible(false);
					this.jInternalFrameOrderByUtilidadEmpleado.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idUtilidadEmpleadoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=UtilidadEmpleadoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.utilidadempleadoReturnGeneral=new UtilidadEmpleadoParameterReturnGeneral();
			
			this.utilidadempleadoParameterGeneral=new UtilidadEmpleadoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.utilidadempleadoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(UtilidadEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,UtilidadEmpleadoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.utilidadempleadoSessionBean.getEsGuardarRelacionado(),this.utilidadempleadoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,UtilidadEmpleadoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.utilidadempleadoSessionBean.getEsGuardarRelacionado(),this.utilidadempleadoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoUtilidadEmpleado=false;
			this.isVisibilidadCeldaDuplicarUtilidadEmpleado=true;
			this.isVisibilidadCeldaCopiarUtilidadEmpleado=true;
			this.isVisibilidadCeldaVerFormUtilidadEmpleado=true;
			this.isVisibilidadCeldaOrdenUtilidadEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadEmpleado=false;
			this.isVisibilidadCeldaModificarUtilidadEmpleado=false;
			this.isVisibilidadCeldaActualizarUtilidadEmpleado=false;
			this.isVisibilidadCeldaEliminarUtilidadEmpleado=false;
			this.isVisibilidadCeldaCancelarUtilidadEmpleado=false;
			this.isVisibilidadCeldaGuardarUtilidadEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosUtilidadEmpleado=false;
			
			
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesUtilidadEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosUtilidadEmpleado();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioUtilidadEmpleado(false);
			
			this.setPermisosUsuarioUtilidadEmpleado();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.utilidadempleadoSessionBean.getEsGuardarRelacionado() 
				|| (this.utilidadempleadoSessionBean.getEsGuardarRelacionado() && this.utilidadempleadoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioUtilidadEmpleadoClasesRelacionadas();
			}
			
			if(this.utilidadempleadoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioUtilidadEmpleadoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosUtilidadEmpleado();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualUtilidadEmpleado();
			}
			
			if(!this.isPermisoBusquedaUtilidadEmpleado) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasUtilidadEmpleado.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioUtilidadEmpleado,this.isPermisoPaginacionMedioUtilidadEmpleado,this.isPermisoPaginacionTodoUtilidadEmpleado);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(UtilidadEmpleadoConstantesFunciones.getTiposSeleccionarUtilidadEmpleado());
				
				this.tiposColumnasSelect=UtilidadEmpleadoConstantesFunciones.getTiposSeleccionarUtilidadEmpleado(true);
				
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
			//if(!this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioUtilidadEmpleado();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioUtilidadEmpleado(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioUtilidadEmpleado(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesUtilidadEmpleado() ;
			
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
			this.anioLogic=new AnioLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				utilidadempleadoImplementable= (UtilidadEmpleadoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+UtilidadEmpleadoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				utilidadempleadoImplementableHome= (UtilidadEmpleadoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+UtilidadEmpleadoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.utilidadempleados= new ArrayList<UtilidadEmpleado>();
			this.utilidadempleadosEliminados= new ArrayList<UtilidadEmpleado>();
						
			this.isEsNuevoUtilidadEmpleado=false;
			this.esParaAccionDesdeFormularioUtilidadEmpleado=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyUtilidadEmpleado(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroUtilidadEmpleado();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			UtilidadEmpleadoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=UtilidadEmpleadoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesUtilidadEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingUtilidadEmpleado(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioUtilidadEmpleado();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioUtilidadEmpleado();
			}
			
			UtilidadEmpleadoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasUtilidadEmpleado.getTabCount(); i++) {
					this.jTabbedPaneBusquedasUtilidadEmpleado.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasUtilidadEmpleado.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessUtilidadEmpleado(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga UtilidadEmpleado: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectUtilidadEmpleado() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesUtilidadEmpleado")) {
				iIndex=this.jInternalFrameDetalleFormUtilidadEmpleado.jTabbedPaneRelacionesUtilidadEmpleado.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormUtilidadEmpleado.jTabbedPaneRelacionesUtilidadEmpleado.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessUtilidadEmpleado();	
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
	
	public void cargarCombosForeignKeyUtilidadEmpleado(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyUtilidadEmpleado(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyUtilidadEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyUtilidadEmpleadoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyUtilidadEmpleado();
		
		this.cargarCombosFrameForeignKeyUtilidadEmpleado();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyUtilidadEmpleado();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyUtilidadEmpleado();
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

	public void cargarCombosForeignKeyAnio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAnio(this.aniosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoUtilidadEmpleadoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.utilidadempleadoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormUtilidadEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
			
			
			if(jTableDatosUtilidadEmpleado.getRowCount()>=1) {
				jTableDatosUtilidadEmpleado.removeRowSelectionInterval(0, jTableDatosUtilidadEmpleado.getRowCount()-1);						
			}
			
			this.isEsNuevoUtilidadEmpleado=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoUtilidadEmpleado(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesUtilidadEmpleado(true);			
			//this.utilidadempleado=new UtilidadEmpleado();
			//this.utilidadempleado.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesUtilidadEmpleado(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUtilidadEmpleado() ;
			
			if(UtilidadEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleUtilidadEmpleado(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.utilidadempleado);	
			this.actualizarInformacion("INFO_PADRE",false,this.utilidadempleado);				
			
			UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
			
			if(this.utilidadempleadoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar UtilidadEmpleado: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarUtilidadEmpleadoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<UtilidadEmpleado> utilidadempleadosSeleccionados=new ArrayList<UtilidadEmpleado>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosUtilidadEmpleado.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosUtilidadEmpleado.getSelectedRows().length;			
			}
			
			utilidadempleadosSeleccionados=this.getUtilidadEmpleadosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoUtilidadEmpleado--;			
				//UtilidadEmpleado utilidadempleadoAux= new UtilidadEmpleado();			
				//utilidadempleadoAux.setId(this.iIdNuevoUtilidadEmpleado);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//UtilidadEmpleado utilidadempleadoOrigen=new UtilidadEmpleado();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(UtilidadEmpleado utilidadempleadoOrigen : utilidadempleadosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							utilidadempleadoOrigen =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadempleadoOrigen =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaUtilidadEmpleado();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.utilidadempleado.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosUtilidadEmpleado(utilidadempleadoOrigen,this.utilidadempleado,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.utilidadempleadoLogic.getUtilidadEmpleados().add(this.utilidadempleadoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.utilidadempleados.add(this.utilidadempleadoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaUtilidadEmpleado(false);
				
				this.jTableDatosUtilidadEmpleado.setRowSelectionInterval(this.getIndiceNuevoUtilidadEmpleado(), this.getIndiceNuevoUtilidadEmpleado());
				
				int iLastRow =  this.jTableDatosUtilidadEmpleado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosUtilidadEmpleado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosUtilidadEmpleado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaUtilidadEmpleado(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarUtilidadEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<UtilidadEmpleado> utilidadempleadosSeleccionados=new ArrayList<UtilidadEmpleado>();									
		
			UtilidadEmpleado utilidadempleadoOrigen=new UtilidadEmpleado();
			UtilidadEmpleado utilidadempleadoDestino=new UtilidadEmpleado();
				
			utilidadempleadosSeleccionados=this.getUtilidadEmpleadosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosUtilidadEmpleado.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || utilidadempleadosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosUtilidadEmpleado.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadempleadoOrigen =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						utilidadempleadoOrigen =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadempleadoDestino =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						utilidadempleadoDestino =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				utilidadempleadoOrigen =utilidadempleadosSeleccionados.get(0);
				utilidadempleadoDestino =utilidadempleadosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosUtilidadEmpleado(utilidadempleadoOrigen,utilidadempleadoDestino,true,false);
				
				utilidadempleadoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(utilidadempleadoDestino,utilidadempleadoLogic.getUtilidadEmpleados());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(utilidadempleadoDestino,utilidadempleados);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaUtilidadEmpleado(false);
				
				//this.jTableDatosUtilidadEmpleado.setRowSelectionInterval(this.getIndiceNuevoUtilidadEmpleado(), this.getIndiceNuevoUtilidadEmpleado());
				
				int iLastRow =  this.jTableDatosUtilidadEmpleado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosUtilidadEmpleado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosUtilidadEmpleado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaUtilidadEmpleado(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormUtilidadEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormUtilidadEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormUtilidadEmpleado.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarUtilidadEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesUtilidadEmpleado.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasUtilidadEmpleado.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesUtilidadEmpleado.setVisible(!isVisible);
			this.jPanelPaginacionUtilidadEmpleado.setVisible(!isVisible);
			this.jPanelAccionesUtilidadEmpleado.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarUtilidadEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameUtilidadEmpleado();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoUtilidadEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoUtilidadEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionUtilidadEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionUtilidadEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByUtilidadEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByUtilidadEmpleado();
			
			this.abrirFrameOrderByUtilidadEmpleado();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByUtilidadEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByUtilidadEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleUtilidadEmpleado(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormUtilidadEmpleado);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormUtilidadEmpleado.isMaximum()) {
					this.jInternalFrameDetalleFormUtilidadEmpleado.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormUtilidadEmpleado.setSize(this.jInternalFrameDetalleFormUtilidadEmpleado.iWidthFormulario,this.jInternalFrameDetalleFormUtilidadEmpleado.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormUtilidadEmpleado.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormUtilidadEmpleado.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormUtilidadEmpleado.isMaximum()) {
						this.jInternalFrameDetalleFormUtilidadEmpleado.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormUtilidadEmpleado.jContentPaneDetalleUtilidadEmpleado.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormUtilidadEmpleado.jTabbedPaneRelacionesUtilidadEmpleado.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormUtilidadEmpleado.jContentPaneDetalleUtilidadEmpleado.getWidth(),UtilidadEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormUtilidadEmpleado.jTabbedPaneRelacionesUtilidadEmpleado.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormUtilidadEmpleado.jContentPaneDetalleUtilidadEmpleado.getWidth(),UtilidadEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormUtilidadEmpleado.jTabbedPaneRelacionesUtilidadEmpleado.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormUtilidadEmpleado.jContentPaneDetalleUtilidadEmpleado.getWidth(),UtilidadEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormUtilidadEmpleado.setVisible(true);
	        this.jInternalFrameDetalleFormUtilidadEmpleado.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByUtilidadEmpleado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByUtilidadEmpleado==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByUtilidadEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUtilidadEmpleado,false,this);
				} else {
					this.jInternalFrameOrderByUtilidadEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUtilidadEmpleado,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByUtilidadEmpleado);
				this.jInternalFrameOrderByUtilidadEmpleado.setVisible(false);
				this.jInternalFrameOrderByUtilidadEmpleado.setSelected(false);
				
				this.jInternalFrameOrderByUtilidadEmpleado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByUtilidadEmpleado"));
				
				this.inicializarActualizarBindingTablaOrderByUtilidadEmpleado();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionUtilidadEmpleado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionUtilidadEmpleado==null) {
				
				this.jInternalFrameImportacionUtilidadEmpleado=new ImportacionJInternalFrame(UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionUtilidadEmpleado);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionUtilidadEmpleado);
				this.jInternalFrameImportacionUtilidadEmpleado.setVisible(false);
				this.jInternalFrameImportacionUtilidadEmpleado.setSelected(false);


				this.jInternalFrameImportacionUtilidadEmpleado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionUtilidadEmpleado"));
				this.jInternalFrameImportacionUtilidadEmpleado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionUtilidadEmpleado"));
				this.jInternalFrameImportacionUtilidadEmpleado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionUtilidadEmpleado"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoUtilidadEmpleado() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoUtilidadEmpleado==null) {
				this.jInternalFrameReporteDinamicoUtilidadEmpleado=new ReporteDinamicoJInternalFrame(UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoUtilidadEmpleado);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoUtilidadEmpleado);
				this.jInternalFrameReporteDinamicoUtilidadEmpleado.setVisible(false);
				this.jInternalFrameReporteDinamicoUtilidadEmpleado.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoUtilidadEmpleado"));
				this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoUtilidadEmpleado"));
				this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoUtilidadEmpleado"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualUtilidadEmpleado();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleUtilidadEmpleado() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormUtilidadEmpleado);
			
	       	this.jInternalFrameDetalleFormUtilidadEmpleado.setVisible(false);
	        this.jInternalFrameDetalleFormUtilidadEmpleado.setSelected(false);
			
			//this.jInternalFrameDetalleFormUtilidadEmpleado.dispose();
			//this.jInternalFrameDetalleFormUtilidadEmpleado=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoUtilidadEmpleado() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoUtilidadEmpleado.setVisible(true);
	        this.jInternalFrameReporteDinamicoUtilidadEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionUtilidadEmpleado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionUtilidadEmpleado.setVisible(true);
	        this.jInternalFrameImportacionUtilidadEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByUtilidadEmpleado() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByUtilidadEmpleado.setVisible(true);
	        this.jInternalFrameOrderByUtilidadEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByUtilidadEmpleado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByUtilidadEmpleado.setVisible(false);
	        this.jInternalFrameOrderByUtilidadEmpleado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoUtilidadEmpleado() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoUtilidadEmpleado.setVisible(false);
	        this.jInternalFrameReporteDinamicoUtilidadEmpleado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionUtilidadEmpleado() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionUtilidadEmpleado.setVisible(false);
	        this.jInternalFrameImportacionUtilidadEmpleado.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarUtilidadEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarUtilidadEmpleado(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarUtilidadEmpleado(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesUtilidadEmpleado(true);
			//this.isEsNuevoUtilidadEmpleado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesUtilidadEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesUtilidadEmpleado(false) ;
			
			if(utilidadempleadoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(UtilidadEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleUtilidadEmpleado(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUtilidadEmpleado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaUtilidadEmpleadoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarUtilidadEmpleado(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormUtilidadEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesUtilidadEmpleado(true);
			//this.isEsNuevoUtilidadEmpleado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.utilidadempleado.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesUtilidadEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesUtilidadEmpleado(false) ;
			
			if(UtilidadEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleUtilidadEmpleado(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUtilidadEmpleado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosUtilidadEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadEmpleado,UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosUtilidadEmpleado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosUtilidadEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadEmpleado,UtilidadEmpleadoConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosUtilidadEmpleado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(aniosForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarUtilidadEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesUtilidadEmpleado(false);
			
			//if(!this.isEsNuevoUtilidadEmpleado) {								
				int intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.utilidadempleado,true);
				this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
				
			}
			
			if(this.permiteMantenimiento(this.utilidadempleado)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoUtilidadEmpleado=true;
					this.inicializarActualizarBindingTablaUtilidadEmpleado(false);
					this.isEsNuevoUtilidadEmpleado=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoUtilidadEmpleado=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoUtilidadEmpleado=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesUtilidadEmpleado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualUtilidadEmpleado(false);
				
				this.habilitarDeshabilitarControlesUtilidadEmpleado(false);
			
												
				
				if(UtilidadEmpleadoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleUtilidadEmpleado();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoUtilidadEmpleadoActionPerformed(evt,utilidadempleadoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualUtilidadEmpleado(this.utilidadempleado,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosUtilidadEmpleado.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,utilidadempleadoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.utilidadempleado.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(UtilidadEmpleado.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadEmpleado.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarUtilidadEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
				this.utilidadempleado.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
				this.utilidadempleado.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.utilidadempleado)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((UtilidadEmpleadoModel) this.jTableDatosUtilidadEmpleado.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoUtilidadEmpleado=true;
				this.inicializarActualizarBindingTablaUtilidadEmpleado(false);
				this.isEsNuevoUtilidadEmpleado=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesUtilidadEmpleado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualUtilidadEmpleado(false);
				
				this.habilitarDeshabilitarControlesUtilidadEmpleado(false);
				
				
				
				if(UtilidadEmpleadoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleUtilidadEmpleado();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarUtilidadEmpleadoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosUtilidadEmpleado.getRowCount()>=1) {
				jTableDatosUtilidadEmpleado.removeRowSelectionInterval(0, jTableDatosUtilidadEmpleado.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesUtilidadEmpleado(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaUtilidadEmpleado(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesUtilidadEmpleado(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUtilidadEmpleado(false) ;
			
			this.isEsNuevoUtilidadEmpleado=false;
			
			if(UtilidadEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleUtilidadEmpleado();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosUtilidadEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingUtilidadEmpleado(false);
				
				//SI ES MANUAL
				if(UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualUtilidadEmpleado();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosUtilidadEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoUtilidadEmpleado--;			
			//UtilidadEmpleado utilidadempleadoAux= new UtilidadEmpleado();			
			//utilidadempleadoAux.setId(this.iIdNuevoUtilidadEmpleado);
			
			if(this.jInternalFrameDetalleFormUtilidadEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaUtilidadEmpleado();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
			
			this.utilidadempleado.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.utilidadempleadoLogic.getUtilidadEmpleados().add(this.utilidadempleadoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.utilidadempleados.add(this.utilidadempleadoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaUtilidadEmpleado(false);
			
			this.jTableDatosUtilidadEmpleado.setRowSelectionInterval(this.getIndiceNuevoUtilidadEmpleado(), this.getIndiceNuevoUtilidadEmpleado());
			
			int iLastRow =  this.jTableDatosUtilidadEmpleado.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosUtilidadEmpleado.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosUtilidadEmpleado.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaUtilidadEmpleado(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionUtilidadEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingUtilidadEmpleado(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUtilidadEmpleado(false);
			
			//SI ES MANUAL
			if(UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualUtilidadEmpleado();
			}
			
			//this.abrirFrameTreeUtilidadEmpleado();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionUtilidadEmpleadoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Utilidad EmpleadoS ?", "MANTENIMIENTO DE Utilidad Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionUtilidadEmpleado.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralUtilidadEmpleado();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.utilidadempleadoReturnGeneral=utilidadempleadoLogic.procesarImportacionUtilidadEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.utilidadempleadoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarUtilidadEmpleadoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionUtilidadEmpleadoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionUtilidadEmpleado.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionUtilidadEmpleado.setFileImportacion(this.jInternalFrameImportacionUtilidadEmpleado.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionUtilidadEmpleado.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionUtilidadEmpleado.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionUtilidadEmpleado.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionUtilidadEmpleado.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoUtilidadEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<UtilidadEmpleado> utilidadempleadosSeleccionados=new ArrayList<UtilidadEmpleado>();		

		utilidadempleadosSeleccionados=this.getUtilidadEmpleadosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("UtilidadEmpleadoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"UtilidadEmpleadoBaseDesign.jrxml";
			
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
			
			this.generarReporteUtilidadEmpleados("Todos",utilidadempleadosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidad Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_FECHAINGRESO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaIngreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaIngreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaIngreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaIngreso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_FECHASALIDA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaSalida_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaSalida_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaSalida_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaSalida_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_NUMERODIAS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroDias_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroDias_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroDias_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroDias_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROCARGAS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCargas_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCargas_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCargas_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCargas_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR10:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroFactor10_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroFactor10_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroFactor10_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroFactor10_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR10:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorFactor10_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorFactor10_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorFactor10_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorFactor10_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR10:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ilidadFactor10_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ilidadFactor10_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ilidadFactor10_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ilidadFactor10_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR5:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroFactor5_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroFactor5_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroFactor5_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroFactor5_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR5:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorFactor5_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorFactor5_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorFactor5_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorFactor5_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR5:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ilidadFactor5_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ilidadFactor5_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ilidadFactor5_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ilidadFactor5_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_FECHAINGRESO:
					sNombreCampoCategoria="fecha_ingreso";
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_FECHASALIDA:
					sNombreCampoCategoria="fecha_salida";
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_NUMERODIAS:
					sNombreCampoCategoria="numero_dias";
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROCARGAS:
					sNombreCampoCategoria="numero_cargas";
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR10:
					sNombreCampoCategoria="numero_factor10";
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR10:
					sNombreCampoCategoria="valor_factor10";
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR10:
					sNombreCampoCategoria="utilidad_factor10";
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR5:
					sNombreCampoCategoria="numero_factor5";
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR5:
					sNombreCampoCategoria="valor_factor5";
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR5:
					sNombreCampoCategoria="utilidad_factor5";
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_FECHAINGRESO:
					sNombreCampoCategoriaValor="fecha_ingreso";
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_FECHASALIDA:
					sNombreCampoCategoriaValor="fecha_salida";
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_NUMERODIAS:
					sNombreCampoCategoriaValor="numero_dias";
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROCARGAS:
					sNombreCampoCategoriaValor="numero_cargas";
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR10:
					sNombreCampoCategoriaValor="numero_factor10";
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR10:
					sNombreCampoCategoriaValor="valor_factor10";
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR10:
					sNombreCampoCategoriaValor="utilidad_factor10";
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR5:
					sNombreCampoCategoriaValor="numero_factor5";
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR5:
					sNombreCampoCategoriaValor="valor_factor5";
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR5:
					sNombreCampoCategoriaValor="utilidad_factor5";
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_FECHAINGRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Ingreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_ingreso");
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_FECHASALIDA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Salida",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_salida");
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_NUMERODIAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Dias",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_dias");
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROCARGAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Cargas",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_cargas");
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR10:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Factor10",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_factor10");
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR10:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Factor10",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_factor10");
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR10:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Utilidad Factor10",sNombreCampoCategoria,sNombreCampoCategoriaValor,"utilidad_factor10");
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR5:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Factor5",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_factor5");
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR5:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Factor5",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_factor5");
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR5:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Utilidad Factor5",sNombreCampoCategoria,sNombreCampoCategoriaValor,"utilidad_factor5");
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
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
	
	public void jButtonGenerarExcelReporteDinamicoUtilidadEmpleadoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<UtilidadEmpleado> utilidadempleadosSeleccionados=new ArrayList<UtilidadEmpleado>();		
		
		utilidadempleadosSeleccionados=this.getUtilidadEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"utilidadempleado";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("UtilidadEmpleados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(UtilidadEmpleado utilidadempleado:utilidadempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadempleado.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(UtilidadEmpleado utilidadempleado:utilidadempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadempleado.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(UtilidadEmpleado utilidadempleado:utilidadempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadempleado.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_FECHAINGRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_FECHAINGRESO);
					iRow++;

					for(UtilidadEmpleado utilidadempleado:utilidadempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadempleado.getfecha_ingreso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_FECHASALIDA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_FECHASALIDA);
					iRow++;

					for(UtilidadEmpleado utilidadempleado:utilidadempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadempleado.getfecha_salida());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(UtilidadEmpleado utilidadempleado:utilidadempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadempleado.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_NUMERODIAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_NUMERODIAS);
					iRow++;

					for(UtilidadEmpleado utilidadempleado:utilidadempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadempleado.getnumero_dias());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROCARGAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROCARGAS);
					iRow++;

					for(UtilidadEmpleado utilidadempleado:utilidadempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadempleado.getnumero_cargas());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR10:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR10);
					iRow++;

					for(UtilidadEmpleado utilidadempleado:utilidadempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadempleado.getnumero_factor10());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR10:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR10);
					iRow++;

					for(UtilidadEmpleado utilidadempleado:utilidadempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadempleado.getvalor_factor10());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR10:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR10);
					iRow++;

					for(UtilidadEmpleado utilidadempleado:utilidadempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadempleado.getutilidad_factor10());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR5:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR5);
					iRow++;

					for(UtilidadEmpleado utilidadempleado:utilidadempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadempleado.getnumero_factor5());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR5:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR5);
					iRow++;

					for(UtilidadEmpleado utilidadempleado:utilidadempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadempleado.getvalor_factor5());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR5:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR5);
					iRow++;

					for(UtilidadEmpleado utilidadempleado:utilidadempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadempleado.getutilidad_factor5());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadEmpleadoConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(UtilidadEmpleado utilidadempleado:utilidadempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadempleado.gettotal());
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
			//	this.getFilaCabeceraExportarExcelUtilidadEmpleado(row);				
			//	iRow++;
			//}				
			
			//for(UtilidadEmpleado utilidadempleadoAux:utilidadempleadosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelUtilidadEmpleado(utilidadempleadoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidad Empleado",JOptionPane.INFORMATION_MESSAGE);
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
				this.utilidadempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUtilidadEmpleado(false);
			
			//SI ES MANUAL
			if(UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualUtilidadEmpleado();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresUtilidadEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUtilidadEmpleado(false);
			
			//SI ES MANUAL
			if(UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualUtilidadEmpleado();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesUtilidadEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUtilidadEmpleado(false);
			
			//SI ES MANUAL
			if(UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualUtilidadEmpleado();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaUtilidadEmpleado() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosUtilidadEmpleado.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosUtilidadEmpleado.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosUtilidadEmpleado.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosUtilidadEmpleado.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosUtilidadEmpleado.setMinimumSize(dimensionMinimum);
		this.jTableDatosUtilidadEmpleado.setMaximumSize(dimensionMaximum);
		this.jTableDatosUtilidadEmpleado.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingUtilidadEmpleado(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingUtilidadEmpleado(esInicializar,true);
	}
	
	public void inicializarActualizarBindingUtilidadEmpleado(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaUtilidadEmpleado(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesUtilidadEmpleado(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasUtilidadEmpleado(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesUtilidadEmpleado(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesUtilidadEmpleado(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualUtilidadEmpleado() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaUtilidadEmpleado();
		
		this.inicializarActualizarBindingBotonesManualUtilidadEmpleado(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualUtilidadEmpleado();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesUtilidadEmpleado() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualUtilidadEmpleado(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualUtilidadEmpleado(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosUtilidadEmpleado.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosUtilidadEmpleado.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteUtilidadEmpleado.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormUtilidadEmpleado.jCheckBoxPostAccionNuevoUtilidadEmpleado.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormUtilidadEmpleado.jCheckBoxPostAccionSinCerrarUtilidadEmpleado.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormUtilidadEmpleado.jCheckBoxPostAccionSinMensajeUtilidadEmpleado.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosUtilidadEmpleado.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosUtilidadEmpleado.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteUtilidadEmpleado.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {
				this.jInternalFrameDetalleFormUtilidadEmpleado.jCheckBoxPostAccionNuevoUtilidadEmpleado.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormUtilidadEmpleado.jCheckBoxPostAccionSinCerrarUtilidadEmpleado.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormUtilidadEmpleado.jCheckBoxPostAccionSinMensajeUtilidadEmpleado.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionUtilidadEmpleado.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionUtilidadEmpleado.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxTiposAccionesFormularioUtilidadEmpleado.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesUtilidadEmpleado.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoUtilidadEmpleado!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesUtilidadEmpleado.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesUtilidadEmpleado.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarUtilidadEmpleado.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesUtilidadEmpleado.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoUtilidadEmpleado!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesUtilidadEmpleado.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralUtilidadEmpleado.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesUtilidadEmpleado(Boolean esInicializar) throws Exception {
		try	{	
			if(UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualUtilidadEmpleado(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesUtilidadEmpleado() throws Exception {
		try	{
			if(UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualUtilidadEmpleado();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleUtilidadEmpleado() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxTiposAccionesFormularioUtilidadEmpleado.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxTiposAccionesFormularioUtilidadEmpleado.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualUtilidadEmpleado() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesUtilidadEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesUtilidadEmpleado.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesUtilidadEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesUtilidadEmpleado.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesUtilidadEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesUtilidadEmpleado.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionUtilidadEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionUtilidadEmpleado.addItem(reporte);
			}
			
			
			if(!this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionUtilidadEmpleado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionUtilidadEmpleado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesUtilidadEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesUtilidadEmpleado.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesUtilidadEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesUtilidadEmpleado.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxTiposAccionesFormularioUtilidadEmpleado.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxTiposAccionesFormularioUtilidadEmpleado.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarUtilidadEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarUtilidadEmpleado.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarUtilidadEmpleado.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualUtilidadEmpleado();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualUtilidadEmpleado() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoUtilidadEmpleado!=null) {
				this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoUtilidadEmpleado!=null) {
				this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoUtilidadEmpleado!=null) {
				
				if(this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=UtilidadEmpleadoConstantesFunciones.getTiposSeleccionarUtilidadEmpleado(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=UtilidadEmpleadoConstantesFunciones.getTiposSeleccionarUtilidadEmpleado(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=UtilidadEmpleadoConstantesFunciones.getTiposSeleccionarUtilidadEmpleado(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualUtilidadEmpleado()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_anioFK_IdAnioUtilidadEmpleado.getSelectedItem()!=null){this.id_anioFK_IdAnio=((Anio)this.jComboBoxid_anioFK_IdAnioUtilidadEmpleado.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleadoFK_IdEmpleadoUtilidadEmpleado.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoUtilidadEmpleado.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasUtilidadEmpleado(Boolean esInicializar) throws Exception {				
		if(UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualUtilidadEmpleado();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaUtilidadEmpleado() throws Exception {
		this.inicializarActualizarBindingTablaUtilidadEmpleado(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByUtilidadEmpleado() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByUtilidadEmpleado.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByUtilidadEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByUtilidadEmpleado.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new UtilidadEmpleadoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByUtilidadEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByUtilidadEmpleado.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new UtilidadEmpleadoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosUtilidadEmpleadoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadEmpleadoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new UtilidadEmpleadoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByUtilidadEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByUtilidadEmpleado.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new UtilidadEmpleadoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByUtilidadEmpleado.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaUtilidadEmpleado(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=utilidadempleadoLogic.getUtilidadEmpleados().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=utilidadempleados.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosUtilidadEmpleado.setModel(new UtilidadEmpleadoModel(this.utilidadempleadoLogic.getUtilidadEmpleados(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosUtilidadEmpleado.setModel(new UtilidadEmpleadoModel(this.utilidadempleados,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByUtilidadEmpleado!=null && this.jInternalFrameOrderByUtilidadEmpleado.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByUtilidadEmpleado();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosUtilidadEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadEmpleado,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new UtilidadEmpleadoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO,utilidadempleadoConstantesFunciones.resaltarSeleccionarUtilidadEmpleado,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+UtilidadEmpleadoConstantesFunciones.SCLASSWEBTITULO,utilidadempleadoConstantesFunciones.resaltarSeleccionarUtilidadEmpleado,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosUtilidadEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadEmpleado,UtilidadEmpleadoConstantesFunciones.LABEL_ID));

		if(this.utilidadempleadoConstantesFunciones.mostraridUtilidadEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadEmpleadoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.utilidadempleadoConstantesFunciones.resaltaridUtilidadEmpleado,this.utilidadempleadoConstantesFunciones.activaridUtilidadEmpleado,iSizeTabla,this,true,"idUtilidadEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.utilidadempleadoConstantesFunciones.resaltaridUtilidadEmpleado,this.utilidadempleadoConstantesFunciones.activaridUtilidadEmpleado,this,true,"idUtilidadEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadEmpleado,UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.utilidadempleadoConstantesFunciones.mostrarid_empresaUtilidadEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.utilidadempleadoConstantesFunciones.resaltarid_empresaUtilidadEmpleado,this,this.utilidadempleadoConstantesFunciones.activarid_empresaUtilidadEmpleado,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.utilidadempleadoConstantesFunciones.resaltarid_empresaUtilidadEmpleado,this,this.utilidadempleadoConstantesFunciones.activarid_empresaUtilidadEmpleado,false,"id_empresaUtilidadEmpleado","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UtilidadEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadEmpleado,UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.utilidadempleadoConstantesFunciones.mostrarid_empleadoUtilidadEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.utilidadempleadoConstantesFunciones.resaltarid_empleadoUtilidadEmpleado,this,this.utilidadempleadoConstantesFunciones.activarid_empleadoUtilidadEmpleado,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.utilidadempleadoConstantesFunciones.resaltarid_empleadoUtilidadEmpleado,this,this.utilidadempleadoConstantesFunciones.activarid_empleadoUtilidadEmpleado,true,"id_empleadoUtilidadEmpleado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new UtilidadEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadEmpleado,UtilidadEmpleadoConstantesFunciones.LABEL_IDANIO));

		if(this.utilidadempleadoConstantesFunciones.mostrarid_anioUtilidadEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadEmpleadoConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.utilidadempleadoConstantesFunciones.resaltarid_anioUtilidadEmpleado,this,this.utilidadempleadoConstantesFunciones.activarid_anioUtilidadEmpleado,iSizeTabla));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.utilidadempleadoConstantesFunciones.resaltarid_anioUtilidadEmpleado,this,this.utilidadempleadoConstantesFunciones.activarid_anioUtilidadEmpleado,true,"id_anioUtilidadEmpleado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UtilidadEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadEmpleado,UtilidadEmpleadoConstantesFunciones.LABEL_FECHAINGRESO));

		if(this.utilidadempleadoConstantesFunciones.mostrarfecha_ingresoUtilidadEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadEmpleadoConstantesFunciones.LABEL_FECHAINGRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.utilidadempleadoConstantesFunciones.resaltarfecha_ingresoUtilidadEmpleado,this.utilidadempleadoConstantesFunciones.activarfecha_ingresoUtilidadEmpleado,iSizeTabla,this,true,"fecha_ingresoUtilidadEmpleado","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.utilidadempleadoConstantesFunciones.resaltarfecha_ingresoUtilidadEmpleado,this.utilidadempleadoConstantesFunciones.activarfecha_ingresoUtilidadEmpleado,this,true,"fecha_ingresoUtilidadEmpleado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new UtilidadEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadEmpleado,UtilidadEmpleadoConstantesFunciones.LABEL_FECHASALIDA));

		if(this.utilidadempleadoConstantesFunciones.mostrarfecha_salidaUtilidadEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadEmpleadoConstantesFunciones.LABEL_FECHASALIDA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.utilidadempleadoConstantesFunciones.resaltarfecha_salidaUtilidadEmpleado,this.utilidadempleadoConstantesFunciones.activarfecha_salidaUtilidadEmpleado,iSizeTabla,this,true,"fecha_salidaUtilidadEmpleado","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.utilidadempleadoConstantesFunciones.resaltarfecha_salidaUtilidadEmpleado,this.utilidadempleadoConstantesFunciones.activarfecha_salidaUtilidadEmpleado,this,true,"fecha_salidaUtilidadEmpleado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new UtilidadEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadEmpleado,UtilidadEmpleadoConstantesFunciones.LABEL_VALOR));

		if(this.utilidadempleadoConstantesFunciones.mostrarvalorUtilidadEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadEmpleadoConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.utilidadempleadoConstantesFunciones.resaltarvalorUtilidadEmpleado,this.utilidadempleadoConstantesFunciones.activarvalorUtilidadEmpleado,iSizeTabla,this,true,"valorUtilidadEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.utilidadempleadoConstantesFunciones.resaltarvalorUtilidadEmpleado,this.utilidadempleadoConstantesFunciones.activarvalorUtilidadEmpleado,this,true,"valorUtilidadEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new UtilidadEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadEmpleado,UtilidadEmpleadoConstantesFunciones.LABEL_NUMERODIAS));

		if(this.utilidadempleadoConstantesFunciones.mostrarnumero_diasUtilidadEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadEmpleadoConstantesFunciones.LABEL_NUMERODIAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.utilidadempleadoConstantesFunciones.resaltarnumero_diasUtilidadEmpleado,this.utilidadempleadoConstantesFunciones.activarnumero_diasUtilidadEmpleado,iSizeTabla,this,true,"numero_diasUtilidadEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.utilidadempleadoConstantesFunciones.resaltarnumero_diasUtilidadEmpleado,this.utilidadempleadoConstantesFunciones.activarnumero_diasUtilidadEmpleado,this,true,"numero_diasUtilidadEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new UtilidadEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadEmpleado,UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROCARGAS));

		if(this.utilidadempleadoConstantesFunciones.mostrarnumero_cargasUtilidadEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROCARGAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.utilidadempleadoConstantesFunciones.resaltarnumero_cargasUtilidadEmpleado,this.utilidadempleadoConstantesFunciones.activarnumero_cargasUtilidadEmpleado,iSizeTabla,this,true,"numero_cargasUtilidadEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.utilidadempleadoConstantesFunciones.resaltarnumero_cargasUtilidadEmpleado,this.utilidadempleadoConstantesFunciones.activarnumero_cargasUtilidadEmpleado,this,true,"numero_cargasUtilidadEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new UtilidadEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadEmpleado,UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR10));

		if(this.utilidadempleadoConstantesFunciones.mostrarnumero_factor10UtilidadEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR10,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.utilidadempleadoConstantesFunciones.resaltarnumero_factor10UtilidadEmpleado,this.utilidadempleadoConstantesFunciones.activarnumero_factor10UtilidadEmpleado,iSizeTabla,this,true,"numero_factor10UtilidadEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.utilidadempleadoConstantesFunciones.resaltarnumero_factor10UtilidadEmpleado,this.utilidadempleadoConstantesFunciones.activarnumero_factor10UtilidadEmpleado,this,true,"numero_factor10UtilidadEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new UtilidadEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadEmpleado,UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR10));

		if(this.utilidadempleadoConstantesFunciones.mostrarvalor_factor10UtilidadEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR10,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.utilidadempleadoConstantesFunciones.resaltarvalor_factor10UtilidadEmpleado,this.utilidadempleadoConstantesFunciones.activarvalor_factor10UtilidadEmpleado,iSizeTabla,this,true,"valor_factor10UtilidadEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.utilidadempleadoConstantesFunciones.resaltarvalor_factor10UtilidadEmpleado,this.utilidadempleadoConstantesFunciones.activarvalor_factor10UtilidadEmpleado,this,true,"valor_factor10UtilidadEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new UtilidadEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadEmpleado,UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR10));

		if(this.utilidadempleadoConstantesFunciones.mostrarutilidad_factor10UtilidadEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR10,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.utilidadempleadoConstantesFunciones.resaltarutilidad_factor10UtilidadEmpleado,this.utilidadempleadoConstantesFunciones.activarutilidad_factor10UtilidadEmpleado,iSizeTabla,this,true,"utilidad_factor10UtilidadEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.utilidadempleadoConstantesFunciones.resaltarutilidad_factor10UtilidadEmpleado,this.utilidadempleadoConstantesFunciones.activarutilidad_factor10UtilidadEmpleado,this,true,"utilidad_factor10UtilidadEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new UtilidadEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadEmpleado,UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR5));

		if(this.utilidadempleadoConstantesFunciones.mostrarnumero_factor5UtilidadEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR5,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.utilidadempleadoConstantesFunciones.resaltarnumero_factor5UtilidadEmpleado,this.utilidadempleadoConstantesFunciones.activarnumero_factor5UtilidadEmpleado,iSizeTabla,this,true,"numero_factor5UtilidadEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.utilidadempleadoConstantesFunciones.resaltarnumero_factor5UtilidadEmpleado,this.utilidadempleadoConstantesFunciones.activarnumero_factor5UtilidadEmpleado,this,true,"numero_factor5UtilidadEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new UtilidadEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadEmpleado,UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR5));

		if(this.utilidadempleadoConstantesFunciones.mostrarvalor_factor5UtilidadEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR5,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.utilidadempleadoConstantesFunciones.resaltarvalor_factor5UtilidadEmpleado,this.utilidadempleadoConstantesFunciones.activarvalor_factor5UtilidadEmpleado,iSizeTabla,this,true,"valor_factor5UtilidadEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.utilidadempleadoConstantesFunciones.resaltarvalor_factor5UtilidadEmpleado,this.utilidadempleadoConstantesFunciones.activarvalor_factor5UtilidadEmpleado,this,true,"valor_factor5UtilidadEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new UtilidadEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadEmpleado,UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR5));

		if(this.utilidadempleadoConstantesFunciones.mostrarutilidad_factor5UtilidadEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR5,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.utilidadempleadoConstantesFunciones.resaltarutilidad_factor5UtilidadEmpleado,this.utilidadempleadoConstantesFunciones.activarutilidad_factor5UtilidadEmpleado,iSizeTabla,this,true,"utilidad_factor5UtilidadEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.utilidadempleadoConstantesFunciones.resaltarutilidad_factor5UtilidadEmpleado,this.utilidadempleadoConstantesFunciones.activarutilidad_factor5UtilidadEmpleado,this,true,"utilidad_factor5UtilidadEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new UtilidadEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadEmpleado,UtilidadEmpleadoConstantesFunciones.LABEL_TOTAL));

		if(this.utilidadempleadoConstantesFunciones.mostrartotalUtilidadEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadEmpleadoConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.utilidadempleadoConstantesFunciones.resaltartotalUtilidadEmpleado,this.utilidadempleadoConstantesFunciones.activartotalUtilidadEmpleado,iSizeTabla,this,true,"totalUtilidadEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.utilidadempleadoConstantesFunciones.resaltartotalUtilidadEmpleado,this.utilidadempleadoConstantesFunciones.activartotalUtilidadEmpleado,this,true,"totalUtilidadEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new UtilidadEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.utilidadempleadoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.utilidadempleadoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.utilidadempleadoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosUtilidadEmpleado.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.utilidadempleadoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.utilidadempleadoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosUtilidadEmpleado.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarUtilidadEmpleado && this.isPermisoGuardarCambiosUtilidadEmpleado) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.utilidadempleadoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.utilidadempleadoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosUtilidadEmpleado.addColumn(tableColumn);
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
			
			this.jTableDatosUtilidadEmpleado.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarUtilidadEmpleado && this.isPermisoGuardarCambiosUtilidadEmpleado) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarUtilidadEmpleado && this.isPermisoGuardarCambiosUtilidadEmpleado) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosUtilidadEmpleado.moveColumn(this.jTableDatosUtilidadEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosUtilidadEmpleado.moveColumn(this.jTableDatosUtilidadEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosUtilidadEmpleado.moveColumn(this.jTableDatosUtilidadEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosUtilidadEmpleado.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosUtilidadEmpleado.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosUtilidadEmpleado,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosUtilidadEmpleado.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosUtilidadEmpleado.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosUtilidadEmpleado.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosUtilidadEmpleado.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosUtilidadEmpleado.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=utilidadempleadoLogic.getUtilidadEmpleados().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=utilidadempleados.size()-1;
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
		//this.jTableDatosUtilidadEmpleado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosUtilidadEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosUtilidadEmpleado();
			
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
				
				//this.isEsNuevoUtilidadEmpleado=false;
					
				UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
			
				if(this.utilidadempleadoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormUtilidadEmpleado==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosUtilidadEmpleado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosUtilidadEmpleado.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.utilidadempleado.getsType().equals("DUPLICADO")
				   || this.utilidadempleado.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoUtilidadEmpleado=true;
				
				} else {
					this.isEsNuevoUtilidadEmpleado=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {
					if(this.utilidadempleado.getId()>=0 && !this.utilidadempleado.getIsNew()) {						
						this.isEsNuevoUtilidadEmpleado=false;
						
					} else {
						this.isEsNuevoUtilidadEmpleado=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoUtilidadEmpleado(esRelaciones);						
				
				this.seleccionarUtilidadEmpleado(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.utilidadempleado.getId()<0) {
					this.isEsNuevoUtilidadEmpleado=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarUtilidadEmpleado(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarUtilidadEmpleado(evt,rowIndex);
				}	
				
				if(this.utilidadempleadoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion UtilidadEmpleado: " + this.dDif); 
					}
				}								
				
				UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarUtilidadEmpleado(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.utilidadempleado)) {
					if(this.utilidadempleado.getId()>0) {
						this.utilidadempleado.setIsDeleted(true);
						
						this.utilidadempleadosEliminados.add(this.utilidadempleado);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.utilidadempleadoLogic.getUtilidadEmpleados().remove(this.utilidadempleado);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.utilidadempleados.remove(this.utilidadempleado);				
					}
					
					
					((UtilidadEmpleadoModel) this.jTableDatosUtilidadEmpleado.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaUtilidadEmpleado(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarUtilidadEmpleado(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoUtilidadEmpleado) {
			
			if(this.jInternalFrameDetalleFormUtilidadEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosUtilidadEmpleado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosUtilidadEmpleado.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioUtilidadEmpleado(this.utilidadempleado);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.utilidadempleadoConstantesFunciones.cargarid_empresaUtilidadEmpleado || this.utilidadempleadoConstantesFunciones.event_dependid_empresaUtilidadEmpleado) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.utilidadempleado.getid_empresa());
									//this.inicializarActualizarBindingUtilidadEmpleado(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(utilidadempleado.getEmpresa()!=null) {
							this.empresasForeignKey.add(utilidadempleado.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.utilidadempleado.getid_empresa(),false,"Formulario");

					//Empleado
					if(!this.utilidadempleadoConstantesFunciones.cargarid_empleadoUtilidadEmpleado || this.utilidadempleadoConstantesFunciones.event_dependid_empleadoUtilidadEmpleado) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.utilidadempleado.getid_empleado());
									//this.inicializarActualizarBindingUtilidadEmpleado(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(utilidadempleado.getEmpleado()!=null) {
							this.empleadosForeignKey.add(utilidadempleado.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.utilidadempleado.getid_empleado(),false,"Formulario");

					//Anio
					if(!this.utilidadempleadoConstantesFunciones.cargarid_anioUtilidadEmpleado || this.utilidadempleadoConstantesFunciones.event_dependid_anioUtilidadEmpleado) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.utilidadempleado.getid_anio());
									//this.inicializarActualizarBindingUtilidadEmpleado(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(utilidadempleado.getAnio()!=null) {
							this.aniosForeignKey.add(utilidadempleado.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.utilidadempleado.getid_anio(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesUtilidadEmpleado("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesUtilidadEmpleado(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualUtilidadEmpleado() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoUtilidadEmpleado(UtilidadEmpleado utilidadempleado) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoUtilidadEmpleado(utilidadempleado,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoUtilidadEmpleado(UtilidadEmpleado utilidadempleado,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioUtilidadEmpleado(utilidadempleado);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyUtilidadEmpleado(utilidadempleado,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyUtilidadEmpleado(utilidadempleado);
	}
	
	public void setVariablesObjetoActualToFormularioUtilidadEmpleado(UtilidadEmpleado utilidadempleado) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormUtilidadEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelidUtilidadEmpleado.setText(utilidadempleado.getId().toString());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jDateChooserfecha_ingresoUtilidadEmpleado.setDate(utilidadempleado.getfecha_ingreso());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jDateChooserfecha_salidaUtilidadEmpleado.setDate(utilidadempleado.getfecha_salida());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldvalorUtilidadEmpleado.setText(utilidadempleado.getvalor().toString());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_diasUtilidadEmpleado.setText(utilidadempleado.getnumero_dias().toString());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_cargasUtilidadEmpleado.setText(utilidadempleado.getnumero_cargas().toString());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_factor10UtilidadEmpleado.setText(utilidadempleado.getnumero_factor10().toString());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldvalor_factor10UtilidadEmpleado.setText(utilidadempleado.getvalor_factor10().toString());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldutilidad_factor10UtilidadEmpleado.setText(utilidadempleado.getutilidad_factor10().toString());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_factor5UtilidadEmpleado.setText(utilidadempleado.getnumero_factor5().toString());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldvalor_factor5UtilidadEmpleado.setText(utilidadempleado.getvalor_factor5().toString());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldutilidad_factor5UtilidadEmpleado.setText(utilidadempleado.getutilidad_factor5().toString());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldtotalUtilidadEmpleado.setText(utilidadempleado.gettotal().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,UtilidadEmpleado utilidadempleadoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,utilidadempleadoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,UtilidadEmpleado utilidadempleadoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				utilidadempleadoLocal=this.utilidadempleado;
			} else {
				utilidadempleadoLocal=this.utilidadempleadoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(utilidadempleadoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoUtilidadEmpleado(utilidadempleadoLocal,true);
					
					if(utilidadempleadoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(utilidadempleadoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(utilidadempleadoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoUtilidadEmpleado(UtilidadEmpleado utilidadempleado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualUtilidadEmpleado(utilidadempleado,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(utilidadempleado);
	}
	
	public void setVariablesFormularioToObjetoActualUtilidadEmpleado(UtilidadEmpleado utilidadempleado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualUtilidadEmpleado(utilidadempleado,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualUtilidadEmpleado(UtilidadEmpleado utilidadempleado,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormUtilidadEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelidUtilidadEmpleado.getText()==null || this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelidUtilidadEmpleado.getText()=="" || this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelidUtilidadEmpleado.getText()=="Id") {
				this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelidUtilidadEmpleado.setText("0");
			}

			if(conColumnasBase) {utilidadempleado.setId(Long.parseLong(this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelidUtilidadEmpleado.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UtilidadEmpleadoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelIdUtilidadEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			utilidadempleado.setfecha_ingreso(this.jInternalFrameDetalleFormUtilidadEmpleado.jDateChooserfecha_ingresoUtilidadEmpleado.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UtilidadEmpleadoConstantesFunciones.LABEL_FECHAINGRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelfecha_ingresoUtilidadEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			utilidadempleado.setfecha_salida(this.jInternalFrameDetalleFormUtilidadEmpleado.jDateChooserfecha_salidaUtilidadEmpleado.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UtilidadEmpleadoConstantesFunciones.LABEL_FECHASALIDA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelfecha_salidaUtilidadEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			utilidadempleado.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldvalorUtilidadEmpleado.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UtilidadEmpleadoConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelvalorUtilidadEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			utilidadempleado.setnumero_dias(Integer.parseInt(this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_diasUtilidadEmpleado.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UtilidadEmpleadoConstantesFunciones.LABEL_NUMERODIAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelnumero_diasUtilidadEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			utilidadempleado.setnumero_cargas(Integer.parseInt(this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_cargasUtilidadEmpleado.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROCARGAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelnumero_cargasUtilidadEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			utilidadempleado.setnumero_factor10(Double.parseDouble(this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_factor10UtilidadEmpleado.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR10+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelnumero_factor10UtilidadEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			utilidadempleado.setvalor_factor10(Double.parseDouble(this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldvalor_factor10UtilidadEmpleado.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR10+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelvalor_factor10UtilidadEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			utilidadempleado.setutilidad_factor10(Double.parseDouble(this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldutilidad_factor10UtilidadEmpleado.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR10+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelutilidad_factor10UtilidadEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			utilidadempleado.setnumero_factor5(Double.parseDouble(this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_factor5UtilidadEmpleado.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR5+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelnumero_factor5UtilidadEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			utilidadempleado.setvalor_factor5(Double.parseDouble(this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldvalor_factor5UtilidadEmpleado.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR5+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelvalor_factor5UtilidadEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			utilidadempleado.setutilidad_factor5(Double.parseDouble(this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldutilidad_factor5UtilidadEmpleado.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR5+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelutilidad_factor5UtilidadEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			utilidadempleado.settotal(Double.parseDouble(this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldtotalUtilidadEmpleado.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UtilidadEmpleadoConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadEmpleado.jLabeltotalUtilidadEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualUtilidadEmpleado(UtilidadEmpleado utilidadempleadoBean,UtilidadEmpleado utilidadempleado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosUtilidadEmpleado(UtilidadEmpleado utilidadempleadoOrigen,UtilidadEmpleado utilidadempleado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && utilidadempleadoOrigen.getId()!=null && !utilidadempleadoOrigen.getId().equals(0L))) {utilidadempleado.setId(utilidadempleadoOrigen.getId());}}
			if(conDefault || (!conDefault && utilidadempleadoOrigen.getfecha_ingreso()!=null && !utilidadempleadoOrigen.getfecha_ingreso().equals(new Date()))) {utilidadempleado.setfecha_ingreso(utilidadempleadoOrigen.getfecha_ingreso());}
			if(conDefault || (!conDefault && utilidadempleadoOrigen.getfecha_salida()!=null && !utilidadempleadoOrigen.getfecha_salida().equals(new Date()))) {utilidadempleado.setfecha_salida(utilidadempleadoOrigen.getfecha_salida());}
			if(conDefault || (!conDefault && utilidadempleadoOrigen.getvalor()!=null && !utilidadempleadoOrigen.getvalor().equals(0.0))) {utilidadempleado.setvalor(utilidadempleadoOrigen.getvalor());}
			if(conDefault || (!conDefault && utilidadempleadoOrigen.getnumero_dias()!=null && !utilidadempleadoOrigen.getnumero_dias().equals(0))) {utilidadempleado.setnumero_dias(utilidadempleadoOrigen.getnumero_dias());}
			if(conDefault || (!conDefault && utilidadempleadoOrigen.getnumero_cargas()!=null && !utilidadempleadoOrigen.getnumero_cargas().equals(0))) {utilidadempleado.setnumero_cargas(utilidadempleadoOrigen.getnumero_cargas());}
			if(conDefault || (!conDefault && utilidadempleadoOrigen.getnumero_factor10()!=null && !utilidadempleadoOrigen.getnumero_factor10().equals(0.0))) {utilidadempleado.setnumero_factor10(utilidadempleadoOrigen.getnumero_factor10());}
			if(conDefault || (!conDefault && utilidadempleadoOrigen.getvalor_factor10()!=null && !utilidadempleadoOrigen.getvalor_factor10().equals(0.0))) {utilidadempleado.setvalor_factor10(utilidadempleadoOrigen.getvalor_factor10());}
			if(conDefault || (!conDefault && utilidadempleadoOrigen.getutilidad_factor10()!=null && !utilidadempleadoOrigen.getutilidad_factor10().equals(0.0))) {utilidadempleado.setutilidad_factor10(utilidadempleadoOrigen.getutilidad_factor10());}
			if(conDefault || (!conDefault && utilidadempleadoOrigen.getnumero_factor5()!=null && !utilidadempleadoOrigen.getnumero_factor5().equals(0.0))) {utilidadempleado.setnumero_factor5(utilidadempleadoOrigen.getnumero_factor5());}
			if(conDefault || (!conDefault && utilidadempleadoOrigen.getvalor_factor5()!=null && !utilidadempleadoOrigen.getvalor_factor5().equals(0.0))) {utilidadempleado.setvalor_factor5(utilidadempleadoOrigen.getvalor_factor5());}
			if(conDefault || (!conDefault && utilidadempleadoOrigen.getutilidad_factor5()!=null && !utilidadempleadoOrigen.getutilidad_factor5().equals(0.0))) {utilidadempleado.setutilidad_factor5(utilidadempleadoOrigen.getutilidad_factor5());}
			if(conDefault || (!conDefault && utilidadempleadoOrigen.gettotal()!=null && !utilidadempleadoOrigen.gettotal().equals(0.0))) {utilidadempleado.settotal(utilidadempleadoOrigen.gettotal());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioUtilidadEmpleado(UtilidadEmpleado utilidadempleado) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelidUtilidadEmpleado.setText(utilidadempleado.getId().toString());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jDateChooserfecha_ingresoUtilidadEmpleado.setDate(utilidadempleado.getfecha_ingreso());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jDateChooserfecha_salidaUtilidadEmpleado.setDate(utilidadempleado.getfecha_salida());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldvalorUtilidadEmpleado.setText(utilidadempleado.getvalor().toString());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_diasUtilidadEmpleado.setText(utilidadempleado.getnumero_dias().toString());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_cargasUtilidadEmpleado.setText(utilidadempleado.getnumero_cargas().toString());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_factor10UtilidadEmpleado.setText(utilidadempleado.getnumero_factor10().toString());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldvalor_factor10UtilidadEmpleado.setText(utilidadempleado.getvalor_factor10().toString());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldutilidad_factor10UtilidadEmpleado.setText(utilidadempleado.getutilidad_factor10().toString());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_factor5UtilidadEmpleado.setText(utilidadempleado.getnumero_factor5().toString());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldvalor_factor5UtilidadEmpleado.setText(utilidadempleado.getvalor_factor5().toString());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldutilidad_factor5UtilidadEmpleado.setText(utilidadempleado.getutilidad_factor5().toString());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldtotalUtilidadEmpleado.setText(utilidadempleado.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioUtilidadEmpleado(UtilidadEmpleadoBean utilidadempleadoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelidUtilidadEmpleado.setText(utilidadempleadoBean.getId().toString());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jDateChooserfecha_ingresoUtilidadEmpleado.setDate(utilidadempleadoBean.getfecha_ingreso());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jDateChooserfecha_salidaUtilidadEmpleado.setDate(utilidadempleadoBean.getfecha_salida());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldvalorUtilidadEmpleado.setText(utilidadempleadoBean.getvalor().toString());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_diasUtilidadEmpleado.setText(utilidadempleadoBean.getnumero_dias().toString());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_cargasUtilidadEmpleado.setText(utilidadempleadoBean.getnumero_cargas().toString());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_factor10UtilidadEmpleado.setText(utilidadempleadoBean.getnumero_factor10().toString());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldvalor_factor10UtilidadEmpleado.setText(utilidadempleadoBean.getvalor_factor10().toString());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldutilidad_factor10UtilidadEmpleado.setText(utilidadempleadoBean.getutilidad_factor10().toString());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_factor5UtilidadEmpleado.setText(utilidadempleadoBean.getnumero_factor5().toString());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldvalor_factor5UtilidadEmpleado.setText(utilidadempleadoBean.getvalor_factor5().toString());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldutilidad_factor5UtilidadEmpleado.setText(utilidadempleadoBean.getutilidad_factor5().toString());
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldtotalUtilidadEmpleado.setText(utilidadempleadoBean.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanUtilidadEmpleado(UtilidadEmpleadoParameterReturnGeneral utilidadempleadoReturnGeneral,UtilidadEmpleadoBean utilidadempleadoBean,Boolean conDefault) throws Exception { 
		try {
			UtilidadEmpleado utilidadempleadoLocal=new UtilidadEmpleado();
			
			utilidadempleadoLocal=utilidadempleadoReturnGeneral.getUtilidadEmpleado();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && utilidadempleadoLocal.getId()!=null && !utilidadempleadoLocal.getId().equals(0L))) {utilidadempleadoBean.setId(utilidadempleadoLocal.getId());}}
			if(conDefault || (!conDefault && utilidadempleadoLocal.getfecha_ingreso()!=null && !utilidadempleadoLocal.getfecha_ingreso().equals(new Date()))) {utilidadempleadoBean.setfecha_ingreso(utilidadempleadoLocal.getfecha_ingreso());}
			if(conDefault || (!conDefault && utilidadempleadoLocal.getfecha_salida()!=null && !utilidadempleadoLocal.getfecha_salida().equals(new Date()))) {utilidadempleadoBean.setfecha_salida(utilidadempleadoLocal.getfecha_salida());}
			if(conDefault || (!conDefault && utilidadempleadoLocal.getvalor()!=null && !utilidadempleadoLocal.getvalor().equals(0.0))) {utilidadempleadoBean.setvalor(utilidadempleadoLocal.getvalor());}
			if(conDefault || (!conDefault && utilidadempleadoLocal.getnumero_dias()!=null && !utilidadempleadoLocal.getnumero_dias().equals(0))) {utilidadempleadoBean.setnumero_dias(utilidadempleadoLocal.getnumero_dias());}
			if(conDefault || (!conDefault && utilidadempleadoLocal.getnumero_cargas()!=null && !utilidadempleadoLocal.getnumero_cargas().equals(0))) {utilidadempleadoBean.setnumero_cargas(utilidadempleadoLocal.getnumero_cargas());}
			if(conDefault || (!conDefault && utilidadempleadoLocal.getnumero_factor10()!=null && !utilidadempleadoLocal.getnumero_factor10().equals(0.0))) {utilidadempleadoBean.setnumero_factor10(utilidadempleadoLocal.getnumero_factor10());}
			if(conDefault || (!conDefault && utilidadempleadoLocal.getvalor_factor10()!=null && !utilidadempleadoLocal.getvalor_factor10().equals(0.0))) {utilidadempleadoBean.setvalor_factor10(utilidadempleadoLocal.getvalor_factor10());}
			if(conDefault || (!conDefault && utilidadempleadoLocal.getutilidad_factor10()!=null && !utilidadempleadoLocal.getutilidad_factor10().equals(0.0))) {utilidadempleadoBean.setutilidad_factor10(utilidadempleadoLocal.getutilidad_factor10());}
			if(conDefault || (!conDefault && utilidadempleadoLocal.getnumero_factor5()!=null && !utilidadempleadoLocal.getnumero_factor5().equals(0.0))) {utilidadempleadoBean.setnumero_factor5(utilidadempleadoLocal.getnumero_factor5());}
			if(conDefault || (!conDefault && utilidadempleadoLocal.getvalor_factor5()!=null && !utilidadempleadoLocal.getvalor_factor5().equals(0.0))) {utilidadempleadoBean.setvalor_factor5(utilidadempleadoLocal.getvalor_factor5());}
			if(conDefault || (!conDefault && utilidadempleadoLocal.getutilidad_factor5()!=null && !utilidadempleadoLocal.getutilidad_factor5().equals(0.0))) {utilidadempleadoBean.setutilidad_factor5(utilidadempleadoLocal.getutilidad_factor5());}
			if(conDefault || (!conDefault && utilidadempleadoLocal.gettotal()!=null && !utilidadempleadoLocal.gettotal().equals(0.0))) {utilidadempleadoBean.settotal(utilidadempleadoLocal.gettotal());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxUtilidadEmpleadoGenerico(Long idUtilidadEmpleadoSeleccionado,JComboBox jComboBoxUtilidadEmpleado,List<UtilidadEmpleado> utilidadempleadosLocal)throws Exception {
		try {
			UtilidadEmpleado  utilidadempleadoTemp=null;

			for(UtilidadEmpleado utilidadempleadoAux:utilidadempleadosLocal) {
				if(utilidadempleadoAux.getId()!=null && utilidadempleadoAux.getId().equals(idUtilidadEmpleadoSeleccionado)) {
					utilidadempleadoTemp=utilidadempleadoAux;
					break;
				}
			}

			jComboBoxUtilidadEmpleado.setSelectedItem(utilidadempleadoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxUtilidadEmpleadoGenerico(JComboBox jComboBoxUtilidadEmpleado,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxUtilidadEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxUtilidadEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxUtilidadEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxUtilidadEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxUtilidadEmpleado.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxUtilidadEmpleado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxUtilidadEmpleado.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxUtilidadEmpleado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxUtilidadEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxUtilidadEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			utilidadempleado=(UtilidadEmpleado) utilidadempleadoLogic.getUtilidadEmpleados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			utilidadempleado =(UtilidadEmpleado) utilidadempleados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!utilidadempleado.getIsNew() && !utilidadempleado.getIsChanged() && !utilidadempleado.getIsDeleted()) {
				sDescripcion=utilidadempleado.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=utilidadempleado.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!utilidadempleado.getIsNew() && !utilidadempleado.getIsChanged() && !utilidadempleado.getIsDeleted()) {
				sDescripcion=utilidadempleado.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=utilidadempleado.getempleado_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!utilidadempleado.getIsNew() && !utilidadempleado.getIsChanged() && !utilidadempleado.getIsDeleted()) {
				sDescripcion=utilidadempleado.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=utilidadempleado.getanio_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		UtilidadEmpleado utilidadempleadoRow=new UtilidadEmpleado();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			utilidadempleadoRow=(UtilidadEmpleado) utilidadempleadoLogic.getUtilidadEmpleados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			utilidadempleadoRow=(UtilidadEmpleado) utilidadempleados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualUtilidadEmpleado(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoUtilidadEmpleado.setVisible((this.isVisibilidadCeldaNuevoUtilidadEmpleado && this.isPermisoNuevoUtilidadEmpleado));			
			this.jButtonDuplicarUtilidadEmpleado.setVisible((this.isVisibilidadCeldaDuplicarUtilidadEmpleado && this.isPermisoDuplicarUtilidadEmpleado));			
			this.jButtonCopiarUtilidadEmpleado.setVisible((this.isVisibilidadCeldaCopiarUtilidadEmpleado && this.isPermisoCopiarUtilidadEmpleado));
			this.jButtonVerFormUtilidadEmpleado.setVisible((this.isVisibilidadCeldaVerFormUtilidadEmpleado && this.isPermisoVerFormUtilidadEmpleado));
			
			this.jButtonAbrirOrderByUtilidadEmpleado.setVisible((this.isVisibilidadCeldaOrdenUtilidadEmpleado && this.isPermisoOrdenUtilidadEmpleado));			
			
			this.jButtonNuevoRelacionesUtilidadEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesUtilidadEmpleado && this.isPermisoNuevoUtilidadEmpleado));			
			this.jButtonNuevoGuardarCambiosUtilidadEmpleado.setVisible((this.isVisibilidadCeldaNuevoUtilidadEmpleado && this.isPermisoNuevoUtilidadEmpleado && this.isPermisoGuardarCambiosUtilidadEmpleado));
			
			if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {
			this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonModificarUtilidadEmpleado.setVisible((this.isVisibilidadCeldaModificarUtilidadEmpleado && this.isPermisoActualizarUtilidadEmpleado));	
			this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonActualizarUtilidadEmpleado.setVisible((this.isVisibilidadCeldaActualizarUtilidadEmpleado && this.isPermisoActualizarUtilidadEmpleado));	
			this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonEliminarUtilidadEmpleado.setVisible((this.isVisibilidadCeldaEliminarUtilidadEmpleado && this.isPermisoEliminarUtilidadEmpleado));
			this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonCancelarUtilidadEmpleado.setVisible(this.isVisibilidadCeldaCancelarUtilidadEmpleado);							
			this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonGuardarCambiosUtilidadEmpleado.setVisible((this.isVisibilidadCeldaGuardarUtilidadEmpleado && this.isPermisoGuardarCambiosUtilidadEmpleado));			
			
			}
						
			this.jButtonGuardarCambiosTablaUtilidadEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosUtilidadEmpleado && this.isPermisoGuardarCambiosUtilidadEmpleado));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarUtilidadEmpleado.setVisible((this.isVisibilidadCeldaNuevoUtilidadEmpleado && this.isPermisoNuevoUtilidadEmpleado));						
			this.jButtonDuplicarToolBarUtilidadEmpleado.setVisible((this.isVisibilidadCeldaDuplicarUtilidadEmpleado && this.isPermisoDuplicarUtilidadEmpleado));						
			this.jButtonCopiarToolBarUtilidadEmpleado.setVisible((this.isVisibilidadCeldaCopiarUtilidadEmpleado && this.isPermisoCopiarUtilidadEmpleado));			
			this.jButtonVerFormToolBarUtilidadEmpleado.setVisible((this.isVisibilidadCeldaVerFormUtilidadEmpleado && this.isPermisoVerFormUtilidadEmpleado));			
			this.jButtonAbrirOrderByToolBarUtilidadEmpleado.setVisible((this.isVisibilidadCeldaOrdenUtilidadEmpleado && this.isPermisoOrdenUtilidadEmpleado));
			this.jButtonNuevoRelacionesToolBarUtilidadEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesUtilidadEmpleado && this.isPermisoNuevoUtilidadEmpleado));			
			this.jButtonNuevoGuardarCambiosToolBarUtilidadEmpleado.setVisible((this.isVisibilidadCeldaNuevoUtilidadEmpleado && this.isPermisoNuevoUtilidadEmpleado && this.isPermisoGuardarCambiosUtilidadEmpleado));			
			
			if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {
			this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonModificarToolBarUtilidadEmpleado.setVisible((this.isVisibilidadCeldaModificarUtilidadEmpleado && this.isPermisoActualizarUtilidadEmpleado));	
			this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonActualizarToolBarUtilidadEmpleado.setVisible((this.isVisibilidadCeldaActualizarUtilidadEmpleado  && this.isPermisoActualizarUtilidadEmpleado));	
			this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonEliminarToolBarUtilidadEmpleado.setVisible((this.isVisibilidadCeldaEliminarUtilidadEmpleado && this.isPermisoEliminarUtilidadEmpleado));
			this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonCancelarToolBarUtilidadEmpleado.setVisible(this.isVisibilidadCeldaCancelarUtilidadEmpleado);				
			this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonGuardarCambiosToolBarUtilidadEmpleado.setVisible((this.isVisibilidadCeldaGuardarUtilidadEmpleado && this.isPermisoGuardarCambiosUtilidadEmpleado));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarUtilidadEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosUtilidadEmpleado && this.isPermisoGuardarCambiosUtilidadEmpleado));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoUtilidadEmpleado.setVisible((this.isVisibilidadCeldaNuevoUtilidadEmpleado && this.isPermisoNuevoUtilidadEmpleado));			
			this.jMenuItemDuplicarUtilidadEmpleado.setVisible((this.isVisibilidadCeldaDuplicarUtilidadEmpleado && this.isPermisoDuplicarUtilidadEmpleado));			
			this.jMenuItemCopiarUtilidadEmpleado.setVisible((this.isVisibilidadCeldaCopiarUtilidadEmpleado && this.isPermisoCopiarUtilidadEmpleado));			
			this.jMenuItemVerFormUtilidadEmpleado.setVisible((this.isVisibilidadCeldaVerFormUtilidadEmpleado && this.isPermisoVerFormUtilidadEmpleado));			
			this.jMenuItemAbrirOrderByUtilidadEmpleado.setVisible((this.isVisibilidadCeldaOrdenUtilidadEmpleado && this.isPermisoOrdenUtilidadEmpleado));			
			//this.jMenuItemMostrarOcultarUtilidadEmpleado.setVisible((this.isVisibilidadCeldaOrdenUtilidadEmpleado && this.isPermisoOrdenUtilidadEmpleado));
			this.jMenuItemDetalleAbrirOrderByUtilidadEmpleado.setVisible((this.isVisibilidadCeldaOrdenUtilidadEmpleado && this.isPermisoOrdenUtilidadEmpleado));			
			//this.jMenuItemDetalleMostrarOcultarUtilidadEmpleado.setVisible((this.isVisibilidadCeldaOrdenUtilidadEmpleado && this.isPermisoOrdenUtilidadEmpleado));			
			this.jMenuItemNuevoRelacionesUtilidadEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesUtilidadEmpleado && this.isPermisoNuevoUtilidadEmpleado));			
			this.jMenuItemNuevoGuardarCambiosUtilidadEmpleado.setVisible((this.isVisibilidadCeldaNuevoUtilidadEmpleado && this.isPermisoNuevoUtilidadEmpleado && this.isPermisoGuardarCambiosUtilidadEmpleado));									
			
			if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {
			this.jInternalFrameDetalleFormUtilidadEmpleado.jMenuItemModificarUtilidadEmpleado.setVisible((this.isVisibilidadCeldaModificarUtilidadEmpleado && this.isPermisoActualizarUtilidadEmpleado));	
			this.jInternalFrameDetalleFormUtilidadEmpleado.jMenuItemActualizarUtilidadEmpleado.setVisible((this.isVisibilidadCeldaActualizarUtilidadEmpleado && this.isPermisoActualizarUtilidadEmpleado));	
			this.jInternalFrameDetalleFormUtilidadEmpleado.jMenuItemEliminarUtilidadEmpleado.setVisible((this.isVisibilidadCeldaEliminarUtilidadEmpleado && this.isPermisoEliminarUtilidadEmpleado));
			this.jInternalFrameDetalleFormUtilidadEmpleado.jMenuItemCancelarUtilidadEmpleado.setVisible(this.isVisibilidadCeldaCancelarUtilidadEmpleado);				
			}
			
			this.jMenuItemGuardarCambiosUtilidadEmpleado.setVisible((this.isVisibilidadCeldaGuardarUtilidadEmpleado && this.isPermisoGuardarCambiosUtilidadEmpleado));						
			this.jMenuItemGuardarCambiosTablaUtilidadEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosUtilidadEmpleado && this.isPermisoGuardarCambiosUtilidadEmpleado));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoUtilidadEmpleado=this.jButtonNuevoUtilidadEmpleado.isVisible();
			this.isVisibilidadCeldaDuplicarUtilidadEmpleado=this.jButtonDuplicarUtilidadEmpleado.isVisible();
			this.isVisibilidadCeldaCopiarUtilidadEmpleado=this.jButtonCopiarUtilidadEmpleado.isVisible();
			this.isVisibilidadCeldaVerFormUtilidadEmpleado=this.jButtonVerFormUtilidadEmpleado.isVisible();
			
			this.isVisibilidadCeldaOrdenUtilidadEmpleado=this.jButtonAbrirOrderByUtilidadEmpleado.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesUtilidadEmpleado=this.jButtonNuevoRelacionesUtilidadEmpleado.isVisible();
			this.isVisibilidadCeldaModificarUtilidadEmpleado=this.jButtonModificarUtilidadEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {
			this.isVisibilidadCeldaActualizarUtilidadEmpleado=this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonActualizarUtilidadEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarUtilidadEmpleado=this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonEliminarUtilidadEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarUtilidadEmpleado=this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonCancelarUtilidadEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarUtilidadEmpleado=this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonGuardarCambiosUtilidadEmpleado.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosUtilidadEmpleado=this.jButtonGuardarCambiosTablaUtilidadEmpleado.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoUtilidadEmpleado=this.jButtonNuevoToolBarUtilidadEmpleado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesUtilidadEmpleado=this.jButtonNuevoRelacionesToolBarUtilidadEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {
			this.isVisibilidadCeldaModificarUtilidadEmpleado=this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonModificarToolBarUtilidadEmpleado.isVisible();
			this.isVisibilidadCeldaActualizarUtilidadEmpleado=this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonActualizarToolBarUtilidadEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarUtilidadEmpleado=this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonEliminarToolBarUtilidadEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarUtilidadEmpleado=this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonCancelarToolBarUtilidadEmpleado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarUtilidadEmpleado=this.jButtonGuardarCambiosToolBarUtilidadEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosUtilidadEmpleado=this.jButtonGuardarCambiosTablaToolBarUtilidadEmpleado.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoUtilidadEmpleado=this.jMenuItemNuevoUtilidadEmpleado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesUtilidadEmpleado=this.jMenuItemNuevoRelacionesUtilidadEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {
			this.isVisibilidadCeldaModificarUtilidadEmpleado=this.jInternalFrameDetalleFormUtilidadEmpleado.jMenuItemModificarUtilidadEmpleado.isVisible();
			this.isVisibilidadCeldaActualizarUtilidadEmpleado=this.jInternalFrameDetalleFormUtilidadEmpleado.jMenuItemActualizarUtilidadEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarUtilidadEmpleado=this.jInternalFrameDetalleFormUtilidadEmpleado.jMenuItemEliminarUtilidadEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarUtilidadEmpleado=this.jInternalFrameDetalleFormUtilidadEmpleado.jMenuItemCancelarUtilidadEmpleado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarUtilidadEmpleado=this.jMenuItemGuardarCambiosUtilidadEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosUtilidadEmpleado=this.jMenuItemGuardarCambiosTablaUtilidadEmpleado.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesUtilidadEmpleado(Boolean esInicializar) {
		if(UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.utilidadempleadoSessionBean.getConGuardarRelaciones()) {
				//if(this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesUtilidadEmpleado();
			}
			
			this.inicializarActualizarBindingBotonesManualUtilidadEmpleado(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualUtilidadEmpleado() {
		this.jButtonNuevoUtilidadEmpleado.setVisible(this.isPermisoNuevoUtilidadEmpleado);			
		this.jButtonDuplicarUtilidadEmpleado.setVisible(this.isPermisoDuplicarUtilidadEmpleado);			
		this.jButtonCopiarUtilidadEmpleado.setVisible(this.isPermisoCopiarUtilidadEmpleado);			
		this.jButtonVerFormUtilidadEmpleado.setVisible(this.isPermisoVerFormUtilidadEmpleado);			
		
		this.jButtonAbrirOrderByUtilidadEmpleado.setVisible(this.isPermisoOrdenUtilidadEmpleado);					
		
		this.jButtonNuevoRelacionesUtilidadEmpleado.setVisible(this.isPermisoNuevoUtilidadEmpleado);			
		
		if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonModificarUtilidadEmpleado.setVisible(this.isPermisoActualizarUtilidadEmpleado);	
			this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonActualizarUtilidadEmpleado.setVisible(this.isPermisoActualizarUtilidadEmpleado);	
			this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonEliminarUtilidadEmpleado.setVisible(this.isPermisoEliminarUtilidadEmpleado);
			this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonCancelarUtilidadEmpleado.setVisible(this.isVisibilidadCeldaCancelarUtilidadEmpleado);						
			this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonGuardarCambiosUtilidadEmpleado.setVisible(this.isPermisoGuardarCambiosUtilidadEmpleado);							
		}
		
		this.jButtonGuardarCambiosTablaUtilidadEmpleado.setVisible(this.isPermisoActualizarUtilidadEmpleado);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleUtilidadEmpleado() {
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonModificarUtilidadEmpleado.setVisible(this.isPermisoActualizarUtilidadEmpleado);	
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonActualizarUtilidadEmpleado.setVisible(this.isPermisoActualizarUtilidadEmpleado);	
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonEliminarUtilidadEmpleado.setVisible(this.isPermisoEliminarUtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonCancelarUtilidadEmpleado.setVisible(this.isVisibilidadCeldaCancelarUtilidadEmpleado);							
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonGuardarCambiosUtilidadEmpleado.setVisible((this.isVisibilidadCeldaGuardarUtilidadEmpleado && this.isPermisoGuardarCambiosUtilidadEmpleado));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosUtilidadEmpleado() {
		if(UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualUtilidadEmpleado();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesUtilidadEmpleado() {
	}
	
	public void jTableDatosUtilidadEmpleadoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarUtilidadEmpleado(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidUtilidadEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.getutilidadempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadempleado==null) {
						this.utilidadempleado = new UtilidadEmpleado();
					}

					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.utilidadempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
				}

				if(this.utilidadempleado.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.utilidadempleado.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaUtilidadEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebUtilidadEmpleado(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUtilidadEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUtilidadEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.getutilidadempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.utilidadempleadoLogic.getConnexion());

				if(this.utilidadempleado.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.utilidadempleado.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUtilidadEmpleado=(TitledBorder)this.jScrollPanelDatosUtilidadEmpleado.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderUtilidadEmpleado.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaUtilidadEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.getutilidadempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadempleado==null) {
						this.utilidadempleado = new UtilidadEmpleado();
					}

					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.utilidadempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
				}

				if(this.utilidadempleado.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.utilidadempleado.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoUtilidadEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebUtilidadEmpleado(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUtilidadEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUtilidadEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.getutilidadempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.utilidadempleadoLogic.getConnexion());

				if(this.utilidadempleado.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.utilidadempleado.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUtilidadEmpleado=(TitledBorder)this.jScrollPanelDatosUtilidadEmpleado.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderUtilidadEmpleado.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoUtilidadEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.getutilidadempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadempleado==null) {
						this.utilidadempleado = new UtilidadEmpleado();
					}

					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.utilidadempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
				}

				if(this.utilidadempleado.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.utilidadempleado.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioUtilidadEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebUtilidadEmpleado(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUtilidadEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUtilidadEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.getutilidadempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.utilidadempleadoLogic.getConnexion());

				if(this.utilidadempleado.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.utilidadempleado.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUtilidadEmpleado=(TitledBorder)this.jScrollPanelDatosUtilidadEmpleado.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderUtilidadEmpleado.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioUtilidadEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.getutilidadempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadempleado==null) {
						this.utilidadempleado = new UtilidadEmpleado();
					}

					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.utilidadempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
				}

				if(this.utilidadempleado.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.utilidadempleado.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_ingresoUtilidadEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.getutilidadempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadempleado==null) {
						this.utilidadempleado = new UtilidadEmpleado();
					}

					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.utilidadempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
				}

				if(this.utilidadempleado.getfecha_ingreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_ingreso = '"+Funciones2.getStringPostgresDate(this.utilidadempleado.getfecha_ingreso())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_salidaUtilidadEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.getutilidadempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadempleado==null) {
						this.utilidadempleado = new UtilidadEmpleado();
					}

					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.utilidadempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
				}

				if(this.utilidadempleado.getfecha_salida()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_salida = '"+Funciones2.getStringPostgresDate(this.utilidadempleado.getfecha_salida())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorUtilidadEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.getutilidadempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadempleado==null) {
						this.utilidadempleado = new UtilidadEmpleado();
					}

					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.utilidadempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
				}

				if(this.utilidadempleado.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.utilidadempleado.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_diasUtilidadEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.getutilidadempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadempleado==null) {
						this.utilidadempleado = new UtilidadEmpleado();
					}

					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.utilidadempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
				}

				if(this.utilidadempleado.getnumero_dias()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_dias = "+this.utilidadempleado.getnumero_dias().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_cargasUtilidadEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.getutilidadempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadempleado==null) {
						this.utilidadempleado = new UtilidadEmpleado();
					}

					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.utilidadempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
				}

				if(this.utilidadempleado.getnumero_cargas()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_cargas = "+this.utilidadempleado.getnumero_cargas().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_factor10UtilidadEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.getutilidadempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadempleado==null) {
						this.utilidadempleado = new UtilidadEmpleado();
					}

					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.utilidadempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
				}

				if(this.utilidadempleado.getnumero_factor10()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_factor10 = "+this.utilidadempleado.getnumero_factor10().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_factor10UtilidadEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.getutilidadempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadempleado==null) {
						this.utilidadempleado = new UtilidadEmpleado();
					}

					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.utilidadempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
				}

				if(this.utilidadempleado.getvalor_factor10()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_factor10 = "+this.utilidadempleado.getvalor_factor10().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonutilidad_factor10UtilidadEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.getutilidadempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadempleado==null) {
						this.utilidadempleado = new UtilidadEmpleado();
					}

					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.utilidadempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
				}

				if(this.utilidadempleado.getutilidad_factor10()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where utilidad_factor10 = "+this.utilidadempleado.getutilidad_factor10().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_factor5UtilidadEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.getutilidadempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadempleado==null) {
						this.utilidadempleado = new UtilidadEmpleado();
					}

					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.utilidadempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
				}

				if(this.utilidadempleado.getnumero_factor5()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_factor5 = "+this.utilidadempleado.getnumero_factor5().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_factor5UtilidadEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.getutilidadempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadempleado==null) {
						this.utilidadempleado = new UtilidadEmpleado();
					}

					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.utilidadempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
				}

				if(this.utilidadempleado.getvalor_factor5()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_factor5 = "+this.utilidadempleado.getvalor_factor5().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonutilidad_factor5UtilidadEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.getutilidadempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadempleado==null) {
						this.utilidadempleado = new UtilidadEmpleado();
					}

					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.utilidadempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
				}

				if(this.utilidadempleado.getutilidad_factor5()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where utilidad_factor5 = "+this.utilidadempleado.getutilidad_factor5().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalUtilidadEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.getutilidadempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadempleado==null) {
						this.utilidadempleado = new UtilidadEmpleado();
					}

					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.utilidadempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);
				}

				if(this.utilidadempleado.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.utilidadempleado.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAnioUtilidadEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUtilidadEmpleado(false,false);

			this.getUtilidadEmpleadosFK_IdAnio();

			this.inicializarActualizarBindingUtilidadEmpleado(false);

			//if(UtilidadEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUtilidadEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoUtilidadEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUtilidadEmpleado(false,false);

			this.getUtilidadEmpleadosFK_IdEmpleado();

			this.inicializarActualizarBindingUtilidadEmpleado(false);

			//if(UtilidadEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUtilidadEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaUtilidadEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUtilidadEmpleado(false,false);

			this.getUtilidadEmpleadosFK_IdEmpresa();

			this.inicializarActualizarBindingUtilidadEmpleado(false);

			//if(UtilidadEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUtilidadEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameUtilidadEmpleado() {
		if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {
			this.jInternalFrameDetalleFormUtilidadEmpleado.setVisible(false);	    			
			this.jInternalFrameDetalleFormUtilidadEmpleado.dispose();
			this.jInternalFrameDetalleFormUtilidadEmpleado=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoUtilidadEmpleado!=null) {
			this.jInternalFrameReporteDinamicoUtilidadEmpleado.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoUtilidadEmpleado.dispose();
			this.jInternalFrameReporteDinamicoUtilidadEmpleado=null;
		}
		
		if(this.jInternalFrameImportacionUtilidadEmpleado!=null) {
			this.jInternalFrameImportacionUtilidadEmpleado.setVisible(false);	    			
			this.jInternalFrameImportacionUtilidadEmpleado.dispose();
			this.jInternalFrameImportacionUtilidadEmpleado=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessUtilidadEmpleado();
			
			UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
			
			
			if(sTipo.equals("NuevoUtilidadEmpleado")) {
				jButtonNuevoUtilidadEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarUtilidadEmpleado")) {
				jButtonDuplicarUtilidadEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarUtilidadEmpleado")) {
				jButtonCopiarUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("VerFormUtilidadEmpleado")) {
				jButtonVerFormUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarUtilidadEmpleado")) {
				jButtonNuevoUtilidadEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarUtilidadEmpleado")) {
				jButtonDuplicarUtilidadEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoUtilidadEmpleado")) {
				jButtonNuevoUtilidadEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarUtilidadEmpleado")) {
				jButtonDuplicarUtilidadEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesUtilidadEmpleado")) {
				jButtonNuevoUtilidadEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarUtilidadEmpleado")) {
				jButtonNuevoUtilidadEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesUtilidadEmpleado")) {
				jButtonNuevoUtilidadEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarUtilidadEmpleado")) {
				jButtonModificarUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarUtilidadEmpleado")) {
				jButtonModificarUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarUtilidadEmpleado")) {
				jButtonModificarUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarUtilidadEmpleado")) {
				jButtonActualizarUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarUtilidadEmpleado")) {
				jButtonActualizarUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarUtilidadEmpleado")) {
				jButtonActualizarUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("EliminarUtilidadEmpleado")) {
				jButtonEliminarUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarUtilidadEmpleado")) {
				jButtonEliminarUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarUtilidadEmpleado")) {
				jButtonEliminarUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CancelarUtilidadEmpleado")) {
				jButtonCancelarUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarUtilidadEmpleado")) {
				jButtonCancelarUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarUtilidadEmpleado")) {
				jButtonCancelarUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CerrarUtilidadEmpleado")) {
				jButtonCerrarUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarUtilidadEmpleado")) {
				jButtonCerrarUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarUtilidadEmpleado")) {
				jButtonCerrarUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarUtilidadEmpleado")) {
				jButtonMostrarOcultarUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarUtilidadEmpleado")) {
				jButtonCancelarUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosUtilidadEmpleado")) {
				jButtonGuardarCambiosUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarUtilidadEmpleado")) {
				jButtonGuardarCambiosUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarUtilidadEmpleado")) {
				jButtonCopiarUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarUtilidadEmpleado")) {
				jButtonVerFormUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosUtilidadEmpleado")) {
				jButtonGuardarCambiosUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarUtilidadEmpleado")) {
				jButtonCopiarUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormUtilidadEmpleado")) {
				jButtonVerFormUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaUtilidadEmpleado")) {
				jButtonGuardarCambiosUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarUtilidadEmpleado")) {
				jButtonGuardarCambiosUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaUtilidadEmpleado")) {
				jButtonGuardarCambiosUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionUtilidadEmpleado")) {
				jButtonRecargarInformacionUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarUtilidadEmpleado")) {
				jButtonRecargarInformacionUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionUtilidadEmpleado")) {
				jButtonRecargarInformacionUtilidadEmpleadoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresUtilidadEmpleado")) {
				jButtonAnterioresUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarUtilidadEmpleado")) {
				jButtonAnterioresUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreUtilidadEmpleado")) {
				jButtonAnterioresUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesUtilidadEmpleado")) {
				jButtonSiguientesUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarUtilidadEmpleado")) {
				jButtonSiguientesUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesUtilidadEmpleado")) {
				jButtonSiguientesUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByUtilidadEmpleado") || sTipo.equals("MenuItemDetalleAbrirOrderByUtilidadEmpleado")) {
				jButtonAbrirOrderByUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarUtilidadEmpleado") || sTipo.equals("MenuItemDetalleMostrarOcultarUtilidadEmpleado")) {
				jButtonMostrarOcultarUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosUtilidadEmpleado")) {
				jButtonNuevoGuardarCambiosUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarUtilidadEmpleado")) {
				jButtonNuevoGuardarCambiosUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosUtilidadEmpleado")) {
				jButtonNuevoGuardarCambiosUtilidadEmpleadoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoUtilidadEmpleado")) {
				jButtonCerrarReporteDinamicoUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoUtilidadEmpleado")) {
				jButtonGenerarReporteDinamicoUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoUtilidadEmpleado")) {
				
				jButtonGenerarExcelReporteDinamicoUtilidadEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionUtilidadEmpleado")) {
				jButtonCerrarImportacionUtilidadEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionUtilidadEmpleado")) {
				
				jButtonGenerarImportacionUtilidadEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionUtilidadEmpleado")) {
				
				jButtonAbrirImportacionUtilidadEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesUtilidadEmpleado")) {
				jComboBoxTiposAccionesUtilidadEmpleadoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesUtilidadEmpleado")) {
				jComboBoxTiposRelacionesUtilidadEmpleadoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioUtilidadEmpleado")) {
				jComboBoxTiposAccionesUtilidadEmpleadoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarUtilidadEmpleado")) {
				
				jComboBoxTiposSeleccionarUtilidadEmpleadoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralUtilidadEmpleado")) {
				jTextFieldValorCampoGeneralUtilidadEmpleadoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByUtilidadEmpleado")) {
				jButtonAbrirOrderByUtilidadEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarUtilidadEmpleado")) {
				jButtonAbrirOrderByUtilidadEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByUtilidadEmpleado")) {
				jButtonCerrarOrderByUtilidadEmpleadoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idUtilidadEmpleadoBusqueda")) {
				this.jButtonidUtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaUtilidadEmpleadoUpdate")) {
				this.jButtonid_empresaUtilidadEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaUtilidadEmpleadoBusqueda")) {
				this.jButtonid_empresaUtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoUtilidadEmpleadoUpdate")) {
				this.jButtonid_empleadoUtilidadEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoUtilidadEmpleadoBusqueda")) {
				this.jButtonid_empleadoUtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioUtilidadEmpleadoUpdate")) {
				this.jButtonid_anioUtilidadEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioUtilidadEmpleadoBusqueda")) {
				this.jButtonid_anioUtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ingresoUtilidadEmpleadoBusqueda")) {
				this.jButtonfecha_ingresoUtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_salidaUtilidadEmpleadoBusqueda")) {
				this.jButtonfecha_salidaUtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorUtilidadEmpleadoBusqueda")) {
				this.jButtonvalorUtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_diasUtilidadEmpleadoBusqueda")) {
				this.jButtonnumero_diasUtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cargasUtilidadEmpleadoBusqueda")) {
				this.jButtonnumero_cargasUtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_factor10UtilidadEmpleadoBusqueda")) {
				this.jButtonnumero_factor10UtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_factor10UtilidadEmpleadoBusqueda")) {
				this.jButtonvalor_factor10UtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("utilidad_factor10UtilidadEmpleadoBusqueda")) {
				this.jButtonutilidad_factor10UtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_factor5UtilidadEmpleadoBusqueda")) {
				this.jButtonnumero_factor5UtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_factor5UtilidadEmpleadoBusqueda")) {
				this.jButtonvalor_factor5UtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("utilidad_factor5UtilidadEmpleadoBusqueda")) {
				this.jButtonutilidad_factor5UtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalUtilidadEmpleadoBusqueda")) {
				this.jButtontotalUtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdAnioUtilidadEmpleado")) {
				this.jButtonFK_IdAnioUtilidadEmpleadoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEmpleadoUtilidadEmpleado")) {
				this.jButtonFK_IdEmpleadoUtilidadEmpleadoActionPerformed(evt);
			}
			
			;
			
			
			UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessUtilidadEmpleado();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUtilidadEmpleadoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadempleado);
				
				UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
				
				


				
				UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			UtilidadEmpleado utilidadempleadoLocal=null;
			
			if(!this.getEsControlTabla()) {
				utilidadempleadoLocal=this.utilidadempleado;
			} else {
				utilidadempleadoLocal=this.utilidadempleadoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadempleado);
				
				UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
							
				
				


				
				UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoAnterior =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadempleadoAnterior =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
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
			
			UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
			
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
			
			


			
			UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUtilidadEmpleadoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadempleado);
				
				UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
								
						
				


				
				UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadEmpleado.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadempleado);
				
				UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
								
				
				


				
				UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoAnterior =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadempleadoAnterior =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadempleado);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoAnterior =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadempleadoAnterior =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadEmpleadoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.utilidadempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadempleado);
				
				UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
							
				
				


				
				UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadEmpleado.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUtilidadEmpleadoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadempleadoAnterior =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.utilidadempleadoAnterior =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
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
			
			UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
			
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
			
			


			
			UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadEmpleadoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.utilidadempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadempleado);
				
				UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
								
				
				


				
				UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoAnterior =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadempleadoAnterior =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadEmpleadoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.utilidadempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUtilidadEmpleadoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadempleado);
				
				UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosUtilidadEmpleado")) {
					jCheckBoxSeleccionarTodosUtilidadEmpleadoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosUtilidadEmpleado")) {
					jCheckBoxSeleccionadosUtilidadEmpleadoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarUtilidadEmpleado")) {
					
				}
				
				


				
				
				UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadempleado);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.utilidadempleado);
				
				UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
												
				
				


				
				
				UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUtilidadEmpleadoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadempleadoAnterior =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.utilidadempleadoAnterior =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUtilidadEmpleadoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadempleado);
				
				UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
				
				
				UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
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
			
			UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
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
			
			


			
			UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUtilidadEmpleadoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadempleado);
				
				UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadEmpleado.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadEmpleado.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadempleado);
				
				UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
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
				
				


				
				UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadEmpleado.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadempleadoAnterior =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadempleadoAnterior =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarUtilidadEmpleado")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosUtilidadEmpleadoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosUtilidadEmpleado.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.utilidadempleado =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.utilidadempleado);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarUtilidadEmpleado")) {
				
				}
				
				UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarUtilidadEmpleado")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosUtilidadEmpleado.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarUtilidadEmpleado")) {
			
			}
			
			UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessUtilidadEmpleado();
			
			UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
			
			if(sTipo.equals("NuevoUtilidadEmpleado")) {
				jButtonNuevoUtilidadEmpleadoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarUtilidadEmpleado")) {
				jButtonDuplicarUtilidadEmpleadoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarUtilidadEmpleado")) {
				jButtonCopiarUtilidadEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormUtilidadEmpleado")) {
				jButtonVerFormUtilidadEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesUtilidadEmpleado")) {
				jButtonNuevoUtilidadEmpleadoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarUtilidadEmpleado")) {
				jButtonModificarUtilidadEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarUtilidadEmpleado")) {
				jButtonActualizarUtilidadEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarUtilidadEmpleado")) {
				jButtonEliminarUtilidadEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaUtilidadEmpleado")) {
				jButtonGuardarCambiosUtilidadEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarUtilidadEmpleado")) {
				jButtonCancelarUtilidadEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarUtilidadEmpleado")) {
				jButtonCerrarUtilidadEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosUtilidadEmpleado")) {
				jButtonGuardarCambiosUtilidadEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosUtilidadEmpleado")) {
				jButtonNuevoGuardarCambiosUtilidadEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByUtilidadEmpleado")) {
				jButtonAbrirOrderByUtilidadEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionUtilidadEmpleado")) {
				jButtonRecargarInformacionUtilidadEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresUtilidadEmpleado")) {
				jButtonAnterioresUtilidadEmpleadoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesUtilidadEmpleado")) {
				jButtonSiguientesUtilidadEmpleadoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idUtilidadEmpleadoBusqueda")) {
				this.jButtonidUtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaUtilidadEmpleadoUpdate")) {
				this.jButtonid_empresaUtilidadEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaUtilidadEmpleadoBusqueda")) {
				this.jButtonid_empresaUtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoUtilidadEmpleadoUpdate")) {
				this.jButtonid_empleadoUtilidadEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoUtilidadEmpleadoBusqueda")) {
				this.jButtonid_empleadoUtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioUtilidadEmpleadoUpdate")) {
				this.jButtonid_anioUtilidadEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioUtilidadEmpleadoBusqueda")) {
				this.jButtonid_anioUtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ingresoUtilidadEmpleadoBusqueda")) {
				this.jButtonfecha_ingresoUtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_salidaUtilidadEmpleadoBusqueda")) {
				this.jButtonfecha_salidaUtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorUtilidadEmpleadoBusqueda")) {
				this.jButtonvalorUtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_diasUtilidadEmpleadoBusqueda")) {
				this.jButtonnumero_diasUtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cargasUtilidadEmpleadoBusqueda")) {
				this.jButtonnumero_cargasUtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_factor10UtilidadEmpleadoBusqueda")) {
				this.jButtonnumero_factor10UtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_factor10UtilidadEmpleadoBusqueda")) {
				this.jButtonvalor_factor10UtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("utilidad_factor10UtilidadEmpleadoBusqueda")) {
				this.jButtonutilidad_factor10UtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_factor5UtilidadEmpleadoBusqueda")) {
				this.jButtonnumero_factor5UtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_factor5UtilidadEmpleadoBusqueda")) {
				this.jButtonvalor_factor5UtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("utilidad_factor5UtilidadEmpleadoBusqueda")) {
				this.jButtonutilidad_factor5UtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalUtilidadEmpleadoBusqueda")) {
				this.jButtontotalUtilidadEmpleadoBusquedaActionPerformed(evt);
			}
			
			UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessUtilidadEmpleado();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameUtilidadEmpleado")) {
				closingInternalFrameUtilidadEmpleado();
				
			} else if(sTipo.equals("jButtonCancelarUtilidadEmpleado")) {
				JInternalFrameBase jInternalFrameDetalleFormUtilidadEmpleado = (JInternalFrameBase)evt.getSource();
	            	
	            UtilidadEmpleadoBeanSwingJInternalFrame jInternalFrameParent=(UtilidadEmpleadoBeanSwingJInternalFrame)jInternalFrameDetalleFormUtilidadEmpleado.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarUtilidadEmpleadoActionPerformed(null);
			}
			
			UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.utilidadempleado,new Object(),this.utilidadempleadoParameterGeneral,this.utilidadempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormUtilidadEmpleado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormUtilidadEmpleado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormUtilidadEmpleado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.utilidadempleado)) {
			if(!esControlTabla) {
				if(UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.utilidadempleado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);			
				}
				
				if(this.utilidadempleadoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualUtilidadEmpleado(this.utilidadempleado,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.utilidadempleadoReturnGeneral=utilidadempleadoLogic.procesarEventosUtilidadEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.utilidadempleadoLogic.getUtilidadEmpleados(),this.utilidadempleado,this.utilidadempleadoParameterGeneral,this.isEsNuevoUtilidadEmpleado,classes);//this.utilidadempleadoLogic.getUtilidadEmpleado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanUtilidadEmpleado(this.utilidadempleadoReturnGeneral,this.utilidadempleadoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.utilidadempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanUtilidadEmpleado(classes,this.utilidadempleadoReturnGeneral,this.utilidadempleadoBean,false);
					}
						
					if(this.utilidadempleadoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyUtilidadEmpleado(this.utilidadempleadoReturnGeneral.getUtilidadEmpleado());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioUtilidadEmpleado(this.utilidadempleadoReturnGeneral.getUtilidadEmpleado());	
					}
						
					if(this.utilidadempleadoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioUtilidadEmpleado(this.utilidadempleadoReturnGeneral.getUtilidadEmpleado(),classes);//this.utilidadempleadoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioUtilidadEmpleado(this.utilidadempleado,classes);//this.utilidadempleadoBean);									
				}
			
				if(UtilidadEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualUtilidadEmpleado(this.utilidadempleado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadEmpleado(this.utilidadempleado);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.utilidadempleadoAnterior!=null) {
						this.utilidadempleado=this.utilidadempleadoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.utilidadempleadoReturnGeneral=utilidadempleadoLogic.procesarEventosUtilidadEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.utilidadempleadoLogic.getUtilidadEmpleados(),this.utilidadempleado,this.utilidadempleadoParameterGeneral,this.isEsNuevoUtilidadEmpleado,classes);//this.utilidadempleadoLogic.getUtilidadEmpleado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.utilidadempleadoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.utilidadempleadoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.utilidadempleadoReturnGeneral.getUtilidadEmpleado(),utilidadempleadoLogic.getUtilidadEmpleados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.utilidadempleadoReturnGeneral.getUtilidadEmpleado(),this.utilidadempleados);
				}
				//ARCHITECTURE
				
				//this.jTableDatosUtilidadEmpleado.repaint();
				
				//((AbstractTableModel) this.jTableDatosUtilidadEmpleado.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosUtilidadEmpleado();
			}
		}
	}
	
	public void actualizarVisualTableDatosUtilidadEmpleado() throws Exception {
		
		UtilidadEmpleadoModel utilidadempleadoModel=(UtilidadEmpleadoModel)this.jTableDatosUtilidadEmpleado.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			utilidadempleadoModel.utilidadempleados=this.utilidadempleadoLogic.getUtilidadEmpleados();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			utilidadempleadoModel.utilidadempleados=this.utilidadempleados;
		}
		
		
		((UtilidadEmpleadoModel) this.jTableDatosUtilidadEmpleado.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaUtilidadEmpleado() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getutilidadempleadoAnterior(),this.utilidadempleadoLogic.getUtilidadEmpleados());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getutilidadempleadoAnterior(),this.utilidadempleados);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosUtilidadEmpleado();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioUtilidadEmpleado(UtilidadEmpleado utilidadempleado,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
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
										
				UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.utilidadempleado,new Object(),generalEntityParameterGeneral,this.utilidadempleadoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.utilidadempleadoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=UtilidadEmpleadoConstantesFunciones.getClassesRelationshipsOfUtilidadEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=UtilidadEmpleadoConstantesFunciones.getClassesRelationshipsFromStringsOfUtilidadEmpleado(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormUtilidadEmpleado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				UtilidadEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.utilidadempleado,new Object(),generalEntityParameterGeneral,this.utilidadempleadoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioUtilidadEmpleado(UtilidadEmpleadoBean utilidadempleadoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanUtilidadEmpleado(ArrayList<Classe> classes,UtilidadEmpleadoReturnGeneral utilidadempleadoReturnGeneral,UtilidadEmpleadoBean utilidadempleadoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualUtilidadEmpleado(UtilidadEmpleado utilidadempleado,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.utilidadempleado)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormUtilidadEmpleado = new UtilidadEmpleadoDetalleFormJInternalFrame(jDesktopPane,this.utilidadempleadoSessionBean.getConGuardarRelaciones(),this.utilidadempleadoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormUtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.setVisible(false);
		this.jInternalFrameDetalleFormUtilidadEmpleado.setSelected(false);						
		
		this.jInternalFrameDetalleFormUtilidadEmpleado.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormUtilidadEmpleado.utilidadempleadoLogic=this.utilidadempleadoLogic;
		
		this.cargarCombosFrameForeignKeyUtilidadEmpleado("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleUtilidadEmpleado();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleUtilidadEmpleado();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyUtilidadEmpleado("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyUtilidadEmpleado();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormUtilidadEmpleado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarUtilidadEmpleado"));
		
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonModificarUtilidadEmpleado.addActionListener(new ButtonActionListener(this,"ModificarUtilidadEmpleado"));

		
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonModificarToolBarUtilidadEmpleado.addActionListener(new ButtonActionListener(this,"ModificarToolBarUtilidadEmpleado"));
					
		this.jInternalFrameDetalleFormUtilidadEmpleado.jMenuItemModificarUtilidadEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemModificarUtilidadEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonActualizarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"ActualizarUtilidadEmpleado"));
		
		
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonActualizarToolBarUtilidadEmpleado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarUtilidadEmpleado"));
						
		this.jInternalFrameDetalleFormUtilidadEmpleado.jMenuItemActualizarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarUtilidadEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonEliminarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"EliminarUtilidadEmpleado"));
		
		
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonEliminarToolBarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"EliminarToolBarUtilidadEmpleado"));
								
		this.jInternalFrameDetalleFormUtilidadEmpleado.jMenuItemEliminarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarUtilidadEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonCancelarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"CancelarUtilidadEmpleado"));
		
		
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonCancelarToolBarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"CancelarToolBarUtilidadEmpleado"));
					
		this.jInternalFrameDetalleFormUtilidadEmpleado.jMenuItemCancelarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarUtilidadEmpleado"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormUtilidadEmpleado.jMenuItemDetalleCerrarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarUtilidadEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonGuardarCambiosToolBarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarUtilidadEmpleado"));
		
		
		
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonGuardarCambiosToolBarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarUtilidadEmpleado"));
		
		
		
		this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxTiposAccionesFormularioUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioUtilidadEmpleado"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonidUtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idUtilidadEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonid_empresaUtilidadEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaUtilidadEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonid_empresaUtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaUtilidadEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonid_empleadoUtilidadEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoUtilidadEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonid_empleadoUtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoUtilidadEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonid_anioUtilidadEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_anioUtilidadEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonid_anioUtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioUtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonfecha_ingresoUtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ingresoUtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonfecha_salidaUtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_salidaUtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonvalorUtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valorUtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonnumero_diasUtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"numero_diasUtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonnumero_cargasUtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"numero_cargasUtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonnumero_factor10UtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"numero_factor10UtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonvalor_factor10UtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valor_factor10UtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonutilidad_factor10UtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"utilidad_factor10UtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonnumero_factor5UtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"numero_factor5UtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonvalor_factor5UtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valor_factor5UtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonutilidad_factor5UtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"utilidad_factor5UtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtontotalUtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"totalUtilidadEmpleadoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormUtilidadEmpleado.jTabbedPaneRelacionesUtilidadEmpleado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesUtilidadEmpleado"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameUtilidadEmpleado"));
		
		if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadEmpleado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarUtilidadEmpleado"));
		}
		
		this.jTableDatosUtilidadEmpleado.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarUtilidadEmpleado"));
		
		this.jTableDatosUtilidadEmpleado.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarUtilidadEmpleado"));
		
		this.jButtonNuevoUtilidadEmpleado.addActionListener(new ButtonActionListener(this,"NuevoUtilidadEmpleado"));
		
		this.jButtonDuplicarUtilidadEmpleado.addActionListener(new ButtonActionListener(this,"DuplicarUtilidadEmpleado"));
		
		this.jButtonCopiarUtilidadEmpleado.addActionListener(new ButtonActionListener(this,"CopiarUtilidadEmpleado"));
		
		this.jButtonVerFormUtilidadEmpleado.addActionListener(new ButtonActionListener(this,"VerFormUtilidadEmpleado"));
		
		
		this.jButtonNuevoToolBarUtilidadEmpleado.addActionListener(new ButtonActionListener(this,"NuevoToolBarUtilidadEmpleado"));
			
		this.jButtonDuplicarToolBarUtilidadEmpleado.addActionListener(new ButtonActionListener(this,"DuplicarToolBarUtilidadEmpleado"));
			
		this.jMenuItemNuevoUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoUtilidadEmpleado"));
			
		this.jMenuItemDuplicarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarUtilidadEmpleado"));		
		
		
		this.jButtonNuevoRelacionesUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"NuevoRelacionesUtilidadEmpleado"));
		
		
		this.jButtonNuevoRelacionesToolBarUtilidadEmpleado.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarUtilidadEmpleado"));
			
		this.jMenuItemNuevoRelacionesUtilidadEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesUtilidadEmpleado"));		
		
		
		if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonModificarUtilidadEmpleado.addActionListener(new ButtonActionListener(this,"ModificarUtilidadEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonModificarToolBarUtilidadEmpleado.addActionListener(new ButtonActionListener(this,"ModificarToolBarUtilidadEmpleado"));
			
			this.jInternalFrameDetalleFormUtilidadEmpleado.jMenuItemModificarUtilidadEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemModificarUtilidadEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonActualizarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"ActualizarUtilidadEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonActualizarToolBarUtilidadEmpleado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarUtilidadEmpleado"));
				
			this.jInternalFrameDetalleFormUtilidadEmpleado.jMenuItemActualizarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarUtilidadEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonEliminarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"EliminarUtilidadEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonEliminarToolBarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"EliminarToolBarUtilidadEmpleado"));
						
			this.jInternalFrameDetalleFormUtilidadEmpleado.jMenuItemEliminarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarUtilidadEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonCancelarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"CancelarUtilidadEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonCancelarToolBarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"CancelarToolBarUtilidadEmpleado"));
			
			this.jInternalFrameDetalleFormUtilidadEmpleado.jMenuItemCancelarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarUtilidadEmpleado"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarUtilidadEmpleado"));		
		
		
		this.jButtonCerrarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"CerrarUtilidadEmpleado"));
		
		
		this.jButtonCerrarToolBarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"CerrarToolBarUtilidadEmpleado"));
			
		this.jMenuItemCerrarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCerrarUtilidadEmpleado"));
			
		if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadEmpleado.jMenuItemDetalleCerrarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarUtilidadEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonGuardarCambiosUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosUtilidadEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonGuardarCambiosToolBarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarUtilidadEmpleado"));
		}
		
		this.jButtonCopiarToolBarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"CopiarToolBarUtilidadEmpleado"));
			
		this.jButtonVerFormToolBarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"VerFormToolBarUtilidadEmpleado"));
		
		this.jMenuItemGuardarCambiosUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosUtilidadEmpleado"));
			
		this.jMenuItemCopiarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCopiarUtilidadEmpleado"));		
		
		this.jMenuItemVerFormUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemVerFormUtilidadEmpleado"));		
		
		
		this.jButtonGuardarCambiosTablaUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaUtilidadEmpleado"));
		
		
		this.jButtonGuardarCambiosTablaToolBarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarUtilidadEmpleado"));
			
		this.jMenuItemGuardarCambiosTablaUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaUtilidadEmpleado"));		
		
		
		
		this.jButtonRecargarInformacionUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"RecargarInformacionUtilidadEmpleado"));
					
		this.jButtonRecargarInformacionToolBarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarUtilidadEmpleado"));
		
		this.jMenuItemRecargarInformacionUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionUtilidadEmpleado"));		
		
		
		
		this.jButtonAnterioresUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"AnterioresUtilidadEmpleado"));
		
		
		this.jButtonAnterioresToolBarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"AnterioresToolBarUtilidadEmpleado"));
		
		this.jMenuItemAnterioresUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresUtilidadEmpleado"));		
		
		
		this.jButtonSiguientesUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"SiguientesUtilidadEmpleado"));
		
		
		this.jButtonSiguientesToolBarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"SiguientesToolBarUtilidadEmpleado"));
			
		this.jMenuItemSiguientesUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesUtilidadEmpleado"));
			
		this.jMenuItemAbrirOrderByUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByUtilidadEmpleado"));
			
		this.jMenuItemMostrarOcultarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarUtilidadEmpleado"));
			
		this.jMenuItemDetalleAbrirOrderByUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByUtilidadEmpleado"));
			
		this.jMenuItemDetalleMostarOcultarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarUtilidadEmpleado"));		
		
		
		this.jButtonNuevoGuardarCambiosUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosUtilidadEmpleado"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarUtilidadEmpleado"));
			
		this.jMenuItemNuevoGuardarCambiosUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosUtilidadEmpleado"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosUtilidadEmpleado.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosUtilidadEmpleado"));

		this.jCheckBoxSeleccionadosUtilidadEmpleado.addItemListener(new CheckBoxItemListener(this,"SeleccionadosUtilidadEmpleado"));
		
		if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxTiposAccionesFormularioUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioUtilidadEmpleado"));
		}
		
		
		this.jComboBoxTiposRelacionesUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"TiposRelacionesUtilidadEmpleado"));
			
		this.jComboBoxTiposAccionesUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesUtilidadEmpleado"));
					
		this.jComboBoxTiposSeleccionarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"TiposSeleccionarUtilidadEmpleado"));
			
		this.jTextFieldValorCampoGeneralUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralUtilidadEmpleado"));		
		
		
		if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonidUtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idUtilidadEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonid_empresaUtilidadEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaUtilidadEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonid_empresaUtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaUtilidadEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonid_empleadoUtilidadEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoUtilidadEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonid_empleadoUtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoUtilidadEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonid_anioUtilidadEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_anioUtilidadEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonid_anioUtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioUtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonfecha_ingresoUtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ingresoUtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonfecha_salidaUtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_salidaUtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonvalorUtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valorUtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonnumero_diasUtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"numero_diasUtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonnumero_cargasUtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"numero_cargasUtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonnumero_factor10UtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"numero_factor10UtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonvalor_factor10UtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valor_factor10UtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonutilidad_factor10UtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"utilidad_factor10UtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonnumero_factor5UtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"numero_factor5UtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonvalor_factor5UtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valor_factor5UtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonutilidad_factor5UtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"utilidad_factor5UtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtontotalUtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"totalUtilidadEmpleadoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdAnioUtilidadEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdAnioUtilidadEmpleado"));

			this.jButtonFK_IdEmpleadoUtilidadEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoUtilidadEmpleado"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoUtilidadEmpleado!=null) {
				this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoUtilidadEmpleado"));
				this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoUtilidadEmpleado"));
				this.jInternalFrameReporteDinamicoUtilidadEmpleado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoUtilidadEmpleado"));
			}
			
			//this.jButtonCerrarReporteDinamicoUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoUtilidadEmpleado"));				
			//this.jButtonGenerarReporteDinamicoUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoUtilidadEmpleado"));
			//this.jButtonGenerarExcelReporteDinamicoUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoUtilidadEmpleado"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionUtilidadEmpleado!=null) {
				this.jInternalFrameImportacionUtilidadEmpleado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionUtilidadEmpleado"));
				this.jInternalFrameImportacionUtilidadEmpleado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionUtilidadEmpleado"));
				this.jInternalFrameImportacionUtilidadEmpleado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionUtilidadEmpleado"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"AbrirOrderByUtilidadEmpleado"));
			
			this.jButtonAbrirOrderByToolBarUtilidadEmpleado.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarUtilidadEmpleado"));			
			
			if(this.jInternalFrameOrderByUtilidadEmpleado!=null) {
				this.jInternalFrameOrderByUtilidadEmpleado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByUtilidadEmpleado"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadEmpleado.jTabbedPaneRelacionesUtilidadEmpleado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesUtilidadEmpleado"));
		
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
            		closingInternalFrameUtilidadEmpleado();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormUtilidadEmpleado.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormUtilidadEmpleado = (JInternalFrameBase)event.getSource();
	            	
	            UtilidadEmpleadoBeanSwingJInternalFrame jInternalFrameParent=(UtilidadEmpleadoBeanSwingJInternalFrame)jInternalFrameDetalleFormUtilidadEmpleado.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarUtilidadEmpleadoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosUtilidadEmpleado.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosUtilidadEmpleadoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosUtilidadEmpleado.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosUtilidadEmpleado.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUtilidadEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUtilidadEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUtilidadEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoUtilidadEmpleado";
		inputMap = this.jButtonNuevoUtilidadEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoUtilidadEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoUtilidadEmpleadoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUtilidadEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUtilidadEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUtilidadEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesUtilidadEmpleado";
		inputMap = this.jButtonNuevoRelacionesUtilidadEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesUtilidadEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoUtilidadEmpleadoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarUtilidadEmpleado";
		inputMap = this.jButtonModificarUtilidadEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarUtilidadEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarUtilidadEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarUtilidadEmpleado";
		inputMap = this.jButtonActualizarUtilidadEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarUtilidadEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarUtilidadEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarUtilidadEmpleado";
		inputMap = this.jButtonEliminarUtilidadEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarUtilidadEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarUtilidadEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarUtilidadEmpleado";
		inputMap = this.jButtonCancelarUtilidadEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarUtilidadEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarUtilidadEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarUtilidadEmpleado";
		inputMap = this.jButtonCerrarUtilidadEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarUtilidadEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarUtilidadEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonGuardarCambiosUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosUtilidadEmpleado";
		inputMap = this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonGuardarCambiosUtilidadEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonGuardarCambiosUtilidadEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosUtilidadEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosUtilidadEmpleado.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosUtilidadEmpleadoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesUtilidadEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesUtilidadEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarUtilidadEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarUtilidadEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralUtilidadEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralUtilidadEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonidUtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idUtilidadEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonid_empresaUtilidadEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaUtilidadEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonid_empresaUtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaUtilidadEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonid_empleadoUtilidadEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoUtilidadEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonid_empleadoUtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoUtilidadEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonid_anioUtilidadEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_anioUtilidadEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonid_anioUtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioUtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonfecha_ingresoUtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ingresoUtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonfecha_salidaUtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_salidaUtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonvalorUtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valorUtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonnumero_diasUtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"numero_diasUtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonnumero_cargasUtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"numero_cargasUtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonnumero_factor10UtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"numero_factor10UtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonvalor_factor10UtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valor_factor10UtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonutilidad_factor10UtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"utilidad_factor10UtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonnumero_factor5UtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"numero_factor5UtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonvalor_factor5UtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"valor_factor5UtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtonutilidad_factor5UtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"utilidad_factor5UtilidadEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadEmpleado.jButtontotalUtilidadEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"totalUtilidadEmpleadoBusqueda"));
		
		
		this.jButtonFK_IdAnioUtilidadEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdAnioUtilidadEmpleado"));

		this.jButtonFK_IdEmpleadoUtilidadEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoUtilidadEmpleado"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionUtilidadEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionUtilidadEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarUtilidadEmpleadoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarUtilidadEmpleado.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosUtilidadEmpleado(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(UtilidadEmpleado utilidadempleadoAux:this.utilidadempleadoLogic.getUtilidadEmpleados()) {
					utilidadempleadoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UtilidadEmpleado utilidadempleadoAux:utilidadempleados) {
					utilidadempleadoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosUtilidadEmpleadoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingUtilidadEmpleado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(UtilidadEmpleado utilidadempleadoAux:this.utilidadempleadoLogic.getUtilidadEmpleados()) {
						utilidadempleadoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(UtilidadEmpleado utilidadempleadoAux:utilidadempleados) {
						utilidadempleadoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(UtilidadEmpleado utilidadempleadoAux:this.utilidadempleadoLogic.getUtilidadEmpleados()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(UtilidadEmpleado utilidadempleadoAux:utilidadempleados) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaUtilidadEmpleado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosUtilidadEmpleado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosUtilidadEmpleado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosUtilidadEmpleado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosUtilidadEmpleadoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingUtilidadEmpleado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosUtilidadEmpleado.getSelectedRows();
			
			UtilidadEmpleado utilidadempleadoLocal=new UtilidadEmpleado();
			
			//this.seleccionarTodosUtilidadEmpleado(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					utilidadempleadoLocal =(UtilidadEmpleado) this.utilidadempleadoLogic.getUtilidadEmpleados().toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					utilidadempleadoLocal =(UtilidadEmpleado) this.utilidadempleados.toArray()[this.jTableDatosUtilidadEmpleado.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				utilidadempleadoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(UtilidadEmpleado utilidadempleadoAux:this.utilidadempleadoLogic.getUtilidadEmpleados()) {
						utilidadempleadoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(UtilidadEmpleado utilidadempleadoAux:utilidadempleados) {
						utilidadempleadoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaUtilidadEmpleado(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosUtilidadEmpleado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosUtilidadEmpleado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosUtilidadEmpleado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualUtilidadEmpleadoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarUtilidadEmpleadoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralUtilidadEmpleadoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingUtilidadEmpleado(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralUtilidadEmpleado.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(UtilidadEmpleado utilidadempleadoAux:this.utilidadempleadoLogic.getUtilidadEmpleados()) {
				
						if(sTipoSeleccionar.equals(UtilidadEmpleadoConstantesFunciones.LABEL_FECHAINGRESO)) {
							existe=true;
							utilidadempleadoAux.setfecha_ingreso(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadEmpleadoConstantesFunciones.LABEL_FECHASALIDA)) {
							existe=true;
							utilidadempleadoAux.setfecha_salida(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadEmpleadoConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							utilidadempleadoAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadEmpleadoConstantesFunciones.LABEL_NUMERODIAS)) {
							existe=true;
							utilidadempleadoAux.setnumero_dias(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROCARGAS)) {
							existe=true;
							utilidadempleadoAux.setnumero_cargas(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR10)) {
							existe=true;
							utilidadempleadoAux.setnumero_factor10(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR10)) {
							existe=true;
							utilidadempleadoAux.setvalor_factor10(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR10)) {
							existe=true;
							utilidadempleadoAux.setutilidad_factor10(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR5)) {
							existe=true;
							utilidadempleadoAux.setnumero_factor5(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR5)) {
							existe=true;
							utilidadempleadoAux.setvalor_factor5(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR5)) {
							existe=true;
							utilidadempleadoAux.setutilidad_factor5(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadEmpleadoConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							utilidadempleadoAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UtilidadEmpleado utilidadempleadoAux:utilidadempleados) {
					
						if(sTipoSeleccionar.equals(UtilidadEmpleadoConstantesFunciones.LABEL_FECHAINGRESO)) {
							existe=true;
							utilidadempleadoAux.setfecha_ingreso(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadEmpleadoConstantesFunciones.LABEL_FECHASALIDA)) {
							existe=true;
							utilidadempleadoAux.setfecha_salida(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadEmpleadoConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							utilidadempleadoAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadEmpleadoConstantesFunciones.LABEL_NUMERODIAS)) {
							existe=true;
							utilidadempleadoAux.setnumero_dias(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROCARGAS)) {
							existe=true;
							utilidadempleadoAux.setnumero_cargas(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR10)) {
							existe=true;
							utilidadempleadoAux.setnumero_factor10(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR10)) {
							existe=true;
							utilidadempleadoAux.setvalor_factor10(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR10)) {
							existe=true;
							utilidadempleadoAux.setutilidad_factor10(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR5)) {
							existe=true;
							utilidadempleadoAux.setnumero_factor5(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR5)) {
							existe=true;
							utilidadempleadoAux.setvalor_factor5(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR5)) {
							existe=true;
							utilidadempleadoAux.setutilidad_factor5(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadEmpleadoConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							utilidadempleadoAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaUtilidadEmpleado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesUtilidadEmpleadoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingUtilidadEmpleado(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioUtilidadEmpleado=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesUtilidadEmpleado.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxTiposAccionesFormularioUtilidadEmpleado.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteUtilidadEmpleado) {				
					conSplash=true;//false;										
					
					//this.startProcessUtilidadEmpleado(conSplash);
				
					this.generarReporteUtilidadEmpleadosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUtilidadEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxTiposAccionesFormularioUtilidadEmpleado.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoUtilidadEmpleadosSeleccionados();
				//this.jComboBoxTiposAccionesUtilidadEmpleado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoUtilidadEmpleadosSeleccionados(false);
				//this.jComboBoxTiposAccionesUtilidadEmpleado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoUtilidadEmpleadosSeleccionados(true);
				//this.jComboBoxTiposAccionesUtilidadEmpleado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessUtilidadEmpleado();
				
				this.exportarUtilidadEmpleadosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUtilidadEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxTiposAccionesFormularioUtilidadEmpleado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionUtilidadEmpleados();
				//this.importarUtilidadEmpleados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUtilidadEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxTiposAccionesFormularioUtilidadEmpleado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessUtilidadEmpleado();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelUtilidadEmpleadosSeleccionados();
				//this.jComboBoxTiposAccionesUtilidadEmpleado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Utilidad Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessUtilidadEmpleado();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoUtilidadEmpleado)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyUtilidadEmpleado(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Utilidad Empleado",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUtilidadEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxTiposAccionesFormularioUtilidadEmpleado.setSelectedIndex(0);					
				}	
			} 			
			else if(UtilidadEmpleadoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteUtilidadEmpleado) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessUtilidadEmpleado(conSplash);
					
						//this.actualizarParametrosGeneralUtilidadEmpleado();
						
						this.generarReporteProcesoAccionUtilidadEmpleadosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesUtilidadEmpleado.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxTiposAccionesFormularioUtilidadEmpleado.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(UtilidadEmpleadoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Utilidad EmpleadoS SELECCIONADOS?", "MANTENIMIENTO DE Utilidad Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessUtilidadEmpleado();
				
						this.actualizarParametrosGeneralUtilidadEmpleado();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.utilidadempleadoReturnGeneral=utilidadempleadoLogic.procesarAccionUtilidadEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.utilidadempleadoLogic.getUtilidadEmpleados(),this.utilidadempleadoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarUtilidadEmpleadoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesUtilidadEmpleado.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxTiposAccionesFormularioUtilidadEmpleado.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralUtilidadEmpleado();
					
					UtilidadEmpleadoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarUtilidadEmpleadoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesUtilidadEmpleado.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxTiposAccionesFormularioUtilidadEmpleado.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessUtilidadEmpleado(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesUtilidadEmpleadoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessUtilidadEmpleado();
			
			if(this.jInternalFrameDetalleFormUtilidadEmpleado==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<UtilidadEmpleado> utilidadempleadosSeleccionados=new ArrayList<UtilidadEmpleado>();		
			UtilidadEmpleado utilidadempleado=new UtilidadEmpleado();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingUtilidadEmpleado(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesUtilidadEmpleado.getSelectedItem();
			
			
			
			
			utilidadempleadosSeleccionados=this.getUtilidadEmpleadosSeleccionados(true);
			//this.sTipoAccion;
			
			if(utilidadempleadosSeleccionados.size()==1) {
				for(UtilidadEmpleado utilidadempleadoAux:utilidadempleadosSeleccionados) {
					utilidadempleado=utilidadempleadoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessUtilidadEmpleado();
			
      		//this.finishProcessUtilidadEmpleado(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarUtilidadEmpleadoReturnGeneral() throws Exception {
		if(this.utilidadempleadoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.utilidadempleadoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.utilidadempleadoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.utilidadempleadoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.utilidadempleadoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.utilidadempleadoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingUtilidadEmpleado(false);
		}
		
		if(this.utilidadempleadoReturnGeneral.getConRetornoLista() || this.utilidadempleadoReturnGeneral.getConRetornoObjeto()) {
			if(this.utilidadempleadoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.utilidadempleadoLogic.setUtilidadEmpleados(this.utilidadempleadoReturnGeneral.getUtilidadEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.utilidadempleadoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.utilidadempleadoLogic.setUtilidadEmpleado(this.utilidadempleadoReturnGeneral.getUtilidadEmpleado());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingUtilidadEmpleado(false);
		}
	}
	
	public void actualizarParametrosGeneralUtilidadEmpleado() throws Exception {
		
		
	}
	
	public ArrayList<UtilidadEmpleado> getUtilidadEmpleadosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<UtilidadEmpleado> utilidadempleadosSeleccionados=new ArrayList<UtilidadEmpleado>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioUtilidadEmpleado) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(UtilidadEmpleado utilidadempleadoAux:utilidadempleadoLogic.getUtilidadEmpleados()) {
					if(utilidadempleadoAux.getIsSelected()) {
						utilidadempleadosSeleccionados.add(utilidadempleadoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UtilidadEmpleado utilidadempleadoAux:this.utilidadempleados) {
					if(utilidadempleadoAux.getIsSelected()) {
						utilidadempleadosSeleccionados.add(utilidadempleadoAux);				
					}
				}
			}
			
			if(utilidadempleadosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						utilidadempleadosSeleccionados.addAll(this.utilidadempleadoLogic.getUtilidadEmpleados());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						utilidadempleadosSeleccionados.addAll(this.utilidadempleados);				
					}
				}
			}
		} else {
			utilidadempleadosSeleccionados.add(this.utilidadempleado);
		}
		
		return utilidadempleadosSeleccionados;
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
	
	public void generarReporteUtilidadEmpleadosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalUtilidadEmpleadosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoUtilidadEmpleadosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoUtilidadEmpleadosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoUtilidadEmpleadosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Utilidad Empleado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesUtilidadEmpleadosSeleccionados() throws Exception {
		ArrayList<UtilidadEmpleado> utilidadempleadosSeleccionados=new ArrayList<UtilidadEmpleado>();		
		
		utilidadempleadosSeleccionados=this.getUtilidadEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteUtilidadEmpleados("Todos",utilidadempleadosSeleccionados);
		
	}	
	
	public void generarReporteNormalUtilidadEmpleadosSeleccionados() throws Exception {
		ArrayList<UtilidadEmpleado> utilidadempleadosSeleccionados=new ArrayList<UtilidadEmpleado>();		
		
		utilidadempleadosSeleccionados=this.getUtilidadEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteUtilidadEmpleados("Todos",utilidadempleadosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionUtilidadEmpleadosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<UtilidadEmpleado> utilidadempleadosSeleccionados=new ArrayList<UtilidadEmpleado>();
		
		utilidadempleadosSeleccionados=this.getUtilidadEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteUtilidadEmpleados("Todos",utilidadempleadosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoUtilidadEmpleadosSeleccionados() throws Exception {
		ArrayList<UtilidadEmpleado> utilidadempleadosSeleccionados=new ArrayList<UtilidadEmpleado>();		
		
		
		this.abrirInicializarFrameReporteDinamicoUtilidadEmpleado();
		
		
		utilidadempleadosSeleccionados=this.getUtilidadEmpleadosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoUtilidadEmpleado();
		
		
		//this.generarReporteUtilidadEmpleados("Todos",utilidadempleadosSeleccionados ,utilidadempleadoImplementable,utilidadempleadoImplementableHome);
	}
	
	public void mostrarImportacionUtilidadEmpleados() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionUtilidadEmpleado();
		
		this.abrirFrameImportacionUtilidadEmpleado();		
		
			
		//this.generarReporteUtilidadEmpleados("Todos",utilidadempleadosSeleccionados ,utilidadempleadoImplementable,utilidadempleadoImplementableHome);
	}
	
	public void importarUtilidadEmpleados() throws Exception {		
	
	}
	
	public void exportarUtilidadEmpleadosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelUtilidadEmpleadosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoUtilidadEmpleadosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlUtilidadEmpleadosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Utilidad Empleado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoUtilidadEmpleadosSeleccionados() throws Exception {
		ArrayList<UtilidadEmpleado> utilidadempleadosSeleccionados=new ArrayList<UtilidadEmpleado>();		
		
		utilidadempleadosSeleccionados=this.getUtilidadEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"utilidadempleado."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarUtilidadEmpleado(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(UtilidadEmpleado utilidadempleadoAux:utilidadempleadosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarUtilidadEmpleado(utilidadempleadoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//utilidadempleadoAux.setsDetalleGeneralEntityReporte(utilidadempleadoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidad Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarUtilidadEmpleado(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=UtilidadEmpleadoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadEmpleadoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadEmpleadoConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadEmpleadoConstantesFunciones.LABEL_FECHAINGRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadEmpleadoConstantesFunciones.LABEL_FECHASALIDA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadEmpleadoConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadEmpleadoConstantesFunciones.LABEL_NUMERODIAS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROCARGAS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR10;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR10;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR10;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR5;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR5;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR5;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadEmpleadoConstantesFunciones.LABEL_TOTAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarUtilidadEmpleado(UtilidadEmpleado utilidadempleado,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=utilidadempleado.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadempleado.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadempleado.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadempleado.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadempleado.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadempleado.getfecha_ingreso().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadempleado.getfecha_salida().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadempleado.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadempleado.getnumero_dias().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadempleado.getnumero_cargas().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadempleado.getnumero_factor10().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadempleado.getvalor_factor10().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadempleado.getutilidad_factor10().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadempleado.getnumero_factor5().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadempleado.getvalor_factor5().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadempleado.getutilidad_factor5().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadempleado.gettotal().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelUtilidadEmpleadosSeleccionados() throws Exception {
		ArrayList<UtilidadEmpleado> utilidadempleadosSeleccionados=new ArrayList<UtilidadEmpleado>();		
		
		utilidadempleadosSeleccionados=this.getUtilidadEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"utilidadempleado.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("UtilidadEmpleados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelUtilidadEmpleado(row);				
				iRow++;
			}				
			
			for(UtilidadEmpleado utilidadempleadoAux:utilidadempleadosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelUtilidadEmpleado(utilidadempleadoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidad Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlUtilidadEmpleadosSeleccionados() throws Exception {
		ArrayList<UtilidadEmpleado> utilidadempleadosSeleccionados=new ArrayList<UtilidadEmpleado>();		
		
		utilidadempleadosSeleccionados=this.getUtilidadEmpleadosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"utilidadempleado.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("utilidadempleados");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("utilidadempleado");
			//elementRoot.appendChild(element);
		
			for(UtilidadEmpleado utilidadempleadoAux:utilidadempleadosSeleccionados) {
				element = document.createElement("utilidadempleado");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlUtilidadEmpleado(utilidadempleadoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidad Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelUtilidadEmpleado(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_FECHAINGRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_FECHASALIDA);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_NUMERODIAS);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROCARGAS);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR10);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR10);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR10);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROFACTOR5);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_VALORFACTOR5);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_UTILIDADFACTOR5);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadEmpleadoConstantesFunciones.LABEL_TOTAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelUtilidadEmpleado(UtilidadEmpleado utilidadempleado,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadempleado.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadempleado.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadempleado.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadempleado.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadempleado.getfecha_ingreso());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadempleado.getfecha_salida());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadempleado.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadempleado.getnumero_dias());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadempleado.getnumero_cargas());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadempleado.getnumero_factor10());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadempleado.getvalor_factor10());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadempleado.getutilidad_factor10());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadempleado.getnumero_factor5());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadempleado.getvalor_factor5());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadempleado.getutilidad_factor5());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadempleado.gettotal());				
	}
	
	public void setFilaDatosExportarXmlUtilidadEmpleado(UtilidadEmpleado utilidadempleado,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(UtilidadEmpleadoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(utilidadempleado.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(UtilidadEmpleadoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(utilidadempleado.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(UtilidadEmpleadoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(utilidadempleado.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempleado_descripcion = document.createElement(UtilidadEmpleadoConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(utilidadempleado.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementanio_descripcion = document.createElement(UtilidadEmpleadoConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(utilidadempleado.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementfecha_ingreso = document.createElement(UtilidadEmpleadoConstantesFunciones.FECHAINGRESO);
		elementfecha_ingreso.appendChild(document.createTextNode(utilidadempleado.getfecha_ingreso().toString().trim()));
		element.appendChild(elementfecha_ingreso);

		Element elementfecha_salida = document.createElement(UtilidadEmpleadoConstantesFunciones.FECHASALIDA);
		elementfecha_salida.appendChild(document.createTextNode(utilidadempleado.getfecha_salida().toString().trim()));
		element.appendChild(elementfecha_salida);

		Element elementvalor = document.createElement(UtilidadEmpleadoConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(utilidadempleado.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementnumero_dias = document.createElement(UtilidadEmpleadoConstantesFunciones.NUMERODIAS);
		elementnumero_dias.appendChild(document.createTextNode(utilidadempleado.getnumero_dias().toString().trim()));
		element.appendChild(elementnumero_dias);

		Element elementnumero_cargas = document.createElement(UtilidadEmpleadoConstantesFunciones.NUMEROCARGAS);
		elementnumero_cargas.appendChild(document.createTextNode(utilidadempleado.getnumero_cargas().toString().trim()));
		element.appendChild(elementnumero_cargas);

		Element elementnumero_factor10 = document.createElement(UtilidadEmpleadoConstantesFunciones.NUMEROFACTOR10);
		elementnumero_factor10.appendChild(document.createTextNode(utilidadempleado.getnumero_factor10().toString().trim()));
		element.appendChild(elementnumero_factor10);

		Element elementvalor_factor10 = document.createElement(UtilidadEmpleadoConstantesFunciones.VALORFACTOR10);
		elementvalor_factor10.appendChild(document.createTextNode(utilidadempleado.getvalor_factor10().toString().trim()));
		element.appendChild(elementvalor_factor10);

		Element elementutilidad_factor10 = document.createElement(UtilidadEmpleadoConstantesFunciones.UTILIDADFACTOR10);
		elementutilidad_factor10.appendChild(document.createTextNode(utilidadempleado.getutilidad_factor10().toString().trim()));
		element.appendChild(elementutilidad_factor10);

		Element elementnumero_factor5 = document.createElement(UtilidadEmpleadoConstantesFunciones.NUMEROFACTOR5);
		elementnumero_factor5.appendChild(document.createTextNode(utilidadempleado.getnumero_factor5().toString().trim()));
		element.appendChild(elementnumero_factor5);

		Element elementvalor_factor5 = document.createElement(UtilidadEmpleadoConstantesFunciones.VALORFACTOR5);
		elementvalor_factor5.appendChild(document.createTextNode(utilidadempleado.getvalor_factor5().toString().trim()));
		element.appendChild(elementvalor_factor5);

		Element elementutilidad_factor5 = document.createElement(UtilidadEmpleadoConstantesFunciones.UTILIDADFACTOR5);
		elementutilidad_factor5.appendChild(document.createTextNode(utilidadempleado.getutilidad_factor5().toString().trim()));
		element.appendChild(elementutilidad_factor5);

		Element elementtotal = document.createElement(UtilidadEmpleadoConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(utilidadempleado.gettotal().toString().trim()));
		element.appendChild(elementtotal);
	}
	
	public void generarReporteGroupGenericoUtilidadEmpleadosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<UtilidadEmpleado> utilidadempleadosSeleccionados=new ArrayList<UtilidadEmpleado>();
		
		utilidadempleadosSeleccionados=this.getUtilidadEmpleadosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoUtilidadEmpleado(utilidadempleadosSeleccionados);
		
		this.generarReporteUtilidadEmpleados("Todos",utilidadempleadosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoUtilidadEmpleado(ArrayList<UtilidadEmpleado> utilidadempleadosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(UtilidadEmpleado utilidadempleadoAux:utilidadempleadosSeleccionados) {
				utilidadempleadoAux.setsDetalleGeneralEntityReporte(utilidadempleadoAux.toString());
			
				if(sTipoSeleccionar.equals(UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					utilidadempleadoAux.setsDescripcionGeneralEntityReporte1(utilidadempleadoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(UtilidadEmpleadoConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					utilidadempleadoAux.setsDescripcionGeneralEntityReporte1(utilidadempleadoAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(UtilidadEmpleadoConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					utilidadempleadoAux.setsDescripcionGeneralEntityReporte1(utilidadempleadoAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(UtilidadEmpleadoConstantesFunciones.LABEL_FECHAINGRESO)) {
					existe=true;
					utilidadempleadoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(utilidadempleadoAux.getfecha_ingreso()));
				}
				 else if(sTipoSeleccionar.equals(UtilidadEmpleadoConstantesFunciones.LABEL_FECHASALIDA)) {
					existe=true;
					utilidadempleadoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(utilidadempleadoAux.getfecha_salida()));
				}
				 else if(sTipoSeleccionar.equals(UtilidadEmpleadoConstantesFunciones.LABEL_NUMERODIAS)) {
					existe=true;
					utilidadempleadoAux.setsDescripcionGeneralEntityReporte1(utilidadempleadoAux.getnumero_dias().toString());
				}
				 else if(sTipoSeleccionar.equals(UtilidadEmpleadoConstantesFunciones.LABEL_NUMEROCARGAS)) {
					existe=true;
					utilidadempleadoAux.setsDescripcionGeneralEntityReporte1(utilidadempleadoAux.getnumero_cargas().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesUtilidadEmpleado(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoUtilidadEmpleado=true;
				this.isVisibilidadCeldaNuevoRelacionesUtilidadEmpleado=true;
				this.isVisibilidadCeldaGuardarCambiosUtilidadEmpleado=true;
			}
			
			this.isVisibilidadCeldaModificarUtilidadEmpleado=false;
			this.isVisibilidadCeldaActualizarUtilidadEmpleado=false;
			this.isVisibilidadCeldaEliminarUtilidadEmpleado=false;
			this.isVisibilidadCeldaCancelarUtilidadEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUtilidadEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarUtilidadEmpleado=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoUtilidadEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosUtilidadEmpleado=false;
			this.isVisibilidadCeldaModificarUtilidadEmpleado=false;
			this.isVisibilidadCeldaActualizarUtilidadEmpleado=true;
			this.isVisibilidadCeldaEliminarUtilidadEmpleado=false;
			this.isVisibilidadCeldaCancelarUtilidadEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUtilidadEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarUtilidadEmpleado=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoUtilidadEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosUtilidadEmpleado=false;
			this.isVisibilidadCeldaModificarUtilidadEmpleado=false;
			this.isVisibilidadCeldaActualizarUtilidadEmpleado=true;
			this.isVisibilidadCeldaEliminarUtilidadEmpleado=true;
			this.isVisibilidadCeldaCancelarUtilidadEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUtilidadEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarUtilidadEmpleado=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoUtilidadEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosUtilidadEmpleado=false;
			this.isVisibilidadCeldaModificarUtilidadEmpleado=false;
			this.isVisibilidadCeldaActualizarUtilidadEmpleado=true;
			this.isVisibilidadCeldaEliminarUtilidadEmpleado=false;
			this.isVisibilidadCeldaCancelarUtilidadEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUtilidadEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarUtilidadEmpleado=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoUtilidadEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadEmpleado=true;
			this.isVisibilidadCeldaGuardarCambiosUtilidadEmpleado=true;
			this.isVisibilidadCeldaModificarUtilidadEmpleado=false;
			this.isVisibilidadCeldaActualizarUtilidadEmpleado=false;
			this.isVisibilidadCeldaEliminarUtilidadEmpleado=false;
			this.isVisibilidadCeldaCancelarUtilidadEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUtilidadEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarUtilidadEmpleado=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoUtilidadEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosUtilidadEmpleado=false;
			this.isVisibilidadCeldaActualizarUtilidadEmpleado=false;
			this.isVisibilidadCeldaEliminarUtilidadEmpleado=false;
			this.isVisibilidadCeldaCancelarUtilidadEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUtilidadEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarUtilidadEmpleado=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoUtilidadEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosUtilidadEmpleado=false;
			this.isVisibilidadCeldaModificarUtilidadEmpleado=true;
			this.isVisibilidadCeldaActualizarUtilidadEmpleado=false;
			this.isVisibilidadCeldaEliminarUtilidadEmpleado=false;
			this.isVisibilidadCeldaCancelarUtilidadEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUtilidadEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarUtilidadEmpleado=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(UtilidadEmpleadoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoUtilidadEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadEmpleado=true;
			this.isVisibilidadCeldaGuardarCambiosUtilidadEmpleado=true;
		} else {
			this.actualizarEstadoPanelsUtilidadEmpleado(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarUtilidadEmpleado=false;
			//this.isVisibilidadCeldaVerFormUtilidadEmpleado=false;
			this.isVisibilidadCeldaDuplicarUtilidadEmpleado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!utilidadempleadoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesUtilidadEmpleado=false;
		} else {
			this.isVisibilidadCeldaNuevoUtilidadEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosUtilidadEmpleado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(utilidadempleadoSessionBean.getEsGuardarRelacionado()) {
			if(!utilidadempleadoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesUtilidadEmpleado=false;												
			}
			
			this.jButtonCerrarUtilidadEmpleado.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesUtilidadEmpleado=false;
		}
		
		if(!this.permiteMantenimiento(this.utilidadempleado)) {
			this.isVisibilidadCeldaActualizarUtilidadEmpleado=false;
			this.isVisibilidadCeldaEliminarUtilidadEmpleado=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesUtilidadEmpleado() {
	}
	
	public void actualizarEstadoPanelsUtilidadEmpleado(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionUtilidadEmpleado!=null) {
				this.jScrollPanelDatosEdicionUtilidadEmpleado.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadEmpleado!=null) {
				this.jTabbedPaneBusquedasUtilidadEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUtilidadEmpleado!=null) {
				this.jScrollPanelDatosUtilidadEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionUtilidadEmpleado!=null) {
				this.jPanelPaginacionUtilidadEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUtilidadEmpleado!=null) {
				this.jPanelParametrosReportesUtilidadEmpleado.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionUtilidadEmpleado!=null) {
				this.jScrollPanelDatosEdicionUtilidadEmpleado.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadEmpleado!=null) {
				this.jTabbedPaneBusquedasUtilidadEmpleado.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosUtilidadEmpleado!=null) {
				this.jScrollPanelDatosUtilidadEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionUtilidadEmpleado!=null) {
				this.jPanelPaginacionUtilidadEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesUtilidadEmpleado!=null) {
				this.jPanelParametrosReportesUtilidadEmpleado.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionUtilidadEmpleado!=null) {
				this.jScrollPanelDatosEdicionUtilidadEmpleado.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadEmpleado!=null) {
				this.jTabbedPaneBusquedasUtilidadEmpleado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosUtilidadEmpleado!=null) {
				this.jScrollPanelDatosUtilidadEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionUtilidadEmpleado!=null) {
				this.jPanelPaginacionUtilidadEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesUtilidadEmpleado!=null) {
				this.jPanelParametrosReportesUtilidadEmpleado.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionUtilidadEmpleado!=null) {
				this.jScrollPanelDatosEdicionUtilidadEmpleado.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadEmpleado!=null) {
				this.jTabbedPaneBusquedasUtilidadEmpleado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosUtilidadEmpleado!=null) {
				this.jScrollPanelDatosUtilidadEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionUtilidadEmpleado!=null) {
				this.jPanelPaginacionUtilidadEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesUtilidadEmpleado!=null) {
				this.jPanelParametrosReportesUtilidadEmpleado.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionUtilidadEmpleado!=null) {
				this.jScrollPanelDatosEdicionUtilidadEmpleado.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadEmpleado!=null) {
				this.jTabbedPaneBusquedasUtilidadEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUtilidadEmpleado!=null) {
				this.jScrollPanelDatosUtilidadEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionUtilidadEmpleado!=null) {
				this.jPanelPaginacionUtilidadEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUtilidadEmpleado!=null) {
				this.jPanelParametrosReportesUtilidadEmpleado.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionUtilidadEmpleado!=null) {
				this.jScrollPanelDatosEdicionUtilidadEmpleado.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadEmpleado!=null) {
				this.jTabbedPaneBusquedasUtilidadEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUtilidadEmpleado!=null) {
				this.jScrollPanelDatosUtilidadEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionUtilidadEmpleado!=null) {
				this.jPanelPaginacionUtilidadEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUtilidadEmpleado!=null) {
				this.jPanelParametrosReportesUtilidadEmpleado.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionUtilidadEmpleado!=null) {
				this.jScrollPanelDatosEdicionUtilidadEmpleado.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadEmpleado!=null) {
				this.jTabbedPaneBusquedasUtilidadEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUtilidadEmpleado!=null) {
				this.jScrollPanelDatosUtilidadEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionUtilidadEmpleado!=null) {
				this.jPanelPaginacionUtilidadEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUtilidadEmpleado!=null) {
				this.jPanelParametrosReportesUtilidadEmpleado.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasUtilidadEmpleado!=null) {
					this.jTabbedPaneBusquedasUtilidadEmpleado.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesUtilidadEmpleado!=null) {
				this.jPanelParametrosReportesUtilidadEmpleado.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.utilidadempleadoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadEmpleado!=null) {
				this.jTabbedPaneBusquedasUtilidadEmpleado.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesUtilidadEmpleado!=null) {
				this.jPanelParametrosReportesUtilidadEmpleado.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdAnio=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasUtilidadEmpleado.remove(jPanelFK_IdAnioUtilidadEmpleado);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasUtilidadEmpleado.remove(jPanelFK_IdEmpleadoUtilidadEmpleado);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdAnio=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasUtilidadEmpleado.remove(jPanelFK_IdAnioUtilidadEmpleado);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasUtilidadEmpleado.remove(jPanelFK_IdEmpleadoUtilidadEmpleado);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadFK_IdAnio=isParaAnio;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasUtilidadEmpleado.remove(jPanelFK_IdAnioUtilidadEmpleado);}

			this.isVisibilidadFK_IdEmpleado=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasUtilidadEmpleado.remove(jPanelFK_IdEmpleadoUtilidadEmpleado);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//UtilidadEmpleadoSessionBean utilidadempleadoSessionBean=new UtilidadEmpleadoSessionBean();
		
		if(this.utilidadempleadoSessionBean==null) {
			this.utilidadempleadoSessionBean=new UtilidadEmpleadoSessionBean();
		}
		
		this.utilidadempleadoSessionBean.setsUltimaBusquedaUtilidadEmpleado(this.getsAccionBusqueda());
		this.utilidadempleadoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.utilidadempleadoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
			utilidadempleadoSessionBean.setid_anio(this.getid_anioFK_IdAnio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			utilidadempleadoSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			utilidadempleadoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//UtilidadEmpleadoSessionBean utilidadempleadoSessionBean=new UtilidadEmpleadoSessionBean();
		
		if(this.utilidadempleadoSessionBean==null) {
			this.utilidadempleadoSessionBean=new UtilidadEmpleadoSessionBean();
		}
		
		if(this.utilidadempleadoSessionBean.getsUltimaBusquedaUtilidadEmpleado()!=null&&!this.utilidadempleadoSessionBean.getsUltimaBusquedaUtilidadEmpleado().equals("")) {
			this.setsAccionBusqueda(utilidadempleadoSessionBean.getsUltimaBusquedaUtilidadEmpleado());
			this.setiNumeroPaginacion(utilidadempleadoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(utilidadempleadoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
				this.setid_anioFK_IdAnio(utilidadempleadoSessionBean.getid_anio());
				utilidadempleadoSessionBean.setid_anio(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(utilidadempleadoSessionBean.getid_empleado());
				utilidadempleadoSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(utilidadempleadoSessionBean.getid_empresa());
				utilidadempleadoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.utilidadempleadoSessionBean.setsUltimaBusquedaUtilidadEmpleado("");
		this.utilidadempleadoSessionBean.setiNumeroPaginacion(UtilidadEmpleadoConstantesFunciones.INUMEROPAGINACION);
		this.utilidadempleadoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaUtilidadEmpleado(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioUtilidadEmpleado() {
		this.updateBorderResaltarBusquedasFormularioUtilidadEmpleado();
		this.updateVisibilidadBusquedasFormularioUtilidadEmpleado();
		this.updateHabilitarBusquedasFormularioUtilidadEmpleado();
	}
	
	public void updateBorderResaltarBusquedasFormularioUtilidadEmpleado() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasUtilidadEmpleado.getComponents().length>0) {
	

		if(this.utilidadempleadoConstantesFunciones.resaltarFK_IdAnioUtilidadEmpleado!=null) {
			index= this.jTabbedPaneBusquedasUtilidadEmpleado.indexOfComponent(this.jPanelFK_IdAnioUtilidadEmpleado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUtilidadEmpleado.getComponent(index);
				jPanel.setBorder(this.utilidadempleadoConstantesFunciones.resaltarFK_IdAnioUtilidadEmpleado);
			}
		}

		if(this.utilidadempleadoConstantesFunciones.resaltarFK_IdEmpleadoUtilidadEmpleado!=null) {
			index= this.jTabbedPaneBusquedasUtilidadEmpleado.indexOfComponent(this.jPanelFK_IdEmpleadoUtilidadEmpleado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUtilidadEmpleado.getComponent(index);
				jPanel.setBorder(this.utilidadempleadoConstantesFunciones.resaltarFK_IdEmpleadoUtilidadEmpleado);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioUtilidadEmpleado() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasUtilidadEmpleado.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasUtilidadEmpleado.indexOfComponent(this.jPanelFK_IdAnioUtilidadEmpleado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasUtilidadEmpleado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.utilidadempleadoConstantesFunciones.mostrarFK_IdAnioUtilidadEmpleado);
			if(!this.utilidadempleadoConstantesFunciones.mostrarFK_IdAnioUtilidadEmpleado && index>-1) {
				this.jTabbedPaneBusquedasUtilidadEmpleado.remove(index);
			}

			index= this.jTabbedPaneBusquedasUtilidadEmpleado.indexOfComponent(this.jPanelFK_IdEmpleadoUtilidadEmpleado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasUtilidadEmpleado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.utilidadempleadoConstantesFunciones.mostrarFK_IdEmpleadoUtilidadEmpleado);
			if(!this.utilidadempleadoConstantesFunciones.mostrarFK_IdEmpleadoUtilidadEmpleado && index>-1) {
				this.jTabbedPaneBusquedasUtilidadEmpleado.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioUtilidadEmpleado() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasUtilidadEmpleado.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasUtilidadEmpleado.indexOfComponent(this.jPanelFK_IdAnioUtilidadEmpleado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasUtilidadEmpleado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.utilidadempleadoConstantesFunciones.activarFK_IdAnioUtilidadEmpleado);
				this.jTabbedPaneBusquedasUtilidadEmpleado.setEnabledAt(index,this.utilidadempleadoConstantesFunciones.activarFK_IdAnioUtilidadEmpleado);
			}

			index= this.jTabbedPaneBusquedasUtilidadEmpleado.indexOfComponent(this.jPanelFK_IdEmpleadoUtilidadEmpleado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasUtilidadEmpleado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.utilidadempleadoConstantesFunciones.activarFK_IdEmpleadoUtilidadEmpleado);
				this.jTabbedPaneBusquedasUtilidadEmpleado.setEnabledAt(index,this.utilidadempleadoConstantesFunciones.activarFK_IdEmpleadoUtilidadEmpleado);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaUtilidadEmpleado(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdAnio")) {
			index= this.jTabbedPaneBusquedasUtilidadEmpleado.indexOfComponent(this.jPanelFK_IdAnioUtilidadEmpleado);

			this.jTabbedPaneBusquedasUtilidadEmpleado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUtilidadEmpleado.getComponent(index);

			this.utilidadempleadoConstantesFunciones.setResaltarFK_IdAnioUtilidadEmpleado(resaltar);

			jPanel.setBorder(this.utilidadempleadoConstantesFunciones.resaltarFK_IdAnioUtilidadEmpleado);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasUtilidadEmpleado.indexOfComponent(this.jPanelFK_IdEmpleadoUtilidadEmpleado);

			this.jTabbedPaneBusquedasUtilidadEmpleado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUtilidadEmpleado.getComponent(index);

			this.utilidadempleadoConstantesFunciones.setResaltarFK_IdEmpleadoUtilidadEmpleado(resaltar);

			jPanel.setBorder(this.utilidadempleadoConstantesFunciones.resaltarFK_IdEmpleadoUtilidadEmpleado);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarUtilidadEmpleado.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioUtilidadEmpleado() throws Exception {

		if(this.jInternalFrameDetalleFormUtilidadEmpleado==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioUtilidadEmpleado();
		this.updateVisibilidadResaltarControlesFormularioUtilidadEmpleado();
		this.updateHabilitarResaltarControlesFormularioUtilidadEmpleado();
		
	}
	
	public void updateBorderResaltarControlesFormularioUtilidadEmpleado() throws Exception {
		if(this.jInternalFrameDetalleFormUtilidadEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.utilidadempleadoConstantesFunciones.resaltaridUtilidadEmpleado!=null && this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelidUtilidadEmpleado.setBorder(this.utilidadempleadoConstantesFunciones.resaltaridUtilidadEmpleado);}
		if(this.utilidadempleadoConstantesFunciones.resaltarid_empresaUtilidadEmpleado!=null && this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_empresaUtilidadEmpleado.setBorder(this.utilidadempleadoConstantesFunciones.resaltarid_empresaUtilidadEmpleado);}
		if(this.utilidadempleadoConstantesFunciones.resaltarid_empleadoUtilidadEmpleado!=null && this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_empleadoUtilidadEmpleado.setBorder(this.utilidadempleadoConstantesFunciones.resaltarid_empleadoUtilidadEmpleado);}
		if(this.utilidadempleadoConstantesFunciones.resaltarid_anioUtilidadEmpleado!=null && this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_anioUtilidadEmpleado.setBorder(this.utilidadempleadoConstantesFunciones.resaltarid_anioUtilidadEmpleado);}
		if(this.utilidadempleadoConstantesFunciones.resaltarfecha_ingresoUtilidadEmpleado!=null && this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {this.jInternalFrameDetalleFormUtilidadEmpleado.jDateChooserfecha_ingresoUtilidadEmpleado.setBorder(this.utilidadempleadoConstantesFunciones.resaltarfecha_ingresoUtilidadEmpleado);}
		if(this.utilidadempleadoConstantesFunciones.resaltarfecha_salidaUtilidadEmpleado!=null && this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {this.jInternalFrameDetalleFormUtilidadEmpleado.jDateChooserfecha_salidaUtilidadEmpleado.setBorder(this.utilidadempleadoConstantesFunciones.resaltarfecha_salidaUtilidadEmpleado);}
		if(this.utilidadempleadoConstantesFunciones.resaltarvalorUtilidadEmpleado!=null && this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldvalorUtilidadEmpleado.setBorder(this.utilidadempleadoConstantesFunciones.resaltarvalorUtilidadEmpleado);}
		if(this.utilidadempleadoConstantesFunciones.resaltarnumero_diasUtilidadEmpleado!=null && this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_diasUtilidadEmpleado.setBorder(this.utilidadempleadoConstantesFunciones.resaltarnumero_diasUtilidadEmpleado);}
		if(this.utilidadempleadoConstantesFunciones.resaltarnumero_cargasUtilidadEmpleado!=null && this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_cargasUtilidadEmpleado.setBorder(this.utilidadempleadoConstantesFunciones.resaltarnumero_cargasUtilidadEmpleado);}
		if(this.utilidadempleadoConstantesFunciones.resaltarnumero_factor10UtilidadEmpleado!=null && this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_factor10UtilidadEmpleado.setBorder(this.utilidadempleadoConstantesFunciones.resaltarnumero_factor10UtilidadEmpleado);}
		if(this.utilidadempleadoConstantesFunciones.resaltarvalor_factor10UtilidadEmpleado!=null && this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldvalor_factor10UtilidadEmpleado.setBorder(this.utilidadempleadoConstantesFunciones.resaltarvalor_factor10UtilidadEmpleado);}
		if(this.utilidadempleadoConstantesFunciones.resaltarutilidad_factor10UtilidadEmpleado!=null && this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldutilidad_factor10UtilidadEmpleado.setBorder(this.utilidadempleadoConstantesFunciones.resaltarutilidad_factor10UtilidadEmpleado);}
		if(this.utilidadempleadoConstantesFunciones.resaltarnumero_factor5UtilidadEmpleado!=null && this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_factor5UtilidadEmpleado.setBorder(this.utilidadempleadoConstantesFunciones.resaltarnumero_factor5UtilidadEmpleado);}
		if(this.utilidadempleadoConstantesFunciones.resaltarvalor_factor5UtilidadEmpleado!=null && this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldvalor_factor5UtilidadEmpleado.setBorder(this.utilidadempleadoConstantesFunciones.resaltarvalor_factor5UtilidadEmpleado);}
		if(this.utilidadempleadoConstantesFunciones.resaltarutilidad_factor5UtilidadEmpleado!=null && this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldutilidad_factor5UtilidadEmpleado.setBorder(this.utilidadempleadoConstantesFunciones.resaltarutilidad_factor5UtilidadEmpleado);}
		if(this.utilidadempleadoConstantesFunciones.resaltartotalUtilidadEmpleado!=null && this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldtotalUtilidadEmpleado.setBorder(this.utilidadempleadoConstantesFunciones.resaltartotalUtilidadEmpleado);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioUtilidadEmpleado() throws Exception {		
		if(this.jInternalFrameDetalleFormUtilidadEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {
	
		//this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelidUtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostraridUtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jPanelidUtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostraridUtilidadEmpleado);
		//this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_empresaUtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostrarid_empresaUtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jPanelid_empresaUtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostrarid_empresaUtilidadEmpleado);
		//this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_empleadoUtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostrarid_empleadoUtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jPanelid_empleadoUtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostrarid_empleadoUtilidadEmpleado);
		//this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_anioUtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostrarid_anioUtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jPanelid_anioUtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostrarid_anioUtilidadEmpleado);
		//this.jInternalFrameDetalleFormUtilidadEmpleado.jDateChooserfecha_ingresoUtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostrarfecha_ingresoUtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jPanelfecha_ingresoUtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostrarfecha_ingresoUtilidadEmpleado);
		//this.jInternalFrameDetalleFormUtilidadEmpleado.jDateChooserfecha_salidaUtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostrarfecha_salidaUtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jPanelfecha_salidaUtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostrarfecha_salidaUtilidadEmpleado);
		//this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldvalorUtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostrarvalorUtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jPanelvalorUtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostrarvalorUtilidadEmpleado);
		//this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_diasUtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostrarnumero_diasUtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jPanelnumero_diasUtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostrarnumero_diasUtilidadEmpleado);
		//this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_cargasUtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostrarnumero_cargasUtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jPanelnumero_cargasUtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostrarnumero_cargasUtilidadEmpleado);
		//this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_factor10UtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostrarnumero_factor10UtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jPanelnumero_factor10UtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostrarnumero_factor10UtilidadEmpleado);
		//this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldvalor_factor10UtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostrarvalor_factor10UtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jPanelvalor_factor10UtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostrarvalor_factor10UtilidadEmpleado);
		//this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldutilidad_factor10UtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostrarutilidad_factor10UtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jPanelutilidad_factor10UtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostrarutilidad_factor10UtilidadEmpleado);
		//this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_factor5UtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostrarnumero_factor5UtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jPanelnumero_factor5UtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostrarnumero_factor5UtilidadEmpleado);
		//this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldvalor_factor5UtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostrarvalor_factor5UtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jPanelvalor_factor5UtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostrarvalor_factor5UtilidadEmpleado);
		//this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldutilidad_factor5UtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostrarutilidad_factor5UtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jPanelutilidad_factor5UtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostrarutilidad_factor5UtilidadEmpleado);
		//this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldtotalUtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostrartotalUtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jPaneltotalUtilidadEmpleado.setVisible(this.utilidadempleadoConstantesFunciones.mostrartotalUtilidadEmpleado);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioUtilidadEmpleado() throws Exception {
		if(this.jInternalFrameDetalleFormUtilidadEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormUtilidadEmpleado!=null) {
	
		this.jInternalFrameDetalleFormUtilidadEmpleado.jLabelidUtilidadEmpleado.setEnabled(this.utilidadempleadoConstantesFunciones.activaridUtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_empresaUtilidadEmpleado.setEnabled(this.utilidadempleadoConstantesFunciones.activarid_empresaUtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_empleadoUtilidadEmpleado.setEnabled(this.utilidadempleadoConstantesFunciones.activarid_empleadoUtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jComboBoxid_anioUtilidadEmpleado.setEnabled(this.utilidadempleadoConstantesFunciones.activarid_anioUtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jDateChooserfecha_ingresoUtilidadEmpleado.setEnabled(this.utilidadempleadoConstantesFunciones.activarfecha_ingresoUtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jDateChooserfecha_salidaUtilidadEmpleado.setEnabled(this.utilidadempleadoConstantesFunciones.activarfecha_salidaUtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldvalorUtilidadEmpleado.setEnabled(this.utilidadempleadoConstantesFunciones.activarvalorUtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_diasUtilidadEmpleado.setEnabled(this.utilidadempleadoConstantesFunciones.activarnumero_diasUtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_cargasUtilidadEmpleado.setEnabled(this.utilidadempleadoConstantesFunciones.activarnumero_cargasUtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_factor10UtilidadEmpleado.setEnabled(this.utilidadempleadoConstantesFunciones.activarnumero_factor10UtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldvalor_factor10UtilidadEmpleado.setEnabled(this.utilidadempleadoConstantesFunciones.activarvalor_factor10UtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldutilidad_factor10UtilidadEmpleado.setEnabled(this.utilidadempleadoConstantesFunciones.activarutilidad_factor10UtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldnumero_factor5UtilidadEmpleado.setEnabled(this.utilidadempleadoConstantesFunciones.activarnumero_factor5UtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldvalor_factor5UtilidadEmpleado.setEnabled(this.utilidadempleadoConstantesFunciones.activarvalor_factor5UtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldutilidad_factor5UtilidadEmpleado.setEnabled(this.utilidadempleadoConstantesFunciones.activarutilidad_factor5UtilidadEmpleado);
		this.jInternalFrameDetalleFormUtilidadEmpleado.jTextFieldtotalUtilidadEmpleado.setEnabled(this.utilidadempleadoConstantesFunciones.activartotalUtilidadEmpleado);
		}
	}
	
		
}