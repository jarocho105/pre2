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

import com.bydan.erp.nomina.util.FormatoNomiPreguntaNomiConstantesFunciones;
import com.bydan.erp.nomina.util.FormatoNomiPreguntaNomiParameterReturnGeneral;
//import com.bydan.erp.nomina.util.FormatoNomiPreguntaNomiParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.FormatoNomiPreguntaNomiBean;
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
public class FormatoNomiPreguntaNomiBeanSwingJInternalFrame extends FormatoNomiPreguntaNomiJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(FormatoNomiPreguntaNomiBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<FormatoNomiPreguntaNomi> formatonomipreguntanomiValidator = new ClassValidator<FormatoNomiPreguntaNomi>(FormatoNomiPreguntaNomi.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public FormatoNomiPreguntaNomi formatonomipreguntanomi;	
	public FormatoNomiPreguntaNomi formatonomipreguntanomiAux;
	public FormatoNomiPreguntaNomi formatonomipreguntanomiAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public FormatoNomiPreguntaNomi formatonomipreguntanomiTotales;
	public Long idFormatoNomiPreguntaNomiActual;
	public Long iIdNuevoFormatoNomiPreguntaNomi=0L;
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

	public String sFinalQueryComboPreguntaNomi="";

	public List<PreguntaNomi> preguntanomisForeignKey;

	public List<PreguntaNomi> getpreguntanomisForeignKey() {
		return preguntanomisForeignKey;
	}

	public void setpreguntanomisForeignKey(List<PreguntaNomi> preguntanomisForeignKey) {
		this.preguntanomisForeignKey = preguntanomisForeignKey;
	}

	//OBJETO FK ACTUAL
	public PreguntaNomi preguntanomiForeignKey;

	public PreguntaNomi getpreguntanomiForeignKey() {
		return preguntanomiForeignKey;
	}

	public void setpreguntanomiForeignKey(PreguntaNomi preguntanomiForeignKey) {
		this.preguntanomiForeignKey = preguntanomiForeignKey;
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
	
	public Boolean isPermisoTodoFormatoNomiPreguntaNomi;
	public Boolean isPermisoNuevoFormatoNomiPreguntaNomi;
	public Boolean isPermisoActualizarFormatoNomiPreguntaNomi;
	public Boolean isPermisoActualizarOriginalFormatoNomiPreguntaNomi;
	public Boolean isPermisoEliminarFormatoNomiPreguntaNomi;
	public Boolean isPermisoGuardarCambiosFormatoNomiPreguntaNomi;
	public Boolean isPermisoConsultaFormatoNomiPreguntaNomi;
	public Boolean isPermisoBusquedaFormatoNomiPreguntaNomi;
	public Boolean isPermisoReporteFormatoNomiPreguntaNomi;
	public Boolean isPermisoPaginacionMedioFormatoNomiPreguntaNomi;
	public Boolean isPermisoPaginacionAltoFormatoNomiPreguntaNomi;
	public Boolean isPermisoPaginacionTodoFormatoNomiPreguntaNomi;
	public Boolean isPermisoCopiarFormatoNomiPreguntaNomi;
	public Boolean isPermisoVerFormFormatoNomiPreguntaNomi;
	public Boolean isPermisoDuplicarFormatoNomiPreguntaNomi;
	public Boolean isPermisoOrdenFormatoNomiPreguntaNomi;
	
	
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
	
	public FormatoNomiPreguntaNomiParameterReturnGeneral formatonomipreguntanomiReturnGeneral;
	public FormatoNomiPreguntaNomiParameterReturnGeneral formatonomipreguntanomiParameterGeneral;
	
	

	public CalificacionEmpleadoLogic calificacionempleadoLogic=null;

	public CalificacionEmpleadoLogic getCalificacionEmpleadoLogic() {
		return calificacionempleadoLogic;
	}

	public void setCalificacionEmpleadoLogic(CalificacionEmpleadoLogic calificacionempleadoLogic) {
		this.calificacionempleadoLogic = calificacionempleadoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoFormatoNomiPreguntaNomi=false;
	public Boolean esParaAccionDesdeFormularioFormatoNomiPreguntaNomi=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected FormatoNomiPreguntaNomiSessionBeanAdditional formatonomipreguntanomiSessionBeanAdditional=null;
	
	public FormatoNomiPreguntaNomiSessionBeanAdditional getFormatoNomiPreguntaNomiSessionBeanAdditional() {
		return this.formatonomipreguntanomiSessionBeanAdditional;
	}
	
	public void setFormatoNomiPreguntaNomiSessionBeanAdditional(FormatoNomiPreguntaNomiSessionBeanAdditional formatonomipreguntanomiSessionBeanAdditional) {
		try {
			this.formatonomipreguntanomiSessionBeanAdditional=formatonomipreguntanomiSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional formatonomipreguntanomiBeanSwingJInternalFrameAdditional=null;
	//public class FormatoNomiPreguntaNomiBeanSwingJInternalFrame
	
	public FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional getFormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional() {
		return this.formatonomipreguntanomiBeanSwingJInternalFrameAdditional;
	}
	
	public void setFormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional(FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional formatonomipreguntanomiBeanSwingJInternalFrameAdditional) {
		try {
			this.formatonomipreguntanomiBeanSwingJInternalFrameAdditional=formatonomipreguntanomiBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public FormatoNomiPreguntaNomiLogic formatonomipreguntanomiLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public FormatoNomiPreguntaNomi formatonomipreguntanomiBean;
	public FormatoNomiPreguntaNomiConstantesFunciones formatonomipreguntanomiConstantesFunciones;
	//public FormatoNomiPreguntaNomiParameterReturnGeneral formatonomipreguntanomiReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public FormatoNomiLogic formatonomiLogic;
	public FactorNomiLogic factornomiLogic;
	public PreguntaNomiLogic preguntanomiLogic;
	
	//PARAMETROS
	
	
	//public List<FormatoNomiPreguntaNomi> formatonomipreguntanomis;	
	//public List<FormatoNomiPreguntaNomi> formatonomipreguntanomisEliminados;
	//public List<FormatoNomiPreguntaNomi> formatonomipreguntanomisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoFormatoNomiPreguntaNomi=false;
	public Boolean isVisibilidadCeldaDuplicarFormatoNomiPreguntaNomi=true;
	public Boolean isVisibilidadCeldaCopiarFormatoNomiPreguntaNomi=true;
	public Boolean isVisibilidadCeldaVerFormFormatoNomiPreguntaNomi=true;
	public Boolean isVisibilidadCeldaOrdenFormatoNomiPreguntaNomi=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesFormatoNomiPreguntaNomi=false;
	public Boolean isVisibilidadCeldaModificarFormatoNomiPreguntaNomi=false;
	public Boolean isVisibilidadCeldaActualizarFormatoNomiPreguntaNomi=false;
	public Boolean isVisibilidadCeldaEliminarFormatoNomiPreguntaNomi=false;
	public Boolean isVisibilidadCeldaCancelarFormatoNomiPreguntaNomi=false;
	public Boolean isVisibilidadCeldaGuardarFormatoNomiPreguntaNomi=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosFormatoNomiPreguntaNomi=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdFactorNomi=false;
	public Boolean isVisibilidadFK_IdFormatoNomi=false;
	public Boolean isVisibilidadFK_IdPreguntaNomi=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoFormatoNomiPreguntaNomi() {
		return this.iIdNuevoFormatoNomiPreguntaNomi;
	}

	public void setiIdNuevoFormatoNomiPreguntaNomi(Long iIdNuevoFormatoNomiPreguntaNomi) {
		this.iIdNuevoFormatoNomiPreguntaNomi = iIdNuevoFormatoNomiPreguntaNomi;
	}
	
	public Long getidFormatoNomiPreguntaNomiActual() {
		return this.idFormatoNomiPreguntaNomiActual;
	}

	public void setidFormatoNomiPreguntaNomiActual(Long idFormatoNomiPreguntaNomiActual) {
		this.idFormatoNomiPreguntaNomiActual = idFormatoNomiPreguntaNomiActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public FormatoNomiPreguntaNomi getformatonomipreguntanomi() {
		return this.formatonomipreguntanomi;
	}

	public void setformatonomipreguntanomi(FormatoNomiPreguntaNomi formatonomipreguntanomi) {
		this.formatonomipreguntanomi = formatonomipreguntanomi;
	}
	
	public FormatoNomiPreguntaNomi getformatonomipreguntanomiAux() {
		return this.formatonomipreguntanomiAux;
	}

	public void setformatonomipreguntanomiAux(FormatoNomiPreguntaNomi formatonomipreguntanomiAux) {
		this.formatonomipreguntanomiAux = formatonomipreguntanomiAux;
	}				
	
	public FormatoNomiPreguntaNomi getformatonomipreguntanomiAnterior() {
		return this.formatonomipreguntanomiAnterior;
	}

	public void setformatonomipreguntanomiAnterior(FormatoNomiPreguntaNomi formatonomipreguntanomiAnterior) {
		this.formatonomipreguntanomiAnterior = formatonomipreguntanomiAnterior;
	}	
	
	public FormatoNomiPreguntaNomi getformatonomipreguntanomiTotales() {
		return this.formatonomipreguntanomiTotales;
	}

	public void setformatonomipreguntanomiTotales(FormatoNomiPreguntaNomi formatonomipreguntanomiTotales) {
		this.formatonomipreguntanomiTotales = formatonomipreguntanomiTotales;
	}	
	
	public FormatoNomiPreguntaNomi getformatonomipreguntanomiBean() {
		return this.formatonomipreguntanomiBean;
	}

	public void setformatonomipreguntanomiBean(FormatoNomiPreguntaNomi formatonomipreguntanomiBean) {
		this.formatonomipreguntanomiBean = formatonomipreguntanomiBean;
	}	
	
	public FormatoNomiPreguntaNomiParameterReturnGeneral getformatonomipreguntanomiReturnGeneral() {
		return this.formatonomipreguntanomiReturnGeneral;
	}

	public void setformatonomipreguntanomiReturnGeneral(FormatoNomiPreguntaNomiParameterReturnGeneral formatonomipreguntanomiReturnGeneral) {
		this.formatonomipreguntanomiReturnGeneral = formatonomipreguntanomiReturnGeneral;
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

	public Long id_pregunta_nomiFK_IdPreguntaNomi=-1L;

	public Long getid_pregunta_nomiFK_IdPreguntaNomi() {
		return this.id_pregunta_nomiFK_IdPreguntaNomi;
	}

	public void setid_pregunta_nomiFK_IdPreguntaNomi(Long id_pregunta_nomiFK_IdPreguntaNomi) {
		this.id_pregunta_nomiFK_IdPreguntaNomi = id_pregunta_nomiFK_IdPreguntaNomi;
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
	
	
	public FormatoNomiPreguntaNomiLogic getFormatoNomiPreguntaNomiLogic()	{		
		return formatonomipreguntanomiLogic;
	}

	public void setFormatoNomiPreguntaNomiLogic(FormatoNomiPreguntaNomiLogic formatonomipreguntanomiLogic) {
		this.formatonomipreguntanomiLogic = formatonomipreguntanomiLogic;
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
	
	public Boolean getIsEsNuevoFormatoNomiPreguntaNomi() {
		return isEsNuevoFormatoNomiPreguntaNomi;
	}

	public void setIsEsNuevoFormatoNomiPreguntaNomi(Boolean isEsNuevoFormatoNomiPreguntaNomi) {
		this.isEsNuevoFormatoNomiPreguntaNomi = isEsNuevoFormatoNomiPreguntaNomi;
	}

	public Boolean getEsParaAccionDesdeFormularioFormatoNomiPreguntaNomi() {
		return esParaAccionDesdeFormularioFormatoNomiPreguntaNomi;
	}
	
	public void setEsParaAccionDesdeFormularioFormatoNomiPreguntaNomi(Boolean esParaAccionDesdeFormularioFormatoNomiPreguntaNomi) {
		this.esParaAccionDesdeFormularioFormatoNomiPreguntaNomi = esParaAccionDesdeFormularioFormatoNomiPreguntaNomi;
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

			if(this.formatonomipreguntanomiSessionBean==null) {
				this.formatonomipreguntanomiSessionBean=new FormatoNomiPreguntaNomiSessionBean();
			}

			if(!this.formatonomipreguntanomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(formatonomipreguntanomiSessionBean.getlidEmpresaActual());
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

			if(this.formatonomipreguntanomiSessionBean==null) {
				this.formatonomipreguntanomiSessionBean=new FormatoNomiPreguntaNomiSessionBean();
			}

			if(!this.formatonomipreguntanomiSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(formatonomipreguntanomiSessionBean.getlidSucursalActual());
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

			if(this.formatonomipreguntanomiSessionBean==null) {
				this.formatonomipreguntanomiSessionBean=new FormatoNomiPreguntaNomiSessionBean();
			}

			if(!this.formatonomipreguntanomiSessionBean.getisBusquedaDesdeForeignKeySesionFormatoNomi()) {
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
					formatonomiLogic.getEntityWithConnection(formatonomipreguntanomiSessionBean.getlidFormatoNomiActual());
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

			if(this.formatonomipreguntanomiSessionBean==null) {
				this.formatonomipreguntanomiSessionBean=new FormatoNomiPreguntaNomiSessionBean();
			}

			if(!this.formatonomipreguntanomiSessionBean.getisBusquedaDesdeForeignKeySesionFactorNomi()) {
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
					factornomiLogic.getEntityWithConnection(formatonomipreguntanomiSessionBean.getlidFactorNomiActual());
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

	public void cargarCombosPreguntaNomisForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.preguntanomisForeignKey=new ArrayList<PreguntaNomi>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PreguntaNomiLogic preguntanomiLogic=new PreguntaNomiLogic();

			//preguntanomiLogic.getPreguntaNomiDataAccess().setIsForForeingKeyData(true);

			if(this.formatonomipreguntanomiSessionBean==null) {
				this.formatonomipreguntanomiSessionBean=new FormatoNomiPreguntaNomiSessionBean();
			}

			if(!this.formatonomipreguntanomiSessionBean.getisBusquedaDesdeForeignKeySesionPreguntaNomi()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//preguntanomiLogic.getPreguntaNomiDataAccess().setIsForForeingKeyData(true);

					preguntanomiLogic.getTodosPreguntaNomisWithConnection(sFinalQuery,new Pagination());

					this.preguntanomisForeignKey=preguntanomiLogic.getPreguntaNomis();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPreguntaNomi(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					preguntanomiLogic.getEntityWithConnection(formatonomipreguntanomiSessionBean.getlidPreguntaNomiActual());
					this.preguntanomisForeignKey.add(preguntanomiLogic.getPreguntaNomi());
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

					if(this.formatonomipreguntanomi!=null) {
						this.formatonomipreguntanomi.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
						this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_empresaFormatoNomiPreguntaNomi.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaFormatoNomiPreguntaNomi.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
						if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_empresaFormatoNomiPreguntaNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_empresaFormatoNomiPreguntaNomi.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaFormatoNomiPreguntaNomiGenerico)throws Exception
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
				jComboBoxid_empresaFormatoNomiPreguntaNomiGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaFormatoNomiPreguntaNomiGenerico!=null && jComboBoxid_empresaFormatoNomiPreguntaNomiGenerico.getItemCount()>0) {
					jComboBoxid_empresaFormatoNomiPreguntaNomiGenerico.setSelectedIndex(0);
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

					if(this.formatonomipreguntanomi!=null) {
						this.formatonomipreguntanomi.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
						this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_sucursalFormatoNomiPreguntaNomi.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalFormatoNomiPreguntaNomi.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
						if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_sucursalFormatoNomiPreguntaNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_sucursalFormatoNomiPreguntaNomi.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalFormatoNomiPreguntaNomiGenerico)throws Exception
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
				jComboBoxid_sucursalFormatoNomiPreguntaNomiGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalFormatoNomiPreguntaNomiGenerico!=null && jComboBoxid_sucursalFormatoNomiPreguntaNomiGenerico.getItemCount()>0) {
					jComboBoxid_sucursalFormatoNomiPreguntaNomiGenerico.setSelectedIndex(0);
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

					if(this.formatonomipreguntanomi!=null) {
						this.formatonomipreguntanomi.setFormatoNomi(formatonomiTemp);
					}

					if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
						this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_formato_nomiFormatoNomiPreguntaNomi.setSelectedItem(formatonomiTemp);
					}
				} else {
					//jComboBoxid_formato_nomiFormatoNomiPreguntaNomi.setSelectedItem(formatonomiTemp);
					if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
						if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_formato_nomiFormatoNomiPreguntaNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_formato_nomiFormatoNomiPreguntaNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdFormatoNomi") || sFormularioTipoBusqueda.equals("Todos")){
					if(formatonomiTemp!=null && jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomi!=null) {
						jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomi.setSelectedItem(formatonomiTemp);
					} else {
						if(jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomi!=null) {
							//jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomi.setSelectedItem(formatonomiTemp);
							if(jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomi.getItemCount()>0) {
								jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomi.setSelectedIndex(0);
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
	public void setActualFormatoNomiForeignKeyGenerico(Long idFormatoNomiSeleccionado,JComboBox jComboBoxid_formato_nomiFormatoNomiPreguntaNomiGenerico)throws Exception
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
				jComboBoxid_formato_nomiFormatoNomiPreguntaNomiGenerico.setSelectedItem(formatonomiTemp);
			} else {
				if(jComboBoxid_formato_nomiFormatoNomiPreguntaNomiGenerico!=null && jComboBoxid_formato_nomiFormatoNomiPreguntaNomiGenerico.getItemCount()>0) {
					jComboBoxid_formato_nomiFormatoNomiPreguntaNomiGenerico.setSelectedIndex(0);
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

					if(this.formatonomipreguntanomi!=null) {
						this.formatonomipreguntanomi.setFactorNomi(factornomiTemp);
					}

					if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
						this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_factor_nomiFormatoNomiPreguntaNomi.setSelectedItem(factornomiTemp);
					}
				} else {
					//jComboBoxid_factor_nomiFormatoNomiPreguntaNomi.setSelectedItem(factornomiTemp);
					if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
						if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_factor_nomiFormatoNomiPreguntaNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_factor_nomiFormatoNomiPreguntaNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdFactorNomi") || sFormularioTipoBusqueda.equals("Todos")){
					if(factornomiTemp!=null && jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomi!=null) {
						jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomi.setSelectedItem(factornomiTemp);
					} else {
						if(jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomi!=null) {
							//jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomi.setSelectedItem(factornomiTemp);
							if(jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomi.getItemCount()>0) {
								jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomi.setSelectedIndex(0);
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
	public void setActualFactorNomiForeignKeyGenerico(Long idFactorNomiSeleccionado,JComboBox jComboBoxid_factor_nomiFormatoNomiPreguntaNomiGenerico)throws Exception
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
				jComboBoxid_factor_nomiFormatoNomiPreguntaNomiGenerico.setSelectedItem(factornomiTemp);
			} else {
				if(jComboBoxid_factor_nomiFormatoNomiPreguntaNomiGenerico!=null && jComboBoxid_factor_nomiFormatoNomiPreguntaNomiGenerico.getItemCount()>0) {
					jComboBoxid_factor_nomiFormatoNomiPreguntaNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPreguntaNomiForeignKey(Long idPreguntaNomiSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			PreguntaNomi  preguntanomiTemp=null;

			for(PreguntaNomi preguntanomiAux:preguntanomisForeignKey) {
				if(preguntanomiAux.getId()!=null && preguntanomiAux.getId().equals(idPreguntaNomiSeleccionado)) {
					preguntanomiTemp=preguntanomiAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(preguntanomiTemp!=null) {

					if(this.formatonomipreguntanomi!=null) {
						this.formatonomipreguntanomi.setPreguntaNomi(preguntanomiTemp);
					}

					if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
						this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomi.setSelectedItem(preguntanomiTemp);
					}
				} else {
					//jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomi.setSelectedItem(preguntanomiTemp);
					if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
						if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPreguntaNomi") || sFormularioTipoBusqueda.equals("Todos")){
					if(preguntanomiTemp!=null && jComboBoxid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomi!=null) {
						jComboBoxid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomi.setSelectedItem(preguntanomiTemp);
					} else {
						if(jComboBoxid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomi!=null) {
							//jComboBoxid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomi.setSelectedItem(preguntanomiTemp);
							if(jComboBoxid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomi.getItemCount()>0) {
								jComboBoxid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomi.setSelectedIndex(0);
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

	public String getActualPreguntaNomiForeignKeyDescripcion(Long idPreguntaNomiSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			PreguntaNomi  preguntanomiTemp=null;

			for(PreguntaNomi preguntanomiAux:preguntanomisForeignKey) {
				if(preguntanomiAux.getId()!=null && preguntanomiAux.getId().equals(idPreguntaNomiSeleccionado)) {
					preguntanomiTemp=preguntanomiAux;
					break;
				}
			}


			sDescripcion=PreguntaNomiConstantesFunciones.getPreguntaNomiDescripcion(preguntanomiTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPreguntaNomiForeignKeyGenerico(Long idPreguntaNomiSeleccionado,JComboBox jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomiGenerico)throws Exception
	{
		try
		{
			PreguntaNomi  preguntanomiTemp=null;

			for(PreguntaNomi preguntanomiAux:preguntanomisForeignKey) {
				if(preguntanomiAux.getId()!=null && preguntanomiAux.getId().equals(idPreguntaNomiSeleccionado)) {
					preguntanomiTemp=preguntanomiAux;
					break;
				}
			}

			if(preguntanomiTemp!=null) {
				jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomiGenerico.setSelectedItem(preguntanomiTemp);
			} else {
				if(jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomiGenerico!=null && jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomiGenerico.getItemCount()>0) {
					jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(FormatoNomiPreguntaNomi formatonomipreguntanomi,JComboBox jComboBoxid_empresaFormatoNomiPreguntaNomiGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaFormatoNomiPreguntaNomiGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_empresaFormatoNomiPreguntaNomi.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaFormatoNomiPreguntaNomiGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				formatonomipreguntanomi.setid_empresa(empresaAux.getId());
				formatonomipreguntanomi.setempresa_descripcion(FormatoNomiPreguntaNomiConstantesFunciones.getEmpresaDescripcion(empresaAux));
				formatonomipreguntanomi.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(FormatoNomiPreguntaNomi formatonomipreguntanomi,JComboBox jComboBoxid_sucursalFormatoNomiPreguntaNomiGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalFormatoNomiPreguntaNomiGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_sucursalFormatoNomiPreguntaNomi.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalFormatoNomiPreguntaNomiGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				formatonomipreguntanomi.setid_sucursal(sucursalAux.getId());
				formatonomipreguntanomi.setsucursal_descripcion(FormatoNomiPreguntaNomiConstantesFunciones.getSucursalDescripcion(sucursalAux));
				formatonomipreguntanomi.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFormatoNomiForeignKey(FormatoNomiPreguntaNomi formatonomipreguntanomi,JComboBox jComboBoxid_formato_nomiFormatoNomiPreguntaNomiGenerico)throws Exception
	{
		try
		{
			FormatoNomi  formatonomiAux=new FormatoNomi();

			if(jComboBoxid_formato_nomiFormatoNomiPreguntaNomiGenerico==null) {
				formatonomiAux=(FormatoNomi)this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_formato_nomiFormatoNomiPreguntaNomi.getSelectedItem();
			} else {
				formatonomiAux=(FormatoNomi)jComboBoxid_formato_nomiFormatoNomiPreguntaNomiGenerico.getSelectedItem();
			}

			if(formatonomiAux!=null && formatonomiAux.getId()!=null) {
				formatonomipreguntanomi.setid_formato_nomi(formatonomiAux.getId());
				formatonomipreguntanomi.setformatonomi_descripcion(FormatoNomiPreguntaNomiConstantesFunciones.getFormatoNomiDescripcion(formatonomiAux));
				formatonomipreguntanomi.setFormatoNomi(formatonomiAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFactorNomiForeignKey(FormatoNomiPreguntaNomi formatonomipreguntanomi,JComboBox jComboBoxid_factor_nomiFormatoNomiPreguntaNomiGenerico)throws Exception
	{
		try
		{
			FactorNomi  factornomiAux=new FactorNomi();

			if(jComboBoxid_factor_nomiFormatoNomiPreguntaNomiGenerico==null) {
				factornomiAux=(FactorNomi)this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_factor_nomiFormatoNomiPreguntaNomi.getSelectedItem();
			} else {
				factornomiAux=(FactorNomi)jComboBoxid_factor_nomiFormatoNomiPreguntaNomiGenerico.getSelectedItem();
			}

			if(factornomiAux!=null && factornomiAux.getId()!=null) {
				formatonomipreguntanomi.setid_factor_nomi(factornomiAux.getId());
				formatonomipreguntanomi.setfactornomi_descripcion(FormatoNomiPreguntaNomiConstantesFunciones.getFactorNomiDescripcion(factornomiAux));
				formatonomipreguntanomi.setFactorNomi(factornomiAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPreguntaNomiForeignKey(FormatoNomiPreguntaNomi formatonomipreguntanomi,JComboBox jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomiGenerico)throws Exception
	{
		try
		{
			PreguntaNomi  preguntanomiAux=new PreguntaNomi();

			if(jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomiGenerico==null) {
				preguntanomiAux=(PreguntaNomi)this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomi.getSelectedItem();
			} else {
				preguntanomiAux=(PreguntaNomi)jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomiGenerico.getSelectedItem();
			}

			if(preguntanomiAux!=null && preguntanomiAux.getId()!=null) {
				formatonomipreguntanomi.setid_pregunta_nomi(preguntanomiAux.getId());
				formatonomipreguntanomi.setpreguntanomi_descripcion(FormatoNomiPreguntaNomiConstantesFunciones.getPreguntaNomiDescripcion(preguntanomiAux));
				formatonomipreguntanomi.setPreguntaNomi(preguntanomiAux);			}
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

					if(!FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) { 
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_empresaFormatoNomiPreguntaNomi.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_empresaFormatoNomiPreguntaNomi.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) { 
					}

					if(!FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
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

					if(!FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) { 
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_sucursalFormatoNomiPreguntaNomi.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_sucursalFormatoNomiPreguntaNomi.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) { 
					}

					if(!FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
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

					if(!FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) { 
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_formato_nomiFormatoNomiPreguntaNomi.removeAllItems();

							for(FormatoNomi formatonomi:this.formatonomisForeignKey) {
								this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_formato_nomiFormatoNomiPreguntaNomi.addItem(formatonomi);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) { 
					}

					if(!FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdFormatoNomi") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomi.removeAllItems();

							for(FormatoNomi formatonomi:this.formatonomisForeignKey) {
								this.jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomi.addItem(formatonomi);
							}
						}

						if(!FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
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

					if(!FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) { 
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_factor_nomiFormatoNomiPreguntaNomi.removeAllItems();

							for(FactorNomi factornomi:this.factornomisForeignKey) {
								this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_factor_nomiFormatoNomiPreguntaNomi.addItem(factornomi);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) { 
					}

					if(!FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdFactorNomi") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomi.removeAllItems();

							for(FactorNomi factornomi:this.factornomisForeignKey) {
								this.jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomi.addItem(factornomi);
							}
						}

						if(!FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePreguntaNomisForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPreguntaNomi=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) { 
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomi.removeAllItems();

							for(PreguntaNomi preguntanomi:this.preguntanomisForeignKey) {
								this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomi.addItem(preguntanomi);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) { 
					}

					if(!FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPreguntaNomi") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomi.removeAllItems();

							for(PreguntaNomi preguntanomi:this.preguntanomisForeignKey) {
								this.jComboBoxid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomi.addItem(preguntanomi);
							}
						}

						if(!FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_empresaFormatoNomiPreguntaNomi.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_empresaFormatoNomiPreguntaNomi.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_sucursalFormatoNomiPreguntaNomi.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_sucursalFormatoNomiPreguntaNomi.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_formato_nomiFormatoNomiPreguntaNomi.setSelectedItem(formatonomi);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_formato_nomiFormatoNomiPreguntaNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomi.setSelectedItem(formatonomi);
						} else {
							this.jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomi.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_factor_nomiFormatoNomiPreguntaNomi.setSelectedItem(factornomi);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_factor_nomiFormatoNomiPreguntaNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomi.setSelectedItem(factornomi);
						} else {
							this.jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomi.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFramePreguntaNomiForeignKey(PreguntaNomi preguntanomi,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomi.setSelectedItem(preguntanomi);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomi.setSelectedItem(preguntanomi);
						} else {
							this.jComboBoxid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomi.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesFormatoNomiPreguntaNomi() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			FormatoNomiPreguntaNomiConstantesFunciones.refrescarForeignKeysDescripcionesFormatoNomiPreguntaNomi(this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			FormatoNomiPreguntaNomiConstantesFunciones.refrescarForeignKeysDescripcionesFormatoNomiPreguntaNomi(this.formatonomipreguntanomis);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(FormatoNomi.class));
		classes.add(new Classe(FactorNomi.class));
		classes.add(new Classe(PreguntaNomi.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//formatonomipreguntanomiLogic.setFormatoNomiPreguntaNomis(this.formatonomipreguntanomis);
			formatonomipreguntanomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public FormatoNomiPreguntaNomiParameterReturnGeneral getFormatoNomiPreguntaNomiParameterGeneral() {
		return this.formatonomipreguntanomiParameterGeneral;
	}
	
	public void setFormatoNomiPreguntaNomiParameterGeneral(FormatoNomiPreguntaNomiParameterReturnGeneral formatonomipreguntanomiParameterGeneral) {
		this.formatonomipreguntanomiParameterGeneral = formatonomipreguntanomiParameterGeneral;
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
	
	public Boolean getIsPermisoTodoFormatoNomiPreguntaNomi() {
		return isPermisoTodoFormatoNomiPreguntaNomi;
	}

	public void setIsPermisoTodoFormatoNomiPreguntaNomi(Boolean isPermisoTodoFormatoNomiPreguntaNomi) {
		this.isPermisoTodoFormatoNomiPreguntaNomi = isPermisoTodoFormatoNomiPreguntaNomi;
	}

	public Boolean getIsPermisoNuevoFormatoNomiPreguntaNomi() {
		return isPermisoNuevoFormatoNomiPreguntaNomi;
	}

	public void setIsPermisoNuevoFormatoNomiPreguntaNomi(Boolean isPermisoNuevoFormatoNomiPreguntaNomi) {
		this.isPermisoNuevoFormatoNomiPreguntaNomi = isPermisoNuevoFormatoNomiPreguntaNomi;
	}

	public Boolean getIsPermisoActualizarFormatoNomiPreguntaNomi() {
		return isPermisoActualizarFormatoNomiPreguntaNomi;
	}

	public void setIsPermisoActualizarFormatoNomiPreguntaNomi(Boolean isPermisoActualizarFormatoNomiPreguntaNomi) {
		this.isPermisoActualizarFormatoNomiPreguntaNomi = isPermisoActualizarFormatoNomiPreguntaNomi;
	}

	public Boolean getIsPermisoEliminarFormatoNomiPreguntaNomi() {
		return isPermisoEliminarFormatoNomiPreguntaNomi;
	}

	public void setIsPermisoEliminarFormatoNomiPreguntaNomi(Boolean isPermisoEliminarFormatoNomiPreguntaNomi) {
		this.isPermisoEliminarFormatoNomiPreguntaNomi = isPermisoEliminarFormatoNomiPreguntaNomi;
	}

	public Boolean getIsPermisoGuardarCambiosFormatoNomiPreguntaNomi() {
		return isPermisoGuardarCambiosFormatoNomiPreguntaNomi;
	}

	public void setIsPermisoGuardarCambiosFormatoNomiPreguntaNomi(Boolean isPermisoGuardarCambiosFormatoNomiPreguntaNomi) {
		this.isPermisoGuardarCambiosFormatoNomiPreguntaNomi = isPermisoGuardarCambiosFormatoNomiPreguntaNomi;
	}
	
	public Boolean getIsPermisoConsultaFormatoNomiPreguntaNomi() {
		return isPermisoConsultaFormatoNomiPreguntaNomi;
	}

	public void setIsPermisoConsultaFormatoNomiPreguntaNomi(Boolean isPermisoConsultaFormatoNomiPreguntaNomi) {
		this.isPermisoConsultaFormatoNomiPreguntaNomi = isPermisoConsultaFormatoNomiPreguntaNomi;
	}

	public Boolean getIsPermisoBusquedaFormatoNomiPreguntaNomi() {
		return isPermisoBusquedaFormatoNomiPreguntaNomi;
	}

	public void setIsPermisoBusquedaFormatoNomiPreguntaNomi(Boolean isPermisoBusquedaFormatoNomiPreguntaNomi) {
		this.isPermisoBusquedaFormatoNomiPreguntaNomi = isPermisoBusquedaFormatoNomiPreguntaNomi;
	}

	public Boolean getIsPermisoReporteFormatoNomiPreguntaNomi() {
		return isPermisoReporteFormatoNomiPreguntaNomi;
	}

	public void setIsPermisoReporteFormatoNomiPreguntaNomi(Boolean isPermisoReporteFormatoNomiPreguntaNomi) {
		this.isPermisoReporteFormatoNomiPreguntaNomi = isPermisoReporteFormatoNomiPreguntaNomi;
	}
	
	public Boolean getIsPermisoPaginacionMedioFormatoNomiPreguntaNomi() {
		return isPermisoPaginacionMedioFormatoNomiPreguntaNomi;
	}

	public void setIsPermisoPaginacionMedioFormatoNomiPreguntaNomi(Boolean isPermisoPaginacionMedioFormatoNomiPreguntaNomi) {
		this.isPermisoPaginacionMedioFormatoNomiPreguntaNomi = isPermisoPaginacionMedioFormatoNomiPreguntaNomi;
	}
	
	public Boolean getIsPermisoPaginacionTodoFormatoNomiPreguntaNomi() {
		return isPermisoPaginacionTodoFormatoNomiPreguntaNomi;
	}

	public void setIsPermisoPaginacionTodoFormatoNomiPreguntaNomi(Boolean isPermisoPaginacionTodoFormatoNomiPreguntaNomi) {
		this.isPermisoPaginacionTodoFormatoNomiPreguntaNomi = isPermisoPaginacionTodoFormatoNomiPreguntaNomi;
	}
	
	public Boolean getIsPermisoPaginacionAltoFormatoNomiPreguntaNomi() {
		return isPermisoPaginacionAltoFormatoNomiPreguntaNomi;
	}

	public void setIsPermisoPaginacionAltoFormatoNomiPreguntaNomi(Boolean isPermisoPaginacionAltoFormatoNomiPreguntaNomi) {
		this.isPermisoPaginacionAltoFormatoNomiPreguntaNomi = isPermisoPaginacionAltoFormatoNomiPreguntaNomi;
	}
	
	public Boolean getIsPermisoCopiarFormatoNomiPreguntaNomi() {
		return isPermisoCopiarFormatoNomiPreguntaNomi;
	}

	public void setIsPermisoCopiarFormatoNomiPreguntaNomi(Boolean isPermisoCopiarFormatoNomiPreguntaNomi) {
		this.isPermisoCopiarFormatoNomiPreguntaNomi = isPermisoCopiarFormatoNomiPreguntaNomi;
	}
	
	public Boolean getIsPermisoVerFormFormatoNomiPreguntaNomi() {
		return isPermisoVerFormFormatoNomiPreguntaNomi;
	}

	public void setIsPermisoVerFormFormatoNomiPreguntaNomi(Boolean isPermisoVerFormFormatoNomiPreguntaNomi) {
		this.isPermisoVerFormFormatoNomiPreguntaNomi = isPermisoVerFormFormatoNomiPreguntaNomi;
	}
	
	public Boolean getIsPermisoDuplicarFormatoNomiPreguntaNomi() {
		return isPermisoDuplicarFormatoNomiPreguntaNomi;
	}

	public void setIsPermisoDuplicarFormatoNomiPreguntaNomi(Boolean isPermisoDuplicarFormatoNomiPreguntaNomi) {
		this.isPermisoDuplicarFormatoNomiPreguntaNomi = isPermisoDuplicarFormatoNomiPreguntaNomi;
	}
	
	public Boolean getIsPermisoOrdenFormatoNomiPreguntaNomi() {
		return isPermisoOrdenFormatoNomiPreguntaNomi;
	}

	public void setIsPermisoOrdenFormatoNomiPreguntaNomi(Boolean isPermisoOrdenFormatoNomiPreguntaNomi) {
		this.isPermisoOrdenFormatoNomiPreguntaNomi = isPermisoOrdenFormatoNomiPreguntaNomi;
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
	
	public Boolean getIsVisibilidadCeldaNuevoFormatoNomiPreguntaNomi() {
		return isVisibilidadCeldaNuevoFormatoNomiPreguntaNomi;
	}

	public void setIsVisibilidadCeldaNuevoFormatoNomiPreguntaNomi(Boolean isVisibilidadCeldaNuevoFormatoNomiPreguntaNomi) {
		this.isVisibilidadCeldaNuevoFormatoNomiPreguntaNomi = isVisibilidadCeldaNuevoFormatoNomiPreguntaNomi;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarFormatoNomiPreguntaNomi() {
		return isVisibilidadCeldaDuplicarFormatoNomiPreguntaNomi;
	}

	public void setIsVisibilidadCeldaDuplicarFormatoNomiPreguntaNomi(Boolean isVisibilidadCeldaDuplicarFormatoNomiPreguntaNomi) {
		this.isVisibilidadCeldaDuplicarFormatoNomiPreguntaNomi = isVisibilidadCeldaDuplicarFormatoNomiPreguntaNomi;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarFormatoNomiPreguntaNomi() {
		return isVisibilidadCeldaCopiarFormatoNomiPreguntaNomi;
	}

	public void setIsVisibilidadCeldaCopiarFormatoNomiPreguntaNomi(Boolean isVisibilidadCeldaCopiarFormatoNomiPreguntaNomi) {
		this.isVisibilidadCeldaCopiarFormatoNomiPreguntaNomi = isVisibilidadCeldaCopiarFormatoNomiPreguntaNomi;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormFormatoNomiPreguntaNomi() {
		return isVisibilidadCeldaVerFormFormatoNomiPreguntaNomi;
	}

	public void setIsVisibilidadCeldaVerFormFormatoNomiPreguntaNomi(Boolean isVisibilidadCeldaVerFormFormatoNomiPreguntaNomi) {
		this.isVisibilidadCeldaVerFormFormatoNomiPreguntaNomi = isVisibilidadCeldaVerFormFormatoNomiPreguntaNomi;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenFormatoNomiPreguntaNomi() {
		return isVisibilidadCeldaOrdenFormatoNomiPreguntaNomi;
	}

	public void setIsVisibilidadCeldaOrdenFormatoNomiPreguntaNomi(Boolean isVisibilidadCeldaOrdenFormatoNomiPreguntaNomi) {
		this.isVisibilidadCeldaOrdenFormatoNomiPreguntaNomi = isVisibilidadCeldaOrdenFormatoNomiPreguntaNomi;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesFormatoNomiPreguntaNomi() {
		return isVisibilidadCeldaNuevoRelacionesFormatoNomiPreguntaNomi;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesFormatoNomiPreguntaNomi(Boolean isVisibilidadCeldaNuevoRelacionesFormatoNomiPreguntaNomi) {
		this.isVisibilidadCeldaNuevoRelacionesFormatoNomiPreguntaNomi = isVisibilidadCeldaNuevoRelacionesFormatoNomiPreguntaNomi;
	}
	
	public Boolean getIsVisibilidadCeldaModificarFormatoNomiPreguntaNomi() {
		return isVisibilidadCeldaModificarFormatoNomiPreguntaNomi;
	}

	public void setIsVisibilidadCeldaModificarFormatoNomiPreguntaNomi(Boolean isVisibilidadCeldaModificarFormatoNomiPreguntaNomi) {
		this.isVisibilidadCeldaModificarFormatoNomiPreguntaNomi = isVisibilidadCeldaModificarFormatoNomiPreguntaNomi;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarFormatoNomiPreguntaNomi() {
		return isVisibilidadCeldaActualizarFormatoNomiPreguntaNomi;
	}

	public void setIsVisibilidadCeldaActualizarFormatoNomiPreguntaNomi(Boolean isVisibilidadCeldaActualizarFormatoNomiPreguntaNomi) {
		this.isVisibilidadCeldaActualizarFormatoNomiPreguntaNomi = isVisibilidadCeldaActualizarFormatoNomiPreguntaNomi;
	}

	public Boolean getIsVisibilidadCeldaEliminarFormatoNomiPreguntaNomi() {
		return isVisibilidadCeldaEliminarFormatoNomiPreguntaNomi;
	}

	public void setIsVisibilidadCeldaEliminarFormatoNomiPreguntaNomi(Boolean isVisibilidadCeldaEliminarFormatoNomiPreguntaNomi) {
		this.isVisibilidadCeldaEliminarFormatoNomiPreguntaNomi = isVisibilidadCeldaEliminarFormatoNomiPreguntaNomi;
	}

	public Boolean getIsVisibilidadCeldaCancelarFormatoNomiPreguntaNomi() {
		return isVisibilidadCeldaCancelarFormatoNomiPreguntaNomi;
	}

	public void setIsVisibilidadCeldaCancelarFormatoNomiPreguntaNomi(Boolean isVisibilidadCeldaCancelarFormatoNomiPreguntaNomi) {
		this.isVisibilidadCeldaCancelarFormatoNomiPreguntaNomi = isVisibilidadCeldaCancelarFormatoNomiPreguntaNomi;
	}

	public Boolean getIsVisibilidadCeldaGuardarFormatoNomiPreguntaNomi() {
		return isVisibilidadCeldaGuardarFormatoNomiPreguntaNomi;
	}

	public void setIsVisibilidadCeldaGuardarFormatoNomiPreguntaNomi(Boolean isVisibilidadCeldaGuardarFormatoNomiPreguntaNomi) {
		this.isVisibilidadCeldaGuardarFormatoNomiPreguntaNomi = isVisibilidadCeldaGuardarFormatoNomiPreguntaNomi;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosFormatoNomiPreguntaNomi() {
		return isVisibilidadCeldaGuardarCambiosFormatoNomiPreguntaNomi;
	}

	public void setIsVisibilidadCeldaGuardarCambiosFormatoNomiPreguntaNomi(Boolean isVisibilidadCeldaGuardarCambiosFormatoNomiPreguntaNomi) {
		this.isVisibilidadCeldaGuardarCambiosFormatoNomiPreguntaNomi = isVisibilidadCeldaGuardarCambiosFormatoNomiPreguntaNomi;
	}
		
	public FormatoNomiPreguntaNomiSessionBean getformatonomipreguntanomiSessionBean() {
		return this.formatonomipreguntanomiSessionBean;
	}
	
	public void setformatonomipreguntanomiSessionBean(FormatoNomiPreguntaNomiSessionBean formatonomipreguntanomiSessionBean) {
		this.formatonomipreguntanomiSessionBean=formatonomipreguntanomiSessionBean;
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

	public Boolean getisVisibilidadFK_IdPreguntaNomi() {
		return this.isVisibilidadFK_IdPreguntaNomi;
	}

	public void setisVisibilidadFK_IdPreguntaNomi(Boolean isVisibilidadFK_IdPreguntaNomi) {
		this.isVisibilidadFK_IdPreguntaNomi=isVisibilidadFK_IdPreguntaNomi;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysFormatoNomiPreguntaNomi(FormatoNomiPreguntaNomi formatonomipreguntanomi)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(formatonomipreguntanomi,null);
				this.setActualParaGuardarSucursalForeignKey(formatonomipreguntanomi,null);
				this.setActualParaGuardarFormatoNomiForeignKey(formatonomipreguntanomi,null);
				this.setActualParaGuardarFactorNomiForeignKey(formatonomipreguntanomi,null);
				this.setActualParaGuardarPreguntaNomiForeignKey(formatonomipreguntanomi,null);
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
	
	public void bugActualizarReferenciaActual(FormatoNomiPreguntaNomi formatonomipreguntanomi,FormatoNomiPreguntaNomi formatonomipreguntanomiAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalFormatoNomiPreguntaNomi(formatonomipreguntanomi);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		formatonomipreguntanomiAux.setId(formatonomipreguntanomi.getId());
		formatonomipreguntanomiAux.setVersionRow(formatonomipreguntanomi.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessFormatoNomiPreguntaNomi();
		
			int intSelectedRow = this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualFormatoNomiPreguntaNomi(this.formatonomipreguntanomi,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = formatonomipreguntanomiValidator.getInvalidValues(this.formatonomipreguntanomi);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			formatonomipreguntanomiLogic.setDatosCliente(datosCliente);
			formatonomipreguntanomiLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				formatonomipreguntanomiAux=new  FormatoNomiPreguntaNomi();
				
				formatonomipreguntanomiAux.setIsNew(true);
				formatonomipreguntanomiAux.setIsChanged(true);
				
				formatonomipreguntanomiAux.setFormatoNomiPreguntaNomiOriginal(this.formatonomipreguntanomi);
				
				formatonomipreguntanomiAux.setId(this.formatonomipreguntanomi.getId());	
				formatonomipreguntanomiAux.setVersionRow(this.formatonomipreguntanomi.getVersionRow());	
				formatonomipreguntanomiAux.setid_empresa(this.formatonomipreguntanomi.getid_empresa());	
				formatonomipreguntanomiAux.setid_sucursal(this.formatonomipreguntanomi.getid_sucursal());	
				formatonomipreguntanomiAux.setid_formato_nomi(this.formatonomipreguntanomi.getid_formato_nomi());	
				formatonomipreguntanomiAux.setid_factor_nomi(this.formatonomipreguntanomi.getid_factor_nomi());	
				formatonomipreguntanomiAux.setid_pregunta_nomi(this.formatonomipreguntanomi.getid_pregunta_nomi());	
				formatonomipreguntanomiAux.setponderacion(this.formatonomipreguntanomi.getponderacion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.formatonomipreguntanomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(formatonomipreguntanomiAux,formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formatonomipreguntanomiAux,formatonomipreguntanomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.formatonomipreguntanomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomipreguntanomiLogic.saveFormatoNomiPreguntaNomis();//WithConnection
						//formatonomipreguntanomiLogic.getSetVersionRowFormatoNomiPreguntaNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.formatonomipreguntanomi,formatonomipreguntanomiAux);
					
					this.refrescarForeignKeysDescripcionesFormatoNomiPreguntaNomi();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.formatonomipreguntanomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados().addAll(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleados.addAll(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								formatonomipreguntanomiLogic.saveFormatoNomiPreguntaNomiRelaciones(formatonomipreguntanomiAux,this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados());//WithConnection
								//formatonomipreguntanomiLogic.getSetVersionRowFormatoNomiPreguntaNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.formatonomipreguntanomi,formatonomipreguntanomiAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.setCalificacionEmpleados(new ArrayList<CalificacionEmpleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleados= new ArrayList<CalificacionEmpleado>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							formatonomipreguntanomiAux.setCalificacionEmpleados(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.formatonomipreguntanomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(formatonomipreguntanomiAux,formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(formatonomipreguntanomiAux,formatonomipreguntanomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.formatonomipreguntanomi,formatonomipreguntanomiAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				formatonomipreguntanomiAux=new  FormatoNomiPreguntaNomi();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado() 
					|| (this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado() && this.formatonomipreguntanomi.getId()>=0)) {
						
					formatonomipreguntanomiAux.setIsNew(false);
				}
				
				formatonomipreguntanomiAux.setIsDeleted(false);
			
				formatonomipreguntanomiAux.setId(this.formatonomipreguntanomi.getId());	
				formatonomipreguntanomiAux.setVersionRow(this.formatonomipreguntanomi.getVersionRow());	
				formatonomipreguntanomiAux.setid_empresa(this.formatonomipreguntanomi.getid_empresa());	
				formatonomipreguntanomiAux.setid_sucursal(this.formatonomipreguntanomi.getid_sucursal());	
				formatonomipreguntanomiAux.setid_formato_nomi(this.formatonomipreguntanomi.getid_formato_nomi());	
				formatonomipreguntanomiAux.setid_factor_nomi(this.formatonomipreguntanomi.getid_factor_nomi());	
				formatonomipreguntanomiAux.setid_pregunta_nomi(this.formatonomipreguntanomi.getid_pregunta_nomi());	
				formatonomipreguntanomiAux.setponderacion(this.formatonomipreguntanomi.getponderacion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(formatonomipreguntanomiAux,formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formatonomipreguntanomiAux,formatonomipreguntanomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.formatonomipreguntanomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomipreguntanomiLogic.saveFormatoNomiPreguntaNomis();//WithConnection
						//formatonomipreguntanomiLogic.getSetVersionRowFormatoNomiPreguntaNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.formatonomipreguntanomi,formatonomipreguntanomiAux);
					
					this.refrescarForeignKeysDescripcionesFormatoNomiPreguntaNomi();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.formatonomipreguntanomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados().addAll(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleados.addAll(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								formatonomipreguntanomiLogic.saveFormatoNomiPreguntaNomiRelaciones(formatonomipreguntanomiAux,this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados());//WithConnection
								//formatonomipreguntanomiLogic.getSetVersionRowFormatoNomiPreguntaNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.formatonomipreguntanomi,formatonomipreguntanomiAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.setCalificacionEmpleados(new ArrayList<CalificacionEmpleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleados= new ArrayList<CalificacionEmpleado>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							formatonomipreguntanomiAux.setCalificacionEmpleados(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.formatonomipreguntanomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(formatonomipreguntanomiAux,formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(formatonomipreguntanomiAux,formatonomipreguntanomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.formatonomipreguntanomi,formatonomipreguntanomiAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				formatonomipreguntanomiAux=new  FormatoNomiPreguntaNomi();
				
				formatonomipreguntanomiAux.setIsNew(false);
				formatonomipreguntanomiAux.setIsChanged(false);
				
				formatonomipreguntanomiAux.setIsDeleted(true);
				
				formatonomipreguntanomiAux.setId(this.formatonomipreguntanomi.getId());	
				formatonomipreguntanomiAux.setVersionRow(this.formatonomipreguntanomi.getVersionRow());	
				formatonomipreguntanomiAux.setid_empresa(this.formatonomipreguntanomi.getid_empresa());	
				formatonomipreguntanomiAux.setid_sucursal(this.formatonomipreguntanomi.getid_sucursal());	
				formatonomipreguntanomiAux.setid_formato_nomi(this.formatonomipreguntanomi.getid_formato_nomi());	
				formatonomipreguntanomiAux.setid_factor_nomi(this.formatonomipreguntanomi.getid_factor_nomi());	
				formatonomipreguntanomiAux.setid_pregunta_nomi(this.formatonomipreguntanomi.getid_pregunta_nomi());	
				formatonomipreguntanomiAux.setponderacion(this.formatonomipreguntanomi.getponderacion());	
				
				if(this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.formatonomipreguntanomiAux.getId()>=0) {	
						this.formatonomipreguntanomisEliminados.add(formatonomipreguntanomiAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(formatonomipreguntanomiAux,formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formatonomipreguntanomiAux,formatonomipreguntanomis);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.formatonomipreguntanomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomipreguntanomiLogic.saveFormatoNomiPreguntaNomis();//WithConnection
						//formatonomipreguntanomiLogic.getSetVersionRowFormatoNomiPreguntaNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.formatonomipreguntanomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados().addAll(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleados.addAll(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								formatonomipreguntanomiLogic.saveFormatoNomiPreguntaNomiRelaciones(formatonomipreguntanomiAux,this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados());//WithConnection
								//formatonomipreguntanomiLogic.getSetVersionRowFormatoNomiPreguntaNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.setCalificacionEmpleados(new ArrayList<CalificacionEmpleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleados= new ArrayList<CalificacionEmpleado>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							formatonomipreguntanomiAux.setCalificacionEmpleados(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.formatonomipreguntanomiSessionBean.getEstaModoGuardarRelaciones() 
								|| this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(formatonomipreguntanomiAux,formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(formatonomipreguntanomiAux,formatonomipreguntanomis);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().addAll(this.formatonomipreguntanomisEliminados);
					
					formatonomipreguntanomiLogic.saveFormatoNomiPreguntaNomis();//WithConnection
					//formatonomipreguntanomiLogic.getSetVersionRowFormatoNomiPreguntaNomis();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesFormatoNomiPreguntaNomi();
				
				this.formatonomipreguntanomisEliminados= new ArrayList<FormatoNomiPreguntaNomi>();		
			}
			
			if(this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Formato Nomi Pregunta Nomi GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Formato Nomi Pregunta Nomi",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.formatonomipreguntanomi=formatonomipreguntanomiAux;
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
      		//this.finishProcessFormatoNomiPreguntaNomi();
      	}
		
	}	
	
	public void actualizarRelaciones(FormatoNomiPreguntaNomi formatonomipreguntanomiLocal) throws Exception {
		
		if(this.formatonomipreguntanomiSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				formatonomipreguntanomiLocal.setCalificacionEmpleados(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados());
			
			} else {
			
				formatonomipreguntanomiLocal.setCalificacionEmpleados(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleados);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(FormatoNomiPreguntaNomi formatonomipreguntanomiLocal) throws Exception {	
		if(this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				formatonomipreguntanomiLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				formatonomipreguntanomiLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FormatoNomiDetalleFormJInternalFrame.class)) {
				FormatoNomiBeanSwingJInternalFrame formatonomiBeanSwingJInternalFrameLocal=(FormatoNomiBeanSwingJInternalFrame) ((FormatoNomiDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				formatonomiBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFormatoNomi(formatonomiBeanSwingJInternalFrameLocal.getformatonomi(),true);
				formatonomiBeanSwingJInternalFrameLocal.actualizarLista(formatonomiBeanSwingJInternalFrameLocal.formatonomi,this.formatonomisForeignKey);

				formatonomiBeanSwingJInternalFrameLocal.actualizarRelaciones(formatonomiBeanSwingJInternalFrameLocal.formatonomi);

				formatonomipreguntanomiLocal.setFormatoNomi(formatonomiBeanSwingJInternalFrameLocal.formatonomi);

				this.addItemDefectoCombosForeignKeyFormatoNomi();
				this.cargarCombosFrameFormatoNomisForeignKey("Formulario");
				this.setActualFormatoNomiForeignKey(formatonomiBeanSwingJInternalFrameLocal.formatonomi.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FactorNomiDetalleFormJInternalFrame.class)) {
				FactorNomiBeanSwingJInternalFrame factornomiBeanSwingJInternalFrameLocal=(FactorNomiBeanSwingJInternalFrame) ((FactorNomiDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				factornomiBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFactorNomi(factornomiBeanSwingJInternalFrameLocal.getfactornomi(),true);
				factornomiBeanSwingJInternalFrameLocal.actualizarLista(factornomiBeanSwingJInternalFrameLocal.factornomi,this.factornomisForeignKey);

				factornomiBeanSwingJInternalFrameLocal.actualizarRelaciones(factornomiBeanSwingJInternalFrameLocal.factornomi);

				formatonomipreguntanomiLocal.setFactorNomi(factornomiBeanSwingJInternalFrameLocal.factornomi);

				this.addItemDefectoCombosForeignKeyFactorNomi();
				this.cargarCombosFrameFactorNomisForeignKey("Formulario");
				this.setActualFactorNomiForeignKey(factornomiBeanSwingJInternalFrameLocal.factornomi.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PreguntaNomiDetalleFormJInternalFrame.class)) {
				PreguntaNomiBeanSwingJInternalFrame preguntanomiBeanSwingJInternalFrameLocal=(PreguntaNomiBeanSwingJInternalFrame) ((PreguntaNomiDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				preguntanomiBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPreguntaNomi(preguntanomiBeanSwingJInternalFrameLocal.getpreguntanomi(),true);
				preguntanomiBeanSwingJInternalFrameLocal.actualizarLista(preguntanomiBeanSwingJInternalFrameLocal.preguntanomi,this.preguntanomisForeignKey);

				preguntanomiBeanSwingJInternalFrameLocal.actualizarRelaciones(preguntanomiBeanSwingJInternalFrameLocal.preguntanomi);

				formatonomipreguntanomiLocal.setPreguntaNomi(preguntanomiBeanSwingJInternalFrameLocal.preguntanomi);

				this.addItemDefectoCombosForeignKeyPreguntaNomi();
				this.cargarCombosFramePreguntaNomisForeignKey("Formulario");
				this.setActualPreguntaNomiForeignKey(preguntanomiBeanSwingJInternalFrameLocal.preguntanomi.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarFormatoNomiPreguntaNomiActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = formatonomipreguntanomiValidator.getInvalidValues(this.formatonomipreguntanomi);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(FormatoNomiPreguntaNomi formatonomipreguntanomi,List<FormatoNomiPreguntaNomi> formatonomipreguntanomis) throws Exception {
		try	{		
			FormatoNomiPreguntaNomiConstantesFunciones.actualizarLista(formatonomipreguntanomi,formatonomipreguntanomis,this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(FormatoNomiPreguntaNomi formatonomipreguntanomi,List<FormatoNomiPreguntaNomi> formatonomipreguntanomis) throws Exception {
		try	{			
			FormatoNomiPreguntaNomiConstantesFunciones.actualizarSelectedLista(formatonomipreguntanomi,formatonomipreguntanomis);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<FormatoNomiPreguntaNomi> formatonomipreguntanomisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				formatonomipreguntanomisLocal=this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				formatonomipreguntanomisLocal=this.formatonomipreguntanomis;
			}
			//ARCHITECTURE
		
			for(FormatoNomiPreguntaNomi formatonomipreguntanomiLocal:formatonomipreguntanomisLocal) {
				if(this.permiteMantenimiento(formatonomipreguntanomiLocal) && formatonomipreguntanomiLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+FormatoNomiPreguntaNomiConstantesFunciones.getFormatoNomiPreguntaNomiLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(FormatoNomiPreguntaNomiConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jLabelid_empresaFormatoNomiPreguntaNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormatoNomiPreguntaNomiConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jLabelid_sucursalFormatoNomiPreguntaNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormatoNomiPreguntaNomiConstantesFunciones.IDFORMATONOMI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jLabelid_formato_nomiFormatoNomiPreguntaNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormatoNomiPreguntaNomiConstantesFunciones.IDFACTORNOMI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jLabelid_factor_nomiFormatoNomiPreguntaNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormatoNomiPreguntaNomiConstantesFunciones.IDPREGUNTANOMI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jLabelid_pregunta_nomiFormatoNomiPreguntaNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormatoNomiPreguntaNomiConstantesFunciones.PONDERACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jLabelponderacionFormatoNomiPreguntaNomi,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jLabelid_empresaFormatoNomiPreguntaNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jLabelid_sucursalFormatoNomiPreguntaNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jLabelid_formato_nomiFormatoNomiPreguntaNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jLabelid_factor_nomiFormatoNomiPreguntaNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jLabelid_pregunta_nomiFormatoNomiPreguntaNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jLabelponderacionFormatoNomiPreguntaNomi,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("CalificacionEmpleado")) {
			if(this.formatonomipreguntanomi==null) {
				this.formatonomipreguntanomi= new FormatoNomiPreguntaNomi();
			}

			if(this.formatonomipreguntanomiSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoFormatoNomiPreguntaNomi
				this.setVariablesFormularioToObjetoActualFormatoNomiPreguntaNomi(this.formatonomipreguntanomi,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);

				this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.getcalificacionempleado().setFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoFormatoNomiPreguntaNomi--;	
		
		
		this.formatonomipreguntanomiAux=new FormatoNomiPreguntaNomi();
		
		this.formatonomipreguntanomiAux.setId(this.iIdNuevoFormatoNomiPreguntaNomi);
		this.formatonomipreguntanomiAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().add(this.formatonomipreguntanomiAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.formatonomipreguntanomis.add(this.formatonomipreguntanomiAux);
		}
		//ARCHITECTURE
		
		this.formatonomipreguntanomi=this.formatonomipreguntanomiAux;
		
		if(FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);
			this.setVariablesObjetoActualToFormularioForeignKeyFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);
		}
				
		//this.setDefaultControlesFormatoNomiPreguntaNomi();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyFormatoNomiPreguntaNomi();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyFormatoNomiPreguntaNomi();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyFormatoNomiPreguntaNomi();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFormatoNomiPreguntaNomi(this.formatonomipreguntanomiBean,this.formatonomipreguntanomi,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.formatonomipreguntanomiSessionBean.getConGuardarRelaciones()) {
			classes=FormatoNomiPreguntaNomiConstantesFunciones.getClassesRelationshipsOfFormatoNomiPreguntaNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.formatonomipreguntanomiReturnGeneral=formatonomipreguntanomiLogic.procesarEventosFormatoNomiPreguntaNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis(),this.formatonomipreguntanomi,this.formatonomipreguntanomiParameterGeneral,this.isEsNuevoFormatoNomiPreguntaNomi,classes);//this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomi()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanFormatoNomiPreguntaNomi(this.formatonomipreguntanomiReturnGeneral,this.formatonomipreguntanomiBean,false);
		
		if(this.formatonomipreguntanomiReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyFormatoNomiPreguntaNomi(this.formatonomipreguntanomiReturnGeneral.getFormatoNomiPreguntaNomi());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioFormatoNomiPreguntaNomi(this.formatonomipreguntanomiReturnGeneral.getFormatoNomiPreguntaNomi());
		}
		
		if(this.formatonomipreguntanomiReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioFormatoNomiPreguntaNomi(this.formatonomipreguntanomiReturnGeneral.getFormatoNomiPreguntaNomi(),classes);//this.formatonomipreguntanomiBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualFormatoNomiPreguntaNomi(this.formatonomipreguntanomi,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyFormatoNomiPreguntaNomi();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyFormatoNomiPreguntaNomi();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.RecargarFormFormatoNomiPreguntaNomi(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false);
						
			if(formatonomipreguntanomiSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.getEsGuardarRelacionado() && CalificacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCalificacionEmpleadoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFormatoNomiPreguntaNomi();
			}
			
			this.actualizarVisualTableDatosFormatoNomiPreguntaNomi();
			
			this.jTableDatosFormatoNomiPreguntaNomi.setRowSelectionInterval(this.getIndiceNuevoFormatoNomiPreguntaNomi(), this.getIndiceNuevoFormatoNomiPreguntaNomi());
			
			this.seleccionarFilaTablaFormatoNomiPreguntaNomiActual();
						
			this.actualizarEstadoCeldasBotonesFormatoNomiPreguntaNomi("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesFormatoNomiPreguntaNomi(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jTextFieldponderacionFormatoNomiPreguntaNomi.setEnabled(isHabilitar && this.formatonomipreguntanomiConstantesFunciones.activarponderacionFormatoNomiPreguntaNomi);	
		//
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_empresaFormatoNomiPreguntaNomi.setEnabled(isHabilitar && this.formatonomipreguntanomiConstantesFunciones.activarid_empresaFormatoNomiPreguntaNomi);//
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_sucursalFormatoNomiPreguntaNomi.setEnabled(isHabilitar && this.formatonomipreguntanomiConstantesFunciones.activarid_sucursalFormatoNomiPreguntaNomi);
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_formato_nomiFormatoNomiPreguntaNomi.setEnabled(isHabilitar && this.formatonomipreguntanomiConstantesFunciones.activarid_formato_nomiFormatoNomiPreguntaNomi);
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_factor_nomiFormatoNomiPreguntaNomi.setEnabled(isHabilitar && this.formatonomipreguntanomiConstantesFunciones.activarid_factor_nomiFormatoNomiPreguntaNomi);
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomi.setEnabled(isHabilitar && this.formatonomipreguntanomiConstantesFunciones.activarid_pregunta_nomiFormatoNomiPreguntaNomi);
	};
	
	public void setDefaultControlesFormatoNomiPreguntaNomi() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoFormatoNomiPreguntaNomi(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.formatonomipreguntanomiSessionBean.setConGuardarRelaciones(true);			
			this.formatonomipreguntanomiSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jTabbedPaneRelacionesFormatoNomiPreguntaNomi.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.formatonomipreguntanomiSessionBean.setConGuardarRelaciones(false);			
			this.formatonomipreguntanomiSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jTabbedPaneRelacionesFormatoNomiPreguntaNomi.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoFormatoNomiPreguntaNomi() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormatoNomiPreguntaNomi formatonomipreguntanomiAux:this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis()) {
				if(formatonomipreguntanomiAux.getId().equals(this.iIdNuevoFormatoNomiPreguntaNomi)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormatoNomiPreguntaNomi formatonomipreguntanomiAux:this.formatonomipreguntanomis) {
				if(formatonomipreguntanomiAux.getId().equals(this.iIdNuevoFormatoNomiPreguntaNomi)) {
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
	
	public int getIndiceActualFormatoNomiPreguntaNomi(FormatoNomiPreguntaNomi formatonomipreguntanomi,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormatoNomiPreguntaNomi formatonomipreguntanomiAux:this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis()) {
				if(formatonomipreguntanomiAux.getId().equals(formatonomipreguntanomi.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormatoNomiPreguntaNomi formatonomipreguntanomiAux:this.formatonomipreguntanomis) {
				if(formatonomipreguntanomiAux.getId().equals(formatonomipreguntanomi.getId())) {
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
	
	public void setCamposBaseDesdeOriginalFormatoNomiPreguntaNomi(FormatoNomiPreguntaNomi formatonomipreguntanomiOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormatoNomiPreguntaNomi formatonomipreguntanomiAux:this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis()) {
				if(formatonomipreguntanomiAux.getFormatoNomiPreguntaNomiOriginal().getId().equals(formatonomipreguntanomiOriginal.getId())) {
					existe=true;
					formatonomipreguntanomiOriginal.setId(formatonomipreguntanomiAux.getId());
					formatonomipreguntanomiOriginal.setVersionRow(formatonomipreguntanomiAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormatoNomiPreguntaNomi formatonomipreguntanomiAux:this.formatonomipreguntanomis) {
				if(formatonomipreguntanomiAux.getFormatoNomiPreguntaNomiOriginal().getId().equals(formatonomipreguntanomiOriginal.getId())) {
					existe=true;
					formatonomipreguntanomiOriginal.setId(formatonomipreguntanomiAux.getId());
					formatonomipreguntanomiOriginal.setVersionRow(formatonomipreguntanomiAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosFormatoNomiPreguntaNomi(Boolean esParaCancelar) throws Exception {
		formatonomipreguntanomisAux=new ArrayList<FormatoNomiPreguntaNomi>();
		formatonomipreguntanomiAux=new FormatoNomiPreguntaNomi();
		
		if(!this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FormatoNomiPreguntaNomi formatonomipreguntanomiAux:this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis()) {
					if(formatonomipreguntanomiAux.getId()<0) {
						formatonomipreguntanomisAux.add(formatonomipreguntanomiAux);
					}		
				}
				this.iIdNuevoFormatoNomiPreguntaNomi=0L;
				this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().removeAll(formatonomipreguntanomisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormatoNomiPreguntaNomi formatonomipreguntanomiAux:this.formatonomipreguntanomis) {
					if(formatonomipreguntanomiAux.getId()<0) {
						formatonomipreguntanomisAux.add(formatonomipreguntanomiAux);
					}		
				}
				this.iIdNuevoFormatoNomiPreguntaNomi=0L;
				this.formatonomipreguntanomis.removeAll(formatonomipreguntanomisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoFormatoNomiPreguntaNomi 
					&& this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().size()>0
					) {
					formatonomipreguntanomiAux=this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().get(this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().size() - 1);
				
					if(formatonomipreguntanomiAux.getId()<0) {
						this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().remove(formatonomipreguntanomiAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoFormatoNomiPreguntaNomi && this.formatonomipreguntanomis.size()>0) {
					formatonomipreguntanomiAux=this.formatonomipreguntanomis.get(this.formatonomipreguntanomis.size() - 1);
				
					if(formatonomipreguntanomiAux.getId()<0) {
						this.formatonomipreguntanomis.remove(formatonomipreguntanomiAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoFormatoNomiPreguntaNomi(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(formatonomipreguntanomi.getId()<0) {
				this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().remove(this.formatonomipreguntanomi);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(formatonomipreguntanomi.getId()<0) {
				this.formatonomipreguntanomis.remove(this.formatonomipreguntanomi);
			}
		}			
	}
	
	public void setEstadosInicialesFormatoNomiPreguntaNomi(List<FormatoNomiPreguntaNomi> formatonomipreguntanomisAux) throws Exception {
		FormatoNomiPreguntaNomiConstantesFunciones.setEstadosInicialesFormatoNomiPreguntaNomi(formatonomipreguntanomisAux);
	}
	
	public void setEstadosInicialesFormatoNomiPreguntaNomi(FormatoNomiPreguntaNomi formatonomipreguntanomiAux) throws Exception {
		FormatoNomiPreguntaNomiConstantesFunciones.setEstadosInicialesFormatoNomiPreguntaNomi(formatonomipreguntanomiAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarFormatoNomiPreguntaNomiActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesFormatoNomiPreguntaNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarFormatoNomiPreguntaNomiActual()) {
				if(!this.isEsNuevoFormatoNomiPreguntaNomi) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesFormatoNomiPreguntaNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoFormatoNomiPreguntaNomi=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarFormatoNomiPreguntaNomiActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Formato Nomi Pregunta Nomi ?", "MANTENIMIENTO DE Formato Nomi Pregunta Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesFormatoNomiPreguntaNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(FormatoNomiPreguntaNomi formatonomipreguntanomi) throws Exception {
		FormatoNomiPreguntaNomiConstantesFunciones.seleccionarAsignar(this.formatonomipreguntanomi,formatonomipreguntanomi);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarFormatoNomiPreguntaNomi=this.isPermisoActualizarOriginalFormatoNomiPreguntaNomi;
			
			
			this.seleccionarAsignar(formatonomipreguntanomi);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FormatoNomiPreguntaNomiConstantesFunciones.quitarEspaciosFormatoNomiPreguntaNomi(this.formatonomipreguntanomi,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesFormatoNomiPreguntaNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.formatonomipreguntanomiSessionBean.setsFuncionBusquedaRapida(this.formatonomipreguntanomiSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoFormatoNomiPreguntaNomi) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosFormatoNomiPreguntaNomi(esParaCancelar);				
				this.cancelarNuevoFormatoNomiPreguntaNomi(esParaCancelar);								
			}
			
			this.formatonomipreguntanomi=new FormatoNomiPreguntaNomi();
			
			this.inicializarFormatoNomiPreguntaNomi();
			
			this.actualizarEstadoCeldasBotonesFormatoNomiPreguntaNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarFormatoNomiPreguntaNomi() throws Exception {
		try {
			FormatoNomiPreguntaNomiConstantesFunciones.inicializarFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);
			
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
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteFormatoNomiPreguntaNomis(String sAccionBusqueda,List<FormatoNomiPreguntaNomi> formatonomipreguntanomisParaReportes) throws Exception {
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
					sPathReporteFinal="FormatoNomiPreguntaNomi"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="FormatoNomiPreguntaNomiMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("FormatoNomiPreguntaNomiMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="FormatoNomiPreguntaNomi"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Formato Nomi Pregunta Nomis");		
		parameters.put("busquedapor", FormatoNomiPreguntaNomiConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
					
					FormatoNomiPreguntaNomiLogic formatonomipreguntanomiLogicAuxiliar=new FormatoNomiPreguntaNomiLogic();
					formatonomipreguntanomiLogicAuxiliar.setDatosCliente(formatonomipreguntanomiLogic.getDatosCliente());				
					formatonomipreguntanomiLogicAuxiliar.setFormatoNomiPreguntaNomis(formatonomipreguntanomisParaReportes);
					
					formatonomipreguntanomiLogicAuxiliar.cargarRelacionesLoteForeignKeyFormatoNomiPreguntaNomiWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					formatonomipreguntanomisParaReportes=formatonomipreguntanomiLogicAuxiliar.getFormatoNomiPreguntaNomis();
					
					//formatonomipreguntanomiLogic.getNewConnexionToDeep();
					
					//for (FormatoNomiPreguntaNomi formatonomipreguntanomi:formatonomipreguntanomisParaReportes) {
					//	formatonomipreguntanomiLogic.deepLoad(formatonomipreguntanomi, false, DeepLoadType.INCLUDE, classes);
					//}						
					//formatonomipreguntanomiLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//formatonomipreguntanomiLogic.closeNewConnexionToDeep();
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceFormatoNomiPreguntaNomi=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			FormatoNomiPreguntaNomiConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			FormatoNomiPreguntaNomiConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceFormatoNomiPreguntaNomi=new JRBeanArrayDataSource(FormatoNomiPreguntaNomiJInternalFrame.TraerFormatoNomiPreguntaNomiBeans(formatonomipreguntanomisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceFormatoNomiPreguntaNomi);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+FormatoNomiPreguntaNomiConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(FormatoNomiPreguntaNomiBean.TraerFormatoNomiPreguntaNomiBeans(formatonomipreguntanomisParaReportes).toArray()));
							
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
				this.generarExcelReporteFormatoNomiPreguntaNomis(sAccionBusqueda,sTipoArchivoReporte,formatonomipreguntanomisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalFormatoNomiPreguntaNomis(sAccionBusqueda,sTipoArchivoReporte,formatonomipreguntanomisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoFormatoNomiPreguntaNomiActionPerformed(null);
					//this.generarExcelReporteFormatoNomiPreguntaNomis(sAccionBusqueda,sTipoArchivoReporte,formatonomipreguntanomisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalFormatoNomiPreguntaNomis(sAccionBusqueda,sTipoArchivoReporte,formatonomipreguntanomisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesFormatoNomiPreguntaNomis(sAccionBusqueda,sTipoArchivoReporte,formatonomipreguntanomisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesFormatoNomiPreguntaNomis(sAccionBusqueda,sTipoArchivoReporte,formatonomipreguntanomisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteFormatoNomiPreguntaNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<FormatoNomiPreguntaNomi> formatonomipreguntanomisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formatonomipreguntanomi";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FormatoNomiPreguntaNomis");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFormatoNomiPreguntaNomi("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(FormatoNomiPreguntaNomi formatonomipreguntanomi : formatonomipreguntanomisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			FormatoNomiPreguntaNomiConstantesFunciones.generarExcelReporteDataFormatoNomiPreguntaNomi("NORMAL",row,workbook,formatonomipreguntanomi,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato Nomi Pregunta Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderFormatoNomiPreguntaNomi(String sTipo,Row row,Workbook workbook) {
		
		FormatoNomiPreguntaNomiConstantesFunciones.generarExcelReporteHeaderFormatoNomiPreguntaNomi(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalFormatoNomiPreguntaNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<FormatoNomiPreguntaNomi> formatonomipreguntanomisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formatonomipreguntanomi_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FormatoNomiPreguntaNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(FormatoNomiPreguntaNomi formatonomipreguntanomi : formatonomipreguntanomisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(FormatoNomiPreguntaNomiConstantesFunciones.getFormatoNomiPreguntaNomiDescripcion(formatonomipreguntanomi));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formatonomipreguntanomi.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formatonomipreguntanomi.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFORMATONOMI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFORMATONOMI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formatonomipreguntanomi.getformatonomi_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formatonomipreguntanomi.getfactornomi_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDPREGUNTANOMI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDPREGUNTANOMI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formatonomipreguntanomi.getpreguntanomi_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_PONDERACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_PONDERACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formatonomipreguntanomi.getponderacion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato Nomi Pregunta Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesFormatoNomiPreguntaNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<FormatoNomiPreguntaNomi> formatonomipreguntanomisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<FormatoNomiPreguntaNomi> formatonomipreguntanomisRespaldo=null;
		
		classes=FormatoNomiPreguntaNomiConstantesFunciones.getClassesRelationshipsOfFormatoNomiPreguntaNomi(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.formatonomipreguntanomiLogic.setDatosCliente(this.datosCliente);
		this.formatonomipreguntanomiLogic.setDatosDeep(this.datosDeep);
		this.formatonomipreguntanomiLogic.setIsConDeep(true);
		
		formatonomipreguntanomisRespaldo=this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis();
		
		this.formatonomipreguntanomiLogic.setFormatoNomiPreguntaNomis(formatonomipreguntanomisParaReportes);	
		this.formatonomipreguntanomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		formatonomipreguntanomisParaReportes=this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis();
		this.formatonomipreguntanomiLogic.setFormatoNomiPreguntaNomis(formatonomipreguntanomisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formatonomipreguntanomi_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FormatoNomiPreguntaNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFormatoNomiPreguntaNomi("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(FormatoNomiPreguntaNomi formatonomipreguntanomi : formatonomipreguntanomisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderFormatoNomiPreguntaNomi("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			FormatoNomiPreguntaNomiConstantesFunciones.generarExcelReporteDataFormatoNomiPreguntaNomi("NORMAL",row,workbook,formatonomipreguntanomi,cellStyleDataAux);
		
			
			


				//CalificacionEmpleado
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO))) {

				if(formatonomipreguntanomi.getCalificacionEmpleados()!=null && formatonomipreguntanomi.getCalificacionEmpleados().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CalificacionEmpleadoConstantesFunciones.generarExcelReporteHeaderCalificacionEmpleado("RELACIONADO",row,workbook);
				}

				if(formatonomipreguntanomi.getCalificacionEmpleados()!=null) {
					i2=0;
					for(CalificacionEmpleado calificacionempleado : formatonomipreguntanomi.getCalificacionEmpleados()) {
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
		cell.setCellValue(FormatoNomiPreguntaNomiConstantesFunciones.getFormatoNomiPreguntaNomiDescripcion(formatonomipreguntanomi));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato Nomi Pregunta Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessFormatoNomiPreguntaNomi() throws Exception {		
		this.startProcessFormatoNomiPreguntaNomi(true);
	}
	
	public void startProcessFormatoNomiPreguntaNomi(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi ,this.jPanelParametrosReportesFormatoNomiPreguntaNomi, this.jScrollPanelDatosFormatoNomiPreguntaNomi,this.jPanelPaginacionFormatoNomiPreguntaNomi, this.jScrollPanelDatosEdicionFormatoNomiPreguntaNomi, this.jPanelAccionesFormatoNomiPreguntaNomi,this.jPanelAccionesFormularioFormatoNomiPreguntaNomi,this.jmenuBarFormatoNomiPreguntaNomi,this.jmenuBarDetalleFormatoNomiPreguntaNomi,this.jTtoolBarFormatoNomiPreguntaNomi,this.jTtoolBarDetalleFormatoNomiPreguntaNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasFormatoNomiPreguntaNomi=this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi; 
		
		final JPanel jPanelParametrosReportesFormatoNomiPreguntaNomi=this.jPanelParametrosReportesFormatoNomiPreguntaNomi;
		//final JScrollPane jScrollPanelDatosFormatoNomiPreguntaNomi=this.jScrollPanelDatosFormatoNomiPreguntaNomi;
		final JTable jTableDatosFormatoNomiPreguntaNomi=this.jTableDatosFormatoNomiPreguntaNomi;		
		final JPanel jPanelPaginacionFormatoNomiPreguntaNomi=this.jPanelPaginacionFormatoNomiPreguntaNomi;
		//final JScrollPane jScrollPanelDatosEdicionFormatoNomiPreguntaNomi=this.jScrollPanelDatosEdicionFormatoNomiPreguntaNomi;
		final JPanel jPanelAccionesFormatoNomiPreguntaNomi=this.jPanelAccionesFormatoNomiPreguntaNomi;
		
		JPanel jPanelCamposAuxiliarFormatoNomiPreguntaNomi=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarFormatoNomiPreguntaNomi=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
			jPanelCamposAuxiliarFormatoNomiPreguntaNomi=this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jPanelCamposFormatoNomiPreguntaNomi;
			jPanelAccionesFormularioAuxiliarFormatoNomiPreguntaNomi=this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jPanelAccionesFormularioFormatoNomiPreguntaNomi;
		}
		
		final JPanel jPanelCamposFormatoNomiPreguntaNomi=jPanelCamposAuxiliarFormatoNomiPreguntaNomi;
		final JPanel jPanelAccionesFormularioFormatoNomiPreguntaNomi=jPanelAccionesFormularioAuxiliarFormatoNomiPreguntaNomi;
		
		
		final JMenuBar jmenuBarFormatoNomiPreguntaNomi=this.jmenuBarFormatoNomiPreguntaNomi;
		final JToolBar jTtoolBarFormatoNomiPreguntaNomi=this.jTtoolBarFormatoNomiPreguntaNomi;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarFormatoNomiPreguntaNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFormatoNomiPreguntaNomi=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
			jmenuBarDetalleAuxiliarFormatoNomiPreguntaNomi=this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jmenuBarDetalleFormatoNomiPreguntaNomi;
			jTtoolBarDetalleAuxiliarFormatoNomiPreguntaNomi=this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jTtoolBarDetalleFormatoNomiPreguntaNomi;
		}
		
		final JMenuBar jmenuBarDetalleFormatoNomiPreguntaNomi=jmenuBarDetalleAuxiliarFormatoNomiPreguntaNomi;
		final JToolBar jTtoolBarDetalleFormatoNomiPreguntaNomi=jTtoolBarDetalleAuxiliarFormatoNomiPreguntaNomi;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFormatoNomiPreguntaNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFormatoNomiPreguntaNomi;
			processRunnable.jTableDatos=jTableDatosFormatoNomiPreguntaNomi;
			processRunnable.jPanelCampos=jPanelCamposFormatoNomiPreguntaNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionFormatoNomiPreguntaNomi;
			processRunnable.jPanelAcciones=jPanelAccionesFormatoNomiPreguntaNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFormatoNomiPreguntaNomi;
			
			
			processRunnable.jmenuBar=jmenuBarFormatoNomiPreguntaNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFormatoNomiPreguntaNomi;
			processRunnable.jTtoolBar=jTtoolBarFormatoNomiPreguntaNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFormatoNomiPreguntaNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFormatoNomiPreguntaNomi ,jPanelParametrosReportesFormatoNomiPreguntaNomi,jTableDatosFormatoNomiPreguntaNomi, /*jScrollPanelDatosFormatoNomiPreguntaNomi,*/jPanelCamposFormatoNomiPreguntaNomi,jPanelPaginacionFormatoNomiPreguntaNomi, /*jScrollPanelDatosEdicionFormatoNomiPreguntaNomi,*/ jPanelAccionesFormatoNomiPreguntaNomi,jPanelAccionesFormularioFormatoNomiPreguntaNomi,jmenuBarFormatoNomiPreguntaNomi,jmenuBarDetalleFormatoNomiPreguntaNomi,jTtoolBarFormatoNomiPreguntaNomi,jTtoolBarDetalleFormatoNomiPreguntaNomi);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFormatoNomiPreguntaNomi ,jPanelParametrosReportesFormatoNomiPreguntaNomi, jScrollPanelDatosFormatoNomiPreguntaNomi,jPanelPaginacionFormatoNomiPreguntaNomi, jScrollPanelDatosEdicionFormatoNomiPreguntaNomi, jPanelAccionesFormatoNomiPreguntaNomi,jPanelAccionesFormularioFormatoNomiPreguntaNomi,jmenuBarFormatoNomiPreguntaNomi,jmenuBarDetalleFormatoNomiPreguntaNomi,jTtoolBarFormatoNomiPreguntaNomi,jTtoolBarDetalleFormatoNomiPreguntaNomi);
						
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
	
	public void finishProcessFormatoNomiPreguntaNomi() {// throws Exception 
		this.finishProcessFormatoNomiPreguntaNomi(true);
	}
	
	public void finishProcessFormatoNomiPreguntaNomi(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi ,this.jPanelParametrosReportesFormatoNomiPreguntaNomi, this.jScrollPanelDatosFormatoNomiPreguntaNomi,this.jPanelPaginacionFormatoNomiPreguntaNomi, this.jScrollPanelDatosEdicionFormatoNomiPreguntaNomi, this.jPanelAccionesFormatoNomiPreguntaNomi,this.jPanelAccionesFormularioFormatoNomiPreguntaNomi,this.jmenuBarFormatoNomiPreguntaNomi,this.jmenuBarDetalleFormatoNomiPreguntaNomi,this.jTtoolBarFormatoNomiPreguntaNomi,this.jTtoolBarDetalleFormatoNomiPreguntaNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasFormatoNomiPreguntaNomi=this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi; 
		
		final JPanel jPanelParametrosReportesFormatoNomiPreguntaNomi=this.jPanelParametrosReportesFormatoNomiPreguntaNomi;
		//final JScrollPane jScrollPanelDatosFormatoNomiPreguntaNomi=this.jScrollPanelDatosFormatoNomiPreguntaNomi;
		final JTable jTableDatosFormatoNomiPreguntaNomi=this.jTableDatosFormatoNomiPreguntaNomi;		
		final JPanel jPanelPaginacionFormatoNomiPreguntaNomi=this.jPanelPaginacionFormatoNomiPreguntaNomi;
		//final JScrollPane jScrollPanelDatosEdicionFormatoNomiPreguntaNomi=this.jScrollPanelDatosEdicionFormatoNomiPreguntaNomi;
		final JPanel jPanelAccionesFormatoNomiPreguntaNomi=this.jPanelAccionesFormatoNomiPreguntaNomi;
		
		JPanel jPanelCamposAuxiliarFormatoNomiPreguntaNomi=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarFormatoNomiPreguntaNomi=new JPanel();
		
		if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
			jPanelCamposAuxiliarFormatoNomiPreguntaNomi=this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jPanelCamposFormatoNomiPreguntaNomi;
			jPanelAccionesFormularioAuxiliarFormatoNomiPreguntaNomi=this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jPanelAccionesFormularioFormatoNomiPreguntaNomi;
		}
		
		final JPanel jPanelCamposFormatoNomiPreguntaNomi=jPanelCamposAuxiliarFormatoNomiPreguntaNomi;
		final JPanel jPanelAccionesFormularioFormatoNomiPreguntaNomi=jPanelAccionesFormularioAuxiliarFormatoNomiPreguntaNomi;
		
		
		final JMenuBar jmenuBarFormatoNomiPreguntaNomi=this.jmenuBarFormatoNomiPreguntaNomi;		
		final JToolBar jTtoolBarFormatoNomiPreguntaNomi=this.jTtoolBarFormatoNomiPreguntaNomi;
				
		JMenuBar jmenuBarDetalleAuxiliarFormatoNomiPreguntaNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFormatoNomiPreguntaNomi=new JToolBar();
		
		if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
			jmenuBarDetalleAuxiliarFormatoNomiPreguntaNomi=this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jmenuBarDetalleFormatoNomiPreguntaNomi;
			jTtoolBarDetalleAuxiliarFormatoNomiPreguntaNomi=this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jTtoolBarDetalleFormatoNomiPreguntaNomi;		
		}
		
		final JMenuBar jmenuBarDetalleFormatoNomiPreguntaNomi=jmenuBarDetalleAuxiliarFormatoNomiPreguntaNomi;
		final JToolBar jTtoolBarDetalleFormatoNomiPreguntaNomi=jTtoolBarDetalleAuxiliarFormatoNomiPreguntaNomi;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFormatoNomiPreguntaNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFormatoNomiPreguntaNomi;
			processRunnable.jTableDatos=jTableDatosFormatoNomiPreguntaNomi;
			processRunnable.jPanelCampos=jPanelCamposFormatoNomiPreguntaNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionFormatoNomiPreguntaNomi;
			processRunnable.jPanelAcciones=jPanelAccionesFormatoNomiPreguntaNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFormatoNomiPreguntaNomi;
			
			
			processRunnable.jmenuBar=jmenuBarFormatoNomiPreguntaNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFormatoNomiPreguntaNomi;
			processRunnable.jTtoolBar=jTtoolBarFormatoNomiPreguntaNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFormatoNomiPreguntaNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasFormatoNomiPreguntaNomi ,jPanelParametrosReportesFormatoNomiPreguntaNomi, jTableDatosFormatoNomiPreguntaNomi,/*jScrollPanelDatosFormatoNomiPreguntaNomi,*/jPanelCamposFormatoNomiPreguntaNomi,jPanelPaginacionFormatoNomiPreguntaNomi, /*jScrollPanelDatosEdicionFormatoNomiPreguntaNomi,*/ jPanelAccionesFormatoNomiPreguntaNomi,jPanelAccionesFormularioFormatoNomiPreguntaNomi,jmenuBarFormatoNomiPreguntaNomi,jmenuBarDetalleFormatoNomiPreguntaNomi,jTtoolBarFormatoNomiPreguntaNomi,jTtoolBarDetalleFormatoNomiPreguntaNomi));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesFormatoNomiPreguntaNomi(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarFormatoNomiPreguntaNomi(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuFormatoNomiPreguntaNomi(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarFormatoNomiPreguntaNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarFormatoNomiPreguntaNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleFormatoNomiPreguntaNomi,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuFormatoNomiPreguntaNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarFormatoNomiPreguntaNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleFormatoNomiPreguntaNomi,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.formatonomipreguntanomiConstantesFunciones.getsFinalQueryFormatoNomiPreguntaNomi();
		String  finalQueryPaginacionTodos=this.formatonomipreguntanomiConstantesFunciones.getsFinalQueryFormatoNomiPreguntaNomi();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=FormatoNomiPreguntaNomiConstantesFunciones.getArrayColumnasGlobalesNoFormatoNomiPreguntaNomi(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=FormatoNomiPreguntaNomiConstantesFunciones.getArrayColumnasGlobalesFormatoNomiPreguntaNomi(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,FormatoNomiPreguntaNomiConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.formatonomipreguntanomisEliminados= new ArrayList<FormatoNomiPreguntaNomi>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessFormatoNomiPreguntaNomi();
		
				///*FormatoNomiPreguntaNomiSessionBean*/this.formatonomipreguntanomiSessionBean=new FormatoNomiPreguntaNomiSessionBean();
			
			if(this.formatonomipreguntanomiSessionBean==null) {
				this.formatonomipreguntanomiSessionBean=new FormatoNomiPreguntaNomiSessionBean();
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
					this.iNumeroPaginacion=FormatoNomiPreguntaNomiConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=FormatoNomiPreguntaNomiConstantesFunciones.getClassesForeignKeysOfFormatoNomiPreguntaNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/formatonomipreguntanomi."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			formatonomipreguntanomisAux= new ArrayList<FormatoNomiPreguntaNomi>();
			
				
			formatonomipreguntanomiLogic.setDatosCliente(this.datosCliente);
			formatonomipreguntanomiLogic.setDatosDeep(this.datosDeep);
			formatonomipreguntanomiLogic.setIsConDeep(true);
			
			
			formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomiDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					formatonomipreguntanomiLogic.getTodosFormatoNomiPreguntaNomis(finalQueryGlobal,pagination);
					
					//formatonomipreguntanomiLogic.getTodosFormatoNomiPreguntaNomisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis()==null|| formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							formatonomipreguntanomisAux= new ArrayList<FormatoNomiPreguntaNomi>();
							formatonomipreguntanomisAux.addAll(formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomipreguntanomisAux= new ArrayList<FormatoNomiPreguntaNomi>();
							formatonomipreguntanomisAux.addAll(formatonomipreguntanomis);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							formatonomipreguntanomiLogic.getTodosFormatoNomiPreguntaNomis(finalQueryGlobal+"",this.pagination);												
							
							//formatonomipreguntanomiLogic.getTodosFormatoNomiPreguntaNomisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteFormatoNomiPreguntaNomis("Todos",formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							formatonomipreguntanomiLogic.setFormatoNomiPreguntaNomis(new ArrayList<FormatoNomiPreguntaNomi>());					
							formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().addAll(formatonomipreguntanomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomipreguntanomis=new ArrayList<FormatoNomiPreguntaNomi>();
							formatonomipreguntanomis.addAll(formatonomipreguntanomisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idFormatoNomiPreguntaNomi=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idFormatoNomiPreguntaNomi=this.idActual;
				
				} else if(this.idFormatoNomiPreguntaNomiActual!=null && this.idFormatoNomiPreguntaNomiActual!=0L) {
					idFormatoNomiPreguntaNomi=idFormatoNomiPreguntaNomiActual;
				}
				
					
				this.sDetalleReporte=FormatoNomiPreguntaNomiConstantesFunciones.getDetalleIndicePorId(idFormatoNomiPreguntaNomi);
				
				this.formatonomipreguntanomis=new ArrayList<FormatoNomiPreguntaNomi>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					formatonomipreguntanomiLogic.getEntity(idFormatoNomiPreguntaNomi);
					
					//formatonomipreguntanomiLogic.getEntityWithConnection(idFormatoNomiPreguntaNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatonomipreguntanomiLogic.setFormatoNomiPreguntaNomis(new ArrayList<FormatoNomiPreguntaNomi>());
					formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().add(formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomi());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formatonomipreguntanomis=new ArrayList<FormatoNomiPreguntaNomi>();
					this.formatonomipreguntanomis.add(formatonomipreguntanomi);
				}
				
				if(formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomi()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=FormatoNomiPreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoNomiPreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoNomiPreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis()==null||formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formatonomipreguntanomis==null|| formatonomipreguntanomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomipreguntanomisAux=new ArrayList<FormatoNomiPreguntaNomi>();
						formatonomipreguntanomisAux.addAll(formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomipreguntanomisAux=new ArrayList<FormatoNomiPreguntaNomi>();
							formatonomipreguntanomisAux.addAll(formatonomipreguntanomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoNomiPreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoNomiPreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormatoNomiPreguntaNomis("FK_IdEmpresa",formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormatoNomiPreguntaNomis("FK_IdEmpresa",formatonomipreguntanomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomipreguntanomiLogic.setFormatoNomiPreguntaNomis(new ArrayList<FormatoNomiPreguntaNomi>());
						formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().addAll(formatonomipreguntanomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomipreguntanomis=new ArrayList<FormatoNomiPreguntaNomi>();
							formatonomipreguntanomis.addAll(formatonomipreguntanomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdFactorNomi")) {
				this.sDetalleReporte=FormatoNomiPreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdFactorNomi(id_factor_nomiFK_IdFactorNomi);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomisFK_IdFactorNomi(finalQueryGlobal,pagination,id_factor_nomiFK_IdFactorNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoNomiPreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdFactorNomi(id_factor_nomiFK_IdFactorNomi);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoNomiPreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdFactorNomi(id_factor_nomiFK_IdFactorNomi);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis()==null||formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formatonomipreguntanomis==null|| formatonomipreguntanomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomipreguntanomisAux=new ArrayList<FormatoNomiPreguntaNomi>();
						formatonomipreguntanomisAux.addAll(formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomipreguntanomisAux=new ArrayList<FormatoNomiPreguntaNomi>();
							formatonomipreguntanomisAux.addAll(formatonomipreguntanomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomisFK_IdFactorNomi(finalQueryGlobal,pagination,id_factor_nomiFK_IdFactorNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoNomiPreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdFactorNomi(id_factor_nomiFK_IdFactorNomi);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoNomiPreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdFactorNomi(id_factor_nomiFK_IdFactorNomi);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormatoNomiPreguntaNomis("FK_IdFactorNomi",formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormatoNomiPreguntaNomis("FK_IdFactorNomi",formatonomipreguntanomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomipreguntanomiLogic.setFormatoNomiPreguntaNomis(new ArrayList<FormatoNomiPreguntaNomi>());
						formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().addAll(formatonomipreguntanomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomipreguntanomis=new ArrayList<FormatoNomiPreguntaNomi>();
							formatonomipreguntanomis.addAll(formatonomipreguntanomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdFormatoNomi")) {
				this.sDetalleReporte=FormatoNomiPreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdFormatoNomi(id_formato_nomiFK_IdFormatoNomi);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomisFK_IdFormatoNomi(finalQueryGlobal,pagination,id_formato_nomiFK_IdFormatoNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoNomiPreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdFormatoNomi(id_formato_nomiFK_IdFormatoNomi);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoNomiPreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdFormatoNomi(id_formato_nomiFK_IdFormatoNomi);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis()==null||formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formatonomipreguntanomis==null|| formatonomipreguntanomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomipreguntanomisAux=new ArrayList<FormatoNomiPreguntaNomi>();
						formatonomipreguntanomisAux.addAll(formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomipreguntanomisAux=new ArrayList<FormatoNomiPreguntaNomi>();
							formatonomipreguntanomisAux.addAll(formatonomipreguntanomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomisFK_IdFormatoNomi(finalQueryGlobal,pagination,id_formato_nomiFK_IdFormatoNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoNomiPreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdFormatoNomi(id_formato_nomiFK_IdFormatoNomi);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoNomiPreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdFormatoNomi(id_formato_nomiFK_IdFormatoNomi);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormatoNomiPreguntaNomis("FK_IdFormatoNomi",formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormatoNomiPreguntaNomis("FK_IdFormatoNomi",formatonomipreguntanomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomipreguntanomiLogic.setFormatoNomiPreguntaNomis(new ArrayList<FormatoNomiPreguntaNomi>());
						formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().addAll(formatonomipreguntanomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomipreguntanomis=new ArrayList<FormatoNomiPreguntaNomi>();
							formatonomipreguntanomis.addAll(formatonomipreguntanomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPreguntaNomi")) {
				this.sDetalleReporte=FormatoNomiPreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdPreguntaNomi(id_pregunta_nomiFK_IdPreguntaNomi);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomisFK_IdPreguntaNomi(finalQueryGlobal,pagination,id_pregunta_nomiFK_IdPreguntaNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoNomiPreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdPreguntaNomi(id_pregunta_nomiFK_IdPreguntaNomi);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoNomiPreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdPreguntaNomi(id_pregunta_nomiFK_IdPreguntaNomi);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis()==null||formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formatonomipreguntanomis==null|| formatonomipreguntanomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomipreguntanomisAux=new ArrayList<FormatoNomiPreguntaNomi>();
						formatonomipreguntanomisAux.addAll(formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomipreguntanomisAux=new ArrayList<FormatoNomiPreguntaNomi>();
							formatonomipreguntanomisAux.addAll(formatonomipreguntanomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomisFK_IdPreguntaNomi(finalQueryGlobal,pagination,id_pregunta_nomiFK_IdPreguntaNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoNomiPreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdPreguntaNomi(id_pregunta_nomiFK_IdPreguntaNomi);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoNomiPreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdPreguntaNomi(id_pregunta_nomiFK_IdPreguntaNomi);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormatoNomiPreguntaNomis("FK_IdPreguntaNomi",formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormatoNomiPreguntaNomis("FK_IdPreguntaNomi",formatonomipreguntanomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomipreguntanomiLogic.setFormatoNomiPreguntaNomis(new ArrayList<FormatoNomiPreguntaNomi>());
						formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().addAll(formatonomipreguntanomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomipreguntanomis=new ArrayList<FormatoNomiPreguntaNomi>();
							formatonomipreguntanomis.addAll(formatonomipreguntanomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=FormatoNomiPreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomisFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoNomiPreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoNomiPreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis()==null||formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formatonomipreguntanomis==null|| formatonomipreguntanomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomipreguntanomisAux=new ArrayList<FormatoNomiPreguntaNomi>();
						formatonomipreguntanomisAux.addAll(formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomipreguntanomisAux=new ArrayList<FormatoNomiPreguntaNomi>();
							formatonomipreguntanomisAux.addAll(formatonomipreguntanomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomisFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoNomiPreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoNomiPreguntaNomiConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormatoNomiPreguntaNomis("FK_IdSucursal",formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormatoNomiPreguntaNomis("FK_IdSucursal",formatonomipreguntanomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomipreguntanomiLogic.setFormatoNomiPreguntaNomis(new ArrayList<FormatoNomiPreguntaNomi>());
						formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().addAll(formatonomipreguntanomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomipreguntanomis=new ArrayList<FormatoNomiPreguntaNomi>();
							formatonomipreguntanomis.addAll(formatonomipreguntanomisAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesFormatoNomiPreguntaNomi();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessFormatoNomiPreguntaNomi();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formatonomipreguntanomis.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formatonomipreguntanomis.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(FormatoNomiPreguntaNomi formatonomipreguntanomi) {
		Boolean permite=true;
		
		if(this.formatonomipreguntanomi.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=FormatoNomiPreguntaNomiConstantesFunciones.getOrderByListaFormatoNomiPreguntaNomi();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=FormatoNomiPreguntaNomiConstantesFunciones.getOrderByListaFormatoNomiPreguntaNomi();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormatoNomiPreguntaNomi formatonomipreguntanomi:formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis()) {
				if(formatonomipreguntanomi.getsType().equals(Constantes2.S_TOTALES)) {
					formatonomipreguntanomiTotales=formatonomipreguntanomi;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormatoNomiPreguntaNomi formatonomipreguntanomi:this.formatonomipreguntanomis) {
				if(formatonomipreguntanomi.getsType().equals(Constantes2.S_TOTALES)) {
					formatonomipreguntanomiTotales=formatonomipreguntanomi;
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
			this.formatonomipreguntanomiAux=new FormatoNomiPreguntaNomi();
			this.formatonomipreguntanomiAux.setsType(Constantes2.S_TOTALES);
			this.formatonomipreguntanomiAux.setIsNew(false);
			this.formatonomipreguntanomiAux.setIsChanged(false);
			this.formatonomipreguntanomiAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				FormatoNomiPreguntaNomiConstantesFunciones.TotalizarValoresFilaFormatoNomiPreguntaNomi(this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis(),this.formatonomipreguntanomiAux);
				
				this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().add(this.formatonomipreguntanomiAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				FormatoNomiPreguntaNomiConstantesFunciones.TotalizarValoresFilaFormatoNomiPreguntaNomi(this.formatonomipreguntanomis,this.formatonomipreguntanomiAux);
				
				this.formatonomipreguntanomis.add(this.formatonomipreguntanomiAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		formatonomipreguntanomiTotales=new FormatoNomiPreguntaNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().remove(formatonomipreguntanomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.formatonomipreguntanomis.remove(formatonomipreguntanomiTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		formatonomipreguntanomiTotales=new FormatoNomiPreguntaNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormatoNomiPreguntaNomi formatonomipreguntanomi:formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis()) {
				if(formatonomipreguntanomi.getsType().equals(Constantes2.S_TOTALES)) {
					formatonomipreguntanomiTotales=formatonomipreguntanomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FormatoNomiPreguntaNomiConstantesFunciones.TotalizarValoresFilaFormatoNomiPreguntaNomi(this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis(),formatonomipreguntanomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormatoNomiPreguntaNomi formatonomipreguntanomi:this.formatonomipreguntanomis) {
				if(formatonomipreguntanomi.getsType().equals(Constantes2.S_TOTALES)) {
					formatonomipreguntanomiTotales=formatonomipreguntanomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FormatoNomiPreguntaNomiConstantesFunciones.TotalizarValoresFilaFormatoNomiPreguntaNomi(this.formatonomipreguntanomis,formatonomipreguntanomiTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getFormatoNomiPreguntaNomisFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormatoNomiPreguntaNomisFK_IdFactorNomi()throws Exception {
		try {
			sAccionBusqueda="FK_IdFactorNomi";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormatoNomiPreguntaNomisFK_IdFormatoNomi()throws Exception {
		try {
			sAccionBusqueda="FK_IdFormatoNomi";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormatoNomiPreguntaNomisFK_IdPreguntaNomi()throws Exception {
		try {
			sAccionBusqueda="FK_IdPreguntaNomi";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormatoNomiPreguntaNomisFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getFormatoNomiPreguntaNomisFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomisFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormatoNomiPreguntaNomisFK_IdFactorNomi(String sFinalQuery,Long id_factor_nomi)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomisFK_IdFactorNomi(sFinalQuery,this.pagination,id_factor_nomi);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormatoNomiPreguntaNomisFK_IdFormatoNomi(String sFinalQuery,Long id_formato_nomi)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomisFK_IdFormatoNomi(sFinalQuery,this.pagination,id_formato_nomi);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormatoNomiPreguntaNomisFK_IdPreguntaNomi(String sFinalQuery,Long id_pregunta_nomi)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomisFK_IdPreguntaNomi(sFinalQuery,this.pagination,id_pregunta_nomi);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormatoNomiPreguntaNomisFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomisFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosFormatoNomiPreguntaNomi() {
		this.isPermisoTodoFormatoNomiPreguntaNomi=false;
		this.isPermisoNuevoFormatoNomiPreguntaNomi=false;
		this.isPermisoActualizarFormatoNomiPreguntaNomi=false;
		this.isPermisoActualizarOriginalFormatoNomiPreguntaNomi=false;
		this.isPermisoEliminarFormatoNomiPreguntaNomi=false;
		this.isPermisoGuardarCambiosFormatoNomiPreguntaNomi=false;
		this.isPermisoConsultaFormatoNomiPreguntaNomi=false;
		this.isPermisoBusquedaFormatoNomiPreguntaNomi=false;
		this.isPermisoReporteFormatoNomiPreguntaNomi=false;		
		this.isPermisoOrdenFormatoNomiPreguntaNomi=false;		
		this.isPermisoPaginacionMedioFormatoNomiPreguntaNomi=false;		
		this.isPermisoPaginacionAltoFormatoNomiPreguntaNomi=false;
		this.isPermisoPaginacionTodoFormatoNomiPreguntaNomi=false;
		this.isPermisoCopiarFormatoNomiPreguntaNomi=false;		
		this.isPermisoVerFormFormatoNomiPreguntaNomi=false;		
		this.isPermisoDuplicarFormatoNomiPreguntaNomi=false;		
		this.isPermisoOrdenFormatoNomiPreguntaNomi=false;		
	}
	
	public void setPermisosUsuarioFormatoNomiPreguntaNomi(Boolean isPermiso) {
		this.isPermisoTodoFormatoNomiPreguntaNomi=isPermiso;
		this.isPermisoNuevoFormatoNomiPreguntaNomi=isPermiso;
		this.isPermisoActualizarFormatoNomiPreguntaNomi=isPermiso;
		this.isPermisoActualizarOriginalFormatoNomiPreguntaNomi=isPermiso;
		this.isPermisoEliminarFormatoNomiPreguntaNomi=isPermiso;
		this.isPermisoGuardarCambiosFormatoNomiPreguntaNomi=isPermiso;
		this.isPermisoConsultaFormatoNomiPreguntaNomi=isPermiso;
		this.isPermisoBusquedaFormatoNomiPreguntaNomi=isPermiso;
		this.isPermisoReporteFormatoNomiPreguntaNomi=isPermiso;
		this.isPermisoOrdenFormatoNomiPreguntaNomi=isPermiso;		
		this.isPermisoPaginacionMedioFormatoNomiPreguntaNomi=isPermiso;		
		this.isPermisoPaginacionAltoFormatoNomiPreguntaNomi=isPermiso;		
		this.isPermisoPaginacionTodoFormatoNomiPreguntaNomi=isPermiso;		
		this.isPermisoCopiarFormatoNomiPreguntaNomi=isPermiso;		
		this.isPermisoVerFormFormatoNomiPreguntaNomi=isPermiso;		
		this.isPermisoDuplicarFormatoNomiPreguntaNomi=isPermiso;
		this.isPermisoOrdenFormatoNomiPreguntaNomi=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioFormatoNomiPreguntaNomi(Boolean isPermiso) {
		//this.isPermisoTodoFormatoNomiPreguntaNomi=isPermiso;
		this.isPermisoNuevoFormatoNomiPreguntaNomi=isPermiso;
		this.isPermisoActualizarFormatoNomiPreguntaNomi=isPermiso;
		this.isPermisoActualizarOriginalFormatoNomiPreguntaNomi=isPermiso;
		this.isPermisoEliminarFormatoNomiPreguntaNomi=isPermiso;
		this.isPermisoGuardarCambiosFormatoNomiPreguntaNomi=isPermiso;
		//this.isPermisoConsultaFormatoNomiPreguntaNomi=isPermiso;
		//this.isPermisoBusquedaFormatoNomiPreguntaNomi=isPermiso;
		//this.isPermisoReporteFormatoNomiPreguntaNomi=isPermiso;
		//this.isPermisoOrdenFormatoNomiPreguntaNomi=isPermiso;		
		//this.isPermisoPaginacionMedioFormatoNomiPreguntaNomi=isPermiso;		
		//this.isPermisoPaginacionAltoFormatoNomiPreguntaNomi=isPermiso;		
		//this.isPermisoPaginacionTodoFormatoNomiPreguntaNomi=isPermiso;		
		//this.isPermisoCopiarFormatoNomiPreguntaNomi=isPermiso;		
		//this.isPermisoDuplicarFormatoNomiPreguntaNomi=isPermiso;
		//this.isPermisoOrdenFormatoNomiPreguntaNomi=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioFormatoNomiPreguntaNomiClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(CalificacionEmpleadoConstantesFunciones.SNOMBREOPCION);
		
		if(FormatoNomiPreguntaNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
		this.isTienePermisosCalificacionEmpleado=this.verificarGetPermisosUsuarioOpcionFormatoNomiPreguntaNomiClaseRelacionada(this.opcionsRelacionadas,CalificacionEmpleadoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebFormatoNomiPreguntaNomi(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioFormatoNomiPreguntaNomiClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCalificacionEmpleado=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioFormatoNomiPreguntaNomiClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionFormatoNomiPreguntaNomiClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioFormatoNomiPreguntaNomiClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCalificacionEmpleado && this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null && this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jTabbedPaneRelacionesFormatoNomiPreguntaNomi.remove(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioFormatoNomiPreguntaNomi() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(FormatoNomiPreguntaNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, FormatoNomiPreguntaNomiConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoFormatoNomiPreguntaNomi=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarFormatoNomiPreguntaNomi=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalFormatoNomiPreguntaNomi=this.isPermisoActualizarFormatoNomiPreguntaNomi;
			this.isPermisoEliminarFormatoNomiPreguntaNomi=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosFormatoNomiPreguntaNomi=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaFormatoNomiPreguntaNomi=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaFormatoNomiPreguntaNomi=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoFormatoNomiPreguntaNomi=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteFormatoNomiPreguntaNomi=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFormatoNomiPreguntaNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioFormatoNomiPreguntaNomi=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoFormatoNomiPreguntaNomi=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoFormatoNomiPreguntaNomi=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarFormatoNomiPreguntaNomi=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormFormatoNomiPreguntaNomi=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarFormatoNomiPreguntaNomi=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFormatoNomiPreguntaNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosFormatoNomiPreguntaNomi.setToolTipText(this.jTableDatosFormatoNomiPreguntaNomi.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioFormatoNomiPreguntaNomi(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioFormatoNomiPreguntaNomi(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(FormatoNomiPreguntaNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(FormatoNomiPreguntaNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioFormatoNomiPreguntaNomi() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCalificacionEmpleado && this.formatonomipreguntanomiConstantesFunciones.mostrarCalificacionEmpleadoFormatoNomiPreguntaNomi && !FormatoNomiPreguntaNomiConstantesFunciones.ISGUARDARREL) {

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
	public void inicializarCombosForeignKeyFormatoNomiPreguntaNomiListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.formatonomisForeignKey=new ArrayList();
				this.factornomisForeignKey=new ArrayList();
				this.preguntanomisForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyFormatoNomiPreguntaNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(FormatoNomiPreguntaNomiJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyFormatoNomiPreguntaNomiListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFormatoNomiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFactorNomiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPreguntaNomiListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyPreguntaNomiListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.preguntanomisForeignKey==null||this.preguntanomisForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PreguntaNomiConstantesFunciones.getArrayColumnasGlobalesPreguntaNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PreguntaNomiConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PreguntaNomiConstantesFunciones.SFINALQUERY;

				this.cargarCombosPreguntaNomisForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyFormatoNomiPreguntaNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			FormatoNomiPreguntaNomiParameterReturnGeneral formatonomipreguntanomiReturnGeneral=new FormatoNomiPreguntaNomiParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.formatonomipreguntanomiConstantesFunciones.cargarid_empresaFormatoNomiPreguntaNomi)
					 || (this.esRecargarFks && this.formatonomipreguntanomiConstantesFunciones.cargarid_empresaFormatoNomiPreguntaNomi)) {

					if(!this.formatonomipreguntanomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+formatonomipreguntanomiSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.formatonomipreguntanomiConstantesFunciones.cargarid_sucursalFormatoNomiPreguntaNomi)
					 || (this.esRecargarFks && this.formatonomipreguntanomiConstantesFunciones.cargarid_sucursalFormatoNomiPreguntaNomi)) {

					if(!this.formatonomipreguntanomiSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+formatonomipreguntanomiSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalFormatoNomi="";

				if(((this.formatonomisForeignKey==null||this.formatonomisForeignKey.size()<=0) && this.formatonomipreguntanomiConstantesFunciones.cargarid_formato_nomiFormatoNomiPreguntaNomi)
					 || (this.esRecargarFks && this.formatonomipreguntanomiConstantesFunciones.cargarid_formato_nomiFormatoNomiPreguntaNomi)) {

					if(!this.formatonomipreguntanomiSessionBean.getisBusquedaDesdeForeignKeySesionFormatoNomi()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FormatoNomiConstantesFunciones.getArrayColumnasGlobalesFormatoNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFormatoNomi=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoNomiConstantesFunciones.TABLENAME);

						finalQueryGlobalFormatoNomi=Funciones.GetFinalQueryAppend(finalQueryGlobalFormatoNomi, "");
						finalQueryGlobalFormatoNomi+=FormatoNomiConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFormatoNomisForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFormatoNomi=" WHERE " + ConstantesSql.ID + "="+formatonomipreguntanomiSessionBean.getlidFormatoNomiActual();
					}
				} else {
					finalQueryGlobalFormatoNomi="NONE";
				}


				String finalQueryGlobalFactorNomi="";

				if(((this.factornomisForeignKey==null||this.factornomisForeignKey.size()<=0) && this.formatonomipreguntanomiConstantesFunciones.cargarid_factor_nomiFormatoNomiPreguntaNomi)
					 || (this.esRecargarFks && this.formatonomipreguntanomiConstantesFunciones.cargarid_factor_nomiFormatoNomiPreguntaNomi)) {

					if(!this.formatonomipreguntanomiSessionBean.getisBusquedaDesdeForeignKeySesionFactorNomi()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FactorNomiConstantesFunciones.getArrayColumnasGlobalesFactorNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFactorNomi=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FactorNomiConstantesFunciones.TABLENAME);

						finalQueryGlobalFactorNomi=Funciones.GetFinalQueryAppend(finalQueryGlobalFactorNomi, "");
						finalQueryGlobalFactorNomi+=FactorNomiConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFactorNomisForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFactorNomi=" WHERE " + ConstantesSql.ID + "="+formatonomipreguntanomiSessionBean.getlidFactorNomiActual();
					}
				} else {
					finalQueryGlobalFactorNomi="NONE";
				}


				String finalQueryGlobalPreguntaNomi="";

				if(((this.preguntanomisForeignKey==null||this.preguntanomisForeignKey.size()<=0) && this.formatonomipreguntanomiConstantesFunciones.cargarid_pregunta_nomiFormatoNomiPreguntaNomi)
					 || (this.esRecargarFks && this.formatonomipreguntanomiConstantesFunciones.cargarid_pregunta_nomiFormatoNomiPreguntaNomi)) {

					if(!this.formatonomipreguntanomiSessionBean.getisBusquedaDesdeForeignKeySesionPreguntaNomi()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PreguntaNomiConstantesFunciones.getArrayColumnasGlobalesPreguntaNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPreguntaNomi=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PreguntaNomiConstantesFunciones.TABLENAME);

						finalQueryGlobalPreguntaNomi=Funciones.GetFinalQueryAppend(finalQueryGlobalPreguntaNomi, "");
						finalQueryGlobalPreguntaNomi+=PreguntaNomiConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPreguntaNomisForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPreguntaNomi=" WHERE " + ConstantesSql.ID + "="+formatonomipreguntanomiSessionBean.getlidPreguntaNomiActual();
					}
				} else {
					finalQueryGlobalPreguntaNomi="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				formatonomipreguntanomiReturnGeneral=formatonomipreguntanomiLogic.cargarCombosLoteForeignKeyFormatoNomiPreguntaNomi(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalFormatoNomi,finalQueryGlobalFactorNomi,finalQueryGlobalPreguntaNomi);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=formatonomipreguntanomiReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=formatonomipreguntanomiReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalFormatoNomi.equals("NONE")) {
				this.formatonomisForeignKey=formatonomipreguntanomiReturnGeneral.getformatonomisForeignKey();
			}

			if(!finalQueryGlobalFactorNomi.equals("NONE")) {
				this.factornomisForeignKey=formatonomipreguntanomiReturnGeneral.getfactornomisForeignKey();
			}

			if(!finalQueryGlobalPreguntaNomi.equals("NONE")) {
				this.preguntanomisForeignKey=formatonomipreguntanomiReturnGeneral.getpreguntanomisForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyFormatoNomiPreguntaNomi()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyFormatoNomi();
			this.addItemDefectoCombosForeignKeyFactorNomi();
			this.addItemDefectoCombosForeignKeyPreguntaNomi();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.formatonomipreguntanomiSessionBean==null) {
				this.formatonomipreguntanomiSessionBean=new FormatoNomiPreguntaNomiSessionBean();
			}

			if(!this.formatonomipreguntanomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.formatonomipreguntanomiSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.formatonomipreguntanomiSessionBean.getisBusquedaDesdeForeignKeySesionFormatoNomi()) {
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

			if(!this.formatonomipreguntanomiSessionBean.getisBusquedaDesdeForeignKeySesionFactorNomi()) {
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

	public void addItemDefectoCombosForeignKeyPreguntaNomi()throws Exception {
		try {

			if(!this.formatonomipreguntanomiSessionBean.getisBusquedaDesdeForeignKeySesionPreguntaNomi()) {
				PreguntaNomi preguntanomi=new PreguntaNomi();
				PreguntaNomiConstantesFunciones.setPreguntaNomiDescripcion(preguntanomi,Constantes.SMENSAJE_ESCOJA_OPCION);
				preguntanomi.setId(null);

				if(!PreguntaNomiConstantesFunciones.ExisteEnLista(this.preguntanomisForeignKey,preguntanomi,true)) {

					this.preguntanomisForeignKey.add(0,preguntanomi);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyFormatoNomiPreguntaNomi()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyFormatoNomiPreguntaNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyFormatoNomiPreguntaNomi()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyFormatoNomiPreguntaNomi();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyFormatoNomiPreguntaNomi(FormatoNomiPreguntaNomi formatonomipreguntanomi)throws Exception {	
		try {
			
			this.setActualFormatoNomiForeignKey(formatonomipreguntanomi.getid_formato_nomi(),false,"Formulario");
			this.setActualFactorNomiForeignKey(formatonomipreguntanomi.getid_factor_nomi(),false,"Formulario");
			this.setActualPreguntaNomiForeignKey(formatonomipreguntanomi.getid_pregunta_nomi(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyFormatoNomiPreguntaNomi(FormatoNomiPreguntaNomi formatonomipreguntanomi,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyFormatoNomiPreguntaNomi()throws Exception {	
		try {
			
			this.setActualFormatoNomiForeignKey(this.formatonomipreguntanomiConstantesFunciones.getid_formato_nomi(),false,"Formulario");
			this.setActualFactorNomiForeignKey(this.formatonomipreguntanomiConstantesFunciones.getid_factor_nomi(),false,"Formulario");
			this.setActualPreguntaNomiForeignKey(this.formatonomipreguntanomiConstantesFunciones.getid_pregunta_nomi(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyFormatoNomiPreguntaNomi()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyFormatoNomiPreguntaNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyFormatoNomiPreguntaNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroFormatoNomiPreguntaNomi()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyFormatoNomiPreguntaNomi()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameFormatoNomisForeignKey("Todos");
			this.cargarCombosFrameFactorNomisForeignKey("Todos");
			this.cargarCombosFramePreguntaNomisForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyFormatoNomiPreguntaNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFormatoNomisForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFactorNomisForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePreguntaNomisForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyFormatoNomiPreguntaNomi()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_empresaFormatoNomiPreguntaNomi!=null && this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_empresaFormatoNomiPreguntaNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_empresaFormatoNomiPreguntaNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_sucursalFormatoNomiPreguntaNomi!=null && this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_sucursalFormatoNomiPreguntaNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_sucursalFormatoNomiPreguntaNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_formato_nomiFormatoNomiPreguntaNomi!=null && this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_formato_nomiFormatoNomiPreguntaNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_formato_nomiFormatoNomiPreguntaNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_factor_nomiFormatoNomiPreguntaNomi!=null && this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_factor_nomiFormatoNomiPreguntaNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_factor_nomiFormatoNomiPreguntaNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomi!=null && this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomi.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public FormatoNomiPreguntaNomiBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public FormatoNomiPreguntaNomiBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public FormatoNomiPreguntaNomiBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.formatonomipreguntanomiSessionBean=new FormatoNomiPreguntaNomiSessionBean(); 
		this.formatonomipreguntanomiConstantesFunciones=new FormatoNomiPreguntaNomiConstantesFunciones(); 
		this.formatonomipreguntanomiBean=new FormatoNomiPreguntaNomi();//(this.formatonomipreguntanomiConstantesFunciones); 		
		this.formatonomipreguntanomiReturnGeneral=new FormatoNomiPreguntaNomiParameterReturnGeneral(); 
		
		this.formatonomipreguntanomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formatonomipreguntanomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public FormatoNomiPreguntaNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public FormatoNomiPreguntaNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public FormatoNomiPreguntaNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessFormatoNomiPreguntaNomi(true);
			
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
			
			this.formatonomipreguntanomiConstantesFunciones=new FormatoNomiPreguntaNomiConstantesFunciones(); 
			this.formatonomipreguntanomiBean=new FormatoNomiPreguntaNomi();//this.formatonomipreguntanomiConstantesFunciones); 			
			this.formatonomipreguntanomiReturnGeneral=new FormatoNomiPreguntaNomiParameterReturnGeneral(); 
		
			FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Formato Nomi Pregunta Nomi Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.formatonomipreguntanomi=new FormatoNomiPreguntaNomi();
			this.formatonomipreguntanomis = new ArrayList<FormatoNomiPreguntaNomi>();
			this.formatonomipreguntanomisAux = new ArrayList<FormatoNomiPreguntaNomi>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic=new FormatoNomiPreguntaNomiLogic();
				this.formatonomipreguntanomiLogic.getNewConnexionToDeep("");
			}
			
			//this.formatonomipreguntanomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.formatonomipreguntanomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi);	
					}
					
					if(this.jInternalFrameImportacionFormatoNomiPreguntaNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFormatoNomiPreguntaNomi);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByFormatoNomiPreguntaNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByFormatoNomiPreguntaNomi);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi);
				this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.setVisible(false);
				this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi);
					this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.setVisible(false);
					this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionFormatoNomiPreguntaNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionFormatoNomiPreguntaNomi);
					this.jInternalFrameImportacionFormatoNomiPreguntaNomi.setVisible(false);
					this.jInternalFrameImportacionFormatoNomiPreguntaNomi.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByFormatoNomiPreguntaNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByFormatoNomiPreguntaNomi);
					this.jInternalFrameOrderByFormatoNomiPreguntaNomi.setVisible(false);
					this.jInternalFrameOrderByFormatoNomiPreguntaNomi.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idFormatoNomiPreguntaNomiActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=FormatoNomiPreguntaNomiConstantesFunciones.INUMEROPAGINACION;
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
			
			this.formatonomipreguntanomiReturnGeneral=new FormatoNomiPreguntaNomiParameterReturnGeneral();
			
			this.formatonomipreguntanomiParameterGeneral=new FormatoNomiPreguntaNomiParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.formatonomipreguntanomiLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
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
			
			if(FormatoNomiPreguntaNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(CalificacionEmpleadoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FormatoNomiPreguntaNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado(),this.formatonomipreguntanomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FormatoNomiPreguntaNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado(),this.formatonomipreguntanomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaDuplicarFormatoNomiPreguntaNomi=true;
			this.isVisibilidadCeldaCopiarFormatoNomiPreguntaNomi=true;
			this.isVisibilidadCeldaVerFormFormatoNomiPreguntaNomi=true;
			this.isVisibilidadCeldaOrdenFormatoNomiPreguntaNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaModificarFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaActualizarFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaEliminarFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaCancelarFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaGuardarFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaGuardarCambiosFormatoNomiPreguntaNomi=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdFactorNomi=true;
			this.isVisibilidadFK_IdFormatoNomi=true;
			this.isVisibilidadFK_IdPreguntaNomi=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesFormatoNomiPreguntaNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosFormatoNomiPreguntaNomi();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioFormatoNomiPreguntaNomi(false);
			
			this.setPermisosUsuarioFormatoNomiPreguntaNomi();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado() 
				|| (this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado() && this.formatonomipreguntanomiSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioFormatoNomiPreguntaNomiClasesRelacionadas();
			}
			
			if(this.formatonomipreguntanomiSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioFormatoNomiPreguntaNomiClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosFormatoNomiPreguntaNomi();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualFormatoNomiPreguntaNomi();
			}
			
			if(!this.isPermisoBusquedaFormatoNomiPreguntaNomi) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioFormatoNomiPreguntaNomi,this.isPermisoPaginacionMedioFormatoNomiPreguntaNomi,this.isPermisoPaginacionTodoFormatoNomiPreguntaNomi);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(FormatoNomiPreguntaNomiConstantesFunciones.getTiposSeleccionarFormatoNomiPreguntaNomi());
				
				this.tiposColumnasSelect=FormatoNomiPreguntaNomiConstantesFunciones.getTiposSeleccionarFormatoNomiPreguntaNomi(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectFormatoNomiPreguntaNomi();				
				//this.tiposRelacionesSelect=FormatoNomiPreguntaNomiConstantesFunciones.getTiposRelacionesFormatoNomiPreguntaNomi(true);
				
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
			//if(!this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioFormatoNomiPreguntaNomi();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioFormatoNomiPreguntaNomi(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioFormatoNomiPreguntaNomi(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesFormatoNomiPreguntaNomi() ;
			
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
			this.preguntanomiLogic=new PreguntaNomiLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				formatonomipreguntanomiImplementable= (FormatoNomiPreguntaNomiImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FormatoNomiPreguntaNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				formatonomipreguntanomiImplementableHome= (FormatoNomiPreguntaNomiImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FormatoNomiPreguntaNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.formatonomipreguntanomis= new ArrayList<FormatoNomiPreguntaNomi>();
			this.formatonomipreguntanomisEliminados= new ArrayList<FormatoNomiPreguntaNomi>();
						
			this.isEsNuevoFormatoNomiPreguntaNomi=false;
			this.esParaAccionDesdeFormularioFormatoNomiPreguntaNomi=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.formatonomisForeignKey=new ArrayList<FormatoNomi>() ;
			this.factornomisForeignKey=new ArrayList<FactorNomi>() ;
			this.preguntanomisForeignKey=new ArrayList<PreguntaNomi>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyFormatoNomiPreguntaNomi(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroFormatoNomiPreguntaNomi();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=FormatoNomiPreguntaNomiConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesFormatoNomiPreguntaNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingFormatoNomiPreguntaNomi(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioFormatoNomiPreguntaNomi();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioFormatoNomiPreguntaNomi();
			}
			
			FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.getTabCount(); i++) {
					this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessFormatoNomiPreguntaNomi(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga FormatoNomiPreguntaNomi: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectFormatoNomiPreguntaNomi() {
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
			if(sTipo.equals("RelacionesFormatoNomiPreguntaNomi")) {
				iIndex=this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jTabbedPaneRelacionesFormatoNomiPreguntaNomi.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jTabbedPaneRelacionesFormatoNomiPreguntaNomi.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();	
				
				

				if(sTitle.equals("Calificacion Empleados")) {
					if(!CalificacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessFormatoNomiPreguntaNomi();

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
				this.finishProcessFormatoNomiPreguntaNomi();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCalificacionEmpleado(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.cargarSessionConBeanSwingJInternalFrameCalificacionEmpleado(false,true,iIndex);
		this.jButtonCalificacionEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCalificacionEmpleado();

		//this.jTabbedPaneRelacionesFormatoNomiPreguntaNomi.updateUI();
		//this.jTabbedPaneRelacionesFormatoNomiPreguntaNomi.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesFormatoNomiPreguntaNomi.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("CalificacionEmpleado")) {
				int row=this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();
				jButtonCalificacionEmpleadoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Calificacion Empleado")) {

					if(this.isTienePermisosCalificacionEmpleado && this.formatonomipreguntanomiConstantesFunciones.mostrarCalificacionEmpleadoFormatoNomiPreguntaNomi && !FormatoNomiPreguntaNomiConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Calificacion Empleados"+"("+CalificacionEmpleadoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Calificacion Empleados");

						if(formatonomipreguntanomiConstantesFunciones.resaltarCalificacionEmpleadoFormatoNomiPreguntaNomi!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(formatonomipreguntanomiConstantesFunciones.resaltarCalificacionEmpleadoFormatoNomiPreguntaNomi);
						}

						jmenuItem.setEnabled(this.formatonomipreguntanomiConstantesFunciones.activarCalificacionEmpleadoFormatoNomiPreguntaNomi);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"CalificacionEmpleado"));

						

						this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jmenuDetalleFormatoNomiPreguntaNomi.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyFormatoNomiPreguntaNomi(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyFormatoNomiPreguntaNomi(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyFormatoNomiPreguntaNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyFormatoNomiPreguntaNomiListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyFormatoNomiPreguntaNomi();
		
		this.cargarCombosFrameForeignKeyFormatoNomiPreguntaNomi();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyFormatoNomiPreguntaNomi();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyFormatoNomiPreguntaNomi();
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

	public void cargarCombosForeignKeyPreguntaNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPreguntaNomiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPreguntaNomi();
				this.cargarCombosFramePreguntaNomisForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPreguntaNomi(this.preguntanomisForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoFormatoNomiPreguntaNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.formatonomipreguntanomiSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
			
			
			if(jTableDatosFormatoNomiPreguntaNomi.getRowCount()>=1) {
				jTableDatosFormatoNomiPreguntaNomi.removeRowSelectionInterval(0, jTableDatosFormatoNomiPreguntaNomi.getRowCount()-1);						
			}
			
			this.isEsNuevoFormatoNomiPreguntaNomi=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoFormatoNomiPreguntaNomi(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesFormatoNomiPreguntaNomi(true);			
			//this.formatonomipreguntanomi=new FormatoNomiPreguntaNomi();
			//this.formatonomipreguntanomi.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFormatoNomiPreguntaNomi(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormatoNomiPreguntaNomi() ;
			
			if(FormatoNomiPreguntaNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFormatoNomiPreguntaNomi(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.formatonomipreguntanomi);	
			this.actualizarInformacion("INFO_PADRE",false,this.formatonomipreguntanomi);				
			
			FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
			
			if(this.formatonomipreguntanomiSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar FormatoNomiPreguntaNomi: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarFormatoNomiPreguntaNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<FormatoNomiPreguntaNomi> formatonomipreguntanomisSeleccionados=new ArrayList<FormatoNomiPreguntaNomi>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRows().length;			
			}
			
			formatonomipreguntanomisSeleccionados=this.getFormatoNomiPreguntaNomisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoFormatoNomiPreguntaNomi--;			
				//FormatoNomiPreguntaNomi formatonomipreguntanomiAux= new FormatoNomiPreguntaNomi();			
				//formatonomipreguntanomiAux.setId(this.iIdNuevoFormatoNomiPreguntaNomi);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//FormatoNomiPreguntaNomi formatonomipreguntanomiOrigen=new FormatoNomiPreguntaNomi();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(FormatoNomiPreguntaNomi formatonomipreguntanomiOrigen : formatonomipreguntanomisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							formatonomipreguntanomiOrigen =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomipreguntanomiOrigen =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaFormatoNomiPreguntaNomi();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.formatonomipreguntanomi.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosFormatoNomiPreguntaNomi(formatonomipreguntanomiOrigen,this.formatonomipreguntanomi,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().add(this.formatonomipreguntanomiAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.formatonomipreguntanomis.add(this.formatonomipreguntanomiAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaFormatoNomiPreguntaNomi(false);
				
				this.jTableDatosFormatoNomiPreguntaNomi.setRowSelectionInterval(this.getIndiceNuevoFormatoNomiPreguntaNomi(), this.getIndiceNuevoFormatoNomiPreguntaNomi());
				
				int iLastRow =  this.jTableDatosFormatoNomiPreguntaNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFormatoNomiPreguntaNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFormatoNomiPreguntaNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFormatoNomiPreguntaNomi(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarFormatoNomiPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<FormatoNomiPreguntaNomi> formatonomipreguntanomisSeleccionados=new ArrayList<FormatoNomiPreguntaNomi>();									
		
			FormatoNomiPreguntaNomi formatonomipreguntanomiOrigen=new FormatoNomiPreguntaNomi();
			FormatoNomiPreguntaNomi formatonomipreguntanomiDestino=new FormatoNomiPreguntaNomi();
				
			formatonomipreguntanomisSeleccionados=this.getFormatoNomiPreguntaNomisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || formatonomipreguntanomisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomipreguntanomiOrigen =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						formatonomipreguntanomiOrigen =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomipreguntanomiDestino =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						formatonomipreguntanomiDestino =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				formatonomipreguntanomiOrigen =formatonomipreguntanomisSeleccionados.get(0);
				formatonomipreguntanomiDestino =formatonomipreguntanomisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosFormatoNomiPreguntaNomi(formatonomipreguntanomiOrigen,formatonomipreguntanomiDestino,true,false);
				
				formatonomipreguntanomiDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(formatonomipreguntanomiDestino,formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formatonomipreguntanomiDestino,formatonomipreguntanomis);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaFormatoNomiPreguntaNomi(false);
				
				//this.jTableDatosFormatoNomiPreguntaNomi.setRowSelectionInterval(this.getIndiceNuevoFormatoNomiPreguntaNomi(), this.getIndiceNuevoFormatoNomiPreguntaNomi());
				
				int iLastRow =  this.jTableDatosFormatoNomiPreguntaNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFormatoNomiPreguntaNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFormatoNomiPreguntaNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFormatoNomiPreguntaNomi(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormFormatoNomiPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarFormatoNomiPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesFormatoNomiPreguntaNomi.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesFormatoNomiPreguntaNomi.setVisible(!isVisible);
			this.jPanelPaginacionFormatoNomiPreguntaNomi.setVisible(!isVisible);
			this.jPanelAccionesFormatoNomiPreguntaNomi.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarFormatoNomiPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameFormatoNomiPreguntaNomi();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoFormatoNomiPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoFormatoNomiPreguntaNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionFormatoNomiPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionFormatoNomiPreguntaNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByFormatoNomiPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByFormatoNomiPreguntaNomi();
			
			this.abrirFrameOrderByFormatoNomiPreguntaNomi();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByFormatoNomiPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByFormatoNomiPreguntaNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleFormatoNomiPreguntaNomi(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormFormatoNomiPreguntaNomi);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.isMaximum()) {
					this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.setSize(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.iWidthFormulario,this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.isMaximum()) {
						this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jContentPaneDetalleFormatoNomiPreguntaNomi.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jTabbedPaneRelacionesFormatoNomiPreguntaNomi.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jContentPaneDetalleFormatoNomiPreguntaNomi.getWidth(),FormatoNomiPreguntaNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jTabbedPaneRelacionesFormatoNomiPreguntaNomi.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jContentPaneDetalleFormatoNomiPreguntaNomi.getWidth(),FormatoNomiPreguntaNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jTabbedPaneRelacionesFormatoNomiPreguntaNomi.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jContentPaneDetalleFormatoNomiPreguntaNomi.getWidth(),FormatoNomiPreguntaNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(CalificacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCalificacionEmpleado();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.setVisible(true);
	        this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByFormatoNomiPreguntaNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByFormatoNomiPreguntaNomi==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByFormatoNomiPreguntaNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormatoNomiPreguntaNomi,false,this);
				} else {
					this.jInternalFrameOrderByFormatoNomiPreguntaNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormatoNomiPreguntaNomi,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByFormatoNomiPreguntaNomi);
				this.jInternalFrameOrderByFormatoNomiPreguntaNomi.setVisible(false);
				this.jInternalFrameOrderByFormatoNomiPreguntaNomi.setSelected(false);
				
				this.jInternalFrameOrderByFormatoNomiPreguntaNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFormatoNomiPreguntaNomi"));
				
				this.inicializarActualizarBindingTablaOrderByFormatoNomiPreguntaNomi();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionFormatoNomiPreguntaNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionFormatoNomiPreguntaNomi==null) {
				
				this.jInternalFrameImportacionFormatoNomiPreguntaNomi=new ImportacionJInternalFrame(FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFormatoNomiPreguntaNomi);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionFormatoNomiPreguntaNomi);
				this.jInternalFrameImportacionFormatoNomiPreguntaNomi.setVisible(false);
				this.jInternalFrameImportacionFormatoNomiPreguntaNomi.setSelected(false);


				this.jInternalFrameImportacionFormatoNomiPreguntaNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFormatoNomiPreguntaNomi"));
				this.jInternalFrameImportacionFormatoNomiPreguntaNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFormatoNomiPreguntaNomi"));
				this.jInternalFrameImportacionFormatoNomiPreguntaNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFormatoNomiPreguntaNomi"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoFormatoNomiPreguntaNomi() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi==null) {
				this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi=new ReporteDinamicoJInternalFrame(FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi);
				this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.setVisible(false);
				this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFormatoNomiPreguntaNomi"));
				this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFormatoNomiPreguntaNomi"));
				this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFormatoNomiPreguntaNomi"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFormatoNomiPreguntaNomi();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCalificacionEmpleado() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.jScrollPanelDatosCalificacionEmpleado.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jContentPaneDetalleFormatoNomiPreguntaNomi.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.jScrollPanelDatosCalificacionEmpleado.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.jScrollPanelDatosCalificacionEmpleado.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.jScrollPanelDatosCalificacionEmpleado.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleFormatoNomiPreguntaNomi() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormFormatoNomiPreguntaNomi);
			
	       	this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.setVisible(false);
	        this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.setSelected(false);
			
			//this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.dispose();
			//this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoFormatoNomiPreguntaNomi() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.setVisible(true);
	        this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionFormatoNomiPreguntaNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionFormatoNomiPreguntaNomi.setVisible(true);
	        this.jInternalFrameImportacionFormatoNomiPreguntaNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByFormatoNomiPreguntaNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByFormatoNomiPreguntaNomi.setVisible(true);
	        this.jInternalFrameOrderByFormatoNomiPreguntaNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByFormatoNomiPreguntaNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByFormatoNomiPreguntaNomi.setVisible(false);
	        this.jInternalFrameOrderByFormatoNomiPreguntaNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoFormatoNomiPreguntaNomi() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.setVisible(false);
	        this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionFormatoNomiPreguntaNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionFormatoNomiPreguntaNomi.setVisible(false);
	        this.jInternalFrameImportacionFormatoNomiPreguntaNomi.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarFormatoNomiPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarFormatoNomiPreguntaNomi(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarFormatoNomiPreguntaNomi(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesFormatoNomiPreguntaNomi(true);
			//this.isEsNuevoFormatoNomiPreguntaNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesFormatoNomiPreguntaNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFormatoNomiPreguntaNomi(false) ;
			
			if(formatonomipreguntanomiSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.getEsGuardarRelacionado() && CalificacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCalificacionEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(FormatoNomiPreguntaNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFormatoNomiPreguntaNomi(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormatoNomiPreguntaNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaFormatoNomiPreguntaNomiActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarFormatoNomiPreguntaNomi(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesFormatoNomiPreguntaNomi(true);
			//this.isEsNuevoFormatoNomiPreguntaNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.formatonomipreguntanomi.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesFormatoNomiPreguntaNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesFormatoNomiPreguntaNomi(false) ;
			
			if(FormatoNomiPreguntaNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFormatoNomiPreguntaNomi(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormatoNomiPreguntaNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaFormatoNomi(List<FormatoNomi> formatonomisForeignKey)throws Exception{
		TableColumn tableColumnFormatoNomi=this.jTableDatosFormatoNomiPreguntaNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomiPreguntaNomi,FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFORMATONOMI));
		TableCellEditor tableCellEditorFormatoNomi =tableColumnFormatoNomi.getCellEditor();

		FormatoNomiTableCell formatonomiTableCellFk=(FormatoNomiTableCell)tableCellEditorFormatoNomi;

		if(formatonomiTableCellFk!=null) {
			formatonomiTableCellFk.setformatonomisForeignKey(formatonomisForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();

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
		TableColumn tableColumnFactorNomi=this.jTableDatosFormatoNomiPreguntaNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomiPreguntaNomi,FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI));
		TableCellEditor tableCellEditorFactorNomi =tableColumnFactorNomi.getCellEditor();

		FactorNomiTableCell factornomiTableCellFk=(FactorNomiTableCell)tableCellEditorFactorNomi;

		if(factornomiTableCellFk!=null) {
			factornomiTableCellFk.setfactornomisForeignKey(factornomisForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();

		//if(intSelectedRow<=0) {
			//factornomiTableCellFk.setRowActual(intSelectedRow);
			//factornomiTableCellFk.setfactornomisForeignKeyActual(factornomisForeignKey);
		//}


		if(factornomiTableCellFk!=null) {
			factornomiTableCellFk.RecargarFactorNomisForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPreguntaNomi(List<PreguntaNomi> preguntanomisForeignKey)throws Exception{
		TableColumn tableColumnPreguntaNomi=this.jTableDatosFormatoNomiPreguntaNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomiPreguntaNomi,FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDPREGUNTANOMI));
		TableCellEditor tableCellEditorPreguntaNomi =tableColumnPreguntaNomi.getCellEditor();

		PreguntaNomiTableCell preguntanomiTableCellFk=(PreguntaNomiTableCell)tableCellEditorPreguntaNomi;

		if(preguntanomiTableCellFk!=null) {
			preguntanomiTableCellFk.setpreguntanomisForeignKey(preguntanomisForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();

		//if(intSelectedRow<=0) {
			//preguntanomiTableCellFk.setRowActual(intSelectedRow);
			//preguntanomiTableCellFk.setpreguntanomisForeignKeyActual(preguntanomisForeignKey);
		//}


		if(preguntanomiTableCellFk!=null) {
			preguntanomiTableCellFk.RecargarPreguntaNomisForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarFormatoNomiPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesFormatoNomiPreguntaNomi(false);
			
			//if(!this.isEsNuevoFormatoNomiPreguntaNomi) {								
				int intSelectedRow = this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualFormatoNomiPreguntaNomi(this.formatonomipreguntanomi,true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);
				
			}
			
			if(this.permiteMantenimiento(this.formatonomipreguntanomi)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoFormatoNomiPreguntaNomi=true;
					this.inicializarActualizarBindingTablaFormatoNomiPreguntaNomi(false);
					this.isEsNuevoFormatoNomiPreguntaNomi=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoFormatoNomiPreguntaNomi=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoFormatoNomiPreguntaNomi=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFormatoNomiPreguntaNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFormatoNomiPreguntaNomi(false);
				
				this.habilitarDeshabilitarControlesFormatoNomiPreguntaNomi(false);
			
												
				
				if(FormatoNomiPreguntaNomiJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleFormatoNomiPreguntaNomi();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoFormatoNomiPreguntaNomiActionPerformed(evt,formatonomipreguntanomiSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualFormatoNomiPreguntaNomi(this.formatonomipreguntanomi,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosFormatoNomiPreguntaNomi.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,formatonomipreguntanomiSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.formatonomipreguntanomi.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(FormatoNomiPreguntaNomi.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomiPreguntaNomi.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarFormatoNomiPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				this.formatonomipreguntanomi.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				this.formatonomipreguntanomi.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.formatonomipreguntanomi)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((FormatoNomiPreguntaNomiModel) this.jTableDatosFormatoNomiPreguntaNomi.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoFormatoNomiPreguntaNomi=true;
				this.inicializarActualizarBindingTablaFormatoNomiPreguntaNomi(false);
				this.isEsNuevoFormatoNomiPreguntaNomi=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFormatoNomiPreguntaNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFormatoNomiPreguntaNomi(false);
				
				this.habilitarDeshabilitarControlesFormatoNomiPreguntaNomi(false);
				
				
				
				if(FormatoNomiPreguntaNomiJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleFormatoNomiPreguntaNomi();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarFormatoNomiPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosFormatoNomiPreguntaNomi.getRowCount()>=1) {
				jTableDatosFormatoNomiPreguntaNomi.removeRowSelectionInterval(0, jTableDatosFormatoNomiPreguntaNomi.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesFormatoNomiPreguntaNomi(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaFormatoNomiPreguntaNomi(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFormatoNomiPreguntaNomi(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormatoNomiPreguntaNomi(false) ;
			
			this.isEsNuevoFormatoNomiPreguntaNomi=false;
			
			if(FormatoNomiPreguntaNomiJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleFormatoNomiPreguntaNomi();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosFormatoNomiPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false);
				
				//SI ES MANUAL
				if(FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualFormatoNomiPreguntaNomi();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosFormatoNomiPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoFormatoNomiPreguntaNomi--;			
			//FormatoNomiPreguntaNomi formatonomipreguntanomiAux= new FormatoNomiPreguntaNomi();			
			//formatonomipreguntanomiAux.setId(this.iIdNuevoFormatoNomiPreguntaNomi);
			
			if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaFormatoNomiPreguntaNomi();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);
			
			this.formatonomipreguntanomi.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().add(this.formatonomipreguntanomiAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.formatonomipreguntanomis.add(this.formatonomipreguntanomiAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaFormatoNomiPreguntaNomi(false);
			
			this.jTableDatosFormatoNomiPreguntaNomi.setRowSelectionInterval(this.getIndiceNuevoFormatoNomiPreguntaNomi(), this.getIndiceNuevoFormatoNomiPreguntaNomi());
			
			int iLastRow =  this.jTableDatosFormatoNomiPreguntaNomi.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosFormatoNomiPreguntaNomi.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosFormatoNomiPreguntaNomi.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaFormatoNomiPreguntaNomi(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionFormatoNomiPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false);
			
			//SI ES MANUAL
			if(FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFormatoNomiPreguntaNomi();
			}
			
			//this.abrirFrameTreeFormatoNomiPreguntaNomi();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionFormatoNomiPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Formato Nomi Pregunta NomiS ?", "MANTENIMIENTO DE Formato Nomi Pregunta Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionFormatoNomiPreguntaNomi.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralFormatoNomiPreguntaNomi();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.formatonomipreguntanomiReturnGeneral=formatonomipreguntanomiLogic.procesarImportacionFormatoNomiPreguntaNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.formatonomipreguntanomiParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarFormatoNomiPreguntaNomiReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionFormatoNomiPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionFormatoNomiPreguntaNomi.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionFormatoNomiPreguntaNomi.setFileImportacion(this.jInternalFrameImportacionFormatoNomiPreguntaNomi.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionFormatoNomiPreguntaNomi.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionFormatoNomiPreguntaNomi.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionFormatoNomiPreguntaNomi.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionFormatoNomiPreguntaNomi.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoFormatoNomiPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<FormatoNomiPreguntaNomi> formatonomipreguntanomisSeleccionados=new ArrayList<FormatoNomiPreguntaNomi>();		

		formatonomipreguntanomisSeleccionados=this.getFormatoNomiPreguntaNomisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("FormatoNomiPreguntaNomiBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"FormatoNomiPreguntaNomiBaseDesign.jrxml";
			
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
			
			this.generarReporteFormatoNomiPreguntaNomis("Todos",formatonomipreguntanomisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato Nomi Pregunta Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFORMATONOMI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_FormatoNomi_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_FormatoNomi_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_FormatoNomi_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_FormatoNomi_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_FactorNomi_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_FactorNomi_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_FactorNomi_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_FactorNomi_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDPREGUNTANOMI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_PreguntaNomi_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_PreguntaNomi_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_PreguntaNomi_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_PreguntaNomi_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormatoNomiPreguntaNomiConstantesFunciones.LABEL_PONDERACION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nderacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nderacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nderacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nderacion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFORMATONOMI:
					sNombreCampoCategoria="id_formato_nomi";
					break;

				case FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI:
					sNombreCampoCategoria="id_factor_nomi";
					break;

				case FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDPREGUNTANOMI:
					sNombreCampoCategoria="id_pregunta_nomi";
					break;

				case FormatoNomiPreguntaNomiConstantesFunciones.LABEL_PONDERACION:
					sNombreCampoCategoria="ponderacion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFORMATONOMI:
					sNombreCampoCategoriaValor="id_formato_nomi";
					break;

				case FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI:
					sNombreCampoCategoriaValor="id_factor_nomi";
					break;

				case FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDPREGUNTANOMI:
					sNombreCampoCategoriaValor="id_pregunta_nomi";
					break;

				case FormatoNomiPreguntaNomiConstantesFunciones.LABEL_PONDERACION:
					sNombreCampoCategoriaValor="ponderacion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFORMATONOMI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Formato Nomi",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_formato_nomi");
					break;

				case FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Factor Nomi",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_factor_nomi");
					break;

				case FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDPREGUNTANOMI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pregunta Nomi",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pregunta_nomi");
					break;

				case FormatoNomiPreguntaNomiConstantesFunciones.LABEL_PONDERACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ponderacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ponderacion");
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
	
	public void jButtonGenerarExcelReporteDinamicoFormatoNomiPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<FormatoNomiPreguntaNomi> formatonomipreguntanomisSeleccionados=new ArrayList<FormatoNomiPreguntaNomi>();		
		
		formatonomipreguntanomisSeleccionados=this.getFormatoNomiPreguntaNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formatonomipreguntanomi";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("FormatoNomiPreguntaNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(FormatoNomiPreguntaNomi formatonomipreguntanomi:formatonomipreguntanomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formatonomipreguntanomi.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(FormatoNomiPreguntaNomi formatonomipreguntanomi:formatonomipreguntanomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formatonomipreguntanomi.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFORMATONOMI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFORMATONOMI);
					iRow++;

					for(FormatoNomiPreguntaNomi formatonomipreguntanomi:formatonomipreguntanomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formatonomipreguntanomi.getformatonomi_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI);
					iRow++;

					for(FormatoNomiPreguntaNomi formatonomipreguntanomi:formatonomipreguntanomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formatonomipreguntanomi.getfactornomi_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDPREGUNTANOMI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDPREGUNTANOMI);
					iRow++;

					for(FormatoNomiPreguntaNomi formatonomipreguntanomi:formatonomipreguntanomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formatonomipreguntanomi.getpreguntanomi_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormatoNomiPreguntaNomiConstantesFunciones.LABEL_PONDERACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_PONDERACION);
					iRow++;

					for(FormatoNomiPreguntaNomi formatonomipreguntanomi:formatonomipreguntanomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formatonomipreguntanomi.getponderacion());
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
			//	this.getFilaCabeceraExportarExcelFormatoNomiPreguntaNomi(row);				
			//	iRow++;
			//}				
			
			//for(FormatoNomiPreguntaNomi formatonomipreguntanomiAux:formatonomipreguntanomisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelFormatoNomiPreguntaNomi(formatonomipreguntanomiAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato Nomi Pregunta Nomi",JOptionPane.INFORMATION_MESSAGE);
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
				this.formatonomipreguntanomiLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false);
			
			//SI ES MANUAL
			if(FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFormatoNomiPreguntaNomi();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresFormatoNomiPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false);
			
			//SI ES MANUAL
			if(FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFormatoNomiPreguntaNomi();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesFormatoNomiPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false);
			
			//SI ES MANUAL
			if(FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFormatoNomiPreguntaNomi();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaFormatoNomiPreguntaNomi() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosFormatoNomiPreguntaNomi.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosFormatoNomiPreguntaNomi.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosFormatoNomiPreguntaNomi.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosFormatoNomiPreguntaNomi.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosFormatoNomiPreguntaNomi.setMinimumSize(dimensionMinimum);
		this.jTableDatosFormatoNomiPreguntaNomi.setMaximumSize(dimensionMaximum);
		this.jTableDatosFormatoNomiPreguntaNomi.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingFormatoNomiPreguntaNomi(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingFormatoNomiPreguntaNomi(esInicializar,true);
	}
	
	public void inicializarActualizarBindingFormatoNomiPreguntaNomi(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaFormatoNomiPreguntaNomi(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesFormatoNomiPreguntaNomi(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasFormatoNomiPreguntaNomi(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFormatoNomiPreguntaNomi(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesFormatoNomiPreguntaNomi(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualFormatoNomiPreguntaNomi() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaFormatoNomiPreguntaNomi();
		
		this.inicializarActualizarBindingBotonesManualFormatoNomiPreguntaNomi(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualFormatoNomiPreguntaNomi();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFormatoNomiPreguntaNomi() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualFormatoNomiPreguntaNomi(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualFormatoNomiPreguntaNomi(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosFormatoNomiPreguntaNomi.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosFormatoNomiPreguntaNomi.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteFormatoNomiPreguntaNomi.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jCheckBoxPostAccionNuevoFormatoNomiPreguntaNomi.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jCheckBoxPostAccionSinCerrarFormatoNomiPreguntaNomi.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jCheckBoxPostAccionSinMensajeFormatoNomiPreguntaNomi.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosFormatoNomiPreguntaNomi.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosFormatoNomiPreguntaNomi.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteFormatoNomiPreguntaNomi.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
				this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jCheckBoxPostAccionNuevoFormatoNomiPreguntaNomi.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jCheckBoxPostAccionSinCerrarFormatoNomiPreguntaNomi.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jCheckBoxPostAccionSinMensajeFormatoNomiPreguntaNomi.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionFormatoNomiPreguntaNomi.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionFormatoNomiPreguntaNomi.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxTiposAccionesFormularioFormatoNomiPreguntaNomi.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesFormatoNomiPreguntaNomi.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesFormatoNomiPreguntaNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarFormatoNomiPreguntaNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesFormatoNomiPreguntaNomi.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesFormatoNomiPreguntaNomi.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralFormatoNomiPreguntaNomi.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesFormatoNomiPreguntaNomi(Boolean esInicializar) throws Exception {
		try	{	
			if(FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualFormatoNomiPreguntaNomi(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesFormatoNomiPreguntaNomi() throws Exception {
		try	{
			if(FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormatoNomiPreguntaNomi();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFormatoNomiPreguntaNomi() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxTiposAccionesFormularioFormatoNomiPreguntaNomi.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxTiposAccionesFormularioFormatoNomiPreguntaNomi.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormatoNomiPreguntaNomi() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesFormatoNomiPreguntaNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesFormatoNomiPreguntaNomi.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesFormatoNomiPreguntaNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesFormatoNomiPreguntaNomi.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesFormatoNomiPreguntaNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesFormatoNomiPreguntaNomi.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionFormatoNomiPreguntaNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionFormatoNomiPreguntaNomi.addItem(reporte);
			}
			
			
			if(!this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionFormatoNomiPreguntaNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionFormatoNomiPreguntaNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesFormatoNomiPreguntaNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesFormatoNomiPreguntaNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxTiposAccionesFormularioFormatoNomiPreguntaNomi.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxTiposAccionesFormularioFormatoNomiPreguntaNomi.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarFormatoNomiPreguntaNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarFormatoNomiPreguntaNomi.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarFormatoNomiPreguntaNomi.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFormatoNomiPreguntaNomi();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFormatoNomiPreguntaNomi() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi!=null) {
				this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi!=null) {
				this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi!=null) {
				
				if(this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=FormatoNomiPreguntaNomiConstantesFunciones.getTiposSeleccionarFormatoNomiPreguntaNomi(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=FormatoNomiPreguntaNomiConstantesFunciones.getTiposSeleccionarFormatoNomiPreguntaNomi(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=FormatoNomiPreguntaNomiConstantesFunciones.getTiposSeleccionarFormatoNomiPreguntaNomi(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualFormatoNomiPreguntaNomi()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomi.getSelectedItem()!=null){this.id_factor_nomiFK_IdFactorNomi=((FactorNomi)this.jComboBoxid_factor_nomiFK_IdFactorNomiFormatoNomiPreguntaNomi.getSelectedItem()).getId();}
		if(this.jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomi.getSelectedItem()!=null){this.id_formato_nomiFK_IdFormatoNomi=((FormatoNomi)this.jComboBoxid_formato_nomiFK_IdFormatoNomiFormatoNomiPreguntaNomi.getSelectedItem()).getId();}
		if(this.jComboBoxid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomi.getSelectedItem()!=null){this.id_pregunta_nomiFK_IdPreguntaNomi=((PreguntaNomi)this.jComboBoxid_pregunta_nomiFK_IdPreguntaNomiFormatoNomiPreguntaNomi.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasFormatoNomiPreguntaNomi(Boolean esInicializar) throws Exception {				
		if(FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualFormatoNomiPreguntaNomi();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaFormatoNomiPreguntaNomi() throws Exception {
		this.inicializarActualizarBindingTablaFormatoNomiPreguntaNomi(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByFormatoNomiPreguntaNomi() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByFormatoNomiPreguntaNomi.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByFormatoNomiPreguntaNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFormatoNomiPreguntaNomi.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new FormatoNomiPreguntaNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByFormatoNomiPreguntaNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFormatoNomiPreguntaNomi.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new FormatoNomiPreguntaNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosFormatoNomiPreguntaNomiOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomiPreguntaNomiOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new FormatoNomiPreguntaNomiPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByFormatoNomiPreguntaNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFormatoNomiPreguntaNomi.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new FormatoNomiPreguntaNomiPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByFormatoNomiPreguntaNomi.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaFormatoNomiPreguntaNomi(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=formatonomipreguntanomis.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosFormatoNomiPreguntaNomi.setModel(new FormatoNomiPreguntaNomiModel(this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosFormatoNomiPreguntaNomi.setModel(new FormatoNomiPreguntaNomiModel(this.formatonomipreguntanomis,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByFormatoNomiPreguntaNomi!=null && this.jInternalFrameOrderByFormatoNomiPreguntaNomi.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByFormatoNomiPreguntaNomi();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosFormatoNomiPreguntaNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomiPreguntaNomi,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new FormatoNomiPreguntaNomiPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO,formatonomipreguntanomiConstantesFunciones.resaltarSeleccionarFormatoNomiPreguntaNomi,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO,formatonomipreguntanomiConstantesFunciones.resaltarSeleccionarFormatoNomiPreguntaNomi,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosFormatoNomiPreguntaNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomiPreguntaNomi,FormatoNomiPreguntaNomiConstantesFunciones.LABEL_ID));

		if(this.formatonomipreguntanomiConstantesFunciones.mostraridFormatoNomiPreguntaNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoNomiPreguntaNomiConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.formatonomipreguntanomiConstantesFunciones.resaltaridFormatoNomiPreguntaNomi,this.formatonomipreguntanomiConstantesFunciones.activaridFormatoNomiPreguntaNomi,iSizeTabla,this,true,"idFormatoNomiPreguntaNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.formatonomipreguntanomiConstantesFunciones.resaltaridFormatoNomiPreguntaNomi,this.formatonomipreguntanomiConstantesFunciones.activaridFormatoNomiPreguntaNomi,this,true,"idFormatoNomiPreguntaNomi","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormatoNomiPreguntaNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomiPreguntaNomi,FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDEMPRESA));

		if(this.formatonomipreguntanomiConstantesFunciones.mostrarid_empresaFormatoNomiPreguntaNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.formatonomipreguntanomiConstantesFunciones.resaltarid_empresaFormatoNomiPreguntaNomi,this,this.formatonomipreguntanomiConstantesFunciones.activarid_empresaFormatoNomiPreguntaNomi,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.formatonomipreguntanomiConstantesFunciones.resaltarid_empresaFormatoNomiPreguntaNomi,this,this.formatonomipreguntanomiConstantesFunciones.activarid_empresaFormatoNomiPreguntaNomi,false,"id_empresaFormatoNomiPreguntaNomi","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormatoNomiPreguntaNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormatoNomiPreguntaNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomiPreguntaNomi,FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.formatonomipreguntanomiConstantesFunciones.mostrarid_sucursalFormatoNomiPreguntaNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.formatonomipreguntanomiConstantesFunciones.resaltarid_sucursalFormatoNomiPreguntaNomi,this,this.formatonomipreguntanomiConstantesFunciones.activarid_sucursalFormatoNomiPreguntaNomi,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.formatonomipreguntanomiConstantesFunciones.resaltarid_sucursalFormatoNomiPreguntaNomi,this,this.formatonomipreguntanomiConstantesFunciones.activarid_sucursalFormatoNomiPreguntaNomi,false,"id_sucursalFormatoNomiPreguntaNomi","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormatoNomiPreguntaNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormatoNomiPreguntaNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomiPreguntaNomi,FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFORMATONOMI));

		if(this.formatonomipreguntanomiConstantesFunciones.mostrarid_formato_nomiFormatoNomiPreguntaNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFORMATONOMI,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FormatoNomiTableCell(this.formatonomisForeignKey,this.formatonomipreguntanomiConstantesFunciones.resaltarid_formato_nomiFormatoNomiPreguntaNomi,this,this.formatonomipreguntanomiConstantesFunciones.activarid_formato_nomiFormatoNomiPreguntaNomi,iSizeTabla));
			tableColumn.setCellEditor(new FormatoNomiTableCell(this.formatonomisForeignKey,this.formatonomipreguntanomiConstantesFunciones.resaltarid_formato_nomiFormatoNomiPreguntaNomi,this,this.formatonomipreguntanomiConstantesFunciones.activarid_formato_nomiFormatoNomiPreguntaNomi,true,"id_formato_nomiFormatoNomiPreguntaNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormatoNomiPreguntaNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormatoNomiPreguntaNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomiPreguntaNomi,FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI));

		if(this.formatonomipreguntanomiConstantesFunciones.mostrarid_factor_nomiFormatoNomiPreguntaNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FactorNomiTableCell(this.factornomisForeignKey,this.formatonomipreguntanomiConstantesFunciones.resaltarid_factor_nomiFormatoNomiPreguntaNomi,this,this.formatonomipreguntanomiConstantesFunciones.activarid_factor_nomiFormatoNomiPreguntaNomi,iSizeTabla));
			tableColumn.setCellEditor(new FactorNomiTableCell(this.factornomisForeignKey,this.formatonomipreguntanomiConstantesFunciones.resaltarid_factor_nomiFormatoNomiPreguntaNomi,this,this.formatonomipreguntanomiConstantesFunciones.activarid_factor_nomiFormatoNomiPreguntaNomi,true,"id_factor_nomiFormatoNomiPreguntaNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormatoNomiPreguntaNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormatoNomiPreguntaNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomiPreguntaNomi,FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDPREGUNTANOMI));

		if(this.formatonomipreguntanomiConstantesFunciones.mostrarid_pregunta_nomiFormatoNomiPreguntaNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDPREGUNTANOMI,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PreguntaNomiTableCell(this.preguntanomisForeignKey,this.formatonomipreguntanomiConstantesFunciones.resaltarid_pregunta_nomiFormatoNomiPreguntaNomi,this,this.formatonomipreguntanomiConstantesFunciones.activarid_pregunta_nomiFormatoNomiPreguntaNomi,iSizeTabla));
			tableColumn.setCellEditor(new PreguntaNomiTableCell(this.preguntanomisForeignKey,this.formatonomipreguntanomiConstantesFunciones.resaltarid_pregunta_nomiFormatoNomiPreguntaNomi,this,this.formatonomipreguntanomiConstantesFunciones.activarid_pregunta_nomiFormatoNomiPreguntaNomi,true,"id_pregunta_nomiFormatoNomiPreguntaNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormatoNomiPreguntaNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormatoNomiPreguntaNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomiPreguntaNomi,FormatoNomiPreguntaNomiConstantesFunciones.LABEL_PONDERACION));

		if(this.formatonomipreguntanomiConstantesFunciones.mostrarponderacionFormatoNomiPreguntaNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoNomiPreguntaNomiConstantesFunciones.LABEL_PONDERACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.formatonomipreguntanomiConstantesFunciones.resaltarponderacionFormatoNomiPreguntaNomi,this.formatonomipreguntanomiConstantesFunciones.activarponderacionFormatoNomiPreguntaNomi,iSizeTabla,this,true,"ponderacionFormatoNomiPreguntaNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.formatonomipreguntanomiConstantesFunciones.resaltarponderacionFormatoNomiPreguntaNomi,this.formatonomipreguntanomiConstantesFunciones.activarponderacionFormatoNomiPreguntaNomi,this,true,"ponderacionFormatoNomiPreguntaNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FormatoNomiPreguntaNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCalificacionEmpleado && this.formatonomipreguntanomiConstantesFunciones.mostrarCalificacionEmpleadoFormatoNomiPreguntaNomi && !FormatoNomiPreguntaNomiConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Calificacion Empleados");
				tableColumn.setHeaderValue("Calificacion Empleados");
				tableColumn.setCellRenderer(new CalificacionEmpleadoTableCell(formatonomipreguntanomiConstantesFunciones.resaltarCalificacionEmpleadoFormatoNomiPreguntaNomi,this,this.formatonomipreguntanomiConstantesFunciones.activarCalificacionEmpleadoFormatoNomiPreguntaNomi));
				tableColumn.setCellEditor(new CalificacionEmpleadoTableCell(formatonomipreguntanomiConstantesFunciones.resaltarCalificacionEmpleadoFormatoNomiPreguntaNomi,this,this.formatonomipreguntanomiConstantesFunciones.activarCalificacionEmpleadoFormatoNomiPreguntaNomi));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosFormatoNomiPreguntaNomi.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFormatoNomiPreguntaNomi.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFormatoNomiPreguntaNomi.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarFormatoNomiPreguntaNomi && this.isPermisoGuardarCambiosFormatoNomiPreguntaNomi) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosFormatoNomiPreguntaNomi.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.formatonomipreguntanomiSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosFormatoNomiPreguntaNomi.addColumn(tableColumn);
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
			
			this.jTableDatosFormatoNomiPreguntaNomi.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFormatoNomiPreguntaNomi && this.isPermisoGuardarCambiosFormatoNomiPreguntaNomi) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.formatonomipreguntanomiSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFormatoNomiPreguntaNomi && this.isPermisoGuardarCambiosFormatoNomiPreguntaNomi) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosFormatoNomiPreguntaNomi.moveColumn(this.jTableDatosFormatoNomiPreguntaNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosFormatoNomiPreguntaNomi.moveColumn(this.jTableDatosFormatoNomiPreguntaNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.formatonomipreguntanomiSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosFormatoNomiPreguntaNomi.moveColumn(this.jTableDatosFormatoNomiPreguntaNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosFormatoNomiPreguntaNomi.moveColumn(this.jTableDatosFormatoNomiPreguntaNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosFormatoNomiPreguntaNomi.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosFormatoNomiPreguntaNomi.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosFormatoNomiPreguntaNomi,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosFormatoNomiPreguntaNomi.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosFormatoNomiPreguntaNomi.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosFormatoNomiPreguntaNomi.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosFormatoNomiPreguntaNomi.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosFormatoNomiPreguntaNomi.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=formatonomipreguntanomis.size()-1;
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
		//this.jTableDatosFormatoNomiPreguntaNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosFormatoNomiPreguntaNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosFormatoNomiPreguntaNomi();
			
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
				
				//this.isEsNuevoFormatoNomiPreguntaNomi=false;
					
				FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
			
				if(this.formatonomipreguntanomiSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFormatoNomiPreguntaNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.formatonomipreguntanomi.getsType().equals("DUPLICADO")
				   || this.formatonomipreguntanomi.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoFormatoNomiPreguntaNomi=true;
				
				} else {
					this.isEsNuevoFormatoNomiPreguntaNomi=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
					if(this.formatonomipreguntanomi.getId()>=0 && !this.formatonomipreguntanomi.getIsNew()) {						
						this.isEsNuevoFormatoNomiPreguntaNomi=false;
						
					} else {
						this.isEsNuevoFormatoNomiPreguntaNomi=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoFormatoNomiPreguntaNomi(esRelaciones);						
				
				this.seleccionarFormatoNomiPreguntaNomi(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.formatonomipreguntanomi.getId()<0) {
					this.isEsNuevoFormatoNomiPreguntaNomi=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarFormatoNomiPreguntaNomi(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarFormatoNomiPreguntaNomi(evt,rowIndex);
				}	
				
				if(this.formatonomipreguntanomiSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion FormatoNomiPreguntaNomi: " + this.dDif); 
					}
				}								
				
				FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarFormatoNomiPreguntaNomi(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.formatonomipreguntanomi)) {
					if(this.formatonomipreguntanomi.getId()>0) {
						this.formatonomipreguntanomi.setIsDeleted(true);
						
						this.formatonomipreguntanomisEliminados.add(this.formatonomipreguntanomi);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().remove(this.formatonomipreguntanomi);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.formatonomipreguntanomis.remove(this.formatonomipreguntanomi);				
					}
					
					
					((FormatoNomiPreguntaNomiModel) this.jTableDatosFormatoNomiPreguntaNomi.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaFormatoNomiPreguntaNomi(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarFormatoNomiPreguntaNomi(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoFormatoNomiPreguntaNomi) {
			
			if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFormatoNomiPreguntaNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.formatonomipreguntanomiConstantesFunciones.cargarid_empresaFormatoNomiPreguntaNomi || this.formatonomipreguntanomiConstantesFunciones.event_dependid_empresaFormatoNomiPreguntaNomi) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.formatonomipreguntanomi.getid_empresa());
									//this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(formatonomipreguntanomi.getEmpresa()!=null) {
							this.empresasForeignKey.add(formatonomipreguntanomi.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.formatonomipreguntanomi.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.formatonomipreguntanomiConstantesFunciones.cargarid_sucursalFormatoNomiPreguntaNomi || this.formatonomipreguntanomiConstantesFunciones.event_dependid_sucursalFormatoNomiPreguntaNomi) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.formatonomipreguntanomi.getid_sucursal());
									//this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(formatonomipreguntanomi.getSucursal()!=null) {
							this.sucursalsForeignKey.add(formatonomipreguntanomi.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.formatonomipreguntanomi.getid_sucursal(),false,"Formulario");

					//FormatoNomi
					if(!this.formatonomipreguntanomiConstantesFunciones.cargarid_formato_nomiFormatoNomiPreguntaNomi || this.formatonomipreguntanomiConstantesFunciones.event_dependid_formato_nomiFormatoNomiPreguntaNomi) {
						//this.cargarCombosFormatoNomisForeignKeyLista(" where id="+this.formatonomipreguntanomi.getid_formato_nomi());
									//this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false,false);
						this.formatonomisForeignKey=new ArrayList<FormatoNomi>();

						if(formatonomipreguntanomi.getFormatoNomi()!=null) {
							this.formatonomisForeignKey.add(formatonomipreguntanomi.getFormatoNomi());
						}

						this.addItemDefectoCombosForeignKeyFormatoNomi();
						this.cargarCombosFrameFormatoNomisForeignKey("Todos");
					}
					this.setActualFormatoNomiForeignKey(this.formatonomipreguntanomi.getid_formato_nomi(),false,"Formulario");

					//FactorNomi
					if(!this.formatonomipreguntanomiConstantesFunciones.cargarid_factor_nomiFormatoNomiPreguntaNomi || this.formatonomipreguntanomiConstantesFunciones.event_dependid_factor_nomiFormatoNomiPreguntaNomi) {
						//this.cargarCombosFactorNomisForeignKeyLista(" where id="+this.formatonomipreguntanomi.getid_factor_nomi());
									//this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false,false);
						this.factornomisForeignKey=new ArrayList<FactorNomi>();

						if(formatonomipreguntanomi.getFactorNomi()!=null) {
							this.factornomisForeignKey.add(formatonomipreguntanomi.getFactorNomi());
						}

						this.addItemDefectoCombosForeignKeyFactorNomi();
						this.cargarCombosFrameFactorNomisForeignKey("Todos");
					}
					this.setActualFactorNomiForeignKey(this.formatonomipreguntanomi.getid_factor_nomi(),false,"Formulario");

					//PreguntaNomi
					if(!this.formatonomipreguntanomiConstantesFunciones.cargarid_pregunta_nomiFormatoNomiPreguntaNomi || this.formatonomipreguntanomiConstantesFunciones.event_dependid_pregunta_nomiFormatoNomiPreguntaNomi) {
						//this.cargarCombosPreguntaNomisForeignKeyLista(" where id="+this.formatonomipreguntanomi.getid_pregunta_nomi());
									//this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false,false);
						this.preguntanomisForeignKey=new ArrayList<PreguntaNomi>();

						if(formatonomipreguntanomi.getPreguntaNomi()!=null) {
							this.preguntanomisForeignKey.add(formatonomipreguntanomi.getPreguntaNomi());
						}

						this.addItemDefectoCombosForeignKeyPreguntaNomi();
						this.cargarCombosFramePreguntaNomisForeignKey("Todos");
					}
					this.setActualPreguntaNomiForeignKey(this.formatonomipreguntanomi.getid_pregunta_nomi(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesFormatoNomiPreguntaNomi("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesFormatoNomiPreguntaNomi(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFormatoNomiPreguntaNomi() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoFormatoNomiPreguntaNomi(FormatoNomiPreguntaNomi formatonomipreguntanomi) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoFormatoNomiPreguntaNomi(formatonomipreguntanomi,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoFormatoNomiPreguntaNomi(FormatoNomiPreguntaNomi formatonomipreguntanomi,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioFormatoNomiPreguntaNomi(formatonomipreguntanomi);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyFormatoNomiPreguntaNomi(formatonomipreguntanomi,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyFormatoNomiPreguntaNomi(formatonomipreguntanomi);
	}
	
	public void setVariablesObjetoActualToFormularioFormatoNomiPreguntaNomi(FormatoNomiPreguntaNomi formatonomipreguntanomi) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jLabelidFormatoNomiPreguntaNomi.setText(formatonomipreguntanomi.getId().toString());
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jTextFieldponderacionFormatoNomiPreguntaNomi.setText(formatonomipreguntanomi.getponderacion().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,FormatoNomiPreguntaNomi formatonomipreguntanomiLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,formatonomipreguntanomiLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,FormatoNomiPreguntaNomi formatonomipreguntanomiLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				formatonomipreguntanomiLocal=this.formatonomipreguntanomi;
			} else {
				formatonomipreguntanomiLocal=this.formatonomipreguntanomiAnterior;
			}
		}
		
		if(this.permiteMantenimiento(formatonomipreguntanomiLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoFormatoNomiPreguntaNomi(formatonomipreguntanomiLocal,true);
					
					if(formatonomipreguntanomiSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(formatonomipreguntanomiLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(formatonomipreguntanomiLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoFormatoNomiPreguntaNomi(FormatoNomiPreguntaNomi formatonomipreguntanomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFormatoNomiPreguntaNomi(formatonomipreguntanomi,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiPreguntaNomi(formatonomipreguntanomi);
	}
	
	public void setVariablesFormularioToObjetoActualFormatoNomiPreguntaNomi(FormatoNomiPreguntaNomi formatonomipreguntanomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFormatoNomiPreguntaNomi(formatonomipreguntanomi,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualFormatoNomiPreguntaNomi(FormatoNomiPreguntaNomi formatonomipreguntanomi,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jLabelidFormatoNomiPreguntaNomi.getText()==null || this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jLabelidFormatoNomiPreguntaNomi.getText()=="" || this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jLabelidFormatoNomiPreguntaNomi.getText()=="Id") {
				this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jLabelidFormatoNomiPreguntaNomi.setText("0");
			}

			if(conColumnasBase) {formatonomipreguntanomi.setId(Long.parseLong(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jLabelidFormatoNomiPreguntaNomi.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormatoNomiPreguntaNomiConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jLabelIdFormatoNomiPreguntaNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			formatonomipreguntanomi.setponderacion(Double.parseDouble(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jTextFieldponderacionFormatoNomiPreguntaNomi.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormatoNomiPreguntaNomiConstantesFunciones.LABEL_PONDERACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jLabelponderacionFormatoNomiPreguntaNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFormatoNomiPreguntaNomi(FormatoNomiPreguntaNomi formatonomipreguntanomiBean,FormatoNomiPreguntaNomi formatonomipreguntanomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && formatonomipreguntanomiBean.getid_formato_nomi()!=null && !formatonomipreguntanomiBean.getid_formato_nomi().equals(-1L))) {formatonomipreguntanomi.setid_formato_nomi(formatonomipreguntanomiBean.getid_formato_nomi());}
			if(conDefault || (!conDefault && formatonomipreguntanomiBean.getid_factor_nomi()!=null && !formatonomipreguntanomiBean.getid_factor_nomi().equals(-1L))) {formatonomipreguntanomi.setid_factor_nomi(formatonomipreguntanomiBean.getid_factor_nomi());}
			if(conDefault || (!conDefault && formatonomipreguntanomiBean.getid_pregunta_nomi()!=null && !formatonomipreguntanomiBean.getid_pregunta_nomi().equals(-1L))) {formatonomipreguntanomi.setid_pregunta_nomi(formatonomipreguntanomiBean.getid_pregunta_nomi());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosFormatoNomiPreguntaNomi(FormatoNomiPreguntaNomi formatonomipreguntanomiOrigen,FormatoNomiPreguntaNomi formatonomipreguntanomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && formatonomipreguntanomiOrigen.getId()!=null && !formatonomipreguntanomiOrigen.getId().equals(0L))) {formatonomipreguntanomi.setId(formatonomipreguntanomiOrigen.getId());}}
			if(conDefault || (!conDefault && formatonomipreguntanomiOrigen.getid_formato_nomi()!=null && !formatonomipreguntanomiOrigen.getid_formato_nomi().equals(-1L))) {formatonomipreguntanomi.setid_formato_nomi(formatonomipreguntanomiOrigen.getid_formato_nomi());}
			if(conDefault || (!conDefault && formatonomipreguntanomiOrigen.getid_factor_nomi()!=null && !formatonomipreguntanomiOrigen.getid_factor_nomi().equals(-1L))) {formatonomipreguntanomi.setid_factor_nomi(formatonomipreguntanomiOrigen.getid_factor_nomi());}
			if(conDefault || (!conDefault && formatonomipreguntanomiOrigen.getid_pregunta_nomi()!=null && !formatonomipreguntanomiOrigen.getid_pregunta_nomi().equals(-1L))) {formatonomipreguntanomi.setid_pregunta_nomi(formatonomipreguntanomiOrigen.getid_pregunta_nomi());}
			if(conDefault || (!conDefault && formatonomipreguntanomiOrigen.getponderacion()!=null && !formatonomipreguntanomiOrigen.getponderacion().equals(0.0))) {formatonomipreguntanomi.setponderacion(formatonomipreguntanomiOrigen.getponderacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFormatoNomiPreguntaNomi(FormatoNomiPreguntaNomi formatonomipreguntanomi) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jLabelidFormatoNomiPreguntaNomi.setText(formatonomipreguntanomi.getId().toString());
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jTextFieldponderacionFormatoNomiPreguntaNomi.setText(formatonomipreguntanomi.getponderacion().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFormatoNomiPreguntaNomi(FormatoNomiPreguntaNomiBean formatonomipreguntanomiBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jLabelidFormatoNomiPreguntaNomi.setText(formatonomipreguntanomiBean.getId().toString());
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jTextFieldponderacionFormatoNomiPreguntaNomi.setText(formatonomipreguntanomiBean.getponderacion().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanFormatoNomiPreguntaNomi(FormatoNomiPreguntaNomiParameterReturnGeneral formatonomipreguntanomiReturnGeneral,FormatoNomiPreguntaNomiBean formatonomipreguntanomiBean,Boolean conDefault) throws Exception { 
		try {
			FormatoNomiPreguntaNomi formatonomipreguntanomiLocal=new FormatoNomiPreguntaNomi();
			
			formatonomipreguntanomiLocal=formatonomipreguntanomiReturnGeneral.getFormatoNomiPreguntaNomi();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && formatonomipreguntanomiLocal.getId()!=null && !formatonomipreguntanomiLocal.getId().equals(0L))) {formatonomipreguntanomiBean.setId(formatonomipreguntanomiLocal.getId());}}
			if(conDefault || (!conDefault && formatonomipreguntanomiLocal.getid_formato_nomi()!=null && !formatonomipreguntanomiLocal.getid_formato_nomi().equals(-1L))) {formatonomipreguntanomiBean.setid_formato_nomi(formatonomipreguntanomiLocal.getid_formato_nomi());}
			if(conDefault || (!conDefault && formatonomipreguntanomiLocal.getid_factor_nomi()!=null && !formatonomipreguntanomiLocal.getid_factor_nomi().equals(-1L))) {formatonomipreguntanomiBean.setid_factor_nomi(formatonomipreguntanomiLocal.getid_factor_nomi());}
			if(conDefault || (!conDefault && formatonomipreguntanomiLocal.getid_pregunta_nomi()!=null && !formatonomipreguntanomiLocal.getid_pregunta_nomi().equals(-1L))) {formatonomipreguntanomiBean.setid_pregunta_nomi(formatonomipreguntanomiLocal.getid_pregunta_nomi());}
			if(conDefault || (!conDefault && formatonomipreguntanomiLocal.getponderacion()!=null && !formatonomipreguntanomiLocal.getponderacion().equals(0.0))) {formatonomipreguntanomiBean.setponderacion(formatonomipreguntanomiLocal.getponderacion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxFormatoNomiPreguntaNomiGenerico(Long idFormatoNomiPreguntaNomiSeleccionado,JComboBox jComboBoxFormatoNomiPreguntaNomi,List<FormatoNomiPreguntaNomi> formatonomipreguntanomisLocal)throws Exception {
		try {
			FormatoNomiPreguntaNomi  formatonomipreguntanomiTemp=null;

			for(FormatoNomiPreguntaNomi formatonomipreguntanomiAux:formatonomipreguntanomisLocal) {
				if(formatonomipreguntanomiAux.getId()!=null && formatonomipreguntanomiAux.getId().equals(idFormatoNomiPreguntaNomiSeleccionado)) {
					formatonomipreguntanomiTemp=formatonomipreguntanomiAux;
					break;
				}
			}

			jComboBoxFormatoNomiPreguntaNomi.setSelectedItem(formatonomipreguntanomiTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxFormatoNomiPreguntaNomiGenerico(JComboBox jComboBoxFormatoNomiPreguntaNomi,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxFormatoNomiPreguntaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFormatoNomiPreguntaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxFormatoNomiPreguntaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFormatoNomiPreguntaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFormatoNomiPreguntaNomi.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxFormatoNomiPreguntaNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFormatoNomiPreguntaNomi.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxFormatoNomiPreguntaNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxFormatoNomiPreguntaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxFormatoNomiPreguntaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			formatonomipreguntanomi=(FormatoNomiPreguntaNomi) formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			formatonomipreguntanomi =(FormatoNomiPreguntaNomi) formatonomipreguntanomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!formatonomipreguntanomi.getIsNew() && !formatonomipreguntanomi.getIsChanged() && !formatonomipreguntanomi.getIsDeleted()) {
				sDescripcion=formatonomipreguntanomi.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=formatonomipreguntanomi.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!formatonomipreguntanomi.getIsNew() && !formatonomipreguntanomi.getIsChanged() && !formatonomipreguntanomi.getIsDeleted()) {
				sDescripcion=formatonomipreguntanomi.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=formatonomipreguntanomi.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("FormatoNomi")) {
			//sDescripcion=this.getActualFormatoNomiForeignKeyDescripcion((Long)value);
			if(!formatonomipreguntanomi.getIsNew() && !formatonomipreguntanomi.getIsChanged() && !formatonomipreguntanomi.getIsDeleted()) {
				sDescripcion=formatonomipreguntanomi.getformatonomi_descripcion();
			} else {
				//sDescripcion=this.getActualFormatoNomiForeignKeyDescripcion((Long)value);
				sDescripcion=formatonomipreguntanomi.getformatonomi_descripcion();
			}
		}

		if(sTipo.equals("FactorNomi")) {
			//sDescripcion=this.getActualFactorNomiForeignKeyDescripcion((Long)value);
			if(!formatonomipreguntanomi.getIsNew() && !formatonomipreguntanomi.getIsChanged() && !formatonomipreguntanomi.getIsDeleted()) {
				sDescripcion=formatonomipreguntanomi.getfactornomi_descripcion();
			} else {
				//sDescripcion=this.getActualFactorNomiForeignKeyDescripcion((Long)value);
				sDescripcion=formatonomipreguntanomi.getfactornomi_descripcion();
			}
		}

		if(sTipo.equals("PreguntaNomi")) {
			//sDescripcion=this.getActualPreguntaNomiForeignKeyDescripcion((Long)value);
			if(!formatonomipreguntanomi.getIsNew() && !formatonomipreguntanomi.getIsChanged() && !formatonomipreguntanomi.getIsDeleted()) {
				sDescripcion=formatonomipreguntanomi.getpreguntanomi_descripcion();
			} else {
				//sDescripcion=this.getActualPreguntaNomiForeignKeyDescripcion((Long)value);
				sDescripcion=formatonomipreguntanomi.getpreguntanomi_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		FormatoNomiPreguntaNomi formatonomipreguntanomiRow=new FormatoNomiPreguntaNomi();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			formatonomipreguntanomiRow=(FormatoNomiPreguntaNomi) formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			formatonomipreguntanomiRow=(FormatoNomiPreguntaNomi) formatonomipreguntanomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonCalificacionEmpleadoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,FormatoNomiPreguntaNomi formatonomipreguntanomi) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomipreguntanomi = (FormatoNomiPreguntaNomi)this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.formatonomipreguntanomi = (FormatoNomiPreguntaNomi)this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(formatonomipreguntanomi!=null) {
						this.formatonomipreguntanomi = formatonomipreguntanomi;
					} else {
						this.formatonomipreguntanomi = new FormatoNomiPreguntaNomi();
					}
				}

				if(this.isTienePermisosCalificacionEmpleado && this.permiteMantenimiento(this.formatonomipreguntanomi)) {
					CalificacionEmpleadoBeanSwingJInternalFrame calificacionempleadoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFramePopup=new CalificacionEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						calificacionempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFramePopup;
					} else {
						calificacionempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame;
					}

					List<FormatoNomiPreguntaNomi> formatonomipreguntanomis=new ArrayList<FormatoNomiPreguntaNomi>();
					formatonomipreguntanomis.add(this.formatonomipreguntanomi);
					if(!esRelacionado) {
						//calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.setConGuardarRelaciones(false);
						//calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					calificacionempleadoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.cargarCalificacionEmpleadoBeanSwingJInternalFrame(formatonomipreguntanomis,this.formatonomipreguntanomi,calificacionempleadoBeanSwingJInternalFrame,/*conInicializar,*/calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.getConGuardarRelaciones(),calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoSessionBean.getEsGuardarRelacionado());
					calificacionempleadoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						calificacionempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsCalificacionEmpleado("no_relacionado");

						calificacionempleadoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CalificacionEmpleadoConstantesFunciones.ITAMANIOFILATABLA + (CalificacionEmpleadoConstantesFunciones.ITAMANIOFILATABLA/2));

						calificacionempleadoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderFormatoNomiPreguntaNomi=(TitledBorder)this.jScrollPanelDatosFormatoNomiPreguntaNomi.getBorder();
						TitledBorder titledBorderCalificacionEmpleado=(TitledBorder)calificacionempleadoBeanSwingJInternalFrame.jScrollPanelDatosCalificacionEmpleado.getBorder();

						titledBorderCalificacionEmpleado.setTitle(titledBorderFormatoNomiPreguntaNomi.getTitle() + " -> Calificacion Empleado");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,calificacionempleadoBeanSwingJInternalFrame);
						}

						calificacionempleadoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(calificacionempleadoBeanSwingJInternalFrame);

						calificacionempleadoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.formatonomipreguntanomiSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Calificacion Empleado",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualFormatoNomiPreguntaNomi(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaNuevoFormatoNomiPreguntaNomi && this.isPermisoNuevoFormatoNomiPreguntaNomi));			
			this.jButtonDuplicarFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaDuplicarFormatoNomiPreguntaNomi && this.isPermisoDuplicarFormatoNomiPreguntaNomi));			
			this.jButtonCopiarFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaCopiarFormatoNomiPreguntaNomi && this.isPermisoCopiarFormatoNomiPreguntaNomi));
			this.jButtonVerFormFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaVerFormFormatoNomiPreguntaNomi && this.isPermisoVerFormFormatoNomiPreguntaNomi));
			
			this.jButtonAbrirOrderByFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaOrdenFormatoNomiPreguntaNomi && this.isPermisoOrdenFormatoNomiPreguntaNomi));			
			
			this.jButtonNuevoRelacionesFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesFormatoNomiPreguntaNomi && this.isPermisoNuevoFormatoNomiPreguntaNomi));			
			this.jButtonNuevoGuardarCambiosFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaNuevoFormatoNomiPreguntaNomi && this.isPermisoNuevoFormatoNomiPreguntaNomi && this.isPermisoGuardarCambiosFormatoNomiPreguntaNomi));
			
			if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonModificarFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaModificarFormatoNomiPreguntaNomi && this.isPermisoActualizarFormatoNomiPreguntaNomi));	
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonActualizarFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaActualizarFormatoNomiPreguntaNomi && this.isPermisoActualizarFormatoNomiPreguntaNomi));	
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonEliminarFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaEliminarFormatoNomiPreguntaNomi && this.isPermisoEliminarFormatoNomiPreguntaNomi));
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonCancelarFormatoNomiPreguntaNomi.setVisible(this.isVisibilidadCeldaCancelarFormatoNomiPreguntaNomi);							
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonGuardarCambiosFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaGuardarFormatoNomiPreguntaNomi && this.isPermisoGuardarCambiosFormatoNomiPreguntaNomi));			
			
			}
						
			this.jButtonGuardarCambiosTablaFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosFormatoNomiPreguntaNomi && this.isPermisoGuardarCambiosFormatoNomiPreguntaNomi));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaNuevoFormatoNomiPreguntaNomi && this.isPermisoNuevoFormatoNomiPreguntaNomi));						
			this.jButtonDuplicarToolBarFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaDuplicarFormatoNomiPreguntaNomi && this.isPermisoDuplicarFormatoNomiPreguntaNomi));						
			this.jButtonCopiarToolBarFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaCopiarFormatoNomiPreguntaNomi && this.isPermisoCopiarFormatoNomiPreguntaNomi));			
			this.jButtonVerFormToolBarFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaVerFormFormatoNomiPreguntaNomi && this.isPermisoVerFormFormatoNomiPreguntaNomi));			
			this.jButtonAbrirOrderByToolBarFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaOrdenFormatoNomiPreguntaNomi && this.isPermisoOrdenFormatoNomiPreguntaNomi));
			this.jButtonNuevoRelacionesToolBarFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesFormatoNomiPreguntaNomi && this.isPermisoNuevoFormatoNomiPreguntaNomi));			
			this.jButtonNuevoGuardarCambiosToolBarFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaNuevoFormatoNomiPreguntaNomi && this.isPermisoNuevoFormatoNomiPreguntaNomi && this.isPermisoGuardarCambiosFormatoNomiPreguntaNomi));			
			
			if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonModificarToolBarFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaModificarFormatoNomiPreguntaNomi && this.isPermisoActualizarFormatoNomiPreguntaNomi));	
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonActualizarToolBarFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaActualizarFormatoNomiPreguntaNomi  && this.isPermisoActualizarFormatoNomiPreguntaNomi));	
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonEliminarToolBarFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaEliminarFormatoNomiPreguntaNomi && this.isPermisoEliminarFormatoNomiPreguntaNomi));
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonCancelarToolBarFormatoNomiPreguntaNomi.setVisible(this.isVisibilidadCeldaCancelarFormatoNomiPreguntaNomi);				
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonGuardarCambiosToolBarFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaGuardarFormatoNomiPreguntaNomi && this.isPermisoGuardarCambiosFormatoNomiPreguntaNomi));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosFormatoNomiPreguntaNomi && this.isPermisoGuardarCambiosFormatoNomiPreguntaNomi));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaNuevoFormatoNomiPreguntaNomi && this.isPermisoNuevoFormatoNomiPreguntaNomi));			
			this.jMenuItemDuplicarFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaDuplicarFormatoNomiPreguntaNomi && this.isPermisoDuplicarFormatoNomiPreguntaNomi));			
			this.jMenuItemCopiarFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaCopiarFormatoNomiPreguntaNomi && this.isPermisoCopiarFormatoNomiPreguntaNomi));			
			this.jMenuItemVerFormFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaVerFormFormatoNomiPreguntaNomi && this.isPermisoVerFormFormatoNomiPreguntaNomi));			
			this.jMenuItemAbrirOrderByFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaOrdenFormatoNomiPreguntaNomi && this.isPermisoOrdenFormatoNomiPreguntaNomi));			
			//this.jMenuItemMostrarOcultarFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaOrdenFormatoNomiPreguntaNomi && this.isPermisoOrdenFormatoNomiPreguntaNomi));
			this.jMenuItemDetalleAbrirOrderByFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaOrdenFormatoNomiPreguntaNomi && this.isPermisoOrdenFormatoNomiPreguntaNomi));			
			//this.jMenuItemDetalleMostrarOcultarFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaOrdenFormatoNomiPreguntaNomi && this.isPermisoOrdenFormatoNomiPreguntaNomi));			
			this.jMenuItemNuevoRelacionesFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesFormatoNomiPreguntaNomi && this.isPermisoNuevoFormatoNomiPreguntaNomi));			
			this.jMenuItemNuevoGuardarCambiosFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaNuevoFormatoNomiPreguntaNomi && this.isPermisoNuevoFormatoNomiPreguntaNomi && this.isPermisoGuardarCambiosFormatoNomiPreguntaNomi));									
			
			if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jMenuItemModificarFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaModificarFormatoNomiPreguntaNomi && this.isPermisoActualizarFormatoNomiPreguntaNomi));	
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jMenuItemActualizarFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaActualizarFormatoNomiPreguntaNomi && this.isPermisoActualizarFormatoNomiPreguntaNomi));	
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jMenuItemEliminarFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaEliminarFormatoNomiPreguntaNomi && this.isPermisoEliminarFormatoNomiPreguntaNomi));
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jMenuItemCancelarFormatoNomiPreguntaNomi.setVisible(this.isVisibilidadCeldaCancelarFormatoNomiPreguntaNomi);				
			}
			
			this.jMenuItemGuardarCambiosFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaGuardarFormatoNomiPreguntaNomi && this.isPermisoGuardarCambiosFormatoNomiPreguntaNomi));						
			this.jMenuItemGuardarCambiosTablaFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosFormatoNomiPreguntaNomi && this.isPermisoGuardarCambiosFormatoNomiPreguntaNomi));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoFormatoNomiPreguntaNomi=this.jButtonNuevoFormatoNomiPreguntaNomi.isVisible();
			this.isVisibilidadCeldaDuplicarFormatoNomiPreguntaNomi=this.jButtonDuplicarFormatoNomiPreguntaNomi.isVisible();
			this.isVisibilidadCeldaCopiarFormatoNomiPreguntaNomi=this.jButtonCopiarFormatoNomiPreguntaNomi.isVisible();
			this.isVisibilidadCeldaVerFormFormatoNomiPreguntaNomi=this.jButtonVerFormFormatoNomiPreguntaNomi.isVisible();
			
			this.isVisibilidadCeldaOrdenFormatoNomiPreguntaNomi=this.jButtonAbrirOrderByFormatoNomiPreguntaNomi.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomiPreguntaNomi=this.jButtonNuevoRelacionesFormatoNomiPreguntaNomi.isVisible();
			this.isVisibilidadCeldaModificarFormatoNomiPreguntaNomi=this.jButtonModificarFormatoNomiPreguntaNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
			this.isVisibilidadCeldaActualizarFormatoNomiPreguntaNomi=this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonActualizarFormatoNomiPreguntaNomi.isVisible();
			this.isVisibilidadCeldaEliminarFormatoNomiPreguntaNomi=this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonEliminarFormatoNomiPreguntaNomi.isVisible();
			this.isVisibilidadCeldaCancelarFormatoNomiPreguntaNomi=this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonCancelarFormatoNomiPreguntaNomi.isVisible();
			this.isVisibilidadCeldaGuardarFormatoNomiPreguntaNomi=this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonGuardarCambiosFormatoNomiPreguntaNomi.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosFormatoNomiPreguntaNomi=this.jButtonGuardarCambiosTablaFormatoNomiPreguntaNomi.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoFormatoNomiPreguntaNomi=this.jButtonNuevoToolBarFormatoNomiPreguntaNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomiPreguntaNomi=this.jButtonNuevoRelacionesToolBarFormatoNomiPreguntaNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
			this.isVisibilidadCeldaModificarFormatoNomiPreguntaNomi=this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonModificarToolBarFormatoNomiPreguntaNomi.isVisible();
			this.isVisibilidadCeldaActualizarFormatoNomiPreguntaNomi=this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonActualizarToolBarFormatoNomiPreguntaNomi.isVisible();
			this.isVisibilidadCeldaEliminarFormatoNomiPreguntaNomi=this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonEliminarToolBarFormatoNomiPreguntaNomi.isVisible();
			this.isVisibilidadCeldaCancelarFormatoNomiPreguntaNomi=this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonCancelarToolBarFormatoNomiPreguntaNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFormatoNomiPreguntaNomi=this.jButtonGuardarCambiosToolBarFormatoNomiPreguntaNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFormatoNomiPreguntaNomi=this.jButtonGuardarCambiosTablaToolBarFormatoNomiPreguntaNomi.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoFormatoNomiPreguntaNomi=this.jMenuItemNuevoFormatoNomiPreguntaNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomiPreguntaNomi=this.jMenuItemNuevoRelacionesFormatoNomiPreguntaNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
			this.isVisibilidadCeldaModificarFormatoNomiPreguntaNomi=this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jMenuItemModificarFormatoNomiPreguntaNomi.isVisible();
			this.isVisibilidadCeldaActualizarFormatoNomiPreguntaNomi=this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jMenuItemActualizarFormatoNomiPreguntaNomi.isVisible();
			this.isVisibilidadCeldaEliminarFormatoNomiPreguntaNomi=this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jMenuItemEliminarFormatoNomiPreguntaNomi.isVisible();
			this.isVisibilidadCeldaCancelarFormatoNomiPreguntaNomi=this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jMenuItemCancelarFormatoNomiPreguntaNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFormatoNomiPreguntaNomi=this.jMenuItemGuardarCambiosFormatoNomiPreguntaNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFormatoNomiPreguntaNomi=this.jMenuItemGuardarCambiosTablaFormatoNomiPreguntaNomi.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesFormatoNomiPreguntaNomi(Boolean esInicializar) {
		if(FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL) {			
			if(this.formatonomipreguntanomiSessionBean.getConGuardarRelaciones()) {
				//if(this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesFormatoNomiPreguntaNomi();
			}
			
			this.inicializarActualizarBindingBotonesManualFormatoNomiPreguntaNomi(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualFormatoNomiPreguntaNomi() {
		this.jButtonNuevoFormatoNomiPreguntaNomi.setVisible(this.isPermisoNuevoFormatoNomiPreguntaNomi);			
		this.jButtonDuplicarFormatoNomiPreguntaNomi.setVisible(this.isPermisoDuplicarFormatoNomiPreguntaNomi);			
		this.jButtonCopiarFormatoNomiPreguntaNomi.setVisible(this.isPermisoCopiarFormatoNomiPreguntaNomi);			
		this.jButtonVerFormFormatoNomiPreguntaNomi.setVisible(this.isPermisoVerFormFormatoNomiPreguntaNomi);			
		
		this.jButtonAbrirOrderByFormatoNomiPreguntaNomi.setVisible(this.isPermisoOrdenFormatoNomiPreguntaNomi);					
		
		this.jButtonNuevoRelacionesFormatoNomiPreguntaNomi.setVisible(this.isPermisoNuevoFormatoNomiPreguntaNomi);			
		
		if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonModificarFormatoNomiPreguntaNomi.setVisible(this.isPermisoActualizarFormatoNomiPreguntaNomi);	
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonActualizarFormatoNomiPreguntaNomi.setVisible(this.isPermisoActualizarFormatoNomiPreguntaNomi);	
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonEliminarFormatoNomiPreguntaNomi.setVisible(this.isPermisoEliminarFormatoNomiPreguntaNomi);
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonCancelarFormatoNomiPreguntaNomi.setVisible(this.isVisibilidadCeldaCancelarFormatoNomiPreguntaNomi);						
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonGuardarCambiosFormatoNomiPreguntaNomi.setVisible(this.isPermisoGuardarCambiosFormatoNomiPreguntaNomi);							
		}
		
		this.jButtonGuardarCambiosTablaFormatoNomiPreguntaNomi.setVisible(this.isPermisoActualizarFormatoNomiPreguntaNomi);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleFormatoNomiPreguntaNomi() {
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonModificarFormatoNomiPreguntaNomi.setVisible(this.isPermisoActualizarFormatoNomiPreguntaNomi);	
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonActualizarFormatoNomiPreguntaNomi.setVisible(this.isPermisoActualizarFormatoNomiPreguntaNomi);	
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonEliminarFormatoNomiPreguntaNomi.setVisible(this.isPermisoEliminarFormatoNomiPreguntaNomi);
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonCancelarFormatoNomiPreguntaNomi.setVisible(this.isVisibilidadCeldaCancelarFormatoNomiPreguntaNomi);							
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonGuardarCambiosFormatoNomiPreguntaNomi.setVisible((this.isVisibilidadCeldaGuardarFormatoNomiPreguntaNomi && this.isPermisoGuardarCambiosFormatoNomiPreguntaNomi));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosFormatoNomiPreguntaNomi() {
		if(FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualFormatoNomiPreguntaNomi();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesFormatoNomiPreguntaNomi() {
	}
	
	public void jTableDatosFormatoNomiPreguntaNomiListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarFormatoNomiPreguntaNomi(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidFormatoNomiPreguntaNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormatoNomiPreguntaNomi(this.getformatonomipreguntanomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formatonomipreguntanomi==null) {
						this.formatonomipreguntanomi = new FormatoNomiPreguntaNomi();
					}

					this.setVariablesFormularioToObjetoActualFormatoNomiPreguntaNomi(this.formatonomipreguntanomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);
				}

				if(this.formatonomipreguntanomi.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.formatonomipreguntanomi.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaFormatoNomiPreguntaNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebFormatoNomiPreguntaNomi(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormatoNomiPreguntaNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormatoNomiPreguntaNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormatoNomiPreguntaNomi(this.getformatonomipreguntanomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.formatonomipreguntanomiLogic.getConnexion());

				if(this.formatonomipreguntanomi.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.formatonomipreguntanomi.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormatoNomiPreguntaNomi=(TitledBorder)this.jScrollPanelDatosFormatoNomiPreguntaNomi.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderFormatoNomiPreguntaNomi.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaFormatoNomiPreguntaNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormatoNomiPreguntaNomi(this.getformatonomipreguntanomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formatonomipreguntanomi==null) {
						this.formatonomipreguntanomi = new FormatoNomiPreguntaNomi();
					}

					this.setVariablesFormularioToObjetoActualFormatoNomiPreguntaNomi(this.formatonomipreguntanomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);
				}

				if(this.formatonomipreguntanomi.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.formatonomipreguntanomi.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalFormatoNomiPreguntaNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebFormatoNomiPreguntaNomi(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormatoNomiPreguntaNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormatoNomiPreguntaNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormatoNomiPreguntaNomi(this.getformatonomipreguntanomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.formatonomipreguntanomiLogic.getConnexion());

				if(this.formatonomipreguntanomi.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.formatonomipreguntanomi.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormatoNomiPreguntaNomi=(TitledBorder)this.jScrollPanelDatosFormatoNomiPreguntaNomi.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderFormatoNomiPreguntaNomi.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalFormatoNomiPreguntaNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormatoNomiPreguntaNomi(this.getformatonomipreguntanomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formatonomipreguntanomi==null) {
						this.formatonomipreguntanomi = new FormatoNomiPreguntaNomi();
					}

					this.setVariablesFormularioToObjetoActualFormatoNomiPreguntaNomi(this.formatonomipreguntanomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);
				}

				if(this.formatonomipreguntanomi.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.formatonomipreguntanomi.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_formato_nomiFormatoNomiPreguntaNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoformatonomi=true;

			idTienePermisoformatonomi=this.tienePermisosUsuarioEnPaginaWebFormatoNomiPreguntaNomi(FormatoNomiConstantesFunciones.CLASSNAME);

			if(idTienePermisoformatonomi) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormatoNomiPreguntaNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormatoNomiPreguntaNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormatoNomiPreguntaNomi(this.getformatonomipreguntanomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);

				this.formatonomiBeanSwingJInternalFrame=new FormatoNomiBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.formatonomiBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.formatonomiBeanSwingJInternalFrame.getFormatoNomiLogic().setConnexion(this.formatonomipreguntanomiLogic.getConnexion());

				if(this.formatonomipreguntanomi.getid_formato_nomi()!=null) {
					this.formatonomiBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.formatonomiBeanSwingJInternalFrame.setIdActual(this.formatonomipreguntanomi.getid_formato_nomi());
					this.formatonomiBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.formatonomiBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.formatonomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormatoNomi();
				}

				JInternalFrameBase jinternalFrame =this.formatonomiBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormatoNomiPreguntaNomi=(TitledBorder)this.jScrollPanelDatosFormatoNomiPreguntaNomi.getBorder();
				TitledBorder titledBorderformatonomi=(TitledBorder)this.formatonomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomi.getBorder();

				titledBorderformatonomi.setTitle(titledBorderFormatoNomiPreguntaNomi.getTitle() + " -> Formato Nomi");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_formato_nomiFormatoNomiPreguntaNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormatoNomiPreguntaNomi(this.getformatonomipreguntanomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formatonomipreguntanomi==null) {
						this.formatonomipreguntanomi = new FormatoNomiPreguntaNomi();
					}

					this.setVariablesFormularioToObjetoActualFormatoNomiPreguntaNomi(this.formatonomipreguntanomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);
				}

				if(this.formatonomipreguntanomi.getid_formato_nomi()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_formato_nomi = "+this.formatonomipreguntanomi.getid_formato_nomi().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_factor_nomiFormatoNomiPreguntaNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisofactornomi=true;

			idTienePermisofactornomi=this.tienePermisosUsuarioEnPaginaWebFormatoNomiPreguntaNomi(FactorNomiConstantesFunciones.CLASSNAME);

			if(idTienePermisofactornomi) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormatoNomiPreguntaNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormatoNomiPreguntaNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormatoNomiPreguntaNomi(this.getformatonomipreguntanomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);

				this.factornomiBeanSwingJInternalFrame=new FactorNomiBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.factornomiBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.factornomiBeanSwingJInternalFrame.getFactorNomiLogic().setConnexion(this.formatonomipreguntanomiLogic.getConnexion());

				if(this.formatonomipreguntanomi.getid_factor_nomi()!=null) {
					this.factornomiBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.factornomiBeanSwingJInternalFrame.setIdActual(this.formatonomipreguntanomi.getid_factor_nomi());
					this.factornomiBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.factornomiBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.factornomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaFactorNomi();
				}

				JInternalFrameBase jinternalFrame =this.factornomiBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormatoNomiPreguntaNomi=(TitledBorder)this.jScrollPanelDatosFormatoNomiPreguntaNomi.getBorder();
				TitledBorder titledBorderfactornomi=(TitledBorder)this.factornomiBeanSwingJInternalFrame.jScrollPanelDatosFactorNomi.getBorder();

				titledBorderfactornomi.setTitle(titledBorderFormatoNomiPreguntaNomi.getTitle() + " -> Factor Nomi");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_factor_nomiFormatoNomiPreguntaNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormatoNomiPreguntaNomi(this.getformatonomipreguntanomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formatonomipreguntanomi==null) {
						this.formatonomipreguntanomi = new FormatoNomiPreguntaNomi();
					}

					this.setVariablesFormularioToObjetoActualFormatoNomiPreguntaNomi(this.formatonomipreguntanomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);
				}

				if(this.formatonomipreguntanomi.getid_factor_nomi()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_factor_nomi = "+this.formatonomipreguntanomi.getid_factor_nomi().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_pregunta_nomiFormatoNomiPreguntaNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopreguntanomi=true;

			idTienePermisopreguntanomi=this.tienePermisosUsuarioEnPaginaWebFormatoNomiPreguntaNomi(PreguntaNomiConstantesFunciones.CLASSNAME);

			if(idTienePermisopreguntanomi) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormatoNomiPreguntaNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormatoNomiPreguntaNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormatoNomiPreguntaNomi(this.getformatonomipreguntanomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);

				this.preguntanomiBeanSwingJInternalFrame=new PreguntaNomiBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.preguntanomiBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.preguntanomiBeanSwingJInternalFrame.getPreguntaNomiLogic().setConnexion(this.formatonomipreguntanomiLogic.getConnexion());

				if(this.formatonomipreguntanomi.getid_pregunta_nomi()!=null) {
					this.preguntanomiBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.preguntanomiBeanSwingJInternalFrame.setIdActual(this.formatonomipreguntanomi.getid_pregunta_nomi());
					this.preguntanomiBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.preguntanomiBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.preguntanomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaPreguntaNomi();
				}

				JInternalFrameBase jinternalFrame =this.preguntanomiBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormatoNomiPreguntaNomi=(TitledBorder)this.jScrollPanelDatosFormatoNomiPreguntaNomi.getBorder();
				TitledBorder titledBorderpreguntanomi=(TitledBorder)this.preguntanomiBeanSwingJInternalFrame.jScrollPanelDatosPreguntaNomi.getBorder();

				titledBorderpreguntanomi.setTitle(titledBorderFormatoNomiPreguntaNomi.getTitle() + " -> Pregunta Nomi");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_pregunta_nomiFormatoNomiPreguntaNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormatoNomiPreguntaNomi(this.getformatonomipreguntanomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formatonomipreguntanomi==null) {
						this.formatonomipreguntanomi = new FormatoNomiPreguntaNomi();
					}

					this.setVariablesFormularioToObjetoActualFormatoNomiPreguntaNomi(this.formatonomipreguntanomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);
				}

				if(this.formatonomipreguntanomi.getid_pregunta_nomi()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pregunta_nomi = "+this.formatonomipreguntanomi.getid_pregunta_nomi().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonponderacionFormatoNomiPreguntaNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormatoNomiPreguntaNomi(this.getformatonomipreguntanomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formatonomipreguntanomi==null) {
						this.formatonomipreguntanomi = new FormatoNomiPreguntaNomi();
					}

					this.setVariablesFormularioToObjetoActualFormatoNomiPreguntaNomi(this.formatonomipreguntanomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);
				}

				if(this.formatonomipreguntanomi.getponderacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ponderacion = "+this.formatonomipreguntanomi.getponderacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaFormatoNomiPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false,false);

			this.getFormatoNomiPreguntaNomisFK_IdEmpresa();

			this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false);

			//if(FormatoNomiPreguntaNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFactorNomiFormatoNomiPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false,false);

			this.getFormatoNomiPreguntaNomisFK_IdFactorNomi();

			this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false);

			//if(FormatoNomiPreguntaNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFormatoNomiFormatoNomiPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false,false);

			this.getFormatoNomiPreguntaNomisFK_IdFormatoNomi();

			this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false);

			//if(FormatoNomiPreguntaNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPreguntaNomiFormatoNomiPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false,false);

			this.getFormatoNomiPreguntaNomisFK_IdPreguntaNomi();

			this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false);

			//if(FormatoNomiPreguntaNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalFormatoNomiPreguntaNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false,false);

			this.getFormatoNomiPreguntaNomisFK_IdSucursal();

			this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false);

			//if(FormatoNomiPreguntaNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomipreguntanomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameFormatoNomiPreguntaNomi() {
		if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
		

		if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.setVisible(false);	    			
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.dispose();
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi!=null) {
			this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.dispose();
			this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi=null;
		}
		
		if(this.jInternalFrameImportacionFormatoNomiPreguntaNomi!=null) {
			this.jInternalFrameImportacionFormatoNomiPreguntaNomi.setVisible(false);	    			
			this.jInternalFrameImportacionFormatoNomiPreguntaNomi.dispose();
			this.jInternalFrameImportacionFormatoNomiPreguntaNomi=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessFormatoNomiPreguntaNomi();
			
			FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
			
			
			if(sTipo.equals("NuevoFormatoNomiPreguntaNomi")) {
				jButtonNuevoFormatoNomiPreguntaNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarFormatoNomiPreguntaNomi")) {
				jButtonDuplicarFormatoNomiPreguntaNomiActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarFormatoNomiPreguntaNomi")) {
				jButtonCopiarFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormFormatoNomiPreguntaNomi")) {
				jButtonVerFormFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarFormatoNomiPreguntaNomi")) {
				jButtonNuevoFormatoNomiPreguntaNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarFormatoNomiPreguntaNomi")) {
				jButtonDuplicarFormatoNomiPreguntaNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoFormatoNomiPreguntaNomi")) {
				jButtonNuevoFormatoNomiPreguntaNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarFormatoNomiPreguntaNomi")) {
				jButtonDuplicarFormatoNomiPreguntaNomiActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesFormatoNomiPreguntaNomi")) {
				jButtonNuevoFormatoNomiPreguntaNomiActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarFormatoNomiPreguntaNomi")) {
				jButtonNuevoFormatoNomiPreguntaNomiActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesFormatoNomiPreguntaNomi")) {
				jButtonNuevoFormatoNomiPreguntaNomiActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarFormatoNomiPreguntaNomi")) {
				jButtonModificarFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarFormatoNomiPreguntaNomi")) {
				jButtonModificarFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarFormatoNomiPreguntaNomi")) {
				jButtonModificarFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarFormatoNomiPreguntaNomi")) {
				jButtonActualizarFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarFormatoNomiPreguntaNomi")) {
				jButtonActualizarFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarFormatoNomiPreguntaNomi")) {
				jButtonActualizarFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarFormatoNomiPreguntaNomi")) {
				jButtonEliminarFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarFormatoNomiPreguntaNomi")) {
				jButtonEliminarFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarFormatoNomiPreguntaNomi")) {
				jButtonEliminarFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarFormatoNomiPreguntaNomi")) {
				jButtonCancelarFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarFormatoNomiPreguntaNomi")) {
				jButtonCancelarFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarFormatoNomiPreguntaNomi")) {
				jButtonCancelarFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarFormatoNomiPreguntaNomi")) {
				jButtonCerrarFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarFormatoNomiPreguntaNomi")) {
				jButtonCerrarFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarFormatoNomiPreguntaNomi")) {
				jButtonCerrarFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarFormatoNomiPreguntaNomi")) {
				jButtonMostrarOcultarFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarFormatoNomiPreguntaNomi")) {
				jButtonCancelarFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosFormatoNomiPreguntaNomi")) {
				jButtonGuardarCambiosFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarFormatoNomiPreguntaNomi")) {
				jButtonGuardarCambiosFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarFormatoNomiPreguntaNomi")) {
				jButtonCopiarFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarFormatoNomiPreguntaNomi")) {
				jButtonVerFormFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosFormatoNomiPreguntaNomi")) {
				jButtonGuardarCambiosFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarFormatoNomiPreguntaNomi")) {
				jButtonCopiarFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormFormatoNomiPreguntaNomi")) {
				jButtonVerFormFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaFormatoNomiPreguntaNomi")) {
				jButtonGuardarCambiosFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarFormatoNomiPreguntaNomi")) {
				jButtonGuardarCambiosFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaFormatoNomiPreguntaNomi")) {
				jButtonGuardarCambiosFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionFormatoNomiPreguntaNomi")) {
				jButtonRecargarInformacionFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarFormatoNomiPreguntaNomi")) {
				jButtonRecargarInformacionFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionFormatoNomiPreguntaNomi")) {
				jButtonRecargarInformacionFormatoNomiPreguntaNomiActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresFormatoNomiPreguntaNomi")) {
				jButtonAnterioresFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarFormatoNomiPreguntaNomi")) {
				jButtonAnterioresFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreFormatoNomiPreguntaNomi")) {
				jButtonAnterioresFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesFormatoNomiPreguntaNomi")) {
				jButtonSiguientesFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarFormatoNomiPreguntaNomi")) {
				jButtonSiguientesFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesFormatoNomiPreguntaNomi")) {
				jButtonSiguientesFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByFormatoNomiPreguntaNomi") || sTipo.equals("MenuItemDetalleAbrirOrderByFormatoNomiPreguntaNomi")) {
				jButtonAbrirOrderByFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarFormatoNomiPreguntaNomi") || sTipo.equals("MenuItemDetalleMostrarOcultarFormatoNomiPreguntaNomi")) {
				jButtonMostrarOcultarFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosFormatoNomiPreguntaNomi")) {
				jButtonNuevoGuardarCambiosFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarFormatoNomiPreguntaNomi")) {
				jButtonNuevoGuardarCambiosFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosFormatoNomiPreguntaNomi")) {
				jButtonNuevoGuardarCambiosFormatoNomiPreguntaNomiActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoFormatoNomiPreguntaNomi")) {
				jButtonCerrarReporteDinamicoFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoFormatoNomiPreguntaNomi")) {
				jButtonGenerarReporteDinamicoFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoFormatoNomiPreguntaNomi")) {
				
				jButtonGenerarExcelReporteDinamicoFormatoNomiPreguntaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionFormatoNomiPreguntaNomi")) {
				jButtonCerrarImportacionFormatoNomiPreguntaNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionFormatoNomiPreguntaNomi")) {
				
				jButtonGenerarImportacionFormatoNomiPreguntaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionFormatoNomiPreguntaNomi")) {
				
				jButtonAbrirImportacionFormatoNomiPreguntaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesFormatoNomiPreguntaNomi")) {
				jComboBoxTiposAccionesFormatoNomiPreguntaNomiActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesFormatoNomiPreguntaNomi")) {
				jComboBoxTiposRelacionesFormatoNomiPreguntaNomiActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioFormatoNomiPreguntaNomi")) {
				jComboBoxTiposAccionesFormatoNomiPreguntaNomiActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarFormatoNomiPreguntaNomi")) {
				
				jComboBoxTiposSeleccionarFormatoNomiPreguntaNomiActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralFormatoNomiPreguntaNomi")) {
				jTextFieldValorCampoGeneralFormatoNomiPreguntaNomiActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByFormatoNomiPreguntaNomi")) {
				jButtonAbrirOrderByFormatoNomiPreguntaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarFormatoNomiPreguntaNomi")) {
				jButtonAbrirOrderByFormatoNomiPreguntaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByFormatoNomiPreguntaNomi")) {
				jButtonCerrarOrderByFormatoNomiPreguntaNomiActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFormatoNomiPreguntaNomiBusqueda")) {
				this.jButtonidFormatoNomiPreguntaNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFormatoNomiPreguntaNomiUpdate")) {
				this.jButtonid_empresaFormatoNomiPreguntaNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFormatoNomiPreguntaNomiBusqueda")) {
				this.jButtonid_empresaFormatoNomiPreguntaNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalFormatoNomiPreguntaNomiUpdate")) {
				this.jButtonid_sucursalFormatoNomiPreguntaNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalFormatoNomiPreguntaNomiBusqueda")) {
				this.jButtonid_sucursalFormatoNomiPreguntaNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formato_nomiFormatoNomiPreguntaNomiUpdate")) {
				this.jButtonid_formato_nomiFormatoNomiPreguntaNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formato_nomiFormatoNomiPreguntaNomiBusqueda")) {
				this.jButtonid_formato_nomiFormatoNomiPreguntaNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_factor_nomiFormatoNomiPreguntaNomiUpdate")) {
				this.jButtonid_factor_nomiFormatoNomiPreguntaNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_factor_nomiFormatoNomiPreguntaNomiBusqueda")) {
				this.jButtonid_factor_nomiFormatoNomiPreguntaNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_pregunta_nomiFormatoNomiPreguntaNomiUpdate")) {
				this.jButtonid_pregunta_nomiFormatoNomiPreguntaNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_pregunta_nomiFormatoNomiPreguntaNomiBusqueda")) {
				this.jButtonid_pregunta_nomiFormatoNomiPreguntaNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ponderacionFormatoNomiPreguntaNomiBusqueda")) {
				this.jButtonponderacionFormatoNomiPreguntaNomiBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdFactorNomiFormatoNomiPreguntaNomi")) {
				this.jButtonFK_IdFactorNomiFormatoNomiPreguntaNomiActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdFormatoNomiFormatoNomiPreguntaNomi")) {
				this.jButtonFK_IdFormatoNomiFormatoNomiPreguntaNomiActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPreguntaNomiFormatoNomiPreguntaNomi")) {
				this.jButtonFK_IdPreguntaNomiFormatoNomiPreguntaNomiActionPerformed(evt);
			}
			
			;
			
			
			FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessFormatoNomiPreguntaNomi();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoNomiPreguntaNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomipreguntanomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomipreguntanomi);
				
				FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
				
				


				
				FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoNomiPreguntaNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomiPreguntaNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			FormatoNomiPreguntaNomi formatonomipreguntanomiLocal=null;
			
			if(!this.getEsControlTabla()) {
				formatonomipreguntanomiLocal=this.formatonomipreguntanomi;
			} else {
				formatonomipreguntanomiLocal=this.formatonomipreguntanomiAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomipreguntanomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomipreguntanomi);
				
				FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
							
				
				


				
				FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoNomiPreguntaNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomiPreguntaNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoNomiPreguntaNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiAnterior =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatonomipreguntanomiAnterior =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
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
			
			FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
			
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
			
			


			
			FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoNomiPreguntaNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomipreguntanomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomipreguntanomi);
				
				FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
								
						
				


				
				FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoNomiPreguntaNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomiPreguntaNomi.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomipreguntanomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomipreguntanomi);
				
				FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
								
				
				


				
				FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoNomiPreguntaNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomiPreguntaNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoNomiPreguntaNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiAnterior =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatonomipreguntanomiAnterior =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomipreguntanomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomipreguntanomi);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoNomiPreguntaNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiAnterior =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatonomipreguntanomiAnterior =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoNomiPreguntaNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomipreguntanomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.formatonomipreguntanomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomipreguntanomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomipreguntanomi);
				
				FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
							
				
				


				
				FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoNomiPreguntaNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomiPreguntaNomi.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoNomiPreguntaNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomipreguntanomiAnterior =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.formatonomipreguntanomiAnterior =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
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
			
			FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
			
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
			
			


			
			FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoNomiPreguntaNomiActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomipreguntanomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.formatonomipreguntanomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomipreguntanomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomipreguntanomi);
				
				FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
								
				
				


				
				FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoNomiPreguntaNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomiPreguntaNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoNomiPreguntaNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiAnterior =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatonomipreguntanomiAnterior =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoNomiPreguntaNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomipreguntanomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.formatonomipreguntanomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoNomiPreguntaNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomipreguntanomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomipreguntanomi);
				
				FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosFormatoNomiPreguntaNomi")) {
					jCheckBoxSeleccionarTodosFormatoNomiPreguntaNomiItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosFormatoNomiPreguntaNomi")) {
					jCheckBoxSeleccionadosFormatoNomiPreguntaNomiItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarFormatoNomiPreguntaNomi")) {
					
				}
				
				


				
				
				FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoNomiPreguntaNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomiPreguntaNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomipreguntanomi);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.formatonomipreguntanomi);
				
				FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
												
				
				


				
				
				FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoNomiPreguntaNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomiPreguntaNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoNomiPreguntaNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomipreguntanomiAnterior =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.formatonomipreguntanomiAnterior =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoNomiPreguntaNomiActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomipreguntanomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomipreguntanomi);
				
				FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
				
				
				FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
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
			
			FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
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
			
			


			
			FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoNomiPreguntaNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomipreguntanomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomipreguntanomi);
				
				FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoNomiPreguntaNomi.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomiPreguntaNomi.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomipreguntanomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomipreguntanomi);
				
				FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
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
				
				


				
				FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoNomiPreguntaNomi.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomiPreguntaNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoNomiPreguntaNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomipreguntanomiAnterior =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatonomipreguntanomiAnterior =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarFormatoNomiPreguntaNomi")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosFormatoNomiPreguntaNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.formatonomipreguntanomi =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.formatonomipreguntanomi);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarFormatoNomiPreguntaNomi")) {
				
				}
				
				FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarFormatoNomiPreguntaNomi")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosFormatoNomiPreguntaNomi.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarFormatoNomiPreguntaNomi")) {
			
			}
			
			FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessFormatoNomiPreguntaNomi();
			
			FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
			
			if(sTipo.equals("NuevoFormatoNomiPreguntaNomi")) {
				jButtonNuevoFormatoNomiPreguntaNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarFormatoNomiPreguntaNomi")) {
				jButtonDuplicarFormatoNomiPreguntaNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarFormatoNomiPreguntaNomi")) {
				jButtonCopiarFormatoNomiPreguntaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormFormatoNomiPreguntaNomi")) {
				jButtonVerFormFormatoNomiPreguntaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesFormatoNomiPreguntaNomi")) {
				jButtonNuevoFormatoNomiPreguntaNomiActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarFormatoNomiPreguntaNomi")) {
				jButtonModificarFormatoNomiPreguntaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarFormatoNomiPreguntaNomi")) {
				jButtonActualizarFormatoNomiPreguntaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarFormatoNomiPreguntaNomi")) {
				jButtonEliminarFormatoNomiPreguntaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaFormatoNomiPreguntaNomi")) {
				jButtonGuardarCambiosFormatoNomiPreguntaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarFormatoNomiPreguntaNomi")) {
				jButtonCancelarFormatoNomiPreguntaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarFormatoNomiPreguntaNomi")) {
				jButtonCerrarFormatoNomiPreguntaNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosFormatoNomiPreguntaNomi")) {
				jButtonGuardarCambiosFormatoNomiPreguntaNomiActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosFormatoNomiPreguntaNomi")) {
				jButtonNuevoGuardarCambiosFormatoNomiPreguntaNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByFormatoNomiPreguntaNomi")) {
				jButtonAbrirOrderByFormatoNomiPreguntaNomiActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionFormatoNomiPreguntaNomi")) {
				jButtonRecargarInformacionFormatoNomiPreguntaNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresFormatoNomiPreguntaNomi")) {
				jButtonAnterioresFormatoNomiPreguntaNomiActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesFormatoNomiPreguntaNomi")) {
				jButtonSiguientesFormatoNomiPreguntaNomiActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFormatoNomiPreguntaNomiBusqueda")) {
				this.jButtonidFormatoNomiPreguntaNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFormatoNomiPreguntaNomiUpdate")) {
				this.jButtonid_empresaFormatoNomiPreguntaNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFormatoNomiPreguntaNomiBusqueda")) {
				this.jButtonid_empresaFormatoNomiPreguntaNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalFormatoNomiPreguntaNomiUpdate")) {
				this.jButtonid_sucursalFormatoNomiPreguntaNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalFormatoNomiPreguntaNomiBusqueda")) {
				this.jButtonid_sucursalFormatoNomiPreguntaNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formato_nomiFormatoNomiPreguntaNomiUpdate")) {
				this.jButtonid_formato_nomiFormatoNomiPreguntaNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formato_nomiFormatoNomiPreguntaNomiBusqueda")) {
				this.jButtonid_formato_nomiFormatoNomiPreguntaNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_factor_nomiFormatoNomiPreguntaNomiUpdate")) {
				this.jButtonid_factor_nomiFormatoNomiPreguntaNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_factor_nomiFormatoNomiPreguntaNomiBusqueda")) {
				this.jButtonid_factor_nomiFormatoNomiPreguntaNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_pregunta_nomiFormatoNomiPreguntaNomiUpdate")) {
				this.jButtonid_pregunta_nomiFormatoNomiPreguntaNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_pregunta_nomiFormatoNomiPreguntaNomiBusqueda")) {
				this.jButtonid_pregunta_nomiFormatoNomiPreguntaNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ponderacionFormatoNomiPreguntaNomiBusqueda")) {
				this.jButtonponderacionFormatoNomiPreguntaNomiBusquedaActionPerformed(evt);
			}
			
			FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessFormatoNomiPreguntaNomi();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameFormatoNomiPreguntaNomi")) {
				closingInternalFrameFormatoNomiPreguntaNomi();
				
			} else if(sTipo.equals("jButtonCancelarFormatoNomiPreguntaNomi")) {
				JInternalFrameBase jInternalFrameDetalleFormFormatoNomiPreguntaNomi = (JInternalFrameBase)evt.getSource();
	            	
	            FormatoNomiPreguntaNomiBeanSwingJInternalFrame jInternalFrameParent=(FormatoNomiPreguntaNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormFormatoNomiPreguntaNomi.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarFormatoNomiPreguntaNomiActionPerformed(null);
			}
			
			FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.formatonomipreguntanomi,new Object(),this.formatonomipreguntanomiParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormFormatoNomiPreguntaNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormFormatoNomiPreguntaNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormFormatoNomiPreguntaNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.formatonomipreguntanomi)) {
			if(!esControlTabla) {
				if(FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualFormatoNomiPreguntaNomi(this.formatonomipreguntanomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);			
				}
				
				if(this.formatonomipreguntanomiSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualFormatoNomiPreguntaNomi(this.formatonomipreguntanomi,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.formatonomipreguntanomiReturnGeneral=formatonomipreguntanomiLogic.procesarEventosFormatoNomiPreguntaNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis(),this.formatonomipreguntanomi,this.formatonomipreguntanomiParameterGeneral,this.isEsNuevoFormatoNomiPreguntaNomi,classes);//this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanFormatoNomiPreguntaNomi(this.formatonomipreguntanomiReturnGeneral,this.formatonomipreguntanomiBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.formatonomipreguntanomiSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanFormatoNomiPreguntaNomi(classes,this.formatonomipreguntanomiReturnGeneral,this.formatonomipreguntanomiBean,false);
					}
						
					if(this.formatonomipreguntanomiReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyFormatoNomiPreguntaNomi(this.formatonomipreguntanomiReturnGeneral.getFormatoNomiPreguntaNomi());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioFormatoNomiPreguntaNomi(this.formatonomipreguntanomiReturnGeneral.getFormatoNomiPreguntaNomi());	
					}
						
					if(this.formatonomipreguntanomiReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioFormatoNomiPreguntaNomi(this.formatonomipreguntanomiReturnGeneral.getFormatoNomiPreguntaNomi(),classes);//this.formatonomipreguntanomiBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioFormatoNomiPreguntaNomi(this.formatonomipreguntanomi,classes);//this.formatonomipreguntanomiBean);									
				}
			
				if(FormatoNomiPreguntaNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualFormatoNomiPreguntaNomi(this.formatonomipreguntanomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomiPreguntaNomi(this.formatonomipreguntanomi);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.formatonomipreguntanomiAnterior!=null) {
						this.formatonomipreguntanomi=this.formatonomipreguntanomiAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.formatonomipreguntanomiReturnGeneral=formatonomipreguntanomiLogic.procesarEventosFormatoNomiPreguntaNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis(),this.formatonomipreguntanomi,this.formatonomipreguntanomiParameterGeneral,this.isEsNuevoFormatoNomiPreguntaNomi,classes);//this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.formatonomipreguntanomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.formatonomipreguntanomiReturnGeneral.getFormatoNomiPreguntaNomi(),formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.formatonomipreguntanomiReturnGeneral.getFormatoNomiPreguntaNomi(),this.formatonomipreguntanomis);
				}
				//ARCHITECTURE
				
				//this.jTableDatosFormatoNomiPreguntaNomi.repaint();
				
				//((AbstractTableModel) this.jTableDatosFormatoNomiPreguntaNomi.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosFormatoNomiPreguntaNomi();
			}
		}
	}
	
	public void actualizarVisualTableDatosFormatoNomiPreguntaNomi() throws Exception {
		
		FormatoNomiPreguntaNomiModel formatonomipreguntanomiModel=(FormatoNomiPreguntaNomiModel)this.jTableDatosFormatoNomiPreguntaNomi.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			formatonomipreguntanomiModel.formatonomipreguntanomis=this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			formatonomipreguntanomiModel.formatonomipreguntanomis=this.formatonomipreguntanomis;
		}
		
		
		((FormatoNomiPreguntaNomiModel) this.jTableDatosFormatoNomiPreguntaNomi.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaFormatoNomiPreguntaNomi() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getformatonomipreguntanomiAnterior(),this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getformatonomipreguntanomiAnterior(),this.formatonomipreguntanomis);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosFormatoNomiPreguntaNomi();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioFormatoNomiPreguntaNomi(FormatoNomiPreguntaNomi formatonomipreguntanomi,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(CalificacionEmpleado.class)) {
					this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.setCalificacionEmpleados(formatonomipreguntanomi.getCalificacionEmpleados());
					this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCalificacionEmpleado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
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
										
				FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formatonomipreguntanomi,new Object(),generalEntityParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.formatonomipreguntanomiSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=FormatoNomiPreguntaNomiConstantesFunciones.getClassesRelationshipsOfFormatoNomiPreguntaNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=FormatoNomiPreguntaNomiConstantesFunciones.getClassesRelationshipsFromStringsOfFormatoNomiPreguntaNomi(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormFormatoNomiPreguntaNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formatonomipreguntanomi,new Object(),generalEntityParameterGeneral,this.formatonomipreguntanomiReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioFormatoNomiPreguntaNomi(FormatoNomiPreguntaNomiBean formatonomipreguntanomiBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(CalificacionEmpleado.class)) {
					this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.setCalificacionEmpleados(formatonomipreguntanomi.getCalificacionEmpleados());
					this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCalificacionEmpleado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanFormatoNomiPreguntaNomi(ArrayList<Classe> classes,FormatoNomiPreguntaNomiReturnGeneral formatonomipreguntanomiReturnGeneral,FormatoNomiPreguntaNomiBean formatonomipreguntanomiBean,Boolean conDefault) throws Exception {
		
			this.formatonomipreguntanomiBean.setCalificacionEmpleados(formatonomipreguntanomiReturnGeneral.getFormatoNomiPreguntaNomi().getCalificacionEmpleados());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualFormatoNomiPreguntaNomi(FormatoNomiPreguntaNomi formatonomipreguntanomi,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(CalificacionEmpleado.class)) {
					formatonomipreguntanomi.setCalificacionEmpleados(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.calificacionempleadoLogic.getCalificacionEmpleados());
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
		if(!paraTabla && !this.permiteMantenimiento(this.formatonomipreguntanomi)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi = new FormatoNomiPreguntaNomiDetalleFormJInternalFrame(jDesktopPane,this.formatonomipreguntanomiSessionBean.getConGuardarRelaciones(),this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi);
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.setVisible(false);
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.setSelected(false);						
		
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.formatonomipreguntanomiLogic=this.formatonomipreguntanomiLogic;
		
		this.cargarCombosFrameForeignKeyFormatoNomiPreguntaNomi("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleFormatoNomiPreguntaNomi();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFormatoNomiPreguntaNomi();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyFormatoNomiPreguntaNomi("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyFormatoNomiPreguntaNomi();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFormatoNomiPreguntaNomi"));
		
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonModificarFormatoNomiPreguntaNomi.addActionListener(new ButtonActionListener(this,"ModificarFormatoNomiPreguntaNomi"));

		
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonModificarToolBarFormatoNomiPreguntaNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarFormatoNomiPreguntaNomi"));
					
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jMenuItemModificarFormatoNomiPreguntaNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarFormatoNomiPreguntaNomi"));		
		
		
		
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonActualizarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"ActualizarFormatoNomiPreguntaNomi"));
		
		
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonActualizarToolBarFormatoNomiPreguntaNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFormatoNomiPreguntaNomi"));
						
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jMenuItemActualizarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFormatoNomiPreguntaNomi"));		
		
		
		
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonEliminarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"EliminarFormatoNomiPreguntaNomi"));
		
		
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonEliminarToolBarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarFormatoNomiPreguntaNomi"));
								
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jMenuItemEliminarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFormatoNomiPreguntaNomi"));		
		
		
		
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonCancelarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"CancelarFormatoNomiPreguntaNomi"));
		
		
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonCancelarToolBarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarFormatoNomiPreguntaNomi"));
					
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jMenuItemCancelarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFormatoNomiPreguntaNomi"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jMenuItemDetalleCerrarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFormatoNomiPreguntaNomi"));		
		
		
		
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonGuardarCambiosToolBarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFormatoNomiPreguntaNomi"));
		
		
		
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonGuardarCambiosToolBarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFormatoNomiPreguntaNomi"));
		
		
		
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxTiposAccionesFormularioFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFormatoNomiPreguntaNomi"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonidFormatoNomiPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"idFormatoNomiPreguntaNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonid_empresaFormatoNomiPreguntaNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFormatoNomiPreguntaNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonid_empresaFormatoNomiPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFormatoNomiPreguntaNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonid_sucursalFormatoNomiPreguntaNomiUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalFormatoNomiPreguntaNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonid_sucursalFormatoNomiPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalFormatoNomiPreguntaNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonid_formato_nomiFormatoNomiPreguntaNomiUpdate.addActionListener(new ButtonActionListener(this,"id_formato_nomiFormatoNomiPreguntaNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonid_formato_nomiFormatoNomiPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_formato_nomiFormatoNomiPreguntaNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonid_factor_nomiFormatoNomiPreguntaNomiUpdate.addActionListener(new ButtonActionListener(this,"id_factor_nomiFormatoNomiPreguntaNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonid_factor_nomiFormatoNomiPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_factor_nomiFormatoNomiPreguntaNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonid_pregunta_nomiFormatoNomiPreguntaNomiUpdate.addActionListener(new ButtonActionListener(this,"id_pregunta_nomiFormatoNomiPreguntaNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonid_pregunta_nomiFormatoNomiPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_pregunta_nomiFormatoNomiPreguntaNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonponderacionFormatoNomiPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"ponderacionFormatoNomiPreguntaNomiBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jTabbedPaneRelacionesFormatoNomiPreguntaNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFormatoNomiPreguntaNomi"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameFormatoNomiPreguntaNomi"));
		
		if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFormatoNomiPreguntaNomi"));
		}
		
		this.jTableDatosFormatoNomiPreguntaNomi.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarFormatoNomiPreguntaNomi"));
		
		this.jTableDatosFormatoNomiPreguntaNomi.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarFormatoNomiPreguntaNomi"));
		
		this.jButtonNuevoFormatoNomiPreguntaNomi.addActionListener(new ButtonActionListener(this,"NuevoFormatoNomiPreguntaNomi"));
		
		this.jButtonDuplicarFormatoNomiPreguntaNomi.addActionListener(new ButtonActionListener(this,"DuplicarFormatoNomiPreguntaNomi"));
		
		this.jButtonCopiarFormatoNomiPreguntaNomi.addActionListener(new ButtonActionListener(this,"CopiarFormatoNomiPreguntaNomi"));
		
		this.jButtonVerFormFormatoNomiPreguntaNomi.addActionListener(new ButtonActionListener(this,"VerFormFormatoNomiPreguntaNomi"));
		
		
		this.jButtonNuevoToolBarFormatoNomiPreguntaNomi.addActionListener(new ButtonActionListener(this,"NuevoToolBarFormatoNomiPreguntaNomi"));
			
		this.jButtonDuplicarToolBarFormatoNomiPreguntaNomi.addActionListener(new ButtonActionListener(this,"DuplicarToolBarFormatoNomiPreguntaNomi"));
			
		this.jMenuItemNuevoFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoFormatoNomiPreguntaNomi"));
			
		this.jMenuItemDuplicarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarFormatoNomiPreguntaNomi"));		
		
		
		this.jButtonNuevoRelacionesFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"NuevoRelacionesFormatoNomiPreguntaNomi"));
		
		
		this.jButtonNuevoRelacionesToolBarFormatoNomiPreguntaNomi.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarFormatoNomiPreguntaNomi"));
			
		this.jMenuItemNuevoRelacionesFormatoNomiPreguntaNomi.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesFormatoNomiPreguntaNomi"));		
		
		
		if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonModificarFormatoNomiPreguntaNomi.addActionListener(new ButtonActionListener(this,"ModificarFormatoNomiPreguntaNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonModificarToolBarFormatoNomiPreguntaNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarFormatoNomiPreguntaNomi"));
			
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jMenuItemModificarFormatoNomiPreguntaNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarFormatoNomiPreguntaNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonActualizarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"ActualizarFormatoNomiPreguntaNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonActualizarToolBarFormatoNomiPreguntaNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFormatoNomiPreguntaNomi"));
				
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jMenuItemActualizarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFormatoNomiPreguntaNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonEliminarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"EliminarFormatoNomiPreguntaNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonEliminarToolBarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarFormatoNomiPreguntaNomi"));
						
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jMenuItemEliminarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFormatoNomiPreguntaNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonCancelarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"CancelarFormatoNomiPreguntaNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonCancelarToolBarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarFormatoNomiPreguntaNomi"));
			
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jMenuItemCancelarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFormatoNomiPreguntaNomi"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarFormatoNomiPreguntaNomi"));		
		
		
		this.jButtonCerrarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"CerrarFormatoNomiPreguntaNomi"));
		
		
		this.jButtonCerrarToolBarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"CerrarToolBarFormatoNomiPreguntaNomi"));
			
		this.jMenuItemCerrarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemCerrarFormatoNomiPreguntaNomi"));
			
		if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jMenuItemDetalleCerrarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFormatoNomiPreguntaNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonGuardarCambiosFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosFormatoNomiPreguntaNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonGuardarCambiosToolBarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFormatoNomiPreguntaNomi"));
		}
		
		this.jButtonCopiarToolBarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"CopiarToolBarFormatoNomiPreguntaNomi"));
			
		this.jButtonVerFormToolBarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"VerFormToolBarFormatoNomiPreguntaNomi"));
		
		this.jMenuItemGuardarCambiosFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosFormatoNomiPreguntaNomi"));
			
		this.jMenuItemCopiarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemCopiarFormatoNomiPreguntaNomi"));		
		
		this.jMenuItemVerFormFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemVerFormFormatoNomiPreguntaNomi"));		
		
		
		this.jButtonGuardarCambiosTablaFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFormatoNomiPreguntaNomi"));
		
		
		this.jButtonGuardarCambiosTablaToolBarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarFormatoNomiPreguntaNomi"));
			
		this.jMenuItemGuardarCambiosTablaFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFormatoNomiPreguntaNomi"));		
		
		
		
		this.jButtonRecargarInformacionFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionFormatoNomiPreguntaNomi"));
					
		this.jButtonRecargarInformacionToolBarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarFormatoNomiPreguntaNomi"));
		
		this.jMenuItemRecargarInformacionFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionFormatoNomiPreguntaNomi"));		
		
		
		
		this.jButtonAnterioresFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"AnterioresFormatoNomiPreguntaNomi"));
		
		
		this.jButtonAnterioresToolBarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"AnterioresToolBarFormatoNomiPreguntaNomi"));
		
		this.jMenuItemAnterioresFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresFormatoNomiPreguntaNomi"));		
		
		
		this.jButtonSiguientesFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"SiguientesFormatoNomiPreguntaNomi"));
		
		
		this.jButtonSiguientesToolBarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"SiguientesToolBarFormatoNomiPreguntaNomi"));
			
		this.jMenuItemSiguientesFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesFormatoNomiPreguntaNomi"));
			
		this.jMenuItemAbrirOrderByFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByFormatoNomiPreguntaNomi"));
			
		this.jMenuItemMostrarOcultarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarFormatoNomiPreguntaNomi"));
			
		this.jMenuItemDetalleAbrirOrderByFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByFormatoNomiPreguntaNomi"));
			
		this.jMenuItemDetalleMostarOcultarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarFormatoNomiPreguntaNomi"));		
		
		
		this.jButtonNuevoGuardarCambiosFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosFormatoNomiPreguntaNomi"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarFormatoNomiPreguntaNomi"));
			
		this.jMenuItemNuevoGuardarCambiosFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosFormatoNomiPreguntaNomi"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosFormatoNomiPreguntaNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosFormatoNomiPreguntaNomi"));

		this.jCheckBoxSeleccionadosFormatoNomiPreguntaNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionadosFormatoNomiPreguntaNomi"));
		
		if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxTiposAccionesFormularioFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFormatoNomiPreguntaNomi"));
		}
		
		
		this.jComboBoxTiposRelacionesFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"TiposRelacionesFormatoNomiPreguntaNomi"));
			
		this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormatoNomiPreguntaNomi"));
					
		this.jComboBoxTiposSeleccionarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"TiposSeleccionarFormatoNomiPreguntaNomi"));
			
		this.jTextFieldValorCampoGeneralFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralFormatoNomiPreguntaNomi"));		
		
		
		if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonidFormatoNomiPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"idFormatoNomiPreguntaNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonid_empresaFormatoNomiPreguntaNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFormatoNomiPreguntaNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonid_empresaFormatoNomiPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFormatoNomiPreguntaNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonid_sucursalFormatoNomiPreguntaNomiUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalFormatoNomiPreguntaNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonid_sucursalFormatoNomiPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalFormatoNomiPreguntaNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonid_formato_nomiFormatoNomiPreguntaNomiUpdate.addActionListener(new ButtonActionListener(this,"id_formato_nomiFormatoNomiPreguntaNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonid_formato_nomiFormatoNomiPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_formato_nomiFormatoNomiPreguntaNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonid_factor_nomiFormatoNomiPreguntaNomiUpdate.addActionListener(new ButtonActionListener(this,"id_factor_nomiFormatoNomiPreguntaNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonid_factor_nomiFormatoNomiPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_factor_nomiFormatoNomiPreguntaNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonid_pregunta_nomiFormatoNomiPreguntaNomiUpdate.addActionListener(new ButtonActionListener(this,"id_pregunta_nomiFormatoNomiPreguntaNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonid_pregunta_nomiFormatoNomiPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_pregunta_nomiFormatoNomiPreguntaNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonponderacionFormatoNomiPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"ponderacionFormatoNomiPreguntaNomiBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdFactorNomiFormatoNomiPreguntaNomi.addActionListener(new ButtonActionListener(this,"FK_IdFactorNomiFormatoNomiPreguntaNomi"));

			this.jButtonFK_IdFormatoNomiFormatoNomiPreguntaNomi.addActionListener(new ButtonActionListener(this,"FK_IdFormatoNomiFormatoNomiPreguntaNomi"));

			this.jButtonFK_IdPreguntaNomiFormatoNomiPreguntaNomi.addActionListener(new ButtonActionListener(this,"FK_IdPreguntaNomiFormatoNomiPreguntaNomi"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi!=null) {
				this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFormatoNomiPreguntaNomi"));
				this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFormatoNomiPreguntaNomi"));
				this.jInternalFrameReporteDinamicoFormatoNomiPreguntaNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFormatoNomiPreguntaNomi"));
			}
			
			//this.jButtonCerrarReporteDinamicoFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFormatoNomiPreguntaNomi"));				
			//this.jButtonGenerarReporteDinamicoFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFormatoNomiPreguntaNomi"));
			//this.jButtonGenerarExcelReporteDinamicoFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFormatoNomiPreguntaNomi"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionFormatoNomiPreguntaNomi!=null) {
				this.jInternalFrameImportacionFormatoNomiPreguntaNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFormatoNomiPreguntaNomi"));
				this.jInternalFrameImportacionFormatoNomiPreguntaNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFormatoNomiPreguntaNomi"));
				this.jInternalFrameImportacionFormatoNomiPreguntaNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFormatoNomiPreguntaNomi"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByFormatoNomiPreguntaNomi"));
			
			this.jButtonAbrirOrderByToolBarFormatoNomiPreguntaNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarFormatoNomiPreguntaNomi"));			
			
			if(this.jInternalFrameOrderByFormatoNomiPreguntaNomi!=null) {
				this.jInternalFrameOrderByFormatoNomiPreguntaNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFormatoNomiPreguntaNomi"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jTabbedPaneRelacionesFormatoNomiPreguntaNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFormatoNomiPreguntaNomi"));
		
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
            		closingInternalFrameFormatoNomiPreguntaNomi();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormFormatoNomiPreguntaNomi = (JInternalFrameBase)event.getSource();
	            	
	            FormatoNomiPreguntaNomiBeanSwingJInternalFrame jInternalFrameParent=(FormatoNomiPreguntaNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormFormatoNomiPreguntaNomi.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarFormatoNomiPreguntaNomiActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosFormatoNomiPreguntaNomi.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosFormatoNomiPreguntaNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosFormatoNomiPreguntaNomi.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosFormatoNomiPreguntaNomi.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormatoNomiPreguntaNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormatoNomiPreguntaNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormatoNomiPreguntaNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoFormatoNomiPreguntaNomi";
		inputMap = this.jButtonNuevoFormatoNomiPreguntaNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoFormatoNomiPreguntaNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFormatoNomiPreguntaNomiActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormatoNomiPreguntaNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormatoNomiPreguntaNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormatoNomiPreguntaNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesFormatoNomiPreguntaNomi";
		inputMap = this.jButtonNuevoRelacionesFormatoNomiPreguntaNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesFormatoNomiPreguntaNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFormatoNomiPreguntaNomiActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarFormatoNomiPreguntaNomi";
		inputMap = this.jButtonModificarFormatoNomiPreguntaNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarFormatoNomiPreguntaNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarFormatoNomiPreguntaNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarFormatoNomiPreguntaNomi";
		inputMap = this.jButtonActualizarFormatoNomiPreguntaNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarFormatoNomiPreguntaNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarFormatoNomiPreguntaNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarFormatoNomiPreguntaNomi";
		inputMap = this.jButtonEliminarFormatoNomiPreguntaNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarFormatoNomiPreguntaNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarFormatoNomiPreguntaNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarFormatoNomiPreguntaNomi";
		inputMap = this.jButtonCancelarFormatoNomiPreguntaNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarFormatoNomiPreguntaNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarFormatoNomiPreguntaNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarFormatoNomiPreguntaNomi";
		inputMap = this.jButtonCerrarFormatoNomiPreguntaNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarFormatoNomiPreguntaNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarFormatoNomiPreguntaNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonGuardarCambiosFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosFormatoNomiPreguntaNomi";
		inputMap = this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonGuardarCambiosFormatoNomiPreguntaNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonGuardarCambiosFormatoNomiPreguntaNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosFormatoNomiPreguntaNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosFormatoNomiPreguntaNomi.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosFormatoNomiPreguntaNomiItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesFormatoNomiPreguntaNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarFormatoNomiPreguntaNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarFormatoNomiPreguntaNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralFormatoNomiPreguntaNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralFormatoNomiPreguntaNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonidFormatoNomiPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"idFormatoNomiPreguntaNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonid_empresaFormatoNomiPreguntaNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFormatoNomiPreguntaNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonid_empresaFormatoNomiPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFormatoNomiPreguntaNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonid_sucursalFormatoNomiPreguntaNomiUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalFormatoNomiPreguntaNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonid_sucursalFormatoNomiPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalFormatoNomiPreguntaNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonid_formato_nomiFormatoNomiPreguntaNomiUpdate.addActionListener(new ButtonActionListener(this,"id_formato_nomiFormatoNomiPreguntaNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonid_formato_nomiFormatoNomiPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_formato_nomiFormatoNomiPreguntaNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonid_factor_nomiFormatoNomiPreguntaNomiUpdate.addActionListener(new ButtonActionListener(this,"id_factor_nomiFormatoNomiPreguntaNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonid_factor_nomiFormatoNomiPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_factor_nomiFormatoNomiPreguntaNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonid_pregunta_nomiFormatoNomiPreguntaNomiUpdate.addActionListener(new ButtonActionListener(this,"id_pregunta_nomiFormatoNomiPreguntaNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonid_pregunta_nomiFormatoNomiPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_pregunta_nomiFormatoNomiPreguntaNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jButtonponderacionFormatoNomiPreguntaNomiBusqueda.addActionListener(new ButtonActionListener(this,"ponderacionFormatoNomiPreguntaNomiBusqueda"));
		
		
		this.jButtonFK_IdFactorNomiFormatoNomiPreguntaNomi.addActionListener(new ButtonActionListener(this,"FK_IdFactorNomiFormatoNomiPreguntaNomi"));

		this.jButtonFK_IdFormatoNomiFormatoNomiPreguntaNomi.addActionListener(new ButtonActionListener(this,"FK_IdFormatoNomiFormatoNomiPreguntaNomi"));

		this.jButtonFK_IdPreguntaNomiFormatoNomiPreguntaNomi.addActionListener(new ButtonActionListener(this,"FK_IdPreguntaNomiFormatoNomiPreguntaNomi"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionFormatoNomiPreguntaNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionFormatoNomiPreguntaNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarFormatoNomiPreguntaNomiActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarFormatoNomiPreguntaNomi.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosFormatoNomiPreguntaNomi(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(FormatoNomiPreguntaNomi formatonomipreguntanomiAux:this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis()) {
					formatonomipreguntanomiAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormatoNomiPreguntaNomi formatonomipreguntanomiAux:formatonomipreguntanomis) {
					formatonomipreguntanomiAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosFormatoNomiPreguntaNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FormatoNomiPreguntaNomi formatonomipreguntanomiAux:this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis()) {
						formatonomipreguntanomiAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FormatoNomiPreguntaNomi formatonomipreguntanomiAux:formatonomipreguntanomis) {
						formatonomipreguntanomiAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(FormatoNomiPreguntaNomi formatonomipreguntanomiAux:this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FormatoNomiPreguntaNomi formatonomipreguntanomiAux:formatonomipreguntanomis) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaFormatoNomiPreguntaNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFormatoNomiPreguntaNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFormatoNomiPreguntaNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomiPreguntaNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosFormatoNomiPreguntaNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosFormatoNomiPreguntaNomi.getSelectedRows();
			
			FormatoNomiPreguntaNomi formatonomipreguntanomiLocal=new FormatoNomiPreguntaNomi();
			
			//this.seleccionarTodosFormatoNomiPreguntaNomi(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatonomipreguntanomiLocal =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					formatonomipreguntanomiLocal =(FormatoNomiPreguntaNomi) this.formatonomipreguntanomis.toArray()[this.jTableDatosFormatoNomiPreguntaNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				formatonomipreguntanomiLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FormatoNomiPreguntaNomi formatonomipreguntanomiAux:this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis()) {
						formatonomipreguntanomiAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FormatoNomiPreguntaNomi formatonomipreguntanomiAux:formatonomipreguntanomis) {
						formatonomipreguntanomiAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaFormatoNomiPreguntaNomi(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFormatoNomiPreguntaNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFormatoNomiPreguntaNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomiPreguntaNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualFormatoNomiPreguntaNomiItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarFormatoNomiPreguntaNomiParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralFormatoNomiPreguntaNomiActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralFormatoNomiPreguntaNomi.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FormatoNomiPreguntaNomi formatonomipreguntanomiAux:this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis()) {
				
						if(sTipoSeleccionar.equals(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_PONDERACION)) {
							existe=true;
							formatonomipreguntanomiAux.setponderacion(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormatoNomiPreguntaNomi formatonomipreguntanomiAux:formatonomipreguntanomis) {
					
						if(sTipoSeleccionar.equals(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_PONDERACION)) {
							existe=true;
							formatonomipreguntanomiAux.setponderacion(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaFormatoNomiPreguntaNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesFormatoNomiPreguntaNomiActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioFormatoNomiPreguntaNomi=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxTiposAccionesFormularioFormatoNomiPreguntaNomi.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteFormatoNomiPreguntaNomi) {				
					conSplash=true;//false;										
					
					//this.startProcessFormatoNomiPreguntaNomi(conSplash);
				
					this.generarReporteFormatoNomiPreguntaNomisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxTiposAccionesFormularioFormatoNomiPreguntaNomi.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoFormatoNomiPreguntaNomisSeleccionados();
				//this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFormatoNomiPreguntaNomisSeleccionados(false);
				//this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFormatoNomiPreguntaNomisSeleccionados(true);
				//this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFormatoNomiPreguntaNomi();
				
				this.exportarFormatoNomiPreguntaNomisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxTiposAccionesFormularioFormatoNomiPreguntaNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionFormatoNomiPreguntaNomis();
				//this.importarFormatoNomiPreguntaNomis();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxTiposAccionesFormularioFormatoNomiPreguntaNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFormatoNomiPreguntaNomi();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelFormatoNomiPreguntaNomisSeleccionados();
				//this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Formato Nomi Pregunta Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessFormatoNomiPreguntaNomi();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoFormatoNomiPreguntaNomi)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyFormatoNomiPreguntaNomi(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Formato Nomi Pregunta Nomi",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxTiposAccionesFormularioFormatoNomiPreguntaNomi.setSelectedIndex(0);					
				}	
			} 			
			else if(FormatoNomiPreguntaNomiBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteFormatoNomiPreguntaNomi) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessFormatoNomiPreguntaNomi(conSplash);
					
						//this.actualizarParametrosGeneralFormatoNomiPreguntaNomi();
						
						this.generarReporteProcesoAccionFormatoNomiPreguntaNomisSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxTiposAccionesFormularioFormatoNomiPreguntaNomi.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Formato Nomi Pregunta NomiS SELECCIONADOS?", "MANTENIMIENTO DE Formato Nomi Pregunta Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessFormatoNomiPreguntaNomi();
				
						this.actualizarParametrosGeneralFormatoNomiPreguntaNomi();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.formatonomipreguntanomiReturnGeneral=formatonomipreguntanomiLogic.procesarAccionFormatoNomiPreguntaNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis(),this.formatonomipreguntanomiParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarFormatoNomiPreguntaNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxTiposAccionesFormularioFormatoNomiPreguntaNomi.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralFormatoNomiPreguntaNomi();
					
					FormatoNomiPreguntaNomiBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarFormatoNomiPreguntaNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFormatoNomiPreguntaNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxTiposAccionesFormularioFormatoNomiPreguntaNomi.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessFormatoNomiPreguntaNomi(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesFormatoNomiPreguntaNomiActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessFormatoNomiPreguntaNomi();
			
			if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<FormatoNomiPreguntaNomi> formatonomipreguntanomisSeleccionados=new ArrayList<FormatoNomiPreguntaNomi>();		
			FormatoNomiPreguntaNomi formatonomipreguntanomi=new FormatoNomiPreguntaNomi();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesFormatoNomiPreguntaNomi.getSelectedItem();
			
			
			
			
			formatonomipreguntanomisSeleccionados=this.getFormatoNomiPreguntaNomisSeleccionados(true);
			//this.sTipoAccion;
			
			if(formatonomipreguntanomisSeleccionados.size()==1) {
				for(FormatoNomiPreguntaNomi formatonomipreguntanomiAux:formatonomipreguntanomisSeleccionados) {
					formatonomipreguntanomi=formatonomipreguntanomiAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Calificacion Empleado")) {
					jButtonCalificacionEmpleadoActionPerformed(null,rowIndex,true,false,formatonomipreguntanomi);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessFormatoNomiPreguntaNomi();
			
      		//this.finishProcessFormatoNomiPreguntaNomi(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarFormatoNomiPreguntaNomiReturnGeneral() throws Exception {
		if(this.formatonomipreguntanomiReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.formatonomipreguntanomiReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.formatonomipreguntanomiReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.formatonomipreguntanomiReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.formatonomipreguntanomiReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.formatonomipreguntanomiReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false);
		}
		
		if(this.formatonomipreguntanomiReturnGeneral.getConRetornoLista() || this.formatonomipreguntanomiReturnGeneral.getConRetornoObjeto()) {
			if(this.formatonomipreguntanomiReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.formatonomipreguntanomiLogic.setFormatoNomiPreguntaNomis(this.formatonomipreguntanomiReturnGeneral.getFormatoNomiPreguntaNomis());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.formatonomipreguntanomiReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.formatonomipreguntanomiLogic.setFormatoNomiPreguntaNomi(this.formatonomipreguntanomiReturnGeneral.getFormatoNomiPreguntaNomi());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingFormatoNomiPreguntaNomi(false);
		}
	}
	
	public void actualizarParametrosGeneralFormatoNomiPreguntaNomi() throws Exception {
		
		
	}
	
	public ArrayList<FormatoNomiPreguntaNomi> getFormatoNomiPreguntaNomisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<FormatoNomiPreguntaNomi> formatonomipreguntanomisSeleccionados=new ArrayList<FormatoNomiPreguntaNomi>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioFormatoNomiPreguntaNomi) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(FormatoNomiPreguntaNomi formatonomipreguntanomiAux:formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis()) {
					if(formatonomipreguntanomiAux.getIsSelected()) {
						formatonomipreguntanomisSeleccionados.add(formatonomipreguntanomiAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormatoNomiPreguntaNomi formatonomipreguntanomiAux:this.formatonomipreguntanomis) {
					if(formatonomipreguntanomiAux.getIsSelected()) {
						formatonomipreguntanomisSeleccionados.add(formatonomipreguntanomiAux);				
					}
				}
			}
			
			if(formatonomipreguntanomisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						formatonomipreguntanomisSeleccionados.addAll(this.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						formatonomipreguntanomisSeleccionados.addAll(this.formatonomipreguntanomis);				
					}
				}
			}
		} else {
			formatonomipreguntanomisSeleccionados.add(this.formatonomipreguntanomi);
		}
		
		return formatonomipreguntanomisSeleccionados;
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
	
	public void generarReporteFormatoNomiPreguntaNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalFormatoNomiPreguntaNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoFormatoNomiPreguntaNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFormatoNomiPreguntaNomisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFormatoNomiPreguntaNomisSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesFormatoNomiPreguntaNomisSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Formato Nomi Pregunta Nomi",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesFormatoNomiPreguntaNomisSeleccionados() throws Exception {
		ArrayList<FormatoNomiPreguntaNomi> formatonomipreguntanomisSeleccionados=new ArrayList<FormatoNomiPreguntaNomi>();		
		
		formatonomipreguntanomisSeleccionados=this.getFormatoNomiPreguntaNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteFormatoNomiPreguntaNomis("Todos",formatonomipreguntanomisSeleccionados);
		
	}	
	
	public void generarReporteNormalFormatoNomiPreguntaNomisSeleccionados() throws Exception {
		ArrayList<FormatoNomiPreguntaNomi> formatonomipreguntanomisSeleccionados=new ArrayList<FormatoNomiPreguntaNomi>();		
		
		formatonomipreguntanomisSeleccionados=this.getFormatoNomiPreguntaNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteFormatoNomiPreguntaNomis("Todos",formatonomipreguntanomisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionFormatoNomiPreguntaNomisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<FormatoNomiPreguntaNomi> formatonomipreguntanomisSeleccionados=new ArrayList<FormatoNomiPreguntaNomi>();
		
		formatonomipreguntanomisSeleccionados=this.getFormatoNomiPreguntaNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteFormatoNomiPreguntaNomis("Todos",formatonomipreguntanomisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoFormatoNomiPreguntaNomisSeleccionados() throws Exception {
		ArrayList<FormatoNomiPreguntaNomi> formatonomipreguntanomisSeleccionados=new ArrayList<FormatoNomiPreguntaNomi>();		
		
		
		this.abrirInicializarFrameReporteDinamicoFormatoNomiPreguntaNomi();
		
		
		formatonomipreguntanomisSeleccionados=this.getFormatoNomiPreguntaNomisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoFormatoNomiPreguntaNomi();
		
		
		//this.generarReporteFormatoNomiPreguntaNomis("Todos",formatonomipreguntanomisSeleccionados ,formatonomipreguntanomiImplementable,formatonomipreguntanomiImplementableHome);
	}
	
	public void mostrarImportacionFormatoNomiPreguntaNomis() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionFormatoNomiPreguntaNomi();
		
		this.abrirFrameImportacionFormatoNomiPreguntaNomi();		
		
			
		//this.generarReporteFormatoNomiPreguntaNomis("Todos",formatonomipreguntanomisSeleccionados ,formatonomipreguntanomiImplementable,formatonomipreguntanomiImplementableHome);
	}
	
	public void importarFormatoNomiPreguntaNomis() throws Exception {		
	
	}
	
	public void exportarFormatoNomiPreguntaNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelFormatoNomiPreguntaNomisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoFormatoNomiPreguntaNomisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlFormatoNomiPreguntaNomisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Formato Nomi Pregunta Nomi",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoFormatoNomiPreguntaNomisSeleccionados() throws Exception {
		ArrayList<FormatoNomiPreguntaNomi> formatonomipreguntanomisSeleccionados=new ArrayList<FormatoNomiPreguntaNomi>();		
		
		formatonomipreguntanomisSeleccionados=this.getFormatoNomiPreguntaNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formatonomipreguntanomi."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarFormatoNomiPreguntaNomi(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(FormatoNomiPreguntaNomi formatonomipreguntanomiAux:formatonomipreguntanomisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarFormatoNomiPreguntaNomi(formatonomipreguntanomiAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//formatonomipreguntanomiAux.setsDetalleGeneralEntityReporte(formatonomipreguntanomiAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato Nomi Pregunta Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarFormatoNomiPreguntaNomi(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=FormatoNomiPreguntaNomiConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoNomiPreguntaNomiConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFORMATONOMI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDPREGUNTANOMI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoNomiPreguntaNomiConstantesFunciones.LABEL_PONDERACION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarFormatoNomiPreguntaNomi(FormatoNomiPreguntaNomi formatonomipreguntanomi,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=formatonomipreguntanomi.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=formatonomipreguntanomi.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=formatonomipreguntanomi.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formatonomipreguntanomi.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formatonomipreguntanomi.getformatonomi_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formatonomipreguntanomi.getfactornomi_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formatonomipreguntanomi.getpreguntanomi_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formatonomipreguntanomi.getponderacion().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelFormatoNomiPreguntaNomisSeleccionados() throws Exception {
		ArrayList<FormatoNomiPreguntaNomi> formatonomipreguntanomisSeleccionados=new ArrayList<FormatoNomiPreguntaNomi>();		
		
		formatonomipreguntanomisSeleccionados=this.getFormatoNomiPreguntaNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formatonomipreguntanomi.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("FormatoNomiPreguntaNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelFormatoNomiPreguntaNomi(row);				
				iRow++;
			}				
			
			for(FormatoNomiPreguntaNomi formatonomipreguntanomiAux:formatonomipreguntanomisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelFormatoNomiPreguntaNomi(formatonomipreguntanomiAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato Nomi Pregunta Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlFormatoNomiPreguntaNomisSeleccionados() throws Exception {
		ArrayList<FormatoNomiPreguntaNomi> formatonomipreguntanomisSeleccionados=new ArrayList<FormatoNomiPreguntaNomi>();		
		
		formatonomipreguntanomisSeleccionados=this.getFormatoNomiPreguntaNomisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formatonomipreguntanomi.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("formatonomipreguntanomis");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("formatonomipreguntanomi");
			//elementRoot.appendChild(element);
		
			for(FormatoNomiPreguntaNomi formatonomipreguntanomiAux:formatonomipreguntanomisSeleccionados) {
				element = document.createElement("formatonomipreguntanomi");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlFormatoNomiPreguntaNomi(formatonomipreguntanomiAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato Nomi Pregunta Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelFormatoNomiPreguntaNomi(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFORMATONOMI);
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI);
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDPREGUNTANOMI);
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_PONDERACION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelFormatoNomiPreguntaNomi(FormatoNomiPreguntaNomi formatonomipreguntanomi,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(formatonomipreguntanomi.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(formatonomipreguntanomi.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formatonomipreguntanomi.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formatonomipreguntanomi.getformatonomi_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formatonomipreguntanomi.getfactornomi_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formatonomipreguntanomi.getpreguntanomi_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formatonomipreguntanomi.getponderacion());				
	}
	
	public void setFilaDatosExportarXmlFormatoNomiPreguntaNomi(FormatoNomiPreguntaNomi formatonomipreguntanomi,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(FormatoNomiPreguntaNomiConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(formatonomipreguntanomi.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(FormatoNomiPreguntaNomiConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(formatonomipreguntanomi.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(FormatoNomiPreguntaNomiConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(formatonomipreguntanomi.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(FormatoNomiPreguntaNomiConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(formatonomipreguntanomi.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementformatonomi_descripcion = document.createElement(FormatoNomiPreguntaNomiConstantesFunciones.IDFORMATONOMI);
		elementformatonomi_descripcion.appendChild(document.createTextNode(formatonomipreguntanomi.getformatonomi_descripcion()));
		element.appendChild(elementformatonomi_descripcion);

		Element elementfactornomi_descripcion = document.createElement(FormatoNomiPreguntaNomiConstantesFunciones.IDFACTORNOMI);
		elementfactornomi_descripcion.appendChild(document.createTextNode(formatonomipreguntanomi.getfactornomi_descripcion()));
		element.appendChild(elementfactornomi_descripcion);

		Element elementpreguntanomi_descripcion = document.createElement(FormatoNomiPreguntaNomiConstantesFunciones.IDPREGUNTANOMI);
		elementpreguntanomi_descripcion.appendChild(document.createTextNode(formatonomipreguntanomi.getpreguntanomi_descripcion()));
		element.appendChild(elementpreguntanomi_descripcion);

		Element elementponderacion = document.createElement(FormatoNomiPreguntaNomiConstantesFunciones.PONDERACION);
		elementponderacion.appendChild(document.createTextNode(formatonomipreguntanomi.getponderacion().toString().trim()));
		element.appendChild(elementponderacion);
	}
	
	public void generarReporteGroupGenericoFormatoNomiPreguntaNomisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<FormatoNomiPreguntaNomi> formatonomipreguntanomisSeleccionados=new ArrayList<FormatoNomiPreguntaNomi>();
		
		formatonomipreguntanomisSeleccionados=this.getFormatoNomiPreguntaNomisSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoFormatoNomiPreguntaNomi(formatonomipreguntanomisSeleccionados);
		
		this.generarReporteFormatoNomiPreguntaNomis("Todos",formatonomipreguntanomisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoFormatoNomiPreguntaNomi(ArrayList<FormatoNomiPreguntaNomi> formatonomipreguntanomisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(FormatoNomiPreguntaNomi formatonomipreguntanomiAux:formatonomipreguntanomisSeleccionados) {
				formatonomipreguntanomiAux.setsDetalleGeneralEntityReporte(formatonomipreguntanomiAux.toString());
			
				if(sTipoSeleccionar.equals(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					formatonomipreguntanomiAux.setsDescripcionGeneralEntityReporte1(formatonomipreguntanomiAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					formatonomipreguntanomiAux.setsDescripcionGeneralEntityReporte1(formatonomipreguntanomiAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFORMATONOMI)) {
					existe=true;
					formatonomipreguntanomiAux.setsDescripcionGeneralEntityReporte1(formatonomipreguntanomiAux.getformatonomi_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDFACTORNOMI)) {
					existe=true;
					formatonomipreguntanomiAux.setsDescripcionGeneralEntityReporte1(formatonomipreguntanomiAux.getfactornomi_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormatoNomiPreguntaNomiConstantesFunciones.LABEL_IDPREGUNTANOMI)) {
					existe=true;
					formatonomipreguntanomiAux.setsDescripcionGeneralEntityReporte1(formatonomipreguntanomiAux.getpreguntanomi_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesFormatoNomiPreguntaNomi(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoFormatoNomiPreguntaNomi=true;
				this.isVisibilidadCeldaNuevoRelacionesFormatoNomiPreguntaNomi=true;
				this.isVisibilidadCeldaGuardarCambiosFormatoNomiPreguntaNomi=true;
			}
			
			this.isVisibilidadCeldaModificarFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaActualizarFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaEliminarFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaCancelarFormatoNomiPreguntaNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormatoNomiPreguntaNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarFormatoNomiPreguntaNomi=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaGuardarCambiosFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaModificarFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaActualizarFormatoNomiPreguntaNomi=true;
			this.isVisibilidadCeldaEliminarFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaCancelarFormatoNomiPreguntaNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormatoNomiPreguntaNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarFormatoNomiPreguntaNomi=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaGuardarCambiosFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaModificarFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaActualizarFormatoNomiPreguntaNomi=true;
			this.isVisibilidadCeldaEliminarFormatoNomiPreguntaNomi=true;
			this.isVisibilidadCeldaCancelarFormatoNomiPreguntaNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormatoNomiPreguntaNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarFormatoNomiPreguntaNomi=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaGuardarCambiosFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaModificarFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaActualizarFormatoNomiPreguntaNomi=true;
			this.isVisibilidadCeldaEliminarFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaCancelarFormatoNomiPreguntaNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormatoNomiPreguntaNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarFormatoNomiPreguntaNomi=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoFormatoNomiPreguntaNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomiPreguntaNomi=true;
			this.isVisibilidadCeldaGuardarCambiosFormatoNomiPreguntaNomi=true;
			this.isVisibilidadCeldaModificarFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaActualizarFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaEliminarFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaCancelarFormatoNomiPreguntaNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormatoNomiPreguntaNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarFormatoNomiPreguntaNomi=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaGuardarCambiosFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaActualizarFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaEliminarFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaCancelarFormatoNomiPreguntaNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormatoNomiPreguntaNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarFormatoNomiPreguntaNomi=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaGuardarCambiosFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaModificarFormatoNomiPreguntaNomi=true;
			this.isVisibilidadCeldaActualizarFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaEliminarFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaCancelarFormatoNomiPreguntaNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormatoNomiPreguntaNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarFormatoNomiPreguntaNomi=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(FormatoNomiPreguntaNomiJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoFormatoNomiPreguntaNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomiPreguntaNomi=true;
			this.isVisibilidadCeldaGuardarCambiosFormatoNomiPreguntaNomi=true;
		} else {
			this.actualizarEstadoPanelsFormatoNomiPreguntaNomi(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarFormatoNomiPreguntaNomi=false;
			//this.isVisibilidadCeldaVerFormFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaDuplicarFormatoNomiPreguntaNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!formatonomipreguntanomiSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomiPreguntaNomi=false;
		} else {
			this.isVisibilidadCeldaNuevoFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaGuardarCambiosFormatoNomiPreguntaNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
			if(!formatonomipreguntanomiSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesFormatoNomiPreguntaNomi=false;												
			}
			
			this.jButtonCerrarFormatoNomiPreguntaNomi.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomiPreguntaNomi=false;
		}
		
		if(!this.permiteMantenimiento(this.formatonomipreguntanomi)) {
			this.isVisibilidadCeldaActualizarFormatoNomiPreguntaNomi=false;
			this.isVisibilidadCeldaEliminarFormatoNomiPreguntaNomi=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesFormatoNomiPreguntaNomi() {
		this.isVisibilidadCeldaNuevoFormatoNomiPreguntaNomi=false;
		this.isVisibilidadCeldaGuardarCambiosFormatoNomiPreguntaNomi=false;
	}
	
	public void actualizarEstadoPanelsFormatoNomiPreguntaNomi(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionFormatoNomiPreguntaNomi!=null) {
				this.jScrollPanelDatosEdicionFormatoNomiPreguntaNomi.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi!=null) {
				this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormatoNomiPreguntaNomi!=null) {
				this.jScrollPanelDatosFormatoNomiPreguntaNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormatoNomiPreguntaNomi!=null) {
				this.jPanelPaginacionFormatoNomiPreguntaNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormatoNomiPreguntaNomi!=null) {
				this.jPanelParametrosReportesFormatoNomiPreguntaNomi.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionFormatoNomiPreguntaNomi!=null) {
				this.jScrollPanelDatosEdicionFormatoNomiPreguntaNomi.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi!=null) {
				this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosFormatoNomiPreguntaNomi!=null) {
				this.jScrollPanelDatosFormatoNomiPreguntaNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionFormatoNomiPreguntaNomi!=null) {
				this.jPanelPaginacionFormatoNomiPreguntaNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFormatoNomiPreguntaNomi!=null) {
				this.jPanelParametrosReportesFormatoNomiPreguntaNomi.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionFormatoNomiPreguntaNomi!=null) {
				this.jScrollPanelDatosEdicionFormatoNomiPreguntaNomi.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi!=null) {
				this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFormatoNomiPreguntaNomi!=null) {
				this.jScrollPanelDatosFormatoNomiPreguntaNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionFormatoNomiPreguntaNomi!=null) {
				this.jPanelPaginacionFormatoNomiPreguntaNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFormatoNomiPreguntaNomi!=null) {
				this.jPanelParametrosReportesFormatoNomiPreguntaNomi.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionFormatoNomiPreguntaNomi!=null) {
				this.jScrollPanelDatosEdicionFormatoNomiPreguntaNomi.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi!=null) {
				this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFormatoNomiPreguntaNomi!=null) {
				this.jScrollPanelDatosFormatoNomiPreguntaNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionFormatoNomiPreguntaNomi!=null) {
				this.jPanelPaginacionFormatoNomiPreguntaNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFormatoNomiPreguntaNomi!=null) {
				this.jPanelParametrosReportesFormatoNomiPreguntaNomi.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionFormatoNomiPreguntaNomi!=null) {
				this.jScrollPanelDatosEdicionFormatoNomiPreguntaNomi.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi!=null) {
				this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormatoNomiPreguntaNomi!=null) {
				this.jScrollPanelDatosFormatoNomiPreguntaNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormatoNomiPreguntaNomi!=null) {
				this.jPanelPaginacionFormatoNomiPreguntaNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormatoNomiPreguntaNomi!=null) {
				this.jPanelParametrosReportesFormatoNomiPreguntaNomi.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionFormatoNomiPreguntaNomi!=null) {
				this.jScrollPanelDatosEdicionFormatoNomiPreguntaNomi.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi!=null) {
				this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormatoNomiPreguntaNomi!=null) {
				this.jScrollPanelDatosFormatoNomiPreguntaNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormatoNomiPreguntaNomi!=null) {
				this.jPanelPaginacionFormatoNomiPreguntaNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormatoNomiPreguntaNomi!=null) {
				this.jPanelParametrosReportesFormatoNomiPreguntaNomi.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionFormatoNomiPreguntaNomi!=null) {
				this.jScrollPanelDatosEdicionFormatoNomiPreguntaNomi.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi!=null) {
				this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormatoNomiPreguntaNomi!=null) {
				this.jScrollPanelDatosFormatoNomiPreguntaNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormatoNomiPreguntaNomi!=null) {
				this.jPanelPaginacionFormatoNomiPreguntaNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormatoNomiPreguntaNomi!=null) {
				this.jPanelParametrosReportesFormatoNomiPreguntaNomi.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi!=null) {
					this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesFormatoNomiPreguntaNomi!=null) {
				this.jPanelParametrosReportesFormatoNomiPreguntaNomi.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi!=null) {
				this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesFormatoNomiPreguntaNomi!=null) {
				this.jPanelParametrosReportesFormatoNomiPreguntaNomi.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdFactorNomi=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdFactorNomi) {this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.remove(jPanelFK_IdFactorNomiFormatoNomiPreguntaNomi);}

			this.isVisibilidadFK_IdFormatoNomi=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdFormatoNomi) {this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.remove(jPanelFK_IdFormatoNomiFormatoNomiPreguntaNomi);}

			this.isVisibilidadFK_IdPreguntaNomi=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdPreguntaNomi) {this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.remove(jPanelFK_IdPreguntaNomiFormatoNomiPreguntaNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdFactorNomi=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdFactorNomi) {this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.remove(jPanelFK_IdFactorNomiFormatoNomiPreguntaNomi);}

			this.isVisibilidadFK_IdFormatoNomi=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdFormatoNomi) {this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.remove(jPanelFK_IdFormatoNomiFormatoNomiPreguntaNomi);}

			this.isVisibilidadFK_IdPreguntaNomi=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdPreguntaNomi) {this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.remove(jPanelFK_IdPreguntaNomiFormatoNomiPreguntaNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaFormatoNomi(Boolean isParaFormatoNomi){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFormatoNomiNegation=!isParaFormatoNomi;

			this.isVisibilidadFK_IdFactorNomi=isParaFormatoNomiNegation;
			if(!this.isVisibilidadFK_IdFactorNomi) {this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.remove(jPanelFK_IdFactorNomiFormatoNomiPreguntaNomi);}

			this.isVisibilidadFK_IdFormatoNomi=isParaFormatoNomi;
			if(!this.isVisibilidadFK_IdFormatoNomi) {this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.remove(jPanelFK_IdFormatoNomiFormatoNomiPreguntaNomi);}

			this.isVisibilidadFK_IdPreguntaNomi=isParaFormatoNomiNegation;
			if(!this.isVisibilidadFK_IdPreguntaNomi) {this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.remove(jPanelFK_IdPreguntaNomiFormatoNomiPreguntaNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaFactorNomi(Boolean isParaFactorNomi){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFactorNomiNegation=!isParaFactorNomi;

			this.isVisibilidadFK_IdFactorNomi=isParaFactorNomi;
			if(!this.isVisibilidadFK_IdFactorNomi) {this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.remove(jPanelFK_IdFactorNomiFormatoNomiPreguntaNomi);}

			this.isVisibilidadFK_IdFormatoNomi=isParaFactorNomiNegation;
			if(!this.isVisibilidadFK_IdFormatoNomi) {this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.remove(jPanelFK_IdFormatoNomiFormatoNomiPreguntaNomi);}

			this.isVisibilidadFK_IdPreguntaNomi=isParaFactorNomiNegation;
			if(!this.isVisibilidadFK_IdPreguntaNomi) {this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.remove(jPanelFK_IdPreguntaNomiFormatoNomiPreguntaNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaPreguntaNomi(Boolean isParaPreguntaNomi){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPreguntaNomiNegation=!isParaPreguntaNomi;

			this.isVisibilidadFK_IdFactorNomi=isParaPreguntaNomiNegation;
			if(!this.isVisibilidadFK_IdFactorNomi) {this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.remove(jPanelFK_IdFactorNomiFormatoNomiPreguntaNomi);}

			this.isVisibilidadFK_IdFormatoNomi=isParaPreguntaNomiNegation;
			if(!this.isVisibilidadFK_IdFormatoNomi) {this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.remove(jPanelFK_IdFormatoNomiFormatoNomiPreguntaNomi);}

			this.isVisibilidadFK_IdPreguntaNomi=isParaPreguntaNomi;
			if(!this.isVisibilidadFK_IdPreguntaNomi) {this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.remove(jPanelFK_IdPreguntaNomiFormatoNomiPreguntaNomi);}
		}
		
	}
	
	

	public String registrarSesionFormatoNomiPreguntaNomiParaCalificacionEmpleados() throws Exception {
		Boolean isPaginaPopupCalificacionEmpleado=false;

		try {

			if(this.formatonomipreguntanomiSessionBean==null) {
				this.formatonomipreguntanomiSessionBean=new FormatoNomiPreguntaNomiSessionBean();
			}

			if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoSessionBean==null) {
				this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoSessionBean=new CalificacionEmpleadoSessionBean();
			}

			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoSessionBean.setsPathNavegacionActual(formatonomipreguntanomiSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CalificacionEmpleadoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCalificacionEmpleado=this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCalificacionEmpleado(true);
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCalificacionEmpleado(FormatoNomiPreguntaNomiConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoSessionBean.setisBusquedaDesdeForeignKeySesionFormatoNomiPreguntaNomi(true);
			this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoSessionBean.setlidFormatoNomiPreguntaNomiActual(this.idFormatoNomiPreguntaNomiActual);

			formatonomipreguntanomiSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyFormatoNomiPreguntaNomi(true);
			formatonomipreguntanomiSessionBean.setlIdFormatoNomiPreguntaNomiActualForeignKey(this.idFormatoNomiPreguntaNomiActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//FormatoNomiPreguntaNomiSessionBean formatonomipreguntanomiSessionBean=new FormatoNomiPreguntaNomiSessionBean();
		
		if(this.formatonomipreguntanomiSessionBean==null) {
			this.formatonomipreguntanomiSessionBean=new FormatoNomiPreguntaNomiSessionBean();
		}
		
		this.formatonomipreguntanomiSessionBean.setsUltimaBusquedaFormatoNomiPreguntaNomi(this.getsAccionBusqueda());
		this.formatonomipreguntanomiSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.formatonomipreguntanomiSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			formatonomipreguntanomiSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdFactorNomi")) {
			formatonomipreguntanomiSessionBean.setid_factor_nomi(this.getid_factor_nomiFK_IdFactorNomi());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdFormatoNomi")) {
			formatonomipreguntanomiSessionBean.setid_formato_nomi(this.getid_formato_nomiFK_IdFormatoNomi());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPreguntaNomi")) {
			formatonomipreguntanomiSessionBean.setid_pregunta_nomi(this.getid_pregunta_nomiFK_IdPreguntaNomi());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			formatonomipreguntanomiSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//FormatoNomiPreguntaNomiSessionBean formatonomipreguntanomiSessionBean=new FormatoNomiPreguntaNomiSessionBean();
		
		if(this.formatonomipreguntanomiSessionBean==null) {
			this.formatonomipreguntanomiSessionBean=new FormatoNomiPreguntaNomiSessionBean();
		}
		
		if(this.formatonomipreguntanomiSessionBean.getsUltimaBusquedaFormatoNomiPreguntaNomi()!=null&&!this.formatonomipreguntanomiSessionBean.getsUltimaBusquedaFormatoNomiPreguntaNomi().equals("")) {
			this.setsAccionBusqueda(formatonomipreguntanomiSessionBean.getsUltimaBusquedaFormatoNomiPreguntaNomi());
			this.setiNumeroPaginacion(formatonomipreguntanomiSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(formatonomipreguntanomiSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(formatonomipreguntanomiSessionBean.getid_empresa());
				formatonomipreguntanomiSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdFactorNomi")) {
				this.setid_factor_nomiFK_IdFactorNomi(formatonomipreguntanomiSessionBean.getid_factor_nomi());
				formatonomipreguntanomiSessionBean.setid_factor_nomi(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdFormatoNomi")) {
				this.setid_formato_nomiFK_IdFormatoNomi(formatonomipreguntanomiSessionBean.getid_formato_nomi());
				formatonomipreguntanomiSessionBean.setid_formato_nomi(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPreguntaNomi")) {
				this.setid_pregunta_nomiFK_IdPreguntaNomi(formatonomipreguntanomiSessionBean.getid_pregunta_nomi());
				formatonomipreguntanomiSessionBean.setid_pregunta_nomi(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(formatonomipreguntanomiSessionBean.getid_sucursal());
				formatonomipreguntanomiSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.formatonomipreguntanomiSessionBean.setsUltimaBusquedaFormatoNomiPreguntaNomi("");
		this.formatonomipreguntanomiSessionBean.setiNumeroPaginacion(FormatoNomiPreguntaNomiConstantesFunciones.INUMEROPAGINACION);
		this.formatonomipreguntanomiSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaFormatoNomiPreguntaNomi(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioFormatoNomiPreguntaNomi() {
		this.updateBorderResaltarBusquedasFormularioFormatoNomiPreguntaNomi();
		this.updateVisibilidadBusquedasFormularioFormatoNomiPreguntaNomi();
		this.updateHabilitarBusquedasFormularioFormatoNomiPreguntaNomi();
	}
	
	public void updateBorderResaltarBusquedasFormularioFormatoNomiPreguntaNomi() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.getComponents().length>0) {
	

		if(this.formatonomipreguntanomiConstantesFunciones.resaltarFK_IdFactorNomiFormatoNomiPreguntaNomi!=null) {
			index= this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.indexOfComponent(this.jPanelFK_IdFactorNomiFormatoNomiPreguntaNomi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.getComponent(index);
				jPanel.setBorder(this.formatonomipreguntanomiConstantesFunciones.resaltarFK_IdFactorNomiFormatoNomiPreguntaNomi);
			}
		}

		if(this.formatonomipreguntanomiConstantesFunciones.resaltarFK_IdFormatoNomiFormatoNomiPreguntaNomi!=null) {
			index= this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.indexOfComponent(this.jPanelFK_IdFormatoNomiFormatoNomiPreguntaNomi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.getComponent(index);
				jPanel.setBorder(this.formatonomipreguntanomiConstantesFunciones.resaltarFK_IdFormatoNomiFormatoNomiPreguntaNomi);
			}
		}

		if(this.formatonomipreguntanomiConstantesFunciones.resaltarFK_IdPreguntaNomiFormatoNomiPreguntaNomi!=null) {
			index= this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.indexOfComponent(this.jPanelFK_IdPreguntaNomiFormatoNomiPreguntaNomi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.getComponent(index);
				jPanel.setBorder(this.formatonomipreguntanomiConstantesFunciones.resaltarFK_IdPreguntaNomiFormatoNomiPreguntaNomi);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioFormatoNomiPreguntaNomi() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.indexOfComponent(this.jPanelFK_IdFactorNomiFormatoNomiPreguntaNomi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.formatonomipreguntanomiConstantesFunciones.mostrarFK_IdFactorNomiFormatoNomiPreguntaNomi);
			if(!this.formatonomipreguntanomiConstantesFunciones.mostrarFK_IdFactorNomiFormatoNomiPreguntaNomi && index>-1) {
				this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.remove(index);
			}

			index= this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.indexOfComponent(this.jPanelFK_IdFormatoNomiFormatoNomiPreguntaNomi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.formatonomipreguntanomiConstantesFunciones.mostrarFK_IdFormatoNomiFormatoNomiPreguntaNomi);
			if(!this.formatonomipreguntanomiConstantesFunciones.mostrarFK_IdFormatoNomiFormatoNomiPreguntaNomi && index>-1) {
				this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.remove(index);
			}

			index= this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.indexOfComponent(this.jPanelFK_IdPreguntaNomiFormatoNomiPreguntaNomi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.formatonomipreguntanomiConstantesFunciones.mostrarFK_IdPreguntaNomiFormatoNomiPreguntaNomi);
			if(!this.formatonomipreguntanomiConstantesFunciones.mostrarFK_IdPreguntaNomiFormatoNomiPreguntaNomi && index>-1) {
				this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioFormatoNomiPreguntaNomi() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.indexOfComponent(this.jPanelFK_IdFactorNomiFormatoNomiPreguntaNomi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.formatonomipreguntanomiConstantesFunciones.activarFK_IdFactorNomiFormatoNomiPreguntaNomi);
				this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.setEnabledAt(index,this.formatonomipreguntanomiConstantesFunciones.activarFK_IdFactorNomiFormatoNomiPreguntaNomi);
			}

			index= this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.indexOfComponent(this.jPanelFK_IdFormatoNomiFormatoNomiPreguntaNomi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.formatonomipreguntanomiConstantesFunciones.activarFK_IdFormatoNomiFormatoNomiPreguntaNomi);
				this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.setEnabledAt(index,this.formatonomipreguntanomiConstantesFunciones.activarFK_IdFormatoNomiFormatoNomiPreguntaNomi);
			}

			index= this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.indexOfComponent(this.jPanelFK_IdPreguntaNomiFormatoNomiPreguntaNomi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.formatonomipreguntanomiConstantesFunciones.activarFK_IdPreguntaNomiFormatoNomiPreguntaNomi);
				this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.setEnabledAt(index,this.formatonomipreguntanomiConstantesFunciones.activarFK_IdPreguntaNomiFormatoNomiPreguntaNomi);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaFormatoNomiPreguntaNomi(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdFactorNomi")) {
			index= this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.indexOfComponent(this.jPanelFK_IdFactorNomiFormatoNomiPreguntaNomi);

			this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.getComponent(index);

			this.formatonomipreguntanomiConstantesFunciones.setResaltarFK_IdFactorNomiFormatoNomiPreguntaNomi(resaltar);

			jPanel.setBorder(this.formatonomipreguntanomiConstantesFunciones.resaltarFK_IdFactorNomiFormatoNomiPreguntaNomi);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdFormatoNomi")) {
			index= this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.indexOfComponent(this.jPanelFK_IdFormatoNomiFormatoNomiPreguntaNomi);

			this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.getComponent(index);

			this.formatonomipreguntanomiConstantesFunciones.setResaltarFK_IdFormatoNomiFormatoNomiPreguntaNomi(resaltar);

			jPanel.setBorder(this.formatonomipreguntanomiConstantesFunciones.resaltarFK_IdFormatoNomiFormatoNomiPreguntaNomi);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPreguntaNomi")) {
			index= this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.indexOfComponent(this.jPanelFK_IdPreguntaNomiFormatoNomiPreguntaNomi);

			this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormatoNomiPreguntaNomi.getComponent(index);

			this.formatonomipreguntanomiConstantesFunciones.setResaltarFK_IdPreguntaNomiFormatoNomiPreguntaNomi(resaltar);

			jPanel.setBorder(this.formatonomipreguntanomiConstantesFunciones.resaltarFK_IdPreguntaNomiFormatoNomiPreguntaNomi);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarFormatoNomiPreguntaNomi.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioFormatoNomiPreguntaNomi() throws Exception {

		if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioFormatoNomiPreguntaNomi();
		this.updateVisibilidadResaltarControlesFormularioFormatoNomiPreguntaNomi();
		this.updateHabilitarResaltarControlesFormularioFormatoNomiPreguntaNomi();
		
	}
	
	public void updateBorderResaltarControlesFormularioFormatoNomiPreguntaNomi() throws Exception {
		if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.formatonomipreguntanomiConstantesFunciones.resaltaridFormatoNomiPreguntaNomi!=null && this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jLabelidFormatoNomiPreguntaNomi.setBorder(this.formatonomipreguntanomiConstantesFunciones.resaltaridFormatoNomiPreguntaNomi);}
		if(this.formatonomipreguntanomiConstantesFunciones.resaltarid_empresaFormatoNomiPreguntaNomi!=null && this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_empresaFormatoNomiPreguntaNomi.setBorder(this.formatonomipreguntanomiConstantesFunciones.resaltarid_empresaFormatoNomiPreguntaNomi);}
		if(this.formatonomipreguntanomiConstantesFunciones.resaltarid_sucursalFormatoNomiPreguntaNomi!=null && this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_sucursalFormatoNomiPreguntaNomi.setBorder(this.formatonomipreguntanomiConstantesFunciones.resaltarid_sucursalFormatoNomiPreguntaNomi);}
		if(this.formatonomipreguntanomiConstantesFunciones.resaltarid_formato_nomiFormatoNomiPreguntaNomi!=null && this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_formato_nomiFormatoNomiPreguntaNomi.setBorder(this.formatonomipreguntanomiConstantesFunciones.resaltarid_formato_nomiFormatoNomiPreguntaNomi);}
		if(this.formatonomipreguntanomiConstantesFunciones.resaltarid_factor_nomiFormatoNomiPreguntaNomi!=null && this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_factor_nomiFormatoNomiPreguntaNomi.setBorder(this.formatonomipreguntanomiConstantesFunciones.resaltarid_factor_nomiFormatoNomiPreguntaNomi);}
		if(this.formatonomipreguntanomiConstantesFunciones.resaltarid_pregunta_nomiFormatoNomiPreguntaNomi!=null && this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomi.setBorder(this.formatonomipreguntanomiConstantesFunciones.resaltarid_pregunta_nomiFormatoNomiPreguntaNomi);}
		if(this.formatonomipreguntanomiConstantesFunciones.resaltarponderacionFormatoNomiPreguntaNomi!=null && this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jTextFieldponderacionFormatoNomiPreguntaNomi.setBorder(this.formatonomipreguntanomiConstantesFunciones.resaltarponderacionFormatoNomiPreguntaNomi);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioFormatoNomiPreguntaNomi() throws Exception {		
		if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
	
		//this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jLabelidFormatoNomiPreguntaNomi.setVisible(this.formatonomipreguntanomiConstantesFunciones.mostraridFormatoNomiPreguntaNomi);
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jPanelidFormatoNomiPreguntaNomi.setVisible(this.formatonomipreguntanomiConstantesFunciones.mostraridFormatoNomiPreguntaNomi);
		//this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_empresaFormatoNomiPreguntaNomi.setVisible(this.formatonomipreguntanomiConstantesFunciones.mostrarid_empresaFormatoNomiPreguntaNomi);
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jPanelid_empresaFormatoNomiPreguntaNomi.setVisible(this.formatonomipreguntanomiConstantesFunciones.mostrarid_empresaFormatoNomiPreguntaNomi);
		//this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_sucursalFormatoNomiPreguntaNomi.setVisible(this.formatonomipreguntanomiConstantesFunciones.mostrarid_sucursalFormatoNomiPreguntaNomi);
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jPanelid_sucursalFormatoNomiPreguntaNomi.setVisible(this.formatonomipreguntanomiConstantesFunciones.mostrarid_sucursalFormatoNomiPreguntaNomi);
		//this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_formato_nomiFormatoNomiPreguntaNomi.setVisible(this.formatonomipreguntanomiConstantesFunciones.mostrarid_formato_nomiFormatoNomiPreguntaNomi);
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jPanelid_formato_nomiFormatoNomiPreguntaNomi.setVisible(this.formatonomipreguntanomiConstantesFunciones.mostrarid_formato_nomiFormatoNomiPreguntaNomi);
		//this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_factor_nomiFormatoNomiPreguntaNomi.setVisible(this.formatonomipreguntanomiConstantesFunciones.mostrarid_factor_nomiFormatoNomiPreguntaNomi);
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jPanelid_factor_nomiFormatoNomiPreguntaNomi.setVisible(this.formatonomipreguntanomiConstantesFunciones.mostrarid_factor_nomiFormatoNomiPreguntaNomi);
		//this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomi.setVisible(this.formatonomipreguntanomiConstantesFunciones.mostrarid_pregunta_nomiFormatoNomiPreguntaNomi);
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jPanelid_pregunta_nomiFormatoNomiPreguntaNomi.setVisible(this.formatonomipreguntanomiConstantesFunciones.mostrarid_pregunta_nomiFormatoNomiPreguntaNomi);
		//this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jTextFieldponderacionFormatoNomiPreguntaNomi.setVisible(this.formatonomipreguntanomiConstantesFunciones.mostrarponderacionFormatoNomiPreguntaNomi);
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jPanelponderacionFormatoNomiPreguntaNomi.setVisible(this.formatonomipreguntanomiConstantesFunciones.mostrarponderacionFormatoNomiPreguntaNomi);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioFormatoNomiPreguntaNomi() throws Exception {
		if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi!=null) {
	
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jLabelidFormatoNomiPreguntaNomi.setEnabled(this.formatonomipreguntanomiConstantesFunciones.activaridFormatoNomiPreguntaNomi);
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_empresaFormatoNomiPreguntaNomi.setEnabled(this.formatonomipreguntanomiConstantesFunciones.activarid_empresaFormatoNomiPreguntaNomi);
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_sucursalFormatoNomiPreguntaNomi.setEnabled(this.formatonomipreguntanomiConstantesFunciones.activarid_sucursalFormatoNomiPreguntaNomi);
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_formato_nomiFormatoNomiPreguntaNomi.setEnabled(this.formatonomipreguntanomiConstantesFunciones.activarid_formato_nomiFormatoNomiPreguntaNomi);
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_factor_nomiFormatoNomiPreguntaNomi.setEnabled(this.formatonomipreguntanomiConstantesFunciones.activarid_factor_nomiFormatoNomiPreguntaNomi);
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jComboBoxid_pregunta_nomiFormatoNomiPreguntaNomi.setEnabled(this.formatonomipreguntanomiConstantesFunciones.activarid_pregunta_nomiFormatoNomiPreguntaNomi);
		this.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.jTextFieldponderacionFormatoNomiPreguntaNomi.setEnabled(this.formatonomipreguntanomiConstantesFunciones.activarponderacionFormatoNomiPreguntaNomi);
		}
	}
	
		
}