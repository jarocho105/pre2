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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;




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

import com.bydan.erp.seguridad.util.ProvinciaConstantesFunciones;
import com.bydan.erp.seguridad.util.ProvinciaParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.ProvinciaParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.ProvinciaBean;
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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.seguridad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.business.logic.*;

import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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


import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProvinciaBeanSwingJInternalFrame extends ProvinciaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProvinciaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Provincia> provinciaValidator = new ClassValidator<Provincia>(Provincia.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Provincia provincia;	
	public Provincia provinciaAux;
	public Provincia provinciaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Provincia provinciaTotales;
	public Long idProvinciaActual;
	public Long iIdNuevoProvincia=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboPais="";

	public List<Pais> paissForeignKey;

	public List<Pais> getpaissForeignKey() {
		return paissForeignKey;
	}

	public void setpaissForeignKey(List<Pais> paissForeignKey) {
		this.paissForeignKey = paissForeignKey;
	}

	//OBJETO FK ACTUAL
	public Pais paisForeignKey;

	public Pais getpaisForeignKey() {
		return paisForeignKey;
	}

	public void setpaisForeignKey(Pais paisForeignKey) {
		this.paisForeignKey = paisForeignKey;
	}

	public String sFinalQueryComboRegion="";

	public List<Region> regionsForeignKey;

	public List<Region> getregionsForeignKey() {
		return regionsForeignKey;
	}

	public void setregionsForeignKey(List<Region> regionsForeignKey) {
		this.regionsForeignKey = regionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Region regionForeignKey;

	public Region getregionForeignKey() {
		return regionForeignKey;
	}

	public void setregionForeignKey(Region regionForeignKey) {
		this.regionForeignKey = regionForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosBarrio=false;

	public Boolean getIsTienePermisosBarrio() {
		return isTienePermisosBarrio;
	}

	public void setIsTienePermisosBarrio(Boolean isTienePermisosBarrio) {
		this.isTienePermisosBarrio= isTienePermisosBarrio;
	}


	public Boolean isTienePermisosCanton=false;

	public Boolean getIsTienePermisosCanton() {
		return isTienePermisosCanton;
	}

	public void setIsTienePermisosCanton(Boolean isTienePermisosCanton) {
		this.isTienePermisosCanton= isTienePermisosCanton;
	}


	public Boolean isTienePermisosDatoGeneralEmpleado=false;

	public Boolean getIsTienePermisosDatoGeneralEmpleado() {
		return isTienePermisosDatoGeneralEmpleado;
	}

	public void setIsTienePermisosDatoGeneralEmpleado(Boolean isTienePermisosDatoGeneralEmpleado) {
		this.isTienePermisosDatoGeneralEmpleado= isTienePermisosDatoGeneralEmpleado;
	}


	public Boolean isTienePermisosEmpleado=false;

	public Boolean getIsTienePermisosEmpleado() {
		return isTienePermisosEmpleado;
	}

	public void setIsTienePermisosEmpleado(Boolean isTienePermisosEmpleado) {
		this.isTienePermisosEmpleado= isTienePermisosEmpleado;
	}


	public Boolean isTienePermisosCliente=false;

	public Boolean getIsTienePermisosCliente() {
		return isTienePermisosCliente;
	}

	public void setIsTienePermisosCliente(Boolean isTienePermisosCliente) {
		this.isTienePermisosCliente= isTienePermisosCliente;
	}


	public Boolean isTienePermisosParametroCarteraDefecto=false;

	public Boolean getIsTienePermisosParametroCarteraDefecto() {
		return isTienePermisosParametroCarteraDefecto;
	}

	public void setIsTienePermisosParametroCarteraDefecto(Boolean isTienePermisosParametroCarteraDefecto) {
		this.isTienePermisosParametroCarteraDefecto= isTienePermisosParametroCarteraDefecto;
	}


	public Boolean isTienePermisosCiudad=false;

	public Boolean getIsTienePermisosCiudad() {
		return isTienePermisosCiudad;
	}

	public void setIsTienePermisosCiudad(Boolean isTienePermisosCiudad) {
		this.isTienePermisosCiudad= isTienePermisosCiudad;
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
	
	public Boolean isPermisoTodoProvincia;
	public Boolean isPermisoNuevoProvincia;
	public Boolean isPermisoActualizarProvincia;
	public Boolean isPermisoActualizarOriginalProvincia;
	public Boolean isPermisoEliminarProvincia;
	public Boolean isPermisoGuardarCambiosProvincia;
	public Boolean isPermisoConsultaProvincia;
	public Boolean isPermisoBusquedaProvincia;
	public Boolean isPermisoReporteProvincia;
	public Boolean isPermisoPaginacionMedioProvincia;
	public Boolean isPermisoPaginacionAltoProvincia;
	public Boolean isPermisoPaginacionTodoProvincia;
	public Boolean isPermisoCopiarProvincia;
	public Boolean isPermisoVerFormProvincia;
	public Boolean isPermisoDuplicarProvincia;
	public Boolean isPermisoOrdenProvincia;
	
	
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
	
	public ProvinciaParameterReturnGeneral provinciaReturnGeneral;
	public ProvinciaParameterReturnGeneral provinciaParameterGeneral;
	
	

	public CiudadLogic ciudadLogic=null;

	public CiudadLogic getCiudadLogic() {
		return ciudadLogic;
	}

	public void setCiudadLogic(CiudadLogic ciudadLogic) {
		this.ciudadLogic = ciudadLogic;
	}


	public ClienteLogic clienteLogic=null;

	public ClienteLogic getClienteLogic() {
		return clienteLogic;
	}

	public void setClienteLogic(ClienteLogic clienteLogic) {
		this.clienteLogic = clienteLogic;
	}


	public CantonLogic cantonLogic=null;

	public CantonLogic getCantonLogic() {
		return cantonLogic;
	}

	public void setCantonLogic(CantonLogic cantonLogic) {
		this.cantonLogic = cantonLogic;
	}


	public BarrioLogic barrioLogic=null;

	public BarrioLogic getBarrioLogic() {
		return barrioLogic;
	}

	public void setBarrioLogic(BarrioLogic barrioLogic) {
		this.barrioLogic = barrioLogic;
	}


	public EmpleadoLogic empleadoLogic=null;

	public EmpleadoLogic getEmpleadoLogic() {
		return empleadoLogic;
	}

	public void setEmpleadoLogic(EmpleadoLogic empleadoLogic) {
		this.empleadoLogic = empleadoLogic;
	}


	public DatoGeneralEmpleadoLogic datogeneralempleadoLogic=null;

	public DatoGeneralEmpleadoLogic getDatoGeneralEmpleadoLogic() {
		return datogeneralempleadoLogic;
	}

	public void setDatoGeneralEmpleadoLogic(DatoGeneralEmpleadoLogic datogeneralempleadoLogic) {
		this.datogeneralempleadoLogic = datogeneralempleadoLogic;
	}


	public ParametroCarteraDefectoLogic parametrocarteradefectoLogic=null;

	public ParametroCarteraDefectoLogic getParametroCarteraDefectoLogic() {
		return parametrocarteradefectoLogic;
	}

	public void setParametroCarteraDefectoLogic(ParametroCarteraDefectoLogic parametrocarteradefectoLogic) {
		this.parametrocarteradefectoLogic = parametrocarteradefectoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProvincia=false;
	public Boolean esParaAccionDesdeFormularioProvincia=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProvinciaSessionBeanAdditional provinciaSessionBeanAdditional=null;
	
	public ProvinciaSessionBeanAdditional getProvinciaSessionBeanAdditional() {
		return this.provinciaSessionBeanAdditional;
	}
	
	public void setProvinciaSessionBeanAdditional(ProvinciaSessionBeanAdditional provinciaSessionBeanAdditional) {
		try {
			this.provinciaSessionBeanAdditional=provinciaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProvinciaBeanSwingJInternalFrameAdditional provinciaBeanSwingJInternalFrameAdditional=null;
	//public class ProvinciaBeanSwingJInternalFrame
	
	public ProvinciaBeanSwingJInternalFrameAdditional getProvinciaBeanSwingJInternalFrameAdditional() {
		return this.provinciaBeanSwingJInternalFrameAdditional;
	}
	
	public void setProvinciaBeanSwingJInternalFrameAdditional(ProvinciaBeanSwingJInternalFrameAdditional provinciaBeanSwingJInternalFrameAdditional) {
		try {
			this.provinciaBeanSwingJInternalFrameAdditional=provinciaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProvinciaLogic provinciaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Provincia provinciaBean;
	public ProvinciaConstantesFunciones provinciaConstantesFunciones;
	//public ProvinciaParameterReturnGeneral provinciaReturnGeneral;
	
	//FK
	
	public PaisLogic paisLogic;
	public RegionLogic regionLogic;
	
	//PARAMETROS
	
	
	//public List<Provincia> provincias;	
	//public List<Provincia> provinciasEliminados;
	//public List<Provincia> provinciasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProvincia=false;
	public Boolean isVisibilidadCeldaDuplicarProvincia=true;
	public Boolean isVisibilidadCeldaCopiarProvincia=true;
	public Boolean isVisibilidadCeldaVerFormProvincia=true;
	public Boolean isVisibilidadCeldaOrdenProvincia=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProvincia=false;
	public Boolean isVisibilidadCeldaModificarProvincia=false;
	public Boolean isVisibilidadCeldaActualizarProvincia=false;
	public Boolean isVisibilidadCeldaEliminarProvincia=false;
	public Boolean isVisibilidadCeldaCancelarProvincia=false;
	public Boolean isVisibilidadCeldaGuardarProvincia=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProvincia=false;	
	
	
	public Boolean isVisibilidadBusquedaPorIdPaisPorNombre=false;
	public Boolean isVisibilidadFK_IdPais=false;
	public Boolean isVisibilidadFK_IdRegion=false;
	
	public Long getiIdNuevoProvincia() {
		return this.iIdNuevoProvincia;
	}

	public void setiIdNuevoProvincia(Long iIdNuevoProvincia) {
		this.iIdNuevoProvincia = iIdNuevoProvincia;
	}
	
	public Long getidProvinciaActual() {
		return this.idProvinciaActual;
	}

	public void setidProvinciaActual(Long idProvinciaActual) {
		this.idProvinciaActual = idProvinciaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Provincia getprovincia() {
		return this.provincia;
	}

	public void setprovincia(Provincia provincia) {
		this.provincia = provincia;
	}
	
	public Provincia getprovinciaAux() {
		return this.provinciaAux;
	}

	public void setprovinciaAux(Provincia provinciaAux) {
		this.provinciaAux = provinciaAux;
	}				
	
	public Provincia getprovinciaAnterior() {
		return this.provinciaAnterior;
	}

	public void setprovinciaAnterior(Provincia provinciaAnterior) {
		this.provinciaAnterior = provinciaAnterior;
	}	
	
	public Provincia getprovinciaTotales() {
		return this.provinciaTotales;
	}

	public void setprovinciaTotales(Provincia provinciaTotales) {
		this.provinciaTotales = provinciaTotales;
	}	
	
	public Provincia getprovinciaBean() {
		return this.provinciaBean;
	}

	public void setprovinciaBean(Provincia provinciaBean) {
		this.provinciaBean = provinciaBean;
	}	
	
	public ProvinciaParameterReturnGeneral getprovinciaReturnGeneral() {
		return this.provinciaReturnGeneral;
	}

	public void setprovinciaReturnGeneral(ProvinciaParameterReturnGeneral provinciaReturnGeneral) {
		this.provinciaReturnGeneral = provinciaReturnGeneral;
	}	
	
	
	public Long id_paisBusquedaPorIdPaisPorNombre=-1L;

	public Long getid_paisBusquedaPorIdPaisPorNombre() {
		return this.id_paisBusquedaPorIdPaisPorNombre;
	}

	public void setid_paisBusquedaPorIdPaisPorNombre(Long id_paisBusquedaPorIdPaisPorNombre) {
		this.id_paisBusquedaPorIdPaisPorNombre = id_paisBusquedaPorIdPaisPorNombre;
	}

;
	public String nombreBusquedaPorIdPaisPorNombre="";

	public String getnombreBusquedaPorIdPaisPorNombre() {
		return this.nombreBusquedaPorIdPaisPorNombre;
	}

	public void setnombreBusquedaPorIdPaisPorNombre(String nombreBusquedaPorIdPaisPorNombre) {
		this.nombreBusquedaPorIdPaisPorNombre = nombreBusquedaPorIdPaisPorNombre;
	}

	public Long id_paisFK_IdPais=-1L;

	public Long getid_paisFK_IdPais() {
		return this.id_paisFK_IdPais;
	}

	public void setid_paisFK_IdPais(Long id_paisFK_IdPais) {
		this.id_paisFK_IdPais = id_paisFK_IdPais;
	}

	public Long id_regionFK_IdRegion=-1L;

	public Long getid_regionFK_IdRegion() {
		return this.id_regionFK_IdRegion;
	}

	public void setid_regionFK_IdRegion(Long id_regionFK_IdRegion) {
		this.id_regionFK_IdRegion = id_regionFK_IdRegion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProvinciaLogic getProvinciaLogic()	{		
		return provinciaLogic;
	}

	public void setProvinciaLogic(ProvinciaLogic provinciaLogic) {
		this.provinciaLogic = provinciaLogic;
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
	
	public Boolean getIsEsNuevoProvincia() {
		return isEsNuevoProvincia;
	}

	public void setIsEsNuevoProvincia(Boolean isEsNuevoProvincia) {
		this.isEsNuevoProvincia = isEsNuevoProvincia;
	}

	public Boolean getEsParaAccionDesdeFormularioProvincia() {
		return esParaAccionDesdeFormularioProvincia;
	}
	
	public void setEsParaAccionDesdeFormularioProvincia(Boolean esParaAccionDesdeFormularioProvincia) {
		this.esParaAccionDesdeFormularioProvincia = esParaAccionDesdeFormularioProvincia;
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
	
	
	public void cargarCombosPaissForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.paissForeignKey=new ArrayList<Pais>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PaisLogic paisLogic=new PaisLogic();

			paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

			if(this.provinciaSessionBean==null) {
				this.provinciaSessionBean=new ProvinciaSessionBean();
			}

			if(!this.provinciaSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

					paisLogic.getTodosPaissWithConnection(sFinalQuery,new Pagination());

					this.paissForeignKey=paisLogic.getPaiss();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPais(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getEntityWithConnection(provinciaSessionBean.getlidPaisActual());
					this.paissForeignKey.add(paisLogic.getPais());
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

	public void cargarCombosRegionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.regionsForeignKey=new ArrayList<Region>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			RegionLogic regionLogic=new RegionLogic();

			regionLogic.getRegionDataAccess().setIsForForeingKeyData(true);

			if(this.provinciaSessionBean==null) {
				this.provinciaSessionBean=new ProvinciaSessionBean();
			}

			if(!this.provinciaSessionBean.getisBusquedaDesdeForeignKeySesionRegion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					regionLogic.getRegionDataAccess().setIsForForeingKeyData(true);

					regionLogic.getTodosRegionsWithConnection(sFinalQuery,new Pagination());

					this.regionsForeignKey=regionLogic.getRegions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaRegion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					regionLogic.getEntityWithConnection(provinciaSessionBean.getlidRegionActual());
					this.regionsForeignKey.add(regionLogic.getRegion());
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

	
	
	public void setActualPaisForeignKey(Long idPaisSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(paisTemp!=null) {

					if(this.provincia!=null) {
						this.provincia.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormProvincia!=null) {
						this.jInternalFrameDetalleFormProvincia.jComboBoxid_paisProvincia.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisProvincia.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormProvincia!=null) {
						if(this.jInternalFrameDetalleFormProvincia.jComboBoxid_paisProvincia.getItemCount()>0) {
							this.jInternalFrameDetalleFormProvincia.jComboBoxid_paisProvincia.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdPaisPorNombre") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia!=null) {
						jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia!=null) {
							//jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia.setSelectedItem(paisTemp);
							if(jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia.getItemCount()>0) {
								jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisProvincia!=null) {
						jComboBoxid_paisFK_IdPaisProvincia.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisProvincia!=null) {
							//jComboBoxid_paisFK_IdPaisProvincia.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisProvincia.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisProvincia.setSelectedIndex(0);
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

	public String getActualPaisForeignKeyDescripcion(Long idPaisSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}


			sDescripcion=PaisConstantesFunciones.getPaisDescripcion(paisTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisProvinciaGenerico)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(paisTemp!=null) {
				jComboBoxid_paisProvinciaGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisProvinciaGenerico!=null && jComboBoxid_paisProvinciaGenerico.getItemCount()>0) {
					jComboBoxid_paisProvinciaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualRegionForeignKey(Long idRegionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Region  regionTemp=null;

			for(Region regionAux:regionsForeignKey) {
				if(regionAux.getId()!=null && regionAux.getId().equals(idRegionSeleccionado)) {
					regionTemp=regionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(regionTemp!=null) {

					if(this.provincia!=null) {
						this.provincia.setRegion(regionTemp);
					}

					if(this.jInternalFrameDetalleFormProvincia!=null) {
						this.jInternalFrameDetalleFormProvincia.jComboBoxid_regionProvincia.setSelectedItem(regionTemp);
					}
				} else {
					//jComboBoxid_regionProvincia.setSelectedItem(regionTemp);
					if(this.jInternalFrameDetalleFormProvincia!=null) {
						if(this.jInternalFrameDetalleFormProvincia.jComboBoxid_regionProvincia.getItemCount()>0) {
							this.jInternalFrameDetalleFormProvincia.jComboBoxid_regionProvincia.setSelectedIndex(0);
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

	public String getActualRegionForeignKeyDescripcion(Long idRegionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Region  regionTemp=null;

			for(Region regionAux:regionsForeignKey) {
				if(regionAux.getId()!=null && regionAux.getId().equals(idRegionSeleccionado)) {
					regionTemp=regionAux;
					break;
				}
			}


			sDescripcion=RegionConstantesFunciones.getRegionDescripcion(regionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualRegionForeignKeyGenerico(Long idRegionSeleccionado,JComboBox jComboBoxid_regionProvinciaGenerico)throws Exception
	{
		try
		{
			Region  regionTemp=null;

			for(Region regionAux:regionsForeignKey) {
				if(regionAux.getId()!=null && regionAux.getId().equals(idRegionSeleccionado)) {
					regionTemp=regionAux;
					break;
				}
			}

			if(regionTemp!=null) {
				jComboBoxid_regionProvinciaGenerico.setSelectedItem(regionTemp);
			} else {
				if(jComboBoxid_regionProvinciaGenerico!=null && jComboBoxid_regionProvinciaGenerico.getItemCount()>0) {
					jComboBoxid_regionProvinciaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(Provincia provincia,JComboBox jComboBoxid_paisProvinciaGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisProvinciaGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormProvincia.jComboBoxid_paisProvincia.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisProvinciaGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				provincia.setid_pais(paisAux.getId());
				provincia.setpais_descripcion(ProvinciaConstantesFunciones.getPaisDescripcion(paisAux));
				provincia.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarRegionForeignKey(Provincia provincia,JComboBox jComboBoxid_regionProvinciaGenerico)throws Exception
	{
		try
		{
			Region  regionAux=new Region();

			if(jComboBoxid_regionProvinciaGenerico==null) {
				regionAux=(Region)this.jInternalFrameDetalleFormProvincia.jComboBoxid_regionProvincia.getSelectedItem();
			} else {
				regionAux=(Region)jComboBoxid_regionProvinciaGenerico.getSelectedItem();
			}

			if(regionAux!=null && regionAux.getId()!=null) {
				provincia.setid_region(regionAux.getId());
				provincia.setregion_descripcion(ProvinciaConstantesFunciones.getRegionDescripcion(regionAux));
				provincia.setRegion(regionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePaissForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPais=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProvinciaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProvincia!=null) { 
							this.jInternalFrameDetalleFormProvincia.jComboBoxid_paisProvincia.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormProvincia.jComboBoxid_paisProvincia.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProvincia!=null) { 
					}

					if(!ProvinciaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdPaisPorNombre") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProvinciaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia.addItem(pais);
							}
						}

						if(!ProvinciaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProvinciaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisProvincia.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisProvincia.addItem(pais);
							}
						}

						if(!ProvinciaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameRegionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingRegion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProvinciaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProvincia!=null) { 
							this.jInternalFrameDetalleFormProvincia.jComboBoxid_regionProvincia.removeAllItems();

							for(Region region:this.regionsForeignKey) {
								this.jInternalFrameDetalleFormProvincia.jComboBoxid_regionProvincia.addItem(region);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProvincia!=null) { 
					}

					if(!ProvinciaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFramePaisForeignKey(Pais pais,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProvincia!=null) {
							this.jInternalFrameDetalleFormProvincia.jComboBoxid_paisProvincia.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormProvincia!=null) {
							this.jInternalFrameDetalleFormProvincia.jComboBoxid_paisProvincia.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisProvincia.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisProvincia.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameRegionForeignKey(Region region,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProvincia!=null) {
							this.jInternalFrameDetalleFormProvincia.jComboBoxid_regionProvincia.setSelectedItem(region);
						}
					} else {
						if(this.jInternalFrameDetalleFormProvincia!=null) {
							this.jInternalFrameDetalleFormProvincia.jComboBoxid_regionProvincia.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesProvincia() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ProvinciaConstantesFunciones.refrescarForeignKeysDescripcionesProvincia(this.provinciaLogic.getProvincias());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ProvinciaConstantesFunciones.refrescarForeignKeysDescripcionesProvincia(this.provincias);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Pais.class));
		classes.add(new Classe(Region.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//provinciaLogic.setProvincias(this.provincias);
			provinciaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ProvinciaParameterReturnGeneral getProvinciaParameterGeneral() {
		return this.provinciaParameterGeneral;
	}
	
	public void setProvinciaParameterGeneral(ProvinciaParameterReturnGeneral provinciaParameterGeneral) {
		this.provinciaParameterGeneral = provinciaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProvincia() {
		return isPermisoTodoProvincia;
	}

	public void setIsPermisoTodoProvincia(Boolean isPermisoTodoProvincia) {
		this.isPermisoTodoProvincia = isPermisoTodoProvincia;
	}

	public Boolean getIsPermisoNuevoProvincia() {
		return isPermisoNuevoProvincia;
	}

	public void setIsPermisoNuevoProvincia(Boolean isPermisoNuevoProvincia) {
		this.isPermisoNuevoProvincia = isPermisoNuevoProvincia;
	}

	public Boolean getIsPermisoActualizarProvincia() {
		return isPermisoActualizarProvincia;
	}

	public void setIsPermisoActualizarProvincia(Boolean isPermisoActualizarProvincia) {
		this.isPermisoActualizarProvincia = isPermisoActualizarProvincia;
	}

	public Boolean getIsPermisoEliminarProvincia() {
		return isPermisoEliminarProvincia;
	}

	public void setIsPermisoEliminarProvincia(Boolean isPermisoEliminarProvincia) {
		this.isPermisoEliminarProvincia = isPermisoEliminarProvincia;
	}

	public Boolean getIsPermisoGuardarCambiosProvincia() {
		return isPermisoGuardarCambiosProvincia;
	}

	public void setIsPermisoGuardarCambiosProvincia(Boolean isPermisoGuardarCambiosProvincia) {
		this.isPermisoGuardarCambiosProvincia = isPermisoGuardarCambiosProvincia;
	}
	
	public Boolean getIsPermisoConsultaProvincia() {
		return isPermisoConsultaProvincia;
	}

	public void setIsPermisoConsultaProvincia(Boolean isPermisoConsultaProvincia) {
		this.isPermisoConsultaProvincia = isPermisoConsultaProvincia;
	}

	public Boolean getIsPermisoBusquedaProvincia() {
		return isPermisoBusquedaProvincia;
	}

	public void setIsPermisoBusquedaProvincia(Boolean isPermisoBusquedaProvincia) {
		this.isPermisoBusquedaProvincia = isPermisoBusquedaProvincia;
	}

	public Boolean getIsPermisoReporteProvincia() {
		return isPermisoReporteProvincia;
	}

	public void setIsPermisoReporteProvincia(Boolean isPermisoReporteProvincia) {
		this.isPermisoReporteProvincia = isPermisoReporteProvincia;
	}
	
	public Boolean getIsPermisoPaginacionMedioProvincia() {
		return isPermisoPaginacionMedioProvincia;
	}

	public void setIsPermisoPaginacionMedioProvincia(Boolean isPermisoPaginacionMedioProvincia) {
		this.isPermisoPaginacionMedioProvincia = isPermisoPaginacionMedioProvincia;
	}
	
	public Boolean getIsPermisoPaginacionTodoProvincia() {
		return isPermisoPaginacionTodoProvincia;
	}

	public void setIsPermisoPaginacionTodoProvincia(Boolean isPermisoPaginacionTodoProvincia) {
		this.isPermisoPaginacionTodoProvincia = isPermisoPaginacionTodoProvincia;
	}
	
	public Boolean getIsPermisoPaginacionAltoProvincia() {
		return isPermisoPaginacionAltoProvincia;
	}

	public void setIsPermisoPaginacionAltoProvincia(Boolean isPermisoPaginacionAltoProvincia) {
		this.isPermisoPaginacionAltoProvincia = isPermisoPaginacionAltoProvincia;
	}
	
	public Boolean getIsPermisoCopiarProvincia() {
		return isPermisoCopiarProvincia;
	}

	public void setIsPermisoCopiarProvincia(Boolean isPermisoCopiarProvincia) {
		this.isPermisoCopiarProvincia = isPermisoCopiarProvincia;
	}
	
	public Boolean getIsPermisoVerFormProvincia() {
		return isPermisoVerFormProvincia;
	}

	public void setIsPermisoVerFormProvincia(Boolean isPermisoVerFormProvincia) {
		this.isPermisoVerFormProvincia = isPermisoVerFormProvincia;
	}
	
	public Boolean getIsPermisoDuplicarProvincia() {
		return isPermisoDuplicarProvincia;
	}

	public void setIsPermisoDuplicarProvincia(Boolean isPermisoDuplicarProvincia) {
		this.isPermisoDuplicarProvincia = isPermisoDuplicarProvincia;
	}
	
	public Boolean getIsPermisoOrdenProvincia() {
		return isPermisoOrdenProvincia;
	}

	public void setIsPermisoOrdenProvincia(Boolean isPermisoOrdenProvincia) {
		this.isPermisoOrdenProvincia = isPermisoOrdenProvincia;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProvincia() {
		return isVisibilidadCeldaNuevoProvincia;
	}

	public void setIsVisibilidadCeldaNuevoProvincia(Boolean isVisibilidadCeldaNuevoProvincia) {
		this.isVisibilidadCeldaNuevoProvincia = isVisibilidadCeldaNuevoProvincia;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProvincia() {
		return isVisibilidadCeldaDuplicarProvincia;
	}

	public void setIsVisibilidadCeldaDuplicarProvincia(Boolean isVisibilidadCeldaDuplicarProvincia) {
		this.isVisibilidadCeldaDuplicarProvincia = isVisibilidadCeldaDuplicarProvincia;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProvincia() {
		return isVisibilidadCeldaCopiarProvincia;
	}

	public void setIsVisibilidadCeldaCopiarProvincia(Boolean isVisibilidadCeldaCopiarProvincia) {
		this.isVisibilidadCeldaCopiarProvincia = isVisibilidadCeldaCopiarProvincia;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProvincia() {
		return isVisibilidadCeldaVerFormProvincia;
	}

	public void setIsVisibilidadCeldaVerFormProvincia(Boolean isVisibilidadCeldaVerFormProvincia) {
		this.isVisibilidadCeldaVerFormProvincia = isVisibilidadCeldaVerFormProvincia;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProvincia() {
		return isVisibilidadCeldaOrdenProvincia;
	}

	public void setIsVisibilidadCeldaOrdenProvincia(Boolean isVisibilidadCeldaOrdenProvincia) {
		this.isVisibilidadCeldaOrdenProvincia = isVisibilidadCeldaOrdenProvincia;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProvincia() {
		return isVisibilidadCeldaNuevoRelacionesProvincia;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProvincia(Boolean isVisibilidadCeldaNuevoRelacionesProvincia) {
		this.isVisibilidadCeldaNuevoRelacionesProvincia = isVisibilidadCeldaNuevoRelacionesProvincia;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProvincia() {
		return isVisibilidadCeldaModificarProvincia;
	}

	public void setIsVisibilidadCeldaModificarProvincia(Boolean isVisibilidadCeldaModificarProvincia) {
		this.isVisibilidadCeldaModificarProvincia = isVisibilidadCeldaModificarProvincia;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProvincia() {
		return isVisibilidadCeldaActualizarProvincia;
	}

	public void setIsVisibilidadCeldaActualizarProvincia(Boolean isVisibilidadCeldaActualizarProvincia) {
		this.isVisibilidadCeldaActualizarProvincia = isVisibilidadCeldaActualizarProvincia;
	}

	public Boolean getIsVisibilidadCeldaEliminarProvincia() {
		return isVisibilidadCeldaEliminarProvincia;
	}

	public void setIsVisibilidadCeldaEliminarProvincia(Boolean isVisibilidadCeldaEliminarProvincia) {
		this.isVisibilidadCeldaEliminarProvincia = isVisibilidadCeldaEliminarProvincia;
	}

	public Boolean getIsVisibilidadCeldaCancelarProvincia() {
		return isVisibilidadCeldaCancelarProvincia;
	}

	public void setIsVisibilidadCeldaCancelarProvincia(Boolean isVisibilidadCeldaCancelarProvincia) {
		this.isVisibilidadCeldaCancelarProvincia = isVisibilidadCeldaCancelarProvincia;
	}

	public Boolean getIsVisibilidadCeldaGuardarProvincia() {
		return isVisibilidadCeldaGuardarProvincia;
	}

	public void setIsVisibilidadCeldaGuardarProvincia(Boolean isVisibilidadCeldaGuardarProvincia) {
		this.isVisibilidadCeldaGuardarProvincia = isVisibilidadCeldaGuardarProvincia;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProvincia() {
		return isVisibilidadCeldaGuardarCambiosProvincia;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProvincia(Boolean isVisibilidadCeldaGuardarCambiosProvincia) {
		this.isVisibilidadCeldaGuardarCambiosProvincia = isVisibilidadCeldaGuardarCambiosProvincia;
	}
		
	public ProvinciaSessionBean getprovinciaSessionBean() {
		return this.provinciaSessionBean;
	}
	
	public void setprovinciaSessionBean(ProvinciaSessionBean provinciaSessionBean) {
		this.provinciaSessionBean=provinciaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorIdPaisPorNombre() {
		return this.isVisibilidadBusquedaPorIdPaisPorNombre;
	}

	public void setisVisibilidadBusquedaPorIdPaisPorNombre(Boolean isVisibilidadBusquedaPorIdPaisPorNombre) {
		this.isVisibilidadBusquedaPorIdPaisPorNombre=isVisibilidadBusquedaPorIdPaisPorNombre;
	}

	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	public Boolean getisVisibilidadFK_IdRegion() {
		return this.isVisibilidadFK_IdRegion;
	}

	public void setisVisibilidadFK_IdRegion(Boolean isVisibilidadFK_IdRegion) {
		this.isVisibilidadFK_IdRegion=isVisibilidadFK_IdRegion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProvincia(Provincia provincia)throws Exception {
		try {
			
				this.setActualParaGuardarPaisForeignKey(provincia,null);
				this.setActualParaGuardarRegionForeignKey(provincia,null);
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
	
	public void bugActualizarReferenciaActual(Provincia provincia,Provincia provinciaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProvincia(provincia);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		provinciaAux.setId(provincia.getId());
		provinciaAux.setVersionRow(provincia.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessProvincia();
		
			int intSelectedRow = this.jTableDatosProvincia.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provincia =(Provincia) this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.provincia =(Provincia) this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ProvinciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualProvincia(this.provincia,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysProvincia(this.provincia);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = provinciaValidator.getInvalidValues(this.provincia);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			provinciaLogic.setDatosCliente(datosCliente);
			provinciaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				provinciaAux=new  Provincia();
				
				provinciaAux.setIsNew(true);
				provinciaAux.setIsChanged(true);
				
				provinciaAux.setProvinciaOriginal(this.provincia);
				
				provinciaAux.setId(this.provincia.getId());	
				provinciaAux.setVersionRow(this.provincia.getVersionRow());	
				provinciaAux.setid_pais(this.provincia.getid_pais());	
				provinciaAux.setid_region(this.provincia.getid_region());	
				provinciaAux.setcodigo(this.provincia.getcodigo());	
				provinciaAux.setnombre(this.provincia.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.provinciaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.provinciaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(provinciaAux,provinciaLogic.getProvincias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(provinciaAux,provincias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.provinciaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.provinciaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						provinciaLogic.saveProvincias();//WithConnection
						//provinciaLogic.getSetVersionRowProvincias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.provincia,provinciaAux);
					
					this.refrescarForeignKeysDescripcionesProvincia();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.provinciaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barrioLogic.getBarrios().addAll(this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barriosEliminados);
							this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantonLogic.getCantons().addAll(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantonsEliminados);
							this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados().addAll(this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
							this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados().addAll(this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleadosEliminados);
							this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos().addAll(this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
							this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudadLogic.getCiudads().addAll(this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudadsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barrios.addAll(this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barriosEliminados);
							this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantons.addAll(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantonsEliminados);
							this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados.addAll(this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
							this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleados.addAll(this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleadosEliminados);
							this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos.addAll(this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
							this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudads.addAll(this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudadsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.provinciaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								provinciaLogic.saveProvinciaRelaciones(provinciaAux,this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudadLogic.getCiudads(),this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantonLogic.getCantons(),this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barrioLogic.getBarrios(),this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados(),this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados(),this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());//WithConnection
								//provinciaLogic.getSetVersionRowProvincias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.provincia,provinciaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barrioLogic.setBarrios(new ArrayList<Barrio>());
							this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantonLogic.setCantons(new ArrayList<Canton>());
							this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(new ArrayList<DatoGeneralEmpleado>());
							this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(new ArrayList<Empleado>());
							this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(new ArrayList<ParametroCarteraDefecto>());
							this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudadLogic.setCiudads(new ArrayList<Ciudad>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barrios= new ArrayList<Barrio>();
							this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantons= new ArrayList<Canton>();
							this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados= new ArrayList<DatoGeneralEmpleado>();
							this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleados= new ArrayList<Empleado>();
							this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos= new ArrayList<ParametroCarteraDefecto>();
							this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudads= new ArrayList<Ciudad>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.quitarFilaTotales();}
							provinciaAux.setCiudads(this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudadLogic.getCiudads());

							if(this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							provinciaAux.setClientes(this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.quitarFilaTotales();}
							provinciaAux.setCantons(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantonLogic.getCantons());

							if(this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.quitarFilaTotales();}
							provinciaAux.setBarrios(this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barrioLogic.getBarrios());

							if(this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							provinciaAux.setEmpleados(this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());

							if(this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							provinciaAux.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());

							if(this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							provinciaAux.setParametroCarteraDefectos(this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.provinciaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.provinciaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(provinciaAux,provinciaLogic.getProvincias());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(provinciaAux,provincias);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.provincia,provinciaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				provinciaAux=new  Provincia();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.provinciaSessionBean.getEsGuardarRelacionado() 
					|| (this.provinciaSessionBean.getEsGuardarRelacionado() && this.provincia.getId()>=0)) {
						
					provinciaAux.setIsNew(false);
				}
				
				provinciaAux.setIsDeleted(false);
			
				provinciaAux.setId(this.provincia.getId());	
				provinciaAux.setVersionRow(this.provincia.getVersionRow());	
				provinciaAux.setid_pais(this.provincia.getid_pais());	
				provinciaAux.setid_region(this.provincia.getid_region());	
				provinciaAux.setcodigo(this.provincia.getcodigo());	
				provinciaAux.setnombre(this.provincia.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(provinciaAux,provinciaLogic.getProvincias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(provinciaAux,provincias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.provinciaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.provinciaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						provinciaLogic.saveProvincias();//WithConnection
						//provinciaLogic.getSetVersionRowProvincias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.provincia,provinciaAux);
					
					this.refrescarForeignKeysDescripcionesProvincia();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.provinciaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barrioLogic.getBarrios().addAll(this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barriosEliminados);
							this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantonLogic.getCantons().addAll(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantonsEliminados);
							this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados().addAll(this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
							this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados().addAll(this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleadosEliminados);
							this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos().addAll(this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
							this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudadLogic.getCiudads().addAll(this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudadsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barrios.addAll(this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barriosEliminados);
							this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantons.addAll(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantonsEliminados);
							this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados.addAll(this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
							this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleados.addAll(this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleadosEliminados);
							this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos.addAll(this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
							this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudads.addAll(this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudadsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.provinciaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								provinciaLogic.saveProvinciaRelaciones(provinciaAux,this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudadLogic.getCiudads(),this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantonLogic.getCantons(),this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barrioLogic.getBarrios(),this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados(),this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados(),this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());//WithConnection
								//provinciaLogic.getSetVersionRowProvincias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.provincia,provinciaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barrioLogic.setBarrios(new ArrayList<Barrio>());
							this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantonLogic.setCantons(new ArrayList<Canton>());
							this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(new ArrayList<DatoGeneralEmpleado>());
							this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(new ArrayList<Empleado>());
							this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(new ArrayList<ParametroCarteraDefecto>());
							this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudadLogic.setCiudads(new ArrayList<Ciudad>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barrios= new ArrayList<Barrio>();
							this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantons= new ArrayList<Canton>();
							this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados= new ArrayList<DatoGeneralEmpleado>();
							this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleados= new ArrayList<Empleado>();
							this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos= new ArrayList<ParametroCarteraDefecto>();
							this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudads= new ArrayList<Ciudad>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.quitarFilaTotales();}
							provinciaAux.setCiudads(this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudadLogic.getCiudads());

							if(this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							provinciaAux.setClientes(this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.quitarFilaTotales();}
							provinciaAux.setCantons(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantonLogic.getCantons());

							if(this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.quitarFilaTotales();}
							provinciaAux.setBarrios(this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barrioLogic.getBarrios());

							if(this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							provinciaAux.setEmpleados(this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());

							if(this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							provinciaAux.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());

							if(this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							provinciaAux.setParametroCarteraDefectos(this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.provinciaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.provinciaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(provinciaAux,provinciaLogic.getProvincias());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(provinciaAux,provincias);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.provincia,provinciaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				provinciaAux=new  Provincia();
				
				provinciaAux.setIsNew(false);
				provinciaAux.setIsChanged(false);
				
				provinciaAux.setIsDeleted(true);
				
				provinciaAux.setId(this.provincia.getId());	
				provinciaAux.setVersionRow(this.provincia.getVersionRow());	
				provinciaAux.setid_pais(this.provincia.getid_pais());	
				provinciaAux.setid_region(this.provincia.getid_region());	
				provinciaAux.setcodigo(this.provincia.getcodigo());	
				provinciaAux.setnombre(this.provincia.getnombre());	
				
				if(this.provinciaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.provinciaAux.getId()>=0) {	
						this.provinciasEliminados.add(provinciaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(provinciaAux,provinciaLogic.getProvincias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(provinciaAux,provincias);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.provinciaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.provinciaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						provinciaLogic.saveProvincias();//WithConnection
						//provinciaLogic.getSetVersionRowProvincias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.provinciaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barrioLogic.getBarrios().addAll(this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barriosEliminados);
							this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantonLogic.getCantons().addAll(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantonsEliminados);
							this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados().addAll(this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
							this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados().addAll(this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleadosEliminados);
							this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos().addAll(this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
							this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudadLogic.getCiudads().addAll(this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudadsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barrios.addAll(this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barriosEliminados);
							this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantons.addAll(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantonsEliminados);
							this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados.addAll(this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
							this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleados.addAll(this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleadosEliminados);
							this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos.addAll(this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
							this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudads.addAll(this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudadsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.provinciaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.barrioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jInternalFrameDetalleFormCanton.parroquiaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								provinciaLogic.saveProvinciaRelaciones(provinciaAux,this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudadLogic.getCiudads(),this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantonLogic.getCantons(),this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barrioLogic.getBarrios(),this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados(),this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados(),this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());//WithConnection
								//provinciaLogic.getSetVersionRowProvincias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barrioLogic.setBarrios(new ArrayList<Barrio>());
							this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantonLogic.setCantons(new ArrayList<Canton>());
							this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(new ArrayList<DatoGeneralEmpleado>());
							this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(new ArrayList<Empleado>());
							this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(new ArrayList<ParametroCarteraDefecto>());
							this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudadLogic.setCiudads(new ArrayList<Ciudad>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barrios= new ArrayList<Barrio>();
							this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantons= new ArrayList<Canton>();
							this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados= new ArrayList<DatoGeneralEmpleado>();
							this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleados= new ArrayList<Empleado>();
							this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos= new ArrayList<ParametroCarteraDefecto>();
							this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudads= new ArrayList<Ciudad>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.quitarFilaTotales();}
							provinciaAux.setCiudads(this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudadLogic.getCiudads());

							if(this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							provinciaAux.setClientes(this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.quitarFilaTotales();}
							provinciaAux.setCantons(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantonLogic.getCantons());

							if(this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.quitarFilaTotales();}
							provinciaAux.setBarrios(this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barrioLogic.getBarrios());

							if(this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							provinciaAux.setEmpleados(this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());

							if(this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							provinciaAux.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());

							if(this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							provinciaAux.setParametroCarteraDefectos(this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.provinciaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.provinciaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(provinciaAux,provinciaLogic.getProvincias());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(provinciaAux,provincias);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.getProvincias().addAll(this.provinciasEliminados);
					
					provinciaLogic.saveProvincias();//WithConnection
					//provinciaLogic.getSetVersionRowProvincias();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesProvincia();
				
				this.provinciasEliminados= new ArrayList<Provincia>();		
			}
			
			if(this.provinciaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.provinciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Provincia GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Provincia",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.provincia=provinciaAux;
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
      		//this.finishProcessProvincia();
      	}
		
	}	
	
	public void actualizarRelaciones(Provincia provinciaLocal) throws Exception {
		
		if(this.provinciaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				provinciaLocal.setCiudads(this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudadLogic.getCiudads());
				provinciaLocal.setClientes(this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
				provinciaLocal.setCantons(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantonLogic.getCantons());
				provinciaLocal.setBarrios(this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barrioLogic.getBarrios());
				provinciaLocal.setEmpleados(this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());
				provinciaLocal.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());
				provinciaLocal.setParametroCarteraDefectos(this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
			
			} else {
			
				provinciaLocal.setCiudads(this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudads);
				provinciaLocal.setClientes(this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clientes);
				provinciaLocal.setCantons(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantons);
				provinciaLocal.setBarrios(this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barrios);
				provinciaLocal.setEmpleados(this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleados);
				provinciaLocal.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados);
				provinciaLocal.setParametroCarteraDefectos(this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Provincia provinciaLocal) throws Exception {	
		if(this.provinciaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				provinciaLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(RegionDetalleFormJInternalFrame.class)) {
				RegionBeanSwingJInternalFrame regionBeanSwingJInternalFrameLocal=(RegionBeanSwingJInternalFrame) ((RegionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				regionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoRegion(regionBeanSwingJInternalFrameLocal.getregion(),true);
				regionBeanSwingJInternalFrameLocal.actualizarLista(regionBeanSwingJInternalFrameLocal.region,this.regionsForeignKey);

				regionBeanSwingJInternalFrameLocal.actualizarRelaciones(regionBeanSwingJInternalFrameLocal.region);

				provinciaLocal.setRegion(regionBeanSwingJInternalFrameLocal.region);

				this.addItemDefectoCombosForeignKeyRegion();
				this.cargarCombosFrameRegionsForeignKey("Formulario");
				this.setActualRegionForeignKey(regionBeanSwingJInternalFrameLocal.region.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProvinciaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProvincia.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.provincia =(Provincia) this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.provincia =(Provincia) this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = provinciaValidator.getInvalidValues(this.provincia);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Provincia provincia,List<Provincia> provincias) throws Exception {
		try	{		
			ProvinciaConstantesFunciones.actualizarLista(provincia,provincias,this.provinciaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Provincia provincia,List<Provincia> provincias) throws Exception {
		try	{			
			ProvinciaConstantesFunciones.actualizarSelectedLista(provincia,provincias);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Provincia> provinciasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				provinciasLocal=this.provinciaLogic.getProvincias();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				provinciasLocal=this.provincias;
			}
			//ARCHITECTURE
		
			for(Provincia provinciaLocal:provinciasLocal) {
				if(this.permiteMantenimiento(provinciaLocal) && provinciaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProvinciaConstantesFunciones.getProvinciaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProvinciaConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProvincia.jLabelid_paisProvincia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProvinciaConstantesFunciones.IDREGION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProvincia.jLabelid_regionProvincia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProvinciaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProvincia.jLabelcodigoProvincia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProvinciaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProvincia.jLabelnombreProvincia,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProvincia!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProvincia.jLabelid_paisProvincia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProvincia.jLabelid_regionProvincia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProvincia.jLabelcodigoProvincia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProvincia.jLabelnombreProvincia,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Ciudad")) {
			if(this.provincia==null) {
				this.provincia= new Provincia();
			}

			if(this.provinciaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoProvincia
				this.setVariablesFormularioToObjetoActualProvincia(this.provincia,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysProvincia(this.provincia);

				this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.getciudad().setProvincia(this.provincia);
			}

			return;
		}
		 else  if(sTipo.equals("Cliente")) {
			if(this.provincia==null) {
				this.provincia= new Provincia();
			}

			if(this.provinciaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoProvincia
				this.setVariablesFormularioToObjetoActualProvincia(this.provincia,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysProvincia(this.provincia);

				this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.getcliente().setProvincia(this.provincia);
			}

			return;
		}
		 else  if(sTipo.equals("Canton")) {
			if(this.provincia==null) {
				this.provincia= new Provincia();
			}

			if(this.provinciaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoProvincia
				this.setVariablesFormularioToObjetoActualProvincia(this.provincia,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysProvincia(this.provincia);

				this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.getcanton().setProvincia(this.provincia);
			}

			return;
		}
		 else  if(sTipo.equals("Barrio")) {
			if(this.provincia==null) {
				this.provincia= new Provincia();
			}

			if(this.provinciaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoProvincia
				this.setVariablesFormularioToObjetoActualProvincia(this.provincia,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysProvincia(this.provincia);

				this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.getbarrio().setProvincia(this.provincia);
			}

			return;
		}
		 else  if(sTipo.equals("Empleado")) {
			if(this.provincia==null) {
				this.provincia= new Provincia();
			}

			if(this.provinciaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoProvincia
				this.setVariablesFormularioToObjetoActualProvincia(this.provincia,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysProvincia(this.provincia);

				this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.getempleado().setProvincia(this.provincia);
			}

			return;
		}
		 else  if(sTipo.equals("DatoGeneralEmpleado")) {
			if(this.provincia==null) {
				this.provincia= new Provincia();
			}

			if(this.provinciaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoProvincia
				this.setVariablesFormularioToObjetoActualProvincia(this.provincia,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysProvincia(this.provincia);

				this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.getdatogeneralempleado().setProvincia(this.provincia);
			}

			return;
		}
		 else  if(sTipo.equals("ParametroCarteraDefecto")) {
			if(this.provincia==null) {
				this.provincia= new Provincia();
			}

			if(this.provinciaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoProvincia
				this.setVariablesFormularioToObjetoActualProvincia(this.provincia,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysProvincia(this.provincia);

				this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.getparametrocarteradefecto().setProvincia(this.provincia);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoProvincia--;	
		
		
		this.provinciaAux=new Provincia();
		
		this.provinciaAux.setId(this.iIdNuevoProvincia);
		this.provinciaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.provinciaLogic.getProvincias().add(this.provinciaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.provincias.add(this.provinciaAux);
		}
		//ARCHITECTURE
		
		this.provincia=this.provinciaAux;
		
		if(ProvinciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProvincia(this.provincia);
			this.setVariablesObjetoActualToFormularioForeignKeyProvincia(this.provincia);
		}
				
		//this.setDefaultControlesProvincia();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProvincia();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProvincia();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProvincia();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProvincia(this.provinciaBean,this.provincia,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProvincia(this.provincia);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ProvinciaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.provinciaSessionBean.getConGuardarRelaciones()) {
			classes=ProvinciaConstantesFunciones.getClassesRelationshipsOfProvincia(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.provinciaReturnGeneral=provinciaLogic.procesarEventosProvinciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.provinciaLogic.getProvincias(),this.provincia,this.provinciaParameterGeneral,this.isEsNuevoProvincia,classes);//this.provinciaLogic.getProvincia()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProvincia(this.provinciaReturnGeneral,this.provinciaBean,false);
		
		if(this.provinciaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProvincia(this.provinciaReturnGeneral.getProvincia());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProvincia(this.provinciaReturnGeneral.getProvincia());
		}
		
		if(this.provinciaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProvincia(this.provinciaReturnGeneral.getProvincia(),classes);//this.provinciaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProvincia(this.provincia,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProvincia();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProvincia();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProvinciaBeanSwingJInternalFrameAdditional.RecargarFormProvincia(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProvincia(false);
						
			if(provinciaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barrioSessionBean.getEsGuardarRelacionado() && BarrioJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonBarrioActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantonSessionBean.getEsGuardarRelacionado() && CantonJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCantonActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getEsGuardarRelacionado() && DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDatoGeneralEmpleadoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleadoSessionBean.getEsGuardarRelacionado() && EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() && ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroCarteraDefectoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudadSessionBean.getEsGuardarRelacionado() && CiudadJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCiudadActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(ProvinciaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProvincia();
			}
			
			this.actualizarVisualTableDatosProvincia();
			
			this.jTableDatosProvincia.setRowSelectionInterval(this.getIndiceNuevoProvincia(), this.getIndiceNuevoProvincia());
			
			this.seleccionarFilaTablaProvinciaActual();
						
			this.actualizarEstadoCeldasBotonesProvincia("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProvincia(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProvincia.jTextFieldcodigoProvincia.setEnabled(isHabilitar && this.provinciaConstantesFunciones.activarcodigoProvincia);
		this.jInternalFrameDetalleFormProvincia.jTextAreanombreProvincia.setEnabled(isHabilitar && this.provinciaConstantesFunciones.activarnombreProvincia);	
		
		this.jInternalFrameDetalleFormProvincia.jComboBoxid_paisProvincia.setEnabled(isHabilitar && this.provinciaConstantesFunciones.activarid_paisProvincia);
		this.jInternalFrameDetalleFormProvincia.jComboBoxid_regionProvincia.setEnabled(isHabilitar && this.provinciaConstantesFunciones.activarid_regionProvincia);
	};
	
	public void setDefaultControlesProvincia() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProvincia(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.provinciaSessionBean.setConGuardarRelaciones(true);			
			this.provinciaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProvincia.jTabbedPaneRelacionesProvincia.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barrioSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantonSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleadoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudadSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.provinciaSessionBean.setConGuardarRelaciones(false);			
			this.provinciaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProvincia.jTabbedPaneRelacionesProvincia.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barrioSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantonSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleadoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudadSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoProvincia() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Provincia provinciaAux:this.provinciaLogic.getProvincias()) {
				if(provinciaAux.getId().equals(this.iIdNuevoProvincia)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Provincia provinciaAux:this.provincias) {
				if(provinciaAux.getId().equals(this.iIdNuevoProvincia)) {
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
	
	public int getIndiceActualProvincia(Provincia provincia,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Provincia provinciaAux:this.provinciaLogic.getProvincias()) {
				if(provinciaAux.getId().equals(provincia.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Provincia provinciaAux:this.provincias) {
				if(provinciaAux.getId().equals(provincia.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProvincia(Provincia provinciaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Provincia provinciaAux:this.provinciaLogic.getProvincias()) {
				if(provinciaAux.getProvinciaOriginal().getId().equals(provinciaOriginal.getId())) {
					existe=true;
					provinciaOriginal.setId(provinciaAux.getId());
					provinciaOriginal.setVersionRow(provinciaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Provincia provinciaAux:this.provincias) {
				if(provinciaAux.getProvinciaOriginal().getId().equals(provinciaOriginal.getId())) {
					existe=true;
					provinciaOriginal.setId(provinciaAux.getId());
					provinciaOriginal.setVersionRow(provinciaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProvincia(Boolean esParaCancelar) throws Exception {
		provinciasAux=new ArrayList<Provincia>();
		provinciaAux=new Provincia();
		
		if(!this.provinciaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Provincia provinciaAux:this.provinciaLogic.getProvincias()) {
					if(provinciaAux.getId()<0) {
						provinciasAux.add(provinciaAux);
					}		
				}
				this.iIdNuevoProvincia=0L;
				this.provinciaLogic.getProvincias().removeAll(provinciasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Provincia provinciaAux:this.provincias) {
					if(provinciaAux.getId()<0) {
						provinciasAux.add(provinciaAux);
					}		
				}
				this.iIdNuevoProvincia=0L;
				this.provincias.removeAll(provinciasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProvincia 
					&& this.provinciaLogic.getProvincias().size()>0
					) {
					provinciaAux=this.provinciaLogic.getProvincias().get(this.provinciaLogic.getProvincias().size() - 1);
				
					if(provinciaAux.getId()<0) {
						this.provinciaLogic.getProvincias().remove(provinciaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProvincia && this.provincias.size()>0) {
					provinciaAux=this.provincias.get(this.provincias.size() - 1);
				
					if(provinciaAux.getId()<0) {
						this.provincias.remove(provinciaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProvincia(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(provincia.getId()<0) {
				this.provinciaLogic.getProvincias().remove(this.provincia);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(provincia.getId()<0) {
				this.provincias.remove(this.provincia);
			}
		}			
	}
	
	public void setEstadosInicialesProvincia(List<Provincia> provinciasAux) throws Exception {
		ProvinciaConstantesFunciones.setEstadosInicialesProvincia(provinciasAux);
	}
	
	public void setEstadosInicialesProvincia(Provincia provinciaAux) throws Exception {
		ProvinciaConstantesFunciones.setEstadosInicialesProvincia(provinciaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProvinciaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProvincia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProvinciaActual()) {
				if(!this.isEsNuevoProvincia) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProvincia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProvincia=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProvinciaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Provincia ?", "MANTENIMIENTO DE Provincia", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProvincia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Provincia provincia) throws Exception {
		ProvinciaConstantesFunciones.seleccionarAsignar(this.provincia,provincia);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProvincia=this.isPermisoActualizarOriginalProvincia;
			
			
			this.seleccionarAsignar(provincia);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProvinciaConstantesFunciones.quitarEspaciosProvincia(this.provincia,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesProvincia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.provinciaSessionBean.setsFuncionBusquedaRapida(this.provinciaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProvincia) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProvincia(esParaCancelar);				
				this.cancelarNuevoProvincia(esParaCancelar);								
			}
			
			this.provincia=new Provincia();
			
			this.inicializarProvincia();
			
			this.actualizarEstadoCeldasBotonesProvincia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProvincia() throws Exception {
		try {
			ProvinciaConstantesFunciones.inicializarProvincia(this.provincia);
			
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
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.provinciaLogic.getProvincias().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProvincias(String sAccionBusqueda,List<Provincia> provinciasParaReportes) throws Exception {
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
					sPathReporteFinal="Provincia"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProvinciaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProvinciaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Provincia"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Provinciaes");		
		parameters.put("busquedapor", ProvinciaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Barrio.class));
			classes.add(new Classe(Canton.class));
			classes.add(new Classe(DatoGeneralEmpleado.class));
			classes.add(new Classe(Empleado.class));
			classes.add(new Classe(Cliente.class));
			classes.add(new Classe(ParametroCarteraDefecto.class));
			classes.add(new Classe(Ciudad.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					ProvinciaLogic provinciaLogicAuxiliar=new ProvinciaLogic();
					provinciaLogicAuxiliar.setDatosCliente(provinciaLogic.getDatosCliente());				
					provinciaLogicAuxiliar.setProvincias(provinciasParaReportes);
					
					provinciaLogicAuxiliar.cargarRelacionesLoteForeignKeyProvinciaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					provinciasParaReportes=provinciaLogicAuxiliar.getProvincias();
					
					//provinciaLogic.getNewConnexionToDeep();
					
					//for (Provincia provincia:provinciasParaReportes) {
					//	provinciaLogic.deepLoad(provincia, false, DeepLoadType.INCLUDE, classes);
					//}						
					//provinciaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//provinciaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileBarrio = AuxiliarReportes.class.getResourceAsStream("BarrioDetalleRelacionesDesign.jasper");
			parameters.put("subreport_barrio", reportFileBarrio);

			InputStream reportFileCanton = AuxiliarReportes.class.getResourceAsStream("CantonDetalleRelacionesDesign.jasper");
			parameters.put("subreport_canton", reportFileCanton);

			InputStream reportFileDatoGeneralEmpleado = AuxiliarReportes.class.getResourceAsStream("DatoGeneralEmpleadoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_datogeneralempleado", reportFileDatoGeneralEmpleado);

			InputStream reportFileEmpleado = AuxiliarReportes.class.getResourceAsStream("EmpleadoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_empleado", reportFileEmpleado);

			InputStream reportFileCliente = AuxiliarReportes.class.getResourceAsStream("ClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cliente", reportFileCliente);

			InputStream reportFileParametroCarteraDefecto = AuxiliarReportes.class.getResourceAsStream("ParametroCarteraDefectoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_parametrocarteradefecto", reportFileParametroCarteraDefecto);

			InputStream reportFileCiudad = AuxiliarReportes.class.getResourceAsStream("CiudadDetalleRelacionesDesign.jasper");
			parameters.put("subreport_ciudad", reportFileCiudad);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProvincia=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProvinciaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProvinciaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProvincia=new JRBeanArrayDataSource(ProvinciaJInternalFrame.TraerProvinciaBeans(provinciasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProvincia);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProvinciaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProvinciaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProvinciaBean.TraerProvinciaBeans(provinciasParaReportes).toArray()));
							
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
				this.generarExcelReporteProvincias(sAccionBusqueda,sTipoArchivoReporte,provinciasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProvincias(sAccionBusqueda,sTipoArchivoReporte,provinciasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProvinciaActionPerformed(null);
					//this.generarExcelReporteProvincias(sAccionBusqueda,sTipoArchivoReporte,provinciasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProvincias(sAccionBusqueda,sTipoArchivoReporte,provinciasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProvincias(sAccionBusqueda,sTipoArchivoReporte,provinciasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProvincias(sAccionBusqueda,sTipoArchivoReporte,provinciasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProvincias(String sAccionBusqueda,String sTipoArchivoReporte,List<Provincia> provinciasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"provincia";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Provincias");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProvincia("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Provincia provincia : provinciasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProvinciaConstantesFunciones.generarExcelReporteDataProvincia("NORMAL",row,workbook,provincia,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.provinciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Provincia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProvincia(String sTipo,Row row,Workbook workbook) {
		
		ProvinciaConstantesFunciones.generarExcelReporteHeaderProvincia(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProvincias(String sAccionBusqueda,String sTipoArchivoReporte,List<Provincia> provinciasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"provincia_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Provincias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Provincia provincia : provinciasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProvinciaConstantesFunciones.getProvinciaDescripcion(provincia));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProvinciaConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProvinciaConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(provincia.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProvinciaConstantesFunciones.LABEL_IDREGION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProvinciaConstantesFunciones.LABEL_IDREGION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(provincia.getregion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProvinciaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProvinciaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(provincia.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProvinciaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProvinciaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(provincia.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.provinciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Provincia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProvincias(String sAccionBusqueda,String sTipoArchivoReporte,List<Provincia> provinciasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Provincia> provinciasRespaldo=null;
		
		classes=ProvinciaConstantesFunciones.getClassesRelationshipsOfProvincia(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.provinciaLogic.setDatosCliente(this.datosCliente);
		this.provinciaLogic.setDatosDeep(this.datosDeep);
		this.provinciaLogic.setIsConDeep(true);
		
		provinciasRespaldo=this.provinciaLogic.getProvincias();
		
		this.provinciaLogic.setProvincias(provinciasParaReportes);	
		this.provinciaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		provinciasParaReportes=this.provinciaLogic.getProvincias();
		this.provinciaLogic.setProvincias(provinciasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"provincia_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Provincias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProvincia("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Provincia provincia : provinciasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProvincia("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProvinciaConstantesFunciones.generarExcelReporteDataProvincia("NORMAL",row,workbook,provincia,cellStyleDataAux);
		
			
			


				//Ciudad
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CiudadConstantesFunciones.SCLASSWEBTITULO))) {

				if(provincia.getCiudads()!=null && provincia.getCiudads().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CiudadConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CiudadConstantesFunciones.generarExcelReporteHeaderCiudad("RELACIONADO",row,workbook);
				}

				if(provincia.getCiudads()!=null) {
					i2=0;
					for(Ciudad ciudad : provincia.getCiudads()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CiudadConstantesFunciones.generarExcelReporteDataCiudad("RELACIONADO",row,workbook,ciudad,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Cliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(provincia.getClientes()!=null && provincia.getClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ClienteConstantesFunciones.generarExcelReporteHeaderCliente("RELACIONADO",row,workbook);
				}

				if(provincia.getClientes()!=null) {
					i2=0;
					for(Cliente cliente : provincia.getClientes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ClienteConstantesFunciones.generarExcelReporteDataCliente("RELACIONADO",row,workbook,cliente,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Canton
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CantonConstantesFunciones.SCLASSWEBTITULO))) {

				if(provincia.getCantons()!=null && provincia.getCantons().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CantonConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CantonConstantesFunciones.generarExcelReporteHeaderCanton("RELACIONADO",row,workbook);
				}

				if(provincia.getCantons()!=null) {
					i2=0;
					for(Canton canton : provincia.getCantons()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CantonConstantesFunciones.generarExcelReporteDataCanton("RELACIONADO",row,workbook,canton,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Barrio
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(BarrioConstantesFunciones.SCLASSWEBTITULO))) {

				if(provincia.getBarrios()!=null && provincia.getBarrios().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(BarrioConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					BarrioConstantesFunciones.generarExcelReporteHeaderBarrio("RELACIONADO",row,workbook);
				}

				if(provincia.getBarrios()!=null) {
					i2=0;
					for(Barrio barrio : provincia.getBarrios()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						BarrioConstantesFunciones.generarExcelReporteDataBarrio("RELACIONADO",row,workbook,barrio,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Empleado
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(EmpleadoConstantesFunciones.SCLASSWEBTITULO))) {

				if(provincia.getEmpleados()!=null && provincia.getEmpleados().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(EmpleadoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					EmpleadoConstantesFunciones.generarExcelReporteHeaderEmpleado("RELACIONADO",row,workbook);
				}

				if(provincia.getEmpleados()!=null) {
					i2=0;
					for(Empleado empleado : provincia.getEmpleados()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						EmpleadoConstantesFunciones.generarExcelReporteDataEmpleado("RELACIONADO",row,workbook,empleado,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//DatoGeneralEmpleado
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO))) {

				if(provincia.getDatoGeneralEmpleados()!=null && provincia.getDatoGeneralEmpleados().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DatoGeneralEmpleadoConstantesFunciones.generarExcelReporteHeaderDatoGeneralEmpleado("RELACIONADO",row,workbook);
				}

				if(provincia.getDatoGeneralEmpleados()!=null) {
					i2=0;
					for(DatoGeneralEmpleado datogeneralempleado : provincia.getDatoGeneralEmpleados()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DatoGeneralEmpleadoConstantesFunciones.generarExcelReporteDataDatoGeneralEmpleado("RELACIONADO",row,workbook,datogeneralempleado,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ParametroCarteraDefecto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO))) {

				if(provincia.getParametroCarteraDefectos()!=null && provincia.getParametroCarteraDefectos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroCarteraDefectoConstantesFunciones.generarExcelReporteHeaderParametroCarteraDefecto("RELACIONADO",row,workbook);
				}

				if(provincia.getParametroCarteraDefectos()!=null) {
					i2=0;
					for(ParametroCarteraDefecto parametrocarteradefecto : provincia.getParametroCarteraDefectos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ParametroCarteraDefectoConstantesFunciones.generarExcelReporteDataParametroCarteraDefecto("RELACIONADO",row,workbook,parametrocarteradefecto,cellStyleDataAuxHijo);
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
		cell.setCellValue(ProvinciaConstantesFunciones.getProvinciaDescripcion(provincia));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.provinciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Provincia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProvincia.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProvincia.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProvincia.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProvincia.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProvincia() throws Exception {		
		this.startProcessProvincia(true);
	}
	
	public void startProcessProvincia(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProvincia ,this.jPanelParametrosReportesProvincia, this.jScrollPanelDatosProvincia,this.jPanelPaginacionProvincia, this.jScrollPanelDatosEdicionProvincia, this.jPanelAccionesProvincia,this.jPanelAccionesFormularioProvincia,this.jmenuBarProvincia,this.jmenuBarDetalleProvincia,this.jTtoolBarProvincia,this.jTtoolBarDetalleProvincia);		
		
		final JTabbedPane jTabbedPaneBusquedasProvincia=this.jTabbedPaneBusquedasProvincia; 
		
		final JPanel jPanelParametrosReportesProvincia=this.jPanelParametrosReportesProvincia;
		//final JScrollPane jScrollPanelDatosProvincia=this.jScrollPanelDatosProvincia;
		final JTable jTableDatosProvincia=this.jTableDatosProvincia;		
		final JPanel jPanelPaginacionProvincia=this.jPanelPaginacionProvincia;
		//final JScrollPane jScrollPanelDatosEdicionProvincia=this.jScrollPanelDatosEdicionProvincia;
		final JPanel jPanelAccionesProvincia=this.jPanelAccionesProvincia;
		
		JPanel jPanelCamposAuxiliarProvincia=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProvincia=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProvincia!=null) {
			jPanelCamposAuxiliarProvincia=this.jInternalFrameDetalleFormProvincia.jPanelCamposProvincia;
			jPanelAccionesFormularioAuxiliarProvincia=this.jInternalFrameDetalleFormProvincia.jPanelAccionesFormularioProvincia;
		}
		
		final JPanel jPanelCamposProvincia=jPanelCamposAuxiliarProvincia;
		final JPanel jPanelAccionesFormularioProvincia=jPanelAccionesFormularioAuxiliarProvincia;
		
		
		final JMenuBar jmenuBarProvincia=this.jmenuBarProvincia;
		final JToolBar jTtoolBarProvincia=this.jTtoolBarProvincia;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProvincia=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProvincia=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProvincia!=null) {
			jmenuBarDetalleAuxiliarProvincia=this.jInternalFrameDetalleFormProvincia.jmenuBarDetalleProvincia;
			jTtoolBarDetalleAuxiliarProvincia=this.jInternalFrameDetalleFormProvincia.jTtoolBarDetalleProvincia;
		}
		
		final JMenuBar jmenuBarDetalleProvincia=jmenuBarDetalleAuxiliarProvincia;
		final JToolBar jTtoolBarDetalleProvincia=jTtoolBarDetalleAuxiliarProvincia;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProvincia;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProvincia;
			processRunnable.jTableDatos=jTableDatosProvincia;
			processRunnable.jPanelCampos=jPanelCamposProvincia;
			processRunnable.jPanelPaginacion=jPanelPaginacionProvincia;
			processRunnable.jPanelAcciones=jPanelAccionesProvincia;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProvincia;
			
			
			processRunnable.jmenuBar=jmenuBarProvincia;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProvincia;
			processRunnable.jTtoolBar=jTtoolBarProvincia;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProvincia;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProvincia ,jPanelParametrosReportesProvincia,jTableDatosProvincia, /*jScrollPanelDatosProvincia,*/jPanelCamposProvincia,jPanelPaginacionProvincia, /*jScrollPanelDatosEdicionProvincia,*/ jPanelAccionesProvincia,jPanelAccionesFormularioProvincia,jmenuBarProvincia,jmenuBarDetalleProvincia,jTtoolBarProvincia,jTtoolBarDetalleProvincia);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProvincia ,jPanelParametrosReportesProvincia, jScrollPanelDatosProvincia,jPanelPaginacionProvincia, jScrollPanelDatosEdicionProvincia, jPanelAccionesProvincia,jPanelAccionesFormularioProvincia,jmenuBarProvincia,jmenuBarDetalleProvincia,jTtoolBarProvincia,jTtoolBarDetalleProvincia);
						
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
	
	public void finishProcessProvincia() {// throws Exception 
		this.finishProcessProvincia(true);
	}
	
	public void finishProcessProvincia(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProvincia ,this.jPanelParametrosReportesProvincia, this.jScrollPanelDatosProvincia,this.jPanelPaginacionProvincia, this.jScrollPanelDatosEdicionProvincia, this.jPanelAccionesProvincia,this.jPanelAccionesFormularioProvincia,this.jmenuBarProvincia,this.jmenuBarDetalleProvincia,this.jTtoolBarProvincia,this.jTtoolBarDetalleProvincia);		
		
		final JTabbedPane jTabbedPaneBusquedasProvincia=this.jTabbedPaneBusquedasProvincia; 
		
		final JPanel jPanelParametrosReportesProvincia=this.jPanelParametrosReportesProvincia;
		//final JScrollPane jScrollPanelDatosProvincia=this.jScrollPanelDatosProvincia;
		final JTable jTableDatosProvincia=this.jTableDatosProvincia;		
		final JPanel jPanelPaginacionProvincia=this.jPanelPaginacionProvincia;
		//final JScrollPane jScrollPanelDatosEdicionProvincia=this.jScrollPanelDatosEdicionProvincia;
		final JPanel jPanelAccionesProvincia=this.jPanelAccionesProvincia;
		
		JPanel jPanelCamposAuxiliarProvincia=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProvincia=new JPanel();
		
		if(this.jInternalFrameDetalleFormProvincia!=null) {
			jPanelCamposAuxiliarProvincia=this.jInternalFrameDetalleFormProvincia.jPanelCamposProvincia;
			jPanelAccionesFormularioAuxiliarProvincia=this.jInternalFrameDetalleFormProvincia.jPanelAccionesFormularioProvincia;
		}
		
		final JPanel jPanelCamposProvincia=jPanelCamposAuxiliarProvincia;
		final JPanel jPanelAccionesFormularioProvincia=jPanelAccionesFormularioAuxiliarProvincia;
		
		
		final JMenuBar jmenuBarProvincia=this.jmenuBarProvincia;		
		final JToolBar jTtoolBarProvincia=this.jTtoolBarProvincia;
				
		JMenuBar jmenuBarDetalleAuxiliarProvincia=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProvincia=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProvincia!=null) {
			jmenuBarDetalleAuxiliarProvincia=this.jInternalFrameDetalleFormProvincia.jmenuBarDetalleProvincia;
			jTtoolBarDetalleAuxiliarProvincia=this.jInternalFrameDetalleFormProvincia.jTtoolBarDetalleProvincia;		
		}
		
		final JMenuBar jmenuBarDetalleProvincia=jmenuBarDetalleAuxiliarProvincia;
		final JToolBar jTtoolBarDetalleProvincia=jTtoolBarDetalleAuxiliarProvincia;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProvincia;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProvincia;
			processRunnable.jTableDatos=jTableDatosProvincia;
			processRunnable.jPanelCampos=jPanelCamposProvincia;
			processRunnable.jPanelPaginacion=jPanelPaginacionProvincia;
			processRunnable.jPanelAcciones=jPanelAccionesProvincia;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProvincia;
			
			
			processRunnable.jmenuBar=jmenuBarProvincia;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProvincia;
			processRunnable.jTtoolBar=jTtoolBarProvincia;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProvincia;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProvincia ,jPanelParametrosReportesProvincia, jTableDatosProvincia,/*jScrollPanelDatosProvincia,*/jPanelCamposProvincia,jPanelPaginacionProvincia, /*jScrollPanelDatosEdicionProvincia,*/ jPanelAccionesProvincia,jPanelAccionesFormularioProvincia,jmenuBarProvincia,jmenuBarDetalleProvincia,jTtoolBarProvincia,jTtoolBarDetalleProvincia));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProvincia(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProvincia(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProvincia(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProvincia(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProvincia,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProvincia,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProvincia(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProvincia,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProvincia,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.provinciaConstantesFunciones.getsFinalQueryProvincia();
		String  finalQueryPaginacionTodos=this.provinciaConstantesFunciones.getsFinalQueryProvincia();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProvinciaConstantesFunciones.getArrayColumnasGlobalesNoProvincia(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProvinciaConstantesFunciones.getArrayColumnasGlobalesProvincia(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProvinciaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.provinciasEliminados= new ArrayList<Provincia>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProvincia();
		
				///*ProvinciaSessionBean*/this.provinciaSessionBean=new ProvinciaSessionBean();
			
			if(this.provinciaSessionBean==null) {
				this.provinciaSessionBean=new ProvinciaSessionBean();
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
					this.iNumeroPaginacion=ProvinciaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProvinciaConstantesFunciones.getClassesForeignKeysOfProvincia(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/provincia."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			provinciasAux= new ArrayList<Provincia>();
			
				
			provinciaLogic.setDatosCliente(this.datosCliente);
			provinciaLogic.setDatosDeep(this.datosDeep);
			provinciaLogic.setIsConDeep(true);
			
			
			provinciaLogic.getProvinciaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					provinciaLogic.getTodosProvincias(finalQueryGlobal,pagination);
					
					//provinciaLogic.getTodosProvinciasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(provinciaLogic.getProvincias()==null|| provinciaLogic.getProvincias().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							provinciasAux= new ArrayList<Provincia>();
							provinciasAux.addAll(provinciaLogic.getProvincias());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							provinciasAux= new ArrayList<Provincia>();
							provinciasAux.addAll(provincias);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							provinciaLogic.getTodosProvincias(finalQueryGlobal+"",this.pagination);												
							
							//provinciaLogic.getTodosProvinciasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteProvincias("Todos",provinciaLogic.getProvincias() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							provinciaLogic.setProvincias(new ArrayList<Provincia>());					
							provinciaLogic.getProvincias().addAll(provinciasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							provincias=new ArrayList<Provincia>();
							provincias.addAll(provinciasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idProvincia=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idProvincia=this.idActual;
				
				} else if(this.idProvinciaActual!=null && this.idProvinciaActual!=0L) {
					idProvincia=idProvinciaActual;
				}
				
					
				this.sDetalleReporte=ProvinciaConstantesFunciones.getDetalleIndicePorId(idProvincia);
				
				this.provincias=new ArrayList<Provincia>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					provinciaLogic.getEntity(idProvincia);
					
					//provinciaLogic.getEntityWithConnection(idProvincia);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					provinciaLogic.setProvincias(new ArrayList<Provincia>());
					provinciaLogic.getProvincias().add(provinciaLogic.getProvincia());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.provincias=new ArrayList<Provincia>();
					this.provincias.add(provincia);
				}
				
				if(provinciaLogic.getProvincia()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorIdPaisPorNombre")) {
				this.sDetalleReporte=ProvinciaConstantesFunciones.getDetalleIndiceBusquedaPorIdPaisPorNombre(id_paisBusquedaPorIdPaisPorNombre,nombreBusquedaPorIdPaisPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					provinciaLogic.getProvinciasBusquedaPorIdPaisPorNombre(finalQueryGlobal,pagination,id_paisBusquedaPorIdPaisPorNombre,nombreBusquedaPorIdPaisPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProvinciaConstantesFunciones.getDetalleIndiceBusquedaPorIdPaisPorNombre(id_paisBusquedaPorIdPaisPorNombre,nombreBusquedaPorIdPaisPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProvinciaConstantesFunciones.getDetalleIndiceBusquedaPorIdPaisPorNombre(id_paisBusquedaPorIdPaisPorNombre,nombreBusquedaPorIdPaisPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=provinciaLogic.getProvincias()==null||provinciaLogic.getProvincias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=provincias==null|| provincias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						provinciasAux=new ArrayList<Provincia>();
						provinciasAux.addAll(provinciaLogic.getProvincias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							provinciasAux=new ArrayList<Provincia>();
							provinciasAux.addAll(provincias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							provinciaLogic.getProvinciasBusquedaPorIdPaisPorNombre(finalQueryGlobal,pagination,id_paisBusquedaPorIdPaisPorNombre,nombreBusquedaPorIdPaisPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProvinciaConstantesFunciones.getDetalleIndiceBusquedaPorIdPaisPorNombre(id_paisBusquedaPorIdPaisPorNombre,nombreBusquedaPorIdPaisPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProvinciaConstantesFunciones.getDetalleIndiceBusquedaPorIdPaisPorNombre(id_paisBusquedaPorIdPaisPorNombre,nombreBusquedaPorIdPaisPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProvincias("BusquedaPorIdPaisPorNombre",provinciaLogic.getProvincias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProvincias("BusquedaPorIdPaisPorNombre",provincias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						provinciaLogic.setProvincias(new ArrayList<Provincia>());
						provinciaLogic.getProvincias().addAll(provinciasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							provincias=new ArrayList<Provincia>();
							provincias.addAll(provinciasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=ProvinciaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					provinciaLogic.getProvinciasFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProvinciaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProvinciaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=provinciaLogic.getProvincias()==null||provinciaLogic.getProvincias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=provincias==null|| provincias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						provinciasAux=new ArrayList<Provincia>();
						provinciasAux.addAll(provinciaLogic.getProvincias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							provinciasAux=new ArrayList<Provincia>();
							provinciasAux.addAll(provincias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							provinciaLogic.getProvinciasFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProvinciaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProvinciaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProvincias("FK_IdPais",provinciaLogic.getProvincias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProvincias("FK_IdPais",provincias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						provinciaLogic.setProvincias(new ArrayList<Provincia>());
						provinciaLogic.getProvincias().addAll(provinciasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							provincias=new ArrayList<Provincia>();
							provincias.addAll(provinciasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProvincia();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProvincia();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=provinciaLogic.getProvincias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=provincias.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=provinciaLogic.getProvincias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=provincias.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Provincia provincia) {
		Boolean permite=true;
		
		if(this.provincia.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProvinciaConstantesFunciones.getOrderByListaProvincia();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProvinciaConstantesFunciones.getOrderByListaProvincia();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Provincia provincia:provinciaLogic.getProvincias()) {
				if(provincia.getsType().equals(Constantes2.S_TOTALES)) {
					provinciaTotales=provincia;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Provincia provincia:this.provincias) {
				if(provincia.getsType().equals(Constantes2.S_TOTALES)) {
					provinciaTotales=provincia;
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
			this.provinciaAux=new Provincia();
			this.provinciaAux.setsType(Constantes2.S_TOTALES);
			this.provinciaAux.setIsNew(false);
			this.provinciaAux.setIsChanged(false);
			this.provinciaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ProvinciaConstantesFunciones.TotalizarValoresFilaProvincia(this.provinciaLogic.getProvincias(),this.provinciaAux);
				
				this.provinciaLogic.getProvincias().add(this.provinciaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProvinciaConstantesFunciones.TotalizarValoresFilaProvincia(this.provincias,this.provinciaAux);
				
				this.provincias.add(this.provinciaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		provinciaTotales=new Provincia();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.provinciaLogic.getProvincias().remove(provinciaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.provincias.remove(provinciaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		provinciaTotales=new Provincia();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Provincia provincia:provinciaLogic.getProvincias()) {
				if(provincia.getsType().equals(Constantes2.S_TOTALES)) {
					provinciaTotales=provincia;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProvinciaConstantesFunciones.TotalizarValoresFilaProvincia(this.provinciaLogic.getProvincias(),provinciaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Provincia provincia:this.provincias) {
				if(provincia.getsType().equals(Constantes2.S_TOTALES)) {
					provinciaTotales=provincia;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProvinciaConstantesFunciones.TotalizarValoresFilaProvincia(this.provincias,provinciaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProvinciasBusquedaPorIdPaisPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdPaisPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProvinciasFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProvinciasFK_IdRegion()throws Exception {
		try {
			sAccionBusqueda="FK_IdRegion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProvinciaPorIdPaisPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorIdPaisPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	public void getProvinciaPorIdPorIdPais()throws Exception {
		try {
			sAccionBusqueda="PorIdPorIdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getProvinciasBusquedaPorIdPaisPorNombre(String sFinalQuery,Long id_pais,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					provinciaLogic.getProvinciasBusquedaPorIdPaisPorNombre(sFinalQuery,this.pagination,id_pais,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProvinciasFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					provinciaLogic.getProvinciasFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProvinciasFK_IdRegion(String sFinalQuery,Long id_region)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					provinciaLogic.getProvinciasFK_IdRegion(sFinalQuery,this.pagination,id_region);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProvinciaPorIdPaisPorNombre(Long id_pais,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					provinciaLogic.getProvinciaPorIdPaisPorNombre(id_pais,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProvinciaPorIdPorIdPais(Long id,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					provinciaLogic.getProvinciaPorIdPorIdPais(id,id_pais);
				
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
	
	public void inicializarPermisosProvincia() {
		this.isPermisoTodoProvincia=false;
		this.isPermisoNuevoProvincia=false;
		this.isPermisoActualizarProvincia=false;
		this.isPermisoActualizarOriginalProvincia=false;
		this.isPermisoEliminarProvincia=false;
		this.isPermisoGuardarCambiosProvincia=false;
		this.isPermisoConsultaProvincia=false;
		this.isPermisoBusquedaProvincia=false;
		this.isPermisoReporteProvincia=false;		
		this.isPermisoOrdenProvincia=false;		
		this.isPermisoPaginacionMedioProvincia=false;		
		this.isPermisoPaginacionAltoProvincia=false;
		this.isPermisoPaginacionTodoProvincia=false;
		this.isPermisoCopiarProvincia=false;		
		this.isPermisoVerFormProvincia=false;		
		this.isPermisoDuplicarProvincia=false;		
		this.isPermisoOrdenProvincia=false;		
	}
	
	public void setPermisosUsuarioProvincia(Boolean isPermiso) {
		this.isPermisoTodoProvincia=isPermiso;
		this.isPermisoNuevoProvincia=isPermiso;
		this.isPermisoActualizarProvincia=isPermiso;
		this.isPermisoActualizarOriginalProvincia=isPermiso;
		this.isPermisoEliminarProvincia=isPermiso;
		this.isPermisoGuardarCambiosProvincia=isPermiso;
		this.isPermisoConsultaProvincia=isPermiso;
		this.isPermisoBusquedaProvincia=isPermiso;
		this.isPermisoReporteProvincia=isPermiso;
		this.isPermisoOrdenProvincia=isPermiso;		
		this.isPermisoPaginacionMedioProvincia=isPermiso;		
		this.isPermisoPaginacionAltoProvincia=isPermiso;		
		this.isPermisoPaginacionTodoProvincia=isPermiso;		
		this.isPermisoCopiarProvincia=isPermiso;		
		this.isPermisoVerFormProvincia=isPermiso;		
		this.isPermisoDuplicarProvincia=isPermiso;
		this.isPermisoOrdenProvincia=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProvincia(Boolean isPermiso) {
		//this.isPermisoTodoProvincia=isPermiso;
		this.isPermisoNuevoProvincia=isPermiso;
		this.isPermisoActualizarProvincia=isPermiso;
		this.isPermisoActualizarOriginalProvincia=isPermiso;
		this.isPermisoEliminarProvincia=isPermiso;
		this.isPermisoGuardarCambiosProvincia=isPermiso;
		//this.isPermisoConsultaProvincia=isPermiso;
		//this.isPermisoBusquedaProvincia=isPermiso;
		//this.isPermisoReporteProvincia=isPermiso;
		//this.isPermisoOrdenProvincia=isPermiso;		
		//this.isPermisoPaginacionMedioProvincia=isPermiso;		
		//this.isPermisoPaginacionAltoProvincia=isPermiso;		
		//this.isPermisoPaginacionTodoProvincia=isPermiso;		
		//this.isPermisoCopiarProvincia=isPermiso;		
		//this.isPermisoDuplicarProvincia=isPermiso;
		//this.isPermisoOrdenProvincia=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProvinciaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(BarrioConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(CantonConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(DatoGeneralEmpleadoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(EmpleadoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ParametroCarteraDefectoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(CiudadConstantesFunciones.SNOMBREOPCION);
		
		if(ProvinciaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosBarrio=false;
		this.isTienePermisosBarrio=this.verificarGetPermisosUsuarioOpcionProvinciaClaseRelacionada(this.opcionsRelacionadas,BarrioConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosCanton=false;
		this.isTienePermisosCanton=this.verificarGetPermisosUsuarioOpcionProvinciaClaseRelacionada(this.opcionsRelacionadas,CantonConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosDatoGeneralEmpleado=false;
		this.isTienePermisosDatoGeneralEmpleado=this.verificarGetPermisosUsuarioOpcionProvinciaClaseRelacionada(this.opcionsRelacionadas,DatoGeneralEmpleadoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosEmpleado=false;
		this.isTienePermisosEmpleado=this.verificarGetPermisosUsuarioOpcionProvinciaClaseRelacionada(this.opcionsRelacionadas,EmpleadoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosCliente=false;
		this.isTienePermisosCliente=this.verificarGetPermisosUsuarioOpcionProvinciaClaseRelacionada(this.opcionsRelacionadas,ClienteConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosParametroCarteraDefecto=false;
		this.isTienePermisosParametroCarteraDefecto=this.verificarGetPermisosUsuarioOpcionProvinciaClaseRelacionada(this.opcionsRelacionadas,ParametroCarteraDefectoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosCiudad=false;
		this.isTienePermisosCiudad=this.verificarGetPermisosUsuarioOpcionProvinciaClaseRelacionada(this.opcionsRelacionadas,CiudadConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebProvincia(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProvinciaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosBarrio=conPermiso;
		this.isTienePermisosCanton=conPermiso;
		this.isTienePermisosDatoGeneralEmpleado=conPermiso;
		this.isTienePermisosEmpleado=conPermiso;
		this.isTienePermisosCliente=conPermiso;
		this.isTienePermisosParametroCarteraDefecto=conPermiso;
		this.isTienePermisosCiudad=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioProvinciaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProvinciaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProvinciaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosBarrio && this.jInternalFrameDetalleFormProvincia!=null && this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProvincia.jTabbedPaneRelacionesProvincia.remove(this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosCanton && this.jInternalFrameDetalleFormProvincia!=null && this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProvincia.jTabbedPaneRelacionesProvincia.remove(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosDatoGeneralEmpleado && this.jInternalFrameDetalleFormProvincia!=null && this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProvincia.jTabbedPaneRelacionesProvincia.remove(this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosEmpleado && this.jInternalFrameDetalleFormProvincia!=null && this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProvincia.jTabbedPaneRelacionesProvincia.remove(this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosCliente && this.jInternalFrameDetalleFormProvincia!=null && this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProvincia.jTabbedPaneRelacionesProvincia.remove(this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosParametroCarteraDefecto && this.jInternalFrameDetalleFormProvincia!=null && this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProvincia.jTabbedPaneRelacionesProvincia.remove(this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosCiudad && this.jInternalFrameDetalleFormProvincia!=null && this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProvincia.jTabbedPaneRelacionesProvincia.remove(this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioProvincia() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProvinciaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.provinciaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProvinciaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProvincia=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProvincia=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProvincia=this.isPermisoActualizarProvincia;
			this.isPermisoEliminarProvincia=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProvincia=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProvincia=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProvincia=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProvincia=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProvincia=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProvincia=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProvincia=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProvincia=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProvincia=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProvincia=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProvincia=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProvincia=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProvincia=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.provinciaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProvincia.setToolTipText(this.jTableDatosProvincia.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProvincia(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProvincia(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProvinciaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProvinciaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProvincia() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCiudad && this.provinciaConstantesFunciones.mostrarCiudadProvincia && !ProvinciaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Ciudad");
			reporte.setsDescripcion("Ciudad");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosCliente && this.provinciaConstantesFunciones.mostrarClienteProvincia && !ProvinciaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cliente");
			reporte.setsDescripcion("Cliente");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosCanton && this.provinciaConstantesFunciones.mostrarCantonProvincia && !ProvinciaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Canton");
			reporte.setsDescripcion("Canton");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosBarrio && this.provinciaConstantesFunciones.mostrarBarrioProvincia && !ProvinciaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Barrio");
			reporte.setsDescripcion("Barrio");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosEmpleado && this.provinciaConstantesFunciones.mostrarEmpleadoProvincia && !ProvinciaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Empleado");
			reporte.setsDescripcion("Empleado");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosDatoGeneralEmpleado && this.provinciaConstantesFunciones.mostrarDatoGeneralEmpleadoProvincia && !ProvinciaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Dato General Empleado");
			reporte.setsDescripcion("Dato General Empleado");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosParametroCarteraDefecto && this.provinciaConstantesFunciones.mostrarParametroCarteraDefectoProvincia && !ProvinciaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Parametro Cartera Defecto");
			reporte.setsDescripcion("Parametro Cartera Defecto");
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
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyProvinciaListas()throws Exception {
		try	{						
			
				this.paissForeignKey=new ArrayList();
				this.regionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProvinciaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProvinciaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyProvinciaListas(false);
			} else {
			
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyRegionListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyPaisListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.paissForeignKey==null||this.paissForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PaisConstantesFunciones.SFINALQUERY;

				this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyRegionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if(cargarCombosDependencia && (this.regionsForeignKey==null||this.regionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=RegionConstantesFunciones.getArrayColumnasGlobalesRegion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,RegionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=RegionConstantesFunciones.SFINALQUERY;

				this.cargarCombosRegionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyProvinciaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ProvinciaParameterReturnGeneral provinciaReturnGeneral=new ProvinciaParameterReturnGeneral();
						
			


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.provinciaConstantesFunciones.cargarid_paisProvincia)
					 || (this.esRecargarFks && this.provinciaConstantesFunciones.cargarid_paisProvincia)) {

					if(!this.provinciaSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+provinciaSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}


				String finalQueryGlobalRegion="";

				if(cargarCombosDependencia && ((this.regionsForeignKey==null||this.regionsForeignKey.size()<=0) && this.provinciaConstantesFunciones.cargarid_regionProvincia)
					 || (this.esRecargarFks && this.provinciaConstantesFunciones.cargarid_regionProvincia)) {

					if(!this.provinciaSessionBean.getisBusquedaDesdeForeignKeySesionRegion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=RegionConstantesFunciones.getArrayColumnasGlobalesRegion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalRegion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,RegionConstantesFunciones.TABLENAME);

						finalQueryGlobalRegion=Funciones.GetFinalQueryAppend(finalQueryGlobalRegion, "");
						finalQueryGlobalRegion+=RegionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosRegionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalRegion=" WHERE " + ConstantesSql.ID + "="+provinciaSessionBean.getlidRegionActual();
					}
				} else {
					finalQueryGlobalRegion="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				provinciaReturnGeneral=provinciaLogic.cargarCombosLoteForeignKeyProvincia(finalQueryGlobalPais,finalQueryGlobalRegion);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=provinciaReturnGeneral.getpaissForeignKey();
			}

			if(!finalQueryGlobalRegion.equals("NONE")) {
				this.regionsForeignKey=provinciaReturnGeneral.getregionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyProvincia()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPais();
			this.addItemDefectoCombosForeignKeyRegion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {
			if(this.provinciaSessionBean==null) {
				this.provinciaSessionBean=new ProvinciaSessionBean();
			}

			if(!this.provinciaSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				Pais pais=new Pais();
				PaisConstantesFunciones.setPaisDescripcion(pais,Constantes.SMENSAJE_ESCOJA_OPCION);
				pais.setId(null);

				if(!PaisConstantesFunciones.ExisteEnLista(this.paissForeignKey,pais,true)) {

					this.paissForeignKey.add(0,pais);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyRegion()throws Exception {
		try {

			if(!this.provinciaSessionBean.getisBusquedaDesdeForeignKeySesionRegion()) {
				Region region=new Region();
				RegionConstantesFunciones.setRegionDescripcion(region,Constantes.SMENSAJE_ESCOJA_OPCION);
				region.setId(null);

				if(!RegionConstantesFunciones.ExisteEnLista(this.regionsForeignKey,region,true)) {

					this.regionsForeignKey.add(0,region);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyProvincia()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyPais("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProvincia(String sFormularioTipoBusqueda)throws Exception {
		try {
			
			this.initActionsCombosForeignKeyPais(sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyPais(JComboBox jComboBoxPaisGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Pais paisLocal=(Pais)jComboBoxPaisGenerico.getSelectedItem();

			if(paisLocal!=null  && paisLocal.getId()!=null  && paisLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_pais="+paisLocal.getId();
			}
			//REDEFINE

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboRegion=sFinalQueryCombo;

			this.regionsForeignKey=new ArrayList<Region>();
			this.cargarCombosForeignKeyRegion(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}
	
	



	public void initActionsCombosForeignKeyPais(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormProvincia!=null) {
						this.jInternalFrameDetalleFormProvincia.jComboBoxid_paisProvincia.addItemListener(new ComboBoxItemListener(this,"id_paisProvincia"));
						this.jInternalFrameDetalleFormProvincia.jComboBoxid_paisProvincia.addFocusListener(new ComboBoxFocusListener(this,"id_paisProvincia"));
					}
				} else {
					if(this.jInternalFrameDetalleFormProvincia!=null) {
						this.jInternalFrameDetalleFormProvincia.jComboBoxid_paisProvincia.addActionListener(new ComboBoxActionListener(this,"id_paisProvincia"));
						this.jInternalFrameDetalleFormProvincia.jComboBoxid_paisProvincia.addFocusListener(new ComboBoxFocusListener(this,"id_paisProvincia"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia"));

						this.jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia"));

					} else {
						this.jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia"));

						this.jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia"));

					}
			
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_paisFK_IdPaisProvincia.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_paisFK_IdPaisProvincia"));

						this.jComboBoxid_paisFK_IdPaisProvincia.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_paisFK_IdPaisProvincia"));

					} else {
						this.jComboBoxid_paisFK_IdPaisProvincia.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_paisFK_IdPaisProvincia"));

						this.jComboBoxid_paisFK_IdPaisProvincia.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_paisFK_IdPaisProvincia"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyProvincia()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProvincia();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProvincia(Provincia provincia)throws Exception {	
		try {
			
			this.setActualPaisForeignKey(provincia.getid_pais(),false,"Formulario");
			this.setActualRegionForeignKey(provincia.getid_region(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProvincia(Provincia provincia,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProvincia()throws Exception {	
		try {
			
			this.setActualPaisForeignKey(this.provinciaConstantesFunciones.getid_pais(),false,"Formulario");
			this.setActualRegionForeignKey(this.provinciaConstantesFunciones.getid_region(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProvincia()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProvincia()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProvincia()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProvincia()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProvincia()throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey("Todos");
			this.cargarCombosFrameRegionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProvincia(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameRegionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProvincia()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProvincia.jComboBoxid_paisProvincia!=null && this.jInternalFrameDetalleFormProvincia.jComboBoxid_paisProvincia.getItemCount()>0) {
				this.jInternalFrameDetalleFormProvincia.jComboBoxid_paisProvincia.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProvincia.jComboBoxid_regionProvincia!=null && this.jInternalFrameDetalleFormProvincia.jComboBoxid_regionProvincia.getItemCount()>0) {
				this.jInternalFrameDetalleFormProvincia.jComboBoxid_regionProvincia.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void recargarFormProvinciaPais(JComboBox<?> jComboBoxGenericoPais,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormProvinciaid_region(jComboBoxGenericoPais,sFormularioTipoBusqueda,"Pais",false);
	}


	
	



	public void recargarFormProvinciaid_region(JComboBox<?> jComboBoxGenericoRegion,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Pais")){
				this.setActualParaGuardarPaisForeignKey(this.provincia,jComboBoxGenericoRegion);
			}

			if(this.provincia.getid_pais()!=null && this.provincia.getid_pais()!=0L) {
				sFinalQuery+="  WHERE  id_pais="+this.provincia.getid_pais();
			} else {
				sFinalQuery+="  WHERE  id_pais=-1";
			}



			//BUCLE RECURSIVO
			this.setActualRegionForeignKey(this.provincia.getid_pais(),true,sFormularioTipoBusqueda);

			this.cargarCombosRegionsForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameRegionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public ProvinciaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProvinciaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProvinciaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.provinciaSessionBean=new ProvinciaSessionBean(); 
		this.provinciaConstantesFunciones=new ProvinciaConstantesFunciones(); 
		this.provinciaBean=new Provincia();//(this.provinciaConstantesFunciones); 		
		this.provinciaReturnGeneral=new ProvinciaParameterReturnGeneral(); 
		
		this.provinciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.provinciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProvinciaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProvinciaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProvinciaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProvincia(true);
			
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
			
			this.provinciaConstantesFunciones=new ProvinciaConstantesFunciones(); 
			this.provinciaBean=new Provincia();//this.provinciaConstantesFunciones); 			
			this.provinciaReturnGeneral=new ProvinciaParameterReturnGeneral(); 
		
			ProvinciaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Provincia Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.provincia=new Provincia();
			this.provincias = new ArrayList<Provincia>();
			this.provinciasAux = new ArrayList<Provincia>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic=new ProvinciaLogic();
				this.provinciaLogic.getNewConnexionToDeep("");
			}
			
			//this.provinciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.provinciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProvincia);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProvincia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProvincia);	
					}
					
					if(this.jInternalFrameImportacionProvincia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProvincia);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProvincia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProvincia);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProvincia!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProvincia);
				this.jInternalFrameDetalleFormProvincia.setVisible(false);
				this.jInternalFrameDetalleFormProvincia.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProvincia!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProvincia);
					this.jInternalFrameReporteDinamicoProvincia.setVisible(false);
					this.jInternalFrameReporteDinamicoProvincia.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProvincia!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProvincia);
					this.jInternalFrameImportacionProvincia.setVisible(false);
					this.jInternalFrameImportacionProvincia.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProvincia!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProvincia);
					this.jInternalFrameOrderByProvincia.setVisible(false);
					this.jInternalFrameOrderByProvincia.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProvinciaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProvinciaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.provinciaReturnGeneral=new ProvinciaParameterReturnGeneral();
			
			this.provinciaParameterGeneral=new ProvinciaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.provinciaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.provinciaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProvinciaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.provinciaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(BarrioConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(CantonConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(DatoGeneralEmpleadoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(EmpleadoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ParametroCarteraDefectoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(CiudadConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProvinciaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.provinciaSessionBean.getEsGuardarRelacionado(),this.provinciaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProvinciaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.provinciaSessionBean.getEsGuardarRelacionado(),this.provinciaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProvincia=false;
			this.isVisibilidadCeldaDuplicarProvincia=true;
			this.isVisibilidadCeldaCopiarProvincia=true;
			this.isVisibilidadCeldaVerFormProvincia=true;
			this.isVisibilidadCeldaOrdenProvincia=true;
			this.isVisibilidadCeldaNuevoRelacionesProvincia=false;
			this.isVisibilidadCeldaModificarProvincia=false;
			this.isVisibilidadCeldaActualizarProvincia=false;
			this.isVisibilidadCeldaEliminarProvincia=false;
			this.isVisibilidadCeldaCancelarProvincia=false;
			this.isVisibilidadCeldaGuardarProvincia=false;
			this.isVisibilidadCeldaGuardarCambiosProvincia=false;
			
			
			this.isVisibilidadBusquedaPorIdPaisPorNombre=true;
			this.isVisibilidadFK_IdPais=true;
			this.isVisibilidadFK_IdRegion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProvincia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProvincia();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProvincia(false);
			
			this.setPermisosUsuarioProvincia();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.provinciaSessionBean.getEsGuardarRelacionado() 
				|| (this.provinciaSessionBean.getEsGuardarRelacionado() && this.provinciaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProvinciaClasesRelacionadas();
			}
			
			if(this.provinciaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProvinciaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProvinciaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProvincia();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProvincia();
			}
			
			if(!this.isPermisoBusquedaProvincia) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProvincia.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.provinciaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioProvincia,this.isPermisoPaginacionMedioProvincia,this.isPermisoPaginacionTodoProvincia);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProvinciaConstantesFunciones.getTiposSeleccionarProvincia());
				
				this.tiposColumnasSelect=ProvinciaConstantesFunciones.getTiposSeleccionarProvincia(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectProvincia();				
				//this.tiposRelacionesSelect=ProvinciaConstantesFunciones.getTiposRelacionesProvincia(true);
				
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
			//if(!this.provinciaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProvincia();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioProvincia(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioProvincia(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProvincia() ;
			
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
			
			
			this.ciudadLogic=new CiudadLogic();
			this.clienteLogic=new ClienteLogic();
			this.cantonLogic=new CantonLogic();
			this.barrioLogic=new BarrioLogic();
			this.empleadoLogic=new EmpleadoLogic();
			this.datogeneralempleadoLogic=new DatoGeneralEmpleadoLogic();
			this.parametrocarteradefectoLogic=new ParametroCarteraDefectoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.paisLogic=new PaisLogic();
			this.regionLogic=new RegionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				provinciaImplementable= (ProvinciaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProvinciaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				provinciaImplementableHome= (ProvinciaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProvinciaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.provincias= new ArrayList<Provincia>();
			this.provinciasEliminados= new ArrayList<Provincia>();
						
			this.isEsNuevoProvincia=false;
			this.esParaAccionDesdeFormularioProvincia=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.paissForeignKey=new ArrayList<Pais>() ;
			this.regionsForeignKey=new ArrayList<Region>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProvincia(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProvincia();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.provinciaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProvinciaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProvinciaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProvincia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProvincia(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProvincia!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProvincia();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProvincia();
			}
			
			ProvinciaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProvincia.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProvincia.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProvincia.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProvincia(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Provincia: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProvincia() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(CiudadConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CiudadConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(CantonConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CantonConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(BarrioConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(BarrioConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(EmpleadoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(EmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProvincia")) {
				iIndex=this.jInternalFrameDetalleFormProvincia.jTabbedPaneRelacionesProvincia.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProvincia.jTabbedPaneRelacionesProvincia.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProvincia.getSelectedRow();	
				
				

				if(sTitle.equals("Barrios")) {
					if(!BarrioJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessProvincia();

						this.cargarParteTabPanelRelacionadaBarrio(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Cantones")) {
					if(!CantonJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessProvincia();

						this.cargarParteTabPanelRelacionadaCanton(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Ciudades")) {
					if(!CiudadJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessProvincia();

						this.cargarParteTabPanelRelacionadaCiudad(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Clientes")) {
					if(!ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessProvincia();

						this.cargarParteTabPanelRelacionadaCliente(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Dato General Empleados")) {
					if(!DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessProvincia();

						this.cargarParteTabPanelRelacionadaDatoGeneralEmpleado(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Empleados")) {
					if(!EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessProvincia();

						this.cargarParteTabPanelRelacionadaEmpleado(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Parametro Cartera Defectos")) {
					if(!ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessProvincia();

						this.cargarParteTabPanelRelacionadaParametroCarteraDefecto(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProvincia();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaBarrio(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormProvincia.cargarSessionConBeanSwingJInternalFrameBarrio(false,true,iIndex);
		this.jButtonBarrioActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaBarrio();

		//this.jTabbedPaneRelacionesProvincia.updateUI();
		//this.jTabbedPaneRelacionesProvincia.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesProvincia.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaCanton(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormProvincia.cargarSessionConBeanSwingJInternalFrameCanton(false,true,iIndex);
		this.jButtonCantonActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCanton();

		//this.jTabbedPaneRelacionesProvincia.updateUI();
		//this.jTabbedPaneRelacionesProvincia.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesProvincia.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaCiudad(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormProvincia.cargarSessionConBeanSwingJInternalFrameCiudad(false,true,iIndex);
		this.jButtonCiudadActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCiudad();

		//this.jTabbedPaneRelacionesProvincia.updateUI();
		//this.jTabbedPaneRelacionesProvincia.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesProvincia.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormProvincia.cargarSessionConBeanSwingJInternalFrameCliente(false,true,iIndex);
		this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCliente();

		//this.jTabbedPaneRelacionesProvincia.updateUI();
		//this.jTabbedPaneRelacionesProvincia.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesProvincia.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaDatoGeneralEmpleado(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormProvincia.cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(false,true,iIndex);
		this.jButtonDatoGeneralEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDatoGeneralEmpleado();

		//this.jTabbedPaneRelacionesProvincia.updateUI();
		//this.jTabbedPaneRelacionesProvincia.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesProvincia.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaEmpleado(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormProvincia.cargarSessionConBeanSwingJInternalFrameEmpleado(false,true,iIndex);
		this.jButtonEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaEmpleado();

		//this.jTabbedPaneRelacionesProvincia.updateUI();
		//this.jTabbedPaneRelacionesProvincia.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesProvincia.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaParametroCarteraDefecto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormProvincia.cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(false,true,iIndex);
		this.jButtonParametroCarteraDefectoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroCarteraDefecto();

		//this.jTabbedPaneRelacionesProvincia.updateUI();
		//this.jTabbedPaneRelacionesProvincia.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesProvincia.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Ciudad")) {
				int row=this.jTableDatosProvincia.getSelectedRow();
				jButtonCiudadActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Cliente")) {
				int row=this.jTableDatosProvincia.getSelectedRow();
				jButtonClienteActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Canton")) {
				int row=this.jTableDatosProvincia.getSelectedRow();
				jButtonCantonActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Barrio")) {
				int row=this.jTableDatosProvincia.getSelectedRow();
				jButtonBarrioActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Empleado")) {
				int row=this.jTableDatosProvincia.getSelectedRow();
				jButtonEmpleadoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("DatoGeneralEmpleado")) {
				int row=this.jTableDatosProvincia.getSelectedRow();
				jButtonDatoGeneralEmpleadoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ParametroCarteraDefecto")) {
				int row=this.jTableDatosProvincia.getSelectedRow();
				jButtonParametroCarteraDefectoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.provinciaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Ciudad")) {

					if(this.isTienePermisosCiudad && this.provinciaConstantesFunciones.mostrarCiudadProvincia && !ProvinciaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Ciudades"+"("+CiudadConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Ciudades");

						if(provinciaConstantesFunciones.resaltarCiudadProvincia!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(provinciaConstantesFunciones.resaltarCiudadProvincia);
						}

						jmenuItem.setEnabled(this.provinciaConstantesFunciones.activarCiudadProvincia);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Ciudad"));

						

						this.jInternalFrameDetalleFormProvincia.jmenuDetalleProvincia.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Cliente")) {

					if(this.isTienePermisosCliente && this.provinciaConstantesFunciones.mostrarClienteProvincia && !ProvinciaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Clientes"+"("+ClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Clientes");

						if(provinciaConstantesFunciones.resaltarClienteProvincia!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(provinciaConstantesFunciones.resaltarClienteProvincia);
						}

						jmenuItem.setEnabled(this.provinciaConstantesFunciones.activarClienteProvincia);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Cliente"));

						

						this.jInternalFrameDetalleFormProvincia.jmenuDetalleProvincia.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Canton")) {

					if(this.isTienePermisosCanton && this.provinciaConstantesFunciones.mostrarCantonProvincia && !ProvinciaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Cantones"+"("+CantonConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Cantones");

						if(provinciaConstantesFunciones.resaltarCantonProvincia!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(provinciaConstantesFunciones.resaltarCantonProvincia);
						}

						jmenuItem.setEnabled(this.provinciaConstantesFunciones.activarCantonProvincia);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Canton"));

						

						this.jInternalFrameDetalleFormProvincia.jmenuDetalleProvincia.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Barrio")) {

					if(this.isTienePermisosBarrio && this.provinciaConstantesFunciones.mostrarBarrioProvincia && !ProvinciaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Barrios"+"("+BarrioConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Barrios");

						if(provinciaConstantesFunciones.resaltarBarrioProvincia!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(provinciaConstantesFunciones.resaltarBarrioProvincia);
						}

						jmenuItem.setEnabled(this.provinciaConstantesFunciones.activarBarrioProvincia);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Barrio"));

						

						this.jInternalFrameDetalleFormProvincia.jmenuDetalleProvincia.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Empleado")) {

					if(this.isTienePermisosEmpleado && this.provinciaConstantesFunciones.mostrarEmpleadoProvincia && !ProvinciaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Empleados"+"("+EmpleadoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Empleados");

						if(provinciaConstantesFunciones.resaltarEmpleadoProvincia!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(provinciaConstantesFunciones.resaltarEmpleadoProvincia);
						}

						jmenuItem.setEnabled(this.provinciaConstantesFunciones.activarEmpleadoProvincia);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Empleado"));

						

						this.jInternalFrameDetalleFormProvincia.jmenuDetalleProvincia.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Dato General Empleado")) {

					if(this.isTienePermisosDatoGeneralEmpleado && this.provinciaConstantesFunciones.mostrarDatoGeneralEmpleadoProvincia && !ProvinciaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Dato General Empleados"+"("+DatoGeneralEmpleadoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Dato General Empleados");

						if(provinciaConstantesFunciones.resaltarDatoGeneralEmpleadoProvincia!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(provinciaConstantesFunciones.resaltarDatoGeneralEmpleadoProvincia);
						}

						jmenuItem.setEnabled(this.provinciaConstantesFunciones.activarDatoGeneralEmpleadoProvincia);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DatoGeneralEmpleado"));

						

						this.jInternalFrameDetalleFormProvincia.jmenuDetalleProvincia.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Parametro Cartera Defecto")) {

					if(this.isTienePermisosParametroCarteraDefecto && this.provinciaConstantesFunciones.mostrarParametroCarteraDefectoProvincia && !ProvinciaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Cartera Defectos"+"("+ParametroCarteraDefectoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Cartera Defectos");

						if(provinciaConstantesFunciones.resaltarParametroCarteraDefectoProvincia!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(provinciaConstantesFunciones.resaltarParametroCarteraDefectoProvincia);
						}

						jmenuItem.setEnabled(this.provinciaConstantesFunciones.activarParametroCarteraDefectoProvincia);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroCarteraDefecto"));

						

						this.jInternalFrameDetalleFormProvincia.jmenuDetalleProvincia.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyProvincia(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProvincia(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProvincia(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProvinciaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProvincia();
		
		this.cargarCombosFrameForeignKeyProvincia();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProvincia();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProvincia();
		}
	}
	
	

	public void cargarCombosForeignKeyPais(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyPais("Todos");
				}

			this.recargarComboTablaPais(this.paissForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyRegion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyRegionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyRegion();
				this.cargarCombosFrameRegionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyPais("Todos");
				}

			this.recargarComboTablaRegion(this.regionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoProvinciaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.provinciaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProvincia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
			
			
			if(jTableDatosProvincia.getRowCount()>=1) {
				jTableDatosProvincia.removeRowSelectionInterval(0, jTableDatosProvincia.getRowCount()-1);						
			}
			
			this.isEsNuevoProvincia=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProvincia(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProvincia(true);			
			//this.provincia=new Provincia();
			//this.provincia.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProvincia(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProvincia() ;
			
			if(ProvinciaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProvincia(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.provincia);	
			this.actualizarInformacion("INFO_PADRE",false,this.provincia);				
			
			ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
			
			if(this.provinciaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Provincia: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProvinciaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Provincia> provinciasSeleccionados=new ArrayList<Provincia>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProvincia.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProvincia.getSelectedRows().length;			
			}
			
			provinciasSeleccionados=this.getProvinciasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProvincia--;			
				//Provincia provinciaAux= new Provincia();			
				//provinciaAux.setId(this.iIdNuevoProvincia);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Provincia provinciaOrigen=new Provincia();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Provincia provinciaOrigen : provinciasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProvincia.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							provinciaOrigen =(Provincia) this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							provinciaOrigen =(Provincia) this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProvincia();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.provincia.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProvincia(provinciaOrigen,this.provincia,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProvincia(this.provincia);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.provinciaLogic.getProvincias().add(this.provinciaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.provincias.add(this.provinciaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProvincia(false);
				
				this.jTableDatosProvincia.setRowSelectionInterval(this.getIndiceNuevoProvincia(), this.getIndiceNuevoProvincia());
				
				int iLastRow =  this.jTableDatosProvincia.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProvincia.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProvincia.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProvincia(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProvinciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Provincia> provinciasSeleccionados=new ArrayList<Provincia>();									
		
			Provincia provinciaOrigen=new Provincia();
			Provincia provinciaDestino=new Provincia();
				
			provinciasSeleccionados=this.getProvinciasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProvincia.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || provinciasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProvincia.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						provinciaOrigen =(Provincia) this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						provinciaOrigen =(Provincia) this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						provinciaDestino =(Provincia) this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						provinciaDestino =(Provincia) this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				provinciaOrigen =provinciasSeleccionados.get(0);
				provinciaDestino =provinciasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProvincia(provinciaOrigen,provinciaDestino,true,false);
				
				provinciaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(provinciaDestino,provinciaLogic.getProvincias());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(provinciaDestino,provincias);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProvincia(false);
				
				//this.jTableDatosProvincia.setRowSelectionInterval(this.getIndiceNuevoProvincia(), this.getIndiceNuevoProvincia());
				
				int iLastRow =  this.jTableDatosProvincia.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProvincia.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProvincia.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProvincia(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProvinciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProvincia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProvincia.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProvinciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProvincia.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProvincia.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProvincia.setVisible(!isVisible);
			this.jPanelPaginacionProvincia.setVisible(!isVisible);
			this.jPanelAccionesProvincia.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProvinciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProvincia();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProvinciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProvincia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProvinciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProvincia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProvinciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProvincia();
			
			this.abrirFrameOrderByProvincia();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProvinciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProvincia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProvincia(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProvincia);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProvincia.isMaximum()) {
					this.jInternalFrameDetalleFormProvincia.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProvincia.setSize(this.jInternalFrameDetalleFormProvincia.iWidthFormulario,this.jInternalFrameDetalleFormProvincia.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProvincia.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProvincia.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProvincia.isMaximum()) {
						this.jInternalFrameDetalleFormProvincia.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProvincia.jContentPaneDetalleProvincia.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProvincia.jTabbedPaneRelacionesProvincia.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProvincia.jContentPaneDetalleProvincia.getWidth(),ProvinciaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProvincia.jTabbedPaneRelacionesProvincia.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProvincia.jContentPaneDetalleProvincia.getWidth(),ProvinciaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProvincia.jTabbedPaneRelacionesProvincia.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProvincia.jContentPaneDetalleProvincia.getWidth(),ProvinciaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(BarrioJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaBarrio();
					}

					if(CantonJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCanton();
					}

					if(CiudadJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCiudad();
					}

					if(ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCliente();
					}

					if(DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDatoGeneralEmpleado();
					}

					if(EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaEmpleado();
					}

					if(ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroCarteraDefecto();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProvincia.setVisible(true);
	        this.jInternalFrameDetalleFormProvincia.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProvincia() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProvincia==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProvincia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProvincia,false,this);
				} else {
					this.jInternalFrameOrderByProvincia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProvincia,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProvincia);
				this.jInternalFrameOrderByProvincia.setVisible(false);
				this.jInternalFrameOrderByProvincia.setSelected(false);
				
				this.jInternalFrameOrderByProvincia.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProvincia"));
				
				this.inicializarActualizarBindingTablaOrderByProvincia();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProvincia() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProvincia==null) {
				
				this.jInternalFrameImportacionProvincia=new ImportacionJInternalFrame(ProvinciaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProvincia);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProvincia);
				this.jInternalFrameImportacionProvincia.setVisible(false);
				this.jInternalFrameImportacionProvincia.setSelected(false);


				this.jInternalFrameImportacionProvincia.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProvincia"));
				this.jInternalFrameImportacionProvincia.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProvincia"));
				this.jInternalFrameImportacionProvincia.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProvincia"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProvincia() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProvincia==null) {
				this.jInternalFrameReporteDinamicoProvincia=new ReporteDinamicoJInternalFrame(ProvinciaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProvincia);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProvincia);
				this.jInternalFrameReporteDinamicoProvincia.setVisible(false);
				this.jInternalFrameReporteDinamicoProvincia.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProvincia.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProvincia"));
				this.jInternalFrameReporteDinamicoProvincia.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProvincia"));
				this.jInternalFrameReporteDinamicoProvincia.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProvincia"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProvincia();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaBarrio() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.jScrollPanelDatosBarrio.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormProvincia.jContentPaneDetalleProvincia.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.jScrollPanelDatosBarrio.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.jScrollPanelDatosBarrio.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.jScrollPanelDatosBarrio.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaCanton() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jScrollPanelDatosCanton.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormProvincia.jContentPaneDetalleProvincia.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jScrollPanelDatosCanton.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jScrollPanelDatosCanton.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.jScrollPanelDatosCanton.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaCiudad() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.jScrollPanelDatosCiudad.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormProvincia.jContentPaneDetalleProvincia.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.jScrollPanelDatosCiudad.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.jScrollPanelDatosCiudad.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.jScrollPanelDatosCiudad.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormProvincia.jContentPaneDetalleProvincia.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaDatoGeneralEmpleado() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormProvincia.jContentPaneDetalleProvincia.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaEmpleado() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormProvincia.jContentPaneDetalleProvincia.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaParametroCarteraDefecto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormProvincia.jContentPaneDetalleProvincia.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleProvincia() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProvincia);
			
	       	this.jInternalFrameDetalleFormProvincia.setVisible(false);
	        this.jInternalFrameDetalleFormProvincia.setSelected(false);
			
			//this.jInternalFrameDetalleFormProvincia.dispose();
			//this.jInternalFrameDetalleFormProvincia=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProvincia() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProvincia.setVisible(true);
	        this.jInternalFrameReporteDinamicoProvincia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProvincia() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProvincia.setVisible(true);
	        this.jInternalFrameImportacionProvincia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProvincia() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProvincia.setVisible(true);
	        this.jInternalFrameOrderByProvincia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProvincia() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProvincia.setVisible(false);
	        this.jInternalFrameOrderByProvincia.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProvincia() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProvincia.setVisible(false);
	        this.jInternalFrameReporteDinamicoProvincia.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProvincia() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProvincia.setVisible(false);
	        this.jInternalFrameImportacionProvincia.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProvinciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProvincia(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProvincia(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProvincia.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProvincia(true);
			//this.isEsNuevoProvincia=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provincia =(Provincia) this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.provincia =(Provincia) this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProvincia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProvincia(false) ;
			
			if(provinciaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barrioSessionBean.getEsGuardarRelacionado() && BarrioJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonBarrioActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantonSessionBean.getEsGuardarRelacionado() && CantonJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCantonActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getEsGuardarRelacionado() && DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDatoGeneralEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleadoSessionBean.getEsGuardarRelacionado() && EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() && ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroCarteraDefectoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudadSessionBean.getEsGuardarRelacionado() && CiudadJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCiudadActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(ProvinciaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProvincia(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProvincia(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProvinciaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProvincia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provincia =(Provincia) this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.provincia =(Provincia) this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProvincia(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProvincia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProvincia.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProvincia(true);
			//this.isEsNuevoProvincia=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provincia =(Provincia) this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.provincia =(Provincia) this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.provincia.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProvincia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProvincia(false) ;
			
			if(ProvinciaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProvincia(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProvincia(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosProvincia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProvincia,ProvinciaConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProvincia.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaRegion(List<Region> regionsForeignKey)throws Exception{
		TableColumn tableColumnRegion=this.jTableDatosProvincia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProvincia,ProvinciaConstantesFunciones.LABEL_IDREGION));
		TableCellEditor tableCellEditorRegion =tableColumnRegion.getCellEditor();

		RegionTableCell regionTableCellFk=(RegionTableCell)tableCellEditorRegion;

		if(regionTableCellFk!=null) {
			regionTableCellFk.setregionsForeignKey(regionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProvincia.getSelectedRow();

		//if(intSelectedRow<=0) {
			//regionTableCellFk.setRowActual(intSelectedRow);
			//regionTableCellFk.setregionsForeignKeyActual(regionsForeignKey);
		//}


		if(regionTableCellFk!=null) {
			regionTableCellFk.RecargarRegionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProvinciaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProvincia(false);
			
			//if(!this.isEsNuevoProvincia) {								
				int intSelectedRow = this.jTableDatosProvincia.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provincia =(Provincia) this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.provincia =(Provincia) this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProvinciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProvincia(this.provincia,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProvincia(this.provincia);
				
			}
			
			if(this.permiteMantenimiento(this.provincia)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.provinciaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProvincia=true;
					this.inicializarActualizarBindingTablaProvincia(false);
					this.isEsNuevoProvincia=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProvincia=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProvincia=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProvincia(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProvincia(false);
				
				this.habilitarDeshabilitarControlesProvincia(false);
			
												
				
				if(ProvinciaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProvincia();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProvinciaActionPerformed(evt,provinciaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProvincia(this.provincia,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProvincia.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,provinciaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.provincia.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Provincia.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Provincia.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProvinciaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProvincia.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provincia =(Provincia) this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
				this.provincia.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.provincia =(Provincia) this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
				this.provincia.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.provincia)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.provinciaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProvinciaModel) this.jTableDatosProvincia.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProvincia=true;
				this.inicializarActualizarBindingTablaProvincia(false);
				this.isEsNuevoProvincia=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProvincia(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProvincia(false);
				
				this.habilitarDeshabilitarControlesProvincia(false);
				
				
				
				if(ProvinciaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProvincia();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProvinciaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProvincia.getRowCount()>=1) {
				jTableDatosProvincia.removeRowSelectionInterval(0, jTableDatosProvincia.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProvincia(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProvincia(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProvincia(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProvincia(false) ;
			
			this.isEsNuevoProvincia=false;
			
			if(ProvinciaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProvincia();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProvinciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProvincia(false);
				
				//SI ES MANUAL
				if(ProvinciaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProvincia();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProvinciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProvincia--;			
			//Provincia provinciaAux= new Provincia();			
			//provinciaAux.setId(this.iIdNuevoProvincia);
			
			if(this.jInternalFrameDetalleFormProvincia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProvincia();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProvincia(this.provincia);
			
			this.provincia.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.provinciaLogic.getProvincias().add(this.provinciaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.provincias.add(this.provinciaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProvincia(false);
			
			this.jTableDatosProvincia.setRowSelectionInterval(this.getIndiceNuevoProvincia(), this.getIndiceNuevoProvincia());
			
			int iLastRow =  this.jTableDatosProvincia.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProvincia.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProvincia.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProvincia(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProvinciaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProvincia(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProvincia(false);
			
			//SI ES MANUAL
			if(ProvinciaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProvincia();
			}
			
			//this.abrirFrameTreeProvincia();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProvinciaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE ProvinciaES ?", "MANTENIMIENTO DE Provincia", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionProvincia.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralProvincia();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.provinciaReturnGeneral=provinciaLogic.procesarImportacionProvinciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.provinciaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarProvinciaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProvinciaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProvincia.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProvincia.setFileImportacion(this.jInternalFrameImportacionProvincia.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProvincia.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProvincia.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProvincia.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProvincia.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProvinciaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Provincia> provinciasSeleccionados=new ArrayList<Provincia>();		

		provinciasSeleccionados=this.getProvinciasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProvincia.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProvincia.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProvinciaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProvinciaBaseDesign.jrxml";
			
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
			
			this.generarReporteProvincias("Todos",provinciasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.provinciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Provincia",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProvincia.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProvincia.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProvinciaConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProvinciaConstantesFunciones.LABEL_IDREGION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Region_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Region_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Region_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Region_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProvinciaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProvinciaConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoProvincia.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProvincia.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProvincia.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProvinciaConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case ProvinciaConstantesFunciones.LABEL_IDREGION:
					sNombreCampoCategoria="id_region";
					break;

				case ProvinciaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ProvinciaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProvincia.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProvinciaConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case ProvinciaConstantesFunciones.LABEL_IDREGION:
					sNombreCampoCategoriaValor="id_region";
					break;

				case ProvinciaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ProvinciaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProvincia.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProvincia.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProvinciaConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case ProvinciaConstantesFunciones.LABEL_IDREGION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Region",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_region");
					break;

				case ProvinciaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ProvinciaConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoProvinciaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Provincia> provinciasSeleccionados=new ArrayList<Provincia>();		
		
		provinciasSeleccionados=this.getProvinciasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"provincia";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Provincias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProvincia.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProvincia.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProvinciaConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProvinciaConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(Provincia provincia:provinciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(provincia.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProvinciaConstantesFunciones.LABEL_IDREGION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProvinciaConstantesFunciones.LABEL_IDREGION);
					iRow++;

					for(Provincia provincia:provinciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(provincia.getregion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProvinciaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProvinciaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Provincia provincia:provinciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(provincia.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProvinciaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProvinciaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Provincia provincia:provinciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(provincia.getnombre());
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
			//	this.getFilaCabeceraExportarExcelProvincia(row);				
			//	iRow++;
			//}				
			
			//for(Provincia provinciaAux:provinciasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProvincia(provinciaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.provinciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Provincia",JOptionPane.INFORMATION_MESSAGE);
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
				this.provinciaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProvincia(false);
			
			//SI ES MANUAL
			if(ProvinciaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProvincia();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProvinciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProvincia(false);
			
			//SI ES MANUAL
			if(ProvinciaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProvincia();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProvinciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProvincia(false);
			
			//SI ES MANUAL
			if(ProvinciaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProvincia();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProvincia() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProvincia.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProvincia.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProvincia.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProvincia.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProvincia.setMinimumSize(dimensionMinimum);
		this.jTableDatosProvincia.setMaximumSize(dimensionMaximum);
		this.jTableDatosProvincia.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProvincia(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProvincia(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProvincia(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProvincia(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProvincia(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.provinciaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProvincia(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProvincia(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProvincia(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProvinciaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProvinciaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProvincia() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProvincia();
		
		this.inicializarActualizarBindingBotonesManualProvincia(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.provinciaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProvincia();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProvincia() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProvincia(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProvincia(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProvincia.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProvincia.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProvincia.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProvincia!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProvincia.jCheckBoxPostAccionNuevoProvincia.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProvincia.jCheckBoxPostAccionSinCerrarProvincia.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProvincia.jCheckBoxPostAccionSinMensajeProvincia.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProvincia.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProvincia.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProvincia.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProvincia!=null) {
				this.jInternalFrameDetalleFormProvincia.jCheckBoxPostAccionNuevoProvincia.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProvincia.jCheckBoxPostAccionSinCerrarProvincia.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProvincia.jCheckBoxPostAccionSinMensajeProvincia.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProvincia.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProvincia.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProvincia!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProvincia.jComboBoxTiposAccionesFormularioProvincia.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProvincia.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProvincia!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProvincia.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProvincia.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProvincia.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProvincia.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProvincia.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProvincia!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProvincia.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProvincia.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProvincia.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProvincia(Boolean esInicializar) throws Exception {
		try	{	
			if(ProvinciaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProvincia(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProvincia() throws Exception {
		try	{
			if(ProvinciaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProvincia();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProvincia() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProvincia.jComboBoxTiposAccionesFormularioProvincia.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProvincia.jComboBoxTiposAccionesFormularioProvincia.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProvincia() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProvincia.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProvincia.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProvincia.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProvincia.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProvincia.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProvincia.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProvincia.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProvincia.addItem(reporte);
			}
			
			
			if(!this.provinciaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProvincia.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProvincia.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProvincia.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProvincia.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProvincia.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProvincia.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProvincia!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProvincia.jComboBoxTiposAccionesFormularioProvincia.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProvincia.jComboBoxTiposAccionesFormularioProvincia.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProvincia.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProvincia.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProvincia.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProvincia();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProvincia() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProvincia!=null) {
				this.jInternalFrameReporteDinamicoProvincia.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProvincia.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProvincia!=null) {
				this.jInternalFrameReporteDinamicoProvincia.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProvincia.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProvincia!=null) {
				
				if(this.jInternalFrameReporteDinamicoProvincia.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProvincia.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProvincia.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProvincia.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProvincia.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProvincia.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProvincia()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia.getSelectedItem()!=null){this.id_paisBusquedaPorIdPaisPorNombre=((Pais)this.jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia.getSelectedItem()).getId();}
		this.nombreBusquedaPorIdPaisPorNombre=this.jTextAreanombreBusquedaPorIdPaisPorNombreProvincia.getText();
		if(this.jComboBoxid_paisFK_IdPaisProvincia.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisProvincia.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProvincia(Boolean esInicializar) throws Exception {				
		if(ProvinciaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProvincia();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProvincia() throws Exception {
		this.inicializarActualizarBindingTablaProvincia(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProvincia() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProvincia.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProvincia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProvincia.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProvinciaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProvincia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProvincia.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProvinciaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProvinciaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProvinciaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProvinciaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProvincia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProvincia.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProvinciaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProvincia.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProvincia(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=provinciaLogic.getProvincias().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=provincias.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProvinciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProvincia.setModel(new ProvinciaModel(this.provinciaLogic.getProvincias(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProvincia.setModel(new ProvinciaModel(this.provincias,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProvincia!=null && this.jInternalFrameOrderByProvincia.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProvincia();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProvincia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProvincia,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProvinciaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProvinciaConstantesFunciones.SCLASSWEBTITULO,provinciaConstantesFunciones.resaltarSeleccionarProvincia,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProvinciaConstantesFunciones.SCLASSWEBTITULO,provinciaConstantesFunciones.resaltarSeleccionarProvincia,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProvincia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProvincia,ProvinciaConstantesFunciones.LABEL_ID));

		if(this.provinciaConstantesFunciones.mostraridProvincia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProvinciaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.provinciaConstantesFunciones.resaltaridProvincia,this.provinciaConstantesFunciones.activaridProvincia,this,true,"idProvincia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.provinciaConstantesFunciones.resaltaridProvincia,this.provinciaConstantesFunciones.activaridProvincia,this,true,"idProvincia","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProvincia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProvincia,ProvinciaConstantesFunciones.LABEL_IDPAIS));

		if(this.provinciaConstantesFunciones.mostrarid_paisProvincia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProvinciaConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.provinciaConstantesFunciones.resaltarid_paisProvincia,this,this.provinciaConstantesFunciones.activarid_paisProvincia));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.provinciaConstantesFunciones.resaltarid_paisProvincia,this,this.provinciaConstantesFunciones.activarid_paisProvincia,true,"id_paisProvincia","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProvinciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProvincia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProvincia,ProvinciaConstantesFunciones.LABEL_IDREGION));

		if(this.provinciaConstantesFunciones.mostrarid_regionProvincia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProvinciaConstantesFunciones.LABEL_IDREGION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new RegionTableCell(this.regionsForeignKey,this.provinciaConstantesFunciones.resaltarid_regionProvincia,this,this.provinciaConstantesFunciones.activarid_regionProvincia));
			tableColumn.setCellEditor(new RegionTableCell(this.regionsForeignKey,this.provinciaConstantesFunciones.resaltarid_regionProvincia,this,this.provinciaConstantesFunciones.activarid_regionProvincia,true,"id_regionProvincia","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProvinciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProvincia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProvincia,ProvinciaConstantesFunciones.LABEL_CODIGO));

		if(this.provinciaConstantesFunciones.mostrarcodigoProvincia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProvinciaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.provinciaConstantesFunciones.resaltarcodigoProvincia,this.provinciaConstantesFunciones.activarcodigoProvincia,this,true,"codigoProvincia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.provinciaConstantesFunciones.resaltarcodigoProvincia,this.provinciaConstantesFunciones.activarcodigoProvincia,this,true,"codigoProvincia","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProvinciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProvincia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProvincia,ProvinciaConstantesFunciones.LABEL_NOMBRE));

		if(this.provinciaConstantesFunciones.mostrarnombreProvincia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProvinciaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.provinciaConstantesFunciones.resaltarnombreProvincia,this.provinciaConstantesFunciones.activarnombreProvincia,this,true,"nombreProvincia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.provinciaConstantesFunciones.resaltarnombreProvincia,this.provinciaConstantesFunciones.activarnombreProvincia,this,true,"nombreProvincia","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProvinciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.provinciaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCiudad && this.provinciaConstantesFunciones.mostrarCiudadProvincia && !ProvinciaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Ciudades");
				tableColumn.setHeaderValue("Ciudades");
				tableColumn.setCellRenderer(new CiudadTableCell(provinciaConstantesFunciones.resaltarCiudadProvincia,this,this.provinciaConstantesFunciones.activarCiudadProvincia));
				tableColumn.setCellEditor(new CiudadTableCell(provinciaConstantesFunciones.resaltarCiudadProvincia,this,this.provinciaConstantesFunciones.activarCiudadProvincia));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosProvincia.addColumn(tableColumn);
			}

			if(this.isTienePermisosCliente && this.provinciaConstantesFunciones.mostrarClienteProvincia && !ProvinciaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Clientes");
				tableColumn.setHeaderValue("Clientes");
				tableColumn.setCellRenderer(new ClienteTableCell(provinciaConstantesFunciones.resaltarClienteProvincia,this,this.provinciaConstantesFunciones.activarClienteProvincia));
				tableColumn.setCellEditor(new ClienteTableCell(provinciaConstantesFunciones.resaltarClienteProvincia,this,this.provinciaConstantesFunciones.activarClienteProvincia));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosProvincia.addColumn(tableColumn);
			}

			if(this.isTienePermisosCanton && this.provinciaConstantesFunciones.mostrarCantonProvincia && !ProvinciaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Cantones");
				tableColumn.setHeaderValue("Cantones");
				tableColumn.setCellRenderer(new CantonTableCell(provinciaConstantesFunciones.resaltarCantonProvincia,this,this.provinciaConstantesFunciones.activarCantonProvincia));
				tableColumn.setCellEditor(new CantonTableCell(provinciaConstantesFunciones.resaltarCantonProvincia,this,this.provinciaConstantesFunciones.activarCantonProvincia));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosProvincia.addColumn(tableColumn);
			}

			if(this.isTienePermisosBarrio && this.provinciaConstantesFunciones.mostrarBarrioProvincia && !ProvinciaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Barrios");
				tableColumn.setHeaderValue("Barrios");
				tableColumn.setCellRenderer(new BarrioTableCell(provinciaConstantesFunciones.resaltarBarrioProvincia,this,this.provinciaConstantesFunciones.activarBarrioProvincia));
				tableColumn.setCellEditor(new BarrioTableCell(provinciaConstantesFunciones.resaltarBarrioProvincia,this,this.provinciaConstantesFunciones.activarBarrioProvincia));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosProvincia.addColumn(tableColumn);
			}

			if(this.isTienePermisosEmpleado && this.provinciaConstantesFunciones.mostrarEmpleadoProvincia && !ProvinciaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Empleados");
				tableColumn.setHeaderValue("Empleados");
				tableColumn.setCellRenderer(new EmpleadoTableCell(provinciaConstantesFunciones.resaltarEmpleadoProvincia,this,this.provinciaConstantesFunciones.activarEmpleadoProvincia));
				tableColumn.setCellEditor(new EmpleadoTableCell(provinciaConstantesFunciones.resaltarEmpleadoProvincia,this,this.provinciaConstantesFunciones.activarEmpleadoProvincia));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosProvincia.addColumn(tableColumn);
			}

			if(this.isTienePermisosDatoGeneralEmpleado && this.provinciaConstantesFunciones.mostrarDatoGeneralEmpleadoProvincia && !ProvinciaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Dato General Empleados");
				tableColumn.setHeaderValue("Dato General Empleados");
				tableColumn.setCellRenderer(new DatoGeneralEmpleadoTableCell(provinciaConstantesFunciones.resaltarDatoGeneralEmpleadoProvincia,this,this.provinciaConstantesFunciones.activarDatoGeneralEmpleadoProvincia));
				tableColumn.setCellEditor(new DatoGeneralEmpleadoTableCell(provinciaConstantesFunciones.resaltarDatoGeneralEmpleadoProvincia,this,this.provinciaConstantesFunciones.activarDatoGeneralEmpleadoProvincia));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosProvincia.addColumn(tableColumn);
			}

			if(this.isTienePermisosParametroCarteraDefecto && this.provinciaConstantesFunciones.mostrarParametroCarteraDefectoProvincia && !ProvinciaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Cartera Defectos");
				tableColumn.setHeaderValue("Parametro Cartera Defectos");
				tableColumn.setCellRenderer(new ParametroCarteraDefectoTableCell(provinciaConstantesFunciones.resaltarParametroCarteraDefectoProvincia,this,this.provinciaConstantesFunciones.activarParametroCarteraDefectoProvincia));
				tableColumn.setCellEditor(new ParametroCarteraDefectoTableCell(provinciaConstantesFunciones.resaltarParametroCarteraDefectoProvincia,this,this.provinciaConstantesFunciones.activarParametroCarteraDefectoProvincia));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosProvincia.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.provinciaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.provinciaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProvincia.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.provinciaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.provinciaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProvincia.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProvincia && this.isPermisoGuardarCambiosProvincia) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.provinciaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.provinciaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProvincia.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.provinciaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosProvincia.addColumn(tableColumn);
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
			
			this.jTableDatosProvincia.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProvincia && this.isPermisoGuardarCambiosProvincia) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.provinciaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProvincia && this.isPermisoGuardarCambiosProvincia) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProvincia.moveColumn(this.jTableDatosProvincia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProvincia.moveColumn(this.jTableDatosProvincia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.provinciaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosProvincia.moveColumn(this.jTableDatosProvincia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProvincia.moveColumn(this.jTableDatosProvincia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProvincia.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProvincia.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProvincia,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProvinciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProvincia.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProvincia.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProvinciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProvinciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProvincia.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProvincia.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProvincia.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=provinciaLogic.getProvincias().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=provincias.size()-1;
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
		//this.jTableDatosProvincia.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProvincia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProvincia();
			
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
				
				//this.isEsNuevoProvincia=false;
					
				ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
			
				if(this.provinciaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProvincia==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProvincia.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProvincia.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provincia =(Provincia) this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.provincia =(Provincia) this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.provincia.getsType().equals("DUPLICADO")
				   || this.provincia.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProvincia=true;
				
				} else {
					this.isEsNuevoProvincia=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.provinciaSessionBean.getEsGuardarRelacionado()) {
					if(this.provincia.getId()>=0 && !this.provincia.getIsNew()) {						
						this.isEsNuevoProvincia=false;
						
					} else {
						this.isEsNuevoProvincia=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProvincia(esRelaciones);						
				
				this.seleccionarProvincia(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.provincia.getId()<0) {
					this.isEsNuevoProvincia=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProvincia(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProvincia(evt,rowIndex);
				}	
				
				if(this.provinciaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Provincia: " + this.dDif); 
					}
				}								
				
				ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProvincia(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.provincia)) {
					if(this.provincia.getId()>0) {
						this.provincia.setIsDeleted(true);
						
						this.provinciasEliminados.add(this.provincia);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.provinciaLogic.getProvincias().remove(this.provincia);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.provincias.remove(this.provincia);				
					}
					
					
					((ProvinciaModel) this.jTableDatosProvincia.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProvincia(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProvincia(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProvincia) {
			
			if(this.jInternalFrameDetalleFormProvincia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProvincia.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProvincia.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provincia =(Provincia) this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.provincia =(Provincia) this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProvinciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProvincia(this.provincia);
				}
				
				//ARCHITECTURE
				try {
					

					//Pais
					if(!this.provinciaConstantesFunciones.cargarid_paisProvincia || this.provinciaConstantesFunciones.event_dependid_paisProvincia) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.provincia.getid_pais());
									//this.inicializarActualizarBindingProvincia(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(provincia.getPais()!=null) {
							this.paissForeignKey.add(provincia.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.provincia.getid_pais(),false,"Formulario");

					//Region
					if(!this.provinciaConstantesFunciones.cargarid_regionProvincia || this.provinciaConstantesFunciones.event_dependid_regionProvincia) {
						//this.cargarCombosRegionsForeignKeyLista(" where id="+this.provincia.getid_region());
									//this.inicializarActualizarBindingProvincia(false,false);
						this.regionsForeignKey=new ArrayList<Region>();

						if(provincia.getRegion()!=null) {
							this.regionsForeignKey.add(provincia.getRegion());
						}

						this.addItemDefectoCombosForeignKeyRegion();
						this.cargarCombosFrameRegionsForeignKey("Todos");
					}
					this.setActualRegionForeignKey(this.provincia.getid_region(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProvincia("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProvincia(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProvincia() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProvincia(Provincia provincia) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProvincia(provincia,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProvincia(Provincia provincia,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProvincia(provincia);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProvincia(provincia,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProvincia(provincia);
	}
	
	public void setVariablesObjetoActualToFormularioProvincia(Provincia provincia) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProvincia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProvincia.jLabelidProvincia.setText(provincia.getId().toString());
			this.jInternalFrameDetalleFormProvincia.jTextFieldcodigoProvincia.setText(provincia.getcodigo());
			this.jInternalFrameDetalleFormProvincia.jTextAreanombreProvincia.setText(provincia.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Provincia provinciaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,provinciaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Provincia provinciaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				provinciaLocal=this.provincia;
			} else {
				provinciaLocal=this.provinciaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(provinciaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProvincia(provinciaLocal,true);
					
					if(provinciaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(provinciaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.provinciaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(provinciaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProvincia(Provincia provincia,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProvincia(provincia,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProvincia(provincia);
	}
	
	public void setVariablesFormularioToObjetoActualProvincia(Provincia provincia,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProvincia(provincia,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProvincia(Provincia provincia,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProvincia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProvincia.jLabelidProvincia.getText()==null || this.jInternalFrameDetalleFormProvincia.jLabelidProvincia.getText()=="" || this.jInternalFrameDetalleFormProvincia.jLabelidProvincia.getText()=="Id") {
				this.jInternalFrameDetalleFormProvincia.jLabelidProvincia.setText("0");
			}

			if(conColumnasBase) {provincia.setId(Long.parseLong(this.jInternalFrameDetalleFormProvincia.jLabelidProvincia.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProvinciaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProvincia.jLabelIdProvincia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			provincia.setcodigo(this.jInternalFrameDetalleFormProvincia.jTextFieldcodigoProvincia.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProvinciaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProvincia.jLabelcodigoProvincia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			provincia.setnombre(this.jInternalFrameDetalleFormProvincia.jTextAreanombreProvincia.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProvinciaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProvincia.jLabelnombreProvincia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProvincia(Provincia provinciaBean,Provincia provincia,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && provinciaBean.getid_pais()!=null && !provinciaBean.getid_pais().equals(-1L))) {provincia.setid_pais(provinciaBean.getid_pais());}
			if(conDefault || (!conDefault && provinciaBean.getid_region()!=null && !provinciaBean.getid_region().equals(-1L))) {provincia.setid_region(provinciaBean.getid_region());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProvincia(Provincia provinciaOrigen,Provincia provincia,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && provinciaOrigen.getId()!=null && !provinciaOrigen.getId().equals(0L))) {provincia.setId(provinciaOrigen.getId());}}
			if(conDefault || (!conDefault && provinciaOrigen.getid_pais()!=null && !provinciaOrigen.getid_pais().equals(-1L))) {provincia.setid_pais(provinciaOrigen.getid_pais());}
			if(conDefault || (!conDefault && provinciaOrigen.getid_region()!=null && !provinciaOrigen.getid_region().equals(-1L))) {provincia.setid_region(provinciaOrigen.getid_region());}
			if(conDefault || (!conDefault && provinciaOrigen.getcodigo()!=null && !provinciaOrigen.getcodigo().equals(""))) {provincia.setcodigo(provinciaOrigen.getcodigo());}
			if(conDefault || (!conDefault && provinciaOrigen.getnombre()!=null && !provinciaOrigen.getnombre().equals(""))) {provincia.setnombre(provinciaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProvincia(Provincia provincia) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProvincia.jLabelidProvincia.setText(provincia.getId().toString());
			this.jInternalFrameDetalleFormProvincia.jTextFieldcodigoProvincia.setText(provincia.getcodigo());
			this.jInternalFrameDetalleFormProvincia.jTextAreanombreProvincia.setText(provincia.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProvincia(ProvinciaBean provinciaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProvincia.jLabelidProvincia.setText(provinciaBean.getId().toString());
			this.jInternalFrameDetalleFormProvincia.jTextFieldcodigoProvincia.setText(provinciaBean.getcodigo());
			this.jInternalFrameDetalleFormProvincia.jTextAreanombreProvincia.setText(provinciaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProvincia(ProvinciaParameterReturnGeneral provinciaReturnGeneral,ProvinciaBean provinciaBean,Boolean conDefault) throws Exception { 
		try {
			Provincia provinciaLocal=new Provincia();
			
			provinciaLocal=provinciaReturnGeneral.getProvincia();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && provinciaLocal.getId()!=null && !provinciaLocal.getId().equals(0L))) {provinciaBean.setId(provinciaLocal.getId());}}
			if(conDefault || (!conDefault && provinciaLocal.getid_pais()!=null && !provinciaLocal.getid_pais().equals(-1L))) {provinciaBean.setid_pais(provinciaLocal.getid_pais());}
			if(conDefault || (!conDefault && provinciaLocal.getid_region()!=null && !provinciaLocal.getid_region().equals(-1L))) {provinciaBean.setid_region(provinciaLocal.getid_region());}
			if(conDefault || (!conDefault && provinciaLocal.getcodigo()!=null && !provinciaLocal.getcodigo().equals(""))) {provinciaBean.setcodigo(provinciaLocal.getcodigo());}
			if(conDefault || (!conDefault && provinciaLocal.getnombre()!=null && !provinciaLocal.getnombre().equals(""))) {provinciaBean.setnombre(provinciaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProvinciaGenerico(Long idProvinciaSeleccionado,JComboBox jComboBoxProvincia,List<Provincia> provinciasLocal)throws Exception {
		try {
			Provincia  provinciaTemp=null;

			for(Provincia provinciaAux:provinciasLocal) {
				if(provinciaAux.getId()!=null && provinciaAux.getId().equals(idProvinciaSeleccionado)) {
					provinciaTemp=provinciaAux;
					break;
				}
			}

			jComboBoxProvincia.setSelectedItem(provinciaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProvinciaGenerico(JComboBox jComboBoxProvincia,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProvincia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProvincia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProvincia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProvincia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProvincia.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProvincia.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProvincia.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProvincia.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProvincia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProvincia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Barrio")) {
			jButtonBarrioActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Canton")) {
			jButtonCantonActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("DatoGeneralEmpleado")) {
			jButtonDatoGeneralEmpleadoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Empleado")) {
			jButtonEmpleadoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Cliente")) {
			jButtonClienteActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ParametroCarteraDefecto")) {
			jButtonParametroCarteraDefectoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Ciudad")) {
			jButtonCiudadActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			provincia=(Provincia) provinciaLogic.getProvincias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			provincia =(Provincia) provincias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!provincia.getIsNew() && !provincia.getIsChanged() && !provincia.getIsDeleted()) {
				sDescripcion=provincia.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=provincia.getpais_descripcion();
			}
		}

		if(sTipo.equals("Region")) {
			//sDescripcion=this.getActualRegionForeignKeyDescripcion((Long)value);
			if(!provincia.getIsNew() && !provincia.getIsChanged() && !provincia.getIsDeleted()) {
				sDescripcion=provincia.getregion_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=provincia.getregion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Provincia provinciaRow=new Provincia();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			provinciaRow=(Provincia) provinciaLogic.getProvincias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			provinciaRow=(Provincia) provincias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonBarrioActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Provincia provincia) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormProvincia==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.provincia = (Provincia)this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.provincia = (Provincia)this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(provincia!=null) {
						this.provincia = provincia;
					} else {
						this.provincia = new Provincia();
					}
				}

				if(this.isTienePermisosBarrio && this.permiteMantenimiento(this.provincia)) {
					BarrioBeanSwingJInternalFrame barrioBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFramePopup=new BarrioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						barrioBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFramePopup;
					} else {
						barrioBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame;
					}

					List<Provincia> provincias=new ArrayList<Provincia>();
					provincias.add(this.provincia);
					if(!esRelacionado) {
						//barrioBeanSwingJInternalFrame.barrioSessionBean.setConGuardarRelaciones(false);
						//barrioBeanSwingJInternalFrame.barrioSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					barrioBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormProvincia.cargarBarrioBeanSwingJInternalFrame(provincias,this.provincia,barrioBeanSwingJInternalFrame,/*conInicializar,*/barrioBeanSwingJInternalFrame.barrioSessionBean.getConGuardarRelaciones(),barrioBeanSwingJInternalFrame.barrioSessionBean.getEsGuardarRelacionado());
					barrioBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						barrioBeanSwingJInternalFrame.actualizarEstadoPanelsBarrio("no_relacionado");

						barrioBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(BarrioConstantesFunciones.ITAMANIOFILATABLA + (BarrioConstantesFunciones.ITAMANIOFILATABLA/2));

						barrioBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderProvincia=(TitledBorder)this.jScrollPanelDatosProvincia.getBorder();
						TitledBorder titledBorderBarrio=(TitledBorder)barrioBeanSwingJInternalFrame.jScrollPanelDatosBarrio.getBorder();

						titledBorderBarrio.setTitle(titledBorderProvincia.getTitle() + " -> Barrio");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,barrioBeanSwingJInternalFrame);
						}

						barrioBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(barrioBeanSwingJInternalFrame);

						barrioBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.provinciaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Barrio",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonCantonActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Provincia provincia) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormProvincia==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.provincia = (Provincia)this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.provincia = (Provincia)this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(provincia!=null) {
						this.provincia = provincia;
					} else {
						this.provincia = new Provincia();
					}
				}

				if(this.isTienePermisosCanton && this.permiteMantenimiento(this.provincia)) {
					CantonBeanSwingJInternalFrame cantonBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFramePopup=new CantonBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cantonBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFramePopup;
					} else {
						cantonBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame;
					}

					List<Provincia> provincias=new ArrayList<Provincia>();
					provincias.add(this.provincia);
					if(!esRelacionado) {
						//cantonBeanSwingJInternalFrame.cantonSessionBean.setConGuardarRelaciones(false);
						//cantonBeanSwingJInternalFrame.cantonSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cantonBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormProvincia.cargarCantonBeanSwingJInternalFrame(provincias,this.provincia,cantonBeanSwingJInternalFrame,/*conInicializar,*/cantonBeanSwingJInternalFrame.cantonSessionBean.getConGuardarRelaciones(),cantonBeanSwingJInternalFrame.cantonSessionBean.getEsGuardarRelacionado());
					cantonBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cantonBeanSwingJInternalFrame.actualizarEstadoPanelsCanton("no_relacionado");

						cantonBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CantonConstantesFunciones.ITAMANIOFILATABLA + (CantonConstantesFunciones.ITAMANIOFILATABLA/2));

						cantonBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderProvincia=(TitledBorder)this.jScrollPanelDatosProvincia.getBorder();
						TitledBorder titledBorderCanton=(TitledBorder)cantonBeanSwingJInternalFrame.jScrollPanelDatosCanton.getBorder();

						titledBorderCanton.setTitle(titledBorderProvincia.getTitle() + " -> Canton");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cantonBeanSwingJInternalFrame);
						}

						cantonBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cantonBeanSwingJInternalFrame);

						cantonBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.provinciaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Canton",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonDatoGeneralEmpleadoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Provincia provincia) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormProvincia==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.provincia = (Provincia)this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.provincia = (Provincia)this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(provincia!=null) {
						this.provincia = provincia;
					} else {
						this.provincia = new Provincia();
					}
				}

				if(this.isTienePermisosDatoGeneralEmpleado && this.permiteMantenimiento(this.provincia)) {
					DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFramePopup=new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						datogeneralempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFramePopup;
					} else {
						datogeneralempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame;
					}

					List<Provincia> provincias=new ArrayList<Provincia>();
					provincias.add(this.provincia);
					if(!esRelacionado) {
						//datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setConGuardarRelaciones(false);
						//datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					datogeneralempleadoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormProvincia.cargarDatoGeneralEmpleadoBeanSwingJInternalFrame(provincias,this.provincia,datogeneralempleadoBeanSwingJInternalFrame,/*conInicializar,*/datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getConGuardarRelaciones(),datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getEsGuardarRelacionado());
					datogeneralempleadoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						datogeneralempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsDatoGeneralEmpleado("no_relacionado");

						datogeneralempleadoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DatoGeneralEmpleadoConstantesFunciones.ITAMANIOFILATABLA + (DatoGeneralEmpleadoConstantesFunciones.ITAMANIOFILATABLA/2));

						datogeneralempleadoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderProvincia=(TitledBorder)this.jScrollPanelDatosProvincia.getBorder();
						TitledBorder titledBorderDatoGeneralEmpleado=(TitledBorder)datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.getBorder();

						titledBorderDatoGeneralEmpleado.setTitle(titledBorderProvincia.getTitle() + " -> Dato General Empleado");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,datogeneralempleadoBeanSwingJInternalFrame);
						}

						datogeneralempleadoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(datogeneralempleadoBeanSwingJInternalFrame);

						datogeneralempleadoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.provinciaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Dato General Empleado",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonEmpleadoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Provincia provincia) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormProvincia==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.provincia = (Provincia)this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.provincia = (Provincia)this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(provincia!=null) {
						this.provincia = provincia;
					} else {
						this.provincia = new Provincia();
					}
				}

				if(this.isTienePermisosEmpleado && this.permiteMantenimiento(this.provincia)) {
					EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFramePopup=new EmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						empleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFramePopup;
					} else {
						empleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame;
					}

					List<Provincia> provincias=new ArrayList<Provincia>();
					provincias.add(this.provincia);
					if(!esRelacionado) {
						//empleadoBeanSwingJInternalFrame.empleadoSessionBean.setConGuardarRelaciones(false);
						//empleadoBeanSwingJInternalFrame.empleadoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					empleadoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormProvincia.cargarEmpleadoBeanSwingJInternalFrame(provincias,this.provincia,empleadoBeanSwingJInternalFrame,/*conInicializar,*/empleadoBeanSwingJInternalFrame.empleadoSessionBean.getConGuardarRelaciones(),empleadoBeanSwingJInternalFrame.empleadoSessionBean.getEsGuardarRelacionado());
					empleadoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						empleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleado("no_relacionado");

						empleadoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(EmpleadoConstantesFunciones.ITAMANIOFILATABLA + (EmpleadoConstantesFunciones.ITAMANIOFILATABLA/2));

						empleadoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderProvincia=(TitledBorder)this.jScrollPanelDatosProvincia.getBorder();
						TitledBorder titledBorderEmpleado=(TitledBorder)empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

						titledBorderEmpleado.setTitle(titledBorderProvincia.getTitle() + " -> Empleado");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,empleadoBeanSwingJInternalFrame);
						}

						empleadoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(empleadoBeanSwingJInternalFrame);

						empleadoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.provinciaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Empleado",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Provincia provincia) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormProvincia==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.provincia = (Provincia)this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.provincia = (Provincia)this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(provincia!=null) {
						this.provincia = provincia;
					} else {
						this.provincia = new Provincia();
					}
				}

				if(this.isTienePermisosCliente && this.permiteMantenimiento(this.provincia)) {
					ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFramePopup;
					} else {
						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame;
					}

					List<Provincia> provincias=new ArrayList<Provincia>();
					provincias.add(this.provincia);
					if(!esRelacionado) {
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setConGuardarRelaciones(false);
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormProvincia.cargarClienteBeanSwingJInternalFrame(provincias,this.provincia,clienteBeanSwingJInternalFrame,/*conInicializar,*/clienteBeanSwingJInternalFrame.clienteSessionBean.getConGuardarRelaciones(),clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado());
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");

						clienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ClienteConstantesFunciones.ITAMANIOFILATABLA + (ClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						clienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderProvincia=(TitledBorder)this.jScrollPanelDatosProvincia.getBorder();
						TitledBorder titledBorderCliente=(TitledBorder)clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

						titledBorderCliente.setTitle(titledBorderProvincia.getTitle() + " -> Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,clienteBeanSwingJInternalFrame);
						}

						clienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(clienteBeanSwingJInternalFrame);

						clienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.provinciaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonParametroCarteraDefectoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Provincia provincia) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormProvincia==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.provincia = (Provincia)this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.provincia = (Provincia)this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(provincia!=null) {
						this.provincia = provincia;
					} else {
						this.provincia = new Provincia();
					}
				}

				if(this.isTienePermisosParametroCarteraDefecto && this.permiteMantenimiento(this.provincia)) {
					ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFramePopup=new ParametroCarteraDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametrocarteradefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFramePopup;
					} else {
						parametrocarteradefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame;
					}

					List<Provincia> provincias=new ArrayList<Provincia>();
					provincias.add(this.provincia);
					if(!esRelacionado) {
						//parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setConGuardarRelaciones(false);
						//parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametrocarteradefectoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormProvincia.cargarParametroCarteraDefectoBeanSwingJInternalFrame(provincias,this.provincia,parametrocarteradefectoBeanSwingJInternalFrame,/*conInicializar,*/parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getConGuardarRelaciones(),parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getEsGuardarRelacionado());
					parametrocarteradefectoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCarteraDefecto("no_relacionado");

						parametrocarteradefectoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroCarteraDefectoConstantesFunciones.ITAMANIOFILATABLA + (ParametroCarteraDefectoConstantesFunciones.ITAMANIOFILATABLA/2));

						parametrocarteradefectoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderProvincia=(TitledBorder)this.jScrollPanelDatosProvincia.getBorder();
						TitledBorder titledBorderParametroCarteraDefecto=(TitledBorder)parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.getBorder();

						titledBorderParametroCarteraDefecto.setTitle(titledBorderProvincia.getTitle() + " -> Parametro Cartera Defecto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametrocarteradefectoBeanSwingJInternalFrame);
						}

						parametrocarteradefectoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametrocarteradefectoBeanSwingJInternalFrame);

						parametrocarteradefectoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.provinciaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Cartera Defecto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonCiudadActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Provincia provincia) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormProvincia==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.provincia = (Provincia)this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.provincia = (Provincia)this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(provincia!=null) {
						this.provincia = provincia;
					} else {
						this.provincia = new Provincia();
					}
				}

				if(this.isTienePermisosCiudad && this.permiteMantenimiento(this.provincia)) {
					CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFramePopup=new CiudadBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						ciudadBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFramePopup;
					} else {
						ciudadBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame;
					}

					List<Provincia> provincias=new ArrayList<Provincia>();
					provincias.add(this.provincia);
					if(!esRelacionado) {
						//ciudadBeanSwingJInternalFrame.ciudadSessionBean.setConGuardarRelaciones(false);
						//ciudadBeanSwingJInternalFrame.ciudadSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					ciudadBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormProvincia.cargarCiudadBeanSwingJInternalFrame(provincias,this.provincia,ciudadBeanSwingJInternalFrame,/*conInicializar,*/ciudadBeanSwingJInternalFrame.ciudadSessionBean.getConGuardarRelaciones(),ciudadBeanSwingJInternalFrame.ciudadSessionBean.getEsGuardarRelacionado());
					ciudadBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						ciudadBeanSwingJInternalFrame.actualizarEstadoPanelsCiudad("no_relacionado");

						ciudadBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CiudadConstantesFunciones.ITAMANIOFILATABLA + (CiudadConstantesFunciones.ITAMANIOFILATABLA/2));

						ciudadBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderProvincia=(TitledBorder)this.jScrollPanelDatosProvincia.getBorder();
						TitledBorder titledBorderCiudad=(TitledBorder)ciudadBeanSwingJInternalFrame.jScrollPanelDatosCiudad.getBorder();

						titledBorderCiudad.setTitle(titledBorderProvincia.getTitle() + " -> Ciudad");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,ciudadBeanSwingJInternalFrame);
						}

						ciudadBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(ciudadBeanSwingJInternalFrame);

						ciudadBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.provinciaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Ciudad",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProvincia(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProvincia.setVisible((this.isVisibilidadCeldaNuevoProvincia && this.isPermisoNuevoProvincia));			
			this.jButtonDuplicarProvincia.setVisible((this.isVisibilidadCeldaDuplicarProvincia && this.isPermisoDuplicarProvincia));			
			this.jButtonCopiarProvincia.setVisible((this.isVisibilidadCeldaCopiarProvincia && this.isPermisoCopiarProvincia));
			this.jButtonVerFormProvincia.setVisible((this.isVisibilidadCeldaVerFormProvincia && this.isPermisoVerFormProvincia));
			
			this.jButtonAbrirOrderByProvincia.setVisible((this.isVisibilidadCeldaOrdenProvincia && this.isPermisoOrdenProvincia));			
			
			this.jButtonNuevoRelacionesProvincia.setVisible((this.isVisibilidadCeldaNuevoRelacionesProvincia && this.isPermisoNuevoProvincia));			
			this.jButtonNuevoGuardarCambiosProvincia.setVisible((this.isVisibilidadCeldaNuevoProvincia && this.isPermisoNuevoProvincia && this.isPermisoGuardarCambiosProvincia));
			
			if(this.jInternalFrameDetalleFormProvincia!=null) {
			this.jInternalFrameDetalleFormProvincia.jButtonModificarProvincia.setVisible((this.isVisibilidadCeldaModificarProvincia && this.isPermisoActualizarProvincia));	
			this.jInternalFrameDetalleFormProvincia.jButtonActualizarProvincia.setVisible((this.isVisibilidadCeldaActualizarProvincia && this.isPermisoActualizarProvincia));	
			this.jInternalFrameDetalleFormProvincia.jButtonEliminarProvincia.setVisible((this.isVisibilidadCeldaEliminarProvincia && this.isPermisoEliminarProvincia));
			this.jInternalFrameDetalleFormProvincia.jButtonCancelarProvincia.setVisible(this.isVisibilidadCeldaCancelarProvincia);							
			this.jInternalFrameDetalleFormProvincia.jButtonGuardarCambiosProvincia.setVisible((this.isVisibilidadCeldaGuardarProvincia && this.isPermisoGuardarCambiosProvincia));			
			
			}
						
			this.jButtonGuardarCambiosTablaProvincia.setVisible((this.isVisibilidadCeldaGuardarCambiosProvincia && this.isPermisoGuardarCambiosProvincia));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProvincia.setVisible((this.isVisibilidadCeldaNuevoProvincia && this.isPermisoNuevoProvincia));						
			this.jButtonDuplicarToolBarProvincia.setVisible((this.isVisibilidadCeldaDuplicarProvincia && this.isPermisoDuplicarProvincia));						
			this.jButtonCopiarToolBarProvincia.setVisible((this.isVisibilidadCeldaCopiarProvincia && this.isPermisoCopiarProvincia));			
			this.jButtonVerFormToolBarProvincia.setVisible((this.isVisibilidadCeldaVerFormProvincia && this.isPermisoVerFormProvincia));			
			this.jButtonAbrirOrderByToolBarProvincia.setVisible((this.isVisibilidadCeldaOrdenProvincia && this.isPermisoOrdenProvincia));
			this.jButtonNuevoRelacionesToolBarProvincia.setVisible((this.isVisibilidadCeldaNuevoRelacionesProvincia && this.isPermisoNuevoProvincia));			
			this.jButtonNuevoGuardarCambiosToolBarProvincia.setVisible((this.isVisibilidadCeldaNuevoProvincia && this.isPermisoNuevoProvincia && this.isPermisoGuardarCambiosProvincia));			
			
			if(this.jInternalFrameDetalleFormProvincia!=null) {
			this.jInternalFrameDetalleFormProvincia.jButtonModificarToolBarProvincia.setVisible((this.isVisibilidadCeldaModificarProvincia && this.isPermisoActualizarProvincia));	
			this.jInternalFrameDetalleFormProvincia.jButtonActualizarToolBarProvincia.setVisible((this.isVisibilidadCeldaActualizarProvincia  && this.isPermisoActualizarProvincia));	
			this.jInternalFrameDetalleFormProvincia.jButtonEliminarToolBarProvincia.setVisible((this.isVisibilidadCeldaEliminarProvincia && this.isPermisoEliminarProvincia));
			this.jInternalFrameDetalleFormProvincia.jButtonCancelarToolBarProvincia.setVisible(this.isVisibilidadCeldaCancelarProvincia);				
			this.jInternalFrameDetalleFormProvincia.jButtonGuardarCambiosToolBarProvincia.setVisible((this.isVisibilidadCeldaGuardarProvincia && this.isPermisoGuardarCambiosProvincia));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProvincia.setVisible((this.isVisibilidadCeldaGuardarCambiosProvincia && this.isPermisoGuardarCambiosProvincia));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProvincia.setVisible((this.isVisibilidadCeldaNuevoProvincia && this.isPermisoNuevoProvincia));			
			this.jMenuItemDuplicarProvincia.setVisible((this.isVisibilidadCeldaDuplicarProvincia && this.isPermisoDuplicarProvincia));			
			this.jMenuItemCopiarProvincia.setVisible((this.isVisibilidadCeldaCopiarProvincia && this.isPermisoCopiarProvincia));			
			this.jMenuItemVerFormProvincia.setVisible((this.isVisibilidadCeldaVerFormProvincia && this.isPermisoVerFormProvincia));			
			this.jMenuItemAbrirOrderByProvincia.setVisible((this.isVisibilidadCeldaOrdenProvincia && this.isPermisoOrdenProvincia));			
			//this.jMenuItemMostrarOcultarProvincia.setVisible((this.isVisibilidadCeldaOrdenProvincia && this.isPermisoOrdenProvincia));
			this.jMenuItemDetalleAbrirOrderByProvincia.setVisible((this.isVisibilidadCeldaOrdenProvincia && this.isPermisoOrdenProvincia));			
			//this.jMenuItemDetalleMostrarOcultarProvincia.setVisible((this.isVisibilidadCeldaOrdenProvincia && this.isPermisoOrdenProvincia));			
			this.jMenuItemNuevoRelacionesProvincia.setVisible((this.isVisibilidadCeldaNuevoRelacionesProvincia && this.isPermisoNuevoProvincia));			
			this.jMenuItemNuevoGuardarCambiosProvincia.setVisible((this.isVisibilidadCeldaNuevoProvincia && this.isPermisoNuevoProvincia && this.isPermisoGuardarCambiosProvincia));									
			
			if(this.jInternalFrameDetalleFormProvincia!=null) {
			this.jInternalFrameDetalleFormProvincia.jMenuItemModificarProvincia.setVisible((this.isVisibilidadCeldaModificarProvincia && this.isPermisoActualizarProvincia));	
			this.jInternalFrameDetalleFormProvincia.jMenuItemActualizarProvincia.setVisible((this.isVisibilidadCeldaActualizarProvincia && this.isPermisoActualizarProvincia));	
			this.jInternalFrameDetalleFormProvincia.jMenuItemEliminarProvincia.setVisible((this.isVisibilidadCeldaEliminarProvincia && this.isPermisoEliminarProvincia));
			this.jInternalFrameDetalleFormProvincia.jMenuItemCancelarProvincia.setVisible(this.isVisibilidadCeldaCancelarProvincia);				
			}
			
			this.jMenuItemGuardarCambiosProvincia.setVisible((this.isVisibilidadCeldaGuardarProvincia && this.isPermisoGuardarCambiosProvincia));						
			this.jMenuItemGuardarCambiosTablaProvincia.setVisible((this.isVisibilidadCeldaGuardarCambiosProvincia && this.isPermisoGuardarCambiosProvincia));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProvincia=this.jButtonNuevoProvincia.isVisible();
			this.isVisibilidadCeldaDuplicarProvincia=this.jButtonDuplicarProvincia.isVisible();
			this.isVisibilidadCeldaCopiarProvincia=this.jButtonCopiarProvincia.isVisible();
			this.isVisibilidadCeldaVerFormProvincia=this.jButtonVerFormProvincia.isVisible();
			
			this.isVisibilidadCeldaOrdenProvincia=this.jButtonAbrirOrderByProvincia.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProvincia=this.jButtonNuevoRelacionesProvincia.isVisible();
			this.isVisibilidadCeldaModificarProvincia=this.jButtonModificarProvincia.isVisible();
			
			if(this.jInternalFrameDetalleFormProvincia!=null) {
			this.isVisibilidadCeldaActualizarProvincia=this.jInternalFrameDetalleFormProvincia.jButtonActualizarProvincia.isVisible();
			this.isVisibilidadCeldaEliminarProvincia=this.jInternalFrameDetalleFormProvincia.jButtonEliminarProvincia.isVisible();
			this.isVisibilidadCeldaCancelarProvincia=this.jInternalFrameDetalleFormProvincia.jButtonCancelarProvincia.isVisible();
			this.isVisibilidadCeldaGuardarProvincia=this.jInternalFrameDetalleFormProvincia.jButtonGuardarCambiosProvincia.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProvincia=this.jButtonGuardarCambiosTablaProvincia.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProvincia=this.jButtonNuevoToolBarProvincia.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProvincia=this.jButtonNuevoRelacionesToolBarProvincia.isVisible();
			
			if(this.jInternalFrameDetalleFormProvincia!=null) {
			this.isVisibilidadCeldaModificarProvincia=this.jInternalFrameDetalleFormProvincia.jButtonModificarToolBarProvincia.isVisible();
			this.isVisibilidadCeldaActualizarProvincia=this.jInternalFrameDetalleFormProvincia.jButtonActualizarToolBarProvincia.isVisible();
			this.isVisibilidadCeldaEliminarProvincia=this.jInternalFrameDetalleFormProvincia.jButtonEliminarToolBarProvincia.isVisible();
			this.isVisibilidadCeldaCancelarProvincia=this.jInternalFrameDetalleFormProvincia.jButtonCancelarToolBarProvincia.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProvincia=this.jButtonGuardarCambiosToolBarProvincia.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProvincia=this.jButtonGuardarCambiosTablaToolBarProvincia.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProvincia=this.jMenuItemNuevoProvincia.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProvincia=this.jMenuItemNuevoRelacionesProvincia.isVisible();
			
			if(this.jInternalFrameDetalleFormProvincia!=null) {
			this.isVisibilidadCeldaModificarProvincia=this.jInternalFrameDetalleFormProvincia.jMenuItemModificarProvincia.isVisible();
			this.isVisibilidadCeldaActualizarProvincia=this.jInternalFrameDetalleFormProvincia.jMenuItemActualizarProvincia.isVisible();
			this.isVisibilidadCeldaEliminarProvincia=this.jInternalFrameDetalleFormProvincia.jMenuItemEliminarProvincia.isVisible();
			this.isVisibilidadCeldaCancelarProvincia=this.jInternalFrameDetalleFormProvincia.jMenuItemCancelarProvincia.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProvincia=this.jMenuItemGuardarCambiosProvincia.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProvincia=this.jMenuItemGuardarCambiosTablaProvincia.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProvincia(Boolean esInicializar) {
		if(ProvinciaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.provinciaSessionBean.getConGuardarRelaciones()) {
				//if(this.provinciaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProvincia();
			}
			
			this.inicializarActualizarBindingBotonesManualProvincia(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProvincia() {
		this.jButtonNuevoProvincia.setVisible(this.isPermisoNuevoProvincia);			
		this.jButtonDuplicarProvincia.setVisible(this.isPermisoDuplicarProvincia);			
		this.jButtonCopiarProvincia.setVisible(this.isPermisoCopiarProvincia);			
		this.jButtonVerFormProvincia.setVisible(this.isPermisoVerFormProvincia);			
		
		this.jButtonAbrirOrderByProvincia.setVisible(this.isPermisoOrdenProvincia);					
		
		this.jButtonNuevoRelacionesProvincia.setVisible(this.isPermisoNuevoProvincia);			
		
		if(this.jInternalFrameDetalleFormProvincia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProvincia.jButtonModificarProvincia.setVisible(this.isPermisoActualizarProvincia);	
			this.jInternalFrameDetalleFormProvincia.jButtonActualizarProvincia.setVisible(this.isPermisoActualizarProvincia);	
			this.jInternalFrameDetalleFormProvincia.jButtonEliminarProvincia.setVisible(this.isPermisoEliminarProvincia);
			this.jInternalFrameDetalleFormProvincia.jButtonCancelarProvincia.setVisible(this.isVisibilidadCeldaCancelarProvincia);						
			this.jInternalFrameDetalleFormProvincia.jButtonGuardarCambiosProvincia.setVisible(this.isPermisoGuardarCambiosProvincia);							
		}
		
		this.jButtonGuardarCambiosTablaProvincia.setVisible(this.isPermisoActualizarProvincia);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProvincia() {
		this.jInternalFrameDetalleFormProvincia.jButtonModificarProvincia.setVisible(this.isPermisoActualizarProvincia);	
		this.jInternalFrameDetalleFormProvincia.jButtonActualizarProvincia.setVisible(this.isPermisoActualizarProvincia);	
		this.jInternalFrameDetalleFormProvincia.jButtonEliminarProvincia.setVisible(this.isPermisoEliminarProvincia);
		this.jInternalFrameDetalleFormProvincia.jButtonCancelarProvincia.setVisible(this.isVisibilidadCeldaCancelarProvincia);							
		this.jInternalFrameDetalleFormProvincia.jButtonGuardarCambiosProvincia.setVisible((this.isVisibilidadCeldaGuardarProvincia && this.isPermisoGuardarCambiosProvincia));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProvincia() {
		if(ProvinciaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProvincia();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProvincia() {
	}
	
	public void jTableDatosProvinciaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProvincia(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProvinciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProvincia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProvincia(this.getprovincia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvincia(this.provincia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.provincia =(Provincia) this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.provincia =(Provincia) this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.provincia==null) {
						this.provincia = new Provincia();
					}

					this.setVariablesFormularioToObjetoActualProvincia(this.provincia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvincia(this.provincia);
				}

				if(this.provincia.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.provincia.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProvincia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisProvinciaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebProvincia(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProvincia.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProvincia.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProvincia.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provincia =(Provincia) this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.provincia =(Provincia) this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProvincia(this.getprovincia(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProvincia(this.provincia);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.provinciaLogic.getConnexion());

				if(this.provincia.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.provincia.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProvincia=(TitledBorder)this.jScrollPanelDatosProvincia.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderProvincia.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisProvinciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProvincia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProvincia(this.getprovincia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvincia(this.provincia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.provincia =(Provincia) this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.provincia =(Provincia) this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.provincia==null) {
						this.provincia = new Provincia();
					}

					this.setVariablesFormularioToObjetoActualProvincia(this.provincia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvincia(this.provincia);
				}

				if(this.provincia.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.provincia.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProvincia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_regionProvinciaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoregion=true;

			idTienePermisoregion=this.tienePermisosUsuarioEnPaginaWebProvincia(RegionConstantesFunciones.CLASSNAME);

			if(idTienePermisoregion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProvincia.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProvincia.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProvincia.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provincia =(Provincia) this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.provincia =(Provincia) this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProvincia(this.getprovincia(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProvincia(this.provincia);

				this.regionBeanSwingJInternalFrame=new RegionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.regionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.regionBeanSwingJInternalFrame.getRegionLogic().setConnexion(this.provinciaLogic.getConnexion());

				if(this.provincia.getid_region()!=null) {
					this.regionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.regionBeanSwingJInternalFrame.setIdActual(this.provincia.getid_region());
					this.regionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.regionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.regionBeanSwingJInternalFrame.inicializarActualizarBindingTablaRegion();
				}

				JInternalFrameBase jinternalFrame =this.regionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProvincia=(TitledBorder)this.jScrollPanelDatosProvincia.getBorder();
				TitledBorder titledBorderregion=(TitledBorder)this.regionBeanSwingJInternalFrame.jScrollPanelDatosRegion.getBorder();

				titledBorderregion.setTitle(titledBorderProvincia.getTitle() + " -> Region");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_regionProvinciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProvincia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProvincia(this.getprovincia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvincia(this.provincia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.provincia =(Provincia) this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.provincia =(Provincia) this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.provincia==null) {
						this.provincia = new Provincia();
					}

					this.setVariablesFormularioToObjetoActualProvincia(this.provincia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvincia(this.provincia);
				}

				if(this.provincia.getid_region()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_region = "+this.provincia.getid_region().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProvincia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoProvinciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProvincia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProvincia(this.getprovincia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvincia(this.provincia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.provincia =(Provincia) this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.provincia =(Provincia) this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.provincia==null) {
						this.provincia = new Provincia();
					}

					this.setVariablesFormularioToObjetoActualProvincia(this.provincia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvincia(this.provincia);
				}

				if(this.provincia.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.provincia.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProvincia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreProvinciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProvincia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProvincia(this.getprovincia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvincia(this.provincia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.provincia =(Provincia) this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.provincia =(Provincia) this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.provincia==null) {
						this.provincia = new Provincia();
					}

					this.setVariablesFormularioToObjetoActualProvincia(this.provincia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProvincia(this.provincia);
				}

				if(this.provincia.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.provincia.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProvincia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorIdPaisPorNombreProvinciaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProvincia(false,false);

			this.getProvinciasBusquedaPorIdPaisPorNombre();

			this.inicializarActualizarBindingProvincia(false);

			//if(ProvinciaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProvincia(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPaisProvinciaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProvincia(false,false);

			this.getProvinciasFK_IdPais();

			this.inicializarActualizarBindingProvincia(false);

			//if(ProvinciaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProvincia(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdRegionProvinciaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProvincia(false,false);

			this.getProvinciasFK_IdRegion();

			this.inicializarActualizarBindingProvincia(false);

			//if(ProvinciaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProvincia(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.provinciaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProvincia() {
		if(this.jInternalFrameDetalleFormProvincia!=null) {
		

		if(this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormProvincia!=null) {
			this.jInternalFrameDetalleFormProvincia.setVisible(false);	    			
			this.jInternalFrameDetalleFormProvincia.dispose();
			this.jInternalFrameDetalleFormProvincia=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProvincia!=null) {
			this.jInternalFrameReporteDinamicoProvincia.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProvincia.dispose();
			this.jInternalFrameReporteDinamicoProvincia=null;
		}
		
		if(this.jInternalFrameImportacionProvincia!=null) {
			this.jInternalFrameImportacionProvincia.setVisible(false);	    			
			this.jInternalFrameImportacionProvincia.dispose();
			this.jInternalFrameImportacionProvincia=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProvincia();
			
			ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
			
			
			if(sTipo.equals("NuevoProvincia")) {
				jButtonNuevoProvinciaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProvincia")) {
				jButtonDuplicarProvinciaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProvincia")) {
				jButtonCopiarProvinciaActionPerformed(evt);
			} else if(sTipo.equals("VerFormProvincia")) {
				jButtonVerFormProvinciaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProvincia")) {
				jButtonNuevoProvinciaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProvincia")) {
				jButtonDuplicarProvinciaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProvincia")) {
				jButtonNuevoProvinciaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProvincia")) {
				jButtonDuplicarProvinciaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProvincia")) {
				jButtonNuevoProvinciaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProvincia")) {
				jButtonNuevoProvinciaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProvincia")) {
				jButtonNuevoProvinciaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProvincia")) {
				jButtonModificarProvinciaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProvincia")) {
				jButtonModificarProvinciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProvincia")) {
				jButtonModificarProvinciaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProvincia")) {
				jButtonActualizarProvinciaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProvincia")) {
				jButtonActualizarProvinciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProvincia")) {
				jButtonActualizarProvinciaActionPerformed(evt);
			} else if(sTipo.equals("EliminarProvincia")) {
				jButtonEliminarProvinciaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProvincia")) {
				jButtonEliminarProvinciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProvincia")) {
				jButtonEliminarProvinciaActionPerformed(evt);
			} else if(sTipo.equals("CancelarProvincia")) {
				jButtonCancelarProvinciaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProvincia")) {
				jButtonCancelarProvinciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProvincia")) {
				jButtonCancelarProvinciaActionPerformed(evt);
			} else if(sTipo.equals("CerrarProvincia")) {
				jButtonCerrarProvinciaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProvincia")) {
				jButtonCerrarProvinciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProvincia")) {
				jButtonCerrarProvinciaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProvincia")) {
				jButtonMostrarOcultarProvinciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProvincia")) {
				jButtonCancelarProvinciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProvincia")) {
				jButtonGuardarCambiosProvinciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProvincia")) {
				jButtonGuardarCambiosProvinciaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProvincia")) {
				jButtonCopiarProvinciaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProvincia")) {
				jButtonVerFormProvinciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProvincia")) {
				jButtonGuardarCambiosProvinciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProvincia")) {
				jButtonCopiarProvinciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProvincia")) {
				jButtonVerFormProvinciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProvincia")) {
				jButtonGuardarCambiosProvinciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProvincia")) {
				jButtonGuardarCambiosProvinciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProvincia")) {
				jButtonGuardarCambiosProvinciaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProvincia")) {
				jButtonRecargarInformacionProvinciaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProvincia")) {
				jButtonRecargarInformacionProvinciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProvincia")) {
				jButtonRecargarInformacionProvinciaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProvincia")) {
				jButtonAnterioresProvinciaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProvincia")) {
				jButtonAnterioresProvinciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProvincia")) {
				jButtonAnterioresProvinciaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProvincia")) {
				jButtonSiguientesProvinciaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProvincia")) {
				jButtonSiguientesProvinciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProvincia")) {
				jButtonSiguientesProvinciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProvincia") || sTipo.equals("MenuItemDetalleAbrirOrderByProvincia")) {
				jButtonAbrirOrderByProvinciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProvincia") || sTipo.equals("MenuItemDetalleMostrarOcultarProvincia")) {
				jButtonMostrarOcultarProvinciaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProvincia")) {
				jButtonNuevoGuardarCambiosProvinciaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProvincia")) {
				jButtonNuevoGuardarCambiosProvinciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProvincia")) {
				jButtonNuevoGuardarCambiosProvinciaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProvincia")) {
				jButtonCerrarReporteDinamicoProvinciaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProvincia")) {
				jButtonGenerarReporteDinamicoProvinciaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProvincia")) {
				
				jButtonGenerarExcelReporteDinamicoProvinciaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProvincia")) {
				jButtonCerrarImportacionProvinciaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProvincia")) {
				
				jButtonGenerarImportacionProvinciaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProvincia")) {
				
				jButtonAbrirImportacionProvinciaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProvincia")) {
				jComboBoxTiposAccionesProvinciaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProvincia")) {
				jComboBoxTiposRelacionesProvinciaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProvincia")) {
				jComboBoxTiposAccionesProvinciaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProvincia")) {
				
				jComboBoxTiposSeleccionarProvinciaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProvincia")) {
				jTextFieldValorCampoGeneralProvinciaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProvincia")) {
				jButtonAbrirOrderByProvinciaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProvincia")) {
				jButtonAbrirOrderByProvinciaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProvincia")) {
				jButtonCerrarOrderByProvinciaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProvinciaBusqueda")) {
				this.jButtonidProvinciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisProvinciaUpdate")) {
				this.jButtonid_paisProvinciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisProvinciaBusqueda")) {
				this.jButtonid_paisProvinciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_regionProvinciaUpdate")) {
				this.jButtonid_regionProvinciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_regionProvinciaBusqueda")) {
				this.jButtonid_regionProvinciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProvinciaBusqueda")) {
				this.jButtoncodigoProvinciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreProvinciaBusqueda")) {
				this.jButtonnombreProvinciaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorIdPaisPorNombreProvincia")) {
				this.jButtonBusquedaPorIdPaisPorNombreProvinciaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPaisProvincia")) {
				this.jButtonFK_IdPaisProvinciaActionPerformed(evt);
			}
			
			;
			
			
			ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProvincia();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProvinciaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.provincia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.provincia);
				
				ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
				
				


				
				ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Provincia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Provincia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Provincia provinciaLocal=null;
			
			if(!this.getEsControlTabla()) {
				provinciaLocal=this.provincia;
			} else {
				provinciaLocal=this.provinciaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.provincia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.provincia);
				
				ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
							
				
				


				
				ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Provincia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Provincia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProvinciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProvincia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaAnterior =(Provincia) this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.provinciaAnterior =(Provincia) this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
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
			
			ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
			
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
			
			


			
			ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProvinciaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.provincia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.provincia);
				
				ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
								
						
				


				
				ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Provincia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Provincia.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.provincia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.provincia);
				
				ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
								
				
				


				
				ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Provincia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Provincia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProvinciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProvincia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaAnterior =(Provincia) this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.provinciaAnterior =(Provincia) this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.provincia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.provincia);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProvinciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProvincia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaAnterior =(Provincia) this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.provinciaAnterior =(Provincia) this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProvinciaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.provincia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.provincia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.provincia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.provincia);
				
				ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
							
				
				


				
				ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Provincia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Provincia.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProvinciaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProvincia.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.provinciaAnterior =(Provincia) this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.provinciaAnterior =(Provincia) this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
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
			
			ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
			
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
			
			


			
			ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProvinciaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.provincia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.provincia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.provincia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.provincia);
				
				ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
								
				
				


				
				ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Provincia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Provincia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProvinciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProvincia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaAnterior =(Provincia) this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.provinciaAnterior =(Provincia) this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProvinciaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.provincia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.provincia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProvinciaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.provincia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.provincia);
				
				ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProvincia")) {
					jCheckBoxSeleccionarTodosProvinciaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProvincia")) {
					jCheckBoxSeleccionadosProvinciaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProvincia")) {
					
				}
				
				


				
				
				ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Provincia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Provincia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.provincia);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.provincia);
				
				ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
												
				
				


				
				
				ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Provincia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Provincia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProvinciaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProvincia.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.provinciaAnterior =(Provincia) this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.provinciaAnterior =(Provincia) this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProvinciaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.provincia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.provincia);
				
				ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
				
				
				ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
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
			
			ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
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
			
			


			if(sTipo.equals("id_paisProvincia")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProvincia.jComboBoxid_paisProvincia;
				}

				if(this.provinciaSessionBean.getConGuardarRelaciones()) {
					//classes=ProvinciaConstantesFunciones.getClassesRelationshipsOfProvincia(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormProvincia(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia,"BusquedaPorIdPaisPorNombre");
				//recargarFormProvinciaPais(jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia,"BusquedaPorIdPaisPorNombre");
			}
			 else if(sTipo.equals("jComboBoxid_paisFK_IdPaisProvincia")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisFK_IdPaisProvincia,"FK_IdPais");
				//recargarFormProvinciaPais(jComboBoxid_paisFK_IdPaisProvincia,"FK_IdPais");
			}
			
			ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProvinciaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.provincia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.provincia);
				
				ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_paisProvincia")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProvincia.jComboBoxid_paisProvincia;
				}

				if(this.provinciaSessionBean.getConGuardarRelaciones()) {
					//classes=ProvinciaConstantesFunciones.getClassesRelationshipsOfProvincia(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormProvincia(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia,"BusquedaPorIdPaisPorNombre");
				//recargarFormProvinciaPais(jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia,"BusquedaPorIdPaisPorNombre");
			}
			 else if(sTipo.equals("jComboBoxid_paisFK_IdPaisProvincia")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisFK_IdPaisProvincia,"FK_IdPais");
				//recargarFormProvinciaPais(jComboBoxid_paisFK_IdPaisProvincia,"FK_IdPais");
			}
				
				ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Provincia.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Provincia.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.provincia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.provincia);
				
				ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
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
				
				


			if(sTipo.equals("id_paisProvincia")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProvincia.jComboBoxid_paisProvincia;
				}

				if(this.provinciaSessionBean.getConGuardarRelaciones()) {
					//classes=ProvinciaConstantesFunciones.getClassesRelationshipsOfProvincia(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormProvincia(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia,"BusquedaPorIdPaisPorNombre");
				//recargarFormProvinciaPais(jComboBoxid_paisBusquedaPorIdPaisPorNombreProvincia,"BusquedaPorIdPaisPorNombre");
			}
			 else if(sTipo.equals("jComboBoxid_paisFK_IdPaisProvincia")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisFK_IdPaisProvincia,"FK_IdPais");
				//recargarFormProvinciaPais(jComboBoxid_paisFK_IdPaisProvincia,"FK_IdPais");
			}
				
				ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Provincia.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Provincia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProvinciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProvincia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.provinciaAnterior =(Provincia) this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.provinciaAnterior =(Provincia) this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProvincia")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProvinciaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProvincia.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.provincia =(Provincia) this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.provincia =(Provincia) this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.provincia);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProvincia")) {
				
				}
				
				ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProvincia")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProvincia.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProvincia")) {
			
			}
			
			ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProvincia();
			
			ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
			
			if(sTipo.equals("NuevoProvincia")) {
				jButtonNuevoProvinciaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProvincia")) {
				jButtonDuplicarProvinciaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProvincia")) {
				jButtonCopiarProvinciaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProvincia")) {
				jButtonVerFormProvinciaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProvincia")) {
				jButtonNuevoProvinciaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProvincia")) {
				jButtonModificarProvinciaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProvincia")) {
				jButtonActualizarProvinciaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProvincia")) {
				jButtonEliminarProvinciaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProvincia")) {
				jButtonGuardarCambiosProvinciaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProvincia")) {
				jButtonCancelarProvinciaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProvincia")) {
				jButtonCerrarProvinciaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProvincia")) {
				jButtonGuardarCambiosProvinciaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProvincia")) {
				jButtonNuevoGuardarCambiosProvinciaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProvincia")) {
				jButtonAbrirOrderByProvinciaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProvincia")) {
				jButtonRecargarInformacionProvinciaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProvincia")) {
				jButtonAnterioresProvinciaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProvincia")) {
				jButtonSiguientesProvinciaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProvinciaBusqueda")) {
				this.jButtonidProvinciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisProvinciaUpdate")) {
				this.jButtonid_paisProvinciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisProvinciaBusqueda")) {
				this.jButtonid_paisProvinciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_regionProvinciaUpdate")) {
				this.jButtonid_regionProvinciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_regionProvinciaBusqueda")) {
				this.jButtonid_regionProvinciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProvinciaBusqueda")) {
				this.jButtoncodigoProvinciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreProvinciaBusqueda")) {
				this.jButtonnombreProvinciaBusquedaActionPerformed(evt);
			}
			
			ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProvincia();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProvincia")) {
				closingInternalFrameProvincia();
				
			} else if(sTipo.equals("jButtonCancelarProvincia")) {
				JInternalFrameBase jInternalFrameDetalleFormProvincia = (JInternalFrameBase)evt.getSource();
	            	
	            ProvinciaBeanSwingJInternalFrame jInternalFrameParent=(ProvinciaBeanSwingJInternalFrame)jInternalFrameDetalleFormProvincia.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProvinciaActionPerformed(null);
			}
			
			ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.provincia,new Object(),this.provinciaParameterGeneral,this.provinciaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProvincia(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProvincia(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProvincia(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.provincia)) {
			if(!esControlTabla) {
				if(ProvinciaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProvincia(this.provincia,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProvincia(this.provincia);			
				}
				
				if(this.provinciaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProvincia(this.provincia,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.provinciaReturnGeneral=provinciaLogic.procesarEventosProvinciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.provinciaLogic.getProvincias(),this.provincia,this.provinciaParameterGeneral,this.isEsNuevoProvincia,classes);//this.provinciaLogic.getProvincia()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProvincia(this.provinciaReturnGeneral,this.provinciaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.provinciaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProvincia(classes,this.provinciaReturnGeneral,this.provinciaBean,false);
					}
						
					if(this.provinciaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProvincia(this.provinciaReturnGeneral.getProvincia());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProvincia(this.provinciaReturnGeneral.getProvincia());	
					}
						
					if(this.provinciaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProvincia(this.provinciaReturnGeneral.getProvincia(),classes);//this.provinciaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProvincia(this.provincia,classes);//this.provinciaBean);									
				}
			
				if(ProvinciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProvincia(this.provincia,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProvincia(this.provincia);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.provinciaAnterior!=null) {
						this.provincia=this.provinciaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.provinciaReturnGeneral=provinciaLogic.procesarEventosProvinciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.provinciaLogic.getProvincias(),this.provincia,this.provinciaParameterGeneral,this.isEsNuevoProvincia,classes);//this.provinciaLogic.getProvincia()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.provinciaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.provinciaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.provinciaReturnGeneral.getProvincia(),provinciaLogic.getProvincias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.provinciaReturnGeneral.getProvincia(),this.provincias);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProvincia.repaint();
				
				//((AbstractTableModel) this.jTableDatosProvincia.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProvincia();
			}
		}
	}
	
	public void actualizarVisualTableDatosProvincia() throws Exception {
		
		ProvinciaModel provinciaModel=(ProvinciaModel)this.jTableDatosProvincia.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			provinciaModel.provincias=this.provinciaLogic.getProvincias();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			provinciaModel.provincias=this.provincias;
		}
		
		
		((ProvinciaModel) this.jTableDatosProvincia.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProvincia() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprovinciaAnterior(),this.provinciaLogic.getProvincias());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprovinciaAnterior(),this.provincias);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProvincia();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProvincia(Provincia provincia,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Ciudad.class)) {
					this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudadLogic.setCiudads(provincia.getCiudads());
					this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.inicializarActualizarBindingTablaCiudad(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(provincia.getClientes());
					this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Canton.class)) {
					this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantonLogic.setCantons(provincia.getCantons());
					this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.inicializarActualizarBindingTablaCanton(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Barrio.class)) {
					this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barrioLogic.setBarrios(provincia.getBarrios());
					this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.inicializarActualizarBindingTablaBarrio(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Empleado.class)) {
					this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(provincia.getEmpleados());
					this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DatoGeneralEmpleado.class)) {
					this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(provincia.getDatoGeneralEmpleados());
					this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDatoGeneralEmpleado(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCarteraDefecto.class)) {
					this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(provincia.getParametroCarteraDefectos());
					this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCarteraDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
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
										
				ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.provincia,new Object(),generalEntityParameterGeneral,this.provinciaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.provinciaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProvinciaConstantesFunciones.getClassesRelationshipsOfProvincia(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProvinciaConstantesFunciones.getClassesRelationshipsFromStringsOfProvincia(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProvincia(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProvinciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.provincia,new Object(),generalEntityParameterGeneral,this.provinciaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProvincia(ProvinciaBean provinciaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Ciudad.class)) {
					this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudadLogic.setCiudads(provincia.getCiudads());
					this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.inicializarActualizarBindingTablaCiudad(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(provincia.getClientes());
					this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Canton.class)) {
					this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantonLogic.setCantons(provincia.getCantons());
					this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.inicializarActualizarBindingTablaCanton(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Barrio.class)) {
					this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barrioLogic.setBarrios(provincia.getBarrios());
					this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.inicializarActualizarBindingTablaBarrio(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Empleado.class)) {
					this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(provincia.getEmpleados());
					this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DatoGeneralEmpleado.class)) {
					this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(provincia.getDatoGeneralEmpleados());
					this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDatoGeneralEmpleado(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCarteraDefecto.class)) {
					this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(provincia.getParametroCarteraDefectos());
					this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCarteraDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProvincia(ArrayList<Classe> classes,ProvinciaReturnGeneral provinciaReturnGeneral,ProvinciaBean provinciaBean,Boolean conDefault) throws Exception {
		
			this.provinciaBean.setCiudads(provinciaReturnGeneral.getProvincia().getCiudads());
			this.provinciaBean.setClientes(provinciaReturnGeneral.getProvincia().getClientes());
			this.provinciaBean.setCantons(provinciaReturnGeneral.getProvincia().getCantons());
			this.provinciaBean.setBarrios(provinciaReturnGeneral.getProvincia().getBarrios());
			this.provinciaBean.setEmpleados(provinciaReturnGeneral.getProvincia().getEmpleados());
			this.provinciaBean.setDatoGeneralEmpleados(provinciaReturnGeneral.getProvincia().getDatoGeneralEmpleados());
			this.provinciaBean.setParametroCarteraDefectos(provinciaReturnGeneral.getProvincia().getParametroCarteraDefectos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProvincia(Provincia provincia,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Ciudad.class)) {
					provincia.setCiudads(this.jInternalFrameDetalleFormProvincia.ciudadBeanSwingJInternalFrame.ciudadLogic.getCiudads());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					provincia.setClientes(this.jInternalFrameDetalleFormProvincia.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Canton.class)) {
					provincia.setCantons(this.jInternalFrameDetalleFormProvincia.cantonBeanSwingJInternalFrame.cantonLogic.getCantons());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Barrio.class)) {
					provincia.setBarrios(this.jInternalFrameDetalleFormProvincia.barrioBeanSwingJInternalFrame.barrioLogic.getBarrios());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Empleado.class)) {
					provincia.setEmpleados(this.jInternalFrameDetalleFormProvincia.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DatoGeneralEmpleado.class)) {
					provincia.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormProvincia.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCarteraDefecto.class)) {
					provincia.setParametroCarteraDefectos(this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.provincia)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProvincia = new ProvinciaDetalleFormJInternalFrame(jDesktopPane,this.provinciaSessionBean.getConGuardarRelaciones(),this.provinciaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProvincia);
		this.jInternalFrameDetalleFormProvincia.setVisible(false);
		this.jInternalFrameDetalleFormProvincia.setSelected(false);						
		
		this.jInternalFrameDetalleFormProvincia.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProvincia.provinciaLogic=this.provinciaLogic;
		
		this.cargarCombosFrameForeignKeyProvincia("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProvincia();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProvincia();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProvincia("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProvincia();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProvincia.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProvincia"));
		
		this.jInternalFrameDetalleFormProvincia.jButtonModificarProvincia.addActionListener(new ButtonActionListener(this,"ModificarProvincia"));

		
		this.jInternalFrameDetalleFormProvincia.jButtonModificarToolBarProvincia.addActionListener(new ButtonActionListener(this,"ModificarToolBarProvincia"));
					
		this.jInternalFrameDetalleFormProvincia.jMenuItemModificarProvincia.addActionListener(new ButtonActionListener(this,"MenuItemModificarProvincia"));		
		
		
		
		this.jInternalFrameDetalleFormProvincia.jButtonActualizarProvincia.addActionListener (new ButtonActionListener(this,"ActualizarProvincia"));
		
		
		this.jInternalFrameDetalleFormProvincia.jButtonActualizarToolBarProvincia.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProvincia"));
						
		this.jInternalFrameDetalleFormProvincia.jMenuItemActualizarProvincia.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProvincia"));		
		
		
		
		this.jInternalFrameDetalleFormProvincia.jButtonEliminarProvincia.addActionListener (new ButtonActionListener(this,"EliminarProvincia"));
		
		
		this.jInternalFrameDetalleFormProvincia.jButtonEliminarToolBarProvincia.addActionListener (new ButtonActionListener(this,"EliminarToolBarProvincia"));
								
		this.jInternalFrameDetalleFormProvincia.jMenuItemEliminarProvincia.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProvincia"));		
		
		
		
		this.jInternalFrameDetalleFormProvincia.jButtonCancelarProvincia.addActionListener (new ButtonActionListener(this,"CancelarProvincia"));
		
		
		this.jInternalFrameDetalleFormProvincia.jButtonCancelarToolBarProvincia.addActionListener (new ButtonActionListener(this,"CancelarToolBarProvincia"));
					
		this.jInternalFrameDetalleFormProvincia.jMenuItemCancelarProvincia.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProvincia"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProvincia.jMenuItemDetalleCerrarProvincia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProvincia"));		
		
		
		
		this.jInternalFrameDetalleFormProvincia.jButtonGuardarCambiosToolBarProvincia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProvincia"));
		
		
		
		this.jInternalFrameDetalleFormProvincia.jButtonGuardarCambiosToolBarProvincia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProvincia"));
		
		
		
		this.jInternalFrameDetalleFormProvincia.jComboBoxTiposAccionesFormularioProvincia.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProvincia"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvincia.jButtonidProvinciaBusqueda.addActionListener(new ButtonActionListener(this,"idProvinciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProvincia.jButtonid_paisProvinciaUpdate.addActionListener(new ButtonActionListener(this,"id_paisProvinciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvincia.jButtonid_paisProvinciaBusqueda.addActionListener(new ButtonActionListener(this,"id_paisProvinciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProvincia.jButtonid_regionProvinciaUpdate.addActionListener(new ButtonActionListener(this,"id_regionProvinciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvincia.jButtonid_regionProvinciaBusqueda.addActionListener(new ButtonActionListener(this,"id_regionProvinciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvincia.jButtoncodigoProvinciaBusqueda.addActionListener(new ButtonActionListener(this,"codigoProvinciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvincia.jButtonnombreProvinciaBusqueda.addActionListener(new ButtonActionListener(this,"nombreProvinciaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProvincia.jTabbedPaneRelacionesProvincia.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProvincia"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProvincia"));
		
		if(this.jInternalFrameDetalleFormProvincia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProvincia.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProvincia"));
		}
		
		this.jTableDatosProvincia.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProvincia"));
		
		this.jTableDatosProvincia.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProvincia"));
		
		this.jButtonNuevoProvincia.addActionListener(new ButtonActionListener(this,"NuevoProvincia"));
		
		this.jButtonDuplicarProvincia.addActionListener(new ButtonActionListener(this,"DuplicarProvincia"));
		
		this.jButtonCopiarProvincia.addActionListener(new ButtonActionListener(this,"CopiarProvincia"));
		
		this.jButtonVerFormProvincia.addActionListener(new ButtonActionListener(this,"VerFormProvincia"));
		
		
		this.jButtonNuevoToolBarProvincia.addActionListener(new ButtonActionListener(this,"NuevoToolBarProvincia"));
			
		this.jButtonDuplicarToolBarProvincia.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProvincia"));
			
		this.jMenuItemNuevoProvincia.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProvincia"));
			
		this.jMenuItemDuplicarProvincia.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProvincia"));		
		
		
		this.jButtonNuevoRelacionesProvincia.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProvincia"));
		
		
		this.jButtonNuevoRelacionesToolBarProvincia.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProvincia"));
			
		this.jMenuItemNuevoRelacionesProvincia.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProvincia"));		
		
		
		if(this.jInternalFrameDetalleFormProvincia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProvincia.jButtonModificarProvincia.addActionListener(new ButtonActionListener(this,"ModificarProvincia"));
		}
		
		
		if(this.jInternalFrameDetalleFormProvincia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProvincia.jButtonModificarToolBarProvincia.addActionListener(new ButtonActionListener(this,"ModificarToolBarProvincia"));
			
			this.jInternalFrameDetalleFormProvincia.jMenuItemModificarProvincia.addActionListener(new ButtonActionListener(this,"MenuItemModificarProvincia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProvincia!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProvincia.jButtonActualizarProvincia.addActionListener (new ButtonActionListener(this,"ActualizarProvincia"));
		}
		
		
		if(this.jInternalFrameDetalleFormProvincia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProvincia.jButtonActualizarToolBarProvincia.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProvincia"));
				
			this.jInternalFrameDetalleFormProvincia.jMenuItemActualizarProvincia.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProvincia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProvincia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProvincia.jButtonEliminarProvincia.addActionListener (new ButtonActionListener(this,"EliminarProvincia"));
		}
		
		
		if(this.jInternalFrameDetalleFormProvincia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProvincia.jButtonEliminarToolBarProvincia.addActionListener (new ButtonActionListener(this,"EliminarToolBarProvincia"));
						
			this.jInternalFrameDetalleFormProvincia.jMenuItemEliminarProvincia.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProvincia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProvincia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProvincia.jButtonCancelarProvincia.addActionListener (new ButtonActionListener(this,"CancelarProvincia"));
		}
		
		
		if(this.jInternalFrameDetalleFormProvincia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProvincia.jButtonCancelarToolBarProvincia.addActionListener (new ButtonActionListener(this,"CancelarToolBarProvincia"));
			
			this.jInternalFrameDetalleFormProvincia.jMenuItemCancelarProvincia.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProvincia"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProvincia.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProvincia"));		
		
		
		this.jButtonCerrarProvincia.addActionListener (new ButtonActionListener(this,"CerrarProvincia"));
		
		
		this.jButtonCerrarToolBarProvincia.addActionListener (new ButtonActionListener(this,"CerrarToolBarProvincia"));
			
		this.jMenuItemCerrarProvincia.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProvincia"));
			
		if(this.jInternalFrameDetalleFormProvincia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProvincia.jMenuItemDetalleCerrarProvincia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProvincia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProvincia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProvincia.jButtonGuardarCambiosProvincia.addActionListener (new ButtonActionListener(this,"GuardarCambiosProvincia"));
		}
		
		
		if(this.jInternalFrameDetalleFormProvincia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProvincia.jButtonGuardarCambiosToolBarProvincia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProvincia"));
		}
		
		this.jButtonCopiarToolBarProvincia.addActionListener (new ButtonActionListener(this,"CopiarToolBarProvincia"));
			
		this.jButtonVerFormToolBarProvincia.addActionListener (new ButtonActionListener(this,"VerFormToolBarProvincia"));
		
		this.jMenuItemGuardarCambiosProvincia.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProvincia"));
			
		this.jMenuItemCopiarProvincia.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProvincia"));		
		
		this.jMenuItemVerFormProvincia.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProvincia"));		
		
		
		this.jButtonGuardarCambiosTablaProvincia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProvincia"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProvincia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProvincia"));
			
		this.jMenuItemGuardarCambiosTablaProvincia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProvincia"));		
		
		
		
		this.jButtonRecargarInformacionProvincia.addActionListener (new ButtonActionListener(this,"RecargarInformacionProvincia"));
					
		this.jButtonRecargarInformacionToolBarProvincia.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProvincia"));
		
		this.jMenuItemRecargarInformacionProvincia.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProvincia"));		
		
		
		
		this.jButtonAnterioresProvincia.addActionListener (new ButtonActionListener(this,"AnterioresProvincia"));
		
		
		this.jButtonAnterioresToolBarProvincia.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProvincia"));
		
		this.jMenuItemAnterioresProvincia.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProvincia"));		
		
		
		this.jButtonSiguientesProvincia.addActionListener (new ButtonActionListener(this,"SiguientesProvincia"));
		
		
		this.jButtonSiguientesToolBarProvincia.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProvincia"));
			
		this.jMenuItemSiguientesProvincia.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProvincia"));
			
		this.jMenuItemAbrirOrderByProvincia.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProvincia"));
			
		this.jMenuItemMostrarOcultarProvincia.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProvincia"));
			
		this.jMenuItemDetalleAbrirOrderByProvincia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProvincia"));
			
		this.jMenuItemDetalleMostarOcultarProvincia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProvincia"));		
		
		
		this.jButtonNuevoGuardarCambiosProvincia.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProvincia"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProvincia.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProvincia"));
			
		this.jMenuItemNuevoGuardarCambiosProvincia.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProvincia"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProvincia.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProvincia"));

		this.jCheckBoxSeleccionadosProvincia.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProvincia"));
		
		if(this.jInternalFrameDetalleFormProvincia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProvincia.jComboBoxTiposAccionesFormularioProvincia.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProvincia"));
		}
		
		
		this.jComboBoxTiposRelacionesProvincia.addActionListener (new ButtonActionListener(this,"TiposRelacionesProvincia"));
			
		this.jComboBoxTiposAccionesProvincia.addActionListener (new ButtonActionListener(this,"TiposAccionesProvincia"));
					
		this.jComboBoxTiposSeleccionarProvincia.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProvincia"));
			
		this.jTextFieldValorCampoGeneralProvincia.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProvincia"));		
		
		
		if(this.jInternalFrameDetalleFormProvincia!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvincia.jButtonidProvinciaBusqueda.addActionListener(new ButtonActionListener(this,"idProvinciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProvincia.jButtonid_paisProvinciaUpdate.addActionListener(new ButtonActionListener(this,"id_paisProvinciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvincia.jButtonid_paisProvinciaBusqueda.addActionListener(new ButtonActionListener(this,"id_paisProvinciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProvincia.jButtonid_regionProvinciaUpdate.addActionListener(new ButtonActionListener(this,"id_regionProvinciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvincia.jButtonid_regionProvinciaBusqueda.addActionListener(new ButtonActionListener(this,"id_regionProvinciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvincia.jButtoncodigoProvinciaBusqueda.addActionListener(new ButtonActionListener(this,"codigoProvinciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvincia.jButtonnombreProvinciaBusqueda.addActionListener(new ButtonActionListener(this,"nombreProvinciaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorIdPaisPorNombreProvincia.addActionListener(new ButtonActionListener(this,"BusquedaPorIdPaisPorNombreProvincia"));

			this.jButtonFK_IdPaisProvincia.addActionListener(new ButtonActionListener(this,"FK_IdPaisProvincia"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProvincia!=null) {
				this.jInternalFrameReporteDinamicoProvincia.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProvincia"));
				this.jInternalFrameReporteDinamicoProvincia.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProvincia"));
				this.jInternalFrameReporteDinamicoProvincia.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProvincia"));
			}
			
			//this.jButtonCerrarReporteDinamicoProvincia.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProvincia"));				
			//this.jButtonGenerarReporteDinamicoProvincia.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProvincia"));
			//this.jButtonGenerarExcelReporteDinamicoProvincia.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProvincia"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProvincia!=null) {
				this.jInternalFrameImportacionProvincia.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProvincia"));
				this.jInternalFrameImportacionProvincia.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProvincia"));
				this.jInternalFrameImportacionProvincia.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProvincia"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProvincia.addActionListener (new ButtonActionListener(this,"AbrirOrderByProvincia"));
			
			this.jButtonAbrirOrderByToolBarProvincia.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProvincia"));			
			
			if(this.jInternalFrameOrderByProvincia!=null) {
				this.jInternalFrameOrderByProvincia.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProvincia"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProvincia!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProvincia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProvincia.jTabbedPaneRelacionesProvincia.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProvincia"));
		
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
            		closingInternalFrameProvincia();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProvincia.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProvincia = (JInternalFrameBase)event.getSource();
	            	
	            ProvinciaBeanSwingJInternalFrame jInternalFrameParent=(ProvinciaBeanSwingJInternalFrame)jInternalFrameDetalleFormProvincia.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProvinciaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProvincia.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProvinciaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProvincia.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProvincia.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProvinciaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProvinciaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProvinciaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProvincia";
		inputMap = this.jButtonNuevoProvincia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProvincia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProvinciaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProvinciaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProvinciaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProvinciaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProvincia";
		inputMap = this.jButtonNuevoRelacionesProvincia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProvincia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProvinciaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProvincia";
		inputMap = this.jButtonModificarProvincia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProvincia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProvinciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProvincia";
		inputMap = this.jButtonActualizarProvincia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProvincia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProvinciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProvincia";
		inputMap = this.jButtonEliminarProvincia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProvincia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProvinciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProvincia";
		inputMap = this.jButtonCancelarProvincia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProvincia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProvinciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProvincia";
		inputMap = this.jButtonCerrarProvincia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProvincia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProvinciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProvincia.jButtonGuardarCambiosProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProvincia";
		inputMap = this.jInternalFrameDetalleFormProvincia.jButtonGuardarCambiosProvincia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProvincia.jButtonGuardarCambiosProvincia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProvinciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProvincia.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProvinciaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProvincia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProvinciaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProvincia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProvinciaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProvincia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProvinciaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvincia.jButtonidProvinciaBusqueda.addActionListener(new ButtonActionListener(this,"idProvinciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProvincia.jButtonid_paisProvinciaUpdate.addActionListener(new ButtonActionListener(this,"id_paisProvinciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvincia.jButtonid_paisProvinciaBusqueda.addActionListener(new ButtonActionListener(this,"id_paisProvinciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProvincia.jButtonid_regionProvinciaUpdate.addActionListener(new ButtonActionListener(this,"id_regionProvinciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvincia.jButtonid_regionProvinciaBusqueda.addActionListener(new ButtonActionListener(this,"id_regionProvinciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvincia.jButtoncodigoProvinciaBusqueda.addActionListener(new ButtonActionListener(this,"codigoProvinciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProvincia.jButtonnombreProvinciaBusqueda.addActionListener(new ButtonActionListener(this,"nombreProvinciaBusqueda"));
		
		
		this.jButtonBusquedaPorIdPaisPorNombreProvincia.addActionListener(new ButtonActionListener(this,"BusquedaPorIdPaisPorNombreProvincia"));

		this.jButtonFK_IdPaisProvincia.addActionListener(new ButtonActionListener(this,"FK_IdPaisProvincia"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProvincia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProvinciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProvinciaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProvincia.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProvincia(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Provincia provinciaAux:this.provinciaLogic.getProvincias()) {
					provinciaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Provincia provinciaAux:provincias) {
					provinciaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProvinciaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProvincia(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Provincia provinciaAux:this.provinciaLogic.getProvincias()) {
						provinciaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Provincia provinciaAux:provincias) {
						provinciaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Provincia provinciaAux:this.provinciaLogic.getProvincias()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Provincia provinciaAux:provincias) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProvincia(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProvincia.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProvincia.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProvincia,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProvinciaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProvincia(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProvincia.getSelectedRows();
			
			Provincia provinciaLocal=new Provincia();
			
			//this.seleccionarTodosProvincia(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					provinciaLocal =(Provincia) this.provinciaLogic.getProvincias().toArray()[this.jTableDatosProvincia.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					provinciaLocal =(Provincia) this.provincias.toArray()[this.jTableDatosProvincia.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				provinciaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Provincia provinciaAux:this.provinciaLogic.getProvincias()) {
						provinciaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Provincia provinciaAux:provincias) {
						provinciaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProvincia(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProvincia.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProvincia.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProvincia,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProvinciaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProvinciaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProvinciaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProvincia(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProvincia.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Provincia provinciaAux:this.provinciaLogic.getProvincias()) {
				
						if(sTipoSeleccionar.equals(ProvinciaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							provinciaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProvinciaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							provinciaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Provincia provinciaAux:provincias) {
					
						if(sTipoSeleccionar.equals(ProvinciaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							provinciaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProvinciaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							provinciaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProvincia(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProvinciaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProvincia(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProvincia=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProvincia.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProvincia.jComboBoxTiposAccionesFormularioProvincia.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProvincia) {				
					conSplash=true;//false;										
					
					//this.startProcessProvincia(conSplash);
				
					this.generarReporteProvinciasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProvincia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProvincia.jComboBoxTiposAccionesFormularioProvincia.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProvinciasSeleccionados();
				//this.jComboBoxTiposAccionesProvincia.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProvinciasSeleccionados(false);
				//this.jComboBoxTiposAccionesProvincia.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProvinciasSeleccionados(true);
				//this.jComboBoxTiposAccionesProvincia.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProvincia();
				
				this.exportarProvinciasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProvincia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProvincia.jComboBoxTiposAccionesFormularioProvincia.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProvincias();
				//this.importarProvincias();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProvincia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProvincia.jComboBoxTiposAccionesFormularioProvincia.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProvincia();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProvinciasSeleccionados();
				//this.jComboBoxTiposAccionesProvincia.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Provincia", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProvincia();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProvincia)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProvincia(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Provincia",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProvincia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProvincia.jComboBoxTiposAccionesFormularioProvincia.setSelectedIndex(0);					
				}	
			} 			
			else if(ProvinciaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProvincia) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProvincia(conSplash);
					
						//this.actualizarParametrosGeneralProvincia();
						
						this.generarReporteProcesoAccionProvinciasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProvincia.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProvincia.jComboBoxTiposAccionesFormularioProvincia.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProvinciaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO ProvinciaES SELECCIONADOS?", "MANTENIMIENTO DE Provincia", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProvincia();
				
						this.actualizarParametrosGeneralProvincia();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.provinciaReturnGeneral=provinciaLogic.procesarAccionProvinciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.provinciaLogic.getProvincias(),this.provinciaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProvinciaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProvincia.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProvincia.jComboBoxTiposAccionesFormularioProvincia.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProvincia();
					
					ProvinciaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProvinciaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProvincia.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProvincia.jComboBoxTiposAccionesFormularioProvincia.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProvincia(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProvinciaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProvincia();
			
			if(this.jInternalFrameDetalleFormProvincia==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Provincia> provinciasSeleccionados=new ArrayList<Provincia>();		
			Provincia provincia=new Provincia();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProvincia(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProvincia.getSelectedItem();
			
			
			
			
			provinciasSeleccionados=this.getProvinciasSeleccionados(true);
			//this.sTipoAccion;
			
			if(provinciasSeleccionados.size()==1) {
				for(Provincia provinciaAux:provinciasSeleccionados) {
					provincia=provinciaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Ciudad")) {
					jButtonCiudadActionPerformed(null,rowIndex,true,false,provincia);
				}
				else if(this.sTipoRelacion.equals("Cliente")) {
					jButtonClienteActionPerformed(null,rowIndex,true,false,provincia);
				}
				else if(this.sTipoRelacion.equals("Canton")) {
					jButtonCantonActionPerformed(null,rowIndex,true,false,provincia);
				}
				else if(this.sTipoRelacion.equals("Barrio")) {
					jButtonBarrioActionPerformed(null,rowIndex,true,false,provincia);
				}
				else if(this.sTipoRelacion.equals("Empleado")) {
					jButtonEmpleadoActionPerformed(null,rowIndex,true,false,provincia);
				}
				else if(this.sTipoRelacion.equals("Dato General Empleado")) {
					jButtonDatoGeneralEmpleadoActionPerformed(null,rowIndex,true,false,provincia);
				}
				else if(this.sTipoRelacion.equals("Parametro Cartera Defecto")) {
					jButtonParametroCarteraDefectoActionPerformed(null,rowIndex,true,false,provincia);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProvincia();
			
      		//this.finishProcessProvincia(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProvinciaReturnGeneral() throws Exception {
		if(this.provinciaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.provinciaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.provinciaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.provinciaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.provinciaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.provinciaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProvincia(false);
		}
		
		if(this.provinciaReturnGeneral.getConRetornoLista() || this.provinciaReturnGeneral.getConRetornoObjeto()) {
			if(this.provinciaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.provinciaLogic.setProvincias(this.provinciaReturnGeneral.getProvincias());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.provinciaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.provinciaLogic.setProvincia(this.provinciaReturnGeneral.getProvincia());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingProvincia(false);
		}
	}
	
	public void actualizarParametrosGeneralProvincia() throws Exception {
		
		
	}
	
	public ArrayList<Provincia> getProvinciasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Provincia> provinciasSeleccionados=new ArrayList<Provincia>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProvincia) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Provincia provinciaAux:provinciaLogic.getProvincias()) {
					if(provinciaAux.getIsSelected()) {
						provinciasSeleccionados.add(provinciaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Provincia provinciaAux:this.provincias) {
					if(provinciaAux.getIsSelected()) {
						provinciasSeleccionados.add(provinciaAux);				
					}
				}
			}
			
			if(provinciasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						provinciasSeleccionados.addAll(this.provinciaLogic.getProvincias());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						provinciasSeleccionados.addAll(this.provincias);				
					}
				}
			}
		} else {
			provinciasSeleccionados.add(this.provincia);
		}
		
		return provinciasSeleccionados;
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
	
	public void generarReporteProvinciasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProvinciasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProvinciasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProvinciasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProvinciasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesProvinciasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Provincia",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProvinciasSeleccionados() throws Exception {
		ArrayList<Provincia> provinciasSeleccionados=new ArrayList<Provincia>();		
		
		provinciasSeleccionados=this.getProvinciasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProvincias("Todos",provinciasSeleccionados);
		
	}	
	
	public void generarReporteNormalProvinciasSeleccionados() throws Exception {
		ArrayList<Provincia> provinciasSeleccionados=new ArrayList<Provincia>();		
		
		provinciasSeleccionados=this.getProvinciasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProvincias("Todos",provinciasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProvinciasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Provincia> provinciasSeleccionados=new ArrayList<Provincia>();
		
		provinciasSeleccionados=this.getProvinciasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProvincias("Todos",provinciasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProvinciasSeleccionados() throws Exception {
		ArrayList<Provincia> provinciasSeleccionados=new ArrayList<Provincia>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProvincia();
		
		
		provinciasSeleccionados=this.getProvinciasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProvincia();
		
		
		//this.generarReporteProvincias("Todos",provinciasSeleccionados ,provinciaImplementable,provinciaImplementableHome);
	}
	
	public void mostrarImportacionProvincias() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProvincia();
		
		this.abrirFrameImportacionProvincia();		
		
			
		//this.generarReporteProvincias("Todos",provinciasSeleccionados ,provinciaImplementable,provinciaImplementableHome);
	}
	
	public void importarProvincias() throws Exception {		
	
	}
	
	public void exportarProvinciasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProvinciasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProvinciasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProvinciasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Provincia",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProvinciasSeleccionados() throws Exception {
		ArrayList<Provincia> provinciasSeleccionados=new ArrayList<Provincia>();		
		
		provinciasSeleccionados=this.getProvinciasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"provincia."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProvincia(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Provincia provinciaAux:provinciasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProvincia(provinciaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//provinciaAux.setsDetalleGeneralEntityReporte(provinciaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.provinciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Provincia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProvincia(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProvinciaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProvinciaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProvinciaConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProvinciaConstantesFunciones.LABEL_IDREGION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProvinciaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProvinciaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProvincia(Provincia provincia,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=provincia.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=provincia.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=provincia.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=provincia.getregion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=provincia.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=provincia.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProvinciasSeleccionados() throws Exception {
		ArrayList<Provincia> provinciasSeleccionados=new ArrayList<Provincia>();		
		
		provinciasSeleccionados=this.getProvinciasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"provincia.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Provincias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProvincia(row);				
				iRow++;
			}				
			
			for(Provincia provinciaAux:provinciasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProvincia(provinciaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.provinciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Provincia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProvinciasSeleccionados() throws Exception {
		ArrayList<Provincia> provinciasSeleccionados=new ArrayList<Provincia>();		
		
		provinciasSeleccionados=this.getProvinciasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"provincia.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("provincias");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("provincia");
			//elementRoot.appendChild(element);
		
			for(Provincia provinciaAux:provinciasSeleccionados) {
				element = document.createElement("provincia");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProvincia(provinciaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.provinciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Provincia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProvincia(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProvinciaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProvinciaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProvinciaConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(ProvinciaConstantesFunciones.LABEL_IDREGION);
		cell = row.createCell(iColumn++);cell.setCellValue(ProvinciaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProvinciaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProvincia(Provincia provincia,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(provincia.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(provincia.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(provincia.getregion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(provincia.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(provincia.getnombre());				
	}
	
	public void setFilaDatosExportarXmlProvincia(Provincia provincia,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProvinciaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(provincia.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProvinciaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(provincia.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementpais_descripcion = document.createElement(ProvinciaConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(provincia.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementregion_descripcion = document.createElement(ProvinciaConstantesFunciones.IDREGION);
		elementregion_descripcion.appendChild(document.createTextNode(provincia.getregion_descripcion()));
		element.appendChild(elementregion_descripcion);

		Element elementcodigo = document.createElement(ProvinciaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(provincia.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(ProvinciaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(provincia.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoProvinciasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Provincia> provinciasSeleccionados=new ArrayList<Provincia>();
		
		provinciasSeleccionados=this.getProvinciasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProvincia(provinciasSeleccionados);
		
		this.generarReporteProvincias("Todos",provinciasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProvincia(ArrayList<Provincia> provinciasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Provincia provinciaAux:provinciasSeleccionados) {
				provinciaAux.setsDetalleGeneralEntityReporte(provinciaAux.toString());
			
				if(sTipoSeleccionar.equals(ProvinciaConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					provinciaAux.setsDescripcionGeneralEntityReporte1(provinciaAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProvinciaConstantesFunciones.LABEL_IDREGION)) {
					existe=true;
					provinciaAux.setsDescripcionGeneralEntityReporte1(provinciaAux.getregion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProvinciaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					provinciaAux.setsDescripcionGeneralEntityReporte1(provinciaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ProvinciaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					provinciaAux.setsDescripcionGeneralEntityReporte1(provinciaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProvinciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProvincia(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProvincia=true;
				this.isVisibilidadCeldaNuevoRelacionesProvincia=true;
				this.isVisibilidadCeldaGuardarCambiosProvincia=true;
			}
			
			this.isVisibilidadCeldaModificarProvincia=false;
			this.isVisibilidadCeldaActualizarProvincia=false;
			this.isVisibilidadCeldaEliminarProvincia=false;
			this.isVisibilidadCeldaCancelarProvincia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProvincia=true;
				} else {
					this.isVisibilidadCeldaGuardarProvincia=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProvincia=false;
			this.isVisibilidadCeldaNuevoRelacionesProvincia=false;
			this.isVisibilidadCeldaGuardarCambiosProvincia=false;
			this.isVisibilidadCeldaModificarProvincia=false;
			this.isVisibilidadCeldaActualizarProvincia=true;
			this.isVisibilidadCeldaEliminarProvincia=false;
			this.isVisibilidadCeldaCancelarProvincia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProvincia=true;
				} else {
					this.isVisibilidadCeldaGuardarProvincia=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProvincia=false;
			this.isVisibilidadCeldaNuevoRelacionesProvincia=false;
			this.isVisibilidadCeldaGuardarCambiosProvincia=false;
			this.isVisibilidadCeldaModificarProvincia=false;
			this.isVisibilidadCeldaActualizarProvincia=true;
			this.isVisibilidadCeldaEliminarProvincia=true;
			this.isVisibilidadCeldaCancelarProvincia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProvincia=true;
				} else {
					this.isVisibilidadCeldaGuardarProvincia=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProvincia=false;
			this.isVisibilidadCeldaNuevoRelacionesProvincia=false;
			this.isVisibilidadCeldaGuardarCambiosProvincia=false;
			this.isVisibilidadCeldaModificarProvincia=false;
			this.isVisibilidadCeldaActualizarProvincia=true;
			this.isVisibilidadCeldaEliminarProvincia=false;
			this.isVisibilidadCeldaCancelarProvincia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProvincia=false;
				} else {
					this.isVisibilidadCeldaGuardarProvincia=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProvincia=true;
			this.isVisibilidadCeldaNuevoRelacionesProvincia=true;
			this.isVisibilidadCeldaGuardarCambiosProvincia=true;
			this.isVisibilidadCeldaModificarProvincia=false;
			this.isVisibilidadCeldaActualizarProvincia=false;
			this.isVisibilidadCeldaEliminarProvincia=false;
			this.isVisibilidadCeldaCancelarProvincia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProvincia=true;
				} else {
					this.isVisibilidadCeldaGuardarProvincia=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProvincia=false;
			this.isVisibilidadCeldaNuevoRelacionesProvincia=false;
			this.isVisibilidadCeldaGuardarCambiosProvincia=false;
			this.isVisibilidadCeldaActualizarProvincia=false;
			this.isVisibilidadCeldaEliminarProvincia=false;
			this.isVisibilidadCeldaCancelarProvincia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProvincia=false;
				} else {
					this.isVisibilidadCeldaGuardarProvincia=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProvincia=false;
			this.isVisibilidadCeldaNuevoRelacionesProvincia=false;
			this.isVisibilidadCeldaGuardarCambiosProvincia=false;
			this.isVisibilidadCeldaModificarProvincia=true;
			this.isVisibilidadCeldaActualizarProvincia=false;
			this.isVisibilidadCeldaEliminarProvincia=false;
			this.isVisibilidadCeldaCancelarProvincia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProvincia=false;
				} else {
					this.isVisibilidadCeldaGuardarProvincia=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProvinciaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProvincia=true;
			this.isVisibilidadCeldaNuevoRelacionesProvincia=true;
			this.isVisibilidadCeldaGuardarCambiosProvincia=true;
		} else {
			this.actualizarEstadoPanelsProvincia(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProvincia=false;
			//this.isVisibilidadCeldaVerFormProvincia=false;
			this.isVisibilidadCeldaDuplicarProvincia=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!provinciaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProvincia=false;
		} else {
			this.isVisibilidadCeldaNuevoProvincia=false;
			this.isVisibilidadCeldaGuardarCambiosProvincia=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(provinciaSessionBean.getEsGuardarRelacionado()) {
			if(!provinciaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProvincia=false;												
			}
			
			this.jButtonCerrarProvincia.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProvincia=false;
		}
		
		if(!this.permiteMantenimiento(this.provincia)) {
			this.isVisibilidadCeldaActualizarProvincia=false;
			this.isVisibilidadCeldaEliminarProvincia=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProvincia() {
		this.isVisibilidadCeldaNuevoProvincia=false;
		this.isVisibilidadCeldaGuardarCambiosProvincia=false;
	}
	
	public void actualizarEstadoPanelsProvincia(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProvincia!=null) {
				this.jScrollPanelDatosEdicionProvincia.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProvincia!=null) {
				this.jTabbedPaneBusquedasProvincia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProvincia!=null) {
				this.jScrollPanelDatosProvincia.setVisible(true);
			}
			
			if(this.jPanelPaginacionProvincia!=null) {
				this.jPanelPaginacionProvincia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProvincia!=null) {
				this.jPanelParametrosReportesProvincia.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProvincia!=null) {
				this.jScrollPanelDatosEdicionProvincia.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProvincia!=null) {
				this.jTabbedPaneBusquedasProvincia.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProvincia!=null) {
				this.jScrollPanelDatosProvincia.setVisible(false);
			}
			
			if(this.jPanelPaginacionProvincia!=null) {
				this.jPanelPaginacionProvincia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProvincia!=null) {
				this.jPanelParametrosReportesProvincia.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProvincia!=null) {
				this.jScrollPanelDatosEdicionProvincia.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProvincia!=null) {
				this.jTabbedPaneBusquedasProvincia.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProvincia!=null) {
				this.jScrollPanelDatosProvincia.setVisible(false);
			}
			
			if(this.jPanelPaginacionProvincia!=null) {
				this.jPanelPaginacionProvincia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProvincia!=null) {
				this.jPanelParametrosReportesProvincia.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProvincia!=null) {
				this.jScrollPanelDatosEdicionProvincia.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProvincia!=null) {
				this.jTabbedPaneBusquedasProvincia.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProvincia!=null) {
				this.jScrollPanelDatosProvincia.setVisible(false);
			}
			
			if(this.jPanelPaginacionProvincia!=null) {
				this.jPanelPaginacionProvincia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProvincia!=null) {
				this.jPanelParametrosReportesProvincia.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProvincia!=null) {
				this.jScrollPanelDatosEdicionProvincia.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProvincia!=null) {
				this.jTabbedPaneBusquedasProvincia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProvincia!=null) {
				this.jScrollPanelDatosProvincia.setVisible(true);
			}
			
			if(this.jPanelPaginacionProvincia!=null) {
				this.jPanelPaginacionProvincia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProvincia!=null) {
				this.jPanelParametrosReportesProvincia.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProvincia!=null) {
				this.jScrollPanelDatosEdicionProvincia.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProvincia!=null) {
				this.jTabbedPaneBusquedasProvincia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProvincia!=null) {
				this.jScrollPanelDatosProvincia.setVisible(true);
			}
			
			if(this.jPanelPaginacionProvincia!=null) {
				this.jPanelPaginacionProvincia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProvincia!=null) {
				this.jPanelParametrosReportesProvincia.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProvincia!=null) {
				this.jScrollPanelDatosEdicionProvincia.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProvincia!=null) {
				this.jTabbedPaneBusquedasProvincia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProvincia!=null) {
				this.jScrollPanelDatosProvincia.setVisible(true);
			}
			
			if(this.jPanelPaginacionProvincia!=null) {
				this.jPanelPaginacionProvincia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProvincia!=null) {
				this.jPanelParametrosReportesProvincia.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.provinciaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProvincia!=null) {
					this.jTabbedPaneBusquedasProvincia.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProvincia!=null) {
				this.jPanelParametrosReportesProvincia.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.provinciaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProvincia!=null) {
				this.jTabbedPaneBusquedasProvincia.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProvincia!=null) {
				this.jPanelParametrosReportesProvincia.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadBusquedaPorIdPaisPorNombre=isParaPais;
			if(!this.isVisibilidadBusquedaPorIdPaisPorNombre) {this.jTabbedPaneBusquedasProvincia.remove(jPanelBusquedaPorIdPaisPorNombreProvincia);}

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasProvincia.remove(jPanelFK_IdPaisProvincia);}
		}
		
	}

	public void setVisibilidadBusquedasParaRegion(Boolean isParaRegion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaRegionNegation=!isParaRegion;

			this.isVisibilidadBusquedaPorIdPaisPorNombre=isParaRegionNegation;
			if(!this.isVisibilidadBusquedaPorIdPaisPorNombre) {this.jTabbedPaneBusquedasProvincia.remove(jPanelBusquedaPorIdPaisPorNombreProvincia);}

			this.isVisibilidadFK_IdPais=isParaRegionNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasProvincia.remove(jPanelFK_IdPaisProvincia);}
		}
		
	}
	
	

	public String registrarSesionProvinciaParaBarrios() throws Exception {
		Boolean isPaginaPopupBarrio=false;

		try {

			if(this.provinciaSessionBean==null) {
				this.provinciaSessionBean=new ProvinciaSessionBean();
			}

			if(this.jInternalFrameDetalleFormProvincia.barrioSessionBean==null) {
				this.jInternalFrameDetalleFormProvincia.barrioSessionBean=new BarrioSessionBean();
			}

			this.jInternalFrameDetalleFormProvincia.barrioSessionBean.setsPathNavegacionActual(provinciaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+BarrioConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormProvincia.barrioSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupBarrio=this.jInternalFrameDetalleFormProvincia.barrioSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormProvincia.barrioSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeBarrio(true);
			this.jInternalFrameDetalleFormProvincia.barrioSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeBarrio(ProvinciaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormProvincia.barrioSessionBean.setisBusquedaDesdeForeignKeySesionProvincia(true);
			this.jInternalFrameDetalleFormProvincia.barrioSessionBean.setlidProvinciaActual(this.idProvinciaActual);

			provinciaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProvincia(true);
			provinciaSessionBean.setlIdProvinciaActualForeignKey(this.idProvinciaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionProvinciaParaCantones() throws Exception {
		Boolean isPaginaPopupCanton=false;

		try {

			if(this.provinciaSessionBean==null) {
				this.provinciaSessionBean=new ProvinciaSessionBean();
			}

			if(this.jInternalFrameDetalleFormProvincia.cantonSessionBean==null) {
				this.jInternalFrameDetalleFormProvincia.cantonSessionBean=new CantonSessionBean();
			}

			this.jInternalFrameDetalleFormProvincia.cantonSessionBean.setsPathNavegacionActual(provinciaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CantonConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormProvincia.cantonSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCanton=this.jInternalFrameDetalleFormProvincia.cantonSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormProvincia.cantonSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormProvincia.cantonSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCanton(false);
			this.jInternalFrameDetalleFormProvincia.cantonSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCanton(ProvinciaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormProvincia.cantonSessionBean.setisBusquedaDesdeForeignKeySesionProvincia(true);
			this.jInternalFrameDetalleFormProvincia.cantonSessionBean.setlidProvinciaActual(this.idProvinciaActual);

			provinciaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProvincia(true);
			provinciaSessionBean.setlIdProvinciaActualForeignKey(this.idProvinciaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionProvinciaParaDatoGeneralEmpleados() throws Exception {
		Boolean isPaginaPopupDatoGeneralEmpleado=false;

		try {

			if(this.provinciaSessionBean==null) {
				this.provinciaSessionBean=new ProvinciaSessionBean();
			}

			if(this.jInternalFrameDetalleFormProvincia.datogeneralempleadoSessionBean==null) {
				this.jInternalFrameDetalleFormProvincia.datogeneralempleadoSessionBean=new DatoGeneralEmpleadoSessionBean();
			}

			this.jInternalFrameDetalleFormProvincia.datogeneralempleadoSessionBean.setsPathNavegacionActual(provinciaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormProvincia.datogeneralempleadoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDatoGeneralEmpleado=this.jInternalFrameDetalleFormProvincia.datogeneralempleadoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormProvincia.datogeneralempleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado(true);
			this.jInternalFrameDetalleFormProvincia.datogeneralempleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado(ProvinciaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormProvincia.datogeneralempleadoSessionBean.setisBusquedaDesdeForeignKeySesionProvincia(true);
			this.jInternalFrameDetalleFormProvincia.datogeneralempleadoSessionBean.setlidProvinciaActual(this.idProvinciaActual);

			provinciaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProvincia(true);
			provinciaSessionBean.setlIdProvinciaActualForeignKey(this.idProvinciaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionProvinciaParaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(this.provinciaSessionBean==null) {
				this.provinciaSessionBean=new ProvinciaSessionBean();
			}

			if(this.jInternalFrameDetalleFormProvincia.empleadoSessionBean==null) {
				this.jInternalFrameDetalleFormProvincia.empleadoSessionBean=new EmpleadoSessionBean();
			}

			this.jInternalFrameDetalleFormProvincia.empleadoSessionBean.setsPathNavegacionActual(provinciaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormProvincia.empleadoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupEmpleado=this.jInternalFrameDetalleFormProvincia.empleadoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormProvincia.empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			this.jInternalFrameDetalleFormProvincia.empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(ProvinciaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormProvincia.empleadoSessionBean.setisBusquedaDesdeForeignKeySesionProvincia(true);
			this.jInternalFrameDetalleFormProvincia.empleadoSessionBean.setlidProvinciaActual(this.idProvinciaActual);

			provinciaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProvincia(true);
			provinciaSessionBean.setlIdProvinciaActualForeignKey(this.idProvinciaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionProvinciaParaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(this.provinciaSessionBean==null) {
				this.provinciaSessionBean=new ProvinciaSessionBean();
			}

			if(this.jInternalFrameDetalleFormProvincia.clienteSessionBean==null) {
				this.jInternalFrameDetalleFormProvincia.clienteSessionBean=new ClienteSessionBean();
			}

			this.jInternalFrameDetalleFormProvincia.clienteSessionBean.setsPathNavegacionActual(provinciaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormProvincia.clienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCliente=this.jInternalFrameDetalleFormProvincia.clienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormProvincia.clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			this.jInternalFrameDetalleFormProvincia.clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(ProvinciaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormProvincia.clienteSessionBean.setisBusquedaDesdeForeignKeySesionProvincia(true);
			this.jInternalFrameDetalleFormProvincia.clienteSessionBean.setlidProvinciaActual(this.idProvinciaActual);

			provinciaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProvincia(true);
			provinciaSessionBean.setlIdProvinciaActualForeignKey(this.idProvinciaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionProvinciaParaParametroCarteraDefectos() throws Exception {
		Boolean isPaginaPopupParametroCarteraDefecto=false;

		try {

			if(this.provinciaSessionBean==null) {
				this.provinciaSessionBean=new ProvinciaSessionBean();
			}

			if(this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoSessionBean==null) {
				this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoSessionBean=new ParametroCarteraDefectoSessionBean();
			}

			this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoSessionBean.setsPathNavegacionActual(provinciaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroCarteraDefecto=this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroCarteraDefecto(true);
			this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroCarteraDefecto(ProvinciaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoSessionBean.setisBusquedaDesdeForeignKeySesionProvincia(true);
			this.jInternalFrameDetalleFormProvincia.parametrocarteradefectoSessionBean.setlidProvinciaActual(this.idProvinciaActual);

			provinciaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProvincia(true);
			provinciaSessionBean.setlIdProvinciaActualForeignKey(this.idProvinciaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionProvinciaParaCiudades() throws Exception {
		Boolean isPaginaPopupCiudad=false;

		try {

			if(this.provinciaSessionBean==null) {
				this.provinciaSessionBean=new ProvinciaSessionBean();
			}

			if(this.jInternalFrameDetalleFormProvincia.ciudadSessionBean==null) {
				this.jInternalFrameDetalleFormProvincia.ciudadSessionBean=new CiudadSessionBean();
			}

			this.jInternalFrameDetalleFormProvincia.ciudadSessionBean.setsPathNavegacionActual(provinciaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CiudadConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormProvincia.ciudadSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCiudad=this.jInternalFrameDetalleFormProvincia.ciudadSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormProvincia.ciudadSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormProvincia.ciudadSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCiudad(false);
			this.jInternalFrameDetalleFormProvincia.ciudadSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCiudad(ProvinciaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormProvincia.ciudadSessionBean.setisBusquedaDesdeForeignKeySesionProvincia(true);
			this.jInternalFrameDetalleFormProvincia.ciudadSessionBean.setlidProvinciaActual(this.idProvinciaActual);

			provinciaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProvincia(true);
			provinciaSessionBean.setlIdProvinciaActualForeignKey(this.idProvinciaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ProvinciaSessionBean provinciaSessionBean=new ProvinciaSessionBean();
		
		if(this.provinciaSessionBean==null) {
			this.provinciaSessionBean=new ProvinciaSessionBean();
		}
		
		this.provinciaSessionBean.setsUltimaBusquedaProvincia(this.getsAccionBusqueda());
		this.provinciaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.provinciaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorIdPaisPorNombre")) {
			provinciaSessionBean.setid_pais(this.getid_paisBusquedaPorIdPaisPorNombre());	
			provinciaSessionBean.setnombre(this.getnombreBusquedaPorIdPaisPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			provinciaSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ProvinciaSessionBean provinciaSessionBean=new ProvinciaSessionBean();
		
		if(this.provinciaSessionBean==null) {
			this.provinciaSessionBean=new ProvinciaSessionBean();
		}
		
		if(this.provinciaSessionBean.getsUltimaBusquedaProvincia()!=null&&!this.provinciaSessionBean.getsUltimaBusquedaProvincia().equals("")) {
			this.setsAccionBusqueda(provinciaSessionBean.getsUltimaBusquedaProvincia());
			this.setiNumeroPaginacion(provinciaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(provinciaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorIdPaisPorNombre")) {
				this.setid_paisBusquedaPorIdPaisPorNombre(provinciaSessionBean.getid_pais());
				provinciaSessionBean.setid_pais(-1L);
				this.setnombreBusquedaPorIdPaisPorNombre(provinciaSessionBean.getnombre());
				provinciaSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(provinciaSessionBean.getid_pais());
				provinciaSessionBean.setid_pais(-1L);
			}
		}
		
		this.provinciaSessionBean.setsUltimaBusquedaProvincia("");
		this.provinciaSessionBean.setiNumeroPaginacion(ProvinciaConstantesFunciones.INUMEROPAGINACION);
		this.provinciaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProvincia(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProvincia() {
		this.updateBorderResaltarBusquedasFormularioProvincia();
		this.updateVisibilidadBusquedasFormularioProvincia();
		this.updateHabilitarBusquedasFormularioProvincia();
	}
	
	public void updateBorderResaltarBusquedasFormularioProvincia() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProvincia.getComponents().length>0) {
	

		if(this.provinciaConstantesFunciones.resaltarBusquedaPorIdPaisPorNombreProvincia!=null) {
			index= this.jTabbedPaneBusquedasProvincia.indexOfComponent(this.jPanelBusquedaPorIdPaisPorNombreProvincia);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProvincia.getComponent(index);
				jPanel.setBorder(this.provinciaConstantesFunciones.resaltarBusquedaPorIdPaisPorNombreProvincia);
			}
		}

		if(this.provinciaConstantesFunciones.resaltarFK_IdPaisProvincia!=null) {
			index= this.jTabbedPaneBusquedasProvincia.indexOfComponent(this.jPanelFK_IdPaisProvincia);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProvincia.getComponent(index);
				jPanel.setBorder(this.provinciaConstantesFunciones.resaltarFK_IdPaisProvincia);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProvincia() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProvincia.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProvincia.indexOfComponent(this.jPanelBusquedaPorIdPaisPorNombreProvincia);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProvincia.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.provinciaConstantesFunciones.mostrarBusquedaPorIdPaisPorNombreProvincia);
			if(!this.provinciaConstantesFunciones.mostrarBusquedaPorIdPaisPorNombreProvincia && index>-1) {
				this.jTabbedPaneBusquedasProvincia.remove(index);
			}

			index= this.jTabbedPaneBusquedasProvincia.indexOfComponent(this.jPanelFK_IdPaisProvincia);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProvincia.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.provinciaConstantesFunciones.mostrarFK_IdPaisProvincia);
			if(!this.provinciaConstantesFunciones.mostrarFK_IdPaisProvincia && index>-1) {
				this.jTabbedPaneBusquedasProvincia.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProvincia() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProvincia.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProvincia.indexOfComponent(this.jPanelBusquedaPorIdPaisPorNombreProvincia);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProvincia.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.provinciaConstantesFunciones.activarBusquedaPorIdPaisPorNombreProvincia);
				this.jTabbedPaneBusquedasProvincia.setEnabledAt(index,this.provinciaConstantesFunciones.activarBusquedaPorIdPaisPorNombreProvincia);
			}

			index= this.jTabbedPaneBusquedasProvincia.indexOfComponent(this.jPanelFK_IdPaisProvincia);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProvincia.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.provinciaConstantesFunciones.activarFK_IdPaisProvincia);
				this.jTabbedPaneBusquedasProvincia.setEnabledAt(index,this.provinciaConstantesFunciones.activarFK_IdPaisProvincia);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProvincia(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorIdPaisPorNombre")) {
			index= this.jTabbedPaneBusquedasProvincia.indexOfComponent(this.jPanelBusquedaPorIdPaisPorNombreProvincia);

			this.jTabbedPaneBusquedasProvincia.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProvincia.getComponent(index);

			this.provinciaConstantesFunciones.setResaltarBusquedaPorIdPaisPorNombreProvincia(resaltar);

			jPanel.setBorder(this.provinciaConstantesFunciones.resaltarBusquedaPorIdPaisPorNombreProvincia);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasProvincia.indexOfComponent(this.jPanelFK_IdPaisProvincia);

			this.jTabbedPaneBusquedasProvincia.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProvincia.getComponent(index);

			this.provinciaConstantesFunciones.setResaltarFK_IdPaisProvincia(resaltar);

			jPanel.setBorder(this.provinciaConstantesFunciones.resaltarFK_IdPaisProvincia);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProvincia.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProvincia() throws Exception {

		if(this.jInternalFrameDetalleFormProvincia==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProvincia();
		this.updateVisibilidadResaltarControlesFormularioProvincia();
		this.updateHabilitarResaltarControlesFormularioProvincia();
		
	}
	
	public void updateBorderResaltarControlesFormularioProvincia() throws Exception {
		if(this.jInternalFrameDetalleFormProvincia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.provinciaConstantesFunciones.resaltaridProvincia!=null && this.jInternalFrameDetalleFormProvincia!=null) {this.jInternalFrameDetalleFormProvincia.jLabelidProvincia.setBorder(this.provinciaConstantesFunciones.resaltaridProvincia);}
		if(this.provinciaConstantesFunciones.resaltarid_paisProvincia!=null && this.jInternalFrameDetalleFormProvincia!=null) {this.jInternalFrameDetalleFormProvincia.jComboBoxid_paisProvincia.setBorder(this.provinciaConstantesFunciones.resaltarid_paisProvincia);}
		if(this.provinciaConstantesFunciones.resaltarid_regionProvincia!=null && this.jInternalFrameDetalleFormProvincia!=null) {this.jInternalFrameDetalleFormProvincia.jComboBoxid_regionProvincia.setBorder(this.provinciaConstantesFunciones.resaltarid_regionProvincia);}
		if(this.provinciaConstantesFunciones.resaltarcodigoProvincia!=null && this.jInternalFrameDetalleFormProvincia!=null) {this.jInternalFrameDetalleFormProvincia.jTextFieldcodigoProvincia.setBorder(this.provinciaConstantesFunciones.resaltarcodigoProvincia);}
		if(this.provinciaConstantesFunciones.resaltarnombreProvincia!=null && this.jInternalFrameDetalleFormProvincia!=null) {this.jInternalFrameDetalleFormProvincia.jTextAreanombreProvincia.setBorder(this.provinciaConstantesFunciones.resaltarnombreProvincia);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProvincia() throws Exception {		
		if(this.jInternalFrameDetalleFormProvincia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProvincia!=null) {
	
		//this.jInternalFrameDetalleFormProvincia.jLabelidProvincia.setVisible(this.provinciaConstantesFunciones.mostraridProvincia);
		this.jInternalFrameDetalleFormProvincia.jPanelidProvincia.setVisible(this.provinciaConstantesFunciones.mostraridProvincia);
		//this.jInternalFrameDetalleFormProvincia.jComboBoxid_paisProvincia.setVisible(this.provinciaConstantesFunciones.mostrarid_paisProvincia);
		this.jInternalFrameDetalleFormProvincia.jPanelid_paisProvincia.setVisible(this.provinciaConstantesFunciones.mostrarid_paisProvincia);
		//this.jInternalFrameDetalleFormProvincia.jComboBoxid_regionProvincia.setVisible(this.provinciaConstantesFunciones.mostrarid_regionProvincia);
		this.jInternalFrameDetalleFormProvincia.jPanelid_regionProvincia.setVisible(this.provinciaConstantesFunciones.mostrarid_regionProvincia);
		//this.jInternalFrameDetalleFormProvincia.jTextFieldcodigoProvincia.setVisible(this.provinciaConstantesFunciones.mostrarcodigoProvincia);
		this.jInternalFrameDetalleFormProvincia.jPanelcodigoProvincia.setVisible(this.provinciaConstantesFunciones.mostrarcodigoProvincia);
		//this.jInternalFrameDetalleFormProvincia.jTextAreanombreProvincia.setVisible(this.provinciaConstantesFunciones.mostrarnombreProvincia);
		this.jInternalFrameDetalleFormProvincia.jPanelnombreProvincia.setVisible(this.provinciaConstantesFunciones.mostrarnombreProvincia);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProvincia() throws Exception {
		if(this.jInternalFrameDetalleFormProvincia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProvincia!=null) {
	
		this.jInternalFrameDetalleFormProvincia.jLabelidProvincia.setEnabled(this.provinciaConstantesFunciones.activaridProvincia);
		this.jInternalFrameDetalleFormProvincia.jComboBoxid_paisProvincia.setEnabled(this.provinciaConstantesFunciones.activarid_paisProvincia);
		this.jInternalFrameDetalleFormProvincia.jComboBoxid_regionProvincia.setEnabled(this.provinciaConstantesFunciones.activarid_regionProvincia);
		this.jInternalFrameDetalleFormProvincia.jTextFieldcodigoProvincia.setEnabled(this.provinciaConstantesFunciones.activarcodigoProvincia);
		this.jInternalFrameDetalleFormProvincia.jTextAreanombreProvincia.setEnabled(this.provinciaConstantesFunciones.activarnombreProvincia);
		}
	}
	
		
}