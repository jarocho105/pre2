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

import com.bydan.erp.nomina.util.FormatoNomiConstantesFunciones;
import com.bydan.erp.nomina.util.FormatoNomiParameterReturnGeneral;
//import com.bydan.erp.nomina.util.FormatoNomiParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.FormatoNomiBean;
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
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class FormatoNomiBeanSwingJInternalFrame extends FormatoNomiJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(FormatoNomiBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<FormatoNomi> formatonomiValidator = new ClassValidator<FormatoNomi>(FormatoNomi.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public FormatoNomi formatonomi;	
	public FormatoNomi formatonomiAux;
	public FormatoNomi formatonomiAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public FormatoNomi formatonomiTotales;
	public Long idFormatoNomiActual;
	public Long iIdNuevoFormatoNomi=0L;
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

	public String sFinalQueryComboEstructura="";

	public List<Estructura> estructurasForeignKey;

	public List<Estructura> getestructurasForeignKey() {
		return estructurasForeignKey;
	}

	public void setestructurasForeignKey(List<Estructura> estructurasForeignKey) {
		this.estructurasForeignKey = estructurasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Estructura estructuraForeignKey;

	public Estructura getestructuraForeignKey() {
		return estructuraForeignKey;
	}

	public void setestructuraForeignKey(Estructura estructuraForeignKey) {
		this.estructuraForeignKey = estructuraForeignKey;
	}

	public String sFinalQueryComboPuntajeNomi="";

	public List<PuntajeNomi> puntajenomisForeignKey;

	public List<PuntajeNomi> getpuntajenomisForeignKey() {
		return puntajenomisForeignKey;
	}

	public void setpuntajenomisForeignKey(List<PuntajeNomi> puntajenomisForeignKey) {
		this.puntajenomisForeignKey = puntajenomisForeignKey;
	}

	//OBJETO FK ACTUAL
	public PuntajeNomi puntajenomiForeignKey;

	public PuntajeNomi getpuntajenomiForeignKey() {
		return puntajenomiForeignKey;
	}

	public void setpuntajenomiForeignKey(PuntajeNomi puntajenomiForeignKey) {
		this.puntajenomiForeignKey = puntajenomiForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosFormatoNomiPreguntaNomi=false;

	public Boolean getIsTienePermisosFormatoNomiPreguntaNomi() {
		return isTienePermisosFormatoNomiPreguntaNomi;
	}

	public void setIsTienePermisosFormatoNomiPreguntaNomi(Boolean isTienePermisosFormatoNomiPreguntaNomi) {
		this.isTienePermisosFormatoNomiPreguntaNomi= isTienePermisosFormatoNomiPreguntaNomi;
	}


	public Boolean isTienePermisosFormatoNomiFactorNomi=false;

	public Boolean getIsTienePermisosFormatoNomiFactorNomi() {
		return isTienePermisosFormatoNomiFactorNomi;
	}

	public void setIsTienePermisosFormatoNomiFactorNomi(Boolean isTienePermisosFormatoNomiFactorNomi) {
		this.isTienePermisosFormatoNomiFactorNomi= isTienePermisosFormatoNomiFactorNomi;
	}


	public Boolean isTienePermisosEvaluacionNomi=false;

	public Boolean getIsTienePermisosEvaluacionNomi() {
		return isTienePermisosEvaluacionNomi;
	}

	public void setIsTienePermisosEvaluacionNomi(Boolean isTienePermisosEvaluacionNomi) {
		this.isTienePermisosEvaluacionNomi= isTienePermisosEvaluacionNomi;
	}


	public Boolean isTienePermisosDetalleEvaluacionNomi=false;

	public Boolean getIsTienePermisosDetalleEvaluacionNomi() {
		return isTienePermisosDetalleEvaluacionNomi;
	}

	public void setIsTienePermisosDetalleEvaluacionNomi(Boolean isTienePermisosDetalleEvaluacionNomi) {
		this.isTienePermisosDetalleEvaluacionNomi= isTienePermisosDetalleEvaluacionNomi;
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
	
	public Boolean isPermisoTodoFormatoNomi;
	public Boolean isPermisoNuevoFormatoNomi;
	public Boolean isPermisoActualizarFormatoNomi;
	public Boolean isPermisoActualizarOriginalFormatoNomi;
	public Boolean isPermisoEliminarFormatoNomi;
	public Boolean isPermisoGuardarCambiosFormatoNomi;
	public Boolean isPermisoConsultaFormatoNomi;
	public Boolean isPermisoBusquedaFormatoNomi;
	public Boolean isPermisoReporteFormatoNomi;
	public Boolean isPermisoPaginacionMedioFormatoNomi;
	public Boolean isPermisoPaginacionAltoFormatoNomi;
	public Boolean isPermisoPaginacionTodoFormatoNomi;
	public Boolean isPermisoCopiarFormatoNomi;
	public Boolean isPermisoVerFormFormatoNomi;
	public Boolean isPermisoDuplicarFormatoNomi;
	public Boolean isPermisoOrdenFormatoNomi;
	
	
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
	
	public FormatoNomiParameterReturnGeneral formatonomiReturnGeneral;
	public FormatoNomiParameterReturnGeneral formatonomiParameterGeneral;
	
	

	public FormatoNomiPreguntaNomiLogic formatonomipreguntanomiLogic=null;

	public FormatoNomiPreguntaNomiLogic getFormatoNomiPreguntaNomiLogic() {
		return formatonomipreguntanomiLogic;
	}

	public void setFormatoNomiPreguntaNomiLogic(FormatoNomiPreguntaNomiLogic formatonomipreguntanomiLogic) {
		this.formatonomipreguntanomiLogic = formatonomipreguntanomiLogic;
	}


	public FormatoNomiFactorNomiLogic formatonomifactornomiLogic=null;

	public FormatoNomiFactorNomiLogic getFormatoNomiFactorNomiLogic() {
		return formatonomifactornomiLogic;
	}

	public void setFormatoNomiFactorNomiLogic(FormatoNomiFactorNomiLogic formatonomifactornomiLogic) {
		this.formatonomifactornomiLogic = formatonomifactornomiLogic;
	}


	public EvaluacionNomiLogic evaluacionnomiLogic=null;

	public EvaluacionNomiLogic getEvaluacionNomiLogic() {
		return evaluacionnomiLogic;
	}

	public void setEvaluacionNomiLogic(EvaluacionNomiLogic evaluacionnomiLogic) {
		this.evaluacionnomiLogic = evaluacionnomiLogic;
	}


	public DetalleEvaluacionNomiLogic detalleevaluacionnomiLogic=null;

	public DetalleEvaluacionNomiLogic getDetalleEvaluacionNomiLogic() {
		return detalleevaluacionnomiLogic;
	}

	public void setDetalleEvaluacionNomiLogic(DetalleEvaluacionNomiLogic detalleevaluacionnomiLogic) {
		this.detalleevaluacionnomiLogic = detalleevaluacionnomiLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoFormatoNomi=false;
	public Boolean esParaAccionDesdeFormularioFormatoNomi=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected FormatoNomiSessionBeanAdditional formatonomiSessionBeanAdditional=null;
	
	public FormatoNomiSessionBeanAdditional getFormatoNomiSessionBeanAdditional() {
		return this.formatonomiSessionBeanAdditional;
	}
	
	public void setFormatoNomiSessionBeanAdditional(FormatoNomiSessionBeanAdditional formatonomiSessionBeanAdditional) {
		try {
			this.formatonomiSessionBeanAdditional=formatonomiSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected FormatoNomiBeanSwingJInternalFrameAdditional formatonomiBeanSwingJInternalFrameAdditional=null;
	//public class FormatoNomiBeanSwingJInternalFrame
	
	public FormatoNomiBeanSwingJInternalFrameAdditional getFormatoNomiBeanSwingJInternalFrameAdditional() {
		return this.formatonomiBeanSwingJInternalFrameAdditional;
	}
	
	public void setFormatoNomiBeanSwingJInternalFrameAdditional(FormatoNomiBeanSwingJInternalFrameAdditional formatonomiBeanSwingJInternalFrameAdditional) {
		try {
			this.formatonomiBeanSwingJInternalFrameAdditional=formatonomiBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public FormatoNomiLogic formatonomiLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public FormatoNomi formatonomiBean;
	public FormatoNomiConstantesFunciones formatonomiConstantesFunciones;
	//public FormatoNomiParameterReturnGeneral formatonomiReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EstructuraLogic estructuraLogic;
	public PuntajeNomiLogic puntajenomiLogic;
	
	//PARAMETROS
	
	
	//public List<FormatoNomi> formatonomis;	
	//public List<FormatoNomi> formatonomisEliminados;
	//public List<FormatoNomi> formatonomisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoFormatoNomi=false;
	public Boolean isVisibilidadCeldaDuplicarFormatoNomi=true;
	public Boolean isVisibilidadCeldaCopiarFormatoNomi=true;
	public Boolean isVisibilidadCeldaVerFormFormatoNomi=true;
	public Boolean isVisibilidadCeldaOrdenFormatoNomi=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesFormatoNomi=false;
	public Boolean isVisibilidadCeldaModificarFormatoNomi=false;
	public Boolean isVisibilidadCeldaActualizarFormatoNomi=false;
	public Boolean isVisibilidadCeldaEliminarFormatoNomi=false;
	public Boolean isVisibilidadCeldaCancelarFormatoNomi=false;
	public Boolean isVisibilidadCeldaGuardarFormatoNomi=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosFormatoNomi=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstructura=false;
	public Boolean isVisibilidadFK_IdPuntajeNomi=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoFormatoNomi() {
		return this.iIdNuevoFormatoNomi;
	}

	public void setiIdNuevoFormatoNomi(Long iIdNuevoFormatoNomi) {
		this.iIdNuevoFormatoNomi = iIdNuevoFormatoNomi;
	}
	
	public Long getidFormatoNomiActual() {
		return this.idFormatoNomiActual;
	}

	public void setidFormatoNomiActual(Long idFormatoNomiActual) {
		this.idFormatoNomiActual = idFormatoNomiActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public FormatoNomi getformatonomi() {
		return this.formatonomi;
	}

	public void setformatonomi(FormatoNomi formatonomi) {
		this.formatonomi = formatonomi;
	}
	
	public FormatoNomi getformatonomiAux() {
		return this.formatonomiAux;
	}

	public void setformatonomiAux(FormatoNomi formatonomiAux) {
		this.formatonomiAux = formatonomiAux;
	}				
	
	public FormatoNomi getformatonomiAnterior() {
		return this.formatonomiAnterior;
	}

	public void setformatonomiAnterior(FormatoNomi formatonomiAnterior) {
		this.formatonomiAnterior = formatonomiAnterior;
	}	
	
	public FormatoNomi getformatonomiTotales() {
		return this.formatonomiTotales;
	}

	public void setformatonomiTotales(FormatoNomi formatonomiTotales) {
		this.formatonomiTotales = formatonomiTotales;
	}	
	
	public FormatoNomi getformatonomiBean() {
		return this.formatonomiBean;
	}

	public void setformatonomiBean(FormatoNomi formatonomiBean) {
		this.formatonomiBean = formatonomiBean;
	}	
	
	public FormatoNomiParameterReturnGeneral getformatonomiReturnGeneral() {
		return this.formatonomiReturnGeneral;
	}

	public void setformatonomiReturnGeneral(FormatoNomiParameterReturnGeneral formatonomiReturnGeneral) {
		this.formatonomiReturnGeneral = formatonomiReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_estructuraFK_IdEstructura=-1L;

	public Long getid_estructuraFK_IdEstructura() {
		return this.id_estructuraFK_IdEstructura;
	}

	public void setid_estructuraFK_IdEstructura(Long id_estructuraFK_IdEstructura) {
		this.id_estructuraFK_IdEstructura = id_estructuraFK_IdEstructura;
	}

	public Long id_puntaje_nomiFK_IdPuntajeNomi=-1L;

	public Long getid_puntaje_nomiFK_IdPuntajeNomi() {
		return this.id_puntaje_nomiFK_IdPuntajeNomi;
	}

	public void setid_puntaje_nomiFK_IdPuntajeNomi(Long id_puntaje_nomiFK_IdPuntajeNomi) {
		this.id_puntaje_nomiFK_IdPuntajeNomi = id_puntaje_nomiFK_IdPuntajeNomi;
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
	
	
	public FormatoNomiLogic getFormatoNomiLogic()	{		
		return formatonomiLogic;
	}

	public void setFormatoNomiLogic(FormatoNomiLogic formatonomiLogic) {
		this.formatonomiLogic = formatonomiLogic;
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
	
	public Boolean getIsEsNuevoFormatoNomi() {
		return isEsNuevoFormatoNomi;
	}

	public void setIsEsNuevoFormatoNomi(Boolean isEsNuevoFormatoNomi) {
		this.isEsNuevoFormatoNomi = isEsNuevoFormatoNomi;
	}

	public Boolean getEsParaAccionDesdeFormularioFormatoNomi() {
		return esParaAccionDesdeFormularioFormatoNomi;
	}
	
	public void setEsParaAccionDesdeFormularioFormatoNomi(Boolean esParaAccionDesdeFormularioFormatoNomi) {
		this.esParaAccionDesdeFormularioFormatoNomi = esParaAccionDesdeFormularioFormatoNomi;
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

			if(this.formatonomiSessionBean==null) {
				this.formatonomiSessionBean=new FormatoNomiSessionBean();
			}

			if(!this.formatonomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(formatonomiSessionBean.getlidEmpresaActual());
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

			if(this.formatonomiSessionBean==null) {
				this.formatonomiSessionBean=new FormatoNomiSessionBean();
			}

			if(!this.formatonomiSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(formatonomiSessionBean.getlidSucursalActual());
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

	public void cargarCombosEstructurasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estructurasForeignKey=new ArrayList<Estructura>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstructuraLogic estructuraLogic=new EstructuraLogic();

			//estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

			if(this.formatonomiSessionBean==null) {
				this.formatonomiSessionBean=new FormatoNomiSessionBean();
			}

			if(!this.formatonomiSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

					estructuraLogic.getTodosEstructurasWithConnection(sFinalQuery,new Pagination());

					this.estructurasForeignKey=estructuraLogic.getEstructuras();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstructura(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estructuraLogic.getEntityWithConnection(formatonomiSessionBean.getlidEstructuraActual());
					this.estructurasForeignKey.add(estructuraLogic.getEstructura());
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

	public void cargarCombosPuntajeNomisForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.puntajenomisForeignKey=new ArrayList<PuntajeNomi>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PuntajeNomiLogic puntajenomiLogic=new PuntajeNomiLogic();

			//puntajenomiLogic.getPuntajeNomiDataAccess().setIsForForeingKeyData(true);

			if(this.formatonomiSessionBean==null) {
				this.formatonomiSessionBean=new FormatoNomiSessionBean();
			}

			if(!this.formatonomiSessionBean.getisBusquedaDesdeForeignKeySesionPuntajeNomi()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//puntajenomiLogic.getPuntajeNomiDataAccess().setIsForForeingKeyData(true);

					puntajenomiLogic.getTodosPuntajeNomisWithConnection(sFinalQuery,new Pagination());

					this.puntajenomisForeignKey=puntajenomiLogic.getPuntajeNomis();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPuntajeNomi(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					puntajenomiLogic.getEntityWithConnection(formatonomiSessionBean.getlidPuntajeNomiActual());
					this.puntajenomisForeignKey.add(puntajenomiLogic.getPuntajeNomi());
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

					if(this.formatonomi!=null) {
						this.formatonomi.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
						this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_empresaFormatoNomi.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaFormatoNomi.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
						if(this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_empresaFormatoNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_empresaFormatoNomi.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaFormatoNomiGenerico)throws Exception
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
				jComboBoxid_empresaFormatoNomiGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaFormatoNomiGenerico!=null && jComboBoxid_empresaFormatoNomiGenerico.getItemCount()>0) {
					jComboBoxid_empresaFormatoNomiGenerico.setSelectedIndex(0);
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

					if(this.formatonomi!=null) {
						this.formatonomi.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
						this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_sucursalFormatoNomi.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalFormatoNomi.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
						if(this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_sucursalFormatoNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_sucursalFormatoNomi.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalFormatoNomiGenerico)throws Exception
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
				jComboBoxid_sucursalFormatoNomiGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalFormatoNomiGenerico!=null && jComboBoxid_sucursalFormatoNomiGenerico.getItemCount()>0) {
					jComboBoxid_sucursalFormatoNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstructuraForeignKey(Long idEstructuraSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estructuraTemp!=null) {

					if(this.formatonomi!=null) {
						this.formatonomi.setEstructura(estructuraTemp);
					}

					if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
						this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_estructuraFormatoNomi.setSelectedItem(estructuraTemp);
					}
				} else {
					//jComboBoxid_estructuraFormatoNomi.setSelectedItem(estructuraTemp);
					if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
						if(this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_estructuraFormatoNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_estructuraFormatoNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuraTemp!=null && jComboBoxid_estructuraFK_IdEstructuraFormatoNomi!=null) {
						jComboBoxid_estructuraFK_IdEstructuraFormatoNomi.setSelectedItem(estructuraTemp);
					} else {
						if(jComboBoxid_estructuraFK_IdEstructuraFormatoNomi!=null) {
							//jComboBoxid_estructuraFK_IdEstructuraFormatoNomi.setSelectedItem(estructuraTemp);
							if(jComboBoxid_estructuraFK_IdEstructuraFormatoNomi.getItemCount()>0) {
								jComboBoxid_estructuraFK_IdEstructuraFormatoNomi.setSelectedIndex(0);
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

	public String getActualEstructuraForeignKeyDescripcion(Long idEstructuraSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}


			sDescripcion=EstructuraConstantesFunciones.getEstructuraDescripcion(estructuraTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstructuraForeignKeyGenerico(Long idEstructuraSeleccionado,JComboBox jComboBoxid_estructuraFormatoNomiGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}

			if(estructuraTemp!=null) {
				jComboBoxid_estructuraFormatoNomiGenerico.setSelectedItem(estructuraTemp);
			} else {
				if(jComboBoxid_estructuraFormatoNomiGenerico!=null && jComboBoxid_estructuraFormatoNomiGenerico.getItemCount()>0) {
					jComboBoxid_estructuraFormatoNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPuntajeNomiForeignKey(Long idPuntajeNomiSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			PuntajeNomi  puntajenomiTemp=null;

			for(PuntajeNomi puntajenomiAux:puntajenomisForeignKey) {
				if(puntajenomiAux.getId()!=null && puntajenomiAux.getId().equals(idPuntajeNomiSeleccionado)) {
					puntajenomiTemp=puntajenomiAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(puntajenomiTemp!=null) {

					if(this.formatonomi!=null) {
						this.formatonomi.setPuntajeNomi(puntajenomiTemp);
					}

					if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
						this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_puntaje_nomiFormatoNomi.setSelectedItem(puntajenomiTemp);
					}
				} else {
					//jComboBoxid_puntaje_nomiFormatoNomi.setSelectedItem(puntajenomiTemp);
					if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
						if(this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_puntaje_nomiFormatoNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_puntaje_nomiFormatoNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPuntajeNomi") || sFormularioTipoBusqueda.equals("Todos")){
					if(puntajenomiTemp!=null && jComboBoxid_puntaje_nomiFK_IdPuntajeNomiFormatoNomi!=null) {
						jComboBoxid_puntaje_nomiFK_IdPuntajeNomiFormatoNomi.setSelectedItem(puntajenomiTemp);
					} else {
						if(jComboBoxid_puntaje_nomiFK_IdPuntajeNomiFormatoNomi!=null) {
							//jComboBoxid_puntaje_nomiFK_IdPuntajeNomiFormatoNomi.setSelectedItem(puntajenomiTemp);
							if(jComboBoxid_puntaje_nomiFK_IdPuntajeNomiFormatoNomi.getItemCount()>0) {
								jComboBoxid_puntaje_nomiFK_IdPuntajeNomiFormatoNomi.setSelectedIndex(0);
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

	public String getActualPuntajeNomiForeignKeyDescripcion(Long idPuntajeNomiSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			PuntajeNomi  puntajenomiTemp=null;

			for(PuntajeNomi puntajenomiAux:puntajenomisForeignKey) {
				if(puntajenomiAux.getId()!=null && puntajenomiAux.getId().equals(idPuntajeNomiSeleccionado)) {
					puntajenomiTemp=puntajenomiAux;
					break;
				}
			}


			sDescripcion=PuntajeNomiConstantesFunciones.getPuntajeNomiDescripcion(puntajenomiTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPuntajeNomiForeignKeyGenerico(Long idPuntajeNomiSeleccionado,JComboBox jComboBoxid_puntaje_nomiFormatoNomiGenerico)throws Exception
	{
		try
		{
			PuntajeNomi  puntajenomiTemp=null;

			for(PuntajeNomi puntajenomiAux:puntajenomisForeignKey) {
				if(puntajenomiAux.getId()!=null && puntajenomiAux.getId().equals(idPuntajeNomiSeleccionado)) {
					puntajenomiTemp=puntajenomiAux;
					break;
				}
			}

			if(puntajenomiTemp!=null) {
				jComboBoxid_puntaje_nomiFormatoNomiGenerico.setSelectedItem(puntajenomiTemp);
			} else {
				if(jComboBoxid_puntaje_nomiFormatoNomiGenerico!=null && jComboBoxid_puntaje_nomiFormatoNomiGenerico.getItemCount()>0) {
					jComboBoxid_puntaje_nomiFormatoNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(FormatoNomi formatonomi,JComboBox jComboBoxid_empresaFormatoNomiGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaFormatoNomiGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_empresaFormatoNomi.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaFormatoNomiGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				formatonomi.setid_empresa(empresaAux.getId());
				formatonomi.setempresa_descripcion(FormatoNomiConstantesFunciones.getEmpresaDescripcion(empresaAux));
				formatonomi.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(FormatoNomi formatonomi,JComboBox jComboBoxid_sucursalFormatoNomiGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalFormatoNomiGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_sucursalFormatoNomi.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalFormatoNomiGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				formatonomi.setid_sucursal(sucursalAux.getId());
				formatonomi.setsucursal_descripcion(FormatoNomiConstantesFunciones.getSucursalDescripcion(sucursalAux));
				formatonomi.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraForeignKey(FormatoNomi formatonomi,JComboBox jComboBoxid_estructuraFormatoNomiGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructuraFormatoNomiGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_estructuraFormatoNomi.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructuraFormatoNomiGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				formatonomi.setid_estructura(estructuraAux.getId());
				formatonomi.setestructura_descripcion(FormatoNomiConstantesFunciones.getEstructuraDescripcion(estructuraAux));
				formatonomi.setEstructura(estructuraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPuntajeNomiForeignKey(FormatoNomi formatonomi,JComboBox jComboBoxid_puntaje_nomiFormatoNomiGenerico)throws Exception
	{
		try
		{
			PuntajeNomi  puntajenomiAux=new PuntajeNomi();

			if(jComboBoxid_puntaje_nomiFormatoNomiGenerico==null) {
				puntajenomiAux=(PuntajeNomi)this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_puntaje_nomiFormatoNomi.getSelectedItem();
			} else {
				puntajenomiAux=(PuntajeNomi)jComboBoxid_puntaje_nomiFormatoNomiGenerico.getSelectedItem();
			}

			if(puntajenomiAux!=null && puntajenomiAux.getId()!=null) {
				formatonomi.setid_puntaje_nomi(puntajenomiAux.getId());
				formatonomi.setpuntajenomi_descripcion(FormatoNomiConstantesFunciones.getPuntajeNomiDescripcion(puntajenomiAux));
				formatonomi.setPuntajeNomi(puntajenomiAux);			}
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

					if(!FormatoNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormatoNomi!=null) { 
							this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_empresaFormatoNomi.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_empresaFormatoNomi.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormatoNomi!=null) { 
					}

					if(!FormatoNomiJInternalFrame.ISBINDING_MANUAL) {
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

					if(!FormatoNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormatoNomi!=null) { 
							this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_sucursalFormatoNomi.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_sucursalFormatoNomi.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormatoNomi!=null) { 
					}

					if(!FormatoNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstructurasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstructura=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FormatoNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormatoNomi!=null) { 
							this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_estructuraFormatoNomi.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_estructuraFormatoNomi.addItem(estructura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormatoNomi!=null) { 
					}

					if(!FormatoNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FormatoNomiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraFormatoNomi.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jComboBoxid_estructuraFK_IdEstructuraFormatoNomi.addItem(estructura);
							}
						}

						if(!FormatoNomiJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePuntajeNomisForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPuntajeNomi=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FormatoNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormatoNomi!=null) { 
							this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_puntaje_nomiFormatoNomi.removeAllItems();

							for(PuntajeNomi puntajenomi:this.puntajenomisForeignKey) {
								this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_puntaje_nomiFormatoNomi.addItem(puntajenomi);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormatoNomi!=null) { 
					}

					if(!FormatoNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPuntajeNomi") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FormatoNomiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_puntaje_nomiFK_IdPuntajeNomiFormatoNomi.removeAllItems();

							for(PuntajeNomi puntajenomi:this.puntajenomisForeignKey) {
								this.jComboBoxid_puntaje_nomiFK_IdPuntajeNomiFormatoNomi.addItem(puntajenomi);
							}
						}

						if(!FormatoNomiJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
							this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_empresaFormatoNomi.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
							this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_empresaFormatoNomi.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
							this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_sucursalFormatoNomi.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
							this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_sucursalFormatoNomi.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEstructuraForeignKey(Estructura estructura,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
							this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_estructuraFormatoNomi.setSelectedItem(estructura);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
							this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_estructuraFormatoNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructuraFK_IdEstructuraFormatoNomi.setSelectedItem(estructura);
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraFormatoNomi.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFramePuntajeNomiForeignKey(PuntajeNomi puntajenomi,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
							this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_puntaje_nomiFormatoNomi.setSelectedItem(puntajenomi);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
							this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_puntaje_nomiFormatoNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_puntaje_nomiFK_IdPuntajeNomiFormatoNomi.setSelectedItem(puntajenomi);
						} else {
							this.jComboBoxid_puntaje_nomiFK_IdPuntajeNomiFormatoNomi.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesFormatoNomi() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			FormatoNomiConstantesFunciones.refrescarForeignKeysDescripcionesFormatoNomi(this.formatonomiLogic.getFormatoNomis());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			FormatoNomiConstantesFunciones.refrescarForeignKeysDescripcionesFormatoNomi(this.formatonomis);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Estructura.class));
		classes.add(new Classe(PuntajeNomi.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//formatonomiLogic.setFormatoNomis(this.formatonomis);
			formatonomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public FormatoNomiParameterReturnGeneral getFormatoNomiParameterGeneral() {
		return this.formatonomiParameterGeneral;
	}
	
	public void setFormatoNomiParameterGeneral(FormatoNomiParameterReturnGeneral formatonomiParameterGeneral) {
		this.formatonomiParameterGeneral = formatonomiParameterGeneral;
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
	
	public Boolean getIsPermisoTodoFormatoNomi() {
		return isPermisoTodoFormatoNomi;
	}

	public void setIsPermisoTodoFormatoNomi(Boolean isPermisoTodoFormatoNomi) {
		this.isPermisoTodoFormatoNomi = isPermisoTodoFormatoNomi;
	}

	public Boolean getIsPermisoNuevoFormatoNomi() {
		return isPermisoNuevoFormatoNomi;
	}

	public void setIsPermisoNuevoFormatoNomi(Boolean isPermisoNuevoFormatoNomi) {
		this.isPermisoNuevoFormatoNomi = isPermisoNuevoFormatoNomi;
	}

	public Boolean getIsPermisoActualizarFormatoNomi() {
		return isPermisoActualizarFormatoNomi;
	}

	public void setIsPermisoActualizarFormatoNomi(Boolean isPermisoActualizarFormatoNomi) {
		this.isPermisoActualizarFormatoNomi = isPermisoActualizarFormatoNomi;
	}

	public Boolean getIsPermisoEliminarFormatoNomi() {
		return isPermisoEliminarFormatoNomi;
	}

	public void setIsPermisoEliminarFormatoNomi(Boolean isPermisoEliminarFormatoNomi) {
		this.isPermisoEliminarFormatoNomi = isPermisoEliminarFormatoNomi;
	}

	public Boolean getIsPermisoGuardarCambiosFormatoNomi() {
		return isPermisoGuardarCambiosFormatoNomi;
	}

	public void setIsPermisoGuardarCambiosFormatoNomi(Boolean isPermisoGuardarCambiosFormatoNomi) {
		this.isPermisoGuardarCambiosFormatoNomi = isPermisoGuardarCambiosFormatoNomi;
	}
	
	public Boolean getIsPermisoConsultaFormatoNomi() {
		return isPermisoConsultaFormatoNomi;
	}

	public void setIsPermisoConsultaFormatoNomi(Boolean isPermisoConsultaFormatoNomi) {
		this.isPermisoConsultaFormatoNomi = isPermisoConsultaFormatoNomi;
	}

	public Boolean getIsPermisoBusquedaFormatoNomi() {
		return isPermisoBusquedaFormatoNomi;
	}

	public void setIsPermisoBusquedaFormatoNomi(Boolean isPermisoBusquedaFormatoNomi) {
		this.isPermisoBusquedaFormatoNomi = isPermisoBusquedaFormatoNomi;
	}

	public Boolean getIsPermisoReporteFormatoNomi() {
		return isPermisoReporteFormatoNomi;
	}

	public void setIsPermisoReporteFormatoNomi(Boolean isPermisoReporteFormatoNomi) {
		this.isPermisoReporteFormatoNomi = isPermisoReporteFormatoNomi;
	}
	
	public Boolean getIsPermisoPaginacionMedioFormatoNomi() {
		return isPermisoPaginacionMedioFormatoNomi;
	}

	public void setIsPermisoPaginacionMedioFormatoNomi(Boolean isPermisoPaginacionMedioFormatoNomi) {
		this.isPermisoPaginacionMedioFormatoNomi = isPermisoPaginacionMedioFormatoNomi;
	}
	
	public Boolean getIsPermisoPaginacionTodoFormatoNomi() {
		return isPermisoPaginacionTodoFormatoNomi;
	}

	public void setIsPermisoPaginacionTodoFormatoNomi(Boolean isPermisoPaginacionTodoFormatoNomi) {
		this.isPermisoPaginacionTodoFormatoNomi = isPermisoPaginacionTodoFormatoNomi;
	}
	
	public Boolean getIsPermisoPaginacionAltoFormatoNomi() {
		return isPermisoPaginacionAltoFormatoNomi;
	}

	public void setIsPermisoPaginacionAltoFormatoNomi(Boolean isPermisoPaginacionAltoFormatoNomi) {
		this.isPermisoPaginacionAltoFormatoNomi = isPermisoPaginacionAltoFormatoNomi;
	}
	
	public Boolean getIsPermisoCopiarFormatoNomi() {
		return isPermisoCopiarFormatoNomi;
	}

	public void setIsPermisoCopiarFormatoNomi(Boolean isPermisoCopiarFormatoNomi) {
		this.isPermisoCopiarFormatoNomi = isPermisoCopiarFormatoNomi;
	}
	
	public Boolean getIsPermisoVerFormFormatoNomi() {
		return isPermisoVerFormFormatoNomi;
	}

	public void setIsPermisoVerFormFormatoNomi(Boolean isPermisoVerFormFormatoNomi) {
		this.isPermisoVerFormFormatoNomi = isPermisoVerFormFormatoNomi;
	}
	
	public Boolean getIsPermisoDuplicarFormatoNomi() {
		return isPermisoDuplicarFormatoNomi;
	}

	public void setIsPermisoDuplicarFormatoNomi(Boolean isPermisoDuplicarFormatoNomi) {
		this.isPermisoDuplicarFormatoNomi = isPermisoDuplicarFormatoNomi;
	}
	
	public Boolean getIsPermisoOrdenFormatoNomi() {
		return isPermisoOrdenFormatoNomi;
	}

	public void setIsPermisoOrdenFormatoNomi(Boolean isPermisoOrdenFormatoNomi) {
		this.isPermisoOrdenFormatoNomi = isPermisoOrdenFormatoNomi;
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
	
	public Boolean getIsVisibilidadCeldaNuevoFormatoNomi() {
		return isVisibilidadCeldaNuevoFormatoNomi;
	}

	public void setIsVisibilidadCeldaNuevoFormatoNomi(Boolean isVisibilidadCeldaNuevoFormatoNomi) {
		this.isVisibilidadCeldaNuevoFormatoNomi = isVisibilidadCeldaNuevoFormatoNomi;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarFormatoNomi() {
		return isVisibilidadCeldaDuplicarFormatoNomi;
	}

	public void setIsVisibilidadCeldaDuplicarFormatoNomi(Boolean isVisibilidadCeldaDuplicarFormatoNomi) {
		this.isVisibilidadCeldaDuplicarFormatoNomi = isVisibilidadCeldaDuplicarFormatoNomi;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarFormatoNomi() {
		return isVisibilidadCeldaCopiarFormatoNomi;
	}

	public void setIsVisibilidadCeldaCopiarFormatoNomi(Boolean isVisibilidadCeldaCopiarFormatoNomi) {
		this.isVisibilidadCeldaCopiarFormatoNomi = isVisibilidadCeldaCopiarFormatoNomi;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormFormatoNomi() {
		return isVisibilidadCeldaVerFormFormatoNomi;
	}

	public void setIsVisibilidadCeldaVerFormFormatoNomi(Boolean isVisibilidadCeldaVerFormFormatoNomi) {
		this.isVisibilidadCeldaVerFormFormatoNomi = isVisibilidadCeldaVerFormFormatoNomi;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenFormatoNomi() {
		return isVisibilidadCeldaOrdenFormatoNomi;
	}

	public void setIsVisibilidadCeldaOrdenFormatoNomi(Boolean isVisibilidadCeldaOrdenFormatoNomi) {
		this.isVisibilidadCeldaOrdenFormatoNomi = isVisibilidadCeldaOrdenFormatoNomi;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesFormatoNomi() {
		return isVisibilidadCeldaNuevoRelacionesFormatoNomi;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesFormatoNomi(Boolean isVisibilidadCeldaNuevoRelacionesFormatoNomi) {
		this.isVisibilidadCeldaNuevoRelacionesFormatoNomi = isVisibilidadCeldaNuevoRelacionesFormatoNomi;
	}
	
	public Boolean getIsVisibilidadCeldaModificarFormatoNomi() {
		return isVisibilidadCeldaModificarFormatoNomi;
	}

	public void setIsVisibilidadCeldaModificarFormatoNomi(Boolean isVisibilidadCeldaModificarFormatoNomi) {
		this.isVisibilidadCeldaModificarFormatoNomi = isVisibilidadCeldaModificarFormatoNomi;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarFormatoNomi() {
		return isVisibilidadCeldaActualizarFormatoNomi;
	}

	public void setIsVisibilidadCeldaActualizarFormatoNomi(Boolean isVisibilidadCeldaActualizarFormatoNomi) {
		this.isVisibilidadCeldaActualizarFormatoNomi = isVisibilidadCeldaActualizarFormatoNomi;
	}

	public Boolean getIsVisibilidadCeldaEliminarFormatoNomi() {
		return isVisibilidadCeldaEliminarFormatoNomi;
	}

	public void setIsVisibilidadCeldaEliminarFormatoNomi(Boolean isVisibilidadCeldaEliminarFormatoNomi) {
		this.isVisibilidadCeldaEliminarFormatoNomi = isVisibilidadCeldaEliminarFormatoNomi;
	}

	public Boolean getIsVisibilidadCeldaCancelarFormatoNomi() {
		return isVisibilidadCeldaCancelarFormatoNomi;
	}

	public void setIsVisibilidadCeldaCancelarFormatoNomi(Boolean isVisibilidadCeldaCancelarFormatoNomi) {
		this.isVisibilidadCeldaCancelarFormatoNomi = isVisibilidadCeldaCancelarFormatoNomi;
	}

	public Boolean getIsVisibilidadCeldaGuardarFormatoNomi() {
		return isVisibilidadCeldaGuardarFormatoNomi;
	}

	public void setIsVisibilidadCeldaGuardarFormatoNomi(Boolean isVisibilidadCeldaGuardarFormatoNomi) {
		this.isVisibilidadCeldaGuardarFormatoNomi = isVisibilidadCeldaGuardarFormatoNomi;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosFormatoNomi() {
		return isVisibilidadCeldaGuardarCambiosFormatoNomi;
	}

	public void setIsVisibilidadCeldaGuardarCambiosFormatoNomi(Boolean isVisibilidadCeldaGuardarCambiosFormatoNomi) {
		this.isVisibilidadCeldaGuardarCambiosFormatoNomi = isVisibilidadCeldaGuardarCambiosFormatoNomi;
	}
		
	public FormatoNomiSessionBean getformatonomiSessionBean() {
		return this.formatonomiSessionBean;
	}
	
	public void setformatonomiSessionBean(FormatoNomiSessionBean formatonomiSessionBean) {
		this.formatonomiSessionBean=formatonomiSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdEstructura() {
		return this.isVisibilidadFK_IdEstructura;
	}

	public void setisVisibilidadFK_IdEstructura(Boolean isVisibilidadFK_IdEstructura) {
		this.isVisibilidadFK_IdEstructura=isVisibilidadFK_IdEstructura;
	}

	public Boolean getisVisibilidadFK_IdPuntajeNomi() {
		return this.isVisibilidadFK_IdPuntajeNomi;
	}

	public void setisVisibilidadFK_IdPuntajeNomi(Boolean isVisibilidadFK_IdPuntajeNomi) {
		this.isVisibilidadFK_IdPuntajeNomi=isVisibilidadFK_IdPuntajeNomi;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(FormatoNomi formatonomi)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(formatonomi,null);
				this.setActualParaGuardarSucursalForeignKey(formatonomi,null);
				this.setActualParaGuardarEstructuraForeignKey(formatonomi,null);
				this.setActualParaGuardarPuntajeNomiForeignKey(formatonomi,null);
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
	
	public void bugActualizarReferenciaActual(FormatoNomi formatonomi,FormatoNomi formatonomiAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalFormatoNomi(formatonomi);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		formatonomiAux.setId(formatonomi.getId());
		formatonomiAux.setVersionRow(formatonomi.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessFormatoNomi();
		
			int intSelectedRow = this.jTableDatosFormatoNomi.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomi =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.formatonomi =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(FormatoNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualFormatoNomi(this.formatonomi,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = formatonomiValidator.getInvalidValues(this.formatonomi);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			formatonomiLogic.setDatosCliente(datosCliente);
			formatonomiLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				formatonomiAux=new  FormatoNomi();
				
				formatonomiAux.setIsNew(true);
				formatonomiAux.setIsChanged(true);
				
				formatonomiAux.setFormatoNomiOriginal(this.formatonomi);
				
				formatonomiAux.setId(this.formatonomi.getId());	
				formatonomiAux.setVersionRow(this.formatonomi.getVersionRow());	
				formatonomiAux.setid_empresa(this.formatonomi.getid_empresa());	
				formatonomiAux.setid_sucursal(this.formatonomi.getid_sucursal());	
				formatonomiAux.setcodigo(this.formatonomi.getcodigo());	
				formatonomiAux.setnombre(this.formatonomi.getnombre());	
				formatonomiAux.setfecha(this.formatonomi.getfecha());	
				formatonomiAux.setinstrucciones(this.formatonomi.getinstrucciones());	
				formatonomiAux.setid_estructura(this.formatonomi.getid_estructura());	
				formatonomiAux.setid_puntaje_nomi(this.formatonomi.getid_puntaje_nomi());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.formatonomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.formatonomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(formatonomiAux,formatonomiLogic.getFormatoNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formatonomiAux,formatonomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.formatonomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.formatonomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomiLogic.saveFormatoNomis();//WithConnection
						//formatonomiLogic.getSetVersionRowFormatoNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.formatonomi,formatonomiAux);
					
					this.refrescarForeignKeysDescripcionesFormatoNomi();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.formatonomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().addAll(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomisEliminados);
							this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.getFormatoNomiFactorNomis().addAll(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomisEliminados);
							this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomiLogic.getEvaluacionNomis().addAll(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomisEliminados);
							this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().addAll(this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomis.addAll(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomisEliminados);
							this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomis.addAll(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomisEliminados);
							this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomis.addAll(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomisEliminados);
							this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomis.addAll(this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomisEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.formatonomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								formatonomiLogic.saveFormatoNomiRelaciones(formatonomiAux,this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis(),this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.getFormatoNomiFactorNomis(),this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomiLogic.getEvaluacionNomis(),this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());//WithConnection
								//formatonomiLogic.getSetVersionRowFormatoNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.formatonomi,formatonomiAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.setFormatoNomiPreguntaNomis(new ArrayList<FormatoNomiPreguntaNomi>());
							this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.setFormatoNomiFactorNomis(new ArrayList<FormatoNomiFactorNomi>());
							this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomiLogic.setEvaluacionNomis(new ArrayList<EvaluacionNomi>());
							this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.setDetalleEvaluacionNomis(new ArrayList<DetalleEvaluacionNomi>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomis= new ArrayList<FormatoNomiPreguntaNomi>();
							this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomis= new ArrayList<FormatoNomiFactorNomi>();
							this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomis= new ArrayList<EvaluacionNomi>();
							this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomis= new ArrayList<DetalleEvaluacionNomi>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();}
							formatonomiAux.setFormatoNomiPreguntaNomis(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());

							if(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.quitarFilaTotales();}
							formatonomiAux.setFormatoNomiFactorNomis(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.getFormatoNomiFactorNomis());

							if(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();}
							formatonomiAux.setEvaluacionNomis(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomiLogic.getEvaluacionNomis());

							if(this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();}
							formatonomiAux.setDetalleEvaluacionNomis(this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.formatonomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.formatonomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(formatonomiAux,formatonomiLogic.getFormatoNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(formatonomiAux,formatonomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.formatonomi,formatonomiAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				formatonomiAux=new  FormatoNomi();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.formatonomiSessionBean.getEsGuardarRelacionado() 
					|| (this.formatonomiSessionBean.getEsGuardarRelacionado() && this.formatonomi.getId()>=0)) {
						
					formatonomiAux.setIsNew(false);
				}
				
				formatonomiAux.setIsDeleted(false);
			
				formatonomiAux.setId(this.formatonomi.getId());	
				formatonomiAux.setVersionRow(this.formatonomi.getVersionRow());	
				formatonomiAux.setid_empresa(this.formatonomi.getid_empresa());	
				formatonomiAux.setid_sucursal(this.formatonomi.getid_sucursal());	
				formatonomiAux.setcodigo(this.formatonomi.getcodigo());	
				formatonomiAux.setnombre(this.formatonomi.getnombre());	
				formatonomiAux.setfecha(this.formatonomi.getfecha());	
				formatonomiAux.setinstrucciones(this.formatonomi.getinstrucciones());	
				formatonomiAux.setid_estructura(this.formatonomi.getid_estructura());	
				formatonomiAux.setid_puntaje_nomi(this.formatonomi.getid_puntaje_nomi());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(formatonomiAux,formatonomiLogic.getFormatoNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formatonomiAux,formatonomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.formatonomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.formatonomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomiLogic.saveFormatoNomis();//WithConnection
						//formatonomiLogic.getSetVersionRowFormatoNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.formatonomi,formatonomiAux);
					
					this.refrescarForeignKeysDescripcionesFormatoNomi();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.formatonomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().addAll(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomisEliminados);
							this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.getFormatoNomiFactorNomis().addAll(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomisEliminados);
							this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomiLogic.getEvaluacionNomis().addAll(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomisEliminados);
							this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().addAll(this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomis.addAll(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomisEliminados);
							this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomis.addAll(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomisEliminados);
							this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomis.addAll(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomisEliminados);
							this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomis.addAll(this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomisEliminados);
						}
						//ARCHITECTURE
						
						if(!this.formatonomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								formatonomiLogic.saveFormatoNomiRelaciones(formatonomiAux,this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis(),this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.getFormatoNomiFactorNomis(),this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomiLogic.getEvaluacionNomis(),this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());//WithConnection
								//formatonomiLogic.getSetVersionRowFormatoNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.formatonomi,formatonomiAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.setFormatoNomiPreguntaNomis(new ArrayList<FormatoNomiPreguntaNomi>());
							this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.setFormatoNomiFactorNomis(new ArrayList<FormatoNomiFactorNomi>());
							this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomiLogic.setEvaluacionNomis(new ArrayList<EvaluacionNomi>());
							this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.setDetalleEvaluacionNomis(new ArrayList<DetalleEvaluacionNomi>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomis= new ArrayList<FormatoNomiPreguntaNomi>();
							this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomis= new ArrayList<FormatoNomiFactorNomi>();
							this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomis= new ArrayList<EvaluacionNomi>();
							this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomis= new ArrayList<DetalleEvaluacionNomi>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();}
							formatonomiAux.setFormatoNomiPreguntaNomis(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());

							if(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.quitarFilaTotales();}
							formatonomiAux.setFormatoNomiFactorNomis(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.getFormatoNomiFactorNomis());

							if(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();}
							formatonomiAux.setEvaluacionNomis(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomiLogic.getEvaluacionNomis());

							if(this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();}
							formatonomiAux.setDetalleEvaluacionNomis(this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.formatonomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.formatonomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(formatonomiAux,formatonomiLogic.getFormatoNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(formatonomiAux,formatonomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.formatonomi,formatonomiAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				formatonomiAux=new  FormatoNomi();
				
				formatonomiAux.setIsNew(false);
				formatonomiAux.setIsChanged(false);
				
				formatonomiAux.setIsDeleted(true);
				
				formatonomiAux.setId(this.formatonomi.getId());	
				formatonomiAux.setVersionRow(this.formatonomi.getVersionRow());	
				formatonomiAux.setid_empresa(this.formatonomi.getid_empresa());	
				formatonomiAux.setid_sucursal(this.formatonomi.getid_sucursal());	
				formatonomiAux.setcodigo(this.formatonomi.getcodigo());	
				formatonomiAux.setnombre(this.formatonomi.getnombre());	
				formatonomiAux.setfecha(this.formatonomi.getfecha());	
				formatonomiAux.setinstrucciones(this.formatonomi.getinstrucciones());	
				formatonomiAux.setid_estructura(this.formatonomi.getid_estructura());	
				formatonomiAux.setid_puntaje_nomi(this.formatonomi.getid_puntaje_nomi());	
				
				if(this.formatonomiSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.formatonomiAux.getId()>=0) {	
						this.formatonomisEliminados.add(formatonomiAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(formatonomiAux,formatonomiLogic.getFormatoNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formatonomiAux,formatonomis);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.formatonomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.formatonomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomiLogic.saveFormatoNomis();//WithConnection
						//formatonomiLogic.getSetVersionRowFormatoNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.formatonomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().addAll(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomisEliminados);
							this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.getFormatoNomiFactorNomis().addAll(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomisEliminados);
							this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomiLogic.getEvaluacionNomis().addAll(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomisEliminados);
							this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis().addAll(this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomis.addAll(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomisEliminados);
							this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomis.addAll(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomisEliminados);
							this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomis.addAll(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomisEliminados);
							this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomis.addAll(this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomisEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.formatonomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.jInternalFrameDetalleFormEvaluacionNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								formatonomiLogic.saveFormatoNomiRelaciones(formatonomiAux,this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis(),this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.getFormatoNomiFactorNomis(),this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomiLogic.getEvaluacionNomis(),this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());//WithConnection
								//formatonomiLogic.getSetVersionRowFormatoNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.setFormatoNomiPreguntaNomis(new ArrayList<FormatoNomiPreguntaNomi>());
							this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.setFormatoNomiFactorNomis(new ArrayList<FormatoNomiFactorNomi>());
							this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomiLogic.setEvaluacionNomis(new ArrayList<EvaluacionNomi>());
							this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.setDetalleEvaluacionNomis(new ArrayList<DetalleEvaluacionNomi>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomis= new ArrayList<FormatoNomiPreguntaNomi>();
							this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomis= new ArrayList<FormatoNomiFactorNomi>();
							this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomis= new ArrayList<EvaluacionNomi>();
							this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomis= new ArrayList<DetalleEvaluacionNomi>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();}
							formatonomiAux.setFormatoNomiPreguntaNomis(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());

							if(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.quitarFilaTotales();}
							formatonomiAux.setFormatoNomiFactorNomis(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.getFormatoNomiFactorNomis());

							if(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();}
							formatonomiAux.setEvaluacionNomis(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomiLogic.getEvaluacionNomis());

							if(this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();}
							formatonomiAux.setDetalleEvaluacionNomis(this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.formatonomiSessionBean.getEstaModoGuardarRelaciones() 
								|| this.formatonomiSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(formatonomiAux,formatonomiLogic.getFormatoNomis());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(formatonomiAux,formatonomis);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.getFormatoNomis().addAll(this.formatonomisEliminados);
					
					formatonomiLogic.saveFormatoNomis();//WithConnection
					//formatonomiLogic.getSetVersionRowFormatoNomis();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesFormatoNomi();
				
				this.formatonomisEliminados= new ArrayList<FormatoNomi>();		
			}
			
			if(this.formatonomiSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatonomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Formato Nomi GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Formato Nomi",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.formatonomi=formatonomiAux;
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
      		//this.finishProcessFormatoNomi();
      	}
		
	}	
	
	public void actualizarRelaciones(FormatoNomi formatonomiLocal) throws Exception {
		
		if(this.formatonomiSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				formatonomiLocal.setFormatoNomiPreguntaNomis(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());
				formatonomiLocal.setFormatoNomiFactorNomis(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.getFormatoNomiFactorNomis());
				formatonomiLocal.setEvaluacionNomis(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomiLogic.getEvaluacionNomis());
				formatonomiLocal.setDetalleEvaluacionNomis(this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
			
			} else {
			
				formatonomiLocal.setFormatoNomiPreguntaNomis(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomis);
				formatonomiLocal.setFormatoNomiFactorNomis(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomis);
				formatonomiLocal.setEvaluacionNomis(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomis);
				formatonomiLocal.setDetalleEvaluacionNomis(this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomis);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(FormatoNomi formatonomiLocal) throws Exception {	
		if(this.formatonomiSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				formatonomiLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				formatonomiLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuraBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuraBeanSwingJInternalFrameLocal.actualizarLista(estructuraBeanSwingJInternalFrameLocal.estructura,this.estructurasForeignKey);

				estructuraBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuraBeanSwingJInternalFrameLocal.estructura);

				formatonomiLocal.setEstructura(estructuraBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey("Formulario");
				this.setActualEstructuraForeignKey(estructuraBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PuntajeNomiDetalleFormJInternalFrame.class)) {
				PuntajeNomiBeanSwingJInternalFrame puntajenomiBeanSwingJInternalFrameLocal=(PuntajeNomiBeanSwingJInternalFrame) ((PuntajeNomiDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				puntajenomiBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPuntajeNomi(puntajenomiBeanSwingJInternalFrameLocal.getpuntajenomi(),true);
				puntajenomiBeanSwingJInternalFrameLocal.actualizarLista(puntajenomiBeanSwingJInternalFrameLocal.puntajenomi,this.puntajenomisForeignKey);

				puntajenomiBeanSwingJInternalFrameLocal.actualizarRelaciones(puntajenomiBeanSwingJInternalFrameLocal.puntajenomi);

				formatonomiLocal.setPuntajeNomi(puntajenomiBeanSwingJInternalFrameLocal.puntajenomi);

				this.addItemDefectoCombosForeignKeyPuntajeNomi();
				this.cargarCombosFramePuntajeNomisForeignKey("Formulario");
				this.setActualPuntajeNomiForeignKey(puntajenomiBeanSwingJInternalFrameLocal.puntajenomi.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarFormatoNomiActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosFormatoNomi.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.formatonomi =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.formatonomi =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = formatonomiValidator.getInvalidValues(this.formatonomi);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(FormatoNomi formatonomi,List<FormatoNomi> formatonomis) throws Exception {
		try	{		
			FormatoNomiConstantesFunciones.actualizarLista(formatonomi,formatonomis,this.formatonomiSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(FormatoNomi formatonomi,List<FormatoNomi> formatonomis) throws Exception {
		try	{			
			FormatoNomiConstantesFunciones.actualizarSelectedLista(formatonomi,formatonomis);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<FormatoNomi> formatonomisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				formatonomisLocal=this.formatonomiLogic.getFormatoNomis();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				formatonomisLocal=this.formatonomis;
			}
			//ARCHITECTURE
		
			for(FormatoNomi formatonomiLocal:formatonomisLocal) {
				if(this.permiteMantenimiento(formatonomiLocal) && formatonomiLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+FormatoNomiConstantesFunciones.getFormatoNomiLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(FormatoNomiConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoNomi.jLabelid_empresaFormatoNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormatoNomiConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoNomi.jLabelid_sucursalFormatoNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormatoNomiConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoNomi.jLabelcodigoFormatoNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormatoNomiConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoNomi.jLabelnombreFormatoNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormatoNomiConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoNomi.jLabelfechaFormatoNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormatoNomiConstantesFunciones.INSTRUCCIONES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoNomi.jLabelinstruccionesFormatoNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormatoNomiConstantesFunciones.IDESTRUCTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoNomi.jLabelid_estructuraFormatoNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormatoNomiConstantesFunciones.IDPUNTAJENOMI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoNomi.jLabelid_puntaje_nomiFormatoNomi,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormatoNomi.jLabelid_empresaFormatoNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormatoNomi.jLabelid_sucursalFormatoNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormatoNomi.jLabelcodigoFormatoNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormatoNomi.jLabelnombreFormatoNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormatoNomi.jLabelfechaFormatoNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormatoNomi.jLabelinstruccionesFormatoNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormatoNomi.jLabelid_estructuraFormatoNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormatoNomi.jLabelid_puntaje_nomiFormatoNomi,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("FormatoNomiPreguntaNomi")) {
			if(this.formatonomi==null) {
				this.formatonomi= new FormatoNomi();
			}

			if(this.formatonomiSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoFormatoNomi
				this.setVariablesFormularioToObjetoActualFormatoNomi(this.formatonomi,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);

				this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.getformatonomipreguntanomi().setFormatoNomi(this.formatonomi);
			}

			return;
		}
		 else  if(sTipo.equals("FormatoNomiFactorNomi")) {
			if(this.formatonomi==null) {
				this.formatonomi= new FormatoNomi();
			}

			if(this.formatonomiSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoFormatoNomi
				this.setVariablesFormularioToObjetoActualFormatoNomi(this.formatonomi,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);

				this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.getformatonomifactornomi().setFormatoNomi(this.formatonomi);
			}

			return;
		}
		 else  if(sTipo.equals("EvaluacionNomi")) {
			if(this.formatonomi==null) {
				this.formatonomi= new FormatoNomi();
			}

			if(this.formatonomiSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoFormatoNomi
				this.setVariablesFormularioToObjetoActualFormatoNomi(this.formatonomi,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);

				this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.getevaluacionnomi().setFormatoNomi(this.formatonomi);
			}

			return;
		}
		 else  if(sTipo.equals("DetalleEvaluacionNomi")) {
			if(this.formatonomi==null) {
				this.formatonomi= new FormatoNomi();
			}

			if(this.formatonomiSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoFormatoNomi
				this.setVariablesFormularioToObjetoActualFormatoNomi(this.formatonomi,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);

				this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.getdetalleevaluacionnomi().setFormatoNomi(this.formatonomi);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoFormatoNomi--;	
		
		
		this.formatonomiAux=new FormatoNomi();
		
		this.formatonomiAux.setId(this.iIdNuevoFormatoNomi);
		this.formatonomiAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.formatonomiLogic.getFormatoNomis().add(this.formatonomiAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.formatonomis.add(this.formatonomiAux);
		}
		//ARCHITECTURE
		
		this.formatonomi=this.formatonomiAux;
		
		if(FormatoNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioFormatoNomi(this.formatonomi);
			this.setVariablesObjetoActualToFormularioForeignKeyFormatoNomi(this.formatonomi);
		}
				
		//this.setDefaultControlesFormatoNomi();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyFormatoNomi();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyFormatoNomi();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyFormatoNomi();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFormatoNomi(this.formatonomiBean,this.formatonomi,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(FormatoNomiConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.formatonomiSessionBean.getConGuardarRelaciones()) {
			classes=FormatoNomiConstantesFunciones.getClassesRelationshipsOfFormatoNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.formatonomiReturnGeneral=formatonomiLogic.procesarEventosFormatoNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.formatonomiLogic.getFormatoNomis(),this.formatonomi,this.formatonomiParameterGeneral,this.isEsNuevoFormatoNomi,classes);//this.formatonomiLogic.getFormatoNomi()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanFormatoNomi(this.formatonomiReturnGeneral,this.formatonomiBean,false);
		
		if(this.formatonomiReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyFormatoNomi(this.formatonomiReturnGeneral.getFormatoNomi());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioFormatoNomi(this.formatonomiReturnGeneral.getFormatoNomi());
		}
		
		if(this.formatonomiReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioFormatoNomi(this.formatonomiReturnGeneral.getFormatoNomi(),classes);//this.formatonomiBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualFormatoNomi(this.formatonomi,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyFormatoNomi();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyFormatoNomi();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FormatoNomiBeanSwingJInternalFrameAdditional.RecargarFormFormatoNomi(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingFormatoNomi(false);
						
			if(formatonomiSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado() && FormatoNomiPreguntaNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormatoNomiPreguntaNomiActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiSessionBean.getEsGuardarRelacionado() && FormatoNomiFactorNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormatoNomiFactorNomiActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomiSessionBean.getEsGuardarRelacionado() && EvaluacionNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEvaluacionNomiActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado() && DetalleEvaluacionNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleEvaluacionNomiActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(FormatoNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFormatoNomi();
			}
			
			this.actualizarVisualTableDatosFormatoNomi();
			
			this.jTableDatosFormatoNomi.setRowSelectionInterval(this.getIndiceNuevoFormatoNomi(), this.getIndiceNuevoFormatoNomi());
			
			this.seleccionarFilaTablaFormatoNomiActual();
						
			this.actualizarEstadoCeldasBotonesFormatoNomi("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesFormatoNomi(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormFormatoNomi.jTextFieldcodigoFormatoNomi.setEnabled(isHabilitar && this.formatonomiConstantesFunciones.activarcodigoFormatoNomi);
		this.jInternalFrameDetalleFormFormatoNomi.jTextAreanombreFormatoNomi.setEnabled(isHabilitar && this.formatonomiConstantesFunciones.activarnombreFormatoNomi);
		this.jInternalFrameDetalleFormFormatoNomi.jDateChooserfechaFormatoNomi.setEnabled(isHabilitar && this.formatonomiConstantesFunciones.activarfechaFormatoNomi);
		this.jInternalFrameDetalleFormFormatoNomi.jTextAreainstruccionesFormatoNomi.setEnabled(isHabilitar && this.formatonomiConstantesFunciones.activarinstruccionesFormatoNomi);	
		//
		this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_empresaFormatoNomi.setEnabled(isHabilitar && this.formatonomiConstantesFunciones.activarid_empresaFormatoNomi);//
		this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_sucursalFormatoNomi.setEnabled(isHabilitar && this.formatonomiConstantesFunciones.activarid_sucursalFormatoNomi);
		this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_estructuraFormatoNomi.setEnabled(isHabilitar && this.formatonomiConstantesFunciones.activarid_estructuraFormatoNomi);
		this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_puntaje_nomiFormatoNomi.setEnabled(isHabilitar && this.formatonomiConstantesFunciones.activarid_puntaje_nomiFormatoNomi);
	};
	
	public void setDefaultControlesFormatoNomi() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoFormatoNomi(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.formatonomiSessionBean.setConGuardarRelaciones(true);			
			this.formatonomiSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormFormatoNomi.jTabbedPaneRelacionesFormatoNomi.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomiSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.formatonomiSessionBean.setConGuardarRelaciones(false);			
			this.formatonomiSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormFormatoNomi.jTabbedPaneRelacionesFormatoNomi.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomiSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoFormatoNomi() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormatoNomi formatonomiAux:this.formatonomiLogic.getFormatoNomis()) {
				if(formatonomiAux.getId().equals(this.iIdNuevoFormatoNomi)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormatoNomi formatonomiAux:this.formatonomis) {
				if(formatonomiAux.getId().equals(this.iIdNuevoFormatoNomi)) {
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
	
	public int getIndiceActualFormatoNomi(FormatoNomi formatonomi,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormatoNomi formatonomiAux:this.formatonomiLogic.getFormatoNomis()) {
				if(formatonomiAux.getId().equals(formatonomi.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormatoNomi formatonomiAux:this.formatonomis) {
				if(formatonomiAux.getId().equals(formatonomi.getId())) {
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
	
	public void setCamposBaseDesdeOriginalFormatoNomi(FormatoNomi formatonomiOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormatoNomi formatonomiAux:this.formatonomiLogic.getFormatoNomis()) {
				if(formatonomiAux.getFormatoNomiOriginal().getId().equals(formatonomiOriginal.getId())) {
					existe=true;
					formatonomiOriginal.setId(formatonomiAux.getId());
					formatonomiOriginal.setVersionRow(formatonomiAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormatoNomi formatonomiAux:this.formatonomis) {
				if(formatonomiAux.getFormatoNomiOriginal().getId().equals(formatonomiOriginal.getId())) {
					existe=true;
					formatonomiOriginal.setId(formatonomiAux.getId());
					formatonomiOriginal.setVersionRow(formatonomiAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosFormatoNomi(Boolean esParaCancelar) throws Exception {
		formatonomisAux=new ArrayList<FormatoNomi>();
		formatonomiAux=new FormatoNomi();
		
		if(!this.formatonomiSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FormatoNomi formatonomiAux:this.formatonomiLogic.getFormatoNomis()) {
					if(formatonomiAux.getId()<0) {
						formatonomisAux.add(formatonomiAux);
					}		
				}
				this.iIdNuevoFormatoNomi=0L;
				this.formatonomiLogic.getFormatoNomis().removeAll(formatonomisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormatoNomi formatonomiAux:this.formatonomis) {
					if(formatonomiAux.getId()<0) {
						formatonomisAux.add(formatonomiAux);
					}		
				}
				this.iIdNuevoFormatoNomi=0L;
				this.formatonomis.removeAll(formatonomisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoFormatoNomi 
					&& this.formatonomiLogic.getFormatoNomis().size()>0
					) {
					formatonomiAux=this.formatonomiLogic.getFormatoNomis().get(this.formatonomiLogic.getFormatoNomis().size() - 1);
				
					if(formatonomiAux.getId()<0) {
						this.formatonomiLogic.getFormatoNomis().remove(formatonomiAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoFormatoNomi && this.formatonomis.size()>0) {
					formatonomiAux=this.formatonomis.get(this.formatonomis.size() - 1);
				
					if(formatonomiAux.getId()<0) {
						this.formatonomis.remove(formatonomiAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoFormatoNomi(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(formatonomi.getId()<0) {
				this.formatonomiLogic.getFormatoNomis().remove(this.formatonomi);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(formatonomi.getId()<0) {
				this.formatonomis.remove(this.formatonomi);
			}
		}			
	}
	
	public void setEstadosInicialesFormatoNomi(List<FormatoNomi> formatonomisAux) throws Exception {
		FormatoNomiConstantesFunciones.setEstadosInicialesFormatoNomi(formatonomisAux);
	}
	
	public void setEstadosInicialesFormatoNomi(FormatoNomi formatonomiAux) throws Exception {
		FormatoNomiConstantesFunciones.setEstadosInicialesFormatoNomi(formatonomiAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarFormatoNomiActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesFormatoNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarFormatoNomiActual()) {
				if(!this.isEsNuevoFormatoNomi) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesFormatoNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoFormatoNomi=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarFormatoNomiActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Formato Nomi ?", "MANTENIMIENTO DE Formato Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesFormatoNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(FormatoNomi formatonomi) throws Exception {
		FormatoNomiConstantesFunciones.seleccionarAsignar(this.formatonomi,formatonomi);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarFormatoNomi=this.isPermisoActualizarOriginalFormatoNomi;
			
			
			this.seleccionarAsignar(formatonomi);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FormatoNomiConstantesFunciones.quitarEspaciosFormatoNomi(this.formatonomi,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesFormatoNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.formatonomiSessionBean.setsFuncionBusquedaRapida(this.formatonomiSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoFormatoNomi) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosFormatoNomi(esParaCancelar);				
				this.cancelarNuevoFormatoNomi(esParaCancelar);								
			}
			
			this.formatonomi=new FormatoNomi();
			
			this.inicializarFormatoNomi();
			
			this.actualizarEstadoCeldasBotonesFormatoNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarFormatoNomi() throws Exception {
		try {
			FormatoNomiConstantesFunciones.inicializarFormatoNomi(this.formatonomi);
			
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
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.formatonomiLogic.getFormatoNomis().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteFormatoNomis(String sAccionBusqueda,List<FormatoNomi> formatonomisParaReportes) throws Exception {
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
					sPathReporteFinal="FormatoNomi"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="FormatoNomiMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("FormatoNomiMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="FormatoNomi"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Formato Nomis");		
		parameters.put("busquedapor", FormatoNomiConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(FormatoNomiPreguntaNomi.class));
			classes.add(new Classe(FormatoNomiFactorNomi.class));
			classes.add(new Classe(EvaluacionNomi.class));
			classes.add(new Classe(DetalleEvaluacionNomi.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					FormatoNomiLogic formatonomiLogicAuxiliar=new FormatoNomiLogic();
					formatonomiLogicAuxiliar.setDatosCliente(formatonomiLogic.getDatosCliente());				
					formatonomiLogicAuxiliar.setFormatoNomis(formatonomisParaReportes);
					
					formatonomiLogicAuxiliar.cargarRelacionesLoteForeignKeyFormatoNomiWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					formatonomisParaReportes=formatonomiLogicAuxiliar.getFormatoNomis();
					
					//formatonomiLogic.getNewConnexionToDeep();
					
					//for (FormatoNomi formatonomi:formatonomisParaReportes) {
					//	formatonomiLogic.deepLoad(formatonomi, false, DeepLoadType.INCLUDE, classes);
					//}						
					//formatonomiLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//formatonomiLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileFormatoNomiPreguntaNomi = AuxiliarReportes.class.getResourceAsStream("FormatoNomiPreguntaNomiDetalleRelacionesDesign.jasper");
			parameters.put("subreport_formatonomipreguntanomi", reportFileFormatoNomiPreguntaNomi);

			InputStream reportFileFormatoNomiFactorNomi = AuxiliarReportes.class.getResourceAsStream("FormatoNomiFactorNomiDetalleRelacionesDesign.jasper");
			parameters.put("subreport_formatonomifactornomi", reportFileFormatoNomiFactorNomi);

			InputStream reportFileEvaluacionNomi = AuxiliarReportes.class.getResourceAsStream("EvaluacionNomiDetalleRelacionesDesign.jasper");
			parameters.put("subreport_evaluacionnomi", reportFileEvaluacionNomi);

			InputStream reportFileDetalleEvaluacionNomi = AuxiliarReportes.class.getResourceAsStream("DetalleEvaluacionNomiDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detalleevaluacionnomi", reportFileDetalleEvaluacionNomi);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceFormatoNomi=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			FormatoNomiConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			FormatoNomiConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceFormatoNomi=new JRBeanArrayDataSource(FormatoNomiJInternalFrame.TraerFormatoNomiBeans(formatonomisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceFormatoNomi);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+FormatoNomiConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+FormatoNomiConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(FormatoNomiBean.TraerFormatoNomiBeans(formatonomisParaReportes).toArray()));
							
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
				this.generarExcelReporteFormatoNomis(sAccionBusqueda,sTipoArchivoReporte,formatonomisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalFormatoNomis(sAccionBusqueda,sTipoArchivoReporte,formatonomisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoFormatoNomiActionPerformed(null);
					//this.generarExcelReporteFormatoNomis(sAccionBusqueda,sTipoArchivoReporte,formatonomisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalFormatoNomis(sAccionBusqueda,sTipoArchivoReporte,formatonomisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesFormatoNomis(sAccionBusqueda,sTipoArchivoReporte,formatonomisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesFormatoNomis(sAccionBusqueda,sTipoArchivoReporte,formatonomisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteFormatoNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<FormatoNomi> formatonomisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formatonomi";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FormatoNomis");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFormatoNomi("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(FormatoNomi formatonomi : formatonomisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			FormatoNomiConstantesFunciones.generarExcelReporteDataFormatoNomi("NORMAL",row,workbook,formatonomi,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatonomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderFormatoNomi(String sTipo,Row row,Workbook workbook) {
		
		FormatoNomiConstantesFunciones.generarExcelReporteHeaderFormatoNomi(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalFormatoNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<FormatoNomi> formatonomisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formatonomi_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FormatoNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(FormatoNomi formatonomi : formatonomisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(FormatoNomiConstantesFunciones.getFormatoNomiDescripcion(formatonomi));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormatoNomiConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormatoNomiConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formatonomi.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormatoNomiConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormatoNomiConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formatonomi.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormatoNomiConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormatoNomiConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formatonomi.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormatoNomiConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormatoNomiConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formatonomi.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormatoNomiConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormatoNomiConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formatonomi.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormatoNomiConstantesFunciones.LABEL_INSTRUCCIONES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormatoNomiConstantesFunciones.LABEL_INSTRUCCIONES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formatonomi.getinstrucciones());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormatoNomiConstantesFunciones.LABEL_IDESTRUCTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormatoNomiConstantesFunciones.LABEL_IDESTRUCTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formatonomi.getestructura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormatoNomiConstantesFunciones.LABEL_IDPUNTAJENOMI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormatoNomiConstantesFunciones.LABEL_IDPUNTAJENOMI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formatonomi.getpuntajenomi_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatonomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesFormatoNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<FormatoNomi> formatonomisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<FormatoNomi> formatonomisRespaldo=null;
		
		classes=FormatoNomiConstantesFunciones.getClassesRelationshipsOfFormatoNomi(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.formatonomiLogic.setDatosCliente(this.datosCliente);
		this.formatonomiLogic.setDatosDeep(this.datosDeep);
		this.formatonomiLogic.setIsConDeep(true);
		
		formatonomisRespaldo=this.formatonomiLogic.getFormatoNomis();
		
		this.formatonomiLogic.setFormatoNomis(formatonomisParaReportes);	
		this.formatonomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		formatonomisParaReportes=this.formatonomiLogic.getFormatoNomis();
		this.formatonomiLogic.setFormatoNomis(formatonomisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formatonomi_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FormatoNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFormatoNomi("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(FormatoNomi formatonomi : formatonomisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderFormatoNomi("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			FormatoNomiConstantesFunciones.generarExcelReporteDataFormatoNomi("NORMAL",row,workbook,formatonomi,cellStyleDataAux);
		
			
			


				//FormatoNomiPreguntaNomi
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO))) {

				if(formatonomi.getFormatoNomiPreguntaNomis()!=null && formatonomi.getFormatoNomiPreguntaNomis().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					FormatoNomiPreguntaNomiConstantesFunciones.generarExcelReporteHeaderFormatoNomiPreguntaNomi("RELACIONADO",row,workbook);
				}

				if(formatonomi.getFormatoNomiPreguntaNomis()!=null) {
					i2=0;
					for(FormatoNomiPreguntaNomi formatonomipreguntanomi : formatonomi.getFormatoNomiPreguntaNomis()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						FormatoNomiPreguntaNomiConstantesFunciones.generarExcelReporteDataFormatoNomiPreguntaNomi("RELACIONADO",row,workbook,formatonomipreguntanomi,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//FormatoNomiFactorNomi
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO))) {

				if(formatonomi.getFormatoNomiFactorNomis()!=null && formatonomi.getFormatoNomiFactorNomis().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					FormatoNomiFactorNomiConstantesFunciones.generarExcelReporteHeaderFormatoNomiFactorNomi("RELACIONADO",row,workbook);
				}

				if(formatonomi.getFormatoNomiFactorNomis()!=null) {
					i2=0;
					for(FormatoNomiFactorNomi formatonomifactornomi : formatonomi.getFormatoNomiFactorNomis()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						FormatoNomiFactorNomiConstantesFunciones.generarExcelReporteDataFormatoNomiFactorNomi("RELACIONADO",row,workbook,formatonomifactornomi,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//EvaluacionNomi
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO))) {

				if(formatonomi.getEvaluacionNomis()!=null && formatonomi.getEvaluacionNomis().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					EvaluacionNomiConstantesFunciones.generarExcelReporteHeaderEvaluacionNomi("RELACIONADO",row,workbook);
				}

				if(formatonomi.getEvaluacionNomis()!=null) {
					i2=0;
					for(EvaluacionNomi evaluacionnomi : formatonomi.getEvaluacionNomis()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						EvaluacionNomiConstantesFunciones.generarExcelReporteDataEvaluacionNomi("RELACIONADO",row,workbook,evaluacionnomi,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//DetalleEvaluacionNomi
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO))) {

				if(formatonomi.getDetalleEvaluacionNomis()!=null && formatonomi.getDetalleEvaluacionNomis().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleEvaluacionNomiConstantesFunciones.generarExcelReporteHeaderDetalleEvaluacionNomi("RELACIONADO",row,workbook);
				}

				if(formatonomi.getDetalleEvaluacionNomis()!=null) {
					i2=0;
					for(DetalleEvaluacionNomi detalleevaluacionnomi : formatonomi.getDetalleEvaluacionNomis()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleEvaluacionNomiConstantesFunciones.generarExcelReporteDataDetalleEvaluacionNomi("RELACIONADO",row,workbook,detalleevaluacionnomi,cellStyleDataAuxHijo);
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
		cell.setCellValue(FormatoNomiConstantesFunciones.getFormatoNomiDescripcion(formatonomi));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatonomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoFormatoNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormatoNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoFormatoNomi.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormatoNomi.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessFormatoNomi() throws Exception {		
		this.startProcessFormatoNomi(true);
	}
	
	public void startProcessFormatoNomi(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasFormatoNomi ,this.jPanelParametrosReportesFormatoNomi, this.jScrollPanelDatosFormatoNomi,this.jPanelPaginacionFormatoNomi, this.jScrollPanelDatosEdicionFormatoNomi, this.jPanelAccionesFormatoNomi,this.jPanelAccionesFormularioFormatoNomi,this.jmenuBarFormatoNomi,this.jmenuBarDetalleFormatoNomi,this.jTtoolBarFormatoNomi,this.jTtoolBarDetalleFormatoNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasFormatoNomi=this.jTabbedPaneBusquedasFormatoNomi; 
		
		final JPanel jPanelParametrosReportesFormatoNomi=this.jPanelParametrosReportesFormatoNomi;
		//final JScrollPane jScrollPanelDatosFormatoNomi=this.jScrollPanelDatosFormatoNomi;
		final JTable jTableDatosFormatoNomi=this.jTableDatosFormatoNomi;		
		final JPanel jPanelPaginacionFormatoNomi=this.jPanelPaginacionFormatoNomi;
		//final JScrollPane jScrollPanelDatosEdicionFormatoNomi=this.jScrollPanelDatosEdicionFormatoNomi;
		final JPanel jPanelAccionesFormatoNomi=this.jPanelAccionesFormatoNomi;
		
		JPanel jPanelCamposAuxiliarFormatoNomi=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarFormatoNomi=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
			jPanelCamposAuxiliarFormatoNomi=this.jInternalFrameDetalleFormFormatoNomi.jPanelCamposFormatoNomi;
			jPanelAccionesFormularioAuxiliarFormatoNomi=this.jInternalFrameDetalleFormFormatoNomi.jPanelAccionesFormularioFormatoNomi;
		}
		
		final JPanel jPanelCamposFormatoNomi=jPanelCamposAuxiliarFormatoNomi;
		final JPanel jPanelAccionesFormularioFormatoNomi=jPanelAccionesFormularioAuxiliarFormatoNomi;
		
		
		final JMenuBar jmenuBarFormatoNomi=this.jmenuBarFormatoNomi;
		final JToolBar jTtoolBarFormatoNomi=this.jTtoolBarFormatoNomi;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarFormatoNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFormatoNomi=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
			jmenuBarDetalleAuxiliarFormatoNomi=this.jInternalFrameDetalleFormFormatoNomi.jmenuBarDetalleFormatoNomi;
			jTtoolBarDetalleAuxiliarFormatoNomi=this.jInternalFrameDetalleFormFormatoNomi.jTtoolBarDetalleFormatoNomi;
		}
		
		final JMenuBar jmenuBarDetalleFormatoNomi=jmenuBarDetalleAuxiliarFormatoNomi;
		final JToolBar jTtoolBarDetalleFormatoNomi=jTtoolBarDetalleAuxiliarFormatoNomi;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFormatoNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFormatoNomi;
			processRunnable.jTableDatos=jTableDatosFormatoNomi;
			processRunnable.jPanelCampos=jPanelCamposFormatoNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionFormatoNomi;
			processRunnable.jPanelAcciones=jPanelAccionesFormatoNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFormatoNomi;
			
			
			processRunnable.jmenuBar=jmenuBarFormatoNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFormatoNomi;
			processRunnable.jTtoolBar=jTtoolBarFormatoNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFormatoNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFormatoNomi ,jPanelParametrosReportesFormatoNomi,jTableDatosFormatoNomi, /*jScrollPanelDatosFormatoNomi,*/jPanelCamposFormatoNomi,jPanelPaginacionFormatoNomi, /*jScrollPanelDatosEdicionFormatoNomi,*/ jPanelAccionesFormatoNomi,jPanelAccionesFormularioFormatoNomi,jmenuBarFormatoNomi,jmenuBarDetalleFormatoNomi,jTtoolBarFormatoNomi,jTtoolBarDetalleFormatoNomi);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFormatoNomi ,jPanelParametrosReportesFormatoNomi, jScrollPanelDatosFormatoNomi,jPanelPaginacionFormatoNomi, jScrollPanelDatosEdicionFormatoNomi, jPanelAccionesFormatoNomi,jPanelAccionesFormularioFormatoNomi,jmenuBarFormatoNomi,jmenuBarDetalleFormatoNomi,jTtoolBarFormatoNomi,jTtoolBarDetalleFormatoNomi);
						
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
	
	public void finishProcessFormatoNomi() {// throws Exception 
		this.finishProcessFormatoNomi(true);
	}
	
	public void finishProcessFormatoNomi(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasFormatoNomi ,this.jPanelParametrosReportesFormatoNomi, this.jScrollPanelDatosFormatoNomi,this.jPanelPaginacionFormatoNomi, this.jScrollPanelDatosEdicionFormatoNomi, this.jPanelAccionesFormatoNomi,this.jPanelAccionesFormularioFormatoNomi,this.jmenuBarFormatoNomi,this.jmenuBarDetalleFormatoNomi,this.jTtoolBarFormatoNomi,this.jTtoolBarDetalleFormatoNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasFormatoNomi=this.jTabbedPaneBusquedasFormatoNomi; 
		
		final JPanel jPanelParametrosReportesFormatoNomi=this.jPanelParametrosReportesFormatoNomi;
		//final JScrollPane jScrollPanelDatosFormatoNomi=this.jScrollPanelDatosFormatoNomi;
		final JTable jTableDatosFormatoNomi=this.jTableDatosFormatoNomi;		
		final JPanel jPanelPaginacionFormatoNomi=this.jPanelPaginacionFormatoNomi;
		//final JScrollPane jScrollPanelDatosEdicionFormatoNomi=this.jScrollPanelDatosEdicionFormatoNomi;
		final JPanel jPanelAccionesFormatoNomi=this.jPanelAccionesFormatoNomi;
		
		JPanel jPanelCamposAuxiliarFormatoNomi=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarFormatoNomi=new JPanel();
		
		if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
			jPanelCamposAuxiliarFormatoNomi=this.jInternalFrameDetalleFormFormatoNomi.jPanelCamposFormatoNomi;
			jPanelAccionesFormularioAuxiliarFormatoNomi=this.jInternalFrameDetalleFormFormatoNomi.jPanelAccionesFormularioFormatoNomi;
		}
		
		final JPanel jPanelCamposFormatoNomi=jPanelCamposAuxiliarFormatoNomi;
		final JPanel jPanelAccionesFormularioFormatoNomi=jPanelAccionesFormularioAuxiliarFormatoNomi;
		
		
		final JMenuBar jmenuBarFormatoNomi=this.jmenuBarFormatoNomi;		
		final JToolBar jTtoolBarFormatoNomi=this.jTtoolBarFormatoNomi;
				
		JMenuBar jmenuBarDetalleAuxiliarFormatoNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFormatoNomi=new JToolBar();
		
		if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
			jmenuBarDetalleAuxiliarFormatoNomi=this.jInternalFrameDetalleFormFormatoNomi.jmenuBarDetalleFormatoNomi;
			jTtoolBarDetalleAuxiliarFormatoNomi=this.jInternalFrameDetalleFormFormatoNomi.jTtoolBarDetalleFormatoNomi;		
		}
		
		final JMenuBar jmenuBarDetalleFormatoNomi=jmenuBarDetalleAuxiliarFormatoNomi;
		final JToolBar jTtoolBarDetalleFormatoNomi=jTtoolBarDetalleAuxiliarFormatoNomi;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFormatoNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFormatoNomi;
			processRunnable.jTableDatos=jTableDatosFormatoNomi;
			processRunnable.jPanelCampos=jPanelCamposFormatoNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionFormatoNomi;
			processRunnable.jPanelAcciones=jPanelAccionesFormatoNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFormatoNomi;
			
			
			processRunnable.jmenuBar=jmenuBarFormatoNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFormatoNomi;
			processRunnable.jTtoolBar=jTtoolBarFormatoNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFormatoNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasFormatoNomi ,jPanelParametrosReportesFormatoNomi, jTableDatosFormatoNomi,/*jScrollPanelDatosFormatoNomi,*/jPanelCamposFormatoNomi,jPanelPaginacionFormatoNomi, /*jScrollPanelDatosEdicionFormatoNomi,*/ jPanelAccionesFormatoNomi,jPanelAccionesFormularioFormatoNomi,jmenuBarFormatoNomi,jmenuBarDetalleFormatoNomi,jTtoolBarFormatoNomi,jTtoolBarDetalleFormatoNomi));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesFormatoNomi(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarFormatoNomi(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuFormatoNomi(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarFormatoNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarFormatoNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleFormatoNomi,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuFormatoNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarFormatoNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleFormatoNomi,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.formatonomiConstantesFunciones.getsFinalQueryFormatoNomi();
		String  finalQueryPaginacionTodos=this.formatonomiConstantesFunciones.getsFinalQueryFormatoNomi();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=FormatoNomiConstantesFunciones.getArrayColumnasGlobalesNoFormatoNomi(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=FormatoNomiConstantesFunciones.getArrayColumnasGlobalesFormatoNomi(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,FormatoNomiConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.formatonomisEliminados= new ArrayList<FormatoNomi>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessFormatoNomi();
		
				///*FormatoNomiSessionBean*/this.formatonomiSessionBean=new FormatoNomiSessionBean();
			
			if(this.formatonomiSessionBean==null) {
				this.formatonomiSessionBean=new FormatoNomiSessionBean();
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
					this.iNumeroPaginacion=FormatoNomiConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=FormatoNomiConstantesFunciones.getClassesForeignKeysOfFormatoNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/formatonomi."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			formatonomisAux= new ArrayList<FormatoNomi>();
			
				
			formatonomiLogic.setDatosCliente(this.datosCliente);
			formatonomiLogic.setDatosDeep(this.datosDeep);
			formatonomiLogic.setIsConDeep(true);
			
			
			formatonomiLogic.getFormatoNomiDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					formatonomiLogic.getTodosFormatoNomis(finalQueryGlobal,pagination);
					
					//formatonomiLogic.getTodosFormatoNomisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(formatonomiLogic.getFormatoNomis()==null|| formatonomiLogic.getFormatoNomis().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							formatonomisAux= new ArrayList<FormatoNomi>();
							formatonomisAux.addAll(formatonomiLogic.getFormatoNomis());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomisAux= new ArrayList<FormatoNomi>();
							formatonomisAux.addAll(formatonomis);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							formatonomiLogic.getTodosFormatoNomis(finalQueryGlobal+"",this.pagination);												
							
							//formatonomiLogic.getTodosFormatoNomisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteFormatoNomis("Todos",formatonomiLogic.getFormatoNomis() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							formatonomiLogic.setFormatoNomis(new ArrayList<FormatoNomi>());					
							formatonomiLogic.getFormatoNomis().addAll(formatonomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomis=new ArrayList<FormatoNomi>();
							formatonomis.addAll(formatonomisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idFormatoNomi=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idFormatoNomi=this.idActual;
				
				} else if(this.idFormatoNomiActual!=null && this.idFormatoNomiActual!=0L) {
					idFormatoNomi=idFormatoNomiActual;
				}
				
					
				this.sDetalleReporte=FormatoNomiConstantesFunciones.getDetalleIndicePorId(idFormatoNomi);
				
				this.formatonomis=new ArrayList<FormatoNomi>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					formatonomiLogic.getEntity(idFormatoNomi);
					
					//formatonomiLogic.getEntityWithConnection(idFormatoNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatonomiLogic.setFormatoNomis(new ArrayList<FormatoNomi>());
					formatonomiLogic.getFormatoNomis().add(formatonomiLogic.getFormatoNomi());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formatonomis=new ArrayList<FormatoNomi>();
					this.formatonomis.add(formatonomi);
				}
				
				if(formatonomiLogic.getFormatoNomi()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=FormatoNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formatonomiLogic.getFormatoNomisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formatonomiLogic.getFormatoNomis()==null||formatonomiLogic.getFormatoNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formatonomis==null|| formatonomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomisAux=new ArrayList<FormatoNomi>();
						formatonomisAux.addAll(formatonomiLogic.getFormatoNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomisAux=new ArrayList<FormatoNomi>();
							formatonomisAux.addAll(formatonomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formatonomiLogic.getFormatoNomisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormatoNomis("FK_IdEmpresa",formatonomiLogic.getFormatoNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormatoNomis("FK_IdEmpresa",formatonomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomiLogic.setFormatoNomis(new ArrayList<FormatoNomi>());
						formatonomiLogic.getFormatoNomis().addAll(formatonomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomis=new ArrayList<FormatoNomi>();
							formatonomis.addAll(formatonomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstructura")) {
				this.sDetalleReporte=FormatoNomiConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formatonomiLogic.getFormatoNomisFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoNomiConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoNomiConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formatonomiLogic.getFormatoNomis()==null||formatonomiLogic.getFormatoNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formatonomis==null|| formatonomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomisAux=new ArrayList<FormatoNomi>();
						formatonomisAux.addAll(formatonomiLogic.getFormatoNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomisAux=new ArrayList<FormatoNomi>();
							formatonomisAux.addAll(formatonomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formatonomiLogic.getFormatoNomisFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoNomiConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoNomiConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormatoNomis("FK_IdEstructura",formatonomiLogic.getFormatoNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormatoNomis("FK_IdEstructura",formatonomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomiLogic.setFormatoNomis(new ArrayList<FormatoNomi>());
						formatonomiLogic.getFormatoNomis().addAll(formatonomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomis=new ArrayList<FormatoNomi>();
							formatonomis.addAll(formatonomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPuntajeNomi")) {
				this.sDetalleReporte=FormatoNomiConstantesFunciones.getDetalleIndiceFK_IdPuntajeNomi(id_puntaje_nomiFK_IdPuntajeNomi);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formatonomiLogic.getFormatoNomisFK_IdPuntajeNomi(finalQueryGlobal,pagination,id_puntaje_nomiFK_IdPuntajeNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoNomiConstantesFunciones.getDetalleIndiceFK_IdPuntajeNomi(id_puntaje_nomiFK_IdPuntajeNomi);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoNomiConstantesFunciones.getDetalleIndiceFK_IdPuntajeNomi(id_puntaje_nomiFK_IdPuntajeNomi);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formatonomiLogic.getFormatoNomis()==null||formatonomiLogic.getFormatoNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formatonomis==null|| formatonomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomisAux=new ArrayList<FormatoNomi>();
						formatonomisAux.addAll(formatonomiLogic.getFormatoNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomisAux=new ArrayList<FormatoNomi>();
							formatonomisAux.addAll(formatonomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formatonomiLogic.getFormatoNomisFK_IdPuntajeNomi(finalQueryGlobal,pagination,id_puntaje_nomiFK_IdPuntajeNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoNomiConstantesFunciones.getDetalleIndiceFK_IdPuntajeNomi(id_puntaje_nomiFK_IdPuntajeNomi);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoNomiConstantesFunciones.getDetalleIndiceFK_IdPuntajeNomi(id_puntaje_nomiFK_IdPuntajeNomi);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormatoNomis("FK_IdPuntajeNomi",formatonomiLogic.getFormatoNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormatoNomis("FK_IdPuntajeNomi",formatonomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomiLogic.setFormatoNomis(new ArrayList<FormatoNomi>());
						formatonomiLogic.getFormatoNomis().addAll(formatonomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomis=new ArrayList<FormatoNomi>();
							formatonomis.addAll(formatonomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=FormatoNomiConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formatonomiLogic.getFormatoNomisFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoNomiConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoNomiConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formatonomiLogic.getFormatoNomis()==null||formatonomiLogic.getFormatoNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formatonomis==null|| formatonomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomisAux=new ArrayList<FormatoNomi>();
						formatonomisAux.addAll(formatonomiLogic.getFormatoNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomisAux=new ArrayList<FormatoNomi>();
							formatonomisAux.addAll(formatonomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formatonomiLogic.getFormatoNomisFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormatoNomiConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormatoNomiConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormatoNomis("FK_IdSucursal",formatonomiLogic.getFormatoNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormatoNomis("FK_IdSucursal",formatonomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomiLogic.setFormatoNomis(new ArrayList<FormatoNomi>());
						formatonomiLogic.getFormatoNomis().addAll(formatonomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomis=new ArrayList<FormatoNomi>();
							formatonomis.addAll(formatonomisAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesFormatoNomi();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessFormatoNomi();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=formatonomiLogic.getFormatoNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formatonomis.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=formatonomiLogic.getFormatoNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formatonomis.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(FormatoNomi formatonomi) {
		Boolean permite=true;
		
		if(this.formatonomi.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=FormatoNomiConstantesFunciones.getOrderByListaFormatoNomi();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=FormatoNomiConstantesFunciones.getOrderByListaFormatoNomi();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormatoNomi formatonomi:formatonomiLogic.getFormatoNomis()) {
				if(formatonomi.getsType().equals(Constantes2.S_TOTALES)) {
					formatonomiTotales=formatonomi;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormatoNomi formatonomi:this.formatonomis) {
				if(formatonomi.getsType().equals(Constantes2.S_TOTALES)) {
					formatonomiTotales=formatonomi;
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
			this.formatonomiAux=new FormatoNomi();
			this.formatonomiAux.setsType(Constantes2.S_TOTALES);
			this.formatonomiAux.setIsNew(false);
			this.formatonomiAux.setIsChanged(false);
			this.formatonomiAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				FormatoNomiConstantesFunciones.TotalizarValoresFilaFormatoNomi(this.formatonomiLogic.getFormatoNomis(),this.formatonomiAux);
				
				this.formatonomiLogic.getFormatoNomis().add(this.formatonomiAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				FormatoNomiConstantesFunciones.TotalizarValoresFilaFormatoNomi(this.formatonomis,this.formatonomiAux);
				
				this.formatonomis.add(this.formatonomiAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		formatonomiTotales=new FormatoNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.formatonomiLogic.getFormatoNomis().remove(formatonomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.formatonomis.remove(formatonomiTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		formatonomiTotales=new FormatoNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormatoNomi formatonomi:formatonomiLogic.getFormatoNomis()) {
				if(formatonomi.getsType().equals(Constantes2.S_TOTALES)) {
					formatonomiTotales=formatonomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FormatoNomiConstantesFunciones.TotalizarValoresFilaFormatoNomi(this.formatonomiLogic.getFormatoNomis(),formatonomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormatoNomi formatonomi:this.formatonomis) {
				if(formatonomi.getsType().equals(Constantes2.S_TOTALES)) {
					formatonomiTotales=formatonomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FormatoNomiConstantesFunciones.TotalizarValoresFilaFormatoNomi(this.formatonomis,formatonomiTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getFormatoNomisFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormatoNomisFK_IdEstructura()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstructura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormatoNomisFK_IdPuntajeNomi()throws Exception {
		try {
			sAccionBusqueda="FK_IdPuntajeNomi";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormatoNomisFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getFormatoNomisFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatonomiLogic.getFormatoNomisFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormatoNomisFK_IdEstructura(String sFinalQuery,Long id_estructura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatonomiLogic.getFormatoNomisFK_IdEstructura(sFinalQuery,this.pagination,id_estructura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormatoNomisFK_IdPuntajeNomi(String sFinalQuery,Long id_puntaje_nomi)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatonomiLogic.getFormatoNomisFK_IdPuntajeNomi(sFinalQuery,this.pagination,id_puntaje_nomi);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormatoNomisFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatonomiLogic.getFormatoNomisFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosFormatoNomi() {
		this.isPermisoTodoFormatoNomi=false;
		this.isPermisoNuevoFormatoNomi=false;
		this.isPermisoActualizarFormatoNomi=false;
		this.isPermisoActualizarOriginalFormatoNomi=false;
		this.isPermisoEliminarFormatoNomi=false;
		this.isPermisoGuardarCambiosFormatoNomi=false;
		this.isPermisoConsultaFormatoNomi=false;
		this.isPermisoBusquedaFormatoNomi=false;
		this.isPermisoReporteFormatoNomi=false;		
		this.isPermisoOrdenFormatoNomi=false;		
		this.isPermisoPaginacionMedioFormatoNomi=false;		
		this.isPermisoPaginacionAltoFormatoNomi=false;
		this.isPermisoPaginacionTodoFormatoNomi=false;
		this.isPermisoCopiarFormatoNomi=false;		
		this.isPermisoVerFormFormatoNomi=false;		
		this.isPermisoDuplicarFormatoNomi=false;		
		this.isPermisoOrdenFormatoNomi=false;		
	}
	
	public void setPermisosUsuarioFormatoNomi(Boolean isPermiso) {
		this.isPermisoTodoFormatoNomi=isPermiso;
		this.isPermisoNuevoFormatoNomi=isPermiso;
		this.isPermisoActualizarFormatoNomi=isPermiso;
		this.isPermisoActualizarOriginalFormatoNomi=isPermiso;
		this.isPermisoEliminarFormatoNomi=isPermiso;
		this.isPermisoGuardarCambiosFormatoNomi=isPermiso;
		this.isPermisoConsultaFormatoNomi=isPermiso;
		this.isPermisoBusquedaFormatoNomi=isPermiso;
		this.isPermisoReporteFormatoNomi=isPermiso;
		this.isPermisoOrdenFormatoNomi=isPermiso;		
		this.isPermisoPaginacionMedioFormatoNomi=isPermiso;		
		this.isPermisoPaginacionAltoFormatoNomi=isPermiso;		
		this.isPermisoPaginacionTodoFormatoNomi=isPermiso;		
		this.isPermisoCopiarFormatoNomi=isPermiso;		
		this.isPermisoVerFormFormatoNomi=isPermiso;		
		this.isPermisoDuplicarFormatoNomi=isPermiso;
		this.isPermisoOrdenFormatoNomi=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioFormatoNomi(Boolean isPermiso) {
		//this.isPermisoTodoFormatoNomi=isPermiso;
		this.isPermisoNuevoFormatoNomi=isPermiso;
		this.isPermisoActualizarFormatoNomi=isPermiso;
		this.isPermisoActualizarOriginalFormatoNomi=isPermiso;
		this.isPermisoEliminarFormatoNomi=isPermiso;
		this.isPermisoGuardarCambiosFormatoNomi=isPermiso;
		//this.isPermisoConsultaFormatoNomi=isPermiso;
		//this.isPermisoBusquedaFormatoNomi=isPermiso;
		//this.isPermisoReporteFormatoNomi=isPermiso;
		//this.isPermisoOrdenFormatoNomi=isPermiso;		
		//this.isPermisoPaginacionMedioFormatoNomi=isPermiso;		
		//this.isPermisoPaginacionAltoFormatoNomi=isPermiso;		
		//this.isPermisoPaginacionTodoFormatoNomi=isPermiso;		
		//this.isPermisoCopiarFormatoNomi=isPermiso;		
		//this.isPermisoDuplicarFormatoNomi=isPermiso;
		//this.isPermisoOrdenFormatoNomi=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioFormatoNomiClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(FormatoNomiPreguntaNomiConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(FormatoNomiFactorNomiConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(EvaluacionNomiConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(DetalleEvaluacionNomiConstantesFunciones.SNOMBREOPCION);
		
		if(FormatoNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosFormatoNomiPreguntaNomi=false;
		this.isTienePermisosFormatoNomiPreguntaNomi=this.verificarGetPermisosUsuarioOpcionFormatoNomiClaseRelacionada(this.opcionsRelacionadas,FormatoNomiPreguntaNomiConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosFormatoNomiFactorNomi=false;
		this.isTienePermisosFormatoNomiFactorNomi=this.verificarGetPermisosUsuarioOpcionFormatoNomiClaseRelacionada(this.opcionsRelacionadas,FormatoNomiFactorNomiConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosEvaluacionNomi=false;
		this.isTienePermisosEvaluacionNomi=this.verificarGetPermisosUsuarioOpcionFormatoNomiClaseRelacionada(this.opcionsRelacionadas,EvaluacionNomiConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosDetalleEvaluacionNomi=false;
		this.isTienePermisosDetalleEvaluacionNomi=this.verificarGetPermisosUsuarioOpcionFormatoNomiClaseRelacionada(this.opcionsRelacionadas,DetalleEvaluacionNomiConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebFormatoNomi(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioFormatoNomiClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosFormatoNomiPreguntaNomi=conPermiso;
		this.isTienePermisosFormatoNomiFactorNomi=conPermiso;
		this.isTienePermisosEvaluacionNomi=conPermiso;
		this.isTienePermisosDetalleEvaluacionNomi=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioFormatoNomiClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionFormatoNomiClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioFormatoNomiClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosFormatoNomiPreguntaNomi && this.jInternalFrameDetalleFormFormatoNomi!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormFormatoNomi.jTabbedPaneRelacionesFormatoNomi.remove(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosFormatoNomiFactorNomi && this.jInternalFrameDetalleFormFormatoNomi!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormFormatoNomi.jTabbedPaneRelacionesFormatoNomi.remove(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosEvaluacionNomi && this.jInternalFrameDetalleFormFormatoNomi!=null && this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormFormatoNomi.jTabbedPaneRelacionesFormatoNomi.remove(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosDetalleEvaluacionNomi && this.jInternalFrameDetalleFormFormatoNomi!=null && this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormFormatoNomi.jTabbedPaneRelacionesFormatoNomi.remove(this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioFormatoNomi() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(FormatoNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.formatonomiSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, FormatoNomiConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoFormatoNomi=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarFormatoNomi=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalFormatoNomi=this.isPermisoActualizarFormatoNomi;
			this.isPermisoEliminarFormatoNomi=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosFormatoNomi=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaFormatoNomi=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaFormatoNomi=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoFormatoNomi=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteFormatoNomi=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFormatoNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioFormatoNomi=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoFormatoNomi=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoFormatoNomi=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarFormatoNomi=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormFormatoNomi=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarFormatoNomi=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFormatoNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.formatonomiSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosFormatoNomi.setToolTipText(this.jTableDatosFormatoNomi.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioFormatoNomi(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioFormatoNomi(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(FormatoNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(FormatoNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioFormatoNomi() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosFormatoNomiPreguntaNomi && this.formatonomiConstantesFunciones.mostrarFormatoNomiPreguntaNomiFormatoNomi && !FormatoNomiConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Formato Nomi Pregunta Nomi");
			reporte.setsDescripcion("Formato Nomi Pregunta Nomi");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosFormatoNomiFactorNomi && this.formatonomiConstantesFunciones.mostrarFormatoNomiFactorNomiFormatoNomi && !FormatoNomiConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Formato Nomi Factor Nomi");
			reporte.setsDescripcion("Formato Nomi Factor Nomi");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosEvaluacionNomi && this.formatonomiConstantesFunciones.mostrarEvaluacionNomiFormatoNomi && !FormatoNomiConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Evaluacion Nomi");
			reporte.setsDescripcion("Evaluacion Nomi");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosDetalleEvaluacionNomi && this.formatonomiConstantesFunciones.mostrarDetalleEvaluacionNomiFormatoNomi && !FormatoNomiConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Evaluacion Nomi");
			reporte.setsDescripcion("Detalle Evaluacion Nomi");
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
	public void inicializarCombosForeignKeyFormatoNomiListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.estructurasForeignKey=new ArrayList();
				this.puntajenomisForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyFormatoNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(FormatoNomiJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyFormatoNomiListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPuntajeNomiListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEstructuraListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estructurasForeignKey==null||this.estructurasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstructuraConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstructurasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPuntajeNomiListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.puntajenomisForeignKey==null||this.puntajenomisForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PuntajeNomiConstantesFunciones.getArrayColumnasGlobalesPuntajeNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PuntajeNomiConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PuntajeNomiConstantesFunciones.SFINALQUERY;

				this.cargarCombosPuntajeNomisForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyFormatoNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			FormatoNomiParameterReturnGeneral formatonomiReturnGeneral=new FormatoNomiParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.formatonomiConstantesFunciones.cargarid_empresaFormatoNomi)
					 || (this.esRecargarFks && this.formatonomiConstantesFunciones.cargarid_empresaFormatoNomi)) {

					if(!this.formatonomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+formatonomiSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.formatonomiConstantesFunciones.cargarid_sucursalFormatoNomi)
					 || (this.esRecargarFks && this.formatonomiConstantesFunciones.cargarid_sucursalFormatoNomi)) {

					if(!this.formatonomiSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+formatonomiSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEstructura="";

				if(((this.estructurasForeignKey==null||this.estructurasForeignKey.size()<=0) && this.formatonomiConstantesFunciones.cargarid_estructuraFormatoNomi)
					 || (this.esRecargarFks && this.formatonomiConstantesFunciones.cargarid_estructuraFormatoNomi)) {

					if(!this.formatonomiSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstructura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

						finalQueryGlobalEstructura=Funciones.GetFinalQueryAppend(finalQueryGlobalEstructura, "");
						finalQueryGlobalEstructura+=EstructuraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstructurasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstructura=" WHERE " + ConstantesSql.ID + "="+formatonomiSessionBean.getlidEstructuraActual();
					}
				} else {
					finalQueryGlobalEstructura="NONE";
				}


				String finalQueryGlobalPuntajeNomi="";

				if(((this.puntajenomisForeignKey==null||this.puntajenomisForeignKey.size()<=0) && this.formatonomiConstantesFunciones.cargarid_puntaje_nomiFormatoNomi)
					 || (this.esRecargarFks && this.formatonomiConstantesFunciones.cargarid_puntaje_nomiFormatoNomi)) {

					if(!this.formatonomiSessionBean.getisBusquedaDesdeForeignKeySesionPuntajeNomi()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PuntajeNomiConstantesFunciones.getArrayColumnasGlobalesPuntajeNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPuntajeNomi=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PuntajeNomiConstantesFunciones.TABLENAME);

						finalQueryGlobalPuntajeNomi=Funciones.GetFinalQueryAppend(finalQueryGlobalPuntajeNomi, "");
						finalQueryGlobalPuntajeNomi+=PuntajeNomiConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPuntajeNomisForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPuntajeNomi=" WHERE " + ConstantesSql.ID + "="+formatonomiSessionBean.getlidPuntajeNomiActual();
					}
				} else {
					finalQueryGlobalPuntajeNomi="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				formatonomiReturnGeneral=formatonomiLogic.cargarCombosLoteForeignKeyFormatoNomi(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEstructura,finalQueryGlobalPuntajeNomi);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=formatonomiReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=formatonomiReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEstructura.equals("NONE")) {
				this.estructurasForeignKey=formatonomiReturnGeneral.getestructurasForeignKey();
			}

			if(!finalQueryGlobalPuntajeNomi.equals("NONE")) {
				this.puntajenomisForeignKey=formatonomiReturnGeneral.getpuntajenomisForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyFormatoNomi()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEstructura();
			this.addItemDefectoCombosForeignKeyPuntajeNomi();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.formatonomiSessionBean==null) {
				this.formatonomiSessionBean=new FormatoNomiSessionBean();
			}

			if(!this.formatonomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.formatonomiSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyEstructura()throws Exception {
		try {

			if(!this.formatonomiSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
				Estructura estructura=new Estructura();
				EstructuraConstantesFunciones.setEstructuraDescripcion(estructura,Constantes.SMENSAJE_ESCOJA_OPCION);
				estructura.setId(null);

				if(!EstructuraConstantesFunciones.ExisteEnLista(this.estructurasForeignKey,estructura,true)) {

					this.estructurasForeignKey.add(0,estructura);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPuntajeNomi()throws Exception {
		try {

			if(!this.formatonomiSessionBean.getisBusquedaDesdeForeignKeySesionPuntajeNomi()) {
				PuntajeNomi puntajenomi=new PuntajeNomi();
				PuntajeNomiConstantesFunciones.setPuntajeNomiDescripcion(puntajenomi,Constantes.SMENSAJE_ESCOJA_OPCION);
				puntajenomi.setId(null);

				if(!PuntajeNomiConstantesFunciones.ExisteEnLista(this.puntajenomisForeignKey,puntajenomi,true)) {

					this.puntajenomisForeignKey.add(0,puntajenomi);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyFormatoNomi()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyFormatoNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyFormatoNomi()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
				this.formatonomi.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyFormatoNomi();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyFormatoNomi(FormatoNomi formatonomi)throws Exception {	
		try {
			
			this.setActualEstructuraForeignKey(formatonomi.getid_estructura(),false,"Formulario");
			this.setActualPuntajeNomiForeignKey(formatonomi.getid_puntaje_nomi(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyFormatoNomi(FormatoNomi formatonomi,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyFormatoNomi()throws Exception {	
		try {
			
			this.setActualEstructuraForeignKey(this.formatonomiConstantesFunciones.getid_estructura(),false,"Formulario");
			this.setActualPuntajeNomiForeignKey(this.formatonomiConstantesFunciones.getid_puntaje_nomi(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyFormatoNomi()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyFormatoNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyFormatoNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroFormatoNomi()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyFormatoNomi()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEstructurasForeignKey("Todos");
			this.cargarCombosFramePuntajeNomisForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyFormatoNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePuntajeNomisForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyFormatoNomi()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_empresaFormatoNomi!=null && this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_empresaFormatoNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_empresaFormatoNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_sucursalFormatoNomi!=null && this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_sucursalFormatoNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_sucursalFormatoNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_estructuraFormatoNomi!=null && this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_estructuraFormatoNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_estructuraFormatoNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_puntaje_nomiFormatoNomi!=null && this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_puntaje_nomiFormatoNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_puntaje_nomiFormatoNomi.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public FormatoNomiBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public FormatoNomiBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public FormatoNomiBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.formatonomiSessionBean=new FormatoNomiSessionBean(); 
		this.formatonomiConstantesFunciones=new FormatoNomiConstantesFunciones(); 
		this.formatonomiBean=new FormatoNomi();//(this.formatonomiConstantesFunciones); 		
		this.formatonomiReturnGeneral=new FormatoNomiParameterReturnGeneral(); 
		
		this.formatonomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formatonomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public FormatoNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public FormatoNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public FormatoNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessFormatoNomi(true);
			
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
			
			this.formatonomiConstantesFunciones=new FormatoNomiConstantesFunciones(); 
			this.formatonomiBean=new FormatoNomi();//this.formatonomiConstantesFunciones); 			
			this.formatonomiReturnGeneral=new FormatoNomiParameterReturnGeneral(); 
		
			FormatoNomiBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Formato Nomi Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.formatonomi=new FormatoNomi();
			this.formatonomis = new ArrayList<FormatoNomi>();
			this.formatonomisAux = new ArrayList<FormatoNomi>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic=new FormatoNomiLogic();
				this.formatonomiLogic.getNewConnexionToDeep("");
			}
			
			//this.formatonomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.formatonomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormFormatoNomi);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoFormatoNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFormatoNomi);	
					}
					
					if(this.jInternalFrameImportacionFormatoNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFormatoNomi);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByFormatoNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByFormatoNomi);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormFormatoNomi!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormFormatoNomi);
				this.jInternalFrameDetalleFormFormatoNomi.setVisible(false);
				this.jInternalFrameDetalleFormFormatoNomi.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoFormatoNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFormatoNomi);
					this.jInternalFrameReporteDinamicoFormatoNomi.setVisible(false);
					this.jInternalFrameReporteDinamicoFormatoNomi.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionFormatoNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionFormatoNomi);
					this.jInternalFrameImportacionFormatoNomi.setVisible(false);
					this.jInternalFrameImportacionFormatoNomi.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByFormatoNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByFormatoNomi);
					this.jInternalFrameOrderByFormatoNomi.setVisible(false);
					this.jInternalFrameOrderByFormatoNomi.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idFormatoNomiActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=FormatoNomiConstantesFunciones.INUMEROPAGINACION;
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
			
			this.formatonomiReturnGeneral=new FormatoNomiParameterReturnGeneral();
			
			this.formatonomiParameterGeneral=new FormatoNomiParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.formatonomiLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.formatonomiSessionBean.getEsGuardarRelacionado()) {
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
			
			if(FormatoNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.formatonomiSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(FormatoNomiPreguntaNomiConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(FormatoNomiFactorNomiConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(EvaluacionNomiConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(DetalleEvaluacionNomiConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FormatoNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.formatonomiSessionBean.getEsGuardarRelacionado(),this.formatonomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FormatoNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.formatonomiSessionBean.getEsGuardarRelacionado(),this.formatonomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoFormatoNomi=false;
			this.isVisibilidadCeldaDuplicarFormatoNomi=true;
			this.isVisibilidadCeldaCopiarFormatoNomi=true;
			this.isVisibilidadCeldaVerFormFormatoNomi=true;
			this.isVisibilidadCeldaOrdenFormatoNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomi=false;
			this.isVisibilidadCeldaModificarFormatoNomi=false;
			this.isVisibilidadCeldaActualizarFormatoNomi=false;
			this.isVisibilidadCeldaEliminarFormatoNomi=false;
			this.isVisibilidadCeldaCancelarFormatoNomi=false;
			this.isVisibilidadCeldaGuardarFormatoNomi=false;
			this.isVisibilidadCeldaGuardarCambiosFormatoNomi=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstructura=true;
			this.isVisibilidadFK_IdPuntajeNomi=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesFormatoNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosFormatoNomi();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioFormatoNomi(false);
			
			this.setPermisosUsuarioFormatoNomi();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.formatonomiSessionBean.getEsGuardarRelacionado() 
				|| (this.formatonomiSessionBean.getEsGuardarRelacionado() && this.formatonomiSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioFormatoNomiClasesRelacionadas();
			}
			
			if(this.formatonomiSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioFormatoNomiClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!FormatoNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosFormatoNomi();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualFormatoNomi();
			}
			
			if(!this.isPermisoBusquedaFormatoNomi) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasFormatoNomi.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.formatonomiSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioFormatoNomi,this.isPermisoPaginacionMedioFormatoNomi,this.isPermisoPaginacionTodoFormatoNomi);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(FormatoNomiConstantesFunciones.getTiposSeleccionarFormatoNomi());
				
				this.tiposColumnasSelect=FormatoNomiConstantesFunciones.getTiposSeleccionarFormatoNomi(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectFormatoNomi();				
				//this.tiposRelacionesSelect=FormatoNomiConstantesFunciones.getTiposRelacionesFormatoNomi(true);
				
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
			//if(!this.formatonomiSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioFormatoNomi();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioFormatoNomi(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioFormatoNomi(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesFormatoNomi() ;
			
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
			
			
			this.formatonomipreguntanomiLogic=new FormatoNomiPreguntaNomiLogic();
			this.formatonomifactornomiLogic=new FormatoNomiFactorNomiLogic();
			this.evaluacionnomiLogic=new EvaluacionNomiLogic();
			this.detalleevaluacionnomiLogic=new DetalleEvaluacionNomiLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.estructuraLogic=new EstructuraLogic();
			this.puntajenomiLogic=new PuntajeNomiLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				formatonomiImplementable= (FormatoNomiImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FormatoNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				formatonomiImplementableHome= (FormatoNomiImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FormatoNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.formatonomis= new ArrayList<FormatoNomi>();
			this.formatonomisEliminados= new ArrayList<FormatoNomi>();
						
			this.isEsNuevoFormatoNomi=false;
			this.esParaAccionDesdeFormularioFormatoNomi=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.estructurasForeignKey=new ArrayList<Estructura>() ;
			this.puntajenomisForeignKey=new ArrayList<PuntajeNomi>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyFormatoNomi(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroFormatoNomi();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.formatonomiSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			FormatoNomiBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=FormatoNomiConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesFormatoNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingFormatoNomi(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormFormatoNomi!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioFormatoNomi();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioFormatoNomi();
			}
			
			FormatoNomiBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasFormatoNomi.getTabCount(); i++) {
					this.jTabbedPaneBusquedasFormatoNomi.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasFormatoNomi.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessFormatoNomi(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga FormatoNomi: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectFormatoNomi() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesFormatoNomi")) {
				iIndex=this.jInternalFrameDetalleFormFormatoNomi.jTabbedPaneRelacionesFormatoNomi.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormFormatoNomi.jTabbedPaneRelacionesFormatoNomi.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosFormatoNomi.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Evaluacion Nomis")) {
					if(!DetalleEvaluacionNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessFormatoNomi();

						this.cargarParteTabPanelRelacionadaDetalleEvaluacionNomi(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Evaluacion Nomis")) {
					if(!EvaluacionNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessFormatoNomi();

						this.cargarParteTabPanelRelacionadaEvaluacionNomi(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Formato Nomi Factor Nomis")) {
					if(!FormatoNomiFactorNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessFormatoNomi();

						this.cargarParteTabPanelRelacionadaFormatoNomiFactorNomi(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Formato Nomi Pregunta Nomis")) {
					if(!FormatoNomiPreguntaNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessFormatoNomi();

						this.cargarParteTabPanelRelacionadaFormatoNomiPreguntaNomi(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessFormatoNomi();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleEvaluacionNomi(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormFormatoNomi.cargarSessionConBeanSwingJInternalFrameDetalleEvaluacionNomi(false,true,iIndex);
		this.jButtonDetalleEvaluacionNomiActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleEvaluacionNomi();

		//this.jTabbedPaneRelacionesFormatoNomi.updateUI();
		//this.jTabbedPaneRelacionesFormatoNomi.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesFormatoNomi.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaEvaluacionNomi(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormFormatoNomi.cargarSessionConBeanSwingJInternalFrameEvaluacionNomi(false,true,iIndex);
		this.jButtonEvaluacionNomiActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaEvaluacionNomi();

		//this.jTabbedPaneRelacionesFormatoNomi.updateUI();
		//this.jTabbedPaneRelacionesFormatoNomi.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesFormatoNomi.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaFormatoNomiFactorNomi(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormFormatoNomi.cargarSessionConBeanSwingJInternalFrameFormatoNomiFactorNomi(false,true,iIndex);
		this.jButtonFormatoNomiFactorNomiActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaFormatoNomiFactorNomi();

		//this.jTabbedPaneRelacionesFormatoNomi.updateUI();
		//this.jTabbedPaneRelacionesFormatoNomi.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesFormatoNomi.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaFormatoNomiPreguntaNomi(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormFormatoNomi.cargarSessionConBeanSwingJInternalFrameFormatoNomiPreguntaNomi(false,true,iIndex);
		this.jButtonFormatoNomiPreguntaNomiActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaFormatoNomiPreguntaNomi();

		//this.jTabbedPaneRelacionesFormatoNomi.updateUI();
		//this.jTabbedPaneRelacionesFormatoNomi.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesFormatoNomi.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("FormatoNomiPreguntaNomi")) {
				int row=this.jTableDatosFormatoNomi.getSelectedRow();
				jButtonFormatoNomiPreguntaNomiActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("FormatoNomiFactorNomi")) {
				int row=this.jTableDatosFormatoNomi.getSelectedRow();
				jButtonFormatoNomiFactorNomiActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("EvaluacionNomi")) {
				int row=this.jTableDatosFormatoNomi.getSelectedRow();
				jButtonEvaluacionNomiActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("DetalleEvaluacionNomi")) {
				int row=this.jTableDatosFormatoNomi.getSelectedRow();
				jButtonDetalleEvaluacionNomiActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.formatonomiSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Formato Nomi Pregunta Nomi")) {

					if(this.isTienePermisosFormatoNomiPreguntaNomi && this.formatonomiConstantesFunciones.mostrarFormatoNomiPreguntaNomiFormatoNomi && !FormatoNomiConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Formato Nomi Pregunta Nomis"+"("+FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Formato Nomi Pregunta Nomis");

						if(formatonomiConstantesFunciones.resaltarFormatoNomiPreguntaNomiFormatoNomi!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(formatonomiConstantesFunciones.resaltarFormatoNomiPreguntaNomiFormatoNomi);
						}

						jmenuItem.setEnabled(this.formatonomiConstantesFunciones.activarFormatoNomiPreguntaNomiFormatoNomi);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"FormatoNomiPreguntaNomi"));

						

						this.jInternalFrameDetalleFormFormatoNomi.jmenuDetalleFormatoNomi.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Formato Nomi Factor Nomi")) {

					if(this.isTienePermisosFormatoNomiFactorNomi && this.formatonomiConstantesFunciones.mostrarFormatoNomiFactorNomiFormatoNomi && !FormatoNomiConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Formato Nomi Factor Nomis"+"("+FormatoNomiFactorNomiConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Formato Nomi Factor Nomis");

						if(formatonomiConstantesFunciones.resaltarFormatoNomiFactorNomiFormatoNomi!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(formatonomiConstantesFunciones.resaltarFormatoNomiFactorNomiFormatoNomi);
						}

						jmenuItem.setEnabled(this.formatonomiConstantesFunciones.activarFormatoNomiFactorNomiFormatoNomi);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"FormatoNomiFactorNomi"));

						

						this.jInternalFrameDetalleFormFormatoNomi.jmenuDetalleFormatoNomi.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Evaluacion Nomi")) {

					if(this.isTienePermisosEvaluacionNomi && this.formatonomiConstantesFunciones.mostrarEvaluacionNomiFormatoNomi && !FormatoNomiConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Evaluacion Nomis"+"("+EvaluacionNomiConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Evaluacion Nomis");

						if(formatonomiConstantesFunciones.resaltarEvaluacionNomiFormatoNomi!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(formatonomiConstantesFunciones.resaltarEvaluacionNomiFormatoNomi);
						}

						jmenuItem.setEnabled(this.formatonomiConstantesFunciones.activarEvaluacionNomiFormatoNomi);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"EvaluacionNomi"));

						

						this.jInternalFrameDetalleFormFormatoNomi.jmenuDetalleFormatoNomi.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Detalle Evaluacion Nomi")) {

					if(this.isTienePermisosDetalleEvaluacionNomi && this.formatonomiConstantesFunciones.mostrarDetalleEvaluacionNomiFormatoNomi && !FormatoNomiConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Evaluacion Nomis"+"("+DetalleEvaluacionNomiConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Evaluacion Nomis");

						if(formatonomiConstantesFunciones.resaltarDetalleEvaluacionNomiFormatoNomi!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(formatonomiConstantesFunciones.resaltarDetalleEvaluacionNomiFormatoNomi);
						}

						jmenuItem.setEnabled(this.formatonomiConstantesFunciones.activarDetalleEvaluacionNomiFormatoNomi);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleEvaluacionNomi"));

						

						this.jInternalFrameDetalleFormFormatoNomi.jmenuDetalleFormatoNomi.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyFormatoNomi(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyFormatoNomi(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyFormatoNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyFormatoNomiListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyFormatoNomi();
		
		this.cargarCombosFrameForeignKeyFormatoNomi();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyFormatoNomi();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyFormatoNomi();
		}
	}
	
	

	public void cargarCombosForeignKeyEstructura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstructura(this.estructurasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPuntajeNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPuntajeNomiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPuntajeNomi();
				this.cargarCombosFramePuntajeNomisForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPuntajeNomi(this.puntajenomisForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoFormatoNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.formatonomiSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormFormatoNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
			
			
			if(jTableDatosFormatoNomi.getRowCount()>=1) {
				jTableDatosFormatoNomi.removeRowSelectionInterval(0, jTableDatosFormatoNomi.getRowCount()-1);						
			}
			
			this.isEsNuevoFormatoNomi=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoFormatoNomi(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesFormatoNomi(true);			
			//this.formatonomi=new FormatoNomi();
			//this.formatonomi.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFormatoNomi(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormatoNomi() ;
			
			if(FormatoNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFormatoNomi(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.formatonomi);	
			this.actualizarInformacion("INFO_PADRE",false,this.formatonomi);				
			
			FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
			
			if(this.formatonomiSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar FormatoNomi: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarFormatoNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<FormatoNomi> formatonomisSeleccionados=new ArrayList<FormatoNomi>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosFormatoNomi.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosFormatoNomi.getSelectedRows().length;			
			}
			
			formatonomisSeleccionados=this.getFormatoNomisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoFormatoNomi--;			
				//FormatoNomi formatonomiAux= new FormatoNomi();			
				//formatonomiAux.setId(this.iIdNuevoFormatoNomi);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//FormatoNomi formatonomiOrigen=new FormatoNomi();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(FormatoNomi formatonomiOrigen : formatonomisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosFormatoNomi.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							formatonomiOrigen =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formatonomiOrigen =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaFormatoNomi();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.formatonomi.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosFormatoNomi(formatonomiOrigen,this.formatonomi,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.formatonomiLogic.getFormatoNomis().add(this.formatonomiAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.formatonomis.add(this.formatonomiAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaFormatoNomi(false);
				
				this.jTableDatosFormatoNomi.setRowSelectionInterval(this.getIndiceNuevoFormatoNomi(), this.getIndiceNuevoFormatoNomi());
				
				int iLastRow =  this.jTableDatosFormatoNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFormatoNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFormatoNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFormatoNomi(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarFormatoNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<FormatoNomi> formatonomisSeleccionados=new ArrayList<FormatoNomi>();									
		
			FormatoNomi formatonomiOrigen=new FormatoNomi();
			FormatoNomi formatonomiDestino=new FormatoNomi();
				
			formatonomisSeleccionados=this.getFormatoNomisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosFormatoNomi.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || formatonomisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosFormatoNomi.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomiOrigen =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						formatonomiOrigen =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formatonomiDestino =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						formatonomiDestino =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				formatonomiOrigen =formatonomisSeleccionados.get(0);
				formatonomiDestino =formatonomisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosFormatoNomi(formatonomiOrigen,formatonomiDestino,true,false);
				
				formatonomiDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(formatonomiDestino,formatonomiLogic.getFormatoNomis());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formatonomiDestino,formatonomis);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaFormatoNomi(false);
				
				//this.jTableDatosFormatoNomi.setRowSelectionInterval(this.getIndiceNuevoFormatoNomi(), this.getIndiceNuevoFormatoNomi());
				
				int iLastRow =  this.jTableDatosFormatoNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFormatoNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFormatoNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFormatoNomi(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormFormatoNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFormatoNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormFormatoNomi.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarFormatoNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesFormatoNomi.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasFormatoNomi.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesFormatoNomi.setVisible(!isVisible);
			this.jPanelPaginacionFormatoNomi.setVisible(!isVisible);
			this.jPanelAccionesFormatoNomi.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarFormatoNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameFormatoNomi();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoFormatoNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoFormatoNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionFormatoNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionFormatoNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByFormatoNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByFormatoNomi();
			
			this.abrirFrameOrderByFormatoNomi();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByFormatoNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByFormatoNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleFormatoNomi(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormFormatoNomi);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormFormatoNomi.isMaximum()) {
					this.jInternalFrameDetalleFormFormatoNomi.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormFormatoNomi.setSize(this.jInternalFrameDetalleFormFormatoNomi.iWidthFormulario,this.jInternalFrameDetalleFormFormatoNomi.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormFormatoNomi.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormFormatoNomi.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormFormatoNomi.isMaximum()) {
						this.jInternalFrameDetalleFormFormatoNomi.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormFormatoNomi.jContentPaneDetalleFormatoNomi.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormFormatoNomi.jTabbedPaneRelacionesFormatoNomi.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormFormatoNomi.jContentPaneDetalleFormatoNomi.getWidth(),FormatoNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFormatoNomi.jTabbedPaneRelacionesFormatoNomi.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormFormatoNomi.jContentPaneDetalleFormatoNomi.getWidth(),FormatoNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFormatoNomi.jTabbedPaneRelacionesFormatoNomi.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormFormatoNomi.jContentPaneDetalleFormatoNomi.getWidth(),FormatoNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleEvaluacionNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleEvaluacionNomi();
					}

					if(EvaluacionNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaEvaluacionNomi();
					}

					if(FormatoNomiFactorNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaFormatoNomiFactorNomi();
					}

					if(FormatoNomiPreguntaNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaFormatoNomiPreguntaNomi();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormFormatoNomi.setVisible(true);
	        this.jInternalFrameDetalleFormFormatoNomi.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByFormatoNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByFormatoNomi==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByFormatoNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormatoNomi,false,this);
				} else {
					this.jInternalFrameOrderByFormatoNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormatoNomi,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByFormatoNomi);
				this.jInternalFrameOrderByFormatoNomi.setVisible(false);
				this.jInternalFrameOrderByFormatoNomi.setSelected(false);
				
				this.jInternalFrameOrderByFormatoNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFormatoNomi"));
				
				this.inicializarActualizarBindingTablaOrderByFormatoNomi();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionFormatoNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionFormatoNomi==null) {
				
				this.jInternalFrameImportacionFormatoNomi=new ImportacionJInternalFrame(FormatoNomiConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFormatoNomi);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionFormatoNomi);
				this.jInternalFrameImportacionFormatoNomi.setVisible(false);
				this.jInternalFrameImportacionFormatoNomi.setSelected(false);


				this.jInternalFrameImportacionFormatoNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFormatoNomi"));
				this.jInternalFrameImportacionFormatoNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFormatoNomi"));
				this.jInternalFrameImportacionFormatoNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFormatoNomi"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoFormatoNomi() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoFormatoNomi==null) {
				this.jInternalFrameReporteDinamicoFormatoNomi=new ReporteDinamicoJInternalFrame(FormatoNomiConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFormatoNomi);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFormatoNomi);
				this.jInternalFrameReporteDinamicoFormatoNomi.setVisible(false);
				this.jInternalFrameReporteDinamicoFormatoNomi.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoFormatoNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFormatoNomi"));
				this.jInternalFrameReporteDinamicoFormatoNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFormatoNomi"));
				this.jInternalFrameReporteDinamicoFormatoNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFormatoNomi"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFormatoNomi();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleEvaluacionNomi() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.jScrollPanelDatosDetalleEvaluacionNomi.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormFormatoNomi.jContentPaneDetalleFormatoNomi.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.jScrollPanelDatosDetalleEvaluacionNomi.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.jScrollPanelDatosDetalleEvaluacionNomi.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.jScrollPanelDatosDetalleEvaluacionNomi.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaEvaluacionNomi() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.jScrollPanelDatosEvaluacionNomi.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormFormatoNomi.jContentPaneDetalleFormatoNomi.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.jScrollPanelDatosEvaluacionNomi.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.jScrollPanelDatosEvaluacionNomi.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.jScrollPanelDatosEvaluacionNomi.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaFormatoNomiFactorNomi() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomiFactorNomi.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormFormatoNomi.jContentPaneDetalleFormatoNomi.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomiFactorNomi.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomiFactorNomi.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomiFactorNomi.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaFormatoNomiPreguntaNomi() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomiPreguntaNomi.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormFormatoNomi.jContentPaneDetalleFormatoNomi.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomiPreguntaNomi.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomiPreguntaNomi.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomiPreguntaNomi.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleFormatoNomi() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormFormatoNomi);
			
	       	this.jInternalFrameDetalleFormFormatoNomi.setVisible(false);
	        this.jInternalFrameDetalleFormFormatoNomi.setSelected(false);
			
			//this.jInternalFrameDetalleFormFormatoNomi.dispose();
			//this.jInternalFrameDetalleFormFormatoNomi=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoFormatoNomi() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoFormatoNomi.setVisible(true);
	        this.jInternalFrameReporteDinamicoFormatoNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionFormatoNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionFormatoNomi.setVisible(true);
	        this.jInternalFrameImportacionFormatoNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByFormatoNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByFormatoNomi.setVisible(true);
	        this.jInternalFrameOrderByFormatoNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByFormatoNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByFormatoNomi.setVisible(false);
	        this.jInternalFrameOrderByFormatoNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoFormatoNomi() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoFormatoNomi.setVisible(false);
	        this.jInternalFrameReporteDinamicoFormatoNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionFormatoNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionFormatoNomi.setVisible(false);
	        this.jInternalFrameImportacionFormatoNomi.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeEstructura(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeEstructura);
						EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.sTipoBusqueda="Estructura";
						}

						estructuraBeanSwingJInternalFrame.getTodosEstructuraArbol();
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setEstructuras(estructuraBeanSwingJInternalFrame.estructurasArbol);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.CargarTreeEstructura();
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setVisible(true);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.jInternalFrameParent=this;
						TitledBorder titledBorderFormatoNomi=(TitledBorder)this.jScrollPanelDatosFormatoNomi.getBorder();
						TitledBorder titledBorderEstructura=(TitledBorder)estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

						titledBorderEstructura.setTitle(titledBorderFormatoNomi.getTitle() + " -> Estructura");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,estructuraBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(estructuraBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeEstructura(EstructuraBeanSwingJInternalFrame jInternalFrameTreeEstructura) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeEstructura);
						jInternalFrameTreeEstructura.setVisible(false);
						jInternalFrameTreeEstructura.setSelected(false);
						//jInternalFrameTreeEstructura.dispose();
						//jInternalFrameTreeEstructura=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarFormatoNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarFormatoNomi(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarFormatoNomi(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFormatoNomi.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesFormatoNomi(true);
			//this.isEsNuevoFormatoNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomi =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.formatonomi =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesFormatoNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFormatoNomi(false) ;
			
			if(formatonomiSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado() && FormatoNomiPreguntaNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormatoNomiPreguntaNomiActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiSessionBean.getEsGuardarRelacionado() && FormatoNomiFactorNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormatoNomiFactorNomiActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomiSessionBean.getEsGuardarRelacionado() && EvaluacionNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEvaluacionNomiActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado() && DetalleEvaluacionNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleEvaluacionNomiActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(FormatoNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFormatoNomi(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormatoNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaFormatoNomiActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosFormatoNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomi =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatonomi =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarFormatoNomi(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFormatoNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFormatoNomi.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesFormatoNomi(true);
			//this.isEsNuevoFormatoNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomi =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.formatonomi =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.formatonomi.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesFormatoNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesFormatoNomi(false) ;
			
			if(FormatoNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFormatoNomi(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormatoNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaEstructura(List<Estructura> estructurasForeignKey)throws Exception{
		TableColumn tableColumnEstructura=this.jTableDatosFormatoNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomi,FormatoNomiConstantesFunciones.LABEL_IDESTRUCTURA));
		TableCellEditor tableCellEditorEstructura =tableColumnEstructura.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructura;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructurasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFormatoNomi.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estructuraTableCellFk.setRowActual(intSelectedRow);
			//estructuraTableCellFk.setestructurasForeignKeyActual(estructurasForeignKey);
		//}


		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.RecargarEstructurasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPuntajeNomi(List<PuntajeNomi> puntajenomisForeignKey)throws Exception{
		TableColumn tableColumnPuntajeNomi=this.jTableDatosFormatoNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomi,FormatoNomiConstantesFunciones.LABEL_IDPUNTAJENOMI));
		TableCellEditor tableCellEditorPuntajeNomi =tableColumnPuntajeNomi.getCellEditor();

		PuntajeNomiTableCell puntajenomiTableCellFk=(PuntajeNomiTableCell)tableCellEditorPuntajeNomi;

		if(puntajenomiTableCellFk!=null) {
			puntajenomiTableCellFk.setpuntajenomisForeignKey(puntajenomisForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFormatoNomi.getSelectedRow();

		//if(intSelectedRow<=0) {
			//puntajenomiTableCellFk.setRowActual(intSelectedRow);
			//puntajenomiTableCellFk.setpuntajenomisForeignKeyActual(puntajenomisForeignKey);
		//}


		if(puntajenomiTableCellFk!=null) {
			puntajenomiTableCellFk.RecargarPuntajeNomisForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarFormatoNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesFormatoNomi(false);
			
			//if(!this.isEsNuevoFormatoNomi) {								
				int intSelectedRow = this.jTableDatosFormatoNomi.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomi =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formatonomi =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(FormatoNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualFormatoNomi(this.formatonomi,true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);
				
			}
			
			if(this.permiteMantenimiento(this.formatonomi)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.formatonomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoFormatoNomi=true;
					this.inicializarActualizarBindingTablaFormatoNomi(false);
					this.isEsNuevoFormatoNomi=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoFormatoNomi=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoFormatoNomi=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFormatoNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFormatoNomi(false);
				
				this.habilitarDeshabilitarControlesFormatoNomi(false);
			
												
				
				if(FormatoNomiJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleFormatoNomi();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoFormatoNomiActionPerformed(evt,formatonomiSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualFormatoNomi(this.formatonomi,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosFormatoNomi.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,formatonomiSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.formatonomi.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(FormatoNomi.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomi.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarFormatoNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosFormatoNomi.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomi =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
				this.formatonomi.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.formatonomi =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
				this.formatonomi.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.formatonomi)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.formatonomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((FormatoNomiModel) this.jTableDatosFormatoNomi.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoFormatoNomi=true;
				this.inicializarActualizarBindingTablaFormatoNomi(false);
				this.isEsNuevoFormatoNomi=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFormatoNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFormatoNomi(false);
				
				this.habilitarDeshabilitarControlesFormatoNomi(false);
				
				
				
				if(FormatoNomiJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleFormatoNomi();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarFormatoNomiActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosFormatoNomi.getRowCount()>=1) {
				jTableDatosFormatoNomi.removeRowSelectionInterval(0, jTableDatosFormatoNomi.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesFormatoNomi(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaFormatoNomi(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFormatoNomi(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormatoNomi(false) ;
			
			this.isEsNuevoFormatoNomi=false;
			
			if(FormatoNomiJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleFormatoNomi();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosFormatoNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingFormatoNomi(false);
				
				//SI ES MANUAL
				if(FormatoNomiJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualFormatoNomi();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosFormatoNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoFormatoNomi--;			
			//FormatoNomi formatonomiAux= new FormatoNomi();			
			//formatonomiAux.setId(this.iIdNuevoFormatoNomi);
			
			if(this.jInternalFrameDetalleFormFormatoNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaFormatoNomi();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);
			
			this.formatonomi.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.formatonomiLogic.getFormatoNomis().add(this.formatonomiAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.formatonomis.add(this.formatonomiAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaFormatoNomi(false);
			
			this.jTableDatosFormatoNomi.setRowSelectionInterval(this.getIndiceNuevoFormatoNomi(), this.getIndiceNuevoFormatoNomi());
			
			int iLastRow =  this.jTableDatosFormatoNomi.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosFormatoNomi.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosFormatoNomi.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaFormatoNomi(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionFormatoNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingFormatoNomi(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormatoNomi(false);
			
			//SI ES MANUAL
			if(FormatoNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFormatoNomi();
			}
			
			//this.abrirFrameTreeFormatoNomi();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionFormatoNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Formato NomiS ?", "MANTENIMIENTO DE Formato Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionFormatoNomi.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralFormatoNomi();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.formatonomiReturnGeneral=formatonomiLogic.procesarImportacionFormatoNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.formatonomiParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarFormatoNomiReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionFormatoNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionFormatoNomi.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionFormatoNomi.setFileImportacion(this.jInternalFrameImportacionFormatoNomi.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionFormatoNomi.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionFormatoNomi.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionFormatoNomi.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionFormatoNomi.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoFormatoNomiActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<FormatoNomi> formatonomisSeleccionados=new ArrayList<FormatoNomi>();		

		formatonomisSeleccionados=this.getFormatoNomisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormatoNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormatoNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("FormatoNomiBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"FormatoNomiBaseDesign.jrxml";
			
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
			
			this.generarReporteFormatoNomis("Todos",formatonomisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatonomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoFormatoNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormatoNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FormatoNomiConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormatoNomiConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormatoNomiConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormatoNomiConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormatoNomiConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormatoNomiConstantesFunciones.LABEL_INSTRUCCIONES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_strucciones_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_strucciones_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_strucciones_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_strucciones_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormatoNomiConstantesFunciones.LABEL_IDESTRUCTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Estructura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Estructura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Estructura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Estructura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormatoNomiConstantesFunciones.LABEL_IDPUNTAJENOMI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_PuntajeNomi_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_PuntajeNomi_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_PuntajeNomi_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_PuntajeNomi_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoFormatoNomi.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoFormatoNomi.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoFormatoNomi.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case FormatoNomiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case FormatoNomiConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case FormatoNomiConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case FormatoNomiConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case FormatoNomiConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case FormatoNomiConstantesFunciones.LABEL_INSTRUCCIONES:
					sNombreCampoCategoria="instrucciones";
					break;

				case FormatoNomiConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoria="id_estructura";
					break;

				case FormatoNomiConstantesFunciones.LABEL_IDPUNTAJENOMI:
					sNombreCampoCategoria="id_puntaje_nomi";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoFormatoNomi.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case FormatoNomiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case FormatoNomiConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case FormatoNomiConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case FormatoNomiConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case FormatoNomiConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case FormatoNomiConstantesFunciones.LABEL_INSTRUCCIONES:
					sNombreCampoCategoriaValor="instrucciones";
					break;

				case FormatoNomiConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoriaValor="id_estructura";
					break;

				case FormatoNomiConstantesFunciones.LABEL_IDPUNTAJENOMI:
					sNombreCampoCategoriaValor="id_puntaje_nomi";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoFormatoNomi.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormatoNomi.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FormatoNomiConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case FormatoNomiConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case FormatoNomiConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case FormatoNomiConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case FormatoNomiConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case FormatoNomiConstantesFunciones.LABEL_INSTRUCCIONES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Instrucciones",sNombreCampoCategoria,sNombreCampoCategoriaValor,"instrucciones");
					break;

				case FormatoNomiConstantesFunciones.LABEL_IDESTRUCTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estructura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estructura");
					break;

				case FormatoNomiConstantesFunciones.LABEL_IDPUNTAJENOMI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Puntaje Nomi",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_puntaje_nomi");
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
	
	public void jButtonGenerarExcelReporteDinamicoFormatoNomiActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<FormatoNomi> formatonomisSeleccionados=new ArrayList<FormatoNomi>();		
		
		formatonomisSeleccionados=this.getFormatoNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formatonomi";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("FormatoNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoFormatoNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoFormatoNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case FormatoNomiConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormatoNomiConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(FormatoNomi formatonomi:formatonomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formatonomi.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormatoNomiConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormatoNomiConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(FormatoNomi formatonomi:formatonomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formatonomi.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormatoNomiConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormatoNomiConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(FormatoNomi formatonomi:formatonomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formatonomi.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormatoNomiConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormatoNomiConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(FormatoNomi formatonomi:formatonomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formatonomi.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormatoNomiConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormatoNomiConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(FormatoNomi formatonomi:formatonomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formatonomi.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormatoNomiConstantesFunciones.LABEL_INSTRUCCIONES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormatoNomiConstantesFunciones.LABEL_INSTRUCCIONES);
					iRow++;

					for(FormatoNomi formatonomi:formatonomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formatonomi.getinstrucciones());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormatoNomiConstantesFunciones.LABEL_IDESTRUCTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormatoNomiConstantesFunciones.LABEL_IDESTRUCTURA);
					iRow++;

					for(FormatoNomi formatonomi:formatonomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formatonomi.getestructura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormatoNomiConstantesFunciones.LABEL_IDPUNTAJENOMI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormatoNomiConstantesFunciones.LABEL_IDPUNTAJENOMI);
					iRow++;

					for(FormatoNomi formatonomi:formatonomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formatonomi.getpuntajenomi_descripcion());
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
			//	this.getFilaCabeceraExportarExcelFormatoNomi(row);				
			//	iRow++;
			//}				
			
			//for(FormatoNomi formatonomiAux:formatonomisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelFormatoNomi(formatonomiAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatonomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato Nomi",JOptionPane.INFORMATION_MESSAGE);
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
				this.formatonomiLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormatoNomi(false);
			
			//SI ES MANUAL
			if(FormatoNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFormatoNomi();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresFormatoNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormatoNomi(false);
			
			//SI ES MANUAL
			if(FormatoNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFormatoNomi();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesFormatoNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormatoNomi(false);
			
			//SI ES MANUAL
			if(FormatoNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFormatoNomi();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaFormatoNomi() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosFormatoNomi.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosFormatoNomi.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosFormatoNomi.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosFormatoNomi.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosFormatoNomi.setMinimumSize(dimensionMinimum);
		this.jTableDatosFormatoNomi.setMaximumSize(dimensionMaximum);
		this.jTableDatosFormatoNomi.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingFormatoNomi(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingFormatoNomi(esInicializar,true);
	}
	
	public void inicializarActualizarBindingFormatoNomi(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaFormatoNomi(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesFormatoNomi(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.formatonomiSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasFormatoNomi(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFormatoNomi(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesFormatoNomi(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !FormatoNomiJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!FormatoNomiJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualFormatoNomi() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaFormatoNomi();
		
		this.inicializarActualizarBindingBotonesManualFormatoNomi(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.formatonomiSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualFormatoNomi();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFormatoNomi() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualFormatoNomi(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualFormatoNomi(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosFormatoNomi.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosFormatoNomi.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteFormatoNomi.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormFormatoNomi.jCheckBoxPostAccionNuevoFormatoNomi.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormFormatoNomi.jCheckBoxPostAccionSinCerrarFormatoNomi.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormFormatoNomi.jCheckBoxPostAccionSinMensajeFormatoNomi.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosFormatoNomi.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosFormatoNomi.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteFormatoNomi.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
				this.jInternalFrameDetalleFormFormatoNomi.jCheckBoxPostAccionNuevoFormatoNomi.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormFormatoNomi.jCheckBoxPostAccionSinCerrarFormatoNomi.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormFormatoNomi.jCheckBoxPostAccionSinMensajeFormatoNomi.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionFormatoNomi.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionFormatoNomi.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormFormatoNomi.jComboBoxTiposAccionesFormularioFormatoNomi.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesFormatoNomi.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoFormatoNomi!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormatoNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesFormatoNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesFormatoNomi.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarFormatoNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesFormatoNomi.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoFormatoNomi!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormatoNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesFormatoNomi.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralFormatoNomi.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesFormatoNomi(Boolean esInicializar) throws Exception {
		try	{	
			if(FormatoNomiJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualFormatoNomi(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesFormatoNomi() throws Exception {
		try	{
			if(FormatoNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormatoNomi();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFormatoNomi() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormFormatoNomi.jComboBoxTiposAccionesFormularioFormatoNomi.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormFormatoNomi.jComboBoxTiposAccionesFormularioFormatoNomi.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormatoNomi() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesFormatoNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesFormatoNomi.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesFormatoNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesFormatoNomi.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesFormatoNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesFormatoNomi.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionFormatoNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionFormatoNomi.addItem(reporte);
			}
			
			
			if(!this.formatonomiSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionFormatoNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionFormatoNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesFormatoNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesFormatoNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesFormatoNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesFormatoNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormFormatoNomi!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormFormatoNomi.jComboBoxTiposAccionesFormularioFormatoNomi.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormFormatoNomi.jComboBoxTiposAccionesFormularioFormatoNomi.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarFormatoNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarFormatoNomi.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarFormatoNomi.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFormatoNomi();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFormatoNomi() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFormatoNomi!=null) {
				this.jInternalFrameReporteDinamicoFormatoNomi.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoFormatoNomi.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFormatoNomi!=null) {
				this.jInternalFrameReporteDinamicoFormatoNomi.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoFormatoNomi.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoFormatoNomi!=null) {
				
				if(this.jInternalFrameReporteDinamicoFormatoNomi.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFormatoNomi.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFormatoNomi.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoFormatoNomi.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFormatoNomi.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFormatoNomi.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualFormatoNomi()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_estructuraFK_IdEstructuraFormatoNomi.getSelectedItem()!=null){this.id_estructuraFK_IdEstructura=((Estructura)this.jComboBoxid_estructuraFK_IdEstructuraFormatoNomi.getSelectedItem()).getId();}
		if(this.jComboBoxid_puntaje_nomiFK_IdPuntajeNomiFormatoNomi.getSelectedItem()!=null){this.id_puntaje_nomiFK_IdPuntajeNomi=((PuntajeNomi)this.jComboBoxid_puntaje_nomiFK_IdPuntajeNomiFormatoNomi.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasFormatoNomi(Boolean esInicializar) throws Exception {				
		if(FormatoNomiJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualFormatoNomi();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaFormatoNomi() throws Exception {
		this.inicializarActualizarBindingTablaFormatoNomi(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByFormatoNomi() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByFormatoNomi.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByFormatoNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFormatoNomi.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new FormatoNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByFormatoNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFormatoNomi.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new FormatoNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosFormatoNomiOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomiOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new FormatoNomiPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByFormatoNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFormatoNomi.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new FormatoNomiPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByFormatoNomi.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaFormatoNomi(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=formatonomiLogic.getFormatoNomis().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=formatonomis.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(FormatoNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosFormatoNomi.setModel(new FormatoNomiModel(this.formatonomiLogic.getFormatoNomis(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosFormatoNomi.setModel(new FormatoNomiModel(this.formatonomis,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByFormatoNomi!=null && this.jInternalFrameOrderByFormatoNomi.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByFormatoNomi();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosFormatoNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomi,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new FormatoNomiPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO,formatonomiConstantesFunciones.resaltarSeleccionarFormatoNomi,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+FormatoNomiConstantesFunciones.SCLASSWEBTITULO,formatonomiConstantesFunciones.resaltarSeleccionarFormatoNomi,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosFormatoNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomi,FormatoNomiConstantesFunciones.LABEL_ID));

		if(this.formatonomiConstantesFunciones.mostraridFormatoNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoNomiConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.formatonomiConstantesFunciones.resaltaridFormatoNomi,this.formatonomiConstantesFunciones.activaridFormatoNomi,this,true,"idFormatoNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.formatonomiConstantesFunciones.resaltaridFormatoNomi,this.formatonomiConstantesFunciones.activaridFormatoNomi,this,true,"idFormatoNomi","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormatoNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomi,FormatoNomiConstantesFunciones.LABEL_IDEMPRESA));

		if(this.formatonomiConstantesFunciones.mostrarid_empresaFormatoNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoNomiConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.formatonomiConstantesFunciones.resaltarid_empresaFormatoNomi,this,this.formatonomiConstantesFunciones.activarid_empresaFormatoNomi));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.formatonomiConstantesFunciones.resaltarid_empresaFormatoNomi,this,this.formatonomiConstantesFunciones.activarid_empresaFormatoNomi,false,"id_empresaFormatoNomi","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormatoNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormatoNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomi,FormatoNomiConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.formatonomiConstantesFunciones.mostrarid_sucursalFormatoNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoNomiConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.formatonomiConstantesFunciones.resaltarid_sucursalFormatoNomi,this,this.formatonomiConstantesFunciones.activarid_sucursalFormatoNomi));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.formatonomiConstantesFunciones.resaltarid_sucursalFormatoNomi,this,this.formatonomiConstantesFunciones.activarid_sucursalFormatoNomi,false,"id_sucursalFormatoNomi","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormatoNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormatoNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomi,FormatoNomiConstantesFunciones.LABEL_CODIGO));

		if(this.formatonomiConstantesFunciones.mostrarcodigoFormatoNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoNomiConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.formatonomiConstantesFunciones.resaltarcodigoFormatoNomi,this.formatonomiConstantesFunciones.activarcodigoFormatoNomi,this,true,"codigoFormatoNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.formatonomiConstantesFunciones.resaltarcodigoFormatoNomi,this.formatonomiConstantesFunciones.activarcodigoFormatoNomi,this,true,"codigoFormatoNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormatoNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormatoNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomi,FormatoNomiConstantesFunciones.LABEL_NOMBRE));

		if(this.formatonomiConstantesFunciones.mostrarnombreFormatoNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoNomiConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.formatonomiConstantesFunciones.resaltarnombreFormatoNomi,this.formatonomiConstantesFunciones.activarnombreFormatoNomi,this,true,"nombreFormatoNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.formatonomiConstantesFunciones.resaltarnombreFormatoNomi,this.formatonomiConstantesFunciones.activarnombreFormatoNomi,this,true,"nombreFormatoNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormatoNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormatoNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomi,FormatoNomiConstantesFunciones.LABEL_FECHA));

		if(this.formatonomiConstantesFunciones.mostrarfechaFormatoNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoNomiConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.formatonomiConstantesFunciones.resaltarfechaFormatoNomi,this.formatonomiConstantesFunciones.activarfechaFormatoNomi,this,true,"fechaFormatoNomi","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.formatonomiConstantesFunciones.resaltarfechaFormatoNomi,this.formatonomiConstantesFunciones.activarfechaFormatoNomi,this,true,"fechaFormatoNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new FormatoNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormatoNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomi,FormatoNomiConstantesFunciones.LABEL_INSTRUCCIONES));

		if(this.formatonomiConstantesFunciones.mostrarinstruccionesFormatoNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoNomiConstantesFunciones.LABEL_INSTRUCCIONES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.formatonomiConstantesFunciones.resaltarinstruccionesFormatoNomi,this.formatonomiConstantesFunciones.activarinstruccionesFormatoNomi,this,true,"instruccionesFormatoNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.formatonomiConstantesFunciones.resaltarinstruccionesFormatoNomi,this.formatonomiConstantesFunciones.activarinstruccionesFormatoNomi,this,true,"instruccionesFormatoNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormatoNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormatoNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomi,FormatoNomiConstantesFunciones.LABEL_IDESTRUCTURA));

		if(this.formatonomiConstantesFunciones.mostrarid_estructuraFormatoNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoNomiConstantesFunciones.LABEL_IDESTRUCTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstructuraTableCell(this.estructurasForeignKey,this.formatonomiConstantesFunciones.resaltarid_estructuraFormatoNomi,this,this.formatonomiConstantesFunciones.activarid_estructuraFormatoNomi));
			tableColumn.setCellEditor(new EstructuraTableCell(this.estructurasForeignKey,this.formatonomiConstantesFunciones.resaltarid_estructuraFormatoNomi,this,this.formatonomiConstantesFunciones.activarid_estructuraFormatoNomi,true,"id_estructuraFormatoNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormatoNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormatoNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomi,FormatoNomiConstantesFunciones.LABEL_IDPUNTAJENOMI));

		if(this.formatonomiConstantesFunciones.mostrarid_puntaje_nomiFormatoNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormatoNomiConstantesFunciones.LABEL_IDPUNTAJENOMI,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PuntajeNomiTableCell(this.puntajenomisForeignKey,this.formatonomiConstantesFunciones.resaltarid_puntaje_nomiFormatoNomi,this,this.formatonomiConstantesFunciones.activarid_puntaje_nomiFormatoNomi));
			tableColumn.setCellEditor(new PuntajeNomiTableCell(this.puntajenomisForeignKey,this.formatonomiConstantesFunciones.resaltarid_puntaje_nomiFormatoNomi,this,this.formatonomiConstantesFunciones.activarid_puntaje_nomiFormatoNomi,true,"id_puntaje_nomiFormatoNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormatoNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.formatonomiSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosFormatoNomiPreguntaNomi && this.formatonomiConstantesFunciones.mostrarFormatoNomiPreguntaNomiFormatoNomi && !FormatoNomiConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Formato Nomi Pregunta Nomis");
				tableColumn.setHeaderValue("Formato Nomi Pregunta Nomis");
				tableColumn.setCellRenderer(new FormatoNomiPreguntaNomiTableCell(formatonomiConstantesFunciones.resaltarFormatoNomiPreguntaNomiFormatoNomi,this,this.formatonomiConstantesFunciones.activarFormatoNomiPreguntaNomiFormatoNomi));
				tableColumn.setCellEditor(new FormatoNomiPreguntaNomiTableCell(formatonomiConstantesFunciones.resaltarFormatoNomiPreguntaNomiFormatoNomi,this,this.formatonomiConstantesFunciones.activarFormatoNomiPreguntaNomiFormatoNomi));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosFormatoNomi.addColumn(tableColumn);
			}

			if(this.isTienePermisosFormatoNomiFactorNomi && this.formatonomiConstantesFunciones.mostrarFormatoNomiFactorNomiFormatoNomi && !FormatoNomiConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Formato Nomi Factor Nomis");
				tableColumn.setHeaderValue("Formato Nomi Factor Nomis");
				tableColumn.setCellRenderer(new FormatoNomiFactorNomiTableCell(formatonomiConstantesFunciones.resaltarFormatoNomiFactorNomiFormatoNomi,this,this.formatonomiConstantesFunciones.activarFormatoNomiFactorNomiFormatoNomi));
				tableColumn.setCellEditor(new FormatoNomiFactorNomiTableCell(formatonomiConstantesFunciones.resaltarFormatoNomiFactorNomiFormatoNomi,this,this.formatonomiConstantesFunciones.activarFormatoNomiFactorNomiFormatoNomi));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosFormatoNomi.addColumn(tableColumn);
			}

			if(this.isTienePermisosEvaluacionNomi && this.formatonomiConstantesFunciones.mostrarEvaluacionNomiFormatoNomi && !FormatoNomiConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Evaluacion Nomis");
				tableColumn.setHeaderValue("Evaluacion Nomis");
				tableColumn.setCellRenderer(new EvaluacionNomiTableCell(formatonomiConstantesFunciones.resaltarEvaluacionNomiFormatoNomi,this,this.formatonomiConstantesFunciones.activarEvaluacionNomiFormatoNomi));
				tableColumn.setCellEditor(new EvaluacionNomiTableCell(formatonomiConstantesFunciones.resaltarEvaluacionNomiFormatoNomi,this,this.formatonomiConstantesFunciones.activarEvaluacionNomiFormatoNomi));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosFormatoNomi.addColumn(tableColumn);
			}

			if(this.isTienePermisosDetalleEvaluacionNomi && this.formatonomiConstantesFunciones.mostrarDetalleEvaluacionNomiFormatoNomi && !FormatoNomiConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Evaluacion Nomis");
				tableColumn.setHeaderValue("Detalle Evaluacion Nomis");
				tableColumn.setCellRenderer(new DetalleEvaluacionNomiTableCell(formatonomiConstantesFunciones.resaltarDetalleEvaluacionNomiFormatoNomi,this,this.formatonomiConstantesFunciones.activarDetalleEvaluacionNomiFormatoNomi));
				tableColumn.setCellEditor(new DetalleEvaluacionNomiTableCell(formatonomiConstantesFunciones.resaltarDetalleEvaluacionNomiFormatoNomi,this,this.formatonomiConstantesFunciones.activarDetalleEvaluacionNomiFormatoNomi));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosFormatoNomi.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.formatonomiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.formatonomiSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFormatoNomi.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.formatonomiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.formatonomiSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFormatoNomi.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarFormatoNomi && this.isPermisoGuardarCambiosFormatoNomi) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.formatonomiSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.formatonomiSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosFormatoNomi.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.formatonomiSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosFormatoNomi.addColumn(tableColumn);
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
			
			this.jTableDatosFormatoNomi.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFormatoNomi && this.isPermisoGuardarCambiosFormatoNomi) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.formatonomiSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFormatoNomi && this.isPermisoGuardarCambiosFormatoNomi) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosFormatoNomi.moveColumn(this.jTableDatosFormatoNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosFormatoNomi.moveColumn(this.jTableDatosFormatoNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.formatonomiSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosFormatoNomi.moveColumn(this.jTableDatosFormatoNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosFormatoNomi.moveColumn(this.jTableDatosFormatoNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosFormatoNomi.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosFormatoNomi.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosFormatoNomi,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!FormatoNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosFormatoNomi.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosFormatoNomi.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!FormatoNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!FormatoNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosFormatoNomi.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosFormatoNomi.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosFormatoNomi.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=formatonomiLogic.getFormatoNomis().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=formatonomis.size()-1;
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
		//this.jTableDatosFormatoNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosFormatoNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosFormatoNomi();
			
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
				
				//this.isEsNuevoFormatoNomi=false;
					
				FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
			
				if(this.formatonomiSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormFormatoNomi==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFormatoNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFormatoNomi.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomi =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatonomi =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.formatonomi.getsType().equals("DUPLICADO")
				   || this.formatonomi.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoFormatoNomi=true;
				
				} else {
					this.isEsNuevoFormatoNomi=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.formatonomiSessionBean.getEsGuardarRelacionado()) {
					if(this.formatonomi.getId()>=0 && !this.formatonomi.getIsNew()) {						
						this.isEsNuevoFormatoNomi=false;
						
					} else {
						this.isEsNuevoFormatoNomi=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoFormatoNomi(esRelaciones);						
				
				this.seleccionarFormatoNomi(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.formatonomi.getId()<0) {
					this.isEsNuevoFormatoNomi=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarFormatoNomi(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarFormatoNomi(evt,rowIndex);
				}	
				
				if(this.formatonomiSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion FormatoNomi: " + this.dDif); 
					}
				}								
				
				FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarFormatoNomi(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.formatonomi)) {
					if(this.formatonomi.getId()>0) {
						this.formatonomi.setIsDeleted(true);
						
						this.formatonomisEliminados.add(this.formatonomi);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.formatonomiLogic.getFormatoNomis().remove(this.formatonomi);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.formatonomis.remove(this.formatonomi);				
					}
					
					
					((FormatoNomiModel) this.jTableDatosFormatoNomi.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaFormatoNomi(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarFormatoNomi(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoFormatoNomi) {
			
			if(this.jInternalFrameDetalleFormFormatoNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFormatoNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFormatoNomi.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomi =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatonomi =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(FormatoNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioFormatoNomi(this.formatonomi);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.formatonomiConstantesFunciones.cargarid_empresaFormatoNomi || this.formatonomiConstantesFunciones.event_dependid_empresaFormatoNomi) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.formatonomi.getid_empresa());
									//this.inicializarActualizarBindingFormatoNomi(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(formatonomi.getEmpresa()!=null) {
							this.empresasForeignKey.add(formatonomi.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.formatonomi.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.formatonomiConstantesFunciones.cargarid_sucursalFormatoNomi || this.formatonomiConstantesFunciones.event_dependid_sucursalFormatoNomi) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.formatonomi.getid_sucursal());
									//this.inicializarActualizarBindingFormatoNomi(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(formatonomi.getSucursal()!=null) {
							this.sucursalsForeignKey.add(formatonomi.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.formatonomi.getid_sucursal(),false,"Formulario");

					//Estructura
					if(!this.formatonomiConstantesFunciones.cargarid_estructuraFormatoNomi || this.formatonomiConstantesFunciones.event_dependid_estructuraFormatoNomi) {
						//this.cargarCombosEstructurasForeignKeyLista(" where id="+this.formatonomi.getid_estructura());
									//this.inicializarActualizarBindingFormatoNomi(false,false);
						this.estructurasForeignKey=new ArrayList<Estructura>();

						if(formatonomi.getEstructura()!=null) {
							this.estructurasForeignKey.add(formatonomi.getEstructura());
						}

						this.addItemDefectoCombosForeignKeyEstructura();
						this.cargarCombosFrameEstructurasForeignKey("Todos");
					}
					this.setActualEstructuraForeignKey(this.formatonomi.getid_estructura(),false,"Formulario");

					//PuntajeNomi
					if(!this.formatonomiConstantesFunciones.cargarid_puntaje_nomiFormatoNomi || this.formatonomiConstantesFunciones.event_dependid_puntaje_nomiFormatoNomi) {
						//this.cargarCombosPuntajeNomisForeignKeyLista(" where id="+this.formatonomi.getid_puntaje_nomi());
									//this.inicializarActualizarBindingFormatoNomi(false,false);
						this.puntajenomisForeignKey=new ArrayList<PuntajeNomi>();

						if(formatonomi.getPuntajeNomi()!=null) {
							this.puntajenomisForeignKey.add(formatonomi.getPuntajeNomi());
						}

						this.addItemDefectoCombosForeignKeyPuntajeNomi();
						this.cargarCombosFramePuntajeNomisForeignKey("Todos");
					}
					this.setActualPuntajeNomiForeignKey(this.formatonomi.getid_puntaje_nomi(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesFormatoNomi("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesFormatoNomi(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFormatoNomi() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoFormatoNomi(FormatoNomi formatonomi) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoFormatoNomi(formatonomi,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoFormatoNomi(FormatoNomi formatonomi,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioFormatoNomi(formatonomi);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyFormatoNomi(formatonomi,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyFormatoNomi(formatonomi);
	}
	
	public void setVariablesObjetoActualToFormularioFormatoNomi(FormatoNomi formatonomi) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormFormatoNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormFormatoNomi.jLabelidFormatoNomi.setText(formatonomi.getId().toString());
			this.jInternalFrameDetalleFormFormatoNomi.jTextFieldcodigoFormatoNomi.setText(formatonomi.getcodigo());
			this.jInternalFrameDetalleFormFormatoNomi.jTextAreanombreFormatoNomi.setText(formatonomi.getnombre());
			this.jInternalFrameDetalleFormFormatoNomi.jDateChooserfechaFormatoNomi.setDate(formatonomi.getfecha());
			this.jInternalFrameDetalleFormFormatoNomi.jTextAreainstruccionesFormatoNomi.setText(formatonomi.getinstrucciones());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,FormatoNomi formatonomiLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,formatonomiLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,FormatoNomi formatonomiLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				formatonomiLocal=this.formatonomi;
			} else {
				formatonomiLocal=this.formatonomiAnterior;
			}
		}
		
		if(this.permiteMantenimiento(formatonomiLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoFormatoNomi(formatonomiLocal,true);
					
					if(formatonomiSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(formatonomiLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.formatonomiSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(formatonomiLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoFormatoNomi(FormatoNomi formatonomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFormatoNomi(formatonomi,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(formatonomi);
	}
	
	public void setVariablesFormularioToObjetoActualFormatoNomi(FormatoNomi formatonomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFormatoNomi(formatonomi,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualFormatoNomi(FormatoNomi formatonomi,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormFormatoNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormFormatoNomi.jLabelidFormatoNomi.getText()==null || this.jInternalFrameDetalleFormFormatoNomi.jLabelidFormatoNomi.getText()=="" || this.jInternalFrameDetalleFormFormatoNomi.jLabelidFormatoNomi.getText()=="Id") {
				this.jInternalFrameDetalleFormFormatoNomi.jLabelidFormatoNomi.setText("0");
			}

			if(conColumnasBase) {formatonomi.setId(Long.parseLong(this.jInternalFrameDetalleFormFormatoNomi.jLabelidFormatoNomi.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormatoNomiConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoNomi.jLabelIdFormatoNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			formatonomi.setcodigo(this.jInternalFrameDetalleFormFormatoNomi.jTextFieldcodigoFormatoNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormatoNomiConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoNomi.jLabelcodigoFormatoNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			formatonomi.setnombre(this.jInternalFrameDetalleFormFormatoNomi.jTextAreanombreFormatoNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormatoNomiConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoNomi.jLabelnombreFormatoNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			formatonomi.setfecha(this.jInternalFrameDetalleFormFormatoNomi.jDateChooserfechaFormatoNomi.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormatoNomiConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoNomi.jLabelfechaFormatoNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			formatonomi.setinstrucciones(this.jInternalFrameDetalleFormFormatoNomi.jTextAreainstruccionesFormatoNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormatoNomiConstantesFunciones.LABEL_INSTRUCCIONES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormatoNomi.jLabelinstruccionesFormatoNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFormatoNomi(FormatoNomi formatonomiBean,FormatoNomi formatonomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && formatonomiBean.getid_estructura()!=null && !formatonomiBean.getid_estructura().equals(-1L))) {formatonomi.setid_estructura(formatonomiBean.getid_estructura());}
			if(conDefault || (!conDefault && formatonomiBean.getid_puntaje_nomi()!=null && !formatonomiBean.getid_puntaje_nomi().equals(-1L))) {formatonomi.setid_puntaje_nomi(formatonomiBean.getid_puntaje_nomi());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosFormatoNomi(FormatoNomi formatonomiOrigen,FormatoNomi formatonomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && formatonomiOrigen.getId()!=null && !formatonomiOrigen.getId().equals(0L))) {formatonomi.setId(formatonomiOrigen.getId());}}
			if(conDefault || (!conDefault && formatonomiOrigen.getcodigo()!=null && !formatonomiOrigen.getcodigo().equals(""))) {formatonomi.setcodigo(formatonomiOrigen.getcodigo());}
			if(conDefault || (!conDefault && formatonomiOrigen.getnombre()!=null && !formatonomiOrigen.getnombre().equals(""))) {formatonomi.setnombre(formatonomiOrigen.getnombre());}
			if(conDefault || (!conDefault && formatonomiOrigen.getfecha()!=null && !formatonomiOrigen.getfecha().equals(new Date()))) {formatonomi.setfecha(formatonomiOrigen.getfecha());}
			if(conDefault || (!conDefault && formatonomiOrigen.getinstrucciones()!=null && !formatonomiOrigen.getinstrucciones().equals(""))) {formatonomi.setinstrucciones(formatonomiOrigen.getinstrucciones());}
			if(conDefault || (!conDefault && formatonomiOrigen.getid_estructura()!=null && !formatonomiOrigen.getid_estructura().equals(-1L))) {formatonomi.setid_estructura(formatonomiOrigen.getid_estructura());}
			if(conDefault || (!conDefault && formatonomiOrigen.getid_puntaje_nomi()!=null && !formatonomiOrigen.getid_puntaje_nomi().equals(-1L))) {formatonomi.setid_puntaje_nomi(formatonomiOrigen.getid_puntaje_nomi());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFormatoNomi(FormatoNomi formatonomi) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFormatoNomi.jLabelidFormatoNomi.setText(formatonomi.getId().toString());
			this.jInternalFrameDetalleFormFormatoNomi.jTextFieldcodigoFormatoNomi.setText(formatonomi.getcodigo());
			this.jInternalFrameDetalleFormFormatoNomi.jTextAreanombreFormatoNomi.setText(formatonomi.getnombre());
			this.jInternalFrameDetalleFormFormatoNomi.jDateChooserfechaFormatoNomi.setDate(formatonomi.getfecha());
			this.jInternalFrameDetalleFormFormatoNomi.jTextAreainstruccionesFormatoNomi.setText(formatonomi.getinstrucciones());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFormatoNomi(FormatoNomiBean formatonomiBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFormatoNomi.jLabelidFormatoNomi.setText(formatonomiBean.getId().toString());
			this.jInternalFrameDetalleFormFormatoNomi.jTextFieldcodigoFormatoNomi.setText(formatonomiBean.getcodigo());
			this.jInternalFrameDetalleFormFormatoNomi.jTextAreanombreFormatoNomi.setText(formatonomiBean.getnombre());
			this.jInternalFrameDetalleFormFormatoNomi.jDateChooserfechaFormatoNomi.setDate(formatonomiBean.getfecha());
			this.jInternalFrameDetalleFormFormatoNomi.jTextAreainstruccionesFormatoNomi.setText(formatonomiBean.getinstrucciones());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanFormatoNomi(FormatoNomiParameterReturnGeneral formatonomiReturnGeneral,FormatoNomiBean formatonomiBean,Boolean conDefault) throws Exception { 
		try {
			FormatoNomi formatonomiLocal=new FormatoNomi();
			
			formatonomiLocal=formatonomiReturnGeneral.getFormatoNomi();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && formatonomiLocal.getId()!=null && !formatonomiLocal.getId().equals(0L))) {formatonomiBean.setId(formatonomiLocal.getId());}}
			if(conDefault || (!conDefault && formatonomiLocal.getcodigo()!=null && !formatonomiLocal.getcodigo().equals(""))) {formatonomiBean.setcodigo(formatonomiLocal.getcodigo());}
			if(conDefault || (!conDefault && formatonomiLocal.getnombre()!=null && !formatonomiLocal.getnombre().equals(""))) {formatonomiBean.setnombre(formatonomiLocal.getnombre());}
			if(conDefault || (!conDefault && formatonomiLocal.getfecha()!=null && !formatonomiLocal.getfecha().equals(new Date()))) {formatonomiBean.setfecha(formatonomiLocal.getfecha());}
			if(conDefault || (!conDefault && formatonomiLocal.getinstrucciones()!=null && !formatonomiLocal.getinstrucciones().equals(""))) {formatonomiBean.setinstrucciones(formatonomiLocal.getinstrucciones());}
			if(conDefault || (!conDefault && formatonomiLocal.getid_estructura()!=null && !formatonomiLocal.getid_estructura().equals(-1L))) {formatonomiBean.setid_estructura(formatonomiLocal.getid_estructura());}
			if(conDefault || (!conDefault && formatonomiLocal.getid_puntaje_nomi()!=null && !formatonomiLocal.getid_puntaje_nomi().equals(-1L))) {formatonomiBean.setid_puntaje_nomi(formatonomiLocal.getid_puntaje_nomi());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxFormatoNomiGenerico(Long idFormatoNomiSeleccionado,JComboBox jComboBoxFormatoNomi,List<FormatoNomi> formatonomisLocal)throws Exception {
		try {
			FormatoNomi  formatonomiTemp=null;

			for(FormatoNomi formatonomiAux:formatonomisLocal) {
				if(formatonomiAux.getId()!=null && formatonomiAux.getId().equals(idFormatoNomiSeleccionado)) {
					formatonomiTemp=formatonomiAux;
					break;
				}
			}

			jComboBoxFormatoNomi.setSelectedItem(formatonomiTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxFormatoNomiGenerico(JComboBox jComboBoxFormatoNomi,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxFormatoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFormatoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxFormatoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFormatoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFormatoNomi.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxFormatoNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFormatoNomi.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxFormatoNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxFormatoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxFormatoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("FormatoNomiPreguntaNomi")) {
			jButtonFormatoNomiPreguntaNomiActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("FormatoNomiFactorNomi")) {
			jButtonFormatoNomiFactorNomiActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("EvaluacionNomi")) {
			jButtonEvaluacionNomiActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("DetalleEvaluacionNomi")) {
			jButtonDetalleEvaluacionNomiActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			formatonomi=(FormatoNomi) formatonomiLogic.getFormatoNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			formatonomi =(FormatoNomi) formatonomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!formatonomi.getIsNew() && !formatonomi.getIsChanged() && !formatonomi.getIsDeleted()) {
				sDescripcion=formatonomi.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=formatonomi.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!formatonomi.getIsNew() && !formatonomi.getIsChanged() && !formatonomi.getIsDeleted()) {
				sDescripcion=formatonomi.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=formatonomi.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Estructura")) {
			//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
			if(!formatonomi.getIsNew() && !formatonomi.getIsChanged() && !formatonomi.getIsDeleted()) {
				sDescripcion=formatonomi.getestructura_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
				sDescripcion=formatonomi.getestructura_descripcion();
			}
		}

		if(sTipo.equals("PuntajeNomi")) {
			//sDescripcion=this.getActualPuntajeNomiForeignKeyDescripcion((Long)value);
			if(!formatonomi.getIsNew() && !formatonomi.getIsChanged() && !formatonomi.getIsDeleted()) {
				sDescripcion=formatonomi.getpuntajenomi_descripcion();
			} else {
				//sDescripcion=this.getActualPuntajeNomiForeignKeyDescripcion((Long)value);
				sDescripcion=formatonomi.getpuntajenomi_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		FormatoNomi formatonomiRow=new FormatoNomi();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			formatonomiRow=(FormatoNomi) formatonomiLogic.getFormatoNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			formatonomiRow=(FormatoNomi) formatonomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonFormatoNomiPreguntaNomiActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,FormatoNomi formatonomi) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormFormatoNomi==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomi = (FormatoNomi)this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.formatonomi = (FormatoNomi)this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(formatonomi!=null) {
						this.formatonomi = formatonomi;
					} else {
						this.formatonomi = new FormatoNomi();
					}
				}

				if(this.isTienePermisosFormatoNomiPreguntaNomi && this.permiteMantenimiento(this.formatonomi)) {
					FormatoNomiPreguntaNomiBeanSwingJInternalFrame formatonomipreguntanomiBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFramePopup=new FormatoNomiPreguntaNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						formatonomipreguntanomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFramePopup;
					} else {
						formatonomipreguntanomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame;
					}

					List<FormatoNomi> formatonomis=new ArrayList<FormatoNomi>();
					formatonomis.add(this.formatonomi);
					if(!esRelacionado) {
						//formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiSessionBean.setConGuardarRelaciones(false);
						//formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					formatonomipreguntanomiBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormFormatoNomi.cargarFormatoNomiPreguntaNomiBeanSwingJInternalFrame(formatonomis,this.formatonomi,formatonomipreguntanomiBeanSwingJInternalFrame,/*conInicializar,*/formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiSessionBean.getConGuardarRelaciones(),formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado());
					formatonomipreguntanomiBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						formatonomipreguntanomiBeanSwingJInternalFrame.actualizarEstadoPanelsFormatoNomiPreguntaNomi("no_relacionado");

						formatonomipreguntanomiBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(FormatoNomiPreguntaNomiConstantesFunciones.ITAMANIOFILATABLA + (FormatoNomiPreguntaNomiConstantesFunciones.ITAMANIOFILATABLA/2));

						formatonomipreguntanomiBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderFormatoNomi=(TitledBorder)this.jScrollPanelDatosFormatoNomi.getBorder();
						TitledBorder titledBorderFormatoNomiPreguntaNomi=(TitledBorder)formatonomipreguntanomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomiPreguntaNomi.getBorder();

						titledBorderFormatoNomiPreguntaNomi.setTitle(titledBorderFormatoNomi.getTitle() + " -> Formato Nomi Pregunta Nomi");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,formatonomipreguntanomiBeanSwingJInternalFrame);
						}

						formatonomipreguntanomiBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(formatonomipreguntanomiBeanSwingJInternalFrame);

						formatonomipreguntanomiBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.formatonomiSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Formato Nomi Pregunta Nomi",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonFormatoNomiFactorNomiActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,FormatoNomi formatonomi) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormFormatoNomi==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomi = (FormatoNomi)this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.formatonomi = (FormatoNomi)this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(formatonomi!=null) {
						this.formatonomi = formatonomi;
					} else {
						this.formatonomi = new FormatoNomi();
					}
				}

				if(this.isTienePermisosFormatoNomiFactorNomi && this.permiteMantenimiento(this.formatonomi)) {
					FormatoNomiFactorNomiBeanSwingJInternalFrame formatonomifactornomiBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFramePopup=new FormatoNomiFactorNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						formatonomifactornomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFramePopup;
					} else {
						formatonomifactornomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame;
					}

					List<FormatoNomi> formatonomis=new ArrayList<FormatoNomi>();
					formatonomis.add(this.formatonomi);
					if(!esRelacionado) {
						//formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiSessionBean.setConGuardarRelaciones(false);
						//formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					formatonomifactornomiBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormFormatoNomi.cargarFormatoNomiFactorNomiBeanSwingJInternalFrame(formatonomis,this.formatonomi,formatonomifactornomiBeanSwingJInternalFrame,/*conInicializar,*/formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiSessionBean.getConGuardarRelaciones(),formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiSessionBean.getEsGuardarRelacionado());
					formatonomifactornomiBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						formatonomifactornomiBeanSwingJInternalFrame.actualizarEstadoPanelsFormatoNomiFactorNomi("no_relacionado");

						formatonomifactornomiBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(FormatoNomiFactorNomiConstantesFunciones.ITAMANIOFILATABLA + (FormatoNomiFactorNomiConstantesFunciones.ITAMANIOFILATABLA/2));

						formatonomifactornomiBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderFormatoNomi=(TitledBorder)this.jScrollPanelDatosFormatoNomi.getBorder();
						TitledBorder titledBorderFormatoNomiFactorNomi=(TitledBorder)formatonomifactornomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomiFactorNomi.getBorder();

						titledBorderFormatoNomiFactorNomi.setTitle(titledBorderFormatoNomi.getTitle() + " -> Formato Nomi Factor Nomi");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,formatonomifactornomiBeanSwingJInternalFrame);
						}

						formatonomifactornomiBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(formatonomifactornomiBeanSwingJInternalFrame);

						formatonomifactornomiBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.formatonomiSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Formato Nomi Factor Nomi",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonEvaluacionNomiActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,FormatoNomi formatonomi) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormFormatoNomi==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomi = (FormatoNomi)this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.formatonomi = (FormatoNomi)this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(formatonomi!=null) {
						this.formatonomi = formatonomi;
					} else {
						this.formatonomi = new FormatoNomi();
					}
				}

				if(this.isTienePermisosEvaluacionNomi && this.permiteMantenimiento(this.formatonomi)) {
					EvaluacionNomiBeanSwingJInternalFrame evaluacionnomiBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFramePopup=new EvaluacionNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						evaluacionnomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFramePopup;
					} else {
						evaluacionnomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame;
					}

					List<FormatoNomi> formatonomis=new ArrayList<FormatoNomi>();
					formatonomis.add(this.formatonomi);
					if(!esRelacionado) {
						//evaluacionnomiBeanSwingJInternalFrame.evaluacionnomiSessionBean.setConGuardarRelaciones(false);
						//evaluacionnomiBeanSwingJInternalFrame.evaluacionnomiSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					evaluacionnomiBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormFormatoNomi.cargarEvaluacionNomiBeanSwingJInternalFrame(formatonomis,this.formatonomi,evaluacionnomiBeanSwingJInternalFrame,/*conInicializar,*/evaluacionnomiBeanSwingJInternalFrame.evaluacionnomiSessionBean.getConGuardarRelaciones(),evaluacionnomiBeanSwingJInternalFrame.evaluacionnomiSessionBean.getEsGuardarRelacionado());
					evaluacionnomiBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						evaluacionnomiBeanSwingJInternalFrame.actualizarEstadoPanelsEvaluacionNomi("no_relacionado");

						evaluacionnomiBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(EvaluacionNomiConstantesFunciones.ITAMANIOFILATABLA + (EvaluacionNomiConstantesFunciones.ITAMANIOFILATABLA/2));

						evaluacionnomiBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderFormatoNomi=(TitledBorder)this.jScrollPanelDatosFormatoNomi.getBorder();
						TitledBorder titledBorderEvaluacionNomi=(TitledBorder)evaluacionnomiBeanSwingJInternalFrame.jScrollPanelDatosEvaluacionNomi.getBorder();

						titledBorderEvaluacionNomi.setTitle(titledBorderFormatoNomi.getTitle() + " -> Evaluacion Nomi");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,evaluacionnomiBeanSwingJInternalFrame);
						}

						evaluacionnomiBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(evaluacionnomiBeanSwingJInternalFrame);

						evaluacionnomiBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.formatonomiSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Evaluacion Nomi",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonDetalleEvaluacionNomiActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,FormatoNomi formatonomi) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormFormatoNomi==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomi = (FormatoNomi)this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.formatonomi = (FormatoNomi)this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(formatonomi!=null) {
						this.formatonomi = formatonomi;
					} else {
						this.formatonomi = new FormatoNomi();
					}
				}

				if(this.isTienePermisosDetalleEvaluacionNomi && this.permiteMantenimiento(this.formatonomi)) {
					DetalleEvaluacionNomiBeanSwingJInternalFrame detalleevaluacionnomiBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFramePopup=new DetalleEvaluacionNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalleevaluacionnomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFramePopup;
					} else {
						detalleevaluacionnomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame;
					}

					List<FormatoNomi> formatonomis=new ArrayList<FormatoNomi>();
					formatonomis.add(this.formatonomi);
					if(!esRelacionado) {
						//detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiSessionBean.setConGuardarRelaciones(false);
						//detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalleevaluacionnomiBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormFormatoNomi.cargarDetalleEvaluacionNomiBeanSwingJInternalFrame(formatonomis,this.formatonomi,detalleevaluacionnomiBeanSwingJInternalFrame,/*conInicializar,*/detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiSessionBean.getConGuardarRelaciones(),detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiSessionBean.getEsGuardarRelacionado());
					detalleevaluacionnomiBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalleevaluacionnomiBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleEvaluacionNomi("no_relacionado");

						detalleevaluacionnomiBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleEvaluacionNomiConstantesFunciones.ITAMANIOFILATABLA + (DetalleEvaluacionNomiConstantesFunciones.ITAMANIOFILATABLA/2));

						detalleevaluacionnomiBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderFormatoNomi=(TitledBorder)this.jScrollPanelDatosFormatoNomi.getBorder();
						TitledBorder titledBorderDetalleEvaluacionNomi=(TitledBorder)detalleevaluacionnomiBeanSwingJInternalFrame.jScrollPanelDatosDetalleEvaluacionNomi.getBorder();

						titledBorderDetalleEvaluacionNomi.setTitle(titledBorderFormatoNomi.getTitle() + " -> Detalle Evaluacion Nomi");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalleevaluacionnomiBeanSwingJInternalFrame);
						}

						detalleevaluacionnomiBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalleevaluacionnomiBeanSwingJInternalFrame);

						detalleevaluacionnomiBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.formatonomiSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Evaluacion Nomi",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualFormatoNomi(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoFormatoNomi.setVisible((this.isVisibilidadCeldaNuevoFormatoNomi && this.isPermisoNuevoFormatoNomi));			
			this.jButtonDuplicarFormatoNomi.setVisible((this.isVisibilidadCeldaDuplicarFormatoNomi && this.isPermisoDuplicarFormatoNomi));			
			this.jButtonCopiarFormatoNomi.setVisible((this.isVisibilidadCeldaCopiarFormatoNomi && this.isPermisoCopiarFormatoNomi));
			this.jButtonVerFormFormatoNomi.setVisible((this.isVisibilidadCeldaVerFormFormatoNomi && this.isPermisoVerFormFormatoNomi));
			
			this.jButtonAbrirOrderByFormatoNomi.setVisible((this.isVisibilidadCeldaOrdenFormatoNomi && this.isPermisoOrdenFormatoNomi));			
			
			this.jButtonNuevoRelacionesFormatoNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesFormatoNomi && this.isPermisoNuevoFormatoNomi));			
			this.jButtonNuevoGuardarCambiosFormatoNomi.setVisible((this.isVisibilidadCeldaNuevoFormatoNomi && this.isPermisoNuevoFormatoNomi && this.isPermisoGuardarCambiosFormatoNomi));
			
			if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
			this.jInternalFrameDetalleFormFormatoNomi.jButtonModificarFormatoNomi.setVisible((this.isVisibilidadCeldaModificarFormatoNomi && this.isPermisoActualizarFormatoNomi));	
			this.jInternalFrameDetalleFormFormatoNomi.jButtonActualizarFormatoNomi.setVisible((this.isVisibilidadCeldaActualizarFormatoNomi && this.isPermisoActualizarFormatoNomi));	
			this.jInternalFrameDetalleFormFormatoNomi.jButtonEliminarFormatoNomi.setVisible((this.isVisibilidadCeldaEliminarFormatoNomi && this.isPermisoEliminarFormatoNomi));
			this.jInternalFrameDetalleFormFormatoNomi.jButtonCancelarFormatoNomi.setVisible(this.isVisibilidadCeldaCancelarFormatoNomi);							
			this.jInternalFrameDetalleFormFormatoNomi.jButtonGuardarCambiosFormatoNomi.setVisible((this.isVisibilidadCeldaGuardarFormatoNomi && this.isPermisoGuardarCambiosFormatoNomi));			
			
			}
						
			this.jButtonGuardarCambiosTablaFormatoNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosFormatoNomi && this.isPermisoGuardarCambiosFormatoNomi));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarFormatoNomi.setVisible((this.isVisibilidadCeldaNuevoFormatoNomi && this.isPermisoNuevoFormatoNomi));						
			this.jButtonDuplicarToolBarFormatoNomi.setVisible((this.isVisibilidadCeldaDuplicarFormatoNomi && this.isPermisoDuplicarFormatoNomi));						
			this.jButtonCopiarToolBarFormatoNomi.setVisible((this.isVisibilidadCeldaCopiarFormatoNomi && this.isPermisoCopiarFormatoNomi));			
			this.jButtonVerFormToolBarFormatoNomi.setVisible((this.isVisibilidadCeldaVerFormFormatoNomi && this.isPermisoVerFormFormatoNomi));			
			this.jButtonAbrirOrderByToolBarFormatoNomi.setVisible((this.isVisibilidadCeldaOrdenFormatoNomi && this.isPermisoOrdenFormatoNomi));
			this.jButtonNuevoRelacionesToolBarFormatoNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesFormatoNomi && this.isPermisoNuevoFormatoNomi));			
			this.jButtonNuevoGuardarCambiosToolBarFormatoNomi.setVisible((this.isVisibilidadCeldaNuevoFormatoNomi && this.isPermisoNuevoFormatoNomi && this.isPermisoGuardarCambiosFormatoNomi));			
			
			if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
			this.jInternalFrameDetalleFormFormatoNomi.jButtonModificarToolBarFormatoNomi.setVisible((this.isVisibilidadCeldaModificarFormatoNomi && this.isPermisoActualizarFormatoNomi));	
			this.jInternalFrameDetalleFormFormatoNomi.jButtonActualizarToolBarFormatoNomi.setVisible((this.isVisibilidadCeldaActualizarFormatoNomi  && this.isPermisoActualizarFormatoNomi));	
			this.jInternalFrameDetalleFormFormatoNomi.jButtonEliminarToolBarFormatoNomi.setVisible((this.isVisibilidadCeldaEliminarFormatoNomi && this.isPermisoEliminarFormatoNomi));
			this.jInternalFrameDetalleFormFormatoNomi.jButtonCancelarToolBarFormatoNomi.setVisible(this.isVisibilidadCeldaCancelarFormatoNomi);				
			this.jInternalFrameDetalleFormFormatoNomi.jButtonGuardarCambiosToolBarFormatoNomi.setVisible((this.isVisibilidadCeldaGuardarFormatoNomi && this.isPermisoGuardarCambiosFormatoNomi));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarFormatoNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosFormatoNomi && this.isPermisoGuardarCambiosFormatoNomi));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoFormatoNomi.setVisible((this.isVisibilidadCeldaNuevoFormatoNomi && this.isPermisoNuevoFormatoNomi));			
			this.jMenuItemDuplicarFormatoNomi.setVisible((this.isVisibilidadCeldaDuplicarFormatoNomi && this.isPermisoDuplicarFormatoNomi));			
			this.jMenuItemCopiarFormatoNomi.setVisible((this.isVisibilidadCeldaCopiarFormatoNomi && this.isPermisoCopiarFormatoNomi));			
			this.jMenuItemVerFormFormatoNomi.setVisible((this.isVisibilidadCeldaVerFormFormatoNomi && this.isPermisoVerFormFormatoNomi));			
			this.jMenuItemAbrirOrderByFormatoNomi.setVisible((this.isVisibilidadCeldaOrdenFormatoNomi && this.isPermisoOrdenFormatoNomi));			
			//this.jMenuItemMostrarOcultarFormatoNomi.setVisible((this.isVisibilidadCeldaOrdenFormatoNomi && this.isPermisoOrdenFormatoNomi));
			this.jMenuItemDetalleAbrirOrderByFormatoNomi.setVisible((this.isVisibilidadCeldaOrdenFormatoNomi && this.isPermisoOrdenFormatoNomi));			
			//this.jMenuItemDetalleMostrarOcultarFormatoNomi.setVisible((this.isVisibilidadCeldaOrdenFormatoNomi && this.isPermisoOrdenFormatoNomi));			
			this.jMenuItemNuevoRelacionesFormatoNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesFormatoNomi && this.isPermisoNuevoFormatoNomi));			
			this.jMenuItemNuevoGuardarCambiosFormatoNomi.setVisible((this.isVisibilidadCeldaNuevoFormatoNomi && this.isPermisoNuevoFormatoNomi && this.isPermisoGuardarCambiosFormatoNomi));									
			
			if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
			this.jInternalFrameDetalleFormFormatoNomi.jMenuItemModificarFormatoNomi.setVisible((this.isVisibilidadCeldaModificarFormatoNomi && this.isPermisoActualizarFormatoNomi));	
			this.jInternalFrameDetalleFormFormatoNomi.jMenuItemActualizarFormatoNomi.setVisible((this.isVisibilidadCeldaActualizarFormatoNomi && this.isPermisoActualizarFormatoNomi));	
			this.jInternalFrameDetalleFormFormatoNomi.jMenuItemEliminarFormatoNomi.setVisible((this.isVisibilidadCeldaEliminarFormatoNomi && this.isPermisoEliminarFormatoNomi));
			this.jInternalFrameDetalleFormFormatoNomi.jMenuItemCancelarFormatoNomi.setVisible(this.isVisibilidadCeldaCancelarFormatoNomi);				
			}
			
			this.jMenuItemGuardarCambiosFormatoNomi.setVisible((this.isVisibilidadCeldaGuardarFormatoNomi && this.isPermisoGuardarCambiosFormatoNomi));						
			this.jMenuItemGuardarCambiosTablaFormatoNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosFormatoNomi && this.isPermisoGuardarCambiosFormatoNomi));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoFormatoNomi=this.jButtonNuevoFormatoNomi.isVisible();
			this.isVisibilidadCeldaDuplicarFormatoNomi=this.jButtonDuplicarFormatoNomi.isVisible();
			this.isVisibilidadCeldaCopiarFormatoNomi=this.jButtonCopiarFormatoNomi.isVisible();
			this.isVisibilidadCeldaVerFormFormatoNomi=this.jButtonVerFormFormatoNomi.isVisible();
			
			this.isVisibilidadCeldaOrdenFormatoNomi=this.jButtonAbrirOrderByFormatoNomi.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomi=this.jButtonNuevoRelacionesFormatoNomi.isVisible();
			this.isVisibilidadCeldaModificarFormatoNomi=this.jButtonModificarFormatoNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
			this.isVisibilidadCeldaActualizarFormatoNomi=this.jInternalFrameDetalleFormFormatoNomi.jButtonActualizarFormatoNomi.isVisible();
			this.isVisibilidadCeldaEliminarFormatoNomi=this.jInternalFrameDetalleFormFormatoNomi.jButtonEliminarFormatoNomi.isVisible();
			this.isVisibilidadCeldaCancelarFormatoNomi=this.jInternalFrameDetalleFormFormatoNomi.jButtonCancelarFormatoNomi.isVisible();
			this.isVisibilidadCeldaGuardarFormatoNomi=this.jInternalFrameDetalleFormFormatoNomi.jButtonGuardarCambiosFormatoNomi.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosFormatoNomi=this.jButtonGuardarCambiosTablaFormatoNomi.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoFormatoNomi=this.jButtonNuevoToolBarFormatoNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomi=this.jButtonNuevoRelacionesToolBarFormatoNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
			this.isVisibilidadCeldaModificarFormatoNomi=this.jInternalFrameDetalleFormFormatoNomi.jButtonModificarToolBarFormatoNomi.isVisible();
			this.isVisibilidadCeldaActualizarFormatoNomi=this.jInternalFrameDetalleFormFormatoNomi.jButtonActualizarToolBarFormatoNomi.isVisible();
			this.isVisibilidadCeldaEliminarFormatoNomi=this.jInternalFrameDetalleFormFormatoNomi.jButtonEliminarToolBarFormatoNomi.isVisible();
			this.isVisibilidadCeldaCancelarFormatoNomi=this.jInternalFrameDetalleFormFormatoNomi.jButtonCancelarToolBarFormatoNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFormatoNomi=this.jButtonGuardarCambiosToolBarFormatoNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFormatoNomi=this.jButtonGuardarCambiosTablaToolBarFormatoNomi.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoFormatoNomi=this.jMenuItemNuevoFormatoNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomi=this.jMenuItemNuevoRelacionesFormatoNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
			this.isVisibilidadCeldaModificarFormatoNomi=this.jInternalFrameDetalleFormFormatoNomi.jMenuItemModificarFormatoNomi.isVisible();
			this.isVisibilidadCeldaActualizarFormatoNomi=this.jInternalFrameDetalleFormFormatoNomi.jMenuItemActualizarFormatoNomi.isVisible();
			this.isVisibilidadCeldaEliminarFormatoNomi=this.jInternalFrameDetalleFormFormatoNomi.jMenuItemEliminarFormatoNomi.isVisible();
			this.isVisibilidadCeldaCancelarFormatoNomi=this.jInternalFrameDetalleFormFormatoNomi.jMenuItemCancelarFormatoNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFormatoNomi=this.jMenuItemGuardarCambiosFormatoNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFormatoNomi=this.jMenuItemGuardarCambiosTablaFormatoNomi.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesFormatoNomi(Boolean esInicializar) {
		if(FormatoNomiJInternalFrame.ISBINDING_MANUAL) {			
			if(this.formatonomiSessionBean.getConGuardarRelaciones()) {
				//if(this.formatonomiSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesFormatoNomi();
			}
			
			this.inicializarActualizarBindingBotonesManualFormatoNomi(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualFormatoNomi() {
		this.jButtonNuevoFormatoNomi.setVisible(this.isPermisoNuevoFormatoNomi);			
		this.jButtonDuplicarFormatoNomi.setVisible(this.isPermisoDuplicarFormatoNomi);			
		this.jButtonCopiarFormatoNomi.setVisible(this.isPermisoCopiarFormatoNomi);			
		this.jButtonVerFormFormatoNomi.setVisible(this.isPermisoVerFormFormatoNomi);			
		
		this.jButtonAbrirOrderByFormatoNomi.setVisible(this.isPermisoOrdenFormatoNomi);					
		
		this.jButtonNuevoRelacionesFormatoNomi.setVisible(this.isPermisoNuevoFormatoNomi);			
		
		if(this.jInternalFrameDetalleFormFormatoNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomi.jButtonModificarFormatoNomi.setVisible(this.isPermisoActualizarFormatoNomi);	
			this.jInternalFrameDetalleFormFormatoNomi.jButtonActualizarFormatoNomi.setVisible(this.isPermisoActualizarFormatoNomi);	
			this.jInternalFrameDetalleFormFormatoNomi.jButtonEliminarFormatoNomi.setVisible(this.isPermisoEliminarFormatoNomi);
			this.jInternalFrameDetalleFormFormatoNomi.jButtonCancelarFormatoNomi.setVisible(this.isVisibilidadCeldaCancelarFormatoNomi);						
			this.jInternalFrameDetalleFormFormatoNomi.jButtonGuardarCambiosFormatoNomi.setVisible(this.isPermisoGuardarCambiosFormatoNomi);							
		}
		
		this.jButtonGuardarCambiosTablaFormatoNomi.setVisible(this.isPermisoActualizarFormatoNomi);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleFormatoNomi() {
		this.jInternalFrameDetalleFormFormatoNomi.jButtonModificarFormatoNomi.setVisible(this.isPermisoActualizarFormatoNomi);	
		this.jInternalFrameDetalleFormFormatoNomi.jButtonActualizarFormatoNomi.setVisible(this.isPermisoActualizarFormatoNomi);	
		this.jInternalFrameDetalleFormFormatoNomi.jButtonEliminarFormatoNomi.setVisible(this.isPermisoEliminarFormatoNomi);
		this.jInternalFrameDetalleFormFormatoNomi.jButtonCancelarFormatoNomi.setVisible(this.isVisibilidadCeldaCancelarFormatoNomi);							
		this.jInternalFrameDetalleFormFormatoNomi.jButtonGuardarCambiosFormatoNomi.setVisible((this.isVisibilidadCeldaGuardarFormatoNomi && this.isPermisoGuardarCambiosFormatoNomi));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosFormatoNomi() {
		if(FormatoNomiJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualFormatoNomi();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesFormatoNomi() {
	}
	
	public void jTableDatosFormatoNomiListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarFormatoNomi(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidFormatoNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormatoNomi(this.getformatonomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomi =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formatonomi =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formatonomi==null) {
						this.formatonomi = new FormatoNomi();
					}

					this.setVariablesFormularioToObjetoActualFormatoNomi(this.formatonomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);
				}

				if(this.formatonomi.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.formatonomi.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormatoNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaFormatoNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebFormatoNomi(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormatoNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormatoNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomi =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formatonomi =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormatoNomi(this.getformatonomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.formatonomiLogic.getConnexion());

				if(this.formatonomi.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.formatonomi.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormatoNomi=(TitledBorder)this.jScrollPanelDatosFormatoNomi.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderFormatoNomi.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaFormatoNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormatoNomi(this.getformatonomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomi =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formatonomi =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formatonomi==null) {
						this.formatonomi = new FormatoNomi();
					}

					this.setVariablesFormularioToObjetoActualFormatoNomi(this.formatonomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);
				}

				if(this.formatonomi.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.formatonomi.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormatoNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalFormatoNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebFormatoNomi(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormatoNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormatoNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomi =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formatonomi =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormatoNomi(this.getformatonomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.formatonomiLogic.getConnexion());

				if(this.formatonomi.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.formatonomi.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormatoNomi=(TitledBorder)this.jScrollPanelDatosFormatoNomi.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderFormatoNomi.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalFormatoNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormatoNomi(this.getformatonomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomi =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formatonomi =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formatonomi==null) {
						this.formatonomi = new FormatoNomi();
					}

					this.setVariablesFormularioToObjetoActualFormatoNomi(this.formatonomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);
				}

				if(this.formatonomi.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.formatonomi.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormatoNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoFormatoNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormatoNomi(this.getformatonomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomi =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formatonomi =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formatonomi==null) {
						this.formatonomi = new FormatoNomi();
					}

					this.setVariablesFormularioToObjetoActualFormatoNomi(this.formatonomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);
				}

				if(this.formatonomi.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.formatonomi.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormatoNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreFormatoNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormatoNomi(this.getformatonomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomi =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formatonomi =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formatonomi==null) {
						this.formatonomi = new FormatoNomi();
					}

					this.setVariablesFormularioToObjetoActualFormatoNomi(this.formatonomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);
				}

				if(this.formatonomi.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.formatonomi.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormatoNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaFormatoNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormatoNomi(this.getformatonomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomi =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formatonomi =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formatonomi==null) {
						this.formatonomi = new FormatoNomi();
					}

					this.setVariablesFormularioToObjetoActualFormatoNomi(this.formatonomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);
				}

				if(this.formatonomi.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.formatonomi.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormatoNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoninstruccionesFormatoNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormatoNomi(this.getformatonomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomi =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formatonomi =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formatonomi==null) {
						this.formatonomi = new FormatoNomi();
					}

					this.setVariablesFormularioToObjetoActualFormatoNomi(this.formatonomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);
				}

				if(this.formatonomi.getinstrucciones()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where instrucciones like '%"+this.formatonomi.getinstrucciones()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormatoNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructuraFormatoNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructura=true;

			idTienePermisoestructura=this.tienePermisosUsuarioEnPaginaWebFormatoNomi(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormatoNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormatoNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomi =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formatonomi =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormatoNomi(this.getformatonomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.formatonomiLogic.getConnexion());

				if(this.formatonomi.getid_estructura()!=null) {
					this.estructuraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuraBeanSwingJInternalFrame.setIdActual(this.formatonomi.getid_estructura());
					this.estructuraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormatoNomi=(TitledBorder)this.jScrollPanelDatosFormatoNomi.getBorder();
				TitledBorder titledBorderestructura=(TitledBorder)this.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructura.setTitle(titledBorderFormatoNomi.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructuraFormatoNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormatoNomi(this.getformatonomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomi =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formatonomi =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formatonomi==null) {
						this.formatonomi = new FormatoNomi();
					}

					this.setVariablesFormularioToObjetoActualFormatoNomi(this.formatonomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);
				}

				if(this.formatonomi.getid_estructura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura = "+this.formatonomi.getid_estructura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormatoNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_puntaje_nomiFormatoNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopuntajenomi=true;

			idTienePermisopuntajenomi=this.tienePermisosUsuarioEnPaginaWebFormatoNomi(PuntajeNomiConstantesFunciones.CLASSNAME);

			if(idTienePermisopuntajenomi) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormatoNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormatoNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomi =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formatonomi =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormatoNomi(this.getformatonomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);

				this.puntajenomiBeanSwingJInternalFrame=new PuntajeNomiBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.puntajenomiBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.puntajenomiBeanSwingJInternalFrame.getPuntajeNomiLogic().setConnexion(this.formatonomiLogic.getConnexion());

				if(this.formatonomi.getid_puntaje_nomi()!=null) {
					this.puntajenomiBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.puntajenomiBeanSwingJInternalFrame.setIdActual(this.formatonomi.getid_puntaje_nomi());
					this.puntajenomiBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.puntajenomiBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.puntajenomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaPuntajeNomi();
				}

				JInternalFrameBase jinternalFrame =this.puntajenomiBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormatoNomi=(TitledBorder)this.jScrollPanelDatosFormatoNomi.getBorder();
				TitledBorder titledBorderpuntajenomi=(TitledBorder)this.puntajenomiBeanSwingJInternalFrame.jScrollPanelDatosPuntajeNomi.getBorder();

				titledBorderpuntajenomi.setTitle(titledBorderFormatoNomi.getTitle() + " -> Puntaje Nomi");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_puntaje_nomiFormatoNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormatoNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormatoNomi(this.getformatonomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomi =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formatonomi =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formatonomi==null) {
						this.formatonomi = new FormatoNomi();
					}

					this.setVariablesFormularioToObjetoActualFormatoNomi(this.formatonomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);
				}

				if(this.formatonomi.getid_puntaje_nomi()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_puntaje_nomi = "+this.formatonomi.getid_puntaje_nomi().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormatoNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaFormatoNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormatoNomi(false,false);

			this.getFormatoNomisFK_IdEmpresa();

			this.inicializarActualizarBindingFormatoNomi(false);

			//if(FormatoNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormatoNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstructuraFormatoNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormatoNomi(false,false);

			this.getFormatoNomisFK_IdEstructura();

			this.inicializarActualizarBindingFormatoNomi(false);

			//if(FormatoNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormatoNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPuntajeNomiFormatoNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormatoNomi(false,false);

			this.getFormatoNomisFK_IdPuntajeNomi();

			this.inicializarActualizarBindingFormatoNomi(false);

			//if(FormatoNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormatoNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalFormatoNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormatoNomi(false,false);

			this.getFormatoNomisFK_IdSucursal();

			this.inicializarActualizarBindingFormatoNomi(false);

			//if(FormatoNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormatoNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formatonomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameFormatoNomi() {
		if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
		

		if(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
			this.jInternalFrameDetalleFormFormatoNomi.setVisible(false);	    			
			this.jInternalFrameDetalleFormFormatoNomi.dispose();
			this.jInternalFrameDetalleFormFormatoNomi=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoFormatoNomi!=null) {
			this.jInternalFrameReporteDinamicoFormatoNomi.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoFormatoNomi.dispose();
			this.jInternalFrameReporteDinamicoFormatoNomi=null;
		}
		
		if(this.jInternalFrameImportacionFormatoNomi!=null) {
			this.jInternalFrameImportacionFormatoNomi.setVisible(false);	    			
			this.jInternalFrameImportacionFormatoNomi.dispose();
			this.jInternalFrameImportacionFormatoNomi=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessFormatoNomi();
			
			FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
			
			
			if(sTipo.equals("NuevoFormatoNomi")) {
				jButtonNuevoFormatoNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarFormatoNomi")) {
				jButtonDuplicarFormatoNomiActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarFormatoNomi")) {
				jButtonCopiarFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormFormatoNomi")) {
				jButtonVerFormFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarFormatoNomi")) {
				jButtonNuevoFormatoNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarFormatoNomi")) {
				jButtonDuplicarFormatoNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoFormatoNomi")) {
				jButtonNuevoFormatoNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarFormatoNomi")) {
				jButtonDuplicarFormatoNomiActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesFormatoNomi")) {
				jButtonNuevoFormatoNomiActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarFormatoNomi")) {
				jButtonNuevoFormatoNomiActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesFormatoNomi")) {
				jButtonNuevoFormatoNomiActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarFormatoNomi")) {
				jButtonModificarFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarFormatoNomi")) {
				jButtonModificarFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarFormatoNomi")) {
				jButtonModificarFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarFormatoNomi")) {
				jButtonActualizarFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarFormatoNomi")) {
				jButtonActualizarFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarFormatoNomi")) {
				jButtonActualizarFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarFormatoNomi")) {
				jButtonEliminarFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarFormatoNomi")) {
				jButtonEliminarFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarFormatoNomi")) {
				jButtonEliminarFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarFormatoNomi")) {
				jButtonCancelarFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarFormatoNomi")) {
				jButtonCancelarFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarFormatoNomi")) {
				jButtonCancelarFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarFormatoNomi")) {
				jButtonCerrarFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarFormatoNomi")) {
				jButtonCerrarFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarFormatoNomi")) {
				jButtonCerrarFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarFormatoNomi")) {
				jButtonMostrarOcultarFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarFormatoNomi")) {
				jButtonCancelarFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosFormatoNomi")) {
				jButtonGuardarCambiosFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarFormatoNomi")) {
				jButtonGuardarCambiosFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarFormatoNomi")) {
				jButtonCopiarFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarFormatoNomi")) {
				jButtonVerFormFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosFormatoNomi")) {
				jButtonGuardarCambiosFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarFormatoNomi")) {
				jButtonCopiarFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormFormatoNomi")) {
				jButtonVerFormFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaFormatoNomi")) {
				jButtonGuardarCambiosFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarFormatoNomi")) {
				jButtonGuardarCambiosFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaFormatoNomi")) {
				jButtonGuardarCambiosFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionFormatoNomi")) {
				jButtonRecargarInformacionFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarFormatoNomi")) {
				jButtonRecargarInformacionFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionFormatoNomi")) {
				jButtonRecargarInformacionFormatoNomiActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresFormatoNomi")) {
				jButtonAnterioresFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarFormatoNomi")) {
				jButtonAnterioresFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreFormatoNomi")) {
				jButtonAnterioresFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesFormatoNomi")) {
				jButtonSiguientesFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarFormatoNomi")) {
				jButtonSiguientesFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesFormatoNomi")) {
				jButtonSiguientesFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByFormatoNomi") || sTipo.equals("MenuItemDetalleAbrirOrderByFormatoNomi")) {
				jButtonAbrirOrderByFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarFormatoNomi") || sTipo.equals("MenuItemDetalleMostrarOcultarFormatoNomi")) {
				jButtonMostrarOcultarFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosFormatoNomi")) {
				jButtonNuevoGuardarCambiosFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarFormatoNomi")) {
				jButtonNuevoGuardarCambiosFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosFormatoNomi")) {
				jButtonNuevoGuardarCambiosFormatoNomiActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoFormatoNomi")) {
				jButtonCerrarReporteDinamicoFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoFormatoNomi")) {
				jButtonGenerarReporteDinamicoFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoFormatoNomi")) {
				
				jButtonGenerarExcelReporteDinamicoFormatoNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionFormatoNomi")) {
				jButtonCerrarImportacionFormatoNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionFormatoNomi")) {
				
				jButtonGenerarImportacionFormatoNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionFormatoNomi")) {
				
				jButtonAbrirImportacionFormatoNomiActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesFormatoNomi")) {
				jComboBoxTiposAccionesFormatoNomiActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesFormatoNomi")) {
				jComboBoxTiposRelacionesFormatoNomiActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioFormatoNomi")) {
				jComboBoxTiposAccionesFormatoNomiActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarFormatoNomi")) {
				
				jComboBoxTiposSeleccionarFormatoNomiActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralFormatoNomi")) {
				jTextFieldValorCampoGeneralFormatoNomiActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByFormatoNomi")) {
				jButtonAbrirOrderByFormatoNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarFormatoNomi")) {
				jButtonAbrirOrderByFormatoNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByFormatoNomi")) {
				jButtonCerrarOrderByFormatoNomiActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFormatoNomiBusqueda")) {
				this.jButtonidFormatoNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFormatoNomiUpdate")) {
				this.jButtonid_empresaFormatoNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFormatoNomiBusqueda")) {
				this.jButtonid_empresaFormatoNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalFormatoNomiUpdate")) {
				this.jButtonid_sucursalFormatoNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalFormatoNomiBusqueda")) {
				this.jButtonid_sucursalFormatoNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoFormatoNomiBusqueda")) {
				this.jButtoncodigoFormatoNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreFormatoNomiBusqueda")) {
				this.jButtonnombreFormatoNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaFormatoNomiBusqueda")) {
				this.jButtonfechaFormatoNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("instruccionesFormatoNomiBusqueda")) {
				this.jButtoninstruccionesFormatoNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraFormatoNomiUpdate")) {
				this.jButtonid_estructuraFormatoNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraFormatoNomiBusqueda")) {
				this.jButtonid_estructuraFormatoNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_puntaje_nomiFormatoNomiUpdate")) {
				this.jButtonid_puntaje_nomiFormatoNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_puntaje_nomiFormatoNomiBusqueda")) {
				this.jButtonid_puntaje_nomiFormatoNomiBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdEstructuraFormatoNomi")) {
				this.jButtonFK_IdEstructuraFormatoNomiActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPuntajeNomiFormatoNomi")) {
				this.jButtonFK_IdPuntajeNomiFormatoNomiActionPerformed(evt);
			}
			
			;
			
			
			FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessFormatoNomi();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomi);
				
				FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
				
				


				
				FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			FormatoNomi formatonomiLocal=null;
			
			if(!this.getEsControlTabla()) {
				formatonomiLocal=this.formatonomi;
			} else {
				formatonomiLocal=this.formatonomiAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomi);
				
				FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
							
				
				


				
				FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormatoNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiAnterior =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatonomiAnterior =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
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
			
			FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
			
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
			
			


			
			FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomi);
				
				FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
								
						
				


				
				FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomi.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomi);
				
				FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
								
				
				


				
				FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormatoNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiAnterior =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatonomiAnterior =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomi);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormatoNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiAnterior =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatonomiAnterior =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.formatonomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomi);
				
				FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
							
				
				


				
				FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomi.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFormatoNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomiAnterior =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.formatonomiAnterior =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
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
			
			FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
			
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
			
			


			
			FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoNomiActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.formatonomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomi);
				
				FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
								
				
				


				
				FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormatoNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiAnterior =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatonomiAnterior =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.formatonomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomi);
				
				FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosFormatoNomi")) {
					jCheckBoxSeleccionarTodosFormatoNomiItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosFormatoNomi")) {
					jCheckBoxSeleccionadosFormatoNomiItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarFormatoNomi")) {
					
				}
				
				


				
				
				FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomi);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.formatonomi);
				
				FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
												
				
				


				
				
				FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFormatoNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formatonomiAnterior =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.formatonomiAnterior =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoNomiActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomi);
				
				FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
				
				
				FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
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
			
			FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
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
			
			


			
			FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormatoNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomi);
				
				FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoNomi.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomi.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formatonomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formatonomi);
				
				FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
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
				
				


				
				FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormatoNomi.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormatoNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormatoNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormatoNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formatonomiAnterior =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formatonomiAnterior =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarFormatoNomi")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosFormatoNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosFormatoNomi.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.formatonomi =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.formatonomi =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.formatonomi);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarFormatoNomi")) {
				
				}
				
				FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarFormatoNomi")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosFormatoNomi.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarFormatoNomi")) {
			
			}
			
			FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessFormatoNomi();
			
			FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
			
			if(sTipo.equals("NuevoFormatoNomi")) {
				jButtonNuevoFormatoNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarFormatoNomi")) {
				jButtonDuplicarFormatoNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarFormatoNomi")) {
				jButtonCopiarFormatoNomiActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormFormatoNomi")) {
				jButtonVerFormFormatoNomiActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesFormatoNomi")) {
				jButtonNuevoFormatoNomiActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarFormatoNomi")) {
				jButtonModificarFormatoNomiActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarFormatoNomi")) {
				jButtonActualizarFormatoNomiActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarFormatoNomi")) {
				jButtonEliminarFormatoNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaFormatoNomi")) {
				jButtonGuardarCambiosFormatoNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarFormatoNomi")) {
				jButtonCancelarFormatoNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarFormatoNomi")) {
				jButtonCerrarFormatoNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosFormatoNomi")) {
				jButtonGuardarCambiosFormatoNomiActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosFormatoNomi")) {
				jButtonNuevoGuardarCambiosFormatoNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByFormatoNomi")) {
				jButtonAbrirOrderByFormatoNomiActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionFormatoNomi")) {
				jButtonRecargarInformacionFormatoNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresFormatoNomi")) {
				jButtonAnterioresFormatoNomiActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesFormatoNomi")) {
				jButtonSiguientesFormatoNomiActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFormatoNomiBusqueda")) {
				this.jButtonidFormatoNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFormatoNomiUpdate")) {
				this.jButtonid_empresaFormatoNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFormatoNomiBusqueda")) {
				this.jButtonid_empresaFormatoNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalFormatoNomiUpdate")) {
				this.jButtonid_sucursalFormatoNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalFormatoNomiBusqueda")) {
				this.jButtonid_sucursalFormatoNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoFormatoNomiBusqueda")) {
				this.jButtoncodigoFormatoNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreFormatoNomiBusqueda")) {
				this.jButtonnombreFormatoNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaFormatoNomiBusqueda")) {
				this.jButtonfechaFormatoNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("instruccionesFormatoNomiBusqueda")) {
				this.jButtoninstruccionesFormatoNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraFormatoNomiUpdate")) {
				this.jButtonid_estructuraFormatoNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraFormatoNomiBusqueda")) {
				this.jButtonid_estructuraFormatoNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_puntaje_nomiFormatoNomiUpdate")) {
				this.jButtonid_puntaje_nomiFormatoNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_puntaje_nomiFormatoNomiBusqueda")) {
				this.jButtonid_puntaje_nomiFormatoNomiBusquedaActionPerformed(evt);
			}
			
			FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessFormatoNomi();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameFormatoNomi")) {
				closingInternalFrameFormatoNomi();
				
			} else if(sTipo.equals("jButtonCancelarFormatoNomi")) {
				JInternalFrameBase jInternalFrameDetalleFormFormatoNomi = (JInternalFrameBase)evt.getSource();
	            	
	            FormatoNomiBeanSwingJInternalFrame jInternalFrameParent=(FormatoNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormFormatoNomi.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarFormatoNomiActionPerformed(null);
			}
			
			FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.formatonomi,new Object(),this.formatonomiParameterGeneral,this.formatonomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormFormatoNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormFormatoNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormFormatoNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.formatonomi)) {
			if(!esControlTabla) {
				if(FormatoNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualFormatoNomi(this.formatonomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);			
				}
				
				if(this.formatonomiSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualFormatoNomi(this.formatonomi,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.formatonomiReturnGeneral=formatonomiLogic.procesarEventosFormatoNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formatonomiLogic.getFormatoNomis(),this.formatonomi,this.formatonomiParameterGeneral,this.isEsNuevoFormatoNomi,classes);//this.formatonomiLogic.getFormatoNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanFormatoNomi(this.formatonomiReturnGeneral,this.formatonomiBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.formatonomiSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanFormatoNomi(classes,this.formatonomiReturnGeneral,this.formatonomiBean,false);
					}
						
					if(this.formatonomiReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyFormatoNomi(this.formatonomiReturnGeneral.getFormatoNomi());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioFormatoNomi(this.formatonomiReturnGeneral.getFormatoNomi());	
					}
						
					if(this.formatonomiReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioFormatoNomi(this.formatonomiReturnGeneral.getFormatoNomi(),classes);//this.formatonomiBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioFormatoNomi(this.formatonomi,classes);//this.formatonomiBean);									
				}
			
				if(FormatoNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualFormatoNomi(this.formatonomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFormatoNomi(this.formatonomi);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.formatonomiAnterior!=null) {
						this.formatonomi=this.formatonomiAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.formatonomiReturnGeneral=formatonomiLogic.procesarEventosFormatoNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formatonomiLogic.getFormatoNomis(),this.formatonomi,this.formatonomiParameterGeneral,this.isEsNuevoFormatoNomi,classes);//this.formatonomiLogic.getFormatoNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.formatonomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.formatonomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.formatonomiReturnGeneral.getFormatoNomi(),formatonomiLogic.getFormatoNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.formatonomiReturnGeneral.getFormatoNomi(),this.formatonomis);
				}
				//ARCHITECTURE
				
				//this.jTableDatosFormatoNomi.repaint();
				
				//((AbstractTableModel) this.jTableDatosFormatoNomi.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosFormatoNomi();
			}
		}
	}
	
	public void actualizarVisualTableDatosFormatoNomi() throws Exception {
		
		FormatoNomiModel formatonomiModel=(FormatoNomiModel)this.jTableDatosFormatoNomi.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			formatonomiModel.formatonomis=this.formatonomiLogic.getFormatoNomis();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			formatonomiModel.formatonomis=this.formatonomis;
		}
		
		
		((FormatoNomiModel) this.jTableDatosFormatoNomi.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaFormatoNomi() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getformatonomiAnterior(),this.formatonomiLogic.getFormatoNomis());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getformatonomiAnterior(),this.formatonomis);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosFormatoNomi();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioFormatoNomi(FormatoNomi formatonomi,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(FormatoNomiPreguntaNomi.class)) {
					this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.setFormatoNomiPreguntaNomis(formatonomi.getFormatoNomiPreguntaNomis());
					this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormatoNomiPreguntaNomi(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FormatoNomiFactorNomi.class)) {
					this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.setFormatoNomiFactorNomis(formatonomi.getFormatoNomiFactorNomis());
					this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormatoNomiFactorNomi(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(EvaluacionNomi.class)) {
					this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomiLogic.setEvaluacionNomis(formatonomi.getEvaluacionNomis());
					this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaEvaluacionNomi(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleEvaluacionNomi.class)) {
					this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.setDetalleEvaluacionNomis(formatonomi.getDetalleEvaluacionNomis());
					this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleEvaluacionNomi(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
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
										
				FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formatonomi,new Object(),generalEntityParameterGeneral,this.formatonomiReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.formatonomiSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=FormatoNomiConstantesFunciones.getClassesRelationshipsOfFormatoNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=FormatoNomiConstantesFunciones.getClassesRelationshipsFromStringsOfFormatoNomi(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormFormatoNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				FormatoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formatonomi,new Object(),generalEntityParameterGeneral,this.formatonomiReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioFormatoNomi(FormatoNomiBean formatonomiBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(FormatoNomiPreguntaNomi.class)) {
					this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.setFormatoNomiPreguntaNomis(formatonomi.getFormatoNomiPreguntaNomis());
					this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormatoNomiPreguntaNomi(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FormatoNomiFactorNomi.class)) {
					this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.setFormatoNomiFactorNomis(formatonomi.getFormatoNomiFactorNomis());
					this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormatoNomiFactorNomi(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(EvaluacionNomi.class)) {
					this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomiLogic.setEvaluacionNomis(formatonomi.getEvaluacionNomis());
					this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaEvaluacionNomi(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleEvaluacionNomi.class)) {
					this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.setDetalleEvaluacionNomis(formatonomi.getDetalleEvaluacionNomis());
					this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleEvaluacionNomi(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanFormatoNomi(ArrayList<Classe> classes,FormatoNomiReturnGeneral formatonomiReturnGeneral,FormatoNomiBean formatonomiBean,Boolean conDefault) throws Exception {
		
			this.formatonomiBean.setFormatoNomiPreguntaNomis(formatonomiReturnGeneral.getFormatoNomi().getFormatoNomiPreguntaNomis());
			this.formatonomiBean.setFormatoNomiFactorNomis(formatonomiReturnGeneral.getFormatoNomi().getFormatoNomiFactorNomis());
			this.formatonomiBean.setEvaluacionNomis(formatonomiReturnGeneral.getFormatoNomi().getEvaluacionNomis());
			this.formatonomiBean.setDetalleEvaluacionNomis(formatonomiReturnGeneral.getFormatoNomi().getDetalleEvaluacionNomis());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualFormatoNomi(FormatoNomi formatonomi,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(FormatoNomiPreguntaNomi.class)) {
					formatonomi.setFormatoNomiPreguntaNomis(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FormatoNomiFactorNomi.class)) {
					formatonomi.setFormatoNomiFactorNomis(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.getFormatoNomiFactorNomis());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(EvaluacionNomi.class)) {
					formatonomi.setEvaluacionNomis(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiBeanSwingJInternalFrame.evaluacionnomiLogic.getEvaluacionNomis());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleEvaluacionNomi.class)) {
					formatonomi.setDetalleEvaluacionNomis(this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiBeanSwingJInternalFrame.detalleevaluacionnomiLogic.getDetalleEvaluacionNomis());
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
		if(!paraTabla && !this.permiteMantenimiento(this.formatonomi)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormFormatoNomi = new FormatoNomiDetalleFormJInternalFrame(jDesktopPane,this.formatonomiSessionBean.getConGuardarRelaciones(),this.formatonomiSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormFormatoNomi);
		this.jInternalFrameDetalleFormFormatoNomi.setVisible(false);
		this.jInternalFrameDetalleFormFormatoNomi.setSelected(false);						
		
		this.jInternalFrameDetalleFormFormatoNomi.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormFormatoNomi.formatonomiLogic=this.formatonomiLogic;
		
		this.cargarCombosFrameForeignKeyFormatoNomi("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleFormatoNomi();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFormatoNomi();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyFormatoNomi("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyFormatoNomi();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormFormatoNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFormatoNomi"));
		
		this.jInternalFrameDetalleFormFormatoNomi.jButtonModificarFormatoNomi.addActionListener(new ButtonActionListener(this,"ModificarFormatoNomi"));

		
		this.jInternalFrameDetalleFormFormatoNomi.jButtonModificarToolBarFormatoNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarFormatoNomi"));
					
		this.jInternalFrameDetalleFormFormatoNomi.jMenuItemModificarFormatoNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarFormatoNomi"));		
		
		
		
		this.jInternalFrameDetalleFormFormatoNomi.jButtonActualizarFormatoNomi.addActionListener (new ButtonActionListener(this,"ActualizarFormatoNomi"));
		
		
		this.jInternalFrameDetalleFormFormatoNomi.jButtonActualizarToolBarFormatoNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFormatoNomi"));
						
		this.jInternalFrameDetalleFormFormatoNomi.jMenuItemActualizarFormatoNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFormatoNomi"));		
		
		
		
		this.jInternalFrameDetalleFormFormatoNomi.jButtonEliminarFormatoNomi.addActionListener (new ButtonActionListener(this,"EliminarFormatoNomi"));
		
		
		this.jInternalFrameDetalleFormFormatoNomi.jButtonEliminarToolBarFormatoNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarFormatoNomi"));
								
		this.jInternalFrameDetalleFormFormatoNomi.jMenuItemEliminarFormatoNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFormatoNomi"));		
		
		
		
		this.jInternalFrameDetalleFormFormatoNomi.jButtonCancelarFormatoNomi.addActionListener (new ButtonActionListener(this,"CancelarFormatoNomi"));
		
		
		this.jInternalFrameDetalleFormFormatoNomi.jButtonCancelarToolBarFormatoNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarFormatoNomi"));
					
		this.jInternalFrameDetalleFormFormatoNomi.jMenuItemCancelarFormatoNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFormatoNomi"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormFormatoNomi.jMenuItemDetalleCerrarFormatoNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFormatoNomi"));		
		
		
		
		this.jInternalFrameDetalleFormFormatoNomi.jButtonGuardarCambiosToolBarFormatoNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFormatoNomi"));
		
		
		
		this.jInternalFrameDetalleFormFormatoNomi.jButtonGuardarCambiosToolBarFormatoNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFormatoNomi"));
		
		
		
		this.jInternalFrameDetalleFormFormatoNomi.jComboBoxTiposAccionesFormularioFormatoNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFormatoNomi"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomi.jButtonidFormatoNomiBusqueda.addActionListener(new ButtonActionListener(this,"idFormatoNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomi.jButtonid_empresaFormatoNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFormatoNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomi.jButtonid_empresaFormatoNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFormatoNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomi.jButtonid_sucursalFormatoNomiUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalFormatoNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomi.jButtonid_sucursalFormatoNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalFormatoNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomi.jButtoncodigoFormatoNomiBusqueda.addActionListener(new ButtonActionListener(this,"codigoFormatoNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomi.jButtonnombreFormatoNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreFormatoNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomi.jButtonfechaFormatoNomiBusqueda.addActionListener(new ButtonActionListener(this,"fechaFormatoNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomi.jButtoninstruccionesFormatoNomiBusqueda.addActionListener(new ButtonActionListener(this,"instruccionesFormatoNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomi.jButtonid_estructuraFormatoNomiUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraFormatoNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomi.jButtonid_estructuraFormatoNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraFormatoNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomi.jButtonid_puntaje_nomiFormatoNomiUpdate.addActionListener(new ButtonActionListener(this,"id_puntaje_nomiFormatoNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomi.jButtonid_puntaje_nomiFormatoNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_puntaje_nomiFormatoNomiBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormFormatoNomi.jTabbedPaneRelacionesFormatoNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFormatoNomi"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameFormatoNomi"));
		
		if(this.jInternalFrameDetalleFormFormatoNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFormatoNomi"));
		}
		
		this.jTableDatosFormatoNomi.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarFormatoNomi"));
		
		this.jTableDatosFormatoNomi.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarFormatoNomi"));
		
		this.jButtonNuevoFormatoNomi.addActionListener(new ButtonActionListener(this,"NuevoFormatoNomi"));
		
		this.jButtonDuplicarFormatoNomi.addActionListener(new ButtonActionListener(this,"DuplicarFormatoNomi"));
		
		this.jButtonCopiarFormatoNomi.addActionListener(new ButtonActionListener(this,"CopiarFormatoNomi"));
		
		this.jButtonVerFormFormatoNomi.addActionListener(new ButtonActionListener(this,"VerFormFormatoNomi"));
		
		
		this.jButtonNuevoToolBarFormatoNomi.addActionListener(new ButtonActionListener(this,"NuevoToolBarFormatoNomi"));
			
		this.jButtonDuplicarToolBarFormatoNomi.addActionListener(new ButtonActionListener(this,"DuplicarToolBarFormatoNomi"));
			
		this.jMenuItemNuevoFormatoNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoFormatoNomi"));
			
		this.jMenuItemDuplicarFormatoNomi.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarFormatoNomi"));		
		
		
		this.jButtonNuevoRelacionesFormatoNomi.addActionListener (new ButtonActionListener(this,"NuevoRelacionesFormatoNomi"));
		
		
		this.jButtonNuevoRelacionesToolBarFormatoNomi.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarFormatoNomi"));
			
		this.jMenuItemNuevoRelacionesFormatoNomi.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesFormatoNomi"));		
		
		
		if(this.jInternalFrameDetalleFormFormatoNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomi.jButtonModificarFormatoNomi.addActionListener(new ButtonActionListener(this,"ModificarFormatoNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomi.jButtonModificarToolBarFormatoNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarFormatoNomi"));
			
			this.jInternalFrameDetalleFormFormatoNomi.jMenuItemModificarFormatoNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarFormatoNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoNomi!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormFormatoNomi.jButtonActualizarFormatoNomi.addActionListener (new ButtonActionListener(this,"ActualizarFormatoNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomi.jButtonActualizarToolBarFormatoNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFormatoNomi"));
				
			this.jInternalFrameDetalleFormFormatoNomi.jMenuItemActualizarFormatoNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFormatoNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomi.jButtonEliminarFormatoNomi.addActionListener (new ButtonActionListener(this,"EliminarFormatoNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomi.jButtonEliminarToolBarFormatoNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarFormatoNomi"));
						
			this.jInternalFrameDetalleFormFormatoNomi.jMenuItemEliminarFormatoNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFormatoNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomi.jButtonCancelarFormatoNomi.addActionListener (new ButtonActionListener(this,"CancelarFormatoNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomi.jButtonCancelarToolBarFormatoNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarFormatoNomi"));
			
			this.jInternalFrameDetalleFormFormatoNomi.jMenuItemCancelarFormatoNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFormatoNomi"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarFormatoNomi.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarFormatoNomi"));		
		
		
		this.jButtonCerrarFormatoNomi.addActionListener (new ButtonActionListener(this,"CerrarFormatoNomi"));
		
		
		this.jButtonCerrarToolBarFormatoNomi.addActionListener (new ButtonActionListener(this,"CerrarToolBarFormatoNomi"));
			
		this.jMenuItemCerrarFormatoNomi.addActionListener (new ButtonActionListener(this,"MenuItemCerrarFormatoNomi"));
			
		if(this.jInternalFrameDetalleFormFormatoNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomi.jMenuItemDetalleCerrarFormatoNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFormatoNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomi.jButtonGuardarCambiosFormatoNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosFormatoNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormatoNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomi.jButtonGuardarCambiosToolBarFormatoNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFormatoNomi"));
		}
		
		this.jButtonCopiarToolBarFormatoNomi.addActionListener (new ButtonActionListener(this,"CopiarToolBarFormatoNomi"));
			
		this.jButtonVerFormToolBarFormatoNomi.addActionListener (new ButtonActionListener(this,"VerFormToolBarFormatoNomi"));
		
		this.jMenuItemGuardarCambiosFormatoNomi.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosFormatoNomi"));
			
		this.jMenuItemCopiarFormatoNomi.addActionListener (new ButtonActionListener(this,"MenuItemCopiarFormatoNomi"));		
		
		this.jMenuItemVerFormFormatoNomi.addActionListener (new ButtonActionListener(this,"MenuItemVerFormFormatoNomi"));		
		
		
		this.jButtonGuardarCambiosTablaFormatoNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFormatoNomi"));
		
		
		this.jButtonGuardarCambiosTablaToolBarFormatoNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarFormatoNomi"));
			
		this.jMenuItemGuardarCambiosTablaFormatoNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFormatoNomi"));		
		
		
		
		this.jButtonRecargarInformacionFormatoNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionFormatoNomi"));
					
		this.jButtonRecargarInformacionToolBarFormatoNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarFormatoNomi"));
		
		this.jMenuItemRecargarInformacionFormatoNomi.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionFormatoNomi"));		
		
		
		
		this.jButtonAnterioresFormatoNomi.addActionListener (new ButtonActionListener(this,"AnterioresFormatoNomi"));
		
		
		this.jButtonAnterioresToolBarFormatoNomi.addActionListener (new ButtonActionListener(this,"AnterioresToolBarFormatoNomi"));
		
		this.jMenuItemAnterioresFormatoNomi.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresFormatoNomi"));		
		
		
		this.jButtonSiguientesFormatoNomi.addActionListener (new ButtonActionListener(this,"SiguientesFormatoNomi"));
		
		
		this.jButtonSiguientesToolBarFormatoNomi.addActionListener (new ButtonActionListener(this,"SiguientesToolBarFormatoNomi"));
			
		this.jMenuItemSiguientesFormatoNomi.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesFormatoNomi"));
			
		this.jMenuItemAbrirOrderByFormatoNomi.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByFormatoNomi"));
			
		this.jMenuItemMostrarOcultarFormatoNomi.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarFormatoNomi"));
			
		this.jMenuItemDetalleAbrirOrderByFormatoNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByFormatoNomi"));
			
		this.jMenuItemDetalleMostarOcultarFormatoNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarFormatoNomi"));		
		
		
		this.jButtonNuevoGuardarCambiosFormatoNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosFormatoNomi"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarFormatoNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarFormatoNomi"));
			
		this.jMenuItemNuevoGuardarCambiosFormatoNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosFormatoNomi"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosFormatoNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosFormatoNomi"));

		this.jCheckBoxSeleccionadosFormatoNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionadosFormatoNomi"));
		
		if(this.jInternalFrameDetalleFormFormatoNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomi.jComboBoxTiposAccionesFormularioFormatoNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFormatoNomi"));
		}
		
		
		this.jComboBoxTiposRelacionesFormatoNomi.addActionListener (new ButtonActionListener(this,"TiposRelacionesFormatoNomi"));
			
		this.jComboBoxTiposAccionesFormatoNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormatoNomi"));
					
		this.jComboBoxTiposSeleccionarFormatoNomi.addActionListener (new ButtonActionListener(this,"TiposSeleccionarFormatoNomi"));
			
		this.jTextFieldValorCampoGeneralFormatoNomi.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralFormatoNomi"));		
		
		
		if(this.jInternalFrameDetalleFormFormatoNomi!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomi.jButtonidFormatoNomiBusqueda.addActionListener(new ButtonActionListener(this,"idFormatoNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomi.jButtonid_empresaFormatoNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFormatoNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomi.jButtonid_empresaFormatoNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFormatoNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomi.jButtonid_sucursalFormatoNomiUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalFormatoNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomi.jButtonid_sucursalFormatoNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalFormatoNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomi.jButtoncodigoFormatoNomiBusqueda.addActionListener(new ButtonActionListener(this,"codigoFormatoNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomi.jButtonnombreFormatoNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreFormatoNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomi.jButtonfechaFormatoNomiBusqueda.addActionListener(new ButtonActionListener(this,"fechaFormatoNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomi.jButtoninstruccionesFormatoNomiBusqueda.addActionListener(new ButtonActionListener(this,"instruccionesFormatoNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomi.jButtonid_estructuraFormatoNomiUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraFormatoNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomi.jButtonid_estructuraFormatoNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraFormatoNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomi.jButtonid_puntaje_nomiFormatoNomiUpdate.addActionListener(new ButtonActionListener(this,"id_puntaje_nomiFormatoNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomi.jButtonid_puntaje_nomiFormatoNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_puntaje_nomiFormatoNomiBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEstructuraFormatoNomi.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraFormatoNomi"));

			this.jButtonFK_IdPuntajeNomiFormatoNomi.addActionListener(new ButtonActionListener(this,"FK_IdPuntajeNomiFormatoNomi"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoFormatoNomi!=null) {
				this.jInternalFrameReporteDinamicoFormatoNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFormatoNomi"));
				this.jInternalFrameReporteDinamicoFormatoNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFormatoNomi"));
				this.jInternalFrameReporteDinamicoFormatoNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFormatoNomi"));
			}
			
			//this.jButtonCerrarReporteDinamicoFormatoNomi.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFormatoNomi"));				
			//this.jButtonGenerarReporteDinamicoFormatoNomi.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFormatoNomi"));
			//this.jButtonGenerarExcelReporteDinamicoFormatoNomi.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFormatoNomi"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionFormatoNomi!=null) {
				this.jInternalFrameImportacionFormatoNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFormatoNomi"));
				this.jInternalFrameImportacionFormatoNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFormatoNomi"));
				this.jInternalFrameImportacionFormatoNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFormatoNomi"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByFormatoNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByFormatoNomi"));
			
			this.jButtonAbrirOrderByToolBarFormatoNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarFormatoNomi"));			
			
			if(this.jInternalFrameOrderByFormatoNomi!=null) {
				this.jInternalFrameOrderByFormatoNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFormatoNomi"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormFormatoNomi!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormFormatoNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormatoNomi.jTabbedPaneRelacionesFormatoNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFormatoNomi"));
		
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
            		closingInternalFrameFormatoNomi();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormFormatoNomi.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormFormatoNomi = (JInternalFrameBase)event.getSource();
	            	
	            FormatoNomiBeanSwingJInternalFrame jInternalFrameParent=(FormatoNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormFormatoNomi.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarFormatoNomiActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosFormatoNomi.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosFormatoNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosFormatoNomi.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosFormatoNomi.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormatoNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormatoNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormatoNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoFormatoNomi";
		inputMap = this.jButtonNuevoFormatoNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoFormatoNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFormatoNomiActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormatoNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormatoNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormatoNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesFormatoNomi";
		inputMap = this.jButtonNuevoRelacionesFormatoNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesFormatoNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFormatoNomiActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarFormatoNomi";
		inputMap = this.jButtonModificarFormatoNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarFormatoNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarFormatoNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarFormatoNomi";
		inputMap = this.jButtonActualizarFormatoNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarFormatoNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarFormatoNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarFormatoNomi";
		inputMap = this.jButtonEliminarFormatoNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarFormatoNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarFormatoNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarFormatoNomi";
		inputMap = this.jButtonCancelarFormatoNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarFormatoNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarFormatoNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarFormatoNomi";
		inputMap = this.jButtonCerrarFormatoNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarFormatoNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarFormatoNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormFormatoNomi.jButtonGuardarCambiosFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosFormatoNomi";
		inputMap = this.jInternalFrameDetalleFormFormatoNomi.jButtonGuardarCambiosFormatoNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormFormatoNomi.jButtonGuardarCambiosFormatoNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosFormatoNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosFormatoNomi.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosFormatoNomiItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesFormatoNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesFormatoNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarFormatoNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarFormatoNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralFormatoNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralFormatoNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomi.jButtonidFormatoNomiBusqueda.addActionListener(new ButtonActionListener(this,"idFormatoNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomi.jButtonid_empresaFormatoNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFormatoNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomi.jButtonid_empresaFormatoNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFormatoNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomi.jButtonid_sucursalFormatoNomiUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalFormatoNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomi.jButtonid_sucursalFormatoNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalFormatoNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomi.jButtoncodigoFormatoNomiBusqueda.addActionListener(new ButtonActionListener(this,"codigoFormatoNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomi.jButtonnombreFormatoNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreFormatoNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomi.jButtonfechaFormatoNomiBusqueda.addActionListener(new ButtonActionListener(this,"fechaFormatoNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomi.jButtoninstruccionesFormatoNomiBusqueda.addActionListener(new ButtonActionListener(this,"instruccionesFormatoNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomi.jButtonid_estructuraFormatoNomiUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraFormatoNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomi.jButtonid_estructuraFormatoNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraFormatoNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormatoNomi.jButtonid_puntaje_nomiFormatoNomiUpdate.addActionListener(new ButtonActionListener(this,"id_puntaje_nomiFormatoNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormatoNomi.jButtonid_puntaje_nomiFormatoNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_puntaje_nomiFormatoNomiBusqueda"));
		
		
		this.jButtonFK_IdEstructuraFormatoNomi.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraFormatoNomi"));

		this.jButtonFK_IdPuntajeNomiFormatoNomi.addActionListener(new ButtonActionListener(this,"FK_IdPuntajeNomiFormatoNomi"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionFormatoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionFormatoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarFormatoNomiActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarFormatoNomi.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosFormatoNomi(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(FormatoNomi formatonomiAux:this.formatonomiLogic.getFormatoNomis()) {
					formatonomiAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormatoNomi formatonomiAux:formatonomis) {
					formatonomiAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosFormatoNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFormatoNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FormatoNomi formatonomiAux:this.formatonomiLogic.getFormatoNomis()) {
						formatonomiAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FormatoNomi formatonomiAux:formatonomis) {
						formatonomiAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(FormatoNomi formatonomiAux:this.formatonomiLogic.getFormatoNomis()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FormatoNomi formatonomiAux:formatonomis) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaFormatoNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFormatoNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFormatoNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosFormatoNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFormatoNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosFormatoNomi.getSelectedRows();
			
			FormatoNomi formatonomiLocal=new FormatoNomi();
			
			//this.seleccionarTodosFormatoNomi(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatonomiLocal =(FormatoNomi) this.formatonomiLogic.getFormatoNomis().toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					formatonomiLocal =(FormatoNomi) this.formatonomis.toArray()[this.jTableDatosFormatoNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				formatonomiLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FormatoNomi formatonomiAux:this.formatonomiLogic.getFormatoNomis()) {
						formatonomiAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FormatoNomi formatonomiAux:formatonomis) {
						formatonomiAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaFormatoNomi(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFormatoNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFormatoNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFormatoNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualFormatoNomiItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarFormatoNomiParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralFormatoNomiActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingFormatoNomi(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralFormatoNomi.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FormatoNomi formatonomiAux:this.formatonomiLogic.getFormatoNomis()) {
				
						if(sTipoSeleccionar.equals(FormatoNomiConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							formatonomiAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FormatoNomiConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							formatonomiAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FormatoNomiConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							formatonomiAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FormatoNomiConstantesFunciones.LABEL_INSTRUCCIONES)) {
							existe=true;
							formatonomiAux.setinstrucciones(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormatoNomi formatonomiAux:formatonomis) {
					
						if(sTipoSeleccionar.equals(FormatoNomiConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							formatonomiAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FormatoNomiConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							formatonomiAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FormatoNomiConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							formatonomiAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FormatoNomiConstantesFunciones.LABEL_INSTRUCCIONES)) {
							existe=true;
							formatonomiAux.setinstrucciones(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaFormatoNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesFormatoNomiActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingFormatoNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioFormatoNomi=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesFormatoNomi.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormFormatoNomi.jComboBoxTiposAccionesFormularioFormatoNomi.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteFormatoNomi) {				
					conSplash=true;//false;										
					
					//this.startProcessFormatoNomi(conSplash);
				
					this.generarReporteFormatoNomisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormatoNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormatoNomi.jComboBoxTiposAccionesFormularioFormatoNomi.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoFormatoNomisSeleccionados();
				//this.jComboBoxTiposAccionesFormatoNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFormatoNomisSeleccionados(false);
				//this.jComboBoxTiposAccionesFormatoNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFormatoNomisSeleccionados(true);
				//this.jComboBoxTiposAccionesFormatoNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFormatoNomi();
				
				this.exportarFormatoNomisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormatoNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormatoNomi.jComboBoxTiposAccionesFormularioFormatoNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionFormatoNomis();
				//this.importarFormatoNomis();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormatoNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormatoNomi.jComboBoxTiposAccionesFormularioFormatoNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFormatoNomi();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelFormatoNomisSeleccionados();
				//this.jComboBoxTiposAccionesFormatoNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Formato Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessFormatoNomi();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoFormatoNomi)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyFormatoNomi(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Formato Nomi",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormatoNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormatoNomi.jComboBoxTiposAccionesFormularioFormatoNomi.setSelectedIndex(0);					
				}	
			} 			
			else if(FormatoNomiBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteFormatoNomi) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessFormatoNomi(conSplash);
					
						//this.actualizarParametrosGeneralFormatoNomi();
						
						this.generarReporteProcesoAccionFormatoNomisSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesFormatoNomi.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormFormatoNomi.jComboBoxTiposAccionesFormularioFormatoNomi.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(FormatoNomiBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Formato NomiS SELECCIONADOS?", "MANTENIMIENTO DE Formato Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessFormatoNomi();
				
						this.actualizarParametrosGeneralFormatoNomi();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.formatonomiReturnGeneral=formatonomiLogic.procesarAccionFormatoNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.formatonomiLogic.getFormatoNomis(),this.formatonomiParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarFormatoNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFormatoNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFormatoNomi.jComboBoxTiposAccionesFormularioFormatoNomi.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralFormatoNomi();
					
					FormatoNomiBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarFormatoNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFormatoNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFormatoNomi.jComboBoxTiposAccionesFormularioFormatoNomi.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessFormatoNomi(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesFormatoNomiActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessFormatoNomi();
			
			if(this.jInternalFrameDetalleFormFormatoNomi==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<FormatoNomi> formatonomisSeleccionados=new ArrayList<FormatoNomi>();		
			FormatoNomi formatonomi=new FormatoNomi();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingFormatoNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesFormatoNomi.getSelectedItem();
			
			
			
			
			formatonomisSeleccionados=this.getFormatoNomisSeleccionados(true);
			//this.sTipoAccion;
			
			if(formatonomisSeleccionados.size()==1) {
				for(FormatoNomi formatonomiAux:formatonomisSeleccionados) {
					formatonomi=formatonomiAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Formato Nomi Pregunta Nomi")) {
					jButtonFormatoNomiPreguntaNomiActionPerformed(null,rowIndex,true,false,formatonomi);
				}
				else if(this.sTipoRelacion.equals("Formato Nomi Factor Nomi")) {
					jButtonFormatoNomiFactorNomiActionPerformed(null,rowIndex,true,false,formatonomi);
				}
				else if(this.sTipoRelacion.equals("Evaluacion Nomi")) {
					jButtonEvaluacionNomiActionPerformed(null,rowIndex,true,false,formatonomi);
				}
				else if(this.sTipoRelacion.equals("Detalle Evaluacion Nomi")) {
					jButtonDetalleEvaluacionNomiActionPerformed(null,rowIndex,true,false,formatonomi);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessFormatoNomi();
			
      		//this.finishProcessFormatoNomi(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarFormatoNomiReturnGeneral() throws Exception {
		if(this.formatonomiReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.formatonomiReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.formatonomiReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.formatonomiReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.formatonomiReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.formatonomiReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingFormatoNomi(false);
		}
		
		if(this.formatonomiReturnGeneral.getConRetornoLista() || this.formatonomiReturnGeneral.getConRetornoObjeto()) {
			if(this.formatonomiReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.formatonomiLogic.setFormatoNomis(this.formatonomiReturnGeneral.getFormatoNomis());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.formatonomiReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.formatonomiLogic.setFormatoNomi(this.formatonomiReturnGeneral.getFormatoNomi());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingFormatoNomi(false);
		}
	}
	
	public void actualizarParametrosGeneralFormatoNomi() throws Exception {
		
		
	}
	
	public ArrayList<FormatoNomi> getFormatoNomisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<FormatoNomi> formatonomisSeleccionados=new ArrayList<FormatoNomi>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioFormatoNomi) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(FormatoNomi formatonomiAux:formatonomiLogic.getFormatoNomis()) {
					if(formatonomiAux.getIsSelected()) {
						formatonomisSeleccionados.add(formatonomiAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormatoNomi formatonomiAux:this.formatonomis) {
					if(formatonomiAux.getIsSelected()) {
						formatonomisSeleccionados.add(formatonomiAux);				
					}
				}
			}
			
			if(formatonomisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						formatonomisSeleccionados.addAll(this.formatonomiLogic.getFormatoNomis());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						formatonomisSeleccionados.addAll(this.formatonomis);				
					}
				}
			}
		} else {
			formatonomisSeleccionados.add(this.formatonomi);
		}
		
		return formatonomisSeleccionados;
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
	
	public void generarReporteFormatoNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalFormatoNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoFormatoNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFormatoNomisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFormatoNomisSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesFormatoNomisSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Formato Nomi",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesFormatoNomisSeleccionados() throws Exception {
		ArrayList<FormatoNomi> formatonomisSeleccionados=new ArrayList<FormatoNomi>();		
		
		formatonomisSeleccionados=this.getFormatoNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteFormatoNomis("Todos",formatonomisSeleccionados);
		
	}	
	
	public void generarReporteNormalFormatoNomisSeleccionados() throws Exception {
		ArrayList<FormatoNomi> formatonomisSeleccionados=new ArrayList<FormatoNomi>();		
		
		formatonomisSeleccionados=this.getFormatoNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteFormatoNomis("Todos",formatonomisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionFormatoNomisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<FormatoNomi> formatonomisSeleccionados=new ArrayList<FormatoNomi>();
		
		formatonomisSeleccionados=this.getFormatoNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteFormatoNomis("Todos",formatonomisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoFormatoNomisSeleccionados() throws Exception {
		ArrayList<FormatoNomi> formatonomisSeleccionados=new ArrayList<FormatoNomi>();		
		
		
		this.abrirInicializarFrameReporteDinamicoFormatoNomi();
		
		
		formatonomisSeleccionados=this.getFormatoNomisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoFormatoNomi();
		
		
		//this.generarReporteFormatoNomis("Todos",formatonomisSeleccionados ,formatonomiImplementable,formatonomiImplementableHome);
	}
	
	public void mostrarImportacionFormatoNomis() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionFormatoNomi();
		
		this.abrirFrameImportacionFormatoNomi();		
		
			
		//this.generarReporteFormatoNomis("Todos",formatonomisSeleccionados ,formatonomiImplementable,formatonomiImplementableHome);
	}
	
	public void importarFormatoNomis() throws Exception {		
	
	}
	
	public void exportarFormatoNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelFormatoNomisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoFormatoNomisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlFormatoNomisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Formato Nomi",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoFormatoNomisSeleccionados() throws Exception {
		ArrayList<FormatoNomi> formatonomisSeleccionados=new ArrayList<FormatoNomi>();		
		
		formatonomisSeleccionados=this.getFormatoNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formatonomi."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarFormatoNomi(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(FormatoNomi formatonomiAux:formatonomisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarFormatoNomi(formatonomiAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//formatonomiAux.setsDetalleGeneralEntityReporte(formatonomiAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatonomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarFormatoNomi(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=FormatoNomiConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoNomiConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoNomiConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoNomiConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoNomiConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoNomiConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoNomiConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoNomiConstantesFunciones.LABEL_INSTRUCCIONES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoNomiConstantesFunciones.LABEL_IDESTRUCTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormatoNomiConstantesFunciones.LABEL_IDPUNTAJENOMI;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarFormatoNomi(FormatoNomi formatonomi,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=formatonomi.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=formatonomi.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=formatonomi.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formatonomi.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formatonomi.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formatonomi.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formatonomi.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formatonomi.getinstrucciones();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formatonomi.getestructura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formatonomi.getpuntajenomi_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelFormatoNomisSeleccionados() throws Exception {
		ArrayList<FormatoNomi> formatonomisSeleccionados=new ArrayList<FormatoNomi>();		
		
		formatonomisSeleccionados=this.getFormatoNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formatonomi.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("FormatoNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelFormatoNomi(row);				
				iRow++;
			}				
			
			for(FormatoNomi formatonomiAux:formatonomisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelFormatoNomi(formatonomiAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatonomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlFormatoNomisSeleccionados() throws Exception {
		ArrayList<FormatoNomi> formatonomisSeleccionados=new ArrayList<FormatoNomi>();		
		
		formatonomisSeleccionados=this.getFormatoNomisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formatonomi.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("formatonomis");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("formatonomi");
			//elementRoot.appendChild(element);
		
			for(FormatoNomi formatonomiAux:formatonomisSeleccionados) {
				element = document.createElement("formatonomi");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlFormatoNomi(formatonomiAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formatonomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formato Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelFormatoNomi(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoNomiConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoNomiConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(FormatoNomiConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoNomiConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoNomiConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoNomiConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoNomiConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoNomiConstantesFunciones.LABEL_INSTRUCCIONES);
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoNomiConstantesFunciones.LABEL_IDESTRUCTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(FormatoNomiConstantesFunciones.LABEL_IDPUNTAJENOMI);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelFormatoNomi(FormatoNomi formatonomi,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(formatonomi.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(formatonomi.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formatonomi.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formatonomi.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(formatonomi.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(formatonomi.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(formatonomi.getinstrucciones());
		cell = row.createCell(iColumn++);cell.setCellValue(formatonomi.getestructura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formatonomi.getpuntajenomi_descripcion());				
	}
	
	public void setFilaDatosExportarXmlFormatoNomi(FormatoNomi formatonomi,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(FormatoNomiConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(formatonomi.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(FormatoNomiConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(formatonomi.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(FormatoNomiConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(formatonomi.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(FormatoNomiConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(formatonomi.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcodigo = document.createElement(FormatoNomiConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(formatonomi.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(FormatoNomiConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(formatonomi.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementfecha = document.createElement(FormatoNomiConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(formatonomi.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementinstrucciones = document.createElement(FormatoNomiConstantesFunciones.INSTRUCCIONES);
		elementinstrucciones.appendChild(document.createTextNode(formatonomi.getinstrucciones().trim()));
		element.appendChild(elementinstrucciones);

		Element elementestructura_descripcion = document.createElement(FormatoNomiConstantesFunciones.IDESTRUCTURA);
		elementestructura_descripcion.appendChild(document.createTextNode(formatonomi.getestructura_descripcion()));
		element.appendChild(elementestructura_descripcion);

		Element elementpuntajenomi_descripcion = document.createElement(FormatoNomiConstantesFunciones.IDPUNTAJENOMI);
		elementpuntajenomi_descripcion.appendChild(document.createTextNode(formatonomi.getpuntajenomi_descripcion()));
		element.appendChild(elementpuntajenomi_descripcion);
	}
	
	public void generarReporteGroupGenericoFormatoNomisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<FormatoNomi> formatonomisSeleccionados=new ArrayList<FormatoNomi>();
		
		formatonomisSeleccionados=this.getFormatoNomisSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoFormatoNomi(formatonomisSeleccionados);
		
		this.generarReporteFormatoNomis("Todos",formatonomisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoFormatoNomi(ArrayList<FormatoNomi> formatonomisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(FormatoNomi formatonomiAux:formatonomisSeleccionados) {
				formatonomiAux.setsDetalleGeneralEntityReporte(formatonomiAux.toString());
			
				if(sTipoSeleccionar.equals(FormatoNomiConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					formatonomiAux.setsDescripcionGeneralEntityReporte1(formatonomiAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormatoNomiConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					formatonomiAux.setsDescripcionGeneralEntityReporte1(formatonomiAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormatoNomiConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					formatonomiAux.setsDescripcionGeneralEntityReporte1(formatonomiAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(FormatoNomiConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					formatonomiAux.setsDescripcionGeneralEntityReporte1(formatonomiAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(FormatoNomiConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					formatonomiAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(formatonomiAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(FormatoNomiConstantesFunciones.LABEL_INSTRUCCIONES)) {
					existe=true;
					formatonomiAux.setsDescripcionGeneralEntityReporte1(formatonomiAux.getinstrucciones());
				}
				 else if(sTipoSeleccionar.equals(FormatoNomiConstantesFunciones.LABEL_IDESTRUCTURA)) {
					existe=true;
					formatonomiAux.setsDescripcionGeneralEntityReporte1(formatonomiAux.getestructura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormatoNomiConstantesFunciones.LABEL_IDPUNTAJENOMI)) {
					existe=true;
					formatonomiAux.setsDescripcionGeneralEntityReporte1(formatonomiAux.getpuntajenomi_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormatoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesFormatoNomi(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoFormatoNomi=true;
				this.isVisibilidadCeldaNuevoRelacionesFormatoNomi=true;
				this.isVisibilidadCeldaGuardarCambiosFormatoNomi=true;
			}
			
			this.isVisibilidadCeldaModificarFormatoNomi=false;
			this.isVisibilidadCeldaActualizarFormatoNomi=false;
			this.isVisibilidadCeldaEliminarFormatoNomi=false;
			this.isVisibilidadCeldaCancelarFormatoNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormatoNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarFormatoNomi=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoFormatoNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomi=false;
			this.isVisibilidadCeldaGuardarCambiosFormatoNomi=false;
			this.isVisibilidadCeldaModificarFormatoNomi=false;
			this.isVisibilidadCeldaActualizarFormatoNomi=true;
			this.isVisibilidadCeldaEliminarFormatoNomi=false;
			this.isVisibilidadCeldaCancelarFormatoNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormatoNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarFormatoNomi=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoFormatoNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomi=false;
			this.isVisibilidadCeldaGuardarCambiosFormatoNomi=false;
			this.isVisibilidadCeldaModificarFormatoNomi=false;
			this.isVisibilidadCeldaActualizarFormatoNomi=true;
			this.isVisibilidadCeldaEliminarFormatoNomi=true;
			this.isVisibilidadCeldaCancelarFormatoNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormatoNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarFormatoNomi=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoFormatoNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomi=false;
			this.isVisibilidadCeldaGuardarCambiosFormatoNomi=false;
			this.isVisibilidadCeldaModificarFormatoNomi=false;
			this.isVisibilidadCeldaActualizarFormatoNomi=true;
			this.isVisibilidadCeldaEliminarFormatoNomi=false;
			this.isVisibilidadCeldaCancelarFormatoNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormatoNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarFormatoNomi=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoFormatoNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomi=true;
			this.isVisibilidadCeldaGuardarCambiosFormatoNomi=true;
			this.isVisibilidadCeldaModificarFormatoNomi=false;
			this.isVisibilidadCeldaActualizarFormatoNomi=false;
			this.isVisibilidadCeldaEliminarFormatoNomi=false;
			this.isVisibilidadCeldaCancelarFormatoNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormatoNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarFormatoNomi=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoFormatoNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomi=false;
			this.isVisibilidadCeldaGuardarCambiosFormatoNomi=false;
			this.isVisibilidadCeldaActualizarFormatoNomi=false;
			this.isVisibilidadCeldaEliminarFormatoNomi=false;
			this.isVisibilidadCeldaCancelarFormatoNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormatoNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarFormatoNomi=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoFormatoNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomi=false;
			this.isVisibilidadCeldaGuardarCambiosFormatoNomi=false;
			this.isVisibilidadCeldaModificarFormatoNomi=true;
			this.isVisibilidadCeldaActualizarFormatoNomi=false;
			this.isVisibilidadCeldaEliminarFormatoNomi=false;
			this.isVisibilidadCeldaCancelarFormatoNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormatoNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarFormatoNomi=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(FormatoNomiJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoFormatoNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomi=true;
			this.isVisibilidadCeldaGuardarCambiosFormatoNomi=true;
		} else {
			this.actualizarEstadoPanelsFormatoNomi(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarFormatoNomi=false;
			//this.isVisibilidadCeldaVerFormFormatoNomi=false;
			this.isVisibilidadCeldaDuplicarFormatoNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!formatonomiSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomi=false;
		} else {
			this.isVisibilidadCeldaNuevoFormatoNomi=false;
			this.isVisibilidadCeldaGuardarCambiosFormatoNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(formatonomiSessionBean.getEsGuardarRelacionado()) {
			if(!formatonomiSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesFormatoNomi=false;												
			}
			
			this.jButtonCerrarFormatoNomi.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesFormatoNomi=false;
		}
		
		if(!this.permiteMantenimiento(this.formatonomi)) {
			this.isVisibilidadCeldaActualizarFormatoNomi=false;
			this.isVisibilidadCeldaEliminarFormatoNomi=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesFormatoNomi() {
		this.isVisibilidadCeldaNuevoFormatoNomi=false;
		this.isVisibilidadCeldaGuardarCambiosFormatoNomi=false;
	}
	
	public void actualizarEstadoPanelsFormatoNomi(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionFormatoNomi!=null) {
				this.jScrollPanelDatosEdicionFormatoNomi.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoNomi!=null) {
				this.jTabbedPaneBusquedasFormatoNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormatoNomi!=null) {
				this.jScrollPanelDatosFormatoNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormatoNomi!=null) {
				this.jPanelPaginacionFormatoNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormatoNomi!=null) {
				this.jPanelParametrosReportesFormatoNomi.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionFormatoNomi!=null) {
				this.jScrollPanelDatosEdicionFormatoNomi.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoNomi!=null) {
				this.jTabbedPaneBusquedasFormatoNomi.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosFormatoNomi!=null) {
				this.jScrollPanelDatosFormatoNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionFormatoNomi!=null) {
				this.jPanelPaginacionFormatoNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFormatoNomi!=null) {
				this.jPanelParametrosReportesFormatoNomi.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionFormatoNomi!=null) {
				this.jScrollPanelDatosEdicionFormatoNomi.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoNomi!=null) {
				this.jTabbedPaneBusquedasFormatoNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFormatoNomi!=null) {
				this.jScrollPanelDatosFormatoNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionFormatoNomi!=null) {
				this.jPanelPaginacionFormatoNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFormatoNomi!=null) {
				this.jPanelParametrosReportesFormatoNomi.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionFormatoNomi!=null) {
				this.jScrollPanelDatosEdicionFormatoNomi.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoNomi!=null) {
				this.jTabbedPaneBusquedasFormatoNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFormatoNomi!=null) {
				this.jScrollPanelDatosFormatoNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionFormatoNomi!=null) {
				this.jPanelPaginacionFormatoNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFormatoNomi!=null) {
				this.jPanelParametrosReportesFormatoNomi.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionFormatoNomi!=null) {
				this.jScrollPanelDatosEdicionFormatoNomi.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoNomi!=null) {
				this.jTabbedPaneBusquedasFormatoNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormatoNomi!=null) {
				this.jScrollPanelDatosFormatoNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormatoNomi!=null) {
				this.jPanelPaginacionFormatoNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormatoNomi!=null) {
				this.jPanelParametrosReportesFormatoNomi.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionFormatoNomi!=null) {
				this.jScrollPanelDatosEdicionFormatoNomi.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoNomi!=null) {
				this.jTabbedPaneBusquedasFormatoNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormatoNomi!=null) {
				this.jScrollPanelDatosFormatoNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormatoNomi!=null) {
				this.jPanelPaginacionFormatoNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormatoNomi!=null) {
				this.jPanelParametrosReportesFormatoNomi.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionFormatoNomi!=null) {
				this.jScrollPanelDatosEdicionFormatoNomi.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoNomi!=null) {
				this.jTabbedPaneBusquedasFormatoNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormatoNomi!=null) {
				this.jScrollPanelDatosFormatoNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormatoNomi!=null) {
				this.jPanelPaginacionFormatoNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormatoNomi!=null) {
				this.jPanelParametrosReportesFormatoNomi.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.formatonomiSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasFormatoNomi!=null) {
					this.jTabbedPaneBusquedasFormatoNomi.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesFormatoNomi!=null) {
				this.jPanelParametrosReportesFormatoNomi.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.formatonomiSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormatoNomi!=null) {
				this.jTabbedPaneBusquedasFormatoNomi.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesFormatoNomi!=null) {
				this.jPanelParametrosReportesFormatoNomi.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEstructura=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasFormatoNomi.remove(jPanelFK_IdEstructuraFormatoNomi);}

			this.isVisibilidadFK_IdPuntajeNomi=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdPuntajeNomi) {this.jTabbedPaneBusquedasFormatoNomi.remove(jPanelFK_IdPuntajeNomiFormatoNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdEstructura=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasFormatoNomi.remove(jPanelFK_IdEstructuraFormatoNomi);}

			this.isVisibilidadFK_IdPuntajeNomi=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdPuntajeNomi) {this.jTabbedPaneBusquedasFormatoNomi.remove(jPanelFK_IdPuntajeNomiFormatoNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstructura(Boolean isParaEstructura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraNegation=!isParaEstructura;

			this.isVisibilidadFK_IdEstructura=isParaEstructura;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasFormatoNomi.remove(jPanelFK_IdEstructuraFormatoNomi);}

			this.isVisibilidadFK_IdPuntajeNomi=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdPuntajeNomi) {this.jTabbedPaneBusquedasFormatoNomi.remove(jPanelFK_IdPuntajeNomiFormatoNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaPuntajeNomi(Boolean isParaPuntajeNomi){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPuntajeNomiNegation=!isParaPuntajeNomi;

			this.isVisibilidadFK_IdEstructura=isParaPuntajeNomiNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasFormatoNomi.remove(jPanelFK_IdEstructuraFormatoNomi);}

			this.isVisibilidadFK_IdPuntajeNomi=isParaPuntajeNomi;
			if(!this.isVisibilidadFK_IdPuntajeNomi) {this.jTabbedPaneBusquedasFormatoNomi.remove(jPanelFK_IdPuntajeNomiFormatoNomi);}
		}
		
	}
	
	

	public String registrarSesionFormatoNomiParaFormatoNomiPreguntaNomis() throws Exception {
		Boolean isPaginaPopupFormatoNomiPreguntaNomi=false;

		try {

			if(this.formatonomiSessionBean==null) {
				this.formatonomiSessionBean=new FormatoNomiSessionBean();
			}

			if(this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiSessionBean==null) {
				this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiSessionBean=new FormatoNomiPreguntaNomiSessionBean();
			}

			this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiSessionBean.setsPathNavegacionActual(formatonomiSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupFormatoNomiPreguntaNomi=this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFormatoNomiPreguntaNomi(true);
			this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFormatoNomiPreguntaNomi(FormatoNomiConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiSessionBean.setisBusquedaDesdeForeignKeySesionFormatoNomi(true);
			this.jInternalFrameDetalleFormFormatoNomi.formatonomipreguntanomiSessionBean.setlidFormatoNomiActual(this.idFormatoNomiActual);

			formatonomiSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyFormatoNomi(true);
			formatonomiSessionBean.setlIdFormatoNomiActualForeignKey(this.idFormatoNomiActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionFormatoNomiParaFormatoNomiFactorNomis() throws Exception {
		Boolean isPaginaPopupFormatoNomiFactorNomi=false;

		try {

			if(this.formatonomiSessionBean==null) {
				this.formatonomiSessionBean=new FormatoNomiSessionBean();
			}

			if(this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiSessionBean==null) {
				this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiSessionBean=new FormatoNomiFactorNomiSessionBean();
			}

			this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiSessionBean.setsPathNavegacionActual(formatonomiSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupFormatoNomiFactorNomi=this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFormatoNomiFactorNomi(true);
			this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFormatoNomiFactorNomi(FormatoNomiConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiSessionBean.setisBusquedaDesdeForeignKeySesionFormatoNomi(true);
			this.jInternalFrameDetalleFormFormatoNomi.formatonomifactornomiSessionBean.setlidFormatoNomiActual(this.idFormatoNomiActual);

			formatonomiSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyFormatoNomi(true);
			formatonomiSessionBean.setlIdFormatoNomiActualForeignKey(this.idFormatoNomiActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionFormatoNomiParaEvaluacionNomis() throws Exception {
		Boolean isPaginaPopupEvaluacionNomi=false;

		try {

			if(this.formatonomiSessionBean==null) {
				this.formatonomiSessionBean=new FormatoNomiSessionBean();
			}

			if(this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiSessionBean==null) {
				this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiSessionBean=new EvaluacionNomiSessionBean();
			}

			this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiSessionBean.setsPathNavegacionActual(formatonomiSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupEvaluacionNomi=this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEvaluacionNomi(true);
			this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEvaluacionNomi(FormatoNomiConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiSessionBean.setisBusquedaDesdeForeignKeySesionFormatoNomi(true);
			this.jInternalFrameDetalleFormFormatoNomi.evaluacionnomiSessionBean.setlidFormatoNomiActual(this.idFormatoNomiActual);

			formatonomiSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyFormatoNomi(true);
			formatonomiSessionBean.setlIdFormatoNomiActualForeignKey(this.idFormatoNomiActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionFormatoNomiParaDetalleEvaluacionNomis() throws Exception {
		Boolean isPaginaPopupDetalleEvaluacionNomi=false;

		try {

			if(this.formatonomiSessionBean==null) {
				this.formatonomiSessionBean=new FormatoNomiSessionBean();
			}

			if(this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiSessionBean==null) {
				this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiSessionBean=new DetalleEvaluacionNomiSessionBean();
			}

			this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiSessionBean.setsPathNavegacionActual(formatonomiSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleEvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleEvaluacionNomi=this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleEvaluacionNomi(true);
			this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleEvaluacionNomi(FormatoNomiConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiSessionBean.setisBusquedaDesdeForeignKeySesionFormatoNomi(true);
			this.jInternalFrameDetalleFormFormatoNomi.detalleevaluacionnomiSessionBean.setlidFormatoNomiActual(this.idFormatoNomiActual);

			formatonomiSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyFormatoNomi(true);
			formatonomiSessionBean.setlIdFormatoNomiActualForeignKey(this.idFormatoNomiActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//FormatoNomiSessionBean formatonomiSessionBean=new FormatoNomiSessionBean();
		
		if(this.formatonomiSessionBean==null) {
			this.formatonomiSessionBean=new FormatoNomiSessionBean();
		}
		
		this.formatonomiSessionBean.setsUltimaBusquedaFormatoNomi(this.getsAccionBusqueda());
		this.formatonomiSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.formatonomiSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			formatonomiSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
			formatonomiSessionBean.setid_estructura(this.getid_estructuraFK_IdEstructura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPuntajeNomi")) {
			formatonomiSessionBean.setid_puntaje_nomi(this.getid_puntaje_nomiFK_IdPuntajeNomi());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			formatonomiSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//FormatoNomiSessionBean formatonomiSessionBean=new FormatoNomiSessionBean();
		
		if(this.formatonomiSessionBean==null) {
			this.formatonomiSessionBean=new FormatoNomiSessionBean();
		}
		
		if(this.formatonomiSessionBean.getsUltimaBusquedaFormatoNomi()!=null&&!this.formatonomiSessionBean.getsUltimaBusquedaFormatoNomi().equals("")) {
			this.setsAccionBusqueda(formatonomiSessionBean.getsUltimaBusquedaFormatoNomi());
			this.setiNumeroPaginacion(formatonomiSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(formatonomiSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(formatonomiSessionBean.getid_empresa());
				formatonomiSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
				this.setid_estructuraFK_IdEstructura(formatonomiSessionBean.getid_estructura());
				formatonomiSessionBean.setid_estructura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPuntajeNomi")) {
				this.setid_puntaje_nomiFK_IdPuntajeNomi(formatonomiSessionBean.getid_puntaje_nomi());
				formatonomiSessionBean.setid_puntaje_nomi(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(formatonomiSessionBean.getid_sucursal());
				formatonomiSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.formatonomiSessionBean.setsUltimaBusquedaFormatoNomi("");
		this.formatonomiSessionBean.setiNumeroPaginacion(FormatoNomiConstantesFunciones.INUMEROPAGINACION);
		this.formatonomiSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaFormatoNomi(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioFormatoNomi() {
		this.updateBorderResaltarBusquedasFormularioFormatoNomi();
		this.updateVisibilidadBusquedasFormularioFormatoNomi();
		this.updateHabilitarBusquedasFormularioFormatoNomi();
	}
	
	public void updateBorderResaltarBusquedasFormularioFormatoNomi() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasFormatoNomi.getComponents().length>0) {
	

		if(this.formatonomiConstantesFunciones.resaltarFK_IdEstructuraFormatoNomi!=null) {
			index= this.jTabbedPaneBusquedasFormatoNomi.indexOfComponent(this.jPanelFK_IdEstructuraFormatoNomi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormatoNomi.getComponent(index);
				jPanel.setBorder(this.formatonomiConstantesFunciones.resaltarFK_IdEstructuraFormatoNomi);
			}
		}

		if(this.formatonomiConstantesFunciones.resaltarFK_IdPuntajeNomiFormatoNomi!=null) {
			index= this.jTabbedPaneBusquedasFormatoNomi.indexOfComponent(this.jPanelFK_IdPuntajeNomiFormatoNomi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormatoNomi.getComponent(index);
				jPanel.setBorder(this.formatonomiConstantesFunciones.resaltarFK_IdPuntajeNomiFormatoNomi);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioFormatoNomi() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasFormatoNomi.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFormatoNomi.indexOfComponent(this.jPanelFK_IdEstructuraFormatoNomi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFormatoNomi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.formatonomiConstantesFunciones.mostrarFK_IdEstructuraFormatoNomi);
			if(!this.formatonomiConstantesFunciones.mostrarFK_IdEstructuraFormatoNomi && index>-1) {
				this.jTabbedPaneBusquedasFormatoNomi.remove(index);
			}

			index= this.jTabbedPaneBusquedasFormatoNomi.indexOfComponent(this.jPanelFK_IdPuntajeNomiFormatoNomi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFormatoNomi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.formatonomiConstantesFunciones.mostrarFK_IdPuntajeNomiFormatoNomi);
			if(!this.formatonomiConstantesFunciones.mostrarFK_IdPuntajeNomiFormatoNomi && index>-1) {
				this.jTabbedPaneBusquedasFormatoNomi.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioFormatoNomi() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasFormatoNomi.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFormatoNomi.indexOfComponent(this.jPanelFK_IdEstructuraFormatoNomi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFormatoNomi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.formatonomiConstantesFunciones.activarFK_IdEstructuraFormatoNomi);
				this.jTabbedPaneBusquedasFormatoNomi.setEnabledAt(index,this.formatonomiConstantesFunciones.activarFK_IdEstructuraFormatoNomi);
			}

			index= this.jTabbedPaneBusquedasFormatoNomi.indexOfComponent(this.jPanelFK_IdPuntajeNomiFormatoNomi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFormatoNomi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.formatonomiConstantesFunciones.activarFK_IdPuntajeNomiFormatoNomi);
				this.jTabbedPaneBusquedasFormatoNomi.setEnabledAt(index,this.formatonomiConstantesFunciones.activarFK_IdPuntajeNomiFormatoNomi);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaFormatoNomi(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEstructura")) {
			index= this.jTabbedPaneBusquedasFormatoNomi.indexOfComponent(this.jPanelFK_IdEstructuraFormatoNomi);

			this.jTabbedPaneBusquedasFormatoNomi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormatoNomi.getComponent(index);

			this.formatonomiConstantesFunciones.setResaltarFK_IdEstructuraFormatoNomi(resaltar);

			jPanel.setBorder(this.formatonomiConstantesFunciones.resaltarFK_IdEstructuraFormatoNomi);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPuntajeNomi")) {
			index= this.jTabbedPaneBusquedasFormatoNomi.indexOfComponent(this.jPanelFK_IdPuntajeNomiFormatoNomi);

			this.jTabbedPaneBusquedasFormatoNomi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormatoNomi.getComponent(index);

			this.formatonomiConstantesFunciones.setResaltarFK_IdPuntajeNomiFormatoNomi(resaltar);

			jPanel.setBorder(this.formatonomiConstantesFunciones.resaltarFK_IdPuntajeNomiFormatoNomi);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarFormatoNomi.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioFormatoNomi() throws Exception {

		if(this.jInternalFrameDetalleFormFormatoNomi==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioFormatoNomi();
		this.updateVisibilidadResaltarControlesFormularioFormatoNomi();
		this.updateHabilitarResaltarControlesFormularioFormatoNomi();
		
	}
	
	public void updateBorderResaltarControlesFormularioFormatoNomi() throws Exception {
		if(this.jInternalFrameDetalleFormFormatoNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.formatonomiConstantesFunciones.resaltaridFormatoNomi!=null && this.jInternalFrameDetalleFormFormatoNomi!=null) {this.jInternalFrameDetalleFormFormatoNomi.jLabelidFormatoNomi.setBorder(this.formatonomiConstantesFunciones.resaltaridFormatoNomi);}
		if(this.formatonomiConstantesFunciones.resaltarid_empresaFormatoNomi!=null && this.jInternalFrameDetalleFormFormatoNomi!=null) {this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_empresaFormatoNomi.setBorder(this.formatonomiConstantesFunciones.resaltarid_empresaFormatoNomi);}
		if(this.formatonomiConstantesFunciones.resaltarid_sucursalFormatoNomi!=null && this.jInternalFrameDetalleFormFormatoNomi!=null) {this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_sucursalFormatoNomi.setBorder(this.formatonomiConstantesFunciones.resaltarid_sucursalFormatoNomi);}
		if(this.formatonomiConstantesFunciones.resaltarcodigoFormatoNomi!=null && this.jInternalFrameDetalleFormFormatoNomi!=null) {this.jInternalFrameDetalleFormFormatoNomi.jTextFieldcodigoFormatoNomi.setBorder(this.formatonomiConstantesFunciones.resaltarcodigoFormatoNomi);}
		if(this.formatonomiConstantesFunciones.resaltarnombreFormatoNomi!=null && this.jInternalFrameDetalleFormFormatoNomi!=null) {this.jInternalFrameDetalleFormFormatoNomi.jTextAreanombreFormatoNomi.setBorder(this.formatonomiConstantesFunciones.resaltarnombreFormatoNomi);}
		if(this.formatonomiConstantesFunciones.resaltarfechaFormatoNomi!=null && this.jInternalFrameDetalleFormFormatoNomi!=null) {this.jInternalFrameDetalleFormFormatoNomi.jDateChooserfechaFormatoNomi.setBorder(this.formatonomiConstantesFunciones.resaltarfechaFormatoNomi);}
		if(this.formatonomiConstantesFunciones.resaltarinstruccionesFormatoNomi!=null && this.jInternalFrameDetalleFormFormatoNomi!=null) {this.jInternalFrameDetalleFormFormatoNomi.jTextAreainstruccionesFormatoNomi.setBorder(this.formatonomiConstantesFunciones.resaltarinstruccionesFormatoNomi);}
		if(this.formatonomiConstantesFunciones.resaltarid_estructuraFormatoNomi!=null && this.jInternalFrameDetalleFormFormatoNomi!=null) {this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_estructuraFormatoNomi.setBorder(this.formatonomiConstantesFunciones.resaltarid_estructuraFormatoNomi);}
		if(this.formatonomiConstantesFunciones.resaltarid_puntaje_nomiFormatoNomi!=null && this.jInternalFrameDetalleFormFormatoNomi!=null) {this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_puntaje_nomiFormatoNomi.setBorder(this.formatonomiConstantesFunciones.resaltarid_puntaje_nomiFormatoNomi);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioFormatoNomi() throws Exception {		
		if(this.jInternalFrameDetalleFormFormatoNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
	
		//this.jInternalFrameDetalleFormFormatoNomi.jLabelidFormatoNomi.setVisible(this.formatonomiConstantesFunciones.mostraridFormatoNomi);
		this.jInternalFrameDetalleFormFormatoNomi.jPanelidFormatoNomi.setVisible(this.formatonomiConstantesFunciones.mostraridFormatoNomi);
		//this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_empresaFormatoNomi.setVisible(this.formatonomiConstantesFunciones.mostrarid_empresaFormatoNomi);
		this.jInternalFrameDetalleFormFormatoNomi.jPanelid_empresaFormatoNomi.setVisible(this.formatonomiConstantesFunciones.mostrarid_empresaFormatoNomi);
		//this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_sucursalFormatoNomi.setVisible(this.formatonomiConstantesFunciones.mostrarid_sucursalFormatoNomi);
		this.jInternalFrameDetalleFormFormatoNomi.jPanelid_sucursalFormatoNomi.setVisible(this.formatonomiConstantesFunciones.mostrarid_sucursalFormatoNomi);
		//this.jInternalFrameDetalleFormFormatoNomi.jTextFieldcodigoFormatoNomi.setVisible(this.formatonomiConstantesFunciones.mostrarcodigoFormatoNomi);
		this.jInternalFrameDetalleFormFormatoNomi.jPanelcodigoFormatoNomi.setVisible(this.formatonomiConstantesFunciones.mostrarcodigoFormatoNomi);
		//this.jInternalFrameDetalleFormFormatoNomi.jTextAreanombreFormatoNomi.setVisible(this.formatonomiConstantesFunciones.mostrarnombreFormatoNomi);
		this.jInternalFrameDetalleFormFormatoNomi.jPanelnombreFormatoNomi.setVisible(this.formatonomiConstantesFunciones.mostrarnombreFormatoNomi);
		//this.jInternalFrameDetalleFormFormatoNomi.jDateChooserfechaFormatoNomi.setVisible(this.formatonomiConstantesFunciones.mostrarfechaFormatoNomi);
		this.jInternalFrameDetalleFormFormatoNomi.jPanelfechaFormatoNomi.setVisible(this.formatonomiConstantesFunciones.mostrarfechaFormatoNomi);
		//this.jInternalFrameDetalleFormFormatoNomi.jTextAreainstruccionesFormatoNomi.setVisible(this.formatonomiConstantesFunciones.mostrarinstruccionesFormatoNomi);
		this.jInternalFrameDetalleFormFormatoNomi.jPanelinstruccionesFormatoNomi.setVisible(this.formatonomiConstantesFunciones.mostrarinstruccionesFormatoNomi);
		//this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_estructuraFormatoNomi.setVisible(this.formatonomiConstantesFunciones.mostrarid_estructuraFormatoNomi);
		this.jInternalFrameDetalleFormFormatoNomi.jPanelid_estructuraFormatoNomi.setVisible(this.formatonomiConstantesFunciones.mostrarid_estructuraFormatoNomi);
		//this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_puntaje_nomiFormatoNomi.setVisible(this.formatonomiConstantesFunciones.mostrarid_puntaje_nomiFormatoNomi);
		this.jInternalFrameDetalleFormFormatoNomi.jPanelid_puntaje_nomiFormatoNomi.setVisible(this.formatonomiConstantesFunciones.mostrarid_puntaje_nomiFormatoNomi);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioFormatoNomi() throws Exception {
		if(this.jInternalFrameDetalleFormFormatoNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFormatoNomi!=null) {
	
		this.jInternalFrameDetalleFormFormatoNomi.jLabelidFormatoNomi.setEnabled(this.formatonomiConstantesFunciones.activaridFormatoNomi);
		this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_empresaFormatoNomi.setEnabled(this.formatonomiConstantesFunciones.activarid_empresaFormatoNomi);
		this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_sucursalFormatoNomi.setEnabled(this.formatonomiConstantesFunciones.activarid_sucursalFormatoNomi);
		this.jInternalFrameDetalleFormFormatoNomi.jTextFieldcodigoFormatoNomi.setEnabled(this.formatonomiConstantesFunciones.activarcodigoFormatoNomi);
		this.jInternalFrameDetalleFormFormatoNomi.jTextAreanombreFormatoNomi.setEnabled(this.formatonomiConstantesFunciones.activarnombreFormatoNomi);
		this.jInternalFrameDetalleFormFormatoNomi.jDateChooserfechaFormatoNomi.setEnabled(this.formatonomiConstantesFunciones.activarfechaFormatoNomi);
		this.jInternalFrameDetalleFormFormatoNomi.jTextAreainstruccionesFormatoNomi.setEnabled(this.formatonomiConstantesFunciones.activarinstruccionesFormatoNomi);
		this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_estructuraFormatoNomi.setEnabled(this.formatonomiConstantesFunciones.activarid_estructuraFormatoNomi);
		this.jInternalFrameDetalleFormFormatoNomi.jComboBoxid_puntaje_nomiFormatoNomi.setEnabled(this.formatonomiConstantesFunciones.activarid_puntaje_nomiFormatoNomi);
		}
	}
	
		
}