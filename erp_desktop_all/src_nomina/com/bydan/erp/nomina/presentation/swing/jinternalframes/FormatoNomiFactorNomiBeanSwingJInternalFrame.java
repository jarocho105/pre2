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

import com.bydan.erp.nomina.util.FormatoNomiFactorNomiConstantesFunciones;
import com.bydan.erp.nomina.util.FormatoNomiFactorNomiParameterReturnGeneral;
//import com.bydan.erp.nomina.util.FormatoNomiFactorNomiParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.FormatoNomiFactorNomiBean;
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
public class FormatoNomiFactorNomiBeanSwingJInternalFrame extends FormatoNomiFactorNomiJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(FormatoNomiFactorNomiBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<FormatoNomiFactorNomi> formatonomifactornomiValidator = new ClassValidator<FormatoNomiFactorNomi>(FormatoNomiFactorNomi.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public FormatoNomiFactorNomi formatonomifactornomi;	
	public FormatoNomiFactorNomi formatonomifactornomiAux;
	public FormatoNomiFactorNomi formatonomifactornomiAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public FormatoNomiFactorNomi formatonomifactornomiTotales;
	public Long idFormatoNomiFactorNomiActual;
	public Long iIdNuevoFormatoNomiFactorNomi=0L;
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

	public String sFinalQueryComboSucursal="";

	public List<Sucursal> sucursalsForeignKey;

	public List<Sucursal> getsucursalsForeignKey() {
		return sucursalsForeignKey;
	}

	public void setsucursalsForeignKey(List<Sucursal> sucursalsForeignKey) {
		this.sucursalsForeignKey = sucursalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sucursal sucursalForeignKey;

	public Sucursal getsucursalForeignKey() {
		return sucursalForeignKey;
	}

	public void setsucursalForeignKey(Sucursal sucursalForeignKey) {
		this.sucursalForeignKey = sucursalForeignKey;
	}

	public String sFinalQueryComboFormatoNomi="";

	public List<FormatoNomi> formatonomisForeignKey;

	public List<FormatoNomi> getformatonomisForeignKey() {
		return formatonomisForeignKey;
	}

	public void setformatonomisForeignKey(List<FormatoNomi> formatonomisForeignKey) {
		this.formatonomisForeignKey = formatonomisForeignKey;
	}

	//OBJETO FK ACTUAL
	public FormatoNomi formatonomiForeignKey;

	public FormatoNomi getformatonomiForeignKey() {
		return formatonomiForeignKey;
	}

	public void setformatonomiForeignKey(FormatoNomi formatonomiForeignKey) {
		this.formatonomiForeignKey = formatonomiForeignKey;
	}

	public String sFinalQueryComboFactorNomi="";

	public List<FactorNomi> factornomisForeignKey;

	public List<FactorNomi> getfactornomisForeignKey() {
		return factornomisForeignKey;
	}

	public void setfactornomisForeignKey(List<FactorNomi> factornomisForeignKey) {
		this.factornomisForeignKey = factornomisForeignKey;
	}

	//OBJETO FK ACTUAL
	public FactorNomi factornomiForeignKey;

	public FactorNomi getfactornomiForeignKey() {
		return factornomiForeignKey;
	}

	public void setfactornomiForeignKey(FactorNomi factornomiForeignKey) {
		this.factornomiForeignKey = factornomiForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosCalificacionEmpleado=false;

	public Boolean getIsTienePermisosCalificacionEmpleado() {
		return isTienePermisosCalificacionEmpleado;
	}

	public void setIsTienePermisosCalificacionEmpleado(Boolean isTienePermisosCalificacionEmpleado) {
		this.isTienePermisosCalificacionEmpleado= isTienePermisosCalificacionEmpleado;
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
	
	public Boolean isPermisoTodoFormatoNomiFactorNomi;
	public Boolean isPermisoNuevoFormatoNomiFactorNomi;
	public Boolean isPermisoActualizarFormatoNomiFactorNomi;
	public Boolean isPermisoActualizarOriginalFormatoNomiFactorNomi;
	public Boolean isPermisoEliminarFormatoNomiFactorNomi;
	public Boolean isPermisoGuardarCambiosFormatoNomiFactorNomi;
	public Boolean isPermisoConsultaFormatoNomiFactorNomi;
	public Boolean isPermisoBusquedaFormatoNomiFactorNomi;
	public Boolean isPermisoReporteFormatoNomiFactorNomi;
	public Boolean isPermisoPaginacionMedioFormatoNomiFactorNomi;
	public Boolean isPermisoPaginacionAltoFormatoNomiFactorNomi;
	public Boolean isPermisoPaginacionTodoFormatoNomiFactorNomi;
	public Boolean isPermisoCopiarFormatoNomiFactorNomi;
	public Boolean isPermisoVerFormFormatoNomiFactorNomi;
	public Boolean isPermisoDuplicarFormatoNomiFactorNomi;
	public Boolean isPermisoOrdenFormatoNomiFactorNomi;
	
	
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
	
	public FormatoNomiFactorNomiParameterReturnGeneral formatonomifactornomiReturnGeneral;
	public FormatoNomiFactorNomiParameterReturnGeneral formatonomifactornomiParameterGeneral;
	
	

	public CalificacionEmpleadoLogic calificacionempleadoLogic=null;

	public CalificacionEmpleadoLogic getCalificacionEmpleadoLogic() {
		return calificacionempleadoLogic;
	}

	public void setCalificacionEmpleadoLogic(CalificacionEmpleadoLogic calificacionempleadoLogic) {
		this.calificacionempleadoLogic = calificacionempleadoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoFormatoNomiFactorNomi=false;
	public Boolean esParaAccionDesdeFormularioFormatoNomiFactorNomi=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected FormatoNomiFactorNomiSessionBeanAdditional formatonomifactornomiSessionBeanAdditional=null;
	
	public FormatoNomiFactorNomiSessionBeanAdditional getFormatoNomiFactorNomiSessionBeanAdditional() {
		return this.formatonomifactornomiSessionBeanAdditional;
	}
	
	public void setFormatoNomiFactorNomiSessionBeanAdditional(FormatoNomiFactorNomiSessionBeanAdditional formatonomifactornomiSessionBeanAdditional) {
		try {
			this.formatonomifactornomiSessionBeanAdditional=formatonomifactornomiSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional formatonomifactornomiBeanSwingJInternalFrameAdditional=null;
	//public class FormatoNomiFactorNomiBeanSwingJInternalFrame
	
	public FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional getFormatoNomiFactorNomiBeanSwingJInternalFrameAdditional() {
		return this.formatonomifactornomiBeanSwingJInternalFrameAdditional;
	}
	
	public void setFormatoNomiFactorNomiBeanSwingJInternalFrameAdditional(FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional formatonomifactornomiBeanSwingJInternalFrameAdditional) {
		try {
			this.formatonomifactornomiBeanSwingJInternalFrameAdditional=formatonomifactornomiBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public FormatoNomiFactorNomiLogic formatonomifactornomiLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public FormatoNomiFactorNomi formatonomifactornomiBean;
	public FormatoNomiFactorNomiConstantesFunciones formatonomifactornomiConstantesFunciones;
	//public FormatoNomiFactorNomiParameterReturnGeneral formatonomifactornomiReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public FormatoNomiLogic formatonomiLogic;
	public FactorNomiLogic factornomiLogic;
	
	//PARAMETROS
	
	
	//public List<FormatoNomiFactorNomi> formatonomifactornomis;	
	//public List<FormatoNomiFactorNomi> formatonomifactornomisEliminados;
	//public List<FormatoNomiFactorNomi> formatonomifactornomisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoFormatoNomiFactorNomi=false;
	public Boolean isVisibilidadCeldaDuplicarFormatoNomiFactorNomi=true;
	public Boolean isVisibilidadCeldaCopiarFormatoNomiFactorNomi=true;
	public Boolean isVisibilidadCeldaVerFormFormatoNomiFactorNomi=true;
	public Boolean isVisibilidadCeldaOrdenFormatoNomiFactorNomi=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesFormatoNomiFactorNomi=false;
	public Boolean isVisibilidadCeldaModificarFormatoNomiFactorNomi=false;
	public Boolean isVisibilidadCeldaActualizarFormatoNomiFactorNomi=false;
	public Boolean isVisibilidadCeldaEliminarFormatoNomiFactorNomi=false;
	public Boolean isVisibilidadCeldaCancelarFormatoNomiFactorNomi=false;
	public Boolean isVisibilidadCeldaGuardarFormatoNomiFactorNomi=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosFormatoNomiFactorNomi=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdFactorNomi=false;
	public Boolean isVisibilidadFK_IdFormatoNomi=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoFormatoNomiFactorNomi() {
		return this.iIdNuevoFormatoNomiFactorNomi;
	}

	public void setiIdNuevoFormatoNomiFactorNomi(Long iIdNuevoFormatoNomiFactorNomi) {
		this.iIdNuevoFormatoNomiFactorNomi = iIdNuevoFormatoNomiFactorNomi;
	}
	
	public Long getidFormatoNomiFactorNomiActual() {
		return this.idFormatoNomiFactorNomiActual;
	}

	public void setidFormatoNomiFactorNomiActual(Long idFormatoNomiFactorNomiActual) {
		this.idFormatoNomiFactorNomiActual = idFormatoNomiFactorNomiActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public FormatoNomiFactorNomi getformatonomifactornomi() {
		return this.formatonomifactornomi;
	}

	public void setformatonomifactornomi(FormatoNomiFactorNomi formatonomifactornomi) {
		this.formatonomifactornomi = formatonomifactornomi;
	}
	
	public FormatoNomiFactorNomi getformatonomifactornomiAux() {
		return this.formatonomifactornomiAux;
	}

	public void setformatonomifactornomiAux(FormatoNomiFactorNomi formatonomifactornomiAux) {
		this.formatonomifactornomiAux = formatonomifactornomiAux;
	}				
	
	public FormatoNomiFactorNomi getformatonomifactornomiAnterior() {
		return this.formatonomifactornomiAnterior;
	}

	public void setformatonomifactornomiAnterior(FormatoNomiFactorNomi formatonomifactornomiAnterior) {
		this.formatonomifactornomiAnterior = formatonomifactornomiAnterior;
	}	
	
	public FormatoNomiFactorNomi getformatonomifactornomiTotales() {
		return this.formatonomifactornomiTotales;
	}

	public void setformatonomifactornomiTotales(FormatoNomiFactorNomi formatonomifactornomiTotales) {
		this.formatonomifactornomiTotales = formatonomifactornomiTotales;
	}	
	
	public FormatoNomiFactorNomi getformatonomifactornomiBean() {
		return this.formatonomifactornomiBean;
	}

	public void setformatonomifactornomiBean(FormatoNomiFactorNomi formatonomifactornomiBean) {
		this.formatonomifactornomiBean = formatonomifactornomiBean;
	}	
	
	public FormatoNomiFactorNomiParameterReturnGeneral getformatonomifactornomiReturnGeneral() {
		return this.formatonomifactornomiReturnGeneral;
	}

	public void setformatonomifactornomiReturnGeneral(FormatoNomiFactorNomiParameterReturnGeneral formatonomifactornomiReturnGeneral) {
		this.formatonomifactornomiReturnGeneral = formatonomifactornomiReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_factor_nomiFK_IdFactorNomi=-1L;

	public Long getid_factor_nomiFK_IdFactorNomi() {
		return this.id_factor_nomiFK_IdFactorNomi;
	}

	public void setid_factor_nomiFK_IdFactorNomi(Long id_factor_nomiFK_IdFactorNomi) {
		this.id_factor_nomiFK_IdFactorNomi = id_factor_nomiFK_IdFactorNomi;
	}

	public Long id_formato_nomiFK_IdFormatoNomi=-1L;

	public Long getid_formato_nomiFK_IdFormatoNomi() {
		return this.id_formato_nomiFK_IdFormatoNomi;
	}

	public void setid_formato_nomiFK_IdFormatoNomi(Long id_formato_nomiFK_IdFormatoNomi) {
		this.id_formato_nomiFK_IdFormatoNomi = id_formato_nomiFK_IdFormatoNomi;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public FormatoNomiFactorNomiLogic getFormatoNomiFactorNomiLogic()	{		
		return formatonomifactornomiLogic;
	}

	public void setFormatoNomiFactorNomiLogic(FormatoNomiFactorNomiLogic formatonomifactornomiLogic) {
		this.formatonomifactornomiLogic = formatonomifactornomiLogic;
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
	
	public Boolean getIsEsNuevoFormatoNomiFactorNomi() {
		return isEsNuevoFormatoNomiFactorNomi;
	}

	public void setIsEsNuevoFormatoNomiFactorNomi(Boolean isEsNuevoFormatoNomiFactorNomi) {
		this.isEsNuevoFormatoNomiFactorNomi = isEsNuevoFormatoNomiFactorNomi;
	}

	public Boolean getEsParaAccionDesdeFormularioFormatoNomiFactorNomi() {
		return esParaAccionDesdeFormularioFormatoNomiFactorNomi;
	}
	
	public void setEsParaAccionDesdeFormularioFormatoNomiFactorNomi(Boolean esParaAccionDesdeFormularioFormatoNomiFactorNomi) {
		this.esParaAccionDesdeFormularioFormatoNomiFactorNomi = esParaAccionDesdeFormularioFormatoNomiFactorNomi;
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

			if(this.formatonomifactornomiSessionBean==null) {
				this.formatonomifactornomiSessionBean=new FormatoNomiFactorNomiSessionBean();
			}

			if(!this.formatonomifactornomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(formatonomifactornomiSessionBean.getlidEmpresaActual());
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

	public void cargarCombosSucursalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sucursalsForeignKey=new ArrayList<Sucursal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SucursalLogic sucursalLogic=new SucursalLogic();

			//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

			if(this.formatonomifactornomiSessionBean==null) {
				this.formatonomifactornomiSessionBean=new FormatoNomiFactorNomiSessionBean();
			}

			if(!this.formatonomifactornomiSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

					sucursalLogic.getTodosSucursalsWithConnection(sFinalQuery,new Pagination());

					this.sucursalsForeignKey=sucursalLogic.getSucursals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSucursal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getEntityWithConnection(formatonomifactornomiSessionBean.getlidSucursalActual());
					this.sucursalsForeignKey.add(sucursalLogic.getSucursal());
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

	public void cargarCombosFormatoNomisForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.formatonomisForeignKey=new ArrayList<FormatoNomi>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			FormatoNomiLogic formatonomiLogic=new FormatoNomiLogic();

			//formatonomiLogic.getFormatoNomiDataAccess().setIsForForeingKeyData(true);

			if(this.formatonomifactornomiSessionBean==null) {
				this.formatonomifactornomiSessionBean=new FormatoNomiFactorNomiSessionBean();
			}

			if(!this.formatonomifactornomiSessionBean.getisBusquedaDesdeForeignKeySesionFormatoNomi()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//formatonomiLogic.getFormatoNomiDataAccess().setIsForForeingKeyData(true);

					formatonomiLogic.getTodosFormatoNomisWithConnection(sFinalQuery,new Pagination());

					this.formatonomisForeignKey=formatonomiLogic.getFormatoNomis();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFormatoNomi(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatonomiLogic.getEntityWithConnection(formatonomifactornomiSessionBean.getlidFormatoNomiActual());
					this.formatonomisForeignKey.add(formatonomiLogic.getFormatoNomi());
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

	public void cargarCombosFactorNomisForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.factornomisForeignKey=new ArrayList<FactorNomi>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			FactorNomiLogic factornomiLogic=new FactorNomiLogic();

			//factornomiLogic.getFactorNomiDataAccess().setIsForForeingKeyData(true);

			if(this.formatonomifactornomiSessionBean==null) {
				this.formatonomifactornomiSessionBean=new FormatoNomiFactorNomiSessionBean();
			}

			if(!this.formatonomifactornomiSessionBean.getisBusquedaDesdeForeignKeySesionFactorNomi()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//factornomiLogic.getFactorNomiDataAccess().setIsForForeingKeyData(true);

					factornomiLogic.getTodosFactorNomisWithConnection(sFinalQuery,new Pagination());

					this.factornomisForeignKey=factornomiLogic.getFactorNomis();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFactorNomi(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					factornomiLogic.getEntityWithConnection(formatonomifactornomiSessionBean.getlidFactorNomiActual());
					this.factornomisForeignKey.add(factornomiLogic.getFactorNomi());
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

					if(this.formatonomifactornomi!=null) {
						this.formatonomifactornomi.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
						this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_empresaFormatoNomiFactorNomi.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaFormatoNomiFactorNomi.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
						if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_empresaFormatoNomiFactorNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_empresaFormatoNomiFactorNomi.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaFormatoNomiFactorNomiGenerico)throws Exception
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
				jComboBoxid_empresaFormatoNomiFactorNomiGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaFormatoNomiFactorNomiGenerico!=null && jComboBoxid_empresaFormatoNomiFactorNomiGenerico.getItemCount()>0) {
					jComboBoxid_empresaFormatoNomiFactorNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSucursalForeignKey(Long idSucursalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sucursalTemp!=null) {

					if(this.formatonomifactornomi!=null) {
						this.formatonomifactornomi.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
						this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_sucursalFormatoNomiFactorNomi.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalFormatoNomiFactorNomi.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
						if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_sucursalFormatoNomiFactorNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_sucursalFormatoNomiFactorNomi.setSelectedIndex(0);
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

	public String getActualSucursalForeignKeyDescripcion(Long idSucursalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}


			sDescripcion=SucursalConstantesFunciones.getSucursalDescripcion(sucursalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalFormatoNomiFactorNomiGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sucursalTemp!=null) {
				jComboBoxid_sucursalFormatoNomiFactorNomiGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalFormatoNomiFactorNomiGenerico!=null && jComboBoxid_sucursalFormatoNomiFactorNomiGenerico.getItemCount()>0) {
					jComboBoxid_sucursalFormatoNomiFactorNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualFormatoNomiForeignKey(Long idFormatoNomiSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			FormatoNomi  formatonomiTemp=null;

			for(FormatoNomi formatonomiAux:formatonomisForeignKey) {
				if(formatonomiAux.getId()!=null && formatonomiAux.getId().equals(idFormatoNomiSeleccionado)) {
					formatonomiTemp=formatonomiAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(formatonomiTemp!=null) {

					if(this.formatonomifactornomi!=null) {
						this.formatonomifactornomi.setFormatoNomi(formatonomiTemp);
					}

					if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
						this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_formato_nomiFormatoNomiFactorNomi.setSelectedItem(formatonomiTemp);
					}
				} else {
					//jComboBoxid_formato_nomiFormatoNomiFactorNomi.setSelectedItem(formatonomiTemp);
					if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
						if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_formato_nomiFormatoNomiFactorNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_formato_nomiFormatoNomiFactorNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdFormatoNomi") || sFormularioTipoBusqueda.equals("Todos")){
					if(formatonomiTemp!=null && jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomi!=null) {
						jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomi.setSelectedItem(formatonomiTemp);
					} else {
						if(jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomi!=null) {
							//jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomi.setSelectedItem(formatonomiTemp);
							if(jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomi.getItemCount()>0) {
								jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomi.setSelectedIndex(0);
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

	public String getActualFormatoNomiForeignKeyDescripcion(Long idFormatoNomiSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			FormatoNomi  formatonomiTemp=null;

			for(FormatoNomi formatonomiAux:formatonomisForeignKey) {
				if(formatonomiAux.getId()!=null && formatonomiAux.getId().equals(idFormatoNomiSeleccionado)) {
					formatonomiTemp=formatonomiAux;
					break;
				}
			}


			sDescripcion=FormatoNomiConstantesFunciones.getFormatoNomiDescripcion(formatonomiTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFormatoNomiForeignKeyGenerico(Long idFormatoNomiSeleccionado,JComboBox jComboBoxid_formato_nomiFormatoNomiFactorNomiGenerico)throws Exception
	{
		try
		{
			FormatoNomi  formatonomiTemp=null;

			for(FormatoNomi formatonomiAux:formatonomisForeignKey) {
				if(formatonomiAux.getId()!=null && formatonomiAux.getId().equals(idFormatoNomiSeleccionado)) {
					formatonomiTemp=formatonomiAux;
					break;
				}
			}

			if(formatonomiTemp!=null) {
				jComboBoxid_formato_nomiFormatoNomiFactorNomiGenerico.setSelectedItem(formatonomiTemp);
			} else {
				if(jComboBoxid_formato_nomiFormatoNomiFactorNomiGenerico!=null && jComboBoxid_formato_nomiFormatoNomiFactorNomiGenerico.getItemCount()>0) {
					jComboBoxid_formato_nomiFormatoNomiFactorNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualFactorNomiForeignKey(Long idFactorNomiSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			FactorNomi  factornomiTemp=null;

			for(FactorNomi factornomiAux:factornomisForeignKey) {
				if(factornomiAux.getId()!=null && factornomiAux.getId().equals(idFactorNomiSeleccionado)) {
					factornomiTemp=factornomiAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(factornomiTemp!=null) {

					if(this.formatonomifactornomi!=null) {
						this.formatonomifactornomi.setFactorNomi(factornomiTemp);
					}

					if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
						this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_factor_nomiFormatoNomiFactorNomi.setSelectedItem(factornomiTemp);
					}
				} else {
					//jComboBoxid_factor_nomiFormatoNomiFactorNomi.setSelectedItem(factornomiTemp);
					if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
						if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_factor_nomiFormatoNomiFactorNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_factor_nomiFormatoNomiFactorNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdFactorNomi") || sFormularioTipoBusqueda.equals("Todos")){
					if(factornomiTemp!=null && jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomi!=null) {
						jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomi.setSelectedItem(factornomiTemp);
					} else {
						if(jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomi!=null) {
							//jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomi.setSelectedItem(factornomiTemp);
							if(jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomi.getItemCount()>0) {
								jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomi.setSelectedIndex(0);
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

	public String getActualFactorNomiForeignKeyDescripcion(Long idFactorNomiSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			FactorNomi  factornomiTemp=null;

			for(FactorNomi factornomiAux:factornomisForeignKey) {
				if(factornomiAux.getId()!=null && factornomiAux.getId().equals(idFactorNomiSeleccionado)) {
					factornomiTemp=factornomiAux;
					break;
				}
			}


			sDescripcion=FactorNomiConstantesFunciones.getFactorNomiDescripcion(factornomiTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFactorNomiForeignKeyGenerico(Long idFactorNomiSeleccionado,JComboBox jComboBoxid_factor_nomiFormatoNomiFactorNomiGenerico)throws Exception
	{
		try
		{
			FactorNomi  factornomiTemp=null;

			for(FactorNomi factornomiAux:factornomisForeignKey) {
				if(factornomiAux.getId()!=null && factornomiAux.getId().equals(idFactorNomiSeleccionado)) {
					factornomiTemp=factornomiAux;
					break;
				}
			}

			if(factornomiTemp!=null) {
				jComboBoxid_factor_nomiFormatoNomiFactorNomiGenerico.setSelectedItem(factornomiTemp);
			} else {
				if(jComboBoxid_factor_nomiFormatoNomiFactorNomiGenerico!=null && jComboBoxid_factor_nomiFormatoNomiFactorNomiGenerico.getItemCount()>0) {
					jComboBoxid_factor_nomiFormatoNomiFactorNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(FormatoNomiFactorNomi formatonomifactornomi,JComboBox jComboBoxid_empresaFormatoNomiFactorNomiGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaFormatoNomiFactorNomiGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_empresaFormatoNomiFactorNomi.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaFormatoNomiFactorNomiGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				formatonomifactornomi.setid_empresa(empresaAux.getId());
				formatonomifactornomi.setempresa_descripcion(FormatoNomiFactorNomiConstantesFunciones.getEmpresaDescripcion(empresaAux));
				formatonomifactornomi.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(FormatoNomiFactorNomi formatonomifactornomi,JComboBox jComboBoxid_sucursalFormatoNomiFactorNomiGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalFormatoNomiFactorNomiGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_sucursalFormatoNomiFactorNomi.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalFormatoNomiFactorNomiGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				formatonomifactornomi.setid_sucursal(sucursalAux.getId());
				formatonomifactornomi.setsucursal_descripcion(FormatoNomiFactorNomiConstantesFunciones.getSucursalDescripcion(sucursalAux));
				formatonomifactornomi.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFormatoNomiForeignKey(FormatoNomiFactorNomi formatonomifactornomi,JComboBox jComboBoxid_formato_nomiFormatoNomiFactorNomiGenerico)throws Exception
	{
		try
		{
			FormatoNomi  formatonomiAux=new FormatoNomi();

			if(jComboBoxid_formato_nomiFormatoNomiFactorNomiGenerico==null) {
				formatonomiAux=(FormatoNomi)this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_formato_nomiFormatoNomiFactorNomi.getSelectedItem();
			} else {
				formatonomiAux=(FormatoNomi)jComboBoxid_formato_nomiFormatoNomiFactorNomiGenerico.getSelectedItem();
			}

			if(formatonomiAux!=null && formatonomiAux.getId()!=null) {
				formatonomifactornomi.setid_formato_nomi(formatonomiAux.getId());
				formatonomifactornomi.setformatonomi_descripcion(FormatoNomiFactorNomiConstantesFunciones.getFormatoNomiDescripcion(formatonomiAux));
				formatonomifactornomi.setFormatoNomi(formatonomiAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFactorNomiForeignKey(FormatoNomiFactorNomi formatonomifactornomi,JComboBox jComboBoxid_factor_nomiFormatoNomiFactorNomiGenerico)throws Exception
	{
		try
		{
			FactorNomi  factornomiAux=new FactorNomi();

			if(jComboBoxid_factor_nomiFormatoNomiFactorNomiGenerico==null) {
				factornomiAux=(FactorNomi)this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_factor_nomiFormatoNomiFactorNomi.getSelectedItem();
			} else {
				factornomiAux=(FactorNomi)jComboBoxid_factor_nomiFormatoNomiFactorNomiGenerico.getSelectedItem();
			}

			if(factornomiAux!=null && factornomiAux.getId()!=null) {
				formatonomifactornomi.setid_factor_nomi(factornomiAux.getId());
				formatonomifactornomi.setfactornomi_descripcion(FormatoNomiFactorNomiConstantesFunciones.getFactorNomiDescripcion(factornomiAux));
				formatonomifactornomi.setFactorNomi(factornomiAux);			}
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

					if(!FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) { 
							this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_empresaFormatoNomiFactorNomi.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_empresaFormatoNomiFactorNomi.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) { 
					}

					if(!FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSucursalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSucursal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) { 
							this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_sucursalFormatoNomiFactorNomi.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_sucursalFormatoNomiFactorNomi.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) { 
					}

					if(!FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFormatoNomisForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFormatoNomi=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) { 
							this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_formato_nomiFormatoNomiFactorNomi.removeAllItems();

							for(FormatoNomi formatonomi:this.formatonomisForeignKey) {
								this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_formato_nomiFormatoNomiFactorNomi.addItem(formatonomi);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) { 
					}

					if(!FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdFormatoNomi") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomi.removeAllItems();

							for(FormatoNomi formatonomi:this.formatonomisForeignKey) {
								this.jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomi.addItem(formatonomi);
							}
						}

						if(!FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFactorNomisForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFactorNomi=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) { 
							this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_factor_nomiFormatoNomiFactorNomi.removeAllItems();

							for(FactorNomi factornomi:this.factornomisForeignKey) {
								this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_factor_nomiFormatoNomiFactorNomi.addItem(factornomi);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) { 
					}

					if(!FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdFactorNomi") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomi.removeAllItems();

							for(FactorNomi factornomi:this.factornomisForeignKey) {
								this.jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomi.addItem(factornomi);
							}
						}

						if(!FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
							this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_empresaFormatoNomiFactorNomi.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
							this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_empresaFormatoNomiFactorNomi.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameSucursalForeignKey(Sucursal sucursal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
							this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_sucursalFormatoNomiFactorNomi.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
							this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_sucursalFormatoNomiFactorNomi.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameFormatoNomiForeignKey(FormatoNomi formatonomi,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
							this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_formato_nomiFormatoNomiFactorNomi.setSelectedItem(formatonomi);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
							this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_formato_nomiFormatoNomiFactorNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomi.setSelectedItem(formatonomi);
						} else {
							this.jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomi.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameFactorNomiForeignKey(FactorNomi factornomi,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
							this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_factor_nomiFormatoNomiFactorNomi.setSelectedItem(factornomi);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
							this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_factor_nomiFormatoNomiFactorNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomi.setSelectedItem(factornomi);
						} else {
							this.jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomi.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesFormatoNomiFactorNomi() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			FormatoNomiFactorNomiConstantesFunciones.refrescarForeignKeysDescripcionesFormatoNomiFactorNomi(this.formatonomifactornomiLogic.getFormatoNomiFactorNomis());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			FormatoNomiFactorNomiConstantesFunciones.refrescarForeignKeysDescripcionesFormatoNomiFactorNomi(this.formatonomifactornomis);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(FormatoNomi.class));
		classes.add(new Classe(FactorNomi.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//formatonomifactornomiLogic.setFormatoNomiFactorNomis(this.formatonomifactornomis);
			formatonomifactornomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public FormatoNomiFactorNomiParameterReturnGeneral getFormatoNomiFactorNomiParameterGeneral() {
		return this.formatonomifactornomiParameterGeneral;
	}
	
	public void setFormatoNomiFactorNomiParameterGeneral(FormatoNomiFactorNomiParameterReturnGeneral formatonomifactornomiParameterGeneral) {
		this.formatonomifactornomiParameterGeneral = formatonomifactornomiParameterGeneral;
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
	
	public Boolean getIsPermisoTodoFormatoNomiFactorNomi() {
		return isPermisoTodoFormatoNomiFactorNomi;
	}

	public void setIsPermisoTodoFormatoNomiFactorNomi(Boolean isPermisoTodoFormatoNomiFactorNomi) {
		this.isPermisoTodoFormatoNomiFactorNomi = isPermisoTodoFormatoNomiFactorNomi;
	}

	public Boolean getIsPermisoNuevoFormatoNomiFactorNomi() {
		return isPermisoNuevoFormatoNomiFactorNomi;
	}

	public void setIsPermisoNuevoFormatoNomiFactorNomi(Boolean isPermisoNuevoFormatoNomiFactorNomi) {
		this.isPermisoNuevoFormatoNomiFactorNomi = isPermisoNuevoFormatoNomiFactorNomi;
	}

	public Boolean getIsPermisoActualizarFormatoNomiFactorNomi() {
		return isPermisoActualizarFormatoNomiFactorNomi;
	}

	public void setIsPermisoActualizarFormatoNomiFactorNomi(Boolean isPermisoActualizarFormatoNomiFactorNomi) {
		this.isPermisoActualizarFormatoNomiFactorNomi = isPermisoActualizarFormatoNomiFactorNomi;
	}

	public Boolean getIsPermisoEliminarFormatoNomiFactorNomi() {
		return isPermisoEliminarFormatoNomiFactorNomi;
	}

	public void setIsPermisoEliminarFormatoNomiFactorNomi(Boolean isPermisoEliminarFormatoNomiFactorNomi) {
		this.isPermisoEliminarFormatoNomiFactorNomi = isPermisoEliminarFormatoNomiFactorNomi;
	}

	public Boolean getIsPermisoGuardarCambiosFormatoNomiFactorNomi() {
		return isPermisoGuardarCambiosFormatoNomiFactorNomi;
	}

	public void setIsPermisoGuardarCambiosFormatoNomiFactorNomi(Boolean isPermisoGuardarCambiosFormatoNomiFactorNomi) {
		this.isPermisoGuardarCambiosFormatoNomiFactorNomi = isPermisoGuardarCambiosFormatoNomiFactorNomi;
	}
	
	public Boolean getIsPermisoConsultaFormatoNomiFactorNomi() {
		return isPermisoConsultaFormatoNomiFactorNomi;
	}

	public void setIsPermisoConsultaFormatoNomiFactorNomi(Boolean isPermisoConsultaFormatoNomiFactorNomi) {
		this.isPermisoConsultaFormatoNomiFactorNomi = isPermisoConsultaFormatoNomiFactorNomi;
	}

	public Boolean getIsPermisoBusquedaFormatoNomiFactorNomi() {
		return isPermisoBusquedaFormatoNomiFactorNomi;
	}

	public void setIsPermisoBusquedaFormatoNomiFactorNomi(Boolean isPermisoBusquedaFormatoNomiFactorNomi) {
		this.isPermisoBusquedaFormatoNomiFactorNomi = isPermisoBusquedaFormatoNomiFactorNomi;
	}

	public Boolean getIsPermisoReporteFormatoNomiFactorNomi() {
		return isPermisoReporteFormatoNomiFactorNomi;
	}

	public void setIsPermisoReporteFormatoNomiFactorNomi(Boolean isPermisoReporteFormatoNomiFactorNomi) {
		this.isPermisoReporteFormatoNomiFactorNomi = isPermisoReporteFormatoNomiFactorNomi;
	}
	
	public Boolean getIsPermisoPaginacionMedioFormatoNomiFactorNomi() {
		return isPermisoPaginacionMedioFormatoNomiFactorNomi;
	}

	public void setIsPermisoPaginacionMedioFormatoNomiFactorNomi(Boolean isPermisoPaginacionMedioFormatoNomiFactorNomi) {
		this.isPermisoPaginacionMedioFormatoNomiFactorNomi = isPermisoPaginacionMedioFormatoNomiFactorNomi;
	}
	
	public Boolean getIsPermisoPaginacionTodoFormatoNomiFactorNomi() {
		return isPermisoPaginacionTodoFormatoNomiFactorNomi;
	}

	public void setIsPermisoPaginacionTodoFormatoNomiFactorNomi(Boolean isPermisoPaginacionTodoFormatoNomiFactorNomi) {
		this.isPermisoPaginacionTodoFormatoNomiFactorNomi = isPermisoPaginacionTodoFormatoNomiFactorNomi;
	}
	
	public Boolean getIsPermisoPaginacionAltoFormatoNomiFactorNomi() {
		return isPermisoPaginacionAltoFormatoNomiFactorNomi;
	}

	public void setIsPermisoPaginacionAltoFormatoNomiFactorNomi(Boolean isPermisoPaginacionAltoFormatoNomiFactorNomi) {
		this.isPermisoPaginacionAltoFormatoNomiFactorNomi = isPermisoPaginacionAltoFormatoNomiFactorNomi;
	}
	
	public Boolean getIsPermisoCopiarFormatoNomiFactorNomi() {
		return isPermisoCopiarFormatoNomiFactorNomi;
	}

	public void setIsPermisoCopiarFormatoNomiFactorNomi(Boolean isPermisoCopiarFormatoNomiFactorNomi) {
		this.isPermisoCopiarFormatoNomiFactorNomi = isPermisoCopiarFormatoNomiFactorNomi;
	}
	
	public Boolean getIsPermisoVerFormFormatoNomiFactorNomi() {
		return isPermisoVerFormFormatoNomiFactorNomi;
	}

	public void setIsPermisoVerFormFormatoNomiFactorNomi(Boolean isPermisoVerFormFormatoNomiFactorNomi) {
		this.isPermisoVerFormFormatoNomiFactorNomi = isPermisoVerFormFormatoNomiFactorNomi;
	}
	
	public Boolean getIsPermisoDuplicarFormatoNomiFactorNomi() {
		return isPermisoDuplicarFormatoNomiFactorNomi;
	}

	public void setIsPermisoDuplicarFormatoNomiFactorNomi(Boolean isPermisoDuplicarFormatoNomiFactorNomi) {
		this.isPermisoDuplicarFormatoNomiFactorNomi = isPermisoDuplicarFormatoNomiFactorNomi;
	}
	
	public Boolean getIsPermisoOrdenFormatoNomiFactorNomi() {
		return isPermisoOrdenFormatoNomiFactorNomi;
	}

	public void setIsPermisoOrdenFormatoNomiFactorNomi(Boolean isPermisoOrdenFormatoNomiFactorNomi) {
		this.isPermisoOrdenFormatoNomiFactorNomi = isPermisoOrdenFormatoNomiFactorNomi;
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
	
	public Boolean getIsVisibilidadCeldaNuevoFormatoNomiFactorNomi() {
		return isVisibilidadCeldaNuevoFormatoNomiFactorNomi;
	}

	public void setIsVisibilidadCeldaNuevoFormatoNomiFactorNomi(Boolean isVisibilidadCeldaNuevoFormatoNomiFactorNomi) {
		this.isVisibilidadCeldaNuevoFormatoNomiFactorNomi = isVisibilidadCeldaNuevoFormatoNomiFactorNomi;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarFormatoNomiFactorNomi() {
		return isVisibilidadCeldaDuplicarFormatoNomiFactorNomi;
	}

	public void setIsVisibilidadCeldaDuplicarFormatoNomiFactorNomi(Boolean isVisibilidadCeldaDuplicarFormatoNomiFactorNomi) {
		this.isVisibilidadCeldaDuplicarFormatoNomiFactorNomi = isVisibilidadCeldaDuplicarFormatoNomiFactorNomi;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarFormatoNomiFactorNomi() {
		return isVisibilidadCeldaCopiarFormatoNomiFactorNomi;
	}

	public void setIsVisibilidadCeldaCopiarFormatoNomiFactorNomi(Boolean isVisibilidadCeldaCopiarFormatoNomiFactorNomi) {
		this.isVisibilidadCeldaCopiarFormatoNomiFactorNomi = isVisibilidadCeldaCopiarFormatoNomiFactorNomi;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormFormatoNomiFactorNomi() {
		return isVisibilidadCeldaVerFormFormatoNomiFactorNomi;
	}

	public void setIsVisibilidadCeldaVerFormFormatoNomiFactorNomi(Boolean isVisibilidadCeldaVerFormFormatoNomiFactorNomi) {
		this.isVisibilidadCeldaVerFormFormatoNomiFactorNomi = isVisibilidadCeldaVerFormFormatoNomiFactorNomi;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenFormatoNomiFactorNomi() {
		return isVisibilidadCeldaOrdenFormatoNomiFactorNomi;
	}

	public void setIsVisibilidadCeldaOrdenFormatoNomiFactorNomi(Boolean isVisibilidadCeldaOrdenFormatoNomiFactorNomi) {
		this.isVisibilidadCeldaOrdenFormatoNomiFactorNomi = isVisibilidadCeldaOrdenFormatoNomiFactorNomi;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesFormatoNomiFactorNomi() {
		return isVisibilidadCeldaNuevoRelacionesFormatoNomiFactorNomi;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesFormatoNomiFactorNomi(Boolean isVisibilidadCeldaNuevoRelacionesFormatoNomiFactorNomi) {
		this.isVisibilidadCeldaNuevoRelacionesFormatoNomiFactorNomi = isVisibilidadCeldaNuevoRelacionesFormatoNomiFactorNomi;
	}
	
	public Boolean getIsVisibilidadCeldaModificarFormatoNomiFactorNomi() {
		return isVisibilidadCeldaModificarFormatoNomiFactorNomi;
	}

	public void setIsVisibilidadCeldaModificarFormatoNomiFactorNomi(Boolean isVisibilidadCeldaModificarFormatoNomiFactorNomi) {
		this.isVisibilidadCeldaModificarFormatoNomiFactorNomi = isVisibilidadCeldaModificarFormatoNomiFactorNomi;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarFormatoNomiFactorNomi() {
		return isVisibilidadCeldaActualizarFormatoNomiFactorNomi;
	}

	public void setIsVisibilidadCeldaActualizarFormatoNomiFactorNomi(Boolean isVisibilidadCeldaActualizarFormatoNomiFactorNomi) {
		this.isVisibilidadCeldaActualizarFormatoNomiFactorNomi = isVisibilidadCeldaActualizarFormatoNomiFactorNomi;
	}

	public Boolean getIsVisibilidadCeldaEliminarFormatoNomiFactorNomi() {
		return isVisibilidadCeldaEliminarFormatoNomiFactorNomi;
	}

	public void setIsVisibilidadCeldaEliminarFormatoNomiFactorNomi(Boolean isVisibilidadCeldaEliminarFormatoNomiFactorNomi) {
		this.isVisibilidadCeldaEliminarFormatoNomiFactorNomi = isVisibilidadCeldaEliminarFormatoNomiFactorNomi;
	}

	public Boolean getIsVisibilidadCeldaCancelarFormatoNomiFactorNomi() {
		return isVisibilidadCeldaCancelarFormatoNomiFactorNomi;
	}

	public void setIsVisibilidadCeldaCancelarFormatoNomiFactorNomi(Boolean isVisibilidadCeldaCancelarFormatoNomiFactorNomi) {
		this.isVisibilidadCeldaCancelarFormatoNomiFactorNomi = isVisibilidadCeldaCancelarFormatoNomiFactorNomi;
	}

	public Boolean getIsVisibilidadCeldaGuardarFormatoNomiFactorNomi() {
		return isVisibilidadCeldaGuardarFormatoNomiFactorNomi;
	}

	public void setIsVisibilidadCeldaGuardarFormatoNomiFactorNomi(Boolean isVisibilidadCeldaGuardarFormatoNomiFactorNomi) {
		this.isVisibilidadCeldaGuardarFormatoNomiFactorNomi = isVisibilidadCeldaGuardarFormatoNomiFactorNomi;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosFormatoNomiFactorNomi() {
		return isVisibilidadCeldaGuardarCambiosFormatoNomiFactorNomi;
	}

	public void setIsVisibilidadCeldaGuardarCambiosFormatoNomiFactorNomi(Boolean isVisibilidadCeldaGuardarCambiosFormatoNomiFactorNomi) {
		this.isVisibilidadCeldaGuardarCambiosFormatoNomiFactorNomi = isVisibilidadCeldaGuardarCambiosFormatoNomiFactorNomi;
	}
		
	public FormatoNomiFactorNomiSessionBean getformatonomifactornomiSessionBean() {
		return this.formatonomifactornomiSessionBean;
	}
	
	public void setformatonomifactornomiSessionBean(FormatoNomiFactorNomiSessionBean formatonomifactornomiSessionBean) {
		this.formatonomifactornomiSessionBean=formatonomifactornomiSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdFactorNomi() {
		return this.isVisibilidadFK_IdFactorNomi;
	}

	public void setisVisibilidadFK_IdFactorNomi(Boolean isVisibilidadFK_IdFactorNomi) {
		this.isVisibilidadFK_IdFactorNomi=isVisibilidadFK_IdFactorNomi;
	}

	public Boolean getisVisibilidadFK_IdFormatoNomi() {
		return this.isVisibilidadFK_IdFormatoNomi;
	}

	public void setisVisibilidadFK_IdFormatoNomi(Boolean isVisibilidadFK_IdFormatoNomi) {
		this.isVisibilidadFK_IdFormatoNomi=isVisibilidadFK_IdFormatoNomi;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysFormatoNomiFactorNomi(FormatoNomiFactorNomi formatonomifactornomi)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(formatonomifactornomi,null);
				this.setActualParaGuardarSucursalForeignKey(formatonomifactornomi,null);
				this.setActualParaGuardarFormatoNomiForeignKey(formatonomifactornomi,null);
				this.setActualParaGuardarFactorNomiForeignKey(formatonomifactornomi,null);
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
	
	public void bugActualizarReferenciaActual(FormatoNomiFactorNomi formatonomifactornomi,FormatoNomiFactorNomi formatonomifactornomiAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalFormatoNomiFactorNomi(formatonomifactornomi);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		formatonomifactornomiAux.setId(formatonomifactornomi.getId());
		formatonomifactornomiAux.setVersionRow(formatonomifactornomi.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessFormatoNomiFactorNomi();
		
			int intSelectedRow = this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualFormatoNomiFactorNomi(this.formatonomifactornomi,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiFactorNomi(this.formatonomifactornomi);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = formatonomifactornomiValidator.getInvalidValues(this.formatonomifactornomi);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			formatonomifactornomiLogic.setDatosCliente(datosCliente);
			formatonomifactornomiLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				formatonomifactornomiAux=new  FormatoNomiFactorNomi();
				
				formatonomifactornomiAux.setIsNew(true);
				formatonomifactornomiAux.setIsChanged(true);
				
				formatonomifactornomiAux.setFormatoNomiFactorNomiOriginal(this.formatonomifactornomi);
				
				formatonomifactornomiAux.setId(this.formatonomifactornomi.getId());	
				formatonomifactornomiAux.setVersionRow(this.formatonomifactornomi.getVersionRow());	
				formatonomifactornomiAux.setid_empresa(this.formatonomifactornomi.getid_empresa());	
				formatonomifactornomiAux.setid_sucursal(this.formatonomifactornomi.getid_sucursal());	
				formatonomifactornomiAux.setid_formato_nomi(this.formatonomifactornomi.getid_formato_nomi());	
				formatonomifactornomiAux.setid_factor_nomi(this.formatonomifactornomi.getid_factor_nomi());	
				formatonomifactornomiAux.setponderacion(this.formatonomifactornomi.getponderacion());	
				formatonomifactornomiAux.setesta_activo(this.formatonomifactornomi.getesta_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.formatonomifactornomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.formatonomifactornomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(formatonomifactornomiAux,formatonomifactornomiLogic.getFormatoNomiFactorNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formatonomifactornomiAux,formatonomifactornomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.formatonomifactornomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.formatonomifactornomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomifactornomiLogic.saveFormatoNomiFactorNomis();//WithConnection
						//formatonomifactornomiLogic.getSetVersionRowFormatoNomiFactorNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.formatonomifactornomi,formatonomifactornomiAux);
					
					this.refrescarForeignKeysDescripcionesFormatoNomiFactorNomi();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.formatonomifactornomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados().addAll(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleados.addAll(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								formatonomifactornomiLogic.saveFormatoNomiFactorNomiRelaciones(formatonomifactornomiAux,this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados());//WithConnection
								//formatonomifactornomiLogic.getSetVersionRowFormatoNomiFactorNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.formatonomifactornomi,formatonomifactornomiAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.setCalificacionEmpleados(new ArrayList<CalificacionEmpleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleados= new ArrayList<CalificacionEmpleado>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							formatonomifactornomiAux.setCalificacionEmpleados(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.formatonomifactornomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.formatonomifactornomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(formatonomifactornomiAux,formatonomifactornomiLogic.getFormatoNomiFactorNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(formatonomifactornomiAux,formatonomifactornomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.formatonomifactornomi,formatonomifactornomiAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				formatonomifactornomiAux=new  FormatoNomiFactorNomi();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.formatonomifactornomiSessionBean.getEsGuardarRelacionado() 
					|| (this.formatonomifactornomiSessionBean.getEsGuardarRelacionado() && this.formatonomifactornomi.getId()>=0)) {
						
					formatonomifactornomiAux.setIsNew(false);
				}
				
				formatonomifactornomiAux.setIsDeleted(false);
			
				formatonomifactornomiAux.setId(this.formatonomifactornomi.getId());	
				formatonomifactornomiAux.setVersionRow(this.formatonomifactornomi.getVersionRow());	
				formatonomifactornomiAux.setid_empresa(this.formatonomifactornomi.getid_empresa());	
				formatonomifactornomiAux.setid_sucursal(this.formatonomifactornomi.getid_sucursal());	
				formatonomifactornomiAux.setid_formato_nomi(this.formatonomifactornomi.getid_formato_nomi());	
				formatonomifactornomiAux.setid_factor_nomi(this.formatonomifactornomi.getid_factor_nomi());	
				formatonomifactornomiAux.setponderacion(this.formatonomifactornomi.getponderacion());	
				formatonomifactornomiAux.setesta_activo(this.formatonomifactornomi.getesta_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(formatonomifactornomiAux,formatonomifactornomiLogic.getFormatoNomiFactorNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formatonomifactornomiAux,formatonomifactornomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.formatonomifactornomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.formatonomifactornomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomifactornomiLogic.saveFormatoNomiFactorNomis();//WithConnection
						//formatonomifactornomiLogic.getSetVersionRowFormatoNomiFactorNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.formatonomifactornomi,formatonomifactornomiAux);
					
					this.refrescarForeignKeysDescripcionesFormatoNomiFactorNomi();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.formatonomifactornomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados().addAll(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleados.addAll(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								formatonomifactornomiLogic.saveFormatoNomiFactorNomiRelaciones(formatonomifactornomiAux,this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados());//WithConnection
								//formatonomifactornomiLogic.getSetVersionRowFormatoNomiFactorNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.formatonomifactornomi,formatonomifactornomiAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.setCalificacionEmpleados(new ArrayList<CalificacionEmpleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleados= new ArrayList<CalificacionEmpleado>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							formatonomifactornomiAux.setCalificacionEmpleados(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.formatonomifactornomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.formatonomifactornomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(formatonomifactornomiAux,formatonomifactornomiLogic.getFormatoNomiFactorNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(formatonomifactornomiAux,formatonomifactornomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.formatonomifactornomi,formatonomifactornomiAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				formatonomifactornomiAux=new  FormatoNomiFactorNomi();
				
				formatonomifactornomiAux.setIsNew(false);
				formatonomifactornomiAux.setIsChanged(false);
				
				formatonomifactornomiAux.setIsDeleted(true);
				
				formatonomifactornomiAux.setId(this.formatonomifactornomi.getId());	
				formatonomifactornomiAux.setVersionRow(this.formatonomifactornomi.getVersionRow());	
				formatonomifactornomiAux.setid_empresa(this.formatonomifactornomi.getid_empresa());	
				formatonomifactornomiAux.setid_sucursal(this.formatonomifactornomi.getid_sucursal());	
				formatonomifactornomiAux.setid_formato_nomi(this.formatonomifactornomi.getid_formato_nomi());	
				formatonomifactornomiAux.setid_factor_nomi(this.formatonomifactornomi.getid_factor_nomi());	
				formatonomifactornomiAux.setponderacion(this.formatonomifactornomi.getponderacion());	
				formatonomifactornomiAux.setesta_activo(this.formatonomifactornomi.getesta_activo());	
				
				if(this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.formatonomifactornomiAux.getId()>=0) {	
						this.formatonomifactornomisEliminados.add(formatonomifactornomiAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(formatonomifactornomiAux,formatonomifactornomiLogic.getFormatoNomiFactorNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formatonomifactornomiAux,formatonomifactornomis);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.formatonomifactornomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.formatonomifactornomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomifactornomiLogic.saveFormatoNomiFactorNomis();//WithConnection
						//formatonomifactornomiLogic.getSetVersionRowFormatoNomiFactorNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.formatonomifactornomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados().addAll(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleados.addAll(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								formatonomifactornomiLogic.saveFormatoNomiFactorNomiRelaciones(formatonomifactornomiAux,this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados());//WithConnection
								//formatonomifactornomiLogic.getSetVersionRowFormatoNomiFactorNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.setCalificacionEmpleados(new ArrayList<CalificacionEmpleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleados= new ArrayList<CalificacionEmpleado>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							formatonomifactornomiAux.setCalificacionEmpleados(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.formatonomifactornomiSessionBean.getEstaModoGuardarRelaciones() 
								|| this.formatonomifactornomiSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(formatonomifactornomiAux,formatonomifactornomiLogic.getFormatoNomiFactorNomis());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(formatonomifactornomiAux,formatonomifactornomis);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().addAll(this.formatonomifactornomisEliminados);
					
					formatonomifactornomiLogic.saveFormatoNomiFactorNomis();//WithConnection
					//formatonomifactornomiLogic.getSetVersionRowFormatoNomiFactorNomis();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesFormatoNomiFactorNomi();
				
				this.formatonomifactornomisEliminados= new ArrayList<FormatoNomiFactorNomi>();		
			}
			
			if(this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Formato Nomi Factor Nomi GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Formato Nomi Factor Nomi",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.formatonomifactornomi=formatonomifactornomiAux;
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
      		//this.finishProcessFormatoNomiFactorNomi();
      	}
		
	}	
	
	public void actualizarRelaciones(FormatoNomiFactorNomi formatonomifactornomiLocal) throws Exception {
		
		if(this.formatonomifactornomiSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				formatonomifactornomiLocal.setCalificacionEmpleados(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados());
			
			} else {
			
				formatonomifactornomiLocal.setCalificacionEmpleados(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleados);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(FormatoNomiFactorNomi formatonomifactornomiLocal) throws Exception {	
		if(this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				formatonomifactornomiLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				formatonomifactornomiLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FormatoNomiDetalleFormJInternalFrame.class)) {
				FormatoNomiBeanSwingJInternalFrame formatonomiBeanSwingJInternalFrameLocal=(FormatoNomiBeanSwingJInternalFrame) ((FormatoNomiDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				formatonomiBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFormatoNomi(formatonomiBeanSwingJInternalFrameLocal.getformatonomi(),true);
				formatonomiBeanSwingJInternalFrameLocal.actualizarLista(formatonomiBeanSwingJInternalFrameLocal.formatonomi,this.formatonomisForeignKey);

				formatonomiBeanSwingJInternalFrameLocal.actualizarRelaciones(formatonomiBeanSwingJInternalFrameLocal.formatonomi);

				formatonomifactornomiLocal.setFormatoNomi(formatonomiBeanSwingJInternalFrameLocal.formatonomi);

				this.addItemDefectoCombosForeignKeyFormatoNomi();
				this.cargarCombosFrameFormatoNomisForeignKey("Formulario");
				this.setActualFormatoNomiForeignKey(formatonomiBeanSwingJInternalFrameLocal.formatonomi.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FactorNomiDetalleFormJInternalFrame.class)) {
				FactorNomiBeanSwingJInternalFrame factornomiBeanSwingJInternalFrameLocal=(FactorNomiBeanSwingJInternalFrame) ((FactorNomiDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				factornomiBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFactorNomi(factornomiBeanSwingJInternalFrameLocal.getfactornomi(),true);
				factornomiBeanSwingJInternalFrameLocal.actualizarLista(factornomiBeanSwingJInternalFrameLocal.factornomi,this.factornomisForeignKey);

				factornomiBeanSwingJInternalFrameLocal.actualizarRelaciones(factornomiBeanSwingJInternalFrameLocal.factornomi);

				formatonomifactornomiLocal.setFactorNomi(factornomiBeanSwingJInternalFrameLocal.factornomi);

				this.addItemDefectoCombosForeignKeyFactorNomi();
				this.cargarCombosFrameFactorNomisForeignKey("Formulario");
				this.setActualFactorNomiForeignKey(factornomiBeanSwingJInternalFrameLocal.factornomi.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarFormatoNomiFactorNomiActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = formatonomifactornomiValidator.getInvalidValues(this.formatonomifactornomi);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(FormatoNomiFactorNomi formatonomifactornomi,List<FormatoNomiFactorNomi> formatonomifactornomis) throws Exception {
		try	{		
			FormatoNomiFactorNomiConstantesFunciones.actualizarLista(formatonomifactornomi,formatonomifactornomis,this.formatonomifactornomiSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(FormatoNomiFactorNomi formatonomifactornomi,List<FormatoNomiFactorNomi> formatonomifactornomis) throws Exception {
		try	{			
			FormatoNomiFactorNomiConstantesFunciones.actualizarSelectedLista(formatonomifactornomi,formatonomifactornomis);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<FormatoNomiFactorNomi> formatonomifactornomisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				formatonomifactornomisLocal=this.formatonomifactornomiLogic.getFormatoNomiFactorNomis();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				formatonomifactornomisLocal=this.formatonomifactornomis;
			}
			//ARCHITECTURE
		
			for(FormatoNomiFactorNomi formatonomifactornomiLocal:formatonomifactornomisLocal) {
				if(this.permiteMantenimiento(formatonomifactornomiLocal) && formatonomifactornomiLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+FormatoNomiFactorNomiConstantesFunciones.getFormatoNomiFactorNomiLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(FormatoNomiFactorNomiConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jLabelid_empresaFormatoNomiFactorNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormatoNomiFactorNomiConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jLabelid_sucursalFormatoNomiFactorNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormatoNomiFactorNomiConstantesFunciones.IDFORMATONOMI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jLabelid_formato_nomiFormatoNomiFactorNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormatoNomiFactorNomiConstantesFunciones.IDFACTORNOMI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jLabelid_factor_nomiFormatoNomiFactorNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormatoNomiFactorNomiConstantesFunciones.PONDERACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jLabelponderacionFormatoNomiFactorNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormatoNomiFactorNomiConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jLabelesta_activoFormatoNomiFactorNomi,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jLabelid_empresaFormatoNomiFactorNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jLabelid_sucursalFormatoNomiFactorNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jLabelid_formato_nomiFormatoNomiFactorNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jLabelid_factor_nomiFormatoNomiFactorNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jLabelponderacionFormatoNomiFactorNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jLabelesta_activoFormatoNomiFactorNomi,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("CalificacionEmpleado")) {
			if(this.formatonomifactornomi==null) {
				this.formatonomifactornomi= new FormatoNomiFactorNomi();
			}

			if(this.formatonomifactornomiSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoFormatoNomiFactorNomi
				this.setVariablesFormularioToObjetoActualFormatoNomiFactorNomi(this.formatonomifactornomi,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiFactorNomi(this.formatonomifactornomi);

				this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.getcalificacionempleado().setFormatoNomiFactorNomi(this.formatonomifactornomi);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoFormatoNomiFactorNomi--;	
		
		
		this.formatonomifactornomiAux=new FormatoNomiFactorNomi();
		
		this.formatonomifactornomiAux.setId(this.iIdNuevoFormatoNomiFactorNomi);
		this.formatonomifactornomiAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().add(this.formatonomifactornomiAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.formatonomifactornomis.add(this.formatonomifactornomiAux);
		}
		//ARCHITECTURE
		
		this.formatonomifactornomi=this.formatonomifactornomiAux;
		
		if(FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioFormatoNomiFactorNomi(this.formatonomifactornomi);
			this.setVariablesObjetoActualToFormularioForeignKeyFormatoNomiFactorNomi(this.formatonomifactornomi);
		}
				
		//this.setDefaultControlesFormatoNomiFactorNomi();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyFormatoNomiFactorNomi();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyFormatoNomiFactorNomi();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyFormatoNomiFactorNomi();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFormatoNomiFactorNomi(this.formatonomifactornomiBean,this.formatonomifactornomi,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiFactorNomi(this.formatonomifactornomi);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.formatonomifactornomiSessionBean.getConGuardarRelaciones()) {
			classes=FormatoNomiFactorNomiConstantesFunciones.getClassesRelationshipsOfFormatoNomiFactorNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.formatonomifactornomiReturnGeneral=formatonomifactornomiLogic.procesarEventosFormatoNomiFactorNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.formatonomifactornomiLogic.getFormatoNomiFactorNomis(),this.formatonomifactornomi,this.formatonomifactornomiParameterGeneral,this.isEsNuevoFormatoNomiFactorNomi,classes);//this.formatonomifactornomiLogic.getFormatoNomiFactorNomi()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanFormatoNomiFactorNomi(this.formatonomifactornomiReturnGeneral,this.formatonomifactornomiBean,false);
		
		if(this.formatonomifactornomiReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyFormatoNomiFactorNomi(this.formatonomifactornomiReturnGeneral.getFormatoNomiFactorNomi());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioFormatoNomiFactorNomi(this.formatonomifactornomiReturnGeneral.getFormatoNomiFactorNomi());
		}
		
		if(this.formatonomifactornomiReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioFormatoNomiFactorNomi(this.formatonomifactornomiReturnGeneral.getFormatoNomiFactorNomi(),classes);//this.formatonomifactornomiBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualFormatoNomiFactorNomi(this.formatonomifactornomi,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyFormatoNomiFactorNomi();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyFormatoNomiFactorNomi();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.RecargarFormFormatoNomiFactorNomi(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingFormatoNomiFactorNomi(false);
						
			if(formatonomifactornomiSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.getEsGuardarRelacionado() && CalificacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCalificacionEmpleadoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFormatoNomiFactorNomi();
			}
			
			this.actualizarVisualTableDatosFormatoNomiFactorNomi();
			
			this.jTableDatosFormatoNomiFactorNomi.setRowSelectionInterval(this.getIndiceNuevoFormatoNomiFactorNomi(), this.getIndiceNuevoFormatoNomiFactorNomi());
			
			this.seleccionarFilaTablaFormatoNomiFactorNomiActual();
						
			this.actualizarEstadoCeldasBotonesFormatoNomiFactorNomi("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesFormatoNomiFactorNomi(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jTextFieldponderacionFormatoNomiFactorNomi.setEnabled(isHabilitar && this.formatonomifactornomiConstantesFunciones.activarponderacionFormatoNomiFactorNomi);
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jCheckBoxesta_activoFormatoNomiFactorNomi.setEnabled(isHabilitar && this.formatonomifactornomiConstantesFunciones.activaresta_activoFormatoNomiFactorNomi);	
		//
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_empresaFormatoNomiFactorNomi.setEnabled(isHabilitar && this.formatonomifactornomiConstantesFunciones.activarid_empresaFormatoNomiFactorNomi);//
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_sucursalFormatoNomiFactorNomi.setEnabled(isHabilitar && this.formatonomifactornomiConstantesFunciones.activarid_sucursalFormatoNomiFactorNomi);
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_formato_nomiFormatoNomiFactorNomi.setEnabled(isHabilitar && this.formatonomifactornomiConstantesFunciones.activarid_formato_nomiFormatoNomiFactorNomi);
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_factor_nomiFormatoNomiFactorNomi.setEnabled(isHabilitar && this.formatonomifactornomiConstantesFunciones.activarid_factor_nomiFormatoNomiFactorNomi);
	};
	
	public void setDefaultControlesFormatoNomiFactorNomi() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoFormatoNomiFactorNomi(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.formatonomifactornomiSessionBean.setConGuardarRelaciones(true);			
			this.formatonomifactornomiSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jTabbedPaneRelacionesFormatoNomiFactorNomi.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.formatonomifactornomiSessionBean.setConGuardarRelaciones(false);			
			this.formatonomifactornomiSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jTabbedPaneRelacionesFormatoNomiFactorNomi.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoFormatoNomiFactorNomi() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormatoNomiFactorNomi formatonomifactornomiAux:this.formatonomifactornomiLogic.getFormatoNomiFactorNomis()) {
				if(formatonomifactornomiAux.getId().equals(this.iIdNuevoFormatoNomiFactorNomi)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormatoNomiFactorNomi formatonomifactornomiAux:this.formatonomifactornomis) {
				if(formatonomifactornomiAux.getId().equals(this.iIdNuevoFormatoNomiFactorNomi)) {
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
	
	public int getIndiceActualFormatoNomiFactorNomi(FormatoNomiFactorNomi formatonomifactornomi,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormatoNomiFactorNomi formatonomifactornomiAux:this.formatonomifactornomiLogic.getFormatoNomiFactorNomis()) {
				if(formatonomifactornomiAux.getId().equals(formatonomifactornomi.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormatoNomiFactorNomi formatonomifactornomiAux:this.formatonomifactornomis) {
				if(formatonomifactornomiAux.getId().equals(formatonomifactornomi.getId())) {
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
	
	public void setCamposBaseDesdeOriginalFormatoNomiFactorNomi(FormatoNomiFactorNomi formatonomifactornomiOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormatoNomiFactorNomi formatonomifactornomiAux:this.formatonomifactornomiLogic.getFormatoNomiFactorNomis()) {
				if(formatonomifactornomiAux.getFormatoNomiFactorNomiOriginal().getId().equals(formatonomifactornomiOriginal.getId())) {
					existe=true;
					formatonomifactornomiOriginal.setId(formatonomifactornomiAux.getId());
					formatonomifactornomiOriginal.setVersionRow(formatonomifactornomiAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormatoNomiFactorNomi formatonomifactornomiAux:this.formatonomifactornomis) {
				if(formatonomifactornomiAux.getFormatoNomiFactorNomiOriginal().getId().equals(formatonomifactornomiOriginal.getId())) {
					existe=true;
					formatonomifactornomiOriginal.setId(formatonomifactornomiAux.getId());
					formatonomifactornomiOriginal.setVersionRow(formatonomifactornomiAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosFormatoNomiFactorNomi(Boolean esParaCancelar) throws Exception {
		formatonomifactornomisAux=new ArrayList<FormatoNomiFactorNomi>();
		formatonomifactornomiAux=new FormatoNomiFactorNomi();
		
		if(!this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FormatoNomiFactorNomi formatonomifactornomiAux:this.formatonomifactornomiLogic.getFormatoNomiFactorNomis()) {
					if(formatonomifactornomiAux.getId()<0) {
						formatonomifactornomisAux.add(formatonomifactornomiAux);
					}		
				}
				this.iIdNuevoFormatoNomiFactorNomi=0L;
				this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().removeAll(formatonomifactornomisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormatoNomiFactorNomi formatonomifactornomiAux:this.formatonomifactornomis) {
					if(formatonomifactornomiAux.getId()<0) {
						formatonomifactornomisAux.add(formatonomifactornomiAux);
					}		
				}
				this.iIdNuevoFormatoNomiFactorNomi=0L;
				this.formatonomifactornomis.removeAll(formatonomifactornomisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoFormatoNomiFactorNomi 
					&& this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().size()>0
					) {
					formatonomifactornomiAux=this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().get(this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().size() - 1);
				
					if(formatonomifactornomiAux.getId()<0) {
						this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().remove(formatonomifactornomiAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoFormatoNomiFactorNomi && this.formatonomifactornomis.size()>0) {
					formatonomifactornomiAux=this.formatonomifactornomis.get(this.formatonomifactornomis.size() - 1);
				
					if(formatonomifactornomiAux.getId()<0) {
						this.formatonomifactornomis.remove(formatonomifactornomiAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoFormatoNomiFactorNomi(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(formatonomifactornomi.getId()<0) {
				this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().remove(this.formatonomifactornomi);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(formatonomifactornomi.getId()<0) {
				this.formatonomifactornomis.remove(this.formatonomifactornomi);
			}
		}			
	}
	
	public void setEstadosInicialesFormatoNomiFactorNomi(List<FormatoNomiFactorNomi> formatonomifactornomisAux) throws Exception {
		FormatoNomiFactorNomiConstantesFunciones.setEstadosInicialesFormatoNomiFactorNomi(formatonomifactornomisAux);
	}
	
	public void setEstadosInicialesFormatoNomiFactorNomi(FormatoNomiFactorNomi formatonomifactornomiAux) throws Exception {
		FormatoNomiFactorNomiConstantesFunciones.setEstadosInicialesFormatoNomiFactorNomi(formatonomifactornomiAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarFormatoNomiFactorNomiActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesFormatoNomiFactorNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarFormatoNomiFactorNomiActual()) {
				if(!this.isEsNuevoFormatoNomiFactorNomi) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesFormatoNomiFactorNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoFormatoNomiFactorNomi=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarFormatoNomiFactorNomiActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Formato Nomi Factor Nomi ?", "MANTENIMIENTO DE Formato Nomi Factor Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesFormatoNomiFactorNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(FormatoNomiFactorNomi formatonomifactornomi) throws Exception {
		FormatoNomiFactorNomiConstantesFunciones.seleccionarAsignar(this.formatonomifactornomi,formatonomifactornomi);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarFormatoNomiFactorNomi=this.isPermisoActualizarOriginalFormatoNomiFactorNomi;
			
			
			this.seleccionarAsignar(formatonomifactornomi);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FormatoNomiFactorNomiConstantesFunciones.quitarEspaciosFormatoNomiFactorNomi(this.formatonomifactornomi,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesFormatoNomiFactorNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.formatonomifactornomiSessionBean.setsFuncionBusquedaRapida(this.formatonomifactornomiSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoFormatoNomiFactorNomi) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosFormatoNomiFactorNomi(esParaCancelar);				
				this.cancelarNuevoFormatoNomiFactorNomi(esParaCancelar);								
			}
			
			this.formatonomifactornomi=new FormatoNomiFactorNomi();
			
			this.inicializarFormatoNomiFactorNomi();
			
			this.actualizarEstadoCeldasBotonesFormatoNomiFactorNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarFormatoNomiFactorNomi() throws Exception {
		try {
			FormatoNomiFactorNomiConstantesFunciones.inicializarFormatoNomiFactorNomi(this.formatonomifactornomi);
			
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
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteFormatoNomiFactorNomis(String sAccionBusqueda,List<FormatoNomiFactorNomi> formatonomifactornomisParaReportes) throws Exception {
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
					sPathReporteFinal="FormatoNomiFactorNomi"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="FormatoNomiFactorNomiMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("FormatoNomiFactorNomiMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="FormatoNomiFactorNomi"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Formato Nomi Factor Nomis");		
		parameters.put("busquedapor", FormatoNomiFactorNomiConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(CalificacionEmpleado.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					FormatoNomiFactorNomiLogic formatonomifactornomiLogicAuxiliar=new FormatoNomiFactorNomiLogic();
					formatonomifactornomiLogicAuxiliar.setDatosCliente(formatonomifactornomiLogic.getDatosCliente());				
					formatonomifactornomiLogicAuxiliar.setFormatoNomiFactorNomis(formatonomifactornomisParaReportes);
					
					formatonomifactornomiLogicAuxiliar.cargarRelacionesLoteForeignKeyFormatoNomiFactorNomiWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					formatonomifactornomisParaReportes=formatonomifactornomiLogicAuxiliar.getFormatoNomiFactorNomis();
					
					//formatonomifactornomiLogic.getNewConnexionToDeep();
					
					//for (FormatoNomiFactorNomi formatonomifactornomi:formatonomifactornomisParaReportes) {
					//	formatonomifactornomiLogic.deepLoad(formatonomifactornomi, false, DeepLoadType.INCLUDE, classes);
					//}						
					//formatonomifactornomiLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//formatonomifactornomiLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileCalificacionEmpleado = AuxiliarReportes.class.getResourceAsStream("CalificacionEmpleadoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_calificacionempleado", reportFileCalificacionEmpleado);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceFormatoNomiFactorNomi=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			FormatoNomiFactorNomiConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			FormatoNomiFactorNomiConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceFormatoNomiFactorNomi=new JRBeanArrayDataSource(FormatoNomiFactorNomiJInternalFrame.TraerFormatoNomiFactorNomiBeans(formatonomifactornomisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceFormatoNomiFactorNomi);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+FormatoNomiFactorNomiConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+FormatoNomiFactorNomiConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(FormatoNomiFactorNomiBean.TraerFormatoNomiFactorNomiBeans(formatonomifactornomisParaReportes).toArray()));
							
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
				this.generarExcelReporteFormatoNomiFactorNomis(sAccionBusqueda,sTipoArchivoReporte,formatonomifactornomisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalFormatoNomiFactorNomis(sAccionBusqueda,sTipoArchivoReporte,formatonomifactornomisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoFormatoNomiFactorNomiActionPerformed(null);
					//this.generarExcelReporteFormatoNomiFactorNomis(sAccionBusqueda,sTipoArchivoReporte,formatonomifactornomisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalFormatoNomiFactorNomis(sAccionBusqueda,sTipoArchivoReporte,formatonomifactornomisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesFormatoNomiFactorNomis(sAccionBusqueda,sTipoArchivoReporte,formatonomifactornomisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesFormatoNomiFactorNomis(sAccionBusqueda,sTipoArchivoReporte,formatonomifactornomisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteFormatoNomiFactorNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<FormatoNomiFactorNomi> formatonomifactornomisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formatonomifactornomi";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FormatoNomiFactorNomis");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFormatoNomiFactorNomi("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(FormatoNomiFactorNomi formatonomifactornomi : formatonomifactornomisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			FormatoNomiFactorNomiConstantesFunciones.generarExcelReporteDataFormatoNomiFactorNomi("NORMAL",row,workbook,formatonomifactornomi,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato Nomi Factor Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderFormatoNomiFactorNomi(String sTipo,Row row,Workbook workbook) {
		
		FormatoNomiFactorNomiConstantesFunciones.generarExcelReporteHeaderFormatoNomiFactorNomi(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalFormatoNomiFactorNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<FormatoNomiFactorNomi> formatonomifactornomisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formatonomifactornomi_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FormatoNomiFactorNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(FormatoNomiFactorNomi formatonomifactornomi : formatonomifactornomisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(FormatoNomiFactorNomiConstantesFunciones.getFormatoNomiFactorNomiDescripcion(formatonomifactornomi));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormatoNomiFactorNomiConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormatoNomiFactorNomiConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formatonomifactornomi.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormatoNomiFactorNomiConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormatoNomiFactorNomiConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formatonomifactornomi.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFORMATONOMI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFORMATONOMI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formatonomifactornomi.getformatonomi_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFACTORNOMI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFACTORNOMI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formatonomifactornomi.getfactornomi_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormatoNomiFactorNomiConstantesFunciones.LABEL_PONDERACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormatoNomiFactorNomiConstantesFunciones.LABEL_PONDERACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formatonomifactornomi.getponderacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormatoNomiFactorNomiConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormatoNomiFactorNomiConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(formatonomifactornomi.getesta_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato Nomi Factor Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesFormatoNomiFactorNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<FormatoNomiFactorNomi> formatonomifactornomisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<FormatoNomiFactorNomi> formatonomifactornomisRespaldo=null;
		
		classes=FormatoNomiFactorNomiConstantesFunciones.getClassesRelationshipsOfFormatoNomiFactorNomi(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.formatonomifactornomiLogic.setDatosCliente(this.datosCliente);
		this.formatonomifactornomiLogic.setDatosDeep(this.datosDeep);
		this.formatonomifactornomiLogic.setIsConDeep(true);
		
		formatonomifactornomisRespaldo=this.formatonomifactornomiLogic.getFormatoNomiFactorNomis();
		
		this.formatonomifactornomiLogic.setFormatoNomiFactorNomis(formatonomifactornomisParaReportes);	
		this.formatonomifactornomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		formatonomifactornomisParaReportes=this.formatonomifactornomiLogic.getFormatoNomiFactorNomis();
		this.formatonomifactornomiLogic.setFormatoNomiFactorNomis(formatonomifactornomisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formatonomifactornomi_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FormatoNomiFactorNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFormatoNomiFactorNomi("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(FormatoNomiFactorNomi formatonomifactornomi : formatonomifactornomisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderFormatoNomiFactorNomi("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			FormatoNomiFactorNomiConstantesFunciones.generarExcelReporteDataFormatoNomiFactorNomi("NORMAL",row,workbook,formatonomifactornomi,cellStyleDataAux);
		
			
			


				//CalificacionEmpleado
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO))) {

				if(formatonomifactornomi.getCalificacionEmpleados()!=null && formatonomifactornomi.getCalificacionEmpleados().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CalificacionEmpleadoConstantesFunciones.generarExcelReporteHeaderCalificacionEmpleado("RELACIONADO",row,workbook);
				}

				if(formatonomifactornomi.getCalificacionEmpleados()!=null) {
					i2=0;
					for(CalificacionEmpleado calificacionempleado : formatonomifactornomi.getCalificacionEmpleados()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CalificacionEmpleadoConstantesFunciones.generarExcelReporteDataCalificacionEmpleado("RELACIONADO",row,workbook,calificacionempleado,cellStyleDataAuxHijo);
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
		cell.setCellValue(FormatoNomiFactorNomiConstantesFunciones.getFormatoNomiFactorNomiDescripcion(formatonomifactornomi));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato Nomi Factor Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessFormatoNomiFactorNomi() throws Exception {		
		this.startProcessFormatoNomiFactorNomi(true);
	}
	
	public void startProcessFormatoNomiFactorNomi(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasFormatoNomiFactorNomi ,this.jPanelParametrosReportesFormatoNomiFactorNomi, this.jScrollPanelDatosFormatoNomiFactorNomi,this.jPanelPaginacionFormatoNomiFactorNomi, this.jScrollPanelDatosEdicionFormatoNomiFactorNomi, this.jPanelAccionesFormatoNomiFactorNomi,this.jPanelAccionesFormularioFormatoNomiFactorNomi,this.jmenuBarFormatoNomiFactorNomi,this.jmenuBarDetalleFormatoNomiFactorNomi,this.jTtoolBarFormatoNomiFactorNomi,this.jTtoolBarDetalleFormatoNomiFactorNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasFormatoNomiFactorNomi=this.jTabbedPaneBusquedasFormatoNomiFactorNomi; 
		
		final JPanel jPanelParametrosReportesFormatoNomiFactorNomi=this.jPanelParametrosReportesFormatoNomiFactorNomi;
		//final JScrollPane jScrollPanelDatosFormatoNomiFactorNomi=this.jScrollPanelDatosFormatoNomiFactorNomi;
		final JTable jTableDatosFormatoNomiFactorNomi=this.jTableDatosFormatoNomiFactorNomi;		
		final JPanel jPanelPaginacionFormatoNomiFactorNomi=this.jPanelPaginacionFormatoNomiFactorNomi;
		//final JScrollPane jScrollPanelDatosEdicionFormatoNomiFactorNomi=this.jScrollPanelDatosEdicionFormatoNomiFactorNomi;
		final JPanel jPanelAccionesFormatoNomiFactorNomi=this.jPanelAccionesFormatoNomiFactorNomi;
		
		JPanel jPanelCamposAuxiliarFormatoNomiFactorNomi=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarFormatoNomiFactorNomi=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
			jPanelCamposAuxiliarFormatoNomiFactorNomi=this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jPanelCamposFormatoNomiFactorNomi;
			jPanelAccionesFormularioAuxiliarFormatoNomiFactorNomi=this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jPanelAccionesFormularioFormatoNomiFactorNomi;
		}
		
		final JPanel jPanelCamposFormatoNomiFactorNomi=jPanelCamposAuxiliarFormatoNomiFactorNomi;
		final JPanel jPanelAccionesFormularioFormatoNomiFactorNomi=jPanelAccionesFormularioAuxiliarFormatoNomiFactorNomi;
		
		
		final JMenuBar jmenuBarFormatoNomiFactorNomi=this.jmenuBarFormatoNomiFactorNomi;
		final JToolBar jTtoolBarFormatoNomiFactorNomi=this.jTtoolBarFormatoNomiFactorNomi;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarFormatoNomiFactorNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFormatoNomiFactorNomi=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
			jmenuBarDetalleAuxiliarFormatoNomiFactorNomi=this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jmenuBarDetalleFormatoNomiFactorNomi;
			jTtoolBarDetalleAuxiliarFormatoNomiFactorNomi=this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jTtoolBarDetalleFormatoNomiFactorNomi;
		}
		
		final JMenuBar jmenuBarDetalleFormatoNomiFactorNomi=jmenuBarDetalleAuxiliarFormatoNomiFactorNomi;
		final JToolBar jTtoolBarDetalleFormatoNomiFactorNomi=jTtoolBarDetalleAuxiliarFormatoNomiFactorNomi;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFormatoNomiFactorNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFormatoNomiFactorNomi;
			processRunnable.jTableDatos=jTableDatosFormatoNomiFactorNomi;
			processRunnable.jPanelCampos=jPanelCamposFormatoNomiFactorNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionFormatoNomiFactorNomi;
			processRunnable.jPanelAcciones=jPanelAccionesFormatoNomiFactorNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFormatoNomiFactorNomi;
			
			
			processRunnable.jmenuBar=jmenuBarFormatoNomiFactorNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFormatoNomiFactorNomi;
			processRunnable.jTtoolBar=jTtoolBarFormatoNomiFactorNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFormatoNomiFactorNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFormatoNomiFactorNomi ,jPanelParametrosReportesFormatoNomiFactorNomi,jTableDatosFormatoNomiFactorNomi, /*jScrollPanelDatosFormatoNomiFactorNomi,*/jPanelCamposFormatoNomiFactorNomi,jPanelPaginacionFormatoNomiFactorNomi, /*jScrollPanelDatosEdicionFormatoNomiFactorNomi,*/ jPanelAccionesFormatoNomiFactorNomi,jPanelAccionesFormularioFormatoNomiFactorNomi,jmenuBarFormatoNomiFactorNomi,jmenuBarDetalleFormatoNomiFactorNomi,jTtoolBarFormatoNomiFactorNomi,jTtoolBarDetalleFormatoNomiFactorNomi);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFormatoNomiFactorNomi ,jPanelParametrosReportesFormatoNomiFactorNomi, jScrollPanelDatosFormatoNomiFactorNomi,jPanelPaginacionFormatoNomiFactorNomi, jScrollPanelDatosEdicionFormatoNomiFactorNomi, jPanelAccionesFormatoNomiFactorNomi,jPanelAccionesFormularioFormatoNomiFactorNomi,jmenuBarFormatoNomiFactorNomi,jmenuBarDetalleFormatoNomiFactorNomi,jTtoolBarFormatoNomiFactorNomi,jTtoolBarDetalleFormatoNomiFactorNomi);
						
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
	
	public void finishProcessFormatoNomiFactorNomi() {// throws Exception 
		this.finishProcessFormatoNomiFactorNomi(true);
	}
	
	public void finishProcessFormatoNomiFactorNomi(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasFormatoNomiFactorNomi ,this.jPanelParametrosReportesFormatoNomiFactorNomi, this.jScrollPanelDatosFormatoNomiFactorNomi,this.jPanelPaginacionFormatoNomiFactorNomi, this.jScrollPanelDatosEdicionFormatoNomiFactorNomi, this.jPanelAccionesFormatoNomiFactorNomi,this.jPanelAccionesFormularioFormatoNomiFactorNomi,this.jmenuBarFormatoNomiFactorNomi,this.jmenuBarDetalleFormatoNomiFactorNomi,this.jTtoolBarFormatoNomiFactorNomi,this.jTtoolBarDetalleFormatoNomiFactorNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasFormatoNomiFactorNomi=this.jTabbedPaneBusquedasFormatoNomiFactorNomi; 
		
		final JPanel jPanelParametrosReportesFormatoNomiFactorNomi=this.jPanelParametrosReportesFormatoNomiFactorNomi;
		//final JScrollPane jScrollPanelDatosFormatoNomiFactorNomi=this.jScrollPanelDatosFormatoNomiFactorNomi;
		final JTable jTableDatosFormatoNomiFactorNomi=this.jTableDatosFormatoNomiFactorNomi;		
		final JPanel jPanelPaginacionFormatoNomiFactorNomi=this.jPanelPaginacionFormatoNomiFactorNomi;
		//final JScrollPane jScrollPanelDatosEdicionFormatoNomiFactorNomi=this.jScrollPanelDatosEdicionFormatoNomiFactorNomi;
		final JPanel jPanelAccionesFormatoNomiFactorNomi=this.jPanelAccionesFormatoNomiFactorNomi;
		
		JPanel jPanelCamposAuxiliarFormatoNomiFactorNomi=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarFormatoNomiFactorNomi=new JPanel();
		
		if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
			jPanelCamposAuxiliarFormatoNomiFactorNomi=this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jPanelCamposFormatoNomiFactorNomi;
			jPanelAccionesFormularioAuxiliarFormatoNomiFactorNomi=this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jPanelAccionesFormularioFormatoNomiFactorNomi;
		}
		
		final JPanel jPanelCamposFormatoNomiFactorNomi=jPanelCamposAuxiliarFormatoNomiFactorNomi;
		final JPanel jPanelAccionesFormularioFormatoNomiFactorNomi=jPanelAccionesFormularioAuxiliarFormatoNomiFactorNomi;
		
		
		final JMenuBar jmenuBarFormatoNomiFactorNomi=this.jmenuBarFormatoNomiFactorNomi;		
		final JToolBar jTtoolBarFormatoNomiFactorNomi=this.jTtoolBarFormatoNomiFactorNomi;
				
		JMenuBar jmenuBarDetalleAuxiliarFormatoNomiFactorNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFormatoNomiFactorNomi=new JToolBar();
		
		if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
			jmenuBarDetalleAuxiliarFormatoNomiFactorNomi=this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jmenuBarDetalleFormatoNomiFactorNomi;
			jTtoolBarDetalleAuxiliarFormatoNomiFactorNomi=this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jTtoolBarDetalleFormatoNomiFactorNomi;		
		}
		
		final JMenuBar jmenuBarDetalleFormatoNomiFactorNomi=jmenuBarDetalleAuxiliarFormatoNomiFactorNomi;
		final JToolBar jTtoolBarDetalleFormatoNomiFactorNomi=jTtoolBarDetalleAuxiliarFormatoNomiFactorNomi;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFormatoNomiFactorNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFormatoNomiFactorNomi;
			processRunnable.jTableDatos=jTableDatosFormatoNomiFactorNomi;
			processRunnable.jPanelCampos=jPanelCamposFormatoNomiFactorNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionFormatoNomiFactorNomi;
			processRunnable.jPanelAcciones=jPanelAccionesFormatoNomiFactorNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFormatoNomiFactorNomi;
			
			
			processRunnable.jmenuBar=jmenuBarFormatoNomiFactorNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFormatoNomiFactorNomi;
			processRunnable.jTtoolBar=jTtoolBarFormatoNomiFactorNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFormatoNomiFactorNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasFormatoNomiFactorNomi ,jPanelParametrosReportesFormatoNomiFactorNomi, jTableDatosFormatoNomiFactorNomi,/*jScrollPanelDatosFormatoNomiFactorNomi,*/jPanelCamposFormatoNomiFactorNomi,jPanelPaginacionFormatoNomiFactorNomi, /*jScrollPanelDatosEdicionFormatoNomiFactorNomi,*/ jPanelAccionesFormatoNomiFactorNomi,jPanelAccionesFormularioFormatoNomiFactorNomi,jmenuBarFormatoNomiFactorNomi,jmenuBarDetalleFormatoNomiFactorNomi,jTtoolBarFormatoNomiFactorNomi,jTtoolBarDetalleFormatoNomiFactorNomi));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesFormatoNomiFactorNomi(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarFormatoNomiFactorNomi(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuFormatoNomiFactorNomi(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarFormatoNomiFactorNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarFormatoNomiFactorNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleFormatoNomiFactorNomi,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuFormatoNomiFactorNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarFormatoNomiFactorNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleFormatoNomiFactorNomi,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.formatonomifactornomiConstantesFunciones.getsFinalQueryFormatoNomiFactorNomi();
		String  finalQueryPaginacionTodos=this.formatonomifactornomiConstantesFunciones.getsFinalQueryFormatoNomiFactorNomi();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=FormatoNomiFactorNomiConstantesFunciones.getArrayColumnasGlobalesNoFormatoNomiFactorNomi(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=FormatoNomiFactorNomiConstantesFunciones.getArrayColumnasGlobalesFormatoNomiFactorNomi(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,FormatoNomiFactorNomiConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.formatonomifactornomisEliminados= new ArrayList<FormatoNomiFactorNomi>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessFormatoNomiFactorNomi();
		
				///*FormatoNomiFactorNomiSessionBean*/this.formatonomifactornomiSessionBean=new FormatoNomiFactorNomiSessionBean();
			
			if(this.formatonomifactornomiSessionBean==null) {
				this.formatonomifactornomiSessionBean=new FormatoNomiFactorNomiSessionBean();
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
					this.iNumeroPaginacion=FormatoNomiFactorNomiConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=FormatoNomiFactorNomiConstantesFunciones.getClassesForeignKeysOfFormatoNomiFactorNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/formatonomifactornomi."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			formatonomifactornomisAux= new ArrayList<FormatoNomiFactorNomi>();
			
				
			formatonomifactornomiLogic.setDatosCliente(this.datosCliente);
			formatonomifactornomiLogic.setDatosDeep(this.datosDeep);
			formatonomifactornomiLogic.setIsConDeep(true);
			
			
			formatonomifactornomiLogic.getFormatoNomiFactorNomiDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					formatonomifactornomiLogic.getTodosFormatoNomiFactorNomis(finalQueryGlobal,pagination);
					
					//formatonomifactornomiLogic.getTodosFormatoNomiFactorNomisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(formatonomifactornomiLogic.getFormatoNomiFactorNomis()==null|| formatonomifactornomiLogic.getFormatoNomiFactorNomis().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							formatonomifactornomisAux= new ArrayList<FormatoNomiFactorNomi>();
							formatonomifactornomisAux.addAll(formatonomifactornomiLogic.getFormatoNomiFactorNomis());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomifactornomisAux= new ArrayList<FormatoNomiFactorNomi>();
							formatonomifactornomisAux.addAll(formatonomifactornomis);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							formatonomifactornomiLogic.getTodosFormatoNomiFactorNomis(finalQueryGlobal+"",this.pagination);												
							
							//formatonomifactornomiLogic.getTodosFormatoNomiFactorNomisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteFormatoNomiFactorNomis("Todos",formatonomifactornomiLogic.getFormatoNomiFactorNomis() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							formatonomifactornomiLogic.setFormatoNomiFactorNomis(new ArrayList<FormatoNomiFactorNomi>());					
							formatonomifactornomiLogic.getFormatoNomiFactorNomis().addAll(formatonomifactornomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomifactornomis=new ArrayList<FormatoNomiFactorNomi>();
							formatonomifactornomis.addAll(formatonomifactornomisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idFormatoNomiFactorNomi=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idFormatoNomiFactorNomi=this.idActual;
				
				} else if(this.idFormatoNomiFactorNomiActual!=null && this.idFormatoNomiFactorNomiActual!=0L) {
					idFormatoNomiFactorNomi=idFormatoNomiFactorNomiActual;
				}
				
					
				this.sDetalleReporte=FormatoNomiFactorNomiConstantesFunciones.getDetalleIndicePorId(idFormatoNomiFactorNomi);
				
				this.formatonomifactornomis=new ArrayList<FormatoNomiFactorNomi>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					formatonomifactornomiLogic.getEntity(idFormatoNomiFactorNomi);
					
					//formatonomifactornomiLogic.getEntityWithConnection(idFormatoNomiFactorNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatonomifactornomiLogic.setFormatoNomiFactorNomis(new ArrayList<FormatoNomiFactorNomi>());
					formatonomifactornomiLogic.getFormatoNomiFactorNomis().add(formatonomifactornomiLogic.getFormatoNomiFactorNomi());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formatonomifactornomis=new ArrayList<FormatoNomiFactorNomi>();
					this.formatonomifactornomis.add(formatonomifactornomi);
				}
				
				if(formatonomifactornomiLogic.getFormatoNomiFactorNomi()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=FormatoNomiFactorNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formatonomifactornomiLogic.getFormatoNomiFactorNomisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoNomiFactorNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoNomiFactorNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formatonomifactornomiLogic.getFormatoNomiFactorNomis()==null||formatonomifactornomiLogic.getFormatoNomiFactorNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formatonomifactornomis==null|| formatonomifactornomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomifactornomisAux=new ArrayList<FormatoNomiFactorNomi>();
						formatonomifactornomisAux.addAll(formatonomifactornomiLogic.getFormatoNomiFactorNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomifactornomisAux=new ArrayList<FormatoNomiFactorNomi>();
							formatonomifactornomisAux.addAll(formatonomifactornomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formatonomifactornomiLogic.getFormatoNomiFactorNomisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoNomiFactorNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoNomiFactorNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormatoNomiFactorNomis("FK_IdEmpresa",formatonomifactornomiLogic.getFormatoNomiFactorNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormatoNomiFactorNomis("FK_IdEmpresa",formatonomifactornomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomifactornomiLogic.setFormatoNomiFactorNomis(new ArrayList<FormatoNomiFactorNomi>());
						formatonomifactornomiLogic.getFormatoNomiFactorNomis().addAll(formatonomifactornomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomifactornomis=new ArrayList<FormatoNomiFactorNomi>();
							formatonomifactornomis.addAll(formatonomifactornomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdFactorNomi")) {
				this.sDetalleReporte=FormatoNomiFactorNomiConstantesFunciones.getDetalleIndiceFK_IdFactorNomi(id_factor_nomiFK_IdFactorNomi);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formatonomifactornomiLogic.getFormatoNomiFactorNomisFK_IdFactorNomi(finalQueryGlobal,pagination,id_factor_nomiFK_IdFactorNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoNomiFactorNomiConstantesFunciones.getDetalleIndiceFK_IdFactorNomi(id_factor_nomiFK_IdFactorNomi);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoNomiFactorNomiConstantesFunciones.getDetalleIndiceFK_IdFactorNomi(id_factor_nomiFK_IdFactorNomi);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formatonomifactornomiLogic.getFormatoNomiFactorNomis()==null||formatonomifactornomiLogic.getFormatoNomiFactorNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formatonomifactornomis==null|| formatonomifactornomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomifactornomisAux=new ArrayList<FormatoNomiFactorNomi>();
						formatonomifactornomisAux.addAll(formatonomifactornomiLogic.getFormatoNomiFactorNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomifactornomisAux=new ArrayList<FormatoNomiFactorNomi>();
							formatonomifactornomisAux.addAll(formatonomifactornomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formatonomifactornomiLogic.getFormatoNomiFactorNomisFK_IdFactorNomi(finalQueryGlobal,pagination,id_factor_nomiFK_IdFactorNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoNomiFactorNomiConstantesFunciones.getDetalleIndiceFK_IdFactorNomi(id_factor_nomiFK_IdFactorNomi);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoNomiFactorNomiConstantesFunciones.getDetalleIndiceFK_IdFactorNomi(id_factor_nomiFK_IdFactorNomi);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormatoNomiFactorNomis("FK_IdFactorNomi",formatonomifactornomiLogic.getFormatoNomiFactorNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormatoNomiFactorNomis("FK_IdFactorNomi",formatonomifactornomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomifactornomiLogic.setFormatoNomiFactorNomis(new ArrayList<FormatoNomiFactorNomi>());
						formatonomifactornomiLogic.getFormatoNomiFactorNomis().addAll(formatonomifactornomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomifactornomis=new ArrayList<FormatoNomiFactorNomi>();
							formatonomifactornomis.addAll(formatonomifactornomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdFormatoNomi")) {
				this.sDetalleReporte=FormatoNomiFactorNomiConstantesFunciones.getDetalleIndiceFK_IdFormatoNomi(id_formato_nomiFK_IdFormatoNomi);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formatonomifactornomiLogic.getFormatoNomiFactorNomisFK_IdFormatoNomi(finalQueryGlobal,pagination,id_formato_nomiFK_IdFormatoNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoNomiFactorNomiConstantesFunciones.getDetalleIndiceFK_IdFormatoNomi(id_formato_nomiFK_IdFormatoNomi);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoNomiFactorNomiConstantesFunciones.getDetalleIndiceFK_IdFormatoNomi(id_formato_nomiFK_IdFormatoNomi);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formatonomifactornomiLogic.getFormatoNomiFactorNomis()==null||formatonomifactornomiLogic.getFormatoNomiFactorNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formatonomifactornomis==null|| formatonomifactornomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomifactornomisAux=new ArrayList<FormatoNomiFactorNomi>();
						formatonomifactornomisAux.addAll(formatonomifactornomiLogic.getFormatoNomiFactorNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomifactornomisAux=new ArrayList<FormatoNomiFactorNomi>();
							formatonomifactornomisAux.addAll(formatonomifactornomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formatonomifactornomiLogic.getFormatoNomiFactorNomisFK_IdFormatoNomi(finalQueryGlobal,pagination,id_formato_nomiFK_IdFormatoNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoNomiFactorNomiConstantesFunciones.getDetalleIndiceFK_IdFormatoNomi(id_formato_nomiFK_IdFormatoNomi);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoNomiFactorNomiConstantesFunciones.getDetalleIndiceFK_IdFormatoNomi(id_formato_nomiFK_IdFormatoNomi);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormatoNomiFactorNomis("FK_IdFormatoNomi",formatonomifactornomiLogic.getFormatoNomiFactorNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormatoNomiFactorNomis("FK_IdFormatoNomi",formatonomifactornomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomifactornomiLogic.setFormatoNomiFactorNomis(new ArrayList<FormatoNomiFactorNomi>());
						formatonomifactornomiLogic.getFormatoNomiFactorNomis().addAll(formatonomifactornomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomifactornomis=new ArrayList<FormatoNomiFactorNomi>();
							formatonomifactornomis.addAll(formatonomifactornomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=FormatoNomiFactorNomiConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formatonomifactornomiLogic.getFormatoNomiFactorNomisFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoNomiFactorNomiConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoNomiFactorNomiConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formatonomifactornomiLogic.getFormatoNomiFactorNomis()==null||formatonomifactornomiLogic.getFormatoNomiFactorNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formatonomifactornomis==null|| formatonomifactornomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomifactornomisAux=new ArrayList<FormatoNomiFactorNomi>();
						formatonomifactornomisAux.addAll(formatonomifactornomiLogic.getFormatoNomiFactorNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomifactornomisAux=new ArrayList<FormatoNomiFactorNomi>();
							formatonomifactornomisAux.addAll(formatonomifactornomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formatonomifactornomiLogic.getFormatoNomiFactorNomisFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoNomiFactorNomiConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoNomiFactorNomiConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormatoNomiFactorNomis("FK_IdSucursal",formatonomifactornomiLogic.getFormatoNomiFactorNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormatoNomiFactorNomis("FK_IdSucursal",formatonomifactornomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomifactornomiLogic.setFormatoNomiFactorNomis(new ArrayList<FormatoNomiFactorNomi>());
						formatonomifactornomiLogic.getFormatoNomiFactorNomis().addAll(formatonomifactornomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomifactornomis=new ArrayList<FormatoNomiFactorNomi>();
							formatonomifactornomis.addAll(formatonomifactornomisAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesFormatoNomiFactorNomi();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessFormatoNomiFactorNomi();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=formatonomifactornomiLogic.getFormatoNomiFactorNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formatonomifactornomis.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=formatonomifactornomiLogic.getFormatoNomiFactorNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formatonomifactornomis.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(FormatoNomiFactorNomi formatonomifactornomi) {
		Boolean permite=true;
		
		if(this.formatonomifactornomi.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=FormatoNomiFactorNomiConstantesFunciones.getOrderByListaFormatoNomiFactorNomi();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=FormatoNomiFactorNomiConstantesFunciones.getOrderByListaFormatoNomiFactorNomi();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormatoNomiFactorNomi formatonomifactornomi:formatonomifactornomiLogic.getFormatoNomiFactorNomis()) {
				if(formatonomifactornomi.getsType().equals(Constantes2.S_TOTALES)) {
					formatonomifactornomiTotales=formatonomifactornomi;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormatoNomiFactorNomi formatonomifactornomi:this.formatonomifactornomis) {
				if(formatonomifactornomi.getsType().equals(Constantes2.S_TOTALES)) {
					formatonomifactornomiTotales=formatonomifactornomi;
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
			this.formatonomifactornomiAux=new FormatoNomiFactorNomi();
			this.formatonomifactornomiAux.setsType(Constantes2.S_TOTALES);
			this.formatonomifactornomiAux.setIsNew(false);
			this.formatonomifactornomiAux.setIsChanged(false);
			this.formatonomifactornomiAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				FormatoNomiFactorNomiConstantesFunciones.TotalizarValoresFilaFormatoNomiFactorNomi(this.formatonomifactornomiLogic.getFormatoNomiFactorNomis(),this.formatonomifactornomiAux);
				
				this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().add(this.formatonomifactornomiAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				FormatoNomiFactorNomiConstantesFunciones.TotalizarValoresFilaFormatoNomiFactorNomi(this.formatonomifactornomis,this.formatonomifactornomiAux);
				
				this.formatonomifactornomis.add(this.formatonomifactornomiAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		formatonomifactornomiTotales=new FormatoNomiFactorNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().remove(formatonomifactornomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.formatonomifactornomis.remove(formatonomifactornomiTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		formatonomifactornomiTotales=new FormatoNomiFactorNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormatoNomiFactorNomi formatonomifactornomi:formatonomifactornomiLogic.getFormatoNomiFactorNomis()) {
				if(formatonomifactornomi.getsType().equals(Constantes2.S_TOTALES)) {
					formatonomifactornomiTotales=formatonomifactornomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FormatoNomiFactorNomiConstantesFunciones.TotalizarValoresFilaFormatoNomiFactorNomi(this.formatonomifactornomiLogic.getFormatoNomiFactorNomis(),formatonomifactornomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormatoNomiFactorNomi formatonomifactornomi:this.formatonomifactornomis) {
				if(formatonomifactornomi.getsType().equals(Constantes2.S_TOTALES)) {
					formatonomifactornomiTotales=formatonomifactornomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FormatoNomiFactorNomiConstantesFunciones.TotalizarValoresFilaFormatoNomiFactorNomi(this.formatonomifactornomis,formatonomifactornomiTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getFormatoNomiFactorNomisFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormatoNomiFactorNomisFK_IdFactorNomi()throws Exception {
		try {
			sAccionBusqueda="FK_IdFactorNomi";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormatoNomiFactorNomisFK_IdFormatoNomi()throws Exception {
		try {
			sAccionBusqueda="FK_IdFormatoNomi";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormatoNomiFactorNomisFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getFormatoNomiFactorNomisFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatonomifactornomiLogic.getFormatoNomiFactorNomisFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormatoNomiFactorNomisFK_IdFactorNomi(String sFinalQuery,Long id_factor_nomi)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatonomifactornomiLogic.getFormatoNomiFactorNomisFK_IdFactorNomi(sFinalQuery,this.pagination,id_factor_nomi);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormatoNomiFactorNomisFK_IdFormatoNomi(String sFinalQuery,Long id_formato_nomi)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatonomifactornomiLogic.getFormatoNomiFactorNomisFK_IdFormatoNomi(sFinalQuery,this.pagination,id_formato_nomi);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormatoNomiFactorNomisFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatonomifactornomiLogic.getFormatoNomiFactorNomisFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosFormatoNomiFactorNomi() {
		this.isPermisoTodoFormatoNomiFactorNomi=false;
		this.isPermisoNuevoFormatoNomiFactorNomi=false;
		this.isPermisoActualizarFormatoNomiFactorNomi=false;
		this.isPermisoActualizarOriginalFormatoNomiFactorNomi=false;
		this.isPermisoEliminarFormatoNomiFactorNomi=false;
		this.isPermisoGuardarCambiosFormatoNomiFactorNomi=false;
		this.isPermisoConsultaFormatoNomiFactorNomi=false;
		this.isPermisoBusquedaFormatoNomiFactorNomi=false;
		this.isPermisoReporteFormatoNomiFactorNomi=false;		
		this.isPermisoOrdenFormatoNomiFactorNomi=false;		
		this.isPermisoPaginacionMedioFormatoNomiFactorNomi=false;		
		this.isPermisoPaginacionAltoFormatoNomiFactorNomi=false;
		this.isPermisoPaginacionTodoFormatoNomiFactorNomi=false;
		this.isPermisoCopiarFormatoNomiFactorNomi=false;		
		this.isPermisoVerFormFormatoNomiFactorNomi=false;		
		this.isPermisoDuplicarFormatoNomiFactorNomi=false;		
		this.isPermisoOrdenFormatoNomiFactorNomi=false;		
	}
	
	public void setPermisosUsuarioFormatoNomiFactorNomi(Boolean isPermiso) {
		this.isPermisoTodoFormatoNomiFactorNomi=isPermiso;
		this.isPermisoNuevoFormatoNomiFactorNomi=isPermiso;
		this.isPermisoActualizarFormatoNomiFactorNomi=isPermiso;
		this.isPermisoActualizarOriginalFormatoNomiFactorNomi=isPermiso;
		this.isPermisoEliminarFormatoNomiFactorNomi=isPermiso;
		this.isPermisoGuardarCambiosFormatoNomiFactorNomi=isPermiso;
		this.isPermisoConsultaFormatoNomiFactorNomi=isPermiso;
		this.isPermisoBusquedaFormatoNomiFactorNomi=isPermiso;
		this.isPermisoReporteFormatoNomiFactorNomi=isPermiso;
		this.isPermisoOrdenFormatoNomiFactorNomi=isPermiso;		
		this.isPermisoPaginacionMedioFormatoNomiFactorNomi=isPermiso;		
		this.isPermisoPaginacionAltoFormatoNomiFactorNomi=isPermiso;		
		this.isPermisoPaginacionTodoFormatoNomiFactorNomi=isPermiso;		
		this.isPermisoCopiarFormatoNomiFactorNomi=isPermiso;		
		this.isPermisoVerFormFormatoNomiFactorNomi=isPermiso;		
		this.isPermisoDuplicarFormatoNomiFactorNomi=isPermiso;
		this.isPermisoOrdenFormatoNomiFactorNomi=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioFormatoNomiFactorNomi(Boolean isPermiso) {
		//this.isPermisoTodoFormatoNomiFactorNomi=isPermiso;
		this.isPermisoNuevoFormatoNomiFactorNomi=isPermiso;
		this.isPermisoActualizarFormatoNomiFactorNomi=isPermiso;
		this.isPermisoActualizarOriginalFormatoNomiFactorNomi=isPermiso;
		this.isPermisoEliminarFormatoNomiFactorNomi=isPermiso;
		this.isPermisoGuardarCambiosFormatoNomiFactorNomi=isPermiso;
		//this.isPermisoConsultaFormatoNomiFactorNomi=isPermiso;
		//this.isPermisoBusquedaFormatoNomiFactorNomi=isPermiso;
		//this.isPermisoReporteFormatoNomiFactorNomi=isPermiso;
		//this.isPermisoOrdenFormatoNomiFactorNomi=isPermiso;		
		//this.isPermisoPaginacionMedioFormatoNomiFactorNomi=isPermiso;		
		//this.isPermisoPaginacionAltoFormatoNomiFactorNomi=isPermiso;		
		//this.isPermisoPaginacionTodoFormatoNomiFactorNomi=isPermiso;		
		//this.isPermisoCopiarFormatoNomiFactorNomi=isPermiso;		
		//this.isPermisoDuplicarFormatoNomiFactorNomi=isPermiso;
		//this.isPermisoOrdenFormatoNomiFactorNomi=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioFormatoNomiFactorNomiClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(CalificacionEmpleadoConstantesFunciones.SNOMBREOPCION);
		
		if(FormatoNomiFactorNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosCalificacionEmpleado=false;
		this.isTienePermisosCalificacionEmpleado=this.verificarGetPermisosUsuarioOpcionFormatoNomiFactorNomiClaseRelacionada(this.opcionsRelacionadas,CalificacionEmpleadoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebFormatoNomiFactorNomi(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioFormatoNomiFactorNomiClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCalificacionEmpleado=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioFormatoNomiFactorNomiClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionFormatoNomiFactorNomiClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioFormatoNomiFactorNomiClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCalificacionEmpleado && this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null && this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jTabbedPaneRelacionesFormatoNomiFactorNomi.remove(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioFormatoNomiFactorNomi() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(FormatoNomiFactorNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, FormatoNomiFactorNomiConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoFormatoNomiFactorNomi=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarFormatoNomiFactorNomi=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalFormatoNomiFactorNomi=this.isPermisoActualizarFormatoNomiFactorNomi;
			this.isPermisoEliminarFormatoNomiFactorNomi=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosFormatoNomiFactorNomi=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaFormatoNomiFactorNomi=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaFormatoNomiFactorNomi=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoFormatoNomiFactorNomi=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteFormatoNomiFactorNomi=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFormatoNomiFactorNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioFormatoNomiFactorNomi=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoFormatoNomiFactorNomi=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoFormatoNomiFactorNomi=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarFormatoNomiFactorNomi=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormFormatoNomiFactorNomi=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarFormatoNomiFactorNomi=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFormatoNomiFactorNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosFormatoNomiFactorNomi.setToolTipText(this.jTableDatosFormatoNomiFactorNomi.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioFormatoNomiFactorNomi(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioFormatoNomiFactorNomi(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(FormatoNomiFactorNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(FormatoNomiFactorNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioFormatoNomiFactorNomi() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCalificacionEmpleado && this.formatonomifactornomiConstantesFunciones.mostrarCalificacionEmpleadoFormatoNomiFactorNomi && !FormatoNomiFactorNomiConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Calificacion Empleado");
			reporte.setsDescripcion("Calificacion Empleado");
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
	public void inicializarCombosForeignKeyFormatoNomiFactorNomiListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.formatonomisForeignKey=new ArrayList();
				this.factornomisForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyFormatoNomiFactorNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(FormatoNomiFactorNomiJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyFormatoNomiFactorNomiListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFormatoNomiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFactorNomiListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeySucursalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SucursalConstantesFunciones.SFINALQUERY;

				this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFormatoNomiListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.formatonomisForeignKey==null||this.formatonomisForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FormatoNomiConstantesFunciones.getArrayColumnasGlobalesFormatoNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoNomiConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FormatoNomiConstantesFunciones.SFINALQUERY;

				this.cargarCombosFormatoNomisForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFactorNomiListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.factornomisForeignKey==null||this.factornomisForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FactorNomiConstantesFunciones.getArrayColumnasGlobalesFactorNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FactorNomiConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FactorNomiConstantesFunciones.SFINALQUERY;

				this.cargarCombosFactorNomisForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyFormatoNomiFactorNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			FormatoNomiFactorNomiParameterReturnGeneral formatonomifactornomiReturnGeneral=new FormatoNomiFactorNomiParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.formatonomifactornomiConstantesFunciones.cargarid_empresaFormatoNomiFactorNomi)
					 || (this.esRecargarFks && this.formatonomifactornomiConstantesFunciones.cargarid_empresaFormatoNomiFactorNomi)) {

					if(!this.formatonomifactornomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+formatonomifactornomiSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.formatonomifactornomiConstantesFunciones.cargarid_sucursalFormatoNomiFactorNomi)
					 || (this.esRecargarFks && this.formatonomifactornomiConstantesFunciones.cargarid_sucursalFormatoNomiFactorNomi)) {

					if(!this.formatonomifactornomiSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+formatonomifactornomiSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalFormatoNomi="";

				if(((this.formatonomisForeignKey==null||this.formatonomisForeignKey.size()<=0) && this.formatonomifactornomiConstantesFunciones.cargarid_formato_nomiFormatoNomiFactorNomi)
					 || (this.esRecargarFks && this.formatonomifactornomiConstantesFunciones.cargarid_formato_nomiFormatoNomiFactorNomi)) {

					if(!this.formatonomifactornomiSessionBean.getisBusquedaDesdeForeignKeySesionFormatoNomi()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FormatoNomiConstantesFunciones.getArrayColumnasGlobalesFormatoNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFormatoNomi=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoNomiConstantesFunciones.TABLENAME);

						finalQueryGlobalFormatoNomi=Funciones.GetFinalQueryAppend(finalQueryGlobalFormatoNomi, "");
						finalQueryGlobalFormatoNomi+=FormatoNomiConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFormatoNomisForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFormatoNomi=" WHERE " + ConstantesSql.ID + "="+formatonomifactornomiSessionBean.getlidFormatoNomiActual();
					}
				} else {
					finalQueryGlobalFormatoNomi="NONE";
				}


				String finalQueryGlobalFactorNomi="";

				if(((this.factornomisForeignKey==null||this.factornomisForeignKey.size()<=0) && this.formatonomifactornomiConstantesFunciones.cargarid_factor_nomiFormatoNomiFactorNomi)
					 || (this.esRecargarFks && this.formatonomifactornomiConstantesFunciones.cargarid_factor_nomiFormatoNomiFactorNomi)) {

					if(!this.formatonomifactornomiSessionBean.getisBusquedaDesdeForeignKeySesionFactorNomi()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FactorNomiConstantesFunciones.getArrayColumnasGlobalesFactorNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFactorNomi=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FactorNomiConstantesFunciones.TABLENAME);

						finalQueryGlobalFactorNomi=Funciones.GetFinalQueryAppend(finalQueryGlobalFactorNomi, "");
						finalQueryGlobalFactorNomi+=FactorNomiConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFactorNomisForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFactorNomi=" WHERE " + ConstantesSql.ID + "="+formatonomifactornomiSessionBean.getlidFactorNomiActual();
					}
				} else {
					finalQueryGlobalFactorNomi="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				formatonomifactornomiReturnGeneral=formatonomifactornomiLogic.cargarCombosLoteForeignKeyFormatoNomiFactorNomi(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalFormatoNomi,finalQueryGlobalFactorNomi);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=formatonomifactornomiReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=formatonomifactornomiReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalFormatoNomi.equals("NONE")) {
				this.formatonomisForeignKey=formatonomifactornomiReturnGeneral.getformatonomisForeignKey();
			}

			if(!finalQueryGlobalFactorNomi.equals("NONE")) {
				this.factornomisForeignKey=formatonomifactornomiReturnGeneral.getfactornomisForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyFormatoNomiFactorNomi()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyFormatoNomi();
			this.addItemDefectoCombosForeignKeyFactorNomi();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.formatonomifactornomiSessionBean==null) {
				this.formatonomifactornomiSessionBean=new FormatoNomiFactorNomiSessionBean();
			}

			if(!this.formatonomifactornomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeySucursal()throws Exception {
		try {

			if(!this.formatonomifactornomiSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				Sucursal sucursal=new Sucursal();
				SucursalConstantesFunciones.setSucursalDescripcion(sucursal,Constantes.SMENSAJE_ESCOJA_OPCION);
				sucursal.setId(null);

				if(!SucursalConstantesFunciones.ExisteEnLista(this.sucursalsForeignKey,sucursal,true)) {

					this.sucursalsForeignKey.add(0,sucursal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyFormatoNomi()throws Exception {
		try {

			if(!this.formatonomifactornomiSessionBean.getisBusquedaDesdeForeignKeySesionFormatoNomi()) {
				FormatoNomi formatonomi=new FormatoNomi();
				FormatoNomiConstantesFunciones.setFormatoNomiDescripcion(formatonomi,Constantes.SMENSAJE_ESCOJA_OPCION);
				formatonomi.setId(null);

				if(!FormatoNomiConstantesFunciones.ExisteEnLista(this.formatonomisForeignKey,formatonomi,true)) {

					this.formatonomisForeignKey.add(0,formatonomi);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyFactorNomi()throws Exception {
		try {

			if(!this.formatonomifactornomiSessionBean.getisBusquedaDesdeForeignKeySesionFactorNomi()) {
				FactorNomi factornomi=new FactorNomi();
				FactorNomiConstantesFunciones.setFactorNomiDescripcion(factornomi,Constantes.SMENSAJE_ESCOJA_OPCION);
				factornomi.setId(null);

				if(!FactorNomiConstantesFunciones.ExisteEnLista(this.factornomisForeignKey,factornomi,true)) {

					this.factornomisForeignKey.add(0,factornomi);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyFormatoNomiFactorNomi()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyFormatoNomiFactorNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyFormatoNomiFactorNomi()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyFormatoNomiFactorNomi();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyFormatoNomiFactorNomi(FormatoNomiFactorNomi formatonomifactornomi)throws Exception {	
		try {
			
			this.setActualFormatoNomiForeignKey(formatonomifactornomi.getid_formato_nomi(),false,"Formulario");
			this.setActualFactorNomiForeignKey(formatonomifactornomi.getid_factor_nomi(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyFormatoNomiFactorNomi(FormatoNomiFactorNomi formatonomifactornomi,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyFormatoNomiFactorNomi()throws Exception {	
		try {
			
			this.setActualFormatoNomiForeignKey(this.formatonomifactornomiConstantesFunciones.getid_formato_nomi(),false,"Formulario");
			this.setActualFactorNomiForeignKey(this.formatonomifactornomiConstantesFunciones.getid_factor_nomi(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyFormatoNomiFactorNomi()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyFormatoNomiFactorNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyFormatoNomiFactorNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroFormatoNomiFactorNomi()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyFormatoNomiFactorNomi()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameFormatoNomisForeignKey("Todos");
			this.cargarCombosFrameFactorNomisForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyFormatoNomiFactorNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFormatoNomisForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFactorNomisForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyFormatoNomiFactorNomi()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_empresaFormatoNomiFactorNomi!=null && this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_empresaFormatoNomiFactorNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_empresaFormatoNomiFactorNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_sucursalFormatoNomiFactorNomi!=null && this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_sucursalFormatoNomiFactorNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_sucursalFormatoNomiFactorNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_formato_nomiFormatoNomiFactorNomi!=null && this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_formato_nomiFormatoNomiFactorNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_formato_nomiFormatoNomiFactorNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_factor_nomiFormatoNomiFactorNomi!=null && this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_factor_nomiFormatoNomiFactorNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_factor_nomiFormatoNomiFactorNomi.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public FormatoNomiFactorNomiBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public FormatoNomiFactorNomiBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public FormatoNomiFactorNomiBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.formatonomifactornomiSessionBean=new FormatoNomiFactorNomiSessionBean(); 
		this.formatonomifactornomiConstantesFunciones=new FormatoNomiFactorNomiConstantesFunciones(); 
		this.formatonomifactornomiBean=new FormatoNomiFactorNomi();//(this.formatonomifactornomiConstantesFunciones); 		
		this.formatonomifactornomiReturnGeneral=new FormatoNomiFactorNomiParameterReturnGeneral(); 
		
		this.formatonomifactornomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formatonomifactornomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public FormatoNomiFactorNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public FormatoNomiFactorNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public FormatoNomiFactorNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessFormatoNomiFactorNomi(true);
			
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
			
			this.formatonomifactornomiConstantesFunciones=new FormatoNomiFactorNomiConstantesFunciones(); 
			this.formatonomifactornomiBean=new FormatoNomiFactorNomi();//this.formatonomifactornomiConstantesFunciones); 			
			this.formatonomifactornomiReturnGeneral=new FormatoNomiFactorNomiParameterReturnGeneral(); 
		
			FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Formato Nomi Factor Nomi Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.formatonomifactornomi=new FormatoNomiFactorNomi();
			this.formatonomifactornomis = new ArrayList<FormatoNomiFactorNomi>();
			this.formatonomifactornomisAux = new ArrayList<FormatoNomiFactorNomi>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic=new FormatoNomiFactorNomiLogic();
				this.formatonomifactornomiLogic.getNewConnexionToDeep("");
			}
			
			//this.formatonomifactornomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.formatonomifactornomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormFormatoNomiFactorNomi);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi);	
					}
					
					if(this.jInternalFrameImportacionFormatoNomiFactorNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFormatoNomiFactorNomi);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByFormatoNomiFactorNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByFormatoNomiFactorNomi);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormFormatoNomiFactorNomi);
				this.jInternalFrameDetalleFormFormatoNomiFactorNomi.setVisible(false);
				this.jInternalFrameDetalleFormFormatoNomiFactorNomi.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi);
					this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.setVisible(false);
					this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionFormatoNomiFactorNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionFormatoNomiFactorNomi);
					this.jInternalFrameImportacionFormatoNomiFactorNomi.setVisible(false);
					this.jInternalFrameImportacionFormatoNomiFactorNomi.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByFormatoNomiFactorNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByFormatoNomiFactorNomi);
					this.jInternalFrameOrderByFormatoNomiFactorNomi.setVisible(false);
					this.jInternalFrameOrderByFormatoNomiFactorNomi.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idFormatoNomiFactorNomiActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=FormatoNomiFactorNomiConstantesFunciones.INUMEROPAGINACION;
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
			
			this.formatonomifactornomiReturnGeneral=new FormatoNomiFactorNomiParameterReturnGeneral();
			
			this.formatonomifactornomiParameterGeneral=new FormatoNomiFactorNomiParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.formatonomifactornomiLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
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
			
			if(FormatoNomiFactorNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(CalificacionEmpleadoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FormatoNomiFactorNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.formatonomifactornomiSessionBean.getEsGuardarRelacionado(),this.formatonomifactornomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FormatoNomiFactorNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.formatonomifactornomiSessionBean.getEsGuardarRelacionado(),this.formatonomifactornomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaDuplicarFormatoNomiFactorNomi=true;
			this.isVisibilidadCeldaCopiarFormatoNomiFactorNomi=true;
			this.isVisibilidadCeldaVerFormFormatoNomiFactorNomi=true;
			this.isVisibilidadCeldaOrdenFormatoNomiFactorNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaModificarFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaActualizarFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaEliminarFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaCancelarFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaGuardarFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaGuardarCambiosFormatoNomiFactorNomi=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdFactorNomi=true;
			this.isVisibilidadFK_IdFormatoNomi=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesFormatoNomiFactorNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosFormatoNomiFactorNomi();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioFormatoNomiFactorNomi(false);
			
			this.setPermisosUsuarioFormatoNomiFactorNomi();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.formatonomifactornomiSessionBean.getEsGuardarRelacionado() 
				|| (this.formatonomifactornomiSessionBean.getEsGuardarRelacionado() && this.formatonomifactornomiSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioFormatoNomiFactorNomiClasesRelacionadas();
			}
			
			if(this.formatonomifactornomiSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioFormatoNomiFactorNomiClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosFormatoNomiFactorNomi();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualFormatoNomiFactorNomi();
			}
			
			if(!this.isPermisoBusquedaFormatoNomiFactorNomi) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasFormatoNomiFactorNomi.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioFormatoNomiFactorNomi,this.isPermisoPaginacionMedioFormatoNomiFactorNomi,this.isPermisoPaginacionTodoFormatoNomiFactorNomi);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(FormatoNomiFactorNomiConstantesFunciones.getTiposSeleccionarFormatoNomiFactorNomi());
				
				this.tiposColumnasSelect=FormatoNomiFactorNomiConstantesFunciones.getTiposSeleccionarFormatoNomiFactorNomi(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectFormatoNomiFactorNomi();				
				//this.tiposRelacionesSelect=FormatoNomiFactorNomiConstantesFunciones.getTiposRelacionesFormatoNomiFactorNomi(true);
				
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
			//if(!this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioFormatoNomiFactorNomi();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioFormatoNomiFactorNomi(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioFormatoNomiFactorNomi(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesFormatoNomiFactorNomi() ;
			
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
			
			
			this.calificacionempleadoLogic=new CalificacionEmpleadoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.formatonomiLogic=new FormatoNomiLogic();
			this.factornomiLogic=new FactorNomiLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				formatonomifactornomiImplementable= (FormatoNomiFactorNomiImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FormatoNomiFactorNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				formatonomifactornomiImplementableHome= (FormatoNomiFactorNomiImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FormatoNomiFactorNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.formatonomifactornomis= new ArrayList<FormatoNomiFactorNomi>();
			this.formatonomifactornomisEliminados= new ArrayList<FormatoNomiFactorNomi>();
						
			this.isEsNuevoFormatoNomiFactorNomi=false;
			this.esParaAccionDesdeFormularioFormatoNomiFactorNomi=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.formatonomisForeignKey=new ArrayList<FormatoNomi>() ;
			this.factornomisForeignKey=new ArrayList<FactorNomi>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyFormatoNomiFactorNomi(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroFormatoNomiFactorNomi();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=FormatoNomiFactorNomiConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesFormatoNomiFactorNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingFormatoNomiFactorNomi(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioFormatoNomiFactorNomi();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioFormatoNomiFactorNomi();
			}
			
			FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasFormatoNomiFactorNomi.getTabCount(); i++) {
					this.jTabbedPaneBusquedasFormatoNomiFactorNomi.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasFormatoNomiFactorNomi.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessFormatoNomiFactorNomi(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga FormatoNomiFactorNomi: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectFormatoNomiFactorNomi() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesFormatoNomiFactorNomi")) {
				iIndex=this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jTabbedPaneRelacionesFormatoNomiFactorNomi.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jTabbedPaneRelacionesFormatoNomiFactorNomi.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();	
				
				

				if(sTitle.equals("Calificacion Empleados")) {
					if(!CalificacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessFormatoNomiFactorNomi();

						this.cargarParteTabPanelRelacionadaCalificacionEmpleado(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessFormatoNomiFactorNomi();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCalificacionEmpleado(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.cargarSessionConBeanSwingJInternalFrameCalificacionEmpleado(false,true,iIndex);
		this.jButtonCalificacionEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCalificacionEmpleado();

		//this.jTabbedPaneRelacionesFormatoNomiFactorNomi.updateUI();
		//this.jTabbedPaneRelacionesFormatoNomiFactorNomi.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesFormatoNomiFactorNomi.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("CalificacionEmpleado")) {
				int row=this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();
				jButtonCalificacionEmpleadoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Calificacion Empleado")) {

					if(this.isTienePermisosCalificacionEmpleado && this.formatonomifactornomiConstantesFunciones.mostrarCalificacionEmpleadoFormatoNomiFactorNomi && !FormatoNomiFactorNomiConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Calificacion Empleados"+"("+CalificacionEmpleadoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Calificacion Empleados");

						if(formatonomifactornomiConstantesFunciones.resaltarCalificacionEmpleadoFormatoNomiFactorNomi!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(formatonomifactornomiConstantesFunciones.resaltarCalificacionEmpleadoFormatoNomiFactorNomi);
						}

						jmenuItem.setEnabled(this.formatonomifactornomiConstantesFunciones.activarCalificacionEmpleadoFormatoNomiFactorNomi);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"CalificacionEmpleado"));

						

						this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jmenuDetalleFormatoNomiFactorNomi.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyFormatoNomiFactorNomi(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyFormatoNomiFactorNomi(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyFormatoNomiFactorNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyFormatoNomiFactorNomiListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyFormatoNomiFactorNomi();
		
		this.cargarCombosFrameForeignKeyFormatoNomiFactorNomi();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyFormatoNomiFactorNomi();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyFormatoNomiFactorNomi();
		}
	}
	
	

	public void cargarCombosForeignKeyFormatoNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFormatoNomiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFormatoNomi();
				this.cargarCombosFrameFormatoNomisForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaFormatoNomi(this.formatonomisForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFactorNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFactorNomiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFactorNomi();
				this.cargarCombosFrameFactorNomisForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaFactorNomi(this.factornomisForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoFormatoNomiFactorNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.formatonomifactornomiSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
			
			
			if(jTableDatosFormatoNomiFactorNomi.getRowCount()>=1) {
				jTableDatosFormatoNomiFactorNomi.removeRowSelectionInterval(0, jTableDatosFormatoNomiFactorNomi.getRowCount()-1);						
			}
			
			this.isEsNuevoFormatoNomiFactorNomi=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoFormatoNomiFactorNomi(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesFormatoNomiFactorNomi(true);			
			//this.formatonomifactornomi=new FormatoNomiFactorNomi();
			//this.formatonomifactornomi.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFormatoNomiFactorNomi(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormatoNomiFactorNomi() ;
			
			if(FormatoNomiFactorNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFormatoNomiFactorNomi(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.formatonomifactornomi);	
			this.actualizarInformacion("INFO_PADRE",false,this.formatonomifactornomi);				
			
			FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
			
			if(this.formatonomifactornomiSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar FormatoNomiFactorNomi: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarFormatoNomiFactorNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<FormatoNomiFactorNomi> formatonomifactornomisSeleccionados=new ArrayList<FormatoNomiFactorNomi>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosFormatoNomiFactorNomi.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosFormatoNomiFactorNomi.getSelectedRows().length;			
			}
			
			formatonomifactornomisSeleccionados=this.getFormatoNomiFactorNomisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoFormatoNomiFactorNomi--;			
				//FormatoNomiFactorNomi formatonomifactornomiAux= new FormatoNomiFactorNomi();			
				//formatonomifactornomiAux.setId(this.iIdNuevoFormatoNomiFactorNomi);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//FormatoNomiFactorNomi formatonomifactornomiOrigen=new FormatoNomiFactorNomi();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(FormatoNomiFactorNomi formatonomifactornomiOrigen : formatonomifactornomisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							formatonomifactornomiOrigen =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomifactornomiOrigen =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaFormatoNomiFactorNomi();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.formatonomifactornomi.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosFormatoNomiFactorNomi(formatonomifactornomiOrigen,this.formatonomifactornomi,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiFactorNomi(this.formatonomifactornomi);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().add(this.formatonomifactornomiAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.formatonomifactornomis.add(this.formatonomifactornomiAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaFormatoNomiFactorNomi(false);
				
				this.jTableDatosFormatoNomiFactorNomi.setRowSelectionInterval(this.getIndiceNuevoFormatoNomiFactorNomi(), this.getIndiceNuevoFormatoNomiFactorNomi());
				
				int iLastRow =  this.jTableDatosFormatoNomiFactorNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFormatoNomiFactorNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFormatoNomiFactorNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFormatoNomiFactorNomi(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarFormatoNomiFactorNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<FormatoNomiFactorNomi> formatonomifactornomisSeleccionados=new ArrayList<FormatoNomiFactorNomi>();									
		
			FormatoNomiFactorNomi formatonomifactornomiOrigen=new FormatoNomiFactorNomi();
			FormatoNomiFactorNomi formatonomifactornomiDestino=new FormatoNomiFactorNomi();
				
			formatonomifactornomisSeleccionados=this.getFormatoNomiFactorNomisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosFormatoNomiFactorNomi.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || formatonomifactornomisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosFormatoNomiFactorNomi.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomifactornomiOrigen =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						formatonomifactornomiOrigen =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomifactornomiDestino =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						formatonomifactornomiDestino =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				formatonomifactornomiOrigen =formatonomifactornomisSeleccionados.get(0);
				formatonomifactornomiDestino =formatonomifactornomisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosFormatoNomiFactorNomi(formatonomifactornomiOrigen,formatonomifactornomiDestino,true,false);
				
				formatonomifactornomiDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(formatonomifactornomiDestino,formatonomifactornomiLogic.getFormatoNomiFactorNomis());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formatonomifactornomiDestino,formatonomifactornomis);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaFormatoNomiFactorNomi(false);
				
				//this.jTableDatosFormatoNomiFactorNomi.setRowSelectionInterval(this.getIndiceNuevoFormatoNomiFactorNomi(), this.getIndiceNuevoFormatoNomiFactorNomi());
				
				int iLastRow =  this.jTableDatosFormatoNomiFactorNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFormatoNomiFactorNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFormatoNomiFactorNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFormatoNomiFactorNomi(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormFormatoNomiFactorNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarFormatoNomiFactorNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesFormatoNomiFactorNomi.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasFormatoNomiFactorNomi.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesFormatoNomiFactorNomi.setVisible(!isVisible);
			this.jPanelPaginacionFormatoNomiFactorNomi.setVisible(!isVisible);
			this.jPanelAccionesFormatoNomiFactorNomi.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarFormatoNomiFactorNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameFormatoNomiFactorNomi();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoFormatoNomiFactorNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoFormatoNomiFactorNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionFormatoNomiFactorNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionFormatoNomiFactorNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByFormatoNomiFactorNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByFormatoNomiFactorNomi();
			
			this.abrirFrameOrderByFormatoNomiFactorNomi();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByFormatoNomiFactorNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByFormatoNomiFactorNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleFormatoNomiFactorNomi(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormFormatoNomiFactorNomi);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.isMaximum()) {
					this.jInternalFrameDetalleFormFormatoNomiFactorNomi.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.setSize(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.iWidthFormulario,this.jInternalFrameDetalleFormFormatoNomiFactorNomi.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormFormatoNomiFactorNomi.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormFormatoNomiFactorNomi.isMaximum()) {
						this.jInternalFrameDetalleFormFormatoNomiFactorNomi.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jContentPaneDetalleFormatoNomiFactorNomi.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jTabbedPaneRelacionesFormatoNomiFactorNomi.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jContentPaneDetalleFormatoNomiFactorNomi.getWidth(),FormatoNomiFactorNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jTabbedPaneRelacionesFormatoNomiFactorNomi.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jContentPaneDetalleFormatoNomiFactorNomi.getWidth(),FormatoNomiFactorNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jTabbedPaneRelacionesFormatoNomiFactorNomi.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jContentPaneDetalleFormatoNomiFactorNomi.getWidth(),FormatoNomiFactorNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(CalificacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCalificacionEmpleado();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormFormatoNomiFactorNomi.setVisible(true);
	        this.jInternalFrameDetalleFormFormatoNomiFactorNomi.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByFormatoNomiFactorNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByFormatoNomiFactorNomi==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByFormatoNomiFactorNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormatoNomiFactorNomi,false,this);
				} else {
					this.jInternalFrameOrderByFormatoNomiFactorNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormatoNomiFactorNomi,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByFormatoNomiFactorNomi);
				this.jInternalFrameOrderByFormatoNomiFactorNomi.setVisible(false);
				this.jInternalFrameOrderByFormatoNomiFactorNomi.setSelected(false);
				
				this.jInternalFrameOrderByFormatoNomiFactorNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFormatoNomiFactorNomi"));
				
				this.inicializarActualizarBindingTablaOrderByFormatoNomiFactorNomi();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionFormatoNomiFactorNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionFormatoNomiFactorNomi==null) {
				
				this.jInternalFrameImportacionFormatoNomiFactorNomi=new ImportacionJInternalFrame(FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFormatoNomiFactorNomi);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionFormatoNomiFactorNomi);
				this.jInternalFrameImportacionFormatoNomiFactorNomi.setVisible(false);
				this.jInternalFrameImportacionFormatoNomiFactorNomi.setSelected(false);


				this.jInternalFrameImportacionFormatoNomiFactorNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFormatoNomiFactorNomi"));
				this.jInternalFrameImportacionFormatoNomiFactorNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFormatoNomiFactorNomi"));
				this.jInternalFrameImportacionFormatoNomiFactorNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFormatoNomiFactorNomi"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoFormatoNomiFactorNomi() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi==null) {
				this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi=new ReporteDinamicoJInternalFrame(FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi);
				this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.setVisible(false);
				this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFormatoNomiFactorNomi"));
				this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFormatoNomiFactorNomi"));
				this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFormatoNomiFactorNomi"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFormatoNomiFactorNomi();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCalificacionEmpleado() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.jScrollPanelDatosCalificacionEmpleado.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jContentPaneDetalleFormatoNomiFactorNomi.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.jScrollPanelDatosCalificacionEmpleado.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.jScrollPanelDatosCalificacionEmpleado.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.jScrollPanelDatosCalificacionEmpleado.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleFormatoNomiFactorNomi() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormFormatoNomiFactorNomi);
			
	       	this.jInternalFrameDetalleFormFormatoNomiFactorNomi.setVisible(false);
	        this.jInternalFrameDetalleFormFormatoNomiFactorNomi.setSelected(false);
			
			//this.jInternalFrameDetalleFormFormatoNomiFactorNomi.dispose();
			//this.jInternalFrameDetalleFormFormatoNomiFactorNomi=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoFormatoNomiFactorNomi() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.setVisible(true);
	        this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionFormatoNomiFactorNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionFormatoNomiFactorNomi.setVisible(true);
	        this.jInternalFrameImportacionFormatoNomiFactorNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByFormatoNomiFactorNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByFormatoNomiFactorNomi.setVisible(true);
	        this.jInternalFrameOrderByFormatoNomiFactorNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByFormatoNomiFactorNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByFormatoNomiFactorNomi.setVisible(false);
	        this.jInternalFrameOrderByFormatoNomiFactorNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoFormatoNomiFactorNomi() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.setVisible(false);
	        this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionFormatoNomiFactorNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionFormatoNomiFactorNomi.setVisible(false);
	        this.jInternalFrameImportacionFormatoNomiFactorNomi.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarFormatoNomiFactorNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarFormatoNomiFactorNomi(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarFormatoNomiFactorNomi(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesFormatoNomiFactorNomi(true);
			//this.isEsNuevoFormatoNomiFactorNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesFormatoNomiFactorNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFormatoNomiFactorNomi(false) ;
			
			if(formatonomifactornomiSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.getEsGuardarRelacionado() && CalificacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCalificacionEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(FormatoNomiFactorNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFormatoNomiFactorNomi(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormatoNomiFactorNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaFormatoNomiFactorNomiActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarFormatoNomiFactorNomi(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesFormatoNomiFactorNomi(true);
			//this.isEsNuevoFormatoNomiFactorNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.formatonomifactornomi.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesFormatoNomiFactorNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesFormatoNomiFactorNomi(false) ;
			
			if(FormatoNomiFactorNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFormatoNomiFactorNomi(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormatoNomiFactorNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaFormatoNomi(List<FormatoNomi> formatonomisForeignKey)throws Exception{
		TableColumn tableColumnFormatoNomi=this.jTableDatosFormatoNomiFactorNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomiFactorNomi,FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFORMATONOMI));
		TableCellEditor tableCellEditorFormatoNomi =tableColumnFormatoNomi.getCellEditor();

		FormatoNomiTableCell formatonomiTableCellFk=(FormatoNomiTableCell)tableCellEditorFormatoNomi;

		if(formatonomiTableCellFk!=null) {
			formatonomiTableCellFk.setformatonomisForeignKey(formatonomisForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();

		//if(intSelectedRow<=0) {
			//formatonomiTableCellFk.setRowActual(intSelectedRow);
			//formatonomiTableCellFk.setformatonomisForeignKeyActual(formatonomisForeignKey);
		//}


		if(formatonomiTableCellFk!=null) {
			formatonomiTableCellFk.RecargarFormatoNomisForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaFactorNomi(List<FactorNomi> factornomisForeignKey)throws Exception{
		TableColumn tableColumnFactorNomi=this.jTableDatosFormatoNomiFactorNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomiFactorNomi,FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFACTORNOMI));
		TableCellEditor tableCellEditorFactorNomi =tableColumnFactorNomi.getCellEditor();

		FactorNomiTableCell factornomiTableCellFk=(FactorNomiTableCell)tableCellEditorFactorNomi;

		if(factornomiTableCellFk!=null) {
			factornomiTableCellFk.setfactornomisForeignKey(factornomisForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();

		//if(intSelectedRow<=0) {
			//factornomiTableCellFk.setRowActual(intSelectedRow);
			//factornomiTableCellFk.setfactornomisForeignKeyActual(factornomisForeignKey);
		//}


		if(factornomiTableCellFk!=null) {
			factornomiTableCellFk.RecargarFactorNomisForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarFormatoNomiFactorNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesFormatoNomiFactorNomi(false);
			
			//if(!this.isEsNuevoFormatoNomiFactorNomi) {								
				int intSelectedRow = this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualFormatoNomiFactorNomi(this.formatonomifactornomi,true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiFactorNomi(this.formatonomifactornomi);
				
			}
			
			if(this.permiteMantenimiento(this.formatonomifactornomi)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoFormatoNomiFactorNomi=true;
					this.inicializarActualizarBindingTablaFormatoNomiFactorNomi(false);
					this.isEsNuevoFormatoNomiFactorNomi=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoFormatoNomiFactorNomi=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoFormatoNomiFactorNomi=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFormatoNomiFactorNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFormatoNomiFactorNomi(false);
				
				this.habilitarDeshabilitarControlesFormatoNomiFactorNomi(false);
			
												
				
				if(FormatoNomiFactorNomiJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleFormatoNomiFactorNomi();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoFormatoNomiFactorNomiActionPerformed(evt,formatonomifactornomiSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualFormatoNomiFactorNomi(this.formatonomifactornomi,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosFormatoNomiFactorNomi.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,formatonomifactornomiSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.formatonomifactornomi.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(FormatoNomiFactorNomi.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomiFactorNomi.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarFormatoNomiFactorNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
				this.formatonomifactornomi.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
				this.formatonomifactornomi.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.formatonomifactornomi)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((FormatoNomiFactorNomiModel) this.jTableDatosFormatoNomiFactorNomi.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoFormatoNomiFactorNomi=true;
				this.inicializarActualizarBindingTablaFormatoNomiFactorNomi(false);
				this.isEsNuevoFormatoNomiFactorNomi=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFormatoNomiFactorNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFormatoNomiFactorNomi(false);
				
				this.habilitarDeshabilitarControlesFormatoNomiFactorNomi(false);
				
				
				
				if(FormatoNomiFactorNomiJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleFormatoNomiFactorNomi();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarFormatoNomiFactorNomiActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosFormatoNomiFactorNomi.getRowCount()>=1) {
				jTableDatosFormatoNomiFactorNomi.removeRowSelectionInterval(0, jTableDatosFormatoNomiFactorNomi.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesFormatoNomiFactorNomi(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaFormatoNomiFactorNomi(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFormatoNomiFactorNomi(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormatoNomiFactorNomi(false) ;
			
			this.isEsNuevoFormatoNomiFactorNomi=false;
			
			if(FormatoNomiFactorNomiJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleFormatoNomiFactorNomi();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosFormatoNomiFactorNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingFormatoNomiFactorNomi(false);
				
				//SI ES MANUAL
				if(FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualFormatoNomiFactorNomi();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosFormatoNomiFactorNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoFormatoNomiFactorNomi--;			
			//FormatoNomiFactorNomi formatonomifactornomiAux= new FormatoNomiFactorNomi();			
			//formatonomifactornomiAux.setId(this.iIdNuevoFormatoNomiFactorNomi);
			
			if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaFormatoNomiFactorNomi();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiFactorNomi(this.formatonomifactornomi);
			
			this.formatonomifactornomi.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().add(this.formatonomifactornomiAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.formatonomifactornomis.add(this.formatonomifactornomiAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaFormatoNomiFactorNomi(false);
			
			this.jTableDatosFormatoNomiFactorNomi.setRowSelectionInterval(this.getIndiceNuevoFormatoNomiFactorNomi(), this.getIndiceNuevoFormatoNomiFactorNomi());
			
			int iLastRow =  this.jTableDatosFormatoNomiFactorNomi.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosFormatoNomiFactorNomi.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosFormatoNomiFactorNomi.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaFormatoNomiFactorNomi(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionFormatoNomiFactorNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingFormatoNomiFactorNomi(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormatoNomiFactorNomi(false);
			
			//SI ES MANUAL
			if(FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFormatoNomiFactorNomi();
			}
			
			//this.abrirFrameTreeFormatoNomiFactorNomi();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionFormatoNomiFactorNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Formato Nomi Factor NomiS ?", "MANTENIMIENTO DE Formato Nomi Factor Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionFormatoNomiFactorNomi.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralFormatoNomiFactorNomi();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.formatonomifactornomiReturnGeneral=formatonomifactornomiLogic.procesarImportacionFormatoNomiFactorNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.formatonomifactornomiParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarFormatoNomiFactorNomiReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionFormatoNomiFactorNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionFormatoNomiFactorNomi.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionFormatoNomiFactorNomi.setFileImportacion(this.jInternalFrameImportacionFormatoNomiFactorNomi.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionFormatoNomiFactorNomi.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionFormatoNomiFactorNomi.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionFormatoNomiFactorNomi.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionFormatoNomiFactorNomi.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoFormatoNomiFactorNomiActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<FormatoNomiFactorNomi> formatonomifactornomisSeleccionados=new ArrayList<FormatoNomiFactorNomi>();		

		formatonomifactornomisSeleccionados=this.getFormatoNomiFactorNomisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("FormatoNomiFactorNomiBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"FormatoNomiFactorNomiBaseDesign.jrxml";
			
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
			
			this.generarReporteFormatoNomiFactorNomis("Todos",formatonomifactornomisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato Nomi Factor Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FormatoNomiFactorNomiConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormatoNomiFactorNomiConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFORMATONOMI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_FormatoNomi_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_FormatoNomi_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_FormatoNomi_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_FormatoNomi_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFACTORNOMI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_FactorNomi_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_FactorNomi_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_FactorNomi_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_FactorNomi_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormatoNomiFactorNomiConstantesFunciones.LABEL_PONDERACION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nderacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nderacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nderacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nderacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormatoNomiFactorNomiConstantesFunciones.LABEL_ESTAACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taActivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taActivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taActivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taActivo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case FormatoNomiFactorNomiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case FormatoNomiFactorNomiConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFORMATONOMI:
					sNombreCampoCategoria="id_formato_nomi";
					break;

				case FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFACTORNOMI:
					sNombreCampoCategoria="id_factor_nomi";
					break;

				case FormatoNomiFactorNomiConstantesFunciones.LABEL_PONDERACION:
					sNombreCampoCategoria="ponderacion";
					break;

				case FormatoNomiFactorNomiConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case FormatoNomiFactorNomiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case FormatoNomiFactorNomiConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFORMATONOMI:
					sNombreCampoCategoriaValor="id_formato_nomi";
					break;

				case FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFACTORNOMI:
					sNombreCampoCategoriaValor="id_factor_nomi";
					break;

				case FormatoNomiFactorNomiConstantesFunciones.LABEL_PONDERACION:
					sNombreCampoCategoriaValor="ponderacion";
					break;

				case FormatoNomiFactorNomiConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FormatoNomiFactorNomiConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case FormatoNomiFactorNomiConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFORMATONOMI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Formato Nomi",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_formato_nomi");
					break;

				case FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFACTORNOMI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Factor Nomi",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_factor_nomi");
					break;

				case FormatoNomiFactorNomiConstantesFunciones.LABEL_PONDERACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ponderacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ponderacion");
					break;

				case FormatoNomiFactorNomiConstantesFunciones.LABEL_ESTAACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Esta Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esta_activo");
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
	
	public void jButtonGenerarExcelReporteDinamicoFormatoNomiFactorNomiActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<FormatoNomiFactorNomi> formatonomifactornomisSeleccionados=new ArrayList<FormatoNomiFactorNomi>();		
		
		formatonomifactornomisSeleccionados=this.getFormatoNomiFactorNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formatonomifactornomi";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("FormatoNomiFactorNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case FormatoNomiFactorNomiConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormatoNomiFactorNomiConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(FormatoNomiFactorNomi formatonomifactornomi:formatonomifactornomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formatonomifactornomi.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormatoNomiFactorNomiConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormatoNomiFactorNomiConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(FormatoNomiFactorNomi formatonomifactornomi:formatonomifactornomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formatonomifactornomi.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFORMATONOMI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFORMATONOMI);
					iRow++;

					for(FormatoNomiFactorNomi formatonomifactornomi:formatonomifactornomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formatonomifactornomi.getformatonomi_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFACTORNOMI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFACTORNOMI);
					iRow++;

					for(FormatoNomiFactorNomi formatonomifactornomi:formatonomifactornomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formatonomifactornomi.getfactornomi_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormatoNomiFactorNomiConstantesFunciones.LABEL_PONDERACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormatoNomiFactorNomiConstantesFunciones.LABEL_PONDERACION);
					iRow++;

					for(FormatoNomiFactorNomi formatonomifactornomi:formatonomifactornomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formatonomifactornomi.getponderacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormatoNomiFactorNomiConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormatoNomiFactorNomiConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(FormatoNomiFactorNomi formatonomifactornomi:formatonomifactornomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formatonomifactornomi.getesta_activo());
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
			//	this.getFilaCabeceraExportarExcelFormatoNomiFactorNomi(row);				
			//	iRow++;
			//}				
			
			//for(FormatoNomiFactorNomi formatonomifactornomiAux:formatonomifactornomisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelFormatoNomiFactorNomi(formatonomifactornomiAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato Nomi Factor Nomi",JOptionPane.INFORMATION_MESSAGE);
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
				this.formatonomifactornomiLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormatoNomiFactorNomi(false);
			
			//SI ES MANUAL
			if(FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFormatoNomiFactorNomi();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresFormatoNomiFactorNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormatoNomiFactorNomi(false);
			
			//SI ES MANUAL
			if(FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFormatoNomiFactorNomi();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesFormatoNomiFactorNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormatoNomiFactorNomi(false);
			
			//SI ES MANUAL
			if(FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFormatoNomiFactorNomi();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaFormatoNomiFactorNomi() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosFormatoNomiFactorNomi.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosFormatoNomiFactorNomi.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosFormatoNomiFactorNomi.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosFormatoNomiFactorNomi.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosFormatoNomiFactorNomi.setMinimumSize(dimensionMinimum);
		this.jTableDatosFormatoNomiFactorNomi.setMaximumSize(dimensionMaximum);
		this.jTableDatosFormatoNomiFactorNomi.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingFormatoNomiFactorNomi(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingFormatoNomiFactorNomi(esInicializar,true);
	}
	
	public void inicializarActualizarBindingFormatoNomiFactorNomi(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaFormatoNomiFactorNomi(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesFormatoNomiFactorNomi(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasFormatoNomiFactorNomi(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFormatoNomiFactorNomi(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesFormatoNomiFactorNomi(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualFormatoNomiFactorNomi() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaFormatoNomiFactorNomi();
		
		this.inicializarActualizarBindingBotonesManualFormatoNomiFactorNomi(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualFormatoNomiFactorNomi();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFormatoNomiFactorNomi() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualFormatoNomiFactorNomi(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualFormatoNomiFactorNomi(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosFormatoNomiFactorNomi.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosFormatoNomiFactorNomi.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteFormatoNomiFactorNomi.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jCheckBoxPostAccionNuevoFormatoNomiFactorNomi.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jCheckBoxPostAccionSinCerrarFormatoNomiFactorNomi.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jCheckBoxPostAccionSinMensajeFormatoNomiFactorNomi.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosFormatoNomiFactorNomi.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosFormatoNomiFactorNomi.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteFormatoNomiFactorNomi.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
				this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jCheckBoxPostAccionNuevoFormatoNomiFactorNomi.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jCheckBoxPostAccionSinCerrarFormatoNomiFactorNomi.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jCheckBoxPostAccionSinMensajeFormatoNomiFactorNomi.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionFormatoNomiFactorNomi.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionFormatoNomiFactorNomi.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxTiposAccionesFormularioFormatoNomiFactorNomi.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesFormatoNomiFactorNomi.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesFormatoNomiFactorNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesFormatoNomiFactorNomi.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarFormatoNomiFactorNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesFormatoNomiFactorNomi.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesFormatoNomiFactorNomi.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralFormatoNomiFactorNomi.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesFormatoNomiFactorNomi(Boolean esInicializar) throws Exception {
		try	{	
			if(FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualFormatoNomiFactorNomi(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesFormatoNomiFactorNomi() throws Exception {
		try	{
			if(FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormatoNomiFactorNomi();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFormatoNomiFactorNomi() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxTiposAccionesFormularioFormatoNomiFactorNomi.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxTiposAccionesFormularioFormatoNomiFactorNomi.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormatoNomiFactorNomi() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesFormatoNomiFactorNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesFormatoNomiFactorNomi.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesFormatoNomiFactorNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesFormatoNomiFactorNomi.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesFormatoNomiFactorNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesFormatoNomiFactorNomi.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionFormatoNomiFactorNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionFormatoNomiFactorNomi.addItem(reporte);
			}
			
			
			if(!this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionFormatoNomiFactorNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionFormatoNomiFactorNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesFormatoNomiFactorNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesFormatoNomiFactorNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesFormatoNomiFactorNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesFormatoNomiFactorNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxTiposAccionesFormularioFormatoNomiFactorNomi.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxTiposAccionesFormularioFormatoNomiFactorNomi.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarFormatoNomiFactorNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarFormatoNomiFactorNomi.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarFormatoNomiFactorNomi.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFormatoNomiFactorNomi();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFormatoNomiFactorNomi() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi!=null) {
				this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi!=null) {
				this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi!=null) {
				
				if(this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=FormatoNomiFactorNomiConstantesFunciones.getTiposSeleccionarFormatoNomiFactorNomi(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=FormatoNomiFactorNomiConstantesFunciones.getTiposSeleccionarFormatoNomiFactorNomi(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=FormatoNomiFactorNomiConstantesFunciones.getTiposSeleccionarFormatoNomiFactorNomi(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualFormatoNomiFactorNomi()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomi.getSelectedItem()!=null){this.id_factor_nomiFK_IdFactorNomi=((FactorNomi)this.jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiFactorNomi.getSelectedItem()).getId();}
		if(this.jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomi.getSelectedItem()!=null){this.id_formato_nomiFK_IdFormatoNomi=((FormatoNomi)this.jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiFactorNomi.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasFormatoNomiFactorNomi(Boolean esInicializar) throws Exception {				
		if(FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualFormatoNomiFactorNomi();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaFormatoNomiFactorNomi() throws Exception {
		this.inicializarActualizarBindingTablaFormatoNomiFactorNomi(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByFormatoNomiFactorNomi() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByFormatoNomiFactorNomi.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByFormatoNomiFactorNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFormatoNomiFactorNomi.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new FormatoNomiFactorNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByFormatoNomiFactorNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFormatoNomiFactorNomi.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new FormatoNomiFactorNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosFormatoNomiFactorNomiOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomiFactorNomiOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new FormatoNomiFactorNomiPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByFormatoNomiFactorNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFormatoNomiFactorNomi.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new FormatoNomiFactorNomiPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByFormatoNomiFactorNomi.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaFormatoNomiFactorNomi(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=formatonomifactornomiLogic.getFormatoNomiFactorNomis().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=formatonomifactornomis.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosFormatoNomiFactorNomi.setModel(new FormatoNomiFactorNomiModel(this.formatonomifactornomiLogic.getFormatoNomiFactorNomis(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosFormatoNomiFactorNomi.setModel(new FormatoNomiFactorNomiModel(this.formatonomifactornomis,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByFormatoNomiFactorNomi!=null && this.jInternalFrameOrderByFormatoNomiFactorNomi.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByFormatoNomiFactorNomi();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosFormatoNomiFactorNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomiFactorNomi,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new FormatoNomiFactorNomiPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO,formatonomifactornomiConstantesFunciones.resaltarSeleccionarFormatoNomiFactorNomi,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO,formatonomifactornomiConstantesFunciones.resaltarSeleccionarFormatoNomiFactorNomi,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosFormatoNomiFactorNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomiFactorNomi,FormatoNomiFactorNomiConstantesFunciones.LABEL_ID));

		if(this.formatonomifactornomiConstantesFunciones.mostraridFormatoNomiFactorNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoNomiFactorNomiConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.formatonomifactornomiConstantesFunciones.resaltaridFormatoNomiFactorNomi,this.formatonomifactornomiConstantesFunciones.activaridFormatoNomiFactorNomi,iSizeTabla,this,true,"idFormatoNomiFactorNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.formatonomifactornomiConstantesFunciones.resaltaridFormatoNomiFactorNomi,this.formatonomifactornomiConstantesFunciones.activaridFormatoNomiFactorNomi,this,true,"idFormatoNomiFactorNomi","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormatoNomiFactorNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomiFactorNomi,FormatoNomiFactorNomiConstantesFunciones.LABEL_IDEMPRESA));

		if(this.formatonomifactornomiConstantesFunciones.mostrarid_empresaFormatoNomiFactorNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoNomiFactorNomiConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.formatonomifactornomiConstantesFunciones.resaltarid_empresaFormatoNomiFactorNomi,this,this.formatonomifactornomiConstantesFunciones.activarid_empresaFormatoNomiFactorNomi,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.formatonomifactornomiConstantesFunciones.resaltarid_empresaFormatoNomiFactorNomi,this,this.formatonomifactornomiConstantesFunciones.activarid_empresaFormatoNomiFactorNomi,false,"id_empresaFormatoNomiFactorNomi","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormatoNomiFactorNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormatoNomiFactorNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomiFactorNomi,FormatoNomiFactorNomiConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.formatonomifactornomiConstantesFunciones.mostrarid_sucursalFormatoNomiFactorNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoNomiFactorNomiConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.formatonomifactornomiConstantesFunciones.resaltarid_sucursalFormatoNomiFactorNomi,this,this.formatonomifactornomiConstantesFunciones.activarid_sucursalFormatoNomiFactorNomi,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.formatonomifactornomiConstantesFunciones.resaltarid_sucursalFormatoNomiFactorNomi,this,this.formatonomifactornomiConstantesFunciones.activarid_sucursalFormatoNomiFactorNomi,false,"id_sucursalFormatoNomiFactorNomi","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormatoNomiFactorNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormatoNomiFactorNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomiFactorNomi,FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFORMATONOMI));

		if(this.formatonomifactornomiConstantesFunciones.mostrarid_formato_nomiFormatoNomiFactorNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFORMATONOMI,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FormatoNomiTableCell(this.formatonomisForeignKey,this.formatonomifactornomiConstantesFunciones.resaltarid_formato_nomiFormatoNomiFactorNomi,this,this.formatonomifactornomiConstantesFunciones.activarid_formato_nomiFormatoNomiFactorNomi,iSizeTabla));
			tableColumn.setCellEditor(new FormatoNomiTableCell(this.formatonomisForeignKey,this.formatonomifactornomiConstantesFunciones.resaltarid_formato_nomiFormatoNomiFactorNomi,this,this.formatonomifactornomiConstantesFunciones.activarid_formato_nomiFormatoNomiFactorNomi,true,"id_formato_nomiFormatoNomiFactorNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormatoNomiFactorNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormatoNomiFactorNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomiFactorNomi,FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFACTORNOMI));

		if(this.formatonomifactornomiConstantesFunciones.mostrarid_factor_nomiFormatoNomiFactorNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFACTORNOMI,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FactorNomiTableCell(this.factornomisForeignKey,this.formatonomifactornomiConstantesFunciones.resaltarid_factor_nomiFormatoNomiFactorNomi,this,this.formatonomifactornomiConstantesFunciones.activarid_factor_nomiFormatoNomiFactorNomi,iSizeTabla));
			tableColumn.setCellEditor(new FactorNomiTableCell(this.factornomisForeignKey,this.formatonomifactornomiConstantesFunciones.resaltarid_factor_nomiFormatoNomiFactorNomi,this,this.formatonomifactornomiConstantesFunciones.activarid_factor_nomiFormatoNomiFactorNomi,true,"id_factor_nomiFormatoNomiFactorNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormatoNomiFactorNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormatoNomiFactorNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomiFactorNomi,FormatoNomiFactorNomiConstantesFunciones.LABEL_PONDERACION));

		if(this.formatonomifactornomiConstantesFunciones.mostrarponderacionFormatoNomiFactorNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoNomiFactorNomiConstantesFunciones.LABEL_PONDERACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.formatonomifactornomiConstantesFunciones.resaltarponderacionFormatoNomiFactorNomi,this.formatonomifactornomiConstantesFunciones.activarponderacionFormatoNomiFactorNomi,iSizeTabla,this,true,"ponderacionFormatoNomiFactorNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.formatonomifactornomiConstantesFunciones.resaltarponderacionFormatoNomiFactorNomi,this.formatonomifactornomiConstantesFunciones.activarponderacionFormatoNomiFactorNomi,this,true,"ponderacionFormatoNomiFactorNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FormatoNomiFactorNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormatoNomiFactorNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomiFactorNomi,FormatoNomiFactorNomiConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.formatonomifactornomiConstantesFunciones.mostraresta_activoFormatoNomiFactorNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoNomiFactorNomiConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.formatonomifactornomiConstantesFunciones.resaltaresta_activoFormatoNomiFactorNomi,this.formatonomifactornomiConstantesFunciones.activaresta_activoFormatoNomiFactorNomi,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.formatonomifactornomiConstantesFunciones.resaltaresta_activoFormatoNomiFactorNomi,this.formatonomifactornomiConstantesFunciones.activaresta_activoFormatoNomiFactorNomi,this,true,"esta_activoFormatoNomiFactorNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FormatoNomiFactorNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCalificacionEmpleado && this.formatonomifactornomiConstantesFunciones.mostrarCalificacionEmpleadoFormatoNomiFactorNomi && !FormatoNomiFactorNomiConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Calificacion Empleados");
				tableColumn.setHeaderValue("Calificacion Empleados");
				tableColumn.setCellRenderer(new CalificacionEmpleadoTableCell(formatonomifactornomiConstantesFunciones.resaltarCalificacionEmpleadoFormatoNomiFactorNomi,this,this.formatonomifactornomiConstantesFunciones.activarCalificacionEmpleadoFormatoNomiFactorNomi));
				tableColumn.setCellEditor(new CalificacionEmpleadoTableCell(formatonomifactornomiConstantesFunciones.resaltarCalificacionEmpleadoFormatoNomiFactorNomi,this,this.formatonomifactornomiConstantesFunciones.activarCalificacionEmpleadoFormatoNomiFactorNomi));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosFormatoNomiFactorNomi.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.formatonomifactornomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.formatonomifactornomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFormatoNomiFactorNomi.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.formatonomifactornomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.formatonomifactornomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFormatoNomiFactorNomi.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarFormatoNomiFactorNomi && this.isPermisoGuardarCambiosFormatoNomiFactorNomi) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.formatonomifactornomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.formatonomifactornomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosFormatoNomiFactorNomi.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.formatonomifactornomiSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false,iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,true,false,iSizeTabla));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosFormatoNomiFactorNomi.addColumn(tableColumn);
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
			
			this.jTableDatosFormatoNomiFactorNomi.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFormatoNomiFactorNomi && this.isPermisoGuardarCambiosFormatoNomiFactorNomi) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.formatonomifactornomiSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFormatoNomiFactorNomi && this.isPermisoGuardarCambiosFormatoNomiFactorNomi) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosFormatoNomiFactorNomi.moveColumn(this.jTableDatosFormatoNomiFactorNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosFormatoNomiFactorNomi.moveColumn(this.jTableDatosFormatoNomiFactorNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.formatonomifactornomiSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosFormatoNomiFactorNomi.moveColumn(this.jTableDatosFormatoNomiFactorNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosFormatoNomiFactorNomi.moveColumn(this.jTableDatosFormatoNomiFactorNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosFormatoNomiFactorNomi.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosFormatoNomiFactorNomi.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosFormatoNomiFactorNomi,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosFormatoNomiFactorNomi.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosFormatoNomiFactorNomi.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosFormatoNomiFactorNomi.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosFormatoNomiFactorNomi.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosFormatoNomiFactorNomi.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=formatonomifactornomiLogic.getFormatoNomiFactorNomis().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=formatonomifactornomis.size()-1;
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
		//this.jTableDatosFormatoNomiFactorNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosFormatoNomiFactorNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosFormatoNomiFactorNomi();
			
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
				
				//this.isEsNuevoFormatoNomiFactorNomi=false;
					
				FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
			
				if(this.formatonomifactornomiSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFormatoNomiFactorNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.formatonomifactornomi.getsType().equals("DUPLICADO")
				   || this.formatonomifactornomi.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoFormatoNomiFactorNomi=true;
				
				} else {
					this.isEsNuevoFormatoNomiFactorNomi=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
					if(this.formatonomifactornomi.getId()>=0 && !this.formatonomifactornomi.getIsNew()) {						
						this.isEsNuevoFormatoNomiFactorNomi=false;
						
					} else {
						this.isEsNuevoFormatoNomiFactorNomi=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoFormatoNomiFactorNomi(esRelaciones);						
				
				this.seleccionarFormatoNomiFactorNomi(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.formatonomifactornomi.getId()<0) {
					this.isEsNuevoFormatoNomiFactorNomi=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarFormatoNomiFactorNomi(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarFormatoNomiFactorNomi(evt,rowIndex);
				}	
				
				if(this.formatonomifactornomiSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion FormatoNomiFactorNomi: " + this.dDif); 
					}
				}								
				
				FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarFormatoNomiFactorNomi(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.formatonomifactornomi)) {
					if(this.formatonomifactornomi.getId()>0) {
						this.formatonomifactornomi.setIsDeleted(true);
						
						this.formatonomifactornomisEliminados.add(this.formatonomifactornomi);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().remove(this.formatonomifactornomi);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.formatonomifactornomis.remove(this.formatonomifactornomi);				
					}
					
					
					((FormatoNomiFactorNomiModel) this.jTableDatosFormatoNomiFactorNomi.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaFormatoNomiFactorNomi(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarFormatoNomiFactorNomi(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoFormatoNomiFactorNomi) {
			
			if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFormatoNomiFactorNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioFormatoNomiFactorNomi(this.formatonomifactornomi);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.formatonomifactornomiConstantesFunciones.cargarid_empresaFormatoNomiFactorNomi || this.formatonomifactornomiConstantesFunciones.event_dependid_empresaFormatoNomiFactorNomi) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.formatonomifactornomi.getid_empresa());
									//this.inicializarActualizarBindingFormatoNomiFactorNomi(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(formatonomifactornomi.getEmpresa()!=null) {
							this.empresasForeignKey.add(formatonomifactornomi.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.formatonomifactornomi.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.formatonomifactornomiConstantesFunciones.cargarid_sucursalFormatoNomiFactorNomi || this.formatonomifactornomiConstantesFunciones.event_dependid_sucursalFormatoNomiFactorNomi) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.formatonomifactornomi.getid_sucursal());
									//this.inicializarActualizarBindingFormatoNomiFactorNomi(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(formatonomifactornomi.getSucursal()!=null) {
							this.sucursalsForeignKey.add(formatonomifactornomi.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.formatonomifactornomi.getid_sucursal(),false,"Formulario");

					//FormatoNomi
					if(!this.formatonomifactornomiConstantesFunciones.cargarid_formato_nomiFormatoNomiFactorNomi || this.formatonomifactornomiConstantesFunciones.event_dependid_formato_nomiFormatoNomiFactorNomi) {
						//this.cargarCombosFormatoNomisForeignKeyLista(" where id="+this.formatonomifactornomi.getid_formato_nomi());
									//this.inicializarActualizarBindingFormatoNomiFactorNomi(false,false);
						this.formatonomisForeignKey=new ArrayList<FormatoNomi>();

						if(formatonomifactornomi.getFormatoNomi()!=null) {
							this.formatonomisForeignKey.add(formatonomifactornomi.getFormatoNomi());
						}

						this.addItemDefectoCombosForeignKeyFormatoNomi();
						this.cargarCombosFrameFormatoNomisForeignKey("Todos");
					}
					this.setActualFormatoNomiForeignKey(this.formatonomifactornomi.getid_formato_nomi(),false,"Formulario");

					//FactorNomi
					if(!this.formatonomifactornomiConstantesFunciones.cargarid_factor_nomiFormatoNomiFactorNomi || this.formatonomifactornomiConstantesFunciones.event_dependid_factor_nomiFormatoNomiFactorNomi) {
						//this.cargarCombosFactorNomisForeignKeyLista(" where id="+this.formatonomifactornomi.getid_factor_nomi());
									//this.inicializarActualizarBindingFormatoNomiFactorNomi(false,false);
						this.factornomisForeignKey=new ArrayList<FactorNomi>();

						if(formatonomifactornomi.getFactorNomi()!=null) {
							this.factornomisForeignKey.add(formatonomifactornomi.getFactorNomi());
						}

						this.addItemDefectoCombosForeignKeyFactorNomi();
						this.cargarCombosFrameFactorNomisForeignKey("Todos");
					}
					this.setActualFactorNomiForeignKey(this.formatonomifactornomi.getid_factor_nomi(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesFormatoNomiFactorNomi("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesFormatoNomiFactorNomi(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFormatoNomiFactorNomi() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoFormatoNomiFactorNomi(FormatoNomiFactorNomi formatonomifactornomi) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoFormatoNomiFactorNomi(formatonomifactornomi,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoFormatoNomiFactorNomi(FormatoNomiFactorNomi formatonomifactornomi,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioFormatoNomiFactorNomi(formatonomifactornomi);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyFormatoNomiFactorNomi(formatonomifactornomi,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyFormatoNomiFactorNomi(formatonomifactornomi);
	}
	
	public void setVariablesObjetoActualToFormularioFormatoNomiFactorNomi(FormatoNomiFactorNomi formatonomifactornomi) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jLabelidFormatoNomiFactorNomi.setText(formatonomifactornomi.getId().toString());
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jTextFieldponderacionFormatoNomiFactorNomi.setText(formatonomifactornomi.getponderacion().toString());
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jCheckBoxesta_activoFormatoNomiFactorNomi.setSelected(formatonomifactornomi.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,FormatoNomiFactorNomi formatonomifactornomiLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,formatonomifactornomiLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,FormatoNomiFactorNomi formatonomifactornomiLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				formatonomifactornomiLocal=this.formatonomifactornomi;
			} else {
				formatonomifactornomiLocal=this.formatonomifactornomiAnterior;
			}
		}
		
		if(this.permiteMantenimiento(formatonomifactornomiLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoFormatoNomiFactorNomi(formatonomifactornomiLocal,true);
					
					if(formatonomifactornomiSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(formatonomifactornomiLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(formatonomifactornomiLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoFormatoNomiFactorNomi(FormatoNomiFactorNomi formatonomifactornomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFormatoNomiFactorNomi(formatonomifactornomi,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiFactorNomi(formatonomifactornomi);
	}
	
	public void setVariablesFormularioToObjetoActualFormatoNomiFactorNomi(FormatoNomiFactorNomi formatonomifactornomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFormatoNomiFactorNomi(formatonomifactornomi,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualFormatoNomiFactorNomi(FormatoNomiFactorNomi formatonomifactornomi,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jLabelidFormatoNomiFactorNomi.getText()==null || this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jLabelidFormatoNomiFactorNomi.getText()=="" || this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jLabelidFormatoNomiFactorNomi.getText()=="Id") {
				this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jLabelidFormatoNomiFactorNomi.setText("0");
			}

			if(conColumnasBase) {formatonomifactornomi.setId(Long.parseLong(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jLabelidFormatoNomiFactorNomi.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormatoNomiFactorNomiConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jLabelIdFormatoNomiFactorNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			formatonomifactornomi.setponderacion(Double.parseDouble(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jTextFieldponderacionFormatoNomiFactorNomi.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormatoNomiFactorNomiConstantesFunciones.LABEL_PONDERACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jLabelponderacionFormatoNomiFactorNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			formatonomifactornomi.setesta_activo(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jCheckBoxesta_activoFormatoNomiFactorNomi.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormatoNomiFactorNomiConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jLabelesta_activoFormatoNomiFactorNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFormatoNomiFactorNomi(FormatoNomiFactorNomi formatonomifactornomiBean,FormatoNomiFactorNomi formatonomifactornomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && formatonomifactornomiBean.getid_formato_nomi()!=null && !formatonomifactornomiBean.getid_formato_nomi().equals(-1L))) {formatonomifactornomi.setid_formato_nomi(formatonomifactornomiBean.getid_formato_nomi());}
			if(conDefault || (!conDefault && formatonomifactornomiBean.getid_factor_nomi()!=null && !formatonomifactornomiBean.getid_factor_nomi().equals(-1L))) {formatonomifactornomi.setid_factor_nomi(formatonomifactornomiBean.getid_factor_nomi());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosFormatoNomiFactorNomi(FormatoNomiFactorNomi formatonomifactornomiOrigen,FormatoNomiFactorNomi formatonomifactornomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && formatonomifactornomiOrigen.getId()!=null && !formatonomifactornomiOrigen.getId().equals(0L))) {formatonomifactornomi.setId(formatonomifactornomiOrigen.getId());}}
			if(conDefault || (!conDefault && formatonomifactornomiOrigen.getid_formato_nomi()!=null && !formatonomifactornomiOrigen.getid_formato_nomi().equals(-1L))) {formatonomifactornomi.setid_formato_nomi(formatonomifactornomiOrigen.getid_formato_nomi());}
			if(conDefault || (!conDefault && formatonomifactornomiOrigen.getid_factor_nomi()!=null && !formatonomifactornomiOrigen.getid_factor_nomi().equals(-1L))) {formatonomifactornomi.setid_factor_nomi(formatonomifactornomiOrigen.getid_factor_nomi());}
			if(conDefault || (!conDefault && formatonomifactornomiOrigen.getponderacion()!=null && !formatonomifactornomiOrigen.getponderacion().equals(0.0))) {formatonomifactornomi.setponderacion(formatonomifactornomiOrigen.getponderacion());}
			if(conDefault || (!conDefault && formatonomifactornomiOrigen.getesta_activo()!=null && !formatonomifactornomiOrigen.getesta_activo().equals(false))) {formatonomifactornomi.setesta_activo(formatonomifactornomiOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFormatoNomiFactorNomi(FormatoNomiFactorNomi formatonomifactornomi) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jLabelidFormatoNomiFactorNomi.setText(formatonomifactornomi.getId().toString());
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jTextFieldponderacionFormatoNomiFactorNomi.setText(formatonomifactornomi.getponderacion().toString());
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jCheckBoxesta_activoFormatoNomiFactorNomi.setSelected(formatonomifactornomi.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFormatoNomiFactorNomi(FormatoNomiFactorNomiBean formatonomifactornomiBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jLabelidFormatoNomiFactorNomi.setText(formatonomifactornomiBean.getId().toString());
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jTextFieldponderacionFormatoNomiFactorNomi.setText(formatonomifactornomiBean.getponderacion().toString());
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jCheckBoxesta_activoFormatoNomiFactorNomi.setSelected(formatonomifactornomiBean.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanFormatoNomiFactorNomi(FormatoNomiFactorNomiParameterReturnGeneral formatonomifactornomiReturnGeneral,FormatoNomiFactorNomiBean formatonomifactornomiBean,Boolean conDefault) throws Exception { 
		try {
			FormatoNomiFactorNomi formatonomifactornomiLocal=new FormatoNomiFactorNomi();
			
			formatonomifactornomiLocal=formatonomifactornomiReturnGeneral.getFormatoNomiFactorNomi();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && formatonomifactornomiLocal.getId()!=null && !formatonomifactornomiLocal.getId().equals(0L))) {formatonomifactornomiBean.setId(formatonomifactornomiLocal.getId());}}
			if(conDefault || (!conDefault && formatonomifactornomiLocal.getid_formato_nomi()!=null && !formatonomifactornomiLocal.getid_formato_nomi().equals(-1L))) {formatonomifactornomiBean.setid_formato_nomi(formatonomifactornomiLocal.getid_formato_nomi());}
			if(conDefault || (!conDefault && formatonomifactornomiLocal.getid_factor_nomi()!=null && !formatonomifactornomiLocal.getid_factor_nomi().equals(-1L))) {formatonomifactornomiBean.setid_factor_nomi(formatonomifactornomiLocal.getid_factor_nomi());}
			if(conDefault || (!conDefault && formatonomifactornomiLocal.getponderacion()!=null && !formatonomifactornomiLocal.getponderacion().equals(0.0))) {formatonomifactornomiBean.setponderacion(formatonomifactornomiLocal.getponderacion());}
			if(conDefault || (!conDefault && formatonomifactornomiLocal.getesta_activo()!=null && !formatonomifactornomiLocal.getesta_activo().equals(false))) {formatonomifactornomiBean.setesta_activo(formatonomifactornomiLocal.getesta_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxFormatoNomiFactorNomiGenerico(Long idFormatoNomiFactorNomiSeleccionado,JComboBox jComboBoxFormatoNomiFactorNomi,List<FormatoNomiFactorNomi> formatonomifactornomisLocal)throws Exception {
		try {
			FormatoNomiFactorNomi  formatonomifactornomiTemp=null;

			for(FormatoNomiFactorNomi formatonomifactornomiAux:formatonomifactornomisLocal) {
				if(formatonomifactornomiAux.getId()!=null && formatonomifactornomiAux.getId().equals(idFormatoNomiFactorNomiSeleccionado)) {
					formatonomifactornomiTemp=formatonomifactornomiAux;
					break;
				}
			}

			jComboBoxFormatoNomiFactorNomi.setSelectedItem(formatonomifactornomiTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxFormatoNomiFactorNomiGenerico(JComboBox jComboBoxFormatoNomiFactorNomi,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxFormatoNomiFactorNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFormatoNomiFactorNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxFormatoNomiFactorNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFormatoNomiFactorNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFormatoNomiFactorNomi.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxFormatoNomiFactorNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFormatoNomiFactorNomi.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxFormatoNomiFactorNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxFormatoNomiFactorNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxFormatoNomiFactorNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("CalificacionEmpleado")) {
			jButtonCalificacionEmpleadoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			formatonomifactornomi=(FormatoNomiFactorNomi) formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			formatonomifactornomi =(FormatoNomiFactorNomi) formatonomifactornomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!formatonomifactornomi.getIsNew() && !formatonomifactornomi.getIsChanged() && !formatonomifactornomi.getIsDeleted()) {
				sDescripcion=formatonomifactornomi.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=formatonomifactornomi.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!formatonomifactornomi.getIsNew() && !formatonomifactornomi.getIsChanged() && !formatonomifactornomi.getIsDeleted()) {
				sDescripcion=formatonomifactornomi.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=formatonomifactornomi.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("FormatoNomi")) {
			//sDescripcion=this.getActualFormatoNomiForeignKeyDescripcion((Long)value);
			if(!formatonomifactornomi.getIsNew() && !formatonomifactornomi.getIsChanged() && !formatonomifactornomi.getIsDeleted()) {
				sDescripcion=formatonomifactornomi.getformatonomi_descripcion();
			} else {
				//sDescripcion=this.getActualFormatoNomiForeignKeyDescripcion((Long)value);
				sDescripcion=formatonomifactornomi.getformatonomi_descripcion();
			}
		}

		if(sTipo.equals("FactorNomi")) {
			//sDescripcion=this.getActualFactorNomiForeignKeyDescripcion((Long)value);
			if(!formatonomifactornomi.getIsNew() && !formatonomifactornomi.getIsChanged() && !formatonomifactornomi.getIsDeleted()) {
				sDescripcion=formatonomifactornomi.getfactornomi_descripcion();
			} else {
				//sDescripcion=this.getActualFactorNomiForeignKeyDescripcion((Long)value);
				sDescripcion=formatonomifactornomi.getfactornomi_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		FormatoNomiFactorNomi formatonomifactornomiRow=new FormatoNomiFactorNomi();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			formatonomifactornomiRow=(FormatoNomiFactorNomi) formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			formatonomifactornomiRow=(FormatoNomiFactorNomi) formatonomifactornomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonCalificacionEmpleadoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,FormatoNomiFactorNomi formatonomifactornomi) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomifactornomi = (FormatoNomiFactorNomi)this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.formatonomifactornomi = (FormatoNomiFactorNomi)this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(formatonomifactornomi!=null) {
						this.formatonomifactornomi = formatonomifactornomi;
					} else {
						this.formatonomifactornomi = new FormatoNomiFactorNomi();
					}
				}

				if(this.isTienePermisosCalificacionEmpleado && this.permiteMantenimiento(this.formatonomifactornomi)) {
					CalificacionEmpleadoBeanSwingJInternalFrame calificacionempleadoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFramePopup=new CalificacionEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						calificacionempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFramePopup;
					} else {
						calificacionempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame;
					}

					List<FormatoNomiFactorNomi> formatonomifactornomis=new ArrayList<FormatoNomiFactorNomi>();
					formatonomifactornomis.add(this.formatonomifactornomi);
					if(!esRelacionado) {
						//calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.setConGuardarRelaciones(false);
						//calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					calificacionempleadoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormFormatoNomiFactorNomi.cargarCalificacionEmpleadoBeanSwingJInternalFrame(formatonomifactornomis,this.formatonomifactornomi,calificacionempleadoBeanSwingJInternalFrame,/*conInicializar,*/calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.getConGuardarRelaciones(),calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.getEsGuardarRelacionado());
					calificacionempleadoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						calificacionempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsCalificacionEmpleado("no_relacionado");

						calificacionempleadoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CalificacionEmpleadoConstantesFunciones.ITAMANIOFILATABLA + (CalificacionEmpleadoConstantesFunciones.ITAMANIOFILATABLA/2));

						calificacionempleadoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderFormatoNomiFactorNomi=(TitledBorder)this.jScrollPanelDatosFormatoNomiFactorNomi.getBorder();
						TitledBorder titledBorderCalificacionEmpleado=(TitledBorder)calificacionempleadoBeanSwingJInternalFrame.jScrollPanelDatosCalificacionEmpleado.getBorder();

						titledBorderCalificacionEmpleado.setTitle(titledBorderFormatoNomiFactorNomi.getTitle() + " -> Calificacion Empleado");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,calificacionempleadoBeanSwingJInternalFrame);
						}

						calificacionempleadoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(calificacionempleadoBeanSwingJInternalFrame);

						calificacionempleadoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.formatonomifactornomiSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Calificacion Empleado",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualFormatoNomiFactorNomi(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaNuevoFormatoNomiFactorNomi && this.isPermisoNuevoFormatoNomiFactorNomi));			
			this.jButtonDuplicarFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaDuplicarFormatoNomiFactorNomi && this.isPermisoDuplicarFormatoNomiFactorNomi));			
			this.jButtonCopiarFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaCopiarFormatoNomiFactorNomi && this.isPermisoCopiarFormatoNomiFactorNomi));
			this.jButtonVerFormFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaVerFormFormatoNomiFactorNomi && this.isPermisoVerFormFormatoNomiFactorNomi));
			
			this.jButtonAbrirOrderByFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaOrdenFormatoNomiFactorNomi && this.isPermisoOrdenFormatoNomiFactorNomi));			
			
			this.jButtonNuevoRelacionesFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesFormatoNomiFactorNomi && this.isPermisoNuevoFormatoNomiFactorNomi));			
			this.jButtonNuevoGuardarCambiosFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaNuevoFormatoNomiFactorNomi && this.isPermisoNuevoFormatoNomiFactorNomi && this.isPermisoGuardarCambiosFormatoNomiFactorNomi));
			
			if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonModificarFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaModificarFormatoNomiFactorNomi && this.isPermisoActualizarFormatoNomiFactorNomi));	
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonActualizarFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaActualizarFormatoNomiFactorNomi && this.isPermisoActualizarFormatoNomiFactorNomi));	
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonEliminarFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaEliminarFormatoNomiFactorNomi && this.isPermisoEliminarFormatoNomiFactorNomi));
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonCancelarFormatoNomiFactorNomi.setVisible(this.isVisibilidadCeldaCancelarFormatoNomiFactorNomi);							
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonGuardarCambiosFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaGuardarFormatoNomiFactorNomi && this.isPermisoGuardarCambiosFormatoNomiFactorNomi));			
			
			}
						
			this.jButtonGuardarCambiosTablaFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosFormatoNomiFactorNomi && this.isPermisoGuardarCambiosFormatoNomiFactorNomi));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaNuevoFormatoNomiFactorNomi && this.isPermisoNuevoFormatoNomiFactorNomi));						
			this.jButtonDuplicarToolBarFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaDuplicarFormatoNomiFactorNomi && this.isPermisoDuplicarFormatoNomiFactorNomi));						
			this.jButtonCopiarToolBarFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaCopiarFormatoNomiFactorNomi && this.isPermisoCopiarFormatoNomiFactorNomi));			
			this.jButtonVerFormToolBarFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaVerFormFormatoNomiFactorNomi && this.isPermisoVerFormFormatoNomiFactorNomi));			
			this.jButtonAbrirOrderByToolBarFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaOrdenFormatoNomiFactorNomi && this.isPermisoOrdenFormatoNomiFactorNomi));
			this.jButtonNuevoRelacionesToolBarFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesFormatoNomiFactorNomi && this.isPermisoNuevoFormatoNomiFactorNomi));			
			this.jButtonNuevoGuardarCambiosToolBarFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaNuevoFormatoNomiFactorNomi && this.isPermisoNuevoFormatoNomiFactorNomi && this.isPermisoGuardarCambiosFormatoNomiFactorNomi));			
			
			if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonModificarToolBarFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaModificarFormatoNomiFactorNomi && this.isPermisoActualizarFormatoNomiFactorNomi));	
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonActualizarToolBarFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaActualizarFormatoNomiFactorNomi  && this.isPermisoActualizarFormatoNomiFactorNomi));	
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonEliminarToolBarFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaEliminarFormatoNomiFactorNomi && this.isPermisoEliminarFormatoNomiFactorNomi));
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonCancelarToolBarFormatoNomiFactorNomi.setVisible(this.isVisibilidadCeldaCancelarFormatoNomiFactorNomi);				
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonGuardarCambiosToolBarFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaGuardarFormatoNomiFactorNomi && this.isPermisoGuardarCambiosFormatoNomiFactorNomi));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosFormatoNomiFactorNomi && this.isPermisoGuardarCambiosFormatoNomiFactorNomi));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaNuevoFormatoNomiFactorNomi && this.isPermisoNuevoFormatoNomiFactorNomi));			
			this.jMenuItemDuplicarFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaDuplicarFormatoNomiFactorNomi && this.isPermisoDuplicarFormatoNomiFactorNomi));			
			this.jMenuItemCopiarFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaCopiarFormatoNomiFactorNomi && this.isPermisoCopiarFormatoNomiFactorNomi));			
			this.jMenuItemVerFormFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaVerFormFormatoNomiFactorNomi && this.isPermisoVerFormFormatoNomiFactorNomi));			
			this.jMenuItemAbrirOrderByFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaOrdenFormatoNomiFactorNomi && this.isPermisoOrdenFormatoNomiFactorNomi));			
			//this.jMenuItemMostrarOcultarFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaOrdenFormatoNomiFactorNomi && this.isPermisoOrdenFormatoNomiFactorNomi));
			this.jMenuItemDetalleAbrirOrderByFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaOrdenFormatoNomiFactorNomi && this.isPermisoOrdenFormatoNomiFactorNomi));			
			//this.jMenuItemDetalleMostrarOcultarFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaOrdenFormatoNomiFactorNomi && this.isPermisoOrdenFormatoNomiFactorNomi));			
			this.jMenuItemNuevoRelacionesFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesFormatoNomiFactorNomi && this.isPermisoNuevoFormatoNomiFactorNomi));			
			this.jMenuItemNuevoGuardarCambiosFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaNuevoFormatoNomiFactorNomi && this.isPermisoNuevoFormatoNomiFactorNomi && this.isPermisoGuardarCambiosFormatoNomiFactorNomi));									
			
			if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jMenuItemModificarFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaModificarFormatoNomiFactorNomi && this.isPermisoActualizarFormatoNomiFactorNomi));	
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jMenuItemActualizarFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaActualizarFormatoNomiFactorNomi && this.isPermisoActualizarFormatoNomiFactorNomi));	
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jMenuItemEliminarFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaEliminarFormatoNomiFactorNomi && this.isPermisoEliminarFormatoNomiFactorNomi));
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jMenuItemCancelarFormatoNomiFactorNomi.setVisible(this.isVisibilidadCeldaCancelarFormatoNomiFactorNomi);				
			}
			
			this.jMenuItemGuardarCambiosFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaGuardarFormatoNomiFactorNomi && this.isPermisoGuardarCambiosFormatoNomiFactorNomi));						
			this.jMenuItemGuardarCambiosTablaFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosFormatoNomiFactorNomi && this.isPermisoGuardarCambiosFormatoNomiFactorNomi));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoFormatoNomiFactorNomi=this.jButtonNuevoFormatoNomiFactorNomi.isVisible();
			this.isVisibilidadCeldaDuplicarFormatoNomiFactorNomi=this.jButtonDuplicarFormatoNomiFactorNomi.isVisible();
			this.isVisibilidadCeldaCopiarFormatoNomiFactorNomi=this.jButtonCopiarFormatoNomiFactorNomi.isVisible();
			this.isVisibilidadCeldaVerFormFormatoNomiFactorNomi=this.jButtonVerFormFormatoNomiFactorNomi.isVisible();
			
			this.isVisibilidadCeldaOrdenFormatoNomiFactorNomi=this.jButtonAbrirOrderByFormatoNomiFactorNomi.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomiFactorNomi=this.jButtonNuevoRelacionesFormatoNomiFactorNomi.isVisible();
			this.isVisibilidadCeldaModificarFormatoNomiFactorNomi=this.jButtonModificarFormatoNomiFactorNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
			this.isVisibilidadCeldaActualizarFormatoNomiFactorNomi=this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonActualizarFormatoNomiFactorNomi.isVisible();
			this.isVisibilidadCeldaEliminarFormatoNomiFactorNomi=this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonEliminarFormatoNomiFactorNomi.isVisible();
			this.isVisibilidadCeldaCancelarFormatoNomiFactorNomi=this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonCancelarFormatoNomiFactorNomi.isVisible();
			this.isVisibilidadCeldaGuardarFormatoNomiFactorNomi=this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonGuardarCambiosFormatoNomiFactorNomi.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosFormatoNomiFactorNomi=this.jButtonGuardarCambiosTablaFormatoNomiFactorNomi.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoFormatoNomiFactorNomi=this.jButtonNuevoToolBarFormatoNomiFactorNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomiFactorNomi=this.jButtonNuevoRelacionesToolBarFormatoNomiFactorNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
			this.isVisibilidadCeldaModificarFormatoNomiFactorNomi=this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonModificarToolBarFormatoNomiFactorNomi.isVisible();
			this.isVisibilidadCeldaActualizarFormatoNomiFactorNomi=this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonActualizarToolBarFormatoNomiFactorNomi.isVisible();
			this.isVisibilidadCeldaEliminarFormatoNomiFactorNomi=this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonEliminarToolBarFormatoNomiFactorNomi.isVisible();
			this.isVisibilidadCeldaCancelarFormatoNomiFactorNomi=this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonCancelarToolBarFormatoNomiFactorNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFormatoNomiFactorNomi=this.jButtonGuardarCambiosToolBarFormatoNomiFactorNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFormatoNomiFactorNomi=this.jButtonGuardarCambiosTablaToolBarFormatoNomiFactorNomi.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoFormatoNomiFactorNomi=this.jMenuItemNuevoFormatoNomiFactorNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomiFactorNomi=this.jMenuItemNuevoRelacionesFormatoNomiFactorNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
			this.isVisibilidadCeldaModificarFormatoNomiFactorNomi=this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jMenuItemModificarFormatoNomiFactorNomi.isVisible();
			this.isVisibilidadCeldaActualizarFormatoNomiFactorNomi=this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jMenuItemActualizarFormatoNomiFactorNomi.isVisible();
			this.isVisibilidadCeldaEliminarFormatoNomiFactorNomi=this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jMenuItemEliminarFormatoNomiFactorNomi.isVisible();
			this.isVisibilidadCeldaCancelarFormatoNomiFactorNomi=this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jMenuItemCancelarFormatoNomiFactorNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFormatoNomiFactorNomi=this.jMenuItemGuardarCambiosFormatoNomiFactorNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFormatoNomiFactorNomi=this.jMenuItemGuardarCambiosTablaFormatoNomiFactorNomi.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesFormatoNomiFactorNomi(Boolean esInicializar) {
		if(FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL) {			
			if(this.formatonomifactornomiSessionBean.getConGuardarRelaciones()) {
				//if(this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesFormatoNomiFactorNomi();
			}
			
			this.inicializarActualizarBindingBotonesManualFormatoNomiFactorNomi(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualFormatoNomiFactorNomi() {
		this.jButtonNuevoFormatoNomiFactorNomi.setVisible(this.isPermisoNuevoFormatoNomiFactorNomi);			
		this.jButtonDuplicarFormatoNomiFactorNomi.setVisible(this.isPermisoDuplicarFormatoNomiFactorNomi);			
		this.jButtonCopiarFormatoNomiFactorNomi.setVisible(this.isPermisoCopiarFormatoNomiFactorNomi);			
		this.jButtonVerFormFormatoNomiFactorNomi.setVisible(this.isPermisoVerFormFormatoNomiFactorNomi);			
		
		this.jButtonAbrirOrderByFormatoNomiFactorNomi.setVisible(this.isPermisoOrdenFormatoNomiFactorNomi);					
		
		this.jButtonNuevoRelacionesFormatoNomiFactorNomi.setVisible(this.isPermisoNuevoFormatoNomiFactorNomi);			
		
		if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonModificarFormatoNomiFactorNomi.setVisible(this.isPermisoActualizarFormatoNomiFactorNomi);	
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonActualizarFormatoNomiFactorNomi.setVisible(this.isPermisoActualizarFormatoNomiFactorNomi);	
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonEliminarFormatoNomiFactorNomi.setVisible(this.isPermisoEliminarFormatoNomiFactorNomi);
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonCancelarFormatoNomiFactorNomi.setVisible(this.isVisibilidadCeldaCancelarFormatoNomiFactorNomi);						
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonGuardarCambiosFormatoNomiFactorNomi.setVisible(this.isPermisoGuardarCambiosFormatoNomiFactorNomi);							
		}
		
		this.jButtonGuardarCambiosTablaFormatoNomiFactorNomi.setVisible(this.isPermisoActualizarFormatoNomiFactorNomi);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleFormatoNomiFactorNomi() {
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonModificarFormatoNomiFactorNomi.setVisible(this.isPermisoActualizarFormatoNomiFactorNomi);	
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonActualizarFormatoNomiFactorNomi.setVisible(this.isPermisoActualizarFormatoNomiFactorNomi);	
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonEliminarFormatoNomiFactorNomi.setVisible(this.isPermisoEliminarFormatoNomiFactorNomi);
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonCancelarFormatoNomiFactorNomi.setVisible(this.isVisibilidadCeldaCancelarFormatoNomiFactorNomi);							
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonGuardarCambiosFormatoNomiFactorNomi.setVisible((this.isVisibilidadCeldaGuardarFormatoNomiFactorNomi && this.isPermisoGuardarCambiosFormatoNomiFactorNomi));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosFormatoNomiFactorNomi() {
		if(FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualFormatoNomiFactorNomi();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesFormatoNomiFactorNomi() {
	}
	
	public void jTableDatosFormatoNomiFactorNomiListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarFormatoNomiFactorNomi(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidFormatoNomiFactorNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormatoNomiFactorNomi(this.getformatonomifactornomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiFactorNomi(this.formatonomifactornomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formatonomifactornomi==null) {
						this.formatonomifactornomi = new FormatoNomiFactorNomi();
					}

					this.setVariablesFormularioToObjetoActualFormatoNomiFactorNomi(this.formatonomifactornomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiFactorNomi(this.formatonomifactornomi);
				}

				if(this.formatonomifactornomi.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.formatonomifactornomi.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormatoNomiFactorNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaFormatoNomiFactorNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebFormatoNomiFactorNomi(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormatoNomiFactorNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormatoNomiFactorNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormatoNomiFactorNomi(this.getformatonomifactornomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiFactorNomi(this.formatonomifactornomi);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.formatonomifactornomiLogic.getConnexion());

				if(this.formatonomifactornomi.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.formatonomifactornomi.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormatoNomiFactorNomi=(TitledBorder)this.jScrollPanelDatosFormatoNomiFactorNomi.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderFormatoNomiFactorNomi.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaFormatoNomiFactorNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormatoNomiFactorNomi(this.getformatonomifactornomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiFactorNomi(this.formatonomifactornomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formatonomifactornomi==null) {
						this.formatonomifactornomi = new FormatoNomiFactorNomi();
					}

					this.setVariablesFormularioToObjetoActualFormatoNomiFactorNomi(this.formatonomifactornomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiFactorNomi(this.formatonomifactornomi);
				}

				if(this.formatonomifactornomi.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.formatonomifactornomi.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormatoNomiFactorNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalFormatoNomiFactorNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebFormatoNomiFactorNomi(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormatoNomiFactorNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormatoNomiFactorNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormatoNomiFactorNomi(this.getformatonomifactornomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiFactorNomi(this.formatonomifactornomi);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.formatonomifactornomiLogic.getConnexion());

				if(this.formatonomifactornomi.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.formatonomifactornomi.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormatoNomiFactorNomi=(TitledBorder)this.jScrollPanelDatosFormatoNomiFactorNomi.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderFormatoNomiFactorNomi.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalFormatoNomiFactorNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormatoNomiFactorNomi(this.getformatonomifactornomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiFactorNomi(this.formatonomifactornomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formatonomifactornomi==null) {
						this.formatonomifactornomi = new FormatoNomiFactorNomi();
					}

					this.setVariablesFormularioToObjetoActualFormatoNomiFactorNomi(this.formatonomifactornomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiFactorNomi(this.formatonomifactornomi);
				}

				if(this.formatonomifactornomi.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.formatonomifactornomi.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormatoNomiFactorNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_formato_nomiFormatoNomiFactorNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoformatonomi=true;

			idTienePermisoformatonomi=this.tienePermisosUsuarioEnPaginaWebFormatoNomiFactorNomi(FormatoNomiConstantesFunciones.CLASSNAME);

			if(idTienePermisoformatonomi) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormatoNomiFactorNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormatoNomiFactorNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormatoNomiFactorNomi(this.getformatonomifactornomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiFactorNomi(this.formatonomifactornomi);

				this.formatonomiBeanSwingJInternalFrame=new FormatoNomiBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.formatonomiBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.formatonomiBeanSwingJInternalFrame.getFormatoNomiLogic().setConnexion(this.formatonomifactornomiLogic.getConnexion());

				if(this.formatonomifactornomi.getid_formato_nomi()!=null) {
					this.formatonomiBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.formatonomiBeanSwingJInternalFrame.setIdActual(this.formatonomifactornomi.getid_formato_nomi());
					this.formatonomiBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.formatonomiBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.formatonomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormatoNomi();
				}

				JInternalFrameBase jinternalFrame =this.formatonomiBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormatoNomiFactorNomi=(TitledBorder)this.jScrollPanelDatosFormatoNomiFactorNomi.getBorder();
				TitledBorder titledBorderformatonomi=(TitledBorder)this.formatonomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomi.getBorder();

				titledBorderformatonomi.setTitle(titledBorderFormatoNomiFactorNomi.getTitle() + " -> Formato Nomi");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_formato_nomiFormatoNomiFactorNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormatoNomiFactorNomi(this.getformatonomifactornomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiFactorNomi(this.formatonomifactornomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formatonomifactornomi==null) {
						this.formatonomifactornomi = new FormatoNomiFactorNomi();
					}

					this.setVariablesFormularioToObjetoActualFormatoNomiFactorNomi(this.formatonomifactornomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiFactorNomi(this.formatonomifactornomi);
				}

				if(this.formatonomifactornomi.getid_formato_nomi()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_formato_nomi = "+this.formatonomifactornomi.getid_formato_nomi().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormatoNomiFactorNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_factor_nomiFormatoNomiFactorNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisofactornomi=true;

			idTienePermisofactornomi=this.tienePermisosUsuarioEnPaginaWebFormatoNomiFactorNomi(FactorNomiConstantesFunciones.CLASSNAME);

			if(idTienePermisofactornomi) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormatoNomiFactorNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormatoNomiFactorNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormatoNomiFactorNomi(this.getformatonomifactornomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiFactorNomi(this.formatonomifactornomi);

				this.factornomiBeanSwingJInternalFrame=new FactorNomiBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.factornomiBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.factornomiBeanSwingJInternalFrame.getFactorNomiLogic().setConnexion(this.formatonomifactornomiLogic.getConnexion());

				if(this.formatonomifactornomi.getid_factor_nomi()!=null) {
					this.factornomiBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.factornomiBeanSwingJInternalFrame.setIdActual(this.formatonomifactornomi.getid_factor_nomi());
					this.factornomiBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.factornomiBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.factornomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaFactorNomi();
				}

				JInternalFrameBase jinternalFrame =this.factornomiBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormatoNomiFactorNomi=(TitledBorder)this.jScrollPanelDatosFormatoNomiFactorNomi.getBorder();
				TitledBorder titledBorderfactornomi=(TitledBorder)this.factornomiBeanSwingJInternalFrame.jScrollPanelDatosFactorNomi.getBorder();

				titledBorderfactornomi.setTitle(titledBorderFormatoNomiFactorNomi.getTitle() + " -> Factor Nomi");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_factor_nomiFormatoNomiFactorNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormatoNomiFactorNomi(this.getformatonomifactornomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiFactorNomi(this.formatonomifactornomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formatonomifactornomi==null) {
						this.formatonomifactornomi = new FormatoNomiFactorNomi();
					}

					this.setVariablesFormularioToObjetoActualFormatoNomiFactorNomi(this.formatonomifactornomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiFactorNomi(this.formatonomifactornomi);
				}

				if(this.formatonomifactornomi.getid_factor_nomi()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_factor_nomi = "+this.formatonomifactornomi.getid_factor_nomi().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormatoNomiFactorNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonponderacionFormatoNomiFactorNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormatoNomiFactorNomi(this.getformatonomifactornomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiFactorNomi(this.formatonomifactornomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formatonomifactornomi==null) {
						this.formatonomifactornomi = new FormatoNomiFactorNomi();
					}

					this.setVariablesFormularioToObjetoActualFormatoNomiFactorNomi(this.formatonomifactornomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiFactorNomi(this.formatonomifactornomi);
				}

				if(this.formatonomifactornomi.getponderacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ponderacion = "+this.formatonomifactornomi.getponderacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormatoNomiFactorNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoFormatoNomiFactorNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormatoNomiFactorNomi(this.getformatonomifactornomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiFactorNomi(this.formatonomifactornomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formatonomifactornomi==null) {
						this.formatonomifactornomi = new FormatoNomiFactorNomi();
					}

					this.setVariablesFormularioToObjetoActualFormatoNomiFactorNomi(this.formatonomifactornomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiFactorNomi(this.formatonomifactornomi);
				}

				if(this.formatonomifactornomi.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.formatonomifactornomi.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormatoNomiFactorNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaFormatoNomiFactorNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormatoNomiFactorNomi(false,false);

			this.getFormatoNomiFactorNomisFK_IdEmpresa();

			this.inicializarActualizarBindingFormatoNomiFactorNomi(false);

			//if(FormatoNomiFactorNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormatoNomiFactorNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFactorNomiFormatoNomiFactorNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormatoNomiFactorNomi(false,false);

			this.getFormatoNomiFactorNomisFK_IdFactorNomi();

			this.inicializarActualizarBindingFormatoNomiFactorNomi(false);

			//if(FormatoNomiFactorNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormatoNomiFactorNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFormatoNomiFormatoNomiFactorNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormatoNomiFactorNomi(false,false);

			this.getFormatoNomiFactorNomisFK_IdFormatoNomi();

			this.inicializarActualizarBindingFormatoNomiFactorNomi(false);

			//if(FormatoNomiFactorNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormatoNomiFactorNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalFormatoNomiFactorNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormatoNomiFactorNomi(false,false);

			this.getFormatoNomiFactorNomisFK_IdSucursal();

			this.inicializarActualizarBindingFormatoNomiFactorNomi(false);

			//if(FormatoNomiFactorNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormatoNomiFactorNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomifactornomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameFormatoNomiFactorNomi() {
		if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
		

		if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.setVisible(false);	    			
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.dispose();
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi!=null) {
			this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.dispose();
			this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi=null;
		}
		
		if(this.jInternalFrameImportacionFormatoNomiFactorNomi!=null) {
			this.jInternalFrameImportacionFormatoNomiFactorNomi.setVisible(false);	    			
			this.jInternalFrameImportacionFormatoNomiFactorNomi.dispose();
			this.jInternalFrameImportacionFormatoNomiFactorNomi=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessFormatoNomiFactorNomi();
			
			FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
			
			
			if(sTipo.equals("NuevoFormatoNomiFactorNomi")) {
				jButtonNuevoFormatoNomiFactorNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarFormatoNomiFactorNomi")) {
				jButtonDuplicarFormatoNomiFactorNomiActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarFormatoNomiFactorNomi")) {
				jButtonCopiarFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormFormatoNomiFactorNomi")) {
				jButtonVerFormFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarFormatoNomiFactorNomi")) {
				jButtonNuevoFormatoNomiFactorNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarFormatoNomiFactorNomi")) {
				jButtonDuplicarFormatoNomiFactorNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoFormatoNomiFactorNomi")) {
				jButtonNuevoFormatoNomiFactorNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarFormatoNomiFactorNomi")) {
				jButtonDuplicarFormatoNomiFactorNomiActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesFormatoNomiFactorNomi")) {
				jButtonNuevoFormatoNomiFactorNomiActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarFormatoNomiFactorNomi")) {
				jButtonNuevoFormatoNomiFactorNomiActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesFormatoNomiFactorNomi")) {
				jButtonNuevoFormatoNomiFactorNomiActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarFormatoNomiFactorNomi")) {
				jButtonModificarFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarFormatoNomiFactorNomi")) {
				jButtonModificarFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarFormatoNomiFactorNomi")) {
				jButtonModificarFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarFormatoNomiFactorNomi")) {
				jButtonActualizarFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarFormatoNomiFactorNomi")) {
				jButtonActualizarFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarFormatoNomiFactorNomi")) {
				jButtonActualizarFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarFormatoNomiFactorNomi")) {
				jButtonEliminarFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarFormatoNomiFactorNomi")) {
				jButtonEliminarFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarFormatoNomiFactorNomi")) {
				jButtonEliminarFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarFormatoNomiFactorNomi")) {
				jButtonCancelarFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarFormatoNomiFactorNomi")) {
				jButtonCancelarFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarFormatoNomiFactorNomi")) {
				jButtonCancelarFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarFormatoNomiFactorNomi")) {
				jButtonCerrarFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarFormatoNomiFactorNomi")) {
				jButtonCerrarFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarFormatoNomiFactorNomi")) {
				jButtonCerrarFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarFormatoNomiFactorNomi")) {
				jButtonMostrarOcultarFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarFormatoNomiFactorNomi")) {
				jButtonCancelarFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosFormatoNomiFactorNomi")) {
				jButtonGuardarCambiosFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarFormatoNomiFactorNomi")) {
				jButtonGuardarCambiosFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarFormatoNomiFactorNomi")) {
				jButtonCopiarFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarFormatoNomiFactorNomi")) {
				jButtonVerFormFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosFormatoNomiFactorNomi")) {
				jButtonGuardarCambiosFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarFormatoNomiFactorNomi")) {
				jButtonCopiarFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormFormatoNomiFactorNomi")) {
				jButtonVerFormFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaFormatoNomiFactorNomi")) {
				jButtonGuardarCambiosFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarFormatoNomiFactorNomi")) {
				jButtonGuardarCambiosFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaFormatoNomiFactorNomi")) {
				jButtonGuardarCambiosFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionFormatoNomiFactorNomi")) {
				jButtonRecargarInformacionFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarFormatoNomiFactorNomi")) {
				jButtonRecargarInformacionFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionFormatoNomiFactorNomi")) {
				jButtonRecargarInformacionFormatoNomiFactorNomiActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresFormatoNomiFactorNomi")) {
				jButtonAnterioresFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarFormatoNomiFactorNomi")) {
				jButtonAnterioresFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreFormatoNomiFactorNomi")) {
				jButtonAnterioresFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesFormatoNomiFactorNomi")) {
				jButtonSiguientesFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarFormatoNomiFactorNomi")) {
				jButtonSiguientesFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesFormatoNomiFactorNomi")) {
				jButtonSiguientesFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByFormatoNomiFactorNomi") || sTipo.equals("MenuItemDetalleAbrirOrderByFormatoNomiFactorNomi")) {
				jButtonAbrirOrderByFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarFormatoNomiFactorNomi") || sTipo.equals("MenuItemDetalleMostrarOcultarFormatoNomiFactorNomi")) {
				jButtonMostrarOcultarFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosFormatoNomiFactorNomi")) {
				jButtonNuevoGuardarCambiosFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarFormatoNomiFactorNomi")) {
				jButtonNuevoGuardarCambiosFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosFormatoNomiFactorNomi")) {
				jButtonNuevoGuardarCambiosFormatoNomiFactorNomiActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoFormatoNomiFactorNomi")) {
				jButtonCerrarReporteDinamicoFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoFormatoNomiFactorNomi")) {
				jButtonGenerarReporteDinamicoFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoFormatoNomiFactorNomi")) {
				
				jButtonGenerarExcelReporteDinamicoFormatoNomiFactorNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionFormatoNomiFactorNomi")) {
				jButtonCerrarImportacionFormatoNomiFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionFormatoNomiFactorNomi")) {
				
				jButtonGenerarImportacionFormatoNomiFactorNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionFormatoNomiFactorNomi")) {
				
				jButtonAbrirImportacionFormatoNomiFactorNomiActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesFormatoNomiFactorNomi")) {
				jComboBoxTiposAccionesFormatoNomiFactorNomiActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesFormatoNomiFactorNomi")) {
				jComboBoxTiposRelacionesFormatoNomiFactorNomiActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioFormatoNomiFactorNomi")) {
				jComboBoxTiposAccionesFormatoNomiFactorNomiActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarFormatoNomiFactorNomi")) {
				
				jComboBoxTiposSeleccionarFormatoNomiFactorNomiActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralFormatoNomiFactorNomi")) {
				jTextFieldValorCampoGeneralFormatoNomiFactorNomiActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByFormatoNomiFactorNomi")) {
				jButtonAbrirOrderByFormatoNomiFactorNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarFormatoNomiFactorNomi")) {
				jButtonAbrirOrderByFormatoNomiFactorNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByFormatoNomiFactorNomi")) {
				jButtonCerrarOrderByFormatoNomiFactorNomiActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFormatoNomiFactorNomiBusqueda")) {
				this.jButtonidFormatoNomiFactorNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFormatoNomiFactorNomiUpdate")) {
				this.jButtonid_empresaFormatoNomiFactorNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFormatoNomiFactorNomiBusqueda")) {
				this.jButtonid_empresaFormatoNomiFactorNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalFormatoNomiFactorNomiUpdate")) {
				this.jButtonid_sucursalFormatoNomiFactorNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalFormatoNomiFactorNomiBusqueda")) {
				this.jButtonid_sucursalFormatoNomiFactorNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formato_nomiFormatoNomiFactorNomiUpdate")) {
				this.jButtonid_formato_nomiFormatoNomiFactorNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formato_nomiFormatoNomiFactorNomiBusqueda")) {
				this.jButtonid_formato_nomiFormatoNomiFactorNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_factor_nomiFormatoNomiFactorNomiUpdate")) {
				this.jButtonid_factor_nomiFormatoNomiFactorNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_factor_nomiFormatoNomiFactorNomiBusqueda")) {
				this.jButtonid_factor_nomiFormatoNomiFactorNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ponderacionFormatoNomiFactorNomiBusqueda")) {
				this.jButtonponderacionFormatoNomiFactorNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoFormatoNomiFactorNomiBusqueda")) {
				this.jButtonesta_activoFormatoNomiFactorNomiBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdFactorNomiFormatoNomiFactorNomi")) {
				this.jButtonFK_IdFactorNomiFormatoNomiFactorNomiActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdFormatoNomiFormatoNomiFactorNomi")) {
				this.jButtonFK_IdFormatoNomiFormatoNomiFactorNomiActionPerformed(evt);
			}
			
			;
			
			
			FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessFormatoNomiFactorNomi();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoNomiFactorNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomifactornomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomifactornomi);
				
				FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
				
				


				
				FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoNomiFactorNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomiFactorNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			FormatoNomiFactorNomi formatonomifactornomiLocal=null;
			
			if(!this.getEsControlTabla()) {
				formatonomifactornomiLocal=this.formatonomifactornomi;
			} else {
				formatonomifactornomiLocal=this.formatonomifactornomiAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomifactornomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomifactornomi);
				
				FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
							
				
				


				
				FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoNomiFactorNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomiFactorNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoNomiFactorNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiAnterior =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatonomifactornomiAnterior =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
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
			
			FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
			
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
			
			


			
			FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoNomiFactorNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomifactornomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomifactornomi);
				
				FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
								
						
				


				
				FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoNomiFactorNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomiFactorNomi.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomifactornomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomifactornomi);
				
				FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
								
				
				


				
				FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoNomiFactorNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomiFactorNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoNomiFactorNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiAnterior =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatonomifactornomiAnterior =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomifactornomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomifactornomi);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoNomiFactorNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiAnterior =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatonomifactornomiAnterior =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoNomiFactorNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomifactornomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.formatonomifactornomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomifactornomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomifactornomi);
				
				FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
							
				
				


				
				FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoNomiFactorNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomiFactorNomi.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoNomiFactorNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomifactornomiAnterior =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.formatonomifactornomiAnterior =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
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
			
			FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
			
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
			
			


			
			FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoNomiFactorNomiActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomifactornomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.formatonomifactornomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomifactornomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomifactornomi);
				
				FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
								
				
				


				
				FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoNomiFactorNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomiFactorNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoNomiFactorNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiAnterior =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatonomifactornomiAnterior =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoNomiFactorNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomifactornomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.formatonomifactornomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoNomiFactorNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomifactornomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomifactornomi);
				
				FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosFormatoNomiFactorNomi")) {
					jCheckBoxSeleccionarTodosFormatoNomiFactorNomiItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosFormatoNomiFactorNomi")) {
					jCheckBoxSeleccionadosFormatoNomiFactorNomiItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarFormatoNomiFactorNomi")) {
					
				}
				
				


				
				
				FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoNomiFactorNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomiFactorNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomifactornomi);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.formatonomifactornomi);
				
				FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
												
				
				


				
				
				FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoNomiFactorNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomiFactorNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoNomiFactorNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomifactornomiAnterior =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.formatonomifactornomiAnterior =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoNomiFactorNomiActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomifactornomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomifactornomi);
				
				FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
				
				
				FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
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
			
			FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
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
			
			


			
			FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoNomiFactorNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomifactornomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomifactornomi);
				
				FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoNomiFactorNomi.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomiFactorNomi.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomifactornomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomifactornomi);
				
				FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
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
				
				


				
				FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoNomiFactorNomi.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomiFactorNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoNomiFactorNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomifactornomiAnterior =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatonomifactornomiAnterior =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarFormatoNomiFactorNomi")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosFormatoNomiFactorNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosFormatoNomiFactorNomi.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.formatonomifactornomi =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.formatonomifactornomi);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarFormatoNomiFactorNomi")) {
				
				}
				
				FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarFormatoNomiFactorNomi")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosFormatoNomiFactorNomi.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarFormatoNomiFactorNomi")) {
			
			}
			
			FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessFormatoNomiFactorNomi();
			
			FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
			
			if(sTipo.equals("NuevoFormatoNomiFactorNomi")) {
				jButtonNuevoFormatoNomiFactorNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarFormatoNomiFactorNomi")) {
				jButtonDuplicarFormatoNomiFactorNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarFormatoNomiFactorNomi")) {
				jButtonCopiarFormatoNomiFactorNomiActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormFormatoNomiFactorNomi")) {
				jButtonVerFormFormatoNomiFactorNomiActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesFormatoNomiFactorNomi")) {
				jButtonNuevoFormatoNomiFactorNomiActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarFormatoNomiFactorNomi")) {
				jButtonModificarFormatoNomiFactorNomiActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarFormatoNomiFactorNomi")) {
				jButtonActualizarFormatoNomiFactorNomiActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarFormatoNomiFactorNomi")) {
				jButtonEliminarFormatoNomiFactorNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaFormatoNomiFactorNomi")) {
				jButtonGuardarCambiosFormatoNomiFactorNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarFormatoNomiFactorNomi")) {
				jButtonCancelarFormatoNomiFactorNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarFormatoNomiFactorNomi")) {
				jButtonCerrarFormatoNomiFactorNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosFormatoNomiFactorNomi")) {
				jButtonGuardarCambiosFormatoNomiFactorNomiActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosFormatoNomiFactorNomi")) {
				jButtonNuevoGuardarCambiosFormatoNomiFactorNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByFormatoNomiFactorNomi")) {
				jButtonAbrirOrderByFormatoNomiFactorNomiActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionFormatoNomiFactorNomi")) {
				jButtonRecargarInformacionFormatoNomiFactorNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresFormatoNomiFactorNomi")) {
				jButtonAnterioresFormatoNomiFactorNomiActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesFormatoNomiFactorNomi")) {
				jButtonSiguientesFormatoNomiFactorNomiActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFormatoNomiFactorNomiBusqueda")) {
				this.jButtonidFormatoNomiFactorNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFormatoNomiFactorNomiUpdate")) {
				this.jButtonid_empresaFormatoNomiFactorNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFormatoNomiFactorNomiBusqueda")) {
				this.jButtonid_empresaFormatoNomiFactorNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalFormatoNomiFactorNomiUpdate")) {
				this.jButtonid_sucursalFormatoNomiFactorNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalFormatoNomiFactorNomiBusqueda")) {
				this.jButtonid_sucursalFormatoNomiFactorNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formato_nomiFormatoNomiFactorNomiUpdate")) {
				this.jButtonid_formato_nomiFormatoNomiFactorNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formato_nomiFormatoNomiFactorNomiBusqueda")) {
				this.jButtonid_formato_nomiFormatoNomiFactorNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_factor_nomiFormatoNomiFactorNomiUpdate")) {
				this.jButtonid_factor_nomiFormatoNomiFactorNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_factor_nomiFormatoNomiFactorNomiBusqueda")) {
				this.jButtonid_factor_nomiFormatoNomiFactorNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ponderacionFormatoNomiFactorNomiBusqueda")) {
				this.jButtonponderacionFormatoNomiFactorNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoFormatoNomiFactorNomiBusqueda")) {
				this.jButtonesta_activoFormatoNomiFactorNomiBusquedaActionPerformed(evt);
			}
			
			FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessFormatoNomiFactorNomi();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameFormatoNomiFactorNomi")) {
				closingInternalFrameFormatoNomiFactorNomi();
				
			} else if(sTipo.equals("jButtonCancelarFormatoNomiFactorNomi")) {
				JInternalFrameBase jInternalFrameDetalleFormFormatoNomiFactorNomi = (JInternalFrameBase)evt.getSource();
	            	
	            FormatoNomiFactorNomiBeanSwingJInternalFrame jInternalFrameParent=(FormatoNomiFactorNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormFormatoNomiFactorNomi.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarFormatoNomiFactorNomiActionPerformed(null);
			}
			
			FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.formatonomifactornomi,new Object(),this.formatonomifactornomiParameterGeneral,this.formatonomifactornomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormFormatoNomiFactorNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormFormatoNomiFactorNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormFormatoNomiFactorNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.formatonomifactornomi)) {
			if(!esControlTabla) {
				if(FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualFormatoNomiFactorNomi(this.formatonomifactornomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiFactorNomi(this.formatonomifactornomi);			
				}
				
				if(this.formatonomifactornomiSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualFormatoNomiFactorNomi(this.formatonomifactornomi,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.formatonomifactornomiReturnGeneral=formatonomifactornomiLogic.procesarEventosFormatoNomiFactorNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formatonomifactornomiLogic.getFormatoNomiFactorNomis(),this.formatonomifactornomi,this.formatonomifactornomiParameterGeneral,this.isEsNuevoFormatoNomiFactorNomi,classes);//this.formatonomifactornomiLogic.getFormatoNomiFactorNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanFormatoNomiFactorNomi(this.formatonomifactornomiReturnGeneral,this.formatonomifactornomiBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.formatonomifactornomiSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanFormatoNomiFactorNomi(classes,this.formatonomifactornomiReturnGeneral,this.formatonomifactornomiBean,false);
					}
						
					if(this.formatonomifactornomiReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyFormatoNomiFactorNomi(this.formatonomifactornomiReturnGeneral.getFormatoNomiFactorNomi());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioFormatoNomiFactorNomi(this.formatonomifactornomiReturnGeneral.getFormatoNomiFactorNomi());	
					}
						
					if(this.formatonomifactornomiReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioFormatoNomiFactorNomi(this.formatonomifactornomiReturnGeneral.getFormatoNomiFactorNomi(),classes);//this.formatonomifactornomiBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioFormatoNomiFactorNomi(this.formatonomifactornomi,classes);//this.formatonomifactornomiBean);									
				}
			
				if(FormatoNomiFactorNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualFormatoNomiFactorNomi(this.formatonomifactornomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiFactorNomi(this.formatonomifactornomi);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.formatonomifactornomiAnterior!=null) {
						this.formatonomifactornomi=this.formatonomifactornomiAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.formatonomifactornomiReturnGeneral=formatonomifactornomiLogic.procesarEventosFormatoNomiFactorNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formatonomifactornomiLogic.getFormatoNomiFactorNomis(),this.formatonomifactornomi,this.formatonomifactornomiParameterGeneral,this.isEsNuevoFormatoNomiFactorNomi,classes);//this.formatonomifactornomiLogic.getFormatoNomiFactorNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.formatonomifactornomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.formatonomifactornomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.formatonomifactornomiReturnGeneral.getFormatoNomiFactorNomi(),formatonomifactornomiLogic.getFormatoNomiFactorNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.formatonomifactornomiReturnGeneral.getFormatoNomiFactorNomi(),this.formatonomifactornomis);
				}
				//ARCHITECTURE
				
				//this.jTableDatosFormatoNomiFactorNomi.repaint();
				
				//((AbstractTableModel) this.jTableDatosFormatoNomiFactorNomi.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosFormatoNomiFactorNomi();
			}
		}
	}
	
	public void actualizarVisualTableDatosFormatoNomiFactorNomi() throws Exception {
		
		FormatoNomiFactorNomiModel formatonomifactornomiModel=(FormatoNomiFactorNomiModel)this.jTableDatosFormatoNomiFactorNomi.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			formatonomifactornomiModel.formatonomifactornomis=this.formatonomifactornomiLogic.getFormatoNomiFactorNomis();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			formatonomifactornomiModel.formatonomifactornomis=this.formatonomifactornomis;
		}
		
		
		((FormatoNomiFactorNomiModel) this.jTableDatosFormatoNomiFactorNomi.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaFormatoNomiFactorNomi() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getformatonomifactornomiAnterior(),this.formatonomifactornomiLogic.getFormatoNomiFactorNomis());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getformatonomifactornomiAnterior(),this.formatonomifactornomis);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosFormatoNomiFactorNomi();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioFormatoNomiFactorNomi(FormatoNomiFactorNomi formatonomifactornomi,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(CalificacionEmpleado.class)) {
					this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.setCalificacionEmpleados(formatonomifactornomi.getCalificacionEmpleados());
					this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCalificacionEmpleado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
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
										
				FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formatonomifactornomi,new Object(),generalEntityParameterGeneral,this.formatonomifactornomiReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.formatonomifactornomiSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=FormatoNomiFactorNomiConstantesFunciones.getClassesRelationshipsOfFormatoNomiFactorNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=FormatoNomiFactorNomiConstantesFunciones.getClassesRelationshipsFromStringsOfFormatoNomiFactorNomi(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormFormatoNomiFactorNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formatonomifactornomi,new Object(),generalEntityParameterGeneral,this.formatonomifactornomiReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioFormatoNomiFactorNomi(FormatoNomiFactorNomiBean formatonomifactornomiBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(CalificacionEmpleado.class)) {
					this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.setCalificacionEmpleados(formatonomifactornomi.getCalificacionEmpleados());
					this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCalificacionEmpleado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanFormatoNomiFactorNomi(ArrayList<Classe> classes,FormatoNomiFactorNomiReturnGeneral formatonomifactornomiReturnGeneral,FormatoNomiFactorNomiBean formatonomifactornomiBean,Boolean conDefault) throws Exception {
		
			this.formatonomifactornomiBean.setCalificacionEmpleados(formatonomifactornomiReturnGeneral.getFormatoNomiFactorNomi().getCalificacionEmpleados());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualFormatoNomiFactorNomi(FormatoNomiFactorNomi formatonomifactornomi,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(CalificacionEmpleado.class)) {
					formatonomifactornomi.setCalificacionEmpleados(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados());
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
		if(!paraTabla && !this.permiteMantenimiento(this.formatonomifactornomi)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi = new FormatoNomiFactorNomiDetalleFormJInternalFrame(jDesktopPane,this.formatonomifactornomiSessionBean.getConGuardarRelaciones(),this.formatonomifactornomiSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormFormatoNomiFactorNomi);
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.setVisible(false);
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.setSelected(false);						
		
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.formatonomifactornomiLogic=this.formatonomifactornomiLogic;
		
		this.cargarCombosFrameForeignKeyFormatoNomiFactorNomi("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleFormatoNomiFactorNomi();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFormatoNomiFactorNomi();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyFormatoNomiFactorNomi("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyFormatoNomiFactorNomi();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFormatoNomiFactorNomi"));
		
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonModificarFormatoNomiFactorNomi.addActionListener(new ButtonActionListener(this,"ModificarFormatoNomiFactorNomi"));

		
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonModificarToolBarFormatoNomiFactorNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarFormatoNomiFactorNomi"));
					
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jMenuItemModificarFormatoNomiFactorNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarFormatoNomiFactorNomi"));		
		
		
		
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonActualizarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"ActualizarFormatoNomiFactorNomi"));
		
		
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonActualizarToolBarFormatoNomiFactorNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFormatoNomiFactorNomi"));
						
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jMenuItemActualizarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFormatoNomiFactorNomi"));		
		
		
		
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonEliminarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"EliminarFormatoNomiFactorNomi"));
		
		
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonEliminarToolBarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarFormatoNomiFactorNomi"));
								
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jMenuItemEliminarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFormatoNomiFactorNomi"));		
		
		
		
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonCancelarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"CancelarFormatoNomiFactorNomi"));
		
		
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonCancelarToolBarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarFormatoNomiFactorNomi"));
					
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jMenuItemCancelarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFormatoNomiFactorNomi"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jMenuItemDetalleCerrarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFormatoNomiFactorNomi"));		
		
		
		
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonGuardarCambiosToolBarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFormatoNomiFactorNomi"));
		
		
		
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonGuardarCambiosToolBarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFormatoNomiFactorNomi"));
		
		
		
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxTiposAccionesFormularioFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFormatoNomiFactorNomi"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonidFormatoNomiFactorNomiBusqueda.addActionListener(new ButtonActionListener(this,"idFormatoNomiFactorNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonid_empresaFormatoNomiFactorNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFormatoNomiFactorNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonid_empresaFormatoNomiFactorNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFormatoNomiFactorNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonid_sucursalFormatoNomiFactorNomiUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalFormatoNomiFactorNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonid_sucursalFormatoNomiFactorNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalFormatoNomiFactorNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonid_formato_nomiFormatoNomiFactorNomiUpdate.addActionListener(new ButtonActionListener(this,"id_formato_nomiFormatoNomiFactorNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonid_formato_nomiFormatoNomiFactorNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_formato_nomiFormatoNomiFactorNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonid_factor_nomiFormatoNomiFactorNomiUpdate.addActionListener(new ButtonActionListener(this,"id_factor_nomiFormatoNomiFactorNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonid_factor_nomiFormatoNomiFactorNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_factor_nomiFormatoNomiFactorNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonponderacionFormatoNomiFactorNomiBusqueda.addActionListener(new ButtonActionListener(this,"ponderacionFormatoNomiFactorNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonesta_activoFormatoNomiFactorNomiBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoFormatoNomiFactorNomiBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jTabbedPaneRelacionesFormatoNomiFactorNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFormatoNomiFactorNomi"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameFormatoNomiFactorNomi"));
		
		if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFormatoNomiFactorNomi"));
		}
		
		this.jTableDatosFormatoNomiFactorNomi.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarFormatoNomiFactorNomi"));
		
		this.jTableDatosFormatoNomiFactorNomi.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarFormatoNomiFactorNomi"));
		
		this.jButtonNuevoFormatoNomiFactorNomi.addActionListener(new ButtonActionListener(this,"NuevoFormatoNomiFactorNomi"));
		
		this.jButtonDuplicarFormatoNomiFactorNomi.addActionListener(new ButtonActionListener(this,"DuplicarFormatoNomiFactorNomi"));
		
		this.jButtonCopiarFormatoNomiFactorNomi.addActionListener(new ButtonActionListener(this,"CopiarFormatoNomiFactorNomi"));
		
		this.jButtonVerFormFormatoNomiFactorNomi.addActionListener(new ButtonActionListener(this,"VerFormFormatoNomiFactorNomi"));
		
		
		this.jButtonNuevoToolBarFormatoNomiFactorNomi.addActionListener(new ButtonActionListener(this,"NuevoToolBarFormatoNomiFactorNomi"));
			
		this.jButtonDuplicarToolBarFormatoNomiFactorNomi.addActionListener(new ButtonActionListener(this,"DuplicarToolBarFormatoNomiFactorNomi"));
			
		this.jMenuItemNuevoFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoFormatoNomiFactorNomi"));
			
		this.jMenuItemDuplicarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarFormatoNomiFactorNomi"));		
		
		
		this.jButtonNuevoRelacionesFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"NuevoRelacionesFormatoNomiFactorNomi"));
		
		
		this.jButtonNuevoRelacionesToolBarFormatoNomiFactorNomi.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarFormatoNomiFactorNomi"));
			
		this.jMenuItemNuevoRelacionesFormatoNomiFactorNomi.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesFormatoNomiFactorNomi"));		
		
		
		if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonModificarFormatoNomiFactorNomi.addActionListener(new ButtonActionListener(this,"ModificarFormatoNomiFactorNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonModificarToolBarFormatoNomiFactorNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarFormatoNomiFactorNomi"));
			
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jMenuItemModificarFormatoNomiFactorNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarFormatoNomiFactorNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonActualizarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"ActualizarFormatoNomiFactorNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonActualizarToolBarFormatoNomiFactorNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFormatoNomiFactorNomi"));
				
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jMenuItemActualizarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFormatoNomiFactorNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonEliminarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"EliminarFormatoNomiFactorNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonEliminarToolBarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarFormatoNomiFactorNomi"));
						
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jMenuItemEliminarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFormatoNomiFactorNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonCancelarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"CancelarFormatoNomiFactorNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonCancelarToolBarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarFormatoNomiFactorNomi"));
			
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jMenuItemCancelarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFormatoNomiFactorNomi"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarFormatoNomiFactorNomi"));		
		
		
		this.jButtonCerrarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"CerrarFormatoNomiFactorNomi"));
		
		
		this.jButtonCerrarToolBarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"CerrarToolBarFormatoNomiFactorNomi"));
			
		this.jMenuItemCerrarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemCerrarFormatoNomiFactorNomi"));
			
		if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jMenuItemDetalleCerrarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFormatoNomiFactorNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonGuardarCambiosFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosFormatoNomiFactorNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonGuardarCambiosToolBarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFormatoNomiFactorNomi"));
		}
		
		this.jButtonCopiarToolBarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"CopiarToolBarFormatoNomiFactorNomi"));
			
		this.jButtonVerFormToolBarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"VerFormToolBarFormatoNomiFactorNomi"));
		
		this.jMenuItemGuardarCambiosFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosFormatoNomiFactorNomi"));
			
		this.jMenuItemCopiarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemCopiarFormatoNomiFactorNomi"));		
		
		this.jMenuItemVerFormFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemVerFormFormatoNomiFactorNomi"));		
		
		
		this.jButtonGuardarCambiosTablaFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFormatoNomiFactorNomi"));
		
		
		this.jButtonGuardarCambiosTablaToolBarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarFormatoNomiFactorNomi"));
			
		this.jMenuItemGuardarCambiosTablaFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFormatoNomiFactorNomi"));		
		
		
		
		this.jButtonRecargarInformacionFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionFormatoNomiFactorNomi"));
					
		this.jButtonRecargarInformacionToolBarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarFormatoNomiFactorNomi"));
		
		this.jMenuItemRecargarInformacionFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionFormatoNomiFactorNomi"));		
		
		
		
		this.jButtonAnterioresFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"AnterioresFormatoNomiFactorNomi"));
		
		
		this.jButtonAnterioresToolBarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"AnterioresToolBarFormatoNomiFactorNomi"));
		
		this.jMenuItemAnterioresFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresFormatoNomiFactorNomi"));		
		
		
		this.jButtonSiguientesFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"SiguientesFormatoNomiFactorNomi"));
		
		
		this.jButtonSiguientesToolBarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"SiguientesToolBarFormatoNomiFactorNomi"));
			
		this.jMenuItemSiguientesFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesFormatoNomiFactorNomi"));
			
		this.jMenuItemAbrirOrderByFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByFormatoNomiFactorNomi"));
			
		this.jMenuItemMostrarOcultarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarFormatoNomiFactorNomi"));
			
		this.jMenuItemDetalleAbrirOrderByFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByFormatoNomiFactorNomi"));
			
		this.jMenuItemDetalleMostarOcultarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarFormatoNomiFactorNomi"));		
		
		
		this.jButtonNuevoGuardarCambiosFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosFormatoNomiFactorNomi"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarFormatoNomiFactorNomi"));
			
		this.jMenuItemNuevoGuardarCambiosFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosFormatoNomiFactorNomi"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosFormatoNomiFactorNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosFormatoNomiFactorNomi"));

		this.jCheckBoxSeleccionadosFormatoNomiFactorNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionadosFormatoNomiFactorNomi"));
		
		if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxTiposAccionesFormularioFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFormatoNomiFactorNomi"));
		}
		
		
		this.jComboBoxTiposRelacionesFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"TiposRelacionesFormatoNomiFactorNomi"));
			
		this.jComboBoxTiposAccionesFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormatoNomiFactorNomi"));
					
		this.jComboBoxTiposSeleccionarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"TiposSeleccionarFormatoNomiFactorNomi"));
			
		this.jTextFieldValorCampoGeneralFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralFormatoNomiFactorNomi"));		
		
		
		if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonidFormatoNomiFactorNomiBusqueda.addActionListener(new ButtonActionListener(this,"idFormatoNomiFactorNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonid_empresaFormatoNomiFactorNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFormatoNomiFactorNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonid_empresaFormatoNomiFactorNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFormatoNomiFactorNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonid_sucursalFormatoNomiFactorNomiUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalFormatoNomiFactorNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonid_sucursalFormatoNomiFactorNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalFormatoNomiFactorNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonid_formato_nomiFormatoNomiFactorNomiUpdate.addActionListener(new ButtonActionListener(this,"id_formato_nomiFormatoNomiFactorNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonid_formato_nomiFormatoNomiFactorNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_formato_nomiFormatoNomiFactorNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonid_factor_nomiFormatoNomiFactorNomiUpdate.addActionListener(new ButtonActionListener(this,"id_factor_nomiFormatoNomiFactorNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonid_factor_nomiFormatoNomiFactorNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_factor_nomiFormatoNomiFactorNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonponderacionFormatoNomiFactorNomiBusqueda.addActionListener(new ButtonActionListener(this,"ponderacionFormatoNomiFactorNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonesta_activoFormatoNomiFactorNomiBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoFormatoNomiFactorNomiBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdFactorNomiFormatoNomiFactorNomi.addActionListener(new ButtonActionListener(this,"FK_IdFactorNomiFormatoNomiFactorNomi"));

			this.jButtonFK_IdFormatoNomiFormatoNomiFactorNomi.addActionListener(new ButtonActionListener(this,"FK_IdFormatoNomiFormatoNomiFactorNomi"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi!=null) {
				this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFormatoNomiFactorNomi"));
				this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFormatoNomiFactorNomi"));
				this.jInternalFrameReporteDinamicoFormatoNomiFactorNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFormatoNomiFactorNomi"));
			}
			
			//this.jButtonCerrarReporteDinamicoFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFormatoNomiFactorNomi"));				
			//this.jButtonGenerarReporteDinamicoFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFormatoNomiFactorNomi"));
			//this.jButtonGenerarExcelReporteDinamicoFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFormatoNomiFactorNomi"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionFormatoNomiFactorNomi!=null) {
				this.jInternalFrameImportacionFormatoNomiFactorNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFormatoNomiFactorNomi"));
				this.jInternalFrameImportacionFormatoNomiFactorNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFormatoNomiFactorNomi"));
				this.jInternalFrameImportacionFormatoNomiFactorNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFormatoNomiFactorNomi"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByFormatoNomiFactorNomi"));
			
			this.jButtonAbrirOrderByToolBarFormatoNomiFactorNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarFormatoNomiFactorNomi"));			
			
			if(this.jInternalFrameOrderByFormatoNomiFactorNomi!=null) {
				this.jInternalFrameOrderByFormatoNomiFactorNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFormatoNomiFactorNomi"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jTabbedPaneRelacionesFormatoNomiFactorNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFormatoNomiFactorNomi"));
		
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
            		closingInternalFrameFormatoNomiFactorNomi();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormFormatoNomiFactorNomi = (JInternalFrameBase)event.getSource();
	            	
	            FormatoNomiFactorNomiBeanSwingJInternalFrame jInternalFrameParent=(FormatoNomiFactorNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormFormatoNomiFactorNomi.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarFormatoNomiFactorNomiActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosFormatoNomiFactorNomi.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosFormatoNomiFactorNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosFormatoNomiFactorNomi.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosFormatoNomiFactorNomi.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormatoNomiFactorNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormatoNomiFactorNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormatoNomiFactorNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoFormatoNomiFactorNomi";
		inputMap = this.jButtonNuevoFormatoNomiFactorNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoFormatoNomiFactorNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFormatoNomiFactorNomiActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormatoNomiFactorNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormatoNomiFactorNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormatoNomiFactorNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesFormatoNomiFactorNomi";
		inputMap = this.jButtonNuevoRelacionesFormatoNomiFactorNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesFormatoNomiFactorNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFormatoNomiFactorNomiActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarFormatoNomiFactorNomi";
		inputMap = this.jButtonModificarFormatoNomiFactorNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarFormatoNomiFactorNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarFormatoNomiFactorNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarFormatoNomiFactorNomi";
		inputMap = this.jButtonActualizarFormatoNomiFactorNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarFormatoNomiFactorNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarFormatoNomiFactorNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarFormatoNomiFactorNomi";
		inputMap = this.jButtonEliminarFormatoNomiFactorNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarFormatoNomiFactorNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarFormatoNomiFactorNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarFormatoNomiFactorNomi";
		inputMap = this.jButtonCancelarFormatoNomiFactorNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarFormatoNomiFactorNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarFormatoNomiFactorNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarFormatoNomiFactorNomi";
		inputMap = this.jButtonCerrarFormatoNomiFactorNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarFormatoNomiFactorNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarFormatoNomiFactorNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonGuardarCambiosFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosFormatoNomiFactorNomi";
		inputMap = this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonGuardarCambiosFormatoNomiFactorNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonGuardarCambiosFormatoNomiFactorNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosFormatoNomiFactorNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosFormatoNomiFactorNomi.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosFormatoNomiFactorNomiItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesFormatoNomiFactorNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesFormatoNomiFactorNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarFormatoNomiFactorNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarFormatoNomiFactorNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralFormatoNomiFactorNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralFormatoNomiFactorNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonidFormatoNomiFactorNomiBusqueda.addActionListener(new ButtonActionListener(this,"idFormatoNomiFactorNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonid_empresaFormatoNomiFactorNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFormatoNomiFactorNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonid_empresaFormatoNomiFactorNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFormatoNomiFactorNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonid_sucursalFormatoNomiFactorNomiUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalFormatoNomiFactorNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonid_sucursalFormatoNomiFactorNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalFormatoNomiFactorNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonid_formato_nomiFormatoNomiFactorNomiUpdate.addActionListener(new ButtonActionListener(this,"id_formato_nomiFormatoNomiFactorNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonid_formato_nomiFormatoNomiFactorNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_formato_nomiFormatoNomiFactorNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonid_factor_nomiFormatoNomiFactorNomiUpdate.addActionListener(new ButtonActionListener(this,"id_factor_nomiFormatoNomiFactorNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonid_factor_nomiFormatoNomiFactorNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_factor_nomiFormatoNomiFactorNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonponderacionFormatoNomiFactorNomiBusqueda.addActionListener(new ButtonActionListener(this,"ponderacionFormatoNomiFactorNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jButtonesta_activoFormatoNomiFactorNomiBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoFormatoNomiFactorNomiBusqueda"));
		
		
		this.jButtonFK_IdFactorNomiFormatoNomiFactorNomi.addActionListener(new ButtonActionListener(this,"FK_IdFactorNomiFormatoNomiFactorNomi"));

		this.jButtonFK_IdFormatoNomiFormatoNomiFactorNomi.addActionListener(new ButtonActionListener(this,"FK_IdFormatoNomiFormatoNomiFactorNomi"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionFormatoNomiFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionFormatoNomiFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarFormatoNomiFactorNomiActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarFormatoNomiFactorNomi.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosFormatoNomiFactorNomi(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(FormatoNomiFactorNomi formatonomifactornomiAux:this.formatonomifactornomiLogic.getFormatoNomiFactorNomis()) {
					formatonomifactornomiAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormatoNomiFactorNomi formatonomifactornomiAux:formatonomifactornomis) {
					formatonomifactornomiAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosFormatoNomiFactorNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFormatoNomiFactorNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FormatoNomiFactorNomi formatonomifactornomiAux:this.formatonomifactornomiLogic.getFormatoNomiFactorNomis()) {
						formatonomifactornomiAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FormatoNomiFactorNomi formatonomifactornomiAux:formatonomifactornomis) {
						formatonomifactornomiAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(FormatoNomiFactorNomi formatonomifactornomiAux:this.formatonomifactornomiLogic.getFormatoNomiFactorNomis()) {
					
						if(sTipoSeleccionar.equals(FormatoNomiFactorNomiConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							formatonomifactornomiAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FormatoNomiFactorNomi formatonomifactornomiAux:formatonomifactornomis) {
						
						if(sTipoSeleccionar.equals(FormatoNomiFactorNomiConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							formatonomifactornomiAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaFormatoNomiFactorNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFormatoNomiFactorNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFormatoNomiFactorNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomiFactorNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosFormatoNomiFactorNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFormatoNomiFactorNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosFormatoNomiFactorNomi.getSelectedRows();
			
			FormatoNomiFactorNomi formatonomifactornomiLocal=new FormatoNomiFactorNomi();
			
			//this.seleccionarTodosFormatoNomiFactorNomi(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatonomifactornomiLocal =(FormatoNomiFactorNomi) this.formatonomifactornomiLogic.getFormatoNomiFactorNomis().toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					formatonomifactornomiLocal =(FormatoNomiFactorNomi) this.formatonomifactornomis.toArray()[this.jTableDatosFormatoNomiFactorNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				formatonomifactornomiLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FormatoNomiFactorNomi formatonomifactornomiAux:this.formatonomifactornomiLogic.getFormatoNomiFactorNomis()) {
						formatonomifactornomiAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FormatoNomiFactorNomi formatonomifactornomiAux:formatonomifactornomis) {
						formatonomifactornomiAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaFormatoNomiFactorNomi(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFormatoNomiFactorNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFormatoNomiFactorNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomiFactorNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualFormatoNomiFactorNomiItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarFormatoNomiFactorNomiParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralFormatoNomiFactorNomiActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingFormatoNomiFactorNomi(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralFormatoNomiFactorNomi.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FormatoNomiFactorNomi formatonomifactornomiAux:this.formatonomifactornomiLogic.getFormatoNomiFactorNomis()) {
				
						if(sTipoSeleccionar.equals(FormatoNomiFactorNomiConstantesFunciones.LABEL_PONDERACION)) {
							existe=true;
							formatonomifactornomiAux.setponderacion(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormatoNomiFactorNomi formatonomifactornomiAux:formatonomifactornomis) {
					
						if(sTipoSeleccionar.equals(FormatoNomiFactorNomiConstantesFunciones.LABEL_PONDERACION)) {
							existe=true;
							formatonomifactornomiAux.setponderacion(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaFormatoNomiFactorNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesFormatoNomiFactorNomiActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingFormatoNomiFactorNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioFormatoNomiFactorNomi=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesFormatoNomiFactorNomi.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxTiposAccionesFormularioFormatoNomiFactorNomi.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteFormatoNomiFactorNomi) {				
					conSplash=true;//false;										
					
					//this.startProcessFormatoNomiFactorNomi(conSplash);
				
					this.generarReporteFormatoNomiFactorNomisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormatoNomiFactorNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxTiposAccionesFormularioFormatoNomiFactorNomi.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoFormatoNomiFactorNomisSeleccionados();
				//this.jComboBoxTiposAccionesFormatoNomiFactorNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFormatoNomiFactorNomisSeleccionados(false);
				//this.jComboBoxTiposAccionesFormatoNomiFactorNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFormatoNomiFactorNomisSeleccionados(true);
				//this.jComboBoxTiposAccionesFormatoNomiFactorNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFormatoNomiFactorNomi();
				
				this.exportarFormatoNomiFactorNomisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormatoNomiFactorNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxTiposAccionesFormularioFormatoNomiFactorNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionFormatoNomiFactorNomis();
				//this.importarFormatoNomiFactorNomis();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormatoNomiFactorNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxTiposAccionesFormularioFormatoNomiFactorNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFormatoNomiFactorNomi();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelFormatoNomiFactorNomisSeleccionados();
				//this.jComboBoxTiposAccionesFormatoNomiFactorNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Formato Nomi Factor Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessFormatoNomiFactorNomi();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoFormatoNomiFactorNomi)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyFormatoNomiFactorNomi(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Formato Nomi Factor Nomi",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormatoNomiFactorNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxTiposAccionesFormularioFormatoNomiFactorNomi.setSelectedIndex(0);					
				}	
			} 			
			else if(FormatoNomiFactorNomiBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteFormatoNomiFactorNomi) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessFormatoNomiFactorNomi(conSplash);
					
						//this.actualizarParametrosGeneralFormatoNomiFactorNomi();
						
						this.generarReporteProcesoAccionFormatoNomiFactorNomisSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesFormatoNomiFactorNomi.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxTiposAccionesFormularioFormatoNomiFactorNomi.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Formato Nomi Factor NomiS SELECCIONADOS?", "MANTENIMIENTO DE Formato Nomi Factor Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessFormatoNomiFactorNomi();
				
						this.actualizarParametrosGeneralFormatoNomiFactorNomi();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.formatonomifactornomiReturnGeneral=formatonomifactornomiLogic.procesarAccionFormatoNomiFactorNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.formatonomifactornomiLogic.getFormatoNomiFactorNomis(),this.formatonomifactornomiParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarFormatoNomiFactorNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFormatoNomiFactorNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxTiposAccionesFormularioFormatoNomiFactorNomi.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralFormatoNomiFactorNomi();
					
					FormatoNomiFactorNomiBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarFormatoNomiFactorNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFormatoNomiFactorNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxTiposAccionesFormularioFormatoNomiFactorNomi.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessFormatoNomiFactorNomi(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesFormatoNomiFactorNomiActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessFormatoNomiFactorNomi();
			
			if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<FormatoNomiFactorNomi> formatonomifactornomisSeleccionados=new ArrayList<FormatoNomiFactorNomi>();		
			FormatoNomiFactorNomi formatonomifactornomi=new FormatoNomiFactorNomi();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingFormatoNomiFactorNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesFormatoNomiFactorNomi.getSelectedItem();
			
			
			
			
			formatonomifactornomisSeleccionados=this.getFormatoNomiFactorNomisSeleccionados(true);
			//this.sTipoAccion;
			
			if(formatonomifactornomisSeleccionados.size()==1) {
				for(FormatoNomiFactorNomi formatonomifactornomiAux:formatonomifactornomisSeleccionados) {
					formatonomifactornomi=formatonomifactornomiAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Calificacion Empleado")) {
					jButtonCalificacionEmpleadoActionPerformed(null,rowIndex,true,false,formatonomifactornomi);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessFormatoNomiFactorNomi();
			
      		//this.finishProcessFormatoNomiFactorNomi(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarFormatoNomiFactorNomiReturnGeneral() throws Exception {
		if(this.formatonomifactornomiReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.formatonomifactornomiReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.formatonomifactornomiReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.formatonomifactornomiReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.formatonomifactornomiReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.formatonomifactornomiReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingFormatoNomiFactorNomi(false);
		}
		
		if(this.formatonomifactornomiReturnGeneral.getConRetornoLista() || this.formatonomifactornomiReturnGeneral.getConRetornoObjeto()) {
			if(this.formatonomifactornomiReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.formatonomifactornomiLogic.setFormatoNomiFactorNomis(this.formatonomifactornomiReturnGeneral.getFormatoNomiFactorNomis());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.formatonomifactornomiReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.formatonomifactornomiLogic.setFormatoNomiFactorNomi(this.formatonomifactornomiReturnGeneral.getFormatoNomiFactorNomi());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingFormatoNomiFactorNomi(false);
		}
	}
	
	public void actualizarParametrosGeneralFormatoNomiFactorNomi() throws Exception {
		
		
	}
	
	public ArrayList<FormatoNomiFactorNomi> getFormatoNomiFactorNomisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<FormatoNomiFactorNomi> formatonomifactornomisSeleccionados=new ArrayList<FormatoNomiFactorNomi>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioFormatoNomiFactorNomi) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(FormatoNomiFactorNomi formatonomifactornomiAux:formatonomifactornomiLogic.getFormatoNomiFactorNomis()) {
					if(formatonomifactornomiAux.getIsSelected()) {
						formatonomifactornomisSeleccionados.add(formatonomifactornomiAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormatoNomiFactorNomi formatonomifactornomiAux:this.formatonomifactornomis) {
					if(formatonomifactornomiAux.getIsSelected()) {
						formatonomifactornomisSeleccionados.add(formatonomifactornomiAux);				
					}
				}
			}
			
			if(formatonomifactornomisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						formatonomifactornomisSeleccionados.addAll(this.formatonomifactornomiLogic.getFormatoNomiFactorNomis());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						formatonomifactornomisSeleccionados.addAll(this.formatonomifactornomis);				
					}
				}
			}
		} else {
			formatonomifactornomisSeleccionados.add(this.formatonomifactornomi);
		}
		
		return formatonomifactornomisSeleccionados;
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
	
	public void generarReporteFormatoNomiFactorNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalFormatoNomiFactorNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoFormatoNomiFactorNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFormatoNomiFactorNomisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFormatoNomiFactorNomisSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesFormatoNomiFactorNomisSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Formato Nomi Factor Nomi",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesFormatoNomiFactorNomisSeleccionados() throws Exception {
		ArrayList<FormatoNomiFactorNomi> formatonomifactornomisSeleccionados=new ArrayList<FormatoNomiFactorNomi>();		
		
		formatonomifactornomisSeleccionados=this.getFormatoNomiFactorNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteFormatoNomiFactorNomis("Todos",formatonomifactornomisSeleccionados);
		
	}	
	
	public void generarReporteNormalFormatoNomiFactorNomisSeleccionados() throws Exception {
		ArrayList<FormatoNomiFactorNomi> formatonomifactornomisSeleccionados=new ArrayList<FormatoNomiFactorNomi>();		
		
		formatonomifactornomisSeleccionados=this.getFormatoNomiFactorNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteFormatoNomiFactorNomis("Todos",formatonomifactornomisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionFormatoNomiFactorNomisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<FormatoNomiFactorNomi> formatonomifactornomisSeleccionados=new ArrayList<FormatoNomiFactorNomi>();
		
		formatonomifactornomisSeleccionados=this.getFormatoNomiFactorNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteFormatoNomiFactorNomis("Todos",formatonomifactornomisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoFormatoNomiFactorNomisSeleccionados() throws Exception {
		ArrayList<FormatoNomiFactorNomi> formatonomifactornomisSeleccionados=new ArrayList<FormatoNomiFactorNomi>();		
		
		
		this.abrirInicializarFrameReporteDinamicoFormatoNomiFactorNomi();
		
		
		formatonomifactornomisSeleccionados=this.getFormatoNomiFactorNomisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoFormatoNomiFactorNomi();
		
		
		//this.generarReporteFormatoNomiFactorNomis("Todos",formatonomifactornomisSeleccionados ,formatonomifactornomiImplementable,formatonomifactornomiImplementableHome);
	}
	
	public void mostrarImportacionFormatoNomiFactorNomis() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionFormatoNomiFactorNomi();
		
		this.abrirFrameImportacionFormatoNomiFactorNomi();		
		
			
		//this.generarReporteFormatoNomiFactorNomis("Todos",formatonomifactornomisSeleccionados ,formatonomifactornomiImplementable,formatonomifactornomiImplementableHome);
	}
	
	public void importarFormatoNomiFactorNomis() throws Exception {		
	
	}
	
	public void exportarFormatoNomiFactorNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelFormatoNomiFactorNomisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoFormatoNomiFactorNomisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlFormatoNomiFactorNomisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Formato Nomi Factor Nomi",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoFormatoNomiFactorNomisSeleccionados() throws Exception {
		ArrayList<FormatoNomiFactorNomi> formatonomifactornomisSeleccionados=new ArrayList<FormatoNomiFactorNomi>();		
		
		formatonomifactornomisSeleccionados=this.getFormatoNomiFactorNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formatonomifactornomi."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarFormatoNomiFactorNomi(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(FormatoNomiFactorNomi formatonomifactornomiAux:formatonomifactornomisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarFormatoNomiFactorNomi(formatonomifactornomiAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//formatonomifactornomiAux.setsDetalleGeneralEntityReporte(formatonomifactornomiAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato Nomi Factor Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarFormatoNomiFactorNomi(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=FormatoNomiFactorNomiConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoNomiFactorNomiConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoNomiFactorNomiConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoNomiFactorNomiConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFORMATONOMI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFACTORNOMI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoNomiFactorNomiConstantesFunciones.LABEL_PONDERACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoNomiFactorNomiConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarFormatoNomiFactorNomi(FormatoNomiFactorNomi formatonomifactornomi,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=formatonomifactornomi.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=formatonomifactornomi.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=formatonomifactornomi.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formatonomifactornomi.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formatonomifactornomi.getformatonomi_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formatonomifactornomi.getfactornomi_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formatonomifactornomi.getponderacion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formatonomifactornomi.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelFormatoNomiFactorNomisSeleccionados() throws Exception {
		ArrayList<FormatoNomiFactorNomi> formatonomifactornomisSeleccionados=new ArrayList<FormatoNomiFactorNomi>();		
		
		formatonomifactornomisSeleccionados=this.getFormatoNomiFactorNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formatonomifactornomi.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("FormatoNomiFactorNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelFormatoNomiFactorNomi(row);				
				iRow++;
			}				
			
			for(FormatoNomiFactorNomi formatonomifactornomiAux:formatonomifactornomisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelFormatoNomiFactorNomi(formatonomifactornomiAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato Nomi Factor Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlFormatoNomiFactorNomisSeleccionados() throws Exception {
		ArrayList<FormatoNomiFactorNomi> formatonomifactornomisSeleccionados=new ArrayList<FormatoNomiFactorNomi>();		
		
		formatonomifactornomisSeleccionados=this.getFormatoNomiFactorNomisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formatonomifactornomi.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("formatonomifactornomis");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("formatonomifactornomi");
			//elementRoot.appendChild(element);
		
			for(FormatoNomiFactorNomi formatonomifactornomiAux:formatonomifactornomisSeleccionados) {
				element = document.createElement("formatonomifactornomi");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlFormatoNomiFactorNomi(formatonomifactornomiAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato Nomi Factor Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelFormatoNomiFactorNomi(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoNomiFactorNomiConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoNomiFactorNomiConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(FormatoNomiFactorNomiConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoNomiFactorNomiConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFORMATONOMI);
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFACTORNOMI);
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoNomiFactorNomiConstantesFunciones.LABEL_PONDERACION);
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoNomiFactorNomiConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelFormatoNomiFactorNomi(FormatoNomiFactorNomi formatonomifactornomi,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(formatonomifactornomi.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(formatonomifactornomi.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formatonomifactornomi.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formatonomifactornomi.getformatonomi_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formatonomifactornomi.getfactornomi_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formatonomifactornomi.getponderacion());
		cell = row.createCell(iColumn++);cell.setCellValue(formatonomifactornomi.getesta_activo());				
	}
	
	public void setFilaDatosExportarXmlFormatoNomiFactorNomi(FormatoNomiFactorNomi formatonomifactornomi,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(FormatoNomiFactorNomiConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(formatonomifactornomi.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(FormatoNomiFactorNomiConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(formatonomifactornomi.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(FormatoNomiFactorNomiConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(formatonomifactornomi.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(FormatoNomiFactorNomiConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(formatonomifactornomi.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementformatonomi_descripcion = document.createElement(FormatoNomiFactorNomiConstantesFunciones.IDFORMATONOMI);
		elementformatonomi_descripcion.appendChild(document.createTextNode(formatonomifactornomi.getformatonomi_descripcion()));
		element.appendChild(elementformatonomi_descripcion);

		Element elementfactornomi_descripcion = document.createElement(FormatoNomiFactorNomiConstantesFunciones.IDFACTORNOMI);
		elementfactornomi_descripcion.appendChild(document.createTextNode(formatonomifactornomi.getfactornomi_descripcion()));
		element.appendChild(elementfactornomi_descripcion);

		Element elementponderacion = document.createElement(FormatoNomiFactorNomiConstantesFunciones.PONDERACION);
		elementponderacion.appendChild(document.createTextNode(formatonomifactornomi.getponderacion().toString().trim()));
		element.appendChild(elementponderacion);

		Element elementesta_activo = document.createElement(FormatoNomiFactorNomiConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(formatonomifactornomi.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void generarReporteGroupGenericoFormatoNomiFactorNomisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<FormatoNomiFactorNomi> formatonomifactornomisSeleccionados=new ArrayList<FormatoNomiFactorNomi>();
		
		formatonomifactornomisSeleccionados=this.getFormatoNomiFactorNomisSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoFormatoNomiFactorNomi(formatonomifactornomisSeleccionados);
		
		this.generarReporteFormatoNomiFactorNomis("Todos",formatonomifactornomisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoFormatoNomiFactorNomi(ArrayList<FormatoNomiFactorNomi> formatonomifactornomisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(FormatoNomiFactorNomi formatonomifactornomiAux:formatonomifactornomisSeleccionados) {
				formatonomifactornomiAux.setsDetalleGeneralEntityReporte(formatonomifactornomiAux.toString());
			
				if(sTipoSeleccionar.equals(FormatoNomiFactorNomiConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					formatonomifactornomiAux.setsDescripcionGeneralEntityReporte1(formatonomifactornomiAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormatoNomiFactorNomiConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					formatonomifactornomiAux.setsDescripcionGeneralEntityReporte1(formatonomifactornomiAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFORMATONOMI)) {
					existe=true;
					formatonomifactornomiAux.setsDescripcionGeneralEntityReporte1(formatonomifactornomiAux.getformatonomi_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormatoNomiFactorNomiConstantesFunciones.LABEL_IDFACTORNOMI)) {
					existe=true;
					formatonomifactornomiAux.setsDescripcionGeneralEntityReporte1(formatonomifactornomiAux.getfactornomi_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormatoNomiFactorNomiConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					formatonomifactornomiAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(formatonomifactornomiAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiFactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesFormatoNomiFactorNomi(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoFormatoNomiFactorNomi=true;
				this.isVisibilidadCeldaNuevoRelacionesFormatoNomiFactorNomi=true;
				this.isVisibilidadCeldaGuardarCambiosFormatoNomiFactorNomi=true;
			}
			
			this.isVisibilidadCeldaModificarFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaActualizarFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaEliminarFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaCancelarFormatoNomiFactorNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormatoNomiFactorNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarFormatoNomiFactorNomi=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaGuardarCambiosFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaModificarFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaActualizarFormatoNomiFactorNomi=true;
			this.isVisibilidadCeldaEliminarFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaCancelarFormatoNomiFactorNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormatoNomiFactorNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarFormatoNomiFactorNomi=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaGuardarCambiosFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaModificarFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaActualizarFormatoNomiFactorNomi=true;
			this.isVisibilidadCeldaEliminarFormatoNomiFactorNomi=true;
			this.isVisibilidadCeldaCancelarFormatoNomiFactorNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormatoNomiFactorNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarFormatoNomiFactorNomi=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaGuardarCambiosFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaModificarFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaActualizarFormatoNomiFactorNomi=true;
			this.isVisibilidadCeldaEliminarFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaCancelarFormatoNomiFactorNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormatoNomiFactorNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarFormatoNomiFactorNomi=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoFormatoNomiFactorNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomiFactorNomi=true;
			this.isVisibilidadCeldaGuardarCambiosFormatoNomiFactorNomi=true;
			this.isVisibilidadCeldaModificarFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaActualizarFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaEliminarFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaCancelarFormatoNomiFactorNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormatoNomiFactorNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarFormatoNomiFactorNomi=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaGuardarCambiosFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaActualizarFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaEliminarFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaCancelarFormatoNomiFactorNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormatoNomiFactorNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarFormatoNomiFactorNomi=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaGuardarCambiosFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaModificarFormatoNomiFactorNomi=true;
			this.isVisibilidadCeldaActualizarFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaEliminarFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaCancelarFormatoNomiFactorNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormatoNomiFactorNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarFormatoNomiFactorNomi=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(FormatoNomiFactorNomiJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoFormatoNomiFactorNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomiFactorNomi=true;
			this.isVisibilidadCeldaGuardarCambiosFormatoNomiFactorNomi=true;
		} else {
			this.actualizarEstadoPanelsFormatoNomiFactorNomi(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarFormatoNomiFactorNomi=false;
			//this.isVisibilidadCeldaVerFormFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaDuplicarFormatoNomiFactorNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!formatonomifactornomiSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomiFactorNomi=false;
		} else {
			this.isVisibilidadCeldaNuevoFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaGuardarCambiosFormatoNomiFactorNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
			if(!formatonomifactornomiSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesFormatoNomiFactorNomi=false;												
			}
			
			this.jButtonCerrarFormatoNomiFactorNomi.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomiFactorNomi=false;
		}
		
		if(!this.permiteMantenimiento(this.formatonomifactornomi)) {
			this.isVisibilidadCeldaActualizarFormatoNomiFactorNomi=false;
			this.isVisibilidadCeldaEliminarFormatoNomiFactorNomi=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesFormatoNomiFactorNomi() {
		this.isVisibilidadCeldaNuevoFormatoNomiFactorNomi=false;
		this.isVisibilidadCeldaGuardarCambiosFormatoNomiFactorNomi=false;
	}
	
	public void actualizarEstadoPanelsFormatoNomiFactorNomi(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionFormatoNomiFactorNomi!=null) {
				this.jScrollPanelDatosEdicionFormatoNomiFactorNomi.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoNomiFactorNomi!=null) {
				this.jTabbedPaneBusquedasFormatoNomiFactorNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormatoNomiFactorNomi!=null) {
				this.jScrollPanelDatosFormatoNomiFactorNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormatoNomiFactorNomi!=null) {
				this.jPanelPaginacionFormatoNomiFactorNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormatoNomiFactorNomi!=null) {
				this.jPanelParametrosReportesFormatoNomiFactorNomi.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionFormatoNomiFactorNomi!=null) {
				this.jScrollPanelDatosEdicionFormatoNomiFactorNomi.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoNomiFactorNomi!=null) {
				this.jTabbedPaneBusquedasFormatoNomiFactorNomi.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosFormatoNomiFactorNomi!=null) {
				this.jScrollPanelDatosFormatoNomiFactorNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionFormatoNomiFactorNomi!=null) {
				this.jPanelPaginacionFormatoNomiFactorNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFormatoNomiFactorNomi!=null) {
				this.jPanelParametrosReportesFormatoNomiFactorNomi.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionFormatoNomiFactorNomi!=null) {
				this.jScrollPanelDatosEdicionFormatoNomiFactorNomi.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoNomiFactorNomi!=null) {
				this.jTabbedPaneBusquedasFormatoNomiFactorNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFormatoNomiFactorNomi!=null) {
				this.jScrollPanelDatosFormatoNomiFactorNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionFormatoNomiFactorNomi!=null) {
				this.jPanelPaginacionFormatoNomiFactorNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFormatoNomiFactorNomi!=null) {
				this.jPanelParametrosReportesFormatoNomiFactorNomi.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionFormatoNomiFactorNomi!=null) {
				this.jScrollPanelDatosEdicionFormatoNomiFactorNomi.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoNomiFactorNomi!=null) {
				this.jTabbedPaneBusquedasFormatoNomiFactorNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFormatoNomiFactorNomi!=null) {
				this.jScrollPanelDatosFormatoNomiFactorNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionFormatoNomiFactorNomi!=null) {
				this.jPanelPaginacionFormatoNomiFactorNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFormatoNomiFactorNomi!=null) {
				this.jPanelParametrosReportesFormatoNomiFactorNomi.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionFormatoNomiFactorNomi!=null) {
				this.jScrollPanelDatosEdicionFormatoNomiFactorNomi.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoNomiFactorNomi!=null) {
				this.jTabbedPaneBusquedasFormatoNomiFactorNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormatoNomiFactorNomi!=null) {
				this.jScrollPanelDatosFormatoNomiFactorNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormatoNomiFactorNomi!=null) {
				this.jPanelPaginacionFormatoNomiFactorNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormatoNomiFactorNomi!=null) {
				this.jPanelParametrosReportesFormatoNomiFactorNomi.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionFormatoNomiFactorNomi!=null) {
				this.jScrollPanelDatosEdicionFormatoNomiFactorNomi.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoNomiFactorNomi!=null) {
				this.jTabbedPaneBusquedasFormatoNomiFactorNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormatoNomiFactorNomi!=null) {
				this.jScrollPanelDatosFormatoNomiFactorNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormatoNomiFactorNomi!=null) {
				this.jPanelPaginacionFormatoNomiFactorNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormatoNomiFactorNomi!=null) {
				this.jPanelParametrosReportesFormatoNomiFactorNomi.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionFormatoNomiFactorNomi!=null) {
				this.jScrollPanelDatosEdicionFormatoNomiFactorNomi.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoNomiFactorNomi!=null) {
				this.jTabbedPaneBusquedasFormatoNomiFactorNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormatoNomiFactorNomi!=null) {
				this.jScrollPanelDatosFormatoNomiFactorNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormatoNomiFactorNomi!=null) {
				this.jPanelPaginacionFormatoNomiFactorNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormatoNomiFactorNomi!=null) {
				this.jPanelParametrosReportesFormatoNomiFactorNomi.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasFormatoNomiFactorNomi!=null) {
					this.jTabbedPaneBusquedasFormatoNomiFactorNomi.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesFormatoNomiFactorNomi!=null) {
				this.jPanelParametrosReportesFormatoNomiFactorNomi.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.formatonomifactornomiSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoNomiFactorNomi!=null) {
				this.jTabbedPaneBusquedasFormatoNomiFactorNomi.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesFormatoNomiFactorNomi!=null) {
				this.jPanelParametrosReportesFormatoNomiFactorNomi.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdFactorNomi=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdFactorNomi) {this.jTabbedPaneBusquedasFormatoNomiFactorNomi.remove(jPanelFK_IdFactorNomiFormatoNomiFactorNomi);}

			this.isVisibilidadFK_IdFormatoNomi=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdFormatoNomi) {this.jTabbedPaneBusquedasFormatoNomiFactorNomi.remove(jPanelFK_IdFormatoNomiFormatoNomiFactorNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdFactorNomi=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdFactorNomi) {this.jTabbedPaneBusquedasFormatoNomiFactorNomi.remove(jPanelFK_IdFactorNomiFormatoNomiFactorNomi);}

			this.isVisibilidadFK_IdFormatoNomi=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdFormatoNomi) {this.jTabbedPaneBusquedasFormatoNomiFactorNomi.remove(jPanelFK_IdFormatoNomiFormatoNomiFactorNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaFormatoNomi(Boolean isParaFormatoNomi){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFormatoNomiNegation=!isParaFormatoNomi;

			this.isVisibilidadFK_IdFactorNomi=isParaFormatoNomiNegation;
			if(!this.isVisibilidadFK_IdFactorNomi) {this.jTabbedPaneBusquedasFormatoNomiFactorNomi.remove(jPanelFK_IdFactorNomiFormatoNomiFactorNomi);}

			this.isVisibilidadFK_IdFormatoNomi=isParaFormatoNomi;
			if(!this.isVisibilidadFK_IdFormatoNomi) {this.jTabbedPaneBusquedasFormatoNomiFactorNomi.remove(jPanelFK_IdFormatoNomiFormatoNomiFactorNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaFactorNomi(Boolean isParaFactorNomi){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFactorNomiNegation=!isParaFactorNomi;

			this.isVisibilidadFK_IdFactorNomi=isParaFactorNomi;
			if(!this.isVisibilidadFK_IdFactorNomi) {this.jTabbedPaneBusquedasFormatoNomiFactorNomi.remove(jPanelFK_IdFactorNomiFormatoNomiFactorNomi);}

			this.isVisibilidadFK_IdFormatoNomi=isParaFactorNomiNegation;
			if(!this.isVisibilidadFK_IdFormatoNomi) {this.jTabbedPaneBusquedasFormatoNomiFactorNomi.remove(jPanelFK_IdFormatoNomiFormatoNomiFactorNomi);}
		}
		
	}
	
	

	public String registrarSesionFormatoNomiFactorNomiParaCalificacionEmpleados() throws Exception {
		Boolean isPaginaPopupCalificacionEmpleado=false;

		try {

			if(this.formatonomifactornomiSessionBean==null) {
				this.formatonomifactornomiSessionBean=new FormatoNomiFactorNomiSessionBean();
			}

			if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoSessionBean==null) {
				this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoSessionBean=new CalificacionEmpleadoSessionBean();
			}

			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoSessionBean.setsPathNavegacionActual(formatonomifactornomiSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCalificacionEmpleado=this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCalificacionEmpleado(true);
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCalificacionEmpleado(FormatoNomiFactorNomiConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoSessionBean.setisBusquedaDesdeForeignKeySesionFormatoNomiFactorNomi(true);
			this.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoSessionBean.setlidFormatoNomiFactorNomiActual(this.idFormatoNomiFactorNomiActual);

			formatonomifactornomiSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyFormatoNomiFactorNomi(true);
			formatonomifactornomiSessionBean.setlIdFormatoNomiFactorNomiActualForeignKey(this.idFormatoNomiFactorNomiActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//FormatoNomiFactorNomiSessionBean formatonomifactornomiSessionBean=new FormatoNomiFactorNomiSessionBean();
		
		if(this.formatonomifactornomiSessionBean==null) {
			this.formatonomifactornomiSessionBean=new FormatoNomiFactorNomiSessionBean();
		}
		
		this.formatonomifactornomiSessionBean.setsUltimaBusquedaFormatoNomiFactorNomi(this.getsAccionBusqueda());
		this.formatonomifactornomiSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.formatonomifactornomiSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			formatonomifactornomiSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdFactorNomi")) {
			formatonomifactornomiSessionBean.setid_factor_nomi(this.getid_factor_nomiFK_IdFactorNomi());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdFormatoNomi")) {
			formatonomifactornomiSessionBean.setid_formato_nomi(this.getid_formato_nomiFK_IdFormatoNomi());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			formatonomifactornomiSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//FormatoNomiFactorNomiSessionBean formatonomifactornomiSessionBean=new FormatoNomiFactorNomiSessionBean();
		
		if(this.formatonomifactornomiSessionBean==null) {
			this.formatonomifactornomiSessionBean=new FormatoNomiFactorNomiSessionBean();
		}
		
		if(this.formatonomifactornomiSessionBean.getsUltimaBusquedaFormatoNomiFactorNomi()!=null&&!this.formatonomifactornomiSessionBean.getsUltimaBusquedaFormatoNomiFactorNomi().equals("")) {
			this.setsAccionBusqueda(formatonomifactornomiSessionBean.getsUltimaBusquedaFormatoNomiFactorNomi());
			this.setiNumeroPaginacion(formatonomifactornomiSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(formatonomifactornomiSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(formatonomifactornomiSessionBean.getid_empresa());
				formatonomifactornomiSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdFactorNomi")) {
				this.setid_factor_nomiFK_IdFactorNomi(formatonomifactornomiSessionBean.getid_factor_nomi());
				formatonomifactornomiSessionBean.setid_factor_nomi(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdFormatoNomi")) {
				this.setid_formato_nomiFK_IdFormatoNomi(formatonomifactornomiSessionBean.getid_formato_nomi());
				formatonomifactornomiSessionBean.setid_formato_nomi(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(formatonomifactornomiSessionBean.getid_sucursal());
				formatonomifactornomiSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.formatonomifactornomiSessionBean.setsUltimaBusquedaFormatoNomiFactorNomi("");
		this.formatonomifactornomiSessionBean.setiNumeroPaginacion(FormatoNomiFactorNomiConstantesFunciones.INUMEROPAGINACION);
		this.formatonomifactornomiSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaFormatoNomiFactorNomi(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioFormatoNomiFactorNomi() {
		this.updateBorderResaltarBusquedasFormularioFormatoNomiFactorNomi();
		this.updateVisibilidadBusquedasFormularioFormatoNomiFactorNomi();
		this.updateHabilitarBusquedasFormularioFormatoNomiFactorNomi();
	}
	
	public void updateBorderResaltarBusquedasFormularioFormatoNomiFactorNomi() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasFormatoNomiFactorNomi.getComponents().length>0) {
	

		if(this.formatonomifactornomiConstantesFunciones.resaltarFK_IdFactorNomiFormatoNomiFactorNomi!=null) {
			index= this.jTabbedPaneBusquedasFormatoNomiFactorNomi.indexOfComponent(this.jPanelFK_IdFactorNomiFormatoNomiFactorNomi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormatoNomiFactorNomi.getComponent(index);
				jPanel.setBorder(this.formatonomifactornomiConstantesFunciones.resaltarFK_IdFactorNomiFormatoNomiFactorNomi);
			}
		}

		if(this.formatonomifactornomiConstantesFunciones.resaltarFK_IdFormatoNomiFormatoNomiFactorNomi!=null) {
			index= this.jTabbedPaneBusquedasFormatoNomiFactorNomi.indexOfComponent(this.jPanelFK_IdFormatoNomiFormatoNomiFactorNomi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormatoNomiFactorNomi.getComponent(index);
				jPanel.setBorder(this.formatonomifactornomiConstantesFunciones.resaltarFK_IdFormatoNomiFormatoNomiFactorNomi);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioFormatoNomiFactorNomi() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasFormatoNomiFactorNomi.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFormatoNomiFactorNomi.indexOfComponent(this.jPanelFK_IdFactorNomiFormatoNomiFactorNomi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFormatoNomiFactorNomi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.formatonomifactornomiConstantesFunciones.mostrarFK_IdFactorNomiFormatoNomiFactorNomi);
			if(!this.formatonomifactornomiConstantesFunciones.mostrarFK_IdFactorNomiFormatoNomiFactorNomi && index>-1) {
				this.jTabbedPaneBusquedasFormatoNomiFactorNomi.remove(index);
			}

			index= this.jTabbedPaneBusquedasFormatoNomiFactorNomi.indexOfComponent(this.jPanelFK_IdFormatoNomiFormatoNomiFactorNomi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFormatoNomiFactorNomi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.formatonomifactornomiConstantesFunciones.mostrarFK_IdFormatoNomiFormatoNomiFactorNomi);
			if(!this.formatonomifactornomiConstantesFunciones.mostrarFK_IdFormatoNomiFormatoNomiFactorNomi && index>-1) {
				this.jTabbedPaneBusquedasFormatoNomiFactorNomi.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioFormatoNomiFactorNomi() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasFormatoNomiFactorNomi.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFormatoNomiFactorNomi.indexOfComponent(this.jPanelFK_IdFactorNomiFormatoNomiFactorNomi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFormatoNomiFactorNomi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.formatonomifactornomiConstantesFunciones.activarFK_IdFactorNomiFormatoNomiFactorNomi);
				this.jTabbedPaneBusquedasFormatoNomiFactorNomi.setEnabledAt(index,this.formatonomifactornomiConstantesFunciones.activarFK_IdFactorNomiFormatoNomiFactorNomi);
			}

			index= this.jTabbedPaneBusquedasFormatoNomiFactorNomi.indexOfComponent(this.jPanelFK_IdFormatoNomiFormatoNomiFactorNomi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFormatoNomiFactorNomi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.formatonomifactornomiConstantesFunciones.activarFK_IdFormatoNomiFormatoNomiFactorNomi);
				this.jTabbedPaneBusquedasFormatoNomiFactorNomi.setEnabledAt(index,this.formatonomifactornomiConstantesFunciones.activarFK_IdFormatoNomiFormatoNomiFactorNomi);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaFormatoNomiFactorNomi(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdFactorNomi")) {
			index= this.jTabbedPaneBusquedasFormatoNomiFactorNomi.indexOfComponent(this.jPanelFK_IdFactorNomiFormatoNomiFactorNomi);

			this.jTabbedPaneBusquedasFormatoNomiFactorNomi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormatoNomiFactorNomi.getComponent(index);

			this.formatonomifactornomiConstantesFunciones.setResaltarFK_IdFactorNomiFormatoNomiFactorNomi(resaltar);

			jPanel.setBorder(this.formatonomifactornomiConstantesFunciones.resaltarFK_IdFactorNomiFormatoNomiFactorNomi);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdFormatoNomi")) {
			index= this.jTabbedPaneBusquedasFormatoNomiFactorNomi.indexOfComponent(this.jPanelFK_IdFormatoNomiFormatoNomiFactorNomi);

			this.jTabbedPaneBusquedasFormatoNomiFactorNomi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormatoNomiFactorNomi.getComponent(index);

			this.formatonomifactornomiConstantesFunciones.setResaltarFK_IdFormatoNomiFormatoNomiFactorNomi(resaltar);

			jPanel.setBorder(this.formatonomifactornomiConstantesFunciones.resaltarFK_IdFormatoNomiFormatoNomiFactorNomi);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarFormatoNomiFactorNomi.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioFormatoNomiFactorNomi() throws Exception {

		if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioFormatoNomiFactorNomi();
		this.updateVisibilidadResaltarControlesFormularioFormatoNomiFactorNomi();
		this.updateHabilitarResaltarControlesFormularioFormatoNomiFactorNomi();
		
	}
	
	public void updateBorderResaltarControlesFormularioFormatoNomiFactorNomi() throws Exception {
		if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.formatonomifactornomiConstantesFunciones.resaltaridFormatoNomiFactorNomi!=null && this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jLabelidFormatoNomiFactorNomi.setBorder(this.formatonomifactornomiConstantesFunciones.resaltaridFormatoNomiFactorNomi);}
		if(this.formatonomifactornomiConstantesFunciones.resaltarid_empresaFormatoNomiFactorNomi!=null && this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_empresaFormatoNomiFactorNomi.setBorder(this.formatonomifactornomiConstantesFunciones.resaltarid_empresaFormatoNomiFactorNomi);}
		if(this.formatonomifactornomiConstantesFunciones.resaltarid_sucursalFormatoNomiFactorNomi!=null && this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_sucursalFormatoNomiFactorNomi.setBorder(this.formatonomifactornomiConstantesFunciones.resaltarid_sucursalFormatoNomiFactorNomi);}
		if(this.formatonomifactornomiConstantesFunciones.resaltarid_formato_nomiFormatoNomiFactorNomi!=null && this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_formato_nomiFormatoNomiFactorNomi.setBorder(this.formatonomifactornomiConstantesFunciones.resaltarid_formato_nomiFormatoNomiFactorNomi);}
		if(this.formatonomifactornomiConstantesFunciones.resaltarid_factor_nomiFormatoNomiFactorNomi!=null && this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_factor_nomiFormatoNomiFactorNomi.setBorder(this.formatonomifactornomiConstantesFunciones.resaltarid_factor_nomiFormatoNomiFactorNomi);}
		if(this.formatonomifactornomiConstantesFunciones.resaltarponderacionFormatoNomiFactorNomi!=null && this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jTextFieldponderacionFormatoNomiFactorNomi.setBorder(this.formatonomifactornomiConstantesFunciones.resaltarponderacionFormatoNomiFactorNomi);}
		if(this.formatonomifactornomiConstantesFunciones.resaltaresta_activoFormatoNomiFactorNomi!=null && this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jCheckBoxesta_activoFormatoNomiFactorNomi.setBorderPainted(true);this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jCheckBoxesta_activoFormatoNomiFactorNomi.setBorder(this.formatonomifactornomiConstantesFunciones.resaltaresta_activoFormatoNomiFactorNomi);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioFormatoNomiFactorNomi() throws Exception {		
		if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
	
		//this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jLabelidFormatoNomiFactorNomi.setVisible(this.formatonomifactornomiConstantesFunciones.mostraridFormatoNomiFactorNomi);
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jPanelidFormatoNomiFactorNomi.setVisible(this.formatonomifactornomiConstantesFunciones.mostraridFormatoNomiFactorNomi);
		//this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_empresaFormatoNomiFactorNomi.setVisible(this.formatonomifactornomiConstantesFunciones.mostrarid_empresaFormatoNomiFactorNomi);
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jPanelid_empresaFormatoNomiFactorNomi.setVisible(this.formatonomifactornomiConstantesFunciones.mostrarid_empresaFormatoNomiFactorNomi);
		//this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_sucursalFormatoNomiFactorNomi.setVisible(this.formatonomifactornomiConstantesFunciones.mostrarid_sucursalFormatoNomiFactorNomi);
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jPanelid_sucursalFormatoNomiFactorNomi.setVisible(this.formatonomifactornomiConstantesFunciones.mostrarid_sucursalFormatoNomiFactorNomi);
		//this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_formato_nomiFormatoNomiFactorNomi.setVisible(this.formatonomifactornomiConstantesFunciones.mostrarid_formato_nomiFormatoNomiFactorNomi);
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jPanelid_formato_nomiFormatoNomiFactorNomi.setVisible(this.formatonomifactornomiConstantesFunciones.mostrarid_formato_nomiFormatoNomiFactorNomi);
		//this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_factor_nomiFormatoNomiFactorNomi.setVisible(this.formatonomifactornomiConstantesFunciones.mostrarid_factor_nomiFormatoNomiFactorNomi);
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jPanelid_factor_nomiFormatoNomiFactorNomi.setVisible(this.formatonomifactornomiConstantesFunciones.mostrarid_factor_nomiFormatoNomiFactorNomi);
		//this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jTextFieldponderacionFormatoNomiFactorNomi.setVisible(this.formatonomifactornomiConstantesFunciones.mostrarponderacionFormatoNomiFactorNomi);
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jPanelponderacionFormatoNomiFactorNomi.setVisible(this.formatonomifactornomiConstantesFunciones.mostrarponderacionFormatoNomiFactorNomi);
		//this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jCheckBoxesta_activoFormatoNomiFactorNomi.setVisible(this.formatonomifactornomiConstantesFunciones.mostraresta_activoFormatoNomiFactorNomi);
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jPanelesta_activoFormatoNomiFactorNomi.setVisible(this.formatonomifactornomiConstantesFunciones.mostraresta_activoFormatoNomiFactorNomi);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioFormatoNomiFactorNomi() throws Exception {
		if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFormatoNomiFactorNomi!=null) {
	
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jLabelidFormatoNomiFactorNomi.setEnabled(this.formatonomifactornomiConstantesFunciones.activaridFormatoNomiFactorNomi);
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_empresaFormatoNomiFactorNomi.setEnabled(this.formatonomifactornomiConstantesFunciones.activarid_empresaFormatoNomiFactorNomi);
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_sucursalFormatoNomiFactorNomi.setEnabled(this.formatonomifactornomiConstantesFunciones.activarid_sucursalFormatoNomiFactorNomi);
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_formato_nomiFormatoNomiFactorNomi.setEnabled(this.formatonomifactornomiConstantesFunciones.activarid_formato_nomiFormatoNomiFactorNomi);
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jComboBoxid_factor_nomiFormatoNomiFactorNomi.setEnabled(this.formatonomifactornomiConstantesFunciones.activarid_factor_nomiFormatoNomiFactorNomi);
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jTextFieldponderacionFormatoNomiFactorNomi.setEnabled(this.formatonomifactornomiConstantesFunciones.activarponderacionFormatoNomiFactorNomi);
		this.jInternalFrameDetalleFormFormatoNomiFactorNomi.jCheckBoxesta_activoFormatoNomiFactorNomi.setEnabled(this.formatonomifactornomiConstantesFunciones.activaresta_activoFormatoNomiFactorNomi);
		}
	}
	
		
}