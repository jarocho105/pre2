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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.activosfijos.util.DepreciacionesConstantesFunciones;
import com.bydan.erp.activosfijos.util.report.DepreciacionesParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.report.DepreciacionesParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.report.DepreciacionesBean;
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

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.activosfijos.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.activosfijos.util.*;

import com.bydan.erp.activosfijos.util.report.*;
import com.bydan.erp.activosfijos.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.report.*;
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


import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report.*;

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
public class DepreciacionesBeanSwingJInternalFrame extends DepreciacionesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DepreciacionesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Depreciaciones> depreciacionesValidator = new ClassValidator<Depreciaciones>(Depreciaciones.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Depreciaciones depreciaciones;	
	public Depreciaciones depreciacionesAux;
	public Depreciaciones depreciacionesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Depreciaciones depreciacionesTotales;
	public Long idDepreciacionesActual;
	public Long iIdNuevoDepreciaciones=0L;
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

	public String sFinalQueryComboAnioInicio="";

	public List<Anio> anioiniciosForeignKey;

	public List<Anio> getanioiniciosForeignKey() {
		return anioiniciosForeignKey;
	}

	public void setanioiniciosForeignKey(List<Anio> anioiniciosForeignKey) {
		this.anioiniciosForeignKey = anioiniciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Anio anioinicioForeignKey;

	public Anio getanioinicioForeignKey() {
		return anioinicioForeignKey;
	}

	public void setanioinicioForeignKey(Anio anioinicioForeignKey) {
		this.anioinicioForeignKey = anioinicioForeignKey;
	}

	public String sFinalQueryComboAnioFin="";

	public List<Anio> aniofinsForeignKey;

	public List<Anio> getaniofinsForeignKey() {
		return aniofinsForeignKey;
	}

	public void setaniofinsForeignKey(List<Anio> aniofinsForeignKey) {
		this.aniofinsForeignKey = aniofinsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Anio aniofinForeignKey;

	public Anio getaniofinForeignKey() {
		return aniofinForeignKey;
	}

	public void setaniofinForeignKey(Anio aniofinForeignKey) {
		this.aniofinForeignKey = aniofinForeignKey;
	}

	public String sFinalQueryComboMesInicio="";

	public List<Mes> mesiniciosForeignKey;

	public List<Mes> getmesiniciosForeignKey() {
		return mesiniciosForeignKey;
	}

	public void setmesiniciosForeignKey(List<Mes> mesiniciosForeignKey) {
		this.mesiniciosForeignKey = mesiniciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Mes mesinicioForeignKey;

	public Mes getmesinicioForeignKey() {
		return mesinicioForeignKey;
	}

	public void setmesinicioForeignKey(Mes mesinicioForeignKey) {
		this.mesinicioForeignKey = mesinicioForeignKey;
	}

	public String sFinalQueryComboMesFin="";

	public List<Mes> mesfinsForeignKey;

	public List<Mes> getmesfinsForeignKey() {
		return mesfinsForeignKey;
	}

	public void setmesfinsForeignKey(List<Mes> mesfinsForeignKey) {
		this.mesfinsForeignKey = mesfinsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Mes mesfinForeignKey;

	public Mes getmesfinForeignKey() {
		return mesfinForeignKey;
	}

	public void setmesfinForeignKey(Mes mesfinForeignKey) {
		this.mesfinForeignKey = mesfinForeignKey;
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

	public String sFinalQueryComboMes="";

	public List<Mes> messForeignKey;

	public List<Mes> getmessForeignKey() {
		return messForeignKey;
	}

	public void setmessForeignKey(List<Mes> messForeignKey) {
		this.messForeignKey = messForeignKey;
	}

	//OBJETO FK ACTUAL
	public Mes mesForeignKey;

	public Mes getmesForeignKey() {
		return mesForeignKey;
	}

	public void setmesForeignKey(Mes mesForeignKey) {
		this.mesForeignKey = mesForeignKey;
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
	
	public Boolean isPermisoTodoDepreciaciones;
	public Boolean isPermisoNuevoDepreciaciones;
	public Boolean isPermisoActualizarDepreciaciones;
	public Boolean isPermisoActualizarOriginalDepreciaciones;
	public Boolean isPermisoEliminarDepreciaciones;
	public Boolean isPermisoGuardarCambiosDepreciaciones;
	public Boolean isPermisoConsultaDepreciaciones;
	public Boolean isPermisoBusquedaDepreciaciones;
	public Boolean isPermisoReporteDepreciaciones;
	public Boolean isPermisoPaginacionMedioDepreciaciones;
	public Boolean isPermisoPaginacionAltoDepreciaciones;
	public Boolean isPermisoPaginacionTodoDepreciaciones;
	public Boolean isPermisoCopiarDepreciaciones;
	public Boolean isPermisoVerFormDepreciaciones;
	public Boolean isPermisoDuplicarDepreciaciones;
	public Boolean isPermisoOrdenDepreciaciones;
	
	
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
	
	public DepreciacionesParameterReturnGeneral depreciacionesReturnGeneral;
	public DepreciacionesParameterReturnGeneral depreciacionesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDepreciaciones=false;
	public Boolean esParaAccionDesdeFormularioDepreciaciones=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DepreciacionesSessionBeanAdditional depreciacionesSessionBeanAdditional=null;
	
	public DepreciacionesSessionBeanAdditional getDepreciacionesSessionBeanAdditional() {
		return this.depreciacionesSessionBeanAdditional;
	}
	
	public void setDepreciacionesSessionBeanAdditional(DepreciacionesSessionBeanAdditional depreciacionesSessionBeanAdditional) {
		try {
			this.depreciacionesSessionBeanAdditional=depreciacionesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DepreciacionesBeanSwingJInternalFrameAdditional depreciacionesBeanSwingJInternalFrameAdditional=null;
	//public class DepreciacionesBeanSwingJInternalFrame
	
	public DepreciacionesBeanSwingJInternalFrameAdditional getDepreciacionesBeanSwingJInternalFrameAdditional() {
		return this.depreciacionesBeanSwingJInternalFrameAdditional;
	}
	
	public void setDepreciacionesBeanSwingJInternalFrameAdditional(DepreciacionesBeanSwingJInternalFrameAdditional depreciacionesBeanSwingJInternalFrameAdditional) {
		try {
			this.depreciacionesBeanSwingJInternalFrameAdditional=depreciacionesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DepreciacionesLogic depreciacionesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Depreciaciones depreciacionesBean;
	public DepreciacionesConstantesFunciones depreciacionesConstantesFunciones;
	//public DepreciacionesParameterReturnGeneral depreciacionesReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public AnioLogic anioinicioLogic;
	public AnioLogic aniofinLogic;
	public MesLogic mesinicioLogic;
	public MesLogic mesfinLogic;
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	
	//PARAMETROS
	
	
	//public List<Depreciaciones> depreciacioness;	
	//public List<Depreciaciones> depreciacionessEliminados;
	//public List<Depreciaciones> depreciacionessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDepreciaciones=false;
	public Boolean isVisibilidadCeldaDuplicarDepreciaciones=true;
	public Boolean isVisibilidadCeldaCopiarDepreciaciones=true;
	public Boolean isVisibilidadCeldaVerFormDepreciaciones=true;
	public Boolean isVisibilidadCeldaOrdenDepreciaciones=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDepreciaciones=false;
	public Boolean isVisibilidadCeldaModificarDepreciaciones=false;
	public Boolean isVisibilidadCeldaActualizarDepreciaciones=false;
	public Boolean isVisibilidadCeldaEliminarDepreciaciones=false;
	public Boolean isVisibilidadCeldaCancelarDepreciaciones=false;
	public Boolean isVisibilidadCeldaGuardarDepreciaciones=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDepreciaciones=false;	
	
	
	public Boolean isVisibilidadBusquedaDepreciaciones=false;
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdAnioFin=false;
	public Boolean isVisibilidadFK_IdAnioInicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdMesFin=false;
	public Boolean isVisibilidadFK_IdMesInicio=false;
	
	public Long getiIdNuevoDepreciaciones() {
		return this.iIdNuevoDepreciaciones;
	}

	public void setiIdNuevoDepreciaciones(Long iIdNuevoDepreciaciones) {
		this.iIdNuevoDepreciaciones = iIdNuevoDepreciaciones;
	}
	
	public Long getidDepreciacionesActual() {
		return this.idDepreciacionesActual;
	}

	public void setidDepreciacionesActual(Long idDepreciacionesActual) {
		this.idDepreciacionesActual = idDepreciacionesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Depreciaciones getdepreciaciones() {
		return this.depreciaciones;
	}

	public void setdepreciaciones(Depreciaciones depreciaciones) {
		this.depreciaciones = depreciaciones;
	}
	
	public Depreciaciones getdepreciacionesAux() {
		return this.depreciacionesAux;
	}

	public void setdepreciacionesAux(Depreciaciones depreciacionesAux) {
		this.depreciacionesAux = depreciacionesAux;
	}				
	
	public Depreciaciones getdepreciacionesAnterior() {
		return this.depreciacionesAnterior;
	}

	public void setdepreciacionesAnterior(Depreciaciones depreciacionesAnterior) {
		this.depreciacionesAnterior = depreciacionesAnterior;
	}	
	
	public Depreciaciones getdepreciacionesTotales() {
		return this.depreciacionesTotales;
	}

	public void setdepreciacionesTotales(Depreciaciones depreciacionesTotales) {
		this.depreciacionesTotales = depreciacionesTotales;
	}	
	
	public Depreciaciones getdepreciacionesBean() {
		return this.depreciacionesBean;
	}

	public void setdepreciacionesBean(Depreciaciones depreciacionesBean) {
		this.depreciacionesBean = depreciacionesBean;
	}	
	
	public DepreciacionesParameterReturnGeneral getdepreciacionesReturnGeneral() {
		return this.depreciacionesReturnGeneral;
	}

	public void setdepreciacionesReturnGeneral(DepreciacionesParameterReturnGeneral depreciacionesReturnGeneral) {
		this.depreciacionesReturnGeneral = depreciacionesReturnGeneral;
	}	
	
	
	public Long id_anio_inicioBusquedaDepreciaciones=-1L;

	public Long getid_anio_inicioBusquedaDepreciaciones() {
		return this.id_anio_inicioBusquedaDepreciaciones;
	}

	public void setid_anio_inicioBusquedaDepreciaciones(Long id_anio_inicioBusquedaDepreciaciones) {
		this.id_anio_inicioBusquedaDepreciaciones = id_anio_inicioBusquedaDepreciaciones;
	}

;
	public Long id_anio_finBusquedaDepreciaciones=-1L;

	public Long getid_anio_finBusquedaDepreciaciones() {
		return this.id_anio_finBusquedaDepreciaciones;
	}

	public void setid_anio_finBusquedaDepreciaciones(Long id_anio_finBusquedaDepreciaciones) {
		this.id_anio_finBusquedaDepreciaciones = id_anio_finBusquedaDepreciaciones;
	}

;
	public Long id_mes_inicioBusquedaDepreciaciones=-1L;

	public Long getid_mes_inicioBusquedaDepreciaciones() {
		return this.id_mes_inicioBusquedaDepreciaciones;
	}

	public void setid_mes_inicioBusquedaDepreciaciones(Long id_mes_inicioBusquedaDepreciaciones) {
		this.id_mes_inicioBusquedaDepreciaciones = id_mes_inicioBusquedaDepreciaciones;
	}

;
	public Long id_mes_finBusquedaDepreciaciones=-1L;

	public Long getid_mes_finBusquedaDepreciaciones() {
		return this.id_mes_finBusquedaDepreciaciones;
	}

	public void setid_mes_finBusquedaDepreciaciones(Long id_mes_finBusquedaDepreciaciones) {
		this.id_mes_finBusquedaDepreciaciones = id_mes_finBusquedaDepreciaciones;
	}

	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
	}

	public Long id_anio_finFK_IdAnioFin=-1L;

	public Long getid_anio_finFK_IdAnioFin() {
		return this.id_anio_finFK_IdAnioFin;
	}

	public void setid_anio_finFK_IdAnioFin(Long id_anio_finFK_IdAnioFin) {
		this.id_anio_finFK_IdAnioFin = id_anio_finFK_IdAnioFin;
	}

	public Long id_anio_inicioFK_IdAnioInicio=-1L;

	public Long getid_anio_inicioFK_IdAnioInicio() {
		return this.id_anio_inicioFK_IdAnioInicio;
	}

	public void setid_anio_inicioFK_IdAnioInicio(Long id_anio_inicioFK_IdAnioInicio) {
		this.id_anio_inicioFK_IdAnioInicio = id_anio_inicioFK_IdAnioInicio;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_mesFK_IdMes=null;

	public Long getid_mesFK_IdMes() {
		return this.id_mesFK_IdMes;
	}

	public void setid_mesFK_IdMes(Long id_mesFK_IdMes) {
		this.id_mesFK_IdMes = id_mesFK_IdMes;
	}

	public Long id_mes_finFK_IdMesFin=-1L;

	public Long getid_mes_finFK_IdMesFin() {
		return this.id_mes_finFK_IdMesFin;
	}

	public void setid_mes_finFK_IdMesFin(Long id_mes_finFK_IdMesFin) {
		this.id_mes_finFK_IdMesFin = id_mes_finFK_IdMesFin;
	}

	public Long id_mes_inicioFK_IdMesInicio=-1L;

	public Long getid_mes_inicioFK_IdMesInicio() {
		return this.id_mes_inicioFK_IdMesInicio;
	}

	public void setid_mes_inicioFK_IdMesInicio(Long id_mes_inicioFK_IdMesInicio) {
		this.id_mes_inicioFK_IdMesInicio = id_mes_inicioFK_IdMesInicio;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public DepreciacionesLogic getDepreciacionesLogic()	{		
		return depreciacionesLogic;
	}

	public void setDepreciacionesLogic(DepreciacionesLogic depreciacionesLogic) {
		this.depreciacionesLogic = depreciacionesLogic;
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
	
	public Boolean getIsEsNuevoDepreciaciones() {
		return isEsNuevoDepreciaciones;
	}

	public void setIsEsNuevoDepreciaciones(Boolean isEsNuevoDepreciaciones) {
		this.isEsNuevoDepreciaciones = isEsNuevoDepreciaciones;
	}

	public Boolean getEsParaAccionDesdeFormularioDepreciaciones() {
		return esParaAccionDesdeFormularioDepreciaciones;
	}
	
	public void setEsParaAccionDesdeFormularioDepreciaciones(Boolean esParaAccionDesdeFormularioDepreciaciones) {
		this.esParaAccionDesdeFormularioDepreciaciones = esParaAccionDesdeFormularioDepreciaciones;
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

			if(this.depreciacionesSessionBean==null) {
				this.depreciacionesSessionBean=new DepreciacionesSessionBean();
			}

			if(!this.depreciacionesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(depreciacionesSessionBean.getlidEmpresaActual());
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

	public void cargarCombosAnioIniciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.anioiniciosForeignKey=new ArrayList<Anio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AnioLogic anioLogic=new AnioLogic();

			//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

			if(this.depreciacionesSessionBean==null) {
				this.depreciacionesSessionBean=new DepreciacionesSessionBean();
			}

			if(!this.depreciacionesSessionBean.getisBusquedaDesdeForeignKeySesionAnioInicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//anioinicioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

					anioLogic.getTodosAniosWithConnection(sFinalQuery,new Pagination());

					this.anioiniciosForeignKey=anioLogic.getAnios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAnioInicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getEntityWithConnection(depreciacionesSessionBean.getlidAnioInicioActual());
					this.anioiniciosForeignKey.add(anioLogic.getAnio());
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

	public void cargarCombosAnioFinsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.aniofinsForeignKey=new ArrayList<Anio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AnioLogic anioLogic=new AnioLogic();

			//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

			if(this.depreciacionesSessionBean==null) {
				this.depreciacionesSessionBean=new DepreciacionesSessionBean();
			}

			if(!this.depreciacionesSessionBean.getisBusquedaDesdeForeignKeySesionAnioFin()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//aniofinLogic.getAnioDataAccess().setIsForForeingKeyData(true);

					anioLogic.getTodosAniosWithConnection(sFinalQuery,new Pagination());

					this.aniofinsForeignKey=anioLogic.getAnios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAnioFin(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getEntityWithConnection(depreciacionesSessionBean.getlidAnioFinActual());
					this.aniofinsForeignKey.add(anioLogic.getAnio());
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

	public void cargarCombosMesIniciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.mesiniciosForeignKey=new ArrayList<Mes>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MesLogic mesLogic=new MesLogic();

			//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.depreciacionesSessionBean==null) {
				this.depreciacionesSessionBean=new DepreciacionesSessionBean();
			}

			if(!this.depreciacionesSessionBean.getisBusquedaDesdeForeignKeySesionMesInicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//mesinicioLogic.getMesDataAccess().setIsForForeingKeyData(true);

					mesLogic.getTodosMessWithConnection(sFinalQuery,new Pagination());

					this.mesiniciosForeignKey=mesLogic.getMess();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMesInicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getEntityWithConnection(depreciacionesSessionBean.getlidMesInicioActual());
					this.mesiniciosForeignKey.add(mesLogic.getMes());
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

	public void cargarCombosMesFinsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.mesfinsForeignKey=new ArrayList<Mes>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MesLogic mesLogic=new MesLogic();

			//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.depreciacionesSessionBean==null) {
				this.depreciacionesSessionBean=new DepreciacionesSessionBean();
			}

			if(!this.depreciacionesSessionBean.getisBusquedaDesdeForeignKeySesionMesFin()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//mesfinLogic.getMesDataAccess().setIsForForeingKeyData(true);

					mesLogic.getTodosMessWithConnection(sFinalQuery,new Pagination());

					this.mesfinsForeignKey=mesLogic.getMess();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMesFin(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getEntityWithConnection(depreciacionesSessionBean.getlidMesFinActual());
					this.mesfinsForeignKey.add(mesLogic.getMes());
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

			if(this.depreciacionesSessionBean==null) {
				this.depreciacionesSessionBean=new DepreciacionesSessionBean();
			}

			if(!this.depreciacionesSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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
					anioLogic.getEntityWithConnection(depreciacionesSessionBean.getlidAnioActual());
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

	public void cargarCombosMessForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.messForeignKey=new ArrayList<Mes>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MesLogic mesLogic=new MesLogic();

			//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.depreciacionesSessionBean==null) {
				this.depreciacionesSessionBean=new DepreciacionesSessionBean();
			}

			if(!this.depreciacionesSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

					mesLogic.getTodosMessWithConnection(sFinalQuery,new Pagination());

					this.messForeignKey=mesLogic.getMess();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMes(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getEntityWithConnection(depreciacionesSessionBean.getlidMesActual());
					this.messForeignKey.add(mesLogic.getMes());
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

					if(this.depreciaciones!=null) {
						this.depreciaciones.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
						this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_empresaDepreciaciones.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDepreciaciones.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
						if(this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_empresaDepreciaciones.getItemCount()>0) {
							this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_empresaDepreciaciones.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDepreciacionesGenerico)throws Exception
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
				jComboBoxid_empresaDepreciacionesGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDepreciacionesGenerico!=null && jComboBoxid_empresaDepreciacionesGenerico.getItemCount()>0) {
					jComboBoxid_empresaDepreciacionesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAnioInicioForeignKey(Long idAnioInicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Anio  anioinicioTemp=null;

			for(Anio anioinicioAux:anioiniciosForeignKey) {
				if(anioinicioAux.getId()!=null && anioinicioAux.getId().equals(idAnioInicioSeleccionado)) {
					anioinicioTemp=anioinicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(anioinicioTemp!=null) {

					if(this.depreciaciones!=null) {
						this.depreciaciones.setAnioInicio(anioinicioTemp);
					}

					if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
						this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anio_inicioDepreciaciones.setSelectedItem(anioinicioTemp);
					}
				} else {
					//jComboBoxid_anio_inicioDepreciaciones.setSelectedItem(anioinicioTemp);
					if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
						if(this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anio_inicioDepreciaciones.getItemCount()>0) {
							this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anio_inicioDepreciaciones.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaDepreciaciones") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioinicioTemp!=null && jComboBoxid_anio_inicioBusquedaDepreciacionesDepreciaciones!=null) {
						jComboBoxid_anio_inicioBusquedaDepreciacionesDepreciaciones.setSelectedItem(anioinicioTemp);
					} else {
						if(jComboBoxid_anio_inicioBusquedaDepreciacionesDepreciaciones!=null) {
							//jComboBoxid_anio_inicioBusquedaDepreciacionesDepreciaciones.setSelectedItem(anioinicioTemp);
							if(jComboBoxid_anio_inicioBusquedaDepreciacionesDepreciaciones.getItemCount()>0) {
								jComboBoxid_anio_inicioBusquedaDepreciacionesDepreciaciones.setSelectedIndex(0);
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

	public String getActualAnioInicioForeignKeyDescripcion(Long idAnioInicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Anio  anioinicioTemp=null;

			for(Anio anioinicioAux:anioiniciosForeignKey) {
				if(anioinicioAux.getId()!=null && anioinicioAux.getId().equals(idAnioInicioSeleccionado)) {
					anioinicioTemp=anioinicioAux;
					break;
				}
			}


			sDescripcion=AnioConstantesFunciones.getAnioDescripcion(anioinicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAnioInicioForeignKeyGenerico(Long idAnioInicioSeleccionado,JComboBox jComboBoxid_anio_inicioDepreciacionesGenerico)throws Exception
	{
		try
		{
			Anio  anioinicioTemp=null;

			for(Anio anioinicioAux:anioiniciosForeignKey) {
				if(anioinicioAux.getId()!=null && anioinicioAux.getId().equals(idAnioInicioSeleccionado)) {
					anioinicioTemp=anioinicioAux;
					break;
				}
			}

			if(anioinicioTemp!=null) {
				jComboBoxid_anio_inicioDepreciacionesGenerico.setSelectedItem(anioinicioTemp);
			} else {
				if(jComboBoxid_anio_inicioDepreciacionesGenerico!=null && jComboBoxid_anio_inicioDepreciacionesGenerico.getItemCount()>0) {
					jComboBoxid_anio_inicioDepreciacionesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAnioFinForeignKey(Long idAnioFinSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Anio  aniofinTemp=null;

			for(Anio aniofinAux:aniofinsForeignKey) {
				if(aniofinAux.getId()!=null && aniofinAux.getId().equals(idAnioFinSeleccionado)) {
					aniofinTemp=aniofinAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(aniofinTemp!=null) {

					if(this.depreciaciones!=null) {
						this.depreciaciones.setAnioFin(aniofinTemp);
					}

					if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
						this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anio_finDepreciaciones.setSelectedItem(aniofinTemp);
					}
				} else {
					//jComboBoxid_anio_finDepreciaciones.setSelectedItem(aniofinTemp);
					if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
						if(this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anio_finDepreciaciones.getItemCount()>0) {
							this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anio_finDepreciaciones.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaDepreciaciones") || sFormularioTipoBusqueda.equals("Todos")){
					if(aniofinTemp!=null && jComboBoxid_anio_finBusquedaDepreciacionesDepreciaciones!=null) {
						jComboBoxid_anio_finBusquedaDepreciacionesDepreciaciones.setSelectedItem(aniofinTemp);
					} else {
						if(jComboBoxid_anio_finBusquedaDepreciacionesDepreciaciones!=null) {
							//jComboBoxid_anio_finBusquedaDepreciacionesDepreciaciones.setSelectedItem(aniofinTemp);
							if(jComboBoxid_anio_finBusquedaDepreciacionesDepreciaciones.getItemCount()>0) {
								jComboBoxid_anio_finBusquedaDepreciacionesDepreciaciones.setSelectedIndex(0);
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

	public String getActualAnioFinForeignKeyDescripcion(Long idAnioFinSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Anio  aniofinTemp=null;

			for(Anio aniofinAux:aniofinsForeignKey) {
				if(aniofinAux.getId()!=null && aniofinAux.getId().equals(idAnioFinSeleccionado)) {
					aniofinTemp=aniofinAux;
					break;
				}
			}


			sDescripcion=AnioConstantesFunciones.getAnioDescripcion(aniofinTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAnioFinForeignKeyGenerico(Long idAnioFinSeleccionado,JComboBox jComboBoxid_anio_finDepreciacionesGenerico)throws Exception
	{
		try
		{
			Anio  aniofinTemp=null;

			for(Anio aniofinAux:aniofinsForeignKey) {
				if(aniofinAux.getId()!=null && aniofinAux.getId().equals(idAnioFinSeleccionado)) {
					aniofinTemp=aniofinAux;
					break;
				}
			}

			if(aniofinTemp!=null) {
				jComboBoxid_anio_finDepreciacionesGenerico.setSelectedItem(aniofinTemp);
			} else {
				if(jComboBoxid_anio_finDepreciacionesGenerico!=null && jComboBoxid_anio_finDepreciacionesGenerico.getItemCount()>0) {
					jComboBoxid_anio_finDepreciacionesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMesInicioForeignKey(Long idMesInicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Mes  mesinicioTemp=null;

			for(Mes mesinicioAux:mesiniciosForeignKey) {
				if(mesinicioAux.getId()!=null && mesinicioAux.getId().equals(idMesInicioSeleccionado)) {
					mesinicioTemp=mesinicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(mesinicioTemp!=null) {

					if(this.depreciaciones!=null) {
						this.depreciaciones.setMesInicio(mesinicioTemp);
					}

					if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
						this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mes_inicioDepreciaciones.setSelectedItem(mesinicioTemp);
					}
				} else {
					//jComboBoxid_mes_inicioDepreciaciones.setSelectedItem(mesinicioTemp);
					if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
						if(this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mes_inicioDepreciaciones.getItemCount()>0) {
							this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mes_inicioDepreciaciones.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaDepreciaciones") || sFormularioTipoBusqueda.equals("Todos")){
					if(mesinicioTemp!=null && jComboBoxid_mes_inicioBusquedaDepreciacionesDepreciaciones!=null) {
						jComboBoxid_mes_inicioBusquedaDepreciacionesDepreciaciones.setSelectedItem(mesinicioTemp);
					} else {
						if(jComboBoxid_mes_inicioBusquedaDepreciacionesDepreciaciones!=null) {
							//jComboBoxid_mes_inicioBusquedaDepreciacionesDepreciaciones.setSelectedItem(mesinicioTemp);
							if(jComboBoxid_mes_inicioBusquedaDepreciacionesDepreciaciones.getItemCount()>0) {
								jComboBoxid_mes_inicioBusquedaDepreciacionesDepreciaciones.setSelectedIndex(0);
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

	public String getActualMesInicioForeignKeyDescripcion(Long idMesInicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Mes  mesinicioTemp=null;

			for(Mes mesinicioAux:mesiniciosForeignKey) {
				if(mesinicioAux.getId()!=null && mesinicioAux.getId().equals(idMesInicioSeleccionado)) {
					mesinicioTemp=mesinicioAux;
					break;
				}
			}


			sDescripcion=MesConstantesFunciones.getMesDescripcion(mesinicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMesInicioForeignKeyGenerico(Long idMesInicioSeleccionado,JComboBox jComboBoxid_mes_inicioDepreciacionesGenerico)throws Exception
	{
		try
		{
			Mes  mesinicioTemp=null;

			for(Mes mesinicioAux:mesiniciosForeignKey) {
				if(mesinicioAux.getId()!=null && mesinicioAux.getId().equals(idMesInicioSeleccionado)) {
					mesinicioTemp=mesinicioAux;
					break;
				}
			}

			if(mesinicioTemp!=null) {
				jComboBoxid_mes_inicioDepreciacionesGenerico.setSelectedItem(mesinicioTemp);
			} else {
				if(jComboBoxid_mes_inicioDepreciacionesGenerico!=null && jComboBoxid_mes_inicioDepreciacionesGenerico.getItemCount()>0) {
					jComboBoxid_mes_inicioDepreciacionesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMesFinForeignKey(Long idMesFinSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Mes  mesfinTemp=null;

			for(Mes mesfinAux:mesfinsForeignKey) {
				if(mesfinAux.getId()!=null && mesfinAux.getId().equals(idMesFinSeleccionado)) {
					mesfinTemp=mesfinAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(mesfinTemp!=null) {

					if(this.depreciaciones!=null) {
						this.depreciaciones.setMesFin(mesfinTemp);
					}

					if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
						this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mes_finDepreciaciones.setSelectedItem(mesfinTemp);
					}
				} else {
					//jComboBoxid_mes_finDepreciaciones.setSelectedItem(mesfinTemp);
					if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
						if(this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mes_finDepreciaciones.getItemCount()>0) {
							this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mes_finDepreciaciones.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaDepreciaciones") || sFormularioTipoBusqueda.equals("Todos")){
					if(mesfinTemp!=null && jComboBoxid_mes_finBusquedaDepreciacionesDepreciaciones!=null) {
						jComboBoxid_mes_finBusquedaDepreciacionesDepreciaciones.setSelectedItem(mesfinTemp);
					} else {
						if(jComboBoxid_mes_finBusquedaDepreciacionesDepreciaciones!=null) {
							//jComboBoxid_mes_finBusquedaDepreciacionesDepreciaciones.setSelectedItem(mesfinTemp);
							if(jComboBoxid_mes_finBusquedaDepreciacionesDepreciaciones.getItemCount()>0) {
								jComboBoxid_mes_finBusquedaDepreciacionesDepreciaciones.setSelectedIndex(0);
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

	public String getActualMesFinForeignKeyDescripcion(Long idMesFinSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Mes  mesfinTemp=null;

			for(Mes mesfinAux:mesfinsForeignKey) {
				if(mesfinAux.getId()!=null && mesfinAux.getId().equals(idMesFinSeleccionado)) {
					mesfinTemp=mesfinAux;
					break;
				}
			}


			sDescripcion=MesConstantesFunciones.getMesDescripcion(mesfinTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMesFinForeignKeyGenerico(Long idMesFinSeleccionado,JComboBox jComboBoxid_mes_finDepreciacionesGenerico)throws Exception
	{
		try
		{
			Mes  mesfinTemp=null;

			for(Mes mesfinAux:mesfinsForeignKey) {
				if(mesfinAux.getId()!=null && mesfinAux.getId().equals(idMesFinSeleccionado)) {
					mesfinTemp=mesfinAux;
					break;
				}
			}

			if(mesfinTemp!=null) {
				jComboBoxid_mes_finDepreciacionesGenerico.setSelectedItem(mesfinTemp);
			} else {
				if(jComboBoxid_mes_finDepreciacionesGenerico!=null && jComboBoxid_mes_finDepreciacionesGenerico.getItemCount()>0) {
					jComboBoxid_mes_finDepreciacionesGenerico.setSelectedIndex(0);
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

					if(this.depreciaciones!=null) {
						this.depreciaciones.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
						this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anioDepreciaciones.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioDepreciaciones.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
						if(this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anioDepreciaciones.getItemCount()>0) {
							this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anioDepreciaciones.setSelectedIndex(0);
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
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioDepreciacionesGenerico)throws Exception
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
				jComboBoxid_anioDepreciacionesGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioDepreciacionesGenerico!=null && jComboBoxid_anioDepreciacionesGenerico.getItemCount()>0) {
					jComboBoxid_anioDepreciacionesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMesForeignKey(Long idMesSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(mesTemp!=null) {

					if(this.depreciaciones!=null) {
						this.depreciaciones.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
						this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mesDepreciaciones.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesDepreciaciones.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
						if(this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mesDepreciaciones.getItemCount()>0) {
							this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mesDepreciaciones.setSelectedIndex(0);
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

	public String getActualMesForeignKeyDescripcion(Long idMesSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}


			sDescripcion=MesConstantesFunciones.getMesDescripcion(mesTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesDepreciacionesGenerico)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(mesTemp!=null) {
				jComboBoxid_mesDepreciacionesGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesDepreciacionesGenerico!=null && jComboBoxid_mesDepreciacionesGenerico.getItemCount()>0) {
					jComboBoxid_mesDepreciacionesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Depreciaciones depreciaciones,JComboBox jComboBoxid_empresaDepreciacionesGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDepreciacionesGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_empresaDepreciaciones.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDepreciacionesGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				depreciaciones.setid_empresa(empresaAux.getId());
				depreciaciones.setempresa_descripcion(DepreciacionesConstantesFunciones.getEmpresaDescripcion(empresaAux));
				depreciaciones.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioInicioForeignKey(Depreciaciones depreciaciones,JComboBox jComboBoxid_anio_inicioDepreciacionesGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anio_inicioDepreciacionesGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anio_inicioDepreciaciones.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anio_inicioDepreciacionesGenerico.getSelectedItem();
			}

			if(anioAux!=null && anioAux.getId()!=null) {
				depreciaciones.setid_anio_inicio(anioAux.getId());
				depreciaciones.setanioinicio_descripcion(DepreciacionesConstantesFunciones.getAnioInicioDescripcion(anioAux));
				depreciaciones.setAnioInicio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioFinForeignKey(Depreciaciones depreciaciones,JComboBox jComboBoxid_anio_finDepreciacionesGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anio_finDepreciacionesGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anio_finDepreciaciones.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anio_finDepreciacionesGenerico.getSelectedItem();
			}

			if(anioAux!=null && anioAux.getId()!=null) {
				depreciaciones.setid_anio_fin(anioAux.getId());
				depreciaciones.setaniofin_descripcion(DepreciacionesConstantesFunciones.getAnioFinDescripcion(anioAux));
				depreciaciones.setAnioFin(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesInicioForeignKey(Depreciaciones depreciaciones,JComboBox jComboBoxid_mes_inicioDepreciacionesGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mes_inicioDepreciacionesGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mes_inicioDepreciaciones.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mes_inicioDepreciacionesGenerico.getSelectedItem();
			}

			if(mesAux!=null && mesAux.getId()!=null) {
				depreciaciones.setid_mes_inicio(mesAux.getId());
				depreciaciones.setmesinicio_descripcion(DepreciacionesConstantesFunciones.getMesInicioDescripcion(mesAux));
				depreciaciones.setMesInicio(mesAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesFinForeignKey(Depreciaciones depreciaciones,JComboBox jComboBoxid_mes_finDepreciacionesGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mes_finDepreciacionesGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mes_finDepreciaciones.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mes_finDepreciacionesGenerico.getSelectedItem();
			}

			if(mesAux!=null && mesAux.getId()!=null) {
				depreciaciones.setid_mes_fin(mesAux.getId());
				depreciaciones.setmesfin_descripcion(DepreciacionesConstantesFunciones.getMesFinDescripcion(mesAux));
				depreciaciones.setMesFin(mesAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(Depreciaciones depreciaciones,JComboBox jComboBoxid_anioDepreciacionesGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioDepreciacionesGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anioDepreciaciones.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioDepreciacionesGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				depreciaciones.setid_anio(anioAux.getId());
				depreciaciones.setanio_descripcion(DepreciacionesConstantesFunciones.getAnioDescripcion(anioAux));
				depreciaciones.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(Depreciaciones depreciaciones,JComboBox jComboBoxid_mesDepreciacionesGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesDepreciacionesGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mesDepreciaciones.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesDepreciacionesGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				depreciaciones.setid_mes(mesAux.getId());
				depreciaciones.setmes_descripcion(DepreciacionesConstantesFunciones.getMesDescripcion(mesAux));
				depreciaciones.setMes(mesAux);			}
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

					if(!DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDepreciaciones!=null) { 
							this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_empresaDepreciaciones.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_empresaDepreciaciones.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDepreciaciones!=null) { 
					}

					if(!DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAnioIniciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAnio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDepreciaciones!=null) { 
							this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anio_inicioDepreciaciones.removeAllItems();

							for(Anio anioinicio:this.anioiniciosForeignKey) {
								this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anio_inicioDepreciaciones.addItem(anioinicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDepreciaciones!=null) { 
					}

					if(!DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaDepreciaciones") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anio_inicioBusquedaDepreciacionesDepreciaciones.removeAllItems();

							for(Anio anioinicio:this.anioiniciosForeignKey) {
								this.jComboBoxid_anio_inicioBusquedaDepreciacionesDepreciaciones.addItem(anioinicio);
							}
						}

						if(!DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAnioFinsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAnio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDepreciaciones!=null) { 
							this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anio_finDepreciaciones.removeAllItems();

							for(Anio aniofin:this.aniofinsForeignKey) {
								this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anio_finDepreciaciones.addItem(aniofin);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDepreciaciones!=null) { 
					}

					if(!DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaDepreciaciones") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anio_finBusquedaDepreciacionesDepreciaciones.removeAllItems();

							for(Anio aniofin:this.aniofinsForeignKey) {
								this.jComboBoxid_anio_finBusquedaDepreciacionesDepreciaciones.addItem(aniofin);
							}
						}

						if(!DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMesIniciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMes=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDepreciaciones!=null) { 
							this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mes_inicioDepreciaciones.removeAllItems();

							for(Mes mesinicio:this.mesiniciosForeignKey) {
								this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mes_inicioDepreciaciones.addItem(mesinicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDepreciaciones!=null) { 
					}

					if(!DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaDepreciaciones") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_mes_inicioBusquedaDepreciacionesDepreciaciones.removeAllItems();

							for(Mes mesinicio:this.mesiniciosForeignKey) {
								this.jComboBoxid_mes_inicioBusquedaDepreciacionesDepreciaciones.addItem(mesinicio);
							}
						}

						if(!DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMesFinsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMes=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDepreciaciones!=null) { 
							this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mes_finDepreciaciones.removeAllItems();

							for(Mes mesfin:this.mesfinsForeignKey) {
								this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mes_finDepreciaciones.addItem(mesfin);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDepreciaciones!=null) { 
					}

					if(!DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaDepreciaciones") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_mes_finBusquedaDepreciacionesDepreciaciones.removeAllItems();

							for(Mes mesfin:this.mesfinsForeignKey) {
								this.jComboBoxid_mes_finBusquedaDepreciacionesDepreciaciones.addItem(mesfin);
							}
						}

						if(!DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDepreciaciones!=null) { 
							this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anioDepreciaciones.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anioDepreciaciones.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDepreciaciones!=null) { 
					}

					if(!DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMessForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMes=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDepreciaciones!=null) { 
							this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mesDepreciaciones.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mesDepreciaciones.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDepreciaciones!=null) { 
					}

					if(!DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
							this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_empresaDepreciaciones.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
							this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_empresaDepreciaciones.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameAnioInicioForeignKey(Anio anioinicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
							this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anio_inicioDepreciaciones.setSelectedItem(anioinicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
							this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anio_inicioDepreciaciones.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_anio_inicioBusquedaDepreciacionesDepreciaciones.setSelectedItem(anioinicio);
						} else {
							this.jComboBoxid_anio_inicioBusquedaDepreciacionesDepreciaciones.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameAnioFinForeignKey(Anio aniofin,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
							this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anio_finDepreciaciones.setSelectedItem(aniofin);
						}
					} else {
						if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
							this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anio_finDepreciaciones.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_anio_finBusquedaDepreciacionesDepreciaciones.setSelectedItem(aniofin);
						} else {
							this.jComboBoxid_anio_finBusquedaDepreciacionesDepreciaciones.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameMesInicioForeignKey(Mes mesinicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
							this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mes_inicioDepreciaciones.setSelectedItem(mesinicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
							this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mes_inicioDepreciaciones.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_mes_inicioBusquedaDepreciacionesDepreciaciones.setSelectedItem(mesinicio);
						} else {
							this.jComboBoxid_mes_inicioBusquedaDepreciacionesDepreciaciones.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameMesFinForeignKey(Mes mesfin,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
							this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mes_finDepreciaciones.setSelectedItem(mesfin);
						}
					} else {
						if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
							this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mes_finDepreciaciones.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_mes_finBusquedaDepreciacionesDepreciaciones.setSelectedItem(mesfin);
						} else {
							this.jComboBoxid_mes_finBusquedaDepreciacionesDepreciaciones.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
							this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anioDepreciaciones.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
							this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anioDepreciaciones.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameMesForeignKey(Mes mes,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
							this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mesDepreciaciones.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
							this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mesDepreciaciones.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesDepreciaciones() throws Exception {
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
		
	public DepreciacionesParameterReturnGeneral getDepreciacionesParameterGeneral() {
		return this.depreciacionesParameterGeneral;
	}
	
	public void setDepreciacionesParameterGeneral(DepreciacionesParameterReturnGeneral depreciacionesParameterGeneral) {
		this.depreciacionesParameterGeneral = depreciacionesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDepreciaciones() {
		return isPermisoTodoDepreciaciones;
	}

	public void setIsPermisoTodoDepreciaciones(Boolean isPermisoTodoDepreciaciones) {
		this.isPermisoTodoDepreciaciones = isPermisoTodoDepreciaciones;
	}

	public Boolean getIsPermisoNuevoDepreciaciones() {
		return isPermisoNuevoDepreciaciones;
	}

	public void setIsPermisoNuevoDepreciaciones(Boolean isPermisoNuevoDepreciaciones) {
		this.isPermisoNuevoDepreciaciones = isPermisoNuevoDepreciaciones;
	}

	public Boolean getIsPermisoActualizarDepreciaciones() {
		return isPermisoActualizarDepreciaciones;
	}

	public void setIsPermisoActualizarDepreciaciones(Boolean isPermisoActualizarDepreciaciones) {
		this.isPermisoActualizarDepreciaciones = isPermisoActualizarDepreciaciones;
	}

	public Boolean getIsPermisoEliminarDepreciaciones() {
		return isPermisoEliminarDepreciaciones;
	}

	public void setIsPermisoEliminarDepreciaciones(Boolean isPermisoEliminarDepreciaciones) {
		this.isPermisoEliminarDepreciaciones = isPermisoEliminarDepreciaciones;
	}

	public Boolean getIsPermisoGuardarCambiosDepreciaciones() {
		return isPermisoGuardarCambiosDepreciaciones;
	}

	public void setIsPermisoGuardarCambiosDepreciaciones(Boolean isPermisoGuardarCambiosDepreciaciones) {
		this.isPermisoGuardarCambiosDepreciaciones = isPermisoGuardarCambiosDepreciaciones;
	}
	
	public Boolean getIsPermisoConsultaDepreciaciones() {
		return isPermisoConsultaDepreciaciones;
	}

	public void setIsPermisoConsultaDepreciaciones(Boolean isPermisoConsultaDepreciaciones) {
		this.isPermisoConsultaDepreciaciones = isPermisoConsultaDepreciaciones;
	}

	public Boolean getIsPermisoBusquedaDepreciaciones() {
		return isPermisoBusquedaDepreciaciones;
	}

	public void setIsPermisoBusquedaDepreciaciones(Boolean isPermisoBusquedaDepreciaciones) {
		this.isPermisoBusquedaDepreciaciones = isPermisoBusquedaDepreciaciones;
	}

	public Boolean getIsPermisoReporteDepreciaciones() {
		return isPermisoReporteDepreciaciones;
	}

	public void setIsPermisoReporteDepreciaciones(Boolean isPermisoReporteDepreciaciones) {
		this.isPermisoReporteDepreciaciones = isPermisoReporteDepreciaciones;
	}
	
	public Boolean getIsPermisoPaginacionMedioDepreciaciones() {
		return isPermisoPaginacionMedioDepreciaciones;
	}

	public void setIsPermisoPaginacionMedioDepreciaciones(Boolean isPermisoPaginacionMedioDepreciaciones) {
		this.isPermisoPaginacionMedioDepreciaciones = isPermisoPaginacionMedioDepreciaciones;
	}
	
	public Boolean getIsPermisoPaginacionTodoDepreciaciones() {
		return isPermisoPaginacionTodoDepreciaciones;
	}

	public void setIsPermisoPaginacionTodoDepreciaciones(Boolean isPermisoPaginacionTodoDepreciaciones) {
		this.isPermisoPaginacionTodoDepreciaciones = isPermisoPaginacionTodoDepreciaciones;
	}
	
	public Boolean getIsPermisoPaginacionAltoDepreciaciones() {
		return isPermisoPaginacionAltoDepreciaciones;
	}

	public void setIsPermisoPaginacionAltoDepreciaciones(Boolean isPermisoPaginacionAltoDepreciaciones) {
		this.isPermisoPaginacionAltoDepreciaciones = isPermisoPaginacionAltoDepreciaciones;
	}
	
	public Boolean getIsPermisoCopiarDepreciaciones() {
		return isPermisoCopiarDepreciaciones;
	}

	public void setIsPermisoCopiarDepreciaciones(Boolean isPermisoCopiarDepreciaciones) {
		this.isPermisoCopiarDepreciaciones = isPermisoCopiarDepreciaciones;
	}
	
	public Boolean getIsPermisoVerFormDepreciaciones() {
		return isPermisoVerFormDepreciaciones;
	}

	public void setIsPermisoVerFormDepreciaciones(Boolean isPermisoVerFormDepreciaciones) {
		this.isPermisoVerFormDepreciaciones = isPermisoVerFormDepreciaciones;
	}
	
	public Boolean getIsPermisoDuplicarDepreciaciones() {
		return isPermisoDuplicarDepreciaciones;
	}

	public void setIsPermisoDuplicarDepreciaciones(Boolean isPermisoDuplicarDepreciaciones) {
		this.isPermisoDuplicarDepreciaciones = isPermisoDuplicarDepreciaciones;
	}
	
	public Boolean getIsPermisoOrdenDepreciaciones() {
		return isPermisoOrdenDepreciaciones;
	}

	public void setIsPermisoOrdenDepreciaciones(Boolean isPermisoOrdenDepreciaciones) {
		this.isPermisoOrdenDepreciaciones = isPermisoOrdenDepreciaciones;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDepreciaciones() {
		return isVisibilidadCeldaNuevoDepreciaciones;
	}

	public void setIsVisibilidadCeldaNuevoDepreciaciones(Boolean isVisibilidadCeldaNuevoDepreciaciones) {
		this.isVisibilidadCeldaNuevoDepreciaciones = isVisibilidadCeldaNuevoDepreciaciones;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDepreciaciones() {
		return isVisibilidadCeldaDuplicarDepreciaciones;
	}

	public void setIsVisibilidadCeldaDuplicarDepreciaciones(Boolean isVisibilidadCeldaDuplicarDepreciaciones) {
		this.isVisibilidadCeldaDuplicarDepreciaciones = isVisibilidadCeldaDuplicarDepreciaciones;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDepreciaciones() {
		return isVisibilidadCeldaCopiarDepreciaciones;
	}

	public void setIsVisibilidadCeldaCopiarDepreciaciones(Boolean isVisibilidadCeldaCopiarDepreciaciones) {
		this.isVisibilidadCeldaCopiarDepreciaciones = isVisibilidadCeldaCopiarDepreciaciones;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDepreciaciones() {
		return isVisibilidadCeldaVerFormDepreciaciones;
	}

	public void setIsVisibilidadCeldaVerFormDepreciaciones(Boolean isVisibilidadCeldaVerFormDepreciaciones) {
		this.isVisibilidadCeldaVerFormDepreciaciones = isVisibilidadCeldaVerFormDepreciaciones;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDepreciaciones() {
		return isVisibilidadCeldaOrdenDepreciaciones;
	}

	public void setIsVisibilidadCeldaOrdenDepreciaciones(Boolean isVisibilidadCeldaOrdenDepreciaciones) {
		this.isVisibilidadCeldaOrdenDepreciaciones = isVisibilidadCeldaOrdenDepreciaciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDepreciaciones() {
		return isVisibilidadCeldaNuevoRelacionesDepreciaciones;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDepreciaciones(Boolean isVisibilidadCeldaNuevoRelacionesDepreciaciones) {
		this.isVisibilidadCeldaNuevoRelacionesDepreciaciones = isVisibilidadCeldaNuevoRelacionesDepreciaciones;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDepreciaciones() {
		return isVisibilidadCeldaModificarDepreciaciones;
	}

	public void setIsVisibilidadCeldaModificarDepreciaciones(Boolean isVisibilidadCeldaModificarDepreciaciones) {
		this.isVisibilidadCeldaModificarDepreciaciones = isVisibilidadCeldaModificarDepreciaciones;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDepreciaciones() {
		return isVisibilidadCeldaActualizarDepreciaciones;
	}

	public void setIsVisibilidadCeldaActualizarDepreciaciones(Boolean isVisibilidadCeldaActualizarDepreciaciones) {
		this.isVisibilidadCeldaActualizarDepreciaciones = isVisibilidadCeldaActualizarDepreciaciones;
	}

	public Boolean getIsVisibilidadCeldaEliminarDepreciaciones() {
		return isVisibilidadCeldaEliminarDepreciaciones;
	}

	public void setIsVisibilidadCeldaEliminarDepreciaciones(Boolean isVisibilidadCeldaEliminarDepreciaciones) {
		this.isVisibilidadCeldaEliminarDepreciaciones = isVisibilidadCeldaEliminarDepreciaciones;
	}

	public Boolean getIsVisibilidadCeldaCancelarDepreciaciones() {
		return isVisibilidadCeldaCancelarDepreciaciones;
	}

	public void setIsVisibilidadCeldaCancelarDepreciaciones(Boolean isVisibilidadCeldaCancelarDepreciaciones) {
		this.isVisibilidadCeldaCancelarDepreciaciones = isVisibilidadCeldaCancelarDepreciaciones;
	}

	public Boolean getIsVisibilidadCeldaGuardarDepreciaciones() {
		return isVisibilidadCeldaGuardarDepreciaciones;
	}

	public void setIsVisibilidadCeldaGuardarDepreciaciones(Boolean isVisibilidadCeldaGuardarDepreciaciones) {
		this.isVisibilidadCeldaGuardarDepreciaciones = isVisibilidadCeldaGuardarDepreciaciones;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDepreciaciones() {
		return isVisibilidadCeldaGuardarCambiosDepreciaciones;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDepreciaciones(Boolean isVisibilidadCeldaGuardarCambiosDepreciaciones) {
		this.isVisibilidadCeldaGuardarCambiosDepreciaciones = isVisibilidadCeldaGuardarCambiosDepreciaciones;
	}
		
	public DepreciacionesSessionBean getdepreciacionesSessionBean() {
		return this.depreciacionesSessionBean;
	}
	
	public void setdepreciacionesSessionBean(DepreciacionesSessionBean depreciacionesSessionBean) {
		this.depreciacionesSessionBean=depreciacionesSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaDepreciaciones() {
		return this.isVisibilidadBusquedaDepreciaciones;
	}

	public void setisVisibilidadBusquedaDepreciaciones(Boolean isVisibilidadBusquedaDepreciaciones) {
		this.isVisibilidadBusquedaDepreciaciones=isVisibilidadBusquedaDepreciaciones;
	}

	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
	}

	public Boolean getisVisibilidadFK_IdAnioFin() {
		return this.isVisibilidadFK_IdAnioFin;
	}

	public void setisVisibilidadFK_IdAnioFin(Boolean isVisibilidadFK_IdAnioFin) {
		this.isVisibilidadFK_IdAnioFin=isVisibilidadFK_IdAnioFin;
	}

	public Boolean getisVisibilidadFK_IdAnioInicio() {
		return this.isVisibilidadFK_IdAnioInicio;
	}

	public void setisVisibilidadFK_IdAnioInicio(Boolean isVisibilidadFK_IdAnioInicio) {
		this.isVisibilidadFK_IdAnioInicio=isVisibilidadFK_IdAnioInicio;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdMes() {
		return this.isVisibilidadFK_IdMes;
	}

	public void setisVisibilidadFK_IdMes(Boolean isVisibilidadFK_IdMes) {
		this.isVisibilidadFK_IdMes=isVisibilidadFK_IdMes;
	}

	public Boolean getisVisibilidadFK_IdMesFin() {
		return this.isVisibilidadFK_IdMesFin;
	}

	public void setisVisibilidadFK_IdMesFin(Boolean isVisibilidadFK_IdMesFin) {
		this.isVisibilidadFK_IdMesFin=isVisibilidadFK_IdMesFin;
	}

	public Boolean getisVisibilidadFK_IdMesInicio() {
		return this.isVisibilidadFK_IdMesInicio;
	}

	public void setisVisibilidadFK_IdMesInicio(Boolean isVisibilidadFK_IdMesInicio) {
		this.isVisibilidadFK_IdMesInicio=isVisibilidadFK_IdMesInicio;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(Depreciaciones depreciaciones)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(depreciaciones,null);
				this.setActualParaGuardarAnioInicioForeignKey(depreciaciones,null);
				this.setActualParaGuardarAnioFinForeignKey(depreciaciones,null);
				this.setActualParaGuardarMesInicioForeignKey(depreciaciones,null);
				this.setActualParaGuardarMesFinForeignKey(depreciaciones,null);
				this.setActualParaGuardarAnioForeignKey(depreciaciones,null);
				this.setActualParaGuardarMesForeignKey(depreciaciones,null);
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
	
	public void bugActualizarReferenciaActual(Depreciaciones depreciaciones,Depreciaciones depreciacionesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDepreciaciones(depreciaciones);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		depreciacionesAux.setId(depreciaciones.getId());
		depreciacionesAux.setVersionRow(depreciaciones.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(Depreciaciones depreciacionesLocal) throws Exception {
		
		if(this.depreciacionesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Depreciaciones depreciacionesLocal) throws Exception {	
		if(this.depreciacionesSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				depreciacionesLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioinicioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioinicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioinicioBeanSwingJInternalFrameLocal.getanio(),true);
				anioinicioBeanSwingJInternalFrameLocal.actualizarLista(anioinicioBeanSwingJInternalFrameLocal.anio,this.anioiniciosForeignKey);

				anioinicioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioinicioBeanSwingJInternalFrameLocal.anio);

				depreciacionesLocal.setAnioInicio(anioinicioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnioInicio();
				this.cargarCombosFrameAnioIniciosForeignKey("Formulario");
				this.setActualAnioInicioForeignKey(anioinicioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame aniofinBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				aniofinBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(aniofinBeanSwingJInternalFrameLocal.getanio(),true);
				aniofinBeanSwingJInternalFrameLocal.actualizarLista(aniofinBeanSwingJInternalFrameLocal.anio,this.aniofinsForeignKey);

				aniofinBeanSwingJInternalFrameLocal.actualizarRelaciones(aniofinBeanSwingJInternalFrameLocal.anio);

				depreciacionesLocal.setAnioFin(aniofinBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnioFin();
				this.cargarCombosFrameAnioFinsForeignKey("Formulario");
				this.setActualAnioFinForeignKey(aniofinBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesinicioBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesinicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesinicioBeanSwingJInternalFrameLocal.getmes(),true);
				mesinicioBeanSwingJInternalFrameLocal.actualizarLista(mesinicioBeanSwingJInternalFrameLocal.mes,this.mesiniciosForeignKey);

				mesinicioBeanSwingJInternalFrameLocal.actualizarRelaciones(mesinicioBeanSwingJInternalFrameLocal.mes);

				depreciacionesLocal.setMesInicio(mesinicioBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMesInicio();
				this.cargarCombosFrameMesIniciosForeignKey("Formulario");
				this.setActualMesInicioForeignKey(mesinicioBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesfinBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesfinBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesfinBeanSwingJInternalFrameLocal.getmes(),true);
				mesfinBeanSwingJInternalFrameLocal.actualizarLista(mesfinBeanSwingJInternalFrameLocal.mes,this.mesfinsForeignKey);

				mesfinBeanSwingJInternalFrameLocal.actualizarRelaciones(mesfinBeanSwingJInternalFrameLocal.mes);

				depreciacionesLocal.setMesFin(mesfinBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMesFin();
				this.cargarCombosFrameMesFinsForeignKey("Formulario");
				this.setActualMesFinForeignKey(mesfinBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				depreciacionesLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				depreciacionesLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDepreciacionesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = depreciacionesValidator.getInvalidValues(this.depreciaciones);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Depreciaciones depreciaciones,List<Depreciaciones> depreciacioness) throws Exception {
	}		
	
	public void actualizarSelectedLista(Depreciaciones depreciaciones,List<Depreciaciones> depreciacioness) throws Exception {
		try	{			
			DepreciacionesConstantesFunciones.actualizarSelectedLista(depreciaciones,depreciacioness);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Depreciaciones> depreciacionessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				depreciacionessLocal=this.depreciacionesLogic.getDepreciacioness();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				depreciacionessLocal=this.depreciacioness;
			}
			//ARCHITECTURE
		
			for(Depreciaciones depreciacionesLocal:depreciacionessLocal) {
				if(this.permiteMantenimiento(depreciacionesLocal) && depreciacionesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DepreciacionesConstantesFunciones.getDepreciacionesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DepreciacionesConstantesFunciones.CODIGOSUBGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciaciones.jLabelcodigo_sub_grupoDepreciaciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepreciacionesConstantesFunciones.NOMBRESUBGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciaciones.jLabelnombre_sub_grupoDepreciaciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepreciacionesConstantesFunciones.CODIGODETALLEGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciaciones.jLabelcodigo_detalle_grupoDepreciaciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepreciacionesConstantesFunciones.NOMBREDETALLEGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciaciones.jLabelnombre_detalle_grupoDepreciaciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepreciacionesConstantesFunciones.CLAVE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciaciones.jLabelclaveDepreciaciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepreciacionesConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciaciones.jLabelnombreDepreciaciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepreciacionesConstantesFunciones.FECHACOMPRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciaciones.jLabelfecha_compraDepreciaciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepreciacionesConstantesFunciones.VIDAUTIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciaciones.jLabelvida_utilDepreciaciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepreciacionesConstantesFunciones.COSTODECOMPRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciaciones.jLabelcosto_de_compraDepreciaciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepreciacionesConstantesFunciones.FECHAMANTENIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciaciones.jLabelfecha_mantenimientoDepreciaciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepreciacionesConstantesFunciones.FECHADEPRECIACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciaciones.jLabelfecha_depreciacionDepreciaciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepreciacionesConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciaciones.jLabelid_anioDepreciaciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepreciacionesConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciaciones.jLabelid_mesDepreciaciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepreciacionesConstantesFunciones.VALORACUMULADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciaciones.jLabelvalor_acumuladoDepreciaciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepreciacionesConstantesFunciones.VALORGASTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciaciones.jLabelvalor_gastoDepreciaciones,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepreciaciones.jLabelcodigo_sub_grupoDepreciaciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepreciaciones.jLabelnombre_sub_grupoDepreciaciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepreciaciones.jLabelcodigo_detalle_grupoDepreciaciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepreciaciones.jLabelnombre_detalle_grupoDepreciaciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepreciaciones.jLabelclaveDepreciaciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepreciaciones.jLabelnombreDepreciaciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepreciaciones.jLabelfecha_compraDepreciaciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepreciaciones.jLabelvida_utilDepreciaciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepreciaciones.jLabelcosto_de_compraDepreciaciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepreciaciones.jLabelfecha_mantenimientoDepreciaciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepreciaciones.jLabelfecha_depreciacionDepreciaciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepreciaciones.jLabelid_anioDepreciaciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepreciaciones.jLabelid_mesDepreciaciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepreciaciones.jLabelvalor_acumuladoDepreciaciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepreciaciones.jLabelvalor_gastoDepreciaciones,"");
		
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
		this.iIdNuevoDepreciaciones--;	
		
		
		this.depreciacionesAux=new Depreciaciones();
		
		this.depreciacionesAux.setId(this.iIdNuevoDepreciaciones);
		this.depreciacionesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.depreciacionesLogic.getDepreciacioness().add(this.depreciacionesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.depreciacioness.add(this.depreciacionesAux);
		}
		//ARCHITECTURE
		
		this.depreciaciones=this.depreciacionesAux;
		
		if(DepreciacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDepreciaciones(this.depreciaciones);
			this.setVariablesObjetoActualToFormularioForeignKeyDepreciaciones(this.depreciaciones);
		}
				
		//this.setDefaultControlesDepreciaciones();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDepreciaciones();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDepreciaciones();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDepreciaciones();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDepreciaciones(this.depreciacionesBean,this.depreciaciones,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDepreciaciones(this.depreciacionesReturnGeneral,this.depreciacionesBean,false);
		
		if(this.depreciacionesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDepreciaciones(this.depreciacionesReturnGeneral.getDepreciaciones());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDepreciaciones(this.depreciacionesReturnGeneral.getDepreciaciones());
		}
		
		if(this.depreciacionesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDepreciaciones(this.depreciacionesReturnGeneral.getDepreciaciones(),classes);//this.depreciacionesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDepreciaciones(this.depreciaciones,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDepreciaciones();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDepreciaciones();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DepreciacionesBeanSwingJInternalFrameAdditional.RecargarFormDepreciaciones(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDepreciaciones(false);
						
			if(depreciacionesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDepreciaciones();
			}
			
			this.actualizarVisualTableDatosDepreciaciones();
			
			this.jTableDatosDepreciaciones.setRowSelectionInterval(this.getIndiceNuevoDepreciaciones(), this.getIndiceNuevoDepreciaciones());
			
			this.seleccionarFilaTablaDepreciacionesActual();
						
			this.actualizarEstadoCeldasBotonesDepreciaciones("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDepreciaciones(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDepreciaciones.jTextFieldcodigo_sub_grupoDepreciaciones.setEnabled(isHabilitar && this.depreciacionesConstantesFunciones.activarcodigo_sub_grupoDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jTextAreanombre_sub_grupoDepreciaciones.setEnabled(isHabilitar && this.depreciacionesConstantesFunciones.activarnombre_sub_grupoDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jTextFieldcodigo_detalle_grupoDepreciaciones.setEnabled(isHabilitar && this.depreciacionesConstantesFunciones.activarcodigo_detalle_grupoDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jTextAreanombre_detalle_grupoDepreciaciones.setEnabled(isHabilitar && this.depreciacionesConstantesFunciones.activarnombre_detalle_grupoDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jTextFieldclaveDepreciaciones.setEnabled(isHabilitar && this.depreciacionesConstantesFunciones.activarclaveDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jTextAreanombreDepreciaciones.setEnabled(isHabilitar && this.depreciacionesConstantesFunciones.activarnombreDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jDateChooserfecha_compraDepreciaciones.setEnabled(isHabilitar && this.depreciacionesConstantesFunciones.activarfecha_compraDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jTextFieldvida_utilDepreciaciones.setEnabled(isHabilitar && this.depreciacionesConstantesFunciones.activarvida_utilDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jTextFieldcosto_de_compraDepreciaciones.setEnabled(isHabilitar && this.depreciacionesConstantesFunciones.activarcosto_de_compraDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jDateChooserfecha_mantenimientoDepreciaciones.setEnabled(isHabilitar && this.depreciacionesConstantesFunciones.activarfecha_mantenimientoDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jDateChooserfecha_depreciacionDepreciaciones.setEnabled(isHabilitar && this.depreciacionesConstantesFunciones.activarfecha_depreciacionDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jTextFieldvalor_acumuladoDepreciaciones.setEnabled(isHabilitar && this.depreciacionesConstantesFunciones.activarvalor_acumuladoDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jTextFieldvalor_gastoDepreciaciones.setEnabled(isHabilitar && this.depreciacionesConstantesFunciones.activarvalor_gastoDepreciaciones);	
		//
		this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_empresaDepreciaciones.setEnabled(isHabilitar && this.depreciacionesConstantesFunciones.activarid_empresaDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anio_inicioDepreciaciones.setEnabled(isHabilitar && this.depreciacionesConstantesFunciones.activarid_anio_inicioDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anio_finDepreciaciones.setEnabled(isHabilitar && this.depreciacionesConstantesFunciones.activarid_anio_finDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mes_inicioDepreciaciones.setEnabled(isHabilitar && this.depreciacionesConstantesFunciones.activarid_mes_inicioDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mes_finDepreciaciones.setEnabled(isHabilitar && this.depreciacionesConstantesFunciones.activarid_mes_finDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anioDepreciaciones.setEnabled(isHabilitar && this.depreciacionesConstantesFunciones.activarid_anioDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mesDepreciaciones.setEnabled(isHabilitar && this.depreciacionesConstantesFunciones.activarid_mesDepreciaciones);
	};
	
	public void setDefaultControlesDepreciaciones() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDepreciaciones(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.depreciacionesSessionBean.setConGuardarRelaciones(true);			
			this.depreciacionesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDepreciaciones.jTabbedPaneRelacionesDepreciaciones.setVisible(true);
			
					
		} else {
			//this.depreciacionesSessionBean.setConGuardarRelaciones(false);			
			this.depreciacionesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDepreciaciones.jTabbedPaneRelacionesDepreciaciones.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDepreciaciones() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Depreciaciones depreciacionesAux:this.depreciacionesLogic.getDepreciacioness()) {
				if(depreciacionesAux.getId().equals(this.iIdNuevoDepreciaciones)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Depreciaciones depreciacionesAux:this.depreciacioness) {
				if(depreciacionesAux.getId().equals(this.iIdNuevoDepreciaciones)) {
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
	
	public int getIndiceActualDepreciaciones(Depreciaciones depreciaciones,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Depreciaciones depreciacionesAux:this.depreciacionesLogic.getDepreciacioness()) {
				if(depreciacionesAux.getId().equals(depreciaciones.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Depreciaciones depreciacionesAux:this.depreciacioness) {
				if(depreciacionesAux.getId().equals(depreciaciones.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDepreciaciones(Depreciaciones depreciacionesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Depreciaciones depreciacionesAux:this.depreciacionesLogic.getDepreciacioness()) {
				if(depreciacionesAux.getDepreciacionesOriginal().getId().equals(depreciacionesOriginal.getId())) {
					existe=true;
					depreciacionesOriginal.setId(depreciacionesAux.getId());
					depreciacionesOriginal.setVersionRow(depreciacionesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Depreciaciones depreciacionesAux:this.depreciacioness) {
				if(depreciacionesAux.getDepreciacionesOriginal().getId().equals(depreciacionesOriginal.getId())) {
					existe=true;
					depreciacionesOriginal.setId(depreciacionesAux.getId());
					depreciacionesOriginal.setVersionRow(depreciacionesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDepreciaciones(Boolean esParaCancelar) throws Exception {
		depreciacionessAux=new ArrayList<Depreciaciones>();
		depreciacionesAux=new Depreciaciones();
		
		if(!this.depreciacionesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Depreciaciones depreciacionesAux:this.depreciacionesLogic.getDepreciacioness()) {
					if(depreciacionesAux.getId()<0) {
						depreciacionessAux.add(depreciacionesAux);
					}		
				}
				this.iIdNuevoDepreciaciones=0L;
				this.depreciacionesLogic.getDepreciacioness().removeAll(depreciacionessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Depreciaciones depreciacionesAux:this.depreciacioness) {
					if(depreciacionesAux.getId()<0) {
						depreciacionessAux.add(depreciacionesAux);
					}		
				}
				this.iIdNuevoDepreciaciones=0L;
				this.depreciacioness.removeAll(depreciacionessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDepreciaciones 
					&& this.depreciacionesLogic.getDepreciacioness().size()>0
					) {
					depreciacionesAux=this.depreciacionesLogic.getDepreciacioness().get(this.depreciacionesLogic.getDepreciacioness().size() - 1);
				
					if(depreciacionesAux.getId()<0) {
						this.depreciacionesLogic.getDepreciacioness().remove(depreciacionesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDepreciaciones && this.depreciacioness.size()>0) {
					depreciacionesAux=this.depreciacioness.get(this.depreciacioness.size() - 1);
				
					if(depreciacionesAux.getId()<0) {
						this.depreciacioness.remove(depreciacionesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDepreciaciones(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(depreciaciones.getId()<0) {
				this.depreciacionesLogic.getDepreciacioness().remove(this.depreciaciones);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(depreciaciones.getId()<0) {
				this.depreciacioness.remove(this.depreciaciones);
			}
		}			
	}
	
	public void setEstadosInicialesDepreciaciones(List<Depreciaciones> depreciacionessAux) throws Exception {
		DepreciacionesConstantesFunciones.setEstadosInicialesDepreciaciones(depreciacionessAux);
	}
	
	public void setEstadosInicialesDepreciaciones(Depreciaciones depreciacionesAux) throws Exception {
		DepreciacionesConstantesFunciones.setEstadosInicialesDepreciaciones(depreciacionesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDepreciacionesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDepreciaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDepreciacionesActual()) {
				if(!this.isEsNuevoDepreciaciones) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDepreciaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDepreciaciones=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDepreciacionesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Depreciaciones ?", "MANTENIMIENTO DE Depreciaciones", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDepreciaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Depreciaciones depreciaciones) throws Exception {
		DepreciacionesConstantesFunciones.seleccionarAsignar(this.depreciaciones,depreciaciones);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDepreciaciones=this.isPermisoActualizarOriginalDepreciaciones;
			
			
			this.seleccionarAsignar(depreciaciones);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesDepreciaciones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.depreciacionesSessionBean.setsFuncionBusquedaRapida(this.depreciacionesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDepreciaciones) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDepreciaciones(esParaCancelar);				
				this.cancelarNuevoDepreciaciones(esParaCancelar);								
			}
			
			this.depreciaciones=new Depreciaciones();
			
			this.inicializarDepreciaciones();
			
			this.actualizarEstadoCeldasBotonesDepreciaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDepreciaciones() throws Exception {
		try {
			DepreciacionesConstantesFunciones.inicializarDepreciaciones(this.depreciaciones);
			
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
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.depreciacionesLogic.getDepreciacioness().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDepreciacioness(String sAccionBusqueda,List<Depreciaciones> depreciacionessParaReportes) throws Exception {
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
					sPathReporteFinal="Depreciaciones"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DepreciacionesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DepreciacionesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Depreciaciones"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Depreciacioneses");		
		parameters.put("busquedapor", DepreciacionesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDepreciaciones=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DepreciacionesConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DepreciacionesConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDepreciaciones=new JRBeanArrayDataSource(DepreciacionesJInternalFrame.TraerDepreciacionesBeans(depreciacionessParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDepreciaciones);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DepreciacionesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DepreciacionesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DepreciacionesBean.TraerDepreciacionesBeans(depreciacionessParaReportes).toArray()));
							
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
				this.generarExcelReporteDepreciacioness(sAccionBusqueda,sTipoArchivoReporte,depreciacionessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDepreciacioness(sAccionBusqueda,sTipoArchivoReporte,depreciacionessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDepreciacionesActionPerformed(null);
					//this.generarExcelReporteDepreciacioness(sAccionBusqueda,sTipoArchivoReporte,depreciacionessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDepreciacioness(sAccionBusqueda,sTipoArchivoReporte,depreciacionessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDepreciacioness(sAccionBusqueda,sTipoArchivoReporte,depreciacionessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDepreciacioness(sAccionBusqueda,sTipoArchivoReporte,depreciacionessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDepreciacioness(String sAccionBusqueda,String sTipoArchivoReporte,List<Depreciaciones> depreciacionessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"depreciaciones";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Depreciacioness");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDepreciaciones("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Depreciaciones depreciaciones : depreciacionessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DepreciacionesConstantesFunciones.generarExcelReporteDataDepreciaciones("NORMAL",row,workbook,depreciaciones,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.depreciacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Depreciaciones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDepreciaciones(String sTipo,Row row,Workbook workbook) {
		
		DepreciacionesConstantesFunciones.generarExcelReporteHeaderDepreciaciones(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDepreciacioness(String sAccionBusqueda,String sTipoArchivoReporte,List<Depreciaciones> depreciacionessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"depreciaciones_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Depreciacioness");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Depreciaciones depreciaciones : depreciacionessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DepreciacionesConstantesFunciones.getDepreciacionesDescripcion(depreciaciones));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionesConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciaciones.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionesConstantesFunciones.LABEL_IDANIOINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_IDANIOINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciaciones.getanioinicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionesConstantesFunciones.LABEL_IDANIOFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_IDANIOFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciaciones.getaniofin_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionesConstantesFunciones.LABEL_IDMESINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_IDMESINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciaciones.getmesinicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionesConstantesFunciones.LABEL_IDMESFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_IDMESFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciaciones.getmesfin_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionesConstantesFunciones.LABEL_CODIGOSUBGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_CODIGOSUBGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciaciones.getcodigo_sub_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionesConstantesFunciones.LABEL_NOMBRESUBGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_NOMBRESUBGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciaciones.getnombre_sub_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionesConstantesFunciones.LABEL_CODIGODETALLEGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciaciones.getcodigo_detalle_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciaciones.getnombre_detalle_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionesConstantesFunciones.LABEL_CLAVE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_CLAVE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciaciones.getclave());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionesConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciaciones.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionesConstantesFunciones.LABEL_FECHACOMPRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_FECHACOMPRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciaciones.getfecha_compra());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionesConstantesFunciones.LABEL_VIDAUTIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_VIDAUTIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciaciones.getvida_util());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionesConstantesFunciones.LABEL_COSTODECOMPRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_COSTODECOMPRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciaciones.getcosto_de_compra());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionesConstantesFunciones.LABEL_FECHAMANTENIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_FECHAMANTENIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciaciones.getfecha_mantenimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionesConstantesFunciones.LABEL_FECHADEPRECIACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_FECHADEPRECIACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciaciones.getfecha_depreciacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionesConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciaciones.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionesConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciaciones.getmes_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionesConstantesFunciones.LABEL_VALORACUMULADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_VALORACUMULADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciaciones.getvalor_acumulado());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionesConstantesFunciones.LABEL_VALORGASTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_VALORGASTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciaciones.getvalor_gasto());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.depreciacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Depreciaciones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDepreciacioness(String sAccionBusqueda,String sTipoArchivoReporte,List<Depreciaciones> depreciacionessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Depreciaciones> depreciacionessRespaldo=null;
		
		classes=DepreciacionesConstantesFunciones.getClassesRelationshipsOfDepreciaciones(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.depreciacionesLogic.setDatosCliente(this.datosCliente);
		this.depreciacionesLogic.setDatosDeep(this.datosDeep);
		this.depreciacionesLogic.setIsConDeep(true);
		
		depreciacionessRespaldo=this.depreciacionesLogic.getDepreciacioness();
		
		this.depreciacionesLogic.setDepreciacioness(depreciacionessParaReportes);	
		this.depreciacionesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		depreciacionessParaReportes=this.depreciacionesLogic.getDepreciacioness();
		this.depreciacionesLogic.setDepreciacioness(depreciacionessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"depreciaciones_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Depreciacioness");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDepreciaciones("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Depreciaciones depreciaciones : depreciacionessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDepreciaciones("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DepreciacionesConstantesFunciones.generarExcelReporteDataDepreciaciones("NORMAL",row,workbook,depreciaciones,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DepreciacionesConstantesFunciones.getDepreciacionesDescripcion(depreciaciones));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.depreciacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Depreciaciones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDepreciaciones.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDepreciaciones.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDepreciaciones.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDepreciaciones.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDepreciaciones() throws Exception {		
		this.startProcessDepreciaciones(true);
	}
	
	public void startProcessDepreciaciones(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDepreciaciones ,this.jPanelParametrosReportesDepreciaciones, this.jScrollPanelDatosDepreciaciones,this.jPanelPaginacionDepreciaciones, this.jScrollPanelDatosEdicionDepreciaciones, this.jPanelAccionesDepreciaciones,this.jPanelAccionesFormularioDepreciaciones,this.jmenuBarDepreciaciones,this.jmenuBarDetalleDepreciaciones,this.jTtoolBarDepreciaciones,this.jTtoolBarDetalleDepreciaciones);		
		
		final JTabbedPane jTabbedPaneBusquedasDepreciaciones=this.jTabbedPaneBusquedasDepreciaciones; 
		
		final JPanel jPanelParametrosReportesDepreciaciones=this.jPanelParametrosReportesDepreciaciones;
		//final JScrollPane jScrollPanelDatosDepreciaciones=this.jScrollPanelDatosDepreciaciones;
		final JTable jTableDatosDepreciaciones=this.jTableDatosDepreciaciones;		
		final JPanel jPanelPaginacionDepreciaciones=this.jPanelPaginacionDepreciaciones;
		//final JScrollPane jScrollPanelDatosEdicionDepreciaciones=this.jScrollPanelDatosEdicionDepreciaciones;
		final JPanel jPanelAccionesDepreciaciones=this.jPanelAccionesDepreciaciones;
		
		JPanel jPanelCamposAuxiliarDepreciaciones=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDepreciaciones=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
			jPanelCamposAuxiliarDepreciaciones=this.jInternalFrameDetalleFormDepreciaciones.jPanelCamposDepreciaciones;
			jPanelAccionesFormularioAuxiliarDepreciaciones=this.jInternalFrameDetalleFormDepreciaciones.jPanelAccionesFormularioDepreciaciones;
		}
		
		final JPanel jPanelCamposDepreciaciones=jPanelCamposAuxiliarDepreciaciones;
		final JPanel jPanelAccionesFormularioDepreciaciones=jPanelAccionesFormularioAuxiliarDepreciaciones;
		
		
		final JMenuBar jmenuBarDepreciaciones=this.jmenuBarDepreciaciones;
		final JToolBar jTtoolBarDepreciaciones=this.jTtoolBarDepreciaciones;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDepreciaciones=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDepreciaciones=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
			jmenuBarDetalleAuxiliarDepreciaciones=this.jInternalFrameDetalleFormDepreciaciones.jmenuBarDetalleDepreciaciones;
			jTtoolBarDetalleAuxiliarDepreciaciones=this.jInternalFrameDetalleFormDepreciaciones.jTtoolBarDetalleDepreciaciones;
		}
		
		final JMenuBar jmenuBarDetalleDepreciaciones=jmenuBarDetalleAuxiliarDepreciaciones;
		final JToolBar jTtoolBarDetalleDepreciaciones=jTtoolBarDetalleAuxiliarDepreciaciones;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDepreciaciones;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDepreciaciones;
			processRunnable.jTableDatos=jTableDatosDepreciaciones;
			processRunnable.jPanelCampos=jPanelCamposDepreciaciones;
			processRunnable.jPanelPaginacion=jPanelPaginacionDepreciaciones;
			processRunnable.jPanelAcciones=jPanelAccionesDepreciaciones;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDepreciaciones;
			
			
			processRunnable.jmenuBar=jmenuBarDepreciaciones;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDepreciaciones;
			processRunnable.jTtoolBar=jTtoolBarDepreciaciones;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDepreciaciones;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDepreciaciones ,jPanelParametrosReportesDepreciaciones,jTableDatosDepreciaciones, /*jScrollPanelDatosDepreciaciones,*/jPanelCamposDepreciaciones,jPanelPaginacionDepreciaciones, /*jScrollPanelDatosEdicionDepreciaciones,*/ jPanelAccionesDepreciaciones,jPanelAccionesFormularioDepreciaciones,jmenuBarDepreciaciones,jmenuBarDetalleDepreciaciones,jTtoolBarDepreciaciones,jTtoolBarDetalleDepreciaciones);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDepreciaciones ,jPanelParametrosReportesDepreciaciones, jScrollPanelDatosDepreciaciones,jPanelPaginacionDepreciaciones, jScrollPanelDatosEdicionDepreciaciones, jPanelAccionesDepreciaciones,jPanelAccionesFormularioDepreciaciones,jmenuBarDepreciaciones,jmenuBarDetalleDepreciaciones,jTtoolBarDepreciaciones,jTtoolBarDetalleDepreciaciones);
						
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
	
	public void finishProcessDepreciaciones() {// throws Exception 
		this.finishProcessDepreciaciones(true);
	}
	
	public void finishProcessDepreciaciones(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDepreciaciones ,this.jPanelParametrosReportesDepreciaciones, this.jScrollPanelDatosDepreciaciones,this.jPanelPaginacionDepreciaciones, this.jScrollPanelDatosEdicionDepreciaciones, this.jPanelAccionesDepreciaciones,this.jPanelAccionesFormularioDepreciaciones,this.jmenuBarDepreciaciones,this.jmenuBarDetalleDepreciaciones,this.jTtoolBarDepreciaciones,this.jTtoolBarDetalleDepreciaciones);		
		
		final JTabbedPane jTabbedPaneBusquedasDepreciaciones=this.jTabbedPaneBusquedasDepreciaciones; 
		
		final JPanel jPanelParametrosReportesDepreciaciones=this.jPanelParametrosReportesDepreciaciones;
		//final JScrollPane jScrollPanelDatosDepreciaciones=this.jScrollPanelDatosDepreciaciones;
		final JTable jTableDatosDepreciaciones=this.jTableDatosDepreciaciones;		
		final JPanel jPanelPaginacionDepreciaciones=this.jPanelPaginacionDepreciaciones;
		//final JScrollPane jScrollPanelDatosEdicionDepreciaciones=this.jScrollPanelDatosEdicionDepreciaciones;
		final JPanel jPanelAccionesDepreciaciones=this.jPanelAccionesDepreciaciones;
		
		JPanel jPanelCamposAuxiliarDepreciaciones=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDepreciaciones=new JPanel();
		
		if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
			jPanelCamposAuxiliarDepreciaciones=this.jInternalFrameDetalleFormDepreciaciones.jPanelCamposDepreciaciones;
			jPanelAccionesFormularioAuxiliarDepreciaciones=this.jInternalFrameDetalleFormDepreciaciones.jPanelAccionesFormularioDepreciaciones;
		}
		
		final JPanel jPanelCamposDepreciaciones=jPanelCamposAuxiliarDepreciaciones;
		final JPanel jPanelAccionesFormularioDepreciaciones=jPanelAccionesFormularioAuxiliarDepreciaciones;
		
		
		final JMenuBar jmenuBarDepreciaciones=this.jmenuBarDepreciaciones;		
		final JToolBar jTtoolBarDepreciaciones=this.jTtoolBarDepreciaciones;
				
		JMenuBar jmenuBarDetalleAuxiliarDepreciaciones=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDepreciaciones=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
			jmenuBarDetalleAuxiliarDepreciaciones=this.jInternalFrameDetalleFormDepreciaciones.jmenuBarDetalleDepreciaciones;
			jTtoolBarDetalleAuxiliarDepreciaciones=this.jInternalFrameDetalleFormDepreciaciones.jTtoolBarDetalleDepreciaciones;		
		}
		
		final JMenuBar jmenuBarDetalleDepreciaciones=jmenuBarDetalleAuxiliarDepreciaciones;
		final JToolBar jTtoolBarDetalleDepreciaciones=jTtoolBarDetalleAuxiliarDepreciaciones;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDepreciaciones;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDepreciaciones;
			processRunnable.jTableDatos=jTableDatosDepreciaciones;
			processRunnable.jPanelCampos=jPanelCamposDepreciaciones;
			processRunnable.jPanelPaginacion=jPanelPaginacionDepreciaciones;
			processRunnable.jPanelAcciones=jPanelAccionesDepreciaciones;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDepreciaciones;
			
			
			processRunnable.jmenuBar=jmenuBarDepreciaciones;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDepreciaciones;
			processRunnable.jTtoolBar=jTtoolBarDepreciaciones;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDepreciaciones;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDepreciaciones ,jPanelParametrosReportesDepreciaciones, jTableDatosDepreciaciones,/*jScrollPanelDatosDepreciaciones,*/jPanelCamposDepreciaciones,jPanelPaginacionDepreciaciones, /*jScrollPanelDatosEdicionDepreciaciones,*/ jPanelAccionesDepreciaciones,jPanelAccionesFormularioDepreciaciones,jmenuBarDepreciaciones,jmenuBarDetalleDepreciaciones,jTtoolBarDepreciaciones,jTtoolBarDetalleDepreciaciones));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDepreciaciones(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDepreciaciones(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDepreciaciones(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDepreciaciones(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDepreciaciones,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDepreciaciones,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDepreciaciones(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDepreciaciones,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDepreciaciones,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.depreciacionesConstantesFunciones.getsFinalQueryDepreciaciones();
		String  finalQueryPaginacionTodos=this.depreciacionesConstantesFunciones.getsFinalQueryDepreciaciones();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DepreciacionesConstantesFunciones.getArrayColumnasGlobalesNoDepreciaciones(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DepreciacionesConstantesFunciones.getArrayColumnasGlobalesDepreciaciones(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DepreciacionesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.depreciacionessEliminados= new ArrayList<Depreciaciones>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDepreciaciones();
		
				///*DepreciacionesSessionBean*/this.depreciacionesSessionBean=new DepreciacionesSessionBean();
			
			if(this.depreciacionesSessionBean==null) {
				this.depreciacionesSessionBean=new DepreciacionesSessionBean();
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
					this.iNumeroPaginacion=DepreciacionesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DepreciacionesConstantesFunciones.getClassesForeignKeysOfDepreciaciones(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/depreciaciones."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			depreciacionessAux= new ArrayList<Depreciaciones>();
			
				
			depreciacionesLogic.setDatosCliente(this.datosCliente);
			depreciacionesLogic.setDatosDeep(this.datosDeep);
			depreciacionesLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaDepreciaciones")) {
				this.sDetalleReporte=DepreciacionesConstantesFunciones.getDetalleIndiceBusquedaDepreciaciones(id_anio_inicioBusquedaDepreciaciones,id_anio_finBusquedaDepreciaciones,id_mes_inicioBusquedaDepreciaciones,id_mes_finBusquedaDepreciaciones);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					depreciacionesLogic.getDepreciacionessBusquedaDepreciaciones(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_anio_inicioBusquedaDepreciaciones,id_anio_finBusquedaDepreciaciones,id_mes_inicioBusquedaDepreciaciones,id_mes_finBusquedaDepreciaciones);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DepreciacionesConstantesFunciones.getDetalleIndiceBusquedaDepreciaciones(id_anio_inicioBusquedaDepreciaciones,id_anio_finBusquedaDepreciaciones,id_mes_inicioBusquedaDepreciaciones,id_mes_finBusquedaDepreciaciones);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DepreciacionesConstantesFunciones.getDetalleIndiceBusquedaDepreciaciones(id_anio_inicioBusquedaDepreciaciones,id_anio_finBusquedaDepreciaciones,id_mes_inicioBusquedaDepreciaciones,id_mes_finBusquedaDepreciaciones);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=depreciacionesLogic.getDepreciacioness()==null||depreciacionesLogic.getDepreciacioness().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=depreciacioness==null|| depreciacioness.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						depreciacionessAux=new ArrayList<Depreciaciones>();
						depreciacionessAux.addAll(depreciacionesLogic.getDepreciacioness());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depreciacionessAux=new ArrayList<Depreciaciones>();
							depreciacionessAux.addAll(depreciacioness);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							depreciacionesLogic.getDepreciacionessBusquedaDepreciaciones(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_anio_inicioBusquedaDepreciaciones,id_anio_finBusquedaDepreciaciones,id_mes_inicioBusquedaDepreciaciones,id_mes_finBusquedaDepreciaciones);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DepreciacionesConstantesFunciones.getDetalleIndiceBusquedaDepreciaciones(id_anio_inicioBusquedaDepreciaciones,id_anio_finBusquedaDepreciaciones,id_mes_inicioBusquedaDepreciaciones,id_mes_finBusquedaDepreciaciones);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DepreciacionesConstantesFunciones.getDetalleIndiceBusquedaDepreciaciones(id_anio_inicioBusquedaDepreciaciones,id_anio_finBusquedaDepreciaciones,id_mes_inicioBusquedaDepreciaciones,id_mes_finBusquedaDepreciaciones);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDepreciacioness("BusquedaDepreciaciones",depreciacionesLogic.getDepreciacioness());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDepreciacioness("BusquedaDepreciaciones",depreciacioness);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						depreciacionesLogic.setDepreciacioness(new ArrayList<Depreciaciones>());
						depreciacionesLogic.getDepreciacioness().addAll(depreciacionessAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depreciacioness=new ArrayList<Depreciaciones>();
							depreciacioness.addAll(depreciacionessAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDepreciaciones();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDepreciaciones();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=depreciacionesLogic.getDepreciacioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=depreciacioness.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=depreciacionesLogic.getDepreciacioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=depreciacioness.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Depreciaciones depreciaciones) {
		Boolean permite=true;
		
		if(this.depreciaciones.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DepreciacionesConstantesFunciones.getOrderByListaDepreciaciones();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DepreciacionesConstantesFunciones.getOrderByListaDepreciaciones();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Depreciaciones depreciaciones:depreciacionesLogic.getDepreciacioness()) {
				if(depreciaciones.getsType().equals(Constantes2.S_TOTALES)) {
					depreciacionesTotales=depreciaciones;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Depreciaciones depreciaciones:this.depreciacioness) {
				if(depreciaciones.getsType().equals(Constantes2.S_TOTALES)) {
					depreciacionesTotales=depreciaciones;
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
			this.depreciacionesAux=new Depreciaciones();
			this.depreciacionesAux.setsType(Constantes2.S_TOTALES);
			this.depreciacionesAux.setIsNew(false);
			this.depreciacionesAux.setIsChanged(false);
			this.depreciacionesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//DepreciacionesConstantesFunciones.TotalizarValoresFilaDepreciaciones(this.depreciacionesLogic.getDepreciacioness(),this.depreciacionesAux);
				
				//this.depreciacionesLogic.getDepreciacioness().add(this.depreciacionesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DepreciacionesConstantesFunciones.TotalizarValoresFilaDepreciaciones(this.depreciacioness,this.depreciacionesAux);
				
				this.depreciacioness.add(this.depreciacionesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		depreciacionesTotales=new Depreciaciones();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.depreciacionesLogic.getDepreciacioness().remove(depreciacionesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.depreciacioness.remove(depreciacionesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		depreciacionesTotales=new Depreciaciones();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Depreciaciones depreciaciones:depreciacionesLogic.getDepreciacioness()) {
				if(depreciaciones.getsType().equals(Constantes2.S_TOTALES)) {
					depreciacionesTotales=depreciaciones;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DepreciacionesConstantesFunciones.TotalizarValoresFilaDepreciaciones(this.depreciacionesLogic.getDepreciacioness(),depreciacionesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Depreciaciones depreciaciones:this.depreciacioness) {
				if(depreciaciones.getsType().equals(Constantes2.S_TOTALES)) {
					depreciacionesTotales=depreciaciones;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DepreciacionesConstantesFunciones.TotalizarValoresFilaDepreciaciones(this.depreciacioness,depreciacionesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDepreciacionessBusquedaDepreciaciones()throws Exception {
		try {
			sAccionBusqueda="BusquedaDepreciaciones";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDepreciacionessFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDepreciacionessFK_IdAnioFin()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnioFin";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDepreciacionessFK_IdAnioInicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnioInicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDepreciacionessFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDepreciacionessFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDepreciacionessFK_IdMesFin()throws Exception {
		try {
			sAccionBusqueda="FK_IdMesFin";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDepreciacionessFK_IdMesInicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdMesInicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDepreciacionessBusquedaDepreciaciones(String sFinalQuery,Long id_anio_inicio,Long id_anio_fin,Long id_mes_inicio,Long id_mes_fin)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//depreciacionesLogic.getDepreciacionessBusquedaDepreciaciones(sFinalQuery,this.pagination,id_anio_inicio,id_anio_fin,id_mes_inicio,id_mes_fin);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDepreciacionessFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//depreciacionesLogic.getDepreciacionessFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDepreciacionessFK_IdAnioFin(String sFinalQuery,Long id_anio_fin)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//depreciacionesLogic.getDepreciacionessFK_IdAnioFin(sFinalQuery,this.pagination,id_anio_fin);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDepreciacionessFK_IdAnioInicio(String sFinalQuery,Long id_anio_inicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//depreciacionesLogic.getDepreciacionessFK_IdAnioInicio(sFinalQuery,this.pagination,id_anio_inicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDepreciacionessFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//depreciacionesLogic.getDepreciacionessFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDepreciacionessFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//depreciacionesLogic.getDepreciacionessFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDepreciacionessFK_IdMesFin(String sFinalQuery,Long id_mes_fin)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//depreciacionesLogic.getDepreciacionessFK_IdMesFin(sFinalQuery,this.pagination,id_mes_fin);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDepreciacionessFK_IdMesInicio(String sFinalQuery,Long id_mes_inicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//depreciacionesLogic.getDepreciacionessFK_IdMesInicio(sFinalQuery,this.pagination,id_mes_inicio);
				
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
	
	public void inicializarPermisosDepreciaciones() {
		this.isPermisoTodoDepreciaciones=false;
		this.isPermisoNuevoDepreciaciones=false;
		this.isPermisoActualizarDepreciaciones=false;
		this.isPermisoActualizarOriginalDepreciaciones=false;
		this.isPermisoEliminarDepreciaciones=false;
		this.isPermisoGuardarCambiosDepreciaciones=false;
		this.isPermisoConsultaDepreciaciones=true;
		this.isPermisoBusquedaDepreciaciones=true;
		this.isPermisoReporteDepreciaciones=true;
		this.isPermisoOrdenDepreciaciones=false;		
		this.isPermisoPaginacionMedioDepreciaciones=false;		
		this.isPermisoPaginacionAltoDepreciaciones=false;		
		this.isPermisoPaginacionTodoDepreciaciones=false;		
		this.isPermisoCopiarDepreciaciones=false;		
		this.isPermisoVerFormDepreciaciones=false;		
		this.isPermisoDuplicarDepreciaciones=false;
		this.isPermisoOrdenDepreciaciones=false;
	}
	
	public void setPermisosUsuarioDepreciaciones(Boolean isPermiso) {
		this.isPermisoTodoDepreciaciones=isPermiso;
		this.isPermisoNuevoDepreciaciones=isPermiso;
		this.isPermisoActualizarDepreciaciones=isPermiso;
		this.isPermisoActualizarOriginalDepreciaciones=isPermiso;
		this.isPermisoEliminarDepreciaciones=isPermiso;
		this.isPermisoGuardarCambiosDepreciaciones=isPermiso;
		this.isPermisoConsultaDepreciaciones=isPermiso;
		this.isPermisoBusquedaDepreciaciones=isPermiso;
		this.isPermisoReporteDepreciaciones=isPermiso;
		this.isPermisoOrdenDepreciaciones=isPermiso;		
		this.isPermisoPaginacionMedioDepreciaciones=isPermiso;		
		this.isPermisoPaginacionAltoDepreciaciones=isPermiso;		
		this.isPermisoPaginacionTodoDepreciaciones=isPermiso;		
		this.isPermisoCopiarDepreciaciones=isPermiso;		
		this.isPermisoVerFormDepreciaciones=isPermiso;		
		this.isPermisoDuplicarDepreciaciones=isPermiso;
		this.isPermisoOrdenDepreciaciones=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDepreciaciones(Boolean isPermiso) {
		//this.isPermisoTodoDepreciaciones=isPermiso;
		this.isPermisoNuevoDepreciaciones=isPermiso;
		this.isPermisoActualizarDepreciaciones=isPermiso;
		this.isPermisoActualizarOriginalDepreciaciones=isPermiso;
		this.isPermisoEliminarDepreciaciones=isPermiso;
		this.isPermisoGuardarCambiosDepreciaciones=isPermiso;
		//this.isPermisoConsultaDepreciaciones=isPermiso;
		//this.isPermisoBusquedaDepreciaciones=isPermiso;
		//this.isPermisoReporteDepreciaciones=isPermiso;
		//this.isPermisoOrdenDepreciaciones=isPermiso;		
		//this.isPermisoPaginacionMedioDepreciaciones=isPermiso;		
		//this.isPermisoPaginacionAltoDepreciaciones=isPermiso;		
		//this.isPermisoPaginacionTodoDepreciaciones=isPermiso;		
		//this.isPermisoCopiarDepreciaciones=isPermiso;		
		//this.isPermisoDuplicarDepreciaciones=isPermiso;
		//this.isPermisoOrdenDepreciaciones=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDepreciacionesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DepreciacionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDepreciaciones(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDepreciacionesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDepreciacionesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDepreciacionesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDepreciacionesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDepreciaciones() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DepreciacionesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.depreciacionesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DepreciacionesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDepreciaciones=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDepreciaciones=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDepreciaciones=this.isPermisoActualizarDepreciaciones;
			this.isPermisoEliminarDepreciaciones=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDepreciaciones=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDepreciaciones=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDepreciaciones=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDepreciaciones=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDepreciaciones=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDepreciaciones=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDepreciaciones=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDepreciaciones=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDepreciaciones=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDepreciaciones=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDepreciaciones=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDepreciaciones=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDepreciaciones=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.depreciacionesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDepreciaciones.setToolTipText(this.jTableDatosDepreciaciones.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDepreciaciones(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDepreciaciones(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DepreciacionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DepreciacionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDepreciaciones() throws Exception {
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
	public void inicializarCombosForeignKeyDepreciacionesListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.anioiniciosForeignKey=new ArrayList();
				this.aniofinsForeignKey=new ArrayList();
				this.mesiniciosForeignKey=new ArrayList();
				this.mesfinsForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDepreciacionesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DepreciacionesJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAnioInicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAnioFinListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesInicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesFinListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyAnioInicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.anioiniciosForeignKey==null||this.anioiniciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AnioConstantesFunciones.SFINALQUERY;

				this.cargarCombosAnioIniciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAnioFinListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.aniofinsForeignKey==null||this.aniofinsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AnioConstantesFunciones.SFINALQUERY;

				this.cargarCombosAnioFinsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMesInicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.mesiniciosForeignKey==null||this.mesiniciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MesConstantesFunciones.SFINALQUERY;

				this.cargarCombosMesIniciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMesFinListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.mesfinsForeignKey==null||this.mesfinsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MesConstantesFunciones.SFINALQUERY;

				this.cargarCombosMesFinsForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyMesListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.messForeignKey==null||this.messForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MesConstantesFunciones.SFINALQUERY;

				this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyDepreciaciones()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyAnioInicio();
			this.addItemDefectoCombosForeignKeyAnioFin();
			this.addItemDefectoCombosForeignKeyMesInicio();
			this.addItemDefectoCombosForeignKeyMesFin();
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.depreciacionesSessionBean==null) {
				this.depreciacionesSessionBean=new DepreciacionesSessionBean();
			}

			if(!this.depreciacionesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyAnioInicio()throws Exception {
		try {

			if(!this.depreciacionesSessionBean.getisBusquedaDesdeForeignKeySesionAnioInicio()) {
				Anio anioinicio=new Anio();
				AnioConstantesFunciones.setAnioDescripcion(anioinicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				anioinicio.setId(null);

				if(!AnioConstantesFunciones.ExisteEnLista(this.anioiniciosForeignKey,anioinicio,true)) {

					this.anioiniciosForeignKey.add(0,anioinicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyAnioFin()throws Exception {
		try {

			if(!this.depreciacionesSessionBean.getisBusquedaDesdeForeignKeySesionAnioFin()) {
				Anio aniofin=new Anio();
				AnioConstantesFunciones.setAnioDescripcion(aniofin,Constantes.SMENSAJE_ESCOJA_OPCION);
				aniofin.setId(null);

				if(!AnioConstantesFunciones.ExisteEnLista(this.aniofinsForeignKey,aniofin,true)) {

					this.aniofinsForeignKey.add(0,aniofin);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyMesInicio()throws Exception {
		try {

			if(!this.depreciacionesSessionBean.getisBusquedaDesdeForeignKeySesionMesInicio()) {
				Mes mesinicio=new Mes();
				MesConstantesFunciones.setMesDescripcion(mesinicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				mesinicio.setId(null);

				if(!MesConstantesFunciones.ExisteEnLista(this.mesiniciosForeignKey,mesinicio,true)) {

					this.mesiniciosForeignKey.add(0,mesinicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyMesFin()throws Exception {
		try {

			if(!this.depreciacionesSessionBean.getisBusquedaDesdeForeignKeySesionMesFin()) {
				Mes mesfin=new Mes();
				MesConstantesFunciones.setMesDescripcion(mesfin,Constantes.SMENSAJE_ESCOJA_OPCION);
				mesfin.setId(null);

				if(!MesConstantesFunciones.ExisteEnLista(this.mesfinsForeignKey,mesfin,true)) {

					this.mesfinsForeignKey.add(0,mesfin);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.depreciacionesSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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

	public void addItemDefectoCombosForeignKeyMes()throws Exception {
		try {

			if(!this.depreciacionesSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				Mes mes=new Mes();
				MesConstantesFunciones.setMesDescripcion(mes,Constantes.SMENSAJE_ESCOJA_OPCION);
				mes.setId(null);

				if(!MesConstantesFunciones.ExisteEnLista(this.messForeignKey,mes,true)) {

					this.messForeignKey.add(0,mes);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyDepreciaciones()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDepreciaciones(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDepreciaciones()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDepreciaciones();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDepreciaciones(Depreciaciones depreciaciones)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDepreciaciones(Depreciaciones depreciaciones,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDepreciaciones()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDepreciaciones()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDepreciaciones()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDepreciaciones()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDepreciaciones()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDepreciaciones()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameAnioIniciosForeignKey("Todos");
			this.cargarCombosFrameAnioFinsForeignKey("Todos");
			this.cargarCombosFrameMesIniciosForeignKey("Todos");
			this.cargarCombosFrameMesFinsForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDepreciaciones(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAnioIniciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAnioFinsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMesIniciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMesFinsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDepreciaciones()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_empresaDepreciaciones!=null && this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_empresaDepreciaciones.getItemCount()>0) {
				this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_empresaDepreciaciones.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anio_inicioDepreciaciones!=null && this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anio_inicioDepreciaciones.getItemCount()>0) {
				this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anio_inicioDepreciaciones.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anio_finDepreciaciones!=null && this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anio_finDepreciaciones.getItemCount()>0) {
				this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anio_finDepreciaciones.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mes_inicioDepreciaciones!=null && this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mes_inicioDepreciaciones.getItemCount()>0) {
				this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mes_inicioDepreciaciones.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mes_finDepreciaciones!=null && this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mes_finDepreciaciones.getItemCount()>0) {
				this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mes_finDepreciaciones.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anioDepreciaciones!=null && this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anioDepreciaciones.getItemCount()>0) {
				this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anioDepreciaciones.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mesDepreciaciones!=null && this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mesDepreciaciones.getItemCount()>0) {
				this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mesDepreciaciones.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	














	
	

	public DepreciacionesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DepreciacionesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DepreciacionesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.depreciacionesSessionBean=new DepreciacionesSessionBean(); 
		this.depreciacionesConstantesFunciones=new DepreciacionesConstantesFunciones(); 
		this.depreciacionesBean=new Depreciaciones();//(this.depreciacionesConstantesFunciones); 		
		this.depreciacionesReturnGeneral=new DepreciacionesParameterReturnGeneral(); 
		
		this.depreciacionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.depreciacionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DepreciacionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DepreciacionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DepreciacionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDepreciaciones(true);
			
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
			
			this.depreciacionesConstantesFunciones=new DepreciacionesConstantesFunciones(); 
			this.depreciacionesBean=new Depreciaciones();//this.depreciacionesConstantesFunciones); 			
			this.depreciacionesReturnGeneral=new DepreciacionesParameterReturnGeneral(); 
		
			DepreciacionesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Depreciaciones Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.depreciaciones=new Depreciaciones();
			this.depreciacioness = new ArrayList<Depreciaciones>();
			this.depreciacionessAux = new ArrayList<Depreciaciones>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic=new DepreciacionesLogic();
				this.depreciacionesLogic.getNewConnexionToDeep("");
			}
			
			//this.depreciacionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.depreciacionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDepreciaciones);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDepreciaciones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDepreciaciones);	
					}
					
					if(this.jInternalFrameImportacionDepreciaciones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDepreciaciones);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDepreciaciones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDepreciaciones);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDepreciaciones!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDepreciaciones);
				this.jInternalFrameDetalleFormDepreciaciones.setVisible(false);
				this.jInternalFrameDetalleFormDepreciaciones.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDepreciaciones!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDepreciaciones);
					this.jInternalFrameReporteDinamicoDepreciaciones.setVisible(false);
					this.jInternalFrameReporteDinamicoDepreciaciones.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDepreciaciones!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDepreciaciones);
					this.jInternalFrameImportacionDepreciaciones.setVisible(false);
					this.jInternalFrameImportacionDepreciaciones.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDepreciaciones!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDepreciaciones);
					this.jInternalFrameOrderByDepreciaciones.setVisible(false);
					this.jInternalFrameOrderByDepreciaciones.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDepreciacionesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DepreciacionesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.depreciacionesReturnGeneral=new DepreciacionesParameterReturnGeneral();
			
			this.depreciacionesParameterGeneral=new DepreciacionesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.depreciacionesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.depreciacionesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DepreciacionesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.depreciacionesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DepreciacionesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.depreciacionesSessionBean.getEsGuardarRelacionado(),this.depreciacionesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DepreciacionesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.depreciacionesSessionBean.getEsGuardarRelacionado(),this.depreciacionesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDepreciaciones=false;
			this.isVisibilidadCeldaDuplicarDepreciaciones=true;
			this.isVisibilidadCeldaCopiarDepreciaciones=true;
			this.isVisibilidadCeldaVerFormDepreciaciones=true;
			this.isVisibilidadCeldaOrdenDepreciaciones=true;
			this.isVisibilidadCeldaNuevoRelacionesDepreciaciones=false;
			this.isVisibilidadCeldaModificarDepreciaciones=false;
			this.isVisibilidadCeldaActualizarDepreciaciones=false;
			this.isVisibilidadCeldaEliminarDepreciaciones=false;
			this.isVisibilidadCeldaCancelarDepreciaciones=false;
			this.isVisibilidadCeldaGuardarDepreciaciones=false;
			this.isVisibilidadCeldaGuardarCambiosDepreciaciones=false;
			
			
			this.isVisibilidadBusquedaDepreciaciones=true;
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdAnioFin=true;
			this.isVisibilidadFK_IdAnioInicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdMesFin=true;
			this.isVisibilidadFK_IdMesInicio=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDepreciaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDepreciaciones();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDepreciaciones(false);
			
			this.setPermisosUsuarioDepreciaciones();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.depreciacionesSessionBean.getEsGuardarRelacionado() 
				|| (this.depreciacionesSessionBean.getEsGuardarRelacionado() && this.depreciacionesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDepreciacionesClasesRelacionadas();
			}
			
			if(this.depreciacionesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDepreciacionesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDepreciaciones();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDepreciaciones();
			}
			
			if(!this.isPermisoBusquedaDepreciaciones) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDepreciaciones.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.depreciacionesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DepreciacionesConstantesFunciones.getTiposSeleccionarDepreciaciones());
				
				this.tiposColumnasSelect=DepreciacionesConstantesFunciones.getTiposSeleccionarDepreciaciones(true);
				
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
			//if(!this.depreciacionesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDepreciaciones();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioDepreciaciones(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioDepreciaciones(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDepreciaciones() ;
			
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
			this.anioinicioLogic=new AnioLogic();
			this.aniofinLogic=new AnioLogic();
			this.mesinicioLogic=new MesLogic();
			this.mesfinLogic=new MesLogic();
			this.anioLogic=new AnioLogic();
			this.mesLogic=new MesLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				depreciacionesImplementable= (DepreciacionesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DepreciacionesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				depreciacionesImplementableHome= (DepreciacionesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DepreciacionesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.depreciacioness= new ArrayList<Depreciaciones>();
			this.depreciacionessEliminados= new ArrayList<Depreciaciones>();
						
			this.isEsNuevoDepreciaciones=false;
			this.esParaAccionDesdeFormularioDepreciaciones=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.anioiniciosForeignKey=new ArrayList<Anio>() ;
			this.aniofinsForeignKey=new ArrayList<Anio>() ;
			this.mesiniciosForeignKey=new ArrayList<Mes>() ;
			this.mesfinsForeignKey=new ArrayList<Mes>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDepreciaciones(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDepreciaciones();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.depreciacionesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DepreciacionesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DepreciacionesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDepreciaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDepreciaciones(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDepreciaciones!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDepreciaciones();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDepreciaciones();
			}
			
			DepreciacionesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDepreciaciones.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDepreciaciones.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDepreciaciones.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDepreciaciones(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Depreciaciones: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDepreciaciones() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDepreciaciones")) {
				iIndex=this.jInternalFrameDetalleFormDepreciaciones.jTabbedPaneRelacionesDepreciaciones.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDepreciaciones.jTabbedPaneRelacionesDepreciaciones.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDepreciaciones();	
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
	
	public void cargarCombosForeignKeyDepreciaciones(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDepreciaciones(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDepreciaciones(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDepreciacionesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDepreciaciones();
		
		this.cargarCombosFrameForeignKeyDepreciaciones();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDepreciaciones();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDepreciaciones();
		}
	}
	
	

	public void cargarCombosForeignKeyAnioInicio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAnioInicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAnioInicio();
				this.cargarCombosFrameAnioIniciosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAnioInicio(this.anioiniciosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAnioFin(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAnioFinListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAnioFin();
				this.cargarCombosFrameAnioFinsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAnioFin(this.aniofinsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMesInicio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMesInicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMesInicio();
				this.cargarCombosFrameMesIniciosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaMesInicio(this.mesiniciosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMesFin(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMesFinListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMesFin();
				this.cargarCombosFrameMesFinsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaMesFin(this.mesfinsForeignKey);

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

	public void cargarCombosForeignKeyMes(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaMes(this.messForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoDepreciacionesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.depreciacionesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDepreciaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
			
			
			if(jTableDatosDepreciaciones.getRowCount()>=1) {
				jTableDatosDepreciaciones.removeRowSelectionInterval(0, jTableDatosDepreciaciones.getRowCount()-1);						
			}
			
			this.isEsNuevoDepreciaciones=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDepreciaciones(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDepreciaciones(true);			
			//this.depreciaciones=new Depreciaciones();
			//this.depreciaciones.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDepreciaciones(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDepreciaciones() ;
			
			if(DepreciacionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDepreciaciones(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.depreciaciones);	
			this.actualizarInformacion("INFO_PADRE",false,this.depreciaciones);				
			
			DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
			
			if(this.depreciacionesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Depreciaciones: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDepreciacionesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Depreciaciones> depreciacionessSeleccionados=new ArrayList<Depreciaciones>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDepreciaciones.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDepreciaciones.getSelectedRows().length;			
			}
			
			depreciacionessSeleccionados=this.getDepreciacionessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDepreciaciones--;			
				//Depreciaciones depreciacionesAux= new Depreciaciones();			
				//depreciacionesAux.setId(this.iIdNuevoDepreciaciones);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Depreciaciones depreciacionesOrigen=new Depreciaciones();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Depreciaciones depreciacionesOrigen : depreciacionessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							depreciacionesOrigen =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depreciacionesOrigen =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDepreciaciones();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.depreciaciones.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDepreciaciones(depreciacionesOrigen,this.depreciaciones,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.depreciacionesLogic.getDepreciacioness().add(this.depreciacionesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.depreciacioness.add(this.depreciacionesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDepreciaciones(false);
				
				this.jTableDatosDepreciaciones.setRowSelectionInterval(this.getIndiceNuevoDepreciaciones(), this.getIndiceNuevoDepreciaciones());
				
				int iLastRow =  this.jTableDatosDepreciaciones.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDepreciaciones.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDepreciaciones.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDepreciaciones(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDepreciacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Depreciaciones> depreciacionessSeleccionados=new ArrayList<Depreciaciones>();									
		
			Depreciaciones depreciacionesOrigen=new Depreciaciones();
			Depreciaciones depreciacionesDestino=new Depreciaciones();
				
			depreciacionessSeleccionados=this.getDepreciacionessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDepreciaciones.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || depreciacionessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDepreciaciones.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						depreciacionesOrigen =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						depreciacionesOrigen =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						depreciacionesDestino =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						depreciacionesDestino =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				depreciacionesOrigen =depreciacionessSeleccionados.get(0);
				depreciacionesDestino =depreciacionessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDepreciaciones(depreciacionesOrigen,depreciacionesDestino,true,false);
				
				depreciacionesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(depreciacionesDestino,depreciacionesLogic.getDepreciacioness());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(depreciacionesDestino,depreciacioness);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDepreciaciones(false);
				
				//this.jTableDatosDepreciaciones.setRowSelectionInterval(this.getIndiceNuevoDepreciaciones(), this.getIndiceNuevoDepreciaciones());
				
				int iLastRow =  this.jTableDatosDepreciaciones.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDepreciaciones.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDepreciaciones.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDepreciaciones(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDepreciacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDepreciaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDepreciaciones.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDepreciacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDepreciaciones.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDepreciaciones.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDepreciaciones.setVisible(!isVisible);
			this.jPanelPaginacionDepreciaciones.setVisible(!isVisible);
			this.jPanelAccionesDepreciaciones.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDepreciacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDepreciaciones();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDepreciacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDepreciaciones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDepreciacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDepreciaciones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDepreciacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDepreciaciones();
			
			this.abrirFrameOrderByDepreciaciones();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDepreciacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDepreciaciones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDepreciaciones(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDepreciaciones);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDepreciaciones.isMaximum()) {
					this.jInternalFrameDetalleFormDepreciaciones.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDepreciaciones.setSize(this.jInternalFrameDetalleFormDepreciaciones.iWidthFormulario,this.jInternalFrameDetalleFormDepreciaciones.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDepreciaciones.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDepreciaciones.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDepreciaciones.isMaximum()) {
						this.jInternalFrameDetalleFormDepreciaciones.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDepreciaciones.jContentPaneDetalleDepreciaciones.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDepreciaciones.jTabbedPaneRelacionesDepreciaciones.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDepreciaciones.jContentPaneDetalleDepreciaciones.getWidth(),DepreciacionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDepreciaciones.jTabbedPaneRelacionesDepreciaciones.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDepreciaciones.jContentPaneDetalleDepreciaciones.getWidth(),DepreciacionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDepreciaciones.jTabbedPaneRelacionesDepreciaciones.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDepreciaciones.jContentPaneDetalleDepreciaciones.getWidth(),DepreciacionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDepreciaciones.setVisible(true);
	        this.jInternalFrameDetalleFormDepreciaciones.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDepreciaciones() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDepreciaciones==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDepreciaciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDepreciaciones,false,this);
				} else {
					this.jInternalFrameOrderByDepreciaciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDepreciaciones,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDepreciaciones);
				this.jInternalFrameOrderByDepreciaciones.setVisible(false);
				this.jInternalFrameOrderByDepreciaciones.setSelected(false);
				
				this.jInternalFrameOrderByDepreciaciones.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDepreciaciones"));
				
				this.inicializarActualizarBindingTablaOrderByDepreciaciones();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDepreciaciones() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDepreciaciones==null) {
				
				this.jInternalFrameImportacionDepreciaciones=new ImportacionJInternalFrame(DepreciacionesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDepreciaciones);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDepreciaciones);
				this.jInternalFrameImportacionDepreciaciones.setVisible(false);
				this.jInternalFrameImportacionDepreciaciones.setSelected(false);


				this.jInternalFrameImportacionDepreciaciones.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDepreciaciones"));
				this.jInternalFrameImportacionDepreciaciones.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDepreciaciones"));
				this.jInternalFrameImportacionDepreciaciones.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDepreciaciones"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDepreciaciones() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDepreciaciones==null) {
				this.jInternalFrameReporteDinamicoDepreciaciones=new ReporteDinamicoJInternalFrame(DepreciacionesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDepreciaciones);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDepreciaciones);
				this.jInternalFrameReporteDinamicoDepreciaciones.setVisible(false);
				this.jInternalFrameReporteDinamicoDepreciaciones.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDepreciaciones.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDepreciaciones"));
				this.jInternalFrameReporteDinamicoDepreciaciones.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDepreciaciones"));
				this.jInternalFrameReporteDinamicoDepreciaciones.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDepreciaciones"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDepreciaciones();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDepreciaciones() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDepreciaciones);
			
	       	this.jInternalFrameDetalleFormDepreciaciones.setVisible(false);
	        this.jInternalFrameDetalleFormDepreciaciones.setSelected(false);
			
			//this.jInternalFrameDetalleFormDepreciaciones.dispose();
			//this.jInternalFrameDetalleFormDepreciaciones=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDepreciaciones() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDepreciaciones.setVisible(true);
	        this.jInternalFrameReporteDinamicoDepreciaciones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDepreciaciones() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDepreciaciones.setVisible(true);
	        this.jInternalFrameImportacionDepreciaciones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDepreciaciones() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDepreciaciones.setVisible(true);
	        this.jInternalFrameOrderByDepreciaciones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDepreciaciones() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDepreciaciones.setVisible(false);
	        this.jInternalFrameOrderByDepreciaciones.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDepreciaciones() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDepreciaciones.setVisible(false);
	        this.jInternalFrameReporteDinamicoDepreciaciones.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDepreciaciones() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDepreciaciones.setVisible(false);
	        this.jInternalFrameImportacionDepreciaciones.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDepreciacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDepreciaciones(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDepreciaciones(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDepreciaciones(true);
			//this.isEsNuevoDepreciaciones=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDepreciaciones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDepreciaciones(false) ;
			
			if(depreciacionesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DepreciacionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDepreciaciones(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDepreciaciones(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDepreciacionesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDepreciaciones(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDepreciaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDepreciaciones(true);
			//this.isEsNuevoDepreciaciones=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.depreciaciones.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDepreciaciones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDepreciaciones(false) ;
			
			if(DepreciacionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDepreciaciones(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDepreciaciones(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaAnioInicio(List<Anio> anioiniciosForeignKey)throws Exception{
		TableColumn tableColumnAnioInicio=this.jTableDatosDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciaciones,DepreciacionesConstantesFunciones.LABEL_IDANIOINICIO));
		TableCellEditor tableCellEditorAnioInicio =tableColumnAnioInicio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnioInicio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(anioiniciosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDepreciaciones.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(anioiniciosForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAnioFin(List<Anio> aniofinsForeignKey)throws Exception{
		TableColumn tableColumnAnioFin=this.jTableDatosDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciaciones,DepreciacionesConstantesFunciones.LABEL_IDANIOFIN));
		TableCellEditor tableCellEditorAnioFin =tableColumnAnioFin.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnioFin;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniofinsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDepreciaciones.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(aniofinsForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMesInicio(List<Mes> mesiniciosForeignKey)throws Exception{
		TableColumn tableColumnMesInicio=this.jTableDatosDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciaciones,DepreciacionesConstantesFunciones.LABEL_IDMESINICIO));
		TableCellEditor tableCellEditorMesInicio =tableColumnMesInicio.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMesInicio;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(mesiniciosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDepreciaciones.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(mesiniciosForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMesFin(List<Mes> mesfinsForeignKey)throws Exception{
		TableColumn tableColumnMesFin=this.jTableDatosDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciaciones,DepreciacionesConstantesFunciones.LABEL_IDMESFIN));
		TableCellEditor tableCellEditorMesFin =tableColumnMesFin.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMesFin;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(mesfinsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDepreciaciones.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(mesfinsForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciaciones,DepreciacionesConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDepreciaciones.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(aniosForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMes(List<Mes> messForeignKey)throws Exception{
		TableColumn tableColumnMes=this.jTableDatosDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciaciones,DepreciacionesConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDepreciaciones.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarDepreciacionesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDepreciaciones(false);
			
			//if(!this.isEsNuevoDepreciaciones) {								
				int intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DepreciacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDepreciaciones(this.depreciaciones,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
				
			}
			
			if(this.permiteMantenimiento(this.depreciaciones)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.depreciacionesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDepreciaciones=true;
					this.inicializarActualizarBindingTablaDepreciaciones(false);
					this.isEsNuevoDepreciaciones=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDepreciaciones=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDepreciaciones=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDepreciaciones(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDepreciaciones(false);
				
				this.habilitarDeshabilitarControlesDepreciaciones(false);
			
												
				
				if(DepreciacionesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDepreciaciones();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDepreciacionesActionPerformed(evt,depreciacionesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDepreciaciones(this.depreciaciones,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDepreciaciones.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,depreciacionesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.depreciaciones.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Depreciaciones.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Depreciaciones.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDepreciacionesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				this.depreciaciones.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				this.depreciaciones.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.depreciaciones)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.depreciacionesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DepreciacionesModel) this.jTableDatosDepreciaciones.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDepreciaciones=true;
				this.inicializarActualizarBindingTablaDepreciaciones(false);
				this.isEsNuevoDepreciaciones=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDepreciaciones(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDepreciaciones(false);
				
				this.habilitarDeshabilitarControlesDepreciaciones(false);
				
				
				
				if(DepreciacionesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDepreciaciones();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDepreciacionesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDepreciaciones.getRowCount()>=1) {
				jTableDatosDepreciaciones.removeRowSelectionInterval(0, jTableDatosDepreciaciones.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDepreciaciones(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDepreciaciones(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDepreciaciones(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDepreciaciones(false) ;
			
			this.isEsNuevoDepreciaciones=false;
			
			if(DepreciacionesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDepreciaciones();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDepreciacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDepreciaciones(false);
				
				//SI ES MANUAL
				if(DepreciacionesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDepreciaciones();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDepreciacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDepreciaciones--;			
			//Depreciaciones depreciacionesAux= new Depreciaciones();			
			//depreciacionesAux.setId(this.iIdNuevoDepreciaciones);
			
			if(this.jInternalFrameDetalleFormDepreciaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDepreciaciones();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
			
			this.depreciaciones.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.depreciacionesLogic.getDepreciacioness().add(this.depreciacionesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.depreciacioness.add(this.depreciacionesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDepreciaciones(false);
			
			this.jTableDatosDepreciaciones.setRowSelectionInterval(this.getIndiceNuevoDepreciaciones(), this.getIndiceNuevoDepreciaciones());
			
			int iLastRow =  this.jTableDatosDepreciaciones.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDepreciaciones.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDepreciaciones.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDepreciaciones(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDepreciacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDepreciaciones(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDepreciaciones(false);
			
			//SI ES MANUAL
			if(DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDepreciaciones();
			}
			
			//this.abrirFrameTreeDepreciaciones();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDepreciacionesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDepreciacionesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDepreciaciones.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDepreciaciones.setFileImportacion(this.jInternalFrameImportacionDepreciaciones.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDepreciaciones.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDepreciaciones.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDepreciaciones.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDepreciaciones.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDepreciacionesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Depreciaciones> depreciacionessSeleccionados=new ArrayList<Depreciaciones>();		

		depreciacionessSeleccionados=this.getDepreciacionessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDepreciaciones.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDepreciaciones.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DepreciacionesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DepreciacionesBaseDesign.jrxml";
			
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
			
			this.generarReporteDepreciacioness("Todos",depreciacionessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.depreciacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Depreciaciones",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDepreciaciones.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDepreciaciones.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DepreciacionesConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoSubGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoSubGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoSubGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoSubGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepreciacionesConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreSubGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreSubGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreSubGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreSubGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepreciacionesConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoDetalleGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoDetalleGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoDetalleGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoDetalleGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepreciacionesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreDetalleGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreDetalleGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreDetalleGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreDetalleGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepreciacionesConstantesFunciones.LABEL_CLAVE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ave_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ave_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ave_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ave_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepreciacionesConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepreciacionesConstantesFunciones.LABEL_FECHACOMPRA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaCompra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaCompra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaCompra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaCompra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepreciacionesConstantesFunciones.LABEL_VIDAUTIL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_daUtil_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_daUtil_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_daUtil_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_daUtil_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepreciacionesConstantesFunciones.LABEL_COSTODECOMPRA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoDeCompra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoDeCompra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoDeCompra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoDeCompra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepreciacionesConstantesFunciones.LABEL_FECHAMANTENIMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaMantenimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaMantenimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaMantenimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaMantenimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepreciacionesConstantesFunciones.LABEL_FECHADEPRECIACION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaDepreciacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaDepreciacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaDepreciacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaDepreciacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepreciacionesConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepreciacionesConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepreciacionesConstantesFunciones.LABEL_VALORACUMULADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorAcumulado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorAcumulado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorAcumulado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorAcumulado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepreciacionesConstantesFunciones.LABEL_VALORGASTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorGasto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorGasto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorGasto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorGasto_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDepreciaciones.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDepreciaciones.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDepreciaciones.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DepreciacionesConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					sNombreCampoCategoria="codigo_sub_grupo";
					break;

				case DepreciacionesConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					sNombreCampoCategoria="nombre_sub_grupo";
					break;

				case DepreciacionesConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					sNombreCampoCategoria="codigo_detalle_grupo";
					break;

				case DepreciacionesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					sNombreCampoCategoria="nombre_detalle_grupo";
					break;

				case DepreciacionesConstantesFunciones.LABEL_CLAVE:
					sNombreCampoCategoria="clave";
					break;

				case DepreciacionesConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case DepreciacionesConstantesFunciones.LABEL_FECHACOMPRA:
					sNombreCampoCategoria="fecha_compra";
					break;

				case DepreciacionesConstantesFunciones.LABEL_VIDAUTIL:
					sNombreCampoCategoria="vida_util";
					break;

				case DepreciacionesConstantesFunciones.LABEL_COSTODECOMPRA:
					sNombreCampoCategoria="costo_de_compra";
					break;

				case DepreciacionesConstantesFunciones.LABEL_FECHAMANTENIMIENTO:
					sNombreCampoCategoria="fecha_mantenimiento";
					break;

				case DepreciacionesConstantesFunciones.LABEL_FECHADEPRECIACION:
					sNombreCampoCategoria="fecha_depreciacion";
					break;

				case DepreciacionesConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case DepreciacionesConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;

				case DepreciacionesConstantesFunciones.LABEL_VALORACUMULADO:
					sNombreCampoCategoria="valor_acumulado";
					break;

				case DepreciacionesConstantesFunciones.LABEL_VALORGASTO:
					sNombreCampoCategoria="valor_gasto";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDepreciaciones.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DepreciacionesConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					sNombreCampoCategoriaValor="codigo_sub_grupo";
					break;

				case DepreciacionesConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					sNombreCampoCategoriaValor="nombre_sub_grupo";
					break;

				case DepreciacionesConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					sNombreCampoCategoriaValor="codigo_detalle_grupo";
					break;

				case DepreciacionesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					sNombreCampoCategoriaValor="nombre_detalle_grupo";
					break;

				case DepreciacionesConstantesFunciones.LABEL_CLAVE:
					sNombreCampoCategoriaValor="clave";
					break;

				case DepreciacionesConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case DepreciacionesConstantesFunciones.LABEL_FECHACOMPRA:
					sNombreCampoCategoriaValor="fecha_compra";
					break;

				case DepreciacionesConstantesFunciones.LABEL_VIDAUTIL:
					sNombreCampoCategoriaValor="vida_util";
					break;

				case DepreciacionesConstantesFunciones.LABEL_COSTODECOMPRA:
					sNombreCampoCategoriaValor="costo_de_compra";
					break;

				case DepreciacionesConstantesFunciones.LABEL_FECHAMANTENIMIENTO:
					sNombreCampoCategoriaValor="fecha_mantenimiento";
					break;

				case DepreciacionesConstantesFunciones.LABEL_FECHADEPRECIACION:
					sNombreCampoCategoriaValor="fecha_depreciacion";
					break;

				case DepreciacionesConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case DepreciacionesConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;

				case DepreciacionesConstantesFunciones.LABEL_VALORACUMULADO:
					sNombreCampoCategoriaValor="valor_acumulado";
					break;

				case DepreciacionesConstantesFunciones.LABEL_VALORGASTO:
					sNombreCampoCategoriaValor="valor_gasto";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDepreciaciones.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDepreciaciones.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DepreciacionesConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Sub Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_sub_grupo");
					break;

				case DepreciacionesConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Sub Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_sub_grupo");
					break;

				case DepreciacionesConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Detalle Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_detalle_grupo");
					break;

				case DepreciacionesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Detalle Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_detalle_grupo");
					break;

				case DepreciacionesConstantesFunciones.LABEL_CLAVE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Clave",sNombreCampoCategoria,sNombreCampoCategoriaValor,"clave");
					break;

				case DepreciacionesConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case DepreciacionesConstantesFunciones.LABEL_FECHACOMPRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Compra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_compra");
					break;

				case DepreciacionesConstantesFunciones.LABEL_VIDAUTIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Va Util",sNombreCampoCategoria,sNombreCampoCategoriaValor,"vida_util");
					break;

				case DepreciacionesConstantesFunciones.LABEL_COSTODECOMPRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Compra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_de_compra");
					break;

				case DepreciacionesConstantesFunciones.LABEL_FECHAMANTENIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Mantenimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_mantenimiento");
					break;

				case DepreciacionesConstantesFunciones.LABEL_FECHADEPRECIACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Depreciacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_depreciacion");
					break;

				case DepreciacionesConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case DepreciacionesConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
					break;

				case DepreciacionesConstantesFunciones.LABEL_VALORACUMULADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Acumulado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_acumulado");
					break;

				case DepreciacionesConstantesFunciones.LABEL_VALORGASTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Gasto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_gasto");
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
	
	public void jButtonGenerarExcelReporteDinamicoDepreciacionesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Depreciaciones> depreciacionessSeleccionados=new ArrayList<Depreciaciones>();		
		
		depreciacionessSeleccionados=this.getDepreciacionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"depreciaciones";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Depreciacioness");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDepreciaciones.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDepreciaciones.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DepreciacionesConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Depreciaciones depreciaciones:depreciacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciaciones.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionesConstantesFunciones.LABEL_IDANIOINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_IDANIOINICIO);
					iRow++;

					for(Depreciaciones depreciaciones:depreciacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciaciones.getanioinicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionesConstantesFunciones.LABEL_IDANIOFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_IDANIOFIN);
					iRow++;

					for(Depreciaciones depreciaciones:depreciacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciaciones.getaniofin_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionesConstantesFunciones.LABEL_IDMESINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_IDMESINICIO);
					iRow++;

					for(Depreciaciones depreciaciones:depreciacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciaciones.getmesinicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionesConstantesFunciones.LABEL_IDMESFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_IDMESFIN);
					iRow++;

					for(Depreciaciones depreciaciones:depreciacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciaciones.getmesfin_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionesConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_CODIGOSUBGRUPO);
					iRow++;

					for(Depreciaciones depreciaciones:depreciacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciaciones.getcodigo_sub_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionesConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_NOMBRESUBGRUPO);
					iRow++;

					for(Depreciaciones depreciaciones:depreciacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciaciones.getnombre_sub_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionesConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
					iRow++;

					for(Depreciaciones depreciaciones:depreciacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciaciones.getcodigo_detalle_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
					iRow++;

					for(Depreciaciones depreciaciones:depreciacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciaciones.getnombre_detalle_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionesConstantesFunciones.LABEL_CLAVE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_CLAVE);
					iRow++;

					for(Depreciaciones depreciaciones:depreciacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciaciones.getclave());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionesConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Depreciaciones depreciaciones:depreciacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciaciones.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionesConstantesFunciones.LABEL_FECHACOMPRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_FECHACOMPRA);
					iRow++;

					for(Depreciaciones depreciaciones:depreciacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciaciones.getfecha_compra());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionesConstantesFunciones.LABEL_VIDAUTIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_VIDAUTIL);
					iRow++;

					for(Depreciaciones depreciaciones:depreciacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciaciones.getvida_util());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionesConstantesFunciones.LABEL_COSTODECOMPRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_COSTODECOMPRA);
					iRow++;

					for(Depreciaciones depreciaciones:depreciacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciaciones.getcosto_de_compra());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionesConstantesFunciones.LABEL_FECHAMANTENIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_FECHAMANTENIMIENTO);
					iRow++;

					for(Depreciaciones depreciaciones:depreciacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciaciones.getfecha_mantenimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionesConstantesFunciones.LABEL_FECHADEPRECIACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_FECHADEPRECIACION);
					iRow++;

					for(Depreciaciones depreciaciones:depreciacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciaciones.getfecha_depreciacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionesConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(Depreciaciones depreciaciones:depreciacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciaciones.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionesConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(Depreciaciones depreciaciones:depreciacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciaciones.getmes_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionesConstantesFunciones.LABEL_VALORACUMULADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_VALORACUMULADO);
					iRow++;

					for(Depreciaciones depreciaciones:depreciacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciaciones.getvalor_acumulado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionesConstantesFunciones.LABEL_VALORGASTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_VALORGASTO);
					iRow++;

					for(Depreciaciones depreciaciones:depreciacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciaciones.getvalor_gasto());
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
			//	this.getFilaCabeceraExportarExcelDepreciaciones(row);				
			//	iRow++;
			//}				
			
			//for(Depreciaciones depreciacionesAux:depreciacionessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDepreciaciones(depreciacionesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.depreciacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Depreciaciones",JOptionPane.INFORMATION_MESSAGE);
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
				this.depreciacionesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDepreciaciones(false);
			
			//SI ES MANUAL
			if(DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDepreciaciones();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDepreciacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDepreciaciones(false);
			
			//SI ES MANUAL
			if(DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDepreciaciones();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDepreciacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDepreciaciones(false);
			
			//SI ES MANUAL
			if(DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDepreciaciones();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDepreciaciones() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDepreciaciones.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDepreciaciones.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDepreciaciones.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDepreciaciones.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDepreciaciones.setMinimumSize(dimensionMinimum);
		this.jTableDatosDepreciaciones.setMaximumSize(dimensionMaximum);
		this.jTableDatosDepreciaciones.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDepreciaciones(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDepreciaciones(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDepreciaciones(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDepreciaciones(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDepreciaciones(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.depreciacionesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDepreciaciones(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDepreciaciones(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDepreciaciones(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DepreciacionesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDepreciaciones() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDepreciaciones();
		
		this.inicializarActualizarBindingBotonesManualDepreciaciones(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.depreciacionesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDepreciaciones();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDepreciaciones() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDepreciaciones(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDepreciaciones(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDepreciaciones.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDepreciaciones.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDepreciaciones.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDepreciaciones.jCheckBoxPostAccionNuevoDepreciaciones.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDepreciaciones.jCheckBoxPostAccionSinCerrarDepreciaciones.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDepreciaciones.jCheckBoxPostAccionSinMensajeDepreciaciones.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDepreciaciones.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDepreciaciones.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDepreciaciones.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
				this.jInternalFrameDetalleFormDepreciaciones.jCheckBoxPostAccionNuevoDepreciaciones.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDepreciaciones.jCheckBoxPostAccionSinCerrarDepreciaciones.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDepreciaciones.jCheckBoxPostAccionSinMensajeDepreciaciones.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDepreciaciones.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDepreciaciones.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDepreciaciones.jComboBoxTiposAccionesFormularioDepreciaciones.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDepreciaciones.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDepreciaciones!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDepreciaciones.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDepreciaciones.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDepreciaciones.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDepreciaciones.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDepreciaciones.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDepreciaciones!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDepreciaciones.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDepreciaciones.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDepreciaciones.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDepreciaciones(Boolean esInicializar) throws Exception {
		try	{	
			if(DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDepreciaciones(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDepreciaciones() throws Exception {
		try	{
			if(DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDepreciaciones();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDepreciaciones() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDepreciaciones.jComboBoxTiposAccionesFormularioDepreciaciones.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDepreciaciones.jComboBoxTiposAccionesFormularioDepreciaciones.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDepreciaciones() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDepreciaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDepreciaciones.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDepreciaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDepreciaciones.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDepreciaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDepreciaciones.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDepreciaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDepreciaciones.addItem(reporte);
			}
			
			
			if(!this.depreciacionesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDepreciaciones.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDepreciaciones.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDepreciaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDepreciaciones.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDepreciaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDepreciaciones.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDepreciaciones.jComboBoxTiposAccionesFormularioDepreciaciones.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDepreciaciones.jComboBoxTiposAccionesFormularioDepreciaciones.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDepreciaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDepreciaciones.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDepreciaciones.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDepreciaciones();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDepreciaciones() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDepreciaciones!=null) {
				this.jInternalFrameReporteDinamicoDepreciaciones.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDepreciaciones.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDepreciaciones!=null) {
				this.jInternalFrameReporteDinamicoDepreciaciones.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDepreciaciones.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDepreciaciones!=null) {
				
				if(this.jInternalFrameReporteDinamicoDepreciaciones.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDepreciaciones.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDepreciaciones.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDepreciaciones.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDepreciaciones.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDepreciaciones.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoDepreciaciones.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDepreciaciones.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=DepreciacionesConstantesFunciones.getTiposSeleccionarDepreciaciones(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDepreciaciones.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoDepreciaciones.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoDepreciaciones.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=DepreciacionesConstantesFunciones.getTiposSeleccionarDepreciaciones(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDepreciaciones.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoDepreciaciones.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDepreciaciones.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=DepreciacionesConstantesFunciones.getTiposSeleccionarDepreciaciones(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDepreciaciones.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoDepreciaciones.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoDepreciaciones.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoDepreciaciones.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDepreciaciones()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_anio_inicioBusquedaDepreciacionesDepreciaciones.getSelectedItem()!=null){this.id_anio_inicioBusquedaDepreciaciones=((Anio)this.jComboBoxid_anio_inicioBusquedaDepreciacionesDepreciaciones.getSelectedItem()).getId();}
		if(this.jComboBoxid_anio_finBusquedaDepreciacionesDepreciaciones.getSelectedItem()!=null){this.id_anio_finBusquedaDepreciaciones=((Anio)this.jComboBoxid_anio_finBusquedaDepreciacionesDepreciaciones.getSelectedItem()).getId();}
		if(this.jComboBoxid_mes_inicioBusquedaDepreciacionesDepreciaciones.getSelectedItem()!=null){this.id_mes_inicioBusquedaDepreciaciones=((Mes)this.jComboBoxid_mes_inicioBusquedaDepreciacionesDepreciaciones.getSelectedItem()).getId();}
		if(this.jComboBoxid_mes_finBusquedaDepreciacionesDepreciaciones.getSelectedItem()!=null){this.id_mes_finBusquedaDepreciaciones=((Mes)this.jComboBoxid_mes_finBusquedaDepreciacionesDepreciaciones.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDepreciaciones(Boolean esInicializar) throws Exception {				
		if(DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDepreciaciones();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDepreciaciones() throws Exception {
		this.inicializarActualizarBindingTablaDepreciaciones(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDepreciaciones() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDepreciaciones.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDepreciaciones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDepreciaciones.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DepreciacionesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDepreciaciones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDepreciaciones.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DepreciacionesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDepreciacionesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciacionesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DepreciacionesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDepreciaciones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDepreciaciones.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DepreciacionesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDepreciaciones.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDepreciaciones(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=depreciacionesLogic.getDepreciacioness().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=depreciacioness.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DepreciacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDepreciaciones.setModel(new DepreciacionesModel(this.depreciacionesLogic.getDepreciacioness(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDepreciaciones.setModel(new DepreciacionesModel(this.depreciacioness,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDepreciaciones!=null && this.jInternalFrameOrderByDepreciaciones.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDepreciaciones();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciaciones,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DepreciacionesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO,depreciacionesConstantesFunciones.resaltarSeleccionarDepreciaciones,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DepreciacionesConstantesFunciones.SCLASSWEBTITULO,depreciacionesConstantesFunciones.resaltarSeleccionarDepreciaciones,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciaciones,DepreciacionesConstantesFunciones.LABEL_ID));

		if(this.depreciacionesConstantesFunciones.mostraridDepreciaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionesConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.depreciacionesConstantesFunciones.resaltaridDepreciaciones,this.depreciacionesConstantesFunciones.activaridDepreciaciones,iSizeTabla,this,true,"idDepreciaciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.depreciacionesConstantesFunciones.resaltaridDepreciaciones,this.depreciacionesConstantesFunciones.activaridDepreciaciones,this,true,"idDepreciaciones","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciaciones,DepreciacionesConstantesFunciones.LABEL_CODIGOSUBGRUPO));

		if(this.depreciacionesConstantesFunciones.mostrarcodigo_sub_grupoDepreciaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionesConstantesFunciones.LABEL_CODIGOSUBGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.depreciacionesConstantesFunciones.resaltarcodigo_sub_grupoDepreciaciones,this.depreciacionesConstantesFunciones.activarcodigo_sub_grupoDepreciaciones,iSizeTabla,this,true,"codigo_sub_grupoDepreciaciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.depreciacionesConstantesFunciones.resaltarcodigo_sub_grupoDepreciaciones,this.depreciacionesConstantesFunciones.activarcodigo_sub_grupoDepreciaciones,this,true,"codigo_sub_grupoDepreciaciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DepreciacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciaciones,DepreciacionesConstantesFunciones.LABEL_NOMBRESUBGRUPO));

		if(this.depreciacionesConstantesFunciones.mostrarnombre_sub_grupoDepreciaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionesConstantesFunciones.LABEL_NOMBRESUBGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.depreciacionesConstantesFunciones.resaltarnombre_sub_grupoDepreciaciones,this.depreciacionesConstantesFunciones.activarnombre_sub_grupoDepreciaciones,iSizeTabla,this,true,"nombre_sub_grupoDepreciaciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.depreciacionesConstantesFunciones.resaltarnombre_sub_grupoDepreciaciones,this.depreciacionesConstantesFunciones.activarnombre_sub_grupoDepreciaciones,this,true,"nombre_sub_grupoDepreciaciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DepreciacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciaciones,DepreciacionesConstantesFunciones.LABEL_CODIGODETALLEGRUPO));

		if(this.depreciacionesConstantesFunciones.mostrarcodigo_detalle_grupoDepreciaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionesConstantesFunciones.LABEL_CODIGODETALLEGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.depreciacionesConstantesFunciones.resaltarcodigo_detalle_grupoDepreciaciones,this.depreciacionesConstantesFunciones.activarcodigo_detalle_grupoDepreciaciones,iSizeTabla,this,true,"codigo_detalle_grupoDepreciaciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.depreciacionesConstantesFunciones.resaltarcodigo_detalle_grupoDepreciaciones,this.depreciacionesConstantesFunciones.activarcodigo_detalle_grupoDepreciaciones,this,true,"codigo_detalle_grupoDepreciaciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DepreciacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciaciones,DepreciacionesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO));

		if(this.depreciacionesConstantesFunciones.mostrarnombre_detalle_grupoDepreciaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.depreciacionesConstantesFunciones.resaltarnombre_detalle_grupoDepreciaciones,this.depreciacionesConstantesFunciones.activarnombre_detalle_grupoDepreciaciones,iSizeTabla,this,true,"nombre_detalle_grupoDepreciaciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.depreciacionesConstantesFunciones.resaltarnombre_detalle_grupoDepreciaciones,this.depreciacionesConstantesFunciones.activarnombre_detalle_grupoDepreciaciones,this,true,"nombre_detalle_grupoDepreciaciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DepreciacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciaciones,DepreciacionesConstantesFunciones.LABEL_CLAVE));

		if(this.depreciacionesConstantesFunciones.mostrarclaveDepreciaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionesConstantesFunciones.LABEL_CLAVE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.depreciacionesConstantesFunciones.resaltarclaveDepreciaciones,this.depreciacionesConstantesFunciones.activarclaveDepreciaciones,iSizeTabla,this,true,"claveDepreciaciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.depreciacionesConstantesFunciones.resaltarclaveDepreciaciones,this.depreciacionesConstantesFunciones.activarclaveDepreciaciones,this,true,"claveDepreciaciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DepreciacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciaciones,DepreciacionesConstantesFunciones.LABEL_NOMBRE));

		if(this.depreciacionesConstantesFunciones.mostrarnombreDepreciaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionesConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.depreciacionesConstantesFunciones.resaltarnombreDepreciaciones,this.depreciacionesConstantesFunciones.activarnombreDepreciaciones,iSizeTabla,this,true,"nombreDepreciaciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.depreciacionesConstantesFunciones.resaltarnombreDepreciaciones,this.depreciacionesConstantesFunciones.activarnombreDepreciaciones,this,true,"nombreDepreciaciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DepreciacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciaciones,DepreciacionesConstantesFunciones.LABEL_FECHACOMPRA));

		if(this.depreciacionesConstantesFunciones.mostrarfecha_compraDepreciaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionesConstantesFunciones.LABEL_FECHACOMPRA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.depreciacionesConstantesFunciones.resaltarfecha_compraDepreciaciones,this.depreciacionesConstantesFunciones.activarfecha_compraDepreciaciones,iSizeTabla,this,true,"fecha_compraDepreciaciones","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.depreciacionesConstantesFunciones.resaltarfecha_compraDepreciaciones,this.depreciacionesConstantesFunciones.activarfecha_compraDepreciaciones,this,true,"fecha_compraDepreciaciones","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new DepreciacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciaciones,DepreciacionesConstantesFunciones.LABEL_VIDAUTIL));

		if(this.depreciacionesConstantesFunciones.mostrarvida_utilDepreciaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionesConstantesFunciones.LABEL_VIDAUTIL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.depreciacionesConstantesFunciones.resaltarvida_utilDepreciaciones,this.depreciacionesConstantesFunciones.activarvida_utilDepreciaciones,iSizeTabla,this,true,"vida_utilDepreciaciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.depreciacionesConstantesFunciones.resaltarvida_utilDepreciaciones,this.depreciacionesConstantesFunciones.activarvida_utilDepreciaciones,this,true,"vida_utilDepreciaciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DepreciacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciaciones,DepreciacionesConstantesFunciones.LABEL_COSTODECOMPRA));

		if(this.depreciacionesConstantesFunciones.mostrarcosto_de_compraDepreciaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionesConstantesFunciones.LABEL_COSTODECOMPRA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.depreciacionesConstantesFunciones.resaltarcosto_de_compraDepreciaciones,this.depreciacionesConstantesFunciones.activarcosto_de_compraDepreciaciones,iSizeTabla,this,true,"costo_de_compraDepreciaciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.depreciacionesConstantesFunciones.resaltarcosto_de_compraDepreciaciones,this.depreciacionesConstantesFunciones.activarcosto_de_compraDepreciaciones,this,true,"costo_de_compraDepreciaciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DepreciacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciaciones,DepreciacionesConstantesFunciones.LABEL_FECHAMANTENIMIENTO));

		if(this.depreciacionesConstantesFunciones.mostrarfecha_mantenimientoDepreciaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionesConstantesFunciones.LABEL_FECHAMANTENIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.depreciacionesConstantesFunciones.resaltarfecha_mantenimientoDepreciaciones,this.depreciacionesConstantesFunciones.activarfecha_mantenimientoDepreciaciones,iSizeTabla,this,true,"fecha_mantenimientoDepreciaciones","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.depreciacionesConstantesFunciones.resaltarfecha_mantenimientoDepreciaciones,this.depreciacionesConstantesFunciones.activarfecha_mantenimientoDepreciaciones,this,true,"fecha_mantenimientoDepreciaciones","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new DepreciacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciaciones,DepreciacionesConstantesFunciones.LABEL_FECHADEPRECIACION));

		if(this.depreciacionesConstantesFunciones.mostrarfecha_depreciacionDepreciaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionesConstantesFunciones.LABEL_FECHADEPRECIACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.depreciacionesConstantesFunciones.resaltarfecha_depreciacionDepreciaciones,this.depreciacionesConstantesFunciones.activarfecha_depreciacionDepreciaciones,iSizeTabla,this,true,"fecha_depreciacionDepreciaciones","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.depreciacionesConstantesFunciones.resaltarfecha_depreciacionDepreciaciones,this.depreciacionesConstantesFunciones.activarfecha_depreciacionDepreciaciones,this,true,"fecha_depreciacionDepreciaciones","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new DepreciacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciaciones,DepreciacionesConstantesFunciones.LABEL_IDANIO));

		if(this.depreciacionesConstantesFunciones.mostrarid_anioDepreciaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionesConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.depreciacionesConstantesFunciones.resaltarid_anioDepreciaciones,this,this.depreciacionesConstantesFunciones.activarid_anioDepreciaciones,iSizeTabla));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.depreciacionesConstantesFunciones.resaltarid_anioDepreciaciones,this,this.depreciacionesConstantesFunciones.activarid_anioDepreciaciones,true,"id_anioDepreciaciones","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DepreciacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciaciones,DepreciacionesConstantesFunciones.LABEL_IDMES));

		if(this.depreciacionesConstantesFunciones.mostrarid_mesDepreciaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionesConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.depreciacionesConstantesFunciones.resaltarid_mesDepreciaciones,this,this.depreciacionesConstantesFunciones.activarid_mesDepreciaciones,iSizeTabla));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.depreciacionesConstantesFunciones.resaltarid_mesDepreciaciones,this,this.depreciacionesConstantesFunciones.activarid_mesDepreciaciones,true,"id_mesDepreciaciones","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DepreciacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciaciones,DepreciacionesConstantesFunciones.LABEL_VALORACUMULADO));

		if(this.depreciacionesConstantesFunciones.mostrarvalor_acumuladoDepreciaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionesConstantesFunciones.LABEL_VALORACUMULADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.depreciacionesConstantesFunciones.resaltarvalor_acumuladoDepreciaciones,this.depreciacionesConstantesFunciones.activarvalor_acumuladoDepreciaciones,iSizeTabla,this,true,"valor_acumuladoDepreciaciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.depreciacionesConstantesFunciones.resaltarvalor_acumuladoDepreciaciones,this.depreciacionesConstantesFunciones.activarvalor_acumuladoDepreciaciones,this,true,"valor_acumuladoDepreciaciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DepreciacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciaciones,DepreciacionesConstantesFunciones.LABEL_VALORGASTO));

		if(this.depreciacionesConstantesFunciones.mostrarvalor_gastoDepreciaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionesConstantesFunciones.LABEL_VALORGASTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.depreciacionesConstantesFunciones.resaltarvalor_gastoDepreciaciones,this.depreciacionesConstantesFunciones.activarvalor_gastoDepreciaciones,iSizeTabla,this,true,"valor_gastoDepreciaciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.depreciacionesConstantesFunciones.resaltarvalor_gastoDepreciaciones,this.depreciacionesConstantesFunciones.activarvalor_gastoDepreciaciones,this,true,"valor_gastoDepreciaciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DepreciacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.depreciacionesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.depreciacionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.depreciacionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDepreciaciones.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.depreciacionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.depreciacionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDepreciaciones.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDepreciaciones && this.isPermisoGuardarCambiosDepreciaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.depreciacionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.depreciacionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDepreciaciones.addColumn(tableColumn);
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
			
			this.jTableDatosDepreciaciones.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDepreciaciones && this.isPermisoGuardarCambiosDepreciaciones) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDepreciaciones && this.isPermisoGuardarCambiosDepreciaciones) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDepreciaciones.moveColumn(this.jTableDatosDepreciaciones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDepreciaciones.moveColumn(this.jTableDatosDepreciaciones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDepreciaciones.moveColumn(this.jTableDatosDepreciaciones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDepreciaciones.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDepreciaciones.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDepreciaciones,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DepreciacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDepreciaciones.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDepreciaciones.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DepreciacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DepreciacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDepreciaciones.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDepreciaciones.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDepreciaciones.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=depreciacionesLogic.getDepreciacioness().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=depreciacioness.size()-1;
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
		//this.jTableDatosDepreciaciones.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDepreciaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDepreciaciones();
			
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
				
				//this.isEsNuevoDepreciaciones=false;
					
				DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
			
				if(this.depreciacionesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDepreciaciones==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDepreciaciones.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDepreciaciones.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.depreciaciones.getsType().equals("DUPLICADO")
				   || this.depreciaciones.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDepreciaciones=true;
				
				} else {
					this.isEsNuevoDepreciaciones=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.depreciacionesSessionBean.getEsGuardarRelacionado()) {
					if(this.depreciaciones.getId()>=0 && !this.depreciaciones.getIsNew()) {						
						this.isEsNuevoDepreciaciones=false;
						
					} else {
						this.isEsNuevoDepreciaciones=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDepreciaciones(esRelaciones);						
				
				this.seleccionarDepreciaciones(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.depreciaciones.getId()<0) {
					this.isEsNuevoDepreciaciones=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDepreciaciones(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDepreciaciones(evt,rowIndex);
				}	
				
				if(this.depreciacionesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Depreciaciones: " + this.dDif); 
					}
				}								
				
				DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDepreciaciones(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.depreciaciones)) {
					if(this.depreciaciones.getId()>0) {
						this.depreciaciones.setIsDeleted(true);
						
						this.depreciacionessEliminados.add(this.depreciaciones);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.depreciacionesLogic.getDepreciacioness().remove(this.depreciaciones);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.depreciacioness.remove(this.depreciaciones);				
					}
					
					
					((DepreciacionesModel) this.jTableDatosDepreciaciones.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDepreciaciones(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDepreciaciones(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDepreciaciones) {
			
			if(this.jInternalFrameDetalleFormDepreciaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDepreciaciones.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDepreciaciones.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DepreciacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDepreciaciones(this.depreciaciones);
				}
				
				//ARCHITECTURE
				try {
					

					//Anio
					if(!this.depreciacionesConstantesFunciones.cargarid_anioDepreciaciones || this.depreciacionesConstantesFunciones.event_dependid_anioDepreciaciones) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.depreciaciones.getid_anio());
									//this.inicializarActualizarBindingDepreciaciones(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(depreciaciones.getAnio()!=null) {
							this.aniosForeignKey.add(depreciaciones.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.depreciaciones.getid_anio(),false,"Formulario");

					//Mes
					if(!this.depreciacionesConstantesFunciones.cargarid_mesDepreciaciones || this.depreciacionesConstantesFunciones.event_dependid_mesDepreciaciones) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.depreciaciones.getid_mes());
									//this.inicializarActualizarBindingDepreciaciones(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(depreciaciones.getMes()!=null) {
							this.messForeignKey.add(depreciaciones.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.depreciaciones.getid_mes(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDepreciaciones("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDepreciaciones(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDepreciaciones() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDepreciaciones(Depreciaciones depreciaciones) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDepreciaciones(depreciaciones,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDepreciaciones(Depreciaciones depreciaciones,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDepreciaciones(depreciaciones);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDepreciaciones(depreciaciones,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDepreciaciones(depreciaciones);
	}
	
	public void setVariablesObjetoActualToFormularioDepreciaciones(Depreciaciones depreciaciones) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDepreciaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDepreciaciones.jLabelidDepreciaciones.setText(depreciaciones.getId().toString());
			this.jInternalFrameDetalleFormDepreciaciones.jTextFieldcodigo_sub_grupoDepreciaciones.setText(depreciaciones.getcodigo_sub_grupo());
			this.jInternalFrameDetalleFormDepreciaciones.jTextAreanombre_sub_grupoDepreciaciones.setText(depreciaciones.getnombre_sub_grupo());
			this.jInternalFrameDetalleFormDepreciaciones.jTextFieldcodigo_detalle_grupoDepreciaciones.setText(depreciaciones.getcodigo_detalle_grupo());
			this.jInternalFrameDetalleFormDepreciaciones.jTextAreanombre_detalle_grupoDepreciaciones.setText(depreciaciones.getnombre_detalle_grupo());
			this.jInternalFrameDetalleFormDepreciaciones.jTextFieldclaveDepreciaciones.setText(depreciaciones.getclave());
			this.jInternalFrameDetalleFormDepreciaciones.jTextAreanombreDepreciaciones.setText(depreciaciones.getnombre());
			this.jInternalFrameDetalleFormDepreciaciones.jDateChooserfecha_compraDepreciaciones.setDate(depreciaciones.getfecha_compra());
			this.jInternalFrameDetalleFormDepreciaciones.jTextFieldvida_utilDepreciaciones.setText(depreciaciones.getvida_util().toString());
			this.jInternalFrameDetalleFormDepreciaciones.jTextFieldcosto_de_compraDepreciaciones.setText(depreciaciones.getcosto_de_compra().toString());
			this.jInternalFrameDetalleFormDepreciaciones.jDateChooserfecha_mantenimientoDepreciaciones.setDate(depreciaciones.getfecha_mantenimiento());
			this.jInternalFrameDetalleFormDepreciaciones.jDateChooserfecha_depreciacionDepreciaciones.setDate(depreciaciones.getfecha_depreciacion());
			this.jInternalFrameDetalleFormDepreciaciones.jTextFieldvalor_acumuladoDepreciaciones.setText(depreciaciones.getvalor_acumulado().toString());
			this.jInternalFrameDetalleFormDepreciaciones.jTextFieldvalor_gastoDepreciaciones.setText(depreciaciones.getvalor_gasto().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Depreciaciones depreciacionesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,depreciacionesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Depreciaciones depreciacionesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				depreciacionesLocal=this.depreciaciones;
			} else {
				depreciacionesLocal=this.depreciacionesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(depreciacionesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDepreciaciones(depreciacionesLocal,true);
					
					if(depreciacionesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(depreciacionesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.depreciacionesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(depreciacionesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDepreciaciones(Depreciaciones depreciaciones,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDepreciaciones(depreciaciones,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(depreciaciones);
	}
	
	public void setVariablesFormularioToObjetoActualDepreciaciones(Depreciaciones depreciaciones,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDepreciaciones(depreciaciones,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDepreciaciones(Depreciaciones depreciaciones,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDepreciaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDepreciaciones.jLabelidDepreciaciones.getText()==null || this.jInternalFrameDetalleFormDepreciaciones.jLabelidDepreciaciones.getText()=="" || this.jInternalFrameDetalleFormDepreciaciones.jLabelidDepreciaciones.getText()=="Id") {
				this.jInternalFrameDetalleFormDepreciaciones.jLabelidDepreciaciones.setText("0");
			}

			if(conColumnasBase) {depreciaciones.setId(Long.parseLong(this.jInternalFrameDetalleFormDepreciaciones.jLabelidDepreciaciones.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DepreciacionesConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciaciones.jLabelIdDepreciaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			depreciaciones.setcodigo_sub_grupo(this.jInternalFrameDetalleFormDepreciaciones.jTextFieldcodigo_sub_grupoDepreciaciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DepreciacionesConstantesFunciones.LABEL_CODIGOSUBGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciaciones.jLabelcodigo_sub_grupoDepreciaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			depreciaciones.setnombre_sub_grupo(this.jInternalFrameDetalleFormDepreciaciones.jTextAreanombre_sub_grupoDepreciaciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DepreciacionesConstantesFunciones.LABEL_NOMBRESUBGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciaciones.jLabelnombre_sub_grupoDepreciaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			depreciaciones.setcodigo_detalle_grupo(this.jInternalFrameDetalleFormDepreciaciones.jTextFieldcodigo_detalle_grupoDepreciaciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DepreciacionesConstantesFunciones.LABEL_CODIGODETALLEGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciaciones.jLabelcodigo_detalle_grupoDepreciaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			depreciaciones.setnombre_detalle_grupo(this.jInternalFrameDetalleFormDepreciaciones.jTextAreanombre_detalle_grupoDepreciaciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DepreciacionesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciaciones.jLabelnombre_detalle_grupoDepreciaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			depreciaciones.setclave(this.jInternalFrameDetalleFormDepreciaciones.jTextFieldclaveDepreciaciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DepreciacionesConstantesFunciones.LABEL_CLAVE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciaciones.jLabelclaveDepreciaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			depreciaciones.setnombre(this.jInternalFrameDetalleFormDepreciaciones.jTextAreanombreDepreciaciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DepreciacionesConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciaciones.jLabelnombreDepreciaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			depreciaciones.setfecha_compra(this.jInternalFrameDetalleFormDepreciaciones.jDateChooserfecha_compraDepreciaciones.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DepreciacionesConstantesFunciones.LABEL_FECHACOMPRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciaciones.jLabelfecha_compraDepreciaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			depreciaciones.setvida_util(Double.parseDouble(this.jInternalFrameDetalleFormDepreciaciones.jTextFieldvida_utilDepreciaciones.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DepreciacionesConstantesFunciones.LABEL_VIDAUTIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciaciones.jLabelvida_utilDepreciaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			depreciaciones.setcosto_de_compra(Double.parseDouble(this.jInternalFrameDetalleFormDepreciaciones.jTextFieldcosto_de_compraDepreciaciones.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DepreciacionesConstantesFunciones.LABEL_COSTODECOMPRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciaciones.jLabelcosto_de_compraDepreciaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			depreciaciones.setfecha_mantenimiento(this.jInternalFrameDetalleFormDepreciaciones.jDateChooserfecha_mantenimientoDepreciaciones.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DepreciacionesConstantesFunciones.LABEL_FECHAMANTENIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciaciones.jLabelfecha_mantenimientoDepreciaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			depreciaciones.setfecha_depreciacion(this.jInternalFrameDetalleFormDepreciaciones.jDateChooserfecha_depreciacionDepreciaciones.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DepreciacionesConstantesFunciones.LABEL_FECHADEPRECIACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciaciones.jLabelfecha_depreciacionDepreciaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			depreciaciones.setvalor_acumulado(Double.parseDouble(this.jInternalFrameDetalleFormDepreciaciones.jTextFieldvalor_acumuladoDepreciaciones.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DepreciacionesConstantesFunciones.LABEL_VALORACUMULADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciaciones.jLabelvalor_acumuladoDepreciaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			depreciaciones.setvalor_gasto(Double.parseDouble(this.jInternalFrameDetalleFormDepreciaciones.jTextFieldvalor_gastoDepreciaciones.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DepreciacionesConstantesFunciones.LABEL_VALORGASTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciaciones.jLabelvalor_gastoDepreciaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDepreciaciones(Depreciaciones depreciacionesBean,Depreciaciones depreciaciones,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDepreciaciones(Depreciaciones depreciacionesOrigen,Depreciaciones depreciaciones,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && depreciacionesOrigen.getId()!=null && !depreciacionesOrigen.getId().equals(0L))) {depreciaciones.setId(depreciacionesOrigen.getId());}}
			if(conDefault || (!conDefault && depreciacionesOrigen.getcodigo_sub_grupo()!=null && !depreciacionesOrigen.getcodigo_sub_grupo().equals(""))) {depreciaciones.setcodigo_sub_grupo(depreciacionesOrigen.getcodigo_sub_grupo());}
			if(conDefault || (!conDefault && depreciacionesOrigen.getnombre_sub_grupo()!=null && !depreciacionesOrigen.getnombre_sub_grupo().equals(""))) {depreciaciones.setnombre_sub_grupo(depreciacionesOrigen.getnombre_sub_grupo());}
			if(conDefault || (!conDefault && depreciacionesOrigen.getcodigo_detalle_grupo()!=null && !depreciacionesOrigen.getcodigo_detalle_grupo().equals(""))) {depreciaciones.setcodigo_detalle_grupo(depreciacionesOrigen.getcodigo_detalle_grupo());}
			if(conDefault || (!conDefault && depreciacionesOrigen.getnombre_detalle_grupo()!=null && !depreciacionesOrigen.getnombre_detalle_grupo().equals(""))) {depreciaciones.setnombre_detalle_grupo(depreciacionesOrigen.getnombre_detalle_grupo());}
			if(conDefault || (!conDefault && depreciacionesOrigen.getclave()!=null && !depreciacionesOrigen.getclave().equals(""))) {depreciaciones.setclave(depreciacionesOrigen.getclave());}
			if(conDefault || (!conDefault && depreciacionesOrigen.getnombre()!=null && !depreciacionesOrigen.getnombre().equals(""))) {depreciaciones.setnombre(depreciacionesOrigen.getnombre());}
			if(conDefault || (!conDefault && depreciacionesOrigen.getfecha_compra()!=null && !depreciacionesOrigen.getfecha_compra().equals(new Date()))) {depreciaciones.setfecha_compra(depreciacionesOrigen.getfecha_compra());}
			if(conDefault || (!conDefault && depreciacionesOrigen.getvida_util()!=null && !depreciacionesOrigen.getvida_util().equals(0.0))) {depreciaciones.setvida_util(depreciacionesOrigen.getvida_util());}
			if(conDefault || (!conDefault && depreciacionesOrigen.getcosto_de_compra()!=null && !depreciacionesOrigen.getcosto_de_compra().equals(0.0))) {depreciaciones.setcosto_de_compra(depreciacionesOrigen.getcosto_de_compra());}
			if(conDefault || (!conDefault && depreciacionesOrigen.getfecha_mantenimiento()!=null && !depreciacionesOrigen.getfecha_mantenimiento().equals(new Date()))) {depreciaciones.setfecha_mantenimiento(depreciacionesOrigen.getfecha_mantenimiento());}
			if(conDefault || (!conDefault && depreciacionesOrigen.getfecha_depreciacion()!=null && !depreciacionesOrigen.getfecha_depreciacion().equals(new Date()))) {depreciaciones.setfecha_depreciacion(depreciacionesOrigen.getfecha_depreciacion());}
			if(conDefault || (!conDefault && depreciacionesOrigen.getvalor_acumulado()!=null && !depreciacionesOrigen.getvalor_acumulado().equals(0.0))) {depreciaciones.setvalor_acumulado(depreciacionesOrigen.getvalor_acumulado());}
			if(conDefault || (!conDefault && depreciacionesOrigen.getvalor_gasto()!=null && !depreciacionesOrigen.getvalor_gasto().equals(0.0))) {depreciaciones.setvalor_gasto(depreciacionesOrigen.getvalor_gasto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDepreciaciones(Depreciaciones depreciaciones) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDepreciaciones.jLabelidDepreciaciones.setText(depreciaciones.getId().toString());
			this.jInternalFrameDetalleFormDepreciaciones.jTextFieldcodigo_sub_grupoDepreciaciones.setText(depreciaciones.getcodigo_sub_grupo());
			this.jInternalFrameDetalleFormDepreciaciones.jTextAreanombre_sub_grupoDepreciaciones.setText(depreciaciones.getnombre_sub_grupo());
			this.jInternalFrameDetalleFormDepreciaciones.jTextFieldcodigo_detalle_grupoDepreciaciones.setText(depreciaciones.getcodigo_detalle_grupo());
			this.jInternalFrameDetalleFormDepreciaciones.jTextAreanombre_detalle_grupoDepreciaciones.setText(depreciaciones.getnombre_detalle_grupo());
			this.jInternalFrameDetalleFormDepreciaciones.jTextFieldclaveDepreciaciones.setText(depreciaciones.getclave());
			this.jInternalFrameDetalleFormDepreciaciones.jTextAreanombreDepreciaciones.setText(depreciaciones.getnombre());
			this.jInternalFrameDetalleFormDepreciaciones.jDateChooserfecha_compraDepreciaciones.setDate(depreciaciones.getfecha_compra());
			this.jInternalFrameDetalleFormDepreciaciones.jTextFieldvida_utilDepreciaciones.setText(depreciaciones.getvida_util().toString());
			this.jInternalFrameDetalleFormDepreciaciones.jTextFieldcosto_de_compraDepreciaciones.setText(depreciaciones.getcosto_de_compra().toString());
			this.jInternalFrameDetalleFormDepreciaciones.jDateChooserfecha_mantenimientoDepreciaciones.setDate(depreciaciones.getfecha_mantenimiento());
			this.jInternalFrameDetalleFormDepreciaciones.jDateChooserfecha_depreciacionDepreciaciones.setDate(depreciaciones.getfecha_depreciacion());
			this.jInternalFrameDetalleFormDepreciaciones.jTextFieldvalor_acumuladoDepreciaciones.setText(depreciaciones.getvalor_acumulado().toString());
			this.jInternalFrameDetalleFormDepreciaciones.jTextFieldvalor_gastoDepreciaciones.setText(depreciaciones.getvalor_gasto().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDepreciaciones(DepreciacionesBean depreciacionesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDepreciaciones.jLabelidDepreciaciones.setText(depreciacionesBean.getId().toString());
			this.jInternalFrameDetalleFormDepreciaciones.jTextFieldcodigo_sub_grupoDepreciaciones.setText(depreciacionesBean.getcodigo_sub_grupo());
			this.jInternalFrameDetalleFormDepreciaciones.jTextAreanombre_sub_grupoDepreciaciones.setText(depreciacionesBean.getnombre_sub_grupo());
			this.jInternalFrameDetalleFormDepreciaciones.jTextFieldcodigo_detalle_grupoDepreciaciones.setText(depreciacionesBean.getcodigo_detalle_grupo());
			this.jInternalFrameDetalleFormDepreciaciones.jTextAreanombre_detalle_grupoDepreciaciones.setText(depreciacionesBean.getnombre_detalle_grupo());
			this.jInternalFrameDetalleFormDepreciaciones.jTextFieldclaveDepreciaciones.setText(depreciacionesBean.getclave());
			this.jInternalFrameDetalleFormDepreciaciones.jTextAreanombreDepreciaciones.setText(depreciacionesBean.getnombre());
			this.jInternalFrameDetalleFormDepreciaciones.jDateChooserfecha_compraDepreciaciones.setDate(depreciacionesBean.getfecha_compra());
			this.jInternalFrameDetalleFormDepreciaciones.jTextFieldvida_utilDepreciaciones.setText(depreciacionesBean.getvida_util().toString());
			this.jInternalFrameDetalleFormDepreciaciones.jTextFieldcosto_de_compraDepreciaciones.setText(depreciacionesBean.getcosto_de_compra().toString());
			this.jInternalFrameDetalleFormDepreciaciones.jDateChooserfecha_mantenimientoDepreciaciones.setDate(depreciacionesBean.getfecha_mantenimiento());
			this.jInternalFrameDetalleFormDepreciaciones.jDateChooserfecha_depreciacionDepreciaciones.setDate(depreciacionesBean.getfecha_depreciacion());
			this.jInternalFrameDetalleFormDepreciaciones.jTextFieldvalor_acumuladoDepreciaciones.setText(depreciacionesBean.getvalor_acumulado().toString());
			this.jInternalFrameDetalleFormDepreciaciones.jTextFieldvalor_gastoDepreciaciones.setText(depreciacionesBean.getvalor_gasto().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDepreciaciones(DepreciacionesParameterReturnGeneral depreciacionesReturnGeneral,DepreciacionesBean depreciacionesBean,Boolean conDefault) throws Exception { 
		try {
			Depreciaciones depreciacionesLocal=new Depreciaciones();
			
			depreciacionesLocal=depreciacionesReturnGeneral.getDepreciaciones();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && depreciacionesLocal.getId()!=null && !depreciacionesLocal.getId().equals(0L))) {depreciacionesBean.setId(depreciacionesLocal.getId());}}
			if(conDefault || (!conDefault && depreciacionesLocal.getcodigo_sub_grupo()!=null && !depreciacionesLocal.getcodigo_sub_grupo().equals(""))) {depreciacionesBean.setcodigo_sub_grupo(depreciacionesLocal.getcodigo_sub_grupo());}
			if(conDefault || (!conDefault && depreciacionesLocal.getnombre_sub_grupo()!=null && !depreciacionesLocal.getnombre_sub_grupo().equals(""))) {depreciacionesBean.setnombre_sub_grupo(depreciacionesLocal.getnombre_sub_grupo());}
			if(conDefault || (!conDefault && depreciacionesLocal.getcodigo_detalle_grupo()!=null && !depreciacionesLocal.getcodigo_detalle_grupo().equals(""))) {depreciacionesBean.setcodigo_detalle_grupo(depreciacionesLocal.getcodigo_detalle_grupo());}
			if(conDefault || (!conDefault && depreciacionesLocal.getnombre_detalle_grupo()!=null && !depreciacionesLocal.getnombre_detalle_grupo().equals(""))) {depreciacionesBean.setnombre_detalle_grupo(depreciacionesLocal.getnombre_detalle_grupo());}
			if(conDefault || (!conDefault && depreciacionesLocal.getclave()!=null && !depreciacionesLocal.getclave().equals(""))) {depreciacionesBean.setclave(depreciacionesLocal.getclave());}
			if(conDefault || (!conDefault && depreciacionesLocal.getnombre()!=null && !depreciacionesLocal.getnombre().equals(""))) {depreciacionesBean.setnombre(depreciacionesLocal.getnombre());}
			if(conDefault || (!conDefault && depreciacionesLocal.getfecha_compra()!=null && !depreciacionesLocal.getfecha_compra().equals(new Date()))) {depreciacionesBean.setfecha_compra(depreciacionesLocal.getfecha_compra());}
			if(conDefault || (!conDefault && depreciacionesLocal.getvida_util()!=null && !depreciacionesLocal.getvida_util().equals(0.0))) {depreciacionesBean.setvida_util(depreciacionesLocal.getvida_util());}
			if(conDefault || (!conDefault && depreciacionesLocal.getcosto_de_compra()!=null && !depreciacionesLocal.getcosto_de_compra().equals(0.0))) {depreciacionesBean.setcosto_de_compra(depreciacionesLocal.getcosto_de_compra());}
			if(conDefault || (!conDefault && depreciacionesLocal.getfecha_mantenimiento()!=null && !depreciacionesLocal.getfecha_mantenimiento().equals(new Date()))) {depreciacionesBean.setfecha_mantenimiento(depreciacionesLocal.getfecha_mantenimiento());}
			if(conDefault || (!conDefault && depreciacionesLocal.getfecha_depreciacion()!=null && !depreciacionesLocal.getfecha_depreciacion().equals(new Date()))) {depreciacionesBean.setfecha_depreciacion(depreciacionesLocal.getfecha_depreciacion());}
			if(conDefault || (!conDefault && depreciacionesLocal.getvalor_acumulado()!=null && !depreciacionesLocal.getvalor_acumulado().equals(0.0))) {depreciacionesBean.setvalor_acumulado(depreciacionesLocal.getvalor_acumulado());}
			if(conDefault || (!conDefault && depreciacionesLocal.getvalor_gasto()!=null && !depreciacionesLocal.getvalor_gasto().equals(0.0))) {depreciacionesBean.setvalor_gasto(depreciacionesLocal.getvalor_gasto());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDepreciacionesGenerico(Long idDepreciacionesSeleccionado,JComboBox jComboBoxDepreciaciones,List<Depreciaciones> depreciacionessLocal)throws Exception {
		try {
			Depreciaciones  depreciacionesTemp=null;

			for(Depreciaciones depreciacionesAux:depreciacionessLocal) {
				if(depreciacionesAux.getId()!=null && depreciacionesAux.getId().equals(idDepreciacionesSeleccionado)) {
					depreciacionesTemp=depreciacionesAux;
					break;
				}
			}

			jComboBoxDepreciaciones.setSelectedItem(depreciacionesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDepreciacionesGenerico(JComboBox jComboBoxDepreciaciones,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDepreciaciones.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDepreciaciones.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDepreciaciones.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDepreciaciones.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDepreciaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDepreciaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			depreciaciones=(Depreciaciones) depreciacionesLogic.getDepreciacioness().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			depreciaciones =(Depreciaciones) depreciacioness.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!depreciaciones.getIsNew() && !depreciaciones.getIsChanged() && !depreciaciones.getIsDeleted()) {
				sDescripcion=depreciaciones.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=depreciaciones.getempresa_descripcion();
			}
		}

		if(sTipo.equals("AnioInicio")) {
			//sDescripcion=this.getActualAnioInicioForeignKeyDescripcion((Long)value);
			if(!depreciaciones.getIsNew() && !depreciaciones.getIsChanged() && !depreciaciones.getIsDeleted()) {
				sDescripcion=depreciaciones.getanioinicio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioInicioForeignKeyDescripcion((Long)value);
				sDescripcion=depreciaciones.getanioinicio_descripcion();
			}
		}

		if(sTipo.equals("AnioFin")) {
			//sDescripcion=this.getActualAnioFinForeignKeyDescripcion((Long)value);
			if(!depreciaciones.getIsNew() && !depreciaciones.getIsChanged() && !depreciaciones.getIsDeleted()) {
				sDescripcion=depreciaciones.getaniofin_descripcion();
			} else {
				//sDescripcion=this.getActualAnioFinForeignKeyDescripcion((Long)value);
				sDescripcion=depreciaciones.getaniofin_descripcion();
			}
		}

		if(sTipo.equals("MesInicio")) {
			//sDescripcion=this.getActualMesInicioForeignKeyDescripcion((Long)value);
			if(!depreciaciones.getIsNew() && !depreciaciones.getIsChanged() && !depreciaciones.getIsDeleted()) {
				sDescripcion=depreciaciones.getmesinicio_descripcion();
			} else {
				//sDescripcion=this.getActualMesInicioForeignKeyDescripcion((Long)value);
				sDescripcion=depreciaciones.getmesinicio_descripcion();
			}
		}

		if(sTipo.equals("MesFin")) {
			//sDescripcion=this.getActualMesFinForeignKeyDescripcion((Long)value);
			if(!depreciaciones.getIsNew() && !depreciaciones.getIsChanged() && !depreciaciones.getIsDeleted()) {
				sDescripcion=depreciaciones.getmesfin_descripcion();
			} else {
				//sDescripcion=this.getActualMesFinForeignKeyDescripcion((Long)value);
				sDescripcion=depreciaciones.getmesfin_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!depreciaciones.getIsNew() && !depreciaciones.getIsChanged() && !depreciaciones.getIsDeleted()) {
				sDescripcion=depreciaciones.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=depreciaciones.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!depreciaciones.getIsNew() && !depreciaciones.getIsChanged() && !depreciaciones.getIsDeleted()) {
				sDescripcion=depreciaciones.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=depreciaciones.getmes_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Depreciaciones depreciacionesRow=new Depreciaciones();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			depreciacionesRow=(Depreciaciones) depreciacionesLogic.getDepreciacioness().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			depreciacionesRow=(Depreciaciones) depreciacioness.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDepreciaciones(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDepreciaciones.setVisible((this.isVisibilidadCeldaNuevoDepreciaciones && this.isPermisoNuevoDepreciaciones));			
			this.jButtonDuplicarDepreciaciones.setVisible((this.isVisibilidadCeldaDuplicarDepreciaciones && this.isPermisoDuplicarDepreciaciones));			
			this.jButtonCopiarDepreciaciones.setVisible((this.isVisibilidadCeldaCopiarDepreciaciones && this.isPermisoCopiarDepreciaciones));
			this.jButtonVerFormDepreciaciones.setVisible((this.isVisibilidadCeldaVerFormDepreciaciones && this.isPermisoVerFormDepreciaciones));
			
			this.jButtonAbrirOrderByDepreciaciones.setVisible((this.isVisibilidadCeldaOrdenDepreciaciones && this.isPermisoOrdenDepreciaciones));			
			
			this.jButtonNuevoRelacionesDepreciaciones.setVisible((this.isVisibilidadCeldaNuevoRelacionesDepreciaciones && this.isPermisoNuevoDepreciaciones));			
			this.jButtonNuevoGuardarCambiosDepreciaciones.setVisible((this.isVisibilidadCeldaNuevoDepreciaciones && this.isPermisoNuevoDepreciaciones && this.isPermisoGuardarCambiosDepreciaciones));
			
			if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
			this.jInternalFrameDetalleFormDepreciaciones.jButtonModificarDepreciaciones.setVisible((this.isVisibilidadCeldaModificarDepreciaciones && this.isPermisoActualizarDepreciaciones));	
			this.jInternalFrameDetalleFormDepreciaciones.jButtonActualizarDepreciaciones.setVisible((this.isVisibilidadCeldaActualizarDepreciaciones && this.isPermisoActualizarDepreciaciones));	
			this.jInternalFrameDetalleFormDepreciaciones.jButtonEliminarDepreciaciones.setVisible((this.isVisibilidadCeldaEliminarDepreciaciones && this.isPermisoEliminarDepreciaciones));
			this.jInternalFrameDetalleFormDepreciaciones.jButtonCancelarDepreciaciones.setVisible(this.isVisibilidadCeldaCancelarDepreciaciones);							
			this.jInternalFrameDetalleFormDepreciaciones.jButtonGuardarCambiosDepreciaciones.setVisible((this.isVisibilidadCeldaGuardarDepreciaciones && this.isPermisoGuardarCambiosDepreciaciones));			
			
			}
						
			this.jButtonGuardarCambiosTablaDepreciaciones.setVisible((this.isVisibilidadCeldaGuardarCambiosDepreciaciones && this.isPermisoGuardarCambiosDepreciaciones));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDepreciaciones.setVisible((this.isVisibilidadCeldaNuevoDepreciaciones && this.isPermisoNuevoDepreciaciones));						
			this.jButtonDuplicarToolBarDepreciaciones.setVisible((this.isVisibilidadCeldaDuplicarDepreciaciones && this.isPermisoDuplicarDepreciaciones));						
			this.jButtonCopiarToolBarDepreciaciones.setVisible((this.isVisibilidadCeldaCopiarDepreciaciones && this.isPermisoCopiarDepreciaciones));			
			this.jButtonVerFormToolBarDepreciaciones.setVisible((this.isVisibilidadCeldaVerFormDepreciaciones && this.isPermisoVerFormDepreciaciones));			
			this.jButtonAbrirOrderByToolBarDepreciaciones.setVisible((this.isVisibilidadCeldaOrdenDepreciaciones && this.isPermisoOrdenDepreciaciones));
			this.jButtonNuevoRelacionesToolBarDepreciaciones.setVisible((this.isVisibilidadCeldaNuevoRelacionesDepreciaciones && this.isPermisoNuevoDepreciaciones));			
			this.jButtonNuevoGuardarCambiosToolBarDepreciaciones.setVisible((this.isVisibilidadCeldaNuevoDepreciaciones && this.isPermisoNuevoDepreciaciones && this.isPermisoGuardarCambiosDepreciaciones));			
			
			if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
			this.jInternalFrameDetalleFormDepreciaciones.jButtonModificarToolBarDepreciaciones.setVisible((this.isVisibilidadCeldaModificarDepreciaciones && this.isPermisoActualizarDepreciaciones));	
			this.jInternalFrameDetalleFormDepreciaciones.jButtonActualizarToolBarDepreciaciones.setVisible((this.isVisibilidadCeldaActualizarDepreciaciones  && this.isPermisoActualizarDepreciaciones));	
			this.jInternalFrameDetalleFormDepreciaciones.jButtonEliminarToolBarDepreciaciones.setVisible((this.isVisibilidadCeldaEliminarDepreciaciones && this.isPermisoEliminarDepreciaciones));
			this.jInternalFrameDetalleFormDepreciaciones.jButtonCancelarToolBarDepreciaciones.setVisible(this.isVisibilidadCeldaCancelarDepreciaciones);				
			this.jInternalFrameDetalleFormDepreciaciones.jButtonGuardarCambiosToolBarDepreciaciones.setVisible((this.isVisibilidadCeldaGuardarDepreciaciones && this.isPermisoGuardarCambiosDepreciaciones));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDepreciaciones.setVisible((this.isVisibilidadCeldaGuardarCambiosDepreciaciones && this.isPermisoGuardarCambiosDepreciaciones));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDepreciaciones.setVisible((this.isVisibilidadCeldaNuevoDepreciaciones && this.isPermisoNuevoDepreciaciones));			
			this.jMenuItemDuplicarDepreciaciones.setVisible((this.isVisibilidadCeldaDuplicarDepreciaciones && this.isPermisoDuplicarDepreciaciones));			
			this.jMenuItemCopiarDepreciaciones.setVisible((this.isVisibilidadCeldaCopiarDepreciaciones && this.isPermisoCopiarDepreciaciones));			
			this.jMenuItemVerFormDepreciaciones.setVisible((this.isVisibilidadCeldaVerFormDepreciaciones && this.isPermisoVerFormDepreciaciones));			
			this.jMenuItemAbrirOrderByDepreciaciones.setVisible((this.isVisibilidadCeldaOrdenDepreciaciones && this.isPermisoOrdenDepreciaciones));			
			//this.jMenuItemMostrarOcultarDepreciaciones.setVisible((this.isVisibilidadCeldaOrdenDepreciaciones && this.isPermisoOrdenDepreciaciones));
			this.jMenuItemDetalleAbrirOrderByDepreciaciones.setVisible((this.isVisibilidadCeldaOrdenDepreciaciones && this.isPermisoOrdenDepreciaciones));			
			//this.jMenuItemDetalleMostrarOcultarDepreciaciones.setVisible((this.isVisibilidadCeldaOrdenDepreciaciones && this.isPermisoOrdenDepreciaciones));			
			this.jMenuItemNuevoRelacionesDepreciaciones.setVisible((this.isVisibilidadCeldaNuevoRelacionesDepreciaciones && this.isPermisoNuevoDepreciaciones));			
			this.jMenuItemNuevoGuardarCambiosDepreciaciones.setVisible((this.isVisibilidadCeldaNuevoDepreciaciones && this.isPermisoNuevoDepreciaciones && this.isPermisoGuardarCambiosDepreciaciones));									
			
			if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
			this.jInternalFrameDetalleFormDepreciaciones.jMenuItemModificarDepreciaciones.setVisible((this.isVisibilidadCeldaModificarDepreciaciones && this.isPermisoActualizarDepreciaciones));	
			this.jInternalFrameDetalleFormDepreciaciones.jMenuItemActualizarDepreciaciones.setVisible((this.isVisibilidadCeldaActualizarDepreciaciones && this.isPermisoActualizarDepreciaciones));	
			this.jInternalFrameDetalleFormDepreciaciones.jMenuItemEliminarDepreciaciones.setVisible((this.isVisibilidadCeldaEliminarDepreciaciones && this.isPermisoEliminarDepreciaciones));
			this.jInternalFrameDetalleFormDepreciaciones.jMenuItemCancelarDepreciaciones.setVisible(this.isVisibilidadCeldaCancelarDepreciaciones);				
			}
			
			this.jMenuItemGuardarCambiosDepreciaciones.setVisible((this.isVisibilidadCeldaGuardarDepreciaciones && this.isPermisoGuardarCambiosDepreciaciones));						
			this.jMenuItemGuardarCambiosTablaDepreciaciones.setVisible((this.isVisibilidadCeldaGuardarCambiosDepreciaciones && this.isPermisoGuardarCambiosDepreciaciones));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDepreciaciones=this.jButtonNuevoDepreciaciones.isVisible();
			this.isVisibilidadCeldaDuplicarDepreciaciones=this.jButtonDuplicarDepreciaciones.isVisible();
			this.isVisibilidadCeldaCopiarDepreciaciones=this.jButtonCopiarDepreciaciones.isVisible();
			this.isVisibilidadCeldaVerFormDepreciaciones=this.jButtonVerFormDepreciaciones.isVisible();
			
			this.isVisibilidadCeldaOrdenDepreciaciones=this.jButtonAbrirOrderByDepreciaciones.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDepreciaciones=this.jButtonNuevoRelacionesDepreciaciones.isVisible();
			this.isVisibilidadCeldaModificarDepreciaciones=this.jButtonModificarDepreciaciones.isVisible();
			
			if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
			this.isVisibilidadCeldaActualizarDepreciaciones=this.jInternalFrameDetalleFormDepreciaciones.jButtonActualizarDepreciaciones.isVisible();
			this.isVisibilidadCeldaEliminarDepreciaciones=this.jInternalFrameDetalleFormDepreciaciones.jButtonEliminarDepreciaciones.isVisible();
			this.isVisibilidadCeldaCancelarDepreciaciones=this.jInternalFrameDetalleFormDepreciaciones.jButtonCancelarDepreciaciones.isVisible();
			this.isVisibilidadCeldaGuardarDepreciaciones=this.jInternalFrameDetalleFormDepreciaciones.jButtonGuardarCambiosDepreciaciones.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDepreciaciones=this.jButtonGuardarCambiosTablaDepreciaciones.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDepreciaciones=this.jButtonNuevoToolBarDepreciaciones.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDepreciaciones=this.jButtonNuevoRelacionesToolBarDepreciaciones.isVisible();
			
			if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
			this.isVisibilidadCeldaModificarDepreciaciones=this.jInternalFrameDetalleFormDepreciaciones.jButtonModificarToolBarDepreciaciones.isVisible();
			this.isVisibilidadCeldaActualizarDepreciaciones=this.jInternalFrameDetalleFormDepreciaciones.jButtonActualizarToolBarDepreciaciones.isVisible();
			this.isVisibilidadCeldaEliminarDepreciaciones=this.jInternalFrameDetalleFormDepreciaciones.jButtonEliminarToolBarDepreciaciones.isVisible();
			this.isVisibilidadCeldaCancelarDepreciaciones=this.jInternalFrameDetalleFormDepreciaciones.jButtonCancelarToolBarDepreciaciones.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDepreciaciones=this.jButtonGuardarCambiosToolBarDepreciaciones.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDepreciaciones=this.jButtonGuardarCambiosTablaToolBarDepreciaciones.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDepreciaciones=this.jMenuItemNuevoDepreciaciones.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDepreciaciones=this.jMenuItemNuevoRelacionesDepreciaciones.isVisible();
			
			if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
			this.isVisibilidadCeldaModificarDepreciaciones=this.jInternalFrameDetalleFormDepreciaciones.jMenuItemModificarDepreciaciones.isVisible();
			this.isVisibilidadCeldaActualizarDepreciaciones=this.jInternalFrameDetalleFormDepreciaciones.jMenuItemActualizarDepreciaciones.isVisible();
			this.isVisibilidadCeldaEliminarDepreciaciones=this.jInternalFrameDetalleFormDepreciaciones.jMenuItemEliminarDepreciaciones.isVisible();
			this.isVisibilidadCeldaCancelarDepreciaciones=this.jInternalFrameDetalleFormDepreciaciones.jMenuItemCancelarDepreciaciones.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDepreciaciones=this.jMenuItemGuardarCambiosDepreciaciones.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDepreciaciones=this.jMenuItemGuardarCambiosTablaDepreciaciones.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDepreciaciones(Boolean esInicializar) {
		if(DepreciacionesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.depreciacionesSessionBean.getConGuardarRelaciones()) {
				//if(this.depreciacionesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDepreciaciones();
			}
			
			this.inicializarActualizarBindingBotonesManualDepreciaciones(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDepreciaciones() {
		this.jButtonNuevoDepreciaciones.setVisible(this.isPermisoNuevoDepreciaciones);			
		this.jButtonDuplicarDepreciaciones.setVisible(this.isPermisoDuplicarDepreciaciones);			
		this.jButtonCopiarDepreciaciones.setVisible(this.isPermisoCopiarDepreciaciones);			
		this.jButtonVerFormDepreciaciones.setVisible(this.isPermisoVerFormDepreciaciones);			
		
		this.jButtonAbrirOrderByDepreciaciones.setVisible(this.isPermisoOrdenDepreciaciones);					
		
		this.jButtonNuevoRelacionesDepreciaciones.setVisible(this.isPermisoNuevoDepreciaciones);			
		
		if(this.jInternalFrameDetalleFormDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepreciaciones.jButtonModificarDepreciaciones.setVisible(this.isPermisoActualizarDepreciaciones);	
			this.jInternalFrameDetalleFormDepreciaciones.jButtonActualizarDepreciaciones.setVisible(this.isPermisoActualizarDepreciaciones);	
			this.jInternalFrameDetalleFormDepreciaciones.jButtonEliminarDepreciaciones.setVisible(this.isPermisoEliminarDepreciaciones);
			this.jInternalFrameDetalleFormDepreciaciones.jButtonCancelarDepreciaciones.setVisible(this.isVisibilidadCeldaCancelarDepreciaciones);						
			this.jInternalFrameDetalleFormDepreciaciones.jButtonGuardarCambiosDepreciaciones.setVisible(this.isPermisoGuardarCambiosDepreciaciones);							
		}
		
		this.jButtonGuardarCambiosTablaDepreciaciones.setVisible(this.isPermisoActualizarDepreciaciones);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDepreciaciones() {
		this.jInternalFrameDetalleFormDepreciaciones.jButtonModificarDepreciaciones.setVisible(this.isPermisoActualizarDepreciaciones);	
		this.jInternalFrameDetalleFormDepreciaciones.jButtonActualizarDepreciaciones.setVisible(this.isPermisoActualizarDepreciaciones);	
		this.jInternalFrameDetalleFormDepreciaciones.jButtonEliminarDepreciaciones.setVisible(this.isPermisoEliminarDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jButtonCancelarDepreciaciones.setVisible(this.isVisibilidadCeldaCancelarDepreciaciones);							
		this.jInternalFrameDetalleFormDepreciaciones.jButtonGuardarCambiosDepreciaciones.setVisible((this.isVisibilidadCeldaGuardarDepreciaciones && this.isPermisoGuardarCambiosDepreciaciones));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDepreciaciones() {
		if(DepreciacionesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDepreciaciones();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDepreciaciones() {
	}
	
	public void jTableDatosDepreciacionesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDepreciaciones(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDepreciacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciaciones(this.getdepreciaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciaciones==null) {
						this.depreciaciones = new Depreciaciones();
					}

					this.setVariablesFormularioToObjetoActualDepreciaciones(this.depreciaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
				}

				if(this.depreciaciones.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.depreciaciones.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDepreciacionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDepreciaciones(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDepreciaciones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDepreciaciones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDepreciaciones(this.getdepreciaciones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.depreciacionesLogic.getConnexion());

				if(this.depreciaciones.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.depreciaciones.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDepreciaciones=(TitledBorder)this.jScrollPanelDatosDepreciaciones.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDepreciaciones.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDepreciacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciaciones(this.getdepreciaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciaciones==null) {
						this.depreciaciones = new Depreciaciones();
					}

					this.setVariablesFormularioToObjetoActualDepreciaciones(this.depreciaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
				}

				if(this.depreciaciones.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.depreciaciones.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anio_inicioDepreciacionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanioinicio=true;

			idTienePermisoanioinicio=this.tienePermisosUsuarioEnPaginaWebDepreciaciones(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanioinicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDepreciaciones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDepreciaciones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDepreciaciones(this.getdepreciaciones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);

				this.anioinicioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioinicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioinicioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.depreciacionesLogic.getConnexion());

				if(this.depreciaciones.getid_anio_inicio()!=null) {
					this.anioinicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioinicioBeanSwingJInternalFrame.setIdActual(this.depreciaciones.getid_anio_inicio());
					this.anioinicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioinicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioinicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioinicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDepreciaciones=(TitledBorder)this.jScrollPanelDatosDepreciaciones.getBorder();
				TitledBorder titledBorderanioinicio=(TitledBorder)this.anioinicioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanioinicio.setTitle(titledBorderDepreciaciones.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anio_inicioDepreciacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciaciones(this.getdepreciaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciaciones==null) {
						this.depreciaciones = new Depreciaciones();
					}

					this.setVariablesFormularioToObjetoActualDepreciaciones(this.depreciaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
				}

				if(this.depreciaciones.getid_anio_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio_inicio = "+this.depreciaciones.getid_anio_inicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anio_finDepreciacionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoaniofin=true;

			idTienePermisoaniofin=this.tienePermisosUsuarioEnPaginaWebDepreciaciones(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoaniofin) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDepreciaciones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDepreciaciones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDepreciaciones(this.getdepreciaciones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);

				this.aniofinBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.aniofinBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.aniofinBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.depreciacionesLogic.getConnexion());

				if(this.depreciaciones.getid_anio_fin()!=null) {
					this.aniofinBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.aniofinBeanSwingJInternalFrame.setIdActual(this.depreciaciones.getid_anio_fin());
					this.aniofinBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.aniofinBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.aniofinBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.aniofinBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDepreciaciones=(TitledBorder)this.jScrollPanelDatosDepreciaciones.getBorder();
				TitledBorder titledBorderaniofin=(TitledBorder)this.aniofinBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderaniofin.setTitle(titledBorderDepreciaciones.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anio_finDepreciacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciaciones(this.getdepreciaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciaciones==null) {
						this.depreciaciones = new Depreciaciones();
					}

					this.setVariablesFormularioToObjetoActualDepreciaciones(this.depreciaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
				}

				if(this.depreciaciones.getid_anio_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio_fin = "+this.depreciaciones.getid_anio_fin().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mes_inicioDepreciacionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomesinicio=true;

			idTienePermisomesinicio=this.tienePermisosUsuarioEnPaginaWebDepreciaciones(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomesinicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDepreciaciones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDepreciaciones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDepreciaciones(this.getdepreciaciones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);

				this.mesinicioBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesinicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesinicioBeanSwingJInternalFrame.getMesLogic().setConnexion(this.depreciacionesLogic.getConnexion());

				if(this.depreciaciones.getid_mes_inicio()!=null) {
					this.mesinicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesinicioBeanSwingJInternalFrame.setIdActual(this.depreciaciones.getid_mes_inicio());
					this.mesinicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesinicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesinicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesinicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDepreciaciones=(TitledBorder)this.jScrollPanelDatosDepreciaciones.getBorder();
				TitledBorder titledBordermesinicio=(TitledBorder)this.mesinicioBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermesinicio.setTitle(titledBorderDepreciaciones.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mes_inicioDepreciacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciaciones(this.getdepreciaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciaciones==null) {
						this.depreciaciones = new Depreciaciones();
					}

					this.setVariablesFormularioToObjetoActualDepreciaciones(this.depreciaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
				}

				if(this.depreciaciones.getid_mes_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes_inicio = "+this.depreciaciones.getid_mes_inicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mes_finDepreciacionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomesfin=true;

			idTienePermisomesfin=this.tienePermisosUsuarioEnPaginaWebDepreciaciones(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomesfin) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDepreciaciones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDepreciaciones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDepreciaciones(this.getdepreciaciones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);

				this.mesfinBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesfinBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesfinBeanSwingJInternalFrame.getMesLogic().setConnexion(this.depreciacionesLogic.getConnexion());

				if(this.depreciaciones.getid_mes_fin()!=null) {
					this.mesfinBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesfinBeanSwingJInternalFrame.setIdActual(this.depreciaciones.getid_mes_fin());
					this.mesfinBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesfinBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesfinBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesfinBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDepreciaciones=(TitledBorder)this.jScrollPanelDatosDepreciaciones.getBorder();
				TitledBorder titledBordermesfin=(TitledBorder)this.mesfinBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermesfin.setTitle(titledBorderDepreciaciones.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mes_finDepreciacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciaciones(this.getdepreciaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciaciones==null) {
						this.depreciaciones = new Depreciaciones();
					}

					this.setVariablesFormularioToObjetoActualDepreciaciones(this.depreciaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
				}

				if(this.depreciaciones.getid_mes_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes_fin = "+this.depreciaciones.getid_mes_fin().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_sub_grupoDepreciacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciaciones(this.getdepreciaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciaciones==null) {
						this.depreciaciones = new Depreciaciones();
					}

					this.setVariablesFormularioToObjetoActualDepreciaciones(this.depreciaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
				}

				if(this.depreciaciones.getcodigo_sub_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_sub_grupo like '%"+this.depreciaciones.getcodigo_sub_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_sub_grupoDepreciacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciaciones(this.getdepreciaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciaciones==null) {
						this.depreciaciones = new Depreciaciones();
					}

					this.setVariablesFormularioToObjetoActualDepreciaciones(this.depreciaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
				}

				if(this.depreciaciones.getnombre_sub_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_sub_grupo like '%"+this.depreciaciones.getnombre_sub_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_detalle_grupoDepreciacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciaciones(this.getdepreciaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciaciones==null) {
						this.depreciaciones = new Depreciaciones();
					}

					this.setVariablesFormularioToObjetoActualDepreciaciones(this.depreciaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
				}

				if(this.depreciaciones.getcodigo_detalle_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_detalle_grupo like '%"+this.depreciaciones.getcodigo_detalle_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_detalle_grupoDepreciacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciaciones(this.getdepreciaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciaciones==null) {
						this.depreciaciones = new Depreciaciones();
					}

					this.setVariablesFormularioToObjetoActualDepreciaciones(this.depreciaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
				}

				if(this.depreciaciones.getnombre_detalle_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_detalle_grupo like '%"+this.depreciaciones.getnombre_detalle_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonclaveDepreciacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciaciones(this.getdepreciaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciaciones==null) {
						this.depreciaciones = new Depreciaciones();
					}

					this.setVariablesFormularioToObjetoActualDepreciaciones(this.depreciaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
				}

				if(this.depreciaciones.getclave()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where clave like '%"+this.depreciaciones.getclave()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreDepreciacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciaciones(this.getdepreciaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciaciones==null) {
						this.depreciaciones = new Depreciaciones();
					}

					this.setVariablesFormularioToObjetoActualDepreciaciones(this.depreciaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
				}

				if(this.depreciaciones.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.depreciaciones.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_compraDepreciacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciaciones(this.getdepreciaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciaciones==null) {
						this.depreciaciones = new Depreciaciones();
					}

					this.setVariablesFormularioToObjetoActualDepreciaciones(this.depreciaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
				}

				if(this.depreciaciones.getfecha_compra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_compra = '"+Funciones2.getStringPostgresDate(this.depreciaciones.getfecha_compra())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvida_utilDepreciacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciaciones(this.getdepreciaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciaciones==null) {
						this.depreciaciones = new Depreciaciones();
					}

					this.setVariablesFormularioToObjetoActualDepreciaciones(this.depreciaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
				}

				if(this.depreciaciones.getvida_util()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where vida_util = "+this.depreciaciones.getvida_util().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_de_compraDepreciacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciaciones(this.getdepreciaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciaciones==null) {
						this.depreciaciones = new Depreciaciones();
					}

					this.setVariablesFormularioToObjetoActualDepreciaciones(this.depreciaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
				}

				if(this.depreciaciones.getcosto_de_compra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_de_compra = "+this.depreciaciones.getcosto_de_compra().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_mantenimientoDepreciacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciaciones(this.getdepreciaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciaciones==null) {
						this.depreciaciones = new Depreciaciones();
					}

					this.setVariablesFormularioToObjetoActualDepreciaciones(this.depreciaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
				}

				if(this.depreciaciones.getfecha_mantenimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_mantenimiento = '"+Funciones2.getStringPostgresDate(this.depreciaciones.getfecha_mantenimiento())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_depreciacionDepreciacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciaciones(this.getdepreciaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciaciones==null) {
						this.depreciaciones = new Depreciaciones();
					}

					this.setVariablesFormularioToObjetoActualDepreciaciones(this.depreciaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
				}

				if(this.depreciaciones.getfecha_depreciacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_depreciacion = '"+Funciones2.getStringPostgresDate(this.depreciaciones.getfecha_depreciacion())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioDepreciacionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebDepreciaciones(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDepreciaciones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDepreciaciones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDepreciaciones(this.getdepreciaciones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.depreciacionesLogic.getConnexion());

				if(this.depreciaciones.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.depreciaciones.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDepreciaciones=(TitledBorder)this.jScrollPanelDatosDepreciaciones.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderDepreciaciones.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioDepreciacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciaciones(this.getdepreciaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciaciones==null) {
						this.depreciaciones = new Depreciaciones();
					}

					this.setVariablesFormularioToObjetoActualDepreciaciones(this.depreciaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
				}

				if(this.depreciaciones.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.depreciaciones.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesDepreciacionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebDepreciaciones(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDepreciaciones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDepreciaciones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDepreciaciones(this.getdepreciaciones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.depreciacionesLogic.getConnexion());

				if(this.depreciaciones.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.depreciaciones.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDepreciaciones=(TitledBorder)this.jScrollPanelDatosDepreciaciones.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderDepreciaciones.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesDepreciacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciaciones(this.getdepreciaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciaciones==null) {
						this.depreciaciones = new Depreciaciones();
					}

					this.setVariablesFormularioToObjetoActualDepreciaciones(this.depreciaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
				}

				if(this.depreciaciones.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.depreciaciones.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_acumuladoDepreciacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciaciones(this.getdepreciaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciaciones==null) {
						this.depreciaciones = new Depreciaciones();
					}

					this.setVariablesFormularioToObjetoActualDepreciaciones(this.depreciaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
				}

				if(this.depreciaciones.getvalor_acumulado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_acumulado = "+this.depreciaciones.getvalor_acumulado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_gastoDepreciacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciaciones(this.getdepreciaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciaciones==null) {
						this.depreciaciones = new Depreciaciones();
					}

					this.setVariablesFormularioToObjetoActualDepreciaciones(this.depreciaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);
				}

				if(this.depreciaciones.getvalor_gasto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_gasto = "+this.depreciaciones.getvalor_gasto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaDepreciacionesDepreciacionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDepreciaciones(false,false);

			this.getDepreciacionessBusquedaDepreciaciones();

			this.inicializarActualizarBindingDepreciaciones(false);

			//if(DepreciacionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDepreciaciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdAnioDepreciacionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDepreciaciones(false,false);

			this.getDepreciacionessFK_IdAnio();

			this.inicializarActualizarBindingDepreciaciones(false);

			//if(DepreciacionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDepreciaciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdAnioFinDepreciacionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDepreciaciones(false,false);

			this.getDepreciacionessFK_IdAnioFin();

			this.inicializarActualizarBindingDepreciaciones(false);

			//if(DepreciacionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDepreciaciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdAnioInicioDepreciacionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDepreciaciones(false,false);

			this.getDepreciacionessFK_IdAnioInicio();

			this.inicializarActualizarBindingDepreciaciones(false);

			//if(DepreciacionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDepreciaciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDepreciacionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDepreciaciones(false,false);

			this.getDepreciacionessFK_IdEmpresa();

			this.inicializarActualizarBindingDepreciaciones(false);

			//if(DepreciacionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDepreciaciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesDepreciacionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDepreciaciones(false,false);

			this.getDepreciacionessFK_IdMes();

			this.inicializarActualizarBindingDepreciaciones(false);

			//if(DepreciacionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDepreciaciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesFinDepreciacionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDepreciaciones(false,false);

			this.getDepreciacionessFK_IdMesFin();

			this.inicializarActualizarBindingDepreciaciones(false);

			//if(DepreciacionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDepreciaciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesInicioDepreciacionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDepreciaciones(false,false);

			this.getDepreciacionessFK_IdMesInicio();

			this.inicializarActualizarBindingDepreciaciones(false);

			//if(DepreciacionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDepreciaciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDepreciaciones() {
		if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
			this.jInternalFrameDetalleFormDepreciaciones.setVisible(false);	    			
			this.jInternalFrameDetalleFormDepreciaciones.dispose();
			this.jInternalFrameDetalleFormDepreciaciones=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDepreciaciones!=null) {
			this.jInternalFrameReporteDinamicoDepreciaciones.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDepreciaciones.dispose();
			this.jInternalFrameReporteDinamicoDepreciaciones=null;
		}
		
		if(this.jInternalFrameImportacionDepreciaciones!=null) {
			this.jInternalFrameImportacionDepreciaciones.setVisible(false);	    			
			this.jInternalFrameImportacionDepreciaciones.dispose();
			this.jInternalFrameImportacionDepreciaciones=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDepreciaciones();
			
			DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
			
			
			if(sTipo.equals("NuevoDepreciaciones")) {
				jButtonNuevoDepreciacionesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDepreciaciones")) {
				jButtonDuplicarDepreciacionesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDepreciaciones")) {
				jButtonCopiarDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("VerFormDepreciaciones")) {
				jButtonVerFormDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDepreciaciones")) {
				jButtonNuevoDepreciacionesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDepreciaciones")) {
				jButtonDuplicarDepreciacionesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDepreciaciones")) {
				jButtonNuevoDepreciacionesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDepreciaciones")) {
				jButtonDuplicarDepreciacionesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDepreciaciones")) {
				jButtonNuevoDepreciacionesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDepreciaciones")) {
				jButtonNuevoDepreciacionesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDepreciaciones")) {
				jButtonNuevoDepreciacionesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDepreciaciones")) {
				jButtonModificarDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDepreciaciones")) {
				jButtonModificarDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDepreciaciones")) {
				jButtonModificarDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDepreciaciones")) {
				jButtonActualizarDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDepreciaciones")) {
				jButtonActualizarDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDepreciaciones")) {
				jButtonActualizarDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("EliminarDepreciaciones")) {
				jButtonEliminarDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDepreciaciones")) {
				jButtonEliminarDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDepreciaciones")) {
				jButtonEliminarDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("CancelarDepreciaciones")) {
				jButtonCancelarDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDepreciaciones")) {
				jButtonCancelarDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDepreciaciones")) {
				jButtonCancelarDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("CerrarDepreciaciones")) {
				jButtonCerrarDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDepreciaciones")) {
				jButtonCerrarDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDepreciaciones")) {
				jButtonCerrarDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDepreciaciones")) {
				jButtonMostrarOcultarDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDepreciaciones")) {
				jButtonCancelarDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDepreciaciones")) {
				jButtonGuardarCambiosDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDepreciaciones")) {
				jButtonGuardarCambiosDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDepreciaciones")) {
				jButtonCopiarDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDepreciaciones")) {
				jButtonVerFormDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDepreciaciones")) {
				jButtonGuardarCambiosDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDepreciaciones")) {
				jButtonCopiarDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDepreciaciones")) {
				jButtonVerFormDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDepreciaciones")) {
				jButtonGuardarCambiosDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDepreciaciones")) {
				jButtonGuardarCambiosDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDepreciaciones")) {
				jButtonGuardarCambiosDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDepreciaciones")) {
				jButtonRecargarInformacionDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDepreciaciones")) {
				jButtonRecargarInformacionDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDepreciaciones")) {
				jButtonRecargarInformacionDepreciacionesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDepreciaciones")) {
				jButtonAnterioresDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDepreciaciones")) {
				jButtonAnterioresDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDepreciaciones")) {
				jButtonAnterioresDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDepreciaciones")) {
				jButtonSiguientesDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDepreciaciones")) {
				jButtonSiguientesDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDepreciaciones")) {
				jButtonSiguientesDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDepreciaciones") || sTipo.equals("MenuItemDetalleAbrirOrderByDepreciaciones")) {
				jButtonAbrirOrderByDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDepreciaciones") || sTipo.equals("MenuItemDetalleMostrarOcultarDepreciaciones")) {
				jButtonMostrarOcultarDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDepreciaciones")) {
				jButtonNuevoGuardarCambiosDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDepreciaciones")) {
				jButtonNuevoGuardarCambiosDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDepreciaciones")) {
				jButtonNuevoGuardarCambiosDepreciacionesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDepreciaciones")) {
				jButtonCerrarReporteDinamicoDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDepreciaciones")) {
				jButtonGenerarReporteDinamicoDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDepreciaciones")) {
				
				jButtonGenerarExcelReporteDinamicoDepreciacionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDepreciaciones")) {
				jButtonCerrarImportacionDepreciacionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDepreciaciones")) {
				
				jButtonGenerarImportacionDepreciacionesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDepreciaciones")) {
				
				jButtonAbrirImportacionDepreciacionesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDepreciaciones")) {
				jComboBoxTiposAccionesDepreciacionesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDepreciaciones")) {
				jComboBoxTiposRelacionesDepreciacionesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDepreciaciones")) {
				jComboBoxTiposAccionesDepreciacionesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDepreciaciones")) {
				
				jComboBoxTiposSeleccionarDepreciacionesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDepreciaciones")) {
				jTextFieldValorCampoGeneralDepreciacionesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDepreciaciones")) {
				jButtonAbrirOrderByDepreciacionesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDepreciaciones")) {
				jButtonAbrirOrderByDepreciacionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDepreciaciones")) {
				jButtonCerrarOrderByDepreciacionesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDepreciacionesBusqueda")) {
				this.jButtonidDepreciacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDepreciacionesUpdate")) {
				this.jButtonid_empresaDepreciacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDepreciacionesBusqueda")) {
				this.jButtonid_empresaDepreciacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anio_inicioDepreciacionesUpdate")) {
				this.jButtonid_anio_inicioDepreciacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anio_inicioDepreciacionesBusqueda")) {
				this.jButtonid_anio_inicioDepreciacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anio_finDepreciacionesUpdate")) {
				this.jButtonid_anio_finDepreciacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anio_finDepreciacionesBusqueda")) {
				this.jButtonid_anio_finDepreciacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mes_inicioDepreciacionesUpdate")) {
				this.jButtonid_mes_inicioDepreciacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mes_inicioDepreciacionesBusqueda")) {
				this.jButtonid_mes_inicioDepreciacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mes_finDepreciacionesUpdate")) {
				this.jButtonid_mes_finDepreciacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mes_finDepreciacionesBusqueda")) {
				this.jButtonid_mes_finDepreciacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_sub_grupoDepreciacionesBusqueda")) {
				this.jButtoncodigo_sub_grupoDepreciacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sub_grupoDepreciacionesBusqueda")) {
				this.jButtonnombre_sub_grupoDepreciacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_detalle_grupoDepreciacionesBusqueda")) {
				this.jButtoncodigo_detalle_grupoDepreciacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_detalle_grupoDepreciacionesBusqueda")) {
				this.jButtonnombre_detalle_grupoDepreciacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("claveDepreciacionesBusqueda")) {
				this.jButtonclaveDepreciacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreDepreciacionesBusqueda")) {
				this.jButtonnombreDepreciacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_compraDepreciacionesBusqueda")) {
				this.jButtonfecha_compraDepreciacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("vida_utilDepreciacionesBusqueda")) {
				this.jButtonvida_utilDepreciacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_de_compraDepreciacionesBusqueda")) {
				this.jButtoncosto_de_compraDepreciacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_mantenimientoDepreciacionesBusqueda")) {
				this.jButtonfecha_mantenimientoDepreciacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_depreciacionDepreciacionesBusqueda")) {
				this.jButtonfecha_depreciacionDepreciacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioDepreciacionesUpdate")) {
				this.jButtonid_anioDepreciacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioDepreciacionesBusqueda")) {
				this.jButtonid_anioDepreciacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesDepreciacionesUpdate")) {
				this.jButtonid_mesDepreciacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesDepreciacionesBusqueda")) {
				this.jButtonid_mesDepreciacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_acumuladoDepreciacionesBusqueda")) {
				this.jButtonvalor_acumuladoDepreciacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_gastoDepreciacionesBusqueda")) {
				this.jButtonvalor_gastoDepreciacionesBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaDepreciacionesDepreciaciones")) {
				this.jButtonBusquedaDepreciacionesDepreciacionesActionPerformed(evt);
			}
			
			;
			
			
			DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDepreciaciones();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDepreciacionesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depreciaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depreciaciones);
				
				DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
				
				


				
				DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Depreciaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Depreciaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Depreciaciones depreciacionesLocal=null;
			
			if(!this.getEsControlTabla()) {
				depreciacionesLocal=this.depreciaciones;
			} else {
				depreciacionesLocal=this.depreciacionesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depreciaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depreciaciones);
				
				DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
							
				
				


				
				DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Depreciaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Depreciaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDepreciacionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesAnterior =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.depreciacionesAnterior =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
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
			
			DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
			
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
			
			


			
			DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDepreciacionesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depreciaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depreciaciones);
				
				DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
								
						
				


				
				DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Depreciaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Depreciaciones.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depreciaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depreciaciones);
				
				DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
								
				
				


				
				DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Depreciaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Depreciaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDepreciacionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesAnterior =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.depreciacionesAnterior =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depreciaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depreciaciones);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDepreciacionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesAnterior =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.depreciacionesAnterior =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDepreciacionesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.depreciaciones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.depreciaciones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depreciaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depreciaciones);
				
				DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
							
				
				


				
				DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Depreciaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Depreciaciones.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDepreciacionesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciacionesAnterior =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.depreciacionesAnterior =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
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
			
			DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
			
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
			
			


			
			DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDepreciacionesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.depreciaciones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.depreciaciones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depreciaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depreciaciones);
				
				DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
								
				
				


				
				DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Depreciaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Depreciaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDepreciacionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesAnterior =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.depreciacionesAnterior =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDepreciacionesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.depreciaciones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.depreciaciones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDepreciacionesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depreciaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depreciaciones);
				
				DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDepreciaciones")) {
					jCheckBoxSeleccionarTodosDepreciacionesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDepreciaciones")) {
					jCheckBoxSeleccionadosDepreciacionesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDepreciaciones")) {
					
				}
				
				


				
				
				DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Depreciaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Depreciaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.depreciaciones);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.depreciaciones);
				
				DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
												
				
				


				
				
				DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Depreciaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Depreciaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDepreciacionesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciacionesAnterior =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.depreciacionesAnterior =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDepreciacionesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depreciaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depreciaciones);
				
				DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
				
				
				DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
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
			
			DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
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
			
			


			
			DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDepreciacionesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depreciaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depreciaciones);
				
				DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Depreciaciones.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Depreciaciones.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depreciaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depreciaciones);
				
				DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
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
				
				


				
				DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Depreciaciones.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Depreciaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDepreciacionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionesAnterior =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.depreciacionesAnterior =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDepreciaciones")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDepreciacionesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDepreciaciones.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.depreciaciones =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.depreciaciones =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.depreciaciones);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDepreciaciones")) {
				
				}
				
				DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDepreciaciones")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDepreciaciones.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDepreciaciones")) {
			
			}
			
			DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDepreciaciones();
			
			DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
			
			if(sTipo.equals("NuevoDepreciaciones")) {
				jButtonNuevoDepreciacionesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDepreciaciones")) {
				jButtonDuplicarDepreciacionesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDepreciaciones")) {
				jButtonCopiarDepreciacionesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDepreciaciones")) {
				jButtonVerFormDepreciacionesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDepreciaciones")) {
				jButtonNuevoDepreciacionesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDepreciaciones")) {
				jButtonModificarDepreciacionesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDepreciaciones")) {
				jButtonActualizarDepreciacionesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDepreciaciones")) {
				jButtonEliminarDepreciacionesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDepreciaciones")) {
				jButtonGuardarCambiosDepreciacionesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDepreciaciones")) {
				jButtonCancelarDepreciacionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDepreciaciones")) {
				jButtonCerrarDepreciacionesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDepreciaciones")) {
				jButtonGuardarCambiosDepreciacionesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDepreciaciones")) {
				jButtonNuevoGuardarCambiosDepreciacionesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDepreciaciones")) {
				jButtonAbrirOrderByDepreciacionesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDepreciaciones")) {
				jButtonRecargarInformacionDepreciacionesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDepreciaciones")) {
				jButtonAnterioresDepreciacionesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDepreciaciones")) {
				jButtonSiguientesDepreciacionesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDepreciacionesBusqueda")) {
				this.jButtonidDepreciacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDepreciacionesUpdate")) {
				this.jButtonid_empresaDepreciacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDepreciacionesBusqueda")) {
				this.jButtonid_empresaDepreciacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anio_inicioDepreciacionesUpdate")) {
				this.jButtonid_anio_inicioDepreciacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anio_inicioDepreciacionesBusqueda")) {
				this.jButtonid_anio_inicioDepreciacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anio_finDepreciacionesUpdate")) {
				this.jButtonid_anio_finDepreciacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anio_finDepreciacionesBusqueda")) {
				this.jButtonid_anio_finDepreciacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mes_inicioDepreciacionesUpdate")) {
				this.jButtonid_mes_inicioDepreciacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mes_inicioDepreciacionesBusqueda")) {
				this.jButtonid_mes_inicioDepreciacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mes_finDepreciacionesUpdate")) {
				this.jButtonid_mes_finDepreciacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mes_finDepreciacionesBusqueda")) {
				this.jButtonid_mes_finDepreciacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_sub_grupoDepreciacionesBusqueda")) {
				this.jButtoncodigo_sub_grupoDepreciacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sub_grupoDepreciacionesBusqueda")) {
				this.jButtonnombre_sub_grupoDepreciacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_detalle_grupoDepreciacionesBusqueda")) {
				this.jButtoncodigo_detalle_grupoDepreciacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_detalle_grupoDepreciacionesBusqueda")) {
				this.jButtonnombre_detalle_grupoDepreciacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("claveDepreciacionesBusqueda")) {
				this.jButtonclaveDepreciacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreDepreciacionesBusqueda")) {
				this.jButtonnombreDepreciacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_compraDepreciacionesBusqueda")) {
				this.jButtonfecha_compraDepreciacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("vida_utilDepreciacionesBusqueda")) {
				this.jButtonvida_utilDepreciacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_de_compraDepreciacionesBusqueda")) {
				this.jButtoncosto_de_compraDepreciacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_mantenimientoDepreciacionesBusqueda")) {
				this.jButtonfecha_mantenimientoDepreciacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_depreciacionDepreciacionesBusqueda")) {
				this.jButtonfecha_depreciacionDepreciacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioDepreciacionesUpdate")) {
				this.jButtonid_anioDepreciacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioDepreciacionesBusqueda")) {
				this.jButtonid_anioDepreciacionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesDepreciacionesUpdate")) {
				this.jButtonid_mesDepreciacionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesDepreciacionesBusqueda")) {
				this.jButtonid_mesDepreciacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_acumuladoDepreciacionesBusqueda")) {
				this.jButtonvalor_acumuladoDepreciacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_gastoDepreciacionesBusqueda")) {
				this.jButtonvalor_gastoDepreciacionesBusquedaActionPerformed(evt);
			}
			
			DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDepreciaciones();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDepreciaciones")) {
				closingInternalFrameDepreciaciones();
				
			} else if(sTipo.equals("jButtonCancelarDepreciaciones")) {
				JInternalFrameBase jInternalFrameDetalleFormDepreciaciones = (JInternalFrameBase)evt.getSource();
	            	
	            DepreciacionesBeanSwingJInternalFrame jInternalFrameParent=(DepreciacionesBeanSwingJInternalFrame)jInternalFrameDetalleFormDepreciaciones.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDepreciacionesActionPerformed(null);
			}
			
			DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.depreciaciones,new Object(),this.depreciacionesParameterGeneral,this.depreciacionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDepreciaciones(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDepreciaciones(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDepreciaciones(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.depreciaciones)) {
			if(!esControlTabla) {
				if(DepreciacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDepreciaciones(this.depreciaciones,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);			
				}
				
				if(this.depreciacionesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDepreciaciones(this.depreciaciones,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDepreciaciones(this.depreciacionesReturnGeneral,this.depreciacionesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.depreciacionesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDepreciaciones(classes,this.depreciacionesReturnGeneral,this.depreciacionesBean,false);
					}
						
					if(this.depreciacionesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDepreciaciones(this.depreciacionesReturnGeneral.getDepreciaciones());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDepreciaciones(this.depreciacionesReturnGeneral.getDepreciaciones());	
					}
						
					if(this.depreciacionesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDepreciaciones(this.depreciacionesReturnGeneral.getDepreciaciones(),classes);//this.depreciacionesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDepreciaciones(this.depreciaciones,classes);//this.depreciacionesBean);									
				}
			
				if(DepreciacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDepreciaciones(this.depreciaciones,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciaciones(this.depreciaciones);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.depreciacionesAnterior!=null) {
						this.depreciaciones=this.depreciacionesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.depreciacionesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.depreciacionesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.depreciacionesReturnGeneral.getDepreciaciones(),depreciacionesLogic.getDepreciacioness());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.depreciacionesReturnGeneral.getDepreciaciones(),this.depreciacioness);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDepreciaciones.repaint();
				
				//((AbstractTableModel) this.jTableDatosDepreciaciones.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDepreciaciones();
			}
		}
	}
	
	public void actualizarVisualTableDatosDepreciaciones() throws Exception {
		
		DepreciacionesModel depreciacionesModel=(DepreciacionesModel)this.jTableDatosDepreciaciones.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			depreciacionesModel.depreciacioness=this.depreciacionesLogic.getDepreciacioness();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			depreciacionesModel.depreciacioness=this.depreciacioness;
		}
		
		
		((DepreciacionesModel) this.jTableDatosDepreciaciones.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDepreciaciones() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdepreciacionesAnterior(),this.depreciacionesLogic.getDepreciacioness());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdepreciacionesAnterior(),this.depreciacioness);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDepreciaciones();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDepreciaciones(Depreciaciones depreciaciones,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
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
										
				DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.depreciaciones,new Object(),generalEntityParameterGeneral,this.depreciacionesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.depreciacionesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DepreciacionesConstantesFunciones.getClassesRelationshipsOfDepreciaciones(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DepreciacionesConstantesFunciones.getClassesRelationshipsFromStringsOfDepreciaciones(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDepreciaciones(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DepreciacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.depreciaciones,new Object(),generalEntityParameterGeneral,this.depreciacionesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDepreciaciones(DepreciacionesBean depreciacionesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDepreciaciones(ArrayList<Classe> classes,DepreciacionesReturnGeneral depreciacionesReturnGeneral,DepreciacionesBean depreciacionesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDepreciaciones(Depreciaciones depreciaciones,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.depreciaciones)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDepreciaciones = new DepreciacionesDetalleFormJInternalFrame(jDesktopPane,this.depreciacionesSessionBean.getConGuardarRelaciones(),this.depreciacionesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.setVisible(false);
		this.jInternalFrameDetalleFormDepreciaciones.setSelected(false);						
		
		this.jInternalFrameDetalleFormDepreciaciones.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDepreciaciones.depreciacionesLogic=this.depreciacionesLogic;
		
		this.cargarCombosFrameForeignKeyDepreciaciones("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDepreciaciones();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDepreciaciones();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDepreciaciones("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDepreciaciones();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDepreciaciones.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDepreciaciones"));
		
		this.jInternalFrameDetalleFormDepreciaciones.jButtonModificarDepreciaciones.addActionListener(new ButtonActionListener(this,"ModificarDepreciaciones"));

		
		this.jInternalFrameDetalleFormDepreciaciones.jButtonModificarToolBarDepreciaciones.addActionListener(new ButtonActionListener(this,"ModificarToolBarDepreciaciones"));
					
		this.jInternalFrameDetalleFormDepreciaciones.jMenuItemModificarDepreciaciones.addActionListener(new ButtonActionListener(this,"MenuItemModificarDepreciaciones"));		
		
		
		
		this.jInternalFrameDetalleFormDepreciaciones.jButtonActualizarDepreciaciones.addActionListener (new ButtonActionListener(this,"ActualizarDepreciaciones"));
		
		
		this.jInternalFrameDetalleFormDepreciaciones.jButtonActualizarToolBarDepreciaciones.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDepreciaciones"));
						
		this.jInternalFrameDetalleFormDepreciaciones.jMenuItemActualizarDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDepreciaciones"));		
		
		
		
		this.jInternalFrameDetalleFormDepreciaciones.jButtonEliminarDepreciaciones.addActionListener (new ButtonActionListener(this,"EliminarDepreciaciones"));
		
		
		this.jInternalFrameDetalleFormDepreciaciones.jButtonEliminarToolBarDepreciaciones.addActionListener (new ButtonActionListener(this,"EliminarToolBarDepreciaciones"));
								
		this.jInternalFrameDetalleFormDepreciaciones.jMenuItemEliminarDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDepreciaciones"));		
		
		
		
		this.jInternalFrameDetalleFormDepreciaciones.jButtonCancelarDepreciaciones.addActionListener (new ButtonActionListener(this,"CancelarDepreciaciones"));
		
		
		this.jInternalFrameDetalleFormDepreciaciones.jButtonCancelarToolBarDepreciaciones.addActionListener (new ButtonActionListener(this,"CancelarToolBarDepreciaciones"));
					
		this.jInternalFrameDetalleFormDepreciaciones.jMenuItemCancelarDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDepreciaciones"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDepreciaciones.jMenuItemDetalleCerrarDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDepreciaciones"));		
		
		
		
		this.jInternalFrameDetalleFormDepreciaciones.jButtonGuardarCambiosToolBarDepreciaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDepreciaciones"));
		
		
		
		this.jInternalFrameDetalleFormDepreciaciones.jButtonGuardarCambiosToolBarDepreciaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDepreciaciones"));
		
		
		
		this.jInternalFrameDetalleFormDepreciaciones.jComboBoxTiposAccionesFormularioDepreciaciones.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDepreciaciones"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonidDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"idDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_empresaDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_empresaDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_anio_inicioDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_anio_inicioDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_anio_inicioDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_anio_inicioDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_anio_finDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_anio_finDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_anio_finDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_anio_finDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_mes_inicioDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_mes_inicioDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_mes_inicioDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_mes_inicioDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_mes_finDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_mes_finDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_mes_finDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_mes_finDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtoncodigo_sub_grupoDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sub_grupoDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonnombre_sub_grupoDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sub_grupoDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtoncodigo_detalle_grupoDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_detalle_grupoDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonnombre_detalle_grupoDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_detalle_grupoDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonclaveDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"claveDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonnombreDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"nombreDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonfecha_compraDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_compraDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonvida_utilDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"vida_utilDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtoncosto_de_compraDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"costo_de_compraDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonfecha_mantenimientoDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_mantenimientoDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonfecha_depreciacionDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_depreciacionDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_anioDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_anioDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_anioDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_anioDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_mesDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_mesDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_mesDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_mesDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonvalor_acumuladoDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"valor_acumuladoDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonvalor_gastoDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"valor_gastoDepreciacionesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDepreciaciones.jTabbedPaneRelacionesDepreciaciones.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDepreciaciones"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDepreciaciones"));
		
		if(this.jInternalFrameDetalleFormDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepreciaciones.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDepreciaciones"));
		}
		
		this.jTableDatosDepreciaciones.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDepreciaciones"));
		
		this.jTableDatosDepreciaciones.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDepreciaciones"));
		
		this.jButtonNuevoDepreciaciones.addActionListener(new ButtonActionListener(this,"NuevoDepreciaciones"));
		
		this.jButtonDuplicarDepreciaciones.addActionListener(new ButtonActionListener(this,"DuplicarDepreciaciones"));
		
		this.jButtonCopiarDepreciaciones.addActionListener(new ButtonActionListener(this,"CopiarDepreciaciones"));
		
		this.jButtonVerFormDepreciaciones.addActionListener(new ButtonActionListener(this,"VerFormDepreciaciones"));
		
		
		this.jButtonNuevoToolBarDepreciaciones.addActionListener(new ButtonActionListener(this,"NuevoToolBarDepreciaciones"));
			
		this.jButtonDuplicarToolBarDepreciaciones.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDepreciaciones"));
			
		this.jMenuItemNuevoDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDepreciaciones"));
			
		this.jMenuItemDuplicarDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDepreciaciones"));		
		
		
		this.jButtonNuevoRelacionesDepreciaciones.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDepreciaciones"));
		
		
		this.jButtonNuevoRelacionesToolBarDepreciaciones.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDepreciaciones"));
			
		this.jMenuItemNuevoRelacionesDepreciaciones.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDepreciaciones"));		
		
		
		if(this.jInternalFrameDetalleFormDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepreciaciones.jButtonModificarDepreciaciones.addActionListener(new ButtonActionListener(this,"ModificarDepreciaciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepreciaciones.jButtonModificarToolBarDepreciaciones.addActionListener(new ButtonActionListener(this,"ModificarToolBarDepreciaciones"));
			
			this.jInternalFrameDetalleFormDepreciaciones.jMenuItemModificarDepreciaciones.addActionListener(new ButtonActionListener(this,"MenuItemModificarDepreciaciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDepreciaciones!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDepreciaciones.jButtonActualizarDepreciaciones.addActionListener (new ButtonActionListener(this,"ActualizarDepreciaciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepreciaciones.jButtonActualizarToolBarDepreciaciones.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDepreciaciones"));
				
			this.jInternalFrameDetalleFormDepreciaciones.jMenuItemActualizarDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDepreciaciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepreciaciones.jButtonEliminarDepreciaciones.addActionListener (new ButtonActionListener(this,"EliminarDepreciaciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepreciaciones.jButtonEliminarToolBarDepreciaciones.addActionListener (new ButtonActionListener(this,"EliminarToolBarDepreciaciones"));
						
			this.jInternalFrameDetalleFormDepreciaciones.jMenuItemEliminarDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDepreciaciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepreciaciones.jButtonCancelarDepreciaciones.addActionListener (new ButtonActionListener(this,"CancelarDepreciaciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepreciaciones.jButtonCancelarToolBarDepreciaciones.addActionListener (new ButtonActionListener(this,"CancelarToolBarDepreciaciones"));
			
			this.jInternalFrameDetalleFormDepreciaciones.jMenuItemCancelarDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDepreciaciones"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDepreciaciones.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDepreciaciones"));		
		
		
		this.jButtonCerrarDepreciaciones.addActionListener (new ButtonActionListener(this,"CerrarDepreciaciones"));
		
		
		this.jButtonCerrarToolBarDepreciaciones.addActionListener (new ButtonActionListener(this,"CerrarToolBarDepreciaciones"));
			
		this.jMenuItemCerrarDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDepreciaciones"));
			
		if(this.jInternalFrameDetalleFormDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepreciaciones.jMenuItemDetalleCerrarDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDepreciaciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepreciaciones.jButtonGuardarCambiosDepreciaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosDepreciaciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepreciaciones.jButtonGuardarCambiosToolBarDepreciaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDepreciaciones"));
		}
		
		this.jButtonCopiarToolBarDepreciaciones.addActionListener (new ButtonActionListener(this,"CopiarToolBarDepreciaciones"));
			
		this.jButtonVerFormToolBarDepreciaciones.addActionListener (new ButtonActionListener(this,"VerFormToolBarDepreciaciones"));
		
		this.jMenuItemGuardarCambiosDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDepreciaciones"));
			
		this.jMenuItemCopiarDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDepreciaciones"));		
		
		this.jMenuItemVerFormDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDepreciaciones"));		
		
		
		this.jButtonGuardarCambiosTablaDepreciaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDepreciaciones"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDepreciaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDepreciaciones"));
			
		this.jMenuItemGuardarCambiosTablaDepreciaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDepreciaciones"));		
		
		
		
		this.jButtonRecargarInformacionDepreciaciones.addActionListener (new ButtonActionListener(this,"RecargarInformacionDepreciaciones"));
					
		this.jButtonRecargarInformacionToolBarDepreciaciones.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDepreciaciones"));
		
		this.jMenuItemRecargarInformacionDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDepreciaciones"));		
		
		
		
		this.jButtonAnterioresDepreciaciones.addActionListener (new ButtonActionListener(this,"AnterioresDepreciaciones"));
		
		
		this.jButtonAnterioresToolBarDepreciaciones.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDepreciaciones"));
		
		this.jMenuItemAnterioresDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDepreciaciones"));		
		
		
		this.jButtonSiguientesDepreciaciones.addActionListener (new ButtonActionListener(this,"SiguientesDepreciaciones"));
		
		
		this.jButtonSiguientesToolBarDepreciaciones.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDepreciaciones"));
			
		this.jMenuItemSiguientesDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDepreciaciones"));
			
		this.jMenuItemAbrirOrderByDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDepreciaciones"));
			
		this.jMenuItemMostrarOcultarDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDepreciaciones"));
			
		this.jMenuItemDetalleAbrirOrderByDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDepreciaciones"));
			
		this.jMenuItemDetalleMostarOcultarDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDepreciaciones"));		
		
		
		this.jButtonNuevoGuardarCambiosDepreciaciones.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDepreciaciones"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDepreciaciones.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDepreciaciones"));
			
		this.jMenuItemNuevoGuardarCambiosDepreciaciones.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDepreciaciones"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDepreciaciones.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDepreciaciones"));

		this.jCheckBoxSeleccionadosDepreciaciones.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDepreciaciones"));
		
		if(this.jInternalFrameDetalleFormDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepreciaciones.jComboBoxTiposAccionesFormularioDepreciaciones.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDepreciaciones"));
		}
		
		
		this.jComboBoxTiposRelacionesDepreciaciones.addActionListener (new ButtonActionListener(this,"TiposRelacionesDepreciaciones"));
			
		this.jComboBoxTiposAccionesDepreciaciones.addActionListener (new ButtonActionListener(this,"TiposAccionesDepreciaciones"));
					
		this.jComboBoxTiposSeleccionarDepreciaciones.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDepreciaciones"));
			
		this.jTextFieldValorCampoGeneralDepreciaciones.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDepreciaciones"));		
		
		
		if(this.jInternalFrameDetalleFormDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonidDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"idDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_empresaDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_empresaDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_anio_inicioDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_anio_inicioDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_anio_inicioDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_anio_inicioDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_anio_finDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_anio_finDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_anio_finDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_anio_finDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_mes_inicioDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_mes_inicioDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_mes_inicioDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_mes_inicioDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_mes_finDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_mes_finDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_mes_finDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_mes_finDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtoncodigo_sub_grupoDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sub_grupoDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonnombre_sub_grupoDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sub_grupoDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtoncodigo_detalle_grupoDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_detalle_grupoDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonnombre_detalle_grupoDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_detalle_grupoDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonclaveDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"claveDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonnombreDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"nombreDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonfecha_compraDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_compraDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonvida_utilDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"vida_utilDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtoncosto_de_compraDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"costo_de_compraDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonfecha_mantenimientoDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_mantenimientoDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonfecha_depreciacionDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_depreciacionDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_anioDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_anioDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_anioDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_anioDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_mesDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_mesDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_mesDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_mesDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonvalor_acumuladoDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"valor_acumuladoDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonvalor_gastoDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"valor_gastoDepreciacionesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaDepreciacionesDepreciaciones.addActionListener(new ButtonActionListener(this,"BusquedaDepreciacionesDepreciaciones"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDepreciaciones!=null) {
				this.jInternalFrameReporteDinamicoDepreciaciones.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDepreciaciones"));
				this.jInternalFrameReporteDinamicoDepreciaciones.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDepreciaciones"));
				this.jInternalFrameReporteDinamicoDepreciaciones.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDepreciaciones"));
			}
			
			//this.jButtonCerrarReporteDinamicoDepreciaciones.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDepreciaciones"));				
			//this.jButtonGenerarReporteDinamicoDepreciaciones.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDepreciaciones"));
			//this.jButtonGenerarExcelReporteDinamicoDepreciaciones.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDepreciaciones"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDepreciaciones!=null) {
				this.jInternalFrameImportacionDepreciaciones.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDepreciaciones"));
				this.jInternalFrameImportacionDepreciaciones.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDepreciaciones"));
				this.jInternalFrameImportacionDepreciaciones.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDepreciaciones"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDepreciaciones.addActionListener (new ButtonActionListener(this,"AbrirOrderByDepreciaciones"));
			
			this.jButtonAbrirOrderByToolBarDepreciaciones.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDepreciaciones"));			
			
			if(this.jInternalFrameOrderByDepreciaciones!=null) {
				this.jInternalFrameOrderByDepreciaciones.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDepreciaciones"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDepreciaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepreciaciones.jTabbedPaneRelacionesDepreciaciones.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDepreciaciones"));
		
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
            		closingInternalFrameDepreciaciones();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDepreciaciones.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDepreciaciones = (JInternalFrameBase)event.getSource();
	            	
	            DepreciacionesBeanSwingJInternalFrame jInternalFrameParent=(DepreciacionesBeanSwingJInternalFrame)jInternalFrameDetalleFormDepreciaciones.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDepreciacionesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDepreciaciones.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDepreciacionesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDepreciaciones.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDepreciaciones.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDepreciacionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDepreciacionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDepreciacionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDepreciaciones";
		inputMap = this.jButtonNuevoDepreciaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDepreciaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDepreciacionesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDepreciacionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDepreciacionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDepreciacionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDepreciaciones";
		inputMap = this.jButtonNuevoRelacionesDepreciaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDepreciaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDepreciacionesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDepreciaciones";
		inputMap = this.jButtonModificarDepreciaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDepreciaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDepreciacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDepreciaciones";
		inputMap = this.jButtonActualizarDepreciaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDepreciaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDepreciacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDepreciaciones";
		inputMap = this.jButtonEliminarDepreciaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDepreciaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDepreciacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDepreciaciones";
		inputMap = this.jButtonCancelarDepreciaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDepreciaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDepreciacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDepreciaciones";
		inputMap = this.jButtonCerrarDepreciaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDepreciaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDepreciacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDepreciaciones.jButtonGuardarCambiosDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDepreciaciones";
		inputMap = this.jInternalFrameDetalleFormDepreciaciones.jButtonGuardarCambiosDepreciaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDepreciaciones.jButtonGuardarCambiosDepreciaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDepreciacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDepreciaciones.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDepreciacionesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDepreciaciones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDepreciacionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDepreciaciones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDepreciacionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDepreciaciones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDepreciacionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonidDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"idDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_empresaDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_empresaDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_anio_inicioDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_anio_inicioDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_anio_inicioDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_anio_inicioDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_anio_finDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_anio_finDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_anio_finDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_anio_finDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_mes_inicioDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_mes_inicioDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_mes_inicioDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_mes_inicioDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_mes_finDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_mes_finDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_mes_finDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_mes_finDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtoncodigo_sub_grupoDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sub_grupoDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonnombre_sub_grupoDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sub_grupoDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtoncodigo_detalle_grupoDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_detalle_grupoDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonnombre_detalle_grupoDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_detalle_grupoDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonclaveDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"claveDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonnombreDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"nombreDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonfecha_compraDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_compraDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonvida_utilDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"vida_utilDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtoncosto_de_compraDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"costo_de_compraDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonfecha_mantenimientoDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_mantenimientoDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonfecha_depreciacionDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_depreciacionDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_anioDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_anioDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_anioDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_anioDepreciacionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_mesDepreciacionesUpdate.addActionListener(new ButtonActionListener(this,"id_mesDepreciacionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonid_mesDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"id_mesDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonvalor_acumuladoDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"valor_acumuladoDepreciacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciaciones.jButtonvalor_gastoDepreciacionesBusqueda.addActionListener(new ButtonActionListener(this,"valor_gastoDepreciacionesBusqueda"));
		
		
		this.jButtonBusquedaDepreciacionesDepreciaciones.addActionListener(new ButtonActionListener(this,"BusquedaDepreciacionesDepreciaciones"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDepreciaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDepreciacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDepreciacionesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDepreciaciones.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDepreciaciones(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Depreciaciones depreciacionesAux:this.depreciacionesLogic.getDepreciacioness()) {
					depreciacionesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Depreciaciones depreciacionesAux:depreciacioness) {
					depreciacionesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDepreciacionesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDepreciaciones(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Depreciaciones depreciacionesAux:this.depreciacionesLogic.getDepreciacioness()) {
						depreciacionesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Depreciaciones depreciacionesAux:depreciacioness) {
						depreciacionesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Depreciaciones depreciacionesAux:this.depreciacionesLogic.getDepreciacioness()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Depreciaciones depreciacionesAux:depreciacioness) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDepreciaciones(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDepreciaciones.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDepreciaciones.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDepreciaciones,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDepreciacionesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDepreciaciones(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDepreciaciones.getSelectedRows();
			
			Depreciaciones depreciacionesLocal=new Depreciaciones();
			
			//this.seleccionarTodosDepreciaciones(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					depreciacionesLocal =(Depreciaciones) this.depreciacionesLogic.getDepreciacioness().toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					depreciacionesLocal =(Depreciaciones) this.depreciacioness.toArray()[this.jTableDatosDepreciaciones.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				depreciacionesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Depreciaciones depreciacionesAux:this.depreciacionesLogic.getDepreciacioness()) {
						depreciacionesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Depreciaciones depreciacionesAux:depreciacioness) {
						depreciacionesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDepreciaciones(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDepreciaciones.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDepreciaciones.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDepreciaciones,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDepreciacionesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDepreciacionesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDepreciacionesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDepreciaciones(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDepreciaciones.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Depreciaciones depreciacionesAux:this.depreciacionesLogic.getDepreciacioness()) {
				
						if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_CODIGOSUBGRUPO)) {
							existe=true;
							depreciacionesAux.setcodigo_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_NOMBRESUBGRUPO)) {
							existe=true;
							depreciacionesAux.setnombre_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_CODIGODETALLEGRUPO)) {
							existe=true;
							depreciacionesAux.setcodigo_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO)) {
							existe=true;
							depreciacionesAux.setnombre_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_CLAVE)) {
							existe=true;
							depreciacionesAux.setclave(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							depreciacionesAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_FECHACOMPRA)) {
							existe=true;
							depreciacionesAux.setfecha_compra(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_VIDAUTIL)) {
							existe=true;
							depreciacionesAux.setvida_util(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_COSTODECOMPRA)) {
							existe=true;
							depreciacionesAux.setcosto_de_compra(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_FECHAMANTENIMIENTO)) {
							existe=true;
							depreciacionesAux.setfecha_mantenimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_FECHADEPRECIACION)) {
							existe=true;
							depreciacionesAux.setfecha_depreciacion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_VALORACUMULADO)) {
							existe=true;
							depreciacionesAux.setvalor_acumulado(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_VALORGASTO)) {
							existe=true;
							depreciacionesAux.setvalor_gasto(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Depreciaciones depreciacionesAux:depreciacioness) {
					
						if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_CODIGOSUBGRUPO)) {
							existe=true;
							depreciacionesAux.setcodigo_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_NOMBRESUBGRUPO)) {
							existe=true;
							depreciacionesAux.setnombre_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_CODIGODETALLEGRUPO)) {
							existe=true;
							depreciacionesAux.setcodigo_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO)) {
							existe=true;
							depreciacionesAux.setnombre_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_CLAVE)) {
							existe=true;
							depreciacionesAux.setclave(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							depreciacionesAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_FECHACOMPRA)) {
							existe=true;
							depreciacionesAux.setfecha_compra(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_VIDAUTIL)) {
							existe=true;
							depreciacionesAux.setvida_util(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_COSTODECOMPRA)) {
							existe=true;
							depreciacionesAux.setcosto_de_compra(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_FECHAMANTENIMIENTO)) {
							existe=true;
							depreciacionesAux.setfecha_mantenimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_FECHADEPRECIACION)) {
							existe=true;
							depreciacionesAux.setfecha_depreciacion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_VALORACUMULADO)) {
							existe=true;
							depreciacionesAux.setvalor_acumulado(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_VALORGASTO)) {
							existe=true;
							depreciacionesAux.setvalor_gasto(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDepreciaciones(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDepreciacionesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDepreciaciones(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDepreciaciones=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDepreciaciones.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDepreciaciones.jComboBoxTiposAccionesFormularioDepreciaciones.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDepreciaciones) {				
					conSplash=true;//false;										
					
					//this.startProcessDepreciaciones(conSplash);
				
					this.generarReporteDepreciacionessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDepreciaciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDepreciaciones.jComboBoxTiposAccionesFormularioDepreciaciones.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDepreciacionessSeleccionados();
				//this.jComboBoxTiposAccionesDepreciaciones.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDepreciacionessSeleccionados(false);
				//this.jComboBoxTiposAccionesDepreciaciones.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDepreciacionessSeleccionados(true);
				//this.jComboBoxTiposAccionesDepreciaciones.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDepreciaciones();
				
				this.exportarDepreciacionessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDepreciaciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDepreciaciones.jComboBoxTiposAccionesFormularioDepreciaciones.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDepreciacioness();
				//this.importarDepreciacioness();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDepreciaciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDepreciaciones.jComboBoxTiposAccionesFormularioDepreciaciones.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDepreciaciones();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDepreciacionessSeleccionados();
				//this.jComboBoxTiposAccionesDepreciaciones.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Depreciaciones", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDepreciaciones();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDepreciaciones)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDepreciaciones(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Depreciaciones",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDepreciaciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDepreciaciones.jComboBoxTiposAccionesFormularioDepreciaciones.setSelectedIndex(0);					
				}	
			} 			
			else if(DepreciacionesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDepreciaciones) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDepreciaciones(conSplash);
					
						//this.actualizarParametrosGeneralDepreciaciones();
						
						this.generarReporteProcesoAccionDepreciacionessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDepreciaciones.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDepreciaciones.jComboBoxTiposAccionesFormularioDepreciaciones.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DepreciacionesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO DepreciacionesES SELECCIONADOS?", "MANTENIMIENTO DE Depreciaciones", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDepreciaciones();
				
						this.actualizarParametrosGeneralDepreciaciones();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.depreciacionesReturnGeneral=depreciacionesLogic.procesarAccionDepreciacionessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.depreciacionesLogic.getDepreciacioness(),this.depreciacionesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDepreciacionesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDepreciaciones.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDepreciaciones.jComboBoxTiposAccionesFormularioDepreciaciones.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDepreciaciones();
					
					DepreciacionesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDepreciacionesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDepreciaciones.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDepreciaciones.jComboBoxTiposAccionesFormularioDepreciaciones.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDepreciaciones(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDepreciacionesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDepreciaciones();
			
			if(this.jInternalFrameDetalleFormDepreciaciones==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Depreciaciones> depreciacionessSeleccionados=new ArrayList<Depreciaciones>();		
			Depreciaciones depreciaciones=new Depreciaciones();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDepreciaciones(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDepreciaciones.getSelectedItem();
			
			
			
			
			depreciacionessSeleccionados=this.getDepreciacionessSeleccionados(true);
			//this.sTipoAccion;
			
			if(depreciacionessSeleccionados.size()==1) {
				for(Depreciaciones depreciacionesAux:depreciacionessSeleccionados) {
					depreciaciones=depreciacionesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDepreciaciones();
			
      		//this.finishProcessDepreciaciones(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDepreciacionesReturnGeneral() throws Exception {
		if(this.depreciacionesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.depreciacionesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.depreciacionesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.depreciacionesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.depreciacionesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.depreciacionesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDepreciaciones(false);
		}
		
		if(this.depreciacionesReturnGeneral.getConRetornoLista() || this.depreciacionesReturnGeneral.getConRetornoObjeto()) {
			if(this.depreciacionesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.depreciacionesLogic.setDepreciacioness(this.depreciacionesReturnGeneral.getDepreciacioness());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingDepreciaciones(false);
		}
	}
	
	public void actualizarParametrosGeneralDepreciaciones() throws Exception {
		
		
	}
	
	public ArrayList<Depreciaciones> getDepreciacionessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Depreciaciones> depreciacionessSeleccionados=new ArrayList<Depreciaciones>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDepreciaciones) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Depreciaciones depreciacionesAux:depreciacionesLogic.getDepreciacioness()) {
					if(depreciacionesAux.getIsSelected()) {
						depreciacionessSeleccionados.add(depreciacionesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Depreciaciones depreciacionesAux:this.depreciacioness) {
					if(depreciacionesAux.getIsSelected()) {
						depreciacionessSeleccionados.add(depreciacionesAux);				
					}
				}
			}
			
			if(depreciacionessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						depreciacionessSeleccionados.addAll(this.depreciacionesLogic.getDepreciacioness());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						depreciacionessSeleccionados.addAll(this.depreciacioness);				
					}
				}
			}
		} else {
			depreciacionessSeleccionados.add(this.depreciaciones);
		}
		
		return depreciacionessSeleccionados;
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
	
	public void generarReporteDepreciacionessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDepreciacionessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDepreciacionessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDepreciacionessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDepreciacionessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Depreciaciones",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDepreciacionessSeleccionados() throws Exception {
		ArrayList<Depreciaciones> depreciacionessSeleccionados=new ArrayList<Depreciaciones>();		
		
		depreciacionessSeleccionados=this.getDepreciacionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDepreciacioness("Todos",depreciacionessSeleccionados);
		
	}	
	
	public void generarReporteNormalDepreciacionessSeleccionados() throws Exception {
		ArrayList<Depreciaciones> depreciacionessSeleccionados=new ArrayList<Depreciaciones>();		
		
		depreciacionessSeleccionados=this.getDepreciacionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDepreciacioness("Todos",depreciacionessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDepreciacionessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Depreciaciones> depreciacionessSeleccionados=new ArrayList<Depreciaciones>();
		
		depreciacionessSeleccionados=this.getDepreciacionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDepreciacioness("Todos",depreciacionessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDepreciacionessSeleccionados() throws Exception {
		ArrayList<Depreciaciones> depreciacionessSeleccionados=new ArrayList<Depreciaciones>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDepreciaciones();
		
		
		depreciacionessSeleccionados=this.getDepreciacionessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDepreciaciones();
		
		
		//this.generarReporteDepreciacioness("Todos",depreciacionessSeleccionados ,depreciacionesImplementable,depreciacionesImplementableHome);
	}
	
	public void mostrarImportacionDepreciacioness() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDepreciaciones();
		
		this.abrirFrameImportacionDepreciaciones();		
		
			
		//this.generarReporteDepreciacioness("Todos",depreciacionessSeleccionados ,depreciacionesImplementable,depreciacionesImplementableHome);
	}
	
	public void importarDepreciacioness() throws Exception {		
	
	}
	
	public void exportarDepreciacionessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDepreciacionessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDepreciacionessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDepreciacionessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Depreciaciones",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDepreciacionessSeleccionados() throws Exception {
		ArrayList<Depreciaciones> depreciacionessSeleccionados=new ArrayList<Depreciaciones>();		
		
		depreciacionessSeleccionados=this.getDepreciacionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"depreciaciones."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDepreciaciones(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Depreciaciones depreciacionesAux:depreciacionessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDepreciaciones(depreciacionesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//depreciacionesAux.setsDetalleGeneralEntityReporte(depreciacionesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.depreciacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Depreciaciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDepreciaciones(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DepreciacionesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionesConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionesConstantesFunciones.LABEL_IDANIOINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionesConstantesFunciones.LABEL_IDANIOFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionesConstantesFunciones.LABEL_IDMESINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionesConstantesFunciones.LABEL_IDMESFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionesConstantesFunciones.LABEL_CODIGOSUBGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionesConstantesFunciones.LABEL_NOMBRESUBGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionesConstantesFunciones.LABEL_CODIGODETALLEGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionesConstantesFunciones.LABEL_CLAVE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionesConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionesConstantesFunciones.LABEL_FECHACOMPRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionesConstantesFunciones.LABEL_VIDAUTIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionesConstantesFunciones.LABEL_COSTODECOMPRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionesConstantesFunciones.LABEL_FECHAMANTENIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionesConstantesFunciones.LABEL_FECHADEPRECIACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionesConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionesConstantesFunciones.LABEL_IDMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionesConstantesFunciones.LABEL_VALORACUMULADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionesConstantesFunciones.LABEL_VALORGASTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDepreciaciones(Depreciaciones depreciaciones,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=depreciaciones.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciaciones.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciaciones.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciaciones.getanioinicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciaciones.getaniofin_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciaciones.getmesinicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciaciones.getmesfin_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciaciones.getcodigo_sub_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciaciones.getnombre_sub_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciaciones.getcodigo_detalle_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciaciones.getnombre_detalle_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciaciones.getclave();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciaciones.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciaciones.getfecha_compra().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciaciones.getvida_util().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciaciones.getcosto_de_compra().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciaciones.getfecha_mantenimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciaciones.getfecha_depreciacion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciaciones.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciaciones.getmes_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciaciones.getvalor_acumulado().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciaciones.getvalor_gasto().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDepreciacionessSeleccionados() throws Exception {
		ArrayList<Depreciaciones> depreciacionessSeleccionados=new ArrayList<Depreciaciones>();		
		
		depreciacionessSeleccionados=this.getDepreciacionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"depreciaciones.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Depreciacioness");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDepreciaciones(row);				
				iRow++;
			}				
			
			for(Depreciaciones depreciacionesAux:depreciacionessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDepreciaciones(depreciacionesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.depreciacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Depreciaciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDepreciacionessSeleccionados() throws Exception {
		ArrayList<Depreciaciones> depreciacionessSeleccionados=new ArrayList<Depreciaciones>();		
		
		depreciacionessSeleccionados=this.getDepreciacionessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"depreciaciones.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("depreciacioness");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("depreciaciones");
			//elementRoot.appendChild(element);
		
			for(Depreciaciones depreciacionesAux:depreciacionessSeleccionados) {
				element = document.createElement("depreciaciones");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDepreciaciones(depreciacionesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.depreciacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Depreciaciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDepreciaciones(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_IDANIOINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_IDANIOFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_IDMESINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_IDMESFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_CODIGOSUBGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_NOMBRESUBGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_CLAVE);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_FECHACOMPRA);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_VIDAUTIL);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_COSTODECOMPRA);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_FECHAMANTENIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_FECHADEPRECIACION);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_IDMES);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_VALORACUMULADO);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionesConstantesFunciones.LABEL_VALORGASTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDepreciaciones(Depreciaciones depreciaciones,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(depreciaciones.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciaciones.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciaciones.getanioinicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciaciones.getaniofin_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciaciones.getmesinicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciaciones.getmesfin_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciaciones.getcodigo_sub_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciaciones.getnombre_sub_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciaciones.getcodigo_detalle_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciaciones.getnombre_detalle_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciaciones.getclave());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciaciones.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciaciones.getfecha_compra());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciaciones.getvida_util());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciaciones.getcosto_de_compra());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciaciones.getfecha_mantenimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciaciones.getfecha_depreciacion());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciaciones.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciaciones.getmes_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciaciones.getvalor_acumulado());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciaciones.getvalor_gasto());				
	}
	
	public void setFilaDatosExportarXmlDepreciaciones(Depreciaciones depreciaciones,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DepreciacionesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(depreciaciones.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DepreciacionesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(depreciaciones.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(DepreciacionesConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(depreciaciones.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementanioinicio_descripcion = document.createElement(DepreciacionesConstantesFunciones.IDANIOINICIO);
		elementanioinicio_descripcion.appendChild(document.createTextNode(depreciaciones.getanioinicio_descripcion()));
		element.appendChild(elementanioinicio_descripcion);

		Element elementaniofin_descripcion = document.createElement(DepreciacionesConstantesFunciones.IDANIOFIN);
		elementaniofin_descripcion.appendChild(document.createTextNode(depreciaciones.getaniofin_descripcion()));
		element.appendChild(elementaniofin_descripcion);

		Element elementmesinicio_descripcion = document.createElement(DepreciacionesConstantesFunciones.IDMESINICIO);
		elementmesinicio_descripcion.appendChild(document.createTextNode(depreciaciones.getmesinicio_descripcion()));
		element.appendChild(elementmesinicio_descripcion);

		Element elementmesfin_descripcion = document.createElement(DepreciacionesConstantesFunciones.IDMESFIN);
		elementmesfin_descripcion.appendChild(document.createTextNode(depreciaciones.getmesfin_descripcion()));
		element.appendChild(elementmesfin_descripcion);

		Element elementcodigo_sub_grupo = document.createElement(DepreciacionesConstantesFunciones.CODIGOSUBGRUPO);
		elementcodigo_sub_grupo.appendChild(document.createTextNode(depreciaciones.getcodigo_sub_grupo().trim()));
		element.appendChild(elementcodigo_sub_grupo);

		Element elementnombre_sub_grupo = document.createElement(DepreciacionesConstantesFunciones.NOMBRESUBGRUPO);
		elementnombre_sub_grupo.appendChild(document.createTextNode(depreciaciones.getnombre_sub_grupo().trim()));
		element.appendChild(elementnombre_sub_grupo);

		Element elementcodigo_detalle_grupo = document.createElement(DepreciacionesConstantesFunciones.CODIGODETALLEGRUPO);
		elementcodigo_detalle_grupo.appendChild(document.createTextNode(depreciaciones.getcodigo_detalle_grupo().trim()));
		element.appendChild(elementcodigo_detalle_grupo);

		Element elementnombre_detalle_grupo = document.createElement(DepreciacionesConstantesFunciones.NOMBREDETALLEGRUPO);
		elementnombre_detalle_grupo.appendChild(document.createTextNode(depreciaciones.getnombre_detalle_grupo().trim()));
		element.appendChild(elementnombre_detalle_grupo);

		Element elementclave = document.createElement(DepreciacionesConstantesFunciones.CLAVE);
		elementclave.appendChild(document.createTextNode(depreciaciones.getclave().trim()));
		element.appendChild(elementclave);

		Element elementnombre = document.createElement(DepreciacionesConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(depreciaciones.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementfecha_compra = document.createElement(DepreciacionesConstantesFunciones.FECHACOMPRA);
		elementfecha_compra.appendChild(document.createTextNode(depreciaciones.getfecha_compra().toString().trim()));
		element.appendChild(elementfecha_compra);

		Element elementvida_util = document.createElement(DepreciacionesConstantesFunciones.VIDAUTIL);
		elementvida_util.appendChild(document.createTextNode(depreciaciones.getvida_util().toString().trim()));
		element.appendChild(elementvida_util);

		Element elementcosto_de_compra = document.createElement(DepreciacionesConstantesFunciones.COSTODECOMPRA);
		elementcosto_de_compra.appendChild(document.createTextNode(depreciaciones.getcosto_de_compra().toString().trim()));
		element.appendChild(elementcosto_de_compra);

		Element elementfecha_mantenimiento = document.createElement(DepreciacionesConstantesFunciones.FECHAMANTENIMIENTO);
		elementfecha_mantenimiento.appendChild(document.createTextNode(depreciaciones.getfecha_mantenimiento().toString().trim()));
		element.appendChild(elementfecha_mantenimiento);

		Element elementfecha_depreciacion = document.createElement(DepreciacionesConstantesFunciones.FECHADEPRECIACION);
		elementfecha_depreciacion.appendChild(document.createTextNode(depreciaciones.getfecha_depreciacion().toString().trim()));
		element.appendChild(elementfecha_depreciacion);

		Element elementanio_descripcion = document.createElement(DepreciacionesConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(depreciaciones.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(DepreciacionesConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(depreciaciones.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);

		Element elementvalor_acumulado = document.createElement(DepreciacionesConstantesFunciones.VALORACUMULADO);
		elementvalor_acumulado.appendChild(document.createTextNode(depreciaciones.getvalor_acumulado().toString().trim()));
		element.appendChild(elementvalor_acumulado);

		Element elementvalor_gasto = document.createElement(DepreciacionesConstantesFunciones.VALORGASTO);
		elementvalor_gasto.appendChild(document.createTextNode(depreciaciones.getvalor_gasto().toString().trim()));
		element.appendChild(elementvalor_gasto);
	}
	
	public void generarReporteGroupGenericoDepreciacionessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Depreciaciones> depreciacionessSeleccionados=new ArrayList<Depreciaciones>();
		
		depreciacionessSeleccionados=this.getDepreciacionessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDepreciaciones(depreciacionessSeleccionados);
		
		this.generarReporteDepreciacioness("Todos",depreciacionessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDepreciaciones(ArrayList<Depreciaciones> depreciacionessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Depreciaciones depreciacionesAux:depreciacionessSeleccionados) {
				depreciacionesAux.setsDetalleGeneralEntityReporte(depreciacionesAux.toString());
			
				if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					depreciacionesAux.setsDescripcionGeneralEntityReporte1(depreciacionesAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_IDANIOINICIO)) {
					existe=true;
					depreciacionesAux.setsDescripcionGeneralEntityReporte1(depreciacionesAux.getanioinicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_IDANIOFIN)) {
					existe=true;
					depreciacionesAux.setsDescripcionGeneralEntityReporte1(depreciacionesAux.getaniofin_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_IDMESINICIO)) {
					existe=true;
					depreciacionesAux.setsDescripcionGeneralEntityReporte1(depreciacionesAux.getmesinicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_IDMESFIN)) {
					existe=true;
					depreciacionesAux.setsDescripcionGeneralEntityReporte1(depreciacionesAux.getmesfin_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_CODIGOSUBGRUPO)) {
					existe=true;
					depreciacionesAux.setsDescripcionGeneralEntityReporte1(depreciacionesAux.getcodigo_sub_grupo());
				}
				 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_NOMBRESUBGRUPO)) {
					existe=true;
					depreciacionesAux.setsDescripcionGeneralEntityReporte1(depreciacionesAux.getnombre_sub_grupo());
				}
				 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_CODIGODETALLEGRUPO)) {
					existe=true;
					depreciacionesAux.setsDescripcionGeneralEntityReporte1(depreciacionesAux.getcodigo_detalle_grupo());
				}
				 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO)) {
					existe=true;
					depreciacionesAux.setsDescripcionGeneralEntityReporte1(depreciacionesAux.getnombre_detalle_grupo());
				}
				 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_CLAVE)) {
					existe=true;
					depreciacionesAux.setsDescripcionGeneralEntityReporte1(depreciacionesAux.getclave());
				}
				 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					depreciacionesAux.setsDescripcionGeneralEntityReporte1(depreciacionesAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_FECHACOMPRA)) {
					existe=true;
					depreciacionesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(depreciacionesAux.getfecha_compra()));
				}
				 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_FECHAMANTENIMIENTO)) {
					existe=true;
					depreciacionesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(depreciacionesAux.getfecha_mantenimiento()));
				}
				 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_FECHADEPRECIACION)) {
					existe=true;
					depreciacionesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(depreciacionesAux.getfecha_depreciacion()));
				}
				 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					depreciacionesAux.setsDescripcionGeneralEntityReporte1(depreciacionesAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DepreciacionesConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					depreciacionesAux.setsDescripcionGeneralEntityReporte1(depreciacionesAux.getmes_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDepreciaciones(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDepreciaciones=true;
				this.isVisibilidadCeldaNuevoRelacionesDepreciaciones=true;
				this.isVisibilidadCeldaGuardarCambiosDepreciaciones=true;
			}
			
			this.isVisibilidadCeldaModificarDepreciaciones=false;
			this.isVisibilidadCeldaActualizarDepreciaciones=false;
			this.isVisibilidadCeldaEliminarDepreciaciones=false;
			this.isVisibilidadCeldaCancelarDepreciaciones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDepreciaciones=true;
				} else {
					this.isVisibilidadCeldaGuardarDepreciaciones=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDepreciaciones=false;
			this.isVisibilidadCeldaNuevoRelacionesDepreciaciones=false;
			this.isVisibilidadCeldaGuardarCambiosDepreciaciones=false;
			this.isVisibilidadCeldaModificarDepreciaciones=false;
			this.isVisibilidadCeldaActualizarDepreciaciones=true;
			this.isVisibilidadCeldaEliminarDepreciaciones=false;
			this.isVisibilidadCeldaCancelarDepreciaciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDepreciaciones=true;
				} else {
					this.isVisibilidadCeldaGuardarDepreciaciones=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDepreciaciones=false;
			this.isVisibilidadCeldaNuevoRelacionesDepreciaciones=false;
			this.isVisibilidadCeldaGuardarCambiosDepreciaciones=false;
			this.isVisibilidadCeldaModificarDepreciaciones=false;
			this.isVisibilidadCeldaActualizarDepreciaciones=true;
			this.isVisibilidadCeldaEliminarDepreciaciones=true;
			this.isVisibilidadCeldaCancelarDepreciaciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDepreciaciones=true;
				} else {
					this.isVisibilidadCeldaGuardarDepreciaciones=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDepreciaciones=false;
			this.isVisibilidadCeldaNuevoRelacionesDepreciaciones=false;
			this.isVisibilidadCeldaGuardarCambiosDepreciaciones=false;
			this.isVisibilidadCeldaModificarDepreciaciones=false;
			this.isVisibilidadCeldaActualizarDepreciaciones=true;
			this.isVisibilidadCeldaEliminarDepreciaciones=false;
			this.isVisibilidadCeldaCancelarDepreciaciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDepreciaciones=false;
				} else {
					this.isVisibilidadCeldaGuardarDepreciaciones=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDepreciaciones=true;
			this.isVisibilidadCeldaNuevoRelacionesDepreciaciones=true;
			this.isVisibilidadCeldaGuardarCambiosDepreciaciones=true;
			this.isVisibilidadCeldaModificarDepreciaciones=false;
			this.isVisibilidadCeldaActualizarDepreciaciones=false;
			this.isVisibilidadCeldaEliminarDepreciaciones=false;
			this.isVisibilidadCeldaCancelarDepreciaciones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDepreciaciones=true;
				} else {
					this.isVisibilidadCeldaGuardarDepreciaciones=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDepreciaciones=false;
			this.isVisibilidadCeldaNuevoRelacionesDepreciaciones=false;
			this.isVisibilidadCeldaGuardarCambiosDepreciaciones=false;
			this.isVisibilidadCeldaActualizarDepreciaciones=false;
			this.isVisibilidadCeldaEliminarDepreciaciones=false;
			this.isVisibilidadCeldaCancelarDepreciaciones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDepreciaciones=false;
				} else {
					this.isVisibilidadCeldaGuardarDepreciaciones=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDepreciaciones=false;
			this.isVisibilidadCeldaNuevoRelacionesDepreciaciones=false;
			this.isVisibilidadCeldaGuardarCambiosDepreciaciones=false;
			this.isVisibilidadCeldaModificarDepreciaciones=true;
			this.isVisibilidadCeldaActualizarDepreciaciones=false;
			this.isVisibilidadCeldaEliminarDepreciaciones=false;
			this.isVisibilidadCeldaCancelarDepreciaciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDepreciaciones=false;
				} else {
					this.isVisibilidadCeldaGuardarDepreciaciones=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DepreciacionesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDepreciaciones=true;
			this.isVisibilidadCeldaNuevoRelacionesDepreciaciones=true;
			this.isVisibilidadCeldaGuardarCambiosDepreciaciones=true;
		} else {
			this.actualizarEstadoPanelsDepreciaciones(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDepreciaciones=false;
			//this.isVisibilidadCeldaVerFormDepreciaciones=false;
			this.isVisibilidadCeldaDuplicarDepreciaciones=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!depreciacionesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDepreciaciones=false;
		} else {
			this.isVisibilidadCeldaNuevoDepreciaciones=false;
			this.isVisibilidadCeldaGuardarCambiosDepreciaciones=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(depreciacionesSessionBean.getEsGuardarRelacionado()) {
			if(!depreciacionesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDepreciaciones=false;												
			}
			
			this.jButtonCerrarDepreciaciones.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDepreciaciones=false;
		}
		
		if(!this.permiteMantenimiento(this.depreciaciones)) {
			this.isVisibilidadCeldaActualizarDepreciaciones=false;
			this.isVisibilidadCeldaEliminarDepreciaciones=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoDepreciaciones=false;
		this.isVisibilidadCeldaNuevoRelacionesDepreciaciones=false;
		this.isVisibilidadCeldaGuardarCambiosDepreciaciones=false;
		//this.isVisibilidadCeldaModificarDepreciaciones=true;
		this.isVisibilidadCeldaActualizarDepreciaciones=false;
		this.isVisibilidadCeldaEliminarDepreciaciones=false;
		//this.isVisibilidadCeldaCancelarDepreciaciones=true;			
		this.isVisibilidadCeldaGuardarDepreciaciones=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDepreciaciones() {
	}
	
	public void actualizarEstadoPanelsDepreciaciones(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDepreciaciones!=null) {
				this.jScrollPanelDatosEdicionDepreciaciones.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDepreciaciones!=null) {
				this.jTabbedPaneBusquedasDepreciaciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDepreciaciones!=null) {
				this.jScrollPanelDatosDepreciaciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionDepreciaciones!=null) {
				this.jPanelPaginacionDepreciaciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDepreciaciones!=null) {
				this.jPanelParametrosReportesDepreciaciones.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDepreciaciones!=null) {
				this.jScrollPanelDatosEdicionDepreciaciones.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDepreciaciones!=null) {
				this.jTabbedPaneBusquedasDepreciaciones.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDepreciaciones!=null) {
				this.jScrollPanelDatosDepreciaciones.setVisible(false);
			}
			
			if(this.jPanelPaginacionDepreciaciones!=null) {
				this.jPanelPaginacionDepreciaciones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDepreciaciones!=null) {
				this.jPanelParametrosReportesDepreciaciones.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDepreciaciones!=null) {
				this.jScrollPanelDatosEdicionDepreciaciones.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDepreciaciones!=null) {
				this.jTabbedPaneBusquedasDepreciaciones.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDepreciaciones!=null) {
				this.jScrollPanelDatosDepreciaciones.setVisible(false);
			}
			
			if(this.jPanelPaginacionDepreciaciones!=null) {
				this.jPanelPaginacionDepreciaciones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDepreciaciones!=null) {
				this.jPanelParametrosReportesDepreciaciones.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDepreciaciones!=null) {
				this.jScrollPanelDatosEdicionDepreciaciones.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDepreciaciones!=null) {
				this.jTabbedPaneBusquedasDepreciaciones.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDepreciaciones!=null) {
				this.jScrollPanelDatosDepreciaciones.setVisible(false);
			}
			
			if(this.jPanelPaginacionDepreciaciones!=null) {
				this.jPanelPaginacionDepreciaciones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDepreciaciones!=null) {
				this.jPanelParametrosReportesDepreciaciones.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDepreciaciones!=null) {
				this.jScrollPanelDatosEdicionDepreciaciones.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDepreciaciones!=null) {
				this.jTabbedPaneBusquedasDepreciaciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDepreciaciones!=null) {
				this.jScrollPanelDatosDepreciaciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionDepreciaciones!=null) {
				this.jPanelPaginacionDepreciaciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDepreciaciones!=null) {
				this.jPanelParametrosReportesDepreciaciones.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDepreciaciones!=null) {
				this.jScrollPanelDatosEdicionDepreciaciones.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDepreciaciones!=null) {
				this.jTabbedPaneBusquedasDepreciaciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDepreciaciones!=null) {
				this.jScrollPanelDatosDepreciaciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionDepreciaciones!=null) {
				this.jPanelPaginacionDepreciaciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDepreciaciones!=null) {
				this.jPanelParametrosReportesDepreciaciones.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDepreciaciones!=null) {
				this.jScrollPanelDatosEdicionDepreciaciones.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDepreciaciones!=null) {
				this.jTabbedPaneBusquedasDepreciaciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDepreciaciones!=null) {
				this.jScrollPanelDatosDepreciaciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionDepreciaciones!=null) {
				this.jPanelPaginacionDepreciaciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDepreciaciones!=null) {
				this.jPanelParametrosReportesDepreciaciones.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.depreciacionesSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDepreciaciones!=null) {
					this.jTabbedPaneBusquedasDepreciaciones.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDepreciaciones!=null) {
				this.jPanelParametrosReportesDepreciaciones.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.depreciacionesSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDepreciaciones!=null) {
				this.jTabbedPaneBusquedasDepreciaciones.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDepreciaciones!=null) {
				this.jPanelParametrosReportesDepreciaciones.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaDepreciaciones=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaDepreciaciones) {this.jTabbedPaneBusquedasDepreciaciones.remove(jPanelBusquedaDepreciacionesDepreciaciones);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnioInicio(Boolean isParaAnioInicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioInicioNegation=!isParaAnioInicio;

			this.isVisibilidadBusquedaDepreciaciones=isParaAnioInicio;
			if(!this.isVisibilidadBusquedaDepreciaciones) {this.jTabbedPaneBusquedasDepreciaciones.remove(jPanelBusquedaDepreciacionesDepreciaciones);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnioFin(Boolean isParaAnioFin){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioFinNegation=!isParaAnioFin;

			this.isVisibilidadBusquedaDepreciaciones=isParaAnioFin;
			if(!this.isVisibilidadBusquedaDepreciaciones) {this.jTabbedPaneBusquedasDepreciaciones.remove(jPanelBusquedaDepreciacionesDepreciaciones);}
		}
		
	}

	public void setVisibilidadBusquedasParaMesInicio(Boolean isParaMesInicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesInicioNegation=!isParaMesInicio;

			this.isVisibilidadBusquedaDepreciaciones=isParaMesInicio;
			if(!this.isVisibilidadBusquedaDepreciaciones) {this.jTabbedPaneBusquedasDepreciaciones.remove(jPanelBusquedaDepreciacionesDepreciaciones);}
		}
		
	}

	public void setVisibilidadBusquedasParaMesFin(Boolean isParaMesFin){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesFinNegation=!isParaMesFin;

			this.isVisibilidadBusquedaDepreciaciones=isParaMesFin;
			if(!this.isVisibilidadBusquedaDepreciaciones) {this.jTabbedPaneBusquedasDepreciaciones.remove(jPanelBusquedaDepreciacionesDepreciaciones);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadBusquedaDepreciaciones=isParaAnioNegation;
			if(!this.isVisibilidadBusquedaDepreciaciones) {this.jTabbedPaneBusquedasDepreciaciones.remove(jPanelBusquedaDepreciacionesDepreciaciones);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadBusquedaDepreciaciones=isParaMesNegation;
			if(!this.isVisibilidadBusquedaDepreciaciones) {this.jTabbedPaneBusquedasDepreciaciones.remove(jPanelBusquedaDepreciacionesDepreciaciones);}
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
			
			this.inicializarActualizarBindingTablaDepreciaciones(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDepreciaciones() {
		this.updateBorderResaltarBusquedasFormularioDepreciaciones();
		this.updateVisibilidadBusquedasFormularioDepreciaciones();
		this.updateHabilitarBusquedasFormularioDepreciaciones();
	}
	
	public void updateBorderResaltarBusquedasFormularioDepreciaciones() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDepreciaciones.getComponents().length>0) {
	

		if(this.depreciacionesConstantesFunciones.resaltarBusquedaDepreciacionesDepreciaciones!=null) {
			index= this.jTabbedPaneBusquedasDepreciaciones.indexOfComponent(this.jPanelBusquedaDepreciacionesDepreciaciones);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDepreciaciones.getComponent(index);
				jPanel.setBorder(this.depreciacionesConstantesFunciones.resaltarBusquedaDepreciacionesDepreciaciones);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDepreciaciones() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDepreciaciones.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDepreciaciones.indexOfComponent(this.jPanelBusquedaDepreciacionesDepreciaciones);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDepreciaciones.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.depreciacionesConstantesFunciones.mostrarBusquedaDepreciacionesDepreciaciones);
			if(!this.depreciacionesConstantesFunciones.mostrarBusquedaDepreciacionesDepreciaciones && index>-1) {
				this.jTabbedPaneBusquedasDepreciaciones.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDepreciaciones() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDepreciaciones.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDepreciaciones.indexOfComponent(this.jPanelBusquedaDepreciacionesDepreciaciones);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDepreciaciones.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.depreciacionesConstantesFunciones.activarBusquedaDepreciacionesDepreciaciones);
				this.jTabbedPaneBusquedasDepreciaciones.setEnabledAt(index,this.depreciacionesConstantesFunciones.activarBusquedaDepreciacionesDepreciaciones);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDepreciaciones(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaDepreciaciones")) {
			index= this.jTabbedPaneBusquedasDepreciaciones.indexOfComponent(this.jPanelBusquedaDepreciacionesDepreciaciones);

			this.jTabbedPaneBusquedasDepreciaciones.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDepreciaciones.getComponent(index);

			this.depreciacionesConstantesFunciones.setResaltarBusquedaDepreciacionesDepreciaciones(resaltar);

			jPanel.setBorder(this.depreciacionesConstantesFunciones.resaltarBusquedaDepreciacionesDepreciaciones);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDepreciaciones.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDepreciaciones() throws Exception {

		if(this.jInternalFrameDetalleFormDepreciaciones==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDepreciaciones();
		this.updateVisibilidadResaltarControlesFormularioDepreciaciones();
		this.updateHabilitarResaltarControlesFormularioDepreciaciones();
		
	}
	
	public void updateBorderResaltarControlesFormularioDepreciaciones() throws Exception {
		if(this.jInternalFrameDetalleFormDepreciaciones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.depreciacionesConstantesFunciones.resaltaridDepreciaciones!=null && this.jInternalFrameDetalleFormDepreciaciones!=null) {this.jInternalFrameDetalleFormDepreciaciones.jLabelidDepreciaciones.setBorder(this.depreciacionesConstantesFunciones.resaltaridDepreciaciones);}
		if(this.depreciacionesConstantesFunciones.resaltarid_empresaDepreciaciones!=null && this.jInternalFrameDetalleFormDepreciaciones!=null) {this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_empresaDepreciaciones.setBorder(this.depreciacionesConstantesFunciones.resaltarid_empresaDepreciaciones);}
		if(this.depreciacionesConstantesFunciones.resaltarid_anio_inicioDepreciaciones!=null && this.jInternalFrameDetalleFormDepreciaciones!=null) {this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anio_inicioDepreciaciones.setBorder(this.depreciacionesConstantesFunciones.resaltarid_anio_inicioDepreciaciones);}
		if(this.depreciacionesConstantesFunciones.resaltarid_anio_finDepreciaciones!=null && this.jInternalFrameDetalleFormDepreciaciones!=null) {this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anio_finDepreciaciones.setBorder(this.depreciacionesConstantesFunciones.resaltarid_anio_finDepreciaciones);}
		if(this.depreciacionesConstantesFunciones.resaltarid_mes_inicioDepreciaciones!=null && this.jInternalFrameDetalleFormDepreciaciones!=null) {this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mes_inicioDepreciaciones.setBorder(this.depreciacionesConstantesFunciones.resaltarid_mes_inicioDepreciaciones);}
		if(this.depreciacionesConstantesFunciones.resaltarid_mes_finDepreciaciones!=null && this.jInternalFrameDetalleFormDepreciaciones!=null) {this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mes_finDepreciaciones.setBorder(this.depreciacionesConstantesFunciones.resaltarid_mes_finDepreciaciones);}
		if(this.depreciacionesConstantesFunciones.resaltarcodigo_sub_grupoDepreciaciones!=null && this.jInternalFrameDetalleFormDepreciaciones!=null) {this.jInternalFrameDetalleFormDepreciaciones.jTextFieldcodigo_sub_grupoDepreciaciones.setBorder(this.depreciacionesConstantesFunciones.resaltarcodigo_sub_grupoDepreciaciones);}
		if(this.depreciacionesConstantesFunciones.resaltarnombre_sub_grupoDepreciaciones!=null && this.jInternalFrameDetalleFormDepreciaciones!=null) {this.jInternalFrameDetalleFormDepreciaciones.jTextAreanombre_sub_grupoDepreciaciones.setBorder(this.depreciacionesConstantesFunciones.resaltarnombre_sub_grupoDepreciaciones);}
		if(this.depreciacionesConstantesFunciones.resaltarcodigo_detalle_grupoDepreciaciones!=null && this.jInternalFrameDetalleFormDepreciaciones!=null) {this.jInternalFrameDetalleFormDepreciaciones.jTextFieldcodigo_detalle_grupoDepreciaciones.setBorder(this.depreciacionesConstantesFunciones.resaltarcodigo_detalle_grupoDepreciaciones);}
		if(this.depreciacionesConstantesFunciones.resaltarnombre_detalle_grupoDepreciaciones!=null && this.jInternalFrameDetalleFormDepreciaciones!=null) {this.jInternalFrameDetalleFormDepreciaciones.jTextAreanombre_detalle_grupoDepreciaciones.setBorder(this.depreciacionesConstantesFunciones.resaltarnombre_detalle_grupoDepreciaciones);}
		if(this.depreciacionesConstantesFunciones.resaltarclaveDepreciaciones!=null && this.jInternalFrameDetalleFormDepreciaciones!=null) {this.jInternalFrameDetalleFormDepreciaciones.jTextFieldclaveDepreciaciones.setBorder(this.depreciacionesConstantesFunciones.resaltarclaveDepreciaciones);}
		if(this.depreciacionesConstantesFunciones.resaltarnombreDepreciaciones!=null && this.jInternalFrameDetalleFormDepreciaciones!=null) {this.jInternalFrameDetalleFormDepreciaciones.jTextAreanombreDepreciaciones.setBorder(this.depreciacionesConstantesFunciones.resaltarnombreDepreciaciones);}
		if(this.depreciacionesConstantesFunciones.resaltarfecha_compraDepreciaciones!=null && this.jInternalFrameDetalleFormDepreciaciones!=null) {this.jInternalFrameDetalleFormDepreciaciones.jDateChooserfecha_compraDepreciaciones.setBorder(this.depreciacionesConstantesFunciones.resaltarfecha_compraDepreciaciones);}
		if(this.depreciacionesConstantesFunciones.resaltarvida_utilDepreciaciones!=null && this.jInternalFrameDetalleFormDepreciaciones!=null) {this.jInternalFrameDetalleFormDepreciaciones.jTextFieldvida_utilDepreciaciones.setBorder(this.depreciacionesConstantesFunciones.resaltarvida_utilDepreciaciones);}
		if(this.depreciacionesConstantesFunciones.resaltarcosto_de_compraDepreciaciones!=null && this.jInternalFrameDetalleFormDepreciaciones!=null) {this.jInternalFrameDetalleFormDepreciaciones.jTextFieldcosto_de_compraDepreciaciones.setBorder(this.depreciacionesConstantesFunciones.resaltarcosto_de_compraDepreciaciones);}
		if(this.depreciacionesConstantesFunciones.resaltarfecha_mantenimientoDepreciaciones!=null && this.jInternalFrameDetalleFormDepreciaciones!=null) {this.jInternalFrameDetalleFormDepreciaciones.jDateChooserfecha_mantenimientoDepreciaciones.setBorder(this.depreciacionesConstantesFunciones.resaltarfecha_mantenimientoDepreciaciones);}
		if(this.depreciacionesConstantesFunciones.resaltarfecha_depreciacionDepreciaciones!=null && this.jInternalFrameDetalleFormDepreciaciones!=null) {this.jInternalFrameDetalleFormDepreciaciones.jDateChooserfecha_depreciacionDepreciaciones.setBorder(this.depreciacionesConstantesFunciones.resaltarfecha_depreciacionDepreciaciones);}
		if(this.depreciacionesConstantesFunciones.resaltarid_anioDepreciaciones!=null && this.jInternalFrameDetalleFormDepreciaciones!=null) {this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anioDepreciaciones.setBorder(this.depreciacionesConstantesFunciones.resaltarid_anioDepreciaciones);}
		if(this.depreciacionesConstantesFunciones.resaltarid_mesDepreciaciones!=null && this.jInternalFrameDetalleFormDepreciaciones!=null) {this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mesDepreciaciones.setBorder(this.depreciacionesConstantesFunciones.resaltarid_mesDepreciaciones);}
		if(this.depreciacionesConstantesFunciones.resaltarvalor_acumuladoDepreciaciones!=null && this.jInternalFrameDetalleFormDepreciaciones!=null) {this.jInternalFrameDetalleFormDepreciaciones.jTextFieldvalor_acumuladoDepreciaciones.setBorder(this.depreciacionesConstantesFunciones.resaltarvalor_acumuladoDepreciaciones);}
		if(this.depreciacionesConstantesFunciones.resaltarvalor_gastoDepreciaciones!=null && this.jInternalFrameDetalleFormDepreciaciones!=null) {this.jInternalFrameDetalleFormDepreciaciones.jTextFieldvalor_gastoDepreciaciones.setBorder(this.depreciacionesConstantesFunciones.resaltarvalor_gastoDepreciaciones);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDepreciaciones() throws Exception {		
		if(this.jInternalFrameDetalleFormDepreciaciones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
	
		//this.jInternalFrameDetalleFormDepreciaciones.jLabelidDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostraridDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jPanelidDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostraridDepreciaciones);
		//this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_empresaDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarid_empresaDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jPanelid_empresaDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarid_empresaDepreciaciones);
		//this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anio_inicioDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarid_anio_inicioDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jPanelid_anio_inicioDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarid_anio_inicioDepreciaciones);
		//this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anio_finDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarid_anio_finDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jPanelid_anio_finDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarid_anio_finDepreciaciones);
		//this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mes_inicioDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarid_mes_inicioDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jPanelid_mes_inicioDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarid_mes_inicioDepreciaciones);
		//this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mes_finDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarid_mes_finDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jPanelid_mes_finDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarid_mes_finDepreciaciones);
		//this.jInternalFrameDetalleFormDepreciaciones.jTextFieldcodigo_sub_grupoDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarcodigo_sub_grupoDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jPanelcodigo_sub_grupoDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarcodigo_sub_grupoDepreciaciones);
		//this.jInternalFrameDetalleFormDepreciaciones.jTextAreanombre_sub_grupoDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarnombre_sub_grupoDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jPanelnombre_sub_grupoDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarnombre_sub_grupoDepreciaciones);
		//this.jInternalFrameDetalleFormDepreciaciones.jTextFieldcodigo_detalle_grupoDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarcodigo_detalle_grupoDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jPanelcodigo_detalle_grupoDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarcodigo_detalle_grupoDepreciaciones);
		//this.jInternalFrameDetalleFormDepreciaciones.jTextAreanombre_detalle_grupoDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarnombre_detalle_grupoDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jPanelnombre_detalle_grupoDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarnombre_detalle_grupoDepreciaciones);
		//this.jInternalFrameDetalleFormDepreciaciones.jTextFieldclaveDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarclaveDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jPanelclaveDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarclaveDepreciaciones);
		//this.jInternalFrameDetalleFormDepreciaciones.jTextAreanombreDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarnombreDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jPanelnombreDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarnombreDepreciaciones);
		//this.jInternalFrameDetalleFormDepreciaciones.jDateChooserfecha_compraDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarfecha_compraDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jPanelfecha_compraDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarfecha_compraDepreciaciones);
		//this.jInternalFrameDetalleFormDepreciaciones.jTextFieldvida_utilDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarvida_utilDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jPanelvida_utilDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarvida_utilDepreciaciones);
		//this.jInternalFrameDetalleFormDepreciaciones.jTextFieldcosto_de_compraDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarcosto_de_compraDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jPanelcosto_de_compraDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarcosto_de_compraDepreciaciones);
		//this.jInternalFrameDetalleFormDepreciaciones.jDateChooserfecha_mantenimientoDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarfecha_mantenimientoDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jPanelfecha_mantenimientoDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarfecha_mantenimientoDepreciaciones);
		//this.jInternalFrameDetalleFormDepreciaciones.jDateChooserfecha_depreciacionDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarfecha_depreciacionDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jPanelfecha_depreciacionDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarfecha_depreciacionDepreciaciones);
		//this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anioDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarid_anioDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jPanelid_anioDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarid_anioDepreciaciones);
		//this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mesDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarid_mesDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jPanelid_mesDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarid_mesDepreciaciones);
		//this.jInternalFrameDetalleFormDepreciaciones.jTextFieldvalor_acumuladoDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarvalor_acumuladoDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jPanelvalor_acumuladoDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarvalor_acumuladoDepreciaciones);
		//this.jInternalFrameDetalleFormDepreciaciones.jTextFieldvalor_gastoDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarvalor_gastoDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jPanelvalor_gastoDepreciaciones.setVisible(this.depreciacionesConstantesFunciones.mostrarvalor_gastoDepreciaciones);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDepreciaciones() throws Exception {
		if(this.jInternalFrameDetalleFormDepreciaciones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDepreciaciones!=null) {
	
		this.jInternalFrameDetalleFormDepreciaciones.jLabelidDepreciaciones.setEnabled(this.depreciacionesConstantesFunciones.activaridDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_empresaDepreciaciones.setEnabled(this.depreciacionesConstantesFunciones.activarid_empresaDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anio_inicioDepreciaciones.setEnabled(this.depreciacionesConstantesFunciones.activarid_anio_inicioDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anio_finDepreciaciones.setEnabled(this.depreciacionesConstantesFunciones.activarid_anio_finDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mes_inicioDepreciaciones.setEnabled(this.depreciacionesConstantesFunciones.activarid_mes_inicioDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mes_finDepreciaciones.setEnabled(this.depreciacionesConstantesFunciones.activarid_mes_finDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jTextFieldcodigo_sub_grupoDepreciaciones.setEnabled(this.depreciacionesConstantesFunciones.activarcodigo_sub_grupoDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jTextAreanombre_sub_grupoDepreciaciones.setEnabled(this.depreciacionesConstantesFunciones.activarnombre_sub_grupoDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jTextFieldcodigo_detalle_grupoDepreciaciones.setEnabled(this.depreciacionesConstantesFunciones.activarcodigo_detalle_grupoDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jTextAreanombre_detalle_grupoDepreciaciones.setEnabled(this.depreciacionesConstantesFunciones.activarnombre_detalle_grupoDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jTextFieldclaveDepreciaciones.setEnabled(this.depreciacionesConstantesFunciones.activarclaveDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jTextAreanombreDepreciaciones.setEnabled(this.depreciacionesConstantesFunciones.activarnombreDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jDateChooserfecha_compraDepreciaciones.setEnabled(this.depreciacionesConstantesFunciones.activarfecha_compraDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jTextFieldvida_utilDepreciaciones.setEnabled(this.depreciacionesConstantesFunciones.activarvida_utilDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jTextFieldcosto_de_compraDepreciaciones.setEnabled(this.depreciacionesConstantesFunciones.activarcosto_de_compraDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jDateChooserfecha_mantenimientoDepreciaciones.setEnabled(this.depreciacionesConstantesFunciones.activarfecha_mantenimientoDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jDateChooserfecha_depreciacionDepreciaciones.setEnabled(this.depreciacionesConstantesFunciones.activarfecha_depreciacionDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_anioDepreciaciones.setEnabled(this.depreciacionesConstantesFunciones.activarid_anioDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jComboBoxid_mesDepreciaciones.setEnabled(this.depreciacionesConstantesFunciones.activarid_mesDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jTextFieldvalor_acumuladoDepreciaciones.setEnabled(this.depreciacionesConstantesFunciones.activarvalor_acumuladoDepreciaciones);
		this.jInternalFrameDetalleFormDepreciaciones.jTextFieldvalor_gastoDepreciaciones.setEnabled(this.depreciacionesConstantesFunciones.activarvalor_gastoDepreciaciones);
		}
	}
	
		
}