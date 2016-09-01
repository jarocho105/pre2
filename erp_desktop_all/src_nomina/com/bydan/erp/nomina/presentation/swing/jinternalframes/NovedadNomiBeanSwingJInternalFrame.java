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

import com.bydan.erp.nomina.util.NovedadNomiConstantesFunciones;
import com.bydan.erp.nomina.util.NovedadNomiParameterReturnGeneral;
//import com.bydan.erp.nomina.util.NovedadNomiParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.NovedadNomiBean;
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
public class NovedadNomiBeanSwingJInternalFrame extends NovedadNomiJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(NovedadNomiBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<NovedadNomi> novedadnomiValidator = new ClassValidator<NovedadNomi>(NovedadNomi.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public NovedadNomi novedadnomi;	
	public NovedadNomi novedadnomiAux;
	public NovedadNomi novedadnomiAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public NovedadNomi novedadnomiTotales;
	public Long idNovedadNomiActual;
	public Long iIdNuevoNovedadNomi=0L;
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

	public String sFinalQueryComboEmpleadoAutoriza="";

	public List<Empleado> empleadoautorizasForeignKey;

	public List<Empleado> getempleadoautorizasForeignKey() {
		return empleadoautorizasForeignKey;
	}

	public void setempleadoautorizasForeignKey(List<Empleado> empleadoautorizasForeignKey) {
		this.empleadoautorizasForeignKey = empleadoautorizasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empleado empleadoautorizaForeignKey;

	public Empleado getempleadoautorizaForeignKey() {
		return empleadoautorizaForeignKey;
	}

	public void setempleadoautorizaForeignKey(Empleado empleadoautorizaForeignKey) {
		this.empleadoautorizaForeignKey = empleadoautorizaForeignKey;
	}

	public String sFinalQueryComboTipoNovedadNomi="";

	public List<TipoNovedadNomi> tiponovedadnomisForeignKey;

	public List<TipoNovedadNomi> gettiponovedadnomisForeignKey() {
		return tiponovedadnomisForeignKey;
	}

	public void settiponovedadnomisForeignKey(List<TipoNovedadNomi> tiponovedadnomisForeignKey) {
		this.tiponovedadnomisForeignKey = tiponovedadnomisForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoNovedadNomi tiponovedadnomiForeignKey;

	public TipoNovedadNomi gettiponovedadnomiForeignKey() {
		return tiponovedadnomiForeignKey;
	}

	public void settiponovedadnomiForeignKey(TipoNovedadNomi tiponovedadnomiForeignKey) {
		this.tiponovedadnomiForeignKey = tiponovedadnomiForeignKey;
	}

	public String sFinalQueryComboEstadoNovedadNomi="";

	public List<EstadoNovedadNomi> estadonovedadnomisForeignKey;

	public List<EstadoNovedadNomi> getestadonovedadnomisForeignKey() {
		return estadonovedadnomisForeignKey;
	}

	public void setestadonovedadnomisForeignKey(List<EstadoNovedadNomi> estadonovedadnomisForeignKey) {
		this.estadonovedadnomisForeignKey = estadonovedadnomisForeignKey;
	}

	//OBJETO FK ACTUAL
	public EstadoNovedadNomi estadonovedadnomiForeignKey;

	public EstadoNovedadNomi getestadonovedadnomiForeignKey() {
		return estadonovedadnomiForeignKey;
	}

	public void setestadonovedadnomiForeignKey(EstadoNovedadNomi estadonovedadnomiForeignKey) {
		this.estadonovedadnomiForeignKey = estadonovedadnomiForeignKey;
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
	
	public Boolean isPermisoTodoNovedadNomi;
	public Boolean isPermisoNuevoNovedadNomi;
	public Boolean isPermisoActualizarNovedadNomi;
	public Boolean isPermisoActualizarOriginalNovedadNomi;
	public Boolean isPermisoEliminarNovedadNomi;
	public Boolean isPermisoGuardarCambiosNovedadNomi;
	public Boolean isPermisoConsultaNovedadNomi;
	public Boolean isPermisoBusquedaNovedadNomi;
	public Boolean isPermisoReporteNovedadNomi;
	public Boolean isPermisoPaginacionMedioNovedadNomi;
	public Boolean isPermisoPaginacionAltoNovedadNomi;
	public Boolean isPermisoPaginacionTodoNovedadNomi;
	public Boolean isPermisoCopiarNovedadNomi;
	public Boolean isPermisoVerFormNovedadNomi;
	public Boolean isPermisoDuplicarNovedadNomi;
	public Boolean isPermisoOrdenNovedadNomi;
	
	
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
	
	public NovedadNomiParameterReturnGeneral novedadnomiReturnGeneral;
	public NovedadNomiParameterReturnGeneral novedadnomiParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoNovedadNomi=false;
	public Boolean esParaAccionDesdeFormularioNovedadNomi=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected NovedadNomiSessionBeanAdditional novedadnomiSessionBeanAdditional=null;
	
	public NovedadNomiSessionBeanAdditional getNovedadNomiSessionBeanAdditional() {
		return this.novedadnomiSessionBeanAdditional;
	}
	
	public void setNovedadNomiSessionBeanAdditional(NovedadNomiSessionBeanAdditional novedadnomiSessionBeanAdditional) {
		try {
			this.novedadnomiSessionBeanAdditional=novedadnomiSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected NovedadNomiBeanSwingJInternalFrameAdditional novedadnomiBeanSwingJInternalFrameAdditional=null;
	//public class NovedadNomiBeanSwingJInternalFrame
	
	public NovedadNomiBeanSwingJInternalFrameAdditional getNovedadNomiBeanSwingJInternalFrameAdditional() {
		return this.novedadnomiBeanSwingJInternalFrameAdditional;
	}
	
	public void setNovedadNomiBeanSwingJInternalFrameAdditional(NovedadNomiBeanSwingJInternalFrameAdditional novedadnomiBeanSwingJInternalFrameAdditional) {
		try {
			this.novedadnomiBeanSwingJInternalFrameAdditional=novedadnomiBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public NovedadNomiLogic novedadnomiLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public NovedadNomi novedadnomiBean;
	public NovedadNomiConstantesFunciones novedadnomiConstantesFunciones;
	//public NovedadNomiParameterReturnGeneral novedadnomiReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EmpleadoLogic empleadoLogic;
	public EmpleadoLogic empleadoautorizaLogic;
	public TipoNovedadNomiLogic tiponovedadnomiLogic;
	public EstadoNovedadNomiLogic estadonovedadnomiLogic;
	
	//PARAMETROS
	
	
	//public List<NovedadNomi> novedadnomis;	
	//public List<NovedadNomi> novedadnomisEliminados;
	//public List<NovedadNomi> novedadnomisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoNovedadNomi=false;
	public Boolean isVisibilidadCeldaDuplicarNovedadNomi=true;
	public Boolean isVisibilidadCeldaCopiarNovedadNomi=true;
	public Boolean isVisibilidadCeldaVerFormNovedadNomi=true;
	public Boolean isVisibilidadCeldaOrdenNovedadNomi=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesNovedadNomi=false;
	public Boolean isVisibilidadCeldaModificarNovedadNomi=false;
	public Boolean isVisibilidadCeldaActualizarNovedadNomi=false;
	public Boolean isVisibilidadCeldaEliminarNovedadNomi=false;
	public Boolean isVisibilidadCeldaCancelarNovedadNomi=false;
	public Boolean isVisibilidadCeldaGuardarNovedadNomi=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosNovedadNomi=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpleadoAutoriza=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstadoNovedadNomi=false;
	public Boolean isVisibilidadFK_IdTipoNovedadNomi=false;
	
	public Long getiIdNuevoNovedadNomi() {
		return this.iIdNuevoNovedadNomi;
	}

	public void setiIdNuevoNovedadNomi(Long iIdNuevoNovedadNomi) {
		this.iIdNuevoNovedadNomi = iIdNuevoNovedadNomi;
	}
	
	public Long getidNovedadNomiActual() {
		return this.idNovedadNomiActual;
	}

	public void setidNovedadNomiActual(Long idNovedadNomiActual) {
		this.idNovedadNomiActual = idNovedadNomiActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public NovedadNomi getnovedadnomi() {
		return this.novedadnomi;
	}

	public void setnovedadnomi(NovedadNomi novedadnomi) {
		this.novedadnomi = novedadnomi;
	}
	
	public NovedadNomi getnovedadnomiAux() {
		return this.novedadnomiAux;
	}

	public void setnovedadnomiAux(NovedadNomi novedadnomiAux) {
		this.novedadnomiAux = novedadnomiAux;
	}				
	
	public NovedadNomi getnovedadnomiAnterior() {
		return this.novedadnomiAnterior;
	}

	public void setnovedadnomiAnterior(NovedadNomi novedadnomiAnterior) {
		this.novedadnomiAnterior = novedadnomiAnterior;
	}	
	
	public NovedadNomi getnovedadnomiTotales() {
		return this.novedadnomiTotales;
	}

	public void setnovedadnomiTotales(NovedadNomi novedadnomiTotales) {
		this.novedadnomiTotales = novedadnomiTotales;
	}	
	
	public NovedadNomi getnovedadnomiBean() {
		return this.novedadnomiBean;
	}

	public void setnovedadnomiBean(NovedadNomi novedadnomiBean) {
		this.novedadnomiBean = novedadnomiBean;
	}	
	
	public NovedadNomiParameterReturnGeneral getnovedadnomiReturnGeneral() {
		return this.novedadnomiReturnGeneral;
	}

	public void setnovedadnomiReturnGeneral(NovedadNomiParameterReturnGeneral novedadnomiReturnGeneral) {
		this.novedadnomiReturnGeneral = novedadnomiReturnGeneral;
	}	
	
	
	public Long id_empleadoFK_IdEmpleado=-1L;

	public Long getid_empleadoFK_IdEmpleado() {
		return this.id_empleadoFK_IdEmpleado;
	}

	public void setid_empleadoFK_IdEmpleado(Long id_empleadoFK_IdEmpleado) {
		this.id_empleadoFK_IdEmpleado = id_empleadoFK_IdEmpleado;
	}

	public Long id_empleado_autorizaFK_IdEmpleadoAutoriza=-1L;

	public Long getid_empleado_autorizaFK_IdEmpleadoAutoriza() {
		return this.id_empleado_autorizaFK_IdEmpleadoAutoriza;
	}

	public void setid_empleado_autorizaFK_IdEmpleadoAutoriza(Long id_empleado_autorizaFK_IdEmpleadoAutoriza) {
		this.id_empleado_autorizaFK_IdEmpleadoAutoriza = id_empleado_autorizaFK_IdEmpleadoAutoriza;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_estado_novedad_nomiFK_IdEstadoNovedadNomi=-1L;

	public Long getid_estado_novedad_nomiFK_IdEstadoNovedadNomi() {
		return this.id_estado_novedad_nomiFK_IdEstadoNovedadNomi;
	}

	public void setid_estado_novedad_nomiFK_IdEstadoNovedadNomi(Long id_estado_novedad_nomiFK_IdEstadoNovedadNomi) {
		this.id_estado_novedad_nomiFK_IdEstadoNovedadNomi = id_estado_novedad_nomiFK_IdEstadoNovedadNomi;
	}

	public Long id_tipo_novedad_nomiFK_IdTipoNovedadNomi=-1L;

	public Long getid_tipo_novedad_nomiFK_IdTipoNovedadNomi() {
		return this.id_tipo_novedad_nomiFK_IdTipoNovedadNomi;
	}

	public void setid_tipo_novedad_nomiFK_IdTipoNovedadNomi(Long id_tipo_novedad_nomiFK_IdTipoNovedadNomi) {
		this.id_tipo_novedad_nomiFK_IdTipoNovedadNomi = id_tipo_novedad_nomiFK_IdTipoNovedadNomi;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public NovedadNomiLogic getNovedadNomiLogic()	{		
		return novedadnomiLogic;
	}

	public void setNovedadNomiLogic(NovedadNomiLogic novedadnomiLogic) {
		this.novedadnomiLogic = novedadnomiLogic;
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
	
	public Boolean getIsEsNuevoNovedadNomi() {
		return isEsNuevoNovedadNomi;
	}

	public void setIsEsNuevoNovedadNomi(Boolean isEsNuevoNovedadNomi) {
		this.isEsNuevoNovedadNomi = isEsNuevoNovedadNomi;
	}

	public Boolean getEsParaAccionDesdeFormularioNovedadNomi() {
		return esParaAccionDesdeFormularioNovedadNomi;
	}
	
	public void setEsParaAccionDesdeFormularioNovedadNomi(Boolean esParaAccionDesdeFormularioNovedadNomi) {
		this.esParaAccionDesdeFormularioNovedadNomi = esParaAccionDesdeFormularioNovedadNomi;
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

			if(this.novedadnomiSessionBean==null) {
				this.novedadnomiSessionBean=new NovedadNomiSessionBean();
			}

			if(!this.novedadnomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(novedadnomiSessionBean.getlidEmpresaActual());
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

			if(this.novedadnomiSessionBean==null) {
				this.novedadnomiSessionBean=new NovedadNomiSessionBean();
			}

			if(!this.novedadnomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(novedadnomiSessionBean.getlidEmpleadoActual());
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

	public void cargarCombosEmpleadoAutorizasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empleadoautorizasForeignKey=new ArrayList<Empleado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpleadoLogic empleadoLogic=new EmpleadoLogic();

			//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.novedadnomiSessionBean==null) {
				this.novedadnomiSessionBean=new NovedadNomiSessionBean();
			}

			if(!this.novedadnomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpleadoAutoriza()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empleadoautorizaLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

					empleadoLogic.getTodosEmpleadosWithConnection(sFinalQuery,new Pagination());

					this.empleadoautorizasForeignKey=empleadoLogic.getEmpleados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpleadoAutoriza(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(novedadnomiSessionBean.getlidEmpleadoAutorizaActual());
					this.empleadoautorizasForeignKey.add(empleadoLogic.getEmpleado());
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

	public void cargarCombosTipoNovedadNomisForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tiponovedadnomisForeignKey=new ArrayList<TipoNovedadNomi>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoNovedadNomiLogic tiponovedadnomiLogic=new TipoNovedadNomiLogic();

			//tiponovedadnomiLogic.getTipoNovedadNomiDataAccess().setIsForForeingKeyData(true);

			if(this.novedadnomiSessionBean==null) {
				this.novedadnomiSessionBean=new NovedadNomiSessionBean();
			}

			if(!this.novedadnomiSessionBean.getisBusquedaDesdeForeignKeySesionTipoNovedadNomi()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tiponovedadnomiLogic.getTipoNovedadNomiDataAccess().setIsForForeingKeyData(true);

					tiponovedadnomiLogic.getTodosTipoNovedadNomisWithConnection(sFinalQuery,new Pagination());

					this.tiponovedadnomisForeignKey=tiponovedadnomiLogic.getTipoNovedadNomis();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoNovedadNomi(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiponovedadnomiLogic.getEntityWithConnection(novedadnomiSessionBean.getlidTipoNovedadNomiActual());
					this.tiponovedadnomisForeignKey.add(tiponovedadnomiLogic.getTipoNovedadNomi());
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

	public void cargarCombosEstadoNovedadNomisForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estadonovedadnomisForeignKey=new ArrayList<EstadoNovedadNomi>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstadoNovedadNomiLogic estadonovedadnomiLogic=new EstadoNovedadNomiLogic();

			//estadonovedadnomiLogic.getEstadoNovedadNomiDataAccess().setIsForForeingKeyData(true);

			if(this.novedadnomiSessionBean==null) {
				this.novedadnomiSessionBean=new NovedadNomiSessionBean();
			}

			if(!this.novedadnomiSessionBean.getisBusquedaDesdeForeignKeySesionEstadoNovedadNomi()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadonovedadnomiLogic.getEstadoNovedadNomiDataAccess().setIsForForeingKeyData(true);

					estadonovedadnomiLogic.getTodosEstadoNovedadNomisWithConnection(sFinalQuery,new Pagination());

					this.estadonovedadnomisForeignKey=estadonovedadnomiLogic.getEstadoNovedadNomis();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstadoNovedadNomi(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadonovedadnomiLogic.getEntityWithConnection(novedadnomiSessionBean.getlidEstadoNovedadNomiActual());
					this.estadonovedadnomisForeignKey.add(estadonovedadnomiLogic.getEstadoNovedadNomi());
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

					if(this.novedadnomi!=null) {
						this.novedadnomi.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
						this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empresaNovedadNomi.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaNovedadNomi.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
						if(this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empresaNovedadNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empresaNovedadNomi.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaNovedadNomiGenerico)throws Exception
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
				jComboBoxid_empresaNovedadNomiGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaNovedadNomiGenerico!=null && jComboBoxid_empresaNovedadNomiGenerico.getItemCount()>0) {
					jComboBoxid_empresaNovedadNomiGenerico.setSelectedIndex(0);
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

					if(this.novedadnomi!=null) {
						this.novedadnomi.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
						this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empleadoNovedadNomi.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoNovedadNomi.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
						if(this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empleadoNovedadNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empleadoNovedadNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoNovedadNomi!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoNovedadNomi.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoNovedadNomi!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoNovedadNomi.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoNovedadNomi.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoNovedadNomi.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoNovedadNomiGenerico)throws Exception
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
				jComboBoxid_empleadoNovedadNomiGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoNovedadNomiGenerico!=null && jComboBoxid_empleadoNovedadNomiGenerico.getItemCount()>0) {
					jComboBoxid_empleadoNovedadNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEmpleadoAutorizaForeignKey(Long idEmpleadoAutorizaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empleado  empleadoautorizaTemp=null;

			for(Empleado empleadoautorizaAux:empleadoautorizasForeignKey) {
				if(empleadoautorizaAux.getId()!=null && empleadoautorizaAux.getId().equals(idEmpleadoAutorizaSeleccionado)) {
					empleadoautorizaTemp=empleadoautorizaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empleadoautorizaTemp!=null) {

					if(this.novedadnomi!=null) {
						this.novedadnomi.setEmpleadoAutoriza(empleadoautorizaTemp);
					}

					if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
						this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empleado_autorizaNovedadNomi.setSelectedItem(empleadoautorizaTemp);
					}
				} else {
					//jComboBoxid_empleado_autorizaNovedadNomi.setSelectedItem(empleadoautorizaTemp);
					if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
						if(this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empleado_autorizaNovedadNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empleado_autorizaNovedadNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleadoAutoriza") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoautorizaTemp!=null && jComboBoxid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomi!=null) {
						jComboBoxid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomi.setSelectedItem(empleadoautorizaTemp);
					} else {
						if(jComboBoxid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomi!=null) {
							//jComboBoxid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomi.setSelectedItem(empleadoautorizaTemp);
							if(jComboBoxid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomi.getItemCount()>0) {
								jComboBoxid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomi.setSelectedIndex(0);
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

	public String getActualEmpleadoAutorizaForeignKeyDescripcion(Long idEmpleadoAutorizaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empleado  empleadoautorizaTemp=null;

			for(Empleado empleadoautorizaAux:empleadoautorizasForeignKey) {
				if(empleadoautorizaAux.getId()!=null && empleadoautorizaAux.getId().equals(idEmpleadoAutorizaSeleccionado)) {
					empleadoautorizaTemp=empleadoautorizaAux;
					break;
				}
			}


			sDescripcion=EmpleadoConstantesFunciones.getEmpleadoDescripcion(empleadoautorizaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpleadoAutorizaForeignKeyGenerico(Long idEmpleadoAutorizaSeleccionado,JComboBox jComboBoxid_empleado_autorizaNovedadNomiGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoautorizaTemp=null;

			for(Empleado empleadoautorizaAux:empleadoautorizasForeignKey) {
				if(empleadoautorizaAux.getId()!=null && empleadoautorizaAux.getId().equals(idEmpleadoAutorizaSeleccionado)) {
					empleadoautorizaTemp=empleadoautorizaAux;
					break;
				}
			}

			if(empleadoautorizaTemp!=null) {
				jComboBoxid_empleado_autorizaNovedadNomiGenerico.setSelectedItem(empleadoautorizaTemp);
			} else {
				if(jComboBoxid_empleado_autorizaNovedadNomiGenerico!=null && jComboBoxid_empleado_autorizaNovedadNomiGenerico.getItemCount()>0) {
					jComboBoxid_empleado_autorizaNovedadNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoNovedadNomiForeignKey(Long idTipoNovedadNomiSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoNovedadNomi  tiponovedadnomiTemp=null;

			for(TipoNovedadNomi tiponovedadnomiAux:tiponovedadnomisForeignKey) {
				if(tiponovedadnomiAux.getId()!=null && tiponovedadnomiAux.getId().equals(idTipoNovedadNomiSeleccionado)) {
					tiponovedadnomiTemp=tiponovedadnomiAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tiponovedadnomiTemp!=null) {

					if(this.novedadnomi!=null) {
						this.novedadnomi.setTipoNovedadNomi(tiponovedadnomiTemp);
					}

					if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
						this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_tipo_novedad_nomiNovedadNomi.setSelectedItem(tiponovedadnomiTemp);
					}
				} else {
					//jComboBoxid_tipo_novedad_nomiNovedadNomi.setSelectedItem(tiponovedadnomiTemp);
					if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
						if(this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_tipo_novedad_nomiNovedadNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_tipo_novedad_nomiNovedadNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoNovedadNomi") || sFormularioTipoBusqueda.equals("Todos")){
					if(tiponovedadnomiTemp!=null && jComboBoxid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomi!=null) {
						jComboBoxid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomi.setSelectedItem(tiponovedadnomiTemp);
					} else {
						if(jComboBoxid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomi!=null) {
							//jComboBoxid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomi.setSelectedItem(tiponovedadnomiTemp);
							if(jComboBoxid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomi.getItemCount()>0) {
								jComboBoxid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomi.setSelectedIndex(0);
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

	public String getActualTipoNovedadNomiForeignKeyDescripcion(Long idTipoNovedadNomiSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoNovedadNomi  tiponovedadnomiTemp=null;

			for(TipoNovedadNomi tiponovedadnomiAux:tiponovedadnomisForeignKey) {
				if(tiponovedadnomiAux.getId()!=null && tiponovedadnomiAux.getId().equals(idTipoNovedadNomiSeleccionado)) {
					tiponovedadnomiTemp=tiponovedadnomiAux;
					break;
				}
			}


			sDescripcion=TipoNovedadNomiConstantesFunciones.getTipoNovedadNomiDescripcion(tiponovedadnomiTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoNovedadNomiForeignKeyGenerico(Long idTipoNovedadNomiSeleccionado,JComboBox jComboBoxid_tipo_novedad_nomiNovedadNomiGenerico)throws Exception
	{
		try
		{
			TipoNovedadNomi  tiponovedadnomiTemp=null;

			for(TipoNovedadNomi tiponovedadnomiAux:tiponovedadnomisForeignKey) {
				if(tiponovedadnomiAux.getId()!=null && tiponovedadnomiAux.getId().equals(idTipoNovedadNomiSeleccionado)) {
					tiponovedadnomiTemp=tiponovedadnomiAux;
					break;
				}
			}

			if(tiponovedadnomiTemp!=null) {
				jComboBoxid_tipo_novedad_nomiNovedadNomiGenerico.setSelectedItem(tiponovedadnomiTemp);
			} else {
				if(jComboBoxid_tipo_novedad_nomiNovedadNomiGenerico!=null && jComboBoxid_tipo_novedad_nomiNovedadNomiGenerico.getItemCount()>0) {
					jComboBoxid_tipo_novedad_nomiNovedadNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstadoNovedadNomiForeignKey(Long idEstadoNovedadNomiSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			EstadoNovedadNomi  estadonovedadnomiTemp=null;

			for(EstadoNovedadNomi estadonovedadnomiAux:estadonovedadnomisForeignKey) {
				if(estadonovedadnomiAux.getId()!=null && estadonovedadnomiAux.getId().equals(idEstadoNovedadNomiSeleccionado)) {
					estadonovedadnomiTemp=estadonovedadnomiAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estadonovedadnomiTemp!=null) {

					if(this.novedadnomi!=null) {
						this.novedadnomi.setEstadoNovedadNomi(estadonovedadnomiTemp);
					}

					if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
						this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_estado_novedad_nomiNovedadNomi.setSelectedItem(estadonovedadnomiTemp);
					}
				} else {
					//jComboBoxid_estado_novedad_nomiNovedadNomi.setSelectedItem(estadonovedadnomiTemp);
					if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
						if(this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_estado_novedad_nomiNovedadNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_estado_novedad_nomiNovedadNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstadoNovedadNomi") || sFormularioTipoBusqueda.equals("Todos")){
					if(estadonovedadnomiTemp!=null && jComboBoxid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomi!=null) {
						jComboBoxid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomi.setSelectedItem(estadonovedadnomiTemp);
					} else {
						if(jComboBoxid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomi!=null) {
							//jComboBoxid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomi.setSelectedItem(estadonovedadnomiTemp);
							if(jComboBoxid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomi.getItemCount()>0) {
								jComboBoxid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomi.setSelectedIndex(0);
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

	public String getActualEstadoNovedadNomiForeignKeyDescripcion(Long idEstadoNovedadNomiSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			EstadoNovedadNomi  estadonovedadnomiTemp=null;

			for(EstadoNovedadNomi estadonovedadnomiAux:estadonovedadnomisForeignKey) {
				if(estadonovedadnomiAux.getId()!=null && estadonovedadnomiAux.getId().equals(idEstadoNovedadNomiSeleccionado)) {
					estadonovedadnomiTemp=estadonovedadnomiAux;
					break;
				}
			}


			sDescripcion=EstadoNovedadNomiConstantesFunciones.getEstadoNovedadNomiDescripcion(estadonovedadnomiTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstadoNovedadNomiForeignKeyGenerico(Long idEstadoNovedadNomiSeleccionado,JComboBox jComboBoxid_estado_novedad_nomiNovedadNomiGenerico)throws Exception
	{
		try
		{
			EstadoNovedadNomi  estadonovedadnomiTemp=null;

			for(EstadoNovedadNomi estadonovedadnomiAux:estadonovedadnomisForeignKey) {
				if(estadonovedadnomiAux.getId()!=null && estadonovedadnomiAux.getId().equals(idEstadoNovedadNomiSeleccionado)) {
					estadonovedadnomiTemp=estadonovedadnomiAux;
					break;
				}
			}

			if(estadonovedadnomiTemp!=null) {
				jComboBoxid_estado_novedad_nomiNovedadNomiGenerico.setSelectedItem(estadonovedadnomiTemp);
			} else {
				if(jComboBoxid_estado_novedad_nomiNovedadNomiGenerico!=null && jComboBoxid_estado_novedad_nomiNovedadNomiGenerico.getItemCount()>0) {
					jComboBoxid_estado_novedad_nomiNovedadNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(NovedadNomi novedadnomi,JComboBox jComboBoxid_empresaNovedadNomiGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaNovedadNomiGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empresaNovedadNomi.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaNovedadNomiGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				novedadnomi.setid_empresa(empresaAux.getId());
				novedadnomi.setempresa_descripcion(NovedadNomiConstantesFunciones.getEmpresaDescripcion(empresaAux));
				novedadnomi.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(NovedadNomi novedadnomi,JComboBox jComboBoxid_empleadoNovedadNomiGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoNovedadNomiGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empleadoNovedadNomi.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoNovedadNomiGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				novedadnomi.setid_empleado(empleadoAux.getId());
				novedadnomi.setempleado_descripcion(NovedadNomiConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				novedadnomi.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoAutorizaForeignKey(NovedadNomi novedadnomi,JComboBox jComboBoxid_empleado_autorizaNovedadNomiGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleado_autorizaNovedadNomiGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empleado_autorizaNovedadNomi.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleado_autorizaNovedadNomiGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				novedadnomi.setid_empleado_autoriza(empleadoAux.getId());
				novedadnomi.setempleadoautoriza_descripcion(NovedadNomiConstantesFunciones.getEmpleadoAutorizaDescripcion(empleadoAux));
				novedadnomi.setEmpleadoAutoriza(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoNovedadNomiForeignKey(NovedadNomi novedadnomi,JComboBox jComboBoxid_tipo_novedad_nomiNovedadNomiGenerico)throws Exception
	{
		try
		{
			TipoNovedadNomi  tiponovedadnomiAux=new TipoNovedadNomi();

			if(jComboBoxid_tipo_novedad_nomiNovedadNomiGenerico==null) {
				tiponovedadnomiAux=(TipoNovedadNomi)this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_tipo_novedad_nomiNovedadNomi.getSelectedItem();
			} else {
				tiponovedadnomiAux=(TipoNovedadNomi)jComboBoxid_tipo_novedad_nomiNovedadNomiGenerico.getSelectedItem();
			}

			if(tiponovedadnomiAux!=null && tiponovedadnomiAux.getId()!=null) {
				novedadnomi.setid_tipo_novedad_nomi(tiponovedadnomiAux.getId());
				novedadnomi.settiponovedadnomi_descripcion(NovedadNomiConstantesFunciones.getTipoNovedadNomiDescripcion(tiponovedadnomiAux));
				novedadnomi.setTipoNovedadNomi(tiponovedadnomiAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstadoNovedadNomiForeignKey(NovedadNomi novedadnomi,JComboBox jComboBoxid_estado_novedad_nomiNovedadNomiGenerico)throws Exception
	{
		try
		{
			EstadoNovedadNomi  estadonovedadnomiAux=new EstadoNovedadNomi();

			if(jComboBoxid_estado_novedad_nomiNovedadNomiGenerico==null) {
				estadonovedadnomiAux=(EstadoNovedadNomi)this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_estado_novedad_nomiNovedadNomi.getSelectedItem();
			} else {
				estadonovedadnomiAux=(EstadoNovedadNomi)jComboBoxid_estado_novedad_nomiNovedadNomiGenerico.getSelectedItem();
			}

			if(estadonovedadnomiAux!=null && estadonovedadnomiAux.getId()!=null) {
				novedadnomi.setid_estado_novedad_nomi(estadonovedadnomiAux.getId());
				novedadnomi.setestadonovedadnomi_descripcion(NovedadNomiConstantesFunciones.getEstadoNovedadNomiDescripcion(estadonovedadnomiAux));
				novedadnomi.setEstadoNovedadNomi(estadonovedadnomiAux);			}
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

					if(!NovedadNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormNovedadNomi!=null) { 
							this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empresaNovedadNomi.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empresaNovedadNomi.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormNovedadNomi!=null) { 
					}

					if(!NovedadNomiJInternalFrame.ISBINDING_MANUAL) {
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

					if(!NovedadNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormNovedadNomi!=null) { 
							this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empleadoNovedadNomi.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empleadoNovedadNomi.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormNovedadNomi!=null) { 
					}

					if(!NovedadNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!NovedadNomiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoNovedadNomi.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoNovedadNomi.addItem(empleado);
							}
						}

						if(!NovedadNomiJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpleadoAutorizasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!NovedadNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormNovedadNomi!=null) { 
							this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empleado_autorizaNovedadNomi.removeAllItems();

							for(Empleado empleadoautoriza:this.empleadoautorizasForeignKey) {
								this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empleado_autorizaNovedadNomi.addItem(empleadoautoriza);
							}
						}
					}

					if(this.jInternalFrameDetalleFormNovedadNomi!=null) { 
					}

					if(!NovedadNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleadoAutoriza") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!NovedadNomiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomi.removeAllItems();

							for(Empleado empleadoautoriza:this.empleadoautorizasForeignKey) {
								this.jComboBoxid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomi.addItem(empleadoautoriza);
							}
						}

						if(!NovedadNomiJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoNovedadNomisForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoNovedadNomi=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!NovedadNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormNovedadNomi!=null) { 
							this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_tipo_novedad_nomiNovedadNomi.removeAllItems();

							for(TipoNovedadNomi tiponovedadnomi:this.tiponovedadnomisForeignKey) {
								this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_tipo_novedad_nomiNovedadNomi.addItem(tiponovedadnomi);
							}
						}
					}

					if(this.jInternalFrameDetalleFormNovedadNomi!=null) { 
					}

					if(!NovedadNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoNovedadNomi") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!NovedadNomiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomi.removeAllItems();

							for(TipoNovedadNomi tiponovedadnomi:this.tiponovedadnomisForeignKey) {
								this.jComboBoxid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomi.addItem(tiponovedadnomi);
							}
						}

						if(!NovedadNomiJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstadoNovedadNomisForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstadoNovedadNomi=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!NovedadNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormNovedadNomi!=null) { 
							this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_estado_novedad_nomiNovedadNomi.removeAllItems();

							for(EstadoNovedadNomi estadonovedadnomi:this.estadonovedadnomisForeignKey) {
								this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_estado_novedad_nomiNovedadNomi.addItem(estadonovedadnomi);
							}
						}
					}

					if(this.jInternalFrameDetalleFormNovedadNomi!=null) { 
					}

					if(!NovedadNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstadoNovedadNomi") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!NovedadNomiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomi.removeAllItems();

							for(EstadoNovedadNomi estadonovedadnomi:this.estadonovedadnomisForeignKey) {
								this.jComboBoxid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomi.addItem(estadonovedadnomi);
							}
						}

						if(!NovedadNomiJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
							this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empresaNovedadNomi.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
							this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empresaNovedadNomi.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
							this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empleadoNovedadNomi.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
							this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empleadoNovedadNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoNovedadNomi.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoNovedadNomi.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEmpleadoAutorizaForeignKey(Empleado empleadoautoriza,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
							this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empleado_autorizaNovedadNomi.setSelectedItem(empleadoautoriza);
						}
					} else {
						if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
							this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empleado_autorizaNovedadNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomi.setSelectedItem(empleadoautoriza);
						} else {
							this.jComboBoxid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomi.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoNovedadNomiForeignKey(TipoNovedadNomi tiponovedadnomi,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
							this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_tipo_novedad_nomiNovedadNomi.setSelectedItem(tiponovedadnomi);
						}
					} else {
						if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
							this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_tipo_novedad_nomiNovedadNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomi.setSelectedItem(tiponovedadnomi);
						} else {
							this.jComboBoxid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomi.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEstadoNovedadNomiForeignKey(EstadoNovedadNomi estadonovedadnomi,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
							this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_estado_novedad_nomiNovedadNomi.setSelectedItem(estadonovedadnomi);
						}
					} else {
						if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
							this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_estado_novedad_nomiNovedadNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomi.setSelectedItem(estadonovedadnomi);
						} else {
							this.jComboBoxid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomi.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesNovedadNomi() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			NovedadNomiConstantesFunciones.refrescarForeignKeysDescripcionesNovedadNomi(this.novedadnomiLogic.getNovedadNomis());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			NovedadNomiConstantesFunciones.refrescarForeignKeysDescripcionesNovedadNomi(this.novedadnomis);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(TipoNovedadNomi.class));
		classes.add(new Classe(EstadoNovedadNomi.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//novedadnomiLogic.setNovedadNomis(this.novedadnomis);
			novedadnomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public NovedadNomiParameterReturnGeneral getNovedadNomiParameterGeneral() {
		return this.novedadnomiParameterGeneral;
	}
	
	public void setNovedadNomiParameterGeneral(NovedadNomiParameterReturnGeneral novedadnomiParameterGeneral) {
		this.novedadnomiParameterGeneral = novedadnomiParameterGeneral;
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
	
	public Boolean getIsPermisoTodoNovedadNomi() {
		return isPermisoTodoNovedadNomi;
	}

	public void setIsPermisoTodoNovedadNomi(Boolean isPermisoTodoNovedadNomi) {
		this.isPermisoTodoNovedadNomi = isPermisoTodoNovedadNomi;
	}

	public Boolean getIsPermisoNuevoNovedadNomi() {
		return isPermisoNuevoNovedadNomi;
	}

	public void setIsPermisoNuevoNovedadNomi(Boolean isPermisoNuevoNovedadNomi) {
		this.isPermisoNuevoNovedadNomi = isPermisoNuevoNovedadNomi;
	}

	public Boolean getIsPermisoActualizarNovedadNomi() {
		return isPermisoActualizarNovedadNomi;
	}

	public void setIsPermisoActualizarNovedadNomi(Boolean isPermisoActualizarNovedadNomi) {
		this.isPermisoActualizarNovedadNomi = isPermisoActualizarNovedadNomi;
	}

	public Boolean getIsPermisoEliminarNovedadNomi() {
		return isPermisoEliminarNovedadNomi;
	}

	public void setIsPermisoEliminarNovedadNomi(Boolean isPermisoEliminarNovedadNomi) {
		this.isPermisoEliminarNovedadNomi = isPermisoEliminarNovedadNomi;
	}

	public Boolean getIsPermisoGuardarCambiosNovedadNomi() {
		return isPermisoGuardarCambiosNovedadNomi;
	}

	public void setIsPermisoGuardarCambiosNovedadNomi(Boolean isPermisoGuardarCambiosNovedadNomi) {
		this.isPermisoGuardarCambiosNovedadNomi = isPermisoGuardarCambiosNovedadNomi;
	}
	
	public Boolean getIsPermisoConsultaNovedadNomi() {
		return isPermisoConsultaNovedadNomi;
	}

	public void setIsPermisoConsultaNovedadNomi(Boolean isPermisoConsultaNovedadNomi) {
		this.isPermisoConsultaNovedadNomi = isPermisoConsultaNovedadNomi;
	}

	public Boolean getIsPermisoBusquedaNovedadNomi() {
		return isPermisoBusquedaNovedadNomi;
	}

	public void setIsPermisoBusquedaNovedadNomi(Boolean isPermisoBusquedaNovedadNomi) {
		this.isPermisoBusquedaNovedadNomi = isPermisoBusquedaNovedadNomi;
	}

	public Boolean getIsPermisoReporteNovedadNomi() {
		return isPermisoReporteNovedadNomi;
	}

	public void setIsPermisoReporteNovedadNomi(Boolean isPermisoReporteNovedadNomi) {
		this.isPermisoReporteNovedadNomi = isPermisoReporteNovedadNomi;
	}
	
	public Boolean getIsPermisoPaginacionMedioNovedadNomi() {
		return isPermisoPaginacionMedioNovedadNomi;
	}

	public void setIsPermisoPaginacionMedioNovedadNomi(Boolean isPermisoPaginacionMedioNovedadNomi) {
		this.isPermisoPaginacionMedioNovedadNomi = isPermisoPaginacionMedioNovedadNomi;
	}
	
	public Boolean getIsPermisoPaginacionTodoNovedadNomi() {
		return isPermisoPaginacionTodoNovedadNomi;
	}

	public void setIsPermisoPaginacionTodoNovedadNomi(Boolean isPermisoPaginacionTodoNovedadNomi) {
		this.isPermisoPaginacionTodoNovedadNomi = isPermisoPaginacionTodoNovedadNomi;
	}
	
	public Boolean getIsPermisoPaginacionAltoNovedadNomi() {
		return isPermisoPaginacionAltoNovedadNomi;
	}

	public void setIsPermisoPaginacionAltoNovedadNomi(Boolean isPermisoPaginacionAltoNovedadNomi) {
		this.isPermisoPaginacionAltoNovedadNomi = isPermisoPaginacionAltoNovedadNomi;
	}
	
	public Boolean getIsPermisoCopiarNovedadNomi() {
		return isPermisoCopiarNovedadNomi;
	}

	public void setIsPermisoCopiarNovedadNomi(Boolean isPermisoCopiarNovedadNomi) {
		this.isPermisoCopiarNovedadNomi = isPermisoCopiarNovedadNomi;
	}
	
	public Boolean getIsPermisoVerFormNovedadNomi() {
		return isPermisoVerFormNovedadNomi;
	}

	public void setIsPermisoVerFormNovedadNomi(Boolean isPermisoVerFormNovedadNomi) {
		this.isPermisoVerFormNovedadNomi = isPermisoVerFormNovedadNomi;
	}
	
	public Boolean getIsPermisoDuplicarNovedadNomi() {
		return isPermisoDuplicarNovedadNomi;
	}

	public void setIsPermisoDuplicarNovedadNomi(Boolean isPermisoDuplicarNovedadNomi) {
		this.isPermisoDuplicarNovedadNomi = isPermisoDuplicarNovedadNomi;
	}
	
	public Boolean getIsPermisoOrdenNovedadNomi() {
		return isPermisoOrdenNovedadNomi;
	}

	public void setIsPermisoOrdenNovedadNomi(Boolean isPermisoOrdenNovedadNomi) {
		this.isPermisoOrdenNovedadNomi = isPermisoOrdenNovedadNomi;
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
	
	public Boolean getIsVisibilidadCeldaNuevoNovedadNomi() {
		return isVisibilidadCeldaNuevoNovedadNomi;
	}

	public void setIsVisibilidadCeldaNuevoNovedadNomi(Boolean isVisibilidadCeldaNuevoNovedadNomi) {
		this.isVisibilidadCeldaNuevoNovedadNomi = isVisibilidadCeldaNuevoNovedadNomi;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarNovedadNomi() {
		return isVisibilidadCeldaDuplicarNovedadNomi;
	}

	public void setIsVisibilidadCeldaDuplicarNovedadNomi(Boolean isVisibilidadCeldaDuplicarNovedadNomi) {
		this.isVisibilidadCeldaDuplicarNovedadNomi = isVisibilidadCeldaDuplicarNovedadNomi;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarNovedadNomi() {
		return isVisibilidadCeldaCopiarNovedadNomi;
	}

	public void setIsVisibilidadCeldaCopiarNovedadNomi(Boolean isVisibilidadCeldaCopiarNovedadNomi) {
		this.isVisibilidadCeldaCopiarNovedadNomi = isVisibilidadCeldaCopiarNovedadNomi;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormNovedadNomi() {
		return isVisibilidadCeldaVerFormNovedadNomi;
	}

	public void setIsVisibilidadCeldaVerFormNovedadNomi(Boolean isVisibilidadCeldaVerFormNovedadNomi) {
		this.isVisibilidadCeldaVerFormNovedadNomi = isVisibilidadCeldaVerFormNovedadNomi;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenNovedadNomi() {
		return isVisibilidadCeldaOrdenNovedadNomi;
	}

	public void setIsVisibilidadCeldaOrdenNovedadNomi(Boolean isVisibilidadCeldaOrdenNovedadNomi) {
		this.isVisibilidadCeldaOrdenNovedadNomi = isVisibilidadCeldaOrdenNovedadNomi;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesNovedadNomi() {
		return isVisibilidadCeldaNuevoRelacionesNovedadNomi;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesNovedadNomi(Boolean isVisibilidadCeldaNuevoRelacionesNovedadNomi) {
		this.isVisibilidadCeldaNuevoRelacionesNovedadNomi = isVisibilidadCeldaNuevoRelacionesNovedadNomi;
	}
	
	public Boolean getIsVisibilidadCeldaModificarNovedadNomi() {
		return isVisibilidadCeldaModificarNovedadNomi;
	}

	public void setIsVisibilidadCeldaModificarNovedadNomi(Boolean isVisibilidadCeldaModificarNovedadNomi) {
		this.isVisibilidadCeldaModificarNovedadNomi = isVisibilidadCeldaModificarNovedadNomi;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarNovedadNomi() {
		return isVisibilidadCeldaActualizarNovedadNomi;
	}

	public void setIsVisibilidadCeldaActualizarNovedadNomi(Boolean isVisibilidadCeldaActualizarNovedadNomi) {
		this.isVisibilidadCeldaActualizarNovedadNomi = isVisibilidadCeldaActualizarNovedadNomi;
	}

	public Boolean getIsVisibilidadCeldaEliminarNovedadNomi() {
		return isVisibilidadCeldaEliminarNovedadNomi;
	}

	public void setIsVisibilidadCeldaEliminarNovedadNomi(Boolean isVisibilidadCeldaEliminarNovedadNomi) {
		this.isVisibilidadCeldaEliminarNovedadNomi = isVisibilidadCeldaEliminarNovedadNomi;
	}

	public Boolean getIsVisibilidadCeldaCancelarNovedadNomi() {
		return isVisibilidadCeldaCancelarNovedadNomi;
	}

	public void setIsVisibilidadCeldaCancelarNovedadNomi(Boolean isVisibilidadCeldaCancelarNovedadNomi) {
		this.isVisibilidadCeldaCancelarNovedadNomi = isVisibilidadCeldaCancelarNovedadNomi;
	}

	public Boolean getIsVisibilidadCeldaGuardarNovedadNomi() {
		return isVisibilidadCeldaGuardarNovedadNomi;
	}

	public void setIsVisibilidadCeldaGuardarNovedadNomi(Boolean isVisibilidadCeldaGuardarNovedadNomi) {
		this.isVisibilidadCeldaGuardarNovedadNomi = isVisibilidadCeldaGuardarNovedadNomi;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosNovedadNomi() {
		return isVisibilidadCeldaGuardarCambiosNovedadNomi;
	}

	public void setIsVisibilidadCeldaGuardarCambiosNovedadNomi(Boolean isVisibilidadCeldaGuardarCambiosNovedadNomi) {
		this.isVisibilidadCeldaGuardarCambiosNovedadNomi = isVisibilidadCeldaGuardarCambiosNovedadNomi;
	}
		
	public NovedadNomiSessionBean getnovedadnomiSessionBean() {
		return this.novedadnomiSessionBean;
	}
	
	public void setnovedadnomiSessionBean(NovedadNomiSessionBean novedadnomiSessionBean) {
		this.novedadnomiSessionBean=novedadnomiSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpleado() {
		return this.isVisibilidadFK_IdEmpleado;
	}

	public void setisVisibilidadFK_IdEmpleado(Boolean isVisibilidadFK_IdEmpleado) {
		this.isVisibilidadFK_IdEmpleado=isVisibilidadFK_IdEmpleado;
	}

	public Boolean getisVisibilidadFK_IdEmpleadoAutoriza() {
		return this.isVisibilidadFK_IdEmpleadoAutoriza;
	}

	public void setisVisibilidadFK_IdEmpleadoAutoriza(Boolean isVisibilidadFK_IdEmpleadoAutoriza) {
		this.isVisibilidadFK_IdEmpleadoAutoriza=isVisibilidadFK_IdEmpleadoAutoriza;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdEstadoNovedadNomi() {
		return this.isVisibilidadFK_IdEstadoNovedadNomi;
	}

	public void setisVisibilidadFK_IdEstadoNovedadNomi(Boolean isVisibilidadFK_IdEstadoNovedadNomi) {
		this.isVisibilidadFK_IdEstadoNovedadNomi=isVisibilidadFK_IdEstadoNovedadNomi;
	}

	public Boolean getisVisibilidadFK_IdTipoNovedadNomi() {
		return this.isVisibilidadFK_IdTipoNovedadNomi;
	}

	public void setisVisibilidadFK_IdTipoNovedadNomi(Boolean isVisibilidadFK_IdTipoNovedadNomi) {
		this.isVisibilidadFK_IdTipoNovedadNomi=isVisibilidadFK_IdTipoNovedadNomi;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(NovedadNomi novedadnomi)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(novedadnomi,null);
				this.setActualParaGuardarEmpleadoForeignKey(novedadnomi,null);
				this.setActualParaGuardarEmpleadoAutorizaForeignKey(novedadnomi,null);
				this.setActualParaGuardarTipoNovedadNomiForeignKey(novedadnomi,null);
				this.setActualParaGuardarEstadoNovedadNomiForeignKey(novedadnomi,null);
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
	
	public void bugActualizarReferenciaActual(NovedadNomi novedadnomi,NovedadNomi novedadnomiAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalNovedadNomi(novedadnomi);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		novedadnomiAux.setId(novedadnomi.getId());
		novedadnomiAux.setVersionRow(novedadnomi.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessNovedadNomi();
		
			int intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomi =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.novedadnomi =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(NovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualNovedadNomi(this.novedadnomi,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = novedadnomiValidator.getInvalidValues(this.novedadnomi);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			novedadnomiLogic.setDatosCliente(datosCliente);
			novedadnomiLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				novedadnomiAux=new  NovedadNomi();
				
				novedadnomiAux.setIsNew(true);
				novedadnomiAux.setIsChanged(true);
				
				novedadnomiAux.setNovedadNomiOriginal(this.novedadnomi);
				
				novedadnomiAux.setId(this.novedadnomi.getId());	
				novedadnomiAux.setVersionRow(this.novedadnomi.getVersionRow());	
				novedadnomiAux.setid_empresa(this.novedadnomi.getid_empresa());	
				novedadnomiAux.setid_empleado(this.novedadnomi.getid_empleado());	
				novedadnomiAux.setid_empleado_autoriza(this.novedadnomi.getid_empleado_autoriza());	
				novedadnomiAux.setid_tipo_novedad_nomi(this.novedadnomi.getid_tipo_novedad_nomi());	
				novedadnomiAux.setid_estado_novedad_nomi(this.novedadnomi.getid_estado_novedad_nomi());	
				novedadnomiAux.setfecha(this.novedadnomi.getfecha());	
				novedadnomiAux.setnumero_hora(this.novedadnomi.getnumero_hora());	
				novedadnomiAux.setnumero_minuto(this.novedadnomi.getnumero_minuto());	
				novedadnomiAux.setnumero_jornada_trabajo(this.novedadnomi.getnumero_jornada_trabajo());	
				novedadnomiAux.setanio_vacacion(this.novedadnomi.getanio_vacacion());	
				novedadnomiAux.setdescripcion(this.novedadnomi.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.novedadnomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.novedadnomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(novedadnomiAux,novedadnomiLogic.getNovedadNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(novedadnomiAux,novedadnomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.novedadnomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.novedadnomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadnomiLogic.saveNovedadNomis();//WithConnection
						//novedadnomiLogic.getSetVersionRowNovedadNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.novedadnomi,novedadnomiAux);
					
					this.refrescarForeignKeysDescripcionesNovedadNomi();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.novedadnomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.novedadnomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								novedadnomiLogic.saveNovedadNomiRelaciones(novedadnomiAux);//WithConnection
								//novedadnomiLogic.getSetVersionRowNovedadNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.novedadnomi,novedadnomiAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.novedadnomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.novedadnomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(novedadnomiAux,novedadnomiLogic.getNovedadNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(novedadnomiAux,novedadnomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.novedadnomi,novedadnomiAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				novedadnomiAux=new  NovedadNomi();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.novedadnomiSessionBean.getEsGuardarRelacionado() 
					|| (this.novedadnomiSessionBean.getEsGuardarRelacionado() && this.novedadnomi.getId()>=0)) {
						
					novedadnomiAux.setIsNew(false);
				}
				
				novedadnomiAux.setIsDeleted(false);
			
				novedadnomiAux.setId(this.novedadnomi.getId());	
				novedadnomiAux.setVersionRow(this.novedadnomi.getVersionRow());	
				novedadnomiAux.setid_empresa(this.novedadnomi.getid_empresa());	
				novedadnomiAux.setid_empleado(this.novedadnomi.getid_empleado());	
				novedadnomiAux.setid_empleado_autoriza(this.novedadnomi.getid_empleado_autoriza());	
				novedadnomiAux.setid_tipo_novedad_nomi(this.novedadnomi.getid_tipo_novedad_nomi());	
				novedadnomiAux.setid_estado_novedad_nomi(this.novedadnomi.getid_estado_novedad_nomi());	
				novedadnomiAux.setfecha(this.novedadnomi.getfecha());	
				novedadnomiAux.setnumero_hora(this.novedadnomi.getnumero_hora());	
				novedadnomiAux.setnumero_minuto(this.novedadnomi.getnumero_minuto());	
				novedadnomiAux.setnumero_jornada_trabajo(this.novedadnomi.getnumero_jornada_trabajo());	
				novedadnomiAux.setanio_vacacion(this.novedadnomi.getanio_vacacion());	
				novedadnomiAux.setdescripcion(this.novedadnomi.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(novedadnomiAux,novedadnomiLogic.getNovedadNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(novedadnomiAux,novedadnomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.novedadnomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.novedadnomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadnomiLogic.saveNovedadNomis();//WithConnection
						//novedadnomiLogic.getSetVersionRowNovedadNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.novedadnomi,novedadnomiAux);
					
					this.refrescarForeignKeysDescripcionesNovedadNomi();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.novedadnomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.novedadnomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								novedadnomiLogic.saveNovedadNomiRelaciones(novedadnomiAux);//WithConnection
								//novedadnomiLogic.getSetVersionRowNovedadNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.novedadnomi,novedadnomiAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.novedadnomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.novedadnomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(novedadnomiAux,novedadnomiLogic.getNovedadNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(novedadnomiAux,novedadnomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.novedadnomi,novedadnomiAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				novedadnomiAux=new  NovedadNomi();
				
				novedadnomiAux.setIsNew(false);
				novedadnomiAux.setIsChanged(false);
				
				novedadnomiAux.setIsDeleted(true);
				
				novedadnomiAux.setId(this.novedadnomi.getId());	
				novedadnomiAux.setVersionRow(this.novedadnomi.getVersionRow());	
				novedadnomiAux.setid_empresa(this.novedadnomi.getid_empresa());	
				novedadnomiAux.setid_empleado(this.novedadnomi.getid_empleado());	
				novedadnomiAux.setid_empleado_autoriza(this.novedadnomi.getid_empleado_autoriza());	
				novedadnomiAux.setid_tipo_novedad_nomi(this.novedadnomi.getid_tipo_novedad_nomi());	
				novedadnomiAux.setid_estado_novedad_nomi(this.novedadnomi.getid_estado_novedad_nomi());	
				novedadnomiAux.setfecha(this.novedadnomi.getfecha());	
				novedadnomiAux.setnumero_hora(this.novedadnomi.getnumero_hora());	
				novedadnomiAux.setnumero_minuto(this.novedadnomi.getnumero_minuto());	
				novedadnomiAux.setnumero_jornada_trabajo(this.novedadnomi.getnumero_jornada_trabajo());	
				novedadnomiAux.setanio_vacacion(this.novedadnomi.getanio_vacacion());	
				novedadnomiAux.setdescripcion(this.novedadnomi.getdescripcion());	
				
				if(this.novedadnomiSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.novedadnomiAux.getId()>=0) {	
						this.novedadnomisEliminados.add(novedadnomiAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(novedadnomiAux,novedadnomiLogic.getNovedadNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(novedadnomiAux,novedadnomis);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.novedadnomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.novedadnomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadnomiLogic.saveNovedadNomis();//WithConnection
						//novedadnomiLogic.getSetVersionRowNovedadNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.novedadnomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.novedadnomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								novedadnomiLogic.saveNovedadNomiRelaciones(novedadnomiAux);//WithConnection
								//novedadnomiLogic.getSetVersionRowNovedadNomis();//WithConnection
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
							if(this.novedadnomiSessionBean.getEstaModoGuardarRelaciones() 
								|| this.novedadnomiSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(novedadnomiAux,novedadnomiLogic.getNovedadNomis());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(novedadnomiAux,novedadnomis);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.getNovedadNomis().addAll(this.novedadnomisEliminados);
					
					novedadnomiLogic.saveNovedadNomis();//WithConnection
					//novedadnomiLogic.getSetVersionRowNovedadNomis();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesNovedadNomi();
				
				this.novedadnomisEliminados= new ArrayList<NovedadNomi>();		
			}
			
			if(this.novedadnomiSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Novedad Nomi GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Novedad Nomi",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.novedadnomi=novedadnomiAux;
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
      		//this.finishProcessNovedadNomi();
      	}
		
	}	
	
	public void actualizarRelaciones(NovedadNomi novedadnomiLocal) throws Exception {
		
		if(this.novedadnomiSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(NovedadNomi novedadnomiLocal) throws Exception {	
		if(this.novedadnomiSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				novedadnomiLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				novedadnomiLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoautorizaBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoautorizaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoautorizaBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoautorizaBeanSwingJInternalFrameLocal.actualizarLista(empleadoautorizaBeanSwingJInternalFrameLocal.empleado,this.empleadoautorizasForeignKey);

				empleadoautorizaBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoautorizaBeanSwingJInternalFrameLocal.empleado);

				novedadnomiLocal.setEmpleadoAutoriza(empleadoautorizaBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleadoAutoriza();
				this.cargarCombosFrameEmpleadoAutorizasForeignKey("Formulario");
				this.setActualEmpleadoAutorizaForeignKey(empleadoautorizaBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoNovedadNomiDetalleFormJInternalFrame.class)) {
				TipoNovedadNomiBeanSwingJInternalFrame tiponovedadnomiBeanSwingJInternalFrameLocal=(TipoNovedadNomiBeanSwingJInternalFrame) ((TipoNovedadNomiDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tiponovedadnomiBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoNovedadNomi(tiponovedadnomiBeanSwingJInternalFrameLocal.gettiponovedadnomi(),true);
				tiponovedadnomiBeanSwingJInternalFrameLocal.actualizarLista(tiponovedadnomiBeanSwingJInternalFrameLocal.tiponovedadnomi,this.tiponovedadnomisForeignKey);

				tiponovedadnomiBeanSwingJInternalFrameLocal.actualizarRelaciones(tiponovedadnomiBeanSwingJInternalFrameLocal.tiponovedadnomi);

				novedadnomiLocal.setTipoNovedadNomi(tiponovedadnomiBeanSwingJInternalFrameLocal.tiponovedadnomi);

				this.addItemDefectoCombosForeignKeyTipoNovedadNomi();
				this.cargarCombosFrameTipoNovedadNomisForeignKey("Formulario");
				this.setActualTipoNovedadNomiForeignKey(tiponovedadnomiBeanSwingJInternalFrameLocal.tiponovedadnomi.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstadoNovedadNomiDetalleFormJInternalFrame.class)) {
				EstadoNovedadNomiBeanSwingJInternalFrame estadonovedadnomiBeanSwingJInternalFrameLocal=(EstadoNovedadNomiBeanSwingJInternalFrame) ((EstadoNovedadNomiDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estadonovedadnomiBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstadoNovedadNomi(estadonovedadnomiBeanSwingJInternalFrameLocal.getestadonovedadnomi(),true);
				estadonovedadnomiBeanSwingJInternalFrameLocal.actualizarLista(estadonovedadnomiBeanSwingJInternalFrameLocal.estadonovedadnomi,this.estadonovedadnomisForeignKey);

				estadonovedadnomiBeanSwingJInternalFrameLocal.actualizarRelaciones(estadonovedadnomiBeanSwingJInternalFrameLocal.estadonovedadnomi);

				novedadnomiLocal.setEstadoNovedadNomi(estadonovedadnomiBeanSwingJInternalFrameLocal.estadonovedadnomi);

				this.addItemDefectoCombosForeignKeyEstadoNovedadNomi();
				this.cargarCombosFrameEstadoNovedadNomisForeignKey("Formulario");
				this.setActualEstadoNovedadNomiForeignKey(estadonovedadnomiBeanSwingJInternalFrameLocal.estadonovedadnomi.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarNovedadNomiActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.novedadnomi =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.novedadnomi =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = novedadnomiValidator.getInvalidValues(this.novedadnomi);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(NovedadNomi novedadnomi,List<NovedadNomi> novedadnomis) throws Exception {
		try	{		
			NovedadNomiConstantesFunciones.actualizarLista(novedadnomi,novedadnomis,this.novedadnomiSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(NovedadNomi novedadnomi,List<NovedadNomi> novedadnomis) throws Exception {
		try	{			
			NovedadNomiConstantesFunciones.actualizarSelectedLista(novedadnomi,novedadnomis);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<NovedadNomi> novedadnomisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				novedadnomisLocal=this.novedadnomiLogic.getNovedadNomis();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				novedadnomisLocal=this.novedadnomis;
			}
			//ARCHITECTURE
		
			for(NovedadNomi novedadnomiLocal:novedadnomisLocal) {
				if(this.permiteMantenimiento(novedadnomiLocal) && novedadnomiLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+NovedadNomiConstantesFunciones.getNovedadNomiLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(NovedadNomiConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadNomi.jLabelid_empresaNovedadNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NovedadNomiConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadNomi.jLabelid_empleadoNovedadNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NovedadNomiConstantesFunciones.IDEMPLEADOAUTORIZA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadNomi.jLabelid_empleado_autorizaNovedadNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NovedadNomiConstantesFunciones.IDTIPONOVEDADNOMI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadNomi.jLabelid_tipo_novedad_nomiNovedadNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NovedadNomiConstantesFunciones.IDESTADONOVEDADNOMI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadNomi.jLabelid_estado_novedad_nomiNovedadNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NovedadNomiConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadNomi.jLabelfechaNovedadNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NovedadNomiConstantesFunciones.NUMEROHORA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadNomi.jLabelnumero_horaNovedadNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NovedadNomiConstantesFunciones.NUMEROMINUTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadNomi.jLabelnumero_minutoNovedadNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NovedadNomiConstantesFunciones.NUMEROJORNADATRABAJO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadNomi.jLabelnumero_jornada_trabajoNovedadNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NovedadNomiConstantesFunciones.ANIOVACACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadNomi.jLabelanio_vacacionNovedadNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NovedadNomiConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadNomi.jLabeldescripcionNovedadNomi,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedadNomi.jLabelid_empresaNovedadNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedadNomi.jLabelid_empleadoNovedadNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedadNomi.jLabelid_empleado_autorizaNovedadNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedadNomi.jLabelid_tipo_novedad_nomiNovedadNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedadNomi.jLabelid_estado_novedad_nomiNovedadNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedadNomi.jLabelfechaNovedadNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedadNomi.jLabelnumero_horaNovedadNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedadNomi.jLabelnumero_minutoNovedadNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedadNomi.jLabelnumero_jornada_trabajoNovedadNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedadNomi.jLabelanio_vacacionNovedadNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedadNomi.jLabeldescripcionNovedadNomi,"");
		
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
		this.iIdNuevoNovedadNomi--;	
		
		
		this.novedadnomiAux=new NovedadNomi();
		
		this.novedadnomiAux.setId(this.iIdNuevoNovedadNomi);
		this.novedadnomiAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.novedadnomiLogic.getNovedadNomis().add(this.novedadnomiAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.novedadnomis.add(this.novedadnomiAux);
		}
		//ARCHITECTURE
		
		this.novedadnomi=this.novedadnomiAux;
		
		if(NovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioNovedadNomi(this.novedadnomi);
			this.setVariablesObjetoActualToFormularioForeignKeyNovedadNomi(this.novedadnomi);
		}
				
		//this.setDefaultControlesNovedadNomi();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyNovedadNomi();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyNovedadNomi();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyNovedadNomi();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualNovedadNomi(this.novedadnomiBean,this.novedadnomi,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(NovedadNomiConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.novedadnomiSessionBean.getConGuardarRelaciones()) {
			classes=NovedadNomiConstantesFunciones.getClassesRelationshipsOfNovedadNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.novedadnomiReturnGeneral=novedadnomiLogic.procesarEventosNovedadNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.novedadnomiLogic.getNovedadNomis(),this.novedadnomi,this.novedadnomiParameterGeneral,this.isEsNuevoNovedadNomi,classes);//this.novedadnomiLogic.getNovedadNomi()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanNovedadNomi(this.novedadnomiReturnGeneral,this.novedadnomiBean,false);
		
		if(this.novedadnomiReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyNovedadNomi(this.novedadnomiReturnGeneral.getNovedadNomi());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioNovedadNomi(this.novedadnomiReturnGeneral.getNovedadNomi());
		}
		
		if(this.novedadnomiReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioNovedadNomi(this.novedadnomiReturnGeneral.getNovedadNomi(),classes);//this.novedadnomiBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualNovedadNomi(this.novedadnomi,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyNovedadNomi();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyNovedadNomi();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			NovedadNomiBeanSwingJInternalFrameAdditional.RecargarFormNovedadNomi(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingNovedadNomi(false);
						
			if(novedadnomiSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(NovedadNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNovedadNomi();
			}
			
			this.actualizarVisualTableDatosNovedadNomi();
			
			this.jTableDatosNovedadNomi.setRowSelectionInterval(this.getIndiceNuevoNovedadNomi(), this.getIndiceNuevoNovedadNomi());
			
			this.seleccionarFilaTablaNovedadNomiActual();
						
			this.actualizarEstadoCeldasBotonesNovedadNomi("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesNovedadNomi(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormNovedadNomi.jDateChooserfechaNovedadNomi.setEnabled(isHabilitar && this.novedadnomiConstantesFunciones.activarfechaNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jTextFieldnumero_horaNovedadNomi.setEnabled(isHabilitar && this.novedadnomiConstantesFunciones.activarnumero_horaNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jTextFieldnumero_minutoNovedadNomi.setEnabled(isHabilitar && this.novedadnomiConstantesFunciones.activarnumero_minutoNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jTextFieldnumero_jornada_trabajoNovedadNomi.setEnabled(isHabilitar && this.novedadnomiConstantesFunciones.activarnumero_jornada_trabajoNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jTextFieldanio_vacacionNovedadNomi.setEnabled(isHabilitar && this.novedadnomiConstantesFunciones.activaranio_vacacionNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jTextAreadescripcionNovedadNomi.setEnabled(isHabilitar && this.novedadnomiConstantesFunciones.activardescripcionNovedadNomi);	
		//
		this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empresaNovedadNomi.setEnabled(isHabilitar && this.novedadnomiConstantesFunciones.activarid_empresaNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empleadoNovedadNomi.setEnabled(isHabilitar && this.novedadnomiConstantesFunciones.activarid_empleadoNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empleado_autorizaNovedadNomi.setEnabled(isHabilitar && this.novedadnomiConstantesFunciones.activarid_empleado_autorizaNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_tipo_novedad_nomiNovedadNomi.setEnabled(isHabilitar && this.novedadnomiConstantesFunciones.activarid_tipo_novedad_nomiNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_estado_novedad_nomiNovedadNomi.setEnabled(isHabilitar && this.novedadnomiConstantesFunciones.activarid_estado_novedad_nomiNovedadNomi);
	};
	
	public void setDefaultControlesNovedadNomi() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoNovedadNomi(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.novedadnomiSessionBean.setConGuardarRelaciones(true);			
			this.novedadnomiSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormNovedadNomi.jTabbedPaneRelacionesNovedadNomi.setVisible(true);
			
					
		} else {
			//this.novedadnomiSessionBean.setConGuardarRelaciones(false);			
			this.novedadnomiSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormNovedadNomi.jTabbedPaneRelacionesNovedadNomi.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoNovedadNomi() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NovedadNomi novedadnomiAux:this.novedadnomiLogic.getNovedadNomis()) {
				if(novedadnomiAux.getId().equals(this.iIdNuevoNovedadNomi)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NovedadNomi novedadnomiAux:this.novedadnomis) {
				if(novedadnomiAux.getId().equals(this.iIdNuevoNovedadNomi)) {
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
	
	public int getIndiceActualNovedadNomi(NovedadNomi novedadnomi,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NovedadNomi novedadnomiAux:this.novedadnomiLogic.getNovedadNomis()) {
				if(novedadnomiAux.getId().equals(novedadnomi.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NovedadNomi novedadnomiAux:this.novedadnomis) {
				if(novedadnomiAux.getId().equals(novedadnomi.getId())) {
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
	
	public void setCamposBaseDesdeOriginalNovedadNomi(NovedadNomi novedadnomiOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NovedadNomi novedadnomiAux:this.novedadnomiLogic.getNovedadNomis()) {
				if(novedadnomiAux.getNovedadNomiOriginal().getId().equals(novedadnomiOriginal.getId())) {
					existe=true;
					novedadnomiOriginal.setId(novedadnomiAux.getId());
					novedadnomiOriginal.setVersionRow(novedadnomiAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NovedadNomi novedadnomiAux:this.novedadnomis) {
				if(novedadnomiAux.getNovedadNomiOriginal().getId().equals(novedadnomiOriginal.getId())) {
					existe=true;
					novedadnomiOriginal.setId(novedadnomiAux.getId());
					novedadnomiOriginal.setVersionRow(novedadnomiAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosNovedadNomi(Boolean esParaCancelar) throws Exception {
		novedadnomisAux=new ArrayList<NovedadNomi>();
		novedadnomiAux=new NovedadNomi();
		
		if(!this.novedadnomiSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(NovedadNomi novedadnomiAux:this.novedadnomiLogic.getNovedadNomis()) {
					if(novedadnomiAux.getId()<0) {
						novedadnomisAux.add(novedadnomiAux);
					}		
				}
				this.iIdNuevoNovedadNomi=0L;
				this.novedadnomiLogic.getNovedadNomis().removeAll(novedadnomisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NovedadNomi novedadnomiAux:this.novedadnomis) {
					if(novedadnomiAux.getId()<0) {
						novedadnomisAux.add(novedadnomiAux);
					}		
				}
				this.iIdNuevoNovedadNomi=0L;
				this.novedadnomis.removeAll(novedadnomisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoNovedadNomi 
					&& this.novedadnomiLogic.getNovedadNomis().size()>0
					) {
					novedadnomiAux=this.novedadnomiLogic.getNovedadNomis().get(this.novedadnomiLogic.getNovedadNomis().size() - 1);
				
					if(novedadnomiAux.getId()<0) {
						this.novedadnomiLogic.getNovedadNomis().remove(novedadnomiAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoNovedadNomi && this.novedadnomis.size()>0) {
					novedadnomiAux=this.novedadnomis.get(this.novedadnomis.size() - 1);
				
					if(novedadnomiAux.getId()<0) {
						this.novedadnomis.remove(novedadnomiAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoNovedadNomi(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(novedadnomi.getId()<0) {
				this.novedadnomiLogic.getNovedadNomis().remove(this.novedadnomi);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(novedadnomi.getId()<0) {
				this.novedadnomis.remove(this.novedadnomi);
			}
		}			
	}
	
	public void setEstadosInicialesNovedadNomi(List<NovedadNomi> novedadnomisAux) throws Exception {
		NovedadNomiConstantesFunciones.setEstadosInicialesNovedadNomi(novedadnomisAux);
	}
	
	public void setEstadosInicialesNovedadNomi(NovedadNomi novedadnomiAux) throws Exception {
		NovedadNomiConstantesFunciones.setEstadosInicialesNovedadNomi(novedadnomiAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarNovedadNomiActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesNovedadNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarNovedadNomiActual()) {
				if(!this.isEsNuevoNovedadNomi) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesNovedadNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoNovedadNomi=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarNovedadNomiActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Novedad Nomi ?", "MANTENIMIENTO DE Novedad Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesNovedadNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(NovedadNomi novedadnomi) throws Exception {
		NovedadNomiConstantesFunciones.seleccionarAsignar(this.novedadnomi,novedadnomi);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarNovedadNomi=this.isPermisoActualizarOriginalNovedadNomi;
			
			
			this.seleccionarAsignar(novedadnomi);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			NovedadNomiConstantesFunciones.quitarEspaciosNovedadNomi(this.novedadnomi,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesNovedadNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.novedadnomiSessionBean.setsFuncionBusquedaRapida(this.novedadnomiSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoNovedadNomi) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosNovedadNomi(esParaCancelar);				
				this.cancelarNuevoNovedadNomi(esParaCancelar);								
			}
			
			this.novedadnomi=new NovedadNomi();
			
			this.inicializarNovedadNomi();
			
			this.actualizarEstadoCeldasBotonesNovedadNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarNovedadNomi() throws Exception {
		try {
			NovedadNomiConstantesFunciones.inicializarNovedadNomi(this.novedadnomi);
			
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
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.novedadnomiLogic.getNovedadNomis().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteNovedadNomis(String sAccionBusqueda,List<NovedadNomi> novedadnomisParaReportes) throws Exception {
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
					sPathReporteFinal="NovedadNomi"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="NovedadNomiMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("NovedadNomiMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="NovedadNomi"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Novedad Nomis");		
		parameters.put("busquedapor", NovedadNomiConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceNovedadNomi=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			NovedadNomiConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			NovedadNomiConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceNovedadNomi=new JRBeanArrayDataSource(NovedadNomiJInternalFrame.TraerNovedadNomiBeans(novedadnomisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceNovedadNomi);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+NovedadNomiConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+NovedadNomiConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(NovedadNomiBean.TraerNovedadNomiBeans(novedadnomisParaReportes).toArray()));
							
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
				this.generarExcelReporteNovedadNomis(sAccionBusqueda,sTipoArchivoReporte,novedadnomisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalNovedadNomis(sAccionBusqueda,sTipoArchivoReporte,novedadnomisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoNovedadNomiActionPerformed(null);
					//this.generarExcelReporteNovedadNomis(sAccionBusqueda,sTipoArchivoReporte,novedadnomisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalNovedadNomis(sAccionBusqueda,sTipoArchivoReporte,novedadnomisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesNovedadNomis(sAccionBusqueda,sTipoArchivoReporte,novedadnomisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesNovedadNomis(sAccionBusqueda,sTipoArchivoReporte,novedadnomisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteNovedadNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<NovedadNomi> novedadnomisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"novedadnomi";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("NovedadNomis");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderNovedadNomi("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(NovedadNomi novedadnomi : novedadnomisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			NovedadNomiConstantesFunciones.generarExcelReporteDataNovedadNomi("NORMAL",row,workbook,novedadnomi,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderNovedadNomi(String sTipo,Row row,Workbook workbook) {
		
		NovedadNomiConstantesFunciones.generarExcelReporteHeaderNovedadNomi(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalNovedadNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<NovedadNomi> novedadnomisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"novedadnomi_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("NovedadNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(NovedadNomi novedadnomi : novedadnomisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(NovedadNomiConstantesFunciones.getNovedadNomiDescripcion(novedadnomi));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadNomiConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedadnomi.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadNomiConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedadnomi.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadNomiConstantesFunciones.LABEL_IDEMPLEADOAUTORIZA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_IDEMPLEADOAUTORIZA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedadnomi.getempleadoautoriza_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadNomiConstantesFunciones.LABEL_IDTIPONOVEDADNOMI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_IDTIPONOVEDADNOMI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedadnomi.gettiponovedadnomi_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadNomiConstantesFunciones.LABEL_IDESTADONOVEDADNOMI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_IDESTADONOVEDADNOMI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedadnomi.getestadonovedadnomi_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadNomiConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedadnomi.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadNomiConstantesFunciones.LABEL_NUMEROHORA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_NUMEROHORA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedadnomi.getnumero_hora());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadNomiConstantesFunciones.LABEL_NUMEROMINUTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_NUMEROMINUTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedadnomi.getnumero_minuto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadNomiConstantesFunciones.LABEL_NUMEROJORNADATRABAJO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_NUMEROJORNADATRABAJO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedadnomi.getnumero_jornada_trabajo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadNomiConstantesFunciones.LABEL_ANIOVACACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_ANIOVACACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedadnomi.getanio_vacacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadNomiConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedadnomi.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesNovedadNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<NovedadNomi> novedadnomisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<NovedadNomi> novedadnomisRespaldo=null;
		
		classes=NovedadNomiConstantesFunciones.getClassesRelationshipsOfNovedadNomi(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.novedadnomiLogic.setDatosCliente(this.datosCliente);
		this.novedadnomiLogic.setDatosDeep(this.datosDeep);
		this.novedadnomiLogic.setIsConDeep(true);
		
		novedadnomisRespaldo=this.novedadnomiLogic.getNovedadNomis();
		
		this.novedadnomiLogic.setNovedadNomis(novedadnomisParaReportes);	
		this.novedadnomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		novedadnomisParaReportes=this.novedadnomiLogic.getNovedadNomis();
		this.novedadnomiLogic.setNovedadNomis(novedadnomisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"novedadnomi_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("NovedadNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderNovedadNomi("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(NovedadNomi novedadnomi : novedadnomisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderNovedadNomi("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			NovedadNomiConstantesFunciones.generarExcelReporteDataNovedadNomi("NORMAL",row,workbook,novedadnomi,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(NovedadNomiConstantesFunciones.getNovedadNomiDescripcion(novedadnomi));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoNovedadNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNovedadNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoNovedadNomi.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNovedadNomi.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessNovedadNomi() throws Exception {		
		this.startProcessNovedadNomi(true);
	}
	
	public void startProcessNovedadNomi(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasNovedadNomi ,this.jPanelParametrosReportesNovedadNomi, this.jScrollPanelDatosNovedadNomi,this.jPanelPaginacionNovedadNomi, this.jScrollPanelDatosEdicionNovedadNomi, this.jPanelAccionesNovedadNomi,this.jPanelAccionesFormularioNovedadNomi,this.jmenuBarNovedadNomi,this.jmenuBarDetalleNovedadNomi,this.jTtoolBarNovedadNomi,this.jTtoolBarDetalleNovedadNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasNovedadNomi=this.jTabbedPaneBusquedasNovedadNomi; 
		
		final JPanel jPanelParametrosReportesNovedadNomi=this.jPanelParametrosReportesNovedadNomi;
		//final JScrollPane jScrollPanelDatosNovedadNomi=this.jScrollPanelDatosNovedadNomi;
		final JTable jTableDatosNovedadNomi=this.jTableDatosNovedadNomi;		
		final JPanel jPanelPaginacionNovedadNomi=this.jPanelPaginacionNovedadNomi;
		//final JScrollPane jScrollPanelDatosEdicionNovedadNomi=this.jScrollPanelDatosEdicionNovedadNomi;
		final JPanel jPanelAccionesNovedadNomi=this.jPanelAccionesNovedadNomi;
		
		JPanel jPanelCamposAuxiliarNovedadNomi=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarNovedadNomi=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
			jPanelCamposAuxiliarNovedadNomi=this.jInternalFrameDetalleFormNovedadNomi.jPanelCamposNovedadNomi;
			jPanelAccionesFormularioAuxiliarNovedadNomi=this.jInternalFrameDetalleFormNovedadNomi.jPanelAccionesFormularioNovedadNomi;
		}
		
		final JPanel jPanelCamposNovedadNomi=jPanelCamposAuxiliarNovedadNomi;
		final JPanel jPanelAccionesFormularioNovedadNomi=jPanelAccionesFormularioAuxiliarNovedadNomi;
		
		
		final JMenuBar jmenuBarNovedadNomi=this.jmenuBarNovedadNomi;
		final JToolBar jTtoolBarNovedadNomi=this.jTtoolBarNovedadNomi;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarNovedadNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarNovedadNomi=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
			jmenuBarDetalleAuxiliarNovedadNomi=this.jInternalFrameDetalleFormNovedadNomi.jmenuBarDetalleNovedadNomi;
			jTtoolBarDetalleAuxiliarNovedadNomi=this.jInternalFrameDetalleFormNovedadNomi.jTtoolBarDetalleNovedadNomi;
		}
		
		final JMenuBar jmenuBarDetalleNovedadNomi=jmenuBarDetalleAuxiliarNovedadNomi;
		final JToolBar jTtoolBarDetalleNovedadNomi=jTtoolBarDetalleAuxiliarNovedadNomi;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasNovedadNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesNovedadNomi;
			processRunnable.jTableDatos=jTableDatosNovedadNomi;
			processRunnable.jPanelCampos=jPanelCamposNovedadNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionNovedadNomi;
			processRunnable.jPanelAcciones=jPanelAccionesNovedadNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioNovedadNomi;
			
			
			processRunnable.jmenuBar=jmenuBarNovedadNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleNovedadNomi;
			processRunnable.jTtoolBar=jTtoolBarNovedadNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleNovedadNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasNovedadNomi ,jPanelParametrosReportesNovedadNomi,jTableDatosNovedadNomi, /*jScrollPanelDatosNovedadNomi,*/jPanelCamposNovedadNomi,jPanelPaginacionNovedadNomi, /*jScrollPanelDatosEdicionNovedadNomi,*/ jPanelAccionesNovedadNomi,jPanelAccionesFormularioNovedadNomi,jmenuBarNovedadNomi,jmenuBarDetalleNovedadNomi,jTtoolBarNovedadNomi,jTtoolBarDetalleNovedadNomi);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasNovedadNomi ,jPanelParametrosReportesNovedadNomi, jScrollPanelDatosNovedadNomi,jPanelPaginacionNovedadNomi, jScrollPanelDatosEdicionNovedadNomi, jPanelAccionesNovedadNomi,jPanelAccionesFormularioNovedadNomi,jmenuBarNovedadNomi,jmenuBarDetalleNovedadNomi,jTtoolBarNovedadNomi,jTtoolBarDetalleNovedadNomi);
						
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
	
	public void finishProcessNovedadNomi() {// throws Exception 
		this.finishProcessNovedadNomi(true);
	}
	
	public void finishProcessNovedadNomi(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasNovedadNomi ,this.jPanelParametrosReportesNovedadNomi, this.jScrollPanelDatosNovedadNomi,this.jPanelPaginacionNovedadNomi, this.jScrollPanelDatosEdicionNovedadNomi, this.jPanelAccionesNovedadNomi,this.jPanelAccionesFormularioNovedadNomi,this.jmenuBarNovedadNomi,this.jmenuBarDetalleNovedadNomi,this.jTtoolBarNovedadNomi,this.jTtoolBarDetalleNovedadNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasNovedadNomi=this.jTabbedPaneBusquedasNovedadNomi; 
		
		final JPanel jPanelParametrosReportesNovedadNomi=this.jPanelParametrosReportesNovedadNomi;
		//final JScrollPane jScrollPanelDatosNovedadNomi=this.jScrollPanelDatosNovedadNomi;
		final JTable jTableDatosNovedadNomi=this.jTableDatosNovedadNomi;		
		final JPanel jPanelPaginacionNovedadNomi=this.jPanelPaginacionNovedadNomi;
		//final JScrollPane jScrollPanelDatosEdicionNovedadNomi=this.jScrollPanelDatosEdicionNovedadNomi;
		final JPanel jPanelAccionesNovedadNomi=this.jPanelAccionesNovedadNomi;
		
		JPanel jPanelCamposAuxiliarNovedadNomi=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarNovedadNomi=new JPanel();
		
		if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
			jPanelCamposAuxiliarNovedadNomi=this.jInternalFrameDetalleFormNovedadNomi.jPanelCamposNovedadNomi;
			jPanelAccionesFormularioAuxiliarNovedadNomi=this.jInternalFrameDetalleFormNovedadNomi.jPanelAccionesFormularioNovedadNomi;
		}
		
		final JPanel jPanelCamposNovedadNomi=jPanelCamposAuxiliarNovedadNomi;
		final JPanel jPanelAccionesFormularioNovedadNomi=jPanelAccionesFormularioAuxiliarNovedadNomi;
		
		
		final JMenuBar jmenuBarNovedadNomi=this.jmenuBarNovedadNomi;		
		final JToolBar jTtoolBarNovedadNomi=this.jTtoolBarNovedadNomi;
				
		JMenuBar jmenuBarDetalleAuxiliarNovedadNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarNovedadNomi=new JToolBar();
		
		if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
			jmenuBarDetalleAuxiliarNovedadNomi=this.jInternalFrameDetalleFormNovedadNomi.jmenuBarDetalleNovedadNomi;
			jTtoolBarDetalleAuxiliarNovedadNomi=this.jInternalFrameDetalleFormNovedadNomi.jTtoolBarDetalleNovedadNomi;		
		}
		
		final JMenuBar jmenuBarDetalleNovedadNomi=jmenuBarDetalleAuxiliarNovedadNomi;
		final JToolBar jTtoolBarDetalleNovedadNomi=jTtoolBarDetalleAuxiliarNovedadNomi;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasNovedadNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesNovedadNomi;
			processRunnable.jTableDatos=jTableDatosNovedadNomi;
			processRunnable.jPanelCampos=jPanelCamposNovedadNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionNovedadNomi;
			processRunnable.jPanelAcciones=jPanelAccionesNovedadNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioNovedadNomi;
			
			
			processRunnable.jmenuBar=jmenuBarNovedadNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleNovedadNomi;
			processRunnable.jTtoolBar=jTtoolBarNovedadNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleNovedadNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasNovedadNomi ,jPanelParametrosReportesNovedadNomi, jTableDatosNovedadNomi,/*jScrollPanelDatosNovedadNomi,*/jPanelCamposNovedadNomi,jPanelPaginacionNovedadNomi, /*jScrollPanelDatosEdicionNovedadNomi,*/ jPanelAccionesNovedadNomi,jPanelAccionesFormularioNovedadNomi,jmenuBarNovedadNomi,jmenuBarDetalleNovedadNomi,jTtoolBarNovedadNomi,jTtoolBarDetalleNovedadNomi));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesNovedadNomi(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarNovedadNomi(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuNovedadNomi(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarNovedadNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarNovedadNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleNovedadNomi,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuNovedadNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarNovedadNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleNovedadNomi,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.novedadnomiConstantesFunciones.getsFinalQueryNovedadNomi();
		String  finalQueryPaginacionTodos=this.novedadnomiConstantesFunciones.getsFinalQueryNovedadNomi();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=NovedadNomiConstantesFunciones.getArrayColumnasGlobalesNoNovedadNomi(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=NovedadNomiConstantesFunciones.getArrayColumnasGlobalesNovedadNomi(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,NovedadNomiConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.novedadnomisEliminados= new ArrayList<NovedadNomi>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessNovedadNomi();
		
				///*NovedadNomiSessionBean*/this.novedadnomiSessionBean=new NovedadNomiSessionBean();
			
			if(this.novedadnomiSessionBean==null) {
				this.novedadnomiSessionBean=new NovedadNomiSessionBean();
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
					this.iNumeroPaginacion=NovedadNomiConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=NovedadNomiConstantesFunciones.getClassesForeignKeysOfNovedadNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/novedadnomi."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			novedadnomisAux= new ArrayList<NovedadNomi>();
			
				
			novedadnomiLogic.setDatosCliente(this.datosCliente);
			novedadnomiLogic.setDatosDeep(this.datosDeep);
			novedadnomiLogic.setIsConDeep(true);
			
			
			novedadnomiLogic.getNovedadNomiDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					novedadnomiLogic.getTodosNovedadNomis(finalQueryGlobal,pagination);
					
					//novedadnomiLogic.getTodosNovedadNomisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(novedadnomiLogic.getNovedadNomis()==null|| novedadnomiLogic.getNovedadNomis().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							novedadnomisAux= new ArrayList<NovedadNomi>();
							novedadnomisAux.addAll(novedadnomiLogic.getNovedadNomis());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadnomisAux= new ArrayList<NovedadNomi>();
							novedadnomisAux.addAll(novedadnomis);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							novedadnomiLogic.getTodosNovedadNomis(finalQueryGlobal+"",this.pagination);												
							
							//novedadnomiLogic.getTodosNovedadNomisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteNovedadNomis("Todos",novedadnomiLogic.getNovedadNomis() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							novedadnomiLogic.setNovedadNomis(new ArrayList<NovedadNomi>());					
							novedadnomiLogic.getNovedadNomis().addAll(novedadnomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadnomis=new ArrayList<NovedadNomi>();
							novedadnomis.addAll(novedadnomisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idNovedadNomi=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idNovedadNomi=this.idActual;
				
				} else if(this.idNovedadNomiActual!=null && this.idNovedadNomiActual!=0L) {
					idNovedadNomi=idNovedadNomiActual;
				}
				
					
				this.sDetalleReporte=NovedadNomiConstantesFunciones.getDetalleIndicePorId(idNovedadNomi);
				
				this.novedadnomis=new ArrayList<NovedadNomi>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					novedadnomiLogic.getEntity(idNovedadNomi);
					
					//novedadnomiLogic.getEntityWithConnection(idNovedadNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					novedadnomiLogic.setNovedadNomis(new ArrayList<NovedadNomi>());
					novedadnomiLogic.getNovedadNomis().add(novedadnomiLogic.getNovedadNomi());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.novedadnomis=new ArrayList<NovedadNomi>();
					this.novedadnomis.add(novedadnomi);
				}
				
				if(novedadnomiLogic.getNovedadNomi()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=NovedadNomiConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					novedadnomiLogic.getNovedadNomisFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadNomiConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadNomiConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=novedadnomiLogic.getNovedadNomis()==null||novedadnomiLogic.getNovedadNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=novedadnomis==null|| novedadnomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadnomisAux=new ArrayList<NovedadNomi>();
						novedadnomisAux.addAll(novedadnomiLogic.getNovedadNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadnomisAux=new ArrayList<NovedadNomi>();
							novedadnomisAux.addAll(novedadnomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							novedadnomiLogic.getNovedadNomisFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadNomiConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadNomiConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteNovedadNomis("FK_IdEmpleado",novedadnomiLogic.getNovedadNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteNovedadNomis("FK_IdEmpleado",novedadnomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadnomiLogic.setNovedadNomis(new ArrayList<NovedadNomi>());
						novedadnomiLogic.getNovedadNomis().addAll(novedadnomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadnomis=new ArrayList<NovedadNomi>();
							novedadnomis.addAll(novedadnomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleadoAutoriza")) {
				this.sDetalleReporte=NovedadNomiConstantesFunciones.getDetalleIndiceFK_IdEmpleadoAutoriza(id_empleado_autorizaFK_IdEmpleadoAutoriza);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					novedadnomiLogic.getNovedadNomisFK_IdEmpleadoAutoriza(finalQueryGlobal,pagination,id_empleado_autorizaFK_IdEmpleadoAutoriza);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadNomiConstantesFunciones.getDetalleIndiceFK_IdEmpleadoAutoriza(id_empleado_autorizaFK_IdEmpleadoAutoriza);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadNomiConstantesFunciones.getDetalleIndiceFK_IdEmpleadoAutoriza(id_empleado_autorizaFK_IdEmpleadoAutoriza);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=novedadnomiLogic.getNovedadNomis()==null||novedadnomiLogic.getNovedadNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=novedadnomis==null|| novedadnomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadnomisAux=new ArrayList<NovedadNomi>();
						novedadnomisAux.addAll(novedadnomiLogic.getNovedadNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadnomisAux=new ArrayList<NovedadNomi>();
							novedadnomisAux.addAll(novedadnomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							novedadnomiLogic.getNovedadNomisFK_IdEmpleadoAutoriza(finalQueryGlobal,pagination,id_empleado_autorizaFK_IdEmpleadoAutoriza);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadNomiConstantesFunciones.getDetalleIndiceFK_IdEmpleadoAutoriza(id_empleado_autorizaFK_IdEmpleadoAutoriza);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadNomiConstantesFunciones.getDetalleIndiceFK_IdEmpleadoAutoriza(id_empleado_autorizaFK_IdEmpleadoAutoriza);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteNovedadNomis("FK_IdEmpleadoAutoriza",novedadnomiLogic.getNovedadNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteNovedadNomis("FK_IdEmpleadoAutoriza",novedadnomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadnomiLogic.setNovedadNomis(new ArrayList<NovedadNomi>());
						novedadnomiLogic.getNovedadNomis().addAll(novedadnomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadnomis=new ArrayList<NovedadNomi>();
							novedadnomis.addAll(novedadnomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=NovedadNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					novedadnomiLogic.getNovedadNomisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=novedadnomiLogic.getNovedadNomis()==null||novedadnomiLogic.getNovedadNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=novedadnomis==null|| novedadnomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadnomisAux=new ArrayList<NovedadNomi>();
						novedadnomisAux.addAll(novedadnomiLogic.getNovedadNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadnomisAux=new ArrayList<NovedadNomi>();
							novedadnomisAux.addAll(novedadnomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							novedadnomiLogic.getNovedadNomisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteNovedadNomis("FK_IdEmpresa",novedadnomiLogic.getNovedadNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteNovedadNomis("FK_IdEmpresa",novedadnomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadnomiLogic.setNovedadNomis(new ArrayList<NovedadNomi>());
						novedadnomiLogic.getNovedadNomis().addAll(novedadnomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadnomis=new ArrayList<NovedadNomi>();
							novedadnomis.addAll(novedadnomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstadoNovedadNomi")) {
				this.sDetalleReporte=NovedadNomiConstantesFunciones.getDetalleIndiceFK_IdEstadoNovedadNomi(id_estado_novedad_nomiFK_IdEstadoNovedadNomi);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					novedadnomiLogic.getNovedadNomisFK_IdEstadoNovedadNomi(finalQueryGlobal,pagination,id_estado_novedad_nomiFK_IdEstadoNovedadNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadNomiConstantesFunciones.getDetalleIndiceFK_IdEstadoNovedadNomi(id_estado_novedad_nomiFK_IdEstadoNovedadNomi);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadNomiConstantesFunciones.getDetalleIndiceFK_IdEstadoNovedadNomi(id_estado_novedad_nomiFK_IdEstadoNovedadNomi);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=novedadnomiLogic.getNovedadNomis()==null||novedadnomiLogic.getNovedadNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=novedadnomis==null|| novedadnomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadnomisAux=new ArrayList<NovedadNomi>();
						novedadnomisAux.addAll(novedadnomiLogic.getNovedadNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadnomisAux=new ArrayList<NovedadNomi>();
							novedadnomisAux.addAll(novedadnomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							novedadnomiLogic.getNovedadNomisFK_IdEstadoNovedadNomi(finalQueryGlobal,pagination,id_estado_novedad_nomiFK_IdEstadoNovedadNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadNomiConstantesFunciones.getDetalleIndiceFK_IdEstadoNovedadNomi(id_estado_novedad_nomiFK_IdEstadoNovedadNomi);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadNomiConstantesFunciones.getDetalleIndiceFK_IdEstadoNovedadNomi(id_estado_novedad_nomiFK_IdEstadoNovedadNomi);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteNovedadNomis("FK_IdEstadoNovedadNomi",novedadnomiLogic.getNovedadNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteNovedadNomis("FK_IdEstadoNovedadNomi",novedadnomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadnomiLogic.setNovedadNomis(new ArrayList<NovedadNomi>());
						novedadnomiLogic.getNovedadNomis().addAll(novedadnomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadnomis=new ArrayList<NovedadNomi>();
							novedadnomis.addAll(novedadnomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoNovedadNomi")) {
				this.sDetalleReporte=NovedadNomiConstantesFunciones.getDetalleIndiceFK_IdTipoNovedadNomi(id_tipo_novedad_nomiFK_IdTipoNovedadNomi);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					novedadnomiLogic.getNovedadNomisFK_IdTipoNovedadNomi(finalQueryGlobal,pagination,id_tipo_novedad_nomiFK_IdTipoNovedadNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadNomiConstantesFunciones.getDetalleIndiceFK_IdTipoNovedadNomi(id_tipo_novedad_nomiFK_IdTipoNovedadNomi);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadNomiConstantesFunciones.getDetalleIndiceFK_IdTipoNovedadNomi(id_tipo_novedad_nomiFK_IdTipoNovedadNomi);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=novedadnomiLogic.getNovedadNomis()==null||novedadnomiLogic.getNovedadNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=novedadnomis==null|| novedadnomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadnomisAux=new ArrayList<NovedadNomi>();
						novedadnomisAux.addAll(novedadnomiLogic.getNovedadNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadnomisAux=new ArrayList<NovedadNomi>();
							novedadnomisAux.addAll(novedadnomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							novedadnomiLogic.getNovedadNomisFK_IdTipoNovedadNomi(finalQueryGlobal,pagination,id_tipo_novedad_nomiFK_IdTipoNovedadNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadNomiConstantesFunciones.getDetalleIndiceFK_IdTipoNovedadNomi(id_tipo_novedad_nomiFK_IdTipoNovedadNomi);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadNomiConstantesFunciones.getDetalleIndiceFK_IdTipoNovedadNomi(id_tipo_novedad_nomiFK_IdTipoNovedadNomi);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteNovedadNomis("FK_IdTipoNovedadNomi",novedadnomiLogic.getNovedadNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteNovedadNomis("FK_IdTipoNovedadNomi",novedadnomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadnomiLogic.setNovedadNomis(new ArrayList<NovedadNomi>());
						novedadnomiLogic.getNovedadNomis().addAll(novedadnomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadnomis=new ArrayList<NovedadNomi>();
							novedadnomis.addAll(novedadnomisAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesNovedadNomi();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessNovedadNomi();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=novedadnomiLogic.getNovedadNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=novedadnomis.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=novedadnomiLogic.getNovedadNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=novedadnomis.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(NovedadNomi novedadnomi) {
		Boolean permite=true;
		
		if(this.novedadnomi.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=NovedadNomiConstantesFunciones.getOrderByListaNovedadNomi();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=NovedadNomiConstantesFunciones.getOrderByListaNovedadNomi();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NovedadNomi novedadnomi:novedadnomiLogic.getNovedadNomis()) {
				if(novedadnomi.getsType().equals(Constantes2.S_TOTALES)) {
					novedadnomiTotales=novedadnomi;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NovedadNomi novedadnomi:this.novedadnomis) {
				if(novedadnomi.getsType().equals(Constantes2.S_TOTALES)) {
					novedadnomiTotales=novedadnomi;
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
			this.novedadnomiAux=new NovedadNomi();
			this.novedadnomiAux.setsType(Constantes2.S_TOTALES);
			this.novedadnomiAux.setIsNew(false);
			this.novedadnomiAux.setIsChanged(false);
			this.novedadnomiAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				NovedadNomiConstantesFunciones.TotalizarValoresFilaNovedadNomi(this.novedadnomiLogic.getNovedadNomis(),this.novedadnomiAux);
				
				this.novedadnomiLogic.getNovedadNomis().add(this.novedadnomiAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				NovedadNomiConstantesFunciones.TotalizarValoresFilaNovedadNomi(this.novedadnomis,this.novedadnomiAux);
				
				this.novedadnomis.add(this.novedadnomiAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		novedadnomiTotales=new NovedadNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.novedadnomiLogic.getNovedadNomis().remove(novedadnomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.novedadnomis.remove(novedadnomiTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		novedadnomiTotales=new NovedadNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NovedadNomi novedadnomi:novedadnomiLogic.getNovedadNomis()) {
				if(novedadnomi.getsType().equals(Constantes2.S_TOTALES)) {
					novedadnomiTotales=novedadnomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				NovedadNomiConstantesFunciones.TotalizarValoresFilaNovedadNomi(this.novedadnomiLogic.getNovedadNomis(),novedadnomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NovedadNomi novedadnomi:this.novedadnomis) {
				if(novedadnomi.getsType().equals(Constantes2.S_TOTALES)) {
					novedadnomiTotales=novedadnomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				NovedadNomiConstantesFunciones.TotalizarValoresFilaNovedadNomi(this.novedadnomis,novedadnomiTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getNovedadNomisFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getNovedadNomisFK_IdEmpleadoAutoriza()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleadoAutoriza";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getNovedadNomisFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getNovedadNomisFK_IdEstadoNovedadNomi()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstadoNovedadNomi";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getNovedadNomisFK_IdTipoNovedadNomi()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoNovedadNomi";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getNovedadNomisFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					novedadnomiLogic.getNovedadNomisFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getNovedadNomisFK_IdEmpleadoAutoriza(String sFinalQuery,Long id_empleado_autoriza)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					novedadnomiLogic.getNovedadNomisFK_IdEmpleadoAutoriza(sFinalQuery,this.pagination,id_empleado_autoriza);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getNovedadNomisFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					novedadnomiLogic.getNovedadNomisFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getNovedadNomisFK_IdEstadoNovedadNomi(String sFinalQuery,Long id_estado_novedad_nomi)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					novedadnomiLogic.getNovedadNomisFK_IdEstadoNovedadNomi(sFinalQuery,this.pagination,id_estado_novedad_nomi);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getNovedadNomisFK_IdTipoNovedadNomi(String sFinalQuery,Long id_tipo_novedad_nomi)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					novedadnomiLogic.getNovedadNomisFK_IdTipoNovedadNomi(sFinalQuery,this.pagination,id_tipo_novedad_nomi);
				
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
	
	public void inicializarPermisosNovedadNomi() {
		this.isPermisoTodoNovedadNomi=false;
		this.isPermisoNuevoNovedadNomi=false;
		this.isPermisoActualizarNovedadNomi=false;
		this.isPermisoActualizarOriginalNovedadNomi=false;
		this.isPermisoEliminarNovedadNomi=false;
		this.isPermisoGuardarCambiosNovedadNomi=false;
		this.isPermisoConsultaNovedadNomi=false;
		this.isPermisoBusquedaNovedadNomi=false;
		this.isPermisoReporteNovedadNomi=false;		
		this.isPermisoOrdenNovedadNomi=false;		
		this.isPermisoPaginacionMedioNovedadNomi=false;		
		this.isPermisoPaginacionAltoNovedadNomi=false;
		this.isPermisoPaginacionTodoNovedadNomi=false;
		this.isPermisoCopiarNovedadNomi=false;		
		this.isPermisoVerFormNovedadNomi=false;		
		this.isPermisoDuplicarNovedadNomi=false;		
		this.isPermisoOrdenNovedadNomi=false;		
	}
	
	public void setPermisosUsuarioNovedadNomi(Boolean isPermiso) {
		this.isPermisoTodoNovedadNomi=isPermiso;
		this.isPermisoNuevoNovedadNomi=isPermiso;
		this.isPermisoActualizarNovedadNomi=isPermiso;
		this.isPermisoActualizarOriginalNovedadNomi=isPermiso;
		this.isPermisoEliminarNovedadNomi=isPermiso;
		this.isPermisoGuardarCambiosNovedadNomi=isPermiso;
		this.isPermisoConsultaNovedadNomi=isPermiso;
		this.isPermisoBusquedaNovedadNomi=isPermiso;
		this.isPermisoReporteNovedadNomi=isPermiso;
		this.isPermisoOrdenNovedadNomi=isPermiso;		
		this.isPermisoPaginacionMedioNovedadNomi=isPermiso;		
		this.isPermisoPaginacionAltoNovedadNomi=isPermiso;		
		this.isPermisoPaginacionTodoNovedadNomi=isPermiso;		
		this.isPermisoCopiarNovedadNomi=isPermiso;		
		this.isPermisoVerFormNovedadNomi=isPermiso;		
		this.isPermisoDuplicarNovedadNomi=isPermiso;
		this.isPermisoOrdenNovedadNomi=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioNovedadNomi(Boolean isPermiso) {
		//this.isPermisoTodoNovedadNomi=isPermiso;
		this.isPermisoNuevoNovedadNomi=isPermiso;
		this.isPermisoActualizarNovedadNomi=isPermiso;
		this.isPermisoActualizarOriginalNovedadNomi=isPermiso;
		this.isPermisoEliminarNovedadNomi=isPermiso;
		this.isPermisoGuardarCambiosNovedadNomi=isPermiso;
		//this.isPermisoConsultaNovedadNomi=isPermiso;
		//this.isPermisoBusquedaNovedadNomi=isPermiso;
		//this.isPermisoReporteNovedadNomi=isPermiso;
		//this.isPermisoOrdenNovedadNomi=isPermiso;		
		//this.isPermisoPaginacionMedioNovedadNomi=isPermiso;		
		//this.isPermisoPaginacionAltoNovedadNomi=isPermiso;		
		//this.isPermisoPaginacionTodoNovedadNomi=isPermiso;		
		//this.isPermisoCopiarNovedadNomi=isPermiso;		
		//this.isPermisoDuplicarNovedadNomi=isPermiso;
		//this.isPermisoOrdenNovedadNomi=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioNovedadNomiClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(NovedadNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebNovedadNomi(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioNovedadNomiClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioNovedadNomiClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionNovedadNomiClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioNovedadNomiClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioNovedadNomi() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(NovedadNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.novedadnomiSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, NovedadNomiConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoNovedadNomi=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarNovedadNomi=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalNovedadNomi=this.isPermisoActualizarNovedadNomi;
			this.isPermisoEliminarNovedadNomi=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosNovedadNomi=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaNovedadNomi=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaNovedadNomi=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoNovedadNomi=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteNovedadNomi=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenNovedadNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioNovedadNomi=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoNovedadNomi=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoNovedadNomi=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarNovedadNomi=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormNovedadNomi=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarNovedadNomi=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenNovedadNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.novedadnomiSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosNovedadNomi.setToolTipText(this.jTableDatosNovedadNomi.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioNovedadNomi(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioNovedadNomi(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(NovedadNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(NovedadNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioNovedadNomi() throws Exception {
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
	public void inicializarCombosForeignKeyNovedadNomiListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.empleadoautorizasForeignKey=new ArrayList();
				this.tiponovedadnomisForeignKey=new ArrayList();
				this.estadonovedadnomisForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyNovedadNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(NovedadNomiJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyNovedadNomiListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoAutorizaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoNovedadNomiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstadoNovedadNomiListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEmpleadoAutorizaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empleadoautorizasForeignKey==null||this.empleadoautorizasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpleadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpleadoAutorizasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoNovedadNomiListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tiponovedadnomisForeignKey==null||this.tiponovedadnomisForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoNovedadNomiConstantesFunciones.getArrayColumnasGlobalesTipoNovedadNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoNovedadNomiConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoNovedadNomiConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoNovedadNomisForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstadoNovedadNomiListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estadonovedadnomisForeignKey==null||this.estadonovedadnomisForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstadoNovedadNomiConstantesFunciones.getArrayColumnasGlobalesEstadoNovedadNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoNovedadNomiConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstadoNovedadNomiConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstadoNovedadNomisForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyNovedadNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			NovedadNomiParameterReturnGeneral novedadnomiReturnGeneral=new NovedadNomiParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.novedadnomiConstantesFunciones.cargarid_empresaNovedadNomi)
					 || (this.esRecargarFks && this.novedadnomiConstantesFunciones.cargarid_empresaNovedadNomi)) {

					if(!this.novedadnomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+novedadnomiSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.novedadnomiConstantesFunciones.cargarid_empleadoNovedadNomi)
					 || (this.esRecargarFks && this.novedadnomiConstantesFunciones.cargarid_empleadoNovedadNomi)) {

					if(!this.novedadnomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+novedadnomiSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalEmpleadoAutoriza="";

				if(((this.empleadoautorizasForeignKey==null||this.empleadoautorizasForeignKey.size()<=0) && this.novedadnomiConstantesFunciones.cargarid_empleado_autorizaNovedadNomi)
					 || (this.esRecargarFks && this.novedadnomiConstantesFunciones.cargarid_empleado_autorizaNovedadNomi)) {

					if(!this.novedadnomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpleadoAutoriza()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleadoAutoriza=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleadoAutoriza=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleadoAutoriza, "");
						finalQueryGlobalEmpleadoAutoriza+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadoAutorizasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleadoAutoriza=" WHERE " + ConstantesSql.ID + "="+novedadnomiSessionBean.getlidEmpleadoAutorizaActual();
					}
				} else {
					finalQueryGlobalEmpleadoAutoriza="NONE";
				}


				String finalQueryGlobalTipoNovedadNomi="";

				if(((this.tiponovedadnomisForeignKey==null||this.tiponovedadnomisForeignKey.size()<=0) && this.novedadnomiConstantesFunciones.cargarid_tipo_novedad_nomiNovedadNomi)
					 || (this.esRecargarFks && this.novedadnomiConstantesFunciones.cargarid_tipo_novedad_nomiNovedadNomi)) {

					if(!this.novedadnomiSessionBean.getisBusquedaDesdeForeignKeySesionTipoNovedadNomi()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoNovedadNomiConstantesFunciones.getArrayColumnasGlobalesTipoNovedadNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoNovedadNomi=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoNovedadNomiConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoNovedadNomi=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoNovedadNomi, "");
						finalQueryGlobalTipoNovedadNomi+=TipoNovedadNomiConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoNovedadNomisForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoNovedadNomi=" WHERE " + ConstantesSql.ID + "="+novedadnomiSessionBean.getlidTipoNovedadNomiActual();
					}
				} else {
					finalQueryGlobalTipoNovedadNomi="NONE";
				}


				String finalQueryGlobalEstadoNovedadNomi="";

				if(((this.estadonovedadnomisForeignKey==null||this.estadonovedadnomisForeignKey.size()<=0) && this.novedadnomiConstantesFunciones.cargarid_estado_novedad_nomiNovedadNomi)
					 || (this.esRecargarFks && this.novedadnomiConstantesFunciones.cargarid_estado_novedad_nomiNovedadNomi)) {

					if(!this.novedadnomiSessionBean.getisBusquedaDesdeForeignKeySesionEstadoNovedadNomi()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstadoNovedadNomiConstantesFunciones.getArrayColumnasGlobalesEstadoNovedadNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstadoNovedadNomi=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoNovedadNomiConstantesFunciones.TABLENAME);

						finalQueryGlobalEstadoNovedadNomi=Funciones.GetFinalQueryAppend(finalQueryGlobalEstadoNovedadNomi, "");
						finalQueryGlobalEstadoNovedadNomi+=EstadoNovedadNomiConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstadoNovedadNomisForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstadoNovedadNomi=" WHERE " + ConstantesSql.ID + "="+novedadnomiSessionBean.getlidEstadoNovedadNomiActual();
					}
				} else {
					finalQueryGlobalEstadoNovedadNomi="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				novedadnomiReturnGeneral=novedadnomiLogic.cargarCombosLoteForeignKeyNovedadNomi(finalQueryGlobalEmpresa,finalQueryGlobalEmpleado,finalQueryGlobalEmpleadoAutoriza,finalQueryGlobalTipoNovedadNomi,finalQueryGlobalEstadoNovedadNomi);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=novedadnomiReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=novedadnomiReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalEmpleadoAutoriza.equals("NONE")) {
				this.empleadoautorizasForeignKey=novedadnomiReturnGeneral.getempleadoautorizasForeignKey();
			}

			if(!finalQueryGlobalTipoNovedadNomi.equals("NONE")) {
				this.tiponovedadnomisForeignKey=novedadnomiReturnGeneral.gettiponovedadnomisForeignKey();
			}

			if(!finalQueryGlobalEstadoNovedadNomi.equals("NONE")) {
				this.estadonovedadnomisForeignKey=novedadnomiReturnGeneral.getestadonovedadnomisForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyNovedadNomi()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyEmpleadoAutoriza();
			this.addItemDefectoCombosForeignKeyTipoNovedadNomi();
			this.addItemDefectoCombosForeignKeyEstadoNovedadNomi();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.novedadnomiSessionBean==null) {
				this.novedadnomiSessionBean=new NovedadNomiSessionBean();
			}

			if(!this.novedadnomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.novedadnomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

	public void addItemDefectoCombosForeignKeyEmpleadoAutoriza()throws Exception {
		try {

			if(!this.novedadnomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpleadoAutoriza()) {
				Empleado empleadoautoriza=new Empleado();
				EmpleadoConstantesFunciones.setEmpleadoDescripcion(empleadoautoriza,Constantes.SMENSAJE_ESCOJA_OPCION);
				empleadoautoriza.setId(null);

				if(!EmpleadoConstantesFunciones.ExisteEnLista(this.empleadoautorizasForeignKey,empleadoautoriza,true)) {

					this.empleadoautorizasForeignKey.add(0,empleadoautoriza);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoNovedadNomi()throws Exception {
		try {

			if(!this.novedadnomiSessionBean.getisBusquedaDesdeForeignKeySesionTipoNovedadNomi()) {
				TipoNovedadNomi tiponovedadnomi=new TipoNovedadNomi();
				TipoNovedadNomiConstantesFunciones.setTipoNovedadNomiDescripcion(tiponovedadnomi,Constantes.SMENSAJE_ESCOJA_OPCION);
				tiponovedadnomi.setId(null);

				if(!TipoNovedadNomiConstantesFunciones.ExisteEnLista(this.tiponovedadnomisForeignKey,tiponovedadnomi,true)) {

					this.tiponovedadnomisForeignKey.add(0,tiponovedadnomi);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEstadoNovedadNomi()throws Exception {
		try {

			if(!this.novedadnomiSessionBean.getisBusquedaDesdeForeignKeySesionEstadoNovedadNomi()) {
				EstadoNovedadNomi estadonovedadnomi=new EstadoNovedadNomi();
				EstadoNovedadNomiConstantesFunciones.setEstadoNovedadNomiDescripcion(estadonovedadnomi,Constantes.SMENSAJE_ESCOJA_OPCION);
				estadonovedadnomi.setId(null);

				if(!EstadoNovedadNomiConstantesFunciones.ExisteEnLista(this.estadonovedadnomisForeignKey,estadonovedadnomi,true)) {

					this.estadonovedadnomisForeignKey.add(0,estadonovedadnomi);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyNovedadNomi()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyNovedadNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyNovedadNomi()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
				this.novedadnomi.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyNovedadNomi();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyNovedadNomi(NovedadNomi novedadnomi)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(novedadnomi.getid_empleado(),false,"Formulario");
			this.setActualEmpleadoAutorizaForeignKey(novedadnomi.getid_empleado_autoriza(),false,"Formulario");
			this.setActualTipoNovedadNomiForeignKey(novedadnomi.getid_tipo_novedad_nomi(),false,"Formulario");
			this.setActualEstadoNovedadNomiForeignKey(novedadnomi.getid_estado_novedad_nomi(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyNovedadNomi(NovedadNomi novedadnomi,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyNovedadNomi()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.novedadnomiConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualEmpleadoAutorizaForeignKey(this.novedadnomiConstantesFunciones.getid_empleado_autoriza(),false,"Formulario");
			this.setActualTipoNovedadNomiForeignKey(this.novedadnomiConstantesFunciones.getid_tipo_novedad_nomi(),false,"Formulario");
			this.setActualEstadoNovedadNomiForeignKey(this.novedadnomiConstantesFunciones.getid_estado_novedad_nomi(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyNovedadNomi()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyNovedadNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyNovedadNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroNovedadNomi()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyNovedadNomi()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameEmpleadoAutorizasForeignKey("Todos");
			this.cargarCombosFrameTipoNovedadNomisForeignKey("Todos");
			this.cargarCombosFrameEstadoNovedadNomisForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyNovedadNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadoAutorizasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoNovedadNomisForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstadoNovedadNomisForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyNovedadNomi()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empresaNovedadNomi!=null && this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empresaNovedadNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empresaNovedadNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empleadoNovedadNomi!=null && this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empleadoNovedadNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empleadoNovedadNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empleado_autorizaNovedadNomi!=null && this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empleado_autorizaNovedadNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empleado_autorizaNovedadNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_tipo_novedad_nomiNovedadNomi!=null && this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_tipo_novedad_nomiNovedadNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_tipo_novedad_nomiNovedadNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_estado_novedad_nomiNovedadNomi!=null && this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_estado_novedad_nomiNovedadNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_estado_novedad_nomiNovedadNomi.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public NovedadNomiBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public NovedadNomiBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public NovedadNomiBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.novedadnomiSessionBean=new NovedadNomiSessionBean(); 
		this.novedadnomiConstantesFunciones=new NovedadNomiConstantesFunciones(); 
		this.novedadnomiBean=new NovedadNomi();//(this.novedadnomiConstantesFunciones); 		
		this.novedadnomiReturnGeneral=new NovedadNomiParameterReturnGeneral(); 
		
		this.novedadnomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.novedadnomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public NovedadNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public NovedadNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public NovedadNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessNovedadNomi(true);
			
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
			
			this.novedadnomiConstantesFunciones=new NovedadNomiConstantesFunciones(); 
			this.novedadnomiBean=new NovedadNomi();//this.novedadnomiConstantesFunciones); 			
			this.novedadnomiReturnGeneral=new NovedadNomiParameterReturnGeneral(); 
		
			NovedadNomiBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Novedad Nomi Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.novedadnomi=new NovedadNomi();
			this.novedadnomis = new ArrayList<NovedadNomi>();
			this.novedadnomisAux = new ArrayList<NovedadNomi>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic=new NovedadNomiLogic();
				this.novedadnomiLogic.getNewConnexionToDeep("");
			}
			
			//this.novedadnomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.novedadnomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormNovedadNomi);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoNovedadNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoNovedadNomi);	
					}
					
					if(this.jInternalFrameImportacionNovedadNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionNovedadNomi);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByNovedadNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByNovedadNomi);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormNovedadNomi!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormNovedadNomi);
				this.jInternalFrameDetalleFormNovedadNomi.setVisible(false);
				this.jInternalFrameDetalleFormNovedadNomi.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoNovedadNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoNovedadNomi);
					this.jInternalFrameReporteDinamicoNovedadNomi.setVisible(false);
					this.jInternalFrameReporteDinamicoNovedadNomi.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionNovedadNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionNovedadNomi);
					this.jInternalFrameImportacionNovedadNomi.setVisible(false);
					this.jInternalFrameImportacionNovedadNomi.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByNovedadNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByNovedadNomi);
					this.jInternalFrameOrderByNovedadNomi.setVisible(false);
					this.jInternalFrameOrderByNovedadNomi.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idNovedadNomiActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=NovedadNomiConstantesFunciones.INUMEROPAGINACION;
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
			
			this.novedadnomiReturnGeneral=new NovedadNomiParameterReturnGeneral();
			
			this.novedadnomiParameterGeneral=new NovedadNomiParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.novedadnomiLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.novedadnomiSessionBean.getEsGuardarRelacionado()) {
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
			
			if(NovedadNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.novedadnomiSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,NovedadNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.novedadnomiSessionBean.getEsGuardarRelacionado(),this.novedadnomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,NovedadNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.novedadnomiSessionBean.getEsGuardarRelacionado(),this.novedadnomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoNovedadNomi=false;
			this.isVisibilidadCeldaDuplicarNovedadNomi=true;
			this.isVisibilidadCeldaCopiarNovedadNomi=true;
			this.isVisibilidadCeldaVerFormNovedadNomi=true;
			this.isVisibilidadCeldaOrdenNovedadNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesNovedadNomi=false;
			this.isVisibilidadCeldaModificarNovedadNomi=false;
			this.isVisibilidadCeldaActualizarNovedadNomi=false;
			this.isVisibilidadCeldaEliminarNovedadNomi=false;
			this.isVisibilidadCeldaCancelarNovedadNomi=false;
			this.isVisibilidadCeldaGuardarNovedadNomi=false;
			this.isVisibilidadCeldaGuardarCambiosNovedadNomi=false;
			
			
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpleadoAutoriza=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstadoNovedadNomi=true;
			this.isVisibilidadFK_IdTipoNovedadNomi=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesNovedadNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosNovedadNomi();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioNovedadNomi(false);
			
			this.setPermisosUsuarioNovedadNomi();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.novedadnomiSessionBean.getEsGuardarRelacionado() 
				|| (this.novedadnomiSessionBean.getEsGuardarRelacionado() && this.novedadnomiSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioNovedadNomiClasesRelacionadas();
			}
			
			if(this.novedadnomiSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioNovedadNomiClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!NovedadNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosNovedadNomi();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualNovedadNomi();
			}
			
			if(!this.isPermisoBusquedaNovedadNomi) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasNovedadNomi.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.novedadnomiSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioNovedadNomi,this.isPermisoPaginacionMedioNovedadNomi,this.isPermisoPaginacionTodoNovedadNomi);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(NovedadNomiConstantesFunciones.getTiposSeleccionarNovedadNomi());
				
				this.tiposColumnasSelect=NovedadNomiConstantesFunciones.getTiposSeleccionarNovedadNomi(true);
				
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
			//if(!this.novedadnomiSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioNovedadNomi();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioNovedadNomi(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioNovedadNomi(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesNovedadNomi() ;
			
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
			this.empleadoautorizaLogic=new EmpleadoLogic();
			this.tiponovedadnomiLogic=new TipoNovedadNomiLogic();
			this.estadonovedadnomiLogic=new EstadoNovedadNomiLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				novedadnomiImplementable= (NovedadNomiImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+NovedadNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				novedadnomiImplementableHome= (NovedadNomiImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+NovedadNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.novedadnomis= new ArrayList<NovedadNomi>();
			this.novedadnomisEliminados= new ArrayList<NovedadNomi>();
						
			this.isEsNuevoNovedadNomi=false;
			this.esParaAccionDesdeFormularioNovedadNomi=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.empleadoautorizasForeignKey=new ArrayList<Empleado>() ;
			this.tiponovedadnomisForeignKey=new ArrayList<TipoNovedadNomi>() ;
			this.estadonovedadnomisForeignKey=new ArrayList<EstadoNovedadNomi>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyNovedadNomi(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroNovedadNomi();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.novedadnomiSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			NovedadNomiBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=NovedadNomiConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesNovedadNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingNovedadNomi(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormNovedadNomi!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioNovedadNomi();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioNovedadNomi();
			}
			
			NovedadNomiBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasNovedadNomi.getTabCount(); i++) {
					this.jTabbedPaneBusquedasNovedadNomi.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasNovedadNomi.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessNovedadNomi(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga NovedadNomi: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectNovedadNomi() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesNovedadNomi")) {
				iIndex=this.jInternalFrameDetalleFormNovedadNomi.jTabbedPaneRelacionesNovedadNomi.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormNovedadNomi.jTabbedPaneRelacionesNovedadNomi.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessNovedadNomi();	
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
	
	public void cargarCombosForeignKeyNovedadNomi(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyNovedadNomi(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyNovedadNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyNovedadNomiListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyNovedadNomi();
		
		this.cargarCombosFrameForeignKeyNovedadNomi();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyNovedadNomi();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyNovedadNomi();
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

	public void cargarCombosForeignKeyEmpleadoAutoriza(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEmpleadoAutorizaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEmpleadoAutoriza();
				this.cargarCombosFrameEmpleadoAutorizasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEmpleadoAutoriza(this.empleadoautorizasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoNovedadNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoNovedadNomiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoNovedadNomi();
				this.cargarCombosFrameTipoNovedadNomisForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoNovedadNomi(this.tiponovedadnomisForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstadoNovedadNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstadoNovedadNomiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstadoNovedadNomi();
				this.cargarCombosFrameEstadoNovedadNomisForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstadoNovedadNomi(this.estadonovedadnomisForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoNovedadNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.novedadnomiSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormNovedadNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
			
			
			if(jTableDatosNovedadNomi.getRowCount()>=1) {
				jTableDatosNovedadNomi.removeRowSelectionInterval(0, jTableDatosNovedadNomi.getRowCount()-1);						
			}
			
			this.isEsNuevoNovedadNomi=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoNovedadNomi(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesNovedadNomi(true);			
			//this.novedadnomi=new NovedadNomi();
			//this.novedadnomi.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNovedadNomi(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNovedadNomi() ;
			
			if(NovedadNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNovedadNomi(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.novedadnomi);	
			this.actualizarInformacion("INFO_PADRE",false,this.novedadnomi);				
			
			NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
			
			if(this.novedadnomiSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar NovedadNomi: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarNovedadNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<NovedadNomi> novedadnomisSeleccionados=new ArrayList<NovedadNomi>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosNovedadNomi.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosNovedadNomi.getSelectedRows().length;			
			}
			
			novedadnomisSeleccionados=this.getNovedadNomisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoNovedadNomi--;			
				//NovedadNomi novedadnomiAux= new NovedadNomi();			
				//novedadnomiAux.setId(this.iIdNuevoNovedadNomi);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//NovedadNomi novedadnomiOrigen=new NovedadNomi();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(NovedadNomi novedadnomiOrigen : novedadnomisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							novedadnomiOrigen =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadnomiOrigen =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaNovedadNomi();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.novedadnomi.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosNovedadNomi(novedadnomiOrigen,this.novedadnomi,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.novedadnomiLogic.getNovedadNomis().add(this.novedadnomiAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.novedadnomis.add(this.novedadnomiAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaNovedadNomi(false);
				
				this.jTableDatosNovedadNomi.setRowSelectionInterval(this.getIndiceNuevoNovedadNomi(), this.getIndiceNuevoNovedadNomi());
				
				int iLastRow =  this.jTableDatosNovedadNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosNovedadNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosNovedadNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaNovedadNomi(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<NovedadNomi> novedadnomisSeleccionados=new ArrayList<NovedadNomi>();									
		
			NovedadNomi novedadnomiOrigen=new NovedadNomi();
			NovedadNomi novedadnomiDestino=new NovedadNomi();
				
			novedadnomisSeleccionados=this.getNovedadNomisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosNovedadNomi.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || novedadnomisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosNovedadNomi.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadnomiOrigen =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						novedadnomiOrigen =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadnomiDestino =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						novedadnomiDestino =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				novedadnomiOrigen =novedadnomisSeleccionados.get(0);
				novedadnomiDestino =novedadnomisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosNovedadNomi(novedadnomiOrigen,novedadnomiDestino,true,false);
				
				novedadnomiDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(novedadnomiDestino,novedadnomiLogic.getNovedadNomis());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(novedadnomiDestino,novedadnomis);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaNovedadNomi(false);
				
				//this.jTableDatosNovedadNomi.setRowSelectionInterval(this.getIndiceNuevoNovedadNomi(), this.getIndiceNuevoNovedadNomi());
				
				int iLastRow =  this.jTableDatosNovedadNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosNovedadNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosNovedadNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaNovedadNomi(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormNovedadNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormNovedadNomi.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesNovedadNomi.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasNovedadNomi.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesNovedadNomi.setVisible(!isVisible);
			this.jPanelPaginacionNovedadNomi.setVisible(!isVisible);
			this.jPanelAccionesNovedadNomi.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameNovedadNomi();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoNovedadNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionNovedadNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByNovedadNomi();
			
			this.abrirFrameOrderByNovedadNomi();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByNovedadNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleNovedadNomi(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormNovedadNomi);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormNovedadNomi.isMaximum()) {
					this.jInternalFrameDetalleFormNovedadNomi.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormNovedadNomi.setSize(this.jInternalFrameDetalleFormNovedadNomi.iWidthFormulario,this.jInternalFrameDetalleFormNovedadNomi.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormNovedadNomi.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormNovedadNomi.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormNovedadNomi.isMaximum()) {
						this.jInternalFrameDetalleFormNovedadNomi.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormNovedadNomi.jContentPaneDetalleNovedadNomi.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormNovedadNomi.jTabbedPaneRelacionesNovedadNomi.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormNovedadNomi.jContentPaneDetalleNovedadNomi.getWidth(),NovedadNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormNovedadNomi.jTabbedPaneRelacionesNovedadNomi.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormNovedadNomi.jContentPaneDetalleNovedadNomi.getWidth(),NovedadNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormNovedadNomi.jTabbedPaneRelacionesNovedadNomi.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormNovedadNomi.jContentPaneDetalleNovedadNomi.getWidth(),NovedadNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormNovedadNomi.setVisible(true);
	        this.jInternalFrameDetalleFormNovedadNomi.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByNovedadNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByNovedadNomi==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByNovedadNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNovedadNomi,false,this);
				} else {
					this.jInternalFrameOrderByNovedadNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNovedadNomi,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByNovedadNomi);
				this.jInternalFrameOrderByNovedadNomi.setVisible(false);
				this.jInternalFrameOrderByNovedadNomi.setSelected(false);
				
				this.jInternalFrameOrderByNovedadNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByNovedadNomi"));
				
				this.inicializarActualizarBindingTablaOrderByNovedadNomi();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionNovedadNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionNovedadNomi==null) {
				
				this.jInternalFrameImportacionNovedadNomi=new ImportacionJInternalFrame(NovedadNomiConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionNovedadNomi);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionNovedadNomi);
				this.jInternalFrameImportacionNovedadNomi.setVisible(false);
				this.jInternalFrameImportacionNovedadNomi.setSelected(false);


				this.jInternalFrameImportacionNovedadNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionNovedadNomi"));
				this.jInternalFrameImportacionNovedadNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionNovedadNomi"));
				this.jInternalFrameImportacionNovedadNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionNovedadNomi"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoNovedadNomi() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoNovedadNomi==null) {
				this.jInternalFrameReporteDinamicoNovedadNomi=new ReporteDinamicoJInternalFrame(NovedadNomiConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoNovedadNomi);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoNovedadNomi);
				this.jInternalFrameReporteDinamicoNovedadNomi.setVisible(false);
				this.jInternalFrameReporteDinamicoNovedadNomi.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoNovedadNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNovedadNomi"));
				this.jInternalFrameReporteDinamicoNovedadNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNovedadNomi"));
				this.jInternalFrameReporteDinamicoNovedadNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNovedadNomi"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNovedadNomi();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleNovedadNomi() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormNovedadNomi);
			
	       	this.jInternalFrameDetalleFormNovedadNomi.setVisible(false);
	        this.jInternalFrameDetalleFormNovedadNomi.setSelected(false);
			
			//this.jInternalFrameDetalleFormNovedadNomi.dispose();
			//this.jInternalFrameDetalleFormNovedadNomi=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoNovedadNomi() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoNovedadNomi.setVisible(true);
	        this.jInternalFrameReporteDinamicoNovedadNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionNovedadNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionNovedadNomi.setVisible(true);
	        this.jInternalFrameImportacionNovedadNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByNovedadNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByNovedadNomi.setVisible(true);
	        this.jInternalFrameOrderByNovedadNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByNovedadNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByNovedadNomi.setVisible(false);
	        this.jInternalFrameOrderByNovedadNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoNovedadNomi() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoNovedadNomi.setVisible(false);
	        this.jInternalFrameReporteDinamicoNovedadNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionNovedadNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionNovedadNomi.setVisible(false);
	        this.jInternalFrameImportacionNovedadNomi.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarNovedadNomi(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarNovedadNomi(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesNovedadNomi(true);
			//this.isEsNuevoNovedadNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomi =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.novedadnomi =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesNovedadNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNovedadNomi(false) ;
			
			if(novedadnomiSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(NovedadNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNovedadNomi(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNovedadNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaNovedadNomiActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomi =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedadnomi =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarNovedadNomi(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormNovedadNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesNovedadNomi(true);
			//this.isEsNuevoNovedadNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomi =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.novedadnomi =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.novedadnomi.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesNovedadNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesNovedadNomi(false) ;
			
			if(NovedadNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNovedadNomi(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNovedadNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosNovedadNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadNomi,NovedadNomiConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosNovedadNomi.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEmpleadoAutoriza(List<Empleado> empleadoautorizasForeignKey)throws Exception{
		TableColumn tableColumnEmpleadoAutoriza=this.jTableDatosNovedadNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadNomi,NovedadNomiConstantesFunciones.LABEL_IDEMPLEADOAUTORIZA));
		TableCellEditor tableCellEditorEmpleadoAutoriza =tableColumnEmpleadoAutoriza.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleadoAutoriza;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadoautorizasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosNovedadNomi.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadoautorizasForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoNovedadNomi(List<TipoNovedadNomi> tiponovedadnomisForeignKey)throws Exception{
		TableColumn tableColumnTipoNovedadNomi=this.jTableDatosNovedadNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadNomi,NovedadNomiConstantesFunciones.LABEL_IDTIPONOVEDADNOMI));
		TableCellEditor tableCellEditorTipoNovedadNomi =tableColumnTipoNovedadNomi.getCellEditor();

		TipoNovedadNomiTableCell tiponovedadnomiTableCellFk=(TipoNovedadNomiTableCell)tableCellEditorTipoNovedadNomi;

		if(tiponovedadnomiTableCellFk!=null) {
			tiponovedadnomiTableCellFk.settiponovedadnomisForeignKey(tiponovedadnomisForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosNovedadNomi.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tiponovedadnomiTableCellFk.setRowActual(intSelectedRow);
			//tiponovedadnomiTableCellFk.settiponovedadnomisForeignKeyActual(tiponovedadnomisForeignKey);
		//}


		if(tiponovedadnomiTableCellFk!=null) {
			tiponovedadnomiTableCellFk.RecargarTipoNovedadNomisForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstadoNovedadNomi(List<EstadoNovedadNomi> estadonovedadnomisForeignKey)throws Exception{
		TableColumn tableColumnEstadoNovedadNomi=this.jTableDatosNovedadNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadNomi,NovedadNomiConstantesFunciones.LABEL_IDESTADONOVEDADNOMI));
		TableCellEditor tableCellEditorEstadoNovedadNomi =tableColumnEstadoNovedadNomi.getCellEditor();

		EstadoNovedadNomiTableCell estadonovedadnomiTableCellFk=(EstadoNovedadNomiTableCell)tableCellEditorEstadoNovedadNomi;

		if(estadonovedadnomiTableCellFk!=null) {
			estadonovedadnomiTableCellFk.setestadonovedadnomisForeignKey(estadonovedadnomisForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosNovedadNomi.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estadonovedadnomiTableCellFk.setRowActual(intSelectedRow);
			//estadonovedadnomiTableCellFk.setestadonovedadnomisForeignKeyActual(estadonovedadnomisForeignKey);
		//}


		if(estadonovedadnomiTableCellFk!=null) {
			estadonovedadnomiTableCellFk.RecargarEstadoNovedadNomisForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesNovedadNomi(false);
			
			//if(!this.isEsNuevoNovedadNomi) {								
				int intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomi =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.novedadnomi =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(NovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualNovedadNomi(this.novedadnomi,true);
				this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);
				
			}
			
			if(this.permiteMantenimiento(this.novedadnomi)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.novedadnomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoNovedadNomi=true;
					this.inicializarActualizarBindingTablaNovedadNomi(false);
					this.isEsNuevoNovedadNomi=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoNovedadNomi=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoNovedadNomi=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesNovedadNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNovedadNomi(false);
				
				this.habilitarDeshabilitarControlesNovedadNomi(false);
			
												
				
				if(NovedadNomiJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleNovedadNomi();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoNovedadNomiActionPerformed(evt,novedadnomiSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualNovedadNomi(this.novedadnomi,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosNovedadNomi.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,novedadnomiSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.novedadnomi.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(NovedadNomi.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadNomi.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomi =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				this.novedadnomi.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.novedadnomi =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				this.novedadnomi.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.novedadnomi)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.novedadnomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((NovedadNomiModel) this.jTableDatosNovedadNomi.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoNovedadNomi=true;
				this.inicializarActualizarBindingTablaNovedadNomi(false);
				this.isEsNuevoNovedadNomi=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesNovedadNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNovedadNomi(false);
				
				this.habilitarDeshabilitarControlesNovedadNomi(false);
				
				
				
				if(NovedadNomiJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleNovedadNomi();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarNovedadNomiActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosNovedadNomi.getRowCount()>=1) {
				jTableDatosNovedadNomi.removeRowSelectionInterval(0, jTableDatosNovedadNomi.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesNovedadNomi(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaNovedadNomi(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNovedadNomi(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNovedadNomi(false) ;
			
			this.isEsNuevoNovedadNomi=false;
			
			if(NovedadNomiJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleNovedadNomi();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosNovedadNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingNovedadNomi(false);
				
				//SI ES MANUAL
				if(NovedadNomiJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualNovedadNomi();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosNovedadNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoNovedadNomi--;			
			//NovedadNomi novedadnomiAux= new NovedadNomi();			
			//novedadnomiAux.setId(this.iIdNuevoNovedadNomi);
			
			if(this.jInternalFrameDetalleFormNovedadNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaNovedadNomi();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);
			
			this.novedadnomi.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.novedadnomiLogic.getNovedadNomis().add(this.novedadnomiAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.novedadnomis.add(this.novedadnomiAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaNovedadNomi(false);
			
			this.jTableDatosNovedadNomi.setRowSelectionInterval(this.getIndiceNuevoNovedadNomi(), this.getIndiceNuevoNovedadNomi());
			
			int iLastRow =  this.jTableDatosNovedadNomi.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosNovedadNomi.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosNovedadNomi.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaNovedadNomi(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionNovedadNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingNovedadNomi(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNovedadNomi(false);
			
			//SI ES MANUAL
			if(NovedadNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNovedadNomi();
			}
			
			//this.abrirFrameTreeNovedadNomi();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionNovedadNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Novedad NomiS ?", "MANTENIMIENTO DE Novedad Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionNovedadNomi.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralNovedadNomi();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.novedadnomiReturnGeneral=novedadnomiLogic.procesarImportacionNovedadNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.novedadnomiParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarNovedadNomiReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionNovedadNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionNovedadNomi.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionNovedadNomi.setFileImportacion(this.jInternalFrameImportacionNovedadNomi.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionNovedadNomi.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionNovedadNomi.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionNovedadNomi.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionNovedadNomi.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<NovedadNomi> novedadnomisSeleccionados=new ArrayList<NovedadNomi>();		

		novedadnomisSeleccionados=this.getNovedadNomisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNovedadNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNovedadNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("NovedadNomiBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"NovedadNomiBaseDesign.jrxml";
			
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
			
			this.generarReporteNovedadNomis("Todos",novedadnomisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoNovedadNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNovedadNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case NovedadNomiConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NovedadNomiConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NovedadNomiConstantesFunciones.LABEL_IDEMPLEADOAUTORIZA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EmpleadoAutoriza_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EmpleadoAutoriza_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EmpleadoAutoriza_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EmpleadoAutoriza_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NovedadNomiConstantesFunciones.LABEL_IDTIPONOVEDADNOMI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoNovedadNomi_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoNovedadNomi_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoNovedadNomi_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoNovedadNomi_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NovedadNomiConstantesFunciones.LABEL_IDESTADONOVEDADNOMI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EstadoNovedadNomi_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EstadoNovedadNomi_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EstadoNovedadNomi_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EstadoNovedadNomi_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NovedadNomiConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NovedadNomiConstantesFunciones.LABEL_NUMEROHORA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroHora_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroHora_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroHora_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroHora_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NovedadNomiConstantesFunciones.LABEL_NUMEROMINUTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroMinuto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroMinuto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroMinuto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroMinuto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NovedadNomiConstantesFunciones.LABEL_NUMEROJORNADATRABAJO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroJornadaTrabajo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroJornadaTrabajo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroJornadaTrabajo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroJornadaTrabajo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NovedadNomiConstantesFunciones.LABEL_ANIOVACACION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ioVacacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ioVacacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ioVacacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ioVacacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NovedadNomiConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoNovedadNomi.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoNovedadNomi.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoNovedadNomi.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case NovedadNomiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case NovedadNomiConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case NovedadNomiConstantesFunciones.LABEL_IDEMPLEADOAUTORIZA:
					sNombreCampoCategoria="id_empleado_autoriza";
					break;

				case NovedadNomiConstantesFunciones.LABEL_IDTIPONOVEDADNOMI:
					sNombreCampoCategoria="id_tipo_novedad_nomi";
					break;

				case NovedadNomiConstantesFunciones.LABEL_IDESTADONOVEDADNOMI:
					sNombreCampoCategoria="id_estado_novedad_nomi";
					break;

				case NovedadNomiConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case NovedadNomiConstantesFunciones.LABEL_NUMEROHORA:
					sNombreCampoCategoria="numero_hora";
					break;

				case NovedadNomiConstantesFunciones.LABEL_NUMEROMINUTO:
					sNombreCampoCategoria="numero_minuto";
					break;

				case NovedadNomiConstantesFunciones.LABEL_NUMEROJORNADATRABAJO:
					sNombreCampoCategoria="numero_jornada_trabajo";
					break;

				case NovedadNomiConstantesFunciones.LABEL_ANIOVACACION:
					sNombreCampoCategoria="anio_vacacion";
					break;

				case NovedadNomiConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoNovedadNomi.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case NovedadNomiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case NovedadNomiConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case NovedadNomiConstantesFunciones.LABEL_IDEMPLEADOAUTORIZA:
					sNombreCampoCategoriaValor="id_empleado_autoriza";
					break;

				case NovedadNomiConstantesFunciones.LABEL_IDTIPONOVEDADNOMI:
					sNombreCampoCategoriaValor="id_tipo_novedad_nomi";
					break;

				case NovedadNomiConstantesFunciones.LABEL_IDESTADONOVEDADNOMI:
					sNombreCampoCategoriaValor="id_estado_novedad_nomi";
					break;

				case NovedadNomiConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case NovedadNomiConstantesFunciones.LABEL_NUMEROHORA:
					sNombreCampoCategoriaValor="numero_hora";
					break;

				case NovedadNomiConstantesFunciones.LABEL_NUMEROMINUTO:
					sNombreCampoCategoriaValor="numero_minuto";
					break;

				case NovedadNomiConstantesFunciones.LABEL_NUMEROJORNADATRABAJO:
					sNombreCampoCategoriaValor="numero_jornada_trabajo";
					break;

				case NovedadNomiConstantesFunciones.LABEL_ANIOVACACION:
					sNombreCampoCategoriaValor="anio_vacacion";
					break;

				case NovedadNomiConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoNovedadNomi.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNovedadNomi.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case NovedadNomiConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case NovedadNomiConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case NovedadNomiConstantesFunciones.LABEL_IDEMPLEADOAUTORIZA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado Autoriza",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado_autoriza");
					break;

				case NovedadNomiConstantesFunciones.LABEL_IDTIPONOVEDADNOMI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Novedad Nomi",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_novedad_nomi");
					break;

				case NovedadNomiConstantesFunciones.LABEL_IDESTADONOVEDADNOMI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado Novedad Nomi",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estado_novedad_nomi");
					break;

				case NovedadNomiConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case NovedadNomiConstantesFunciones.LABEL_NUMEROHORA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Hora",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_hora");
					break;

				case NovedadNomiConstantesFunciones.LABEL_NUMEROMINUTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Minuto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_minuto");
					break;

				case NovedadNomiConstantesFunciones.LABEL_NUMEROJORNADATRABAJO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Jornada Trabajo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_jornada_trabajo");
					break;

				case NovedadNomiConstantesFunciones.LABEL_ANIOVACACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio Vacacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"anio_vacacion");
					break;

				case NovedadNomiConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<NovedadNomi> novedadnomisSeleccionados=new ArrayList<NovedadNomi>();		
		
		novedadnomisSeleccionados=this.getNovedadNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"novedadnomi";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("NovedadNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoNovedadNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoNovedadNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case NovedadNomiConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(NovedadNomi novedadnomi:novedadnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedadnomi.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NovedadNomiConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(NovedadNomi novedadnomi:novedadnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedadnomi.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NovedadNomiConstantesFunciones.LABEL_IDEMPLEADOAUTORIZA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_IDEMPLEADOAUTORIZA);
					iRow++;

					for(NovedadNomi novedadnomi:novedadnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedadnomi.getempleadoautoriza_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NovedadNomiConstantesFunciones.LABEL_IDTIPONOVEDADNOMI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_IDTIPONOVEDADNOMI);
					iRow++;

					for(NovedadNomi novedadnomi:novedadnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedadnomi.gettiponovedadnomi_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NovedadNomiConstantesFunciones.LABEL_IDESTADONOVEDADNOMI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_IDESTADONOVEDADNOMI);
					iRow++;

					for(NovedadNomi novedadnomi:novedadnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedadnomi.getestadonovedadnomi_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NovedadNomiConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(NovedadNomi novedadnomi:novedadnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedadnomi.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NovedadNomiConstantesFunciones.LABEL_NUMEROHORA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_NUMEROHORA);
					iRow++;

					for(NovedadNomi novedadnomi:novedadnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedadnomi.getnumero_hora());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NovedadNomiConstantesFunciones.LABEL_NUMEROMINUTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_NUMEROMINUTO);
					iRow++;

					for(NovedadNomi novedadnomi:novedadnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedadnomi.getnumero_minuto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NovedadNomiConstantesFunciones.LABEL_NUMEROJORNADATRABAJO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_NUMEROJORNADATRABAJO);
					iRow++;

					for(NovedadNomi novedadnomi:novedadnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedadnomi.getnumero_jornada_trabajo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NovedadNomiConstantesFunciones.LABEL_ANIOVACACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_ANIOVACACION);
					iRow++;

					for(NovedadNomi novedadnomi:novedadnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedadnomi.getanio_vacacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NovedadNomiConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(NovedadNomi novedadnomi:novedadnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedadnomi.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelNovedadNomi(row);				
			//	iRow++;
			//}				
			
			//for(NovedadNomi novedadnomiAux:novedadnomisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelNovedadNomi(novedadnomiAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad Nomi",JOptionPane.INFORMATION_MESSAGE);
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
				this.novedadnomiLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNovedadNomi(false);
			
			//SI ES MANUAL
			if(NovedadNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNovedadNomi();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresNovedadNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNovedadNomi(false);
			
			//SI ES MANUAL
			if(NovedadNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualNovedadNomi();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesNovedadNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNovedadNomi(false);
			
			//SI ES MANUAL
			if(NovedadNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualNovedadNomi();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaNovedadNomi() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosNovedadNomi.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosNovedadNomi.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosNovedadNomi.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosNovedadNomi.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosNovedadNomi.setMinimumSize(dimensionMinimum);
		this.jTableDatosNovedadNomi.setMaximumSize(dimensionMaximum);
		this.jTableDatosNovedadNomi.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingNovedadNomi(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingNovedadNomi(esInicializar,true);
	}
	
	public void inicializarActualizarBindingNovedadNomi(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaNovedadNomi(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesNovedadNomi(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.novedadnomiSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasNovedadNomi(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesNovedadNomi(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesNovedadNomi(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !NovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!NovedadNomiJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualNovedadNomi() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaNovedadNomi();
		
		this.inicializarActualizarBindingBotonesManualNovedadNomi(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.novedadnomiSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualNovedadNomi();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesNovedadNomi() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualNovedadNomi(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualNovedadNomi(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosNovedadNomi.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosNovedadNomi.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteNovedadNomi.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormNovedadNomi.jCheckBoxPostAccionNuevoNovedadNomi.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormNovedadNomi.jCheckBoxPostAccionSinCerrarNovedadNomi.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormNovedadNomi.jCheckBoxPostAccionSinMensajeNovedadNomi.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosNovedadNomi.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosNovedadNomi.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteNovedadNomi.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
				this.jInternalFrameDetalleFormNovedadNomi.jCheckBoxPostAccionNuevoNovedadNomi.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormNovedadNomi.jCheckBoxPostAccionSinCerrarNovedadNomi.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormNovedadNomi.jCheckBoxPostAccionSinMensajeNovedadNomi.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionNovedadNomi.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionNovedadNomi.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormNovedadNomi.jComboBoxTiposAccionesFormularioNovedadNomi.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesNovedadNomi.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoNovedadNomi!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNovedadNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesNovedadNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesNovedadNomi.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarNovedadNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesNovedadNomi.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoNovedadNomi!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNovedadNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesNovedadNomi.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralNovedadNomi.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesNovedadNomi(Boolean esInicializar) throws Exception {
		try	{	
			if(NovedadNomiJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualNovedadNomi(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesNovedadNomi() throws Exception {
		try	{
			if(NovedadNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualNovedadNomi();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleNovedadNomi() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormNovedadNomi.jComboBoxTiposAccionesFormularioNovedadNomi.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormNovedadNomi.jComboBoxTiposAccionesFormularioNovedadNomi.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualNovedadNomi() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesNovedadNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesNovedadNomi.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesNovedadNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesNovedadNomi.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesNovedadNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesNovedadNomi.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionNovedadNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionNovedadNomi.addItem(reporte);
			}
			
			
			if(!this.novedadnomiSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionNovedadNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionNovedadNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesNovedadNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesNovedadNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesNovedadNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesNovedadNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormNovedadNomi.jComboBoxTiposAccionesFormularioNovedadNomi.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormNovedadNomi.jComboBoxTiposAccionesFormularioNovedadNomi.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarNovedadNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarNovedadNomi.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarNovedadNomi.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNovedadNomi();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNovedadNomi() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoNovedadNomi!=null) {
				this.jInternalFrameReporteDinamicoNovedadNomi.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoNovedadNomi.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoNovedadNomi!=null) {
				this.jInternalFrameReporteDinamicoNovedadNomi.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoNovedadNomi.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoNovedadNomi!=null) {
				
				if(this.jInternalFrameReporteDinamicoNovedadNomi.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoNovedadNomi.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoNovedadNomi.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoNovedadNomi.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoNovedadNomi.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoNovedadNomi.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualNovedadNomi()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoNovedadNomi.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoNovedadNomi.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomi.getSelectedItem()!=null){this.id_empleado_autorizaFK_IdEmpleadoAutoriza=((Empleado)this.jComboBoxid_empleado_autorizaFK_IdEmpleadoAutorizaNovedadNomi.getSelectedItem()).getId();}
		if(this.jComboBoxid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomi.getSelectedItem()!=null){this.id_estado_novedad_nomiFK_IdEstadoNovedadNomi=((EstadoNovedadNomi)this.jComboBoxid_estado_novedad_nomiFK_IdEstadoNovedadNomiNovedadNomi.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomi.getSelectedItem()!=null){this.id_tipo_novedad_nomiFK_IdTipoNovedadNomi=((TipoNovedadNomi)this.jComboBoxid_tipo_novedad_nomiFK_IdTipoNovedadNomiNovedadNomi.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasNovedadNomi(Boolean esInicializar) throws Exception {				
		if(NovedadNomiJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualNovedadNomi();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaNovedadNomi() throws Exception {
		this.inicializarActualizarBindingTablaNovedadNomi(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByNovedadNomi() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByNovedadNomi.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByNovedadNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNovedadNomi.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new NovedadNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByNovedadNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNovedadNomi.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new NovedadNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosNovedadNomiOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadNomiOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new NovedadNomiPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByNovedadNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNovedadNomi.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new NovedadNomiPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByNovedadNomi.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaNovedadNomi(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=novedadnomiLogic.getNovedadNomis().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=novedadnomis.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(NovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosNovedadNomi.setModel(new NovedadNomiModel(this.novedadnomiLogic.getNovedadNomis(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosNovedadNomi.setModel(new NovedadNomiModel(this.novedadnomis,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByNovedadNomi!=null && this.jInternalFrameOrderByNovedadNomi.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByNovedadNomi();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosNovedadNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadNomi,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new NovedadNomiPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO,novedadnomiConstantesFunciones.resaltarSeleccionarNovedadNomi,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+NovedadNomiConstantesFunciones.SCLASSWEBTITULO,novedadnomiConstantesFunciones.resaltarSeleccionarNovedadNomi,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosNovedadNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadNomi,NovedadNomiConstantesFunciones.LABEL_ID));

		if(this.novedadnomiConstantesFunciones.mostraridNovedadNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadNomiConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.novedadnomiConstantesFunciones.resaltaridNovedadNomi,this.novedadnomiConstantesFunciones.activaridNovedadNomi,this,true,"idNovedadNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.novedadnomiConstantesFunciones.resaltaridNovedadNomi,this.novedadnomiConstantesFunciones.activaridNovedadNomi,this,true,"idNovedadNomi","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedadNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadNomi,NovedadNomiConstantesFunciones.LABEL_IDEMPRESA));

		if(this.novedadnomiConstantesFunciones.mostrarid_empresaNovedadNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadNomiConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.novedadnomiConstantesFunciones.resaltarid_empresaNovedadNomi,this,this.novedadnomiConstantesFunciones.activarid_empresaNovedadNomi));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.novedadnomiConstantesFunciones.resaltarid_empresaNovedadNomi,this,this.novedadnomiConstantesFunciones.activarid_empresaNovedadNomi,false,"id_empresaNovedadNomi","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NovedadNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedadNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadNomi,NovedadNomiConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.novedadnomiConstantesFunciones.mostrarid_empleadoNovedadNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadNomiConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.novedadnomiConstantesFunciones.resaltarid_empleadoNovedadNomi,this,this.novedadnomiConstantesFunciones.activarid_empleadoNovedadNomi));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.novedadnomiConstantesFunciones.resaltarid_empleadoNovedadNomi,this,this.novedadnomiConstantesFunciones.activarid_empleadoNovedadNomi,true,"id_empleadoNovedadNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new NovedadNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedadNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadNomi,NovedadNomiConstantesFunciones.LABEL_IDEMPLEADOAUTORIZA));

		if(this.novedadnomiConstantesFunciones.mostrarid_empleado_autorizaNovedadNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadNomiConstantesFunciones.LABEL_IDEMPLEADOAUTORIZA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadoautorizasForeignKey,this.novedadnomiConstantesFunciones.resaltarid_empleado_autorizaNovedadNomi,this,this.novedadnomiConstantesFunciones.activarid_empleado_autorizaNovedadNomi));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadoautorizasForeignKey,this.novedadnomiConstantesFunciones.resaltarid_empleado_autorizaNovedadNomi,this,this.novedadnomiConstantesFunciones.activarid_empleado_autorizaNovedadNomi,true,"id_empleado_autorizaNovedadNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new NovedadNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedadNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadNomi,NovedadNomiConstantesFunciones.LABEL_IDTIPONOVEDADNOMI));

		if(this.novedadnomiConstantesFunciones.mostrarid_tipo_novedad_nomiNovedadNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadNomiConstantesFunciones.LABEL_IDTIPONOVEDADNOMI,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoNovedadNomiTableCell(this.tiponovedadnomisForeignKey,this.novedadnomiConstantesFunciones.resaltarid_tipo_novedad_nomiNovedadNomi,this,this.novedadnomiConstantesFunciones.activarid_tipo_novedad_nomiNovedadNomi));
			tableColumn.setCellEditor(new TipoNovedadNomiTableCell(this.tiponovedadnomisForeignKey,this.novedadnomiConstantesFunciones.resaltarid_tipo_novedad_nomiNovedadNomi,this,this.novedadnomiConstantesFunciones.activarid_tipo_novedad_nomiNovedadNomi,true,"id_tipo_novedad_nomiNovedadNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NovedadNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedadNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadNomi,NovedadNomiConstantesFunciones.LABEL_IDESTADONOVEDADNOMI));

		if(this.novedadnomiConstantesFunciones.mostrarid_estado_novedad_nomiNovedadNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadNomiConstantesFunciones.LABEL_IDESTADONOVEDADNOMI,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstadoNovedadNomiTableCell(this.estadonovedadnomisForeignKey,this.novedadnomiConstantesFunciones.resaltarid_estado_novedad_nomiNovedadNomi,this,this.novedadnomiConstantesFunciones.activarid_estado_novedad_nomiNovedadNomi));
			tableColumn.setCellEditor(new EstadoNovedadNomiTableCell(this.estadonovedadnomisForeignKey,this.novedadnomiConstantesFunciones.resaltarid_estado_novedad_nomiNovedadNomi,this,this.novedadnomiConstantesFunciones.activarid_estado_novedad_nomiNovedadNomi,true,"id_estado_novedad_nomiNovedadNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NovedadNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedadNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadNomi,NovedadNomiConstantesFunciones.LABEL_FECHA));

		if(this.novedadnomiConstantesFunciones.mostrarfechaNovedadNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadNomiConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.novedadnomiConstantesFunciones.resaltarfechaNovedadNomi,this.novedadnomiConstantesFunciones.activarfechaNovedadNomi,this,true,"fechaNovedadNomi","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.novedadnomiConstantesFunciones.resaltarfechaNovedadNomi,this.novedadnomiConstantesFunciones.activarfechaNovedadNomi,this,true,"fechaNovedadNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new NovedadNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedadNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadNomi,NovedadNomiConstantesFunciones.LABEL_NUMEROHORA));

		if(this.novedadnomiConstantesFunciones.mostrarnumero_horaNovedadNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadNomiConstantesFunciones.LABEL_NUMEROHORA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.novedadnomiConstantesFunciones.resaltarnumero_horaNovedadNomi,this.novedadnomiConstantesFunciones.activarnumero_horaNovedadNomi,this,true,"numero_horaNovedadNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.novedadnomiConstantesFunciones.resaltarnumero_horaNovedadNomi,this.novedadnomiConstantesFunciones.activarnumero_horaNovedadNomi,this,true,"numero_horaNovedadNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new NovedadNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedadNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadNomi,NovedadNomiConstantesFunciones.LABEL_NUMEROMINUTO));

		if(this.novedadnomiConstantesFunciones.mostrarnumero_minutoNovedadNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadNomiConstantesFunciones.LABEL_NUMEROMINUTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.novedadnomiConstantesFunciones.resaltarnumero_minutoNovedadNomi,this.novedadnomiConstantesFunciones.activarnumero_minutoNovedadNomi,this,true,"numero_minutoNovedadNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.novedadnomiConstantesFunciones.resaltarnumero_minutoNovedadNomi,this.novedadnomiConstantesFunciones.activarnumero_minutoNovedadNomi,this,true,"numero_minutoNovedadNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new NovedadNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedadNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadNomi,NovedadNomiConstantesFunciones.LABEL_NUMEROJORNADATRABAJO));

		if(this.novedadnomiConstantesFunciones.mostrarnumero_jornada_trabajoNovedadNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadNomiConstantesFunciones.LABEL_NUMEROJORNADATRABAJO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.novedadnomiConstantesFunciones.resaltarnumero_jornada_trabajoNovedadNomi,this.novedadnomiConstantesFunciones.activarnumero_jornada_trabajoNovedadNomi,this,true,"numero_jornada_trabajoNovedadNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.novedadnomiConstantesFunciones.resaltarnumero_jornada_trabajoNovedadNomi,this.novedadnomiConstantesFunciones.activarnumero_jornada_trabajoNovedadNomi,this,true,"numero_jornada_trabajoNovedadNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new NovedadNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedadNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadNomi,NovedadNomiConstantesFunciones.LABEL_ANIOVACACION));

		if(this.novedadnomiConstantesFunciones.mostraranio_vacacionNovedadNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadNomiConstantesFunciones.LABEL_ANIOVACACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.novedadnomiConstantesFunciones.resaltaranio_vacacionNovedadNomi,this.novedadnomiConstantesFunciones.activaranio_vacacionNovedadNomi,this,true,"anio_vacacionNovedadNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.novedadnomiConstantesFunciones.resaltaranio_vacacionNovedadNomi,this.novedadnomiConstantesFunciones.activaranio_vacacionNovedadNomi,this,true,"anio_vacacionNovedadNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new NovedadNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedadNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadNomi,NovedadNomiConstantesFunciones.LABEL_DESCRIPCION));

		if(this.novedadnomiConstantesFunciones.mostrardescripcionNovedadNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadNomiConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.novedadnomiConstantesFunciones.resaltardescripcionNovedadNomi,this.novedadnomiConstantesFunciones.activardescripcionNovedadNomi,this,true,"descripcionNovedadNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.novedadnomiConstantesFunciones.resaltardescripcionNovedadNomi,this.novedadnomiConstantesFunciones.activardescripcionNovedadNomi,this,true,"descripcionNovedadNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NovedadNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.novedadnomiSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.novedadnomiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.novedadnomiSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosNovedadNomi.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.novedadnomiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.novedadnomiSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosNovedadNomi.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarNovedadNomi && this.isPermisoGuardarCambiosNovedadNomi) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.novedadnomiSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.novedadnomiSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosNovedadNomi.addColumn(tableColumn);
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
			
			this.jTableDatosNovedadNomi.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarNovedadNomi && this.isPermisoGuardarCambiosNovedadNomi) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarNovedadNomi && this.isPermisoGuardarCambiosNovedadNomi) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosNovedadNomi.moveColumn(this.jTableDatosNovedadNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosNovedadNomi.moveColumn(this.jTableDatosNovedadNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosNovedadNomi.moveColumn(this.jTableDatosNovedadNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosNovedadNomi.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosNovedadNomi.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosNovedadNomi,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!NovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosNovedadNomi.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosNovedadNomi.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!NovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!NovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosNovedadNomi.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosNovedadNomi.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosNovedadNomi.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=novedadnomiLogic.getNovedadNomis().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=novedadnomis.size()-1;
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
		//this.jTableDatosNovedadNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosNovedadNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosNovedadNomi();
			
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
				
				//this.isEsNuevoNovedadNomi=false;
					
				NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
			
				if(this.novedadnomiSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormNovedadNomi==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosNovedadNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosNovedadNomi.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomi =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedadnomi =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.novedadnomi.getsType().equals("DUPLICADO")
				   || this.novedadnomi.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoNovedadNomi=true;
				
				} else {
					this.isEsNuevoNovedadNomi=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.novedadnomiSessionBean.getEsGuardarRelacionado()) {
					if(this.novedadnomi.getId()>=0 && !this.novedadnomi.getIsNew()) {						
						this.isEsNuevoNovedadNomi=false;
						
					} else {
						this.isEsNuevoNovedadNomi=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoNovedadNomi(esRelaciones);						
				
				this.seleccionarNovedadNomi(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.novedadnomi.getId()<0) {
					this.isEsNuevoNovedadNomi=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarNovedadNomi(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarNovedadNomi(evt,rowIndex);
				}	
				
				if(this.novedadnomiSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion NovedadNomi: " + this.dDif); 
					}
				}								
				
				NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarNovedadNomi(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.novedadnomi)) {
					if(this.novedadnomi.getId()>0) {
						this.novedadnomi.setIsDeleted(true);
						
						this.novedadnomisEliminados.add(this.novedadnomi);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.novedadnomiLogic.getNovedadNomis().remove(this.novedadnomi);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.novedadnomis.remove(this.novedadnomi);				
					}
					
					
					((NovedadNomiModel) this.jTableDatosNovedadNomi.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaNovedadNomi(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarNovedadNomi(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoNovedadNomi) {
			
			if(this.jInternalFrameDetalleFormNovedadNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosNovedadNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosNovedadNomi.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomi =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedadnomi =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(NovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioNovedadNomi(this.novedadnomi);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.novedadnomiConstantesFunciones.cargarid_empresaNovedadNomi || this.novedadnomiConstantesFunciones.event_dependid_empresaNovedadNomi) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.novedadnomi.getid_empresa());
									//this.inicializarActualizarBindingNovedadNomi(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(novedadnomi.getEmpresa()!=null) {
							this.empresasForeignKey.add(novedadnomi.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.novedadnomi.getid_empresa(),false,"Formulario");

					//Empleado
					if(!this.novedadnomiConstantesFunciones.cargarid_empleadoNovedadNomi || this.novedadnomiConstantesFunciones.event_dependid_empleadoNovedadNomi) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.novedadnomi.getid_empleado());
									//this.inicializarActualizarBindingNovedadNomi(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(novedadnomi.getEmpleado()!=null) {
							this.empleadosForeignKey.add(novedadnomi.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.novedadnomi.getid_empleado(),false,"Formulario");

					//EmpleadoAutoriza
					if(!this.novedadnomiConstantesFunciones.cargarid_empleado_autorizaNovedadNomi || this.novedadnomiConstantesFunciones.event_dependid_empleado_autorizaNovedadNomi) {
						//this.cargarCombosEmpleadoAutorizasForeignKeyLista(" where id="+this.novedadnomi.getid_empleado_autoriza());
									//this.inicializarActualizarBindingNovedadNomi(false,false);
						this.empleadoautorizasForeignKey=new ArrayList<Empleado>();

						if(novedadnomi.getEmpleadoAutoriza()!=null) {
							this.empleadoautorizasForeignKey.add(novedadnomi.getEmpleadoAutoriza());
						}

						this.addItemDefectoCombosForeignKeyEmpleadoAutoriza();
						this.cargarCombosFrameEmpleadoAutorizasForeignKey("Todos");
					}
					this.setActualEmpleadoAutorizaForeignKey(this.novedadnomi.getid_empleado_autoriza(),false,"Formulario");

					//TipoNovedadNomi
					if(!this.novedadnomiConstantesFunciones.cargarid_tipo_novedad_nomiNovedadNomi || this.novedadnomiConstantesFunciones.event_dependid_tipo_novedad_nomiNovedadNomi) {
						//this.cargarCombosTipoNovedadNomisForeignKeyLista(" where id="+this.novedadnomi.getid_tipo_novedad_nomi());
									//this.inicializarActualizarBindingNovedadNomi(false,false);
						this.tiponovedadnomisForeignKey=new ArrayList<TipoNovedadNomi>();

						if(novedadnomi.getTipoNovedadNomi()!=null) {
							this.tiponovedadnomisForeignKey.add(novedadnomi.getTipoNovedadNomi());
						}

						this.addItemDefectoCombosForeignKeyTipoNovedadNomi();
						this.cargarCombosFrameTipoNovedadNomisForeignKey("Todos");
					}
					this.setActualTipoNovedadNomiForeignKey(this.novedadnomi.getid_tipo_novedad_nomi(),false,"Formulario");

					//EstadoNovedadNomi
					if(!this.novedadnomiConstantesFunciones.cargarid_estado_novedad_nomiNovedadNomi || this.novedadnomiConstantesFunciones.event_dependid_estado_novedad_nomiNovedadNomi) {
						//this.cargarCombosEstadoNovedadNomisForeignKeyLista(" where id="+this.novedadnomi.getid_estado_novedad_nomi());
									//this.inicializarActualizarBindingNovedadNomi(false,false);
						this.estadonovedadnomisForeignKey=new ArrayList<EstadoNovedadNomi>();

						if(novedadnomi.getEstadoNovedadNomi()!=null) {
							this.estadonovedadnomisForeignKey.add(novedadnomi.getEstadoNovedadNomi());
						}

						this.addItemDefectoCombosForeignKeyEstadoNovedadNomi();
						this.cargarCombosFrameEstadoNovedadNomisForeignKey("Todos");
					}
					this.setActualEstadoNovedadNomiForeignKey(this.novedadnomi.getid_estado_novedad_nomi(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesNovedadNomi("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesNovedadNomi(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNovedadNomi() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoNovedadNomi(NovedadNomi novedadnomi) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoNovedadNomi(novedadnomi,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoNovedadNomi(NovedadNomi novedadnomi,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioNovedadNomi(novedadnomi);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyNovedadNomi(novedadnomi,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyNovedadNomi(novedadnomi);
	}
	
	public void setVariablesObjetoActualToFormularioNovedadNomi(NovedadNomi novedadnomi) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormNovedadNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormNovedadNomi.jLabelidNovedadNomi.setText(novedadnomi.getId().toString());
			this.jInternalFrameDetalleFormNovedadNomi.jDateChooserfechaNovedadNomi.setDate(novedadnomi.getfecha());
			this.jInternalFrameDetalleFormNovedadNomi.jTextFieldnumero_horaNovedadNomi.setText(novedadnomi.getnumero_hora().toString());
			this.jInternalFrameDetalleFormNovedadNomi.jTextFieldnumero_minutoNovedadNomi.setText(novedadnomi.getnumero_minuto().toString());
			this.jInternalFrameDetalleFormNovedadNomi.jTextFieldnumero_jornada_trabajoNovedadNomi.setText(novedadnomi.getnumero_jornada_trabajo().toString());
			this.jInternalFrameDetalleFormNovedadNomi.jTextFieldanio_vacacionNovedadNomi.setText(novedadnomi.getanio_vacacion().toString());
			this.jInternalFrameDetalleFormNovedadNomi.jTextAreadescripcionNovedadNomi.setText(novedadnomi.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,NovedadNomi novedadnomiLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,novedadnomiLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,NovedadNomi novedadnomiLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				novedadnomiLocal=this.novedadnomi;
			} else {
				novedadnomiLocal=this.novedadnomiAnterior;
			}
		}
		
		if(this.permiteMantenimiento(novedadnomiLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoNovedadNomi(novedadnomiLocal,true);
					
					if(novedadnomiSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(novedadnomiLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.novedadnomiSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(novedadnomiLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoNovedadNomi(NovedadNomi novedadnomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualNovedadNomi(novedadnomi,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(novedadnomi);
	}
	
	public void setVariablesFormularioToObjetoActualNovedadNomi(NovedadNomi novedadnomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualNovedadNomi(novedadnomi,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualNovedadNomi(NovedadNomi novedadnomi,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormNovedadNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormNovedadNomi.jLabelidNovedadNomi.getText()==null || this.jInternalFrameDetalleFormNovedadNomi.jLabelidNovedadNomi.getText()=="" || this.jInternalFrameDetalleFormNovedadNomi.jLabelidNovedadNomi.getText()=="Id") {
				this.jInternalFrameDetalleFormNovedadNomi.jLabelidNovedadNomi.setText("0");
			}

			if(conColumnasBase) {novedadnomi.setId(Long.parseLong(this.jInternalFrameDetalleFormNovedadNomi.jLabelidNovedadNomi.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NovedadNomiConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadNomi.jLabelIdNovedadNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			novedadnomi.setfecha(this.jInternalFrameDetalleFormNovedadNomi.jDateChooserfechaNovedadNomi.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NovedadNomiConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadNomi.jLabelfechaNovedadNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			novedadnomi.setnumero_hora(Integer.parseInt(this.jInternalFrameDetalleFormNovedadNomi.jTextFieldnumero_horaNovedadNomi.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NovedadNomiConstantesFunciones.LABEL_NUMEROHORA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadNomi.jLabelnumero_horaNovedadNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			novedadnomi.setnumero_minuto(Integer.parseInt(this.jInternalFrameDetalleFormNovedadNomi.jTextFieldnumero_minutoNovedadNomi.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NovedadNomiConstantesFunciones.LABEL_NUMEROMINUTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadNomi.jLabelnumero_minutoNovedadNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			novedadnomi.setnumero_jornada_trabajo(Integer.parseInt(this.jInternalFrameDetalleFormNovedadNomi.jTextFieldnumero_jornada_trabajoNovedadNomi.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NovedadNomiConstantesFunciones.LABEL_NUMEROJORNADATRABAJO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadNomi.jLabelnumero_jornada_trabajoNovedadNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			novedadnomi.setanio_vacacion(Integer.parseInt(this.jInternalFrameDetalleFormNovedadNomi.jTextFieldanio_vacacionNovedadNomi.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NovedadNomiConstantesFunciones.LABEL_ANIOVACACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadNomi.jLabelanio_vacacionNovedadNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			novedadnomi.setdescripcion(this.jInternalFrameDetalleFormNovedadNomi.jTextAreadescripcionNovedadNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NovedadNomiConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedadNomi.jLabeldescripcionNovedadNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualNovedadNomi(NovedadNomi novedadnomiBean,NovedadNomi novedadnomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && novedadnomiBean.getid_empleado()!=null && !novedadnomiBean.getid_empleado().equals(-1L))) {novedadnomi.setid_empleado(novedadnomiBean.getid_empleado());}
			if(conDefault || (!conDefault && novedadnomiBean.getid_empleado_autoriza()!=null && !novedadnomiBean.getid_empleado_autoriza().equals(-1L))) {novedadnomi.setid_empleado_autoriza(novedadnomiBean.getid_empleado_autoriza());}
			if(conDefault || (!conDefault && novedadnomiBean.getid_tipo_novedad_nomi()!=null && !novedadnomiBean.getid_tipo_novedad_nomi().equals(-1L))) {novedadnomi.setid_tipo_novedad_nomi(novedadnomiBean.getid_tipo_novedad_nomi());}
			if(conDefault || (!conDefault && novedadnomiBean.getid_estado_novedad_nomi()!=null && !novedadnomiBean.getid_estado_novedad_nomi().equals(-1L))) {novedadnomi.setid_estado_novedad_nomi(novedadnomiBean.getid_estado_novedad_nomi());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosNovedadNomi(NovedadNomi novedadnomiOrigen,NovedadNomi novedadnomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && novedadnomiOrigen.getId()!=null && !novedadnomiOrigen.getId().equals(0L))) {novedadnomi.setId(novedadnomiOrigen.getId());}}
			if(conDefault || (!conDefault && novedadnomiOrigen.getid_empleado()!=null && !novedadnomiOrigen.getid_empleado().equals(-1L))) {novedadnomi.setid_empleado(novedadnomiOrigen.getid_empleado());}
			if(conDefault || (!conDefault && novedadnomiOrigen.getid_empleado_autoriza()!=null && !novedadnomiOrigen.getid_empleado_autoriza().equals(-1L))) {novedadnomi.setid_empleado_autoriza(novedadnomiOrigen.getid_empleado_autoriza());}
			if(conDefault || (!conDefault && novedadnomiOrigen.getid_tipo_novedad_nomi()!=null && !novedadnomiOrigen.getid_tipo_novedad_nomi().equals(-1L))) {novedadnomi.setid_tipo_novedad_nomi(novedadnomiOrigen.getid_tipo_novedad_nomi());}
			if(conDefault || (!conDefault && novedadnomiOrigen.getid_estado_novedad_nomi()!=null && !novedadnomiOrigen.getid_estado_novedad_nomi().equals(-1L))) {novedadnomi.setid_estado_novedad_nomi(novedadnomiOrigen.getid_estado_novedad_nomi());}
			if(conDefault || (!conDefault && novedadnomiOrigen.getfecha()!=null && !novedadnomiOrigen.getfecha().equals(new Date()))) {novedadnomi.setfecha(novedadnomiOrigen.getfecha());}
			if(conDefault || (!conDefault && novedadnomiOrigen.getnumero_hora()!=null && !novedadnomiOrigen.getnumero_hora().equals(0))) {novedadnomi.setnumero_hora(novedadnomiOrigen.getnumero_hora());}
			if(conDefault || (!conDefault && novedadnomiOrigen.getnumero_minuto()!=null && !novedadnomiOrigen.getnumero_minuto().equals(0))) {novedadnomi.setnumero_minuto(novedadnomiOrigen.getnumero_minuto());}
			if(conDefault || (!conDefault && novedadnomiOrigen.getnumero_jornada_trabajo()!=null && !novedadnomiOrigen.getnumero_jornada_trabajo().equals(0))) {novedadnomi.setnumero_jornada_trabajo(novedadnomiOrigen.getnumero_jornada_trabajo());}
			if(conDefault || (!conDefault && novedadnomiOrigen.getanio_vacacion()!=null && !novedadnomiOrigen.getanio_vacacion().equals(0))) {novedadnomi.setanio_vacacion(novedadnomiOrigen.getanio_vacacion());}
			if(conDefault || (!conDefault && novedadnomiOrigen.getdescripcion()!=null && !novedadnomiOrigen.getdescripcion().equals(""))) {novedadnomi.setdescripcion(novedadnomiOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioNovedadNomi(NovedadNomi novedadnomi) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormNovedadNomi.jLabelidNovedadNomi.setText(novedadnomi.getId().toString());
			this.jInternalFrameDetalleFormNovedadNomi.jDateChooserfechaNovedadNomi.setDate(novedadnomi.getfecha());
			this.jInternalFrameDetalleFormNovedadNomi.jTextFieldnumero_horaNovedadNomi.setText(novedadnomi.getnumero_hora().toString());
			this.jInternalFrameDetalleFormNovedadNomi.jTextFieldnumero_minutoNovedadNomi.setText(novedadnomi.getnumero_minuto().toString());
			this.jInternalFrameDetalleFormNovedadNomi.jTextFieldnumero_jornada_trabajoNovedadNomi.setText(novedadnomi.getnumero_jornada_trabajo().toString());
			this.jInternalFrameDetalleFormNovedadNomi.jTextFieldanio_vacacionNovedadNomi.setText(novedadnomi.getanio_vacacion().toString());
			this.jInternalFrameDetalleFormNovedadNomi.jTextAreadescripcionNovedadNomi.setText(novedadnomi.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioNovedadNomi(NovedadNomiBean novedadnomiBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormNovedadNomi.jLabelidNovedadNomi.setText(novedadnomiBean.getId().toString());
			this.jInternalFrameDetalleFormNovedadNomi.jDateChooserfechaNovedadNomi.setDate(novedadnomiBean.getfecha());
			this.jInternalFrameDetalleFormNovedadNomi.jTextFieldnumero_horaNovedadNomi.setText(novedadnomiBean.getnumero_hora().toString());
			this.jInternalFrameDetalleFormNovedadNomi.jTextFieldnumero_minutoNovedadNomi.setText(novedadnomiBean.getnumero_minuto().toString());
			this.jInternalFrameDetalleFormNovedadNomi.jTextFieldnumero_jornada_trabajoNovedadNomi.setText(novedadnomiBean.getnumero_jornada_trabajo().toString());
			this.jInternalFrameDetalleFormNovedadNomi.jTextFieldanio_vacacionNovedadNomi.setText(novedadnomiBean.getanio_vacacion().toString());
			this.jInternalFrameDetalleFormNovedadNomi.jTextAreadescripcionNovedadNomi.setText(novedadnomiBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanNovedadNomi(NovedadNomiParameterReturnGeneral novedadnomiReturnGeneral,NovedadNomiBean novedadnomiBean,Boolean conDefault) throws Exception { 
		try {
			NovedadNomi novedadnomiLocal=new NovedadNomi();
			
			novedadnomiLocal=novedadnomiReturnGeneral.getNovedadNomi();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && novedadnomiLocal.getId()!=null && !novedadnomiLocal.getId().equals(0L))) {novedadnomiBean.setId(novedadnomiLocal.getId());}}
			if(conDefault || (!conDefault && novedadnomiLocal.getid_empleado()!=null && !novedadnomiLocal.getid_empleado().equals(-1L))) {novedadnomiBean.setid_empleado(novedadnomiLocal.getid_empleado());}
			if(conDefault || (!conDefault && novedadnomiLocal.getid_empleado_autoriza()!=null && !novedadnomiLocal.getid_empleado_autoriza().equals(-1L))) {novedadnomiBean.setid_empleado_autoriza(novedadnomiLocal.getid_empleado_autoriza());}
			if(conDefault || (!conDefault && novedadnomiLocal.getid_tipo_novedad_nomi()!=null && !novedadnomiLocal.getid_tipo_novedad_nomi().equals(-1L))) {novedadnomiBean.setid_tipo_novedad_nomi(novedadnomiLocal.getid_tipo_novedad_nomi());}
			if(conDefault || (!conDefault && novedadnomiLocal.getid_estado_novedad_nomi()!=null && !novedadnomiLocal.getid_estado_novedad_nomi().equals(-1L))) {novedadnomiBean.setid_estado_novedad_nomi(novedadnomiLocal.getid_estado_novedad_nomi());}
			if(conDefault || (!conDefault && novedadnomiLocal.getfecha()!=null && !novedadnomiLocal.getfecha().equals(new Date()))) {novedadnomiBean.setfecha(novedadnomiLocal.getfecha());}
			if(conDefault || (!conDefault && novedadnomiLocal.getnumero_hora()!=null && !novedadnomiLocal.getnumero_hora().equals(0))) {novedadnomiBean.setnumero_hora(novedadnomiLocal.getnumero_hora());}
			if(conDefault || (!conDefault && novedadnomiLocal.getnumero_minuto()!=null && !novedadnomiLocal.getnumero_minuto().equals(0))) {novedadnomiBean.setnumero_minuto(novedadnomiLocal.getnumero_minuto());}
			if(conDefault || (!conDefault && novedadnomiLocal.getnumero_jornada_trabajo()!=null && !novedadnomiLocal.getnumero_jornada_trabajo().equals(0))) {novedadnomiBean.setnumero_jornada_trabajo(novedadnomiLocal.getnumero_jornada_trabajo());}
			if(conDefault || (!conDefault && novedadnomiLocal.getanio_vacacion()!=null && !novedadnomiLocal.getanio_vacacion().equals(0))) {novedadnomiBean.setanio_vacacion(novedadnomiLocal.getanio_vacacion());}
			if(conDefault || (!conDefault && novedadnomiLocal.getdescripcion()!=null && !novedadnomiLocal.getdescripcion().equals(""))) {novedadnomiBean.setdescripcion(novedadnomiLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxNovedadNomiGenerico(Long idNovedadNomiSeleccionado,JComboBox jComboBoxNovedadNomi,List<NovedadNomi> novedadnomisLocal)throws Exception {
		try {
			NovedadNomi  novedadnomiTemp=null;

			for(NovedadNomi novedadnomiAux:novedadnomisLocal) {
				if(novedadnomiAux.getId()!=null && novedadnomiAux.getId().equals(idNovedadNomiSeleccionado)) {
					novedadnomiTemp=novedadnomiAux;
					break;
				}
			}

			jComboBoxNovedadNomi.setSelectedItem(novedadnomiTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxNovedadNomiGenerico(JComboBox jComboBoxNovedadNomi,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxNovedadNomi.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxNovedadNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxNovedadNomi.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxNovedadNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			novedadnomi=(NovedadNomi) novedadnomiLogic.getNovedadNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			novedadnomi =(NovedadNomi) novedadnomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!novedadnomi.getIsNew() && !novedadnomi.getIsChanged() && !novedadnomi.getIsDeleted()) {
				sDescripcion=novedadnomi.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=novedadnomi.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!novedadnomi.getIsNew() && !novedadnomi.getIsChanged() && !novedadnomi.getIsDeleted()) {
				sDescripcion=novedadnomi.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=novedadnomi.getempleado_descripcion();
			}
		}

		if(sTipo.equals("EmpleadoAutoriza")) {
			//sDescripcion=this.getActualEmpleadoAutorizaForeignKeyDescripcion((Long)value);
			if(!novedadnomi.getIsNew() && !novedadnomi.getIsChanged() && !novedadnomi.getIsDeleted()) {
				sDescripcion=novedadnomi.getempleadoautoriza_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoAutorizaForeignKeyDescripcion((Long)value);
				sDescripcion=novedadnomi.getempleadoautoriza_descripcion();
			}
		}

		if(sTipo.equals("TipoNovedadNomi")) {
			//sDescripcion=this.getActualTipoNovedadNomiForeignKeyDescripcion((Long)value);
			if(!novedadnomi.getIsNew() && !novedadnomi.getIsChanged() && !novedadnomi.getIsDeleted()) {
				sDescripcion=novedadnomi.gettiponovedadnomi_descripcion();
			} else {
				//sDescripcion=this.getActualTipoNovedadNomiForeignKeyDescripcion((Long)value);
				sDescripcion=novedadnomi.gettiponovedadnomi_descripcion();
			}
		}

		if(sTipo.equals("EstadoNovedadNomi")) {
			//sDescripcion=this.getActualEstadoNovedadNomiForeignKeyDescripcion((Long)value);
			if(!novedadnomi.getIsNew() && !novedadnomi.getIsChanged() && !novedadnomi.getIsDeleted()) {
				sDescripcion=novedadnomi.getestadonovedadnomi_descripcion();
			} else {
				//sDescripcion=this.getActualEstadoNovedadNomiForeignKeyDescripcion((Long)value);
				sDescripcion=novedadnomi.getestadonovedadnomi_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		NovedadNomi novedadnomiRow=new NovedadNomi();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			novedadnomiRow=(NovedadNomi) novedadnomiLogic.getNovedadNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			novedadnomiRow=(NovedadNomi) novedadnomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualNovedadNomi(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoNovedadNomi.setVisible((this.isVisibilidadCeldaNuevoNovedadNomi && this.isPermisoNuevoNovedadNomi));			
			this.jButtonDuplicarNovedadNomi.setVisible((this.isVisibilidadCeldaDuplicarNovedadNomi && this.isPermisoDuplicarNovedadNomi));			
			this.jButtonCopiarNovedadNomi.setVisible((this.isVisibilidadCeldaCopiarNovedadNomi && this.isPermisoCopiarNovedadNomi));
			this.jButtonVerFormNovedadNomi.setVisible((this.isVisibilidadCeldaVerFormNovedadNomi && this.isPermisoVerFormNovedadNomi));
			
			this.jButtonAbrirOrderByNovedadNomi.setVisible((this.isVisibilidadCeldaOrdenNovedadNomi && this.isPermisoOrdenNovedadNomi));			
			
			this.jButtonNuevoRelacionesNovedadNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesNovedadNomi && this.isPermisoNuevoNovedadNomi));			
			this.jButtonNuevoGuardarCambiosNovedadNomi.setVisible((this.isVisibilidadCeldaNuevoNovedadNomi && this.isPermisoNuevoNovedadNomi && this.isPermisoGuardarCambiosNovedadNomi));
			
			if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
			this.jInternalFrameDetalleFormNovedadNomi.jButtonModificarNovedadNomi.setVisible((this.isVisibilidadCeldaModificarNovedadNomi && this.isPermisoActualizarNovedadNomi));	
			this.jInternalFrameDetalleFormNovedadNomi.jButtonActualizarNovedadNomi.setVisible((this.isVisibilidadCeldaActualizarNovedadNomi && this.isPermisoActualizarNovedadNomi));	
			this.jInternalFrameDetalleFormNovedadNomi.jButtonEliminarNovedadNomi.setVisible((this.isVisibilidadCeldaEliminarNovedadNomi && this.isPermisoEliminarNovedadNomi));
			this.jInternalFrameDetalleFormNovedadNomi.jButtonCancelarNovedadNomi.setVisible(this.isVisibilidadCeldaCancelarNovedadNomi);							
			this.jInternalFrameDetalleFormNovedadNomi.jButtonGuardarCambiosNovedadNomi.setVisible((this.isVisibilidadCeldaGuardarNovedadNomi && this.isPermisoGuardarCambiosNovedadNomi));			
			
			}
						
			this.jButtonGuardarCambiosTablaNovedadNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosNovedadNomi && this.isPermisoGuardarCambiosNovedadNomi));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarNovedadNomi.setVisible((this.isVisibilidadCeldaNuevoNovedadNomi && this.isPermisoNuevoNovedadNomi));						
			this.jButtonDuplicarToolBarNovedadNomi.setVisible((this.isVisibilidadCeldaDuplicarNovedadNomi && this.isPermisoDuplicarNovedadNomi));						
			this.jButtonCopiarToolBarNovedadNomi.setVisible((this.isVisibilidadCeldaCopiarNovedadNomi && this.isPermisoCopiarNovedadNomi));			
			this.jButtonVerFormToolBarNovedadNomi.setVisible((this.isVisibilidadCeldaVerFormNovedadNomi && this.isPermisoVerFormNovedadNomi));			
			this.jButtonAbrirOrderByToolBarNovedadNomi.setVisible((this.isVisibilidadCeldaOrdenNovedadNomi && this.isPermisoOrdenNovedadNomi));
			this.jButtonNuevoRelacionesToolBarNovedadNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesNovedadNomi && this.isPermisoNuevoNovedadNomi));			
			this.jButtonNuevoGuardarCambiosToolBarNovedadNomi.setVisible((this.isVisibilidadCeldaNuevoNovedadNomi && this.isPermisoNuevoNovedadNomi && this.isPermisoGuardarCambiosNovedadNomi));			
			
			if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
			this.jInternalFrameDetalleFormNovedadNomi.jButtonModificarToolBarNovedadNomi.setVisible((this.isVisibilidadCeldaModificarNovedadNomi && this.isPermisoActualizarNovedadNomi));	
			this.jInternalFrameDetalleFormNovedadNomi.jButtonActualizarToolBarNovedadNomi.setVisible((this.isVisibilidadCeldaActualizarNovedadNomi  && this.isPermisoActualizarNovedadNomi));	
			this.jInternalFrameDetalleFormNovedadNomi.jButtonEliminarToolBarNovedadNomi.setVisible((this.isVisibilidadCeldaEliminarNovedadNomi && this.isPermisoEliminarNovedadNomi));
			this.jInternalFrameDetalleFormNovedadNomi.jButtonCancelarToolBarNovedadNomi.setVisible(this.isVisibilidadCeldaCancelarNovedadNomi);				
			this.jInternalFrameDetalleFormNovedadNomi.jButtonGuardarCambiosToolBarNovedadNomi.setVisible((this.isVisibilidadCeldaGuardarNovedadNomi && this.isPermisoGuardarCambiosNovedadNomi));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarNovedadNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosNovedadNomi && this.isPermisoGuardarCambiosNovedadNomi));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoNovedadNomi.setVisible((this.isVisibilidadCeldaNuevoNovedadNomi && this.isPermisoNuevoNovedadNomi));			
			this.jMenuItemDuplicarNovedadNomi.setVisible((this.isVisibilidadCeldaDuplicarNovedadNomi && this.isPermisoDuplicarNovedadNomi));			
			this.jMenuItemCopiarNovedadNomi.setVisible((this.isVisibilidadCeldaCopiarNovedadNomi && this.isPermisoCopiarNovedadNomi));			
			this.jMenuItemVerFormNovedadNomi.setVisible((this.isVisibilidadCeldaVerFormNovedadNomi && this.isPermisoVerFormNovedadNomi));			
			this.jMenuItemAbrirOrderByNovedadNomi.setVisible((this.isVisibilidadCeldaOrdenNovedadNomi && this.isPermisoOrdenNovedadNomi));			
			//this.jMenuItemMostrarOcultarNovedadNomi.setVisible((this.isVisibilidadCeldaOrdenNovedadNomi && this.isPermisoOrdenNovedadNomi));
			this.jMenuItemDetalleAbrirOrderByNovedadNomi.setVisible((this.isVisibilidadCeldaOrdenNovedadNomi && this.isPermisoOrdenNovedadNomi));			
			//this.jMenuItemDetalleMostrarOcultarNovedadNomi.setVisible((this.isVisibilidadCeldaOrdenNovedadNomi && this.isPermisoOrdenNovedadNomi));			
			this.jMenuItemNuevoRelacionesNovedadNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesNovedadNomi && this.isPermisoNuevoNovedadNomi));			
			this.jMenuItemNuevoGuardarCambiosNovedadNomi.setVisible((this.isVisibilidadCeldaNuevoNovedadNomi && this.isPermisoNuevoNovedadNomi && this.isPermisoGuardarCambiosNovedadNomi));									
			
			if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
			this.jInternalFrameDetalleFormNovedadNomi.jMenuItemModificarNovedadNomi.setVisible((this.isVisibilidadCeldaModificarNovedadNomi && this.isPermisoActualizarNovedadNomi));	
			this.jInternalFrameDetalleFormNovedadNomi.jMenuItemActualizarNovedadNomi.setVisible((this.isVisibilidadCeldaActualizarNovedadNomi && this.isPermisoActualizarNovedadNomi));	
			this.jInternalFrameDetalleFormNovedadNomi.jMenuItemEliminarNovedadNomi.setVisible((this.isVisibilidadCeldaEliminarNovedadNomi && this.isPermisoEliminarNovedadNomi));
			this.jInternalFrameDetalleFormNovedadNomi.jMenuItemCancelarNovedadNomi.setVisible(this.isVisibilidadCeldaCancelarNovedadNomi);				
			}
			
			this.jMenuItemGuardarCambiosNovedadNomi.setVisible((this.isVisibilidadCeldaGuardarNovedadNomi && this.isPermisoGuardarCambiosNovedadNomi));						
			this.jMenuItemGuardarCambiosTablaNovedadNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosNovedadNomi && this.isPermisoGuardarCambiosNovedadNomi));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoNovedadNomi=this.jButtonNuevoNovedadNomi.isVisible();
			this.isVisibilidadCeldaDuplicarNovedadNomi=this.jButtonDuplicarNovedadNomi.isVisible();
			this.isVisibilidadCeldaCopiarNovedadNomi=this.jButtonCopiarNovedadNomi.isVisible();
			this.isVisibilidadCeldaVerFormNovedadNomi=this.jButtonVerFormNovedadNomi.isVisible();
			
			this.isVisibilidadCeldaOrdenNovedadNomi=this.jButtonAbrirOrderByNovedadNomi.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesNovedadNomi=this.jButtonNuevoRelacionesNovedadNomi.isVisible();
			this.isVisibilidadCeldaModificarNovedadNomi=this.jButtonModificarNovedadNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
			this.isVisibilidadCeldaActualizarNovedadNomi=this.jInternalFrameDetalleFormNovedadNomi.jButtonActualizarNovedadNomi.isVisible();
			this.isVisibilidadCeldaEliminarNovedadNomi=this.jInternalFrameDetalleFormNovedadNomi.jButtonEliminarNovedadNomi.isVisible();
			this.isVisibilidadCeldaCancelarNovedadNomi=this.jInternalFrameDetalleFormNovedadNomi.jButtonCancelarNovedadNomi.isVisible();
			this.isVisibilidadCeldaGuardarNovedadNomi=this.jInternalFrameDetalleFormNovedadNomi.jButtonGuardarCambiosNovedadNomi.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosNovedadNomi=this.jButtonGuardarCambiosTablaNovedadNomi.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoNovedadNomi=this.jButtonNuevoToolBarNovedadNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesNovedadNomi=this.jButtonNuevoRelacionesToolBarNovedadNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
			this.isVisibilidadCeldaModificarNovedadNomi=this.jInternalFrameDetalleFormNovedadNomi.jButtonModificarToolBarNovedadNomi.isVisible();
			this.isVisibilidadCeldaActualizarNovedadNomi=this.jInternalFrameDetalleFormNovedadNomi.jButtonActualizarToolBarNovedadNomi.isVisible();
			this.isVisibilidadCeldaEliminarNovedadNomi=this.jInternalFrameDetalleFormNovedadNomi.jButtonEliminarToolBarNovedadNomi.isVisible();
			this.isVisibilidadCeldaCancelarNovedadNomi=this.jInternalFrameDetalleFormNovedadNomi.jButtonCancelarToolBarNovedadNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarNovedadNomi=this.jButtonGuardarCambiosToolBarNovedadNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosNovedadNomi=this.jButtonGuardarCambiosTablaToolBarNovedadNomi.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoNovedadNomi=this.jMenuItemNuevoNovedadNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesNovedadNomi=this.jMenuItemNuevoRelacionesNovedadNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
			this.isVisibilidadCeldaModificarNovedadNomi=this.jInternalFrameDetalleFormNovedadNomi.jMenuItemModificarNovedadNomi.isVisible();
			this.isVisibilidadCeldaActualizarNovedadNomi=this.jInternalFrameDetalleFormNovedadNomi.jMenuItemActualizarNovedadNomi.isVisible();
			this.isVisibilidadCeldaEliminarNovedadNomi=this.jInternalFrameDetalleFormNovedadNomi.jMenuItemEliminarNovedadNomi.isVisible();
			this.isVisibilidadCeldaCancelarNovedadNomi=this.jInternalFrameDetalleFormNovedadNomi.jMenuItemCancelarNovedadNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarNovedadNomi=this.jMenuItemGuardarCambiosNovedadNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosNovedadNomi=this.jMenuItemGuardarCambiosTablaNovedadNomi.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesNovedadNomi(Boolean esInicializar) {
		if(NovedadNomiJInternalFrame.ISBINDING_MANUAL) {			
			if(this.novedadnomiSessionBean.getConGuardarRelaciones()) {
				//if(this.novedadnomiSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesNovedadNomi();
			}
			
			this.inicializarActualizarBindingBotonesManualNovedadNomi(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualNovedadNomi() {
		this.jButtonNuevoNovedadNomi.setVisible(this.isPermisoNuevoNovedadNomi);			
		this.jButtonDuplicarNovedadNomi.setVisible(this.isPermisoDuplicarNovedadNomi);			
		this.jButtonCopiarNovedadNomi.setVisible(this.isPermisoCopiarNovedadNomi);			
		this.jButtonVerFormNovedadNomi.setVisible(this.isPermisoVerFormNovedadNomi);			
		
		this.jButtonAbrirOrderByNovedadNomi.setVisible(this.isPermisoOrdenNovedadNomi);					
		
		this.jButtonNuevoRelacionesNovedadNomi.setVisible(this.isPermisoNuevoNovedadNomi);			
		
		if(this.jInternalFrameDetalleFormNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadNomi.jButtonModificarNovedadNomi.setVisible(this.isPermisoActualizarNovedadNomi);	
			this.jInternalFrameDetalleFormNovedadNomi.jButtonActualizarNovedadNomi.setVisible(this.isPermisoActualizarNovedadNomi);	
			this.jInternalFrameDetalleFormNovedadNomi.jButtonEliminarNovedadNomi.setVisible(this.isPermisoEliminarNovedadNomi);
			this.jInternalFrameDetalleFormNovedadNomi.jButtonCancelarNovedadNomi.setVisible(this.isVisibilidadCeldaCancelarNovedadNomi);						
			this.jInternalFrameDetalleFormNovedadNomi.jButtonGuardarCambiosNovedadNomi.setVisible(this.isPermisoGuardarCambiosNovedadNomi);							
		}
		
		this.jButtonGuardarCambiosTablaNovedadNomi.setVisible(this.isPermisoActualizarNovedadNomi);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleNovedadNomi() {
		this.jInternalFrameDetalleFormNovedadNomi.jButtonModificarNovedadNomi.setVisible(this.isPermisoActualizarNovedadNomi);	
		this.jInternalFrameDetalleFormNovedadNomi.jButtonActualizarNovedadNomi.setVisible(this.isPermisoActualizarNovedadNomi);	
		this.jInternalFrameDetalleFormNovedadNomi.jButtonEliminarNovedadNomi.setVisible(this.isPermisoEliminarNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jButtonCancelarNovedadNomi.setVisible(this.isVisibilidadCeldaCancelarNovedadNomi);							
		this.jInternalFrameDetalleFormNovedadNomi.jButtonGuardarCambiosNovedadNomi.setVisible((this.isVisibilidadCeldaGuardarNovedadNomi && this.isPermisoGuardarCambiosNovedadNomi));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosNovedadNomi() {
		if(NovedadNomiJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualNovedadNomi();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesNovedadNomi() {
	}
	
	public void jTableDatosNovedadNomiListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarNovedadNomi(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidNovedadNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedadNomi(this.getnovedadnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadnomi =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedadnomi =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedadnomi==null) {
						this.novedadnomi = new NovedadNomi();
					}

					this.setVariablesFormularioToObjetoActualNovedadNomi(this.novedadnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);
				}

				if(this.novedadnomi.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.novedadnomi.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedadNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaNovedadNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebNovedadNomi(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosNovedadNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosNovedadNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomi =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.novedadnomi =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualNovedadNomi(this.getnovedadnomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.novedadnomiLogic.getConnexion());

				if(this.novedadnomi.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.novedadnomi.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderNovedadNomi=(TitledBorder)this.jScrollPanelDatosNovedadNomi.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderNovedadNomi.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaNovedadNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedadNomi(this.getnovedadnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadnomi =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedadnomi =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedadnomi==null) {
						this.novedadnomi = new NovedadNomi();
					}

					this.setVariablesFormularioToObjetoActualNovedadNomi(this.novedadnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);
				}

				if(this.novedadnomi.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.novedadnomi.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedadNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoNovedadNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebNovedadNomi(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosNovedadNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosNovedadNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomi =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.novedadnomi =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualNovedadNomi(this.getnovedadnomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.novedadnomiLogic.getConnexion());

				if(this.novedadnomi.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.novedadnomi.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderNovedadNomi=(TitledBorder)this.jScrollPanelDatosNovedadNomi.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderNovedadNomi.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoNovedadNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedadNomi(this.getnovedadnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadnomi =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedadnomi =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedadnomi==null) {
						this.novedadnomi = new NovedadNomi();
					}

					this.setVariablesFormularioToObjetoActualNovedadNomi(this.novedadnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);
				}

				if(this.novedadnomi.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.novedadnomi.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedadNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleado_autorizaNovedadNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleadoautoriza=true;

			idTienePermisoempleadoautoriza=this.tienePermisosUsuarioEnPaginaWebNovedadNomi(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleadoautoriza) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosNovedadNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosNovedadNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomi =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.novedadnomi =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualNovedadNomi(this.getnovedadnomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);

				this.empleadoautorizaBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoautorizaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoautorizaBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.novedadnomiLogic.getConnexion());

				if(this.novedadnomi.getid_empleado_autoriza()!=null) {
					this.empleadoautorizaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoautorizaBeanSwingJInternalFrame.setIdActual(this.novedadnomi.getid_empleado_autoriza());
					this.empleadoautorizaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoautorizaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoautorizaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoautorizaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderNovedadNomi=(TitledBorder)this.jScrollPanelDatosNovedadNomi.getBorder();
				TitledBorder titledBorderempleadoautoriza=(TitledBorder)this.empleadoautorizaBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleadoautoriza.setTitle(titledBorderNovedadNomi.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleado_autorizaNovedadNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedadNomi(this.getnovedadnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadnomi =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedadnomi =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedadnomi==null) {
						this.novedadnomi = new NovedadNomi();
					}

					this.setVariablesFormularioToObjetoActualNovedadNomi(this.novedadnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);
				}

				if(this.novedadnomi.getid_empleado_autoriza()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado_autoriza = "+this.novedadnomi.getid_empleado_autoriza().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedadNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_novedad_nomiNovedadNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotiponovedadnomi=true;

			idTienePermisotiponovedadnomi=this.tienePermisosUsuarioEnPaginaWebNovedadNomi(TipoNovedadNomiConstantesFunciones.CLASSNAME);

			if(idTienePermisotiponovedadnomi) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosNovedadNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosNovedadNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomi =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.novedadnomi =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualNovedadNomi(this.getnovedadnomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);

				this.tiponovedadnomiBeanSwingJInternalFrame=new TipoNovedadNomiBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tiponovedadnomiBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tiponovedadnomiBeanSwingJInternalFrame.getTipoNovedadNomiLogic().setConnexion(this.novedadnomiLogic.getConnexion());

				if(this.novedadnomi.getid_tipo_novedad_nomi()!=null) {
					this.tiponovedadnomiBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tiponovedadnomiBeanSwingJInternalFrame.setIdActual(this.novedadnomi.getid_tipo_novedad_nomi());
					this.tiponovedadnomiBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tiponovedadnomiBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tiponovedadnomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoNovedadNomi();
				}

				JInternalFrameBase jinternalFrame =this.tiponovedadnomiBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderNovedadNomi=(TitledBorder)this.jScrollPanelDatosNovedadNomi.getBorder();
				TitledBorder titledBordertiponovedadnomi=(TitledBorder)this.tiponovedadnomiBeanSwingJInternalFrame.jScrollPanelDatosTipoNovedadNomi.getBorder();

				titledBordertiponovedadnomi.setTitle(titledBorderNovedadNomi.getTitle() + " -> Tipo Novedad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_novedad_nomiNovedadNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedadNomi(this.getnovedadnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadnomi =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedadnomi =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedadnomi==null) {
						this.novedadnomi = new NovedadNomi();
					}

					this.setVariablesFormularioToObjetoActualNovedadNomi(this.novedadnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);
				}

				if(this.novedadnomi.getid_tipo_novedad_nomi()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_novedad_nomi = "+this.novedadnomi.getid_tipo_novedad_nomi().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedadNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estado_novedad_nomiNovedadNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestadonovedadnomi=true;

			idTienePermisoestadonovedadnomi=this.tienePermisosUsuarioEnPaginaWebNovedadNomi(EstadoNovedadNomiConstantesFunciones.CLASSNAME);

			if(idTienePermisoestadonovedadnomi) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosNovedadNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosNovedadNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomi =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.novedadnomi =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualNovedadNomi(this.getnovedadnomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);

				this.estadonovedadnomiBeanSwingJInternalFrame=new EstadoNovedadNomiBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estadonovedadnomiBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estadonovedadnomiBeanSwingJInternalFrame.getEstadoNovedadNomiLogic().setConnexion(this.novedadnomiLogic.getConnexion());

				if(this.novedadnomi.getid_estado_novedad_nomi()!=null) {
					this.estadonovedadnomiBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estadonovedadnomiBeanSwingJInternalFrame.setIdActual(this.novedadnomi.getid_estado_novedad_nomi());
					this.estadonovedadnomiBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estadonovedadnomiBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estadonovedadnomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstadoNovedadNomi();
				}

				JInternalFrameBase jinternalFrame =this.estadonovedadnomiBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderNovedadNomi=(TitledBorder)this.jScrollPanelDatosNovedadNomi.getBorder();
				TitledBorder titledBorderestadonovedadnomi=(TitledBorder)this.estadonovedadnomiBeanSwingJInternalFrame.jScrollPanelDatosEstadoNovedadNomi.getBorder();

				titledBorderestadonovedadnomi.setTitle(titledBorderNovedadNomi.getTitle() + " -> Estado Novedad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estado_novedad_nomiNovedadNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedadNomi(this.getnovedadnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadnomi =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedadnomi =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedadnomi==null) {
						this.novedadnomi = new NovedadNomi();
					}

					this.setVariablesFormularioToObjetoActualNovedadNomi(this.novedadnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);
				}

				if(this.novedadnomi.getid_estado_novedad_nomi()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estado_novedad_nomi = "+this.novedadnomi.getid_estado_novedad_nomi().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedadNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaNovedadNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedadNomi(this.getnovedadnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadnomi =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedadnomi =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedadnomi==null) {
						this.novedadnomi = new NovedadNomi();
					}

					this.setVariablesFormularioToObjetoActualNovedadNomi(this.novedadnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);
				}

				if(this.novedadnomi.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.novedadnomi.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedadNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_horaNovedadNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedadNomi(this.getnovedadnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadnomi =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedadnomi =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedadnomi==null) {
						this.novedadnomi = new NovedadNomi();
					}

					this.setVariablesFormularioToObjetoActualNovedadNomi(this.novedadnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);
				}

				if(this.novedadnomi.getnumero_hora()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_hora = "+this.novedadnomi.getnumero_hora().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedadNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_minutoNovedadNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedadNomi(this.getnovedadnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadnomi =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedadnomi =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedadnomi==null) {
						this.novedadnomi = new NovedadNomi();
					}

					this.setVariablesFormularioToObjetoActualNovedadNomi(this.novedadnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);
				}

				if(this.novedadnomi.getnumero_minuto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_minuto = "+this.novedadnomi.getnumero_minuto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedadNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_jornada_trabajoNovedadNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedadNomi(this.getnovedadnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadnomi =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedadnomi =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedadnomi==null) {
						this.novedadnomi = new NovedadNomi();
					}

					this.setVariablesFormularioToObjetoActualNovedadNomi(this.novedadnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);
				}

				if(this.novedadnomi.getnumero_jornada_trabajo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_jornada_trabajo = "+this.novedadnomi.getnumero_jornada_trabajo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedadNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonanio_vacacionNovedadNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedadNomi(this.getnovedadnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadnomi =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedadnomi =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedadnomi==null) {
						this.novedadnomi = new NovedadNomi();
					}

					this.setVariablesFormularioToObjetoActualNovedadNomi(this.novedadnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);
				}

				if(this.novedadnomi.getanio_vacacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where anio_vacacion = "+this.novedadnomi.getanio_vacacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedadNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionNovedadNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedadNomi(this.getnovedadnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadnomi =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedadnomi =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedadnomi==null) {
						this.novedadnomi = new NovedadNomi();
					}

					this.setVariablesFormularioToObjetoActualNovedadNomi(this.novedadnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);
				}

				if(this.novedadnomi.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.novedadnomi.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedadNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpleadoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingNovedadNomi(false,false);

			this.getNovedadNomisFK_IdEmpleado();

			this.inicializarActualizarBindingNovedadNomi(false);

			//if(NovedadNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingNovedadNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoAutorizaNovedadNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingNovedadNomi(false,false);

			this.getNovedadNomisFK_IdEmpleadoAutoriza();

			this.inicializarActualizarBindingNovedadNomi(false);

			//if(NovedadNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingNovedadNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaNovedadNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingNovedadNomi(false,false);

			this.getNovedadNomisFK_IdEmpresa();

			this.inicializarActualizarBindingNovedadNomi(false);

			//if(NovedadNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingNovedadNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstadoNovedadNomiNovedadNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingNovedadNomi(false,false);

			this.getNovedadNomisFK_IdEstadoNovedadNomi();

			this.inicializarActualizarBindingNovedadNomi(false);

			//if(NovedadNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingNovedadNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoNovedadNomiNovedadNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingNovedadNomi(false,false);

			this.getNovedadNomisFK_IdTipoNovedadNomi();

			this.inicializarActualizarBindingNovedadNomi(false);

			//if(NovedadNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingNovedadNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadnomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameNovedadNomi() {
		if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
			this.jInternalFrameDetalleFormNovedadNomi.setVisible(false);	    			
			this.jInternalFrameDetalleFormNovedadNomi.dispose();
			this.jInternalFrameDetalleFormNovedadNomi=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoNovedadNomi!=null) {
			this.jInternalFrameReporteDinamicoNovedadNomi.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoNovedadNomi.dispose();
			this.jInternalFrameReporteDinamicoNovedadNomi=null;
		}
		
		if(this.jInternalFrameImportacionNovedadNomi!=null) {
			this.jInternalFrameImportacionNovedadNomi.setVisible(false);	    			
			this.jInternalFrameImportacionNovedadNomi.dispose();
			this.jInternalFrameImportacionNovedadNomi=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessNovedadNomi();
			
			NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
			
			
			if(sTipo.equals("NuevoNovedadNomi")) {
				jButtonNuevoNovedadNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarNovedadNomi")) {
				jButtonDuplicarNovedadNomiActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarNovedadNomi")) {
				jButtonCopiarNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormNovedadNomi")) {
				jButtonVerFormNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarNovedadNomi")) {
				jButtonNuevoNovedadNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarNovedadNomi")) {
				jButtonDuplicarNovedadNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoNovedadNomi")) {
				jButtonNuevoNovedadNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarNovedadNomi")) {
				jButtonDuplicarNovedadNomiActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesNovedadNomi")) {
				jButtonNuevoNovedadNomiActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarNovedadNomi")) {
				jButtonNuevoNovedadNomiActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesNovedadNomi")) {
				jButtonNuevoNovedadNomiActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarNovedadNomi")) {
				jButtonModificarNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarNovedadNomi")) {
				jButtonModificarNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarNovedadNomi")) {
				jButtonModificarNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarNovedadNomi")) {
				jButtonActualizarNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarNovedadNomi")) {
				jButtonActualizarNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarNovedadNomi")) {
				jButtonActualizarNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarNovedadNomi")) {
				jButtonEliminarNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarNovedadNomi")) {
				jButtonEliminarNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarNovedadNomi")) {
				jButtonEliminarNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarNovedadNomi")) {
				jButtonCancelarNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarNovedadNomi")) {
				jButtonCancelarNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarNovedadNomi")) {
				jButtonCancelarNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarNovedadNomi")) {
				jButtonCerrarNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarNovedadNomi")) {
				jButtonCerrarNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarNovedadNomi")) {
				jButtonCerrarNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarNovedadNomi")) {
				jButtonMostrarOcultarNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarNovedadNomi")) {
				jButtonCancelarNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosNovedadNomi")) {
				jButtonGuardarCambiosNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarNovedadNomi")) {
				jButtonGuardarCambiosNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarNovedadNomi")) {
				jButtonCopiarNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarNovedadNomi")) {
				jButtonVerFormNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosNovedadNomi")) {
				jButtonGuardarCambiosNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarNovedadNomi")) {
				jButtonCopiarNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormNovedadNomi")) {
				jButtonVerFormNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaNovedadNomi")) {
				jButtonGuardarCambiosNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarNovedadNomi")) {
				jButtonGuardarCambiosNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaNovedadNomi")) {
				jButtonGuardarCambiosNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionNovedadNomi")) {
				jButtonRecargarInformacionNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarNovedadNomi")) {
				jButtonRecargarInformacionNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionNovedadNomi")) {
				jButtonRecargarInformacionNovedadNomiActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresNovedadNomi")) {
				jButtonAnterioresNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarNovedadNomi")) {
				jButtonAnterioresNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreNovedadNomi")) {
				jButtonAnterioresNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesNovedadNomi")) {
				jButtonSiguientesNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarNovedadNomi")) {
				jButtonSiguientesNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesNovedadNomi")) {
				jButtonSiguientesNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByNovedadNomi") || sTipo.equals("MenuItemDetalleAbrirOrderByNovedadNomi")) {
				jButtonAbrirOrderByNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarNovedadNomi") || sTipo.equals("MenuItemDetalleMostrarOcultarNovedadNomi")) {
				jButtonMostrarOcultarNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosNovedadNomi")) {
				jButtonNuevoGuardarCambiosNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarNovedadNomi")) {
				jButtonNuevoGuardarCambiosNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosNovedadNomi")) {
				jButtonNuevoGuardarCambiosNovedadNomiActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoNovedadNomi")) {
				jButtonCerrarReporteDinamicoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoNovedadNomi")) {
				jButtonGenerarReporteDinamicoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoNovedadNomi")) {
				
				jButtonGenerarExcelReporteDinamicoNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionNovedadNomi")) {
				jButtonCerrarImportacionNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionNovedadNomi")) {
				
				jButtonGenerarImportacionNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionNovedadNomi")) {
				
				jButtonAbrirImportacionNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesNovedadNomi")) {
				jComboBoxTiposAccionesNovedadNomiActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesNovedadNomi")) {
				jComboBoxTiposRelacionesNovedadNomiActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioNovedadNomi")) {
				jComboBoxTiposAccionesNovedadNomiActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarNovedadNomi")) {
				
				jComboBoxTiposSeleccionarNovedadNomiActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralNovedadNomi")) {
				jTextFieldValorCampoGeneralNovedadNomiActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByNovedadNomi")) {
				jButtonAbrirOrderByNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarNovedadNomi")) {
				jButtonAbrirOrderByNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByNovedadNomi")) {
				jButtonCerrarOrderByNovedadNomiActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idNovedadNomiBusqueda")) {
				this.jButtonidNovedadNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaNovedadNomiUpdate")) {
				this.jButtonid_empresaNovedadNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaNovedadNomiBusqueda")) {
				this.jButtonid_empresaNovedadNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoNovedadNomiUpdate")) {
				this.jButtonid_empleadoNovedadNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoNovedadNomiBusqueda")) {
				this.jButtonid_empleadoNovedadNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleado_autorizaNovedadNomiUpdate")) {
				this.jButtonid_empleado_autorizaNovedadNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleado_autorizaNovedadNomiBusqueda")) {
				this.jButtonid_empleado_autorizaNovedadNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_novedad_nomiNovedadNomiUpdate")) {
				this.jButtonid_tipo_novedad_nomiNovedadNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_novedad_nomiNovedadNomiBusqueda")) {
				this.jButtonid_tipo_novedad_nomiNovedadNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_novedad_nomiNovedadNomiUpdate")) {
				this.jButtonid_estado_novedad_nomiNovedadNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_novedad_nomiNovedadNomiBusqueda")) {
				this.jButtonid_estado_novedad_nomiNovedadNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaNovedadNomiBusqueda")) {
				this.jButtonfechaNovedadNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_horaNovedadNomiBusqueda")) {
				this.jButtonnumero_horaNovedadNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_minutoNovedadNomiBusqueda")) {
				this.jButtonnumero_minutoNovedadNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_jornada_trabajoNovedadNomiBusqueda")) {
				this.jButtonnumero_jornada_trabajoNovedadNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("anio_vacacionNovedadNomiBusqueda")) {
				this.jButtonanio_vacacionNovedadNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionNovedadNomiBusqueda")) {
				this.jButtondescripcionNovedadNomiBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdEmpleadoNovedadNomi")) {
				this.jButtonFK_IdEmpleadoNovedadNomiActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEmpleadoAutorizaNovedadNomi")) {
				this.jButtonFK_IdEmpleadoAutorizaNovedadNomiActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstadoNovedadNomiNovedadNomi")) {
				this.jButtonFK_IdEstadoNovedadNomiNovedadNomiActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoNovedadNomiNovedadNomi")) {
				this.jButtonFK_IdTipoNovedadNomiNovedadNomiActionPerformed(evt);
			}
			
			;
			
			
			NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessNovedadNomi();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNovedadNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadnomi);
				
				NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
				
				


				
				NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NovedadNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			NovedadNomi novedadnomiLocal=null;
			
			if(!this.getEsControlTabla()) {
				novedadnomiLocal=this.novedadnomi;
			} else {
				novedadnomiLocal=this.novedadnomiAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadnomi);
				
				NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
							
				
				


				
				NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NovedadNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiAnterior =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedadnomiAnterior =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
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
			
			NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
			
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
			
			


			
			NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNovedadNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadnomi);
				
				NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
								
						
				


				
				NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NovedadNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadNomi.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadnomi);
				
				NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
								
				
				


				
				NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NovedadNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiAnterior =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedadnomiAnterior =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadnomi);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiAnterior =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedadnomiAnterior =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadnomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.novedadnomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadnomi);
				
				NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
							
				
				


				
				NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NovedadNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadNomi.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNovedadNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadnomiAnterior =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.novedadnomiAnterior =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
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
			
			NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
			
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
			
			


			
			NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadNomiActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadnomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.novedadnomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadnomi);
				
				NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
								
				
				


				
				NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NovedadNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiAnterior =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedadnomiAnterior =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadnomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.novedadnomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNovedadNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadnomi);
				
				NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosNovedadNomi")) {
					jCheckBoxSeleccionarTodosNovedadNomiItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosNovedadNomi")) {
					jCheckBoxSeleccionadosNovedadNomiItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarNovedadNomi")) {
					
				}
				
				


				
				
				NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NovedadNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadnomi);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.novedadnomi);
				
				NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
												
				
				


				
				
				NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NovedadNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNovedadNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadnomiAnterior =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.novedadnomiAnterior =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNovedadNomiActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadnomi);
				
				NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
				
				
				NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
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
			
			NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
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
			
			


			
			NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNovedadNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadnomi);
				
				NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NovedadNomi.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadNomi.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedadnomi);
				
				NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
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
				
				


				
				NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NovedadNomi.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NovedadNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadnomiAnterior =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedadnomiAnterior =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarNovedadNomi")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosNovedadNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosNovedadNomi.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.novedadnomi =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.novedadnomi =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.novedadnomi);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarNovedadNomi")) {
				
				}
				
				NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarNovedadNomi")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosNovedadNomi.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarNovedadNomi")) {
			
			}
			
			NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessNovedadNomi();
			
			NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
			
			if(sTipo.equals("NuevoNovedadNomi")) {
				jButtonNuevoNovedadNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarNovedadNomi")) {
				jButtonDuplicarNovedadNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarNovedadNomi")) {
				jButtonCopiarNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormNovedadNomi")) {
				jButtonVerFormNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesNovedadNomi")) {
				jButtonNuevoNovedadNomiActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarNovedadNomi")) {
				jButtonModificarNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarNovedadNomi")) {
				jButtonActualizarNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarNovedadNomi")) {
				jButtonEliminarNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaNovedadNomi")) {
				jButtonGuardarCambiosNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarNovedadNomi")) {
				jButtonCancelarNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarNovedadNomi")) {
				jButtonCerrarNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosNovedadNomi")) {
				jButtonGuardarCambiosNovedadNomiActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosNovedadNomi")) {
				jButtonNuevoGuardarCambiosNovedadNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByNovedadNomi")) {
				jButtonAbrirOrderByNovedadNomiActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionNovedadNomi")) {
				jButtonRecargarInformacionNovedadNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresNovedadNomi")) {
				jButtonAnterioresNovedadNomiActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesNovedadNomi")) {
				jButtonSiguientesNovedadNomiActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idNovedadNomiBusqueda")) {
				this.jButtonidNovedadNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaNovedadNomiUpdate")) {
				this.jButtonid_empresaNovedadNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaNovedadNomiBusqueda")) {
				this.jButtonid_empresaNovedadNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoNovedadNomiUpdate")) {
				this.jButtonid_empleadoNovedadNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoNovedadNomiBusqueda")) {
				this.jButtonid_empleadoNovedadNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleado_autorizaNovedadNomiUpdate")) {
				this.jButtonid_empleado_autorizaNovedadNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleado_autorizaNovedadNomiBusqueda")) {
				this.jButtonid_empleado_autorizaNovedadNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_novedad_nomiNovedadNomiUpdate")) {
				this.jButtonid_tipo_novedad_nomiNovedadNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_novedad_nomiNovedadNomiBusqueda")) {
				this.jButtonid_tipo_novedad_nomiNovedadNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_novedad_nomiNovedadNomiUpdate")) {
				this.jButtonid_estado_novedad_nomiNovedadNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_novedad_nomiNovedadNomiBusqueda")) {
				this.jButtonid_estado_novedad_nomiNovedadNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaNovedadNomiBusqueda")) {
				this.jButtonfechaNovedadNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_horaNovedadNomiBusqueda")) {
				this.jButtonnumero_horaNovedadNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_minutoNovedadNomiBusqueda")) {
				this.jButtonnumero_minutoNovedadNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_jornada_trabajoNovedadNomiBusqueda")) {
				this.jButtonnumero_jornada_trabajoNovedadNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("anio_vacacionNovedadNomiBusqueda")) {
				this.jButtonanio_vacacionNovedadNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionNovedadNomiBusqueda")) {
				this.jButtondescripcionNovedadNomiBusquedaActionPerformed(evt);
			}
			
			NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessNovedadNomi();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameNovedadNomi")) {
				closingInternalFrameNovedadNomi();
				
			} else if(sTipo.equals("jButtonCancelarNovedadNomi")) {
				JInternalFrameBase jInternalFrameDetalleFormNovedadNomi = (JInternalFrameBase)evt.getSource();
	            	
	            NovedadNomiBeanSwingJInternalFrame jInternalFrameParent=(NovedadNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormNovedadNomi.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarNovedadNomiActionPerformed(null);
			}
			
			NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.novedadnomi,new Object(),this.novedadnomiParameterGeneral,this.novedadnomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormNovedadNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormNovedadNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormNovedadNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.novedadnomi)) {
			if(!esControlTabla) {
				if(NovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualNovedadNomi(this.novedadnomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);			
				}
				
				if(this.novedadnomiSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualNovedadNomi(this.novedadnomi,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.novedadnomiReturnGeneral=novedadnomiLogic.procesarEventosNovedadNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.novedadnomiLogic.getNovedadNomis(),this.novedadnomi,this.novedadnomiParameterGeneral,this.isEsNuevoNovedadNomi,classes);//this.novedadnomiLogic.getNovedadNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanNovedadNomi(this.novedadnomiReturnGeneral,this.novedadnomiBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.novedadnomiSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanNovedadNomi(classes,this.novedadnomiReturnGeneral,this.novedadnomiBean,false);
					}
						
					if(this.novedadnomiReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyNovedadNomi(this.novedadnomiReturnGeneral.getNovedadNomi());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioNovedadNomi(this.novedadnomiReturnGeneral.getNovedadNomi());	
					}
						
					if(this.novedadnomiReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioNovedadNomi(this.novedadnomiReturnGeneral.getNovedadNomi(),classes);//this.novedadnomiBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioNovedadNomi(this.novedadnomi,classes);//this.novedadnomiBean);									
				}
			
				if(NovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualNovedadNomi(this.novedadnomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedadNomi(this.novedadnomi);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.novedadnomiAnterior!=null) {
						this.novedadnomi=this.novedadnomiAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.novedadnomiReturnGeneral=novedadnomiLogic.procesarEventosNovedadNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.novedadnomiLogic.getNovedadNomis(),this.novedadnomi,this.novedadnomiParameterGeneral,this.isEsNuevoNovedadNomi,classes);//this.novedadnomiLogic.getNovedadNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.novedadnomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.novedadnomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.novedadnomiReturnGeneral.getNovedadNomi(),novedadnomiLogic.getNovedadNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.novedadnomiReturnGeneral.getNovedadNomi(),this.novedadnomis);
				}
				//ARCHITECTURE
				
				//this.jTableDatosNovedadNomi.repaint();
				
				//((AbstractTableModel) this.jTableDatosNovedadNomi.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosNovedadNomi();
			}
		}
	}
	
	public void actualizarVisualTableDatosNovedadNomi() throws Exception {
		
		NovedadNomiModel novedadnomiModel=(NovedadNomiModel)this.jTableDatosNovedadNomi.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			novedadnomiModel.novedadnomis=this.novedadnomiLogic.getNovedadNomis();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			novedadnomiModel.novedadnomis=this.novedadnomis;
		}
		
		
		((NovedadNomiModel) this.jTableDatosNovedadNomi.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaNovedadNomi() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getnovedadnomiAnterior(),this.novedadnomiLogic.getNovedadNomis());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getnovedadnomiAnterior(),this.novedadnomis);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosNovedadNomi();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioNovedadNomi(NovedadNomi novedadnomi,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
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
										
				NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.novedadnomi,new Object(),generalEntityParameterGeneral,this.novedadnomiReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.novedadnomiSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=NovedadNomiConstantesFunciones.getClassesRelationshipsOfNovedadNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=NovedadNomiConstantesFunciones.getClassesRelationshipsFromStringsOfNovedadNomi(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormNovedadNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				NovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.novedadnomi,new Object(),generalEntityParameterGeneral,this.novedadnomiReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioNovedadNomi(NovedadNomiBean novedadnomiBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanNovedadNomi(ArrayList<Classe> classes,NovedadNomiReturnGeneral novedadnomiReturnGeneral,NovedadNomiBean novedadnomiBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualNovedadNomi(NovedadNomi novedadnomi,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.novedadnomi)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormNovedadNomi = new NovedadNomiDetalleFormJInternalFrame(jDesktopPane,this.novedadnomiSessionBean.getConGuardarRelaciones(),this.novedadnomiSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.setVisible(false);
		this.jInternalFrameDetalleFormNovedadNomi.setSelected(false);						
		
		this.jInternalFrameDetalleFormNovedadNomi.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormNovedadNomi.novedadnomiLogic=this.novedadnomiLogic;
		
		this.cargarCombosFrameForeignKeyNovedadNomi("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleNovedadNomi();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleNovedadNomi();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyNovedadNomi("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyNovedadNomi();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormNovedadNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarNovedadNomi"));
		
		this.jInternalFrameDetalleFormNovedadNomi.jButtonModificarNovedadNomi.addActionListener(new ButtonActionListener(this,"ModificarNovedadNomi"));

		
		this.jInternalFrameDetalleFormNovedadNomi.jButtonModificarToolBarNovedadNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarNovedadNomi"));
					
		this.jInternalFrameDetalleFormNovedadNomi.jMenuItemModificarNovedadNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarNovedadNomi"));		
		
		
		
		this.jInternalFrameDetalleFormNovedadNomi.jButtonActualizarNovedadNomi.addActionListener (new ButtonActionListener(this,"ActualizarNovedadNomi"));
		
		
		this.jInternalFrameDetalleFormNovedadNomi.jButtonActualizarToolBarNovedadNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarNovedadNomi"));
						
		this.jInternalFrameDetalleFormNovedadNomi.jMenuItemActualizarNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarNovedadNomi"));		
		
		
		
		this.jInternalFrameDetalleFormNovedadNomi.jButtonEliminarNovedadNomi.addActionListener (new ButtonActionListener(this,"EliminarNovedadNomi"));
		
		
		this.jInternalFrameDetalleFormNovedadNomi.jButtonEliminarToolBarNovedadNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarNovedadNomi"));
								
		this.jInternalFrameDetalleFormNovedadNomi.jMenuItemEliminarNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarNovedadNomi"));		
		
		
		
		this.jInternalFrameDetalleFormNovedadNomi.jButtonCancelarNovedadNomi.addActionListener (new ButtonActionListener(this,"CancelarNovedadNomi"));
		
		
		this.jInternalFrameDetalleFormNovedadNomi.jButtonCancelarToolBarNovedadNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarNovedadNomi"));
					
		this.jInternalFrameDetalleFormNovedadNomi.jMenuItemCancelarNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarNovedadNomi"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormNovedadNomi.jMenuItemDetalleCerrarNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarNovedadNomi"));		
		
		
		
		this.jInternalFrameDetalleFormNovedadNomi.jButtonGuardarCambiosToolBarNovedadNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNovedadNomi"));
		
		
		
		this.jInternalFrameDetalleFormNovedadNomi.jButtonGuardarCambiosToolBarNovedadNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNovedadNomi"));
		
		
		
		this.jInternalFrameDetalleFormNovedadNomi.jComboBoxTiposAccionesFormularioNovedadNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioNovedadNomi"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonidNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"idNovedadNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadNomi.jButtonid_empresaNovedadNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaNovedadNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonid_empresaNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaNovedadNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadNomi.jButtonid_empleadoNovedadNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoNovedadNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonid_empleadoNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoNovedadNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadNomi.jButtonid_empleado_autorizaNovedadNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empleado_autorizaNovedadNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonid_empleado_autorizaNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empleado_autorizaNovedadNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadNomi.jButtonid_tipo_novedad_nomiNovedadNomiUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_novedad_nomiNovedadNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonid_tipo_novedad_nomiNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_novedad_nomiNovedadNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadNomi.jButtonid_estado_novedad_nomiNovedadNomiUpdate.addActionListener(new ButtonActionListener(this,"id_estado_novedad_nomiNovedadNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonid_estado_novedad_nomiNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_novedad_nomiNovedadNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonfechaNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"fechaNovedadNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonnumero_horaNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"numero_horaNovedadNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonnumero_minutoNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"numero_minutoNovedadNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonnumero_jornada_trabajoNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"numero_jornada_trabajoNovedadNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonanio_vacacionNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"anio_vacacionNovedadNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtondescripcionNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"descripcionNovedadNomiBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormNovedadNomi.jTabbedPaneRelacionesNovedadNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesNovedadNomi"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameNovedadNomi"));
		
		if(this.jInternalFrameDetalleFormNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarNovedadNomi"));
		}
		
		this.jTableDatosNovedadNomi.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarNovedadNomi"));
		
		this.jTableDatosNovedadNomi.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarNovedadNomi"));
		
		this.jButtonNuevoNovedadNomi.addActionListener(new ButtonActionListener(this,"NuevoNovedadNomi"));
		
		this.jButtonDuplicarNovedadNomi.addActionListener(new ButtonActionListener(this,"DuplicarNovedadNomi"));
		
		this.jButtonCopiarNovedadNomi.addActionListener(new ButtonActionListener(this,"CopiarNovedadNomi"));
		
		this.jButtonVerFormNovedadNomi.addActionListener(new ButtonActionListener(this,"VerFormNovedadNomi"));
		
		
		this.jButtonNuevoToolBarNovedadNomi.addActionListener(new ButtonActionListener(this,"NuevoToolBarNovedadNomi"));
			
		this.jButtonDuplicarToolBarNovedadNomi.addActionListener(new ButtonActionListener(this,"DuplicarToolBarNovedadNomi"));
			
		this.jMenuItemNuevoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoNovedadNomi"));
			
		this.jMenuItemDuplicarNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarNovedadNomi"));		
		
		
		this.jButtonNuevoRelacionesNovedadNomi.addActionListener (new ButtonActionListener(this,"NuevoRelacionesNovedadNomi"));
		
		
		this.jButtonNuevoRelacionesToolBarNovedadNomi.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarNovedadNomi"));
			
		this.jMenuItemNuevoRelacionesNovedadNomi.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesNovedadNomi"));		
		
		
		if(this.jInternalFrameDetalleFormNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadNomi.jButtonModificarNovedadNomi.addActionListener(new ButtonActionListener(this,"ModificarNovedadNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadNomi.jButtonModificarToolBarNovedadNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarNovedadNomi"));
			
			this.jInternalFrameDetalleFormNovedadNomi.jMenuItemModificarNovedadNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarNovedadNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNovedadNomi!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormNovedadNomi.jButtonActualizarNovedadNomi.addActionListener (new ButtonActionListener(this,"ActualizarNovedadNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadNomi.jButtonActualizarToolBarNovedadNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarNovedadNomi"));
				
			this.jInternalFrameDetalleFormNovedadNomi.jMenuItemActualizarNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarNovedadNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadNomi.jButtonEliminarNovedadNomi.addActionListener (new ButtonActionListener(this,"EliminarNovedadNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadNomi.jButtonEliminarToolBarNovedadNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarNovedadNomi"));
						
			this.jInternalFrameDetalleFormNovedadNomi.jMenuItemEliminarNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarNovedadNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadNomi.jButtonCancelarNovedadNomi.addActionListener (new ButtonActionListener(this,"CancelarNovedadNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadNomi.jButtonCancelarToolBarNovedadNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarNovedadNomi"));
			
			this.jInternalFrameDetalleFormNovedadNomi.jMenuItemCancelarNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarNovedadNomi"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarNovedadNomi.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarNovedadNomi"));		
		
		
		this.jButtonCerrarNovedadNomi.addActionListener (new ButtonActionListener(this,"CerrarNovedadNomi"));
		
		
		this.jButtonCerrarToolBarNovedadNomi.addActionListener (new ButtonActionListener(this,"CerrarToolBarNovedadNomi"));
			
		this.jMenuItemCerrarNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemCerrarNovedadNomi"));
			
		if(this.jInternalFrameDetalleFormNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadNomi.jMenuItemDetalleCerrarNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarNovedadNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadNomi.jButtonGuardarCambiosNovedadNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosNovedadNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadNomi.jButtonGuardarCambiosToolBarNovedadNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNovedadNomi"));
		}
		
		this.jButtonCopiarToolBarNovedadNomi.addActionListener (new ButtonActionListener(this,"CopiarToolBarNovedadNomi"));
			
		this.jButtonVerFormToolBarNovedadNomi.addActionListener (new ButtonActionListener(this,"VerFormToolBarNovedadNomi"));
		
		this.jMenuItemGuardarCambiosNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosNovedadNomi"));
			
		this.jMenuItemCopiarNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemCopiarNovedadNomi"));		
		
		this.jMenuItemVerFormNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemVerFormNovedadNomi"));		
		
		
		this.jButtonGuardarCambiosTablaNovedadNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaNovedadNomi"));
		
		
		this.jButtonGuardarCambiosTablaToolBarNovedadNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarNovedadNomi"));
			
		this.jMenuItemGuardarCambiosTablaNovedadNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaNovedadNomi"));		
		
		
		
		this.jButtonRecargarInformacionNovedadNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionNovedadNomi"));
					
		this.jButtonRecargarInformacionToolBarNovedadNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarNovedadNomi"));
		
		this.jMenuItemRecargarInformacionNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionNovedadNomi"));		
		
		
		
		this.jButtonAnterioresNovedadNomi.addActionListener (new ButtonActionListener(this,"AnterioresNovedadNomi"));
		
		
		this.jButtonAnterioresToolBarNovedadNomi.addActionListener (new ButtonActionListener(this,"AnterioresToolBarNovedadNomi"));
		
		this.jMenuItemAnterioresNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresNovedadNomi"));		
		
		
		this.jButtonSiguientesNovedadNomi.addActionListener (new ButtonActionListener(this,"SiguientesNovedadNomi"));
		
		
		this.jButtonSiguientesToolBarNovedadNomi.addActionListener (new ButtonActionListener(this,"SiguientesToolBarNovedadNomi"));
			
		this.jMenuItemSiguientesNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesNovedadNomi"));
			
		this.jMenuItemAbrirOrderByNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByNovedadNomi"));
			
		this.jMenuItemMostrarOcultarNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarNovedadNomi"));
			
		this.jMenuItemDetalleAbrirOrderByNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByNovedadNomi"));
			
		this.jMenuItemDetalleMostarOcultarNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarNovedadNomi"));		
		
		
		this.jButtonNuevoGuardarCambiosNovedadNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosNovedadNomi"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarNovedadNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarNovedadNomi"));
			
		this.jMenuItemNuevoGuardarCambiosNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosNovedadNomi"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosNovedadNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosNovedadNomi"));

		this.jCheckBoxSeleccionadosNovedadNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionadosNovedadNomi"));
		
		if(this.jInternalFrameDetalleFormNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadNomi.jComboBoxTiposAccionesFormularioNovedadNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioNovedadNomi"));
		}
		
		
		this.jComboBoxTiposRelacionesNovedadNomi.addActionListener (new ButtonActionListener(this,"TiposRelacionesNovedadNomi"));
			
		this.jComboBoxTiposAccionesNovedadNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesNovedadNomi"));
					
		this.jComboBoxTiposSeleccionarNovedadNomi.addActionListener (new ButtonActionListener(this,"TiposSeleccionarNovedadNomi"));
			
		this.jTextFieldValorCampoGeneralNovedadNomi.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralNovedadNomi"));		
		
		
		if(this.jInternalFrameDetalleFormNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonidNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"idNovedadNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadNomi.jButtonid_empresaNovedadNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaNovedadNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonid_empresaNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaNovedadNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadNomi.jButtonid_empleadoNovedadNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoNovedadNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonid_empleadoNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoNovedadNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadNomi.jButtonid_empleado_autorizaNovedadNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empleado_autorizaNovedadNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonid_empleado_autorizaNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empleado_autorizaNovedadNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadNomi.jButtonid_tipo_novedad_nomiNovedadNomiUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_novedad_nomiNovedadNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonid_tipo_novedad_nomiNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_novedad_nomiNovedadNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadNomi.jButtonid_estado_novedad_nomiNovedadNomiUpdate.addActionListener(new ButtonActionListener(this,"id_estado_novedad_nomiNovedadNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonid_estado_novedad_nomiNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_novedad_nomiNovedadNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonfechaNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"fechaNovedadNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonnumero_horaNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"numero_horaNovedadNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonnumero_minutoNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"numero_minutoNovedadNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonnumero_jornada_trabajoNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"numero_jornada_trabajoNovedadNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonanio_vacacionNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"anio_vacacionNovedadNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtondescripcionNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"descripcionNovedadNomiBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoNovedadNomi.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoNovedadNomi"));

			this.jButtonFK_IdEmpleadoAutorizaNovedadNomi.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoAutorizaNovedadNomi"));

			this.jButtonFK_IdEstadoNovedadNomiNovedadNomi.addActionListener(new ButtonActionListener(this,"FK_IdEstadoNovedadNomiNovedadNomi"));

			this.jButtonFK_IdTipoNovedadNomiNovedadNomi.addActionListener(new ButtonActionListener(this,"FK_IdTipoNovedadNomiNovedadNomi"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoNovedadNomi!=null) {
				this.jInternalFrameReporteDinamicoNovedadNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNovedadNomi"));
				this.jInternalFrameReporteDinamicoNovedadNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNovedadNomi"));
				this.jInternalFrameReporteDinamicoNovedadNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNovedadNomi"));
			}
			
			//this.jButtonCerrarReporteDinamicoNovedadNomi.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNovedadNomi"));				
			//this.jButtonGenerarReporteDinamicoNovedadNomi.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNovedadNomi"));
			//this.jButtonGenerarExcelReporteDinamicoNovedadNomi.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNovedadNomi"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionNovedadNomi!=null) {
				this.jInternalFrameImportacionNovedadNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionNovedadNomi"));
				this.jInternalFrameImportacionNovedadNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionNovedadNomi"));
				this.jInternalFrameImportacionNovedadNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionNovedadNomi"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByNovedadNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByNovedadNomi"));
			
			this.jButtonAbrirOrderByToolBarNovedadNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarNovedadNomi"));			
			
			if(this.jInternalFrameOrderByNovedadNomi!=null) {
				this.jInternalFrameOrderByNovedadNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByNovedadNomi"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedadNomi.jTabbedPaneRelacionesNovedadNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesNovedadNomi"));
		
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
            		closingInternalFrameNovedadNomi();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormNovedadNomi.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormNovedadNomi = (JInternalFrameBase)event.getSource();
	            	
	            NovedadNomiBeanSwingJInternalFrame jInternalFrameParent=(NovedadNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormNovedadNomi.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarNovedadNomiActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosNovedadNomi.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosNovedadNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosNovedadNomi.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosNovedadNomi.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNovedadNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNovedadNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNovedadNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoNovedadNomi";
		inputMap = this.jButtonNuevoNovedadNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoNovedadNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoNovedadNomiActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNovedadNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNovedadNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNovedadNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesNovedadNomi";
		inputMap = this.jButtonNuevoRelacionesNovedadNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesNovedadNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoNovedadNomiActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarNovedadNomi";
		inputMap = this.jButtonModificarNovedadNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarNovedadNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarNovedadNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarNovedadNomi";
		inputMap = this.jButtonActualizarNovedadNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarNovedadNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarNovedadNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarNovedadNomi";
		inputMap = this.jButtonEliminarNovedadNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarNovedadNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarNovedadNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarNovedadNomi";
		inputMap = this.jButtonCancelarNovedadNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarNovedadNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarNovedadNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarNovedadNomi";
		inputMap = this.jButtonCerrarNovedadNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarNovedadNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarNovedadNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormNovedadNomi.jButtonGuardarCambiosNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosNovedadNomi";
		inputMap = this.jInternalFrameDetalleFormNovedadNomi.jButtonGuardarCambiosNovedadNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormNovedadNomi.jButtonGuardarCambiosNovedadNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosNovedadNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosNovedadNomi.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosNovedadNomiItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesNovedadNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesNovedadNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarNovedadNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarNovedadNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralNovedadNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralNovedadNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonidNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"idNovedadNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadNomi.jButtonid_empresaNovedadNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaNovedadNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonid_empresaNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaNovedadNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadNomi.jButtonid_empleadoNovedadNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoNovedadNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonid_empleadoNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoNovedadNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadNomi.jButtonid_empleado_autorizaNovedadNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empleado_autorizaNovedadNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonid_empleado_autorizaNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empleado_autorizaNovedadNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadNomi.jButtonid_tipo_novedad_nomiNovedadNomiUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_novedad_nomiNovedadNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonid_tipo_novedad_nomiNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_novedad_nomiNovedadNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedadNomi.jButtonid_estado_novedad_nomiNovedadNomiUpdate.addActionListener(new ButtonActionListener(this,"id_estado_novedad_nomiNovedadNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonid_estado_novedad_nomiNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_novedad_nomiNovedadNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonfechaNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"fechaNovedadNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonnumero_horaNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"numero_horaNovedadNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonnumero_minutoNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"numero_minutoNovedadNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonnumero_jornada_trabajoNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"numero_jornada_trabajoNovedadNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtonanio_vacacionNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"anio_vacacionNovedadNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedadNomi.jButtondescripcionNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"descripcionNovedadNomiBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoNovedadNomi.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoNovedadNomi"));

		this.jButtonFK_IdEmpleadoAutorizaNovedadNomi.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoAutorizaNovedadNomi"));

		this.jButtonFK_IdEstadoNovedadNomiNovedadNomi.addActionListener(new ButtonActionListener(this,"FK_IdEstadoNovedadNomiNovedadNomi"));

		this.jButtonFK_IdTipoNovedadNomiNovedadNomi.addActionListener(new ButtonActionListener(this,"FK_IdTipoNovedadNomiNovedadNomi"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarNovedadNomiActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarNovedadNomi.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosNovedadNomi(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(NovedadNomi novedadnomiAux:this.novedadnomiLogic.getNovedadNomis()) {
					novedadnomiAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NovedadNomi novedadnomiAux:novedadnomis) {
					novedadnomiAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosNovedadNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingNovedadNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(NovedadNomi novedadnomiAux:this.novedadnomiLogic.getNovedadNomis()) {
						novedadnomiAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(NovedadNomi novedadnomiAux:novedadnomis) {
						novedadnomiAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(NovedadNomi novedadnomiAux:this.novedadnomiLogic.getNovedadNomis()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(NovedadNomi novedadnomiAux:novedadnomis) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaNovedadNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosNovedadNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosNovedadNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosNovedadNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosNovedadNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingNovedadNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosNovedadNomi.getSelectedRows();
			
			NovedadNomi novedadnomiLocal=new NovedadNomi();
			
			//this.seleccionarTodosNovedadNomi(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					novedadnomiLocal =(NovedadNomi) this.novedadnomiLogic.getNovedadNomis().toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					novedadnomiLocal =(NovedadNomi) this.novedadnomis.toArray()[this.jTableDatosNovedadNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				novedadnomiLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(NovedadNomi novedadnomiAux:this.novedadnomiLogic.getNovedadNomis()) {
						novedadnomiAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(NovedadNomi novedadnomiAux:novedadnomis) {
						novedadnomiAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaNovedadNomi(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosNovedadNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosNovedadNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosNovedadNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualNovedadNomiItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarNovedadNomiParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralNovedadNomiActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingNovedadNomi(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralNovedadNomi.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(NovedadNomi novedadnomiAux:this.novedadnomiLogic.getNovedadNomis()) {
				
						if(sTipoSeleccionar.equals(NovedadNomiConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							novedadnomiAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NovedadNomiConstantesFunciones.LABEL_NUMEROHORA)) {
							existe=true;
							novedadnomiAux.setnumero_hora(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NovedadNomiConstantesFunciones.LABEL_NUMEROMINUTO)) {
							existe=true;
							novedadnomiAux.setnumero_minuto(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NovedadNomiConstantesFunciones.LABEL_NUMEROJORNADATRABAJO)) {
							existe=true;
							novedadnomiAux.setnumero_jornada_trabajo(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NovedadNomiConstantesFunciones.LABEL_ANIOVACACION)) {
							existe=true;
							novedadnomiAux.setanio_vacacion(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NovedadNomiConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							novedadnomiAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NovedadNomi novedadnomiAux:novedadnomis) {
					
						if(sTipoSeleccionar.equals(NovedadNomiConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							novedadnomiAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NovedadNomiConstantesFunciones.LABEL_NUMEROHORA)) {
							existe=true;
							novedadnomiAux.setnumero_hora(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NovedadNomiConstantesFunciones.LABEL_NUMEROMINUTO)) {
							existe=true;
							novedadnomiAux.setnumero_minuto(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NovedadNomiConstantesFunciones.LABEL_NUMEROJORNADATRABAJO)) {
							existe=true;
							novedadnomiAux.setnumero_jornada_trabajo(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NovedadNomiConstantesFunciones.LABEL_ANIOVACACION)) {
							existe=true;
							novedadnomiAux.setanio_vacacion(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NovedadNomiConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							novedadnomiAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaNovedadNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesNovedadNomiActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingNovedadNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioNovedadNomi=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesNovedadNomi.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormNovedadNomi.jComboBoxTiposAccionesFormularioNovedadNomi.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteNovedadNomi) {				
					conSplash=true;//false;										
					
					//this.startProcessNovedadNomi(conSplash);
				
					this.generarReporteNovedadNomisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNovedadNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNovedadNomi.jComboBoxTiposAccionesFormularioNovedadNomi.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoNovedadNomisSeleccionados();
				//this.jComboBoxTiposAccionesNovedadNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoNovedadNomisSeleccionados(false);
				//this.jComboBoxTiposAccionesNovedadNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoNovedadNomisSeleccionados(true);
				//this.jComboBoxTiposAccionesNovedadNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessNovedadNomi();
				
				this.exportarNovedadNomisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNovedadNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNovedadNomi.jComboBoxTiposAccionesFormularioNovedadNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionNovedadNomis();
				//this.importarNovedadNomis();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNovedadNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNovedadNomi.jComboBoxTiposAccionesFormularioNovedadNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessNovedadNomi();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelNovedadNomisSeleccionados();
				//this.jComboBoxTiposAccionesNovedadNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Novedad Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessNovedadNomi();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoNovedadNomi)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyNovedadNomi(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Novedad Nomi",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNovedadNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNovedadNomi.jComboBoxTiposAccionesFormularioNovedadNomi.setSelectedIndex(0);					
				}	
			} 			
			else if(NovedadNomiBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteNovedadNomi) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessNovedadNomi(conSplash);
					
						//this.actualizarParametrosGeneralNovedadNomi();
						
						this.generarReporteProcesoAccionNovedadNomisSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesNovedadNomi.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormNovedadNomi.jComboBoxTiposAccionesFormularioNovedadNomi.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(NovedadNomiBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Novedad NomiS SELECCIONADOS?", "MANTENIMIENTO DE Novedad Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessNovedadNomi();
				
						this.actualizarParametrosGeneralNovedadNomi();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.novedadnomiReturnGeneral=novedadnomiLogic.procesarAccionNovedadNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.novedadnomiLogic.getNovedadNomis(),this.novedadnomiParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarNovedadNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesNovedadNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormNovedadNomi.jComboBoxTiposAccionesFormularioNovedadNomi.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralNovedadNomi();
					
					NovedadNomiBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarNovedadNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesNovedadNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormNovedadNomi.jComboBoxTiposAccionesFormularioNovedadNomi.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessNovedadNomi(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesNovedadNomiActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessNovedadNomi();
			
			if(this.jInternalFrameDetalleFormNovedadNomi==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<NovedadNomi> novedadnomisSeleccionados=new ArrayList<NovedadNomi>();		
			NovedadNomi novedadnomi=new NovedadNomi();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingNovedadNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesNovedadNomi.getSelectedItem();
			
			
			
			
			novedadnomisSeleccionados=this.getNovedadNomisSeleccionados(true);
			//this.sTipoAccion;
			
			if(novedadnomisSeleccionados.size()==1) {
				for(NovedadNomi novedadnomiAux:novedadnomisSeleccionados) {
					novedadnomi=novedadnomiAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessNovedadNomi();
			
      		//this.finishProcessNovedadNomi(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarNovedadNomiReturnGeneral() throws Exception {
		if(this.novedadnomiReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.novedadnomiReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.novedadnomiReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.novedadnomiReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.novedadnomiReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.novedadnomiReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingNovedadNomi(false);
		}
		
		if(this.novedadnomiReturnGeneral.getConRetornoLista() || this.novedadnomiReturnGeneral.getConRetornoObjeto()) {
			if(this.novedadnomiReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.novedadnomiLogic.setNovedadNomis(this.novedadnomiReturnGeneral.getNovedadNomis());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.novedadnomiReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.novedadnomiLogic.setNovedadNomi(this.novedadnomiReturnGeneral.getNovedadNomi());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingNovedadNomi(false);
		}
	}
	
	public void actualizarParametrosGeneralNovedadNomi() throws Exception {
		
		
	}
	
	public ArrayList<NovedadNomi> getNovedadNomisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<NovedadNomi> novedadnomisSeleccionados=new ArrayList<NovedadNomi>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioNovedadNomi) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(NovedadNomi novedadnomiAux:novedadnomiLogic.getNovedadNomis()) {
					if(novedadnomiAux.getIsSelected()) {
						novedadnomisSeleccionados.add(novedadnomiAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NovedadNomi novedadnomiAux:this.novedadnomis) {
					if(novedadnomiAux.getIsSelected()) {
						novedadnomisSeleccionados.add(novedadnomiAux);				
					}
				}
			}
			
			if(novedadnomisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						novedadnomisSeleccionados.addAll(this.novedadnomiLogic.getNovedadNomis());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						novedadnomisSeleccionados.addAll(this.novedadnomis);				
					}
				}
			}
		} else {
			novedadnomisSeleccionados.add(this.novedadnomi);
		}
		
		return novedadnomisSeleccionados;
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
	
	public void generarReporteNovedadNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalNovedadNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoNovedadNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoNovedadNomisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoNovedadNomisSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Novedad Nomi",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesNovedadNomisSeleccionados() throws Exception {
		ArrayList<NovedadNomi> novedadnomisSeleccionados=new ArrayList<NovedadNomi>();		
		
		novedadnomisSeleccionados=this.getNovedadNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteNovedadNomis("Todos",novedadnomisSeleccionados);
		
	}	
	
	public void generarReporteNormalNovedadNomisSeleccionados() throws Exception {
		ArrayList<NovedadNomi> novedadnomisSeleccionados=new ArrayList<NovedadNomi>();		
		
		novedadnomisSeleccionados=this.getNovedadNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteNovedadNomis("Todos",novedadnomisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionNovedadNomisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<NovedadNomi> novedadnomisSeleccionados=new ArrayList<NovedadNomi>();
		
		novedadnomisSeleccionados=this.getNovedadNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteNovedadNomis("Todos",novedadnomisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoNovedadNomisSeleccionados() throws Exception {
		ArrayList<NovedadNomi> novedadnomisSeleccionados=new ArrayList<NovedadNomi>();		
		
		
		this.abrirInicializarFrameReporteDinamicoNovedadNomi();
		
		
		novedadnomisSeleccionados=this.getNovedadNomisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoNovedadNomi();
		
		
		//this.generarReporteNovedadNomis("Todos",novedadnomisSeleccionados ,novedadnomiImplementable,novedadnomiImplementableHome);
	}
	
	public void mostrarImportacionNovedadNomis() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionNovedadNomi();
		
		this.abrirFrameImportacionNovedadNomi();		
		
			
		//this.generarReporteNovedadNomis("Todos",novedadnomisSeleccionados ,novedadnomiImplementable,novedadnomiImplementableHome);
	}
	
	public void importarNovedadNomis() throws Exception {		
	
	}
	
	public void exportarNovedadNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelNovedadNomisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoNovedadNomisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlNovedadNomisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Novedad Nomi",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoNovedadNomisSeleccionados() throws Exception {
		ArrayList<NovedadNomi> novedadnomisSeleccionados=new ArrayList<NovedadNomi>();		
		
		novedadnomisSeleccionados=this.getNovedadNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"novedadnomi."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarNovedadNomi(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(NovedadNomi novedadnomiAux:novedadnomisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarNovedadNomi(novedadnomiAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//novedadnomiAux.setsDetalleGeneralEntityReporte(novedadnomiAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarNovedadNomi(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=NovedadNomiConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadNomiConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadNomiConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadNomiConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadNomiConstantesFunciones.LABEL_IDEMPLEADOAUTORIZA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadNomiConstantesFunciones.LABEL_IDTIPONOVEDADNOMI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadNomiConstantesFunciones.LABEL_IDESTADONOVEDADNOMI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadNomiConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadNomiConstantesFunciones.LABEL_NUMEROHORA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadNomiConstantesFunciones.LABEL_NUMEROMINUTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadNomiConstantesFunciones.LABEL_NUMEROJORNADATRABAJO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadNomiConstantesFunciones.LABEL_ANIOVACACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadNomiConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarNovedadNomi(NovedadNomi novedadnomi,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=novedadnomi.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=novedadnomi.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedadnomi.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedadnomi.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedadnomi.getempleadoautoriza_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedadnomi.gettiponovedadnomi_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedadnomi.getestadonovedadnomi_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedadnomi.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedadnomi.getnumero_hora().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedadnomi.getnumero_minuto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedadnomi.getnumero_jornada_trabajo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedadnomi.getanio_vacacion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedadnomi.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelNovedadNomisSeleccionados() throws Exception {
		ArrayList<NovedadNomi> novedadnomisSeleccionados=new ArrayList<NovedadNomi>();		
		
		novedadnomisSeleccionados=this.getNovedadNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"novedadnomi.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("NovedadNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelNovedadNomi(row);				
				iRow++;
			}				
			
			for(NovedadNomi novedadnomiAux:novedadnomisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelNovedadNomi(novedadnomiAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlNovedadNomisSeleccionados() throws Exception {
		ArrayList<NovedadNomi> novedadnomisSeleccionados=new ArrayList<NovedadNomi>();		
		
		novedadnomisSeleccionados=this.getNovedadNomisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"novedadnomi.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("novedadnomis");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("novedadnomi");
			//elementRoot.appendChild(element);
		
			for(NovedadNomi novedadnomiAux:novedadnomisSeleccionados) {
				element = document.createElement("novedadnomi");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlNovedadNomi(novedadnomiAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelNovedadNomi(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_IDEMPLEADOAUTORIZA);
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_IDTIPONOVEDADNOMI);
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_IDESTADONOVEDADNOMI);
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_NUMEROHORA);
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_NUMEROMINUTO);
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_NUMEROJORNADATRABAJO);
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_ANIOVACACION);
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadNomiConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelNovedadNomi(NovedadNomi novedadnomi,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(novedadnomi.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(novedadnomi.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(novedadnomi.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(novedadnomi.getempleadoautoriza_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(novedadnomi.gettiponovedadnomi_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(novedadnomi.getestadonovedadnomi_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(novedadnomi.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(novedadnomi.getnumero_hora());
		cell = row.createCell(iColumn++);cell.setCellValue(novedadnomi.getnumero_minuto());
		cell = row.createCell(iColumn++);cell.setCellValue(novedadnomi.getnumero_jornada_trabajo());
		cell = row.createCell(iColumn++);cell.setCellValue(novedadnomi.getanio_vacacion());
		cell = row.createCell(iColumn++);cell.setCellValue(novedadnomi.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlNovedadNomi(NovedadNomi novedadnomi,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(NovedadNomiConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(novedadnomi.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(NovedadNomiConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(novedadnomi.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(NovedadNomiConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(novedadnomi.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempleado_descripcion = document.createElement(NovedadNomiConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(novedadnomi.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementempleadoautoriza_descripcion = document.createElement(NovedadNomiConstantesFunciones.IDEMPLEADOAUTORIZA);
		elementempleadoautoriza_descripcion.appendChild(document.createTextNode(novedadnomi.getempleadoautoriza_descripcion()));
		element.appendChild(elementempleadoautoriza_descripcion);

		Element elementtiponovedadnomi_descripcion = document.createElement(NovedadNomiConstantesFunciones.IDTIPONOVEDADNOMI);
		elementtiponovedadnomi_descripcion.appendChild(document.createTextNode(novedadnomi.gettiponovedadnomi_descripcion()));
		element.appendChild(elementtiponovedadnomi_descripcion);

		Element elementestadonovedadnomi_descripcion = document.createElement(NovedadNomiConstantesFunciones.IDESTADONOVEDADNOMI);
		elementestadonovedadnomi_descripcion.appendChild(document.createTextNode(novedadnomi.getestadonovedadnomi_descripcion()));
		element.appendChild(elementestadonovedadnomi_descripcion);

		Element elementfecha = document.createElement(NovedadNomiConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(novedadnomi.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementnumero_hora = document.createElement(NovedadNomiConstantesFunciones.NUMEROHORA);
		elementnumero_hora.appendChild(document.createTextNode(novedadnomi.getnumero_hora().toString().trim()));
		element.appendChild(elementnumero_hora);

		Element elementnumero_minuto = document.createElement(NovedadNomiConstantesFunciones.NUMEROMINUTO);
		elementnumero_minuto.appendChild(document.createTextNode(novedadnomi.getnumero_minuto().toString().trim()));
		element.appendChild(elementnumero_minuto);

		Element elementnumero_jornada_trabajo = document.createElement(NovedadNomiConstantesFunciones.NUMEROJORNADATRABAJO);
		elementnumero_jornada_trabajo.appendChild(document.createTextNode(novedadnomi.getnumero_jornada_trabajo().toString().trim()));
		element.appendChild(elementnumero_jornada_trabajo);

		Element elementanio_vacacion = document.createElement(NovedadNomiConstantesFunciones.ANIOVACACION);
		elementanio_vacacion.appendChild(document.createTextNode(novedadnomi.getanio_vacacion().toString().trim()));
		element.appendChild(elementanio_vacacion);

		Element elementdescripcion = document.createElement(NovedadNomiConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(novedadnomi.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoNovedadNomisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<NovedadNomi> novedadnomisSeleccionados=new ArrayList<NovedadNomi>();
		
		novedadnomisSeleccionados=this.getNovedadNomisSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoNovedadNomi(novedadnomisSeleccionados);
		
		this.generarReporteNovedadNomis("Todos",novedadnomisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoNovedadNomi(ArrayList<NovedadNomi> novedadnomisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(NovedadNomi novedadnomiAux:novedadnomisSeleccionados) {
				novedadnomiAux.setsDetalleGeneralEntityReporte(novedadnomiAux.toString());
			
				if(sTipoSeleccionar.equals(NovedadNomiConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					novedadnomiAux.setsDescripcionGeneralEntityReporte1(novedadnomiAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(NovedadNomiConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					novedadnomiAux.setsDescripcionGeneralEntityReporte1(novedadnomiAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(NovedadNomiConstantesFunciones.LABEL_IDEMPLEADOAUTORIZA)) {
					existe=true;
					novedadnomiAux.setsDescripcionGeneralEntityReporte1(novedadnomiAux.getempleadoautoriza_descripcion());
				}
				 else if(sTipoSeleccionar.equals(NovedadNomiConstantesFunciones.LABEL_IDTIPONOVEDADNOMI)) {
					existe=true;
					novedadnomiAux.setsDescripcionGeneralEntityReporte1(novedadnomiAux.gettiponovedadnomi_descripcion());
				}
				 else if(sTipoSeleccionar.equals(NovedadNomiConstantesFunciones.LABEL_IDESTADONOVEDADNOMI)) {
					existe=true;
					novedadnomiAux.setsDescripcionGeneralEntityReporte1(novedadnomiAux.getestadonovedadnomi_descripcion());
				}
				 else if(sTipoSeleccionar.equals(NovedadNomiConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					novedadnomiAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(novedadnomiAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(NovedadNomiConstantesFunciones.LABEL_NUMEROHORA)) {
					existe=true;
					novedadnomiAux.setsDescripcionGeneralEntityReporte1(novedadnomiAux.getnumero_hora().toString());
				}
				 else if(sTipoSeleccionar.equals(NovedadNomiConstantesFunciones.LABEL_NUMEROMINUTO)) {
					existe=true;
					novedadnomiAux.setsDescripcionGeneralEntityReporte1(novedadnomiAux.getnumero_minuto().toString());
				}
				 else if(sTipoSeleccionar.equals(NovedadNomiConstantesFunciones.LABEL_NUMEROJORNADATRABAJO)) {
					existe=true;
					novedadnomiAux.setsDescripcionGeneralEntityReporte1(novedadnomiAux.getnumero_jornada_trabajo().toString());
				}
				 else if(sTipoSeleccionar.equals(NovedadNomiConstantesFunciones.LABEL_ANIOVACACION)) {
					existe=true;
					novedadnomiAux.setsDescripcionGeneralEntityReporte1(novedadnomiAux.getanio_vacacion().toString());
				}
				 else if(sTipoSeleccionar.equals(NovedadNomiConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					novedadnomiAux.setsDescripcionGeneralEntityReporte1(novedadnomiAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesNovedadNomi(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoNovedadNomi=true;
				this.isVisibilidadCeldaNuevoRelacionesNovedadNomi=true;
				this.isVisibilidadCeldaGuardarCambiosNovedadNomi=true;
			}
			
			this.isVisibilidadCeldaModificarNovedadNomi=false;
			this.isVisibilidadCeldaActualizarNovedadNomi=false;
			this.isVisibilidadCeldaEliminarNovedadNomi=false;
			this.isVisibilidadCeldaCancelarNovedadNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNovedadNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarNovedadNomi=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoNovedadNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesNovedadNomi=false;
			this.isVisibilidadCeldaGuardarCambiosNovedadNomi=false;
			this.isVisibilidadCeldaModificarNovedadNomi=false;
			this.isVisibilidadCeldaActualizarNovedadNomi=true;
			this.isVisibilidadCeldaEliminarNovedadNomi=false;
			this.isVisibilidadCeldaCancelarNovedadNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNovedadNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarNovedadNomi=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoNovedadNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesNovedadNomi=false;
			this.isVisibilidadCeldaGuardarCambiosNovedadNomi=false;
			this.isVisibilidadCeldaModificarNovedadNomi=false;
			this.isVisibilidadCeldaActualizarNovedadNomi=true;
			this.isVisibilidadCeldaEliminarNovedadNomi=true;
			this.isVisibilidadCeldaCancelarNovedadNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNovedadNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarNovedadNomi=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoNovedadNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesNovedadNomi=false;
			this.isVisibilidadCeldaGuardarCambiosNovedadNomi=false;
			this.isVisibilidadCeldaModificarNovedadNomi=false;
			this.isVisibilidadCeldaActualizarNovedadNomi=true;
			this.isVisibilidadCeldaEliminarNovedadNomi=false;
			this.isVisibilidadCeldaCancelarNovedadNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNovedadNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarNovedadNomi=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoNovedadNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesNovedadNomi=true;
			this.isVisibilidadCeldaGuardarCambiosNovedadNomi=true;
			this.isVisibilidadCeldaModificarNovedadNomi=false;
			this.isVisibilidadCeldaActualizarNovedadNomi=false;
			this.isVisibilidadCeldaEliminarNovedadNomi=false;
			this.isVisibilidadCeldaCancelarNovedadNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNovedadNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarNovedadNomi=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoNovedadNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesNovedadNomi=false;
			this.isVisibilidadCeldaGuardarCambiosNovedadNomi=false;
			this.isVisibilidadCeldaActualizarNovedadNomi=false;
			this.isVisibilidadCeldaEliminarNovedadNomi=false;
			this.isVisibilidadCeldaCancelarNovedadNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNovedadNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarNovedadNomi=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoNovedadNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesNovedadNomi=false;
			this.isVisibilidadCeldaGuardarCambiosNovedadNomi=false;
			this.isVisibilidadCeldaModificarNovedadNomi=true;
			this.isVisibilidadCeldaActualizarNovedadNomi=false;
			this.isVisibilidadCeldaEliminarNovedadNomi=false;
			this.isVisibilidadCeldaCancelarNovedadNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNovedadNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarNovedadNomi=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(NovedadNomiJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoNovedadNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesNovedadNomi=true;
			this.isVisibilidadCeldaGuardarCambiosNovedadNomi=true;
		} else {
			this.actualizarEstadoPanelsNovedadNomi(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarNovedadNomi=false;
			//this.isVisibilidadCeldaVerFormNovedadNomi=false;
			this.isVisibilidadCeldaDuplicarNovedadNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!novedadnomiSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesNovedadNomi=false;
		} else {
			this.isVisibilidadCeldaNuevoNovedadNomi=false;
			this.isVisibilidadCeldaGuardarCambiosNovedadNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(novedadnomiSessionBean.getEsGuardarRelacionado()) {
			if(!novedadnomiSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesNovedadNomi=false;												
			}
			
			this.jButtonCerrarNovedadNomi.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesNovedadNomi=false;
		}
		
		if(!this.permiteMantenimiento(this.novedadnomi)) {
			this.isVisibilidadCeldaActualizarNovedadNomi=false;
			this.isVisibilidadCeldaEliminarNovedadNomi=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesNovedadNomi() {
	}
	
	public void actualizarEstadoPanelsNovedadNomi(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionNovedadNomi!=null) {
				this.jScrollPanelDatosEdicionNovedadNomi.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedadNomi!=null) {
				this.jTabbedPaneBusquedasNovedadNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNovedadNomi!=null) {
				this.jScrollPanelDatosNovedadNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionNovedadNomi!=null) {
				this.jPanelPaginacionNovedadNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNovedadNomi!=null) {
				this.jPanelParametrosReportesNovedadNomi.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionNovedadNomi!=null) {
				this.jScrollPanelDatosEdicionNovedadNomi.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedadNomi!=null) {
				this.jTabbedPaneBusquedasNovedadNomi.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosNovedadNomi!=null) {
				this.jScrollPanelDatosNovedadNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionNovedadNomi!=null) {
				this.jPanelPaginacionNovedadNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNovedadNomi!=null) {
				this.jPanelParametrosReportesNovedadNomi.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionNovedadNomi!=null) {
				this.jScrollPanelDatosEdicionNovedadNomi.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedadNomi!=null) {
				this.jTabbedPaneBusquedasNovedadNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosNovedadNomi!=null) {
				this.jScrollPanelDatosNovedadNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionNovedadNomi!=null) {
				this.jPanelPaginacionNovedadNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNovedadNomi!=null) {
				this.jPanelParametrosReportesNovedadNomi.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionNovedadNomi!=null) {
				this.jScrollPanelDatosEdicionNovedadNomi.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedadNomi!=null) {
				this.jTabbedPaneBusquedasNovedadNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosNovedadNomi!=null) {
				this.jScrollPanelDatosNovedadNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionNovedadNomi!=null) {
				this.jPanelPaginacionNovedadNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNovedadNomi!=null) {
				this.jPanelParametrosReportesNovedadNomi.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionNovedadNomi!=null) {
				this.jScrollPanelDatosEdicionNovedadNomi.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedadNomi!=null) {
				this.jTabbedPaneBusquedasNovedadNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNovedadNomi!=null) {
				this.jScrollPanelDatosNovedadNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionNovedadNomi!=null) {
				this.jPanelPaginacionNovedadNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNovedadNomi!=null) {
				this.jPanelParametrosReportesNovedadNomi.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionNovedadNomi!=null) {
				this.jScrollPanelDatosEdicionNovedadNomi.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedadNomi!=null) {
				this.jTabbedPaneBusquedasNovedadNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNovedadNomi!=null) {
				this.jScrollPanelDatosNovedadNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionNovedadNomi!=null) {
				this.jPanelPaginacionNovedadNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNovedadNomi!=null) {
				this.jPanelParametrosReportesNovedadNomi.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionNovedadNomi!=null) {
				this.jScrollPanelDatosEdicionNovedadNomi.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedadNomi!=null) {
				this.jTabbedPaneBusquedasNovedadNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNovedadNomi!=null) {
				this.jScrollPanelDatosNovedadNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionNovedadNomi!=null) {
				this.jPanelPaginacionNovedadNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNovedadNomi!=null) {
				this.jPanelParametrosReportesNovedadNomi.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.novedadnomiSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasNovedadNomi!=null) {
					this.jTabbedPaneBusquedasNovedadNomi.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesNovedadNomi!=null) {
				this.jPanelParametrosReportesNovedadNomi.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.novedadnomiSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedadNomi!=null) {
				this.jTabbedPaneBusquedasNovedadNomi.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesNovedadNomi!=null) {
				this.jPanelParametrosReportesNovedadNomi.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasNovedadNomi.remove(jPanelFK_IdEmpleadoNovedadNomi);}

			this.isVisibilidadFK_IdEmpleadoAutoriza=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleadoAutoriza) {this.jTabbedPaneBusquedasNovedadNomi.remove(jPanelFK_IdEmpleadoAutorizaNovedadNomi);}

			this.isVisibilidadFK_IdEstadoNovedadNomi=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstadoNovedadNomi) {this.jTabbedPaneBusquedasNovedadNomi.remove(jPanelFK_IdEstadoNovedadNomiNovedadNomi);}

			this.isVisibilidadFK_IdTipoNovedadNomi=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoNovedadNomi) {this.jTabbedPaneBusquedasNovedadNomi.remove(jPanelFK_IdTipoNovedadNomiNovedadNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasNovedadNomi.remove(jPanelFK_IdEmpleadoNovedadNomi);}

			this.isVisibilidadFK_IdEmpleadoAutoriza=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEmpleadoAutoriza) {this.jTabbedPaneBusquedasNovedadNomi.remove(jPanelFK_IdEmpleadoAutorizaNovedadNomi);}

			this.isVisibilidadFK_IdEstadoNovedadNomi=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEstadoNovedadNomi) {this.jTabbedPaneBusquedasNovedadNomi.remove(jPanelFK_IdEstadoNovedadNomiNovedadNomi);}

			this.isVisibilidadFK_IdTipoNovedadNomi=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdTipoNovedadNomi) {this.jTabbedPaneBusquedasNovedadNomi.remove(jPanelFK_IdTipoNovedadNomiNovedadNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleadoAutoriza(Boolean isParaEmpleadoAutoriza){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoAutorizaNegation=!isParaEmpleadoAutoriza;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleadoAutorizaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasNovedadNomi.remove(jPanelFK_IdEmpleadoNovedadNomi);}

			this.isVisibilidadFK_IdEmpleadoAutoriza=isParaEmpleadoAutoriza;
			if(!this.isVisibilidadFK_IdEmpleadoAutoriza) {this.jTabbedPaneBusquedasNovedadNomi.remove(jPanelFK_IdEmpleadoAutorizaNovedadNomi);}

			this.isVisibilidadFK_IdEstadoNovedadNomi=isParaEmpleadoAutorizaNegation;
			if(!this.isVisibilidadFK_IdEstadoNovedadNomi) {this.jTabbedPaneBusquedasNovedadNomi.remove(jPanelFK_IdEstadoNovedadNomiNovedadNomi);}

			this.isVisibilidadFK_IdTipoNovedadNomi=isParaEmpleadoAutorizaNegation;
			if(!this.isVisibilidadFK_IdTipoNovedadNomi) {this.jTabbedPaneBusquedasNovedadNomi.remove(jPanelFK_IdTipoNovedadNomiNovedadNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoNovedadNomi(Boolean isParaTipoNovedadNomi){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoNovedadNomiNegation=!isParaTipoNovedadNomi;

			this.isVisibilidadFK_IdEmpleado=isParaTipoNovedadNomiNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasNovedadNomi.remove(jPanelFK_IdEmpleadoNovedadNomi);}

			this.isVisibilidadFK_IdEmpleadoAutoriza=isParaTipoNovedadNomiNegation;
			if(!this.isVisibilidadFK_IdEmpleadoAutoriza) {this.jTabbedPaneBusquedasNovedadNomi.remove(jPanelFK_IdEmpleadoAutorizaNovedadNomi);}

			this.isVisibilidadFK_IdEstadoNovedadNomi=isParaTipoNovedadNomiNegation;
			if(!this.isVisibilidadFK_IdEstadoNovedadNomi) {this.jTabbedPaneBusquedasNovedadNomi.remove(jPanelFK_IdEstadoNovedadNomiNovedadNomi);}

			this.isVisibilidadFK_IdTipoNovedadNomi=isParaTipoNovedadNomi;
			if(!this.isVisibilidadFK_IdTipoNovedadNomi) {this.jTabbedPaneBusquedasNovedadNomi.remove(jPanelFK_IdTipoNovedadNomiNovedadNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstadoNovedadNomi(Boolean isParaEstadoNovedadNomi){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstadoNovedadNomiNegation=!isParaEstadoNovedadNomi;

			this.isVisibilidadFK_IdEmpleado=isParaEstadoNovedadNomiNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasNovedadNomi.remove(jPanelFK_IdEmpleadoNovedadNomi);}

			this.isVisibilidadFK_IdEmpleadoAutoriza=isParaEstadoNovedadNomiNegation;
			if(!this.isVisibilidadFK_IdEmpleadoAutoriza) {this.jTabbedPaneBusquedasNovedadNomi.remove(jPanelFK_IdEmpleadoAutorizaNovedadNomi);}

			this.isVisibilidadFK_IdEstadoNovedadNomi=isParaEstadoNovedadNomi;
			if(!this.isVisibilidadFK_IdEstadoNovedadNomi) {this.jTabbedPaneBusquedasNovedadNomi.remove(jPanelFK_IdEstadoNovedadNomiNovedadNomi);}

			this.isVisibilidadFK_IdTipoNovedadNomi=isParaEstadoNovedadNomiNegation;
			if(!this.isVisibilidadFK_IdTipoNovedadNomi) {this.jTabbedPaneBusquedasNovedadNomi.remove(jPanelFK_IdTipoNovedadNomiNovedadNomi);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//NovedadNomiSessionBean novedadnomiSessionBean=new NovedadNomiSessionBean();
		
		if(this.novedadnomiSessionBean==null) {
			this.novedadnomiSessionBean=new NovedadNomiSessionBean();
		}
		
		this.novedadnomiSessionBean.setsUltimaBusquedaNovedadNomi(this.getsAccionBusqueda());
		this.novedadnomiSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.novedadnomiSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			novedadnomiSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleadoAutoriza")) {
			novedadnomiSessionBean.setid_empleado_autoriza(this.getid_empleado_autorizaFK_IdEmpleadoAutoriza());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			novedadnomiSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstadoNovedadNomi")) {
			novedadnomiSessionBean.setid_estado_novedad_nomi(this.getid_estado_novedad_nomiFK_IdEstadoNovedadNomi());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoNovedadNomi")) {
			novedadnomiSessionBean.setid_tipo_novedad_nomi(this.getid_tipo_novedad_nomiFK_IdTipoNovedadNomi());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//NovedadNomiSessionBean novedadnomiSessionBean=new NovedadNomiSessionBean();
		
		if(this.novedadnomiSessionBean==null) {
			this.novedadnomiSessionBean=new NovedadNomiSessionBean();
		}
		
		if(this.novedadnomiSessionBean.getsUltimaBusquedaNovedadNomi()!=null&&!this.novedadnomiSessionBean.getsUltimaBusquedaNovedadNomi().equals("")) {
			this.setsAccionBusqueda(novedadnomiSessionBean.getsUltimaBusquedaNovedadNomi());
			this.setiNumeroPaginacion(novedadnomiSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(novedadnomiSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(novedadnomiSessionBean.getid_empleado());
				novedadnomiSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleadoAutoriza")) {
				this.setid_empleado_autorizaFK_IdEmpleadoAutoriza(novedadnomiSessionBean.getid_empleado_autoriza());
				novedadnomiSessionBean.setid_empleado_autoriza(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(novedadnomiSessionBean.getid_empresa());
				novedadnomiSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstadoNovedadNomi")) {
				this.setid_estado_novedad_nomiFK_IdEstadoNovedadNomi(novedadnomiSessionBean.getid_estado_novedad_nomi());
				novedadnomiSessionBean.setid_estado_novedad_nomi(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoNovedadNomi")) {
				this.setid_tipo_novedad_nomiFK_IdTipoNovedadNomi(novedadnomiSessionBean.getid_tipo_novedad_nomi());
				novedadnomiSessionBean.setid_tipo_novedad_nomi(-1L);
			}
		}
		
		this.novedadnomiSessionBean.setsUltimaBusquedaNovedadNomi("");
		this.novedadnomiSessionBean.setiNumeroPaginacion(NovedadNomiConstantesFunciones.INUMEROPAGINACION);
		this.novedadnomiSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaNovedadNomi(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioNovedadNomi() {
		this.updateBorderResaltarBusquedasFormularioNovedadNomi();
		this.updateVisibilidadBusquedasFormularioNovedadNomi();
		this.updateHabilitarBusquedasFormularioNovedadNomi();
	}
	
	public void updateBorderResaltarBusquedasFormularioNovedadNomi() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasNovedadNomi.getComponents().length>0) {
	

		if(this.novedadnomiConstantesFunciones.resaltarFK_IdEmpleadoNovedadNomi!=null) {
			index= this.jTabbedPaneBusquedasNovedadNomi.indexOfComponent(this.jPanelFK_IdEmpleadoNovedadNomi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadNomi.getComponent(index);
				jPanel.setBorder(this.novedadnomiConstantesFunciones.resaltarFK_IdEmpleadoNovedadNomi);
			}
		}

		if(this.novedadnomiConstantesFunciones.resaltarFK_IdEmpleadoAutorizaNovedadNomi!=null) {
			index= this.jTabbedPaneBusquedasNovedadNomi.indexOfComponent(this.jPanelFK_IdEmpleadoAutorizaNovedadNomi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadNomi.getComponent(index);
				jPanel.setBorder(this.novedadnomiConstantesFunciones.resaltarFK_IdEmpleadoAutorizaNovedadNomi);
			}
		}

		if(this.novedadnomiConstantesFunciones.resaltarFK_IdEstadoNovedadNomiNovedadNomi!=null) {
			index= this.jTabbedPaneBusquedasNovedadNomi.indexOfComponent(this.jPanelFK_IdEstadoNovedadNomiNovedadNomi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadNomi.getComponent(index);
				jPanel.setBorder(this.novedadnomiConstantesFunciones.resaltarFK_IdEstadoNovedadNomiNovedadNomi);
			}
		}

		if(this.novedadnomiConstantesFunciones.resaltarFK_IdTipoNovedadNomiNovedadNomi!=null) {
			index= this.jTabbedPaneBusquedasNovedadNomi.indexOfComponent(this.jPanelFK_IdTipoNovedadNomiNovedadNomi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadNomi.getComponent(index);
				jPanel.setBorder(this.novedadnomiConstantesFunciones.resaltarFK_IdTipoNovedadNomiNovedadNomi);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioNovedadNomi() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasNovedadNomi.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasNovedadNomi.indexOfComponent(this.jPanelFK_IdEmpleadoNovedadNomi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadNomi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.novedadnomiConstantesFunciones.mostrarFK_IdEmpleadoNovedadNomi);
			if(!this.novedadnomiConstantesFunciones.mostrarFK_IdEmpleadoNovedadNomi && index>-1) {
				this.jTabbedPaneBusquedasNovedadNomi.remove(index);
			}

			index= this.jTabbedPaneBusquedasNovedadNomi.indexOfComponent(this.jPanelFK_IdEmpleadoAutorizaNovedadNomi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadNomi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.novedadnomiConstantesFunciones.mostrarFK_IdEmpleadoAutorizaNovedadNomi);
			if(!this.novedadnomiConstantesFunciones.mostrarFK_IdEmpleadoAutorizaNovedadNomi && index>-1) {
				this.jTabbedPaneBusquedasNovedadNomi.remove(index);
			}

			index= this.jTabbedPaneBusquedasNovedadNomi.indexOfComponent(this.jPanelFK_IdEstadoNovedadNomiNovedadNomi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadNomi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.novedadnomiConstantesFunciones.mostrarFK_IdEstadoNovedadNomiNovedadNomi);
			if(!this.novedadnomiConstantesFunciones.mostrarFK_IdEstadoNovedadNomiNovedadNomi && index>-1) {
				this.jTabbedPaneBusquedasNovedadNomi.remove(index);
			}

			index= this.jTabbedPaneBusquedasNovedadNomi.indexOfComponent(this.jPanelFK_IdTipoNovedadNomiNovedadNomi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadNomi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.novedadnomiConstantesFunciones.mostrarFK_IdTipoNovedadNomiNovedadNomi);
			if(!this.novedadnomiConstantesFunciones.mostrarFK_IdTipoNovedadNomiNovedadNomi && index>-1) {
				this.jTabbedPaneBusquedasNovedadNomi.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioNovedadNomi() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasNovedadNomi.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasNovedadNomi.indexOfComponent(this.jPanelFK_IdEmpleadoNovedadNomi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadNomi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.novedadnomiConstantesFunciones.activarFK_IdEmpleadoNovedadNomi);
				this.jTabbedPaneBusquedasNovedadNomi.setEnabledAt(index,this.novedadnomiConstantesFunciones.activarFK_IdEmpleadoNovedadNomi);
			}

			index= this.jTabbedPaneBusquedasNovedadNomi.indexOfComponent(this.jPanelFK_IdEmpleadoAutorizaNovedadNomi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadNomi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.novedadnomiConstantesFunciones.activarFK_IdEmpleadoAutorizaNovedadNomi);
				this.jTabbedPaneBusquedasNovedadNomi.setEnabledAt(index,this.novedadnomiConstantesFunciones.activarFK_IdEmpleadoAutorizaNovedadNomi);
			}

			index= this.jTabbedPaneBusquedasNovedadNomi.indexOfComponent(this.jPanelFK_IdEstadoNovedadNomiNovedadNomi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadNomi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.novedadnomiConstantesFunciones.activarFK_IdEstadoNovedadNomiNovedadNomi);
				this.jTabbedPaneBusquedasNovedadNomi.setEnabledAt(index,this.novedadnomiConstantesFunciones.activarFK_IdEstadoNovedadNomiNovedadNomi);
			}

			index= this.jTabbedPaneBusquedasNovedadNomi.indexOfComponent(this.jPanelFK_IdTipoNovedadNomiNovedadNomi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadNomi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.novedadnomiConstantesFunciones.activarFK_IdTipoNovedadNomiNovedadNomi);
				this.jTabbedPaneBusquedasNovedadNomi.setEnabledAt(index,this.novedadnomiConstantesFunciones.activarFK_IdTipoNovedadNomiNovedadNomi);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaNovedadNomi(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasNovedadNomi.indexOfComponent(this.jPanelFK_IdEmpleadoNovedadNomi);

			this.jTabbedPaneBusquedasNovedadNomi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadNomi.getComponent(index);

			this.novedadnomiConstantesFunciones.setResaltarFK_IdEmpleadoNovedadNomi(resaltar);

			jPanel.setBorder(this.novedadnomiConstantesFunciones.resaltarFK_IdEmpleadoNovedadNomi);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEmpleadoAutoriza")) {
			index= this.jTabbedPaneBusquedasNovedadNomi.indexOfComponent(this.jPanelFK_IdEmpleadoAutorizaNovedadNomi);

			this.jTabbedPaneBusquedasNovedadNomi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadNomi.getComponent(index);

			this.novedadnomiConstantesFunciones.setResaltarFK_IdEmpleadoAutorizaNovedadNomi(resaltar);

			jPanel.setBorder(this.novedadnomiConstantesFunciones.resaltarFK_IdEmpleadoAutorizaNovedadNomi);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstadoNovedadNomi")) {
			index= this.jTabbedPaneBusquedasNovedadNomi.indexOfComponent(this.jPanelFK_IdEstadoNovedadNomiNovedadNomi);

			this.jTabbedPaneBusquedasNovedadNomi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadNomi.getComponent(index);

			this.novedadnomiConstantesFunciones.setResaltarFK_IdEstadoNovedadNomiNovedadNomi(resaltar);

			jPanel.setBorder(this.novedadnomiConstantesFunciones.resaltarFK_IdEstadoNovedadNomiNovedadNomi);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoNovedadNomi")) {
			index= this.jTabbedPaneBusquedasNovedadNomi.indexOfComponent(this.jPanelFK_IdTipoNovedadNomiNovedadNomi);

			this.jTabbedPaneBusquedasNovedadNomi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNovedadNomi.getComponent(index);

			this.novedadnomiConstantesFunciones.setResaltarFK_IdTipoNovedadNomiNovedadNomi(resaltar);

			jPanel.setBorder(this.novedadnomiConstantesFunciones.resaltarFK_IdTipoNovedadNomiNovedadNomi);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarNovedadNomi.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioNovedadNomi() throws Exception {

		if(this.jInternalFrameDetalleFormNovedadNomi==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioNovedadNomi();
		this.updateVisibilidadResaltarControlesFormularioNovedadNomi();
		this.updateHabilitarResaltarControlesFormularioNovedadNomi();
		
	}
	
	public void updateBorderResaltarControlesFormularioNovedadNomi() throws Exception {
		if(this.jInternalFrameDetalleFormNovedadNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.novedadnomiConstantesFunciones.resaltaridNovedadNomi!=null && this.jInternalFrameDetalleFormNovedadNomi!=null) {this.jInternalFrameDetalleFormNovedadNomi.jLabelidNovedadNomi.setBorder(this.novedadnomiConstantesFunciones.resaltaridNovedadNomi);}
		if(this.novedadnomiConstantesFunciones.resaltarid_empresaNovedadNomi!=null && this.jInternalFrameDetalleFormNovedadNomi!=null) {this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empresaNovedadNomi.setBorder(this.novedadnomiConstantesFunciones.resaltarid_empresaNovedadNomi);}
		if(this.novedadnomiConstantesFunciones.resaltarid_empleadoNovedadNomi!=null && this.jInternalFrameDetalleFormNovedadNomi!=null) {this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empleadoNovedadNomi.setBorder(this.novedadnomiConstantesFunciones.resaltarid_empleadoNovedadNomi);}
		if(this.novedadnomiConstantesFunciones.resaltarid_empleado_autorizaNovedadNomi!=null && this.jInternalFrameDetalleFormNovedadNomi!=null) {this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empleado_autorizaNovedadNomi.setBorder(this.novedadnomiConstantesFunciones.resaltarid_empleado_autorizaNovedadNomi);}
		if(this.novedadnomiConstantesFunciones.resaltarid_tipo_novedad_nomiNovedadNomi!=null && this.jInternalFrameDetalleFormNovedadNomi!=null) {this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_tipo_novedad_nomiNovedadNomi.setBorder(this.novedadnomiConstantesFunciones.resaltarid_tipo_novedad_nomiNovedadNomi);}
		if(this.novedadnomiConstantesFunciones.resaltarid_estado_novedad_nomiNovedadNomi!=null && this.jInternalFrameDetalleFormNovedadNomi!=null) {this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_estado_novedad_nomiNovedadNomi.setBorder(this.novedadnomiConstantesFunciones.resaltarid_estado_novedad_nomiNovedadNomi);}
		if(this.novedadnomiConstantesFunciones.resaltarfechaNovedadNomi!=null && this.jInternalFrameDetalleFormNovedadNomi!=null) {this.jInternalFrameDetalleFormNovedadNomi.jDateChooserfechaNovedadNomi.setBorder(this.novedadnomiConstantesFunciones.resaltarfechaNovedadNomi);}
		if(this.novedadnomiConstantesFunciones.resaltarnumero_horaNovedadNomi!=null && this.jInternalFrameDetalleFormNovedadNomi!=null) {this.jInternalFrameDetalleFormNovedadNomi.jTextFieldnumero_horaNovedadNomi.setBorder(this.novedadnomiConstantesFunciones.resaltarnumero_horaNovedadNomi);}
		if(this.novedadnomiConstantesFunciones.resaltarnumero_minutoNovedadNomi!=null && this.jInternalFrameDetalleFormNovedadNomi!=null) {this.jInternalFrameDetalleFormNovedadNomi.jTextFieldnumero_minutoNovedadNomi.setBorder(this.novedadnomiConstantesFunciones.resaltarnumero_minutoNovedadNomi);}
		if(this.novedadnomiConstantesFunciones.resaltarnumero_jornada_trabajoNovedadNomi!=null && this.jInternalFrameDetalleFormNovedadNomi!=null) {this.jInternalFrameDetalleFormNovedadNomi.jTextFieldnumero_jornada_trabajoNovedadNomi.setBorder(this.novedadnomiConstantesFunciones.resaltarnumero_jornada_trabajoNovedadNomi);}
		if(this.novedadnomiConstantesFunciones.resaltaranio_vacacionNovedadNomi!=null && this.jInternalFrameDetalleFormNovedadNomi!=null) {this.jInternalFrameDetalleFormNovedadNomi.jTextFieldanio_vacacionNovedadNomi.setBorder(this.novedadnomiConstantesFunciones.resaltaranio_vacacionNovedadNomi);}
		if(this.novedadnomiConstantesFunciones.resaltardescripcionNovedadNomi!=null && this.jInternalFrameDetalleFormNovedadNomi!=null) {this.jInternalFrameDetalleFormNovedadNomi.jTextAreadescripcionNovedadNomi.setBorder(this.novedadnomiConstantesFunciones.resaltardescripcionNovedadNomi);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioNovedadNomi() throws Exception {		
		if(this.jInternalFrameDetalleFormNovedadNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
	
		//this.jInternalFrameDetalleFormNovedadNomi.jLabelidNovedadNomi.setVisible(this.novedadnomiConstantesFunciones.mostraridNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jPanelidNovedadNomi.setVisible(this.novedadnomiConstantesFunciones.mostraridNovedadNomi);
		//this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empresaNovedadNomi.setVisible(this.novedadnomiConstantesFunciones.mostrarid_empresaNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jPanelid_empresaNovedadNomi.setVisible(this.novedadnomiConstantesFunciones.mostrarid_empresaNovedadNomi);
		//this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empleadoNovedadNomi.setVisible(this.novedadnomiConstantesFunciones.mostrarid_empleadoNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jPanelid_empleadoNovedadNomi.setVisible(this.novedadnomiConstantesFunciones.mostrarid_empleadoNovedadNomi);
		//this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empleado_autorizaNovedadNomi.setVisible(this.novedadnomiConstantesFunciones.mostrarid_empleado_autorizaNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jPanelid_empleado_autorizaNovedadNomi.setVisible(this.novedadnomiConstantesFunciones.mostrarid_empleado_autorizaNovedadNomi);
		//this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_tipo_novedad_nomiNovedadNomi.setVisible(this.novedadnomiConstantesFunciones.mostrarid_tipo_novedad_nomiNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jPanelid_tipo_novedad_nomiNovedadNomi.setVisible(this.novedadnomiConstantesFunciones.mostrarid_tipo_novedad_nomiNovedadNomi);
		//this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_estado_novedad_nomiNovedadNomi.setVisible(this.novedadnomiConstantesFunciones.mostrarid_estado_novedad_nomiNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jPanelid_estado_novedad_nomiNovedadNomi.setVisible(this.novedadnomiConstantesFunciones.mostrarid_estado_novedad_nomiNovedadNomi);
		//this.jInternalFrameDetalleFormNovedadNomi.jDateChooserfechaNovedadNomi.setVisible(this.novedadnomiConstantesFunciones.mostrarfechaNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jPanelfechaNovedadNomi.setVisible(this.novedadnomiConstantesFunciones.mostrarfechaNovedadNomi);
		//this.jInternalFrameDetalleFormNovedadNomi.jTextFieldnumero_horaNovedadNomi.setVisible(this.novedadnomiConstantesFunciones.mostrarnumero_horaNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jPanelnumero_horaNovedadNomi.setVisible(this.novedadnomiConstantesFunciones.mostrarnumero_horaNovedadNomi);
		//this.jInternalFrameDetalleFormNovedadNomi.jTextFieldnumero_minutoNovedadNomi.setVisible(this.novedadnomiConstantesFunciones.mostrarnumero_minutoNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jPanelnumero_minutoNovedadNomi.setVisible(this.novedadnomiConstantesFunciones.mostrarnumero_minutoNovedadNomi);
		//this.jInternalFrameDetalleFormNovedadNomi.jTextFieldnumero_jornada_trabajoNovedadNomi.setVisible(this.novedadnomiConstantesFunciones.mostrarnumero_jornada_trabajoNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jPanelnumero_jornada_trabajoNovedadNomi.setVisible(this.novedadnomiConstantesFunciones.mostrarnumero_jornada_trabajoNovedadNomi);
		//this.jInternalFrameDetalleFormNovedadNomi.jTextFieldanio_vacacionNovedadNomi.setVisible(this.novedadnomiConstantesFunciones.mostraranio_vacacionNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jPanelanio_vacacionNovedadNomi.setVisible(this.novedadnomiConstantesFunciones.mostraranio_vacacionNovedadNomi);
		//this.jInternalFrameDetalleFormNovedadNomi.jTextAreadescripcionNovedadNomi.setVisible(this.novedadnomiConstantesFunciones.mostrardescripcionNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jPaneldescripcionNovedadNomi.setVisible(this.novedadnomiConstantesFunciones.mostrardescripcionNovedadNomi);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioNovedadNomi() throws Exception {
		if(this.jInternalFrameDetalleFormNovedadNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormNovedadNomi!=null) {
	
		this.jInternalFrameDetalleFormNovedadNomi.jLabelidNovedadNomi.setEnabled(this.novedadnomiConstantesFunciones.activaridNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empresaNovedadNomi.setEnabled(this.novedadnomiConstantesFunciones.activarid_empresaNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empleadoNovedadNomi.setEnabled(this.novedadnomiConstantesFunciones.activarid_empleadoNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_empleado_autorizaNovedadNomi.setEnabled(this.novedadnomiConstantesFunciones.activarid_empleado_autorizaNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_tipo_novedad_nomiNovedadNomi.setEnabled(this.novedadnomiConstantesFunciones.activarid_tipo_novedad_nomiNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jComboBoxid_estado_novedad_nomiNovedadNomi.setEnabled(this.novedadnomiConstantesFunciones.activarid_estado_novedad_nomiNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jDateChooserfechaNovedadNomi.setEnabled(this.novedadnomiConstantesFunciones.activarfechaNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jTextFieldnumero_horaNovedadNomi.setEnabled(this.novedadnomiConstantesFunciones.activarnumero_horaNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jTextFieldnumero_minutoNovedadNomi.setEnabled(this.novedadnomiConstantesFunciones.activarnumero_minutoNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jTextFieldnumero_jornada_trabajoNovedadNomi.setEnabled(this.novedadnomiConstantesFunciones.activarnumero_jornada_trabajoNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jTextFieldanio_vacacionNovedadNomi.setEnabled(this.novedadnomiConstantesFunciones.activaranio_vacacionNovedadNomi);
		this.jInternalFrameDetalleFormNovedadNomi.jTextAreadescripcionNovedadNomi.setEnabled(this.novedadnomiConstantesFunciones.activardescripcionNovedadNomi);
		}
	}
	
		
}